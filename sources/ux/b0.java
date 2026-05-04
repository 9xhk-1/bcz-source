package ux;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.network.tls.TLSCommonKt", f = "TLSCommon.kt", i = {0}, l = {39}, m = "tls", n = {"$this$tls"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f92560a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f92561b;

        /* renamed from: c, reason: collision with root package name */
        public int f92562c;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f92561b = obj;
            this.f92562c |= Integer.MIN_VALUE;
            return b0.d(null, null, null, this);
        }
    }

    @m80.l
    public static final Object c(@m80.k tx.p pVar, @m80.k kotlin.coroutines.d dVar, @m80.k j00.c<? super tx.k0> cVar) {
        return e(pVar, dVar, new x00.l() { // from class: ux.z
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 h11;
                h11 = b0.h((d0) obj);
                return h11;
            }
        }, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(@m80.k tx.p r7, @m80.k kotlin.coroutines.d r8, @m80.k ux.c0 r9, @m80.k j00.c<? super tx.k0> r10) {
        /*
            boolean r0 = r10 instanceof ux.b0.a
            if (r0 == 0) goto L14
            r0 = r10
            ux.b0$a r0 = (ux.b0.a) r0
            int r1 = r0.f92562c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f92562c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            ux.b0$a r0 = new ux.b0$a
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.f92561b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r6.f92562c
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L32
            java.lang.Object r7 = r6.f92560a
            tx.p r7 = (tx.p) r7
            kotlin.e.n(r10)     // Catch: java.lang.Throwable -> L2f
            goto L57
        L2f:
            r0 = move-exception
            r8 = r0
            goto L5a
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            kotlin.e.n(r10)
            tx.k0 r1 = r7.c()     // Catch: java.lang.Throwable -> L2f
            r10 = r2
            io.ktor.utils.io.g r2 = r7.a()     // Catch: java.lang.Throwable -> L2f
            io.ktor.utils.io.m r3 = r7.b()     // Catch: java.lang.Throwable -> L2f
            r6.f92560a = r7     // Catch: java.lang.Throwable -> L2f
            r6.f92562c = r10     // Catch: java.lang.Throwable -> L2f
            r5 = r8
            r4 = r9
            java.lang.Object r10 = ux.y.a(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2f
            if (r10 != r0) goto L57
            return r0
        L57:
            tx.k0 r10 = (tx.k0) r10     // Catch: java.lang.Throwable -> L2f
            return r10
        L5a:
            io.ktor.utils.io.g r9 = r7.a()
            r9.a(r8)
            io.ktor.utils.io.m r9 = r7.b()
            io.ktor.utils.io.q.e(r9, r8)
            tx.k0 r7 = r7.c()
            r7.close()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ux.b0.d(tx.p, kotlin.coroutines.d, ux.c0, j00.c):java.lang.Object");
    }

    @m80.l
    public static final Object e(@m80.k tx.p pVar, @m80.k kotlin.coroutines.d dVar, @m80.k x00.l<? super d0, g2> lVar, @m80.k j00.c<? super tx.k0> cVar) {
        d0 d0Var = new d0();
        lVar.invoke(d0Var);
        return d(pVar, dVar, d0Var.a(), cVar);
    }

    @m80.l
    public static final Object f(@m80.k tx.k0 k0Var, @m80.k kotlin.coroutines.d dVar, @m80.k j00.c<? super tx.k0> cVar) {
        return h0.d(k0Var, dVar, new x00.l() { // from class: ux.a0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 g11;
                g11 = b0.g((d0) obj);
                return g11;
            }
        }, cVar);
    }

    public static final g2 g(d0 tls) {
        kotlin.jvm.internal.g0.p(tls, "$this$tls");
        return g2.f100423a;
    }

    public static final g2 h(d0 tls) {
        kotlin.jvm.internal.g0.p(tls, "$this$tls");
        return g2.f100423a;
    }
}
