package com.baicizhan.online.user_study_api;

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
public class StudyHomeToday implements TBase<StudyHomeToday, _Fields>, Serializable, Cloneable, Comparable<StudyHomeToday> {
    private static final int __BOOK_FINISHED_ISSET_ID = 5;
    private static final int __FINISHED_ISSET_ID = 4;
    private static final int __LEARNED_ISSET_ID = 0;
    private static final int __LEARNING_FINISHED_ISSET_ID = 7;
    private static final int __LEARNING_FINISHED_TODAY_ISSET_ID = 6;
    private static final int __LEARNING_PLAN_ISSET_ID = 1;
    private static final int __REVIEWED_ISSET_ID = 2;
    private static final int __REVIEW_PLAN_ISSET_ID = 3;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public boolean book_finished;
    public boolean finished;
    public int learned;
    public boolean learning_finished;
    public boolean learning_finished_today;
    public int learning_plan;
    public int review_plan;
    public int reviewed;
    private static final TStruct STRUCT_DESC = new TStruct("StudyHomeToday");
    private static final TField LEARNED_FIELD_DESC = new TField("learned", (byte) 8, 1);
    private static final TField LEARNING_PLAN_FIELD_DESC = new TField("learning_plan", (byte) 8, 2);
    private static final TField REVIEWED_FIELD_DESC = new TField("reviewed", (byte) 8, 3);
    private static final TField REVIEW_PLAN_FIELD_DESC = new TField("review_plan", (byte) 8, 4);
    private static final TField FINISHED_FIELD_DESC = new TField("finished", (byte) 2, 5);
    private static final TField BOOK_FINISHED_FIELD_DESC = new TField("book_finished", (byte) 2, 6);
    private static final TField LEARNING_FINISHED_TODAY_FIELD_DESC = new TField("learning_finished_today", (byte) 2, 7);
    private static final TField LEARNING_FINISHED_FIELD_DESC = new TField("learning_finished", (byte) 2, 8);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.StudyHomeToday$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$StudyHomeToday$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$StudyHomeToday$_Fields = iArr;
            try {
                iArr[_Fields.LEARNED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$StudyHomeToday$_Fields[_Fields.LEARNING_PLAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$StudyHomeToday$_Fields[_Fields.REVIEWED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$StudyHomeToday$_Fields[_Fields.REVIEW_PLAN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$StudyHomeToday$_Fields[_Fields.FINISHED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$StudyHomeToday$_Fields[_Fields.BOOK_FINISHED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$StudyHomeToday$_Fields[_Fields.LEARNING_FINISHED_TODAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$StudyHomeToday$_Fields[_Fields.LEARNING_FINISHED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StudyHomeTodayStandardScheme extends StandardScheme<StudyHomeToday> {
        private StudyHomeTodayStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, StudyHomeToday struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetLearned()) {
                        throw new TProtocolException("Required field 'learned' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetLearning_plan()) {
                        throw new TProtocolException("Required field 'learning_plan' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetReviewed()) {
                        throw new TProtocolException("Required field 'reviewed' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetReview_plan()) {
                        throw new TProtocolException("Required field 'review_plan' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetFinished()) {
                        throw new TProtocolException("Required field 'finished' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetBook_finished()) {
                        throw new TProtocolException("Required field 'book_finished' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetLearning_finished_today()) {
                        throw new TProtocolException("Required field 'learning_finished_today' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetLearning_finished()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'learning_finished' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.learned = iprot.readI32();
                            struct.setLearnedIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.learning_plan = iprot.readI32();
                            struct.setLearning_planIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.reviewed = iprot.readI32();
                            struct.setReviewedIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.review_plan = iprot.readI32();
                            struct.setReview_planIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 2) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.finished = iprot.readBool();
                            struct.setFinishedIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 2) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.book_finished = iprot.readBool();
                            struct.setBook_finishedIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 2) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.learning_finished_today = iprot.readBool();
                            struct.setLearning_finished_todayIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 2) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.learning_finished = iprot.readBool();
                            struct.setLearning_finishedIsSet(true);
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
        public void write(TProtocol oprot, StudyHomeToday struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(StudyHomeToday.STRUCT_DESC);
            oprot.writeFieldBegin(StudyHomeToday.LEARNED_FIELD_DESC);
            oprot.writeI32(struct.learned);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(StudyHomeToday.LEARNING_PLAN_FIELD_DESC);
            oprot.writeI32(struct.learning_plan);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(StudyHomeToday.REVIEWED_FIELD_DESC);
            oprot.writeI32(struct.reviewed);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(StudyHomeToday.REVIEW_PLAN_FIELD_DESC);
            oprot.writeI32(struct.review_plan);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(StudyHomeToday.FINISHED_FIELD_DESC);
            oprot.writeBool(struct.finished);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(StudyHomeToday.BOOK_FINISHED_FIELD_DESC);
            oprot.writeBool(struct.book_finished);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(StudyHomeToday.LEARNING_FINISHED_TODAY_FIELD_DESC);
            oprot.writeBool(struct.learning_finished_today);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(StudyHomeToday.LEARNING_FINISHED_FIELD_DESC);
            oprot.writeBool(struct.learning_finished);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StudyHomeTodayStandardSchemeFactory implements SchemeFactory {
        private StudyHomeTodayStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public StudyHomeTodayStandardScheme getScheme() {
            return new StudyHomeTodayStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StudyHomeTodayTupleScheme extends TupleScheme<StudyHomeToday> {
        private StudyHomeTodayTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, StudyHomeToday struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.learned = tTupleProtocol.readI32();
            struct.setLearnedIsSet(true);
            struct.learning_plan = tTupleProtocol.readI32();
            struct.setLearning_planIsSet(true);
            struct.reviewed = tTupleProtocol.readI32();
            struct.setReviewedIsSet(true);
            struct.review_plan = tTupleProtocol.readI32();
            struct.setReview_planIsSet(true);
            struct.finished = tTupleProtocol.readBool();
            struct.setFinishedIsSet(true);
            struct.book_finished = tTupleProtocol.readBool();
            struct.setBook_finishedIsSet(true);
            struct.learning_finished_today = tTupleProtocol.readBool();
            struct.setLearning_finished_todayIsSet(true);
            struct.learning_finished = tTupleProtocol.readBool();
            struct.setLearning_finishedIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, StudyHomeToday struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.learned);
            tTupleProtocol.writeI32(struct.learning_plan);
            tTupleProtocol.writeI32(struct.reviewed);
            tTupleProtocol.writeI32(struct.review_plan);
            tTupleProtocol.writeBool(struct.finished);
            tTupleProtocol.writeBool(struct.book_finished);
            tTupleProtocol.writeBool(struct.learning_finished_today);
            tTupleProtocol.writeBool(struct.learning_finished);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StudyHomeTodayTupleSchemeFactory implements SchemeFactory {
        private StudyHomeTodayTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public StudyHomeTodayTupleScheme getScheme() {
            return new StudyHomeTodayTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        LEARNED(1, "learned"),
        LEARNING_PLAN(2, "learning_plan"),
        REVIEWED(3, "reviewed"),
        REVIEW_PLAN(4, "review_plan"),
        FINISHED(5, "finished"),
        BOOK_FINISHED(6, "book_finished"),
        LEARNING_FINISHED_TODAY(7, "learning_finished_today"),
        LEARNING_FINISHED(8, "learning_finished");

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
                    return LEARNED;
                case 2:
                    return LEARNING_PLAN;
                case 3:
                    return REVIEWED;
                case 4:
                    return REVIEW_PLAN;
                case 5:
                    return FINISHED;
                case 6:
                    return BOOK_FINISHED;
                case 7:
                    return LEARNING_FINISHED_TODAY;
                case 8:
                    return LEARNING_FINISHED;
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
        hashMap.put(StandardScheme.class, new StudyHomeTodayStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new StudyHomeTodayTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.LEARNED, (_Fields) new FieldMetaData("learned", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.LEARNING_PLAN, (_Fields) new FieldMetaData("learning_plan", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.REVIEWED, (_Fields) new FieldMetaData("reviewed", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.REVIEW_PLAN, (_Fields) new FieldMetaData("review_plan", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.FINISHED, (_Fields) new FieldMetaData("finished", (byte) 1, new FieldValueMetaData((byte) 2)));
        enumMap.put((EnumMap) _Fields.BOOK_FINISHED, (_Fields) new FieldMetaData("book_finished", (byte) 1, new FieldValueMetaData((byte) 2)));
        enumMap.put((EnumMap) _Fields.LEARNING_FINISHED_TODAY, (_Fields) new FieldMetaData("learning_finished_today", (byte) 1, new FieldValueMetaData((byte) 2)));
        enumMap.put((EnumMap) _Fields.LEARNING_FINISHED, (_Fields) new FieldMetaData("learning_finished", (byte) 1, new FieldValueMetaData((byte) 2)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(StudyHomeToday.class, unmodifiableMap);
    }

    public StudyHomeToday() {
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
        setLearnedIsSet(false);
        this.learned = 0;
        setLearning_planIsSet(false);
        this.learning_plan = 0;
        setReviewedIsSet(false);
        this.reviewed = 0;
        setReview_planIsSet(false);
        this.review_plan = 0;
        setFinishedIsSet(false);
        this.finished = false;
        setBook_finishedIsSet(false);
        this.book_finished = false;
        setLearning_finished_todayIsSet(false);
        this.learning_finished_today = false;
        setLearning_finishedIsSet(false);
        this.learning_finished = false;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof StudyHomeToday)) {
            return equals((StudyHomeToday) that);
        }
        return false;
    }

    public int getLearned() {
        return this.learned;
    }

    public int getLearning_plan() {
        return this.learning_plan;
    }

    public int getReview_plan() {
        return this.review_plan;
    }

    public int getReviewed() {
        return this.reviewed;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isBook_finished() {
        return this.book_finished;
    }

    public boolean isFinished() {
        return this.finished;
    }

    public boolean isLearning_finished() {
        return this.learning_finished;
    }

    public boolean isLearning_finished_today() {
        return this.learning_finished_today;
    }

    public boolean isSetBook_finished() {
        return EncodingUtils.testBit(this.__isset_bitfield, 5);
    }

    public boolean isSetFinished() {
        return EncodingUtils.testBit(this.__isset_bitfield, 4);
    }

    public boolean isSetLearned() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetLearning_finished() {
        return EncodingUtils.testBit(this.__isset_bitfield, 7);
    }

    public boolean isSetLearning_finished_today() {
        return EncodingUtils.testBit(this.__isset_bitfield, 6);
    }

    public boolean isSetLearning_plan() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetReview_plan() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetReviewed() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public StudyHomeToday setBook_finished(boolean book_finished) {
        this.book_finished = book_finished;
        setBook_finishedIsSet(true);
        return this;
    }

    public void setBook_finishedIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 5, value);
    }

    public StudyHomeToday setFinished(boolean finished) {
        this.finished = finished;
        setFinishedIsSet(true);
        return this;
    }

    public void setFinishedIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 4, value);
    }

    public StudyHomeToday setLearned(int learned) {
        this.learned = learned;
        setLearnedIsSet(true);
        return this;
    }

    public void setLearnedIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public StudyHomeToday setLearning_finished(boolean learning_finished) {
        this.learning_finished = learning_finished;
        setLearning_finishedIsSet(true);
        return this;
    }

    public void setLearning_finishedIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 7, value);
    }

    public StudyHomeToday setLearning_finished_today(boolean learning_finished_today) {
        this.learning_finished_today = learning_finished_today;
        setLearning_finished_todayIsSet(true);
        return this;
    }

    public void setLearning_finished_todayIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 6, value);
    }

    public StudyHomeToday setLearning_plan(int learning_plan) {
        this.learning_plan = learning_plan;
        setLearning_planIsSet(true);
        return this;
    }

    public void setLearning_planIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public StudyHomeToday setReview_plan(int review_plan) {
        this.review_plan = review_plan;
        setReview_planIsSet(true);
        return this;
    }

    public void setReview_planIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public StudyHomeToday setReviewed(int reviewed) {
        this.reviewed = reviewed;
        setReviewedIsSet(true);
        return this;
    }

    public void setReviewedIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public String toString() {
        return "StudyHomeToday(learned:" + this.learned + org.junit.jupiter.api.j2.O + "learning_plan:" + this.learning_plan + org.junit.jupiter.api.j2.O + "reviewed:" + this.reviewed + org.junit.jupiter.api.j2.O + "review_plan:" + this.review_plan + org.junit.jupiter.api.j2.O + "finished:" + this.finished + org.junit.jupiter.api.j2.O + "book_finished:" + this.book_finished + org.junit.jupiter.api.j2.O + "learning_finished_today:" + this.learning_finished_today + org.junit.jupiter.api.j2.O + "learning_finished:" + this.learning_finished + pn.j.f81007d;
    }

    public void unsetBook_finished() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 5);
    }

    public void unsetFinished() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 4);
    }

    public void unsetLearned() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetLearning_finished() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 7);
    }

    public void unsetLearning_finished_today() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 6);
    }

    public void unsetLearning_plan() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetReview_plan() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetReviewed() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(StudyHomeToday other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        int compareTo7;
        int compareTo8;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo9 = Boolean.valueOf(isSetLearned()).compareTo(Boolean.valueOf(other.isSetLearned()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetLearned() && (compareTo8 = TBaseHelper.compareTo(this.learned, other.learned)) != 0) {
            return compareTo8;
        }
        int compareTo10 = Boolean.valueOf(isSetLearning_plan()).compareTo(Boolean.valueOf(other.isSetLearning_plan()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetLearning_plan() && (compareTo7 = TBaseHelper.compareTo(this.learning_plan, other.learning_plan)) != 0) {
            return compareTo7;
        }
        int compareTo11 = Boolean.valueOf(isSetReviewed()).compareTo(Boolean.valueOf(other.isSetReviewed()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetReviewed() && (compareTo6 = TBaseHelper.compareTo(this.reviewed, other.reviewed)) != 0) {
            return compareTo6;
        }
        int compareTo12 = Boolean.valueOf(isSetReview_plan()).compareTo(Boolean.valueOf(other.isSetReview_plan()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetReview_plan() && (compareTo5 = TBaseHelper.compareTo(this.review_plan, other.review_plan)) != 0) {
            return compareTo5;
        }
        int compareTo13 = Boolean.valueOf(isSetFinished()).compareTo(Boolean.valueOf(other.isSetFinished()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetFinished() && (compareTo4 = TBaseHelper.compareTo(this.finished, other.finished)) != 0) {
            return compareTo4;
        }
        int compareTo14 = Boolean.valueOf(isSetBook_finished()).compareTo(Boolean.valueOf(other.isSetBook_finished()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (isSetBook_finished() && (compareTo3 = TBaseHelper.compareTo(this.book_finished, other.book_finished)) != 0) {
            return compareTo3;
        }
        int compareTo15 = Boolean.valueOf(isSetLearning_finished_today()).compareTo(Boolean.valueOf(other.isSetLearning_finished_today()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (isSetLearning_finished_today() && (compareTo2 = TBaseHelper.compareTo(this.learning_finished_today, other.learning_finished_today)) != 0) {
            return compareTo2;
        }
        int compareTo16 = Boolean.valueOf(isSetLearning_finished()).compareTo(Boolean.valueOf(other.isSetLearning_finished()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (!isSetLearning_finished() || (compareTo = TBaseHelper.compareTo(this.learning_finished, other.learning_finished)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<StudyHomeToday, _Fields> deepCopy2() {
        return new StudyHomeToday(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$StudyHomeToday$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getLearned());
            case 2:
                return Integer.valueOf(getLearning_plan());
            case 3:
                return Integer.valueOf(getReviewed());
            case 4:
                return Integer.valueOf(getReview_plan());
            case 5:
                return Boolean.valueOf(isFinished());
            case 6:
                return Boolean.valueOf(isBook_finished());
            case 7:
                return Boolean.valueOf(isLearning_finished_today());
            case 8:
                return Boolean.valueOf(isLearning_finished());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$StudyHomeToday$_Fields[field.ordinal()]) {
            case 1:
                return isSetLearned();
            case 2:
                return isSetLearning_plan();
            case 3:
                return isSetReviewed();
            case 4:
                return isSetReview_plan();
            case 5:
                return isSetFinished();
            case 6:
                return isSetBook_finished();
            case 7:
                return isSetLearning_finished_today();
            case 8:
                return isSetLearning_finished();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$StudyHomeToday$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setLearned(((Integer) value).intValue());
                    break;
                } else {
                    unsetLearned();
                    break;
                }
            case 2:
                if (value != null) {
                    setLearning_plan(((Integer) value).intValue());
                    break;
                } else {
                    unsetLearning_plan();
                    break;
                }
            case 3:
                if (value != null) {
                    setReviewed(((Integer) value).intValue());
                    break;
                } else {
                    unsetReviewed();
                    break;
                }
            case 4:
                if (value != null) {
                    setReview_plan(((Integer) value).intValue());
                    break;
                } else {
                    unsetReview_plan();
                    break;
                }
            case 5:
                if (value != null) {
                    setFinished(((Boolean) value).booleanValue());
                    break;
                } else {
                    unsetFinished();
                    break;
                }
            case 6:
                if (value != null) {
                    setBook_finished(((Boolean) value).booleanValue());
                    break;
                } else {
                    unsetBook_finished();
                    break;
                }
            case 7:
                if (value != null) {
                    setLearning_finished_today(((Boolean) value).booleanValue());
                    break;
                } else {
                    unsetLearning_finished_today();
                    break;
                }
            case 8:
                if (value != null) {
                    setLearning_finished(((Boolean) value).booleanValue());
                    break;
                } else {
                    unsetLearning_finished();
                    break;
                }
        }
    }

    public StudyHomeToday(int learned, int learning_plan, int reviewed, int review_plan, boolean finished, boolean book_finished, boolean learning_finished_today, boolean learning_finished) {
        this();
        this.learned = learned;
        setLearnedIsSet(true);
        this.learning_plan = learning_plan;
        setLearning_planIsSet(true);
        this.reviewed = reviewed;
        setReviewedIsSet(true);
        this.review_plan = review_plan;
        setReview_planIsSet(true);
        this.finished = finished;
        setFinishedIsSet(true);
        this.book_finished = book_finished;
        setBook_finishedIsSet(true);
        this.learning_finished_today = learning_finished_today;
        setLearning_finished_todayIsSet(true);
        this.learning_finished = learning_finished;
        setLearning_finishedIsSet(true);
    }

    public boolean equals(StudyHomeToday that) {
        return that != null && this.learned == that.learned && this.learning_plan == that.learning_plan && this.reviewed == that.reviewed && this.review_plan == that.review_plan && this.finished == that.finished && this.book_finished == that.book_finished && this.learning_finished_today == that.learning_finished_today && this.learning_finished == that.learning_finished;
    }

    public void validate() throws TException {
    }

    public StudyHomeToday(StudyHomeToday other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.learned = other.learned;
        this.learning_plan = other.learning_plan;
        this.reviewed = other.reviewed;
        this.review_plan = other.review_plan;
        this.finished = other.finished;
        this.book_finished = other.book_finished;
        this.learning_finished_today = other.learning_finished_today;
        this.learning_finished = other.learning_finished;
    }
}
