package com.baicizhan.app.biz.game.impl.home.sentence;

import c40.a1;
import c40.l2;
import c40.l3;
import c40.n0;
import c40.r0;
import com.baicizhan.app.biz.game.impl.home.uieffect.UIEffectStrategyType;
import com.baicizhan.app.biz.game.model.RankType;
import com.baicizhan.app.biz.game.uc.incentive.ObserveStreakTasksUC;
import com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC;
import com.baicizhan.app.biz.game.uc.user.ObserveUserCurrentSkuIdUC;
import com.baicizhan.app.biz.game.uc.user.ObserveUserGameInfoWithoutRewardUC;
import com.jiongji.andriod.card.R;
import h5.j0;
import h5.o0;
import h5.s0;
import h5.w0;
import k3.u2;
import k3.v2;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.c0;
import kotlinx.coroutines.flow.h0;
import kotlinx.coroutines.flow.m0;
import v4.a;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.c(binds = {v2.class})
@u0({"SMAP\nSentenceHomeVMImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SentenceHomeVMImpl.kt\ncom/baicizhan/app/biz/game/impl/home/sentence/SentenceHomeVMImpl\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n+ 5 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 6 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n+ 7 TimeMeasurer.kt\ncom/baicizhan/app/biz/base/TimeMeasurerKt\n+ 8 BizCatch.kt\ncom/baicizhan/app/biz/base/BizCatchKt\n+ 9 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 10 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 11 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,393:1\n41#2,6:394\n48#2:401\n142#3:400\n127#4:402\n47#5,4:403\n189#6:407\n189#6:433\n12#7,3:408\n15#7,10:423\n12#8,12:411\n49#9:434\n51#9:438\n49#9:439\n51#9:443\n49#9:444\n51#9:448\n49#9:449\n51#9:453\n49#9:454\n51#9:458\n46#10:435\n51#10:437\n46#10:440\n51#10:442\n46#10:445\n51#10:447\n46#10:450\n51#10:452\n46#10:455\n51#10:457\n105#11:436\n105#11:441\n105#11:446\n105#11:451\n105#11:456\n*S KotlinDebug\n*F\n+ 1 SentenceHomeVMImpl.kt\ncom/baicizhan/app/biz/game/impl/home/sentence/SentenceHomeVMImpl\n*L\n98#1:394,6\n98#1:401\n98#1:400\n98#1:402\n105#1:403,4\n111#1:407\n287#1:433\n-1#1:408,3\n-1#1:423,10\n-1#1:411,12\n290#1:434\n290#1:438\n293#1:439\n293#1:443\n296#1:444\n296#1:448\n302#1:449\n302#1:453\n305#1:454\n305#1:458\n290#1:435\n290#1:437\n293#1:440\n293#1:442\n296#1:445\n296#1:447\n302#1:450\n302#1:452\n305#1:455\n305#1:457\n290#1:436\n293#1:441\n296#1:446\n302#1:451\n305#1:456\n*E\n"})
/* loaded from: classes3.dex */
public final class SentenceHomeVMImpl implements v2, c4.j {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final v4.l f13764b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final t6.a f13765c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.sentence.i f13766d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final ObserveUserGameInfoWithoutRewardUC f13767e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.sentence.b f13768f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.incentive.o f13769g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final ObserveStreakTasksUC f13770h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final t5.a f13771i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.incentive.r f13772j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.incentive.m f13773k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.user.e f13774l;

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public final ObserveUserCurrentSkuIdUC f13775m;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public final ObserveIpAvatarUC f13776n;

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.ipavatar.i f13777o;

    /* renamed from: p, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.ipavatar.a f13778p;

    /* renamed from: q, reason: collision with root package name */
    @m80.k
    public final w4.j f13779q;

    /* renamed from: r, reason: collision with root package name */
    @m80.k
    public final kotlinx.coroutines.flow.y<Boolean> f13780r;

    /* renamed from: s, reason: collision with root package name */
    @m80.k
    public final r0 f13781s;

    /* renamed from: t, reason: collision with root package name */
    @m80.k
    public final m0<u2> f13782t;

    /* renamed from: u, reason: collision with root package name */
    @m80.k
    public final c0<l3.o> f13783u;

    /* renamed from: v, reason: collision with root package name */
    @m80.k
    public final u3.a<g2> f13784v;

    /* renamed from: w, reason: collision with root package name */
    @m80.k
    public final kotlinx.coroutines.flow.y<Integer> f13785w;

    /* renamed from: x, reason: collision with root package name */
    @m80.l
    public l2 f13786x;

    /* renamed from: y, reason: collision with root package name */
    @m80.k
    public final l3.g2 f13787y;

