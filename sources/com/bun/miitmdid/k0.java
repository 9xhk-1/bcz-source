package com.bun.miitmdid;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public class k0 {

    /* renamed from: d, reason: collision with root package name */
    public static BlockingQueue<Runnable> f28949d = new ArrayBlockingQueue(3);

    /* renamed from: e, reason: collision with root package name */
    public static ThreadFactory f28950e = new a();

    /* renamed from: a, reason: collision with root package name */
    public static int f28946a = 2;

    /* renamed from: c, reason: collision with root package name */
    public static int f28948c = 5;

    /* renamed from: b, reason: collision with root package name */
    public static int f28947b = 6000;

    /* renamed from: f, reason: collision with root package name */
    public static ThreadPoolExecutor f28951f = new ThreadPoolExecutor(f28946a, f28948c, f28947b, TimeUnit.SECONDS, f28949d, f28950e);

    public class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicInteger f28952a = new AtomicInteger();

        @Override // java.util.concurrent.ThreadFactory
        public native Thread newThread(Runnable runnable);
    }

    public static native void a(Runnable runnable);
}
