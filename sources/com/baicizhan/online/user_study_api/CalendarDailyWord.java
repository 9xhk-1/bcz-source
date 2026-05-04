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
public class CalendarDailyWord implements TBase<CalendarDailyWord, _Fields>, Serializable, Cloneable, Comparable<CalendarDailyWord> {
    private static final int __TOPIC_ID_ISSET_ID = 0;
    private static final int __WORD_LEVEL_ID_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String accent;
    public String audio_uri;
    public String mean;
    public int topic_id;
    public String word;
    public int word_level_id;
    private static final TStruct STRUCT_DESC = new TStruct("CalendarDailyWord");
    private static final TField TOPIC_ID_FIELD_DESC = new TField("topic_id", (byte) 8, 1);
    private static final TField WORD_FIELD_DESC = new TField("word", (byte) 11, 2);
    private static final TField MEAN_FIELD_DESC = new TField(com.baicizhan.main.wikiv2.studyv2.data.t.f26099a, (byte) 11, 3);
    private static final TField ACCENT_FIELD_DESC = new TField("accent", (byte) 11, 4);
    private static final TField AUDIO_URI_FIELD_DESC = new TField("audio_uri", (byte) 11, 5);
    private static final TField WORD_LEVEL_ID_FIELD_DESC = new TField(ma.b.f72894c, (byte) 8, 6);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.CalendarDailyWord$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$CalendarDailyWord$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$CalendarDailyWord$_Fields = iArr;
            try {
                iArr[_Fields.TOPIC_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$CalendarDailyWord$_Fields[_Fields.WORD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$CalendarDailyWord$_Fields[_Fields.MEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$CalendarDailyWord$_Fields[_Fields.ACCENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$CalendarDailyWord$_Fields[_Fields.AUDIO_URI.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$CalendarDailyWord$_Fields[_Fields.WORD_LEVEL_ID.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CalendarDailyWordStandardScheme extends StandardScheme<CalendarDailyWord> {
        private CalendarDailyWordStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, CalendarDailyWord struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetTopic_id()) {
                        throw new TProtocolException("Required field 'topic_id' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetWord_level_id()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'word_level_id' was not found in serialized data! Struct: " + toString());
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
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.word = iprot.readString();
                            struct.setWordIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.mean = iprot.readString();
                            struct.setMeanIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.accent = iprot.readString();
                            struct.setAccentIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.audio_uri = iprot.readString();
                            struct.setAudio_uriIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.word_level_id = iprot.readI32();
                            struct.setWord_level_idIsSet(true);
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
        public void write(TProtocol oprot, CalendarDailyWord struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(CalendarDailyWord.STRUCT_DESC);
            oprot.writeFieldBegin(CalendarDailyWord.TOPIC_ID_FIELD_DESC);
            oprot.writeI32(struct.topic_id);
            oprot.writeFieldEnd();
            if (struct.word != null) {
                oprot.writeFieldBegin(CalendarDailyWord.WORD_FIELD_DESC);
                oprot.writeString(struct.word);
                oprot.writeFieldEnd();
            }
            if (struct.mean != null) {
                oprot.writeFieldBegin(CalendarDailyWord.MEAN_FIELD_DESC);
                oprot.writeString(struct.mean);
                oprot.writeFieldEnd();
            }
            if (struct.accent != null) {
                oprot.writeFieldBegin(CalendarDailyWord.ACCENT_FIELD_DESC);
                oprot.writeString(struct.accent);
                oprot.writeFieldEnd();
            }
            if (struct.audio_uri != null) {
                oprot.writeFieldBegin(CalendarDailyWord.AUDIO_URI_FIELD_DESC);
                oprot.writeString(struct.audio_uri);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(CalendarDailyWord.WORD_LEVEL_ID_FIELD_DESC);
            oprot.writeI32(struct.word_level_id);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CalendarDailyWordStandardSchemeFactory implements SchemeFactory {
        private CalendarDailyWordStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public CalendarDailyWordStandardScheme getScheme() {
            return new CalendarDailyWordStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CalendarDailyWordTupleScheme extends TupleScheme<CalendarDailyWord> {
        private CalendarDailyWordTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, CalendarDailyWord struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.topic_id = tTupleProtocol.readI32();
            struct.setTopic_idIsSet(true);
            struct.word = tTupleProtocol.readString();
            struct.setWordIsSet(true);
            struct.mean = tTupleProtocol.readString();
            struct.setMeanIsSet(true);
            struct.accent = tTupleProtocol.readString();
            struct.setAccentIsSet(true);
            struct.audio_uri = tTupleProtocol.readString();
            struct.setAudio_uriIsSet(true);
            struct.word_level_id = tTupleProtocol.readI32();
            struct.setWord_level_idIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, CalendarDailyWord struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.topic_id);
            tTupleProtocol.writeString(struct.word);
            tTupleProtocol.writeString(struct.mean);
            tTupleProtocol.writeString(struct.accent);
            tTupleProtocol.writeString(struct.audio_uri);
            tTupleProtocol.writeI32(struct.word_level_id);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CalendarDailyWordTupleSchemeFactory implements SchemeFactory {
        private CalendarDailyWordTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public CalendarDailyWordTupleScheme getScheme() {
            return new CalendarDailyWordTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TOPIC_ID(1, "topic_id"),
        WORD(2, "word"),
        MEAN(3, com.baicizhan.main.wikiv2.studyv2.data.t.f26099a),
        ACCENT(4, "accent"),
        AUDIO_URI(5, "audio_uri"),
        WORD_LEVEL_ID(6, ma.b.f72894c);

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
                    return WORD;
                case 3:
                    return MEAN;
                case 4:
                    return ACCENT;
                case 5:
                    return AUDIO_URI;
                case 6:
                    return WORD_LEVEL_ID;
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
        hashMap.put(StandardScheme.class, new CalendarDailyWordStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new CalendarDailyWordTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TOPIC_ID, (_Fields) new FieldMetaData("topic_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.WORD, (_Fields) new FieldMetaData("word", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.MEAN, (_Fields) new FieldMetaData(com.baicizhan.main.wikiv2.studyv2.data.t.f26099a, (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ACCENT, (_Fields) new FieldMetaData("accent", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.AUDIO_URI, (_Fields) new FieldMetaData("audio_uri", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.WORD_LEVEL_ID, (_Fields) new FieldMetaData(ma.b.f72894c, (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(CalendarDailyWord.class, unmodifiableMap);
    }

    public CalendarDailyWord() {
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
        this.word = null;
        this.mean = null;
        this.accent = null;
        this.audio_uri = null;
        setWord_level_idIsSet(false);
        this.word_level_id = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof CalendarDailyWord)) {
            return equals((CalendarDailyWord) that);
        }
        return false;
    }

    public String getAccent() {
        return this.accent;
    }

    public String getAudio_uri() {
        return this.audio_uri;
    }

    public String getMean() {
        return this.mean;
    }

    public int getTopic_id() {
        return this.topic_id;
    }

    public String getWord() {
        return this.word;
    }

    public int getWord_level_id() {
        return this.word_level_id;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAccent() {
        return this.accent != null;
    }

    public boolean isSetAudio_uri() {
        return this.audio_uri != null;
    }

    public boolean isSetMean() {
        return this.mean != null;
    }

    public boolean isSetTopic_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetWord() {
        return this.word != null;
    }

    public boolean isSetWord_level_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public CalendarDailyWord setAccent(String accent) {
        this.accent = accent;
        return this;
    }

    public void setAccentIsSet(boolean value) {
        if (value) {
            return;
        }
        this.accent = null;
    }

    public CalendarDailyWord setAudio_uri(String audio_uri) {
        this.audio_uri = audio_uri;
        return this;
    }

    public void setAudio_uriIsSet(boolean value) {
        if (value) {
            return;
        }
        this.audio_uri = null;
    }

    public CalendarDailyWord setMean(String mean) {
        this.mean = mean;
        return this;
    }

    public void setMeanIsSet(boolean value) {
        if (value) {
            return;
        }
        this.mean = null;
    }

    public CalendarDailyWord setTopic_id(int topic_id) {
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        return this;
    }

    public void setTopic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public CalendarDailyWord setWord(String word) {
        this.word = word;
        return this;
    }

    public void setWordIsSet(boolean value) {
        if (value) {
            return;
        }
        this.word = null;
    }

    public CalendarDailyWord setWord_level_id(int word_level_id) {
        this.word_level_id = word_level_id;
        setWord_level_idIsSet(true);
        return this;
    }

    public void setWord_level_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CalendarDailyWord(");
        sb2.append("topic_id:");
        sb2.append(this.topic_id);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("word:");
        String str = this.word;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("mean:");
        String str2 = this.mean;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("accent:");
        String str3 = this.accent;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("audio_uri:");
        String str4 = this.audio_uri;
        if (str4 == null) {
            sb2.append("null");
        } else {
            sb2.append(str4);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("word_level_id:");
        sb2.append(this.word_level_id);
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAccent() {
        this.accent = null;
    }

    public void unsetAudio_uri() {
        this.audio_uri = null;
    }

    public void unsetMean() {
        this.mean = null;
    }

    public void unsetTopic_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetWord() {
        this.word = null;
    }

    public void unsetWord_level_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void validate() throws TException {
        if (this.word == null) {
            throw new TProtocolException("Required field 'word' was not present! Struct: " + toString());
        }
        if (this.mean == null) {
            throw new TProtocolException("Required field 'mean' was not present! Struct: " + toString());
        }
        if (this.accent == null) {
            throw new TProtocolException("Required field 'accent' was not present! Struct: " + toString());
        }
        if (this.audio_uri != null) {
            return;
        }
        throw new TProtocolException("Required field 'audio_uri' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(CalendarDailyWord other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo7 = Boolean.valueOf(isSetTopic_id()).compareTo(Boolean.valueOf(other.isSetTopic_id()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetTopic_id() && (compareTo6 = TBaseHelper.compareTo(this.topic_id, other.topic_id)) != 0) {
            return compareTo6;
        }
        int compareTo8 = Boolean.valueOf(isSetWord()).compareTo(Boolean.valueOf(other.isSetWord()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetWord() && (compareTo5 = TBaseHelper.compareTo(this.word, other.word)) != 0) {
            return compareTo5;
        }
        int compareTo9 = Boolean.valueOf(isSetMean()).compareTo(Boolean.valueOf(other.isSetMean()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetMean() && (compareTo4 = TBaseHelper.compareTo(this.mean, other.mean)) != 0) {
            return compareTo4;
        }
        int compareTo10 = Boolean.valueOf(isSetAccent()).compareTo(Boolean.valueOf(other.isSetAccent()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetAccent() && (compareTo3 = TBaseHelper.compareTo(this.accent, other.accent)) != 0) {
            return compareTo3;
        }
        int compareTo11 = Boolean.valueOf(isSetAudio_uri()).compareTo(Boolean.valueOf(other.isSetAudio_uri()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetAudio_uri() && (compareTo2 = TBaseHelper.compareTo(this.audio_uri, other.audio_uri)) != 0) {
            return compareTo2;
        }
        int compareTo12 = Boolean.valueOf(isSetWord_level_id()).compareTo(Boolean.valueOf(other.isSetWord_level_id()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (!isSetWord_level_id() || (compareTo = TBaseHelper.compareTo(this.word_level_id, other.word_level_id)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<CalendarDailyWord, _Fields> deepCopy2() {
        return new CalendarDailyWord(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$CalendarDailyWord$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getTopic_id());
            case 2:
                return getWord();
            case 3:
                return getMean();
            case 4:
                return getAccent();
            case 5:
                return getAudio_uri();
            case 6:
                return Integer.valueOf(getWord_level_id());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$CalendarDailyWord$_Fields[field.ordinal()]) {
            case 1:
                return isSetTopic_id();
            case 2:
                return isSetWord();
            case 3:
                return isSetMean();
            case 4:
                return isSetAccent();
            case 5:
                return isSetAudio_uri();
            case 6:
                return isSetWord_level_id();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$CalendarDailyWord$_Fields[field.ordinal()]) {
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
                    setWord((String) value);
                    break;
                } else {
                    unsetWord();
                    break;
                }
            case 3:
                if (value != null) {
                    setMean((String) value);
                    break;
                } else {
                    unsetMean();
                    break;
                }
            case 4:
                if (value != null) {
                    setAccent((String) value);
                    break;
                } else {
                    unsetAccent();
                    break;
                }
            case 5:
                if (value != null) {
                    setAudio_uri((String) value);
                    break;
                } else {
                    unsetAudio_uri();
                    break;
                }
            case 6:
                if (value != null) {
                    setWord_level_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetWord_level_id();
                    break;
                }
        }
    }

    public CalendarDailyWord(int topic_id, String word, String mean, String accent, String audio_uri, int word_level_id) {
        this();
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        this.word = word;
        this.mean = mean;
        this.accent = accent;
        this.audio_uri = audio_uri;
        this.word_level_id = word_level_id;
        setWord_level_idIsSet(true);
    }

    public boolean equals(CalendarDailyWord that) {
        if (that == null || this.topic_id != that.topic_id) {
            return false;
        }
        boolean isSetWord = isSetWord();
        boolean isSetWord2 = that.isSetWord();
        if ((isSetWord || isSetWord2) && !(isSetWord && isSetWord2 && this.word.equals(that.word))) {
            return false;
        }
        boolean isSetMean = isSetMean();
        boolean isSetMean2 = that.isSetMean();
        if ((isSetMean || isSetMean2) && !(isSetMean && isSetMean2 && this.mean.equals(that.mean))) {
            return false;
        }
        boolean isSetAccent = isSetAccent();
        boolean isSetAccent2 = that.isSetAccent();
        if ((isSetAccent || isSetAccent2) && !(isSetAccent && isSetAccent2 && this.accent.equals(that.accent))) {
            return false;
        }
        boolean isSetAudio_uri = isSetAudio_uri();
        boolean isSetAudio_uri2 = that.isSetAudio_uri();
        return (!(isSetAudio_uri || isSetAudio_uri2) || (isSetAudio_uri && isSetAudio_uri2 && this.audio_uri.equals(that.audio_uri))) && this.word_level_id == that.word_level_id;
    }

    public CalendarDailyWord(CalendarDailyWord other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.topic_id = other.topic_id;
        if (other.isSetWord()) {
            this.word = other.word;
        }
        if (other.isSetMean()) {
            this.mean = other.mean;
        }
        if (other.isSetAccent()) {
            this.accent = other.accent;
        }
        if (other.isSetAudio_uri()) {
            this.audio_uri = other.audio_uri;
        }
        this.word_level_id = other.word_level_id;
    }
}
