package z0;

import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class l extends g<k1.k> {

    /* renamed from: i, reason: collision with root package name */
    public final k1.k f100511i;

    public l(List<k1.a<k1.k>> list) {
        super(list);
        this.f100511i = new k1.k();
    }

    @Override // z0.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public k1.k i(k1.a<k1.k> aVar, float f11) {
        k1.k kVar;
        float f12;
        k1.k kVar2 = aVar.f64876b;
        if (kVar2 == null || (kVar = aVar.f64877c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        k1.k kVar3 = kVar2;
        k1.k kVar4 = kVar;
        k1.j<A> jVar = this.f100480e;
        if (jVar != 0) {
            f12 = f11;
            k1.k kVar5 = (k1.k) jVar.b(aVar.f64881g, aVar.f64882h.floatValue(), kVar3, kVar4, f12, e(), f());
            if (kVar5 != null) {
                return kVar5;
            }
        } else {
            f12 = f11;
        }
        this.f100511i.d(j1.i.k(kVar3.b(), kVar4.b(), f12), j1.i.k(kVar3.c(), kVar4.c(), f12));
        return this.f100511i;
    }
}
