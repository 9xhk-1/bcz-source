package rw;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class i1 implements sw.a<x00.q<? super cx.y, ? super Object, ? super j00.c<? super mx.v>, ? extends Object>> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final i1 f84675a = new i1();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.RenderRequestHook$install$1", f = "HttpPlainText.kt", i = {0}, l = {145, 146}, m = "invokeSuspend", n = {"$this$intercept"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements x00.q<io.ktor.util.pipeline.d<Object, cx.y>, Object, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f84676a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f84677b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f84678c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x00.q<cx.y, Object, j00.c<? super mx.v>, Object> f84679d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(x00.q<? super cx.y, Object, ? super j00.c<? super mx.v>, ? extends Object> qVar, j00.c<? super a> cVar) {
            super(3, cVar);
            this.f84679d = qVar;
        }

        @Override // x00.q
        public final Object invoke(io.ktor.util.pipeline.d<Object, cx.y> dVar, Object obj, j00.c<? super g2> cVar) {
            a aVar = new a(this.f84679d, cVar);
            aVar.f84677b = dVar;
            aVar.f84678c = obj;
            return aVar.invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
        
            if (r1.i(r7, r6) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
        
            if (r7 == r0) goto L17;
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
                int r1 = r6.f84676a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.e.n(r7)
                goto L4d
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.f84677b
                io.ktor.util.pipeline.d r1 = (io.ktor.util.pipeline.d) r1
                kotlin.e.n(r7)
                goto L3d
            L22:
                kotlin.e.n(r7)
                java.lang.Object r7 = r6.f84677b
                r1 = r7
                io.ktor.util.pipeline.d r1 = (io.ktor.util.pipeline.d) r1
                java.lang.Object r7 = r6.f84678c
                x00.q<cx.y, java.lang.Object, j00.c<? super mx.v>, java.lang.Object> r4 = r6.f84679d
                java.lang.Object r5 = r1.d()
                r6.f84677b = r1
                r6.f84676a = r3
                java.lang.Object r7 = r4.invoke(r5, r7, r6)
                if (r7 != r0) goto L3d
                goto L4c
            L3d:
                mx.v r7 = (mx.v) r7
                if (r7 == 0) goto L4d
                r3 = 0
                r6.f84677b = r3
                r6.f84676a = r2
                java.lang.Object r7 = r1.i(r7, r6)
                if (r7 != r0) goto L4d
            L4c:
                return r0
            L4d:
                yz.g2 r7 = yz.g2.f100423a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: rw.i1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // sw.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@m80.k lw.c client, @m80.k x00.q<? super cx.y, Object, ? super j00.c<? super mx.v>, ? extends Object> handler) {
        kotlin.jvm.internal.g0.p(client, "client");
        kotlin.jvm.internal.g0.p(handler, "handler");
        client.m0().C(cx.e0.f46866h.b(), new a(handler, null));
    }
}
