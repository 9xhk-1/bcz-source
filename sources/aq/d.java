package aq;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.n;
import com.google.zxing.pdf417.encoder.Compaction;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class d implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final int f5468a = 30;

    /* renamed from: b, reason: collision with root package name */
    public static final int f5469b = 2;

    public static kp.b c(byte[][] bArr, int i11) {
        int i12 = i11 * 2;
        kp.b bVar = new kp.b(bArr[0].length + i12, bArr.length + i12);
        bVar.b();
        int h11 = (bVar.h() - i11) - 1;
        int i13 = 0;
        while (i13 < bArr.length) {
            byte[] bArr2 = bArr[i13];
            for (int i14 = 0; i14 < bArr[0].length; i14++) {
                if (bArr2[i14] == 1) {
                    bVar.q(i14 + i11, h11);
                }
            }
            i13++;
            h11--;
        }
        return bVar;
    }

    public static kp.b d(eq.d dVar, String str, int i11, int i12, int i13, int i14) throws WriterException {
        boolean z11;
        dVar.e(str, i11);
        byte[][] c11 = dVar.f().c(1, 4);
        if ((i13 > i12) != (c11[0].length < c11.length)) {
            c11 = e(c11);
            z11 = true;
        } else {
            z11 = false;
        }
        int length = i12 / c11[0].length;
        int length2 = i13 / c11.length;
        if (length >= length2) {
            length = length2;
        }
        if (length <= 1) {
            return c(c11, i14);
        }
        byte[][] c12 = dVar.f().c(length, length << 2);
        if (z11) {
            c12 = e(c12);
        }
        return c(c12, i14);
    }

    public static byte[][] e(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, bArr[0].length, bArr.length);
        for (int i11 = 0; i11 < bArr.length; i11++) {
            int length = (bArr.length - i11) - 1;
            for (int i12 = 0; i12 < bArr[0].length; i12++) {
                bArr2[i12][length] = bArr[i11][i12];
            }
        }
        return bArr2;
    }

    @Override // com.google.zxing.n
    public kp.b a(String str, BarcodeFormat barcodeFormat, int i11, int i12, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat != BarcodeFormat.PDF_417) {
            throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(barcodeFormat)));
        }
        eq.d dVar = new eq.d();
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.PDF417_COMPACT;
            if (map.containsKey(encodeHintType)) {
                dVar.h(Boolean.valueOf(map.get(encodeHintType).toString()).booleanValue());
            }
            EncodeHintType encodeHintType2 = EncodeHintType.PDF417_COMPACTION;
            if (map.containsKey(encodeHintType2)) {
                dVar.i(Compaction.valueOf(map.get(encodeHintType2).toString()));
            }
            EncodeHintType encodeHintType3 = EncodeHintType.PDF417_DIMENSIONS;
            if (map.containsKey(encodeHintType3)) {
                eq.c cVar = (eq.c) map.get(encodeHintType3);
                dVar.j(cVar.a(), cVar.c(), cVar.b(), cVar.d());
            }
            EncodeHintType encodeHintType4 = EncodeHintType.MARGIN;
            r9 = map.containsKey(encodeHintType4) ? Integer.parseInt(map.get(encodeHintType4).toString()) : 30;
            EncodeHintType encodeHintType5 = EncodeHintType.ERROR_CORRECTION;
            r0 = map.containsKey(encodeHintType5) ? Integer.parseInt(map.get(encodeHintType5).toString()) : 2;
            EncodeHintType encodeHintType6 = EncodeHintType.CHARACTER_SET;
            if (map.containsKey(encodeHintType6)) {
                dVar.k(Charset.forName(map.get(encodeHintType6).toString()));
            }
        }
        return d(dVar, str, r0, i11, i12, r9);
    }

    @Override // com.google.zxing.n
    public kp.b b(String str, BarcodeFormat barcodeFormat, int i11, int i12) throws WriterException {
        return a(str, barcodeFormat, i11, i12, null);
    }
}
