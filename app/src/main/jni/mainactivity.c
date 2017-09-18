#include <jni.h>

JNIEXPORT jstring JNICALL
Java_bolex_com_androidjna_MainActivity_getTitles(JNIEnv *env, jobject instance) {
    // TODO
    int a =1;
    a++;
    return (*env)->NewStringUTF(env,"helloNDK");
}