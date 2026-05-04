package com.baicizhan.app.biz.game.uc.incentive;

import com.baicizhan.app.biz.game.model.LavaQuestState;
import com.baicizhan.app.biz.game.uc.abtest.GetABTestUC;
import com.baicizhan.online.playground_api.LavaquestGameInfo;
import h5.w;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
@u0({"SMAP\nObserveLavaQuestUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObserveLavaQuestUC.kt\ncom/baicizhan/app/biz/game/uc/incentive/ObserveLavaQuestUC\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,72:1\n49#2:73\n51#2:77\n46#3:74\n51#3:76\n105#4:75\n189#5:78\n*S KotlinDebug\n*F\n+ 1 ObserveLavaQuestUC.kt\ncom/baicizhan/app/biz/game/uc/incentive/ObserveLavaQuestUC\n*L\n36#1:73\n36#1:77\n36#1:74\n36#1:76\n36#1:75\n40#1:78\n*E\n"})
/* loaded from: classes3.dex */
public final class ObserveLavaQuestUC {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final p5.a f14441a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final b6.a f14442b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.incentive.a f14443c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final GetABTestUC f14444d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.incentive.ObserveLavaQuestUC", f = "ObserveLavaQuestUC.kt", i = {0, 0, 0, 0}, l = {48}, m = "createLavaQuestFlow", n = {"lava", "state", "noLifeEnable", "now"}, s = {"L$0", "L$1", "Z$0", "J$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14449a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14450b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f14451c;

        /* renamed from: d, reason: collision with root package name */
        public long f14452d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f14453e;

