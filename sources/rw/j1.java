package rw;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j1 implements sw.a<x00.q<? super cx.w, ? super Throwable, ? super j00.c<? super Throwable>, ? extends Object>> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final j1 f84687a = new j1();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.RequestError$install$1", f = "HttpCallValidator.kt", i = {0}, l = {134, 136}, m = "invokeSuspend", n = {"$this$intercept"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements x00.q<io.ktor.util.pipeline.d<Object, cx.y>, Object, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f84688a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f84689b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.q<cx.w, Throwable, j00.c<? super Throwable>, Object> f84690c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(x00.q<? super cx.w, ? super Throwable, ? super j00.c<? super Throwable>, ? extends Object> qVar, j00.c<? super a> cVar) {
            super(3, cVar);
            this.f84690c = qVar;
        }

        @Override // x00.q
        public final Object invoke(io.ktor.util.pipeline.d<Object, cx.y> dVar, Object obj, j00.c<? super g2> cVar) {
            a aVar = new a(this.f84690c, cVar);
            aVar.f84689b = dVar;
            return aVar.invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
        
            if (r6 == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
        
            if (r6 != r0) goto L21;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [io.ktor.util.pipeline.d] */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v7 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r5.f84688a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.e.n(r6)
                goto L4f
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f84689b
                io.ktor.util.pipeline.d r1 = (io.ktor.util.pipeline.d) r1
                kotlin.e.n(r6)     // Catch: java.lang.Throwable -> L22
                goto L53
            L22:
                r6 = move-exception
                goto L37
            L24:
                kotlin.e.n(r6)
                java.lang.Object r6 = r5.f84689b
                r1 = r6
                io.ktor.util.pipeline.d r1 = (io.ktor.util.pipeline.d) r1
                r5.f84689b = r1     // Catch: java.lang.Throwable -> L22
                r5.f84688a = r3     // Catch: java.lang.Throwable -> L22
                java.lang.Object r6 = r1.h(r5)     // Catch: java.lang.Throwable -> L22
                if (r6 != r0) goto L53
                goto L4e
            L37:
                x00.q<cx.w, java.lang.Throwable, j00.c<? super java.lang.Throwable>, java.lang.Object> r3 = r5.f84690c
                java.lang.Object r1 = r1.d()
                cx.y r1 = (cx.y) r1
                rw.v$h r1 = rw.v.i(r1)
                r4 = 0
                r5.f84689b = r4
                r5.f84688a = r2
                java.lang.Object r6 = r3.invoke(r1, r6, r5)
                if (r6 != r0) goto L4f
            L4e:
                return r0
            L4f:
                java.lang.Throwable r6 = (java.lang.Throwable) r6
                if (r6 != 0) goto L56
            L53:
                yz.g2 r6 = yz.g2.f100423a
                return r6
            L56:
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: rw.j1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // sw.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@m80.k lw.c client, @m80.k x00.q<? super cx.w, ? super Throwable, ? super j00.c<? super Throwable>, ? extends Object> handler) {
        kotlin.jvm.internal.g0.p(client, "client");
        kotlin.jvm.internal.g0.p(handler, "handler");
        client.m0().C(cx.e0.f46866h.a(), new a(handler, null));
    }
}
