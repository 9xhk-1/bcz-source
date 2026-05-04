package tx;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nSockets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sockets.kt\nio/ktor/network/sockets/SocketsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,148:1\n1#2:149\n*E\n"})
/* loaded from: classes8.dex */
public final class u0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.network.sockets.SocketsKt", f = "Sockets.kt", i = {0}, l = {38}, m = "awaitClosed", n = {"$this$awaitClosed"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f91212a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f91213b;

        /* renamed from: c, reason: collision with root package name */
        public int f91214c;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f91213b = obj;
            this.f91214c |= Integer.MIN_VALUE;
            return u0.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@m80.k tx.d r4, @m80.k j00.c<? super yz.g2> r5) {
        /*
            boolean r0 = r5 instanceof tx.u0.a
            if (r0 == 0) goto L13
            r0 = r5
            tx.u0$a r0 = (tx.u0.a) r0
            int r1 = r0.f91214c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f91214c = r1
            goto L18
        L13:
            tx.u0$a r0 = new tx.u0$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f91213b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f91214c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f91212a
            tx.d r4 = (tx.d) r4
            kotlin.e.n(r5)
            goto L47
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.e.n(r5)
            c40.l2 r5 = r4.Z3()
            r0.f91212a = r4
            r0.f91214c = r3
            java.lang.Object r5 = r5.K0(r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            c40.l2 r5 = r4.Z3()
            boolean r5 = r5.isCancelled()
            if (r5 != 0) goto L54
            yz.g2 r4 = yz.g2.f100423a
            return r4
        L54:
            c40.l2 r4 = r4.Z3()
            java.util.concurrent.CancellationException r4 = r4.y0()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tx.u0.a(tx.d, j00.c):java.lang.Object");
    }

    @m80.k
    public static final p b(@m80.k k0 k0Var) {
        kotlin.jvm.internal.g0.p(k0Var, "<this>");
        return new p(k0Var, d(k0Var), f(k0Var, false, 1, null));
    }

    public static final boolean c(@m80.k d dVar) {
        kotlin.jvm.internal.g0.p(dVar, "<this>");
        return dVar.Z3().e();
    }

    @m80.k
    public static final io.ktor.utils.io.g d(@m80.k c cVar) {
        kotlin.jvm.internal.g0.p(cVar, "<this>");
        io.ktor.utils.io.b bVar = new io.ktor.utils.io.b(false);
        cVar.r(bVar);
        return bVar;
    }

    @m80.k
    public static final io.ktor.utils.io.m e(@m80.k e eVar, boolean z11) {
        kotlin.jvm.internal.g0.p(eVar, "<this>");
        io.ktor.utils.io.b bVar = new io.ktor.utils.io.b(z11);
        eVar.a(bVar);
        return bVar;
    }

    public static /* synthetic */ io.ktor.utils.io.m f(e eVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return e(eVar, z11);
    }
}
