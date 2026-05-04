package wp;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class t extends y {

    /* renamed from: k, reason: collision with root package name */
    public final y f96633k = new i();

    public static com.google.zxing.k s(com.google.zxing.k kVar) throws FormatException {
        String g11 = kVar.g();
        if (g11.charAt(0) != '0') {
            throw FormatException.getFormatInstance();
        }
        com.google.zxing.k kVar2 = new com.google.zxing.k(g11.substring(1), null, kVar.f(), BarcodeFormat.UPC_A);
        if (kVar.e() != null) {
            kVar2.i(kVar.e());
        }
        return kVar2;
    }

    @Override // wp.r, com.google.zxing.j
    public com.google.zxing.k a(com.google.zxing.b bVar, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        return s(this.f96633k.a(bVar, map));
    }

    @Override // wp.y, wp.r
    public com.google.zxing.k b(int i11, kp.a aVar, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException, ChecksumException {
        return s(this.f96633k.b(i11, aVar, map));
    }

    @Override // wp.r, com.google.zxing.j
    public com.google.zxing.k c(com.google.zxing.b bVar) throws NotFoundException, FormatException {
        return s(this.f96633k.c(bVar));
    }

    @Override // wp.y
    public int l(kp.a aVar, int[] iArr, StringBuilder sb2) throws NotFoundException {
        return this.f96633k.l(aVar, iArr, sb2);
    }

    @Override // wp.y
    public com.google.zxing.k m(int i11, kp.a aVar, int[] iArr, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException, ChecksumException {
        return s(this.f96633k.m(i11, aVar, iArr, map));
    }

    @Override // wp.y
    public BarcodeFormat q() {
        return BarcodeFormat.UPC_A;
    }
}
