package yw;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a implements sw.a<q<? super C1372a, ? super ex.c, ? super j00.c<? super g2>, ? extends Object>> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a f100334a = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: yw.a$a, reason: collision with other inner class name */
    public static final class C1372a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final io.ktor.util.pipeline.d<ex.c, g2> f100335a;

        public C1372a(@m80.k io.ktor.util.pipeline.d<ex.c, g2> context) {
            g0.p(context, "context");
            this.f100335a = context;
        }

        @m80.l
        public final Object a(@m80.k ex.c cVar, @m80.k j00.c<? super ex.c> cVar2) {
            return this.f100335a.i(cVar, cVar2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.observer.AfterReceiveHook$install$1", f = "ResponseObserver.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements q<io.ktor.util.pipeline.d<ex.c, g2>, ex.c, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f100336a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f100337b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q<C1372a, ex.c, j00.c<? super g2>, Object> f100338c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(q<? super C1372a, ? super ex.c, ? super j00.c<? super g2>, ? extends Object> qVar, j00.c<? super b> cVar) {
            super(3, cVar);
            this.f100338c = qVar;
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.util.pipeline.d<ex.c, g2> dVar, ex.c cVar, j00.c<? super g2> cVar2) {
            b bVar = new b(this.f100338c, cVar2);
            bVar.f100337b = dVar;
            return bVar.invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f100336a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                io.ktor.util.pipeline.d dVar = (io.ktor.util.pipeline.d) this.f100337b;
                q<C1372a, ex.c, j00.c<? super g2>, Object> qVar = this.f100338c;
                C1372a c1372a = new C1372a(dVar);
                Object e11 = dVar.e();
                this.f100336a = 1;
                if (qVar.invoke(c1372a, e11, this) == l11) {
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
    public void a(@m80.k lw.c client, @m80.k q<? super C1372a, ? super ex.c, ? super j00.c<? super g2>, ? extends Object> handler) {
        g0.p(client, "client");
        g0.p(handler, "handler");
        client.c0().C(ex.b.f50181h.a(), new b(handler, null));
    }
}
