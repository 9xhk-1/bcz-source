package p3;

import c4.j;
import com.baicizhan.app.preferences.g;
import com.microsoft.thrifty.service.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import l7.i0;
import l7.p;
import m80.k;
import m80.l;
import oa0.r;
import ws.i;
import y7.d;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
@u0({"SMAP\nTopBannerRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopBannerRepo.kt\ncom/baicizhan/app/biz/advertisement/TopBannerRepo\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 4 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 5 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 6 Koin.kt\norg/koin/core/Koin\n+ 7 Scope.kt\norg/koin/core/scope/Scope\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,59:1\n58#2,6:60\n6#3:66\n64#4,2:67\n66#4:70\n67#4,2:76\n6#5:69\n124#6,4:71\n142#7:75\n295#8,2:78\n*S KotlinDebug\n*F\n+ 1 TopBannerRepo.kt\ncom/baicizhan/app/biz/advertisement/TopBannerRepo\n*L\n22#1:60,6\n25#1:66\n25#1:67,2\n25#1:70\n25#1:76,2\n25#1:69\n25#1:71,4\n25#1:75\n39#1:78,2\n*E\n"})
/* loaded from: classes3.dex */
public final class e implements j {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p f78824b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final c0 f78825c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.advertisement.TopBannerRepo", f = "TopBannerRepo.kt", i = {1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4}, l = {28, 31, 33, 34, 35}, m = "getTopBanner", n = {"fetchTime", "currentTime", "fetchTime", "currentTime", "fetchTime", "currentTime", "it", "$i$a$-also-TopBannerRepo$getTopBanner$list$1", "fetchTime", "currentTime", "it", "$i$a$-also-TopBannerRepo$getTopBanner$list$1"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$3", "I$0", "L$0", "L$1", "L$3", "I$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f78826a;

        /* renamed from: b, reason: collision with root package name */
        public Object f78827b;

        /* renamed from: c, reason: collision with root package name */
        public Object f78828c;

        /* renamed from: d, reason: collision with root package name */
        public Object f78829d;

        /* renamed from: e, reason: collision with root package name */
        public int f78830e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f78831f;

