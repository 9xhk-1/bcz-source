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
public class WordNote implements TBase<WordNote, _Fields>, Serializable, Cloneable, Comparable<WordNote> {
    private static final int __TOPIC_ID_ISSET_ID = 0;
    private static final int __VERSION_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String note;
    public int topic_id;
    public int version;
    private static final TStruct STRUCT_DESC = new TStruct("WordNote");
    private static final TField TOPIC_ID_FIELD_DESC = new TField("topic_id", (byte) 8, 1);
    private static final TField NOTE_FIELD_DESC = new TField("note", (byte) 11, 2);
    private static final TField VERSION_FIELD_DESC = new TField("version", (byte) 8, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.WordNote$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$WordNote$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$WordNote$_Fields = iArr;
            try {
                iArr[_Fields.TOPIC_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$WordNote$_Fields[_Fields.NOTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$WordNote$_Fields[_Fields.VERSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WordNoteStandardScheme extends StandardScheme<WordNote> {
        private WordNoteStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, WordNote struct) throws TException {
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
                            struct.version = iprot.readI32();
                            struct.setVersionIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.note = iprot.readString();
                        struct.setNoteIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.topic_id = iprot.readI32();
                    struct.setTopic_idIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetTopic_id()) {
                throw new TProtocolException("Required field 'topic_id' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetVersion()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'version' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, WordNote struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(WordNote.STRUCT_DESC);
            oprot.writeFieldBegin(WordNote.TOPIC_ID_FIELD_DESC);
            oprot.writeI32(struct.topic_id);
            oprot.writeFieldEnd();
            if (struct.note != null) {
                oprot.writeFieldBegin(WordNote.NOTE_FIELD_DESC);
                oprot.writeString(struct.note);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(WordNote.VERSION_FIELD_DESC);
            oprot.writeI32(struct.version);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WordNoteStandardSchemeFactory implements SchemeFactory {
        private WordNoteStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public WordNoteStandardScheme getScheme() {
            return new WordNoteStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WordNoteTupleScheme extends TupleScheme<WordNote> {
        private WordNoteTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, WordNote struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.topic_id = tTupleProtocol.readI32();
            struct.setTopic_idIsSet(true);
            struct.note = tTupleProtocol.readString();
            struct.setNoteIsSet(true);
            struct.version = tTupleProtocol.readI32();
            struct.setVersionIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, WordNote struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.topic_id);
            tTupleProtocol.writeString(struct.note);
            tTupleProtocol.writeI32(struct.version);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WordNoteTupleSchemeFactory implements SchemeFactory {
        private WordNoteTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public WordNoteTupleScheme getScheme() {
            return new WordNoteTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TOPIC_ID(1, "topic_id"),
        NOTE(2, "note"),
        VERSION(3, "version");

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
                return TOPIC_ID;
            }
            if (fieldId == 2) {
                return NOTE;
            }
            if (fieldId != 3) {
                return null;
            }
            return VERSION;
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
        hashMap.put(StandardScheme.class, new WordNoteStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new WordNoteTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TOPIC_ID, (_Fields) new FieldMetaData("topic_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.NOTE, (_Fields) new FieldMetaData("note", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.VERSION, (_Fields) new FieldMetaData("version", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(WordNote.class, unmodifiableMap);
    }

    public WordNote() {
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
        setTopic_idIsSet(false);
        this.topic_id = 0;
        this.note = null;
        setVersionIsSet(false);
        this.version = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof WordNote)) {
            return equals((WordNote) that);
        }
        return false;
    }

    public String getNote() {
        return this.note;
    }

    public int getTopic_id() {
        return this.topic_id;
    }

    public int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetNote() {
        return this.note != null;
    }

    public boolean isSetTopic_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetVersion() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public WordNote setNote(String note) {
        this.note = note;
        return this;
    }

    public void setNoteIsSet(boolean value) {
        if (value) {
            return;
        }
        this.note = null;
    }

    public WordNote setTopic_id(int topic_id) {
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        return this;
    }

    public void setTopic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public WordNote setVersion(int version) {
        this.version = version;
        setVersionIsSet(true);
        return this;
    }

    public void setVersionIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("WordNote(");
        sb2.append("topic_id:");
        sb2.append(this.topic_id);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("note:");
        String str = this.note;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("version:");
        sb2.append(this.version);
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetNote() {
        this.note = null;
    }

    public void unsetTopic_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetVersion() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void validate() throws TException {
        if (this.note != null) {
            return;
        }
        throw new TProtocolException("Required field 'note' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(WordNote other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetTopic_id()).compareTo(Boolean.valueOf(other.isSetTopic_id()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetTopic_id() && (compareTo3 = TBaseHelper.compareTo(this.topic_id, other.topic_id)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetNote()).compareTo(Boolean.valueOf(other.isSetNote()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetNote() && (compareTo2 = TBaseHelper.compareTo(this.note, other.note)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetVersion()).compareTo(Boolean.valueOf(other.isSetVersion()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetVersion() || (compareTo = TBaseHelper.compareTo(this.version, other.version)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<WordNote, _Fields> deepCopy2() {
        return new WordNote(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$WordNote$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getTopic_id());
        }
        if (i11 == 2) {
            return getNote();
        }
        if (i11 == 3) {
            return Integer.valueOf(getVersion());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$WordNote$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetTopic_id();
        }
        if (i11 == 2) {
            return isSetNote();
        }
        if (i11 == 3) {
            return isSetVersion();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$WordNote$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetTopic_id();
                return;
            } else {
                setTopic_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetNote();
                return;
            } else {
                setNote((String) value);
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetVersion();
        } else {
            setVersion(((Integer) value).intValue());
        }
    }

    public WordNote(int topic_id, String note, int version) {
        this();
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        this.note = note;
        this.version = version;
        setVersionIsSet(true);
    }

    public boolean equals(WordNote that) {
        if (that == null || this.topic_id != that.topic_id) {
            return false;
        }
        boolean isSetNote = isSetNote();
        boolean isSetNote2 = that.isSetNote();
        return (!(isSetNote || isSetNote2) || (isSetNote && isSetNote2 && this.note.equals(that.note))) && this.version == that.version;
    }

    public WordNote(WordNote other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.topic_id = other.topic_id;
        if (other.isSetNote()) {
            this.note = other.note;
        }
        this.version = other.version;
    }
}
