package org.apache.thrift.transport;

import com.alipay.sdk.m.k.b;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import javax.security.sasl.SaslClient;
import javax.security.sasl.SaslException;
import javax.security.sasl.SaslServer;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TByteArrayOutputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
abstract class TSaslTransport extends TTransport {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected static final int DEFAULT_MAX_LENGTH = Integer.MAX_VALUE;
    private static final Logger LOGGER = LoggerFactory.getLogger((Class<?>) TSaslTransport.class);
    protected static final int MECHANISM_NAME_BYTES = 1;
    protected static final int PAYLOAD_LENGTH_BYTES = 4;
    protected static final int STATUS_BYTES = 1;
    private final byte[] messageHeader;
    private TMemoryInputTransport readBuffer;
    private SaslParticipant sasl;
    private boolean shouldWrap;
    protected TTransport underlyingTransport;
    private final TByteArrayOutputStream writeBuffer;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum NegotiationStatus {
        START((byte) 1),
        OK((byte) 2),
        BAD((byte) 3),
        ERROR((byte) 4),
        COMPLETE((byte) 5);

        private static final Map<Byte, NegotiationStatus> reverseMap = new HashMap();
        private final byte value;

        static {
            for (NegotiationStatus negotiationStatus : (NegotiationStatus[]) NegotiationStatus.class.getEnumConstants()) {
                reverseMap.put(Byte.valueOf(negotiationStatus.getValue()), negotiationStatus);
            }
        }

        NegotiationStatus(byte b11) {
            this.value = b11;
        }

        public static NegotiationStatus byValue(byte b11) {
            return reverseMap.get(Byte.valueOf(b11));
        }

        public byte getValue() {
            return this.value;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SaslResponse {
        public byte[] payload;
        public NegotiationStatus status;

        public SaslResponse(NegotiationStatus negotiationStatus, byte[] bArr) {
            this.status = negotiationStatus;
            this.payload = bArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum SaslRole {
        SERVER,
        CLIENT
    }

    public TSaslTransport(TTransport tTransport) {
        this.shouldWrap = false;
        this.readBuffer = new TMemoryInputTransport();
        this.writeBuffer = new TByteArrayOutputStream(1024);
        this.messageHeader = new byte[5];
        this.underlyingTransport = tTransport;
    }

    private void readFrame() throws TTransportException, SaslException {
        int readLength = readLength();
        if (readLength < 0) {
            throw new TTransportException("Read a negative frame size (" + readLength + ")!");
        }
        byte[] bArr = new byte[readLength];
        Logger logger = LOGGER;
        logger.debug("{}: reading data length: {}", getRole(), Integer.valueOf(readLength));
        this.underlyingTransport.readAll(bArr, 0, readLength);
        if (this.shouldWrap) {
            bArr = this.sasl.unwrap(bArr, 0, readLength);
            logger.debug("data length after unwrap: {}", Integer.valueOf(bArr.length));
        }
        this.readBuffer.reset(bArr);
    }

    @Override // org.apache.thrift.transport.TTransport, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.underlyingTransport.close();
        try {
            this.sasl.dispose();
        } catch (SaslException unused) {
        }
    }

    @Override // org.apache.thrift.transport.TTransport
    public void flush() throws TTransportException {
        byte[] bArr = this.writeBuffer.get();
        int len = this.writeBuffer.len();
        this.writeBuffer.reset();
        if (this.shouldWrap) {
            LOGGER.debug("data length before wrap: {}", Integer.valueOf(len));
            try {
                bArr = this.sasl.wrap(bArr, 0, len);
                len = bArr.length;
            } catch (SaslException e11) {
                throw new TTransportException((Throwable) e11);
            }
        }
        LOGGER.debug("writing data length: {}", Integer.valueOf(len));
        writeLength(len);
        this.underlyingTransport.write(bArr, 0, len);
        this.underlyingTransport.flush();
    }

    public abstract SaslRole getRole();

    public SaslClient getSaslClient() {
        return this.sasl.saslClient;
    }

    public SaslServer getSaslServer() {
        return this.sasl.saslServer;
    }

    public TTransport getUnderlyingTransport() {
        return this.underlyingTransport;
    }

    public abstract void handleSaslStartMessage() throws TTransportException, SaslException;

    @Override // org.apache.thrift.transport.TTransport
    public boolean isOpen() {
        SaslParticipant saslParticipant;
        return this.underlyingTransport.isOpen() && (saslParticipant = this.sasl) != null && saslParticipant.isComplete();
    }

    @Override // org.apache.thrift.transport.TTransport
    public void open() throws TTransportException {
        boolean z11;
        Logger logger = LOGGER;
        logger.debug("opening transport {}", this);
        SaslParticipant saslParticipant = this.sasl;
        if (saslParticipant != null && saslParticipant.isComplete()) {
            throw new TTransportException("SASL transport already open");
        }
        if (!this.underlyingTransport.isOpen()) {
            this.underlyingTransport.open();
        }
        try {
            try {
                handleSaslStartMessage();
                z11 = true;
            } catch (TTransportException e11) {
                e = e11;
                z11 = false;
            }
            try {
                logger.debug("{}: Start message handled", getRole());
                SaslResponse saslResponse = null;
                while (true) {
                    if (!this.sasl.isComplete()) {
                        saslResponse = receiveSaslMessage();
                        NegotiationStatus negotiationStatus = saslResponse.status;
                        NegotiationStatus negotiationStatus2 = NegotiationStatus.COMPLETE;
                        if (negotiationStatus != negotiationStatus2 && negotiationStatus != NegotiationStatus.OK) {
                            throw new TTransportException("Expected COMPLETE or OK, got " + saslResponse.status);
                        }
                        byte[] evaluateChallengeOrResponse = this.sasl.evaluateChallengeOrResponse(saslResponse.payload);
                        if (saslResponse.status == negotiationStatus2 && getRole() == SaslRole.CLIENT) {
                            LOGGER.debug("{}: All done!", getRole());
                            break;
                        } else {
                            if (!this.sasl.isComplete()) {
                                negotiationStatus2 = NegotiationStatus.OK;
                            }
                            sendSaslMessage(negotiationStatus2, evaluateChallengeOrResponse);
                        }
                    } else {
                        break;
                    }
                }
                Logger logger2 = LOGGER;
                logger2.debug("{}: Main negotiation loop complete", getRole());
                if (getRole() == SaslRole.CLIENT && (saslResponse == null || saslResponse.status == NegotiationStatus.OK)) {
                    logger2.debug("{}: SASL Client receiving last message", getRole());
                    SaslResponse receiveSaslMessage = receiveSaslMessage();
                    if (receiveSaslMessage.status != NegotiationStatus.COMPLETE) {
                        throw new TTransportException("Expected SASL COMPLETE, but got " + receiveSaslMessage.status);
                    }
                }
                String str = (String) this.sasl.getNegotiatedProperty("javax.security.sasl.qop");
                if (str == null || str.equalsIgnoreCase(b.f10657n)) {
                    return;
                }
                this.shouldWrap = true;
            } catch (TTransportException e12) {
                e = e12;
                if (z11 || e.getType() != 4) {
                    throw e;
                }
                this.underlyingTransport.close();
                LOGGER.debug("No data or no sasl data in the stream");
                throw new TSaslTransportException("No data or no sasl data in the stream");
            }
        } catch (SaslException e13) {
            try {
                LOGGER.error("SASL negotiation failure", e13);
                throw sendAndThrowMessage(NegotiationStatus.BAD, e13.getMessage());
            } catch (Throwable th2) {
                this.underlyingTransport.close();
                throw th2;
            }
        }
    }

    @Override // org.apache.thrift.transport.TTransport
    public int read(byte[] bArr, int i11, int i12) throws TTransportException {
        if (!isOpen()) {
            throw new TTransportException("SASL authentication not complete");
        }
        int read = this.readBuffer.read(bArr, i11, i12);
        if (read > 0) {
            return read;
        }
        try {
            readFrame();
            return this.readBuffer.read(bArr, i11, i12);
        } catch (SaslException e11) {
            throw new TTransportException((Throwable) e11);
        }
    }

    public int readLength() throws TTransportException {
        byte[] bArr = new byte[4];
        this.underlyingTransport.readAll(bArr, 0, 4);
        return EncodingUtils.decodeBigEndian(bArr);
    }

    public SaslResponse receiveSaslMessage() throws TTransportException {
        TTransport tTransport = this.underlyingTransport;
        byte[] bArr = this.messageHeader;
        tTransport.readAll(bArr, 0, bArr.length);
        byte b11 = this.messageHeader[0];
        NegotiationStatus byValue = NegotiationStatus.byValue(b11);
        if (byValue == null) {
            throw sendAndThrowMessage(NegotiationStatus.ERROR, "Invalid status " + ((int) b11));
        }
        int decodeBigEndian = EncodingUtils.decodeBigEndian(this.messageHeader, 1);
        if (decodeBigEndian < 0 || decodeBigEndian > 104857600) {
            throw sendAndThrowMessage(NegotiationStatus.ERROR, "Invalid payload header length: " + decodeBigEndian);
        }
        byte[] bArr2 = new byte[decodeBigEndian];
        this.underlyingTransport.readAll(bArr2, 0, decodeBigEndian);
        if (byValue == NegotiationStatus.BAD || byValue == NegotiationStatus.ERROR) {
            try {
                throw new TTransportException("Peer indicated failure: " + new String(bArr2, "UTF-8"));
            } catch (UnsupportedEncodingException e11) {
                throw new TTransportException(e11);
            }
        }
        Logger logger = LOGGER;
        if (logger.isDebugEnabled()) {
            logger.debug(getRole() + ": Received message with status {} and payload length {}", byValue, Integer.valueOf(decodeBigEndian));
        }
        return new SaslResponse(byValue, bArr2);
    }

    public TTransportException sendAndThrowMessage(NegotiationStatus negotiationStatus, String str) throws TTransportException {
        try {
            sendSaslMessage(negotiationStatus, str.getBytes());
        } catch (Exception e11) {
            LOGGER.warn("Could not send failure response", (Throwable) e11);
            str = str + "\nAlso, could not send response: " + e11.toString();
        }
        throw new TTransportException(str);
    }

    public void sendSaslMessage(NegotiationStatus negotiationStatus, byte[] bArr) throws TTransportException {
        if (bArr == null) {
            bArr = new byte[0];
        }
        this.messageHeader[0] = negotiationStatus.getValue();
        EncodingUtils.encodeBigEndian(bArr.length, this.messageHeader, 1);
        Logger logger = LOGGER;
        if (logger.isDebugEnabled()) {
            logger.debug(getRole() + ": Writing message with status {} and payload length {}", negotiationStatus, Integer.valueOf(bArr.length));
        }
        this.underlyingTransport.write(this.messageHeader);
        this.underlyingTransport.write(bArr);
        this.underlyingTransport.flush();
    }

    public void setSaslServer(SaslServer saslServer) {
        this.sasl = new SaslParticipant(saslServer);
    }

    @Override // org.apache.thrift.transport.TTransport
    public void write(byte[] bArr, int i11, int i12) throws TTransportException {
        if (!isOpen()) {
            throw new TTransportException("SASL authentication not complete");
        }
        this.writeBuffer.write(bArr, i11, i12);
    }

    public void writeLength(int i11) throws TTransportException {
        byte[] bArr = new byte[4];
        TFramedTransport.encodeFrameSize(i11, bArr);
        this.underlyingTransport.write(bArr);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SaslParticipant {
        public SaslClient saslClient;
        public SaslServer saslServer;

        public SaslParticipant(SaslServer saslServer) {
            this.saslServer = saslServer;
        }

        public void dispose() throws SaslException {
            SaslClient saslClient = this.saslClient;
            if (saslClient != null) {
                saslClient.dispose();
            } else {
                this.saslServer.dispose();
            }
        }

        public byte[] evaluateChallengeOrResponse(byte[] bArr) throws SaslException {
            SaslClient saslClient = this.saslClient;
            return saslClient != null ? saslClient.evaluateChallenge(bArr) : this.saslServer.evaluateResponse(bArr);
        }

        public Object getNegotiatedProperty(String str) {
            SaslClient saslClient = this.saslClient;
            return saslClient != null ? saslClient.getNegotiatedProperty(str) : this.saslServer.getNegotiatedProperty(str);
        }

        public boolean isComplete() {
            SaslClient saslClient = this.saslClient;
            return saslClient != null ? saslClient.isComplete() : this.saslServer.isComplete();
        }

        public byte[] unwrap(byte[] bArr, int i11, int i12) throws SaslException {
            SaslClient saslClient = this.saslClient;
            return saslClient != null ? saslClient.unwrap(bArr, i11, i12) : this.saslServer.unwrap(bArr, i11, i12);
        }

        public byte[] wrap(byte[] bArr, int i11, int i12) throws SaslException {
            SaslClient saslClient = this.saslClient;
            return saslClient != null ? saslClient.wrap(bArr, i11, i12) : this.saslServer.wrap(bArr, i11, i12);
        }

        public SaslParticipant(SaslClient saslClient) {
            this.saslClient = saslClient;
        }
    }

    public TSaslTransport(SaslClient saslClient, TTransport tTransport) {
        this.shouldWrap = false;
        this.readBuffer = new TMemoryInputTransport();
        this.writeBuffer = new TByteArrayOutputStream(1024);
        this.messageHeader = new byte[5];
        this.sasl = new SaslParticipant(saslClient);
        this.underlyingTransport = tTransport;
    }
}