    /* renamed from: z, reason: collision with root package name */
    @m80.k
    public final l3.g2 f13788z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements l3.g2 {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl$avatarClickAction$1", f = "SentenceHomeVMImpl.kt", i = {0, 0}, l = {363}, m = "execute", n = {"$this$execute_u24lambda_u240", "$i$a$-runCatching-SentenceHomeVMImpl$avatarClickAction$1$execute$2"}, s = {"L$0", "I$0"}, v = 1)
        /* renamed from: com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl$a$a, reason: collision with other inner class name */
        public static final class C0200a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            public Object f13804a;

            /* renamed from: b, reason: collision with root package name */
            public int f13805b;

            /* renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f13806c;

            /* renamed from: e, reason: collision with root package name */
            public int f13808e;

            public C0200a(j00.c<? super C0200a> cVar) {
                super(cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f13806c = obj;
                this.f13808e |= Integer.MIN_VALUE;
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
                boolean r0 = r9 instanceof com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl.a.C0200a
                if (r0 == 0) goto L13
                r0 = r9
                com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl$a$a r0 = (com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl.a.C0200a) r0
                int r1 = r0.f13808e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f13808e = r1
                goto L18
            L13:
                com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl$a$a r0 = new com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl$a$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f13806c
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.f13808e
                r3 = 1
                if (r2 == 0) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r0 = r0.f13804a
                com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl$a r0 = (com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl.a) r0
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
                com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl r9 = com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl.this
                kotlin.Result$a r2 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L2d
                t5.a r9 = com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl.T2(r9)     // Catch: java.lang.Throwable -> L2d
                java.lang.Object r2 = l00.k.a(r8)     // Catch: java.lang.Throwable -> L2d
                r0.f13804a = r2     // Catch: java.lang.Throwable -> L2d
                r2 = 0
                r0.f13805b = r2     // Catch: java.lang.Throwable -> L2d
                r0.f13808e = r3     // Catch: java.lang.Throwable -> L2d
                java.lang.Object r9 = r9.f(r0)     // Catch: java.lang.Throwable -> L2d
                if (r9 != r1) goto L55
                return r1
            L55:
                z6.b r2 = z6.b.f101032b     // Catch: java.lang.Throwable -> L2d
                java.lang.String r3 = "SentenceHomeVM"
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
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl.a.a(j00.c):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl", f = "SentenceHomeVMImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {169}, m = "claimTravelReward", n = {"tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-SentenceHomeVMImpl$claimTravelReward$2", "$i$f$bizCatch", "$i$a$-bizCatch-SentenceHomeVMImpl$claimTravelReward$2$1"}, s = {"L$0", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f13809a;

        /* renamed from: b, reason: collision with root package name */
        public int f13810b;

        /* renamed from: c, reason: collision with root package name */
        public int f13811c;

        /* renamed from: d, reason: collision with root package name */
        public int f13812d;

        /* renamed from: e, reason: collision with root package name */
        public int f13813e;

        /* renamed from: f, reason: collision with root package name */
        public long f13814f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f13815g;

        /* renamed from: i, reason: collision with root package name */
        public int f13817i;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f13815g = obj;
            this.f13817i |= Integer.MIN_VALUE;
            return SentenceHomeVMImpl.this.q(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl$claimTravelReward$2$1$1", f = "SentenceHomeVMImpl.kt", i = {}, l = {170}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class c extends SuspendLambda implements x00.p<r0, j00.c<? super l3.s>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f13818a;

        public c(j00.c<? super c> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return SentenceHomeVMImpl.this.new c(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super l3.s> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f13818a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                com.baicizhan.app.biz.game.uc.ipavatar.a aVar = SentenceHomeVMImpl.this.f13778p;
                this.f13818a = 1;
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
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl", f = "SentenceHomeVMImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {148}, m = "consumeEnergy", n = {"tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-SentenceHomeVMImpl$consumeEnergy$2", "$i$f$bizCatch", "$i$a$-bizCatch-SentenceHomeVMImpl$consumeEnergy$2$1"}, s = {"L$0", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f13820a;

        /* renamed from: b, reason: collision with root package name */
        public int f13821b;

        /* renamed from: c, reason: collision with root package name */
        public int f13822c;

        /* renamed from: d, reason: collision with root package name */
        public int f13823d;

        /* renamed from: e, reason: collision with root package name */
        public int f13824e;

        /* renamed from: f, reason: collision with root package name */
        public long f13825f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f13826g;

        /* renamed from: i, reason: collision with root package name */
        public int f13828i;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f13826g = obj;
            this.f13828i |= Integer.MIN_VALUE;
            return SentenceHomeVMImpl.this.q1(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl$consumeEnergy$2$1$1", f = "SentenceHomeVMImpl.kt", i = {0, 0}, l = {151}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-SentenceHomeVMImpl$consumeEnergy$2$1$1$result$1"}, s = {"L$0", "I$0"}, v = 1)
    public static final class e extends SuspendLambda implements x00.l<j00.c<? super Integer>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f13829a;

        /* renamed from: b, reason: collision with root package name */
        public int f13830b;

        /* renamed from: c, reason: collision with root package name */
        public int f13831c;

        public e(j00.c<? super e> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return SentenceHomeVMImpl.this.new e(cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super Integer> cVar) {
            return ((e) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m6308constructorimpl;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f13831c;
            try {
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    z6.b.d(z6.b.f101032b, com.baicizhan.app.biz.game.impl.home.sentence.c.f13944a, "consumeEnergy: starting", null, 4, null);
                    SentenceHomeVMImpl sentenceHomeVMImpl = SentenceHomeVMImpl.this;
                    Result.a aVar = Result.Companion;
                    com.baicizhan.app.biz.game.uc.sentence.b bVar = sentenceHomeVMImpl.f13768f;
                    this.f13829a = l00.k.a(sentenceHomeVMImpl);
                    this.f13830b = 0;
                    this.f13831c = 1;
                    obj = bVar.a(this);
                    if (obj == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                m6308constructorimpl = Result.m6308constructorimpl(l00.a.f(((Number) obj).intValue()));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
            }
            if (Result.m6314isFailureimpl(m6308constructorimpl)) {
                SentenceHomeVMImpl.this.j3(0L);
            }
            kotlin.e.n(m6308constructorimpl);
            int intValue = ((Number) m6308constructorimpl).intValue();
            z6.b.d(z6.b.f101032b, com.baicizhan.app.biz.game.impl.home.sentence.c.f13944a, "consumeEnergy: completed, result=" + intValue, null, 4, null);
            return l00.a.f(intValue);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f implements l3.g2 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RankType f13834b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl$createReadRankAction$1", f = "SentenceHomeVMImpl.kt", i = {0, 0}, l = {341}, m = "execute", n = {"$this$execute_u24lambda_u240", "$i$a$-runCatching-SentenceHomeVMImpl$createReadRankAction$1$execute$2"}, s = {"L$1", "I$0"}, v = 1)
        public static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            public Object f13835a;

            /* renamed from: b, reason: collision with root package name */
            public Object f13836b;

            /* renamed from: c, reason: collision with root package name */
            public int f13837c;

            /* renamed from: d, reason: collision with root package name */
            public /* synthetic */ Object f13838d;

            /* renamed from: f, reason: collision with root package name */
            public int f13840f;

            public a(j00.c<? super a> cVar) {
                super(cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f13838d = obj;
                this.f13840f |= Integer.MIN_VALUE;
                return f.this.a(this);
            }
        }

        public f(RankType rankType) {
            this.f13834b = rankType;
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
                boolean r0 = r8 instanceof com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl.f.a
                if (r0 == 0) goto L13
                r0 = r8
                com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl$f$a r0 = (com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl.f.a) r0
                int r1 = r0.f13840f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f13840f = r1
                goto L18
            L13:
                com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl$f$a r0 = new com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl$f$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f13838d
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.f13840f
                r3 = 1
                if (r2 == 0) goto L3c
                if (r2 != r3) goto L34
                java.lang.Object r1 = r0.f13836b
                com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl$f r1 = (com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl.f) r1
                java.lang.Object r0 = r0.f13835a
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
                com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl r8 = com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl.this
                com.baicizhan.app.biz.game.model.RankType r2 = r7.f13834b
                kotlin.Result$a r4 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L31
                com.baicizhan.app.biz.game.uc.incentive.r r8 = com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl.Y2(r8)     // Catch: java.lang.Throwable -> L31
                r0.f13835a = r2     // Catch: java.lang.Throwable -> L31
                java.lang.Object r4 = l00.k.a(r7)     // Catch: java.lang.Throwable -> L31
                r0.f13836b = r4     // Catch: java.lang.Throwable -> L31
                r4 = 0
                r0.f13837c = r4     // Catch: java.lang.Throwable -> L31
                r0.f13840f = r3     // Catch: java.lang.Throwable -> L31
                java.lang.Object r8 = r8.c(r2, r0)     // Catch: java.lang.Throwable -> L31
                if (r8 != r1) goto L5d
                return r1
            L5d:
                r0 = r2
            L5e:
                z6.b r1 = z6.b.f101032b     // Catch: java.lang.Throwable -> L31
                java.lang.String r2 = "SentenceHomeVM"
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
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl.f.a(j00.c):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g implements l3.g2 {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl$createTaskClickAction$1", f = "SentenceHomeVMImpl.kt", i = {0, 0}, l = {353}, m = "execute", n = {"$this$execute_u24lambda_u240", "$i$a$-runCatching-SentenceHomeVMImpl$createTaskClickAction$1$execute$2"}, s = {"L$0", "I$0"}, v = 1)
        public static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            public Object f13842a;

            /* renamed from: b, reason: collision with root package name */
            public int f13843b;

            /* renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f13844c;

            /* renamed from: e, reason: collision with root package name */
            public int f13846e;

            public a(j00.c<? super a> cVar) {
                super(cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f13844c = obj;
                this.f13846e |= Integer.MIN_VALUE;
                return g.this.a(this);
            }
        }

        public g() {
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
                boolean r0 = r5 instanceof com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl.g.a
                if (r0 == 0) goto L13
                r0 = r5
                com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl$g$a r0 = (com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl.g.a) r0
                int r1 = r0.f13846e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f13846e = r1
                goto L18
            L13:
                com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl$g$a r0 = new com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl$g$a
                r0.<init>(r5)
            L18:
                java.lang.Object r5 = r0.f13844c
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.f13846e
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r0 = r0.f13842a
                com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl$g r0 = (com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl.g) r0
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
                com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl r5 = com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl.this
                kotlin.Result$a r2 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L2d
                com.baicizhan.app.biz.game.uc.incentive.m r5 = com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl.S2(r5)     // Catch: java.lang.Throwable -> L2d
                java.lang.Object r2 = l00.k.a(r4)     // Catch: java.lang.Throwable -> L2d
                r0.f13842a = r2     // Catch: java.lang.Throwable -> L2d
                r2 = 0
                r0.f13843b = r2     // Catch: java.lang.Throwable -> L2d
                r0.f13846e = r3     // Catch: java.lang.Throwable -> L2d
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
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl.g.a(j00.c):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl$enableDataSending$1", f = "SentenceHomeVMImpl.kt", i = {}, l = {376}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class h extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f13847a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f13848b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SentenceHomeVMImpl f13849c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(long j11, SentenceHomeVMImpl sentenceHomeVMImpl, j00.c<? super h> cVar) {
            super(2, cVar);
            this.f13848b = j11;
            this.f13849c = sentenceHomeVMImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new h(this.f13848b, this.f13849c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((h) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f13847a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                long j11 = this.f13848b;
                this.f13847a = 1;
                if (a1.b(j11, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            this.f13849c.f13780r.setValue(l00.a.a(true));
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl", f = "SentenceHomeVMImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {127}, m = "enterHome", n = {"tag$iv", com.alipay.sdk.m.x.d.f11177w, "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-SentenceHomeVMImpl$enterHome$2", "$i$f$bizCatch", "$i$a$-bizCatch-SentenceHomeVMImpl$enterHome$2$1"}, s = {"L$0", "Z$0", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public boolean f13850a;

        /* renamed from: b, reason: collision with root package name */
        public Object f13851b;

        /* renamed from: c, reason: collision with root package name */
        public int f13852c;

        /* renamed from: d, reason: collision with root package name */
        public int f13853d;

        /* renamed from: e, reason: collision with root package name */
        public int f13854e;

        /* renamed from: f, reason: collision with root package name */
        public int f13855f;

        /* renamed from: g, reason: collision with root package name */
        public long f13856g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f13857h;

        /* renamed from: j, reason: collision with root package name */
        public int f13859j;

        public i(j00.c<? super i> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f13857h = obj;
            this.f13859j |= Integer.MIN_VALUE;
            return SentenceHomeVMImpl.this.K0(false, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl$enterHome$2$1$1", f = "SentenceHomeVMImpl.kt", i = {1, 2, 3}, l = {130, 135, 137, 141}, m = "invokeSuspend", n = {"consumeEffectFirst", "consumeEffectFirst", "consumeEffectFirst"}, s = {"I$0", "I$0", "I$0"}, v = 1)
    public static final class j extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f13860a;

        /* renamed from: b, reason: collision with root package name */
        public int f13861b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f13862c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ SentenceHomeVMImpl f13863d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl$enterHome$2$1$1$1", f = "SentenceHomeVMImpl.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f13864a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SentenceHomeVMImpl f13865b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SentenceHomeVMImpl sentenceHomeVMImpl, j00.c<? super a> cVar) {
                super(1, cVar);
                this.f13865b = sentenceHomeVMImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(j00.c<?> cVar) {
                return new a(this.f13865b, cVar);
            }

            @Override // x00.l
            public final Object invoke(j00.c<? super g2> cVar) {
                return ((a) create(cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f13864a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    SentenceHomeVMImpl sentenceHomeVMImpl = this.f13865b;
                    this.f13864a = 1;
                    if (sentenceHomeVMImpl.p3(this) == l11) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(boolean z11, SentenceHomeVMImpl sentenceHomeVMImpl, j00.c<? super j> cVar) {
            super(2, cVar);
            this.f13862c = z11;
            this.f13863d = sentenceHomeVMImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new j(this.f13862c, this.f13863d, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((j) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x00d7, code lost:
        
            if (r13.n(r12) == r0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00c4, code lost:
        
            if (r13.d(r4, r12) != r0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0085, code lost:
        
            if (r13.n(r12) == r0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00ab, code lost:
        
            if (r13.n(r12) == r0) goto L32;
         */
        /* JADX WARN: Type inference failed for: r1v11, types: [boolean, int] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r12.f13861b
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L33
                if (r1 == r5) goto L2f
                if (r1 == r4) goto L28
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                kotlin.e.n(r13)
                goto Lda
            L19:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L21:
                int r1 = r12.f13860a
                kotlin.e.n(r13)
                goto Lc7
            L28:
                int r1 = r12.f13860a
                kotlin.e.n(r13)
                goto Lae
            L2f:
                kotlin.e.n(r13)
                goto L88
            L33:
                kotlin.e.n(r13)
                z6.b r6 = z6.b.f101032b
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r1 = "enterHome: starting, "
                r13.append(r1)
                boolean r1 = r12.f13862c
                r13.append(r1)
                java.lang.String r1 = " current state="
                r13.append(r1)
                com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl r1 = r12.f13863d
                v4.l r1 = com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl.Z2(r1)
                kotlinx.coroutines.flow.m0 r1 = r1.b()
                java.lang.Object r1 = r1.getValue()
                java.lang.Class r1 = r1.getClass()
                h10.d r1 = kotlin.jvm.internal.o0.d(r1)
                java.lang.String r1 = r1.C()
                r13.append(r1)
                java.lang.String r8 = r13.toString()
                r10 = 4
                r11 = 0
                java.lang.String r7 = "SentenceHomeVM"
                r9 = 0
                z6.b.d(r6, r7, r8, r9, r10, r11)
                boolean r13 = r12.f13862c
                if (r13 != 0) goto L8b
                com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl r13 = r12.f13863d
                w4.j r13 = com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl.a3(r13)
                r12.f13861b = r5
                java.lang.Object r13 = r13.n(r12)
                if (r13 != r0) goto L88
                goto Ld9
            L88:
                yz.g2 r13 = yz.g2.f100423a
                return r13
            L8b:
                com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl r13 = r12.f13863d
                v4.l r13 = com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl.Z2(r13)
                kotlinx.coroutines.flow.m0 r13 = r13.b()
                java.lang.Object r13 = r13.getValue()
                boolean r1 = r13 instanceof k3.u2.a
                if (r1 == 0) goto Lae
                com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl r13 = r12.f13863d
                w4.j r13 = com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl.a3(r13)
                r12.f13860a = r1
                r12.f13861b = r4
                java.lang.Object r13 = r13.n(r12)
                if (r13 != r0) goto Lae
                goto Ld9
            Lae:
                com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl r13 = r12.f13863d
                u3.a r13 = com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl.V2(r13)
                com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl$j$a r4 = new com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl$j$a
                com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl r5 = r12.f13863d
                r6 = 0
                r4.<init>(r5, r6)
                r12.f13860a = r1
                r12.f13861b = r3
                java.lang.Object r13 = r13.d(r4, r12)
                if (r13 != r0) goto Lc7
                goto Ld9
            Lc7:
                if (r1 != 0) goto Lda
                com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl r13 = r12.f13863d
                w4.j r13 = com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl.a3(r13)
                r12.f13860a = r1
                r12.f13861b = r2
                java.lang.Object r13 = r13.n(r12)
                if (r13 != r0) goto Lda
            Ld9:
                return r0
            Lda:
                z6.b r1 = z6.b.f101032b
                r5 = 4
                r6 = 0
                java.lang.String r2 = "SentenceHomeVM"
                java.lang.String r3 = "enterHome: completed"
                r4 = 0
                z6.b.d(r1, r2, r3, r4, r5, r6)
                yz.g2 r13 = yz.g2.f100423a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl", f = "SentenceHomeVMImpl.kt", i = {0, 0, 1, 1, 2, 2, 3, 3}, l = {R.styleable.Theme_drawable_right_arrow, 217, 218, R.styleable.Theme_drawable_share_close}, m = "fullRefresh", n = {"$this$fullRefresh_u24lambda_u240", "$i$a$-runCatching-SentenceHomeVMImpl$fullRefresh$2", "$this$fullRefresh_u24lambda_u240", "$i$a$-runCatching-SentenceHomeVMImpl$fullRefresh$2", "$this$fullRefresh_u24lambda_u240", "$i$a$-runCatching-SentenceHomeVMImpl$fullRefresh$2", "it", "$i$a$-onFailure-SentenceHomeVMImpl$fullRefresh$3"}, s = {"L$0", "I$0", "L$0", "I$0", "L$0", "I$0", "L$1", "I$0"}, v = 1)
    public static final class k extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f13866a;

        /* renamed from: b, reason: collision with root package name */
        public Object f13867b;

        /* renamed from: c, reason: collision with root package name */
        public int f13868c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f13869d;

        /* renamed from: f, reason: collision with root package name */
        public int f13871f;

        public k(j00.c<? super k> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f13869d = obj;
            this.f13871f |= Integer.MIN_VALUE;
            return SentenceHomeVMImpl.this.k3(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl", f = "SentenceHomeVMImpl.kt", i = {0, 0}, l = {R.styleable.Theme_drawable_syncview_error}, m = "incrementalRefresh", n = {"$this$incrementalRefresh_u24lambda_u240", "$i$a$-runCatching-SentenceHomeVMImpl$incrementalRefresh$2"}, s = {"L$0", "I$0"}, v = 1)
    public static final class l extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f13872a;

        /* renamed from: b, reason: collision with root package name */
        public int f13873b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f13874c;

        /* renamed from: e, reason: collision with root package name */
        public int f13876e;

        public l(j00.c<? super l> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f13874c = obj;
            this.f13876e |= Integer.MIN_VALUE;
            return SentenceHomeVMImpl.this.m3(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl", f = "SentenceHomeVMImpl.kt", i = {1, 2, 3, 4, 5, 6, 7, 7, 7}, l = {R.styleable.Theme_drawable_tab_mall_1111, R.styleable.Theme_drawable_tab_review, R.styleable.Theme_drawable_tab_surrounding, 240, R.styleable.Theme_drawable_time, 243, e3.a.f48454z, e3.a.A}, m = "loadInitialData", n = {"curSkuId", "curSkuId", "curSkuId", "curSkuId", "curSkuId", "curSkuId", "it", "curSkuId", "$i$a$-also-SentenceHomeVMImpl$loadInitialData$4"}, s = {"I$0", "I$0", "I$0", "I$0", "I$0", "I$0", "L$1", "I$0", "I$1"}, v = 1)
    public static final class m extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f13877a;

        /* renamed from: b, reason: collision with root package name */
        public int f13878b;

        /* renamed from: c, reason: collision with root package name */
        public Object f13879c;

        /* renamed from: d, reason: collision with root package name */
        public Object f13880d;

        /* renamed from: e, reason: collision with root package name */
        public Object f13881e;

        /* renamed from: f, reason: collision with root package name */
        public Object f13882f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f13883g;

        /* renamed from: i, reason: collision with root package name */
        public int f13885i;

        public m(j00.c<? super m> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f13883g = obj;
            this.f13885i |= Integer.MIN_VALUE;
            return SentenceHomeVMImpl.this.n3(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl$loadInitialData$2", f = "SentenceHomeVMImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class n extends SuspendLambda implements x00.r<h5.a1, o0, h5.z, j00.c<? super u4.e>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f13886a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f13887b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f13888c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f13889d;

        public n(j00.c<? super n> cVar) {
            super(4, cVar);
        }

        @Override // x00.r
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(h5.a1 a1Var, o0 o0Var, h5.z zVar, j00.c<? super u4.e> cVar) {
            n nVar = new n(cVar);
            nVar.f13887b = a1Var;
            nVar.f13888c = o0Var;
            nVar.f13889d = zVar;
            return nVar.invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            h5.a1 a1Var = (h5.a1) this.f13887b;
            o0 o0Var = (o0) this.f13888c;
            h5.z zVar = (h5.z) this.f13889d;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f13886a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            z6.b.d(z6.b.f101032b, com.baicizhan.app.biz.game.impl.home.sentence.c.f13944a, "loadInitialData: s r n sale", null, 4, null);
            return new u4.e(a1Var, o0Var, zVar, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl$loadInitialData$3", f = "SentenceHomeVMImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class o extends SuspendLambda implements x00.s<w0, j0, h5.s, u4.e, j00.c<? super a.b>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f13890a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f13891b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f13892c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f13893d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f13894e;

        public o(j00.c<? super o> cVar) {
            super(5, cVar);
        }

        @Override // x00.s
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(w0 w0Var, j0 j0Var, h5.s sVar, u4.e eVar, j00.c<? super a.b> cVar) {
            o oVar = SentenceHomeVMImpl.this.new o(cVar);
            oVar.f13891b = w0Var;
            oVar.f13892c = j0Var;
            oVar.f13893d = sVar;
            oVar.f13894e = eVar;
            return oVar.invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            w0 w0Var = (w0) this.f13891b;
            j0 j0Var = (j0) this.f13892c;
            h5.s sVar = (h5.s) this.f13893d;
            u4.e eVar = (u4.e) this.f13894e;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f13890a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            return new a.b(new v4.b(j0Var, w0Var, sVar, eVar.j(), eVar.i(), SentenceHomeVMImpl.this.g3(eVar.i().f()), SentenceHomeVMImpl.this.h3(), eVar.g(), SentenceHomeVMImpl.this.f13788z, eVar.h(), w3.g.n()));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl$observeDataUpdates$10", f = "SentenceHomeVMImpl.kt", i = {0}, l = {319}, m = "invokeSuspend", n = {"it"}, s = {"L$0"}, v = 1)
    public static final class p extends SuspendLambda implements x00.q<kotlinx.coroutines.flow.j<? super v4.a>, Throwable, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f13896a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f13897b;

        public p(j00.c<? super p> cVar) {
            super(3, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th2 = (Throwable) this.f13897b;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f13896a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                z6.b.f101032b.e(com.baicizhan.app.biz.game.impl.home.sentence.c.f13944a, "observeDataUpdates: data binding error", th2);
                SentenceHomeVMImpl.this.f13786x = null;
                v4.l lVar = SentenceHomeVMImpl.this.f13764b;
                a.C1250a c1250a = new a.C1250a(th2, SentenceHomeVMImpl.this.f13787y);
                this.f13897b = l00.k.a(th2);
                this.f13896a = 1;
                if (lVar.a(c1250a, this) == l11) {
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
        public final Object invoke(kotlinx.coroutines.flow.j<? super v4.a> jVar, Throwable th2, j00.c<? super g2> cVar) {
            p pVar = SentenceHomeVMImpl.this.new p(cVar);
            pVar.f13897b = th2;
            return pVar.invokeSuspend(g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl", f = "SentenceHomeVMImpl.kt", i = {}, l = {282, 286, 293, 296, 305}, m = "observeDataUpdates", n = {}, s = {}, v = 1)
    public static final class q extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f13899a;

        /* renamed from: b, reason: collision with root package name */
        public Object f13900b;

        /* renamed from: c, reason: collision with root package name */
        public Object f13901c;

        /* renamed from: d, reason: collision with root package name */
        public int f13902d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f13903e;

        /* renamed from: g, reason: collision with root package name */
        public int f13905g;

        public q(j00.c<? super q> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f13903e = obj;
            this.f13905g |= Integer.MIN_VALUE;
            return SentenceHomeVMImpl.this.o3(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl$observeDataUpdates$2", f = "SentenceHomeVMImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class r extends SuspendLambda implements x00.q<w0, Integer, j00.c<? super a.i>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f13906a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f13907b;

        public r(j00.c<? super r> cVar) {
            super(3, cVar);
        }

        public final Object i(w0 w0Var, int i11, j00.c<? super a.i> cVar) {
            r rVar = new r(cVar);
            rVar.f13907b = w0Var;
            return rVar.invokeSuspend(g2.f100423a);
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ Object invoke(w0 w0Var, Integer num, j00.c<? super a.i> cVar) {
            return i(w0Var, num.intValue(), cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            w0 w0Var = (w0) this.f13907b;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f13906a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            return new a.i(w0Var, w3.g.n());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl$observeDataUpdates$9", f = "SentenceHomeVMImpl.kt", i = {0}, l = {313}, m = "invokeSuspend", n = {"it"}, s = {"L$0"}, v = 1)
    public static final class s extends SuspendLambda implements x00.p<v4.a, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f13908a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f13909b;

        public s(j00.c<? super s> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            s sVar = SentenceHomeVMImpl.this.new s(cVar);
            sVar.f13909b = obj;
            return sVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(v4.a aVar, j00.c<? super g2> cVar) {
            return ((s) create(aVar, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            v4.a aVar = (v4.a) this.f13909b;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f13908a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                v4.l lVar = SentenceHomeVMImpl.this.f13764b;
                this.f13909b = l00.k.a(aVar);
                this.f13908a = 1;
                if (lVar.a(aVar, this) == l11) {
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
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl", f = "SentenceHomeVMImpl.kt", i = {0, 1}, l = {206, 208}, m = "refreshData", n = {"showContent", "showContent"}, s = {"I$0", "I$0"}, v = 1)
    public static final class t extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f13911a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f13912b;

        /* renamed from: d, reason: collision with root package name */
        public int f13914d;

        public t(j00.c<? super t> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f13912b = obj;
            this.f13914d |= Integer.MIN_VALUE;
            return SentenceHomeVMImpl.this.p3(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class u implements l3.g2 {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl$retry$1", f = "SentenceHomeVMImpl.kt", i = {1, 1}, l = {329, 331}, m = "execute", n = {"$this$execute_u24lambda_u240", "$i$a$-runCatching-SentenceHomeVMImpl$retry$1$execute$2"}, s = {"L$0", "I$0"}, v = 1)
        public static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            public Object f13916a;

            /* renamed from: b, reason: collision with root package name */
            public int f13917b;

            /* renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f13918c;

            /* renamed from: e, reason: collision with root package name */
            public int f13920e;

            public a(j00.c<? super a> cVar) {
                super(cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f13918c = obj;
                this.f13920e |= Integer.MIN_VALUE;
                return u.this.a(this);
            }
        }

        public u() {
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:(5:11|12|13|14|15)(2:18|19))(1:20))(1:25)|21|22))|30|6|7|(0)(0)|21|22) */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
        
            if (r12.K0(true, r0) != r1) goto L27;
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
                boolean r0 = r12 instanceof com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl.u.a
                if (r0 == 0) goto L13
                r0 = r12
                com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl$u$a r0 = (com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl.u.a) r0
                int r1 = r0.f13920e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f13920e = r1
                goto L18
            L13:
                com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl$u$a r0 = new com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl$u$a
                r0.<init>(r12)
            L18:
                java.lang.Object r12 = r0.f13918c
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.f13920e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3f
                if (r2 == r4) goto L3b
                if (r2 != r3) goto L33
                java.lang.Object r0 = r0.f13916a
                com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl$u r0 = (com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl.u) r0
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
                java.lang.String r6 = "SentenceHomeVM"
                java.lang.String r7 = "retry: executing"
                r8 = 0
                z6.b.j(r5, r6, r7, r8, r9, r10)
                com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl r12 = com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl.this
                v4.l r12 = com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl.Z2(r12)
                v4.a$c r2 = v4.a.c.f92924a
                r0.f13920e = r4
                java.lang.Object r12 = r12.a(r2, r0)
                if (r12 != r1) goto L5f
                goto L74
            L5f:
                com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl r12 = com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl.this
                kotlin.Result$a r2 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L30
                java.lang.Object r2 = l00.k.a(r11)     // Catch: java.lang.Throwable -> L30
                r0.f13916a = r2     // Catch: java.lang.Throwable -> L30
                r2 = 0
                r0.f13917b = r2     // Catch: java.lang.Throwable -> L30
                r0.f13920e = r3     // Catch: java.lang.Throwable -> L30
                java.lang.Object r12 = r12.K0(r4, r0)     // Catch: java.lang.Throwable -> L30
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
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl.u.a(j00.c):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 SentenceHomeVMImpl.kt\ncom/baicizhan/app/biz/game/impl/home/sentence/SentenceHomeVMImpl\n*L\n1#1,49:1\n106#2,2:50\n*E\n"})
    public static final class v extends kotlin.coroutines.a implements n0 {
        public v(n0.b bVar) {
            super(bVar);
        }

        @Override // c40.n0
        public void handleException(kotlin.coroutines.d dVar, Throwable th2) {
            z6.b.f101032b.e(com.baicizhan.app.biz.game.impl.home.sentence.c.f13944a, "Uncaught exception in viewModelScope", th2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl", f = "SentenceHomeVMImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {163}, m = "travel", n = {"tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-SentenceHomeVMImpl$travel$2", "$i$f$bizCatch", "$i$a$-bizCatch-SentenceHomeVMImpl$travel$2$1"}, s = {"L$0", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class w extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f13921a;

        /* renamed from: b, reason: collision with root package name */
        public int f13922b;

        /* renamed from: c, reason: collision with root package name */
        public int f13923c;

        /* renamed from: d, reason: collision with root package name */
        public int f13924d;

        /* renamed from: e, reason: collision with root package name */
        public int f13925e;

        /* renamed from: f, reason: collision with root package name */
        public long f13926f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f13927g;

        /* renamed from: i, reason: collision with root package name */
        public int f13929i;

        public w(j00.c<? super w> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f13927g = obj;
            this.f13929i |= Integer.MIN_VALUE;
            return SentenceHomeVMImpl.this.c(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl$travel$2$1$1", f = "SentenceHomeVMImpl.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class x extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f13930a;

        public x(j00.c<? super x> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return SentenceHomeVMImpl.this.new x(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((x) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f13930a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                com.baicizhan.app.biz.game.uc.ipavatar.i iVar = SentenceHomeVMImpl.this.f13777o;
                this.f13930a = 1;
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

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl", f = "SentenceHomeVMImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {176}, m = "unLockStudyBuddy", n = {"tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-SentenceHomeVMImpl$unLockStudyBuddy$2", "$i$f$bizCatch", "$i$a$-bizCatch-SentenceHomeVMImpl$unLockStudyBuddy$2$1"}, s = {"L$0", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class y extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f13932a;

        /* renamed from: b, reason: collision with root package name */
        public int f13933b;

        /* renamed from: c, reason: collision with root package name */
        public int f13934c;

        /* renamed from: d, reason: collision with root package name */
        public int f13935d;

        /* renamed from: e, reason: collision with root package name */
        public int f13936e;

        /* renamed from: f, reason: collision with root package name */
        public long f13937f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f13938g;

        /* renamed from: i, reason: collision with root package name */
        public int f13940i;

        public y(j00.c<? super y> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f13938g = obj;
            this.f13940i |= Integer.MIN_VALUE;
            return SentenceHomeVMImpl.this.f(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl$unLockStudyBuddy$2$1$1", f = "SentenceHomeVMImpl.kt", i = {}, l = {177}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class z extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f13941a;

        public z(j00.c<? super z> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return SentenceHomeVMImpl.this.new z(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((z) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f13941a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                w4.j jVar = SentenceHomeVMImpl.this.f13779q;
                this.f13941a = 1;
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

    /* JADX WARN: Multi-variable type inference failed */
    public SentenceHomeVMImpl(@m80.k v4.l stateStore, @m80.k t6.a sentenceLaunchSyncUC, @m80.k com.baicizhan.app.biz.game.uc.sentence.i observerSentenceJourneyUC, @m80.k ObserveUserGameInfoWithoutRewardUC observeUserGameInfoWithoutRewardUC, @m80.k com.baicizhan.app.biz.game.uc.sentence.b consumeSentenceEnergyUC, @m80.k com.baicizhan.app.biz.game.uc.incentive.o observeRankUC, @m80.k ObserveStreakTasksUC observeStreakTasksUC, @m80.k t5.a notifyRepo, @m80.k com.baicizhan.app.biz.game.uc.incentive.r setRankReadTimeUC, @m80.k com.baicizhan.app.biz.game.uc.incentive.m markTaskPopupShownUC, @m80.k com.baicizhan.app.biz.game.uc.user.e getLegalCurrentSkuIdUC, @m80.k ObserveUserCurrentSkuIdUC observeUserCurrentSkuIdUC, @m80.k ObserveIpAvatarUC observeIpAvatarUC, @m80.k com.baicizhan.app.biz.game.uc.ipavatar.i sendBuddyTravelUC, @m80.k com.baicizhan.app.biz.game.uc.ipavatar.a claimTravelRewardUC) {
        g0.p(stateStore, "stateStore");
        g0.p(sentenceLaunchSyncUC, "sentenceLaunchSyncUC");
        g0.p(observerSentenceJourneyUC, "observerSentenceJourneyUC");
        g0.p(observeUserGameInfoWithoutRewardUC, "observeUserGameInfoWithoutRewardUC");
        g0.p(consumeSentenceEnergyUC, "consumeSentenceEnergyUC");
        g0.p(observeRankUC, "observeRankUC");
        g0.p(observeStreakTasksUC, "observeStreakTasksUC");
        g0.p(notifyRepo, "notifyRepo");
        g0.p(setRankReadTimeUC, "setRankReadTimeUC");
        g0.p(markTaskPopupShownUC, "markTaskPopupShownUC");
        g0.p(getLegalCurrentSkuIdUC, "getLegalCurrentSkuIdUC");
        g0.p(observeUserCurrentSkuIdUC, "observeUserCurrentSkuIdUC");
        g0.p(observeIpAvatarUC, "observeIpAvatarUC");
        g0.p(sendBuddyTravelUC, "sendBuddyTravelUC");
        g0.p(claimTravelRewardUC, "claimTravelRewardUC");
        this.f13764b = stateStore;
        this.f13765c = sentenceLaunchSyncUC;
        this.f13766d = observerSentenceJourneyUC;
        this.f13767e = observeUserGameInfoWithoutRewardUC;
        this.f13768f = consumeSentenceEnergyUC;
        this.f13769g = observeRankUC;
        this.f13770h = observeStreakTasksUC;
        this.f13771i = notifyRepo;
        this.f13772j = setRankReadTimeUC;
        this.f13773k = markTaskPopupShownUC;
        this.f13774l = getLegalCurrentSkuIdUC;
        this.f13775m = observeUserCurrentSkuIdUC;
        this.f13776n = observeIpAvatarUC;
        this.f13777o = sendBuddyTravelUC;
        this.f13778p = claimTravelRewardUC;
        w4.j jVar = (w4.j) (this instanceof pa0.c ? ((pa0.c) this).getScope() : r().P().h()).i(kotlin.jvm.internal.o0.d(w4.j.class), null, new x00.a() { // from class: com.baicizhan.app.biz.game.impl.home.sentence.b
            @Override // x00.a
            public final Object invoke() {
                ya0.a q32;
                q32 = SentenceHomeVMImpl.q3();
                return q32;
            }
        });
        this.f13779q = jVar;
        kotlinx.coroutines.flow.y<Boolean> a11 = kotlinx.coroutines.flow.o0.a(Boolean.TRUE);
        this.f13780r = a11;
        r0 a12 = c40.s0.a(c4.o.c().plus(l3.c(null, 1, null)).plus(new v(n0.f7891d0)));
        this.f13781s = a12;
        this.f13782t = kotlinx.coroutines.flow.k.Q1(kotlinx.coroutines.flow.k.f2(a11, new SentenceHomeVMImpl$special$$inlined$flatMapLatest$1(null, this)), a12, h0.f68148a.c(), new u2.c(0, 1, null));
        this.f13783u = jVar.k();
        this.f13784v = new u3.a<>(a12);
        this.f13785w = kotlinx.coroutines.flow.o0.a(0);
        this.f13787y = new u();
        this.f13788z = new a();
    }

    public static final ya0.a q3() {
        return ya0.b.d(UIEffectStrategyType.SENTENCE);
    }

    @Override // k3.v2
    @m80.k
    public l3.m F2(@m80.k x00.l<? super u2, g2> onState) {
        g0.p(onState, "onState");
        return u4.c.a(onState, kotlinx.coroutines.flow.k.c0(getState(), 100L), com.baicizhan.app.biz.game.impl.home.sentence.c.f13944a);
    }

    @Override // k3.v2
    @m80.l
    public Object I(@m80.k j00.c<? super g2> cVar) {
        i3();
        return g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2 A[Catch: all -> 0x00ca, TryCatch #2 {all -> 0x00ca, blocks: (B:22:0x00ab, B:24:0x00b2, B:26:0x00b6, B:28:0x00ba, B:30:0x00be, B:32:0x00c2, B:43:0x0129, B:34:0x00cd, B:36:0x00d8, B:38:0x00ec, B:40:0x0100, B:42:0x0115), top: B:21:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0115 A[Catch: all -> 0x00ca, TryCatch #2 {all -> 0x00ca, blocks: (B:22:0x00ab, B:24:0x00b2, B:26:0x00b6, B:28:0x00ba, B:30:0x00be, B:32:0x00c2, B:43:0x0129, B:34:0x00cd, B:36:0x00d8, B:38:0x00ec, B:40:0x0100, B:42:0x0115), top: B:21:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.v2
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object K0(boolean r11, @m80.k j00.c<? super yz.g2> r12) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl.K0(boolean, j00.c):java.lang.Object");
    }

    @Override // k3.v2
    @m80.l
    public Object X(@m80.k j00.c<? super g2> cVar) {
        Object l11 = this.f13779q.l(cVar);
        return l11 == kotlin.coroutines.intrinsics.b.l() ? l11 : g2.f100423a;
    }

    @Override // k3.v2
    @m80.k
    public l3.m Y1(@m80.k x00.l<? super l3.o, g2> onEffect) {
        g0.p(onEffect, "onEffect");
        return u4.c.a(onEffect, u(), com.baicizhan.app.biz.game.impl.home.sentence.c.f13944a);
    }

    @Override // k3.v2
    @m80.l
    public Object b1(@m80.k j00.c<? super g2> cVar) {
        j3(0L);
        return g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00af A[Catch: all -> 0x00c7, TryCatch #2 {all -> 0x00c7, blocks: (B:22:0x00a8, B:24:0x00af, B:26:0x00b3, B:28:0x00b7, B:30:0x00bb, B:32:0x00bf, B:43:0x0126, B:34:0x00ca, B:36:0x00d5, B:38:0x00e9, B:40:0x00fd, B:42:0x0112), top: B:21:0x00a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0112 A[Catch: all -> 0x00c7, TryCatch #2 {all -> 0x00c7, blocks: (B:22:0x00a8, B:24:0x00af, B:26:0x00b3, B:28:0x00b7, B:30:0x00bb, B:32:0x00bf, B:43:0x0126, B:34:0x00ca, B:36:0x00d5, B:38:0x00e9, B:40:0x00fd, B:42:0x0112), top: B:21:0x00a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.v2
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
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl.c(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00af A[Catch: all -> 0x00c7, TryCatch #2 {all -> 0x00c7, blocks: (B:22:0x00a8, B:24:0x00af, B:26:0x00b3, B:28:0x00b7, B:30:0x00bb, B:32:0x00bf, B:43:0x0126, B:34:0x00ca, B:36:0x00d5, B:38:0x00e9, B:40:0x00fd, B:42:0x0112), top: B:21:0x00a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0112 A[Catch: all -> 0x00c7, TryCatch #2 {all -> 0x00c7, blocks: (B:22:0x00a8, B:24:0x00af, B:26:0x00b3, B:28:0x00b7, B:30:0x00bb, B:32:0x00bf, B:43:0x0126, B:34:0x00ca, B:36:0x00d5, B:38:0x00e9, B:40:0x00fd, B:42:0x0112), top: B:21:0x00a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.v2
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
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl.f(j00.c):java.lang.Object");
    }

    public final l3.g2 g3(RankType rankType) {
        return new f(rankType);
    }

    @Override // k3.v2
    @m80.k
    public m0<u2> getState() {
        return this.f13782t;
    }

    public final l3.g2 h3() {
        return new g();
    }

    public final void i3() {
        z6.b.d(z6.b.f101032b, com.baicizhan.app.biz.game.impl.home.sentence.c.f13944a, "disableDataSending: data sending disabled", null, 4, null);
        this.f13780r.setValue(Boolean.FALSE);
    }

    public final void j3(long j11) {
        z6.b.d(z6.b.f101032b, com.baicizhan.app.biz.game.impl.home.sentence.c.f13944a, "enableDataSending: data sending enabled", null, 4, null);
        if (j11 != 0) {
            c40.k.f(this.f13781s, null, null, new h(j11, this, null), 3, null);
        } else {
            this.f13780r.setValue(Boolean.TRUE);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|8|(1:(1:(1:(1:(3:14|15|16)(2:18|19))(7:20|21|22|23|(1:25)|15|16))(9:29|30|31|(2:33|27)|22|23|(0)|15|16))(2:34|35))(3:40|41|(2:43|27)(1:44))|36|(2:38|27)(8:39|31|(0)|22|23|(0)|15|16)))|47|6|7|8|(0)(0)|36|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00da, code lost:
    
        if (r5.a(r6, r15) == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x004a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a8, code lost:
    
        r2 = kotlin.Result.Companion;
        r0 = kotlin.Result.m6308constructorimpl(kotlin.e.a(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k3(j00.c<? super yz.g2> r15) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl.k3(j00.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:20|21))(3:22|23|(1:25))|12|13|(1:15)|16|17))|29|6|7|(0)(0)|12|13|(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        r0 = kotlin.Result.Companion;
        r11 = kotlin.Result.m6308constructorimpl(kotlin.e.a(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m3(j00.c<? super yz.g2> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl.l
            if (r0 == 0) goto L13
            r0 = r11
            com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl$l r0 = (com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl.l) r0
            int r1 = r0.f13876e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13876e = r1
            goto L18
        L13:
            com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl$l r0 = new com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl$l
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f13874c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f13876e
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.f13872a
            com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl r0 = (com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl) r0
            kotlin.e.n(r11)     // Catch: java.lang.Throwable -> L2d
            goto L5d
        L2d:
            r0 = move-exception
            r11 = r0
            goto L64
        L30:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L38:
            kotlin.e.n(r11)
            z6.b r4 = z6.b.f101032b
            r8 = 4
            r9 = 0
            java.lang.String r5 = "SentenceHomeVM"
            java.lang.String r6 = "incrementalRefresh: starting"
            r7 = 0
            z6.b.d(r4, r5, r6, r7, r8, r9)
            kotlin.Result$a r11 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L2d
            t6.a r11 = r10.f13765c     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r2 = l00.k.a(r10)     // Catch: java.lang.Throwable -> L2d
            r0.f13872a = r2     // Catch: java.lang.Throwable -> L2d
            r2 = 0
            r0.f13873b = r2     // Catch: java.lang.Throwable -> L2d
            r0.f13876e = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r11 = r11.f(r2, r0)     // Catch: java.lang.Throwable -> L2d
            if (r11 != r1) goto L5d
            return r1
        L5d:
            yz.g2 r11 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r11 = kotlin.Result.m6308constructorimpl(r11)     // Catch: java.lang.Throwable -> L2d
            goto L6e
        L64:
            kotlin.Result$a r0 = kotlin.Result.Companion
            java.lang.Object r11 = kotlin.e.a(r11)
            java.lang.Object r11 = kotlin.Result.m6308constructorimpl(r11)
        L6e:
            java.lang.Throwable r11 = kotlin.Result.m6311exceptionOrNullimpl(r11)
            if (r11 == 0) goto L7d
            z6.b r0 = z6.b.f101032b
            java.lang.String r1 = "SentenceHomeVM"
            java.lang.String r2 = "incrementalRefresh: failed"
            r0.e(r1, r2, r11)
        L7d:
            yz.g2 r11 = yz.g2.f100423a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl.m3(j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x018c, code lost:
    
        if (r4.a(r3, r0) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x016f, code lost:
    
        if (r12 == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0134, code lost:
    
        if (r12 != r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f4, code lost:
    
        if (r12 != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a4, code lost:
    
        if (r12 == r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n3(j00.c<? super yz.g2> r12) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl.n3(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o3(j00.c<? super yz.g2> r22) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl.o3(j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (k3(r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        if (m3(r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p3(j00.c<? super yz.g2> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl.t
            if (r0 == 0) goto L13
            r0 = r12
            com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl$t r0 = (com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl.t) r0
            int r1 = r0.f13914d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13914d = r1
            goto L18
        L13:
            com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl$t r0 = new com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl$t
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f13912b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f13914d
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
            v4.l r12 = r11.f13764b
            kotlinx.coroutines.flow.m0 r12 = r12.b()
            java.lang.Object r12 = r12.getValue()
            boolean r12 = r12 instanceof k3.u2.a
            z6.b r5 = z6.b.f101032b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "refreshData: starting, showContent="
            r2.append(r6)
            r2.append(r12)
            java.lang.String r7 = r2.toString()
            r9 = 4
            r10 = 0
            java.lang.String r6 = "SentenceHomeVM"
            r8 = 0
            z6.b.d(r5, r6, r7, r8, r9, r10)
            if (r12 != 0) goto L6c
            r0.f13911a = r12
            r0.f13914d = r4
            java.lang.Object r12 = r11.k3(r0)
            if (r12 != r1) goto L77
            goto L76
        L6c:
            r0.f13911a = r12
            r0.f13914d = r3
            java.lang.Object r12 = r11.m3(r0)
            if (r12 != r1) goto L77
        L76:
            return r1
        L77:
            z6.b r2 = z6.b.f101032b
            r6 = 4
            r7 = 0
            java.lang.String r3 = "SentenceHomeVM"
            java.lang.String r4 = "refreshData: completed"
            r5 = 0
            z6.b.d(r2, r3, r4, r5, r6, r7)
            yz.g2 r12 = yz.g2.f100423a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl.p3(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b0 A[Catch: all -> 0x00c8, TryCatch #2 {all -> 0x00c8, blocks: (B:22:0x00a9, B:24:0x00b0, B:26:0x00b4, B:28:0x00b8, B:30:0x00bc, B:32:0x00c0, B:43:0x0127, B:34:0x00cb, B:36:0x00d6, B:38:0x00ea, B:40:0x00fe, B:42:0x0113), top: B:21:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0113 A[Catch: all -> 0x00c8, TryCatch #2 {all -> 0x00c8, blocks: (B:22:0x00a9, B:24:0x00b0, B:26:0x00b4, B:28:0x00b8, B:30:0x00bc, B:32:0x00c0, B:43:0x0127, B:34:0x00cb, B:36:0x00d6, B:38:0x00ea, B:40:0x00fe, B:42:0x0113), top: B:21:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.v2
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
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl.q(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b0 A[Catch: all -> 0x00c8, TryCatch #2 {all -> 0x00c8, blocks: (B:22:0x00a9, B:24:0x00b0, B:26:0x00b4, B:28:0x00b8, B:30:0x00bc, B:32:0x00c0, B:43:0x0127, B:34:0x00cb, B:36:0x00d6, B:38:0x00ea, B:40:0x00fe, B:42:0x0113), top: B:21:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0113 A[Catch: all -> 0x00c8, TryCatch #2 {all -> 0x00c8, blocks: (B:22:0x00a9, B:24:0x00b0, B:26:0x00b4, B:28:0x00b8, B:30:0x00bc, B:32:0x00c0, B:43:0x0127, B:34:0x00cb, B:36:0x00d6, B:38:0x00ea, B:40:0x00fe, B:42:0x0113), top: B:21:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.v2
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object q1(@m80.k j00.c<? super p.a<java.lang.Integer>> r12) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.impl.home.sentence.SentenceHomeVMImpl.q1(j00.c):java.lang.Object");
    }

    @Override // c4.j, pa0.a
    @m80.k
    public /* bridge */ na0.a r() {
        return super.r();
    }

    @Override // k3.v2
    @m80.k
    public c0<l3.o> u() {
        return this.f13783u;
    }

    public static /* synthetic */ void l3() {
    }
}
