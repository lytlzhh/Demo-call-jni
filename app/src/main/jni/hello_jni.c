//
// Created by llw on 2016/2/29.
//

#include "hello_jni.h"
#include "com_example_llw_demo_call_jni_jni_JNI.h"

/*
 * Class:     com_example_llw_demo_call_jni_jni_JNI
 * Method:    hellofromc
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_example_llw_demo_1call_1jni_jni_JNI_hellofromc
        (JNIEnv *env, jclass obj){
    char buf[] = "你好！我是来自c语言的国度";

    return (*env)->NewStringUTF(env,buf);
}