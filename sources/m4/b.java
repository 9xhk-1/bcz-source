package m4;

import c40.r0;
import com.baicizhan.app.api.service.BizException;
import com.baicizhan.app.api.service.GameCategoryVo;
import com.baicizhan.app.api.service.GameType;
import com.baicizhan.app.api.service.model.BookLanguageType;
import com.baicizhan.app.biz.base.BizInternalException;
import com.baicizhan.app.biz.game.uc.abtest.GetABTestUC;
import com.baicizhan.app.biz.game.uc.user.ObserveUserGameInfoWithoutRewardUC;
import com.baicizhan.app.net.exception.NetworkException;
import com.baicizhan.biz.online.thrift.basic.LogicException;
import com.baicizhan.biz.online.thrift.basic.SystemException;
import com.baicizhan.client.business.dataset.provider.a;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import k3.s0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import w30.b;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {s0.class})
@u0({"SMAP\nGameServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameServiceImpl.kt\ncom/baicizhan/app/biz/game/impl/gameservice/GameServiceImpl\n+ 2 TimeMeasurer.kt\ncom/baicizhan/app/biz/base/TimeMeasurerKt\n+ 3 BizCatch.kt\ncom/baicizhan/app/biz/base/BizCatchKt\n*L\n1#1,181:1\n12#2,3:182\n15#2,10:197\n12#3,12:185\n*S KotlinDebug\n*F\n+ 1 GameServiceImpl.kt\ncom/baicizhan/app/biz/game/impl/gameservice/GameServiceImpl\n*L\n-1#1:182,3\n-1#1:197,10\n-1#1:185,12\n*E\n"})
/* loaded from: classes3.dex */
public final class b implements s0 {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final o6.b0 f72139b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final n6.g f72140c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final n6.i f72141d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final n6.a f72142e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final n6.f f72143f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.monetization.d f72144g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final c6.b f72145h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.monetization.g f72146i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final s6.k f72147j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final s5.b f72148k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.monetization.a f72149l;

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public final ObserveUserGameInfoWithoutRewardUC f72150m;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public final GetABTestUC f72151n;

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public final l6.h f72152o;

    /* renamed from: p, reason: collision with root package name */
    @m80.k
    public final j6.b f72153p;

    /* renamed from: q, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.schedule.f f72154q;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.gameservice.GameServiceImpl", f = "GameServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {100}, m = "claimFreeMembership", n = {"tag$iv", "freeMembershipType", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-GameServiceImpl$claimFreeMembership$2", "$i$f$bizCatch", "$i$a$-bizCatch-GameServiceImpl$claimFreeMembership$2$1"}, s = {"L$0", "I$0", "I$1", "J$0", "I$2", "I$3", "I$4"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f72155a;

        /* renamed from: b, reason: collision with root package name */
        public int f72156b;

        /* renamed from: c, reason: collision with root package name */
        public int f72157c;

        /* renamed from: d, reason: collision with root package name */
        public int f72158d;

        /* renamed from: e, reason: collision with root package name */
        public int f72159e;

        /* renamed from: f, reason: collision with root package name */
        public Object f72160f;

        /* renamed from: g, reason: collision with root package name */
        public long f72161g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f72162h;

