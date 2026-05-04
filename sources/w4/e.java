package w4;

import c40.r0;
import com.baicizhan.app.biz.base.BizInternalException;
import com.baicizhan.app.biz.game.repo.userguide.UserGuideType;
import com.baicizhan.app.biz.game.uc.ipavatar.ObserveIpAvatarUC;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l3.o;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
@u0({"SMAP\nBuddyGuideCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuddyGuideCollector.kt\ncom/baicizhan/app/biz/game/impl/home/uieffect/BuddyGuideCollector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n1#2:143\n*E\n"})
/* loaded from: classes3.dex */
public final class e implements c4.j {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final b6.a f94835b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final q5.a f94836c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final ObserveIpAvatarUC f94837d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.ipavatar.j f94838e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.ipavatar.e f94839f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.BuddyGuideCollector", f = "BuddyGuideCollector.kt", i = {0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {44, 46, 46}, m = "collectGetStudyBuddyGuideEffect$biz_release", n = {"it", "$i$a$-takeIf-BuddyGuideCollector$collectGetStudyBuddyGuideEffect$2", "it", "$this$collectGetStudyBuddyGuideEffect_u24lambda_u241_u240", "$i$a$-let-BuddyGuideCollector$collectGetStudyBuddyGuideEffect$3", "$i$a$-runCatching-BuddyGuideCollector$collectGetStudyBuddyGuideEffect$3$1", "it", "$this$collectGetStudyBuddyGuideEffect_u24lambda_u241_u240", "$i$a$-let-BuddyGuideCollector$collectGetStudyBuddyGuideEffect$3", "$i$a$-runCatching-BuddyGuideCollector$collectGetStudyBuddyGuideEffect$3$1"}, s = {"L$1", "I$0", "L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f94840a;

        /* renamed from: b, reason: collision with root package name */
        public Object f94841b;

        /* renamed from: c, reason: collision with root package name */
        public int f94842c;

        /* renamed from: d, reason: collision with root package name */
        public int f94843d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f94844e;

