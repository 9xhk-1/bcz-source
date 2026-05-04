package com.baicizhan.online.hero_api;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TBase;
import org.apache.thrift.TBaseHelper;
import org.apache.thrift.TException;
import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TField;
import org.apache.thrift.protocol.TList;
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
public class AnswerInfo implements TBase<AnswerInfo, _Fields>, Serializable, Cloneable, Comparable<AnswerInfo> {
    private static final int __CORRECT_OPT_INDEX_ISSET_ID = 0;
    private static final int __USER_OPT_INDEX_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int correct_opt_index;
    public List<Integer> opt_count;
    public QuestionInfo question;
    public int user_opt_index;
    private static final TStruct STRUCT_DESC = new TStruct("AnswerInfo");
    private static final TField QUESTION_FIELD_DESC = new TField("question", (byte) 12, 1);
    private static final TField CORRECT_OPT_INDEX_FIELD_DESC = new TField("correct_opt_index", (byte) 8, 2);
    private static final TField USER_OPT_INDEX_FIELD_DESC = new TField("user_opt_index", (byte) 8, 3);
    private static final TField OPT_COUNT_FIELD_DESC = new TField("opt_count", (byte) 15, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.hero_api.AnswerInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$hero_api$AnswerInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$hero_api$AnswerInfo$_Fields = iArr;
            try {
                iArr[_Fields.QUESTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$hero_api$AnswerInfo$_Fields[_Fields.CORRECT_OPT_INDEX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$hero_api$AnswerInfo$_Fields[_Fields.USER_OPT_INDEX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$hero_api$AnswerInfo$_Fields[_Fields.OPT_COUNT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AnswerInfoStandardScheme extends StandardScheme<AnswerInfo> {
        private AnswerInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, AnswerInfo struct) throws TException {
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
                            } else if (b11 == 15) {
                                TList readListBegin = iprot.readListBegin();
                                struct.opt_count = new ArrayList(readListBegin.size);
                                for (int i11 = 0; i11 < readListBegin.size; i11++) {
                                    struct.opt_count.add(Integer.valueOf(iprot.readI32()));
                                }
                                iprot.readListEnd();
                                struct.setOpt_countIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 8) {
                            struct.user_opt_index = iprot.readI32();
                            struct.setUser_opt_indexIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.correct_opt_index = iprot.readI32();
                        struct.setCorrect_opt_indexIsSet(true);
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
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetCorrect_opt_index()) {
                throw new TProtocolException("Required field 'correct_opt_index' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetUser_opt_index()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'user_opt_index' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, AnswerInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(AnswerInfo.STRUCT_DESC);
            if (struct.question != null) {
                oprot.writeFieldBegin(AnswerInfo.QUESTION_FIELD_DESC);
                struct.question.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(AnswerInfo.CORRECT_OPT_INDEX_FIELD_DESC);
            oprot.writeI32(struct.correct_opt_index);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(AnswerInfo.USER_OPT_INDEX_FIELD_DESC);
            oprot.writeI32(struct.user_opt_index);
            oprot.writeFieldEnd();
            if (struct.opt_count != null) {
                oprot.writeFieldBegin(AnswerInfo.OPT_COUNT_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 8, struct.opt_count.size()));
                Iterator<Integer> it = struct.opt_count.iterator();
                while (it.hasNext()) {
                    oprot.writeI32(it.next().intValue());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AnswerInfoStandardSchemeFactory implements SchemeFactory {
        private AnswerInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AnswerInfoStandardScheme getScheme() {
            return new AnswerInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AnswerInfoTupleScheme extends TupleScheme<AnswerInfo> {
        private AnswerInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, AnswerInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            QuestionInfo questionInfo = new QuestionInfo();
            struct.question = questionInfo;
            questionInfo.read(tTupleProtocol);
            struct.setQuestionIsSet(true);
            struct.correct_opt_index = tTupleProtocol.readI32();
            struct.setCorrect_opt_indexIsSet(true);
            struct.user_opt_index = tTupleProtocol.readI32();
            struct.setUser_opt_indexIsSet(true);
            TList tList = new TList((byte) 8, tTupleProtocol.readI32());
            struct.opt_count = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                struct.opt_count.add(Integer.valueOf(tTupleProtocol.readI32()));
            }
            struct.setOpt_countIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, AnswerInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.question.write(tTupleProtocol);
            tTupleProtocol.writeI32(struct.correct_opt_index);
            tTupleProtocol.writeI32(struct.user_opt_index);
            tTupleProtocol.writeI32(struct.opt_count.size());
            Iterator<Integer> it = struct.opt_count.iterator();
            while (it.hasNext()) {
                tTupleProtocol.writeI32(it.next().intValue());
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AnswerInfoTupleSchemeFactory implements SchemeFactory {
        private AnswerInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AnswerInfoTupleScheme getScheme() {
            return new AnswerInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        QUESTION(1, "question"),
        CORRECT_OPT_INDEX(2, "correct_opt_index"),
        USER_OPT_INDEX(3, "user_opt_index"),
        OPT_COUNT(4, "opt_count");

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
                return QUESTION;
            }
            if (fieldId == 2) {
                return CORRECT_OPT_INDEX;
            }
            if (fieldId == 3) {
                return USER_OPT_INDEX;
            }
            if (fieldId != 4) {
                return null;
            }
            return OPT_COUNT;
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
        hashMap.put(StandardScheme.class, new AnswerInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new AnswerInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.QUESTION, (_Fields) new FieldMetaData("question", (byte) 1, new StructMetaData((byte) 12, QuestionInfo.class)));
        enumMap.put((EnumMap) _Fields.CORRECT_OPT_INDEX, (_Fields) new FieldMetaData("correct_opt_index", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.USER_OPT_INDEX, (_Fields) new FieldMetaData("user_opt_index", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.OPT_COUNT, (_Fields) new FieldMetaData("opt_count", (byte) 1, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 8))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(AnswerInfo.class, unmodifiableMap);
    }

    public AnswerInfo() {
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

    public void addToOpt_count(int elem) {
        if (this.opt_count == null) {
            this.opt_count = new ArrayList();
        }
        this.opt_count.add(Integer.valueOf(elem));
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.question = null;
        setCorrect_opt_indexIsSet(false);
        this.correct_opt_index = 0;
        setUser_opt_indexIsSet(false);
        this.user_opt_index = 0;
        this.opt_count = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof AnswerInfo)) {
            return equals((AnswerInfo) that);
        }
        return false;
    }

    public int getCorrect_opt_index() {
        return this.correct_opt_index;
    }

    public List<Integer> getOpt_count() {
        return this.opt_count;
    }

    public Iterator<Integer> getOpt_countIterator() {
        List<Integer> list = this.opt_count;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getOpt_countSize() {
        List<Integer> list = this.opt_count;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public QuestionInfo getQuestion() {
        return this.question;
    }

    public int getUser_opt_index() {
        return this.user_opt_index;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetCorrect_opt_index() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetOpt_count() {
        return this.opt_count != null;
    }

    public boolean isSetQuestion() {
        return this.question != null;
    }

    public boolean isSetUser_opt_index() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public AnswerInfo setCorrect_opt_index(int correct_opt_index) {
        this.correct_opt_index = correct_opt_index;
        setCorrect_opt_indexIsSet(true);
        return this;
    }

    public void setCorrect_opt_indexIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public AnswerInfo setOpt_count(List<Integer> opt_count) {
        this.opt_count = opt_count;
        return this;
    }

    public void setOpt_countIsSet(boolean value) {
        if (value) {
            return;
        }
        this.opt_count = null;
    }

    public AnswerInfo setQuestion(QuestionInfo question) {
        this.question = question;
        return this;
    }

    public void setQuestionIsSet(boolean value) {
        if (value) {
            return;
        }
        this.question = null;
    }

    public AnswerInfo setUser_opt_index(int user_opt_index) {
        this.user_opt_index = user_opt_index;
        setUser_opt_indexIsSet(true);
        return this;
    }

    public void setUser_opt_indexIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AnswerInfo(");
        sb2.append("question:");
        QuestionInfo questionInfo = this.question;
        if (questionInfo == null) {
            sb2.append("null");
        } else {
            sb2.append(questionInfo);
        }
        sb2.append(j2.O);
        sb2.append("correct_opt_index:");
        sb2.append(this.correct_opt_index);
        sb2.append(j2.O);
        sb2.append("user_opt_index:");
        sb2.append(this.user_opt_index);
        sb2.append(j2.O);
        sb2.append("opt_count:");
        List<Integer> list = this.opt_count;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetCorrect_opt_index() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetOpt_count() {
        this.opt_count = null;
    }

    public void unsetQuestion() {
        this.question = null;
    }

    public void unsetUser_opt_index() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void validate() throws TException {
        QuestionInfo questionInfo = this.question;
        if (questionInfo == null) {
            throw new TProtocolException("Required field 'question' was not present! Struct: " + toString());
        }
        if (this.opt_count != null) {
            if (questionInfo != null) {
                questionInfo.validate();
            }
        } else {
            throw new TProtocolException("Required field 'opt_count' was not present! Struct: " + toString());
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(AnswerInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetQuestion()).compareTo(Boolean.valueOf(other.isSetQuestion()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetQuestion() && (compareTo4 = TBaseHelper.compareTo((Comparable) this.question, (Comparable) other.question)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetCorrect_opt_index()).compareTo(Boolean.valueOf(other.isSetCorrect_opt_index()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetCorrect_opt_index() && (compareTo3 = TBaseHelper.compareTo(this.correct_opt_index, other.correct_opt_index)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetUser_opt_index()).compareTo(Boolean.valueOf(other.isSetUser_opt_index()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetUser_opt_index() && (compareTo2 = TBaseHelper.compareTo(this.user_opt_index, other.user_opt_index)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetOpt_count()).compareTo(Boolean.valueOf(other.isSetOpt_count()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetOpt_count() || (compareTo = TBaseHelper.compareTo((List) this.opt_count, (List) other.opt_count)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<AnswerInfo, _Fields> deepCopy2() {
        return new AnswerInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$AnswerInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getQuestion();
        }
        if (i11 == 2) {
            return Integer.valueOf(getCorrect_opt_index());
        }
        if (i11 == 3) {
            return Integer.valueOf(getUser_opt_index());
        }
        if (i11 == 4) {
            return getOpt_count();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$AnswerInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetQuestion();
        }
        if (i11 == 2) {
            return isSetCorrect_opt_index();
        }
        if (i11 == 3) {
            return isSetUser_opt_index();
        }
        if (i11 == 4) {
            return isSetOpt_count();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$AnswerInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetQuestion();
                return;
            } else {
                setQuestion((QuestionInfo) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetCorrect_opt_index();
                return;
            } else {
                setCorrect_opt_index(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetUser_opt_index();
                return;
            } else {
                setUser_opt_index(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetOpt_count();
        } else {
            setOpt_count((List) value);
        }
    }

    public AnswerInfo(QuestionInfo question, int correct_opt_index, int user_opt_index, List<Integer> opt_count) {
        this();
        this.question = question;
        this.correct_opt_index = correct_opt_index;
        setCorrect_opt_indexIsSet(true);
        this.user_opt_index = user_opt_index;
        setUser_opt_indexIsSet(true);
        this.opt_count = opt_count;
    }

    public boolean equals(AnswerInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetQuestion = isSetQuestion();
        boolean isSetQuestion2 = that.isSetQuestion();
        if (((isSetQuestion || isSetQuestion2) && (!isSetQuestion || !isSetQuestion2 || !this.question.equals(that.question))) || this.correct_opt_index != that.correct_opt_index || this.user_opt_index != that.user_opt_index) {
            return false;
        }
        boolean isSetOpt_count = isSetOpt_count();
        boolean isSetOpt_count2 = that.isSetOpt_count();
        if (isSetOpt_count || isSetOpt_count2) {
            return isSetOpt_count && isSetOpt_count2 && this.opt_count.equals(that.opt_count);
        }
        return true;
    }

    public AnswerInfo(AnswerInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetQuestion()) {
            this.question = new QuestionInfo(other.question);
        }
        this.correct_opt_index = other.correct_opt_index;
        this.user_opt_index = other.user_opt_index;
        if (other.isSetOpt_count()) {
            this.opt_count = new ArrayList(other.opt_count);
        }
    }
}
