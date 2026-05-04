package org.conscrypt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class NativeCryptoJni {
    private NativeCryptoJni() {
    }

    public static void init() {
        if ("com.google.android.gms.org.conscrypt".equals(NativeCrypto.class.getPackage().getName())) {
            System.loadLibrary("conscrypt_gmscore_jni");
        } else {
            System.loadLibrary("conscrypt_jni");
        }
    }
}
