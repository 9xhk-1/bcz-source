package tz;

import android.content.Intent;
import android.net.Uri;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public class y {

    /* renamed from: c, reason: collision with root package name */
    public static volatile y f91409c;

    /* renamed from: a, reason: collision with root package name */
    public final q0 f91410a;

    /* renamed from: b, reason: collision with root package name */
    public final g1 f91411b;

    public y() {
        q0 q0Var = new q0(m0.a().h());
        this.f91410a = q0Var;
        this.f91411b = new g1(q0Var);
    }

    public static y b() {
        if (f91409c == null) {
            synchronized (y.class) {
                try {
                    if (f91409c == null) {
                        f91409c = new y();
                    }
                } finally {
                }
            }
        }
        return f91409c;
    }

    public final o a(WeakReference weakReference) {
        boolean booleanValue = m0.a().m().booleanValue();
        o b11 = o.b(m0.a().n());
        boolean z11 = b11 == null || b11.i() == 0;
        if (booleanValue && z11) {
            System.currentTimeMillis();
            p0 j11 = this.f91410a.b().j(m0.a().j());
            if (j11 == p0.f91349c || j11 == p0.f91351e || j11 == p0.f91353g) {
                this.f91410a.f().e(weakReference);
                o i11 = this.f91410a.f().i();
                System.currentTimeMillis();
                return i11;
            }
        }
        return b11;
    }

    public void c(Intent intent, sl.e eVar) {
        d(intent.getData(), eVar);
    }

    public final void d(Uri uri, sl.e eVar) {
        if (j0.f91313a) {
            j0.a("decodeWakeUp", new Object[0]);
        }
        System.currentTimeMillis();
        this.f91410a.i().execute(new io.openinstall.sdk.e(this.f91410a, uri, eVar));
        System.currentTimeMillis();
    }

    public void e(Boolean bool, int i11, sl.b bVar) {
        if (j0.f91313a) {
            j0.a("getInstallData", new Object[0]);
        }
        System.currentTimeMillis();
        this.f91410a.i().execute(new io.openinstall.sdk.d(this.f91410a, bool.booleanValue(), i11, bVar));
        System.currentTimeMillis();
    }

    public void f(String str, long j11) {
        if (j0.f91313a) {
            j0.a("reportEffectPoint", new Object[0]);
        }
        this.f91411b.c(str, j11);
    }

    public void g(WeakReference weakReference, long j11) {
        this.f91410a.h().submit(new io.openinstall.sdk.g(this.f91410a, a(weakReference)));
        System.currentTimeMillis();
    }

    public void h(sl.e eVar) {
        d(null, eVar);
    }

    public void i(sl.f fVar) {
        if (j0.f91313a) {
            j0.a("getOriginalApk", new Object[0]);
        }
        System.currentTimeMillis();
        this.f91410a.i().execute(new d0(fVar));
        System.currentTimeMillis();
    }

    public void j() {
        if (j0.f91313a) {
            j0.a("reportRegister", new Object[0]);
        }
        this.f91411b.a();
    }
}
