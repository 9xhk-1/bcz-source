package com.baicizhan.main.unity;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import c4.j;
import c40.h1;
import c40.r0;
import c40.s0;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.util.BczJson;
import com.baicizhan.main.unity.UnityBridgeService;
import com.baicizhan.main.unity.data.Response;
import dd.h;
import ei.a;
import java.util.ArrayList;
import java.util.List;
import k3.e1;
import k3.f1;
import k3.u;
import k3.x2;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import q9.x;
import rj.e;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nUnityBridgeService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnityBridgeService.kt\ncom/baicizhan/main/unity/UnityBridgeService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Handler.kt\ncom/baicizhan/main/unity/bridge/HandlerKt\n+ 4 BizSdk.kt\ncom/baicizhan/app/biz/BizSdk\n+ 5 SdkContext.kt\ncom/baicizhan/app/biz/context/SdkContextKt\n+ 6 Koin.kt\norg/koin/core/Koin\n+ 7 Scope.kt\norg/koin/core/scope/Scope\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n1869#2,2:166\n1869#2,2:168\n15#3,5:170\n20#3,2:182\n15#3,5:184\n20#3,2:196\n10#4:175\n10#4:189\n43#5:176\n43#5:190\n124#6,4:177\n124#6,4:191\n142#7:181\n142#7:195\n1#8:198\n*S KotlinDebug\n*F\n+ 1 UnityBridgeService.kt\ncom/baicizhan/main/unity/UnityBridgeService\n*L\n108#1:166,2\n122#1:168,2\n144#1:170,5\n144#1:182,2\n75#1:184,5\n75#1:196,2\n144#1:175\n75#1:189\n144#1:176\n75#1:190\n144#1:177,4\n75#1:191,4\n144#1:181\n75#1:195\n*E\n"})
/* loaded from: classes4.dex */
public final class UnityBridgeService extends Service {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f25053f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f25054g = 8;

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final String f25055h = "UnityBridgeService";

    /* renamed from: d, reason: collision with root package name */
    @l
    public di.d f25059d;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<ei.b> f25056a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final r0 f25057b = s0.a(h1.e());

    /* renamed from: c, reason: collision with root package name */
    @k
    public final b f25058c = new b();

