package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@l0
/* loaded from: classes7.dex */
public class q1<V> extends FutureTask<V> implements p1<V> {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f34814a;

    public q1(Callable<V> callable) {
        super(callable);
        this.f34814a = new m0();
    }

    public static <V> q1<V> a(Runnable runnable, @z1 V result) {
        return new q1<>(runnable, result);
    }

    public static <V> q1<V> b(Callable<V> callable) {
        return new q1<>(callable);
    }

    @Override // com.google.common.util.concurrent.p1
    public void addListener(Runnable listener, Executor exec) {
        this.f34814a.a(listener, exec);
    }

    @Override // java.util.concurrent.FutureTask
    public void done() {
        this.f34814a.b();
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    @z1
    @uo.a
    public V get(long j11, TimeUnit timeUnit) throws TimeoutException, InterruptedException, ExecutionException {
        long nanos = timeUnit.toNanos(j11);
        return nanos <= y1.f34912a ? (V) super.get(j11, timeUnit) : (V) super.get(Math.min(nanos, y1.f34912a), TimeUnit.NANOSECONDS);
    }

    public q1(Runnable runnable, @z1 V result) {
        super(runnable, result);
        this.f34814a = new m0();
    }
}
