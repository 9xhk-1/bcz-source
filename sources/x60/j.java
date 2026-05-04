package x60;

import java.io.IOException;
import java.net.Socket;
import org.apache.http.params.HttpParams;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public class j extends q {
    @Override // x60.q
    public void H(Socket socket, HttpParams httpParams) throws IOException {
        e80.a.j(socket, "Socket");
        e80.a.j(httpParams, "HTTP parameters");
        E();
        socket.setTcpNoDelay(httpParams.getBooleanParameter(a80.b.f2292b, true));
        socket.setSoTimeout(httpParams.getIntParameter(a80.b.f2291a, 0));
        socket.setKeepAlive(httpParams.getBooleanParameter(a80.b.f2301k, false));
        int intParameter = httpParams.getIntParameter(a80.b.f2294d, -1);
        if (intParameter >= 0) {
            socket.setSoLinger(intParameter > 0, intParameter);
        }
        super.H(socket, httpParams);
    }
}
