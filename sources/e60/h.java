package e60;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import okhttp3.Protocol;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nJdk9Platform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Jdk9Platform.kt\nokhttp3/internal/platform/Jdk9Platform\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,89:1\n37#2,2:90\n*S KotlinDebug\n*F\n+ 1 Jdk9Platform.kt\nokhttp3/internal/platform/Jdk9Platform\n*L\n36#1:90,2\n*E\n"})
/* loaded from: classes8.dex */
public class h extends j {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f49485f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f49486g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @l
        public final h a() {
            if (b()) {
                return new h();
            }
            return null;
        }

        public final boolean b() {
            return h.f49486g;
        }

        public a() {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
    
        if (r0.intValue() >= 9) goto L10;
     */
    static {
        /*
            e60.h$a r0 = new e60.h$a
            r1 = 0
            r0.<init>(r1)
            e60.h.f49485f = r0
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L15
            java.lang.Integer r0 = u30.e0.p1(r0)
            goto L16
        L15:
            r0 = r1
        L16:
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L24
            int r0 = r0.intValue()
            r1 = 9
            if (r0 < r1) goto L2c
        L22:
            r2 = r3
            goto L2c
        L24:
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            java.lang.String r4 = "getApplicationProtocol"
            r0.getMethod(r4, r1)     // Catch: java.lang.NoSuchMethodException -> L2c
            goto L22
        L2c:
            e60.h.f49486g = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e60.h.<clinit>():void");
    }

    @Override // e60.j
    @u50.c
    public void f(@k SSLSocket sslSocket, @l String str, @k List<Protocol> protocols) {
        g0.p(sslSocket, "sslSocket");
        g0.p(protocols, "protocols");
        SSLParameters sSLParameters = sslSocket.getSSLParameters();
        sSLParameters.setApplicationProtocols((String[]) j.f49490a.b(protocols).toArray(new String[0]));
        sslSocket.setSSLParameters(sSLParameters);
    }

    @Override // e60.j
    @l
    @u50.c
    public String j(@k SSLSocket sslSocket) {
        String applicationProtocol;
        g0.p(sslSocket, "sslSocket");
        try {
            applicationProtocol = sslSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : g0.g(applicationProtocol, "")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // e60.j
    @l
    public X509TrustManager s(@k SSLSocketFactory sslSocketFactory) {
        g0.p(sslSocketFactory, "sslSocketFactory");
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
    }
}