        /* renamed from: g, reason: collision with root package name */
        public int f94846g;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f94844e = obj;
            this.f94846g |= Integer.MIN_VALUE;
            return e.this.e(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.BuddyGuideCollector$collectGetStudyBuddyGuideEffect$3$1$1$1", f = "BuddyGuideCollector.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f94847a;

        public b(j00.c<? super b> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return e.this.new b(cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super g2> cVar) {
            return ((b) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f94847a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                b6.a aVar = e.this.f94835b;
                UserGuideType userGuideType = UserGuideType.GetStudyBuddyGuide;
                this.f94847a = 1;
                if (aVar.a(userGuideType, this) == l11) {
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
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.BuddyGuideCollector", f = "BuddyGuideCollector.kt", i = {0, 0, 1, 1, 1, 1}, l = {125, 127}, m = "collectPetCookieEarningGuideEffect$biz_release", n = {"it", "$i$a$-takeIf-BuddyGuideCollector$collectPetCookieEarningGuideEffect$2", "it", "$this$collectPetCookieEarningGuideEffect_u24lambda_u241_u240", "$i$a$-let-BuddyGuideCollector$collectPetCookieEarningGuideEffect$3", "$i$a$-runCatching-BuddyGuideCollector$collectPetCookieEarningGuideEffect$3$1"}, s = {"L$1", "I$0", "L$0", "L$1", "I$0", "I$1"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f94849a;

        /* renamed from: b, reason: collision with root package name */
        public Object f94850b;

        /* renamed from: c, reason: collision with root package name */
        public int f94851c;

        /* renamed from: d, reason: collision with root package name */
        public int f94852d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f94853e;

        /* renamed from: g, reason: collision with root package name */
        public int f94855g;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f94853e = obj;
            this.f94855g |= Integer.MIN_VALUE;
            return e.this.f(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.BuddyGuideCollector$collectPetCookieEarningGuideEffect$3$1$1", f = "BuddyGuideCollector.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class d extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f94856a;

        public d(j00.c<? super d> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return e.this.new d(cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super g2> cVar) {
            return ((d) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f94856a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                b6.a aVar = e.this.f94835b;
                UserGuideType userGuideType = UserGuideType.PetCookieEarningGuide;
                this.f94856a = 1;
                if (aVar.a(userGuideType, this) == l11) {
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
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.BuddyGuideCollector", f = "BuddyGuideCollector.kt", i = {0, 0, 0}, l = {96}, m = "collectSendBuddyTravelGuideEffect$biz_release", n = {"scope", "it", "$i$a$-takeIf-BuddyGuideCollector$collectSendBuddyTravelGuideEffect$2"}, s = {"L$0", "L$2", "I$0"}, v = 1)
    /* renamed from: w4.e$e, reason: collision with other inner class name */
    public static final class C1276e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f94858a;

        /* renamed from: b, reason: collision with root package name */
        public Object f94859b;

        /* renamed from: c, reason: collision with root package name */
        public Object f94860c;

        /* renamed from: d, reason: collision with root package name */
        public int f94861d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f94862e;

        /* renamed from: g, reason: collision with root package name */
        public int f94864g;

        public C1276e(j00.c<? super C1276e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f94862e = obj;
            this.f94864g |= Integer.MIN_VALUE;
            return e.this.g(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.BuddyGuideCollector$collectSendBuddyTravelGuideEffect$3$1$deferredEffect$1", f = "BuddyGuideCollector.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class f extends SuspendLambda implements x00.p<r0, j00.c<? super o.r>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f94865a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.BuddyGuideCollector$collectSendBuddyTravelGuideEffect$3$1$deferredEffect$1$1", f = "BuddyGuideCollector.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f94867a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f94868b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar, j00.c<? super a> cVar) {
                super(1, cVar);
                this.f94868b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(j00.c<?> cVar) {
                return new a(this.f94868b, cVar);
            }

            @Override // x00.l
            public final Object invoke(j00.c<? super g2> cVar) {
                return ((a) create(cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f94867a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    b6.a aVar = this.f94868b.f94835b;
                    UserGuideType userGuideType = UserGuideType.SendBuddyTravelGuide;
                    this.f94867a = 1;
                    if (aVar.a(userGuideType, this) == l11) {
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

        public f(j00.c<? super f> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return e.this.new f(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super o.r> cVar) {
            return ((f) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f94865a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                q5.a aVar = e.this.f94836c;
                this.f94865a = 1;
                obj = aVar.a(this);
                if (obj == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            g0.m(obj);
            h8.d dVar = (h8.d) obj;
            h8.l lVar = dVar.f58871a;
            g0.m(lVar);
            if (lVar.f58976b == 0 && lVar.f58977c < lVar.f58978d) {
                h8.k kVar = dVar.f58872b;
                g0.m(kVar);
                if (kVar.f58969c <= 0) {
                    return new o.r(u4.g.b(new a(e.this, null)), u4.g.a());
                }
            }
            throw new BizInternalException("SendBuddyTravelGuide", null, 0, 6, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.BuddyGuideCollector", f = "BuddyGuideCollector.kt", i = {0, 0, 0, 1, 1, 1}, l = {67, 67}, m = "collectStudyBuddyUnlockedEffect$biz_release", n = {"scope", "$this$collectStudyBuddyUnlockedEffect_u24lambda_u240", "$i$a$-runCatching-BuddyGuideCollector$collectStudyBuddyUnlockedEffect$ipAvatarJourney$1", "scope", "$this$collectStudyBuddyUnlockedEffect_u24lambda_u240", "$i$a$-runCatching-BuddyGuideCollector$collectStudyBuddyUnlockedEffect$ipAvatarJourney$1"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "I$0"}, v = 1)
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f94869a;

        /* renamed from: b, reason: collision with root package name */
        public Object f94870b;

        /* renamed from: c, reason: collision with root package name */
        public int f94871c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f94872d;

        /* renamed from: f, reason: collision with root package name */
        public int f94874f;

        public g(j00.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f94872d = obj;
            this.f94874f |= Integer.MIN_VALUE;
            return e.this.i(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.BuddyGuideCollector$collectStudyBuddyUnlockedEffect$unLockEffect$deferredEffect$1", f = "BuddyGuideCollector.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class h extends SuspendLambda implements x00.p<r0, j00.c<? super o.w>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f94875a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.BuddyGuideCollector$collectStudyBuddyUnlockedEffect$unLockEffect$deferredEffect$1$1", f = "BuddyGuideCollector.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f94877a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f94878b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar, j00.c<? super a> cVar) {
                super(1, cVar);
                this.f94878b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(j00.c<?> cVar) {
                return new a(this.f94878b, cVar);
            }

            @Override // x00.l
            public final Object invoke(j00.c<? super g2> cVar) {
                return ((a) create(cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f94877a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    com.baicizhan.app.biz.game.uc.ipavatar.e eVar = this.f94878b.f94839f;
                    this.f94877a = 1;
                    if (eVar.a(this) == l11) {
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

        public h(j00.c<? super h> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return e.this.new h(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super o.w> cVar) {
            return ((h) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f94875a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                com.baicizhan.app.biz.game.uc.ipavatar.j jVar = e.this.f94838e;
                this.f94875a = 1;
                obj = jVar.b(this);
                if (obj == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return new o.w(com.baicizhan.app.biz.game.impl.home.words.a.c((h8.f) obj), u4.g.b(new a(e.this, null)), u4.g.a());
        }
    }

    public e(@m80.k b6.a userGuideRepo, @m80.k q5.a ipAvatarStateRepo, @m80.k ObserveIpAvatarUC observeIpAvatarUC, @m80.k com.baicizhan.app.biz.game.uc.ipavatar.j unlockIpAvatarUC, @m80.k com.baicizhan.app.biz.game.uc.ipavatar.e markIpUnlockedUC) {
        g0.p(userGuideRepo, "userGuideRepo");
        g0.p(ipAvatarStateRepo, "ipAvatarStateRepo");
        g0.p(observeIpAvatarUC, "observeIpAvatarUC");
        g0.p(unlockIpAvatarUC, "unlockIpAvatarUC");
        g0.p(markIpUnlockedUC, "markIpUnlockedUC");
        this.f94835b = userGuideRepo;
        this.f94836c = ipAvatarStateRepo;
        this.f94837d = observeIpAvatarUC;
        this.f94838e = unlockIpAvatarUC;
        this.f94839f = markIpUnlockedUC;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:(1:(5:12|13|14|(1:16)(1:42)|(1:18)(7:20|(7:30|31|32|(1:34)|35|(1:37)|38)(1:22)|23|24|(1:26)|27|28))(2:43|44))(6:45|46|47|48|(4:51|14|(0)(0)|(0)(0))|50))(1:52))(3:63|(1:65)|50)|53|(1:55)(1:62)|(2:57|(2:59|50)(4:60|48|(0)|50))(1:61)))|68|6|7|(0)(0)|53|(0)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x003a, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0119, code lost:
    
        r0 = kotlin.Result.Companion;
        r11 = kotlin.Result.m6308constructorimpl(kotlin.e.a(r11));
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c5 A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:14:0x00bf, B:16:0x00c5, B:20:0x00cc, B:32:0x00fa, B:34:0x0100, B:35:0x0109, B:38:0x0110, B:23:0x0114, B:41:0x00f0, B:46:0x0051, B:48:0x00a7, B:57:0x008c, B:31:0x00d2), top: B:7:0x0025, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cc A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:14:0x00bf, B:16:0x00c5, B:20:0x00cc, B:32:0x00fa, B:34:0x0100, B:35:0x0109, B:38:0x0110, B:23:0x0114, B:41:0x00f0, B:46:0x0051, B:48:0x00a7, B:57:0x008c, B:31:0x00d2), top: B:7:0x0025, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008c A[Catch: all -> 0x003a, TRY_ENTER, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:14:0x00bf, B:16:0x00c5, B:20:0x00cc, B:32:0x00fa, B:34:0x0100, B:35:0x0109, B:38:0x0110, B:23:0x0114, B:41:0x00f0, B:46:0x0051, B:48:0x00a7, B:57:0x008c, B:31:0x00d2), top: B:7:0x0025, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(@m80.k j00.c<? super x4.a> r11) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.e.e(j00.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:(12:11|12|13|(3:27|(1:29)|(8:31|16|17|(1:19)|20|(1:22)|23|24))|15|16|17|(0)|20|(0)|23|24)(2:32|33))(1:34))(3:44|(1:46)|41)|35|(1:37)|(3:39|(11:42|13|(0)|15|16|17|(0)|20|(0)|23|24)|41)(1:43)))|49|6|7|(0)(0)|35|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0036, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b7, code lost:
    
        r0 = kotlin.Result.Companion;
        r9 = kotlin.Result.m6308constructorimpl(kotlin.e.a(r9));
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:12:0x0032, B:13:0x008e, B:16:0x00b2, B:27:0x0094, B:29:0x0098, B:31:0x009c, B:39:0x0074), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0074 A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #0 {all -> 0x0036, blocks: (B:12:0x0032, B:13:0x008e, B:16:0x00b2, B:27:0x0094, B:29:0x0098, B:31:0x009c, B:39:0x0074), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(@m80.k j00.c<? super x4.a> r9) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.e.f(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(@m80.k c40.r0 r14, @m80.k j00.c<? super x4.a.c> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof w4.e.C1276e
            if (r0 == 0) goto L13
            r0 = r15
            w4.e$e r0 = (w4.e.C1276e) r0
            int r1 = r0.f94864g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f94864g = r1
            goto L18
        L13:
            w4.e$e r0 = new w4.e$e
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f94862e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f94864g
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r14 = r0.f94860c
            w4.e r14 = (w4.e) r14
            java.lang.Object r14 = r0.f94859b
            w4.e r14 = (w4.e) r14
            java.lang.Object r0 = r0.f94858a
            c40.r0 r0 = (c40.r0) r0
            kotlin.e.n(r15)
            goto L5c
        L35:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3d:
            kotlin.e.n(r15)
            b6.a r15 = r13.f94835b
            com.baicizhan.app.biz.game.repo.userguide.UserGuideType r2 = com.baicizhan.app.biz.game.repo.userguide.UserGuideType.SendBuddyTravelGuide
            r0.f94858a = r14
            r0.f94859b = r13
            java.lang.Object r4 = l00.k.a(r13)
            r0.f94860c = r4
            r4 = 0
            r0.f94861d = r4
            r0.f94864g = r3
            java.lang.Object r15 = r15.e(r2, r0)
            if (r15 != r1) goto L5a
            return r1
        L5a:
            r0 = r14
            r14 = r13
        L5c:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            r6 = 0
            if (r15 == 0) goto L66
            goto L67
        L66:
            r14 = r6
        L67:
            if (r14 == 0) goto Lc7
            kotlin.Result$a r14 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> La2
            kotlinx.coroutines.CoroutineStart r2 = kotlinx.coroutines.CoroutineStart.LAZY     // Catch: java.lang.Throwable -> La2
            w4.e$f r3 = new w4.e$f     // Catch: java.lang.Throwable -> La2
            r3.<init>(r6)     // Catch: java.lang.Throwable -> La2
            r4 = 1
            r5 = 0
            r1 = 0
            c40.x0 r14 = c40.i.b(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> La2
            x4.a$c r15 = new x4.a$c     // Catch: java.lang.Throwable -> La2
            java.lang.String r0 = "SendBuddyTravelGuide"
            com.baicizhan.app.biz.game.impl.home.uieffect.internal.EffectType r1 = com.baicizhan.app.biz.game.impl.home.uieffect.internal.EffectType.Default     // Catch: java.lang.Throwable -> La2
            r15.<init>(r14, r0, r1)     // Catch: java.lang.Throwable -> La2
            z6.b r7 = z6.b.f101032b     // Catch: java.lang.Throwable -> La2
            java.lang.String r8 = "BuddyGuideCollector"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La2
            r14.<init>()     // Catch: java.lang.Throwable -> La2
            java.lang.String r0 = "collectStudyBuddyUnlockedEffect "
            r14.append(r0)     // Catch: java.lang.Throwable -> La2
            r14.append(r15)     // Catch: java.lang.Throwable -> La2
            java.lang.String r9 = r14.toString()     // Catch: java.lang.Throwable -> La2
            r11 = 4
            r12 = 0
            r10 = 0
            z6.b.j(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> La2
            java.lang.Object r14 = kotlin.Result.m6308constructorimpl(r15)     // Catch: java.lang.Throwable -> La2
            goto Lae
        La2:
            r0 = move-exception
            r14 = r0
            kotlin.Result$a r15 = kotlin.Result.Companion
            java.lang.Object r14 = kotlin.e.a(r14)
            java.lang.Object r14 = kotlin.Result.m6308constructorimpl(r14)
        Lae:
            java.lang.Throwable r15 = kotlin.Result.m6311exceptionOrNullimpl(r14)
            if (r15 == 0) goto Lbd
            z6.b r0 = z6.b.f101032b
            java.lang.String r1 = "BuddyGuideCollector"
            java.lang.String r2 = "collectSendBuddyTravelGuideEffect error"
            r0.e(r1, r2, r15)
        Lbd:
            boolean r15 = kotlin.Result.m6314isFailureimpl(r14)
            if (r15 == 0) goto Lc4
            goto Lc5
        Lc4:
            r6 = r14
        Lc5:
            x4.a$c r6 = (x4.a.c) r6
        Lc7:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.e.g(c40.r0, j00.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(5:5|6|7|(1:(1:(8:11|12|13|14|15|(1:17)|18|(1:20)(3:22|(1:24)(1:32)|(2:29|30)(1:31)))(2:34|35))(4:36|37|38|39))(3:47|48|(2:50|42)(1:51))|40))|54|6|7|(0)(0)|40) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0083, code lost:
    
        if (r11 != r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0034, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0035, code lost:
    
        r11 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(@m80.k c40.r0 r10, @m80.k j00.c<? super x4.a.c> r11) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.e.i(c40.r0, j00.c):java.lang.Object");
    }

    @Override // c4.j, pa0.a
    @m80.k
    public /* bridge */ na0.a r() {
        return super.r();
    }
}
