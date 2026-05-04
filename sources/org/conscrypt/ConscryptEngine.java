package org.conscrypt;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECKey;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;
import javax.crypto.SecretKey;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.X509ExtendedKeyManager;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;
import org.conscrypt.ExternalSession;
import org.conscrypt.NativeCrypto;
import org.conscrypt.NativeRef;
import org.conscrypt.NativeSsl;
import org.conscrypt.SSLParametersImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
final class ConscryptEngine extends AbstractConscryptEngine implements NativeCrypto.SSLHandshakeCallbacks, SSLParametersImpl.AliasChooser, SSLParametersImpl.PSKCallbacks {
    private static final SSLEngineResult CLOSED_NOT_HANDSHAKING;
    private static final SSLEngineResult NEED_UNWRAP_CLOSED;
    private static final SSLEngineResult NEED_UNWRAP_OK;
    private static final SSLEngineResult NEED_WRAP_CLOSED;
    private static final SSLEngineResult NEED_WRAP_OK;
    private static BufferAllocator defaultBufferAllocator;
    private ActiveSession activeSession;
    private BufferAllocator bufferAllocator;
    private OpenSSLKey channelIdPrivateKey;
    private SessionSnapshot closedSession;
    private final SSLSession externalSession;
    private boolean handshakeFinished;
    private HandshakeListener handshakeListener;
    private ByteBuffer lazyDirectBuffer;
    private int maxSealOverhead;
    private final NativeSsl.BioWrapper networkBio;
    private String peerHostname;
    private final PeerInfoProvider peerInfoProvider;
    private final ByteBuffer[] singleDstBuffer;
    private final ByteBuffer[] singleSrcBuffer;
    private final NativeSsl ssl;
    private final SSLParametersImpl sslParameters;
    private int state;

    static {
        SSLEngineResult.Status status = SSLEngineResult.Status.OK;
        SSLEngineResult.HandshakeStatus handshakeStatus = SSLEngineResult.HandshakeStatus.NEED_UNWRAP;
        NEED_UNWRAP_OK = new SSLEngineResult(status, handshakeStatus, 0, 0);
        SSLEngineResult.Status status2 = SSLEngineResult.Status.CLOSED;
        NEED_UNWRAP_CLOSED = new SSLEngineResult(status2, handshakeStatus, 0, 0);
        SSLEngineResult.HandshakeStatus handshakeStatus2 = SSLEngineResult.HandshakeStatus.NEED_WRAP;
        NEED_WRAP_OK = new SSLEngineResult(status, handshakeStatus2, 0, 0);
        NEED_WRAP_CLOSED = new SSLEngineResult(status2, handshakeStatus2, 0, 0);
        CLOSED_NOT_HANDSHAKING = new SSLEngineResult(status2, SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING, 0, 0);
        defaultBufferAllocator = null;
    }

    public ConscryptEngine(SSLParametersImpl sSLParametersImpl) {
        this.bufferAllocator = defaultBufferAllocator;
        this.state = 0;
        this.externalSession = Platform.wrapSSLSession(new ExternalSession(new ExternalSession.Provider() { // from class: org.conscrypt.ConscryptEngine.1
            @Override // org.conscrypt.ExternalSession.Provider
            public ConscryptSession provideSession() {
                return ConscryptEngine.this.provideSession();
            }
        }));
        this.singleSrcBuffer = new ByteBuffer[1];
        this.singleDstBuffer = new ByteBuffer[1];
        this.sslParameters = sSLParametersImpl;
        this.peerInfoProvider = PeerInfoProvider.nullProvider();
        NativeSsl newSsl = newSsl(sSLParametersImpl, this, this);
        this.ssl = newSsl;
        this.networkBio = newSsl.newBio();
    }

    private void beginHandshakeInternal() throws SSLException {
        NativeSslSession cachedSession;
        int i11 = this.state;
        if (i11 == 0) {
            throw new IllegalStateException("Client/server mode must be set before handshake");
        }
        if (i11 != 1) {
            if (i11 == 6 || i11 == 7 || i11 == 8) {
                throw new SSLHandshakeException("Engine has already been closed");
            }
            return;
        }
        transitionTo(2);
        try {
            try {
                this.ssl.initialize(getHostname(), this.channelIdPrivateKey);
                if (getUseClientMode() && (cachedSession = clientSessionContext().getCachedSession(getHostname(), getPeerPort(), this.sslParameters)) != null) {
                    cachedSession.offerToResume(this.ssl);
                }
                this.maxSealOverhead = this.ssl.getMaxSealOverhead();
                handshake();
            } catch (IOException e11) {
                if (e11.getMessage().contains("unexpected CCS")) {
                    Platform.logEvent(String.format("ssl_unexpected_ccs: host=%s", getPeerHost()));
                }
                closeAll();
                throw SSLUtils.toSSLHandshakeException(e11);
            }
        } catch (Throwable th2) {
            closeAndFreeResources();
            throw th2;
        }
    }

    private static int calcDstsLength(ByteBuffer[] byteBufferArr, int i11, int i12) {
        int i13 = 0;
        for (int i14 = 0; i14 < byteBufferArr.length; i14++) {
            ByteBuffer byteBuffer = byteBufferArr[i14];
            Preconditions.checkArgument(byteBuffer != null, "dsts[%d] is null", Integer.valueOf(i14));
            if (byteBuffer.isReadOnly()) {
                throw new ReadOnlyBufferException();
            }
            if (i14 >= i11 && i14 < i11 + i12) {
                i13 += byteBuffer.remaining();
            }
        }
        return i13;
    }

    private static long calcSrcsLength(ByteBuffer[] byteBufferArr, int i11, int i12) {
        long j11 = 0;
        while (i11 < i12) {
            if (byteBufferArr[i11] == null) {
                throw new IllegalArgumentException("srcs[" + i11 + "] is null");
            }
            j11 += r2.remaining();
            i11++;
        }
        return j11;
    }

    private ClientSessionContext clientSessionContext() {
        return this.sslParameters.getClientSessionContext();
    }

    private void closeAll() {
        closeOutbound();
        closeInbound();
    }

    private void closeAndFreeResources() {
        transitionTo(8);
        NativeSsl nativeSsl = this.ssl;
        if (nativeSsl != null) {
            nativeSsl.close();
        }
        NativeSsl.BioWrapper bioWrapper = this.networkBio;
        if (bioWrapper != null) {
            bioWrapper.close();
        }
    }

    private SSLException convertException(Throwable th2) {
        return ((th2 instanceof SSLHandshakeException) || !this.handshakeFinished) ? SSLUtils.toSSLHandshakeException(th2) : SSLUtils.toSSLException(th2);
    }

    private long directByteBufferAddress(ByteBuffer byteBuffer, int i11) {
        return NativeCrypto.getDirectBufferAddress(byteBuffer) + i11;
    }

