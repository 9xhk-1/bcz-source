package com.baicizhan.online.game_api;

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
public class StudyRecordItem implements TBase<StudyRecordItem, _Fields>, Serializable, Cloneable, Comparable<StudyRecordItem> {
    private static final int __ATTEMPT_TIMES_ISSET_ID = 8;
    private static final int __CORRECT_TIMES_ISSET_ID = 7;
    private static final int __HALF_TIME_ISSET_ID = 3;
    private static final int __IS_KILLED_ISSET_ID = 2;
    private static final int __LAST_MODIFY_TIME_ISSET_ID = 6;
    private static final int __LEARN_TIME_ISSET_ID = 5;
    private static final int __NEXT_REVIEW_TIME_ISSET_ID = 4;
    private static final int __STAGE_ISSET_ID = 1;
    private static final int __TOPIC_ID_ISSET_ID = 0;
    private static final int __USAGE_TIME_ISSET_ID = 9;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private short __isset_bitfield;
    public int attempt_times;
    public int correct_times;
    public int half_time;
    public boolean is_killed;
    public long last_modify_time;
    public int learn_time;
    public int next_review_time;
    private _Fields[] optionals;
    public int stage;
    public int topic_id;
    public int usage_time;
    private static final TStruct STRUCT_DESC = new TStruct("StudyRecordItem");
    private static final TField TOPIC_ID_FIELD_DESC = new TField("topic_id", (byte) 8, 1);
    private static final TField STAGE_FIELD_DESC = new TField("stage", (byte) 8, 2);
    private static final TField IS_KILLED_FIELD_DESC = new TField("is_killed", (byte) 2, 3);
    private static final TField HALF_TIME_FIELD_DESC = new TField("half_time", (byte) 8, 4);
    private static final TField NEXT_REVIEW_TIME_FIELD_DESC = new TField("next_review_time", (byte) 8, 5);
    private static final TField LEARN_TIME_FIELD_DESC = new TField("learn_time", (byte) 8, 6);
    private static final TField LAST_MODIFY_TIME_FIELD_DESC = new TField("last_modify_time", (byte) 10, 7);
    private static final TField CORRECT_TIMES_FIELD_DESC = new TField("correct_times", (byte) 8, 8);
    private static final TField ATTEMPT_TIMES_FIELD_DESC = new TField("attempt_times", (byte) 8, 9);
    private static final TField USAGE_TIME_FIELD_DESC = new TField("usage_time", (byte) 8, 10);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.StudyRecordItem$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$StudyRecordItem$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$StudyRecordItem$_Fields = iArr;
            try {
                iArr[_Fields.TOPIC_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$StudyRecordItem$_Fields[_Fields.STAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$StudyRecordItem$_Fields[_Fields.IS_KILLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$StudyRecordItem$_Fields[_Fields.HALF_TIME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$StudyRecordItem$_Fields[_Fields.NEXT_REVIEW_TIME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$StudyRecordItem$_Fields[_Fields.LEARN_TIME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$StudyRecordItem$_Fields[_Fields.LAST_MODIFY_TIME.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$StudyRecordItem$_Fields[_Fields.CORRECT_TIMES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$StudyRecordItem$_Fields[_Fields.ATTEMPT_TIMES.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$StudyRecordItem$_Fields[_Fields.USAGE_TIME.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StudyRecordItemStandardScheme extends StandardScheme<StudyRecordItem> {
        private StudyRecordItemStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, StudyRecordItem struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetTopic_id()) {
                        throw new TProtocolException("Required field 'topic_id' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetStage()) {
                        throw new TProtocolException("Required field 'stage' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetIs_killed()) {
                        throw new TProtocolException("Required field 'is_killed' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetHalf_time()) {
                        throw new TProtocolException("Required field 'half_time' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetNext_review_time()) {
                        throw new TProtocolException("Required field 'next_review_time' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetLearn_time()) {
                        throw new TProtocolException("Required field 'learn_time' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetLast_modify_time()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'last_modify_time' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.topic_id = iprot.readI32();
                            struct.setTopic_idIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.stage = iprot.readI32();
                            struct.setStageIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 2) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.is_killed = iprot.readBool();
                            struct.setIs_killedIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.half_time = iprot.readI32();
                            struct.setHalf_timeIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.next_review_time = iprot.readI32();
                            struct.setNext_review_timeIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.learn_time = iprot.readI32();
                            struct.setLearn_timeIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.last_modify_time = iprot.readI64();
                            struct.setLast_modify_timeIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.correct_times = iprot.readI32();
                            struct.setCorrect_timesIsSet(true);
                            break;
                        }
                    case 9:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.attempt_times = iprot.readI32();
                            struct.setAttempt_timesIsSet(true);
                            break;
                        }
                    case 10:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.usage_time = iprot.readI32();
                            struct.setUsage_timeIsSet(true);
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
        public void write(TProtocol oprot, StudyRecordItem struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(StudyRecordItem.STRUCT_DESC);
            oprot.writeFieldBegin(StudyRecordItem.TOPIC_ID_FIELD_DESC);
            oprot.writeI32(struct.topic_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(StudyRecordItem.STAGE_FIELD_DESC);
            oprot.writeI32(struct.stage);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(StudyRecordItem.IS_KILLED_FIELD_DESC);
            oprot.writeBool(struct.is_killed);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(StudyRecordItem.HALF_TIME_FIELD_DESC);
            oprot.writeI32(struct.half_time);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(StudyRecordItem.NEXT_REVIEW_TIME_FIELD_DESC);
            oprot.writeI32(struct.next_review_time);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(StudyRecordItem.LEARN_TIME_FIELD_DESC);
            oprot.writeI32(struct.learn_time);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(StudyRecordItem.LAST_MODIFY_TIME_FIELD_DESC);
            oprot.writeI64(struct.last_modify_time);
            oprot.writeFieldEnd();
            if (struct.isSetCorrect_times()) {
                oprot.writeFieldBegin(StudyRecordItem.CORRECT_TIMES_FIELD_DESC);
                oprot.writeI32(struct.correct_times);
                oprot.writeFieldEnd();
            }
            if (struct.isSetAttempt_times()) {
                oprot.writeFieldBegin(StudyRecordItem.ATTEMPT_TIMES_FIELD_DESC);
                oprot.writeI32(struct.attempt_times);
                oprot.writeFieldEnd();
            }
            if (struct.isSetUsage_time()) {
                oprot.writeFieldBegin(StudyRecordItem.USAGE_TIME_FIELD_DESC);
                oprot.writeI32(struct.usage_time);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StudyRecordItemStandardSchemeFactory implements SchemeFactory {
        private StudyRecordItemStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public StudyRecordItemStandardScheme getScheme() {
            return new StudyRecordItemStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StudyRecordItemTupleScheme extends TupleScheme<StudyRecordItem> {
        private StudyRecordItemTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, StudyRecordItem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.topic_id = tTupleProtocol.readI32();
            struct.setTopic_idIsSet(true);
            struct.stage = tTupleProtocol.readI32();
            struct.setStageIsSet(true);
            struct.is_killed = tTupleProtocol.readBool();
            struct.setIs_killedIsSet(true);
            struct.half_time = tTupleProtocol.readI32();
            struct.setHalf_timeIsSet(true);
            struct.next_review_time = tTupleProtocol.readI32();
            struct.setNext_review_timeIsSet(true);
            struct.learn_time = tTupleProtocol.readI32();
            struct.setLearn_timeIsSet(true);
            struct.last_modify_time = tTupleProtocol.readI64();
            struct.setLast_modify_timeIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(3);
            if (readBitSet.get(0)) {
                struct.correct_times = tTupleProtocol.readI32();
                struct.setCorrect_timesIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.attempt_times = tTupleProtocol.readI32();
                struct.setAttempt_timesIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.usage_time = tTupleProtocol.readI32();
                struct.setUsage_timeIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, StudyRecordItem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.topic_id);
            tTupleProtocol.writeI32(struct.stage);
            tTupleProtocol.writeBool(struct.is_killed);
            tTupleProtocol.writeI32(struct.half_time);
            tTupleProtocol.writeI32(struct.next_review_time);
            tTupleProtocol.writeI32(struct.learn_time);
            tTupleProtocol.writeI64(struct.last_modify_time);
            BitSet bitSet = new BitSet();
            if (struct.isSetCorrect_times()) {
                bitSet.set(0);
            }
            if (struct.isSetAttempt_times()) {
                bitSet.set(1);
            }
            if (struct.isSetUsage_time()) {
                bitSet.set(2);
            }
            tTupleProtocol.writeBitSet(bitSet, 3);
            if (struct.isSetCorrect_times()) {
                tTupleProtocol.writeI32(struct.correct_times);
            }
            if (struct.isSetAttempt_times()) {
                tTupleProtocol.writeI32(struct.attempt_times);
            }
            if (struct.isSetUsage_time()) {
                tTupleProtocol.writeI32(struct.usage_time);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StudyRecordItemTupleSchemeFactory implements SchemeFactory {
        private StudyRecordItemTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public StudyRecordItemTupleScheme getScheme() {
            return new StudyRecordItemTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TOPIC_ID(1, "topic_id"),
        STAGE(2, "stage"),
        IS_KILLED(3, "is_killed"),
        HALF_TIME(4, "half_time"),
        NEXT_REVIEW_TIME(5, "next_review_time"),
        LEARN_TIME(6, "learn_time"),
        LAST_MODIFY_TIME(7, "last_modify_time"),
        CORRECT_TIMES(8, "correct_times"),
        ATTEMPT_TIMES(9, "attempt_times"),
        USAGE_TIME(10, "usage_time");

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
                    return TOPIC_ID;
                case 2:
                    return STAGE;
                case 3:
                    return IS_KILLED;
                case 4:
                    return HALF_TIME;
                case 5:
                    return NEXT_REVIEW_TIME;
                case 6:
                    return LEARN_TIME;
                case 7:
                    return LAST_MODIFY_TIME;
                case 8:
                    return CORRECT_TIMES;
                case 9:
                    return ATTEMPT_TIMES;
                case 10:
                    return USAGE_TIME;
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
        hashMap.put(StandardScheme.class, new StudyRecordItemStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new StudyRecordItemTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TOPIC_ID, (_Fields) new FieldMetaData("topic_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.STAGE, (_Fields) new FieldMetaData("stage", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.IS_KILLED, (_Fields) new FieldMetaData("is_killed", (byte) 1, new FieldValueMetaData((byte) 2)));
        enumMap.put((EnumMap) _Fields.HALF_TIME, (_Fields) new FieldMetaData("half_time", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.NEXT_REVIEW_TIME, (_Fields) new FieldMetaData("next_review_time", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.LEARN_TIME, (_Fields) new FieldMetaData("learn_time", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.LAST_MODIFY_TIME, (_Fields) new FieldMetaData("last_modify_time", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.CORRECT_TIMES, (_Fields) new FieldMetaData("correct_times", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.ATTEMPT_TIMES, (_Fields) new FieldMetaData("attempt_times", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.USAGE_TIME, (_Fields) new FieldMetaData("usage_time", (byte) 2, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(StudyRecordItem.class, unmodifiableMap);
    }

    public StudyRecordItem() {
        this.__isset_bitfield = (short) 0;
        this.optionals = new _Fields[]{_Fields.CORRECT_TIMES, _Fields.ATTEMPT_TIMES, _Fields.USAGE_TIME};
    }

    private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
        try {
            this.__isset_bitfield = (short) 0;
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
        setTopic_idIsSet(false);
        this.topic_id = 0;
        setStageIsSet(false);
        this.stage = 0;
        setIs_killedIsSet(false);
        this.is_killed = false;
        setHalf_timeIsSet(false);
        this.half_time = 0;
        setNext_review_timeIsSet(false);
        this.next_review_time = 0;
        setLearn_timeIsSet(false);
        this.learn_time = 0;
        setLast_modify_timeIsSet(false);
        this.last_modify_time = 0L;
        setCorrect_timesIsSet(false);
        this.correct_times = 0;
        setAttempt_timesIsSet(false);
        this.attempt_times = 0;
        setUsage_timeIsSet(false);
        this.usage_time = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof StudyRecordItem)) {
            return equals((StudyRecordItem) that);
        }
        return false;
    }

    public int getAttempt_times() {
        return this.attempt_times;
    }

    public int getCorrect_times() {
        return this.correct_times;
    }

    public int getHalf_time() {
        return this.half_time;
    }

    public long getLast_modify_time() {
        return this.last_modify_time;
    }

    public int getLearn_time() {
        return this.learn_time;
    }

    public int getNext_review_time() {
        return this.next_review_time;
    }

    public int getStage() {
        return this.stage;
    }

    public int getTopic_id() {
        return this.topic_id;
    }

    public int getUsage_time() {
        return this.usage_time;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isIs_killed() {
        return this.is_killed;
    }

    public boolean isSetAttempt_times() {
        return EncodingUtils.testBit(this.__isset_bitfield, 8);
    }

    public boolean isSetCorrect_times() {
        return EncodingUtils.testBit(this.__isset_bitfield, 7);
    }

    public boolean isSetHalf_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetIs_killed() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetLast_modify_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 6);
    }

    public boolean isSetLearn_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 5);
    }

    public boolean isSetNext_review_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 4);
    }

    public boolean isSetStage() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetTopic_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetUsage_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 9);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public StudyRecordItem setAttempt_times(int attempt_times) {
        this.attempt_times = attempt_times;
        setAttempt_timesIsSet(true);
        return this;
    }

    public void setAttempt_timesIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 8, value);
    }

    public StudyRecordItem setCorrect_times(int correct_times) {
        this.correct_times = correct_times;
        setCorrect_timesIsSet(true);
        return this;
    }

    public void setCorrect_timesIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 7, value);
    }

    public StudyRecordItem setHalf_time(int half_time) {
        this.half_time = half_time;
        setHalf_timeIsSet(true);
        return this;
    }

    public void setHalf_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public StudyRecordItem setIs_killed(boolean is_killed) {
        this.is_killed = is_killed;
        setIs_killedIsSet(true);
        return this;
    }

    public void setIs_killedIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public StudyRecordItem setLast_modify_time(long last_modify_time) {
        this.last_modify_time = last_modify_time;
        setLast_modify_timeIsSet(true);
        return this;
    }

    public void setLast_modify_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 6, value);
    }

    public StudyRecordItem setLearn_time(int learn_time) {
        this.learn_time = learn_time;
        setLearn_timeIsSet(true);
        return this;
    }

    public void setLearn_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 5, value);
    }

    public StudyRecordItem setNext_review_time(int next_review_time) {
        this.next_review_time = next_review_time;
        setNext_review_timeIsSet(true);
        return this;
    }

    public void setNext_review_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 4, value);
    }

    public StudyRecordItem setStage(int stage) {
        this.stage = stage;
        setStageIsSet(true);
        return this;
    }

    public void setStageIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public StudyRecordItem setTopic_id(int topic_id) {
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        return this;
    }

    public void setTopic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public StudyRecordItem setUsage_time(int usage_time) {
        this.usage_time = usage_time;
        setUsage_timeIsSet(true);
        return this;
    }

    public void setUsage_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 9, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("StudyRecordItem(");
        sb2.append("topic_id:");
        sb2.append(this.topic_id);
        sb2.append(j2.O);
        sb2.append("stage:");
        sb2.append(this.stage);
        sb2.append(j2.O);
        sb2.append("is_killed:");
        sb2.append(this.is_killed);
        sb2.append(j2.O);
        sb2.append("half_time:");
        sb2.append(this.half_time);
        sb2.append(j2.O);
        sb2.append("next_review_time:");
        sb2.append(this.next_review_time);
        sb2.append(j2.O);
        sb2.append("learn_time:");
        sb2.append(this.learn_time);
        sb2.append(j2.O);
        sb2.append("last_modify_time:");
        sb2.append(this.last_modify_time);
        if (isSetCorrect_times()) {
            sb2.append(j2.O);
            sb2.append("correct_times:");
            sb2.append(this.correct_times);
        }
        if (isSetAttempt_times()) {
            sb2.append(j2.O);
            sb2.append("attempt_times:");
            sb2.append(this.attempt_times);
        }
        if (isSetUsage_time()) {
            sb2.append(j2.O);
            sb2.append("usage_time:");
            sb2.append(this.usage_time);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAttempt_times() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 8);
    }

    public void unsetCorrect_times() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 7);
    }

    public void unsetHalf_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetIs_killed() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetLast_modify_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 6);
    }

    public void unsetLearn_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 5);
    }

    public void unsetNext_review_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 4);
    }

    public void unsetStage() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetTopic_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetUsage_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 9);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(StudyRecordItem other) {
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
        int compareTo11 = Boolean.valueOf(isSetTopic_id()).compareTo(Boolean.valueOf(other.isSetTopic_id()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetTopic_id() && (compareTo10 = TBaseHelper.compareTo(this.topic_id, other.topic_id)) != 0) {
            return compareTo10;
        }
        int compareTo12 = Boolean.valueOf(isSetStage()).compareTo(Boolean.valueOf(other.isSetStage()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetStage() && (compareTo9 = TBaseHelper.compareTo(this.stage, other.stage)) != 0) {
            return compareTo9;
        }
        int compareTo13 = Boolean.valueOf(isSetIs_killed()).compareTo(Boolean.valueOf(other.isSetIs_killed()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetIs_killed() && (compareTo8 = TBaseHelper.compareTo(this.is_killed, other.is_killed)) != 0) {
            return compareTo8;
        }
        int compareTo14 = Boolean.valueOf(isSetHalf_time()).compareTo(Boolean.valueOf(other.isSetHalf_time()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (isSetHalf_time() && (compareTo7 = TBaseHelper.compareTo(this.half_time, other.half_time)) != 0) {
            return compareTo7;
        }
        int compareTo15 = Boolean.valueOf(isSetNext_review_time()).compareTo(Boolean.valueOf(other.isSetNext_review_time()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (isSetNext_review_time() && (compareTo6 = TBaseHelper.compareTo(this.next_review_time, other.next_review_time)) != 0) {
            return compareTo6;
        }
        int compareTo16 = Boolean.valueOf(isSetLearn_time()).compareTo(Boolean.valueOf(other.isSetLearn_time()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (isSetLearn_time() && (compareTo5 = TBaseHelper.compareTo(this.learn_time, other.learn_time)) != 0) {
            return compareTo5;
        }
        int compareTo17 = Boolean.valueOf(isSetLast_modify_time()).compareTo(Boolean.valueOf(other.isSetLast_modify_time()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (isSetLast_modify_time() && (compareTo4 = TBaseHelper.compareTo(this.last_modify_time, other.last_modify_time)) != 0) {
            return compareTo4;
        }
        int compareTo18 = Boolean.valueOf(isSetCorrect_times()).compareTo(Boolean.valueOf(other.isSetCorrect_times()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (isSetCorrect_times() && (compareTo3 = TBaseHelper.compareTo(this.correct_times, other.correct_times)) != 0) {
            return compareTo3;
        }
        int compareTo19 = Boolean.valueOf(isSetAttempt_times()).compareTo(Boolean.valueOf(other.isSetAttempt_times()));
        if (compareTo19 != 0) {
            return compareTo19;
        }
        if (isSetAttempt_times() && (compareTo2 = TBaseHelper.compareTo(this.attempt_times, other.attempt_times)) != 0) {
            return compareTo2;
        }
        int compareTo20 = Boolean.valueOf(isSetUsage_time()).compareTo(Boolean.valueOf(other.isSetUsage_time()));
        if (compareTo20 != 0) {
            return compareTo20;
        }
        if (!isSetUsage_time() || (compareTo = TBaseHelper.compareTo(this.usage_time, other.usage_time)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<StudyRecordItem, _Fields> deepCopy2() {
        return new StudyRecordItem(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$StudyRecordItem$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getTopic_id());
            case 2:
                return Integer.valueOf(getStage());
            case 3:
                return Boolean.valueOf(isIs_killed());
            case 4:
                return Integer.valueOf(getHalf_time());
            case 5:
                return Integer.valueOf(getNext_review_time());
            case 6:
                return Integer.valueOf(getLearn_time());
            case 7:
                return Long.valueOf(getLast_modify_time());
            case 8:
                return Integer.valueOf(getCorrect_times());
            case 9:
                return Integer.valueOf(getAttempt_times());
            case 10:
                return Integer.valueOf(getUsage_time());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$StudyRecordItem$_Fields[field.ordinal()]) {
            case 1:
                return isSetTopic_id();
            case 2:
                return isSetStage();
            case 3:
                return isSetIs_killed();
            case 4:
                return isSetHalf_time();
            case 5:
                return isSetNext_review_time();
            case 6:
                return isSetLearn_time();
            case 7:
                return isSetLast_modify_time();
            case 8:
                return isSetCorrect_times();
            case 9:
                return isSetAttempt_times();
            case 10:
                return isSetUsage_time();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$StudyRecordItem$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setTopic_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetTopic_id();
                    break;
                }
            case 2:
                if (value != null) {
                    setStage(((Integer) value).intValue());
                    break;
                } else {
                    unsetStage();
                    break;
                }
            case 3:
                if (value != null) {
                    setIs_killed(((Boolean) value).booleanValue());
                    break;
                } else {
                    unsetIs_killed();
                    break;
                }
            case 4:
                if (value != null) {
                    setHalf_time(((Integer) value).intValue());
                    break;
                } else {
                    unsetHalf_time();
                    break;
                }
            case 5:
                if (value != null) {
                    setNext_review_time(((Integer) value).intValue());
                    break;
                } else {
                    unsetNext_review_time();
                    break;
                }
            case 6:
                if (value != null) {
                    setLearn_time(((Integer) value).intValue());
                    break;
                } else {
                    unsetLearn_time();
                    break;
                }
            case 7:
                if (value != null) {
                    setLast_modify_time(((Long) value).longValue());
                    break;
                } else {
                    unsetLast_modify_time();
                    break;
                }
            case 8:
                if (value != null) {
                    setCorrect_times(((Integer) value).intValue());
                    break;
                } else {
                    unsetCorrect_times();
                    break;
                }
            case 9:
                if (value != null) {
                    setAttempt_times(((Integer) value).intValue());
                    break;
                } else {
                    unsetAttempt_times();
                    break;
                }
            case 10:
                if (value != null) {
                    setUsage_time(((Integer) value).intValue());
                    break;
                } else {
                    unsetUsage_time();
                    break;
                }
        }
    }

    public boolean equals(StudyRecordItem that) {
        if (that == null || this.topic_id != that.topic_id || this.stage != that.stage || this.is_killed != that.is_killed || this.half_time != that.half_time || this.next_review_time != that.next_review_time || this.learn_time != that.learn_time || this.last_modify_time != that.last_modify_time) {
            return false;
        }
        boolean isSetCorrect_times = isSetCorrect_times();
        boolean isSetCorrect_times2 = that.isSetCorrect_times();
        if ((isSetCorrect_times || isSetCorrect_times2) && !(isSetCorrect_times && isSetCorrect_times2 && this.correct_times == that.correct_times)) {
            return false;
        }
        boolean isSetAttempt_times = isSetAttempt_times();
        boolean isSetAttempt_times2 = that.isSetAttempt_times();
        if ((isSetAttempt_times || isSetAttempt_times2) && !(isSetAttempt_times && isSetAttempt_times2 && this.attempt_times == that.attempt_times)) {
            return false;
        }
        boolean isSetUsage_time = isSetUsage_time();
        boolean isSetUsage_time2 = that.isSetUsage_time();
        if (isSetUsage_time || isSetUsage_time2) {
            return isSetUsage_time && isSetUsage_time2 && this.usage_time == that.usage_time;
        }
        return true;
    }

    public StudyRecordItem(int topic_id, int stage, boolean is_killed, int half_time, int next_review_time, int learn_time, long last_modify_time) {
        this();
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        this.stage = stage;
        setStageIsSet(true);
        this.is_killed = is_killed;
        setIs_killedIsSet(true);
        this.half_time = half_time;
        setHalf_timeIsSet(true);
        this.next_review_time = next_review_time;
        setNext_review_timeIsSet(true);
        this.learn_time = learn_time;
        setLearn_timeIsSet(true);
        this.last_modify_time = last_modify_time;
        setLast_modify_timeIsSet(true);
    }

    public void validate() throws TException {
    }

    public StudyRecordItem(StudyRecordItem other) {
        this.__isset_bitfield = (short) 0;
        this.optionals = new _Fields[]{_Fields.CORRECT_TIMES, _Fields.ATTEMPT_TIMES, _Fields.USAGE_TIME};
        this.__isset_bitfield = other.__isset_bitfield;
        this.topic_id = other.topic_id;
        this.stage = other.stage;
        this.is_killed = other.is_killed;
        this.half_time = other.half_time;
        this.next_review_time = other.next_review_time;
        this.learn_time = other.learn_time;
        this.last_modify_time = other.last_modify_time;
        this.correct_times = other.correct_times;
        this.attempt_times = other.attempt_times;
        this.usage_time = other.usage_time;
    }
}
