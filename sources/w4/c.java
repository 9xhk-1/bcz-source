package w4;

import com.baicizhan.app.biz.game.model.RewardPackageType;
import h5.e0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
@u0({"SMAP\nBaseRewardCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseRewardCollector.kt\ncom/baicizhan/app/biz/game/impl/home/uieffect/BaseRewardCollector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,148:1\n1#2:149\n295#3,2:150\n295#3,2:152\n295#3,2:154\n*S KotlinDebug\n*F\n+ 1 BaseRewardCollector.kt\ncom/baicizhan/app/biz/game/impl/home/uieffect/BaseRewardCollector\n*L\n75#1:150,2\n89#1:152,2\n113#1:154,2\n*E\n"})
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final w5.a f94790a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final b6.a f94791b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.incentive.i f94792c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.incentive.c f94793d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.incentive.l f94794e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final p6.d f94795f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final v5.e f94796g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f94797a;

        static {
            int[] iArr = new int[RewardPackageType.values().length];
            try {
                iArr[RewardPackageType.WordsRound.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RewardPackageType.SentenceRound.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f94797a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.BaseRewardCollector", f = "BaseRewardCollector.kt", i = {1, 1, 1, 1, 1}, l = {112, 115}, m = "collectBoxRewardEffect$biz_release", n = {"wordsRound", "it", "$this$collectBoxRewardEffect_u24lambda_u241_u240", "$i$a$-let-BaseRewardCollector$collectBoxRewardEffect$2", "$i$a$-runCatching-BaseRewardCollector$collectBoxRewardEffect$2$rsp$1"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f94798a;

        /* renamed from: b, reason: collision with root package name */
        public Object f94799b;

        /* renamed from: c, reason: collision with root package name */
        public Object f94800c;

        /* renamed from: d, reason: collision with root package name */
        public int f94801d;

        /* renamed from: e, reason: collision with root package name */
        public int f94802e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f94803f;

        /* renamed from: h, reason: collision with root package name */
        public int f94805h;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f94803f = obj;
            this.f94805h |= Integer.MIN_VALUE;
            return c.this.d(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.BaseRewardCollector$collectBoxRewardEffect$2$1", f = "BaseRewardCollector.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: w4.c$c, reason: collision with other inner class name */
    public static final class C1275c extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f94806a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e0 f94808c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1275c(e0 e0Var, j00.c<? super C1275c> cVar) {
            super(1, cVar);
            this.f94808c = e0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return c.this.new C1275c(this.f94808c, cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super g2> cVar) {
            return ((C1275c) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f94806a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                w5.a aVar = c.this.f94790a;
                RewardPackageType f11 = this.f94808c.f();
                this.f94806a = 1;
                if (aVar.d(f11, this) == l11) {
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
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.BaseRewardCollector", f = "BaseRewardCollector.kt", i = {0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {74, 92, 93}, m = "collectRewardEffect$biz_release", n = {"rewardPackageType", "rewardPackageType", "wordsRound", "it", "url", "$i$a$-let-BaseRewardCollector$collectRewardEffect$2", "$i$a$-let-BaseRewardCollector$collectRewardEffect$2$3", "rewardPackageType", "wordsRound", "it", "url", "$i$a$-let-BaseRewardCollector$collectRewardEffect$2", "$i$a$-let-BaseRewardCollector$collectRewardEffect$2$3"}, s = {"L$0", "L$0", "L$1", "L$2", "L$4", "I$0", "I$1", "L$0", "L$1", "L$2", "L$4", "I$0", "I$1"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f94809a;

        /* renamed from: b, reason: collision with root package name */
        public Object f94810b;

        /* renamed from: c, reason: collision with root package name */
        public Object f94811c;

        /* renamed from: d, reason: collision with root package name */
        public Object f94812d;

        /* renamed from: e, reason: collision with root package name */
        public Object f94813e;

        /* renamed from: f, reason: collision with root package name */
        public int f94814f;

        /* renamed from: g, reason: collision with root package name */
        public int f94815g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f94816h;

        /* renamed from: j, reason: collision with root package name */
        public int f94818j;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f94816h = obj;
            this.f94818j |= Integer.MIN_VALUE;
            return c.this.e(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.BaseRewardCollector$collectRewardEffect$2$1", f = "BaseRewardCollector.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class e extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f94819a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e0 f94821c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e0 e0Var, j00.c<? super e> cVar) {
            super(1, cVar);
            this.f94821c = e0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return c.this.new e(this.f94821c, cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super g2> cVar) {
            return ((e) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f94819a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                w5.a aVar = c.this.f94790a;
                RewardPackageType f11 = this.f94821c.f();
                this.f94819a = 1;
                if (aVar.d(f11, this) == l11) {
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
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.BaseRewardCollector$collectRewardEffect$2$5", f = "BaseRewardCollector.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class f extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f94822a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e0 f94824c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e0 e0Var, j00.c<? super f> cVar) {
            super(1, cVar);
            this.f94824c = e0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return c.this.new f(this.f94824c, cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super g2> cVar) {
            return ((f) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f94822a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                w5.a aVar = c.this.f94790a;
                RewardPackageType f11 = this.f94824c.f();
                this.f94822a = 1;
                if (aVar.d(f11, this) == l11) {
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
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.BaseRewardCollector", f = "BaseRewardCollector.kt", i = {0, 0, 1, 1, 1, 1}, l = {47, 49}, m = "collectStreakEffect$biz_release", n = {"it", "$i$a$-takeIf-BaseRewardCollector$collectStreakEffect$2", "it", "$this$collectStreakEffect_u24lambda_u241_u240", "$i$a$-let-BaseRewardCollector$collectStreakEffect$3", "$i$a$-runCatching-BaseRewardCollector$collectStreakEffect$3$1"}, s = {"L$1", "I$0", "L$0", "L$1", "I$0", "I$1"}, v = 1)
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f94825a;

        /* renamed from: b, reason: collision with root package name */
        public Object f94826b;

        /* renamed from: c, reason: collision with root package name */
        public int f94827c;

        /* renamed from: d, reason: collision with root package name */
        public int f94828d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f94829e;

        /* renamed from: g, reason: collision with root package name */
        public int f94831g;

        public g(j00.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f94829e = obj;
            this.f94831g |= Integer.MIN_VALUE;
            return c.this.f(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.BaseRewardCollector$collectStreakEffect$3$1$1", f = "BaseRewardCollector.kt", i = {}, l = {58, 59}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class h extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f94832a;

        public h(j00.c<? super h> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return c.this.new h(cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super g2> cVar) {
            return ((h) create(cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
        
            if (r5.a(r4) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
        
            if (r5.a(r1, r4) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r4.f94832a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.e.n(r5)
                goto L41
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                kotlin.e.n(r5)
                goto L32
            L1e:
                kotlin.e.n(r5)
                w4.c r5 = w4.c.this
                b6.a r5 = w4.c.c(r5)
                com.baicizhan.app.biz.game.repo.userguide.UserGuideType r1 = com.baicizhan.app.biz.game.repo.userguide.UserGuideType.NewUserWinningLocked
                r4.f94832a = r3
                java.lang.Object r5 = r5.a(r1, r4)
                if (r5 != r0) goto L32
                goto L40
            L32:
                w4.c r5 = w4.c.this
                com.baicizhan.app.biz.game.uc.incentive.l r5 = w4.c.a(r5)
                r4.f94832a = r2
                java.lang.Object r5 = r5.a(r4)
                if (r5 != r0) goto L41
            L40:
                return r0
            L41:
                yz.g2 r5 = yz.g2.f100423a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: w4.c.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public c(@m80.k w5.a rewardRepo, @m80.k b6.a userGuide, @m80.k com.baicizhan.app.biz.game.uc.incentive.i getStreakTasksMileStoneUC, @m80.k com.baicizhan.app.biz.game.uc.incentive.c checkNeedShowStreakUC, @m80.k com.baicizhan.app.biz.game.uc.incentive.l markStreakShownUC, @m80.k p6.d calculateCurrentBookLearningProgressUC, @m80.k v5.e mediaFileRepo) {
        g0.p(rewardRepo, "rewardRepo");
        g0.p(userGuide, "userGuide");
        g0.p(getStreakTasksMileStoneUC, "getStreakTasksMileStoneUC");
        g0.p(checkNeedShowStreakUC, "checkNeedShowStreakUC");
        g0.p(markStreakShownUC, "markStreakShownUC");
        g0.p(calculateCurrentBookLearningProgressUC, "calculateCurrentBookLearningProgressUC");
        g0.p(mediaFileRepo, "mediaFileRepo");
        this.f94790a = rewardRepo;
        this.f94791b = userGuide;
        this.f94792c = getStreakTasksMileStoneUC;
        this.f94793d = checkNeedShowStreakUC;
        this.f94794e = markStreakShownUC;
        this.f94795f = calculateCurrentBookLearningProgressUC;
        this.f94796g = mediaFileRepo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0054, code lost:
    
        if (r14 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@m80.k j00.c<? super x4.a> r14) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.c.d(j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0161, code lost:
    
        if (r13 != null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0084, code lost:
    
        if (r14 == r1) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0198 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(@m80.k com.baicizhan.app.biz.game.model.RewardPackageType r13, @m80.k j00.c<? super x4.a> r14) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.c.e(com.baicizhan.app.biz.game.model.RewardPackageType, j00.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:(11:11|12|13|(1:15)|16|17|(1:19)|20|(1:22)|23|24)(2:27|28))(1:29))(3:39|(1:41)|36)|30|(1:32)|(3:34|(10:37|13|(0)|16|17|(0)|20|(0)|23|24)|36)(1:38)))|44|6|7|(0)(0)|30|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x003a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e2, code lost:
    
        r2 = kotlin.Result.Companion;
        r0 = kotlin.Result.m6308constructorimpl(kotlin.e.a(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c2 A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:12:0x0036, B:13:0x0090, B:15:0x00c2, B:16:0x00c6, B:34:0x0076), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076 A[Catch: all -> 0x003a, TRY_ENTER, TryCatch #0 {all -> 0x003a, blocks: (B:12:0x0036, B:13:0x0090, B:15:0x00c2, B:16:0x00c6, B:34:0x0076), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(@m80.k j00.c<? super x4.a> r19) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.c.f(j00.c):java.lang.Object");
    }

    public final int g(int i11) {
        z6.b.j(z6.b.f101032b, "BaseRewardCollector", "normalizeProgress, " + i11, null, 4, null);
        if (i11 >= 95) {
            return 100;
        }
        if (i11 >= 65) {
            return 70;
        }
        if (i11 >= 40) {
            return 50;
        }
        if (i11 >= 15) {
            return 20;
        }
        return i11 >= 8 ? 10 : 5;
    }
}
