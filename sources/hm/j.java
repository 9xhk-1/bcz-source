package hm;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieEntry;
import java.text.DecimalFormat;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class j extends l {

    /* renamed from: a, reason: collision with root package name */
    public DecimalFormat f59502a;

    /* renamed from: b, reason: collision with root package name */
    public PieChart f59503b;

    public j() {
        this.f59502a = new DecimalFormat("###,###,##0.0");
    }

    @Override // hm.l
    public String h(float f11) {
        return this.f59502a.format(f11) + " %";
    }

    @Override // hm.l
    public String i(float f11, PieEntry pieEntry) {
        PieChart pieChart = this.f59503b;
        return (pieChart == null || !pieChart.p0()) ? this.f59502a.format(f11) : h(f11);
    }

    public j(PieChart pieChart) {
        this();
        this.f59503b = pieChart;
    }
}
