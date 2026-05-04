package com.baicizhan.app.biz.game.impl.home.words;

import c40.a1;
import c40.l2;
import c40.l3;
import c40.n0;
import c40.r0;
import com.baicizhan.app.api.service.GameType;
import com.baicizhan.app.biz.base.BizInternalException;
import com.baicizhan.app.biz.game.impl.home.uieffect.UIEffectStrategyType;
import com.baicizhan.app.biz.game.model.RankType;
import com.baicizhan.app.biz.game.uc.advertisement.ObserveTopAdUC;
import com.baicizhan.app.biz.game.uc.incentive.ObserveLavaQuestUC;
import com.baicizhan.app.biz.game.uc.incentive.ObserveStreakTasksUC;
import com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC;
import com.baicizhan.app.biz.game.uc.schedule.ObserveBookAndAdjustedDailyProgressUC;
import com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceEntranceUC;
import com.baicizhan.app.biz.game.uc.user.ObserveUserCurrentBookIdUC;
import com.baicizhan.app.biz.game.uc.user.ObserveUserGameInfoWithoutRewardUC;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.jiongji.andriod.card.R;
import h5.o0;
import h5.p0;
import h5.s0;
import h5.w0;
import k3.o4;
import k3.p4;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.c0;
import kotlinx.coroutines.flow.h0;
import kotlinx.coroutines.flow.m0;
import o6.d0;
import y4.a;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.c(binds = {p4.class})
@u0({"SMAP\nWordsHomeViewModelImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordsHomeViewModelImpl.kt\ncom/baicizhan/app/biz/game/impl/home/words/WordsHomeViewModelImpl\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n+ 5 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 6 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n+ 7 TimeMeasurer.kt\ncom/baicizhan/app/biz/base/TimeMeasurerKt\n+ 8 BizCatch.kt\ncom/baicizhan/app/biz/base/BizCatchKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,468:1\n41#2,6:469\n48#2:476\n142#3:475\n127#4:477\n47#5,4:478\n189#6:482\n189#6:509\n12#7,3:483\n15#7,10:498\n12#8,12:486\n1#9:508\n*S KotlinDebug\n*F\n+ 1 WordsHomeViewModelImpl.kt\ncom/baicizhan/app/biz/game/impl/home/words/WordsHomeViewModelImpl\n*L\n116#1:469,6\n116#1:476\n116#1:475\n116#1:477\n123#1:478,4\n129#1:482\n336#1:509\n-1#1:483,3\n-1#1:498,10\n-1#1:486,12\n*E\n"})
/* loaded from: classes3.dex */
public final class WordsHomeViewModelImpl implements p4, c4.j {

    @m80.k
    public final c0<l3.o> A;

    @m80.k
    public final u3.a<g2> B;

    @m80.k
    public final kotlinx.coroutines.flow.y<Integer> C;

    @m80.l
    public l2 D;

    @m80.k
    public final l3.g2 E;

    @m80.k
    public final l3.g2 F;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final y4.o f13945b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final d0 f13946c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final t6.c f13947d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final t6.e f13948e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final o6.q f13949f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final ObserveIpAvatarUC f13950g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final o6.v f13951h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final ObserveUserGameInfoWithoutRewardUC f13952i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final ObserveUserCurrentBookIdUC f13953j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final ObserveBookAndAdjustedDailyProgressUC f13954k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.incentive.o f13955l;

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public final ObserveStreakTasksUC f13956m;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public final t5.a f13957n;

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.incentive.r f13958o;

    /* renamed from: p, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.incentive.m f13959p;

    /* renamed from: q, reason: collision with root package name */
    @m80.k
    public final ObserveLavaQuestUC f13960q;

    /* renamed from: r, reason: collision with root package name */
    @m80.k
    public final ObserverSentenceEntranceUC f13961r;

    /* renamed from: s, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.incentive.j f13962s;

    /* renamed from: t, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.ipavatar.a f13963t;

    /* renamed from: u, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.ipavatar.i f13964u;

    /* renamed from: v, reason: collision with root package name */
    @m80.k
    public final ObserveTopAdUC f13965v;

    /* renamed from: w, reason: collision with root package name */
    @m80.k
    public final w4.j f13966w;

    /* renamed from: x, reason: collision with root package name */
    @m80.k
    public final kotlinx.coroutines.flow.y<Boolean> f13967x;

    /* renamed from: y, reason: collision with root package name */
    @m80.k
    public final r0 f13968y;

    /* renamed from: z, reason: collision with root package name */
    @m80.k
    public final m0<o4> f13969z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements l3.g2 {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$avatarClickAction$1", f = "WordsHomeViewModelImpl.kt", i = {0, 0}, l = {437}, m = "execute", n = {"$this$execute_u24lambda_u240", "$i$a$-runCatching-WordsHomeViewModelImpl$avatarClickAction$1$execute$2"}, s = {"L$0", "I$0"}, v = 1)
        /* renamed from: com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$a$a, reason: collision with other inner class name */
        public static final class C0202a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            public Object f13995a;

            /* renamed from: b, reason: collision with root package name */
            public int f13996b;

            /* renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f13997c;

            /* renamed from: e, reason: collision with root package name */
            public int f13999e;

            public C0202a(j00.c<? super C0202a> cVar) {
                super(cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f13997c = obj;
                this.f13999e |= Integer.MIN_VALUE;
                return a.this.a(this);
            }
        }

        public a() {
        }

        /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|26|6|7|(0)(0)|12|13|14) */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x002d, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
        
            r0 = kotlin.Result.Companion;
            kotlin.Result.m6308constructorimpl(kotlin.e.a(r0));
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        @Override // l3.g2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(j00.c<? super yz.g2> r9) {
            /*
                r8 = this;
                boolean r0 = r9 instanceof com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.a.C0202a
                if (r0 == 0) goto L13
                r0 = r9
                com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$a$a r0 = (com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.a.C0202a) r0
                int r1 = r0.f13999e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f13999e = r1
                goto L18
            L13:
                com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$a$a r0 = new com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$a$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f13997c
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.f13999e
                r3 = 1
                if (r2 == 0) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r0 = r0.f13995a
                com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$a r0 = (com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.a) r0
                kotlin.e.n(r9)     // Catch: java.lang.Throwable -> L2d
                goto L55
            L2d:
                r0 = move-exception
                r9 = r0
                goto L67
            L30:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L38:
                kotlin.e.n(r9)
                com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl r9 = com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.this
                kotlin.Result$a r2 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L2d
                t5.a r9 = com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.V2(r9)     // Catch: java.lang.Throwable -> L2d
                java.lang.Object r2 = l00.k.a(r8)     // Catch: java.lang.Throwable -> L2d
                r0.f13995a = r2     // Catch: java.lang.Throwable -> L2d
                r2 = 0
                r0.f13996b = r2     // Catch: java.lang.Throwable -> L2d
                r0.f13999e = r3     // Catch: java.lang.Throwable -> L2d
                java.lang.Object r9 = r9.f(r0)     // Catch: java.lang.Throwable -> L2d
                if (r9 != r1) goto L55
                return r1
            L55:
                z6.b r2 = z6.b.f101032b     // Catch: java.lang.Throwable -> L2d
                java.lang.String r3 = "WordsHomeViewModel"
                java.lang.String r4 = "avatar click: notification marked as read"
                r6 = 4
                r7 = 0
                r5 = 0
                z6.b.j(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L2d
                yz.g2 r9 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L2d
                kotlin.Result.m6308constructorimpl(r9)     // Catch: java.lang.Throwable -> L2d
                goto L70
            L67:
                kotlin.Result$a r0 = kotlin.Result.Companion
                java.lang.Object r9 = kotlin.e.a(r9)
                kotlin.Result.m6308constructorimpl(r9)
            L70:
                yz.g2 r9 = yz.g2.f100423a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.a.a(j00.c):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl", f = "WordsHomeViewModelImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {202}, m = "unLockStudyBuddy", n = {"tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-WordsHomeViewModelImpl$unLockStudyBuddy$2", "$i$f$bizCatch", "$i$a$-bizCatch-WordsHomeViewModelImpl$unLockStudyBuddy$2$1"}, s = {"L$0", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class a0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14000a;

        /* renamed from: b, reason: collision with root package name */
        public int f14001b;

        /* renamed from: c, reason: collision with root package name */
        public int f14002c;

        /* renamed from: d, reason: collision with root package name */
        public int f14003d;

        /* renamed from: e, reason: collision with root package name */
        public int f14004e;

        /* renamed from: f, reason: collision with root package name */
        public long f14005f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f14006g;

        /* renamed from: i, reason: collision with root package name */
        public int f14008i;

