package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l0
@go.b
/* loaded from: classes7.dex */
public final class v0<V> extends q0<V> {

    /* renamed from: i, reason: collision with root package name */
    public final p1<V> f34876i;

    public v0(p1<V> delegate) {
        this.f34876i = (p1) Preconditions.checkNotNull(delegate);
    }

    @Override // com.google.common.util.concurrent.f, com.google.common.util.concurrent.p1
    public void addListener(Runnable listener, Executor executor) {
        this.f34876i.addListener(listener, executor);
    }

    @Override // com.google.common.util.concurrent.f, java.util.concurrent.Future
    public boolean cancel(boolean mayInterruptIfRunning) {
        return this.f34876i.cancel(mayInterruptIfRunning);
    }

    @Override // com.google.common.util.concurrent.f, java.util.concurrent.Future
    @z1
    public V get() throws InterruptedException, ExecutionException {
        return this.f34876i.get();
    }

    @Override // com.google.common.util.concurrent.f, java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f34876i.isCancelled();
    }

    @Override // com.google.common.util.concurrent.f, java.util.concurrent.Future
    public boolean isDone() {
        return this.f34876i.isDone();
    }

    @Override // com.google.common.util.concurrent.f
    public String toString() {
        return this.f34876i.toString();
    }

    @Override // com.google.common.util.concurrent.f, java.util.concurrent.Future
    @z1
    public V get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f34876i.get(timeout, unit);
    }
}
