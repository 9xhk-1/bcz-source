package im;

import com.github.mikephil.charting.components.YAxis;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public float f60699a;

    /* renamed from: b, reason: collision with root package name */
    public float f60700b;

    /* renamed from: c, reason: collision with root package name */
    public float f60701c;

    /* renamed from: d, reason: collision with root package name */
    public float f60702d;

    /* renamed from: e, reason: collision with root package name */
    public int f60703e;

    /* renamed from: f, reason: collision with root package name */
    public int f60704f;

    /* renamed from: g, reason: collision with root package name */
    public int f60705g;

    /* renamed from: h, reason: collision with root package name */
    public YAxis.AxisDependency f60706h;

    /* renamed from: i, reason: collision with root package name */
    public float f60707i;

    /* renamed from: j, reason: collision with root package name */
    public float f60708j;

    public d(float f11, float f12, int i11) {
        this.f60703e = -1;
        this.f60705g = -1;
        this.f60699a = f11;
        this.f60700b = f12;
        this.f60704f = i11;
    }

    public boolean a(d dVar) {
        return dVar != null && this.f60704f == dVar.f60704f && this.f60699a == dVar.f60699a && this.f60705g == dVar.f60705g && this.f60703e == dVar.f60703e;
    }

    public YAxis.AxisDependency b() {
        return this.f60706h;
    }

    public int c() {
        return this.f60703e;
    }

    public int d() {
        return this.f60704f;
    }

    public float e() {
        return this.f60707i;
    }

    public float f() {
        return this.f60708j;
    }

    public int g() {
        return this.f60705g;
    }

    public float h() {
        return this.f60699a;
    }

    public float i() {
        return this.f60701c;
    }

    public float j() {
        return this.f60700b;
    }

    public float k() {
        return this.f60702d;
    }

    public boolean l() {
        return this.f60705g >= 0;
    }

    public void m(int i11) {
        this.f60703e = i11;
    }

    public void n(float f11, float f12) {
        this.f60707i = f11;
        this.f60708j = f12;
    }

    public String toString() {
        return "Highlight, x: " + this.f60699a + ", y: " + this.f60700b + ", dataSetIndex: " + this.f60704f + ", stackIndex (only stacked barentry): " + this.f60705g;
    }

    public d(float f11, int i11, int i12) {
        this(f11, Float.NaN, i11);
        this.f60705g = i12;
    }

    public d(float f11, float f12, float f13, float f14, int i11, YAxis.AxisDependency axisDependency) {
        this.f60703e = -1;
        this.f60705g = -1;
        this.f60699a = f11;
        this.f60700b = f12;
        this.f60701c = f13;
        this.f60702d = f14;
        this.f60704f = i11;
        this.f60706h = axisDependency;
    }

    public d(float f11, float f12, float f13, float f14, int i11, int i12, YAxis.AxisDependency axisDependency) {
        this(f11, f12, f13, f14, i11, axisDependency);
        this.f60705g = i12;
    }
}
