package h70;

import java.net.SocketAddress;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import org.apache.http.params.HttpParams;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public interface p {
    void b(SSLEngine sSLEngine, HttpParams httpParams) throws SSLException;

    void c(SocketAddress socketAddress, SSLSession sSLSession) throws SSLException;
}
