package im;

import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class e extends a {
    public e(jm.a aVar) {
        super(aVar);
    }

    @Override // im.a, im.b, im.f
    public d a(float f11, float f12) {
        fm.a barData = ((jm.a) this.f60696a).getBarData();
        rm.f j11 = j(f12, f11);
        d f13 = f((float) j11.f84262d, f12, f11);
        if (f13 == null) {
            return null;
        }
        km.a aVar = (km.a) barData.k(f13.d());
        if (aVar.c0()) {
            return l(f13, aVar, (float) j11.f84262d, (float) j11.f84261c);
        }
        rm.f.c(j11);
        return f13;
    }

    @Override // im.b
    public List<d> b(km.e eVar, int i11, float f11, DataSet.Rounding rounding) {
        Entry d12;
        ArrayList arrayList = new ArrayList();
        List<Entry> w11 = eVar.w(f11);
        if (w11.size() == 0 && (d12 = eVar.d1(f11, Float.NaN, rounding)) != null) {
            w11 = eVar.w(d12.j());
        }
        if (w11.size() != 0) {
            for (Entry entry : w11) {
                rm.f f12 = ((jm.a) this.f60696a).d(eVar.F0()).f(entry.c(), entry.j());
                arrayList.add(new d(entry.j(), entry.c(), (float) f12.f84261c, (float) f12.f84262d, i11, eVar.F0()));
            }
        }
        return arrayList;
    }

    @Override // im.a, im.b
    public float e(float f11, float f12, float f13, float f14) {
        return Math.abs(f12 - f14);
    }
}
