package d00;

import a00.a0;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.g0;
import m80.k;
import w00.j;
import x00.l;
import yz.c2;
import yz.d2;
import yz.i2;
import yz.n;
import yz.o;
import yz.o1;
import yz.p0;
import yz.p1;
import yz.s1;
import yz.t1;
import yz.w0;
import yz.w1;
import yz.x1;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class b {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends a00.d<s1> implements RandomAccess {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int[] f46985a;

        public a(int[] iArr) {
            this.f46985a = iArr;
        }

        @Override // a00.b, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof s1) {
                return d(((s1) obj).m0());
            }
            return false;
        }

        public boolean d(int i11) {
            return t1.h(this.f46985a, i11);
        }

        public int f(int i11) {
            return t1.m(this.f46985a, i11);
        }

        public int g(int i11) {
            return a0.Zf(this.f46985a, i11);
        }

        @Override // a00.d, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i11) {
            return s1.b(f(i11));
        }

        @Override // a00.d, a00.b
        public int getSize() {
            return t1.o(this.f46985a);
        }

        public int h(int i11) {
            return a0.di(this.f46985a, i11);
        }

        @Override // a00.d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof s1) {
                return g(((s1) obj).m0());
            }
            return -1;
        }

        @Override // a00.b, java.util.Collection
        public boolean isEmpty() {
            return t1.s(this.f46985a);
        }

        @Override // a00.d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof s1) {
                return h(((s1) obj).m0());
            }
            return -1;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: d00.b$b, reason: collision with other inner class name */
    public static final class C0544b extends a00.d<w1> implements RandomAccess {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long[] f46986a;

        public C0544b(long[] jArr) {
            this.f46986a = jArr;
        }

        @Override // a00.b, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof w1) {
                return d(((w1) obj).m0());
            }
            return false;
        }

        public boolean d(long j11) {
            return x1.h(this.f46986a, j11);
        }

        public long f(int i11) {
            return x1.m(this.f46986a, i11);
        }

        public int g(long j11) {
            return a0.ag(this.f46986a, j11);
        }

        @Override // a00.d, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i11) {
            return w1.b(f(i11));
        }

        @Override // a00.d, a00.b
        public int getSize() {
            return x1.o(this.f46986a);
        }

        public int h(long j11) {
            return a0.ei(this.f46986a, j11);
        }

        @Override // a00.d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof w1) {
                return g(((w1) obj).m0());
            }
            return -1;
        }

        @Override // a00.b, java.util.Collection
        public boolean isEmpty() {
            return x1.s(this.f46986a);
        }

        @Override // a00.d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof w1) {
                return h(((w1) obj).m0());
            }
            return -1;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends a00.d<o1> implements RandomAccess {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ byte[] f46987a;

        public c(byte[] bArr) {
            this.f46987a = bArr;
        }

        @Override // a00.b, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof o1) {
                return d(((o1) obj).k0());
            }
            return false;
        }

        public boolean d(byte b11) {
            return p1.h(this.f46987a, b11);
        }

        public byte f(int i11) {
            return p1.m(this.f46987a, i11);
        }

        public int g(byte b11) {
            return a0.Vf(this.f46987a, b11);
        }

        @Override // a00.d, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i11) {
            return o1.b(f(i11));
        }

        @Override // a00.d, a00.b
        public int getSize() {
            return p1.o(this.f46987a);
        }

        public int h(byte b11) {
            return a0.Zh(this.f46987a, b11);
        }

        @Override // a00.d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof o1) {
                return g(((o1) obj).k0());
            }
            return -1;
        }

        @Override // a00.b, java.util.Collection
        public boolean isEmpty() {
            return p1.s(this.f46987a);
        }

        @Override // a00.d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof o1) {
                return h(((o1) obj).k0());
            }
            return -1;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends a00.d<c2> implements RandomAccess {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ short[] f46988a;

        public d(short[] sArr) {
            this.f46988a = sArr;
        }

        @Override // a00.b, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof c2) {
                return d(((c2) obj).k0());
            }
            return false;
        }

        public boolean d(short s11) {
            return d2.h(this.f46988a, s11);
        }

        public short f(int i11) {
            return d2.m(this.f46988a, i11);
        }

        public int g(short s11) {
            return a0.cg(this.f46988a, s11);
        }

        @Override // a00.d, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i11) {
            return c2.b(f(i11));
        }

        @Override // a00.d, a00.b
        public int getSize() {
            return d2.o(this.f46988a);
        }

        public int h(short s11) {
            return a0.gi(this.f46988a, s11);
        }

        @Override // a00.d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof c2) {
                return g(((c2) obj).k0());
            }
            return -1;
        }

        @Override // a00.b, java.util.Collection
        public boolean isEmpty() {
            return d2.s(this.f46988a);
        }

        @Override // a00.d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof c2) {
                return h(((c2) obj).k0());
            }
            return -1;
        }
    }

    @y0(version = "1.3")
    @kotlin.d
    @n(message = "Use maxWithOrNull instead.", replaceWith = @w0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ c2 A(short[] sArr, Comparator comparator) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$maxWith$0");
        g0.p(comparator, "comparator");
        return g.I6(sArr, comparator);
    }

    @y0(version = "1.3")
    @kotlin.d
    @n(message = "Use maxWithOrNull instead.", replaceWith = @w0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ w1 B(long[] jArr, Comparator comparator) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$maxWith$0");
        g0.p(comparator, "comparator");
        return g.J6(jArr, comparator);
    }

    @y0(version = "1.3")
    @kotlin.d
    @n(message = "Use minOrNull instead.", replaceWith = @w0(expression = "this.minOrNull()", imports = {}))
    @o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ s1 C(int[] iArr) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$min$0");
        return g.C7(iArr);
    }

    @y0(version = "1.3")
    @kotlin.d
    @n(message = "Use minOrNull instead.", replaceWith = @w0(expression = "this.minOrNull()", imports = {}))
    @o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ o1 D(byte[] bArr) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$min$0");
        return g.D7(bArr);
    }

    @y0(version = "1.3")
    @kotlin.d
    @n(message = "Use minOrNull instead.", replaceWith = @w0(expression = "this.minOrNull()", imports = {}))
    @o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ w1 E(long[] jArr) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$min$0");
        return g.E7(jArr);
    }

    @y0(version = "1.3")
    @kotlin.d
    @n(message = "Use minOrNull instead.", replaceWith = @w0(expression = "this.minOrNull()", imports = {}))
    @o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ c2 F(short[] sArr) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$min$0");
        return g.F7(sArr);
    }

    @y0(version = "1.3")
    @kotlin.d
    @n(message = "Use minByOrNull instead.", replaceWith = @w0(expression = "this.minByOrNull(selector)", imports = {}))
    @o00.f
    @o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> o1 G(byte[] bArr, l<? super o1, ? extends R> selector) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$minBy$0");
        g0.p(selector, "selector");
        if (p1.s(bArr)) {
            return null;
        }
        byte m11 = p1.m(bArr, 0);
        int Ie = a0.Ie(bArr);
        if (Ie == 0) {
            return o1.b(m11);
        }
        R invoke = selector.invoke(o1.b(m11));
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                byte m12 = p1.m(bArr, i11);
                R invoke2 = selector.invoke(o1.b(m12));
                if (invoke.compareTo(invoke2) > 0) {
                    m11 = m12;
                    invoke = invoke2;
                }
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return o1.b(m11);
    }

    @y0(version = "1.3")
    @kotlin.d
    @n(message = "Use minByOrNull instead.", replaceWith = @w0(expression = "this.minByOrNull(selector)", imports = {}))
    @o00.f
    @o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> w1 H(long[] jArr, l<? super w1, ? extends R> selector) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$minBy$0");
        g0.p(selector, "selector");
        if (x1.s(jArr)) {
            return null;
        }
        long m11 = x1.m(jArr, 0);
        int Ne = a0.Ne(jArr);
        if (Ne == 0) {
            return w1.b(m11);
        }
        R invoke = selector.invoke(w1.b(m11));
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                long m12 = x1.m(jArr, i11);
                R invoke2 = selector.invoke(w1.b(m12));
                if (invoke.compareTo(invoke2) > 0) {
                    m11 = m12;
                    invoke = invoke2;
                }
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return w1.b(m11);
    }

    @y0(version = "1.3")
    @kotlin.d
    @n(message = "Use minByOrNull instead.", replaceWith = @w0(expression = "this.minByOrNull(selector)", imports = {}))
    @o00.f
    @o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> s1 I(int[] iArr, l<? super s1, ? extends R> selector) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$minBy$0");
        g0.p(selector, "selector");
        if (t1.s(iArr)) {
            return null;
        }
        int m11 = t1.m(iArr, 0);
        int Me = a0.Me(iArr);
        if (Me == 0) {
            return s1.b(m11);
        }
        R invoke = selector.invoke(s1.b(m11));
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                int m12 = t1.m(iArr, i11);
                R invoke2 = selector.invoke(s1.b(m12));
                if (invoke.compareTo(invoke2) > 0) {
                    m11 = m12;
                    invoke = invoke2;
                }
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return s1.b(m11);
    }

    @y0(version = "1.3")
    @kotlin.d
    @n(message = "Use minByOrNull instead.", replaceWith = @w0(expression = "this.minByOrNull(selector)", imports = {}))
    @o00.f
    @o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> c2 J(short[] sArr, l<? super c2, ? extends R> selector) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$minBy$0");
        g0.p(selector, "selector");
        if (d2.s(sArr)) {
            return null;
        }
        short m11 = d2.m(sArr, 0);
        int Pe = a0.Pe(sArr);
        if (Pe == 0) {
            return c2.b(m11);
        }
        R invoke = selector.invoke(c2.b(m11));
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                short m12 = d2.m(sArr, i11);
                R invoke2 = selector.invoke(c2.b(m12));
                if (invoke.compareTo(invoke2) > 0) {
                    m11 = m12;
                    invoke = invoke2;
                }
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return c2.b(m11);
    }

    @y0(version = "1.3")
    @kotlin.d
    @n(message = "Use minWithOrNull instead.", replaceWith = @w0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ o1 K(byte[] bArr, Comparator comparator) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$minWith$0");
        g0.p(comparator, "comparator");
        return g.K7(bArr, comparator);
    }

    @y0(version = "1.3")
    @kotlin.d
    @n(message = "Use minWithOrNull instead.", replaceWith = @w0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ s1 L(int[] iArr, Comparator comparator) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$minWith$0");
        g0.p(comparator, "comparator");
        return g.L7(iArr, comparator);
    }

    @y0(version = "1.3")
    @kotlin.d
    @n(message = "Use minWithOrNull instead.", replaceWith = @w0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ c2 M(short[] sArr, Comparator comparator) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$minWith$0");
        g0.p(comparator, "comparator");
        return g.M7(sArr, comparator);
    }

    @y0(version = "1.3")
    @kotlin.d
    @n(message = "Use minWithOrNull instead.", replaceWith = @w0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ w1 N(long[] jArr, Comparator comparator) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$minWith$0");
        g0.p(comparator, "comparator");
        return g.N7(jArr, comparator);
    }

    @j(name = "sumOfBigDecimal")
    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final BigDecimal O(byte[] bArr, l<? super o1, ? extends BigDecimal> selector) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$sumOf$0");
        g0.p(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        g0.o(valueOf, "valueOf(...)");
        int o11 = p1.o(bArr);
        for (int i11 = 0; i11 < o11; i11++) {
            valueOf = valueOf.add(selector.invoke(o1.b(p1.m(bArr, i11))));
            g0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @j(name = "sumOfBigDecimal")
    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final BigDecimal P(int[] iArr, l<? super s1, ? extends BigDecimal> selector) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$sumOf$0");
        g0.p(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        g0.o(valueOf, "valueOf(...)");
        int o11 = t1.o(iArr);
        for (int i11 = 0; i11 < o11; i11++) {
            valueOf = valueOf.add(selector.invoke(s1.b(t1.m(iArr, i11))));
            g0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @j(name = "sumOfBigDecimal")
    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final BigDecimal Q(long[] jArr, l<? super w1, ? extends BigDecimal> selector) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$sumOf$0");
        g0.p(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        g0.o(valueOf, "valueOf(...)");
        int o11 = x1.o(jArr);
        for (int i11 = 0; i11 < o11; i11++) {
            valueOf = valueOf.add(selector.invoke(w1.b(x1.m(jArr, i11))));
            g0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @j(name = "sumOfBigDecimal")
    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final BigDecimal R(short[] sArr, l<? super c2, ? extends BigDecimal> selector) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$sumOf$0");
        g0.p(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        g0.o(valueOf, "valueOf(...)");
        int o11 = d2.o(sArr);
        for (int i11 = 0; i11 < o11; i11++) {
            valueOf = valueOf.add(selector.invoke(c2.b(d2.m(sArr, i11))));
            g0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @j(name = "sumOfBigInteger")
    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final BigInteger S(byte[] bArr, l<? super o1, ? extends BigInteger> selector) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$sumOf$0");
        g0.p(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        g0.o(valueOf, "valueOf(...)");
        int o11 = p1.o(bArr);
        for (int i11 = 0; i11 < o11; i11++) {
            valueOf = valueOf.add(selector.invoke(o1.b(p1.m(bArr, i11))));
            g0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @j(name = "sumOfBigInteger")
    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final BigInteger T(int[] iArr, l<? super s1, ? extends BigInteger> selector) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$sumOf$0");
        g0.p(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        g0.o(valueOf, "valueOf(...)");
        int o11 = t1.o(iArr);
        for (int i11 = 0; i11 < o11; i11++) {
            valueOf = valueOf.add(selector.invoke(s1.b(t1.m(iArr, i11))));
            g0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @j(name = "sumOfBigInteger")
    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final BigInteger U(long[] jArr, l<? super w1, ? extends BigInteger> selector) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$sumOf$0");
        g0.p(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        g0.o(valueOf, "valueOf(...)");
        int o11 = x1.o(jArr);
        for (int i11 = 0; i11 < o11; i11++) {
            valueOf = valueOf.add(selector.invoke(w1.b(x1.m(jArr, i11))));
            g0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @j(name = "sumOfBigInteger")
    @y0(version = "1.4")
    @kotlin.d
    @p0
    @o00.f
    public static final BigInteger V(short[] sArr, l<? super c2, ? extends BigInteger> selector) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$sumOf$0");
        g0.p(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        g0.o(valueOf, "valueOf(...)");
        int o11 = d2.o(sArr);
        for (int i11 = 0; i11 < o11; i11++) {
            valueOf = valueOf.add(selector.invoke(c2.b(d2.m(sArr, i11))));
            g0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final List<s1> a(@k int[] iArr) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$asList$0");
        return new a(iArr);
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final List<o1> b(@k byte[] bArr) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$asList$0");
        return new c(bArr);
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final List<w1> c(@k long[] jArr) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$asList$0");
        return new C0544b(jArr);
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final List<c2> d(@k short[] sArr) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$asList$0");
        return new d(sArr);
    }

    @y0(version = "1.3")
    @kotlin.d
    public static final int e(@k int[] iArr, int i11, int i12, int i13) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$binarySearch$0");
        a00.d.Companion.d(i12, i13, t1.o(iArr));
        int i14 = i13 - 1;
        while (i12 <= i14) {
            int i15 = (i12 + i14) >>> 1;
            int e11 = i2.e(iArr[i15], i11);
            if (e11 < 0) {
                i12 = i15 + 1;
            } else {
                if (e11 <= 0) {
                    return i15;
                }
                i14 = i15 - 1;
            }
        }
        return -(i12 + 1);
    }

    public static /* synthetic */ int f(int[] iArr, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i12 = 0;
        }
        if ((i14 & 4) != 0) {
            i13 = t1.o(iArr);
        }
        return e(iArr, i11, i12, i13);
    }

    @y0(version = "1.3")
    @kotlin.d
    public static final int g(@k short[] sArr, short s11, int i11, int i12) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$binarySearch$0");
        a00.d.Companion.d(i11, i12, d2.o(sArr));
        int i13 = s11 & c2.f100412d;
        int i14 = i12 - 1;
        while (i11 <= i14) {
            int i15 = (i11 + i14) >>> 1;
            int e11 = i2.e(sArr[i15], i13);
            if (e11 < 0) {
                i11 = i15 + 1;
            } else {
                if (e11 <= 0) {
                    return i15;
                }
                i14 = i15 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static /* synthetic */ int h(short[] sArr, short s11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = d2.o(sArr);
        }
        return g(sArr, s11, i11, i12);
    }

    @y0(version = "1.3")
    @kotlin.d
    public static final int i(@k long[] jArr, long j11, int i11, int i12) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$binarySearch$0");
        a00.d.Companion.d(i11, i12, x1.o(jArr));
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int n11 = i2.n(jArr[i14], j11);
            if (n11 < 0) {
                i11 = i14 + 1;
            } else {
                if (n11 <= 0) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static /* synthetic */ int j(long[] jArr, long j11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = x1.o(jArr);
        }
        return i(jArr, j11, i11, i12);
    }

    @y0(version = "1.3")
    @kotlin.d
    public static final int k(@k byte[] bArr, byte b11, int i11, int i12) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$binarySearch$0");
        a00.d.Companion.d(i11, i12, p1.o(bArr));
        int i13 = b11 & 255;
        int i14 = i12 - 1;
        while (i11 <= i14) {
            int i15 = (i11 + i14) >>> 1;
            int e11 = i2.e(bArr[i15], i13);
            if (e11 < 0) {
                i11 = i15 + 1;
            } else {
                if (e11 <= 0) {
                    return i15;
                }
                i14 = i15 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static /* synthetic */ int l(byte[] bArr, byte b11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = p1.o(bArr);
        }
        return k(bArr, b11, i11, i12);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final byte m(byte[] bArr, int i11) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$elementAt$0");
        return p1.m(bArr, i11);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final short n(short[] sArr, int i11) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$elementAt$0");
        return d2.m(sArr, i11);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final int o(int[] iArr, int i11) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$elementAt$0");
        return t1.m(iArr, i11);
    }

    @y0(version = "1.3")
    @kotlin.d
    @o00.f
    public static final long p(long[] jArr, int i11) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$elementAt$0");
        return x1.m(jArr, i11);
    }

    @y0(version = "1.3")
    @kotlin.d
    @n(message = "Use maxOrNull instead.", replaceWith = @w0(expression = "this.maxOrNull()", imports = {}))
    @o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ s1 q(int[] iArr) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$max$0");
        return g.y6(iArr);
    }

    @y0(version = "1.3")
    @kotlin.d
    @n(message = "Use maxOrNull instead.", replaceWith = @w0(expression = "this.maxOrNull()", imports = {}))
    @o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ o1 r(byte[] bArr) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$max$0");
        return g.z6(bArr);
    }

    @y0(version = "1.3")
    @kotlin.d
    @n(message = "Use maxOrNull instead.", replaceWith = @w0(expression = "this.maxOrNull()", imports = {}))
    @o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ w1 s(long[] jArr) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$max$0");
        return g.A6(jArr);
    }

    @y0(version = "1.3")
    @kotlin.d
    @n(message = "Use maxOrNull instead.", replaceWith = @w0(expression = "this.maxOrNull()", imports = {}))
    @o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ c2 t(short[] sArr) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$max$0");
        return g.B6(sArr);
    }

    @y0(version = "1.3")
    @kotlin.d
    @n(message = "Use maxByOrNull instead.", replaceWith = @w0(expression = "this.maxByOrNull(selector)", imports = {}))
    @o00.f
    @o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> o1 u(byte[] bArr, l<? super o1, ? extends R> selector) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$maxBy$0");
        g0.p(selector, "selector");
        if (p1.s(bArr)) {
            return null;
        }
        byte m11 = p1.m(bArr, 0);
        int Ie = a0.Ie(bArr);
        if (Ie == 0) {
            return o1.b(m11);
        }
        R invoke = selector.invoke(o1.b(m11));
        int i11 = 1;
        if (1 <= Ie) {
            while (true) {
                byte m12 = p1.m(bArr, i11);
                R invoke2 = selector.invoke(o1.b(m12));
                if (invoke.compareTo(invoke2) < 0) {
                    m11 = m12;
                    invoke = invoke2;
                }
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        return o1.b(m11);
    }

    @y0(version = "1.3")
    @kotlin.d
    @n(message = "Use maxByOrNull instead.", replaceWith = @w0(expression = "this.maxByOrNull(selector)", imports = {}))
    @o00.f
    @o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> w1 v(long[] jArr, l<? super w1, ? extends R> selector) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-$this$maxBy$0");
        g0.p(selector, "selector");
        if (x1.s(jArr)) {
            return null;
        }
        long m11 = x1.m(jArr, 0);
        int Ne = a0.Ne(jArr);
        if (Ne == 0) {
            return w1.b(m11);
        }
        R invoke = selector.invoke(w1.b(m11));
        int i11 = 1;
        if (1 <= Ne) {
            while (true) {
                long m12 = x1.m(jArr, i11);
                R invoke2 = selector.invoke(w1.b(m12));
                if (invoke.compareTo(invoke2) < 0) {
                    m11 = m12;
                    invoke = invoke2;
                }
                if (i11 == Ne) {
                    break;
                }
                i11++;
            }
        }
        return w1.b(m11);
    }

    @y0(version = "1.3")
    @kotlin.d
    @n(message = "Use maxByOrNull instead.", replaceWith = @w0(expression = "this.maxByOrNull(selector)", imports = {}))
    @o00.f
    @o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> s1 w(int[] iArr, l<? super s1, ? extends R> selector) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$maxBy$0");
        g0.p(selector, "selector");
        if (t1.s(iArr)) {
            return null;
        }
        int m11 = t1.m(iArr, 0);
        int Me = a0.Me(iArr);
        if (Me == 0) {
            return s1.b(m11);
        }
        R invoke = selector.invoke(s1.b(m11));
        int i11 = 1;
        if (1 <= Me) {
            while (true) {
                int m12 = t1.m(iArr, i11);
                R invoke2 = selector.invoke(s1.b(m12));
                if (invoke.compareTo(invoke2) < 0) {
                    m11 = m12;
                    invoke = invoke2;
                }
                if (i11 == Me) {
                    break;
                }
                i11++;
            }
        }
        return s1.b(m11);
    }

    @y0(version = "1.3")
    @kotlin.d
    @n(message = "Use maxByOrNull instead.", replaceWith = @w0(expression = "this.maxByOrNull(selector)", imports = {}))
    @o00.f
    @o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> c2 x(short[] sArr, l<? super c2, ? extends R> selector) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-$this$maxBy$0");
        g0.p(selector, "selector");
        if (d2.s(sArr)) {
            return null;
        }
        short m11 = d2.m(sArr, 0);
        int Pe = a0.Pe(sArr);
        if (Pe == 0) {
            return c2.b(m11);
        }
        R invoke = selector.invoke(c2.b(m11));
        int i11 = 1;
        if (1 <= Pe) {
            while (true) {
                short m12 = d2.m(sArr, i11);
                R invoke2 = selector.invoke(c2.b(m12));
                if (invoke.compareTo(invoke2) < 0) {
                    m11 = m12;
                    invoke = invoke2;
                }
                if (i11 == Pe) {
                    break;
                }
                i11++;
            }
        }
        return c2.b(m11);
    }

    @y0(version = "1.3")
    @kotlin.d
    @n(message = "Use maxWithOrNull instead.", replaceWith = @w0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ o1 y(byte[] bArr, Comparator comparator) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-$this$maxWith$0");
        g0.p(comparator, "comparator");
        return g.G6(bArr, comparator);
    }

    @y0(version = "1.3")
    @kotlin.d
    @n(message = "Use maxWithOrNull instead.", replaceWith = @w0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ s1 z(int[] iArr, Comparator comparator) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-$this$maxWith$0");
        g0.p(comparator, "comparator");
        return g.H6(iArr, comparator);
    }
}
