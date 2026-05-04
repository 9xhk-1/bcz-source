package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@l0
/* loaded from: classes7.dex */
public final class p0 implements u2 {
    @Override // com.google.common.util.concurrent.u2
    public void a(Runnable runnable, long timeoutDuration, TimeUnit timeoutUnit) {
        d(runnable, timeoutDuration, timeoutUnit);
    }

    @Override // com.google.common.util.concurrent.u2
    @z1
    @uo.a
    public <T> T b(Callable<T> callable, long j11, TimeUnit timeUnit) throws ExecutionException {
        return (T) c(callable, j11, timeUnit);
    }

    @Override // com.google.common.util.concurrent.u2
    @z1
    @uo.a
    public <T> T c(Callable<T> callable, long timeoutDuration, TimeUnit timeoutUnit) throws ExecutionException {
        Preconditions.checkNotNull(callable);
        Preconditions.checkNotNull(timeoutUnit);
        try {
            return callable.call();
        } catch (Error e11) {
            throw new ExecutionError(e11);
        } catch (RuntimeException e12) {
            throw new UncheckedExecutionException(e12);
        } catch (Exception e13) {
            b2.b(e13);
            throw new ExecutionException(e13);
        }
    }

    @Override // com.google.common.util.concurrent.u2
    public void d(Runnable runnable, long timeoutDuration, TimeUnit timeoutUnit) {
        Preconditions.checkNotNull(runnable);
        Preconditions.checkNotNull(timeoutUnit);
        try {
            runnable.run();
        } catch (Error e11) {
            throw new ExecutionError(e11);
        } catch (Exception e12) {
            throw new UncheckedExecutionException(e12);
        }
    }

    @Override // com.google.common.util.concurrent.u2
    @uo.a
    public <T> T e(T target, Class<T> interfaceType, long timeoutDuration, TimeUnit timeoutUnit) {
        Preconditions.checkNotNull(target);
        Preconditions.checkNotNull(interfaceType);
        Preconditions.checkNotNull(timeoutUnit);
        return target;
    }
}
