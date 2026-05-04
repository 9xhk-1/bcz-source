package com.baicizhan.online.hero_api;

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
import org.apache.thrift.meta_data.EnumMetaData;
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
public class TopicInfo implements TBase<TopicInfo, _Fields>, Serializable, Cloneable, Comparable<TopicInfo> {
    private static final int __BEGIN_TIME_ISSET_ID = 0;
    private static final int __END_TIME_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public AnswerInfo answer;
    public long begin_time;
    public long end_time;
    private _Fields[] optionals;
    public QuestionInfo question;
    public TopicStatus status;
    private static final TStruct STRUCT_DESC = new TStruct("TopicInfo");
    private static final TField STATUS_FIELD_DESC = new TField("status", (byte) 8, 1);
    private static final TField QUESTION_FIELD_DESC = new TField("question", (byte) 12, 2);
    private static final TField ANSWER_FIELD_DESC = new TField("answer", (byte) 12, 3);
    private static final TField BEGIN_TIME_FIELD_DESC = new TField("begin_time", (byte) 10, 4);
    private static final TField END_TIME_FIELD_DESC = new TField("end_time", (byte) 10, 5);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.hero_api.TopicInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$hero_api$TopicInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$hero_api$TopicInfo$_Fields = iArr;
            try {
                iArr[_Fields.STATUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$hero_api$TopicInfo$_Fields[_Fields.QUESTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$hero_api$TopicInfo$_Fields[_Fields.ANSWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$hero_api$TopicInfo$_Fields[_Fields.BEGIN_TIME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$hero_api$TopicInfo$_Fields[_Fields.END_TIME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TopicInfoStandardScheme extends StandardScheme<TopicInfo> {
        private TopicInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, TopicInfo struct) throws TException {
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
                                } else if (b11 == 10) {
                                    struct.end_time = iprot.readI64();
                                    struct.setEnd_timeIsSet(true);
                                } else {
                                    TProtocolUtil.skip(iprot, b11);
                                }
                            } else if (b11 == 10) {
                                struct.begin_time = iprot.readI64();
                                struct.setBegin_timeIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            AnswerInfo answerInfo = new AnswerInfo();
                            struct.answer = answerInfo;
                            answerInfo.read(iprot);
                            struct.setAnswerIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 12) {
                        QuestionInfo questionInfo = new QuestionInfo();
                        struct.question = questionInfo;
                        questionInfo.read(iprot);
                        struct.setQuestionIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.status = TopicStatus.findByValue(iprot.readI32());
                    struct.setStatusIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetBegin_time()) {
                throw new TProtocolException("Required field 'begin_time' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetEnd_time()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'end_time' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, TopicInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(TopicInfo.STRUCT_DESC);
            if (struct.status != null) {
                oprot.writeFieldBegin(TopicInfo.STATUS_FIELD_DESC);
                oprot.writeI32(struct.status.getValue());
                oprot.writeFieldEnd();
            }
            if (struct.question != null && struct.isSetQuestion()) {
                oprot.writeFieldBegin(TopicInfo.QUESTION_FIELD_DESC);
                struct.question.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.answer != null && struct.isSetAnswer()) {
                oprot.writeFieldBegin(TopicInfo.ANSWER_FIELD_DESC);
                struct.answer.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(TopicInfo.BEGIN_TIME_FIELD_DESC);
            oprot.writeI64(struct.begin_time);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(TopicInfo.END_TIME_FIELD_DESC);
            oprot.writeI64(struct.end_time);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TopicInfoStandardSchemeFactory implements SchemeFactory {
        private TopicInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public TopicInfoStandardScheme getScheme() {
            return new TopicInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TopicInfoTupleScheme extends TupleScheme<TopicInfo> {
        private TopicInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, TopicInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.status = TopicStatus.findByValue(tTupleProtocol.readI32());
            struct.setStatusIsSet(true);
            struct.begin_time = tTupleProtocol.readI64();
            struct.setBegin_timeIsSet(true);
            struct.end_time = tTupleProtocol.readI64();
            struct.setEnd_timeIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(2);
            if (readBitSet.get(0)) {
                QuestionInfo questionInfo = new QuestionInfo();
                struct.question = questionInfo;
                questionInfo.read(tTupleProtocol);
                struct.setQuestionIsSet(true);
            }
            if (readBitSet.get(1)) {
                AnswerInfo answerInfo = new AnswerInfo();
                struct.answer = answerInfo;
                answerInfo.read(tTupleProtocol);
                struct.setAnswerIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, TopicInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.status.getValue());
            tTupleProtocol.writeI64(struct.begin_time);
            tTupleProtocol.writeI64(struct.end_time);
            BitSet bitSet = new BitSet();
            if (struct.isSetQuestion()) {
                bitSet.set(0);
            }
            if (struct.isSetAnswer()) {
                bitSet.set(1);
            }
            tTupleProtocol.writeBitSet(bitSet, 2);
            if (struct.isSetQuestion()) {
                struct.question.write(tTupleProtocol);
            }
            if (struct.isSetAnswer()) {
                struct.answer.write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TopicInfoTupleSchemeFactory implements SchemeFactory {
        private TopicInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public TopicInfoTupleScheme getScheme() {
            return new TopicInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        STATUS(1, "status"),
        QUESTION(2, "question"),
        ANSWER(3, "answer"),
        BEGIN_TIME(4, "begin_time"),
        END_TIME(5, "end_time");

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
                return STATUS;
            }
            if (fieldId == 2) {
                return QUESTION;
            }
            if (fieldId == 3) {
                return ANSWER;
            }
            if (fieldId == 4) {
                return BEGIN_TIME;
            }
            if (fieldId != 5) {
                return null;
            }
            return END_TIME;
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
        hashMap.put(StandardScheme.class, new TopicInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new TopicInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.STATUS, (_Fields) new FieldMetaData("status", (byte) 1, new EnumMetaData((byte) 16, TopicStatus.class)));
        enumMap.put((EnumMap) _Fields.QUESTION, (_Fields) new FieldMetaData("question", (byte) 2, new StructMetaData((byte) 12, QuestionInfo.class)));
        enumMap.put((EnumMap) _Fields.ANSWER, (_Fields) new FieldMetaData("answer", (byte) 2, new StructMetaData((byte) 12, AnswerInfo.class)));
        enumMap.put((EnumMap) _Fields.BEGIN_TIME, (_Fields) new FieldMetaData("begin_time", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.END_TIME, (_Fields) new FieldMetaData("end_time", (byte) 1, new FieldValueMetaData((byte) 10)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(TopicInfo.class, unmodifiableMap);
    }

    public TopicInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.QUESTION, _Fields.ANSWER};
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
        this.status = null;
        this.question = null;
        this.answer = null;
        setBegin_timeIsSet(false);
        this.begin_time = 0L;
        setEnd_timeIsSet(false);
        this.end_time = 0L;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof TopicInfo)) {
            return equals((TopicInfo) that);
        }
        return false;
    }

    public AnswerInfo getAnswer() {
        return this.answer;
    }

    public long getBegin_time() {
        return this.begin_time;
    }

    public long getEnd_time() {
        return this.end_time;
    }

    public QuestionInfo getQuestion() {
        return this.question;
    }

    public TopicStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAnswer() {
        return this.answer != null;
    }

    public boolean isSetBegin_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetEnd_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetQuestion() {
        return this.question != null;
    }

    public boolean isSetStatus() {
        return this.status != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public TopicInfo setAnswer(AnswerInfo answer) {
        this.answer = answer;
        return this;
    }

    public void setAnswerIsSet(boolean value) {
        if (value) {
            return;
        }
        this.answer = null;
    }

    public TopicInfo setBegin_time(long begin_time) {
        this.begin_time = begin_time;
        setBegin_timeIsSet(true);
        return this;
    }

    public void setBegin_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public TopicInfo setEnd_time(long end_time) {
        this.end_time = end_time;
        setEnd_timeIsSet(true);
        return this;
    }

    public void setEnd_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public TopicInfo setQuestion(QuestionInfo question) {
        this.question = question;
        return this;
    }

    public void setQuestionIsSet(boolean value) {
        if (value) {
            return;
        }
        this.question = null;
    }

    public TopicInfo setStatus(TopicStatus status) {
        this.status = status;
        return this;
    }

    public void setStatusIsSet(boolean value) {
        if (value) {
            return;
        }
        this.status = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TopicInfo(");
        sb2.append("status:");
        TopicStatus topicStatus = this.status;
        if (topicStatus == null) {
            sb2.append("null");
        } else {
            sb2.append(topicStatus);
        }
        if (isSetQuestion()) {
            sb2.append(j2.O);
            sb2.append("question:");
            QuestionInfo questionInfo = this.question;
            if (questionInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(questionInfo);
            }
        }
        if (isSetAnswer()) {
            sb2.append(j2.O);
            sb2.append("answer:");
            AnswerInfo answerInfo = this.answer;
            if (answerInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(answerInfo);
            }
        }
        sb2.append(j2.O);
        sb2.append("begin_time:");
        sb2.append(this.begin_time);
        sb2.append(j2.O);
        sb2.append("end_time:");
        sb2.append(this.end_time);
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAnswer() {
        this.answer = null;
    }

    public void unsetBegin_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetEnd_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetQuestion() {
        this.question = null;
    }

    public void unsetStatus() {
        this.status = null;
    }

    public void validate() throws TException {
        if (this.status == null) {
            throw new TProtocolException("Required field 'status' was not present! Struct: " + toString());
        }
        QuestionInfo questionInfo = this.question;
        if (questionInfo != null) {
            questionInfo.validate();
        }
        AnswerInfo answerInfo = this.answer;
        if (answerInfo != null) {
            answerInfo.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(TopicInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo6 = Boolean.valueOf(isSetStatus()).compareTo(Boolean.valueOf(other.isSetStatus()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetStatus() && (compareTo5 = TBaseHelper.compareTo((Comparable) this.status, (Comparable) other.status)) != 0) {
            return compareTo5;
        }
        int compareTo7 = Boolean.valueOf(isSetQuestion()).compareTo(Boolean.valueOf(other.isSetQuestion()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetQuestion() && (compareTo4 = TBaseHelper.compareTo((Comparable) this.question, (Comparable) other.question)) != 0) {
            return compareTo4;
        }
        int compareTo8 = Boolean.valueOf(isSetAnswer()).compareTo(Boolean.valueOf(other.isSetAnswer()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetAnswer() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.answer, (Comparable) other.answer)) != 0) {
            return compareTo3;
        }
        int compareTo9 = Boolean.valueOf(isSetBegin_time()).compareTo(Boolean.valueOf(other.isSetBegin_time()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetBegin_time() && (compareTo2 = TBaseHelper.compareTo(this.begin_time, other.begin_time)) != 0) {
            return compareTo2;
        }
        int compareTo10 = Boolean.valueOf(isSetEnd_time()).compareTo(Boolean.valueOf(other.isSetEnd_time()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!isSetEnd_time() || (compareTo = TBaseHelper.compareTo(this.end_time, other.end_time)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<TopicInfo, _Fields> deepCopy2() {
        return new TopicInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$TopicInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getStatus();
        }
        if (i11 == 2) {
            return getQuestion();
        }
        if (i11 == 3) {
            return getAnswer();
        }
        if (i11 == 4) {
            return Long.valueOf(getBegin_time());
        }
        if (i11 == 5) {
            return Long.valueOf(getEnd_time());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$TopicInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetStatus();
        }
        if (i11 == 2) {
            return isSetQuestion();
        }
        if (i11 == 3) {
            return isSetAnswer();
        }
        if (i11 == 4) {
            return isSetBegin_time();
        }
        if (i11 == 5) {
            return isSetEnd_time();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$TopicInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetStatus();
                return;
            } else {
                setStatus((TopicStatus) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetQuestion();
                return;
            } else {
                setQuestion((QuestionInfo) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetAnswer();
                return;
            } else {
                setAnswer((AnswerInfo) value);
                return;
            }
        }
        if (i11 == 4) {
            if (value == null) {
                unsetBegin_time();
                return;
            } else {
                setBegin_time(((Long) value).longValue());
                return;
            }
        }
        if (i11 != 5) {
            return;
        }
        if (value == null) {
            unsetEnd_time();
        } else {
            setEnd_time(((Long) value).longValue());
        }
    }

    public boolean equals(TopicInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetStatus = isSetStatus();
        boolean isSetStatus2 = that.isSetStatus();
        if ((isSetStatus || isSetStatus2) && !(isSetStatus && isSetStatus2 && this.status.equals(that.status))) {
            return false;
        }
        boolean isSetQuestion = isSetQuestion();
        boolean isSetQuestion2 = that.isSetQuestion();
        if ((isSetQuestion || isSetQuestion2) && !(isSetQuestion && isSetQuestion2 && this.question.equals(that.question))) {
            return false;
        }
        boolean isSetAnswer = isSetAnswer();
        boolean isSetAnswer2 = that.isSetAnswer();
        return (!(isSetAnswer || isSetAnswer2) || (isSetAnswer && isSetAnswer2 && this.answer.equals(that.answer))) && this.begin_time == that.begin_time && this.end_time == that.end_time;
    }

    public TopicInfo(TopicStatus status, long begin_time, long end_time) {
        this();
        this.status = status;
        this.begin_time = begin_time;
        setBegin_timeIsSet(true);
        this.end_time = end_time;
        setEnd_timeIsSet(true);
    }

    public TopicInfo(TopicInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.QUESTION, _Fields.ANSWER};
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetStatus()) {
            this.status = other.status;
        }
        if (other.isSetQuestion()) {
            this.question = new QuestionInfo(other.question);
        }
        if (other.isSetAnswer()) {
            this.answer = new AnswerInfo(other.answer);
        }
        this.begin_time = other.begin_time;
        this.end_time = other.end_time;
    }
}
