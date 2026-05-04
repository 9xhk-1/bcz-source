package com.meizu.cloud.pushsdk.c.a;

import com.meizu.cloud.pushinternal.DebugLogger;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f39429a = false;

    /* renamed from: b, reason: collision with root package name */
    private static String f39430b = "AndroidNetworking";

    public static void a() {
        f39429a = true;
    }

    public static void b(String str) {
        if (f39429a) {
            DebugLogger.i(f39430b, str);
        }
    }

    public static void a(String str) {
        if (f39429a) {
            DebugLogger.d(f39430b, str);
        }
    }
}
