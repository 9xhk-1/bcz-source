package com.meizu.cloud.pushinternal;

import android.content.Context;
import com.meizu.cloud.pushsdk.b.g;

/* loaded from: classes7.dex */
public class DebugLogger {
    public static boolean debug = false;

    public static void d(String str, String str2) {
        g.b().a(str, str2);
    }

    public static void e(String str, String str2) {
        g.b().d(str, str2);
    }

    public static void flush() {
        g.b().a(false);
    }

    public static void i(String str, String str2) {
        g.b().b(str, str2);
    }

    public static void init(Context context) {
        g.b().a(context);
    }

    public static boolean isDebuggable() {
        return g.b().a();
    }

    public static void switchDebug(boolean z11) {
        g.b().b(z11);
    }

    public static void w(String str, String str2) {
        g.b().c(str, str2);
    }

    public static void e(String str, String str2, Throwable th2) {
        g.b().a(str, str2, th2);
    }

    public static void init(Context context, String str) {
        g.b().a(context, str);
    }
}
