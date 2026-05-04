package fm;

import com.github.mikephil.charting.data.BarEntry;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class a extends c<km.a> {

    /* renamed from: j, reason: collision with root package name */
    public float f52032j;

    public a() {
        this.f52032j = 0.85f;
    }

    public float Q() {
        return this.f52032j;
    }

    public float R(float f11, float f12) {
        return (this.f52067i.size() * (this.f52032j + f12)) + f11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void S(float f11, float f12, float f13) {
        BarEntry barEntry;
        if (this.f52067i.size() <= 1) {
            throw new RuntimeException("BarData needs to hold at least 2 BarDataSets to allow grouping.");
        }
        int l12 = ((km.a) w()).l1();
        float f14 = f12 / 2.0f;
        float f15 = f13 / 2.0f;
        float f16 = this.f52032j / 2.0f;
        float R = R(f12, f13);
        for (int i11 = 0; i11 < l12; i11++) {
            float f17 = f11 + f14;
            for (T t11 : this.f52067i) {
                float f18 = f17 + f15 + f16;
                if (i11 < t11.l1() && (barEntry = (BarEntry) t11.m(i11)) != null) {
                    barEntry.k(f18);
                }
                f17 = f18 + f16 + f15;
            }
            float f19 = f17 + f14;
            float f21 = R - (f19 - f11);
            if (f21 > 0.0f || f21 < 0.0f) {
                f19 += f21;
            }
            f11 = f19;
        }
        E();
    }

    public void T(float f11) {
        this.f52032j = f11;
    }

    public a(km.a... aVarArr) {
        super(aVarArr);
        this.f52032j = 0.85f;
    }

    public a(List<km.a> list) {
        super(list);
        this.f52032j = 0.85f;
    }
}
