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
public class WordMedia implements TBase<WordMedia, _Fields>, Serializable, Cloneable, Comparable<WordMedia> {
    private static final int __FM_UPDATED_AT_ISSET_ID = 1;
    private static final int __POSTER_UPDATED_AT_ISSET_ID = 3;
    private static final int __TOPIC_ID_ISSET_ID = 0;
    private static final int __TV_UPDATED_AT_ISSET_ID = 2;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String amr_audio_path;
    public long fm_updated_at;
    public String m4a_audio_path;
    private _Fields[] optionals;
    public long poster_updated_at;
    public String poster_zpk;
    public int topic_id;
    public String tv_path;
    public String tv_snapshot_path;
    public long tv_updated_at;
    public String word;
    public String word_mean_cn;
    public String word_sentence;
    public String word_type;
    private static final TStruct STRUCT_DESC = new TStruct("WordMedia");
    private static final TField TOPIC_ID_FIELD_DESC = new TField("topic_id", (byte) 8, 1);
    private static final TField M4A_AUDIO_PATH_FIELD_DESC = new TField(a.v.C0263a.f16320f, (byte) 11, 2);
    private static final TField AMR_AUDIO_PATH_FIELD_DESC = new TField(a.v.C0263a.f16321g, (byte) 11, 3);
    private static final TField TV_PATH_FIELD_DESC = new TField(a.v.C0263a.f16322h, (byte) 11, 4);
    private static final TField TV_SNAPSHOT_PATH_FIELD_DESC = new TField(a.v.C0263a.f16323i, (byte) 11, 5);
    private static final TField WORD_FIELD_DESC = new TField("word", (byte) 11, 6);
    private static final TField WORD_MEAN_CN_FIELD_DESC = new TField("word_mean_cn", (byte) 11, 7);
    private static final TField WORD_TYPE_FIELD_DESC = new TField("word_type", (byte) 11, 8);
    private static final TField WORD_SENTENCE_FIELD_DESC = new TField("word_sentence", (byte) 11, 9);
    private static final TField FM_UPDATED_AT_FIELD_DESC = new TField("fm_updated_at", (byte) 10, 10);
    private static final TField TV_UPDATED_AT_FIELD_DESC = new TField("tv_updated_at", (byte) 10, 11);
    private static final TField POSTER_UPDATED_AT_FIELD_DESC = new TField("poster_updated_at", (byte) 10, 12);
    private static final TField POSTER_ZPK_FIELD_DESC = new TField("poster_zpk", (byte) 11, 13);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.resource_api.WordMedia$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$WordMedia$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$WordMedia$_Fields = iArr;
            try {
                iArr[_Fields.TOPIC_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$WordMedia$_Fields[_Fields.M4A_AUDIO_PATH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$WordMedia$_Fields[_Fields.AMR_AUDIO_PATH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$WordMedia$_Fields[_Fields.TV_PATH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$WordMedia$_Fields[_Fields.TV_SNAPSHOT_PATH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$WordMedia$_Fields[_Fields.WORD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$WordMedia$_Fields[_Fields.WORD_MEAN_CN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$WordMedia$_Fields[_Fields.WORD_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$WordMedia$_Fields[_Fields.WORD_SENTENCE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$WordMedia$_Fields[_Fields.FM_UPDATED_AT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$WordMedia$_Fields[_Fields.TV_UPDATED_AT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$WordMedia$_Fields[_Fields.POSTER_UPDATED_AT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$WordMedia$_Fields[_Fields.POSTER_ZPK.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WordMediaStandardScheme extends StandardScheme<WordMedia> {
        private WordMediaStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, WordMedia struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (struct.isSetTopic_id()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'topic_id' was not found in serialized data! Struct: " + toString());
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
                            struct.m4a_audio_path = iprot.readString();
                            struct.setM4a_audio_pathIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.amr_audio_path = iprot.readString();
                            struct.setAmr_audio_pathIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.tv_path = iprot.readString();
                            struct.setTv_pathIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.tv_snapshot_path = iprot.readString();
                            struct.setTv_snapshot_pathIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.word = iprot.readString();
                            struct.setWordIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.word_mean_cn = iprot.readString();
                            struct.setWord_mean_cnIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.word_type = iprot.readString();
                            struct.setWord_typeIsSet(true);
                            break;
                        }
                    case 9:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.word_sentence = iprot.readString();
                            struct.setWord_sentenceIsSet(true);
                            break;
                        }
                    case 10:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.fm_updated_at = iprot.readI64();
                            struct.setFm_updated_atIsSet(true);
                            break;
                        }
                    case 11:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.tv_updated_at = iprot.readI64();
                            struct.setTv_updated_atIsSet(true);
                            break;
                        }
                    case 12:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.poster_updated_at = iprot.readI64();
                            struct.setPoster_updated_atIsSet(true);
                            break;
                        }
                    case 13:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.poster_zpk = iprot.readString();
                            struct.setPoster_zpkIsSet(true);
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
        public void write(TProtocol oprot, WordMedia struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(WordMedia.STRUCT_DESC);
            oprot.writeFieldBegin(WordMedia.TOPIC_ID_FIELD_DESC);
            oprot.writeI32(struct.topic_id);
            oprot.writeFieldEnd();
            if (struct.m4a_audio_path != null && struct.isSetM4a_audio_path()) {
                oprot.writeFieldBegin(WordMedia.M4A_AUDIO_PATH_FIELD_DESC);
                oprot.writeString(struct.m4a_audio_path);
                oprot.writeFieldEnd();
            }
            if (struct.amr_audio_path != null && struct.isSetAmr_audio_path()) {
                oprot.writeFieldBegin(WordMedia.AMR_AUDIO_PATH_FIELD_DESC);
                oprot.writeString(struct.amr_audio_path);
                oprot.writeFieldEnd();
            }
            if (struct.tv_path != null && struct.isSetTv_path()) {
                oprot.writeFieldBegin(WordMedia.TV_PATH_FIELD_DESC);
                oprot.writeString(struct.tv_path);
                oprot.writeFieldEnd();
            }
            if (struct.tv_snapshot_path != null && struct.isSetTv_snapshot_path()) {
                oprot.writeFieldBegin(WordMedia.TV_SNAPSHOT_PATH_FIELD_DESC);
                oprot.writeString(struct.tv_snapshot_path);
                oprot.writeFieldEnd();
            }
            if (struct.word != null && struct.isSetWord()) {
                oprot.writeFieldBegin(WordMedia.WORD_FIELD_DESC);
                oprot.writeString(struct.word);
                oprot.writeFieldEnd();
            }
            if (struct.word_mean_cn != null && struct.isSetWord_mean_cn()) {
                oprot.writeFieldBegin(WordMedia.WORD_MEAN_CN_FIELD_DESC);
                oprot.writeString(struct.word_mean_cn);
                oprot.writeFieldEnd();
            }
            if (struct.word_type != null && struct.isSetWord_type()) {
                oprot.writeFieldBegin(WordMedia.WORD_TYPE_FIELD_DESC);
                oprot.writeString(struct.word_type);
                oprot.writeFieldEnd();
            }
            if (struct.word_sentence != null && struct.isSetWord_sentence()) {
                oprot.writeFieldBegin(WordMedia.WORD_SENTENCE_FIELD_DESC);
                oprot.writeString(struct.word_sentence);
                oprot.writeFieldEnd();
            }
            if (struct.isSetFm_updated_at()) {
                oprot.writeFieldBegin(WordMedia.FM_UPDATED_AT_FIELD_DESC);
                oprot.writeI64(struct.fm_updated_at);
                oprot.writeFieldEnd();
            }
            if (struct.isSetTv_updated_at()) {
                oprot.writeFieldBegin(WordMedia.TV_UPDATED_AT_FIELD_DESC);
                oprot.writeI64(struct.tv_updated_at);
                oprot.writeFieldEnd();
            }
            if (struct.isSetPoster_updated_at()) {
                oprot.writeFieldBegin(WordMedia.POSTER_UPDATED_AT_FIELD_DESC);
                oprot.writeI64(struct.poster_updated_at);
                oprot.writeFieldEnd();
            }
            if (struct.poster_zpk != null && struct.isSetPoster_zpk()) {
                oprot.writeFieldBegin(WordMedia.POSTER_ZPK_FIELD_DESC);
                oprot.writeString(struct.poster_zpk);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WordMediaStandardSchemeFactory implements SchemeFactory {
        private WordMediaStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public WordMediaStandardScheme getScheme() {
            return new WordMediaStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WordMediaTupleScheme extends TupleScheme<WordMedia> {
        private WordMediaTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, WordMedia struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.topic_id = tTupleProtocol.readI32();
            struct.setTopic_idIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(12);
            if (readBitSet.get(0)) {
                struct.m4a_audio_path = tTupleProtocol.readString();
                struct.setM4a_audio_pathIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.amr_audio_path = tTupleProtocol.readString();
                struct.setAmr_audio_pathIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.tv_path = tTupleProtocol.readString();
                struct.setTv_pathIsSet(true);
            }
            if (readBitSet.get(3)) {
                struct.tv_snapshot_path = tTupleProtocol.readString();
                struct.setTv_snapshot_pathIsSet(true);
            }
            if (readBitSet.get(4)) {
                struct.word = tTupleProtocol.readString();
                struct.setWordIsSet(true);
            }
            if (readBitSet.get(5)) {
                struct.word_mean_cn = tTupleProtocol.readString();
                struct.setWord_mean_cnIsSet(true);
            }
            if (readBitSet.get(6)) {
                struct.word_type = tTupleProtocol.readString();
                struct.setWord_typeIsSet(true);
            }
            if (readBitSet.get(7)) {
                struct.word_sentence = tTupleProtocol.readString();
                struct.setWord_sentenceIsSet(true);
            }
            if (readBitSet.get(8)) {
                struct.fm_updated_at = tTupleProtocol.readI64();
                struct.setFm_updated_atIsSet(true);
            }
            if (readBitSet.get(9)) {
                struct.tv_updated_at = tTupleProtocol.readI64();
                struct.setTv_updated_atIsSet(true);
            }
            if (readBitSet.get(10)) {
                struct.poster_updated_at = tTupleProtocol.readI64();
                struct.setPoster_updated_atIsSet(true);
            }
            if (readBitSet.get(11)) {
                struct.poster_zpk = tTupleProtocol.readString();
                struct.setPoster_zpkIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, WordMedia struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.topic_id);
            BitSet bitSet = new BitSet();
            if (struct.isSetM4a_audio_path()) {
                bitSet.set(0);
            }
            if (struct.isSetAmr_audio_path()) {
                bitSet.set(1);
            }
            if (struct.isSetTv_path()) {
                bitSet.set(2);
            }
            if (struct.isSetTv_snapshot_path()) {
                bitSet.set(3);
            }
            if (struct.isSetWord()) {
                bitSet.set(4);
            }
            if (struct.isSetWord_mean_cn()) {
                bitSet.set(5);
            }
            if (struct.isSetWord_type()) {
                bitSet.set(6);
            }
            if (struct.isSetWord_sentence()) {
                bitSet.set(7);
            }
            if (struct.isSetFm_updated_at()) {
                bitSet.set(8);
            }
            if (struct.isSetTv_updated_at()) {
                bitSet.set(9);
            }
            if (struct.isSetPoster_updated_at()) {
                bitSet.set(10);
            }
            if (struct.isSetPoster_zpk()) {
                bitSet.set(11);
            }
            tTupleProtocol.writeBitSet(bitSet, 12);
            if (struct.isSetM4a_audio_path()) {
                tTupleProtocol.writeString(struct.m4a_audio_path);
            }
            if (struct.isSetAmr_audio_path()) {
                tTupleProtocol.writeString(struct.amr_audio_path);
            }
            if (struct.isSetTv_path()) {
                tTupleProtocol.writeString(struct.tv_path);
            }
            if (struct.isSetTv_snapshot_path()) {
                tTupleProtocol.writeString(struct.tv_snapshot_path);
            }
            if (struct.isSetWord()) {
                tTupleProtocol.writeString(struct.word);
            }
            if (struct.isSetWord_mean_cn()) {
                tTupleProtocol.writeString(struct.word_mean_cn);
            }
            if (struct.isSetWord_type()) {
                tTupleProtocol.writeString(struct.word_type);
            }
            if (struct.isSetWord_sentence()) {
                tTupleProtocol.writeString(struct.word_sentence);
            }
            if (struct.isSetFm_updated_at()) {
                tTupleProtocol.writeI64(struct.fm_updated_at);
            }
            if (struct.isSetTv_updated_at()) {
                tTupleProtocol.writeI64(struct.tv_updated_at);
            }
            if (struct.isSetPoster_updated_at()) {
                tTupleProtocol.writeI64(struct.poster_updated_at);
            }
            if (struct.isSetPoster_zpk()) {
                tTupleProtocol.writeString(struct.poster_zpk);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WordMediaTupleSchemeFactory implements SchemeFactory {
        private WordMediaTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public WordMediaTupleScheme getScheme() {
            return new WordMediaTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TOPIC_ID(1, "topic_id"),
        M4A_AUDIO_PATH(2, a.v.C0263a.f16320f),
        AMR_AUDIO_PATH(3, a.v.C0263a.f16321g),
        TV_PATH(4, a.v.C0263a.f16322h),
        TV_SNAPSHOT_PATH(5, a.v.C0263a.f16323i),
        WORD(6, "word"),
        WORD_MEAN_CN(7, "word_mean_cn"),
        WORD_TYPE(8, "word_type"),
        WORD_SENTENCE(9, "word_sentence"),
        FM_UPDATED_AT(10, "fm_updated_at"),
        TV_UPDATED_AT(11, "tv_updated_at"),
        POSTER_UPDATED_AT(12, "poster_updated_at"),
        POSTER_ZPK(13, "poster_zpk");

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
                    return M4A_AUDIO_PATH;
                case 3:
                    return AMR_AUDIO_PATH;
                case 4:
                    return TV_PATH;
                case 5:
                    return TV_SNAPSHOT_PATH;
                case 6:
                    return WORD;
                case 7:
                    return WORD_MEAN_CN;
                case 8:
                    return WORD_TYPE;
                case 9:
                    return WORD_SENTENCE;
                case 10:
                    return FM_UPDATED_AT;
                case 11:
                    return TV_UPDATED_AT;
                case 12:
                    return POSTER_UPDATED_AT;
                case 13:
                    return POSTER_ZPK;
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
        hashMap.put(StandardScheme.class, new WordMediaStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new WordMediaTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TOPIC_ID, (_Fields) new FieldMetaData("topic_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.M4A_AUDIO_PATH, (_Fields) new FieldMetaData(a.v.C0263a.f16320f, (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.AMR_AUDIO_PATH, (_Fields) new FieldMetaData(a.v.C0263a.f16321g, (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.TV_PATH, (_Fields) new FieldMetaData(a.v.C0263a.f16322h, (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.TV_SNAPSHOT_PATH, (_Fields) new FieldMetaData(a.v.C0263a.f16323i, (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.WORD, (_Fields) new FieldMetaData("word", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.WORD_MEAN_CN, (_Fields) new FieldMetaData("word_mean_cn", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.WORD_TYPE, (_Fields) new FieldMetaData("word_type", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.WORD_SENTENCE, (_Fields) new FieldMetaData("word_sentence", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.FM_UPDATED_AT, (_Fields) new FieldMetaData("fm_updated_at", (byte) 2, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.TV_UPDATED_AT, (_Fields) new FieldMetaData("tv_updated_at", (byte) 2, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.POSTER_UPDATED_AT, (_Fields) new FieldMetaData("poster_updated_at", (byte) 2, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.POSTER_ZPK, (_Fields) new FieldMetaData("poster_zpk", (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(WordMedia.class, unmodifiableMap);
    }

    public WordMedia() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.M4A_AUDIO_PATH, _Fields.AMR_AUDIO_PATH, _Fields.TV_PATH, _Fields.TV_SNAPSHOT_PATH, _Fields.WORD, _Fields.WORD_MEAN_CN, _Fields.WORD_TYPE, _Fields.WORD_SENTENCE, _Fields.FM_UPDATED_AT, _Fields.TV_UPDATED_AT, _Fields.POSTER_UPDATED_AT, _Fields.POSTER_ZPK};
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
        this.m4a_audio_path = null;
        this.amr_audio_path = null;
        this.tv_path = null;
        this.tv_snapshot_path = null;
        this.word = null;
        this.word_mean_cn = null;
        this.word_type = null;
        this.word_sentence = null;
        setFm_updated_atIsSet(false);
        this.fm_updated_at = 0L;
        setTv_updated_atIsSet(false);
        this.tv_updated_at = 0L;
        setPoster_updated_atIsSet(false);
        this.poster_updated_at = 0L;
        this.poster_zpk = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof WordMedia)) {
            return equals((WordMedia) that);
        }
        return false;
    }

    public String getAmr_audio_path() {
        return this.amr_audio_path;
    }

    public long getFm_updated_at() {
        return this.fm_updated_at;
    }

    public String getM4a_audio_path() {
        return this.m4a_audio_path;
    }

    public long getPoster_updated_at() {
        return this.poster_updated_at;
    }

    public String getPoster_zpk() {
        return this.poster_zpk;
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

    public long getTv_updated_at() {
        return this.tv_updated_at;
    }

    public String getWord() {
        return this.word;
    }

    public String getWord_mean_cn() {
        return this.word_mean_cn;
    }

    public String getWord_sentence() {
        return this.word_sentence;
    }

    public String getWord_type() {
        return this.word_type;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAmr_audio_path() {
        return this.amr_audio_path != null;
    }

    public boolean isSetFm_updated_at() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetM4a_audio_path() {
        return this.m4a_audio_path != null;
    }

    public boolean isSetPoster_updated_at() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetPoster_zpk() {
        return this.poster_zpk != null;
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

    public boolean isSetTv_updated_at() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetWord() {
        return this.word != null;
    }

    public boolean isSetWord_mean_cn() {
        return this.word_mean_cn != null;
    }

    public boolean isSetWord_sentence() {
        return this.word_sentence != null;
    }

    public boolean isSetWord_type() {
        return this.word_type != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public WordMedia setAmr_audio_path(String amr_audio_path) {
        this.amr_audio_path = amr_audio_path;
        return this;
    }

    public void setAmr_audio_pathIsSet(boolean value) {
        if (value) {
            return;
        }
        this.amr_audio_path = null;
    }

    public WordMedia setFm_updated_at(long fm_updated_at) {
        this.fm_updated_at = fm_updated_at;
        setFm_updated_atIsSet(true);
        return this;
    }

    public void setFm_updated_atIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public WordMedia setM4a_audio_path(String m4a_audio_path) {
        this.m4a_audio_path = m4a_audio_path;
        return this;
    }

    public void setM4a_audio_pathIsSet(boolean value) {
        if (value) {
            return;
        }
        this.m4a_audio_path = null;
    }

    public WordMedia setPoster_updated_at(long poster_updated_at) {
        this.poster_updated_at = poster_updated_at;
        setPoster_updated_atIsSet(true);
        return this;
    }

    public void setPoster_updated_atIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public WordMedia setPoster_zpk(String poster_zpk) {
        this.poster_zpk = poster_zpk;
        return this;
    }

    public void setPoster_zpkIsSet(boolean value) {
        if (value) {
            return;
        }
        this.poster_zpk = null;
    }

    public WordMedia setTopic_id(int topic_id) {
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        return this;
    }

    public void setTopic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public WordMedia setTv_path(String tv_path) {
        this.tv_path = tv_path;
        return this;
    }

    public void setTv_pathIsSet(boolean value) {
        if (value) {
            return;
        }
        this.tv_path = null;
    }

    public WordMedia setTv_snapshot_path(String tv_snapshot_path) {
        this.tv_snapshot_path = tv_snapshot_path;
        return this;
    }

    public void setTv_snapshot_pathIsSet(boolean value) {
        if (value) {
            return;
        }
        this.tv_snapshot_path = null;
    }

    public WordMedia setTv_updated_at(long tv_updated_at) {
        this.tv_updated_at = tv_updated_at;
        setTv_updated_atIsSet(true);
        return this;
    }

    public void setTv_updated_atIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public WordMedia setWord(String word) {
        this.word = word;
        return this;
    }

    public void setWordIsSet(boolean value) {
        if (value) {
            return;
        }
        this.word = null;
    }

    public WordMedia setWord_mean_cn(String word_mean_cn) {
        this.word_mean_cn = word_mean_cn;
        return this;
    }

    public void setWord_mean_cnIsSet(boolean value) {
        if (value) {
            return;
        }
        this.word_mean_cn = null;
    }

    public WordMedia setWord_sentence(String word_sentence) {
        this.word_sentence = word_sentence;
        return this;
    }

    public void setWord_sentenceIsSet(boolean value) {
        if (value) {
            return;
        }
        this.word_sentence = null;
    }

    public WordMedia setWord_type(String word_type) {
        this.word_type = word_type;
        return this;
    }

    public void setWord_typeIsSet(boolean value) {
        if (value) {
            return;
        }
        this.word_type = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("WordMedia(");
        sb2.append("topic_id:");
        sb2.append(this.topic_id);
        if (isSetM4a_audio_path()) {
            sb2.append(j2.O);
            sb2.append("m4a_audio_path:");
            String str = this.m4a_audio_path;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
        }
        if (isSetAmr_audio_path()) {
            sb2.append(j2.O);
            sb2.append("amr_audio_path:");
            String str2 = this.amr_audio_path;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
        }
        if (isSetTv_path()) {
            sb2.append(j2.O);
            sb2.append("tv_path:");
            String str3 = this.tv_path;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
        }
        if (isSetTv_snapshot_path()) {
            sb2.append(j2.O);
            sb2.append("tv_snapshot_path:");
            String str4 = this.tv_snapshot_path;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (isSetWord()) {
            sb2.append(j2.O);
            sb2.append("word:");
            String str5 = this.word;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        if (isSetWord_mean_cn()) {
            sb2.append(j2.O);
            sb2.append("word_mean_cn:");
            String str6 = this.word_mean_cn;
            if (str6 == null) {
                sb2.append("null");
            } else {
                sb2.append(str6);
            }
        }
        if (isSetWord_type()) {
            sb2.append(j2.O);
            sb2.append("word_type:");
            String str7 = this.word_type;
            if (str7 == null) {
                sb2.append("null");
            } else {
                sb2.append(str7);
            }
        }
        if (isSetWord_sentence()) {
            sb2.append(j2.O);
            sb2.append("word_sentence:");
            String str8 = this.word_sentence;
            if (str8 == null) {
                sb2.append("null");
            } else {
                sb2.append(str8);
            }
        }
        if (isSetFm_updated_at()) {
            sb2.append(j2.O);
            sb2.append("fm_updated_at:");
            sb2.append(this.fm_updated_at);
        }
        if (isSetTv_updated_at()) {
            sb2.append(j2.O);
            sb2.append("tv_updated_at:");
            sb2.append(this.tv_updated_at);
        }
        if (isSetPoster_updated_at()) {
            sb2.append(j2.O);
            sb2.append("poster_updated_at:");
            sb2.append(this.poster_updated_at);
        }
        if (isSetPoster_zpk()) {
            sb2.append(j2.O);
            sb2.append("poster_zpk:");
            String str9 = this.poster_zpk;
            if (str9 == null) {
                sb2.append("null");
            } else {
                sb2.append(str9);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAmr_audio_path() {
        this.amr_audio_path = null;
    }

    public void unsetFm_updated_at() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetM4a_audio_path() {
        this.m4a_audio_path = null;
    }

    public void unsetPoster_updated_at() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetPoster_zpk() {
        this.poster_zpk = null;
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

    public void unsetTv_updated_at() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetWord() {
        this.word = null;
    }

    public void unsetWord_mean_cn() {
        this.word_mean_cn = null;
    }

    public void unsetWord_sentence() {
        this.word_sentence = null;
    }

    public void unsetWord_type() {
        this.word_type = null;
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(WordMedia other) {
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
        int compareTo11;
        int compareTo12;
        int compareTo13;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo14 = Boolean.valueOf(isSetTopic_id()).compareTo(Boolean.valueOf(other.isSetTopic_id()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (isSetTopic_id() && (compareTo13 = TBaseHelper.compareTo(this.topic_id, other.topic_id)) != 0) {
            return compareTo13;
        }
        int compareTo15 = Boolean.valueOf(isSetM4a_audio_path()).compareTo(Boolean.valueOf(other.isSetM4a_audio_path()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (isSetM4a_audio_path() && (compareTo12 = TBaseHelper.compareTo(this.m4a_audio_path, other.m4a_audio_path)) != 0) {
            return compareTo12;
        }
        int compareTo16 = Boolean.valueOf(isSetAmr_audio_path()).compareTo(Boolean.valueOf(other.isSetAmr_audio_path()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (isSetAmr_audio_path() && (compareTo11 = TBaseHelper.compareTo(this.amr_audio_path, other.amr_audio_path)) != 0) {
            return compareTo11;
        }
        int compareTo17 = Boolean.valueOf(isSetTv_path()).compareTo(Boolean.valueOf(other.isSetTv_path()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (isSetTv_path() && (compareTo10 = TBaseHelper.compareTo(this.tv_path, other.tv_path)) != 0) {
            return compareTo10;
        }
        int compareTo18 = Boolean.valueOf(isSetTv_snapshot_path()).compareTo(Boolean.valueOf(other.isSetTv_snapshot_path()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (isSetTv_snapshot_path() && (compareTo9 = TBaseHelper.compareTo(this.tv_snapshot_path, other.tv_snapshot_path)) != 0) {
            return compareTo9;
        }
        int compareTo19 = Boolean.valueOf(isSetWord()).compareTo(Boolean.valueOf(other.isSetWord()));
        if (compareTo19 != 0) {
            return compareTo19;
        }
        if (isSetWord() && (compareTo8 = TBaseHelper.compareTo(this.word, other.word)) != 0) {
            return compareTo8;
        }
        int compareTo20 = Boolean.valueOf(isSetWord_mean_cn()).compareTo(Boolean.valueOf(other.isSetWord_mean_cn()));
        if (compareTo20 != 0) {
            return compareTo20;
        }
        if (isSetWord_mean_cn() && (compareTo7 = TBaseHelper.compareTo(this.word_mean_cn, other.word_mean_cn)) != 0) {
            return compareTo7;
        }
        int compareTo21 = Boolean.valueOf(isSetWord_type()).compareTo(Boolean.valueOf(other.isSetWord_type()));
        if (compareTo21 != 0) {
            return compareTo21;
        }
        if (isSetWord_type() && (compareTo6 = TBaseHelper.compareTo(this.word_type, other.word_type)) != 0) {
            return compareTo6;
        }
        int compareTo22 = Boolean.valueOf(isSetWord_sentence()).compareTo(Boolean.valueOf(other.isSetWord_sentence()));
        if (compareTo22 != 0) {
            return compareTo22;
        }
        if (isSetWord_sentence() && (compareTo5 = TBaseHelper.compareTo(this.word_sentence, other.word_sentence)) != 0) {
            return compareTo5;
        }
        int compareTo23 = Boolean.valueOf(isSetFm_updated_at()).compareTo(Boolean.valueOf(other.isSetFm_updated_at()));
        if (compareTo23 != 0) {
            return compareTo23;
        }
        if (isSetFm_updated_at() && (compareTo4 = TBaseHelper.compareTo(this.fm_updated_at, other.fm_updated_at)) != 0) {
            return compareTo4;
        }
        int compareTo24 = Boolean.valueOf(isSetTv_updated_at()).compareTo(Boolean.valueOf(other.isSetTv_updated_at()));
        if (compareTo24 != 0) {
            return compareTo24;
        }
        if (isSetTv_updated_at() && (compareTo3 = TBaseHelper.compareTo(this.tv_updated_at, other.tv_updated_at)) != 0) {
            return compareTo3;
        }
        int compareTo25 = Boolean.valueOf(isSetPoster_updated_at()).compareTo(Boolean.valueOf(other.isSetPoster_updated_at()));
        if (compareTo25 != 0) {
            return compareTo25;
        }
        if (isSetPoster_updated_at() && (compareTo2 = TBaseHelper.compareTo(this.poster_updated_at, other.poster_updated_at)) != 0) {
            return compareTo2;
        }
        int compareTo26 = Boolean.valueOf(isSetPoster_zpk()).compareTo(Boolean.valueOf(other.isSetPoster_zpk()));
        if (compareTo26 != 0) {
            return compareTo26;
        }
        if (!isSetPoster_zpk() || (compareTo = TBaseHelper.compareTo(this.poster_zpk, other.poster_zpk)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<WordMedia, _Fields> deepCopy2() {
        return new WordMedia(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$WordMedia$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getTopic_id());
            case 2:
                return getM4a_audio_path();
            case 3:
                return getAmr_audio_path();
            case 4:
                return getTv_path();
            case 5:
                return getTv_snapshot_path();
            case 6:
                return getWord();
            case 7:
                return getWord_mean_cn();
            case 8:
                return getWord_type();
            case 9:
                return getWord_sentence();
            case 10:
                return Long.valueOf(getFm_updated_at());
            case 11:
                return Long.valueOf(getTv_updated_at());
            case 12:
                return Long.valueOf(getPoster_updated_at());
            case 13:
                return getPoster_zpk();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$WordMedia$_Fields[field.ordinal()]) {
            case 1:
                return isSetTopic_id();
            case 2:
                return isSetM4a_audio_path();
            case 3:
                return isSetAmr_audio_path();
            case 4:
                return isSetTv_path();
            case 5:
                return isSetTv_snapshot_path();
            case 6:
                return isSetWord();
            case 7:
                return isSetWord_mean_cn();
            case 8:
                return isSetWord_type();
            case 9:
                return isSetWord_sentence();
            case 10:
                return isSetFm_updated_at();
            case 11:
                return isSetTv_updated_at();
            case 12:
                return isSetPoster_updated_at();
            case 13:
                return isSetPoster_zpk();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$WordMedia$_Fields[field.ordinal()]) {
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
                    setM4a_audio_path((String) value);
                    break;
                } else {
                    unsetM4a_audio_path();
                    break;
                }
            case 3:
                if (value != null) {
                    setAmr_audio_path((String) value);
                    break;
                } else {
                    unsetAmr_audio_path();
                    break;
                }
            case 4:
                if (value != null) {
                    setTv_path((String) value);
                    break;
                } else {
                    unsetTv_path();
                    break;
                }
            case 5:
                if (value != null) {
                    setTv_snapshot_path((String) value);
                    break;
                } else {
                    unsetTv_snapshot_path();
                    break;
                }
            case 6:
                if (value != null) {
                    setWord((String) value);
                    break;
                } else {
                    unsetWord();
                    break;
                }
            case 7:
                if (value != null) {
                    setWord_mean_cn((String) value);
                    break;
                } else {
                    unsetWord_mean_cn();
                    break;
                }
            case 8:
                if (value != null) {
                    setWord_type((String) value);
                    break;
                } else {
                    unsetWord_type();
                    break;
                }
            case 9:
                if (value != null) {
                    setWord_sentence((String) value);
                    break;
                } else {
                    unsetWord_sentence();
                    break;
                }
            case 10:
                if (value != null) {
                    setFm_updated_at(((Long) value).longValue());
                    break;
                } else {
                    unsetFm_updated_at();
                    break;
                }
            case 11:
                if (value != null) {
                    setTv_updated_at(((Long) value).longValue());
                    break;
                } else {
                    unsetTv_updated_at();
                    break;
                }
            case 12:
                if (value != null) {
                    setPoster_updated_at(((Long) value).longValue());
                    break;
                } else {
                    unsetPoster_updated_at();
                    break;
                }
            case 13:
                if (value != null) {
                    setPoster_zpk((String) value);
                    break;
                } else {
                    unsetPoster_zpk();
                    break;
                }
        }
    }

    public boolean equals(WordMedia that) {
        if (that == null || this.topic_id != that.topic_id) {
            return false;
        }
        boolean isSetM4a_audio_path = isSetM4a_audio_path();
        boolean isSetM4a_audio_path2 = that.isSetM4a_audio_path();
        if ((isSetM4a_audio_path || isSetM4a_audio_path2) && !(isSetM4a_audio_path && isSetM4a_audio_path2 && this.m4a_audio_path.equals(that.m4a_audio_path))) {
            return false;
        }
        boolean isSetAmr_audio_path = isSetAmr_audio_path();
        boolean isSetAmr_audio_path2 = that.isSetAmr_audio_path();
        if ((isSetAmr_audio_path || isSetAmr_audio_path2) && !(isSetAmr_audio_path && isSetAmr_audio_path2 && this.amr_audio_path.equals(that.amr_audio_path))) {
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
        boolean isSetWord = isSetWord();
        boolean isSetWord2 = that.isSetWord();
        if ((isSetWord || isSetWord2) && !(isSetWord && isSetWord2 && this.word.equals(that.word))) {
            return false;
        }
        boolean isSetWord_mean_cn = isSetWord_mean_cn();
        boolean isSetWord_mean_cn2 = that.isSetWord_mean_cn();
        if ((isSetWord_mean_cn || isSetWord_mean_cn2) && !(isSetWord_mean_cn && isSetWord_mean_cn2 && this.word_mean_cn.equals(that.word_mean_cn))) {
            return false;
        }
        boolean isSetWord_type = isSetWord_type();
        boolean isSetWord_type2 = that.isSetWord_type();
        if ((isSetWord_type || isSetWord_type2) && !(isSetWord_type && isSetWord_type2 && this.word_type.equals(that.word_type))) {
            return false;
        }
        boolean isSetWord_sentence = isSetWord_sentence();
        boolean isSetWord_sentence2 = that.isSetWord_sentence();
        if ((isSetWord_sentence || isSetWord_sentence2) && !(isSetWord_sentence && isSetWord_sentence2 && this.word_sentence.equals(that.word_sentence))) {
            return false;
        }
        boolean isSetFm_updated_at = isSetFm_updated_at();
        boolean isSetFm_updated_at2 = that.isSetFm_updated_at();
        if ((isSetFm_updated_at || isSetFm_updated_at2) && !(isSetFm_updated_at && isSetFm_updated_at2 && this.fm_updated_at == that.fm_updated_at)) {
            return false;
        }
        boolean isSetTv_updated_at = isSetTv_updated_at();
        boolean isSetTv_updated_at2 = that.isSetTv_updated_at();
        if ((isSetTv_updated_at || isSetTv_updated_at2) && !(isSetTv_updated_at && isSetTv_updated_at2 && this.tv_updated_at == that.tv_updated_at)) {
            return false;
        }
        boolean isSetPoster_updated_at = isSetPoster_updated_at();
        boolean isSetPoster_updated_at2 = that.isSetPoster_updated_at();
        if ((isSetPoster_updated_at || isSetPoster_updated_at2) && !(isSetPoster_updated_at && isSetPoster_updated_at2 && this.poster_updated_at == that.poster_updated_at)) {
            return false;
        }
        boolean isSetPoster_zpk = isSetPoster_zpk();
        boolean isSetPoster_zpk2 = that.isSetPoster_zpk();
        if (isSetPoster_zpk || isSetPoster_zpk2) {
            return isSetPoster_zpk && isSetPoster_zpk2 && this.poster_zpk.equals(that.poster_zpk);
        }
        return true;
    }

    public WordMedia(int topic_id) {
        this();
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
    }

    public WordMedia(WordMedia other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.M4A_AUDIO_PATH, _Fields.AMR_AUDIO_PATH, _Fields.TV_PATH, _Fields.TV_SNAPSHOT_PATH, _Fields.WORD, _Fields.WORD_MEAN_CN, _Fields.WORD_TYPE, _Fields.WORD_SENTENCE, _Fields.FM_UPDATED_AT, _Fields.TV_UPDATED_AT, _Fields.POSTER_UPDATED_AT, _Fields.POSTER_ZPK};
        this.__isset_bitfield = other.__isset_bitfield;
        this.topic_id = other.topic_id;
        if (other.isSetM4a_audio_path()) {
            this.m4a_audio_path = other.m4a_audio_path;
        }
        if (other.isSetAmr_audio_path()) {
            this.amr_audio_path = other.amr_audio_path;
        }
        if (other.isSetTv_path()) {
            this.tv_path = other.tv_path;
        }
        if (other.isSetTv_snapshot_path()) {
            this.tv_snapshot_path = other.tv_snapshot_path;
        }
        if (other.isSetWord()) {
            this.word = other.word;
        }
        if (other.isSetWord_mean_cn()) {
            this.word_mean_cn = other.word_mean_cn;
        }
        if (other.isSetWord_type()) {
            this.word_type = other.word_type;
        }
        if (other.isSetWord_sentence()) {
            this.word_sentence = other.word_sentence;
        }
        this.fm_updated_at = other.fm_updated_at;
        this.tv_updated_at = other.tv_updated_at;
        this.poster_updated_at = other.poster_updated_at;
        if (other.isSetPoster_zpk()) {
            this.poster_zpk = other.poster_zpk;
        }
    }

    public void validate() throws TException {
    }
}
