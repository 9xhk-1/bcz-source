package w2;

import com.badlogic.gdx.Net;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class g implements i {

    /* renamed from: a, reason: collision with root package name */
    public Net.Protocol f94716a;

    /* renamed from: b, reason: collision with root package name */
    public ServerSocket f94717b;

    public g(Net.Protocol protocol, int i11, j jVar) {
        this(protocol, null, i11, jVar);
    }

    @Override // w2.i
    public k E(l lVar) {
        try {
            return new h(this.f94717b.accept(), lVar);
        } catch (Exception e11) {
            throw new GdxRuntimeException("Error accepting socket.", e11);
        }
    }

    @Override // a3.q
    public void dispose() {
        ServerSocket serverSocket = this.f94717b;
        if (serverSocket != null) {
            try {
                serverSocket.close();
                this.f94717b = null;
            } catch (Exception e11) {
                throw new GdxRuntimeException("Error closing server.", e11);
            }
        }
    }

    @Override // w2.i
    public Net.Protocol getProtocol() {
        return this.f94716a;
    }

    public g(Net.Protocol protocol, String str, int i11, j jVar) {
        this.f94716a = protocol;
        try {
            ServerSocket serverSocket = new ServerSocket();
            this.f94717b = serverSocket;
            if (jVar != null) {
                serverSocket.setPerformancePreferences(jVar.f94720b, jVar.f94721c, jVar.f94722d);
                this.f94717b.setReuseAddress(jVar.f94723e);
                this.f94717b.setSoTimeout(jVar.f94724f);
                this.f94717b.setReceiveBufferSize(jVar.f94725g);
            }
            InetSocketAddress inetSocketAddress = str != null ? new InetSocketAddress(str, i11) : new InetSocketAddress(i11);
            if (jVar != null) {
                this.f94717b.bind(inetSocketAddress, jVar.f94719a);
            } else {
                this.f94717b.bind(inetSocketAddress);
            }
        } catch (Exception e11) {
            throw new GdxRuntimeException("Cannot create a server socket at port " + i11 + ".", e11);
        }
    }
}
