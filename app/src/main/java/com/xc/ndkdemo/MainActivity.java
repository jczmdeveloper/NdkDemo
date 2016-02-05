package com.xc.ndkdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.xc.mysolib.jni.Calculator;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mTvAdd;
    private TextView mTvSub;
    private TextView mTvString;
    private TextView mBtnCalc;
    private TextView mBtnGetString;
    private Calculator mCalculator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCalculator = new Calculator();
        mTvAdd = (TextView) findViewById(R.id.tv_add);
        mTvSub = (TextView) findViewById(R.id.tv_sub);
        mTvString = (TextView)findViewById(R.id.tv_get_string);
        mBtnCalc = (TextView) findViewById(R.id.btn_calc);
        mBtnGetString = (TextView)findViewById(R.id.btn_get_string);

        mBtnCalc.setOnClickListener(this);
        mBtnGetString.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_calc:
                mTvAdd.setText("23+24="+mCalculator.add(23,24));
                mTvSub.setText("24-12="+mCalculator.sub(24,12));
                break;
            case R.id.btn_get_string:
                mTvString.setText(mCalculator.get());
                break;
        }
    }
}
