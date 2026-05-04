package okhttp3;

import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public enum TlsVersion {
    TLS_1_3(wr.f.f96679b),
    TLS_1_2(wr.f.f96680c),
    TLS_1_1("TLSv1.1"),
    TLS_1_0(wr.f.f96682e),
    SSL_3_0("SSLv3");


    @m80.k
    public static final a Companion = new a(null);

    @m80.k
    private final String javaName;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @w00.o
        @m80.k
        public final TlsVersion a(@m80.k String javaName) {
            g0.p(javaName, "javaName");
            int hashCode = javaName.hashCode();
            if (hashCode != 79201641) {
                if (hashCode != 79923350) {
                    switch (hashCode) {
                        case -503070503:
                            if (javaName.equals("TLSv1.1")) {
                                return TlsVersion.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (javaName.equals(wr.f.f96680c)) {
                                return TlsVersion.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (javaName.equals(wr.f.f96679b)) {
                                return TlsVersion.TLS_1_3;
                            }
                            break;
                    }
                } else if (javaName.equals(wr.f.f96682e)) {
                    return TlsVersion.TLS_1_0;
                }
            } else if (javaName.equals("SSLv3")) {
                return TlsVersion.SSL_3_0;
            }
            throw new IllegalArgumentException("Unexpected TLS version: " + javaName);
        }

        public a() {
        }
    }

    TlsVersion(String str) {
        this.javaName = str;
    }

    @w00.o
    @m80.k
    public static final TlsVersion forJavaName(@m80.k String str) {
        return Companion.a(str);
    }

    @w00.j(name = "-deprecated_javaName")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = "javaName", imports = {}))
    @m80.k
    /* renamed from: -deprecated_javaName, reason: not valid java name */
    public final String m6329deprecated_javaName() {
        return this.javaName;
    }

    @w00.j(name = "javaName")
    @m80.k
    public final String javaName() {
        return this.javaName;
    }
}
