package sw;

import cx.e0;
import cx.y;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class u implements sw.a<x00.s<? super t, ? super y, ? super Object, ? super gz.a, ? super j00.c<? super mx.v>, ? extends Object>> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final u f88989a = new u();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.api.TransformRequestBodyHook$install$1", f = "KtorCallContexts.kt", i = {0}, l = {78, 79}, m = "invokeSuspend", n = {"$this$intercept"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements x00.q<io.ktor.util.pipeline.d<Object, y>, Object, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f88990a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f88991b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.s<t, y, Object, gz.a, j00.c<? super mx.v>, Object> f88992c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(x00.s<? super t, ? super y, Object, ? super gz.a, ? super j00.c<? super mx.v>, ? extends Object> sVar, j00.c<? super a> cVar) {
            super(3, cVar);
            this.f88992c = sVar;
        }

        @Override // x00.q
        public final Object invoke(io.ktor.util.pipeline.d<Object, y> dVar, Object obj, j00.c<? super g2> cVar) {
            a aVar = new a(this.f88992c, cVar);
            aVar.f88991b = dVar;
            return aVar.invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
        
            if (r1.i(r11, r10) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
        
            if (r11 == r0) goto L17;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r10.f88990a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                kotlin.e.n(r11)
                r9 = r10
                goto L61
            L13:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1b:
                java.lang.Object r1 = r10.f88991b
                io.ktor.util.pipeline.d r1 = (io.ktor.util.pipeline.d) r1
                kotlin.e.n(r11)
                r9 = r10
                goto L51
            L24:
                kotlin.e.n(r11)
                java.lang.Object r11 = r10.f88991b
                r1 = r11
                io.ktor.util.pipeline.d r1 = (io.ktor.util.pipeline.d) r1
                x00.s<sw.t, cx.y, java.lang.Object, gz.a, j00.c<? super mx.v>, java.lang.Object> r4 = r10.f88992c
                sw.t r5 = new sw.t
                r5.<init>()
                java.lang.Object r6 = r1.d()
                java.lang.Object r7 = r1.e()
                java.lang.Object r11 = r1.d()
                cx.y r11 = (cx.y) r11
                gz.a r8 = r11.f()
                r10.f88991b = r1
                r10.f88990a = r3
                r9 = r10
                java.lang.Object r11 = r4.invoke(r5, r6, r7, r8, r9)
                if (r11 != r0) goto L51
                goto L60
            L51:
                mx.v r11 = (mx.v) r11
                if (r11 == 0) goto L61
                r3 = 0
                r9.f88991b = r3
                r9.f88990a = r2
                java.lang.Object r11 = r1.i(r11, r10)
                if (r11 != r0) goto L61
            L60:
                return r0
            L61:
                yz.g2 r11 = yz.g2.f100423a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: sw.u.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // sw.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@m80.k lw.c client, @m80.k x00.s<? super t, ? super y, Object, ? super gz.a, ? super j00.c<? super mx.v>, ? extends Object> handler) {
        g0.p(client, "client");
        g0.p(handler, "handler");
        client.m0().C(e0.f46866h.e(), new a(handler, null));
    }
}
