package com.baicizhan.online.bs_words;

import com.baicizhan.client.business.dataset.provider.a;
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
public class BBTopicAssetV2 implements TBase<BBTopicAssetV2, _Fields>, Serializable, Cloneable, Comparable<BBTopicAssetV2> {
    private static final int __TOPIC_ID_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String accent;
    public String asset_pack_path;
    public String deformation_desc;
    public String deformation_img;
    public String image_file;
    public String mean_cn;
    public String mean_en;
    public String sentence;
    public String sentence_audio;
    public String sentence_trans;
    public String short_phrase;
    public int topic_id;
    public String update_flag;
    public String update_flag_md5;
    public String word;
    public String word_audio;
    public String word_etyma;
    public String word_variants;
    private static final TStruct STRUCT_DESC = new TStruct("BBTopicAssetV2");
    private static final TField TOPIC_ID_FIELD_DESC = new TField("topic_id", (byte) 8, 1);
    private static final TField WORD_FIELD_DESC = new TField("word", (byte) 11, 2);
    private static final TField WORD_VARIANTS_FIELD_DESC = new TField("word_variants", (byte) 11, 3);
    private static final TField WORD_AUDIO_FIELD_DESC = new TField("word_audio", (byte) 11, 4);
    private static final TField WORD_ETYMA_FIELD_DESC = new TField("word_etyma", (byte) 11, 5);
    private static final TField IMAGE_FILE_FIELD_DESC = new TField("image_file", (byte) 11, 6);
    private static final TField ACCENT_FIELD_DESC = new TField("accent", (byte) 11, 7);
    private static final TField MEAN_CN_FIELD_DESC = new TField(a.e.C0246a.f16184d, (byte) 11, 8);
    private static final TField MEAN_EN_FIELD_DESC = new TField("mean_en", (byte) 11, 9);
    private static final TField SHORT_PHRASE_FIELD_DESC = new TField("short_phrase", (byte) 11, 10);
    private static final TField DEFORMATION_IMG_FIELD_DESC = new TField("deformation_img", (byte) 11, 11);
    private static final TField DEFORMATION_DESC_FIELD_DESC = new TField("deformation_desc", (byte) 11, 12);
    private static final TField SENTENCE_FIELD_DESC = new TField("sentence", (byte) 11, 13);
    private static final TField SENTENCE_TRANS_FIELD_DESC = new TField("sentence_trans", (byte) 11, 14);
    private static final TField SENTENCE_AUDIO_FIELD_DESC = new TField("sentence_audio", (byte) 11, 15);
    private static final TField UPDATE_FLAG_FIELD_DESC = new TField("update_flag", (byte) 11, 16);
    private static final TField ASSET_PACK_PATH_FIELD_DESC = new TField("asset_pack_path", (byte) 11, 17);
    private static final TField UPDATE_FLAG_MD5_FIELD_DESC = new TField(a.i.C0250a.f16201c, (byte) 11, 18);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_words.BBTopicAssetV2$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_words$BBTopicAssetV2$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_words$BBTopicAssetV2$_Fields = iArr;
            try {
                iArr[_Fields.TOPIC_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBTopicAssetV2$_Fields[_Fields.WORD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBTopicAssetV2$_Fields[_Fields.WORD_VARIANTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBTopicAssetV2$_Fields[_Fields.WORD_AUDIO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBTopicAssetV2$_Fields[_Fields.WORD_ETYMA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBTopicAssetV2$_Fields[_Fields.IMAGE_FILE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBTopicAssetV2$_Fields[_Fields.ACCENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBTopicAssetV2$_Fields[_Fields.MEAN_CN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBTopicAssetV2$_Fields[_Fields.MEAN_EN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBTopicAssetV2$_Fields[_Fields.SHORT_PHRASE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBTopicAssetV2$_Fields[_Fields.DEFORMATION_IMG.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBTopicAssetV2$_Fields[_Fields.DEFORMATION_DESC.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBTopicAssetV2$_Fields[_Fields.SENTENCE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBTopicAssetV2$_Fields[_Fields.SENTENCE_TRANS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBTopicAssetV2$_Fields[_Fields.SENTENCE_AUDIO.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBTopicAssetV2$_Fields[_Fields.UPDATE_FLAG.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBTopicAssetV2$_Fields[_Fields.ASSET_PACK_PATH.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBTopicAssetV2$_Fields[_Fields.UPDATE_FLAG_MD5.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBTopicAssetV2StandardScheme extends StandardScheme<BBTopicAssetV2> {
        private BBTopicAssetV2StandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BBTopicAssetV2 struct) throws TException {
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
                            struct.word = iprot.readString();
                            struct.setWordIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.word_variants = iprot.readString();
                            struct.setWord_variantsIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.word_audio = iprot.readString();
                            struct.setWord_audioIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.word_etyma = iprot.readString();
                            struct.setWord_etymaIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.image_file = iprot.readString();
                            struct.setImage_fileIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.accent = iprot.readString();
                            struct.setAccentIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.mean_cn = iprot.readString();
                            struct.setMean_cnIsSet(true);
                            break;
                        }
                    case 9:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.mean_en = iprot.readString();
                            struct.setMean_enIsSet(true);
                            break;
                        }
                    case 10:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.short_phrase = iprot.readString();
                            struct.setShort_phraseIsSet(true);
                            break;
                        }
                    case 11:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.deformation_img = iprot.readString();
                            struct.setDeformation_imgIsSet(true);
                            break;
                        }
                    case 12:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.deformation_desc = iprot.readString();
                            struct.setDeformation_descIsSet(true);
                            break;
                        }
                    case 13:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.sentence = iprot.readString();
                            struct.setSentenceIsSet(true);
                            break;
                        }
                    case 14:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.sentence_trans = iprot.readString();
                            struct.setSentence_transIsSet(true);
                            break;
                        }
                    case 15:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.sentence_audio = iprot.readString();
                            struct.setSentence_audioIsSet(true);
                            break;
                        }
                    case 16:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.update_flag = iprot.readString();
                            struct.setUpdate_flagIsSet(true);
                            break;
                        }
                    case 17:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.asset_pack_path = iprot.readString();
                            struct.setAsset_pack_pathIsSet(true);
                            break;
                        }
                    case 18:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.update_flag_md5 = iprot.readString();
                            struct.setUpdate_flag_md5IsSet(true);
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
        public void write(TProtocol oprot, BBTopicAssetV2 struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BBTopicAssetV2.STRUCT_DESC);
            oprot.writeFieldBegin(BBTopicAssetV2.TOPIC_ID_FIELD_DESC);
            oprot.writeI32(struct.topic_id);
            oprot.writeFieldEnd();
            if (struct.word != null) {
                oprot.writeFieldBegin(BBTopicAssetV2.WORD_FIELD_DESC);
                oprot.writeString(struct.word);
                oprot.writeFieldEnd();
            }
            if (struct.word_variants != null) {
                oprot.writeFieldBegin(BBTopicAssetV2.WORD_VARIANTS_FIELD_DESC);
                oprot.writeString(struct.word_variants);
                oprot.writeFieldEnd();
            }
            if (struct.word_audio != null) {
                oprot.writeFieldBegin(BBTopicAssetV2.WORD_AUDIO_FIELD_DESC);
                oprot.writeString(struct.word_audio);
                oprot.writeFieldEnd();
            }
            if (struct.word_etyma != null) {
                oprot.writeFieldBegin(BBTopicAssetV2.WORD_ETYMA_FIELD_DESC);
                oprot.writeString(struct.word_etyma);
                oprot.writeFieldEnd();
            }
            if (struct.image_file != null) {
                oprot.writeFieldBegin(BBTopicAssetV2.IMAGE_FILE_FIELD_DESC);
                oprot.writeString(struct.image_file);
                oprot.writeFieldEnd();
            }
            if (struct.accent != null) {
                oprot.writeFieldBegin(BBTopicAssetV2.ACCENT_FIELD_DESC);
                oprot.writeString(struct.accent);
                oprot.writeFieldEnd();
            }
            if (struct.mean_cn != null) {
                oprot.writeFieldBegin(BBTopicAssetV2.MEAN_CN_FIELD_DESC);
                oprot.writeString(struct.mean_cn);
                oprot.writeFieldEnd();
            }
            if (struct.mean_en != null) {
                oprot.writeFieldBegin(BBTopicAssetV2.MEAN_EN_FIELD_DESC);
                oprot.writeString(struct.mean_en);
                oprot.writeFieldEnd();
            }
            if (struct.short_phrase != null) {
                oprot.writeFieldBegin(BBTopicAssetV2.SHORT_PHRASE_FIELD_DESC);
                oprot.writeString(struct.short_phrase);
                oprot.writeFieldEnd();
            }
            if (struct.deformation_img != null) {
                oprot.writeFieldBegin(BBTopicAssetV2.DEFORMATION_IMG_FIELD_DESC);
                oprot.writeString(struct.deformation_img);
                oprot.writeFieldEnd();
            }
            if (struct.deformation_desc != null) {
                oprot.writeFieldBegin(BBTopicAssetV2.DEFORMATION_DESC_FIELD_DESC);
                oprot.writeString(struct.deformation_desc);
                oprot.writeFieldEnd();
            }
            if (struct.sentence != null) {
                oprot.writeFieldBegin(BBTopicAssetV2.SENTENCE_FIELD_DESC);
                oprot.writeString(struct.sentence);
                oprot.writeFieldEnd();
            }
            if (struct.sentence_trans != null) {
                oprot.writeFieldBegin(BBTopicAssetV2.SENTENCE_TRANS_FIELD_DESC);
                oprot.writeString(struct.sentence_trans);
                oprot.writeFieldEnd();
            }
            if (struct.sentence_audio != null) {
                oprot.writeFieldBegin(BBTopicAssetV2.SENTENCE_AUDIO_FIELD_DESC);
                oprot.writeString(struct.sentence_audio);
                oprot.writeFieldEnd();
            }
            if (struct.update_flag != null) {
                oprot.writeFieldBegin(BBTopicAssetV2.UPDATE_FLAG_FIELD_DESC);
                oprot.writeString(struct.update_flag);
                oprot.writeFieldEnd();
            }
            if (struct.asset_pack_path != null) {
                oprot.writeFieldBegin(BBTopicAssetV2.ASSET_PACK_PATH_FIELD_DESC);
                oprot.writeString(struct.asset_pack_path);
                oprot.writeFieldEnd();
            }
            if (struct.update_flag_md5 != null) {
                oprot.writeFieldBegin(BBTopicAssetV2.UPDATE_FLAG_MD5_FIELD_DESC);
                oprot.writeString(struct.update_flag_md5);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBTopicAssetV2StandardSchemeFactory implements SchemeFactory {
        private BBTopicAssetV2StandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBTopicAssetV2StandardScheme getScheme() {
            return new BBTopicAssetV2StandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBTopicAssetV2TupleScheme extends TupleScheme<BBTopicAssetV2> {
        private BBTopicAssetV2TupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BBTopicAssetV2 struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.topic_id = tTupleProtocol.readI32();
            struct.setTopic_idIsSet(true);
            struct.word = tTupleProtocol.readString();
            struct.setWordIsSet(true);
            struct.word_variants = tTupleProtocol.readString();
            struct.setWord_variantsIsSet(true);
            struct.word_audio = tTupleProtocol.readString();
            struct.setWord_audioIsSet(true);
            struct.word_etyma = tTupleProtocol.readString();
            struct.setWord_etymaIsSet(true);
            struct.image_file = tTupleProtocol.readString();
            struct.setImage_fileIsSet(true);
            struct.accent = tTupleProtocol.readString();
            struct.setAccentIsSet(true);
            struct.mean_cn = tTupleProtocol.readString();
            struct.setMean_cnIsSet(true);
            struct.mean_en = tTupleProtocol.readString();
            struct.setMean_enIsSet(true);
            struct.short_phrase = tTupleProtocol.readString();
            struct.setShort_phraseIsSet(true);
            struct.deformation_img = tTupleProtocol.readString();
            struct.setDeformation_imgIsSet(true);
            struct.deformation_desc = tTupleProtocol.readString();
            struct.setDeformation_descIsSet(true);
            struct.sentence = tTupleProtocol.readString();
            struct.setSentenceIsSet(true);
            struct.sentence_trans = tTupleProtocol.readString();
            struct.setSentence_transIsSet(true);
            struct.sentence_audio = tTupleProtocol.readString();
            struct.setSentence_audioIsSet(true);
            struct.update_flag = tTupleProtocol.readString();
            struct.setUpdate_flagIsSet(true);
            struct.asset_pack_path = tTupleProtocol.readString();
            struct.setAsset_pack_pathIsSet(true);
            struct.update_flag_md5 = tTupleProtocol.readString();
            struct.setUpdate_flag_md5IsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BBTopicAssetV2 struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.topic_id);
            tTupleProtocol.writeString(struct.word);
            tTupleProtocol.writeString(struct.word_variants);
            tTupleProtocol.writeString(struct.word_audio);
            tTupleProtocol.writeString(struct.word_etyma);
            tTupleProtocol.writeString(struct.image_file);
            tTupleProtocol.writeString(struct.accent);
            tTupleProtocol.writeString(struct.mean_cn);
            tTupleProtocol.writeString(struct.mean_en);
            tTupleProtocol.writeString(struct.short_phrase);
            tTupleProtocol.writeString(struct.deformation_img);
            tTupleProtocol.writeString(struct.deformation_desc);
            tTupleProtocol.writeString(struct.sentence);
            tTupleProtocol.writeString(struct.sentence_trans);
            tTupleProtocol.writeString(struct.sentence_audio);
            tTupleProtocol.writeString(struct.update_flag);
            tTupleProtocol.writeString(struct.asset_pack_path);
            tTupleProtocol.writeString(struct.update_flag_md5);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBTopicAssetV2TupleSchemeFactory implements SchemeFactory {
        private BBTopicAssetV2TupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBTopicAssetV2TupleScheme getScheme() {
            return new BBTopicAssetV2TupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TOPIC_ID(1, "topic_id"),
        WORD(2, "word"),
        WORD_VARIANTS(3, "word_variants"),
        WORD_AUDIO(4, "word_audio"),
        WORD_ETYMA(5, "word_etyma"),
        IMAGE_FILE(6, "image_file"),
        ACCENT(7, "accent"),
        MEAN_CN(8, a.e.C0246a.f16184d),
        MEAN_EN(9, "mean_en"),
        SHORT_PHRASE(10, "short_phrase"),
        DEFORMATION_IMG(11, "deformation_img"),
        DEFORMATION_DESC(12, "deformation_desc"),
        SENTENCE(13, "sentence"),
        SENTENCE_TRANS(14, "sentence_trans"),
        SENTENCE_AUDIO(15, "sentence_audio"),
        UPDATE_FLAG(16, "update_flag"),
        ASSET_PACK_PATH(17, "asset_pack_path"),
        UPDATE_FLAG_MD5(18, a.i.C0250a.f16201c);

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
                    return WORD_VARIANTS;
                case 4:
                    return WORD_AUDIO;
                case 5:
                    return WORD_ETYMA;
                case 6:
                    return IMAGE_FILE;
                case 7:
                    return ACCENT;
                case 8:
                    return MEAN_CN;
                case 9:
                    return MEAN_EN;
                case 10:
                    return SHORT_PHRASE;
                case 11:
                    return DEFORMATION_IMG;
                case 12:
                    return DEFORMATION_DESC;
                case 13:
                    return SENTENCE;
                case 14:
                    return SENTENCE_TRANS;
                case 15:
                    return SENTENCE_AUDIO;
                case 16:
                    return UPDATE_FLAG;
                case 17:
                    return ASSET_PACK_PATH;
                case 18:
                    return UPDATE_FLAG_MD5;
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
        hashMap.put(StandardScheme.class, new BBTopicAssetV2StandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BBTopicAssetV2TupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TOPIC_ID, (_Fields) new FieldMetaData("topic_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.WORD, (_Fields) new FieldMetaData("word", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.WORD_VARIANTS, (_Fields) new FieldMetaData("word_variants", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.WORD_AUDIO, (_Fields) new FieldMetaData("word_audio", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.WORD_ETYMA, (_Fields) new FieldMetaData("word_etyma", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.IMAGE_FILE, (_Fields) new FieldMetaData("image_file", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ACCENT, (_Fields) new FieldMetaData("accent", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.MEAN_CN, (_Fields) new FieldMetaData(a.e.C0246a.f16184d, (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.MEAN_EN, (_Fields) new FieldMetaData("mean_en", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SHORT_PHRASE, (_Fields) new FieldMetaData("short_phrase", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.DEFORMATION_IMG, (_Fields) new FieldMetaData("deformation_img", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.DEFORMATION_DESC, (_Fields) new FieldMetaData("deformation_desc", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SENTENCE, (_Fields) new FieldMetaData("sentence", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SENTENCE_TRANS, (_Fields) new FieldMetaData("sentence_trans", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SENTENCE_AUDIO, (_Fields) new FieldMetaData("sentence_audio", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.UPDATE_FLAG, (_Fields) new FieldMetaData("update_flag", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ASSET_PACK_PATH, (_Fields) new FieldMetaData("asset_pack_path", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.UPDATE_FLAG_MD5, (_Fields) new FieldMetaData(a.i.C0250a.f16201c, (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BBTopicAssetV2.class, unmodifiableMap);
    }

    public BBTopicAssetV2() {
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
        this.word_variants = null;
        this.word_audio = null;
        this.word_etyma = null;
        this.image_file = null;
        this.accent = null;
        this.mean_cn = null;
        this.mean_en = null;
        this.short_phrase = null;
        this.deformation_img = null;
        this.deformation_desc = null;
        this.sentence = null;
        this.sentence_trans = null;
        this.sentence_audio = null;
        this.update_flag = null;
        this.asset_pack_path = null;
        this.update_flag_md5 = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BBTopicAssetV2)) {
            return equals((BBTopicAssetV2) that);
        }
        return false;
    }

    public String getAccent() {
        return this.accent;
    }

    public String getAsset_pack_path() {
        return this.asset_pack_path;
    }

    public String getDeformation_desc() {
        return this.deformation_desc;
    }

    public String getDeformation_img() {
        return this.deformation_img;
    }

    public String getImage_file() {
        return this.image_file;
    }

    public String getMean_cn() {
        return this.mean_cn;
    }

    public String getMean_en() {
        return this.mean_en;
    }

    public String getSentence() {
        return this.sentence;
    }

    public String getSentence_audio() {
        return this.sentence_audio;
    }

    public String getSentence_trans() {
        return this.sentence_trans;
    }

    public String getShort_phrase() {
        return this.short_phrase;
    }

    public int getTopic_id() {
        return this.topic_id;
    }

    public String getUpdate_flag() {
        return this.update_flag;
    }

    public String getUpdate_flag_md5() {
        return this.update_flag_md5;
    }

    public String getWord() {
        return this.word;
    }

    public String getWord_audio() {
        return this.word_audio;
    }

    public String getWord_etyma() {
        return this.word_etyma;
    }

    public String getWord_variants() {
        return this.word_variants;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAccent() {
        return this.accent != null;
    }

    public boolean isSetAsset_pack_path() {
        return this.asset_pack_path != null;
    }

    public boolean isSetDeformation_desc() {
        return this.deformation_desc != null;
    }

    public boolean isSetDeformation_img() {
        return this.deformation_img != null;
    }

    public boolean isSetImage_file() {
        return this.image_file != null;
    }

    public boolean isSetMean_cn() {
        return this.mean_cn != null;
    }

    public boolean isSetMean_en() {
        return this.mean_en != null;
    }

    public boolean isSetSentence() {
        return this.sentence != null;
    }

    public boolean isSetSentence_audio() {
        return this.sentence_audio != null;
    }

    public boolean isSetSentence_trans() {
        return this.sentence_trans != null;
    }

    public boolean isSetShort_phrase() {
        return this.short_phrase != null;
    }

    public boolean isSetTopic_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetUpdate_flag() {
        return this.update_flag != null;
    }

    public boolean isSetUpdate_flag_md5() {
        return this.update_flag_md5 != null;
    }

    public boolean isSetWord() {
        return this.word != null;
    }

    public boolean isSetWord_audio() {
        return this.word_audio != null;
    }

    public boolean isSetWord_etyma() {
        return this.word_etyma != null;
    }

    public boolean isSetWord_variants() {
        return this.word_variants != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BBTopicAssetV2 setAccent(String accent) {
        this.accent = accent;
        return this;
    }

    public void setAccentIsSet(boolean value) {
        if (value) {
            return;
        }
        this.accent = null;
    }

    public BBTopicAssetV2 setAsset_pack_path(String asset_pack_path) {
        this.asset_pack_path = asset_pack_path;
        return this;
    }

    public void setAsset_pack_pathIsSet(boolean value) {
        if (value) {
            return;
        }
        this.asset_pack_path = null;
    }

    public BBTopicAssetV2 setDeformation_desc(String deformation_desc) {
        this.deformation_desc = deformation_desc;
        return this;
    }

    public void setDeformation_descIsSet(boolean value) {
        if (value) {
            return;
        }
        this.deformation_desc = null;
    }

    public BBTopicAssetV2 setDeformation_img(String deformation_img) {
        this.deformation_img = deformation_img;
        return this;
    }

    public void setDeformation_imgIsSet(boolean value) {
        if (value) {
            return;
        }
        this.deformation_img = null;
    }

    public BBTopicAssetV2 setImage_file(String image_file) {
        this.image_file = image_file;
        return this;
    }

    public void setImage_fileIsSet(boolean value) {
        if (value) {
            return;
        }
        this.image_file = null;
    }

    public BBTopicAssetV2 setMean_cn(String mean_cn) {
        this.mean_cn = mean_cn;
        return this;
    }

    public void setMean_cnIsSet(boolean value) {
        if (value) {
            return;
        }
        this.mean_cn = null;
    }

    public BBTopicAssetV2 setMean_en(String mean_en) {
        this.mean_en = mean_en;
        return this;
    }

    public void setMean_enIsSet(boolean value) {
        if (value) {
            return;
        }
        this.mean_en = null;
    }

    public BBTopicAssetV2 setSentence(String sentence) {
        this.sentence = sentence;
        return this;
    }

    public void setSentenceIsSet(boolean value) {
        if (value) {
            return;
        }
        this.sentence = null;
    }

    public BBTopicAssetV2 setSentence_audio(String sentence_audio) {
        this.sentence_audio = sentence_audio;
        return this;
    }

    public void setSentence_audioIsSet(boolean value) {
        if (value) {
            return;
        }
        this.sentence_audio = null;
    }

    public BBTopicAssetV2 setSentence_trans(String sentence_trans) {
        this.sentence_trans = sentence_trans;
        return this;
    }

    public void setSentence_transIsSet(boolean value) {
        if (value) {
            return;
        }
        this.sentence_trans = null;
    }

    public BBTopicAssetV2 setShort_phrase(String short_phrase) {
        this.short_phrase = short_phrase;
        return this;
    }

    public void setShort_phraseIsSet(boolean value) {
        if (value) {
            return;
        }
        this.short_phrase = null;
    }

    public BBTopicAssetV2 setTopic_id(int topic_id) {
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        return this;
    }

    public void setTopic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public BBTopicAssetV2 setUpdate_flag(String update_flag) {
        this.update_flag = update_flag;
        return this;
    }

    public void setUpdate_flagIsSet(boolean value) {
        if (value) {
            return;
        }
        this.update_flag = null;
    }

    public BBTopicAssetV2 setUpdate_flag_md5(String update_flag_md5) {
        this.update_flag_md5 = update_flag_md5;
        return this;
    }

    public void setUpdate_flag_md5IsSet(boolean value) {
        if (value) {
            return;
        }
        this.update_flag_md5 = null;
    }

    public BBTopicAssetV2 setWord(String word) {
        this.word = word;
        return this;
    }

    public void setWordIsSet(boolean value) {
        if (value) {
            return;
        }
        this.word = null;
    }

    public BBTopicAssetV2 setWord_audio(String word_audio) {
        this.word_audio = word_audio;
        return this;
    }

    public void setWord_audioIsSet(boolean value) {
        if (value) {
            return;
        }
        this.word_audio = null;
    }

    public BBTopicAssetV2 setWord_etyma(String word_etyma) {
        this.word_etyma = word_etyma;
        return this;
    }

    public void setWord_etymaIsSet(boolean value) {
        if (value) {
            return;
        }
        this.word_etyma = null;
    }

    public BBTopicAssetV2 setWord_variants(String word_variants) {
        this.word_variants = word_variants;
        return this;
    }

    public void setWord_variantsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.word_variants = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BBTopicAssetV2(");
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
        sb2.append("word_variants:");
        String str2 = this.word_variants;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("word_audio:");
        String str3 = this.word_audio;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(j2.O);
        sb2.append("word_etyma:");
        String str4 = this.word_etyma;
        if (str4 == null) {
            sb2.append("null");
        } else {
            sb2.append(str4);
        }
        sb2.append(j2.O);
        sb2.append("image_file:");
        String str5 = this.image_file;
        if (str5 == null) {
            sb2.append("null");
        } else {
            sb2.append(str5);
        }
        sb2.append(j2.O);
        sb2.append("accent:");
        String str6 = this.accent;
        if (str6 == null) {
            sb2.append("null");
        } else {
            sb2.append(str6);
        }
        sb2.append(j2.O);
        sb2.append("mean_cn:");
        String str7 = this.mean_cn;
        if (str7 == null) {
            sb2.append("null");
        } else {
            sb2.append(str7);
        }
        sb2.append(j2.O);
        sb2.append("mean_en:");
        String str8 = this.mean_en;
        if (str8 == null) {
            sb2.append("null");
        } else {
            sb2.append(str8);
        }
        sb2.append(j2.O);
        sb2.append("short_phrase:");
        String str9 = this.short_phrase;
        if (str9 == null) {
            sb2.append("null");
        } else {
            sb2.append(str9);
        }
        sb2.append(j2.O);
        sb2.append("deformation_img:");
        String str10 = this.deformation_img;
        if (str10 == null) {
            sb2.append("null");
        } else {
            sb2.append(str10);
        }
        sb2.append(j2.O);
        sb2.append("deformation_desc:");
        String str11 = this.deformation_desc;
        if (str11 == null) {
            sb2.append("null");
        } else {
            sb2.append(str11);
        }
        sb2.append(j2.O);
        sb2.append("sentence:");
        String str12 = this.sentence;
        if (str12 == null) {
            sb2.append("null");
        } else {
            sb2.append(str12);
        }
        sb2.append(j2.O);
        sb2.append("sentence_trans:");
        String str13 = this.sentence_trans;
        if (str13 == null) {
            sb2.append("null");
        } else {
            sb2.append(str13);
        }
        sb2.append(j2.O);
        sb2.append("sentence_audio:");
        String str14 = this.sentence_audio;
        if (str14 == null) {
            sb2.append("null");
        } else {
            sb2.append(str14);
        }
        sb2.append(j2.O);
        sb2.append("update_flag:");
        String str15 = this.update_flag;
        if (str15 == null) {
            sb2.append("null");
        } else {
            sb2.append(str15);
        }
        sb2.append(j2.O);
        sb2.append("asset_pack_path:");
        String str16 = this.asset_pack_path;
        if (str16 == null) {
            sb2.append("null");
        } else {
            sb2.append(str16);
        }
        sb2.append(j2.O);
        sb2.append("update_flag_md5:");
        String str17 = this.update_flag_md5;
        if (str17 == null) {
            sb2.append("null");
        } else {
            sb2.append(str17);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAccent() {
        this.accent = null;
    }

    public void unsetAsset_pack_path() {
        this.asset_pack_path = null;
    }

    public void unsetDeformation_desc() {
        this.deformation_desc = null;
    }

    public void unsetDeformation_img() {
        this.deformation_img = null;
    }

    public void unsetImage_file() {
        this.image_file = null;
    }

    public void unsetMean_cn() {
        this.mean_cn = null;
    }

    public void unsetMean_en() {
        this.mean_en = null;
    }

    public void unsetSentence() {
        this.sentence = null;
    }

    public void unsetSentence_audio() {
        this.sentence_audio = null;
    }

    public void unsetSentence_trans() {
        this.sentence_trans = null;
    }

    public void unsetShort_phrase() {
        this.short_phrase = null;
    }

    public void unsetTopic_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetUpdate_flag() {
        this.update_flag = null;
    }

    public void unsetUpdate_flag_md5() {
        this.update_flag_md5 = null;
    }

    public void unsetWord() {
        this.word = null;
    }

    public void unsetWord_audio() {
        this.word_audio = null;
    }

    public void unsetWord_etyma() {
        this.word_etyma = null;
    }

    public void unsetWord_variants() {
        this.word_variants = null;
    }

    public void validate() throws TException {
        if (this.word == null) {
            throw new TProtocolException("Required field 'word' was not present! Struct: " + toString());
        }
        if (this.word_variants == null) {
            throw new TProtocolException("Required field 'word_variants' was not present! Struct: " + toString());
        }
        if (this.word_audio == null) {
            throw new TProtocolException("Required field 'word_audio' was not present! Struct: " + toString());
        }
        if (this.word_etyma == null) {
            throw new TProtocolException("Required field 'word_etyma' was not present! Struct: " + toString());
        }
        if (this.image_file == null) {
            throw new TProtocolException("Required field 'image_file' was not present! Struct: " + toString());
        }
        if (this.accent == null) {
            throw new TProtocolException("Required field 'accent' was not present! Struct: " + toString());
        }
        if (this.mean_cn == null) {
            throw new TProtocolException("Required field 'mean_cn' was not present! Struct: " + toString());
        }
        if (this.mean_en == null) {
            throw new TProtocolException("Required field 'mean_en' was not present! Struct: " + toString());
        }
        if (this.short_phrase == null) {
            throw new TProtocolException("Required field 'short_phrase' was not present! Struct: " + toString());
        }
        if (this.deformation_img == null) {
            throw new TProtocolException("Required field 'deformation_img' was not present! Struct: " + toString());
        }
        if (this.deformation_desc == null) {
            throw new TProtocolException("Required field 'deformation_desc' was not present! Struct: " + toString());
        }
        if (this.sentence == null) {
            throw new TProtocolException("Required field 'sentence' was not present! Struct: " + toString());
        }
        if (this.sentence_trans == null) {
            throw new TProtocolException("Required field 'sentence_trans' was not present! Struct: " + toString());
        }
        if (this.sentence_audio == null) {
            throw new TProtocolException("Required field 'sentence_audio' was not present! Struct: " + toString());
        }
        if (this.update_flag == null) {
            throw new TProtocolException("Required field 'update_flag' was not present! Struct: " + toString());
        }
        if (this.asset_pack_path == null) {
            throw new TProtocolException("Required field 'asset_pack_path' was not present! Struct: " + toString());
        }
        if (this.update_flag_md5 != null) {
            return;
        }
        throw new TProtocolException("Required field 'update_flag_md5' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BBTopicAssetV2 other) {
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
        int compareTo14;
        int compareTo15;
        int compareTo16;
        int compareTo17;
        int compareTo18;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo19 = Boolean.valueOf(isSetTopic_id()).compareTo(Boolean.valueOf(other.isSetTopic_id()));
        if (compareTo19 != 0) {
            return compareTo19;
        }
        if (isSetTopic_id() && (compareTo18 = TBaseHelper.compareTo(this.topic_id, other.topic_id)) != 0) {
            return compareTo18;
        }
        int compareTo20 = Boolean.valueOf(isSetWord()).compareTo(Boolean.valueOf(other.isSetWord()));
        if (compareTo20 != 0) {
            return compareTo20;
        }
        if (isSetWord() && (compareTo17 = TBaseHelper.compareTo(this.word, other.word)) != 0) {
            return compareTo17;
        }
        int compareTo21 = Boolean.valueOf(isSetWord_variants()).compareTo(Boolean.valueOf(other.isSetWord_variants()));
        if (compareTo21 != 0) {
            return compareTo21;
        }
        if (isSetWord_variants() && (compareTo16 = TBaseHelper.compareTo(this.word_variants, other.word_variants)) != 0) {
            return compareTo16;
        }
        int compareTo22 = Boolean.valueOf(isSetWord_audio()).compareTo(Boolean.valueOf(other.isSetWord_audio()));
        if (compareTo22 != 0) {
            return compareTo22;
        }
        if (isSetWord_audio() && (compareTo15 = TBaseHelper.compareTo(this.word_audio, other.word_audio)) != 0) {
            return compareTo15;
        }
        int compareTo23 = Boolean.valueOf(isSetWord_etyma()).compareTo(Boolean.valueOf(other.isSetWord_etyma()));
        if (compareTo23 != 0) {
            return compareTo23;
        }
        if (isSetWord_etyma() && (compareTo14 = TBaseHelper.compareTo(this.word_etyma, other.word_etyma)) != 0) {
            return compareTo14;
        }
        int compareTo24 = Boolean.valueOf(isSetImage_file()).compareTo(Boolean.valueOf(other.isSetImage_file()));
        if (compareTo24 != 0) {
            return compareTo24;
        }
        if (isSetImage_file() && (compareTo13 = TBaseHelper.compareTo(this.image_file, other.image_file)) != 0) {
            return compareTo13;
        }
        int compareTo25 = Boolean.valueOf(isSetAccent()).compareTo(Boolean.valueOf(other.isSetAccent()));
        if (compareTo25 != 0) {
            return compareTo25;
        }
        if (isSetAccent() && (compareTo12 = TBaseHelper.compareTo(this.accent, other.accent)) != 0) {
            return compareTo12;
        }
        int compareTo26 = Boolean.valueOf(isSetMean_cn()).compareTo(Boolean.valueOf(other.isSetMean_cn()));
        if (compareTo26 != 0) {
            return compareTo26;
        }
        if (isSetMean_cn() && (compareTo11 = TBaseHelper.compareTo(this.mean_cn, other.mean_cn)) != 0) {
            return compareTo11;
        }
        int compareTo27 = Boolean.valueOf(isSetMean_en()).compareTo(Boolean.valueOf(other.isSetMean_en()));
        if (compareTo27 != 0) {
            return compareTo27;
        }
        if (isSetMean_en() && (compareTo10 = TBaseHelper.compareTo(this.mean_en, other.mean_en)) != 0) {
            return compareTo10;
        }
        int compareTo28 = Boolean.valueOf(isSetShort_phrase()).compareTo(Boolean.valueOf(other.isSetShort_phrase()));
        if (compareTo28 != 0) {
            return compareTo28;
        }
        if (isSetShort_phrase() && (compareTo9 = TBaseHelper.compareTo(this.short_phrase, other.short_phrase)) != 0) {
            return compareTo9;
        }
        int compareTo29 = Boolean.valueOf(isSetDeformation_img()).compareTo(Boolean.valueOf(other.isSetDeformation_img()));
        if (compareTo29 != 0) {
            return compareTo29;
        }
        if (isSetDeformation_img() && (compareTo8 = TBaseHelper.compareTo(this.deformation_img, other.deformation_img)) != 0) {
            return compareTo8;
        }
        int compareTo30 = Boolean.valueOf(isSetDeformation_desc()).compareTo(Boolean.valueOf(other.isSetDeformation_desc()));
        if (compareTo30 != 0) {
            return compareTo30;
        }
        if (isSetDeformation_desc() && (compareTo7 = TBaseHelper.compareTo(this.deformation_desc, other.deformation_desc)) != 0) {
            return compareTo7;
        }
        int compareTo31 = Boolean.valueOf(isSetSentence()).compareTo(Boolean.valueOf(other.isSetSentence()));
        if (compareTo31 != 0) {
            return compareTo31;
        }
        if (isSetSentence() && (compareTo6 = TBaseHelper.compareTo(this.sentence, other.sentence)) != 0) {
            return compareTo6;
        }
        int compareTo32 = Boolean.valueOf(isSetSentence_trans()).compareTo(Boolean.valueOf(other.isSetSentence_trans()));
        if (compareTo32 != 0) {
            return compareTo32;
        }
        if (isSetSentence_trans() && (compareTo5 = TBaseHelper.compareTo(this.sentence_trans, other.sentence_trans)) != 0) {
            return compareTo5;
        }
        int compareTo33 = Boolean.valueOf(isSetSentence_audio()).compareTo(Boolean.valueOf(other.isSetSentence_audio()));
        if (compareTo33 != 0) {
            return compareTo33;
        }
        if (isSetSentence_audio() && (compareTo4 = TBaseHelper.compareTo(this.sentence_audio, other.sentence_audio)) != 0) {
            return compareTo4;
        }
        int compareTo34 = Boolean.valueOf(isSetUpdate_flag()).compareTo(Boolean.valueOf(other.isSetUpdate_flag()));
        if (compareTo34 != 0) {
            return compareTo34;
        }
        if (isSetUpdate_flag() && (compareTo3 = TBaseHelper.compareTo(this.update_flag, other.update_flag)) != 0) {
            return compareTo3;
        }
        int compareTo35 = Boolean.valueOf(isSetAsset_pack_path()).compareTo(Boolean.valueOf(other.isSetAsset_pack_path()));
        if (compareTo35 != 0) {
            return compareTo35;
        }
        if (isSetAsset_pack_path() && (compareTo2 = TBaseHelper.compareTo(this.asset_pack_path, other.asset_pack_path)) != 0) {
            return compareTo2;
        }
        int compareTo36 = Boolean.valueOf(isSetUpdate_flag_md5()).compareTo(Boolean.valueOf(other.isSetUpdate_flag_md5()));
        if (compareTo36 != 0) {
            return compareTo36;
        }
        if (!isSetUpdate_flag_md5() || (compareTo = TBaseHelper.compareTo(this.update_flag_md5, other.update_flag_md5)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BBTopicAssetV2, _Fields> deepCopy2() {
        return new BBTopicAssetV2(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBTopicAssetV2$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getTopic_id());
            case 2:
                return getWord();
            case 3:
                return getWord_variants();
            case 4:
                return getWord_audio();
            case 5:
                return getWord_etyma();
            case 6:
                return getImage_file();
            case 7:
                return getAccent();
            case 8:
                return getMean_cn();
            case 9:
                return getMean_en();
            case 10:
                return getShort_phrase();
            case 11:
                return getDeformation_img();
            case 12:
                return getDeformation_desc();
            case 13:
                return getSentence();
            case 14:
                return getSentence_trans();
            case 15:
                return getSentence_audio();
            case 16:
                return getUpdate_flag();
            case 17:
                return getAsset_pack_path();
            case 18:
                return getUpdate_flag_md5();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBTopicAssetV2$_Fields[field.ordinal()]) {
            case 1:
                return isSetTopic_id();
            case 2:
                return isSetWord();
            case 3:
                return isSetWord_variants();
            case 4:
                return isSetWord_audio();
            case 5:
                return isSetWord_etyma();
            case 6:
                return isSetImage_file();
            case 7:
                return isSetAccent();
            case 8:
                return isSetMean_cn();
            case 9:
                return isSetMean_en();
            case 10:
                return isSetShort_phrase();
            case 11:
                return isSetDeformation_img();
            case 12:
                return isSetDeformation_desc();
            case 13:
                return isSetSentence();
            case 14:
                return isSetSentence_trans();
            case 15:
                return isSetSentence_audio();
            case 16:
                return isSetUpdate_flag();
            case 17:
                return isSetAsset_pack_path();
            case 18:
                return isSetUpdate_flag_md5();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBTopicAssetV2$_Fields[field.ordinal()]) {
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
                    setWord_variants((String) value);
                    break;
                } else {
                    unsetWord_variants();
                    break;
                }
            case 4:
                if (value != null) {
                    setWord_audio((String) value);
                    break;
                } else {
                    unsetWord_audio();
                    break;
                }
            case 5:
                if (value != null) {
                    setWord_etyma((String) value);
                    break;
                } else {
                    unsetWord_etyma();
                    break;
                }
            case 6:
                if (value != null) {
                    setImage_file((String) value);
                    break;
                } else {
                    unsetImage_file();
                    break;
                }
            case 7:
                if (value != null) {
                    setAccent((String) value);
                    break;
                } else {
                    unsetAccent();
                    break;
                }
            case 8:
                if (value != null) {
                    setMean_cn((String) value);
                    break;
                } else {
                    unsetMean_cn();
                    break;
                }
            case 9:
                if (value != null) {
                    setMean_en((String) value);
                    break;
                } else {
                    unsetMean_en();
                    break;
                }
            case 10:
                if (value != null) {
                    setShort_phrase((String) value);
                    break;
                } else {
                    unsetShort_phrase();
                    break;
                }
            case 11:
                if (value != null) {
                    setDeformation_img((String) value);
                    break;
                } else {
                    unsetDeformation_img();
                    break;
                }
            case 12:
                if (value != null) {
                    setDeformation_desc((String) value);
                    break;
                } else {
                    unsetDeformation_desc();
                    break;
                }
            case 13:
                if (value != null) {
                    setSentence((String) value);
                    break;
                } else {
                    unsetSentence();
                    break;
                }
            case 14:
                if (value != null) {
                    setSentence_trans((String) value);
                    break;
                } else {
                    unsetSentence_trans();
                    break;
                }
            case 15:
                if (value != null) {
                    setSentence_audio((String) value);
                    break;
                } else {
                    unsetSentence_audio();
                    break;
                }
            case 16:
                if (value != null) {
                    setUpdate_flag((String) value);
                    break;
                } else {
                    unsetUpdate_flag();
                    break;
                }
            case 17:
                if (value != null) {
                    setAsset_pack_path((String) value);
                    break;
                } else {
                    unsetAsset_pack_path();
                    break;
                }
            case 18:
                if (value != null) {
                    setUpdate_flag_md5((String) value);
                    break;
                } else {
                    unsetUpdate_flag_md5();
                    break;
                }
        }
    }

    public BBTopicAssetV2(int topic_id, String word, String word_variants, String word_audio, String word_etyma, String image_file, String accent, String mean_cn, String mean_en, String short_phrase, String deformation_img, String deformation_desc, String sentence, String sentence_trans, String sentence_audio, String update_flag, String asset_pack_path, String update_flag_md5) {
        this();
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        this.word = word;
        this.word_variants = word_variants;
        this.word_audio = word_audio;
        this.word_etyma = word_etyma;
        this.image_file = image_file;
        this.accent = accent;
        this.mean_cn = mean_cn;
        this.mean_en = mean_en;
        this.short_phrase = short_phrase;
        this.deformation_img = deformation_img;
        this.deformation_desc = deformation_desc;
        this.sentence = sentence;
        this.sentence_trans = sentence_trans;
        this.sentence_audio = sentence_audio;
        this.update_flag = update_flag;
        this.asset_pack_path = asset_pack_path;
        this.update_flag_md5 = update_flag_md5;
    }

    public boolean equals(BBTopicAssetV2 that) {
        if (that == null || this.topic_id != that.topic_id) {
            return false;
        }
        boolean isSetWord = isSetWord();
        boolean isSetWord2 = that.isSetWord();
        if ((isSetWord || isSetWord2) && !(isSetWord && isSetWord2 && this.word.equals(that.word))) {
            return false;
        }
        boolean isSetWord_variants = isSetWord_variants();
        boolean isSetWord_variants2 = that.isSetWord_variants();
        if ((isSetWord_variants || isSetWord_variants2) && !(isSetWord_variants && isSetWord_variants2 && this.word_variants.equals(that.word_variants))) {
            return false;
        }
        boolean isSetWord_audio = isSetWord_audio();
        boolean isSetWord_audio2 = that.isSetWord_audio();
        if ((isSetWord_audio || isSetWord_audio2) && !(isSetWord_audio && isSetWord_audio2 && this.word_audio.equals(that.word_audio))) {
            return false;
        }
        boolean isSetWord_etyma = isSetWord_etyma();
        boolean isSetWord_etyma2 = that.isSetWord_etyma();
        if ((isSetWord_etyma || isSetWord_etyma2) && !(isSetWord_etyma && isSetWord_etyma2 && this.word_etyma.equals(that.word_etyma))) {
            return false;
        }
        boolean isSetImage_file = isSetImage_file();
        boolean isSetImage_file2 = that.isSetImage_file();
        if ((isSetImage_file || isSetImage_file2) && !(isSetImage_file && isSetImage_file2 && this.image_file.equals(that.image_file))) {
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
        boolean isSetMean_en = isSetMean_en();
        boolean isSetMean_en2 = that.isSetMean_en();
        if ((isSetMean_en || isSetMean_en2) && !(isSetMean_en && isSetMean_en2 && this.mean_en.equals(that.mean_en))) {
            return false;
        }
        boolean isSetShort_phrase = isSetShort_phrase();
        boolean isSetShort_phrase2 = that.isSetShort_phrase();
        if ((isSetShort_phrase || isSetShort_phrase2) && !(isSetShort_phrase && isSetShort_phrase2 && this.short_phrase.equals(that.short_phrase))) {
            return false;
        }
        boolean isSetDeformation_img = isSetDeformation_img();
        boolean isSetDeformation_img2 = that.isSetDeformation_img();
        if ((isSetDeformation_img || isSetDeformation_img2) && !(isSetDeformation_img && isSetDeformation_img2 && this.deformation_img.equals(that.deformation_img))) {
            return false;
        }
        boolean isSetDeformation_desc = isSetDeformation_desc();
        boolean isSetDeformation_desc2 = that.isSetDeformation_desc();
        if ((isSetDeformation_desc || isSetDeformation_desc2) && !(isSetDeformation_desc && isSetDeformation_desc2 && this.deformation_desc.equals(that.deformation_desc))) {
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
        boolean isSetSentence_audio = isSetSentence_audio();
        boolean isSetSentence_audio2 = that.isSetSentence_audio();
        if ((isSetSentence_audio || isSetSentence_audio2) && !(isSetSentence_audio && isSetSentence_audio2 && this.sentence_audio.equals(that.sentence_audio))) {
            return false;
        }
        boolean isSetUpdate_flag = isSetUpdate_flag();
        boolean isSetUpdate_flag2 = that.isSetUpdate_flag();
        if ((isSetUpdate_flag || isSetUpdate_flag2) && !(isSetUpdate_flag && isSetUpdate_flag2 && this.update_flag.equals(that.update_flag))) {
            return false;
        }
        boolean isSetAsset_pack_path = isSetAsset_pack_path();
        boolean isSetAsset_pack_path2 = that.isSetAsset_pack_path();
        if ((isSetAsset_pack_path || isSetAsset_pack_path2) && !(isSetAsset_pack_path && isSetAsset_pack_path2 && this.asset_pack_path.equals(that.asset_pack_path))) {
            return false;
        }
        boolean isSetUpdate_flag_md5 = isSetUpdate_flag_md5();
        boolean isSetUpdate_flag_md52 = that.isSetUpdate_flag_md5();
        if (isSetUpdate_flag_md5 || isSetUpdate_flag_md52) {
            return isSetUpdate_flag_md5 && isSetUpdate_flag_md52 && this.update_flag_md5.equals(that.update_flag_md5);
        }
        return true;
    }

    public BBTopicAssetV2(BBTopicAssetV2 other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.topic_id = other.topic_id;
        if (other.isSetWord()) {
            this.word = other.word;
        }
        if (other.isSetWord_variants()) {
            this.word_variants = other.word_variants;
        }
        if (other.isSetWord_audio()) {
            this.word_audio = other.word_audio;
        }
        if (other.isSetWord_etyma()) {
            this.word_etyma = other.word_etyma;
        }
        if (other.isSetImage_file()) {
            this.image_file = other.image_file;
        }
        if (other.isSetAccent()) {
            this.accent = other.accent;
        }
        if (other.isSetMean_cn()) {
            this.mean_cn = other.mean_cn;
        }
        if (other.isSetMean_en()) {
            this.mean_en = other.mean_en;
        }
        if (other.isSetShort_phrase()) {
            this.short_phrase = other.short_phrase;
        }
        if (other.isSetDeformation_img()) {
            this.deformation_img = other.deformation_img;
        }
        if (other.isSetDeformation_desc()) {
            this.deformation_desc = other.deformation_desc;
        }
        if (other.isSetSentence()) {
            this.sentence = other.sentence;
        }
        if (other.isSetSentence_trans()) {
            this.sentence_trans = other.sentence_trans;
        }
        if (other.isSetSentence_audio()) {
            this.sentence_audio = other.sentence_audio;
        }
        if (other.isSetUpdate_flag()) {
            this.update_flag = other.update_flag;
        }
        if (other.isSetAsset_pack_path()) {
            this.asset_pack_path = other.asset_pack_path;
        }
        if (other.isSetUpdate_flag_md5()) {
            this.update_flag_md5 = other.update_flag_md5;
        }
    }
}
