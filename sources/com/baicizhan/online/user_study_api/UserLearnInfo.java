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
public class UserLearnInfo implements TBase<UserLearnInfo, _Fields>, Serializable, Cloneable, Comparable<UserLearnInfo> {
    private static final int __COLLECT_WORDS_UPDATED_AT_ISSET_ID = 5;
    private static final int __DAILY_PLAN_COUNT_ISSET_ID = 8;
    private static final int __INTEGRATION_VOCAB_COUNT_ISSET_ID = 7;
    private static final int __LAST_DAKA_AT_ISSET_ID = 2;
    private static final int __LAST_SYNC_DONE_SCORE_TIME_ISSET_ID = 0;
    private static final int __LATEST_FINISHED_DATE_ISSET_ID = 4;
    private static final int __LISTENING_VOCAB_COUNT_ISSET_ID = 6;
    private static final int __REVIEW_PLAN_COUNT_ISSET_ID = 9;
    private static final int __TOTAL_DAKA_DAYS_ISSET_ID = 1;
    private static final int __VOCAB_COUNT_ISSET_ID = 3;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private short __isset_bitfield;
    public long collect_words_updated_at;
    public int daily_plan_count;
    public int integration_vocab_count;
    public long last_daka_at;
    public long last_sync_done_score_time;
    public long latest_finished_date;
    public int listening_vocab_count;
    private _Fields[] optionals;
    public int review_plan_count;
    public int total_daka_days;
    public int vocab_count;
    private static final TStruct STRUCT_DESC = new TStruct("UserLearnInfo");
    private static final TField LAST_SYNC_DONE_SCORE_TIME_FIELD_DESC = new TField("last_sync_done_score_time", (byte) 10, 1);
    private static final TField TOTAL_DAKA_DAYS_FIELD_DESC = new TField("total_daka_days", (byte) 8, 2);
    private static final TField LAST_DAKA_AT_FIELD_DESC = new TField("last_daka_at", (byte) 10, 3);
    private static final TField VOCAB_COUNT_FIELD_DESC = new TField("vocab_count", (byte) 8, 4);
    private static final TField LATEST_FINISHED_DATE_FIELD_DESC = new TField("latest_finished_date", (byte) 10, 5);
    private static final TField COLLECT_WORDS_UPDATED_AT_FIELD_DESC = new TField("collect_words_updated_at", (byte) 10, 6);
    private static final TField LISTENING_VOCAB_COUNT_FIELD_DESC = new TField("listening_vocab_count", (byte) 8, 7);
    private static final TField INTEGRATION_VOCAB_COUNT_FIELD_DESC = new TField("integration_vocab_count", (byte) 8, 8);
    private static final TField DAILY_PLAN_COUNT_FIELD_DESC = new TField("daily_plan_count", (byte) 8, 9);
    private static final TField REVIEW_PLAN_COUNT_FIELD_DESC = new TField("review_plan_count", (byte) 8, 10);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.UserLearnInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$UserLearnInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$UserLearnInfo$_Fields = iArr;
            try {
                iArr[_Fields.LAST_SYNC_DONE_SCORE_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLearnInfo$_Fields[_Fields.TOTAL_DAKA_DAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLearnInfo$_Fields[_Fields.LAST_DAKA_AT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLearnInfo$_Fields[_Fields.VOCAB_COUNT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLearnInfo$_Fields[_Fields.LATEST_FINISHED_DATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLearnInfo$_Fields[_Fields.COLLECT_WORDS_UPDATED_AT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLearnInfo$_Fields[_Fields.LISTENING_VOCAB_COUNT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLearnInfo$_Fields[_Fields.INTEGRATION_VOCAB_COUNT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLearnInfo$_Fields[_Fields.DAILY_PLAN_COUNT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLearnInfo$_Fields[_Fields.REVIEW_PLAN_COUNT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserLearnInfoStandardScheme extends StandardScheme<UserLearnInfo> {
        private UserLearnInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserLearnInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetLast_sync_done_score_time()) {
                        throw new TProtocolException("Required field 'last_sync_done_score_time' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetTotal_daka_days()) {
                        throw new TProtocolException("Required field 'total_daka_days' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetLast_daka_at()) {
                        throw new TProtocolException("Required field 'last_daka_at' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetVocab_count()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'vocab_count' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.last_sync_done_score_time = iprot.readI64();
                            struct.setLast_sync_done_score_timeIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.total_daka_days = iprot.readI32();
                            struct.setTotal_daka_daysIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.last_daka_at = iprot.readI64();
                            struct.setLast_daka_atIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.vocab_count = iprot.readI32();
                            struct.setVocab_countIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.latest_finished_date = iprot.readI64();
                            struct.setLatest_finished_dateIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.collect_words_updated_at = iprot.readI64();
                            struct.setCollect_words_updated_atIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.listening_vocab_count = iprot.readI32();
                            struct.setListening_vocab_countIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.integration_vocab_count = iprot.readI32();
                            struct.setIntegration_vocab_countIsSet(true);
                            break;
                        }
                    case 9:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.daily_plan_count = iprot.readI32();
                            struct.setDaily_plan_countIsSet(true);
                            break;
                        }
                    case 10:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.review_plan_count = iprot.readI32();
                            struct.setReview_plan_countIsSet(true);
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
        public void write(TProtocol oprot, UserLearnInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserLearnInfo.STRUCT_DESC);
            oprot.writeFieldBegin(UserLearnInfo.LAST_SYNC_DONE_SCORE_TIME_FIELD_DESC);
            oprot.writeI64(struct.last_sync_done_score_time);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserLearnInfo.TOTAL_DAKA_DAYS_FIELD_DESC);
            oprot.writeI32(struct.total_daka_days);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserLearnInfo.LAST_DAKA_AT_FIELD_DESC);
            oprot.writeI64(struct.last_daka_at);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserLearnInfo.VOCAB_COUNT_FIELD_DESC);
            oprot.writeI32(struct.vocab_count);
            oprot.writeFieldEnd();
            if (struct.isSetLatest_finished_date()) {
                oprot.writeFieldBegin(UserLearnInfo.LATEST_FINISHED_DATE_FIELD_DESC);
                oprot.writeI64(struct.latest_finished_date);
                oprot.writeFieldEnd();
            }
            if (struct.isSetCollect_words_updated_at()) {
                oprot.writeFieldBegin(UserLearnInfo.COLLECT_WORDS_UPDATED_AT_FIELD_DESC);
                oprot.writeI64(struct.collect_words_updated_at);
                oprot.writeFieldEnd();
            }
            if (struct.isSetListening_vocab_count()) {
                oprot.writeFieldBegin(UserLearnInfo.LISTENING_VOCAB_COUNT_FIELD_DESC);
                oprot.writeI32(struct.listening_vocab_count);
                oprot.writeFieldEnd();
            }
            if (struct.isSetIntegration_vocab_count()) {
                oprot.writeFieldBegin(UserLearnInfo.INTEGRATION_VOCAB_COUNT_FIELD_DESC);
                oprot.writeI32(struct.integration_vocab_count);
                oprot.writeFieldEnd();
            }
            if (struct.isSetDaily_plan_count()) {
                oprot.writeFieldBegin(UserLearnInfo.DAILY_PLAN_COUNT_FIELD_DESC);
                oprot.writeI32(struct.daily_plan_count);
                oprot.writeFieldEnd();
            }
            if (struct.isSetReview_plan_count()) {
                oprot.writeFieldBegin(UserLearnInfo.REVIEW_PLAN_COUNT_FIELD_DESC);
                oprot.writeI32(struct.review_plan_count);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserLearnInfoStandardSchemeFactory implements SchemeFactory {
        private UserLearnInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserLearnInfoStandardScheme getScheme() {
            return new UserLearnInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserLearnInfoTupleScheme extends TupleScheme<UserLearnInfo> {
        private UserLearnInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserLearnInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.last_sync_done_score_time = tTupleProtocol.readI64();
            struct.setLast_sync_done_score_timeIsSet(true);
            struct.total_daka_days = tTupleProtocol.readI32();
            struct.setTotal_daka_daysIsSet(true);
            struct.last_daka_at = tTupleProtocol.readI64();
            struct.setLast_daka_atIsSet(true);
            struct.vocab_count = tTupleProtocol.readI32();
            struct.setVocab_countIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(6);
            if (readBitSet.get(0)) {
                struct.latest_finished_date = tTupleProtocol.readI64();
                struct.setLatest_finished_dateIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.collect_words_updated_at = tTupleProtocol.readI64();
                struct.setCollect_words_updated_atIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.listening_vocab_count = tTupleProtocol.readI32();
                struct.setListening_vocab_countIsSet(true);
            }
            if (readBitSet.get(3)) {
                struct.integration_vocab_count = tTupleProtocol.readI32();
                struct.setIntegration_vocab_countIsSet(true);
            }
            if (readBitSet.get(4)) {
                struct.daily_plan_count = tTupleProtocol.readI32();
                struct.setDaily_plan_countIsSet(true);
            }
            if (readBitSet.get(5)) {
                struct.review_plan_count = tTupleProtocol.readI32();
                struct.setReview_plan_countIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserLearnInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI64(struct.last_sync_done_score_time);
            tTupleProtocol.writeI32(struct.total_daka_days);
            tTupleProtocol.writeI64(struct.last_daka_at);
            tTupleProtocol.writeI32(struct.vocab_count);
            BitSet bitSet = new BitSet();
            if (struct.isSetLatest_finished_date()) {
                bitSet.set(0);
            }
            if (struct.isSetCollect_words_updated_at()) {
                bitSet.set(1);
            }
            if (struct.isSetListening_vocab_count()) {
                bitSet.set(2);
            }
            if (struct.isSetIntegration_vocab_count()) {
                bitSet.set(3);
            }
            if (struct.isSetDaily_plan_count()) {
                bitSet.set(4);
            }
            if (struct.isSetReview_plan_count()) {
                bitSet.set(5);
            }
            tTupleProtocol.writeBitSet(bitSet, 6);
            if (struct.isSetLatest_finished_date()) {
                tTupleProtocol.writeI64(struct.latest_finished_date);
            }
            if (struct.isSetCollect_words_updated_at()) {
                tTupleProtocol.writeI64(struct.collect_words_updated_at);
            }
            if (struct.isSetListening_vocab_count()) {
                tTupleProtocol.writeI32(struct.listening_vocab_count);
            }
            if (struct.isSetIntegration_vocab_count()) {
                tTupleProtocol.writeI32(struct.integration_vocab_count);
            }
            if (struct.isSetDaily_plan_count()) {
                tTupleProtocol.writeI32(struct.daily_plan_count);
            }
            if (struct.isSetReview_plan_count()) {
                tTupleProtocol.writeI32(struct.review_plan_count);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserLearnInfoTupleSchemeFactory implements SchemeFactory {
        private UserLearnInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserLearnInfoTupleScheme getScheme() {
            return new UserLearnInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        LAST_SYNC_DONE_SCORE_TIME(1, "last_sync_done_score_time"),
        TOTAL_DAKA_DAYS(2, "total_daka_days"),
        LAST_DAKA_AT(3, "last_daka_at"),
        VOCAB_COUNT(4, "vocab_count"),
        LATEST_FINISHED_DATE(5, "latest_finished_date"),
        COLLECT_WORDS_UPDATED_AT(6, "collect_words_updated_at"),
        LISTENING_VOCAB_COUNT(7, "listening_vocab_count"),
        INTEGRATION_VOCAB_COUNT(8, "integration_vocab_count"),
        DAILY_PLAN_COUNT(9, "daily_plan_count"),
        REVIEW_PLAN_COUNT(10, "review_plan_count");

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
                    return LAST_SYNC_DONE_SCORE_TIME;
                case 2:
                    return TOTAL_DAKA_DAYS;
                case 3:
                    return LAST_DAKA_AT;
                case 4:
                    return VOCAB_COUNT;
                case 5:
                    return LATEST_FINISHED_DATE;
                case 6:
                    return COLLECT_WORDS_UPDATED_AT;
                case 7:
                    return LISTENING_VOCAB_COUNT;
                case 8:
                    return INTEGRATION_VOCAB_COUNT;
                case 9:
                    return DAILY_PLAN_COUNT;
                case 10:
                    return REVIEW_PLAN_COUNT;
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
        hashMap.put(StandardScheme.class, new UserLearnInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserLearnInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.LAST_SYNC_DONE_SCORE_TIME, (_Fields) new FieldMetaData("last_sync_done_score_time", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.TOTAL_DAKA_DAYS, (_Fields) new FieldMetaData("total_daka_days", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.LAST_DAKA_AT, (_Fields) new FieldMetaData("last_daka_at", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.VOCAB_COUNT, (_Fields) new FieldMetaData("vocab_count", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.LATEST_FINISHED_DATE, (_Fields) new FieldMetaData("latest_finished_date", (byte) 2, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.COLLECT_WORDS_UPDATED_AT, (_Fields) new FieldMetaData("collect_words_updated_at", (byte) 2, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.LISTENING_VOCAB_COUNT, (_Fields) new FieldMetaData("listening_vocab_count", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.INTEGRATION_VOCAB_COUNT, (_Fields) new FieldMetaData("integration_vocab_count", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.DAILY_PLAN_COUNT, (_Fields) new FieldMetaData("daily_plan_count", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.REVIEW_PLAN_COUNT, (_Fields) new FieldMetaData("review_plan_count", (byte) 2, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserLearnInfo.class, unmodifiableMap);
    }

    public UserLearnInfo() {
        this.__isset_bitfield = (short) 0;
        this.optionals = new _Fields[]{_Fields.LATEST_FINISHED_DATE, _Fields.COLLECT_WORDS_UPDATED_AT, _Fields.LISTENING_VOCAB_COUNT, _Fields.INTEGRATION_VOCAB_COUNT, _Fields.DAILY_PLAN_COUNT, _Fields.REVIEW_PLAN_COUNT};
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
        setLast_sync_done_score_timeIsSet(false);
        this.last_sync_done_score_time = 0L;
        setTotal_daka_daysIsSet(false);
        this.total_daka_days = 0;
        setLast_daka_atIsSet(false);
        this.last_daka_at = 0L;
        setVocab_countIsSet(false);
        this.vocab_count = 0;
        setLatest_finished_dateIsSet(false);
        this.latest_finished_date = 0L;
        setCollect_words_updated_atIsSet(false);
        this.collect_words_updated_at = 0L;
        setListening_vocab_countIsSet(false);
        this.listening_vocab_count = 0;
        setIntegration_vocab_countIsSet(false);
        this.integration_vocab_count = 0;
        setDaily_plan_countIsSet(false);
        this.daily_plan_count = 0;
        setReview_plan_countIsSet(false);
        this.review_plan_count = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserLearnInfo)) {
            return equals((UserLearnInfo) that);
        }
        return false;
    }

    public long getCollect_words_updated_at() {
        return this.collect_words_updated_at;
    }

    public int getDaily_plan_count() {
        return this.daily_plan_count;
    }

    public int getIntegration_vocab_count() {
        return this.integration_vocab_count;
    }

    public long getLast_daka_at() {
        return this.last_daka_at;
    }

    public long getLast_sync_done_score_time() {
        return this.last_sync_done_score_time;
    }

    public long getLatest_finished_date() {
        return this.latest_finished_date;
    }

    public int getListening_vocab_count() {
        return this.listening_vocab_count;
    }

    public int getReview_plan_count() {
        return this.review_plan_count;
    }

    public int getTotal_daka_days() {
        return this.total_daka_days;
    }

    public int getVocab_count() {
        return this.vocab_count;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetCollect_words_updated_at() {
        return EncodingUtils.testBit(this.__isset_bitfield, 5);
    }

    public boolean isSetDaily_plan_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 8);
    }

    public boolean isSetIntegration_vocab_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 7);
    }

    public boolean isSetLast_daka_at() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetLast_sync_done_score_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetLatest_finished_date() {
        return EncodingUtils.testBit(this.__isset_bitfield, 4);
    }

    public boolean isSetListening_vocab_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 6);
    }

    public boolean isSetReview_plan_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 9);
    }

    public boolean isSetTotal_daka_days() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetVocab_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserLearnInfo setCollect_words_updated_at(long collect_words_updated_at) {
        this.collect_words_updated_at = collect_words_updated_at;
        setCollect_words_updated_atIsSet(true);
        return this;
    }

    public void setCollect_words_updated_atIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 5, value);
    }

    public UserLearnInfo setDaily_plan_count(int daily_plan_count) {
        this.daily_plan_count = daily_plan_count;
        setDaily_plan_countIsSet(true);
        return this;
    }

    public void setDaily_plan_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 8, value);
    }

    public UserLearnInfo setIntegration_vocab_count(int integration_vocab_count) {
        this.integration_vocab_count = integration_vocab_count;
        setIntegration_vocab_countIsSet(true);
        return this;
    }

    public void setIntegration_vocab_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 7, value);
    }

    public UserLearnInfo setLast_daka_at(long last_daka_at) {
        this.last_daka_at = last_daka_at;
        setLast_daka_atIsSet(true);
        return this;
    }

    public void setLast_daka_atIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public UserLearnInfo setLast_sync_done_score_time(long last_sync_done_score_time) {
        this.last_sync_done_score_time = last_sync_done_score_time;
        setLast_sync_done_score_timeIsSet(true);
        return this;
    }

    public void setLast_sync_done_score_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public UserLearnInfo setLatest_finished_date(long latest_finished_date) {
        this.latest_finished_date = latest_finished_date;
        setLatest_finished_dateIsSet(true);
        return this;
    }

    public void setLatest_finished_dateIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 4, value);
    }

    public UserLearnInfo setListening_vocab_count(int listening_vocab_count) {
        this.listening_vocab_count = listening_vocab_count;
        setListening_vocab_countIsSet(true);
        return this;
    }

    public void setListening_vocab_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 6, value);
    }

    public UserLearnInfo setReview_plan_count(int review_plan_count) {
        this.review_plan_count = review_plan_count;
        setReview_plan_countIsSet(true);
        return this;
    }

    public void setReview_plan_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 9, value);
    }

    public UserLearnInfo setTotal_daka_days(int total_daka_days) {
        this.total_daka_days = total_daka_days;
        setTotal_daka_daysIsSet(true);
        return this;
    }

    public void setTotal_daka_daysIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public UserLearnInfo setVocab_count(int vocab_count) {
        this.vocab_count = vocab_count;
        setVocab_countIsSet(true);
        return this;
    }

    public void setVocab_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserLearnInfo(");
        sb2.append("last_sync_done_score_time:");
        sb2.append(this.last_sync_done_score_time);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("total_daka_days:");
        sb2.append(this.total_daka_days);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("last_daka_at:");
        sb2.append(this.last_daka_at);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("vocab_count:");
        sb2.append(this.vocab_count);
        if (isSetLatest_finished_date()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("latest_finished_date:");
            sb2.append(this.latest_finished_date);
        }
        if (isSetCollect_words_updated_at()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("collect_words_updated_at:");
            sb2.append(this.collect_words_updated_at);
        }
        if (isSetListening_vocab_count()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("listening_vocab_count:");
            sb2.append(this.listening_vocab_count);
        }
        if (isSetIntegration_vocab_count()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("integration_vocab_count:");
            sb2.append(this.integration_vocab_count);
        }
        if (isSetDaily_plan_count()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("daily_plan_count:");
            sb2.append(this.daily_plan_count);
        }
        if (isSetReview_plan_count()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("review_plan_count:");
            sb2.append(this.review_plan_count);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetCollect_words_updated_at() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 5);
    }

    public void unsetDaily_plan_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 8);
    }

    public void unsetIntegration_vocab_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 7);
    }

    public void unsetLast_daka_at() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetLast_sync_done_score_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetLatest_finished_date() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 4);
    }

