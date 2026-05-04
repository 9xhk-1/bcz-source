package com.tencent.bugly.proguard;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class ak {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f42277a = new AtomicInteger(1);

    /* renamed from: b, reason: collision with root package name */
    private static ak f42278b;

    /* renamed from: c, reason: collision with root package name */
    private ScheduledExecutorService f42279c;

    public ak() {
        this.f42279c = null;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(3, new ThreadFactory() { // from class: com.tencent.bugly.proguard.ak.1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                thread.setName("BuglyThread-" + ak.f42277a.getAndIncrement());
                return thread;
            }
        });
        this.f42279c = newScheduledThreadPool;
        if (newScheduledThreadPool == null || newScheduledThreadPool.isShutdown()) {
            al.d("[AsyncTaskHandler] ScheduledExecutorService is not valiable!", new Object[0]);
        }
    }

    public static synchronized ak a() {
        ak akVar;
        synchronized (ak.class) {
            try {
                if (f42278b == null) {
                    f42278b = new ak();
                }
                akVar = f42278b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return akVar;
    }

    public final synchronized void b() {
        ScheduledExecutorService scheduledExecutorService = this.f42279c;
        if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
            al.c("[AsyncTaskHandler] Close async handler.", new Object[0]);
            this.f42279c.shutdownNow();
        }
    }

    public final synchronized boolean c() {
        ScheduledExecutorService scheduledExecutorService = this.f42279c;
        if (scheduledExecutorService != null) {
            if (!scheduledExecutorService.isShutdown()) {
                return true;
            }
        }
        return false;
    }

    public final synchronized boolean a(Runnable runnable, long j11) {
        if (!c()) {
            al.d("[AsyncTaskHandler] Async handler was closed, should not post task.", new Object[0]);
            return false;
        }
        if (j11 <= 0) {
            j11 = 0;
        }
        al.c("[AsyncTaskHandler] Post a delay(time: %dms) task: %s", Long.valueOf(j11), runnable.getClass().getName());
        try {
            this.f42279c.schedule(runnable, j11, TimeUnit.MILLISECONDS);
            return true;
        } catch (Throwable th2) {
            if (p.f42621c) {
                th2.printStackTrace();
            }
            return false;
        }
    }

    public final synchronized boolean a(Runnable runnable) {
        if (!c()) {
            al.d("[AsyncTaskHandler] Async handler was closed, should not post task.", new Object[0]);
            return false;
        }
        if (runnable == null) {
            al.d("[AsyncTaskHandler] Task input is null.", new Object[0]);
            return false;
        }
        al.c("[AsyncTaskHandler] Post a normal task: %s", runnable.getClass().getName());
        try {
            this.f42279c.execute(runnable);
            return true;
        } catch (Throwable th2) {
            if (p.f42621c) {
                th2.printStackTrace();
            }
            return false;
        }
    }
}
