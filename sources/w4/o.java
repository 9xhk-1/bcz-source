package w4;

import com.baicizhan.app.api.service.model.SwitchType;
import com.baicizhan.app.biz.game.uc.sentence.ObserverSentenceJourneyUC;
import h5.j0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l3.o;
import x4.a;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
@u0({"SMAP\nSentenceSwitchCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SentenceSwitchCollector.kt\ncom/baicizhan/app/biz/game/impl/home/uieffect/SentenceSwitchCollector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,111:1\n1#2:112\n*E\n"})
/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final ObserverSentenceJourneyUC f95094a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x5.d f95095b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final c6.b f95096c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.sentence.a f95097d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.sentence.f f95098e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.sentence.d f95099f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.SentenceSwitchCollector", f = "SentenceSwitchCollector.kt", i = {1, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4}, l = {34, 35, 36, 52, 51}, m = "collectSentenceSwitchEffect$biz_release", n = {"curSkuId", "curSkuId", "remoteSkuId", "pre", "$this$collectSentenceSwitchEffect_u24lambda_u240", "curSkuId", "remoteSkuId", "targetSkuId", "targetUnitId", "$i$a$-runCatching-SentenceSwitchCollector$collectSentenceSwitchEffect$2", "pre", "$this$collectSentenceSwitchEffect_u24lambda_u240", "curSkuId", "remoteSkuId", "targetSkuId", "targetUnitId", "$i$a$-runCatching-SentenceSwitchCollector$collectSentenceSwitchEffect$2"}, s = {"I$0", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "I$0", "I$1", "I$2", "I$3", "I$4"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f95100a;

        /* renamed from: b, reason: collision with root package name */
        public int f95101b;

        /* renamed from: c, reason: collision with root package name */
        public int f95102c;

        /* renamed from: d, reason: collision with root package name */
        public int f95103d;

        /* renamed from: e, reason: collision with root package name */
        public int f95104e;

        /* renamed from: f, reason: collision with root package name */
        public Object f95105f;

        /* renamed from: g, reason: collision with root package name */
        public Object f95106g;

        /* renamed from: h, reason: collision with root package name */
        public Object f95107h;

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f95108i;

        /* renamed from: k, reason: collision with root package name */
        public int f95110k;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f95108i = obj;
            this.f95110k |= Integer.MIN_VALUE;
            return o.this.c(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.SentenceSwitchCollector$collectWordsSwitchToSentenceEffect$3$1", f = "SentenceSwitchCollector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f95111a;

        public b(j00.c<? super b> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return o.this.new b(cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super g2> cVar) {
            return ((b) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f95111a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            o.this.f95095b.f(false);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.SentenceSwitchCollector$createEffect$2", f = "SentenceSwitchCollector.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class c extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f95113a;

        public c(j00.c<? super c> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return o.this.new c(cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super g2> cVar) {
            return ((c) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f95113a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                com.baicizhan.app.biz.game.uc.sentence.f fVar = o.this.f95098e;
                this.f95113a = 1;
                if (fVar.b(this) == l11) {
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
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.SentenceSwitchCollector", f = "SentenceSwitchCollector.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {85, 87, 91}, m = "createGoToProgressingUnitEffect$biz_release", n = {"$this$createGoToProgressingUnitEffect_u24lambda_u240", "skuId", "$i$a$-runCatching-SentenceSwitchCollector$createGoToProgressingUnitEffect$2", "$this$createGoToProgressingUnitEffect_u24lambda_u240", "unit", "skuId", "$i$a$-runCatching-SentenceSwitchCollector$createGoToProgressingUnitEffect$2", "$this$createGoToProgressingUnitEffect_u24lambda_u240", "unit", "journey", "skuId", "$i$a$-runCatching-SentenceSwitchCollector$createGoToProgressingUnitEffect$2"}, s = {"L$0", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f95115a;

        /* renamed from: b, reason: collision with root package name */
        public int f95116b;

        /* renamed from: c, reason: collision with root package name */
        public Object f95117c;

        /* renamed from: d, reason: collision with root package name */
        public Object f95118d;

        /* renamed from: e, reason: collision with root package name */
        public Object f95119e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f95120f;

        /* renamed from: h, reason: collision with root package name */
        public int f95122h;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f95120f = obj;
            this.f95122h |= Integer.MIN_VALUE;
            return o.this.f(0, this);
        }
    }

    public o(@m80.k ObserverSentenceJourneyUC observerSentenceJourneyUC, @m80.k x5.d unitRepo, @m80.k c6.b userGameRepo, @m80.k com.baicizhan.app.biz.game.uc.sentence.a checkSentenceGameIntegrityUC, @m80.k com.baicizhan.app.biz.game.uc.sentence.f markSentenceChangedUC, @m80.k com.baicizhan.app.biz.game.uc.sentence.d extractUnitInfoUC) {
        g0.p(observerSentenceJourneyUC, "observerSentenceJourneyUC");
        g0.p(unitRepo, "unitRepo");
        g0.p(userGameRepo, "userGameRepo");
        g0.p(checkSentenceGameIntegrityUC, "checkSentenceGameIntegrityUC");
        g0.p(markSentenceChangedUC, "markSentenceChangedUC");
        g0.p(extractUnitInfoUC, "extractUnitInfoUC");
        this.f95094a = observerSentenceJourneyUC;
        this.f95095b = unitRepo;
        this.f95096c = userGameRepo;
        this.f95097d = checkSentenceGameIntegrityUC;
        this.f95098e = markSentenceChangedUC;
        this.f95099f = extractUnitInfoUC;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:(1:(1:(1:(5:14|15|16|17|(1:22)(2:19|20))(2:24|25))(5:26|27|28|(1:30)(1:(1:37))|31))(3:38|39|(3:41|42|(3:46|47|(2:49|33)(4:50|28|(0)(0)|31))(1:45))(7:51|52|42|(0)|46|47|(0)(0))))(9:53|54|(3:57|(3:59|39|(0)(0))|33)|52|42|(0)|46|47|(0)(0)))(1:60))(1:64)|61|(9:63|54|(2:57|(0))|52|42|(0)|46|47|(0)(0))|33))|68|6|7|(0)(0)|61|(0)|33) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0161, code lost:
    
        if (r0 != r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0087, code lost:
    
        if (r0 == r3) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0044, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x016b, code lost:
    
        r2 = kotlin.Result.Companion;
        r0 = kotlin.Result.m6308constructorimpl(kotlin.e.a(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0138 A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:15:0x003f, B:16:0x0164, B:27:0x0065, B:28:0x0134, B:30:0x0138, B:31:0x0143, B:35:0x013d, B:37:0x0141, B:47:0x010b), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@m80.k j00.c<? super x4.a> r22) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.o.c(j00.c):java.lang.Object");
    }

    @m80.l
    public final Object d(@m80.k j00.c<? super x4.a> cVar) {
        Boolean a11 = l00.a.a(this.f95095b.i());
        if (!a11.booleanValue()) {
            a11 = null;
        }
        if (a11 != null) {
            return new a.b(new o.a0(u4.g.b(new b(null)), u4.g.a()), null, 2, null);
        }
        return null;
    }

    @m80.l
    public final Object e(@m80.k j0 j0Var, @m80.k SwitchType switchType, @m80.k j00.c<? super x4.a> cVar) {
        return new a.b(new o.t(com.baicizhan.app.biz.game.impl.home.sentence.a.a(j0Var), switchType, u4.g.b(new c(null)), u4.g.a()), null, 2, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:(1:(5:12|13|14|15|(1:20)(2:17|18))(2:22|23))(3:24|25|26))(3:29|30|31))(3:36|37|(2:39|28)(1:40))|32|(2:34|28)(2:35|26)))|43|6|7|(0)(0)|32|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ca, code lost:
    
        if (r12 != r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x003c, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d4, code lost:
    
        r12 = kotlin.Result.Companion;
        r11 = kotlin.Result.m6308constructorimpl(kotlin.e.a(r11));
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(int r11, @m80.k j00.c<? super x4.a> r12) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.o.f(int, j00.c):java.lang.Object");
    }
}
