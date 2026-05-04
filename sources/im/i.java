package im;

import com.github.mikephil.charting.charts.RadarChart;
import fm.q;
import java.util.List;
import rm.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class i extends h<RadarChart> {
    public i(RadarChart radarChart) {
        super(radarChart);
    }

    @Override // im.h
    public d b(int i11, float f11, float f12) {
        List<d> c11 = c(i11);
        float Z = ((RadarChart) this.f60709a).Z(f11, f12) / ((RadarChart) this.f60709a).getFactor();
        d dVar = null;
        float f13 = Float.MAX_VALUE;
        for (int i12 = 0; i12 < c11.size(); i12++) {
            d dVar2 = c11.get(i12);
            float abs = Math.abs(dVar2.j() - Z);
            if (abs < f13) {
                dVar = dVar2;
                f13 = abs;
            }
        }
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.github.mikephil.charting.data.Entry, fm.f] */
    public List<d> c(int i11) {
        this.f60710b.clear();
        float h11 = ((RadarChart) this.f60709a).getAnimator().h();
        float i12 = ((RadarChart) this.f60709a).getAnimator().i();
        float sliceAngle = ((RadarChart) this.f60709a).getSliceAngle();
        float factor = ((RadarChart) this.f60709a).getFactor();
        rm.g c11 = rm.g.c(0.0f, 0.0f);
        for (int i13 = 0; i13 < ((q) ((RadarChart) this.f60709a).getData()).m(); i13++) {
            km.j k11 = ((q) ((RadarChart) this.f60709a).getData()).k(i13);
            ?? m11 = k11.m(i11);
            float f11 = i11;
            k.B(((RadarChart) this.f60709a).getCenterOffsets(), (m11.c() - ((RadarChart) this.f60709a).getYChartMin()) * factor * i12, (sliceAngle * f11 * h11) + ((RadarChart) this.f60709a).getRotationAngle(), c11);
            this.f60710b.add(new d(f11, m11.c(), c11.f84265c, c11.f84266d, i13, k11.F0()));
        }
        return this.f60710b;
    }
}
