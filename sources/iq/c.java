package iq;

import com.google.zxing.WriterException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import com.jiongji.andriod.card.R;
import gq.h;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f62672a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* renamed from: b, reason: collision with root package name */
    public static final String f62673b = "ISO-8859-1";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f62674a;

        static {
            int[] iArr = new int[Mode.values().length];
            f62674a = iArr;
            try {
                iArr[Mode.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62674a[Mode.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62674a[Mode.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f62674a[Mode.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static void a(String str, kp.a aVar, String str2) throws WriterException {
        try {
            for (byte b11 : str.getBytes(str2)) {
                aVar.c(b11, 8);
            }
        } catch (UnsupportedEncodingException e11) {
            throw new WriterException(e11);
        }
    }

    public static void b(CharSequence charSequence, kp.a aVar) throws WriterException {
        int length = charSequence.length();
        int i11 = 0;
        while (i11 < length) {
            int r11 = r(charSequence.charAt(i11));
            if (r11 == -1) {
                throw new WriterException();
            }
            int i12 = i11 + 1;
            if (i12 < length) {
                int r12 = r(charSequence.charAt(i12));
                if (r12 == -1) {
                    throw new WriterException();
                }
                aVar.c((r11 * 45) + r12, 11);
                i11 += 2;
            } else {
                aVar.c(r11, 6);
                i11 = i12;
            }
        }
    }

    public static void c(String str, Mode mode, kp.a aVar, String str2) throws WriterException {
        int i11 = a.f62674a[mode.ordinal()];
        if (i11 == 1) {
            h(str, aVar);
            return;
        }
        if (i11 == 2) {
            b(str, aVar);
        } else if (i11 == 3) {
            a(str, aVar, str2);
        } else {
            if (i11 != 4) {
                throw new WriterException("Invalid mode: ".concat(String.valueOf(mode)));
            }
            e(str, aVar);
        }
    }

    public static void d(CharacterSetECI characterSetECI, kp.a aVar) {
        aVar.c(Mode.ECI.getBits(), 4);
        aVar.c(characterSetECI.getValue(), 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[LOOP:0: B:4:0x0008->B:11:0x0035, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0044 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(java.lang.String r6, kp.a r7) throws com.google.zxing.WriterException {
        /*
            java.lang.String r0 = "Shift_JIS"
            byte[] r6 = r6.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L4d
            int r0 = r6.length
            r1 = 0
        L8:
            if (r1 >= r0) goto L4c
            r2 = r6[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 + 1
            r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r2 = r2 | r3
            r3 = 33088(0x8140, float:4.6366E-41)
            r4 = -1
            if (r2 < r3) goto L24
            r5 = 40956(0x9ffc, float:5.7392E-41)
            if (r2 > r5) goto L24
        L22:
            int r2 = r2 - r3
            goto L33
        L24:
            r3 = 57408(0xe040, float:8.0446E-41)
            if (r2 < r3) goto L32
            r3 = 60351(0xebbf, float:8.457E-41)
            if (r2 > r3) goto L32
            r3 = 49472(0xc140, float:6.9325E-41)
            goto L22
        L32:
            r2 = r4
        L33:
            if (r2 == r4) goto L44
            int r3 = r2 >> 8
            int r3 = r3 * 192
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r2
            r2 = 13
            r7.c(r3, r2)
            int r1 = r1 + 2
            goto L8
        L44:
            com.google.zxing.WriterException r6 = new com.google.zxing.WriterException
            java.lang.String r7 = "Invalid byte sequence"
            r6.<init>(r7)
            throw r6
        L4c:
            return
        L4d:
            r6 = move-exception
            com.google.zxing.WriterException r7 = new com.google.zxing.WriterException
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: iq.c.e(java.lang.String, kp.a):void");
    }

    public static void f(int i11, h hVar, Mode mode, kp.a aVar) throws WriterException {
        int characterCountBits = mode.getCharacterCountBits(hVar);
        int i12 = 1 << characterCountBits;
        if (i11 < i12) {
            aVar.c(i11, characterCountBits);
            return;
        }
        throw new WriterException(i11 + " is bigger than " + (i12 - 1));
    }

    public static void g(Mode mode, kp.a aVar) {
        aVar.c(mode.getBits(), 4);
    }

    public static void h(CharSequence charSequence, kp.a aVar) {
        int length = charSequence.length();
        int i11 = 0;
        while (i11 < length) {
            int charAt = charSequence.charAt(i11) - '0';
            int i12 = i11 + 2;
            if (i12 < length) {
                aVar.c((charAt * 100) + ((charSequence.charAt(i11 + 1) - '0') * 10) + (charSequence.charAt(i12) - '0'), 10);
                i11 += 3;
            } else {
                i11++;
                if (i11 < length) {
                    aVar.c((charAt * 10) + (charSequence.charAt(i11) - '0'), 7);
                    i11 = i12;
                } else {
                    aVar.c(charAt, 4);
                }
            }
        }
    }

    public static int i(Mode mode, kp.a aVar, kp.a aVar2, h hVar) {
        return aVar.m() + mode.getCharacterCountBits(hVar) + aVar2.m();
    }

    public static int j(b bVar) {
        return d.a(bVar) + d.c(bVar) + d.d(bVar) + d.e(bVar);
    }

    public static int k(kp.a aVar, ErrorCorrectionLevel errorCorrectionLevel, h hVar, b bVar) throws WriterException {
        int i11 = Integer.MAX_VALUE;
        int i12 = -1;
        for (int i13 = 0; i13 < 8; i13++) {
            e.a(aVar, errorCorrectionLevel, hVar, i13, bVar);
            int j11 = j(bVar);
            if (j11 < i11) {
                i12 = i13;
                i11 = j11;
            }
        }
        return i12;
    }

    public static Mode l(String str) {
        return m(str, null);
    }

    public static Mode m(String str, String str2) {
        if ("Shift_JIS".equals(str2) && u(str)) {
            return Mode.KANJI;
        }
        boolean z11 = false;
        boolean z12 = false;
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            if (charAt >= '0' && charAt <= '9') {
                z12 = true;
            } else {
                if (r(charAt) == -1) {
                    return Mode.BYTE;
                }
                z11 = true;
            }
        }
        return z11 ? Mode.ALPHANUMERIC : z12 ? Mode.NUMERIC : Mode.BYTE;
    }

    public static h n(int i11, ErrorCorrectionLevel errorCorrectionLevel) throws WriterException {
        for (int i12 = 1; i12 <= 40; i12++) {
            h i13 = h.i(i12);
            if (x(i11, i13, errorCorrectionLevel)) {
                return i13;
            }
        }
        throw new WriterException("Data too big");
    }

    public static f o(String str, ErrorCorrectionLevel errorCorrectionLevel) throws WriterException {
        return p(str, errorCorrectionLevel, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static iq.f p(java.lang.String r6, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel r7, java.util.Map<com.google.zxing.EncodeHintType, ?> r8) throws com.google.zxing.WriterException {
        /*
            if (r8 == 0) goto Lc
            com.google.zxing.EncodeHintType r0 = com.google.zxing.EncodeHintType.CHARACTER_SET
            boolean r0 = r8.containsKey(r0)
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 == 0) goto L1a
            com.google.zxing.EncodeHintType r1 = com.google.zxing.EncodeHintType.CHARACTER_SET
            java.lang.Object r1 = r8.get(r1)
            java.lang.String r1 = r1.toString()
            goto L1c
        L1a:
            java.lang.String r1 = "ISO-8859-1"
        L1c:
            com.google.zxing.qrcode.decoder.Mode r2 = m(r6, r1)
            kp.a r3 = new kp.a
            r3.<init>()
            com.google.zxing.qrcode.decoder.Mode r4 = com.google.zxing.qrcode.decoder.Mode.BYTE
            if (r2 != r4) goto L34
            if (r0 == 0) goto L34
            com.google.zxing.common.CharacterSetECI r0 = com.google.zxing.common.CharacterSetECI.getCharacterSetECIByName(r1)
            if (r0 == 0) goto L34
            d(r0, r3)
        L34:
            if (r8 == 0) goto L55
            com.google.zxing.EncodeHintType r0 = com.google.zxing.EncodeHintType.GS1_FORMAT
            boolean r5 = r8.containsKey(r0)
            if (r5 == 0) goto L55
            java.lang.Object r0 = r8.get(r0)
            java.lang.String r0 = r0.toString()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L55
            com.google.zxing.qrcode.decoder.Mode r0 = com.google.zxing.qrcode.decoder.Mode.FNC1_FIRST_POSITION
            g(r0, r3)
        L55:
            g(r2, r3)
            kp.a r0 = new kp.a
            r0.<init>()
            c(r6, r2, r0, r1)
            if (r8 == 0) goto L8d
            com.google.zxing.EncodeHintType r1 = com.google.zxing.EncodeHintType.QR_VERSION
            boolean r5 = r8.containsKey(r1)
            if (r5 == 0) goto L8d
            java.lang.Object r8 = r8.get(r1)
            java.lang.String r8 = r8.toString()
            int r8 = java.lang.Integer.parseInt(r8)
            gq.h r8 = gq.h.i(r8)
            int r1 = i(r2, r3, r0, r8)
            boolean r1 = x(r1, r8, r7)
            if (r1 == 0) goto L85
            goto L91
        L85:
            com.google.zxing.WriterException r6 = new com.google.zxing.WriterException
            java.lang.String r7 = "Data too big for requested version"
            r6.<init>(r7)
            throw r6
        L8d:
            gq.h r8 = v(r7, r2, r3, r0)
        L91:
            kp.a r1 = new kp.a
            r1.<init>()
            r1.b(r3)
            if (r2 != r4) goto La0
            int r6 = r0.n()
            goto La4
        La0:
            int r6 = r6.length()
        La4:
            f(r6, r8, r2, r1)
            r1.b(r0)
            gq.h$b r6 = r8.f(r7)
            int r0 = r8.h()
            int r3 = r6.d()
            int r0 = r0 - r3
            w(r0, r1)
            int r3 = r8.h()
            int r6 = r6.c()
            kp.a r6 = t(r1, r3, r0, r6)
            iq.f r0 = new iq.f
            r0.<init>()
            r0.g(r7)
            r0.j(r2)
            r0.k(r8)
            int r1 = r8.e()
            iq.b r2 = new iq.b
            r2.<init>(r1, r1)
            int r1 = k(r6, r7, r8, r2)
            r0.h(r1)
            iq.e.a(r6, r7, r8, r1, r2)
            r0.i(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: iq.c.p(java.lang.String, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel, java.util.Map):iq.f");
    }

    public static byte[] q(byte[] bArr, int i11) {
        int length = bArr.length;
        int[] iArr = new int[length + i11];
        for (int i12 = 0; i12 < length; i12++) {
            iArr[i12] = bArr[i12] & 255;
        }
        new mp.d(mp.a.f73615l).b(iArr, i11);
        byte[] bArr2 = new byte[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            bArr2[i13] = (byte) iArr[length + i13];
        }
        return bArr2;
    }

    public static int r(int i11) {
        int[] iArr = f62672a;
        if (i11 < iArr.length) {
            return iArr[i11];
        }
        return -1;
    }

    public static void s(int i11, int i12, int i13, int i14, int[] iArr, int[] iArr2) throws WriterException {
        if (i14 >= i13) {
            throw new WriterException("Block ID too large");
        }
        int i15 = i11 % i13;
        int i16 = i13 - i15;
        int i17 = i11 / i13;
        int i18 = i17 + 1;
        int i19 = i12 / i13;
        int i21 = i19 + 1;
        int i22 = i17 - i19;
        int i23 = i18 - i21;
        if (i22 != i23) {
            throw new WriterException("EC bytes mismatch");
        }
        if (i13 != i16 + i15) {
            throw new WriterException("RS blocks mismatch");
        }
        if (i11 != ((i19 + i22) * i16) + ((i21 + i23) * i15)) {
            throw new WriterException("Total bytes mismatch");
        }
        if (i14 < i16) {
            iArr[0] = i19;
            iArr2[0] = i22;
        } else {
            iArr[0] = i21;
            iArr2[0] = i23;
        }
    }

    public static kp.a t(kp.a aVar, int i11, int i12, int i13) throws WriterException {
        if (aVar.n() != i12) {
            throw new WriterException("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i13);
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i14 < i13) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            int i18 = i11;
            int i19 = i12;
            int i21 = i13;
            s(i18, i19, i21, i14, iArr, iArr2);
            int i22 = iArr[0];
            byte[] bArr = new byte[i22];
            aVar.v(i15 << 3, bArr, 0, i22);
            byte[] q11 = q(bArr, iArr2[0]);
            arrayList.add(new iq.a(bArr, q11));
            i16 = Math.max(i16, i22);
            i17 = Math.max(i17, q11.length);
            i15 += iArr[0];
            i14++;
            i11 = i18;
            i12 = i19;
            i13 = i21;
        }
        int i23 = i11;
        if (i12 != i15) {
            throw new WriterException("Data bytes does not match offset");
        }
        kp.a aVar2 = new kp.a();
        for (int i24 = 0; i24 < i16; i24++) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] a11 = ((iq.a) it.next()).a();
                if (i24 < a11.length) {
                    aVar2.c(a11[i24], 8);
                }
            }
        }
        for (int i25 = 0; i25 < i17; i25++) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] b11 = ((iq.a) it2.next()).b();
                if (i25 < b11.length) {
                    aVar2.c(b11[i25], 8);
                }
            }
        }
        if (i23 == aVar2.n()) {
            return aVar2;
        }
        throw new WriterException("Interleaving error: " + i23 + " and " + aVar2.n() + " differ.");
    }

    public static boolean u(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i11 = 0; i11 < length; i11 += 2) {
                int i12 = bytes[i11] & 255;
                if ((i12 < 129 || i12 > 159) && (i12 < 224 || i12 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    public static h v(ErrorCorrectionLevel errorCorrectionLevel, Mode mode, kp.a aVar, kp.a aVar2) throws WriterException {
        return n(i(mode, aVar, aVar2, n(i(mode, aVar, aVar2, h.i(1)), errorCorrectionLevel)), errorCorrectionLevel);
    }

    public static void w(int i11, kp.a aVar) throws WriterException {
        int i12 = i11 << 3;
        if (aVar.m() > i12) {
            throw new WriterException("data bits cannot fit in the QR Code" + aVar.m() + " > " + i12);
        }
        for (int i13 = 0; i13 < 4 && aVar.m() < i12; i13++) {
            aVar.a(false);
        }
        int m11 = aVar.m() & 7;
        if (m11 > 0) {
            while (m11 < 8) {
                aVar.a(false);
                m11++;
            }
        }
        int n11 = i11 - aVar.n();
        for (int i14 = 0; i14 < n11; i14++) {
            aVar.c((i14 & 1) == 0 ? R.styleable.Theme_drawable_tab_mall_1111 : 17, 8);
        }
        if (aVar.m() != i12) {
            throw new WriterException("Bits size does not equal capacity");
        }
    }

    public static boolean x(int i11, h hVar, ErrorCorrectionLevel errorCorrectionLevel) {
        return hVar.h() - hVar.f(errorCorrectionLevel).d() >= (i11 + 7) / 8;
    }
}
