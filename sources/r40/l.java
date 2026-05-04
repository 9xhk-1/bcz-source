package r40;

import androidx.collection.SieveCacheKt;
import androidx.exifinterface.media.ExifInterface;
import kotlin.KotlinNothingValueException;
import kotlinx.datetime.DateTimeFormatException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0(with = x40.j.class)
@kotlin.jvm.internal.u0({"SMAP\nDateTimePeriod.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateTimePeriod.kt\nkotlinx/datetime/DateTimePeriod\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,614:1\n1#2:615\n*E\n"})
/* loaded from: classes8.dex */
public abstract class l {

    @m80.k
    public static final a Companion = new a(null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public static final Void b(String str, int i11) {
            throw new DateTimeFormatException("Parse error at char " + i11 + ": " + str);
        }

        public static final int c(long j11, int i11, char c11) {
            if (j11 >= SieveCacheKt.NodeMetaAndPreviousMask && j11 <= SieveCacheKt.NodeLinkMask) {
                return (int) j11;
            }
            b("Value " + j11 + " does not fit into an Int, which is required for component '" + c11 + '\'', i11);
            throw new KotlinNothingValueException();
        }

        @m80.k
        public final l a(@m80.k String text) {
            int i11;
            int i12;
            char charAt;
            char c11;
            char c12;
            int i13;
            int i14;
            long j11;
            int c13;
            char charAt2;
            char c14;
            kotlin.jvm.internal.g0.p(text, "text");
            int i15 = 0;
            char c15 = 0;
            int i16 = 1;
            int i17 = 0;
            int i18 = 0;
            boolean z11 = false;
            int i19 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            while (i15 < text.length()) {
                int i26 = i25;
                int i27 = i24;
                int i28 = i23;
                int i29 = i21;
                int i31 = i19;
                if (c15 == 0) {
                    int i32 = i15 + 1;
                    if (i32 >= text.length() && (text.charAt(i15) == '+' || text.charAt(i15) == '-')) {
                        b("Unexpected end of string; 'P' designator is required", i15);
                        throw new KotlinNothingValueException();
                    }
                    char charAt3 = text.charAt(i15);
                    int i33 = i16;
                    if (charAt3 == '+' || charAt3 == '-') {
                        int i34 = text.charAt(i15) == '-' ? -1 : i33;
                        if (text.charAt(i32) != 'P') {
                            b("Expected 'P', got '" + text.charAt(i32) + '\'', i32);
                            throw new KotlinNothingValueException();
                        }
                        i15 += 2;
                        i16 = i34;
                    } else {
                        if (charAt3 != 'P') {
                            b("Expected '+', '-', 'P', got '" + text.charAt(i15) + '\'', i15);
                            throw new KotlinNothingValueException();
                        }
                        i15 = i32;
                        i16 = i33;
                    }
                    i19 = i31;
                    i21 = i29;
                    i23 = i28;
                    i24 = i27;
                    i25 = i26;
                    c15 = 1;
                } else {
                    int i35 = i16;
                    char charAt4 = text.charAt(i15);
                    char c16 = '0';
                    if (charAt4 == '+' || charAt4 == '-') {
                        i11 = text.charAt(i15) == '-' ? i35 * (-1) : i35;
                        i12 = i15 + 1;
                        if (i12 < text.length() && '0' <= (charAt = text.charAt(i12))) {
                            c11 = ':';
                            if (charAt >= ':') {
                            }
                        }
                        b("A number expected after '" + text.charAt(i12) + '\'', i12);
                        throw new KotlinNothingValueException();
                    }
                    if (('0' <= charAt4 && charAt4 < ':') || charAt4 != 'T') {
                        i12 = i15;
                        i11 = i35;
                        c11 = ':';
                    } else {
                        if (c15 >= 6) {
                            b("Only one 'T' designator is allowed", i15);
                            throw new KotlinNothingValueException();
                        }
                        i15++;
                        i19 = i31;
                        i21 = i29;
                        i23 = i28;
                        i24 = i27;
                        i25 = i26;
                        i16 = i35;
                        c15 = 6;
                    }
                    long j12 = 0;
                    while (i12 < text.length()) {
                        char charAt5 = text.charAt(i12);
                        if (c16 > charAt5 || charAt5 >= c11) {
                            c12 = c16;
                            i13 = i31;
                            i14 = i15;
                            j11 = j12;
                            break;
                        }
                        char c17 = c16;
                        int i36 = i31;
                        int i37 = i15;
                        try {
                            j12 = t40.e.b(t40.e.d(j12, 10L), text.charAt(i12) - '0');
                            i12++;
                            i31 = i36;
                            c16 = c17;
                            i15 = i37;
                            c11 = ':';
                        } catch (ArithmeticException unused) {
                            b("The number is too large", i37);
                            throw new KotlinNothingValueException();
                        }
                    }
                    c12 = c16;
                    i13 = i31;
                    i14 = i15;
                    j11 = j12;
                    long j13 = i11 * j11;
                    int i38 = i11;
                    if (i12 == text.length()) {
                        b("Expected a designator after the numerical value", i12);
                        throw new KotlinNothingValueException();
                    }
                    char upperCase = Character.toUpperCase(text.charAt(i12));
                    int i39 = i17;
                    int i41 = i18;
                    if (upperCase == ',' || upperCase == '.') {
                        int i42 = i12 + 1;
                        if (i42 >= text.length()) {
                            b("Expected designator 'S' after " + text.charAt(i12), i42);
                            throw new KotlinNothingValueException();
                        }
                        i12 = i42;
                        while (i12 < text.length() && (c14 = c12) <= (charAt2 = text.charAt(i12)) && charAt2 < ':') {
                            i12++;
                            c12 = c14;
                        }
                        int i43 = i12 - i42;
                        if (i43 > 9) {
                            b("Only the nanosecond fractions of a second are supported", i42);
                            throw new KotlinNothingValueException();
                        }
                        StringBuilder sb2 = new StringBuilder();
                        String substring = text.substring(i42, i12);
                        kotlin.jvm.internal.g0.o(substring, "substring(...)");
                        sb2.append(substring);
                        sb2.append(u30.f0.v2("0", 9 - i43));
                        int parseInt = Integer.parseInt(sb2.toString(), kotlin.text.a.a(10)) * i38;
                        if (text.charAt(i12) != 'S') {
                            b("Expected the 'S' designator after a fraction", i12);
                            throw new KotlinNothingValueException();
                        }
                        if (c15 >= '\t' || c15 < 6) {
                            b("Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'", i12);
                            throw new KotlinNothingValueException();
                        }
                        c13 = c(j13, i14, 'S');
                        i22 = parseInt;
                        c15 = '\t';
                        i19 = i13;
                        i21 = i29;
                        i23 = i28;
                        i24 = i27;
                        i17 = i39;
                        i18 = i41;
                    } else {
                        if (upperCase != 'D') {
                            if (upperCase != 'H') {
                                if (upperCase != 'M') {
                                    if (upperCase != 'S') {
                                        if (upperCase != 'W') {
                                            if (upperCase != 'Y') {
                                                b("Expected a designator after the numerical value", i12);
                                                throw new KotlinNothingValueException();
                                            }
                                            if (c15 >= 2) {
                                                b("Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'", i12);
                                                throw new KotlinNothingValueException();
                                            }
                                            i19 = c(j13, i14, io.ktor.util.date.b.f62002h);
                                            c15 = 2;
                                            i21 = i29;
                                            i23 = i28;
                                            i24 = i27;
                                            i25 = i26;
                                            i17 = i39;
                                        } else {
                                            if (c15 >= 4) {
                                                b("Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'", i12);
                                                throw new KotlinNothingValueException();
                                            }
                                            i18 = c(j13, i14, 'W');
                                            c15 = 4;
                                            i19 = i13;
                                            i21 = i29;
                                            i23 = i28;
                                            i24 = i27;
                                            i25 = i26;
                                            i17 = i39;
                                        }
                                    } else {
                                        if (c15 >= '\t' || c15 < 6) {
                                            b("Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'", i12);
                                            throw new KotlinNothingValueException();
                                        }
                                        c13 = c(j13, i14, 'S');
                                        i19 = i13;
                                        i21 = i29;
                                        i23 = i28;
                                        i24 = i27;
                                        i17 = i39;
                                        i18 = i41;
                                        c15 = '\t';
                                    }
                                } else if (c15 >= 6) {
                                    if (c15 >= '\b') {
                                        b("Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'", i12);
                                        throw new KotlinNothingValueException();
                                    }
                                    int c18 = c(j13, i14, io.ktor.util.date.b.f62001g);
                                    c15 = '\b';
                                    i19 = i13;
                                    i21 = i29;
                                    i23 = i28;
                                    i25 = i26;
                                    i17 = i39;
                                    i18 = i41;
                                    i24 = c18;
                                } else {
                                    if (c15 >= 3) {
                                        b("Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'", i12);
                                        throw new KotlinNothingValueException();
                                    }
                                    i21 = c(j13, i14, io.ktor.util.date.b.f62001g);
                                    c15 = 3;
                                    i19 = i13;
                                    i23 = i28;
                                    i24 = i27;
                                    i25 = i26;
                                    i17 = i39;
                                }
                            } else {
                                if (c15 >= 7 || c15 < 6) {
                                    b("Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'", i12);
                                    throw new KotlinNothingValueException();
                                }
                                int c19 = c(j13, i14, 'H');
                                c15 = 7;
                                i19 = i13;
                                i21 = i29;
                                i24 = i27;
                                i25 = i26;
                                i17 = i39;
                                i18 = i41;
                                i23 = c19;
                            }
                            i15 = i12 + 1;
                            z11 = true;
                            i16 = i35;
                        } else {
                            if (c15 >= 5) {
                                b("Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'", i12);
                                throw new KotlinNothingValueException();
                            }
                            i17 = c(j13, i14, 'D');
                            c15 = 5;
                            i19 = i13;
                            i21 = i29;
                            i23 = i28;
                            i24 = i27;
                            i25 = i26;
                        }
                        i18 = i41;
                        i15 = i12 + 1;
                        z11 = true;
                        i16 = i35;
                    }
                    i25 = c13;
                    i15 = i12 + 1;
                    z11 = true;
                    i16 = i35;
                }
            }
            if (c15 == 0) {
                b("Unexpected end of input; 'P' designator is required", i15);
                throw new KotlinNothingValueException();
            }
            if (c15 == 6) {
                b("Unexpected end of input; at least one time component is required after 'T'", i15);
                throw new KotlinNothingValueException();
            }
            long j14 = i17 + (i18 * 7);
            if (SieveCacheKt.NodeMetaAndPreviousMask > j14 || j14 > SieveCacheKt.NodeLinkMask) {
                b("The total number of days under 'D' and 'W' designators should fit into an Int", 0);
                throw new KotlinNothingValueException();
            }
            int i44 = (int) j14;
            if (z11) {
                return n.a(i19, i21, i44, i23, i24, i25, i22);
            }
            b("At least one component is required, but none were found", 0);
            throw new KotlinNothingValueException();
        }

        @m80.k
        public final f50.i<l> serializer() {
            return x40.j.f97439b;
        }

        public a() {
        }
    }

