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
public class BBRankInfo implements TBase<BBRankInfo, _Fields>, Serializable, Cloneable, Comparable<BBRankInfo> {
    private static final int __IS_SELF_ISSET_ID = 0;
    private static final int __RANK_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public BBFightUserBasicInfo basic_info;
    public boolean is_self;
    public int rank;
    public BBScore score;
    private static final TStruct STRUCT_DESC = new TStruct("BBRankInfo");
    private static final TField BASIC_INFO_FIELD_DESC = new TField("basic_info", (byte) 12, 1);
    private static final TField IS_SELF_FIELD_DESC = new TField("is_self", (byte) 2, 2);
    private static final TField SCORE_FIELD_DESC = new TField(a.b.C0242a.f16107c, (byte) 12, 3);
    private static final TField RANK_FIELD_DESC = new TField("rank", (byte) 8, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_fights.BBRankInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_fights$BBRankInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_fights$BBRankInfo$_Fields = iArr;
            try {
                iArr[_Fields.BASIC_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBRankInfo$_Fields[_Fields.IS_SELF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBRankInfo$_Fields[_Fields.SCORE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBRankInfo$_Fields[_Fields.RANK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBRankInfoStandardScheme extends StandardScheme<BBRankInfo> {
        private BBRankInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BBRankInfo struct) throws TException {
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
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 8) {
                                struct.rank = iprot.readI32();
                                struct.setRankIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            BBScore bBScore = new BBScore();
                            struct.score = bBScore;
                            bBScore.read(iprot);
                            struct.setScoreIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 2) {
                        struct.is_self = iprot.readBool();
                        struct.setIs_selfIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 12) {
                    BBFightUserBasicInfo bBFightUserBasicInfo = new BBFightUserBasicInfo();
                    struct.basic_info = bBFightUserBasicInfo;
                    bBFightUserBasicInfo.read(iprot);
                    struct.setBasic_infoIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetIs_self()) {
                throw new TProtocolException("Required field 'is_self' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetRank()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'rank' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BBRankInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BBRankInfo.STRUCT_DESC);
            if (struct.basic_info != null) {
                oprot.writeFieldBegin(BBRankInfo.BASIC_INFO_FIELD_DESC);
                struct.basic_info.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(BBRankInfo.IS_SELF_FIELD_DESC);
            oprot.writeBool(struct.is_self);
            oprot.writeFieldEnd();
            if (struct.score != null) {
                oprot.writeFieldBegin(BBRankInfo.SCORE_FIELD_DESC);
                struct.score.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(BBRankInfo.RANK_FIELD_DESC);
            oprot.writeI32(struct.rank);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBRankInfoStandardSchemeFactory implements SchemeFactory {
        private BBRankInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBRankInfoStandardScheme getScheme() {
            return new BBRankInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBRankInfoTupleScheme extends TupleScheme<BBRankInfo> {
        private BBRankInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BBRankInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BBFightUserBasicInfo bBFightUserBasicInfo = new BBFightUserBasicInfo();
            struct.basic_info = bBFightUserBasicInfo;
            bBFightUserBasicInfo.read(tTupleProtocol);
            struct.setBasic_infoIsSet(true);
            struct.is_self = tTupleProtocol.readBool();
            struct.setIs_selfIsSet(true);
            BBScore bBScore = new BBScore();
            struct.score = bBScore;
            bBScore.read(tTupleProtocol);
            struct.setScoreIsSet(true);
            struct.rank = tTupleProtocol.readI32();
            struct.setRankIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BBRankInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.basic_info.write(tTupleProtocol);
            tTupleProtocol.writeBool(struct.is_self);
            struct.score.write(tTupleProtocol);
            tTupleProtocol.writeI32(struct.rank);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBRankInfoTupleSchemeFactory implements SchemeFactory {
        private BBRankInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBRankInfoTupleScheme getScheme() {
            return new BBRankInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        BASIC_INFO(1, "basic_info"),
        IS_SELF(2, "is_self"),
        SCORE(3, a.b.C0242a.f16107c),
        RANK(4, "rank");

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
                return BASIC_INFO;
            }
            if (fieldId == 2) {
                return IS_SELF;
            }
            if (fieldId == 3) {
                return SCORE;
            }
            if (fieldId != 4) {
                return null;
            }
            return RANK;
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
        hashMap.put(StandardScheme.class, new BBRankInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BBRankInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.BASIC_INFO, (_Fields) new FieldMetaData("basic_info", (byte) 1, new StructMetaData((byte) 12, BBFightUserBasicInfo.class)));
        enumMap.put((EnumMap) _Fields.IS_SELF, (_Fields) new FieldMetaData("is_self", (byte) 1, new FieldValueMetaData((byte) 2)));
        enumMap.put((EnumMap) _Fields.SCORE, (_Fields) new FieldMetaData(a.b.C0242a.f16107c, (byte) 1, new StructMetaData((byte) 12, BBScore.class)));
        enumMap.put((EnumMap) _Fields.RANK, (_Fields) new FieldMetaData("rank", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BBRankInfo.class, unmodifiableMap);
    }

    public BBRankInfo() {
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
        setIs_selfIsSet(false);
        this.is_self = false;
        this.score = null;
        setRankIsSet(false);
        this.rank = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BBRankInfo)) {
            return equals((BBRankInfo) that);
        }
        return false;
    }

    public BBFightUserBasicInfo getBasic_info() {
        return this.basic_info;
    }

    public int getRank() {
        return this.rank;
    }

    public BBScore getScore() {
        return this.score;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isIs_self() {
        return this.is_self;
    }

    public boolean isSetBasic_info() {
        return this.basic_info != null;
    }

    public boolean isSetIs_self() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetRank() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetScore() {
        return this.score != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BBRankInfo setBasic_info(BBFightUserBasicInfo basic_info) {
        this.basic_info = basic_info;
        return this;
    }

    public void setBasic_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.basic_info = null;
    }

    public BBRankInfo setIs_self(boolean is_self) {
        this.is_self = is_self;
        setIs_selfIsSet(true);
        return this;
    }

    public void setIs_selfIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public BBRankInfo setRank(int rank) {
        this.rank = rank;
        setRankIsSet(true);
        return this;
    }

    public void setRankIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public BBRankInfo setScore(BBScore score) {
        this.score = score;
        return this;
    }

    public void setScoreIsSet(boolean value) {
        if (value) {
            return;
        }
        this.score = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BBRankInfo(");
        sb2.append("basic_info:");
        BBFightUserBasicInfo bBFightUserBasicInfo = this.basic_info;
        if (bBFightUserBasicInfo == null) {
            sb2.append("null");
        } else {
            sb2.append(bBFightUserBasicInfo);
        }
        sb2.append(j2.O);
        sb2.append("is_self:");
        sb2.append(this.is_self);
        sb2.append(j2.O);
        sb2.append("score:");
        BBScore bBScore = this.score;
        if (bBScore == null) {
            sb2.append("null");
        } else {
            sb2.append(bBScore);
        }
        sb2.append(j2.O);
        sb2.append("rank:");
        sb2.append(this.rank);
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetBasic_info() {
        this.basic_info = null;
    }

    public void unsetIs_self() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetRank() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetScore() {
        this.score = null;
    }

    public void validate() throws TException {
        BBFightUserBasicInfo bBFightUserBasicInfo = this.basic_info;
        if (bBFightUserBasicInfo == null) {
            throw new TProtocolException("Required field 'basic_info' was not present! Struct: " + toString());
        }
        if (this.score == null) {
            throw new TProtocolException("Required field 'score' was not present! Struct: " + toString());
        }
        if (bBFightUserBasicInfo != null) {
            bBFightUserBasicInfo.validate();
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
    public int compareTo(BBRankInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetBasic_info()).compareTo(Boolean.valueOf(other.isSetBasic_info()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetBasic_info() && (compareTo4 = TBaseHelper.compareTo((Comparable) this.basic_info, (Comparable) other.basic_info)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetIs_self()).compareTo(Boolean.valueOf(other.isSetIs_self()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetIs_self() && (compareTo3 = TBaseHelper.compareTo(this.is_self, other.is_self)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetScore()).compareTo(Boolean.valueOf(other.isSetScore()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetScore() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.score, (Comparable) other.score)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetRank()).compareTo(Boolean.valueOf(other.isSetRank()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetRank() || (compareTo = TBaseHelper.compareTo(this.rank, other.rank)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BBRankInfo, _Fields> deepCopy2() {
        return new BBRankInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BBRankInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getBasic_info();
        }
        if (i11 == 2) {
            return Boolean.valueOf(isIs_self());
        }
        if (i11 == 3) {
            return getScore();
        }
        if (i11 == 4) {
            return Integer.valueOf(getRank());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BBRankInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetBasic_info();
        }
        if (i11 == 2) {
            return isSetIs_self();
        }
        if (i11 == 3) {
            return isSetScore();
        }
        if (i11 == 4) {
            return isSetRank();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BBRankInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetBasic_info();
                return;
            } else {
                setBasic_info((BBFightUserBasicInfo) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetIs_self();
                return;
            } else {
                setIs_self(((Boolean) value).booleanValue());
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetScore();
                return;
            } else {
                setScore((BBScore) value);
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetRank();
        } else {
            setRank(((Integer) value).intValue());
        }
    }

    public BBRankInfo(BBFightUserBasicInfo basic_info, boolean is_self, BBScore score, int rank) {
        this();
        this.basic_info = basic_info;
        this.is_self = is_self;
        setIs_selfIsSet(true);
        this.score = score;
        this.rank = rank;
        setRankIsSet(true);
    }

    public boolean equals(BBRankInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetBasic_info = isSetBasic_info();
        boolean isSetBasic_info2 = that.isSetBasic_info();
        if (((isSetBasic_info || isSetBasic_info2) && !(isSetBasic_info && isSetBasic_info2 && this.basic_info.equals(that.basic_info))) || this.is_self != that.is_self) {
            return false;
        }
        boolean isSetScore = isSetScore();
        boolean isSetScore2 = that.isSetScore();
        return (!(isSetScore || isSetScore2) || (isSetScore && isSetScore2 && this.score.equals(that.score))) && this.rank == that.rank;
    }

    public BBRankInfo(BBRankInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetBasic_info()) {
            this.basic_info = new BBFightUserBasicInfo(other.basic_info);
        }
        this.is_self = other.is_self;
        if (other.isSetScore()) {
            this.score = new BBScore(other.score);
        }
        this.rank = other.rank;
    }
}
