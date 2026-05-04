package p5;

import c40.r0;
import com.microsoft.thrifty.service.a;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import l7.i0;
import y7.d;
import yz.g2;
import z8.b2;
import z8.s;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {p5.b.class})
@u0({"SMAP\nRankPopupRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RankPopupRepo.kt\ncom/baicizhan/app/biz/game/repo/incentive/RankPopupRepoImpl\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,89:1\n6#2:90\n64#3,2:91\n66#3:94\n67#3,2:100\n6#4:93\n124#5,4:95\n142#6:99\n*S KotlinDebug\n*F\n+ 1 RankPopupRepo.kt\ncom/baicizhan/app/biz/game/repo/incentive/RankPopupRepoImpl\n*L\n32#1:90\n32#1:91,2\n32#1:94\n32#1:100,2\n32#1:93\n32#1:95,4\n32#1:99\n*E\n"})
/* loaded from: classes3.dex */
public final class i implements p5.b {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final l7.p f78947a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.preferences.a f78948b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.auth.r f78949c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.incentive.RankPopupRepoImpl$getPreviousRankList$2", f = "RankPopupRepo.kt", i = {0, 0, 0}, l = {52}, m = "invokeSuspend", n = {"$this$withContext", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-RankPopupRepoImpl$getPreviousRankList$2$1"}, s = {"L$0", "L$1", "I$0"}, v = 1)
    public static final class a extends SuspendLambda implements x00.p<r0, j00.c<? super s>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f78950a;

        /* renamed from: b, reason: collision with root package name */
        public int f78951b;

        /* renamed from: c, reason: collision with root package name */
        public int f78952c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f78953d;

        public a(j00.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = i.this.new a(cVar);
            aVar.f78953d = obj;
            return aVar;
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super s> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m6308constructorimpl;
            r0 r0Var = (r0) this.f78953d;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f78952c;
            try {
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    i iVar = i.this;
                    Result.a aVar = Result.Companion;
                    com.baicizhan.app.preferences.g h11 = iVar.h();
                    this.f78953d = l00.k.a(r0Var);
                    this.f78950a = l00.k.a(r0Var);
                    this.f78951b = 0;
                    this.f78952c = 1;
                    obj = h11.c(j.f78978c, null, this);
                    if (obj == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                byte[] bArr = (byte[]) obj;
                m6308constructorimpl = Result.m6308constructorimpl(bArr != null ? (s) l7.d.c(bArr, s.f101992e) : null);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
            }
            if (Result.m6314isFailureimpl(m6308constructorimpl)) {
                return null;
            }
            return m6308constructorimpl;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.incentive.RankPopupRepoImpl$getPreviousStudyScore$2", f = "RankPopupRepo.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements x00.p<r0, j00.c<? super Long>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f78955a;

        public b(j00.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return i.this.new b(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super Long> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f78955a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            com.baicizhan.app.preferences.g h11 = i.this.h();
            this.f78955a = 1;
            Object h12 = h11.h(j.f78979d, -1L, this);
            return h12 == l11 ? l11 : h12;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.incentive.RankPopupRepoImpl$getRankPopupTime$2", f = "RankPopupRepo.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class c extends SuspendLambda implements x00.p<r0, j00.c<? super Long>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f78957a;

        public c(j00.c<? super c> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return i.this.new c(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super Long> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f78957a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            com.baicizhan.app.preferences.g h11 = i.this.h();
            this.f78957a = 1;
            Object h12 = h11.h(j.f78977b, 0L, this);
            return h12 == l11 ? l11 : h12;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.incentive.RankPopupRepoImpl$setRankPopupTime$2", f = "RankPopupRepo.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class d extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f78959a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f78961c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j11, j00.c<? super d> cVar) {
            super(2, cVar);
            this.f78961c = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return i.this.new d(this.f78961c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f78959a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                com.baicizhan.app.preferences.g h11 = i.this.h();
                long j11 = this.f78961c;
                this.f78959a = 1;
                if (h11.i(j.f78977b, j11, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class e implements x00.l<w7.d<b2>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f78962a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f78963b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f78964c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f78965a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f78966b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f78967c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f78965a = eVar;
                this.f78966b = cVar;
                this.f78967c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f78965a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f78965a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f78966b.b(this.f78967c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public e(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f78962a = dVar;
            this.f78963b = eVar;
            this.f78964c = cVar;
        }

        public final void a(w7.d<b2> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f78963b, this.f78964c, this.f78962a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f78962a);
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

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.incentive.RankPopupRepoImpl$updateRankList$2", f = "RankPopupRepo.kt", i = {0, 0, 1, 1}, l = {76, 80}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u240", "$i$a$-apply-RankPopupRepoImpl$updateRankList$2$1", "$this$invokeSuspend_u24lambda_u240", "$i$a$-apply-RankPopupRepoImpl$updateRankList$2$1"}, s = {"L$1", "I$0", "L$1", "I$0"}, v = 1)
    public static final class f extends SuspendLambda implements x00.p<r0, j00.c<? super com.baicizhan.app.preferences.g>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f78968a;

        /* renamed from: b, reason: collision with root package name */
        public Object f78969b;

        /* renamed from: c, reason: collision with root package name */
        public long f78970c;

        /* renamed from: d, reason: collision with root package name */
        public int f78971d;

        /* renamed from: e, reason: collision with root package name */
        public int f78972e;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ s f78974g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ long f78975h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(s sVar, long j11, j00.c<? super f> cVar) {
            super(2, cVar);
            this.f78974g = sVar;
            this.f78975h = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return i.this.new f(this.f78974g, this.f78975h, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super com.baicizhan.app.preferences.g> cVar) {
            return ((f) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            com.baicizhan.app.preferences.g h11;
            int i11;
            long j11;
            com.baicizhan.app.preferences.g gVar;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i12 = this.f78972e;
            if (i12 == 0) {
                kotlin.e.n(obj);
                h11 = i.this.h();
                s sVar = this.f78974g;
                long j12 = this.f78975h;
                byte[] a11 = l7.d.a(sVar, s.f101992e);
                this.f78968a = h11;
                this.f78969b = h11;
                this.f78970c = j12;
                i11 = 0;
                this.f78971d = 0;
                this.f78972e = 1;
                if (h11.e(j.f78978c, a11, this) != l11) {
                    j11 = j12;
                    gVar = h11;
                }
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.baicizhan.app.preferences.g gVar2 = (com.baicizhan.app.preferences.g) this.f78968a;
                kotlin.e.n(obj);
                return gVar2;
            }
            i11 = this.f78971d;
            j11 = this.f78970c;
            h11 = (com.baicizhan.app.preferences.g) this.f78969b;
            gVar = (com.baicizhan.app.preferences.g) this.f78968a;
            kotlin.e.n(obj);
            this.f78968a = gVar;
            this.f78969b = l00.k.a(h11);
            this.f78971d = i11;
            this.f78972e = 2;
            return h11.i(j.f78979d, j11, this) == l11 ? l11 : gVar;
        }
    }

    public i(@m80.k l7.p thriftService, @m80.k com.baicizhan.app.preferences.a factory, @m80.k com.baicizhan.app.biz.auth.r tokenProvider) {
        g0.p(thriftService, "thriftService");
        g0.p(factory, "factory");
        g0.p(tokenProvider, "tokenProvider");
        this.f78947a = thriftService;
        this.f78948b = factory;
        this.f78949c = tokenProvider;
    }

    @Override // p5.b
    @m80.l
    public Object a(long j11, @m80.k j00.c<? super g2> cVar) {
        Object h11 = c40.i.h(c4.o.b(), new d(j11, null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }

    @Override // p5.b
    @m80.l
    public Object b(@m80.k j00.c<? super s> cVar) {
        return c40.i.h(c4.o.b(), new a(null), cVar);
    }

    @Override // p5.b
    @m80.l
    public Object c(@m80.k j00.c<? super Long> cVar) {
        return c40.i.h(c4.o.b(), new c(null), cVar);
    }

    @Override // p5.b
    @m80.l
    public Object d(@m80.k s sVar, long j11, @m80.k j00.c<? super g2> cVar) {
        Object h11 = c40.i.h(c4.o.b(), new f(sVar, j11, null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }

    @Override // p5.b
    @m80.l
    public Object e(@m80.k j00.c<? super Long> cVar) {
        return c40.i.h(c4.o.b(), new b(null), cVar);
    }

    @Override // p5.b
    @m80.l
    public Object f(@m80.k j00.c<? super s> cVar) {
        return i().D3(cVar);
    }

    public final com.baicizhan.app.preferences.g h() {
        com.baicizhan.app.preferences.a aVar = this.f78948b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("rank_popup_scope-");
        Long b11 = this.f78949c.b();
        g0.m(b11);
        sb2.append(b11.longValue());
        return aVar.a(sb2.toString());
    }

    public final b2 i() {
        return (b2) w7.f.b(new e(o0.d(b2.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }
}
