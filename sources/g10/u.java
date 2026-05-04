package g10;

import androidx.collection.SieveCacheKt;
import com.tencent.ijk.media.player.IjkMediaMeta;
import g10.a;
import g10.j;
import g10.m;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.random.Random;
import yz.j2;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\n_Ranges.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Ranges.kt\nkotlin/ranges/RangesKt___RangesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1572:1\n1#2:1573\n*E\n"})
/* loaded from: classes8.dex */
public class u extends t {
    public static float A(float f11, float f12) {
        return f11 > f12 ? f12 : f11;
    }

    @m80.l
    @y0(version = "1.7")
    public static final Integer A0(@m80.k j jVar) {
        g0.p(jVar, "<this>");
        if (jVar.isEmpty()) {
            return null;
        }
        return Integer.valueOf(jVar.d());
    }

    @m80.k
    public static final a A1(@m80.k a aVar, int i11) {
        g0.p(aVar, "<this>");
        t.a(i11 > 0, Integer.valueOf(i11));
        a.C0622a c0622a = a.f52498d;
        char d11 = aVar.d();
        char f11 = aVar.f();
        if (aVar.g() <= 0) {
            i11 = -i11;
        }
        return c0622a.a(d11, f11, i11);
    }

    public static int B(int i11, int i12) {
        return i11 > i12 ? i12 : i11;
    }

    @m80.l
    @y0(version = "1.7")
    public static final Long B0(@m80.k m mVar) {
        g0.p(mVar, "<this>");
        if (mVar.isEmpty()) {
            return null;
        }
        return Long.valueOf(mVar.d());
    }

    @m80.k
    public static j B1(@m80.k j jVar, int i11) {
        g0.p(jVar, "<this>");
        t.a(i11 > 0, Integer.valueOf(i11));
        j.a aVar = j.f52518d;
        int d11 = jVar.d();
        int f11 = jVar.f();
        if (jVar.g() <= 0) {
            i11 = -i11;
        }
        return aVar.a(d11, f11, i11);
    }

    public static long C(long j11, long j12) {
        return j11 > j12 ? j12 : j11;
    }

