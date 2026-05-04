package org.apache.thrift;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TField;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.protocol.TProtocolUtil;
import org.apache.thrift.transport.TMemoryInputTransport;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class TDeserializer {
    private final TProtocol protocol_;
    private final TMemoryInputTransport trans_;

    public TDeserializer() {
        this(new TBinaryProtocol.Factory());
    }

    private TField locateField(byte[] bArr, TFieldIdEnum tFieldIdEnum, TFieldIdEnum... tFieldIdEnumArr) throws TException {
        this.trans_.reset(bArr);
        int length = tFieldIdEnumArr.length + 1;
        TFieldIdEnum[] tFieldIdEnumArr2 = new TFieldIdEnum[length];
        int i11 = 0;
        tFieldIdEnumArr2[0] = tFieldIdEnum;
        int i12 = 0;
        while (i12 < tFieldIdEnumArr.length) {
            int i13 = i12 + 1;
            tFieldIdEnumArr2[i13] = tFieldIdEnumArr[i12];
            i12 = i13;
        }
        this.protocol_.readStructBegin();
        TField tField = null;
        while (i11 < length) {
            tField = this.protocol_.readFieldBegin();
            if (tField.type == 0 || tField.f77768id > tFieldIdEnumArr2[i11].getThriftFieldId()) {
                return null;
            }
            if (tField.f77768id != tFieldIdEnumArr2[i11].getThriftFieldId()) {
                TProtocolUtil.skip(this.protocol_, tField.type);
                this.protocol_.readFieldEnd();
            } else {
                i11++;
                if (i11 < length) {
                    this.protocol_.readStructBegin();
                }
            }
        }
        return tField;
    }

    private Object partialDeserializeField(byte b11, byte[] bArr, TFieldIdEnum tFieldIdEnum, TFieldIdEnum... tFieldIdEnumArr) throws TException {
        try {
            try {
                TField locateField = locateField(bArr, tFieldIdEnum, tFieldIdEnumArr);
                if (locateField != null) {
                    if (b11 != 2) {
                        if (b11 != 3) {
                            if (b11 != 4) {
                                if (b11 != 6) {
                                    if (b11 != 8) {
                                        if (b11 != 100) {
                                            if (b11 != 10) {
                                                if (b11 == 11 && locateField.type == 11) {
                                                    return this.protocol_.readString();
                                                }
                                            } else if (locateField.type == 10) {
                                                return Long.valueOf(this.protocol_.readI64());
                                            }
                                        } else if (locateField.type == 11) {
                                            return this.protocol_.readBinary();
                                        }
                                    } else if (locateField.type == 8) {
                                        return Integer.valueOf(this.protocol_.readI32());
                                    }
                                } else if (locateField.type == 6) {
                                    return Short.valueOf(this.protocol_.readI16());
                                }
                            } else if (locateField.type == 4) {
                                return Double.valueOf(this.protocol_.readDouble());
                            }
                        } else if (locateField.type == 3) {
                            return Byte.valueOf(this.protocol_.readByte());
                        }
                    } else if (locateField.type == 2) {
                        return Boolean.valueOf(this.protocol_.readBool());
                    }
                }
                this.trans_.clear();
                this.protocol_.reset();
                return null;
            } catch (Exception e11) {
                throw new TException(e11);
            }
        } finally {
            this.trans_.clear();
            this.protocol_.reset();
        }
    }

    public void deserialize(TBase tBase, byte[] bArr) throws TException {
        deserialize(tBase, bArr, 0, bArr.length);
    }

    public void fromString(TBase tBase, String str) throws TException {
        deserialize(tBase, str.getBytes());
    }

    public void partialDeserialize(TBase tBase, byte[] bArr, TFieldIdEnum tFieldIdEnum, TFieldIdEnum... tFieldIdEnumArr) throws TException {
        try {
            try {
                if (locateField(bArr, tFieldIdEnum, tFieldIdEnumArr) != null) {
                    tBase.read(this.protocol_);
                }
            } catch (Exception e11) {
                throw new TException(e11);
            }
        } finally {
            this.trans_.clear();
            this.protocol_.reset();
        }
    }

    public Boolean partialDeserializeBool(byte[] bArr, TFieldIdEnum tFieldIdEnum, TFieldIdEnum... tFieldIdEnumArr) throws TException {
        return (Boolean) partialDeserializeField((byte) 2, bArr, tFieldIdEnum, tFieldIdEnumArr);
    }

    public Byte partialDeserializeByte(byte[] bArr, TFieldIdEnum tFieldIdEnum, TFieldIdEnum... tFieldIdEnumArr) throws TException {
        return (Byte) partialDeserializeField((byte) 3, bArr, tFieldIdEnum, tFieldIdEnumArr);
    }

    public ByteBuffer partialDeserializeByteArray(byte[] bArr, TFieldIdEnum tFieldIdEnum, TFieldIdEnum... tFieldIdEnumArr) throws TException {
        return (ByteBuffer) partialDeserializeField((byte) 100, bArr, tFieldIdEnum, tFieldIdEnumArr);
    }

    public Double partialDeserializeDouble(byte[] bArr, TFieldIdEnum tFieldIdEnum, TFieldIdEnum... tFieldIdEnumArr) throws TException {
        return (Double) partialDeserializeField((byte) 4, bArr, tFieldIdEnum, tFieldIdEnumArr);
    }

    public Short partialDeserializeI16(byte[] bArr, TFieldIdEnum tFieldIdEnum, TFieldIdEnum... tFieldIdEnumArr) throws TException {
        return (Short) partialDeserializeField((byte) 6, bArr, tFieldIdEnum, tFieldIdEnumArr);
    }

    public Integer partialDeserializeI32(byte[] bArr, TFieldIdEnum tFieldIdEnum, TFieldIdEnum... tFieldIdEnumArr) throws TException {
        return (Integer) partialDeserializeField((byte) 8, bArr, tFieldIdEnum, tFieldIdEnumArr);
    }

    public Long partialDeserializeI64(byte[] bArr, TFieldIdEnum tFieldIdEnum, TFieldIdEnum... tFieldIdEnumArr) throws TException {
        return (Long) partialDeserializeField((byte) 10, bArr, tFieldIdEnum, tFieldIdEnumArr);
    }

    public Short partialDeserializeSetFieldIdInUnion(byte[] bArr, TFieldIdEnum tFieldIdEnum, TFieldIdEnum... tFieldIdEnumArr) throws TException {
        try {
            try {
                if (locateField(bArr, tFieldIdEnum, tFieldIdEnumArr) != null) {
                    this.protocol_.readStructBegin();
                    return Short.valueOf(this.protocol_.readFieldBegin().f77768id);
                }
                this.trans_.clear();
                this.protocol_.reset();
                return null;
            } catch (Exception e11) {
                throw new TException(e11);
            }
        } finally {
            this.trans_.clear();
            this.protocol_.reset();
        }
    }

    public String partialDeserializeString(byte[] bArr, TFieldIdEnum tFieldIdEnum, TFieldIdEnum... tFieldIdEnumArr) throws TException {
        return (String) partialDeserializeField((byte) 11, bArr, tFieldIdEnum, tFieldIdEnumArr);
    }

    public TDeserializer(TProtocolFactory tProtocolFactory) {
        TMemoryInputTransport tMemoryInputTransport = new TMemoryInputTransport();
        this.trans_ = tMemoryInputTransport;
        this.protocol_ = tProtocolFactory.getProtocol(tMemoryInputTransport);
    }

    public void deserialize(TBase tBase, byte[] bArr, int i11, int i12) throws TException {
        try {
            this.trans_.reset(bArr, i11, i12);
            tBase.read(this.protocol_);
        } finally {
            this.trans_.clear();
            this.protocol_.reset();
        }
    }

    public void deserialize(TBase tBase, String str, String str2) throws TException {
        try {
            try {
                deserialize(tBase, str.getBytes(str2));
            } catch (UnsupportedEncodingException unused) {
                throw new TException("JVM DOES NOT SUPPORT ENCODING: " + str2);
            }
        } finally {
            this.protocol_.reset();
        }
    }
}
