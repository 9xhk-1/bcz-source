package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.n1;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@l0
/* loaded from: classes7.dex */
public final class n1 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<V> extends w0<V> implements p1<V> {

        /* renamed from: e, reason: collision with root package name */
        public static final ThreadFactory f34755e;

        /* renamed from: f, reason: collision with root package name */
        public static final Executor f34756f;

        /* renamed from: a, reason: collision with root package name */
        public final Executor f34757a;

        /* renamed from: b, reason: collision with root package name */
        public final m0 f34758b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicBoolean f34759c;

        /* renamed from: d, reason: collision with root package name */
        public final Future<V> f34760d;

        static {
            ThreadFactory b11 = new t2().e(true).f("ListenableFutureAdapter-thread-%d").b();
            f34755e = b11;
            f34756f = Executors.newCachedThreadPool(b11);
        }

        public a(Future<V> delegate) {
            this(delegate, f34756f);
        }

        public static /* synthetic */ void x(a aVar) {
            aVar.getClass();
            try {
                y2.f(aVar.f34760d);
            } catch (Throwable unused) {
            }
            aVar.f34758b.b();
        }

        @Override // com.google.common.util.concurrent.p1
        public void addListener(Runnable listener, Executor exec) {
            this.f34758b.a(listener, exec);
            if (this.f34759c.compareAndSet(false, true)) {
                if (this.f34760d.isDone()) {
                    this.f34758b.b();
                } else {
                    this.f34757a.execute(new Runnable() { // from class: com.google.common.util.concurrent.m1
                        @Override // java.lang.Runnable
                        public final void run() {
                            n1.a.x(n1.a.this);
                        }
                    });
                }
            }
        }

        @Override // com.google.common.util.concurrent.w0, com.google.common.collect.c5
        /* renamed from: w */
        public Future<V> delegate() {
            return this.f34760d;
        }

        public a(Future<V> delegate, Executor adapterExecutor) {
            this.f34758b = new m0();
            this.f34759c = new AtomicBoolean(false);
            this.f34760d = (Future) Preconditions.checkNotNull(delegate);
            this.f34757a = (Executor) Preconditions.checkNotNull(adapterExecutor);
        }
    }

    public static <V> p1<V> a(Future<V> future) {
        return future instanceof p1 ? (p1) future : new a(future);
    }

    public static <V> p1<V> b(Future<V> future, Executor executor) {
        Preconditions.checkNotNull(executor);
        return future instanceof p1 ? (p1) future : new a(future, executor);
    }
}
