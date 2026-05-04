package cy;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import mx.v;
import qy.m;
import x00.q;
import x00.r;
import yz.g2;
import zx.d0;
import zx.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h implements d0<r<? super a, ? super zx.b, ? super v, ? super j00.c<? super g2>, ? extends Object>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final h f46970a = new h();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final io.ktor.util.pipeline.d<Object, k0> f46971a;

        public a(@k io.ktor.util.pipeline.d<Object, k0> context) {
            g0.p(context, "context");
            this.f46971a = context;
        }

        public final void a(@k v body) {
            g0.p(body, "body");
            this.f46971a.l(body);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.application.hooks.ResponseBodyReadyForSend$install$1", f = "CommonHooks.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
    @u0({"SMAP\nCommonHooks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonHooks.kt\nio/ktor/server/application/hooks/ResponseBodyReadyForSend$install$1\n+ 2 ApplicationCallPipeline.kt\nio/ktor/server/application/ApplicationCallPipelineKt\n*L\n1#1,159:1\n79#2:160\n*S KotlinDebug\n*F\n+ 1 CommonHooks.kt\nio/ktor/server/application/hooks/ResponseBodyReadyForSend$install$1\n*L\n104#1:160\n*E\n"})
    public static final class b extends SuspendLambda implements q<io.ktor.util.pipeline.d<Object, k0>, Object, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f46972a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f46973b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r<a, zx.b, v, j00.c<? super g2>, Object> f46974c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(r<? super a, ? super zx.b, ? super v, ? super j00.c<? super g2>, ? extends Object> rVar, j00.c<? super b> cVar) {
            super(3, cVar);
            this.f46974c = rVar;
        }

        @Override // x00.q
        public final Object invoke(io.ktor.util.pipeline.d<Object, k0> dVar, Object obj, j00.c<? super g2> cVar) {
            b bVar = new b(this.f46974c, cVar);
            bVar.f46973b = dVar;
            return bVar.invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f46972a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                io.ktor.util.pipeline.d dVar = (io.ktor.util.pipeline.d) this.f46973b;
                r<a, zx.b, v, j00.c<? super g2>, Object> rVar = this.f46974c;
                a aVar = new a(dVar);
                k0 k0Var = (k0) dVar.d();
                Object e11 = dVar.e();
                g0.n(e11, "null cannot be cast to non-null type io.ktor.http.content.OutgoingContent");
                this.f46972a = 1;
                if (rVar.invoke(aVar, k0Var, (v) e11, this) == l11) {
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

    @Override // zx.d0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@k zx.c pipeline, @k r<? super a, ? super zx.b, ? super v, ? super j00.c<? super g2>, ? extends Object> handler) {
        g0.p(pipeline, "pipeline");
        g0.p(handler, "handler");
        pipeline.j0().C(m.f82742h.a(), new b(handler, null));
    }
}
