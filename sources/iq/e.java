package iq;

import com.google.zxing.WriterException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import gq.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final int[][] f62679a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* renamed from: b, reason: collision with root package name */
    public static final int[][] f62680b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* renamed from: c, reason: collision with root package name */
    public static final int[][] f62681c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* renamed from: d, reason: collision with root package name */
    public static final int[][] f62682d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* renamed from: e, reason: collision with root package name */
    public static final int f62683e = 7973;

    /* renamed from: f, reason: collision with root package name */
    public static final int f62684f = 1335;

    /* renamed from: g, reason: collision with root package name */
    public static final int f62685g = 21522;

    public static void a(kp.a aVar, ErrorCorrectionLevel errorCorrectionLevel, h hVar, int i11, b bVar) throws WriterException {
        c(bVar);
        d(hVar, bVar);
        l(errorCorrectionLevel, i11, bVar);
        s(hVar, bVar);
        f(aVar, i11, bVar);
    }

    public static int b(int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int n11 = n(i12);
        int i13 = i11 << (n11 - 1);
        while (n(i13) >= n11) {
            i13 ^= i12 << (n(i13) - n11);
        }
        return i13;
    }

    public static void c(b bVar) {
        bVar.a((byte) -1);
    }

    public static void d(h hVar, b bVar) throws WriterException {
        j(bVar);
        e(bVar);
        r(hVar, bVar);
        k(bVar);
    }

    public static void e(b bVar) throws WriterException {
        if (bVar.b(8, bVar.d() - 8) == 0) {
            throw new WriterException();
        }
        bVar.g(8, bVar.d() - 8, 1);
    }

    public static void f(kp.a aVar, int i11, b bVar) throws WriterException {
        boolean z11;
        int e11 = bVar.e() - 1;
        int d11 = bVar.d() - 1;
        int i12 = 0;
        int i13 = -1;
        while (e11 > 0) {
            if (e11 == 6) {
                e11--;
            }
            while (d11 >= 0 && d11 < bVar.d()) {
                for (int i14 = 0; i14 < 2; i14++) {
                    int i15 = e11 - i14;
                    if (o(bVar.b(i15, d11))) {
                        if (i12 < aVar.m()) {
                            z11 = aVar.h(i12);
                            i12++;
                        } else {
                            z11 = false;
                        }
                        if (i11 != -1 && d.f(i11, i15, d11)) {
                            z11 = !z11;
                        }
                        bVar.h(i15, d11, z11);
                    }
                }
                d11 += i13;
            }
            i13 = -i13;
            d11 += i13;
            e11 -= 2;
        }
        if (i12 == aVar.m()) {
            return;
        }
        throw new WriterException("Not all bits consumed: " + i12 + '/' + aVar.m());
    }

    public static void g(int i11, int i12, b bVar) throws WriterException {
        for (int i13 = 0; i13 < 8; i13++) {
            int i14 = i11 + i13;
            if (!o(bVar.b(i14, i12))) {
                throw new WriterException();
            }
            bVar.g(i14, i12, 0);
        }
    }

    public static void h(int i11, int i12, b bVar) {
        for (int i13 = 0; i13 < 5; i13++) {
            int[] iArr = f62680b[i13];
            for (int i14 = 0; i14 < 5; i14++) {
                bVar.g(i11 + i14, i12 + i13, iArr[i14]);
            }
        }
    }

    public static void i(int i11, int i12, b bVar) {
        for (int i13 = 0; i13 < 7; i13++) {
            int[] iArr = f62679a[i13];
            for (int i14 = 0; i14 < 7; i14++) {
                bVar.g(i11 + i14, i12 + i13, iArr[i14]);
            }
        }
    }

    public static void j(b bVar) throws WriterException {
        int length = f62679a[0].length;
        i(0, 0, bVar);
        i(bVar.e() - length, 0, bVar);
        i(0, bVar.e() - length, bVar);
        g(0, 7, bVar);
        g(bVar.e() - 8, 7, bVar);
        g(0, bVar.e() - 8, bVar);
        m(7, 0, bVar);
        m(bVar.d() - 8, 0, bVar);
        m(7, bVar.d() - 7, bVar);
    }

    public static void k(b bVar) {
        int i11 = 8;
        while (i11 < bVar.e() - 8) {
            int i12 = i11 + 1;
            int i13 = i12 % 2;
            if (o(bVar.b(i11, 6))) {
                bVar.g(i11, 6, i13);
            }
            if (o(bVar.b(6, i11))) {
                bVar.g(6, i11, i13);
            }
            i11 = i12;
        }
    }

    public static void l(ErrorCorrectionLevel errorCorrectionLevel, int i11, b bVar) throws WriterException {
        kp.a aVar = new kp.a();
        p(errorCorrectionLevel, i11, aVar);
        for (int i12 = 0; i12 < aVar.m(); i12++) {
            boolean h11 = aVar.h((aVar.m() - 1) - i12);
            int[] iArr = f62682d[i12];
            bVar.h(iArr[0], iArr[1], h11);
            if (i12 < 8) {
                bVar.h((bVar.e() - i12) - 1, 8, h11);
            } else {
                bVar.h(8, (bVar.d() - 7) + (i12 - 8), h11);
            }
        }
    }

    public static void m(int i11, int i12, b bVar) throws WriterException {
        for (int i13 = 0; i13 < 7; i13++) {
            int i14 = i12 + i13;
            if (!o(bVar.b(i11, i14))) {
                throw new WriterException();
            }
            bVar.g(i11, i14, 0);
        }
    }

    public static int n(int i11) {
        return 32 - Integer.numberOfLeadingZeros(i11);
    }

    public static boolean o(int i11) {
        return i11 == -1;
    }

    public static void p(ErrorCorrectionLevel errorCorrectionLevel, int i11, kp.a aVar) throws WriterException {
        if (!f.f(i11)) {
            throw new WriterException("Invalid mask pattern");
        }
        int bits = (errorCorrectionLevel.getBits() << 3) | i11;
        aVar.c(bits, 5);
        aVar.c(b(bits, f62684f), 10);
        kp.a aVar2 = new kp.a();
        aVar2.c(21522, 15);
        aVar.w(aVar2);
        if (aVar.m() == 15) {
            return;
        }
        throw new WriterException("should not happen but we got: " + aVar.m());
    }

    public static void q(h hVar, kp.a aVar) throws WriterException {
        aVar.c(hVar.j(), 6);
        aVar.c(b(hVar.j(), f62683e), 12);
        if (aVar.m() == 18) {
            return;
        }
        throw new WriterException("should not happen but we got: " + aVar.m());
    }

    public static void r(h hVar, b bVar) {
        if (hVar.j() < 2) {
            return;
        }
        int[] iArr = f62681c[hVar.j() - 1];
        for (int i11 : iArr) {
            if (i11 >= 0) {
                for (int i12 : iArr) {
                    if (i12 >= 0 && o(bVar.b(i12, i11))) {
                        h(i12 - 2, i11 - 2, bVar);
                    }
                }
            }
        }
    }

    public static void s(h hVar, b bVar) throws WriterException {
        if (hVar.j() < 7) {
            return;
        }
        kp.a aVar = new kp.a();
        q(hVar, aVar);
        int i11 = 17;
        for (int i12 = 0; i12 < 6; i12++) {
            for (int i13 = 0; i13 < 3; i13++) {
                boolean h11 = aVar.h(i11);
                i11--;
                bVar.h(i12, (bVar.d() - 11) + i13, h11);
                bVar.h((bVar.d() - 11) + i13, i12, h11);
            }
        }
    }
}
