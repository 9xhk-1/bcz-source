package e80;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class h {
    public static void a(StringBuilder sb2, SocketAddress socketAddress) {
        a.j(sb2, "Buffer");
        a.j(socketAddress, "Socket address");
        if (!(socketAddress instanceof InetSocketAddress)) {
            sb2.append(socketAddress);
            return;
        }
        InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddress;
        InetAddress address = inetSocketAddress.getAddress();
        String str = address;
        if (address != null) {
            str = address.getHostAddress();
        }
        sb2.append((Object) str);
        sb2.append(':');
        sb2.append(inetSocketAddress.getPort());
    }
}
