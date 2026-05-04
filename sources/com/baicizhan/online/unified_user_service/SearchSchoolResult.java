package com.baicizhan.online.unified_user_service;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TBase;
import org.apache.thrift.TBaseHelper;
import org.apache.thrift.TException;
import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TField;
import org.apache.thrift.protocol.TList;
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
public class SearchSchoolResult implements TBase<SearchSchoolResult, _Fields>, Serializable, Cloneable, Comparable<SearchSchoolResult> {
    private static final int __HAS_NEXT_ISSET_ID = 0;
    private static final int __NUMBER_ISSET_ID = 3;
    private static final int __PAGE_NUM_ISSET_ID = 1;
    private static final int __PAGE_SIZE_ISSET_ID = 2;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public List<String> citys;
    public List<String> countrys;
    public List<String> countys;
    public boolean has_next;
    public int number;
    private _Fields[] optionals;
    public int page_num;
    public int page_size;
    public List<String> provinces;
    public List<SearchSchoolItem> schools;
    public List<SearchSchoolItem> sp_schools;
    private static final TStruct STRUCT_DESC = new TStruct("SearchSchoolResult");
    private static final TField HAS_NEXT_FIELD_DESC = new TField("has_next", (byte) 2, 1);
    private static final TField PAGE_NUM_FIELD_DESC = new TField("page_num", (byte) 8, 2);
    private static final TField PAGE_SIZE_FIELD_DESC = new TField("page_size", (byte) 8, 3);
    private static final TField NUMBER_FIELD_DESC = new TField("number", (byte) 8, 4);
    private static final TField SCHOOLS_FIELD_DESC = new TField("schools", (byte) 15, 5);
    private static final TField COUNTRYS_FIELD_DESC = new TField("countrys", (byte) 15, 6);
    private static final TField PROVINCES_FIELD_DESC = new TField("provinces", (byte) 15, 7);
    private static final TField CITYS_FIELD_DESC = new TField("citys", (byte) 15, 8);
    private static final TField COUNTYS_FIELD_DESC = new TField("countys", (byte) 15, 9);
    private static final TField SP_SCHOOLS_FIELD_DESC = new TField("sp_schools", (byte) 15, 10);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.unified_user_service.SearchSchoolResult$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$unified_user_service$SearchSchoolResult$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$unified_user_service$SearchSchoolResult$_Fields = iArr;
            try {
                iArr[_Fields.HAS_NEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$SearchSchoolResult$_Fields[_Fields.PAGE_NUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$SearchSchoolResult$_Fields[_Fields.PAGE_SIZE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$SearchSchoolResult$_Fields[_Fields.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$SearchSchoolResult$_Fields[_Fields.SCHOOLS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$SearchSchoolResult$_Fields[_Fields.COUNTRYS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$SearchSchoolResult$_Fields[_Fields.PROVINCES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$SearchSchoolResult$_Fields[_Fields.CITYS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$SearchSchoolResult$_Fields[_Fields.COUNTYS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$SearchSchoolResult$_Fields[_Fields.SP_SCHOOLS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SearchSchoolResultStandardScheme extends StandardScheme<SearchSchoolResult> {
        private SearchSchoolResultStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, SearchSchoolResult struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetHas_next()) {
                        throw new TProtocolException("Required field 'has_next' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetPage_num()) {
                        throw new TProtocolException("Required field 'page_num' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetPage_size()) {
                        throw new TProtocolException("Required field 'page_size' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetNumber()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'number' was not found in serialized data! Struct: " + toString());
                }
                int i11 = 0;
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 2) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.has_next = iprot.readBool();
                            struct.setHas_nextIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.page_num = iprot.readI32();
                            struct.setPage_numIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.page_size = iprot.readI32();
                            struct.setPage_sizeIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.number = iprot.readI32();
                            struct.setNumberIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 15) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            TList readListBegin = iprot.readListBegin();
                            struct.schools = new ArrayList(readListBegin.size);
                            while (i11 < readListBegin.size) {
                                SearchSchoolItem searchSchoolItem = new SearchSchoolItem();
                                searchSchoolItem.read(iprot);
                                struct.schools.add(searchSchoolItem);
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setSchoolsIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 15) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            TList readListBegin2 = iprot.readListBegin();
                            struct.countrys = new ArrayList(readListBegin2.size);
                            while (i11 < readListBegin2.size) {
                                struct.countrys.add(iprot.readString());
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setCountrysIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 15) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            TList readListBegin3 = iprot.readListBegin();
                            struct.provinces = new ArrayList(readListBegin3.size);
                            while (i11 < readListBegin3.size) {
                                struct.provinces.add(iprot.readString());
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setProvincesIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 15) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            TList readListBegin4 = iprot.readListBegin();
                            struct.citys = new ArrayList(readListBegin4.size);
                            while (i11 < readListBegin4.size) {
                                struct.citys.add(iprot.readString());
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setCitysIsSet(true);
                            break;
                        }
                    case 9:
                        if (b11 != 15) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            TList readListBegin5 = iprot.readListBegin();
                            struct.countys = new ArrayList(readListBegin5.size);
                            while (i11 < readListBegin5.size) {
                                struct.countys.add(iprot.readString());
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setCountysIsSet(true);
                            break;
                        }
                    case 10:
                        if (b11 != 15) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            TList readListBegin6 = iprot.readListBegin();
                            struct.sp_schools = new ArrayList(readListBegin6.size);
                            while (i11 < readListBegin6.size) {
                                SearchSchoolItem searchSchoolItem2 = new SearchSchoolItem();
                                searchSchoolItem2.read(iprot);
                                struct.sp_schools.add(searchSchoolItem2);
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setSp_schoolsIsSet(true);
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
        public void write(TProtocol oprot, SearchSchoolResult struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(SearchSchoolResult.STRUCT_DESC);
            oprot.writeFieldBegin(SearchSchoolResult.HAS_NEXT_FIELD_DESC);
            oprot.writeBool(struct.has_next);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(SearchSchoolResult.PAGE_NUM_FIELD_DESC);
            oprot.writeI32(struct.page_num);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(SearchSchoolResult.PAGE_SIZE_FIELD_DESC);
            oprot.writeI32(struct.page_size);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(SearchSchoolResult.NUMBER_FIELD_DESC);
            oprot.writeI32(struct.number);
            oprot.writeFieldEnd();
            if (struct.schools != null && struct.isSetSchools()) {
                oprot.writeFieldBegin(SearchSchoolResult.SCHOOLS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.schools.size()));
                Iterator<SearchSchoolItem> it = struct.schools.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.countrys != null && struct.isSetCountrys()) {
                oprot.writeFieldBegin(SearchSchoolResult.COUNTRYS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 11, struct.countrys.size()));
                Iterator<String> it2 = struct.countrys.iterator();
                while (it2.hasNext()) {
                    oprot.writeString(it2.next());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.provinces != null && struct.isSetProvinces()) {
                oprot.writeFieldBegin(SearchSchoolResult.PROVINCES_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 11, struct.provinces.size()));
                Iterator<String> it3 = struct.provinces.iterator();
                while (it3.hasNext()) {
                    oprot.writeString(it3.next());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.citys != null && struct.isSetCitys()) {
                oprot.writeFieldBegin(SearchSchoolResult.CITYS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 11, struct.citys.size()));
                Iterator<String> it4 = struct.citys.iterator();
                while (it4.hasNext()) {
                    oprot.writeString(it4.next());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.countys != null && struct.isSetCountys()) {
                oprot.writeFieldBegin(SearchSchoolResult.COUNTYS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 11, struct.countys.size()));
                Iterator<String> it5 = struct.countys.iterator();
                while (it5.hasNext()) {
                    oprot.writeString(it5.next());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.sp_schools != null && struct.isSetSp_schools()) {
                oprot.writeFieldBegin(SearchSchoolResult.SP_SCHOOLS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.sp_schools.size()));
                Iterator<SearchSchoolItem> it6 = struct.sp_schools.iterator();
                while (it6.hasNext()) {
                    it6.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SearchSchoolResultStandardSchemeFactory implements SchemeFactory {
        private SearchSchoolResultStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SearchSchoolResultStandardScheme getScheme() {
            return new SearchSchoolResultStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SearchSchoolResultTupleScheme extends TupleScheme<SearchSchoolResult> {
        private SearchSchoolResultTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, SearchSchoolResult struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.has_next = tTupleProtocol.readBool();
            struct.setHas_nextIsSet(true);
            struct.page_num = tTupleProtocol.readI32();
            struct.setPage_numIsSet(true);
            struct.page_size = tTupleProtocol.readI32();
            struct.setPage_sizeIsSet(true);
            struct.number = tTupleProtocol.readI32();
            struct.setNumberIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(6);
            if (readBitSet.get(0)) {
                TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                struct.schools = new ArrayList(tList.size);
                for (int i11 = 0; i11 < tList.size; i11++) {
                    SearchSchoolItem searchSchoolItem = new SearchSchoolItem();
                    searchSchoolItem.read(tTupleProtocol);
                    struct.schools.add(searchSchoolItem);
                }
                struct.setSchoolsIsSet(true);
            }
            if (readBitSet.get(1)) {
                TList tList2 = new TList((byte) 11, tTupleProtocol.readI32());
                struct.countrys = new ArrayList(tList2.size);
                for (int i12 = 0; i12 < tList2.size; i12++) {
                    struct.countrys.add(tTupleProtocol.readString());
                }
                struct.setCountrysIsSet(true);
            }
            if (readBitSet.get(2)) {
                TList tList3 = new TList((byte) 11, tTupleProtocol.readI32());
                struct.provinces = new ArrayList(tList3.size);
                for (int i13 = 0; i13 < tList3.size; i13++) {
                    struct.provinces.add(tTupleProtocol.readString());
                }
                struct.setProvincesIsSet(true);
            }
            if (readBitSet.get(3)) {
                TList tList4 = new TList((byte) 11, tTupleProtocol.readI32());
                struct.citys = new ArrayList(tList4.size);
                for (int i14 = 0; i14 < tList4.size; i14++) {
                    struct.citys.add(tTupleProtocol.readString());
                }
                struct.setCitysIsSet(true);
            }
            if (readBitSet.get(4)) {
                TList tList5 = new TList((byte) 11, tTupleProtocol.readI32());
                struct.countys = new ArrayList(tList5.size);
                for (int i15 = 0; i15 < tList5.size; i15++) {
                    struct.countys.add(tTupleProtocol.readString());
                }
                struct.setCountysIsSet(true);
            }
            if (readBitSet.get(5)) {
                TList tList6 = new TList((byte) 12, tTupleProtocol.readI32());
                struct.sp_schools = new ArrayList(tList6.size);
                for (int i16 = 0; i16 < tList6.size; i16++) {
                    SearchSchoolItem searchSchoolItem2 = new SearchSchoolItem();
                    searchSchoolItem2.read(tTupleProtocol);
                    struct.sp_schools.add(searchSchoolItem2);
                }
                struct.setSp_schoolsIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, SearchSchoolResult struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeBool(struct.has_next);
            tTupleProtocol.writeI32(struct.page_num);
            tTupleProtocol.writeI32(struct.page_size);
            tTupleProtocol.writeI32(struct.number);
            BitSet bitSet = new BitSet();
            if (struct.isSetSchools()) {
                bitSet.set(0);
            }
            if (struct.isSetCountrys()) {
                bitSet.set(1);
            }
            if (struct.isSetProvinces()) {
                bitSet.set(2);
            }
            if (struct.isSetCitys()) {
                bitSet.set(3);
            }
            if (struct.isSetCountys()) {
                bitSet.set(4);
            }
            if (struct.isSetSp_schools()) {
                bitSet.set(5);
            }
            tTupleProtocol.writeBitSet(bitSet, 6);
            if (struct.isSetSchools()) {
                tTupleProtocol.writeI32(struct.schools.size());
                Iterator<SearchSchoolItem> it = struct.schools.iterator();
                while (it.hasNext()) {
                    it.next().write(tTupleProtocol);
                }
            }
            if (struct.isSetCountrys()) {
                tTupleProtocol.writeI32(struct.countrys.size());
                Iterator<String> it2 = struct.countrys.iterator();
                while (it2.hasNext()) {
                    tTupleProtocol.writeString(it2.next());
                }
            }
            if (struct.isSetProvinces()) {
                tTupleProtocol.writeI32(struct.provinces.size());
                Iterator<String> it3 = struct.provinces.iterator();
                while (it3.hasNext()) {
                    tTupleProtocol.writeString(it3.next());
                }
            }
            if (struct.isSetCitys()) {
                tTupleProtocol.writeI32(struct.citys.size());
                Iterator<String> it4 = struct.citys.iterator();
                while (it4.hasNext()) {
                    tTupleProtocol.writeString(it4.next());
                }
            }
            if (struct.isSetCountys()) {
                tTupleProtocol.writeI32(struct.countys.size());
                Iterator<String> it5 = struct.countys.iterator();
                while (it5.hasNext()) {
                    tTupleProtocol.writeString(it5.next());
                }
            }
            if (struct.isSetSp_schools()) {
                tTupleProtocol.writeI32(struct.sp_schools.size());
                Iterator<SearchSchoolItem> it6 = struct.sp_schools.iterator();
                while (it6.hasNext()) {
                    it6.next().write(tTupleProtocol);
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SearchSchoolResultTupleSchemeFactory implements SchemeFactory {
        private SearchSchoolResultTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SearchSchoolResultTupleScheme getScheme() {
            return new SearchSchoolResultTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        HAS_NEXT(1, "has_next"),
        PAGE_NUM(2, "page_num"),
        PAGE_SIZE(3, "page_size"),
        NUMBER(4, "number"),
        SCHOOLS(5, "schools"),
        COUNTRYS(6, "countrys"),
        PROVINCES(7, "provinces"),
        CITYS(8, "citys"),
        COUNTYS(9, "countys"),
        SP_SCHOOLS(10, "sp_schools");

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
                    return HAS_NEXT;
                case 2:
                    return PAGE_NUM;
                case 3:
                    return PAGE_SIZE;
                case 4:
                    return NUMBER;
                case 5:
                    return SCHOOLS;
                case 6:
                    return COUNTRYS;
                case 7:
                    return PROVINCES;
                case 8:
                    return CITYS;
                case 9:
                    return COUNTYS;
                case 10:
                    return SP_SCHOOLS;
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
        hashMap.put(StandardScheme.class, new SearchSchoolResultStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new SearchSchoolResultTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.HAS_NEXT, (_Fields) new FieldMetaData("has_next", (byte) 1, new FieldValueMetaData((byte) 2)));
        enumMap.put((EnumMap) _Fields.PAGE_NUM, (_Fields) new FieldMetaData("page_num", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.PAGE_SIZE, (_Fields) new FieldMetaData("page_size", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.NUMBER, (_Fields) new FieldMetaData("number", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.SCHOOLS, (_Fields) new FieldMetaData("schools", (byte) 2, new ListMetaData((byte) 15, new StructMetaData((byte) 12, SearchSchoolItem.class))));
        enumMap.put((EnumMap) _Fields.COUNTRYS, (_Fields) new FieldMetaData("countrys", (byte) 2, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 11))));
        enumMap.put((EnumMap) _Fields.PROVINCES, (_Fields) new FieldMetaData("provinces", (byte) 2, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 11))));
        enumMap.put((EnumMap) _Fields.CITYS, (_Fields) new FieldMetaData("citys", (byte) 2, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 11))));
        enumMap.put((EnumMap) _Fields.COUNTYS, (_Fields) new FieldMetaData("countys", (byte) 2, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 11))));
        enumMap.put((EnumMap) _Fields.SP_SCHOOLS, (_Fields) new FieldMetaData("sp_schools", (byte) 2, new ListMetaData((byte) 15, new StructMetaData((byte) 12, SearchSchoolItem.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(SearchSchoolResult.class, unmodifiableMap);
    }

    public SearchSchoolResult() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.SCHOOLS, _Fields.COUNTRYS, _Fields.PROVINCES, _Fields.CITYS, _Fields.COUNTYS, _Fields.SP_SCHOOLS};
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

    public void addToCitys(String elem) {
        if (this.citys == null) {
            this.citys = new ArrayList();
        }
        this.citys.add(elem);
    }

    public void addToCountrys(String elem) {
        if (this.countrys == null) {
            this.countrys = new ArrayList();
        }
        this.countrys.add(elem);
    }

    public void addToCountys(String elem) {
        if (this.countys == null) {
            this.countys = new ArrayList();
        }
        this.countys.add(elem);
    }

    public void addToProvinces(String elem) {
        if (this.provinces == null) {
            this.provinces = new ArrayList();
        }
        this.provinces.add(elem);
    }

    public void addToSchools(SearchSchoolItem elem) {
        if (this.schools == null) {
            this.schools = new ArrayList();
        }
        this.schools.add(elem);
    }

    public void addToSp_schools(SearchSchoolItem elem) {
        if (this.sp_schools == null) {
            this.sp_schools = new ArrayList();
        }
        this.sp_schools.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        setHas_nextIsSet(false);
        this.has_next = false;
        setPage_numIsSet(false);
        this.page_num = 0;
        setPage_sizeIsSet(false);
        this.page_size = 0;
        setNumberIsSet(false);
        this.number = 0;
        this.schools = null;
        this.countrys = null;
        this.provinces = null;
        this.citys = null;
        this.countys = null;
        this.sp_schools = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof SearchSchoolResult)) {
            return equals((SearchSchoolResult) that);
        }
        return false;
    }

    public List<String> getCitys() {
        return this.citys;
    }

    public Iterator<String> getCitysIterator() {
        List<String> list = this.citys;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getCitysSize() {
        List<String> list = this.citys;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<String> getCountrys() {
        return this.countrys;
    }

    public Iterator<String> getCountrysIterator() {
        List<String> list = this.countrys;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getCountrysSize() {
        List<String> list = this.countrys;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<String> getCountys() {
        return this.countys;
    }

    public Iterator<String> getCountysIterator() {
        List<String> list = this.countys;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getCountysSize() {
        List<String> list = this.countys;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int getNumber() {
        return this.number;
    }

    public int getPage_num() {
        return this.page_num;
    }

    public int getPage_size() {
        return this.page_size;
    }

    public List<String> getProvinces() {
        return this.provinces;
    }

    public Iterator<String> getProvincesIterator() {
        List<String> list = this.provinces;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getProvincesSize() {
        List<String> list = this.provinces;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<SearchSchoolItem> getSchools() {
        return this.schools;
    }

    public Iterator<SearchSchoolItem> getSchoolsIterator() {
        List<SearchSchoolItem> list = this.schools;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getSchoolsSize() {
        List<SearchSchoolItem> list = this.schools;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<SearchSchoolItem> getSp_schools() {
        return this.sp_schools;
    }

    public Iterator<SearchSchoolItem> getSp_schoolsIterator() {
        List<SearchSchoolItem> list = this.sp_schools;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getSp_schoolsSize() {
        List<SearchSchoolItem> list = this.sp_schools;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isHas_next() {
        return this.has_next;
    }

    public boolean isSetCitys() {
        return this.citys != null;
    }

    public boolean isSetCountrys() {
        return this.countrys != null;
    }

    public boolean isSetCountys() {
        return this.countys != null;
    }

    public boolean isSetHas_next() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetNumber() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetPage_num() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetPage_size() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetProvinces() {
        return this.provinces != null;
    }

    public boolean isSetSchools() {
        return this.schools != null;
    }

    public boolean isSetSp_schools() {
        return this.sp_schools != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public SearchSchoolResult setCitys(List<String> citys) {
        this.citys = citys;
        return this;
    }

    public void setCitysIsSet(boolean value) {
        if (value) {
            return;
        }
        this.citys = null;
    }

    public SearchSchoolResult setCountrys(List<String> countrys) {
        this.countrys = countrys;
        return this;
    }

    public void setCountrysIsSet(boolean value) {
        if (value) {
            return;
        }
        this.countrys = null;
    }

    public SearchSchoolResult setCountys(List<String> countys) {
        this.countys = countys;
        return this;
    }

    public void setCountysIsSet(boolean value) {
        if (value) {
            return;
        }
        this.countys = null;
    }

    public SearchSchoolResult setHas_next(boolean has_next) {
        this.has_next = has_next;
        setHas_nextIsSet(true);
        return this;
    }

    public void setHas_nextIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public SearchSchoolResult setNumber(int number) {
        this.number = number;
        setNumberIsSet(true);
        return this;
    }

    public void setNumberIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public SearchSchoolResult setPage_num(int page_num) {
        this.page_num = page_num;
        setPage_numIsSet(true);
        return this;
    }

    public void setPage_numIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public SearchSchoolResult setPage_size(int page_size) {
        this.page_size = page_size;
        setPage_sizeIsSet(true);
        return this;
    }

    public void setPage_sizeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public SearchSchoolResult setProvinces(List<String> provinces) {
        this.provinces = provinces;
        return this;
    }

    public void setProvincesIsSet(boolean value) {
        if (value) {
            return;
        }
        this.provinces = null;
    }

    public SearchSchoolResult setSchools(List<SearchSchoolItem> schools) {
        this.schools = schools;
        return this;
    }

    public void setSchoolsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.schools = null;
    }

    public SearchSchoolResult setSp_schools(List<SearchSchoolItem> sp_schools) {
        this.sp_schools = sp_schools;
        return this;
    }

    public void setSp_schoolsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.sp_schools = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SearchSchoolResult(");
        sb2.append("has_next:");
        sb2.append(this.has_next);
        sb2.append(j2.O);
        sb2.append("page_num:");
        sb2.append(this.page_num);
        sb2.append(j2.O);
        sb2.append("page_size:");
        sb2.append(this.page_size);
        sb2.append(j2.O);
        sb2.append("number:");
        sb2.append(this.number);
        if (isSetSchools()) {
            sb2.append(j2.O);
            sb2.append("schools:");
            List<SearchSchoolItem> list = this.schools;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
        }
        if (isSetCountrys()) {
            sb2.append(j2.O);
            sb2.append("countrys:");
            List<String> list2 = this.countrys;
            if (list2 == null) {
                sb2.append("null");
            } else {
                sb2.append(list2);
            }
        }
        if (isSetProvinces()) {
            sb2.append(j2.O);
            sb2.append("provinces:");
            List<String> list3 = this.provinces;
            if (list3 == null) {
                sb2.append("null");
            } else {
                sb2.append(list3);
            }
        }
        if (isSetCitys()) {
            sb2.append(j2.O);
            sb2.append("citys:");
            List<String> list4 = this.citys;
            if (list4 == null) {
                sb2.append("null");
            } else {
                sb2.append(list4);
            }
        }
        if (isSetCountys()) {
            sb2.append(j2.O);
            sb2.append("countys:");
            List<String> list5 = this.countys;
            if (list5 == null) {
                sb2.append("null");
            } else {
                sb2.append(list5);
            }
        }
        if (isSetSp_schools()) {
            sb2.append(j2.O);
            sb2.append("sp_schools:");
            List<SearchSchoolItem> list6 = this.sp_schools;
            if (list6 == null) {
                sb2.append("null");
            } else {
                sb2.append(list6);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetCitys() {
        this.citys = null;
    }

    public void unsetCountrys() {
        this.countrys = null;
    }

    public void unsetCountys() {
        this.countys = null;
    }

    public void unsetHas_next() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetNumber() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetPage_num() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetPage_size() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetProvinces() {
        this.provinces = null;
    }

    public void unsetSchools() {
        this.schools = null;
    }

    public void unsetSp_schools() {
        this.sp_schools = null;
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(SearchSchoolResult other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        int compareTo7;
        int compareTo8;
        int compareTo9;
        int compareTo10;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo11 = Boolean.valueOf(isSetHas_next()).compareTo(Boolean.valueOf(other.isSetHas_next()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetHas_next() && (compareTo10 = TBaseHelper.compareTo(this.has_next, other.has_next)) != 0) {
            return compareTo10;
        }
        int compareTo12 = Boolean.valueOf(isSetPage_num()).compareTo(Boolean.valueOf(other.isSetPage_num()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetPage_num() && (compareTo9 = TBaseHelper.compareTo(this.page_num, other.page_num)) != 0) {
            return compareTo9;
        }
        int compareTo13 = Boolean.valueOf(isSetPage_size()).compareTo(Boolean.valueOf(other.isSetPage_size()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetPage_size() && (compareTo8 = TBaseHelper.compareTo(this.page_size, other.page_size)) != 0) {
            return compareTo8;
        }
        int compareTo14 = Boolean.valueOf(isSetNumber()).compareTo(Boolean.valueOf(other.isSetNumber()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (isSetNumber() && (compareTo7 = TBaseHelper.compareTo(this.number, other.number)) != 0) {
            return compareTo7;
        }
        int compareTo15 = Boolean.valueOf(isSetSchools()).compareTo(Boolean.valueOf(other.isSetSchools()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (isSetSchools() && (compareTo6 = TBaseHelper.compareTo((List) this.schools, (List) other.schools)) != 0) {
            return compareTo6;
        }
        int compareTo16 = Boolean.valueOf(isSetCountrys()).compareTo(Boolean.valueOf(other.isSetCountrys()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (isSetCountrys() && (compareTo5 = TBaseHelper.compareTo((List) this.countrys, (List) other.countrys)) != 0) {
            return compareTo5;
        }
        int compareTo17 = Boolean.valueOf(isSetProvinces()).compareTo(Boolean.valueOf(other.isSetProvinces()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (isSetProvinces() && (compareTo4 = TBaseHelper.compareTo((List) this.provinces, (List) other.provinces)) != 0) {
            return compareTo4;
        }
        int compareTo18 = Boolean.valueOf(isSetCitys()).compareTo(Boolean.valueOf(other.isSetCitys()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (isSetCitys() && (compareTo3 = TBaseHelper.compareTo((List) this.citys, (List) other.citys)) != 0) {
            return compareTo3;
        }
        int compareTo19 = Boolean.valueOf(isSetCountys()).compareTo(Boolean.valueOf(other.isSetCountys()));
        if (compareTo19 != 0) {
            return compareTo19;
        }
        if (isSetCountys() && (compareTo2 = TBaseHelper.compareTo((List) this.countys, (List) other.countys)) != 0) {
            return compareTo2;
        }
        int compareTo20 = Boolean.valueOf(isSetSp_schools()).compareTo(Boolean.valueOf(other.isSetSp_schools()));
        if (compareTo20 != 0) {
            return compareTo20;
        }
        if (!isSetSp_schools() || (compareTo = TBaseHelper.compareTo((List) this.sp_schools, (List) other.sp_schools)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<SearchSchoolResult, _Fields> deepCopy2() {
        return new SearchSchoolResult(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$SearchSchoolResult$_Fields[field.ordinal()]) {
            case 1:
                return Boolean.valueOf(isHas_next());
            case 2:
                return Integer.valueOf(getPage_num());
            case 3:
                return Integer.valueOf(getPage_size());
            case 4:
                return Integer.valueOf(getNumber());
            case 5:
                return getSchools();
            case 6:
                return getCountrys();
            case 7:
                return getProvinces();
            case 8:
                return getCitys();
            case 9:
                return getCountys();
            case 10:
                return getSp_schools();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$SearchSchoolResult$_Fields[field.ordinal()]) {
            case 1:
                return isSetHas_next();
            case 2:
                return isSetPage_num();
            case 3:
                return isSetPage_size();
            case 4:
                return isSetNumber();
            case 5:
                return isSetSchools();
            case 6:
                return isSetCountrys();
            case 7:
                return isSetProvinces();
            case 8:
                return isSetCitys();
            case 9:
                return isSetCountys();
            case 10:
                return isSetSp_schools();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$SearchSchoolResult$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setHas_next(((Boolean) value).booleanValue());
                    break;
                } else {
                    unsetHas_next();
                    break;
                }
            case 2:
                if (value != null) {
                    setPage_num(((Integer) value).intValue());
                    break;
                } else {
                    unsetPage_num();
                    break;
                }
            case 3:
                if (value != null) {
                    setPage_size(((Integer) value).intValue());
                    break;
                } else {
                    unsetPage_size();
                    break;
                }
            case 4:
                if (value != null) {
                    setNumber(((Integer) value).intValue());
                    break;
                } else {
                    unsetNumber();
                    break;
                }
            case 5:
                if (value != null) {
                    setSchools((List) value);
                    break;
                } else {
                    unsetSchools();
                    break;
                }
            case 6:
                if (value != null) {
                    setCountrys((List) value);
                    break;
                } else {
                    unsetCountrys();
                    break;
                }
            case 7:
                if (value != null) {
                    setProvinces((List) value);
                    break;
                } else {
                    unsetProvinces();
                    break;
                }
            case 8:
                if (value != null) {
                    setCitys((List) value);
                    break;
                } else {
                    unsetCitys();
                    break;
                }
            case 9:
                if (value != null) {
                    setCountys((List) value);
                    break;
                } else {
                    unsetCountys();
                    break;
                }
            case 10:
                if (value != null) {
                    setSp_schools((List) value);
                    break;
                } else {
                    unsetSp_schools();
                    break;
                }
        }
    }

    public boolean equals(SearchSchoolResult that) {
        if (that == null || this.has_next != that.has_next || this.page_num != that.page_num || this.page_size != that.page_size || this.number != that.number) {
            return false;
        }
        boolean isSetSchools = isSetSchools();
        boolean isSetSchools2 = that.isSetSchools();
        if ((isSetSchools || isSetSchools2) && !(isSetSchools && isSetSchools2 && this.schools.equals(that.schools))) {
            return false;
        }
        boolean isSetCountrys = isSetCountrys();
        boolean isSetCountrys2 = that.isSetCountrys();
        if ((isSetCountrys || isSetCountrys2) && !(isSetCountrys && isSetCountrys2 && this.countrys.equals(that.countrys))) {
            return false;
        }
        boolean isSetProvinces = isSetProvinces();
        boolean isSetProvinces2 = that.isSetProvinces();
        if ((isSetProvinces || isSetProvinces2) && !(isSetProvinces && isSetProvinces2 && this.provinces.equals(that.provinces))) {
            return false;
        }
        boolean isSetCitys = isSetCitys();
        boolean isSetCitys2 = that.isSetCitys();
        if ((isSetCitys || isSetCitys2) && !(isSetCitys && isSetCitys2 && this.citys.equals(that.citys))) {
            return false;
        }
        boolean isSetCountys = isSetCountys();
        boolean isSetCountys2 = that.isSetCountys();
        if ((isSetCountys || isSetCountys2) && !(isSetCountys && isSetCountys2 && this.countys.equals(that.countys))) {
            return false;
        }
        boolean isSetSp_schools = isSetSp_schools();
        boolean isSetSp_schools2 = that.isSetSp_schools();
        if (isSetSp_schools || isSetSp_schools2) {
            return isSetSp_schools && isSetSp_schools2 && this.sp_schools.equals(that.sp_schools);
        }
        return true;
    }

    public SearchSchoolResult(boolean has_next, int page_num, int page_size, int number) {
        this();
        this.has_next = has_next;
        setHas_nextIsSet(true);
        this.page_num = page_num;
        setPage_numIsSet(true);
        this.page_size = page_size;
        setPage_sizeIsSet(true);
        this.number = number;
        setNumberIsSet(true);
    }

    public SearchSchoolResult(SearchSchoolResult other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.SCHOOLS, _Fields.COUNTRYS, _Fields.PROVINCES, _Fields.CITYS, _Fields.COUNTYS, _Fields.SP_SCHOOLS};
        this.__isset_bitfield = other.__isset_bitfield;
        this.has_next = other.has_next;
        this.page_num = other.page_num;
        this.page_size = other.page_size;
        this.number = other.number;
        if (other.isSetSchools()) {
            ArrayList arrayList = new ArrayList(other.schools.size());
            Iterator<SearchSchoolItem> it = other.schools.iterator();
            while (it.hasNext()) {
                arrayList.add(new SearchSchoolItem(it.next()));
            }
            this.schools = arrayList;
        }
        if (other.isSetCountrys()) {
            this.countrys = new ArrayList(other.countrys);
        }
        if (other.isSetProvinces()) {
            this.provinces = new ArrayList(other.provinces);
        }
        if (other.isSetCitys()) {
            this.citys = new ArrayList(other.citys);
        }
        if (other.isSetCountys()) {
            this.countys = new ArrayList(other.countys);
        }
        if (other.isSetSp_schools()) {
            ArrayList arrayList2 = new ArrayList(other.sp_schools.size());
            Iterator<SearchSchoolItem> it2 = other.sp_schools.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new SearchSchoolItem(it2.next()));
            }
            this.sp_schools = arrayList2;
        }
    }

    public void validate() throws TException {
    }
}
