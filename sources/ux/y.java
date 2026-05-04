package ux;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class y {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.network.tls.TLSClientSessionJvmKt", f = "TLSClientSessionJvm.kt", i = {0, 0, 0}, l = {26}, m = "openTLSSession", n = {"socket", c90.k.f8409a, "handshake"}, s = {"L$0", "L$1", "L$2"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f92696a;

        /* renamed from: b, reason: collision with root package name */
        public Object f92697b;

        /* renamed from: c, reason: collision with root package name */
        public Object f92698c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f92699d;

        /* renamed from: e, reason: collision with root package name */
        public int f92700e;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f92699d = obj;
            this.f92700e |= Integer.MIN_VALUE;
            return y.a(null, null, null, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@m80.k tx.k0 r4, @m80.k io.ktor.utils.io.g r5, @m80.k io.ktor.utils.io.m r6, @m80.k ux.c0 r7, @m80.k kotlin.coroutines.d r8, @m80.k j00.c<? super tx.k0> r9) {
        /*
            boolean r0 = r9 instanceof ux.y.a
            if (r0 == 0) goto L13
            r0 = r9
            ux.y$a r0 = (ux.y.a) r0
            int r1 = r0.f92700e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f92700e = r1
            goto L18
        L13:
            ux.y$a r0 = new ux.y$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f92699d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f92700e
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r4 = r0.f92698c
            io.ktor.network.tls.b r4 = (io.ktor.network.tls.b) r4
            java.lang.Object r5 = r0.f92697b
            r8 = r5
            kotlin.coroutines.d r8 = (kotlin.coroutines.d) r8
            java.lang.Object r5 = r0.f92696a
            tx.k0 r5 = (tx.k0) r5
            kotlin.e.n(r9)     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L65
            goto L57
        L36:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3e:
            kotlin.e.n(r9)
            io.ktor.network.tls.b r9 = new io.ktor.network.tls.b
            r9.<init>(r5, r6, r7, r8)
            r0.f92696a = r4     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L65
            r0.f92697b = r8     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L65
            r0.f92698c = r9     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L65
            r0.f92700e = r3     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L65
            java.lang.Object r5 = r9.R(r0)     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L65
            if (r5 != r1) goto L55
            return r1
        L55:
            r5 = r4
            r4 = r9
        L57:
            ux.k0 r6 = new ux.k0
            e40.k0 r7 = r4.H()
            e40.l0 r4 = r4.M()
            r6.<init>(r7, r4, r5, r8)
            return r6
        L65:
            r4 = move-exception
            io.ktor.network.tls.TLSException r5 = new io.ktor.network.tls.TLSException
            java.lang.String r6 = "Negotiation failed due to EOS"
            r5.<init>(r6, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ux.y.a(tx.k0, io.ktor.utils.io.g, io.ktor.utils.io.m, ux.c0, kotlin.coroutines.d, j00.c):java.lang.Object");
    }
}
