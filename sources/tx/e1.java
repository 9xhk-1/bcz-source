package tx;

import java.nio.channels.DatagramChannel;
import tx.p0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nUDPSocketBuilderJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UDPSocketBuilderJvm.kt\nio/ktor/network/sockets/UDPSocketBuilderJvmKt\n+ 2 SelectorManager.kt\nio/ktor/network/selector/SelectorManagerKt\n*L\n1#1,43:1\n51#2,8:44\n51#2,8:52\n*S KotlinDebug\n*F\n+ 1 UDPSocketBuilderJvm.kt\nio/ktor/network/sockets/UDPSocketBuilderJvmKt\n*L\n14#1:44,8\n32#1:52,8\n*E\n"})
/* loaded from: classes8.dex */
public final class e1 {
    @m80.k
    public static final g a(@m80.k sx.g selector, @m80.l l0 l0Var, @m80.k p0.f options) {
        kotlin.jvm.internal.g0.p(selector, "selector");
        kotlin.jvm.internal.g0.p(options, "options");
        DatagramChannel openDatagramChannel = selector.X().openDatagramChannel();
        try {
            kotlin.jvm.internal.g0.m(openDatagramChannel);
            c0.a(openDatagramChannel, options);
            c0.c(openDatagramChannel);
            if (c0.b()) {
                openDatagramChannel.bind(l0Var != null ? b0.a(l0Var) : null);
            } else {
                openDatagramChannel.socket().bind(l0Var != null ? b0.a(l0Var) : null);
            }
            return new y(openDatagramChannel, selector);
        } catch (Throwable th2) {
            openDatagramChannel.close();
            throw th2;
        }
    }

    @m80.k
    public static final o b(@m80.k sx.g selector, @m80.k l0 remoteAddress, @m80.l l0 l0Var, @m80.k p0.f options) {
        kotlin.jvm.internal.g0.p(selector, "selector");
        kotlin.jvm.internal.g0.p(remoteAddress, "remoteAddress");
        kotlin.jvm.internal.g0.p(options, "options");
        DatagramChannel openDatagramChannel = selector.X().openDatagramChannel();
        try {
            kotlin.jvm.internal.g0.m(openDatagramChannel);
            c0.a(openDatagramChannel, options);
            c0.c(openDatagramChannel);
            if (c0.b()) {
                openDatagramChannel.bind(l0Var != null ? b0.a(l0Var) : null);
            } else {
                openDatagramChannel.socket().bind(l0Var != null ? b0.a(l0Var) : null);
            }
            openDatagramChannel.connect(b0.a(remoteAddress));
            return new y(openDatagramChannel, selector);
        } catch (Throwable th2) {
            openDatagramChannel.close();
            throw th2;
        }
    }
}
