package com.xiaomi.push;

import android.content.Context;

/* loaded from: classes8.dex */
class aw {

    /* renamed from: a, reason: collision with root package name */
    private static volatile boolean f45273a = false;

    private static void a(Class<?> cls, Context context) {
        if (f45273a) {
            return;
        }
        try {
            f45273a = true;
            cls.getDeclaredMethod("InitEntry", Context.class).invoke(cls, context);
        } catch (Throwable th2) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("mdid:load lib error " + th2);
        }
    }

    public static boolean a(Context context) {
        try {
            Class<?> a11 = s.a(context, "com.bun.miitmdid.core.JLibrary");
            if (a11 == null) {
                return false;
            }
            a(a11, context);
            return true;
        } catch (Throwable th2) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("mdid:check error " + th2);
            return false;
        }
    }
}
