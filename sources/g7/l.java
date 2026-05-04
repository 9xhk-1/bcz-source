package g7;

import com.baicizhan.app.biz.base.cache.CacheStrategy;
import com.microsoft.thrifty.service.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import l7.i0;
import l7.p;
import oa0.r;
import t3.a0;
import t3.e;
import t3.n;
import t3.z;
import y7.d;
import yz.c0;
import yz.e0;
import yz.g2;
import z8.b2;
import z8.x0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {f.class})
@u0({"SMAP\nITrainingRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ITrainingRepo.kt\ncom/baicizhan/app/biz/study/TrainRepoImpl\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,48:1\n6#2:49\n64#3,2:50\n66#3:53\n67#3,2:59\n6#4:52\n124#5,4:54\n142#6:58\n774#7:61\n865#7,2:62\n*S KotlinDebug\n*F\n+ 1 ITrainingRepo.kt\ncom/baicizhan/app/biz/study/TrainRepoImpl\n*L\n26#1:49\n26#1:50,2\n26#1:53\n26#1:59,2\n26#1:52\n26#1:54,4\n26#1:58\n39#1:61\n39#1:62,2\n*E\n"})
/* loaded from: classes3.dex */
public final class l implements c4.j, f {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final p f53135b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.preferences.a f53136c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final c0 f53137d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.study.TrainRepoImpl$cache$2$1$1", f = "ITrainingRepo.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements x00.l<j00.c<? super x0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f53138a;

        public a(j00.c<? super a> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return l.this.new a(cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super x0> cVar) {
            return ((a) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f53138a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            b2 i12 = l.this.i();
            this.f53138a = 1;
            Object k02 = i12.k0(this);
            return k02 == l11 ? l11 : k02;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.study.TrainRepoImpl", f = "ITrainingRepo.kt", i = {}, l = {39}, m = "loadGolden", n = {}, s = {}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f53140a;

        /* renamed from: c, reason: collision with root package name */
        public int f53142c;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f53140a = obj;
            this.f53142c |= Integer.MIN_VALUE;
            return l.this.a(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class c implements x00.l<w7.d<b2>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f53143a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f53144b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f53145c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f53146a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f53147b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f53148c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f53146a = eVar;
                this.f53147b = cVar;
                this.f53148c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f53146a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f53146a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f53147b.b(this.f53148c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public c(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f53143a = dVar;
            this.f53144b = eVar;
            this.f53145c = cVar;
        }

        public final void a(w7.d<b2> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f53144b, this.f53145c, this.f53143a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f53143a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) kotlin.jvm.internal.x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<b2> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    public l(@m80.k p thriftService, @m80.k com.baicizhan.app.preferences.a factory) {
        g0.p(thriftService, "thriftService");
        g0.p(factory, "factory");
        this.f53135b = thriftService;
        this.f53136c = factory;
        this.f53137d = e0.c(new x00.a() { // from class: g7.k
            @Override // x00.a
            public final Object invoke() {
                t3.g e11;
                e11 = l.e(l.this);
                return e11;
            }
        });
    }

    public static final t3.g e(final l lVar) {
        return a0.a(new x00.l() { // from class: g7.j
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 f11;
                f11 = l.f(l.this, (t3.b) obj);
                return f11;
            }
        });
    }

    public static final g2 f(l lVar, t3.b cache) {
        g0.p(cache, "$this$cache");
        cache.f(g.f53108b);
        cache.g(CacheStrategy.CACHE_FIRST);
        cache.i(n.c.f89276a);
        cache.h(new e.c(lVar.f53136c, new z.b(x0.f102254g)));
        cache.j(lVar.new a(null));
        return g2.f100423a;
    }

    private final t3.g<x0> g() {
        return (t3.g) this.f53137d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b2 i() {
        return (b2) w7.f.b(new c(o0.d(b2.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // g7.f
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k j00.c<? super java.util.List<z8.j0>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof g7.l.b
            if (r0 == 0) goto L13
            r0 = r5
            g7.l$b r0 = (g7.l.b) r0
            int r1 = r0.f53142c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53142c = r1
            goto L18
        L13:
            g7.l$b r0 = new g7.l$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f53140a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f53142c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r5)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.e.n(r5)
            t3.g r5 = r4.g()
            r0.f53142c = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            z8.x0 r5 = (z8.x0) r5
            java.util.List<z8.j0> r5 = r5.f102256b
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L50:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L6c
            java.lang.Object r1 = r5.next()
            r2 = r1
            z8.j0 r2 = (z8.j0) r2
            java.lang.Integer r2 = r2.f101650f
            if (r2 != 0) goto L62
            goto L68
        L62:
            int r2 = r2.intValue()
            if (r2 == r3) goto L50
        L68:
            r0.add(r1)
            goto L50
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.l.a(j00.c):java.lang.Object");
    }

    @Override // c4.j, pa0.a
    @m80.k
    public /* bridge */ na0.a r() {
        return super.r();
    }
}
