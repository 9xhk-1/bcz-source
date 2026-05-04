package c6;

import c40.r0;
import c40.x2;
import com.baicizhan.app.biz.game.repo.userresource.LanguageType;
import com.jiongji.andriod.card.R;
import h5.x0;
import h5.y;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e0;
import kotlinx.coroutines.flow.x;
import oa0.r;
import org.junit.jupiter.api.j2;
import p8.i1;
import p8.u;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {c6.b.class})
/* loaded from: classes3.dex */
public final class c implements c6.b {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.preferences.a f8031a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.auth.r f8032b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final k50.a f8033c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final x<Boolean> f8034d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.userresource.UserGameInfoRepoImpl", f = "UserGameInfoRepo.kt", i = {0}, l = {81}, m = "getEnergy", n = {"languageType"}, s = {"L$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f8035a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f8036b;

        /* renamed from: d, reason: collision with root package name */
        public int f8038d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f8036b = obj;
            this.f8038d |= Integer.MIN_VALUE;
            return c.this.k(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.userresource.UserGameInfoRepoImpl$getEnergyModel$2", f = "UserGameInfoRepo.kt", i = {}, l = {250}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @u0({"SMAP\nUserGameInfoRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserGameInfoRepo.kt\ncom/baicizhan/app/biz/game/repo/userresource/UserGameInfoRepoImpl$getEnergyModel$2\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,288:1\n147#2:289\n*S KotlinDebug\n*F\n+ 1 UserGameInfoRepo.kt\ncom/baicizhan/app/biz/game/repo/userresource/UserGameInfoRepoImpl$getEnergyModel$2\n*L\n251#1:289\n*E\n"})
    public static final class b extends SuspendLambda implements p<r0, j00.c<? super h5.g>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f8039a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ LanguageType f8041c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(LanguageType languageType, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f8041c = languageType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return c.this.new b(this.f8041c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super h5.g> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String c11;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f8039a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                com.baicizhan.app.preferences.g z11 = c.this.z();
                c11 = c6.d.c(this.f8041c);
                this.f8039a = 1;
                obj = z11.j(c11, "", this);
                if (obj == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            k50.a aVar = c.this.f8033c;
            aVar.getSerializersModule();
            return (h5.g) aVar.c(h5.g.Companion.serializer(), (String) obj);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.userresource.UserGameInfoRepoImpl$getUserProfile$2", f = "UserGameInfoRepo.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @u0({"SMAP\nUserGameInfoRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserGameInfoRepo.kt\ncom/baicizhan/app/biz/game/repo/userresource/UserGameInfoRepoImpl$getUserProfile$2\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,288:1\n147#2:289\n*S KotlinDebug\n*F\n+ 1 UserGameInfoRepo.kt\ncom/baicizhan/app/biz/game/repo/userresource/UserGameInfoRepoImpl$getUserProfile$2\n*L\n87#1:289\n*E\n"})
    /* renamed from: c6.c$c, reason: collision with other inner class name */
    public static final class C0132c extends SuspendLambda implements p<r0, j00.c<? super x0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f8042a;

        public C0132c(j00.c<? super C0132c> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return c.this.new C0132c(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super x0> cVar) {
            return ((C0132c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f8042a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                com.baicizhan.app.preferences.g z11 = c.this.z();
                this.f8042a = 1;
                obj = z11.j(c6.d.f8121m, "", this);
                if (obj == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            k50.a aVar = c.this.f8033c;
            aVar.getSerializersModule();
            return (x0) aVar.c(x0.Companion.serializer(), (String) obj);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.userresource.UserGameInfoRepoImpl$getVip$2", f = "UserGameInfoRepo.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @u0({"SMAP\nUserGameInfoRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserGameInfoRepo.kt\ncom/baicizhan/app/biz/game/repo/userresource/UserGameInfoRepoImpl$getVip$2\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,288:1\n147#2:289\n*S KotlinDebug\n*F\n+ 1 UserGameInfoRepo.kt\ncom/baicizhan/app/biz/game/repo/userresource/UserGameInfoRepoImpl$getVip$2\n*L\n95#1:289\n*E\n"})
    public static final class d extends SuspendLambda implements p<r0, j00.c<? super y>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f8044a;

        public d(j00.c<? super d> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return c.this.new d(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super y> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f8044a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                com.baicizhan.app.preferences.g z11 = c.this.z();
                this.f8044a = 1;
                obj = z11.j(c6.d.f8120l, "", this);
                if (obj == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            k50.a aVar = c.this.f8033c;
            aVar.getSerializersModule();
            return (y) aVar.c(y.Companion.serializer(), (String) obj);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.userresource.UserGameInfoRepoImpl", f = "UserGameInfoRepo.kt", i = {0, 1}, l = {129, 131}, m = "setCurSkuId", n = {"skuId", "skuId"}, s = {"I$0", "I$0"}, v = 1)
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f8046a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f8047b;

        /* renamed from: d, reason: collision with root package name */
        public int f8049d;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f8047b = obj;
            this.f8049d |= Integer.MIN_VALUE;
            return c.this.o(0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.userresource.UserGameInfoRepoImpl", f = "UserGameInfoRepo.kt", i = {0, 1}, l = {110, 112}, m = "setCurrentBookId", n = {"bookId", "bookId"}, s = {"J$0", "J$0"}, v = 1)
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f8050a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f8051b;

        /* renamed from: d, reason: collision with root package name */
        public int f8053d;

        public f(j00.c<? super f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f8051b = obj;
            this.f8053d |= Integer.MIN_VALUE;
            return c.this.g(0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.userresource.UserGameInfoRepoImpl", f = "UserGameInfoRepo.kt", i = {0, 1}, l = {139, 140}, m = "setRemoteSkuId", n = {"skuId", "skuId"}, s = {"I$0", "I$0"}, v = 1)
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f8054a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f8055b;

        /* renamed from: d, reason: collision with root package name */
        public int f8057d;

        public g(j00.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f8055b = obj;
            this.f8057d |= Integer.MIN_VALUE;
            return c.this.l(0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.userresource.UserGameInfoRepoImpl$updateEnergy$2", f = "UserGameInfoRepo.kt", i = {0, 0}, l = {210}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u240", "$i$a$-apply-UserGameInfoRepoImpl$updateEnergy$2$1"}, s = {"L$1", "I$0"}, v = 1)
    public static final class h extends SuspendLambda implements p<r0, j00.c<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f8058a;

        /* renamed from: b, reason: collision with root package name */
        public Object f8059b;

        /* renamed from: c, reason: collision with root package name */
        public int f8060c;

        /* renamed from: d, reason: collision with root package name */
        public int f8061d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ LanguageType f8063f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ i1 f8064g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(LanguageType languageType, i1 i1Var, j00.c<? super h> cVar) {
            super(2, cVar);
            this.f8063f = languageType;
            this.f8064g = i1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return c.this.new h(this.f8063f, this.f8064g, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super Boolean> cVar) {
            return ((h) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String c11;
            int d11;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f8061d;
            if (i11 == 0) {
                kotlin.e.n(obj);
                com.baicizhan.app.preferences.g z11 = c.this.z();
                LanguageType languageType = this.f8063f;
                c cVar = c.this;
                i1 i1Var = this.f8064g;
                c11 = c6.d.c(languageType);
                k50.a aVar = cVar.f8033c;
                f50.i<h5.g> serializer = h5.g.Companion.serializer();
                d11 = c6.d.d(languageType);
                String a11 = aVar.a(serializer, c6.a.a(i1Var, d11));
                this.f8058a = z11;
                this.f8059b = l00.k.a(z11);
                this.f8060c = 0;
                this.f8061d = 1;
                if (z11.k(c11, a11, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return l00.a.a(c.this.f8034d.d(l00.a.a(true)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.userresource.UserGameInfoRepoImpl", f = "UserGameInfoRepo.kt", i = {0, 0, 1, 1}, l = {148, 165}, m = "updateEnergyBalance", n = {"languageType", "energyBalance", "languageType", "energyBalance"}, s = {"L$0", "I$0", "L$0", "I$0"}, v = 1)
    public static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f8065a;

        /* renamed from: b, reason: collision with root package name */
        public int f8066b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f8067c;

        /* renamed from: e, reason: collision with root package name */
        public int f8069e;

        public i(j00.c<? super i> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f8067c = obj;
            this.f8069e |= Integer.MIN_VALUE;
            return c.this.q(null, 0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.userresource.UserGameInfoRepoImpl$updateEnergyBalance$2", f = "UserGameInfoRepo.kt", i = {1, 1, 1, 1, 1}, l = {149, 152}, m = "invokeSuspend", n = {"model", "limitEnergy", "$this$invokeSuspend_u24lambda_u240_u240", "$i$a$-also-UserGameInfoRepoImpl$updateEnergyBalance$2$1", "$i$a$-apply-UserGameInfoRepoImpl$updateEnergyBalance$2$1$1"}, s = {"L$0", "L$2", "L$4", "I$0", "I$1"}, v = 1)
    public static final class j extends SuspendLambda implements p<r0, j00.c<? super h5.x>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f8070a;

        /* renamed from: b, reason: collision with root package name */
        public Object f8071b;

        /* renamed from: c, reason: collision with root package name */
        public Object f8072c;

        /* renamed from: d, reason: collision with root package name */
        public Object f8073d;

        /* renamed from: e, reason: collision with root package name */
        public Object f8074e;

        /* renamed from: f, reason: collision with root package name */
        public int f8075f;

        /* renamed from: g, reason: collision with root package name */
        public int f8076g;

        /* renamed from: h, reason: collision with root package name */
        public int f8077h;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ LanguageType f8079j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ int f8080k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(LanguageType languageType, int i11, j00.c<? super j> cVar) {
            super(2, cVar);
            this.f8079j = languageType;
            this.f8080k = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return c.this.new j(this.f8079j, this.f8080k, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super h5.x> cVar) {
            return ((j) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object y11;
            String c11;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f8077h;
            if (i11 == 0) {
                kotlin.e.n(obj);
                c cVar = c.this;
                LanguageType languageType = this.f8079j;
                this.f8077h = 1;
                y11 = cVar.y(languageType, this);
                if (y11 == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h5.x xVar = (h5.x) this.f8071b;
                    kotlin.e.n(obj);
                    return xVar;
                }
                kotlin.e.n(obj);
                y11 = obj;
            }
            h5.g gVar = (h5.g) y11;
            h5.x h11 = gVar.h();
            if (h11 == null) {
                return null;
            }
            c cVar2 = c.this;
            LanguageType languageType2 = this.f8079j;
            int i12 = this.f8080k;
            com.baicizhan.app.preferences.g z11 = cVar2.z();
            c11 = c6.d.c(languageType2);
            String a11 = cVar2.f8033c.a(h5.g.Companion.serializer(), h5.g.e(gVar, 0, h5.x.g(h11, i12, 0L, 0L, 0, 0L, 30, null), null, 5, null));
            this.f8070a = l00.k.a(gVar);
            this.f8071b = h11;
            this.f8072c = l00.k.a(h11);
            this.f8073d = z11;
            this.f8074e = l00.k.a(z11);
            this.f8075f = 0;
            this.f8076g = 0;
            this.f8077h = 2;
            return z11.k(c11, a11, this) == l11 ? l11 : h11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.userresource.UserGameInfoRepoImpl", f = "UserGameInfoRepo.kt", i = {0, 0, 0}, l = {178}, m = "updateMemberShip", n = {"model", "$this$updateMemberShip_u24lambda_u240", "$i$a$-apply-UserGameInfoRepoImpl$updateMemberShip$2"}, s = {"L$0", "L$2", "I$0"}, v = 1)
    public static final class k extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f8081a;

        /* renamed from: b, reason: collision with root package name */
        public Object f8082b;

        /* renamed from: c, reason: collision with root package name */
        public Object f8083c;

        /* renamed from: d, reason: collision with root package name */
        public int f8084d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f8085e;

        /* renamed from: g, reason: collision with root package name */
        public int f8087g;

        public k(j00.c<? super k> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f8085e = obj;
            this.f8087g |= Integer.MIN_VALUE;
            return c.this.e(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.userresource.UserGameInfoRepoImpl", f = "UserGameInfoRepo.kt", i = {0}, l = {171}, m = "updateUserDataInfo", n = {"userData"}, s = {"L$0"}, v = 1)
    public static final class l extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f8088a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f8089b;

        /* renamed from: d, reason: collision with root package name */
        public int f8091d;

        public l(j00.c<? super l> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f8089b = obj;
            this.f8091d |= Integer.MIN_VALUE;
            return c.this.j(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.userresource.UserGameInfoRepoImpl", f = "UserGameInfoRepo.kt", i = {0, 0, 0, 1, 1, 1}, l = {R.styleable.Theme_drawable_tab_mall_1111, R.styleable.Theme_drawable_tab_mall_new}, m = "updateUserDataInfoImpl", n = {"userData", "$this$updateUserDataInfoImpl_u24lambda_u240", "$i$a$-apply-UserGameInfoRepoImpl$updateUserDataInfoImpl$2", "userData", "$this$updateUserDataInfoImpl_u24lambda_u240", "$i$a$-apply-UserGameInfoRepoImpl$updateUserDataInfoImpl$2"}, s = {"L$0", "L$2", "I$0", "L$0", "L$2", "I$0"}, v = 1)
    public static final class m extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f8092a;

        /* renamed from: b, reason: collision with root package name */
        public Object f8093b;

        /* renamed from: c, reason: collision with root package name */
        public Object f8094c;

        /* renamed from: d, reason: collision with root package name */
        public int f8095d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f8096e;

        /* renamed from: g, reason: collision with root package name */
        public int f8098g;

        public m(j00.c<? super m> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f8096e = obj;
            this.f8098g |= Integer.MIN_VALUE;
            return c.this.A(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.userresource.UserGameInfoRepoImpl$updateUserGameInfo$2", f = "UserGameInfoRepo.kt", i = {}, l = {191, 192, 198}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class n extends SuspendLambda implements p<r0, j00.c<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f8099a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ u f8101c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(u uVar, j00.c<? super n> cVar) {
            super(2, cVar);
            this.f8101c = uVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return c.this.new n(this.f8101c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super Boolean> cVar) {
            return ((n) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
        
            if (r8.f(r5, r7) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
        
            if (r8.B(r1, r7) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
        
            if (r8.A(r1, r7) == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r7.f8099a
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L25
                if (r1 == r4) goto L21
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                kotlin.e.n(r8)
                goto L63
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                kotlin.e.n(r8)
                goto L4f
            L21:
                kotlin.e.n(r8)
                goto L37
            L25:
                kotlin.e.n(r8)
                c6.c r8 = c6.c.this
                p8.u r1 = r7.f8101c
                p8.d1 r1 = r1.f80182a
                r7.f8099a = r4
                java.lang.Object r8 = c6.c.w(r8, r1, r7)
                if (r8 != r0) goto L37
                goto L62
            L37:
                c6.c r8 = c6.c.this
                h5.x0 r1 = new h5.x0
                p8.u r5 = r7.f8101c
                p8.v r5 = r5.f80184c
                java.lang.String r6 = r5.f80198a
                java.lang.String r5 = r5.f80199b
                r1.<init>(r6, r5)
                r7.f8099a = r3
                java.lang.Object r8 = c6.c.x(r8, r1, r7)
                if (r8 != r0) goto L4f
                goto L62
            L4f:
                c6.c r8 = c6.c.this
                p8.u r1 = r7.f8101c
                p8.e1 r1 = r1.f80183b
                p8.c1 r1 = r1.f79780a
                int r1 = r1.f79718a
                long r5 = (long) r1
                r7.f8099a = r2
                java.lang.Object r8 = r8.f(r5, r7)
                if (r8 != r0) goto L63
            L62:
                return r0
            L63:
                c6.c r8 = c6.c.this
                kotlinx.coroutines.flow.x r8 = c6.c.v(r8)
                java.lang.Boolean r0 = l00.a.a(r4)
                boolean r8 = r8.d(r0)
                java.lang.Boolean r8 = l00.a.a(r8)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: c6.c.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.userresource.UserGameInfoRepoImpl", f = "UserGameInfoRepo.kt", i = {0, 0, 0}, l = {226}, m = "updateUserProfileInfo", n = {"userProfile", "$this$updateUserProfileInfo_u24lambda_u240", "$i$a$-apply-UserGameInfoRepoImpl$updateUserProfileInfo$2"}, s = {"L$0", "L$2", "I$0"}, v = 1)
    public static final class o extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f8102a;

        /* renamed from: b, reason: collision with root package name */
        public Object f8103b;

        /* renamed from: c, reason: collision with root package name */
        public Object f8104c;

        /* renamed from: d, reason: collision with root package name */
        public int f8105d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f8106e;

        /* renamed from: g, reason: collision with root package name */
        public int f8108g;

        public o(j00.c<? super o> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f8106e = obj;
            this.f8108g |= Integer.MIN_VALUE;
            return c.this.B(null, this);
        }
    }

    public c(@m80.k com.baicizhan.app.preferences.a factory, @m80.k com.baicizhan.app.biz.auth.r tokenProvider, @m80.k k50.a json) {
        g0.p(factory, "factory");
        g0.p(tokenProvider, "tokenProvider");
        g0.p(json, "json");
        this.f8031a = factory;
        this.f8032b = tokenProvider;
        this.f8033c = json;
        x<Boolean> a11 = e0.a(1, 0, BufferOverflow.DROP_OLDEST);
        a11.d(Boolean.TRUE);
        this.f8034d = a11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009f, code lost:
    
        if (r2.k(c6.d.f8120l, r5, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(p8.d1 r9, j00.c<? super yz.g2> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof c6.c.m
            if (r0 == 0) goto L13
            r0 = r10
            c6.c$m r0 = (c6.c.m) r0
            int r1 = r0.f8098g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8098g = r1
            goto L18
        L13:
            c6.c$m r0 = new c6.c$m
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f8096e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f8098g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L54
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r9 = r0.f8094c
            com.baicizhan.app.preferences.g r9 = (com.baicizhan.app.preferences.g) r9
            java.lang.Object r9 = r0.f8093b
            com.baicizhan.app.preferences.g r9 = (com.baicizhan.app.preferences.g) r9
            java.lang.Object r9 = r0.f8092a
            p8.d1 r9 = (p8.d1) r9
            kotlin.e.n(r10)
            goto La2
        L38:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L40:
            int r9 = r0.f8095d
            java.lang.Object r2 = r0.f8094c
            com.baicizhan.app.preferences.g r2 = (com.baicizhan.app.preferences.g) r2
            java.lang.Object r4 = r0.f8093b
            com.baicizhan.app.preferences.g r4 = (com.baicizhan.app.preferences.g) r4
            java.lang.Object r5 = r0.f8092a
            p8.d1 r5 = (p8.d1) r5
            kotlin.e.n(r10)
            r10 = r9
            r9 = r5
            goto L73
        L54:
            kotlin.e.n(r10)
            com.baicizhan.app.preferences.g r2 = r8.z()
            int r10 = r9.f79748c
            long r5 = (long) r10
            r0.f8092a = r9
            r0.f8093b = r2
            r0.f8094c = r2
            r10 = 0
            r0.f8095d = r10
            r0.f8098g = r4
            java.lang.String r4 = "coin"
            java.lang.Object r4 = r2.i(r4, r5, r0)
            if (r4 != r1) goto L72
            goto La1
        L72:
            r4 = r2
        L73:
            k50.a r5 = r8.f8033c
            h5.y$b r6 = h5.y.Companion
            f50.i r6 = r6.serializer()
            f50.b0 r6 = (f50.b0) r6
            p8.g1 r7 = r9.f79746a
            h5.y r7 = c6.a.c(r7)
            java.lang.String r5 = r5.a(r6, r7)
            java.lang.Object r9 = l00.k.a(r9)
            r0.f8092a = r9
            r0.f8093b = r4
            java.lang.Object r9 = l00.k.a(r2)
            r0.f8094c = r9
            r0.f8095d = r10
            r0.f8098g = r3
            java.lang.String r9 = "membership"
            java.lang.Object r9 = r2.k(r9, r5, r0)
            if (r9 != r1) goto La2
        La1:
            return r1
        La2:
            yz.g2 r9 = yz.g2.f100423a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.c.A(p8.d1, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B(h5.x0 r6, j00.c<? super yz.g2> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof c6.c.o
            if (r0 == 0) goto L13
            r0 = r7
            c6.c$o r0 = (c6.c.o) r0
            int r1 = r0.f8108g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8108g = r1
            goto L18
        L13:
            c6.c$o r0 = new c6.c$o
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f8106e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f8108g
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r6 = r0.f8104c
            com.baicizhan.app.preferences.g r6 = (com.baicizhan.app.preferences.g) r6
            java.lang.Object r6 = r0.f8103b
            com.baicizhan.app.preferences.g r6 = (com.baicizhan.app.preferences.g) r6
            java.lang.Object r6 = r0.f8102a
            h5.x0 r6 = (h5.x0) r6
            kotlin.e.n(r7)
            goto L6e
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            kotlin.e.n(r7)
            com.baicizhan.app.preferences.g r7 = r5.z()
            k50.a r2 = r5.f8033c
            h5.x0$b r4 = h5.x0.Companion
            f50.i r4 = r4.serializer()
            f50.b0 r4 = (f50.b0) r4
            java.lang.String r2 = r2.a(r4, r6)
            java.lang.Object r6 = l00.k.a(r6)
            r0.f8102a = r6
            r0.f8103b = r7
            java.lang.Object r6 = l00.k.a(r7)
            r0.f8104c = r6
            r6 = 0
            r0.f8105d = r6
            r0.f8108g = r3
            java.lang.String r6 = "user_profile"
            java.lang.Object r6 = r7.k(r6, r2, r0)
            if (r6 != r1) goto L6e
            return r1
        L6e:
            yz.g2 r6 = yz.g2.f100423a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.c.B(h5.x0, j00.c):java.lang.Object");
    }

    @Override // c6.b
    @m80.l
    public Object a(@m80.k j00.c<? super Integer> cVar) {
        return z().d(c6.d.f8116h, -1, cVar);
    }

    @Override // c6.b
    @m80.l
    public Object b(@m80.k j00.c<? super Integer> cVar) {
        return z().d(c6.d.f8115g, -1, cVar);
    }

    @Override // c6.b
    @m80.l
    public Object c(@m80.k j00.c<? super x0> cVar) {
        return c40.i.h(c4.o.b(), new C0132c(null), cVar);
    }

    @Override // c6.b
    @m80.l
    public Object d(@m80.k j00.c<? super Long> cVar) {
        return z().h("current_book_id", -1L, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // c6.b
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(@m80.k h5.y r11, @m80.k j00.c<? super yz.g2> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof c6.c.k
            if (r0 == 0) goto L13
            r0 = r12
            c6.c$k r0 = (c6.c.k) r0
            int r1 = r0.f8087g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8087g = r1
            goto L18
        L13:
            c6.c$k r0 = new c6.c$k
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f8085e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f8087g
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r11 = r0.f8083c
            com.baicizhan.app.preferences.g r11 = (com.baicizhan.app.preferences.g) r11
            java.lang.Object r11 = r0.f8082b
            com.baicizhan.app.preferences.g r11 = (com.baicizhan.app.preferences.g) r11
            java.lang.Object r11 = r0.f8081a
            h5.y r11 = (h5.y) r11
            kotlin.e.n(r12)
            goto L89
        L35:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3d:
            kotlin.e.n(r12)
            z6.b r4 = z6.b.f101032b
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r2 = "updateMemberShip "
            r12.append(r2)
            r12.append(r11)
            java.lang.String r6 = r12.toString()
            r8 = 4
            r9 = 0
            java.lang.String r5 = "UserGameInfoRepo"
            r7 = 0
            z6.b.j(r4, r5, r6, r7, r8, r9)
            com.baicizhan.app.preferences.g r12 = r10.z()
            k50.a r2 = r10.f8033c
            h5.y$b r4 = h5.y.Companion
            f50.i r4 = r4.serializer()
            f50.b0 r4 = (f50.b0) r4
            java.lang.String r2 = r2.a(r4, r11)
            java.lang.Object r11 = l00.k.a(r11)
            r0.f8081a = r11
            r0.f8082b = r12
            java.lang.Object r11 = l00.k.a(r12)
            r0.f8083c = r11
            r11 = 0
            r0.f8084d = r11
            r0.f8087g = r3
            java.lang.String r11 = "membership"
            java.lang.Object r11 = r12.k(r11, r2, r0)
            if (r11 != r1) goto L89
            return r1
        L89:
            kotlinx.coroutines.flow.x<java.lang.Boolean> r11 = r10.f8034d
            java.lang.Boolean r12 = l00.a.a(r3)
            r11.d(r12)
            yz.g2 r11 = yz.g2.f100423a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.c.e(h5.y, j00.c):java.lang.Object");
    }

    @Override // c6.b
    @m80.l
    public Object f(long j11, @m80.k j00.c<? super g2> cVar) {
        Object i11 = z().i(c6.d.f8114f, j11, cVar);
        return i11 == kotlin.coroutines.intrinsics.b.l() ? i11 : g2.f100423a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
    
        if (r14.emit(r2, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r14.i("current_book_id", r12, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // c6.b
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(long r12, @m80.k j00.c<? super yz.g2> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof c6.c.f
            if (r0 == 0) goto L13
            r0 = r14
            c6.c$f r0 = (c6.c.f) r0
            int r1 = r0.f8053d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8053d = r1
            goto L18
        L13:
            c6.c$f r0 = new c6.c$f
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f8051b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f8053d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r14)
            goto L7a
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            long r12 = r0.f8050a
            kotlin.e.n(r14)
            goto L4e
        L3a:
            kotlin.e.n(r14)
            com.baicizhan.app.preferences.g r14 = r11.z()
            r0.f8050a = r12
            r0.f8053d = r4
            java.lang.String r2 = "current_book_id"
            java.lang.Object r14 = r14.i(r2, r12, r0)
            if (r14 != r1) goto L4e
            goto L79
        L4e:
            z6.b r5 = z6.b.f101032b
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r2 = "curBookId change "
            r14.append(r2)
            r14.append(r12)
            java.lang.String r7 = r14.toString()
            r9 = 4
            r10 = 0
            java.lang.String r6 = "UserGameInfoRepo"
            r8 = 0
            z6.b.j(r5, r6, r7, r8, r9, r10)
            kotlinx.coroutines.flow.x<java.lang.Boolean> r14 = r11.f8034d
            java.lang.Boolean r2 = l00.a.a(r4)
            r0.f8050a = r12
            r0.f8053d = r3
            java.lang.Object r12 = r14.emit(r2, r0)
            if (r12 != r1) goto L7a
        L79:
            return r1
        L7a:
            yz.g2 r12 = yz.g2.f100423a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.c.g(long, j00.c):java.lang.Object");
    }

    @Override // c6.b
    @m80.l
    public Object h(@m80.k j00.c<? super Long> cVar) {
        return z().h(c6.d.f8114f, -1L, cVar);
    }

    @Override // c6.b
    @m80.l
    public Object i(@m80.k LanguageType languageType, @m80.k i1 i1Var, @m80.k j00.c<? super g2> cVar) {
        z6.b.j(z6.b.f101032b, c6.d.f8111c, "updateEnergy: " + languageType + j2.O + i1Var, null, 4, null);
        Object h11 = c40.i.h(x2.f8011a.plus(c4.o.b()), new h(languageType, i1Var, null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // c6.b
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(@m80.k p8.d1 r11, @m80.k j00.c<? super yz.g2> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof c6.c.l
            if (r0 == 0) goto L13
            r0 = r12
            c6.c$l r0 = (c6.c.l) r0
            int r1 = r0.f8091d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8091d = r1
            goto L18
        L13:
            c6.c$l r0 = new c6.c$l
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f8089b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f8091d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r11 = r0.f8088a
            p8.d1 r11 = (p8.d1) r11
            kotlin.e.n(r12)
            goto L62
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            kotlin.e.n(r12)
            z6.b r4 = z6.b.f101032b
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r2 = "updateUserDataInfo "
            r12.append(r2)
            r12.append(r11)
            java.lang.String r6 = r12.toString()
            r8 = 4
            r9 = 0
            java.lang.String r5 = "UserGameInfoRepo"
            r7 = 0
            z6.b.j(r4, r5, r6, r7, r8, r9)
            java.lang.Object r12 = l00.k.a(r11)
            r0.f8088a = r12
            r0.f8091d = r3
            java.lang.Object r11 = r10.A(r11, r0)
            if (r11 != r1) goto L62
            return r1
        L62:
            kotlinx.coroutines.flow.x<java.lang.Boolean> r11 = r10.f8034d
            java.lang.Boolean r12 = l00.a.a(r3)
            r11.d(r12)
            yz.g2 r11 = yz.g2.f100423a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.c.j(p8.d1, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // c6.b
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(@m80.k com.baicizhan.app.biz.game.repo.userresource.LanguageType r5, @m80.k j00.c<? super h5.g> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof c6.c.a
            if (r0 == 0) goto L13
            r0 = r6
            c6.c$a r0 = (c6.c.a) r0
            int r1 = r0.f8038d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8038d = r1
            goto L18
        L13:
            c6.c$a r0 = new c6.c$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f8036b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f8038d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f8035a
            com.baicizhan.app.biz.game.repo.userresource.LanguageType r5 = (com.baicizhan.app.biz.game.repo.userresource.LanguageType) r5
            kotlin.e.n(r6)
            goto L47
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.e.n(r6)
            java.lang.Object r6 = l00.k.a(r5)
            r0.f8035a = r6
            r0.f8038d = r3
            java.lang.Object r6 = r4.y(r5, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            h5.g r6 = (h5.g) r6
            h5.g r5 = c6.a.d(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.c.k(com.baicizhan.app.biz.game.repo.userresource.LanguageType, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (r7.emit(r2, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r7.f(c6.d.f8115g, r6, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // c6.b
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object l(int r6, @m80.k j00.c<? super yz.g2> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof c6.c.g
            if (r0 == 0) goto L13
            r0 = r7
            c6.c$g r0 = (c6.c.g) r0
            int r1 = r0.f8057d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8057d = r1
            goto L18
        L13:
            c6.c$g r0 = new c6.c$g
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f8055b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f8057d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r7)
            goto L5f
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            int r6 = r0.f8054a
            kotlin.e.n(r7)
            goto L4e
        L3a:
            kotlin.e.n(r7)
            com.baicizhan.app.preferences.g r7 = r5.z()
            r0.f8054a = r6
            r0.f8057d = r4
            java.lang.String r2 = "remote_current_sku_id"
            java.lang.Object r7 = r7.f(r2, r6, r0)
            if (r7 != r1) goto L4e
            goto L5e
        L4e:
            kotlinx.coroutines.flow.x<java.lang.Boolean> r7 = r5.f8034d
            java.lang.Boolean r2 = l00.a.a(r4)
            r0.f8054a = r6
            r0.f8057d = r3
            java.lang.Object r6 = r7.emit(r2, r0)
            if (r6 != r1) goto L5f
        L5e:
            return r1
        L5f:
            yz.g2 r6 = yz.g2.f100423a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.c.l(int, j00.c):java.lang.Object");
    }

    @Override // c6.b
    @m80.l
    public Object m(@m80.k u uVar, @m80.k j00.c<? super g2> cVar) {
        z6.b.j(z6.b.f101032b, c6.d.f8111c, "updateUserGameInfo " + uVar, null, 4, null);
        Object h11 = c40.i.h(x2.f8011a.plus(c4.o.b()), new n(uVar, null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }

    @Override // c6.b
    @m80.k
    public kotlinx.coroutines.flow.i<Boolean> n() {
        return this.f8034d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
    
        if (r13.emit(r2, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r13.f(c6.d.f8116h, r12, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // c6.b
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object o(int r12, @m80.k j00.c<? super yz.g2> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof c6.c.e
            if (r0 == 0) goto L13
            r0 = r13
            c6.c$e r0 = (c6.c.e) r0
            int r1 = r0.f8049d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8049d = r1
            goto L18
        L13:
            c6.c$e r0 = new c6.c$e
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f8047b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f8049d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r13)
            goto L7a
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            int r12 = r0.f8046a
            kotlin.e.n(r13)
            goto L4e
        L3a:
            kotlin.e.n(r13)
            com.baicizhan.app.preferences.g r13 = r11.z()
            r0.f8046a = r12
            r0.f8049d = r4
            java.lang.String r2 = "current_sku_id"
            java.lang.Object r13 = r13.f(r2, r12, r0)
            if (r13 != r1) goto L4e
            goto L79
        L4e:
            z6.b r5 = z6.b.f101032b
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r2 = "curSkuId change "
            r13.append(r2)
            r13.append(r12)
            java.lang.String r7 = r13.toString()
            r9 = 4
            r10 = 0
            java.lang.String r6 = "UserGameInfoRepo"
            r8 = 0
            z6.b.j(r5, r6, r7, r8, r9, r10)
            kotlinx.coroutines.flow.x<java.lang.Boolean> r13 = r11.f8034d
            java.lang.Boolean r2 = l00.a.a(r4)
            r0.f8046a = r12
            r0.f8049d = r3
            java.lang.Object r12 = r13.emit(r2, r0)
            if (r12 != r1) goto L7a
        L79:
            return r1
        L7a:
            yz.g2 r12 = yz.g2.f100423a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.c.o(int, j00.c):java.lang.Object");
    }

    @Override // c6.b
    @m80.l
    public Object p(@m80.k j00.c<? super Long> cVar) {
        return z().h(c6.d.f8117i, 0L, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009d, code lost:
    
        if (r14.emit(r2, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0086, code lost:
    
        if (c40.i.h(r14, r2, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // c6.b
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object q(@m80.k com.baicizhan.app.biz.game.repo.userresource.LanguageType r12, int r13, @m80.k j00.c<? super yz.g2> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof c6.c.i
            if (r0 == 0) goto L13
            r0 = r14
            c6.c$i r0 = (c6.c.i) r0
            int r1 = r0.f8069e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8069e = r1
            goto L18
        L13:
            c6.c$i r0 = new c6.c$i
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f8067c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f8069e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r12 = r0.f8065a
            com.baicizhan.app.biz.game.repo.userresource.LanguageType r12 = (com.baicizhan.app.biz.game.repo.userresource.LanguageType) r12
            kotlin.e.n(r14)
            goto La0
        L30:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L38:
            int r13 = r0.f8066b
            java.lang.Object r12 = r0.f8065a
            com.baicizhan.app.biz.game.repo.userresource.LanguageType r12 = (com.baicizhan.app.biz.game.repo.userresource.LanguageType) r12
            kotlin.e.n(r14)
            goto L89
        L42:
            kotlin.e.n(r14)
            z6.b r5 = z6.b.f101032b
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r2 = "updateEnergyBalance: "
            r14.append(r2)
            r14.append(r12)
            java.lang.String r2 = ", "
            r14.append(r2)
            r14.append(r13)
            java.lang.String r7 = r14.toString()
            r9 = 4
            r10 = 0
            java.lang.String r6 = "UserGameInfoRepo"
            r8 = 0
            z6.b.j(r5, r6, r7, r8, r9, r10)
            c40.m0 r14 = c4.o.b()
            c40.x2 r2 = c40.x2.f8011a
            kotlin.coroutines.d r14 = r14.plus(r2)
            c6.c$j r2 = new c6.c$j
            r5 = 0
            r2.<init>(r12, r13, r5)
            java.lang.Object r5 = l00.k.a(r12)
            r0.f8065a = r5
            r0.f8066b = r13
            r0.f8069e = r4
            java.lang.Object r14 = c40.i.h(r14, r2, r0)
            if (r14 != r1) goto L89
            goto L9f
        L89:
            kotlinx.coroutines.flow.x<java.lang.Boolean> r14 = r11.f8034d
            java.lang.Boolean r2 = l00.a.a(r4)
            java.lang.Object r12 = l00.k.a(r12)
            r0.f8065a = r12
            r0.f8066b = r13
            r0.f8069e = r3
            java.lang.Object r12 = r14.emit(r2, r0)
            if (r12 != r1) goto La0
        L9f:
            return r1
        La0:
            yz.g2 r12 = yz.g2.f100423a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.c.q(com.baicizhan.app.biz.game.repo.userresource.LanguageType, int, j00.c):java.lang.Object");
    }

    @Override // c6.b
    @m80.l
    public Object r(@m80.k j00.c<? super y> cVar) {
        return c40.i.h(c4.o.b(), new d(null), cVar);
    }

    public final Object y(LanguageType languageType, j00.c<? super h5.g> cVar) {
        return c40.i.h(c4.o.b(), new b(languageType, null), cVar);
    }

    public final com.baicizhan.app.preferences.g z() {
        com.baicizhan.app.preferences.a aVar = this.f8031a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("user_game_info_scope-");
        Long b11 = this.f8032b.b();
        g0.m(b11);
        sb2.append(b11.longValue());
        return aVar.a(sb2.toString());
    }
}
