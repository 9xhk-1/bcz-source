package com.meizu.cloud.pushsdk.b.c;

import java.lang.Thread;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private String f39391a = null;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f39392b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f39393c = null;

    /* renamed from: d, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f39394d = null;

    /* renamed from: e, reason: collision with root package name */
    private ThreadFactory f39395e = null;

    public d a(Integer num) {
        this.f39393c = num;
        return this;
    }

    public d a(String str) {
        String.format(str, 0);
        this.f39391a = str;
        return this;
    }

    public ThreadFactory a() {
        return a(this);
    }

    private static ThreadFactory a(d dVar) {
        final String str = dVar.f39391a;
        final Boolean bool = dVar.f39392b;
        final Integer num = dVar.f39393c;
        final Thread.UncaughtExceptionHandler uncaughtExceptionHandler = dVar.f39394d;
        ThreadFactory threadFactory = dVar.f39395e;
        if (threadFactory == null) {
            threadFactory = Executors.defaultThreadFactory();
        }
        final ThreadFactory threadFactory2 = threadFactory;
        final AtomicLong atomicLong = str != null ? new AtomicLong(0L) : null;
        return new ThreadFactory() { // from class: com.meizu.cloud.pushsdk.b.c.d.1
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread newThread = threadFactory2.newThread(runnable);
                String str2 = str;
                if (str2 != null) {
                    newThread.setName(String.format(str2, Long.valueOf(atomicLong.getAndIncrement())));
                }
                Boolean bool2 = bool;
                if (bool2 != null) {
                    newThread.setDaemon(bool2.booleanValue());
                }
                Integer num2 = num;
                if (num2 != null) {
                    newThread.setPriority(num2.intValue());
                }
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = uncaughtExceptionHandler;
                if (uncaughtExceptionHandler2 != null) {
                    newThread.setUncaughtExceptionHandler(uncaughtExceptionHandler2);
                }
                return newThread;
            }
        };
    }
}
