package org.conscrypt;

import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import n6.m;
import pn.j;
import yz.c2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
final class SSLUtils {
    private static final String KEY_TYPE_EC = "EC";
    private static final String KEY_TYPE_RSA = "RSA";
    private static final int MAX_ENCRYPTION_OVERHEAD_DIFF = 2147483561;
    private static final int MAX_ENCRYPTION_OVERHEAD_LENGTH = 86;
    private static final int MAX_PROTOCOL_LENGTH = 255;
    static final boolean USE_ENGINE_SOCKET_BY_DEFAULT = Boolean.parseBoolean(System.getProperty("org.conscrypt.useEngineSocketByDefault", m.f74525c));
    private static final Charset US_ASCII = Charset.forName("US-ASCII");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class EngineStates {
        static final int STATE_CLOSED = 8;
        static final int STATE_CLOSED_INBOUND = 6;
        static final int STATE_CLOSED_OUTBOUND = 7;
        static final int STATE_HANDSHAKE_COMPLETED = 3;
        static final int STATE_HANDSHAKE_STARTED = 2;
        static final int STATE_MODE_SET = 1;
        static final int STATE_NEW = 0;
        static final int STATE_READY = 5;
        static final int STATE_READY_HANDSHAKE_CUT_THROUGH = 4;

        private EngineStates() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum SessionType {
        OPEN_SSL(1),
        OPEN_SSL_WITH_OCSP(2),
        OPEN_SSL_WITH_TLS_SCT(3);

        final int value;

        SessionType(int i11) {
            this.value = i11;
        }

        public static boolean isSupportedType(int i11) {
            return i11 == OPEN_SSL.value || i11 == OPEN_SSL_WITH_OCSP.value || i11 == OPEN_SSL_WITH_TLS_SCT.value;
        }
    }

    private SSLUtils() {
    }

    public static int calculateOutNetBufSize(int i11) {
        return Math.min(16709, Math.min(MAX_ENCRYPTION_OVERHEAD_DIFF, i11) + 86);
    }

    public static String[] concat(String[]... strArr) {
        int i11 = 0;
        for (String[] strArr2 : strArr) {
            i11 += strArr2.length;
        }
        String[] strArr3 = new String[i11];
        int i12 = 0;
        for (String[] strArr4 : strArr) {
            System.arraycopy(strArr4, 0, strArr3, i12, strArr4.length);
            i12 += strArr4.length;
        }
        return strArr3;
    }

    public static String[] decodeProtocols(byte[] bArr) {
        String str;
        if (bArr.length == 0) {
            return EmptyArray.STRING;
        }
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < bArr.length) {
            byte b11 = bArr[i12];
            if (b11 < 0 || b11 > bArr.length - i12) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Protocol has invalid length (");
                sb2.append((int) b11);
                sb2.append(" at position ");
                sb2.append(i12);
                sb2.append("): ");
                if (bArr.length < 50) {
                    str = Arrays.toString(bArr);
                } else {
                    str = bArr.length + " byte array";
                }
                sb2.append(str);
                throw new IllegalArgumentException(sb2.toString());
            }
            i13++;
            i12 += b11 + 1;
        }
        String[] strArr = new String[i13];
        int i14 = 0;
        while (i11 < bArr.length) {
            byte b12 = bArr[i11];
            int i15 = i14 + 1;
            strArr[i14] = b12 > 0 ? new String(bArr, i11 + 1, b12, US_ASCII) : "";
            i11 += b12 + 1;
            i14 = i15;
        }
        return strArr;
    }