    private void finishHandshake() throws SSLException {
        this.handshakeFinished = true;
        HandshakeListener handshakeListener = this.handshakeListener;
        if (handshakeListener != null) {
            handshakeListener.onHandshakeFinished();
        }
    }

    private void freeIfDone() {
        if (isInboundDone() && isOutboundDone()) {
            closeAndFreeResources();
        }
    }

    public static BufferAllocator getDefaultBufferAllocator() {
        return defaultBufferAllocator;
    }

    private SSLEngineResult.Status getEngineStatus() {
        int i11 = this.state;
        return (i11 == 6 || i11 == 7 || i11 == 8) ? SSLEngineResult.Status.CLOSED : SSLEngineResult.Status.OK;
    }

    private SSLEngineResult.HandshakeStatus getHandshakeStatusInternal() {
        if (this.handshakeFinished) {
            return SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
        }
        switch (this.state) {
            case 0:
            case 1:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
            case 2:
                return pendingStatus(pendingOutboundEncryptedBytes());
            case 3:
                return SSLEngineResult.HandshakeStatus.NEED_WRAP;
            default:
                throw new IllegalStateException("Unexpected engine state: " + this.state);
        }
    }

    private ByteBuffer getOrCreateLazyDirectBuffer() {
        if (this.lazyDirectBuffer == null) {
            this.lazyDirectBuffer = ByteBuffer.allocateDirect(Math.max(16384, 16709));
        }
        this.lazyDirectBuffer.clear();
        return this.lazyDirectBuffer;
    }

    private SSLEngineResult.HandshakeStatus handshake() throws SSLException {
        try {
            try {
                int doHandshake = this.ssl.doHandshake();
                if (doHandshake == 2) {
                    return pendingStatus(pendingOutboundEncryptedBytes());
                }
                if (doHandshake == 3) {
                    return SSLEngineResult.HandshakeStatus.NEED_WRAP;
                }
                this.activeSession.onPeerCertificateAvailable(getPeerHost(), getPeerPort());
                finishHandshake();
                return SSLEngineResult.HandshakeStatus.FINISHED;
            } catch (IOException e11) {
                closeAll();
                throw e11;
            }
        } catch (Exception e12) {
            throw SSLUtils.toSSLHandshakeException(e12);
        }
    }

    private boolean isHandshakeStarted() {
        int i11 = this.state;
        return (i11 == 0 || i11 == 1) ? false : true;
    }

    private SSLEngineResult.HandshakeStatus mayFinishHandshake(SSLEngineResult.HandshakeStatus handshakeStatus) throws SSLException {
        return (this.handshakeFinished || handshakeStatus != SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING) ? handshakeStatus : handshake();
    }

    private SSLEngineResult newResult(int i11, int i12, SSLEngineResult.HandshakeStatus handshakeStatus) throws SSLException {
        SSLEngineResult.Status engineStatus = getEngineStatus();
        if (handshakeStatus != SSLEngineResult.HandshakeStatus.FINISHED) {
            handshakeStatus = getHandshakeStatusInternal();
        }
        return new SSLEngineResult(engineStatus, mayFinishHandshake(handshakeStatus), i11, i12);
    }

    private static NativeSsl newSsl(SSLParametersImpl sSLParametersImpl, ConscryptEngine conscryptEngine, SSLParametersImpl.AliasChooser aliasChooser) {
        try {
            return NativeSsl.newInstance(sSLParametersImpl, conscryptEngine, aliasChooser, conscryptEngine);
        } catch (SSLException e11) {
            throw new RuntimeException(e11);
        }
    }

    private SSLException newSslExceptionWithMessage(String str) {
        return !this.handshakeFinished ? new SSLException(str) : new SSLHandshakeException(str);
    }

    private int pendingInboundCleartextBytes() {
        return this.ssl.getPendingReadableBytes();
    }

    private static SSLEngineResult.HandshakeStatus pendingStatus(int i11) {
        return i11 > 0 ? SSLEngineResult.HandshakeStatus.NEED_WRAP : SSLEngineResult.HandshakeStatus.NEED_UNWRAP;
    }

