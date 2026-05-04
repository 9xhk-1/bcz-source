package hm;

import com.github.mikephil.charting.data.BarEntry;
import java.text.DecimalFormat;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class k extends l {

    /* renamed from: a, reason: collision with root package name */
    public boolean f59504a;

    /* renamed from: b, reason: collision with root package name */
    public String f59505b;

    /* renamed from: c, reason: collision with root package name */
    public DecimalFormat f59506c;

    public k(boolean z11, String str, int i11) {
        this.f59504a = z11;
        this.f59505b = str;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        this.f59506c = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }

    @Override // hm.l
    public String e(float f11, BarEntry barEntry) {
        float[] v11;
        if (this.f59504a || (v11 = barEntry.v()) == null) {
            return this.f59506c.format(f11) + this.f59505b;
        }
        if (v11[v11.length - 1] != f11) {
            return "";
        }
        return this.f59506c.format(barEntry.c()) + this.f59505b;
    }
}
