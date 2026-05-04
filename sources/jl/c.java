package jl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final d f64306a;

    /* renamed from: b, reason: collision with root package name */
    public int f64307b;

    /* renamed from: c, reason: collision with root package name */
    public float f64308c;

    /* renamed from: d, reason: collision with root package name */
    public String f64309d;

    /* renamed from: e, reason: collision with root package name */
    public float f64310e;

    /* renamed from: f, reason: collision with root package name */
    public float f64311f;

    /* renamed from: g, reason: collision with root package name */
    public final float f64312g;

    public c(float f11, d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("data cannot be null.");
        }
        this.f64312g = f11;
        this.f64306a = dVar;
    }

    public float a() {
        return this.f64311f;
    }

    public d b() {
        return this.f64306a;
    }

    public float c() {
        return this.f64308c;
    }

    public int d() {
        return this.f64307b;
    }

    public String e() {
        return this.f64309d;
    }

    public float f() {
        return this.f64312g;
    }

    public float g() {
        return this.f64310e;
    }

    public void h(float f11) {
        this.f64311f = f11;
    }

    public void i(float f11) {
        this.f64308c = f11;
    }

    public void j(int i11) {
        this.f64307b = i11;
    }

    public void k(String str) {
        if (str == null) {
            throw new IllegalArgumentException("stringValue cannot be null.");
        }
        this.f64309d = str;
    }

    public void l(float f11) {
        this.f64310e = f11;
    }

    public String toString() {
        return this.f64306a.f64313a;
    }
}
