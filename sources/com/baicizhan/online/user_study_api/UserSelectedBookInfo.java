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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class UserSelectedBookInfo implements TBase<UserSelectedBookInfo, _Fields>, Serializable, Cloneable, Comparable<UserSelectedBookInfo> {
    private static final int __BOOK_ID_ISSET_ID = 0;
    private static final int __DAILY_PLAN_COUNT_ISSET_ID = 7;
    private static final int __GAME_MODE_ISSET_ID = 11;
    private static final int __GROUP_ID_ISSET_ID = 6;
    private static final int __LAST_TOUCH_AT_ISSET_ID = 3;
    private static final int __LEARNED_WORDS_COUNT_ISSET_ID = 2;
    private static final int __NEED_MERGE_COUNT_ISSET_ID = 9;
    private static final int __POSTER_UPDATED_AT_ISSET_ID = 8;
    private static final int __REVIEW_PLAN_COUNT_ISSET_ID = 10;
    private static final int __ROADMAP_VERSION_ISSET_ID = 4;
    private static final int __SELECTED_END_TIME_ISSET_ID = 1;
    private static final int __WORD_FM_UPDATED_AT_ISSET_ID = 5;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private short __isset_bitfield;
    public int book_id;
    public int daily_plan_count;
    public ExamPreparation examPreparation;
    public int game_mode;
    public int group_id;
    public long last_touch_at;
    public int learned_words_count;
    public String mode_switch_url;
    public int need_merge_count;
    private _Fields[] optionals;
    public long poster_updated_at;
    public int review_plan_count;
    public long roadmap_version;
    public long selected_end_time;
    public long word_fm_updated_at;
    private static final TStruct STRUCT_DESC = new TStruct("UserSelectedBookInfo");
    private static final TField BOOK_ID_FIELD_DESC = new TField("book_id", (byte) 8, 1);
    private static final TField SELECTED_END_TIME_FIELD_DESC = new TField("selected_end_time", (byte) 10, 2);
    private static final TField LEARNED_WORDS_COUNT_FIELD_DESC = new TField("learned_words_count", (byte) 8, 3);
    private static final TField LAST_TOUCH_AT_FIELD_DESC = new TField("last_touch_at", (byte) 10, 4);
    private static final TField ROADMAP_VERSION_FIELD_DESC = new TField("roadmap_version", (byte) 10, 5);
    private static final TField WORD_FM_UPDATED_AT_FIELD_DESC = new TField("word_fm_updated_at", (byte) 10, 6);
    private static final TField GROUP_ID_FIELD_DESC = new TField("group_id", (byte) 8, 7);
    private static final TField DAILY_PLAN_COUNT_FIELD_DESC = new TField("daily_plan_count", (byte) 8, 8);
    private static final TField POSTER_UPDATED_AT_FIELD_DESC = new TField("poster_updated_at", (byte) 10, 9);
    private static final TField NEED_MERGE_COUNT_FIELD_DESC = new TField("need_merge_count", (byte) 8, 10);
    private static final TField REVIEW_PLAN_COUNT_FIELD_DESC = new TField("review_plan_count", (byte) 8, 11);
    private static final TField EXAM_PREPARATION_FIELD_DESC = new TField("examPreparation", (byte) 12, 12);
    private static final TField MODE_SWITCH_URL_FIELD_DESC = new TField("mode_switch_url", (byte) 11, 13);
    private static final TField GAME_MODE_FIELD_DESC = new TField("game_mode", (byte) 8, 14);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.UserSelectedBookInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$UserSelectedBookInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$UserSelectedBookInfo$_Fields = iArr;
            try {
                iArr[_Fields.BOOK_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserSelectedBookInfo$_Fields[_Fields.SELECTED_END_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserSelectedBookInfo$_Fields[_Fields.LEARNED_WORDS_COUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserSelectedBookInfo$_Fields[_Fields.LAST_TOUCH_AT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserSelectedBookInfo$_Fields[_Fields.ROADMAP_VERSION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserSelectedBookInfo$_Fields[_Fields.WORD_FM_UPDATED_AT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserSelectedBookInfo$_Fields[_Fields.GROUP_ID.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserSelectedBookInfo$_Fields[_Fields.DAILY_PLAN_COUNT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserSelectedBookInfo$_Fields[_Fields.POSTER_UPDATED_AT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserSelectedBookInfo$_Fields[_Fields.NEED_MERGE_COUNT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserSelectedBookInfo$_Fields[_Fields.REVIEW_PLAN_COUNT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserSelectedBookInfo$_Fields[_Fields.EXAM_PREPARATION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserSelectedBookInfo$_Fields[_Fields.MODE_SWITCH_URL.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserSelectedBookInfo$_Fields[_Fields.GAME_MODE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserSelectedBookInfoStandardScheme extends StandardScheme<UserSelectedBookInfo> {
        private UserSelectedBookInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserSelectedBookInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetBook_id()) {
                        throw new TProtocolException("Required field 'book_id' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetLearned_words_count()) {
                        throw new TProtocolException("Required field 'learned_words_count' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetLast_touch_at()) {
                        throw new TProtocolException("Required field 'last_touch_at' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetRoadmap_version()) {
                        throw new TProtocolException("Required field 'roadmap_version' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetWord_fm_updated_at()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'word_fm_updated_at' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.book_id = iprot.readI32();
                            struct.setBook_idIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.selected_end_time = iprot.readI64();
                            struct.setSelected_end_timeIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.learned_words_count = iprot.readI32();
                            struct.setLearned_words_countIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.last_touch_at = iprot.readI64();
                            struct.setLast_touch_atIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.roadmap_version = iprot.readI64();
                            struct.setRoadmap_versionIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.word_fm_updated_at = iprot.readI64();
                            struct.setWord_fm_updated_atIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.group_id = iprot.readI32();
                            struct.setGroup_idIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.daily_plan_count = iprot.readI32();
                            struct.setDaily_plan_countIsSet(true);
                            break;
                        }
                    case 9:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.poster_updated_at = iprot.readI64();
                            struct.setPoster_updated_atIsSet(true);
                            break;
                        }
                    case 10:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.need_merge_count = iprot.readI32();
                            struct.setNeed_merge_countIsSet(true);
                            break;
                        }
                    case 11:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.review_plan_count = iprot.readI32();
                            struct.setReview_plan_countIsSet(true);
                            break;
                        }
                    case 12:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            ExamPreparation examPreparation = new ExamPreparation();
                            struct.examPreparation = examPreparation;
                            examPreparation.read(iprot);
                            struct.setExamPreparationIsSet(true);
                            break;
                        }
                    case 13:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.mode_switch_url = iprot.readString();
                            struct.setMode_switch_urlIsSet(true);
                            break;
                        }
                    case 14:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.game_mode = iprot.readI32();
                            struct.setGame_modeIsSet(true);
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
        public void write(TProtocol oprot, UserSelectedBookInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserSelectedBookInfo.STRUCT_DESC);
            oprot.writeFieldBegin(UserSelectedBookInfo.BOOK_ID_FIELD_DESC);
            oprot.writeI32(struct.book_id);
            oprot.writeFieldEnd();
            if (struct.isSetSelected_end_time()) {
                oprot.writeFieldBegin(UserSelectedBookInfo.SELECTED_END_TIME_FIELD_DESC);
                oprot.writeI64(struct.selected_end_time);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(UserSelectedBookInfo.LEARNED_WORDS_COUNT_FIELD_DESC);
            oprot.writeI32(struct.learned_words_count);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserSelectedBookInfo.LAST_TOUCH_AT_FIELD_DESC);
            oprot.writeI64(struct.last_touch_at);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserSelectedBookInfo.ROADMAP_VERSION_FIELD_DESC);
            oprot.writeI64(struct.roadmap_version);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserSelectedBookInfo.WORD_FM_UPDATED_AT_FIELD_DESC);
            oprot.writeI64(struct.word_fm_updated_at);
            oprot.writeFieldEnd();
            if (struct.isSetGroup_id()) {
                oprot.writeFieldBegin(UserSelectedBookInfo.GROUP_ID_FIELD_DESC);
                oprot.writeI32(struct.group_id);
                oprot.writeFieldEnd();
            }
            if (struct.isSetDaily_plan_count()) {
                oprot.writeFieldBegin(UserSelectedBookInfo.DAILY_PLAN_COUNT_FIELD_DESC);
                oprot.writeI32(struct.daily_plan_count);
                oprot.writeFieldEnd();
            }
            if (struct.isSetPoster_updated_at()) {
                oprot.writeFieldBegin(UserSelectedBookInfo.POSTER_UPDATED_AT_FIELD_DESC);
                oprot.writeI64(struct.poster_updated_at);
                oprot.writeFieldEnd();
            }
            if (struct.isSetNeed_merge_count()) {
                oprot.writeFieldBegin(UserSelectedBookInfo.NEED_MERGE_COUNT_FIELD_DESC);
                oprot.writeI32(struct.need_merge_count);
                oprot.writeFieldEnd();
            }
            if (struct.isSetReview_plan_count()) {
                oprot.writeFieldBegin(UserSelectedBookInfo.REVIEW_PLAN_COUNT_FIELD_DESC);
                oprot.writeI32(struct.review_plan_count);
                oprot.writeFieldEnd();
            }
            if (struct.examPreparation != null && struct.isSetExamPreparation()) {
                oprot.writeFieldBegin(UserSelectedBookInfo.EXAM_PREPARATION_FIELD_DESC);
                struct.examPreparation.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.mode_switch_url != null && struct.isSetMode_switch_url()) {
                oprot.writeFieldBegin(UserSelectedBookInfo.MODE_SWITCH_URL_FIELD_DESC);
                oprot.writeString(struct.mode_switch_url);
                oprot.writeFieldEnd();
            }
            if (struct.isSetGame_mode()) {
                oprot.writeFieldBegin(UserSelectedBookInfo.GAME_MODE_FIELD_DESC);
                oprot.writeI32(struct.game_mode);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserSelectedBookInfoStandardSchemeFactory implements SchemeFactory {
        private UserSelectedBookInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserSelectedBookInfoStandardScheme getScheme() {
            return new UserSelectedBookInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserSelectedBookInfoTupleScheme extends TupleScheme<UserSelectedBookInfo> {
        private UserSelectedBookInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserSelectedBookInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.book_id = tTupleProtocol.readI32();
            struct.setBook_idIsSet(true);
            struct.learned_words_count = tTupleProtocol.readI32();
            struct.setLearned_words_countIsSet(true);
            struct.last_touch_at = tTupleProtocol.readI64();
            struct.setLast_touch_atIsSet(true);
            struct.roadmap_version = tTupleProtocol.readI64();
            struct.setRoadmap_versionIsSet(true);
            struct.word_fm_updated_at = tTupleProtocol.readI64();
            struct.setWord_fm_updated_atIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(9);
            if (readBitSet.get(0)) {
                struct.selected_end_time = tTupleProtocol.readI64();
                struct.setSelected_end_timeIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.group_id = tTupleProtocol.readI32();
                struct.setGroup_idIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.daily_plan_count = tTupleProtocol.readI32();
                struct.setDaily_plan_countIsSet(true);
            }
            if (readBitSet.get(3)) {
                struct.poster_updated_at = tTupleProtocol.readI64();
                struct.setPoster_updated_atIsSet(true);
            }
            if (readBitSet.get(4)) {
                struct.need_merge_count = tTupleProtocol.readI32();
                struct.setNeed_merge_countIsSet(true);
            }
            if (readBitSet.get(5)) {
                struct.review_plan_count = tTupleProtocol.readI32();
                struct.setReview_plan_countIsSet(true);
            }
            if (readBitSet.get(6)) {
                ExamPreparation examPreparation = new ExamPreparation();
                struct.examPreparation = examPreparation;
                examPreparation.read(tTupleProtocol);
                struct.setExamPreparationIsSet(true);
            }
            if (readBitSet.get(7)) {
                struct.mode_switch_url = tTupleProtocol.readString();
                struct.setMode_switch_urlIsSet(true);
            }
            if (readBitSet.get(8)) {
                struct.game_mode = tTupleProtocol.readI32();
                struct.setGame_modeIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserSelectedBookInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.book_id);
            tTupleProtocol.writeI32(struct.learned_words_count);
            tTupleProtocol.writeI64(struct.last_touch_at);
            tTupleProtocol.writeI64(struct.roadmap_version);
            tTupleProtocol.writeI64(struct.word_fm_updated_at);
            BitSet bitSet = new BitSet();
            if (struct.isSetSelected_end_time()) {
                bitSet.set(0);
            }
            if (struct.isSetGroup_id()) {
                bitSet.set(1);
            }
            if (struct.isSetDaily_plan_count()) {
                bitSet.set(2);
            }
            if (struct.isSetPoster_updated_at()) {
                bitSet.set(3);
            }
            if (struct.isSetNeed_merge_count()) {
                bitSet.set(4);
            }
            if (struct.isSetReview_plan_count()) {
                bitSet.set(5);
            }
            if (struct.isSetExamPreparation()) {
                bitSet.set(6);
            }
            if (struct.isSetMode_switch_url()) {
                bitSet.set(7);
            }
            if (struct.isSetGame_mode()) {
                bitSet.set(8);
            }
            tTupleProtocol.writeBitSet(bitSet, 9);
            if (struct.isSetSelected_end_time()) {
                tTupleProtocol.writeI64(struct.selected_end_time);
            }
            if (struct.isSetGroup_id()) {
                tTupleProtocol.writeI32(struct.group_id);
            }
            if (struct.isSetDaily_plan_count()) {
                tTupleProtocol.writeI32(struct.daily_plan_count);
            }
            if (struct.isSetPoster_updated_at()) {
                tTupleProtocol.writeI64(struct.poster_updated_at);
            }
            if (struct.isSetNeed_merge_count()) {
                tTupleProtocol.writeI32(struct.need_merge_count);
            }
            if (struct.isSetReview_plan_count()) {
                tTupleProtocol.writeI32(struct.review_plan_count);
            }
            if (struct.isSetExamPreparation()) {
                struct.examPreparation.write(tTupleProtocol);
            }
            if (struct.isSetMode_switch_url()) {
                tTupleProtocol.writeString(struct.mode_switch_url);
            }
            if (struct.isSetGame_mode()) {
                tTupleProtocol.writeI32(struct.game_mode);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserSelectedBookInfoTupleSchemeFactory implements SchemeFactory {
        private UserSelectedBookInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserSelectedBookInfoTupleScheme getScheme() {
            return new UserSelectedBookInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        BOOK_ID(1, "book_id"),
        SELECTED_END_TIME(2, "selected_end_time"),
        LEARNED_WORDS_COUNT(3, "learned_words_count"),
        LAST_TOUCH_AT(4, "last_touch_at"),
        ROADMAP_VERSION(5, "roadmap_version"),
        WORD_FM_UPDATED_AT(6, "word_fm_updated_at"),
        GROUP_ID(7, "group_id"),
        DAILY_PLAN_COUNT(8, "daily_plan_count"),
        POSTER_UPDATED_AT(9, "poster_updated_at"),
        NEED_MERGE_COUNT(10, "need_merge_count"),
        REVIEW_PLAN_COUNT(11, "review_plan_count"),
        EXAM_PREPARATION(12, "examPreparation"),
        MODE_SWITCH_URL(13, "mode_switch_url"),
        GAME_MODE(14, "game_mode");

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
                    return BOOK_ID;
                case 2:
                    return SELECTED_END_TIME;
                case 3:
                    return LEARNED_WORDS_COUNT;
                case 4:
                    return LAST_TOUCH_AT;
                case 5:
                    return ROADMAP_VERSION;
                case 6:
                    return WORD_FM_UPDATED_AT;
                case 7:
                    return GROUP_ID;
                case 8:
                    return DAILY_PLAN_COUNT;
                case 9:
                    return POSTER_UPDATED_AT;
                case 10:
                    return NEED_MERGE_COUNT;
                case 11:
                    return REVIEW_PLAN_COUNT;
                case 12:
                    return EXAM_PREPARATION;
                case 13:
                    return MODE_SWITCH_URL;
                case 14:
                    return GAME_MODE;
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
        hashMap.put(StandardScheme.class, new UserSelectedBookInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserSelectedBookInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.BOOK_ID, (_Fields) new FieldMetaData("book_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.SELECTED_END_TIME, (_Fields) new FieldMetaData("selected_end_time", (byte) 2, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.LEARNED_WORDS_COUNT, (_Fields) new FieldMetaData("learned_words_count", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.LAST_TOUCH_AT, (_Fields) new FieldMetaData("last_touch_at", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.ROADMAP_VERSION, (_Fields) new FieldMetaData("roadmap_version", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.WORD_FM_UPDATED_AT, (_Fields) new FieldMetaData("word_fm_updated_at", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.GROUP_ID, (_Fields) new FieldMetaData("group_id", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.DAILY_PLAN_COUNT, (_Fields) new FieldMetaData("daily_plan_count", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.POSTER_UPDATED_AT, (_Fields) new FieldMetaData("poster_updated_at", (byte) 2, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.NEED_MERGE_COUNT, (_Fields) new FieldMetaData("need_merge_count", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.REVIEW_PLAN_COUNT, (_Fields) new FieldMetaData("review_plan_count", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.EXAM_PREPARATION, (_Fields) new FieldMetaData("examPreparation", (byte) 2, new StructMetaData((byte) 12, ExamPreparation.class)));
        enumMap.put((EnumMap) _Fields.MODE_SWITCH_URL, (_Fields) new FieldMetaData("mode_switch_url", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.GAME_MODE, (_Fields) new FieldMetaData("game_mode", (byte) 2, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserSelectedBookInfo.class, unmodifiableMap);
    }

    public UserSelectedBookInfo() {
        this.__isset_bitfield = (short) 0;
        this.optionals = new _Fields[]{_Fields.SELECTED_END_TIME, _Fields.GROUP_ID, _Fields.DAILY_PLAN_COUNT, _Fields.POSTER_UPDATED_AT, _Fields.NEED_MERGE_COUNT, _Fields.REVIEW_PLAN_COUNT, _Fields.EXAM_PREPARATION, _Fields.MODE_SWITCH_URL, _Fields.GAME_MODE};
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
        setBook_idIsSet(false);
        this.book_id = 0;
        setSelected_end_timeIsSet(false);
        this.selected_end_time = 0L;
        setLearned_words_countIsSet(false);
        this.learned_words_count = 0;
        setLast_touch_atIsSet(false);
        this.last_touch_at = 0L;
        setRoadmap_versionIsSet(false);
        this.roadmap_version = 0L;
        setWord_fm_updated_atIsSet(false);
        this.word_fm_updated_at = 0L;
        setGroup_idIsSet(false);
        this.group_id = 0;
        setDaily_plan_countIsSet(false);
        this.daily_plan_count = 0;
        setPoster_updated_atIsSet(false);
        this.poster_updated_at = 0L;
        setNeed_merge_countIsSet(false);
        this.need_merge_count = 0;
        setReview_plan_countIsSet(false);
        this.review_plan_count = 0;
        this.examPreparation = null;
        this.mode_switch_url = null;
        setGame_modeIsSet(false);
        this.game_mode = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserSelectedBookInfo)) {
            return equals((UserSelectedBookInfo) that);
        }
        return false;
    }

    public int getBook_id() {
        return this.book_id;
    }

    public int getDaily_plan_count() {
        return this.daily_plan_count;
    }

    public ExamPreparation getExamPreparation() {
        return this.examPreparation;
    }

    public int getGame_mode() {
        return this.game_mode;
    }

    public int getGroup_id() {
        return this.group_id;
    }

    public long getLast_touch_at() {
        return this.last_touch_at;
    }

    public int getLearned_words_count() {
        return this.learned_words_count;
    }

    public String getMode_switch_url() {
        return this.mode_switch_url;
    }

    public int getNeed_merge_count() {
        return this.need_merge_count;
    }

    public long getPoster_updated_at() {
        return this.poster_updated_at;
    }

    public int getReview_plan_count() {
        return this.review_plan_count;
    }

    public long getRoadmap_version() {
        return this.roadmap_version;
    }

    public long getSelected_end_time() {
        return this.selected_end_time;
    }

    public long getWord_fm_updated_at() {
        return this.word_fm_updated_at;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetBook_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetDaily_plan_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 7);
    }

    public boolean isSetExamPreparation() {
        return this.examPreparation != null;
    }

    public boolean isSetGame_mode() {
        return EncodingUtils.testBit(this.__isset_bitfield, 11);
    }

    public boolean isSetGroup_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 6);
    }

    public boolean isSetLast_touch_at() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetLearned_words_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetMode_switch_url() {
        return this.mode_switch_url != null;
    }

    public boolean isSetNeed_merge_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 9);
    }

    public boolean isSetPoster_updated_at() {
        return EncodingUtils.testBit(this.__isset_bitfield, 8);
    }

    public boolean isSetReview_plan_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 10);
    }

    public boolean isSetRoadmap_version() {
        return EncodingUtils.testBit(this.__isset_bitfield, 4);
    }

    public boolean isSetSelected_end_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetWord_fm_updated_at() {
        return EncodingUtils.testBit(this.__isset_bitfield, 5);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserSelectedBookInfo setBook_id(int book_id) {
        this.book_id = book_id;
        setBook_idIsSet(true);
        return this;
    }

    public void setBook_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public UserSelectedBookInfo setDaily_plan_count(int daily_plan_count) {
        this.daily_plan_count = daily_plan_count;
        setDaily_plan_countIsSet(true);
        return this;
    }

    public void setDaily_plan_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 7, value);
    }

    public UserSelectedBookInfo setExamPreparation(ExamPreparation examPreparation) {
        this.examPreparation = examPreparation;
        return this;
    }

    public void setExamPreparationIsSet(boolean value) {
        if (value) {
            return;
        }
        this.examPreparation = null;
    }

    public UserSelectedBookInfo setGame_mode(int game_mode) {
        this.game_mode = game_mode;
        setGame_modeIsSet(true);
        return this;
    }

    public void setGame_modeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 11, value);
    }

    public UserSelectedBookInfo setGroup_id(int group_id) {
        this.group_id = group_id;
        setGroup_idIsSet(true);
        return this;
    }

    public void setGroup_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 6, value);
    }

    public UserSelectedBookInfo setLast_touch_at(long last_touch_at) {
        this.last_touch_at = last_touch_at;
        setLast_touch_atIsSet(true);
        return this;
    }

    public void setLast_touch_atIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public UserSelectedBookInfo setLearned_words_count(int learned_words_count) {
        this.learned_words_count = learned_words_count;
        setLearned_words_countIsSet(true);
        return this;
    }

    public void setLearned_words_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public UserSelectedBookInfo setMode_switch_url(String mode_switch_url) {
        this.mode_switch_url = mode_switch_url;
        return this;
    }

    public void setMode_switch_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.mode_switch_url = null;
    }

    public UserSelectedBookInfo setNeed_merge_count(int need_merge_count) {
        this.need_merge_count = need_merge_count;
        setNeed_merge_countIsSet(true);
        return this;
    }

    public void setNeed_merge_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 9, value);
    }

    public UserSelectedBookInfo setPoster_updated_at(long poster_updated_at) {
        this.poster_updated_at = poster_updated_at;
        setPoster_updated_atIsSet(true);
        return this;
    }

    public void setPoster_updated_atIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 8, value);
    }

    public UserSelectedBookInfo setReview_plan_count(int review_plan_count) {
        this.review_plan_count = review_plan_count;
        setReview_plan_countIsSet(true);
        return this;
    }

    public void setReview_plan_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 10, value);
    }

    public UserSelectedBookInfo setRoadmap_version(long roadmap_version) {
        this.roadmap_version = roadmap_version;
        setRoadmap_versionIsSet(true);
        return this;
    }

    public void setRoadmap_versionIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 4, value);
    }

    public UserSelectedBookInfo setSelected_end_time(long selected_end_time) {
        this.selected_end_time = selected_end_time;
        setSelected_end_timeIsSet(true);
        return this;
    }

    public void setSelected_end_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public UserSelectedBookInfo setWord_fm_updated_at(long word_fm_updated_at) {
        this.word_fm_updated_at = word_fm_updated_at;
        setWord_fm_updated_atIsSet(true);
        return this;
    }

    public void setWord_fm_updated_atIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 5, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserSelectedBookInfo(");
        sb2.append("book_id:");
        sb2.append(this.book_id);
        if (isSetSelected_end_time()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("selected_end_time:");
            sb2.append(this.selected_end_time);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("learned_words_count:");
        sb2.append(this.learned_words_count);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("last_touch_at:");
        sb2.append(this.last_touch_at);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("roadmap_version:");
        sb2.append(this.roadmap_version);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("word_fm_updated_at:");
        sb2.append(this.word_fm_updated_at);
        if (isSetGroup_id()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("group_id:");
            sb2.append(this.group_id);
        }
        if (isSetDaily_plan_count()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("daily_plan_count:");
            sb2.append(this.daily_plan_count);
        }
        if (isSetPoster_updated_at()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("poster_updated_at:");
            sb2.append(this.poster_updated_at);
        }
        if (isSetNeed_merge_count()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("need_merge_count:");
            sb2.append(this.need_merge_count);
        }
        if (isSetReview_plan_count()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("review_plan_count:");
            sb2.append(this.review_plan_count);
        }
        if (isSetExamPreparation()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("examPreparation:");
            ExamPreparation examPreparation = this.examPreparation;
            if (examPreparation == null) {
                sb2.append("null");
            } else {
                sb2.append(examPreparation);
            }
        }
        if (isSetMode_switch_url()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("mode_switch_url:");
            String str = this.mode_switch_url;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
        }
        if (isSetGame_mode()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("game_mode:");
            sb2.append(this.game_mode);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetBook_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetDaily_plan_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 7);
    }

    public void unsetExamPreparation() {
        this.examPreparation = null;
    }

    public void unsetGame_mode() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 11);
    }

    public void unsetGroup_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 6);
    }

    public void unsetLast_touch_at() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetLearned_words_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetMode_switch_url() {
        this.mode_switch_url = null;
    }

    public void unsetNeed_merge_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 9);
    }

    public void unsetPoster_updated_at() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 8);
    }

    public void unsetReview_plan_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 10);
    }

    public void unsetRoadmap_version() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 4);
    }

    public void unsetSelected_end_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetWord_fm_updated_at() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 5);
    }

    public void validate() throws TException {
        ExamPreparation examPreparation = this.examPreparation;
        if (examPreparation != null) {
            examPreparation.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(UserSelectedBookInfo other) {
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
        int compareTo13;
        int compareTo14;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo15 = Boolean.valueOf(isSetBook_id()).compareTo(Boolean.valueOf(other.isSetBook_id()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (isSetBook_id() && (compareTo14 = TBaseHelper.compareTo(this.book_id, other.book_id)) != 0) {
            return compareTo14;
        }
        int compareTo16 = Boolean.valueOf(isSetSelected_end_time()).compareTo(Boolean.valueOf(other.isSetSelected_end_time()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (isSetSelected_end_time() && (compareTo13 = TBaseHelper.compareTo(this.selected_end_time, other.selected_end_time)) != 0) {
            return compareTo13;
        }
        int compareTo17 = Boolean.valueOf(isSetLearned_words_count()).compareTo(Boolean.valueOf(other.isSetLearned_words_count()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (isSetLearned_words_count() && (compareTo12 = TBaseHelper.compareTo(this.learned_words_count, other.learned_words_count)) != 0) {
            return compareTo12;
        }
        int compareTo18 = Boolean.valueOf(isSetLast_touch_at()).compareTo(Boolean.valueOf(other.isSetLast_touch_at()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (isSetLast_touch_at() && (compareTo11 = TBaseHelper.compareTo(this.last_touch_at, other.last_touch_at)) != 0) {
            return compareTo11;
        }
        int compareTo19 = Boolean.valueOf(isSetRoadmap_version()).compareTo(Boolean.valueOf(other.isSetRoadmap_version()));
        if (compareTo19 != 0) {
            return compareTo19;
        }
        if (isSetRoadmap_version() && (compareTo10 = TBaseHelper.compareTo(this.roadmap_version, other.roadmap_version)) != 0) {
            return compareTo10;
        }
        int compareTo20 = Boolean.valueOf(isSetWord_fm_updated_at()).compareTo(Boolean.valueOf(other.isSetWord_fm_updated_at()));
        if (compareTo20 != 0) {
            return compareTo20;
        }
        if (isSetWord_fm_updated_at() && (compareTo9 = TBaseHelper.compareTo(this.word_fm_updated_at, other.word_fm_updated_at)) != 0) {
            return compareTo9;
        }
        int compareTo21 = Boolean.valueOf(isSetGroup_id()).compareTo(Boolean.valueOf(other.isSetGroup_id()));
        if (compareTo21 != 0) {
            return compareTo21;
        }
        if (isSetGroup_id() && (compareTo8 = TBaseHelper.compareTo(this.group_id, other.group_id)) != 0) {
            return compareTo8;
        }
        int compareTo22 = Boolean.valueOf(isSetDaily_plan_count()).compareTo(Boolean.valueOf(other.isSetDaily_plan_count()));
        if (compareTo22 != 0) {
            return compareTo22;
        }
        if (isSetDaily_plan_count() && (compareTo7 = TBaseHelper.compareTo(this.daily_plan_count, other.daily_plan_count)) != 0) {
            return compareTo7;
        }
        int compareTo23 = Boolean.valueOf(isSetPoster_updated_at()).compareTo(Boolean.valueOf(other.isSetPoster_updated_at()));
        if (compareTo23 != 0) {
            return compareTo23;
        }
        if (isSetPoster_updated_at() && (compareTo6 = TBaseHelper.compareTo(this.poster_updated_at, other.poster_updated_at)) != 0) {
            return compareTo6;
        }
        int compareTo24 = Boolean.valueOf(isSetNeed_merge_count()).compareTo(Boolean.valueOf(other.isSetNeed_merge_count()));
        if (compareTo24 != 0) {
            return compareTo24;
        }
        if (isSetNeed_merge_count() && (compareTo5 = TBaseHelper.compareTo(this.need_merge_count, other.need_merge_count)) != 0) {
            return compareTo5;
        }
        int compareTo25 = Boolean.valueOf(isSetReview_plan_count()).compareTo(Boolean.valueOf(other.isSetReview_plan_count()));
        if (compareTo25 != 0) {
            return compareTo25;
        }
        if (isSetReview_plan_count() && (compareTo4 = TBaseHelper.compareTo(this.review_plan_count, other.review_plan_count)) != 0) {
            return compareTo4;
        }
        int compareTo26 = Boolean.valueOf(isSetExamPreparation()).compareTo(Boolean.valueOf(other.isSetExamPreparation()));
        if (compareTo26 != 0) {
            return compareTo26;
        }
        if (isSetExamPreparation() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.examPreparation, (Comparable) other.examPreparation)) != 0) {
            return compareTo3;
        }
        int compareTo27 = Boolean.valueOf(isSetMode_switch_url()).compareTo(Boolean.valueOf(other.isSetMode_switch_url()));
        if (compareTo27 != 0) {
            return compareTo27;
        }
        if (isSetMode_switch_url() && (compareTo2 = TBaseHelper.compareTo(this.mode_switch_url, other.mode_switch_url)) != 0) {
            return compareTo2;
        }
        int compareTo28 = Boolean.valueOf(isSetGame_mode()).compareTo(Boolean.valueOf(other.isSetGame_mode()));
        if (compareTo28 != 0) {
            return compareTo28;
        }
        if (!isSetGame_mode() || (compareTo = TBaseHelper.compareTo(this.game_mode, other.game_mode)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserSelectedBookInfo, _Fields> deepCopy2() {
        return new UserSelectedBookInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserSelectedBookInfo$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getBook_id());
            case 2:
                return Long.valueOf(getSelected_end_time());
            case 3:
                return Integer.valueOf(getLearned_words_count());
            case 4:
                return Long.valueOf(getLast_touch_at());
            case 5:
                return Long.valueOf(getRoadmap_version());
            case 6:
                return Long.valueOf(getWord_fm_updated_at());
            case 7:
                return Integer.valueOf(getGroup_id());
            case 8:
                return Integer.valueOf(getDaily_plan_count());
            case 9:
                return Long.valueOf(getPoster_updated_at());
            case 10:
                return Integer.valueOf(getNeed_merge_count());
            case 11:
                return Integer.valueOf(getReview_plan_count());
            case 12:
                return getExamPreparation();
            case 13:
                return getMode_switch_url();
            case 14:
                return Integer.valueOf(getGame_mode());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserSelectedBookInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetBook_id();
            case 2:
                return isSetSelected_end_time();
            case 3:
                return isSetLearned_words_count();
            case 4:
                return isSetLast_touch_at();
            case 5:
                return isSetRoadmap_version();
            case 6:
                return isSetWord_fm_updated_at();
            case 7:
                return isSetGroup_id();
            case 8:
                return isSetDaily_plan_count();
            case 9:
                return isSetPoster_updated_at();
            case 10:
                return isSetNeed_merge_count();
            case 11:
                return isSetReview_plan_count();
            case 12:
                return isSetExamPreparation();
            case 13:
                return isSetMode_switch_url();
            case 14:
                return isSetGame_mode();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserSelectedBookInfo$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setBook_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetBook_id();
                    break;
                }
            case 2:
                if (value != null) {
                    setSelected_end_time(((Long) value).longValue());
                    break;
                } else {
                    unsetSelected_end_time();
                    break;
                }
            case 3:
                if (value != null) {
                    setLearned_words_count(((Integer) value).intValue());
                    break;
                } else {
                    unsetLearned_words_count();
                    break;
                }
            case 4:
                if (value != null) {
                    setLast_touch_at(((Long) value).longValue());
                    break;
                } else {
                    unsetLast_touch_at();
                    break;
                }
            case 5:
                if (value != null) {
                    setRoadmap_version(((Long) value).longValue());
                    break;
                } else {
                    unsetRoadmap_version();
                    break;
                }
            case 6:
                if (value != null) {
                    setWord_fm_updated_at(((Long) value).longValue());
                    break;
                } else {
                    unsetWord_fm_updated_at();
                    break;
                }
            case 7:
                if (value != null) {
                    setGroup_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetGroup_id();
                    break;
                }
            case 8:
                if (value != null) {
                    setDaily_plan_count(((Integer) value).intValue());
                    break;
                } else {
                    unsetDaily_plan_count();
                    break;
                }
            case 9:
                if (value != null) {
                    setPoster_updated_at(((Long) value).longValue());
                    break;
                } else {
                    unsetPoster_updated_at();
                    break;
                }
            case 10:
                if (value != null) {
                    setNeed_merge_count(((Integer) value).intValue());
                    break;
                } else {
                    unsetNeed_merge_count();
                    break;
                }
            case 11:
                if (value != null) {
                    setReview_plan_count(((Integer) value).intValue());
                    break;
                } else {
                    unsetReview_plan_count();
                    break;
                }
            case 12:
                if (value != null) {
                    setExamPreparation((ExamPreparation) value);
                    break;
                } else {
                    unsetExamPreparation();
                    break;
                }
            case 13:
                if (value != null) {
                    setMode_switch_url((String) value);
                    break;
                } else {
                    unsetMode_switch_url();
                    break;
                }
            case 14:
                if (value != null) {
                    setGame_mode(((Integer) value).intValue());
                    break;
                } else {
                    unsetGame_mode();
                    break;
                }
        }
    }

    public boolean equals(UserSelectedBookInfo that) {
        if (that == null || this.book_id != that.book_id) {
            return false;
        }
        boolean isSetSelected_end_time = isSetSelected_end_time();
        boolean isSetSelected_end_time2 = that.isSetSelected_end_time();
        if (((isSetSelected_end_time || isSetSelected_end_time2) && (!isSetSelected_end_time || !isSetSelected_end_time2 || this.selected_end_time != that.selected_end_time)) || this.learned_words_count != that.learned_words_count || this.last_touch_at != that.last_touch_at || this.roadmap_version != that.roadmap_version || this.word_fm_updated_at != that.word_fm_updated_at) {
            return false;
        }
        boolean isSetGroup_id = isSetGroup_id();
        boolean isSetGroup_id2 = that.isSetGroup_id();
        if ((isSetGroup_id || isSetGroup_id2) && !(isSetGroup_id && isSetGroup_id2 && this.group_id == that.group_id)) {
            return false;
        }
        boolean isSetDaily_plan_count = isSetDaily_plan_count();
        boolean isSetDaily_plan_count2 = that.isSetDaily_plan_count();
        if ((isSetDaily_plan_count || isSetDaily_plan_count2) && !(isSetDaily_plan_count && isSetDaily_plan_count2 && this.daily_plan_count == that.daily_plan_count)) {
            return false;
        }
        boolean isSetPoster_updated_at = isSetPoster_updated_at();
        boolean isSetPoster_updated_at2 = that.isSetPoster_updated_at();
        if ((isSetPoster_updated_at || isSetPoster_updated_at2) && !(isSetPoster_updated_at && isSetPoster_updated_at2 && this.poster_updated_at == that.poster_updated_at)) {
            return false;
        }
        boolean isSetNeed_merge_count = isSetNeed_merge_count();
        boolean isSetNeed_merge_count2 = that.isSetNeed_merge_count();
        if ((isSetNeed_merge_count || isSetNeed_merge_count2) && !(isSetNeed_merge_count && isSetNeed_merge_count2 && this.need_merge_count == that.need_merge_count)) {
            return false;
        }
        boolean isSetReview_plan_count = isSetReview_plan_count();
        boolean isSetReview_plan_count2 = that.isSetReview_plan_count();
        if ((isSetReview_plan_count || isSetReview_plan_count2) && !(isSetReview_plan_count && isSetReview_plan_count2 && this.review_plan_count == that.review_plan_count)) {
            return false;
        }
        boolean isSetExamPreparation = isSetExamPreparation();
        boolean isSetExamPreparation2 = that.isSetExamPreparation();
        if ((isSetExamPreparation || isSetExamPreparation2) && !(isSetExamPreparation && isSetExamPreparation2 && this.examPreparation.equals(that.examPreparation))) {
            return false;
        }
        boolean isSetMode_switch_url = isSetMode_switch_url();
        boolean isSetMode_switch_url2 = that.isSetMode_switch_url();
        if ((isSetMode_switch_url || isSetMode_switch_url2) && !(isSetMode_switch_url && isSetMode_switch_url2 && this.mode_switch_url.equals(that.mode_switch_url))) {
            return false;
        }
        boolean isSetGame_mode = isSetGame_mode();
        boolean isSetGame_mode2 = that.isSetGame_mode();
        if (isSetGame_mode || isSetGame_mode2) {
            return isSetGame_mode && isSetGame_mode2 && this.game_mode == that.game_mode;
        }
        return true;
    }

    public UserSelectedBookInfo(int book_id, int learned_words_count, long last_touch_at, long roadmap_version, long word_fm_updated_at) {
        this();
        this.book_id = book_id;
        setBook_idIsSet(true);
        this.learned_words_count = learned_words_count;
        setLearned_words_countIsSet(true);
        this.last_touch_at = last_touch_at;
        setLast_touch_atIsSet(true);
        this.roadmap_version = roadmap_version;
        setRoadmap_versionIsSet(true);
        this.word_fm_updated_at = word_fm_updated_at;
        setWord_fm_updated_atIsSet(true);
    }

    public UserSelectedBookInfo(UserSelectedBookInfo other) {
        this.__isset_bitfield = (short) 0;
        this.optionals = new _Fields[]{_Fields.SELECTED_END_TIME, _Fields.GROUP_ID, _Fields.DAILY_PLAN_COUNT, _Fields.POSTER_UPDATED_AT, _Fields.NEED_MERGE_COUNT, _Fields.REVIEW_PLAN_COUNT, _Fields.EXAM_PREPARATION, _Fields.MODE_SWITCH_URL, _Fields.GAME_MODE};
        this.__isset_bitfield = other.__isset_bitfield;
        this.book_id = other.book_id;
        this.selected_end_time = other.selected_end_time;
        this.learned_words_count = other.learned_words_count;
        this.last_touch_at = other.last_touch_at;
        this.roadmap_version = other.roadmap_version;
        this.word_fm_updated_at = other.word_fm_updated_at;
        this.group_id = other.group_id;
        this.daily_plan_count = other.daily_plan_count;
        this.poster_updated_at = other.poster_updated_at;
        this.need_merge_count = other.need_merge_count;
        this.review_plan_count = other.review_plan_count;
        if (other.isSetExamPreparation()) {
            this.examPreparation = new ExamPreparation(other.examPreparation);
        }
        if (other.isSetMode_switch_url()) {
            this.mode_switch_url = other.mode_switch_url;
        }
        this.game_mode = other.game_mode;
    }
}
