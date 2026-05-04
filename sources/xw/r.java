package xw;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class r implements sw.a<x00.q<? super a, ? super ex.c, ? super j00.c<? super g2>, ? extends Object>> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final r f98468a = new r();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final io.ktor.util.pipeline.d<ex.c, g2> f98469a;

        public a(@m80.k io.ktor.util.pipeline.d<ex.c, g2> context) {
            g0.p(context, "context");
            this.f98469a = context;
        }

        @m80.l
        public final Object a(@m80.k j00.c<? super ex.c> cVar) {
            return this.f98469a.h(cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.logging.ResponseHook$install$1", f = "Logging.kt", i = {}, l = {265}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements x00.q<io.ktor.util.pipeline.d<ex.c, g2>, ex.c, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f98470a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f98471b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.q<a, ex.c, j00.c<? super g2>, Object> f98472c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(x00.q<? super a, ? super ex.c, ? super j00.c<? super g2>, ? extends Object> qVar, j00.c<? super b> cVar) {
            super(3, cVar);
            this.f98472c = qVar;
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.util.pipeline.d<ex.c, g2> dVar, ex.c cVar, j00.c<? super g2> cVar2) {
            b bVar = new b(this.f98472c, cVar2);
            bVar.f98471b = dVar;
            return bVar.invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f98470a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                io.ktor.util.pipeline.d dVar = (io.ktor.util.pipeline.d) this.f98471b;
                x00.q<a, ex.c, j00.c<? super g2>, Object> qVar = this.f98472c;
                a aVar = new a(dVar);
                Object e11 = dVar.e();
                this.f98470a = 1;
                if (qVar.invoke(aVar, e11, this) == l11) {
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
    public void a(@m80.k lw.c client, @m80.k x00.q<? super a, ? super ex.c, ? super j00.c<? super g2>, ? extends Object> handler) {
        g0.p(client, "client");
        g0.p(handler, "handler");
        client.c0().C(ex.b.f50181h.c(), new b(handler, null));
    }
}
