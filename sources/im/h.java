package im;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.charts.PieRadarChartBase;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class h<T extends PieRadarChartBase> implements f {

    /* renamed from: a, reason: collision with root package name */
    public T f60709a;

    /* renamed from: b, reason: collision with root package name */
    public List<d> f60710b = new ArrayList();

    public h(T t11) {
        this.f60709a = t11;
    }

    @Override // im.f
    public d a(float f11, float f12) {
        if (this.f60709a.Z(f11, f12) > this.f60709a.getRadius()) {
            return null;
        }
        float a02 = this.f60709a.a0(f11, f12);
        T t11 = this.f60709a;
        if (t11 instanceof PieChart) {
            a02 /= t11.getAnimator().i();
        }
        int b02 = this.f60709a.b0(a02);
        if (b02 < 0 || b02 >= this.f60709a.getData().w().l1()) {
            return null;
        }
        return b(b02, f11, f12);
    }

    public abstract d b(int i11, float f11, float f12);
}
