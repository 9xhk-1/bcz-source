package im;

import com.github.mikephil.charting.data.BarEntry;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class a extends b<jm.a> {
    public a(jm.a aVar) {
        super(aVar);
    }

    @Override // im.b, im.f
    public d a(float f11, float f12) {
        d a11 = super.a(f11, f12);
        if (a11 == null) {
            return null;
        }
        rm.f j11 = j(f11, f12);
        km.a aVar = (km.a) ((jm.a) this.f60696a).getBarData().k(a11.d());
        if (aVar.c0()) {
            return l(a11, aVar, (float) j11.f84261c, (float) j11.f84262d);
        }
        rm.f.c(j11);
        return a11;
    }

    @Override // im.b
    public fm.c d() {
        return ((jm.a) this.f60696a).getBarData();
    }

    @Override // im.b
    public float e(float f11, float f12, float f13, float f14) {
        return Math.abs(f11 - f13);
    }

    public int k(j[] jVarArr, float f11) {
        if (jVarArr != null && jVarArr.length != 0) {
            int i11 = 0;
            for (j jVar : jVarArr) {
                if (jVar.a(f11)) {
                    return i11;
                }
                i11++;
            }
            int max = Math.max(jVarArr.length - 1, 0);
            if (f11 > jVarArr[max].f60712b) {
                return max;
            }
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d l(d dVar, km.a aVar, float f11, float f12) {
        BarEntry barEntry = (BarEntry) aVar.N0(f11, f12);
        if (barEntry == null) {
            return null;
        }
        if (barEntry.v() == null) {
            return dVar;
        }
        j[] t11 = barEntry.t();
        if (t11.length <= 0) {
            return null;
        }
        int k11 = k(t11, f12);
        rm.f f13 = ((jm.a) this.f60696a).d(aVar.F0()).f(dVar.h(), t11[k11].f60712b);
        d dVar2 = new d(barEntry.j(), barEntry.c(), (float) f13.f84261c, (float) f13.f84262d, dVar.d(), k11, dVar.b());
        rm.f.c(f13);
        return dVar2;
    }
}
