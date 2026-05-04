package org.apache.thrift.protocol;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import org.apache.thrift.TException;
import org.apache.thrift.transport.TTransport;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class TBinaryProtocol extends TProtocol {
    private static final TStruct ANONYMOUS_STRUCT = new TStruct();
    private static final long NO_LENGTH_LIMIT = -1;
    protected static final int VERSION_1 = -2147418112;
    protected static final int VERSION_MASK = -65536;
    private byte[] bin;
    private byte[] bout;
    private final long containerLengthLimit_;
    private byte[] i16out;
    private byte[] i16rd;
    private byte[] i32out;
    private byte[] i32rd;
    private byte[] i64out;
    private byte[] i64rd;
    protected boolean strictRead_;
    protected boolean strictWrite_;
    private final long stringLengthLimit_;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Factory implements TProtocolFactory {
        protected long containerLengthLimit_;
        protected boolean strictRead_;
        protected boolean strictWrite_;
        protected long stringLengthLimit_;

        public Factory() {
            this(false, true);
        }

        @Override // org.apache.thrift.protocol.TProtocolFactory
        public TProtocol getProtocol(TTransport tTransport) {
            return new TBinaryProtocol(tTransport, this.stringLengthLimit_, this.containerLengthLimit_, this.strictRead_, this.strictWrite_);
        }

        public Factory(boolean z11, boolean z12) {
            this(z11, z12, -1L, -1L);
        }

        public Factory(boolean z11, boolean z12, long j11, long j12) {
            this.stringLengthLimit_ = j11;
            this.containerLengthLimit_ = j12;
            this.strictRead_ = z11;
            this.strictWrite_ = z12;
        }
    }

    public TBinaryProtocol(TTransport tTransport) {
        this(tTransport, false, true);
    }

    private void checkContainerReadLength(int i11) throws TProtocolException {
        if (i11 < 0) {
            throw new TProtocolException(2, "Negative length: " + i11);
        }
        long j11 = this.containerLengthLimit_;
        if (j11 == -1 || i11 <= j11) {
            return;
        }
        throw new TProtocolException(3, "Length exceeded max allowed: " + i11);
    }

    private void checkStringReadLength(int i11) throws TProtocolException {
        if (i11 < 0) {
            throw new TProtocolException(2, "Negative length: " + i11);
        }
        long j11 = this.stringLengthLimit_;
        if (j11 == -1 || i11 <= j11) {
            return;
        }
        throw new TProtocolException(3, "Length exceeded max allowed: " + i11);
    }

    private int readAll(byte[] bArr, int i11, int i12) throws TException {
        return this.trans_.readAll(bArr, i11, i12);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public ByteBuffer readBinary() throws TException {
        int readI32 = readI32();
        long j11 = this.stringLengthLimit_;
        if (j11 > 0 && readI32 > j11) {
            throw new TProtocolException(3, "Binary field exceeded string size limit");
        }
        if (this.trans_.getBytesRemainingInBuffer() >= readI32) {
            ByteBuffer wrap = ByteBuffer.wrap(this.trans_.getBuffer(), this.trans_.getBufferPosition(), readI32);
            this.trans_.consumeBuffer(readI32);
            return wrap;
        }
        byte[] bArr = new byte[readI32];
        this.trans_.readAll(bArr, 0, readI32);
        return ByteBuffer.wrap(bArr);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public boolean readBool() throws TException {
        return readByte() == 1;
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public byte readByte() throws TException {
        if (this.trans_.getBytesRemainingInBuffer() < 1) {
            readAll(this.bin, 0, 1);
            return this.bin[0];
        }
        byte b11 = this.trans_.getBuffer()[this.trans_.getBufferPosition()];
        this.trans_.consumeBuffer(1);
        return b11;
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public double readDouble() throws TException {
        return Double.longBitsToDouble(readI64());
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public TField readFieldBegin() throws TException {
        byte readByte = readByte();
        return new TField("", readByte, readByte == 0 ? (short) 0 : readI16());
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public short readI16() throws TException {
        int i11;
        byte[] bArr = this.i16rd;
        if (this.trans_.getBytesRemainingInBuffer() >= 2) {
            bArr = this.trans_.getBuffer();
            i11 = this.trans_.getBufferPosition();
            this.trans_.consumeBuffer(2);
        } else {
            readAll(this.i16rd, 0, 2);
            i11 = 0;
        }
        return (short) ((bArr[i11 + 1] & 255) | ((bArr[i11] & 255) << 8));
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public int readI32() throws TException {
        int i11;
        byte[] bArr = this.i32rd;
        if (this.trans_.getBytesRemainingInBuffer() >= 4) {
            bArr = this.trans_.getBuffer();
            i11 = this.trans_.getBufferPosition();
            this.trans_.consumeBuffer(4);
        } else {
            readAll(this.i32rd, 0, 4);
            i11 = 0;
        }
        return (bArr[i11 + 3] & 255) | ((bArr[i11] & 255) << 24) | ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11 + 2] & 255) << 8);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public long readI64() throws TException {
        int i11;
        byte[] bArr = this.i64rd;
        if (this.trans_.getBytesRemainingInBuffer() >= 8) {
            bArr = this.trans_.getBuffer();
            i11 = this.trans_.getBufferPosition();
            this.trans_.consumeBuffer(8);
        } else {
            readAll(this.i64rd, 0, 8);
            i11 = 0;
        }
        return (bArr[i11 + 7] & 255) | ((bArr[i11] & 255) << 56) | ((bArr[i11 + 1] & 255) << 48) | ((bArr[i11 + 2] & 255) << 40) | ((bArr[i11 + 3] & 255) << 32) | ((bArr[i11 + 4] & 255) << 24) | ((bArr[i11 + 5] & 255) << 16) | ((bArr[i11 + 6] & 255) << 8);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public TList readListBegin() throws TException {
        TList tList = new TList(readByte(), readI32());
        checkContainerReadLength(tList.size);
        return tList;
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public TMap readMapBegin() throws TException {
        TMap tMap = new TMap(readByte(), readByte(), readI32());
        checkContainerReadLength(tMap.size);
        return tMap;
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public TMessage readMessageBegin() throws TException {
        int readI32 = readI32();
        if (readI32 < 0) {
            if (((-65536) & readI32) == -2147418112) {
                return new TMessage(readString(), (byte) (readI32 & 255), readI32());
            }
            throw new TProtocolException(4, "Bad version in readMessageBegin");
        }
        if (this.strictRead_) {
            throw new TProtocolException(4, "Missing version in readMessageBegin, old client?");
        }
        return new TMessage(readStringBody(readI32), readByte(), readI32());
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public TSet readSetBegin() throws TException {
        TSet tSet = new TSet(readByte(), readI32());
        checkContainerReadLength(tSet.size);
        return tSet;
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public String readString() throws TException {
        int readI32 = readI32();
        checkStringReadLength(readI32);
        long j11 = this.stringLengthLimit_;
        if (j11 > 0 && readI32 > j11) {
            throw new TProtocolException(3, "String field exceeded string size limit");
        }
        if (this.trans_.getBytesRemainingInBuffer() < readI32) {
            return readStringBody(readI32);
        }
        try {
            String str = new String(this.trans_.getBuffer(), this.trans_.getBufferPosition(), readI32, "UTF-8");
            this.trans_.consumeBuffer(readI32);
            return str;
        } catch (UnsupportedEncodingException unused) {
            throw new TException("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    public String readStringBody(int i11) throws TException {
        try {
            byte[] bArr = new byte[i11];
            this.trans_.readAll(bArr, 0, i11);
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new TException("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public TStruct readStructBegin() {
        return ANONYMOUS_STRUCT;
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeBinary(ByteBuffer byteBuffer) throws TException {
        int limit = byteBuffer.limit() - byteBuffer.position();
        writeI32(limit);
        this.trans_.write(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), limit);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeBool(boolean z11) throws TException {
        writeByte(z11 ? (byte) 1 : (byte) 0);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeByte(byte b11) throws TException {
        byte[] bArr = this.bout;
        bArr[0] = b11;
        this.trans_.write(bArr, 0, 1);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeDouble(double d11) throws TException {
        writeI64(Double.doubleToLongBits(d11));
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeFieldBegin(TField tField) throws TException {
        writeByte(tField.type);
        writeI16(tField.f77768id);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeFieldStop() throws TException {
        writeByte((byte) 0);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeI16(short s11) throws TException {
        byte[] bArr = this.i16out;
        bArr[0] = (byte) ((s11 >> 8) & 255);
        bArr[1] = (byte) (s11 & 255);
        this.trans_.write(bArr, 0, 2);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeI32(int i11) throws TException {
        byte[] bArr = this.i32out;
        bArr[0] = (byte) ((i11 >> 24) & 255);
        bArr[1] = (byte) ((i11 >> 16) & 255);
        bArr[2] = (byte) ((i11 >> 8) & 255);
        bArr[3] = (byte) (i11 & 255);
        this.trans_.write(bArr, 0, 4);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeI64(long j11) throws TException {
        byte[] bArr = this.i64out;
        bArr[0] = (byte) ((j11 >> 56) & 255);
        bArr[1] = (byte) ((j11 >> 48) & 255);
        bArr[2] = (byte) ((j11 >> 40) & 255);
        bArr[3] = (byte) ((j11 >> 32) & 255);
        bArr[4] = (byte) ((j11 >> 24) & 255);
        bArr[5] = (byte) ((j11 >> 16) & 255);
        bArr[6] = (byte) ((j11 >> 8) & 255);
        bArr[7] = (byte) (j11 & 255);
        this.trans_.write(bArr, 0, 8);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeListBegin(TList tList) throws TException {
        writeByte(tList.elemType);
        writeI32(tList.size);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeMapBegin(TMap tMap) throws TException {
        writeByte(tMap.keyType);
        writeByte(tMap.valueType);
        writeI32(tMap.size);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeMessageBegin(TMessage tMessage) throws TException {
        if (this.strictWrite_) {
            writeI32((-2147418112) | tMessage.type);
            writeString(tMessage.name);
            writeI32(tMessage.seqid);
        } else {
            writeString(tMessage.name);
            writeByte(tMessage.type);
            writeI32(tMessage.seqid);
        }
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeSetBegin(TSet tSet) throws TException {
        writeByte(tSet.elemType);
        writeI32(tSet.size);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeString(String str) throws TException {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            writeI32(bytes.length);
            this.trans_.write(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new TException("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    public TBinaryProtocol(TTransport tTransport, boolean z11, boolean z12) {
        this(tTransport, -1L, -1L, z11, z12);
    }

    public TBinaryProtocol(TTransport tTransport, long j11, long j12, boolean z11, boolean z12) {
        super(tTransport);
        this.bout = new byte[1];
        this.i16out = new byte[2];
        this.i32out = new byte[4];
        this.i64out = new byte[8];
        this.bin = new byte[1];
        this.i16rd = new byte[2];
        this.i32rd = new byte[4];
        this.i64rd = new byte[8];
        this.stringLengthLimit_ = j11;
        this.containerLengthLimit_ = j12;
        this.strictRead_ = z11;
        this.strictWrite_ = z12;
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void readFieldEnd() {
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void readListEnd() {
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void readMapEnd() {
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void readMessageEnd() {
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void readSetEnd() {
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void readStructEnd() {
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeFieldEnd() {
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeListEnd() {
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeMapEnd() {
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeMessageEnd() {
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeSetEnd() {
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeStructEnd() {
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeStructBegin(TStruct tStruct) {
    }
}