    public /* synthetic */ l(kotlin.jvm.internal.v vVar) {
        this();
    }

    public final boolean a() {
        if (h() > 0 || b() > 0 || i() > 0) {
            return false;
        }
        return ((h() | i()) == 0 && b() == 0) ? false : true;
    }

    public abstract int b();

    public int c() {
        return (int) (i() / t40.b.f89493k);
    }

    public int d() {
        return (int) ((i() % t40.b.f89493k) / t40.b.f89492j);
    }

    public final int e() {
        return (int) (h() % 12);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return h() == lVar.h() && b() == lVar.b() && i() == lVar.i();
    }

    public int f() {
        return (int) (i() % 1000000000);
    }

    public int g() {
        return (int) ((i() % t40.b.f89492j) / 1000000000);
    }

    public abstract long h();

    public int hashCode() {
        return (((Long.hashCode(h()) * 31) + b()) * 31) + Long.hashCode(i());
    }

    public abstract long i();

    public final int j() {
        return (int) (h() / 12);
    }

    @m80.k
    public String toString() {
        int i11;
        StringBuilder sb2 = new StringBuilder();
        if (a()) {
            sb2.append('-');
            i11 = -1;
        } else {
            i11 = 1;
        }
        sb2.append('P');
        if (j() != 0) {
            sb2.append(j() * i11);
            sb2.append(io.ktor.util.date.b.f62002h);
        }
        if (e() != 0) {
            sb2.append(e() * i11);
            sb2.append(io.ktor.util.date.b.f62001g);
        }
        if (b() != 0) {
            sb2.append(b() * i11);
            sb2.append('D');
        }
        int c11 = c();
        String str = "";
        String str2 = ExifInterface.GPS_DIRECTION_TRUE;
        if (c11 != 0) {
            sb2.append(ExifInterface.GPS_DIRECTION_TRUE);
            sb2.append(c() * i11);
            sb2.append('H');
            str2 = "";
        }
        if (d() != 0) {
            sb2.append(str2);
            sb2.append(d() * i11);
            sb2.append(io.ktor.util.date.b.f62001g);
        } else {
            str = str2;
        }
        if ((g() | f()) != 0) {
            sb2.append(str);
            sb2.append(g() != 0 ? Integer.valueOf(g() * i11) : f() * i11 < 0 ? "-0" : "0");
            if (f() != 0) {
                sb2.append('.');
                sb2.append(u30.k0.m4(String.valueOf(Math.abs(f())), 9, '0'));
            }
            sb2.append('S');
        }
        if (sb2.length() == 1) {
            sb2.append("0D");
        }
        return sb2.toString();
    }

    public l() {
    }
}
