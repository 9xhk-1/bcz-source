package y40;

import com.google.common.util.concurrent.s2;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final w f99328a = new w();

    /* renamed from: b, reason: collision with root package name */
    public static final int f99329b = 65536;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final t f99330c = t.f99318h.b(new byte[0], 0, 0, null, false);

    /* renamed from: d, reason: collision with root package name */
    public static final int f99331d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f99332e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final String f99333f;

    /* renamed from: g, reason: collision with root package name */
    public static final int f99334g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f99335h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final AtomicReferenceArray<t> f99336i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final AtomicReferenceArray<t> f99337j;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f99331d = highestOneBit;
        int u11 = g10.u.u(highestOneBit / 2, 1);
        f99332e = u11;
        String str = kotlin.jvm.internal.g0.g(System.getProperty("java.vm.name"), "Dalvik") ? "0" : "4194304";
        f99333f = str;
        String property = System.getProperty("kotlinx.io.pool.size.bytes", str);
        kotlin.jvm.internal.g0.o(property, "getProperty(...)");
        Integer p12 = u30.e0.p1(property);
        int u12 = p12 != null ? g10.u.u(p12.intValue(), 0) : 0;
        f99334g = u12;
        f99335h = g10.u.u(u12 / u11, 8192);
        f99336i = new AtomicReferenceArray<>(highestOneBit);
        f99337j = new AtomicReferenceArray<>(u11);
    }

    @w00.o
    public static final void h(@m80.k t segment) {
        kotlin.jvm.internal.g0.p(segment, "segment");
        if (segment.f() != null || segment.j() != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        u c11 = segment.c();
        if (c11 != null && c11.c()) {
            return;
        }
        AtomicReferenceArray<t> atomicReferenceArray = f99336i;
        int f11 = f99328a.f();
        segment.z(0);
        segment.f99325e = true;
        while (true) {
            t tVar = atomicReferenceArray.get(f11);
            if (tVar != f99330c) {
                int d11 = tVar != null ? tVar.d() : 0;
                if (d11 >= f99329b) {
                    if (f99334g > 0) {
                        i(segment);
                        return;
                    }
                    return;
                } else {
                    segment.y(tVar);
                    segment.x(d11 + 8192);
                    if (s2.a(atomicReferenceArray, f11, tVar, segment)) {
                        return;
                    }
                }
            }
        }
    }

    @w00.o
    public static final void i(t tVar) {
        tVar.z(0);
        tVar.f99325e = true;
        int g11 = f99328a.g();
        AtomicReferenceArray<t> atomicReferenceArray = f99337j;
        int i11 = 0;
        while (true) {
            t tVar2 = atomicReferenceArray.get(g11);
            if (tVar2 != f99330c) {
                int d11 = (tVar2 != null ? tVar2.d() : 0) + 8192;
                if (d11 > f99335h) {
                    int i12 = f99332e;
                    if (i11 >= i12) {
                        return;
                    }
                    i11++;
                    g11 = (g11 + 1) & (i12 - 1);
                } else {
                    tVar.y(tVar2);
                    tVar.x(d11);
                    if (s2.a(atomicReferenceArray, g11, tVar2, tVar)) {
                        return;
                    }
                }
            }
        }
    }

    @w00.o
    @m80.k
    public static final t j() {
        t tVar;
        t andSet;
        AtomicReferenceArray<t> atomicReferenceArray = f99336i;
        int f11 = f99328a.f();
        do {
            tVar = f99330c;
            andSet = atomicReferenceArray.getAndSet(f11, tVar);
        } while (kotlin.jvm.internal.g0.g(andSet, tVar));
        if (andSet == null) {
            atomicReferenceArray.set(f11, null);
            return f99334g > 0 ? k() : t.f99318h.a();
        }
        atomicReferenceArray.set(f11, andSet.f());
        andSet.y(null);
        andSet.x(0);
        return andSet;
    }

    @w00.o
    public static final t k() {
        AtomicReferenceArray<t> atomicReferenceArray = f99337j;
        int g11 = f99328a.g();
        int i11 = 0;
        while (true) {
            t tVar = f99330c;
            t andSet = atomicReferenceArray.getAndSet(g11, tVar);
            if (!kotlin.jvm.internal.g0.g(andSet, tVar)) {
                if (andSet != null) {
                    atomicReferenceArray.set(g11, andSet.f());
                    andSet.y(null);
                    andSet.x(0);
                    return andSet;
                }
                atomicReferenceArray.set(g11, null);
                int i12 = f99332e;
                if (i11 >= i12) {
                    return t.f99318h.a();
                }
                g11 = (g11 + 1) & (i12 - 1);
                i11++;
            }
        }
    }

    @w00.o
    @m80.k
    public static final u l() {
        return new s();
    }

    public final int a(long j11) {
        return (int) (j11 & Thread.currentThread().getId());
    }

    public final int b() {
        t tVar = f99336i.get(f());
        if (tVar == null) {
            return 0;
        }
        return tVar.d();
    }

    public final int c() {
        return f99331d;
    }

    public final int d() {
        return f99329b;
    }

    public final int e() {
        return f99334g;
    }

    public final int f() {
        return a(f99331d - 1);
    }

    public final int g() {
        return a(f99332e - 1);
    }
}
