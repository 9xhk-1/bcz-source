package com.baicizhan.online.strategy_api;

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
/* loaded from: classes5.dex */
public class RedHeartSaleInfo implements TBase<RedHeartSaleInfo, _Fields>, Serializable, Cloneable, Comparable<RedHeartSaleInfo> {
    private static final int __NEED_CREDIT_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int need_credit;
    private static final TStruct STRUCT_DESC = new TStruct("RedHeartSaleInfo");
    private static final TField NEED_CREDIT_FIELD_DESC = new TField("need_credit", (byte) 8, 1);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.strategy_api.RedHeartSaleInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$strategy_api$RedHeartSaleInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$strategy_api$RedHeartSaleInfo$_Fields = iArr;
            try {
                iArr[_Fields.NEED_CREDIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RedHeartSaleInfoStandardScheme extends StandardScheme<RedHeartSaleInfo> {
        private RedHeartSaleInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, RedHeartSaleInfo struct) throws TException {
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
                    struct.need_credit = iprot.readI32();
                    struct.setNeed_creditIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetNeed_credit()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'need_credit' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, RedHeartSaleInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(RedHeartSaleInfo.STRUCT_DESC);
            oprot.writeFieldBegin(RedHeartSaleInfo.NEED_CREDIT_FIELD_DESC);
            oprot.writeI32(struct.need_credit);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RedHeartSaleInfoStandardSchemeFactory implements SchemeFactory {
        private RedHeartSaleInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public RedHeartSaleInfoStandardScheme getScheme() {
            return new RedHeartSaleInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RedHeartSaleInfoTupleScheme extends TupleScheme<RedHeartSaleInfo> {
        private RedHeartSaleInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, RedHeartSaleInfo struct) throws TException {
            struct.need_credit = ((TTupleProtocol) prot).readI32();
            struct.setNeed_creditIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, RedHeartSaleInfo struct) throws TException {
            ((TTupleProtocol) prot).writeI32(struct.need_credit);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RedHeartSaleInfoTupleSchemeFactory implements SchemeFactory {
        private RedHeartSaleInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public RedHeartSaleInfoTupleScheme getScheme() {
            return new RedHeartSaleInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        NEED_CREDIT(1, "need_credit");

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
            return NEED_CREDIT;
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
        hashMap.put(StandardScheme.class, new RedHeartSaleInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new RedHeartSaleInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.NEED_CREDIT, (_Fields) new FieldMetaData("need_credit", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(RedHeartSaleInfo.class, unmodifiableMap);
    }

    public RedHeartSaleInfo() {
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
        setNeed_creditIsSet(false);
        this.need_credit = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof RedHeartSaleInfo)) {
            return equals((RedHeartSaleInfo) that);
        }
        return false;
    }

    public int getNeed_credit() {
        return this.need_credit;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetNeed_credit() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public RedHeartSaleInfo setNeed_credit(int need_credit) {
        this.need_credit = need_credit;
        setNeed_creditIsSet(true);
        return this;
    }

    public void setNeed_creditIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        return "RedHeartSaleInfo(need_credit:" + this.need_credit + pn.j.f81007d;
    }

    public void unsetNeed_credit() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(RedHeartSaleInfo other) {
        int compareTo;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(isSetNeed_credit()).compareTo(Boolean.valueOf(other.isSetNeed_credit()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!isSetNeed_credit() || (compareTo = TBaseHelper.compareTo(this.need_credit, other.need_credit)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<RedHeartSaleInfo, _Fields> deepCopy2() {
        return new RedHeartSaleInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        if (AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$RedHeartSaleInfo$_Fields[field.ordinal()] == 1) {
            return Integer.valueOf(getNeed_credit());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        if (AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$RedHeartSaleInfo$_Fields[field.ordinal()] == 1) {
            return isSetNeed_credit();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        if (AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$RedHeartSaleInfo$_Fields[field.ordinal()] != 1) {
            return;
        }
        if (value == null) {
            unsetNeed_credit();
        } else {
            setNeed_credit(((Integer) value).intValue());
        }
    }

    public RedHeartSaleInfo(int need_credit) {
        this();
        this.need_credit = need_credit;
        setNeed_creditIsSet(true);
    }

    public boolean equals(RedHeartSaleInfo that) {
        return that != null && this.need_credit == that.need_credit;
    }

    public RedHeartSaleInfo(RedHeartSaleInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.need_credit = other.need_credit;
    }

    public void validate() throws TException {
    }
}
