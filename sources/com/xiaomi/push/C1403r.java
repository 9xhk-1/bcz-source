package com.xiaomi.push;

/* renamed from: com.xiaomi.push.r, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C1403r {
    public static String a(String str, String str2) {
        try {
            return (String) s.a(null, "android.os.SystemProperties").getMethod(ct.d.f46852f, String.class, String.class).invoke(null, str, str2);
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("SystemProperties.get: " + e11);
            return str2;
        }
    }
}
