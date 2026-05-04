package com.baicizhan.online.resource_api;

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
public class SentenceInfo implements TBase<SentenceInfo, _Fields>, Serializable, Cloneable, Comparable<SentenceInfo> {
    private static final int __CHN_MEAN_ID_ISSET_ID = 2;
    private static final int __ID_ISSET_ID = 0;
    private static final int __TOPIC_ID_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String audio_uri;
    public long chn_mean_id;
    public String highlight_phrase;

    /* renamed from: id, reason: collision with root package name */
    public long f28160id;
    public String img_uri;
    private _Fields[] optionals;
    public String sentence;
    public String sentence_trans;
    public int topic_id;
    private static final TStruct STRUCT_DESC = new TStruct("SentenceInfo");
    private static final TField ID_FIELD_DESC = new TField("id", (byte) 10, 1);
    private static final TField TOPIC_ID_FIELD_DESC = new TField("topic_id", (byte) 8, 2);
    private static final TField CHN_MEAN_ID_FIELD_DESC = new TField("chn_mean_id", (byte) 10, 3);
    private static final TField SENTENCE_FIELD_DESC = new TField("sentence", (byte) 11, 4);
    private static final TField SENTENCE_TRANS_FIELD_DESC = new TField("sentence_trans", (byte) 11, 5);
    private static final TField HIGHLIGHT_PHRASE_FIELD_DESC = new TField("highlight_phrase", (byte) 11, 6);
    private static final TField IMG_URI_FIELD_DESC = new TField("img_uri", (byte) 11, 7);
    private static final TField AUDIO_URI_FIELD_DESC = new TField("audio_uri", (byte) 11, 8);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.resource_api.SentenceInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$SentenceInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$SentenceInfo$_Fields = iArr;
            try {
                iArr[_Fields.ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$SentenceInfo$_Fields[_Fields.TOPIC_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$SentenceInfo$_Fields[_Fields.CHN_MEAN_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$SentenceInfo$_Fields[_Fields.SENTENCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$SentenceInfo$_Fields[_Fields.SENTENCE_TRANS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$SentenceInfo$_Fields[_Fields.HIGHLIGHT_PHRASE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$SentenceInfo$_Fields[_Fields.IMG_URI.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$SentenceInfo$_Fields[_Fields.AUDIO_URI.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SentenceInfoStandardScheme extends StandardScheme<SentenceInfo> {
        private SentenceInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, SentenceInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetId()) {
                        throw new TProtocolException("Required field 'id' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetTopic_id()) {
                        throw new TProtocolException("Required field 'topic_id' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetChn_mean_id()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'chn_mean_id' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.f28160id = iprot.readI64();
                            struct.setIdIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.topic_id = iprot.readI32();
                            struct.setTopic_idIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.chn_mean_id = iprot.readI64();
                            struct.setChn_mean_idIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.sentence = iprot.readString();
                            struct.setSentenceIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.sentence_trans = iprot.readString();
                            struct.setSentence_transIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.highlight_phrase = iprot.readString();
                            struct.setHighlight_phraseIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.img_uri = iprot.readString();
                            struct.setImg_uriIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.audio_uri = iprot.readString();
                            struct.setAudio_uriIsSet(true);
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
        public void write(TProtocol oprot, SentenceInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(SentenceInfo.STRUCT_DESC);
            oprot.writeFieldBegin(SentenceInfo.ID_FIELD_DESC);
            oprot.writeI64(struct.f28160id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(SentenceInfo.TOPIC_ID_FIELD_DESC);
            oprot.writeI32(struct.topic_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(SentenceInfo.CHN_MEAN_ID_FIELD_DESC);
            oprot.writeI64(struct.chn_mean_id);
            oprot.writeFieldEnd();
            if (struct.sentence != null) {
                oprot.writeFieldBegin(SentenceInfo.SENTENCE_FIELD_DESC);
                oprot.writeString(struct.sentence);
                oprot.writeFieldEnd();
            }
            if (struct.sentence_trans != null) {
                oprot.writeFieldBegin(SentenceInfo.SENTENCE_TRANS_FIELD_DESC);
                oprot.writeString(struct.sentence_trans);
                oprot.writeFieldEnd();
            }
            if (struct.highlight_phrase != null && struct.isSetHighlight_phrase()) {
                oprot.writeFieldBegin(SentenceInfo.HIGHLIGHT_PHRASE_FIELD_DESC);
                oprot.writeString(struct.highlight_phrase);
                oprot.writeFieldEnd();
            }
            if (struct.img_uri != null && struct.isSetImg_uri()) {
                oprot.writeFieldBegin(SentenceInfo.IMG_URI_FIELD_DESC);
                oprot.writeString(struct.img_uri);
                oprot.writeFieldEnd();
            }
            if (struct.audio_uri != null && struct.isSetAudio_uri()) {
                oprot.writeFieldBegin(SentenceInfo.AUDIO_URI_FIELD_DESC);
                oprot.writeString(struct.audio_uri);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SentenceInfoStandardSchemeFactory implements SchemeFactory {
        private SentenceInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SentenceInfoStandardScheme getScheme() {
            return new SentenceInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SentenceInfoTupleScheme extends TupleScheme<SentenceInfo> {
        private SentenceInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, SentenceInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.f28160id = tTupleProtocol.readI64();
            struct.setIdIsSet(true);
            struct.topic_id = tTupleProtocol.readI32();
            struct.setTopic_idIsSet(true);
            struct.chn_mean_id = tTupleProtocol.readI64();
            struct.setChn_mean_idIsSet(true);
            struct.sentence = tTupleProtocol.readString();
            struct.setSentenceIsSet(true);
            struct.sentence_trans = tTupleProtocol.readString();
            struct.setSentence_transIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(3);
            if (readBitSet.get(0)) {
                struct.highlight_phrase = tTupleProtocol.readString();
                struct.setHighlight_phraseIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.img_uri = tTupleProtocol.readString();
                struct.setImg_uriIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.audio_uri = tTupleProtocol.readString();
                struct.setAudio_uriIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, SentenceInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI64(struct.f28160id);
            tTupleProtocol.writeI32(struct.topic_id);
            tTupleProtocol.writeI64(struct.chn_mean_id);
            tTupleProtocol.writeString(struct.sentence);
            tTupleProtocol.writeString(struct.sentence_trans);
            BitSet bitSet = new BitSet();
            if (struct.isSetHighlight_phrase()) {
                bitSet.set(0);
            }
            if (struct.isSetImg_uri()) {
                bitSet.set(1);
            }
            if (struct.isSetAudio_uri()) {
                bitSet.set(2);
            }
            tTupleProtocol.writeBitSet(bitSet, 3);
            if (struct.isSetHighlight_phrase()) {
                tTupleProtocol.writeString(struct.highlight_phrase);
            }
            if (struct.isSetImg_uri()) {
                tTupleProtocol.writeString(struct.img_uri);
            }
            if (struct.isSetAudio_uri()) {
                tTupleProtocol.writeString(struct.audio_uri);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SentenceInfoTupleSchemeFactory implements SchemeFactory {
        private SentenceInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SentenceInfoTupleScheme getScheme() {
            return new SentenceInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ID(1, "id"),
        TOPIC_ID(2, "topic_id"),
        CHN_MEAN_ID(3, "chn_mean_id"),
        SENTENCE(4, "sentence"),
        SENTENCE_TRANS(5, "sentence_trans"),
        HIGHLIGHT_PHRASE(6, "highlight_phrase"),
        IMG_URI(7, "img_uri"),
        AUDIO_URI(8, "audio_uri");

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
                    return ID;
                case 2:
                    return TOPIC_ID;
                case 3:
                    return CHN_MEAN_ID;
                case 4:
                    return SENTENCE;
                case 5:
                    return SENTENCE_TRANS;
                case 6:
                    return HIGHLIGHT_PHRASE;
                case 7:
                    return IMG_URI;
                case 8:
                    return AUDIO_URI;
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
        hashMap.put(StandardScheme.class, new SentenceInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new SentenceInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ID, (_Fields) new FieldMetaData("id", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.TOPIC_ID, (_Fields) new FieldMetaData("topic_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.CHN_MEAN_ID, (_Fields) new FieldMetaData("chn_mean_id", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.SENTENCE, (_Fields) new FieldMetaData("sentence", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SENTENCE_TRANS, (_Fields) new FieldMetaData("sentence_trans", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.HIGHLIGHT_PHRASE, (_Fields) new FieldMetaData("highlight_phrase", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.IMG_URI, (_Fields) new FieldMetaData("img_uri", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.AUDIO_URI, (_Fields) new FieldMetaData("audio_uri", (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(SentenceInfo.class, unmodifiableMap);
    }

    public SentenceInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.HIGHLIGHT_PHRASE, _Fields.IMG_URI, _Fields.AUDIO_URI};
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
        setIdIsSet(false);
        this.f28160id = 0L;
        setTopic_idIsSet(false);
        this.topic_id = 0;
        setChn_mean_idIsSet(false);
        this.chn_mean_id = 0L;
        this.sentence = null;
        this.sentence_trans = null;
        this.highlight_phrase = null;
        this.img_uri = null;
        this.audio_uri = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof SentenceInfo)) {
            return equals((SentenceInfo) that);
        }
        return false;
    }

    public String getAudio_uri() {
        return this.audio_uri;
    }

    public long getChn_mean_id() {
        return this.chn_mean_id;
    }

    public String getHighlight_phrase() {
        return this.highlight_phrase;
    }

    public long getId() {
        return this.f28160id;
    }

    public String getImg_uri() {
        return this.img_uri;
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

    public int hashCode() {
        return 0;
    }

    public boolean isSetAudio_uri() {
        return this.audio_uri != null;
    }

    public boolean isSetChn_mean_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetHighlight_phrase() {
        return this.highlight_phrase != null;
    }

    public boolean isSetId() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetImg_uri() {
        return this.img_uri != null;
    }

    public boolean isSetSentence() {
        return this.sentence != null;
    }

    public boolean isSetSentence_trans() {
        return this.sentence_trans != null;
    }

    public boolean isSetTopic_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public SentenceInfo setAudio_uri(String audio_uri) {
        this.audio_uri = audio_uri;
        return this;
    }

    public void setAudio_uriIsSet(boolean value) {
        if (value) {
            return;
        }
        this.audio_uri = null;
    }

    public SentenceInfo setChn_mean_id(long chn_mean_id) {
        this.chn_mean_id = chn_mean_id;
        setChn_mean_idIsSet(true);
        return this;
    }

    public void setChn_mean_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public SentenceInfo setHighlight_phrase(String highlight_phrase) {
        this.highlight_phrase = highlight_phrase;
        return this;
    }

    public void setHighlight_phraseIsSet(boolean value) {
        if (value) {
            return;
        }
        this.highlight_phrase = null;
    }

    public SentenceInfo setId(long id2) {
        this.f28160id = id2;
        setIdIsSet(true);
        return this;
    }

    public void setIdIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public SentenceInfo setImg_uri(String img_uri) {
        this.img_uri = img_uri;
        return this;
    }

    public void setImg_uriIsSet(boolean value) {
        if (value) {
            return;
        }
        this.img_uri = null;
    }

    public SentenceInfo setSentence(String sentence) {
        this.sentence = sentence;
        return this;
    }

    public void setSentenceIsSet(boolean value) {
        if (value) {
            return;
        }
        this.sentence = null;
    }

    public SentenceInfo setSentence_trans(String sentence_trans) {
        this.sentence_trans = sentence_trans;
        return this;
    }

    public void setSentence_transIsSet(boolean value) {
        if (value) {
            return;
        }
        this.sentence_trans = null;
    }

    public SentenceInfo setTopic_id(int topic_id) {
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        return this;
    }

    public void setTopic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SentenceInfo(");
        sb2.append("id:");
        sb2.append(this.f28160id);
        sb2.append(j2.O);
        sb2.append("topic_id:");
        sb2.append(this.topic_id);
        sb2.append(j2.O);
        sb2.append("chn_mean_id:");
        sb2.append(this.chn_mean_id);
        sb2.append(j2.O);
        sb2.append("sentence:");
        String str = this.sentence;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("sentence_trans:");
        String str2 = this.sentence_trans;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        if (isSetHighlight_phrase()) {
            sb2.append(j2.O);
            sb2.append("highlight_phrase:");
            String str3 = this.highlight_phrase;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
        }
        if (isSetImg_uri()) {
            sb2.append(j2.O);
            sb2.append("img_uri:");
            String str4 = this.img_uri;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (isSetAudio_uri()) {
            sb2.append(j2.O);
            sb2.append("audio_uri:");
            String str5 = this.audio_uri;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAudio_uri() {
        this.audio_uri = null;
    }

    public void unsetChn_mean_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetHighlight_phrase() {
        this.highlight_phrase = null;
    }

    public void unsetId() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetImg_uri() {
        this.img_uri = null;
    }

    public void unsetSentence() {
        this.sentence = null;
    }

    public void unsetSentence_trans() {
        this.sentence_trans = null;
    }

    public void unsetTopic_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void validate() throws TException {
        if (this.sentence == null) {
            throw new TProtocolException("Required field 'sentence' was not present! Struct: " + toString());
        }
        if (this.sentence_trans != null) {
            return;
        }
        throw new TProtocolException("Required field 'sentence_trans' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(SentenceInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        int compareTo7;
        int compareTo8;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo9 = Boolean.valueOf(isSetId()).compareTo(Boolean.valueOf(other.isSetId()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetId() && (compareTo8 = TBaseHelper.compareTo(this.f28160id, other.f28160id)) != 0) {
            return compareTo8;
        }
        int compareTo10 = Boolean.valueOf(isSetTopic_id()).compareTo(Boolean.valueOf(other.isSetTopic_id()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetTopic_id() && (compareTo7 = TBaseHelper.compareTo(this.topic_id, other.topic_id)) != 0) {
            return compareTo7;
        }
        int compareTo11 = Boolean.valueOf(isSetChn_mean_id()).compareTo(Boolean.valueOf(other.isSetChn_mean_id()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetChn_mean_id() && (compareTo6 = TBaseHelper.compareTo(this.chn_mean_id, other.chn_mean_id)) != 0) {
            return compareTo6;
        }
        int compareTo12 = Boolean.valueOf(isSetSentence()).compareTo(Boolean.valueOf(other.isSetSentence()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetSentence() && (compareTo5 = TBaseHelper.compareTo(this.sentence, other.sentence)) != 0) {
            return compareTo5;
        }
        int compareTo13 = Boolean.valueOf(isSetSentence_trans()).compareTo(Boolean.valueOf(other.isSetSentence_trans()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetSentence_trans() && (compareTo4 = TBaseHelper.compareTo(this.sentence_trans, other.sentence_trans)) != 0) {
            return compareTo4;
        }
        int compareTo14 = Boolean.valueOf(isSetHighlight_phrase()).compareTo(Boolean.valueOf(other.isSetHighlight_phrase()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (isSetHighlight_phrase() && (compareTo3 = TBaseHelper.compareTo(this.highlight_phrase, other.highlight_phrase)) != 0) {
            return compareTo3;
        }
        int compareTo15 = Boolean.valueOf(isSetImg_uri()).compareTo(Boolean.valueOf(other.isSetImg_uri()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (isSetImg_uri() && (compareTo2 = TBaseHelper.compareTo(this.img_uri, other.img_uri)) != 0) {
            return compareTo2;
        }
        int compareTo16 = Boolean.valueOf(isSetAudio_uri()).compareTo(Boolean.valueOf(other.isSetAudio_uri()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (!isSetAudio_uri() || (compareTo = TBaseHelper.compareTo(this.audio_uri, other.audio_uri)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<SentenceInfo, _Fields> deepCopy2() {
        return new SentenceInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$SentenceInfo$_Fields[field.ordinal()]) {
            case 1:
                return Long.valueOf(getId());
            case 2:
                return Integer.valueOf(getTopic_id());
            case 3:
                return Long.valueOf(getChn_mean_id());
            case 4:
                return getSentence();
            case 5:
                return getSentence_trans();
            case 6:
                return getHighlight_phrase();
            case 7:
                return getImg_uri();
            case 8:
                return getAudio_uri();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$SentenceInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetId();
            case 2:
                return isSetTopic_id();
            case 3:
                return isSetChn_mean_id();
            case 4:
                return isSetSentence();
            case 5:
                return isSetSentence_trans();
            case 6:
                return isSetHighlight_phrase();
            case 7:
                return isSetImg_uri();
            case 8:
                return isSetAudio_uri();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$SentenceInfo$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setId(((Long) value).longValue());
                    break;
                } else {
                    unsetId();
                    break;
                }
            case 2:
                if (value != null) {
                    setTopic_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetTopic_id();
                    break;
                }
            case 3:
                if (value != null) {
                    setChn_mean_id(((Long) value).longValue());
                    break;
                } else {
                    unsetChn_mean_id();
                    break;
                }
            case 4:
                if (value != null) {
                    setSentence((String) value);
                    break;
                } else {
                    unsetSentence();
                    break;
                }
            case 5:
                if (value != null) {
                    setSentence_trans((String) value);
                    break;
                } else {
                    unsetSentence_trans();
                    break;
                }
            case 6:
                if (value != null) {
                    setHighlight_phrase((String) value);
                    break;
                } else {
                    unsetHighlight_phrase();
                    break;
                }
            case 7:
                if (value != null) {
                    setImg_uri((String) value);
                    break;
                } else {
                    unsetImg_uri();
                    break;
                }
            case 8:
                if (value != null) {
                    setAudio_uri((String) value);
                    break;
                } else {
                    unsetAudio_uri();
                    break;
                }
        }
    }

    public boolean equals(SentenceInfo that) {
        if (that == null || this.f28160id != that.f28160id || this.topic_id != that.topic_id || this.chn_mean_id != that.chn_mean_id) {
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
        boolean isSetHighlight_phrase = isSetHighlight_phrase();
        boolean isSetHighlight_phrase2 = that.isSetHighlight_phrase();
        if ((isSetHighlight_phrase || isSetHighlight_phrase2) && !(isSetHighlight_phrase && isSetHighlight_phrase2 && this.highlight_phrase.equals(that.highlight_phrase))) {
            return false;
        }
        boolean isSetImg_uri = isSetImg_uri();
        boolean isSetImg_uri2 = that.isSetImg_uri();
        if ((isSetImg_uri || isSetImg_uri2) && !(isSetImg_uri && isSetImg_uri2 && this.img_uri.equals(that.img_uri))) {
            return false;
        }
        boolean isSetAudio_uri = isSetAudio_uri();
        boolean isSetAudio_uri2 = that.isSetAudio_uri();
        if (isSetAudio_uri || isSetAudio_uri2) {
            return isSetAudio_uri && isSetAudio_uri2 && this.audio_uri.equals(that.audio_uri);
        }
        return true;
    }

    public SentenceInfo(long id2, int topic_id, long chn_mean_id, String sentence, String sentence_trans) {
        this();
        this.f28160id = id2;
        setIdIsSet(true);
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        this.chn_mean_id = chn_mean_id;
        setChn_mean_idIsSet(true);
        this.sentence = sentence;
        this.sentence_trans = sentence_trans;
    }

    public SentenceInfo(SentenceInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.HIGHLIGHT_PHRASE, _Fields.IMG_URI, _Fields.AUDIO_URI};
        this.__isset_bitfield = other.__isset_bitfield;
        this.f28160id = other.f28160id;
        this.topic_id = other.topic_id;
        this.chn_mean_id = other.chn_mean_id;
        if (other.isSetSentence()) {
            this.sentence = other.sentence;
        }
        if (other.isSetSentence_trans()) {
            this.sentence_trans = other.sentence_trans;
        }
        if (other.isSetHighlight_phrase()) {
            this.highlight_phrase = other.highlight_phrase;
        }
        if (other.isSetImg_uri()) {
            this.img_uri = other.img_uri;
        }
        if (other.isSetAudio_uri()) {
            this.audio_uri = other.audio_uri;
        }
    }
}
