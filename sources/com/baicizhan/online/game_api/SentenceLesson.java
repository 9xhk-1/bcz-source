package com.baicizhan.online.game_api;

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
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class SentenceLesson implements TBase<SentenceLesson, _Fields>, Serializable, Cloneable, Comparable<SentenceLesson> {
    private static final int __CHAPTERID_ISSET_ID = 1;
    private static final int __GLOBALSEQNO_ISSET_ID = 3;
    private static final int __LESSONID_ISSET_ID = 0;
    private static final int __LESSONTYPE_ISSET_ID = 2;
    private static final int __SEQNO_ISSET_ID = 4;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int chapterId;
    public int globalSeqNo;
    public int lessonId;
    public int lessonType;
    public String name;
    public int seqNo;
    private static final TStruct STRUCT_DESC = new TStruct("SentenceLesson");
    private static final TField LESSON_ID_FIELD_DESC = new TField("lessonId", (byte) 8, 1);
    private static final TField NAME_FIELD_DESC = new TField("name", (byte) 11, 2);
    private static final TField CHAPTER_ID_FIELD_DESC = new TField("chapterId", (byte) 8, 3);
    private static final TField LESSON_TYPE_FIELD_DESC = new TField("lessonType", (byte) 8, 4);
    private static final TField GLOBAL_SEQ_NO_FIELD_DESC = new TField("globalSeqNo", (byte) 8, 5);
    private static final TField SEQ_NO_FIELD_DESC = new TField("seqNo", (byte) 8, 6);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.SentenceLesson$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$SentenceLesson$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$SentenceLesson$_Fields = iArr;
            try {
                iArr[_Fields.LESSON_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$SentenceLesson$_Fields[_Fields.NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$SentenceLesson$_Fields[_Fields.CHAPTER_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$SentenceLesson$_Fields[_Fields.LESSON_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$SentenceLesson$_Fields[_Fields.GLOBAL_SEQ_NO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$SentenceLesson$_Fields[_Fields.SEQ_NO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SentenceLessonStandardScheme extends StandardScheme<SentenceLesson> {
        private SentenceLessonStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, SentenceLesson struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetLessonId()) {
                        throw new TProtocolException("Required field 'lessonId' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetChapterId()) {
                        throw new TProtocolException("Required field 'chapterId' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetLessonType()) {
                        throw new TProtocolException("Required field 'lessonType' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetGlobalSeqNo()) {
                        throw new TProtocolException("Required field 'globalSeqNo' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetSeqNo()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'seqNo' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.lessonId = iprot.readI32();
                            struct.setLessonIdIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.name = iprot.readString();
                            struct.setNameIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.chapterId = iprot.readI32();
                            struct.setChapterIdIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.lessonType = iprot.readI32();
                            struct.setLessonTypeIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.globalSeqNo = iprot.readI32();
                            struct.setGlobalSeqNoIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.seqNo = iprot.readI32();
                            struct.setSeqNoIsSet(true);
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
        public void write(TProtocol oprot, SentenceLesson struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(SentenceLesson.STRUCT_DESC);
            oprot.writeFieldBegin(SentenceLesson.LESSON_ID_FIELD_DESC);
            oprot.writeI32(struct.lessonId);
            oprot.writeFieldEnd();
            if (struct.name != null) {
                oprot.writeFieldBegin(SentenceLesson.NAME_FIELD_DESC);
                oprot.writeString(struct.name);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(SentenceLesson.CHAPTER_ID_FIELD_DESC);
            oprot.writeI32(struct.chapterId);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(SentenceLesson.LESSON_TYPE_FIELD_DESC);
            oprot.writeI32(struct.lessonType);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(SentenceLesson.GLOBAL_SEQ_NO_FIELD_DESC);
            oprot.writeI32(struct.globalSeqNo);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(SentenceLesson.SEQ_NO_FIELD_DESC);
            oprot.writeI32(struct.seqNo);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SentenceLessonStandardSchemeFactory implements SchemeFactory {
        private SentenceLessonStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SentenceLessonStandardScheme getScheme() {
            return new SentenceLessonStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SentenceLessonTupleScheme extends TupleScheme<SentenceLesson> {
        private SentenceLessonTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, SentenceLesson struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.lessonId = tTupleProtocol.readI32();
            struct.setLessonIdIsSet(true);
            struct.name = tTupleProtocol.readString();
            struct.setNameIsSet(true);
            struct.chapterId = tTupleProtocol.readI32();
            struct.setChapterIdIsSet(true);
            struct.lessonType = tTupleProtocol.readI32();
            struct.setLessonTypeIsSet(true);
            struct.globalSeqNo = tTupleProtocol.readI32();
            struct.setGlobalSeqNoIsSet(true);
            struct.seqNo = tTupleProtocol.readI32();
            struct.setSeqNoIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, SentenceLesson struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.lessonId);
            tTupleProtocol.writeString(struct.name);
            tTupleProtocol.writeI32(struct.chapterId);
            tTupleProtocol.writeI32(struct.lessonType);
            tTupleProtocol.writeI32(struct.globalSeqNo);
            tTupleProtocol.writeI32(struct.seqNo);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SentenceLessonTupleSchemeFactory implements SchemeFactory {
        private SentenceLessonTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SentenceLessonTupleScheme getScheme() {
            return new SentenceLessonTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        LESSON_ID(1, "lessonId"),
        NAME(2, "name"),
        CHAPTER_ID(3, "chapterId"),
        LESSON_TYPE(4, "lessonType"),
        GLOBAL_SEQ_NO(5, "globalSeqNo"),
        SEQ_NO(6, "seqNo");

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
                    return LESSON_ID;
                case 2:
                    return NAME;
                case 3:
                    return CHAPTER_ID;
                case 4:
                    return LESSON_TYPE;
                case 5:
                    return GLOBAL_SEQ_NO;
                case 6:
                    return SEQ_NO;
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
        hashMap.put(StandardScheme.class, new SentenceLessonStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new SentenceLessonTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.LESSON_ID, (_Fields) new FieldMetaData("lessonId", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.NAME, (_Fields) new FieldMetaData("name", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.CHAPTER_ID, (_Fields) new FieldMetaData("chapterId", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.LESSON_TYPE, (_Fields) new FieldMetaData("lessonType", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.GLOBAL_SEQ_NO, (_Fields) new FieldMetaData("globalSeqNo", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.SEQ_NO, (_Fields) new FieldMetaData("seqNo", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(SentenceLesson.class, unmodifiableMap);
    }

    public SentenceLesson() {
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
        setLessonIdIsSet(false);
        this.lessonId = 0;
        this.name = null;
        setChapterIdIsSet(false);
        this.chapterId = 0;
        setLessonTypeIsSet(false);
        this.lessonType = 0;
        setGlobalSeqNoIsSet(false);
        this.globalSeqNo = 0;
        setSeqNoIsSet(false);
        this.seqNo = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof SentenceLesson)) {
            return equals((SentenceLesson) that);
        }
        return false;
    }

    public int getChapterId() {
        return this.chapterId;
    }

    public int getGlobalSeqNo() {
        return this.globalSeqNo;
    }

    public int getLessonId() {
        return this.lessonId;
    }

    public int getLessonType() {
        return this.lessonType;
    }

    public String getName() {
        return this.name;
    }

    public int getSeqNo() {
        return this.seqNo;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetChapterId() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetGlobalSeqNo() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetLessonId() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetLessonType() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetName() {
        return this.name != null;
    }

    public boolean isSetSeqNo() {
        return EncodingUtils.testBit(this.__isset_bitfield, 4);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public SentenceLesson setChapterId(int chapterId) {
        this.chapterId = chapterId;
        setChapterIdIsSet(true);
        return this;
    }

    public void setChapterIdIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public SentenceLesson setGlobalSeqNo(int globalSeqNo) {
        this.globalSeqNo = globalSeqNo;
        setGlobalSeqNoIsSet(true);
        return this;
    }

    public void setGlobalSeqNoIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public SentenceLesson setLessonId(int lessonId) {
        this.lessonId = lessonId;
        setLessonIdIsSet(true);
        return this;
    }

    public void setLessonIdIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public SentenceLesson setLessonType(int lessonType) {
        this.lessonType = lessonType;
        setLessonTypeIsSet(true);
        return this;
    }

    public void setLessonTypeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public SentenceLesson setName(String name) {
        this.name = name;
        return this;
    }

    public void setNameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.name = null;
    }

    public SentenceLesson setSeqNo(int seqNo) {
        this.seqNo = seqNo;
        setSeqNoIsSet(true);
        return this;
    }

    public void setSeqNoIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 4, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SentenceLesson(");
        sb2.append("lessonId:");
        sb2.append(this.lessonId);
        sb2.append(j2.O);
        sb2.append("name:");
        String str = this.name;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("chapterId:");
        sb2.append(this.chapterId);
        sb2.append(j2.O);
        sb2.append("lessonType:");
        sb2.append(this.lessonType);
        sb2.append(j2.O);
        sb2.append("globalSeqNo:");
        sb2.append(this.globalSeqNo);
        sb2.append(j2.O);
        sb2.append("seqNo:");
        sb2.append(this.seqNo);
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetChapterId() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetGlobalSeqNo() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetLessonId() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetLessonType() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetName() {
        this.name = null;
    }

    public void unsetSeqNo() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 4);
    }

    public void validate() throws TException {
        if (this.name != null) {
            return;
        }
        throw new TProtocolException("Required field 'name' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(SentenceLesson other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo7 = Boolean.valueOf(isSetLessonId()).compareTo(Boolean.valueOf(other.isSetLessonId()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetLessonId() && (compareTo6 = TBaseHelper.compareTo(this.lessonId, other.lessonId)) != 0) {
            return compareTo6;
        }
        int compareTo8 = Boolean.valueOf(isSetName()).compareTo(Boolean.valueOf(other.isSetName()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetName() && (compareTo5 = TBaseHelper.compareTo(this.name, other.name)) != 0) {
            return compareTo5;
        }
        int compareTo9 = Boolean.valueOf(isSetChapterId()).compareTo(Boolean.valueOf(other.isSetChapterId()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetChapterId() && (compareTo4 = TBaseHelper.compareTo(this.chapterId, other.chapterId)) != 0) {
            return compareTo4;
        }
        int compareTo10 = Boolean.valueOf(isSetLessonType()).compareTo(Boolean.valueOf(other.isSetLessonType()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetLessonType() && (compareTo3 = TBaseHelper.compareTo(this.lessonType, other.lessonType)) != 0) {
            return compareTo3;
        }
        int compareTo11 = Boolean.valueOf(isSetGlobalSeqNo()).compareTo(Boolean.valueOf(other.isSetGlobalSeqNo()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetGlobalSeqNo() && (compareTo2 = TBaseHelper.compareTo(this.globalSeqNo, other.globalSeqNo)) != 0) {
            return compareTo2;
        }
        int compareTo12 = Boolean.valueOf(isSetSeqNo()).compareTo(Boolean.valueOf(other.isSetSeqNo()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (!isSetSeqNo() || (compareTo = TBaseHelper.compareTo(this.seqNo, other.seqNo)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<SentenceLesson, _Fields> deepCopy2() {
        return new SentenceLesson(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$SentenceLesson$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getLessonId());
            case 2:
                return getName();
            case 3:
                return Integer.valueOf(getChapterId());
            case 4:
                return Integer.valueOf(getLessonType());
            case 5:
                return Integer.valueOf(getGlobalSeqNo());
            case 6:
                return Integer.valueOf(getSeqNo());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$SentenceLesson$_Fields[field.ordinal()]) {
            case 1:
                return isSetLessonId();
            case 2:
                return isSetName();
            case 3:
                return isSetChapterId();
            case 4:
                return isSetLessonType();
            case 5:
                return isSetGlobalSeqNo();
            case 6:
                return isSetSeqNo();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$SentenceLesson$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setLessonId(((Integer) value).intValue());
                    break;
                } else {
                    unsetLessonId();
                    break;
                }
            case 2:
                if (value != null) {
                    setName((String) value);
                    break;
                } else {
                    unsetName();
                    break;
                }
            case 3:
                if (value != null) {
                    setChapterId(((Integer) value).intValue());
                    break;
                } else {
                    unsetChapterId();
                    break;
                }
            case 4:
                if (value != null) {
                    setLessonType(((Integer) value).intValue());
                    break;
                } else {
                    unsetLessonType();
                    break;
                }
            case 5:
                if (value != null) {
                    setGlobalSeqNo(((Integer) value).intValue());
                    break;
                } else {
                    unsetGlobalSeqNo();
                    break;
                }
            case 6:
                if (value != null) {
                    setSeqNo(((Integer) value).intValue());
                    break;
                } else {
                    unsetSeqNo();
                    break;
                }
        }
    }

    public SentenceLesson(int lessonId, String name, int chapterId, int lessonType, int globalSeqNo, int seqNo) {
        this();
        this.lessonId = lessonId;
        setLessonIdIsSet(true);
        this.name = name;
        this.chapterId = chapterId;
        setChapterIdIsSet(true);
        this.lessonType = lessonType;
        setLessonTypeIsSet(true);
        this.globalSeqNo = globalSeqNo;
        setGlobalSeqNoIsSet(true);
        this.seqNo = seqNo;
        setSeqNoIsSet(true);
    }

    public boolean equals(SentenceLesson that) {
        if (that == null || this.lessonId != that.lessonId) {
            return false;
        }
        boolean isSetName = isSetName();
        boolean isSetName2 = that.isSetName();
        return (!(isSetName || isSetName2) || (isSetName && isSetName2 && this.name.equals(that.name))) && this.chapterId == that.chapterId && this.lessonType == that.lessonType && this.globalSeqNo == that.globalSeqNo && this.seqNo == that.seqNo;
    }

    public SentenceLesson(SentenceLesson other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.lessonId = other.lessonId;
        if (other.isSetName()) {
            this.name = other.name;
        }
        this.chapterId = other.chapterId;
        this.lessonType = other.lessonType;
        this.globalSeqNo = other.globalSeqNo;
        this.seqNo = other.seqNo;
    }
}
