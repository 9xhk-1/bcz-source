package com.xiaomi.push;

import android.content.Context;
import android.os.Build;

/* renamed from: com.xiaomi.push.do, reason: invalid class name */
/* loaded from: classes8.dex */
public class Cdo {
    private static void a(byte[] bArr) {
        if (bArr.length >= 2) {
            bArr[0] = 99;
            bArr[1] = 100;
        }
    }

    public static byte[] b(String str, byte[] bArr) {
        byte[] m5755a = bl.m5755a(str);
        try {
            a(m5755a);
            return h.b(m5755a, bArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean a(Context context, String str, long j11) {
        return com.xiaomi.push.service.ba.a(context).a(hm.DCJobMutualSwitch.a(), false) && (Build.VERSION.SDK_INT < 29 || context.getApplicationInfo().targetSdkVersion < 29) && !ah.a(context, str, j11);
    }

    public static byte[] a(String str, byte[] bArr) {
        byte[] m5755a = bl.m5755a(str);
        try {
            a(m5755a);
            return h.a(m5755a, bArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
