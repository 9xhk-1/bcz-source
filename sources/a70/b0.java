package a70;

import java.io.IOException;
import java.net.Socket;
import org.apache.http.params.HttpParams;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public class b0 extends d {
    public b0(Socket socket, int i11, HttpParams httpParams) throws IOException {
        e80.a.j(socket, "Socket");
        i11 = i11 < 0 ? socket.getSendBufferSize() : i11;
        g(socket.getOutputStream(), i11 < 1024 ? 1024 : i11, httpParams);
    }
}
