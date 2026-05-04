package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.q0;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l0
@go.b
/* loaded from: classes7.dex */
public class w2<V> extends q0.a<V> implements RunnableFuture<V> {

    /* renamed from: i, reason: collision with root package name */
    @CheckForNull
    public volatile l1<?> f34904i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a extends l1<p1<V>> {

        /* renamed from: d, reason: collision with root package name */
        public final w<V> f34905d;

        public a(w<V> callable) {
            this.f34905d = (w) Preconditions.checkNotNull(callable);
        }

        @Override // com.google.common.util.concurrent.l1
        public void a(Throwable error) {
            w2.this.C(error);
        }

        @Override // com.google.common.util.concurrent.l1
        public final boolean d() {
            return w2.this.isDone();
        }

        @Override // com.google.common.util.concurrent.l1
        public String f() {
            return this.f34905d.toString();
        }

        @Override // com.google.common.util.concurrent.l1
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void b(p1<V> result) {
            w2.this.D(result);
        }

        @Override // com.google.common.util.concurrent.l1
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public p1<V> e() throws Exception {
            return (p1) Preconditions.checkNotNull(this.f34905d.call(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.f34905d);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b extends l1<V> {

        /* renamed from: d, reason: collision with root package name */
        public final Callable<V> f34907d;

        public b(Callable<V> callable) {
            this.f34907d = (Callable) Preconditions.checkNotNull(callable);
        }

        @Override // com.google.common.util.concurrent.l1
        public void a(Throwable error) {
            w2.this.C(error);
        }

        @Override // com.google.common.util.concurrent.l1
        public void b(@z1 V result) {
            w2.this.B(result);
        }

        @Override // com.google.common.util.concurrent.l1
        public final boolean d() {
            return w2.this.isDone();
        }

        @Override // com.google.common.util.concurrent.l1
        @z1
        public V e() throws Exception {
            return this.f34907d.call();
        }

        @Override // com.google.common.util.concurrent.l1
        public String f() {
            return this.f34907d.toString();
        }
    }

    public w2(Callable<V> callable) {
        this.f34904i = new b(callable);
    }

    public static <V> w2<V> N(w<V> callable) {
        return new w2<>(callable);
    }

    public static <V> w2<V> O(Runnable runnable, @z1 V result) {
        return new w2<>(Executors.callable(runnable, result));
    }

    public static <V> w2<V> P(Callable<V> callable) {
        return new w2<>(callable);
    }

    @Override // com.google.common.util.concurrent.f
    public void m() {
        l1<?> l1Var;
        super.m();
        if (E() && (l1Var = this.f34904i) != null) {
            l1Var.c();
        }
        this.f34904i = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        l1<?> l1Var = this.f34904i;
        if (l1Var != null) {
            l1Var.run();
        }
        this.f34904i = null;
    }

    @Override // com.google.common.util.concurrent.f
    @CheckForNull
    public String y() {
        l1<?> l1Var = this.f34904i;
        if (l1Var == null) {
            return super.y();
        }
        return "task=[" + l1Var + "]";
    }

    public w2(w<V> callable) {
        this.f34904i = new a(callable);
    }
}
