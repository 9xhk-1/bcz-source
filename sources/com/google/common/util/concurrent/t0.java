package com.google.common.util.concurrent;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@l0
/* loaded from: classes7.dex */
public abstract class t0 implements Condition {
    public abstract Condition a();

    @Override // java.util.concurrent.locks.Condition
    public void await() throws InterruptedException {
        a().await();
    }

    @Override // java.util.concurrent.locks.Condition
    public long awaitNanos(long nanosTimeout) throws InterruptedException {
        return a().awaitNanos(nanosTimeout);
    }

    @Override // java.util.concurrent.locks.Condition
    public void awaitUninterruptibly() {
        a().awaitUninterruptibly();
    }

    @Override // java.util.concurrent.locks.Condition
    public boolean awaitUntil(Date deadline) throws InterruptedException {
        return a().awaitUntil(deadline);
    }

    @Override // java.util.concurrent.locks.Condition
    public void signal() {
        a().signal();
    }

    @Override // java.util.concurrent.locks.Condition
    public void signalAll() {
        a().signalAll();
    }

    @Override // java.util.concurrent.locks.Condition
    public boolean await(long time, TimeUnit unit) throws InterruptedException {
        return a().await(time, unit);
    }
}
