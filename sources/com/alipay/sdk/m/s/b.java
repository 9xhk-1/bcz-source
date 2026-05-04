package com.alipay.sdk.m.s;

import android.content.Context;
import java.io.File;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    public static b f11028b;

    /* renamed from: a, reason: collision with root package name */
    public Context f11029a;

    public static b d() {
        if (f11028b == null) {
            f11028b = new b();
        }
        return f11028b;
    }

    public static boolean e() {
        String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
        for (int i11 = 0; i11 < 10; i11++) {
            if (new File(strArr[i11]).exists()) {
                return true;
            }
        }
        return false;
    }

    public void a(Context context) {
        com.alipay.sdk.m.m.b.b();
        this.f11029a = context.getApplicationContext();
    }

    public Context b() {
        return this.f11029a;
    }

    public String c() {
        return com.alipay.sdk.m.w.b.c(null, this.f11029a);
    }

    public com.alipay.sdk.m.m.b a() {
        return com.alipay.sdk.m.m.b.b();
    }
}
