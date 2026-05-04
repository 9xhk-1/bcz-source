package g7;

import com.baicizhan.app.biz.auth.n;
import com.baicizhan.app.biz.auth.p;
import com.baicizhan.app.biz.base.cache.CacheStrategy;
import com.microsoft.thrifty.service.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import l7.i0;
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
import z8.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
@u0({"SMAP\nAchievementRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AchievementRepo.kt\ncom/baicizhan/app/biz/study/AchievementRepo\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,48:1\n6#2:49\n64#3,2:50\n66#3:53\n67#3,2:59\n6#4:52\n124#5,4:54\n142#6:58\n*S KotlinDebug\n*F\n+ 1 AchievementRepo.kt\ncom/baicizhan/app/biz/study/AchievementRepo\n*L\n28#1:49\n28#1:50,2\n28#1:53\n28#1:59,2\n28#1:52\n28#1:54,4\n28#1:58\n*E\n"})
/* loaded from: classes3.dex */
public final class c implements c4.j, p {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final l7.p f53095b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.preferences.a f53096c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final c0 f53097d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.study.AchievementRepo$achievementCache$2$1$1", f = "AchievementRepo.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements x00.l<j00.c<? super y0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f53098a;

        public a(j00.c<? super a> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return c.this.new a(cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super y0> cVar) {
            return ((a) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f53098a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            b2 i12 = c.this.i();
            this.f53098a = 1;
            Object C = i12.C(this);
            return C == l11 ? l11 : C;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class b implements x00.l<w7.d<b2>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f53100a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f53101b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f53102c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f53103a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f53104b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f53105c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f53103a = eVar;
                this.f53104b = cVar;
                this.f53105c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f53103a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f53103a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f53104b.b(this.f53105c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public b(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f53100a = dVar;
            this.f53101b = eVar;
            this.f53102c = cVar;
        }

        public final void a(w7.d<b2> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f53101b, this.f53102c, this.f53100a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f53100a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<b2> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    public c(@m80.k l7.p thriftService, @m80.k com.baicizhan.app.preferences.a factory, @m80.k n logoutHub) {
        g0.p(thriftService, "thriftService");
        g0.p(factory, "factory");
        g0.p(logoutHub, "logoutHub");
        this.f53095b = thriftService;
        this.f53096c = factory;
        logoutHub.b(this);
        this.f53097d = e0.c(new x00.a() { // from class: g7.a
            @Override // x00.a
            public final Object invoke() {
                t3.g d11;
                d11 = c.d(c.this);
                return d11;
            }
        });
    }

    public static final t3.g d(final c cVar) {
        return a0.a(new x00.l() { // from class: g7.b
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 e11;
                e11 = c.e(c.this, (t3.b) obj);
                return e11;
            }
        });
    }

    public static final g2 e(c cVar, t3.b cache) {
        g0.p(cache, "$this$cache");
        cache.f(d.f53106a);
        cache.g(CacheStrategy.NETWORK_FIRST);
        cache.i(n.b.f89275a);
        cache.h(new e.c(cVar.f53096c, new z.b(y0.f102280d)));
        cache.j(cVar.new a(null));
        return g2.f100423a;
    }

    @Override // com.baicizhan.app.biz.auth.p
    @m80.l
    public Object A2(@m80.k j00.c<? super g2> cVar) {
        Object c11 = g().c(cVar);
        return c11 == kotlin.coroutines.intrinsics.b.l() ? c11 : g2.f100423a;
    }

    @m80.l
    public final Object f(@m80.k j00.c<? super y0> cVar) {
        return g().b(cVar);
    }

    public final t3.g<y0> g() {
        return (t3.g) this.f53097d.getValue();
    }

    public final b2 i() {
        return (b2) w7.f.b(new b(o0.d(b2.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    @Override // c4.j, pa0.a
    @m80.k
    public /* bridge */ na0.a r() {
        return super.r();
    }
}
