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
public class UserLearnedWordInfo implements TBase<UserLearnedWordInfo, _Fields>, Serializable, Cloneable, Comparable<UserLearnedWordInfo> {
    private static final int __CHN_SCORE_ISSET_ID = 10;
    private static final int __CREATED_AT_ISSET_ID = 7;
    private static final int __DONE_TIMES_ISSET_ID = 4;
    private static final int __LISTENING_SCORE_ISSET_ID = 9;
    private static final int __REVIEW_ROUND_ISSET_ID = 11;
    private static final int __SCORE_ISSET_ID = 1;
    private static final int __SPAN_DAYS_ISSET_ID = 5;
    private static final int __SPELL_SCORE_ISSET_ID = 8;
    private static final int __TOPIC_ID_ISSET_ID = 0;
    private static final int __UPDATE_DAYS_ISSET_ID = 6;
    private static final int __USED_TIME_ISSET_ID = 2;
    private static final int __WRONG_TIMES_ISSET_ID = 3;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private short __isset_bitfield;
    public int chn_score;
    public long created_at;
    public int done_times;
    public int listening_score;
    private _Fields[] optionals;
    public int review_round;
    public int score;
    public int span_days;
    public int spell_score;
    public int topic_id;
    public int update_days;
    public int used_time;
    public int wrong_times;
    private static final TStruct STRUCT_DESC = new TStruct("UserLearnedWordInfo");
    private static final TField TOPIC_ID_FIELD_DESC = new TField("topic_id", (byte) 8, 1);
    private static final TField SCORE_FIELD_DESC = new TField(a.b.C0242a.f16107c, (byte) 8, 2);
    private static final TField USED_TIME_FIELD_DESC = new TField("used_time", (byte) 8, 3);
    private static final TField WRONG_TIMES_FIELD_DESC = new TField("wrong_times", (byte) 8, 4);
    private static final TField DONE_TIMES_FIELD_DESC = new TField("done_times", (byte) 8, 5);
    private static final TField SPAN_DAYS_FIELD_DESC = new TField("span_days", (byte) 8, 6);
    private static final TField UPDATE_DAYS_FIELD_DESC = new TField("update_days", (byte) 8, 7);
    private static final TField CREATED_AT_FIELD_DESC = new TField("created_at", (byte) 10, 8);
    private static final TField SPELL_SCORE_FIELD_DESC = new TField("spell_score", (byte) 8, 9);
    private static final TField LISTENING_SCORE_FIELD_DESC = new TField("listening_score", (byte) 8, 10);
    private static final TField CHN_SCORE_FIELD_DESC = new TField("chn_score", (byte) 8, 11);
    private static final TField REVIEW_ROUND_FIELD_DESC = new TField("review_round", (byte) 8, 12);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.UserLearnedWordInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$UserLearnedWordInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$UserLearnedWordInfo$_Fields = iArr;
            try {
                iArr[_Fields.TOPIC_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLearnedWordInfo$_Fields[_Fields.SCORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLearnedWordInfo$_Fields[_Fields.USED_TIME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLearnedWordInfo$_Fields[_Fields.WRONG_TIMES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLearnedWordInfo$_Fields[_Fields.DONE_TIMES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLearnedWordInfo$_Fields[_Fields.SPAN_DAYS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLearnedWordInfo$_Fields[_Fields.UPDATE_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLearnedWordInfo$_Fields[_Fields.CREATED_AT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLearnedWordInfo$_Fields[_Fields.SPELL_SCORE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLearnedWordInfo$_Fields[_Fields.LISTENING_SCORE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLearnedWordInfo$_Fields[_Fields.CHN_SCORE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLearnedWordInfo$_Fields[_Fields.REVIEW_ROUND.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserLearnedWordInfoStandardScheme extends StandardScheme<UserLearnedWordInfo> {
        private UserLearnedWordInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserLearnedWordInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (struct.isSetTopic_id()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'topic_id' was not found in serialized data! Struct: " + toString());
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
                            struct.score = iprot.readI32();
                            struct.setScoreIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.used_time = iprot.readI32();
                            struct.setUsed_timeIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.wrong_times = iprot.readI32();
                            struct.setWrong_timesIsSet(true);
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
                            struct.span_days = iprot.readI32();
                            struct.setSpan_daysIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.update_days = iprot.readI32();
                            struct.setUpdate_daysIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.created_at = iprot.readI64();
                            struct.setCreated_atIsSet(true);
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
        public void write(TProtocol oprot, UserLearnedWordInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserLearnedWordInfo.STRUCT_DESC);
            oprot.writeFieldBegin(UserLearnedWordInfo.TOPIC_ID_FIELD_DESC);
            oprot.writeI32(struct.topic_id);
            oprot.writeFieldEnd();
            if (struct.isSetScore()) {
                oprot.writeFieldBegin(UserLearnedWordInfo.SCORE_FIELD_DESC);
                oprot.writeI32(struct.score);
                oprot.writeFieldEnd();
            }
            if (struct.isSetUsed_time()) {
                oprot.writeFieldBegin(UserLearnedWordInfo.USED_TIME_FIELD_DESC);
                oprot.writeI32(struct.used_time);
                oprot.writeFieldEnd();
            }
            if (struct.isSetWrong_times()) {
                oprot.writeFieldBegin(UserLearnedWordInfo.WRONG_TIMES_FIELD_DESC);
                oprot.writeI32(struct.wrong_times);
                oprot.writeFieldEnd();
            }
            if (struct.isSetDone_times()) {
                oprot.writeFieldBegin(UserLearnedWordInfo.DONE_TIMES_FIELD_DESC);
                oprot.writeI32(struct.done_times);
                oprot.writeFieldEnd();
            }
            if (struct.isSetSpan_days()) {
                oprot.writeFieldBegin(UserLearnedWordInfo.SPAN_DAYS_FIELD_DESC);
                oprot.writeI32(struct.span_days);
                oprot.writeFieldEnd();
            }
            if (struct.isSetUpdate_days()) {
                oprot.writeFieldBegin(UserLearnedWordInfo.UPDATE_DAYS_FIELD_DESC);
                oprot.writeI32(struct.update_days);
                oprot.writeFieldEnd();
            }
            if (struct.isSetCreated_at()) {
                oprot.writeFieldBegin(UserLearnedWordInfo.CREATED_AT_FIELD_DESC);
                oprot.writeI64(struct.created_at);
                oprot.writeFieldEnd();
            }
            if (struct.isSetSpell_score()) {
                oprot.writeFieldBegin(UserLearnedWordInfo.SPELL_SCORE_FIELD_DESC);
                oprot.writeI32(struct.spell_score);
                oprot.writeFieldEnd();
            }
            if (struct.isSetListening_score()) {
                oprot.writeFieldBegin(UserLearnedWordInfo.LISTENING_SCORE_FIELD_DESC);
                oprot.writeI32(struct.listening_score);
                oprot.writeFieldEnd();
            }
            if (struct.isSetChn_score()) {
                oprot.writeFieldBegin(UserLearnedWordInfo.CHN_SCORE_FIELD_DESC);
                oprot.writeI32(struct.chn_score);
                oprot.writeFieldEnd();
            }
            if (struct.isSetReview_round()) {
                oprot.writeFieldBegin(UserLearnedWordInfo.REVIEW_ROUND_FIELD_DESC);
                oprot.writeI32(struct.review_round);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserLearnedWordInfoStandardSchemeFactory implements SchemeFactory {
        private UserLearnedWordInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserLearnedWordInfoStandardScheme getScheme() {
            return new UserLearnedWordInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserLearnedWordInfoTupleScheme extends TupleScheme<UserLearnedWordInfo> {
        private UserLearnedWordInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserLearnedWordInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.topic_id = tTupleProtocol.readI32();
            struct.setTopic_idIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(11);
            if (readBitSet.get(0)) {
                struct.score = tTupleProtocol.readI32();
                struct.setScoreIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.used_time = tTupleProtocol.readI32();
                struct.setUsed_timeIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.wrong_times = tTupleProtocol.readI32();
                struct.setWrong_timesIsSet(true);
            }
            if (readBitSet.get(3)) {
                struct.done_times = tTupleProtocol.readI32();
                struct.setDone_timesIsSet(true);
            }
            if (readBitSet.get(4)) {
                struct.span_days = tTupleProtocol.readI32();
                struct.setSpan_daysIsSet(true);
            }
            if (readBitSet.get(5)) {
                struct.update_days = tTupleProtocol.readI32();
                struct.setUpdate_daysIsSet(true);
            }
            if (readBitSet.get(6)) {
                struct.created_at = tTupleProtocol.readI64();
                struct.setCreated_atIsSet(true);
            }
            if (readBitSet.get(7)) {
                struct.spell_score = tTupleProtocol.readI32();
                struct.setSpell_scoreIsSet(true);
            }
            if (readBitSet.get(8)) {
                struct.listening_score = tTupleProtocol.readI32();
                struct.setListening_scoreIsSet(true);
            }
            if (readBitSet.get(9)) {
                struct.chn_score = tTupleProtocol.readI32();
                struct.setChn_scoreIsSet(true);
            }
            if (readBitSet.get(10)) {
                struct.review_round = tTupleProtocol.readI32();
                struct.setReview_roundIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserLearnedWordInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.topic_id);
            BitSet bitSet = new BitSet();
            if (struct.isSetScore()) {
                bitSet.set(0);
            }
            if (struct.isSetUsed_time()) {
                bitSet.set(1);
            }
            if (struct.isSetWrong_times()) {
                bitSet.set(2);
            }
            if (struct.isSetDone_times()) {
                bitSet.set(3);
            }
            if (struct.isSetSpan_days()) {
                bitSet.set(4);
            }
            if (struct.isSetUpdate_days()) {
                bitSet.set(5);
            }
            if (struct.isSetCreated_at()) {
                bitSet.set(6);
            }
            if (struct.isSetSpell_score()) {
                bitSet.set(7);
            }
            if (struct.isSetListening_score()) {
                bitSet.set(8);
            }
            if (struct.isSetChn_score()) {
                bitSet.set(9);
            }
            if (struct.isSetReview_round()) {
                bitSet.set(10);
            }
            tTupleProtocol.writeBitSet(bitSet, 11);
            if (struct.isSetScore()) {
                tTupleProtocol.writeI32(struct.score);
            }
            if (struct.isSetUsed_time()) {
                tTupleProtocol.writeI32(struct.used_time);
            }
            if (struct.isSetWrong_times()) {
                tTupleProtocol.writeI32(struct.wrong_times);
            }
            if (struct.isSetDone_times()) {
                tTupleProtocol.writeI32(struct.done_times);
            }
            if (struct.isSetSpan_days()) {
                tTupleProtocol.writeI32(struct.span_days);
            }
            if (struct.isSetUpdate_days()) {
                tTupleProtocol.writeI32(struct.update_days);
            }
            if (struct.isSetCreated_at()) {
                tTupleProtocol.writeI64(struct.created_at);
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
    public static class UserLearnedWordInfoTupleSchemeFactory implements SchemeFactory {
        private UserLearnedWordInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserLearnedWordInfoTupleScheme getScheme() {
            return new UserLearnedWordInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TOPIC_ID(1, "topic_id"),
        SCORE(2, a.b.C0242a.f16107c),
        USED_TIME(3, "used_time"),
        WRONG_TIMES(4, "wrong_times"),
        DONE_TIMES(5, "done_times"),
        SPAN_DAYS(6, "span_days"),
        UPDATE_DAYS(7, "update_days"),
        CREATED_AT(8, "created_at"),
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
                    return TOPIC_ID;
                case 2:
                    return SCORE;
                case 3:
                    return USED_TIME;
                case 4:
                    return WRONG_TIMES;
                case 5:
                    return DONE_TIMES;
                case 6:
                    return SPAN_DAYS;
                case 7:
                    return UPDATE_DAYS;
                case 8:
                    return CREATED_AT;
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
        hashMap.put(StandardScheme.class, new UserLearnedWordInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserLearnedWordInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TOPIC_ID, (_Fields) new FieldMetaData("topic_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.SCORE, (_Fields) new FieldMetaData(a.b.C0242a.f16107c, (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.USED_TIME, (_Fields) new FieldMetaData("used_time", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.WRONG_TIMES, (_Fields) new FieldMetaData("wrong_times", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.DONE_TIMES, (_Fields) new FieldMetaData("done_times", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.SPAN_DAYS, (_Fields) new FieldMetaData("span_days", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.UPDATE_DAYS, (_Fields) new FieldMetaData("update_days", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.CREATED_AT, (_Fields) new FieldMetaData("created_at", (byte) 2, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.SPELL_SCORE, (_Fields) new FieldMetaData("spell_score", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.LISTENING_SCORE, (_Fields) new FieldMetaData("listening_score", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.CHN_SCORE, (_Fields) new FieldMetaData("chn_score", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.REVIEW_ROUND, (_Fields) new FieldMetaData("review_round", (byte) 2, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserLearnedWordInfo.class, unmodifiableMap);
    }

    public UserLearnedWordInfo() {
        this.__isset_bitfield = (short) 0;
        this.optionals = new _Fields[]{_Fields.SCORE, _Fields.USED_TIME, _Fields.WRONG_TIMES, _Fields.DONE_TIMES, _Fields.SPAN_DAYS, _Fields.UPDATE_DAYS, _Fields.CREATED_AT, _Fields.SPELL_SCORE, _Fields.LISTENING_SCORE, _Fields.CHN_SCORE, _Fields.REVIEW_ROUND};
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
        setScoreIsSet(false);
        this.score = 0;
        setUsed_timeIsSet(false);
        this.used_time = 0;
        setWrong_timesIsSet(false);
        this.wrong_times = 0;
        setDone_timesIsSet(false);
        this.done_times = 0;
        setSpan_daysIsSet(false);
        this.span_days = 0;
        setUpdate_daysIsSet(false);
        this.update_days = 0;
        setCreated_atIsSet(false);
        this.created_at = 0L;
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
        if (that != null && (that instanceof UserLearnedWordInfo)) {
            return equals((UserLearnedWordInfo) that);
        }
        return false;
    }

    public int getChn_score() {
        return this.chn_score;
    }

    public long getCreated_at() {
        return this.created_at;
    }

    public int getDone_times() {
        return this.done_times;
    }

    public int getListening_score() {
        return this.listening_score;
    }

    public int getReview_round() {
        return this.review_round;
    }

    public int getScore() {
        return this.score;
    }

    public int getSpan_days() {
        return this.span_days;
    }

    public int getSpell_score() {
        return this.spell_score;
    }

    public int getTopic_id() {
        return this.topic_id;
    }

    public int getUpdate_days() {
        return this.update_days;
    }

    public int getUsed_time() {
        return this.used_time;
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

    public boolean isSetCreated_at() {
        return EncodingUtils.testBit(this.__isset_bitfield, 7);
    }

    public boolean isSetDone_times() {
        return EncodingUtils.testBit(this.__isset_bitfield, 4);
    }

    public boolean isSetListening_score() {
        return EncodingUtils.testBit(this.__isset_bitfield, 9);
    }

    public boolean isSetReview_round() {
        return EncodingUtils.testBit(this.__isset_bitfield, 11);
    }

    public boolean isSetScore() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetSpan_days() {
        return EncodingUtils.testBit(this.__isset_bitfield, 5);
    }

    public boolean isSetSpell_score() {
        return EncodingUtils.testBit(this.__isset_bitfield, 8);
    }

    public boolean isSetTopic_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetUpdate_days() {
        return EncodingUtils.testBit(this.__isset_bitfield, 6);
    }

    public boolean isSetUsed_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetWrong_times() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserLearnedWordInfo setChn_score(int chn_score) {
        this.chn_score = chn_score;
        setChn_scoreIsSet(true);
        return this;
    }

    public void setChn_scoreIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 10, value);
    }

    public UserLearnedWordInfo setCreated_at(long created_at) {
        this.created_at = created_at;
        setCreated_atIsSet(true);
        return this;
    }

    public void setCreated_atIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 7, value);
    }

    public UserLearnedWordInfo setDone_times(int done_times) {
        this.done_times = done_times;
        setDone_timesIsSet(true);
        return this;
    }

    public void setDone_timesIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 4, value);
    }

    public UserLearnedWordInfo setListening_score(int listening_score) {
        this.listening_score = listening_score;
        setListening_scoreIsSet(true);
        return this;
    }

    public void setListening_scoreIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 9, value);
    }

    public UserLearnedWordInfo setReview_round(int review_round) {
        this.review_round = review_round;
        setReview_roundIsSet(true);
        return this;
    }

    public void setReview_roundIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 11, value);
    }

    public UserLearnedWordInfo setScore(int score) {
        this.score = score;
        setScoreIsSet(true);
        return this;
    }

    public void setScoreIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public UserLearnedWordInfo setSpan_days(int span_days) {
        this.span_days = span_days;
        setSpan_daysIsSet(true);
        return this;
    }

    public void setSpan_daysIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 5, value);
    }

    public UserLearnedWordInfo setSpell_score(int spell_score) {
        this.spell_score = spell_score;
        setSpell_scoreIsSet(true);
        return this;
    }

    public void setSpell_scoreIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 8, value);
    }

    public UserLearnedWordInfo setTopic_id(int topic_id) {
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        return this;
    }

    public void setTopic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public UserLearnedWordInfo setUpdate_days(int update_days) {
        this.update_days = update_days;
        setUpdate_daysIsSet(true);
        return this;
    }

    public void setUpdate_daysIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 6, value);
    }

    public UserLearnedWordInfo setUsed_time(int used_time) {
        this.used_time = used_time;
        setUsed_timeIsSet(true);
        return this;
    }

    public void setUsed_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public UserLearnedWordInfo setWrong_times(int wrong_times) {
        this.wrong_times = wrong_times;
        setWrong_timesIsSet(true);
        return this;
    }

    public void setWrong_timesIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserLearnedWordInfo(");
        sb2.append("topic_id:");
        sb2.append(this.topic_id);
        if (isSetScore()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("score:");
            sb2.append(this.score);
        }
        if (isSetUsed_time()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("used_time:");
            sb2.append(this.used_time);
        }
        if (isSetWrong_times()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("wrong_times:");
            sb2.append(this.wrong_times);
        }
        if (isSetDone_times()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("done_times:");
            sb2.append(this.done_times);
        }
        if (isSetSpan_days()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("span_days:");
            sb2.append(this.span_days);
        }
        if (isSetUpdate_days()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("update_days:");
            sb2.append(this.update_days);
        }
        if (isSetCreated_at()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("created_at:");
            sb2.append(this.created_at);
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

    public void unsetCreated_at() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 7);
    }

    public void unsetDone_times() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 4);
    }

    public void unsetListening_score() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 9);
    }

    public void unsetReview_round() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 11);
    }

    public void unsetScore() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetSpan_days() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 5);
    }

