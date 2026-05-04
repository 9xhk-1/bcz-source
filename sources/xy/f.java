package xy;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nBase64.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Base64.kt\nio/ktor/util/Base64Kt\n+ 2 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,114:1\n110#1:118\n110#1:119\n113#1:133\n15#2,3:115\n15#2,2:121\n17#2:127\n15#2,2:128\n17#2:135\n1#3:120\n389#4,4:123\n12963#5,3:130\n12966#5:134\n*S KotlinDebug\n*F\n+ 1 Base64.kt\nio/ktor/util/Base64Kt\n*L\n45#1:118\n61#1:119\n99#1:133\n23#1:115,3\n85#1:121,2\n85#1:127\n92#1:128,2\n92#1:135\n86#1:123,4\n98#1:130,3\n98#1:134\n*E\n"})
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String f98501a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

    /* renamed from: b, reason: collision with root package name */
    public static final byte f98502b = 63;

    /* renamed from: c, reason: collision with root package name */
    public static final int f98503c = 63;

    /* renamed from: d, reason: collision with root package name */
    public static final char f98504d = '=';

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final int[] f98505e;

    static {
        int[] iArr = new int[256];
        for (int i11 = 0; i11 < 256; i11++) {
            iArr[i11] = u30.k0.I3("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", (char) i11, 0, false, 6, null);
        }
        f98505e = iArr;
    }

    @m80.k
    public static final y40.c0 b(@m80.k y40.c0 c0Var) {
        int i11;
        kotlin.jvm.internal.g0.p(c0Var, "<this>");
        y40.b bVar = new y40.b();
        byte[] bArr = new byte[4];
        while (jz.j.j(c0Var) > 0) {
            int i12 = 0;
            y40.c0 c0Var2 = c0Var;
            int c11 = jz.n.c(c0Var2, bArr, 0, 0, 6, null);
            int i13 = 0;
            int i14 = 0;
            while (i12 < 4) {
                i13 |= ((byte) (((byte) f98505e[bArr[i12] & 255]) & 63)) << ((3 - i14) * 6);
                i12++;
                i14++;
            }
            int i15 = 4 - c11;
            if (i15 <= 2) {
                while (true) {
                    bVar.u((byte) ((i13 >> (i11 * 8)) & 255));
                    i11 = i11 != i15 ? i11 - 1 : 2;
                }
            }
            c0Var = c0Var2;
        }
        return bVar;
    }

    @m80.k
    public static final byte[] c(@m80.k String str) {
        String str2;
        kotlin.jvm.internal.g0.p(str, "<this>");
        y40.b bVar = new y40.b();
        int A3 = u30.k0.A3(str);
        while (true) {
            if (-1 >= A3) {
                str2 = "";
                break;
            }
            if (str.charAt(A3) != '=') {
                str2 = str.substring(0, A3 + 1);
                kotlin.jvm.internal.g0.o(str2, "substring(...)");
                break;
            }
            A3--;
        }
        jz.s.p(bVar, str2, 0, 0, null, 14, null);
        return y40.g0.c(b(bVar));
    }

    @m80.k
    public static final String d(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        byte[] c11 = c(str);
        return u30.f0.W1(c11, 0, c11.length, false, 4, null);
    }

    @m80.k
    public static final String e(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        y40.b bVar = new y40.b();
        jz.s.p(bVar, str, 0, 0, null, 14, null);
        return f(bVar);
    }

    @m80.k
    public static final String f(@m80.k y40.c0 c0Var) {
        kotlin.jvm.internal.g0.p(c0Var, "<this>");
        return g(y40.g0.c(c0Var));
    }

    @m80.k
    public static final String g(@m80.k byte[] bArr) {
        int i11;
        int i12;
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        int i13 = 3;
        char[] cArr = new char[((bArr.length * 8) / 6) + 3];
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int i16 = i14 + 3;
            if (i16 > bArr.length) {
                break;
            }
            int i17 = (bArr[i14 + 2] & 255) | ((bArr[i14] & 255) << 16) | ((bArr[i14 + 1] & 255) << 8);
            int i18 = 3;
            while (-1 < i18) {
                cArr[i15] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((i17 >> (i18 * 6)) & 63);
                i18--;
                i15++;
            }
            i14 = i16;
        }
        int length = bArr.length - i14;
        if (length == 0) {
            return u30.f0.M1(cArr, 0, i15);
        }
        if (length == 1) {
            i11 = (bArr[i14] & 255) << 16;
        } else {
            i11 = ((bArr[i14 + 1] & 255) << 8) | ((bArr[i14] & 255) << 16);
        }
        int i19 = ((3 - length) * 8) / 6;
        if (i19 <= 3) {
            while (true) {
                i12 = i15 + 1;
                cArr[i15] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((i11 >> (i13 * 6)) & 63);
                if (i13 == i19) {
                    break;
                }
                i13--;
                i15 = i12;
            }
            i15 = i12;
        }
        int i21 = 0;
        while (i21 < i19) {
            cArr[i15] = '=';
            i21++;
            i15++;
        }
        return u30.f0.M1(cArr, 0, i15);
    }

    public static final byte h(byte b11) {
        return (byte) (((byte) f98505e[b11 & 255]) & 63);
    }

    public static final char i(int i11) {
        return "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(i11);
    }
}
