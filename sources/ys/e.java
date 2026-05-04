package ys;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m80.k;
import m80.l;
import ws.h;
import ws.i;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class e {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.microsoft.thrifty.service.server.UtilKt", f = "Util.kt", i = {0}, l = {39}, m = "readMessage", n = {"$this$readMessage"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f100316a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f100317b;

        /* renamed from: c, reason: collision with root package name */
        public int f100318c;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f100317b = obj;
            this.f100318c |= Integer.MIN_VALUE;
            return e.a(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.microsoft.thrifty.service.server.UtilKt", f = "Util.kt", i = {0}, l = {33}, m = "reply", n = {"output"}, s = {"L$0"})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f100319a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f100320b;

        /* renamed from: c, reason: collision with root package name */
        public int f100321c;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f100320b = obj;
            this.f100321c |= Integer.MIN_VALUE;
            return e.b(null, null, (byte) 0, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@m80.k ws.i r4, @m80.k x00.q<? super ws.i, ? super ws.h, ? super j00.c<? super yz.g2>, ? extends java.lang.Object> r5, @m80.k j00.c<? super yz.g2> r6) {
        /*
            boolean r0 = r6 instanceof ys.e.a
            if (r0 == 0) goto L13
            r0 = r6
            ys.e$a r0 = (ys.e.a) r0
            int r1 = r0.f100318c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f100318c = r1
            goto L18
        L13:
            ys.e$a r0 = new ys.e$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f100317b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f100318c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f100316a
            ws.i r4 = (ws.i) r4
            kotlin.e.n(r6)
            goto L47
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.e.n(r6)
            ws.h r6 = r4.T8()
            r0.f100316a = r4
            r0.f100318c = r3
            java.lang.Object r5 = r5.invoke(r4, r6, r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            r4.V0()
            yz.g2 r4 = yz.g2.f100423a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ys.e.a(ws.i, x00.q, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(@m80.k ws.h r4, @m80.k ws.i r5, byte r6, @m80.k x00.p<? super ws.i, ? super j00.c<? super yz.g2>, ? extends java.lang.Object> r7, @m80.k j00.c<? super yz.g2> r8) {
        /*
            boolean r0 = r8 instanceof ys.e.b
            if (r0 == 0) goto L13
            r0 = r8
            ys.e$b r0 = (ys.e.b) r0
            int r1 = r0.f100321c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f100321c = r1
            goto L18
        L13:
            ys.e$b r0 = new ys.e$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f100320b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f100321c
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.f100319a
            r5 = r4
            ws.i r5 = (ws.i) r5
            kotlin.e.n(r8)
            goto L4c
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.e.n(r8)
            java.lang.String r8 = r4.f96844c
            byte r6 = (byte) r6
            int r4 = r4.f96843b
            r5.U3(r8, r6, r4)
            r0.f100319a = r5
            r0.f100321c = r3
            java.lang.Object r4 = r7.invoke(r5, r0)
            if (r4 != r1) goto L4c
            return r1
        L4c:
            r5.t4()
            yz.g2 r4 = yz.g2.f100423a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ys.e.b(ws.h, ws.i, byte, x00.p, j00.c):java.lang.Object");
    }

    public static /* synthetic */ Object c(h hVar, i iVar, byte b11, p pVar, j00.c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            b11 = 2;
        }
        return b(hVar, iVar, b11, pVar, cVar);
    }
}
