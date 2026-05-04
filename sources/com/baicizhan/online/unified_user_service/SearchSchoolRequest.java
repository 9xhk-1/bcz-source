package com.baicizhan.online.unified_user_service;

import com.huawei.hms.support.api.entity.pay.HwPayConstant;
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
public class SearchSchoolRequest implements TBase<SearchSchoolRequest, _Fields>, Serializable, Cloneable, Comparable<SearchSchoolRequest> {
    private static final int __LEVEL_ISSET_ID = 2;
    private static final int __PAGE_NUM_ISSET_ID = 0;
    private static final int __PAGE_SIZE_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String city;
    public String country;
    public String county;
    public int level;
    private _Fields[] optionals;
    public int page_num;
    public int page_size;
    public String province;
    public String school_key;
    private static final TStruct STRUCT_DESC = new TStruct("SearchSchoolRequest");
    private static final TField PAGE_NUM_FIELD_DESC = new TField("page_num", (byte) 8, 1);
    private static final TField PAGE_SIZE_FIELD_DESC = new TField("page_size", (byte) 8, 2);
    private static final TField COUNTRY_FIELD_DESC = new TField(HwPayConstant.KEY_COUNTRY, (byte) 11, 3);
    private static final TField PROVINCE_FIELD_DESC = new TField("province", (byte) 11, 4);
    private static final TField CITY_FIELD_DESC = new TField("city", (byte) 11, 5);
    private static final TField COUNTY_FIELD_DESC = new TField("county", (byte) 11, 6);
    private static final TField SCHOOL_KEY_FIELD_DESC = new TField("school_key", (byte) 11, 7);
    private static final TField LEVEL_FIELD_DESC = new TField("level", (byte) 8, 8);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.unified_user_service.SearchSchoolRequest$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$unified_user_service$SearchSchoolRequest$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$unified_user_service$SearchSchoolRequest$_Fields = iArr;
            try {
                iArr[_Fields.PAGE_NUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$SearchSchoolRequest$_Fields[_Fields.PAGE_SIZE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$SearchSchoolRequest$_Fields[_Fields.COUNTRY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$SearchSchoolRequest$_Fields[_Fields.PROVINCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$SearchSchoolRequest$_Fields[_Fields.CITY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$SearchSchoolRequest$_Fields[_Fields.COUNTY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$SearchSchoolRequest$_Fields[_Fields.SCHOOL_KEY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$SearchSchoolRequest$_Fields[_Fields.LEVEL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SearchSchoolRequestStandardScheme extends StandardScheme<SearchSchoolRequest> {
        private SearchSchoolRequestStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, SearchSchoolRequest struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetPage_num()) {
                        throw new TProtocolException("Required field 'page_num' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetPage_size()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'page_size' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.page_num = iprot.readI32();
                            struct.setPage_numIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.page_size = iprot.readI32();
                            struct.setPage_sizeIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.country = iprot.readString();
                            struct.setCountryIsSet(true);
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
                            struct.county = iprot.readString();
                            struct.setCountyIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.school_key = iprot.readString();
                            struct.setSchool_keyIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.level = iprot.readI32();
                            struct.setLevelIsSet(true);
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
        public void write(TProtocol oprot, SearchSchoolRequest struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(SearchSchoolRequest.STRUCT_DESC);
            oprot.writeFieldBegin(SearchSchoolRequest.PAGE_NUM_FIELD_DESC);
            oprot.writeI32(struct.page_num);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(SearchSchoolRequest.PAGE_SIZE_FIELD_DESC);
            oprot.writeI32(struct.page_size);
            oprot.writeFieldEnd();
            if (struct.country != null && struct.isSetCountry()) {
                oprot.writeFieldBegin(SearchSchoolRequest.COUNTRY_FIELD_DESC);
                oprot.writeString(struct.country);
                oprot.writeFieldEnd();
            }
            if (struct.province != null && struct.isSetProvince()) {
                oprot.writeFieldBegin(SearchSchoolRequest.PROVINCE_FIELD_DESC);
                oprot.writeString(struct.province);
                oprot.writeFieldEnd();
            }
            if (struct.city != null && struct.isSetCity()) {
                oprot.writeFieldBegin(SearchSchoolRequest.CITY_FIELD_DESC);
                oprot.writeString(struct.city);
                oprot.writeFieldEnd();
            }
            if (struct.county != null && struct.isSetCounty()) {
                oprot.writeFieldBegin(SearchSchoolRequest.COUNTY_FIELD_DESC);
                oprot.writeString(struct.county);
                oprot.writeFieldEnd();
            }
            if (struct.school_key != null && struct.isSetSchool_key()) {
                oprot.writeFieldBegin(SearchSchoolRequest.SCHOOL_KEY_FIELD_DESC);
                oprot.writeString(struct.school_key);
                oprot.writeFieldEnd();
            }
            if (struct.isSetLevel()) {
                oprot.writeFieldBegin(SearchSchoolRequest.LEVEL_FIELD_DESC);
                oprot.writeI32(struct.level);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SearchSchoolRequestStandardSchemeFactory implements SchemeFactory {
        private SearchSchoolRequestStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SearchSchoolRequestStandardScheme getScheme() {
            return new SearchSchoolRequestStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SearchSchoolRequestTupleScheme extends TupleScheme<SearchSchoolRequest> {
        private SearchSchoolRequestTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, SearchSchoolRequest struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.page_num = tTupleProtocol.readI32();
            struct.setPage_numIsSet(true);
            struct.page_size = tTupleProtocol.readI32();
            struct.setPage_sizeIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(6);
            if (readBitSet.get(0)) {
                struct.country = tTupleProtocol.readString();
                struct.setCountryIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.province = tTupleProtocol.readString();
                struct.setProvinceIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.city = tTupleProtocol.readString();
                struct.setCityIsSet(true);
            }
            if (readBitSet.get(3)) {
                struct.county = tTupleProtocol.readString();
                struct.setCountyIsSet(true);
            }
            if (readBitSet.get(4)) {
                struct.school_key = tTupleProtocol.readString();
                struct.setSchool_keyIsSet(true);
            }
            if (readBitSet.get(5)) {
                struct.level = tTupleProtocol.readI32();
                struct.setLevelIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, SearchSchoolRequest struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.page_num);
            tTupleProtocol.writeI32(struct.page_size);
            BitSet bitSet = new BitSet();
            if (struct.isSetCountry()) {
                bitSet.set(0);
            }
            if (struct.isSetProvince()) {
                bitSet.set(1);
            }
            if (struct.isSetCity()) {
                bitSet.set(2);
            }
            if (struct.isSetCounty()) {
                bitSet.set(3);
            }
            if (struct.isSetSchool_key()) {
                bitSet.set(4);
            }
            if (struct.isSetLevel()) {
                bitSet.set(5);
            }
            tTupleProtocol.writeBitSet(bitSet, 6);
            if (struct.isSetCountry()) {
                tTupleProtocol.writeString(struct.country);
            }
            if (struct.isSetProvince()) {
                tTupleProtocol.writeString(struct.province);
            }
            if (struct.isSetCity()) {
                tTupleProtocol.writeString(struct.city);
            }
            if (struct.isSetCounty()) {
                tTupleProtocol.writeString(struct.county);
            }
            if (struct.isSetSchool_key()) {
                tTupleProtocol.writeString(struct.school_key);
            }
            if (struct.isSetLevel()) {
                tTupleProtocol.writeI32(struct.level);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SearchSchoolRequestTupleSchemeFactory implements SchemeFactory {
        private SearchSchoolRequestTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SearchSchoolRequestTupleScheme getScheme() {
            return new SearchSchoolRequestTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        PAGE_NUM(1, "page_num"),
        PAGE_SIZE(2, "page_size"),
        COUNTRY(3, HwPayConstant.KEY_COUNTRY),
        PROVINCE(4, "province"),
        CITY(5, "city"),
        COUNTY(6, "county"),
        SCHOOL_KEY(7, "school_key"),
        LEVEL(8, "level");

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
                    return PAGE_NUM;
                case 2:
                    return PAGE_SIZE;
                case 3:
                    return COUNTRY;
                case 4:
                    return PROVINCE;
                case 5:
                    return CITY;
                case 6:
                    return COUNTY;
                case 7:
                    return SCHOOL_KEY;
                case 8:
                    return LEVEL;
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
        hashMap.put(StandardScheme.class, new SearchSchoolRequestStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new SearchSchoolRequestTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.PAGE_NUM, (_Fields) new FieldMetaData("page_num", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.PAGE_SIZE, (_Fields) new FieldMetaData("page_size", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.COUNTRY, (_Fields) new FieldMetaData(HwPayConstant.KEY_COUNTRY, (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.PROVINCE, (_Fields) new FieldMetaData("province", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.CITY, (_Fields) new FieldMetaData("city", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.COUNTY, (_Fields) new FieldMetaData("county", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SCHOOL_KEY, (_Fields) new FieldMetaData("school_key", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.LEVEL, (_Fields) new FieldMetaData("level", (byte) 2, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(SearchSchoolRequest.class, unmodifiableMap);
    }

    public SearchSchoolRequest() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.COUNTRY, _Fields.PROVINCE, _Fields.CITY, _Fields.COUNTY, _Fields.SCHOOL_KEY, _Fields.LEVEL};
        this.page_num = 0;
        this.page_size = 20;
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
        this.page_num = 0;
        this.page_size = 20;
        this.country = null;
        this.province = null;
        this.city = null;
        this.county = null;
        this.school_key = null;
        setLevelIsSet(false);
        this.level = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof SearchSchoolRequest)) {
            return equals((SearchSchoolRequest) that);
        }
        return false;
    }

    public String getCity() {
        return this.city;
    }

    public String getCountry() {
        return this.country;
    }

    public String getCounty() {
        return this.county;
    }

    public int getLevel() {
        return this.level;
    }

    public int getPage_num() {
        return this.page_num;
    }

    public int getPage_size() {
        return this.page_size;
    }

    public String getProvince() {
        return this.province;
    }

    public String getSchool_key() {
        return this.school_key;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetCity() {
        return this.city != null;
    }

    public boolean isSetCountry() {
        return this.country != null;
    }

    public boolean isSetCounty() {
        return this.county != null;
    }

    public boolean isSetLevel() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetPage_num() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetPage_size() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetProvince() {
        return this.province != null;
    }

    public boolean isSetSchool_key() {
        return this.school_key != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public SearchSchoolRequest setCity(String city) {
        this.city = city;
        return this;
    }

    public void setCityIsSet(boolean value) {
        if (value) {
            return;
        }
        this.city = null;
    }

    public SearchSchoolRequest setCountry(String country) {
        this.country = country;
        return this;
    }

    public void setCountryIsSet(boolean value) {
        if (value) {
            return;
        }
        this.country = null;
    }

    public SearchSchoolRequest setCounty(String county) {
        this.county = county;
        return this;
    }

    public void setCountyIsSet(boolean value) {
        if (value) {
            return;
        }
        this.county = null;
    }

    public SearchSchoolRequest setLevel(int level) {
        this.level = level;
        setLevelIsSet(true);
        return this;
    }

    public void setLevelIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public SearchSchoolRequest setPage_num(int page_num) {
        this.page_num = page_num;
        setPage_numIsSet(true);
        return this;
    }

    public void setPage_numIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public SearchSchoolRequest setPage_size(int page_size) {
        this.page_size = page_size;
        setPage_sizeIsSet(true);
        return this;
    }

    public void setPage_sizeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public SearchSchoolRequest setProvince(String province) {
        this.province = province;
        return this;
    }

    public void setProvinceIsSet(boolean value) {
        if (value) {
            return;
        }
        this.province = null;
    }

    public SearchSchoolRequest setSchool_key(String school_key) {
        this.school_key = school_key;
        return this;
    }

    public void setSchool_keyIsSet(boolean value) {
        if (value) {
            return;
        }
        this.school_key = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SearchSchoolRequest(");
        sb2.append("page_num:");
        sb2.append(this.page_num);
        sb2.append(j2.O);
        sb2.append("page_size:");
        sb2.append(this.page_size);
        if (isSetCountry()) {
            sb2.append(j2.O);
            sb2.append("country:");
            String str = this.country;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
        }
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
        if (isSetCity()) {
            sb2.append(j2.O);
            sb2.append("city:");
            String str3 = this.city;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
        }
        if (isSetCounty()) {
            sb2.append(j2.O);
            sb2.append("county:");
            String str4 = this.county;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (isSetSchool_key()) {
            sb2.append(j2.O);
            sb2.append("school_key:");
            String str5 = this.school_key;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        if (isSetLevel()) {
            sb2.append(j2.O);
            sb2.append("level:");
            sb2.append(this.level);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetCity() {
        this.city = null;
    }

    public void unsetCountry() {
        this.country = null;
    }

    public void unsetCounty() {
        this.county = null;
    }

    public void unsetLevel() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetPage_num() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetPage_size() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetProvince() {
        this.province = null;
    }

    public void unsetSchool_key() {
        this.school_key = null;
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(SearchSchoolRequest other) {
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
        int compareTo9 = Boolean.valueOf(isSetPage_num()).compareTo(Boolean.valueOf(other.isSetPage_num()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetPage_num() && (compareTo8 = TBaseHelper.compareTo(this.page_num, other.page_num)) != 0) {
            return compareTo8;
        }
        int compareTo10 = Boolean.valueOf(isSetPage_size()).compareTo(Boolean.valueOf(other.isSetPage_size()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetPage_size() && (compareTo7 = TBaseHelper.compareTo(this.page_size, other.page_size)) != 0) {
            return compareTo7;
        }
        int compareTo11 = Boolean.valueOf(isSetCountry()).compareTo(Boolean.valueOf(other.isSetCountry()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetCountry() && (compareTo6 = TBaseHelper.compareTo(this.country, other.country)) != 0) {
            return compareTo6;
        }
        int compareTo12 = Boolean.valueOf(isSetProvince()).compareTo(Boolean.valueOf(other.isSetProvince()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetProvince() && (compareTo5 = TBaseHelper.compareTo(this.province, other.province)) != 0) {
            return compareTo5;
        }
        int compareTo13 = Boolean.valueOf(isSetCity()).compareTo(Boolean.valueOf(other.isSetCity()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetCity() && (compareTo4 = TBaseHelper.compareTo(this.city, other.city)) != 0) {
            return compareTo4;
        }
        int compareTo14 = Boolean.valueOf(isSetCounty()).compareTo(Boolean.valueOf(other.isSetCounty()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (isSetCounty() && (compareTo3 = TBaseHelper.compareTo(this.county, other.county)) != 0) {
            return compareTo3;
        }
        int compareTo15 = Boolean.valueOf(isSetSchool_key()).compareTo(Boolean.valueOf(other.isSetSchool_key()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (isSetSchool_key() && (compareTo2 = TBaseHelper.compareTo(this.school_key, other.school_key)) != 0) {
            return compareTo2;
        }
        int compareTo16 = Boolean.valueOf(isSetLevel()).compareTo(Boolean.valueOf(other.isSetLevel()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (!isSetLevel() || (compareTo = TBaseHelper.compareTo(this.level, other.level)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<SearchSchoolRequest, _Fields> deepCopy2() {
        return new SearchSchoolRequest(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$SearchSchoolRequest$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getPage_num());
            case 2:
                return Integer.valueOf(getPage_size());
            case 3:
                return getCountry();
            case 4:
                return getProvince();
            case 5:
                return getCity();
            case 6:
                return getCounty();
            case 7:
                return getSchool_key();
            case 8:
                return Integer.valueOf(getLevel());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$SearchSchoolRequest$_Fields[field.ordinal()]) {
            case 1:
                return isSetPage_num();
            case 2:
                return isSetPage_size();
            case 3:
                return isSetCountry();
            case 4:
                return isSetProvince();
            case 5:
                return isSetCity();
            case 6:
                return isSetCounty();
            case 7:
                return isSetSchool_key();
            case 8:
                return isSetLevel();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$SearchSchoolRequest$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setPage_num(((Integer) value).intValue());
                    break;
                } else {
                    unsetPage_num();
                    break;
                }
            case 2:
                if (value != null) {
                    setPage_size(((Integer) value).intValue());
                    break;
                } else {
                    unsetPage_size();
                    break;
                }
            case 3:
                if (value != null) {
                    setCountry((String) value);
                    break;
                } else {
                    unsetCountry();
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
                    setCounty((String) value);
                    break;
                } else {
                    unsetCounty();
                    break;
                }
            case 7:
                if (value != null) {
                    setSchool_key((String) value);
                    break;
                } else {
                    unsetSchool_key();
                    break;
                }
            case 8:
                if (value != null) {
                    setLevel(((Integer) value).intValue());
                    break;
                } else {
                    unsetLevel();
                    break;
                }
        }
    }

    public boolean equals(SearchSchoolRequest that) {
        if (that == null || this.page_num != that.page_num || this.page_size != that.page_size) {
            return false;
        }
        boolean isSetCountry = isSetCountry();
        boolean isSetCountry2 = that.isSetCountry();
        if ((isSetCountry || isSetCountry2) && !(isSetCountry && isSetCountry2 && this.country.equals(that.country))) {
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
        boolean isSetCounty = isSetCounty();
        boolean isSetCounty2 = that.isSetCounty();
        if ((isSetCounty || isSetCounty2) && !(isSetCounty && isSetCounty2 && this.county.equals(that.county))) {
            return false;
        }
        boolean isSetSchool_key = isSetSchool_key();
        boolean isSetSchool_key2 = that.isSetSchool_key();
        if ((isSetSchool_key || isSetSchool_key2) && !(isSetSchool_key && isSetSchool_key2 && this.school_key.equals(that.school_key))) {
            return false;
        }
        boolean isSetLevel = isSetLevel();
        boolean isSetLevel2 = that.isSetLevel();
        if (isSetLevel || isSetLevel2) {
            return isSetLevel && isSetLevel2 && this.level == that.level;
        }
        return true;
    }

    public SearchSchoolRequest(int page_num, int page_size) {
        this();
        this.page_num = page_num;
        setPage_numIsSet(true);
        this.page_size = page_size;
        setPage_sizeIsSet(true);
    }

    public SearchSchoolRequest(SearchSchoolRequest other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.COUNTRY, _Fields.PROVINCE, _Fields.CITY, _Fields.COUNTY, _Fields.SCHOOL_KEY, _Fields.LEVEL};
        this.__isset_bitfield = other.__isset_bitfield;
        this.page_num = other.page_num;
        this.page_size = other.page_size;
        if (other.isSetCountry()) {
            this.country = other.country;
        }
        if (other.isSetProvince()) {
            this.province = other.province;
        }
        if (other.isSetCity()) {
            this.city = other.city;
        }
        if (other.isSetCounty()) {
            this.county = other.county;
        }
        if (other.isSetSchool_key()) {
            this.school_key = other.school_key;
        }
        this.level = other.level;
    }

    public void validate() throws TException {
    }
}
