package j50;

import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nPlatform.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Platform.common.kt\nkotlinx/serialization/internal/InternalHexConverter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,190:1\n1#2:191\n*E\n"})
/* loaded from: classes8.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a1 f63328a = new a1();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final String f63329b = "0123456789ABCDEF";

    public static /* synthetic */ String d(a1 a1Var, byte[] bArr, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return a1Var.c(bArr, z11);
    }

    public final int a(char c11) {
        if ('0' <= c11 && c11 < ':') {
            return c11 - '0';
        }
        if ('A' <= c11 && c11 < 'G') {
            return c11 - '7';
        }
        if ('a' > c11 || c11 >= 'g') {
            return -1;
        }
        return c11 - 'W';
    }

    @m80.k
    public final byte[] b(@m80.k String s11) {
        kotlin.jvm.internal.g0.p(s11, "s");
        int length = s11.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("HexBinary string must be even length");
        }
        byte[] bArr = new byte[length / 2];
        for (int i11 = 0; i11 < length; i11 += 2) {
            int a11 = a(s11.charAt(i11));
            int i12 = i11 + 1;
            int a12 = a(s11.charAt(i12));
            if (a11 == -1 || a12 == -1) {
                throw new IllegalArgumentException(("Invalid hex chars: " + s11.charAt(i11) + s11.charAt(i12)).toString());
            }
            bArr[i11 / 2] = (byte) ((a11 << 4) + a12);
        }
        return bArr;
    }

    @m80.k
    public final String c(@m80.k byte[] data, boolean z11) {
        kotlin.jvm.internal.g0.p(data, "data");
        StringBuilder sb2 = new StringBuilder(data.length * 2);
        for (byte b11 : data) {
            sb2.append("0123456789ABCDEF".charAt((b11 >> 4) & 15));
            sb2.append("0123456789ABCDEF".charAt(b11 & 15));
        }
        if (!z11) {
            String sb3 = sb2.toString();
            kotlin.jvm.internal.g0.o(sb3, "toString(...)");
            return sb3;
        }
        String sb4 = sb2.toString();
        kotlin.jvm.internal.g0.o(sb4, "toString(...)");
        String lowerCase = sb4.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.g0.o(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @m80.k
    public final String e(int i11) {
        byte[] bArr = new byte[4];
        for (int i12 = 0; i12 < 4; i12++) {
            bArr[i12] = (byte) (i11 >> (24 - (i12 * 8)));
        }
        String s62 = u30.k0.s6(c(bArr, true), '0');
        if (s62.length() <= 0) {
            s62 = null;
        }
        return s62 == null ? "0" : s62;
    }
}
