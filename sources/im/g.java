package im;

import com.github.mikephil.charting.charts.PieChart;
import fm.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class g extends h<PieChart> {
    public g(PieChart pieChart) {
        super(pieChart);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.h
    public d b(int i11, float f11, float f12) {
        km.i Q = ((p) ((PieChart) this.f60709a).getData()).Q();
        return new d(i11, Q.m(i11).c(), f11, f12, 0, Q.F0());
    }
}
