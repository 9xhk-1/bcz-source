package a3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class h0 {

    /* renamed from: h, reason: collision with root package name */
    public static final float f1536h = 1.0E-9f;

    /* renamed from: a, reason: collision with root package name */
    public long f1537a;

    /* renamed from: b, reason: collision with root package name */
    public long f1538b;

    /* renamed from: c, reason: collision with root package name */
    public final com.badlogic.gdx.math.i f1539c;

    /* renamed from: d, reason: collision with root package name */
    public final com.badlogic.gdx.math.i f1540d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1541e;

    /* renamed from: f, reason: collision with root package name */
    public float f1542f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1543g;

    public h0(String str) {
        this(str, 5);
    }

    public void a() {
        this.f1539c.reset();
        this.f1540d.reset();
        this.f1537a = 0L;
        this.f1538b = 0L;
        this.f1542f = 0.0f;
        this.f1543g = false;
    }

    public void b() {
        this.f1537a = b1.c();
        this.f1543g = false;
    }

    public void c() {
        if (this.f1537a > 0) {
            this.f1542f += (b1.c() - this.f1537a) * 1.0E-9f;
            this.f1537a = 0L;
            this.f1543g = true;
        }
    }

    public void d() {
        long c11 = b1.c();
        if (this.f1538b > 0) {
            e((c11 - r2) * 1.0E-9f);
        }
        this.f1538b = c11;
    }

    public void e(float f11) {
        if (!this.f1543g) {
            q1.g.f81378a.h("PerformanceCounter", "Invalid data, check if you called PerformanceCounter#stop()");
            return;
        }
        this.f1539c.a(this.f1542f);
        float f12 = f11 == 0.0f ? 0.0f : this.f1542f / f11;
        com.badlogic.gdx.math.i iVar = this.f1540d;
        if (f11 <= 1.0f) {
            f12 = (f12 * f11) + ((1.0f - f11) * iVar.f12603f);
        }
        iVar.a(f12);
        this.f1542f = 0.0f;
        this.f1543g = false;
    }

    public y0 f(y0 y0Var) {
        y0Var.O(this.f1541e).O(": [time: ").n(this.f1539c.f12604g).O(", load: ").n(this.f1540d.f12604g).O("]");
        return y0Var;
    }

    public String toString() {
        return f(new y0()).toString();
    }

    public h0(String str, int i11) {
        this.f1537a = 0L;
        this.f1538b = 0L;
        this.f1542f = 0.0f;
        this.f1543g = false;
        this.f1541e = str;
        this.f1539c = new com.badlogic.gdx.math.i(i11);
        this.f1540d = new com.badlogic.gdx.math.i(1);
    }
}
