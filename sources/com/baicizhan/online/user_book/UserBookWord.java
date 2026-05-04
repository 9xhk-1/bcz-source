package com.baicizhan.online.user_book;

import com.baicizhan.main.wikiv2.studyv2.data.t;
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
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class UserBookWord implements TBase<UserBookWord, _Fields>, Serializable, Cloneable, Comparable<UserBookWord> {
    private static final int __BOOK_ID_ISSET_ID = 1;
    private static final int __CREATED_AT_ISSET_ID = 2;
    private static final int __TOPIC_ID_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String audio_url;
    public int book_id;
    public long created_at;
    public String mean;
    private _Fields[] optionals;
    public int topic_id;
    public String word;
    private static final TStruct STRUCT_DESC = new TStruct("UserBookWord");
    private static final TField TOPIC_ID_FIELD_DESC = new TField("topic_id", (byte) 8, 1);
    private static final TField BOOK_ID_FIELD_DESC = new TField("book_id", (byte) 8, 2);
    private static final TField CREATED_AT_FIELD_DESC = new TField("created_at", (byte) 10, 3);
    private static final TField WORD_FIELD_DESC = new TField("word", (byte) 11, 4);
    private static final TField MEAN_FIELD_DESC = new TField(t.f26099a, (byte) 11, 5);
    private static final TField AUDIO_URL_FIELD_DESC = new TField("audio_url", (byte) 11, 6);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_book.UserBookWord$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_book$UserBookWord$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_book$UserBookWord$_Fields = iArr;
            try {
                iArr[_Fields.TOPIC_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_book$UserBookWord$_Fields[_Fields.BOOK_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_book$UserBookWord$_Fields[_Fields.CREATED_AT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_book$UserBookWord$_Fields[_Fields.WORD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_book$UserBookWord$_Fields[_Fields.MEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_book$UserBookWord$_Fields[_Fields.AUDIO_URL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBookWordStandardScheme extends StandardScheme<UserBookWord> {
        private UserBookWordStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserBookWord struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetTopic_id()) {
                        throw new TProtocolException("Required field 'topic_id' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetBook_id()) {
                        throw new TProtocolException("Required field 'book_id' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetCreated_at()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'created_at' was not found in serialized data! Struct: " + toString());
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
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.book_id = iprot.readI32();
                            struct.setBook_idIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.created_at = iprot.readI64();
                            struct.setCreated_atIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.word = iprot.readString();
                            struct.setWordIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.mean = iprot.readString();
                            struct.setMeanIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.audio_url = iprot.readString();
                            struct.setAudio_urlIsSet(true);
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
        public void write(TProtocol oprot, UserBookWord struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserBookWord.STRUCT_DESC);
            oprot.writeFieldBegin(UserBookWord.TOPIC_ID_FIELD_DESC);
            oprot.writeI32(struct.topic_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserBookWord.BOOK_ID_FIELD_DESC);
            oprot.writeI32(struct.book_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserBookWord.CREATED_AT_FIELD_DESC);
            oprot.writeI64(struct.created_at);
            oprot.writeFieldEnd();
            if (struct.word != null && struct.isSetWord()) {
                oprot.writeFieldBegin(UserBookWord.WORD_FIELD_DESC);
                oprot.writeString(struct.word);
                oprot.writeFieldEnd();
            }
            if (struct.mean != null && struct.isSetMean()) {
                oprot.writeFieldBegin(UserBookWord.MEAN_FIELD_DESC);
                oprot.writeString(struct.mean);
                oprot.writeFieldEnd();
            }
            if (struct.audio_url != null && struct.isSetAudio_url()) {
                oprot.writeFieldBegin(UserBookWord.AUDIO_URL_FIELD_DESC);
                oprot.writeString(struct.audio_url);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBookWordStandardSchemeFactory implements SchemeFactory {
        private UserBookWordStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserBookWordStandardScheme getScheme() {
            return new UserBookWordStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBookWordTupleScheme extends TupleScheme<UserBookWord> {
        private UserBookWordTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserBookWord struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.topic_id = tTupleProtocol.readI32();
            struct.setTopic_idIsSet(true);
            struct.book_id = tTupleProtocol.readI32();
            struct.setBook_idIsSet(true);
            struct.created_at = tTupleProtocol.readI64();
            struct.setCreated_atIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(3);
            if (readBitSet.get(0)) {
                struct.word = tTupleProtocol.readString();
                struct.setWordIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.mean = tTupleProtocol.readString();
                struct.setMeanIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.audio_url = tTupleProtocol.readString();
                struct.setAudio_urlIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserBookWord struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.topic_id);
            tTupleProtocol.writeI32(struct.book_id);
            tTupleProtocol.writeI64(struct.created_at);
            BitSet bitSet = new BitSet();
            if (struct.isSetWord()) {
                bitSet.set(0);
            }
            if (struct.isSetMean()) {
                bitSet.set(1);
            }
            if (struct.isSetAudio_url()) {
                bitSet.set(2);
            }
            tTupleProtocol.writeBitSet(bitSet, 3);
            if (struct.isSetWord()) {
                tTupleProtocol.writeString(struct.word);
            }
            if (struct.isSetMean()) {
                tTupleProtocol.writeString(struct.mean);
            }
            if (struct.isSetAudio_url()) {
                tTupleProtocol.writeString(struct.audio_url);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBookWordTupleSchemeFactory implements SchemeFactory {
        private UserBookWordTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserBookWordTupleScheme getScheme() {
            return new UserBookWordTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TOPIC_ID(1, "topic_id"),
        BOOK_ID(2, "book_id"),
        CREATED_AT(3, "created_at"),
        WORD(4, "word"),
        MEAN(5, t.f26099a),
        AUDIO_URL(6, "audio_url");

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
                    return BOOK_ID;
                case 3:
                    return CREATED_AT;
                case 4:
                    return WORD;
                case 5:
                    return MEAN;
                case 6:
                    return AUDIO_URL;
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
        hashMap.put(StandardScheme.class, new UserBookWordStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserBookWordTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TOPIC_ID, (_Fields) new FieldMetaData("topic_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.BOOK_ID, (_Fields) new FieldMetaData("book_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.CREATED_AT, (_Fields) new FieldMetaData("created_at", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.WORD, (_Fields) new FieldMetaData("word", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.MEAN, (_Fields) new FieldMetaData(t.f26099a, (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.AUDIO_URL, (_Fields) new FieldMetaData("audio_url", (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserBookWord.class, unmodifiableMap);
    }

    public UserBookWord() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.WORD, _Fields.MEAN, _Fields.AUDIO_URL};
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
        setBook_idIsSet(false);
        this.book_id = 0;
        setCreated_atIsSet(false);
        this.created_at = 0L;
        this.word = null;
        this.mean = null;
        this.audio_url = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserBookWord)) {
            return equals((UserBookWord) that);
        }
        return false;
    }

    public String getAudio_url() {
        return this.audio_url;
    }

    public int getBook_id() {
        return this.book_id;
    }

    public long getCreated_at() {
        return this.created_at;
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

    public int hashCode() {
        return 0;
    }

    public boolean isSetAudio_url() {
        return this.audio_url != null;
    }

    public boolean isSetBook_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetCreated_at() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
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

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserBookWord setAudio_url(String audio_url) {
        this.audio_url = audio_url;
        return this;
    }

    public void setAudio_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.audio_url = null;
    }

    public UserBookWord setBook_id(int book_id) {
        this.book_id = book_id;
        setBook_idIsSet(true);
        return this;
    }

    public void setBook_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public UserBookWord setCreated_at(long created_at) {
        this.created_at = created_at;
        setCreated_atIsSet(true);
        return this;
    }

    public void setCreated_atIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public UserBookWord setMean(String mean) {
        this.mean = mean;
        return this;
    }

    public void setMeanIsSet(boolean value) {
        if (value) {
            return;
        }
        this.mean = null;
    }

    public UserBookWord setTopic_id(int topic_id) {
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        return this;
    }

    public void setTopic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public UserBookWord setWord(String word) {
        this.word = word;
        return this;
    }

    public void setWordIsSet(boolean value) {
        if (value) {
            return;
        }
        this.word = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserBookWord(");
        sb2.append("topic_id:");
        sb2.append(this.topic_id);
        sb2.append(j2.O);
        sb2.append("book_id:");
        sb2.append(this.book_id);
        sb2.append(j2.O);
        sb2.append("created_at:");
        sb2.append(this.created_at);
        if (isSetWord()) {
            sb2.append(j2.O);
            sb2.append("word:");
            String str = this.word;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
        }
        if (isSetMean()) {
            sb2.append(j2.O);
            sb2.append("mean:");
            String str2 = this.mean;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
        }
        if (isSetAudio_url()) {
            sb2.append(j2.O);
            sb2.append("audio_url:");
            String str3 = this.audio_url;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAudio_url() {
        this.audio_url = null;
    }

    public void unsetBook_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetCreated_at() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
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

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(UserBookWord other) {
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
        int compareTo8 = Boolean.valueOf(isSetBook_id()).compareTo(Boolean.valueOf(other.isSetBook_id()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetBook_id() && (compareTo5 = TBaseHelper.compareTo(this.book_id, other.book_id)) != 0) {
            return compareTo5;
        }
        int compareTo9 = Boolean.valueOf(isSetCreated_at()).compareTo(Boolean.valueOf(other.isSetCreated_at()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetCreated_at() && (compareTo4 = TBaseHelper.compareTo(this.created_at, other.created_at)) != 0) {
            return compareTo4;
        }
        int compareTo10 = Boolean.valueOf(isSetWord()).compareTo(Boolean.valueOf(other.isSetWord()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetWord() && (compareTo3 = TBaseHelper.compareTo(this.word, other.word)) != 0) {
            return compareTo3;
        }
        int compareTo11 = Boolean.valueOf(isSetMean()).compareTo(Boolean.valueOf(other.isSetMean()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetMean() && (compareTo2 = TBaseHelper.compareTo(this.mean, other.mean)) != 0) {
            return compareTo2;
        }
        int compareTo12 = Boolean.valueOf(isSetAudio_url()).compareTo(Boolean.valueOf(other.isSetAudio_url()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (!isSetAudio_url() || (compareTo = TBaseHelper.compareTo(this.audio_url, other.audio_url)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserBookWord, _Fields> deepCopy2() {
        return new UserBookWord(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_book$UserBookWord$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getTopic_id());
            case 2:
                return Integer.valueOf(getBook_id());
            case 3:
                return Long.valueOf(getCreated_at());
            case 4:
                return getWord();
            case 5:
                return getMean();
            case 6:
                return getAudio_url();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_book$UserBookWord$_Fields[field.ordinal()]) {
            case 1:
                return isSetTopic_id();
            case 2:
                return isSetBook_id();
            case 3:
                return isSetCreated_at();
            case 4:
                return isSetWord();
            case 5:
                return isSetMean();
            case 6:
                return isSetAudio_url();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_book$UserBookWord$_Fields[field.ordinal()]) {
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
                    setBook_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetBook_id();
                    break;
                }
            case 3:
                if (value != null) {
                    setCreated_at(((Long) value).longValue());
                    break;
                } else {
                    unsetCreated_at();
                    break;
                }
            case 4:
                if (value != null) {
                    setWord((String) value);
                    break;
                } else {
                    unsetWord();
                    break;
                }
            case 5:
                if (value != null) {
                    setMean((String) value);
                    break;
                } else {
                    unsetMean();
                    break;
                }
            case 6:
                if (value != null) {
                    setAudio_url((String) value);
                    break;
                } else {
                    unsetAudio_url();
                    break;
                }
        }
    }

    public boolean equals(UserBookWord that) {
        if (that == null || this.topic_id != that.topic_id || this.book_id != that.book_id || this.created_at != that.created_at) {
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
        boolean isSetAudio_url = isSetAudio_url();
        boolean isSetAudio_url2 = that.isSetAudio_url();
        if (isSetAudio_url || isSetAudio_url2) {
            return isSetAudio_url && isSetAudio_url2 && this.audio_url.equals(that.audio_url);
        }
        return true;
    }

    public UserBookWord(int topic_id, int book_id, long created_at) {
        this();
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        this.book_id = book_id;
        setBook_idIsSet(true);
        this.created_at = created_at;
        setCreated_atIsSet(true);
    }

    public UserBookWord(UserBookWord other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.WORD, _Fields.MEAN, _Fields.AUDIO_URL};
        this.__isset_bitfield = other.__isset_bitfield;
        this.topic_id = other.topic_id;
        this.book_id = other.book_id;
        this.created_at = other.created_at;
        if (other.isSetWord()) {
            this.word = other.word;
        }
        if (other.isSetMean()) {
            this.mean = other.mean;
        }
        if (other.isSetAudio_url()) {
            this.audio_url = other.audio_url;
        }
    }

    public void validate() throws TException {
    }
}
