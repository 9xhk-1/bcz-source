package com.mob.secverify.pure.core.ope.cm.a;

import android.content.Context;
import java.lang.Thread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static ExecutorService f40921a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue());

    public static void a(a aVar) {
        f40921a.execute(aVar);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private Thread.UncaughtExceptionHandler f40922a;

        public a() {
            this.f40922a = new Thread.UncaughtExceptionHandler() { // from class: com.mob.secverify.pure.core.ope.cm.a.c.a.1
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread, Throwable th2) {
                    com.mob.secverify.b.c.a().a(th2, "[SecPure] ==>%s", th2.getMessage());
                }
            };
        }

        public abstract void a();

        @Override // java.lang.Runnable
        public void run() {
            Thread.currentThread().setUncaughtExceptionHandler(this.f40922a);
            a();
            Thread.currentThread().setUncaughtExceptionHandler(null);
        }

        public a(Context context, d dVar) {
            this.f40922a = new Thread.UncaughtExceptionHandler() { // from class: com.mob.secverify.pure.core.ope.cm.a.c.a.2
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread, Throwable th2) {
                    com.mob.secverify.b.c.a().a(th2, "[SecPure] ==>%s", th2.getMessage());
                }
            };
        }
    }
}
