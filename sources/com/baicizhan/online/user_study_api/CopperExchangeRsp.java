package com.baicizhan.online.user_study_api;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TBase;
import org.apache.thrift.TBaseHelper;
import org.apache.thrift.TException;
import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TField;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.protocol.TProtocolUtil;
import org.apache.thrift.protocol.TStruct;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.transport.TIOStreamTransport;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class CopperExchangeRsp implements TBase<CopperExchangeRsp, _Fields>, Serializable, Cloneable, Comparable<CopperExchangeRsp> {
    private static final int __CODE_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int code;
    public String message;
    private static final TStruct STRUCT_DESC = new TStruct("CopperExchangeRsp");
    private static final TField CODE_FIELD_DESC = new TField("code", (byte) 8, 1);
    private static final TField MESSAGE_FIELD_DESC = new TField("message", (byte) 11, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.CopperExchangeRsp$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$CopperExchangeRsp$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$CopperExchangeRsp$_Fields = iArr;
            try {
                iArr[_Fields.CODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$CopperExchangeRsp$_Fields[_Fields.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CopperExchangeRspStandardScheme extends StandardScheme<CopperExchangeRsp> {
        private CopperExchangeRspStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, CopperExchangeRsp struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    break;
                }
                short s11 = readFieldBegin.f77768id;
                if (s11 != 1) {
                    if (s11 != 2) {
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 11) {
                        struct.message = iprot.readString();
                        struct.setMessageIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.code = iprot.readI32();
                    struct.setCodeIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetCode()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'code' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, CopperExchangeRsp struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(CopperExchangeRsp.STRUCT_DESC);
            oprot.writeFieldBegin(CopperExchangeRsp.CODE_FIELD_DESC);
            oprot.writeI32(struct.code);
            oprot.writeFieldEnd();
            if (struct.message != null) {
                oprot.writeFieldBegin(CopperExchangeRsp.MESSAGE_FIELD_DESC);
                oprot.writeString(struct.message);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CopperExchangeRspStandardSchemeFactory implements SchemeFactory {
        private CopperExchangeRspStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public CopperExchangeRspStandardScheme getScheme() {
            return new CopperExchangeRspStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CopperExchangeRspTupleScheme extends TupleScheme<CopperExchangeRsp> {
        private CopperExchangeRspTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, CopperExchangeRsp struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.code = tTupleProtocol.readI32();
            struct.setCodeIsSet(true);
            struct.message = tTupleProtocol.readString();
            struct.setMessageIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, CopperExchangeRsp struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.code);
            tTupleProtocol.writeString(struct.message);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CopperExchangeRspTupleSchemeFactory implements SchemeFactory {
        private CopperExchangeRspTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public CopperExchangeRspTupleScheme getScheme() {
            return new CopperExchangeRspTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        CODE(1, "code"),
        MESSAGE(2, "message");

        private static final Map<String, _Fields> byName = new HashMap();
        private final String _fieldName;
        private final short _thriftId;

        static {
            Iterator it = EnumSet.allOf(_Fields.class).iterator();
            while (it.hasNext()) {
                _Fields _fields = (_Fields) it.next();
                byName.put(_fields.getFieldName(), _fields);
            }
        }

        _Fields(short thriftId, String fieldName) {
            this._thriftId = thriftId;
            this._fieldName = fieldName;
        }

        public static _Fields findByName(String name) {
            return byName.get(name);
        }

        public static _Fields findByThriftId(int fieldId) {
            if (fieldId == 1) {
                return CODE;
            }
            if (fieldId != 2) {
                return null;
            }
            return MESSAGE;
        }

        public static _Fields findByThriftIdOrThrow(int fieldId) {
            _Fields findByThriftId = findByThriftId(fieldId);
            if (findByThriftId != null) {
                return findByThriftId;
            }
            throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
        }

        @Override // org.apache.thrift.TFieldIdEnum
        public String getFieldName() {
            return this._fieldName;
        }

        @Override // org.apache.thrift.TFieldIdEnum
        public short getThriftFieldId() {
            return this._thriftId;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        schemes = hashMap;
        hashMap.put(StandardScheme.class, new CopperExchangeRspStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new CopperExchangeRspTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.CODE, (_Fields) new FieldMetaData("code", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.MESSAGE, (_Fields) new FieldMetaData("message", (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(CopperExchangeRsp.class, unmodifiableMap);
    }

    public CopperExchangeRsp() {
        this.__isset_bitfield = (byte) 0;
    }

    private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
        try {
            this.__isset_bitfield = (byte) 0;
            read(new TCompactProtocol(new TIOStreamTransport(in2)));
        } catch (TException e11) {
            throw new IOException(e11);
        }
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        try {
            write(new TCompactProtocol(new TIOStreamTransport(out)));
        } catch (TException e11) {
            throw new IOException(e11);
        }
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        setCodeIsSet(false);
        this.code = 0;
        this.message = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof CopperExchangeRsp)) {
            return equals((CopperExchangeRsp) that);
        }
        return false;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetCode() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetMessage() {
        return this.message != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public CopperExchangeRsp setCode(int code) {
        this.code = code;
        setCodeIsSet(true);
        return this;
    }

    public void setCodeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public CopperExchangeRsp setMessage(String message) {
        this.message = message;
        return this;
    }

    public void setMessageIsSet(boolean value) {
        if (value) {
            return;
        }
        this.message = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CopperExchangeRsp(");
        sb2.append("code:");
        sb2.append(this.code);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("message:");
        String str = this.message;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetCode() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetMessage() {
        this.message = null;
    }

    public void validate() throws TException {
        if (this.message != null) {
            return;
        }
        throw new TProtocolException("Required field 'message' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(CopperExchangeRsp other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetCode()).compareTo(Boolean.valueOf(other.isSetCode()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetCode() && (compareTo2 = TBaseHelper.compareTo(this.code, other.code)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetMessage()).compareTo(Boolean.valueOf(other.isSetMessage()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetMessage() || (compareTo = TBaseHelper.compareTo(this.message, other.message)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<CopperExchangeRsp, _Fields> deepCopy2() {
        return new CopperExchangeRsp(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$CopperExchangeRsp$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getCode());
        }
        if (i11 == 2) {
            return getMessage();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$CopperExchangeRsp$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetCode();
        }
        if (i11 == 2) {
            return isSetMessage();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$CopperExchangeRsp$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetCode();
                return;
            } else {
                setCode(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetMessage();
        } else {
            setMessage((String) value);
        }
    }

    public CopperExchangeRsp(int code, String message) {
        this();
        this.code = code;
        setCodeIsSet(true);
        this.message = message;
    }

    public boolean equals(CopperExchangeRsp that) {
        if (that == null || this.code != that.code) {
            return false;
        }
        boolean isSetMessage = isSetMessage();
        boolean isSetMessage2 = that.isSetMessage();
        if (isSetMessage || isSetMessage2) {
            return isSetMessage && isSetMessage2 && this.message.equals(that.message);
        }
        return true;
    }

    public CopperExchangeRsp(CopperExchangeRsp other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.code = other.code;
        if (other.isSetMessage()) {
            this.message = other.message;
        }
    }
}
