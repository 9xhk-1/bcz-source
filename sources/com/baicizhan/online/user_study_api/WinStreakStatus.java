package com.baicizhan.online.user_study_api;

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
public class WinStreakStatus implements TBase<WinStreakStatus, _Fields>, Serializable, Cloneable, Comparable<WinStreakStatus> {
    private static final int __ENABLEEXPERIENCERANKING_ISSET_ID = 3;
    private static final int __ENABLE_ISSET_ID = 0;
    private static final int __LATEST_WIN_STREAK_DATE_ISSET_ID = 2;
    private static final int __TASKSTATUS_ISSET_ID = 4;
    private static final int __WIN_STREAK_DAYS_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int enable;
    public int enableExperienceRanking;
    public int latest_win_streak_date;
    private _Fields[] optionals;
    public int taskStatus;
    public int win_streak_days;
    private static final TStruct STRUCT_DESC = new TStruct("WinStreakStatus");
    private static final TField ENABLE_FIELD_DESC = new TField(k3.u0.f65628b, (byte) 8, 1);
    private static final TField WIN_STREAK_DAYS_FIELD_DESC = new TField("win_streak_days", (byte) 8, 2);
    private static final TField LATEST_WIN_STREAK_DATE_FIELD_DESC = new TField("latest_win_streak_date", (byte) 8, 3);
    private static final TField ENABLE_EXPERIENCE_RANKING_FIELD_DESC = new TField("enableExperienceRanking", (byte) 8, 4);
    private static final TField TASK_STATUS_FIELD_DESC = new TField("taskStatus", (byte) 8, 5);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.WinStreakStatus$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$WinStreakStatus$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$WinStreakStatus$_Fields = iArr;
            try {
                iArr[_Fields.ENABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$WinStreakStatus$_Fields[_Fields.WIN_STREAK_DAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$WinStreakStatus$_Fields[_Fields.LATEST_WIN_STREAK_DATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$WinStreakStatus$_Fields[_Fields.ENABLE_EXPERIENCE_RANKING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$WinStreakStatus$_Fields[_Fields.TASK_STATUS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WinStreakStatusStandardScheme extends StandardScheme<WinStreakStatus> {
        private WinStreakStatusStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, WinStreakStatus struct) throws TException {
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
                                } else if (b11 == 8) {
                                    struct.taskStatus = iprot.readI32();
                                    struct.setTaskStatusIsSet(true);
                                } else {
                                    TProtocolUtil.skip(iprot, b11);
                                }
                            } else if (b11 == 8) {
                                struct.enableExperienceRanking = iprot.readI32();
                                struct.setEnableExperienceRankingIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 8) {
                            struct.latest_win_streak_date = iprot.readI32();
                            struct.setLatest_win_streak_dateIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.win_streak_days = iprot.readI32();
                        struct.setWin_streak_daysIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.enable = iprot.readI32();
                    struct.setEnableIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetEnable()) {
                throw new TProtocolException("Required field 'enable' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetWin_streak_days()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'win_streak_days' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, WinStreakStatus struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(WinStreakStatus.STRUCT_DESC);
            oprot.writeFieldBegin(WinStreakStatus.ENABLE_FIELD_DESC);
            oprot.writeI32(struct.enable);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(WinStreakStatus.WIN_STREAK_DAYS_FIELD_DESC);
            oprot.writeI32(struct.win_streak_days);
            oprot.writeFieldEnd();
            if (struct.isSetLatest_win_streak_date()) {
                oprot.writeFieldBegin(WinStreakStatus.LATEST_WIN_STREAK_DATE_FIELD_DESC);
                oprot.writeI32(struct.latest_win_streak_date);
                oprot.writeFieldEnd();
            }
            if (struct.isSetEnableExperienceRanking()) {
                oprot.writeFieldBegin(WinStreakStatus.ENABLE_EXPERIENCE_RANKING_FIELD_DESC);
                oprot.writeI32(struct.enableExperienceRanking);
                oprot.writeFieldEnd();
            }
            if (struct.isSetTaskStatus()) {
                oprot.writeFieldBegin(WinStreakStatus.TASK_STATUS_FIELD_DESC);
                oprot.writeI32(struct.taskStatus);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WinStreakStatusStandardSchemeFactory implements SchemeFactory {
        private WinStreakStatusStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public WinStreakStatusStandardScheme getScheme() {
            return new WinStreakStatusStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WinStreakStatusTupleScheme extends TupleScheme<WinStreakStatus> {
        private WinStreakStatusTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, WinStreakStatus struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.enable = tTupleProtocol.readI32();
            struct.setEnableIsSet(true);
            struct.win_streak_days = tTupleProtocol.readI32();
            struct.setWin_streak_daysIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(3);
            if (readBitSet.get(0)) {
                struct.latest_win_streak_date = tTupleProtocol.readI32();
                struct.setLatest_win_streak_dateIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.enableExperienceRanking = tTupleProtocol.readI32();
                struct.setEnableExperienceRankingIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.taskStatus = tTupleProtocol.readI32();
                struct.setTaskStatusIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, WinStreakStatus struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.enable);
            tTupleProtocol.writeI32(struct.win_streak_days);
            BitSet bitSet = new BitSet();
            if (struct.isSetLatest_win_streak_date()) {
                bitSet.set(0);
            }
            if (struct.isSetEnableExperienceRanking()) {
                bitSet.set(1);
            }
            if (struct.isSetTaskStatus()) {
                bitSet.set(2);
            }
            tTupleProtocol.writeBitSet(bitSet, 3);
            if (struct.isSetLatest_win_streak_date()) {
                tTupleProtocol.writeI32(struct.latest_win_streak_date);
            }
            if (struct.isSetEnableExperienceRanking()) {
                tTupleProtocol.writeI32(struct.enableExperienceRanking);
            }
            if (struct.isSetTaskStatus()) {
                tTupleProtocol.writeI32(struct.taskStatus);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WinStreakStatusTupleSchemeFactory implements SchemeFactory {
        private WinStreakStatusTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public WinStreakStatusTupleScheme getScheme() {
            return new WinStreakStatusTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ENABLE(1, k3.u0.f65628b),
        WIN_STREAK_DAYS(2, "win_streak_days"),
        LATEST_WIN_STREAK_DATE(3, "latest_win_streak_date"),
        ENABLE_EXPERIENCE_RANKING(4, "enableExperienceRanking"),
        TASK_STATUS(5, "taskStatus");

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
                return ENABLE;
            }
            if (fieldId == 2) {
                return WIN_STREAK_DAYS;
            }
            if (fieldId == 3) {
                return LATEST_WIN_STREAK_DATE;
            }
            if (fieldId == 4) {
                return ENABLE_EXPERIENCE_RANKING;
            }
            if (fieldId != 5) {
                return null;
            }
            return TASK_STATUS;
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
        hashMap.put(StandardScheme.class, new WinStreakStatusStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new WinStreakStatusTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ENABLE, (_Fields) new FieldMetaData(k3.u0.f65628b, (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.WIN_STREAK_DAYS, (_Fields) new FieldMetaData("win_streak_days", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.LATEST_WIN_STREAK_DATE, (_Fields) new FieldMetaData("latest_win_streak_date", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.ENABLE_EXPERIENCE_RANKING, (_Fields) new FieldMetaData("enableExperienceRanking", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.TASK_STATUS, (_Fields) new FieldMetaData("taskStatus", (byte) 2, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(WinStreakStatus.class, unmodifiableMap);
    }

    public WinStreakStatus() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.LATEST_WIN_STREAK_DATE, _Fields.ENABLE_EXPERIENCE_RANKING, _Fields.TASK_STATUS};
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
        this.enable = 0;
        setWin_streak_daysIsSet(false);
        this.win_streak_days = 0;
        setLatest_win_streak_dateIsSet(false);
        this.latest_win_streak_date = 0;
        setEnableExperienceRankingIsSet(false);
        this.enableExperienceRanking = 0;
        setTaskStatusIsSet(false);
        this.taskStatus = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof WinStreakStatus)) {
            return equals((WinStreakStatus) that);
        }
        return false;
    }

    public int getEnable() {
        return this.enable;
    }

    public int getEnableExperienceRanking() {
        return this.enableExperienceRanking;
    }

    public int getLatest_win_streak_date() {
        return this.latest_win_streak_date;
    }

    public int getTaskStatus() {
        return this.taskStatus;
    }

    public int getWin_streak_days() {
        return this.win_streak_days;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetEnable() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetEnableExperienceRanking() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetLatest_win_streak_date() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetTaskStatus() {
        return EncodingUtils.testBit(this.__isset_bitfield, 4);
    }

    public boolean isSetWin_streak_days() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public WinStreakStatus setEnable(int enable) {
        this.enable = enable;
        setEnableIsSet(true);
        return this;
    }

    public WinStreakStatus setEnableExperienceRanking(int enableExperienceRanking) {
        this.enableExperienceRanking = enableExperienceRanking;
        setEnableExperienceRankingIsSet(true);
        return this;
    }

    public void setEnableExperienceRankingIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public void setEnableIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public WinStreakStatus setLatest_win_streak_date(int latest_win_streak_date) {
        this.latest_win_streak_date = latest_win_streak_date;
        setLatest_win_streak_dateIsSet(true);
        return this;
    }

    public void setLatest_win_streak_dateIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public WinStreakStatus setTaskStatus(int taskStatus) {
        this.taskStatus = taskStatus;
        setTaskStatusIsSet(true);
        return this;
    }

    public void setTaskStatusIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 4, value);
    }

    public WinStreakStatus setWin_streak_days(int win_streak_days) {
        this.win_streak_days = win_streak_days;
        setWin_streak_daysIsSet(true);
        return this;
    }

    public void setWin_streak_daysIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("WinStreakStatus(");
        sb2.append("enable:");
        sb2.append(this.enable);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("win_streak_days:");
        sb2.append(this.win_streak_days);
        if (isSetLatest_win_streak_date()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("latest_win_streak_date:");
            sb2.append(this.latest_win_streak_date);
        }
        if (isSetEnableExperienceRanking()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("enableExperienceRanking:");
            sb2.append(this.enableExperienceRanking);
        }
        if (isSetTaskStatus()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("taskStatus:");
            sb2.append(this.taskStatus);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetEnable() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetEnableExperienceRanking() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetLatest_win_streak_date() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetTaskStatus() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 4);
    }

    public void unsetWin_streak_days() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(WinStreakStatus other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo6 = Boolean.valueOf(isSetEnable()).compareTo(Boolean.valueOf(other.isSetEnable()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetEnable() && (compareTo5 = TBaseHelper.compareTo(this.enable, other.enable)) != 0) {
            return compareTo5;
        }
        int compareTo7 = Boolean.valueOf(isSetWin_streak_days()).compareTo(Boolean.valueOf(other.isSetWin_streak_days()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetWin_streak_days() && (compareTo4 = TBaseHelper.compareTo(this.win_streak_days, other.win_streak_days)) != 0) {
            return compareTo4;
        }
        int compareTo8 = Boolean.valueOf(isSetLatest_win_streak_date()).compareTo(Boolean.valueOf(other.isSetLatest_win_streak_date()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetLatest_win_streak_date() && (compareTo3 = TBaseHelper.compareTo(this.latest_win_streak_date, other.latest_win_streak_date)) != 0) {
            return compareTo3;
        }
        int compareTo9 = Boolean.valueOf(isSetEnableExperienceRanking()).compareTo(Boolean.valueOf(other.isSetEnableExperienceRanking()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetEnableExperienceRanking() && (compareTo2 = TBaseHelper.compareTo(this.enableExperienceRanking, other.enableExperienceRanking)) != 0) {
            return compareTo2;
        }
        int compareTo10 = Boolean.valueOf(isSetTaskStatus()).compareTo(Boolean.valueOf(other.isSetTaskStatus()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!isSetTaskStatus() || (compareTo = TBaseHelper.compareTo(this.taskStatus, other.taskStatus)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<WinStreakStatus, _Fields> deepCopy2() {
        return new WinStreakStatus(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$WinStreakStatus$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getEnable());
        }
        if (i11 == 2) {
            return Integer.valueOf(getWin_streak_days());
        }
        if (i11 == 3) {
            return Integer.valueOf(getLatest_win_streak_date());
        }
        if (i11 == 4) {
            return Integer.valueOf(getEnableExperienceRanking());
        }
        if (i11 == 5) {
            return Integer.valueOf(getTaskStatus());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$WinStreakStatus$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetEnable();
        }
        if (i11 == 2) {
            return isSetWin_streak_days();
        }
        if (i11 == 3) {
            return isSetLatest_win_streak_date();
        }
        if (i11 == 4) {
            return isSetEnableExperienceRanking();
        }
        if (i11 == 5) {
            return isSetTaskStatus();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$WinStreakStatus$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetEnable();
                return;
            } else {
                setEnable(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetWin_streak_days();
                return;
            } else {
                setWin_streak_days(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetLatest_win_streak_date();
                return;
            } else {
                setLatest_win_streak_date(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 4) {
            if (value == null) {
                unsetEnableExperienceRanking();
                return;
            } else {
                setEnableExperienceRanking(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 5) {
            return;
        }
        if (value == null) {
            unsetTaskStatus();
        } else {
            setTaskStatus(((Integer) value).intValue());
        }
    }

    public boolean equals(WinStreakStatus that) {
        if (that == null || this.enable != that.enable || this.win_streak_days != that.win_streak_days) {
            return false;
        }
        boolean isSetLatest_win_streak_date = isSetLatest_win_streak_date();
        boolean isSetLatest_win_streak_date2 = that.isSetLatest_win_streak_date();
        if ((isSetLatest_win_streak_date || isSetLatest_win_streak_date2) && !(isSetLatest_win_streak_date && isSetLatest_win_streak_date2 && this.latest_win_streak_date == that.latest_win_streak_date)) {
            return false;
        }
        boolean isSetEnableExperienceRanking = isSetEnableExperienceRanking();
        boolean isSetEnableExperienceRanking2 = that.isSetEnableExperienceRanking();
        if ((isSetEnableExperienceRanking || isSetEnableExperienceRanking2) && !(isSetEnableExperienceRanking && isSetEnableExperienceRanking2 && this.enableExperienceRanking == that.enableExperienceRanking)) {
            return false;
        }
        boolean isSetTaskStatus = isSetTaskStatus();
        boolean isSetTaskStatus2 = that.isSetTaskStatus();
        if (isSetTaskStatus || isSetTaskStatus2) {
            return isSetTaskStatus && isSetTaskStatus2 && this.taskStatus == that.taskStatus;
        }
        return true;
    }

    public WinStreakStatus(int enable, int win_streak_days) {
        this();
        this.enable = enable;
        setEnableIsSet(true);
        this.win_streak_days = win_streak_days;
        setWin_streak_daysIsSet(true);
    }

    public WinStreakStatus(WinStreakStatus other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.LATEST_WIN_STREAK_DATE, _Fields.ENABLE_EXPERIENCE_RANKING, _Fields.TASK_STATUS};
        this.__isset_bitfield = other.__isset_bitfield;
        this.enable = other.enable;
        this.win_streak_days = other.win_streak_days;
        this.latest_win_streak_date = other.latest_win_streak_date;
        this.enableExperienceRanking = other.enableExperienceRanking;
        this.taskStatus = other.taskStatus;
    }

    public void validate() throws TException {
    }
}
