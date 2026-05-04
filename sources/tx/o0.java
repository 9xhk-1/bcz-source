package tx;

import io.ktor.network.selector.SelectInterest;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import tx.p0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nSocketImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocketImpl.kt\nio/ktor/network/sockets/SocketImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1#2:106\n*E\n"})
/* loaded from: classes8.dex */
public final class o0<S extends SocketChannel> extends g0<S> implements k0 {

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public final S f91156m;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.network.sockets.SocketImpl", f = "SocketImpl.kt", i = {0, 1}, l = {47, 65}, m = "connect$ktor_network", n = {"this", "this"}, s = {"L$0", "L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f91157a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f91158b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o0<S> f91159c;

        /* renamed from: d, reason: collision with root package name */
        public int f91160d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(o0<? extends S> o0Var, j00.c<? super a> cVar) {
            super(cVar);
            this.f91159c = o0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f91158b = obj;
            this.f91160d |= Integer.MIN_VALUE;
            return this.f91159c.R0(null, this);
        }
    }

    public /* synthetic */ o0(SocketChannel socketChannel, sx.g gVar, p0.e eVar, int i11, kotlin.jvm.internal.v vVar) {
        this(socketChannel, gVar, (i11 & 4) != 0 ? null : eVar);
    }

    public static /* synthetic */ void a1(o0 o0Var, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        o0Var.Z0(z11);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R0(@m80.k java.net.SocketAddress r6, @m80.k j00.c<? super tx.k0> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof tx.o0.a
            if (r0 == 0) goto L13
            r0 = r7
            tx.o0$a r0 = (tx.o0.a) r0
            int r1 = r0.f91160d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f91160d = r1
            goto L18
        L13:
            tx.o0$a r0 = new tx.o0$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f91158b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f91160d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L31
            if (r2 != r3) goto L29
            goto L31
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            java.lang.Object r6 = r0.f91157a
            tx.o0 r6 = (tx.o0) r6
            kotlin.e.n(r7)
            goto L5c
        L39:
            kotlin.e.n(r7)
            java.nio.channels.SocketChannel r7 = r5.getChannel()
            boolean r6 = r7.connect(r6)
            if (r6 == 0) goto L47
            return r5
        L47:
            r5.Z0(r4)
            sx.g r6 = r5.K0()
            io.ktor.network.selector.SelectInterest r7 = io.ktor.network.selector.SelectInterest.CONNECT
            r0.f91157a = r5
            r0.f91160d = r4
            java.lang.Object r6 = r6.N4(r5, r7, r0)
            if (r6 != r1) goto L5b
            goto L9e
        L5b:
            r6 = r5
        L5c:
            java.nio.channels.SocketChannel r7 = r6.getChannel()
            boolean r7 = r7.finishConnect()
            if (r7 == 0) goto L8b
            boolean r7 = r6.Y0()
            if (r7 == 0) goto L86
            boolean r7 = tx.c0.b()
            if (r7 == 0) goto L7a
            java.nio.channels.SocketChannel r7 = r6.getChannel()
            r7.close()
            goto L5c
        L7a:
            java.nio.channels.SocketChannel r7 = r6.getChannel()
            java.net.Socket r7 = r7.socket()
            r7.close()
            goto L5c
        L86:
            r7 = 0
            r6.Z0(r7)
            return r6
        L8b:
            r6.Z0(r4)
            sx.g r7 = r6.K0()
            io.ktor.network.selector.SelectInterest r2 = io.ktor.network.selector.SelectInterest.CONNECT
            r0.f91157a = r6
            r0.f91160d = r3
            java.lang.Object r7 = r7.N4(r6, r2, r0)
            if (r7 != r1) goto L5c
        L9e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tx.o0.R0(java.net.SocketAddress, j00.c):java.lang.Object");
    }

    @Override // tx.g0, sx.f, sx.e
    @m80.k
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public S getChannel() {
        return this.f91156m;
    }

    public final boolean Y0() {
        String str;
        InetAddress address;
        InetAddress address2;
        String hostAddress;
        InetAddress address3;
        SocketAddress localAddress = c0.b() ? getChannel().getLocalAddress() : getChannel().socket().getLocalSocketAddress();
        SocketAddress remoteAddress = c0.b() ? getChannel().getRemoteAddress() : getChannel().socket().getRemoteSocketAddress();
        if (localAddress == null || remoteAddress == null) {
            throw new IllegalStateException("localAddress and remoteAddress should not be null.");
        }
        InetSocketAddress inetSocketAddress = localAddress instanceof InetSocketAddress ? (InetSocketAddress) localAddress : null;
        InetSocketAddress inetSocketAddress2 = remoteAddress instanceof InetSocketAddress ? (InetSocketAddress) remoteAddress : null;
        String str2 = "";
        if (inetSocketAddress == null || (address3 = inetSocketAddress.getAddress()) == null || (str = address3.getHostAddress()) == null) {
            str = "";
        }
        if (inetSocketAddress2 != null && (address2 = inetSocketAddress2.getAddress()) != null && (hostAddress = address2.getHostAddress()) != null) {
            str2 = hostAddress;
        }
        return kotlin.jvm.internal.g0.g(inetSocketAddress != null ? Integer.valueOf(inetSocketAddress.getPort()) : null, inetSocketAddress2 != null ? Integer.valueOf(inetSocketAddress2.getPort()) : null) && (((inetSocketAddress2 == null || (address = inetSocketAddress2.getAddress()) == null) ? false : address.isAnyLocalAddress()) || kotlin.jvm.internal.g0.g(str, str2));
    }

    public final void Z0(boolean z11) {
        T0(SelectInterest.CONNECT, z11);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(@m80.k S channel, @m80.k sx.g selector, @m80.l p0.e eVar) {
        super(channel, selector, null, eVar);
        kotlin.jvm.internal.g0.p(channel, "channel");
        kotlin.jvm.internal.g0.p(selector, "selector");
        this.f91156m = channel;
        if (getChannel().isBlocking()) {
            throw new IllegalArgumentException("Channel need to be configured as non-blocking.");
        }
    }
}
