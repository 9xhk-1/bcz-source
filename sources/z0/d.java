package z0;

import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d extends g<Float> {
    public d(List<k1.a<Float>> list) {
        super(list);
    }

    public float p() {
        return q(b(), d());
    }

    public float q(k1.a<Float> aVar, float f11) {
        float f12;
        if (aVar.f64876b == null || aVar.f64877c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        k1.j<A> jVar = this.f100480e;
        if (jVar != 0) {
            f12 = f11;
            Float f13 = (Float) jVar.b(aVar.f64881g, aVar.f64882h.floatValue(), aVar.f64876b, aVar.f64877c, f12, e(), f());
            if (f13 != null) {
                return f13.floatValue();
            }
        } else {
            f12 = f11;
        }
        return j1.i.k(aVar.f(), aVar.c(), f12);
    }

    @Override // z0.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Float i(k1.a<Float> aVar, float f11) {
        return Float.valueOf(q(aVar, f11));
    }
}
