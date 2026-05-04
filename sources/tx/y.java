package tx;

import c40.h1;
import e40.k0;
import e40.l0;
import io.ktor.network.selector.SelectInterest;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import tx.g;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nDatagramSocketImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatagramSocketImpl.kt\nio/ktor/network/sockets/DatagramSocketImpl\n+ 2 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n*L\n1#1,106:1\n15#2,3:107\n15#2,3:110\n*S KotlinDebug\n*F\n+ 1 DatagramSocketImpl.kt\nio/ktor/network/sockets/DatagramSocketImpl\n*L\n83#1:107,3\n101#1:110,3\n*E\n"})
/* loaded from: classes8.dex */
public final class y extends g0<DatagramChannel> implements g, o {

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public final DatagramChannel f91217m;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public final e40.l0<q> f91218n;

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public final e40.k0<q> f91219o;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.network.sockets.DatagramSocketImpl", f = "DatagramSocketImpl.kt", i = {0}, l = {90}, m = "receiveSuspend", n = {"buffer"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f91220a;

        /* renamed from: b, reason: collision with root package name */
        public Object f91221b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f91222c;

        /* renamed from: e, reason: collision with root package name */
        public int f91224e;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f91222c = obj;
            this.f91224e |= Integer.MIN_VALUE;
            return y.this.d1(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.network.sockets.DatagramSocketImpl$receiver$1", f = "DatagramSocketImpl.kt", i = {0, 1}, l = {52, 52}, m = "invokeSuspend", n = {"$this$produce", "$this$produce"}, s = {"L$0", "L$0"})
    public static final class b extends SuspendLambda implements x00.p<e40.i0<? super q>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f91225a;

        /* renamed from: b, reason: collision with root package name */
        public int f91226b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f91227c;

        public b(j00.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            b bVar = y.this.new b(cVar);
            bVar.f91227c = obj;
            return bVar;
        }

        @Override // x00.p
        public final Object invoke(e40.i0<? super q> i0Var, j00.c<? super g2> cVar) {
            return ((b) create(i0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0056 -> B:9:0x0032). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r7.f91226b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r1 = r7.f91227c
                e40.i0 r1 = (e40.i0) r1
                kotlin.e.n(r8)     // Catch: java.lang.Throwable -> L58
                r8 = r1
                goto L32
            L17:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1f:
                java.lang.Object r1 = r7.f91225a
                e40.l0 r1 = (e40.l0) r1
                java.lang.Object r4 = r7.f91227c
                e40.i0 r4 = (e40.i0) r4
                kotlin.e.n(r8)     // Catch: java.lang.Throwable -> L58 java.lang.Throwable -> L58
                goto L48
            L2b:
                kotlin.e.n(r8)
                java.lang.Object r8 = r7.f91227c
                e40.i0 r8 = (e40.i0) r8
            L32:
                e40.l0 r1 = r8.getChannel()     // Catch: java.lang.Throwable -> L58 java.lang.Throwable -> L58
                tx.y r4 = tx.y.this     // Catch: java.lang.Throwable -> L58 java.lang.Throwable -> L58
                r7.f91227c = r8     // Catch: java.lang.Throwable -> L58 java.lang.Throwable -> L58
                r7.f91225a = r1     // Catch: java.lang.Throwable -> L58 java.lang.Throwable -> L58
                r7.f91226b = r3     // Catch: java.lang.Throwable -> L58 java.lang.Throwable -> L58
                java.lang.Object r4 = tx.y.R0(r4, r7)     // Catch: java.lang.Throwable -> L58 java.lang.Throwable -> L58
                if (r4 != r0) goto L45
                goto L55
            L45:
                r6 = r4
                r4 = r8
                r8 = r6
            L48:
                r7.f91227c = r4     // Catch: java.lang.Throwable -> L58 java.lang.Throwable -> L58
                r5 = 0
                r7.f91225a = r5     // Catch: java.lang.Throwable -> L58 java.lang.Throwable -> L58
                r7.f91226b = r2     // Catch: java.lang.Throwable -> L58 java.lang.Throwable -> L58
                java.lang.Object r8 = r1.b(r8, r7)     // Catch: java.lang.Throwable -> L58 java.lang.Throwable -> L58
                if (r8 != r0) goto L56
            L55:
                return r0
            L56:
                r8 = r4
                goto L32
            L58:
                yz.g2 r8 = yz.g2.f100423a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: tx.y.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(@m80.k DatagramChannel channel, @m80.k sx.g selector) {
        super(channel, selector, io.ktor.network.util.a.b(), null, 8, null);
        kotlin.jvm.internal.g0.p(channel, "channel");
        kotlin.jvm.internal.g0.p(selector, "selector");
        this.f91217m = channel;
        this.f91218n = new u(getChannel(), this);
        this.f91219o = e40.g0.j(this, h1.c(), 0, new b(null), 2, null);
    }

    @Override // tx.s
    @m80.l
    public Object H(@m80.k j00.c<? super q> cVar) {
        return g.a.b(this, cVar);
    }

    @Override // tx.g0, sx.f, sx.e
    @m80.k
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public DatagramChannel getChannel() {
        return this.f91217m;
    }

    public final Object a1(j00.c<? super q> cVar) {
        ByteBuffer U6 = io.ktor.network.util.a.b().U6();
        try {
            SocketAddress receive = getChannel().receive(U6);
            if (receive == null) {
                return d1(U6, cVar);
            }
            T0(SelectInterest.READ, false);
            U6.flip();
            y40.b bVar = new y40.b();
            jz.g.a(bVar, U6);
            q qVar = new q(bVar, b0.b(receive));
            return qVar;
        } finally {
            io.ktor.network.util.a.b().b4(U6);
        }
    }

    @Override // tx.g0, sx.f, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        k0.a.b(this.f91219o, null, 1, null);
        super.close();
        l0.a.a(this.f91218n, null, 1, null);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0052 -> B:10:0x0055). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d1(java.nio.ByteBuffer r6, j00.c<? super tx.q> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof tx.y.a
            if (r0 == 0) goto L13
            r0 = r7
            tx.y$a r0 = (tx.y.a) r0
            int r1 = r0.f91224e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f91224e = r1
            goto L18
        L13:
            tx.y$a r0 = new tx.y$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f91222c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f91224e
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r6 = r0.f91221b
            tx.y r6 = (tx.y) r6
            java.lang.Object r2 = r0.f91220a
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            kotlin.e.n(r7)
            r7 = r2
            goto L55
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            kotlin.e.n(r7)
            r7 = r6
            r6 = r5
        L3f:
            io.ktor.network.selector.SelectInterest r2 = io.ktor.network.selector.SelectInterest.READ
            r6.T0(r2, r3)
            sx.g r4 = r6.K0()
            r0.f91220a = r7
            r0.f91221b = r6
            r0.f91224e = r3
            java.lang.Object r2 = r4.N4(r6, r2, r0)
            if (r2 != r1) goto L55
            return r1
        L55:
            java.nio.channels.DatagramChannel r2 = r6.getChannel()     // Catch: java.lang.Throwable -> L82
            java.net.SocketAddress r2 = r2.receive(r7)     // Catch: java.lang.Throwable -> L82
            if (r2 != 0) goto L60
            goto L3f
        L60:
            io.ktor.network.selector.SelectInterest r0 = io.ktor.network.selector.SelectInterest.READ
            r1 = 0
            r6.T0(r0, r1)
            r7.flip()
            y40.b r6 = new y40.b
            r6.<init>()
            jz.g.a(r6, r7)
            tx.l0 r0 = tx.b0.b(r2)
            tx.q r1 = new tx.q
            r1.<init>(r6, r0)
            pz.h r6 = io.ktor.network.util.a.b()
            r6.b4(r7)
            return r1
        L82:
            r6 = move-exception
            pz.h r0 = io.ktor.network.util.a.b()
            r0.b4(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tx.y.d1(java.nio.ByteBuffer, j00.c):java.lang.Object");
    }

    @Override // tx.a
    @m80.k
    public l0 getLocalAddress() {
        l0 b11;
        SocketAddress localAddress = c0.b() ? getChannel().getLocalAddress() : getChannel().socket().getLocalSocketAddress();
        if (localAddress == null || (b11 = b0.b(localAddress)) == null) {
            throw new IllegalStateException("Channel is not yet bound");
        }
        return b11;
    }

    @Override // tx.z
    @m80.l
    public Object i(@m80.k q qVar, @m80.k j00.c<? super g2> cVar) {
        return g.a.c(this, qVar, cVar);
    }

    @Override // tx.s
    @m80.k
    public e40.k0<q> j() {
        return this.f91219o;
    }

    @Override // tx.b
    @m80.k
    public l0 l() {
        l0 b11;
        SocketAddress remoteAddress = c0.b() ? getChannel().getRemoteAddress() : getChannel().socket().getRemoteSocketAddress();
        if (remoteAddress == null || (b11 = b0.b(remoteAddress)) == null) {
            throw new IllegalStateException("Channel is not yet connected");
        }
        return b11;
    }

    @Override // tx.z
    @m80.k
    public e40.l0<q> q() {
        return this.f91218n;
    }

    public static /* synthetic */ void Z0() {
    }
}
