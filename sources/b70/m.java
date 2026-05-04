package b70;

import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class m {
    public static SSLContext a() {
        SSLContext sSLContext;
        try {
            try {
                sSLContext = SSLContext.getInstance("Default");
            } catch (NoSuchAlgorithmException unused) {
                sSLContext = SSLContext.getInstance("TLS");
            }
            sSLContext.init(null, null, null);
            return sSLContext;
        } catch (Exception e11) {
            throw new IllegalStateException("Failure initializing default SSL context", e11);
        }
    }
}
