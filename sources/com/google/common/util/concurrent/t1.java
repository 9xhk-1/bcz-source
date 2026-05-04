package com.google.common.util.concurrent;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.c
@l0
@uo.f("Use TestingExecutors.sameThreadScheduledExecutor, or wrap a real Executor from java.util.concurrent.Executors with MoreExecutors.listeningDecorator")
/* loaded from: classes7.dex */
public interface t1 extends ExecutorService {
    @Override // java.util.concurrent.ExecutorService
    <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException;

    @Override // java.util.concurrent.ExecutorService
    <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException;

    @Override // java.util.concurrent.ExecutorService, com.google.common.util.concurrent.t1
    p1<?> submit(Runnable task);

    <T> p1<T> submit(Runnable task, @z1 T result);

    @Override // java.util.concurrent.ExecutorService, com.google.common.util.concurrent.t1
    <T> p1<T> submit(Callable<T> task);

    /* bridge */ /* synthetic */ default Future submit(Runnable task, @z1 Object result) {
        return submit(task, (Runnable) result);
    }
}
