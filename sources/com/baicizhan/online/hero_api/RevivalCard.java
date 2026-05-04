package com.baicizhan.online.hero_api;

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
import org.apache.thrift.meta_data.EnumMetaData;
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
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class RevivalCard implements TBase<RevivalCard, _Fields>, Serializable, Cloneable, Comparable<RevivalCard> {
    private static final int __COUNT_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int count;
    public RevivalCardStatus status;
    private static final TStruct STRUCT_DESC = new TStruct("RevivalCard");
    private static final TField COUNT_FIELD_DESC = new TField("count", (byte) 8, 1);
    private static final TField STATUS_FIELD_DESC = new TField("status", (byte) 8, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.hero_api.RevivalCard$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$hero_api$RevivalCard$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$hero_api$RevivalCard$_Fields = iArr;
            try {
                iArr[_Fields.COUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$hero_api$RevivalCard$_Fields[_Fields.STATUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RevivalCardStandardScheme extends StandardScheme<RevivalCard> {
        private RevivalCardStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, RevivalCard struct) throws TException {
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
                    } else if (b11 == 8) {
                        struct.status = RevivalCardStatus.findByValue(iprot.readI32());
                        struct.setStatusIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.count = iprot.readI32();
                    struct.setCountIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetCount()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'count' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, RevivalCard struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(RevivalCard.STRUCT_DESC);
            oprot.writeFieldBegin(RevivalCard.COUNT_FIELD_DESC);
            oprot.writeI32(struct.count);
            oprot.writeFieldEnd();
            if (struct.status != null) {
                oprot.writeFieldBegin(RevivalCard.STATUS_FIELD_DESC);
                oprot.writeI32(struct.status.getValue());
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RevivalCardStandardSchemeFactory implements SchemeFactory {
        private RevivalCardStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public RevivalCardStandardScheme getScheme() {
            return new RevivalCardStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RevivalCardTupleScheme extends TupleScheme<RevivalCard> {
        private RevivalCardTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, RevivalCard struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.count = tTupleProtocol.readI32();
            struct.setCountIsSet(true);
            struct.status = RevivalCardStatus.findByValue(tTupleProtocol.readI32());
            struct.setStatusIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, RevivalCard struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.count);
            tTupleProtocol.writeI32(struct.status.getValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RevivalCardTupleSchemeFactory implements SchemeFactory {
        private RevivalCardTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public RevivalCardTupleScheme getScheme() {
            return new RevivalCardTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        COUNT(1, "count"),
        STATUS(2, "status");

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
                return COUNT;
            }
            if (fieldId != 2) {
                return null;
            }
            return STATUS;
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
        hashMap.put(StandardScheme.class, new RevivalCardStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new RevivalCardTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.COUNT, (_Fields) new FieldMetaData("count", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.STATUS, (_Fields) new FieldMetaData("status", (byte) 1, new EnumMetaData((byte) 16, RevivalCardStatus.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(RevivalCard.class, unmodifiableMap);
    }

    public RevivalCard() {
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
        setCountIsSet(false);
        this.count = 0;
        this.status = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof RevivalCard)) {
            return equals((RevivalCard) that);
        }
        return false;
    }

    public int getCount() {
        return this.count;
    }

    public RevivalCardStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetCount() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetStatus() {
        return this.status != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public RevivalCard setCount(int count) {
        this.count = count;
        setCountIsSet(true);
        return this;
    }

    public void setCountIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public RevivalCard setStatus(RevivalCardStatus status) {
        this.status = status;
        return this;
    }

    public void setStatusIsSet(boolean value) {
        if (value) {
            return;
        }
        this.status = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RevivalCard(");
        sb2.append("count:");
        sb2.append(this.count);
        sb2.append(j2.O);
        sb2.append("status:");
        RevivalCardStatus revivalCardStatus = this.status;
        if (revivalCardStatus == null) {
            sb2.append("null");
        } else {
            sb2.append(revivalCardStatus);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetCount() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetStatus() {
        this.status = null;
    }

    public void validate() throws TException {
        if (this.status != null) {
            return;
        }
        throw new TProtocolException("Required field 'status' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(RevivalCard other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetCount()).compareTo(Boolean.valueOf(other.isSetCount()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetCount() && (compareTo2 = TBaseHelper.compareTo(this.count, other.count)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetStatus()).compareTo(Boolean.valueOf(other.isSetStatus()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetStatus() || (compareTo = TBaseHelper.compareTo((Comparable) this.status, (Comparable) other.status)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<RevivalCard, _Fields> deepCopy2() {
        return new RevivalCard(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$RevivalCard$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getCount());
        }
        if (i11 == 2) {
            return getStatus();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$RevivalCard$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetCount();
        }
        if (i11 == 2) {
            return isSetStatus();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$RevivalCard$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetCount();
                return;
            } else {
                setCount(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetStatus();
        } else {
            setStatus((RevivalCardStatus) value);
        }
    }

    public RevivalCard(int count, RevivalCardStatus status) {
        this();
        this.count = count;
        setCountIsSet(true);
        this.status = status;
    }

    public boolean equals(RevivalCard that) {
        if (that == null || this.count != that.count) {
            return false;
        }
        boolean isSetStatus = isSetStatus();
        boolean isSetStatus2 = that.isSetStatus();
        if (isSetStatus || isSetStatus2) {
            return isSetStatus && isSetStatus2 && this.status.equals(that.status);
        }
        return true;
    }

    public RevivalCard(RevivalCard other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.count = other.count;
        if (other.isSetStatus()) {
            this.status = other.status;
        }
    }
}