        public a0(j00.c<? super a0> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14006g = obj;
            this.f14008i |= Integer.MIN_VALUE;
            return WordsHomeViewModelImpl.this.f(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl", f = "WordsHomeViewModelImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {195}, m = "claimTravelReward", n = {"tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-WordsHomeViewModelImpl$claimTravelReward$2", "$i$f$bizCatch", "$i$a$-bizCatch-WordsHomeViewModelImpl$claimTravelReward$2$1"}, s = {"L$0", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14009a;

        /* renamed from: b, reason: collision with root package name */
        public int f14010b;

        /* renamed from: c, reason: collision with root package name */
        public int f14011c;

        /* renamed from: d, reason: collision with root package name */
        public int f14012d;

        /* renamed from: e, reason: collision with root package name */
        public int f14013e;

        /* renamed from: f, reason: collision with root package name */
        public long f14014f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f14015g;

        /* renamed from: i, reason: collision with root package name */
        public int f14017i;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14015g = obj;
            this.f14017i |= Integer.MIN_VALUE;
            return WordsHomeViewModelImpl.this.q(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$unLockStudyBuddy$2$1$1", f = "WordsHomeViewModelImpl.kt", i = {}, l = {203}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b0 extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14018a;

        public b0(j00.c<? super b0> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return WordsHomeViewModelImpl.this.new b0(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((b0) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f14018a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                w4.j jVar = WordsHomeViewModelImpl.this.f13966w;
                this.f14018a = 1;
                if (jVar.o(this) == l11) {
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
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$claimTravelReward$2$1$1", f = "WordsHomeViewModelImpl.kt", i = {}, l = {196}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class c extends SuspendLambda implements x00.p<r0, j00.c<? super l3.s>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14020a;

        public c(j00.c<? super c> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return WordsHomeViewModelImpl.this.new c(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super l3.s> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f14020a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                com.baicizhan.app.biz.game.uc.ipavatar.a aVar = WordsHomeViewModelImpl.this.f13963t;
                this.f14020a = 1;
                obj = aVar.i(this);
                if (obj == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            s0 s0Var = (s0) obj;
            return com.baicizhan.app.biz.game.impl.home.words.a.j(s0Var.h(), s0Var.g(), s0Var.f());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d implements l3.g2 {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$createEnterLavaQuestAction$1", f = "WordsHomeViewModelImpl.kt", i = {0, 0}, l = {426}, m = "execute", n = {"$this$execute_u24lambda_u240", "$i$a$-runCatching-WordsHomeViewModelImpl$createEnterLavaQuestAction$1$execute$2"}, s = {"L$0", "I$0"}, v = 1)
        public static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            public Object f14023a;

            /* renamed from: b, reason: collision with root package name */
            public int f14024b;

            /* renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f14025c;

            /* renamed from: e, reason: collision with root package name */
            public int f14027e;

            public a(j00.c<? super a> cVar) {
                super(cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f14025c = obj;
                this.f14027e |= Integer.MIN_VALUE;
                return d.this.a(this);
            }
        }

        public d() {
        }

        /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|26|6|7|(0)(0)|12|13|14) */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x002d, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
        
            r0 = kotlin.Result.Companion;
            kotlin.Result.m6308constructorimpl(kotlin.e.a(r0));
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        @Override // l3.g2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(j00.c<? super yz.g2> r9) {
            /*
                r8 = this;
                boolean r0 = r9 instanceof com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.d.a
                if (r0 == 0) goto L13
                r0 = r9
                com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$d$a r0 = (com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.d.a) r0
                int r1 = r0.f14027e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f14027e = r1
                goto L18
            L13:
                com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$d$a r0 = new com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$d$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f14025c
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.f14027e
                r3 = 1
                if (r2 == 0) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r0 = r0.f14023a
                com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$d r0 = (com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.d) r0
                kotlin.e.n(r9)     // Catch: java.lang.Throwable -> L2d
                goto L55
            L2d:
                r0 = move-exception
                r9 = r0
                goto L67
            L30:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L38:
                kotlin.e.n(r9)
                com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl r9 = com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.this
                kotlin.Result$a r2 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L2d
                com.baicizhan.app.biz.game.uc.incentive.j r9 = com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.T2(r9)     // Catch: java.lang.Throwable -> L2d
                java.lang.Object r2 = l00.k.a(r8)     // Catch: java.lang.Throwable -> L2d
                r0.f14023a = r2     // Catch: java.lang.Throwable -> L2d
                r2 = 0
                r0.f14024b = r2     // Catch: java.lang.Throwable -> L2d
                r0.f14027e = r3     // Catch: java.lang.Throwable -> L2d
                java.lang.Object r9 = r9.a(r0)     // Catch: java.lang.Throwable -> L2d
                if (r9 != r1) goto L55
                return r1
            L55:
                z6.b r2 = z6.b.f101032b     // Catch: java.lang.Throwable -> L2d
                java.lang.String r3 = "WordsHomeViewModel"
                java.lang.String r4 = "lava quest enter"
                r6 = 4
                r7 = 0
                r5 = 0
                z6.b.j(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L2d
                yz.g2 r9 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L2d
                kotlin.Result.m6308constructorimpl(r9)     // Catch: java.lang.Throwable -> L2d
                goto L70
            L67:
                kotlin.Result$a r0 = kotlin.Result.Companion
                java.lang.Object r9 = kotlin.e.a(r9)
                kotlin.Result.m6308constructorimpl(r9)
            L70:
                yz.g2 r9 = yz.g2.f100423a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.d.a(j00.c):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e implements l3.g2 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RankType f14029b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$createReadRankAction$1", f = "WordsHomeViewModelImpl.kt", i = {0, 0}, l = {404}, m = "execute", n = {"$this$execute_u24lambda_u240", "$i$a$-runCatching-WordsHomeViewModelImpl$createReadRankAction$1$execute$2"}, s = {"L$1", "I$0"}, v = 1)
        public static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            public Object f14030a;

            /* renamed from: b, reason: collision with root package name */
            public Object f14031b;

            /* renamed from: c, reason: collision with root package name */
            public int f14032c;

            /* renamed from: d, reason: collision with root package name */
            public /* synthetic */ Object f14033d;

            /* renamed from: f, reason: collision with root package name */
            public int f14035f;

            public a(j00.c<? super a> cVar) {
                super(cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f14033d = obj;
                this.f14035f |= Integer.MIN_VALUE;
                return e.this.a(this);
            }
        }

        public e(RankType rankType) {
            this.f14029b = rankType;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22)(1:23))|12|13|14))|27|6|7|(0)(0)|12|13|14) */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
        
            r0 = kotlin.Result.Companion;
            kotlin.Result.m6308constructorimpl(kotlin.e.a(r0));
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        @Override // l3.g2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(j00.c<? super yz.g2> r8) {
            /*
                r7 = this;
                boolean r0 = r8 instanceof com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.e.a
                if (r0 == 0) goto L13
                r0 = r8
                com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$e$a r0 = (com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.e.a) r0
                int r1 = r0.f14035f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f14035f = r1
                goto L18
            L13:
                com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$e$a r0 = new com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$e$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f14033d
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.f14035f
                r3 = 1
                if (r2 == 0) goto L3c
                if (r2 != r3) goto L34
                java.lang.Object r1 = r0.f14031b
                com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$e r1 = (com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.e) r1
                java.lang.Object r0 = r0.f14030a
                com.baicizhan.app.biz.game.model.RankType r0 = (com.baicizhan.app.biz.game.model.RankType) r0
                kotlin.e.n(r8)     // Catch: java.lang.Throwable -> L31
                goto L5e
            L31:
                r0 = move-exception
                r8 = r0
                goto L7f
            L34:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L3c:
                kotlin.e.n(r8)
                com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl r8 = com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.this
                com.baicizhan.app.biz.game.model.RankType r2 = r7.f14029b
                kotlin.Result$a r4 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L31
                com.baicizhan.app.biz.game.uc.incentive.r r8 = com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.h3(r8)     // Catch: java.lang.Throwable -> L31
                r0.f14030a = r2     // Catch: java.lang.Throwable -> L31
                java.lang.Object r4 = l00.k.a(r7)     // Catch: java.lang.Throwable -> L31
                r0.f14031b = r4     // Catch: java.lang.Throwable -> L31
                r4 = 0
                r0.f14032c = r4     // Catch: java.lang.Throwable -> L31
                r0.f14035f = r3     // Catch: java.lang.Throwable -> L31
                java.lang.Object r8 = r8.c(r2, r0)     // Catch: java.lang.Throwable -> L31
                if (r8 != r1) goto L5d
                return r1
            L5d:
                r0 = r2
            L5e:
                z6.b r1 = z6.b.f101032b     // Catch: java.lang.Throwable -> L31
                java.lang.String r2 = "WordsHomeViewModel"
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
                r8.<init>()     // Catch: java.lang.Throwable -> L31
                java.lang.String r3 = "readRank executed for rankType: "
                r8.append(r3)     // Catch: java.lang.Throwable -> L31
                r8.append(r0)     // Catch: java.lang.Throwable -> L31
                java.lang.String r3 = r8.toString()     // Catch: java.lang.Throwable -> L31
                r5 = 4
                r6 = 0
                r4 = 0
                z6.b.j(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L31
                yz.g2 r8 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L31
                kotlin.Result.m6308constructorimpl(r8)     // Catch: java.lang.Throwable -> L31
                goto L88
            L7f:
                kotlin.Result$a r0 = kotlin.Result.Companion
                java.lang.Object r8 = kotlin.e.a(r8)
                kotlin.Result.m6308constructorimpl(r8)
            L88:
                yz.g2 r8 = yz.g2.f100423a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.e.a(j00.c):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f implements l3.g2 {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$createTaskClickAction$1", f = "WordsHomeViewModelImpl.kt", i = {0, 0}, l = {416}, m = "execute", n = {"$this$execute_u24lambda_u240", "$i$a$-runCatching-WordsHomeViewModelImpl$createTaskClickAction$1$execute$2"}, s = {"L$0", "I$0"}, v = 1)
        public static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            public Object f14037a;

            /* renamed from: b, reason: collision with root package name */
            public int f14038b;

            /* renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f14039c;

            /* renamed from: e, reason: collision with root package name */
            public int f14041e;

            public a(j00.c<? super a> cVar) {
                super(cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f14039c = obj;
                this.f14041e |= Integer.MIN_VALUE;
                return f.this.a(this);
            }
        }

        public f() {
        }

        /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|25|6|7|(0)(0)|12|13|14) */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x002d, code lost:
        
            r5 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
        
            r0 = kotlin.Result.Companion;
            kotlin.Result.m6308constructorimpl(kotlin.e.a(r5));
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        @Override // l3.g2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(j00.c<? super yz.g2> r5) {
            /*
                r4 = this;
                boolean r0 = r5 instanceof com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.f.a
                if (r0 == 0) goto L13
                r0 = r5
                com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$f$a r0 = (com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.f.a) r0
                int r1 = r0.f14041e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f14041e = r1
                goto L18
            L13:
                com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$f$a r0 = new com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$f$a
                r0.<init>(r5)
            L18:
                java.lang.Object r5 = r0.f14039c
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.f14041e
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r0 = r0.f14037a
                com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$f r0 = (com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.f) r0
                kotlin.e.n(r5)     // Catch: java.lang.Throwable -> L2d
                goto L54
            L2d:
                r5 = move-exception
                goto L5a
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L37:
                kotlin.e.n(r5)
                com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl r5 = com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.this
                kotlin.Result$a r2 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L2d
                com.baicizhan.app.biz.game.uc.incentive.m r5 = com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.U2(r5)     // Catch: java.lang.Throwable -> L2d
                java.lang.Object r2 = l00.k.a(r4)     // Catch: java.lang.Throwable -> L2d
                r0.f14037a = r2     // Catch: java.lang.Throwable -> L2d
                r2 = 0
                r0.f14038b = r2     // Catch: java.lang.Throwable -> L2d
                r0.f14041e = r3     // Catch: java.lang.Throwable -> L2d
                java.lang.Object r5 = r5.b(r0)     // Catch: java.lang.Throwable -> L2d
                if (r5 != r1) goto L54
                return r1
            L54:
                yz.g2 r5 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L2d
                kotlin.Result.m6308constructorimpl(r5)     // Catch: java.lang.Throwable -> L2d
                goto L63
            L5a:
                kotlin.Result$a r0 = kotlin.Result.Companion
                java.lang.Object r5 = kotlin.e.a(r5)
                kotlin.Result.m6308constructorimpl(r5)
            L63:
                yz.g2 r5 = yz.g2.f100423a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.f.a(j00.c):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$enableDataSending$1", f = "WordsHomeViewModelImpl.kt", i = {}, l = {450}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class g extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14042a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f14043b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ WordsHomeViewModelImpl f14044c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(long j11, WordsHomeViewModelImpl wordsHomeViewModelImpl, j00.c<? super g> cVar) {
            super(2, cVar);
            this.f14043b = j11;
            this.f14044c = wordsHomeViewModelImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new g(this.f14043b, this.f14044c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((g) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f14042a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                long j11 = this.f14043b;
                this.f14042a = 1;
                if (a1.b(j11, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            this.f14044c.f13967x.setValue(l00.a.a(true));
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl", f = "WordsHomeViewModelImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {147}, m = "enterHome", n = {"tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-WordsHomeViewModelImpl$enterHome$2", "$i$f$bizCatch", "$i$a$-bizCatch-WordsHomeViewModelImpl$enterHome$2$1"}, s = {"L$0", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14045a;

        /* renamed from: b, reason: collision with root package name */
        public int f14046b;

        /* renamed from: c, reason: collision with root package name */
        public int f14047c;

        /* renamed from: d, reason: collision with root package name */
        public int f14048d;

        /* renamed from: e, reason: collision with root package name */
        public int f14049e;

        /* renamed from: f, reason: collision with root package name */
        public long f14050f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f14051g;

        /* renamed from: i, reason: collision with root package name */
        public int f14053i;

        public h(j00.c<? super h> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14051g = obj;
            this.f14053i |= Integer.MIN_VALUE;
            return WordsHomeViewModelImpl.this.c2(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$enterHome$2$1$1", f = "WordsHomeViewModelImpl.kt", i = {0, 1, 2}, l = {151, 153, 157}, m = "invokeSuspend", n = {"consumeEffectFirst", "consumeEffectFirst", "consumeEffectFirst"}, s = {"I$0", "I$0", "I$0"}, v = 1)
    public static final class i extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14054a;

        /* renamed from: b, reason: collision with root package name */
        public int f14055b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$enterHome$2$1$1$1", f = "WordsHomeViewModelImpl.kt", i = {}, l = {154}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f14057a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WordsHomeViewModelImpl f14058b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WordsHomeViewModelImpl wordsHomeViewModelImpl, j00.c<? super a> cVar) {
                super(1, cVar);
                this.f14058b = wordsHomeViewModelImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(j00.c<?> cVar) {
                return new a(this.f14058b, cVar);
            }

            @Override // x00.l
            public final Object invoke(j00.c<? super g2> cVar) {
                return ((a) create(cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f14057a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    WordsHomeViewModelImpl wordsHomeViewModelImpl = this.f14058b;
                    this.f14057a = 1;
                    if (wordsHomeViewModelImpl.F3(this) == l11) {
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

        public i(j00.c<? super i> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return WordsHomeViewModelImpl.this.new i(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((i) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x00af, code lost:
        
            if (r12.n(r11) == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x00b1, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x009c, code lost:
        
            if (r12.d(r4, r11) == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
        
            if (r12.n(r11) == r0) goto L23;
         */
        /* JADX WARN: Type inference failed for: r1v9, types: [boolean, int] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r11.f14055b
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2b
                if (r1 == r4) goto L25
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                kotlin.e.n(r12)
                goto Lb2
            L16:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1e:
                int r1 = r11.f14054a
                kotlin.e.n(r12)
                goto L9f
            L25:
                int r1 = r11.f14054a
                kotlin.e.n(r12)
                goto L86
            L2b:
                kotlin.e.n(r12)
                z6.b r5 = z6.b.f101032b
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r1 = "enterHome: starting, current state="
                r12.append(r1)
                com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl r1 = com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.this
                y4.o r1 = com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.j3(r1)
                kotlinx.coroutines.flow.m0 r1 = r1.b()
                java.lang.Object r1 = r1.getValue()
                java.lang.Class r1 = r1.getClass()
                h10.d r1 = kotlin.jvm.internal.o0.d(r1)
                java.lang.String r1 = r1.C()
                r12.append(r1)
                java.lang.String r7 = r12.toString()
                r9 = 4
                r10 = 0
                java.lang.String r6 = "WordsHomeViewModel"
                r8 = 0
                z6.b.d(r5, r6, r7, r8, r9, r10)
                com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl r12 = com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.this
                y4.o r12 = com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.j3(r12)
                kotlinx.coroutines.flow.m0 r12 = r12.b()
                java.lang.Object r12 = r12.getValue()
                boolean r1 = r12 instanceof k3.o4.a
                if (r1 == 0) goto L86
                com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl r12 = com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.this
                w4.j r12 = com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.l3(r12)
                r11.f14054a = r1
                r11.f14055b = r4
                java.lang.Object r12 = r12.n(r11)
                if (r12 != r0) goto L86
                goto Lb1
            L86:
                com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl r12 = com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.this
                u3.a r12 = com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.e3(r12)
                com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$i$a r4 = new com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$i$a
                com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl r5 = com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.this
                r6 = 0
                r4.<init>(r5, r6)
                r11.f14054a = r1
                r11.f14055b = r3
                java.lang.Object r12 = r12.d(r4, r11)
                if (r12 != r0) goto L9f
                goto Lb1
            L9f:
                if (r1 != 0) goto Lb2
                com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl r12 = com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.this
                w4.j r12 = com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.l3(r12)
                r11.f14054a = r1
                r11.f14055b = r2
                java.lang.Object r12 = r12.n(r11)
                if (r12 != r0) goto Lb2
            Lb1:
                return r0
            Lb2:
                z6.b r1 = z6.b.f101032b
                r5 = 4
                r6 = 0
                java.lang.String r2 = "WordsHomeViewModel"
                java.lang.String r3 = "enterHome: completed"
                r4 = 0
                z6.b.d(r1, r2, r3, r4, r5, r6)
                yz.g2 r12 = yz.g2.f100423a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl", f = "WordsHomeViewModelImpl.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3}, l = {R.styleable.Theme_drawable_test_nodate, R.styleable.Theme_drawable_time, R.styleable.Theme_drawable_walk_sound1, 261}, m = "fullRefresh", n = {"$this$fullRefresh_u24lambda_u240", "$this$fullRefresh_u24lambda_u240_u240", "$i$a$-runCatching-WordsHomeViewModelImpl$fullRefresh$2", "$i$a$-runCatching-WordsHomeViewModelImpl$fullRefresh$2$localResult$1", "$this$fullRefresh_u24lambda_u240", "$this$fullRefresh_u24lambda_u240_u242", "localResult", "$i$a$-runCatching-WordsHomeViewModelImpl$fullRefresh$2", "$i$a$-runCatching-WordsHomeViewModelImpl$fullRefresh$2$remoteResult$1", "$this$fullRefresh_u24lambda_u240", "remoteResult", "localResult", "$i$a$-runCatching-WordsHomeViewModelImpl$fullRefresh$2", "exception", "$i$a$-onFailure-WordsHomeViewModelImpl$fullRefresh$3"}, s = {"L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "L$1", "I$0"}, v = 1)
    public static final class j extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14059a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14060b;

        /* renamed from: c, reason: collision with root package name */
        public Object f14061c;

        /* renamed from: d, reason: collision with root package name */
        public int f14062d;

        /* renamed from: e, reason: collision with root package name */
        public int f14063e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f14064f;

        /* renamed from: h, reason: collision with root package name */
        public int f14066h;

        public j(j00.c<? super j> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14064f = obj;
            this.f14066h |= Integer.MIN_VALUE;
            return WordsHomeViewModelImpl.this.y3(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl", f = "WordsHomeViewModelImpl.kt", i = {0, 0, 1, 1}, l = {275, 278}, m = "incrementalRefresh", n = {"$this$incrementalRefresh_u24lambda_u240", "$i$a$-runCatching-WordsHomeViewModelImpl$incrementalRefresh$2", "it", "$i$a$-onFailure-WordsHomeViewModelImpl$incrementalRefresh$3"}, s = {"L$0", "I$0", "L$1", "I$0"}, v = 1)
    public static final class k extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14067a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14068b;

        /* renamed from: c, reason: collision with root package name */
        public int f14069c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f14070d;

        /* renamed from: f, reason: collision with root package name */
        public int f14072f;

        public k(j00.c<? super k> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14070d = obj;
            this.f14072f |= Integer.MIN_VALUE;
            return WordsHomeViewModelImpl.this.B3(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl", f = "WordsHomeViewModelImpl.kt", i = {1, 2}, l = {266, 268, 269}, m = "init", n = {"bookId", "bookId"}, s = {"J$0", "J$0"}, v = 1)
    public static final class l extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f14073a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14074b;

        /* renamed from: d, reason: collision with root package name */
        public int f14076d;

        public l(j00.c<? super l> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14074b = obj;
            this.f14076d |= Integer.MIN_VALUE;
            return WordsHomeViewModelImpl.this.C3(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl", f = "WordsHomeViewModelImpl.kt", i = {0, 1, 2, 3, 4, 5, 6, 7, 7, 7}, l = {286, 287, 288, 289, 292, 293, PullToRefreshBase.J, 326}, m = "loadInitialData", n = {"bookId", "bookId", "bookId", "bookId", "bookId", "bookId", "bookId", "it", "bookId", "$i$a$-also-WordsHomeViewModelImpl$loadInitialData$4"}, s = {"J$0", "J$0", "J$0", "J$0", "J$0", "J$0", "J$0", "L$1", "J$0", "I$0"}, v = 1)
    public static final class m extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f14077a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14078b;

        /* renamed from: c, reason: collision with root package name */
        public Object f14079c;

        /* renamed from: d, reason: collision with root package name */
        public Object f14080d;

        /* renamed from: e, reason: collision with root package name */
        public Object f14081e;

        /* renamed from: f, reason: collision with root package name */
        public Object f14082f;

        /* renamed from: g, reason: collision with root package name */
        public int f14083g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f14084h;

        /* renamed from: j, reason: collision with root package name */
        public int f14086j;

        public m(j00.c<? super m> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14084h = obj;
            this.f14086j |= Integer.MIN_VALUE;
            return WordsHomeViewModelImpl.this.D3(0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$loadInitialData$2", f = "WordsHomeViewModelImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class n extends SuspendLambda implements x00.r<h5.a1, o0, h5.z, j00.c<? super Triple<? extends h5.a1, ? extends o0, ? extends h5.z>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14087a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14088b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f14089c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f14090d;

        public n(j00.c<? super n> cVar) {
            super(4, cVar);
        }

        @Override // x00.r
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(h5.a1 a1Var, o0 o0Var, h5.z zVar, j00.c<? super Triple<h5.a1, o0, h5.z>> cVar) {
            n nVar = new n(cVar);
            nVar.f14088b = a1Var;
            nVar.f14089c = o0Var;
            nVar.f14090d = zVar;
            return nVar.invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            h5.a1 a1Var = (h5.a1) this.f14088b;
            o0 o0Var = (o0) this.f14089c;
            h5.z zVar = (h5.z) this.f14090d;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f14087a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            z6.b.d(z6.b.f101032b, com.baicizhan.app.biz.game.impl.home.words.d.f14151a, "loadInitialData: w r n", null, 4, null);
            return new Triple(a1Var, o0Var, zVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$loadInitialData$3", f = "WordsHomeViewModelImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class o extends SuspendLambda implements x00.t<h5.s, p0, w0, Pair<? extends h5.j, ? extends Pair<? extends Integer, ? extends Integer>>, Triple<? extends h5.a1, ? extends o0, ? extends h5.z>, j00.c<? super a.b>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14091a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14092b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f14093c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f14094d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f14095e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f14096f;

        public o(j00.c<? super o> cVar) {
            super(6, cVar);
        }

        @Override // x00.t
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(h5.s sVar, p0 p0Var, w0 w0Var, Pair<h5.j, Pair<Integer, Integer>> pair, Triple<h5.a1, o0, h5.z> triple, j00.c<? super a.b> cVar) {
            o oVar = WordsHomeViewModelImpl.this.new o(cVar);
            oVar.f14092b = sVar;
            oVar.f14093c = p0Var;
            oVar.f14094d = w0Var;
            oVar.f14095e = pair;
            oVar.f14096f = triple;
            return oVar.invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            h5.s sVar = (h5.s) this.f14092b;
            p0 p0Var = (p0) this.f14093c;
            w0 w0Var = (w0) this.f14094d;
            Pair pair = (Pair) this.f14095e;
            Triple triple = (Triple) this.f14096f;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f14091a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            h5.a1 a1Var = (h5.a1) triple.component1();
            o0 o0Var = (o0) triple.component2();
            h5.z zVar = (h5.z) triple.component3();
            return new a.b(com.baicizhan.app.biz.game.impl.home.words.b.k(sVar, p0Var, w0Var, (h5.j) pair.getFirst(), (Pair) pair.getSecond(), a1Var, o0Var, WordsHomeViewModelImpl.this.u3(o0Var.f()), WordsHomeViewModelImpl.this.v3(), zVar, WordsHomeViewModelImpl.this.F, w3.g.n(), null));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$observeDataUpdates$2$3", f = "WordsHomeViewModelImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class p extends SuspendLambda implements x00.q<w0, Integer, j00.c<? super a.l>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14098a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14099b;

        public p(j00.c<? super p> cVar) {
            super(3, cVar);
        }

        public final Object i(w0 w0Var, int i11, j00.c<? super a.l> cVar) {
            p pVar = new p(cVar);
            pVar.f14099b = w0Var;
            return pVar.invokeSuspend(g2.f100423a);
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ Object invoke(w0 w0Var, Integer num, j00.c<? super a.l> cVar) {
            return i(w0Var, num.intValue(), cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            w0 w0Var = (w0) this.f14099b;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f14098a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            return new a.l(w0Var, w3.g.n());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class q implements l3.g2 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l<j00.c<? super g2>, Object> f14100a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ WordsHomeViewModelImpl f14101b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$observeDataUpdates$2$9$1", f = "WordsHomeViewModelImpl.kt", i = {}, l = {369, 370}, m = "execute", n = {}, s = {}, v = 1)
        public static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f14102a;

            /* renamed from: c, reason: collision with root package name */
            public int f14104c;

            public a(j00.c<? super a> cVar) {
                super(cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f14102a = obj;
                this.f14104c |= Integer.MIN_VALUE;
                return q.this.a(this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public q(x00.l<? super j00.c<? super g2>, ? extends Object> lVar, WordsHomeViewModelImpl wordsHomeViewModelImpl) {
            this.f14100a = lVar;
            this.f14101b = wordsHomeViewModelImpl;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
        
            if (r6.b(r0) != r1) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
        
            if (r6.invoke(r0) == r1) goto L21;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // l3.g2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(j00.c<? super yz.g2> r6) {
            /*
                r5 = this;
                boolean r0 = r6 instanceof com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.q.a
                if (r0 == 0) goto L13
                r0 = r6
                com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$q$a r0 = (com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.q.a) r0
                int r1 = r0.f14104c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f14104c = r1
                goto L18
            L13:
                com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$q$a r0 = new com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$q$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f14102a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.f14104c
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.e.n(r6)
                goto L55
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L34:
                kotlin.e.n(r6)
                goto L46
            L38:
                kotlin.e.n(r6)
                x00.l<j00.c<? super yz.g2>, java.lang.Object> r6 = r5.f14100a
                r0.f14104c = r4
                java.lang.Object r6 = r6.invoke(r0)
                if (r6 != r1) goto L46
                goto L54
            L46:
                com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl r6 = r5.f14101b
                w4.j r6 = com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.l3(r6)
                r0.f14104c = r3
                java.lang.Object r6 = r6.b(r0)
                if (r6 != r1) goto L55
            L54:
                return r1
            L55:
                yz.g2 r6 = yz.g2.f100423a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.q.a(j00.c):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$observeDataUpdates$3", f = "WordsHomeViewModelImpl.kt", i = {0}, l = {376}, m = "invokeSuspend", n = {"it"}, s = {"L$0"}, v = 1)
    public static final class r extends SuspendLambda implements x00.p<y4.a, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14105a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14106b;

        public r(j00.c<? super r> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            r rVar = WordsHomeViewModelImpl.this.new r(cVar);
            rVar.f14106b = obj;
            return rVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(y4.a aVar, j00.c<? super g2> cVar) {
            return ((r) create(aVar, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            y4.a aVar = (y4.a) this.f14106b;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f14105a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                y4.o oVar = WordsHomeViewModelImpl.this.f13945b;
                this.f14106b = l00.k.a(aVar);
                this.f14105a = 1;
                if (oVar.a(aVar, this) == l11) {
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
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$observeDataUpdates$4", f = "WordsHomeViewModelImpl.kt", i = {0}, l = {382}, m = "invokeSuspend", n = {"it"}, s = {"L$0"}, v = 1)
    public static final class s extends SuspendLambda implements x00.q<kotlinx.coroutines.flow.j<? super y4.a>, Throwable, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14108a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14109b;

        public s(j00.c<? super s> cVar) {
            super(3, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th2 = (Throwable) this.f14109b;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f14108a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                z6.b.f101032b.e(com.baicizhan.app.biz.game.impl.home.words.d.f14151a, "observeDataUpdates: data binding error", th2);
                WordsHomeViewModelImpl.this.D = null;
                y4.o oVar = WordsHomeViewModelImpl.this.f13945b;
                a.C1343a c1343a = new a.C1343a(th2, WordsHomeViewModelImpl.this.E);
                this.f14109b = l00.k.a(th2);
                this.f14108a = 1;
                if (oVar.a(c1343a, this) == l11) {
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

        @Override // x00.q
        public final Object invoke(kotlinx.coroutines.flow.j<? super y4.a> jVar, Throwable th2, j00.c<? super g2> cVar) {
            s sVar = WordsHomeViewModelImpl.this.new s(cVar);
            sVar.f14109b = th2;
            return sVar.invokeSuspend(g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl", f = "WordsHomeViewModelImpl.kt", i = {0, 1}, l = {R.styleable.Theme_drawable_tab_friends_new, R.styleable.Theme_drawable_tab_lecture}, m = "refreshData", n = {"isContent", "isContent"}, s = {"I$0", "I$0"}, v = 1)
    public static final class t extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f14111a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14112b;

        /* renamed from: d, reason: collision with root package name */
        public int f14114d;

        public t(j00.c<? super t> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14112b = obj;
            this.f14114d |= Integer.MIN_VALUE;
            return WordsHomeViewModelImpl.this.F3(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class u implements l3.g2 {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$retry$1", f = "WordsHomeViewModelImpl.kt", i = {1, 1}, l = {392, 394}, m = "execute", n = {"$this$execute_u24lambda_u240", "$i$a$-runCatching-WordsHomeViewModelImpl$retry$1$execute$2"}, s = {"L$0", "I$0"}, v = 1)
        public static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            public Object f14116a;

            /* renamed from: b, reason: collision with root package name */
            public int f14117b;

            /* renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f14118c;

            /* renamed from: e, reason: collision with root package name */
            public int f14120e;

            public a(j00.c<? super a> cVar) {
                super(cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f14118c = obj;
                this.f14120e |= Integer.MIN_VALUE;
                return u.this.a(this);
            }
        }

        public u() {
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:(5:11|12|13|14|15)(2:18|19))(1:20))(1:25)|21|22))|30|6|7|(0)(0)|21|22) */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
        
            if (r12.c2(r0) != r1) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
        
            if (r12.a(r2, r0) == r1) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0030, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
        
            r0 = kotlin.Result.Companion;
            kotlin.Result.m6308constructorimpl(kotlin.e.a(r0));
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
        @Override // l3.g2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(j00.c<? super yz.g2> r12) {
            /*
                r11 = this;
                boolean r0 = r12 instanceof com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.u.a
                if (r0 == 0) goto L13
                r0 = r12
                com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$u$a r0 = (com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.u.a) r0
                int r1 = r0.f14120e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f14120e = r1
                goto L18
            L13:
                com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$u$a r0 = new com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$u$a
                r0.<init>(r12)
            L18:
                java.lang.Object r12 = r0.f14118c
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.f14120e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3f
                if (r2 == r4) goto L3b
                if (r2 != r3) goto L33
                java.lang.Object r0 = r0.f14116a
                com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$u r0 = (com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.u) r0
                kotlin.e.n(r12)     // Catch: java.lang.Throwable -> L30
                goto L75
            L30:
                r0 = move-exception
                r12 = r0
                goto L7b
            L33:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L3b:
                kotlin.e.n(r12)
                goto L5f
            L3f:
                kotlin.e.n(r12)
                z6.b r5 = z6.b.f101032b
                r9 = 4
                r10 = 0
                java.lang.String r6 = "WordsHomeViewModel"
                java.lang.String r7 = "retry: executing"
                r8 = 0
                z6.b.d(r5, r6, r7, r8, r9, r10)
                com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl r12 = com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.this
                y4.o r12 = com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.j3(r12)
                y4.a$c r2 = y4.a.c.f99234a
                r0.f14120e = r4
                java.lang.Object r12 = r12.a(r2, r0)
                if (r12 != r1) goto L5f
                goto L74
            L5f:
                com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl r12 = com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.this
                kotlin.Result$a r2 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L30
                java.lang.Object r2 = l00.k.a(r11)     // Catch: java.lang.Throwable -> L30
                r0.f14116a = r2     // Catch: java.lang.Throwable -> L30
                r2 = 0
                r0.f14117b = r2     // Catch: java.lang.Throwable -> L30
                r0.f14120e = r3     // Catch: java.lang.Throwable -> L30
                java.lang.Object r12 = r12.c2(r0)     // Catch: java.lang.Throwable -> L30
                if (r12 != r1) goto L75
            L74:
                return r1
            L75:
                yz.g2 r12 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L30
                kotlin.Result.m6308constructorimpl(r12)     // Catch: java.lang.Throwable -> L30
                goto L84
            L7b:
                kotlin.Result$a r0 = kotlin.Result.Companion
                java.lang.Object r12 = kotlin.e.a(r12)
                kotlin.Result.m6308constructorimpl(r12)
            L84:
                yz.g2 r12 = yz.g2.f100423a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.u.a(j00.c):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 WordsHomeViewModelImpl.kt\ncom/baicizhan/app/biz/game/impl/home/words/WordsHomeViewModelImpl\n*L\n1#1,49:1\n124#2,2:50\n*E\n"})
    public static final class v extends kotlin.coroutines.a implements n0 {
        public v(n0.b bVar) {
            super(bVar);
        }

        @Override // c40.n0
        public void handleException(kotlin.coroutines.d dVar, Throwable th2) {
            z6.b.f101032b.e(com.baicizhan.app.biz.game.impl.home.words.d.f14151a, "Uncaught exception in viewModelScope", th2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl", f = "WordsHomeViewModelImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {164}, m = "startGame", n = {"gameType", "tag$iv", "unitNo", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-WordsHomeViewModelImpl$startGame$2", "$i$f$bizCatch", "$i$a$-bizCatch-WordsHomeViewModelImpl$startGame$2$1"}, s = {"L$0", "L$1", "I$0", "I$1", "J$0", "I$2", "I$3", "I$4"}, v = 1)
    public static final class w extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14121a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14122b;

        /* renamed from: c, reason: collision with root package name */
        public int f14123c;

        /* renamed from: d, reason: collision with root package name */
        public int f14124d;

        /* renamed from: e, reason: collision with root package name */
        public int f14125e;

        /* renamed from: f, reason: collision with root package name */
        public int f14126f;

        /* renamed from: g, reason: collision with root package name */
        public int f14127g;

        /* renamed from: h, reason: collision with root package name */
        public long f14128h;

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f14129i;

        /* renamed from: k, reason: collision with root package name */
        public int f14131k;

        public w(j00.c<? super w> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14129i = obj;
            this.f14131k |= Integer.MIN_VALUE;
            return WordsHomeViewModelImpl.this.y0(null, 0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$startGame$2$1$1", f = "WordsHomeViewModelImpl.kt", i = {0, 0}, l = {168}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-WordsHomeViewModelImpl$startGame$2$1$1$result$1"}, s = {"L$0", "I$0"}, v = 1)
    public static final class x extends SuspendLambda implements x00.l<j00.c<? super Integer>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f14132a;

        /* renamed from: b, reason: collision with root package name */
        public int f14133b;

        /* renamed from: c, reason: collision with root package name */
        public int f14134c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ GameType f14135d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ WordsHomeViewModelImpl f14136e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f14137f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(GameType gameType, WordsHomeViewModelImpl wordsHomeViewModelImpl, int i11, j00.c<? super x> cVar) {
            super(1, cVar);
            this.f14135d = gameType;
            this.f14136e = wordsHomeViewModelImpl;
            this.f14137f = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return new x(this.f14135d, this.f14136e, this.f14137f, cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super Integer> cVar) {
            return ((x) create(cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00ac  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r12.f14134c
                r2 = 1
                if (r1 == 0) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r0 = r12.f14132a
                com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl r0 = (com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl) r0
                kotlin.e.n(r13)     // Catch: java.lang.Throwable -> L14
                r9 = r12
                goto L6f
            L14:
                r0 = move-exception
                r13 = r0
                r9 = r12
                goto L84
            L18:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L20:
                kotlin.e.n(r13)
                z6.b r3 = z6.b.f101032b
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r1 = "startGame: starting with gameType="
                r13.append(r1)
                com.baicizhan.app.api.service.GameType r1 = r12.f14135d
                r13.append(r1)
                java.lang.String r5 = r13.toString()
                r7 = 4
                r8 = 0
                java.lang.String r4 = "WordsHomeViewModel"
                r6 = 0
                z6.b.d(r3, r4, r5, r6, r7, r8)
                com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl r13 = r12.f14136e
                com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.N2(r13)
                com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl r13 = r12.f14136e
                com.baicizhan.app.api.service.GameType r1 = r12.f14135d
                int r8 = r12.f14137f
                kotlin.Result$a r3 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L81
                o6.d0 r3 = com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.i3(r13)     // Catch: java.lang.Throwable -> L81
                long r4 = w3.g.l()     // Catch: java.lang.Throwable -> L81
                com.baicizhan.app.biz.game.model.RoundType r6 = u4.b.g(r1)     // Catch: java.lang.Throwable -> L81
                java.lang.Object r13 = l00.k.a(r13)     // Catch: java.lang.Throwable -> L81
                r12.f14132a = r13     // Catch: java.lang.Throwable -> L81
                r13 = 0
                r12.f14133b = r13     // Catch: java.lang.Throwable -> L81
                r12.f14134c = r2     // Catch: java.lang.Throwable -> L81
                r7 = 0
                r10 = 4
                r11 = 0
                r9 = r12
                java.lang.Object r13 = o6.d0.b(r3, r4, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L7e
                if (r13 != r0) goto L6f
                return r0
            L6f:
                java.lang.Number r13 = (java.lang.Number) r13     // Catch: java.lang.Throwable -> L7e
                int r13 = r13.intValue()     // Catch: java.lang.Throwable -> L7e
                java.lang.Integer r13 = l00.a.f(r13)     // Catch: java.lang.Throwable -> L7e
                java.lang.Object r13 = kotlin.Result.m6308constructorimpl(r13)     // Catch: java.lang.Throwable -> L7e
                goto L8e
            L7e:
                r0 = move-exception
            L7f:
                r13 = r0
                goto L84
            L81:
                r0 = move-exception
                r9 = r12
                goto L7f
            L84:
                kotlin.Result$a r0 = kotlin.Result.Companion
                java.lang.Object r13 = kotlin.e.a(r13)
                java.lang.Object r13 = kotlin.Result.m6308constructorimpl(r13)
            L8e:
                boolean r0 = kotlin.Result.m6314isFailureimpl(r13)
                r1 = 0
                if (r0 == 0) goto L9b
                com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl r0 = r9.f14136e
                com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.O2(r0, r1)
            L9b:
                kotlin.e.n(r13)
                java.lang.Number r13 = (java.lang.Number) r13
                int r13 = r13.intValue()
                if (r13 != 0) goto Lac
                com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl r0 = r9.f14136e
                com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.O2(r0, r1)
                goto Lb3
            Lac:
                com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl r0 = r9.f14136e
                r1 = 1500(0x5dc, double:7.41E-321)
                com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.O2(r0, r1)
            Lb3:
                z6.b r3 = z6.b.f101032b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "startGame: completed, result="
                r0.append(r1)
                r0.append(r13)
                java.lang.String r5 = r0.toString()
                r7 = 4
                r8 = 0
                java.lang.String r4 = "WordsHomeViewModel"
                r6 = 0
                z6.b.d(r3, r4, r5, r6, r7, r8)
                java.lang.Integer r13 = l00.a.f(r13)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.x.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl", f = "WordsHomeViewModelImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {189}, m = "travel", n = {"tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-WordsHomeViewModelImpl$travel$2", "$i$f$bizCatch", "$i$a$-bizCatch-WordsHomeViewModelImpl$travel$2$1"}, s = {"L$0", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class y extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14138a;

        /* renamed from: b, reason: collision with root package name */
        public int f14139b;

        /* renamed from: c, reason: collision with root package name */
        public int f14140c;

        /* renamed from: d, reason: collision with root package name */
        public int f14141d;

        /* renamed from: e, reason: collision with root package name */
        public int f14142e;

        /* renamed from: f, reason: collision with root package name */
        public long f14143f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f14144g;

        /* renamed from: i, reason: collision with root package name */
        public int f14146i;

        public y(j00.c<? super y> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14144g = obj;
            this.f14146i |= Integer.MIN_VALUE;
            return WordsHomeViewModelImpl.this.c(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$travel$2$1$1", f = "WordsHomeViewModelImpl.kt", i = {}, l = {190}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class z extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14147a;

        public z(j00.c<? super z> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return WordsHomeViewModelImpl.this.new z(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((z) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f14147a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                com.baicizhan.app.biz.game.uc.ipavatar.i iVar = WordsHomeViewModelImpl.this.f13964u;
                this.f14147a = 1;
                if (iVar.a(this) == l11) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public WordsHomeViewModelImpl(@m80.k y4.o stateStore, @m80.k d0 startGameUC, @m80.k t6.c wordsFullSyncUC, @m80.k t6.e wordsIncrementalSyncUC, @m80.k o6.q getLegalCurrentBookIdUC, @m80.k ObserveIpAvatarUC observeIpAvatarUC, @m80.k o6.v observeStudySummaryUC, @m80.k ObserveUserGameInfoWithoutRewardUC observeUserGameInfoWithoutRewardUC, @m80.k ObserveUserCurrentBookIdUC observeUserCurrentBookIdUC, @m80.k ObserveBookAndAdjustedDailyProgressUC observeBookAndAdjustedDailyProgressUC, @m80.k com.baicizhan.app.biz.game.uc.incentive.o observeRankUC, @m80.k ObserveStreakTasksUC observeStreakTasksUC, @m80.k t5.a notifyRepo, @m80.k com.baicizhan.app.biz.game.uc.incentive.r setRankReadTimeUC, @m80.k com.baicizhan.app.biz.game.uc.incentive.m markTaskPopupShownUC, @m80.k ObserveLavaQuestUC observeLavaQuestUC, @m80.k ObserverSentenceEntranceUC observerSentenceEntranceUC, @m80.k com.baicizhan.app.biz.game.uc.incentive.j markLavaQuestUC, @m80.k com.baicizhan.app.biz.game.uc.ipavatar.a claimTravelRewardUC, @m80.k com.baicizhan.app.biz.game.uc.ipavatar.i sendBuddyTravelUC, @m80.k ObserveTopAdUC observeTopAdUC) {
        g0.p(stateStore, "stateStore");
        g0.p(startGameUC, "startGameUC");
        g0.p(wordsFullSyncUC, "wordsFullSyncUC");
        g0.p(wordsIncrementalSyncUC, "wordsIncrementalSyncUC");
        g0.p(getLegalCurrentBookIdUC, "getLegalCurrentBookIdUC");
        g0.p(observeIpAvatarUC, "observeIpAvatarUC");
        g0.p(observeStudySummaryUC, "observeStudySummaryUC");
        g0.p(observeUserGameInfoWithoutRewardUC, "observeUserGameInfoWithoutRewardUC");
        g0.p(observeUserCurrentBookIdUC, "observeUserCurrentBookIdUC");
        g0.p(observeBookAndAdjustedDailyProgressUC, "observeBookAndAdjustedDailyProgressUC");
        g0.p(observeRankUC, "observeRankUC");
        g0.p(observeStreakTasksUC, "observeStreakTasksUC");
        g0.p(notifyRepo, "notifyRepo");
        g0.p(setRankReadTimeUC, "setRankReadTimeUC");
        g0.p(markTaskPopupShownUC, "markTaskPopupShownUC");
        g0.p(observeLavaQuestUC, "observeLavaQuestUC");
        g0.p(observerSentenceEntranceUC, "observerSentenceEntranceUC");
        g0.p(markLavaQuestUC, "markLavaQuestUC");
        g0.p(claimTravelRewardUC, "claimTravelRewardUC");
        g0.p(sendBuddyTravelUC, "sendBuddyTravelUC");
        g0.p(observeTopAdUC, "observeTopAdUC");
        this.f13945b = stateStore;
        this.f13946c = startGameUC;
        this.f13947d = wordsFullSyncUC;
        this.f13948e = wordsIncrementalSyncUC;
        this.f13949f = getLegalCurrentBookIdUC;
        this.f13950g = observeIpAvatarUC;
        this.f13951h = observeStudySummaryUC;
        this.f13952i = observeUserGameInfoWithoutRewardUC;
        this.f13953j = observeUserCurrentBookIdUC;
        this.f13954k = observeBookAndAdjustedDailyProgressUC;
        this.f13955l = observeRankUC;
        this.f13956m = observeStreakTasksUC;
        this.f13957n = notifyRepo;
        this.f13958o = setRankReadTimeUC;
        this.f13959p = markTaskPopupShownUC;
        this.f13960q = observeLavaQuestUC;
        this.f13961r = observerSentenceEntranceUC;
        this.f13962s = markLavaQuestUC;
        this.f13963t = claimTravelRewardUC;
        this.f13964u = sendBuddyTravelUC;
        this.f13965v = observeTopAdUC;
        w4.j jVar = (w4.j) (this instanceof pa0.c ? ((pa0.c) this).getScope() : r().P().h()).i(kotlin.jvm.internal.o0.d(w4.j.class), null, new x00.a() { // from class: com.baicizhan.app.biz.game.impl.home.words.c
            @Override // x00.a
            public final Object invoke() {
                ya0.a G3;
                G3 = WordsHomeViewModelImpl.G3();
                return G3;
            }
        });
        this.f13966w = jVar;
        kotlinx.coroutines.flow.y<Boolean> a11 = kotlinx.coroutines.flow.o0.a(Boolean.TRUE);
        this.f13967x = a11;
        r0 a12 = c40.s0.a(c4.o.c().plus(l3.c(null, 1, null)).plus(new v(n0.f7891d0)));
        this.f13968y = a12;
        this.f13969z = kotlinx.coroutines.flow.k.Q1(kotlinx.coroutines.flow.k.f2(a11, new WordsHomeViewModelImpl$special$$inlined$flatMapLatest$1(null, this)), a12, h0.f68148a.c(), new o4.c(0, 1, null));
        this.A = jVar.k();
        this.B = new u3.a<>(a12);
        this.C = kotlinx.coroutines.flow.o0.a(0);
        this.E = new u();
        this.F = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(10:5|6|7|8|(1:(1:(3:12|13|14)(2:16|17))(2:18|19))(3:27|28|(2:30|25))|20|21|(1:23)|13|14))|33|6|7|8|(0)(0)|20|21|(0)|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009c, code lost:
    
        if (A3(r2, r13) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0043, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        r2 = kotlin.Result.Companion;
        r0 = kotlin.Result.m6308constructorimpl(kotlin.e.a(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B3(j00.c<? super yz.g2> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.k
            if (r0 == 0) goto L14
            r0 = r13
            com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$k r0 = (com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.k) r0
            int r1 = r0.f14072f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f14072f = r1
        L12:
            r13 = r0
            goto L1a
        L14:
            com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$k r0 = new com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$k
            r0.<init>(r13)
            goto L12
        L1a:
            java.lang.Object r0 = r13.f14070d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r13.f14072f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r13 = r13.f14068b
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            kotlin.e.n(r0)
            goto L9f
        L33:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L3b:
            java.lang.Object r2 = r13.f14067a
            com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl r2 = (com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl) r2
            kotlin.e.n(r0)     // Catch: java.lang.Throwable -> L43
            goto L69
        L43:
            r0 = move-exception
            goto L7c
        L45:
            kotlin.e.n(r0)
            z6.b r6 = z6.b.f101032b
            r10 = 4
            r11 = 0
            java.lang.String r7 = "WordsHomeViewModel"
            java.lang.String r8 = "incrementalRefresh: starting"
            r9 = 0
            z6.b.d(r6, r7, r8, r9, r10, r11)
            kotlin.Result$a r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L43
            t6.e r0 = r12.f13948e     // Catch: java.lang.Throwable -> L43
            java.lang.Object r2 = l00.k.a(r12)     // Catch: java.lang.Throwable -> L43
            r13.f14067a = r2     // Catch: java.lang.Throwable -> L43
            r13.f14069c = r3     // Catch: java.lang.Throwable -> L43
            r13.f14072f = r5     // Catch: java.lang.Throwable -> L43
            java.lang.Object r0 = r0.j(r13)     // Catch: java.lang.Throwable -> L43
            if (r0 != r1) goto L69
            goto L9e
        L69:
            z6.b r5 = z6.b.f101032b     // Catch: java.lang.Throwable -> L43
            java.lang.String r6 = "WordsHomeViewModel"
            java.lang.String r7 = "incrementalRefresh: successfully completed"
            r9 = 4
            r10 = 0
            r8 = 0
            z6.b.d(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L43
            yz.g2 r0 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L43
            java.lang.Object r0 = kotlin.Result.m6308constructorimpl(r0)     // Catch: java.lang.Throwable -> L43
            goto L86
        L7c:
            kotlin.Result$a r2 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.e.a(r0)
            java.lang.Object r0 = kotlin.Result.m6308constructorimpl(r0)
        L86:
            java.lang.Throwable r2 = kotlin.Result.m6311exceptionOrNullimpl(r0)
            if (r2 == 0) goto L9f
            r13.f14067a = r0
            java.lang.Object r0 = l00.k.a(r2)
            r13.f14068b = r0
            r13.f14069c = r3
            r13.f14072f = r4
            java.lang.Object r13 = r12.A3(r2, r13)
            if (r13 != r1) goto L9f
        L9e:
            return r1
        L9f:
            yz.g2 r13 = yz.g2.f100423a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.B3(j00.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0084, code lost:
    
        if (E3(r0) != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        if (r14 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C3(j00.c<? super yz.g2> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.l
            if (r0 == 0) goto L13
            r0 = r14
            com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$l r0 = (com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.l) r0
            int r1 = r0.f14076d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14076d = r1
            goto L18
        L13:
            com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$l r0 = new com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$l
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f14074b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f14076d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.e.n(r14)
            goto L87
        L2f:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L37:
            long r4 = r0.f14073a
            kotlin.e.n(r14)
            goto L7c
        L3d:
            kotlin.e.n(r14)
            goto L4f
        L41:
            kotlin.e.n(r14)
            o6.q r14 = r13.f13949f
            r0.f14076d = r5
            java.lang.Object r14 = r14.a(r0)
            if (r14 != r1) goto L4f
            goto L86
        L4f:
            java.lang.Number r14 = (java.lang.Number) r14
            long r5 = r14.longValue()
            z6.b r7 = z6.b.f101032b
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r2 = "init: obtained bookId="
            r14.append(r2)
            r14.append(r5)
            java.lang.String r9 = r14.toString()
            r11 = 4
            r12 = 0
            java.lang.String r8 = "WordsHomeViewModel"
            r10 = 0
            z6.b.d(r7, r8, r9, r10, r11, r12)
            r0.f14073a = r5
            r0.f14076d = r4
            java.lang.Object r14 = r13.D3(r5, r0)
            if (r14 != r1) goto L7b
            goto L86
        L7b:
            r4 = r5
        L7c:
            r0.f14073a = r4
            r0.f14076d = r3
            java.lang.Object r14 = r13.E3(r0)
            if (r14 != r1) goto L87
        L86:
            return r1
        L87:
            yz.g2 r14 = yz.g2.f100423a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.C3(j00.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object E3(j00.c<? super g2> cVar) {
        z6.b bVar = z6.b.f101032b;
        z6.b.d(bVar, com.baicizhan.app.biz.game.impl.home.words.d.f14151a, "observeDataUpdates: starting ", null, 4, null);
        l2 l2Var = this.D;
        if (l2Var != null) {
            l2.a.b(l2Var, null, 1, null);
        }
        this.D = kotlinx.coroutines.flow.k.W0(kotlinx.coroutines.flow.k.v(kotlinx.coroutines.flow.k.P0(kotlinx.coroutines.flow.k.h1(kotlinx.coroutines.flow.k.f2(this.f13953j.b(), new WordsHomeViewModelImpl$observeDataUpdates$$inlined$flatMapLatest$1(null, this)), new r(null)), c4.o.b()), new s(null)), this.f13968y);
        z6.b.d(bVar, com.baicizhan.app.biz.game.impl.home.words.d.f14151a, "observeDataUpdates: data streams launched successfully", null, 4, null);
        return g2.f100423a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (y3(r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        if (B3(r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F3(j00.c<? super yz.g2> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.t
            if (r0 == 0) goto L13
            r0 = r12
            com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$t r0 = (com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.t) r0
            int r1 = r0.f14114d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14114d = r1
            goto L18
        L13:
            com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$t r0 = new com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl$t
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f14112b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f14114d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L29
            goto L31
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L31:
            kotlin.e.n(r12)
            goto L77
        L35:
            kotlin.e.n(r12)
            y4.o r12 = r11.f13945b
            kotlinx.coroutines.flow.m0 r12 = r12.b()
            java.lang.Object r12 = r12.getValue()
            boolean r12 = r12 instanceof k3.o4.a
            z6.b r5 = z6.b.f101032b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "refreshData: starting, isLoading="
            r2.append(r6)
            r2.append(r12)
            java.lang.String r7 = r2.toString()
            r9 = 4
            r10 = 0
            java.lang.String r6 = "WordsHomeViewModel"
            r8 = 0
            z6.b.d(r5, r6, r7, r8, r9, r10)
            if (r12 != 0) goto L6c
            r0.f14111a = r12
            r0.f14114d = r4
            java.lang.Object r12 = r11.y3(r0)
            if (r12 != r1) goto L77
            goto L76
        L6c:
            r0.f14111a = r12
            r0.f14114d = r3
            java.lang.Object r12 = r11.B3(r0)
            if (r12 != r1) goto L77
        L76:
            return r1
        L77:
            z6.b r2 = z6.b.f101032b
            r6 = 4
            r7 = 0
            java.lang.String r3 = "WordsHomeViewModel"
            java.lang.String r4 = "refreshData: completed"
            r5 = 0
            z6.b.d(r2, r3, r4, r5, r6, r7)
            yz.g2 r12 = yz.g2.f100423a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.F3(j00.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ya0.a G3() {
        return ya0.b.d(UIEffectStrategyType.WORDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l3.g2 u3(RankType rankType) {
        return new e(rankType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l3.g2 v3() {
        return new f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w3() {
        z6.b.d(z6.b.f101032b, com.baicizhan.app.biz.game.impl.home.words.d.f14151a, "disableDataSending: data sending disabled", null, 4, null);
        this.f13967x.setValue(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x3(long j11) {
        z6.b.d(z6.b.f101032b, com.baicizhan.app.biz.game.impl.home.words.d.f14151a, "enableDataSending: data sending enabled", null, 4, null);
        if (j11 != 0) {
            c40.k.f(this.f13968y, null, null, new g(j11, this, null), 3, null);
        } else {
            this.f13967x.setValue(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(2:3|(12:5|6|7|(1:(1:(1:(1:(3:13|14|15)(2:17|18))(7:19|20|21|22|(1:24)|14|15))(13:28|29|30|31|32|(1:34)|35|(2:42|(1:47)(1:46))(2:39|(2:41|26))|21|22|(0)|14|15))(3:51|52|53))(6:69|70|71|72|(1:74)|26)|54|55|56|(1:58)|59|60|(14:62|31|32|(0)|35|(1:37)|42|(1:44)|47|21|22|(0)|14|15)|26))|80|6|7|(0)(0)|54|55|56|(0)|59|60|(0)|26|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x01a3, code lost:
    
        if (r5.a(r7, r2) == r3) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ea, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00eb, code lost:
    
        r8 = r9;
        r9 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0051, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0170, code lost:
    
        r4 = kotlin.Result.Companion;
        r0 = kotlin.Result.m6308constructorimpl(kotlin.e.a(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fd A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:20:0x004c, B:21:0x0169, B:32:0x00f7, B:34:0x00fd, B:35:0x0102, B:37:0x0108, B:39:0x010e, B:42:0x012c, B:44:0x0132, B:46:0x0138, B:47:0x013c, B:50:0x00ed, B:56:0x00ba, B:58:0x00c0, B:68:0x00af, B:70:0x0089), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0108 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:20:0x004c, B:21:0x0169, B:32:0x00f7, B:34:0x00fd, B:35:0x0102, B:37:0x0108, B:39:0x010e, B:42:0x012c, B:44:0x0132, B:46:0x0138, B:47:0x013c, B:50:0x00ed, B:56:0x00ba, B:58:0x00c0, B:68:0x00af, B:70:0x0089), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0132 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:20:0x004c, B:21:0x0169, B:32:0x00f7, B:34:0x00fd, B:35:0x0102, B:37:0x0108, B:39:0x010e, B:42:0x012c, B:44:0x0132, B:46:0x0138, B:47:0x013c, B:50:0x00ed, B:56:0x00ba, B:58:0x00c0, B:68:0x00af, B:70:0x0089), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c0 A[Catch: all -> 0x0051, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:20:0x004c, B:21:0x0169, B:32:0x00f7, B:34:0x00fd, B:35:0x0102, B:37:0x0108, B:39:0x010e, B:42:0x012c, B:44:0x0132, B:46:0x0138, B:47:0x013c, B:50:0x00ed, B:56:0x00ba, B:58:0x00c0, B:68:0x00af, B:70:0x0089), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y3(j00.c<? super yz.g2> r19) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.y3(j00.c):java.lang.Object");
    }

    public final Object A3(Throwable th2, j00.c<? super g2> cVar) {
        z6.b bVar = z6.b.f101032b;
        bVar.e(com.baicizhan.app.biz.game.impl.home.words.d.f14151a, "handleBookError: error occurred", th2);
        if (!(th2 instanceof BizInternalException) || ((BizInternalException) th2).getCode() != 1) {
            z6.b.d(bVar, com.baicizhan.app.biz.game.impl.home.words.d.f14151a, "handleBookError: error not handled, type=" + kotlin.jvm.internal.o0.d(th2.getClass()).C(), null, 4, null);
            return g2.f100423a;
        }
        z6.b.f(bVar, com.baicizhan.app.biz.game.impl.home.words.d.f14151a, "handleBookError: book not available, triggering full refresh", null, 4, null);
        l2 l2Var = this.D;
        if (l2Var != null) {
            l2.a.b(l2Var, null, 1, null);
        }
        Object y32 = y3(cVar);
        return y32 == kotlin.coroutines.intrinsics.b.l() ? y32 : g2.f100423a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x01d9, code lost:
    
        if (r3.a(r2, r0) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x01bc, code lost:
    
        if (r14 == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0171, code lost:
    
        if (r14 != r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x012b, code lost:
    
        if (r14 != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ed, code lost:
    
        if (r14 == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d4, code lost:
    
        if (r14 == r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D3(long r12, j00.c<? super yz.g2> r14) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.D3(long, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00af A[Catch: all -> 0x00c7, TryCatch #2 {all -> 0x00c7, blocks: (B:22:0x00a8, B:24:0x00af, B:26:0x00b3, B:28:0x00b7, B:30:0x00bb, B:32:0x00bf, B:43:0x0126, B:34:0x00ca, B:36:0x00d5, B:38:0x00e9, B:40:0x00fd, B:42:0x0112), top: B:21:0x00a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0112 A[Catch: all -> 0x00c7, TryCatch #2 {all -> 0x00c7, blocks: (B:22:0x00a8, B:24:0x00af, B:26:0x00b3, B:28:0x00b7, B:30:0x00bb, B:32:0x00bf, B:43:0x0126, B:34:0x00ca, B:36:0x00d5, B:38:0x00e9, B:40:0x00fd, B:42:0x0112), top: B:21:0x00a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.p4
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(@m80.k j00.c<? super yz.g2> r12) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.c(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00af A[Catch: all -> 0x00c7, TryCatch #2 {all -> 0x00c7, blocks: (B:22:0x00a8, B:24:0x00af, B:26:0x00b3, B:28:0x00b7, B:30:0x00bb, B:32:0x00bf, B:43:0x0126, B:34:0x00ca, B:36:0x00d5, B:38:0x00e9, B:40:0x00fd, B:42:0x0112), top: B:21:0x00a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0112 A[Catch: all -> 0x00c7, TryCatch #2 {all -> 0x00c7, blocks: (B:22:0x00a8, B:24:0x00af, B:26:0x00b3, B:28:0x00b7, B:30:0x00bb, B:32:0x00bf, B:43:0x0126, B:34:0x00ca, B:36:0x00d5, B:38:0x00e9, B:40:0x00fd, B:42:0x0112), top: B:21:0x00a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.p4
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c2(@m80.k j00.c<? super yz.g2> r12) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.c2(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00af A[Catch: all -> 0x00c7, TryCatch #2 {all -> 0x00c7, blocks: (B:22:0x00a8, B:24:0x00af, B:26:0x00b3, B:28:0x00b7, B:30:0x00bb, B:32:0x00bf, B:43:0x0126, B:34:0x00ca, B:36:0x00d5, B:38:0x00e9, B:40:0x00fd, B:42:0x0112), top: B:21:0x00a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0112 A[Catch: all -> 0x00c7, TryCatch #2 {all -> 0x00c7, blocks: (B:22:0x00a8, B:24:0x00af, B:26:0x00b3, B:28:0x00b7, B:30:0x00bb, B:32:0x00bf, B:43:0x0126, B:34:0x00ca, B:36:0x00d5, B:38:0x00e9, B:40:0x00fd, B:42:0x0112), top: B:21:0x00a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.p4
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(@m80.k j00.c<? super yz.g2> r12) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.f(j00.c):java.lang.Object");
    }

    @Override // k3.p4
    @m80.k
    public m0<o4> getState() {
        return this.f13969z;
    }

    @Override // k3.p4
    @m80.k
    public l3.m o(@m80.k x00.l<? super o4, g2> onState) {
        g0.p(onState, "onState");
        return u4.c.a(onState, kotlinx.coroutines.flow.k.c0(getState(), 20L), com.baicizhan.app.biz.game.impl.home.words.d.f14151a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b0 A[Catch: all -> 0x00c8, TryCatch #2 {all -> 0x00c8, blocks: (B:22:0x00a9, B:24:0x00b0, B:26:0x00b4, B:28:0x00b8, B:30:0x00bc, B:32:0x00c0, B:43:0x0127, B:34:0x00cb, B:36:0x00d6, B:38:0x00ea, B:40:0x00fe, B:42:0x0113), top: B:21:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0113 A[Catch: all -> 0x00c8, TryCatch #2 {all -> 0x00c8, blocks: (B:22:0x00a9, B:24:0x00b0, B:26:0x00b4, B:28:0x00b8, B:30:0x00bc, B:32:0x00c0, B:43:0x0127, B:34:0x00cb, B:36:0x00d6, B:38:0x00ea, B:40:0x00fe, B:42:0x0113), top: B:21:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.p4
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object q(@m80.k j00.c<? super l3.s> r12) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.q(j00.c):java.lang.Object");
    }

    @Override // c4.j, pa0.a
    @m80.k
    public /* bridge */ na0.a r() {
        return super.r();
    }

    public final l3.g2 t3() {
        return new d();
    }

    @Override // k3.p4
    @m80.k
    public c0<l3.o> u() {
        return this.A;
    }

    @Override // k3.p4
    @m80.k
    public l3.m w1(@m80.k x00.l<? super l3.o, g2> onEffect) {
        g0.p(onEffect, "onEffect");
        return u4.c.a(onEffect, u(), com.baicizhan.app.biz.game.impl.home.words.d.f14151a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc A[Catch: all -> 0x00d4, TryCatch #1 {all -> 0x00d4, blocks: (B:22:0x00b5, B:24:0x00bc, B:26:0x00c0, B:28:0x00c4, B:30:0x00c8, B:32:0x00cc, B:43:0x0133, B:34:0x00d7, B:36:0x00e2, B:38:0x00f6, B:40:0x010a, B:42:0x011f), top: B:21:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011f A[Catch: all -> 0x00d4, TryCatch #1 {all -> 0x00d4, blocks: (B:22:0x00b5, B:24:0x00bc, B:26:0x00c0, B:28:0x00c4, B:30:0x00c8, B:32:0x00cc, B:43:0x0133, B:34:0x00d7, B:36:0x00e2, B:38:0x00f6, B:40:0x010a, B:42:0x011f), top: B:21:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.p4
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object y0(@m80.k com.baicizhan.app.api.service.GameType r11, int r12, @m80.k j00.c<? super p.a<java.lang.Integer>> r13) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.impl.home.words.WordsHomeViewModelImpl.y0(com.baicizhan.app.api.service.GameType, int, j00.c):java.lang.Object");
    }

    public static /* synthetic */ void z3() {
    }
}
