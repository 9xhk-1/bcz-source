package com.google.common.util.concurrent;

import com.google.common.collect.c5;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@l0
/* loaded from: classes7.dex */
public abstract class u0 extends c5 implements ExecutorService {
    @Override // java.util.concurrent.ExecutorService
    @uo.b
    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        return delegate().awaitTermination(timeout, unit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable command) {
        delegate().execute(command);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException {
        return delegate().invokeAll(tasks);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return (T) delegate().invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return delegate().isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return delegate().isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        delegate().shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    @uo.a
    public List<Runnable> shutdownNow() {
        return delegate().shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> task) {
        return delegate().submit(task);
    }

    @Override // com.google.common.collect.c5
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public abstract ExecutorService delegate();

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException {
        return delegate().invokeAll(tasks, timeout, unit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j11, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return (T) delegate().invokeAny(collection, j11, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable task) {
        return delegate().submit(task);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable task, @z1 T result) {
        return delegate().submit(task, result);
    }
}
