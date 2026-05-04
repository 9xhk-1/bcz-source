package fm;

import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.RadarEntry;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class r extends n<RadarEntry> implements km.j {
    public boolean H;
    public int I;
    public int J;
    public int K;
    public float L;
    public float M;
    public float N;

    public r(List<RadarEntry> list, String str) {
        super(list, str);
        this.H = false;
        this.I = -1;
        this.J = rm.a.f84248a;
        this.K = 76;
        this.L = 3.0f;
        this.M = 4.0f;
        this.N = 2.0f;
    }

    @Override // km.j
    public int H() {
        return this.K;
    }

    @Override // km.j
    public float H0() {
        return this.N;
    }

    @Override // km.j
    public float K0() {
        return this.L;
    }

    @Override // com.github.mikephil.charting.data.DataSet
    public DataSet<RadarEntry> L1() {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < this.f30249s.size(); i11++) {
            arrayList.add(((RadarEntry) this.f30249s.get(i11)).h());
        }
        r rVar = new r(arrayList, getLabel());
        f2(rVar);
        return rVar;
    }

    @Override // km.j
    public boolean O0() {
        return this.H;
    }

    @Override // km.j
    public void X(boolean z11) {
        this.H = z11;
    }

    @Override // km.j
    public int b() {
        return this.I;
    }

    public void f2(r rVar) {
        super.a2(rVar);
        rVar.H = this.H;
        rVar.I = this.I;
        rVar.L = this.L;
        rVar.K = this.K;
        rVar.J = this.J;
        rVar.N = this.N;
    }

    public void g2(int i11) {
        this.I = i11;
    }

    public void h2(float f11) {
        this.L = f11;
    }

    public void i2(float f11) {
        this.M = f11;
    }

    public void j2(int i11) {
        this.K = i11;
    }

    public void k2(int i11) {
        this.J = i11;
    }

    public void l2(float f11) {
        this.N = f11;
    }

    @Override // km.j
    public int n0() {
        return this.J;
    }

    @Override // km.j
    public float r0() {
        return this.M;
    }
}
