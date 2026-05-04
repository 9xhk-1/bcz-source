package u50;

import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import kotlin.jvm.internal.g0;
import l60.k;
import m80.l;
import u30.f0;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {
    public static final boolean a(String str) {
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (g0.t(charAt, 31) <= 0 || g0.t(charAt, 127) >= 0 || k0.I3(" #%/:?@[\\]", charAt, 0, false, 6, null) != -1) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(String str, int i11, int i12, byte[] bArr, int i13) {
        int i14 = i13;
        while (i11 < i12) {
            if (i14 == bArr.length) {
                return false;
            }
            if (i14 != i13) {
                if (str.charAt(i11) != '.') {
                    return false;
                }
                i11++;
            }
            int i15 = i11;
            int i16 = 0;
            while (i15 < i12) {
                char charAt = str.charAt(i15);
                if (g0.t(charAt, 48) < 0 || g0.t(charAt, 57) > 0) {
                    break;
                }
                if ((i16 == 0 && i11 != i15) || (i16 = ((i16 * 10) + charAt) - 48) > 255) {
                    return false;
                }
                i15++;
            }
            if (i15 - i11 == 0) {
                return false;
            }
            bArr[i14] = (byte) i16;
            i14++;
            i11 = i15;
        }
        return i14 == i13 + 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        if (r11 == 16) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0093, code lost:
    
        if (r12 != (-1)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0095, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0096, code lost:
    
        r0 = r11 - r12;
        java.lang.System.arraycopy(r8, r12, r8, 16 - r0, r0);
        java.util.Arrays.fill(r8, r12, (16 - r11) + r12, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a6, code lost:
    
        return java.net.InetAddress.getByAddress(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.net.InetAddress c(java.lang.String r16, int r17, int r18) {
        /*
            r6 = r18
            r7 = 16
            byte[] r8 = new byte[r7]
            r9 = 0
            r10 = -1
            r2 = r17
            r11 = r9
            r12 = r10
            r13 = r12
        Ld:
            r14 = 0
            if (r2 >= r6) goto L91
            if (r11 != r7) goto L13
            return r14
        L13:
            int r15 = r2 + 2
            if (r15 > r6) goto L33
            r4 = 4
            r5 = 0
            java.lang.String r1 = "::"
            r3 = 0
            r0 = r16
            boolean r1 = u30.f0.I2(r0, r1, r2, r3, r4, r5)
            if (r1 == 0) goto L33
            if (r12 == r10) goto L27
            return r14
        L27:
            int r11 = r11 + 2
            if (r15 != r6) goto L2e
            r12 = r11
            goto L91
        L2e:
            r0 = r16
            r12 = r11
            r13 = r15
            goto L62
        L33:
            if (r11 == 0) goto L44
            r4 = 4
            r5 = 0
            java.lang.String r1 = ":"
            r3 = 0
            r0 = r16
            boolean r1 = u30.f0.I2(r0, r1, r2, r3, r4, r5)
            if (r1 == 0) goto L48
            int r2 = r2 + 1
        L44:
            r0 = r16
            r13 = r2
            goto L62
        L48:
            r4 = 4
            r5 = 0
            java.lang.String r1 = "."
            r3 = 0
            r0 = r16
            boolean r1 = u30.f0.I2(r0, r1, r2, r3, r4, r5)
            if (r1 == 0) goto L61
            int r1 = r11 + (-2)
            boolean r0 = b(r0, r13, r6, r8, r1)
            if (r0 != 0) goto L5e
            return r14
        L5e:
            int r11 = r11 + 2
            goto L91
        L61:
            return r14
        L62:
            r1 = r9
            r2 = r13
        L64:
            if (r2 >= r6) goto L76
            char r3 = r0.charAt(r2)
            int r3 = u50.f.R(r3)
            if (r3 == r10) goto L76
            int r1 = r1 << 4
            int r1 = r1 + r3
            int r2 = r2 + 1
            goto L64
        L76:
            int r3 = r2 - r13
            if (r3 == 0) goto L90
            r4 = 4
            if (r3 <= r4) goto L7e
            goto L90
        L7e:
            int r3 = r11 + 1
            int r4 = r1 >>> 8
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r8[r11] = r4
            int r11 = r11 + 2
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r8[r3] = r1
            goto Ld
        L90:
            return r14
        L91:
            if (r11 == r7) goto La2
            if (r12 != r10) goto L96
            return r14
        L96:
            int r0 = r11 - r12
            int r1 = 16 - r0
            java.lang.System.arraycopy(r8, r12, r8, r1, r0)
            int r7 = r7 - r11
            int r7 = r7 + r12
            java.util.Arrays.fill(r8, r12, r7, r9)
        La2:
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u50.a.c(java.lang.String, int, int):java.net.InetAddress");
    }

    public static final String d(byte[] bArr) {
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i13 < bArr.length) {
            int i15 = i13;
            while (i15 < 16 && bArr[i15] == 0 && bArr[i15 + 1] == 0) {
                i15 += 2;
            }
            int i16 = i15 - i13;
            if (i16 > i14 && i16 >= 4) {
                i11 = i13;
                i14 = i16;
            }
            i13 = i15 + 2;
        }
        k kVar = new k();
        while (i12 < bArr.length) {
            if (i12 == i11) {
                kVar.writeByte(58);
                i12 += i14;
                if (i12 == 16) {
                    kVar.writeByte(58);
                }
            } else {
                if (i12 > 0) {
                    kVar.writeByte(58);
                }
                kVar.p3((f.d(bArr[i12], 255) << 8) | f.d(bArr[i12 + 1], 255));
                i12 += 2;
            }
        }
        return kVar.R3();
    }

    @l
    public static final String e(@m80.k String str) {
        g0.p(str, "<this>");
        if (!k0.n3(str, ":", false, 2, null)) {
            try {
                String ascii = IDN.toASCII(str);
                g0.o(ascii, "toASCII(host)");
                Locale US = Locale.US;
                g0.o(US, "US");
                String lowerCase = ascii.toLowerCase(US);
                g0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                if (a(lowerCase)) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress c11 = (f0.J2(str, "[", false, 2, null) && f0.b2(str, "]", false, 2, null)) ? c(str, 1, str.length() - 1) : c(str, 0, str.length());
        if (c11 == null) {
            return null;
        }
        byte[] address = c11.getAddress();
        if (address.length == 16) {
            g0.o(address, "address");
            return d(address);
        }
        if (address.length == 4) {
            return c11.getHostAddress();
        }
        throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
    }
}
