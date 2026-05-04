package com.bun.miitmdid.core;

import android.content.Context;

/* loaded from: classes6.dex */
public class CertChecker {

    /* renamed from: a, reason: collision with root package name */
    public static final CertChecker f28904a = new CertChecker();

    static {
        try {
            System.loadLibrary("msaoaidauth");
        } catch (RuntimeException e11) {
            e11.printStackTrace();
        }
    }

    public static native CertChecker a();

    public native boolean verifyCert(Context context, String str);
}
