package org.apache.thrift.protocol;

import com.alipay.sdk.m.n.a;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import org.apache.thrift.ShortStack;
import org.apache.thrift.TException;
import org.apache.thrift.transport.TTransport;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class TCompactProtocol extends TProtocol {
    private static final long NO_LENGTH_LIMIT = -1;
    private static final byte PROTOCOL_ID = -126;
    private static final byte TYPE_BITS = 7;
    private static final byte TYPE_MASK = -32;
    private static final int TYPE_SHIFT_AMOUNT = 5;
    private static final byte VERSION = 1;
    private static final byte VERSION_MASK = 31;
    private Boolean boolValue_;
    private TField booleanField_;
    private byte[] byteDirectBuffer;
    byte[] byteRawBuf;
    private final long containerLengthLimit_;
    byte[] i32buf;
    private short lastFieldId_;
    private ShortStack lastField_;
    private final long stringLengthLimit_;
    byte[] varint64out;
    private static final TStruct ANONYMOUS_STRUCT = new TStruct("");
    private static final TField TSTOP = new TField("", (byte) 0, 0);
    private static final byte[] ttypeToCompactType = {0, 0, 1, 3, 7, 0, 4, 0, 5, 0, 6, 8, 12, 11, 10, 9};

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Factory implements TProtocolFactory {
        private final long containerLengthLimit_;
        private final long stringLengthLimit_;

        public Factory() {
            this(-1L, -1L);
        }

        @Override // org.apache.thrift.protocol.TProtocolFactory
        public TProtocol getProtocol(TTransport tTransport) {
            return new TCompactProtocol(tTransport, this.stringLengthLimit_, this.containerLengthLimit_);
        }

        public Factory(long j11) {
            this(j11, -1L);
        }

        public Factory(long j11, long j12) {
            this.containerLengthLimit_ = j12;
            this.stringLengthLimit_ = j11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Types {
        public static final byte BINARY = 8;
        public static final byte BOOLEAN_FALSE = 2;
        public static final byte BOOLEAN_TRUE = 1;
        public static final byte BYTE = 3;
        public static final byte DOUBLE = 7;
        public static final byte I16 = 4;
        public static final byte I32 = 5;
        public static final byte I64 = 6;
        public static final byte LIST = 9;
        public static final byte MAP = 11;
        public static final byte SET = 10;
        public static final byte STRUCT = 12;

        private Types() {
        }
    }

    public TCompactProtocol(TTransport tTransport, long j11, long j12) {
        super(tTransport);
        this.lastField_ = new ShortStack(15);
        this.lastFieldId_ = (short) 0;
        this.booleanField_ = null;
        this.boolValue_ = null;
        this.i32buf = new byte[5];
        this.varint64out = new byte[10];
        this.byteDirectBuffer = new byte[1];
        this.byteRawBuf = new byte[1];
        this.stringLengthLimit_ = j11;
        this.containerLengthLimit_ = j12;
    }

    private long bytesToLong(byte[] bArr) {
        return ((bArr[7] & 255) << 56) | ((bArr[6] & 255) << 48) | ((bArr[5] & 255) << 40) | ((bArr[4] & 255) << 32) | ((bArr[3] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[1] & 255) << 8) | (255 & bArr[0]);
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

    private void fixedLongToBytes(long j11, byte[] bArr, int i11) {
        bArr[i11] = (byte) (j11 & 255);
        bArr[i11 + 1] = (byte) ((j11 >> 8) & 255);
        bArr[i11 + 2] = (byte) ((j11 >> 16) & 255);
        bArr[i11 + 3] = (byte) ((j11 >> 24) & 255);
        bArr[i11 + 4] = (byte) ((j11 >> 32) & 255);
        bArr[i11 + 5] = (byte) ((j11 >> 40) & 255);
        bArr[i11 + 6] = (byte) ((j11 >> 48) & 255);
        bArr[i11 + 7] = (byte) ((j11 >> 56) & 255);
    }

    private byte getCompactType(byte b11) {
        return ttypeToCompactType[b11];
    }

    private byte getTType(byte b11) throws TProtocolException {
        byte b12 = (byte) (b11 & 15);
        switch (b12) {
            case 0:
                return (byte) 0;
            case 1:
            case 2:
                return (byte) 2;
            case 3:
                return (byte) 3;
            case 4:
                return (byte) 6;
            case 5:
                return (byte) 8;
            case 6:
                return (byte) 10;
            case 7:
                return (byte) 4;
            case 8:
                return (byte) 11;
            case 9:
                return (byte) 15;
            case 10:
                return (byte) 14;
            case 11:
                return (byte) 13;
            case 12:
                return (byte) 12;
            default:
                throw new TProtocolException("don't know what type: " + ((int) b12));
        }
    }

    private int intToZigZag(int i11) {
        return (i11 >> 31) ^ (i11 << 1);
    }

    private boolean isBoolType(byte b11) {
        int i11 = b11 & 15;
        return i11 == 1 || i11 == 2;
    }

    private long longToZigzag(long j11) {
        return (j11 >> 63) ^ (j11 << 1);
    }

    private int readVarint32() throws TException {
        int i11 = 0;
        if (this.trans_.getBytesRemainingInBuffer() >= 5) {
            byte[] buffer = this.trans_.getBuffer();
            int bufferPosition = this.trans_.getBufferPosition();
            int i12 = 0;
            int i13 = 0;
            while (true) {
                byte b11 = buffer[bufferPosition + i11];
                i12 |= (b11 & Byte.MAX_VALUE) << i13;
                if ((b11 & 128) != 128) {
                    this.trans_.consumeBuffer(i11 + 1);
                    return i12;
                }
                i13 += 7;
                i11++;
            }
        } else {
            int i14 = 0;
            while (true) {
                byte readByte = readByte();
                i11 |= (readByte & Byte.MAX_VALUE) << i14;
                if ((readByte & 128) != 128) {
                    return i11;
                }
                i14 += 7;
            }
        }
    }

    private long readVarint64() throws TException {
        int i11 = 0;
        long j11 = 0;
        if (this.trans_.getBytesRemainingInBuffer() >= 10) {
            byte[] buffer = this.trans_.getBuffer();
            int bufferPosition = this.trans_.getBufferPosition();
            long j12 = 0;
            int i12 = 0;
            while (true) {
                j12 |= (r7 & Byte.MAX_VALUE) << i12;
                if ((buffer[bufferPosition + i11] & 128) != 128) {
                    this.trans_.consumeBuffer(i11 + 1);
                    return j12;
                }
                i12 += 7;
                i11++;
            }
        } else {
            while (true) {
                j11 |= (r0 & Byte.MAX_VALUE) << i11;
                if ((readByte() & 128) != 128) {
                    return j11;
                }
                i11 += 7;
            }
        }
    }

    private void writeByteDirect(byte b11) throws TException {
        byte[] bArr = this.byteDirectBuffer;
        bArr[0] = b11;
        this.trans_.write(bArr);
    }

    private void writeFieldBeginInternal(TField tField, byte b11) throws TException {
        if (b11 == -1) {
            b11 = getCompactType(tField.type);
        }
        short s11 = tField.f77768id;
        short s12 = this.lastFieldId_;
        if (s11 <= s12 || s11 - s12 > 15) {
            writeByteDirect(b11);
            writeI16(tField.f77768id);
        } else {
            writeByteDirect(b11 | ((s11 - s12) << 4));
        }
        this.lastFieldId_ = tField.f77768id;
    }

    private void writeVarint32(int i11) throws TException {
        int i12 = 0;
        while ((i11 & a.f10855g) != 0) {
            this.i32buf[i12] = (byte) ((i11 & 127) | 128);
            i11 >>>= 7;
            i12++;
        }
        byte[] bArr = this.i32buf;
        bArr[i12] = (byte) i11;
        this.trans_.write(bArr, 0, i12 + 1);
    }

    private void writeVarint64(long j11) throws TException {
        int i11 = 0;
        while (((-128) & j11) != 0) {
            this.varint64out[i11] = (byte) ((127 & j11) | 128);
            j11 >>>= 7;
            i11++;
        }
        byte[] bArr = this.varint64out;
        bArr[i11] = (byte) j11;
        this.trans_.write(bArr, 0, i11 + 1);
    }

    private int zigzagToInt(int i11) {
        return (-(i11 & 1)) ^ (i11 >>> 1);
    }

    private long zigzagToLong(long j11) {
        return (-(j11 & 1)) ^ (j11 >>> 1);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public ByteBuffer readBinary() throws TException {
        int readVarint32 = readVarint32();
        checkStringReadLength(readVarint32);
        if (readVarint32 == 0) {
            return ByteBuffer.wrap(new byte[0]);
        }
        if (this.trans_.getBytesRemainingInBuffer() >= readVarint32) {
            ByteBuffer wrap = ByteBuffer.wrap(this.trans_.getBuffer(), this.trans_.getBufferPosition(), readVarint32);
            this.trans_.consumeBuffer(readVarint32);
            return wrap;
        }
        byte[] bArr = new byte[readVarint32];
        this.trans_.readAll(bArr, 0, readVarint32);
        return ByteBuffer.wrap(bArr);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public boolean readBool() throws TException {
        Boolean bool = this.boolValue_;
        if (bool == null) {
            return readByte() == 1;
        }
        boolean booleanValue = bool.booleanValue();
        this.boolValue_ = null;
        return booleanValue;
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public byte readByte() throws TException {
        if (this.trans_.getBytesRemainingInBuffer() <= 0) {
            this.trans_.readAll(this.byteRawBuf, 0, 1);
            return this.byteRawBuf[0];
        }
        byte b11 = this.trans_.getBuffer()[this.trans_.getBufferPosition()];
        this.trans_.consumeBuffer(1);
        return b11;
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public double readDouble() throws TException {
        byte[] bArr = new byte[8];
        this.trans_.readAll(bArr, 0, 8);
        return Double.longBitsToDouble(bytesToLong(bArr));
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public TField readFieldBegin() throws TException {
        byte readByte = readByte();
        if (readByte == 0) {
            return TSTOP;
        }
        short s11 = (short) ((readByte & 240) >> 4);
        byte b11 = (byte) (readByte & 15);
        TField tField = new TField("", getTType(b11), s11 == 0 ? readI16() : (short) (this.lastFieldId_ + s11));
        if (isBoolType(readByte)) {
            this.boolValue_ = b11 == 1 ? Boolean.TRUE : Boolean.FALSE;
        }
        this.lastFieldId_ = tField.f77768id;
        return tField;
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public short readI16() throws TException {
        return (short) zigzagToInt(readVarint32());
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public int readI32() throws TException {
        return zigzagToInt(readVarint32());
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public long readI64() throws TException {
        return zigzagToLong(readVarint64());
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public TList readListBegin() throws TException {
        byte readByte = readByte();
        int i11 = (readByte >> 4) & 15;
        if (i11 == 15) {
            i11 = readVarint32();
        }
        checkContainerReadLength(i11);
        return new TList(getTType(readByte), i11);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public TMap readMapBegin() throws TException {
        int readVarint32 = readVarint32();
        checkContainerReadLength(readVarint32);
        byte readByte = readVarint32 == 0 ? (byte) 0 : readByte();
        return new TMap(getTType((byte) (readByte >> 4)), getTType((byte) (readByte & 15)), readVarint32);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public TMessage readMessageBegin() throws TException {
        byte readByte = readByte();
        if (readByte != -126) {
            throw new TProtocolException("Expected protocol id " + Integer.toHexString(-126) + " but got " + Integer.toHexString(readByte));
        }
        byte readByte2 = readByte();
        byte b11 = (byte) (readByte2 & 31);
        if (b11 == 1) {
            return new TMessage(readString(), (byte) ((readByte2 >> 5) & 7), readVarint32());
        }
        throw new TProtocolException("Expected version 1 but got " + ((int) b11));
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public TSet readSetBegin() throws TException {
        return new TSet(readListBegin());
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public String readString() throws TException {
        int readVarint32 = readVarint32();
        checkStringReadLength(readVarint32);
        if (readVarint32 == 0) {
            return "";
        }
        try {
            if (this.trans_.getBytesRemainingInBuffer() < readVarint32) {
                return new String(readBinary(readVarint32), "UTF-8");
            }
            String str = new String(this.trans_.getBuffer(), this.trans_.getBufferPosition(), readVarint32, "UTF-8");
            this.trans_.consumeBuffer(readVarint32);
            return str;
        } catch (UnsupportedEncodingException unused) {
            throw new TException("UTF-8 not supported!");
        }
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public TStruct readStructBegin() throws TException {
        this.lastField_.push(this.lastFieldId_);
        this.lastFieldId_ = (short) 0;
        return ANONYMOUS_STRUCT;
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void readStructEnd() throws TException {
        this.lastFieldId_ = this.lastField_.pop();
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void reset() {
        this.lastField_.clear();
        this.lastFieldId_ = (short) 0;
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeBinary(ByteBuffer byteBuffer) throws TException {
        writeBinary(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.limit() - byteBuffer.position());
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeBool(boolean z11) throws TException {
        TField tField = this.booleanField_;
        if (tField == null) {
            writeByteDirect(z11 ? (byte) 1 : (byte) 2);
        } else {
            writeFieldBeginInternal(tField, z11 ? (byte) 1 : (byte) 2);
            this.booleanField_ = null;
        }
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeByte(byte b11) throws TException {
        writeByteDirect(b11);
    }

    public void writeCollectionBegin(byte b11, int i11) throws TException {
        if (i11 <= 14) {
            writeByteDirect(getCompactType(b11) | (i11 << 4));
        } else {
            writeByteDirect(getCompactType(b11) | 240);
            writeVarint32(i11);
        }
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeDouble(double d11) throws TException {
        byte[] bArr = {0, 0, 0, 0, 0, 0, 0, 0};
        fixedLongToBytes(Double.doubleToLongBits(d11), bArr, 0);
        this.trans_.write(bArr);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeFieldBegin(TField tField) throws TException {
        if (tField.type == 2) {
            this.booleanField_ = tField;
        } else {
            writeFieldBeginInternal(tField, (byte) -1);
        }
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeFieldStop() throws TException {
        writeByteDirect((byte) 0);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeI16(short s11) throws TException {
        writeVarint32(intToZigZag(s11));
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeI32(int i11) throws TException {
        writeVarint32(intToZigZag(i11));
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeI64(long j11) throws TException {
        writeVarint64(longToZigzag(j11));
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeListBegin(TList tList) throws TException {
        writeCollectionBegin(tList.elemType, tList.size);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeMapBegin(TMap tMap) throws TException {
        int i11 = tMap.size;
        if (i11 == 0) {
            writeByteDirect(0);
            return;
        }
        writeVarint32(i11);
        writeByteDirect(getCompactType(tMap.valueType) | (getCompactType(tMap.keyType) << 4));
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeMessageBegin(TMessage tMessage) throws TException {
        writeByteDirect((byte) -126);
        writeByteDirect(((tMessage.type << 5) & (-32)) | 1);
        writeVarint32(tMessage.seqid);
        writeString(tMessage.name);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeSetBegin(TSet tSet) throws TException {
        writeCollectionBegin(tSet.elemType, tSet.size);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeString(String str) throws TException {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            writeBinary(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new TException("UTF-8 not supported!");
        }
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeStructBegin(TStruct tStruct) throws TException {
        this.lastField_.push(this.lastFieldId_);
        this.lastFieldId_ = (short) 0;
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeStructEnd() throws TException {
        this.lastFieldId_ = this.lastField_.pop();
    }

    private void writeBinary(byte[] bArr, int i11, int i12) throws TException {
        writeVarint32(i12);
        this.trans_.write(bArr, i11, i12);
    }

    private void writeByteDirect(int i11) throws TException {
        writeByteDirect((byte) i11);
    }

    private byte[] readBinary(int i11) throws TException {
        if (i11 == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i11];
        this.trans_.readAll(bArr, 0, i11);
        return bArr;
    }

    @Deprecated
    public TCompactProtocol(TTransport tTransport, long j11) {
        this(tTransport, j11, -1L);
    }

    public TCompactProtocol(TTransport tTransport) {
        this(tTransport, -1L, -1L);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void readFieldEnd() throws TException {
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void readListEnd() throws TException {
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void readMapEnd() throws TException {
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void readMessageEnd() throws TException {
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void readSetEnd() throws TException {
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeFieldEnd() throws TException {
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeListEnd() throws TException {
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeMapEnd() throws TException {
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeMessageEnd() throws TException {
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeSetEnd() throws TException {
    }
}
