package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.collect.c5;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l0
@go.b
/* loaded from: classes7.dex */
public abstract class w0<V> extends c5 implements Future<V> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class a<V> extends w0<V> {

        /* renamed from: a, reason: collision with root package name */
        public final Future<V> f34887a;

        public a(Future<V> delegate) {
            this.f34887a = (Future) Preconditions.checkNotNull(delegate);
        }

        @Override // com.google.common.util.concurrent.w0, com.google.common.collect.c5
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public final Future<V> delegate() {
            return this.f34887a;
        }
    }

    @Override // java.util.concurrent.Future
    @uo.a
    public boolean cancel(boolean mayInterruptIfRunning) {
        return delegate().cancel(mayInterruptIfRunning);
    }

    @Override // java.util.concurrent.Future
    @z1
    @uo.a
    public V get() throws InterruptedException, ExecutionException {
        return delegate().get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return delegate().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return delegate().isDone();
    }

    @Override // com.google.common.collect.c5
    /* renamed from: w */
    public abstract Future<? extends V> delegate();

    @Override // java.util.concurrent.Future
    @z1
    @uo.a
    public V get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        return delegate().get(timeout, unit);
    }
}
