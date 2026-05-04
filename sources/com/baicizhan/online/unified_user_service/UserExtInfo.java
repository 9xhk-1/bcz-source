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
public class UserExtInfo implements TBase<UserExtInfo, _Fields>, Serializable, Cloneable, Comparable<UserExtInfo> {
    private static final int __LATITUDE_ISSET_ID = 1;
    private static final int __LONGITUDE_ISSET_ID = 0;
    private static final int __SCREEN_MOD_ISSET_ID = 2;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String avatar;
    public String city;
    public String district;
    public double latitude;
    public double longitude;
    private _Fields[] optionals;
    public String province;
    public int screen_mod;
    private static final TStruct STRUCT_DESC = new TStruct("UserExtInfo");
    private static final TField AVATAR_FIELD_DESC = new TField(q9.h.f81940d, (byte) 11, 1);
    private static final TField LONGITUDE_FIELD_DESC = new TField("longitude", (byte) 4, 2);
    private static final TField LATITUDE_FIELD_DESC = new TField("latitude", (byte) 4, 3);
    private static final TField PROVINCE_FIELD_DESC = new TField("province", (byte) 11, 4);
    private static final TField CITY_FIELD_DESC = new TField("city", (byte) 11, 5);
    private static final TField DISTRICT_FIELD_DESC = new TField("district", (byte) 11, 6);
    private static final TField SCREEN_MOD_FIELD_DESC = new TField("screen_mod", (byte) 8, 7);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.unified_user_service.UserExtInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$unified_user_service$UserExtInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$unified_user_service$UserExtInfo$_Fields = iArr;
            try {
                iArr[_Fields.AVATAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$UserExtInfo$_Fields[_Fields.LONGITUDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$UserExtInfo$_Fields[_Fields.LATITUDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$UserExtInfo$_Fields[_Fields.PROVINCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$UserExtInfo$_Fields[_Fields.CITY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$UserExtInfo$_Fields[_Fields.DISTRICT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$UserExtInfo$_Fields[_Fields.SCREEN_MOD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserExtInfoStandardScheme extends StandardScheme<UserExtInfo> {
        private UserExtInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserExtInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetLongitude()) {
                        throw new TProtocolException("Required field 'longitude' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetLatitude()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'latitude' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.avatar = iprot.readString();
                            struct.setAvatarIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 4) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.longitude = iprot.readDouble();
                            struct.setLongitudeIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 4) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.latitude = iprot.readDouble();
                            struct.setLatitudeIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.province = iprot.readString();
                            struct.setProvinceIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.city = iprot.readString();
                            struct.setCityIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.district = iprot.readString();
                            struct.setDistrictIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.screen_mod = iprot.readI32();
                            struct.setScreen_modIsSet(true);
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
        public void write(TProtocol oprot, UserExtInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserExtInfo.STRUCT_DESC);
            if (struct.avatar != null) {
                oprot.writeFieldBegin(UserExtInfo.AVATAR_FIELD_DESC);
                oprot.writeString(struct.avatar);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(UserExtInfo.LONGITUDE_FIELD_DESC);
            oprot.writeDouble(struct.longitude);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserExtInfo.LATITUDE_FIELD_DESC);
            oprot.writeDouble(struct.latitude);
            oprot.writeFieldEnd();
            if (struct.province != null && struct.isSetProvince()) {
                oprot.writeFieldBegin(UserExtInfo.PROVINCE_FIELD_DESC);
                oprot.writeString(struct.province);
                oprot.writeFieldEnd();
            }
            if (struct.city != null) {
                oprot.writeFieldBegin(UserExtInfo.CITY_FIELD_DESC);
                oprot.writeString(struct.city);
                oprot.writeFieldEnd();
            }
            if (struct.district != null) {
                oprot.writeFieldBegin(UserExtInfo.DISTRICT_FIELD_DESC);
                oprot.writeString(struct.district);
                oprot.writeFieldEnd();
            }
            if (struct.isSetScreen_mod()) {
                oprot.writeFieldBegin(UserExtInfo.SCREEN_MOD_FIELD_DESC);
                oprot.writeI32(struct.screen_mod);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserExtInfoStandardSchemeFactory implements SchemeFactory {
        private UserExtInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserExtInfoStandardScheme getScheme() {
            return new UserExtInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserExtInfoTupleScheme extends TupleScheme<UserExtInfo> {
        private UserExtInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserExtInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.avatar = tTupleProtocol.readString();
            struct.setAvatarIsSet(true);
            struct.longitude = tTupleProtocol.readDouble();
            struct.setLongitudeIsSet(true);
            struct.latitude = tTupleProtocol.readDouble();
            struct.setLatitudeIsSet(true);
            struct.city = tTupleProtocol.readString();
            struct.setCityIsSet(true);
            struct.district = tTupleProtocol.readString();
            struct.setDistrictIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(2);
            if (readBitSet.get(0)) {
                struct.province = tTupleProtocol.readString();
                struct.setProvinceIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.screen_mod = tTupleProtocol.readI32();
                struct.setScreen_modIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserExtInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.avatar);
            tTupleProtocol.writeDouble(struct.longitude);
            tTupleProtocol.writeDouble(struct.latitude);
            tTupleProtocol.writeString(struct.city);
            tTupleProtocol.writeString(struct.district);
            BitSet bitSet = new BitSet();
            if (struct.isSetProvince()) {
                bitSet.set(0);
            }
            if (struct.isSetScreen_mod()) {
                bitSet.set(1);
            }
            tTupleProtocol.writeBitSet(bitSet, 2);
            if (struct.isSetProvince()) {
                tTupleProtocol.writeString(struct.province);
            }
            if (struct.isSetScreen_mod()) {
                tTupleProtocol.writeI32(struct.screen_mod);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserExtInfoTupleSchemeFactory implements SchemeFactory {
        private UserExtInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserExtInfoTupleScheme getScheme() {
            return new UserExtInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        AVATAR(1, q9.h.f81940d),
        LONGITUDE(2, "longitude"),
        LATITUDE(3, "latitude"),
        PROVINCE(4, "province"),
        CITY(5, "city"),
        DISTRICT(6, "district"),
        SCREEN_MOD(7, "screen_mod");

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
                    return AVATAR;
                case 2:
                    return LONGITUDE;
                case 3:
                    return LATITUDE;
                case 4:
                    return PROVINCE;
                case 5:
                    return CITY;
                case 6:
                    return DISTRICT;
                case 7:
                    return SCREEN_MOD;
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
        hashMap.put(StandardScheme.class, new UserExtInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserExtInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.AVATAR, (_Fields) new FieldMetaData(q9.h.f81940d, (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.LONGITUDE, (_Fields) new FieldMetaData("longitude", (byte) 1, new FieldValueMetaData((byte) 4)));
        enumMap.put((EnumMap) _Fields.LATITUDE, (_Fields) new FieldMetaData("latitude", (byte) 1, new FieldValueMetaData((byte) 4)));
        enumMap.put((EnumMap) _Fields.PROVINCE, (_Fields) new FieldMetaData("province", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.CITY, (_Fields) new FieldMetaData("city", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.DISTRICT, (_Fields) new FieldMetaData("district", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SCREEN_MOD, (_Fields) new FieldMetaData("screen_mod", (byte) 2, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserExtInfo.class, unmodifiableMap);
    }

    public UserExtInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.PROVINCE, _Fields.SCREEN_MOD};
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
        this.avatar = null;
        setLongitudeIsSet(false);
        this.longitude = 0.0d;
        setLatitudeIsSet(false);
        this.latitude = 0.0d;
        this.province = null;
        this.city = null;
        this.district = null;
        setScreen_modIsSet(false);
        this.screen_mod = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserExtInfo)) {
            return equals((UserExtInfo) that);
        }
        return false;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getCity() {
        return this.city;
    }

    public String getDistrict() {
        return this.district;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public String getProvince() {
        return this.province;
    }

    public int getScreen_mod() {
        return this.screen_mod;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAvatar() {
        return this.avatar != null;
    }

    public boolean isSetCity() {
        return this.city != null;
    }

    public boolean isSetDistrict() {
        return this.district != null;
    }

    public boolean isSetLatitude() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetLongitude() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetProvince() {
        return this.province != null;
    }

    public boolean isSetScreen_mod() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserExtInfo setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }

    public void setAvatarIsSet(boolean value) {
        if (value) {
            return;
        }
        this.avatar = null;
    }

    public UserExtInfo setCity(String city) {
        this.city = city;
        return this;
    }

    public void setCityIsSet(boolean value) {
        if (value) {
            return;
        }
        this.city = null;
    }

    public UserExtInfo setDistrict(String district) {
        this.district = district;
        return this;
    }

    public void setDistrictIsSet(boolean value) {
        if (value) {
            return;
        }
        this.district = null;
    }

    public UserExtInfo setLatitude(double latitude) {
        this.latitude = latitude;
        setLatitudeIsSet(true);
        return this;
    }

    public void setLatitudeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public UserExtInfo setLongitude(double longitude) {
        this.longitude = longitude;
        setLongitudeIsSet(true);
        return this;
    }

    public void setLongitudeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public UserExtInfo setProvince(String province) {
        this.province = province;
        return this;
    }

    public void setProvinceIsSet(boolean value) {
        if (value) {
            return;
        }
        this.province = null;
    }

    public UserExtInfo setScreen_mod(int screen_mod) {
        this.screen_mod = screen_mod;
        setScreen_modIsSet(true);
        return this;
    }

    public void setScreen_modIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserExtInfo(");
        sb2.append("avatar:");
        String str = this.avatar;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("longitude:");
        sb2.append(this.longitude);
        sb2.append(j2.O);
        sb2.append("latitude:");
        sb2.append(this.latitude);
        if (isSetProvince()) {
            sb2.append(j2.O);
            sb2.append("province:");
            String str2 = this.province;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
        }
        sb2.append(j2.O);
        sb2.append("city:");
        String str3 = this.city;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(j2.O);
        sb2.append("district:");
        String str4 = this.district;
        if (str4 == null) {
            sb2.append("null");
        } else {
            sb2.append(str4);
        }
        if (isSetScreen_mod()) {
            sb2.append(j2.O);
            sb2.append("screen_mod:");
            sb2.append(this.screen_mod);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAvatar() {
        this.avatar = null;
    }

    public void unsetCity() {
        this.city = null;
    }

    public void unsetDistrict() {
        this.district = null;
    }

    public void unsetLatitude() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetLongitude() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetProvince() {
        this.province = null;
    }

    public void unsetScreen_mod() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void validate() throws TException {
        if (this.avatar == null) {
            throw new TProtocolException("Required field 'avatar' was not present! Struct: " + toString());
        }
        if (this.city == null) {
            throw new TProtocolException("Required field 'city' was not present! Struct: " + toString());
        }
        if (this.district != null) {
            return;
        }
        throw new TProtocolException("Required field 'district' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(UserExtInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        int compareTo7;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo8 = Boolean.valueOf(isSetAvatar()).compareTo(Boolean.valueOf(other.isSetAvatar()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetAvatar() && (compareTo7 = TBaseHelper.compareTo(this.avatar, other.avatar)) != 0) {
            return compareTo7;
        }
        int compareTo9 = Boolean.valueOf(isSetLongitude()).compareTo(Boolean.valueOf(other.isSetLongitude()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetLongitude() && (compareTo6 = TBaseHelper.compareTo(this.longitude, other.longitude)) != 0) {
            return compareTo6;
        }
        int compareTo10 = Boolean.valueOf(isSetLatitude()).compareTo(Boolean.valueOf(other.isSetLatitude()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetLatitude() && (compareTo5 = TBaseHelper.compareTo(this.latitude, other.latitude)) != 0) {
            return compareTo5;
        }
        int compareTo11 = Boolean.valueOf(isSetProvince()).compareTo(Boolean.valueOf(other.isSetProvince()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetProvince() && (compareTo4 = TBaseHelper.compareTo(this.province, other.province)) != 0) {
            return compareTo4;
        }
        int compareTo12 = Boolean.valueOf(isSetCity()).compareTo(Boolean.valueOf(other.isSetCity()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetCity() && (compareTo3 = TBaseHelper.compareTo(this.city, other.city)) != 0) {
            return compareTo3;
        }
        int compareTo13 = Boolean.valueOf(isSetDistrict()).compareTo(Boolean.valueOf(other.isSetDistrict()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetDistrict() && (compareTo2 = TBaseHelper.compareTo(this.district, other.district)) != 0) {
            return compareTo2;
        }
        int compareTo14 = Boolean.valueOf(isSetScreen_mod()).compareTo(Boolean.valueOf(other.isSetScreen_mod()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (!isSetScreen_mod() || (compareTo = TBaseHelper.compareTo(this.screen_mod, other.screen_mod)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserExtInfo, _Fields> deepCopy2() {
        return new UserExtInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$UserExtInfo$_Fields[field.ordinal()]) {
            case 1:
                return getAvatar();
            case 2:
                return Double.valueOf(getLongitude());
            case 3:
                return Double.valueOf(getLatitude());
            case 4:
                return getProvince();
            case 5:
                return getCity();
            case 6:
                return getDistrict();
            case 7:
                return Integer.valueOf(getScreen_mod());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$UserExtInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetAvatar();
            case 2:
                return isSetLongitude();
            case 3:
                return isSetLatitude();
            case 4:
                return isSetProvince();
            case 5:
                return isSetCity();
            case 6:
                return isSetDistrict();
            case 7:
                return isSetScreen_mod();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$UserExtInfo$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setAvatar((String) value);
                    break;
                } else {
                    unsetAvatar();
                    break;
                }
            case 2:
                if (value != null) {
                    setLongitude(((Double) value).doubleValue());
                    break;
                } else {
                    unsetLongitude();
                    break;
                }
            case 3:
                if (value != null) {
                    setLatitude(((Double) value).doubleValue());
                    break;
                } else {
                    unsetLatitude();
                    break;
                }
            case 4:
                if (value != null) {
                    setProvince((String) value);
                    break;
                } else {
                    unsetProvince();
                    break;
                }
            case 5:
                if (value != null) {
                    setCity((String) value);
                    break;
                } else {
                    unsetCity();
                    break;
                }
            case 6:
                if (value != null) {
                    setDistrict((String) value);
                    break;
                } else {
                    unsetDistrict();
                    break;
                }
            case 7:
                if (value != null) {
                    setScreen_mod(((Integer) value).intValue());
                    break;
                } else {
                    unsetScreen_mod();
                    break;
                }
        }
    }

    public boolean equals(UserExtInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetAvatar = isSetAvatar();
        boolean isSetAvatar2 = that.isSetAvatar();
        if (((isSetAvatar || isSetAvatar2) && (!isSetAvatar || !isSetAvatar2 || !this.avatar.equals(that.avatar))) || this.longitude != that.longitude || this.latitude != that.latitude) {
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
        boolean isSetScreen_mod = isSetScreen_mod();
        boolean isSetScreen_mod2 = that.isSetScreen_mod();
        if (isSetScreen_mod || isSetScreen_mod2) {
            return isSetScreen_mod && isSetScreen_mod2 && this.screen_mod == that.screen_mod;
        }
        return true;
    }

    public UserExtInfo(String avatar, double longitude, double latitude, String city, String district) {
        this();
        this.avatar = avatar;
        this.longitude = longitude;
        setLongitudeIsSet(true);
        this.latitude = latitude;
        setLatitudeIsSet(true);
        this.city = city;
        this.district = district;
    }

    public UserExtInfo(UserExtInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.PROVINCE, _Fields.SCREEN_MOD};
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetAvatar()) {
            this.avatar = other.avatar;
        }
        this.longitude = other.longitude;
        this.latitude = other.latitude;
        if (other.isSetProvince()) {
            this.province = other.province;
        }
        if (other.isSetCity()) {
            this.city = other.city;
        }
        if (other.isSetDistrict()) {
            this.district = other.district;
        }
        this.screen_mod = other.screen_mod;
    }
}
