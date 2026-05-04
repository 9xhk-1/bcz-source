package io.ktor.server.routing;

import io.ktor.http.URLDecodeException;
import io.ktor.server.plugins.BadRequestException;
import io.ktor.server.routing.i0;
import io.ktor.server.routing.r1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nRoutingResolveContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoutingResolveContext.kt\nio/ktor/server/routing/RoutingResolveContext\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,245:1\n1104#2,3:246\n1#3:249\n1863#4,2:250\n1782#4,4:252\n1782#4,4:256\n1734#4,3:260\n*S KotlinDebug\n*F\n+ 1 RoutingResolveContext.kt\nio/ktor/server/routing/RoutingResolveContext\n*L\n57#1:246,3\n88#1:250,2\n224#1:252,4\n225#1:256,4\n235#1:260,3\n*E\n"})
/* loaded from: classes8.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final d1 f61696a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final zx.k0 f61697b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<x00.l<u1, g2>> f61698c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final List<String> f61699d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f61700e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public final u1 f61701f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final ArrayList<r1.b> f61702g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    public i0.b f61703h;

    /* renamed from: i, reason: collision with root package name */
    public int f61704i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.routing.RoutingResolveContext", f = "RoutingResolveContext.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {98, 158}, m = "handleRoute", n = {"this", "entry", "trait", "segmentIndex", "matchedQuality", "this", "entry", "trait", "evaluation", "result", "newIndex", "bestSucceedChildQuality", "childIndex"}, s = {"L$0", "L$1", "L$2", "I$0", "D$0", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "D$0", "I$1"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f61705a;

        /* renamed from: b, reason: collision with root package name */
        public Object f61706b;

        /* renamed from: c, reason: collision with root package name */
        public Object f61707c;

        /* renamed from: d, reason: collision with root package name */
        public Object f61708d;

        /* renamed from: e, reason: collision with root package name */
        public Object f61709e;

        /* renamed from: f, reason: collision with root package name */
        public int f61710f;

        /* renamed from: g, reason: collision with root package name */
        public int f61711g;

        /* renamed from: h, reason: collision with root package name */
        public int f61712h;

        /* renamed from: i, reason: collision with root package name */
        public double f61713i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f61714j;

        /* renamed from: l, reason: collision with root package name */
        public int f61716l;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f61714j = obj;
            this.f61716l |= Integer.MIN_VALUE;
            return p1.this.g(null, 0, null, 0.0d, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.routing.RoutingResolveContext", f = "RoutingResolveContext.kt", i = {0}, l = {83}, m = "resolve", n = {"this"}, s = {"L$0"})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f61717a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f61718b;

        /* renamed from: d, reason: collision with root package name */
        public int f61720d;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f61718b = obj;
            this.f61720d |= Integer.MIN_VALUE;
            return p1.this.j(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p1(@m80.k d1 routing, @m80.k zx.k0 call, @m80.k List<? extends x00.l<? super u1, g2>> tracers) {
        kotlin.jvm.internal.g0.p(routing, "routing");
        kotlin.jvm.internal.g0.p(call, "call");
        kotlin.jvm.internal.g0.p(tracers, "tracers");
        this.f61696a = routing;
        this.f61697b = call;
        this.f61698c = tracers;
        u1 u1Var = null;
        this.f61700e = u30.k0.s3(py.e.w(call.f()), '/', false, 2, null);
        this.f61702g = new ArrayList<>(16);
        this.f61703h = i0.f61619b.f();
        try {
            List<String> i11 = i(py.e.w(call.f()));
            this.f61699d = i11;
            if (!tracers.isEmpty()) {
                u1Var = new u1(call, i11);
            }
            this.f61701f = u1Var;
        } catch (URLDecodeException e11) {
            throw new BadRequestException("Url decode failed for " + py.e.q(this.f61697b.f()), e11);
        }
    }

    public final r1 b() {
        ix.g1 z11;
        ArrayList<r1.b> arrayList = this.f61702g;
        if (arrayList.isEmpty()) {
            d1 d1Var = this.f61696a;
            i0.b bVar = this.f61703h;
            if (bVar == null || (z11 = bVar.o()) == null) {
                z11 = ix.g1.f62797c.z();
            }
            return new r1.a(d1Var, "No matched subtrees found", z11);
        }
        int i11 = 0;
        ix.q1 b11 = ix.t1.b(0, 1, null);
        int L = a00.h0.L(arrayList);
        double d11 = Double.MAX_VALUE;
        if (L >= 0) {
            while (true) {
                r1.b bVar2 = arrayList.get(i11);
                kotlin.jvm.internal.g0.o(bVar2, "get(...)");
                r1.b bVar3 = bVar2;
                b11.j(bVar3.a());
                d11 = Math.min(d11, bVar3.c() == -1.0d ? 1.0d : bVar3.c());
                if (i11 == L) {
                    break;
                }
                i11++;
            }
        }
        return new r1.b(((r1.b) a00.r0.u3(arrayList)).b(), b11.build(), d11);
    }

    @m80.k
    public final zx.k0 c() {
        return this.f61697b;
    }

    public final boolean d() {
        return this.f61700e;
    }

    @m80.k
    public final d1 e() {
        return this.f61696a;
    }

    @m80.k
    public final List<String> f() {
        return this.f61699d;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x01d7 -> B:11:0x01e1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(io.ktor.server.routing.d1 r30, int r31, java.util.ArrayList<io.ktor.server.routing.r1.b> r32, double r33, j00.c<? super java.lang.Double> r35) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.routing.p1.g(io.ktor.server.routing.d1, int, java.util.ArrayList, double, j00.c):java.lang.Object");
    }

    public final boolean h(List<r1.b> list) {
        int i11;
        int i12;
        ArrayList<r1.b> arrayList = this.f61702g;
        int i13 = 0;
        int i14 = 0;
        while (i13 < arrayList.size() && i14 < list.size()) {
            double c11 = arrayList.get(i13).c();
            double c12 = list.get(i14).c();
            if (c11 == -1.0d) {
                i13++;
            } else {
                if (c12 != -1.0d) {
                    if (c11 != c12) {
                        return c12 > c11;
                    }
                    i13++;
                }
                i14++;
            }
        }
        if (arrayList.isEmpty()) {
            i11 = 0;
        } else {
            Iterator<T> it = arrayList.iterator();
            i11 = 0;
            while (it.hasNext()) {
                if (!(((r1.b) it.next()).c() == -1.0d) && (i11 = i11 + 1) < 0) {
                    a00.h0.a0();
                }
            }
        }
        List<r1.b> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            i12 = 0;
        } else {
            Iterator<T> it2 = list2.iterator();
            i12 = 0;
            while (it2.hasNext()) {
                if (!(((r1.b) it2.next()).c() == -1.0d) && (i12 = i12 + 1) < 0) {
                    a00.h0.a0();
                }
            }
        }
        return i12 > i11;
    }

    public final List<String> i(String str) {
        if (str.length() == 0 || kotlin.jvm.internal.g0.g(str, "/")) {
            return a00.h0.J();
        }
        int length = str.length();
        int i11 = 0;
        for (int i12 = 0; i12 < str.length(); i12++) {
            if (str.charAt(i12) == '/') {
                i11++;
            }
        }
        ArrayList arrayList = new ArrayList(i11);
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            int i15 = i14;
            String str2 = str;
            int I3 = u30.k0.I3(str2, '/', i15, false, 4, null);
            i13 = I3 == -1 ? length : I3;
            if (i13 == i15) {
                i14 = i13 + 1;
            } else {
                int i16 = i13;
                arrayList.add(ix.f.i(str2, i15, i16, null, 4, null));
                i14 = i16 + 1;
            }
            str = str2;
        }
        String str3 = str;
        if (!k.e(this.f61697b) && u30.f0.b2(str3, "/", false, 2, null)) {
            arrayList.add("");
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(@m80.k j00.c<? super io.ktor.server.routing.r1> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof io.ktor.server.routing.p1.b
            if (r0 == 0) goto L14
            r0 = r9
            io.ktor.server.routing.p1$b r0 = (io.ktor.server.routing.p1.b) r0
            int r1 = r0.f61720d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f61720d = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            io.ktor.server.routing.p1$b r0 = new io.ktor.server.routing.p1$b
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r7.f61718b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r7.f61720d
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r0 = r7.f61717a
            io.ktor.server.routing.p1 r0 = (io.ktor.server.routing.p1) r0
            kotlin.e.n(r9)
            goto L55
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L37:
            kotlin.e.n(r9)
            r9 = r2
            io.ktor.server.routing.d1 r2 = r8.f61696a
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r7.f61717a = r8
            r7.f61720d = r9
            r3 = 0
            r5 = -4503599627370497(0xffefffffffffffff, double:-1.7976931348623157E308)
            r1 = r8
            java.lang.Object r9 = r1.g(r2, r3, r4, r5, r7)
            if (r9 != r0) goto L54
            return r0
        L54:
            r0 = r8
        L55:
            io.ktor.server.routing.r1 r9 = r0.b()
            io.ktor.server.routing.u1 r1 = r0.f61701f
            if (r1 == 0) goto L60
            r1.l(r9)
        L60:
            io.ktor.server.routing.u1 r1 = r0.f61701f
            if (r1 == 0) goto L7c
            java.util.List<x00.l<io.ktor.server.routing.u1, yz.g2>> r0 = r0.f61698c
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L6c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L7c
            java.lang.Object r2 = r0.next()
            x00.l r2 = (x00.l) r2
            r2.invoke(r1)
            goto L6c
        L7c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.routing.p1.j(j00.c):java.lang.Object");
    }

    public final void k(i0.b bVar, ArrayList<r1.b> arrayList) {
        i0.b bVar2 = this.f61703h;
        if (bVar2 == null) {
            return;
        }
        if (bVar2.p() < bVar.p() || this.f61704i < arrayList.size()) {
            if (arrayList == null || !arrayList.isEmpty()) {
                for (r1.b bVar3 : arrayList) {
                    if (bVar3.c() != -1.0d && bVar3.c() != 1.0d) {
                        return;
                    }
                }
            }
            this.f61703h = bVar;
            this.f61704i = arrayList.size();
        }
    }
}
