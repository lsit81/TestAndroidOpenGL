//
// Created by LimSeungTaek on 2016. 12. 4..
//
#include <jni.h>
#include <string>

extern "C"
jstring
Java_com_lsit_android_testopengl_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
