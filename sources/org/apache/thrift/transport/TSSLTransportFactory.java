package org.apache.thrift.transport;

import java.net.InetAddress;
import java.util.Arrays;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManagerFactory;
import org.apache.thrift.transport.TServerSocket;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class TSSLTransportFactory {
    private static TSocket createClient(SSLSocketFactory sSLSocketFactory, String str, int i11, int i12) throws TTransportException {
        try {
            SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(str, i11);
            sSLSocket.setSoTimeout(i12);
            return new TSocket(sSLSocket);
        } catch (Exception e11) {
            throw new TTransportException("Could not connect to " + str + " on port " + i11, e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static javax.net.ssl.SSLContext createSSLContext(org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters r8) throws org.apache.thrift.transport.TTransportException {
        /*
            r0 = 0
            java.lang.String r1 = r8.protocol     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3c
            javax.net.ssl.SSLContext r1 = javax.net.ssl.SSLContext.getInstance(r1)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3c
            boolean r2 = r8.isTrustStoreSet     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3c
            if (r2 == 0) goto L40
            java.lang.String r2 = r8.trustManagerType     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3c
            javax.net.ssl.TrustManagerFactory r2 = javax.net.ssl.TrustManagerFactory.getInstance(r2)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3c
            java.lang.String r3 = r8.trustStoreType     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3c
            java.security.KeyStore r3 = java.security.KeyStore.getInstance(r3)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3c
            java.lang.String r4 = r8.trustStore     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3c
            java.io.InputStream r4 = getStoreAsStream(r4)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3c
            java.lang.String r5 = r8.trustPass     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2b
            if (r5 == 0) goto L30
            char[] r5 = r5.toCharArray()     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2b
            goto L31
        L26:
            r8 = move-exception
            r6 = r0
        L28:
            r0 = r4
            goto Lb4
        L2b:
            r8 = move-exception
            r6 = r0
        L2d:
            r0 = r4
            goto Lab
        L30:
            r5 = r0
        L31:
            r3.load(r4, r5)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2b
            r2.init(r3)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2b
            goto L42
        L38:
            r8 = move-exception
            r6 = r0
            goto Lb4
        L3c:
            r8 = move-exception
            r6 = r0
            goto Lab
        L40:
            r2 = r0
            r4 = r2
        L42:
            boolean r3 = r8.isKeyStoreSet     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2b
            if (r3 == 0) goto L6f
            java.lang.String r3 = r8.keyManagerType     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2b
            javax.net.ssl.KeyManagerFactory r3 = javax.net.ssl.KeyManagerFactory.getInstance(r3)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2b
            java.lang.String r5 = r8.keyStoreType     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2b
            java.security.KeyStore r5 = java.security.KeyStore.getInstance(r5)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2b
            java.lang.String r6 = r8.keyStore     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2b
            java.io.InputStream r6 = getStoreAsStream(r6)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L2b
            java.lang.String r7 = r8.keyPass     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            char[] r7 = r7.toCharArray()     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            r5.load(r6, r7)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            java.lang.String r7 = r8.keyPass     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            char[] r7 = r7.toCharArray()     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            r3.init(r5, r7)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            goto L71
        L6b:
            r8 = move-exception
            goto L28
        L6d:
            r8 = move-exception
            goto L2d
        L6f:
            r3 = r0
            r6 = r3
        L71:
            boolean r5 = r8.isKeyStoreSet     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            if (r5 == 0) goto L85
            boolean r8 = r8.isTrustStoreSet     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            if (r8 == 0) goto L85
            javax.net.ssl.KeyManager[] r8 = r3.getKeyManagers()     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            javax.net.ssl.TrustManager[] r2 = r2.getTrustManagers()     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            r1.init(r8, r2, r0)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            goto L96
        L85:
            if (r5 == 0) goto L8f
            javax.net.ssl.KeyManager[] r8 = r3.getKeyManagers()     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            r1.init(r8, r0, r0)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            goto L96
        L8f:
            javax.net.ssl.TrustManager[] r8 = r2.getTrustManagers()     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            r1.init(r0, r8, r0)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
        L96:
            if (r4 == 0) goto La0
            r4.close()     // Catch: java.io.IOException -> L9c
            goto La0
        L9c:
            r8 = move-exception
            r8.printStackTrace()
        La0:
            if (r6 == 0) goto Laa
            r6.close()     // Catch: java.io.IOException -> La6
            goto Laa
        La6:
            r8 = move-exception
            r8.printStackTrace()
        Laa:
            return r1
        Lab:
            org.apache.thrift.transport.TTransportException r1 = new org.apache.thrift.transport.TTransportException     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r2 = "Error creating the transport"
            r1.<init>(r2, r8)     // Catch: java.lang.Throwable -> Lb3
            throw r1     // Catch: java.lang.Throwable -> Lb3
        Lb3:
            r8 = move-exception
        Lb4:
            if (r0 == 0) goto Lbe
            r0.close()     // Catch: java.io.IOException -> Lba
            goto Lbe
        Lba:
            r0 = move-exception
            r0.printStackTrace()
        Lbe:
            if (r6 == 0) goto Lc8
            r6.close()     // Catch: java.io.IOException -> Lc4
            goto Lc8
        Lc4:
            r0 = move-exception
            r0.printStackTrace()
        Lc8:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.thrift.transport.TSSLTransportFactory.createSSLContext(org.apache.thrift.transport.TSSLTransportFactory$TSSLTransportParameters):javax.net.ssl.SSLContext");
    }

    private static TServerSocket createServer(SSLServerSocketFactory sSLServerSocketFactory, int i11, int i12, boolean z11, InetAddress inetAddress, TSSLTransportParameters tSSLTransportParameters) throws TTransportException {
        String[] strArr;
        try {
            SSLServerSocket sSLServerSocket = (SSLServerSocket) sSLServerSocketFactory.createServerSocket(i11, 100, inetAddress);
            sSLServerSocket.setSoTimeout(i12);
            sSLServerSocket.setNeedClientAuth(z11);
            if (tSSLTransportParameters != null && (strArr = tSSLTransportParameters.cipherSuites) != null) {
                sSLServerSocket.setEnabledCipherSuites(strArr);
            }
            return new TServerSocket(new TServerSocket.ServerSocketTransportArgs().serverSocket(sSLServerSocket).clientTimeout(i12));
        } catch (Exception e11) {
            throw new TTransportException("Could not bind to port " + i11, e11);
        }
    }

    public static TSocket getClientSocket(String str, int i11, int i12) throws TTransportException {
        return createClient((SSLSocketFactory) SSLSocketFactory.getDefault(), str, i11, i12);
    }

    public static TServerSocket getServerSocket(int i11) throws TTransportException {
        return getServerSocket(i11, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.io.InputStream getStoreAsStream(java.lang.String r3) throws java.io.IOException {
        /*
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L6
            r0.<init>(r3)     // Catch: java.io.FileNotFoundException -> L6
            return r0
        L6:
            java.net.URL r0 = new java.net.URL     // Catch: java.net.MalformedURLException -> L12
            r0.<init>(r3)     // Catch: java.net.MalformedURLException -> L12
            java.io.InputStream r0 = r0.openStream()     // Catch: java.net.MalformedURLException -> L12
            if (r0 == 0) goto L12
            return r0
        L12:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r0 = r0.getContextClassLoader()
            java.io.InputStream r0 = r0.getResourceAsStream(r3)
            if (r0 == 0) goto L21
            return r0
        L21:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Could not load file: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.thrift.transport.TSSLTransportFactory.getStoreAsStream(java.lang.String):java.io.InputStream");
    }

    public static TServerSocket getServerSocket(int i11, int i12) throws TTransportException {
        return getServerSocket(i11, i12, false, (InetAddress) null);
    }

    public static TSocket getClientSocket(String str, int i11) throws TTransportException {
        return getClientSocket(str, i11, 0);
    }

    public static TServerSocket getServerSocket(int i11, int i12, boolean z11, InetAddress inetAddress) throws TTransportException {
        return createServer((SSLServerSocketFactory) SSLServerSocketFactory.getDefault(), i11, i12, z11, inetAddress, null);
    }

    public static TSocket getClientSocket(String str, int i11, int i12, TSSLTransportParameters tSSLTransportParameters) throws TTransportException {
        if (tSSLTransportParameters != null && (tSSLTransportParameters.isKeyStoreSet || tSSLTransportParameters.isTrustStoreSet)) {
            return createClient(createSSLContext(tSSLTransportParameters).getSocketFactory(), str, i11, i12);
        }
        throw new TTransportException("Either one of the KeyStore or TrustStore must be set for SSLTransportParameters");
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TSSLTransportParameters {
        protected String[] cipherSuites;
        protected boolean clientAuth;
        protected boolean isKeyStoreSet;
        protected boolean isTrustStoreSet;
        protected String keyManagerType;
        protected String keyPass;
        protected String keyStore;
        protected String keyStoreType;
        protected String protocol;
        protected String trustManagerType;
        protected String trustPass;
        protected String trustStore;
        protected String trustStoreType;

        public TSSLTransportParameters() {
            this.protocol = "TLS";
            this.keyManagerType = KeyManagerFactory.getDefaultAlgorithm();
            this.keyStoreType = "JKS";
            this.trustManagerType = TrustManagerFactory.getDefaultAlgorithm();
            this.trustStoreType = "JKS";
            this.clientAuth = false;
            this.isKeyStoreSet = false;
            this.isTrustStoreSet = false;
        }

        public void requireClientAuth(boolean z11) {
            this.clientAuth = z11;
        }

        public void setKeyStore(String str, String str2, String str3, String str4) {
            this.keyStore = str;
            this.keyPass = str2;
            if (str3 != null) {
                this.keyManagerType = str3;
            }
            if (str4 != null) {
                this.keyStoreType = str4;
            }
            this.isKeyStoreSet = true;
        }

        public void setTrustStore(String str, String str2, String str3, String str4) {
            this.trustStore = str;
            this.trustPass = str2;
            if (str3 != null) {
                this.trustManagerType = str3;
            }
            if (str4 != null) {
                this.trustStoreType = str4;
            }
            this.isTrustStoreSet = true;
        }

        public void setKeyStore(String str, String str2) {
            setKeyStore(str, str2, null, null);
        }

        public void setTrustStore(String str, String str2) {
            setTrustStore(str, str2, null, null);
        }

        public TSSLTransportParameters(String str, String[] strArr) {
            this(str, strArr, false);
        }

        public TSSLTransportParameters(String str, String[] strArr, boolean z11) {
            this.protocol = "TLS";
            this.keyManagerType = KeyManagerFactory.getDefaultAlgorithm();
            this.keyStoreType = "JKS";
            this.trustManagerType = TrustManagerFactory.getDefaultAlgorithm();
            this.trustStoreType = "JKS";
            this.clientAuth = false;
            this.isKeyStoreSet = false;
            this.isTrustStoreSet = false;
            if (str != null) {
                this.protocol = str;
            }
            this.cipherSuites = (String[]) Arrays.copyOf(strArr, strArr.length);
            this.clientAuth = z11;
        }
    }

    public static TServerSocket getServerSocket(int i11, int i12, InetAddress inetAddress, TSSLTransportParameters tSSLTransportParameters) throws TTransportException {
        if (tSSLTransportParameters != null && (tSSLTransportParameters.isKeyStoreSet || tSSLTransportParameters.isTrustStoreSet)) {
            return createServer(createSSLContext(tSSLTransportParameters).getServerSocketFactory(), i11, i12, tSSLTransportParameters.clientAuth, inetAddress, tSSLTransportParameters);
        }
        throw new TTransportException("Either one of the KeyStore or TrustStore must be set for SSLTransportParameters");
    }
}
