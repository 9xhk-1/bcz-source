package jl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f64313a;

    /* renamed from: b, reason: collision with root package name */
    public int f64314b;

    /* renamed from: c, reason: collision with root package name */
    public float f64315c;

    /* renamed from: d, reason: collision with root package name */
    public String f64316d;

    /* renamed from: e, reason: collision with root package name */
    public String f64317e;

    /* renamed from: f, reason: collision with root package name */
    public float f64318f;

    /* renamed from: g, reason: collision with root package name */
    public float f64319g;

    public d(String str) {
        if (str == null) {
            throw new IllegalArgumentException("name cannot be null.");
        }
        this.f64313a = str;
    }

    public String a() {
        return this.f64317e;
    }

    public float b() {
        return this.f64319g;
    }

    public float c() {
        return this.f64315c;
    }

    public int d() {
        return this.f64314b;
    }

    public String e() {
        return this.f64313a;
    }

    public String f() {
        return this.f64316d;
    }

    public float g() {
        return this.f64318f;
    }

    public void h(String str) {
        if (str == null) {
            throw new IllegalArgumentException("audioPath cannot be null.");
        }
        this.f64317e = str;
    }

    public void i(float f11) {
        this.f64319g = f11;
    }

    public void j(float f11) {
        this.f64315c = f11;
    }

    public void k(int i11) {
        this.f64314b = i11;
    }

    public void l(String str) {
        if (str == null) {
            throw new IllegalArgumentException("stringValue cannot be null.");
        }
        this.f64316d = str;
    }

    public void m(float f11) {
        this.f64318f = f11;
    }

    public String toString() {
        return this.f64313a;
    }
}