        /* renamed from: h, reason: collision with root package name */
        public int f78833h;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f78831f = obj;
            this.f78833h |= Integer.MIN_VALUE;
            return e.this.f(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.advertisement.TopBannerRepo", f = "TopBannerRepo.kt", i = {1}, l = {45, 46}, m = "loadLocal", n = {"count"}, s = {"I$0"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f78834a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f78835b;

        /* renamed from: d, reason: collision with root package name */
        public int f78837d;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f78835b = obj;
            this.f78837d |= Integer.MIN_VALUE;
            return e.this.g(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.advertisement.TopBannerRepo", f = "TopBannerRepo.kt", i = {0, 1}, l = {50, 51}, m = "saveLocal", n = {"list", "list"}, s = {"L$0", "L$0"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f78838a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f78839b;

        /* renamed from: d, reason: collision with root package name */
        public int f78841d;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f78839b = obj;
            this.f78841d |= Integer.MIN_VALUE;
            return e.this.j(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nKoinComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KoinComponent.kt\norg/koin/core/component/KoinComponentKt$inject$1\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,64:1\n45#2,2:65\n48#2:68\n142#3:67\n127#4:69\n*S KotlinDebug\n*F\n+ 1 KoinComponent.kt\norg/koin/core/component/KoinComponentKt$inject$1\n*L\n63#1:65,2\n63#1:68\n63#1:67\n63#1:69\n*E\n"})
    public static final class d implements x00.a<g> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ pa0.a f78842a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ za0.a f78843b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.a f78844c;

        public d(pa0.a aVar, za0.a aVar2, x00.a aVar3) {
            this.f78842a = aVar;
            this.f78843b = aVar2;
            this.f78844c = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [com.baicizhan.app.preferences.g, java.lang.Object] */
        @Override // x00.a
        public final g invoke() {
            pa0.a aVar = this.f78842a;
            return (aVar instanceof pa0.c ? ((pa0.c) aVar).getScope() : aVar.r().P().h()).i(o0.d(g.class), this.f78843b, this.f78844c);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    /* renamed from: p3.e$e, reason: collision with other inner class name */
    public static final class C0974e implements x00.l<w7.d<g8.c>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f78845a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f78846b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f78847c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        /* renamed from: p3.e$e$a */
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f78848a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f78849b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f78850c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f78848a = eVar;
                this.f78849b = cVar;
                this.f78850c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f78848a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f78848a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f78849b.b(this.f78850c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public C0974e(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f78845a = dVar;
            this.f78846b = eVar;
            this.f78847c = cVar;
        }

        public final void a(w7.d<g8.c> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f78846b, this.f78847c, this.f78845a));
            x00.p<i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f78845a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<g8.c> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    public e(@k p thriftService) {
        g0.p(thriftService, "thriftService");
        this.f78824b = thriftService;
        this.f78825c = e0.b(jb0.c.f64013a.b(), new d(this, null, new x00.a() { // from class: p3.d
            @Override // x00.a
            public final Object invoke() {
                ya0.a i11;
                i11 = e.i();
                return i11;
            }
        }));
    }

    private final g8.c d() {
        return (g8.c) w7.f.b(new C0974e(o0.d(g8.c.class), new l7.e(null, null, 3, null), (l7.c) j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    public static final ya0.a i() {
        return ya0.b.d(f.f78851a);
    }

    public final g e() {
        return (g) this.f78825c.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b3, code lost:
    
        if (r10 == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0091, code lost:
    
        if (r10 == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(@m80.k j00.c<? super g8.s> r10) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.e.f(j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004a, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(j00.c<? super java.util.List<g8.s>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p3.e.b
            if (r0 == 0) goto L13
            r0 = r7
            p3.e$b r0 = (p3.e.b) r0
            int r1 = r0.f78837d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f78837d = r1
            goto L18
        L13:
            p3.e$b r0 = new p3.e$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f78835b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f78837d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            int r0 = r0.f78834a
            kotlin.e.n(r7)
            goto L68
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            kotlin.e.n(r7)
            goto L4d
        L3a:
            kotlin.e.n(r7)
            com.baicizhan.app.preferences.g r7 = r6.e()
            r0.f78837d = r4
            java.lang.String r2 = "top_banner_count_key"
            r4 = 0
            java.lang.Object r7 = r7.d(r2, r4, r0)
            if (r7 != r1) goto L4d
            goto L64
        L4d:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            com.baicizhan.app.preferences.g r2 = r6.e()
            r0.f78834a = r7
            r0.f78837d = r3
            java.lang.String r3 = "top_banner_key"
            r4 = 0
            java.lang.Object r0 = r2.c(r3, r4, r0)
            if (r0 != r1) goto L65
        L64:
            return r1
        L65:
            r5 = r0
            r0 = r7
            r7 = r5
        L68:
            byte[] r7 = (byte[]) r7
            if (r7 == 0) goto L76
            ts.a<g8.s, g8.s$a> r1 = g8.s.f53368k
            java.util.List r7 = l7.d.d(r7, r1, r0)
            if (r7 != 0) goto L75
            goto L76
        L75:
            return r7
        L76:
            java.util.List r7 = a00.h0.J()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.e.g(j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:
    
        if (r7.e(p3.f.f78852b, r2, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if (r7.f(p3.f.f78853c, r2, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.util.List<g8.s> r6, j00.c<? super yz.g2> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p3.e.c
            if (r0 == 0) goto L13
            r0 = r7
            p3.e$c r0 = (p3.e.c) r0
            int r1 = r0.f78841d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f78841d = r1
            goto L18
        L13:
            p3.e$c r0 = new p3.e$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f78839b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f78841d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f78838a
            java.util.List r6 = (java.util.List) r6
            kotlin.e.n(r7)
            goto L73
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            java.lang.Object r6 = r0.f78838a
            java.util.List r6 = (java.util.List) r6
            kotlin.e.n(r7)
            goto L58
        L40:
            kotlin.e.n(r7)
            com.baicizhan.app.preferences.g r7 = r5.e()
            int r2 = r6.size()
            r0.f78838a = r6
            r0.f78841d = r4
            java.lang.String r4 = "top_banner_count_key"
            java.lang.Object r7 = r7.f(r4, r2, r0)
            if (r7 != r1) goto L58
            goto L72
        L58:
            com.baicizhan.app.preferences.g r7 = r5.e()
            ts.a<g8.s, g8.s$a> r2 = g8.s.f53368k
            byte[] r2 = l7.d.b(r6, r2)
            java.lang.Object r6 = l00.k.a(r6)
            r0.f78838a = r6
            r0.f78841d = r3
            java.lang.String r6 = "top_banner_key"
            java.lang.Object r6 = r7.e(r6, r2, r0)
            if (r6 != r1) goto L73
        L72:
            return r1
        L73:
            yz.g2 r6 = yz.g2.f100423a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.e.j(java.util.List, j00.c):java.lang.Object");
    }

    @Override // c4.j, pa0.a
    @k
    public /* bridge */ na0.a r() {
        return super.r();
    }
}
