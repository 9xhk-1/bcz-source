package com.baicizhan.online.unified_user_service;

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
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class SchoolMajorItem implements TBase<SchoolMajorItem, _Fields>, Serializable, Cloneable, Comparable<SchoolMajorItem> {
    private static final int __MAJOR_ID_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int major_id;
    public String major_name;
    private static final TStruct STRUCT_DESC = new TStruct("SchoolMajorItem");
    private static final TField MAJOR_NAME_FIELD_DESC = new TField("major_name", (byte) 11, 1);
    private static final TField MAJOR_ID_FIELD_DESC = new TField("major_id", (byte) 8, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.unified_user_service.SchoolMajorItem$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$unified_user_service$SchoolMajorItem$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$unified_user_service$SchoolMajorItem$_Fields = iArr;
            try {
                iArr[_Fields.MAJOR_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$SchoolMajorItem$_Fields[_Fields.MAJOR_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SchoolMajorItemStandardScheme extends StandardScheme<SchoolMajorItem> {
        private SchoolMajorItemStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, SchoolMajorItem struct) throws TException {
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
                        struct.major_id = iprot.readI32();
                        struct.setMajor_idIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.major_name = iprot.readString();
                    struct.setMajor_nameIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetMajor_id()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'major_id' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, SchoolMajorItem struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(SchoolMajorItem.STRUCT_DESC);
            if (struct.major_name != null) {
                oprot.writeFieldBegin(SchoolMajorItem.MAJOR_NAME_FIELD_DESC);
                oprot.writeString(struct.major_name);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(SchoolMajorItem.MAJOR_ID_FIELD_DESC);
            oprot.writeI32(struct.major_id);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SchoolMajorItemStandardSchemeFactory implements SchemeFactory {
        private SchoolMajorItemStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SchoolMajorItemStandardScheme getScheme() {
            return new SchoolMajorItemStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SchoolMajorItemTupleScheme extends TupleScheme<SchoolMajorItem> {
        private SchoolMajorItemTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, SchoolMajorItem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.major_name = tTupleProtocol.readString();
            struct.setMajor_nameIsSet(true);
            struct.major_id = tTupleProtocol.readI32();
            struct.setMajor_idIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, SchoolMajorItem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.major_name);
            tTupleProtocol.writeI32(struct.major_id);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SchoolMajorItemTupleSchemeFactory implements SchemeFactory {
        private SchoolMajorItemTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SchoolMajorItemTupleScheme getScheme() {
            return new SchoolMajorItemTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        MAJOR_NAME(1, "major_name"),
        MAJOR_ID(2, "major_id");

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
                return MAJOR_NAME;
            }
            if (fieldId != 2) {
                return null;
            }
            return MAJOR_ID;
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
        hashMap.put(StandardScheme.class, new SchoolMajorItemStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new SchoolMajorItemTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.MAJOR_NAME, (_Fields) new FieldMetaData("major_name", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.MAJOR_ID, (_Fields) new FieldMetaData("major_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(SchoolMajorItem.class, unmodifiableMap);
    }

    public SchoolMajorItem() {
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
        this.major_name = null;
        setMajor_idIsSet(false);
        this.major_id = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof SchoolMajorItem)) {
            return equals((SchoolMajorItem) that);
        }
        return false;
    }

    public int getMajor_id() {
        return this.major_id;
    }

    public String getMajor_name() {
        return this.major_name;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetMajor_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetMajor_name() {
        return this.major_name != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public SchoolMajorItem setMajor_id(int major_id) {
        this.major_id = major_id;
        setMajor_idIsSet(true);
        return this;
    }

    public void setMajor_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public SchoolMajorItem setMajor_name(String major_name) {
        this.major_name = major_name;
        return this;
    }

    public void setMajor_nameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.major_name = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SchoolMajorItem(");
        sb2.append("major_name:");
        String str = this.major_name;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("major_id:");
        sb2.append(this.major_id);
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetMajor_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetMajor_name() {
        this.major_name = null;
    }

    public void validate() throws TException {
        if (this.major_name != null) {
            return;
        }
        throw new TProtocolException("Required field 'major_name' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(SchoolMajorItem other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetMajor_name()).compareTo(Boolean.valueOf(other.isSetMajor_name()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetMajor_name() && (compareTo2 = TBaseHelper.compareTo(this.major_name, other.major_name)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetMajor_id()).compareTo(Boolean.valueOf(other.isSetMajor_id()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetMajor_id() || (compareTo = TBaseHelper.compareTo(this.major_id, other.major_id)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<SchoolMajorItem, _Fields> deepCopy2() {
        return new SchoolMajorItem(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$SchoolMajorItem$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getMajor_name();
        }
        if (i11 == 2) {
            return Integer.valueOf(getMajor_id());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$SchoolMajorItem$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetMajor_name();
        }
        if (i11 == 2) {
            return isSetMajor_id();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$SchoolMajorItem$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetMajor_name();
                return;
            } else {
                setMajor_name((String) value);
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetMajor_id();
        } else {
            setMajor_id(((Integer) value).intValue());
        }
    }

    public SchoolMajorItem(String major_name, int major_id) {
        this();
        this.major_name = major_name;
        this.major_id = major_id;
        setMajor_idIsSet(true);
    }

    public boolean equals(SchoolMajorItem that) {
        if (that == null) {
            return false;
        }
        boolean isSetMajor_name = isSetMajor_name();
        boolean isSetMajor_name2 = that.isSetMajor_name();
        return (!(isSetMajor_name || isSetMajor_name2) || (isSetMajor_name && isSetMajor_name2 && this.major_name.equals(that.major_name))) && this.major_id == that.major_id;
    }

    public SchoolMajorItem(SchoolMajorItem other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetMajor_name()) {
            this.major_name = other.major_name;
        }
        this.major_id = other.major_id;
    }
}
