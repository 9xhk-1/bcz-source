package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.a2;
import com.google.common.util.concurrent.f;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.b(emulated = true)
@uo.f("Use FluentFuture.from(Futures.immediate*Future) or SettableFuture")
@l0
/* loaded from: classes7.dex */
public abstract class q0<V> extends i1<V> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class a<V> extends q0<V> implements f.i<V> {
        @Override // com.google.common.util.concurrent.f, com.google.common.util.concurrent.p1
        public final void addListener(Runnable listener, Executor executor) {
            super.addListener(listener, executor);
        }

        @Override // com.google.common.util.concurrent.f, java.util.concurrent.Future
        @uo.a
        public final boolean cancel(boolean mayInterruptIfRunning) {
            return super.cancel(mayInterruptIfRunning);
        }

        @Override // com.google.common.util.concurrent.f, java.util.concurrent.Future
        @z1
        @uo.a
        public final V get() throws InterruptedException, ExecutionException {
            return (V) super.get();
        }

        @Override // com.google.common.util.concurrent.f, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.f, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // com.google.common.util.concurrent.f, java.util.concurrent.Future
        @z1
        @uo.a
        public final V get(long j11, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return (V) super.get(j11, timeUnit);
        }
    }

    @Deprecated
    public static <V> q0<V> I(q0<V> future) {
        return (q0) Preconditions.checkNotNull(future);
    }

    public static <V> q0<V> J(p1<V> future) {
        return future instanceof q0 ? (q0) future : new v0(future);
    }

    public final void F(a1<? super V> callback, Executor executor) {
        d1.c(this, callback, executor);
    }

    @go.d
    @a2.a("AVAILABLE but requires exceptionType to be Throwable.class")
    public final <X extends Throwable> q0<V> G(Class<X> exceptionType, ho.r<? super X, ? extends V> fallback, Executor executor) {
        return (q0) d1.f(this, exceptionType, fallback, executor);
    }

    @go.d
    @a2.a("AVAILABLE but requires exceptionType to be Throwable.class")
    public final <X extends Throwable> q0<V> H(Class<X> exceptionType, x<? super X, ? extends V> fallback, Executor executor) {
        return (q0) d1.g(this, exceptionType, fallback, executor);
    }

    public final <T> q0<T> K(ho.r<? super V, T> function, Executor executor) {
        return (q0) d1.z(this, function, executor);
    }

    public final <T> q0<T> L(x<? super V, T> function, Executor executor) {
        return (q0) d1.A(this, function, executor);
    }

    @go.d
    @go.c
    public final q0<V> M(long timeout, TimeUnit unit, ScheduledExecutorService scheduledExecutor) {
        return (q0) d1.F(this, timeout, unit, scheduledExecutor);
    }
}
