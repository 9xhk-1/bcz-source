package pm;

import android.graphics.Canvas;
import android.graphics.Path;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.YAxis;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class v extends t {

    /* renamed from: r, reason: collision with root package name */
    public RadarChart f80966r;

    /* renamed from: s, reason: collision with root package name */
    public Path f80967s;

    public v(rm.l lVar, YAxis yAxis, RadarChart radarChart) {
        super(lVar, yAxis, null);
        this.f80967s = new Path();
        this.f80966r = radarChart;
    }

    @Override // pm.a
    public void b(float f11, float f12) {
        int i11;
        float f13 = f11;
        int C = this.f80854b.C();
        double abs = Math.abs(f12 - f13);
        if (C == 0 || abs <= 0.0d || Double.isInfinite(abs)) {
            em.a aVar = this.f80854b;
            aVar.f49885l = new float[0];
            aVar.f49886m = new float[0];
            aVar.f49887n = 0;
            return;
        }
        double L = rm.k.L(abs / C);
        if (this.f80854b.S() && L < this.f80854b.y()) {
            L = this.f80854b.y();
        }
        double L2 = rm.k.L(Math.pow(10.0d, (int) Math.log10(L)));
        if (((int) (L / L2)) > 5) {
            L = Math.floor(L2 * 10.0d);
        }
        boolean L3 = this.f80854b.L();
        if (this.f80854b.R()) {
            float f14 = ((float) abs) / (C - 1);
            em.a aVar2 = this.f80854b;
            aVar2.f49887n = C;
            if (aVar2.f49885l.length < C) {
                aVar2.f49885l = new float[C];
            }
            for (int i12 = 0; i12 < C; i12++) {
                this.f80854b.f49885l[i12] = f13;
                f13 += f14;
            }
        } else {
            double ceil = L == 0.0d ? 0.0d : Math.ceil(f13 / L) * L;
            if (L3) {
                ceil -= L;
            }
            double J = L == 0.0d ? 0.0d : rm.k.J(Math.floor(f12 / L) * L);
            if (L != 0.0d) {
                i11 = L3 ? 1 : 0;
                for (double d11 = ceil; d11 <= J; d11 += L) {
                    i11++;
                }
            } else {
                i11 = L3 ? 1 : 0;
            }
            C = i11 + 1;
            em.a aVar3 = this.f80854b;
            aVar3.f49887n = C;
            if (aVar3.f49885l.length < C) {
                aVar3.f49885l = new float[C];
            }
            for (int i13 = 0; i13 < C; i13++) {
                if (ceil == 0.0d) {
                    ceil = 0.0d;
                }
                this.f80854b.f49885l[i13] = (float) ceil;
                ceil += L;
            }
        }
        if (L < 1.0d) {
            this.f80854b.f49888o = (int) Math.ceil(-Math.log10(L));
        } else {
            this.f80854b.f49888o = 0;
        }
        if (L3) {
            em.a aVar4 = this.f80854b;
            if (aVar4.f49886m.length < C) {
                aVar4.f49886m = new float[C];
            }
            float[] fArr = aVar4.f49885l;
            float f15 = (fArr[1] - fArr[0]) / 2.0f;
            for (int i14 = 0; i14 < C; i14++) {
                em.a aVar5 = this.f80854b;
                aVar5.f49886m[i14] = aVar5.f49885l[i14] + f15;
            }
        }
        em.a aVar6 = this.f80854b;
        float[] fArr2 = aVar6.f49885l;
        float f16 = fArr2[0];
        aVar6.H = f16;
        float f17 = fArr2[C - 1];
        aVar6.G = f17;
        aVar6.I = Math.abs(f17 - f16);
    }

    @Override // pm.t, pm.a
    public void g(Canvas canvas) {
        if (this.f80953h.f() && this.f80953h.P()) {
            this.f80857e.setTypeface(this.f80953h.c());
            this.f80857e.setTextSize(this.f80953h.b());
            this.f80857e.setColor(this.f80953h.a());
            rm.g centerOffsets = this.f80966r.getCenterOffsets();
            rm.g c11 = rm.g.c(0.0f, 0.0f);
            float factor = this.f80966r.getFactor();
            int i11 = this.f80953h.G0() ? this.f80953h.f49887n : this.f80953h.f49887n - 1;
            for (int i12 = !this.f80953h.F0() ? 1 : 0; i12 < i11; i12++) {
                YAxis yAxis = this.f80953h;
                rm.k.B(centerOffsets, (yAxis.f49885l[i12] - yAxis.H) * factor, this.f80966r.getRotationAngle(), c11);
                canvas.drawText(this.f80953h.x(i12), c11.f84265c + 10.0f, c11.f84266d, this.f80857e);
            }
            rm.g.h(centerOffsets);
            rm.g.h(c11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pm.t, pm.a
    public void j(Canvas canvas) {
        List<LimitLine> D = this.f80953h.D();
        if (D == null) {
            return;
        }
        float sliceAngle = this.f80966r.getSliceAngle();
        float factor = this.f80966r.getFactor();
        rm.g centerOffsets = this.f80966r.getCenterOffsets();
        rm.g c11 = rm.g.c(0.0f, 0.0f);
        for (int i11 = 0; i11 < D.size(); i11++) {
            LimitLine limitLine = D.get(i11);
            if (limitLine.f()) {
                this.f80859g.setColor(limitLine.s());
                this.f80859g.setPathEffect(limitLine.o());
                this.f80859g.setStrokeWidth(limitLine.t());
                float r11 = (limitLine.r() - this.f80966r.getYChartMin()) * factor;
                Path path = this.f80967s;
                path.reset();
                for (int i12 = 0; i12 < ((fm.q) this.f80966r.getData()).w().l1(); i12++) {
                    rm.k.B(centerOffsets, r11, (i12 * sliceAngle) + this.f80966r.getRotationAngle(), c11);
                    if (i12 == 0) {
                        path.moveTo(c11.f84265c, c11.f84266d);
                    } else {
                        path.lineTo(c11.f84265c, c11.f84266d);
                    }
                }
                path.close();
                canvas.drawPath(path, this.f80859g);
            }
        }
        rm.g.h(centerOffsets);
        rm.g.h(c11);
    }
}