    private ConscryptSession provideAfterHandshakeSession() {
        return this.state < 2 ? SSLNullSession.getNullSession() : provideSession();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ConscryptSession provideHandshakeSession() {
        ConscryptSession nullSession;
        synchronized (this.ssl) {
            try {
                nullSession = this.state == 2 ? this.activeSession : SSLNullSession.getNullSession();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nullSession;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ConscryptSession provideSession() {
        synchronized (this.ssl) {
            try {
                int i11 = this.state;
                if (i11 == 8) {
                    ConscryptSession conscryptSession = this.closedSession;
                    if (conscryptSession == null) {
                        conscryptSession = SSLNullSession.getNullSession();
                    }
                    return conscryptSession;
                }
                if (i11 < 3) {
                    return SSLNullSession.getNullSession();
                }
                return this.activeSession;
            } finally {
            }
        }
    }

    private int readEncryptedData(ByteBuffer byteBuffer, int i11) throws SSLException {
        try {
            int position = byteBuffer.position();
            if (byteBuffer.remaining() < i11) {
                return 0;
            }
            int min = Math.min(i11, byteBuffer.limit() - position);
            if (!byteBuffer.isDirect()) {
                return readEncryptedDataHeap(byteBuffer, min);
            }
            int readEncryptedDataDirect = readEncryptedDataDirect(byteBuffer, position, min);
            if (readEncryptedDataDirect <= 0) {
                return readEncryptedDataDirect;
            }
            byteBuffer.position(position + readEncryptedDataDirect);
            return readEncryptedDataDirect;
        } catch (Exception e11) {
            throw convertException(e11);
        }
    }

    private int readEncryptedDataDirect(ByteBuffer byteBuffer, int i11, int i12) throws IOException {
        return this.networkBio.readDirectByteBuffer(directByteBufferAddress(byteBuffer, i11), i12);
    }

    private int readEncryptedDataHeap(ByteBuffer byteBuffer, int i11) throws IOException {
        ByteBuffer orCreateLazyDirectBuffer;
        AllocatedBuffer allocatedBuffer = null;
        try {
            BufferAllocator bufferAllocator = this.bufferAllocator;
            if (bufferAllocator != null) {
                allocatedBuffer = bufferAllocator.allocateDirectBuffer(i11);
                orCreateLazyDirectBuffer = allocatedBuffer.nioBuffer();
            } else {
                orCreateLazyDirectBuffer = getOrCreateLazyDirectBuffer();
            }
            int readEncryptedDataDirect = readEncryptedDataDirect(orCreateLazyDirectBuffer, 0, Math.min(i11, orCreateLazyDirectBuffer.remaining()));
            if (readEncryptedDataDirect > 0) {
                orCreateLazyDirectBuffer.position(readEncryptedDataDirect);
                orCreateLazyDirectBuffer.flip();
                byteBuffer.put(orCreateLazyDirectBuffer);
            }
            if (allocatedBuffer != null) {
                allocatedBuffer.release();
            }
            return readEncryptedDataDirect;
        } catch (Throwable th2) {
            if (allocatedBuffer != null) {
                allocatedBuffer.release();
            }
            throw th2;
        }
    }

    private SSLEngineResult readPendingBytesFromBIO(ByteBuffer byteBuffer, int i11, int i12, SSLEngineResult.HandshakeStatus handshakeStatus) throws SSLException {
        try {
            int pendingOutboundEncryptedBytes = pendingOutboundEncryptedBytes();
            if (pendingOutboundEncryptedBytes <= 0) {
                return null;
            }
            if (byteBuffer.remaining() < pendingOutboundEncryptedBytes) {
                SSLEngineResult.Status status = SSLEngineResult.Status.BUFFER_OVERFLOW;
                if (handshakeStatus != SSLEngineResult.HandshakeStatus.FINISHED) {
                    handshakeStatus = getHandshakeStatus(pendingOutboundEncryptedBytes);
                }
                return new SSLEngineResult(status, mayFinishHandshake(handshakeStatus), i11, i12);
            }
            int readEncryptedData = readEncryptedData(byteBuffer, pendingOutboundEncryptedBytes);
            if (readEncryptedData <= 0) {
                NativeCrypto.SSL_clear_error();
            } else {
                i12 += readEncryptedData;
                pendingOutboundEncryptedBytes -= readEncryptedData;
            }
            SSLEngineResult.Status engineStatus = getEngineStatus();
            if (handshakeStatus != SSLEngineResult.HandshakeStatus.FINISHED) {
                handshakeStatus = getHandshakeStatus(pendingOutboundEncryptedBytes);
            }
            return new SSLEngineResult(engineStatus, mayFinishHandshake(handshakeStatus), i11, i12);
        } catch (Exception e11) {
            throw convertException(e11);
        }
    }

    private int readPlaintextData(ByteBuffer byteBuffer) throws IOException {
        try {
            int position = byteBuffer.position();
            int min = Math.min(16709, byteBuffer.limit() - position);
            if (!byteBuffer.isDirect()) {
                return readPlaintextDataHeap(byteBuffer, min);
            }
            int readPlaintextDataDirect = readPlaintextDataDirect(byteBuffer, position, min);
            if (readPlaintextDataDirect <= 0) {
                return readPlaintextDataDirect;
            }
            byteBuffer.position(position + readPlaintextDataDirect);
            return readPlaintextDataDirect;
        } catch (CertificateException e11) {
            throw convertException(e11);
        }
    }

    private int readPlaintextDataDirect(ByteBuffer byteBuffer, int i11, int i12) throws IOException, CertificateException {
        return this.ssl.readDirectByteBuffer(directByteBufferAddress(byteBuffer, i11), i12);
    }

    private int readPlaintextDataHeap(ByteBuffer byteBuffer, int i11) throws IOException, CertificateException {
        ByteBuffer orCreateLazyDirectBuffer;
        AllocatedBuffer allocatedBuffer = null;
        try {
            BufferAllocator bufferAllocator = this.bufferAllocator;
            if (bufferAllocator != null) {
                allocatedBuffer = bufferAllocator.allocateDirectBuffer(i11);
                orCreateLazyDirectBuffer = allocatedBuffer.nioBuffer();
            } else {
                orCreateLazyDirectBuffer = getOrCreateLazyDirectBuffer();
            }
            int readPlaintextDataDirect = readPlaintextDataDirect(orCreateLazyDirectBuffer, 0, Math.min(i11, orCreateLazyDirectBuffer.remaining()));
            if (readPlaintextDataDirect > 0) {
                orCreateLazyDirectBuffer.position(readPlaintextDataDirect);
                orCreateLazyDirectBuffer.flip();
                byteBuffer.put(orCreateLazyDirectBuffer);
            }
            if (allocatedBuffer != null) {
                allocatedBuffer.release();
            }
            return readPlaintextDataDirect;
        } catch (Throwable th2) {
            if (allocatedBuffer != null) {
                allocatedBuffer.release();
            }
            throw th2;
        }
    }

    private void resetSingleDstBuffer() {
        this.singleDstBuffer[0] = null;
    }

    private void resetSingleSrcBuffer() {
        this.singleSrcBuffer[0] = null;
    }

    private void sendSSLShutdown() {
        try {
            this.ssl.shutdown();
        } catch (IOException unused) {
        }
    }

    private AbstractSessionContext sessionContext() {
        return this.sslParameters.getSessionContext();
    }

    public static void setDefaultBufferAllocator(BufferAllocator bufferAllocator) {
        defaultBufferAllocator = bufferAllocator;
    }

    private ByteBuffer[] singleDstBuffer(ByteBuffer byteBuffer) {
        ByteBuffer[] byteBufferArr = this.singleDstBuffer;
        byteBufferArr[0] = byteBuffer;
        return byteBufferArr;
    }

    private ByteBuffer[] singleSrcBuffer(ByteBuffer byteBuffer) {
        ByteBuffer[] byteBufferArr = this.singleSrcBuffer;
        byteBufferArr[0] = byteBuffer;
        return byteBufferArr;
    }

    private void transitionTo(int i11) {
        int i12;
        if (i11 == 2) {
            this.handshakeFinished = false;
            this.activeSession = new ActiveSession(this.ssl, this.sslParameters.getSessionContext());
        } else if (i11 == 8 && !this.ssl.isClosed() && (i12 = this.state) >= 2 && i12 < 8) {
            this.closedSession = new SessionSnapshot(this.activeSession);
        }
        this.state = i11;
    }

    private int writeEncryptedData(ByteBuffer byteBuffer, int i11) throws SSLException {
        try {
            int position = byteBuffer.position();
            int writeEncryptedDataDirect = byteBuffer.isDirect() ? writeEncryptedDataDirect(byteBuffer, position, i11) : writeEncryptedDataHeap(byteBuffer, position, i11);
            if (writeEncryptedDataDirect > 0) {
                byteBuffer.position(position + writeEncryptedDataDirect);
            }
            return writeEncryptedDataDirect;
        } catch (IOException e11) {
            closeAll();
            throw new SSLException(e11);
        }
    }

    private int writeEncryptedDataDirect(ByteBuffer byteBuffer, int i11, int i12) throws IOException {
        return this.networkBio.writeDirectByteBuffer(directByteBufferAddress(byteBuffer, i11), i12);
    }

    private int writeEncryptedDataHeap(ByteBuffer byteBuffer, int i11, int i12) throws IOException {
        ByteBuffer orCreateLazyDirectBuffer;
        AllocatedBuffer allocatedBuffer = null;
        try {
            BufferAllocator bufferAllocator = this.bufferAllocator;
            if (bufferAllocator != null) {
                allocatedBuffer = bufferAllocator.allocateDirectBuffer(i12);
                orCreateLazyDirectBuffer = allocatedBuffer.nioBuffer();
            } else {
                orCreateLazyDirectBuffer = getOrCreateLazyDirectBuffer();
            }
            int limit = byteBuffer.limit();
            int min = Math.min(Math.min(limit - i11, i12), orCreateLazyDirectBuffer.remaining());
            byteBuffer.limit(i11 + min);
            orCreateLazyDirectBuffer.put(byteBuffer);
            byteBuffer.limit(limit);
            byteBuffer.position(i11);
            int writeEncryptedDataDirect = writeEncryptedDataDirect(orCreateLazyDirectBuffer, 0, min);
            byteBuffer.position(i11);
            if (allocatedBuffer != null) {
                allocatedBuffer.release();
            }
            return writeEncryptedDataDirect;
        } catch (Throwable th2) {
            if (allocatedBuffer != null) {
                allocatedBuffer.release();
            }
            throw th2;
        }
    }

    private int writePlaintextData(ByteBuffer byteBuffer, int i11) throws SSLException {
        try {
            int position = byteBuffer.position();
            int writePlaintextDataDirect = byteBuffer.isDirect() ? writePlaintextDataDirect(byteBuffer, position, i11) : writePlaintextDataHeap(byteBuffer, position, i11);
            if (writePlaintextDataDirect > 0) {
                byteBuffer.position(position + writePlaintextDataDirect);
            }
            return writePlaintextDataDirect;
        } catch (Exception e11) {
            throw convertException(e11);
        }
    }

    private int writePlaintextDataDirect(ByteBuffer byteBuffer, int i11, int i12) throws IOException {
        return this.ssl.writeDirectByteBuffer(directByteBufferAddress(byteBuffer, i11), i12);
    }

    private int writePlaintextDataHeap(ByteBuffer byteBuffer, int i11, int i12) throws IOException {
        ByteBuffer orCreateLazyDirectBuffer;
        AllocatedBuffer allocatedBuffer = null;
        try {
            BufferAllocator bufferAllocator = this.bufferAllocator;
            if (bufferAllocator != null) {
                allocatedBuffer = bufferAllocator.allocateDirectBuffer(i12);
                orCreateLazyDirectBuffer = allocatedBuffer.nioBuffer();
            } else {
                orCreateLazyDirectBuffer = getOrCreateLazyDirectBuffer();
            }
            int limit = byteBuffer.limit();
            int min = Math.min(i12, orCreateLazyDirectBuffer.remaining());
            byteBuffer.limit(i11 + min);
            orCreateLazyDirectBuffer.put(byteBuffer);
            orCreateLazyDirectBuffer.flip();
            byteBuffer.limit(limit);
            byteBuffer.position(i11);
            int writePlaintextDataDirect = writePlaintextDataDirect(orCreateLazyDirectBuffer, 0, min);
            if (allocatedBuffer != null) {
                allocatedBuffer.release();
            }
            return writePlaintextDataDirect;
        } catch (Throwable th2) {
            if (allocatedBuffer != null) {
                allocatedBuffer.release();
            }
            throw th2;
        }
    }

    @Override // javax.net.ssl.SSLEngine
    public void beginHandshake() throws SSLException {
        synchronized (this.ssl) {
            beginHandshakeInternal();
        }
    }

    @Override // org.conscrypt.SSLParametersImpl.AliasChooser
    public String chooseClientAlias(X509KeyManager x509KeyManager, X500Principal[] x500PrincipalArr, String[] strArr) {
        return x509KeyManager instanceof X509ExtendedKeyManager ? ((X509ExtendedKeyManager) x509KeyManager).chooseEngineClientAlias(strArr, x500PrincipalArr, this) : x509KeyManager.chooseClientAlias(strArr, x500PrincipalArr, null);
    }

    @Override // org.conscrypt.SSLParametersImpl.PSKCallbacks
    public String chooseClientPSKIdentity(PSKKeyManager pSKKeyManager, String str) {
        return pSKKeyManager.chooseClientKeyIdentity(str, this);
    }

    @Override // org.conscrypt.SSLParametersImpl.AliasChooser
    public String chooseServerAlias(X509KeyManager x509KeyManager, String str) {
        return x509KeyManager instanceof X509ExtendedKeyManager ? ((X509ExtendedKeyManager) x509KeyManager).chooseEngineServerAlias(str, null, this) : x509KeyManager.chooseServerAlias(str, null, null);
    }

    @Override // org.conscrypt.SSLParametersImpl.PSKCallbacks
    public String chooseServerPSKIdentityHint(PSKKeyManager pSKKeyManager) {
        return pSKKeyManager.chooseServerKeyIdentityHint(this);
    }

    @Override // org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public void clientCertificateRequested(byte[] bArr, int[] iArr, byte[][] bArr2) throws CertificateEncodingException, SSLException {
        this.ssl.chooseClientCertificate(bArr, iArr, bArr2);
    }

    @Override // org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public int clientPSKKeyRequested(String str, byte[] bArr, byte[] bArr2) {
        return this.ssl.clientPSKKeyRequested(str, bArr, bArr2);
    }

    @Override // javax.net.ssl.SSLEngine
    public void closeInbound() {
        synchronized (this.ssl) {
            try {
                int i11 = this.state;
                if (i11 != 8 && i11 != 6) {
                    if (isHandshakeStarted()) {
                        if (this.state == 7) {
                            transitionTo(8);
                        } else {
                            transitionTo(6);
                        }
                        freeIfDone();
                    } else {
                        closeAndFreeResources();
                    }
                }
            } finally {
            }
        }
    }

    @Override // javax.net.ssl.SSLEngine
    public void closeOutbound() {
        synchronized (this.ssl) {
            try {
                int i11 = this.state;
                if (i11 != 8 && i11 != 7) {
                    if (isHandshakeStarted()) {
                        if (this.state == 6) {
                            transitionTo(8);
                        } else {
                            transitionTo(7);
                        }
                        sendSSLShutdown();
                        freeIfDone();
                    } else {
                        closeAndFreeResources();
                    }
                }
            } finally {
            }
        }
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    public byte[] exportKeyingMaterial(String str, byte[] bArr, int i11) throws SSLException {
        synchronized (this.ssl) {
            int i12 = this.state;
            if (i12 >= 3 && i12 != 8) {
                return this.ssl.exportKeyingMaterial(str, bArr, i11);
            }
            return null;
        }
    }

    public void finalize() throws Throwable {
        try {
            closeAndFreeResources();
        } finally {
            super.finalize();
        }
    }

    @Override // org.conscrypt.AbstractConscryptEngine, javax.net.ssl.SSLEngine
    public String getApplicationProtocol() {
        return provideAfterHandshakeSession().getApplicationProtocol();
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    public String[] getApplicationProtocols() {
        return this.sslParameters.getApplicationProtocols();
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    public byte[] getChannelId() throws SSLException {
        byte[] tlsChannelId;
        synchronized (this.ssl) {
            try {
                if (getUseClientMode()) {
                    throw new IllegalStateException("Not allowed in client mode");
                }
                if (isHandshakeStarted()) {
                    throw new IllegalStateException("Channel ID is only available after handshake completes");
                }
                tlsChannelId = this.ssl.getTlsChannelId();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tlsChannelId;
    }

    @Override // javax.net.ssl.SSLEngine
    public Runnable getDelegatedTask() {
        return null;
    }

    @Override // javax.net.ssl.SSLEngine
    public boolean getEnableSessionCreation() {
        return this.sslParameters.getEnableSessionCreation();
    }

    @Override // javax.net.ssl.SSLEngine
    public String[] getEnabledCipherSuites() {
        return this.sslParameters.getEnabledCipherSuites();
    }

    @Override // javax.net.ssl.SSLEngine
    public String[] getEnabledProtocols() {
        return this.sslParameters.getEnabledProtocols();
    }

    @Override // org.conscrypt.AbstractConscryptEngine, javax.net.ssl.SSLEngine
    public String getHandshakeApplicationProtocol() {
        String applicationProtocol;
        synchronized (this.ssl) {
            try {
                applicationProtocol = this.state >= 2 ? getApplicationProtocol() : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return applicationProtocol;
    }

    @Override // javax.net.ssl.SSLEngine
    public SSLEngineResult.HandshakeStatus getHandshakeStatus() {
        SSLEngineResult.HandshakeStatus handshakeStatusInternal;
        synchronized (this.ssl) {
            handshakeStatusInternal = getHandshakeStatusInternal();
        }
        return handshakeStatusInternal;
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    public String getHostname() {
        String str = this.peerHostname;
        return str != null ? str : this.peerInfoProvider.getHostname();
    }

    @Override // javax.net.ssl.SSLEngine
    public boolean getNeedClientAuth() {
        return this.sslParameters.getNeedClientAuth();
    }

    @Override // org.conscrypt.SSLParametersImpl.PSKCallbacks
    public SecretKey getPSKKey(PSKKeyManager pSKKeyManager, String str, String str2) {
        return pSKKeyManager.getKey(str, str2, this);
    }

    @Override // org.conscrypt.AbstractConscryptEngine, javax.net.ssl.SSLEngine
    public String getPeerHost() {
        String str = this.peerHostname;
        return str != null ? str : this.peerInfoProvider.getHostnameOrIP();
    }

    @Override // org.conscrypt.AbstractConscryptEngine, javax.net.ssl.SSLEngine
    public int getPeerPort() {
        return this.peerInfoProvider.getPort();
    }

    @Override // javax.net.ssl.SSLEngine
    public SSLParameters getSSLParameters() {
        SSLParameters sSLParameters = super.getSSLParameters();
        Platform.getSSLParameters(sSLParameters, this.sslParameters, this);
        return sSLParameters;
    }

    @Override // javax.net.ssl.SSLEngine
    public SSLSession getSession() {
        return this.externalSession;
    }

    @Override // javax.net.ssl.SSLEngine
    public String[] getSupportedCipherSuites() {
        return NativeCrypto.getSupportedCipherSuites();
    }

    @Override // javax.net.ssl.SSLEngine
    public String[] getSupportedProtocols() {
        return NativeCrypto.getSupportedProtocols();
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    public byte[] getTlsUnique() {
        return this.ssl.getTlsUnique();
    }

    @Override // javax.net.ssl.SSLEngine
    public boolean getUseClientMode() {
        return this.sslParameters.getUseClientMode();
    }

    @Override // javax.net.ssl.SSLEngine
    public boolean getWantClientAuth() {
        return this.sslParameters.getWantClientAuth();
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    public SSLSession handshakeSession() {
        synchronized (this.ssl) {
            try {
                if (this.state != 2) {
                    return null;
                }
                return Platform.wrapSSLSession(new ExternalSession(new ExternalSession.Provider() { // from class: org.conscrypt.ConscryptEngine.2
                    @Override // org.conscrypt.ExternalSession.Provider
                    public ConscryptSession provideSession() {
                        return ConscryptEngine.this.provideHandshakeSession();
                    }
                }));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // javax.net.ssl.SSLEngine
    public boolean isInboundDone() {
        boolean z11;
        synchronized (this.ssl) {
            try {
                int i11 = this.state;
                if (i11 != 8) {
                    if (i11 != 6) {
                        if (this.ssl.wasShutdownReceived()) {
                        }
                    }
                }
                z11 = pendingInboundCleartextBytes() == 0;
            } finally {
            }
        }
        return z11;
    }

    @Override // javax.net.ssl.SSLEngine
    public boolean isOutboundDone() {
        boolean z11;
        synchronized (this.ssl) {
            try {
                int i11 = this.state;
                if (i11 != 8) {
                    if (i11 != 7) {
                        if (this.ssl.wasShutdownSent()) {
                        }
                    }
                }
                z11 = pendingOutboundEncryptedBytes() == 0;
            } finally {
            }
        }
        return z11;
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    public int maxSealOverhead() {
        return this.maxSealOverhead;
    }

    @Override // org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public void onNewSessionEstablished(long j11) {
        try {
            NativeCrypto.SSL_SESSION_up_ref(j11);
            sessionContext().cacheSession(NativeSslSession.newInstance(new NativeRef.SSL_SESSION(j11), this.activeSession));
        } catch (Exception unused) {
        }
    }

    @Override // org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public void onSSLStateChange(int i11, int i12) {
        synchronized (this.ssl) {
            try {
                if (i11 == 16) {
                    transitionTo(2);
                } else if (i11 == 32) {
                    int i13 = this.state;
                    if (i13 != 2 && i13 != 4) {
                        throw new IllegalStateException("Completed handshake while in mode " + this.state);
                    }
                    transitionTo(3);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int pendingOutboundEncryptedBytes() {
        return this.networkBio.getPendingWrittenBytes();
    }

    @Override // org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public int selectApplicationProtocol(byte[] bArr) {
        ApplicationProtocolSelectorAdapter applicationProtocolSelector = this.sslParameters.getApplicationProtocolSelector();
        if (applicationProtocolSelector == null) {
            return 3;
        }
        return applicationProtocolSelector.selectApplicationProtocol(bArr);
    }

    @Override // org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public void serverCertificateRequested() throws IOException {
        synchronized (this.ssl) {
            this.ssl.configureServerCertificate();
        }
    }

    @Override // org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public int serverPSKKeyRequested(String str, String str2, byte[] bArr) {
        return this.ssl.serverPSKKeyRequested(str, str2, bArr);
    }

    @Override // org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public long serverSessionRequested(byte[] bArr) {
        return 0L;
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    public void setApplicationProtocolSelector(ApplicationProtocolSelector applicationProtocolSelector) {
        setApplicationProtocolSelector(applicationProtocolSelector == null ? null : new ApplicationProtocolSelectorAdapter(this, applicationProtocolSelector));
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    public void setApplicationProtocols(String[] strArr) {
        this.sslParameters.setApplicationProtocols(strArr);
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    public void setBufferAllocator(BufferAllocator bufferAllocator) {
        synchronized (this.ssl) {
            try {
                if (isHandshakeStarted()) {
                    throw new IllegalStateException("Could not set buffer allocator after the initial handshake has begun.");
                }
                this.bufferAllocator = bufferAllocator;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    public void setChannelIdEnabled(boolean z11) {
        synchronized (this.ssl) {
            try {
                if (getUseClientMode()) {
                    throw new IllegalStateException("Not allowed in client mode");
                }
                if (isHandshakeStarted()) {
                    throw new IllegalStateException("Could not enable/disable Channel ID after the initial handshake has begun.");
                }
                this.sslParameters.channelIdEnabled = z11;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    public void setChannelIdPrivateKey(PrivateKey privateKey) {
        if (!getUseClientMode()) {
            throw new IllegalStateException("Not allowed in server mode");
        }
        synchronized (this.ssl) {
            try {
                if (isHandshakeStarted()) {
                    throw new IllegalStateException("Could not change Channel ID private key after the initial handshake has begun.");
                }
                if (privateKey == null) {
                    this.sslParameters.channelIdEnabled = false;
                    this.channelIdPrivateKey = null;
                    return;
                }
                this.sslParameters.channelIdEnabled = true;
                try {
                    ECParameterSpec params = privateKey instanceof ECKey ? ((ECKey) privateKey).getParams() : null;
                    if (params == null) {
                        params = OpenSSLECGroupContext.getCurveByName("prime256v1").getECParameterSpec();
                    }
                    this.channelIdPrivateKey = OpenSSLKey.fromECPrivateKeyForTLSStackOnly(privateKey, params);
                } catch (InvalidKeyException unused) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // javax.net.ssl.SSLEngine
    public void setEnableSessionCreation(boolean z11) {
        this.sslParameters.setEnableSessionCreation(z11);
    }

    @Override // javax.net.ssl.SSLEngine
    public void setEnabledCipherSuites(String[] strArr) {
        this.sslParameters.setEnabledCipherSuites(strArr);
    }

    @Override // javax.net.ssl.SSLEngine
    public void setEnabledProtocols(String[] strArr) {
        this.sslParameters.setEnabledProtocols(strArr);
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    public void setHandshakeListener(HandshakeListener handshakeListener) {
        synchronized (this.ssl) {
            try {
                if (isHandshakeStarted()) {
                    throw new IllegalStateException("Handshake listener must be set before starting the handshake.");
                }
                this.handshakeListener = handshakeListener;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    public void setHostname(String str) {
        this.sslParameters.setUseSni(str != null);
        this.peerHostname = str;
    }

    @Override // javax.net.ssl.SSLEngine
    public void setNeedClientAuth(boolean z11) {
        this.sslParameters.setNeedClientAuth(z11);
    }

    @Override // javax.net.ssl.SSLEngine
    public void setSSLParameters(SSLParameters sSLParameters) {
        super.setSSLParameters(sSLParameters);
        Platform.setSSLParameters(sSLParameters, this.sslParameters, this);
    }

    @Override // javax.net.ssl.SSLEngine
    public void setUseClientMode(boolean z11) {
        synchronized (this.ssl) {
            try {
                if (isHandshakeStarted()) {
                    throw new IllegalArgumentException("Can not change mode after handshake: state == " + this.state);
                }
                transitionTo(1);
                this.sslParameters.setUseClientMode(z11);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    public void setUseSessionTickets(boolean z11) {
        this.sslParameters.setUseSessionTickets(z11);
    }

    @Override // javax.net.ssl.SSLEngine
    public void setWantClientAuth(boolean z11) {
        this.sslParameters.setWantClientAuth(z11);
    }

    @Override // org.conscrypt.AbstractConscryptEngine, javax.net.ssl.SSLEngine
    public SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws SSLException {
        SSLEngineResult unwrap;
        synchronized (this.ssl) {
            try {
                try {
                    unwrap = unwrap(singleSrcBuffer(byteBuffer), singleDstBuffer(byteBuffer2));
                } finally {
                    resetSingleSrcBuffer();
                    resetSingleDstBuffer();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return unwrap;
    }

    @Override // org.conscrypt.NativeCrypto.SSLHandshakeCallbacks
    public void verifyCertificateChain(byte[][] bArr, String str) throws CertificateException {
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    X509Certificate[] decodeX509CertificateChain = SSLUtils.decodeX509CertificateChain(bArr);
                    X509TrustManager x509TrustManager = this.sslParameters.getX509TrustManager();
                    if (x509TrustManager == null) {
                        throw new CertificateException("No X.509 TrustManager");
                    }
                    this.activeSession.onPeerCertificatesReceived(getPeerHost(), getPeerPort(), decodeX509CertificateChain);
                    if (getUseClientMode()) {
                        Platform.checkServerTrusted(x509TrustManager, decodeX509CertificateChain, str, this);
                        return;
                    } else {
                        Platform.checkClientTrusted(x509TrustManager, decodeX509CertificateChain, decodeX509CertificateChain[0].getPublicKey().getAlgorithm(), this);
                        return;
                    }
                }
            } catch (CertificateException e11) {
                throw e11;
            } catch (Exception e12) {
                throw new CertificateException(e12);
            }
        }
        throw new CertificateException("Peer sent no certificate");
    }

    @Override // org.conscrypt.AbstractConscryptEngine, javax.net.ssl.SSLEngine
    public SSLEngineResult wrap(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws SSLException {
        SSLEngineResult wrap;
        synchronized (this.ssl) {
            try {
                try {
                    wrap = wrap(singleSrcBuffer(byteBuffer), byteBuffer2);
                } finally {
                    resetSingleSrcBuffer();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return wrap;
    }

    public void setApplicationProtocolSelector(ApplicationProtocolSelectorAdapter applicationProtocolSelectorAdapter) {
        this.sslParameters.setApplicationProtocolSelector(applicationProtocolSelectorAdapter);
    }

    private SSLEngineResult.HandshakeStatus getHandshakeStatus(int i11) {
        return !this.handshakeFinished ? pendingStatus(i11) : SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
    }

    @Override // org.conscrypt.AbstractConscryptEngine, javax.net.ssl.SSLEngine
    public SSLEngineResult wrap(ByteBuffer[] byteBufferArr, int i11, int i12, ByteBuffer byteBuffer) throws SSLException {
        int i13;
        int i14;
        SSLEngineResult readPendingBytesFromBIO;
        boolean z11 = true;
        Preconditions.checkArgument(byteBufferArr != null, "srcs is null");
        Preconditions.checkArgument(byteBuffer != null, "dst is null");
        int i15 = i11 + i12;
        Preconditions.checkPositionIndexes(i11, i15, byteBufferArr.length);
        if (!byteBuffer.isReadOnly()) {
            if (i11 != 0 || i12 != byteBufferArr.length) {
                byteBufferArr = (ByteBuffer[]) Arrays.copyOfRange(byteBufferArr, i11, i15);
            }
            BufferUtils.checkNotNull(byteBufferArr);
            synchronized (this.ssl) {
                try {
                    int i16 = this.state;
                    if (i16 != 0) {
                        if (i16 == 1) {
                            beginHandshakeInternal();
                        } else if (i16 == 7 || i16 == 8) {
                            SSLEngineResult readPendingBytesFromBIO2 = readPendingBytesFromBIO(byteBuffer, 0, 0, SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING);
                            if (readPendingBytesFromBIO2 != null) {
                                freeIfDone();
                                return readPendingBytesFromBIO2;
                            }
                            return new SSLEngineResult(SSLEngineResult.Status.CLOSED, getHandshakeStatusInternal(), 0, 0);
                        }
                        SSLEngineResult.HandshakeStatus handshakeStatus = SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
                        if (!this.handshakeFinished) {
                            handshakeStatus = handshake();
                            if (handshakeStatus == SSLEngineResult.HandshakeStatus.NEED_UNWRAP) {
                                return NEED_UNWRAP_OK;
                            }
                            if (this.state == 8) {
                                return NEED_UNWRAP_CLOSED;
                            }
                        }
                        int min = (int) Math.min(BufferUtils.remaining(byteBufferArr), 16384L);
                        if (byteBuffer.remaining() < SSLUtils.calculateOutNetBufSize(min)) {
                            return new SSLEngineResult(SSLEngineResult.Status.BUFFER_OVERFLOW, getHandshakeStatusInternal(), 0, 0);
                        }
                        if (min > 0) {
                            ByteBuffer bufferLargerThan = BufferUtils.getBufferLargerThan(byteBufferArr, 16384);
                            if (bufferLargerThan == null) {
                                bufferLargerThan = BufferUtils.copyNoConsume(byteBufferArr, getOrCreateLazyDirectBuffer(), 16384);
                            } else {
                                z11 = false;
                            }
                            i14 = writePlaintextData(bufferLargerThan, Math.min(16384, bufferLargerThan.remaining()));
                            if (i14 > 0) {
                                if (z11) {
                                    BufferUtils.consume(byteBufferArr, i14);
                                }
                                SSLEngineResult readPendingBytesFromBIO3 = readPendingBytesFromBIO(byteBuffer, i14, 0, handshakeStatus);
                                if (readPendingBytesFromBIO3 == null) {
                                    i13 = 0;
                                } else {
                                    if (readPendingBytesFromBIO3.getStatus() != SSLEngineResult.Status.OK) {
                                        return readPendingBytesFromBIO3;
                                    }
                                    i13 = readPendingBytesFromBIO3.bytesProduced();
                                }
                            } else {
                                int error = this.ssl.getError(i14);
                                if (error == 2) {
                                    SSLEngineResult readPendingBytesFromBIO4 = readPendingBytesFromBIO(byteBuffer, 0, 0, handshakeStatus);
                                    if (readPendingBytesFromBIO4 == null) {
                                        readPendingBytesFromBIO4 = new SSLEngineResult(getEngineStatus(), SSLEngineResult.HandshakeStatus.NEED_UNWRAP, 0, 0);
                                    }
                                    return readPendingBytesFromBIO4;
                                }
                                if (error == 3) {
                                    SSLEngineResult readPendingBytesFromBIO5 = readPendingBytesFromBIO(byteBuffer, 0, 0, handshakeStatus);
                                    if (readPendingBytesFromBIO5 == null) {
                                        readPendingBytesFromBIO5 = NEED_WRAP_CLOSED;
                                    }
                                    return readPendingBytesFromBIO5;
                                }
                                if (error == 6) {
                                    closeAll();
                                    SSLEngineResult readPendingBytesFromBIO6 = readPendingBytesFromBIO(byteBuffer, 0, 0, handshakeStatus);
                                    if (readPendingBytesFromBIO6 == null) {
                                        readPendingBytesFromBIO6 = CLOSED_NOT_HANDSHAKING;
                                    }
                                    return readPendingBytesFromBIO6;
                                }
                                closeAll();
                                throw newSslExceptionWithMessage("SSL_write: error " + error);
                            }
                        } else {
                            i13 = 0;
                            i14 = 0;
                        }
                        return (i14 != 0 || (readPendingBytesFromBIO = readPendingBytesFromBIO(byteBuffer, 0, i13, handshakeStatus)) == null) ? newResult(i14, i13, handshakeStatus) : readPendingBytesFromBIO;
                    }
                    throw new IllegalStateException("Client/server mode must be set before calling wrap");
                } finally {
                }
            }
        }
        throw new ReadOnlyBufferException();
    }

    @Override // org.conscrypt.AbstractConscryptEngine, javax.net.ssl.SSLEngine
    public SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) throws SSLException {
        SSLEngineResult unwrap;
        synchronized (this.ssl) {
            try {
                try {
                    unwrap = unwrap(singleSrcBuffer(byteBuffer), byteBufferArr);
                } finally {
                    resetSingleSrcBuffer();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return unwrap;
    }

    public ConscryptEngine(String str, int i11, SSLParametersImpl sSLParametersImpl) {
        this.bufferAllocator = defaultBufferAllocator;
        this.state = 0;
        this.externalSession = Platform.wrapSSLSession(new ExternalSession(new ExternalSession.Provider() { // from class: org.conscrypt.ConscryptEngine.1
            @Override // org.conscrypt.ExternalSession.Provider
            public ConscryptSession provideSession() {
                return ConscryptEngine.this.provideSession();
            }
        }));
        this.singleSrcBuffer = new ByteBuffer[1];
        this.singleDstBuffer = new ByteBuffer[1];
        this.sslParameters = sSLParametersImpl;
        this.peerInfoProvider = PeerInfoProvider.forHostAndPort(str, i11);
        NativeSsl newSsl = newSsl(sSLParametersImpl, this, this);
        this.ssl = newSsl;
        this.networkBio = newSsl.newBio();
    }

    @Override // org.conscrypt.AbstractConscryptEngine, javax.net.ssl.SSLEngine
    public SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr, int i11, int i12) throws SSLException {
        SSLEngineResult unwrap;
        synchronized (this.ssl) {
            try {
                try {
                    unwrap = unwrap(singleSrcBuffer(byteBuffer), 0, 1, byteBufferArr, i11, i12);
                } finally {
                    resetSingleSrcBuffer();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return unwrap;
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    public SSLEngineResult unwrap(ByteBuffer[] byteBufferArr, ByteBuffer[] byteBufferArr2) throws SSLException {
        Preconditions.checkArgument(byteBufferArr != null, "srcs is null");
        Preconditions.checkArgument(byteBufferArr2 != null, "dsts is null");
        return unwrap(byteBufferArr, 0, byteBufferArr.length, byteBufferArr2, 0, byteBufferArr2.length);
    }

    @Override // org.conscrypt.AbstractConscryptEngine
    public SSLEngineResult unwrap(ByteBuffer[] byteBufferArr, int i11, int i12, ByteBuffer[] byteBufferArr2, int i13, int i14) throws SSLException {
        int i15;
        int i16;
        int i17;
        boolean z11 = true;
        Preconditions.checkArgument(byteBufferArr != null, "srcs is null");
        Preconditions.checkArgument(byteBufferArr2 != null, "dsts is null");
        int i18 = i12 + i11;
        Preconditions.checkPositionIndexes(i11, i18, byteBufferArr.length);
        int i19 = i13 + i14;
        Preconditions.checkPositionIndexes(i13, i19, byteBufferArr2.length);
        int calcDstsLength = calcDstsLength(byteBufferArr2, i13, i14);
        long calcSrcsLength = calcSrcsLength(byteBufferArr, i11, i18);
        synchronized (this.ssl) {
            try {
                int i21 = this.state;
                if (i21 != 0) {
                    if (i21 == 1) {
                        beginHandshakeInternal();
                    } else if (i21 == 6 || i21 == 8) {
                        freeIfDone();
                        return new SSLEngineResult(SSLEngineResult.Status.CLOSED, getHandshakeStatusInternal(), 0, 0);
                    }
                    SSLEngineResult.HandshakeStatus handshakeStatus = SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
                    if (!this.handshakeFinished) {
                        handshakeStatus = handshake();
                        if (handshakeStatus == SSLEngineResult.HandshakeStatus.NEED_WRAP) {
                            return NEED_WRAP_OK;
                        }
                        if (this.state == 8) {
                            return NEED_WRAP_CLOSED;
                        }
                    }
                    if (pendingInboundCleartextBytes() > 0) {
                        z11 = false;
                    }
                    if (calcSrcsLength <= 0 || !z11) {
                        if (z11) {
                            return new SSLEngineResult(SSLEngineResult.Status.BUFFER_UNDERFLOW, getHandshakeStatus(), 0, 0);
                        }
                        i15 = 0;
                    } else {
                        if (calcSrcsLength < 5) {
                            return new SSLEngineResult(SSLEngineResult.Status.BUFFER_UNDERFLOW, getHandshakeStatus(), 0, 0);
                        }
                        i15 = SSLUtils.getEncryptedPacketLength(byteBufferArr, i11);
                        if (i15 < 0) {
                            throw new SSLException("Unable to parse TLS packet header");
                        }
                        if (calcSrcsLength < i15) {
                            return new SSLEngineResult(SSLEngineResult.Status.BUFFER_UNDERFLOW, getHandshakeStatus(), 0, 0);
                        }
                    }
                    if (i15 <= 0 || i11 >= i18) {
                        i16 = 0;
                    } else {
                        i16 = 0;
                        while (true) {
                            ByteBuffer byteBuffer = byteBufferArr[i11];
                            int remaining = byteBuffer.remaining();
                            if (remaining != 0) {
                                int writeEncryptedData = writeEncryptedData(byteBuffer, Math.min(i15, remaining));
                                if (writeEncryptedData <= 0) {
                                    NativeCrypto.SSL_clear_error();
                                    break;
                                }
                                i16 += writeEncryptedData;
                                i15 -= writeEncryptedData;
                                if (i15 != 0 && writeEncryptedData == remaining) {
                                }
                            }
                            i11++;
                            if (i11 >= i18) {
                                break;
                            }
                        }
                    }
                    if (calcDstsLength > 0) {
                        i17 = 0;
                        while (i13 < i19) {
                            try {
                                ByteBuffer byteBuffer2 = byteBufferArr2[i13];
                                if (byteBuffer2.hasRemaining()) {
                                    int readPlaintextData = readPlaintextData(byteBuffer2);
                                    if (readPlaintextData <= 0) {
                                        if (readPlaintextData != -6) {
                                            if (readPlaintextData != -3 && readPlaintextData != -2) {
                                                closeAll();
                                                throw newSslExceptionWithMessage("SSL_read");
                                            }
                                            return newResult(i16, i17, handshakeStatus);
                                        }
                                        closeAll();
                                        return new SSLEngineResult(SSLEngineResult.Status.CLOSED, pendingOutboundEncryptedBytes() > 0 ? SSLEngineResult.HandshakeStatus.NEED_WRAP : SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING, i16, i17);
                                    }
                                    i17 += readPlaintextData;
                                    if (byteBuffer2.hasRemaining()) {
                                        break;
                                    }
                                }
                                i13++;
                            } catch (InterruptedIOException unused) {
                                r1 = i17;
                                return newResult(i16, r1, handshakeStatus);
                            }
                        }
                    } else {
                        try {
                            this.ssl.forceRead();
                            i17 = 0;
                        } catch (InterruptedIOException unused2) {
                            return newResult(i16, r1, handshakeStatus);
                        }
                    }
                    if ((this.handshakeFinished ? pendingInboundCleartextBytes() : 0) > 0) {
                        SSLEngineResult.Status status = SSLEngineResult.Status.BUFFER_OVERFLOW;
                        if (handshakeStatus != SSLEngineResult.HandshakeStatus.FINISHED) {
                            handshakeStatus = getHandshakeStatusInternal();
                        }
                        return new SSLEngineResult(status, mayFinishHandshake(handshakeStatus), i16, i17);
                    }
                    return newResult(i16, i17, handshakeStatus);
                }
                throw new IllegalStateException("Client/server mode must be set before calling unwrap");
            } catch (IOException e11) {
                closeAll();
                throw convertException(e11);
            } finally {
            }
        }
    }

    public ConscryptEngine(SSLParametersImpl sSLParametersImpl, PeerInfoProvider peerInfoProvider, SSLParametersImpl.AliasChooser aliasChooser) {
        this.bufferAllocator = defaultBufferAllocator;
        this.state = 0;
        this.externalSession = Platform.wrapSSLSession(new ExternalSession(new ExternalSession.Provider() { // from class: org.conscrypt.ConscryptEngine.1
            @Override // org.conscrypt.ExternalSession.Provider
            public ConscryptSession provideSession() {
                return ConscryptEngine.this.provideSession();
            }
        }));
        this.singleSrcBuffer = new ByteBuffer[1];
        this.singleDstBuffer = new ByteBuffer[1];
        this.sslParameters = sSLParametersImpl;
        this.peerInfoProvider = (PeerInfoProvider) Preconditions.checkNotNull(peerInfoProvider, "peerInfoProvider");
        NativeSsl newSsl = newSsl(sSLParametersImpl, this, aliasChooser);
        this.ssl = newSsl;
        this.networkBio = newSsl.newBio();
    }
}
