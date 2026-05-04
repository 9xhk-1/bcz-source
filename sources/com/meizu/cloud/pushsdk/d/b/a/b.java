package com.meizu.cloud.pushsdk.d.b.a;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static ExecutorService f39723a = null;

    /* renamed from: b, reason: collision with root package name */
    private static int f39724b = 2;

    public static ExecutorService a() {
        synchronized (b.class) {
            try {
                if (f39723a == null) {
                    f39723a = Executors.newScheduledThreadPool(f39724b);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f39723a;
    }

    public static Future a(Callable callable) {
        return a().submit(callable);
    }

    public static void a(int i11) {
        f39724b = i11;
    }

    public static void a(Runnable runnable) {
        a().execute(runnable);
    }
}
