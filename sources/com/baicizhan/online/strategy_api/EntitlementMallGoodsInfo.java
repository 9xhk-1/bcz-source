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
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class EntitlementMallGoodsInfo implements TBase<EntitlementMallGoodsInfo, _Fields>, Serializable, Cloneable, Comparable<EntitlementMallGoodsInfo> {
    private static final int __ITEM_ID_ISSET_ID = 0;
    private static final int __SUB_ITEM_ID_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String app_store_id;
    public int item_id;
    public int sub_item_id;
    private static final TStruct STRUCT_DESC = new TStruct("EntitlementMallGoodsInfo");
    private static final TField ITEM_ID_FIELD_DESC = new TField("item_id", (byte) 8, 1);
    private static final TField SUB_ITEM_ID_FIELD_DESC = new TField("sub_item_id", (byte) 8, 2);
    private static final TField APP_STORE_ID_FIELD_DESC = new TField("app_store_id", (byte) 11, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.strategy_api.EntitlementMallGoodsInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$strategy_api$EntitlementMallGoodsInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$strategy_api$EntitlementMallGoodsInfo$_Fields = iArr;
            try {
                iArr[_Fields.ITEM_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$strategy_api$EntitlementMallGoodsInfo$_Fields[_Fields.SUB_ITEM_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$strategy_api$EntitlementMallGoodsInfo$_Fields[_Fields.APP_STORE_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class EntitlementMallGoodsInfoStandardScheme extends StandardScheme<EntitlementMallGoodsInfo> {
        private EntitlementMallGoodsInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, EntitlementMallGoodsInfo struct) throws TException {
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
                            struct.app_store_id = iprot.readString();
                            struct.setApp_store_idIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.sub_item_id = iprot.readI32();
                        struct.setSub_item_idIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.item_id = iprot.readI32();
                    struct.setItem_idIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetItem_id()) {
                throw new TProtocolException("Required field 'item_id' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetSub_item_id()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'sub_item_id' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, EntitlementMallGoodsInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(EntitlementMallGoodsInfo.STRUCT_DESC);
            oprot.writeFieldBegin(EntitlementMallGoodsInfo.ITEM_ID_FIELD_DESC);
            oprot.writeI32(struct.item_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(EntitlementMallGoodsInfo.SUB_ITEM_ID_FIELD_DESC);
            oprot.writeI32(struct.sub_item_id);
            oprot.writeFieldEnd();
            if (struct.app_store_id != null) {
                oprot.writeFieldBegin(EntitlementMallGoodsInfo.APP_STORE_ID_FIELD_DESC);
                oprot.writeString(struct.app_store_id);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class EntitlementMallGoodsInfoStandardSchemeFactory implements SchemeFactory {
        private EntitlementMallGoodsInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public EntitlementMallGoodsInfoStandardScheme getScheme() {
            return new EntitlementMallGoodsInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class EntitlementMallGoodsInfoTupleScheme extends TupleScheme<EntitlementMallGoodsInfo> {
        private EntitlementMallGoodsInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, EntitlementMallGoodsInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.item_id = tTupleProtocol.readI32();
            struct.setItem_idIsSet(true);
            struct.sub_item_id = tTupleProtocol.readI32();
            struct.setSub_item_idIsSet(true);
            struct.app_store_id = tTupleProtocol.readString();
            struct.setApp_store_idIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, EntitlementMallGoodsInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.item_id);
            tTupleProtocol.writeI32(struct.sub_item_id);
            tTupleProtocol.writeString(struct.app_store_id);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class EntitlementMallGoodsInfoTupleSchemeFactory implements SchemeFactory {
        private EntitlementMallGoodsInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public EntitlementMallGoodsInfoTupleScheme getScheme() {
            return new EntitlementMallGoodsInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ITEM_ID(1, "item_id"),
        SUB_ITEM_ID(2, "sub_item_id"),
        APP_STORE_ID(3, "app_store_id");

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
                return ITEM_ID;
            }
            if (fieldId == 2) {
                return SUB_ITEM_ID;
            }
            if (fieldId != 3) {
                return null;
            }
            return APP_STORE_ID;
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
        hashMap.put(StandardScheme.class, new EntitlementMallGoodsInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new EntitlementMallGoodsInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ITEM_ID, (_Fields) new FieldMetaData("item_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.SUB_ITEM_ID, (_Fields) new FieldMetaData("sub_item_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.APP_STORE_ID, (_Fields) new FieldMetaData("app_store_id", (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(EntitlementMallGoodsInfo.class, unmodifiableMap);
    }

    public EntitlementMallGoodsInfo() {
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
        setItem_idIsSet(false);
        this.item_id = 0;
        setSub_item_idIsSet(false);
        this.sub_item_id = 0;
        this.app_store_id = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof EntitlementMallGoodsInfo)) {
            return equals((EntitlementMallGoodsInfo) that);
        }
        return false;
    }

    public String getApp_store_id() {
        return this.app_store_id;
    }

    public int getItem_id() {
        return this.item_id;
    }

    public int getSub_item_id() {
        return this.sub_item_id;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetApp_store_id() {
        return this.app_store_id != null;
    }

    public boolean isSetItem_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetSub_item_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public EntitlementMallGoodsInfo setApp_store_id(String app_store_id) {
        this.app_store_id = app_store_id;
        return this;
    }

    public void setApp_store_idIsSet(boolean value) {
        if (value) {
            return;
        }
        this.app_store_id = null;
    }

    public EntitlementMallGoodsInfo setItem_id(int item_id) {
        this.item_id = item_id;
        setItem_idIsSet(true);
        return this;
    }

    public void setItem_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public EntitlementMallGoodsInfo setSub_item_id(int sub_item_id) {
        this.sub_item_id = sub_item_id;
        setSub_item_idIsSet(true);
        return this;
    }

    public void setSub_item_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("EntitlementMallGoodsInfo(");
        sb2.append("item_id:");
        sb2.append(this.item_id);
        sb2.append(j2.O);
        sb2.append("sub_item_id:");
        sb2.append(this.sub_item_id);
        sb2.append(j2.O);
        sb2.append("app_store_id:");
        String str = this.app_store_id;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetApp_store_id() {
        this.app_store_id = null;
    }

    public void unsetItem_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetSub_item_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void validate() throws TException {
        if (this.app_store_id != null) {
            return;
        }
        throw new TProtocolException("Required field 'app_store_id' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(EntitlementMallGoodsInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetItem_id()).compareTo(Boolean.valueOf(other.isSetItem_id()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetItem_id() && (compareTo3 = TBaseHelper.compareTo(this.item_id, other.item_id)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetSub_item_id()).compareTo(Boolean.valueOf(other.isSetSub_item_id()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetSub_item_id() && (compareTo2 = TBaseHelper.compareTo(this.sub_item_id, other.sub_item_id)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetApp_store_id()).compareTo(Boolean.valueOf(other.isSetApp_store_id()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetApp_store_id() || (compareTo = TBaseHelper.compareTo(this.app_store_id, other.app_store_id)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<EntitlementMallGoodsInfo, _Fields> deepCopy2() {
        return new EntitlementMallGoodsInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$EntitlementMallGoodsInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getItem_id());
        }
        if (i11 == 2) {
            return Integer.valueOf(getSub_item_id());
        }
        if (i11 == 3) {
            return getApp_store_id();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$EntitlementMallGoodsInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetItem_id();
        }
        if (i11 == 2) {
            return isSetSub_item_id();
        }
        if (i11 == 3) {
            return isSetApp_store_id();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$EntitlementMallGoodsInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetItem_id();
                return;
            } else {
                setItem_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetSub_item_id();
                return;
            } else {
                setSub_item_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetApp_store_id();
        } else {
            setApp_store_id((String) value);
        }
    }

    public EntitlementMallGoodsInfo(int item_id, int sub_item_id, String app_store_id) {
        this();
        this.item_id = item_id;
        setItem_idIsSet(true);
        this.sub_item_id = sub_item_id;
        setSub_item_idIsSet(true);
        this.app_store_id = app_store_id;
    }

    public boolean equals(EntitlementMallGoodsInfo that) {
        if (that == null || this.item_id != that.item_id || this.sub_item_id != that.sub_item_id) {
            return false;
        }
        boolean isSetApp_store_id = isSetApp_store_id();
        boolean isSetApp_store_id2 = that.isSetApp_store_id();
        if (isSetApp_store_id || isSetApp_store_id2) {
            return isSetApp_store_id && isSetApp_store_id2 && this.app_store_id.equals(that.app_store_id);
        }
        return true;
    }

    public EntitlementMallGoodsInfo(EntitlementMallGoodsInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.item_id = other.item_id;
        this.sub_item_id = other.sub_item_id;
        if (other.isSetApp_store_id()) {
            this.app_store_id = other.app_store_id;
        }
    }
}
