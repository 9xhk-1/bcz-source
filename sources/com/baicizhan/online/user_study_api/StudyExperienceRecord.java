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
public class StudyExperienceRecord implements TBase<StudyExperienceRecord, _Fields>, Serializable, Cloneable, Comparable<StudyExperienceRecord> {
    private static final int __BEHAVIOR_ISSET_ID = 0;
    private static final int __CNT_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int behavior;
    public int cnt;
    public String questionType;
    private static final TStruct STRUCT_DESC = new TStruct("StudyExperienceRecord");
    private static final TField QUESTION_TYPE_FIELD_DESC = new TField("questionType", (byte) 11, 1);
    private static final TField BEHAVIOR_FIELD_DESC = new TField("behavior", (byte) 8, 2);
    private static final TField CNT_FIELD_DESC = new TField("cnt", (byte) 8, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.StudyExperienceRecord$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$StudyExperienceRecord$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$StudyExperienceRecord$_Fields = iArr;
            try {
                iArr[_Fields.QUESTION_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$StudyExperienceRecord$_Fields[_Fields.BEHAVIOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$StudyExperienceRecord$_Fields[_Fields.CNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StudyExperienceRecordStandardScheme extends StandardScheme<StudyExperienceRecord> {
        private StudyExperienceRecordStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, StudyExperienceRecord struct) throws TException {
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
                            TProtocolUtil.skip(iprot, b11);
                        } else if (b11 == 8) {
                            struct.cnt = iprot.readI32();
                            struct.setCntIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.behavior = iprot.readI32();
                        struct.setBehaviorIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.questionType = iprot.readString();
                    struct.setQuestionTypeIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetBehavior()) {
                throw new TProtocolException("Required field 'behavior' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetCnt()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'cnt' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, StudyExperienceRecord struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(StudyExperienceRecord.STRUCT_DESC);
            if (struct.questionType != null) {
                oprot.writeFieldBegin(StudyExperienceRecord.QUESTION_TYPE_FIELD_DESC);
                oprot.writeString(struct.questionType);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(StudyExperienceRecord.BEHAVIOR_FIELD_DESC);
            oprot.writeI32(struct.behavior);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(StudyExperienceRecord.CNT_FIELD_DESC);
            oprot.writeI32(struct.cnt);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StudyExperienceRecordStandardSchemeFactory implements SchemeFactory {
        private StudyExperienceRecordStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public StudyExperienceRecordStandardScheme getScheme() {
            return new StudyExperienceRecordStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StudyExperienceRecordTupleScheme extends TupleScheme<StudyExperienceRecord> {
        private StudyExperienceRecordTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, StudyExperienceRecord struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.questionType = tTupleProtocol.readString();
            struct.setQuestionTypeIsSet(true);
            struct.behavior = tTupleProtocol.readI32();
            struct.setBehaviorIsSet(true);
            struct.cnt = tTupleProtocol.readI32();
            struct.setCntIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, StudyExperienceRecord struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.questionType);
            tTupleProtocol.writeI32(struct.behavior);
            tTupleProtocol.writeI32(struct.cnt);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StudyExperienceRecordTupleSchemeFactory implements SchemeFactory {
        private StudyExperienceRecordTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public StudyExperienceRecordTupleScheme getScheme() {
            return new StudyExperienceRecordTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        QUESTION_TYPE(1, "questionType"),
        BEHAVIOR(2, "behavior"),
        CNT(3, "cnt");

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
                return QUESTION_TYPE;
            }
            if (fieldId == 2) {
                return BEHAVIOR;
            }
            if (fieldId != 3) {
                return null;
            }
            return CNT;
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
        hashMap.put(StandardScheme.class, new StudyExperienceRecordStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new StudyExperienceRecordTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.QUESTION_TYPE, (_Fields) new FieldMetaData("questionType", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.BEHAVIOR, (_Fields) new FieldMetaData("behavior", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.CNT, (_Fields) new FieldMetaData("cnt", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(StudyExperienceRecord.class, unmodifiableMap);
    }

    public StudyExperienceRecord() {
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
        this.questionType = null;
        setBehaviorIsSet(false);
        this.behavior = 0;
        setCntIsSet(false);
        this.cnt = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof StudyExperienceRecord)) {
            return equals((StudyExperienceRecord) that);
        }
        return false;
    }

    public int getBehavior() {
        return this.behavior;
    }

    public int getCnt() {
        return this.cnt;
    }

    public String getQuestionType() {
        return this.questionType;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetBehavior() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetCnt() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetQuestionType() {
        return this.questionType != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public StudyExperienceRecord setBehavior(int behavior) {
        this.behavior = behavior;
        setBehaviorIsSet(true);
        return this;
    }

    public void setBehaviorIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public StudyExperienceRecord setCnt(int cnt) {
        this.cnt = cnt;
        setCntIsSet(true);
        return this;
    }

    public void setCntIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public StudyExperienceRecord setQuestionType(String questionType) {
        this.questionType = questionType;
        return this;
    }

    public void setQuestionTypeIsSet(boolean value) {
        if (value) {
            return;
        }
        this.questionType = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("StudyExperienceRecord(");
        sb2.append("questionType:");
        String str = this.questionType;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("behavior:");
        sb2.append(this.behavior);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("cnt:");
        sb2.append(this.cnt);
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetBehavior() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetCnt() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetQuestionType() {
        this.questionType = null;
    }

    public void validate() throws TException {
        if (this.questionType != null) {
            return;
        }
        throw new TProtocolException("Required field 'questionType' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(StudyExperienceRecord other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetQuestionType()).compareTo(Boolean.valueOf(other.isSetQuestionType()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetQuestionType() && (compareTo3 = TBaseHelper.compareTo(this.questionType, other.questionType)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetBehavior()).compareTo(Boolean.valueOf(other.isSetBehavior()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetBehavior() && (compareTo2 = TBaseHelper.compareTo(this.behavior, other.behavior)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetCnt()).compareTo(Boolean.valueOf(other.isSetCnt()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetCnt() || (compareTo = TBaseHelper.compareTo(this.cnt, other.cnt)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<StudyExperienceRecord, _Fields> deepCopy2() {
        return new StudyExperienceRecord(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$StudyExperienceRecord$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getQuestionType();
        }
        if (i11 == 2) {
            return Integer.valueOf(getBehavior());
        }
        if (i11 == 3) {
            return Integer.valueOf(getCnt());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$StudyExperienceRecord$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetQuestionType();
        }
        if (i11 == 2) {
            return isSetBehavior();
        }
        if (i11 == 3) {
            return isSetCnt();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$StudyExperienceRecord$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetQuestionType();
                return;
            } else {
                setQuestionType((String) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetBehavior();
                return;
            } else {
                setBehavior(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetCnt();
        } else {
            setCnt(((Integer) value).intValue());
        }
    }

    public StudyExperienceRecord(String questionType, int behavior, int cnt) {
        this();
        this.questionType = questionType;
        this.behavior = behavior;
        setBehaviorIsSet(true);
        this.cnt = cnt;
        setCntIsSet(true);
    }

    public boolean equals(StudyExperienceRecord that) {
        if (that == null) {
            return false;
        }
        boolean isSetQuestionType = isSetQuestionType();
        boolean isSetQuestionType2 = that.isSetQuestionType();
        return (!(isSetQuestionType || isSetQuestionType2) || (isSetQuestionType && isSetQuestionType2 && this.questionType.equals(that.questionType))) && this.behavior == that.behavior && this.cnt == that.cnt;
    }

    public StudyExperienceRecord(StudyExperienceRecord other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetQuestionType()) {
            this.questionType = other.questionType;
        }
        this.behavior = other.behavior;
        this.cnt = other.cnt;
    }
}
