package oy;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import x00.q;
import x00.r;
import yz.g2;
import zx.d0;
import zx.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a implements d0<r<? super C0964a, ? super zx.b, ? super Object, ? super j00.c<? super g2>, ? extends Object>> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a f78485a = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBodyTransformedHook.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BodyTransformedHook.kt\nio/ktor/server/plugins/partialcontent/BodyTransformedHook$Context\n+ 2 ApplicationCallPipeline.kt\nio/ktor/server/application/ApplicationCallPipelineKt\n*L\n1#1,48:1\n79#2:49\n*S KotlinDebug\n*F\n+ 1 BodyTransformedHook.kt\nio/ktor/server/plugins/partialcontent/BodyTransformedHook$Context\n*L\n16#1:49\n*E\n"})
    /* renamed from: oy.a$a, reason: collision with other inner class name */
    public static final class C0964a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final io.ktor.util.pipeline.d<Object, k0> f78486a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final zx.b f78487b;

        public C0964a(@m80.k io.ktor.util.pipeline.d<Object, k0> context) {
            g0.p(context, "context");
            this.f78486a = context;
            this.f78487b = context.d();
        }

        @m80.k
        public final zx.b a() {
            return this.f78487b;
        }

        public final void b(@m80.k Object newValue) {
            g0.p(newValue, "newValue");
            this.f78486a.l(newValue);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.plugins.partialcontent.BodyTransformedHook$install$1", f = "BodyTransformedHook.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
    @u0({"SMAP\nBodyTransformedHook.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BodyTransformedHook.kt\nio/ktor/server/plugins/partialcontent/BodyTransformedHook$install$1\n+ 2 ApplicationCallPipeline.kt\nio/ktor/server/application/ApplicationCallPipelineKt\n*L\n1#1,48:1\n79#2:49\n*S KotlinDebug\n*F\n+ 1 BodyTransformedHook.kt\nio/ktor/server/plugins/partialcontent/BodyTransformedHook$install$1\n*L\n30#1:49\n*E\n"})
    public static final class b extends SuspendLambda implements q<io.ktor.util.pipeline.d<Object, k0>, Object, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f78488a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f78489b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f78490c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ r<C0964a, zx.b, Object, j00.c<? super g2>, Object> f78491d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(r<? super C0964a, ? super zx.b, Object, ? super j00.c<? super g2>, ? extends Object> rVar, j00.c<? super b> cVar) {
            super(3, cVar);
            this.f78491d = rVar;
        }

        @Override // x00.q
        public final Object invoke(io.ktor.util.pipeline.d<Object, k0> dVar, Object obj, j00.c<? super g2> cVar) {
            b bVar = new b(this.f78491d, cVar);
            bVar.f78489b = dVar;
            bVar.f78490c = obj;
            return bVar.invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f78488a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                io.ktor.util.pipeline.d dVar = (io.ktor.util.pipeline.d) this.f78489b;
                Object obj2 = this.f78490c;
                r<C0964a, zx.b, Object, j00.c<? super g2>, Object> rVar = this.f78491d;
                C0964a c0964a = new C0964a(dVar);
                k0 k0Var = (k0) dVar.d();
                this.f78489b = null;
                this.f78488a = 1;
                if (rVar.invoke(c0964a, k0Var, obj2, this) == l11) {
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
    public void a(@m80.k zx.c pipeline, @m80.k r<? super C0964a, ? super zx.b, Object, ? super j00.c<? super g2>, ? extends Object> handler) {
        g0.p(pipeline, "pipeline");
        g0.p(handler, "handler");
        io.ktor.util.pipeline.h hVar = new io.ktor.util.pipeline.h("PartialContent");
        pipeline.j0().z(qy.m.f82742h.c(), hVar);
        pipeline.j0().C(hVar, new b(handler, null));
    }
}
