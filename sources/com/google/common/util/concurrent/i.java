package com.google.common.util.concurrent;

import com.google.common.util.concurrent.Service;
import com.google.common.util.concurrent.i;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@l0
/* loaded from: classes7.dex */
public abstract class i implements Service {

    /* renamed from: a, reason: collision with root package name */
    public final ho.p0<String> f34670a;

    /* renamed from: b, reason: collision with root package name */
    public final Service f34671b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b extends q {
        public b() {
        }

        public static /* synthetic */ void A(b bVar) {
            bVar.getClass();
            try {
                i.this.o();
                bVar.v();
            } catch (Throwable th2) {
                b2.b(th2);
                bVar.u(th2);
            }
        }

        public static /* synthetic */ void z(b bVar) {
            bVar.getClass();
            try {
                i.this.n();
                bVar.w();
            } catch (Throwable th2) {
                b2.b(th2);
                bVar.u(th2);
            }
        }

        @Override // com.google.common.util.concurrent.q
        public final void n() {
            w1.q(i.this.l(), i.this.f34670a).execute(new Runnable() { // from class: com.google.common.util.concurrent.k
                @Override // java.lang.Runnable
                public final void run() {
                    i.b.A(i.b.this);
                }
            });
        }

        @Override // com.google.common.util.concurrent.q
        public final void o() {
            w1.q(i.this.l(), i.this.f34670a).execute(new Runnable() { // from class: com.google.common.util.concurrent.j
                @Override // java.lang.Runnable
                public final void run() {
                    i.b.z(i.b.this);
                }
            });
        }

        @Override // com.google.common.util.concurrent.q
        public String toString() {
            return i.this.toString();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class c implements ho.p0<String> {
        public c() {
        }

        @Override // ho.p0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String get() {
            return i.this.m() + " " + i.this.h();
        }
    }

    public i() {
        this.f34670a = new c();
        this.f34671b = new b();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void a(Service.a listener, Executor executor) {
        this.f34671b.a(listener, executor);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void b(long timeout, TimeUnit unit) throws TimeoutException {
        this.f34671b.b(timeout, unit);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void c(long timeout, TimeUnit unit) throws TimeoutException {
        this.f34671b.c(timeout, unit);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void d() {
        this.f34671b.d();
    }

    @Override // com.google.common.util.concurrent.Service
    public final Throwable e() {
        return this.f34671b.e();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void f() {
        this.f34671b.f();
    }

    @Override // com.google.common.util.concurrent.Service
    @uo.a
    public final Service g() {
        this.f34671b.g();
        return this;
    }

    @Override // com.google.common.util.concurrent.Service
    public final Service.State h() {
        return this.f34671b.h();
    }

    @Override // com.google.common.util.concurrent.Service
    @uo.a
    public final Service i() {
        this.f34671b.i();
        return this;
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
        return this.f34671b.isRunning();
    }

    public Executor l() {
        return new Executor() { // from class: com.google.common.util.concurrent.h
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                w1.n(i.this.f34670a.get(), runnable).start();
            }
        };
    }

    public String m() {
        return getClass().getSimpleName();
    }

    public abstract void n() throws Exception;

    public abstract void o() throws Exception;

    public String toString() {
        return m() + " [" + h() + "]";
    }
}
