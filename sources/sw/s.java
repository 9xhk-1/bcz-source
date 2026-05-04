package sw;

import cx.e0;
import cx.y;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class s implements sw.a<x00.p<? super y, ? super j00.c<? super g2>, ? extends Object>> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final s f88985a = new s();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.api.SetupRequest$install$1", f = "CommonHooks.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements x00.q<io.ktor.util.pipeline.d<Object, y>, Object, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f88986a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f88987b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.p<y, j00.c<? super g2>, Object> f88988c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(x00.p<? super y, ? super j00.c<? super g2>, ? extends Object> pVar, j00.c<? super a> cVar) {
            super(3, cVar);
            this.f88988c = pVar;
        }

        @Override // x00.q
        public final Object invoke(io.ktor.util.pipeline.d<Object, y> dVar, Object obj, j00.c<? super g2> cVar) {
            a aVar = new a(this.f88988c, cVar);
            aVar.f88987b = dVar;
            return aVar.invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f88986a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                io.ktor.util.pipeline.d dVar = (io.ktor.util.pipeline.d) this.f88987b;
                x00.p<y, j00.c<? super g2>, Object> pVar = this.f88988c;
                Object d11 = dVar.d();
                this.f88986a = 1;
                if (pVar.invoke(d11, this) == l11) {
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
    public void a(@m80.k lw.c client, @m80.k x00.p<? super y, ? super j00.c<? super g2>, ? extends Object> handler) {
        g0.p(client, "client");
        g0.p(handler, "handler");
        client.m0().C(e0.f46866h.a(), new a(handler, null));
    }
}
