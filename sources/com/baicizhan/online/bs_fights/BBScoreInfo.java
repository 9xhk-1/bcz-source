package com.baicizhan.online.bs_fights;

import com.baicizhan.client.business.dataset.provider.a;
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
public class BBScoreInfo implements TBase<BBScoreInfo, _Fields>, Serializable, Cloneable, Comparable<BBScoreInfo> {
    private static final int __RANK_ISSET_ID = 0;
    private static final int __VOCABULARY_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String book;
    public int rank;
    public BBScore score;
    public BBFightShareInfo share_info;
    public int vocabulary;
    private static final TStruct STRUCT_DESC = new TStruct("BBScoreInfo");
    private static final TField SHARE_INFO_FIELD_DESC = new TField("share_info", (byte) 12, 1);
    private static final TField RANK_FIELD_DESC = new TField("rank", (byte) 8, 2);
    private static final TField VOCABULARY_FIELD_DESC = new TField("vocabulary", (byte) 8, 3);
    private static final TField BOOK_FIELD_DESC = new TField("book", (byte) 11, 4);
    private static final TField SCORE_FIELD_DESC = new TField(a.b.C0242a.f16107c, (byte) 12, 5);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_fights.BBScoreInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_fights$BBScoreInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_fights$BBScoreInfo$_Fields = iArr;
            try {
                iArr[_Fields.SHARE_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBScoreInfo$_Fields[_Fields.RANK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBScoreInfo$_Fields[_Fields.VOCABULARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBScoreInfo$_Fields[_Fields.BOOK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBScoreInfo$_Fields[_Fields.SCORE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBScoreInfoStandardScheme extends StandardScheme<BBScoreInfo> {
        private BBScoreInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BBScoreInfo struct) throws TException {
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
                                } else if (b11 == 12) {
                                    BBScore bBScore = new BBScore();
                                    struct.score = bBScore;
                                    bBScore.read(iprot);
                                    struct.setScoreIsSet(true);
                                } else {
                                    TProtocolUtil.skip(iprot, b11);
                                }
                            } else if (b11 == 11) {
                                struct.book = iprot.readString();
                                struct.setBookIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 8) {
                            struct.vocabulary = iprot.readI32();
                            struct.setVocabularyIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.rank = iprot.readI32();
                        struct.setRankIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 12) {
                    BBFightShareInfo bBFightShareInfo = new BBFightShareInfo();
                    struct.share_info = bBFightShareInfo;
                    bBFightShareInfo.read(iprot);
                    struct.setShare_infoIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetRank()) {
                throw new TProtocolException("Required field 'rank' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetVocabulary()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'vocabulary' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BBScoreInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BBScoreInfo.STRUCT_DESC);
            if (struct.share_info != null) {
                oprot.writeFieldBegin(BBScoreInfo.SHARE_INFO_FIELD_DESC);
                struct.share_info.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(BBScoreInfo.RANK_FIELD_DESC);
            oprot.writeI32(struct.rank);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(BBScoreInfo.VOCABULARY_FIELD_DESC);
            oprot.writeI32(struct.vocabulary);
            oprot.writeFieldEnd();
            if (struct.book != null) {
                oprot.writeFieldBegin(BBScoreInfo.BOOK_FIELD_DESC);
                oprot.writeString(struct.book);
                oprot.writeFieldEnd();
            }
            if (struct.score != null) {
                oprot.writeFieldBegin(BBScoreInfo.SCORE_FIELD_DESC);
                struct.score.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBScoreInfoStandardSchemeFactory implements SchemeFactory {
        private BBScoreInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBScoreInfoStandardScheme getScheme() {
            return new BBScoreInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBScoreInfoTupleScheme extends TupleScheme<BBScoreInfo> {
        private BBScoreInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BBScoreInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BBFightShareInfo bBFightShareInfo = new BBFightShareInfo();
            struct.share_info = bBFightShareInfo;
            bBFightShareInfo.read(tTupleProtocol);
            struct.setShare_infoIsSet(true);
            struct.rank = tTupleProtocol.readI32();
            struct.setRankIsSet(true);
            struct.vocabulary = tTupleProtocol.readI32();
            struct.setVocabularyIsSet(true);
            struct.book = tTupleProtocol.readString();
            struct.setBookIsSet(true);
            BBScore bBScore = new BBScore();
            struct.score = bBScore;
            bBScore.read(tTupleProtocol);
            struct.setScoreIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BBScoreInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.share_info.write(tTupleProtocol);
            tTupleProtocol.writeI32(struct.rank);
            tTupleProtocol.writeI32(struct.vocabulary);
            tTupleProtocol.writeString(struct.book);
            struct.score.write(tTupleProtocol);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBScoreInfoTupleSchemeFactory implements SchemeFactory {
        private BBScoreInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBScoreInfoTupleScheme getScheme() {
            return new BBScoreInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        SHARE_INFO(1, "share_info"),
        RANK(2, "rank"),
        VOCABULARY(3, "vocabulary"),
        BOOK(4, "book"),
        SCORE(5, a.b.C0242a.f16107c);

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
                return SHARE_INFO;
            }
            if (fieldId == 2) {
                return RANK;
            }
            if (fieldId == 3) {
                return VOCABULARY;
            }
            if (fieldId == 4) {
                return BOOK;
            }
            if (fieldId != 5) {
                return null;
            }
            return SCORE;
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
        hashMap.put(StandardScheme.class, new BBScoreInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BBScoreInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.SHARE_INFO, (_Fields) new FieldMetaData("share_info", (byte) 1, new StructMetaData((byte) 12, BBFightShareInfo.class)));
        enumMap.put((EnumMap) _Fields.RANK, (_Fields) new FieldMetaData("rank", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.VOCABULARY, (_Fields) new FieldMetaData("vocabulary", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.BOOK, (_Fields) new FieldMetaData("book", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SCORE, (_Fields) new FieldMetaData(a.b.C0242a.f16107c, (byte) 1, new StructMetaData((byte) 12, BBScore.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BBScoreInfo.class, unmodifiableMap);
    }

    public BBScoreInfo() {
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
        this.share_info = null;
        setRankIsSet(false);
        this.rank = 0;
        setVocabularyIsSet(false);
        this.vocabulary = 0;
        this.book = null;
        this.score = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BBScoreInfo)) {
            return equals((BBScoreInfo) that);
        }
        return false;
    }

    public String getBook() {
        return this.book;
    }

    public int getRank() {
        return this.rank;
    }

    public BBScore getScore() {
        return this.score;
    }

    public BBFightShareInfo getShare_info() {
        return this.share_info;
    }

    public int getVocabulary() {
        return this.vocabulary;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetBook() {
        return this.book != null;
    }

    public boolean isSetRank() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetScore() {
        return this.score != null;
    }

    public boolean isSetShare_info() {
        return this.share_info != null;
    }

    public boolean isSetVocabulary() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BBScoreInfo setBook(String book) {
        this.book = book;
        return this;
    }

    public void setBookIsSet(boolean value) {
        if (value) {
            return;
        }
        this.book = null;
    }

    public BBScoreInfo setRank(int rank) {
        this.rank = rank;
        setRankIsSet(true);
        return this;
    }

    public void setRankIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public BBScoreInfo setScore(BBScore score) {
        this.score = score;
        return this;
    }

    public void setScoreIsSet(boolean value) {
        if (value) {
            return;
        }
        this.score = null;
    }

    public BBScoreInfo setShare_info(BBFightShareInfo share_info) {
        this.share_info = share_info;
        return this;
    }

    public void setShare_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.share_info = null;
    }

    public BBScoreInfo setVocabulary(int vocabulary) {
        this.vocabulary = vocabulary;
        setVocabularyIsSet(true);
        return this;
    }

    public void setVocabularyIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BBScoreInfo(");
        sb2.append("share_info:");
        BBFightShareInfo bBFightShareInfo = this.share_info;
        if (bBFightShareInfo == null) {
            sb2.append("null");
        } else {
            sb2.append(bBFightShareInfo);
        }
        sb2.append(j2.O);
        sb2.append("rank:");
        sb2.append(this.rank);
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
        sb2.append("score:");
        BBScore bBScore = this.score;
        if (bBScore == null) {
            sb2.append("null");
        } else {
            sb2.append(bBScore);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetBook() {
        this.book = null;
    }

    public void unsetRank() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetScore() {
        this.score = null;
    }

    public void unsetShare_info() {
        this.share_info = null;
    }

    public void unsetVocabulary() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void validate() throws TException {
        BBFightShareInfo bBFightShareInfo = this.share_info;
        if (bBFightShareInfo == null) {
            throw new TProtocolException("Required field 'share_info' was not present! Struct: " + toString());
        }
        if (this.book == null) {
            throw new TProtocolException("Required field 'book' was not present! Struct: " + toString());
        }
        if (this.score == null) {
            throw new TProtocolException("Required field 'score' was not present! Struct: " + toString());
        }
        if (bBFightShareInfo != null) {
            bBFightShareInfo.validate();
        }
        BBScore bBScore = this.score;
        if (bBScore != null) {
            bBScore.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BBScoreInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo6 = Boolean.valueOf(isSetShare_info()).compareTo(Boolean.valueOf(other.isSetShare_info()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetShare_info() && (compareTo5 = TBaseHelper.compareTo((Comparable) this.share_info, (Comparable) other.share_info)) != 0) {
            return compareTo5;
        }
        int compareTo7 = Boolean.valueOf(isSetRank()).compareTo(Boolean.valueOf(other.isSetRank()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetRank() && (compareTo4 = TBaseHelper.compareTo(this.rank, other.rank)) != 0) {
            return compareTo4;
        }
        int compareTo8 = Boolean.valueOf(isSetVocabulary()).compareTo(Boolean.valueOf(other.isSetVocabulary()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetVocabulary() && (compareTo3 = TBaseHelper.compareTo(this.vocabulary, other.vocabulary)) != 0) {
            return compareTo3;
        }
        int compareTo9 = Boolean.valueOf(isSetBook()).compareTo(Boolean.valueOf(other.isSetBook()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetBook() && (compareTo2 = TBaseHelper.compareTo(this.book, other.book)) != 0) {
            return compareTo2;
        }
        int compareTo10 = Boolean.valueOf(isSetScore()).compareTo(Boolean.valueOf(other.isSetScore()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!isSetScore() || (compareTo = TBaseHelper.compareTo((Comparable) this.score, (Comparable) other.score)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BBScoreInfo, _Fields> deepCopy2() {
        return new BBScoreInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BBScoreInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getShare_info();
        }
        if (i11 == 2) {
            return Integer.valueOf(getRank());
        }
        if (i11 == 3) {
            return Integer.valueOf(getVocabulary());
        }
        if (i11 == 4) {
            return getBook();
        }
        if (i11 == 5) {
            return getScore();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BBScoreInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetShare_info();
        }
        if (i11 == 2) {
            return isSetRank();
        }
        if (i11 == 3) {
            return isSetVocabulary();
        }
        if (i11 == 4) {
            return isSetBook();
        }
        if (i11 == 5) {
            return isSetScore();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BBScoreInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetShare_info();
                return;
            } else {
                setShare_info((BBFightShareInfo) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetRank();
                return;
            } else {
                setRank(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetVocabulary();
                return;
            } else {
                setVocabulary(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 4) {
            if (value == null) {
                unsetBook();
                return;
            } else {
                setBook((String) value);
                return;
            }
        }
        if (i11 != 5) {
            return;
        }
        if (value == null) {
            unsetScore();
        } else {
            setScore((BBScore) value);
        }
    }

    public BBScoreInfo(BBFightShareInfo share_info, int rank, int vocabulary, String book, BBScore score) {
        this();
        this.share_info = share_info;
        this.rank = rank;
        setRankIsSet(true);
        this.vocabulary = vocabulary;
        setVocabularyIsSet(true);
        this.book = book;
        this.score = score;
    }

    public boolean equals(BBScoreInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetShare_info = isSetShare_info();
        boolean isSetShare_info2 = that.isSetShare_info();
        if (((isSetShare_info || isSetShare_info2) && (!isSetShare_info || !isSetShare_info2 || !this.share_info.equals(that.share_info))) || this.rank != that.rank || this.vocabulary != that.vocabulary) {
            return false;
        }
        boolean isSetBook = isSetBook();
        boolean isSetBook2 = that.isSetBook();
        if ((isSetBook || isSetBook2) && !(isSetBook && isSetBook2 && this.book.equals(that.book))) {
            return false;
        }
        boolean isSetScore = isSetScore();
        boolean isSetScore2 = that.isSetScore();
        if (isSetScore || isSetScore2) {
            return isSetScore && isSetScore2 && this.score.equals(that.score);
        }
        return true;
    }

    public BBScoreInfo(BBScoreInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetShare_info()) {
            this.share_info = new BBFightShareInfo(other.share_info);
        }
        this.rank = other.rank;
        this.vocabulary = other.vocabulary;
        if (other.isSetBook()) {
            this.book = other.book;
        }
        if (other.isSetScore()) {
            this.score = new BBScore(other.score);
        }
    }
}
