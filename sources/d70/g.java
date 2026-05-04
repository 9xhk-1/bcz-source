package d70;

import java.security.Principal;
import javax.net.ssl.SSLSession;
import org.apache.http.HttpConnection;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.Credentials;
import org.apache.http.client.UserTokenHandler;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.protocol.HttpContext;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes9.dex */
public class g implements UserTokenHandler {

    /* renamed from: a, reason: collision with root package name */
    public static final g f47383a = new g();

    public static Principal a(AuthState authState) {
        Credentials credentials;
        AuthScheme authScheme = authState.getAuthScheme();
        if (authScheme == null || !authScheme.isComplete() || !authScheme.isConnectionBased() || (credentials = authState.getCredentials()) == null) {
            return null;
        }
        return credentials.getUserPrincipal();
    }

    @Override // org.apache.http.client.UserTokenHandler
    public Object getUserToken(HttpContext httpContext) {
        Principal principal;
        SSLSession sSLSession;
        HttpClientContext adapt = HttpClientContext.adapt(httpContext);
        AuthState targetAuthState = adapt.getTargetAuthState();
        if (targetAuthState != null) {
            principal = a(targetAuthState);
            if (principal == null) {
                principal = a(adapt.getProxyAuthState());
            }
        } else {
            principal = null;
        }
        if (principal == null) {
            HttpConnection connection = adapt.getConnection();
            if (connection.isOpen() && (connection instanceof q70.e) && (sSLSession = ((q70.e) connection).getSSLSession()) != null) {
                return sSLSession.getLocalPrincipal();
            }
        }
        return principal;
    }
}
