package k1;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class e extends f<PointF> {

    /* renamed from: g, reason: collision with root package name */
    public final PointF f64898g;

    public e(PointF pointF, PointF pointF2) {
        super(pointF, pointF2);
        this.f64898g = new PointF();
    }

    @Override // k1.f, k1.j
    public /* bridge */ /* synthetic */ Object a(b bVar) {
        return super.a(bVar);
    }

    @Override // k1.f
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public PointF e(PointF pointF, PointF pointF2, float f11) {
        this.f64898g.set(j1.i.k(pointF.x, pointF2.x, f11), j1.i.k(pointF.y, pointF2.y, f11));
        return this.f64898g;
    }

    public e(PointF pointF, PointF pointF2, Interpolator interpolator) {
        super(pointF, pointF2, interpolator);
        this.f64898g = new PointF();
    }
}
