package kotlin.io.encoding;

import java.nio.charset.Charset;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m00.c;
import m80.k;
import s00.b;
import s00.d;
import yz.j2;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "2.2")
@j2(markerClass = {d.class})
/* loaded from: classes8.dex */
public class Base64 {

    /* renamed from: g, reason: collision with root package name */
    public static final int f66937g = 8;

    /* renamed from: h, reason: collision with root package name */
    public static final int f66938h = 6;

    /* renamed from: i, reason: collision with root package name */
    public static final int f66939i = 3;

    /* renamed from: j, reason: collision with root package name */
    public static final int f66940j = 4;

    /* renamed from: k, reason: collision with root package name */
    public static final byte f66941k = 61;

    /* renamed from: l, reason: collision with root package name */
    public static final int f66942l = 76;

    /* renamed from: m, reason: collision with root package name */
    public static final int f66943m = 64;

    /* renamed from: o, reason: collision with root package name */
    @k
    public static final Base64 f66945o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public static final Base64 f66946p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public static final Base64 f66947q;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f66948a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f66949b;

    /* renamed from: c, reason: collision with root package name */
    public final int f66950c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final PaddingOption f66951d;

    /* renamed from: e, reason: collision with root package name */
    public final int f66952e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f66936f = new a(null);

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final byte[] f66944n = {13, 10};

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @y0(version = "2.0")
    public static final class PaddingOption {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ PaddingOption[] $VALUES;
        public static final PaddingOption PRESENT = new PaddingOption("PRESENT", 0);
        public static final PaddingOption ABSENT = new PaddingOption("ABSENT", 1);
        public static final PaddingOption PRESENT_OPTIONAL = new PaddingOption("PRESENT_OPTIONAL", 2);
        public static final PaddingOption ABSENT_OPTIONAL = new PaddingOption("ABSENT_OPTIONAL", 3);

        private static final /* synthetic */ PaddingOption[] $values() {
            return new PaddingOption[]{PRESENT, ABSENT, PRESENT_OPTIONAL, ABSENT_OPTIONAL};
        }

        static {
            PaddingOption[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c.c($values);
        }

        private PaddingOption(String str, int i11) {
        }

        @k
        public static m00.a<PaddingOption> getEntries() {
            return $ENTRIES;
        }

        public static PaddingOption valueOf(String str) {
            return (PaddingOption) Enum.valueOf(PaddingOption.class, str);
        }

        public static PaddingOption[] values() {
            return (PaddingOption[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends Base64 {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final Base64 M() {
            return Base64.f66946p;
        }

        @k
        public final byte[] N() {
            return Base64.f66944n;
        }

        @k
        public final Base64 O() {
            return Base64.f66947q;
        }

        @k
        public final Base64 P() {
            return Base64.f66945o;
        }

        public a() {
            super(false, false, -1, PaddingOption.PRESENT, null);
        }
    }

    static {
        PaddingOption paddingOption = PaddingOption.PRESENT;
        f66945o = new Base64(true, false, -1, paddingOption);
        f66946p = new Base64(false, true, 76, paddingOption);
        f66947q = new Base64(false, true, 64, paddingOption);
    }

    public /* synthetic */ Base64(boolean z11, boolean z12, int i11, PaddingOption paddingOption, v vVar) {
        this(z11, z12, i11, paddingOption);
    }

    public static /* synthetic */ Appendable A(Base64 base64, byte[] bArr, Appendable appendable, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToAppendable");
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = bArr.length;
        }
        return base64.z(bArr, appendable, i11, i12);
    }

    public static /* synthetic */ byte[] C(Base64 base64, byte[] bArr, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToByteArray");
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = bArr.length;
        }
        return base64.B(bArr, i11, i12);
    }

    public static /* synthetic */ byte[] l(Base64 base64, CharSequence charSequence, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = charSequence.length();
        }
        return base64.j(charSequence, i11, i12);
    }

    public static /* synthetic */ byte[] m(Base64 base64, byte[] bArr, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = bArr.length;
        }
        return base64.k(bArr, i11, i12);
    }