        /* renamed from: j, reason: collision with root package name */
        public int f72164j;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f72162h = obj;
            this.f72164j |= Integer.MIN_VALUE;
            return b.this.z(0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.gameservice.GameServiceImpl", f = "GameServiceImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {94}, m = "updateUserEntitlements", n = {"tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-GameServiceImpl$updateUserEntitlements$2", "$i$f$bizCatch", "$i$a$-bizCatch-GameServiceImpl$updateUserEntitlements$2$1"}, s = {"L$0", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class a0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f72165a;

        /* renamed from: b, reason: collision with root package name */
        public int f72166b;

        /* renamed from: c, reason: collision with root package name */
        public int f72167c;

        /* renamed from: d, reason: collision with root package name */
        public int f72168d;

        /* renamed from: e, reason: collision with root package name */
        public int f72169e;

        /* renamed from: f, reason: collision with root package name */
        public long f72170f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f72171g;

        /* renamed from: i, reason: collision with root package name */
        public int f72173i;

        public a0(j00.c<? super a0> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f72171g = obj;
            this.f72173i |= Integer.MIN_VALUE;
            return b.this.P(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.gameservice.GameServiceImpl$claimFreeMembership$2$1$1", f = "GameServiceImpl.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: m4.b$b, reason: collision with other inner class name */
    public static final class C0869b extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f72174a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f72176c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0869b(int i11, j00.c<? super C0869b> cVar) {
            super(2, cVar);
            this.f72176c = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return b.this.new C0869b(this.f72176c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((C0869b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f72174a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                com.baicizhan.app.biz.game.uc.monetization.d dVar = b.this.f72144g;
                int i12 = this.f72176c;
                this.f72174a = 1;
                if (dVar.b(i12, this) == l11) {
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
    @l00.d(c = "com.baicizhan.app.biz.game.impl.gameservice.GameServiceImpl$updateUserEntitlements$2$1$1", f = "GameServiceImpl.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b0 extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f72177a;

        public b0(j00.c<? super b0> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return b.this.new b0(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((b0) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f72177a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                s6.k kVar = b.this.f72147j;
                this.f72177a = 1;
                if (kVar.d(this) == l11) {
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
    @l00.d(c = "com.baicizhan.app.biz.game.impl.gameservice.GameServiceImpl", f = "GameServiceImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {152}, m = "cleanResourceCache", n = {"tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-GameServiceImpl$cleanResourceCache$2", "$i$f$bizCatch", "$i$a$-bizCatch-GameServiceImpl$cleanResourceCache$2$1"}, s = {"L$0", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f72179a;

        /* renamed from: b, reason: collision with root package name */
        public int f72180b;

        /* renamed from: c, reason: collision with root package name */
        public int f72181c;

        /* renamed from: d, reason: collision with root package name */
        public int f72182d;

        /* renamed from: e, reason: collision with root package name */
        public int f72183e;

        /* renamed from: f, reason: collision with root package name */
        public long f72184f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f72185g;

        /* renamed from: i, reason: collision with root package name */
        public int f72187i;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f72185g = obj;
            this.f72187i |= Integer.MIN_VALUE;
            return b.this.e1(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.gameservice.GameServiceImpl", f = "GameServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {137}, m = "gainEnergy", n = {"gameCategoryVo", "tag$iv", "count", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-GameServiceImpl$gainEnergy$2", "$i$f$bizCatch", "$i$a$-bizCatch-GameServiceImpl$gainEnergy$2$1"}, s = {"L$0", "L$1", "I$0", "I$1", "J$0", "I$2", "I$3", "I$4"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f72188a;

        /* renamed from: b, reason: collision with root package name */
        public int f72189b;

        /* renamed from: c, reason: collision with root package name */
        public int f72190c;

        /* renamed from: d, reason: collision with root package name */
        public int f72191d;

        /* renamed from: e, reason: collision with root package name */
        public int f72192e;

        /* renamed from: f, reason: collision with root package name */
        public Object f72193f;

        /* renamed from: g, reason: collision with root package name */
        public Object f72194g;

        /* renamed from: h, reason: collision with root package name */
        public long f72195h;

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f72196i;

        /* renamed from: k, reason: collision with root package name */
        public int f72198k;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f72196i = obj;
            this.f72198k |= Integer.MIN_VALUE;
            return b.this.a0(0, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.gameservice.GameServiceImpl", f = "GameServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {167}, m = "getBookLanguage", n = {"tag$iv", "bookId", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-GameServiceImpl$getBookLanguage$2", "$i$f$bizCatch", "$i$a$-bizCatch-GameServiceImpl$getBookLanguage$2$1"}, s = {"L$0", "I$0", "I$1", "J$0", "I$2", "I$3", "I$4"}, v = 1)
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f72199a;

        /* renamed from: b, reason: collision with root package name */
        public int f72200b;

        /* renamed from: c, reason: collision with root package name */
        public int f72201c;

        /* renamed from: d, reason: collision with root package name */
        public int f72202d;

        /* renamed from: e, reason: collision with root package name */
        public int f72203e;

        /* renamed from: f, reason: collision with root package name */
        public Object f72204f;

        /* renamed from: g, reason: collision with root package name */
        public long f72205g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f72206h;

        /* renamed from: j, reason: collision with root package name */
        public int f72208j;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f72206h = obj;
            this.f72208j |= Integer.MIN_VALUE;
            return b.this.r0(0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.gameservice.GameServiceImpl$getBookLanguage$2$1$1", f = "GameServiceImpl.kt", i = {}, l = {168}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class f extends SuspendLambda implements x00.p<r0, j00.c<? super BookLanguageType>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f72209a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f72211c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i11, j00.c<? super f> cVar) {
            super(2, cVar);
            this.f72211c = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return b.this.new f(this.f72211c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super BookLanguageType> cVar) {
            return ((f) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f72209a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            com.baicizhan.app.biz.game.uc.schedule.f fVar = b.this.f72154q;
            long j11 = this.f72211c;
            this.f72209a = 1;
            Object a11 = fVar.a(j11, this);
            return a11 == l11 ? l11 : a11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.gameservice.GameServiceImpl", f = "GameServiceImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {106}, m = "getCurrentBookSaleInfo", n = {"tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-GameServiceImpl$getCurrentBookSaleInfo$2", "$i$f$bizCatch", "$i$a$-bizCatch-GameServiceImpl$getCurrentBookSaleInfo$2$1"}, s = {"L$0", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f72212a;

        /* renamed from: b, reason: collision with root package name */
        public int f72213b;

        /* renamed from: c, reason: collision with root package name */
        public int f72214c;

        /* renamed from: d, reason: collision with root package name */
        public int f72215d;

        /* renamed from: e, reason: collision with root package name */
        public int f72216e;

        /* renamed from: f, reason: collision with root package name */
        public long f72217f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f72218g;

        /* renamed from: i, reason: collision with root package name */
        public int f72220i;

        public g(j00.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f72218g = obj;
            this.f72220i |= Integer.MIN_VALUE;
            return b.this.s0(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.gameservice.GameServiceImpl$getCurrentBookSaleInfo$2$1$1", f = "GameServiceImpl.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class h extends SuspendLambda implements x00.p<r0, j00.c<? super l3.b>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f72221a;

        public h(j00.c<? super h> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return b.this.new h(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super l3.b> cVar) {
            return ((h) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f72221a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            b bVar = b.this;
            this.f72221a = 1;
            Object A2 = bVar.A2(this);
            return A2 == l11 ? l11 : A2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.gameservice.GameServiceImpl", f = "GameServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {142}, m = "getEnergy", n = {"gameCategoryVo", "tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-GameServiceImpl$getEnergy$2", "$i$f$bizCatch", "$i$a$-bizCatch-GameServiceImpl$getEnergy$2$1"}, s = {"L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f72223a;

        /* renamed from: b, reason: collision with root package name */
        public Object f72224b;

        /* renamed from: c, reason: collision with root package name */
        public int f72225c;

        /* renamed from: d, reason: collision with root package name */
        public int f72226d;

        /* renamed from: e, reason: collision with root package name */
        public int f72227e;

        /* renamed from: f, reason: collision with root package name */
        public int f72228f;

        /* renamed from: g, reason: collision with root package name */
        public long f72229g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f72230h;

        /* renamed from: j, reason: collision with root package name */
        public int f72232j;

        public i(j00.c<? super i> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f72230h = obj;
            this.f72232j |= Integer.MIN_VALUE;
            return b.this.n2(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.gameservice.GameServiceImpl$getEnergy$2$1$1", f = "GameServiceImpl.kt", i = {}, l = {143, 144}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class j extends SuspendLambda implements x00.p<r0, j00.c<? super l3.n>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f72233a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ GameCategoryVo f72235c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(GameCategoryVo gameCategoryVo, j00.c<? super j> cVar) {
            super(2, cVar);
            this.f72235c = gameCategoryVo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return b.this.new j(this.f72235c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super l3.n> cVar) {
            return ((j) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        
            if (r5 == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
        
            if (r5 == r0) goto L15;
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
                int r1 = r4.f72233a
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
                goto L36
            L1e:
                kotlin.e.n(r5)
                m4.b r5 = m4.b.this
                com.baicizhan.app.biz.game.uc.user.ObserveUserGameInfoWithoutRewardUC r5 = m4.b.E(r5)
                com.baicizhan.app.api.service.GameCategoryVo r1 = r4.f72235c
                com.baicizhan.app.biz.game.repo.userresource.LanguageType r1 = m4.a.a(r1)
                r4.f72233a = r3
                java.lang.Object r5 = r5.b(r1, r4)
                if (r5 != r0) goto L36
                goto L40
            L36:
                kotlinx.coroutines.flow.i r5 = (kotlinx.coroutines.flow.i) r5
                r4.f72233a = r2
                java.lang.Object r5 = kotlinx.coroutines.flow.k.w0(r5, r4)
                if (r5 != r0) goto L41
            L40:
                return r0
            L41:
                h5.w0 r5 = (h5.w0) r5
                h5.y r0 = r5.i()
                l3.n r0 = u4.b.b(r0)
                if (r0 != 0) goto L56
                h5.g r5 = r5.h()
                l3.n r5 = u4.b.a(r5)
                return r5
            L56:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: m4.b.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.gameservice.GameServiceImpl", f = "GameServiceImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {71}, m = "getGameSettings", n = {"tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-GameServiceImpl$getGameSettings$2", "$i$f$bizCatch", "$i$a$-bizCatch-GameServiceImpl$getGameSettings$2$1"}, s = {"L$0", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class k extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f72236a;

        /* renamed from: b, reason: collision with root package name */
        public int f72237b;

        /* renamed from: c, reason: collision with root package name */
        public int f72238c;

        /* renamed from: d, reason: collision with root package name */
        public int f72239d;

        /* renamed from: e, reason: collision with root package name */
        public int f72240e;

        /* renamed from: f, reason: collision with root package name */
        public long f72241f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f72242g;

        /* renamed from: i, reason: collision with root package name */
        public int f72244i;

        public k(j00.c<? super k> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f72242g = obj;
            this.f72244i |= Integer.MIN_VALUE;
            return b.this.i0(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.gameservice.GameServiceImpl$getGameSettings$2$1$1", f = "GameServiceImpl.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class l extends SuspendLambda implements x00.p<r0, j00.c<? super Map<String, ? extends String>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f72245a;

        public l(j00.c<? super l> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return b.this.new l(cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(r0 r0Var, j00.c<? super Map<String, String>> cVar) {
            return ((l) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f72245a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            n6.g gVar = b.this.f72140c;
            this.f72245a = 1;
            Object a11 = gVar.a(this);
            return a11 == l11 ? l11 : a11;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super Map<String, ? extends String>> cVar) {
            return invoke2(r0Var, (j00.c<? super Map<String, String>>) cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.gameservice.GameServiceImpl", f = "GameServiceImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {127}, m = "getPurchasedBookList", n = {"tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-GameServiceImpl$getPurchasedBookList$2", "$i$f$bizCatch", "$i$a$-bizCatch-GameServiceImpl$getPurchasedBookList$2$1"}, s = {"L$0", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class m extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f72247a;

        /* renamed from: b, reason: collision with root package name */
        public int f72248b;

        /* renamed from: c, reason: collision with root package name */
        public int f72249c;

        /* renamed from: d, reason: collision with root package name */
        public int f72250d;

        /* renamed from: e, reason: collision with root package name */
        public int f72251e;

        /* renamed from: f, reason: collision with root package name */
        public long f72252f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f72253g;

        /* renamed from: i, reason: collision with root package name */
        public int f72255i;

        public m(j00.c<? super m> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f72253g = obj;
            this.f72255i |= Integer.MIN_VALUE;
            return b.this.U1(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.gameservice.GameServiceImpl$getPurchasedBookList$2$1$1", f = "GameServiceImpl.kt", i = {}, l = {128}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class n extends SuspendLambda implements x00.p<r0, j00.c<? super List<? extends Integer>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f72256a;

        public n(j00.c<? super n> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return b.this.new n(cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(r0 r0Var, j00.c<? super List<Integer>> cVar) {
            return ((n) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f72256a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            s5.b bVar = b.this.f72148k;
            this.f72256a = 1;
            Object a11 = bVar.a(this);
            return a11 == l11 ? l11 : a11;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super List<? extends Integer>> cVar) {
            return invoke2(r0Var, (j00.c<? super List<Integer>>) cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.gameservice.GameServiceImpl", f = "GameServiceImpl.kt", i = {0, 0}, l = {173}, m = "getSaleInfo", n = {"$this$getSaleInfo_u24lambda_u240", "$i$a$-runCatching-GameServiceImpl$getSaleInfo$2"}, s = {"L$0", "I$0"}, v = 1)
    public static final class o extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f72258a;

        /* renamed from: b, reason: collision with root package name */
        public int f72259b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f72260c;

        /* renamed from: e, reason: collision with root package name */
        public int f72262e;

        public o(j00.c<? super o> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f72260c = obj;
            this.f72262e |= Integer.MIN_VALUE;
            return b.this.A2(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.gameservice.GameServiceImpl", f = "GameServiceImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {112}, m = "getUserMemberShip", n = {"tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-GameServiceImpl$getUserMemberShip$2", "$i$f$bizCatch", "$i$a$-bizCatch-GameServiceImpl$getUserMemberShip$2$1"}, s = {"L$0", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class p extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f72263a;

        /* renamed from: b, reason: collision with root package name */
        public int f72264b;

        /* renamed from: c, reason: collision with root package name */
        public int f72265c;

        /* renamed from: d, reason: collision with root package name */
        public int f72266d;

        /* renamed from: e, reason: collision with root package name */
        public int f72267e;

        /* renamed from: f, reason: collision with root package name */
        public long f72268f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f72269g;

        /* renamed from: i, reason: collision with root package name */
        public int f72271i;

        public p(j00.c<? super p> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f72269g = obj;
            this.f72271i |= Integer.MIN_VALUE;
            return b.this.D1(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.gameservice.GameServiceImpl$getUserMemberShip$2$1$1", f = "GameServiceImpl.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class q extends SuspendLambda implements x00.p<r0, j00.c<? super l3.q>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f72272a;

        public q(j00.c<? super q> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return b.this.new q(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super l3.q> cVar) {
            return ((q) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f72272a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                c6.b bVar = b.this.f72145h;
                this.f72272a = 1;
                obj = bVar.r(this);
                if (obj == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return m4.a.c((h5.y) obj);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.gameservice.GameServiceImpl", f = "GameServiceImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {118}, m = "getUserMemberShipAndBookSaleInfo", n = {"tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-GameServiceImpl$getUserMemberShipAndBookSaleInfo$2", "$i$f$bizCatch", "$i$a$-bizCatch-GameServiceImpl$getUserMemberShipAndBookSaleInfo$2$1"}, s = {"L$0", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class r extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f72274a;

        /* renamed from: b, reason: collision with root package name */
        public int f72275b;

        /* renamed from: c, reason: collision with root package name */
        public int f72276c;

        /* renamed from: d, reason: collision with root package name */
        public int f72277d;

        /* renamed from: e, reason: collision with root package name */
        public int f72278e;

        /* renamed from: f, reason: collision with root package name */
        public long f72279f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f72280g;

        /* renamed from: i, reason: collision with root package name */
        public int f72282i;

        public r(j00.c<? super r> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f72280g = obj;
            this.f72282i |= Integer.MIN_VALUE;
            return b.this.T(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.gameservice.GameServiceImpl$getUserMemberShipAndBookSaleInfo$2$1$1", f = "GameServiceImpl.kt", i = {}, l = {120, 121}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class s extends SuspendLambda implements x00.p<r0, j00.c<? super l3.c>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f72283a;

        /* renamed from: b, reason: collision with root package name */
        public int f72284b;

        public s(j00.c<? super s> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return b.this.new s(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super l3.c> cVar) {
            return ((s) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
        
            if (r5 == r0) goto L15;
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
                int r1 = r4.f72284b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r4.f72283a
                l3.b r0 = (l3.b) r0
                kotlin.e.n(r5)
                goto L45
            L16:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1e:
                kotlin.e.n(r5)
                goto L30
            L22:
                kotlin.e.n(r5)
                m4.b r5 = m4.b.this
                r4.f72284b = r3
                java.lang.Object r5 = m4.b.B0(r5, r4)
                if (r5 != r0) goto L30
                goto L42
            L30:
                l3.b r5 = (l3.b) r5
                m4.b r1 = m4.b.this
                c6.b r1 = m4.b.u2(r1)
                r4.f72283a = r5
                r4.f72284b = r2
                java.lang.Object r1 = r1.r(r4)
                if (r1 != r0) goto L43
            L42:
                return r0
            L43:
                r0 = r5
                r5 = r1
            L45:
                h5.y r5 = (h5.y) r5
                l3.q r5 = m4.a.c(r5)
                l3.c r1 = new l3.c
                r1.<init>(r0, r5)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: m4.b.s.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.gameservice.GameServiceImpl", f = "GameServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {77}, m = "setGamsSetting", n = {a.d.C0245a.f16161a, "value", "tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-GameServiceImpl$setGamsSetting$2", "$i$f$bizCatch", "$i$a$-bizCatch-GameServiceImpl$setGamsSetting$2$1"}, s = {"L$0", "L$1", "L$2", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class t extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f72286a;

        /* renamed from: b, reason: collision with root package name */
        public Object f72287b;

        /* renamed from: c, reason: collision with root package name */
        public Object f72288c;

        /* renamed from: d, reason: collision with root package name */
        public int f72289d;

        /* renamed from: e, reason: collision with root package name */
        public int f72290e;

        /* renamed from: f, reason: collision with root package name */
        public int f72291f;

        /* renamed from: g, reason: collision with root package name */
        public int f72292g;

        /* renamed from: h, reason: collision with root package name */
        public long f72293h;

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f72294i;

        /* renamed from: k, reason: collision with root package name */
        public int f72296k;

        public t(j00.c<? super t> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f72294i = obj;
            this.f72296k |= Integer.MIN_VALUE;
            return b.this.V0(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.gameservice.GameServiceImpl$setGamsSetting$2$1$1", f = "GameServiceImpl.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class u extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f72297a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f72299c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f72300d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(String str, String str2, j00.c<? super u> cVar) {
            super(2, cVar);
            this.f72299c = str;
            this.f72300d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return b.this.new u(this.f72299c, this.f72300d, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((u) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f72297a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                n6.i iVar = b.this.f72141d;
                String str = this.f72299c;
                String str2 = this.f72300d;
                this.f72297a = 1;
                if (iVar.a(str, str2, this) == l11) {
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
    @l00.d(c = "com.baicizhan.app.biz.game.impl.gameservice.GameServiceImpl", f = "GameServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {84}, m = "setGamsSettings", n = {"settings", "tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-GameServiceImpl$setGamsSettings$2", "$i$f$bizCatch", "$i$a$-bizCatch-GameServiceImpl$setGamsSettings$2$1"}, s = {"L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class v extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f72301a;

        /* renamed from: b, reason: collision with root package name */
        public Object f72302b;

        /* renamed from: c, reason: collision with root package name */
        public int f72303c;

        /* renamed from: d, reason: collision with root package name */
        public int f72304d;

        /* renamed from: e, reason: collision with root package name */
        public int f72305e;

        /* renamed from: f, reason: collision with root package name */
        public int f72306f;

        /* renamed from: g, reason: collision with root package name */
        public long f72307g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f72308h;

        /* renamed from: j, reason: collision with root package name */
        public int f72310j;

        public v(j00.c<? super v> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f72308h = obj;
            this.f72310j |= Integer.MIN_VALUE;
            return b.this.o2(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.gameservice.GameServiceImpl", f = "GameServiceImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {58}, m = "startNewUserGame", n = {"tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-GameServiceImpl$startNewUserGame$2", "$i$f$bizCatch", "$i$a$-bizCatch-GameServiceImpl$startNewUserGame$2$1"}, s = {"L$0", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class w extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f72311a;

        /* renamed from: b, reason: collision with root package name */
        public int f72312b;

        /* renamed from: c, reason: collision with root package name */
        public int f72313c;

        /* renamed from: d, reason: collision with root package name */
        public int f72314d;

        /* renamed from: e, reason: collision with root package name */
        public int f72315e;

        /* renamed from: f, reason: collision with root package name */
        public long f72316f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f72317g;

        /* renamed from: i, reason: collision with root package name */
        public int f72319i;

        public w(j00.c<? super w> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f72317g = obj;
            this.f72319i |= Integer.MIN_VALUE;
            return b.this.s2(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.gameservice.GameServiceImpl$startNewUserGame$2$1$1", f = "GameServiceImpl.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class x extends SuspendLambda implements x00.p<r0, j00.c<? super GameType>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f72320a;

        public x(j00.c<? super x> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return b.this.new x(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super GameType> cVar) {
            return ((x) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f72320a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                o6.b0 b0Var = b.this.f72139b;
                this.f72320a = 1;
                if (b0Var.a(this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return GameType.Learning;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.gameservice.GameServiceImpl", f = "GameServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {161}, m = "switchGameMode", n = {"tag$iv", "mode", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-GameServiceImpl$switchGameMode$2", "$i$f$bizCatch", "$i$a$-bizCatch-GameServiceImpl$switchGameMode$2$1"}, s = {"L$0", "I$0", "I$1", "J$0", "I$2", "I$3", "I$4"}, v = 1)
    public static final class y extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f72322a;

        /* renamed from: b, reason: collision with root package name */
        public int f72323b;

        /* renamed from: c, reason: collision with root package name */
        public int f72324c;

        /* renamed from: d, reason: collision with root package name */
        public int f72325d;

        /* renamed from: e, reason: collision with root package name */
        public int f72326e;

        /* renamed from: f, reason: collision with root package name */
        public Object f72327f;

        /* renamed from: g, reason: collision with root package name */
        public long f72328g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f72329h;

        /* renamed from: j, reason: collision with root package name */
        public int f72331j;

        public y(j00.c<? super y> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f72329h = obj;
            this.f72331j |= Integer.MIN_VALUE;
            return b.this.u1(0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.gameservice.GameServiceImpl$switchGameMode$2$1$1", f = "GameServiceImpl.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class z extends SuspendLambda implements x00.p<r0, j00.c<? super Integer>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f72332a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f72334c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(int i11, j00.c<? super z> cVar) {
            super(2, cVar);
            this.f72334c = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return b.this.new z(this.f72334c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super Integer> cVar) {
            return ((z) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f72332a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            j6.b bVar = b.this.f72153p;
            int i12 = this.f72334c;
            this.f72332a = 1;
            Object b11 = bVar.b(i12, this);
            return b11 == l11 ? l11 : b11;
        }
    }

    public b(@m80.k o6.b0 startNewUserGameUC, @m80.k n6.g getWordsSettingUC, @m80.k n6.i setSettingUC, @m80.k n6.a commitSettingsUC, @m80.k n6.f getWordsSettingSyncUC, @m80.k com.baicizhan.app.biz.game.uc.monetization.d claimFreeMemberUC, @m80.k c6.b userGameInfoRepo, @m80.k com.baicizhan.app.biz.game.uc.monetization.g getCurrentBookSaleInfoUC, @m80.k s6.k updateUserEntitlementsUC, @m80.k s5.b purchasedBookRepo, @m80.k com.baicizhan.app.biz.game.uc.monetization.a buyEnergyUC, @m80.k ObserveUserGameInfoWithoutRewardUC observeUserGameInfoWithoutRewardUC, @m80.k GetABTestUC getABTestUC, @m80.k l6.h cleanResourceCacheUC, @m80.k j6.b switchGameModeUC, @m80.k com.baicizhan.app.biz.game.uc.schedule.f getBookLanguageUC) {
        g0.p(startNewUserGameUC, "startNewUserGameUC");
        g0.p(getWordsSettingUC, "getWordsSettingUC");
        g0.p(setSettingUC, "setSettingUC");
        g0.p(commitSettingsUC, "commitSettingsUC");
        g0.p(getWordsSettingSyncUC, "getWordsSettingSyncUC");
        g0.p(claimFreeMemberUC, "claimFreeMemberUC");
        g0.p(userGameInfoRepo, "userGameInfoRepo");
        g0.p(getCurrentBookSaleInfoUC, "getCurrentBookSaleInfoUC");
        g0.p(updateUserEntitlementsUC, "updateUserEntitlementsUC");
        g0.p(purchasedBookRepo, "purchasedBookRepo");
        g0.p(buyEnergyUC, "buyEnergyUC");
        g0.p(observeUserGameInfoWithoutRewardUC, "observeUserGameInfoWithoutRewardUC");
        g0.p(getABTestUC, "getABTestUC");
        g0.p(cleanResourceCacheUC, "cleanResourceCacheUC");
        g0.p(switchGameModeUC, "switchGameModeUC");
        g0.p(getBookLanguageUC, "getBookLanguageUC");
        this.f72139b = startNewUserGameUC;
        this.f72140c = getWordsSettingUC;
        this.f72141d = setSettingUC;
        this.f72142e = commitSettingsUC;
        this.f72143f = getWordsSettingSyncUC;
        this.f72144g = claimFreeMemberUC;
        this.f72145h = userGameInfoRepo;
        this.f72146i = getCurrentBookSaleInfoUC;
        this.f72147j = updateUserEntitlementsUC;
        this.f72148k = purchasedBookRepo;
        this.f72149l = buyEnergyUC;
        this.f72150m = observeUserGameInfoWithoutRewardUC;
        this.f72151n = getABTestUC;
        this.f72152o = cleanResourceCacheUC;
        this.f72153p = switchGameModeUC;
        this.f72154q = getBookLanguageUC;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:25|26))(3:27|28|(1:30))|12|13|(3:18|19|20)|15|16))|33|6|7|(0)(0)|12|13|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002d, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006b, code lost:
    
        r0 = kotlin.Result.Companion;
        r5 = kotlin.Result.m6308constructorimpl(kotlin.e.a(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A2(j00.c<? super l3.b> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof m4.b.o
            if (r0 == 0) goto L13
            r0 = r5
            m4.b$o r0 = (m4.b.o) r0
            int r1 = r0.f72262e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f72262e = r1
            goto L18
        L13:
            m4.b$o r0 = new m4.b$o
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f72260c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f72262e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f72258a
            m4.b r0 = (m4.b) r0
            kotlin.e.n(r5)     // Catch: java.lang.Throwable -> L2d
            goto L50
        L2d:
            r5 = move-exception
            goto L6b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            kotlin.e.n(r5)
            kotlin.Result$a r5 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L2d
            com.baicizhan.app.biz.game.uc.monetization.g r5 = r4.f72146i     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r2 = l00.k.a(r4)     // Catch: java.lang.Throwable -> L2d
            r0.f72258a = r2     // Catch: java.lang.Throwable -> L2d
            r2 = 0
            r0.f72259b = r2     // Catch: java.lang.Throwable -> L2d
            r0.f72262e = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r5 = r5.a(r0)     // Catch: java.lang.Throwable -> L2d
            if (r5 != r1) goto L50
            return r1
        L50:
            kotlin.Pair r5 = (kotlin.Pair) r5     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r0 = r5.getFirst()     // Catch: java.lang.Throwable -> L2d
            h5.j r0 = (h5.j) r0     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r5 = r5.getSecond()     // Catch: java.lang.Throwable -> L2d
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L2d
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L2d
            l3.b r5 = m4.a.b(r0, r5)     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r5 = kotlin.Result.m6308constructorimpl(r5)     // Catch: java.lang.Throwable -> L2d
            goto L75
        L6b:
            kotlin.Result$a r0 = kotlin.Result.Companion
            java.lang.Object r5 = kotlin.e.a(r5)
            java.lang.Object r5 = kotlin.Result.m6308constructorimpl(r5)
        L75:
            java.lang.Throwable r0 = kotlin.Result.m6311exceptionOrNullimpl(r5)
            if (r0 != 0) goto L7c
            goto L8f
        L7c:
            kotlin.Result$a r5 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L84
            com.baicizhan.app.net.exception.NetworkException r5 = new com.baicizhan.app.net.exception.NetworkException     // Catch: java.lang.Throwable -> L84
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L84
            throw r5     // Catch: java.lang.Throwable -> L84
        L84:
            r5 = move-exception
            kotlin.Result$a r0 = kotlin.Result.Companion
            java.lang.Object r5 = kotlin.e.a(r5)
            java.lang.Object r5 = kotlin.Result.m6308constructorimpl(r5)
        L8f:
            kotlin.e.n(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.b.A2(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b0 A[Catch: all -> 0x00c8, TryCatch #2 {all -> 0x00c8, blocks: (B:22:0x00a9, B:24:0x00b0, B:26:0x00b4, B:28:0x00b8, B:30:0x00bc, B:32:0x00c0, B:43:0x0127, B:34:0x00cb, B:36:0x00d6, B:38:0x00ea, B:40:0x00fe, B:42:0x0113), top: B:21:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0113 A[Catch: all -> 0x00c8, TryCatch #2 {all -> 0x00c8, blocks: (B:22:0x00a9, B:24:0x00b0, B:26:0x00b4, B:28:0x00b8, B:30:0x00bc, B:32:0x00c0, B:43:0x0127, B:34:0x00cb, B:36:0x00d6, B:38:0x00ea, B:40:0x00fe, B:42:0x0113), top: B:21:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.s0
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object D1(@m80.k j00.c<? super l3.q> r12) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.b.D1(j00.c):java.lang.Object");
    }

    @Override // k3.s0
    @s3.a
    @m80.k
    public Map<String, String> G() {
        b.C1273b c1273b = b.C1273b.f94770b;
        long epochMilliseconds = c1273b.a().toEpochMilliseconds();
        try {
            Map<String, String> a11 = this.f72143f.a();
            if (c4.n.h().k()) {
                z6.b.d(z6.b.f101032b, s3.c.f87469a, "[getGameSettingsSync] cost: " + (c1273b.a().toEpochMilliseconds() - epochMilliseconds), null, 4, null);
            }
            return a11;
        } catch (Throwable th2) {
            try {
                if (th2 instanceof BizException) {
                    throw new BizException(((BizException) th2).getMsg(), th2, ((BizException) th2).getCode() + 100000);
                }
                if (th2 instanceof BizInternalException) {
                    throw new BizException(((BizInternalException) th2).getMsg(), th2, ((BizInternalException) th2).getCode() + 100000);
                }
                if (th2 instanceof SystemException) {
                    throw new BizException(((SystemException) th2).message_, th2, ((SystemException) th2).code + 300000);
                }
                if (th2 instanceof LogicException) {
                    throw new BizException(((LogicException) th2).message_, th2, ((LogicException) th2).code + s3.c.f87471c);
                }
                if (th2 instanceof NetworkException) {
                    throw new BizException("网络异常，请稍候重试", th2, 100000);
                }
                throw new BizException("未知错误，请稍后重试~", th2, s3.c.f87474f);
            } catch (Throwable th3) {
                if (c4.n.h().k()) {
                    z6.b.f101032b.e(s3.c.f87469a, "[getGameSettingsSync] error cost: " + (b.C1273b.f94770b.a().toEpochMilliseconds() - epochMilliseconds), th3);
                }
                throw th3;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00af A[Catch: all -> 0x00c7, TryCatch #2 {all -> 0x00c7, blocks: (B:22:0x00a8, B:24:0x00af, B:26:0x00b3, B:28:0x00b7, B:30:0x00bb, B:32:0x00bf, B:43:0x0126, B:34:0x00ca, B:36:0x00d5, B:38:0x00e9, B:40:0x00fd, B:42:0x0112), top: B:21:0x00a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0112 A[Catch: all -> 0x00c7, TryCatch #2 {all -> 0x00c7, blocks: (B:22:0x00a8, B:24:0x00af, B:26:0x00b3, B:28:0x00b7, B:30:0x00bb, B:32:0x00bf, B:43:0x0126, B:34:0x00ca, B:36:0x00d5, B:38:0x00e9, B:40:0x00fd, B:42:0x0112), top: B:21:0x00a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.s0
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object P(@m80.k j00.c<? super yz.g2> r12) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.b.P(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b0 A[Catch: all -> 0x00c8, TryCatch #2 {all -> 0x00c8, blocks: (B:22:0x00a9, B:24:0x00b0, B:26:0x00b4, B:28:0x00b8, B:30:0x00bc, B:32:0x00c0, B:43:0x0127, B:34:0x00cb, B:36:0x00d6, B:38:0x00ea, B:40:0x00fe, B:42:0x0113), top: B:21:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0113 A[Catch: all -> 0x00c8, TryCatch #2 {all -> 0x00c8, blocks: (B:22:0x00a9, B:24:0x00b0, B:26:0x00b4, B:28:0x00b8, B:30:0x00bc, B:32:0x00c0, B:43:0x0127, B:34:0x00cb, B:36:0x00d6, B:38:0x00ea, B:40:0x00fe, B:42:0x0113), top: B:21:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.s0
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object T(@m80.k j00.c<? super l3.c> r12) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.b.T(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b0 A[Catch: all -> 0x00c8, TryCatch #2 {all -> 0x00c8, blocks: (B:22:0x00a9, B:24:0x00b0, B:26:0x00b4, B:28:0x00b8, B:30:0x00bc, B:32:0x00c0, B:43:0x0127, B:34:0x00cb, B:36:0x00d6, B:38:0x00ea, B:40:0x00fe, B:42:0x0113), top: B:21:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0113 A[Catch: all -> 0x00c8, TryCatch #2 {all -> 0x00c8, blocks: (B:22:0x00a9, B:24:0x00b0, B:26:0x00b4, B:28:0x00b8, B:30:0x00bc, B:32:0x00c0, B:43:0x0127, B:34:0x00cb, B:36:0x00d6, B:38:0x00ea, B:40:0x00fe, B:42:0x0113), top: B:21:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.s0
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object U1(@m80.k j00.c<? super java.util.List<java.lang.Integer>> r12) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.b.U1(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3 A[Catch: all -> 0x00db, TryCatch #2 {all -> 0x00db, blocks: (B:22:0x00bc, B:24:0x00c3, B:26:0x00c7, B:28:0x00cb, B:30:0x00cf, B:32:0x00d3, B:43:0x013a, B:34:0x00de, B:36:0x00e9, B:38:0x00fd, B:40:0x0111, B:42:0x0126), top: B:21:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0126 A[Catch: all -> 0x00db, TryCatch #2 {all -> 0x00db, blocks: (B:22:0x00bc, B:24:0x00c3, B:26:0x00c7, B:28:0x00cb, B:30:0x00cf, B:32:0x00d3, B:43:0x013a, B:34:0x00de, B:36:0x00e9, B:38:0x00fd, B:40:0x0111, B:42:0x0126), top: B:21:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.s0
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object V0(@m80.k java.lang.String r11, @m80.l java.lang.String r12, @m80.k j00.c<? super yz.g2> r13) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.b.V0(java.lang.String, java.lang.String, j00.c):java.lang.Object");
    }

    @Override // k3.s0
    @s3.a
    public long X1() throws BizException, CancellationException {
        b.C1273b c1273b = b.C1273b.f94770b;
        long epochMilliseconds = c1273b.a().toEpochMilliseconds();
        try {
            long n11 = w3.g.n();
            if (c4.n.h().k()) {
                z6.b.d(z6.b.f101032b, s3.c.f87469a, "[currentTimeStamp] cost: " + (c1273b.a().toEpochMilliseconds() - epochMilliseconds), null, 4, null);
            }
            return n11;
        } catch (Throwable th2) {
            try {
                if (th2 instanceof BizException) {
                    throw new BizException(((BizException) th2).getMsg(), th2, ((BizException) th2).getCode() + 100000);
                }
                if (th2 instanceof BizInternalException) {
                    throw new BizException(((BizInternalException) th2).getMsg(), th2, ((BizInternalException) th2).getCode() + 100000);
                }
                if (th2 instanceof SystemException) {
                    throw new BizException(((SystemException) th2).message_, th2, ((SystemException) th2).code + 300000);
                }
                if (th2 instanceof LogicException) {
                    throw new BizException(((LogicException) th2).message_, th2, ((LogicException) th2).code + s3.c.f87471c);
                }
                if (th2 instanceof NetworkException) {
                    throw new BizException("网络异常，请稍候重试", th2, 100000);
                }
                throw new BizException("未知错误，请稍后重试~", th2, s3.c.f87474f);
            } catch (Throwable th3) {
                if (c4.n.h().k()) {
                    z6.b.f101032b.e(s3.c.f87469a, "[currentTimeStamp] error cost: " + (b.C1273b.f94770b.a().toEpochMilliseconds() - epochMilliseconds), th3);
                }
                throw th3;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bb A[Catch: all -> 0x00d3, TryCatch #0 {all -> 0x00d3, blocks: (B:22:0x00b4, B:24:0x00bb, B:26:0x00bf, B:28:0x00c3, B:30:0x00c7, B:32:0x00cb, B:43:0x0132, B:34:0x00d6, B:36:0x00e1, B:38:0x00f5, B:40:0x0109, B:42:0x011e), top: B:21:0x00b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011e A[Catch: all -> 0x00d3, TryCatch #0 {all -> 0x00d3, blocks: (B:22:0x00b4, B:24:0x00bb, B:26:0x00bf, B:28:0x00c3, B:30:0x00c7, B:32:0x00cb, B:43:0x0132, B:34:0x00d6, B:36:0x00e1, B:38:0x00f5, B:40:0x0109, B:42:0x011e), top: B:21:0x00b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.s0
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a0(int r11, @m80.k com.baicizhan.app.api.service.GameCategoryVo r12, @m80.k j00.c<? super yz.g2> r13) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.b.a0(int, com.baicizhan.app.api.service.GameCategoryVo, j00.c):java.lang.Object");
    }

    @Override // k3.s0
    @m80.k
    public Map<String, String> d0() {
        return this.f72151n.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00aa A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:22:0x00a3, B:24:0x00aa, B:26:0x00ae, B:28:0x00b2, B:30:0x00b6, B:32:0x00ba, B:43:0x0121, B:34:0x00c5, B:36:0x00d0, B:38:0x00e4, B:40:0x00f8, B:42:0x010d), top: B:21:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010d A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:22:0x00a3, B:24:0x00aa, B:26:0x00ae, B:28:0x00b2, B:30:0x00b6, B:32:0x00ba, B:43:0x0121, B:34:0x00c5, B:36:0x00d0, B:38:0x00e4, B:40:0x00f8, B:42:0x010d), top: B:21:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.s0
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e1(@m80.k j00.c<? super yz.g2> r12) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.b.e1(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b0 A[Catch: all -> 0x00c8, TryCatch #2 {all -> 0x00c8, blocks: (B:22:0x00a9, B:24:0x00b0, B:26:0x00b4, B:28:0x00b8, B:30:0x00bc, B:32:0x00c0, B:43:0x0127, B:34:0x00cb, B:36:0x00d6, B:38:0x00ea, B:40:0x00fe, B:42:0x0113), top: B:21:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0113 A[Catch: all -> 0x00c8, TryCatch #2 {all -> 0x00c8, blocks: (B:22:0x00a9, B:24:0x00b0, B:26:0x00b4, B:28:0x00b8, B:30:0x00bc, B:32:0x00c0, B:43:0x0127, B:34:0x00cb, B:36:0x00d6, B:38:0x00ea, B:40:0x00fe, B:42:0x0113), top: B:21:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.s0
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i0(@m80.k j00.c<? super java.util.Map<java.lang.String, java.lang.String>> r12) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.b.i0(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc A[Catch: all -> 0x00d4, TryCatch #0 {all -> 0x00d4, blocks: (B:22:0x00b5, B:24:0x00bc, B:26:0x00c0, B:28:0x00c4, B:30:0x00c8, B:32:0x00cc, B:43:0x0133, B:34:0x00d7, B:36:0x00e2, B:38:0x00f6, B:40:0x010a, B:42:0x011f), top: B:21:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011f A[Catch: all -> 0x00d4, TryCatch #0 {all -> 0x00d4, blocks: (B:22:0x00b5, B:24:0x00bc, B:26:0x00c0, B:28:0x00c4, B:30:0x00c8, B:32:0x00cc, B:43:0x0133, B:34:0x00d7, B:36:0x00e2, B:38:0x00f6, B:40:0x010a, B:42:0x011f), top: B:21:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.s0
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n2(@m80.k com.baicizhan.app.api.service.GameCategoryVo r11, @m80.k j00.c<? super l3.n> r12) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.b.n2(com.baicizhan.app.api.service.GameCategoryVo, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b6 A[Catch: all -> 0x00ce, TryCatch #2 {all -> 0x00ce, blocks: (B:22:0x00af, B:24:0x00b6, B:26:0x00ba, B:28:0x00be, B:30:0x00c2, B:32:0x00c6, B:43:0x012d, B:34:0x00d1, B:36:0x00dc, B:38:0x00f0, B:40:0x0104, B:42:0x0119), top: B:21:0x00af }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0119 A[Catch: all -> 0x00ce, TryCatch #2 {all -> 0x00ce, blocks: (B:22:0x00af, B:24:0x00b6, B:26:0x00ba, B:28:0x00be, B:30:0x00c2, B:32:0x00c6, B:43:0x012d, B:34:0x00d1, B:36:0x00dc, B:38:0x00f0, B:40:0x0104, B:42:0x0119), top: B:21:0x00af }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.s0
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object o2(@m80.k java.util.Map<java.lang.String, java.lang.String> r11, @m80.k j00.c<? super yz.g2> r12) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.b.o2(java.util.Map, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4 A[Catch: all -> 0x00cc, TryCatch #2 {all -> 0x00cc, blocks: (B:22:0x00ad, B:24:0x00b4, B:26:0x00b8, B:28:0x00bc, B:30:0x00c0, B:32:0x00c4, B:43:0x012b, B:34:0x00cf, B:36:0x00da, B:38:0x00ee, B:40:0x0102, B:42:0x0117), top: B:21:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0117 A[Catch: all -> 0x00cc, TryCatch #2 {all -> 0x00cc, blocks: (B:22:0x00ad, B:24:0x00b4, B:26:0x00b8, B:28:0x00bc, B:30:0x00c0, B:32:0x00c4, B:43:0x012b, B:34:0x00cf, B:36:0x00da, B:38:0x00ee, B:40:0x0102, B:42:0x0117), top: B:21:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.s0
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object r0(int r11, @m80.k j00.c<? super com.baicizhan.app.api.service.model.BookLanguageType> r12) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.b.r0(int, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b0 A[Catch: all -> 0x00c8, TryCatch #2 {all -> 0x00c8, blocks: (B:22:0x00a9, B:24:0x00b0, B:26:0x00b4, B:28:0x00b8, B:30:0x00bc, B:32:0x00c0, B:43:0x0127, B:34:0x00cb, B:36:0x00d6, B:38:0x00ea, B:40:0x00fe, B:42:0x0113), top: B:21:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0113 A[Catch: all -> 0x00c8, TryCatch #2 {all -> 0x00c8, blocks: (B:22:0x00a9, B:24:0x00b0, B:26:0x00b4, B:28:0x00b8, B:30:0x00bc, B:32:0x00c0, B:43:0x0127, B:34:0x00cb, B:36:0x00d6, B:38:0x00ea, B:40:0x00fe, B:42:0x0113), top: B:21:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.s0
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object s0(@m80.k j00.c<? super l3.b> r12) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.b.s0(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b0 A[Catch: all -> 0x00c8, TryCatch #2 {all -> 0x00c8, blocks: (B:22:0x00a9, B:24:0x00b0, B:26:0x00b4, B:28:0x00b8, B:30:0x00bc, B:32:0x00c0, B:43:0x0127, B:34:0x00cb, B:36:0x00d6, B:38:0x00ea, B:40:0x00fe, B:42:0x0113), top: B:21:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0113 A[Catch: all -> 0x00c8, TryCatch #2 {all -> 0x00c8, blocks: (B:22:0x00a9, B:24:0x00b0, B:26:0x00b4, B:28:0x00b8, B:30:0x00bc, B:32:0x00c0, B:43:0x0127, B:34:0x00cb, B:36:0x00d6, B:38:0x00ea, B:40:0x00fe, B:42:0x0113), top: B:21:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.s0
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object s2(@m80.k j00.c<? super com.baicizhan.app.api.service.GameType> r12) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.b.s2(j00.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c0 A[Catch: all -> 0x00af, TryCatch #2 {all -> 0x00af, blocks: (B:14:0x0074, B:23:0x00b9, B:25:0x00c0, B:27:0x00c4, B:29:0x00c8, B:31:0x00cc, B:33:0x00d0, B:44:0x0134, B:35:0x00d8, B:37:0x00e3, B:39:0x00f7, B:41:0x010b, B:43:0x0120), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0120 A[Catch: all -> 0x00af, TryCatch #2 {all -> 0x00af, blocks: (B:14:0x0074, B:23:0x00b9, B:25:0x00c0, B:27:0x00c4, B:29:0x00c8, B:31:0x00cc, B:33:0x00d0, B:44:0x0134, B:35:0x00d8, B:37:0x00e3, B:39:0x00f7, B:41:0x010b, B:43:0x0120), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, long] */
    @Override // k3.s0
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object u1(int r11, @m80.k j00.c<? super java.lang.Integer> r12) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.b.u1(int, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2 A[Catch: all -> 0x00ca, TryCatch #2 {all -> 0x00ca, blocks: (B:22:0x00ab, B:24:0x00b2, B:26:0x00b6, B:28:0x00ba, B:30:0x00be, B:32:0x00c2, B:43:0x0129, B:34:0x00cd, B:36:0x00d8, B:38:0x00ec, B:40:0x0100, B:42:0x0115), top: B:21:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0115 A[Catch: all -> 0x00ca, TryCatch #2 {all -> 0x00ca, blocks: (B:22:0x00ab, B:24:0x00b2, B:26:0x00b6, B:28:0x00ba, B:30:0x00be, B:32:0x00c2, B:43:0x0129, B:34:0x00cd, B:36:0x00d8, B:38:0x00ec, B:40:0x0100, B:42:0x0115), top: B:21:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.s0
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object z(int r11, @m80.k j00.c<? super yz.g2> r12) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.b.z(int, j00.c):java.lang.Object");
    }
}
