package bc0;

import androidx.camera.view.q;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import rx.internal.schedulers.j;
import rx.internal.schedulers.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReference<c> f6736d = new AtomicReference<>();

    /* renamed from: a, reason: collision with root package name */
    public final rx.d f6737a;

    /* renamed from: b, reason: collision with root package name */
    public final rx.d f6738b;

    /* renamed from: c, reason: collision with root package name */
    public final rx.d f6739c;

    public c() {
        ac0.g f11 = ac0.f.c().f();
        rx.d g11 = f11.g();
        if (g11 != null) {
            this.f6737a = g11;
        } else {
            this.f6737a = ac0.g.a();
        }
        rx.d i11 = f11.i();
        if (i11 != null) {
            this.f6738b = i11;
        } else {
            this.f6738b = ac0.g.c();
        }
        rx.d j11 = f11.j();
        if (j11 != null) {
            this.f6739c = j11;
        } else {
            this.f6739c = ac0.g.e();
        }
    }

    public static rx.d a() {
        return ac0.c.E(c().f6737a);
    }

    public static rx.d b(Executor executor) {
        return new rx.internal.schedulers.c(executor);
    }

    public static c c() {
        while (true) {
            AtomicReference<c> atomicReference = f6736d;
            c cVar = atomicReference.get();
            if (cVar != null) {
                return cVar;
            }
            c cVar2 = new c();
            if (q.a(atomicReference, null, cVar2)) {
                return cVar2;
            }
            cVar2.i();
        }
    }

    public static rx.d d() {
        return rx.internal.schedulers.f.f86581a;
    }

    public static rx.d e() {
        return ac0.c.J(c().f6738b);
    }

    public static rx.d f() {
        return ac0.c.K(c().f6739c);
    }

    public static void g() {
        c andSet = f6736d.getAndSet(null);
        if (andSet != null) {
            andSet.i();
        }
    }

    public static void h() {
        c c11 = c();
        c11.i();
        synchronized (c11) {
            rx.internal.schedulers.d.f86575d.shutdown();
        }
    }

    public static void j() {
        c c11 = c();
        c11.k();
        synchronized (c11) {
            rx.internal.schedulers.d.f86575d.start();
        }
    }

    public static d l() {
        return new d();
    }

    public static rx.d m() {
        return m.f86629a;
    }

    public synchronized void i() {
        try {
            Object obj = this.f6737a;
            if (obj instanceof j) {
                ((j) obj).shutdown();
            }
            Object obj2 = this.f6738b;
            if (obj2 instanceof j) {
                ((j) obj2).shutdown();
            }
            Object obj3 = this.f6739c;
            if (obj3 instanceof j) {
                ((j) obj3).shutdown();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void k() {
        try {
            Object obj = this.f6737a;
            if (obj instanceof j) {
                ((j) obj).start();
            }
            Object obj2 = this.f6738b;
            if (obj2 instanceof j) {
                ((j) obj2).start();
            }
            Object obj3 = this.f6739c;
            if (obj3 instanceof j) {
                ((j) obj3).start();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
