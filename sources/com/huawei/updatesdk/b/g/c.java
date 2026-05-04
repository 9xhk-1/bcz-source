package com.huawei.updatesdk.b.g;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadPoolExecutor f36910a;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f36911b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f36912a = new AtomicInteger();

        /* renamed from: b, reason: collision with root package name */
        private final String f36913b;

        public a(String str) {
            this.f36913b = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, this.f36913b + "#" + this.f36912a.incrementAndGet());
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f36910a = new ThreadPoolExecutor(2, 2, 10L, timeUnit, new LinkedBlockingQueue(), new a("UpdateSDK-ServerTask"));
        f36911b = new ThreadPoolExecutor(3, 8, 5L, timeUnit, new LinkedBlockingQueue(), new a("UpdateSDK-CheckTask"));
    }
}
