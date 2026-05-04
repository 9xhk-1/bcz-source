package com.baicizhan.online.mall_proxy;

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
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class ChildAddress implements TBase<ChildAddress, _Fields>, Serializable, Cloneable, Comparable<ChildAddress> {
    private static final int __ID_ISSET_ID = 0;
    private static final int __PARENT_ID_ISSET_ID = 1;
    private static final int __TYPE_ISSET_ID = 2;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;

    /* renamed from: id, reason: collision with root package name */
    public int f28155id;
    public String name;
    public int parent_id;
    public int type;
    private static final TStruct STRUCT_DESC = new TStruct("ChildAddress");
    private static final TField ID_FIELD_DESC = new TField("id", (byte) 8, 1);
    private static final TField NAME_FIELD_DESC = new TField("name", (byte) 11, 2);
    private static final TField PARENT_ID_FIELD_DESC = new TField("parent_id", (byte) 8, 3);
    private static final TField TYPE_FIELD_DESC = new TField("type", (byte) 8, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.mall_proxy.ChildAddress$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$mall_proxy$ChildAddress$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$mall_proxy$ChildAddress$_Fields = iArr;
            try {
                iArr[_Fields.ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$mall_proxy$ChildAddress$_Fields[_Fields.NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$mall_proxy$ChildAddress$_Fields[_Fields.PARENT_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$mall_proxy$ChildAddress$_Fields[_Fields.TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ChildAddressStandardScheme extends StandardScheme<ChildAddress> {
        private ChildAddressStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, ChildAddress struct) throws TException {
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
                                struct.type = iprot.readI32();
                                struct.setTypeIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 8) {
                            struct.parent_id = iprot.readI32();
                            struct.setParent_idIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.name = iprot.readString();
                        struct.setNameIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.f28155id = iprot.readI32();
                    struct.setIdIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetId()) {
                throw new TProtocolException("Required field 'id' was not found in serialized data! Struct: " + toString());
            }
            if (!struct.isSetParent_id()) {
                throw new TProtocolException("Required field 'parent_id' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetType()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'type' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, ChildAddress struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(ChildAddress.STRUCT_DESC);
            oprot.writeFieldBegin(ChildAddress.ID_FIELD_DESC);
            oprot.writeI32(struct.f28155id);
            oprot.writeFieldEnd();
            if (struct.name != null) {
                oprot.writeFieldBegin(ChildAddress.NAME_FIELD_DESC);
                oprot.writeString(struct.name);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(ChildAddress.PARENT_ID_FIELD_DESC);
            oprot.writeI32(struct.parent_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(ChildAddress.TYPE_FIELD_DESC);
            oprot.writeI32(struct.type);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ChildAddressStandardSchemeFactory implements SchemeFactory {
        private ChildAddressStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ChildAddressStandardScheme getScheme() {
            return new ChildAddressStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ChildAddressTupleScheme extends TupleScheme<ChildAddress> {
        private ChildAddressTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, ChildAddress struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.f28155id = tTupleProtocol.readI32();
            struct.setIdIsSet(true);
            struct.name = tTupleProtocol.readString();
            struct.setNameIsSet(true);
            struct.parent_id = tTupleProtocol.readI32();
            struct.setParent_idIsSet(true);
            struct.type = tTupleProtocol.readI32();
            struct.setTypeIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, ChildAddress struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.f28155id);
            tTupleProtocol.writeString(struct.name);
            tTupleProtocol.writeI32(struct.parent_id);
            tTupleProtocol.writeI32(struct.type);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ChildAddressTupleSchemeFactory implements SchemeFactory {
        private ChildAddressTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ChildAddressTupleScheme getScheme() {
            return new ChildAddressTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ID(1, "id"),
        NAME(2, "name"),
        PARENT_ID(3, "parent_id"),
        TYPE(4, "type");

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
                return ID;
            }
            if (fieldId == 2) {
                return NAME;
            }
            if (fieldId == 3) {
                return PARENT_ID;
            }
            if (fieldId != 4) {
                return null;
            }
            return TYPE;
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
        hashMap.put(StandardScheme.class, new ChildAddressStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new ChildAddressTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ID, (_Fields) new FieldMetaData("id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.NAME, (_Fields) new FieldMetaData("name", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.PARENT_ID, (_Fields) new FieldMetaData("parent_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.TYPE, (_Fields) new FieldMetaData("type", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(ChildAddress.class, unmodifiableMap);
    }

    public ChildAddress() {
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
        setIdIsSet(false);
        this.f28155id = 0;
        this.name = null;
        setParent_idIsSet(false);
        this.parent_id = 0;
        setTypeIsSet(false);
        this.type = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof ChildAddress)) {
            return equals((ChildAddress) that);
        }
        return false;
    }

    public int getId() {
        return this.f28155id;
    }

    public String getName() {
        return this.name;
    }

    public int getParent_id() {
        return this.parent_id;
    }

    public int getType() {
        return this.type;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetId() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetName() {
        return this.name != null;
    }

    public boolean isSetParent_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetType() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public ChildAddress setId(int id2) {
        this.f28155id = id2;
        setIdIsSet(true);
        return this;
    }

    public void setIdIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public ChildAddress setName(String name) {
        this.name = name;
        return this;
    }

    public void setNameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.name = null;
    }

    public ChildAddress setParent_id(int parent_id) {
        this.parent_id = parent_id;
        setParent_idIsSet(true);
        return this;
    }

    public void setParent_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public ChildAddress setType(int type) {
        this.type = type;
        setTypeIsSet(true);
        return this;
    }

    public void setTypeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ChildAddress(");
        sb2.append("id:");
        sb2.append(this.f28155id);
        sb2.append(j2.O);
        sb2.append("name:");
        String str = this.name;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("parent_id:");
        sb2.append(this.parent_id);
        sb2.append(j2.O);
        sb2.append("type:");
        sb2.append(this.type);
        sb2.append(j.f81007d);
        return sb2.toString();
    }

    public void unsetId() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetName() {
        this.name = null;
    }

    public void unsetParent_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetType() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void validate() throws TException {
        if (this.name != null) {
            return;
        }
        throw new TProtocolException("Required field 'name' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(ChildAddress other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetId()).compareTo(Boolean.valueOf(other.isSetId()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetId() && (compareTo4 = TBaseHelper.compareTo(this.f28155id, other.f28155id)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetName()).compareTo(Boolean.valueOf(other.isSetName()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetName() && (compareTo3 = TBaseHelper.compareTo(this.name, other.name)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetParent_id()).compareTo(Boolean.valueOf(other.isSetParent_id()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetParent_id() && (compareTo2 = TBaseHelper.compareTo(this.parent_id, other.parent_id)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetType()).compareTo(Boolean.valueOf(other.isSetType()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetType() || (compareTo = TBaseHelper.compareTo(this.type, other.type)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<ChildAddress, _Fields> deepCopy2() {
        return new ChildAddress(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$ChildAddress$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getId());
        }
        if (i11 == 2) {
            return getName();
        }
        if (i11 == 3) {
            return Integer.valueOf(getParent_id());
        }
        if (i11 == 4) {
            return Integer.valueOf(getType());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$ChildAddress$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetId();
        }
        if (i11 == 2) {
            return isSetName();
        }
        if (i11 == 3) {
            return isSetParent_id();
        }
        if (i11 == 4) {
            return isSetType();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$ChildAddress$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetId();
                return;
            } else {
                setId(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetName();
                return;
            } else {
                setName((String) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetParent_id();
                return;
            } else {
                setParent_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetType();
        } else {
            setType(((Integer) value).intValue());
        }
    }

    public ChildAddress(int id2, String name, int parent_id, int type) {
        this();
        this.f28155id = id2;
        setIdIsSet(true);
        this.name = name;
        this.parent_id = parent_id;
        setParent_idIsSet(true);
        this.type = type;
        setTypeIsSet(true);
    }

    public boolean equals(ChildAddress that) {
        if (that == null || this.f28155id != that.f28155id) {
            return false;
        }
        boolean isSetName = isSetName();
        boolean isSetName2 = that.isSetName();
        return (!(isSetName || isSetName2) || (isSetName && isSetName2 && this.name.equals(that.name))) && this.parent_id == that.parent_id && this.type == that.type;
    }

    public ChildAddress(ChildAddress other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.f28155id = other.f28155id;
        if (other.isSetName()) {
            this.name = other.name;
        }
        this.parent_id = other.parent_id;
        this.type = other.type;
    }
}