    public void unsetListening_vocab_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 6);
    }

    public void unsetReview_plan_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 9);
    }

    public void unsetTotal_daka_days() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetVocab_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(UserLearnInfo other) {
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
        int compareTo11 = Boolean.valueOf(isSetLast_sync_done_score_time()).compareTo(Boolean.valueOf(other.isSetLast_sync_done_score_time()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetLast_sync_done_score_time() && (compareTo10 = TBaseHelper.compareTo(this.last_sync_done_score_time, other.last_sync_done_score_time)) != 0) {
            return compareTo10;
        }
        int compareTo12 = Boolean.valueOf(isSetTotal_daka_days()).compareTo(Boolean.valueOf(other.isSetTotal_daka_days()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetTotal_daka_days() && (compareTo9 = TBaseHelper.compareTo(this.total_daka_days, other.total_daka_days)) != 0) {
            return compareTo9;
        }
        int compareTo13 = Boolean.valueOf(isSetLast_daka_at()).compareTo(Boolean.valueOf(other.isSetLast_daka_at()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetLast_daka_at() && (compareTo8 = TBaseHelper.compareTo(this.last_daka_at, other.last_daka_at)) != 0) {
            return compareTo8;
        }
        int compareTo14 = Boolean.valueOf(isSetVocab_count()).compareTo(Boolean.valueOf(other.isSetVocab_count()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (isSetVocab_count() && (compareTo7 = TBaseHelper.compareTo(this.vocab_count, other.vocab_count)) != 0) {
            return compareTo7;
        }
        int compareTo15 = Boolean.valueOf(isSetLatest_finished_date()).compareTo(Boolean.valueOf(other.isSetLatest_finished_date()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (isSetLatest_finished_date() && (compareTo6 = TBaseHelper.compareTo(this.latest_finished_date, other.latest_finished_date)) != 0) {
            return compareTo6;
        }
        int compareTo16 = Boolean.valueOf(isSetCollect_words_updated_at()).compareTo(Boolean.valueOf(other.isSetCollect_words_updated_at()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (isSetCollect_words_updated_at() && (compareTo5 = TBaseHelper.compareTo(this.collect_words_updated_at, other.collect_words_updated_at)) != 0) {
            return compareTo5;
        }
        int compareTo17 = Boolean.valueOf(isSetListening_vocab_count()).compareTo(Boolean.valueOf(other.isSetListening_vocab_count()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (isSetListening_vocab_count() && (compareTo4 = TBaseHelper.compareTo(this.listening_vocab_count, other.listening_vocab_count)) != 0) {
            return compareTo4;
        }
        int compareTo18 = Boolean.valueOf(isSetIntegration_vocab_count()).compareTo(Boolean.valueOf(other.isSetIntegration_vocab_count()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (isSetIntegration_vocab_count() && (compareTo3 = TBaseHelper.compareTo(this.integration_vocab_count, other.integration_vocab_count)) != 0) {
            return compareTo3;
        }
        int compareTo19 = Boolean.valueOf(isSetDaily_plan_count()).compareTo(Boolean.valueOf(other.isSetDaily_plan_count()));
        if (compareTo19 != 0) {
            return compareTo19;
        }
        if (isSetDaily_plan_count() && (compareTo2 = TBaseHelper.compareTo(this.daily_plan_count, other.daily_plan_count)) != 0) {
            return compareTo2;
        }
        int compareTo20 = Boolean.valueOf(isSetReview_plan_count()).compareTo(Boolean.valueOf(other.isSetReview_plan_count()));
        if (compareTo20 != 0) {
            return compareTo20;
        }
        if (!isSetReview_plan_count() || (compareTo = TBaseHelper.compareTo(this.review_plan_count, other.review_plan_count)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserLearnInfo, _Fields> deepCopy2() {
        return new UserLearnInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserLearnInfo$_Fields[field.ordinal()]) {
            case 1:
                return Long.valueOf(getLast_sync_done_score_time());
            case 2:
                return Integer.valueOf(getTotal_daka_days());
            case 3:
                return Long.valueOf(getLast_daka_at());
            case 4:
                return Integer.valueOf(getVocab_count());
            case 5:
                return Long.valueOf(getLatest_finished_date());
            case 6:
                return Long.valueOf(getCollect_words_updated_at());
            case 7:
                return Integer.valueOf(getListening_vocab_count());
            case 8:
                return Integer.valueOf(getIntegration_vocab_count());
            case 9:
                return Integer.valueOf(getDaily_plan_count());
            case 10:
                return Integer.valueOf(getReview_plan_count());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserLearnInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetLast_sync_done_score_time();
            case 2:
                return isSetTotal_daka_days();
            case 3:
                return isSetLast_daka_at();
            case 4:
                return isSetVocab_count();
            case 5:
                return isSetLatest_finished_date();
            case 6:
                return isSetCollect_words_updated_at();
            case 7:
                return isSetListening_vocab_count();
            case 8:
                return isSetIntegration_vocab_count();
            case 9:
                return isSetDaily_plan_count();
            case 10:
                return isSetReview_plan_count();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserLearnInfo$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setLast_sync_done_score_time(((Long) value).longValue());
                    break;
                } else {
                    unsetLast_sync_done_score_time();
                    break;
                }
            case 2:
                if (value != null) {
                    setTotal_daka_days(((Integer) value).intValue());
                    break;
                } else {
                    unsetTotal_daka_days();
                    break;
                }
            case 3:
                if (value != null) {
                    setLast_daka_at(((Long) value).longValue());
                    break;
                } else {
                    unsetLast_daka_at();
                    break;
                }
            case 4:
                if (value != null) {
                    setVocab_count(((Integer) value).intValue());
                    break;
                } else {
                    unsetVocab_count();
                    break;
                }
            case 5:
                if (value != null) {
                    setLatest_finished_date(((Long) value).longValue());
                    break;
                } else {
                    unsetLatest_finished_date();
                    break;
                }
            case 6:
                if (value != null) {
                    setCollect_words_updated_at(((Long) value).longValue());
                    break;
                } else {
                    unsetCollect_words_updated_at();
                    break;
                }
            case 7:
                if (value != null) {
                    setListening_vocab_count(((Integer) value).intValue());
                    break;
                } else {
                    unsetListening_vocab_count();
                    break;
                }
            case 8:
                if (value != null) {
                    setIntegration_vocab_count(((Integer) value).intValue());
                    break;
                } else {
                    unsetIntegration_vocab_count();
                    break;
                }
            case 9:
                if (value != null) {
                    setDaily_plan_count(((Integer) value).intValue());
                    break;
                } else {
                    unsetDaily_plan_count();
                    break;
                }
            case 10:
                if (value != null) {
                    setReview_plan_count(((Integer) value).intValue());
                    break;
                } else {
                    unsetReview_plan_count();
                    break;
                }
        }
    }

    public boolean equals(UserLearnInfo that) {
        if (that == null || this.last_sync_done_score_time != that.last_sync_done_score_time || this.total_daka_days != that.total_daka_days || this.last_daka_at != that.last_daka_at || this.vocab_count != that.vocab_count) {
            return false;
        }
        boolean isSetLatest_finished_date = isSetLatest_finished_date();
        boolean isSetLatest_finished_date2 = that.isSetLatest_finished_date();
        if ((isSetLatest_finished_date || isSetLatest_finished_date2) && !(isSetLatest_finished_date && isSetLatest_finished_date2 && this.latest_finished_date == that.latest_finished_date)) {
            return false;
        }
        boolean isSetCollect_words_updated_at = isSetCollect_words_updated_at();
        boolean isSetCollect_words_updated_at2 = that.isSetCollect_words_updated_at();
        if ((isSetCollect_words_updated_at || isSetCollect_words_updated_at2) && !(isSetCollect_words_updated_at && isSetCollect_words_updated_at2 && this.collect_words_updated_at == that.collect_words_updated_at)) {
            return false;
        }
        boolean isSetListening_vocab_count = isSetListening_vocab_count();
        boolean isSetListening_vocab_count2 = that.isSetListening_vocab_count();
        if ((isSetListening_vocab_count || isSetListening_vocab_count2) && !(isSetListening_vocab_count && isSetListening_vocab_count2 && this.listening_vocab_count == that.listening_vocab_count)) {
            return false;
        }
        boolean isSetIntegration_vocab_count = isSetIntegration_vocab_count();
        boolean isSetIntegration_vocab_count2 = that.isSetIntegration_vocab_count();
        if ((isSetIntegration_vocab_count || isSetIntegration_vocab_count2) && !(isSetIntegration_vocab_count && isSetIntegration_vocab_count2 && this.integration_vocab_count == that.integration_vocab_count)) {
            return false;
        }
        boolean isSetDaily_plan_count = isSetDaily_plan_count();
        boolean isSetDaily_plan_count2 = that.isSetDaily_plan_count();
        if ((isSetDaily_plan_count || isSetDaily_plan_count2) && !(isSetDaily_plan_count && isSetDaily_plan_count2 && this.daily_plan_count == that.daily_plan_count)) {
            return false;
        }
        boolean isSetReview_plan_count = isSetReview_plan_count();
        boolean isSetReview_plan_count2 = that.isSetReview_plan_count();
        if (isSetReview_plan_count || isSetReview_plan_count2) {
            return isSetReview_plan_count && isSetReview_plan_count2 && this.review_plan_count == that.review_plan_count;
        }
        return true;
    }

    public UserLearnInfo(long last_sync_done_score_time, int total_daka_days, long last_daka_at, int vocab_count) {
        this();
        this.last_sync_done_score_time = last_sync_done_score_time;
        setLast_sync_done_score_timeIsSet(true);
        this.total_daka_days = total_daka_days;
        setTotal_daka_daysIsSet(true);
        this.last_daka_at = last_daka_at;
        setLast_daka_atIsSet(true);
        this.vocab_count = vocab_count;
        setVocab_countIsSet(true);
    }

    public UserLearnInfo(UserLearnInfo other) {
        this.__isset_bitfield = (short) 0;
        this.optionals = new _Fields[]{_Fields.LATEST_FINISHED_DATE, _Fields.COLLECT_WORDS_UPDATED_AT, _Fields.LISTENING_VOCAB_COUNT, _Fields.INTEGRATION_VOCAB_COUNT, _Fields.DAILY_PLAN_COUNT, _Fields.REVIEW_PLAN_COUNT};
        this.__isset_bitfield = other.__isset_bitfield;
        this.last_sync_done_score_time = other.last_sync_done_score_time;
        this.total_daka_days = other.total_daka_days;
        this.last_daka_at = other.last_daka_at;
        this.vocab_count = other.vocab_count;
        this.latest_finished_date = other.latest_finished_date;
        this.collect_words_updated_at = other.collect_words_updated_at;
        this.listening_vocab_count = other.listening_vocab_count;
        this.integration_vocab_count = other.integration_vocab_count;
        this.daily_plan_count = other.daily_plan_count;
        this.review_plan_count = other.review_plan_count;
    }

    public void validate() throws TException {
    }
}
