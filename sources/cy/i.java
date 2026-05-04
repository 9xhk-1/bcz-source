package cy;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import qy.m;
import x00.l;
import x00.q;
import yz.g2;
import zx.d0;
import zx.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class i implements d0<l<? super zx.b, ? extends g2>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final i f46975a = new i();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.application.hooks.ResponseSent$install$1", f = "CommonHooks.kt", i = {0}, l = {116}, m = "invokeSuspend", n = {"$this$intercept"}, s = {"L$0"})
    @u0({"SMAP\nCommonHooks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonHooks.kt\nio/ktor/server/application/hooks/ResponseSent$install$1\n+ 2 ApplicationCallPipeline.kt\nio/ktor/server/application/ApplicationCallPipelineKt\n*L\n1#1,159:1\n79#2:160\n*S KotlinDebug\n*F\n+ 1 CommonHooks.kt\nio/ktor/server/application/hooks/ResponseSent$install$1\n*L\n117#1:160\n*E\n"})
    public static final class a extends SuspendLambda implements q<io.ktor.util.pipeline.d<Object, k0>, Object, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f46976a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f46977b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l<zx.b, g2> f46978c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super zx.b, g2> lVar, j00.c<? super a> cVar) {
            super(3, cVar);
            this.f46978c = lVar;
        }

        @Override // x00.q
        public final Object invoke(io.ktor.util.pipeline.d<Object, k0> dVar, Object obj, j00.c<? super g2> cVar) {
            a aVar = new a(this.f46978c, cVar);
            aVar.f46977b = dVar;
            return aVar.invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            io.ktor.util.pipeline.d dVar;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f46976a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                io.ktor.util.pipeline.d dVar2 = (io.ktor.util.pipeline.d) this.f46977b;
                this.f46977b = dVar2;
                this.f46976a = 1;
                if (dVar2.h(this) == l11) {
                    return l11;
                }
                dVar = dVar2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dVar = (io.ktor.util.pipeline.d) this.f46977b;
                kotlin.e.n(obj);
            }
            this.f46978c.invoke((k0) dVar.d());
            return g2.f100423a;
        }
    }

    @Override // zx.d0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@k zx.c pipeline, @k l<? super zx.b, g2> handler) {
        g0.p(pipeline, "pipeline");
        g0.p(handler, "handler");
        pipeline.j0().C(m.f82742h.d(), new a(handler, null));
    }
}
