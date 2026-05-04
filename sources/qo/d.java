package qo;

import com.google.common.base.Preconditions;
import ho.b0;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import javax.annotation.CheckForNull;
import no.p;
import yz.c2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@qo.a
@go.c
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int f82468a = 4;

    /* renamed from: b, reason: collision with root package name */
    public static final int f82469b = 8;

    /* renamed from: c, reason: collision with root package name */
    public static final char f82470c = '.';

    /* renamed from: d, reason: collision with root package name */
    public static final char f82471d = ':';

    /* renamed from: e, reason: collision with root package name */
    public static final ho.d f82472e = ho.d.q('.');

    /* renamed from: f, reason: collision with root package name */
    public static final ho.d f82473f = ho.d.q(':');

    /* renamed from: g, reason: collision with root package name */
    public static final Inet4Address f82474g = (Inet4Address) g("127.0.0.1");

    /* renamed from: h, reason: collision with root package name */
    public static final Inet4Address f82475h = (Inet4Address) g("0.0.0.0");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public String f82476a;

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final Inet4Address f82477a;

        /* renamed from: b, reason: collision with root package name */
        public final Inet4Address f82478b;

        /* renamed from: c, reason: collision with root package name */
        public final int f82479c;

        /* renamed from: d, reason: collision with root package name */
        public final int f82480d;

        public c(@CheckForNull Inet4Address server, @CheckForNull Inet4Address client, int port, int flags) {
            boolean z11 = false;
            Preconditions.checkArgument(port >= 0 && port <= 65535, "port '%s' is out of range (0 <= port <= 0xffff)", port);
            if (flags >= 0 && flags <= 65535) {
                z11 = true;
            }
            Preconditions.checkArgument(z11, "flags '%s' is out of range (0 <= flags <= 0xffff)", flags);
            this.f82477a = (Inet4Address) b0.a(server, d.f82475h);
            this.f82478b = (Inet4Address) b0.a(client, d.f82475h);
            this.f82479c = port;
            this.f82480d = flags;
        }

        public Inet4Address a() {
            return this.f82478b;
        }

        public int b() {
            return this.f82480d;
        }

        public int c() {
            return this.f82479c;
        }

        public Inet4Address d() {
            return this.f82477a;
        }
    }

    public static boolean A(Inet6Address ip2) {
        byte[] address = ip2.getAddress();
        return address[0] == 32 && address[1] == 2;
    }

    public static boolean B(Inet6Address ip2) {
        byte b11;
        if (!ip2.isIPv4CompatibleAddress()) {
            return false;
        }
        byte[] address = ip2.getAddress();
        return (address[12] == 0 && address[13] == 0 && address[14] == 0 && ((b11 = address[15]) == 0 || b11 == 1)) ? false : true;
    }

    public static boolean C(String ipString) {
        return z(ipString, null) != null;
    }

    public static boolean D(Inet6Address ip2) {
        if (G(ip2)) {
            return false;
        }
        byte[] address = ip2.getAddress();
        return (address[8] | 3) == 3 && address[9] == 0 && address[10] == 94 && address[11] == -2;
    }

    public static boolean E(String ipString) {
        byte[] z11 = z(ipString, null);
        if (z11 == null || z11.length != 16) {
            return false;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= 10) {
                for (int i12 = 10; i12 < 12; i12++) {
                    if (z11[i12] != -1) {
                        return false;
                    }
                }
                return true;
            }
            if (z11[i11] != 0) {
                return false;
            }
            i11++;
        }
    }

    public static boolean F(InetAddress address) {
        for (byte b11 : address.getAddress()) {
            if (b11 != -1) {
                return false;
            }
        }
        return true;
    }

    public static boolean G(Inet6Address ip2) {
        byte[] address = ip2.getAddress();
        return address[0] == 32 && address[1] == 1 && address[2] == 0 && address[3] == 0;
    }

    public static boolean H(String ipString) {
        return i(ipString, false) != null;
    }

    public static short I(String ipString, int start, int end) {
        int i11 = end - start;
        if (i11 <= 0 || i11 > 4) {
            throw new NumberFormatException();
        }
        int i12 = 0;
        while (start < end) {
            i12 = (i12 << 4) | Character.digit(ipString.charAt(start), 16);
            start++;
        }
        return (short) i12;
    }

    public static byte J(String ipString, int start, int end) {
        int i11 = end - start;
        if (i11 <= 0 || i11 > 3) {
            throw new NumberFormatException();
        }
        if (i11 > 1 && ipString.charAt(start) == '0') {
            throw new NumberFormatException();
        }
        int i12 = 0;
        while (start < end) {
            int i13 = i12 * 10;
            int digit = Character.digit(ipString.charAt(start), 10);
            if (digit < 0) {
                throw new NumberFormatException();
            }
            i12 = i13 + digit;
            start++;
        }
        if (i12 <= 255) {
            return (byte) i12;
        }
        throw new NumberFormatException();
    }

    public static String K(Inet6Address ip2) {
        NetworkInterface scopedInterface = ip2.getScopedInterface();
        if (scopedInterface != null) {
            return "%" + scopedInterface.getName();
        }
        int scopeId = ip2.getScopeId();
        if (scopeId == 0) {
            return "";
        }
        return "%" + scopeId;
    }

    @CheckForNull
    public static byte[] L(String ipString) {
        if (f82472e.i(ipString) + 1 != 4) {
            return null;
        }
        byte[] bArr = new byte[4];
        int i11 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            int indexOf = ipString.indexOf(46, i11);
            if (indexOf == -1) {
                indexOf = ipString.length();
            }
            try {
                bArr[i12] = J(ipString, i11, indexOf);
                i11 = indexOf + 1;
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return bArr;
    }

    @CheckForNull
    public static byte[] M(String ipString) {
        int i11 = f82473f.i(ipString);
        if (i11 >= 2 && i11 <= 8) {
            int i12 = 1;
            int i13 = i11 + 1;
            int i14 = 8 - i13;
            boolean z11 = false;
            for (int i15 = 0; i15 < ipString.length() - 1; i15++) {
                if (ipString.charAt(i15) == ':' && ipString.charAt(i15 + 1) == ':') {
                    if (z11) {
                        return null;
                    }
                    int i16 = i14 + 1;
                    if (i15 == 0) {
                        i16 = i14 + 2;
                    }
                    if (i15 == ipString.length() - 2) {
                        i16++;
                    }
                    i14 = i16;
                    z11 = true;
                }
            }
            if (ipString.charAt(0) == ':' && ipString.charAt(1) != ':') {
                return null;
            }
            if (ipString.charAt(ipString.length() - 1) == ':' && ipString.charAt(ipString.length() - 2) != ':') {
                return null;
            }
            if (z11 && i14 <= 0) {
                return null;
            }
            if (!z11 && i13 != 8) {
                return null;
            }
            ByteBuffer allocate = ByteBuffer.allocate(16);
            try {
                if (ipString.charAt(0) != ':') {
                    i12 = 0;
                }
                while (i12 < ipString.length()) {
                    int indexOf = ipString.indexOf(58, i12);
                    if (indexOf == -1) {
                        indexOf = ipString.length();
                    }
                    if (ipString.charAt(i12) == ':') {
                        for (int i17 = 0; i17 < i14; i17++) {
                            allocate.putShort((short) 0);
                        }
                    } else {
                        allocate.putShort(I(ipString, i12, indexOf));
                    }
                    i12 = indexOf + 1;
                }
                return allocate.array();
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public static String N(InetAddress ip2) {
        Preconditions.checkNotNull(ip2);
        if (ip2 instanceof Inet4Address) {
            String hostAddress = ip2.getHostAddress();
            Objects.requireNonNull(hostAddress);
            return hostAddress;
        }
        byte[] address = ip2.getAddress();
        int[] iArr = new int[8];
        for (int i11 = 0; i11 < 8; i11++) {
            int i12 = i11 * 2;
            iArr[i11] = ro.i.l((byte) 0, (byte) 0, address[i12], address[i12 + 1]);
        }
        d(iArr);
        return x(iArr) + K((Inet6Address) ip2);
    }

    public static BigInteger O(InetAddress address) {
        return new BigInteger(1, address.getAddress());
    }

    public static String P(InetAddress ip2) {
        if (!(ip2 instanceof Inet6Address)) {
            return N(ip2);
        }
        return "[" + N(ip2) + "]";
    }

    public static int Q(String string, int start, int end) {
        int i11 = 0;
        while (start < end) {
            if (i11 > 214748364) {
                return -1;
            }
            int i12 = i11 * 10;
            int digit = Character.digit(string.charAt(start), 10);
            if (digit < 0) {
                return -1;
            }
            i11 = i12 + digit;
            start++;
        }
        return i11;
    }

    public static InetAddress b(byte[] addr, String scope) {
        try {
            InetAddress byAddress = InetAddress.getByAddress(addr);
            if (scope == null) {
                return byAddress;
            }
            Preconditions.checkArgument(byAddress instanceof Inet6Address, "Unexpected state, scope should only appear for ipv6");
            Inet6Address inet6Address = (Inet6Address) byAddress;
            int Q = Q(scope, 0, scope.length());
            if (Q != -1) {
                return Inet6Address.getByAddress(inet6Address.getHostAddress(), inet6Address.getAddress(), Q);
            }
            try {
                NetworkInterface byName = NetworkInterface.getByName(scope);
                if (byName != null) {
                    return Inet6Address.getByAddress(inet6Address.getHostAddress(), inet6Address.getAddress(), byName);
                }
                throw j("No such interface: '%s'", scope);
            } catch (SocketException e11) {
                e = e11;
                throw new IllegalArgumentException("No such interface: " + scope, e);
            } catch (UnknownHostException e12) {
                e = e12;
                throw new IllegalArgumentException("No such interface: " + scope, e);
            }
        } catch (UnknownHostException e13) {
            throw new AssertionError(e13);
        }
    }

    public static int c(InetAddress ip2) {
        return po.g.h(q(ip2).getAddress()).readInt();
    }

    public static void d(int[] hextets) {
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < hextets.length + 1; i14++) {
            if (i14 >= hextets.length || hextets[i14] != 0) {
                if (i13 >= 0) {
                    int i15 = i14 - i13;
                    if (i15 > i11) {
                        i12 = i13;
                        i11 = i15;
                    }
                    i13 = -1;
                }
            } else if (i13 < 0) {
                i13 = i14;
            }
        }
        if (i11 >= 2) {
            Arrays.fill(hextets, i12, i11 + i12, -1);
        }
    }

    @CheckForNull
    public static String e(String ipString) {
        int lastIndexOf = ipString.lastIndexOf(58) + 1;
        String substring = ipString.substring(0, lastIndexOf);
        byte[] L = L(ipString.substring(lastIndexOf));
        if (L == null) {
            return null;
        }
        return substring + Integer.toHexString(((L[0] & 255) << 8) | (L[1] & 255)) + ":" + Integer.toHexString((L[3] & 255) | ((L[2] & 255) << 8));
    }

    public static InetAddress f(InetAddress address) {
        byte[] address2 = address.getAddress();
        int length = address2.length - 1;
        while (length >= 0 && address2[length] == 0) {
            address2[length] = -1;
            length--;
        }
        Preconditions.checkArgument(length >= 0, "Decrementing %s would wrap.", address);
        address2[length] = (byte) (address2[length] - 1);
        return b(address2, null);
    }

    @uo.a
    public static InetAddress g(String ipString) {
        b bVar = new b();
        byte[] z11 = z(ipString, bVar);
        if (z11 != null) {
            return b(z11, bVar.f82476a);
        }
        throw j("'%s' is not an IP string literal.", ipString);
    }

    public static InetAddress h(String hostAddr) {
        InetAddress i11 = i(hostAddr, true);
        if (i11 != null) {
            return i11;
        }
        throw j("Not a valid URI IP literal: '%s'", hostAddr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckForNull
    public static InetAddress i(String str, boolean z11) {
        int i11;
        Preconditions.checkNotNull(str);
        if (str.startsWith("[") && str.endsWith("]")) {
            str = str.substring(1, str.length() - 1);
            i11 = 16;
        } else {
            i11 = 4;
        }
        b bVar = z11 ? new b() : null;
        byte[] z12 = z(str, bVar);
        if (z12 == null || z12.length != i11) {
            return null;
        }
        return b(z12, bVar != null ? bVar.f82476a : null);
    }

    public static IllegalArgumentException j(String format, Object... args) {
        return new IllegalArgumentException(String.format(Locale.ROOT, format, args));
    }

    public static InetAddress k(BigInteger address, boolean isIpv6) {
        Preconditions.checkArgument(address.signum() >= 0, "BigInteger must be greater than or equal to 0");
        int i11 = isIpv6 ? 16 : 4;
        byte[] byteArray = address.toByteArray();
        byte[] bArr = new byte[i11];
        int max = Math.max(0, byteArray.length - i11);
        int length = byteArray.length - max;
        int i12 = i11 - length;
        for (int i13 = 0; i13 < max; i13++) {
            if (byteArray[i13] != 0) {
                throw j("BigInteger cannot be converted to InetAddress because it has more than %d bytes: %s", Integer.valueOf(i11), address);
            }
        }
        System.arraycopy(byteArray, max, bArr, i12, length);
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException e11) {
            throw new AssertionError(e11);
        }
    }

    public static Inet4Address l(BigInteger address) {
        return (Inet4Address) k(address, false);
    }

    public static Inet6Address m(BigInteger address) {
        return (Inet6Address) k(address, true);
    }

    public static Inet4Address n(int address) {
        return t(ro.i.F(address));
    }

    public static InetAddress o(byte[] addr) throws UnknownHostException {
        byte[] bArr = new byte[addr.length];
        for (int i11 = 0; i11 < addr.length; i11++) {
            bArr[i11] = addr[(addr.length - i11) - 1];
        }
        return InetAddress.getByAddress(bArr);
    }

    public static Inet4Address p(Inet6Address ip2) {
        Preconditions.checkArgument(A(ip2), "Address '%s' is not a 6to4 address.", N(ip2));
        return t(Arrays.copyOfRange(ip2.getAddress(), 2, 6));
    }

    public static Inet4Address q(InetAddress ip2) {
        boolean z11;
        if (ip2 instanceof Inet4Address) {
            return (Inet4Address) ip2;
        }
        byte[] address = ip2.getAddress();
        int i11 = 0;
        while (true) {
            if (i11 >= 15) {
                z11 = true;
                break;
            }
            if (address[i11] != 0) {
                z11 = false;
                break;
            }
            i11++;
        }
        if (z11 && address[15] == 1) {
            return f82474g;
        }
        if (z11 && address[15] == 0) {
            return f82475h;
        }
        Inet6Address inet6Address = (Inet6Address) ip2;
        int b11 = p.B().e(w(inet6Address) ? s(inet6Address).hashCode() : ByteBuffer.wrap(inet6Address.getAddress(), 0, 8).getLong()).b() | s2.b.f87381o;
        if (b11 == -1) {
            b11 = -2;
        }
        return t(ro.i.F(b11));
    }

    public static Inet4Address r(Inet6Address ip2) {
        Preconditions.checkArgument(B(ip2), "Address '%s' is not IPv4-compatible.", N(ip2));
        return t(Arrays.copyOfRange(ip2.getAddress(), 12, 16));
    }

    public static Inet4Address s(Inet6Address ip2) {
        if (B(ip2)) {
            return r(ip2);
        }
        if (A(ip2)) {
            return p(ip2);
        }
        if (G(ip2)) {
            return v(ip2).a();
        }
        throw j("'%s' has no embedded IPv4 address.", N(ip2));
    }

    public static Inet4Address t(byte[] bytes) {
        Preconditions.checkArgument(bytes.length == 4, "Byte array has invalid length for an IPv4 address: %s != 4.", bytes.length);
        return (Inet4Address) b(bytes, null);
    }

    public static Inet4Address u(Inet6Address ip2) {
        Preconditions.checkArgument(D(ip2), "Address '%s' is not an ISATAP address.", N(ip2));
        return t(Arrays.copyOfRange(ip2.getAddress(), 12, 16));
    }

    public static c v(Inet6Address ip2) {
        Preconditions.checkArgument(G(ip2), "Address '%s' is not a Teredo address.", N(ip2));
        byte[] address = ip2.getAddress();
        Inet4Address t11 = t(Arrays.copyOfRange(address, 4, 8));
        int readShort = po.g.i(address, 8).readShort() & c2.f100412d;
        int i11 = 65535 & (~po.g.i(address, 10).readShort());
        byte[] copyOfRange = Arrays.copyOfRange(address, 12, 16);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) (~copyOfRange[i12]);
        }
        return new c(t11, t(copyOfRange), i11, readShort);
    }

    public static boolean w(Inet6Address ip2) {
        return B(ip2) || A(ip2) || G(ip2);
    }

    public static String x(int[] hextets) {
        StringBuilder sb2 = new StringBuilder(39);
        int i11 = 0;
        boolean z11 = false;
        while (i11 < hextets.length) {
            boolean z12 = hextets[i11] >= 0;
            if (z12) {
                if (z11) {
                    sb2.append(':');
                }
                sb2.append(Integer.toHexString(hextets[i11]));
            } else if (i11 == 0 || z11) {
                sb2.append("::");
            }
            i11++;
            z11 = z12;
        }
        return sb2.toString();
    }

    public static InetAddress y(InetAddress address) {
        byte[] address2 = address.getAddress();
        int length = address2.length - 1;
        while (true) {
            if (length < 0 || address2[length] != -1) {
                break;
            }
            address2[length] = 0;
            length--;
        }
        Preconditions.checkArgument(length >= 0, "Incrementing %s would wrap.", address);
        address2[length] = (byte) (address2[length] + 1);
        return b(address2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0032, code lost:
    
        if (r3 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0034, code lost:
    
        if (r2 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0036, code lost:
    
        r9 = e(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003a, code lost:
    
        if (r9 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x003c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003d, code lost:
    
        if (r1 == (-1)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003f, code lost:
    
        if (r10 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0041, code lost:
    
        r10.f82476a = r9.substring(r1 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004a, code lost:
    
        r9 = r9.substring(0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0052, code lost:
    
        return M(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0053, code lost:
    
        if (r2 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0055, code lost:
    
        if (r1 == (-1)) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0057, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005c, code lost:
    
        return L(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x005d, code lost:
    
        return null;
     */
    @javax.annotation.CheckForNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] z(java.lang.String r9, qo.d.b r10) {
        /*
            r0 = 0
            r1 = r0
            r2 = r1
            r3 = r2
        L4:
            int r4 = r9.length()
            r5 = 0
            r6 = -1
            if (r1 >= r4) goto L31
            char r4 = r9.charAt(r1)
            r7 = 46
            r8 = 1
            if (r4 != r7) goto L17
            r2 = r8
            goto L2e
        L17:
            r7 = 58
            if (r4 != r7) goto L20
            if (r2 == 0) goto L1e
            return r5
        L1e:
            r3 = r8
            goto L2e
        L20:
            r7 = 37
            if (r4 != r7) goto L25
            goto L32
        L25:
            r7 = 16
            int r4 = java.lang.Character.digit(r4, r7)
            if (r4 != r6) goto L2e
            return r5
        L2e:
            int r1 = r1 + 1
            goto L4
        L31:
            r1 = r6
        L32:
            if (r3 == 0) goto L53
            if (r2 == 0) goto L3d
            java.lang.String r9 = e(r9)
            if (r9 != 0) goto L3d
            return r5
        L3d:
            if (r1 == r6) goto L4e
            if (r10 == 0) goto L4a
            int r2 = r1 + 1
            java.lang.String r2 = r9.substring(r2)
            qo.d.b.b(r10, r2)
        L4a:
            java.lang.String r9 = r9.substring(r0, r1)
        L4e:
            byte[] r9 = M(r9)
            return r9
        L53:
            if (r2 == 0) goto L5d
            if (r1 == r6) goto L58
            return r5
        L58:
            byte[] r9 = L(r9)
            return r9
        L5d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: qo.d.z(java.lang.String, qo.d$b):byte[]");
    }
}
