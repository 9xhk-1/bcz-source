package com.baicizhan.online.resource_api;

import com.baicizhan.client.business.dataset.provider.a;
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
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class WordListWordMetaV2 implements TBase<WordListWordMetaV2, _Fields>, Serializable, Cloneable, Comparable<WordListWordMetaV2> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public String accent_usa_audio_uri;
    public String mean_cn;
    private _Fields[] optionals;
    public TopicKey topic_key;
    public String word;
    private static final TStruct STRUCT_DESC = new TStruct("WordListWordMetaV2");
    private static final TField TOPIC_KEY_FIELD_DESC = new TField("topic_key", (byte) 12, 1);
    private static final TField WORD_FIELD_DESC = new TField("word", (byte) 11, 2);
    private static final TField MEAN_CN_FIELD_DESC = new TField(a.e.C0246a.f16184d, (byte) 11, 3);
    private static final TField ACCENT_USA_AUDIO_URI_FIELD_DESC = new TField("accent_usa_audio_uri", (byte) 11, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.resource_api.WordListWordMetaV2$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$WordListWordMetaV2$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$WordListWordMetaV2$_Fields = iArr;
            try {
                iArr[_Fields.TOPIC_KEY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$WordListWordMetaV2$_Fields[_Fields.WORD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$WordListWordMetaV2$_Fields[_Fields.MEAN_CN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$WordListWordMetaV2$_Fields[_Fields.ACCENT_USA_AUDIO_URI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WordListWordMetaV2StandardScheme extends StandardScheme<WordListWordMetaV2> {
        private WordListWordMetaV2StandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, WordListWordMetaV2 struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    struct.validate();
                    return;
                }
                short s11 = readFieldBegin.f77768id;
                if (s11 != 1) {
                    if (s11 != 2) {
                        if (s11 != 3) {
                            if (s11 != 4) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 11) {
                                struct.accent_usa_audio_uri = iprot.readString();
                                struct.setAccent_usa_audio_uriIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 11) {
                            struct.mean_cn = iprot.readString();
                            struct.setMean_cnIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.word = iprot.readString();
                        struct.setWordIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 12) {
                    TopicKey topicKey = new TopicKey();
                    struct.topic_key = topicKey;
                    topicKey.read(iprot);
                    struct.setTopic_keyIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, WordListWordMetaV2 struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(WordListWordMetaV2.STRUCT_DESC);
            if (struct.topic_key != null) {
                oprot.writeFieldBegin(WordListWordMetaV2.TOPIC_KEY_FIELD_DESC);
                struct.topic_key.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.word != null) {
                oprot.writeFieldBegin(WordListWordMetaV2.WORD_FIELD_DESC);
                oprot.writeString(struct.word);
                oprot.writeFieldEnd();
            }
            if (struct.mean_cn != null) {
                oprot.writeFieldBegin(WordListWordMetaV2.MEAN_CN_FIELD_DESC);
                oprot.writeString(struct.mean_cn);
                oprot.writeFieldEnd();
            }
            if (struct.accent_usa_audio_uri != null && struct.isSetAccent_usa_audio_uri()) {
                oprot.writeFieldBegin(WordListWordMetaV2.ACCENT_USA_AUDIO_URI_FIELD_DESC);
                oprot.writeString(struct.accent_usa_audio_uri);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WordListWordMetaV2StandardSchemeFactory implements SchemeFactory {
        private WordListWordMetaV2StandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public WordListWordMetaV2StandardScheme getScheme() {
            return new WordListWordMetaV2StandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WordListWordMetaV2TupleScheme extends TupleScheme<WordListWordMetaV2> {
        private WordListWordMetaV2TupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, WordListWordMetaV2 struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            TopicKey topicKey = new TopicKey();
            struct.topic_key = topicKey;
            topicKey.read(tTupleProtocol);
            struct.setTopic_keyIsSet(true);
            struct.word = tTupleProtocol.readString();
            struct.setWordIsSet(true);
            struct.mean_cn = tTupleProtocol.readString();
            struct.setMean_cnIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                struct.accent_usa_audio_uri = tTupleProtocol.readString();
                struct.setAccent_usa_audio_uriIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, WordListWordMetaV2 struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.topic_key.write(tTupleProtocol);
            tTupleProtocol.writeString(struct.word);
            tTupleProtocol.writeString(struct.mean_cn);
            BitSet bitSet = new BitSet();
            if (struct.isSetAccent_usa_audio_uri()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetAccent_usa_audio_uri()) {
                tTupleProtocol.writeString(struct.accent_usa_audio_uri);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WordListWordMetaV2TupleSchemeFactory implements SchemeFactory {
        private WordListWordMetaV2TupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public WordListWordMetaV2TupleScheme getScheme() {
            return new WordListWordMetaV2TupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TOPIC_KEY(1, "topic_key"),
        WORD(2, "word"),
        MEAN_CN(3, a.e.C0246a.f16184d),
        ACCENT_USA_AUDIO_URI(4, "accent_usa_audio_uri");

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
                return TOPIC_KEY;
            }
            if (fieldId == 2) {
                return WORD;
            }
            if (fieldId == 3) {
                return MEAN_CN;
            }
            if (fieldId != 4) {
                return null;
            }
            return ACCENT_USA_AUDIO_URI;
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
        hashMap.put(StandardScheme.class, new WordListWordMetaV2StandardSchemeFactory());
        hashMap.put(TupleScheme.class, new WordListWordMetaV2TupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TOPIC_KEY, (_Fields) new FieldMetaData("topic_key", (byte) 1, new StructMetaData((byte) 12, TopicKey.class)));
        enumMap.put((EnumMap) _Fields.WORD, (_Fields) new FieldMetaData("word", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.MEAN_CN, (_Fields) new FieldMetaData(a.e.C0246a.f16184d, (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ACCENT_USA_AUDIO_URI, (_Fields) new FieldMetaData("accent_usa_audio_uri", (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(WordListWordMetaV2.class, unmodifiableMap);
    }

    public WordListWordMetaV2() {
        this.optionals = new _Fields[]{_Fields.ACCENT_USA_AUDIO_URI};
    }

    private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
        try {
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
        this.topic_key = null;
        this.word = null;
        this.mean_cn = null;
        this.accent_usa_audio_uri = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof WordListWordMetaV2)) {
            return equals((WordListWordMetaV2) that);
        }
        return false;
    }

    public String getAccent_usa_audio_uri() {
        return this.accent_usa_audio_uri;
    }

    public String getMean_cn() {
        return this.mean_cn;
    }

    public TopicKey getTopic_key() {
        return this.topic_key;
    }

    public String getWord() {
        return this.word;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAccent_usa_audio_uri() {
        return this.accent_usa_audio_uri != null;
    }

    public boolean isSetMean_cn() {
        return this.mean_cn != null;
    }

    public boolean isSetTopic_key() {
        return this.topic_key != null;
    }

    public boolean isSetWord() {
        return this.word != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public WordListWordMetaV2 setAccent_usa_audio_uri(String accent_usa_audio_uri) {
        this.accent_usa_audio_uri = accent_usa_audio_uri;
        return this;
    }

    public void setAccent_usa_audio_uriIsSet(boolean value) {
        if (value) {
            return;
        }
        this.accent_usa_audio_uri = null;
    }

    public WordListWordMetaV2 setMean_cn(String mean_cn) {
        this.mean_cn = mean_cn;
        return this;
    }

    public void setMean_cnIsSet(boolean value) {
        if (value) {
            return;
        }
        this.mean_cn = null;
    }

    public WordListWordMetaV2 setTopic_key(TopicKey topic_key) {
        this.topic_key = topic_key;
        return this;
    }

    public void setTopic_keyIsSet(boolean value) {
        if (value) {
            return;
        }
        this.topic_key = null;
    }

    public WordListWordMetaV2 setWord(String word) {
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
        StringBuilder sb2 = new StringBuilder("WordListWordMetaV2(");
        sb2.append("topic_key:");
        TopicKey topicKey = this.topic_key;
        if (topicKey == null) {
            sb2.append("null");
        } else {
            sb2.append(topicKey);
        }
        sb2.append(j2.O);
        sb2.append("word:");
        String str = this.word;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("mean_cn:");
        String str2 = this.mean_cn;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        if (isSetAccent_usa_audio_uri()) {
            sb2.append(j2.O);
            sb2.append("accent_usa_audio_uri:");
            String str3 = this.accent_usa_audio_uri;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAccent_usa_audio_uri() {
        this.accent_usa_audio_uri = null;
    }

    public void unsetMean_cn() {
        this.mean_cn = null;
    }

    public void unsetTopic_key() {
        this.topic_key = null;
    }

    public void unsetWord() {
        this.word = null;
    }

    public void validate() throws TException {
        TopicKey topicKey = this.topic_key;
        if (topicKey == null) {
            throw new TProtocolException("Required field 'topic_key' was not present! Struct: " + toString());
        }
        if (this.word == null) {
            throw new TProtocolException("Required field 'word' was not present! Struct: " + toString());
        }
        if (this.mean_cn != null) {
            if (topicKey != null) {
                topicKey.validate();
            }
        } else {
            throw new TProtocolException("Required field 'mean_cn' was not present! Struct: " + toString());
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(WordListWordMetaV2 other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetTopic_key()).compareTo(Boolean.valueOf(other.isSetTopic_key()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetTopic_key() && (compareTo4 = TBaseHelper.compareTo((Comparable) this.topic_key, (Comparable) other.topic_key)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetWord()).compareTo(Boolean.valueOf(other.isSetWord()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetWord() && (compareTo3 = TBaseHelper.compareTo(this.word, other.word)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetMean_cn()).compareTo(Boolean.valueOf(other.isSetMean_cn()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetMean_cn() && (compareTo2 = TBaseHelper.compareTo(this.mean_cn, other.mean_cn)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetAccent_usa_audio_uri()).compareTo(Boolean.valueOf(other.isSetAccent_usa_audio_uri()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetAccent_usa_audio_uri() || (compareTo = TBaseHelper.compareTo(this.accent_usa_audio_uri, other.accent_usa_audio_uri)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<WordListWordMetaV2, _Fields> deepCopy2() {
        return new WordListWordMetaV2(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$WordListWordMetaV2$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getTopic_key();
        }
        if (i11 == 2) {
            return getWord();
        }
        if (i11 == 3) {
            return getMean_cn();
        }
        if (i11 == 4) {
            return getAccent_usa_audio_uri();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$WordListWordMetaV2$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetTopic_key();
        }
        if (i11 == 2) {
            return isSetWord();
        }
        if (i11 == 3) {
            return isSetMean_cn();
        }
        if (i11 == 4) {
            return isSetAccent_usa_audio_uri();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$WordListWordMetaV2$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetTopic_key();
                return;
            } else {
                setTopic_key((TopicKey) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetWord();
                return;
            } else {
                setWord((String) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetMean_cn();
                return;
            } else {
                setMean_cn((String) value);
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetAccent_usa_audio_uri();
        } else {
            setAccent_usa_audio_uri((String) value);
        }
    }

    public WordListWordMetaV2(TopicKey topic_key, String word, String mean_cn) {
        this();
        this.topic_key = topic_key;
        this.word = word;
        this.mean_cn = mean_cn;
    }

    public boolean equals(WordListWordMetaV2 that) {
        if (that == null) {
            return false;
        }
        boolean isSetTopic_key = isSetTopic_key();
        boolean isSetTopic_key2 = that.isSetTopic_key();
        if ((isSetTopic_key || isSetTopic_key2) && !(isSetTopic_key && isSetTopic_key2 && this.topic_key.equals(that.topic_key))) {
            return false;
        }
        boolean isSetWord = isSetWord();
        boolean isSetWord2 = that.isSetWord();
        if ((isSetWord || isSetWord2) && !(isSetWord && isSetWord2 && this.word.equals(that.word))) {
            return false;
        }
        boolean isSetMean_cn = isSetMean_cn();
        boolean isSetMean_cn2 = that.isSetMean_cn();
        if ((isSetMean_cn || isSetMean_cn2) && !(isSetMean_cn && isSetMean_cn2 && this.mean_cn.equals(that.mean_cn))) {
            return false;
        }
        boolean isSetAccent_usa_audio_uri = isSetAccent_usa_audio_uri();
        boolean isSetAccent_usa_audio_uri2 = that.isSetAccent_usa_audio_uri();
        if (isSetAccent_usa_audio_uri || isSetAccent_usa_audio_uri2) {
            return isSetAccent_usa_audio_uri && isSetAccent_usa_audio_uri2 && this.accent_usa_audio_uri.equals(that.accent_usa_audio_uri);
        }
        return true;
    }

    public WordListWordMetaV2(WordListWordMetaV2 other) {
        this.optionals = new _Fields[]{_Fields.ACCENT_USA_AUDIO_URI};
        if (other.isSetTopic_key()) {
            this.topic_key = new TopicKey(other.topic_key);
        }
        if (other.isSetWord()) {
            this.word = other.word;
        }
        if (other.isSetMean_cn()) {
            this.mean_cn = other.mean_cn;
        }
        if (other.isSetAccent_usa_audio_uri()) {
            this.accent_usa_audio_uri = other.accent_usa_audio_uri;
        }
    }
}
