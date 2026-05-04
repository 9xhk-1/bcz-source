package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@uo.f("Use FakeTimeLimiter")
@go.d
@go.c
@l0
/* loaded from: classes7.dex */
public interface u2 {
    void a(Runnable runnable, long timeoutDuration, TimeUnit timeoutUnit) throws TimeoutException;

    @z1
    @uo.a
    <T> T b(Callable<T> callable, long timeoutDuration, TimeUnit timeoutUnit) throws TimeoutException, ExecutionException;

    @z1
    @uo.a
    <T> T c(Callable<T> callable, long timeoutDuration, TimeUnit timeoutUnit) throws TimeoutException, InterruptedException, ExecutionException;

    void d(Runnable runnable, long timeoutDuration, TimeUnit timeoutUnit) throws TimeoutException, InterruptedException;

    <T> T e(T target, Class<T> interfaceType, long timeoutDuration, TimeUnit timeoutUnit);
}
