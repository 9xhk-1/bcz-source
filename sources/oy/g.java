package oy;

import a00.r0;
import g10.o;
import hy.o1;
import ix.e1;
import ix.g1;
import ix.m0;
import ix.x0;
import ix.y1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.random.Random;
import mx.e0;
import mx.p;
import mx.q;
import mx.v;
import oy.a;
import oy.i;
import u30.f0;
import u30.k0;
import xy.b0;
import yz.g2;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPartialContentUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartialContentUtils.kt\nio/ktor/server/plugins/partialcontent/PartialContentUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n1557#2:162\n1628#2,3:163\n2669#2,7:167\n1734#2,3:174\n1734#2,3:177\n1734#2,3:180\n1797#2,3:183\n1611#2,9:186\n1863#2:195\n1864#2:197\n1620#2:198\n1#3:166\n1#3:196\n*S KotlinDebug\n*F\n+ 1 PartialContentUtils.kt\nio/ktor/server/plugins/partialcontent/PartialContentUtilsKt\n*L\n27#1:162\n27#1:163,3\n29#1:167,7\n42#1:174,3\n54#1:177,3\n63#1:180,3\n134#1:183,3\n144#1:186,9\n144#1:195\n144#1:197\n144#1:198\n144#1:196\n*E\n"})
/* loaded from: classes8.dex */
public final class g {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.plugins.partialcontent.PartialContentUtilsKt", f = "PartialContentUtils.kt", i = {0}, l = {37}, m = "checkIfRangeHeader", n = {"ifRange"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f78522a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f78523b;

        /* renamed from: c, reason: collision with root package name */
        public int f78524c;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f78523b = obj;
            this.f78524c |= Integer.MIN_VALUE;
            return g.b(null, null, this);
        }
    }

    public static final boolean a(@m80.k p actual, @m80.k List<? extends e0> ifRange) {
        g0.p(actual, "actual");
        g0.p(ifRange, "ifRange");
        List<? extends e0> list = ifRange;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (e0 e0Var : list) {
            if (!(e0Var instanceof p ? g0.g(actual.h(), ((p) e0Var).h()) : true)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(@m80.k mx.v.e r8, @m80.k zx.b r9, @m80.k j00.c<? super java.lang.Boolean> r10) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oy.g.b(mx.v$e, zx.b, j00.c):java.lang.Object");
    }

    public static final boolean c(@m80.k q actual, @m80.k List<? extends e0> ifRange) {
        g0.p(actual, "actual");
        g0.p(ifRange, "ifRange");
        bz.b e11 = bz.a.e(actual.f());
        List<? extends e0> list = ifRange;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (e0 e0Var : list) {
            if ((e0Var instanceof q) && e11.compareTo(((q) e0Var).f()) > 0) {
                return false;
            }
        }
        return true;
    }

    public static final boolean d(@m80.k List<o> list) {
        g0.p(list, "<this>");
        Pair a11 = h1.a(Boolean.TRUE, 0L);
        for (o oVar : list) {
            a11 = h1.a(Boolean.valueOf(((Boolean) a11.getFirst()).booleanValue() && ((Number) a11.getSecond()).longValue() <= oVar.d()), Long.valueOf(oVar.d()));
        }
        return ((Boolean) a11.getFirst()).booleanValue();
    }

    public static final boolean e(@m80.k zx.b bVar) {
        g0.p(bVar, "<this>");
        return g0.g(bVar.f().h().getMethod(), e1.f62753b.c());
    }

    public static final boolean f(@m80.k zx.b bVar) {
        g0.p(bVar, "<this>");
        return e(bVar) || g0.g(bVar.f().h().getMethod(), e1.f62753b.d());
    }

    @m80.k
    public static final List<m0> g(@m80.k String header) {
        g0.p(header, "header");
        return f0.b2(header, " GMT", false, 2, null) ? a00.g0.l(new m0(header, null, 2, null)) : x0.f(header);
    }

    @m80.l
    public static final e0 h(@m80.k String value) {
        g0.p(value, "value");
        if (k0.O3(value)) {
            return null;
        }
        if (f0.J2(value, "W/", false, 2, null)) {
            throw new IllegalStateException("Check failed.");
        }
        return f0.J2(value, "\"", false, 2, null) ? p.f73815d.c(value) : new q(ix.e0.b(value));
    }

    @m80.k
    public static final List<e0> i(@m80.k List<m0> list) {
        g0.p(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (m0 m0Var : list) {
            if (m0Var.f() != 1.0d) {
                throw new IllegalStateException("If-Range doesn't support quality");
            }
            if (!m0Var.e().isEmpty()) {
                throw new IllegalStateException("If-Range doesn't support parameters");
            }
            e0 h11 = h(m0Var.g());
            if (h11 != null) {
                arrayList.add(h11);
            }
        }
        return arrayList;
    }

    @m80.l
    public static final Object j(@m80.k a.C0964a c0964a, @m80.k v.e eVar, @m80.k List<o> list, long j11, @m80.k j00.c<? super g2> cVar) {
        String str = "ktor-boundary-" + b0.h(Random.Default.nextBytes(16));
        o1.e(c0964a.a());
        f.c().trace("Responding 206 PartialContent for " + py.e.q(c0964a.a().f()) + ": multiple range " + r0.r3(list, ",", null, null, 0, null, null, 62, null));
        c0964a.b(new i.b(cVar.getContext(), e(c0964a.a()), eVar, list, j11, str));
        return g2.f100423a;
    }

    @m80.l
    public static final Object k(@m80.k a.C0964a c0964a, @m80.k v.e eVar, @m80.k y1 y1Var, long j11, int i11, @m80.k j00.c<? super g2> cVar) {
        if (j11 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        List<o> l11 = y1Var.l(j11, i11);
        if (!l11.isEmpty()) {
            if (l11.size() != 1 && !d(l11)) {
                o n11 = y1Var.n(j11);
                g0.m(n11);
                l(c0964a, eVar, n11, j11);
            } else {
                if (l11.size() != 1) {
                    Object j12 = j(c0964a, eVar, l11, j11, cVar);
                    return j12 == kotlin.coroutines.intrinsics.b.l() ? j12 : g2.f100423a;
                }
                l(c0964a, eVar, (o) r0.m5(l11), j11);
            }
            return g2.f100423a;
        }
        f.c().trace("Responding 416 RequestedRangeNotSatisfiable for " + py.e.q(c0964a.a().f()) + ": range is empty");
        qy.l.h(c0964a.a().k(), null, l00.a.g(j11), null, 4, null);
        c0964a.b(new hy.g(g1.f62797c.N().n0("Couldn't satisfy range request " + y1Var + ": it should comply with the restriction [0; " + j11 + ')')));
        return g2.f100423a;
    }

    public static final void l(@m80.k a.C0964a c0964a, @m80.k v.e content, @m80.k o range, long j11) {
        g0.p(c0964a, "<this>");
        g0.p(content, "content");
        g0.p(range, "range");
        f.c().trace("Responding 206 PartialContent for " + py.e.q(c0964a.a().f()) + ": single range " + range);
        c0964a.b(new i.c(e(c0964a.a()), content, range, j11));
    }
}
