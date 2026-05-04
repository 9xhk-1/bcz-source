package w4;

import com.baicizhan.app.biz.game.impl.home.uieffect.UIEffectStrategyType;
import com.baicizhan.app.biz.game.model.RankType;
import com.baicizhan.app.biz.game.repo.userguide.UserGuideType;
import com.jiongji.andriod.card.R;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import p6.c0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
@u0({"SMAP\nGuideCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GuideCollector.kt\ncom/baicizhan/app/biz/game/impl/home/uieffect/GuideCollector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,253:1\n1#2:254\n295#3,2:255\n295#3,2:257\n*S KotlinDebug\n*F\n+ 1 GuideCollector.kt\ncom/baicizhan/app/biz/game/impl/home/uieffect/GuideCollector\n*L\n58#1:255,2\n59#1:257,2\n*E\n"})
/* loaded from: classes3.dex */
public final class g implements c4.j {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final b6.a f94880b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final w5.a f94881c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final c0 f94882d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final o6.q f94883e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.repo.book.b f94884f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final z5.g f94885g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final p5.f f94886h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final x5.b f94887i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.schedule.d f94888j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.user.e f94889k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.incentive.m f94890l;

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.incentive.r f94891m;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f94892a;

        static {
            int[] iArr = new int[UIEffectStrategyType.values().length];
            try {
                iArr[UIEffectStrategyType.WORDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UIEffectStrategyType.SENTENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f94892a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.GuideCollector", f = "GuideCollector.kt", i = {0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3}, l = {174, 177, 177, 178}, m = "collectForgettingCurveGuide$biz_release", n = {"it", "$i$a$-takeIf-GuideCollector$collectForgettingCurveGuide$2", "it", "$this$collectForgettingCurveGuide_u24lambda_u241_u240", "$i$a$-takeIf-GuideCollector$collectForgettingCurveGuide$3", "$i$a$-runCatching-GuideCollector$collectForgettingCurveGuide$3$1", "it", "$this$collectForgettingCurveGuide_u24lambda_u241_u240", "$i$a$-takeIf-GuideCollector$collectForgettingCurveGuide$3", "$i$a$-runCatching-GuideCollector$collectForgettingCurveGuide$3$1", "it", "$this$collectForgettingCurveGuide_u24lambda_u241_u240", "it", "$i$a$-takeIf-GuideCollector$collectForgettingCurveGuide$3", "$i$a$-runCatching-GuideCollector$collectForgettingCurveGuide$3$1", "$i$a$-let-GuideCollector$collectForgettingCurveGuide$3$1$1"}, s = {"L$1", "I$0", "L$1", "L$2", "I$0", "I$1", "L$1", "L$2", "I$0", "I$1", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f94893a;

        /* renamed from: b, reason: collision with root package name */
        public Object f94894b;

        /* renamed from: c, reason: collision with root package name */
        public Object f94895c;

        /* renamed from: d, reason: collision with root package name */
        public Object f94896d;

        /* renamed from: e, reason: collision with root package name */
        public int f94897e;

        /* renamed from: f, reason: collision with root package name */
        public int f94898f;

        /* renamed from: g, reason: collision with root package name */
        public int f94899g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f94900h;

        /* renamed from: j, reason: collision with root package name */
        public int f94902j;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f94900h = obj;
            this.f94902j |= Integer.MIN_VALUE;
            return g.this.e(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.GuideCollector$collectForgettingCurveGuide$4$1", f = "GuideCollector.kt", i = {}, l = {183}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class c extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f94903a;

        public c(j00.c<? super c> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return g.this.new c(cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super g2> cVar) {
            return ((c) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f94903a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                b6.a aVar = g.this.f94880b;
                UserGuideType userGuideType = UserGuideType.ForgettingCurveGuide;
                this.f94903a = 1;
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
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.GuideCollector", f = "GuideCollector.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3}, l = {121, 126, 131, 131}, m = "collectNewUserRankEffect$biz_release", n = {"strategyType", "it", "$i$a$-takeIf-GuideCollector$collectNewUserRankEffect$2", "strategyType", "it", "$this$collectNewUserRankEffect_u24lambda_u241_u240", "$i$a$-takeIf-GuideCollector$collectNewUserRankEffect$3", "$i$a$-runCatching-GuideCollector$collectNewUserRankEffect$3$1", "strategyType", "it", "$this$collectNewUserRankEffect_u24lambda_u241_u240", "$i$a$-takeIf-GuideCollector$collectNewUserRankEffect$3", "$i$a$-runCatching-GuideCollector$collectNewUserRankEffect$3$1", "strategyType", "it", "$this$collectNewUserRankEffect_u24lambda_u241_u240", "$i$a$-takeIf-GuideCollector$collectNewUserRankEffect$3", "$i$a$-runCatching-GuideCollector$collectNewUserRankEffect$3$1"}, s = {"L$0", "L$2", "I$0", "L$0", "L$2", "L$3", "I$0", "I$1", "L$0", "L$2", "L$3", "I$0", "I$1", "L$0", "L$2", "L$3", "I$0", "I$1"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f94905a;

        /* renamed from: b, reason: collision with root package name */
        public Object f94906b;

        /* renamed from: c, reason: collision with root package name */
        public Object f94907c;

        /* renamed from: d, reason: collision with root package name */
        public Object f94908d;

        /* renamed from: e, reason: collision with root package name */
        public Object f94909e;

        /* renamed from: f, reason: collision with root package name */
        public int f94910f;

        /* renamed from: g, reason: collision with root package name */
        public int f94911g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f94912h;

        /* renamed from: j, reason: collision with root package name */
        public int f94914j;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f94912h = obj;
            this.f94914j |= Integer.MIN_VALUE;
            return g.this.f(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.GuideCollector$collectNewUserRankEffect$4$1", f = "GuideCollector.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class e extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f94915a;

        public e(j00.c<? super e> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return g.this.new e(cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super g2> cVar) {
            return ((e) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f94915a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                b6.a aVar = g.this.f94880b;
                UserGuideType userGuideType = UserGuideType.NewUserRankLocked;
                this.f94915a = 1;
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
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.GuideCollector$collectNewUserRankEffect$4$2", f = "GuideCollector.kt", i = {}, l = {143}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class f extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f94917a;

        public f(j00.c<? super f> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return g.this.new f(cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super g2> cVar) {
            return ((f) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f94917a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                com.baicizhan.app.biz.game.uc.incentive.r rVar = g.this.f94891m;
                RankType rankType = RankType.Default;
                this.f94917a = 1;
                if (rVar.c(rankType, this) == l11) {
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
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.GuideCollector", f = "GuideCollector.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5}, l = {90, 95, 95, 99, 100, 99}, m = "collectNewUserTasksEffect$biz_release", n = {"strategyType", "it", "$i$a$-takeIf-GuideCollector$collectNewUserTasksEffect$2", "strategyType", "it", "$i$a$-takeIf-GuideCollector$collectNewUserTasksEffect$3", "strategyType", "it", "$i$a$-takeIf-GuideCollector$collectNewUserTasksEffect$3", "strategyType", "it", "$i$a$-takeIf-GuideCollector$collectNewUserTasksEffect$3", "strategyType", "it", "$i$a$-takeIf-GuideCollector$collectNewUserTasksEffect$3", "strategyType", "it", "$i$a$-takeIf-GuideCollector$collectNewUserTasksEffect$3"}, s = {"L$0", "L$2", "I$0", "L$0", "L$2", "I$0", "L$0", "L$2", "I$0", "L$0", "L$2", "I$0", "L$0", "L$2", "I$0", "L$0", "L$2", "I$0"}, v = 1)
    /* renamed from: w4.g$g, reason: collision with other inner class name */
    public static final class C1277g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f94919a;

        /* renamed from: b, reason: collision with root package name */
        public Object f94920b;

        /* renamed from: c, reason: collision with root package name */
        public Object f94921c;

        /* renamed from: d, reason: collision with root package name */
        public Object f94922d;

        /* renamed from: e, reason: collision with root package name */
        public int f94923e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f94924f;

        /* renamed from: h, reason: collision with root package name */
        public int f94926h;

        public C1277g(j00.c<? super C1277g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f94924f = obj;
            this.f94926h |= Integer.MIN_VALUE;
            return g.this.g(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.GuideCollector$collectNewUserTasksEffect$4$1", f = "GuideCollector.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class h extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f94927a;

        public h(j00.c<? super h> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return g.this.new h(cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super g2> cVar) {
            return ((h) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f94927a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                b6.a aVar = g.this.f94880b;
                UserGuideType userGuideType = UserGuideType.NewUserTasksLocked;
                this.f94927a = 1;
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
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.GuideCollector$collectNewUserTasksEffect$4$2", f = "GuideCollector.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class i extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f94929a;

        public i(j00.c<? super i> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return g.this.new i(cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super g2> cVar) {
            return ((i) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f94929a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                com.baicizhan.app.biz.game.uc.incentive.m mVar = g.this.f94890l;
                this.f94929a = 1;
                if (mVar.b(this) == l11) {
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
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.GuideCollector", f = "GuideCollector.kt", i = {0, 0}, l = {R.styleable.Theme_drawable_tab_home}, m = "collectOldUserUpgradeGuideEffect$biz_release", n = {"it", "$i$a$-takeIf-GuideCollector$collectOldUserUpgradeGuideEffect$2"}, s = {"L$1", "I$0"}, v = 1)
    public static final class j extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f94931a;

        /* renamed from: b, reason: collision with root package name */
        public Object f94932b;

        /* renamed from: c, reason: collision with root package name */
        public int f94933c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f94934d;

        /* renamed from: f, reason: collision with root package name */
        public int f94936f;

        public j(j00.c<? super j> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f94934d = obj;
            this.f94936f |= Integer.MIN_VALUE;
            return g.this.i(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.GuideCollector$collectOldUserUpgradeGuideEffect$3$1", f = "GuideCollector.kt", i = {}, l = {R.styleable.Theme_drawable_tab_mall}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class k extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f94937a;

        public k(j00.c<? super k> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return g.this.new k(cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super g2> cVar) {
            return ((k) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f94937a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                b6.a aVar = g.this.f94880b;
                this.f94937a = 1;
                if (aVar.d(this) == l11) {
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
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.GuideCollector", f = "GuideCollector.kt", i = {0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 6}, l = {193, 196, 197, 199, R.styleable.Theme_drawable_reset_plan, R.styleable.Theme_drawable_reset_plan, R.styleable.Theme_drawable_share_close}, m = "collectScheduleGuideEffect$biz_release", n = {"it", "$i$a$-takeIf-GuideCollector$collectScheduleGuideEffect$2", "it", "$this$collectScheduleGuideEffect_u24lambda_u241_u240", "$i$a$-takeIf-GuideCollector$collectScheduleGuideEffect$3", "$i$a$-runCatching-GuideCollector$collectScheduleGuideEffect$3$1", "it", "$this$collectScheduleGuideEffect_u24lambda_u241_u240", "$i$a$-takeIf-GuideCollector$collectScheduleGuideEffect$3", "$i$a$-runCatching-GuideCollector$collectScheduleGuideEffect$3$1", "bookId", "it", "$this$collectScheduleGuideEffect_u24lambda_u241_u240", "bookInfo", "$i$a$-takeIf-GuideCollector$collectScheduleGuideEffect$3", "$i$a$-runCatching-GuideCollector$collectScheduleGuideEffect$3$1", "bookId", "it", "$this$collectScheduleGuideEffect_u24lambda_u242_u240", "$i$a$-let-GuideCollector$collectScheduleGuideEffect$4", "$i$a$-runCatching-GuideCollector$collectScheduleGuideEffect$4$1", "it", "$this$collectScheduleGuideEffect_u24lambda_u242_u240", "$i$a$-let-GuideCollector$collectScheduleGuideEffect$4", "$i$a$-runCatching-GuideCollector$collectScheduleGuideEffect$4$1", "it", "$this$collectScheduleGuideEffect_u24lambda_u242_u240", "progress", "$i$a$-let-GuideCollector$collectScheduleGuideEffect$4", "$i$a$-runCatching-GuideCollector$collectScheduleGuideEffect$4$1"}, s = {"L$1", "I$0", "L$1", "L$2", "I$0", "I$1", "L$1", "L$2", "I$0", "I$1", "J$0", "L$1", "L$2", "L$3", "I$0", "I$1", "J$0", "L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"}, v = 1)
    public static final class l extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f94939a;

        /* renamed from: b, reason: collision with root package name */
        public Object f94940b;

        /* renamed from: c, reason: collision with root package name */
        public Object f94941c;

        /* renamed from: d, reason: collision with root package name */
        public Object f94942d;

        /* renamed from: e, reason: collision with root package name */
        public int f94943e;

        /* renamed from: f, reason: collision with root package name */
        public int f94944f;

        /* renamed from: g, reason: collision with root package name */
        public long f94945g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f94946h;

        /* renamed from: j, reason: collision with root package name */
        public int f94948j;

        public l(j00.c<? super l> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f94946h = obj;
            this.f94948j |= Integer.MIN_VALUE;
            return g.this.j(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.GuideCollector$collectScheduleGuideEffect$4$1$1", f = "GuideCollector.kt", i = {}, l = {217}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class m extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f94949a;

        public m(j00.c<? super m> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return g.this.new m(cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super g2> cVar) {
            return ((m) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f94949a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                b6.a aVar = g.this.f94880b;
                UserGuideType userGuideType = UserGuideType.NewUserScheduleGuide;
                this.f94949a = 1;
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
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.GuideCollector", f = "GuideCollector.kt", i = {0, 0, 1, 1, 1, 1}, l = {55, 57}, m = "collectSentenceCheckBadgeEffect$biz_release", n = {"it", "$i$a$-takeIf-GuideCollector$collectSentenceCheckBadgeEffect$2", "it", "$this$collectSentenceCheckBadgeEffect_u24lambda_u241_u240", "$i$a$-let-GuideCollector$collectSentenceCheckBadgeEffect$3", "$i$a$-runCatching-GuideCollector$collectSentenceCheckBadgeEffect$3$1"}, s = {"L$1", "I$0", "L$0", "L$1", "I$0", "I$1"}, v = 1)
    public static final class n extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f94951a;

        /* renamed from: b, reason: collision with root package name */
        public Object f94952b;

        /* renamed from: c, reason: collision with root package name */
        public int f94953c;

        /* renamed from: d, reason: collision with root package name */
        public int f94954d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f94955e;

        /* renamed from: g, reason: collision with root package name */
        public int f94957g;

        public n(j00.c<? super n> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f94955e = obj;
            this.f94957g |= Integer.MIN_VALUE;
            return g.this.k(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.GuideCollector$collectSentenceCheckBadgeEffect$3$1$1", f = "GuideCollector.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class o extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f94958a;

        public o(j00.c<? super o> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return g.this.new o(cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super g2> cVar) {
            return ((o) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f94958a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                b6.a aVar = g.this.f94880b;
                UserGuideType userGuideType = UserGuideType.NewUserCheckBadgeGuide;
                this.f94958a = 1;
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
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.GuideCollector", f = "GuideCollector.kt", i = {0, 0}, l = {77}, m = "collectStoryEffect$biz_release", n = {"it", "$i$a$-takeIf-GuideCollector$collectStoryEffect$2"}, s = {"L$1", "I$0"}, v = 1)
    public static final class p extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f94960a;

        /* renamed from: b, reason: collision with root package name */
        public Object f94961b;

        /* renamed from: c, reason: collision with root package name */
        public int f94962c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f94963d;

        /* renamed from: f, reason: collision with root package name */
        public int f94965f;

        public p(j00.c<? super p> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f94963d = obj;
            this.f94965f |= Integer.MIN_VALUE;
            return g.this.l(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.GuideCollector$collectStoryEffect$3$1", f = "GuideCollector.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class q extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f94966a;

        public q(j00.c<? super q> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return g.this.new q(cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super g2> cVar) {
            return ((q) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f94966a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                b6.a aVar = g.this.f94880b;
                UserGuideType userGuideType = UserGuideType.NewUserSentenceStory;
                this.f94966a = 1;
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
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.GuideCollector", f = "GuideCollector.kt", i = {1, 1, 2, 2, 2}, l = {153, 155, 156}, m = "collectWordsReviewGuideEffect$biz_release", n = {"$this$collectWordsReviewGuideEffect_u24lambda_u240", "$i$a$-runCatching-GuideCollector$collectWordsReviewGuideEffect$2", "$this$collectWordsReviewGuideEffect_u24lambda_u240", "$i$a$-runCatching-GuideCollector$collectWordsReviewGuideEffect$2", "bookId"}, s = {"L$0", "I$0", "L$0", "I$0", "J$0"}, v = 1)
    public static final class r extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f94968a;

        /* renamed from: b, reason: collision with root package name */
        public int f94969b;

        /* renamed from: c, reason: collision with root package name */
        public long f94970c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f94971d;

        /* renamed from: f, reason: collision with root package name */
        public int f94973f;

        public r(j00.c<? super r> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f94971d = obj;
            this.f94973f |= Integer.MIN_VALUE;
            return g.this.m(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.GuideCollector$collectWordsReviewGuideEffect$2$1", f = "GuideCollector.kt", i = {}, l = {160}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class s extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f94974a;

        public s(j00.c<? super s> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return g.this.new s(cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super g2> cVar) {
            return ((s) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f94974a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                b6.a aVar = g.this.f94880b;
                UserGuideType userGuideType = UserGuideType.NewUserWordsReviewGuide;
                this.f94974a = 1;
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
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.GuideCollector", f = "GuideCollector.kt", i = {0, 0, 1, 1, 1, 2, 2, 2, 2}, l = {R.styleable.Theme_drawable_time, 243, R.styleable.Theme_drawable_walk_sound1}, m = "getWordsStudyRoundCount", n = {"$this$getWordsStudyRoundCount_u24lambda_u240", "$i$a$-runCatching-GuideCollector$getWordsStudyRoundCount$2", "$this$getWordsStudyRoundCount_u24lambda_u240", "$i$a$-runCatching-GuideCollector$getWordsStudyRoundCount$2", "bookId", "$this$getWordsStudyRoundCount_u24lambda_u240", "bookInfo", "$i$a$-runCatching-GuideCollector$getWordsStudyRoundCount$2", "bookId"}, s = {"L$0", "I$0", "L$0", "I$0", "J$0", "L$0", "L$1", "I$0", "J$0"}, v = 1)
    public static final class t extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f94976a;

        /* renamed from: b, reason: collision with root package name */
        public Object f94977b;

        /* renamed from: c, reason: collision with root package name */
        public int f94978c;

        /* renamed from: d, reason: collision with root package name */
        public long f94979d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f94980e;

        /* renamed from: g, reason: collision with root package name */
        public int f94982g;

        public t(j00.c<? super t> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f94980e = obj;
            this.f94982g |= Integer.MIN_VALUE;
            return g.this.n(this);
        }
    }

    public g(@m80.k b6.a userGuideRepo, @m80.k w5.a rewardRepo, @m80.k c0 selectReviewWordsUC, @m80.k o6.q getLegalCurrentBookIdUC, @m80.k com.baicizhan.app.biz.game.repo.book.b gameBookScheduleRepo, @m80.k z5.g studyRecordRepo, @m80.k p5.f streakRepo, @m80.k x5.b sentenceRepo, @m80.k com.baicizhan.app.biz.game.uc.schedule.d getAdjustedDailyProgressUC, @m80.k com.baicizhan.app.biz.game.uc.user.e getCurSkuId, @m80.k com.baicizhan.app.biz.game.uc.incentive.m markTaskPopupShownUC, @m80.k com.baicizhan.app.biz.game.uc.incentive.r setRankReadTimeUC) {
        g0.p(userGuideRepo, "userGuideRepo");
        g0.p(rewardRepo, "rewardRepo");
        g0.p(selectReviewWordsUC, "selectReviewWordsUC");
        g0.p(getLegalCurrentBookIdUC, "getLegalCurrentBookIdUC");
        g0.p(gameBookScheduleRepo, "gameBookScheduleRepo");
        g0.p(studyRecordRepo, "studyRecordRepo");
        g0.p(streakRepo, "streakRepo");
        g0.p(sentenceRepo, "sentenceRepo");
        g0.p(getAdjustedDailyProgressUC, "getAdjustedDailyProgressUC");
        g0.p(getCurSkuId, "getCurSkuId");
        g0.p(markTaskPopupShownUC, "markTaskPopupShownUC");
        g0.p(setRankReadTimeUC, "setRankReadTimeUC");
        this.f94880b = userGuideRepo;
        this.f94881c = rewardRepo;
        this.f94882d = selectReviewWordsUC;
        this.f94883e = getLegalCurrentBookIdUC;
        this.f94884f = gameBookScheduleRepo;
        this.f94885g = studyRecordRepo;
        this.f94886h = streakRepo;
        this.f94887i = sentenceRepo;
        this.f94888j = getAdjustedDailyProgressUC;
        this.f94889k = getCurSkuId;
        this.f94890l = markTaskPopupShownUC;
        this.f94891m = setRankReadTimeUC;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0110 A[Catch: all -> 0x0086, TRY_LEAVE, TryCatch #0 {all -> 0x0086, blocks: (B:41:0x0104, B:43:0x0110, B:55:0x0082, B:56:0x00e2), top: B:54:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(@m80.k j00.c<? super x4.a> r17) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.g.e(j00.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:(1:(1:(11:13|14|15|(2:17|(8:19|20|21|22|(1:24)|25|(1:27)|(2:29|30)(1:32)))|33|21|22|(0)|25|(0)|(0)(0))(2:34|35))(15:36|37|38|39|40|(2:42|43)|15|(0)|33|21|22|(0)|25|(0)|(0)(0)))(3:48|49|50))(1:52))(3:69|(1:71)|43)|53|(1:55)|(3:57|(1:(2:60|(1:62)(12:63|40|(0)|15|(0)|33|21|22|(0)|25|(0)|(0)(0)))(2:64|65))(1:66)|43)(1:68)))|73|6|7|(0)(0)|53|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0168, code lost:
    
        if (((java.lang.Number) r15).intValue() >= 4) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x015f, code lost:
    
        if (r15 == r1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0045, code lost:
    
        r15 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0132 A[Catch: all -> 0x0045, TryCatch #1 {all -> 0x0045, blocks: (B:14:0x0040, B:15:0x012c, B:17:0x0132, B:21:0x016b, B:40:0x0103, B:49:0x0088, B:50:0x0162, B:57:0x00c8, B:60:0x00d6, B:64:0x013b, B:65:0x0140, B:66:0x0141), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c8 A[Catch: all -> 0x0045, TRY_ENTER, TryCatch #1 {all -> 0x0045, blocks: (B:14:0x0040, B:15:0x012c, B:17:0x0132, B:21:0x016b, B:40:0x0103, B:49:0x0088, B:50:0x0162, B:57:0x00c8, B:60:0x00d6, B:64:0x013b, B:65:0x0140, B:66:0x0141), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r10v4, types: [w4.g] */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(@m80.k com.baicizhan.app.biz.game.impl.home.uieffect.UIEffectStrategyType r14, @m80.k j00.c<? super x4.a> r15) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.g.f(com.baicizhan.app.biz.game.impl.home.uieffect.UIEffectStrategyType, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x014e, code lost:
    
        if (r14 != r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01ae, code lost:
    
        if (((java.lang.Number) r14).intValue() >= 3) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01a5, code lost:
    
        if (r14 == r1) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(@m80.k com.baicizhan.app.biz.game.impl.home.uieffect.UIEffectStrategyType r13, @m80.k j00.c<? super x4.a> r14) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.g.g(com.baicizhan.app.biz.game.impl.home.uieffect.UIEffectStrategyType, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(@m80.k j00.c<? super x4.a> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof w4.g.j
            if (r0 == 0) goto L13
            r0 = r11
            w4.g$j r0 = (w4.g.j) r0
            int r1 = r0.f94936f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f94936f = r1
            goto L18
        L13:
            w4.g$j r0 = new w4.g$j
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f94934d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f94936f
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.f94932b
            w4.g r1 = (w4.g) r1
            java.lang.Object r0 = r0.f94931a
            w4.g r0 = (w4.g) r0
            kotlin.e.n(r11)
            goto L53
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L39:
            kotlin.e.n(r11)
            b6.a r11 = r10.f94880b
            r0.f94931a = r10
            java.lang.Object r2 = l00.k.a(r10)
            r0.f94932b = r2
            r2 = 0
            r0.f94933c = r2
            r0.f94936f = r3
            java.lang.Object r11 = r11.h(r0)
            if (r11 != r1) goto L52
            return r1
        L52:
            r0 = r10
        L53:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            r1 = 0
            if (r11 == 0) goto L5d
            goto L5e
        L5d:
            r0 = r1
        L5e:
            if (r0 == 0) goto L83
            z6.b r4 = z6.b.f101032b
            r8 = 4
            r9 = 0
            java.lang.String r5 = "BaseRewardCollector"
            java.lang.String r6 = "collectOldUserUpgradeGuideEffect: old user upgrade guide enabled"
            r7 = 0
            z6.b.j(r4, r5, r6, r7, r8, r9)
            l3.o$n r11 = new l3.o$n
            w4.g$k r0 = new w4.g$k
            r0.<init>(r1)
            l3.g2 r0 = u4.g.b(r0)
            l3.g2 r2 = u4.g.a()
            r11.<init>(r0, r2)
            x4.a$b r11 = x4.b.b(r11, r1, r3, r1)
            return r11
        L83:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.g.i(j00.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(4:5|6|7|8))|98|6|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0285, code lost:
    
        if (r5.a(r10, r2) == r3) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0043, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x028e, code lost:
    
        r2 = kotlin.Result.Companion;
        r0 = kotlin.Result.m6308constructorimpl(kotlin.e.a(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0088, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x024d A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:13:0x003e, B:15:0x0289, B:23:0x0052, B:24:0x022a, B:26:0x024d, B:27:0x0264, B:31:0x0067, B:33:0x020a, B:50:0x01e7), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0264 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:13:0x003e, B:15:0x0289, B:23:0x0052, B:24:0x022a, B:26:0x024d, B:27:0x0264, B:31:0x0067, B:33:0x020a, B:50:0x01e7), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e7 A[Catch: all -> 0x0043, TRY_ENTER, TryCatch #0 {all -> 0x0043, blocks: (B:13:0x003e, B:15:0x0289, B:23:0x0052, B:24:0x022a, B:26:0x024d, B:27:0x0264, B:31:0x0067, B:33:0x020a, B:50:0x01e7), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fd A[Catch: all -> 0x0088, TRY_ENTER, TryCatch #2 {all -> 0x0088, blocks: (B:38:0x0083, B:39:0x0171, B:42:0x01bd, B:62:0x0147, B:74:0x011e, B:86:0x00fd), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(@m80.k j00.c<? super x4.a> r19) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.g.j(j00.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:(14:11|12|13|(2:14|(2:16|(2:18|19)(1:52))(2:53|54))|20|(4:24|(2:25|(2:27|(2:29|30)(1:48))(2:49|50))|31|(8:33|(6:38|39|40|(1:42)|43|44)|47|39|40|(0)|43|44))|51|(7:35|38|39|40|(0)|43|44)|47|39|40|(0)|43|44)(2:55|56))(1:57))(3:67|(1:69)|64)|58|(1:60)|(3:62|(13:65|13|(3:14|(0)(0)|52)|20|(5:22|24|(3:25|(0)(0)|48)|31|(0))|51|(0)|47|39|40|(0)|43|44)|64)(1:66)))|72|6|7|(0)(0)|58|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0036, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0102, code lost:
    
        r0 = kotlin.Result.Companion;
        r9 = kotlin.Result.m6308constructorimpl(kotlin.e.a(r9));
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009a A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:12:0x0032, B:13:0x008e, B:14:0x0094, B:16:0x009a, B:20:0x00ab, B:22:0x00af, B:24:0x00b5, B:25:0x00bb, B:27:0x00c1, B:31:0x00d2, B:33:0x00d6, B:35:0x00de, B:38:0x00e5, B:39:0x00fd, B:62:0x0074), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c1 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:12:0x0032, B:13:0x008e, B:14:0x0094, B:16:0x009a, B:20:0x00ab, B:22:0x00af, B:24:0x00b5, B:25:0x00bb, B:27:0x00c1, B:31:0x00d2, B:33:0x00d6, B:35:0x00de, B:38:0x00e5, B:39:0x00fd, B:62:0x0074), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d6 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:12:0x0032, B:13:0x008e, B:14:0x0094, B:16:0x009a, B:20:0x00ab, B:22:0x00af, B:24:0x00b5, B:25:0x00bb, B:27:0x00c1, B:31:0x00d2, B:33:0x00d6, B:35:0x00de, B:38:0x00e5, B:39:0x00fd, B:62:0x0074), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00de A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:12:0x0032, B:13:0x008e, B:14:0x0094, B:16:0x009a, B:20:0x00ab, B:22:0x00af, B:24:0x00b5, B:25:0x00bb, B:27:0x00c1, B:31:0x00d2, B:33:0x00d6, B:35:0x00de, B:38:0x00e5, B:39:0x00fd, B:62:0x0074), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0074 A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #0 {all -> 0x0036, blocks: (B:12:0x0032, B:13:0x008e, B:14:0x0094, B:16:0x009a, B:20:0x00ab, B:22:0x00af, B:24:0x00b5, B:25:0x00bb, B:27:0x00c1, B:31:0x00d2, B:33:0x00d6, B:35:0x00de, B:38:0x00e5, B:39:0x00fd, B:62:0x0074), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(@m80.k j00.c<? super x4.a> r9) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.g.k(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(@m80.k j00.c<? super x4.a> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof w4.g.p
            if (r0 == 0) goto L13
            r0 = r7
            w4.g$p r0 = (w4.g.p) r0
            int r1 = r0.f94965f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f94965f = r1
            goto L18
        L13:
            w4.g$p r0 = new w4.g$p
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f94963d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f94965f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r1 = r0.f94961b
            w4.g r1 = (w4.g) r1
            java.lang.Object r0 = r0.f94960a
            w4.g r0 = (w4.g) r0
            kotlin.e.n(r7)
            goto L55
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3a:
            kotlin.e.n(r7)
            b6.a r7 = r6.f94880b
            com.baicizhan.app.biz.game.repo.userguide.UserGuideType r2 = com.baicizhan.app.biz.game.repo.userguide.UserGuideType.NewUserSentenceStory
            r0.f94960a = r6
            java.lang.Object r5 = l00.k.a(r6)
            r0.f94961b = r5
            r0.f94962c = r3
            r0.f94965f = r4
            java.lang.Object r7 = r7.e(r2, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r0 = r6
        L55:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r1 = 0
            if (r7 == 0) goto L5f
            goto L60
        L5f:
            r0 = r1
        L60:
            if (r0 == 0) goto L79
            l3.o$u r7 = new l3.o$u
            w4.g$q r0 = new w4.g$q
            r0.<init>(r1)
            l3.g2 r0 = u4.g.b(r0)
            l3.g2 r2 = u4.g.a()
            r7.<init>(r3, r0, r2)
            x4.a$b r7 = x4.b.b(r7, r1, r4, r1)
            return r7
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.g.l(j00.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:(1:(11:12|13|14|(1:16)(1:28)|17|18|(1:20)|21|(1:23)|24|25)(2:29|30))(5:31|32|33|(10:36|14|(0)(0)|17|18|(0)|21|(0)|24|25)|35))(1:37))(1:45)|38|(2:40|(2:42|35)(4:43|33|(0)|35))(1:44)))|50|6|7|(0)(0)|38|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x005d, code lost:
    
        if (r14 == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0036, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00de, code lost:
    
        r0 = kotlin.Result.Companion;
        r14 = kotlin.Result.m6308constructorimpl(kotlin.e.a(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c1 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x0032, B:14:0x0094, B:16:0x00c1, B:17:0x00d9, B:32:0x0048, B:33:0x007b, B:40:0x0068), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0068 A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x0032, B:14:0x0094, B:16:0x00c1, B:17:0x00d9, B:32:0x0048, B:33:0x007b, B:40:0x0068), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(@m80.k j00.c<? super x4.a> r14) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.g.m(j00.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:(1:(5:12|13|14|15|(2:17|18)(1:20))(2:22|23))(5:24|25|26|(4:29|14|15|(0)(0))|28))(3:30|31|32))(3:37|38|(2:40|28)(1:41))|33|(2:35|28)(4:36|26|(0)|28)))|44|6|7|(0)(0)|33|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0039, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c1, code lost:
    
        r0 = kotlin.Result.Companion;
        r11 = kotlin.Result.m6308constructorimpl(kotlin.e.a(r11));
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(j00.c<? super java.lang.Integer> r11) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.g.n(j00.c):java.lang.Object");
    }

    @Override // c4.j, pa0.a
    @m80.k
    public /* bridge */ na0.a r() {
        return super.r();
    }
}
