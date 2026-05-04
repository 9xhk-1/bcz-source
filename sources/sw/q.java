package sw;

import c40.r0;
import cx.y;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import rw.a1;
import rw.m1;
import rw.z;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class q implements sw.a<x00.q<? super a, ? super y, ? super j00.c<? super mw.a>, ? extends Object>> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final q f88973a = new q();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements r0 {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final m1 f88974a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final kotlin.coroutines.d f88975b;

        public a(@m80.k m1 httpSendSender, @m80.k kotlin.coroutines.d coroutineContext) {
            g0.p(httpSendSender, "httpSendSender");
            g0.p(coroutineContext, "coroutineContext");
            this.f88974a = httpSendSender;
            this.f88975b = coroutineContext;
        }

        @m80.l
        public final Object a(@m80.k y yVar, @m80.k j00.c<? super mw.a> cVar) {
            return this.f88974a.a(yVar, cVar);
        }

        @Override // c40.r0
        @m80.k
        public kotlin.coroutines.d getCoroutineContext() {
            return this.f88975b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.api.Send$install$1", f = "CommonHooks.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements x00.q<m1, y, j00.c<? super mw.a>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f88976a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f88977b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f88978c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x00.q<a, y, j00.c<? super mw.a>, Object> f88979d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ lw.c f88980e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(x00.q<? super a, ? super y, ? super j00.c<? super mw.a>, ? extends Object> qVar, lw.c cVar, j00.c<? super b> cVar2) {
            super(3, cVar2);
            this.f88979d = qVar;
            this.f88980e = cVar;
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(m1 m1Var, y yVar, j00.c<? super mw.a> cVar) {
            b bVar = new b(this.f88979d, this.f88980e, cVar);
            bVar.f88977b = m1Var;
            bVar.f88978c = yVar;
            return bVar.invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f88976a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            m1 m1Var = (m1) this.f88977b;
            y yVar = (y) this.f88978c;
            x00.q<a, y, j00.c<? super mw.a>, Object> qVar = this.f88979d;
            a aVar = new a(m1Var, this.f88980e.getCoroutineContext());
            this.f88977b = null;
            this.f88976a = 1;
            Object invoke = qVar.invoke(aVar, yVar, this);
            return invoke == l11 ? l11 : invoke;
        }
    }

    @Override // sw.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@m80.k lw.c client, @m80.k x00.q<? super a, ? super y, ? super j00.c<? super mw.a>, ? extends Object> handler) {
        g0.p(client, "client");
        g0.p(handler, "handler");
        ((a1) z.b(client, a1.f84565c)).d(new b(handler, client, null));
    }
}
