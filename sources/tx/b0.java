package tx;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b0 {
    @m80.k
    public static final SocketAddress a(@m80.k l0 l0Var) {
        kotlin.jvm.internal.g0.p(l0Var, "<this>");
        return l0Var.a();
    }

    @m80.k
    public static final l0 b(@m80.k SocketAddress socketAddress) {
        kotlin.jvm.internal.g0.p(socketAddress, "<this>");
        if (socketAddress instanceof InetSocketAddress) {
            return new a0((InetSocketAddress) socketAddress);
        }
        if (kotlin.jvm.internal.g0.g(socketAddress.getClass().getName(), m0.f91149a)) {
            return new f1(socketAddress);
        }
        throw new IllegalStateException("Unknown socket address type");
    }
}
