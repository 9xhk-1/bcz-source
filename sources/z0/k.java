package z0;

import android.graphics.PointF;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class k extends g<PointF> {

    /* renamed from: i, reason: collision with root package name */
    public final PointF f100510i;

    public k(List<k1.a<PointF>> list) {
        super(list);
        this.f100510i = new PointF();
    }

    @Override // z0.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public PointF i(k1.a<PointF> aVar, float f11) {
        return j(aVar, f11, f11, f11);
    }

    @Override // z0.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public PointF j(k1.a<PointF> aVar, float f11, float f12, float f13) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = aVar.f64876b;
        if (pointF3 == null || (pointF = aVar.f64877c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF4 = pointF3;
        PointF pointF5 = pointF;
        k1.j<A> jVar = this.f100480e;
        if (jVar != 0 && (pointF2 = (PointF) jVar.b(aVar.f64881g, aVar.f64882h.floatValue(), pointF4, pointF5, f11, e(), f())) != null) {
            return pointF2;
        }
        PointF pointF6 = this.f100510i;
        float f14 = pointF4.x;
        float f15 = f14 + (f12 * (pointF5.x - f14));
        float f16 = pointF4.y;
        pointF6.set(f15, f16 + (f13 * (pointF5.y - f16)));
        return this.f100510i;
    }
}
