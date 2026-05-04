package com.zx.a.I8b7;

import java.lang.Thread;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class v3 {

    /* renamed from: a, reason: collision with root package name */
    public ThreadPoolExecutor f46721a;

    /* renamed from: b, reason: collision with root package name */
    public ThreadPoolExecutor f46722b;

    /* renamed from: c, reason: collision with root package name */
    public ThreadPoolExecutor f46723c;

    /* renamed from: d, reason: collision with root package name */
    public ThreadPoolExecutor f46724d;

    /* renamed from: e, reason: collision with root package name */
    public ThreadPoolExecutor f46725e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ThreadFactory {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.zx.a.I8b7.v3$a$a, reason: collision with other inner class name */
        public class C0538a implements Thread.UncaughtExceptionHandler {
            public C0538a(a aVar) {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th2) {
                StringBuilder a11 = f3.a("caught an exception from ");
                a11.append(thread.getName());
                r2.a(a11.toString(), th2);
            }
        }

        public a(v3 v3Var) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("ZX-Api-Thread");
            thread.setUncaughtExceptionHandler(new C0538a(this));
            return thread;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements ThreadFactory {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Thread.UncaughtExceptionHandler {
            public a(b bVar) {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th2) {
                StringBuilder a11 = f3.a("caught an exception from ");
                a11.append(thread.getName());
                r2.a(a11.toString(), th2);
            }
        }

        public b(v3 v3Var) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("ZX-Api-ThreadV2");
            thread.setUncaughtExceptionHandler(new a(this));
            return thread;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements ThreadFactory {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Thread.UncaughtExceptionHandler {
            public a(c cVar) {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th2) {
                StringBuilder a11 = f3.a("caught an exception from ");
                a11.append(thread.getName());
                r2.a(a11.toString(), th2);
            }
        }

        public c(v3 v3Var) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("ZX-Api-ThreadV3");
            thread.setUncaughtExceptionHandler(new a(this));
            return thread;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements ThreadFactory {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Thread.UncaughtExceptionHandler {
            public a(d dVar) {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th2) {
                StringBuilder a11 = f3.a("caught an exception from ");
                a11.append(thread.getName());
                r2.a(a11.toString(), th2);
            }
        }

        public d(v3 v3Var) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("ZX-Api-ThreadV4");
            thread.setUncaughtExceptionHandler(new a(this));
            return thread;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements ThreadFactory {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Thread.UncaughtExceptionHandler {
            public a(e eVar) {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th2) {
                StringBuilder a11 = f3.a("caught an exception from ");
                a11.append(thread.getName());
                r2.a(a11.toString(), th2);
            }
        }

        public e(v3 v3Var) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("ZX-Api-ThreadV5");
            thread.setUncaughtExceptionHandler(new a(this));
            return thread;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public static final v3 f46726a = new v3();
    }

    public v3() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f46721a = new ThreadPoolExecutor(1, 1, 0L, timeUnit, new LinkedBlockingQueue(), new a(this));
        this.f46722b = new ThreadPoolExecutor(1, 1, 0L, timeUnit, new LinkedBlockingQueue(), new b(this));
        this.f46723c = new ThreadPoolExecutor(1, 1, 0L, timeUnit, new LinkedBlockingQueue(), new c(this));
        this.f46724d = new ThreadPoolExecutor(1, 1, 0L, timeUnit, new LinkedBlockingQueue(), new d(this));
        this.f46725e = new ThreadPoolExecutor(1, 1, 0L, timeUnit, new LinkedBlockingQueue(), new e(this));
    }
}
