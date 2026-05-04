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
public class SchoolInfoRequest implements TBase<SchoolInfoRequest, _Fields>, Serializable, Cloneable, Comparable<SchoolInfoRequest> {
    private static final int __MAJOR_ID_ISSET_ID = 2;
    private static final int __SCHOOL_BG_ISSET_ID = 3;
    private static final int __SCHOOL_ID_ISSET_ID = 0;
    private static final int __SCHOOL_YEAR_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int major_id;
    private _Fields[] optionals;
    public int school_bg;
    public int school_id;
    public long school_year;
    private static final TStruct STRUCT_DESC = new TStruct("SchoolInfoRequest");
    private static final TField SCHOOL_ID_FIELD_DESC = new TField("school_id", (byte) 8, 1);
    private static final TField SCHOOL_YEAR_FIELD_DESC = new TField("school_year", (byte) 10, 2);
    private static final TField MAJOR_ID_FIELD_DESC = new TField("major_id", (byte) 8, 3);
    private static final TField SCHOOL_BG_FIELD_DESC = new TField("school_bg", (byte) 8, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.unified_user_service.SchoolInfoRequest$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$unified_user_service$SchoolInfoRequest$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$unified_user_service$SchoolInfoRequest$_Fields = iArr;
            try {
                iArr[_Fields.SCHOOL_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$SchoolInfoRequest$_Fields[_Fields.SCHOOL_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$SchoolInfoRequest$_Fields[_Fields.MAJOR_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$SchoolInfoRequest$_Fields[_Fields.SCHOOL_BG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SchoolInfoRequestStandardScheme extends StandardScheme<SchoolInfoRequest> {
        private SchoolInfoRequestStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, SchoolInfoRequest struct) throws TException {
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
                            if (s11 != 4) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 8) {
                                struct.school_bg = iprot.readI32();
                                struct.setSchool_bgIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 8) {
                            struct.major_id = iprot.readI32();
                            struct.setMajor_idIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 10) {
                        struct.school_year = iprot.readI64();
                        struct.setSchool_yearIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.school_id = iprot.readI32();
                    struct.setSchool_idIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetSchool_id()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'school_id' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, SchoolInfoRequest struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(SchoolInfoRequest.STRUCT_DESC);
            oprot.writeFieldBegin(SchoolInfoRequest.SCHOOL_ID_FIELD_DESC);
            oprot.writeI32(struct.school_id);
            oprot.writeFieldEnd();
            if (struct.isSetSchool_year()) {
                oprot.writeFieldBegin(SchoolInfoRequest.SCHOOL_YEAR_FIELD_DESC);
                oprot.writeI64(struct.school_year);
                oprot.writeFieldEnd();
            }
            if (struct.isSetMajor_id()) {
                oprot.writeFieldBegin(SchoolInfoRequest.MAJOR_ID_FIELD_DESC);
                oprot.writeI32(struct.major_id);
                oprot.writeFieldEnd();
            }
            if (struct.isSetSchool_bg()) {
                oprot.writeFieldBegin(SchoolInfoRequest.SCHOOL_BG_FIELD_DESC);
                oprot.writeI32(struct.school_bg);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SchoolInfoRequestStandardSchemeFactory implements SchemeFactory {
        private SchoolInfoRequestStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SchoolInfoRequestStandardScheme getScheme() {
            return new SchoolInfoRequestStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SchoolInfoRequestTupleScheme extends TupleScheme<SchoolInfoRequest> {
        private SchoolInfoRequestTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, SchoolInfoRequest struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.school_id = tTupleProtocol.readI32();
            struct.setSchool_idIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(3);
            if (readBitSet.get(0)) {
                struct.school_year = tTupleProtocol.readI64();
                struct.setSchool_yearIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.major_id = tTupleProtocol.readI32();
                struct.setMajor_idIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.school_bg = tTupleProtocol.readI32();
                struct.setSchool_bgIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, SchoolInfoRequest struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.school_id);
            BitSet bitSet = new BitSet();
            if (struct.isSetSchool_year()) {
                bitSet.set(0);
            }
            if (struct.isSetMajor_id()) {
                bitSet.set(1);
            }
            if (struct.isSetSchool_bg()) {
                bitSet.set(2);
            }
            tTupleProtocol.writeBitSet(bitSet, 3);
            if (struct.isSetSchool_year()) {
                tTupleProtocol.writeI64(struct.school_year);
            }
            if (struct.isSetMajor_id()) {
                tTupleProtocol.writeI32(struct.major_id);
            }
            if (struct.isSetSchool_bg()) {
                tTupleProtocol.writeI32(struct.school_bg);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SchoolInfoRequestTupleSchemeFactory implements SchemeFactory {
        private SchoolInfoRequestTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SchoolInfoRequestTupleScheme getScheme() {
            return new SchoolInfoRequestTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        SCHOOL_ID(1, "school_id"),
        SCHOOL_YEAR(2, "school_year"),
        MAJOR_ID(3, "major_id"),
        SCHOOL_BG(4, "school_bg");

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
                return SCHOOL_ID;
            }
            if (fieldId == 2) {
                return SCHOOL_YEAR;
            }
            if (fieldId == 3) {
                return MAJOR_ID;
            }
            if (fieldId != 4) {
                return null;
            }
            return SCHOOL_BG;
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
        hashMap.put(StandardScheme.class, new SchoolInfoRequestStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new SchoolInfoRequestTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.SCHOOL_ID, (_Fields) new FieldMetaData("school_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.SCHOOL_YEAR, (_Fields) new FieldMetaData("school_year", (byte) 2, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.MAJOR_ID, (_Fields) new FieldMetaData("major_id", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.SCHOOL_BG, (_Fields) new FieldMetaData("school_bg", (byte) 2, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(SchoolInfoRequest.class, unmodifiableMap);
    }

    public SchoolInfoRequest() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.SCHOOL_YEAR, _Fields.MAJOR_ID, _Fields.SCHOOL_BG};
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
        setSchool_idIsSet(false);
        this.school_id = 0;
        setSchool_yearIsSet(false);
        this.school_year = 0L;
        setMajor_idIsSet(false);
        this.major_id = 0;
        setSchool_bgIsSet(false);
        this.school_bg = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof SchoolInfoRequest)) {
            return equals((SchoolInfoRequest) that);
        }
        return false;
    }

    public int getMajor_id() {
        return this.major_id;
    }

    public int getSchool_bg() {
        return this.school_bg;
    }

    public int getSchool_id() {
        return this.school_id;
    }

    public long getSchool_year() {
        return this.school_year;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetMajor_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetSchool_bg() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetSchool_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetSchool_year() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public SchoolInfoRequest setMajor_id(int major_id) {
        this.major_id = major_id;
        setMajor_idIsSet(true);
        return this;
    }

    public void setMajor_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public SchoolInfoRequest setSchool_bg(int school_bg) {
        this.school_bg = school_bg;
        setSchool_bgIsSet(true);
        return this;
    }

    public void setSchool_bgIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public SchoolInfoRequest setSchool_id(int school_id) {
        this.school_id = school_id;
        setSchool_idIsSet(true);
        return this;
    }

    public void setSchool_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public SchoolInfoRequest setSchool_year(long school_year) {
        this.school_year = school_year;
        setSchool_yearIsSet(true);
        return this;
    }

    public void setSchool_yearIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SchoolInfoRequest(");
        sb2.append("school_id:");
        sb2.append(this.school_id);
        if (isSetSchool_year()) {
            sb2.append(j2.O);
            sb2.append("school_year:");
            sb2.append(this.school_year);
        }
        if (isSetMajor_id()) {
            sb2.append(j2.O);
            sb2.append("major_id:");
            sb2.append(this.major_id);
        }
        if (isSetSchool_bg()) {
            sb2.append(j2.O);
            sb2.append("school_bg:");
            sb2.append(this.school_bg);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetMajor_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetSchool_bg() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetSchool_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetSchool_year() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(SchoolInfoRequest other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetSchool_id()).compareTo(Boolean.valueOf(other.isSetSchool_id()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetSchool_id() && (compareTo4 = TBaseHelper.compareTo(this.school_id, other.school_id)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetSchool_year()).compareTo(Boolean.valueOf(other.isSetSchool_year()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetSchool_year() && (compareTo3 = TBaseHelper.compareTo(this.school_year, other.school_year)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetMajor_id()).compareTo(Boolean.valueOf(other.isSetMajor_id()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetMajor_id() && (compareTo2 = TBaseHelper.compareTo(this.major_id, other.major_id)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetSchool_bg()).compareTo(Boolean.valueOf(other.isSetSchool_bg()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetSchool_bg() || (compareTo = TBaseHelper.compareTo(this.school_bg, other.school_bg)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<SchoolInfoRequest, _Fields> deepCopy2() {
        return new SchoolInfoRequest(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$SchoolInfoRequest$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getSchool_id());
        }
        if (i11 == 2) {
            return Long.valueOf(getSchool_year());
        }
        if (i11 == 3) {
            return Integer.valueOf(getMajor_id());
        }
        if (i11 == 4) {
            return Integer.valueOf(getSchool_bg());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$SchoolInfoRequest$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetSchool_id();
        }
        if (i11 == 2) {
            return isSetSchool_year();
        }
        if (i11 == 3) {
            return isSetMajor_id();
        }
        if (i11 == 4) {
            return isSetSchool_bg();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$SchoolInfoRequest$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetSchool_id();
                return;
            } else {
                setSchool_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetSchool_year();
                return;
            } else {
                setSchool_year(((Long) value).longValue());
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetMajor_id();
                return;
            } else {
                setMajor_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetSchool_bg();
        } else {
            setSchool_bg(((Integer) value).intValue());
        }
    }

    public boolean equals(SchoolInfoRequest that) {
        if (that == null || this.school_id != that.school_id) {
            return false;
        }
        boolean isSetSchool_year = isSetSchool_year();
        boolean isSetSchool_year2 = that.isSetSchool_year();
        if ((isSetSchool_year || isSetSchool_year2) && !(isSetSchool_year && isSetSchool_year2 && this.school_year == that.school_year)) {
            return false;
        }
        boolean isSetMajor_id = isSetMajor_id();
        boolean isSetMajor_id2 = that.isSetMajor_id();
        if ((isSetMajor_id || isSetMajor_id2) && !(isSetMajor_id && isSetMajor_id2 && this.major_id == that.major_id)) {
            return false;
        }
        boolean isSetSchool_bg = isSetSchool_bg();
        boolean isSetSchool_bg2 = that.isSetSchool_bg();
        if (isSetSchool_bg || isSetSchool_bg2) {
            return isSetSchool_bg && isSetSchool_bg2 && this.school_bg == that.school_bg;
        }
        return true;
    }

    public SchoolInfoRequest(int school_id) {
        this();
        this.school_id = school_id;
        setSchool_idIsSet(true);
    }

    public SchoolInfoRequest(SchoolInfoRequest other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.SCHOOL_YEAR, _Fields.MAJOR_ID, _Fields.SCHOOL_BG};
        this.__isset_bitfield = other.__isset_bitfield;
        this.school_id = other.school_id;
        this.school_year = other.school_year;
        this.major_id = other.major_id;
        this.school_bg = other.school_bg;
    }

    public void validate() throws TException {
    }
}
