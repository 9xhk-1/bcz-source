package pm;

import android.graphics.Canvas;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.components.XAxis;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class s extends q {

    /* renamed from: p, reason: collision with root package name */
    public RadarChart f80952p;

    public s(rm.l lVar, XAxis xAxis, RadarChart radarChart) {
        super(lVar, xAxis, null);
        this.f80952p = radarChart;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pm.q, pm.a
    public void g(Canvas canvas) {
        if (this.f80942h.f() && this.f80942h.P()) {
            float v02 = this.f80942h.v0();
            rm.g c11 = rm.g.c(0.5f, 0.25f);
            this.f80857e.setTypeface(this.f80942h.c());
            this.f80857e.setTextSize(this.f80942h.b());
            this.f80857e.setColor(this.f80942h.a());
            float sliceAngle = this.f80952p.getSliceAngle();
            float factor = this.f80952p.getFactor();
            rm.g centerOffsets = this.f80952p.getCenterOffsets();
            rm.g c12 = rm.g.c(0.0f, 0.0f);
            for (int i11 = 0; i11 < ((fm.q) this.f80952p.getData()).w().l1(); i11++) {
                float f11 = i11;
                String c13 = this.f80942h.H().c(f11, this.f80942h);
                rm.k.B(centerOffsets, (this.f80952p.getYRange() * factor) + (this.f80942h.L / 2.0f), ((f11 * sliceAngle) + this.f80952p.getRotationAngle()) % 360.0f, c12);
                m(canvas, c13, c12.f84265c, c12.f84266d - (this.f80942h.M / 2.0f), c11, v02);
            }
            rm.g.h(centerOffsets);
            rm.g.h(c12);
            rm.g.h(c11);
        }
    }

    @Override // pm.q, pm.a
    public void j(Canvas canvas) {
    }
}
