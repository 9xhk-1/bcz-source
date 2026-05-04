package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l0
@go.b(emulated = true)
/* loaded from: classes7.dex */
public final class d0 {
    public static /* synthetic */ void a(ho.p0 p0Var, Runnable runnable) {
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        boolean i11 = i((String) p0Var.get(), currentThread);
        try {
            runnable.run();
        } finally {
            if (i11) {
                i(name, currentThread);
            }
        }
    }

    public static /* synthetic */ Object c(ho.p0 p0Var, Callable callable) {
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        boolean i11 = i((String) p0Var.get(), currentThread);
        try {
            return callable.call();
        } finally {
            if (i11) {
                i(name, currentThread);
            }
        }
    }

    @go.d
    @go.c
    public static <T> w<T> e(final Callable<T> callable, final t1 listeningExecutorService) {
        Preconditions.checkNotNull(callable);
        Preconditions.checkNotNull(listeningExecutorService);
        return new w() { // from class: com.google.common.util.concurrent.a0
            @Override // com.google.common.util.concurrent.w
            public final p1 call() {
                p1 submit;
                submit = t1.this.submit(callable);
                return submit;
            }
        };
    }

    public static <T> Callable<T> f(@z1 final T value) {
        return new Callable() { // from class: com.google.common.util.concurrent.b0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return d0.d(value);
            }
        };
    }

    @go.d
    @go.c
    public static Runnable g(final Runnable task, final ho.p0<String> nameSupplier) {
        Preconditions.checkNotNull(nameSupplier);
        Preconditions.checkNotNull(task);
        return new Runnable() { // from class: com.google.common.util.concurrent.c0
            @Override // java.lang.Runnable
            public final void run() {
                d0.a(ho.p0.this, task);
            }
        };
    }

    @go.d
    @go.c
    public static <T> Callable<T> h(final Callable<T> callable, final ho.p0<String> nameSupplier) {
        Preconditions.checkNotNull(nameSupplier);
        Preconditions.checkNotNull(callable);
        return new Callable() { // from class: com.google.common.util.concurrent.z
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return d0.c(ho.p0.this, callable);
            }
        };
    }

    @go.d
    @go.c
    public static boolean i(String threadName, Thread currentThread) {
        try {
            currentThread.setName(threadName);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static /* synthetic */ Object d(Object obj) {
        return obj;
    }
}
