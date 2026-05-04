package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@l0
/* loaded from: classes7.dex */
public abstract class a3 implements ExecutorService {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f34482a;

    public a3(ExecutorService delegate) {
        this.f34482a = (ExecutorService) Preconditions.checkNotNull(delegate);
    }

    public static /* synthetic */ void a(Callable callable) {
        try {
            callable.call();
        } catch (Exception e11) {
            b2.b(e11);
            ho.t0.w(e11);
            throw new RuntimeException(e11);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        return this.f34482a.awaitTermination(timeout, unit);
    }

    public Runnable b(Runnable command) {
        final Callable c11 = c(Executors.callable(command, null));
        return new Runnable() { // from class: com.google.common.util.concurrent.z2
            @Override // java.lang.Runnable
            public final void run() {
                a3.a(c11);
            }
        };
    }

    public abstract <T> Callable<T> c(Callable<T> callable);

    public final <T> ImmutableList<Callable<T>> d(Collection<? extends Callable<T>> tasks) {
        ImmutableList.a builder = ImmutableList.builder();
        Iterator<? extends Callable<T>> it = tasks.iterator();
        while (it.hasNext()) {
            builder.g(c(it.next()));
        }
        return builder.e();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        this.f34482a.execute(b(command));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException {
        return this.f34482a.invokeAll(d(tasks));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return (T) this.f34482a.invokeAny(d(collection));
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f34482a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f34482a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f34482a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    @uo.a
    public final List<Runnable> shutdownNow() {
        return this.f34482a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> task) {
        return this.f34482a.submit(c((Callable) Preconditions.checkNotNull(task)));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException {
        return this.f34482a.invokeAll(d(tasks), timeout, unit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j11, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return (T) this.f34482a.invokeAny(d(collection), j11, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable task) {
        return this.f34482a.submit(b(task));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable task, @z1 T result) {
        return this.f34482a.submit(b(task), result);
    }
}
