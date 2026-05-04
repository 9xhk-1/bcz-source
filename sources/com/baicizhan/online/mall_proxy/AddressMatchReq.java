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
import org.apache.thrift.TBase;
import org.apache.thrift.TBaseHelper;
import org.apache.thrift.TException;
import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TField;
import org.apache.thrift.protocol.TProtocol;
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
public class AddressMatchReq implements TBase<AddressMatchReq, _Fields>, Serializable, Cloneable, Comparable<AddressMatchReq> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public String city;
    public String district;
    private _Fields[] optionals;
    public String province;
    public String street;
    private static final TStruct STRUCT_DESC = new TStruct("AddressMatchReq");
    private static final TField PROVINCE_FIELD_DESC = new TField("province", (byte) 11, 1);
    private static final TField CITY_FIELD_DESC = new TField("city", (byte) 11, 2);
    private static final TField DISTRICT_FIELD_DESC = new TField("district", (byte) 11, 3);
    private static final TField STREET_FIELD_DESC = new TField("street", (byte) 11, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.mall_proxy.AddressMatchReq$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$mall_proxy$AddressMatchReq$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$mall_proxy$AddressMatchReq$_Fields = iArr;
            try {
                iArr[_Fields.PROVINCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$mall_proxy$AddressMatchReq$_Fields[_Fields.CITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$mall_proxy$AddressMatchReq$_Fields[_Fields.DISTRICT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$mall_proxy$AddressMatchReq$_Fields[_Fields.STREET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AddressMatchReqStandardScheme extends StandardScheme<AddressMatchReq> {
        private AddressMatchReqStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, AddressMatchReq struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    struct.validate();
                    return;
                }
                short s11 = readFieldBegin.f77768id;
                if (s11 != 1) {
                    if (s11 != 2) {
                        if (s11 != 3) {
                            if (s11 != 4) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 11) {
                                struct.street = iprot.readString();
                                struct.setStreetIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
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
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, AddressMatchReq struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(AddressMatchReq.STRUCT_DESC);
            if (struct.province != null && struct.isSetProvince()) {
                oprot.writeFieldBegin(AddressMatchReq.PROVINCE_FIELD_DESC);
                oprot.writeString(struct.province);
                oprot.writeFieldEnd();
            }
            if (struct.city != null && struct.isSetCity()) {
                oprot.writeFieldBegin(AddressMatchReq.CITY_FIELD_DESC);
                oprot.writeString(struct.city);
                oprot.writeFieldEnd();
            }
            if (struct.district != null && struct.isSetDistrict()) {
                oprot.writeFieldBegin(AddressMatchReq.DISTRICT_FIELD_DESC);
                oprot.writeString(struct.district);
                oprot.writeFieldEnd();
            }
            if (struct.street != null && struct.isSetStreet()) {
                oprot.writeFieldBegin(AddressMatchReq.STREET_FIELD_DESC);
                oprot.writeString(struct.street);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AddressMatchReqStandardSchemeFactory implements SchemeFactory {
        private AddressMatchReqStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AddressMatchReqStandardScheme getScheme() {
            return new AddressMatchReqStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AddressMatchReqTupleScheme extends TupleScheme<AddressMatchReq> {
        private AddressMatchReqTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, AddressMatchReq struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BitSet readBitSet = tTupleProtocol.readBitSet(4);
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
            if (readBitSet.get(3)) {
                struct.street = tTupleProtocol.readString();
                struct.setStreetIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, AddressMatchReq struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
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
            if (struct.isSetStreet()) {
                bitSet.set(3);
            }
            tTupleProtocol.writeBitSet(bitSet, 4);
            if (struct.isSetProvince()) {
                tTupleProtocol.writeString(struct.province);
            }
            if (struct.isSetCity()) {
                tTupleProtocol.writeString(struct.city);
            }
            if (struct.isSetDistrict()) {
                tTupleProtocol.writeString(struct.district);
            }
            if (struct.isSetStreet()) {
                tTupleProtocol.writeString(struct.street);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AddressMatchReqTupleSchemeFactory implements SchemeFactory {
        private AddressMatchReqTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AddressMatchReqTupleScheme getScheme() {
            return new AddressMatchReqTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        PROVINCE(1, "province"),
        CITY(2, "city"),
        DISTRICT(3, "district"),
        STREET(4, "street");

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
                return PROVINCE;
            }
            if (fieldId == 2) {
                return CITY;
            }
            if (fieldId == 3) {
                return DISTRICT;
            }
            if (fieldId != 4) {
                return null;
            }
            return STREET;
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
        hashMap.put(StandardScheme.class, new AddressMatchReqStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new AddressMatchReqTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.PROVINCE, (_Fields) new FieldMetaData("province", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.CITY, (_Fields) new FieldMetaData("city", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.DISTRICT, (_Fields) new FieldMetaData("district", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.STREET, (_Fields) new FieldMetaData("street", (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(AddressMatchReq.class, unmodifiableMap);
    }

    public AddressMatchReq() {
        this.optionals = new _Fields[]{_Fields.PROVINCE, _Fields.CITY, _Fields.DISTRICT, _Fields.STREET};
    }

    private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
        try {
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
        this.province = null;
        this.city = null;
        this.district = null;
        this.street = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof AddressMatchReq)) {
            return equals((AddressMatchReq) that);
        }
        return false;
    }

    public String getCity() {
        return this.city;
    }

    public String getDistrict() {
        return this.district;
    }

    public String getProvince() {
        return this.province;
    }

    public String getStreet() {
        return this.street;
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

    public boolean isSetProvince() {
        return this.province != null;
    }

    public boolean isSetStreet() {
        return this.street != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public AddressMatchReq setCity(String city) {
        this.city = city;
        return this;
    }

    public void setCityIsSet(boolean value) {
        if (value) {
            return;
        }
        this.city = null;
    }

    public AddressMatchReq setDistrict(String district) {
        this.district = district;
        return this;
    }

    public void setDistrictIsSet(boolean value) {
        if (value) {
            return;
        }
        this.district = null;
    }

    public AddressMatchReq setProvince(String province) {
        this.province = province;
        return this;
    }

    public void setProvinceIsSet(boolean value) {
        if (value) {
            return;
        }
        this.province = null;
    }

    public AddressMatchReq setStreet(String street) {
        this.street = street;
        return this;
    }

    public void setStreetIsSet(boolean value) {
        if (value) {
            return;
        }
        this.street = null;
    }

    public String toString() {
        boolean z11;
        StringBuilder sb2 = new StringBuilder("AddressMatchReq(");
        boolean z12 = false;
        if (isSetProvince()) {
            sb2.append("province:");
            String str = this.province;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            z11 = false;
        } else {
            z11 = true;
        }
        if (isSetCity()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("city:");
            String str2 = this.city;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
            z11 = false;
        }
        if (isSetDistrict()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("district:");
            String str3 = this.district;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
        } else {
            z12 = z11;
        }
        if (isSetStreet()) {
            if (!z12) {
                sb2.append(j2.O);
            }
            sb2.append("street:");
            String str4 = this.street;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        sb2.append(j.f81007d);
        return sb2.toString();
    }

    public void unsetCity() {
        this.city = null;
    }

    public void unsetDistrict() {
        this.district = null;
    }

    public void unsetProvince() {
        this.province = null;
    }

    public void unsetStreet() {
        this.street = null;
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(AddressMatchReq other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetProvince()).compareTo(Boolean.valueOf(other.isSetProvince()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetProvince() && (compareTo4 = TBaseHelper.compareTo(this.province, other.province)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetCity()).compareTo(Boolean.valueOf(other.isSetCity()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetCity() && (compareTo3 = TBaseHelper.compareTo(this.city, other.city)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetDistrict()).compareTo(Boolean.valueOf(other.isSetDistrict()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetDistrict() && (compareTo2 = TBaseHelper.compareTo(this.district, other.district)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetStreet()).compareTo(Boolean.valueOf(other.isSetStreet()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetStreet() || (compareTo = TBaseHelper.compareTo(this.street, other.street)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<AddressMatchReq, _Fields> deepCopy2() {
        return new AddressMatchReq(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$AddressMatchReq$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getProvince();
        }
        if (i11 == 2) {
            return getCity();
        }
        if (i11 == 3) {
            return getDistrict();
        }
        if (i11 == 4) {
            return getStreet();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$AddressMatchReq$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetProvince();
        }
        if (i11 == 2) {
            return isSetCity();
        }
        if (i11 == 3) {
            return isSetDistrict();
        }
        if (i11 == 4) {
            return isSetStreet();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$mall_proxy$AddressMatchReq$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetProvince();
                return;
            } else {
                setProvince((String) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetCity();
                return;
            } else {
                setCity((String) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetDistrict();
                return;
            } else {
                setDistrict((String) value);
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetStreet();
        } else {
            setStreet((String) value);
        }
    }

    public AddressMatchReq(AddressMatchReq other) {
        this.optionals = new _Fields[]{_Fields.PROVINCE, _Fields.CITY, _Fields.DISTRICT, _Fields.STREET};
        if (other.isSetProvince()) {
            this.province = other.province;
        }
        if (other.isSetCity()) {
            this.city = other.city;
        }
        if (other.isSetDistrict()) {
            this.district = other.district;
        }
        if (other.isSetStreet()) {
            this.street = other.street;
        }
    }

    public boolean equals(AddressMatchReq that) {
        if (that == null) {
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
        boolean isSetStreet = isSetStreet();
        boolean isSetStreet2 = that.isSetStreet();
        if (isSetStreet || isSetStreet2) {
            return isSetStreet && isSetStreet2 && this.street.equals(that.street);
        }
        return true;
    }

    public void validate() throws TException {
    }
}
