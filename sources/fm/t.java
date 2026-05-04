package fm;

import com.github.mikephil.charting.charts.ScatterChart;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class t extends o<Entry> implements km.k {
    public float C;
    public qm.e D;
    public float E;
    public int F;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52076a;

        static {
            int[] iArr = new int[ScatterChart.ScatterShape.values().length];
            f52076a = iArr;
            try {
                iArr[ScatterChart.ScatterShape.SQUARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f52076a[ScatterChart.ScatterShape.CIRCLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f52076a[ScatterChart.ScatterShape.TRIANGLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f52076a[ScatterChart.ScatterShape.CROSS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f52076a[ScatterChart.ScatterShape.X.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f52076a[ScatterChart.ScatterShape.CHEVRON_UP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f52076a[ScatterChart.ScatterShape.CHEVRON_DOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public t(List<Entry> list, String str) {
        super(list, str);
        this.C = 15.0f;
        this.D = new qm.f();
        this.E = 0.0f;
        this.F = rm.a.f84248a;
    }

    public static qm.e b2(ScatterChart.ScatterShape scatterShape) {
        switch (a.f52076a[scatterShape.ordinal()]) {
            case 1:
                return new qm.f();
            case 2:
                return new qm.c();
            case 3:
                return new qm.g();
            case 4:
                return new qm.d();
            case 5:
                return new qm.h();
            case 6:
                return new qm.b();
            case 7:
                return new qm.a();
            default:
                return null;
        }
    }

    @Override // km.k
    public int B0() {
        return this.F;
    }

    @Override // com.github.mikephil.charting.data.DataSet
    public DataSet<Entry> L1() {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < this.f30249s.size(); i11++) {
            arrayList.add(((Entry) this.f30249s.get(i11)).h());
        }
        t tVar = new t(arrayList, getLabel());
        a2(tVar);
        return tVar;
    }

    @Override // km.k
    public qm.e Z() {
        return this.D;
    }

    public void a2(t tVar) {
        super.S1(tVar);
        tVar.C = this.C;
        tVar.D = this.D;
        tVar.E = this.E;
        tVar.F = this.F;
    }

    public void c2(ScatterChart.ScatterShape scatterShape) {
        this.D = b2(scatterShape);
    }

    public void d2(int i11) {
        this.F = i11;
    }

    public void e2(float f11) {
        this.E = f11;
    }

    public void f2(float f11) {
        this.C = f11;
    }

    public void g2(qm.e eVar) {
        this.D = eVar;
    }

    @Override // km.k
    public float p1() {
        return this.E;
    }

    @Override // km.k
    public float q() {
        return this.C;
    }
}