    public void unsetSpell_score() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 8);
    }

    public void unsetTopic_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetUpdate_days() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 6);
    }

    public void unsetUsed_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetWrong_times() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(UserLearnedWordInfo other) {
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
        int compareTo13 = Boolean.valueOf(isSetTopic_id()).compareTo(Boolean.valueOf(other.isSetTopic_id()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetTopic_id() && (compareTo12 = TBaseHelper.compareTo(this.topic_id, other.topic_id)) != 0) {
            return compareTo12;
        }
        int compareTo14 = Boolean.valueOf(isSetScore()).compareTo(Boolean.valueOf(other.isSetScore()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (isSetScore() && (compareTo11 = TBaseHelper.compareTo(this.score, other.score)) != 0) {
            return compareTo11;
        }
        int compareTo15 = Boolean.valueOf(isSetUsed_time()).compareTo(Boolean.valueOf(other.isSetUsed_time()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (isSetUsed_time() && (compareTo10 = TBaseHelper.compareTo(this.used_time, other.used_time)) != 0) {
            return compareTo10;
        }
        int compareTo16 = Boolean.valueOf(isSetWrong_times()).compareTo(Boolean.valueOf(other.isSetWrong_times()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (isSetWrong_times() && (compareTo9 = TBaseHelper.compareTo(this.wrong_times, other.wrong_times)) != 0) {
            return compareTo9;
        }
        int compareTo17 = Boolean.valueOf(isSetDone_times()).compareTo(Boolean.valueOf(other.isSetDone_times()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (isSetDone_times() && (compareTo8 = TBaseHelper.compareTo(this.done_times, other.done_times)) != 0) {
            return compareTo8;
        }
        int compareTo18 = Boolean.valueOf(isSetSpan_days()).compareTo(Boolean.valueOf(other.isSetSpan_days()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (isSetSpan_days() && (compareTo7 = TBaseHelper.compareTo(this.span_days, other.span_days)) != 0) {
            return compareTo7;
        }
        int compareTo19 = Boolean.valueOf(isSetUpdate_days()).compareTo(Boolean.valueOf(other.isSetUpdate_days()));
        if (compareTo19 != 0) {
            return compareTo19;
        }
        if (isSetUpdate_days() && (compareTo6 = TBaseHelper.compareTo(this.update_days, other.update_days)) != 0) {
            return compareTo6;
        }
        int compareTo20 = Boolean.valueOf(isSetCreated_at()).compareTo(Boolean.valueOf(other.isSetCreated_at()));
        if (compareTo20 != 0) {
            return compareTo20;
        }
        if (isSetCreated_at() && (compareTo5 = TBaseHelper.compareTo(this.created_at, other.created_at)) != 0) {
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
    public TBase<UserLearnedWordInfo, _Fields> deepCopy2() {
        return new UserLearnedWordInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserLearnedWordInfo$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getTopic_id());
            case 2:
                return Integer.valueOf(getScore());
            case 3:
                return Integer.valueOf(getUsed_time());
            case 4:
                return Integer.valueOf(getWrong_times());
            case 5:
                return Integer.valueOf(getDone_times());
            case 6:
                return Integer.valueOf(getSpan_days());
            case 7:
                return Integer.valueOf(getUpdate_days());
            case 8:
                return Long.valueOf(getCreated_at());
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
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserLearnedWordInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetTopic_id();
            case 2:
                return isSetScore();
            case 3:
                return isSetUsed_time();
            case 4:
                return isSetWrong_times();
            case 5:
                return isSetDone_times();
            case 6:
                return isSetSpan_days();
            case 7:
                return isSetUpdate_days();
            case 8:
                return isSetCreated_at();
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
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserLearnedWordInfo$_Fields[field.ordinal()]) {
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
                    setScore(((Integer) value).intValue());
                    break;
                } else {
                    unsetScore();
                    break;
                }
            case 3:
                if (value != null) {
                    setUsed_time(((Integer) value).intValue());
                    break;
                } else {
                    unsetUsed_time();
                    break;
                }
            case 4:
                if (value != null) {
                    setWrong_times(((Integer) value).intValue());
                    break;
                } else {
                    unsetWrong_times();
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
                    setSpan_days(((Integer) value).intValue());
                    break;
                } else {
                    unsetSpan_days();
                    break;
                }
            case 7:
                if (value != null) {
                    setUpdate_days(((Integer) value).intValue());
                    break;
                } else {
                    unsetUpdate_days();
                    break;
                }
            case 8:
                if (value != null) {
                    setCreated_at(((Long) value).longValue());
                    break;
                } else {
                    unsetCreated_at();
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

    public boolean equals(UserLearnedWordInfo that) {
        if (that == null || this.topic_id != that.topic_id) {
            return false;
        }
        boolean isSetScore = isSetScore();
        boolean isSetScore2 = that.isSetScore();
        if ((isSetScore || isSetScore2) && !(isSetScore && isSetScore2 && this.score == that.score)) {
            return false;
        }
        boolean isSetUsed_time = isSetUsed_time();
        boolean isSetUsed_time2 = that.isSetUsed_time();
        if ((isSetUsed_time || isSetUsed_time2) && !(isSetUsed_time && isSetUsed_time2 && this.used_time == that.used_time)) {
            return false;
        }
        boolean isSetWrong_times = isSetWrong_times();
        boolean isSetWrong_times2 = that.isSetWrong_times();
        if ((isSetWrong_times || isSetWrong_times2) && !(isSetWrong_times && isSetWrong_times2 && this.wrong_times == that.wrong_times)) {
            return false;
        }
        boolean isSetDone_times = isSetDone_times();
        boolean isSetDone_times2 = that.isSetDone_times();
        if ((isSetDone_times || isSetDone_times2) && !(isSetDone_times && isSetDone_times2 && this.done_times == that.done_times)) {
            return false;
        }
        boolean isSetSpan_days = isSetSpan_days();
        boolean isSetSpan_days2 = that.isSetSpan_days();
        if ((isSetSpan_days || isSetSpan_days2) && !(isSetSpan_days && isSetSpan_days2 && this.span_days == that.span_days)) {
            return false;
        }
        boolean isSetUpdate_days = isSetUpdate_days();
        boolean isSetUpdate_days2 = that.isSetUpdate_days();
        if ((isSetUpdate_days || isSetUpdate_days2) && !(isSetUpdate_days && isSetUpdate_days2 && this.update_days == that.update_days)) {
            return false;
        }
        boolean isSetCreated_at = isSetCreated_at();
        boolean isSetCreated_at2 = that.isSetCreated_at();
        if ((isSetCreated_at || isSetCreated_at2) && !(isSetCreated_at && isSetCreated_at2 && this.created_at == that.created_at)) {
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

    public UserLearnedWordInfo(int topic_id) {
        this();
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
    }

    public UserLearnedWordInfo(UserLearnedWordInfo other) {
        this.__isset_bitfield = (short) 0;
        this.optionals = new _Fields[]{_Fields.SCORE, _Fields.USED_TIME, _Fields.WRONG_TIMES, _Fields.DONE_TIMES, _Fields.SPAN_DAYS, _Fields.UPDATE_DAYS, _Fields.CREATED_AT, _Fields.SPELL_SCORE, _Fields.LISTENING_SCORE, _Fields.CHN_SCORE, _Fields.REVIEW_ROUND};
        this.__isset_bitfield = other.__isset_bitfield;
        this.topic_id = other.topic_id;
        this.score = other.score;
        this.used_time = other.used_time;
        this.wrong_times = other.wrong_times;
        this.done_times = other.done_times;
        this.span_days = other.span_days;
        this.update_days = other.update_days;
        this.created_at = other.created_at;
        this.spell_score = other.spell_score;
        this.listening_score = other.listening_score;
        this.chn_score = other.chn_score;
        this.review_round = other.review_round;
    }

    public void validate() throws TException {
    }
}
