package tx;

import c40.p2;
import io.ktor.network.selector.SelectInterest;
import java.net.SocketAddress;
import java.net.SocketOption;
import java.net.StandardSocketOptions;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import tx.i0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nServerSocketImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerSocketImpl.kt\nio/ktor/network/sockets/ServerSocketImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n1#2:78\n*E\n"})
/* loaded from: classes8.dex */
public final class j0 implements i0, sx.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sx.f f91125a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final ServerSocketChannel f91126b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final sx.g f91127c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final c40.a0 f91128d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.network.sockets.ServerSocketImpl", f = "ServerSocketImpl.kt", i = {0}, l = {41}, m = "acceptSuspend", n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f91129a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f91130b;

        /* renamed from: d, reason: collision with root package name */
        public int f91132d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f91130b = obj;
            this.f91132d |= Integer.MIN_VALUE;
            return j0.this.a(this);
        }
    }

    public j0(@m80.k ServerSocketChannel channel, @m80.k sx.g selector) {
        c40.a0 c11;
        kotlin.jvm.internal.g0.p(channel, "channel");
        kotlin.jvm.internal.g0.p(selector, "selector");
        this.f91125a = new sx.f(channel);
        this.f91126b = channel;
        this.f91127c = selector;
        if (getChannel().isBlocking()) {
            throw new IllegalArgumentException("Channel need to be configured as non-blocking.");
        }
        c11 = p2.c(null, 1, null);
        this.f91128d = c11;
    }

    @Override // sx.e
    @m80.k
    public io.ktor.network.selector.a C4() {
        return this.f91125a.C4();
    }

    @Override // sx.e
    public void T0(@m80.k SelectInterest interest, boolean z11) {
        kotlin.jvm.internal.g0.p(interest, "interest");
        this.f91125a.T0(interest, z11);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0048 -> B:10:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(j00.c<? super tx.k0> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof tx.j0.a
            if (r0 == 0) goto L13
            r0 = r6
            tx.j0$a r0 = (tx.j0.a) r0
            int r1 = r0.f91132d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f91132d = r1
            goto L18
        L13:
            tx.j0$a r0 = new tx.j0$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f91130b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f91132d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r2 = r0.f91129a
            tx.j0 r2 = (tx.j0) r2
            kotlin.e.n(r6)
            goto L4b
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            kotlin.e.n(r6)
            r2 = r5
        L39:
            io.ktor.network.selector.SelectInterest r6 = io.ktor.network.selector.SelectInterest.ACCEPT
            r2.T0(r6, r3)
            sx.g r4 = r2.f91127c
            r0.f91129a = r2
            r0.f91132d = r3
            java.lang.Object r6 = r4.N4(r2, r6, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            java.nio.channels.ServerSocketChannel r6 = r2.getChannel()
            java.nio.channels.SocketChannel r6 = r6.accept()
            if (r6 == 0) goto L39
            tx.k0 r6 = r2.c(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tx.j0.a(j00.c):java.lang.Object");
    }

    public final k0 c(SocketChannel socketChannel) {
        T0(SelectInterest.ACCEPT, false);
        socketChannel.configureBlocking(false);
        if (getLocalAddress() instanceof a0) {
            if (c0.b()) {
                socketChannel.setOption((SocketOption<SocketOption>) StandardSocketOptions.TCP_NODELAY, (SocketOption) Boolean.TRUE);
            } else {
                socketChannel.socket().setTcpNoDelay(true);
            }
        }
        return new o0(socketChannel, this.f91127c, null, 4, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            try {
                getChannel().close();
                this.f91127c.B8(this);
                Z3().complete();
            } catch (Throwable th2) {
                this.f91127c.B8(this);
                throw th2;
            }
        } catch (Throwable th3) {
            Z3().r(th3);
        }
    }

    @Override // tx.d, c40.k1
    public void dispose() {
        i0.a.a(this);
    }

    @Override // tx.a
    @m80.k
    public l0 getLocalAddress() {
        SocketAddress localAddress = c0.b() ? getChannel().getLocalAddress() : getChannel().socket().getLocalSocketAddress();
        kotlin.jvm.internal.g0.m(localAddress);
        return b0.b(localAddress);
    }

    @Override // sx.e
    public boolean isClosed() {
        return this.f91125a.isClosed();
    }

    @Override // sx.e
    @m80.k
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public ServerSocketChannel getChannel() {
        return this.f91126b;
    }

    @Override // tx.f
    @m80.l
    public Object j0(@m80.k j00.c<? super k0> cVar) {
        SocketChannel accept = getChannel().accept();
        return accept != null ? c(accept) : a(cVar);
    }

    @m80.k
    public final sx.g k() {
        return this.f91127c;
    }

    @Override // tx.d
    @m80.k
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public c40.a0 Z3() {
        return this.f91128d;
    }

    @Override // sx.e
    public int x5() {
        return this.f91125a.x5();
    }
}
