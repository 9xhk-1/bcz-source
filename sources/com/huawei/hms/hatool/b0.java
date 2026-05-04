package com.huawei.hms.hatool;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b0 {

    /* renamed from: b, reason: collision with root package name */
    private static b0 f35759b;

    /* renamed from: c, reason: collision with root package name */
    private static b0 f35760c;

    /* renamed from: d, reason: collision with root package name */
    private static b0 f35761d;

    /* renamed from: a, reason: collision with root package name */
    private ThreadPoolExecutor f35762a = new ThreadPoolExecutor(0, 1, 60000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(5000), new b());

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private Runnable f35763a;

        public a(Runnable runnable) {
            this.f35763a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = this.f35763a;
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Exception unused) {
                    v.e("hmsSdk", "InnerTask : Exception has happened,From internal operations!");
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements ThreadFactory {

        /* renamed from: d, reason: collision with root package name */
        private static final AtomicInteger f35764d = new AtomicInteger(1);

        /* renamed from: a, reason: collision with root package name */
        private final ThreadGroup f35765a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicInteger f35766b = new AtomicInteger(1);

        /* renamed from: c, reason: collision with root package name */
        private final String f35767c;

        public b() {
            SecurityManager securityManager = System.getSecurityManager();
            this.f35765a = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
            this.f35767c = "FormalHASDK-base-" + f35764d.getAndIncrement();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(this.f35765a, runnable, this.f35767c + this.f35766b.getAndIncrement(), 0L);
        }
    }

    static {
        new b0();
        new b0();
        f35759b = new b0();
        f35760c = new b0();
        f35761d = new b0();
    }

    private b0() {
    }

    public static b0 a() {
        return f35761d;
    }

    public static b0 b() {
        return f35760c;
    }

    public static b0 c() {
        return f35759b;
    }

    public void a(g gVar) {
        try {
            this.f35762a.execute(new a(gVar));
        } catch (RejectedExecutionException unused) {
            v.e("hmsSdk", "addToQueue() Exception has happened!Form rejected execution");
        }
    }
}
