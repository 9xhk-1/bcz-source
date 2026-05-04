package com.baicizhan.online.unified_user_service;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.BitSet;
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
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class SchoolMajorRequest implements TBase<SchoolMajorRequest, _Fields>, Serializable, Cloneable, Comparable<SchoolMajorRequest> {
    private static final int __PAGE_NUM_ISSET_ID = 0;
    private static final int __PAGE_SIZE_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String major_key;
    private _Fields[] optionals;
    public int page_num;
    public int page_size;
    private static final TStruct STRUCT_DESC = new TStruct("SchoolMajorRequest");
    private static final TField PAGE_NUM_FIELD_DESC = new TField("page_num", (byte) 8, 1);
    private static final TField PAGE_SIZE_FIELD_DESC = new TField("page_size", (byte) 8, 2);
    private static final TField MAJOR_KEY_FIELD_DESC = new TField("major_key", (byte) 11, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.unified_user_service.SchoolMajorRequest$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$unified_user_service$SchoolMajorRequest$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$unified_user_service$SchoolMajorRequest$_Fields = iArr;
            try {
                iArr[_Fields.PAGE_NUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$SchoolMajorRequest$_Fields[_Fields.PAGE_SIZE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$SchoolMajorRequest$_Fields[_Fields.MAJOR_KEY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SchoolMajorRequestStandardScheme extends StandardScheme<SchoolMajorRequest> {
        private SchoolMajorRequestStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, SchoolMajorRequest struct) throws TException {
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
                        if (s11 != 3) {
                            TProtocolUtil.skip(iprot, b11);
                        } else if (b11 == 11) {
                            struct.major_key = iprot.readString();
                            struct.setMajor_keyIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.page_size = iprot.readI32();
                        struct.setPage_sizeIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.page_num = iprot.readI32();
                    struct.setPage_numIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetPage_num()) {
                throw new TProtocolException("Required field 'page_num' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetPage_size()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'page_size' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, SchoolMajorRequest struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(SchoolMajorRequest.STRUCT_DESC);
            oprot.writeFieldBegin(SchoolMajorRequest.PAGE_NUM_FIELD_DESC);
            oprot.writeI32(struct.page_num);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(SchoolMajorRequest.PAGE_SIZE_FIELD_DESC);
            oprot.writeI32(struct.page_size);
            oprot.writeFieldEnd();
            if (struct.major_key != null && struct.isSetMajor_key()) {
                oprot.writeFieldBegin(SchoolMajorRequest.MAJOR_KEY_FIELD_DESC);
                oprot.writeString(struct.major_key);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SchoolMajorRequestStandardSchemeFactory implements SchemeFactory {
        private SchoolMajorRequestStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SchoolMajorRequestStandardScheme getScheme() {
            return new SchoolMajorRequestStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SchoolMajorRequestTupleScheme extends TupleScheme<SchoolMajorRequest> {
        private SchoolMajorRequestTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, SchoolMajorRequest struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.page_num = tTupleProtocol.readI32();
            struct.setPage_numIsSet(true);
            struct.page_size = tTupleProtocol.readI32();
            struct.setPage_sizeIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                struct.major_key = tTupleProtocol.readString();
                struct.setMajor_keyIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, SchoolMajorRequest struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.page_num);
            tTupleProtocol.writeI32(struct.page_size);
            BitSet bitSet = new BitSet();
            if (struct.isSetMajor_key()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetMajor_key()) {
                tTupleProtocol.writeString(struct.major_key);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SchoolMajorRequestTupleSchemeFactory implements SchemeFactory {
        private SchoolMajorRequestTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SchoolMajorRequestTupleScheme getScheme() {
            return new SchoolMajorRequestTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        PAGE_NUM(1, "page_num"),
        PAGE_SIZE(2, "page_size"),
        MAJOR_KEY(3, "major_key");

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
                return PAGE_NUM;
            }
            if (fieldId == 2) {
                return PAGE_SIZE;
            }
            if (fieldId != 3) {
                return null;
            }
            return MAJOR_KEY;
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
        hashMap.put(StandardScheme.class, new SchoolMajorRequestStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new SchoolMajorRequestTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.PAGE_NUM, (_Fields) new FieldMetaData("page_num", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.PAGE_SIZE, (_Fields) new FieldMetaData("page_size", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.MAJOR_KEY, (_Fields) new FieldMetaData("major_key", (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(SchoolMajorRequest.class, unmodifiableMap);
    }

    public SchoolMajorRequest() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.MAJOR_KEY};
        this.page_num = 0;
        this.page_size = 20;
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
        this.page_num = 0;
        this.page_size = 20;
        this.major_key = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof SchoolMajorRequest)) {
            return equals((SchoolMajorRequest) that);
        }
        return false;
    }

    public String getMajor_key() {
        return this.major_key;
    }

    public int getPage_num() {
        return this.page_num;
    }

    public int getPage_size() {
        return this.page_size;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetMajor_key() {
        return this.major_key != null;
    }

    public boolean isSetPage_num() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetPage_size() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public SchoolMajorRequest setMajor_key(String major_key) {
        this.major_key = major_key;
        return this;
    }

    public void setMajor_keyIsSet(boolean value) {
        if (value) {
            return;
        }
        this.major_key = null;
    }

    public SchoolMajorRequest setPage_num(int page_num) {
        this.page_num = page_num;
        setPage_numIsSet(true);
        return this;
    }

    public void setPage_numIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public SchoolMajorRequest setPage_size(int page_size) {
        this.page_size = page_size;
        setPage_sizeIsSet(true);
        return this;
    }

    public void setPage_sizeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SchoolMajorRequest(");
        sb2.append("page_num:");
        sb2.append(this.page_num);
        sb2.append(j2.O);
        sb2.append("page_size:");
        sb2.append(this.page_size);
        if (isSetMajor_key()) {
            sb2.append(j2.O);
            sb2.append("major_key:");
            String str = this.major_key;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetMajor_key() {
        this.major_key = null;
    }

    public void unsetPage_num() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetPage_size() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(SchoolMajorRequest other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetPage_num()).compareTo(Boolean.valueOf(other.isSetPage_num()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetPage_num() && (compareTo3 = TBaseHelper.compareTo(this.page_num, other.page_num)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetPage_size()).compareTo(Boolean.valueOf(other.isSetPage_size()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetPage_size() && (compareTo2 = TBaseHelper.compareTo(this.page_size, other.page_size)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetMajor_key()).compareTo(Boolean.valueOf(other.isSetMajor_key()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetMajor_key() || (compareTo = TBaseHelper.compareTo(this.major_key, other.major_key)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<SchoolMajorRequest, _Fields> deepCopy2() {
        return new SchoolMajorRequest(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$SchoolMajorRequest$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getPage_num());
        }
        if (i11 == 2) {
            return Integer.valueOf(getPage_size());
        }
        if (i11 == 3) {
            return getMajor_key();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$SchoolMajorRequest$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetPage_num();
        }
        if (i11 == 2) {
            return isSetPage_size();
        }
        if (i11 == 3) {
            return isSetMajor_key();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$SchoolMajorRequest$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetPage_num();
                return;
            } else {
                setPage_num(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetPage_size();
                return;
            } else {
                setPage_size(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetMajor_key();
        } else {
            setMajor_key((String) value);
        }
    }

    public boolean equals(SchoolMajorRequest that) {
        if (that == null || this.page_num != that.page_num || this.page_size != that.page_size) {
            return false;
        }
        boolean isSetMajor_key = isSetMajor_key();
        boolean isSetMajor_key2 = that.isSetMajor_key();
        if (isSetMajor_key || isSetMajor_key2) {
            return isSetMajor_key && isSetMajor_key2 && this.major_key.equals(that.major_key);
        }
        return true;
    }

    public SchoolMajorRequest(int page_num, int page_size) {
        this();
        this.page_num = page_num;
        setPage_numIsSet(true);
        this.page_size = page_size;
        setPage_sizeIsSet(true);
    }

    public SchoolMajorRequest(SchoolMajorRequest other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.MAJOR_KEY};
        this.__isset_bitfield = other.__isset_bitfield;
        this.page_num = other.page_num;
        this.page_size = other.page_size;
        if (other.isSetMajor_key()) {
            this.major_key = other.major_key;
        }
    }

    public void validate() throws TException {
    }
}
