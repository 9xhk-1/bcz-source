package com.zx.a.I8b7;

import java.lang.Thread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class w implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public AtomicInteger f46727a = new AtomicInteger(0);

    public w(x xVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        StringBuilder a11 = f3.a("ZXHttpClient dispatcher's thread");
        a11.append(this.f46727a.getAndIncrement());
        thread.setName(a11.toString());
        thread.setUncaughtExceptionHandler(new a(this));
        return thread;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Thread.UncaughtExceptionHandler {
        public a(w wVar) {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th2) {
        }
    }
}
