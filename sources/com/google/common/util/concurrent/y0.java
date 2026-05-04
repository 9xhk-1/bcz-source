package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@l0
/* loaded from: classes7.dex */
public abstract class y0 extends u0 implements t1 {
    @Override // com.google.common.util.concurrent.u0
    /* renamed from: x, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract t1 delegate();

    @Override // com.google.common.util.concurrent.u0, java.util.concurrent.ExecutorService
    public /* bridge */ /* synthetic */ Future submit(Runnable task, @z1 Object result) {
        return submit(task, (Runnable) result);
    }

    @Override // com.google.common.util.concurrent.u0, java.util.concurrent.ExecutorService
    public <T> p1<T> submit(Callable<T> task) {
        return w().submit((Callable) task);
    }

    @Override // com.google.common.util.concurrent.u0, java.util.concurrent.ExecutorService
    public p1<?> submit(Runnable task) {
        return w().submit(task);
    }

    @Override // com.google.common.util.concurrent.u0, java.util.concurrent.ExecutorService
    public <T> p1<T> submit(Runnable task, @z1 T result) {
        return w().submit(task, (Runnable) result);
    }
}
