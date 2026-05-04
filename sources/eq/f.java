package eq;

import com.google.zxing.WriterException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.pdf417.encoder.Compaction;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import kx.a0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final int f50084a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f50085b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f50086c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f50087d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f50088e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f50089f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final int f50090g = 3;

    /* renamed from: h, reason: collision with root package name */
    public static final int f50091h = 900;

    /* renamed from: i, reason: collision with root package name */
    public static final int f50092i = 901;

    /* renamed from: j, reason: collision with root package name */
    public static final int f50093j = 902;

    /* renamed from: k, reason: collision with root package name */
    public static final int f50094k = 913;

    /* renamed from: l, reason: collision with root package name */
    public static final int f50095l = 924;

    /* renamed from: m, reason: collision with root package name */
    public static final int f50096m = 925;

    /* renamed from: n, reason: collision with root package name */
    public static final int f50097n = 926;

    /* renamed from: o, reason: collision with root package name */
    public static final int f50098o = 927;

    /* renamed from: r, reason: collision with root package name */
    public static final byte[] f50101r;

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f50099p = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, a0.f68904b, 46, 36, 47, 43, s60.e.f88061c, 42, 61, 94, 0, 32, 0, 0, 0};

    /* renamed from: q, reason: collision with root package name */
    public static final byte[] f50100q = {59, 60, 62, 64, 91, 92, 93, s60.b.f88049h, 96, 126, 33, 13, 9, 44, 58, 10, a0.f68904b, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f50102s = new byte[128];

    /* renamed from: t, reason: collision with root package name */
    public static final Charset f50103t = StandardCharsets.ISO_8859_1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f50104a;

        static {
            int[] iArr = new int[Compaction.values().length];
            f50104a = iArr;
            try {
                iArr[Compaction.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50104a[Compaction.BYTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50104a[Compaction.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        byte[] bArr = new byte[128];
        f50101r = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            byte[] bArr2 = f50099p;
            if (i12 >= bArr2.length) {
                break;
            }
            byte b11 = bArr2[i12];
            if (b11 > 0) {
                f50101r[b11] = (byte) i12;
            }
            i12++;
        }
        Arrays.fill(f50102s, (byte) -1);
        while (true) {
            byte[] bArr3 = f50100q;
            if (i11 >= bArr3.length) {
                return;
            }
            byte b12 = bArr3[i11];
            if (b12 > 0) {
                f50102s[b12] = (byte) i11;
            }
            i11++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0028, code lost:
    
        return r1 - r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(java.lang.String r5, int r6, java.nio.charset.Charset r7) throws com.google.zxing.WriterException {
        /*
            java.nio.charset.CharsetEncoder r7 = r7.newEncoder()
            int r0 = r5.length()
            r1 = r6
        L9:
            if (r1 >= r0) goto L57
            char r2 = r5.charAt(r1)
            r3 = 0
        L10:
            r4 = 13
            if (r3 >= r4) goto L25
            boolean r2 = k(r2)
            if (r2 == 0) goto L25
            int r3 = r3 + 1
            int r2 = r1 + r3
            if (r2 >= r0) goto L25
            char r2 = r5.charAt(r2)
            goto L10
        L25:
            if (r3 < r4) goto L29
            int r1 = r1 - r6
            return r1
        L29:
            char r2 = r5.charAt(r1)
            boolean r3 = r7.canEncode(r2)
            if (r3 == 0) goto L36
            int r1 = r1 + 1
            goto L9
        L36:
            com.google.zxing.WriterException r5 = new com.google.zxing.WriterException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Non-encodable character detected: "
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r7 = " (Unicode: "
            r6.append(r7)
            r6.append(r2)
            r7 = 41
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L57:
            int r1 = r1 - r6
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: eq.f.a(java.lang.String, int, java.nio.charset.Charset):int");
    }

    public static int b(CharSequence charSequence, int i11) {
        int length = charSequence.length();
        int i12 = 0;
        if (i11 < length) {
            char charAt = charSequence.charAt(i11);
            while (k(charAt) && i11 < length) {
                i12++;
                i11++;
                if (i11 < length) {
                    charAt = charSequence.charAt(i11);
                }
            }
        }
        return i12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0027, code lost:
    
        return (r1 - r7) - r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(java.lang.CharSequence r6, int r7) {
        /*
            int r0 = r6.length()
            r1 = r7
        L5:
            if (r1 >= r0) goto L37
            char r2 = r6.charAt(r1)
            r3 = 0
        Lc:
            r4 = 13
            if (r3 >= r4) goto L23
            boolean r5 = k(r2)
            if (r5 == 0) goto L23
            if (r1 >= r0) goto L23
            int r3 = r3 + 1
            int r1 = r1 + 1
            if (r1 >= r0) goto Lc
            char r2 = r6.charAt(r1)
            goto Lc
        L23:
            if (r3 < r4) goto L28
            int r1 = r1 - r7
            int r1 = r1 - r3
            return r1
        L28:
            if (r3 > 0) goto L5
            char r2 = r6.charAt(r1)
            boolean r2 = n(r2)
            if (r2 == 0) goto L37
            int r1 = r1 + 1
            goto L5
        L37:
            int r1 = r1 - r7
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: eq.f.c(java.lang.CharSequence, int):int");
    }

    public static void d(byte[] bArr, int i11, int i12, int i13, StringBuilder sb2) {
        int i14;
        if (i12 == 1 && i13 == 0) {
            sb2.append((char) 913);
        } else if (i12 % 6 == 0) {
            sb2.append((char) 924);
        } else {
            sb2.append((char) 901);
        }
        if (i12 >= 6) {
            char[] cArr = new char[5];
            i14 = i11;
            while ((i11 + i12) - i14 >= 6) {
                long j11 = 0;
                for (int i15 = 0; i15 < 6; i15++) {
                    j11 = (j11 << 8) + (bArr[i14 + i15] & 255);
                }
                for (int i16 = 0; i16 < 5; i16++) {
                    cArr[i16] = (char) (j11 % 900);
                    j11 /= 900;
                }
                for (int i17 = 4; i17 >= 0; i17--) {
                    sb2.append(cArr[i17]);
                }
                i14 += 6;
            }
        } else {
            i14 = i11;
        }
        while (i14 < i11 + i12) {
            sb2.append((char) (bArr[i14] & 255));
            i14++;
        }
    }

    public static String e(String str, Compaction compaction, Charset charset) throws WriterException {
        CharacterSetECI characterSetECIByName;
        StringBuilder sb2 = new StringBuilder(str.length());
        if (charset == null) {
            charset = f50103t;
        } else if (!f50103t.equals(charset) && (characterSetECIByName = CharacterSetECI.getCharacterSetECIByName(charset.name())) != null) {
            h(characterSetECIByName.getValue(), sb2);
        }
        int length = str.length();
        int i11 = a.f50104a[compaction.ordinal()];
        if (i11 == 1) {
            g(str, 0, length, sb2, 0);
        } else if (i11 == 2) {
            byte[] bytes = str.getBytes(charset);
            d(bytes, 0, bytes.length, 1, sb2);
        } else if (i11 != 3) {
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i12 < length) {
                int b11 = b(str, i12);
                if (b11 >= 13) {
                    sb2.append((char) 902);
                    f(str, i12, b11, sb2);
                    i12 += b11;
                    i13 = 0;
                    i14 = 2;
                } else {
                    int c11 = c(str, i12);
                    if (c11 >= 5 || b11 == length) {
                        if (i14 != 0) {
                            sb2.append((char) 900);
                            i13 = 0;
                            i14 = 0;
                        }
                        i13 = g(str, i12, c11, sb2, i13);
                        i12 += c11;
                    } else {
                        int a11 = a(str, i12, charset);
                        if (a11 == 0) {
                            a11 = 1;
                        }
                        int i15 = a11 + i12;
                        byte[] bytes2 = str.substring(i12, i15).getBytes(charset);
                        if (bytes2.length == 1 && i14 == 0) {
                            d(bytes2, 0, 1, 0, sb2);
                        } else {
                            d(bytes2, 0, bytes2.length, i14, sb2);
                            i14 = 1;
                            i13 = 0;
                        }
                        i12 = i15;
                    }
                }
            }
        } else {
            sb2.append((char) 902);
            f(str, 0, length, sb2);
        }
        return sb2.toString();
    }

    public static void f(String str, int i11, int i12, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder((i12 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900L);
        BigInteger valueOf2 = BigInteger.valueOf(0L);
        int i13 = 0;
        while (i13 < i12) {
            sb3.setLength(0);
            int min = Math.min(44, i12 - i13);
            StringBuilder sb4 = new StringBuilder("1");
            int i14 = i11 + i13;
            sb4.append(str.substring(i14, i14 + min));
            BigInteger bigInteger = new BigInteger(sb4.toString());
            do {
                sb3.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            for (int length = sb3.length() - 1; length >= 0; length--) {
                sb2.append(sb3.charAt(length));
            }
            i13 += min;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00f4 A[EDGE_INSN: B:21:0x00f4->B:22:0x00f4 BREAK  A[LOOP:0: B:2:0x000f->B:16:0x000f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x000f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int g(java.lang.CharSequence r16, int r17, int r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eq.f.g(java.lang.CharSequence, int, int, java.lang.StringBuilder, int):int");
    }

    public static void h(int i11, StringBuilder sb2) throws WriterException {
        if (i11 >= 0 && i11 < 900) {
            sb2.append((char) 927);
            sb2.append((char) i11);
        } else if (i11 < 810900) {
            sb2.append((char) 926);
            sb2.append((char) ((i11 / 900) - 1));
            sb2.append((char) (i11 % 900));
        } else {
            if (i11 >= 811800) {
                throw new WriterException("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf(i11)));
            }
            sb2.append((char) 925);
            sb2.append((char) (810900 - i11));
        }
    }

    public static boolean i(char c11) {
        if (c11 != ' ') {
            return c11 >= 'a' && c11 <= 'z';
        }
        return true;
    }

    public static boolean j(char c11) {
        if (c11 != ' ') {
            return c11 >= 'A' && c11 <= 'Z';
        }
        return true;
    }

    public static boolean k(char c11) {
        return c11 >= '0' && c11 <= '9';
    }

    public static boolean l(char c11) {
        return f50101r[c11] != -1;
    }

    public static boolean m(char c11) {
        return f50102s[c11] != -1;
    }

    public static boolean n(char c11) {
        if (c11 == '\t' || c11 == '\n' || c11 == '\r') {
            return true;
        }
        return c11 >= ' ' && c11 <= '~';
    }
}
