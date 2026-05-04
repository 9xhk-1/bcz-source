package c1;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final PointF f7448a;

    /* renamed from: b, reason: collision with root package name */
    public final PointF f7449b;

    /* renamed from: c, reason: collision with root package name */
    public final PointF f7450c;

    public a() {
        this.f7448a = new PointF();
        this.f7449b = new PointF();
        this.f7450c = new PointF();
    }

    public PointF a() {
        return this.f7448a;
    }

    public PointF b() {
        return this.f7449b;
    }

    public PointF c() {
        return this.f7450c;
    }

    public void d(float f11, float f12) {
        this.f7448a.set(f11, f12);
    }

    public void e(float f11, float f12) {
        this.f7449b.set(f11, f12);
    }

    public void f(a aVar) {
        PointF pointF = aVar.f7450c;
        g(pointF.x, pointF.y);
        PointF pointF2 = aVar.f7448a;
        d(pointF2.x, pointF2.y);
        PointF pointF3 = aVar.f7449b;
        e(pointF3.x, pointF3.y);
    }

    public void g(float f11, float f12) {
        this.f7450c.set(f11, f12);
    }

    @NonNull
    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.f7450c.x), Float.valueOf(this.f7450c.y), Float.valueOf(this.f7448a.x), Float.valueOf(this.f7448a.y), Float.valueOf(this.f7449b.x), Float.valueOf(this.f7449b.y));
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f7448a = pointF;
        this.f7449b = pointF2;
        this.f7450c = pointF3;
    }
}
