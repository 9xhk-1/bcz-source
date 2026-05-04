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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {p5.d.class})
@u0({"SMAP\nTaskPopupRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskPopupRepo.kt\ncom/baicizhan/app/biz/game/repo/incentive/TaskPopupRepoImpl\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,90:1\n6#2:91\n64#3,2:92\n66#3:95\n67#3,2:101\n6#4:94\n124#5,4:96\n142#6:100\n*S KotlinDebug\n*F\n+ 1 TaskPopupRepo.kt\ncom/baicizhan/app/biz/game/repo/incentive/TaskPopupRepoImpl\n*L\n31#1:91\n31#1:92,2\n31#1:95\n31#1:101,2\n31#1:94\n31#1:96,4\n31#1:100\n*E\n"})
/* loaded from: classes3.dex */
public final class m implements p5.d {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final l7.p f79009a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.preferences.a f79010b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.auth.r f79011c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.incentive.TaskPopupRepoImpl$getPreviousTaskList$2", f = "TaskPopupRepo.kt", i = {0, 0, 0}, l = {52}, m = "invokeSuspend", n = {"$this$withContext", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-TaskPopupRepoImpl$getPreviousTaskList$2$1"}, s = {"L$0", "L$1", "I$0"}, v = 1)
    public static final class a extends SuspendLambda implements x00.p<r0, j00.c<? super z8.j>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f79012a;

        /* renamed from: b, reason: collision with root package name */
        public int f79013b;

        /* renamed from: c, reason: collision with root package name */
        public int f79014c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f79015d;

        public a(j00.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = m.this.new a(cVar);
            aVar.f79015d = obj;
            return aVar;
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super z8.j> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m6308constructorimpl;
            r0 r0Var = (r0) this.f79015d;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f79014c;
            try {
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    m mVar = m.this;
                    Result.a aVar = Result.Companion;
                    com.baicizhan.app.preferences.g h11 = mVar.h();
                    this.f79015d = l00.k.a(r0Var);
                    this.f79012a = l00.k.a(r0Var);
                    this.f79013b = 0;
                    this.f79014c = 1;
                    obj = h11.c(n.f79040c, null, this);
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
                m6308constructorimpl = Result.m6308constructorimpl(bArr != null ? (z8.j) l7.d.c(bArr, z8.j.f101640c) : null);
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
    @l00.d(c = "com.baicizhan.app.biz.game.repo.incentive.TaskPopupRepoImpl$getPreviousTaskUpdateAt$2", f = "TaskPopupRepo.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements x00.p<r0, j00.c<? super Long>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f79017a;

        public b(j00.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return m.this.new b(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super Long> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f79017a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            com.baicizhan.app.preferences.g h11 = m.this.h();
            this.f79017a = 1;
            Object h12 = h11.h(n.f79041d, 0L, this);
            return h12 == l11 ? l11 : h12;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.incentive.TaskPopupRepoImpl$getTaskPopupTime$2", f = "TaskPopupRepo.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class c extends SuspendLambda implements x00.p<r0, j00.c<? super Long>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f79019a;

        public c(j00.c<? super c> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return m.this.new c(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super Long> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f79019a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            com.baicizhan.app.preferences.g h11 = m.this.h();
            this.f79019a = 1;
            Object h12 = h11.h(n.f79039b, 0L, this);
            return h12 == l11 ? l11 : h12;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.incentive.TaskPopupRepoImpl$setTaskPopupTime$2", f = "TaskPopupRepo.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class d extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f79021a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f79023c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j11, j00.c<? super d> cVar) {
            super(2, cVar);
            this.f79023c = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return m.this.new d(this.f79023c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f79021a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                com.baicizhan.app.preferences.g h11 = m.this.h();
                long j11 = this.f79023c;
                this.f79021a = 1;
                if (h11.i(n.f79039b, j11, this) == l11) {
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
        public final /* synthetic */ h10.d f79024a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f79025b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f79026c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f79027a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f79028b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f79029c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f79027a = eVar;
                this.f79028b = cVar;
                this.f79029c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f79027a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f79027a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f79028b.b(this.f79029c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public e(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f79024a = dVar;
            this.f79025b = eVar;
            this.f79026c = cVar;
        }

        public final void a(w7.d<b2> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f79025b, this.f79026c, this.f79024a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f79024a);
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
    @l00.d(c = "com.baicizhan.app.biz.game.repo.incentive.TaskPopupRepoImpl$updateTaskList$2", f = "TaskPopupRepo.kt", i = {0, 0, 1, 1}, l = {76, 80}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u240", "$i$a$-apply-TaskPopupRepoImpl$updateTaskList$2$1", "$this$invokeSuspend_u24lambda_u240", "$i$a$-apply-TaskPopupRepoImpl$updateTaskList$2$1"}, s = {"L$1", "I$0", "L$1", "I$0"}, v = 1)
    public static final class f extends SuspendLambda implements x00.p<r0, j00.c<? super com.baicizhan.app.preferences.g>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f79030a;

        /* renamed from: b, reason: collision with root package name */
        public Object f79031b;

        /* renamed from: c, reason: collision with root package name */
        public long f79032c;

        /* renamed from: d, reason: collision with root package name */
        public int f79033d;

        /* renamed from: e, reason: collision with root package name */
        public int f79034e;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ z8.j f79036g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ long f79037h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(z8.j jVar, long j11, j00.c<? super f> cVar) {
            super(2, cVar);
            this.f79036g = jVar;
            this.f79037h = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return m.this.new f(this.f79036g, this.f79037h, cVar);
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
            int i12 = this.f79034e;
            if (i12 == 0) {
                kotlin.e.n(obj);
                h11 = m.this.h();
                z8.j jVar = this.f79036g;
                long j12 = this.f79037h;
                byte[] a11 = l7.d.a(jVar, z8.j.f101640c);
                this.f79030a = h11;
                this.f79031b = h11;
                this.f79032c = j12;
                i11 = 0;
                this.f79033d = 0;
                this.f79034e = 1;
                if (h11.e(n.f79040c, a11, this) != l11) {
                    j11 = j12;
                    gVar = h11;
                }
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.baicizhan.app.preferences.g gVar2 = (com.baicizhan.app.preferences.g) this.f79030a;
                kotlin.e.n(obj);
                return gVar2;
            }
            i11 = this.f79033d;
            j11 = this.f79032c;
            h11 = (com.baicizhan.app.preferences.g) this.f79031b;
            gVar = (com.baicizhan.app.preferences.g) this.f79030a;
            kotlin.e.n(obj);
            this.f79030a = gVar;
            this.f79031b = l00.k.a(h11);
            this.f79033d = i11;
            this.f79034e = 2;
            return h11.i(n.f79041d, j11, this) == l11 ? l11 : gVar;
        }
    }

    public m(@m80.k l7.p thriftService, @m80.k com.baicizhan.app.preferences.a factory, @m80.k com.baicizhan.app.biz.auth.r tokenProvider) {
        g0.p(thriftService, "thriftService");
        g0.p(factory, "factory");
        g0.p(tokenProvider, "tokenProvider");
        this.f79009a = thriftService;
        this.f79010b = factory;
        this.f79011c = tokenProvider;
    }

    @Override // p5.d
    @m80.l
    public Object a(long j11, @m80.k j00.c<? super g2> cVar) {
        Object h11 = c40.i.h(c4.o.b(), new d(j11, null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }

    @Override // p5.d
    @m80.l
    public Object b(@m80.k z8.j jVar, long j11, @m80.k j00.c<? super g2> cVar) {
        Object h11 = c40.i.h(c4.o.b(), new f(jVar, j11, null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }

    @Override // p5.d
    @m80.l
    public Object c(@m80.k j00.c<? super Long> cVar) {
        return c40.i.h(c4.o.b(), new b(null), cVar);
    }

    @Override // p5.d
    @m80.l
    public Object d(@m80.k j00.c<? super z8.j> cVar) {
        return i().h0(cVar);
    }

    @Override // p5.d
    @m80.l
    public Object e(@m80.k j00.c<? super z8.j> cVar) {
        return c40.i.h(c4.o.b(), new a(null), cVar);
    }

    @Override // p5.d
    @m80.l
    public Object f(@m80.k j00.c<? super Long> cVar) {
        return c40.i.h(c4.o.b(), new c(null), cVar);
    }

    public final com.baicizhan.app.preferences.g h() {
        com.baicizhan.app.preferences.a aVar = this.f79010b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("task_popup_scope-");
        Long b11 = this.f79011c.b();
        g0.m(b11);
        sb2.append(b11.longValue());
        return aVar.a(sb2.toString());
    }

    public final b2 i() {
        return (b2) w7.f.b(new e(o0.d(b2.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }
}
