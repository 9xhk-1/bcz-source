package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class w0<T> {

    /* renamed from: e, reason: collision with root package name */
    public static Executor f10225e = Executors.newCachedThreadPool();

    /* renamed from: a, reason: collision with root package name */
    public final Set<q0<T>> f10226a;

    /* renamed from: b, reason: collision with root package name */
    public final Set<q0<Throwable>> f10227b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f10228c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public volatile u0<T> f10229d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends FutureTask<u0<T>> {
        public a(Callable<u0<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            if (isCancelled()) {
                return;
            }
            try {
                w0.this.j(get());
            } catch (InterruptedException | ExecutionException e11) {
                w0.this.j(new u0(e11));
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public w0(Callable<u0<T>> callable) {
        this(callable, false);
    }

    public static /* synthetic */ void a(w0 w0Var) {
        u0<T> u0Var = w0Var.f10229d;
        if (u0Var == null) {
            return;
        }
        if (u0Var.b() != null) {
            w0Var.g(u0Var.b());
        } else {
            w0Var.e(u0Var.a());
        }
    }

    public synchronized w0<T> c(q0<Throwable> q0Var) {
        try {
            u0<T> u0Var = this.f10229d;
            if (u0Var != null && u0Var.a() != null) {
                q0Var.onResult(u0Var.a());
            }
            this.f10227b.add(q0Var);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized w0<T> d(q0<T> q0Var) {
        try {
            u0<T> u0Var = this.f10229d;
            if (u0Var != null && u0Var.b() != null) {
                q0Var.onResult(u0Var.b());
            }
            this.f10226a.add(q0Var);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public final synchronized void e(Throwable th2) {
        ArrayList arrayList = new ArrayList(this.f10227b);
        if (arrayList.isEmpty()) {
            j1.f.f("Lottie encountered an error but no failure listener was added:", th2);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((q0) it.next()).onResult(th2);
        }
    }

    public final void f() {
        this.f10228c.post(new Runnable() { // from class: com.airbnb.lottie.v0
            @Override // java.lang.Runnable
            public final void run() {
                w0.a(w0.this);
            }
        });
    }

    public final synchronized void g(T t11) {
        Iterator it = new ArrayList(this.f10226a).iterator();
        while (it.hasNext()) {
            ((q0) it.next()).onResult(t11);
        }
    }

    public synchronized w0<T> h(q0<Throwable> q0Var) {
        this.f10227b.remove(q0Var);
        return this;
    }

    public synchronized w0<T> i(q0<T> q0Var) {
        this.f10226a.remove(q0Var);
        return this;
    }

    public final void j(@Nullable u0<T> u0Var) {
        if (this.f10229d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f10229d = u0Var;
        f();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public w0(Callable<u0<T>> callable, boolean z11) {
        this.f10226a = new LinkedHashSet(1);
        this.f10227b = new LinkedHashSet(1);
        this.f10228c = new Handler(Looper.getMainLooper());
        this.f10229d = null;
        if (!z11) {
            f10225e.execute(new a(callable));
            return;
        }
        try {
            j(callable.call());
        } catch (Throwable th2) {
            j(new u0<>(th2));
        }
    }
}
