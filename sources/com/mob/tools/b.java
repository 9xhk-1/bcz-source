package com.mob.tools;

import com.mob.commons.n;
import java.lang.Thread;

/* loaded from: classes7.dex */
public class b implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private static Thread.UncaughtExceptionHandler f41302a = null;

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f41303b = false;

    private b() {
    }

    public static void a() {
        if (f41303b || !n.f40397g) {
            return;
        }
        f41302a = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new b());
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        MobLog.getInstance().crash(th2);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = f41302a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        }
    }
}
