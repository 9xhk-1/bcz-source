package com.baicizhan.online.bs_words;

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
public class BBWordMediaV3 implements TBase<BBWordMediaV3, _Fields>, Serializable, Cloneable, Comparable<BBWordMediaV3> {
    private static final int __CREATED_AT_ISSET_ID = 1;
    private static final int __TOPIC_ID_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String accent;
    public long created_at;
    public String mean_cn;
    private _Fields[] optionals;
    public String sentence;
    public String sentence_trans;
    public int topic_id;
    public String tv_path;
    public String tv_snapshot_path;
    public String word;
    public String word_audio_path;
    private static final TStruct STRUCT_DESC = new TStruct("BBWordMediaV3");
    private static final TField TOPIC_ID_FIELD_DESC = new TField("topic_id", (byte) 8, 1);
    private static final TField WORD_FIELD_DESC = new TField("word", (byte) 11, 2);
    private static final TField ACCENT_FIELD_DESC = new TField("accent", (byte) 11, 3);
    private static final TField MEAN_CN_FIELD_DESC = new TField(a.e.C0246a.f16184d, (byte) 11, 4);
    private static final TField SENTENCE_FIELD_DESC = new TField("sentence", (byte) 11, 5);
    private static final TField SENTENCE_TRANS_FIELD_DESC = new TField("sentence_trans", (byte) 11, 6);
    private static final TField TV_PATH_FIELD_DESC = new TField(a.v.C0263a.f16322h, (byte) 11, 7);
    private static final TField TV_SNAPSHOT_PATH_FIELD_DESC = new TField(a.v.C0263a.f16323i, (byte) 11, 8);
    private static final TField WORD_AUDIO_PATH_FIELD_DESC = new TField("word_audio_path", (byte) 11, 9);
    private static final TField CREATED_AT_FIELD_DESC = new TField("created_at", (byte) 10, 10);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_words.BBWordMediaV3$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_words$BBWordMediaV3$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_words$BBWordMediaV3$_Fields = iArr;
            try {
                iArr[_Fields.TOPIC_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBWordMediaV3$_Fields[_Fields.WORD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBWordMediaV3$_Fields[_Fields.ACCENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBWordMediaV3$_Fields[_Fields.MEAN_CN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBWordMediaV3$_Fields[_Fields.SENTENCE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBWordMediaV3$_Fields[_Fields.SENTENCE_TRANS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBWordMediaV3$_Fields[_Fields.TV_PATH.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBWordMediaV3$_Fields[_Fields.TV_SNAPSHOT_PATH.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBWordMediaV3$_Fields[_Fields.WORD_AUDIO_PATH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBWordMediaV3$_Fields[_Fields.CREATED_AT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBWordMediaV3StandardScheme extends StandardScheme<BBWordMediaV3> {
        private BBWordMediaV3StandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BBWordMediaV3 struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetTopic_id()) {
                        throw new TProtocolException("Required field 'topic_id' was not found in serialized data! Struct: " + toString());
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
                            struct.accent = iprot.readString();
                            struct.setAccentIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.mean_cn = iprot.readString();
                            struct.setMean_cnIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.sentence = iprot.readString();
                            struct.setSentenceIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.sentence_trans = iprot.readString();
                            struct.setSentence_transIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.tv_path = iprot.readString();
                            struct.setTv_pathIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.tv_snapshot_path = iprot.readString();
                            struct.setTv_snapshot_pathIsSet(true);
                            break;
                        }
                    case 9:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.word_audio_path = iprot.readString();
                            struct.setWord_audio_pathIsSet(true);
                            break;
                        }
                    case 10:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.created_at = iprot.readI64();
                            struct.setCreated_atIsSet(true);
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
        public void write(TProtocol oprot, BBWordMediaV3 struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BBWordMediaV3.STRUCT_DESC);
            oprot.writeFieldBegin(BBWordMediaV3.TOPIC_ID_FIELD_DESC);
            oprot.writeI32(struct.topic_id);
            oprot.writeFieldEnd();
            if (struct.word != null) {
                oprot.writeFieldBegin(BBWordMediaV3.WORD_FIELD_DESC);
                oprot.writeString(struct.word);
                oprot.writeFieldEnd();
            }
            if (struct.accent != null) {
                oprot.writeFieldBegin(BBWordMediaV3.ACCENT_FIELD_DESC);
                oprot.writeString(struct.accent);
                oprot.writeFieldEnd();
            }
            if (struct.mean_cn != null) {
                oprot.writeFieldBegin(BBWordMediaV3.MEAN_CN_FIELD_DESC);
                oprot.writeString(struct.mean_cn);
                oprot.writeFieldEnd();
            }
            if (struct.sentence != null) {
                oprot.writeFieldBegin(BBWordMediaV3.SENTENCE_FIELD_DESC);
                oprot.writeString(struct.sentence);
                oprot.writeFieldEnd();
            }
            if (struct.sentence_trans != null) {
                oprot.writeFieldBegin(BBWordMediaV3.SENTENCE_TRANS_FIELD_DESC);
                oprot.writeString(struct.sentence_trans);
                oprot.writeFieldEnd();
            }
            if (struct.tv_path != null) {
                oprot.writeFieldBegin(BBWordMediaV3.TV_PATH_FIELD_DESC);
                oprot.writeString(struct.tv_path);
                oprot.writeFieldEnd();
            }
            if (struct.tv_snapshot_path != null && struct.isSetTv_snapshot_path()) {
                oprot.writeFieldBegin(BBWordMediaV3.TV_SNAPSHOT_PATH_FIELD_DESC);
                oprot.writeString(struct.tv_snapshot_path);
                oprot.writeFieldEnd();
            }
            if (struct.word_audio_path != null && struct.isSetWord_audio_path()) {
                oprot.writeFieldBegin(BBWordMediaV3.WORD_AUDIO_PATH_FIELD_DESC);
                oprot.writeString(struct.word_audio_path);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(BBWordMediaV3.CREATED_AT_FIELD_DESC);
            oprot.writeI64(struct.created_at);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBWordMediaV3StandardSchemeFactory implements SchemeFactory {
        private BBWordMediaV3StandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBWordMediaV3StandardScheme getScheme() {
            return new BBWordMediaV3StandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBWordMediaV3TupleScheme extends TupleScheme<BBWordMediaV3> {
        private BBWordMediaV3TupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BBWordMediaV3 struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.topic_id = tTupleProtocol.readI32();
            struct.setTopic_idIsSet(true);
            struct.word = tTupleProtocol.readString();
            struct.setWordIsSet(true);
            struct.accent = tTupleProtocol.readString();
            struct.setAccentIsSet(true);
            struct.mean_cn = tTupleProtocol.readString();
            struct.setMean_cnIsSet(true);
            struct.sentence = tTupleProtocol.readString();
            struct.setSentenceIsSet(true);
            struct.sentence_trans = tTupleProtocol.readString();
            struct.setSentence_transIsSet(true);
            struct.tv_path = tTupleProtocol.readString();
            struct.setTv_pathIsSet(true);
            struct.created_at = tTupleProtocol.readI64();
            struct.setCreated_atIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(2);
            if (readBitSet.get(0)) {
                struct.tv_snapshot_path = tTupleProtocol.readString();
                struct.setTv_snapshot_pathIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.word_audio_path = tTupleProtocol.readString();
                struct.setWord_audio_pathIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BBWordMediaV3 struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.topic_id);
            tTupleProtocol.writeString(struct.word);
            tTupleProtocol.writeString(struct.accent);
            tTupleProtocol.writeString(struct.mean_cn);
            tTupleProtocol.writeString(struct.sentence);
            tTupleProtocol.writeString(struct.sentence_trans);
            tTupleProtocol.writeString(struct.tv_path);
            tTupleProtocol.writeI64(struct.created_at);
            BitSet bitSet = new BitSet();
            if (struct.isSetTv_snapshot_path()) {
                bitSet.set(0);
            }
            if (struct.isSetWord_audio_path()) {
                bitSet.set(1);
            }
            tTupleProtocol.writeBitSet(bitSet, 2);
            if (struct.isSetTv_snapshot_path()) {
                tTupleProtocol.writeString(struct.tv_snapshot_path);
            }
            if (struct.isSetWord_audio_path()) {
                tTupleProtocol.writeString(struct.word_audio_path);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBWordMediaV3TupleSchemeFactory implements SchemeFactory {
        private BBWordMediaV3TupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBWordMediaV3TupleScheme getScheme() {
            return new BBWordMediaV3TupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TOPIC_ID(1, "topic_id"),
        WORD(2, "word"),
        ACCENT(3, "accent"),
        MEAN_CN(4, a.e.C0246a.f16184d),
        SENTENCE(5, "sentence"),
        SENTENCE_TRANS(6, "sentence_trans"),
        TV_PATH(7, a.v.C0263a.f16322h),
        TV_SNAPSHOT_PATH(8, a.v.C0263a.f16323i),
        WORD_AUDIO_PATH(9, "word_audio_path"),
        CREATED_AT(10, "created_at");

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
                    return ACCENT;
                case 4:
                    return MEAN_CN;
                case 5:
                    return SENTENCE;
                case 6:
                    return SENTENCE_TRANS;
                case 7:
                    return TV_PATH;
                case 8:
                    return TV_SNAPSHOT_PATH;
                case 9:
                    return WORD_AUDIO_PATH;
                case 10:
                    return CREATED_AT;
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
        hashMap.put(StandardScheme.class, new BBWordMediaV3StandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BBWordMediaV3TupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TOPIC_ID, (_Fields) new FieldMetaData("topic_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.WORD, (_Fields) new FieldMetaData("word", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ACCENT, (_Fields) new FieldMetaData("accent", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.MEAN_CN, (_Fields) new FieldMetaData(a.e.C0246a.f16184d, (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SENTENCE, (_Fields) new FieldMetaData("sentence", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SENTENCE_TRANS, (_Fields) new FieldMetaData("sentence_trans", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.TV_PATH, (_Fields) new FieldMetaData(a.v.C0263a.f16322h, (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.TV_SNAPSHOT_PATH, (_Fields) new FieldMetaData(a.v.C0263a.f16323i, (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.WORD_AUDIO_PATH, (_Fields) new FieldMetaData("word_audio_path", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.CREATED_AT, (_Fields) new FieldMetaData("created_at", (byte) 1, new FieldValueMetaData((byte) 10)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BBWordMediaV3.class, unmodifiableMap);
    }

    public BBWordMediaV3() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.TV_SNAPSHOT_PATH, _Fields.WORD_AUDIO_PATH};
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
        this.accent = null;
        this.mean_cn = null;
        this.sentence = null;
        this.sentence_trans = null;
        this.tv_path = null;
        this.tv_snapshot_path = null;
        this.word_audio_path = null;
        setCreated_atIsSet(false);
        this.created_at = 0L;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BBWordMediaV3)) {
            return equals((BBWordMediaV3) that);
        }
        return false;
    }

    public String getAccent() {
        return this.accent;
    }

    public long getCreated_at() {
        return this.created_at;
    }

    public String getMean_cn() {
        return this.mean_cn;
    }

    public String getSentence() {
        return this.sentence;
    }

    public String getSentence_trans() {
        return this.sentence_trans;
    }

    public int getTopic_id() {
        return this.topic_id;
    }

    public String getTv_path() {
        return this.tv_path;
    }

    public String getTv_snapshot_path() {
        return this.tv_snapshot_path;
    }

    public String getWord() {
        return this.word;
    }

    public String getWord_audio_path() {
        return this.word_audio_path;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAccent() {
        return this.accent != null;
    }

    public boolean isSetCreated_at() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetMean_cn() {
        return this.mean_cn != null;
    }

    public boolean isSetSentence() {
        return this.sentence != null;
    }

    public boolean isSetSentence_trans() {
        return this.sentence_trans != null;
    }

    public boolean isSetTopic_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetTv_path() {
        return this.tv_path != null;
    }

    public boolean isSetTv_snapshot_path() {
        return this.tv_snapshot_path != null;
    }

    public boolean isSetWord() {
        return this.word != null;
    }

    public boolean isSetWord_audio_path() {
        return this.word_audio_path != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BBWordMediaV3 setAccent(String accent) {
        this.accent = accent;
        return this;
    }

    public void setAccentIsSet(boolean value) {
        if (value) {
            return;
        }
        this.accent = null;
    }

    public BBWordMediaV3 setCreated_at(long created_at) {
        this.created_at = created_at;
        setCreated_atIsSet(true);
        return this;
    }

    public void setCreated_atIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public BBWordMediaV3 setMean_cn(String mean_cn) {
        this.mean_cn = mean_cn;
        return this;
    }

    public void setMean_cnIsSet(boolean value) {
        if (value) {
            return;
        }
        this.mean_cn = null;
    }

    public BBWordMediaV3 setSentence(String sentence) {
        this.sentence = sentence;
        return this;
    }

    public void setSentenceIsSet(boolean value) {
        if (value) {
            return;
        }
        this.sentence = null;
    }

    public BBWordMediaV3 setSentence_trans(String sentence_trans) {
        this.sentence_trans = sentence_trans;
        return this;
    }

    public void setSentence_transIsSet(boolean value) {
        if (value) {
            return;
        }
        this.sentence_trans = null;
    }

    public BBWordMediaV3 setTopic_id(int topic_id) {
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        return this;
    }

    public void setTopic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public BBWordMediaV3 setTv_path(String tv_path) {
        this.tv_path = tv_path;
        return this;
    }

    public void setTv_pathIsSet(boolean value) {
        if (value) {
            return;
        }
        this.tv_path = null;
    }

    public BBWordMediaV3 setTv_snapshot_path(String tv_snapshot_path) {
        this.tv_snapshot_path = tv_snapshot_path;
        return this;
    }

    public void setTv_snapshot_pathIsSet(boolean value) {
        if (value) {
            return;
        }
        this.tv_snapshot_path = null;
    }

    public BBWordMediaV3 setWord(String word) {
        this.word = word;
        return this;
    }

    public void setWordIsSet(boolean value) {
        if (value) {
            return;
        }
        this.word = null;
    }

    public BBWordMediaV3 setWord_audio_path(String word_audio_path) {
        this.word_audio_path = word_audio_path;
        return this;
    }

    public void setWord_audio_pathIsSet(boolean value) {
        if (value) {
            return;
        }
        this.word_audio_path = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BBWordMediaV3(");
        sb2.append("topic_id:");
        sb2.append(this.topic_id);
        sb2.append(j2.O);
        sb2.append("word:");
        String str = this.word;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("accent:");
        String str2 = this.accent;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("mean_cn:");
        String str3 = this.mean_cn;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(j2.O);
        sb2.append("sentence:");
        String str4 = this.sentence;
        if (str4 == null) {
            sb2.append("null");
        } else {
            sb2.append(str4);
        }
        sb2.append(j2.O);
        sb2.append("sentence_trans:");
        String str5 = this.sentence_trans;
        if (str5 == null) {
            sb2.append("null");
        } else {
            sb2.append(str5);
        }
        sb2.append(j2.O);
        sb2.append("tv_path:");
        String str6 = this.tv_path;
        if (str6 == null) {
            sb2.append("null");
        } else {
            sb2.append(str6);
        }
        if (isSetTv_snapshot_path()) {
            sb2.append(j2.O);
            sb2.append("tv_snapshot_path:");
            String str7 = this.tv_snapshot_path;
            if (str7 == null) {
                sb2.append("null");
            } else {
                sb2.append(str7);
            }
        }
        if (isSetWord_audio_path()) {
            sb2.append(j2.O);
            sb2.append("word_audio_path:");
            String str8 = this.word_audio_path;
            if (str8 == null) {
                sb2.append("null");
            } else {
                sb2.append(str8);
            }
        }
        sb2.append(j2.O);
        sb2.append("created_at:");
        sb2.append(this.created_at);
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAccent() {
        this.accent = null;
    }

    public void unsetCreated_at() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetMean_cn() {
        this.mean_cn = null;
    }

    public void unsetSentence() {
        this.sentence = null;
    }

    public void unsetSentence_trans() {
        this.sentence_trans = null;
    }

    public void unsetTopic_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetTv_path() {
        this.tv_path = null;
    }

    public void unsetTv_snapshot_path() {
        this.tv_snapshot_path = null;
    }

    public void unsetWord() {
        this.word = null;
    }

    public void unsetWord_audio_path() {
        this.word_audio_path = null;
    }

    public void validate() throws TException {
        if (this.word == null) {
            throw new TProtocolException("Required field 'word' was not present! Struct: " + toString());
        }
        if (this.accent == null) {
            throw new TProtocolException("Required field 'accent' was not present! Struct: " + toString());
        }
        if (this.mean_cn == null) {
            throw new TProtocolException("Required field 'mean_cn' was not present! Struct: " + toString());
        }
        if (this.sentence == null) {
            throw new TProtocolException("Required field 'sentence' was not present! Struct: " + toString());
        }
        if (this.sentence_trans == null) {
            throw new TProtocolException("Required field 'sentence_trans' was not present! Struct: " + toString());
        }
        if (this.tv_path != null) {
            return;
        }
        throw new TProtocolException("Required field 'tv_path' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BBWordMediaV3 other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        int compareTo7;
        int compareTo8;
        int compareTo9;
        int compareTo10;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo11 = Boolean.valueOf(isSetTopic_id()).compareTo(Boolean.valueOf(other.isSetTopic_id()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetTopic_id() && (compareTo10 = TBaseHelper.compareTo(this.topic_id, other.topic_id)) != 0) {
            return compareTo10;
        }
        int compareTo12 = Boolean.valueOf(isSetWord()).compareTo(Boolean.valueOf(other.isSetWord()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetWord() && (compareTo9 = TBaseHelper.compareTo(this.word, other.word)) != 0) {
            return compareTo9;
        }
        int compareTo13 = Boolean.valueOf(isSetAccent()).compareTo(Boolean.valueOf(other.isSetAccent()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetAccent() && (compareTo8 = TBaseHelper.compareTo(this.accent, other.accent)) != 0) {
            return compareTo8;
        }
        int compareTo14 = Boolean.valueOf(isSetMean_cn()).compareTo(Boolean.valueOf(other.isSetMean_cn()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (isSetMean_cn() && (compareTo7 = TBaseHelper.compareTo(this.mean_cn, other.mean_cn)) != 0) {
            return compareTo7;
        }
        int compareTo15 = Boolean.valueOf(isSetSentence()).compareTo(Boolean.valueOf(other.isSetSentence()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (isSetSentence() && (compareTo6 = TBaseHelper.compareTo(this.sentence, other.sentence)) != 0) {
            return compareTo6;
        }
        int compareTo16 = Boolean.valueOf(isSetSentence_trans()).compareTo(Boolean.valueOf(other.isSetSentence_trans()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (isSetSentence_trans() && (compareTo5 = TBaseHelper.compareTo(this.sentence_trans, other.sentence_trans)) != 0) {
            return compareTo5;
        }
        int compareTo17 = Boolean.valueOf(isSetTv_path()).compareTo(Boolean.valueOf(other.isSetTv_path()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (isSetTv_path() && (compareTo4 = TBaseHelper.compareTo(this.tv_path, other.tv_path)) != 0) {
            return compareTo4;
        }
        int compareTo18 = Boolean.valueOf(isSetTv_snapshot_path()).compareTo(Boolean.valueOf(other.isSetTv_snapshot_path()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (isSetTv_snapshot_path() && (compareTo3 = TBaseHelper.compareTo(this.tv_snapshot_path, other.tv_snapshot_path)) != 0) {
            return compareTo3;
        }
        int compareTo19 = Boolean.valueOf(isSetWord_audio_path()).compareTo(Boolean.valueOf(other.isSetWord_audio_path()));
        if (compareTo19 != 0) {
            return compareTo19;
        }
        if (isSetWord_audio_path() && (compareTo2 = TBaseHelper.compareTo(this.word_audio_path, other.word_audio_path)) != 0) {
            return compareTo2;
        }
        int compareTo20 = Boolean.valueOf(isSetCreated_at()).compareTo(Boolean.valueOf(other.isSetCreated_at()));
        if (compareTo20 != 0) {
            return compareTo20;
        }
        if (!isSetCreated_at() || (compareTo = TBaseHelper.compareTo(this.created_at, other.created_at)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BBWordMediaV3, _Fields> deepCopy2() {
        return new BBWordMediaV3(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBWordMediaV3$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getTopic_id());
            case 2:
                return getWord();
            case 3:
                return getAccent();
            case 4:
                return getMean_cn();
            case 5:
                return getSentence();
            case 6:
                return getSentence_trans();
            case 7:
                return getTv_path();
            case 8:
                return getTv_snapshot_path();
            case 9:
                return getWord_audio_path();
            case 10:
                return Long.valueOf(getCreated_at());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBWordMediaV3$_Fields[field.ordinal()]) {
            case 1:
                return isSetTopic_id();
            case 2:
                return isSetWord();
            case 3:
                return isSetAccent();
            case 4:
                return isSetMean_cn();
            case 5:
                return isSetSentence();
            case 6:
                return isSetSentence_trans();
            case 7:
                return isSetTv_path();
            case 8:
                return isSetTv_snapshot_path();
            case 9:
                return isSetWord_audio_path();
            case 10:
                return isSetCreated_at();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBWordMediaV3$_Fields[field.ordinal()]) {
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
                    setAccent((String) value);
                    break;
                } else {
                    unsetAccent();
                    break;
                }
            case 4:
                if (value != null) {
                    setMean_cn((String) value);
                    break;
                } else {
                    unsetMean_cn();
                    break;
                }
            case 5:
                if (value != null) {
                    setSentence((String) value);
                    break;
                } else {
                    unsetSentence();
                    break;
                }
            case 6:
                if (value != null) {
                    setSentence_trans((String) value);
                    break;
                } else {
                    unsetSentence_trans();
                    break;
                }
            case 7:
                if (value != null) {
                    setTv_path((String) value);
                    break;
                } else {
                    unsetTv_path();
                    break;
                }
            case 8:
                if (value != null) {
                    setTv_snapshot_path((String) value);
                    break;
                } else {
                    unsetTv_snapshot_path();
                    break;
                }
            case 9:
                if (value != null) {
                    setWord_audio_path((String) value);
                    break;
                } else {
                    unsetWord_audio_path();
                    break;
                }
            case 10:
                if (value != null) {
                    setCreated_at(((Long) value).longValue());
                    break;
                } else {
                    unsetCreated_at();
                    break;
                }
        }
    }

    public boolean equals(BBWordMediaV3 that) {
        if (that == null || this.topic_id != that.topic_id) {
            return false;
        }
        boolean isSetWord = isSetWord();
        boolean isSetWord2 = that.isSetWord();
        if ((isSetWord || isSetWord2) && !(isSetWord && isSetWord2 && this.word.equals(that.word))) {
            return false;
        }
        boolean isSetAccent = isSetAccent();
        boolean isSetAccent2 = that.isSetAccent();
        if ((isSetAccent || isSetAccent2) && !(isSetAccent && isSetAccent2 && this.accent.equals(that.accent))) {
            return false;
        }
        boolean isSetMean_cn = isSetMean_cn();
        boolean isSetMean_cn2 = that.isSetMean_cn();
        if ((isSetMean_cn || isSetMean_cn2) && !(isSetMean_cn && isSetMean_cn2 && this.mean_cn.equals(that.mean_cn))) {
            return false;
        }
        boolean isSetSentence = isSetSentence();
        boolean isSetSentence2 = that.isSetSentence();
        if ((isSetSentence || isSetSentence2) && !(isSetSentence && isSetSentence2 && this.sentence.equals(that.sentence))) {
            return false;
        }
        boolean isSetSentence_trans = isSetSentence_trans();
        boolean isSetSentence_trans2 = that.isSetSentence_trans();
        if ((isSetSentence_trans || isSetSentence_trans2) && !(isSetSentence_trans && isSetSentence_trans2 && this.sentence_trans.equals(that.sentence_trans))) {
            return false;
        }
        boolean isSetTv_path = isSetTv_path();
        boolean isSetTv_path2 = that.isSetTv_path();
        if ((isSetTv_path || isSetTv_path2) && !(isSetTv_path && isSetTv_path2 && this.tv_path.equals(that.tv_path))) {
            return false;
        }
        boolean isSetTv_snapshot_path = isSetTv_snapshot_path();
        boolean isSetTv_snapshot_path2 = that.isSetTv_snapshot_path();
        if ((isSetTv_snapshot_path || isSetTv_snapshot_path2) && !(isSetTv_snapshot_path && isSetTv_snapshot_path2 && this.tv_snapshot_path.equals(that.tv_snapshot_path))) {
            return false;
        }
        boolean isSetWord_audio_path = isSetWord_audio_path();
        boolean isSetWord_audio_path2 = that.isSetWord_audio_path();
        return (!(isSetWord_audio_path || isSetWord_audio_path2) || (isSetWord_audio_path && isSetWord_audio_path2 && this.word_audio_path.equals(that.word_audio_path))) && this.created_at == that.created_at;
    }

    public BBWordMediaV3(int topic_id, String word, String accent, String mean_cn, String sentence, String sentence_trans, String tv_path, long created_at) {
        this();
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        this.word = word;
        this.accent = accent;
        this.mean_cn = mean_cn;
        this.sentence = sentence;
        this.sentence_trans = sentence_trans;
        this.tv_path = tv_path;
        this.created_at = created_at;
        setCreated_atIsSet(true);
    }

    public BBWordMediaV3(BBWordMediaV3 other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.TV_SNAPSHOT_PATH, _Fields.WORD_AUDIO_PATH};
        this.__isset_bitfield = other.__isset_bitfield;
        this.topic_id = other.topic_id;
        if (other.isSetWord()) {
            this.word = other.word;
        }
        if (other.isSetAccent()) {
            this.accent = other.accent;
        }
        if (other.isSetMean_cn()) {
            this.mean_cn = other.mean_cn;
        }
        if (other.isSetSentence()) {
            this.sentence = other.sentence;
        }
        if (other.isSetSentence_trans()) {
            this.sentence_trans = other.sentence_trans;
        }
        if (other.isSetTv_path()) {
            this.tv_path = other.tv_path;
        }
        if (other.isSetTv_snapshot_path()) {
            this.tv_snapshot_path = other.tv_snapshot_path;
        }
        if (other.isSetWord_audio_path()) {
            this.word_audio_path = other.word_audio_path;
        }
        this.created_at = other.created_at;
    }
}
