package org.conscrypt;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.List;
import java.util.function.BiFunction;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
final class Java8EngineSocket extends ConscryptEngineSocket {
    private BiFunction<SSLSocket, List<String>, String> selector;

    public Java8EngineSocket(SSLParametersImpl sSLParametersImpl) throws IOException {
        super(sSLParametersImpl);
    }

    private static ApplicationProtocolSelector toApplicationProtocolSelector(final BiFunction<SSLSocket, List<String>, String> biFunction) {
        if (biFunction == null) {
            return null;
        }
        return new ApplicationProtocolSelector() { // from class: org.conscrypt.Java8EngineSocket.1
            @Override // org.conscrypt.ApplicationProtocolSelector
            public String selectApplicationProtocol(SSLEngine sSLEngine, List<String> list) {
                throw new UnsupportedOperationException();
            }

            @Override // org.conscrypt.ApplicationProtocolSelector
            public String selectApplicationProtocol(SSLSocket sSLSocket, List<String> list) {
                return (String) biFunction.apply(sSLSocket, list);
            }
        };
    }

    @Override // javax.net.ssl.SSLSocket
    public BiFunction<SSLSocket, List<String>, String> getHandshakeApplicationProtocolSelector() {
        return this.selector;
    }

    @Override // javax.net.ssl.SSLSocket
    public void setHandshakeApplicationProtocolSelector(BiFunction<SSLSocket, List<String>, String> biFunction) {
        this.selector = biFunction;
        setApplicationProtocolSelector(toApplicationProtocolSelector(biFunction));
    }

    public Java8EngineSocket(String str, int i11, SSLParametersImpl sSLParametersImpl) throws IOException {
        super(str, i11, sSLParametersImpl);
    }

    public Java8EngineSocket(InetAddress inetAddress, int i11, SSLParametersImpl sSLParametersImpl) throws IOException {
        super(inetAddress, i11, sSLParametersImpl);
    }

    public Java8EngineSocket(String str, int i11, InetAddress inetAddress, int i12, SSLParametersImpl sSLParametersImpl) throws IOException {
        super(str, i11, inetAddress, i12, sSLParametersImpl);
    }

    public Java8EngineSocket(InetAddress inetAddress, int i11, InetAddress inetAddress2, int i12, SSLParametersImpl sSLParametersImpl) throws IOException {
        super(inetAddress, i11, inetAddress2, i12, sSLParametersImpl);
    }

    public Java8EngineSocket(Socket socket, String str, int i11, boolean z11, SSLParametersImpl sSLParametersImpl) throws IOException {
        super(socket, str, i11, z11, sSLParametersImpl);
    }
}
