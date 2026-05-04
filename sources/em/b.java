package em;

import android.graphics.Typeface;
import rm.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f49900a = true;

    /* renamed from: b, reason: collision with root package name */
    public float f49901b = 5.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f49902c = 5.0f;

    /* renamed from: d, reason: collision with root package name */
    public Typeface f49903d = null;

    /* renamed from: e, reason: collision with root package name */
    public float f49904e = k.e(10.0f);

    /* renamed from: f, reason: collision with root package name */
    public int f49905f = -16777216;

    public int a() {
        return this.f49905f;
    }

    public float b() {
        return this.f49904e;
    }

    public Typeface c() {
        return this.f49903d;
    }

    public float d() {
        return this.f49901b;
    }

    public float e() {
        return this.f49902c;
    }

    public boolean f() {
        return this.f49900a;
    }

    public void g(boolean z11) {
        this.f49900a = z11;
    }

    public void h(int i11) {
        this.f49905f = i11;
    }

    public void i(float f11) {
        if (f11 > 24.0f) {
            f11 = 24.0f;
        }
        if (f11 < 6.0f) {
            f11 = 6.0f;
        }
        this.f49904e = k.e(f11);
    }

    public void j(Typeface typeface) {
        this.f49903d = typeface;
    }

    public void k(float f11) {
        this.f49901b = k.e(f11);
    }

    public void l(float f11) {
        this.f49902c = k.e(f11);
    }
}
