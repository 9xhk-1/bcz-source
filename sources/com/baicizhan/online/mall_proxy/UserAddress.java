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
import org.apache.thrift.meta_data.StructMetaData;
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
public class UserAddress implements TBase<UserAddress, _Fields>, Serializable, Cloneable, Comparable<UserAddress> {
    private static final int __ID_ISSET_ID = 0;
    private static final int __STATUS_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public ChildAddress city;
    public String detail;
    public ChildAddress district;

    /* renamed from: id, reason: collision with root package name */
    public int f28156id;
    public String mobile;
    public String name;
    private _Fields[] optionals;
    public ChildAddress province;
    public int status;
    private static final TStruct STRUCT_DESC = new TStruct("UserAddress");
    private static final TField ID_FIELD_DESC = new TField("id", (byte) 8, 1);
    private static final TField NAME_FIELD_DESC = new TField("name", (byte) 11, 2);
    private static final TField MOBILE_FIELD_DESC = new TField("mobile", (byte) 11, 3);
    private static final TField PROVINCE_FIELD_DESC = new TField("province", (byte) 12, 4);
    private static final TField CITY_FIELD_DESC = new TField("city", (byte) 12, 5);
    private static final TField DISTRICT_FIELD_DESC = new TField("district", (byte) 12, 6);
    private static final TField DETAIL_FIELD_DESC = new TField("detail", (byte) 11, 7);
    private static final TField STATUS_FIELD_DESC = new TField("status", (byte) 8, 8);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.mall_proxy.UserAddress$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$mall_proxy$UserAddress$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$mall_proxy$UserAddress$_Fields = iArr;
            try {
                iArr[_Fields.ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$mall_proxy$UserAddress$_Fields[_Fields.NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$mall_proxy$UserAddress$_Fields[_Fields.MOBILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$mall_proxy$UserAddress$_Fields[_Fields.PROVINCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$mall_proxy$UserAddress$_Fields[_Fields.CITY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$mall_proxy$UserAddress$_Fields[_Fields.DISTRICT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$mall_proxy$UserAddress$_Fields[_Fields.DETAIL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$mall_proxy$UserAddress$_Fields[_Fields.STATUS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserAddressStandardScheme extends StandardScheme<UserAddress> {
        private UserAddressStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserAddress struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetId()) {
                        throw new TProtocolException("Required field 'id' was not found in serialized data! Struct: " + toString());
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
                            struct.f28156id = iprot.readI32();
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
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            ChildAddress childAddress = new ChildAddress();
                            struct.province = childAddress;
                            childAddress.read(iprot);
                            struct.setProvinceIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            ChildAddress childAddress2 = new ChildAddress();
                            struct.city = childAddress2;
                            childAddress2.read(iprot);
                            struct.setCityIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            ChildAddress childAddress3 = new ChildAddress();
                            struct.district = childAddress3;
                            childAddress3.read(iprot);
                            struct.setDistrictIsSet(true);
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
                    default:
                        TProtocolUtil.skip(iprot, b11);
                        break;
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, UserAddress struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserAddress.STRUCT_DESC);
            oprot.writeFieldBegin(UserAddress.ID_FIELD_DESC);
            oprot.writeI32(struct.f28156id);
            oprot.writeFieldEnd();
            if (struct.name != null) {
                oprot.writeFieldBegin(UserAddress.NAME_FIELD_DESC);
                oprot.writeString(struct.name);
                oprot.writeFieldEnd();
            }
            if (struct.mobile != null) {
                oprot.writeFieldBegin(UserAddress.MOBILE_FIELD_DESC);
                oprot.writeString(struct.mobile);
                oprot.writeFieldEnd();
            }
            if (struct.province != null) {
                oprot.writeFieldBegin(UserAddress.PROVINCE_FIELD_DESC);
                struct.province.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.city != null) {
                oprot.writeFieldBegin(UserAddress.CITY_FIELD_DESC);
                struct.city.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.district != null && struct.isSetDistrict()) {
                oprot.writeFieldBegin(UserAddress.DISTRICT_FIELD_DESC);
                struct.district.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.detail != null) {
                oprot.writeFieldBegin(UserAddress.DETAIL_FIELD_DESC);
                oprot.writeString(struct.detail);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(UserAddress.STATUS_FIELD_DESC);
            oprot.writeI32(struct.status);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserAddressStandardSchemeFactory implements SchemeFactory {
        private UserAddressStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserAddressStandardScheme getScheme() {
            return new UserAddressStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserAddressTupleScheme extends TupleScheme<UserAddress> {
        private UserAddressTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserAddress struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.f28156id = tTupleProtocol.readI32();
            struct.setIdIsSet(true);
            struct.name = tTupleProtocol.readString();
            struct.setNameIsSet(true);
            struct.mobile = tTupleProtocol.readString();
            struct.setMobileIsSet(true);
            ChildAddress childAddress = new ChildAddress();
            struct.province = childAddress;
            childAddress.read(tTupleProtocol);
            struct.setProvinceIsSet(true);
            ChildAddress childAddress2 = new ChildAddress();
            struct.city = childAddress2;
            childAddress2.read(tTupleProtocol);
            struct.setCityIsSet(true);
            struct.detail = tTupleProtocol.readString();
            struct.setDetailIsSet(true);
            struct.status = tTupleProtocol.readI32();
            struct.setStatusIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                ChildAddress childAddress3 = new ChildAddress();
                struct.district = childAddress3;
                childAddress3.read(tTupleProtocol);
                struct.setDistrictIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserAddress struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.f28156id);
            tTupleProtocol.writeString(struct.name);
            tTupleProtocol.writeString(struct.mobile);
            struct.province.write(tTupleProtocol);
            struct.city.write(tTupleProtocol);
            tTupleProtocol.writeString(struct.detail);
            tTupleProtocol.writeI32(struct.status);
            BitSet bitSet = new BitSet();
            if (struct.isSetDistrict()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetDistrict()) {
                struct.district.write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserAddressTupleSchemeFactory implements SchemeFactory {
        private UserAddressTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserAddressTupleScheme getScheme() {
            return new UserAddressTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ID(1, "id"),
        NAME(2, "name"),
        MOBILE(3, "mobile"),
        PROVINCE(4, "province"),
        CITY(5, "city"),
        DISTRICT(6, "district"),
        DETAIL(7, "detail"),
        STATUS(8, "status");

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
                    return PROVINCE;
                case 5:
                    return CITY;
                case 6:
                    return DISTRICT;
                case 7:
                    return DETAIL;
                case 8:
                    return STATUS;
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
        hashMap.put(StandardScheme.class, new UserAddressStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserAddressTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ID, (_Fields) new FieldMetaData("id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.NAME, (_Fields) new FieldMetaData("name", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.MOBILE, (_Fields) new FieldMetaData("mobile", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.PROVINCE, (_Fields) new FieldMetaData("province", (byte) 1, new StructMetaData((byte) 12, ChildAddress.class)));
        enumMap.put((EnumMap) _Fields.CITY, (_Fields) new FieldMetaData("city", (byte) 1, new StructMetaData((byte) 12, ChildAddress.class)));
        enumMap.put((EnumMap) _Fields.DISTRICT, (_Fields) new FieldMetaData("district", (byte) 2, new StructMetaData((byte) 12, ChildAddress.class)));
        enumMap.put((EnumMap) _Fields.DETAIL, (_Fields) new FieldMetaData("detail", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.STATUS, (_Fields) new FieldMetaData("status", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserAddress.class, unmodifiableMap);
    }

    public UserAddress() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.DISTRICT};
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
        this.f28156id = 0;
        this.name = null;
        this.mobile = null;
        this.province = null;
        this.city = null;
        this.district = null;
        this.detail = null;
        setStatusIsSet(false);
        this.status = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserAddress)) {
            return equals((UserAddress) that);
        }
        return false;
    }

    public ChildAddress getCity() {
        return this.city;
    }

    public String getDetail() {
        return this.detail;
    }

    public ChildAddress getDistrict() {
        return this.district;
    }

    public int getId() {
        return this.f28156id;
    }

    public String getMobile() {
        return this.mobile;
    }

    public String getName() {
        return this.name;
    }

    public ChildAddress getProvince() {
        return this.province;
    }

    public int getStatus() {
        return this.status;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetCity() {
        return this.city != null;
    }

    public boolean isSetDetail() {
        return this.detail != null;
    }

    public boolean isSetDistrict() {
        return this.district != null;
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

    public boolean isSetProvince() {
        return this.province != null;
    }

    public boolean isSetStatus() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserAddress setCity(ChildAddress city) {
        this.city = city;
        return this;
    }

    public void setCityIsSet(boolean value) {
        if (value) {
            return;
        }
        this.city = null;
    }

    public UserAddress setDetail(String detail) {
        this.detail = detail;
        return this;
    }

    public void setDetailIsSet(boolean value) {
        if (value) {
            return;
        }
        this.detail = null;
    }

    public UserAddress setDistrict(ChildAddress district) {
        this.district = district;
        return this;
    }

    public void setDistrictIsSet(boolean value) {
        if (value) {
            return;
        }
        this.district = null;
    }

    public UserAddress setId(int id2) {
        this.f28156id = id2;
        setIdIsSet(true);
        return this;
    }

    public void setIdIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public UserAddress setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public void setMobileIsSet(boolean value) {
        if (value) {
            return;
        }
        this.mobile = null;
    }

    public UserAddress setName(String name) {
        this.name = name;
        return this;
    }

    public void setNameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.name = null;
    }

    public UserAddress setProvince(ChildAddress province) {
        this.province = province;
        return this;
    }

    public void setProvinceIsSet(boolean value) {
        if (value) {
            return;
        }
        this.province = null;
    }

    public UserAddress setStatus(int status) {
        this.status = status;
        setStatusIsSet(true);
        return this;
    }

    public void setStatusIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserAddress(");
        sb2.append("id:");
        sb2.append(this.f28156id);
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
        sb2.append("province:");
        ChildAddress childAddress = this.province;
        if (childAddress == null) {
            sb2.append("null");
        } else {
            sb2.append(childAddress);
        }
        sb2.append(j2.O);
        sb2.append("city:");
        ChildAddress childAddress2 = this.city;
        if (childAddress2 == null) {
            sb2.append("null");
        } else {
            sb2.append(childAddress2);
        }
        if (isSetDistrict()) {
            sb2.append(j2.O);
            sb2.append("district:");
            ChildAddress childAddress3 = this.district;
            if (childAddress3 == null) {
                sb2.append("null");
            } else {
                sb2.append(childAddress3);
            }
        }
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
        sb2.append(j.f81007d);
        return sb2.toString();
    }

    public void unsetCity() {
        this.city = null;
    }

    public void unsetDetail() {
        this.detail = null;
    }

    public void unsetDistrict() {
        this.district = null;
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

    public void unsetProvince() {
        this.province = null;
    }

    public void unsetStatus() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void validate() throws TException {
        if (this.name == null) {
            throw new TProtocolException("Required field 'name' was not present! Struct: " + toString());
        }
        if (this.mobile == null) {
            throw new TProtocolException("Required field 'mobile' was not present! Struct: " + toString());
        }
        ChildAddress childAddress = this.province;
        if (childAddress == null) {
            throw new TProtocolException("Required field 'province' was not present! Struct: " + toString());
        }
        if (this.city == null) {
            throw new TProtocolException("Required field 'city' was not present! Struct: " + toString());
        }
        if (this.detail == null) {
            throw new TProtocolException("Required field 'detail' was not present! Struct: " + toString());
        }
        if (childAddress != null) {
            childAddress.validate();
        }
        ChildAddress childAddress2 = this.city;
        if (childAddress2 != null) {
            childAddress2.validate();
        }
        ChildAddress childAddress3 = this.district;
        if (childAddress3 != null) {
            childAddress3.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(UserAddress other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        int compareTo7;
        int compareTo8;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo9 = Boolean.valueOf(isSetId()).compareTo(Boolean.valueOf(other.isSetId()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetId() && (compareTo8 = TBaseHelper.compareTo(this.f28156id, other.f28156id)) != 0) {
            return compareTo8;
        }
        int compareTo10 = Boolean.valueOf(isSetName()).compareTo(Boolean.valueOf(other.isSetName()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetName() && (compareTo7 = TBaseHelper.compareTo(this.name, other.name)) != 0) {
            return compareTo7;
        }
        int compareTo11 = Boolean.valueOf(isSetMobile()).compareTo(Boolean.valueOf(other.isSetMobile()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetMobile() && (compareTo6 = TBaseHelper.compareTo(this.mobile, other.mobile)) != 0) {
            return compareTo6;
        }
        int compareTo12 = Boolean.valueOf(isSetProvince()).compareTo(Boolean.valueOf(other.isSetProvince()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetProvince() && (compareTo5 = TBaseHelper.compareTo((Comparable) this.province, (Comparable) other.province)) != 0) {
            return compareTo5;
        }
        int compareTo13 = Boolean.valueOf(isSetCity()).compareTo(Boolean.valueOf(other.isSetCity()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetCity() && (compareTo4 = TBaseHelper.compareTo((Comparable) this.city, (Comparable) other.city)) != 0) {
            return compareTo4;
        }
        int compareTo14 = Boolean.valueOf(isSetDistrict()).compareTo(Boolean.valueOf(other.isSetDistrict()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (isSetDistrict() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.district, (Comparable) other.district)) != 0) {
            return compareTo3;
        }
        int compareTo15 = Boolean.valueOf(isSetDetail()).compareTo(Boolean.valueOf(other.isSetDetail()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (isSetDetail() && (compareTo2 = TBaseHelper.compareTo(this.detail, other.detail)) != 0) {
            return compareTo2;
        }
        int compareTo16 = Boolean.valueOf(isSetStatus()).compareTo(Boolean.valueOf(other.isSetStatus()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (!isSetStatus() || (compareTo = TBaseHelper.compareTo(this.status, other.status)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserAddress, _Fields> deepCopy2() {
        return new UserAddress(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$UserAddress$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getId());
            case 2:
                return getName();
            case 3:
                return getMobile();
            case 4:
                return getProvince();
            case 5:
                return getCity();
            case 6:
                return getDistrict();
            case 7:
                return getDetail();
            case 8:
                return Integer.valueOf(getStatus());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$UserAddress$_Fields[field.ordinal()]) {
            case 1:
                return isSetId();
            case 2:
                return isSetName();
            case 3:
                return isSetMobile();
            case 4:
                return isSetProvince();
            case 5:
                return isSetCity();
            case 6:
                return isSetDistrict();
            case 7:
                return isSetDetail();
            case 8:
                return isSetStatus();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$UserAddress$_Fields[field.ordinal()]) {
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
                    setProvince((ChildAddress) value);
                    break;
                } else {
                    unsetProvince();
                    break;
                }
            case 5:
                if (value != null) {
                    setCity((ChildAddress) value);
                    break;
                } else {
                    unsetCity();
                    break;
                }
            case 6:
                if (value != null) {
                    setDistrict((ChildAddress) value);
                    break;
                } else {
                    unsetDistrict();
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
        }
    }

    public boolean equals(UserAddress that) {
        if (that == null || this.f28156id != that.f28156id) {
            return false;
        }
        boolean isSetName = isSetName();
        boolean isSetName2 = that.isSetName();
        if ((isSetName || isSetName2) && !(isSetName && isSetName2 && this.name.equals(that.name))) {
            return false;
        }
        boolean isSetMobile = isSetMobile();
        boolean isSetMobile2 = that.isSetMobile();
        if ((isSetMobile || isSetMobile2) && !(isSetMobile && isSetMobile2 && this.mobile.equals(that.mobile))) {
            return false;
        }
        boolean isSetProvince = isSetProvince();
        boolean isSetProvince2 = that.isSetProvince();
        if ((isSetProvince || isSetProvince2) && !(isSetProvince && isSetProvince2 && this.province.equals(that.province))) {
            return false;
        }
        boolean isSetCity = isSetCity();
        boolean isSetCity2 = that.isSetCity();
        if ((isSetCity || isSetCity2) && !(isSetCity && isSetCity2 && this.city.equals(that.city))) {
            return false;
        }
        boolean isSetDistrict = isSetDistrict();
        boolean isSetDistrict2 = that.isSetDistrict();
        if ((isSetDistrict || isSetDistrict2) && !(isSetDistrict && isSetDistrict2 && this.district.equals(that.district))) {
            return false;
        }
        boolean isSetDetail = isSetDetail();
        boolean isSetDetail2 = that.isSetDetail();
        return (!(isSetDetail || isSetDetail2) || (isSetDetail && isSetDetail2 && this.detail.equals(that.detail))) && this.status == that.status;
    }

    public UserAddress(int id2, String name, String mobile, ChildAddress province, ChildAddress city, String detail, int status) {
        this();
        this.f28156id = id2;
        setIdIsSet(true);
        this.name = name;
        this.mobile = mobile;
        this.province = province;
        this.city = city;
        this.detail = detail;
        this.status = status;
        setStatusIsSet(true);
    }

    public UserAddress(UserAddress other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.DISTRICT};
        this.__isset_bitfield = other.__isset_bitfield;
        this.f28156id = other.f28156id;
        if (other.isSetName()) {
            this.name = other.name;
        }
        if (other.isSetMobile()) {
            this.mobile = other.mobile;
        }
        if (other.isSetProvince()) {
            this.province = new ChildAddress(other.province);
        }
        if (other.isSetCity()) {
            this.city = new ChildAddress(other.city);
        }
        if (other.isSetDistrict()) {
            this.district = new ChildAddress(other.district);
        }
        if (other.isSetDetail()) {
            this.detail = other.detail;
        }
        this.status = other.status;
    }
}
