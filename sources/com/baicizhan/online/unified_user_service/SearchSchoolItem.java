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
public class SearchSchoolItem implements TBase<SearchSchoolItem, _Fields>, Serializable, Cloneable, Comparable<SearchSchoolItem> {
    private static final int __IS_UNIVERSITY_ISSET_ID = 1;
    private static final int __SCHOOL_ID_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String descrp;
    public boolean is_university;
    public int school_id;
    public String school_name;
    private static final TStruct STRUCT_DESC = new TStruct("SearchSchoolItem");
    private static final TField SCHOOL_NAME_FIELD_DESC = new TField("school_name", (byte) 11, 1);
    private static final TField SCHOOL_ID_FIELD_DESC = new TField("school_id", (byte) 8, 2);
    private static final TField IS_UNIVERSITY_FIELD_DESC = new TField("is_university", (byte) 2, 3);
    private static final TField DESCRP_FIELD_DESC = new TField("descrp", (byte) 11, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.unified_user_service.SearchSchoolItem$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$unified_user_service$SearchSchoolItem$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$unified_user_service$SearchSchoolItem$_Fields = iArr;
            try {
                iArr[_Fields.SCHOOL_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$SearchSchoolItem$_Fields[_Fields.SCHOOL_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$SearchSchoolItem$_Fields[_Fields.IS_UNIVERSITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$SearchSchoolItem$_Fields[_Fields.DESCRP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SearchSchoolItemStandardScheme extends StandardScheme<SearchSchoolItem> {
        private SearchSchoolItemStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, SearchSchoolItem struct) throws TException {
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
                            } else if (b11 == 11) {
                                struct.descrp = iprot.readString();
                                struct.setDescrpIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 2) {
                            struct.is_university = iprot.readBool();
                            struct.setIs_universityIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.school_id = iprot.readI32();
                        struct.setSchool_idIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.school_name = iprot.readString();
                    struct.setSchool_nameIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetSchool_id()) {
                throw new TProtocolException("Required field 'school_id' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetIs_university()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'is_university' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, SearchSchoolItem struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(SearchSchoolItem.STRUCT_DESC);
            if (struct.school_name != null) {
                oprot.writeFieldBegin(SearchSchoolItem.SCHOOL_NAME_FIELD_DESC);
                oprot.writeString(struct.school_name);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(SearchSchoolItem.SCHOOL_ID_FIELD_DESC);
            oprot.writeI32(struct.school_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(SearchSchoolItem.IS_UNIVERSITY_FIELD_DESC);
            oprot.writeBool(struct.is_university);
            oprot.writeFieldEnd();
            if (struct.descrp != null) {
                oprot.writeFieldBegin(SearchSchoolItem.DESCRP_FIELD_DESC);
                oprot.writeString(struct.descrp);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SearchSchoolItemStandardSchemeFactory implements SchemeFactory {
        private SearchSchoolItemStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SearchSchoolItemStandardScheme getScheme() {
            return new SearchSchoolItemStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SearchSchoolItemTupleScheme extends TupleScheme<SearchSchoolItem> {
        private SearchSchoolItemTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, SearchSchoolItem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.school_name = tTupleProtocol.readString();
            struct.setSchool_nameIsSet(true);
            struct.school_id = tTupleProtocol.readI32();
            struct.setSchool_idIsSet(true);
            struct.is_university = tTupleProtocol.readBool();
            struct.setIs_universityIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                struct.descrp = tTupleProtocol.readString();
                struct.setDescrpIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, SearchSchoolItem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.school_name);
            tTupleProtocol.writeI32(struct.school_id);
            tTupleProtocol.writeBool(struct.is_university);
            BitSet bitSet = new BitSet();
            if (struct.isSetDescrp()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetDescrp()) {
                tTupleProtocol.writeString(struct.descrp);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SearchSchoolItemTupleSchemeFactory implements SchemeFactory {
        private SearchSchoolItemTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SearchSchoolItemTupleScheme getScheme() {
            return new SearchSchoolItemTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        SCHOOL_NAME(1, "school_name"),
        SCHOOL_ID(2, "school_id"),
        IS_UNIVERSITY(3, "is_university"),
        DESCRP(4, "descrp");

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
                return SCHOOL_NAME;
            }
            if (fieldId == 2) {
                return SCHOOL_ID;
            }
            if (fieldId == 3) {
                return IS_UNIVERSITY;
            }
            if (fieldId != 4) {
                return null;
            }
            return DESCRP;
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
        hashMap.put(StandardScheme.class, new SearchSchoolItemStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new SearchSchoolItemTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.SCHOOL_NAME, (_Fields) new FieldMetaData("school_name", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SCHOOL_ID, (_Fields) new FieldMetaData("school_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.IS_UNIVERSITY, (_Fields) new FieldMetaData("is_university", (byte) 1, new FieldValueMetaData((byte) 2)));
        enumMap.put((EnumMap) _Fields.DESCRP, (_Fields) new FieldMetaData("descrp", (byte) 3, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(SearchSchoolItem.class, unmodifiableMap);
    }

    public SearchSchoolItem() {
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
        this.school_name = null;
        setSchool_idIsSet(false);
        this.school_id = 0;
        setIs_universityIsSet(false);
        this.is_university = false;
        this.descrp = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof SearchSchoolItem)) {
            return equals((SearchSchoolItem) that);
        }
        return false;
    }

    public String getDescrp() {
        return this.descrp;
    }

    public int getSchool_id() {
        return this.school_id;
    }

    public String getSchool_name() {
        return this.school_name;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isIs_university() {
        return this.is_university;
    }

    public boolean isSetDescrp() {
        return this.descrp != null;
    }

    public boolean isSetIs_university() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetSchool_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetSchool_name() {
        return this.school_name != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public SearchSchoolItem setDescrp(String descrp) {
        this.descrp = descrp;
        return this;
    }

    public void setDescrpIsSet(boolean value) {
        if (value) {
            return;
        }
        this.descrp = null;
    }

    public SearchSchoolItem setIs_university(boolean is_university) {
        this.is_university = is_university;
        setIs_universityIsSet(true);
        return this;
    }

    public void setIs_universityIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public SearchSchoolItem setSchool_id(int school_id) {
        this.school_id = school_id;
        setSchool_idIsSet(true);
        return this;
    }

    public void setSchool_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public SearchSchoolItem setSchool_name(String school_name) {
        this.school_name = school_name;
        return this;
    }

    public void setSchool_nameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.school_name = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SearchSchoolItem(");
        sb2.append("school_name:");
        String str = this.school_name;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("school_id:");
        sb2.append(this.school_id);
        sb2.append(j2.O);
        sb2.append("is_university:");
        sb2.append(this.is_university);
        sb2.append(j2.O);
        sb2.append("descrp:");
        String str2 = this.descrp;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetDescrp() {
        this.descrp = null;
    }

    public void unsetIs_university() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetSchool_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetSchool_name() {
        this.school_name = null;
    }

    public void validate() throws TException {
        if (this.school_name != null) {
            return;
        }
        throw new TProtocolException("Required field 'school_name' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(SearchSchoolItem other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetSchool_name()).compareTo(Boolean.valueOf(other.isSetSchool_name()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetSchool_name() && (compareTo4 = TBaseHelper.compareTo(this.school_name, other.school_name)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetSchool_id()).compareTo(Boolean.valueOf(other.isSetSchool_id()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetSchool_id() && (compareTo3 = TBaseHelper.compareTo(this.school_id, other.school_id)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetIs_university()).compareTo(Boolean.valueOf(other.isSetIs_university()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetIs_university() && (compareTo2 = TBaseHelper.compareTo(this.is_university, other.is_university)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetDescrp()).compareTo(Boolean.valueOf(other.isSetDescrp()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetDescrp() || (compareTo = TBaseHelper.compareTo(this.descrp, other.descrp)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<SearchSchoolItem, _Fields> deepCopy2() {
        return new SearchSchoolItem(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$SearchSchoolItem$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getSchool_name();
        }
        if (i11 == 2) {
            return Integer.valueOf(getSchool_id());
        }
        if (i11 == 3) {
            return Boolean.valueOf(isIs_university());
        }
        if (i11 == 4) {
            return getDescrp();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$SearchSchoolItem$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetSchool_name();
        }
        if (i11 == 2) {
            return isSetSchool_id();
        }
        if (i11 == 3) {
            return isSetIs_university();
        }
        if (i11 == 4) {
            return isSetDescrp();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$SearchSchoolItem$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetSchool_name();
                return;
            } else {
                setSchool_name((String) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetSchool_id();
                return;
            } else {
                setSchool_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetIs_university();
                return;
            } else {
                setIs_university(((Boolean) value).booleanValue());
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetDescrp();
        } else {
            setDescrp((String) value);
        }
    }

    public SearchSchoolItem(String school_name, int school_id, boolean is_university, String descrp) {
        this();
        this.school_name = school_name;
        this.school_id = school_id;
        setSchool_idIsSet(true);
        this.is_university = is_university;
        setIs_universityIsSet(true);
        this.descrp = descrp;
    }

    public boolean equals(SearchSchoolItem that) {
        if (that == null) {
            return false;
        }
        boolean isSetSchool_name = isSetSchool_name();
        boolean isSetSchool_name2 = that.isSetSchool_name();
        if (((isSetSchool_name || isSetSchool_name2) && (!isSetSchool_name || !isSetSchool_name2 || !this.school_name.equals(that.school_name))) || this.school_id != that.school_id || this.is_university != that.is_university) {
            return false;
        }
        boolean isSetDescrp = isSetDescrp();
        boolean isSetDescrp2 = that.isSetDescrp();
        if (isSetDescrp || isSetDescrp2) {
            return isSetDescrp && isSetDescrp2 && this.descrp.equals(that.descrp);
        }
        return true;
    }

    public SearchSchoolItem(SearchSchoolItem other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetSchool_name()) {
            this.school_name = other.school_name;
        }
        this.school_id = other.school_id;
        this.is_university = other.is_university;
        if (other.isSetDescrp()) {
            this.descrp = other.descrp;
        }
    }
}
