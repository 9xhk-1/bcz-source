package u30;

import androidx.collection.SieveCacheKt;
import kotlin.KotlinNothingValueException;
import u30.i;
import yz.c2;
import yz.j2;
import yz.w1;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nHexExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,1237:1\n1186#1,7:1239\n1186#1,7:1246\n1186#1,7:1253\n1186#1,7:1260\n1186#1,7:1267\n1186#1,7:1274\n1186#1,7:1281\n1186#1,7:1288\n1197#1,5:1295\n1197#1,5:1300\n1186#1,7:1305\n1186#1,7:1312\n1197#1,5:1319\n1206#1,5:1324\n1#2:1238\n1188#3,3:1329\n1188#3,3:1332\n1188#3,3:1335\n1188#3,3:1338\n*S KotlinDebug\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n*L\n450#1:1239,7\n482#1:1246,7\n486#1:1253,7\n489#1:1260,7\n529#1:1267,7\n532#1:1274,7\n537#1:1281,7\n542#1:1288,7\n549#1:1295,5\n550#1:1300,5\n1141#1:1305,7\n1143#1:1312,7\n1171#1:1319,5\n1179#1:1324,5\n42#1:1329,3\n43#1:1332,3\n54#1:1335,3\n55#1:1338,3\n*E\n"})
/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String f91619a = "0123456789abcdef";

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final String f91620b = "0123456789ABCDEF";

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final int[] f91621c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final int[] f91622d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final int[] f91623e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final long[] f91624f;

    static {
        int[] iArr = new int[256];
        int i11 = 0;
        for (int i12 = 0; i12 < 256; i12++) {
            iArr[i12] = f91619a.charAt(i12 & 15) | (f91619a.charAt(i12 >> 4) << '\b');
        }
        f91621c = iArr;
        int[] iArr2 = new int[256];
        for (int i13 = 0; i13 < 256; i13++) {
            iArr2[i13] = "0123456789ABCDEF".charAt(i13 & 15) | ("0123456789ABCDEF".charAt(i13 >> 4) << '\b');
        }
        f91622d = iArr2;
        int[] iArr3 = new int[256];
        for (int i14 = 0; i14 < 256; i14++) {
            iArr3[i14] = -1;
        }
        int i15 = 0;
        int i16 = 0;
        while (i15 < f91619a.length()) {
            iArr3[f91619a.charAt(i15)] = i16;
            i15++;
            i16++;
        }
        int i17 = 0;
        int i18 = 0;
        while (i17 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i17)] = i18;
            i17++;
            i18++;
        }
        f91623e = iArr3;
        long[] jArr = new long[256];
        for (int i19 = 0; i19 < 256; i19++) {
            jArr[i19] = -1;
        }
        int i21 = 0;
        int i22 = 0;
        while (i21 < f91619a.length()) {
            jArr[f91619a.charAt(i21)] = i22;
            i21++;
            i22++;
        }
        int i23 = 0;
        while (i11 < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i11)] = i23;
            i11++;
            i23++;
        }
        f91624f = jArr;
    }

    @y0(version = "2.2")
    @j2(markerClass = {kotlin.c.class})
    public static final int A(@m80.k String str, @m80.k i format) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(format, "format");
        return z(str, 0, str.length(), format);
    }

    public static /* synthetic */ int B(String str, int i11, int i12, i iVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = str.length();
        }
        if ((i13 & 4) != 0) {
            iVar = i.f91627d.a();
        }
        return z(str, i11, i12, iVar);
    }

    public static /* synthetic */ int C(String str, i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iVar = i.f91627d.a();
        }
        return A(str, iVar);
    }

    public static final int D(String str, int i11, int i12, i iVar, int i13) {
        a00.d.Companion.a(i11, i12, str.length());
        i.d d11 = iVar.d();
        if (d11.i()) {
            e(str, i11, i12, i13);
            return P(str, i11, i12);
        }
        String f11 = d11.f();
        String h11 = d11.h();
        f(str, i11, i12, f11, h11, d11.c(), i13);
        return P(str, i11 + f11.length(), i12 - h11.length());
    }

    public static final long E(@m80.k String str, int i11, int i12, @m80.k i format) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(format, "format");
        return I(str, i11, i12, format, 16);
    }

    @y0(version = "2.2")
    @j2(markerClass = {kotlin.c.class})
    public static final long F(@m80.k String str, @m80.k i format) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(format, "format");
        return E(str, 0, str.length(), format);
    }

    public static /* synthetic */ long G(String str, int i11, int i12, i iVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = str.length();
        }
        if ((i13 & 4) != 0) {
            iVar = i.f91627d.a();
        }
        return E(str, i11, i12, iVar);
    }

    public static /* synthetic */ long H(String str, i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iVar = i.f91627d.a();
        }
        return F(str, iVar);
    }

    public static final long I(String str, int i11, int i12, i iVar, int i13) {
        a00.d.Companion.a(i11, i12, str.length());
        i.d d11 = iVar.d();
        if (d11.i()) {
            e(str, i11, i12, i13);
            return Q(str, i11, i12);
        }
        String f11 = d11.f();
        String h11 = d11.h();
        f(str, i11, i12, f11, h11, d11.c(), i13);
        return Q(str, i11 + f11.length(), i12 - h11.length());
    }

    public static final short J(String str, int i11, int i12, i iVar) {
        return (short) D(str, i11, i12, iVar, 4);
    }

    @y0(version = "2.2")
    @j2(markerClass = {kotlin.c.class})
    public static final short K(@m80.k String str, @m80.k i format) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(format, "format");
        return J(str, 0, str.length(), format);
    }

    public static /* synthetic */ short L(String str, int i11, int i12, i iVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = str.length();
        }
        if ((i13 & 4) != 0) {
            iVar = i.f91627d.a();
        }
        return J(str, i11, i12, iVar);
    }

    public static /* synthetic */ short M(String str, i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iVar = i.f91627d.a();
        }
        return K(str, iVar);
    }

    public static final long N(String str, int i11) {
        char charAt = str.charAt(i11);
        if ((charAt >>> '\b') == 0) {
            long j11 = f91624f[charAt];
            if (j11 >= 0) {
                return j11;
            }
        }
        S(str, i11);
        throw new KotlinNothingValueException();
    }

    public static final byte O(String str, int i11) {
        int[] iArr;
        int i12;
        int i13;
        char charAt = str.charAt(i11);
        if ((charAt >>> '\b') != 0 || (i12 = (iArr = f91623e)[charAt]) < 0) {
            S(str, i11);
            throw new KotlinNothingValueException();
        }
        int i14 = i11 + 1;
        char charAt2 = str.charAt(i14);
        if ((charAt2 >>> '\b') == 0 && (i13 = iArr[charAt2]) >= 0) {
            return (byte) ((i12 << 4) | i13);
        }
        S(str, i14);
        throw new KotlinNothingValueException();
    }

    public static final int P(String str, int i11, int i12) {
        int i13;
        int i14 = 0;
        while (i11 < i12) {
            int i15 = i14 << 4;
            char charAt = str.charAt(i11);
            if ((charAt >>> '\b') != 0 || (i13 = f91623e[charAt]) < 0) {
                S(str, i11);
                throw new KotlinNothingValueException();
            }
            i14 = i15 | i13;
            i11++;
        }
        return i14;
    }

    public static final long Q(String str, int i11, int i12) {
        long j11 = 0;
        while (i11 < i12) {
            long j12 = j11 << 4;
            char charAt = str.charAt(i11);
            if ((charAt >>> '\b') == 0) {
                long j13 = f91624f[charAt];
                if (j13 >= 0) {
                    j11 = j12 | j13;
                    i11++;
                }
            }
            S(str, i11);
            throw new KotlinNothingValueException();
        }
        return j11;
    }

    public static final int R(int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        long a11;
        if (i11 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j11 = i16 + 2 + i17;
        long a12 = a(j11, i13, i15);
        if (i12 <= i13) {
            a11 = a(j11, i12, i15);
        } else {
            a11 = a(a12, i12 / i13, i14);
            int i18 = i12 % i13;
            if (i18 != 0) {
                a11 = a11 + i14 + a(j11, i18, i15);
            }
        }
        long j12 = i11;
        long o02 = o0(j12, a11, 1);
        long j13 = j12 - ((a11 + 1) * o02);
        long o03 = o0(j13, a12, i14);
        long j14 = j13 - ((a12 + i14) * o03);
        long o04 = o0(j14, j11, i15);
        return (int) ((o02 * i12) + (o03 * i13) + o04 + (j14 - ((j11 + ((long) i15)) * o04) > 0 ? 1 : 0));
    }

    public static final Void S(String str, int i11) {
        throw new NumberFormatException("Expected a hexadecimal digit at index " + i11 + ", but was " + str.charAt(i11));
    }

    public static final void T(String str, int i11, int i12, String str2, int i13) {
        kotlin.jvm.internal.g0.n(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(i11, i12);
        kotlin.jvm.internal.g0.o(substring, "substring(...)");
        throw new NumberFormatException("Expected " + str2 + ' ' + i13 + " hexadecimal digits at index " + i11 + ", but was \"" + substring + "\" of length " + (i12 - i11));
    }

    public static final void U(String str, int i11, int i12, String str2, String str3) {
        kotlin.jvm.internal.g0.n(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(i11, i12);
        kotlin.jvm.internal.g0.o(substring, "substring(...)");
        throw new NumberFormatException("Expected a hexadecimal number with prefix \"" + str2 + "\" and suffix \"" + str3 + "\", but was " + substring);
    }

    public static final void V(String str, int i11, int i12, String str2, String str3) {
        int B = g10.u.B(str2.length() + i11, i12);
        kotlin.jvm.internal.g0.n(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(i11, B);
        kotlin.jvm.internal.g0.o(substring, "substring(...)");
        throw new NumberFormatException("Expected " + str3 + " \"" + str2 + "\" at index " + i11 + ", but was " + substring);
    }

    public static final int W(String str, char[] cArr, int i11) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                int length2 = str.length();
                kotlin.jvm.internal.g0.n(str, "null cannot be cast to non-null type java.lang.String");
                str.getChars(0, length2, cArr, i11);
            } else {
                cArr[i11] = str.charAt(0);
            }
        }
        return i11 + str.length();
    }

    @y0(version = "2.2")
    @m80.k
    @j2(markerClass = {kotlin.c.class})
    public static final String X(byte b11, @m80.k i format) {
        kotlin.jvm.internal.g0.p(format, "format");
        String str = format.e() ? "0123456789ABCDEF" : f91619a;
        i.d d11 = format.d();
        if (!d11.j()) {
            return j0(b11, d11, str, 8);
        }
        char[] cArr = {str.charAt((b11 >> 4) & 15), str.charAt(b11 & 15)};
        return d11.g() ? f0.N1(cArr, g10.u.B((Integer.numberOfLeadingZeros(b11 & 255) - 24) >> 2, 1), 0, 2, null) : f0.L1(cArr);
    }

    @y0(version = "2.2")
    @m80.k
    @j2(markerClass = {kotlin.c.class})
    public static final String Y(int i11, @m80.k i format) {
        kotlin.jvm.internal.g0.p(format, "format");
        String str = format.e() ? "0123456789ABCDEF" : f91619a;
        i.d d11 = format.d();
        if (!d11.j()) {
            return j0(i11, d11, str, 32);
        }
        char[] cArr = {str.charAt((i11 >> 28) & 15), str.charAt((i11 >> 24) & 15), str.charAt((i11 >> 20) & 15), str.charAt((i11 >> 16) & 15), str.charAt((i11 >> 12) & 15), str.charAt((i11 >> 8) & 15), str.charAt((i11 >> 4) & 15), str.charAt(i11 & 15)};
        return d11.g() ? f0.N1(cArr, g10.u.B(Integer.numberOfLeadingZeros(i11) >> 2, 7), 0, 2, null) : f0.L1(cArr);
    }

    @y0(version = "2.2")
    @m80.k
    @j2(markerClass = {kotlin.c.class})
    public static final String Z(long j11, @m80.k i format) {
        kotlin.jvm.internal.g0.p(format, "format");
        String str = format.e() ? "0123456789ABCDEF" : f91619a;
        i.d d11 = format.d();
        if (!d11.j()) {
            return j0(j11, d11, str, 64);
        }
        char[] cArr = {str.charAt((int) ((j11 >> 60) & 15)), str.charAt((int) ((j11 >> 56) & 15)), str.charAt((int) ((j11 >> 52) & 15)), str.charAt((int) ((j11 >> 48) & 15)), str.charAt((int) ((j11 >> 44) & 15)), str.charAt((int) ((j11 >> 40) & 15)), str.charAt((int) ((j11 >> 36) & 15)), str.charAt((int) ((j11 >> 32) & 15)), str.charAt((int) ((j11 >> 28) & 15)), str.charAt((int) ((j11 >> 24) & 15)), str.charAt((int) ((j11 >> 20) & 15)), str.charAt((int) ((j11 >> 16) & 15)), str.charAt((int) ((j11 >> 12) & 15)), str.charAt((int) ((j11 >> 8) & 15)), str.charAt((int) ((j11 >> 4) & 15)), str.charAt((int) (j11 & 15))};
        return d11.g() ? f0.N1(cArr, g10.u.B(Long.numberOfLeadingZeros(j11) >> 2, 15), 0, 2, null) : f0.L1(cArr);
    }

    public static final long a(long j11, int i11, int i12) {
        if (i11 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j12 = i11;
        return (j11 * j12) + (i12 * (j12 - 1));
    }

    @y0(version = "2.2")
    @m80.k
    @j2(markerClass = {kotlin.c.class})
    public static final String a0(short s11, @m80.k i format) {
        kotlin.jvm.internal.g0.p(format, "format");
        String str = format.e() ? "0123456789ABCDEF" : f91619a;
        i.d d11 = format.d();
        if (!d11.j()) {
            return j0(s11, d11, str, 16);
        }
        char[] cArr = {str.charAt((s11 >> 12) & 15), str.charAt((s11 >> 8) & 15), str.charAt((s11 >> 4) & 15), str.charAt(s11 & 15)};
        return d11.g() ? f0.N1(cArr, g10.u.B((Integer.numberOfLeadingZeros(s11 & c2.f100412d) - 16) >> 2, 3), 0, 2, null) : f0.L1(cArr);
    }

    public static final int b(String str, int i11, int i12, String str2, boolean z11, String str3) {
        if (str2.length() == 0) {
            return i11;
        }
        int length = str2.length();
        for (int i13 = 0; i13 < length; i13++) {
            if (!c.J(str2.charAt(i13), str.charAt(i11 + i13), z11)) {
                V(str, i11, i12, str2, str3);
            }
        }
        return i11 + str2.length();
    }

    @y0(version = "2.2")
    @m80.k
    @j2(markerClass = {kotlin.c.class})
    public static final String b0(@m80.k byte[] bArr, int i11, int i12, @m80.k i format) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(format, "format");
        a00.d.Companion.a(i11, i12, bArr.length);
        if (i11 == i12) {
            return "";
        }
        int[] iArr = format.e() ? f91622d : f91621c;
        i.b c11 = format.c();
        return c11.j() ? k0(bArr, i11, i12, c11, iArr) : n0(bArr, i11, i12, c11, iArr);
    }

    public static final int c(long j11) {
        if (0 <= j11 && j11 <= SieveCacheKt.NodeLinkMask) {
            return (int) j11;
        }
        throw new IllegalArgumentException("The resulting string length is too big: " + ((Object) w1.h0(w1.i(j11))));
    }

    @y0(version = "2.2")
    @m80.k
    @j2(markerClass = {kotlin.c.class})
    public static final String c0(@m80.k byte[] bArr, @m80.k i format) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(format, "format");
        return b0(bArr, 0, bArr.length, format);
    }

    public static final int d(String str, int i11, int i12) {
        if (str.charAt(i11) == '\r') {
            int i13 = i11 + 1;
            return (i13 >= i12 || str.charAt(i13) != '\n') ? i13 : i11 + 2;
        }
        if (str.charAt(i11) == '\n') {
            return i11 + 1;
        }
        throw new NumberFormatException("Expected a new line at index " + i11 + ", but was " + str.charAt(i11));
    }

    public static /* synthetic */ String d0(byte b11, i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iVar = i.f91627d.a();
        }
        return X(b11, iVar);
    }

    public static final void e(String str, int i11, int i12, int i13) {
        int i14 = i12 - i11;
        if (i14 < 1) {
            T(str, i11, i12, "at least", 1);
        } else if (i14 > i13) {
            g(str, i11, (i14 + i11) - i13);
        }
    }

    public static /* synthetic */ String e0(int i11, i iVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            iVar = i.f91627d.a();
        }
        return Y(i11, iVar);
    }

    public static final void f(String str, int i11, int i12, String str2, String str3, boolean z11, int i13) {
        if ((i12 - i11) - str2.length() <= str3.length()) {
            U(str, i11, i12, str2, str3);
        }
        if (str2.length() != 0) {
            int length = str2.length();
            for (int i14 = 0; i14 < length; i14++) {
                if (!c.J(str2.charAt(i14), str.charAt(i11 + i14), z11)) {
                    V(str, i11, i12, str2, "prefix");
                }
            }
            i11 += str2.length();
        }
        int length2 = i12 - str3.length();
        if (str3.length() != 0) {
            int length3 = str3.length();
            for (int i15 = 0; i15 < length3; i15++) {
                if (!c.J(str3.charAt(i15), str.charAt(length2 + i15), z11)) {
                    V(str, length2, i12, str3, "suffix");
                }
            }
        }
        e(str, i11, length2, i13);
    }

    public static /* synthetic */ String f0(long j11, i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iVar = i.f91627d.a();
        }
        return Z(j11, iVar);
    }

    public static final void g(String str, int i11, int i12) {
        while (i11 < i12) {
            if (str.charAt(i11) != '0') {
                throw new NumberFormatException("Expected the hexadecimal digit '0' at index " + i11 + ", but was '" + str.charAt(i11) + "'.\nThe result won't fit the type being parsed.");
            }
            i11++;
        }
    }

    public static /* synthetic */ String g0(short s11, i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iVar = i.f91627d.a();
        }
        return a0(s11, iVar);
    }

    public static final int h(String str, int i11) {
        int i12;
        char charAt = str.charAt(i11);
        if ((charAt >>> '\b') == 0 && (i12 = f91623e[charAt]) >= 0) {
            return i12;
        }
        S(str, i11);
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ String h0(byte[] bArr, int i11, int i12, i iVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = bArr.length;
        }
        if ((i13 & 4) != 0) {
            iVar = i.f91627d.a();
        }
        return b0(bArr, i11, i12, iVar);
    }

    public static final int i(byte[] bArr, int i11, String str, String str2, int[] iArr, char[] cArr, int i12) {
        return W(str2, cArr, j(bArr, i11, iArr, cArr, W(str, cArr, i12)));
    }

    public static /* synthetic */ String i0(byte[] bArr, i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iVar = i.f91627d.a();
        }
        return c0(bArr, iVar);
    }

    public static final int j(byte[] bArr, int i11, int[] iArr, char[] cArr, int i12) {
        int i13 = iArr[bArr[i11] & 255];
        cArr[i12] = (char) (i13 >> 8);
        cArr[i12 + 1] = (char) (i13 & 255);
        return i12 + 2;
    }

    public static final String j0(long j11, i.d dVar, String str, int i11) {
        if ((i11 & 3) != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i12 = i11 >> 2;
        int d11 = dVar.d();
        int u11 = g10.u.u(d11 - i12, 0);
        String f11 = dVar.f();
        String h11 = dVar.h();
        boolean g11 = dVar.g();
        int c11 = c(f11.length() + u11 + i12 + h11.length());
        char[] cArr = new char[c11];
        int W = W(f11, cArr, 0);
        if (u11 > 0) {
            int i13 = u11 + W;
            a00.q.H1(cArr, str.charAt(0), W, i13);
            W = i13;
        }
        int i14 = i11;
        for (int i15 = 0; i15 < i12; i15++) {
            i14 -= 4;
            int i16 = (int) ((j11 >> i14) & 15);
            g11 = g11 && i16 == 0 && (i14 >> 2) >= d11;
            if (!g11) {
                cArr[W] = str.charAt(i16);
                W++;
            }
        }
        int W2 = W(h11, cArr, W);
        return W2 == c11 ? f0.L1(cArr) : f0.N1(cArr, 0, W2, 1, null);
    }

    public static final int k(int i11, int i12, int i13, int i14) {
        if (i11 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j11 = i12;
        return c((i11 * (((i13 + 2) + i14) + j11)) - j11);
    }

    public static final String k0(byte[] bArr, int i11, int i12, i.b bVar, int[] iArr) {
        return bVar.k() ? m0(bArr, i11, i12, bVar, iArr) : l0(bArr, i11, i12, bVar, iArr);
    }

    public static final int l(int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (i11 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i18 = (i11 - 1) / i12;
        int i19 = (i12 - 1) / i13;
        int i21 = i11 % i12;
        if (i21 != 0) {
            i12 = i21;
        }
        return c(i18 + (((i19 * i18) + ((i12 - 1) / i13)) * i14) + (((r0 - i18) - r2) * i15) + (i11 * (i16 + 2 + i17)));
    }

    public static final String l0(byte[] bArr, int i11, int i12, i.b bVar, int[] iArr) {
        String c11 = bVar.c();
        String e11 = bVar.e();
        String d11 = bVar.d();
        char[] cArr = new char[k(i12 - i11, d11.length(), c11.length(), e11.length())];
        int i13 = i(bArr, i11, c11, e11, iArr, cArr, 0);
        for (int i14 = i11 + 1; i14 < i12; i14++) {
            i13 = i(bArr, i14, c11, e11, iArr, cArr, W(d11, cArr, i13));
        }
        return f0.L1(cArr);
    }

    @m80.k
    public static final int[] m() {
        return f91621c;
    }

    public static final String m0(byte[] bArr, int i11, int i12, i.b bVar, int[] iArr) {
        int length = bVar.d().length();
        if (length > 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i13 = i12 - i11;
        int i14 = 0;
        if (length == 0) {
            char[] cArr = new char[c(i13 * 2)];
            while (i11 < i12) {
                i14 = j(bArr, i11, iArr, cArr, i14);
                i11++;
            }
            return f0.L1(cArr);
        }
        char[] cArr2 = new char[c((i13 * 3) - 1)];
        char charAt = bVar.d().charAt(0);
        int j11 = j(bArr, i11, iArr, cArr2, 0);
        for (int i15 = i11 + 1; i15 < i12; i15++) {
            cArr2[j11] = charAt;
            j11 = j(bArr, i15, iArr, cArr2, j11 + 1);
        }
        return f0.L1(cArr2);
    }

    public static final byte n(String str, int i11, int i12, i iVar) {
        return (byte) D(str, i11, i12, iVar, 2);
    }

    public static final String n0(byte[] bArr, int i11, int i12, i.b bVar, int[] iArr) {
        int i13;
        int i14;
        int g11 = bVar.g();
        int f11 = bVar.f();
        String c11 = bVar.c();
        String e11 = bVar.e();
        String d11 = bVar.d();
        String h11 = bVar.h();
        int l11 = l(i12 - i11, g11, f11, h11.length(), d11.length(), c11.length(), e11.length());
        char[] cArr = new char[l11];
        int i15 = i11;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i15 < i12) {
            if (i17 == g11) {
                cArr[i16] = '\n';
                i16++;
                i13 = 0;
                i14 = 0;
            } else if (i18 == f11) {
                i16 = W(h11, cArr, i16);
                i13 = i17;
                i14 = 0;
            } else {
                i13 = i17;
                i14 = i18;
            }
            if (i14 != 0) {
                i16 = W(d11, cArr, i16);
            }
            String str = c11;
            int i19 = i(bArr, i15, str, e11, iArr, cArr, i16);
            i15++;
            i18 = i14 + 1;
            i16 = i19;
            c11 = str;
            i17 = i13 + 1;
        }
        if (i16 == l11) {
            return f0.L1(cArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    @y0(version = "2.2")
    @j2(markerClass = {kotlin.c.class})
    public static final byte o(@m80.k String str, @m80.k i format) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(format, "format");
        return n(str, 0, str.length(), format);
    }

    public static final long o0(long j11, long j12, int i11) {
        if (j11 <= 0 || j12 <= 0) {
            return 0L;
        }
        long j13 = i11;
        return (j11 + j13) / (j12 + j13);
    }

    public static /* synthetic */ byte p(String str, int i11, int i12, i iVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = str.length();
        }
        if ((i13 & 4) != 0) {
            iVar = i.f91627d.a();
        }
        return n(str, i11, i12, iVar);
    }

    public static /* synthetic */ byte q(String str, i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iVar = i.f91627d.a();
        }
        return o(str, iVar);
    }

    public static final byte[] r(String str, int i11, int i12, i iVar) {
        byte[] v11;
        a00.d.Companion.a(i11, i12, str.length());
        if (i11 == i12) {
            return new byte[0];
        }
        i.b c11 = iVar.c();
        return (!c11.j() || (v11 = v(str, i11, i12, c11)) == null) ? y(str, i11, i12, c11) : v11;
    }

    @y0(version = "2.2")
    @m80.k
    @j2(markerClass = {kotlin.c.class})
    public static final byte[] s(@m80.k String str, @m80.k i format) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(format, "format");
        return r(str, 0, str.length(), format);
    }

    public static /* synthetic */ byte[] t(String str, int i11, int i12, i iVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = str.length();
        }
        if ((i13 & 4) != 0) {
            iVar = i.f91627d.a();
        }
        return r(str, i11, i12, iVar);
    }

    public static /* synthetic */ byte[] u(String str, i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iVar = i.f91627d.a();
        }
        return s(str, iVar);
    }

    public static final byte[] v(String str, int i11, int i12, i.b bVar) {
        return bVar.k() ? x(str, i11, i12, bVar) : w(str, i11, i12, bVar);
    }

    public static final byte[] w(String str, int i11, int i12, i.b bVar) {
        String c11 = bVar.c();
        String e11 = bVar.e();
        String d11 = bVar.d();
        long length = d11.length();
        long length2 = c11.length() + 2 + e11.length() + length;
        long j11 = i12 - i11;
        int i13 = (int) ((j11 + length) / length2);
        if ((i13 * length2) - length != j11) {
            return null;
        }
        boolean i14 = bVar.i();
        byte[] bArr = new byte[i13];
        if (c11.length() != 0) {
            int length3 = c11.length();
            for (int i15 = 0; i15 < length3; i15++) {
                if (!c.J(c11.charAt(i15), str.charAt(i11 + i15), i14)) {
                    V(str, i11, i12, c11, "byte prefix");
                }
            }
            i11 += c11.length();
        }
        String str2 = e11 + d11 + c11;
        int i16 = i13 - 1;
        for (int i17 = 0; i17 < i16; i17++) {
            bArr[i17] = O(str, i11);
            i11 += 2;
            if (str2.length() != 0) {
                int length4 = str2.length();
                for (int i18 = 0; i18 < length4; i18++) {
                    if (!c.J(str2.charAt(i18), str.charAt(i11 + i18), i14)) {
                        V(str, i11, i12, str2, "byte suffix + byte separator + byte prefix");
                    }
                }
                i11 += str2.length();
            }
        }
        bArr[i16] = O(str, i11);
        int i19 = i11 + 2;
        if (e11.length() == 0) {
            return bArr;
        }
        int length5 = e11.length();
        for (int i21 = 0; i21 < length5; i21++) {
            if (!c.J(e11.charAt(i21), str.charAt(i19 + i21), i14)) {
                V(str, i19, i12, e11, "byte suffix");
            }
        }
        return bArr;
    }

    public static final byte[] x(String str, int i11, int i12, i.b bVar) {
        int length = bVar.d().length();
        if (length > 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i13 = i12 - i11;
        int i14 = 2;
        if (length == 0) {
            if ((i13 & 1) != 0) {
                return null;
            }
            int i15 = i13 >> 1;
            byte[] bArr = new byte[i15];
            int i16 = 0;
            for (int i17 = 0; i17 < i15; i17++) {
                bArr[i17] = O(str, i16);
                i16 += 2;
            }
            return bArr;
        }
        if (i13 % 3 != 2) {
            return null;
        }
        int i18 = (i13 / 3) + 1;
        byte[] bArr2 = new byte[i18];
        char charAt = bVar.d().charAt(0);
        bArr2[0] = O(str, 0);
        for (int i19 = 1; i19 < i18; i19++) {
            if (str.charAt(i14) != charAt) {
                String d11 = bVar.d();
                boolean i21 = bVar.i();
                if (d11.length() != 0) {
                    int length2 = d11.length();
                    for (int i22 = 0; i22 < length2; i22++) {
                        if (!c.J(d11.charAt(i22), str.charAt(i14 + i22), i21)) {
                            V(str, i14, i12, d11, "byte separator");
                        }
                    }
                    d11.length();
                }
            }
            bArr2[i19] = O(str, i14 + 1);
            i14 += 3;
        }
        return bArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final byte[] y(java.lang.String r18, int r19, int r20, u30.i.b r21) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u30.h.y(java.lang.String, int, int, u30.i$b):byte[]");
    }

    public static final int z(@m80.k String str, int i11, int i12, @m80.k i format) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(format, "format");
        return D(str, i11, i12, format, 8);
    }
}
