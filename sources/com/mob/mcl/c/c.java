package com.mob.mcl.c;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public class c implements Future<e> {

    /* renamed from: a, reason: collision with root package name */
    final CountDownLatch f40498a = new CountDownLatch(1);

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference<e> f40499b = new AtomicReference<>();

    @Override // java.util.concurrent.Future
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public e get() throws InterruptedException, ExecutionException {
        this.f40498a.await();
        return this.f40499b.get();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z11) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f40498a.getCount() == 0;
    }

    @Override // java.util.concurrent.Future
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public e get(long j11, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        if (this.f40498a.await(j11, timeUnit)) {
            return this.f40499b.get();
        }
        throw new TimeoutException("tcp get msg timeout");
    }

    public void a(e eVar) {
        synchronized (this.f40498a) {
            this.f40499b.set(eVar);
            this.f40498a.countDown();
        }
    }
}
