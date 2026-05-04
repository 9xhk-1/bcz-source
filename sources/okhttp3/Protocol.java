package okhttp3;

import java.io.IOException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    @m80.k
    public static final a Companion = new a(null);

    @m80.k
    private final String protocol;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @w00.o
        @m80.k
        public final Protocol a(@m80.k String protocol) throws IOException {
            g0.p(protocol, "protocol");
            Protocol protocol2 = Protocol.HTTP_1_0;
            if (g0.g(protocol, protocol2.protocol)) {
                return protocol2;
            }
            Protocol protocol3 = Protocol.HTTP_1_1;
            if (g0.g(protocol, protocol3.protocol)) {
                return protocol3;
            }
            Protocol protocol4 = Protocol.H2_PRIOR_KNOWLEDGE;
            if (g0.g(protocol, protocol4.protocol)) {
                return protocol4;
            }
            Protocol protocol5 = Protocol.HTTP_2;
            if (g0.g(protocol, protocol5.protocol)) {
                return protocol5;
            }
            Protocol protocol6 = Protocol.SPDY_3;
            if (g0.g(protocol, protocol6.protocol)) {
                return protocol6;
            }
            Protocol protocol7 = Protocol.QUIC;
            if (g0.g(protocol, protocol7.protocol)) {
                return protocol7;
            }
            throw new IOException("Unexpected protocol: " + protocol);
        }

        public a() {
        }
    }

    Protocol(String str) {
        this.protocol = str;
    }

    @w00.o
    @m80.k
    public static final Protocol get(@m80.k String str) throws IOException {
        return Companion.a(str);
    }

    @Override // java.lang.Enum
    @m80.k
    public String toString() {
        return this.protocol;
    }
}
