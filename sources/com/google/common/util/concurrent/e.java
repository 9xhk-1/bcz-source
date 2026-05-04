package com.google.common.util.concurrent;

import com.google.common.util.concurrent.Service;
import com.google.common.util.concurrent.e;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@l0
/* loaded from: classes7.dex */
public abstract class e implements Service {

    /* renamed from: b, reason: collision with root package name */
    public static final o1 f34513b = new o1(e.class);

    /* renamed from: a, reason: collision with root package name */
    public final Service f34514a = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends q {
        public a() {
        }

        public static /* synthetic */ void A(a aVar) {
            aVar.getClass();
            try {
                e.this.p();
                aVar.v();
                if (aVar.isRunning()) {
                    try {
                        e.this.m();
                    } catch (Throwable th2) {
                        b2.b(th2);
                        try {
                            e.this.o();
                        } catch (Exception e11) {
                            b2.b(e11);
                            e.f34513b.a().log(Level.WARNING, "Error while attempting to shut down the service after failure.", (Throwable) e11);
                        }
                        aVar.u(th2);
                        return;
                    }
                }
                e.this.o();
                aVar.w();
            } catch (Throwable th3) {
                b2.b(th3);
                aVar.u(th3);
            }
        }

        @Override // com.google.common.util.concurrent.q
        public final void n() {
            w1.q(e.this.l(), new ho.p0() { // from class: com.google.common.util.concurrent.c
                @Override // ho.p0
                public final Object get() {
                    String n11;
                    n11 = e.this.n();
                    return n11;
                }
            }).execute(new Runnable() { // from class: com.google.common.util.concurrent.d
                @Override // java.lang.Runnable
                public final void run() {
                    e.a.A(e.a.this);
                }
            });
        }

        @Override // com.google.common.util.concurrent.q
        public void o() {
            e.this.q();
        }

        @Override // com.google.common.util.concurrent.q
        public String toString() {
            return e.this.toString();
        }
    }

    @Override // com.google.common.util.concurrent.Service
    public final void a(Service.a listener, Executor executor) {
        this.f34514a.a(listener, executor);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void b(long timeout, TimeUnit unit) throws TimeoutException {
        this.f34514a.b(timeout, unit);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void c(long timeout, TimeUnit unit) throws TimeoutException {
        this.f34514a.c(timeout, unit);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void d() {
        this.f34514a.d();
    }

    @Override // com.google.common.util.concurrent.Service
    public final Throwable e() {
        return this.f34514a.e();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void f() {
        this.f34514a.f();
    }

    @Override // com.google.common.util.concurrent.Service
    @uo.a
    public final Service g() {
        this.f34514a.g();
        return this;
    }

    @Override // com.google.common.util.concurrent.Service
    public final Service.State h() {
        return this.f34514a.h();
    }

    @Override // com.google.common.util.concurrent.Service
    @uo.a
    public final Service i() {
        this.f34514a.i();
        return this;
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
        return this.f34514a.isRunning();
    }

    public Executor l() {
        return new Executor() { // from class: com.google.common.util.concurrent.b
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                w1.n(e.this.n(), runnable).start();
            }
        };
    }

    public abstract void m() throws Exception;

    public String n() {
        return getClass().getSimpleName();
    }

    public String toString() {
        return n() + " [" + h() + "]";
    }

    public void o() throws Exception {
    }

    public void p() throws Exception {
    }

    public void q() {
    }
}
