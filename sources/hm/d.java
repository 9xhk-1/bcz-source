package hm;

import java.text.DecimalFormat;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class d extends l {

    /* renamed from: a, reason: collision with root package name */
    public DecimalFormat f59494a;

    /* renamed from: b, reason: collision with root package name */
    public int f59495b;

    public d(int i11) {
        m(i11);
    }

    @Override // hm.l
    public String h(float f11) {
        return this.f59494a.format(f11);
    }

    public int l() {
        return this.f59495b;
    }

    public void m(int i11) {
        this.f59495b = i11;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        this.f59494a = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }
}
