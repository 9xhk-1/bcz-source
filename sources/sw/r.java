package sw;

import cx.y;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class r implements sw.a<x00.q<? super y, ? super mx.v, ? super j00.c<? super g2>, ? extends Object>> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final r f88981a = new r();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.api.SendingRequest$install$1", f = "CommonHooks.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements x00.q<io.ktor.util.pipeline.d<Object, y>, Object, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f88982a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f88983b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.q<y, mx.v, j00.c<? super g2>, Object> f88984c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(x00.q<? super y, ? super mx.v, ? super j00.c<? super g2>, ? extends Object> qVar, j00.c<? super a> cVar) {
            super(3, cVar);
            this.f88984c = qVar;
        }

        @Override // x00.q
        public final Object invoke(io.ktor.util.pipeline.d<Object, y> dVar, Object obj, j00.c<? super g2> cVar) {
            a aVar = new a(this.f88984c, cVar);
            aVar.f88983b = dVar;
            return aVar.invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f88982a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                io.ktor.util.pipeline.d dVar = (io.ktor.util.pipeline.d) this.f88983b;
                x00.q<y, mx.v, j00.c<? super g2>, Object> qVar = this.f88984c;
                Object d11 = dVar.d();
                Object e11 = dVar.e();
                g0.n(e11, "null cannot be cast to non-null type io.ktor.http.content.OutgoingContent");
                this.f88982a = 1;
                if (qVar.invoke(d11, (mx.v) e11, this) == l11) {
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
    public void a(@m80.k lw.c client, @m80.k x00.q<? super y, ? super mx.v, ? super j00.c<? super g2>, ? extends Object> handler) {
        g0.p(client, "client");
        g0.p(handler, "handler");
        client.v0().C(cx.g0.f46880h.e(), new a(handler, null));
    }
}
