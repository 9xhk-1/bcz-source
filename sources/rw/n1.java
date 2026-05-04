package rw;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class n1 implements sw.a<x00.q<? super cx.y, ? super x00.l<? super j00.c<? super g2>, ? extends Object>, ? super j00.c<? super g2>, ? extends Object>> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final n1 f84731a = new n1();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.SetupRequestContext$install$1", f = "HttpRequestLifecycle.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements x00.q<io.ktor.util.pipeline.d<Object, cx.y>, Object, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f84732a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f84733b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.q<cx.y, x00.l<? super j00.c<? super g2>, ? extends Object>, j00.c<? super g2>, Object> f84734c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: rw.n1$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1061a extends AdaptedFunctionReference implements x00.l<j00.c<? super g2>, Object>, l00.l {
            public C1061a(Object obj) {
                super(1, obj, io.ktor.util.pipeline.d.class, "proceed", "proceed(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 8);
            }

            @Override // x00.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(j00.c<? super g2> cVar) {
                return a.j((io.ktor.util.pipeline.d) this.receiver, cVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(x00.q<? super cx.y, ? super x00.l<? super j00.c<? super g2>, ? extends Object>, ? super j00.c<? super g2>, ? extends Object> qVar, j00.c<? super a> cVar) {
            super(3, cVar);
            this.f84734c = qVar;
        }

        public static final /* synthetic */ Object j(io.ktor.util.pipeline.d dVar, j00.c cVar) {
            Object h11 = dVar.h(cVar);
            return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
        }

        @Override // x00.q
        public final Object invoke(io.ktor.util.pipeline.d<Object, cx.y> dVar, Object obj, j00.c<? super g2> cVar) {
            a aVar = new a(this.f84734c, cVar);
            aVar.f84733b = dVar;
            return aVar.invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f84732a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                io.ktor.util.pipeline.d dVar = (io.ktor.util.pipeline.d) this.f84733b;
                x00.q<cx.y, x00.l<? super j00.c<? super g2>, ? extends Object>, j00.c<? super g2>, Object> qVar = this.f84734c;
                Object d11 = dVar.d();
                C1061a c1061a = new C1061a(dVar);
                this.f84732a = 1;
                if (qVar.invoke(d11, c1061a, this) == l11) {
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

    @Override // sw.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@m80.k lw.c client, @m80.k x00.q<? super cx.y, ? super x00.l<? super j00.c<? super g2>, ? extends Object>, ? super j00.c<? super g2>, ? extends Object> handler) {
        kotlin.jvm.internal.g0.p(client, "client");
        kotlin.jvm.internal.g0.p(handler, "handler");
        client.m0().C(cx.e0.f46866h.a(), new a(handler, null));
    }
}
