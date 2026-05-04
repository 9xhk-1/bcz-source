package im;

import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.List;
import jm.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class b<T extends jm.b> implements f {

    /* renamed from: a, reason: collision with root package name */
    public T f60696a;

    /* renamed from: b, reason: collision with root package name */
    public List<d> f60697b = new ArrayList();

    public b(T t11) {
        this.f60696a = t11;
    }

    @Override // im.f
    public d a(float f11, float f12) {
        rm.f j11 = j(f11, f12);
        float f13 = (float) j11.f84261c;
        rm.f.c(j11);
        return f(f13, f11, f12);
    }

    public List<d> b(km.e eVar, int i11, float f11, DataSet.Rounding rounding) {
        Entry d12;
        ArrayList arrayList = new ArrayList();
        List<Entry> w11 = eVar.w(f11);
        if (w11.size() == 0 && (d12 = eVar.d1(f11, Float.NaN, rounding)) != null) {
            w11 = eVar.w(d12.j());
        }
        if (w11.size() != 0) {
            for (Entry entry : w11) {
                rm.f f12 = this.f60696a.d(eVar.F0()).f(entry.j(), entry.c());
                arrayList.add(new d(entry.j(), entry.c(), (float) f12.f84261c, (float) f12.f84262d, i11, eVar.F0()));
            }
        }
        return arrayList;
    }

    public d c(List<d> list, float f11, float f12, YAxis.AxisDependency axisDependency, float f13) {
        d dVar = null;
        for (int i11 = 0; i11 < list.size(); i11++) {
            d dVar2 = list.get(i11);
            if (axisDependency == null || dVar2.b() == axisDependency) {
                float e11 = e(f11, f12, dVar2.i(), dVar2.k());
                if (e11 < f13) {
                    dVar = dVar2;
                    f13 = e11;
                }
            }
        }
        return dVar;
    }

    public fm.c d() {
        return this.f60696a.getData();
    }

    public float e(float f11, float f12, float f13, float f14) {
        return (float) Math.hypot(f11 - f13, f12 - f14);
    }

    public d f(float f11, float f12, float f13) {
        List<d> h11 = h(f11, f12, f13);
        if (h11.isEmpty()) {
            return null;
        }
        YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
        float i11 = i(h11, f13, axisDependency);
        YAxis.AxisDependency axisDependency2 = YAxis.AxisDependency.RIGHT;
        return c(h11, f12, f13, i11 < i(h11, f13, axisDependency2) ? axisDependency : axisDependency2, this.f60696a.getMaxHighlightDistance());
    }

    public float g(d dVar) {
        return dVar.k();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [km.e] */
    public List<d> h(float f11, float f12, float f13) {
        this.f60697b.clear();
        fm.c d11 = d();
        if (d11 == null) {
            return this.f60697b;
        }
        int m11 = d11.m();
        for (int i11 = 0; i11 < m11; i11++) {
            ?? k11 = d11.k(i11);
            if (k11.g0()) {
                this.f60697b.addAll(b(k11, i11, f11, DataSet.Rounding.CLOSEST));
            }
        }
        return this.f60697b;
    }

    public float i(List<d> list, float f11, YAxis.AxisDependency axisDependency) {
        float f12 = Float.MAX_VALUE;
        for (int i11 = 0; i11 < list.size(); i11++) {
            d dVar = list.get(i11);
            if (dVar.b() == axisDependency) {
                float abs = Math.abs(g(dVar) - f11);
                if (abs < f12) {
                    f12 = abs;
                }
            }
        }
        return f12;
    }

    public rm.f j(float f11, float f12) {
        return this.f60696a.d(YAxis.AxisDependency.LEFT).j(f11, f12);
    }
}
