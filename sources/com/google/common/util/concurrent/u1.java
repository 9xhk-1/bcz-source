package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@l0
/* loaded from: classes7.dex */
public interface u1 extends ScheduledExecutorService, t1 {
    @Override // java.util.concurrent.ScheduledExecutorService
    r1<?> schedule(Runnable command, long delay, TimeUnit unit);

    @Override // java.util.concurrent.ScheduledExecutorService
    <V> r1<V> schedule(Callable<V> callable, long delay, TimeUnit unit);

    @Override // java.util.concurrent.ScheduledExecutorService
    r1<?> scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit);

    @Override // java.util.concurrent.ScheduledExecutorService
    r1<?> scheduleWithFixedDelay(Runnable command, long initialDelay, long delay, TimeUnit unit);
}
