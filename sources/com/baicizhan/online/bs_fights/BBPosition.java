package com.baicizhan.online.bs_fights;

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
/* loaded from: classes5.dex */
public class BBPosition implements TBase<BBPosition, _Fields>, Serializable, Cloneable, Comparable<BBPosition> {
    private static final int __LATITUDE_ISSET_ID = 1;
    private static final int __LONGITUDE_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String city;
    public String district;
    public double latitude;
    public double longitude;
    private _Fields[] optionals;
    public String province;
    private static final TStruct STRUCT_DESC = new TStruct("BBPosition");
    private static final TField LONGITUDE_FIELD_DESC = new TField("longitude", (byte) 4, 1);
    private static final TField LATITUDE_FIELD_DESC = new TField("latitude", (byte) 4, 2);
    private static final TField PROVINCE_FIELD_DESC = new TField("province", (byte) 11, 3);
    private static final TField CITY_FIELD_DESC = new TField("city", (byte) 11, 4);
    private static final TField DISTRICT_FIELD_DESC = new TField("district", (byte) 11, 5);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_fights.BBPosition$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_fights$BBPosition$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_fights$BBPosition$_Fields = iArr;
            try {
                iArr[_Fields.LONGITUDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBPosition$_Fields[_Fields.LATITUDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBPosition$_Fields[_Fields.PROVINCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBPosition$_Fields[_Fields.CITY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBPosition$_Fields[_Fields.DISTRICT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBPositionStandardScheme extends StandardScheme<BBPosition> {
        private BBPositionStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BBPosition struct) throws TException {
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
                                if (s11 != 5) {
                                    TProtocolUtil.skip(iprot, b11);
                                } else if (b11 == 11) {
                                    struct.district = iprot.readString();
                                    struct.setDistrictIsSet(true);
                                } else {
                                    TProtocolUtil.skip(iprot, b11);
                                }
                            } else if (b11 == 11) {
                                struct.city = iprot.readString();
                                struct.setCityIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 11) {
                            struct.province = iprot.readString();
                            struct.setProvinceIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 4) {
                        struct.latitude = iprot.readDouble();
                        struct.setLatitudeIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 4) {
                    struct.longitude = iprot.readDouble();
                    struct.setLongitudeIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
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

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BBPosition struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BBPosition.STRUCT_DESC);
            oprot.writeFieldBegin(BBPosition.LONGITUDE_FIELD_DESC);
            oprot.writeDouble(struct.longitude);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(BBPosition.LATITUDE_FIELD_DESC);
            oprot.writeDouble(struct.latitude);
            oprot.writeFieldEnd();
            if (struct.province != null && struct.isSetProvince()) {
                oprot.writeFieldBegin(BBPosition.PROVINCE_FIELD_DESC);
                oprot.writeString(struct.province);
                oprot.writeFieldEnd();
            }
            if (struct.city != null && struct.isSetCity()) {
                oprot.writeFieldBegin(BBPosition.CITY_FIELD_DESC);
                oprot.writeString(struct.city);
                oprot.writeFieldEnd();
            }
            if (struct.district != null && struct.isSetDistrict()) {
                oprot.writeFieldBegin(BBPosition.DISTRICT_FIELD_DESC);
                oprot.writeString(struct.district);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBPositionStandardSchemeFactory implements SchemeFactory {
        private BBPositionStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBPositionStandardScheme getScheme() {
            return new BBPositionStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBPositionTupleScheme extends TupleScheme<BBPosition> {
        private BBPositionTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BBPosition struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.longitude = tTupleProtocol.readDouble();
            struct.setLongitudeIsSet(true);
            struct.latitude = tTupleProtocol.readDouble();
            struct.setLatitudeIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(3);
            if (readBitSet.get(0)) {
                struct.province = tTupleProtocol.readString();
                struct.setProvinceIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.city = tTupleProtocol.readString();
                struct.setCityIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.district = tTupleProtocol.readString();
                struct.setDistrictIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BBPosition struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeDouble(struct.longitude);
            tTupleProtocol.writeDouble(struct.latitude);
            BitSet bitSet = new BitSet();
            if (struct.isSetProvince()) {
                bitSet.set(0);
            }
            if (struct.isSetCity()) {
                bitSet.set(1);
            }
            if (struct.isSetDistrict()) {
                bitSet.set(2);
            }
            tTupleProtocol.writeBitSet(bitSet, 3);
            if (struct.isSetProvince()) {
                tTupleProtocol.writeString(struct.province);
            }
            if (struct.isSetCity()) {
                tTupleProtocol.writeString(struct.city);
            }
            if (struct.isSetDistrict()) {
                tTupleProtocol.writeString(struct.district);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBPositionTupleSchemeFactory implements SchemeFactory {
        private BBPositionTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBPositionTupleScheme getScheme() {
            return new BBPositionTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        LONGITUDE(1, "longitude"),
        LATITUDE(2, "latitude"),
        PROVINCE(3, "province"),
        CITY(4, "city"),
        DISTRICT(5, "district");

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
                return LONGITUDE;
            }
            if (fieldId == 2) {
                return LATITUDE;
            }
            if (fieldId == 3) {
                return PROVINCE;
            }
            if (fieldId == 4) {
                return CITY;
            }
            if (fieldId != 5) {
                return null;
            }
            return DISTRICT;
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
        hashMap.put(StandardScheme.class, new BBPositionStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BBPositionTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.LONGITUDE, (_Fields) new FieldMetaData("longitude", (byte) 1, new FieldValueMetaData((byte) 4)));
        enumMap.put((EnumMap) _Fields.LATITUDE, (_Fields) new FieldMetaData("latitude", (byte) 1, new FieldValueMetaData((byte) 4)));
        enumMap.put((EnumMap) _Fields.PROVINCE, (_Fields) new FieldMetaData("province", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.CITY, (_Fields) new FieldMetaData("city", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.DISTRICT, (_Fields) new FieldMetaData("district", (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BBPosition.class, unmodifiableMap);
    }

    public BBPosition() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.PROVINCE, _Fields.CITY, _Fields.DISTRICT};
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
        setLongitudeIsSet(false);
        this.longitude = 0.0d;
        setLatitudeIsSet(false);
        this.latitude = 0.0d;
        this.province = null;
        this.city = null;
        this.district = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BBPosition)) {
            return equals((BBPosition) that);
        }
        return false;
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

    public int hashCode() {
        return 0;
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

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BBPosition setCity(String city) {
        this.city = city;
        return this;
    }

    public void setCityIsSet(boolean value) {
        if (value) {
            return;
        }
        this.city = null;
    }

    public BBPosition setDistrict(String district) {
        this.district = district;
        return this;
    }

    public void setDistrictIsSet(boolean value) {
        if (value) {
            return;
        }
        this.district = null;
    }

    public BBPosition setLatitude(double latitude) {
        this.latitude = latitude;
        setLatitudeIsSet(true);
        return this;
    }

    public void setLatitudeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public BBPosition setLongitude(double longitude) {
        this.longitude = longitude;
        setLongitudeIsSet(true);
        return this;
    }

    public void setLongitudeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public BBPosition setProvince(String province) {
        this.province = province;
        return this;
    }

    public void setProvinceIsSet(boolean value) {
        if (value) {
            return;
        }
        this.province = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BBPosition(");
        sb2.append("longitude:");
        sb2.append(this.longitude);
        sb2.append(j2.O);
        sb2.append("latitude:");
        sb2.append(this.latitude);
        if (isSetProvince()) {
            sb2.append(j2.O);
            sb2.append("province:");
            String str = this.province;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
        }
        if (isSetCity()) {
            sb2.append(j2.O);
            sb2.append("city:");
            String str2 = this.city;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
        }
        if (isSetDistrict()) {
            sb2.append(j2.O);
            sb2.append("district:");
            String str3 = this.district;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
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

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BBPosition other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo6 = Boolean.valueOf(isSetLongitude()).compareTo(Boolean.valueOf(other.isSetLongitude()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetLongitude() && (compareTo5 = TBaseHelper.compareTo(this.longitude, other.longitude)) != 0) {
            return compareTo5;
        }
        int compareTo7 = Boolean.valueOf(isSetLatitude()).compareTo(Boolean.valueOf(other.isSetLatitude()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetLatitude() && (compareTo4 = TBaseHelper.compareTo(this.latitude, other.latitude)) != 0) {
            return compareTo4;
        }
        int compareTo8 = Boolean.valueOf(isSetProvince()).compareTo(Boolean.valueOf(other.isSetProvince()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetProvince() && (compareTo3 = TBaseHelper.compareTo(this.province, other.province)) != 0) {
            return compareTo3;
        }
        int compareTo9 = Boolean.valueOf(isSetCity()).compareTo(Boolean.valueOf(other.isSetCity()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetCity() && (compareTo2 = TBaseHelper.compareTo(this.city, other.city)) != 0) {
            return compareTo2;
        }
        int compareTo10 = Boolean.valueOf(isSetDistrict()).compareTo(Boolean.valueOf(other.isSetDistrict()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!isSetDistrict() || (compareTo = TBaseHelper.compareTo(this.district, other.district)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BBPosition, _Fields> deepCopy2() {
        return new BBPosition(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BBPosition$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Double.valueOf(getLongitude());
        }
        if (i11 == 2) {
            return Double.valueOf(getLatitude());
        }
        if (i11 == 3) {
            return getProvince();
        }
        if (i11 == 4) {
            return getCity();
        }
        if (i11 == 5) {
            return getDistrict();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BBPosition$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetLongitude();
        }
        if (i11 == 2) {
            return isSetLatitude();
        }
        if (i11 == 3) {
            return isSetProvince();
        }
        if (i11 == 4) {
            return isSetCity();
        }
        if (i11 == 5) {
            return isSetDistrict();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BBPosition$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetLongitude();
                return;
            } else {
                setLongitude(((Double) value).doubleValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetLatitude();
                return;
            } else {
                setLatitude(((Double) value).doubleValue());
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetProvince();
                return;
            } else {
                setProvince((String) value);
                return;
            }
        }
        if (i11 == 4) {
            if (value == null) {
                unsetCity();
                return;
            } else {
                setCity((String) value);
                return;
            }
        }
        if (i11 != 5) {
            return;
        }
        if (value == null) {
            unsetDistrict();
        } else {
            setDistrict((String) value);
        }
    }

    public boolean equals(BBPosition that) {
        if (that == null || this.longitude != that.longitude || this.latitude != that.latitude) {
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
        if (isSetDistrict || isSetDistrict2) {
            return isSetDistrict && isSetDistrict2 && this.district.equals(that.district);
        }
        return true;
    }

    public BBPosition(double longitude, double latitude) {
        this();
        this.longitude = longitude;
        setLongitudeIsSet(true);
        this.latitude = latitude;
        setLatitudeIsSet(true);
    }

    public BBPosition(BBPosition other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.PROVINCE, _Fields.CITY, _Fields.DISTRICT};
        this.__isset_bitfield = other.__isset_bitfield;
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
    }

    public void validate() throws TException {
    }
}
