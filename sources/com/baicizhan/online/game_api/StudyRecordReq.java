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
public class StudyRecordReq implements TBase<StudyRecordReq, _Fields>, Serializable, Cloneable, Comparable<StudyRecordReq> {
    private static final int __BOOK_ID_ISSET_ID = 0;
    private static final int __STUDY_RECORD_ISSET_ID = 1;
    private static final int __WORD_ABILITY_ISSET_ID = 2;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int book_id;
    public boolean study_record;
    public boolean word_ability;
    private static final TStruct STRUCT_DESC = new TStruct("StudyRecordReq");
    private static final TField BOOK_ID_FIELD_DESC = new TField("book_id", (byte) 8, 1);
    private static final TField STUDY_RECORD_FIELD_DESC = new TField("study_record", (byte) 2, 2);
    private static final TField WORD_ABILITY_FIELD_DESC = new TField("word_ability", (byte) 2, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.StudyRecordReq$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$StudyRecordReq$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$StudyRecordReq$_Fields = iArr;
            try {
                iArr[_Fields.BOOK_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$StudyRecordReq$_Fields[_Fields.STUDY_RECORD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$StudyRecordReq$_Fields[_Fields.WORD_ABILITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StudyRecordReqStandardScheme extends StandardScheme<StudyRecordReq> {
        private StudyRecordReqStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, StudyRecordReq struct) throws TException {
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
                        } else if (b11 == 2) {
                            struct.word_ability = iprot.readBool();
                            struct.setWord_abilityIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 2) {
                        struct.study_record = iprot.readBool();
                        struct.setStudy_recordIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.book_id = iprot.readI32();
                    struct.setBook_idIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetBook_id()) {
                throw new TProtocolException("Required field 'book_id' was not found in serialized data! Struct: " + toString());
            }
            if (!struct.isSetStudy_record()) {
                throw new TProtocolException("Required field 'study_record' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetWord_ability()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'word_ability' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, StudyRecordReq struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(StudyRecordReq.STRUCT_DESC);
            oprot.writeFieldBegin(StudyRecordReq.BOOK_ID_FIELD_DESC);
            oprot.writeI32(struct.book_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(StudyRecordReq.STUDY_RECORD_FIELD_DESC);
            oprot.writeBool(struct.study_record);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(StudyRecordReq.WORD_ABILITY_FIELD_DESC);
            oprot.writeBool(struct.word_ability);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StudyRecordReqStandardSchemeFactory implements SchemeFactory {
        private StudyRecordReqStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public StudyRecordReqStandardScheme getScheme() {
            return new StudyRecordReqStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StudyRecordReqTupleScheme extends TupleScheme<StudyRecordReq> {
        private StudyRecordReqTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, StudyRecordReq struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.book_id = tTupleProtocol.readI32();
            struct.setBook_idIsSet(true);
            struct.study_record = tTupleProtocol.readBool();
            struct.setStudy_recordIsSet(true);
            struct.word_ability = tTupleProtocol.readBool();
            struct.setWord_abilityIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, StudyRecordReq struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.book_id);
            tTupleProtocol.writeBool(struct.study_record);
            tTupleProtocol.writeBool(struct.word_ability);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StudyRecordReqTupleSchemeFactory implements SchemeFactory {
        private StudyRecordReqTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public StudyRecordReqTupleScheme getScheme() {
            return new StudyRecordReqTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        BOOK_ID(1, "book_id"),
        STUDY_RECORD(2, "study_record"),
        WORD_ABILITY(3, "word_ability");

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
                return BOOK_ID;
            }
            if (fieldId == 2) {
                return STUDY_RECORD;
            }
            if (fieldId != 3) {
                return null;
            }
            return WORD_ABILITY;
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
        hashMap.put(StandardScheme.class, new StudyRecordReqStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new StudyRecordReqTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.BOOK_ID, (_Fields) new FieldMetaData("book_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.STUDY_RECORD, (_Fields) new FieldMetaData("study_record", (byte) 1, new FieldValueMetaData((byte) 2)));
        enumMap.put((EnumMap) _Fields.WORD_ABILITY, (_Fields) new FieldMetaData("word_ability", (byte) 1, new FieldValueMetaData((byte) 2)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(StudyRecordReq.class, unmodifiableMap);
    }

    public StudyRecordReq() {
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
        setBook_idIsSet(false);
        this.book_id = 0;
        setStudy_recordIsSet(false);
        this.study_record = false;
        setWord_abilityIsSet(false);
        this.word_ability = false;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof StudyRecordReq)) {
            return equals((StudyRecordReq) that);
        }
        return false;
    }

    public int getBook_id() {
        return this.book_id;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetBook_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetStudy_record() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetWord_ability() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isStudy_record() {
        return this.study_record;
    }

    public boolean isWord_ability() {
        return this.word_ability;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public StudyRecordReq setBook_id(int book_id) {
        this.book_id = book_id;
        setBook_idIsSet(true);
        return this;
    }

    public void setBook_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public StudyRecordReq setStudy_record(boolean study_record) {
        this.study_record = study_record;
        setStudy_recordIsSet(true);
        return this;
    }

    public void setStudy_recordIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public StudyRecordReq setWord_ability(boolean word_ability) {
        this.word_ability = word_ability;
        setWord_abilityIsSet(true);
        return this;
    }

    public void setWord_abilityIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public String toString() {
        return "StudyRecordReq(book_id:" + this.book_id + j2.O + "study_record:" + this.study_record + j2.O + "word_ability:" + this.word_ability + pn.j.f81007d;
    }

    public void unsetBook_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetStudy_record() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetWord_ability() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(StudyRecordReq other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetBook_id()).compareTo(Boolean.valueOf(other.isSetBook_id()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetBook_id() && (compareTo3 = TBaseHelper.compareTo(this.book_id, other.book_id)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetStudy_record()).compareTo(Boolean.valueOf(other.isSetStudy_record()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetStudy_record() && (compareTo2 = TBaseHelper.compareTo(this.study_record, other.study_record)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetWord_ability()).compareTo(Boolean.valueOf(other.isSetWord_ability()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetWord_ability() || (compareTo = TBaseHelper.compareTo(this.word_ability, other.word_ability)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<StudyRecordReq, _Fields> deepCopy2() {
        return new StudyRecordReq(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$StudyRecordReq$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getBook_id());
        }
        if (i11 == 2) {
            return Boolean.valueOf(isStudy_record());
        }
        if (i11 == 3) {
            return Boolean.valueOf(isWord_ability());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$StudyRecordReq$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetBook_id();
        }
        if (i11 == 2) {
            return isSetStudy_record();
        }
        if (i11 == 3) {
            return isSetWord_ability();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$StudyRecordReq$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetBook_id();
                return;
            } else {
                setBook_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetStudy_record();
                return;
            } else {
                setStudy_record(((Boolean) value).booleanValue());
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetWord_ability();
        } else {
            setWord_ability(((Boolean) value).booleanValue());
        }
    }

    public StudyRecordReq(int book_id, boolean study_record, boolean word_ability) {
        this();
        this.book_id = book_id;
        setBook_idIsSet(true);
        this.study_record = study_record;
        setStudy_recordIsSet(true);
        this.word_ability = word_ability;
        setWord_abilityIsSet(true);
    }

    public boolean equals(StudyRecordReq that) {
        return that != null && this.book_id == that.book_id && this.study_record == that.study_record && this.word_ability == that.word_ability;
    }

    public StudyRecordReq(StudyRecordReq other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.book_id = other.book_id;
        this.study_record = other.study_record;
        this.word_ability = other.word_ability;
    }

    public void validate() throws TException {
    }
}
