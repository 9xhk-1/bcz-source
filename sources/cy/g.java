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
public final class g implements d0<p<? super zx.b, ? super io.ktor.utils.io.g, ? extends io.ktor.utils.io.g>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final g f46965a = new g();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.application.hooks.ReceiveRequestBytes$install$1", f = "CommonHooks.kt", i = {}, l = {133}, m = "invokeSuspend", n = {}, s = {})
    @u0({"SMAP\nCommonHooks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonHooks.kt\nio/ktor/server/application/hooks/ReceiveRequestBytes$install$1\n+ 2 ApplicationCallPipeline.kt\nio/ktor/server/application/ApplicationCallPipelineKt\n*L\n1#1,159:1\n79#2:160\n*S KotlinDebug\n*F\n+ 1 CommonHooks.kt\nio/ktor/server/application/hooks/ReceiveRequestBytes$install$1\n*L\n132#1:160\n*E\n"})
    public static final class a extends SuspendLambda implements q<io.ktor.util.pipeline.d<Object, k0>, Object, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f46966a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f46967b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f46968c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p<zx.b, io.ktor.utils.io.g, io.ktor.utils.io.g> f46969d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(p<? super zx.b, ? super io.ktor.utils.io.g, ? extends io.ktor.utils.io.g> pVar, j00.c<? super a> cVar) {
            super(3, cVar);
            this.f46969d = pVar;
        }

        @Override // x00.q
        public final Object invoke(io.ktor.util.pipeline.d<Object, k0> dVar, Object obj, j00.c<? super g2> cVar) {
            a aVar = new a(this.f46969d, cVar);
            aVar.f46967b = dVar;
            aVar.f46968c = obj;
            return aVar.invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f46966a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                io.ktor.util.pipeline.d dVar = (io.ktor.util.pipeline.d) this.f46967b;
                Object obj2 = this.f46968c;
                if (!(obj2 instanceof io.ktor.utils.io.g)) {
                    return g2.f100423a;
                }
                io.ktor.utils.io.g gVar = (io.ktor.utils.io.g) this.f46969d.invoke((k0) dVar.d(), obj2);
                this.f46967b = null;
                this.f46966a = 1;
                if (dVar.i(gVar, this) == l11) {
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
    public void a(@k zx.c pipeline, @k p<? super zx.b, ? super io.ktor.utils.io.g, ? extends io.ktor.utils.io.g> handler) {
        g0.p(pipeline, "pipeline");
        g0.p(handler, "handler");
        pipeline.g0().C(py.c.f81324h.b(), new a(handler, null));
    }
}
