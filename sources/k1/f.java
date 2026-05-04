package k1;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class f<T> extends j<T> {

    /* renamed from: d, reason: collision with root package name */
    public final T f64899d;

    /* renamed from: e, reason: collision with root package name */
    public final T f64900e;

    /* renamed from: f, reason: collision with root package name */
    public final Interpolator f64901f;

    public f(T t11, T t12) {
        this(t11, t12, new LinearInterpolator());
    }

    @Override // k1.j
    public T a(b<T> bVar) {
        return e(this.f64899d, this.f64900e, this.f64901f.getInterpolation(bVar.e()));
    }

    public abstract T e(T t11, T t12, float f11);

    public f(T t11, T t12, Interpolator interpolator) {
        this.f64899d = t11;
        this.f64900e = t12;
        this.f64901f = interpolator;
    }
}
