package com.alipay.sdk.m.l0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class g {
    public static String a(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod(ct.d.f46852f, String.class, String.class).invoke(cls, str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }
}
