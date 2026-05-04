package org.apache.thrift;

import org.apache.thrift.protocol.TField;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.protocol.TProtocolUtil;
import org.apache.thrift.protocol.TStruct;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class TApplicationException extends TException {
    public static final int BAD_SEQUENCE_ID = 4;
    public static final int INTERNAL_ERROR = 6;
    public static final int INVALID_MESSAGE_TYPE = 2;
    public static final int INVALID_PROTOCOL = 9;
    public static final int INVALID_TRANSFORM = 8;
    public static final int MISSING_RESULT = 5;
    public static final int PROTOCOL_ERROR = 7;
    public static final int UNKNOWN = 0;
    public static final int UNKNOWN_METHOD = 1;
    public static final int UNSUPPORTED_CLIENT_TYPE = 10;
    public static final int WRONG_METHOD_NAME = 3;
    private static final long serialVersionUID = 1;
    protected int type_;
    private static final TStruct TAPPLICATION_EXCEPTION_STRUCT = new TStruct("TApplicationException");
    private static final TField MESSAGE_FIELD = new TField("message", (byte) 11, 1);
    private static final TField TYPE_FIELD = new TField("type", (byte) 8, 2);

    public TApplicationException() {
        this.type_ = 0;
    }

    public static TApplicationException read(TProtocol tProtocol) throws TException {
        tProtocol.readStructBegin();
        String str = null;
        int i11 = 0;
        while (true) {
            TField readFieldBegin = tProtocol.readFieldBegin();
            byte b11 = readFieldBegin.type;
            if (b11 == 0) {
                tProtocol.readStructEnd();
                return new TApplicationException(i11, str);
            }
            short s11 = readFieldBegin.f77768id;
            if (s11 != 1) {
                if (s11 != 2) {
                    TProtocolUtil.skip(tProtocol, b11);
                } else if (b11 == 8) {
                    i11 = tProtocol.readI32();
                } else {
                    TProtocolUtil.skip(tProtocol, b11);
                }
            } else if (b11 == 11) {
                str = tProtocol.readString();
            } else {
                TProtocolUtil.skip(tProtocol, b11);
            }
            tProtocol.readFieldEnd();
        }
    }

    public int getType() {
        return this.type_;
    }

    public void write(TProtocol tProtocol) throws TException {
        tProtocol.writeStructBegin(TAPPLICATION_EXCEPTION_STRUCT);
        if (getMessage() != null) {
            tProtocol.writeFieldBegin(MESSAGE_FIELD);
            tProtocol.writeString(getMessage());
            tProtocol.writeFieldEnd();
        }
        tProtocol.writeFieldBegin(TYPE_FIELD);
        tProtocol.writeI32(this.type_);
        tProtocol.writeFieldEnd();
        tProtocol.writeFieldStop();
        tProtocol.writeStructEnd();
    }

    public TApplicationException(int i11) {
        this.type_ = i11;
    }

    public TApplicationException(int i11, String str) {
        super(str);
        this.type_ = i11;
    }

    public TApplicationException(String str) {
        super(str);
        this.type_ = 0;
    }
}
