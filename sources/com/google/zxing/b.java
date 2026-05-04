package com.google.zxing;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final a f35054a;

    /* renamed from: b, reason: collision with root package name */
    public kp.b f35055b;

    public b(a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("Binarizer must be non-null.");
        }
        this.f35054a = aVar;
    }

    public b a(int i11, int i12, int i13, int i14) {
        return new b(this.f35054a.a(this.f35054a.e().a(i11, i12, i13, i14)));
    }

    public kp.b b() throws NotFoundException {
        if (this.f35055b == null) {
            this.f35055b = this.f35054a.b();
        }
        return this.f35055b;
    }

    public kp.a c(int i11, kp.a aVar) throws NotFoundException {
        return this.f35054a.c(i11, aVar);
    }

    public int d() {
        return this.f35054a.d();
    }

    public int e() {
        return this.f35054a.f();
    }

    public boolean f() {
        return this.f35054a.e().g();
    }

    public boolean g() {
        return this.f35054a.e().h();
    }

    public b h() {
        return new b(this.f35054a.a(this.f35054a.e().i()));
    }

    public b i() {
        return new b(this.f35054a.a(this.f35054a.e().j()));
    }

    public String toString() {
        try {
            return b().toString();
        } catch (NotFoundException unused) {
            return "";
        }
    }
}
