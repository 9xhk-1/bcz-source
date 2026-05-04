package kotlin.time;

import androidx.collection.SieveCacheKt;
import androidx.exifinterface.media.ExifInterface;
import c40.s1;
import com.igexin.assist.sdk.AssistPushConsts;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import com.tencent.ijk.media.player.IjkMediaMeta;
import g10.u;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import u30.k0;
import x00.p;
import x00.q;
import x00.r;
import x00.s;
import yz.v0;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.6")
@w00.h
@u0({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1062:1\n37#1:1063\n37#1:1064\n37#1:1065\n37#1:1066\n37#1:1067\n500#1:1068\n517#1:1076\n170#2,6:1069\n1#3:1075\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n*L\n38#1:1063\n39#1:1064\n274#1:1065\n294#1:1066\n478#1:1067\n727#1:1068\n818#1:1076\n769#1:1069,6\n*E\n"})
/* loaded from: classes8.dex */
public final class e implements Comparable<e> {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a f67757b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final long f67758c = k(0);

    /* renamed from: d, reason: collision with root package name */
    public static final long f67759d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f67760e;

    /* renamed from: a, reason: collision with root package name */
    public final long f67761a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public final long A(double d11) {
            return f.v(d11, DurationUnit.MINUTES);
        }

        public final long B(int i11) {
            return f.w(i11, DurationUnit.MINUTES);
        }

        public final long C(long j11) {
            return f.x(j11, DurationUnit.MINUTES);
        }

        public final long G() {
            return e.f67760e;
        }

        public final long H(double d11) {
            return f.v(d11, DurationUnit.NANOSECONDS);
        }

        public final long I(int i11) {
            return f.w(i11, DurationUnit.NANOSECONDS);
        }

        public final long J(long j11) {
            return f.x(j11, DurationUnit.NANOSECONDS);
        }

        public final long N(double d11) {
            return f.v(d11, DurationUnit.SECONDS);
        }

        public final long O(int i11) {
            return f.w(i11, DurationUnit.SECONDS);
        }

        public final long P(long j11) {
            return f.x(j11, DurationUnit.SECONDS);
        }

        public final long T() {
            return e.f67758c;
        }

        public final long U(@m80.k String value) {
            long p11;
            g0.p(value, "value");
            try {
                p11 = f.p(value, false);
                return p11;
            } catch (IllegalArgumentException e11) {
                throw new IllegalArgumentException("Invalid duration string format: '" + value + "'.", e11);
            }
        }

        public final long V(@m80.k String value) {
            long p11;
            g0.p(value, "value");
            try {
                p11 = f.p(value, true);
                return p11;
            } catch (IllegalArgumentException e11) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e11);
            }
        }

        @m80.l
        public final e W(@m80.k String value) {
            long p11;
            g0.p(value, "value");
            try {
                p11 = f.p(value, true);
                return e.f(p11);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @m80.l
        public final e X(@m80.k String value) {
            long p11;
            g0.p(value, "value");
            try {
                p11 = f.p(value, false);
                return e.f(p11);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @w30.h
        public final double a(double d11, @m80.k DurationUnit sourceUnit, @m80.k DurationUnit targetUnit) {
            g0.p(sourceUnit, "sourceUnit");
            g0.p(targetUnit, "targetUnit");
            return w30.f.a(d11, sourceUnit, targetUnit);
        }

        public final long b(double d11) {
            return f.v(d11, DurationUnit.DAYS);
        }

        public final long c(int i11) {
            return f.w(i11, DurationUnit.DAYS);
        }

        public final long d(long j11) {
            return f.x(j11, DurationUnit.DAYS);
        }

        public final long h(double d11) {
            return f.v(d11, DurationUnit.HOURS);
        }

        public final long i(int i11) {
            return f.w(i11, DurationUnit.HOURS);
        }

        public final long j(long j11) {
            return f.x(j11, DurationUnit.HOURS);
        }

        public final long n() {
            return e.f67759d;
        }

        public final long o(double d11) {
            return f.v(d11, DurationUnit.MICROSECONDS);
        }

        public final long p(int i11) {
            return f.w(i11, DurationUnit.MICROSECONDS);
        }

        public final long q(long j11) {
            return f.x(j11, DurationUnit.MICROSECONDS);
        }

        public final long u(double d11) {
            return f.v(d11, DurationUnit.MILLISECONDS);
        }

        public final long v(int i11) {
            return f.w(i11, DurationUnit.MILLISECONDS);
        }

        public final long w(long j11) {
            return f.x(j11, DurationUnit.MILLISECONDS);
        }

        public a() {
        }

        @o00.f
        public static /* synthetic */ void D(double d11) {
        }

        @o00.f
        public static /* synthetic */ void E(int i11) {
        }

        @o00.f
        public static /* synthetic */ void F(long j11) {
        }

        @o00.f
        public static /* synthetic */ void K(double d11) {
        }

        @o00.f
        public static /* synthetic */ void L(int i11) {
        }

        @o00.f
        public static /* synthetic */ void M(long j11) {
        }

        @o00.f
        public static /* synthetic */ void Q(double d11) {
        }

        @o00.f
        public static /* synthetic */ void R(int i11) {
        }

        @o00.f
        public static /* synthetic */ void S(long j11) {
        }

        @o00.f
        public static /* synthetic */ void e(double d11) {
        }

        @o00.f
        public static /* synthetic */ void f(int i11) {
        }

        @o00.f
        public static /* synthetic */ void g(long j11) {
        }

        @o00.f
        public static /* synthetic */ void k(double d11) {
        }

        @o00.f
        public static /* synthetic */ void l(int i11) {
        }

        @o00.f
        public static /* synthetic */ void m(long j11) {
        }

        @o00.f
        public static /* synthetic */ void r(double d11) {
        }

        @o00.f
        public static /* synthetic */ void s(int i11) {
        }

        @o00.f
        public static /* synthetic */ void t(long j11) {
        }

        @o00.f
        public static /* synthetic */ void x(double d11) {
        }

        @o00.f
        public static /* synthetic */ void y(int i11) {
        }

        @o00.f
        public static /* synthetic */ void z(long j11) {
        }
    }

    static {
        long j11;
        long j12;
        j11 = f.j(4611686018427387903L);
        f67759d = j11;
        j12 = f.j(-4611686018427387903L);
        f67760e = j12;
    }

    public /* synthetic */ e(long j11) {
        this.f67761a = j11;
    }

    public static final long A(long j11) {
        return e0(j11, DurationUnit.SECONDS);
    }

    public static final int C(long j11) {
        if (O(j11)) {
            return 0;
        }
        return (int) (y(j11) % 60);
    }

    public static final int E(long j11) {
        if (O(j11)) {
            return 0;
        }
        return (int) (M(j11) ? f.n(J(j11) % 1000) : J(j11) % 1000000000);
    }

    public static final int G(long j11) {
        if (O(j11)) {
            return 0;
        }
        return (int) (A(j11) % 60);
    }

    public static final DurationUnit H(long j11) {
        return N(j11) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    public static final int I(long j11) {
        return ((int) j11) & 1;
    }

    public static final long J(long j11) {
        return j11 >> 1;
    }

    public static int K(long j11) {
        return Long.hashCode(j11);
    }

    public static final boolean L(long j11) {
        return !O(j11);
    }

    public static final boolean M(long j11) {
        return (((int) j11) & 1) == 1;
    }

    public static final boolean N(long j11) {
        return (((int) j11) & 1) == 0;
    }

    public static final boolean O(long j11) {
        return j11 == f67759d || j11 == f67760e;
    }

    public static final boolean P(long j11) {
        return j11 < 0;
    }

    public static final boolean R(long j11) {
        return j11 > 0;
    }

    public static final long S(long j11, long j12) {
        return T(j11, j0(j12));
    }

    public static final long T(long j11, long j12) {
        long k11;
        long m11;
        if (O(j11)) {
            if (L(j12) || (j12 ^ j11) >= 0) {
                return j11;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (O(j12)) {
            return j12;
        }
        if ((((int) j11) & 1) != (((int) j12) & 1)) {
            return M(j11) ? d(j11, J(j11), J(j12)) : d(j11, J(j12), J(j11));
        }
        long J = J(j11) + J(j12);
        if (N(j11)) {
            m11 = f.m(J);
            return m11;
        }
        k11 = f.k(J);
        return k11;
    }

    public static final long U(long j11, double d11) {
        int K0 = c10.d.K0(d11);
        if (K0 == d11) {
            return V(j11, K0);
        }
        DurationUnit H = H(j11);
        return f.v(a0(j11, H) * d11, H);
    }

    public static final long V(long j11, int i11) {
        long j12;
        long o11;
        long n11;
        long o12;
        long j13;
        long m11;
        long l11;
        if (O(j11)) {
            if (i11 != 0) {
                return i11 > 0 ? j11 : j0(j11);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i11 == 0) {
            return f67758c;
        }
        long J = J(j11);
        long j14 = i11;
        long j15 = J * j14;
        if (!N(j11)) {
            if (j15 / j14 != J) {
                return c10.d.V(J) * c10.d.U(i11) > 0 ? f67759d : f67760e;
            }
            j12 = f.j(u.L(j15, new g10.o(-4611686018427387903L, 4611686018427387903L)));
            return j12;
        }
        if (-2147483647L <= J && J < IjkMediaMeta.AV_CH_WIDE_LEFT) {
            l11 = f.l(j15);
            return l11;
        }
        if (j15 / j14 == J) {
            m11 = f.m(j15);
            return m11;
        }
        o11 = f.o(J);
        n11 = f.n(o11);
        long j16 = o11 * j14;
        o12 = f.o((J - n11) * j14);
        long j17 = o12 + j16;
        if (j16 / j14 != o11 || (j17 ^ j16) < 0) {
            return c10.d.V(J) * c10.d.U(i11) > 0 ? f67759d : f67760e;
        }
        j13 = f.j(u.L(j17, new g10.o(-4611686018427387903L, 4611686018427387903L)));
        return j13;
    }

    public static final <T> T W(long j11, @m80.k p<? super Long, ? super Integer, ? extends T> action) {
        g0.p(action, "action");
        return action.invoke(Long.valueOf(A(j11)), Integer.valueOf(E(j11)));
    }

    public static final <T> T X(long j11, @m80.k q<? super Long, ? super Integer, ? super Integer, ? extends T> action) {
        g0.p(action, "action");
        return action.invoke(Long.valueOf(y(j11)), Integer.valueOf(G(j11)), Integer.valueOf(E(j11)));
    }

    public static final <T> T Y(long j11, @m80.k r<? super Long, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        g0.p(action, "action");
        return action.invoke(Long.valueOf(v(j11)), Integer.valueOf(C(j11)), Integer.valueOf(G(j11)), Integer.valueOf(E(j11)));
    }

    public static final <T> T Z(long j11, @m80.k s<? super Long, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        g0.p(action, "action");
        return action.invoke(Long.valueOf(u(j11)), Integer.valueOf(t(j11)), Integer.valueOf(C(j11)), Integer.valueOf(G(j11)), Integer.valueOf(E(j11)));
    }

    public static final double a0(long j11, @m80.k DurationUnit unit) {
        g0.p(unit, "unit");
        if (j11 == f67759d) {
            return Double.POSITIVE_INFINITY;
        }
        if (j11 == f67760e) {
            return Double.NEGATIVE_INFINITY;
        }
        return w30.f.a(J(j11), H(j11), unit);
    }

    public static final int c0(long j11, @m80.k DurationUnit unit) {
        g0.p(unit, "unit");
        return (int) u.K(e0(j11, unit), SieveCacheKt.NodeMetaAndPreviousMask, SieveCacheKt.NodeLinkMask);
    }

    public static final long d(long j11, long j12, long j13) {
        long o11;
        long j14;
        long n11;
        long n12;
        long l11;
        o11 = f.o(j13);
        long j15 = j12 + o11;
        if (-4611686018426L > j15 || j15 >= 4611686018427L) {
            j14 = f.j(u.K(j15, -4611686018427387903L, 4611686018427387903L));
            return j14;
        }
        n11 = f.n(o11);
        long j16 = j13 - n11;
        n12 = f.n(j15);
        l11 = f.l(n12 + j16);
        return l11;
    }

    @m80.k
    public static final String d0(long j11) {
        StringBuilder sb2 = new StringBuilder();
        if (P(j11)) {
            sb2.append('-');
        }
        sb2.append(AssistPushConsts.MSG_VALUE_PAYLOAD);
        long r11 = r(j11);
        long v11 = v(r11);
        int C = C(r11);
        int G = G(r11);
        int E = E(r11);
        long j12 = O(j11) ? 9999999999999L : v11;
        boolean z11 = false;
        boolean z12 = j12 != 0;
        boolean z13 = (G == 0 && E == 0) ? false : true;
        if (C != 0 || (z13 && z12)) {
            z11 = true;
        }
        if (z12) {
            sb2.append(j12);
            sb2.append('H');
        }
        if (z11) {
            sb2.append(C);
            sb2.append(io.ktor.util.date.b.f62001g);
        }
        if (z13 || (!z12 && !z11)) {
            e(j11, sb2, G, E, 9, ExifInterface.LATITUDE_SOUTH, true);
        }
        return sb2.toString();
    }

    public static final void e(long j11, StringBuilder sb2, int i11, int i12, int i13, String str, boolean z11) {
        sb2.append(i11);
        if (i12 != 0) {
            sb2.append('.');
            String m42 = k0.m4(String.valueOf(i12), i13, '0');
            int i14 = -1;
            int length = m42.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i15 = length - 1;
                    if (m42.charAt(length) != '0') {
                        i14 = length;
                        break;
                    } else if (i15 < 0) {
                        break;
                    } else {
                        length = i15;
                    }
                }
            }
            int i16 = i14 + 1;
            if (z11 || i16 >= 3) {
                sb2.append((CharSequence) m42, 0, ((i14 + 3) / 3) * 3);
                g0.o(sb2, "append(...)");
            } else {
                sb2.append((CharSequence) m42, 0, i16);
                g0.o(sb2, "append(...)");
            }
        }
        sb2.append(str);
    }

    public static final long e0(long j11, @m80.k DurationUnit unit) {
        g0.p(unit, "unit");
        if (j11 == f67759d) {
            return Long.MAX_VALUE;
        }
        if (j11 == f67760e) {
            return Long.MIN_VALUE;
        }
        return w30.f.b(J(j11), H(j11), unit);
    }

    public static final /* synthetic */ e f(long j11) {
        return new e(j11);
    }

    @m80.k
    public static String f0(long j11) {
        if (j11 == 0) {
            return "0s";
        }
        if (j11 == f67759d) {
            return "Infinity";
        }
        if (j11 == f67760e) {
            return "-Infinity";
        }
        boolean P = P(j11);
        StringBuilder sb2 = new StringBuilder();
        if (P) {
            sb2.append('-');
        }
        long r11 = r(j11);
        long u11 = u(r11);
        int t11 = t(r11);
        int C = C(r11);
        int G = G(r11);
        int E = E(r11);
        int i11 = 0;
        boolean z11 = u11 != 0;
        boolean z12 = t11 != 0;
        boolean z13 = C != 0;
        boolean z14 = (G == 0 && E == 0) ? false : true;
        if (z11) {
            sb2.append(u11);
            sb2.append(io.ktor.util.date.b.f62000f);
            i11 = 1;
        }
        if (z12 || (z11 && (z13 || z14))) {
            int i12 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            sb2.append(t11);
            sb2.append(io.ktor.util.date.b.f61999e);
            i11 = i12;
        }
        if (z13 || (z14 && (z12 || z11))) {
            int i13 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            sb2.append(C);
            sb2.append(io.ktor.util.date.b.f61998d);
            i11 = i13;
        }
        if (z14) {
            int i14 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            if (G != 0 || z11 || z12 || z13) {
                e(j11, sb2, G, E, 9, "s", false);
            } else if (E >= 1000000) {
                e(j11, sb2, E / 1000000, E % 1000000, 6, "ms", false);
            } else if (E >= 1000) {
                e(j11, sb2, E / 1000, E % 1000, 3, "us", false);
            } else {
                sb2.append(E);
                sb2.append(NotificationStyle.NOTIFICATION_STYLE);
            }
            i11 = i14;
        }
        if (P && i11 > 1) {
            sb2.insert(1, '(').append(')');
        }
        return sb2.toString();
    }

    @m80.k
    public static final String g0(long j11, @m80.k DurationUnit unit, int i11) {
        g0.p(unit, "unit");
        if (i11 < 0) {
            throw new IllegalArgumentException(("decimals must be not negative, but was " + i11).toString());
        }
        double a02 = a0(j11, unit);
        if (Double.isInfinite(a02)) {
            return String.valueOf(a02);
        }
        return w30.d.b(a02, u.B(i11, 12)) + w30.g.h(unit);
    }

    public static /* synthetic */ String h0(long j11, DurationUnit durationUnit, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return g0(j11, durationUnit, i11);
    }

    public static int i(long j11, long j12) {
        long j13 = j11 ^ j12;
        if (j13 < 0 || (((int) j13) & 1) == 0) {
            return g0.u(j11, j12);
        }
        int i11 = (((int) j11) & 1) - (((int) j12) & 1);
        return P(j11) ? -i11 : i11;
    }

    public static final long i0(long j11, @m80.k DurationUnit unit) {
        g0.p(unit, "unit");
        DurationUnit H = H(j11);
        if (unit.compareTo(H) <= 0 || O(j11)) {
            return j11;
        }
        return f.x(J(j11) - (J(j11) % w30.f.b(1L, unit, H)), H);
    }

    public static final long j0(long j11) {
        long i11;
        i11 = f.i(-J(j11), ((int) j11) & 1);
        return i11;
    }

    public static long k(long j11) {
        if (!w30.d.c()) {
            return j11;
        }
        if (N(j11)) {
            long J = J(j11);
            if (-4611686018426999999L <= J && J < 4611686018427000000L) {
                return j11;
            }
            throw new AssertionError(J(j11) + " ns is out of nanoseconds range");
        }
        long J2 = J(j11);
        if (-4611686018427387903L > J2 || J2 >= 4611686018427387904L) {
            throw new AssertionError(J(j11) + " ms is out of milliseconds range");
        }
        long J3 = J(j11);
        if (-4611686018426L > J3) {
            return j11;
        }
        if (J3 >= 4611686018427L) {
            return j11;
        }
        throw new AssertionError(J(j11) + " ms is denormalized");
    }

    public static final double l(long j11, long j12) {
        DurationUnit durationUnit = (DurationUnit) e00.h.X(H(j11), H(j12));
        return a0(j11, durationUnit) / a0(j12, durationUnit);
    }

    public static final long m(long j11, double d11) {
        int K0 = c10.d.K0(d11);
        if (K0 == d11 && K0 != 0) {
            return o(j11, K0);
        }
        DurationUnit H = H(j11);
        return f.v(a0(j11, H) / d11, H);
    }

    public static final long o(long j11, int i11) {
        long j12;
        long n11;
        long n12;
        long l11;
        long l12;
        if (i11 == 0) {
            if (R(j11)) {
                return f67759d;
            }
            if (P(j11)) {
                return f67760e;
            }
            throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        }
        if (N(j11)) {
            l12 = f.l(J(j11) / i11);
            return l12;
        }
        if (O(j11)) {
            return V(j11, c10.d.U(i11));
        }
        long j13 = i11;
        long J = J(j11) / j13;
        if (-4611686018426L > J || J >= 4611686018427L) {
            j12 = f.j(J);
            return j12;
        }
        n11 = f.n(J(j11) - (J * j13));
        n12 = f.n(J);
        l11 = f.l(n12 + (n11 / j13));
        return l11;
    }

    public static boolean p(long j11, Object obj) {
        return (obj instanceof e) && j11 == ((e) obj).k0();
    }

    public static final boolean q(long j11, long j12) {
        return j11 == j12;
    }

    public static final long r(long j11) {
        return P(j11) ? j0(j11) : j11;
    }

    public static final int t(long j11) {
        if (O(j11)) {
            return 0;
        }
        return (int) (v(j11) % 24);
    }

    public static final long u(long j11) {
        return e0(j11, DurationUnit.DAYS);
    }

    public static final long v(long j11) {
        return e0(j11, DurationUnit.HOURS);
    }

    public static final long w(long j11) {
        return e0(j11, DurationUnit.MICROSECONDS);
    }

    public static final long x(long j11) {
        return (M(j11) && L(j11)) ? J(j11) : e0(j11, DurationUnit.MILLISECONDS);
    }

    public static final long y(long j11) {
        return e0(j11, DurationUnit.MINUTES);
    }

    public static final long z(long j11) {
        long n11;
        long J = J(j11);
        if (N(j11)) {
            return J;
        }
        if (J > s1.f7959f) {
            return Long.MAX_VALUE;
        }
        if (J < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        n11 = f.n(J);
        return n11;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(e eVar) {
        return g(eVar.k0());
    }

    public boolean equals(Object obj) {
        return p(this.f67761a, obj);
    }

    public int g(long j11) {
        return i(this.f67761a, j11);
    }

    public int hashCode() {
        return K(this.f67761a);
    }

    public final /* synthetic */ long k0() {
        return this.f67761a;
    }

    @m80.k
    public String toString() {
        return f0(this.f67761a);
    }

    @v0
    public static /* synthetic */ void B() {
    }

    @v0
    public static /* synthetic */ void D() {
    }

    @v0
    public static /* synthetic */ void F() {
    }

    @v0
    public static /* synthetic */ void s() {
    }
}
