package com.baicizhan.app.biz.game.uc.incentive;

import h5.o0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final p5.c f14614a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final b6.a f14615b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.incentive.ObserveRankUC", f = "ObserveRankUC.kt", i = {0, 0, 1, 1, 1, 2, 2, 2}, l = {43, 49, 57}, m = "getRankType", n = {"rankInfo", "curStatus", "rankInfo", "curStatus", "today", "rankInfo", "curStatus", "today"}, s = {"L$0", "I$0", "L$0", "I$0", "J$0", "L$0", "I$0", "J$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14616a;

        /* renamed from: b, reason: collision with root package name */
        public int f14617b;

        /* renamed from: c, reason: collision with root package name */
        public long f14618c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f14619d;

        /* renamed from: f, reason: collision with root package name */
        public int f14621f;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14619d = obj;
            this.f14621f |= Integer.MIN_VALUE;
            return o.this.d(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.incentive.ObserveRankUC", f = "ObserveRankUC.kt", i = {}, l = {25}, m = "invoke", n = {}, s = {}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14622a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14623b;

        /* renamed from: d, reason: collision with root package name */
        public int f14625d;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14623b = obj;
            this.f14625d |= Integer.MIN_VALUE;
            return o.this.e(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.incentive.ObserveRankUC$invoke$2", f = "ObserveRankUC.kt", i = {1, 2, 2}, l = {27, 28, 29}, m = "invokeSuspend", n = {"rankInfo", "rankInfo", "ban"}, s = {"L$0", "L$0", "Z$0"}, v = 1)
    public static final class c extends SuspendLambda implements x00.q<Boolean, Boolean, j00.c<? super o0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f14626a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f14627b;

        /* renamed from: c, reason: collision with root package name */
        public int f14628c;

        public c(j00.c<? super c> cVar) {
            super(3, cVar);
        }

        public final Object i(boolean z11, boolean z12, j00.c<? super o0> cVar) {
            return o.this.new c(cVar).invokeSuspend(g2.f100423a);
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, j00.c<? super o0> cVar) {
            return i(bool.booleanValue(), bool2.booleanValue(), cVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
        
            if (r10 == r0) goto L21;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r9.f14628c
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2f
                if (r1 == r4) goto L2b
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                boolean r0 = r9.f14627b
                java.lang.Object r1 = r9.f14626a
                z8.t r1 = (z8.t) r1
                kotlin.e.n(r10)
                goto L70
            L1b:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L23:
                java.lang.Object r1 = r9.f14626a
                z8.t r1 = (z8.t) r1
                kotlin.e.n(r10)
                goto L59
            L2b:
                kotlin.e.n(r10)
                goto L41
            L2f:
                kotlin.e.n(r10)
                com.baicizhan.app.biz.game.uc.incentive.o r10 = com.baicizhan.app.biz.game.uc.incentive.o.this
                p5.c r10 = com.baicizhan.app.biz.game.uc.incentive.o.a(r10)
                r9.f14628c = r4
                java.lang.Object r10 = r10.b(r9)
                if (r10 != r0) goto L41
                goto L6d
            L41:
                z8.t r10 = (z8.t) r10
                com.baicizhan.app.biz.game.uc.incentive.o r1 = com.baicizhan.app.biz.game.uc.incentive.o.this
                b6.a r1 = com.baicizhan.app.biz.game.uc.incentive.o.c(r1)
                com.baicizhan.app.biz.game.repo.userguide.UserGuideType r4 = com.baicizhan.app.biz.game.repo.userguide.UserGuideType.NewUserRankLocked
                r9.f14626a = r10
                r9.f14628c = r3
                java.lang.Object r1 = r1.e(r4, r9)
                if (r1 != r0) goto L56
                goto L6d
            L56:
                r8 = r1
                r1 = r10
                r10 = r8
            L59:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                com.baicizhan.app.biz.game.uc.incentive.o r3 = com.baicizhan.app.biz.game.uc.incentive.o.this
                r9.f14626a = r1
                r9.f14627b = r10
                r9.f14628c = r2
                java.lang.Object r2 = com.baicizhan.app.biz.game.uc.incentive.o.b(r3, r1, r9)
                if (r2 != r0) goto L6e
            L6d:
                return r0
            L6e:
                r0 = r10
                r10 = r2
            L70:
                com.baicizhan.app.biz.game.model.RankType r10 = (com.baicizhan.app.biz.game.model.RankType) r10
                z6.b r2 = z6.b.f101032b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "observeRankRepo: "
                r3.append(r4)
                r3.append(r1)
                java.lang.String r1 = ", rankType: "
                r3.append(r1)
                r3.append(r10)
                java.lang.String r1 = ", ban: "
                r3.append(r1)
                r3.append(r0)
                java.lang.String r4 = r3.toString()
                r6 = 4
                r7 = 0
                java.lang.String r3 = "ObserveRankUC"
                r5 = 0
                z6.b.j(r2, r3, r4, r5, r6, r7)
                h5.o0 r1 = new h5.o0
                r1.<init>(r10, r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.incentive.o.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public o(@m80.k p5.c rank, @m80.k b6.a userGuideRepo) {
        g0.p(rank, "rank");
        g0.p(userGuideRepo, "userGuideRepo");
        this.f14614a = rank;
        this.f14615b = userGuideRepo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0079, code lost:
    
        if (r9 == r1) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(z8.t r8, j00.c<? super com.baicizhan.app.biz.game.model.RankType> r9) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.incentive.o.d(z8.t, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(@m80.k j00.c<? super kotlinx.coroutines.flow.i<h5.o0>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.baicizhan.app.biz.game.uc.incentive.o.b
            if (r0 == 0) goto L13
            r0 = r6
            com.baicizhan.app.biz.game.uc.incentive.o$b r0 = (com.baicizhan.app.biz.game.uc.incentive.o.b) r0
            int r1 = r0.f14625d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14625d = r1
            goto L18
        L13:
            com.baicizhan.app.biz.game.uc.incentive.o$b r0 = new com.baicizhan.app.biz.game.uc.incentive.o$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f14623b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f14625d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f14622a
            kotlinx.coroutines.flow.i r0 = (kotlinx.coroutines.flow.i) r0
            kotlin.e.n(r6)
            goto L4e
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            kotlin.e.n(r6)
            p5.c r6 = r5.f14614a
            kotlinx.coroutines.flow.i r6 = r6.a()
            b6.a r2 = r5.f14615b
            r0.f14622a = r6
            r0.f14625d = r3
            java.lang.Object r0 = r2.g(r0)
            if (r0 != r1) goto L4b
            return r1
        L4b:
            r4 = r0
            r0 = r6
            r6 = r4
        L4e:
            kotlinx.coroutines.flow.i r6 = (kotlinx.coroutines.flow.i) r6
            com.baicizhan.app.biz.game.uc.incentive.o$c r1 = new com.baicizhan.app.biz.game.uc.incentive.o$c
            r2 = 0
            r1.<init>(r2)
            kotlinx.coroutines.flow.i r6 = kotlinx.coroutines.flow.k.I(r0, r6, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.incentive.o.e(j00.c):java.lang.Object");
    }
}
