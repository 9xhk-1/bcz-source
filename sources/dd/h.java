package dd;

import android.app.Application;
import android.content.Context;
import c40.r0;
import com.baicizhan.app.api.AppType;
import com.baicizhan.app.api.LogLevel;
import com.baicizhan.main.BaicizhanApp;
import com.baicizhan.main.home.experiment.q0;
import k3.x2;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = h.f47825a)
@u0({"SMAP\nAppUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppUtils.kt\ncom/baicizhan/main/Bcz\n+ 2 BizSdk.kt\ncom/baicizhan/app/biz/BizSdk\n+ 3 SdkContext.kt\ncom/baicizhan/app/biz/context/SdkContextKt\n+ 4 Koin.kt\norg/koin/core/Koin\n+ 5 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,82:1\n10#2:83\n43#3:84\n124#4,4:85\n142#5:89\n*S KotlinDebug\n*F\n+ 1 AppUtils.kt\ncom/baicizhan/main/Bcz\n*L\n58#1:83\n58#1:84\n58#1:85,4\n58#1:89\n*E\n"})
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String f47825a = "Bcz";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.Bcz$bizLogin$1$1", f = "AppUtils.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f47826a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f47827b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f47828c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f47829d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f47830e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, String str, long j11, boolean z11, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f47827b = context;
            this.f47828c = str;
            this.f47829d = j11;
            this.f47830e = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new a(this.f47827b, this.f47828c, this.f47829d, this.f47830e, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f47826a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                qb.c.b(h.f47825a, "auth...", new Object[0]);
                k3.j e11 = h.e(this.f47827b);
                String str = this.f47828c;
                long j11 = this.f47829d;
                boolean z11 = this.f47830e;
                this.f47826a = 1;
                if (e11.G1(str, j11, z11, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            qb.c.b(h.f47825a, "authed", new Object[0]);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.Bcz$bizLogout$1", f = "AppUtils.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f47831a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f47832b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f47832b = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new b(this.f47832b, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f47831a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                k3.j e11 = h.e(this.f47832b);
                this.f47831a = 1;
                if (e11.s1(this) == l11) {
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
    public static final class c implements i3.b {
        @Override // i3.b
        public void a(String msg) {
            g0.p(msg, "msg");
            qb.c.i("sdk", msg, new Object[0]);
        }

        @Override // i3.b
        public void d(String msg) {
            g0.p(msg, "msg");
            qb.c.b("sdk", msg, new Object[0]);
        }

        @Override // i3.b
        public void e(String msg) {
            g0.p(msg, "msg");
            qb.c.d("sdk", msg, new Object[0]);
        }
    }

    public static final void c(@m80.k Context context, @m80.k String token, long j11, boolean z11) {
        Object m6308constructorimpl;
        g0.p(context, "<this>");
        g0.p(token, "token");
        qb.c.b(f47825a, "bizLogin in", new Object[0]);
        try {
            Result.a aVar = Result.Companion;
            c40.j.b(null, new a(context, token, j11, z11, null), 1, null);
            m6308constructorimpl = Result.m6308constructorimpl(g2.f100423a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
        }
        Throwable m6311exceptionOrNullimpl = Result.m6311exceptionOrNullimpl(m6308constructorimpl);
        if (m6311exceptionOrNullimpl != null) {
            qb.c.c(f47825a, "bizLogin error occurred: ", m6311exceptionOrNullimpl);
        }
        qb.c.b(f47825a, "bizLogin out", new Object[0]);
    }

    public static final void d(@m80.k Context context) {
        g0.p(context, "<this>");
        if (q0.f21394a.b()) {
            c40.j.b(null, new b(context, null), 1, null);
        }
    }

    public static final k3.j e(Context context) {
        g(context);
        return (k3.j) ((x2) c4.j.f7801a.a().P().h().i(o0.d(k3.j.class), null, null));
    }

    public static final n3.e f(Application application) {
        if (!(application instanceof BaicizhanApp)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        n3.e j11 = ((BaicizhanApp) application).j();
        g0.o(j11, "getBizSdk(...)");
        return j11;
    }

    @m80.k
    public static final n3.e g(@m80.k Context context) {
        g0.p(context, "<this>");
        Context applicationContext = context.getApplicationContext();
        g0.n(applicationContext, "null cannot be cast to non-null type android.app.Application");
        return f((Application) applicationContext);
    }

    public static final void h(@m80.k final BaicizhanApp baicizhanApp) {
        g0.p(baicizhanApp, "<this>");
        baicizhanApp.n(n3.h.e(new x00.l() { // from class: dd.g
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 i11;
                i11 = h.i(BaicizhanApp.this, (n3.a) obj);
                return i11;
            }
        }));
    }

    public static final g2 i(BaicizhanApp baicizhanApp, n3.a bizSdk) {
        g0.p(bizSdk, "$this$bizSdk");
        bizSdk.n(baicizhanApp);
        bizSdk.i(true);
        bizSdk.h(AppType.BCZ);
        bizSdk.j(LogLevel.Debug);
        bizSdk.k(new c());
        return g2.f100423a;
    }
}
