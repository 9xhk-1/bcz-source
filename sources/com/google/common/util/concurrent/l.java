package com.google.common.util.concurrent;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@l0
@uo.b
/* loaded from: classes7.dex */
public abstract class l extends AbstractExecutorService implements t1 {
    @Override // java.util.concurrent.AbstractExecutorService
    @uo.a
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, @z1 T value) {
        return w2.O(runnable, value);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    @uo.a
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return w2.P(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.common.util.concurrent.t1
    @uo.a
    public /* bridge */ /* synthetic */ Future submit(Runnable task, @z1 Object result) {
        return submit(task, (Runnable) result);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.common.util.concurrent.t1
    @uo.a
    public p1<?> submit(Runnable task) {
        return (p1) super.submit(task);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.common.util.concurrent.t1
    @uo.a
    public <T> p1<T> submit(Runnable task, @z1 T result) {
        return (p1) super.submit(task, (Runnable) result);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.common.util.concurrent.t1
    @uo.a
    public <T> p1<T> submit(Callable<T> task) {
        return (p1) super.submit((Callable) task);
    }
}
