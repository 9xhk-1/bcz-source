package z0;

import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class e extends g<e1.d> {

    /* renamed from: i, reason: collision with root package name */
    public final e1.d f100500i;

    public e(List<k1.a<e1.d>> list) {
        super(list);
        e1.d dVar = list.get(0).f64876b;
        int c11 = dVar != null ? dVar.c() : 0;
        this.f100500i = new e1.d(new float[c11], new int[c11]);
    }

    @Override // z0.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public e1.d i(k1.a<e1.d> aVar, float f11) {
        this.f100500i.d(aVar.f64876b, aVar.f64877c, f11);
        return this.f100500i;
    }
}
