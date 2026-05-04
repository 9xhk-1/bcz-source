package cy;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.p;
import x00.q;
import yz.g2;
import zx.d0;
import zx.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c implements d0<p<? super zx.b, ? super j00.c<? super g2>, ? extends Object>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final c f46955a = new c();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.application.hooks.CallSetup$install$1", f = "CommonHooks.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {})
    @u0({"SMAP\nCommonHooks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonHooks.kt\nio/ktor/server/application/hooks/CallSetup$install$1\n+ 2 ApplicationCallPipeline.kt\nio/ktor/server/application/ApplicationCallPipelineKt\n*L\n1#1,159:1\n79#2:160\n*S KotlinDebug\n*F\n+ 1 CommonHooks.kt\nio/ktor/server/application/hooks/CallSetup$install$1\n*L\n26#1:160\n*E\n"})
    public static final class a extends SuspendLambda implements q<io.ktor.util.pipeline.d<g2, k0>, g2, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f46956a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f46957b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p<zx.b, j00.c<? super g2>, Object> f46958c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(p<? super zx.b, ? super j00.c<? super g2>, ? extends Object> pVar, j00.c<? super a> cVar) {
            super(3, cVar);
            this.f46958c = pVar;
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.util.pipeline.d<g2, k0> dVar, g2 g2Var, j00.c<? super g2> cVar) {
            a aVar = new a(this.f46958c, cVar);
            aVar.f46957b = dVar;
            return aVar.invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f46956a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                io.ktor.util.pipeline.d dVar = (io.ktor.util.pipeline.d) this.f46957b;
                p<zx.b, j00.c<? super g2>, Object> pVar = this.f46958c;
                k0 k0Var = (k0) dVar.d();
                this.f46956a = 1;
                if (pVar.invoke(k0Var, this) == l11) {
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
    public void a(@k zx.c pipeline, @k p<? super zx.b, ? super j00.c<? super g2>, ? extends Object> handler) {
        g0.p(pipeline, "pipeline");
        g0.p(handler, "handler");
        pipeline.C(zx.c.f103019k.g(), new a(handler, null));
    }
}
