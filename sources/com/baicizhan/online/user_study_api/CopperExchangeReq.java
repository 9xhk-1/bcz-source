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
public class CopperExchangeReq implements TBase<CopperExchangeReq, _Fields>, Serializable, Cloneable, Comparable<CopperExchangeReq> {
    private static final int __EXCHANGE_TYPE_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int exchange_type;
    private static final TStruct STRUCT_DESC = new TStruct("CopperExchangeReq");
    private static final TField EXCHANGE_TYPE_FIELD_DESC = new TField("exchange_type", (byte) 8, 1);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.CopperExchangeReq$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$CopperExchangeReq$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$CopperExchangeReq$_Fields = iArr;
            try {
                iArr[_Fields.EXCHANGE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CopperExchangeReqStandardScheme extends StandardScheme<CopperExchangeReq> {
        private CopperExchangeReqStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, CopperExchangeReq struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    break;
                }
                if (readFieldBegin.f77768id != 1) {
                    TProtocolUtil.skip(iprot, b11);
                } else if (b11 == 8) {
                    struct.exchange_type = iprot.readI32();
                    struct.setExchange_typeIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetExchange_type()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'exchange_type' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, CopperExchangeReq struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(CopperExchangeReq.STRUCT_DESC);
            oprot.writeFieldBegin(CopperExchangeReq.EXCHANGE_TYPE_FIELD_DESC);
            oprot.writeI32(struct.exchange_type);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CopperExchangeReqStandardSchemeFactory implements SchemeFactory {
        private CopperExchangeReqStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public CopperExchangeReqStandardScheme getScheme() {
            return new CopperExchangeReqStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CopperExchangeReqTupleScheme extends TupleScheme<CopperExchangeReq> {
        private CopperExchangeReqTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, CopperExchangeReq struct) throws TException {
            struct.exchange_type = ((TTupleProtocol) prot).readI32();
            struct.setExchange_typeIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, CopperExchangeReq struct) throws TException {
            ((TTupleProtocol) prot).writeI32(struct.exchange_type);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CopperExchangeReqTupleSchemeFactory implements SchemeFactory {
        private CopperExchangeReqTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public CopperExchangeReqTupleScheme getScheme() {
            return new CopperExchangeReqTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        EXCHANGE_TYPE(1, "exchange_type");

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
            if (fieldId != 1) {
                return null;
            }
            return EXCHANGE_TYPE;
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
        hashMap.put(StandardScheme.class, new CopperExchangeReqStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new CopperExchangeReqTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.EXCHANGE_TYPE, (_Fields) new FieldMetaData("exchange_type", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(CopperExchangeReq.class, unmodifiableMap);
    }

    public CopperExchangeReq() {
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
        setExchange_typeIsSet(false);
        this.exchange_type = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof CopperExchangeReq)) {
            return equals((CopperExchangeReq) that);
        }
        return false;
    }

    public int getExchange_type() {
        return this.exchange_type;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetExchange_type() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public CopperExchangeReq setExchange_type(int exchange_type) {
        this.exchange_type = exchange_type;
        setExchange_typeIsSet(true);
        return this;
    }

    public void setExchange_typeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        return "CopperExchangeReq(exchange_type:" + this.exchange_type + pn.j.f81007d;
    }

    public void unsetExchange_type() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(CopperExchangeReq other) {
        int compareTo;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(isSetExchange_type()).compareTo(Boolean.valueOf(other.isSetExchange_type()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!isSetExchange_type() || (compareTo = TBaseHelper.compareTo(this.exchange_type, other.exchange_type)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<CopperExchangeReq, _Fields> deepCopy2() {
        return new CopperExchangeReq(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        if (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$CopperExchangeReq$_Fields[field.ordinal()] == 1) {
            return Integer.valueOf(getExchange_type());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        if (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$CopperExchangeReq$_Fields[field.ordinal()] == 1) {
            return isSetExchange_type();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        if (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$CopperExchangeReq$_Fields[field.ordinal()] != 1) {
            return;
        }
        if (value == null) {
            unsetExchange_type();
        } else {
            setExchange_type(((Integer) value).intValue());
        }
    }

    public CopperExchangeReq(int exchange_type) {
        this();
        this.exchange_type = exchange_type;
        setExchange_typeIsSet(true);
    }

    public boolean equals(CopperExchangeReq that) {
        return that != null && this.exchange_type == that.exchange_type;
    }

    public CopperExchangeReq(CopperExchangeReq other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.exchange_type = other.exchange_type;
    }

    public void validate() throws TException {
    }
}
