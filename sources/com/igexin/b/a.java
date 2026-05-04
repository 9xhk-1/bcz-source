package com.igexin.b;

import android.text.TextUtils;
import com.igexin.push.core.ServiceManager;
import java.lang.Thread;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    private static String f37027b = "GTSDK-thread-pool | ";

    /* renamed from: a, reason: collision with root package name */
    public final ThreadPoolExecutor f37028a;

    /* renamed from: c, reason: collision with root package name */
    private final ConcurrentHashMap<String, ThreadPoolExecutor> f37029c;

    /* renamed from: d, reason: collision with root package name */
    private ScheduledThreadPoolExecutor f37030d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicInteger f37031e;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicInteger f37032f;

    /* renamed from: g, reason: collision with root package name */
    private int f37033g;

    /* renamed from: com.igexin.b.a$a, reason: collision with other inner class name */
    public static class C0458a {

        /* renamed from: a, reason: collision with root package name */
        private static final a f37044a = new a(0);

        private C0458a() {
        }
    }

    private a() {
        this.f37029c = new ConcurrentHashMap<>();
        this.f37031e = new AtomicInteger(0);
        this.f37032f = new AtomicInteger(0);
        this.f37033g = 30;
        this.f37028a = new ThreadPoolExecutor(0, Runtime.getRuntime().availableProcessors() * 2, this.f37033g, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: com.igexin.b.a.1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, "gt-thread-multiple " + a.this.f37031e.getAndIncrement());
                thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.igexin.b.a.1.1
                    @Override // java.lang.Thread.UncaughtExceptionHandler
                    public final void uncaughtException(Thread thread2, Throwable th2) {
                        com.igexin.c.a.c.a.a(a.f37027b + "| caught an exception from " + thread2.getName(), th2);
                    }
                });
                return thread;
            }
        }, new RejectedExecutionHandler() { // from class: com.igexin.b.a.2
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                if (ServiceManager.f37612b != null) {
                    com.igexin.c.a.c.a.a(a.f37027b + "|gtsdk-multiple-thread rejected task tasknum = " + threadPoolExecutor.getActiveCount(), new Object[0]);
                }
            }
        });
    }

    public static a a() {
        return C0458a.f37044a;
    }

    private ThreadPoolExecutor d() {
        return this.f37028a;
    }

    public final ScheduledThreadPoolExecutor b() {
        if (this.f37030d == null) {
            final String str = "gt-thread-delay";
            this.f37030d = new ScheduledThreadPoolExecutor(0, new ThreadFactory() { // from class: com.igexin.b.a.5
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable, str);
                    thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.igexin.b.a.5.1
                        @Override // java.lang.Thread.UncaughtExceptionHandler
                        public final void uncaughtException(Thread thread2, Throwable th2) {
                            com.igexin.c.a.c.a.a(a.f37027b + "| caught an exception from " + thread2.getName(), th2);
                        }
                    });
                    return thread;
                }
            });
        }
        return this.f37030d;
    }

    public /* synthetic */ a(byte b11) {
        this();
    }

    public final ThreadPoolExecutor a(String str) {
        final String concat = TextUtils.isEmpty(str) ? "gt-thread" : "gt-thread-".concat(String.valueOf(str));
        if (this.f37029c.containsKey(concat)) {
            return this.f37029c.get(concat);
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, this.f37033g, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.igexin.b.a.3
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, concat);
                thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.igexin.b.a.3.1
                    @Override // java.lang.Thread.UncaughtExceptionHandler
                    public final void uncaughtException(Thread thread2, Throwable th2) {
                        com.igexin.c.a.c.a.a(a.f37027b + "| caught an exception from " + thread2.getName(), th2);
                    }
                });
                return thread;
            }
        }, new RejectedExecutionHandler() { // from class: com.igexin.b.a.4
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                if (ServiceManager.f37612b != null) {
                    com.igexin.c.a.c.a.a(a.f37027b + "singleThread rejected task tasknum = " + threadPoolExecutor2.getActiveCount(), new Object[0]);
                }
            }
        });
        this.f37029c.put(concat, threadPoolExecutor);
        return threadPoolExecutor;
    }
}
