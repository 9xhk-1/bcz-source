package z2;

import a3.d0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c implements k {

    /* renamed from: a, reason: collision with root package name */
    @d0
    public String f100647a;

    /* renamed from: b, reason: collision with root package name */
    public float f100648b;

    /* renamed from: c, reason: collision with root package name */
    public float f100649c;

    /* renamed from: d, reason: collision with root package name */
    public float f100650d;

    /* renamed from: e, reason: collision with root package name */
    public float f100651e;

    /* renamed from: f, reason: collision with root package name */
    public float f100652f;

    /* renamed from: g, reason: collision with root package name */
    public float f100653g;

    public c() {
    }

    @Override // z2.k
    public float b() {
        return this.f100652f;
    }

    @d0
    public String c() {
        return this.f100647a;
    }

    public void d(float f11, float f12) {
        x(f11);
        v(f12);
    }

    public void e(@d0 String str) {
        this.f100647a = str;
    }

    public void f(float f11, float f12, float f13, float f14) {
        t(f11);
        p(f12);
        r(f13);
        q(f14);
    }

    @Override // z2.k
    public float o() {
        return this.f100653g;
    }

    @Override // z2.k
    public void p(float f11) {
        this.f100648b = f11;
    }

    @Override // z2.k
    public void q(float f11) {
        this.f100649c = f11;
    }

    @Override // z2.k
    public void r(float f11) {
        this.f100651e = f11;
    }

    @Override // z2.k
    public float s() {
        return this.f100651e;
    }

    @Override // z2.k
    public void t(float f11) {
        this.f100650d = f11;
    }

    @d0
    public String toString() {
        String str = this.f100647a;
        return str == null ? g3.c.t(getClass()) : str;
    }

    @Override // z2.k
    public float u() {
        return this.f100649c;
    }

    @Override // z2.k
    public void v(float f11) {
        this.f100653g = f11;
    }

    @Override // z2.k
    public float w() {
        return this.f100650d;
    }

    @Override // z2.k
    public void x(float f11) {
        this.f100652f = f11;
    }

    @Override // z2.k
    public float z() {
        return this.f100648b;
    }

    public c(k kVar) {
        if (kVar instanceof c) {
            this.f100647a = ((c) kVar).c();
        }
        this.f100648b = kVar.z();
        this.f100649c = kVar.u();
        this.f100650d = kVar.w();
        this.f100651e = kVar.s();
        this.f100652f = kVar.b();
        this.f100653g = kVar.o();
    }

    @Override // z2.k
    public void y(w1.a aVar, float f11, float f12, float f13, float f14) {
    }
}
