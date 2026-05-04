package hm;

import java.text.DecimalFormat;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class b extends l {

    /* renamed from: a, reason: collision with root package name */
    public DecimalFormat f59492a;

    /* renamed from: b, reason: collision with root package name */
    public int f59493b;

    public b(int i11) {
        this.f59493b = i11;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        this.f59492a = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }

    @Override // hm.l
    public String h(float f11) {
        return this.f59492a.format(f11);
    }

    public int l() {
        return this.f59493b;
    }
}
