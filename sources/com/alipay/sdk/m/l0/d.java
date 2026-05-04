package com.alipay.sdk.m.l0;

import android.content.Context;
import android.text.TextUtils;
import java.util.Random;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d {
    public static String a() {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int nanoTime = (int) System.nanoTime();
        int nextInt = new Random().nextInt();
        int nextInt2 = new Random().nextInt();
        byte[] a11 = c.a(currentTimeMillis);
        byte[] a12 = c.a(nanoTime);
        byte[] a13 = c.a(nextInt);
        byte[] a14 = c.a(nextInt2);
        byte[] bArr = new byte[16];
        System.arraycopy(a11, 0, bArr, 0, 4);
        System.arraycopy(a12, 0, bArr, 4, 4);
        System.arraycopy(a13, 0, bArr, 8, 4);
        System.arraycopy(a14, 0, bArr, 12, 4);
        return b.c(bArr, 2);
    }

    public static String b(Context context) {
        return "";
    }

    public static String c() {
        try {
            return (String) Class.forName("com.yunos.baseservice.clouduuid.CloudUUID").getMethod("getCloudUUID", null).invoke(null, null);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String b() {
        String a11 = g.a("ro.aliyun.clouduuid", "");
        if (TextUtils.isEmpty(a11)) {
            a11 = g.a("ro.sys.aliyun.clouduuid", "");
        }
        return TextUtils.isEmpty(a11) ? c() : a11;
    }

    public static String a(Context context) {
        String b11 = f.m5632a((String) null) ? b() : null;
        return f.m5632a(b11) ? a() : b11;
    }
}
