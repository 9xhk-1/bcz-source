package tw;

import a00.x1;
import cx.f0;
import cx.k0;
import cx.w;
import cx.y;
import cx.z;
import io.ktor.client.plugins.cache.ValidateStatus;
import ix.d1;
import ix.g1;
import ix.l2;
import ix.q0;
import ix.r0;
import ix.t2;
import ix.x0;
import ix.y0;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import mx.v;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nHttpCacheLegacy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpCacheLegacy.kt\nio/ktor/client/plugins/cache/HttpCacheLegacyKt\n+ 2 Headers.kt\nio/ktor/http/Headers$Companion\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,161:1\n23#2:162\n1#3:163\n1062#4:164\n295#4:165\n296#4:169\n168#5,3:166\n168#5,3:170\n*S KotlinDebug\n*F\n+ 1 HttpCacheLegacy.kt\nio/ktor/client/plugins/cache/HttpCacheLegacyKt\n*L\n85#1:162\n140#1:164\n141#1:165\n141#1:169\n142#1:166,3\n154#1:170,3\n*E\n"})
/* loaded from: classes8.dex */
public final class h {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.cache.HttpCacheLegacyKt", f = "HttpCacheLegacy.kt", i = {}, l = {110}, m = "cacheResponse", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f91050a;

        /* renamed from: b, reason: collision with root package name */
        public int f91051b;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f91050a = obj;
            this.f91051b |= Integer.MIN_VALUE;
            return h.c(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 HttpCacheLegacy.kt\nio/ktor/client/plugins/cache/HttpCacheLegacyKt\n*L\n1#1,121:1\n140#2:122\n*E\n"})
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return e00.g.l(((tw.c) t12).c().h(), ((tw.c) t11).c().h());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class c extends FunctionReferenceImpl implements x00.l<String, String> {
        public c(Object obj) {
            super(1, obj, r0.class, ct.d.f46852f, "get(Ljava/lang/String;)Ljava/lang/String;", 0);
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String p02) {
            g0.p(p02, "p0");
            return ((r0) this.receiver).get(p02);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class d extends FunctionReferenceImpl implements x00.l<String, List<? extends String>> {
        public d(Object obj) {
            super(1, obj, r0.class, "getAll", "getAll(Ljava/lang/String;)Ljava/util/List;", 0);
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<String> invoke(String p02) {
            g0.p(p02, "p0");
            return ((r0) this.receiver).a(p02);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class e extends FunctionReferenceImpl implements x00.l<String, String> {
        public e(Object obj) {
            super(1, obj, q0.class, ct.d.f46852f, "get(Ljava/lang/String;)Ljava/lang/String;", 0);
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String p02) {
            g0.p(p02, "p0");
            return ((q0) this.receiver).get(p02);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class f extends FunctionReferenceImpl implements x00.l<String, List<? extends String>> {
        public f(Object obj) {
            super(1, obj, q0.class, "getAll", "getAll(Ljava/lang/String;)Ljava/util/List;", 0);
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<String> invoke(String p02) {
            g0.p(p02, "p0");
            return ((q0) this.receiver).a(p02);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.cache.HttpCacheLegacyKt", f = "HttpCacheLegacy.kt", i = {0}, l = {62, 63, 72}, m = "interceptReceiveLegacy", n = {"$this$interceptReceiveLegacy"}, s = {"L$0"})
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f91052a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f91053b;

        /* renamed from: c, reason: collision with root package name */
        public int f91054c;

        public g(j00.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f91053b = obj;
            this.f91054c |= Integer.MIN_VALUE;
            return h.g(null, null, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(tw.b r8, ex.c r9, j00.c<? super ex.c> r10) {
        /*
            boolean r0 = r10 instanceof tw.h.a
            if (r0 == 0) goto L13
            r0 = r10
            tw.h$a r0 = (tw.h.a) r0
            int r1 = r0.f91051b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f91051b = r1
            goto L18
        L13:
            tw.h$a r0 = new tw.h$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f91050a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f91051b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r10)
            goto L7f
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            kotlin.e.n(r10)
            mw.a r10 = r9.c()
            cx.w r10 = r10.h()
            java.util.List r2 = ix.d1.a(r9)
            java.util.List r4 = ix.d1.a(r10)
            tw.a r5 = tw.a.f90988a
            ix.m0 r6 = r5.e()
            boolean r6 = r2.contains(r6)
            if (r6 == 0) goto L55
            uw.l r6 = r8.l()
            goto L59
        L55:
            uw.l r6 = r8.n()
        L59:
            ix.m0 r7 = r5.c()
            boolean r2 = r2.contains(r7)
            if (r2 != 0) goto L86
            ix.m0 r2 = r5.c()
            boolean r2 = r4.contains(r2)
            if (r2 == 0) goto L6e
            goto L86
        L6e:
            ix.t2 r10 = r10.getUrl()
            boolean r8 = r8.p()
            r0.f91051b = r3
            java.lang.Object r10 = uw.m.d(r6, r10, r9, r8, r0)
            if (r10 != r1) goto L7f
            return r1
        L7f:
            tw.c r10 = (tw.c) r10
            ex.c r8 = r10.f()
            return r8
        L86:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: tw.h.c(tw.b, ex.c, j00.c):java.lang.Object");
    }

    public static final ex.c d(tw.b bVar, w wVar, ex.c cVar) {
        t2 url = cVar.c().h().getUrl();
        uw.l l11 = d1.a(cVar).contains(tw.a.f90988a.e()) ? bVar.l() : bVar.n();
        Map<String, String> g11 = tw.e.g(cVar);
        tw.c f11 = f(bVar, l11, g11, url, wVar);
        if (f11 == null) {
            return null;
        }
        if (g11.isEmpty()) {
            g11 = f11.e();
        }
        l11.g(url, new tw.c(tw.e.d(cVar, bVar.p(), null, 2, null), g11, f11.c(), f11.a()));
        return f11.f();
    }

    public static final tw.c e(tw.b bVar, y yVar, v vVar) {
        t2 e11 = l2.e(yVar.j());
        x00.l<String, String> e12 = tw.g.e(vVar, new c(yVar.a()), new d(yVar.a()));
        for (tw.c cVar : x1.C(bVar.l().f(e11), bVar.n().f(e11))) {
            Map<String, String> e13 = cVar.e();
            if (!e13.isEmpty()) {
                if (e13.isEmpty()) {
                    return cVar;
                }
                for (Map.Entry<String, String> entry : e13.entrySet()) {
                    String key = entry.getKey();
                    if (!g0.g(e12.invoke(key), entry.getValue())) {
                        break;
                    }
                }
            }
            return cVar;
        }
        return null;
    }

    public static final tw.c f(tw.b bVar, uw.l lVar, Map<String, String> map, t2 t2Var, w wVar) {
        Object obj;
        if (!map.isEmpty()) {
            return lVar.e(t2Var, map);
        }
        x00.l<String, String> e11 = tw.g.e(wVar.w(), new e(wVar.a()), new f(wVar.a()));
        Iterator it = a00.r0.z5(lVar.f(t2Var), new b()).iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Map<String, String> e12 = ((tw.c) obj).e();
            if (!e12.isEmpty()) {
                for (Map.Entry<String, String> entry : e12.entrySet()) {
                    String key = entry.getKey();
                    if (!g0.g(e11.invoke(key), entry.getValue())) {
                        break;
                    }
                }
                break loop0;
            }
            break;
        }
        return (tw.c) obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (r6.i((ex.c) r10, r0) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        if (r10 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009e, code lost:
    
        if (r6.i(r8, r0) == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(@m80.k io.ktor.util.pipeline.d<ex.c, yz.g2> r6, @m80.k ex.c r7, @m80.k tw.b r8, @m80.k lw.c r9, @m80.k j00.c<? super yz.g2> r10) {
        /*
            boolean r0 = r10 instanceof tw.h.g
            if (r0 == 0) goto L13
            r0 = r10
            tw.h$g r0 = (tw.h.g) r0
            int r1 = r0.f91054c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f91054c = r1
            goto L18
        L13:
            tw.h$g r0 = new tw.h$g
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f91053b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f91054c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            kotlin.e.n(r10)
            goto La1
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            kotlin.e.n(r10)
            goto L6a
        L3c:
            java.lang.Object r6 = r0.f91052a
            io.ktor.util.pipeline.d r6 = (io.ktor.util.pipeline.d) r6
            kotlin.e.n(r10)
            goto L5c
        L44:
            kotlin.e.n(r10)
            ix.g1 r10 = r7.i()
            boolean r10 = ix.h1.b(r10)
            if (r10 == 0) goto L6d
            r0.f91052a = r6
            r0.f91054c = r5
            java.lang.Object r10 = c(r8, r7, r0)
            if (r10 != r1) goto L5c
            goto La0
        L5c:
            ex.c r10 = (ex.c) r10
            r7 = 0
            r0.f91052a = r7
            r0.f91054c = r4
            java.lang.Object r6 = r6.i(r10, r0)
            if (r6 != r1) goto L6a
            goto La0
        L6a:
            yz.g2 r6 = yz.g2.f100423a
            return r6
        L6d:
            ix.g1 r10 = r7.i()
            ix.g1$a r2 = ix.g1.f62797c
            ix.g1 r2 = r2.B()
            boolean r10 = kotlin.jvm.internal.g0.g(r10, r2)
            if (r10 == 0) goto Lb6
            mw.a r10 = r7.c()
            cx.w r10 = r10.h()
            ex.c r8 = d(r8, r10, r7)
            if (r8 == 0) goto La4
            hx.c r7 = r9.Z()
            tw.b$a r9 = tw.b.f90994g
            hx.a r9 = r9.d()
            r7.b(r9, r8)
            r0.f91054c = r3
            java.lang.Object r6 = r6.i(r8, r0)
            if (r6 != r1) goto La1
        La0:
            return r1
        La1:
            yz.g2 r6 = yz.g2.f100423a
            return r6
        La4:
            io.ktor.client.plugins.cache.InvalidCacheStateException r6 = new io.ktor.client.plugins.cache.InvalidCacheStateException
            mw.a r7 = r7.c()
            cx.w r7 = r7.h()
            ix.t2 r7 = r7.getUrl()
            r6.<init>(r7)
            throw r6
        Lb6:
            yz.g2 r6 = yz.g2.f100423a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tw.h.g(io.ktor.util.pipeline.d, ex.c, tw.b, lw.c, j00.c):java.lang.Object");
    }

    @l
    public static final Object h(@k io.ktor.util.pipeline.d<Object, y> dVar, @k tw.b bVar, @k v vVar, @k lw.c cVar, @k j00.c<? super g2> cVar2) {
        Object h11;
        tw.c e11 = e(bVar, dVar.d(), vVar);
        if (e11 == null) {
            return (x0.f(dVar.d().a().get(y0.f63006a.u())).contains(tw.a.f90988a.d()) && (h11 = tw.b.f90994g.h(dVar, cVar, cVar2)) == kotlin.coroutines.intrinsics.b.l()) ? h11 : g2.f100423a;
        }
        mw.a c11 = e11.f().c();
        ValidateStatus f11 = tw.e.f(e11.b(), e11.c().a(), dVar.d());
        if (f11 == ValidateStatus.ShouldNotValidate) {
            Object g11 = tw.b.f90994g.g(dVar, cVar, c11, cVar2);
            return g11 == kotlin.coroutines.intrinsics.b.l() ? g11 : g2.f100423a;
        }
        if (f11 == ValidateStatus.ShouldWarn) {
            Object i11 = i(dVar, c11, cVar, cVar2);
            return i11 == kotlin.coroutines.intrinsics.b.l() ? i11 : g2.f100423a;
        }
        q0 d11 = e11.d();
        y0 y0Var = y0.f63006a;
        String str = d11.get(y0Var.J());
        if (str != null) {
            k0.h(dVar.d(), y0Var.T(), str);
        }
        String str2 = e11.d().get(y0Var.X());
        if (str2 != null) {
            k0.h(dVar.d(), y0Var.S(), str2);
        }
        return g2.f100423a;
    }

    public static final Object i(io.ktor.util.pipeline.d<Object, y> dVar, mw.a aVar, lw.c cVar, j00.c<? super g2> cVar2) {
        z c11 = dVar.d().c();
        g1 i11 = aVar.i().i();
        bz.b e11 = aVar.i().e();
        q0.a aVar2 = q0.f62976a;
        r0 r0Var = new r0(0, 1, null);
        r0Var.j(aVar.i().a());
        r0Var.k(y0.f63006a.P0(), "110");
        g2 g2Var = g2.f100423a;
        mw.a aVar3 = new mw.a(cVar, c11, new f0(i11, e11, r0Var.build(), aVar.i().l(), aVar.i().b(), aVar.i().getCoroutineContext()));
        dVar.b();
        cVar.Z().b(tw.b.f90994g.d(), aVar3.i());
        Object i12 = dVar.i(aVar3, cVar2);
        return i12 == kotlin.coroutines.intrinsics.b.l() ? i12 : g2Var;
    }
}