    private static X509Certificate decodeX509Certificate(CertificateFactory certificateFactory, byte[] bArr) throws CertificateException {
        return certificateFactory != null ? (X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArr)) : OpenSSLX509Certificate.fromX509Der(bArr);
    }

    public static X509Certificate[] decodeX509CertificateChain(byte[][] bArr) throws CertificateException {
        CertificateFactory certificateFactory = getCertificateFactory();
        int length = bArr.length;
        X509Certificate[] x509CertificateArr = new X509Certificate[length];
        for (int i11 = 0; i11 < length; i11++) {
            x509CertificateArr[i11] = decodeX509Certificate(certificateFactory, bArr[i11]);
        }
        return x509CertificateArr;
    }

    public static byte[] encodeProtocols(String[] strArr) {
        if (strArr == null) {
            throw new IllegalArgumentException("protocols array must be non-null");
        }
        if (strArr.length == 0) {
            return EmptyArray.BYTE;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < strArr.length; i12++) {
            String str = strArr[i12];
            if (str == null) {
                throw new IllegalArgumentException("protocol[" + i12 + "] is null");
            }
            int length = str.length();
            if (length == 0 || length > 255) {
                throw new IllegalArgumentException("protocol[" + i12 + "] has invalid length: " + length);
            }
            i11 += length + 1;
        }
        byte[] bArr = new byte[i11];
        int i13 = 0;
        for (String str2 : strArr) {
            int length2 = str2.length();
            bArr[i13] = (byte) length2;
            i13++;
            int i14 = 0;
            while (i14 < length2) {
                char charAt = str2.charAt(i14);
                if (charAt > 127) {
                    throw new IllegalArgumentException("Protocol contains invalid character: " + charAt + "(protocol=" + str2 + j.f81007d);
                }
                bArr[i13] = (byte) charAt;
                i14++;
                i13++;
            }
        }
        return bArr;
    }

    public static byte[][] encodeSubjectX509Principals(X509Certificate[] x509CertificateArr) throws CertificateEncodingException {
        byte[][] bArr = new byte[x509CertificateArr.length][];
        for (int i11 = 0; i11 < x509CertificateArr.length; i11++) {
            bArr[i11] = x509CertificateArr[i11].getSubjectX500Principal().getEncoded();
        }
        return bArr;
    }

    private static CertificateFactory getCertificateFactory() {
        try {
            return CertificateFactory.getInstance("X.509");
        } catch (CertificateException unused) {
            return null;
        }
    }

    public static String getClientKeyType(byte b11) {
        if (b11 == 1) {
            return "RSA";
        }
        if (b11 != 64) {
            return null;
        }
        return KEY_TYPE_EC;
    }

    public static String getClientKeyTypeFromSignatureAlg(int i11) {
        int SSL_get_signature_algorithm_key_type = NativeCrypto.SSL_get_signature_algorithm_key_type(i11);
        if (SSL_get_signature_algorithm_key_type == 6) {
            return "RSA";
        }
        if (SSL_get_signature_algorithm_key_type != 408) {
            return null;
        }
        return KEY_TYPE_EC;
    }

    public static int getEncryptedPacketLength(ByteBuffer[] byteBufferArr, int i11) {
        ByteBuffer byteBuffer = byteBufferArr[i11];
        if (byteBuffer.remaining() >= 5) {
            return getEncryptedPacketLength(byteBuffer);
        }
        ByteBuffer allocate = ByteBuffer.allocate(5);
        while (true) {
            int i12 = i11 + 1;
            ByteBuffer byteBuffer2 = byteBufferArr[i11];
            int position = byteBuffer2.position();
            int limit = byteBuffer2.limit();
            if (byteBuffer2.remaining() > allocate.remaining()) {
                byteBuffer2.limit(allocate.remaining() + position);
            }
            try {
                allocate.put(byteBuffer2);
                byteBuffer2.limit(limit);
                byteBuffer2.position(position);
                if (!allocate.hasRemaining()) {
                    allocate.flip();
                    return getEncryptedPacketLength(allocate);
                }
                i11 = i12;
            } catch (Throwable th2) {
                byteBuffer2.limit(limit);
                byteBuffer2.position(position);
                throw th2;
            }
        }
    }

    public static String getServerX509KeyType(long j11) {
        String SSL_CIPHER_get_kx_name = NativeCrypto.SSL_CIPHER_get_kx_name(j11);
        if (SSL_CIPHER_get_kx_name.equals("RSA") || SSL_CIPHER_get_kx_name.equals("DHE_RSA") || SSL_CIPHER_get_kx_name.equals("ECDHE_RSA")) {
            return "RSA";
        }
        if (SSL_CIPHER_get_kx_name.equals("ECDHE_ECDSA")) {
            return KEY_TYPE_EC;
        }
        return null;
    }

    public static Set<String> getSupportedClientKeyTypes(byte[] bArr, int[] iArr) {
        HashSet hashSet = new HashSet(bArr.length);
        for (byte b11 : bArr) {
            String clientKeyType = getClientKeyType(b11);
            if (clientKeyType != null) {
                hashSet.add(clientKeyType);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(iArr.length);
        for (int i11 : iArr) {
            String clientKeyTypeFromSignatureAlg = getClientKeyTypeFromSignatureAlg(i11);
            if (clientKeyTypeFromSignatureAlg != null) {
                linkedHashSet.add(clientKeyTypeFromSignatureAlg);
            }
        }
        if (bArr.length <= 0 || iArr.length <= 0) {
            return iArr.length > 0 ? linkedHashSet : hashSet;
        }
        linkedHashSet.retainAll(hashSet);
        return linkedHashSet;
    }

    public static javax.security.cert.X509Certificate[] toCertificateChain(X509Certificate[] x509CertificateArr) throws SSLPeerUnverifiedException {
        try {
            javax.security.cert.X509Certificate[] x509CertificateArr2 = new javax.security.cert.X509Certificate[x509CertificateArr.length];
            for (int i11 = 0; i11 < x509CertificateArr.length; i11++) {
                x509CertificateArr2[i11] = javax.security.cert.X509Certificate.getInstance(x509CertificateArr[i11].getEncoded());
            }
            return x509CertificateArr2;
        } catch (CertificateEncodingException e11) {
            Throwable sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e11.getMessage());
            sSLPeerUnverifiedException.initCause(sSLPeerUnverifiedException);
            throw sSLPeerUnverifiedException;
        } catch (javax.security.cert.CertificateException e12) {
            Throwable sSLPeerUnverifiedException2 = new SSLPeerUnverifiedException(e12.getMessage());
            sSLPeerUnverifiedException2.initCause(sSLPeerUnverifiedException2);
            throw sSLPeerUnverifiedException2;
        }
    }

    public static byte[] toProtocolBytes(String str) {
        if (str == null) {
            return null;
        }
        return str.getBytes(US_ASCII);
    }

    public static String toProtocolString(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new String(bArr, US_ASCII);
    }

    public static SSLException toSSLException(Throwable th2) {
        return th2 instanceof SSLException ? (SSLException) th2 : new SSLException(th2);
    }

    public static SSLHandshakeException toSSLHandshakeException(Throwable th2) {
        return th2 instanceof SSLHandshakeException ? (SSLHandshakeException) th2 : (SSLHandshakeException) new SSLHandshakeException(th2.getMessage()).initCause(th2);
    }

    private static short unsignedByte(byte b11) {
        return (short) (b11 & 255);
    }

    private static int unsignedShort(short s11) {
        return s11 & c2.f100412d;
    }

    private static int getEncryptedPacketLength(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        switch (unsignedByte(byteBuffer.get(position))) {
            case 20:
            case 21:
            case 22:
            case 23:
                if (unsignedByte(byteBuffer.get(position + 1)) == 3 && (r4 = unsignedShort(byteBuffer.getShort(position + 3)) + 5) > 5) {
                }
                break;
        }
        return -1;
    }
}
