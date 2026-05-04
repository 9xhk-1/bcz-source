package com.google.common.net;

import com.google.common.base.Preconditions;
import go.b;
import ho.d0;
import java.io.Serializable;
import javax.annotation.CheckForNull;
import qo.a;
import uo.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@a
@b
@j
/* loaded from: classes7.dex */
public final class HostAndPort implements Serializable {
    private static final int NO_PORT = -1;
    private static final long serialVersionUID = 0;
    private final boolean hasBracketlessColons;
    private final String host;
    private final int port;

    private HostAndPort(String host, int port, boolean hasBracketlessColons) {
        this.host = host;
        this.port = port;
        this.hasBracketlessColons = hasBracketlessColons;
    }

    public static HostAndPort fromHost(String host) {
        HostAndPort fromString = fromString(host);
        Preconditions.checkArgument(!fromString.hasPort(), "Host has a port: %s", host);
        return fromString;
    }

    public static HostAndPort fromParts(String host, int port) {
        Preconditions.checkArgument(isValidPort(port), "Port out of range: %s", port);
        HostAndPort fromString = fromString(host);
        Preconditions.checkArgument(!fromString.hasPort(), "Host has a port: %s", host);
        return new HostAndPort(fromString.host, port, fromString.hasBracketlessColons);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0042  */
    @uo.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.common.net.HostAndPort fromString(java.lang.String r7) {
        /*
            com.google.common.base.Preconditions.checkNotNull(r7)
            java.lang.String r0 = "["
            boolean r0 = r7.startsWith(r0)
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L19
            java.lang.String[] r0 = getHostAndPortFromBracketedHost(r7)
            r4 = r0[r3]
            r0 = r0[r2]
        L16:
            r5 = r4
            r4 = r3
            goto L3c
        L19:
            r0 = 58
            int r4 = r7.indexOf(r0)
            if (r4 < 0) goto L32
            int r5 = r4 + 1
            int r0 = r7.indexOf(r0, r5)
            if (r0 != r1) goto L32
            java.lang.String r4 = r7.substring(r3, r4)
            java.lang.String r0 = r7.substring(r5)
            goto L16
        L32:
            if (r4 < 0) goto L36
            r0 = r2
            goto L37
        L36:
            r0 = r3
        L37:
            r4 = 0
            r5 = r4
            r4 = r0
            r0 = r5
            r5 = r7
        L3c:
            boolean r6 = ho.o0.d(r0)
            if (r6 != 0) goto L80
            java.lang.String r1 = "+"
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L55
            ho.d r1 = ho.d.f()
            boolean r1 = r1.C(r0)
            if (r1 == 0) goto L55
            goto L56
        L55:
            r2 = r3
        L56:
            java.lang.String r1 = "Unparseable port number: %s"
            com.google.common.base.Preconditions.checkArgument(r2, r1, r7)
            int r1 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L69
            boolean r0 = isValidPort(r1)
            java.lang.String r2 = "Port number out of range: %s"
            com.google.common.base.Preconditions.checkArgument(r0, r2, r7)
            goto L80
        L69:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unparseable port number: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L80:
            com.google.common.net.HostAndPort r7 = new com.google.common.net.HostAndPort
            r7.<init>(r5, r1, r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.net.HostAndPort.fromString(java.lang.String):com.google.common.net.HostAndPort");
    }

    private static String[] getHostAndPortFromBracketedHost(String hostPortString) {
        Preconditions.checkArgument(hostPortString.charAt(0) == '[', "Bracketed host-port string must start with a bracket: %s", hostPortString);
        int indexOf = hostPortString.indexOf(58);
        int lastIndexOf = hostPortString.lastIndexOf(93);
        Preconditions.checkArgument(indexOf > -1 && lastIndexOf > indexOf, "Invalid bracketed host/port: %s", hostPortString);
        String substring = hostPortString.substring(1, lastIndexOf);
        int i11 = lastIndexOf + 1;
        if (i11 == hostPortString.length()) {
            return new String[]{substring, ""};
        }
        Preconditions.checkArgument(hostPortString.charAt(i11) == ':', "Only a colon may follow a close bracket: %s", hostPortString);
        int i12 = lastIndexOf + 2;
        for (int i13 = i12; i13 < hostPortString.length(); i13++) {
            Preconditions.checkArgument(Character.isDigit(hostPortString.charAt(i13)), "Port must be numeric: %s", hostPortString);
        }
        return new String[]{substring, hostPortString.substring(i12)};
    }

    private static boolean isValidPort(int port) {
        return port >= 0 && port <= 65535;
    }

    public boolean equals(@CheckForNull Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof HostAndPort) {
            HostAndPort hostAndPort = (HostAndPort) other;
            if (d0.a(this.host, hostAndPort.host) && this.port == hostAndPort.port) {
                return true;
            }
        }
        return false;
    }

    public String getHost() {
        return this.host;
    }

    public int getPort() {
        Preconditions.checkState(hasPort());
        return this.port;
    }

    public int getPortOrDefault(int defaultPort) {
        return hasPort() ? this.port : defaultPort;
    }

    public boolean hasPort() {
        return this.port >= 0;
    }

    public int hashCode() {
        return d0.b(this.host, Integer.valueOf(this.port));
    }

    @uo.a
    public HostAndPort requireBracketsForIPv6() {
        Preconditions.checkArgument(!this.hasBracketlessColons, "Possible bracketless IPv6 literal: %s", this.host);
        return this;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(this.host.length() + 8);
        if (this.host.indexOf(58) >= 0) {
            sb2.append('[');
            sb2.append(this.host);
            sb2.append(l50.b.f69930l);
        } else {
            sb2.append(this.host);
        }
        if (hasPort()) {
            sb2.append(':');
            sb2.append(this.port);
        }
        return sb2.toString();
    }

    public HostAndPort withDefaultPort(int defaultPort) {
        Preconditions.checkArgument(isValidPort(defaultPort));
        return hasPort() ? this : new HostAndPort(this.host, defaultPort, this.hasBracketlessColons);
    }
}
