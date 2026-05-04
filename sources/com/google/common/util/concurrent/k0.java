package com.google.common.util.concurrent;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@l0
/* loaded from: classes7.dex */
public final class k0 extends l {

    /* renamed from: a, reason: collision with root package name */
    public final Object f34694a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @vo.a(vb.a.f93813p)
    public int f34695b = 0;

    /* renamed from: c, reason: collision with root package name */
    @vo.a(vb.a.f93813p)
    public boolean f34696c = false;

    public final void a() {
        synchronized (this.f34694a) {
            try {
                int i11 = this.f34695b - 1;
                this.f34695b = i11;
                if (i11 == 0) {
                    this.f34694a.notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        long nanos = unit.toNanos(timeout);
        synchronized (this.f34694a) {
            while (true) {
                try {
                    if (this.f34696c && this.f34695b == 0) {
                        return true;
                    }
                    if (nanos <= 0) {
                        return false;
                    }
                    long nanoTime = System.nanoTime();
                    TimeUnit.NANOSECONDS.timedWait(this.f34694a, nanos);
                    nanos -= System.nanoTime() - nanoTime;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void b() {
        synchronized (this.f34694a) {
            try {
                if (this.f34696c) {
                    throw new RejectedExecutionException("Executor already shutdown");
                }
                this.f34695b++;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable command) {
        b();
        try {
            command.run();
        } finally {
            a();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        boolean z11;
        synchronized (this.f34694a) {
            z11 = this.f34696c;
        }
        return z11;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        boolean z11;
        synchronized (this.f34694a) {
            try {
                z11 = this.f34696c && this.f34695b == 0;
            } finally {
            }
        }
        return z11;
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        synchronized (this.f34694a) {
            try {
                this.f34696c = true;
                if (this.f34695b == 0) {
                    this.f34694a.notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        shutdown();
        return Collections.EMPTY_LIST;
    }
}
