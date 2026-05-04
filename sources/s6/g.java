package s6;

import c40.r0;
import c40.s0;
import c40.x0;
import java.util.Iterator;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import oa0.r;
import r6.p;
import yz.g2;
import z8.t;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final p5.f f87939a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final t5.a f87940b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final p f87941c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.monetization.c f87942d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final r6.a f87943e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.incentive.a f87944f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.ipavatar.c f87945g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.abtest.a f87946h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.advertisement.a f87947i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.sync.compose.SyncCampaignUC$invoke$2", f = "SyncCampaignUC.kt", i = {0}, l = {33}, m = "invokeSuspend", n = {"$this$coroutineScope"}, s = {"L$0"}, v = 1)
    @u0({"SMAP\nSyncCampaignUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SyncCampaignUC.kt\ncom/baicizhan/app/biz/game/uc/sync/compose/SyncCampaignUC$invoke$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,52:1\n1869#2,2:53\n*S KotlinDebug\n*F\n+ 1 SyncCampaignUC.kt\ncom/baicizhan/app/biz/game/uc/sync/compose/SyncCampaignUC$invoke$2\n*L\n43#1:53,2\n*E\n"})
    public static final class a extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f87948a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f87949b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.uc.sync.compose.SyncCampaignUC$invoke$2$1", f = "SyncCampaignUC.kt", i = {0, 0, 0}, l = {34}, m = "invokeSuspend", n = {"$this$async", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-SyncCampaignUC$invoke$2$1$1"}, s = {"L$0", "L$1", "I$0"}, v = 1)
        @u0({"SMAP\nSyncCampaignUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SyncCampaignUC.kt\ncom/baicizhan/app/biz/game/uc/sync/compose/SyncCampaignUC$invoke$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n1#2:53\n*E\n"})
        /* renamed from: s6.g$a$a, reason: collision with other inner class name */
        public static final class C1148a extends SuspendLambda implements x00.p<r0, j00.c<? super Result<? extends g2>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f87951a;

            /* renamed from: b, reason: collision with root package name */
            public int f87952b;

            /* renamed from: c, reason: collision with root package name */
            public int f87953c;

            /* renamed from: d, reason: collision with root package name */
            public /* synthetic */ Object f87954d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ g f87955e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1148a(g gVar, j00.c<? super C1148a> cVar) {
                super(2, cVar);
                this.f87955e = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                C1148a c1148a = new C1148a(this.f87955e, cVar);
                c1148a.f87954d = obj;
                return c1148a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(r0 r0Var, j00.c<? super Result<g2>> cVar) {
                return ((C1148a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object m6308constructorimpl;
                r0 r0Var = (r0) this.f87954d;
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f87953c;
                try {
                    if (i11 == 0) {
                        kotlin.e.n(obj);
                        g gVar = this.f87955e;
                        Result.a aVar = Result.Companion;
                        com.baicizhan.app.biz.game.uc.ipavatar.c cVar = gVar.f87945g;
                        this.f87954d = l00.k.a(r0Var);
                        this.f87951a = l00.k.a(r0Var);
                        this.f87952b = 0;
                        this.f87953c = 1;
                        if (cVar.b(this) == l11) {
                            return l11;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.e.n(obj);
                    }
                    m6308constructorimpl = Result.m6308constructorimpl(g2.f100423a);
                } catch (Throwable th2) {
                    Result.a aVar2 = Result.Companion;
                    m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
                }
                return Result.m6307boximpl(m6308constructorimpl);
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super Result<? extends g2>> cVar) {
                return invoke2(r0Var, (j00.c<? super Result<g2>>) cVar);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.uc.sync.compose.SyncCampaignUC$invoke$2$2", f = "SyncCampaignUC.kt", i = {0, 0, 0}, l = {35}, m = "invokeSuspend", n = {"$this$async", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-SyncCampaignUC$invoke$2$2$1"}, s = {"L$0", "L$1", "I$0"}, v = 1)
        @u0({"SMAP\nSyncCampaignUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SyncCampaignUC.kt\ncom/baicizhan/app/biz/game/uc/sync/compose/SyncCampaignUC$invoke$2$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n1#2:53\n*E\n"})
        public static final class b extends SuspendLambda implements x00.p<r0, j00.c<? super Result<? extends g2>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f87956a;

            /* renamed from: b, reason: collision with root package name */
            public int f87957b;

            /* renamed from: c, reason: collision with root package name */
            public int f87958c;

            /* renamed from: d, reason: collision with root package name */
            public /* synthetic */ Object f87959d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ g f87960e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(g gVar, j00.c<? super b> cVar) {
                super(2, cVar);
                this.f87960e = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                b bVar = new b(this.f87960e, cVar);
                bVar.f87959d = obj;
                return bVar;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(r0 r0Var, j00.c<? super Result<g2>> cVar) {
                return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object m6308constructorimpl;
                r0 r0Var = (r0) this.f87959d;
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f87958c;
                try {
                    if (i11 == 0) {
                        kotlin.e.n(obj);
                        g gVar = this.f87960e;
                        Result.a aVar = Result.Companion;
                        p5.f fVar = gVar.f87939a;
                        this.f87959d = l00.k.a(r0Var);
                        this.f87956a = l00.k.a(r0Var);
                        this.f87957b = 0;
                        this.f87958c = 1;
                        if (fVar.a(this) == l11) {
                            return l11;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.e.n(obj);
                    }
                    m6308constructorimpl = Result.m6308constructorimpl(g2.f100423a);
                } catch (Throwable th2) {
                    Result.a aVar2 = Result.Companion;
                    m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
                }
                return Result.m6307boximpl(m6308constructorimpl);
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super Result<? extends g2>> cVar) {
                return invoke2(r0Var, (j00.c<? super Result<g2>>) cVar);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.uc.sync.compose.SyncCampaignUC$invoke$2$3", f = "SyncCampaignUC.kt", i = {0, 0, 0}, l = {36}, m = "invokeSuspend", n = {"$this$async", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-SyncCampaignUC$invoke$2$3$1"}, s = {"L$0", "L$1", "I$0"}, v = 1)
        @u0({"SMAP\nSyncCampaignUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SyncCampaignUC.kt\ncom/baicizhan/app/biz/game/uc/sync/compose/SyncCampaignUC$invoke$2$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n1#2:53\n*E\n"})
        public static final class c extends SuspendLambda implements x00.p<r0, j00.c<? super Result<? extends g2>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f87961a;

            /* renamed from: b, reason: collision with root package name */
            public int f87962b;

            /* renamed from: c, reason: collision with root package name */
            public int f87963c;

            /* renamed from: d, reason: collision with root package name */
            public /* synthetic */ Object f87964d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ g f87965e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(g gVar, j00.c<? super c> cVar) {
                super(2, cVar);
                this.f87965e = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                c cVar2 = new c(this.f87965e, cVar);
                cVar2.f87964d = obj;
                return cVar2;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(r0 r0Var, j00.c<? super Result<g2>> cVar) {
                return ((c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object m6308constructorimpl;
                r0 r0Var = (r0) this.f87964d;
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f87963c;
                try {
                    if (i11 == 0) {
                        kotlin.e.n(obj);
                        g gVar = this.f87965e;
                        Result.a aVar = Result.Companion;
                        t5.a aVar2 = gVar.f87940b;
                        this.f87964d = l00.k.a(r0Var);
                        this.f87961a = l00.k.a(r0Var);
                        this.f87962b = 0;
                        this.f87963c = 1;
                        if (aVar2.a(this) == l11) {
                            return l11;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.e.n(obj);
                    }
                    m6308constructorimpl = Result.m6308constructorimpl(g2.f100423a);
                } catch (Throwable th2) {
                    Result.a aVar3 = Result.Companion;
                    m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
                }
                return Result.m6307boximpl(m6308constructorimpl);
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super Result<? extends g2>> cVar) {
                return invoke2(r0Var, (j00.c<? super Result<g2>>) cVar);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.uc.sync.compose.SyncCampaignUC$invoke$2$4", f = "SyncCampaignUC.kt", i = {0, 0, 0}, l = {37}, m = "invokeSuspend", n = {"$this$async", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-SyncCampaignUC$invoke$2$4$1"}, s = {"L$0", "L$1", "I$0"}, v = 1)
        @u0({"SMAP\nSyncCampaignUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SyncCampaignUC.kt\ncom/baicizhan/app/biz/game/uc/sync/compose/SyncCampaignUC$invoke$2$4\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n1#2:53\n*E\n"})
        public static final class d extends SuspendLambda implements x00.p<r0, j00.c<? super Result<? extends t>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f87966a;

            /* renamed from: b, reason: collision with root package name */
            public int f87967b;

            /* renamed from: c, reason: collision with root package name */
            public int f87968c;

            /* renamed from: d, reason: collision with root package name */
            public /* synthetic */ Object f87969d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ g f87970e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(g gVar, j00.c<? super d> cVar) {
                super(2, cVar);
                this.f87970e = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                d dVar = new d(this.f87970e, cVar);
                dVar.f87969d = obj;
                return dVar;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(r0 r0Var, j00.c<? super Result<t>> cVar) {
                return ((d) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object m6308constructorimpl;
                r0 r0Var = (r0) this.f87969d;
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f87968c;
                try {
                    if (i11 == 0) {
                        kotlin.e.n(obj);
                        g gVar = this.f87970e;
                        Result.a aVar = Result.Companion;
                        p pVar = gVar.f87941c;
                        this.f87969d = l00.k.a(r0Var);
                        this.f87966a = l00.k.a(r0Var);
                        this.f87967b = 0;
                        this.f87968c = 1;
                        obj = pVar.d(this);
                        if (obj == l11) {
                            return l11;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.e.n(obj);
                    }
                    m6308constructorimpl = Result.m6308constructorimpl((t) obj);
                } catch (Throwable th2) {
                    Result.a aVar2 = Result.Companion;
                    m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
                }
                return Result.m6307boximpl(m6308constructorimpl);
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super Result<? extends t>> cVar) {
                return invoke2(r0Var, (j00.c<? super Result<t>>) cVar);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.uc.sync.compose.SyncCampaignUC$invoke$2$5", f = "SyncCampaignUC.kt", i = {0, 0, 0}, l = {38}, m = "invokeSuspend", n = {"$this$async", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-SyncCampaignUC$invoke$2$5$1"}, s = {"L$0", "L$1", "I$0"}, v = 1)
        @u0({"SMAP\nSyncCampaignUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SyncCampaignUC.kt\ncom/baicizhan/app/biz/game/uc/sync/compose/SyncCampaignUC$invoke$2$5\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n1#2:53\n*E\n"})
        public static final class e extends SuspendLambda implements x00.p<r0, j00.c<? super Result<? extends g2>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f87971a;

            /* renamed from: b, reason: collision with root package name */
            public int f87972b;

            /* renamed from: c, reason: collision with root package name */
            public int f87973c;

            /* renamed from: d, reason: collision with root package name */
            public /* synthetic */ Object f87974d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ g f87975e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(g gVar, j00.c<? super e> cVar) {
                super(2, cVar);
                this.f87975e = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                e eVar = new e(this.f87975e, cVar);
                eVar.f87974d = obj;
                return eVar;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(r0 r0Var, j00.c<? super Result<g2>> cVar) {
                return ((e) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object m6308constructorimpl;
                r0 r0Var = (r0) this.f87974d;
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f87973c;
                try {
                    if (i11 == 0) {
                        kotlin.e.n(obj);
                        g gVar = this.f87975e;
                        Result.a aVar = Result.Companion;
                        com.baicizhan.app.biz.game.uc.monetization.c cVar = gVar.f87942d;
                        this.f87974d = l00.k.a(r0Var);
                        this.f87971a = l00.k.a(r0Var);
                        this.f87972b = 0;
                        this.f87973c = 1;
                        if (com.baicizhan.app.biz.game.uc.monetization.c.b(cVar, false, this, 1, null) == l11) {
                            return l11;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.e.n(obj);
                    }
                    m6308constructorimpl = Result.m6308constructorimpl(g2.f100423a);
                } catch (Throwable th2) {
                    Result.a aVar2 = Result.Companion;
                    m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
                }
                return Result.m6307boximpl(m6308constructorimpl);
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super Result<? extends g2>> cVar) {
                return invoke2(r0Var, (j00.c<? super Result<g2>>) cVar);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.uc.sync.compose.SyncCampaignUC$invoke$2$6", f = "SyncCampaignUC.kt", i = {0, 0, 0}, l = {39}, m = "invokeSuspend", n = {"$this$async", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-SyncCampaignUC$invoke$2$6$1"}, s = {"L$0", "L$1", "I$0"}, v = 1)
        @u0({"SMAP\nSyncCampaignUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SyncCampaignUC.kt\ncom/baicizhan/app/biz/game/uc/sync/compose/SyncCampaignUC$invoke$2$6\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n1#2:53\n*E\n"})
        public static final class f extends SuspendLambda implements x00.p<r0, j00.c<? super Result<? extends g2>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f87976a;

            /* renamed from: b, reason: collision with root package name */
            public int f87977b;

            /* renamed from: c, reason: collision with root package name */
            public int f87978c;

            /* renamed from: d, reason: collision with root package name */
            public /* synthetic */ Object f87979d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ g f87980e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(g gVar, j00.c<? super f> cVar) {
                super(2, cVar);
                this.f87980e = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                f fVar = new f(this.f87980e, cVar);
                fVar.f87979d = obj;
                return fVar;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(r0 r0Var, j00.c<? super Result<g2>> cVar) {
                return ((f) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object m6308constructorimpl;
                r0 r0Var = (r0) this.f87979d;
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f87978c;
                try {
                    if (i11 == 0) {
                        kotlin.e.n(obj);
                        g gVar = this.f87980e;
                        Result.a aVar = Result.Companion;
                        r6.a aVar2 = gVar.f87943e;
                        this.f87979d = l00.k.a(r0Var);
                        this.f87976a = l00.k.a(r0Var);
                        this.f87977b = 0;
                        this.f87978c = 1;
                        if (aVar2.b(this) == l11) {
                            return l11;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.e.n(obj);
                    }
                    m6308constructorimpl = Result.m6308constructorimpl(g2.f100423a);
                } catch (Throwable th2) {
                    Result.a aVar3 = Result.Companion;
                    m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
                }
                return Result.m6307boximpl(m6308constructorimpl);
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super Result<? extends g2>> cVar) {
                return invoke2(r0Var, (j00.c<? super Result<g2>>) cVar);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.uc.sync.compose.SyncCampaignUC$invoke$2$7", f = "SyncCampaignUC.kt", i = {0, 0, 0}, l = {40}, m = "invokeSuspend", n = {"$this$async", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-SyncCampaignUC$invoke$2$7$1"}, s = {"L$0", "L$1", "I$0"}, v = 1)
        @u0({"SMAP\nSyncCampaignUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SyncCampaignUC.kt\ncom/baicizhan/app/biz/game/uc/sync/compose/SyncCampaignUC$invoke$2$7\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n1#2:53\n*E\n"})
        /* renamed from: s6.g$a$g, reason: collision with other inner class name */
        public static final class C1149g extends SuspendLambda implements x00.p<r0, j00.c<? super Result<? extends g2>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f87981a;

            /* renamed from: b, reason: collision with root package name */
            public int f87982b;

            /* renamed from: c, reason: collision with root package name */
            public int f87983c;

            /* renamed from: d, reason: collision with root package name */
            public /* synthetic */ Object f87984d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ g f87985e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1149g(g gVar, j00.c<? super C1149g> cVar) {
                super(2, cVar);
                this.f87985e = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                C1149g c1149g = new C1149g(this.f87985e, cVar);
                c1149g.f87984d = obj;
                return c1149g;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(r0 r0Var, j00.c<? super Result<g2>> cVar) {
                return ((C1149g) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object m6308constructorimpl;
                r0 r0Var = (r0) this.f87984d;
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f87983c;
                try {
                    if (i11 == 0) {
                        kotlin.e.n(obj);
                        g gVar = this.f87985e;
                        Result.a aVar = Result.Companion;
                        com.baicizhan.app.biz.game.uc.incentive.a aVar2 = gVar.f87944f;
                        this.f87984d = l00.k.a(r0Var);
                        this.f87981a = l00.k.a(r0Var);
                        this.f87982b = 0;
                        this.f87983c = 1;
                        if (aVar2.a(this) == l11) {
                            return l11;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.e.n(obj);
                    }
                    m6308constructorimpl = Result.m6308constructorimpl(g2.f100423a);
                } catch (Throwable th2) {
                    Result.a aVar3 = Result.Companion;
                    m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
                }
                return Result.m6307boximpl(m6308constructorimpl);
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super Result<? extends g2>> cVar) {
                return invoke2(r0Var, (j00.c<? super Result<g2>>) cVar);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.uc.sync.compose.SyncCampaignUC$invoke$2$8", f = "SyncCampaignUC.kt", i = {0, 0, 0}, l = {41}, m = "invokeSuspend", n = {"$this$async", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-SyncCampaignUC$invoke$2$8$1"}, s = {"L$0", "L$1", "I$0"}, v = 1)
        @u0({"SMAP\nSyncCampaignUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SyncCampaignUC.kt\ncom/baicizhan/app/biz/game/uc/sync/compose/SyncCampaignUC$invoke$2$8\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n1#2:53\n*E\n"})
        public static final class h extends SuspendLambda implements x00.p<r0, j00.c<? super Result<? extends g2>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f87986a;

            /* renamed from: b, reason: collision with root package name */
            public int f87987b;

            /* renamed from: c, reason: collision with root package name */
            public int f87988c;

            /* renamed from: d, reason: collision with root package name */
            public /* synthetic */ Object f87989d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ g f87990e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(g gVar, j00.c<? super h> cVar) {
                super(2, cVar);
                this.f87990e = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                h hVar = new h(this.f87990e, cVar);
                hVar.f87989d = obj;
                return hVar;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(r0 r0Var, j00.c<? super Result<g2>> cVar) {
                return ((h) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object m6308constructorimpl;
                r0 r0Var = (r0) this.f87989d;
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f87988c;
                try {
                    if (i11 == 0) {
                        kotlin.e.n(obj);
                        g gVar = this.f87990e;
                        Result.a aVar = Result.Companion;
                        com.baicizhan.app.biz.game.uc.abtest.a aVar2 = gVar.f87946h;
                        this.f87989d = l00.k.a(r0Var);
                        this.f87986a = l00.k.a(r0Var);
                        this.f87987b = 0;
                        this.f87988c = 1;
                        if (aVar2.a(this) == l11) {
                            return l11;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.e.n(obj);
                    }
                    m6308constructorimpl = Result.m6308constructorimpl(g2.f100423a);
                } catch (Throwable th2) {
                    Result.a aVar3 = Result.Companion;
                    m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
                }
                return Result.m6307boximpl(m6308constructorimpl);
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super Result<? extends g2>> cVar) {
                return invoke2(r0Var, (j00.c<? super Result<g2>>) cVar);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.uc.sync.compose.SyncCampaignUC$invoke$2$9", f = "SyncCampaignUC.kt", i = {0, 0, 0}, l = {42}, m = "invokeSuspend", n = {"$this$async", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-SyncCampaignUC$invoke$2$9$1"}, s = {"L$0", "L$1", "I$0"}, v = 1)
        @u0({"SMAP\nSyncCampaignUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SyncCampaignUC.kt\ncom/baicizhan/app/biz/game/uc/sync/compose/SyncCampaignUC$invoke$2$9\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n1#2:53\n*E\n"})
        public static final class i extends SuspendLambda implements x00.p<r0, j00.c<? super Result<? extends g2>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f87991a;

            /* renamed from: b, reason: collision with root package name */
            public int f87992b;

            /* renamed from: c, reason: collision with root package name */
            public int f87993c;

            /* renamed from: d, reason: collision with root package name */
            public /* synthetic */ Object f87994d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ g f87995e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i(g gVar, j00.c<? super i> cVar) {
                super(2, cVar);
                this.f87995e = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                i iVar = new i(this.f87995e, cVar);
                iVar.f87994d = obj;
                return iVar;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(r0 r0Var, j00.c<? super Result<g2>> cVar) {
                return ((i) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object m6308constructorimpl;
                r0 r0Var = (r0) this.f87994d;
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f87993c;
                try {
                    if (i11 == 0) {
                        kotlin.e.n(obj);
                        g gVar = this.f87995e;
                        Result.a aVar = Result.Companion;
                        com.baicizhan.app.biz.game.uc.advertisement.a aVar2 = gVar.f87947i;
                        this.f87994d = l00.k.a(r0Var);
                        this.f87991a = l00.k.a(r0Var);
                        this.f87992b = 0;
                        this.f87993c = 1;
                        if (aVar2.a(this) == l11) {
                            return l11;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.e.n(obj);
                    }
                    m6308constructorimpl = Result.m6308constructorimpl(g2.f100423a);
                } catch (Throwable th2) {
                    Result.a aVar3 = Result.Companion;
                    m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
                }
                return Result.m6307boximpl(m6308constructorimpl);
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super Result<? extends g2>> cVar) {
                return invoke2(r0Var, (j00.c<? super Result<g2>>) cVar);
            }
        }

        public a(j00.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = g.this.new a(cVar);
            aVar.f87949b = obj;
            return aVar;
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            x0 b11;
            x0 b12;
            x0 b13;
            x0 b14;
            x0 b15;
            x0 b16;
            x0 b17;
            x0 b18;
            x0 b19;
            Object b21;
            r0 r0Var = (r0) this.f87949b;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f87948a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                b11 = c40.k.b(r0Var, null, null, new C1148a(g.this, null), 3, null);
                b12 = c40.k.b(r0Var, null, null, new b(g.this, null), 3, null);
                b13 = c40.k.b(r0Var, null, null, new c(g.this, null), 3, null);
                b14 = c40.k.b(r0Var, null, null, new d(g.this, null), 3, null);
                b15 = c40.k.b(r0Var, null, null, new e(g.this, null), 3, null);
                b16 = c40.k.b(r0Var, null, null, new f(g.this, null), 3, null);
                b17 = c40.k.b(r0Var, null, null, new C1149g(g.this, null), 3, null);
                b18 = c40.k.b(r0Var, null, null, new h(g.this, null), 3, null);
                b19 = c40.k.b(r0Var, null, null, new i(g.this, null), 3, null);
                this.f87949b = l00.k.a(r0Var);
                this.f87948a = 1;
                b21 = c40.f.b(new x0[]{b11, b12, b13, b14, b15, b16, b17, b18, b19}, this);
                if (b21 == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                b21 = obj;
            }
            Iterator it = ((Iterable) b21).iterator();
            while (it.hasNext()) {
                Object m6317unboximpl = ((Result) it.next()).m6317unboximpl();
                if (Result.m6314isFailureimpl(m6317unboximpl)) {
                    z6.b.f101032b.e(s6.h.f87996a, "sync failed", Result.m6311exceptionOrNullimpl(m6317unboximpl));
                }
            }
            return g2.f100423a;
        }
    }

    public g(@m80.k p5.f repo, @m80.k t5.a notifyRepo, @m80.k p fetchRankInfoUC, @m80.k com.baicizhan.app.biz.game.uc.monetization.c checkFetchPromotionUC, @m80.k r6.a checkFetchPurchasedBookUC, @m80.k com.baicizhan.app.biz.game.uc.incentive.a checkLavaQuestUC, @m80.k com.baicizhan.app.biz.game.uc.ipavatar.c fetchIpAvatarHomeUC, @m80.k com.baicizhan.app.biz.game.uc.abtest.a checkFetchABTestUC, @m80.k com.baicizhan.app.biz.game.uc.advertisement.a checkFetchTopAdUC) {
        g0.p(repo, "repo");
        g0.p(notifyRepo, "notifyRepo");
        g0.p(fetchRankInfoUC, "fetchRankInfoUC");
        g0.p(checkFetchPromotionUC, "checkFetchPromotionUC");
        g0.p(checkFetchPurchasedBookUC, "checkFetchPurchasedBookUC");
        g0.p(checkLavaQuestUC, "checkLavaQuestUC");
        g0.p(fetchIpAvatarHomeUC, "fetchIpAvatarHomeUC");
        g0.p(checkFetchABTestUC, "checkFetchABTestUC");
        g0.p(checkFetchTopAdUC, "checkFetchTopAdUC");
        this.f87939a = repo;
        this.f87940b = notifyRepo;
        this.f87941c = fetchRankInfoUC;
        this.f87942d = checkFetchPromotionUC;
        this.f87943e = checkFetchPurchasedBookUC;
        this.f87944f = checkLavaQuestUC;
        this.f87945g = fetchIpAvatarHomeUC;
        this.f87946h = checkFetchABTestUC;
        this.f87947i = checkFetchTopAdUC;
    }

    @m80.l
    public final Object j(@m80.k j00.c<? super g2> cVar) {
        Object g11 = s0.g(new a(null), cVar);
        return g11 == kotlin.coroutines.intrinsics.b.l() ? g11 : g2.f100423a;
    }
}
