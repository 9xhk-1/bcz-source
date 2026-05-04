package r90;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class m extends u<BigDecimal> {
    public m(BigDecimal bigDecimal, String str, String... strArr) {
        super(bigDecimal, str, strArr);
    }

    @Override // r90.u
    public void t(DecimalFormat decimalFormat) {
        decimalFormat.setParseBigDecimal(true);
    }

    public m(BigDecimal bigDecimal, String str) {
        super(bigDecimal, str);
    }

    public m(String... strArr) {
        super((Number) null, (String) null, strArr);
    }

    public m(DecimalFormat... decimalFormatArr) {
        super(decimalFormatArr);
    }

    public m() {
    }
}
