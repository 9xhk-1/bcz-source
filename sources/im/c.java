package im;

import com.github.mikephil.charting.data.DataSet;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class c extends b<jm.f> implements f {

    /* renamed from: c, reason: collision with root package name */
    public a f60698c;

    public c(jm.f fVar, jm.a aVar) {
        super(fVar);
        this.f60698c = aVar.getBarData() == null ? null : new a(aVar);
    }

    @Override // im.b
    public List<d> h(float f11, float f12, float f13) {
        this.f60697b.clear();
        List<fm.c> Q = ((jm.f) this.f60696a).getCombinedData().Q();
        for (int i11 = 0; i11 < Q.size(); i11++) {
            fm.c cVar = Q.get(i11);
            a aVar = this.f60698c;
            if (aVar == null || !(cVar instanceof fm.a)) {
                int m11 = cVar.m();
                for (int i12 = 0; i12 < m11; i12++) {
                    km.e k11 = Q.get(i11).k(i12);
                    if (k11.g0()) {
                        for (d dVar : b(k11, i12, f11, DataSet.Rounding.CLOSEST)) {
                            dVar.m(i11);
                            this.f60697b.add(dVar);
                        }
                    }
                }
            } else {
                d a11 = aVar.a(f12, f13);
                if (a11 != null) {
                    a11.m(i11);
                    this.f60697b.add(a11);
                }
            }
        }
        return this.f60697b;
    }
}
