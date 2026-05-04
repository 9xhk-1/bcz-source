package io.ktor.server.plugins.calllogging;

import h10.r;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import x00.q;
import yz.g2;
import zx.d0;
import zx.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nMDCHook.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MDCHook.kt\nio/ktor/server/plugins/calllogging/MDCHookKt\n+ 2 Attributes.kt\nio/ktor/util/AttributesKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,39:1\n18#2:40\n58#3,16:41\n*S KotlinDebug\n*F\n+ 1 MDCHook.kt\nio/ktor/server/plugins/calllogging/MDCHookKt\n*L\n38#1:40\n38#1:41,16\n*E\n"})
/* loaded from: classes8.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final xy.a<g2> f61541a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements d0<q<? super zx.b, ? super x00.l<? super j00.c<? super g2>, ? extends Object>, ? super j00.c<? super g2>, ? extends Object>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ io.ktor.util.pipeline.h f61542a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.server.plugins.calllogging.MDCHookKt$MDCHook$1$install$1", f = "MDCHook.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
        @u0({"SMAP\nMDCHook.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MDCHook.kt\nio/ktor/server/plugins/calllogging/MDCHookKt$MDCHook$1$install$1\n+ 2 ApplicationCallPipeline.kt\nio/ktor/server/application/ApplicationCallPipelineKt\n*L\n1#1,39:1\n79#2:40\n*S KotlinDebug\n*F\n+ 1 MDCHook.kt\nio/ktor/server/plugins/calllogging/MDCHookKt$MDCHook$1$install$1\n*L\n21#1:40\n*E\n"})
        /* renamed from: io.ktor.server.plugins.calllogging.l$a$a, reason: collision with other inner class name */
        public static final class C0712a extends SuspendLambda implements q<io.ktor.util.pipeline.d<g2, k0>, g2, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f61543a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f61544b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ q<zx.b, x00.l<? super j00.c<? super g2>, ? extends Object>, j00.c<? super g2>, Object> f61545c;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: io.ktor.server.plugins.calllogging.l$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C0713a extends FunctionReferenceImpl implements x00.l<j00.c<? super g2>, Object>, l00.l {
                public C0713a(Object obj) {
                    super(1, obj, io.ktor.util.pipeline.d.class, "proceed", "proceed(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                }

                @Override // x00.l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(j00.c<? super g2> cVar) {
                    return ((io.ktor.util.pipeline.d) this.receiver).h(cVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0712a(q<? super zx.b, ? super x00.l<? super j00.c<? super g2>, ? extends Object>, ? super j00.c<? super g2>, ? extends Object> qVar, j00.c<? super C0712a> cVar) {
                super(3, cVar);
                this.f61545c = qVar;
            }

            @Override // x00.q
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(io.ktor.util.pipeline.d<g2, k0> dVar, g2 g2Var, j00.c<? super g2> cVar) {
                C0712a c0712a = new C0712a(this.f61545c, cVar);
                c0712a.f61544b = dVar;
                return c0712a.invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f61543a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    io.ktor.util.pipeline.d dVar = (io.ktor.util.pipeline.d) this.f61544b;
                    q<zx.b, x00.l<? super j00.c<? super g2>, ? extends Object>, j00.c<? super g2>, Object> qVar = this.f61545c;
                    k0 k0Var = (k0) dVar.d();
                    C0713a c0713a = new C0713a(dVar);
                    this.f61543a = 1;
                    if (qVar.invoke(k0Var, c0713a, this) == l11) {
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

        public a(io.ktor.util.pipeline.h hVar) {
            this.f61542a = hVar;
        }

        @Override // zx.d0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(zx.c pipeline, q<? super zx.b, ? super x00.l<? super j00.c<? super g2>, ? extends Object>, ? super j00.c<? super g2>, ? extends Object> handler) {
            g0.p(pipeline, "pipeline");
            g0.p(handler, "handler");
            io.ktor.util.pipeline.h hVar = new io.ktor.util.pipeline.h(this.f61542a.a() + "MDC");
            pipeline.A(this.f61542a, hVar);
            pipeline.C(hVar, new C0712a(handler, null));
        }
    }

    static {
        r rVar;
        h10.d d11 = o0.d(g2.class);
        try {
            rVar = o0.B(g2.class);
        } catch (Throwable unused) {
            rVar = null;
        }
        f61541a = new xy.a<>("ResponseSentTriggered", new gz.a(d11, rVar));
    }

    @m80.k
    public static final d0<q<zx.b, x00.l<? super j00.c<? super g2>, ? extends Object>, j00.c<? super g2>, Object>> a(@m80.k io.ktor.util.pipeline.h phase) {
        g0.p(phase, "phase");
        return new a(phase);
    }
}
