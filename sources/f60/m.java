package f60;

import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.g0;
import okhttp3.Protocol;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface m {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public static boolean a(@m80.k m mVar, @m80.k SSLSocketFactory sslSocketFactory) {
            g0.p(sslSocketFactory, "sslSocketFactory");
            return false;
        }

        @m80.l
        public static X509TrustManager b(@m80.k m mVar, @m80.k SSLSocketFactory sslSocketFactory) {
            g0.p(sslSocketFactory, "sslSocketFactory");
            return null;
        }
    }

    boolean a(@m80.k SSLSocket sSLSocket);

    @m80.l
    String b(@m80.k SSLSocket sSLSocket);

    void c(@m80.k SSLSocket sSLSocket, @m80.l String str, @m80.k List<? extends Protocol> list);

    @m80.l
    X509TrustManager d(@m80.k SSLSocketFactory sSLSocketFactory);

    boolean e(@m80.k SSLSocketFactory sSLSocketFactory);

    boolean isSupported();
}