        /* renamed from: g, reason: collision with root package name */
        public int f14455g;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14453e = obj;
            this.f14455g |= Integer.MIN_VALUE;
            return ObserveLavaQuestUC.this.d(null, false, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.incentive.ObserveLavaQuestUC$createLavaQuestFlow$2", f = "ObserveLavaQuestUC.kt", i = {0, 1, 1, 2, 2, 2, 2, 3, 3}, l = {53, 58, 60, 64}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "fetchTime", "$this$flow", "$this$invokeSuspend_u24lambda_u240", "fetchTime", "$i$a$-runCatching-ObserveLavaQuestUC$createLavaQuestFlow$2$1", "$this$flow", "fetchTime"}, s = {"L$0", "L$0", "J$0", "L$0", "L$1", "J$0", "I$0", "L$0", "J$0"}, v = 1)
    public static final class b extends SuspendLambda implements x00.p<kotlinx.coroutines.flow.j<? super w>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f14456a;

        /* renamed from: b, reason: collision with root package name */
        public long f14457b;

        /* renamed from: c, reason: collision with root package name */
        public int f14458c;

        /* renamed from: d, reason: collision with root package name */
        public int f14459d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f14460e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ w f14461f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ LavaQuestState f14462g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ LavaquestGameInfo f14463h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ ObserveLavaQuestUC f14464i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(w wVar, LavaQuestState lavaQuestState, LavaquestGameInfo lavaquestGameInfo, ObserveLavaQuestUC observeLavaQuestUC, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f14461f = wVar;
            this.f14462g = lavaQuestState;
            this.f14463h = lavaquestGameInfo;
            this.f14464i = observeLavaQuestUC;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            b bVar = new b(this.f14461f, this.f14462g, this.f14463h, this.f14464i, cVar);
            bVar.f14460e = obj;
            return bVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x00c8, code lost:
        
            if (r0.emit(r11, r10) == r1) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0049, code lost:
        
            if (r0.emit(r11, r10) == r1) goto L44;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = r10.f14460e
                kotlinx.coroutines.flow.j r0 = (kotlinx.coroutines.flow.j) r0
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r10.f14459d
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r2 == 0) goto L3c
                if (r2 == r6) goto L38
                if (r2 == r5) goto L32
                if (r2 == r4) goto L25
                if (r2 != r3) goto L1d
                kotlin.e.n(r11)
                goto Lcb
            L1d:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L25:
                long r4 = r10.f14457b
                java.lang.Object r2 = r10.f14456a
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                kotlin.e.n(r11)     // Catch: java.lang.Throwable -> L2f
                goto L93
            L2f:
                r11 = move-exception
                goto L9c
            L32:
                long r5 = r10.f14457b
                kotlin.e.n(r11)
                goto L74
            L38:
                kotlin.e.n(r11)
                goto L4d
            L3c:
                kotlin.e.n(r11)
                h5.w r11 = r10.f14461f
                r10.f14460e = r0
                r10.f14459d = r6
                java.lang.Object r11 = r0.emit(r11, r10)
                if (r11 != r1) goto L4d
                goto Lca
            L4d:
                com.baicizhan.app.biz.game.model.LavaQuestState r11 = r10.f14462g
                com.baicizhan.app.biz.game.model.LavaQuestState r2 = com.baicizhan.app.biz.game.model.LavaQuestState.Active
                if (r11 != r2) goto Lcb
                com.baicizhan.online.playground_api.LavaquestGameInfo r11 = r10.f14463h
                long r6 = r11.end_time
                long r8 = w3.g.n()
                long r6 = r6 - r8
                r8 = 0
                int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r11 <= 0) goto Lcb
                r11 = 100
                long r8 = (long) r11
                long r8 = r8 + r6
                r10.f14460e = r0
                r10.f14457b = r6
                r10.f14459d = r5
                java.lang.Object r11 = c40.a1.b(r8, r10)
                if (r11 != r1) goto L73
                goto Lca
            L73:
                r5 = r6
            L74:
                com.baicizhan.app.biz.game.uc.incentive.ObserveLavaQuestUC r11 = r10.f14464i
                kotlin.Result$a r2 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L9a
                com.baicizhan.app.biz.game.uc.incentive.a r11 = com.baicizhan.app.biz.game.uc.incentive.ObserveLavaQuestUC.b(r11)     // Catch: java.lang.Throwable -> L9a
                r10.f14460e = r0     // Catch: java.lang.Throwable -> L9a
                java.lang.Object r2 = l00.k.a(r0)     // Catch: java.lang.Throwable -> L9a
                r10.f14456a = r2     // Catch: java.lang.Throwable -> L9a
                r10.f14457b = r5     // Catch: java.lang.Throwable -> L9a
                r2 = 0
                r10.f14458c = r2     // Catch: java.lang.Throwable -> L9a
                r10.f14459d = r4     // Catch: java.lang.Throwable -> L9a
                java.lang.Object r11 = r11.a(r10)     // Catch: java.lang.Throwable -> L9a
                if (r11 != r1) goto L92
                goto Lca
            L92:
                r4 = r5
            L93:
                yz.g2 r11 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L2f
                java.lang.Object r11 = kotlin.Result.m6308constructorimpl(r11)     // Catch: java.lang.Throwable -> L2f
                goto La6
            L9a:
                r11 = move-exception
                r4 = r5
            L9c:
                kotlin.Result$a r2 = kotlin.Result.Companion
                java.lang.Object r11 = kotlin.e.a(r11)
                java.lang.Object r11 = kotlin.Result.m6308constructorimpl(r11)
            La6:
                java.lang.Throwable r11 = kotlin.Result.m6311exceptionOrNullimpl(r11)
                if (r11 == 0) goto Lb5
                z6.b r2 = z6.b.f101032b
                java.lang.String r6 = "ObserveLavaQuestUC"
                java.lang.String r7 = "get lavaQuest failed"
                r2.e(r6, r7, r11)
            Lb5:
                h5.w r11 = r10.f14461f
                java.lang.Object r2 = l00.k.a(r0)
                r10.f14460e = r2
                r2 = 0
                r10.f14456a = r2
                r10.f14457b = r4
                r10.f14459d = r3
                java.lang.Object r11 = r0.emit(r11, r10)
                if (r11 != r1) goto Lcb
            Lca:
                return r1
            Lcb:
                yz.g2 r11 = yz.g2.f100423a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.incentive.ObserveLavaQuestUC.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // x00.p
        public final Object invoke(kotlinx.coroutines.flow.j<? super w> jVar, j00.c<? super g2> cVar) {
            return ((b) create(jVar, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.incentive.ObserveLavaQuestUC", f = "ObserveLavaQuestUC.kt", i = {}, l = {37, 37}, m = "invoke", n = {}, s = {}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14465a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14466b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f14467c;

        /* renamed from: e, reason: collision with root package name */
        public int f14469e;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14467c = obj;
            this.f14469e |= Integer.MIN_VALUE;
            return ObserveLavaQuestUC.this.e(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.incentive.ObserveLavaQuestUC$invoke$3", f = "ObserveLavaQuestUC.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class d extends SuspendLambda implements x00.r<LavaquestGameInfo, Boolean, Boolean, j00.c<? super Pair<? extends LavaquestGameInfo, ? extends Boolean>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14470a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14471b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ boolean f14472c;

        public d(j00.c<? super d> cVar) {
            super(4, cVar);
        }

        public final Object i(LavaquestGameInfo lavaquestGameInfo, boolean z11, boolean z12, j00.c<? super Pair<LavaquestGameInfo, Boolean>> cVar) {
            d dVar = new d(cVar);
            dVar.f14471b = lavaquestGameInfo;
            dVar.f14472c = z12;
            return dVar.invokeSuspend(g2.f100423a);
        }

        @Override // x00.r
        public /* bridge */ /* synthetic */ Object invoke(LavaquestGameInfo lavaquestGameInfo, Boolean bool, Boolean bool2, j00.c<? super Pair<? extends LavaquestGameInfo, ? extends Boolean>> cVar) {
            return i(lavaquestGameInfo, bool.booleanValue(), bool2.booleanValue(), cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LavaquestGameInfo lavaquestGameInfo = (LavaquestGameInfo) this.f14471b;
            boolean z11 = this.f14472c;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f14470a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            return new Pair(lavaquestGameInfo, l00.a.a(z11));
        }
    }

    public ObserveLavaQuestUC(@m80.k p5.a lavaQuestRepo, @m80.k b6.a userGuideRepo, @m80.k com.baicizhan.app.biz.game.uc.incentive.a checkFetchLavaQuestUC, @m80.k GetABTestUC getABTestUC) {
        g0.p(lavaQuestRepo, "lavaQuestRepo");
        g0.p(userGuideRepo, "userGuideRepo");
        g0.p(checkFetchLavaQuestUC, "checkFetchLavaQuestUC");
        g0.p(getABTestUC, "getABTestUC");
        this.f14441a = lavaQuestRepo;
        this.f14442b = userGuideRepo;
        this.f14443c = checkFetchLavaQuestUC;
        this.f14444d = getABTestUC;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.baicizhan.online.playground_api.LavaquestGameInfo r11, boolean r12, j00.c<? super kotlinx.coroutines.flow.i<h5.w>> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.baicizhan.app.biz.game.uc.incentive.ObserveLavaQuestUC.a
            if (r0 == 0) goto L13
            r0 = r13
            com.baicizhan.app.biz.game.uc.incentive.ObserveLavaQuestUC$a r0 = (com.baicizhan.app.biz.game.uc.incentive.ObserveLavaQuestUC.a) r0
            int r1 = r0.f14455g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14455g = r1
            goto L18
        L13:
            com.baicizhan.app.biz.game.uc.incentive.ObserveLavaQuestUC$a r0 = new com.baicizhan.app.biz.game.uc.incentive.ObserveLavaQuestUC$a
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f14453e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f14455g
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            boolean r12 = r0.f14451c
            java.lang.Object r11 = r0.f14450b
            com.baicizhan.app.biz.game.model.LavaQuestState r11 = (com.baicizhan.app.biz.game.model.LavaQuestState) r11
            java.lang.Object r0 = r0.f14449a
            com.baicizhan.online.playground_api.LavaquestGameInfo r0 = (com.baicizhan.online.playground_api.LavaquestGameInfo) r0
            kotlin.e.n(r13)
            r6 = r11
            r7 = r0
            goto L60
        L35:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3d:
            kotlin.e.n(r13)
            long r4 = w3.g.n()
            com.baicizhan.app.biz.game.model.LavaQuestState r13 = h5.r.a(r11, r4)
            b6.a r2 = r10.f14442b
            com.baicizhan.app.biz.game.repo.userguide.UserGuideType r6 = com.baicizhan.app.biz.game.repo.userguide.UserGuideType.NewUserLavaQuestLocked
            r0.f14449a = r11
            r0.f14450b = r13
            r0.f14451c = r12
            r0.f14452d = r4
            r0.f14455g = r3
            java.lang.Object r0 = r2.e(r6, r0)
            if (r0 != r1) goto L5d
            return r1
        L5d:
            r7 = r11
            r6 = r13
            r13 = r0
        L60:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r11 = r13.booleanValue()
            com.baicizhan.app.biz.game.model.LavaQuestState r13 = com.baicizhan.app.biz.game.model.LavaQuestState.Ready
            r0 = 0
            if (r6 != r13) goto L6f
            if (r12 == 0) goto L6f
            r12 = r3
            goto L70
        L6f:
            r12 = r0
        L70:
            h5.w r5 = new h5.w
            if (r11 != 0) goto L78
            if (r12 == 0) goto L77
            goto L78
        L77:
            r3 = r0
        L78:
            r5.<init>(r7, r6, r3)
            com.baicizhan.app.biz.game.uc.incentive.ObserveLavaQuestUC$b r4 = new com.baicizhan.app.biz.game.uc.incentive.ObserveLavaQuestUC$b
            r9 = 0
            r8 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            kotlinx.coroutines.flow.i r11 = kotlinx.coroutines.flow.k.K0(r4)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.incentive.ObserveLavaQuestUC.d(com.baicizhan.online.playground_api.LavaquestGameInfo, boolean, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(@m80.k j00.c<? super kotlinx.coroutines.flow.i<h5.w>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.baicizhan.app.biz.game.uc.incentive.ObserveLavaQuestUC.c
            if (r0 == 0) goto L13
            r0 = r8
            com.baicizhan.app.biz.game.uc.incentive.ObserveLavaQuestUC$c r0 = (com.baicizhan.app.biz.game.uc.incentive.ObserveLavaQuestUC.c) r0
            int r1 = r0.f14469e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14469e = r1
            goto L18
        L13:
            com.baicizhan.app.biz.game.uc.incentive.ObserveLavaQuestUC$c r0 = new com.baicizhan.app.biz.game.uc.incentive.ObserveLavaQuestUC$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f14467c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f14469e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r1 = r0.f14466b
            kotlinx.coroutines.flow.i r1 = (kotlinx.coroutines.flow.i) r1
            java.lang.Object r0 = r0.f14465a
            kotlinx.coroutines.flow.i r0 = (kotlinx.coroutines.flow.i) r0
            kotlin.e.n(r8)
            goto L80
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3c:
            java.lang.Object r2 = r0.f14465a
            kotlinx.coroutines.flow.i r2 = (kotlinx.coroutines.flow.i) r2
            kotlin.e.n(r8)
            goto L66
        L44:
            kotlin.e.n(r8)
            p5.a r8 = r7.f14441a
            kotlinx.coroutines.flow.i r8 = r8.a()
            com.baicizhan.app.biz.game.uc.incentive.ObserveLavaQuestUC$invoke$$inlined$map$1 r2 = new com.baicizhan.app.biz.game.uc.incentive.ObserveLavaQuestUC$invoke$$inlined$map$1
            r2.<init>()
            kotlinx.coroutines.flow.i r8 = kotlinx.coroutines.flow.k.v0(r2)
            b6.a r2 = r7.f14442b
            r0.f14465a = r8
            r0.f14469e = r4
            java.lang.Object r2 = r2.g(r0)
            if (r2 != r1) goto L63
            goto L7c
        L63:
            r6 = r2
            r2 = r8
            r8 = r6
        L66:
            kotlinx.coroutines.flow.i r8 = (kotlinx.coroutines.flow.i) r8
            com.baicizhan.app.biz.game.uc.abtest.GetABTestUC r4 = r7.f14444d
            h5.b r5 = h5.b.f58318a
            h5.a$a r5 = r5.b()
            r0.f14465a = r2
            r0.f14466b = r8
            r0.f14469e = r3
            java.lang.Object r0 = r4.m(r5, r0)
            if (r0 != r1) goto L7d
        L7c:
            return r1
        L7d:
            r1 = r8
            r8 = r0
            r0 = r2
        L80:
            kotlinx.coroutines.flow.i r8 = (kotlinx.coroutines.flow.i) r8
            kotlinx.coroutines.flow.i r8 = kotlinx.coroutines.flow.k.i0(r8)
            com.baicizhan.app.biz.game.uc.incentive.ObserveLavaQuestUC$d r2 = new com.baicizhan.app.biz.game.uc.incentive.ObserveLavaQuestUC$d
            r3 = 0
            r2.<init>(r3)
            kotlinx.coroutines.flow.i r8 = kotlinx.coroutines.flow.k.H(r0, r1, r8, r2)
            com.baicizhan.app.biz.game.uc.incentive.ObserveLavaQuestUC$invoke$$inlined$flatMapLatest$1 r0 = new com.baicizhan.app.biz.game.uc.incentive.ObserveLavaQuestUC$invoke$$inlined$flatMapLatest$1
            r0.<init>(r3, r7)
            kotlinx.coroutines.flow.i r8 = kotlinx.coroutines.flow.k.f2(r8, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.incentive.ObserveLavaQuestUC.e(j00.c):java.lang.Object");
    }
}
