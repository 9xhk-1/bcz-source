package qp;

import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final char f82604a = 129;

    /* renamed from: b, reason: collision with root package name */
    public static final char f82605b = 230;

    /* renamed from: c, reason: collision with root package name */
    public static final char f82606c = 231;

    /* renamed from: d, reason: collision with root package name */
    public static final char f82607d = 235;

    /* renamed from: e, reason: collision with root package name */
    public static final char f82608e = 236;

    /* renamed from: f, reason: collision with root package name */
    public static final char f82609f = 237;

    /* renamed from: g, reason: collision with root package name */
    public static final char f82610g = 238;

    /* renamed from: h, reason: collision with root package name */
    public static final char f82611h = 239;

    /* renamed from: i, reason: collision with root package name */
    public static final char f82612i = 240;

    /* renamed from: j, reason: collision with root package name */
    public static final char f82613j = 254;

    /* renamed from: k, reason: collision with root package name */
    public static final char f82614k = 254;

    /* renamed from: l, reason: collision with root package name */
    public static final String f82615l = "[)>\u001e05\u001d";

    /* renamed from: m, reason: collision with root package name */
    public static final String f82616m = "[)>\u001e06\u001d";

    /* renamed from: n, reason: collision with root package name */
    public static final String f82617n = "\u001e\u0004";

    /* renamed from: o, reason: collision with root package name */
    public static final int f82618o = 0;

    /* renamed from: p, reason: collision with root package name */
    public static final int f82619p = 1;

    /* renamed from: q, reason: collision with root package name */
    public static final int f82620q = 2;

    /* renamed from: r, reason: collision with root package name */
    public static final int f82621r = 3;

    /* renamed from: s, reason: collision with root package name */
    public static final int f82622s = 4;

    /* renamed from: t, reason: collision with root package name */
    public static final int f82623t = 5;

    public static int a(CharSequence charSequence, int i11) {
        int length = charSequence.length();
        int i12 = 0;
        if (i11 < length) {
            char charAt = charSequence.charAt(i11);
            while (g(charAt) && i11 < length) {
                i12++;
                i11++;
                if (i11 < length) {
                    charAt = charSequence.charAt(i11);
                }
            }
        }
        return i12;
    }

    public static String b(String str) {
        return c(str, SymbolShapeHint.FORCE_NONE, null, null);
    }

    public static String c(String str, SymbolShapeHint symbolShapeHint, com.google.zxing.c cVar, com.google.zxing.c cVar2) {
        int i11 = 0;
        g[] gVarArr = {new a(), new c(), new l(), new m(), new f(), new b()};
        h hVar = new h(str);
        hVar.o(symbolShapeHint);
        hVar.m(cVar, cVar2);
        if (str.startsWith(f82615l) && str.endsWith(f82617n)) {
            hVar.s(f82608e);
            hVar.n(2);
            hVar.f82595f += 7;
        } else if (str.startsWith(f82616m) && str.endsWith(f82617n)) {
            hVar.s(f82609f);
            hVar.n(2);
            hVar.f82595f += 7;
        }
        while (hVar.j()) {
            gVarArr[i11].a(hVar);
            if (hVar.f() >= 0) {
                i11 = hVar.f();
                hVar.k();
            }
        }
        int a11 = hVar.a();
        hVar.q();
        int b11 = hVar.h().b();
        if (a11 < b11 && i11 != 0 && i11 != 5 && i11 != 4) {
            hVar.s((char) 254);
        }
        StringBuilder b12 = hVar.b();
        if (b12.length() < b11) {
            b12.append(f82604a);
        }
        while (b12.length() < b11) {
            b12.append(p(f82604a, b12.length() + 1));
        }
        return hVar.b().toString();
    }

    public static int d(float[] fArr, int[] iArr, int i11, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        for (int i12 = 0; i12 < 6; i12++) {
            int ceil = (int) Math.ceil(fArr[i12]);
            iArr[i12] = ceil;
            if (i11 > ceil) {
                Arrays.fill(bArr, (byte) 0);
                i11 = ceil;
            }
            if (i11 == ceil) {
                bArr[i12] = (byte) (bArr[i12] + 1);
            }
        }
        return i11;
    }

    public static int e(byte[] bArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < 6; i12++) {
            i11 += bArr[i12];
        }
        return i11;
    }

    public static void f(char c11) {
        String hexString = Integer.toHexString(c11);
        throw new IllegalArgumentException("Illegal character: " + c11 + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    public static boolean g(char c11) {
        return c11 >= '0' && c11 <= '9';
    }

    public static boolean h(char c11) {
        return c11 >= 128 && c11 <= 255;
    }

    public static boolean i(char c11) {
        if (c11 == ' ') {
            return true;
        }
        if (c11 < '0' || c11 > '9') {
            return c11 >= 'A' && c11 <= 'Z';
        }
        return true;
    }

    public static boolean j(char c11) {
        return c11 >= ' ' && c11 <= '^';
    }

    public static boolean k(char c11) {
        if (c11 == ' ') {
            return true;
        }
        if (c11 < '0' || c11 > '9') {
            return c11 >= 'a' && c11 <= 'z';
        }
        return true;
    }

    public static boolean l(char c11) {
        if (n(c11) || c11 == ' ') {
            return true;
        }
        if (c11 < '0' || c11 > '9') {
            return c11 >= 'A' && c11 <= 'Z';
        }
        return true;
    }

    public static boolean m(char c11) {
        return false;
    }

    public static boolean n(char c11) {
        return c11 == '\r' || c11 == '*' || c11 == '>';
    }

    public static int o(CharSequence charSequence, int i11, int i12) {
        float[] fArr;
        float f11;
        int i13;
        if (i11 >= charSequence.length()) {
            return i12;
        }
        float f12 = 2.0f;
        float f13 = 1.0f;
        int i14 = 5;
        if (i12 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[6];
            fArr[0] = 1.0f;
            fArr[1] = 2.0f;
            fArr[2] = 2.0f;
            fArr[3] = 2.0f;
            fArr[4] = 2.0f;
            fArr[5] = 2.25f;
            fArr[i12] = 0.0f;
        }
        int i15 = 0;
        while (true) {
            int i16 = i11 + i15;
            if (i16 == charSequence.length()) {
                byte[] bArr = new byte[6];
                int[] iArr = new int[6];
                int d11 = d(fArr, iArr, Integer.MAX_VALUE, bArr);
                int e11 = e(bArr);
                if (iArr[0] == d11) {
                    return 0;
                }
                if (e11 == 1 && bArr[i14] > 0) {
                    return i14;
                }
                if (e11 == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (e11 != 1 || bArr[2] <= 0) {
                    return (e11 != 1 || bArr[3] <= 0) ? 1 : 3;
                }
                return 2;
            }
            char charAt = charSequence.charAt(i16);
            i15++;
            if (g(charAt)) {
                fArr[0] = fArr[0] + 0.5f;
                f11 = f13;
                i13 = i14;
            } else if (h(charAt)) {
                f11 = f13;
                i13 = i14;
                float ceil = (float) Math.ceil(fArr[0]);
                fArr[0] = ceil;
                fArr[0] = ceil + f12;
            } else {
                f11 = f13;
                i13 = i14;
                float ceil2 = (float) Math.ceil(fArr[0]);
                fArr[0] = ceil2;
                fArr[0] = ceil2 + f11;
            }
            if (i(charAt)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (h(charAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (k(charAt)) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (h(charAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (l(charAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (h(charAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (j(charAt)) {
                fArr[4] = fArr[4] + 0.75f;
            } else if (h(charAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            if (m(charAt)) {
                fArr[i13] = fArr[i13] + 4.0f;
            } else {
                fArr[i13] = fArr[i13] + f11;
            }
            if (i15 >= 4) {
                int[] iArr2 = new int[6];
                byte[] bArr2 = new byte[6];
                d(fArr, iArr2, Integer.MAX_VALUE, bArr2);
                int e12 = e(bArr2);
                int i17 = iArr2[0];
                int i18 = iArr2[i13];
                if (i17 < i18 && i17 < iArr2[1] && i17 < iArr2[2] && i17 < iArr2[3] && i17 < iArr2[4]) {
                    return 0;
                }
                if (i18 < i17) {
                    break;
                }
                byte b11 = bArr2[1];
                byte b12 = bArr2[2];
                byte b13 = bArr2[3];
                byte b14 = bArr2[4];
                if (b11 + b12 + b13 + b14 == 0) {
                    break;
                }
                if (e12 == 1 && b14 > 0) {
                    return 4;
                }
                if (e12 == 1 && b12 > 0) {
                    return 2;
                }
                if (e12 == 1 && b13 > 0) {
                    return 3;
                }
                int i19 = iArr2[1];
                if (i19 + 1 < i17 && i19 + 1 < i18 && i19 + 1 < iArr2[4] && i19 + 1 < iArr2[2]) {
                    int i21 = iArr2[3];
                    if (i19 < i21) {
                        return 1;
                    }
                    if (i19 == i21) {
                        for (int i22 = i11 + i15 + 1; i22 < charSequence.length(); i22++) {
                            char charAt2 = charSequence.charAt(i22);
                            if (n(charAt2)) {
                                return 3;
                            }
                            if (!l(charAt2)) {
                                break;
                            }
                        }
                        return 1;
                    }
                }
            }
            f13 = f11;
            i14 = i13;
            f12 = 2.0f;
        }
        return i13;
    }

    public static char p(char c11, int i11) {
        int i12 = c11 + ((i11 * 149) % 253) + 1;
        if (i12 > 254) {
            i12 -= 254;
        }
        return (char) i12;
    }
}
