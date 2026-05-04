package d80;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import org.apache.http.ssl.SSLInitializationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class d {
    public static SSLContext a() throws SSLInitializationException {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, null, null);
            return sSLContext;
        } catch (KeyManagementException e11) {
            throw new SSLInitializationException(e11.getMessage(), e11);
        } catch (NoSuchAlgorithmException e12) {
            throw new SSLInitializationException(e12.getMessage(), e12);
        }
    }

    public static SSLContext b() throws SSLInitializationException {
        try {
            return SSLContext.getDefault();
        } catch (NoSuchAlgorithmException unused) {
            return a();
        }
    }

    public static c c() {
        return c.b();
    }
}
