package wp;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class u implements com.google.zxing.n {

    /* renamed from: a, reason: collision with root package name */
    public final j f96634a = new j();

    @Override // com.google.zxing.n
    public kp.b a(String str, BarcodeFormat barcodeFormat, int i11, int i12, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.UPC_A) {
            return this.f96634a.a("0".concat(String.valueOf(str)), BarcodeFormat.EAN_13, i11, i12, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // com.google.zxing.n
    public kp.b b(String str, BarcodeFormat barcodeFormat, int i11, int i12) throws WriterException {
        return a(str, barcodeFormat, i11, i12, null);
    }
}
