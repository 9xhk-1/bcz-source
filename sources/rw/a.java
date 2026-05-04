package rw;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a implements sw.a<x00.p<? super ex.c, ? super j00.c<? super ex.c>, ? extends Object>> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a f84556a = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.AfterReceiveHook$install$1", f = "BodyProgress.kt", i = {0}, l = {48, 49}, m = "invokeSuspend", n = {"$this$intercept"}, s = {"L$0"})
    /* renamed from: rw.a$a, reason: collision with other inner class name */
    public static final class C1059a extends SuspendLambda implements x00.q<io.ktor.util.pipeline.d<ex.c, g2>, ex.c, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f84557a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f84558b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f84559c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x00.p<ex.c, j00.c<? super ex.c>, Object> f84560d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C1059a(x00.p<? super ex.c, ? super j00.c<? super ex.c>, ? extends Object> pVar, j00.c<? super C1059a> cVar) {
            super(3, cVar);
            this.f84560d = pVar;
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.util.pipeline.d<ex.c, g2> dVar, ex.c cVar, j00.c<? super g2> cVar2) {
            C1059a c1059a = new C1059a(this.f84560d, cVar2);
            c1059a.f84558b = dVar;
            c1059a.f84559c = cVar;
            return c1059a.invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
        
            if (r1.i(r6, r5) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
        
            if (r6 == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r5.f84557a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.e.n(r6)
                goto L4b
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f84558b
                io.ktor.util.pipeline.d r1 = (io.ktor.util.pipeline.d) r1
                kotlin.e.n(r6)
                goto L3b
            L22:
                kotlin.e.n(r6)
                java.lang.Object r6 = r5.f84558b
                r1 = r6
                io.ktor.util.pipeline.d r1 = (io.ktor.util.pipeline.d) r1
                java.lang.Object r6 = r5.f84559c
                ex.c r6 = (ex.c) r6
                x00.p<ex.c, j00.c<? super ex.c>, java.lang.Object> r4 = r5.f84560d
                r5.f84558b = r1
                r5.f84557a = r3
                java.lang.Object r6 = r4.invoke(r6, r5)
                if (r6 != r0) goto L3b
                goto L4a
            L3b:
                ex.c r6 = (ex.c) r6
                if (r6 == 0) goto L4b
                r3 = 0
                r5.f84558b = r3
                r5.f84557a = r2
                java.lang.Object r6 = r1.i(r6, r5)
                if (r6 != r0) goto L4b
            L4a:
                return r0
            L4b:
                yz.g2 r6 = yz.g2.f100423a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: rw.a.C1059a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // sw.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@m80.k lw.c client, @m80.k x00.p<? super ex.c, ? super j00.c<? super ex.c>, ? extends Object> handler) {
        kotlin.jvm.internal.g0.p(client, "client");
        kotlin.jvm.internal.g0.p(handler, "handler");
        client.c0().C(ex.b.f50181h.a(), new C1059a(handler, null));
    }
}