    /* renamed from: e, reason: collision with root package name */
    @k
    public final e f25060e = new e() { // from class: bi.b
        @Override // rj.e
        public final void a(ij.e eVar) {
            UnityBridgeService.i(UnityBridgeService.this, eVar);
        }
    };

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends a.b {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.unity.UnityBridgeService$binder$1$sendMessageToNative$1", f = "UnityBridgeService.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        @u0({"SMAP\nUnityBridgeService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnityBridgeService.kt\ncom/baicizhan/main/unity/UnityBridgeService$binder$1$sendMessageToNative$1\n+ 2 Handler.kt\ncom/baicizhan/main/unity/bridge/HandlerKt\n+ 3 BizSdk.kt\ncom/baicizhan/app/biz/BizSdk\n+ 4 SdkContext.kt\ncom/baicizhan/app/biz/context/SdkContextKt\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,165:1\n15#2,5:166\n20#2,2:178\n10#3:171\n43#4:172\n124#5,4:173\n142#6:177\n*S KotlinDebug\n*F\n+ 1 UnityBridgeService.kt\ncom/baicizhan/main/unity/UnityBridgeService$binder$1$sendMessageToNative$1\n*L\n49#1:166,5\n49#1:178,2\n49#1:171\n49#1:172\n49#1:173,4\n49#1:177\n*E\n"})
        public static final class a extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f25062a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UnityBridgeService f25063b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f25064c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(UnityBridgeService unityBridgeService, String str, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f25063b = unityBridgeService;
                this.f25064c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new a(this.f25063b, this.f25064c, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                x2 x2Var;
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f25062a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    UnityBridgeService unityBridgeService = this.f25063b;
                    String simpleName = f1.class.getSimpleName();
                    if (ci.b.b().containsKey(simpleName)) {
                        x2 x2Var2 = ci.b.b().get(simpleName);
                        if (x2Var2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.baicizhan.app.api.service.IUnityService");
                        }
                        x2Var = (f1) x2Var2;
                    } else {
                        h.g(unityBridgeService);
                        x2Var = (x2) j.f7801a.a().P().h().i(o0.d(f1.class), null, null);
                        ci.b.b().put(simpleName, x2Var);
                    }
                    f1 f1Var = (f1) x2Var;
                    String str = this.f25064c;
                    if (str == null) {
                        return g2.f100423a;
                    }
                    this.f25062a = 1;
                    obj = f1Var.A0(str, this);
                    if (obj == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                u uVar = (u) obj;
                qb.c.b(UnityBridgeService.f25055h, "msg pre handled " + uVar, new Object[0]);
                if (uVar.e()) {
                    String f11 = uVar.f();
                    if (f11 != null) {
                        this.f25063b.f(f11, BczJson.toJson(new Response(true)));
                    }
                } else {
                    UnityBridgeService.g(this.f25063b, this.f25064c, null, 2, null);
                }
                return g2.f100423a;
            }
        }

        public b() {
        }

        @Override // ei.a
        public void C(ei.b bVar) {
            if (bVar != null) {
                UnityBridgeService.this.f25056a.add(bVar);
            }
        }

        @Override // ei.a
        public void F(ei.b bVar) {
            if (bVar != null) {
                UnityBridgeService.this.f25056a.remove(bVar);
            }
        }

        @Override // ei.a
        public void c(int i11) {
            qb.c.b(UnityBridgeService.f25055h, "bridge intent " + i11, new Object[0]);
            if (i11 == 1) {
                LocalBroadcastManager.getInstance(UnityBridgeService.this).sendBroadcast(new Intent(ci.e.f8680b));
            }
        }

        @Override // ei.a
        public void i0(String str) {
            qb.c.i(UnityBridgeService.f25055h, "msg from Unity " + str, new Object[0]);
            c40.k.f(UnityBridgeService.this.f25057b, null, null, new a(UnityBridgeService.this, str, null), 3, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.unity.UnityBridgeService$handleCallFrame$1", f = "UnityBridgeService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class c extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f25065a;

        public c(j00.c<? super c> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return UnityBridgeService.this.new c(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f25065a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            UnityBridgeService.g(UnityBridgeService.this, ci.a.f8673a, null, 2, null);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.unity.UnityBridgeService$handleCallFrame$2", f = "UnityBridgeService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class d extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f25067a;

        public d(j00.c<? super d> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return UnityBridgeService.this.new d(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f25067a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            UnityBridgeService.g(UnityBridgeService.this, ci.a.f8674b, null, 2, null);
            return g2.f100423a;
        }
    }

    public static /* synthetic */ void g(UnityBridgeService unityBridgeService, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        unityBridgeService.f(str, str2);
    }

    public static final void i(UnityBridgeService unityBridgeService, ij.e controller) {
        x2 x2Var;
        g0.p(controller, "controller");
        String simpleName = e1.class.getSimpleName();
        if (ci.b.b().containsKey(simpleName)) {
            x2 x2Var2 = ci.b.b().get(simpleName);
            if (x2Var2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.baicizhan.app.api.service.IPluginService");
            }
            x2Var = (e1) x2Var2;
        } else {
            h.g(unityBridgeService);
            x2Var = (x2) j.f7801a.a().P().h().i(o0.d(e1.class), null, null);
            ci.b.b().put(simpleName, x2Var);
        }
        di.d dVar = new di.d(controller);
        unityBridgeService.f25059d = dVar;
        ((e1) x2Var).x(dVar);
    }

    public final void e(CallFrame callFrame) {
        String method = callFrame.getMethod();
        int hashCode = method.hashCode();
        if (hashCode != -1146198183) {
            if (hashCode != -523076026) {
                if (hashCode == 2088098390 && method.equals("GetCurrentToken")) {
                    String frameId = callFrame.getFrameId();
                    UserRecord p11 = x.r().p();
                    h("{\"FrameId\":\"" + frameId + "\", \"RespType\":\"Call\", \"Payload\":\"" + (p11 != null ? p11.getToken() : null) + "\"}");
                    return;
                }
            } else if (method.equals(ci.a.f8673a)) {
                c40.k.f(this.f25057b, null, null, new c(null), 3, null);
                return;
            }
        } else if (method.equals(ci.a.f8674b)) {
            h("{\"FrameId\":\"" + callFrame.getFrameId() + "\", \"RespType\":\"Call\", \"Payload\": null}");
            c40.k.f(this.f25057b, null, null, new d(null), 3, null);
            return;
        }
        qb.c.i(f25055h, "unknown method " + callFrame.getMethod(), new Object[0]);
    }

    public final void f(String str, String str2) {
        Object m6308constructorimpl;
        ArrayList arrayList = new ArrayList();
        for (ei.b bVar : this.f25056a) {
            try {
                Result.a aVar = Result.Companion;
                bVar.S(str, str2);
                m6308constructorimpl = Result.m6308constructorimpl(g2.f100423a);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
            }
            if (Result.m6311exceptionOrNullimpl(m6308constructorimpl) != null) {
                arrayList.add(bVar);
                qb.c.i(f25055h, "call failed", new Object[0]);
            }
        }
        qb.c.i(f25055h, "remove list size " + arrayList.size(), new Object[0]);
        this.f25056a.removeAll(arrayList);
    }

    public final void h(String str) {
        Object m6308constructorimpl;
        ArrayList arrayList = new ArrayList();
        for (ei.b bVar : this.f25056a) {
            try {
                Result.a aVar = Result.Companion;
                bVar.D(str);
                m6308constructorimpl = Result.m6308constructorimpl(g2.f100423a);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
            }
            if (Result.m6311exceptionOrNullimpl(m6308constructorimpl) != null) {
                arrayList.add(bVar);
                qb.c.i(f25055h, "call failed", new Object[0]);
            }
        }
        qb.c.i(f25055h, "remove list size " + arrayList.size(), new Object[0]);
        this.f25056a.removeAll(arrayList);
    }

    @Override // android.app.Service
    @k
    public IBinder onBind(@l Intent intent) {
        return this.f25058c;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        qb.c.i(f25055h, "onCreate", new Object[0]);
        hj.p.d(this, this.f25060e);
    }

    @Override // android.app.Service
    public void onDestroy() {
        x2 x2Var;
        super.onDestroy();
        qb.c.i(f25055h, "onDestroy", new Object[0]);
        hj.p.l(this, this.f25060e);
        String simpleName = e1.class.getSimpleName();
        if (ci.b.b().containsKey(simpleName)) {
            x2 x2Var2 = ci.b.b().get(simpleName);
            if (x2Var2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.baicizhan.app.api.service.IPluginService");
            }
            x2Var = (e1) x2Var2;
        } else {
            h.g(this);
            x2Var = (x2) j.f7801a.a().P().h().i(o0.d(e1.class), null, null);
            ci.b.b().put(simpleName, x2Var);
        }
        e1 e1Var = (e1) x2Var;
        di.d dVar = this.f25059d;
        if (dVar == null) {
            return;
        }
        e1Var.A(dVar);
    }

    @Override // android.app.Service
    public int onStartCommand(@l Intent intent, int i11, int i12) {
        qb.c.i(f25055h, "onStartCommand", new Object[0]);
        return super.onStartCommand(intent, i11, i12);
    }
}
