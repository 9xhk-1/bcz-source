package w2;

import com.badlogic.gdx.Net;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class h implements k {

    /* renamed from: a, reason: collision with root package name */
    public Socket f94718a;

    public h(Net.Protocol protocol, String str, int i11, l lVar) {
        try {
            this.f94718a = new Socket();
            b(lVar);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(str, i11);
            if (lVar != null) {
                this.f94718a.connect(inetSocketAddress, lVar.f94726a);
            } else {
                this.f94718a.connect(inetSocketAddress);
            }
        } catch (Exception e11) {
            throw new GdxRuntimeException("Error making a socket connection to " + str + ":" + i11, e11);
        }
    }

    public final void b(l lVar) {
        if (lVar != null) {
            try {
                this.f94718a.setPerformancePreferences(lVar.f94727b, lVar.f94728c, lVar.f94729d);
                this.f94718a.setTrafficClass(lVar.f94730e);
                this.f94718a.setTcpNoDelay(lVar.f94732g);
                this.f94718a.setKeepAlive(lVar.f94731f);
                this.f94718a.setSendBufferSize(lVar.f94733h);
                this.f94718a.setReceiveBufferSize(lVar.f94734i);
                this.f94718a.setSoLinger(lVar.f94735j, lVar.f94736k);
                this.f94718a.setSoTimeout(lVar.f94737l);
            } catch (Exception e11) {
                throw new GdxRuntimeException("Error setting socket hints.", e11);
            }
        }
    }

    @Override // a3.q
    public void dispose() {
        Socket socket = this.f94718a;
        if (socket != null) {
            try {
                socket.close();
                this.f94718a = null;
            } catch (Exception e11) {
                throw new GdxRuntimeException("Error closing socket.", e11);
            }
        }
    }

    @Override // w2.k
    public InputStream getInputStream() {
        try {
            return this.f94718a.getInputStream();
        } catch (Exception e11) {
            throw new GdxRuntimeException("Error getting input stream from socket.", e11);
        }
    }

    @Override // w2.k
    public OutputStream getOutputStream() {
        try {
            return this.f94718a.getOutputStream();
        } catch (Exception e11) {
            throw new GdxRuntimeException("Error getting output stream from socket.", e11);
        }
    }

    @Override // w2.k
    public boolean isConnected() {
        Socket socket = this.f94718a;
        if (socket != null) {
            return socket.isConnected();
        }
        return false;
    }

    @Override // w2.k
    public String l() {
        return this.f94718a.getRemoteSocketAddress().toString();
    }

    public h(Socket socket, l lVar) {
        this.f94718a = socket;
        b(lVar);
    }
}
