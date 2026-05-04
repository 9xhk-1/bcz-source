package com.mob.commons;

import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public static final String f40412a = "M-" + com.mob.commons.a.l.a("002Midij");

    /* renamed from: b, reason: collision with root package name */
    public static final String f40413b = "M-" + com.mob.commons.a.l.a("003Thhflij");

    /* renamed from: c, reason: collision with root package name */
    public static final ThreadPoolExecutor f40414c;

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadPoolExecutor f40415d;

    public static class a implements RejectedExecutionHandler {
        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            try {
                com.mob.commons.a.l.a().c(500L, runnable);
            } catch (Throwable unused) {
            }
        }
    }

    public static class b implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private static final AtomicInteger f40416a = new AtomicInteger(1);

        /* renamed from: b, reason: collision with root package name */
        private final ThreadGroup f40417b;

        /* renamed from: c, reason: collision with root package name */
        private final AtomicInteger f40418c = new AtomicInteger(1);

        /* renamed from: d, reason: collision with root package name */
        private final String f40419d;

        public b(int i11) {
            SecurityManager securityManager = System.getSecurityManager();
            this.f40417b = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
            if (TextUtils.isEmpty("M-")) {
                this.f40419d = com.mob.commons.a.l.a("005f_fdfdfeij") + f40416a.getAndIncrement() + com.mob.commons.a.l.a("008_ijAed*eiLjTeg i[ij");
                return;
            }
            this.f40419d = t.f40413b + i11 + Constants.ACCEPT_TIME_SEPARATOR_SERVER + f40416a.getAndIncrement() + Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(this.f40417b, runnable, this.f40419d + this.f40418c.getAndIncrement(), 0L);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }
    }

    static {
        int max = Math.max(2, 5);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f40414c = new ThreadPoolExecutor(2, max, 60L, timeUnit, new SynchronousQueue(), new b(0), new a());
        f40415d = new ThreadPoolExecutor(1, 1, 120L, timeUnit, new LinkedBlockingQueue(), new b(1));
    }
}
