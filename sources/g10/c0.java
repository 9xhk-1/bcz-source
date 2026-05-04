package g10;

import g10.v;
import g10.y;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.g0;
import kotlin.random.Random;
import yz.c2;
import yz.o1;
import yz.s1;
import yz.w1;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class c0 {
    @y0(version = "1.7")
    public static final int A(@m80.k v vVar) {
        g0.p(vVar, "<this>");
        if (!vVar.isEmpty()) {
            return vVar.d();
        }
        throw new NoSuchElementException("Progression " + vVar + " is empty.");
    }

    @y0(version = "1.7")
    public static final long B(@m80.k y yVar) {
        g0.p(yVar, "<this>");
        if (!yVar.isEmpty()) {
            return yVar.d();
        }
        throw new NoSuchElementException("Progression " + yVar + " is empty.");
    }

    @m80.l
    @y0(version = "1.7")
    public static final s1 C(@m80.k v vVar) {
        g0.p(vVar, "<this>");
        if (vVar.isEmpty()) {
            return null;
        }
        return s1.b(vVar.d());
    }

    @m80.l
    @y0(version = "1.7")
    public static final w1 D(@m80.k y yVar) {
        g0.p(yVar, "<this>");
        if (yVar.isEmpty()) {
            return null;
        }
        return w1.b(yVar.d());
    }

    @y0(version = "1.7")
    public static final int E(@m80.k v vVar) {
        g0.p(vVar, "<this>");
        if (!vVar.isEmpty()) {
            return vVar.f();
        }
        throw new NoSuchElementException("Progression " + vVar + " is empty.");
    }

    @y0(version = "1.7")
    public static final long F(@m80.k y yVar) {
        g0.p(yVar, "<this>");
        if (!yVar.isEmpty()) {
            return yVar.f();
        }
        throw new NoSuchElementException("Progression " + yVar + " is empty.");
    }

    @m80.l
    @y0(version = "1.7")
    public static final s1 G(@m80.k v vVar) {
        g0.p(vVar, "<this>");
        if (vVar.isEmpty()) {
            return null;
        }
        return s1.b(vVar.f());
    }

    @m80.l
    @y0(version = "1.7")
    public static final w1 H(@m80.k y yVar) {
        g0.p(yVar, "<this>");
        if (yVar.isEmpty()) {
            return null;
        }
        return w1.b(yVar.f());
    }

    @y0(version = "1.5")
    @o00.f
    public static final int I(x xVar) {
        g0.p(xVar, "<this>");
        return J(xVar, Random.Default);
    }

    @y0(version = "1.5")
    public static final int J(@m80.k x xVar, @m80.k Random random) {
        g0.p(xVar, "<this>");
        g0.p(random, "random");
        try {
            return e10.f.h(random, xVar);
        } catch (IllegalArgumentException e11) {
            throw new NoSuchElementException(e11.getMessage());
        }
    }

    @y0(version = "1.5")
    @o00.f
    public static final long K(a0 a0Var) {
        g0.p(a0Var, "<this>");
        return L(a0Var, Random.Default);
    }

    @y0(version = "1.5")
    public static final long L(@m80.k a0 a0Var, @m80.k Random random) {
        g0.p(a0Var, "<this>");
        g0.p(random, "random");
        try {
            return e10.f.l(random, a0Var);
        } catch (IllegalArgumentException e11) {
            throw new NoSuchElementException(e11.getMessage());
        }
    }

    @y0(version = "1.5")
    @o00.f
    public static final s1 M(x xVar) {
        g0.p(xVar, "<this>");
        return N(xVar, Random.Default);
    }

    @m80.l
    @y0(version = "1.5")
    public static final s1 N(@m80.k x xVar, @m80.k Random random) {
        g0.p(xVar, "<this>");
        g0.p(random, "random");
        if (xVar.isEmpty()) {
            return null;
        }
        return s1.b(e10.f.h(random, xVar));
    }

    @y0(version = "1.5")
    @o00.f
    public static final w1 O(a0 a0Var) {
        g0.p(a0Var, "<this>");
        return P(a0Var, Random.Default);
    }

    @m80.l
    @y0(version = "1.5")
    public static final w1 P(@m80.k a0 a0Var, @m80.k Random random) {
        g0.p(a0Var, "<this>");
        g0.p(random, "random");
        if (a0Var.isEmpty()) {
            return null;
        }
        return w1.b(e10.f.l(random, a0Var));
    }

    @y0(version = "1.5")
    @m80.k
    public static final v Q(@m80.k v vVar) {
        g0.p(vVar, "<this>");
        return v.f52542d.a(vVar.f(), vVar.d(), -vVar.g());
    }

    @y0(version = "1.5")
    @m80.k
    public static final y R(@m80.k y yVar) {
        g0.p(yVar, "<this>");
        return y.f52552d.a(yVar.f(), yVar.d(), -yVar.g());
    }

    @y0(version = "1.5")
    @m80.k
    public static final v S(@m80.k v vVar, int i11) {
        g0.p(vVar, "<this>");
        t.a(i11 > 0, Integer.valueOf(i11));
        v.a aVar = v.f52542d;
        int d11 = vVar.d();
        int f11 = vVar.f();
        if (vVar.g() <= 0) {
            i11 = -i11;
        }
        return aVar.a(d11, f11, i11);
    }

    @y0(version = "1.5")
    @m80.k
    public static final y T(@m80.k y yVar, long j11) {
        g0.p(yVar, "<this>");
        t.a(j11 > 0, Long.valueOf(j11));
        y.a aVar = y.f52552d;
        long d11 = yVar.d();
        long f11 = yVar.f();
        if (yVar.g() <= 0) {
            j11 = -j11;
        }
        return aVar.a(d11, f11, j11);
    }

    @y0(version = "1.5")
    @m80.k
    public static final x U(short s11, short s12) {
        return g0.t(s12 & c2.f100412d, 0) <= 0 ? x.f52550e.a() : new x(s1.i(s11 & c2.f100412d), s1.i(s1.i(r3) - 1), null);
    }

    @y0(version = "1.5")
    @m80.k
    public static x V(int i11, int i12) {
        int compare;
        compare = Integer.compare(i12 ^ Integer.MIN_VALUE, 0 ^ Integer.MIN_VALUE);
        return compare <= 0 ? x.f52550e.a() : new x(i11, s1.i(i12 - 1), null);
    }

    @y0(version = "1.5")
    @m80.k
    public static final x W(byte b11, byte b12) {
        return g0.t(b12 & 255, 0) <= 0 ? x.f52550e.a() : new x(s1.i(b11 & 255), s1.i(s1.i(r3) - 1), null);
    }

    @y0(version = "1.5")
    @m80.k
    public static a0 X(long j11, long j12) {
        int compare;
        compare = Long.compare(j12 ^ Long.MIN_VALUE, 0 ^ Long.MIN_VALUE);
        return compare <= 0 ? a0.f52502e.a() : new a0(j11, w1.i(j12 - w1.i(1 & 4294967295L)), null);
    }

    @y0(version = "1.5")
    public static final short a(short s11, short s12) {
        return g0.t(s11 & c2.f100412d, 65535 & s12) < 0 ? s12 : s11;
    }

    @y0(version = "1.5")
    public static final int b(int i11, int i12) {
        int compare;
        compare = Integer.compare(i11 ^ Integer.MIN_VALUE, i12 ^ Integer.MIN_VALUE);
        return compare < 0 ? i12 : i11;
    }

    @y0(version = "1.5")
    public static final byte c(byte b11, byte b12) {
        return g0.t(b11 & 255, b12 & 255) < 0 ? b12 : b11;
    }

    @y0(version = "1.5")
    public static final long d(long j11, long j12) {
        int compare;
        compare = Long.compare(j11 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE);
        return compare < 0 ? j12 : j11;
    }

    @y0(version = "1.5")
    public static final short e(short s11, short s12) {
        return g0.t(s11 & c2.f100412d, 65535 & s12) > 0 ? s12 : s11;
    }

    @y0(version = "1.5")
    public static final int f(int i11, int i12) {
        int compare;
        compare = Integer.compare(i11 ^ Integer.MIN_VALUE, i12 ^ Integer.MIN_VALUE);
        return compare > 0 ? i12 : i11;
    }

    @y0(version = "1.5")
    public static final byte g(byte b11, byte b12) {
        return g0.t(b11 & 255, b12 & 255) > 0 ? b12 : b11;
    }

    @y0(version = "1.5")
    public static final long h(long j11, long j12) {
        int compare;
        compare = Long.compare(j11 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE);
        return compare > 0 ? j12 : j11;
    }

    @y0(version = "1.5")
    public static final long i(long j11, @m80.k g<w1> range) {
        int compare;
        int compare2;
        g0.p(range, "range");
        if (range instanceof f) {
            return ((w1) u.M(w1.b(j11), (f) range)).m0();
        }
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
        }
        compare = Long.compare(j11 ^ Long.MIN_VALUE, range.getStart().m0() ^ Long.MIN_VALUE);
        if (compare < 0) {
            return range.getStart().m0();
        }
        compare2 = Long.compare(j11 ^ Long.MIN_VALUE, range.getEndInclusive().m0() ^ Long.MIN_VALUE);
        return compare2 > 0 ? range.getEndInclusive().m0() : j11;
    }

    @y0(version = "1.5")
    public static final short j(short s11, short s12, short s13) {
        int i11 = s12 & c2.f100412d;
        int i12 = s13 & c2.f100412d;
        if (g0.t(i11, i12) <= 0) {
            int i13 = 65535 & s11;
            return g0.t(i13, i11) < 0 ? s12 : g0.t(i13, i12) > 0 ? s13 : s11;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) c2.f0(s13)) + " is less than minimum " + ((Object) c2.f0(s12)) + '.');
    }

    @y0(version = "1.5")
    public static final int k(int i11, int i12, int i13) {
        int compare;
        int compare2;
        int compare3;
        compare = Integer.compare(i12 ^ Integer.MIN_VALUE, i13 ^ Integer.MIN_VALUE);
        if (compare <= 0) {
            compare2 = Integer.compare(i11 ^ Integer.MIN_VALUE, i12 ^ Integer.MIN_VALUE);
            if (compare2 < 0) {
                return i12;
            }
            compare3 = Integer.compare(i11 ^ Integer.MIN_VALUE, i13 ^ Integer.MIN_VALUE);
            return compare3 > 0 ? i13 : i11;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) s1.h0(i13)) + " is less than minimum " + ((Object) s1.h0(i12)) + '.');
    }

    @y0(version = "1.5")
    public static final byte l(byte b11, byte b12, byte b13) {
        int i11 = b12 & 255;
        int i12 = b13 & 255;
        if (g0.t(i11, i12) <= 0) {
            int i13 = b11 & 255;
            return g0.t(i13, i11) < 0 ? b12 : g0.t(i13, i12) > 0 ? b13 : b11;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) o1.f0(b13)) + " is less than minimum " + ((Object) o1.f0(b12)) + '.');
    }

    @y0(version = "1.5")
    public static final long m(long j11, long j12, long j13) {
        int compare;
        int compare2;
        int compare3;
        compare = Long.compare(j12 ^ Long.MIN_VALUE, j13 ^ Long.MIN_VALUE);
        if (compare <= 0) {
            compare2 = Long.compare(j11 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE);
            if (compare2 < 0) {
                return j12;
            }
            compare3 = Long.compare(j11 ^ Long.MIN_VALUE, j13 ^ Long.MIN_VALUE);
            return compare3 > 0 ? j13 : j11;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) w1.h0(j13)) + " is less than minimum " + ((Object) w1.h0(j12)) + '.');
    }

    @y0(version = "1.5")
    public static final int n(int i11, @m80.k g<s1> range) {
        int compare;
        int compare2;
        g0.p(range, "range");
        if (range instanceof f) {
            return ((s1) u.M(s1.b(i11), (f) range)).m0();
        }
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
        }
        compare = Integer.compare(i11 ^ Integer.MIN_VALUE, range.getStart().m0() ^ Integer.MIN_VALUE);
        if (compare < 0) {
            return range.getStart().m0();
        }
        compare2 = Integer.compare(i11 ^ Integer.MIN_VALUE, range.getEndInclusive().m0() ^ Integer.MIN_VALUE);
        return compare2 > 0 ? range.getEndInclusive().m0() : i11;
    }

    @y0(version = "1.5")
    public static final boolean o(@m80.k x contains, byte b11) {
        g0.p(contains, "$this$contains");
        return contains.j(s1.i(b11 & 255));
    }

    @y0(version = "1.5")
    @o00.f
    public static final boolean p(a0 contains, w1 w1Var) {
        g0.p(contains, "$this$contains");
        return w1Var != null && contains.j(w1Var.m0());
    }

    @y0(version = "1.5")
    public static final boolean q(@m80.k a0 contains, int i11) {
        g0.p(contains, "$this$contains");
        return contains.j(w1.i(i11 & 4294967295L));
    }

    @y0(version = "1.5")
    public static final boolean r(@m80.k a0 contains, byte b11) {
        g0.p(contains, "$this$contains");
        return contains.j(w1.i(b11 & 255));
    }

    @y0(version = "1.5")
    public static final boolean s(@m80.k x contains, short s11) {
        g0.p(contains, "$this$contains");
        return contains.j(s1.i(s11 & c2.f100412d));
    }

    @y0(version = "1.5")
    @o00.f
    public static final boolean t(x contains, s1 s1Var) {
        g0.p(contains, "$this$contains");
        return s1Var != null && contains.j(s1Var.m0());
    }

    @y0(version = "1.5")
    public static final boolean u(@m80.k x contains, long j11) {
        g0.p(contains, "$this$contains");
        return w1.i(j11 >>> 32) == 0 && contains.j(s1.i((int) j11));
    }

    @y0(version = "1.5")
    public static final boolean v(@m80.k a0 contains, short s11) {
        g0.p(contains, "$this$contains");
        return contains.j(w1.i(s11 & j60.g.f63638t));
    }

    @y0(version = "1.5")
    @m80.k
    public static final v w(short s11, short s12) {
        return v.f52542d.a(s1.i(s11 & c2.f100412d), s1.i(s12 & c2.f100412d), -1);
    }

    @y0(version = "1.5")
    @m80.k
    public static final v x(int i11, int i12) {
        return v.f52542d.a(i11, i12, -1);
    }

    @y0(version = "1.5")
    @m80.k
    public static final v y(byte b11, byte b12) {
        return v.f52542d.a(s1.i(b11 & 255), s1.i(b12 & 255), -1);
    }

    @y0(version = "1.5")
    @m80.k
    public static final y z(long j11, long j12) {
        return y.f52552d.a(j11, j12, -1L);
    }
}