    @w00.j(name = "floatRangeContains")
    @yz.n(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @yz.o(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean C0(g gVar, byte b11) {
        g0.p(gVar, "<this>");
        return gVar.contains(Float.valueOf(b11));
    }

    @m80.k
    public static m C1(@m80.k m mVar, long j11) {
        g0.p(mVar, "<this>");
        t.a(j11 > 0, Long.valueOf(j11));
        m.a aVar = m.f52528d;
        long d11 = mVar.d();
        long f11 = mVar.f();
        if (mVar.g() <= 0) {
            j11 = -j11;
        }
        return aVar.a(d11, f11, j11);
    }

    @m80.k
    public static final <T extends Comparable<? super T>> T D(@m80.k T t11, @m80.k T maximumValue) {
        g0.p(t11, "<this>");
        g0.p(maximumValue, "maximumValue");
        return t11.compareTo(maximumValue) > 0 ? maximumValue : t11;
    }

    @w00.j(name = "floatRangeContains")
    public static final boolean D0(@m80.k g<Float> gVar, double d11) {
        g0.p(gVar, "<this>");
        return gVar.contains(Float.valueOf((float) d11));
    }

    @m80.l
    public static final Byte D1(double d11) {
        if (-128.0d > d11 || d11 > 127.0d) {
            return null;
        }
        return Byte.valueOf((byte) d11);
    }

    public static final short E(short s11, short s12) {
        return s11 > s12 ? s12 : s11;
    }

    @w00.j(name = "floatRangeContains")
    @yz.n(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @yz.o(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean E0(g gVar, int i11) {
        g0.p(gVar, "<this>");
        return gVar.contains(Float.valueOf(i11));
    }

    @m80.l
    public static final Byte E1(float f11) {
        if (-128.0f > f11 || f11 > 127.0f) {
            return null;
        }
        return Byte.valueOf((byte) f11);
    }

    public static final byte F(byte b11, byte b12, byte b13) {
        if (b12 <= b13) {
            return b11 < b12 ? b12 : b11 > b13 ? b13 : b11;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) b13) + " is less than minimum " + ((int) b12) + '.');
    }

    @w00.j(name = "floatRangeContains")
    @yz.n(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @yz.o(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean F0(g gVar, long j11) {
        g0.p(gVar, "<this>");
        return gVar.contains(Float.valueOf(j11));
    }

    @m80.l
    public static final Byte F1(int i11) {
        if (-128 > i11 || i11 >= 128) {
            return null;
        }
        return Byte.valueOf((byte) i11);
    }

    public static double G(double d11, double d12, double d13) {
        if (d12 <= d13) {
            return d11 < d12 ? d12 : d11 > d13 ? d13 : d11;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d13 + " is less than minimum " + d12 + '.');
    }

    @w00.j(name = "floatRangeContains")
    @yz.n(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @yz.o(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean G0(g gVar, short s11) {
        g0.p(gVar, "<this>");
        return gVar.contains(Float.valueOf(s11));
    }

    @m80.l
    public static final Byte G1(long j11) {
        if (-128 > j11 || j11 >= 128) {
            return null;
        }
        return Byte.valueOf((byte) j11);
    }

    public static float H(float f11, float f12, float f13) {
        if (f12 <= f13) {
            return f11 < f12 ? f12 : f11 > f13 ? f13 : f11;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f13 + " is less than minimum " + f12 + '.');
    }

    @w00.j(name = "intRangeContains")
    public static final boolean H0(@m80.k g<Integer> gVar, byte b11) {
        g0.p(gVar, "<this>");
        return gVar.contains(Integer.valueOf(b11));
    }

    @m80.l
    public static final Byte H1(short s11) {
        if (-128 > s11 || s11 >= 128) {
            return null;
        }
        return Byte.valueOf((byte) s11);
    }

    public static int I(int i11, int i12, int i13) {
        if (i12 <= i13) {
            return i11 < i12 ? i12 : i11 > i13 ? i13 : i11;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i13 + " is less than minimum " + i12 + '.');
    }

    @w00.j(name = "intRangeContains")
    @yz.n(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @yz.o(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean I0(g gVar, double d11) {
        g0.p(gVar, "<this>");
        Integer I1 = I1(d11);
        if (I1 != null) {
            return gVar.contains(I1);
        }
        return false;
    }

    @m80.l
    public static final Integer I1(double d11) {
        if (-2.147483648E9d > d11 || d11 > 2.147483647E9d) {
            return null;
        }
        return Integer.valueOf((int) d11);
    }

    public static int J(int i11, @m80.k g<Integer> range) {
        g0.p(range, "range");
        if (range instanceof f) {
            return ((Number) M(Integer.valueOf(i11), (f) range)).intValue();
        }
        if (!range.isEmpty()) {
            return i11 < range.getStart().intValue() ? range.getStart().intValue() : i11 > range.getEndInclusive().intValue() ? range.getEndInclusive().intValue() : i11;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    @w00.j(name = "intRangeContains")
    @yz.n(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @yz.o(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean J0(g gVar, float f11) {
        g0.p(gVar, "<this>");
        Integer J1 = J1(f11);
        if (J1 != null) {
            return gVar.contains(J1);
        }
        return false;
    }

    @m80.l
    public static final Integer J1(float f11) {
        if (-2.14748365E9f > f11 || f11 > 2.14748365E9f) {
            return null;
        }
        return Integer.valueOf((int) f11);
    }

    public static long K(long j11, long j12, long j13) {
        if (j12 <= j13) {
            return j11 < j12 ? j12 : j11 > j13 ? j13 : j11;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j13 + " is less than minimum " + j12 + '.');
    }

    @w00.j(name = "intRangeContains")
    public static final boolean K0(@m80.k g<Integer> gVar, long j11) {
        g0.p(gVar, "<this>");
        Integer K1 = K1(j11);
        if (K1 != null) {
            return gVar.contains(K1);
        }
        return false;
    }

    @m80.l
    public static final Integer K1(long j11) {
        if (SieveCacheKt.NodeMetaAndPreviousMask > j11 || j11 >= IjkMediaMeta.AV_CH_WIDE_LEFT) {
            return null;
        }
        return Integer.valueOf((int) j11);
    }

    public static long L(long j11, @m80.k g<Long> range) {
        g0.p(range, "range");
        if (range instanceof f) {
            return ((Number) M(Long.valueOf(j11), (f) range)).longValue();
        }
        if (!range.isEmpty()) {
            return j11 < range.getStart().longValue() ? range.getStart().longValue() : j11 > range.getEndInclusive().longValue() ? range.getEndInclusive().longValue() : j11;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    @w00.j(name = "intRangeContains")
    public static final boolean L0(@m80.k g<Integer> gVar, short s11) {
        g0.p(gVar, "<this>");
        return gVar.contains(Integer.valueOf(s11));
    }

    @m80.l
    public static final Long L1(double d11) {
        if (-9.223372036854776E18d > d11 || d11 > 9.223372036854776E18d) {
            return null;
        }
        return Long.valueOf((long) d11);
    }

    @y0(version = "1.1")
    @m80.k
    public static <T extends Comparable<? super T>> T M(@m80.k T t11, @m80.k f<T> range) {
        g0.p(t11, "<this>");
        g0.p(range, "range");
        if (!range.isEmpty()) {
            return (!range.a(t11, range.getStart()) || range.a(range.getStart(), t11)) ? (!range.a(range.getEndInclusive(), t11) || range.a(t11, range.getEndInclusive())) ? t11 : range.getEndInclusive() : range.getStart();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    @w00.j(name = "intRangeContains")
    @y0(version = "1.9")
    @j2(markerClass = {kotlin.c.class})
    public static final boolean M0(@m80.k r<Integer> rVar, byte b11) {
        g0.p(rVar, "<this>");
        return rVar.contains(Integer.valueOf(b11));
    }

    @m80.l
    public static final Long M1(float f11) {
        if (-9.223372E18f > f11 || f11 > 9.223372E18f) {
            return null;
        }
        return Long.valueOf((long) f11);
    }

    @m80.k
    public static final <T extends Comparable<? super T>> T N(@m80.k T t11, @m80.k g<T> range) {
        g0.p(t11, "<this>");
        g0.p(range, "range");
        if (range instanceof f) {
            return (T) M(t11, (f) range);
        }
        if (!range.isEmpty()) {
            return t11.compareTo(range.getStart()) < 0 ? range.getStart() : t11.compareTo(range.getEndInclusive()) > 0 ? range.getEndInclusive() : t11;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    @w00.j(name = "intRangeContains")
    @y0(version = "1.9")
    @j2(markerClass = {kotlin.c.class})
    public static final boolean N0(@m80.k r<Integer> rVar, long j11) {
        g0.p(rVar, "<this>");
        Integer K1 = K1(j11);
        if (K1 != null) {
            return rVar.contains(K1);
        }
        return false;
    }

    @m80.l
    public static final Short N1(double d11) {
        if (-32768.0d > d11 || d11 > 32767.0d) {
            return null;
        }
        return Short.valueOf((short) d11);
    }

    @m80.k
    public static <T extends Comparable<? super T>> T O(@m80.k T t11, @m80.l T t12, @m80.l T t13) {
        g0.p(t11, "<this>");
        if (t12 == null || t13 == null) {
            if (t12 != null && t11.compareTo(t12) < 0) {
                return t12;
            }
            if (t13 != null && t11.compareTo(t13) > 0) {
                return t13;
            }
        } else {
            if (t12.compareTo(t13) > 0) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + t13 + " is less than minimum " + t12 + '.');
            }
            if (t11.compareTo(t12) < 0) {
                return t12;
            }
            if (t11.compareTo(t13) > 0) {
                return t13;
            }
        }
        return t11;
    }

    @w00.j(name = "intRangeContains")
    @y0(version = "1.9")
    @j2(markerClass = {kotlin.c.class})
    public static final boolean O0(@m80.k r<Integer> rVar, short s11) {
        g0.p(rVar, "<this>");
        return rVar.contains(Integer.valueOf(s11));
    }

    @m80.l
    public static final Short O1(float f11) {
        if (-32768.0f > f11 || f11 > 32767.0f) {
            return null;
        }
        return Short.valueOf((short) f11);
    }

    public static final short P(short s11, short s12, short s13) {
        if (s12 <= s13) {
            return s11 < s12 ? s12 : s11 > s13 ? s13 : s11;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) s13) + " is less than minimum " + ((int) s12) + '.');
    }

    @y0(version = "1.7")
    public static final char P0(@m80.k a aVar) {
        g0.p(aVar, "<this>");
        if (!aVar.isEmpty()) {
            return aVar.f();
        }
        throw new NoSuchElementException("Progression " + aVar + " is empty.");
    }

    @m80.l
    public static final Short P1(int i11) {
        if (-32768 > i11 || i11 >= 32768) {
            return null;
        }
        return Short.valueOf((short) i11);
    }

    @y0(version = "1.3")
    @o00.f
    public static final boolean Q(c cVar, Character ch2) {
        g0.p(cVar, "<this>");
        return ch2 != null && cVar.k(ch2.charValue());
    }

    @y0(version = "1.7")
    public static final int Q0(@m80.k j jVar) {
        g0.p(jVar, "<this>");
        if (!jVar.isEmpty()) {
            return jVar.f();
        }
        throw new NoSuchElementException("Progression " + jVar + " is empty.");
    }

    @m80.l
    public static final Short Q1(long j11) {
        if (-32768 > j11 || j11 >= 32768) {
            return null;
        }
        return Short.valueOf((short) j11);
    }

    @o00.f
    public static final boolean R(l lVar, byte b11) {
        g0.p(lVar, "<this>");
        return H0(lVar, b11);
    }

    @y0(version = "1.7")
    public static final long R0(@m80.k m mVar) {
        g0.p(mVar, "<this>");
        if (!mVar.isEmpty()) {
            return mVar.f();
        }
        throw new NoSuchElementException("Progression " + mVar + " is empty.");
    }

    @m80.k
    public static final c R1(char c11, char c12) {
        return g0.t(c12, 0) <= 0 ? c.f52508e.a() : new c(c11, (char) (c12 - 1));
    }

    @o00.f
    public static final boolean S(l lVar, long j11) {
        g0.p(lVar, "<this>");
        return K0(lVar, j11);
    }

    @m80.l
    @y0(version = "1.7")
    public static final Character S0(@m80.k a aVar) {
        g0.p(aVar, "<this>");
        if (aVar.isEmpty()) {
            return null;
        }
        return Character.valueOf(aVar.f());
    }

    @m80.k
    public static final l S1(byte b11, byte b12) {
        return new l(b11, b12 - 1);
    }

    @y0(version = "1.3")
    @o00.f
    public static final boolean T(l lVar, Integer num) {
        g0.p(lVar, "<this>");
        return num != null && lVar.k(num.intValue());
    }

    @m80.l
    @y0(version = "1.7")
    public static final Integer T0(@m80.k j jVar) {
        g0.p(jVar, "<this>");
        if (jVar.isEmpty()) {
            return null;
        }
        return Integer.valueOf(jVar.f());
    }

    @m80.k
    public static final l T1(byte b11, int i11) {
        return i11 <= Integer.MIN_VALUE ? l.f52526e.a() : new l(b11, i11 - 1);
    }

    @o00.f
    public static final boolean U(l lVar, short s11) {
        g0.p(lVar, "<this>");
        return L0(lVar, s11);
    }

    @m80.l
    @y0(version = "1.7")
    public static final Long U0(@m80.k m mVar) {
        g0.p(mVar, "<this>");
        if (mVar.isEmpty()) {
            return null;
        }
        return Long.valueOf(mVar.f());
    }

    @m80.k
    public static final l U1(byte b11, short s11) {
        return new l(b11, s11 - 1);
    }

    @o00.f
    public static final boolean V(o oVar, byte b11) {
        g0.p(oVar, "<this>");
        return V0(oVar, b11);
    }

    @w00.j(name = "longRangeContains")
    public static final boolean V0(@m80.k g<Long> gVar, byte b11) {
        g0.p(gVar, "<this>");
        return gVar.contains(Long.valueOf(b11));
    }

    @m80.k
    public static final l V1(int i11, byte b11) {
        return new l(i11, b11 - 1);
    }

    @o00.f
    public static final boolean W(o oVar, int i11) {
        g0.p(oVar, "<this>");
        return Y0(oVar, i11);
    }

    @w00.j(name = "longRangeContains")
    @yz.n(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @yz.o(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean W0(g gVar, double d11) {
        g0.p(gVar, "<this>");
        Long L1 = L1(d11);
        if (L1 != null) {
            return gVar.contains(L1);
        }
        return false;
    }

    @m80.k
    public static l W1(int i11, int i12) {
        return i12 <= Integer.MIN_VALUE ? l.f52526e.a() : new l(i11, i12 - 1);
    }

    @y0(version = "1.3")
    @o00.f
    public static final boolean X(o oVar, Long l11) {
        g0.p(oVar, "<this>");
        return l11 != null && oVar.k(l11.longValue());
    }

    @w00.j(name = "longRangeContains")
    @yz.n(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @yz.o(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean X0(g gVar, float f11) {
        g0.p(gVar, "<this>");
        Long M1 = M1(f11);
        if (M1 != null) {
            return gVar.contains(M1);
        }
        return false;
    }

    @m80.k
    public static final l X1(int i11, short s11) {
        return new l(i11, s11 - 1);
    }

    @o00.f
    public static final boolean Y(o oVar, short s11) {
        g0.p(oVar, "<this>");
        return Z0(oVar, s11);
    }

    @w00.j(name = "longRangeContains")
    public static final boolean Y0(@m80.k g<Long> gVar, int i11) {
        g0.p(gVar, "<this>");
        return gVar.contains(Long.valueOf(i11));
    }

    @m80.k
    public static final l Y1(short s11, byte b11) {
        return new l(s11, b11 - 1);
    }

    @w00.j(name = "doubleRangeContains")
    @yz.n(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @yz.o(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean Z(g gVar, byte b11) {
        g0.p(gVar, "<this>");
        return gVar.contains(Double.valueOf(b11));
    }

    @w00.j(name = "longRangeContains")
    public static final boolean Z0(@m80.k g<Long> gVar, short s11) {
        g0.p(gVar, "<this>");
        return gVar.contains(Long.valueOf(s11));
    }

    @m80.k
    public static final l Z1(short s11, int i11) {
        return i11 <= Integer.MIN_VALUE ? l.f52526e.a() : new l(s11, i11 - 1);
    }

    @w00.j(name = "doubleRangeContains")
    public static final boolean a0(@m80.k g<Double> gVar, float f11) {
        g0.p(gVar, "<this>");
        return gVar.contains(Double.valueOf(f11));
    }

    @w00.j(name = "longRangeContains")
    @y0(version = "1.9")
    @j2(markerClass = {kotlin.c.class})
    public static final boolean a1(@m80.k r<Long> rVar, byte b11) {
        g0.p(rVar, "<this>");
        return rVar.contains(Long.valueOf(b11));
    }

    @m80.k
    public static final l a2(short s11, short s12) {
        return new l(s11, s12 - 1);
    }

    @w00.j(name = "doubleRangeContains")
    @yz.n(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @yz.o(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean b0(g gVar, int i11) {
        g0.p(gVar, "<this>");
        return gVar.contains(Double.valueOf(i11));
    }

    @w00.j(name = "longRangeContains")
    @y0(version = "1.9")
    @j2(markerClass = {kotlin.c.class})
    public static final boolean b1(@m80.k r<Long> rVar, int i11) {
        g0.p(rVar, "<this>");
        return rVar.contains(Long.valueOf(i11));
    }

    @m80.k
    public static final o b2(byte b11, long j11) {
        return j11 <= Long.MIN_VALUE ? o.f52536e.a() : new o(b11, j11 - 1);
    }

    @w00.j(name = "doubleRangeContains")
    @yz.n(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @yz.o(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean c0(g gVar, long j11) {
        g0.p(gVar, "<this>");
        return gVar.contains(Double.valueOf(j11));
    }

    @w00.j(name = "longRangeContains")
    @y0(version = "1.9")
    @j2(markerClass = {kotlin.c.class})
    public static final boolean c1(@m80.k r<Long> rVar, short s11) {
        g0.p(rVar, "<this>");
        return rVar.contains(Long.valueOf(s11));
    }

    @m80.k
    public static final o c2(int i11, long j11) {
        return j11 <= Long.MIN_VALUE ? o.f52536e.a() : new o(i11, j11 - 1);
    }

    @w00.j(name = "doubleRangeContains")
    @yz.n(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @yz.o(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean d0(g gVar, short s11) {
        g0.p(gVar, "<this>");
        return gVar.contains(Double.valueOf(s11));
    }

    @y0(version = "1.3")
    @o00.f
    public static final char d1(c cVar) {
        g0.p(cVar, "<this>");
        return e1(cVar, Random.Default);
    }

    @m80.k
    public static final o d2(long j11, byte b11) {
        return new o(j11, b11 - 1);
    }

    @w00.j(name = "doubleRangeContains")
    @y0(version = "1.9")
    @j2(markerClass = {kotlin.c.class})
    public static final boolean e0(@m80.k r<Double> rVar, float f11) {
        g0.p(rVar, "<this>");
        return rVar.contains(Double.valueOf(f11));
    }

    @y0(version = "1.3")
    public static final char e1(@m80.k c cVar, @m80.k Random random) {
        g0.p(cVar, "<this>");
        g0.p(random, "random");
        try {
            return (char) random.nextInt(cVar.d(), cVar.f() + 1);
        } catch (IllegalArgumentException e11) {
            throw new NoSuchElementException(e11.getMessage());
        }
    }

    @m80.k
    public static final o e2(long j11, int i11) {
        return new o(j11, i11 - 1);
    }

    @m80.k
    public static final a f0(char c11, char c12) {
        return a.f52498d.a(c11, c12, -1);
    }

    @y0(version = "1.3")
    @o00.f
    public static final int f1(l lVar) {
        g0.p(lVar, "<this>");
        return g1(lVar, Random.Default);
    }

    @m80.k
    public static o f2(long j11, long j12) {
        return j12 <= Long.MIN_VALUE ? o.f52536e.a() : new o(j11, j12 - 1);
    }

    @m80.k
    public static final j g0(byte b11, byte b12) {
        return j.f52518d.a(b11, b12, -1);
    }

    @y0(version = "1.3")
    public static int g1(@m80.k l lVar, @m80.k Random random) {
        g0.p(lVar, "<this>");
        g0.p(random, "random");
        try {
            return e10.e.h(random, lVar);
        } catch (IllegalArgumentException e11) {
            throw new NoSuchElementException(e11.getMessage());
        }
    }

    @m80.k
    public static final o g2(long j11, short s11) {
        return new o(j11, s11 - 1);
    }

    @m80.k
    public static final j h0(byte b11, int i11) {
        return j.f52518d.a(b11, i11, -1);
    }

    @y0(version = "1.3")
    @o00.f
    public static final long h1(o oVar) {
        g0.p(oVar, "<this>");
        return i1(oVar, Random.Default);
    }

    @m80.k
    public static final o h2(short s11, long j11) {
        return j11 <= Long.MIN_VALUE ? o.f52536e.a() : new o(s11, j11 - 1);
    }

    @m80.k
    public static final j i0(byte b11, short s11) {
        return j.f52518d.a(b11, s11, -1);
    }

    @y0(version = "1.3")
    public static final long i1(@m80.k o oVar, @m80.k Random random) {
        g0.p(oVar, "<this>");
        g0.p(random, "random");
        try {
            return e10.e.i(random, oVar);
        } catch (IllegalArgumentException e11) {
            throw new NoSuchElementException(e11.getMessage());
        }
    }

    @w00.j(name = "byteRangeContains")
    @yz.n(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @yz.o(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean j(g gVar, double d11) {
        g0.p(gVar, "<this>");
        Byte D1 = D1(d11);
        if (D1 != null) {
            return gVar.contains(D1);
        }
        return false;
    }

    @m80.k
    public static final j j0(int i11, byte b11) {
        return j.f52518d.a(i11, b11, -1);
    }

    @y0(version = "1.4")
    @o00.f
    public static final Character j1(c cVar) {
        g0.p(cVar, "<this>");
        return k1(cVar, Random.Default);
    }

    @w00.j(name = "byteRangeContains")
    @yz.n(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @yz.o(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean k(g gVar, float f11) {
        g0.p(gVar, "<this>");
        Byte E1 = E1(f11);
        if (E1 != null) {
            return gVar.contains(E1);
        }
        return false;
    }

    @m80.k
    public static j k0(int i11, int i12) {
        return j.f52518d.a(i11, i12, -1);
    }

    @m80.l
    @y0(version = "1.4")
    public static final Character k1(@m80.k c cVar, @m80.k Random random) {
        g0.p(cVar, "<this>");
        g0.p(random, "random");
        if (cVar.isEmpty()) {
            return null;
        }
        return Character.valueOf((char) random.nextInt(cVar.d(), cVar.f() + 1));
    }

    @w00.j(name = "byteRangeContains")
    public static final boolean l(@m80.k g<Byte> gVar, int i11) {
        g0.p(gVar, "<this>");
        Byte F1 = F1(i11);
        if (F1 != null) {
            return gVar.contains(F1);
        }
        return false;
    }

    @m80.k
    public static final j l0(int i11, short s11) {
        return j.f52518d.a(i11, s11, -1);
    }

    @y0(version = "1.4")
    @o00.f
    public static final Integer l1(l lVar) {
        g0.p(lVar, "<this>");
        return m1(lVar, Random.Default);
    }

    @w00.j(name = "byteRangeContains")
    public static final boolean m(@m80.k g<Byte> gVar, long j11) {
        g0.p(gVar, "<this>");
        Byte G1 = G1(j11);
        if (G1 != null) {
            return gVar.contains(G1);
        }
        return false;
    }

    @m80.k
    public static final j m0(short s11, byte b11) {
        return j.f52518d.a(s11, b11, -1);
    }

    @m80.l
    @y0(version = "1.4")
    public static final Integer m1(@m80.k l lVar, @m80.k Random random) {
        g0.p(lVar, "<this>");
        g0.p(random, "random");
        if (lVar.isEmpty()) {
            return null;
        }
        return Integer.valueOf(e10.e.h(random, lVar));
    }

    @w00.j(name = "byteRangeContains")
    public static final boolean n(@m80.k g<Byte> gVar, short s11) {
        g0.p(gVar, "<this>");
        Byte H1 = H1(s11);
        if (H1 != null) {
            return gVar.contains(H1);
        }
        return false;
    }

    @m80.k
    public static final j n0(short s11, int i11) {
        return j.f52518d.a(s11, i11, -1);
    }

    @y0(version = "1.4")
    @o00.f
    public static final Long n1(o oVar) {
        g0.p(oVar, "<this>");
        return o1(oVar, Random.Default);
    }

    @w00.j(name = "byteRangeContains")
    @y0(version = "1.9")
    @j2(markerClass = {kotlin.c.class})
    public static final boolean o(@m80.k r<Byte> rVar, int i11) {
        g0.p(rVar, "<this>");
        Byte F1 = F1(i11);
        if (F1 != null) {
            return rVar.contains(F1);
        }
        return false;
    }

    @m80.k
    public static final j o0(short s11, short s12) {
        return j.f52518d.a(s11, s12, -1);
    }

    @m80.l
    @y0(version = "1.4")
    public static final Long o1(@m80.k o oVar, @m80.k Random random) {
        g0.p(oVar, "<this>");
        g0.p(random, "random");
        if (oVar.isEmpty()) {
            return null;
        }
        return Long.valueOf(e10.e.i(random, oVar));
    }

    @w00.j(name = "byteRangeContains")
    @y0(version = "1.9")
    @j2(markerClass = {kotlin.c.class})
    public static final boolean p(@m80.k r<Byte> rVar, long j11) {
        g0.p(rVar, "<this>");
        Byte G1 = G1(j11);
        if (G1 != null) {
            return rVar.contains(G1);
        }
        return false;
    }

    @m80.k
    public static final m p0(byte b11, long j11) {
        return m.f52528d.a(b11, j11, -1L);
    }

    @m80.k
    public static final a p1(@m80.k a aVar) {
        g0.p(aVar, "<this>");
        return a.f52498d.a(aVar.f(), aVar.d(), -aVar.g());
    }

    @w00.j(name = "byteRangeContains")
    @y0(version = "1.9")
    @j2(markerClass = {kotlin.c.class})
    public static final boolean q(@m80.k r<Byte> rVar, short s11) {
        g0.p(rVar, "<this>");
        Byte H1 = H1(s11);
        if (H1 != null) {
            return rVar.contains(H1);
        }
        return false;
    }

    @m80.k
    public static final m q0(int i11, long j11) {
        return m.f52528d.a(i11, j11, -1L);
    }

    @m80.k
    public static j q1(@m80.k j jVar) {
        g0.p(jVar, "<this>");
        return j.f52518d.a(jVar.f(), jVar.d(), -jVar.g());
    }

    public static final byte r(byte b11, byte b12) {
        return b11 < b12 ? b12 : b11;
    }

    @m80.k
    public static final m r0(long j11, byte b11) {
        return m.f52528d.a(j11, b11, -1L);
    }

    @m80.k
    public static m r1(@m80.k m mVar) {
        g0.p(mVar, "<this>");
        return m.f52528d.a(mVar.f(), mVar.d(), -mVar.g());
    }

    public static double s(double d11, double d12) {
        return d11 < d12 ? d12 : d11;
    }

    @m80.k
    public static final m s0(long j11, int i11) {
        return m.f52528d.a(j11, i11, -1L);
    }

    @w00.j(name = "shortRangeContains")
    public static final boolean s1(@m80.k g<Short> gVar, byte b11) {
        g0.p(gVar, "<this>");
        return gVar.contains(Short.valueOf(b11));
    }

    public static float t(float f11, float f12) {
        return f11 < f12 ? f12 : f11;
    }

    @m80.k
    public static final m t0(long j11, long j12) {
        return m.f52528d.a(j11, j12, -1L);
    }

    @w00.j(name = "shortRangeContains")
    @yz.n(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @yz.o(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean t1(g gVar, double d11) {
        g0.p(gVar, "<this>");
        Short N1 = N1(d11);
        if (N1 != null) {
            return gVar.contains(N1);
        }
        return false;
    }

    public static int u(int i11, int i12) {
        return i11 < i12 ? i12 : i11;
    }

    @m80.k
    public static final m u0(long j11, short s11) {
        return m.f52528d.a(j11, s11, -1L);
    }

    @w00.j(name = "shortRangeContains")
    @yz.n(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @yz.o(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    public static final /* synthetic */ boolean u1(g gVar, float f11) {
        g0.p(gVar, "<this>");
        Short O1 = O1(f11);
        if (O1 != null) {
            return gVar.contains(O1);
        }
        return false;
    }

    public static long v(long j11, long j12) {
        return j11 < j12 ? j12 : j11;
    }

    @m80.k
    public static final m v0(short s11, long j11) {
        return m.f52528d.a(s11, j11, -1L);
    }

    @w00.j(name = "shortRangeContains")
    public static final boolean v1(@m80.k g<Short> gVar, int i11) {
        g0.p(gVar, "<this>");
        Short P1 = P1(i11);
        if (P1 != null) {
            return gVar.contains(P1);
        }
        return false;
    }

    @m80.k
    public static final <T extends Comparable<? super T>> T w(@m80.k T t11, @m80.k T minimumValue) {
        g0.p(t11, "<this>");
        g0.p(minimumValue, "minimumValue");
        return t11.compareTo(minimumValue) < 0 ? minimumValue : t11;
    }

    @y0(version = "1.7")
    public static final char w0(@m80.k a aVar) {
        g0.p(aVar, "<this>");
        if (!aVar.isEmpty()) {
            return aVar.d();
        }
        throw new NoSuchElementException("Progression " + aVar + " is empty.");
    }

    @w00.j(name = "shortRangeContains")
    public static final boolean w1(@m80.k g<Short> gVar, long j11) {
        g0.p(gVar, "<this>");
        Short Q1 = Q1(j11);
        if (Q1 != null) {
            return gVar.contains(Q1);
        }
        return false;
    }

    public static final short x(short s11, short s12) {
        return s11 < s12 ? s12 : s11;
    }

    @y0(version = "1.7")
    public static final int x0(@m80.k j jVar) {
        g0.p(jVar, "<this>");
        if (!jVar.isEmpty()) {
            return jVar.d();
        }
        throw new NoSuchElementException("Progression " + jVar + " is empty.");
    }

    @w00.j(name = "shortRangeContains")
    @y0(version = "1.9")
    @j2(markerClass = {kotlin.c.class})
    public static final boolean x1(@m80.k r<Short> rVar, byte b11) {
        g0.p(rVar, "<this>");
        return rVar.contains(Short.valueOf(b11));
    }

    public static final byte y(byte b11, byte b12) {
        return b11 > b12 ? b12 : b11;
    }

    @y0(version = "1.7")
    public static final long y0(@m80.k m mVar) {
        g0.p(mVar, "<this>");
        if (!mVar.isEmpty()) {
            return mVar.d();
        }
        throw new NoSuchElementException("Progression " + mVar + " is empty.");
    }

    @w00.j(name = "shortRangeContains")
    @y0(version = "1.9")
    @j2(markerClass = {kotlin.c.class})
    public static final boolean y1(@m80.k r<Short> rVar, int i11) {
        g0.p(rVar, "<this>");
        Short P1 = P1(i11);
        if (P1 != null) {
            return rVar.contains(P1);
        }
        return false;
    }

    public static double z(double d11, double d12) {
        return d11 > d12 ? d12 : d11;
    }

    @m80.l
    @y0(version = "1.7")
    public static final Character z0(@m80.k a aVar) {
        g0.p(aVar, "<this>");
        if (aVar.isEmpty()) {
            return null;
        }
        return Character.valueOf(aVar.d());
    }

    @w00.j(name = "shortRangeContains")
    @y0(version = "1.9")
    @j2(markerClass = {kotlin.c.class})
    public static final boolean z1(@m80.k r<Short> rVar, long j11) {
        g0.p(rVar, "<this>");
        Short Q1 = Q1(j11);
        if (Q1 != null) {
            return rVar.contains(Q1);
        }
        return false;
    }
}
