package gq;

import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final mp.c f54007a = new mp.c(mp.a.f73615l);

    public final void a(byte[] bArr, int i11) throws ChecksumException {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i12 = 0; i12 < length; i12++) {
            iArr[i12] = bArr[i12] & 255;
        }
        try {
            this.f54007a.a(iArr, bArr.length - i11);
            for (int i13 = 0; i13 < i11; i13++) {
                bArr[i13] = (byte) iArr[i13];
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.getChecksumInstance();
        }
    }

    public final kp.d b(a aVar, Map<DecodeHintType, ?> map) throws FormatException, ChecksumException {
        h e11 = aVar.e();
        ErrorCorrectionLevel d11 = aVar.d().d();
        b[] b11 = b.b(aVar.c(), e11, d11);
        int i11 = 0;
        for (b bVar : b11) {
            i11 += bVar.c();
        }
        byte[] bArr = new byte[i11];
        int i12 = 0;
        for (b bVar2 : b11) {
            byte[] a11 = bVar2.a();
            int c11 = bVar2.c();
            a(a11, c11);
            int i13 = 0;
            while (i13 < c11) {
                bArr[i12] = a11[i13];
                i13++;
                i12++;
            }
        }
        return d.a(bArr, e11, d11, map);
    }

    public kp.d c(kp.b bVar) throws ChecksumException, FormatException {
        return d(bVar, null);
    }

    public kp.d d(kp.b bVar, Map<DecodeHintType, ?> map) throws FormatException, ChecksumException {
        ChecksumException e11;
        a aVar = new a(bVar);
        FormatException formatException = null;
        try {
            return b(aVar, map);
        } catch (ChecksumException e12) {
            e11 = e12;
            try {
                aVar.f();
                aVar.g(true);
                aVar.e();
                aVar.d();
                aVar.b();
                kp.d b11 = b(aVar, map);
                b11.o(new g(true));
                return b11;
            } catch (ChecksumException | FormatException unused) {
                if (formatException != null) {
                    throw formatException;
                }
                throw e11;
            }
        } catch (FormatException e13) {
            e11 = null;
            formatException = e13;
            aVar.f();
            aVar.g(true);
            aVar.e();
            aVar.d();
            aVar.b();
            kp.d b112 = b(aVar, map);
            b112.o(new g(true));
            return b112;
        }
    }

    public kp.d e(boolean[][] zArr) throws ChecksumException, FormatException {
        return f(zArr, null);
    }

    public kp.d f(boolean[][] zArr, Map<DecodeHintType, ?> map) throws ChecksumException, FormatException {
        return d(kp.b.o(zArr), map);
    }
}
