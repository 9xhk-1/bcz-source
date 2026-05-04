package fm;

import android.graphics.Paint;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.data.DataSet;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class j extends o<CandleEntry> implements km.d {
    public float C;
    public boolean D;
    public float E;
    public boolean F;
    public Paint.Style G;
    public Paint.Style H;
    public int I;
    public int J;
    public int K;
    public int L;

    public j(List<CandleEntry> list, String str) {
        super(list, str);
        this.C = 3.0f;
        this.D = true;
        this.E = 0.1f;
        this.F = false;
        this.G = Paint.Style.STROKE;
        this.H = Paint.Style.FILL;
        this.I = rm.a.f84249b;
        this.J = rm.a.f84249b;
        this.K = rm.a.f84249b;
        this.L = rm.a.f84249b;
    }

    @Override // km.d
    public boolean C() {
        return this.D;
    }

    @Override // km.d
    public int I0() {
        return this.I;
    }

    @Override // com.github.mikephil.charting.data.DataSet
    public DataSet<CandleEntry> L1() {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < this.f30249s.size(); i11++) {
            arrayList.add(((CandleEntry) this.f30249s.get(i11)).h());
        }
        j jVar = new j(arrayList, getLabel());
        c2(jVar);
        return jVar;
    }

    @Override // km.d
    public float M0() {
        return this.C;
    }

    @Override // km.d
    public Paint.Style S() {
        return this.G;
    }

    @Override // km.d
    public Paint.Style S0() {
        return this.H;
    }

    @Override // km.d
    public float U0() {
        return this.E;
    }

    @Override // com.github.mikephil.charting.data.DataSet
    /* renamed from: a2, reason: merged with bridge method [inline-methods] */
    public void I1(CandleEntry candleEntry) {
        if (candleEntry.p() < this.f30251u) {
            this.f30251u = candleEntry.p();
        }
        if (candleEntry.o() > this.f30250t) {
            this.f30250t = candleEntry.o();
        }
        J1(candleEntry);
    }

    @Override // com.github.mikephil.charting.data.DataSet
    /* renamed from: b2, reason: merged with bridge method [inline-methods] */
    public void K1(CandleEntry candleEntry) {
        if (candleEntry.o() < this.f30251u) {
            this.f30251u = candleEntry.o();
        }
        if (candleEntry.o() > this.f30250t) {
            this.f30250t = candleEntry.o();
        }
        if (candleEntry.p() < this.f30251u) {
            this.f30251u = candleEntry.p();
        }
        if (candleEntry.p() > this.f30250t) {
            this.f30250t = candleEntry.p();
        }
    }

    public void c2(j jVar) {
        super.S1(jVar);
        jVar.C = this.C;
        jVar.D = this.D;
        jVar.E = this.E;
        jVar.F = this.F;
        jVar.f52035x = this.f52035x;
        jVar.G = this.G;
        jVar.H = this.H;
        jVar.I = this.I;
        jVar.J = this.J;
        jVar.K = this.K;
        jVar.L = this.L;
    }

    public void d2(float f11) {
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        if (f11 > 0.45f) {
            f11 = 0.45f;
        }
        this.E = f11;
    }

    public void e2(int i11) {
        this.K = i11;
    }

    public void f2(Paint.Style style) {
        this.H = style;
    }

    public void g2(int i11) {
        this.J = i11;
    }

    public void h2(Paint.Style style) {
        this.G = style;
    }

    public void i2(int i11) {
        this.I = i11;
    }

    @Override // km.d
    public int j1() {
        return this.L;
    }

    public void j2(int i11) {
        this.L = i11;
    }

    @Override // km.d
    public int k0() {
        return this.K;
    }

    public void k2(boolean z11) {
        this.F = z11;
    }

    public void l2(float f11) {
        this.C = rm.k.e(f11);
    }

    public void m2(boolean z11) {
        this.D = z11;
    }

    @Override // km.d
    public int z() {
        return this.J;
    }

    @Override // km.d
    public boolean z0() {
        return this.F;
    }
}
