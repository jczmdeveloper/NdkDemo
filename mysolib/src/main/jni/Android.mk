#Android.mk
LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)
LOCAL_MODULE := mysolib
LOCAL_SRC_FILES := com_xc_mysolib_jni_Calculator.cpp
NDK_APP_DST_DIR :=jniLibs/$(TARGET_ARCH_ABI)
include $(BUILD_SHARED_LIBRARY)