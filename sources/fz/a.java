package fz;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {
    @k
    public static final SocketAddress a(@k String hostname, int i11) {
        g0.p(hostname, "hostname");
        return new InetSocketAddress(hostname, i11);
    }

    @k
    public static final String b(@k SocketAddress socketAddress) {
        String hostString;
        g0.p(socketAddress, "<this>");
        InetSocketAddress inetSocketAddress = socketAddress instanceof InetSocketAddress ? (InetSocketAddress) socketAddress : null;
        return (inetSocketAddress == null || (hostString = inetSocketAddress.getHostString()) == null) ? "" : hostString;
    }

    @k
    public static final String c(@k SocketAddress socketAddress) {
        InetAddress address;
        String hostName;
        g0.p(socketAddress, "<this>");
        boolean z11 = socketAddress instanceof InetSocketAddress;
        String str = null;
        InetSocketAddress inetSocketAddress = z11 ? (InetSocketAddress) socketAddress : null;
        if (inetSocketAddress != null && (hostName = inetSocketAddress.getHostName()) != null) {
            return hostName;
        }
        InetSocketAddress inetSocketAddress2 = z11 ? (InetSocketAddress) socketAddress : null;
        if (inetSocketAddress2 != null && (address = inetSocketAddress2.getAddress()) != null) {
            str = address.getHostName();
        }
        return str == null ? "" : str;
    }

    public static final int d(@k SocketAddress socketAddress) {
        g0.p(socketAddress, "<this>");
        InetSocketAddress inetSocketAddress = socketAddress instanceof InetSocketAddress ? (InetSocketAddress) socketAddress : null;
        if (inetSocketAddress != null) {
            return inetSocketAddress.getPort();
        }
        return 0;
    }
}