    public static /* synthetic */ int q(Base64 base64, CharSequence charSequence, byte[] bArr, int i11, int i12, int i13, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
        }
        if ((i14 & 4) != 0) {
            i11 = 0;
        }
        if ((i14 & 8) != 0) {
            i12 = 0;
        }
        if ((i14 & 16) != 0) {
            i13 = charSequence.length();
        }
        return base64.o(charSequence, bArr, i11, i12, i13);
    }

    public static /* synthetic */ int r(Base64 base64, byte[] bArr, byte[] bArr2, int i11, int i12, int i13, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
        }
        if ((i14 & 4) != 0) {
            i11 = 0;
        }
        if ((i14 & 8) != 0) {
            i12 = 0;
        }
        if ((i14 & 16) != 0) {
            i13 = bArr.length;
        }
        return base64.p(bArr, bArr2, i11, i12, i13);
    }

    public static /* synthetic */ String u(Base64 base64, byte[] bArr, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = bArr.length;
        }
        return base64.t(bArr, i11, i12);
    }

    public static /* synthetic */ int w(Base64 base64, byte[] bArr, byte[] bArr2, int i11, int i12, int i13, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeIntoByteArray");
        }
        if ((i14 & 4) != 0) {
            i11 = 0;
        }
        if ((i14 & 8) != 0) {
            i12 = 0;
        }
        if ((i14 & 16) != 0) {
            i13 = bArr.length;
        }
        return base64.v(bArr, bArr2, i11, i12, i13);
    }

    @k
    public final byte[] B(@k byte[] source, int i11, int i12) {
        g0.p(source, "source");
        return D(source, i11, i12);
    }

    @k
    public final byte[] D(@k byte[] source, int i11, int i12) {
        g0.p(source, "source");
        i(source.length, i11, i12);
        byte[] bArr = new byte[y(i12 - i11)];
        x(source, bArr, 0, i11, i12);
        return bArr;
    }

    public final int E() {
        return this.f66950c;
    }

    @k
    public final PaddingOption F() {
        return this.f66951d;
    }

    public final int G(byte[] bArr, int i11, int i12, int i13) {
        if (i13 == -8) {
            throw new IllegalArgumentException("Redundant pad character at index " + i11);
        }
        if (i13 == -6) {
            h(i11);
            return i11 + 1;
        }
        if (i13 != -4) {
            if (i13 == -2) {
                return i11 + 1;
            }
            throw new IllegalStateException("Unreachable");
        }
        h(i11);
        int K = K(bArr, i11 + 1, i12);
        if (K != i12 && bArr[K] == 61) {
            return K + 1;
        }
        throw new IllegalArgumentException("Missing one pad character at index " + K);
    }

    public final boolean H() {
        return this.f66949b;
    }

    public final boolean I() {
        return this.f66948a;
    }

    public final boolean J() {
        PaddingOption paddingOption = this.f66951d;
        return paddingOption == PaddingOption.PRESENT || paddingOption == PaddingOption.PRESENT_OPTIONAL;
    }

    public final int K(byte[] bArr, int i11, int i12) {
        int[] iArr;
        if (!this.f66949b) {
            return i11;
        }
        while (i11 < i12) {
            int i13 = bArr[i11] & 255;
            iArr = b.f87069b;
            if (iArr[i13] != -1) {
                break;
            }
            i11++;
        }
        return i11;
    }

    @y0(version = "2.0")
    @k
    public final Base64 L(@k PaddingOption option) {
        g0.p(option, "option");
        return this.f66951d == option ? this : new Base64(this.f66948a, this.f66949b, this.f66950c, option);
    }

    @k
    public final String e(@k byte[] source) {
        g0.p(source, "source");
        StringBuilder sb2 = new StringBuilder(source.length);
        for (byte b11 : source) {
            sb2.append((char) b11);
        }
        return sb2.toString();
    }

    @k
    public final byte[] f(@k CharSequence source, int i11, int i12) {
        g0.p(source, "source");
        i(source.length(), i11, i12);
        byte[] bArr = new byte[i12 - i11];
        int i13 = 0;
        while (i11 < i12) {
            char charAt = source.charAt(i11);
            if (charAt <= 255) {
                bArr[i13] = (byte) charAt;
                i13++;
            } else {
                bArr[i13] = 63;
                i13++;
            }
            i11++;
        }
        return bArr;
    }

    public final void g(int i11, int i12, int i13) {
        if (i12 < 0 || i12 > i11) {
            throw new IndexOutOfBoundsException("destination offset: " + i12 + ", destination size: " + i11);
        }
        int i14 = i12 + i13;
        if (i14 < 0 || i14 > i11) {
            throw new IndexOutOfBoundsException("The destination array does not have enough capacity, destination offset: " + i12 + ", destination size: " + i11 + ", capacity needed: " + i13);
        }
    }

    public final void h(int i11) {
        if (this.f66951d != PaddingOption.ABSENT) {
            return;
        }
        throw new IllegalArgumentException("The padding option is set to ABSENT, but the input has a pad character at index " + i11);
    }

    public final void i(int i11, int i12, int i13) {
        a00.d.Companion.a(i12, i13, i11);
    }

    @k
    public final byte[] j(@k CharSequence source, int i11, int i12) {
        byte[] f11;
        g0.p(source, "source");
        if (source instanceof String) {
            String str = (String) source;
            i(str.length(), i11, i12);
            String substring = str.substring(i11, i12);
            g0.o(substring, "substring(...)");
            Charset charset = u30.d.f91604g;
            g0.n(substring, "null cannot be cast to non-null type java.lang.String");
            f11 = substring.getBytes(charset);
            g0.o(f11, "getBytes(...)");
        } else {
            f11 = f(source, i11, i12);
        }
        return m(this, f11, 0, 0, 6, null);
    }

    @k
    public final byte[] k(@k byte[] source, int i11, int i12) {
        g0.p(source, "source");
        i(source.length, i11, i12);
        int s11 = s(source, i11, i12);
        byte[] bArr = new byte[s11];
        if (n(source, bArr, 0, i11, i12) == s11) {
            return bArr;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int n(byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int[] iArr = this.f66948a ? b.f87071d : b.f87069b;
        int i17 = -8;
        int i18 = i11;
        int i19 = i12;
        int i21 = -8;
        int i22 = 0;
        while (true) {
            if (i19 >= i13) {
                i14 = 8;
                i15 = 0;
                break;
            }
            if (i21 != i17 || i19 + 3 >= i13) {
                i14 = 8;
                i16 = 1;
            } else {
                i14 = 8;
                i16 = 1;
                int i23 = i19 + 4;
                int i24 = (iArr[bArr[i19 + 1] & 255] << 12) | (iArr[bArr[i19] & 255] << 18) | (iArr[bArr[i19 + 2] & 255] << 6) | iArr[bArr[i19 + 3] & 255];
                if (i24 >= 0) {
                    bArr2[i18] = (byte) (i24 >> 16);
                    int i25 = i18 + 2;
                    bArr2[i18 + 1] = (byte) (i24 >> 8);
                    i18 += 3;
                    bArr2[i25] = (byte) i24;
                    i19 = i23;
                    i17 = -8;
                }
            }
            int i26 = bArr[i19] & 255;
            int i27 = iArr[i26];
            if (i27 >= 0) {
                i19++;
                i22 = (i22 << 6) | i27;
                int i28 = i21 + 6;
                if (i28 >= 0) {
                    bArr2[i18] = (byte) (i22 >>> i28);
                    i22 &= (i16 << i28) - 1;
                    i21 -= 2;
                    i18++;
                } else {
                    i21 = i28;
                }
            } else {
                if (i27 == -2) {
                    i19 = G(bArr, i19, i13, i21);
                    i15 = i16;
                    break;
                }
                if (!this.f66949b) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Invalid symbol '");
                    sb2.append((char) i26);
                    sb2.append("'(");
                    String num = Integer.toString(i26, kotlin.text.a.a(i14));
                    g0.o(num, "toString(...)");
                    sb2.append(num);
                    sb2.append(") at index ");
                    sb2.append(i19);
                    throw new IllegalArgumentException(sb2.toString());
                }
                i19++;
            }
            i17 = -8;
        }
        if (i21 == -2) {
            throw new IllegalArgumentException("The last unit of input does not have enough bits");
        }
        if (i21 != -8 && i15 == 0 && this.f66951d == PaddingOption.PRESENT) {
            throw new IllegalArgumentException("The padding option is set to PRESENT, but the input is not properly padded");
        }
        if (i22 != 0) {
            throw new IllegalArgumentException("The pad bits must be zeros");
        }
        int K = K(bArr, i19, i13);
        if (K >= i13) {
            return i18 - i11;
        }
        int i29 = bArr[K] & 255;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Symbol '");
        sb3.append((char) i29);
        sb3.append("'(");
        String num2 = Integer.toString(i29, kotlin.text.a.a(i14));
        g0.o(num2, "toString(...)");
        sb3.append(num2);
        sb3.append(") at index ");
        sb3.append(K - 1);
        sb3.append(" is prohibited after the pad character");
        throw new IllegalArgumentException(sb3.toString());
    }

    public final int o(@k CharSequence source, @k byte[] destination, int i11, int i12, int i13) {
        byte[] f11;
        g0.p(source, "source");
        g0.p(destination, "destination");
        if (source instanceof String) {
            String str = (String) source;
            i(str.length(), i12, i13);
            String substring = str.substring(i12, i13);
            g0.o(substring, "substring(...)");
            Charset charset = u30.d.f91604g;
            g0.n(substring, "null cannot be cast to non-null type java.lang.String");
            f11 = substring.getBytes(charset);
            g0.o(f11, "getBytes(...)");
        } else {
            f11 = f(source, i12, i13);
        }
        return r(this, f11, destination, i11, 0, 0, 24, null);
    }

    public final int p(@k byte[] source, @k byte[] destination, int i11, int i12, int i13) {
        g0.p(source, "source");
        g0.p(destination, "destination");
        i(source.length, i12, i13);
        g(destination.length, i11, s(source, i12, i13));
        return n(source, destination, i11, i12, i13);
    }

    public final int s(@k byte[] source, int i11, int i12) {
        int[] iArr;
        g0.p(source, "source");
        int i13 = i12 - i11;
        if (i13 == 0) {
            return 0;
        }
        if (i13 == 1) {
            throw new IllegalArgumentException("Input should have at least 2 symbols for Base64 decoding, startIndex: " + i11 + ", endIndex: " + i12);
        }
        if (this.f66949b) {
            while (true) {
                if (i11 >= i12) {
                    break;
                }
                int i14 = source[i11] & 255;
                iArr = b.f87069b;
                int i15 = iArr[i14];
                if (i15 < 0) {
                    if (i15 == -2) {
                        i13 -= i12 - i11;
                        break;
                    }
                    i13--;
                }
                i11++;
            }
        } else if (source[i12 - 1] == 61) {
            i13 = source[i12 + (-2)] == 61 ? i13 - 2 : i13 - 1;
        }
        return (int) ((i13 * 6) / 8);
    }

    @k
    public final String t(@k byte[] source, int i11, int i12) {
        g0.p(source, "source");
        return new String(D(source, i11, i12), u30.d.f91604g);
    }

    public final int v(@k byte[] source, @k byte[] destination, int i11, int i12, int i13) {
        g0.p(source, "source");
        g0.p(destination, "destination");
        return x(source, destination, i11, i12, i13);
    }

    public final int x(@k byte[] source, @k byte[] destination, int i11, int i12, int i13) {
        int i14 = i12;
        g0.p(source, "source");
        g0.p(destination, "destination");
        i(source.length, i14, i13);
        g(destination.length, i11, y(i13 - i14));
        byte[] bArr = this.f66948a ? b.f87070c : b.f87068a;
        int i15 = this.f66949b ? this.f66952e : Integer.MAX_VALUE;
        int i16 = i11;
        while (i14 + 2 < i13) {
            int min = Math.min((i13 - i14) / 3, i15);
            for (int i17 = 0; i17 < min; i17++) {
                int i18 = source[i14] & 255;
                int i19 = i14 + 2;
                int i21 = source[i14 + 1] & 255;
                i14 += 3;
                int i22 = (i21 << 8) | (i18 << 16) | (source[i19] & 255);
                destination[i16] = bArr[i22 >>> 18];
                destination[i16 + 1] = bArr[(i22 >>> 12) & 63];
                int i23 = i16 + 3;
                destination[i16 + 2] = bArr[(i22 >>> 6) & 63];
                i16 += 4;
                destination[i23] = bArr[i22 & 63];
            }
            if (min == i15 && i14 != i13) {
                int i24 = i16 + 1;
                byte[] bArr2 = f66944n;
                destination[i16] = bArr2[0];
                i16 += 2;
                destination[i24] = bArr2[1];
            }
        }
        int i25 = i13 - i14;
        if (i25 == 1) {
            int i26 = i14 + 1;
            int i27 = (source[i14] & 255) << 4;
            destination[i16] = bArr[i27 >>> 6];
            int i28 = i16 + 2;
            destination[i16 + 1] = bArr[i27 & 63];
            if (J()) {
                int i29 = i16 + 3;
                destination[i28] = 61;
                i16 += 4;
                destination[i29] = 61;
                i14 = i26;
            } else {
                i14 = i26;
                i16 = i28;
            }
        } else if (i25 == 2) {
            int i31 = i14 + 1;
            int i32 = source[i14] & 255;
            i14 += 2;
            int i33 = ((source[i31] & 255) << 2) | (i32 << 10);
            destination[i16] = bArr[i33 >>> 12];
            destination[i16 + 1] = bArr[(i33 >>> 6) & 63];
            int i34 = i16 + 3;
            destination[i16 + 2] = bArr[i33 & 63];
            if (J()) {
                i16 += 4;
                destination[i34] = 61;
            } else {
                i16 = i34;
            }
        }
        if (i14 == i13) {
            return i16 - i11;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int y(int i11) {
        int i12 = i11 / 3;
        int i13 = i11 % 3;
        int i14 = i12 * 4;
        if (i13 != 0) {
            i14 += J() ? 4 : i13 + 1;
        }
        if (i14 < 0) {
            throw new IllegalArgumentException("Input is too big");
        }
        if (this.f66949b) {
            i14 += ((i14 - 1) / this.f66950c) * 2;
        }
        if (i14 >= 0) {
            return i14;
        }
        throw new IllegalArgumentException("Input is too big");
    }

    @k
    public final <A extends Appendable> A z(@k byte[] source, @k A destination, int i11, int i12) {
        g0.p(source, "source");
        g0.p(destination, "destination");
        destination.append(new String(D(source, i11, i12), u30.d.f91604g));
        return destination;
    }

    public Base64(boolean z11, boolean z12, int i11, PaddingOption paddingOption) {
        this.f66948a = z11;
        this.f66949b = z12;
        this.f66950c = i11;
        this.f66951d = paddingOption;
        if (z11 && z12) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f66952e = i11 / 4;
    }
}
