package com.baicizhan.online.user_study_api;

import com.baicizhan.client.business.dataset.provider.a;
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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class ExperienceRankInfo implements TBase<ExperienceRankInfo, _Fields>, Serializable, Cloneable, Comparable<ExperienceRankInfo> {
    private static final int __CURSTATUS_ISSET_ID = 1;
    private static final int __ENABLE_ISSET_ID = 0;
    private static final int __INLASTWEEKRANK_ISSET_ID = 2;
    private static final int __RANKING_ISSET_ID = 4;
    private static final int __SCORE_ISSET_ID = 3;
    private static final int __TASKUPDATEDAT_ISSET_ID = 5;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int curStatus;
    public boolean enable;
    public int inLastWeekRank;
    private _Fields[] optionals;
    public int ranking;
    public int score;
    public long taskUpdatedAt;
    private static final TStruct STRUCT_DESC = new TStruct("ExperienceRankInfo");
    private static final TField ENABLE_FIELD_DESC = new TField(k3.u0.f65628b, (byte) 2, 1);
    private static final TField CUR_STATUS_FIELD_DESC = new TField("curStatus", (byte) 8, 2);
    private static final TField IN_LAST_WEEK_RANK_FIELD_DESC = new TField("inLastWeekRank", (byte) 8, 3);
    private static final TField SCORE_FIELD_DESC = new TField(a.b.C0242a.f16107c, (byte) 8, 4);
    private static final TField RANKING_FIELD_DESC = new TField("ranking", (byte) 8, 5);
    private static final TField TASK_UPDATED_AT_FIELD_DESC = new TField("taskUpdatedAt", (byte) 10, 6);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.ExperienceRankInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$ExperienceRankInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$ExperienceRankInfo$_Fields = iArr;
            try {
                iArr[_Fields.ENABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$ExperienceRankInfo$_Fields[_Fields.CUR_STATUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$ExperienceRankInfo$_Fields[_Fields.IN_LAST_WEEK_RANK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$ExperienceRankInfo$_Fields[_Fields.SCORE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$ExperienceRankInfo$_Fields[_Fields.RANKING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$ExperienceRankInfo$_Fields[_Fields.TASK_UPDATED_AT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ExperienceRankInfoStandardScheme extends StandardScheme<ExperienceRankInfo> {
        private ExperienceRankInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, ExperienceRankInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (struct.isSetEnable()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'enable' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 2) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.enable = iprot.readBool();
                            struct.setEnableIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.curStatus = iprot.readI32();
                            struct.setCurStatusIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.inLastWeekRank = iprot.readI32();
                            struct.setInLastWeekRankIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.score = iprot.readI32();
                            struct.setScoreIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.ranking = iprot.readI32();
                            struct.setRankingIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.taskUpdatedAt = iprot.readI64();
                            struct.setTaskUpdatedAtIsSet(true);
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
        public void write(TProtocol oprot, ExperienceRankInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(ExperienceRankInfo.STRUCT_DESC);
            oprot.writeFieldBegin(ExperienceRankInfo.ENABLE_FIELD_DESC);
            oprot.writeBool(struct.enable);
            oprot.writeFieldEnd();
            if (struct.isSetCurStatus()) {
                oprot.writeFieldBegin(ExperienceRankInfo.CUR_STATUS_FIELD_DESC);
                oprot.writeI32(struct.curStatus);
                oprot.writeFieldEnd();
            }
            if (struct.isSetInLastWeekRank()) {
                oprot.writeFieldBegin(ExperienceRankInfo.IN_LAST_WEEK_RANK_FIELD_DESC);
                oprot.writeI32(struct.inLastWeekRank);
                oprot.writeFieldEnd();
            }
            if (struct.isSetScore()) {
                oprot.writeFieldBegin(ExperienceRankInfo.SCORE_FIELD_DESC);
                oprot.writeI32(struct.score);
                oprot.writeFieldEnd();
            }
            if (struct.isSetRanking()) {
                oprot.writeFieldBegin(ExperienceRankInfo.RANKING_FIELD_DESC);
                oprot.writeI32(struct.ranking);
                oprot.writeFieldEnd();
            }
            if (struct.isSetTaskUpdatedAt()) {
                oprot.writeFieldBegin(ExperienceRankInfo.TASK_UPDATED_AT_FIELD_DESC);
                oprot.writeI64(struct.taskUpdatedAt);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ExperienceRankInfoStandardSchemeFactory implements SchemeFactory {
        private ExperienceRankInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ExperienceRankInfoStandardScheme getScheme() {
            return new ExperienceRankInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ExperienceRankInfoTupleScheme extends TupleScheme<ExperienceRankInfo> {
        private ExperienceRankInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, ExperienceRankInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.enable = tTupleProtocol.readBool();
            struct.setEnableIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(5);
            if (readBitSet.get(0)) {
                struct.curStatus = tTupleProtocol.readI32();
                struct.setCurStatusIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.inLastWeekRank = tTupleProtocol.readI32();
                struct.setInLastWeekRankIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.score = tTupleProtocol.readI32();
                struct.setScoreIsSet(true);
            }
            if (readBitSet.get(3)) {
                struct.ranking = tTupleProtocol.readI32();
                struct.setRankingIsSet(true);
            }
            if (readBitSet.get(4)) {
                struct.taskUpdatedAt = tTupleProtocol.readI64();
                struct.setTaskUpdatedAtIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, ExperienceRankInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeBool(struct.enable);
            BitSet bitSet = new BitSet();
            if (struct.isSetCurStatus()) {
                bitSet.set(0);
            }
            if (struct.isSetInLastWeekRank()) {
                bitSet.set(1);
            }
            if (struct.isSetScore()) {
                bitSet.set(2);
            }
            if (struct.isSetRanking()) {
                bitSet.set(3);
            }
            if (struct.isSetTaskUpdatedAt()) {
                bitSet.set(4);
            }
            tTupleProtocol.writeBitSet(bitSet, 5);
            if (struct.isSetCurStatus()) {
                tTupleProtocol.writeI32(struct.curStatus);
            }
            if (struct.isSetInLastWeekRank()) {
                tTupleProtocol.writeI32(struct.inLastWeekRank);
            }
            if (struct.isSetScore()) {
                tTupleProtocol.writeI32(struct.score);
            }
            if (struct.isSetRanking()) {
                tTupleProtocol.writeI32(struct.ranking);
            }
            if (struct.isSetTaskUpdatedAt()) {
                tTupleProtocol.writeI64(struct.taskUpdatedAt);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ExperienceRankInfoTupleSchemeFactory implements SchemeFactory {
        private ExperienceRankInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ExperienceRankInfoTupleScheme getScheme() {
            return new ExperienceRankInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ENABLE(1, k3.u0.f65628b),
        CUR_STATUS(2, "curStatus"),
        IN_LAST_WEEK_RANK(3, "inLastWeekRank"),
        SCORE(4, a.b.C0242a.f16107c),
        RANKING(5, "ranking"),
        TASK_UPDATED_AT(6, "taskUpdatedAt");

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
                    return ENABLE;
                case 2:
                    return CUR_STATUS;
                case 3:
                    return IN_LAST_WEEK_RANK;
                case 4:
                    return SCORE;
                case 5:
                    return RANKING;
                case 6:
                    return TASK_UPDATED_AT;
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
        hashMap.put(StandardScheme.class, new ExperienceRankInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new ExperienceRankInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ENABLE, (_Fields) new FieldMetaData(k3.u0.f65628b, (byte) 1, new FieldValueMetaData((byte) 2)));
        enumMap.put((EnumMap) _Fields.CUR_STATUS, (_Fields) new FieldMetaData("curStatus", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.IN_LAST_WEEK_RANK, (_Fields) new FieldMetaData("inLastWeekRank", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.SCORE, (_Fields) new FieldMetaData(a.b.C0242a.f16107c, (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.RANKING, (_Fields) new FieldMetaData("ranking", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.TASK_UPDATED_AT, (_Fields) new FieldMetaData("taskUpdatedAt", (byte) 2, new FieldValueMetaData((byte) 10)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(ExperienceRankInfo.class, unmodifiableMap);
    }

    public ExperienceRankInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.CUR_STATUS, _Fields.IN_LAST_WEEK_RANK, _Fields.SCORE, _Fields.RANKING, _Fields.TASK_UPDATED_AT};
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
        setEnableIsSet(false);
        this.enable = false;
        setCurStatusIsSet(false);
        this.curStatus = 0;
        setInLastWeekRankIsSet(false);
        this.inLastWeekRank = 0;
        setScoreIsSet(false);
        this.score = 0;
        setRankingIsSet(false);
        this.ranking = 0;
        setTaskUpdatedAtIsSet(false);
        this.taskUpdatedAt = 0L;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof ExperienceRankInfo)) {
            return equals((ExperienceRankInfo) that);
        }
        return false;
    }

    public int getCurStatus() {
        return this.curStatus;
    }

    public int getInLastWeekRank() {
        return this.inLastWeekRank;
    }

    public int getRanking() {
        return this.ranking;
    }

    public int getScore() {
        return this.score;
    }

    public long getTaskUpdatedAt() {
        return this.taskUpdatedAt;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public boolean isSetCurStatus() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetEnable() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetInLastWeekRank() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetRanking() {
        return EncodingUtils.testBit(this.__isset_bitfield, 4);
    }

    public boolean isSetScore() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetTaskUpdatedAt() {
        return EncodingUtils.testBit(this.__isset_bitfield, 5);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public ExperienceRankInfo setCurStatus(int curStatus) {
        this.curStatus = curStatus;
        setCurStatusIsSet(true);
        return this;
    }

    public void setCurStatusIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public ExperienceRankInfo setEnable(boolean enable) {
        this.enable = enable;
        setEnableIsSet(true);
        return this;
    }

    public void setEnableIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public ExperienceRankInfo setInLastWeekRank(int inLastWeekRank) {
        this.inLastWeekRank = inLastWeekRank;
        setInLastWeekRankIsSet(true);
        return this;
    }

    public void setInLastWeekRankIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public ExperienceRankInfo setRanking(int ranking) {
        this.ranking = ranking;
        setRankingIsSet(true);
        return this;
    }

    public void setRankingIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 4, value);
    }

    public ExperienceRankInfo setScore(int score) {
        this.score = score;
        setScoreIsSet(true);
        return this;
    }

    public void setScoreIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public ExperienceRankInfo setTaskUpdatedAt(long taskUpdatedAt) {
        this.taskUpdatedAt = taskUpdatedAt;
        setTaskUpdatedAtIsSet(true);
        return this;
    }

    public void setTaskUpdatedAtIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 5, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ExperienceRankInfo(");
        sb2.append("enable:");
        sb2.append(this.enable);
        if (isSetCurStatus()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("curStatus:");
            sb2.append(this.curStatus);
        }
        if (isSetInLastWeekRank()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("inLastWeekRank:");
            sb2.append(this.inLastWeekRank);
        }
        if (isSetScore()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("score:");
            sb2.append(this.score);
        }
        if (isSetRanking()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("ranking:");
            sb2.append(this.ranking);
        }
        if (isSetTaskUpdatedAt()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("taskUpdatedAt:");
            sb2.append(this.taskUpdatedAt);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetCurStatus() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetEnable() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetInLastWeekRank() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetRanking() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 4);
    }

    public void unsetScore() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetTaskUpdatedAt() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 5);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(ExperienceRankInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo7 = Boolean.valueOf(isSetEnable()).compareTo(Boolean.valueOf(other.isSetEnable()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetEnable() && (compareTo6 = TBaseHelper.compareTo(this.enable, other.enable)) != 0) {
            return compareTo6;
        }
        int compareTo8 = Boolean.valueOf(isSetCurStatus()).compareTo(Boolean.valueOf(other.isSetCurStatus()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetCurStatus() && (compareTo5 = TBaseHelper.compareTo(this.curStatus, other.curStatus)) != 0) {
            return compareTo5;
        }
        int compareTo9 = Boolean.valueOf(isSetInLastWeekRank()).compareTo(Boolean.valueOf(other.isSetInLastWeekRank()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetInLastWeekRank() && (compareTo4 = TBaseHelper.compareTo(this.inLastWeekRank, other.inLastWeekRank)) != 0) {
            return compareTo4;
        }
        int compareTo10 = Boolean.valueOf(isSetScore()).compareTo(Boolean.valueOf(other.isSetScore()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetScore() && (compareTo3 = TBaseHelper.compareTo(this.score, other.score)) != 0) {
            return compareTo3;
        }
        int compareTo11 = Boolean.valueOf(isSetRanking()).compareTo(Boolean.valueOf(other.isSetRanking()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetRanking() && (compareTo2 = TBaseHelper.compareTo(this.ranking, other.ranking)) != 0) {
            return compareTo2;
        }
        int compareTo12 = Boolean.valueOf(isSetTaskUpdatedAt()).compareTo(Boolean.valueOf(other.isSetTaskUpdatedAt()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (!isSetTaskUpdatedAt() || (compareTo = TBaseHelper.compareTo(this.taskUpdatedAt, other.taskUpdatedAt)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<ExperienceRankInfo, _Fields> deepCopy2() {
        return new ExperienceRankInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$ExperienceRankInfo$_Fields[field.ordinal()]) {
            case 1:
                return Boolean.valueOf(isEnable());
            case 2:
                return Integer.valueOf(getCurStatus());
            case 3:
                return Integer.valueOf(getInLastWeekRank());
            case 4:
                return Integer.valueOf(getScore());
            case 5:
                return Integer.valueOf(getRanking());
            case 6:
                return Long.valueOf(getTaskUpdatedAt());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$ExperienceRankInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetEnable();
            case 2:
                return isSetCurStatus();
            case 3:
                return isSetInLastWeekRank();
            case 4:
                return isSetScore();
            case 5:
                return isSetRanking();
            case 6:
                return isSetTaskUpdatedAt();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$ExperienceRankInfo$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setEnable(((Boolean) value).booleanValue());
                    break;
                } else {
                    unsetEnable();
                    break;
                }
            case 2:
                if (value != null) {
                    setCurStatus(((Integer) value).intValue());
                    break;
                } else {
                    unsetCurStatus();
                    break;
                }
            case 3:
                if (value != null) {
                    setInLastWeekRank(((Integer) value).intValue());
                    break;
                } else {
                    unsetInLastWeekRank();
                    break;
                }
            case 4:
                if (value != null) {
                    setScore(((Integer) value).intValue());
                    break;
                } else {
                    unsetScore();
                    break;
                }
            case 5:
                if (value != null) {
                    setRanking(((Integer) value).intValue());
                    break;
                } else {
                    unsetRanking();
                    break;
                }
            case 6:
                if (value != null) {
                    setTaskUpdatedAt(((Long) value).longValue());
                    break;
                } else {
                    unsetTaskUpdatedAt();
                    break;
                }
        }
    }

    public boolean equals(ExperienceRankInfo that) {
        if (that == null || this.enable != that.enable) {
            return false;
        }
        boolean isSetCurStatus = isSetCurStatus();
        boolean isSetCurStatus2 = that.isSetCurStatus();
        if ((isSetCurStatus || isSetCurStatus2) && !(isSetCurStatus && isSetCurStatus2 && this.curStatus == that.curStatus)) {
            return false;
        }
        boolean isSetInLastWeekRank = isSetInLastWeekRank();
        boolean isSetInLastWeekRank2 = that.isSetInLastWeekRank();
        if ((isSetInLastWeekRank || isSetInLastWeekRank2) && !(isSetInLastWeekRank && isSetInLastWeekRank2 && this.inLastWeekRank == that.inLastWeekRank)) {
            return false;
        }
        boolean isSetScore = isSetScore();
        boolean isSetScore2 = that.isSetScore();
        if ((isSetScore || isSetScore2) && !(isSetScore && isSetScore2 && this.score == that.score)) {
            return false;
        }
        boolean isSetRanking = isSetRanking();
        boolean isSetRanking2 = that.isSetRanking();
        if ((isSetRanking || isSetRanking2) && !(isSetRanking && isSetRanking2 && this.ranking == that.ranking)) {
            return false;
        }
        boolean isSetTaskUpdatedAt = isSetTaskUpdatedAt();
        boolean isSetTaskUpdatedAt2 = that.isSetTaskUpdatedAt();
        if (isSetTaskUpdatedAt || isSetTaskUpdatedAt2) {
            return isSetTaskUpdatedAt && isSetTaskUpdatedAt2 && this.taskUpdatedAt == that.taskUpdatedAt;
        }
        return true;
    }

    public ExperienceRankInfo(boolean enable) {
        this();
        this.enable = enable;
        setEnableIsSet(true);
    }

    public ExperienceRankInfo(ExperienceRankInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.CUR_STATUS, _Fields.IN_LAST_WEEK_RANK, _Fields.SCORE, _Fields.RANKING, _Fields.TASK_UPDATED_AT};
        this.__isset_bitfield = other.__isset_bitfield;
        this.enable = other.enable;
        this.curStatus = other.curStatus;
        this.inLastWeekRank = other.inLastWeekRank;
        this.score = other.score;
        this.ranking = other.ranking;
        this.taskUpdatedAt = other.taskUpdatedAt;
    }

    public void validate() throws TException {
    }
}
