package com.baicizhan.main.home.experiment.repo;

import androidx.compose.runtime.internal.StabilityInferred;
import c40.r0;
import c40.x0;
import com.baicizhan.online.game_api.EquipmentInfo;
import com.baicizhan.online.game_api.StudyHomeInfo;
import com.baicizhan.online.user_study_api.UserBasicInfoPlusV2;
import com.baicizhan.online.user_study_api.UserLimitInfoV2;
import javax.inject.Inject;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class x {

    /* renamed from: f, reason: collision with root package name */
    public static final int f21597f = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final s f21598a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final aa.a f21599b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.client.business.managers.winningstreak.a f21600c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final q9.x f21601d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final t f21602e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.experiment.repo.RefreshAllUC", f = "RefreshAllUC.kt", i = {0, 0}, l = {27}, m = "invoke", n = {"$this$invoke_u24lambda_u240", "$i$a$-runCatching-RefreshAllUC$invoke$2"}, s = {"L$0", "I$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f21603a;

        /* renamed from: b, reason: collision with root package name */
        public int f21604b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f21605c;

        /* renamed from: e, reason: collision with root package name */
        public int f21607e;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f21605c = obj;
            this.f21607e |= Integer.MIN_VALUE;
            return x.this.f(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.experiment.repo.RefreshAllUC$invoke$2$1", f = "RefreshAllUC.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {54, 59, 60}, m = "invokeSuspend", n = {"$this$coroutineScope", "homeAdAsync", "gameStudy", "basicInfo", "winning", "refreshBook", "$this$coroutineScope", "homeAdAsync", "gameStudy", "basicInfo", "winning", "refreshBook", "$this$coroutineScope", "homeAdAsync", "gameStudy", "basicInfo", "winning", "refreshBook"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 1)
    public static final class b extends SuspendLambda implements x00.p<r0, j00.c<? super a0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f21608a;

        /* renamed from: b, reason: collision with root package name */
        public Object f21609b;

        /* renamed from: c, reason: collision with root package name */
        public Object f21610c;

        /* renamed from: d, reason: collision with root package name */
        public Object f21611d;

        /* renamed from: e, reason: collision with root package name */
        public Object f21612e;

        /* renamed from: f, reason: collision with root package name */
        public Object f21613f;

        /* renamed from: g, reason: collision with root package name */
        public int f21614g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f21615h;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.home.experiment.repo.RefreshAllUC$invoke$2$1$basicInfo$1", f = "RefreshAllUC.kt", i = {0, 0, 0}, l = {36}, m = "invokeSuspend", n = {"$this$async", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-RefreshAllUC$invoke$2$1$basicInfo$1$1"}, s = {"L$0", "L$2", "I$0"}, v = 1)
        public static final class a extends SuspendLambda implements x00.p<r0, j00.c<? super Result<? extends UserBasicInfoPlusV2>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f21617a;

            /* renamed from: b, reason: collision with root package name */
            public Object f21618b;

            /* renamed from: c, reason: collision with root package name */
            public int f21619c;

            /* renamed from: d, reason: collision with root package name */
            public int f21620d;

            /* renamed from: e, reason: collision with root package name */
            public /* synthetic */ Object f21621e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ x f21622f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(x xVar, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f21622f = xVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                a aVar = new a(this.f21622f, cVar);
                aVar.f21621e = obj;
                return aVar;
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super Result<? extends UserBasicInfoPlusV2>> cVar) {
                return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object m6308constructorimpl;
                x xVar;
                r0 r0Var = (r0) this.f21621e;
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f21620d;
                try {
                    if (i11 == 0) {
                        kotlin.e.n(obj);
                        x xVar2 = this.f21622f;
                        Result.a aVar = Result.Companion;
                        s sVar = xVar2.f21598a;
                        this.f21621e = l00.k.a(r0Var);
                        this.f21617a = xVar2;
                        this.f21618b = l00.k.a(r0Var);
                        this.f21619c = 0;
                        this.f21620d = 1;
                        Object k11 = sVar.k(this);
                        if (k11 == l11) {
                            return l11;
                        }
                        xVar = xVar2;
                        obj = k11;
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        xVar = (x) this.f21617a;
                        kotlin.e.n(obj);
                    }
                    UserLimitInfoV2 userLimitInfoV2 = ((UserBasicInfoPlusV2) obj).limit_info;
                    if (userLimitInfoV2 != null) {
                        xVar.f21601d.C0(userLimitInfoV2);
                        xVar.f21599b.a(userLimitInfoV2.server_timestamp * 1000);
                    }
                    m6308constructorimpl = Result.m6308constructorimpl((UserBasicInfoPlusV2) obj);
                } catch (Throwable th2) {
                    Result.a aVar2 = Result.Companion;
                    m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
                }
                return Result.m6307boximpl(m6308constructorimpl);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.home.experiment.repo.RefreshAllUC$invoke$2$1$gameStudy$1", f = "RefreshAllUC.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        /* renamed from: com.baicizhan.main.home.experiment.repo.x$b$b, reason: collision with other inner class name */
        public static final class C0308b extends SuspendLambda implements x00.p<r0, j00.c<? super StudyHomeInfo>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f21623a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f21624b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0308b(x xVar, j00.c<? super C0308b> cVar) {
                super(2, cVar);
                this.f21624b = xVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new C0308b(this.f21624b, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super StudyHomeInfo> cVar) {
                return ((C0308b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f21623a;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                    return obj;
                }
                kotlin.e.n(obj);
                s sVar = this.f21624b.f21598a;
                this.f21623a = 1;
                Object m11 = sVar.m(this);
                return m11 == l11 ? l11 : m11;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.home.experiment.repo.RefreshAllUC$invoke$2$1$homeAdAsync$1", f = "RefreshAllUC.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class c extends SuspendLambda implements x00.p<r0, j00.c<? super EquipmentInfo>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f21625a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f21626b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(x xVar, j00.c<? super c> cVar) {
                super(2, cVar);
                this.f21626b = xVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new c(this.f21626b, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super EquipmentInfo> cVar) {
                return ((c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f21625a;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                    return obj;
                }
                kotlin.e.n(obj);
                s sVar = this.f21626b.f21598a;
                this.f21625a = 1;
                Object f11 = sVar.f(this);
                return f11 == l11 ? l11 : f11;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.home.experiment.repo.RefreshAllUC$invoke$2$1$refreshBook$1", f = "RefreshAllUC.kt", i = {}, l = {52, 52}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class d extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f21627a;

            /* renamed from: b, reason: collision with root package name */
            public int f21628b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ x f21629c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ x0<Result<UserBasicInfoPlusV2>> f21630d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public d(x xVar, x0<? extends Result<? extends UserBasicInfoPlusV2>> x0Var, j00.c<? super d> cVar) {
                super(2, cVar);
                this.f21629c = xVar;
                this.f21630d = x0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new d(this.f21629c, this.f21630d, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                return ((d) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
            
                if (r1.a((com.baicizhan.online.user_study_api.UserBasicInfoPlusV2) r6, r5) == r0) goto L18;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
            
                if (r6 == r0) goto L18;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r5.f21628b
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L22
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    kotlin.e.n(r6)
                    goto L53
                L12:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L1a:
                    java.lang.Object r1 = r5.f21627a
                    com.baicizhan.main.home.experiment.repo.t r1 = (com.baicizhan.main.home.experiment.repo.t) r1
                    kotlin.e.n(r6)
                    goto L38
                L22:
                    kotlin.e.n(r6)
                    com.baicizhan.main.home.experiment.repo.x r6 = r5.f21629c
                    com.baicizhan.main.home.experiment.repo.t r1 = com.baicizhan.main.home.experiment.repo.x.b(r6)
                    c40.x0<kotlin.Result<com.baicizhan.online.user_study_api.UserBasicInfoPlusV2>> r6 = r5.f21630d
                    r5.f21627a = r1
                    r5.f21628b = r3
                    java.lang.Object r6 = r6.i(r5)
                    if (r6 != r0) goto L38
                    goto L52
                L38:
                    kotlin.Result r6 = (kotlin.Result) r6
                    java.lang.Object r6 = r6.m6317unboximpl()
                    boolean r3 = kotlin.Result.m6314isFailureimpl(r6)
                    r4 = 0
                    if (r3 == 0) goto L46
                    r6 = r4
                L46:
                    com.baicizhan.online.user_study_api.UserBasicInfoPlusV2 r6 = (com.baicizhan.online.user_study_api.UserBasicInfoPlusV2) r6
                    r5.f21627a = r4
                    r5.f21628b = r2
                    java.lang.Object r6 = r1.a(r6, r5)
                    if (r6 != r0) goto L53
                L52:
                    return r0
                L53:
                    yz.g2 r6 = yz.g2.f100423a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.experiment.repo.x.b.d.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.home.experiment.repo.RefreshAllUC$invoke$2$1$winning$1", f = "RefreshAllUC.kt", i = {0, 0, 0}, l = {46}, m = "invokeSuspend", n = {"$this$async", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-RefreshAllUC$invoke$2$1$winning$1$1"}, s = {"L$0", "L$1", "I$0"}, v = 1)
        public static final class e extends SuspendLambda implements x00.p<r0, j00.c<? super Result<? extends g2>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f21631a;

            /* renamed from: b, reason: collision with root package name */
            public int f21632b;

            /* renamed from: c, reason: collision with root package name */
            public int f21633c;

            /* renamed from: d, reason: collision with root package name */
            public /* synthetic */ Object f21634d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ x f21635e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(x xVar, j00.c<? super e> cVar) {
                super(2, cVar);
                this.f21635e = xVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                e eVar = new e(this.f21635e, cVar);
                eVar.f21634d = obj;
                return eVar;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(r0 r0Var, j00.c<? super Result<g2>> cVar) {
                return ((e) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object m6308constructorimpl;
                r0 r0Var = (r0) this.f21634d;
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f21633c;
                try {
                    if (i11 == 0) {
                        kotlin.e.n(obj);
                        x xVar = this.f21635e;
                        Result.a aVar = Result.Companion;
                        kotlinx.coroutines.flow.i<Boolean> a11 = xVar.f21600c.a();
                        this.f21634d = l00.k.a(r0Var);
                        this.f21631a = l00.k.a(r0Var);
                        this.f21632b = 0;
                        this.f21633c = 1;
                        if (kotlinx.coroutines.flow.k.K1(a11, this) == l11) {
                            return l11;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.e.n(obj);
                    }
                    qb.c.i("RefreshAllUC", "", new Object[0]);
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

        public b(j00.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            b bVar = x.this.new b(cVar);
            bVar.f21615h = obj;
            return bVar;
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super a0> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0131, code lost:
        
            if (r8 == r1) goto L21;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 376
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.experiment.repo.x.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public x(@m80.k s iGameHomeRepo, @m80.k aa.a serverTime, @m80.k com.baicizhan.client.business.managers.winningstreak.a win, @m80.k q9.x studyMgr, @m80.k t iTmpRepo) {
        g0.p(iGameHomeRepo, "iGameHomeRepo");
        g0.p(serverTime, "serverTime");
        g0.p(win, "win");
        g0.p(studyMgr, "studyMgr");
        g0.p(iTmpRepo, "iTmpRepo");
        this.f21598a = iGameHomeRepo;
        this.f21599b = serverTime;
        this.f21600c = win;
        this.f21601d = studyMgr;
        this.f21602e = iTmpRepo;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:24|25))(3:26|27|(1:29))|12|13|(2:15|(2:17|18)(1:20))(2:21|22)))|32|6|7|(0)(0)|12|13|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x002d, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005b, code lost:
    
        r0 = kotlin.Result.Companion;
        r5 = kotlin.Result.m6308constructorimpl(kotlin.e.a(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(@m80.k j00.c<? super com.baicizhan.main.home.experiment.repo.a0> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.baicizhan.main.home.experiment.repo.x.a
            if (r0 == 0) goto L13
            r0 = r5
            com.baicizhan.main.home.experiment.repo.x$a r0 = (com.baicizhan.main.home.experiment.repo.x.a) r0
            int r1 = r0.f21607e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21607e = r1
            goto L18
        L13:
            com.baicizhan.main.home.experiment.repo.x$a r0 = new com.baicizhan.main.home.experiment.repo.x$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f21605c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f21607e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f21603a
            com.baicizhan.main.home.experiment.repo.x r0 = (com.baicizhan.main.home.experiment.repo.x) r0
            kotlin.e.n(r5)     // Catch: java.lang.Throwable -> L2d
            goto L54
        L2d:
            r5 = move-exception
            goto L5b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            kotlin.e.n(r5)
            kotlin.Result$a r5 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L2d
            com.baicizhan.main.home.experiment.repo.x$b r5 = new com.baicizhan.main.home.experiment.repo.x$b     // Catch: java.lang.Throwable -> L2d
            r2 = 0
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r2 = l00.k.a(r4)     // Catch: java.lang.Throwable -> L2d
            r0.f21603a = r2     // Catch: java.lang.Throwable -> L2d
            r2 = 0
            r0.f21604b = r2     // Catch: java.lang.Throwable -> L2d
            r0.f21607e = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r5 = c40.s0.g(r5, r0)     // Catch: java.lang.Throwable -> L2d
            if (r5 != r1) goto L54
            return r1
        L54:
            com.baicizhan.main.home.experiment.repo.a0 r5 = (com.baicizhan.main.home.experiment.repo.a0) r5     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r5 = kotlin.Result.m6308constructorimpl(r5)     // Catch: java.lang.Throwable -> L2d
            goto L65
        L5b:
            kotlin.Result$a r0 = kotlin.Result.Companion
            java.lang.Object r5 = kotlin.e.a(r5)
            java.lang.Object r5 = kotlin.Result.m6308constructorimpl(r5)
        L65:
            java.lang.Throwable r0 = kotlin.Result.m6311exceptionOrNullimpl(r5)
            if (r0 == 0) goto L78
            boolean r5 = r0 instanceof com.baicizhan.online.thrift.basic.LogicException
            if (r5 != 0) goto L77
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r0 = "网络错误，请点击重试"
            r5.<init>(r0)
            throw r5
        L77:
            throw r0
        L78:
            kotlin.e.n(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.experiment.repo.x.f(j00.c):java.lang.Object");
    }
}
