package k1;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a<T> {

    /* renamed from: q, reason: collision with root package name */
    public static final float f64873q = -3987645.8f;

    /* renamed from: r, reason: collision with root package name */
    public static final int f64874r = 784923401;

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public final com.airbnb.lottie.k f64875a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public final T f64876b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public T f64877c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public final Interpolator f64878d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public final Interpolator f64879e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public final Interpolator f64880f;

    /* renamed from: g, reason: collision with root package name */
    public final float f64881g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public Float f64882h;

    /* renamed from: i, reason: collision with root package name */
    public float f64883i;

    /* renamed from: j, reason: collision with root package name */
    public float f64884j;

    /* renamed from: k, reason: collision with root package name */
    public int f64885k;

    /* renamed from: l, reason: collision with root package name */
    public int f64886l;

    /* renamed from: m, reason: collision with root package name */
    public float f64887m;

    /* renamed from: n, reason: collision with root package name */
    public float f64888n;

    /* renamed from: o, reason: collision with root package name */
    public PointF f64889o;

    /* renamed from: p, reason: collision with root package name */
    public PointF f64890p;

    public a(com.airbnb.lottie.k kVar, @Nullable T t11, @Nullable T t12, @Nullable Interpolator interpolator, float f11, @Nullable Float f12) {
        this.f64883i = -3987645.8f;
        this.f64884j = -3987645.8f;
        this.f64885k = f64874r;
        this.f64886l = f64874r;
        this.f64887m = Float.MIN_VALUE;
        this.f64888n = Float.MIN_VALUE;
        this.f64889o = null;
        this.f64890p = null;
        this.f64875a = kVar;
        this.f64876b = t11;
        this.f64877c = t12;
        this.f64878d = interpolator;
        this.f64879e = null;
        this.f64880f = null;
        this.f64881g = f11;
        this.f64882h = f12;
    }

    public boolean a(@FloatRange(from = 0.0d, to = 1.0d) float f11) {
        return f11 >= e() && f11 < b();
    }

    public float b() {
        if (this.f64875a == null) {
            return 1.0f;
        }
        if (this.f64888n == Float.MIN_VALUE) {
            if (this.f64882h == null) {
                this.f64888n = 1.0f;
            } else {
                this.f64888n = e() + ((this.f64882h.floatValue() - this.f64881g) / this.f64875a.e());
            }
        }
        return this.f64888n;
    }

    public float c() {
        if (this.f64884j == -3987645.8f) {
            this.f64884j = ((Float) this.f64877c).floatValue();
        }
        return this.f64884j;
    }

    public int d() {
        if (this.f64886l == 784923401) {
            this.f64886l = ((Integer) this.f64877c).intValue();
        }
        return this.f64886l;
    }

    public float e() {
        com.airbnb.lottie.k kVar = this.f64875a;
        if (kVar == null) {
            return 0.0f;
        }
        if (this.f64887m == Float.MIN_VALUE) {
            this.f64887m = (this.f64881g - kVar.r()) / this.f64875a.e();
        }
        return this.f64887m;
    }

    public float f() {
        if (this.f64883i == -3987645.8f) {
            this.f64883i = ((Float) this.f64876b).floatValue();
        }
        return this.f64883i;
    }

    public int g() {
        if (this.f64885k == 784923401) {
            this.f64885k = ((Integer) this.f64876b).intValue();
        }
        return this.f64885k;
    }

    public boolean h() {
        return this.f64878d == null && this.f64879e == null && this.f64880f == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f64876b + ", endValue=" + this.f64877c + ", startFrame=" + this.f64881g + ", endFrame=" + this.f64882h + ", interpolator=" + this.f64878d + l50.b.f69928j;
    }

    public a(com.airbnb.lottie.k kVar, @Nullable T t11, @Nullable T t12, @Nullable Interpolator interpolator, @Nullable Interpolator interpolator2, float f11, @Nullable Float f12) {
        this.f64883i = -3987645.8f;
        this.f64884j = -3987645.8f;
        this.f64885k = f64874r;
        this.f64886l = f64874r;
        this.f64887m = Float.MIN_VALUE;
        this.f64888n = Float.MIN_VALUE;
        this.f64889o = null;
        this.f64890p = null;
        this.f64875a = kVar;
        this.f64876b = t11;
        this.f64877c = t12;
        this.f64878d = null;
        this.f64879e = interpolator;
        this.f64880f = interpolator2;
        this.f64881g = f11;
        this.f64882h = f12;
    }

    public a(com.airbnb.lottie.k kVar, @Nullable T t11, @Nullable T t12, @Nullable Interpolator interpolator, @Nullable Interpolator interpolator2, @Nullable Interpolator interpolator3, float f11, @Nullable Float f12) {
        this.f64883i = -3987645.8f;
        this.f64884j = -3987645.8f;
        this.f64885k = f64874r;
        this.f64886l = f64874r;
        this.f64887m = Float.MIN_VALUE;
        this.f64888n = Float.MIN_VALUE;
        this.f64889o = null;
        this.f64890p = null;
        this.f64875a = kVar;
        this.f64876b = t11;
        this.f64877c = t12;
        this.f64878d = interpolator;
        this.f64879e = interpolator2;
        this.f64880f = interpolator3;
        this.f64881g = f11;
        this.f64882h = f12;
    }

    public a(T t11) {
        this.f64883i = -3987645.8f;
        this.f64884j = -3987645.8f;
        this.f64885k = f64874r;
        this.f64886l = f64874r;
        this.f64887m = Float.MIN_VALUE;
        this.f64888n = Float.MIN_VALUE;
        this.f64889o = null;
        this.f64890p = null;
        this.f64875a = null;
        this.f64876b = t11;
        this.f64877c = t11;
        this.f64878d = null;
        this.f64879e = null;
        this.f64880f = null;
        this.f64881g = Float.MIN_VALUE;
        this.f64882h = Float.valueOf(Float.MAX_VALUE);
    }
}
