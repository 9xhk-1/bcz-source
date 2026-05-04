package z0;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class j extends g<PointF> {

    /* renamed from: i, reason: collision with root package name */
    public final PointF f100506i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f100507j;

    /* renamed from: k, reason: collision with root package name */
    public final PathMeasure f100508k;

    /* renamed from: l, reason: collision with root package name */
    public i f100509l;

    public j(List<? extends k1.a<PointF>> list) {
        super(list);
        this.f100506i = new PointF();
        this.f100507j = new float[2];
        this.f100508k = new PathMeasure();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // z0.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public PointF i(k1.a<PointF> aVar, float f11) {
        float f12;
        i iVar = (i) aVar;
        Path j11 = iVar.j();
        if (j11 == null) {
            return aVar.f64876b;
        }
        k1.j<A> jVar = this.f100480e;
        if (jVar != 0) {
            f12 = f11;
            PointF pointF = (PointF) jVar.b(iVar.f64881g, iVar.f64882h.floatValue(), (PointF) iVar.f64876b, (PointF) iVar.f64877c, e(), f12, f());
            if (pointF != null) {
                return pointF;
            }
        } else {
            f12 = f11;
        }
        if (this.f100509l != iVar) {
            this.f100508k.setPath(j11, false);
            this.f100509l = iVar;
        }
        PathMeasure pathMeasure = this.f100508k;
        pathMeasure.getPosTan(pathMeasure.getLength() * f12, this.f100507j, null);
        PointF pointF2 = this.f100506i;
        float[] fArr = this.f100507j;
        pointF2.set(fArr[0], fArr[1]);
        return this.f100506i;
    }
}
