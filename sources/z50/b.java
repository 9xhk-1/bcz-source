package z50;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<okhttp3.e> f100931a;

    /* renamed from: b, reason: collision with root package name */
    public int f100932b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f100933c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f100934d;

    public b(@k List<okhttp3.e> connectionSpecs) {
        g0.p(connectionSpecs, "connectionSpecs");
        this.f100931a = connectionSpecs;
    }

    @k
    public final okhttp3.e a(@k SSLSocket sslSocket) throws IOException {
        okhttp3.e eVar;
        g0.p(sslSocket, "sslSocket");
        int i11 = this.f100932b;
        int size = this.f100931a.size();
        while (true) {
            if (i11 >= size) {
                eVar = null;
                break;
            }
            eVar = this.f100931a.get(i11);
            if (eVar.h(sslSocket)) {
                this.f100932b = i11 + 1;
                break;
            }
            i11++;
        }
        if (eVar != null) {
            this.f100933c = c(sslSocket);
            eVar.f(sslSocket, this.f100934d);
            return eVar;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.f100934d);
        sb2.append(", modes=");
        sb2.append(this.f100931a);
        sb2.append(", supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        g0.m(enabledProtocols);
        String arrays = Arrays.toString(enabledProtocols);
        g0.o(arrays, "toString(this)");
        sb2.append(arrays);
        throw new UnknownServiceException(sb2.toString());
    }

    public final boolean b(@k IOException e11) {
        g0.p(e11, "e");
        this.f100934d = true;
        if (!this.f100933c || (e11 instanceof ProtocolException) || (e11 instanceof InterruptedIOException)) {
            return false;
        }
        return (((e11 instanceof SSLHandshakeException) && (e11.getCause() instanceof CertificateException)) || (e11 instanceof SSLPeerUnverifiedException) || !(e11 instanceof SSLException)) ? false : true;
    }

    public final boolean c(SSLSocket sSLSocket) {
        int size = this.f100931a.size();
        for (int i11 = this.f100932b; i11 < size; i11++) {
            if (this.f100931a.get(i11).h(sSLSocket)) {
                return true;
            }
        }
        return false;
    }
}
