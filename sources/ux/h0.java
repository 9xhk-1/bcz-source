package ux;

import java.security.SecureRandom;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.network.tls.TLSKt", f = "TLS.kt", i = {0, 0, 0}, l = {31}, m = "tls", n = {"$this$tls", "reader", "writer"}, s = {"L$0", "L$1", "L$2"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f92608a;

        /* renamed from: b, reason: collision with root package name */
        public Object f92609b;

        /* renamed from: c, reason: collision with root package name */
        public Object f92610c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f92611d;

        /* renamed from: e, reason: collision with root package name */
        public int f92612e;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f92611d = obj;
            this.f92612e |= Integer.MIN_VALUE;
            return h0.c(null, null, null, this);
        }
    }

    @m80.l
    public static final Object b(@m80.k tx.k0 k0Var, @m80.k kotlin.coroutines.d dVar, @m80.l final X509TrustManager x509TrustManager, @m80.k final String str, @m80.k final List<e> list, @m80.l final String str2, @m80.k j00.c<? super tx.k0> cVar) {
        return d(k0Var, dVar, new x00.l() { // from class: ux.g0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 f11;
                f11 = h0.f(x509TrustManager, str, list, str2, (d0) obj);
                return f11;
            }
        }, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(@m80.k tx.k0 r7, @m80.k kotlin.coroutines.d r8, @m80.k ux.c0 r9, @m80.k j00.c<? super tx.k0> r10) {
        /*
            boolean r0 = r10 instanceof ux.h0.a
            if (r0 == 0) goto L14
            r0 = r10
            ux.h0$a r0 = (ux.h0.a) r0
            int r1 = r0.f92612e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f92612e = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            ux.h0$a r0 = new ux.h0$a
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.f92611d
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r6.f92612e
            r2 = 1
            if (r1 == 0) goto L45
            if (r1 != r2) goto L3d
            java.lang.Object r7 = r6.f92610c
            io.ktor.utils.io.m r7 = (io.ktor.utils.io.m) r7
            java.lang.Object r8 = r6.f92609b
            io.ktor.utils.io.g r8 = (io.ktor.utils.io.g) r8
            java.lang.Object r9 = r6.f92608a
            tx.k0 r9 = (tx.k0) r9
            kotlin.e.n(r10)     // Catch: java.lang.Throwable -> L39
            r3 = r7
            r7 = r9
            goto L67
        L39:
            r0 = move-exception
            r10 = r0
            r1 = r9
            goto L76
        L3d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L45:
            kotlin.e.n(r10)
            r10 = r2
            io.ktor.utils.io.g r2 = tx.u0.d(r7)
            r1 = 0
            r3 = 0
            io.ktor.utils.io.m r3 = tx.u0.f(r7, r1, r10, r3)
            r6.f92608a = r7     // Catch: java.lang.Throwable -> L73
            r6.f92609b = r2     // Catch: java.lang.Throwable -> L73
            r6.f92610c = r3     // Catch: java.lang.Throwable -> L73
            r6.f92612e = r10     // Catch: java.lang.Throwable -> L73
            r1 = r7
            r5 = r8
            r4 = r9
            java.lang.Object r10 = ux.y.a(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L6f
            if (r10 != r0) goto L65
            return r0
        L65:
            r7 = r1
            r8 = r2
        L67:
            tx.k0 r10 = (tx.k0) r10     // Catch: java.lang.Throwable -> L6a
            return r10
        L6a:
            r0 = move-exception
            r10 = r0
            r1 = r7
        L6d:
            r7 = r3
            goto L76
        L6f:
            r0 = move-exception
        L70:
            r10 = r0
            r8 = r2
            goto L6d
        L73:
            r0 = move-exception
            r1 = r7
            goto L70
        L76:
            r8.a(r10)
            io.ktor.utils.io.q.e(r7, r10)
            r1.close()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ux.h0.c(tx.k0, kotlin.coroutines.d, ux.c0, j00.c):java.lang.Object");
    }

    @m80.l
    public static final Object d(@m80.k tx.k0 k0Var, @m80.k kotlin.coroutines.d dVar, @m80.k x00.l<? super d0, g2> lVar, @m80.k j00.c<? super tx.k0> cVar) {
        d0 d0Var = new d0();
        lVar.invoke(d0Var);
        return c(k0Var, dVar, d0Var.a(), cVar);
    }

    public static /* synthetic */ Object e(tx.k0 k0Var, kotlin.coroutines.d dVar, X509TrustManager x509TrustManager, String str, List list, String str2, j00.c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            x509TrustManager = null;
        }
        if ((i11 & 4) != 0) {
            str = "NativePRNGNonBlocking";
        }
        if ((i11 & 8) != 0) {
            list = ux.a.f92549a.e();
        }
        if ((i11 & 16) != 0) {
            str2 = null;
        }
        return b(k0Var, dVar, x509TrustManager, str, list, str2, cVar);
    }

    public static final g2 f(X509TrustManager x509TrustManager, String str, List list, String str2, d0 tls) {
        kotlin.jvm.internal.g0.p(tls, "$this$tls");
        tls.j(x509TrustManager);
        tls.h(SecureRandom.getInstance(str));
        tls.g(list);
        tls.i(str2);
        return g2.f100423a;
    }
}
