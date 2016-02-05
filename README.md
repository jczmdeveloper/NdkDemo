# NdkDemo
a jni and ndk demo application for ndk starter.

效果图：

![image](https://github.com/jczmdeveloper/NdkDemo/blob/master/screenshots/01.png)     


Demo示例：

#Calculator.java:

/**
 * Created by caizhiming on 2016/2/5.
 */

public class Calculator {


    static {
        System.loadLibrary("mysolib");
    }
    public native int add(int a,int b);
    public native int sub(int a,int b);
    public native void set(String str);
    public native String get();
}


#MainActivity.java

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
