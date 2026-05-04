package com.baicizhan.online.mall_proxy;

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
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class UserAddressReq implements TBase<UserAddressReq, _Fields>, Serializable, Cloneable, Comparable<UserAddressReq> {
    private static final int __CHOICE_ISSET_ID = 5;
    private static final int __CITY_ID_ISSET_ID = 2;
    private static final int __DISTRICT_ID_ISSET_ID = 3;
    private static final int __ID_ISSET_ID = 0;
    private static final int __PROVINCE_ID_ISSET_ID = 1;
    private static final int __STATUS_ISSET_ID = 4;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public boolean choice;
    public int city_id;
    public String detail;
    public int district_id;

    /* renamed from: id, reason: collision with root package name */
    public int f28157id;
    public String mobile;
    public String name;
    private _Fields[] optionals;
    public int province_id;
    public int status;
    private static final TStruct STRUCT_DESC = new TStruct("UserAddressReq");
    private static final TField ID_FIELD_DESC = new TField("id", (byte) 8, 1);
    private static final TField NAME_FIELD_DESC = new TField("name", (byte) 11, 2);
    private static final TField MOBILE_FIELD_DESC = new TField("mobile", (byte) 11, 3);
    private static final TField PROVINCE_ID_FIELD_DESC = new TField("province_id", (byte) 8, 4);
    private static final TField CITY_ID_FIELD_DESC = new TField("city_id", (byte) 8, 5);
    private static final TField DISTRICT_ID_FIELD_DESC = new TField("district_id", (byte) 8, 6);
    private static final TField DETAIL_FIELD_DESC = new TField("detail", (byte) 11, 7);
    private static final TField STATUS_FIELD_DESC = new TField("status", (byte) 8, 8);
    private static final TField CHOICE_FIELD_DESC = new TField("choice", (byte) 2, 9);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.mall_proxy.UserAddressReq$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$mall_proxy$UserAddressReq$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$mall_proxy$UserAddressReq$_Fields = iArr;
            try {
                iArr[_Fields.ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$mall_proxy$UserAddressReq$_Fields[_Fields.NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$mall_proxy$UserAddressReq$_Fields[_Fields.MOBILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$mall_proxy$UserAddressReq$_Fields[_Fields.PROVINCE_ID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$mall_proxy$UserAddressReq$_Fields[_Fields.CITY_ID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$mall_proxy$UserAddressReq$_Fields[_Fields.DISTRICT_ID.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$mall_proxy$UserAddressReq$_Fields[_Fields.DETAIL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$mall_proxy$UserAddressReq$_Fields[_Fields.STATUS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$baicizhan$online$mall_proxy$UserAddressReq$_Fields[_Fields.CHOICE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserAddressReqStandardScheme extends StandardScheme<UserAddressReq> {
        private UserAddressReqStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserAddressReq struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetId()) {
                        throw new TProtocolException("Required field 'id' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetProvince_id()) {
                        throw new TProtocolException("Required field 'province_id' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetCity_id()) {
                        throw new TProtocolException("Required field 'city_id' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetDistrict_id()) {
                        throw new TProtocolException("Required field 'district_id' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetStatus()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'status' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.f28157id = iprot.readI32();
                            struct.setIdIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.name = iprot.readString();
                            struct.setNameIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.mobile = iprot.readString();
                            struct.setMobileIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.province_id = iprot.readI32();
                            struct.setProvince_idIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.city_id = iprot.readI32();
                            struct.setCity_idIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.district_id = iprot.readI32();
                            struct.setDistrict_idIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.detail = iprot.readString();
                            struct.setDetailIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.status = iprot.readI32();
                            struct.setStatusIsSet(true);
                            break;
                        }
                    case 9:
                        if (b11 != 2) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.choice = iprot.readBool();
                            struct.setChoiceIsSet(true);
                            break;
                        }
                    default:
                        TProtocolUtil.skip(iprot, b11);
                        break;
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, UserAddressReq struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserAddressReq.STRUCT_DESC);
            oprot.writeFieldBegin(UserAddressReq.ID_FIELD_DESC);
            oprot.writeI32(struct.f28157id);
            oprot.writeFieldEnd();
            if (struct.name != null) {
                oprot.writeFieldBegin(UserAddressReq.NAME_FIELD_DESC);
                oprot.writeString(struct.name);
                oprot.writeFieldEnd();
            }
            if (struct.mobile != null) {
                oprot.writeFieldBegin(UserAddressReq.MOBILE_FIELD_DESC);
                oprot.writeString(struct.mobile);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(UserAddressReq.PROVINCE_ID_FIELD_DESC);
            oprot.writeI32(struct.province_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserAddressReq.CITY_ID_FIELD_DESC);
            oprot.writeI32(struct.city_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserAddressReq.DISTRICT_ID_FIELD_DESC);
            oprot.writeI32(struct.district_id);
            oprot.writeFieldEnd();
            if (struct.detail != null) {
                oprot.writeFieldBegin(UserAddressReq.DETAIL_FIELD_DESC);
                oprot.writeString(struct.detail);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(UserAddressReq.STATUS_FIELD_DESC);
            oprot.writeI32(struct.status);
            oprot.writeFieldEnd();
            if (struct.isSetChoice()) {
                oprot.writeFieldBegin(UserAddressReq.CHOICE_FIELD_DESC);
                oprot.writeBool(struct.choice);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserAddressReqStandardSchemeFactory implements SchemeFactory {
        private UserAddressReqStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserAddressReqStandardScheme getScheme() {
            return new UserAddressReqStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserAddressReqTupleScheme extends TupleScheme<UserAddressReq> {
        private UserAddressReqTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserAddressReq struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.f28157id = tTupleProtocol.readI32();
            struct.setIdIsSet(true);
            struct.name = tTupleProtocol.readString();
            struct.setNameIsSet(true);
            struct.mobile = tTupleProtocol.readString();
            struct.setMobileIsSet(true);
            struct.province_id = tTupleProtocol.readI32();
            struct.setProvince_idIsSet(true);
            struct.city_id = tTupleProtocol.readI32();
            struct.setCity_idIsSet(true);
            struct.district_id = tTupleProtocol.readI32();
            struct.setDistrict_idIsSet(true);
            struct.detail = tTupleProtocol.readString();
            struct.setDetailIsSet(true);
            struct.status = tTupleProtocol.readI32();
            struct.setStatusIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                struct.choice = tTupleProtocol.readBool();
                struct.setChoiceIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserAddressReq struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.f28157id);
            tTupleProtocol.writeString(struct.name);
            tTupleProtocol.writeString(struct.mobile);
            tTupleProtocol.writeI32(struct.province_id);
            tTupleProtocol.writeI32(struct.city_id);
            tTupleProtocol.writeI32(struct.district_id);
            tTupleProtocol.writeString(struct.detail);
            tTupleProtocol.writeI32(struct.status);
            BitSet bitSet = new BitSet();
            if (struct.isSetChoice()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetChoice()) {
                tTupleProtocol.writeBool(struct.choice);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserAddressReqTupleSchemeFactory implements SchemeFactory {
        private UserAddressReqTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserAddressReqTupleScheme getScheme() {
            return new UserAddressReqTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ID(1, "id"),
        NAME(2, "name"),
        MOBILE(3, "mobile"),
        PROVINCE_ID(4, "province_id"),
        CITY_ID(5, "city_id"),
        DISTRICT_ID(6, "district_id"),
        DETAIL(7, "detail"),
        STATUS(8, "status"),
        CHOICE(9, "choice");

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
            switch (fieldId) {
                case 1:
                    return ID;
                case 2:
                    return NAME;
                case 3:
                    return MOBILE;
                case 4:
                    return PROVINCE_ID;
                case 5:
                    return CITY_ID;
                case 6:
                    return DISTRICT_ID;
                case 7:
                    return DETAIL;
                case 8:
                    return STATUS;
                case 9:
                    return CHOICE;
                default:
                    return null;
            }
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
        hashMap.put(StandardScheme.class, new UserAddressReqStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserAddressReqTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ID, (_Fields) new FieldMetaData("id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.NAME, (_Fields) new FieldMetaData("name", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.MOBILE, (_Fields) new FieldMetaData("mobile", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.PROVINCE_ID, (_Fields) new FieldMetaData("province_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.CITY_ID, (_Fields) new FieldMetaData("city_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.DISTRICT_ID, (_Fields) new FieldMetaData("district_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.DETAIL, (_Fields) new FieldMetaData("detail", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.STATUS, (_Fields) new FieldMetaData("status", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.CHOICE, (_Fields) new FieldMetaData("choice", (byte) 2, new FieldValueMetaData((byte) 2)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserAddressReq.class, unmodifiableMap);
    }

    public UserAddressReq() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.CHOICE};
        this.choice = true;
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
        this.f28157id = 0;
        this.name = null;
        this.mobile = null;
        setProvince_idIsSet(false);
        this.province_id = 0;
        setCity_idIsSet(false);
        this.city_id = 0;
        setDistrict_idIsSet(false);
        this.district_id = 0;
        this.detail = null;
        setStatusIsSet(false);
        this.status = 0;
        this.choice = true;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserAddressReq)) {
            return equals((UserAddressReq) that);
        }
        return false;
    }

    public int getCity_id() {
        return this.city_id;
    }

    public String getDetail() {
        return this.detail;
    }

    public int getDistrict_id() {
        return this.district_id;
    }

    public int getId() {
        return this.f28157id;
    }

    public String getMobile() {
        return this.mobile;
    }

    public String getName() {
        return this.name;
    }

    public int getProvince_id() {
        return this.province_id;
    }

    public int getStatus() {
        return this.status;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isChoice() {
        return this.choice;
    }

    public boolean isSetChoice() {
        return EncodingUtils.testBit(this.__isset_bitfield, 5);
    }

    public boolean isSetCity_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetDetail() {
        return this.detail != null;
    }

    public boolean isSetDistrict_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetId() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetMobile() {
        return this.mobile != null;
    }

    public boolean isSetName() {
        return this.name != null;
    }

    public boolean isSetProvince_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetStatus() {
        return EncodingUtils.testBit(this.__isset_bitfield, 4);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserAddressReq setChoice(boolean choice) {
        this.choice = choice;
        setChoiceIsSet(true);
        return this;
    }

    public void setChoiceIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 5, value);
    }

    public UserAddressReq setCity_id(int city_id) {
        this.city_id = city_id;
        setCity_idIsSet(true);
        return this;
    }

    public void setCity_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public UserAddressReq setDetail(String detail) {
        this.detail = detail;
        return this;
    }

    public void setDetailIsSet(boolean value) {
        if (value) {
            return;
        }
        this.detail = null;
    }

    public UserAddressReq setDistrict_id(int district_id) {
        this.district_id = district_id;
        setDistrict_idIsSet(true);
        return this;
    }

    public void setDistrict_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public UserAddressReq setId(int id2) {
        this.f28157id = id2;
        setIdIsSet(true);
        return this;
    }

    public void setIdIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public UserAddressReq setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public void setMobileIsSet(boolean value) {
        if (value) {
            return;
        }
        this.mobile = null;
    }

    public UserAddressReq setName(String name) {
        this.name = name;
        return this;
    }

    public void setNameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.name = null;
    }

    public UserAddressReq setProvince_id(int province_id) {
        this.province_id = province_id;
        setProvince_idIsSet(true);
        return this;
    }

    public void setProvince_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public UserAddressReq setStatus(int status) {
        this.status = status;
        setStatusIsSet(true);
        return this;
    }

    public void setStatusIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 4, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserAddressReq(");
        sb2.append("id:");
        sb2.append(this.f28157id);
        sb2.append(j2.O);
        sb2.append("name:");
        String str = this.name;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("mobile:");
        String str2 = this.mobile;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("province_id:");
        sb2.append(this.province_id);
        sb2.append(j2.O);
        sb2.append("city_id:");
        sb2.append(this.city_id);
        sb2.append(j2.O);
        sb2.append("district_id:");
        sb2.append(this.district_id);
        sb2.append(j2.O);
        sb2.append("detail:");
        String str3 = this.detail;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(j2.O);
        sb2.append("status:");
        sb2.append(this.status);
        if (isSetChoice()) {
            sb2.append(j2.O);
            sb2.append("choice:");
            sb2.append(this.choice);
        }
        sb2.append(j.f81007d);
        return sb2.toString();
    }

    public void unsetChoice() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 5);
    }

    public void unsetCity_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetDetail() {
        this.detail = null;
    }

    public void unsetDistrict_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetId() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetMobile() {
        this.mobile = null;
    }

    public void unsetName() {
        this.name = null;
    }

    public void unsetProvince_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetStatus() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 4);
    }

    public void validate() throws TException {
        if (this.name == null) {
            throw new TProtocolException("Required field 'name' was not present! Struct: " + toString());
        }
        if (this.mobile == null) {
            throw new TProtocolException("Required field 'mobile' was not present! Struct: " + toString());
        }
        if (this.detail != null) {
            return;
        }
        throw new TProtocolException("Required field 'detail' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(UserAddressReq other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        int compareTo7;
        int compareTo8;
        int compareTo9;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo10 = Boolean.valueOf(isSetId()).compareTo(Boolean.valueOf(other.isSetId()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetId() && (compareTo9 = TBaseHelper.compareTo(this.f28157id, other.f28157id)) != 0) {
            return compareTo9;
        }
        int compareTo11 = Boolean.valueOf(isSetName()).compareTo(Boolean.valueOf(other.isSetName()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetName() && (compareTo8 = TBaseHelper.compareTo(this.name, other.name)) != 0) {
            return compareTo8;
        }
        int compareTo12 = Boolean.valueOf(isSetMobile()).compareTo(Boolean.valueOf(other.isSetMobile()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetMobile() && (compareTo7 = TBaseHelper.compareTo(this.mobile, other.mobile)) != 0) {
            return compareTo7;
        }
        int compareTo13 = Boolean.valueOf(isSetProvince_id()).compareTo(Boolean.valueOf(other.isSetProvince_id()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetProvince_id() && (compareTo6 = TBaseHelper.compareTo(this.province_id, other.province_id)) != 0) {
            return compareTo6;
        }
        int compareTo14 = Boolean.valueOf(isSetCity_id()).compareTo(Boolean.valueOf(other.isSetCity_id()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (isSetCity_id() && (compareTo5 = TBaseHelper.compareTo(this.city_id, other.city_id)) != 0) {
            return compareTo5;
        }
        int compareTo15 = Boolean.valueOf(isSetDistrict_id()).compareTo(Boolean.valueOf(other.isSetDistrict_id()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (isSetDistrict_id() && (compareTo4 = TBaseHelper.compareTo(this.district_id, other.district_id)) != 0) {
            return compareTo4;
        }
        int compareTo16 = Boolean.valueOf(isSetDetail()).compareTo(Boolean.valueOf(other.isSetDetail()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (isSetDetail() && (compareTo3 = TBaseHelper.compareTo(this.detail, other.detail)) != 0) {
            return compareTo3;
        }
        int compareTo17 = Boolean.valueOf(isSetStatus()).compareTo(Boolean.valueOf(other.isSetStatus()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (isSetStatus() && (compareTo2 = TBaseHelper.compareTo(this.status, other.status)) != 0) {
            return compareTo2;
        }
        int compareTo18 = Boolean.valueOf(isSetChoice()).compareTo(Boolean.valueOf(other.isSetChoice()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (!isSetChoice() || (compareTo = TBaseHelper.compareTo(this.choice, other.choice)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserAddressReq, _Fields> deepCopy2() {
        return new UserAddressReq(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$UserAddressReq$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getId());
            case 2:
                return getName();
            case 3:
                return getMobile();
            case 4:
                return Integer.valueOf(getProvince_id());
            case 5:
                return Integer.valueOf(getCity_id());
            case 6:
                return Integer.valueOf(getDistrict_id());
            case 7:
                return getDetail();
            case 8:
                return Integer.valueOf(getStatus());
            case 9:
                return Boolean.valueOf(isChoice());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$UserAddressReq$_Fields[field.ordinal()]) {
            case 1:
                return isSetId();
            case 2:
                return isSetName();
            case 3:
                return isSetMobile();
            case 4:
                return isSetProvince_id();
            case 5:
                return isSetCity_id();
            case 6:
                return isSetDistrict_id();
            case 7:
                return isSetDetail();
            case 8:
                return isSetStatus();
            case 9:
                return isSetChoice();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$UserAddressReq$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setId(((Integer) value).intValue());
                    break;
                } else {
                    unsetId();
                    break;
                }
            case 2:
                if (value != null) {
                    setName((String) value);
                    break;
                } else {
                    unsetName();
                    break;
                }
            case 3:
                if (value != null) {
                    setMobile((String) value);
                    break;
                } else {
                    unsetMobile();
                    break;
                }
            case 4:
                if (value != null) {
                    setProvince_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetProvince_id();
                    break;
                }
            case 5:
                if (value != null) {
                    setCity_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetCity_id();
                    break;
                }
            case 6:
                if (value != null) {
                    setDistrict_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetDistrict_id();
                    break;
                }
            case 7:
                if (value != null) {
                    setDetail((String) value);
                    break;
                } else {
                    unsetDetail();
                    break;
                }
            case 8:
                if (value != null) {
                    setStatus(((Integer) value).intValue());
                    break;
                } else {
                    unsetStatus();
                    break;
                }
            case 9:
                if (value != null) {
                    setChoice(((Boolean) value).booleanValue());
                    break;
                } else {
                    unsetChoice();
                    break;
                }
        }
    }

    public boolean equals(UserAddressReq that) {
        if (that == null || this.f28157id != that.f28157id) {
            return false;
        }
        boolean isSetName = isSetName();
        boolean isSetName2 = that.isSetName();
        if ((isSetName || isSetName2) && !(isSetName && isSetName2 && this.name.equals(that.name))) {
            return false;
        }
        boolean isSetMobile = isSetMobile();
        boolean isSetMobile2 = that.isSetMobile();
        if (((isSetMobile || isSetMobile2) && (!isSetMobile || !isSetMobile2 || !this.mobile.equals(that.mobile))) || this.province_id != that.province_id || this.city_id != that.city_id || this.district_id != that.district_id) {
            return false;
        }
        boolean isSetDetail = isSetDetail();
        boolean isSetDetail2 = that.isSetDetail();
        if (((isSetDetail || isSetDetail2) && !(isSetDetail && isSetDetail2 && this.detail.equals(that.detail))) || this.status != that.status) {
            return false;
        }
        boolean isSetChoice = isSetChoice();
        boolean isSetChoice2 = that.isSetChoice();
        if (isSetChoice || isSetChoice2) {
            return isSetChoice && isSetChoice2 && this.choice == that.choice;
        }
        return true;
    }

    public UserAddressReq(int id2, String name, String mobile, int province_id, int city_id, int district_id, String detail, int status) {
        this();
        this.f28157id = id2;
        setIdIsSet(true);
        this.name = name;
        this.mobile = mobile;
        this.province_id = province_id;
        setProvince_idIsSet(true);
        this.city_id = city_id;
        setCity_idIsSet(true);
        this.district_id = district_id;
        setDistrict_idIsSet(true);
        this.detail = detail;
        this.status = status;
        setStatusIsSet(true);
    }

    public UserAddressReq(UserAddressReq other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.CHOICE};
        this.__isset_bitfield = other.__isset_bitfield;
        this.f28157id = other.f28157id;
        if (other.isSetName()) {
            this.name = other.name;
        }
        if (other.isSetMobile()) {
            this.mobile = other.mobile;
        }
        this.province_id = other.province_id;
        this.city_id = other.city_id;
        this.district_id = other.district_id;
        if (other.isSetDetail()) {
            this.detail = other.detail;
        }
        this.status = other.status;
        this.choice = other.choice;
    }
}
