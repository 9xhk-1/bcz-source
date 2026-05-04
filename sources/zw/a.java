package zw;

import cx.e0;
import cx.y;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a implements sw.a<x00.q<? super y, ? super mx.v, ? super j00.c<? super mx.v>, ? extends Object>> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a f102927a = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.sse.AfterRender$install$1", f = "SSE.kt", i = {}, l = {125, 125}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: zw.a$a, reason: collision with other inner class name */
    public static final class C1401a extends SuspendLambda implements x00.q<io.ktor.util.pipeline.d<Object, y>, Object, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f102928a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f102929b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f102930c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x00.q<y, mx.v, j00.c<? super mx.v>, Object> f102931d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C1401a(x00.q<? super y, ? super mx.v, ? super j00.c<? super mx.v>, ? extends Object> qVar, j00.c<? super C1401a> cVar) {
            super(3, cVar);
            this.f102931d = qVar;
        }

        @Override // x00.q
        public final Object invoke(io.ktor.util.pipeline.d<Object, y> dVar, Object obj, j00.c<? super g2> cVar) {
            C1401a c1401a = new C1401a(this.f102931d, cVar);
            c1401a.f102929b = dVar;
            c1401a.f102930c = obj;
            return c1401a.invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
        
            if (r1.i(r7, r6) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
        
            if (r7 == r0) goto L19;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.f102928a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.e.n(r7)
                goto L50
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.f102929b
                io.ktor.util.pipeline.d r1 = (io.ktor.util.pipeline.d) r1
                kotlin.e.n(r7)
                goto L44
            L22:
                kotlin.e.n(r7)
                java.lang.Object r7 = r6.f102929b
                r1 = r7
                io.ktor.util.pipeline.d r1 = (io.ktor.util.pipeline.d) r1
                java.lang.Object r7 = r6.f102930c
                boolean r4 = r7 instanceof mx.v
                if (r4 != 0) goto L33
                yz.g2 r7 = yz.g2.f100423a
                return r7
            L33:
                x00.q<cx.y, mx.v, j00.c<? super mx.v>, java.lang.Object> r4 = r6.f102931d
                java.lang.Object r5 = r1.d()
                r6.f102929b = r1
                r6.f102928a = r3
                java.lang.Object r7 = r4.invoke(r5, r7, r6)
                if (r7 != r0) goto L44
                goto L4f
            L44:
                r3 = 0
                r6.f102929b = r3
                r6.f102928a = r2
                java.lang.Object r7 = r1.i(r7, r6)
                if (r7 != r0) goto L50
            L4f:
                return r0
            L50:
                yz.g2 r7 = yz.g2.f100423a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: zw.a.C1401a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // sw.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@m80.k lw.c client, @m80.k x00.q<? super y, ? super mx.v, ? super j00.c<? super mx.v>, ? extends Object> handler) {
        g0.p(client, "client");
        g0.p(handler, "handler");
        io.ktor.util.pipeline.h hVar = new io.ktor.util.pipeline.h("AfterRender");
        client.m0().z(e0.f46866h.b(), hVar);
        client.m0().C(hVar, new C1401a(handler, null));
    }
}
