package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@l0
/* loaded from: classes7.dex */
public abstract class b3 extends a3 implements ScheduledExecutorService {

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f34488b;

    public b3(ScheduledExecutorService delegate) {
        super(delegate);
        this.f34488b = delegate;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> schedule(Runnable command, long delay, TimeUnit unit) {
        return this.f34488b.schedule(b(command), delay, unit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit) {
        return this.f34488b.scheduleAtFixedRate(b(command), initialDelay, period, unit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleWithFixedDelay(Runnable command, long initialDelay, long delay, TimeUnit unit) {
        return this.f34488b.scheduleWithFixedDelay(b(command), initialDelay, delay, unit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final <V> ScheduledFuture<V> schedule(Callable<V> task, long delay, TimeUnit unit) {
        return this.f34488b.schedule(c(task), delay, unit);
    }
}
