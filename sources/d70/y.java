package d70;

import java.util.Collection;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.params.ConnRouteParams;
import org.apache.http.params.HttpParams;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public final class y {
    public static RequestConfig a(HttpParams httpParams) {
        return RequestConfig.custom().setAuthenticationEnabled(HttpClientParams.isAuthenticating(httpParams)).setCircularRedirectsAllowed(httpParams.getBooleanParameter("http.protocol.allow-circular-redirects", false)).setConnectionRequestTimeout((int) HttpClientParams.getConnectionManagerTimeout(httpParams)).setConnectTimeout(a80.g.a(httpParams)).setCookieSpec(HttpClientParams.getCookiePolicy(httpParams)).setProxy(ConnRouteParams.getDefaultProxy(httpParams)).setExpectContinueEnabled(a80.k.n(httpParams)).setLocalAddress(ConnRouteParams.getLocalAddress(httpParams)).setMaxRedirects(httpParams.getIntParameter("http.protocol.max-redirects", 50)).setProxyPreferredAuthSchemes((Collection) httpParams.getParameter("http.auth.proxy-scheme-pref")).setTargetPreferredAuthSchemes((Collection) httpParams.getParameter("http.auth.target-scheme-pref")).setRedirectsEnabled(HttpClientParams.isRedirecting(httpParams)).setRelativeRedirectsAllowed(!httpParams.getBooleanParameter("http.protocol.reject-relative-redirect", false)).setSocketTimeout(a80.g.e(httpParams)).setStaleConnectionCheckEnabled(a80.g.h(httpParams)).build();
    }
}
