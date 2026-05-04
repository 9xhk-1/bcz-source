package com.baicizhan.online.bs_fights;

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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class BBCandidateInfo implements TBase<BBCandidateInfo, _Fields>, Serializable, Cloneable, Comparable<BBCandidateInfo> {
    private static final int __DISTANCE_ISSET_ID = 0;
    private static final int __ONLINE_ISSET_ID = 2;
    private static final int __VOCABULARY_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public BBFightUserBasicInfo basic_info;
    public String book;
    public double distance;
    public int online;
    public String promotion;
    public int vocabulary;
    private static final TStruct STRUCT_DESC = new TStruct("BBCandidateInfo");
    private static final TField BASIC_INFO_FIELD_DESC = new TField("basic_info", (byte) 12, 1);
    private static final TField DISTANCE_FIELD_DESC = new TField("distance", (byte) 4, 2);
    private static final TField VOCABULARY_FIELD_DESC = new TField("vocabulary", (byte) 8, 3);
    private static final TField BOOK_FIELD_DESC = new TField("book", (byte) 11, 4);
    private static final TField ONLINE_FIELD_DESC = new TField("online", (byte) 8, 5);
    private static final TField PROMOTION_FIELD_DESC = new TField("promotion", (byte) 11, 6);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_fights.BBCandidateInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_fights$BBCandidateInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_fights$BBCandidateInfo$_Fields = iArr;
            try {
                iArr[_Fields.BASIC_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBCandidateInfo$_Fields[_Fields.DISTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBCandidateInfo$_Fields[_Fields.VOCABULARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBCandidateInfo$_Fields[_Fields.BOOK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBCandidateInfo$_Fields[_Fields.ONLINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBCandidateInfo$_Fields[_Fields.PROMOTION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBCandidateInfoStandardScheme extends StandardScheme<BBCandidateInfo> {
        private BBCandidateInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BBCandidateInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetDistance()) {
                        throw new TProtocolException("Required field 'distance' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetVocabulary()) {
                        throw new TProtocolException("Required field 'vocabulary' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetOnline()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'online' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            BBFightUserBasicInfo bBFightUserBasicInfo = new BBFightUserBasicInfo();
                            struct.basic_info = bBFightUserBasicInfo;
                            bBFightUserBasicInfo.read(iprot);
                            struct.setBasic_infoIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 4) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.distance = iprot.readDouble();
                            struct.setDistanceIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.vocabulary = iprot.readI32();
                            struct.setVocabularyIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.book = iprot.readString();
                            struct.setBookIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.online = iprot.readI32();
                            struct.setOnlineIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.promotion = iprot.readString();
                            struct.setPromotionIsSet(true);
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
        public void write(TProtocol oprot, BBCandidateInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BBCandidateInfo.STRUCT_DESC);
            if (struct.basic_info != null) {
                oprot.writeFieldBegin(BBCandidateInfo.BASIC_INFO_FIELD_DESC);
                struct.basic_info.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(BBCandidateInfo.DISTANCE_FIELD_DESC);
            oprot.writeDouble(struct.distance);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(BBCandidateInfo.VOCABULARY_FIELD_DESC);
            oprot.writeI32(struct.vocabulary);
            oprot.writeFieldEnd();
            if (struct.book != null) {
                oprot.writeFieldBegin(BBCandidateInfo.BOOK_FIELD_DESC);
                oprot.writeString(struct.book);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(BBCandidateInfo.ONLINE_FIELD_DESC);
            oprot.writeI32(struct.online);
            oprot.writeFieldEnd();
            if (struct.promotion != null) {
                oprot.writeFieldBegin(BBCandidateInfo.PROMOTION_FIELD_DESC);
                oprot.writeString(struct.promotion);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBCandidateInfoStandardSchemeFactory implements SchemeFactory {
        private BBCandidateInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBCandidateInfoStandardScheme getScheme() {
            return new BBCandidateInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBCandidateInfoTupleScheme extends TupleScheme<BBCandidateInfo> {
        private BBCandidateInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BBCandidateInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BBFightUserBasicInfo bBFightUserBasicInfo = new BBFightUserBasicInfo();
            struct.basic_info = bBFightUserBasicInfo;
            bBFightUserBasicInfo.read(tTupleProtocol);
            struct.setBasic_infoIsSet(true);
            struct.distance = tTupleProtocol.readDouble();
            struct.setDistanceIsSet(true);
            struct.vocabulary = tTupleProtocol.readI32();
            struct.setVocabularyIsSet(true);
            struct.book = tTupleProtocol.readString();
            struct.setBookIsSet(true);
            struct.online = tTupleProtocol.readI32();
            struct.setOnlineIsSet(true);
            struct.promotion = tTupleProtocol.readString();
            struct.setPromotionIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BBCandidateInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.basic_info.write(tTupleProtocol);
            tTupleProtocol.writeDouble(struct.distance);
            tTupleProtocol.writeI32(struct.vocabulary);
            tTupleProtocol.writeString(struct.book);
            tTupleProtocol.writeI32(struct.online);
            tTupleProtocol.writeString(struct.promotion);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBCandidateInfoTupleSchemeFactory implements SchemeFactory {
        private BBCandidateInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBCandidateInfoTupleScheme getScheme() {
            return new BBCandidateInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        BASIC_INFO(1, "basic_info"),
        DISTANCE(2, "distance"),
        VOCABULARY(3, "vocabulary"),
        BOOK(4, "book"),
        ONLINE(5, "online"),
        PROMOTION(6, "promotion");

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
                    return BASIC_INFO;
                case 2:
                    return DISTANCE;
                case 3:
                    return VOCABULARY;
                case 4:
                    return BOOK;
                case 5:
                    return ONLINE;
                case 6:
                    return PROMOTION;
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
        hashMap.put(StandardScheme.class, new BBCandidateInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BBCandidateInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.BASIC_INFO, (_Fields) new FieldMetaData("basic_info", (byte) 1, new StructMetaData((byte) 12, BBFightUserBasicInfo.class)));
        enumMap.put((EnumMap) _Fields.DISTANCE, (_Fields) new FieldMetaData("distance", (byte) 1, new FieldValueMetaData((byte) 4)));
        enumMap.put((EnumMap) _Fields.VOCABULARY, (_Fields) new FieldMetaData("vocabulary", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.BOOK, (_Fields) new FieldMetaData("book", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ONLINE, (_Fields) new FieldMetaData("online", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.PROMOTION, (_Fields) new FieldMetaData("promotion", (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BBCandidateInfo.class, unmodifiableMap);
    }

    public BBCandidateInfo() {
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
        this.basic_info = null;
        setDistanceIsSet(false);
        this.distance = 0.0d;
        setVocabularyIsSet(false);
        this.vocabulary = 0;
        this.book = null;
        setOnlineIsSet(false);
        this.online = 0;
        this.promotion = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BBCandidateInfo)) {
            return equals((BBCandidateInfo) that);
        }
        return false;
    }

    public BBFightUserBasicInfo getBasic_info() {
        return this.basic_info;
    }

    public String getBook() {
        return this.book;
    }

    public double getDistance() {
        return this.distance;
    }

    public int getOnline() {
        return this.online;
    }

    public String getPromotion() {
        return this.promotion;
    }

    public int getVocabulary() {
        return this.vocabulary;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetBasic_info() {
        return this.basic_info != null;
    }

    public boolean isSetBook() {
        return this.book != null;
    }

    public boolean isSetDistance() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetOnline() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetPromotion() {
        return this.promotion != null;
    }

    public boolean isSetVocabulary() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BBCandidateInfo setBasic_info(BBFightUserBasicInfo basic_info) {
        this.basic_info = basic_info;
        return this;
    }

    public void setBasic_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.basic_info = null;
    }

    public BBCandidateInfo setBook(String book) {
        this.book = book;
        return this;
    }

    public void setBookIsSet(boolean value) {
        if (value) {
            return;
        }
        this.book = null;
    }

    public BBCandidateInfo setDistance(double distance) {
        this.distance = distance;
        setDistanceIsSet(true);
        return this;
    }

    public void setDistanceIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public BBCandidateInfo setOnline(int online) {
        this.online = online;
        setOnlineIsSet(true);
        return this;
    }

    public void setOnlineIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public BBCandidateInfo setPromotion(String promotion) {
        this.promotion = promotion;
        return this;
    }

    public void setPromotionIsSet(boolean value) {
        if (value) {
            return;
        }
        this.promotion = null;
    }

    public BBCandidateInfo setVocabulary(int vocabulary) {
        this.vocabulary = vocabulary;
        setVocabularyIsSet(true);
        return this;
    }

    public void setVocabularyIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BBCandidateInfo(");
        sb2.append("basic_info:");
        BBFightUserBasicInfo bBFightUserBasicInfo = this.basic_info;
        if (bBFightUserBasicInfo == null) {
            sb2.append("null");
        } else {
            sb2.append(bBFightUserBasicInfo);
        }
        sb2.append(j2.O);
        sb2.append("distance:");
        sb2.append(this.distance);
        sb2.append(j2.O);
        sb2.append("vocabulary:");
        sb2.append(this.vocabulary);
        sb2.append(j2.O);
        sb2.append("book:");
        String str = this.book;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("online:");
        sb2.append(this.online);
        sb2.append(j2.O);
        sb2.append("promotion:");
        String str2 = this.promotion;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetBasic_info() {
        this.basic_info = null;
    }

    public void unsetBook() {
        this.book = null;
    }

    public void unsetDistance() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetOnline() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetPromotion() {
        this.promotion = null;
    }

    public void unsetVocabulary() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void validate() throws TException {
        BBFightUserBasicInfo bBFightUserBasicInfo = this.basic_info;
        if (bBFightUserBasicInfo == null) {
            throw new TProtocolException("Required field 'basic_info' was not present! Struct: " + toString());
        }
        if (this.book == null) {
            throw new TProtocolException("Required field 'book' was not present! Struct: " + toString());
        }
        if (this.promotion != null) {
            if (bBFightUserBasicInfo != null) {
                bBFightUserBasicInfo.validate();
            }
        } else {
            throw new TProtocolException("Required field 'promotion' was not present! Struct: " + toString());
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BBCandidateInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo7 = Boolean.valueOf(isSetBasic_info()).compareTo(Boolean.valueOf(other.isSetBasic_info()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetBasic_info() && (compareTo6 = TBaseHelper.compareTo((Comparable) this.basic_info, (Comparable) other.basic_info)) != 0) {
            return compareTo6;
        }
        int compareTo8 = Boolean.valueOf(isSetDistance()).compareTo(Boolean.valueOf(other.isSetDistance()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetDistance() && (compareTo5 = TBaseHelper.compareTo(this.distance, other.distance)) != 0) {
            return compareTo5;
        }
        int compareTo9 = Boolean.valueOf(isSetVocabulary()).compareTo(Boolean.valueOf(other.isSetVocabulary()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetVocabulary() && (compareTo4 = TBaseHelper.compareTo(this.vocabulary, other.vocabulary)) != 0) {
            return compareTo4;
        }
        int compareTo10 = Boolean.valueOf(isSetBook()).compareTo(Boolean.valueOf(other.isSetBook()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetBook() && (compareTo3 = TBaseHelper.compareTo(this.book, other.book)) != 0) {
            return compareTo3;
        }
        int compareTo11 = Boolean.valueOf(isSetOnline()).compareTo(Boolean.valueOf(other.isSetOnline()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetOnline() && (compareTo2 = TBaseHelper.compareTo(this.online, other.online)) != 0) {
            return compareTo2;
        }
        int compareTo12 = Boolean.valueOf(isSetPromotion()).compareTo(Boolean.valueOf(other.isSetPromotion()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (!isSetPromotion() || (compareTo = TBaseHelper.compareTo(this.promotion, other.promotion)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BBCandidateInfo, _Fields> deepCopy2() {
        return new BBCandidateInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BBCandidateInfo$_Fields[field.ordinal()]) {
            case 1:
                return getBasic_info();
            case 2:
                return Double.valueOf(getDistance());
            case 3:
                return Integer.valueOf(getVocabulary());
            case 4:
                return getBook();
            case 5:
                return Integer.valueOf(getOnline());
            case 6:
                return getPromotion();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BBCandidateInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetBasic_info();
            case 2:
                return isSetDistance();
            case 3:
                return isSetVocabulary();
            case 4:
                return isSetBook();
            case 5:
                return isSetOnline();
            case 6:
                return isSetPromotion();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BBCandidateInfo$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setBasic_info((BBFightUserBasicInfo) value);
                    break;
                } else {
                    unsetBasic_info();
                    break;
                }
            case 2:
                if (value != null) {
                    setDistance(((Double) value).doubleValue());
                    break;
                } else {
                    unsetDistance();
                    break;
                }
            case 3:
                if (value != null) {
                    setVocabulary(((Integer) value).intValue());
                    break;
                } else {
                    unsetVocabulary();
                    break;
                }
            case 4:
                if (value != null) {
                    setBook((String) value);
                    break;
                } else {
                    unsetBook();
                    break;
                }
            case 5:
                if (value != null) {
                    setOnline(((Integer) value).intValue());
                    break;
                } else {
                    unsetOnline();
                    break;
                }
            case 6:
                if (value != null) {
                    setPromotion((String) value);
                    break;
                } else {
                    unsetPromotion();
                    break;
                }
        }
    }

    public BBCandidateInfo(BBFightUserBasicInfo basic_info, double distance, int vocabulary, String book, int online, String promotion) {
        this();
        this.basic_info = basic_info;
        this.distance = distance;
        setDistanceIsSet(true);
        this.vocabulary = vocabulary;
        setVocabularyIsSet(true);
        this.book = book;
        this.online = online;
        setOnlineIsSet(true);
        this.promotion = promotion;
    }

    public boolean equals(BBCandidateInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetBasic_info = isSetBasic_info();
        boolean isSetBasic_info2 = that.isSetBasic_info();
        if (((isSetBasic_info || isSetBasic_info2) && (!isSetBasic_info || !isSetBasic_info2 || !this.basic_info.equals(that.basic_info))) || this.distance != that.distance || this.vocabulary != that.vocabulary) {
            return false;
        }
        boolean isSetBook = isSetBook();
        boolean isSetBook2 = that.isSetBook();
        if (((isSetBook || isSetBook2) && !(isSetBook && isSetBook2 && this.book.equals(that.book))) || this.online != that.online) {
            return false;
        }
        boolean isSetPromotion = isSetPromotion();
        boolean isSetPromotion2 = that.isSetPromotion();
        if (isSetPromotion || isSetPromotion2) {
            return isSetPromotion && isSetPromotion2 && this.promotion.equals(that.promotion);
        }
        return true;
    }

    public BBCandidateInfo(BBCandidateInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetBasic_info()) {
            this.basic_info = new BBFightUserBasicInfo(other.basic_info);
        }
        this.distance = other.distance;
        this.vocabulary = other.vocabulary;
        if (other.isSetBook()) {
            this.book = other.book;
        }
        this.online = other.online;
        if (other.isSetPromotion()) {
            this.promotion = other.promotion;
        }
    }
}
