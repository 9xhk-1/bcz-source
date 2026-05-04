package org.apache.thrift.protocol;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Stack;
import l50.b;
import org.apache.thrift.TException;
import org.apache.thrift.transport.TTransport;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class TSimpleJSONProtocol extends TProtocol {
    private static final String LIST = "list";
    private static final String MAP = "map";
    private static final char QUOTE = '\"';
    private static final String SET = "set";
    protected final Context BASE_CONTEXT;
    protected Stack<Context> writeContextStack_;
    protected Context writeContext_;
    private static final byte[] COMMA = {44};
    private static final byte[] COLON = {58};
    private static final byte[] LBRACE = {123};
    private static final byte[] RBRACE = {125};
    private static final byte[] LBRACKET = {91};
    private static final byte[] RBRACKET = {93};
    private static final TStruct ANONYMOUS_STRUCT = new TStruct();
    private static final TField ANONYMOUS_FIELD = new TField();
    private static final TMessage EMPTY_MESSAGE = new TMessage();
    private static final TSet EMPTY_SET = new TSet();
    private static final TList EMPTY_LIST = new TList();
    private static final TMap EMPTY_MAP = new TMap();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CollectionMapKeyException extends TException {
        public CollectionMapKeyException(String str) {
            super(str);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Factory implements TProtocolFactory {
        @Override // org.apache.thrift.protocol.TProtocolFactory
        public TProtocol getProtocol(TTransport tTransport) {
            return new TSimpleJSONProtocol(tTransport);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class ListContext extends Context {
        protected boolean first_;

        public ListContext() {
            super();
            this.first_ = true;
        }

        @Override // org.apache.thrift.protocol.TSimpleJSONProtocol.Context
        public void write() throws TException {
            if (this.first_) {
                this.first_ = false;
            } else {
                TSimpleJSONProtocol.this.trans_.write(TSimpleJSONProtocol.COMMA);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class MapContext extends StructContext {
        protected boolean isKey;

        public MapContext() {
            super();
            this.isKey = true;
        }

        @Override // org.apache.thrift.protocol.TSimpleJSONProtocol.Context
        public boolean isMapKey() {
            return this.isKey;
        }

        @Override // org.apache.thrift.protocol.TSimpleJSONProtocol.StructContext, org.apache.thrift.protocol.TSimpleJSONProtocol.Context
        public void write() throws TException {
            super.write();
            this.isKey = !this.isKey;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class StructContext extends Context {
        protected boolean colon_;
        protected boolean first_;

        public StructContext() {
            super();
            this.first_ = true;
            this.colon_ = true;
        }

        @Override // org.apache.thrift.protocol.TSimpleJSONProtocol.Context
        public void write() throws TException {
            if (this.first_) {
                this.first_ = false;
                this.colon_ = true;
            } else {
                TSimpleJSONProtocol.this.trans_.write(this.colon_ ? TSimpleJSONProtocol.COLON : TSimpleJSONProtocol.COMMA);
                this.colon_ = !this.colon_;
            }
        }
    }

    public TSimpleJSONProtocol(TTransport tTransport) {
        super(tTransport);
        Context context = new Context();
        this.BASE_CONTEXT = context;
        this.writeContextStack_ = new Stack<>();
        this.writeContext_ = context;
    }

    public void _writeStringData(String str) throws TException {
        try {
            this.trans_.write(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            throw new TException("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    public void assertContextIsNotMapKey(String str) throws CollectionMapKeyException {
        if (this.writeContext_.isMapKey()) {
            throw new CollectionMapKeyException("Cannot serialize a map with keys that are of type " + str);
        }
    }

    public void popWriteContext() {
        this.writeContext_ = this.writeContextStack_.pop();
    }

    public void pushWriteContext(Context context) {
        this.writeContextStack_.push(this.writeContext_);
        this.writeContext_ = context;
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public ByteBuffer readBinary() throws TException {
        return ByteBuffer.wrap(new byte[0]);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public boolean readBool() throws TException {
        return readByte() == 1;
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public byte readByte() throws TException {
        return (byte) 0;
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public double readDouble() throws TException {
        return 0.0d;
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public TField readFieldBegin() throws TException {
        return ANONYMOUS_FIELD;
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public short readI16() throws TException {
        return (short) 0;
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public int readI32() throws TException {
        return 0;
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public long readI64() throws TException {
        return 0L;
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public TList readListBegin() throws TException {
        return EMPTY_LIST;
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public TMap readMapBegin() throws TException {
        return EMPTY_MAP;
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public TMessage readMessageBegin() throws TException {
        return EMPTY_MESSAGE;
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public TSet readSetBegin() throws TException {
        return EMPTY_SET;
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public String readString() throws TException {
        return "";
    }

    public String readStringBody(int i11) throws TException {
        return "";
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public TStruct readStructBegin() {
        return ANONYMOUS_STRUCT;
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeBinary(ByteBuffer byteBuffer) throws TException {
        try {
            writeString(new String(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), (byteBuffer.limit() - byteBuffer.position()) - byteBuffer.arrayOffset(), "UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            throw new TException("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeBool(boolean z11) throws TException {
        writeByte(z11 ? (byte) 1 : (byte) 0);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeByte(byte b11) throws TException {
        writeI32(b11);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeDouble(double d11) throws TException {
        if (this.writeContext_.isMapKey()) {
            writeString(Double.toString(d11));
        } else {
            this.writeContext_.write();
            _writeStringData(Double.toString(d11));
        }
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeFieldBegin(TField tField) throws TException {
        writeString(tField.name);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeI16(short s11) throws TException {
        writeI32(s11);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeI32(int i11) throws TException {
        if (this.writeContext_.isMapKey()) {
            writeString(Integer.toString(i11));
        } else {
            this.writeContext_.write();
            _writeStringData(Integer.toString(i11));
        }
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeI64(long j11) throws TException {
        if (this.writeContext_.isMapKey()) {
            writeString(Long.toString(j11));
        } else {
            this.writeContext_.write();
            _writeStringData(Long.toString(j11));
        }
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeListBegin(TList tList) throws TException {
        assertContextIsNotMapKey(LIST);
        this.writeContext_.write();
        this.trans_.write(LBRACKET);
        pushWriteContext(new ListContext());
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeListEnd() throws TException {
        popWriteContext();
        this.trans_.write(RBRACKET);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeMapBegin(TMap tMap) throws TException {
        assertContextIsNotMapKey(MAP);
        this.writeContext_.write();
        this.trans_.write(LBRACE);
        pushWriteContext(new MapContext());
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeMapEnd() throws TException {
        popWriteContext();
        this.trans_.write(RBRACE);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeMessageBegin(TMessage tMessage) throws TException {
        this.trans_.write(LBRACKET);
        pushWriteContext(new ListContext());
        writeString(tMessage.name);
        writeByte(tMessage.type);
        writeI32(tMessage.seqid);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeMessageEnd() throws TException {
        popWriteContext();
        this.trans_.write(RBRACKET);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeSetBegin(TSet tSet) throws TException {
        assertContextIsNotMapKey("set");
        this.writeContext_.write();
        this.trans_.write(LBRACKET);
        pushWriteContext(new ListContext());
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeSetEnd() throws TException {
        popWriteContext();
        this.trans_.write(RBRACKET);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeString(String str) throws TException {
        this.writeContext_.write();
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer(length + 16);
        stringBuffer.append('\"');
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (charAt == '\f') {
                stringBuffer.append('\\');
                stringBuffer.append('f');
            } else if (charAt == '\r') {
                stringBuffer.append('\\');
                stringBuffer.append('r');
            } else if (charAt != '\"' && charAt != '\\') {
                switch (charAt) {
                    case '\b':
                        stringBuffer.append('\\');
                        stringBuffer.append('b');
                        break;
                    case '\t':
                        stringBuffer.append('\\');
                        stringBuffer.append('t');
                        break;
                    case '\n':
                        stringBuffer.append('\\');
                        stringBuffer.append('n');
                        break;
                    default:
                        if (charAt < ' ') {
                            String hexString = Integer.toHexString(charAt);
                            stringBuffer.append('\\');
                            stringBuffer.append(b.f69934p);
                            for (int i12 = 4; i12 > hexString.length(); i12--) {
                                stringBuffer.append('0');
                            }
                            stringBuffer.append(hexString);
                            break;
                        } else {
                            stringBuffer.append(charAt);
                            break;
                        }
                }
            } else {
                stringBuffer.append('\\');
                stringBuffer.append(charAt);
            }
        }
        stringBuffer.append('\"');
        _writeStringData(stringBuffer.toString());
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeStructBegin(TStruct tStruct) throws TException {
        this.writeContext_.write();
        this.trans_.write(LBRACE);
        pushWriteContext(new StructContext());
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeStructEnd() throws TException {
        popWriteContext();
        this.trans_.write(RBRACE);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class Context {
        public Context() {
        }

        public boolean isMapKey() {
            return false;
        }

        public void write() throws TException {
        }
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
    public void writeFieldStop() {
    }
}
