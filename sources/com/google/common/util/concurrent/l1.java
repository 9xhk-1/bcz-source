package com.google.common.util.concurrent;

import com.google.j2objc.annotations.ReflectionSupport;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.LockSupport;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.b(emulated = true)
@ReflectionSupport(ReflectionSupport.Level.FULL)
@l0
/* loaded from: classes7.dex */
public abstract class l1<T> extends AtomicReference<Runnable> implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public static final Runnable f34710a;

    /* renamed from: b, reason: collision with root package name */
    public static final Runnable f34711b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f34712c = 1000;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.e
    public static final class b extends AbstractOwnableSynchronizer implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final l1<?> f34713a;

        @CheckForNull
        @go.e
        public Thread b() {
            return super.getExclusiveOwnerThread();
        }

        public final void c(Thread thread) {
            super.setExclusiveOwnerThread(thread);
        }

        public String toString() {
            return this.f34713a.toString();
        }

        public b(l1<?> task) {
            this.f34713a = task;
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    static {
        f34710a = new c();
        f34711b = new c();
    }

    public abstract void a(Throwable error);

    public abstract void b(@z1 T result);

    public final void c() {
        Runnable runnable = get();
        if (runnable instanceof Thread) {
            b bVar = new b();
            bVar.c(Thread.currentThread());
            if (compareAndSet(runnable, bVar)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (getAndSet(f34710a) == f34711b) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    public abstract boolean d();

    @z1
    public abstract T e() throws Exception;

    public abstract String f();

    public final void g(Thread currentThread) {
        Runnable runnable = get();
        b bVar = null;
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            boolean z12 = runnable instanceof b;
            if (!z12 && runnable != f34711b) {
                break;
            }
            if (z12) {
                bVar = (b) runnable;
            }
            i11++;
            if (i11 > 1000) {
                Runnable runnable2 = f34711b;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z11 = Thread.interrupted() || z11;
                    LockSupport.park(bVar);
                }
            } else {
                Thread.yield();
            }
            runnable = get();
        }
        if (z11) {
            currentThread.interrupt();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet(null, currentThread)) {
            boolean d11 = d();
            if (!d11) {
                try {
                    obj = e();
                } catch (Throwable th2) {
                    try {
                        b2.b(th2);
                        if (!compareAndSet(currentThread, f34710a)) {
                            g(currentThread);
                        }
                        if (d11) {
                            return;
                        }
                        a(th2);
                        return;
                    } finally {
                        if (!compareAndSet(currentThread, f34710a)) {
                            g(currentThread);
                        }
                        if (!d11) {
                            b(x1.a(null));
                        }
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = get();
        if (runnable == f34710a) {
            str = "running=[DONE]";
        } else if (runnable instanceof b) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + org.junit.jupiter.api.j2.O + f();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }
}
