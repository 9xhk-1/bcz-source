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
public class UserDoneWordRecord implements TBase<UserDoneWordRecord, _Fields>, Serializable, Cloneable, Comparable<UserDoneWordRecord> {
    private static final int __CHN_SCORE_ISSET_ID = 10;
    private static final int __CURRENT_SCORE_ISSET_ID = 1;
    private static final int __DONE_TIMES_ISSET_ID = 4;
    private static final int __IS_FIRST_DO_AT_TODAY_ISSET_ID = 6;
    private static final int __LISTENING_SCORE_ISSET_ID = 9;
    private static final int __REVIEW_ROUND_ISSET_ID = 11;
    private static final int __SPAN_DAYS_ISSET_ID = 2;
    private static final int __SPELL_SCORE_ISSET_ID = 8;
    private static final int __TAG_ID_ISSET_ID = 7;
    private static final int __USED_TIME_ISSET_ID = 3;
    private static final int __WORD_TOPIC_ID_ISSET_ID = 0;
    private static final int __WRONG_TIMES_ISSET_ID = 5;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private short __isset_bitfield;
    public int chn_score;
    public int current_score;
    public int done_times;
    public int is_first_do_at_today;
    public int listening_score;
    private _Fields[] optionals;
    public int review_round;
    public int span_days;
    public int spell_score;
    public int tag_id;
    public int used_time;
    public int word_topic_id;
    public int wrong_times;
    private static final TStruct STRUCT_DESC = new TStruct("UserDoneWordRecord");
    private static final TField WORD_TOPIC_ID_FIELD_DESC = new TField("word_topic_id", (byte) 8, 1);
    private static final TField CURRENT_SCORE_FIELD_DESC = new TField("current_score", (byte) 8, 2);
    private static final TField SPAN_DAYS_FIELD_DESC = new TField("span_days", (byte) 8, 3);
    private static final TField USED_TIME_FIELD_DESC = new TField("used_time", (byte) 8, 4);
    private static final TField DONE_TIMES_FIELD_DESC = new TField("done_times", (byte) 8, 5);
    private static final TField WRONG_TIMES_FIELD_DESC = new TField("wrong_times", (byte) 8, 6);
    private static final TField IS_FIRST_DO_AT_TODAY_FIELD_DESC = new TField("is_first_do_at_today", (byte) 8, 7);
    private static final TField TAG_ID_FIELD_DESC = new TField("tag_id", (byte) 8, 8);
    private static final TField SPELL_SCORE_FIELD_DESC = new TField("spell_score", (byte) 8, 9);
    private static final TField LISTENING_SCORE_FIELD_DESC = new TField("listening_score", (byte) 8, 10);
    private static final TField CHN_SCORE_FIELD_DESC = new TField("chn_score", (byte) 8, 11);
    private static final TField REVIEW_ROUND_FIELD_DESC = new TField("review_round", (byte) 8, 12);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.UserDoneWordRecord$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$UserDoneWordRecord$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$UserDoneWordRecord$_Fields = iArr;
            try {
                iArr[_Fields.WORD_TOPIC_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserDoneWordRecord$_Fields[_Fields.CURRENT_SCORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserDoneWordRecord$_Fields[_Fields.SPAN_DAYS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserDoneWordRecord$_Fields[_Fields.USED_TIME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserDoneWordRecord$_Fields[_Fields.DONE_TIMES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserDoneWordRecord$_Fields[_Fields.WRONG_TIMES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserDoneWordRecord$_Fields[_Fields.IS_FIRST_DO_AT_TODAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserDoneWordRecord$_Fields[_Fields.TAG_ID.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserDoneWordRecord$_Fields[_Fields.SPELL_SCORE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserDoneWordRecord$_Fields[_Fields.LISTENING_SCORE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserDoneWordRecord$_Fields[_Fields.CHN_SCORE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserDoneWordRecord$_Fields[_Fields.REVIEW_ROUND.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserDoneWordRecordStandardScheme extends StandardScheme<UserDoneWordRecord> {
        private UserDoneWordRecordStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserDoneWordRecord struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetWord_topic_id()) {
                        throw new TProtocolException("Required field 'word_topic_id' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetCurrent_score()) {
                        throw new TProtocolException("Required field 'current_score' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetSpan_days()) {
                        throw new TProtocolException("Required field 'span_days' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetUsed_time()) {
                        throw new TProtocolException("Required field 'used_time' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetDone_times()) {
                        throw new TProtocolException("Required field 'done_times' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetWrong_times()) {
                        throw new TProtocolException("Required field 'wrong_times' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetIs_first_do_at_today()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'is_first_do_at_today' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.word_topic_id = iprot.readI32();
                            struct.setWord_topic_idIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.current_score = iprot.readI32();
                            struct.setCurrent_scoreIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.span_days = iprot.readI32();
                            struct.setSpan_daysIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.used_time = iprot.readI32();
                            struct.setUsed_timeIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.done_times = iprot.readI32();
                            struct.setDone_timesIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.wrong_times = iprot.readI32();
                            struct.setWrong_timesIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.is_first_do_at_today = iprot.readI32();
                            struct.setIs_first_do_at_todayIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.tag_id = iprot.readI32();
                            struct.setTag_idIsSet(true);
                            break;
                        }
                    case 9:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.spell_score = iprot.readI32();
                            struct.setSpell_scoreIsSet(true);
                            break;
                        }
                    case 10:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.listening_score = iprot.readI32();
                            struct.setListening_scoreIsSet(true);
                            break;
                        }
                    case 11:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.chn_score = iprot.readI32();
                            struct.setChn_scoreIsSet(true);
                            break;
                        }
                    case 12:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.review_round = iprot.readI32();
                            struct.setReview_roundIsSet(true);
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
        public void write(TProtocol oprot, UserDoneWordRecord struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserDoneWordRecord.STRUCT_DESC);
            oprot.writeFieldBegin(UserDoneWordRecord.WORD_TOPIC_ID_FIELD_DESC);
            oprot.writeI32(struct.word_topic_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserDoneWordRecord.CURRENT_SCORE_FIELD_DESC);
            oprot.writeI32(struct.current_score);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserDoneWordRecord.SPAN_DAYS_FIELD_DESC);
            oprot.writeI32(struct.span_days);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserDoneWordRecord.USED_TIME_FIELD_DESC);
            oprot.writeI32(struct.used_time);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserDoneWordRecord.DONE_TIMES_FIELD_DESC);
            oprot.writeI32(struct.done_times);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserDoneWordRecord.WRONG_TIMES_FIELD_DESC);
            oprot.writeI32(struct.wrong_times);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserDoneWordRecord.IS_FIRST_DO_AT_TODAY_FIELD_DESC);
            oprot.writeI32(struct.is_first_do_at_today);
            oprot.writeFieldEnd();
            if (struct.isSetTag_id()) {
                oprot.writeFieldBegin(UserDoneWordRecord.TAG_ID_FIELD_DESC);
                oprot.writeI32(struct.tag_id);
                oprot.writeFieldEnd();
            }
            if (struct.isSetSpell_score()) {
                oprot.writeFieldBegin(UserDoneWordRecord.SPELL_SCORE_FIELD_DESC);
                oprot.writeI32(struct.spell_score);
                oprot.writeFieldEnd();
            }
            if (struct.isSetListening_score()) {
                oprot.writeFieldBegin(UserDoneWordRecord.LISTENING_SCORE_FIELD_DESC);
                oprot.writeI32(struct.listening_score);
                oprot.writeFieldEnd();
            }
            if (struct.isSetChn_score()) {
                oprot.writeFieldBegin(UserDoneWordRecord.CHN_SCORE_FIELD_DESC);
                oprot.writeI32(struct.chn_score);
                oprot.writeFieldEnd();
            }
            if (struct.isSetReview_round()) {
                oprot.writeFieldBegin(UserDoneWordRecord.REVIEW_ROUND_FIELD_DESC);
                oprot.writeI32(struct.review_round);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserDoneWordRecordStandardSchemeFactory implements SchemeFactory {
        private UserDoneWordRecordStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserDoneWordRecordStandardScheme getScheme() {
            return new UserDoneWordRecordStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserDoneWordRecordTupleScheme extends TupleScheme<UserDoneWordRecord> {
        private UserDoneWordRecordTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserDoneWordRecord struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.word_topic_id = tTupleProtocol.readI32();
            struct.setWord_topic_idIsSet(true);
            struct.current_score = tTupleProtocol.readI32();
            struct.setCurrent_scoreIsSet(true);
            struct.span_days = tTupleProtocol.readI32();
            struct.setSpan_daysIsSet(true);
            struct.used_time = tTupleProtocol.readI32();
            struct.setUsed_timeIsSet(true);
            struct.done_times = tTupleProtocol.readI32();
            struct.setDone_timesIsSet(true);
            struct.wrong_times = tTupleProtocol.readI32();
            struct.setWrong_timesIsSet(true);
            struct.is_first_do_at_today = tTupleProtocol.readI32();
            struct.setIs_first_do_at_todayIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(5);
            if (readBitSet.get(0)) {
                struct.tag_id = tTupleProtocol.readI32();
                struct.setTag_idIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.spell_score = tTupleProtocol.readI32();
                struct.setSpell_scoreIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.listening_score = tTupleProtocol.readI32();
                struct.setListening_scoreIsSet(true);
            }
            if (readBitSet.get(3)) {
                struct.chn_score = tTupleProtocol.readI32();
                struct.setChn_scoreIsSet(true);
            }
            if (readBitSet.get(4)) {
                struct.review_round = tTupleProtocol.readI32();
                struct.setReview_roundIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserDoneWordRecord struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.word_topic_id);
            tTupleProtocol.writeI32(struct.current_score);
            tTupleProtocol.writeI32(struct.span_days);
            tTupleProtocol.writeI32(struct.used_time);
            tTupleProtocol.writeI32(struct.done_times);
            tTupleProtocol.writeI32(struct.wrong_times);
            tTupleProtocol.writeI32(struct.is_first_do_at_today);
            BitSet bitSet = new BitSet();
            if (struct.isSetTag_id()) {
                bitSet.set(0);
            }
            if (struct.isSetSpell_score()) {
                bitSet.set(1);
            }
            if (struct.isSetListening_score()) {
                bitSet.set(2);
            }
            if (struct.isSetChn_score()) {
                bitSet.set(3);
            }
            if (struct.isSetReview_round()) {
                bitSet.set(4);
            }
            tTupleProtocol.writeBitSet(bitSet, 5);
            if (struct.isSetTag_id()) {
                tTupleProtocol.writeI32(struct.tag_id);
            }
            if (struct.isSetSpell_score()) {
                tTupleProtocol.writeI32(struct.spell_score);
            }
            if (struct.isSetListening_score()) {
                tTupleProtocol.writeI32(struct.listening_score);
            }
            if (struct.isSetChn_score()) {
                tTupleProtocol.writeI32(struct.chn_score);
            }
            if (struct.isSetReview_round()) {
                tTupleProtocol.writeI32(struct.review_round);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserDoneWordRecordTupleSchemeFactory implements SchemeFactory {
        private UserDoneWordRecordTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserDoneWordRecordTupleScheme getScheme() {
            return new UserDoneWordRecordTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        WORD_TOPIC_ID(1, "word_topic_id"),
        CURRENT_SCORE(2, "current_score"),
        SPAN_DAYS(3, "span_days"),
        USED_TIME(4, "used_time"),
        DONE_TIMES(5, "done_times"),
        WRONG_TIMES(6, "wrong_times"),
        IS_FIRST_DO_AT_TODAY(7, "is_first_do_at_today"),
        TAG_ID(8, "tag_id"),
        SPELL_SCORE(9, "spell_score"),
        LISTENING_SCORE(10, "listening_score"),
        CHN_SCORE(11, "chn_score"),
        REVIEW_ROUND(12, "review_round");

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
                    return WORD_TOPIC_ID;
                case 2:
                    return CURRENT_SCORE;
                case 3:
                    return SPAN_DAYS;
                case 4:
                    return USED_TIME;
                case 5:
                    return DONE_TIMES;
                case 6:
                    return WRONG_TIMES;
                case 7:
                    return IS_FIRST_DO_AT_TODAY;
                case 8:
                    return TAG_ID;
                case 9:
                    return SPELL_SCORE;
                case 10:
                    return LISTENING_SCORE;
                case 11:
                    return CHN_SCORE;
                case 12:
                    return REVIEW_ROUND;
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
        hashMap.put(StandardScheme.class, new UserDoneWordRecordStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserDoneWordRecordTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.WORD_TOPIC_ID, (_Fields) new FieldMetaData("word_topic_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.CURRENT_SCORE, (_Fields) new FieldMetaData("current_score", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.SPAN_DAYS, (_Fields) new FieldMetaData("span_days", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.USED_TIME, (_Fields) new FieldMetaData("used_time", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.DONE_TIMES, (_Fields) new FieldMetaData("done_times", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.WRONG_TIMES, (_Fields) new FieldMetaData("wrong_times", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.IS_FIRST_DO_AT_TODAY, (_Fields) new FieldMetaData("is_first_do_at_today", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.TAG_ID, (_Fields) new FieldMetaData("tag_id", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.SPELL_SCORE, (_Fields) new FieldMetaData("spell_score", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.LISTENING_SCORE, (_Fields) new FieldMetaData("listening_score", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.CHN_SCORE, (_Fields) new FieldMetaData("chn_score", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.REVIEW_ROUND, (_Fields) new FieldMetaData("review_round", (byte) 2, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserDoneWordRecord.class, unmodifiableMap);
    }

    public UserDoneWordRecord() {
        this.__isset_bitfield = (short) 0;
        this.optionals = new _Fields[]{_Fields.TAG_ID, _Fields.SPELL_SCORE, _Fields.LISTENING_SCORE, _Fields.CHN_SCORE, _Fields.REVIEW_ROUND};
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
        setWord_topic_idIsSet(false);
        this.word_topic_id = 0;
        setCurrent_scoreIsSet(false);
        this.current_score = 0;
        setSpan_daysIsSet(false);
        this.span_days = 0;
        setUsed_timeIsSet(false);
        this.used_time = 0;
        setDone_timesIsSet(false);
        this.done_times = 0;
        setWrong_timesIsSet(false);
        this.wrong_times = 0;
        setIs_first_do_at_todayIsSet(false);
        this.is_first_do_at_today = 0;
        setTag_idIsSet(false);
        this.tag_id = 0;
        setSpell_scoreIsSet(false);
        this.spell_score = 0;
        setListening_scoreIsSet(false);
        this.listening_score = 0;
        setChn_scoreIsSet(false);
        this.chn_score = 0;
        setReview_roundIsSet(false);
        this.review_round = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserDoneWordRecord)) {
            return equals((UserDoneWordRecord) that);
        }
        return false;
    }

    public int getChn_score() {
        return this.chn_score;
    }

    public int getCurrent_score() {
        return this.current_score;
    }

    public int getDone_times() {
        return this.done_times;
    }

    public int getIs_first_do_at_today() {
        return this.is_first_do_at_today;
    }

    public int getListening_score() {
        return this.listening_score;
    }

    public int getReview_round() {
        return this.review_round;
    }

    public int getSpan_days() {
        return this.span_days;
    }

    public int getSpell_score() {
        return this.spell_score;
    }

    public int getTag_id() {
        return this.tag_id;
    }

    public int getUsed_time() {
        return this.used_time;
    }

    public int getWord_topic_id() {
        return this.word_topic_id;
    }

    public int getWrong_times() {
        return this.wrong_times;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetChn_score() {
        return EncodingUtils.testBit(this.__isset_bitfield, 10);
    }

    public boolean isSetCurrent_score() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetDone_times() {
        return EncodingUtils.testBit(this.__isset_bitfield, 4);
    }

    public boolean isSetIs_first_do_at_today() {
        return EncodingUtils.testBit(this.__isset_bitfield, 6);
    }

    public boolean isSetListening_score() {
        return EncodingUtils.testBit(this.__isset_bitfield, 9);
    }

    public boolean isSetReview_round() {
        return EncodingUtils.testBit(this.__isset_bitfield, 11);
    }

    public boolean isSetSpan_days() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetSpell_score() {
        return EncodingUtils.testBit(this.__isset_bitfield, 8);
    }

    public boolean isSetTag_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 7);
    }

    public boolean isSetUsed_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetWord_topic_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetWrong_times() {
        return EncodingUtils.testBit(this.__isset_bitfield, 5);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserDoneWordRecord setChn_score(int chn_score) {
        this.chn_score = chn_score;
        setChn_scoreIsSet(true);
        return this;
    }

    public void setChn_scoreIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 10, value);
    }

    public UserDoneWordRecord setCurrent_score(int current_score) {
        this.current_score = current_score;
        setCurrent_scoreIsSet(true);
        return this;
    }

    public void setCurrent_scoreIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public UserDoneWordRecord setDone_times(int done_times) {
        this.done_times = done_times;
        setDone_timesIsSet(true);
        return this;
    }

    public void setDone_timesIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 4, value);
    }

    public UserDoneWordRecord setIs_first_do_at_today(int is_first_do_at_today) {
        this.is_first_do_at_today = is_first_do_at_today;
        setIs_first_do_at_todayIsSet(true);
        return this;
    }

    public void setIs_first_do_at_todayIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 6, value);
    }

    public UserDoneWordRecord setListening_score(int listening_score) {
        this.listening_score = listening_score;
        setListening_scoreIsSet(true);
        return this;
    }

    public void setListening_scoreIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 9, value);
    }

    public UserDoneWordRecord setReview_round(int review_round) {
        this.review_round = review_round;
        setReview_roundIsSet(true);
        return this;
    }

    public void setReview_roundIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 11, value);
    }

    public UserDoneWordRecord setSpan_days(int span_days) {
        this.span_days = span_days;
        setSpan_daysIsSet(true);
        return this;
    }

    public void setSpan_daysIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public UserDoneWordRecord setSpell_score(int spell_score) {
        this.spell_score = spell_score;
        setSpell_scoreIsSet(true);
        return this;
    }

    public void setSpell_scoreIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 8, value);
    }

    public UserDoneWordRecord setTag_id(int tag_id) {
        this.tag_id = tag_id;
        setTag_idIsSet(true);
        return this;
    }

    public void setTag_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 7, value);
    }

    public UserDoneWordRecord setUsed_time(int used_time) {
        this.used_time = used_time;
        setUsed_timeIsSet(true);
        return this;
    }

    public void setUsed_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public UserDoneWordRecord setWord_topic_id(int word_topic_id) {
        this.word_topic_id = word_topic_id;
        setWord_topic_idIsSet(true);
        return this;
    }

    public void setWord_topic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public UserDoneWordRecord setWrong_times(int wrong_times) {
        this.wrong_times = wrong_times;
        setWrong_timesIsSet(true);
        return this;
    }

    public void setWrong_timesIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 5, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserDoneWordRecord(");
        sb2.append("word_topic_id:");
        sb2.append(this.word_topic_id);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("current_score:");
        sb2.append(this.current_score);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("span_days:");
        sb2.append(this.span_days);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("used_time:");
        sb2.append(this.used_time);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("done_times:");
        sb2.append(this.done_times);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("wrong_times:");
        sb2.append(this.wrong_times);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("is_first_do_at_today:");
        sb2.append(this.is_first_do_at_today);
        if (isSetTag_id()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("tag_id:");
            sb2.append(this.tag_id);
        }
        if (isSetSpell_score()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("spell_score:");
            sb2.append(this.spell_score);
        }
        if (isSetListening_score()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("listening_score:");
            sb2.append(this.listening_score);
        }
        if (isSetChn_score()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("chn_score:");
            sb2.append(this.chn_score);
        }
        if (isSetReview_round()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("review_round:");
            sb2.append(this.review_round);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetChn_score() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 10);
    }

    public void unsetCurrent_score() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetDone_times() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 4);
    }

    public void unsetIs_first_do_at_today() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 6);
    }

    public void unsetListening_score() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 9);
    }

    public void unsetReview_round() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 11);
    }

    public void unsetSpan_days() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetSpell_score() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 8);
    }

    public void unsetTag_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 7);
    }

    public void unsetUsed_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetWord_topic_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetWrong_times() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 5);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(UserDoneWordRecord other) {
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
        int compareTo11;
        int compareTo12;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo13 = Boolean.valueOf(isSetWord_topic_id()).compareTo(Boolean.valueOf(other.isSetWord_topic_id()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetWord_topic_id() && (compareTo12 = TBaseHelper.compareTo(this.word_topic_id, other.word_topic_id)) != 0) {
            return compareTo12;
        }
        int compareTo14 = Boolean.valueOf(isSetCurrent_score()).compareTo(Boolean.valueOf(other.isSetCurrent_score()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (isSetCurrent_score() && (compareTo11 = TBaseHelper.compareTo(this.current_score, other.current_score)) != 0) {
            return compareTo11;
        }
        int compareTo15 = Boolean.valueOf(isSetSpan_days()).compareTo(Boolean.valueOf(other.isSetSpan_days()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (isSetSpan_days() && (compareTo10 = TBaseHelper.compareTo(this.span_days, other.span_days)) != 0) {
            return compareTo10;
        }
        int compareTo16 = Boolean.valueOf(isSetUsed_time()).compareTo(Boolean.valueOf(other.isSetUsed_time()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (isSetUsed_time() && (compareTo9 = TBaseHelper.compareTo(this.used_time, other.used_time)) != 0) {
            return compareTo9;
        }
        int compareTo17 = Boolean.valueOf(isSetDone_times()).compareTo(Boolean.valueOf(other.isSetDone_times()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (isSetDone_times() && (compareTo8 = TBaseHelper.compareTo(this.done_times, other.done_times)) != 0) {
            return compareTo8;
        }
        int compareTo18 = Boolean.valueOf(isSetWrong_times()).compareTo(Boolean.valueOf(other.isSetWrong_times()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (isSetWrong_times() && (compareTo7 = TBaseHelper.compareTo(this.wrong_times, other.wrong_times)) != 0) {
            return compareTo7;
        }
        int compareTo19 = Boolean.valueOf(isSetIs_first_do_at_today()).compareTo(Boolean.valueOf(other.isSetIs_first_do_at_today()));
        if (compareTo19 != 0) {
            return compareTo19;
        }
        if (isSetIs_first_do_at_today() && (compareTo6 = TBaseHelper.compareTo(this.is_first_do_at_today, other.is_first_do_at_today)) != 0) {
            return compareTo6;
        }
        int compareTo20 = Boolean.valueOf(isSetTag_id()).compareTo(Boolean.valueOf(other.isSetTag_id()));
        if (compareTo20 != 0) {
            return compareTo20;
        }
        if (isSetTag_id() && (compareTo5 = TBaseHelper.compareTo(this.tag_id, other.tag_id)) != 0) {
            return compareTo5;
        }
        int compareTo21 = Boolean.valueOf(isSetSpell_score()).compareTo(Boolean.valueOf(other.isSetSpell_score()));
        if (compareTo21 != 0) {
            return compareTo21;
        }
        if (isSetSpell_score() && (compareTo4 = TBaseHelper.compareTo(this.spell_score, other.spell_score)) != 0) {
            return compareTo4;
        }
        int compareTo22 = Boolean.valueOf(isSetListening_score()).compareTo(Boolean.valueOf(other.isSetListening_score()));
        if (compareTo22 != 0) {
            return compareTo22;
        }
        if (isSetListening_score() && (compareTo3 = TBaseHelper.compareTo(this.listening_score, other.listening_score)) != 0) {
            return compareTo3;
        }
        int compareTo23 = Boolean.valueOf(isSetChn_score()).compareTo(Boolean.valueOf(other.isSetChn_score()));
        if (compareTo23 != 0) {
            return compareTo23;
        }
        if (isSetChn_score() && (compareTo2 = TBaseHelper.compareTo(this.chn_score, other.chn_score)) != 0) {
            return compareTo2;
        }
        int compareTo24 = Boolean.valueOf(isSetReview_round()).compareTo(Boolean.valueOf(other.isSetReview_round()));
        if (compareTo24 != 0) {
            return compareTo24;
        }
        if (!isSetReview_round() || (compareTo = TBaseHelper.compareTo(this.review_round, other.review_round)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserDoneWordRecord, _Fields> deepCopy2() {
        return new UserDoneWordRecord(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserDoneWordRecord$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getWord_topic_id());
            case 2:
                return Integer.valueOf(getCurrent_score());
            case 3:
                return Integer.valueOf(getSpan_days());
            case 4:
                return Integer.valueOf(getUsed_time());
            case 5:
                return Integer.valueOf(getDone_times());
            case 6:
                return Integer.valueOf(getWrong_times());
            case 7:
                return Integer.valueOf(getIs_first_do_at_today());
            case 8:
                return Integer.valueOf(getTag_id());
            case 9:
                return Integer.valueOf(getSpell_score());
            case 10:
                return Integer.valueOf(getListening_score());
            case 11:
                return Integer.valueOf(getChn_score());
            case 12:
                return Integer.valueOf(getReview_round());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserDoneWordRecord$_Fields[field.ordinal()]) {
            case 1:
                return isSetWord_topic_id();
            case 2:
                return isSetCurrent_score();
            case 3:
                return isSetSpan_days();
            case 4:
                return isSetUsed_time();
            case 5:
                return isSetDone_times();
            case 6:
                return isSetWrong_times();
            case 7:
                return isSetIs_first_do_at_today();
            case 8:
                return isSetTag_id();
            case 9:
                return isSetSpell_score();
            case 10:
                return isSetListening_score();
            case 11:
                return isSetChn_score();
            case 12:
                return isSetReview_round();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserDoneWordRecord$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setWord_topic_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetWord_topic_id();
                    break;
                }
            case 2:
                if (value != null) {
                    setCurrent_score(((Integer) value).intValue());
                    break;
                } else {
                    unsetCurrent_score();
                    break;
                }
            case 3:
                if (value != null) {
                    setSpan_days(((Integer) value).intValue());
                    break;
                } else {
                    unsetSpan_days();
                    break;
                }
            case 4:
                if (value != null) {
                    setUsed_time(((Integer) value).intValue());
                    break;
                } else {
                    unsetUsed_time();
                    break;
                }
            case 5:
                if (value != null) {
                    setDone_times(((Integer) value).intValue());
                    break;
                } else {
                    unsetDone_times();
                    break;
                }
            case 6:
                if (value != null) {
                    setWrong_times(((Integer) value).intValue());
                    break;
                } else {
                    unsetWrong_times();
                    break;
                }
            case 7:
                if (value != null) {
                    setIs_first_do_at_today(((Integer) value).intValue());
                    break;
                } else {
                    unsetIs_first_do_at_today();
                    break;
                }
            case 8:
                if (value != null) {
                    setTag_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetTag_id();
                    break;
                }
            case 9:
                if (value != null) {
                    setSpell_score(((Integer) value).intValue());
                    break;
                } else {
                    unsetSpell_score();
                    break;
                }
            case 10:
                if (value != null) {
                    setListening_score(((Integer) value).intValue());
                    break;
                } else {
                    unsetListening_score();
                    break;
                }
            case 11:
                if (value != null) {
                    setChn_score(((Integer) value).intValue());
                    break;
                } else {
                    unsetChn_score();
                    break;
                }
            case 12:
                if (value != null) {
                    setReview_round(((Integer) value).intValue());
                    break;
                } else {
                    unsetReview_round();
                    break;
                }
        }
    }

    public boolean equals(UserDoneWordRecord that) {
        if (that == null || this.word_topic_id != that.word_topic_id || this.current_score != that.current_score || this.span_days != that.span_days || this.used_time != that.used_time || this.done_times != that.done_times || this.wrong_times != that.wrong_times || this.is_first_do_at_today != that.is_first_do_at_today) {
            return false;
        }
        boolean isSetTag_id = isSetTag_id();
        boolean isSetTag_id2 = that.isSetTag_id();
        if ((isSetTag_id || isSetTag_id2) && !(isSetTag_id && isSetTag_id2 && this.tag_id == that.tag_id)) {
            return false;
        }
        boolean isSetSpell_score = isSetSpell_score();
        boolean isSetSpell_score2 = that.isSetSpell_score();
        if ((isSetSpell_score || isSetSpell_score2) && !(isSetSpell_score && isSetSpell_score2 && this.spell_score == that.spell_score)) {
            return false;
        }
        boolean isSetListening_score = isSetListening_score();
        boolean isSetListening_score2 = that.isSetListening_score();
        if ((isSetListening_score || isSetListening_score2) && !(isSetListening_score && isSetListening_score2 && this.listening_score == that.listening_score)) {
            return false;
        }
        boolean isSetChn_score = isSetChn_score();
        boolean isSetChn_score2 = that.isSetChn_score();
        if ((isSetChn_score || isSetChn_score2) && !(isSetChn_score && isSetChn_score2 && this.chn_score == that.chn_score)) {
            return false;
        }
        boolean isSetReview_round = isSetReview_round();
        boolean isSetReview_round2 = that.isSetReview_round();
        if (isSetReview_round || isSetReview_round2) {
            return isSetReview_round && isSetReview_round2 && this.review_round == that.review_round;
        }
        return true;
    }

    public UserDoneWordRecord(int word_topic_id, int current_score, int span_days, int used_time, int done_times, int wrong_times, int is_first_do_at_today) {
        this();
        this.word_topic_id = word_topic_id;
        setWord_topic_idIsSet(true);
        this.current_score = current_score;
        setCurrent_scoreIsSet(true);
        this.span_days = span_days;
        setSpan_daysIsSet(true);
        this.used_time = used_time;
        setUsed_timeIsSet(true);
        this.done_times = done_times;
        setDone_timesIsSet(true);
        this.wrong_times = wrong_times;
        setWrong_timesIsSet(true);
        this.is_first_do_at_today = is_first_do_at_today;
        setIs_first_do_at_todayIsSet(true);
    }

    public void validate() throws TException {
    }

    public UserDoneWordRecord(UserDoneWordRecord other) {
        this.__isset_bitfield = (short) 0;
        this.optionals = new _Fields[]{_Fields.TAG_ID, _Fields.SPELL_SCORE, _Fields.LISTENING_SCORE, _Fields.CHN_SCORE, _Fields.REVIEW_ROUND};
        this.__isset_bitfield = other.__isset_bitfield;
        this.word_topic_id = other.word_topic_id;
        this.current_score = other.current_score;
        this.span_days = other.span_days;
        this.used_time = other.used_time;
        this.done_times = other.done_times;
        this.wrong_times = other.wrong_times;
        this.is_first_do_at_today = other.is_first_do_at_today;
        this.tag_id = other.tag_id;
        this.spell_score = other.spell_score;
        this.listening_score = other.listening_score;
        this.chn_score = other.chn_score;
        this.review_round = other.review_round;
    }
}
