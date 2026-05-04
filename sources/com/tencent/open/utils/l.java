package com.tencent.open.utils;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    private static Handler f44606c;

    /* renamed from: d, reason: collision with root package name */
    private static HandlerThread f44607d;

    /* renamed from: b, reason: collision with root package name */
    private static Object f44605b = new Object();

    /* renamed from: a, reason: collision with root package name */
    public static final Executor f44604a = c();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements Executor {

        /* renamed from: a, reason: collision with root package name */
        final Queue<Runnable> f44608a;

        /* renamed from: b, reason: collision with root package name */
        Runnable f44609b;

        private a() {
            this.f44608a = new LinkedList();
        }

        public synchronized void a() {
            Runnable poll = this.f44608a.poll();
            this.f44609b = poll;
            if (poll != null) {
                l.f44604a.execute(poll);
            }
        }

        @Override // java.util.concurrent.Executor
        public synchronized void execute(final Runnable runnable) {
            this.f44608a.offer(new Runnable() { // from class: com.tencent.open.utils.l.a.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        runnable.run();
                    } finally {
                        a.this.a();
                    }
                }
            });
            if (this.f44609b == null) {
                a();
            }
        }
    }

    public static void a(Runnable runnable) {
        try {
            f44604a.execute(runnable);
        } catch (RejectedExecutionException unused) {
        }
    }

    public static void b(Runnable runnable) {
        a().post(runnable);
    }

    private static Executor c() {
        return new ThreadPoolExecutor(0, 3, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }

    public static Handler a() {
        if (f44606c == null) {
            synchronized (l.class) {
                HandlerThread handlerThread = new HandlerThread("SDK_SUB");
                f44607d = handlerThread;
                handlerThread.start();
                f44606c = new Handler(f44607d.getLooper());
            }
        }
        return f44606c;
    }

    public static Executor b() {
        return new a();
    }
}
