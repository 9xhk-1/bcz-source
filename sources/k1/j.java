package k1;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class j<T> {

    /* renamed from: a, reason: collision with root package name */
    public final b<T> f64903a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public z0.a<?, ?> f64904b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public T f64905c;

    public j() {
        this.f64903a = new b<>();
        this.f64905c = null;
    }

    @Nullable
    public T a(b<T> bVar) {
        return this.f64905c;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final T b(float f11, float f12, T t11, T t12, float f13, float f14, float f15) {
        return a(this.f64903a.h(f11, f12, t11, t12, f13, f14, f15));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void c(@Nullable z0.a<?, ?> aVar) {
        this.f64904b = aVar;
    }

    public final void d(@Nullable T t11) {
        this.f64905c = t11;
        z0.a<?, ?> aVar = this.f64904b;
        if (aVar != null) {
            aVar.k();
        }
    }

    public j(@Nullable T t11) {
        this.f64903a = new b<>();
        this.f64905c = t11;
    }
}
