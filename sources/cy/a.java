package cy;

import io.ktor.utils.io.b0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import qy.m;
import x00.q;
import yz.g2;
import zx.d0;
import zx.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@b0
/* loaded from: classes8.dex */
public final class a<T> implements d0<q<? super zx.b, ? super T, ? super j00.c<? super Object>, ? extends Object>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h10.d<T> f46941a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.application.hooks.BeforeResponseTransform$install$1", f = "CommonHooks.kt", i = {}, l = {154}, m = "invokeSuspend", n = {}, s = {})
    @u0({"SMAP\nCommonHooks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonHooks.kt\nio/ktor/server/application/hooks/BeforeResponseTransform$install$1\n+ 2 ApplicationCallPipeline.kt\nio/ktor/server/application/ApplicationCallPipelineKt\n*L\n1#1,159:1\n79#2:160\n*S KotlinDebug\n*F\n+ 1 CommonHooks.kt\nio/ktor/server/application/hooks/BeforeResponseTransform$install$1\n*L\n154#1:160\n*E\n"})
    /* renamed from: cy.a$a, reason: collision with other inner class name */
    public static final class C0541a extends SuspendLambda implements q<io.ktor.util.pipeline.d<Object, k0>, Object, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f46942a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f46943b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f46944c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a<T> f46945d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ q<zx.b, T, j00.c<Object>, Object> f46946e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0541a(a<T> aVar, q<? super zx.b, ? super T, ? super j00.c<Object>, ? extends Object> qVar, j00.c<? super C0541a> cVar) {
            super(3, cVar);
            this.f46945d = aVar;
            this.f46946e = qVar;
        }

        @Override // x00.q
        public final Object invoke(io.ktor.util.pipeline.d<Object, k0> dVar, Object obj, j00.c<? super g2> cVar) {
            C0541a c0541a = new C0541a(this.f46945d, this.f46946e, cVar);
            c0541a.f46943b = dVar;
            c0541a.f46944c = obj;
            return c0541a.invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            io.ktor.util.pipeline.d dVar;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f46942a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                io.ktor.util.pipeline.d dVar2 = (io.ktor.util.pipeline.d) this.f46943b;
                Object obj2 = this.f46944c;
                if (gz.b.f(obj2, this.f46945d.f46941a)) {
                    q<zx.b, T, j00.c<Object>, Object> qVar = this.f46946e;
                    k0 k0Var = (k0) dVar2.d();
                    g0.n(obj2, "null cannot be cast to non-null type T of io.ktor.server.application.hooks.BeforeResponseTransform");
                    this.f46943b = dVar2;
                    this.f46942a = 1;
                    Object invoke = qVar.invoke(k0Var, obj2, this);
                    if (invoke == l11) {
                        return l11;
                    }
                    dVar = dVar2;
                    obj = invoke;
                }
                return g2.f100423a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = (io.ktor.util.pipeline.d) this.f46943b;
            kotlin.e.n(obj);
            dVar.l(obj);
            return g2.f100423a;
        }
    }

    public a(@k h10.d<T> clazz) {
        g0.p(clazz, "clazz");
        this.f46941a = clazz;
    }

    @Override // zx.d0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(@k zx.c pipeline, @k q<? super zx.b, ? super T, ? super j00.c<Object>, ? extends Object> handler) {
        g0.p(pipeline, "pipeline");
        g0.p(handler, "handler");
        io.ktor.util.pipeline.h hVar = new io.ktor.util.pipeline.h("BeforeTransform");
        pipeline.j0().A(m.f82742h.g(), hVar);
        pipeline.j0().C(hVar, new C0541a(this, handler, null));
    }
}
