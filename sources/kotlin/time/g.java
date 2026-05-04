package kotlin.time;

import com.huawei.hms.framework.common.ExceptionCode;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.time.h;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nInstant.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Instant.kt\nkotlin/time/InstantKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Instant.kt\nkotlin/time/UnboundLocalDateTime\n*L\n1#1,864:1\n1#2:865\n479#3,28:866\n*S KotlinDebug\n*F\n+ 1 Instant.kt\nkotlin/time/InstantKt\n*L\n689#1:866,28\n*E\n"})
/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final long f67766a = -3217862419201L;

    /* renamed from: b, reason: collision with root package name */
    public static final long f67767b = 3093527980800L;

    /* renamed from: c, reason: collision with root package name */
    public static final long f67768c = -31557014167219200L;

    /* renamed from: d, reason: collision with root package name */
    public static final long f67769d = 31556889864403199L;

    /* renamed from: e, reason: collision with root package name */
    public static final int f67770e = 146097;

    /* renamed from: f, reason: collision with root package name */
    public static final int f67771f = 719528;

    /* renamed from: g, reason: collision with root package name */
    public static final int f67772g = 3600;

    /* renamed from: h, reason: collision with root package name */
    public static final int f67773h = 60;

    /* renamed from: i, reason: collision with root package name */
    public static final int f67774i = 24;

    /* renamed from: j, reason: collision with root package name */
    public static final int f67775j = 86400;

    /* renamed from: k, reason: collision with root package name */
    public static final int f67776k = 1000000000;

    /* renamed from: l, reason: collision with root package name */
    public static final int f67777l = 1000000;

    /* renamed from: m, reason: collision with root package name */
    public static final int f67778m = 1000;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public static final int[] f67779n = {1, 10, 100, 1000, 10000, 100000, 1000000, ExceptionCode.CRASH_EXCEPTION, 100000000, 1000000000};

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public static final int[] f67780o = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};

    /* renamed from: p, reason: collision with root package name */
    @m80.k
    public static final int[] f67781p = {3, 6};

    /* renamed from: q, reason: collision with root package name */
    @m80.k
    public static final int[] f67782q = {1, 2, 4, 5, 7, 8};

    public static final int A(CharSequence charSequence, int i11) {
        return ((charSequence.charAt(i11) - '0') * 10) + (charSequence.charAt(i11 + 1) - '0');
    }

    public static final long B(long j11, long j12, x00.a aVar) {
        long j13 = j11 + j12;
        if ((j11 ^ j13) >= 0 || (j11 ^ j12) < 0) {
            return j13;
        }
        aVar.invoke();
        throw new KotlinNothingValueException();
    }

    public static final long C(long j11, long j12, x00.a aVar) {
        if (j12 == 1) {
            return j11;
        }
        if (j11 == 1) {
            return j12;
        }
        if (j11 == 0 || j12 == 0) {
            return 0L;
        }
        long j13 = j11 * j12;
        if (j13 / j12 == j11 && ((j11 != Long.MIN_VALUE || j12 != -1) && (j12 != Long.MIN_VALUE || j11 != -1))) {
            return j13;
        }
        aVar.invoke();
        throw new KotlinNothingValueException();
    }

    public static final String D(CharSequence charSequence, int i11) {
        if (charSequence.length() <= i11) {
            return charSequence.toString();
        }
        return charSequence.subSequence(0, i11).toString() + "...";
    }

    @w30.h
    public static final String j(Instant instant) {
        int[] iArr;
        StringBuilder sb2 = new StringBuilder();
        o a11 = o.f67796h.a(instant);
        int g11 = a11.g();
        int i11 = 0;
        if (Math.abs(g11) < 1000) {
            StringBuilder sb3 = new StringBuilder();
            if (g11 >= 0) {
                sb3.append(g11 + 10000);
                g0.o(sb3.deleteCharAt(0), "deleteCharAt(...)");
            } else {
                sb3.append(g11 - 10000);
                g0.o(sb3.deleteCharAt(1), "deleteCharAt(...)");
            }
            sb2.append((CharSequence) sb3);
        } else {
            if (g11 >= 10000) {
                sb2.append('+');
            }
            sb2.append(g11);
        }
        sb2.append('-');
        k(sb2, sb2, a11.d());
        sb2.append('-');
        k(sb2, sb2, a11.a());
        sb2.append('T');
        k(sb2, sb2, a11.b());
        sb2.append(':');
        k(sb2, sb2, a11.c());
        sb2.append(':');
        k(sb2, sb2, a11.f());
        if (a11.e() != 0) {
            sb2.append('.');
            while (true) {
                int e11 = a11.e();
                iArr = f67779n;
                int i12 = i11 + 1;
                if (e11 % iArr[i12] != 0) {
                    break;
                }
                i11 = i12;
            }
            int i13 = i11 - (i11 % 3);
            String valueOf = String.valueOf((a11.e() / iArr[i13]) + iArr[9 - i13]);
            g0.n(valueOf, "null cannot be cast to non-null type java.lang.String");
            String substring = valueOf.substring(1);
            g0.o(substring, "substring(...)");
            sb2.append(substring);
        }
        sb2.append('Z');
        return sb2.toString();
    }

    public static final void k(Appendable appendable, StringBuilder sb2, int i11) {
        if (i11 < 10) {
            appendable.append('0');
        }
        sb2.append(i11);
    }

    public static final boolean l(Instant instant) {
        g0.p(instant, "<this>");
        return instant.compareTo(Instant.Companion.e()) >= 0;
    }

    public static final boolean n(Instant instant) {
        g0.p(instant, "<this>");
        return instant.compareTo(Instant.Companion.f()) <= 0;
    }

    public static final boolean p(int i11) {
        if ((i11 & 3) == 0) {
            return i11 % 100 != 0 || i11 % 400 == 0;
        }
        return false;
    }

    public static final int q(int i11, boolean z11) {
        return i11 != 2 ? (i11 == 4 || i11 == 6 || i11 == 9 || i11 == 11) ? 30 : 31 : z11 ? 29 : 28;
    }

    @w30.h
    public static final h r(CharSequence charSequence) {
        int i11;
        int i12;
        int i13;
        int i14;
        char charAt;
        char charAt2;
        if (charSequence.length() == 0) {
            return new h.a("An empty string is not a valid Instant", charSequence);
        }
        char charAt3 = charSequence.charAt(0);
        if (charAt3 == '+' || charAt3 == '-') {
            i11 = 1;
        } else {
            i11 = 0;
            charAt3 = ' ';
        }
        int i15 = 0;
        int i16 = i11;
        while (i16 < charSequence.length() && '0' <= (charAt2 = charSequence.charAt(i16)) && charAt2 < ':') {
            i15 = (i15 * 10) + (charSequence.charAt(i16) - '0');
            i16++;
        }
        int i17 = i16 - i11;
        if (i17 > 10) {
            return z(charSequence, "Expected at most 10 digits for the year number, got " + i17 + " digits");
        }
        if (i17 == 10 && g0.t(charSequence.charAt(i11), 50) >= 0) {
            return z(charSequence, "Expected at most 9 digits for the year number or year 1000000000, got " + i17 + " digits");
        }
        if (i17 < 4) {
            return z(charSequence, "The year number must be padded to 4 digits, got " + i17 + " digits");
        }
        if (charAt3 == '+' && i17 == 4) {
            return z(charSequence, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
        }
        if (charAt3 == ' ' && i17 != 4) {
            return z(charSequence, "A '+' or '-' sign is required for year numbers longer than 4 digits");
        }
        if (charAt3 == '-') {
            i15 = -i15;
        }
        int i18 = i15;
        int i19 = i16 + 16;
        if (charSequence.length() < i19) {
            return z(charSequence, "The input string is too short");
        }
        h.a s11 = s(charSequence, "'-'", i16, new x00.l() { // from class: w30.k
            @Override // x00.l
            public final Object invoke(Object obj) {
                boolean t11;
                t11 = kotlin.time.g.t(((Character) obj).charValue());
                return Boolean.valueOf(t11);
            }
        });
        if (s11 != null) {
            return s11;
        }
        h.a s12 = s(charSequence, "'-'", i16 + 3, new x00.l() { // from class: w30.l
            @Override // x00.l
            public final Object invoke(Object obj) {
                boolean v11;
                v11 = kotlin.time.g.v(((Character) obj).charValue());
                return Boolean.valueOf(v11);
            }
        });
        if (s12 != null) {
            return s12;
        }
        h.a s13 = s(charSequence, "'T' or 't'", i16 + 6, new x00.l() { // from class: w30.m
            @Override // x00.l
            public final Object invoke(Object obj) {
                boolean w11;
                w11 = kotlin.time.g.w(((Character) obj).charValue());
                return Boolean.valueOf(w11);
            }
        });
        if (s13 != null) {
            return s13;
        }
        h.a s14 = s(charSequence, "':'", i16 + 9, new x00.l() { // from class: w30.n
            @Override // x00.l
            public final Object invoke(Object obj) {
                boolean x11;
                x11 = kotlin.time.g.x(((Character) obj).charValue());
                return Boolean.valueOf(x11);
            }
        });
        if (s14 != null) {
            return s14;
        }
        h.a s15 = s(charSequence, "':'", i16 + 12, new x00.l() { // from class: w30.o
            @Override // x00.l
            public final Object invoke(Object obj) {
                boolean y11;
                y11 = kotlin.time.g.y(((Character) obj).charValue());
                return Boolean.valueOf(y11);
            }
        });
        if (s15 != null) {
            return s15;
        }
        for (int i21 : f67780o) {
            h.a s16 = s(charSequence, "an ASCII digit", i21 + i16, new x00.l() { // from class: w30.p
                @Override // x00.l
                public final Object invoke(Object obj) {
                    boolean u11;
                    u11 = kotlin.time.g.u(((Character) obj).charValue());
                    return Boolean.valueOf(u11);
                }
            });
            if (s16 != null) {
                return s16;
            }
        }
        int A = A(charSequence, i16 + 1);
        int A2 = A(charSequence, i16 + 4);
        int A3 = A(charSequence, i16 + 7);
        int A4 = A(charSequence, i16 + 10);
        int A5 = A(charSequence, i16 + 13);
        int i22 = i16 + 15;
        if (charSequence.charAt(i22) == '.') {
            i22 = i19;
            int i23 = 0;
            while (i22 < charSequence.length() && '0' <= (charAt = charSequence.charAt(i22)) && charAt < ':') {
                i23 = (i23 * 10) + (charSequence.charAt(i22) - '0');
                i22++;
            }
            int i24 = i22 - i19;
            if (1 > i24 || i24 >= 10) {
                return z(charSequence, "1..9 digits are supported for the fraction of the second, got " + i24 + " digits");
            }
            i12 = i23 * f67779n[9 - i24];
        } else {
            i12 = 0;
        }
        if (i22 >= charSequence.length()) {
            return z(charSequence, "The UTC offset at the end of the string is missing");
        }
        char charAt4 = charSequence.charAt(i22);
        if (charAt4 == '+' || charAt4 == '-') {
            int length = charSequence.length() - i22;
            if (length > 9) {
                return z(charSequence, "The UTC offset string \"" + D(charSequence.subSequence(i22, charSequence.length()).toString(), 16) + "\" is too long");
            }
            if (length % 3 != 0) {
                return z(charSequence, "Invalid UTC offset string \"" + charSequence.subSequence(i22, charSequence.length()).toString() + '\"');
            }
            for (int i25 : f67781p) {
                int i26 = i22 + i25;
                if (i26 >= charSequence.length()) {
                    break;
                }
                if (charSequence.charAt(i26) != ':') {
                    return z(charSequence, "Expected ':' at index " + i26 + ", got '" + charSequence.charAt(i26) + '\'');
                }
            }
            int[] iArr = f67782q;
            int length2 = iArr.length;
            int i27 = 0;
            while (i27 < length2) {
                int i28 = iArr[i27] + i22;
                if (i28 >= charSequence.length()) {
                    break;
                }
                char charAt5 = charSequence.charAt(i28);
                int[] iArr2 = iArr;
                if ('0' > charAt5 || charAt5 >= ':') {
                    return z(charSequence, "Expected an ASCII digit at index " + i28 + ", got '" + charSequence.charAt(i28) + '\'');
                }
                i27++;
                iArr = iArr2;
            }
            int A6 = A(charSequence, i22 + 1);
            i13 = 3;
            int A7 = length > 3 ? A(charSequence, i22 + 4) : 0;
            int A8 = length > 6 ? A(charSequence, i22 + 7) : 0;
            if (A7 > 59) {
                return z(charSequence, "Expected offset-minute-of-hour in 0..59, got " + A7);
            }
            if (A8 > 59) {
                return z(charSequence, "Expected offset-second-of-minute in 0..59, got " + A8);
            }
            if (A6 > 17 && (A6 != 18 || A7 != 0 || A8 != 0)) {
                return z(charSequence, "Expected an offset in -18:00..+18:00, got " + charSequence.subSequence(i22, charSequence.length()).toString());
            }
            i14 = (charAt4 == '-' ? -1 : 1) * ((A6 * 3600) + (A7 * 60) + A8);
        } else {
            if (charAt4 != 'Z' && charAt4 != 'z') {
                return z(charSequence, "Expected the UTC offset at position " + i22 + ", got '" + charAt4 + '\'');
            }
            int i29 = i22 + 1;
            if (charSequence.length() != i29) {
                return z(charSequence, "Extra text after the instant at position " + i29);
            }
            i14 = 0;
            i13 = 3;
        }
        if (1 > A || A >= 13) {
            return z(charSequence, "Expected a month number in 1..12, got " + A);
        }
        if (1 > A2 || A2 > q(A, p(i18))) {
            return z(charSequence, "Expected a valid day-of-month for month " + A + " of year " + i18 + ", got " + A2);
        }
        if (A3 > 23) {
            return z(charSequence, "Expected hour in 0..23, got " + A3);
        }
        if (A4 > 59) {
            return z(charSequence, "Expected minute-of-hour in 0..59, got " + A4);
        }
        if (A5 > 59) {
            return z(charSequence, "Expected second-of-minute in 0..59, got " + A5);
        }
        o oVar = new o(i18, A, A2, A3, A4, A5, i12);
        long g11 = oVar.g();
        long j11 = 365 * g11;
        long d11 = (g11 >= 0 ? j11 + (((i13 + g11) / 4) - ((99 + g11) / 100)) + ((g11 + 399) / 400) : j11 - (((g11 / (-4)) - (g11 / (-100))) + (g11 / (-400)))) + (((oVar.d() * 367) - 362) / 12) + (oVar.a() - 1);
        if (oVar.d() > 2) {
            d11 = !p(oVar.g()) ? d11 - 2 : (-1) + d11;
        }
        return new h.b((((d11 - f67771f) * 86400) + (((oVar.b() * 3600) + (oVar.c() * 60)) + oVar.f())) - i14, oVar.e());
    }

    public static final h.a s(CharSequence charSequence, String str, int i11, x00.l<? super Character, Boolean> lVar) {
        char charAt = charSequence.charAt(i11);
        if (lVar.invoke(Character.valueOf(charAt)).booleanValue()) {
            return null;
        }
        return z(charSequence, "Expected " + str + ", but got '" + charAt + "' at position " + i11);
    }

    public static final boolean t(char c11) {
        return c11 == '-';
    }

    public static final boolean u(char c11) {
        return '0' <= c11 && c11 < ':';
    }

    public static final boolean v(char c11) {
        return c11 == '-';
    }

    public static final boolean w(char c11) {
        return c11 == 'T' || c11 == 't';
    }

    public static final boolean x(char c11) {
        return c11 == ':';
    }

    public static final boolean y(char c11) {
        return c11 == ':';
    }

    public static final h.a z(CharSequence charSequence, String str) {
        return new h.a(str + " when parsing an Instant from \"" + D(charSequence, 64) + '\"', charSequence);
    }

    @y0(version = "2.1")
    @w30.h
    @o00.f
    public static /* synthetic */ void m(Instant instant) {
    }

    @y0(version = "2.1")
    @w30.h
    @o00.f
    public static /* synthetic */ void o(Instant instant) {
    }
}
