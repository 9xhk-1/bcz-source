package k1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public float f64906a;

    /* renamed from: b, reason: collision with root package name */
    public float f64907b;

    public k(float f11, float f12) {
        this.f64906a = f11;
        this.f64907b = f12;
    }

    public boolean a(float f11, float f12) {
        return this.f64906a == f11 && this.f64907b == f12;
    }

    public float b() {
        return this.f64906a;
    }

    public float c() {
        return this.f64907b;
    }

    public void d(float f11, float f12) {
        this.f64906a = f11;
        this.f64907b = f12;
    }

    public String toString() {
        return b() + "x" + c();
    }

    public k() {
        this(1.0f, 1.0f);
    }
}
