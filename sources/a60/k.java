package a60;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import okhttp3.Protocol;
import okhttp3.n;
import u30.f0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final a f2024d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f2025e = 307;

    /* renamed from: f, reason: collision with root package name */
    public static final int f2026f = 308;

    /* renamed from: g, reason: collision with root package name */
    public static final int f2027g = 421;

    /* renamed from: h, reason: collision with root package name */
    public static final int f2028h = 100;

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final Protocol f2029a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f2030b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f2031c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @m80.k
        public final k a(@m80.k n response) {
            g0.p(response, "response");
            return new k(response.y0(), response.Z(), response.o0());
        }

        @m80.k
        public final k b(@m80.k String statusLine) throws IOException {
            Protocol protocol;
            int i11;
            String str;
            g0.p(statusLine, "statusLine");
            if (f0.J2(statusLine, "HTTP/1.", false, 2, null)) {
                i11 = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                int charAt = statusLine.charAt(7) - '0';
                if (charAt == 0) {
                    protocol = Protocol.HTTP_1_0;
                } else {
                    if (charAt != 1) {
                        throw new ProtocolException("Unexpected status line: " + statusLine);
                    }
                    protocol = Protocol.HTTP_1_1;
                }
            } else {
                if (!f0.J2(statusLine, "ICY ", false, 2, null)) {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                protocol = Protocol.HTTP_1_0;
                i11 = 4;
            }
            int i12 = i11 + 3;
            if (statusLine.length() < i12) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
            try {
                String substring = statusLine.substring(i11, i12);
                g0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                int parseInt = Integer.parseInt(substring);
                if (statusLine.length() <= i12) {
                    str = "";
                } else {
                    if (statusLine.charAt(i12) != ' ') {
                        throw new ProtocolException("Unexpected status line: " + statusLine);
                    }
                    str = statusLine.substring(i11 + 4);
                    g0.o(str, "this as java.lang.String).substring(startIndex)");
                }
                return new k(protocol, parseInt, str);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
        }

        public a() {
        }
    }

    public k(@m80.k Protocol protocol, int i11, @m80.k String message) {
        g0.p(protocol, "protocol");
        g0.p(message, "message");
        this.f2029a = protocol;
        this.f2030b = i11;
        this.f2031c = message;
    }

    @m80.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f2029a == Protocol.HTTP_1_0) {
            sb2.append("HTTP/1.0");
        } else {
            sb2.append("HTTP/1.1");
        }
        sb2.append(' ');
        sb2.append(this.f2030b);
        sb2.append(' ');
        sb2.append(this.f2031c);
        String sb3 = sb2.toString();
        g0.o(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
