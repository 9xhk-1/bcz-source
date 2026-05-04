package org.apache.thrift.protocol;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Stack;
import org.apache.thrift.TByteArrayOutputStream;
import org.apache.thrift.TException;
import org.apache.thrift.transport.TTransport;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class TJSONProtocol extends TProtocol {
    private static final int DEF_STRING_SIZE = 16;
    private static final String ESCAPE_CHARS = "\"\\/bfnrt";
    private static final long VERSION = 1;
    private Stack<JSONBaseContext> contextStack_;
    private JSONBaseContext context_;
    private boolean fieldNamesAsString_;
    private LookaheadReader reader_;
    private byte[] tmpbuf_;
    private static final byte[] COMMA = {44};
    private static final byte[] COLON = {58};
    private static final byte[] LBRACE = {123};
    private static final byte[] RBRACE = {125};
    private static final byte[] LBRACKET = {91};
    private static final byte[] RBRACKET = {93};
    private static final byte[] QUOTE = {34};
    private static final byte[] BACKSLASH = {92};
    private static final byte[] ZERO = {48};
    private static final byte[] ESCSEQ = {92, 117, 48, 48};
    private static final byte[] JSON_CHAR_TABLE = {0, 0, 0, 0, 0, 0, 0, 0, 98, 116, 110, 0, 102, 114, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 34, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    private static final byte[] ESCAPE_CHAR_VALS = {34, 92, 47, 8, 12, 10, 13, 9};
    private static final byte[] NAME_BOOL = {116, 102};
    private static final byte[] NAME_BYTE = {105, 56};
    private static final byte[] NAME_I16 = {105, 49, 54};
    private static final byte[] NAME_I32 = {105, 51, 50};
    private static final byte[] NAME_I64 = {105, 54, 52};
    private static final byte[] NAME_DOUBLE = {100, 98, 108};
    private static final byte[] NAME_STRUCT = {114, 101, 99};
    private static final byte[] NAME_STRING = {115, 116, 114};
    private static final byte[] NAME_MAP = {109, 97, 112};
    private static final byte[] NAME_LIST = {108, 115, 116};
    private static final byte[] NAME_SET = {115, 101, 116};
    private static final TStruct ANONYMOUS_STRUCT = new TStruct();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class JSONListContext extends JSONBaseContext {
        private boolean first_;

        public JSONListContext() {
            super();
            this.first_ = true;
        }

        @Override // org.apache.thrift.protocol.TJSONProtocol.JSONBaseContext
        public void read() throws TException {
            if (this.first_) {
                this.first_ = false;
            } else {
                TJSONProtocol.this.readJSONSyntaxChar(TJSONProtocol.COMMA);
            }
        }

        @Override // org.apache.thrift.protocol.TJSONProtocol.JSONBaseContext
        public void write() throws TException {
            if (this.first_) {
                this.first_ = false;
            } else {
                TJSONProtocol.this.trans_.write(TJSONProtocol.COMMA);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class JSONPairContext extends JSONBaseContext {
        private boolean colon_;
        private boolean first_;

        public JSONPairContext() {
            super();
            this.first_ = true;
            this.colon_ = true;
        }

        @Override // org.apache.thrift.protocol.TJSONProtocol.JSONBaseContext
        public boolean escapeNum() {
            return this.colon_;
        }

        @Override // org.apache.thrift.protocol.TJSONProtocol.JSONBaseContext
        public void read() throws TException {
            if (this.first_) {
                this.first_ = false;
                this.colon_ = true;
            } else {
                TJSONProtocol.this.readJSONSyntaxChar(this.colon_ ? TJSONProtocol.COLON : TJSONProtocol.COMMA);
                this.colon_ = !this.colon_;
            }
        }

        @Override // org.apache.thrift.protocol.TJSONProtocol.JSONBaseContext
        public void write() throws TException {
            if (this.first_) {
                this.first_ = false;
                this.colon_ = true;
            } else {
                TJSONProtocol.this.trans_.write(this.colon_ ? TJSONProtocol.COLON : TJSONProtocol.COMMA);
                this.colon_ = !this.colon_;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class LookaheadReader {
        private byte[] data_ = new byte[1];
        private boolean hasData_;

        public LookaheadReader() {
        }

        public byte peek() throws TException {
            if (!this.hasData_) {
                TJSONProtocol.this.trans_.readAll(this.data_, 0, 1);
            }
            this.hasData_ = true;
            return this.data_[0];
        }

        public byte read() throws TException {
            if (this.hasData_) {
                this.hasData_ = false;
            } else {
                TJSONProtocol.this.trans_.readAll(this.data_, 0, 1);
            }
            return this.data_[0];
        }
    }

    public TJSONProtocol(TTransport tTransport) {
        super(tTransport);
        this.contextStack_ = new Stack<>();
        this.context_ = new JSONBaseContext();
        this.reader_ = new LookaheadReader();
        this.fieldNamesAsString_ = false;
        this.tmpbuf_ = new byte[4];
    }

    private static final byte getTypeIDForTypeName(byte[] bArr) throws TException {
        byte b11 = 0;
        if (bArr.length > 1) {
            byte b12 = bArr[0];
            if (b12 == 100) {
                b11 = 4;
            } else if (b12 == 105) {
                byte b13 = bArr[1];
                if (b13 == 49) {
                    b11 = 6;
                } else if (b13 == 51) {
                    b11 = 8;
                } else if (b13 == 54) {
                    b11 = 10;
                } else if (b13 == 56) {
                    b11 = 3;
                }
            } else if (b12 == 108) {
                b11 = 15;
            } else if (b12 != 109) {
                switch (b12) {
                    case 114:
                        b11 = 12;
                        break;
                    case 115:
                        byte b14 = bArr[1];
                        if (b14 != 116) {
                            if (b14 == 101) {
                                b11 = 14;
                                break;
                            }
                        } else {
                            b11 = 11;
                            break;
                        }
                        break;
                    case 116:
                        b11 = 2;
                        break;
                }
            } else {
                b11 = 13;
            }
        }
        if (b11 != 0) {
            return b11;
        }
        throw new TProtocolException(5, "Unrecognized type");
    }

    private static final byte[] getTypeNameForTypeID(byte b11) throws TException {
        switch (b11) {
            case 2:
                return NAME_BOOL;
            case 3:
                return NAME_BYTE;
            case 4:
                return NAME_DOUBLE;
            case 5:
            case 7:
            case 9:
            default:
                throw new TProtocolException(5, "Unrecognized type");
            case 6:
                return NAME_I16;
            case 8:
                return NAME_I32;
            case 10:
                return NAME_I64;
            case 11:
                return NAME_STRING;
            case 12:
                return NAME_STRUCT;
            case 13:
                return NAME_MAP;
            case 14:
                return NAME_SET;
            case 15:
                return NAME_LIST;
        }
    }

    private static final byte hexChar(byte b11) {
        byte b12 = (byte) (b11 & 15);
        return (byte) (b12 < 10 ? ((char) b12) + '0' : ((char) (b12 - 10)) + 'a');
    }

    private static final byte hexVal(byte b11) throws TException {
        int i11;
        if (b11 >= 48 && b11 <= 57) {
            i11 = ((char) b11) - '0';
        } else {
            if (b11 < 97 || b11 > 102) {
                throw new TProtocolException(1, "Expected hex character");
            }
            i11 = ((char) b11) - 'W';
        }
        return (byte) i11;
    }

    private boolean isJSONNumeric(byte b11) {
        if (b11 == 43 || b11 == 69 || b11 == 101 || b11 == 45 || b11 == 46) {
            return true;
        }
        switch (b11) {
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                return true;
            default:
                return false;
        }
    }

    private void popContext() {
        this.context_ = this.contextStack_.pop();
    }

    private void pushContext(JSONBaseContext jSONBaseContext) {
        this.contextStack_.push(this.context_);
        this.context_ = jSONBaseContext;
    }

    private void readJSONArrayEnd() throws TException {
        readJSONSyntaxChar(RBRACKET);
        popContext();
    }

    private void readJSONArrayStart() throws TException {
        this.context_.read();
        readJSONSyntaxChar(LBRACKET);
        pushContext(new JSONListContext());
    }

    private byte[] readJSONBase64() throws TException {
        TByteArrayOutputStream readJSONString = readJSONString(false);
        byte[] bArr = readJSONString.get();
        int len = readJSONString.len();
        int i11 = 0;
        int i12 = 0;
        while (len >= 4) {
            TBase64Utils.decode(bArr, i11, 4, bArr, i12);
            i11 += 4;
            len -= 4;
            i12 += 3;
        }
        if (len > 1) {
            TBase64Utils.decode(bArr, i11, len, bArr, i12);
            i12 += len - 1;
        }
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, 0, bArr2, 0, i12);
        return bArr2;
    }

    private double readJSONDouble() throws TException {
        this.context_.read();
        byte peek = this.reader_.peek();
        byte[] bArr = QUOTE;
        if (peek != bArr[0]) {
            if (this.context_.escapeNum()) {
                readJSONSyntaxChar(bArr);
            }
            try {
                return Double.valueOf(readJSONNumericChars()).doubleValue();
            } catch (NumberFormatException unused) {
                throw new TProtocolException(1, "Bad data encounted in numeric data");
            }
        }
        try {
            double doubleValue = Double.valueOf(readJSONString(true).toString("UTF-8")).doubleValue();
            if (!this.context_.escapeNum() && !Double.isNaN(doubleValue) && !Double.isInfinite(doubleValue)) {
                throw new TProtocolException(1, "Numeric data unexpectedly quoted");
            }
            return doubleValue;
        } catch (UnsupportedEncodingException unused2) {
            throw new TException("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    private long readJSONInteger() throws TException {
        this.context_.read();
        if (this.context_.escapeNum()) {
            readJSONSyntaxChar(QUOTE);
        }
        String readJSONNumericChars = readJSONNumericChars();
        if (this.context_.escapeNum()) {
            readJSONSyntaxChar(QUOTE);
        }
        try {
            return Long.valueOf(readJSONNumericChars).longValue();
        } catch (NumberFormatException unused) {
            throw new TProtocolException(1, "Bad data encounted in numeric data");
        }
    }

    private String readJSONNumericChars() throws TException {
        StringBuilder sb2 = new StringBuilder();
        while (isJSONNumeric(this.reader_.peek())) {
            sb2.append((char) this.reader_.read());
        }
        return sb2.toString();
    }

    private void readJSONObjectEnd() throws TException {
        readJSONSyntaxChar(RBRACE);
        popContext();
    }

    private void readJSONObjectStart() throws TException {
        this.context_.read();
        readJSONSyntaxChar(LBRACE);
        pushContext(new JSONPairContext());
    }

    private TByteArrayOutputStream readJSONString(boolean z11) throws TException {
        TByteArrayOutputStream tByteArrayOutputStream = new TByteArrayOutputStream(16);
        if (!z11) {
            this.context_.read();
        }
        readJSONSyntaxChar(QUOTE);
        while (true) {
            byte read = this.reader_.read();
            if (read == QUOTE[0]) {
                return tByteArrayOutputStream;
            }
            byte[] bArr = ESCSEQ;
            if (read == bArr[0]) {
                byte read2 = this.reader_.read();
                if (read2 == bArr[1]) {
                    byte[] bArr2 = ZERO;
                    readJSONSyntaxChar(bArr2);
                    readJSONSyntaxChar(bArr2);
                    this.trans_.readAll(this.tmpbuf_, 0, 2);
                    read = (byte) ((hexVal(this.tmpbuf_[0]) << 4) + hexVal(this.tmpbuf_[1]));
                } else {
                    int indexOf = "\"\\/bfnrt".indexOf(read2);
                    if (indexOf == -1) {
                        throw new TProtocolException(1, "Expected control char");
                    }
                    read = ESCAPE_CHAR_VALS[indexOf];
                }
            }
            tByteArrayOutputStream.write(read);
        }
    }

    private void writeJSONArrayEnd() throws TException {
        popContext();
        this.trans_.write(RBRACKET);
    }

    private void writeJSONArrayStart() throws TException {
        this.context_.write();
        this.trans_.write(LBRACKET);
        pushContext(new JSONListContext());
    }

    private void writeJSONBase64(byte[] bArr, int i11, int i12) throws TException {
        this.context_.write();
        this.trans_.write(QUOTE);
        while (i12 >= 3) {
            TBase64Utils.encode(bArr, i11, 3, this.tmpbuf_, 0);
            this.trans_.write(this.tmpbuf_, 0, 4);
            i11 += 3;
            i12 -= 3;
        }
        if (i12 > 0) {
            TBase64Utils.encode(bArr, i11, i12, this.tmpbuf_, 0);
            this.trans_.write(this.tmpbuf_, 0, i12 + 1);
        }
        this.trans_.write(QUOTE);
    }

    private void writeJSONDouble(double d11) throws TException {
        this.context_.write();
        String d12 = Double.toString(d11);
        char charAt = d12.charAt(0);
        boolean z11 = true;
        if (charAt == '-' ? d12.charAt(1) != 'I' : charAt != 'I' && charAt != 'N') {
            if (!this.context_.escapeNum()) {
                z11 = false;
            }
        }
        if (z11) {
            this.trans_.write(QUOTE);
        }
        try {
            byte[] bytes = d12.getBytes("UTF-8");
            this.trans_.write(bytes, 0, bytes.length);
            if (z11) {
                this.trans_.write(QUOTE);
            }
        } catch (UnsupportedEncodingException unused) {
            throw new TException("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    private void writeJSONInteger(long j11) throws TException {
        this.context_.write();
        String l11 = Long.toString(j11);
        boolean escapeNum = this.context_.escapeNum();
        if (escapeNum) {
            this.trans_.write(QUOTE);
        }
        try {
            this.trans_.write(l11.getBytes("UTF-8"));
            if (escapeNum) {
                this.trans_.write(QUOTE);
            }
        } catch (UnsupportedEncodingException unused) {
            throw new TException("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    private void writeJSONObjectEnd() throws TException {
        popContext();
        this.trans_.write(RBRACE);
    }

    private void writeJSONObjectStart() throws TException {
        this.context_.write();
        this.trans_.write(LBRACE);
        pushContext(new JSONPairContext());
    }

    private void writeJSONString(byte[] bArr) throws TException {
        this.context_.write();
        this.trans_.write(QUOTE);
        int length = bArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            byte b11 = bArr[i11];
            if ((b11 & 255) >= 48) {
                byte[] bArr2 = BACKSLASH;
                if (b11 == bArr2[0]) {
                    this.trans_.write(bArr2);
                    this.trans_.write(bArr2);
                } else {
                    this.trans_.write(bArr, i11, 1);
                }
            } else {
                byte[] bArr3 = this.tmpbuf_;
                byte b12 = JSON_CHAR_TABLE[b11];
                bArr3[0] = b12;
                if (b12 == 1) {
                    this.trans_.write(bArr, i11, 1);
                } else if (b12 > 1) {
                    this.trans_.write(BACKSLASH);
                    this.trans_.write(this.tmpbuf_, 0, 1);
                } else {
                    this.trans_.write(ESCSEQ);
                    this.tmpbuf_[0] = hexChar((byte) (bArr[i11] >> 4));
                    this.tmpbuf_[1] = hexChar(bArr[i11]);
                    this.trans_.write(this.tmpbuf_, 0, 2);
                }
            }
        }
        this.trans_.write(QUOTE);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public ByteBuffer readBinary() throws TException {
        return ByteBuffer.wrap(readJSONBase64());
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public boolean readBool() throws TException {
        return readJSONInteger() != 0;
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public byte readByte() throws TException {
        return (byte) readJSONInteger();
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public double readDouble() throws TException {
        return readJSONDouble();
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public TField readFieldBegin() throws TException {
        short readJSONInteger;
        byte b11 = 0;
        if (this.reader_.peek() == RBRACE[0]) {
            readJSONInteger = 0;
        } else {
            readJSONInteger = (short) readJSONInteger();
            readJSONObjectStart();
            b11 = getTypeIDForTypeName(readJSONString(false).get());
        }
        return new TField("", b11, readJSONInteger);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void readFieldEnd() throws TException {
        readJSONObjectEnd();
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public short readI16() throws TException {
        return (short) readJSONInteger();
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public int readI32() throws TException {
        return (int) readJSONInteger();
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public long readI64() throws TException {
        return readJSONInteger();
    }

    public void readJSONSyntaxChar(byte[] bArr) throws TException {
        byte read = this.reader_.read();
        if (read == bArr[0]) {
            return;
        }
        throw new TProtocolException(1, "Unexpected character:" + ((char) read));
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public TList readListBegin() throws TException {
        readJSONArrayStart();
        return new TList(getTypeIDForTypeName(readJSONString(false).get()), (int) readJSONInteger());
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void readListEnd() throws TException {
        readJSONArrayEnd();
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public TMap readMapBegin() throws TException {
        readJSONArrayStart();
        byte typeIDForTypeName = getTypeIDForTypeName(readJSONString(false).get());
        byte typeIDForTypeName2 = getTypeIDForTypeName(readJSONString(false).get());
        int readJSONInteger = (int) readJSONInteger();
        readJSONObjectStart();
        return new TMap(typeIDForTypeName, typeIDForTypeName2, readJSONInteger);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void readMapEnd() throws TException {
        readJSONObjectEnd();
        readJSONArrayEnd();
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public TMessage readMessageBegin() throws TException {
        readJSONArrayStart();
        if (readJSONInteger() != 1) {
            throw new TProtocolException(4, "Message contained bad version.");
        }
        try {
            return new TMessage(readJSONString(false).toString("UTF-8"), (byte) readJSONInteger(), (int) readJSONInteger());
        } catch (UnsupportedEncodingException unused) {
            throw new TException("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void readMessageEnd() throws TException {
        readJSONArrayEnd();
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public TSet readSetBegin() throws TException {
        readJSONArrayStart();
        return new TSet(getTypeIDForTypeName(readJSONString(false).get()), (int) readJSONInteger());
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void readSetEnd() throws TException {
        readJSONArrayEnd();
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public String readString() throws TException {
        try {
            return readJSONString(false).toString("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new TException("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public TStruct readStructBegin() throws TException {
        readJSONObjectStart();
        return ANONYMOUS_STRUCT;
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void readStructEnd() throws TException {
        readJSONObjectEnd();
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void reset() {
        this.contextStack_.clear();
        this.context_ = new JSONBaseContext();
        this.reader_ = new LookaheadReader();
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeBinary(ByteBuffer byteBuffer) throws TException {
        writeJSONBase64(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), (byteBuffer.limit() - byteBuffer.position()) - byteBuffer.arrayOffset());
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeBool(boolean z11) throws TException {
        writeJSONInteger(z11 ? 1L : 0L);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeByte(byte b11) throws TException {
        writeJSONInteger(b11);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeDouble(double d11) throws TException {
        writeJSONDouble(d11);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeFieldBegin(TField tField) throws TException {
        if (this.fieldNamesAsString_) {
            writeString(tField.name);
        } else {
            writeJSONInteger(tField.f77768id);
        }
        writeJSONObjectStart();
        writeJSONString(getTypeNameForTypeID(tField.type));
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeFieldEnd() throws TException {
        writeJSONObjectEnd();
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeI16(short s11) throws TException {
        writeJSONInteger(s11);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeI32(int i11) throws TException {
        writeJSONInteger(i11);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeI64(long j11) throws TException {
        writeJSONInteger(j11);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeListBegin(TList tList) throws TException {
        writeJSONArrayStart();
        writeJSONString(getTypeNameForTypeID(tList.elemType));
        writeJSONInteger(tList.size);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeListEnd() throws TException {
        writeJSONArrayEnd();
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeMapBegin(TMap tMap) throws TException {
        writeJSONArrayStart();
        writeJSONString(getTypeNameForTypeID(tMap.keyType));
        writeJSONString(getTypeNameForTypeID(tMap.valueType));
        writeJSONInteger(tMap.size);
        writeJSONObjectStart();
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeMapEnd() throws TException {
        writeJSONObjectEnd();
        writeJSONArrayEnd();
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeMessageBegin(TMessage tMessage) throws TException {
        writeJSONArrayStart();
        writeJSONInteger(1L);
        try {
            writeJSONString(tMessage.name.getBytes("UTF-8"));
            writeJSONInteger(tMessage.type);
            writeJSONInteger(tMessage.seqid);
        } catch (UnsupportedEncodingException unused) {
            throw new TException("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeMessageEnd() throws TException {
        writeJSONArrayEnd();
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeSetBegin(TSet tSet) throws TException {
        writeJSONArrayStart();
        writeJSONString(getTypeNameForTypeID(tSet.elemType));
        writeJSONInteger(tSet.size);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeSetEnd() throws TException {
        writeJSONArrayEnd();
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeString(String str) throws TException {
        try {
            writeJSONString(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            throw new TException("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeStructBegin(TStruct tStruct) throws TException {
        writeJSONObjectStart();
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeStructEnd() throws TException {
        writeJSONObjectEnd();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Factory implements TProtocolFactory {
        protected boolean fieldNamesAsString_;

        public Factory() {
            this.fieldNamesAsString_ = false;
        }

        @Override // org.apache.thrift.protocol.TProtocolFactory
        public TProtocol getProtocol(TTransport tTransport) {
            return new TJSONProtocol(tTransport, this.fieldNamesAsString_);
        }

        public Factory(boolean z11) {
            this.fieldNamesAsString_ = z11;
        }
    }

    public TJSONProtocol(TTransport tTransport, boolean z11) {
        super(tTransport);
        this.contextStack_ = new Stack<>();
        this.context_ = new JSONBaseContext();
        this.reader_ = new LookaheadReader();
        this.tmpbuf_ = new byte[4];
        this.fieldNamesAsString_ = z11;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class JSONBaseContext {
        public JSONBaseContext() {
        }

        public boolean escapeNum() {
            return false;
        }

        public void read() throws TException {
        }

        public void write() throws TException {
        }
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeFieldStop() {
    }
}
