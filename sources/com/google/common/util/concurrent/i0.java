package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.util.concurrent.u;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l0
@go.b
/* loaded from: classes7.dex */
public final class i0<V> extends u<Object, V> {

    /* renamed from: q, reason: collision with root package name */
    @CheckForNull
    @vo.b
    public i0<V>.c<?> f34674q;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a extends i0<V>.c<p1<V>> {

        /* renamed from: f, reason: collision with root package name */
        public final w<V> f34675f;

        public a(w<V> callable, Executor listenerExecutor) {
            super(listenerExecutor);
            this.f34675f = (w) Preconditions.checkNotNull(callable);
        }

        @Override // com.google.common.util.concurrent.l1
        public String f() {
            return this.f34675f.toString();
        }

        @Override // com.google.common.util.concurrent.l1
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public p1<V> e() throws Exception {
            return (p1) Preconditions.checkNotNull(this.f34675f.call(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.f34675f);
        }

        @Override // com.google.common.util.concurrent.i0.c
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(p1<V> value) {
            i0.this.D(value);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b extends i0<V>.c<V> {

        /* renamed from: f, reason: collision with root package name */
        public final Callable<V> f34677f;

        public b(Callable<V> callable, Executor listenerExecutor) {
            super(listenerExecutor);
            this.f34677f = (Callable) Preconditions.checkNotNull(callable);
        }

        @Override // com.google.common.util.concurrent.l1
        @z1
        public V e() throws Exception {
            return this.f34677f.call();
        }

        @Override // com.google.common.util.concurrent.l1
        public String f() {
            return this.f34677f.toString();
        }

        @Override // com.google.common.util.concurrent.i0.c
        public void i(@z1 V value) {
            i0.this.B(value);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public abstract class c<T> extends l1<T> {

        /* renamed from: d, reason: collision with root package name */
        public final Executor f34679d;

        public c(Executor listenerExecutor) {
            this.f34679d = (Executor) Preconditions.checkNotNull(listenerExecutor);
        }

        @Override // com.google.common.util.concurrent.l1
        public final void a(Throwable error) {
            i0.this.f34674q = null;
            if (error instanceof ExecutionException) {
                i0.this.C(((ExecutionException) error).getCause());
            } else if (error instanceof CancellationException) {
                i0.this.cancel(false);
            } else {
                i0.this.C(error);
            }
        }

        @Override // com.google.common.util.concurrent.l1
        public final void b(@z1 T result) {
            i0.this.f34674q = null;
            i(result);
        }

        @Override // com.google.common.util.concurrent.l1
        public final boolean d() {
            return i0.this.isDone();
        }

        public final void h() {
            try {
                this.f34679d.execute(this);
            } catch (RejectedExecutionException e11) {
                i0.this.C(e11);
            }
        }

        public abstract void i(@z1 T value);
    }

    public i0(ImmutableCollection<? extends p1<?>> futures, boolean allMustSucceed, Executor listenerExecutor, w<V> callable) {
        super(futures, allMustSucceed, false);
        this.f34674q = new a(callable, listenerExecutor);
        U();
    }

    @Override // com.google.common.util.concurrent.u
    public void S() {
        i0<V>.c<?> cVar = this.f34674q;
        if (cVar != null) {
            cVar.h();
        }
    }

    @Override // com.google.common.util.concurrent.u
    public void Y(u.a reason) {
        super.Y(reason);
        if (reason == u.a.OUTPUT_FUTURE_DONE) {
            this.f34674q = null;
        }
    }

    @Override // com.google.common.util.concurrent.f
    public void w() {
        i0<V>.c<?> cVar = this.f34674q;
        if (cVar != null) {
            cVar.c();
        }
    }

    public i0(ImmutableCollection<? extends p1<?>> futures, boolean allMustSucceed, Executor listenerExecutor, Callable<V> callable) {
        super(futures, allMustSucceed, false);
        this.f34674q = new b(callable, listenerExecutor);
        U();
    }

    @Override // com.google.common.util.concurrent.u
    public void P(int index, @CheckForNull Object returnValue) {
    }
}
