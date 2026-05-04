package kotlin.uuid;

import a00.a0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import u30.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nUuid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Uuid.kt\nkotlin/uuid/UuidKt__UuidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,648:1\n1#2:649\n*E\n"})
/* loaded from: classes8.dex */
public class b extends a {
    public static final void q(@k String str, int i11) {
        g0.p(str, "<this>");
        if (str.charAt(i11) == '-') {
            return;
        }
        throw new IllegalArgumentException(("Expected '-' (hyphen) at index " + i11 + ", but was '" + str.charAt(i11) + '\'').toString());
    }

    @y30.a
    public static final void r(long j11, @k byte[] dst, int i11, int i12, int i13) {
        g0.p(dst, "dst");
        int i14 = 7 - i12;
        int i15 = 8 - i13;
        if (i15 > i14) {
            return;
        }
        while (true) {
            int i16 = h.m()[(int) ((j11 >> (i14 << 3)) & 255)];
            int i17 = i11 + 1;
            dst[i11] = (byte) (i16 >> 8);
            i11 += 2;
            dst[i17] = (byte) i16;
            if (i14 == i15) {
                return;
            } else {
                i14--;
            }
        }
    }

    public static final long s(@k byte[] bArr, int i11) {
        g0.p(bArr, "<this>");
        return (bArr[i11 + 7] & 255) | ((bArr[i11] & 255) << 56) | ((bArr[i11 + 1] & 255) << 48) | ((bArr[i11 + 2] & 255) << 40) | ((bArr[i11 + 3] & 255) << 32) | ((bArr[i11 + 4] & 255) << 24) | ((bArr[i11 + 5] & 255) << 16) | ((bArr[i11 + 6] & 255) << 8);
    }

    public static final void t(@k byte[] bArr, int i11, long j11) {
        g0.p(bArr, "<this>");
        int i12 = 7;
        while (-1 < i12) {
            bArr[i11] = (byte) (j11 >> (i12 << 3));
            i12--;
            i11++;
        }
    }

    public static final String u(String str, int i11) {
        if (str.length() <= i11) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        g0.n(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(0, i11);
        g0.o(substring, "substring(...)");
        sb2.append(substring);
        sb2.append("...");
        return sb2.toString();
    }

    public static final String v(byte[] bArr, int i11) {
        return a0.yh(bArr, null, "[", "]", i11, null, null, 49, null);
    }

    @y30.a
    @k
    public static final Uuid w(@k byte[] randomBytes) {
        g0.p(randomBytes, "randomBytes");
        byte b11 = (byte) (randomBytes[6] & 15);
        randomBytes[6] = b11;
        randomBytes[6] = (byte) (b11 | 64);
        byte b12 = (byte) (randomBytes[8] & 63);
        randomBytes[8] = b12;
        randomBytes[8] = (byte) (b12 | 128);
        return Uuid.Companion.a(randomBytes);
    }

    @y30.a
    @k
    public static final Uuid x(@k String hexString) {
        g0.p(hexString, "hexString");
        return Uuid.Companion.b(h.G(hexString, 0, 16, null, 4, null), h.G(hexString, 16, 32, null, 4, null));
    }

    @y30.a
    @k
    public static final Uuid y(@k String hexDashString) {
        g0.p(hexDashString, "hexDashString");
        long G = h.G(hexDashString, 0, 8, null, 4, null);
        q(hexDashString, 8);
        long G2 = h.G(hexDashString, 9, 13, null, 4, null);
        q(hexDashString, 13);
        long G3 = h.G(hexDashString, 14, 18, null, 4, null);
        q(hexDashString, 18);
        long G4 = h.G(hexDashString, 19, 23, null, 4, null);
        q(hexDashString, 23);
        return Uuid.Companion.b((G2 << 16) | (G << 32) | G3, (G4 << 48) | h.G(hexDashString, 24, 36, null, 4, null));
    }
}
