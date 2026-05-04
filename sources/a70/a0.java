package a70;

import java.io.IOException;
import java.net.Socket;
import org.apache.http.params.HttpParams;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public class a0 extends c implements k70.b {

    /* renamed from: o, reason: collision with root package name */
    public final Socket f2192o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2193p;

    public a0(Socket socket, int i11, HttpParams httpParams) throws IOException {
        e80.a.j(socket, "Socket");
        this.f2192o = socket;
        this.f2193p = false;
        i11 = i11 < 0 ? socket.getReceiveBufferSize() : i11;
        j(socket.getInputStream(), i11 < 1024 ? 1024 : i11, httpParams);
    }

    @Override // k70.h
    public boolean b(int i11) throws IOException {
        boolean i12 = i();
        if (i12) {
            return i12;
        }
        int soTimeout = this.f2192o.getSoTimeout();
        try {
            this.f2192o.setSoTimeout(i11);
            g();
            return i();
        } finally {
            this.f2192o.setSoTimeout(soTimeout);
        }
    }

    @Override // k70.b
    public boolean c() {
        return this.f2193p;
    }

    @Override // a70.c
    public int g() throws IOException {
        int g11 = super.g();
        this.f2193p = g11 == -1;
        return g11;
    }
}
