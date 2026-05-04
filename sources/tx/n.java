package tx;

import java.net.ProtocolFamily;
import java.net.StandardProtocolFamily;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.channels.spi.SelectorProvider;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import tx.p0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nConnectUtilsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectUtilsJvm.kt\nio/ktor/network/sockets/ConnectUtilsJvmKt\n+ 2 SelectorManager.kt\nio/ktor/network/selector/SelectorManagerKt\n*L\n1#1,64:1\n51#2,8:65\n51#2,8:73\n*S KotlinDebug\n*F\n+ 1 ConnectUtilsJvm.kt\nio/ktor/network/sockets/ConnectUtilsJvmKt\n*L\n16#1:65,8\n29#1:73,8\n*E\n"})
/* loaded from: classes8.dex */
public final class n {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.network.sockets.ConnectUtilsJvmKt", f = "ConnectUtilsJvm.kt", i = {0}, l = {21}, m = "connect", n = {"result$iv"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f91150a;

        /* renamed from: b, reason: collision with root package name */
        public Object f91151b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f91152c;

        /* renamed from: d, reason: collision with root package name */
        public int f91153d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f91152c = obj;
            this.f91153d |= Integer.MIN_VALUE;
            return n.b(null, null, null, this);
        }
    }

    @m80.k
    public static final i0 a(@m80.k sx.g selector, @m80.l l0 l0Var, @m80.k p0.a socketOptions) {
        kotlin.jvm.internal.g0.p(selector, "selector");
        kotlin.jvm.internal.g0.p(socketOptions, "socketOptions");
        ServerSocketChannel c11 = c(selector.X(), l0Var);
        try {
            if (l0Var instanceof a0) {
                kotlin.jvm.internal.g0.m(c11);
                c0.a(c11, socketOptions);
            }
            kotlin.jvm.internal.g0.m(c11);
            c0.c(c11);
            j0 j0Var = new j0(c11, selector);
            if (c0.b()) {
                j0Var.getChannel().bind(l0Var != null ? b0.a(l0Var) : null, socketOptions.m());
                return j0Var;
            }
            j0Var.getChannel().socket().bind(l0Var != null ? b0.a(l0Var) : null, socketOptions.m());
            return j0Var;
        } catch (Throwable th2) {
            c11.close();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(@m80.k sx.g r4, @m80.k tx.l0 r5, @m80.k tx.p0.e r6, @m80.k j00.c<? super tx.k0> r7) {
        /*
            boolean r0 = r7 instanceof tx.n.a
            if (r0 == 0) goto L13
            r0 = r7
            tx.n$a r0 = (tx.n.a) r0
            int r1 = r0.f91153d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f91153d = r1
            goto L18
        L13:
            tx.n$a r0 = new tx.n$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f91152c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f91153d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f91151b
            tx.o0 r4 = (tx.o0) r4
            java.lang.Object r5 = r0.f91150a
            java.io.Closeable r5 = (java.io.Closeable) r5
            kotlin.e.n(r7)     // Catch: java.lang.Throwable -> L31
            return r4
        L31:
            r4 = move-exception
            goto L71
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.e.n(r7)
            java.nio.channels.spi.SelectorProvider r7 = r4.X()
            java.nio.channels.SocketChannel r7 = d(r7, r5)
            boolean r2 = r5 instanceof tx.a0     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L54
            kotlin.jvm.internal.g0.m(r7)     // Catch: java.lang.Throwable -> L51
            tx.c0.a(r7, r6)     // Catch: java.lang.Throwable -> L51
            goto L54
        L51:
            r4 = move-exception
            r5 = r7
            goto L71
        L54:
            kotlin.jvm.internal.g0.m(r7)     // Catch: java.lang.Throwable -> L51
            tx.c0.c(r7)     // Catch: java.lang.Throwable -> L51
            tx.o0 r2 = new tx.o0     // Catch: java.lang.Throwable -> L51
            r2.<init>(r7, r4, r6)     // Catch: java.lang.Throwable -> L51
            java.net.SocketAddress r4 = tx.b0.a(r5)     // Catch: java.lang.Throwable -> L51
            r0.f91150a = r7     // Catch: java.lang.Throwable -> L51
            r0.f91151b = r2     // Catch: java.lang.Throwable -> L51
            r0.f91153d = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r4 = r2.R0(r4, r0)     // Catch: java.lang.Throwable -> L51
            if (r4 != r1) goto L70
            return r1
        L70:
            return r2
        L71:
            r5.close()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tx.n.b(sx.g, tx.l0, tx.p0$e, j00.c):java.lang.Object");
    }

    public static final ServerSocketChannel c(@m80.k SelectorProvider selectorProvider, @m80.l l0 l0Var) {
        kotlin.jvm.internal.g0.p(selectorProvider, "<this>");
        if (l0Var == null) {
            return selectorProvider.openServerSocketChannel();
        }
        if (l0Var instanceof a0) {
            return selectorProvider.openServerSocketChannel();
        }
        if (!(l0Var instanceof f1)) {
            throw new NoWhenBranchMatchedException();
        }
        Object invoke = SelectorProvider.class.getMethod("openServerSocketChannel", ProtocolFamily.class).invoke(selectorProvider, StandardProtocolFamily.valueOf("UNIX"));
        kotlin.jvm.internal.g0.n(invoke, "null cannot be cast to non-null type java.nio.channels.ServerSocketChannel");
        return (ServerSocketChannel) invoke;
    }

    public static final SocketChannel d(@m80.k SelectorProvider selectorProvider, @m80.k l0 address) {
        kotlin.jvm.internal.g0.p(selectorProvider, "<this>");
        kotlin.jvm.internal.g0.p(address, "address");
        if (address instanceof a0) {
            return selectorProvider.openSocketChannel();
        }
        if (!(address instanceof f1)) {
            throw new NoWhenBranchMatchedException();
        }
        Object invoke = SelectorProvider.class.getMethod("openSocketChannel", ProtocolFamily.class).invoke(selectorProvider, StandardProtocolFamily.valueOf("UNIX"));
        kotlin.jvm.internal.g0.n(invoke, "null cannot be cast to non-null type java.nio.channels.SocketChannel");
        return (SocketChannel) invoke;
    }
}
