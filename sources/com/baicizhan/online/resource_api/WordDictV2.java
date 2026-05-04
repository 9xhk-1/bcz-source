package com.baicizhan.online.resource_api;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TBaseHelper;
import org.apache.thrift.TException;
import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TField;
import org.apache.thrift.protocol.TList;
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
public class WordDictV2 implements TBase<WordDictV2, _Fields>, Serializable, Cloneable, Comparable<WordDictV2> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public List<SynAntInfo> antonyms;
    public List<MeanInfo> chn_means;
    public List<MeanInfo> en_means;
    public List<String> exams;
    private _Fields[] optionals;
    public List<SentenceInfo> sentences;
    public List<ShortPhraseInfo> short_phrases;
    public List<SynAntInfo> synonyms;
    public VariantInfo variant_info;
    public WordBasicInfo word_basic_info;
    private static final TStruct STRUCT_DESC = new TStruct("WordDictV2");
    private static final TField WORD_BASIC_INFO_FIELD_DESC = new TField("word_basic_info", (byte) 12, 1);
    private static final TField CHN_MEANS_FIELD_DESC = new TField("chn_means", (byte) 15, 2);
    private static final TField EN_MEANS_FIELD_DESC = new TField("en_means", (byte) 15, 3);
    private static final TField SENTENCES_FIELD_DESC = new TField("sentences", (byte) 15, 4);
    private static final TField SHORT_PHRASES_FIELD_DESC = new TField("short_phrases", (byte) 15, 5);
    private static final TField ANTONYMS_FIELD_DESC = new TField("antonyms", (byte) 15, 6);
    private static final TField SYNONYMS_FIELD_DESC = new TField("synonyms", (byte) 15, 7);
    private static final TField VARIANT_INFO_FIELD_DESC = new TField("variant_info", (byte) 12, 8);
    private static final TField EXAMS_FIELD_DESC = new TField("exams", (byte) 15, 9);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.resource_api.WordDictV2$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$WordDictV2$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$WordDictV2$_Fields = iArr;
            try {
                iArr[_Fields.WORD_BASIC_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$WordDictV2$_Fields[_Fields.CHN_MEANS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$WordDictV2$_Fields[_Fields.EN_MEANS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$WordDictV2$_Fields[_Fields.SENTENCES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$WordDictV2$_Fields[_Fields.SHORT_PHRASES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$WordDictV2$_Fields[_Fields.ANTONYMS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$WordDictV2$_Fields[_Fields.SYNONYMS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$WordDictV2$_Fields[_Fields.VARIANT_INFO.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$WordDictV2$_Fields[_Fields.EXAMS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WordDictV2StandardScheme extends StandardScheme<WordDictV2> {
        private WordDictV2StandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, WordDictV2 struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    struct.validate();
                    return;
                }
                int i11 = 0;
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            WordBasicInfo wordBasicInfo = new WordBasicInfo();
                            struct.word_basic_info = wordBasicInfo;
                            wordBasicInfo.read(iprot);
                            struct.setWord_basic_infoIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 15) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            TList readListBegin = iprot.readListBegin();
                            struct.chn_means = new ArrayList(readListBegin.size);
                            while (i11 < readListBegin.size) {
                                MeanInfo meanInfo = new MeanInfo();
                                meanInfo.read(iprot);
                                struct.chn_means.add(meanInfo);
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setChn_meansIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 15) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            TList readListBegin2 = iprot.readListBegin();
                            struct.en_means = new ArrayList(readListBegin2.size);
                            while (i11 < readListBegin2.size) {
                                MeanInfo meanInfo2 = new MeanInfo();
                                meanInfo2.read(iprot);
                                struct.en_means.add(meanInfo2);
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setEn_meansIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 15) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            TList readListBegin3 = iprot.readListBegin();
                            struct.sentences = new ArrayList(readListBegin3.size);
                            while (i11 < readListBegin3.size) {
                                SentenceInfo sentenceInfo = new SentenceInfo();
                                sentenceInfo.read(iprot);
                                struct.sentences.add(sentenceInfo);
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setSentencesIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 15) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            TList readListBegin4 = iprot.readListBegin();
                            struct.short_phrases = new ArrayList(readListBegin4.size);
                            while (i11 < readListBegin4.size) {
                                ShortPhraseInfo shortPhraseInfo = new ShortPhraseInfo();
                                shortPhraseInfo.read(iprot);
                                struct.short_phrases.add(shortPhraseInfo);
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setShort_phrasesIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 15) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            TList readListBegin5 = iprot.readListBegin();
                            struct.antonyms = new ArrayList(readListBegin5.size);
                            while (i11 < readListBegin5.size) {
                                SynAntInfo synAntInfo = new SynAntInfo();
                                synAntInfo.read(iprot);
                                struct.antonyms.add(synAntInfo);
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setAntonymsIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 15) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            TList readListBegin6 = iprot.readListBegin();
                            struct.synonyms = new ArrayList(readListBegin6.size);
                            while (i11 < readListBegin6.size) {
                                SynAntInfo synAntInfo2 = new SynAntInfo();
                                synAntInfo2.read(iprot);
                                struct.synonyms.add(synAntInfo2);
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setSynonymsIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            VariantInfo variantInfo = new VariantInfo();
                            struct.variant_info = variantInfo;
                            variantInfo.read(iprot);
                            struct.setVariant_infoIsSet(true);
                            break;
                        }
                    case 9:
                        if (b11 != 15) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            TList readListBegin7 = iprot.readListBegin();
                            struct.exams = new ArrayList(readListBegin7.size);
                            while (i11 < readListBegin7.size) {
                                struct.exams.add(iprot.readString());
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setExamsIsSet(true);
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
        public void write(TProtocol oprot, WordDictV2 struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(WordDictV2.STRUCT_DESC);
            if (struct.word_basic_info != null) {
                oprot.writeFieldBegin(WordDictV2.WORD_BASIC_INFO_FIELD_DESC);
                struct.word_basic_info.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.chn_means != null) {
                oprot.writeFieldBegin(WordDictV2.CHN_MEANS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.chn_means.size()));
                Iterator<MeanInfo> it = struct.chn_means.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.en_means != null && struct.isSetEn_means()) {
                oprot.writeFieldBegin(WordDictV2.EN_MEANS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.en_means.size()));
                Iterator<MeanInfo> it2 = struct.en_means.iterator();
                while (it2.hasNext()) {
                    it2.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.sentences != null && struct.isSetSentences()) {
                oprot.writeFieldBegin(WordDictV2.SENTENCES_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.sentences.size()));
                Iterator<SentenceInfo> it3 = struct.sentences.iterator();
                while (it3.hasNext()) {
                    it3.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.short_phrases != null && struct.isSetShort_phrases()) {
                oprot.writeFieldBegin(WordDictV2.SHORT_PHRASES_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.short_phrases.size()));
                Iterator<ShortPhraseInfo> it4 = struct.short_phrases.iterator();
                while (it4.hasNext()) {
                    it4.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.antonyms != null && struct.isSetAntonyms()) {
                oprot.writeFieldBegin(WordDictV2.ANTONYMS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.antonyms.size()));
                Iterator<SynAntInfo> it5 = struct.antonyms.iterator();
                while (it5.hasNext()) {
                    it5.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.synonyms != null && struct.isSetSynonyms()) {
                oprot.writeFieldBegin(WordDictV2.SYNONYMS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.synonyms.size()));
                Iterator<SynAntInfo> it6 = struct.synonyms.iterator();
                while (it6.hasNext()) {
                    it6.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.variant_info != null && struct.isSetVariant_info()) {
                oprot.writeFieldBegin(WordDictV2.VARIANT_INFO_FIELD_DESC);
                struct.variant_info.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.exams != null && struct.isSetExams()) {
                oprot.writeFieldBegin(WordDictV2.EXAMS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 11, struct.exams.size()));
                Iterator<String> it7 = struct.exams.iterator();
                while (it7.hasNext()) {
                    oprot.writeString(it7.next());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WordDictV2StandardSchemeFactory implements SchemeFactory {
        private WordDictV2StandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public WordDictV2StandardScheme getScheme() {
            return new WordDictV2StandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WordDictV2TupleScheme extends TupleScheme<WordDictV2> {
        private WordDictV2TupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, WordDictV2 struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            WordBasicInfo wordBasicInfo = new WordBasicInfo();
            struct.word_basic_info = wordBasicInfo;
            wordBasicInfo.read(tTupleProtocol);
            struct.setWord_basic_infoIsSet(true);
            TList tList = new TList((byte) 12, tTupleProtocol.readI32());
            struct.chn_means = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                MeanInfo meanInfo = new MeanInfo();
                meanInfo.read(tTupleProtocol);
                struct.chn_means.add(meanInfo);
            }
            struct.setChn_meansIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(7);
            if (readBitSet.get(0)) {
                TList tList2 = new TList((byte) 12, tTupleProtocol.readI32());
                struct.en_means = new ArrayList(tList2.size);
                for (int i12 = 0; i12 < tList2.size; i12++) {
                    MeanInfo meanInfo2 = new MeanInfo();
                    meanInfo2.read(tTupleProtocol);
                    struct.en_means.add(meanInfo2);
                }
                struct.setEn_meansIsSet(true);
            }
            if (readBitSet.get(1)) {
                TList tList3 = new TList((byte) 12, tTupleProtocol.readI32());
                struct.sentences = new ArrayList(tList3.size);
                for (int i13 = 0; i13 < tList3.size; i13++) {
                    SentenceInfo sentenceInfo = new SentenceInfo();
                    sentenceInfo.read(tTupleProtocol);
                    struct.sentences.add(sentenceInfo);
                }
                struct.setSentencesIsSet(true);
            }
            if (readBitSet.get(2)) {
                TList tList4 = new TList((byte) 12, tTupleProtocol.readI32());
                struct.short_phrases = new ArrayList(tList4.size);
                for (int i14 = 0; i14 < tList4.size; i14++) {
                    ShortPhraseInfo shortPhraseInfo = new ShortPhraseInfo();
                    shortPhraseInfo.read(tTupleProtocol);
                    struct.short_phrases.add(shortPhraseInfo);
                }
                struct.setShort_phrasesIsSet(true);
            }
            if (readBitSet.get(3)) {
                TList tList5 = new TList((byte) 12, tTupleProtocol.readI32());
                struct.antonyms = new ArrayList(tList5.size);
                for (int i15 = 0; i15 < tList5.size; i15++) {
                    SynAntInfo synAntInfo = new SynAntInfo();
                    synAntInfo.read(tTupleProtocol);
                    struct.antonyms.add(synAntInfo);
                }
                struct.setAntonymsIsSet(true);
            }
            if (readBitSet.get(4)) {
                TList tList6 = new TList((byte) 12, tTupleProtocol.readI32());
                struct.synonyms = new ArrayList(tList6.size);
                for (int i16 = 0; i16 < tList6.size; i16++) {
                    SynAntInfo synAntInfo2 = new SynAntInfo();
                    synAntInfo2.read(tTupleProtocol);
                    struct.synonyms.add(synAntInfo2);
                }
                struct.setSynonymsIsSet(true);
            }
            if (readBitSet.get(5)) {
                VariantInfo variantInfo = new VariantInfo();
                struct.variant_info = variantInfo;
                variantInfo.read(tTupleProtocol);
                struct.setVariant_infoIsSet(true);
            }
            if (readBitSet.get(6)) {
                TList tList7 = new TList((byte) 11, tTupleProtocol.readI32());
                struct.exams = new ArrayList(tList7.size);
                for (int i17 = 0; i17 < tList7.size; i17++) {
                    struct.exams.add(tTupleProtocol.readString());
                }
                struct.setExamsIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, WordDictV2 struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.word_basic_info.write(tTupleProtocol);
            tTupleProtocol.writeI32(struct.chn_means.size());
            Iterator<MeanInfo> it = struct.chn_means.iterator();
            while (it.hasNext()) {
                it.next().write(tTupleProtocol);
            }
            BitSet bitSet = new BitSet();
            if (struct.isSetEn_means()) {
                bitSet.set(0);
            }
            if (struct.isSetSentences()) {
                bitSet.set(1);
            }
            if (struct.isSetShort_phrases()) {
                bitSet.set(2);
            }
            if (struct.isSetAntonyms()) {
                bitSet.set(3);
            }
            if (struct.isSetSynonyms()) {
                bitSet.set(4);
            }
            if (struct.isSetVariant_info()) {
                bitSet.set(5);
            }
            if (struct.isSetExams()) {
                bitSet.set(6);
            }
            tTupleProtocol.writeBitSet(bitSet, 7);
            if (struct.isSetEn_means()) {
                tTupleProtocol.writeI32(struct.en_means.size());
                Iterator<MeanInfo> it2 = struct.en_means.iterator();
                while (it2.hasNext()) {
                    it2.next().write(tTupleProtocol);
                }
            }
            if (struct.isSetSentences()) {
                tTupleProtocol.writeI32(struct.sentences.size());
                Iterator<SentenceInfo> it3 = struct.sentences.iterator();
                while (it3.hasNext()) {
                    it3.next().write(tTupleProtocol);
                }
            }
            if (struct.isSetShort_phrases()) {
                tTupleProtocol.writeI32(struct.short_phrases.size());
                Iterator<ShortPhraseInfo> it4 = struct.short_phrases.iterator();
                while (it4.hasNext()) {
                    it4.next().write(tTupleProtocol);
                }
            }
            if (struct.isSetAntonyms()) {
                tTupleProtocol.writeI32(struct.antonyms.size());
                Iterator<SynAntInfo> it5 = struct.antonyms.iterator();
                while (it5.hasNext()) {
                    it5.next().write(tTupleProtocol);
                }
            }
            if (struct.isSetSynonyms()) {
                tTupleProtocol.writeI32(struct.synonyms.size());
                Iterator<SynAntInfo> it6 = struct.synonyms.iterator();
                while (it6.hasNext()) {
                    it6.next().write(tTupleProtocol);
                }
            }
            if (struct.isSetVariant_info()) {
                struct.variant_info.write(tTupleProtocol);
            }
            if (struct.isSetExams()) {
                tTupleProtocol.writeI32(struct.exams.size());
                Iterator<String> it7 = struct.exams.iterator();
                while (it7.hasNext()) {
                    tTupleProtocol.writeString(it7.next());
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WordDictV2TupleSchemeFactory implements SchemeFactory {
        private WordDictV2TupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public WordDictV2TupleScheme getScheme() {
            return new WordDictV2TupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        WORD_BASIC_INFO(1, "word_basic_info"),
        CHN_MEANS(2, "chn_means"),
        EN_MEANS(3, "en_means"),
        SENTENCES(4, "sentences"),
        SHORT_PHRASES(5, "short_phrases"),
        ANTONYMS(6, "antonyms"),
        SYNONYMS(7, "synonyms"),
        VARIANT_INFO(8, "variant_info"),
        EXAMS(9, "exams");

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
                    return WORD_BASIC_INFO;
                case 2:
                    return CHN_MEANS;
                case 3:
                    return EN_MEANS;
                case 4:
                    return SENTENCES;
                case 5:
                    return SHORT_PHRASES;
                case 6:
                    return ANTONYMS;
                case 7:
                    return SYNONYMS;
                case 8:
                    return VARIANT_INFO;
                case 9:
                    return EXAMS;
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
        hashMap.put(StandardScheme.class, new WordDictV2StandardSchemeFactory());
        hashMap.put(TupleScheme.class, new WordDictV2TupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.WORD_BASIC_INFO, (_Fields) new FieldMetaData("word_basic_info", (byte) 1, new StructMetaData((byte) 12, WordBasicInfo.class)));
        enumMap.put((EnumMap) _Fields.CHN_MEANS, (_Fields) new FieldMetaData("chn_means", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, MeanInfo.class))));
        enumMap.put((EnumMap) _Fields.EN_MEANS, (_Fields) new FieldMetaData("en_means", (byte) 2, new ListMetaData((byte) 15, new StructMetaData((byte) 12, MeanInfo.class))));
        enumMap.put((EnumMap) _Fields.SENTENCES, (_Fields) new FieldMetaData("sentences", (byte) 2, new ListMetaData((byte) 15, new StructMetaData((byte) 12, SentenceInfo.class))));
        enumMap.put((EnumMap) _Fields.SHORT_PHRASES, (_Fields) new FieldMetaData("short_phrases", (byte) 2, new ListMetaData((byte) 15, new StructMetaData((byte) 12, ShortPhraseInfo.class))));
        enumMap.put((EnumMap) _Fields.ANTONYMS, (_Fields) new FieldMetaData("antonyms", (byte) 2, new ListMetaData((byte) 15, new StructMetaData((byte) 12, SynAntInfo.class))));
        enumMap.put((EnumMap) _Fields.SYNONYMS, (_Fields) new FieldMetaData("synonyms", (byte) 2, new ListMetaData((byte) 15, new StructMetaData((byte) 12, SynAntInfo.class))));
        enumMap.put((EnumMap) _Fields.VARIANT_INFO, (_Fields) new FieldMetaData("variant_info", (byte) 2, new StructMetaData((byte) 12, VariantInfo.class)));
        enumMap.put((EnumMap) _Fields.EXAMS, (_Fields) new FieldMetaData("exams", (byte) 2, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 11))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(WordDictV2.class, unmodifiableMap);
    }

    public WordDictV2() {
        this.optionals = new _Fields[]{_Fields.EN_MEANS, _Fields.SENTENCES, _Fields.SHORT_PHRASES, _Fields.ANTONYMS, _Fields.SYNONYMS, _Fields.VARIANT_INFO, _Fields.EXAMS};
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

    public void addToAntonyms(SynAntInfo elem) {
        if (this.antonyms == null) {
            this.antonyms = new ArrayList();
        }
        this.antonyms.add(elem);
    }

    public void addToChn_means(MeanInfo elem) {
        if (this.chn_means == null) {
            this.chn_means = new ArrayList();
        }
        this.chn_means.add(elem);
    }

    public void addToEn_means(MeanInfo elem) {
        if (this.en_means == null) {
            this.en_means = new ArrayList();
        }
        this.en_means.add(elem);
    }

    public void addToExams(String elem) {
        if (this.exams == null) {
            this.exams = new ArrayList();
        }
        this.exams.add(elem);
    }

    public void addToSentences(SentenceInfo elem) {
        if (this.sentences == null) {
            this.sentences = new ArrayList();
        }
        this.sentences.add(elem);
    }

    public void addToShort_phrases(ShortPhraseInfo elem) {
        if (this.short_phrases == null) {
            this.short_phrases = new ArrayList();
        }
        this.short_phrases.add(elem);
    }

    public void addToSynonyms(SynAntInfo elem) {
        if (this.synonyms == null) {
            this.synonyms = new ArrayList();
        }
        this.synonyms.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.word_basic_info = null;
        this.chn_means = null;
        this.en_means = null;
        this.sentences = null;
        this.short_phrases = null;
        this.antonyms = null;
        this.synonyms = null;
        this.variant_info = null;
        this.exams = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof WordDictV2)) {
            return equals((WordDictV2) that);
        }
        return false;
    }

    public List<SynAntInfo> getAntonyms() {
        return this.antonyms;
    }

    public Iterator<SynAntInfo> getAntonymsIterator() {
        List<SynAntInfo> list = this.antonyms;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getAntonymsSize() {
        List<SynAntInfo> list = this.antonyms;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<MeanInfo> getChn_means() {
        return this.chn_means;
    }

    public Iterator<MeanInfo> getChn_meansIterator() {
        List<MeanInfo> list = this.chn_means;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getChn_meansSize() {
        List<MeanInfo> list = this.chn_means;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<MeanInfo> getEn_means() {
        return this.en_means;
    }

    public Iterator<MeanInfo> getEn_meansIterator() {
        List<MeanInfo> list = this.en_means;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getEn_meansSize() {
        List<MeanInfo> list = this.en_means;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<String> getExams() {
        return this.exams;
    }

    public Iterator<String> getExamsIterator() {
        List<String> list = this.exams;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getExamsSize() {
        List<String> list = this.exams;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<SentenceInfo> getSentences() {
        return this.sentences;
    }

    public Iterator<SentenceInfo> getSentencesIterator() {
        List<SentenceInfo> list = this.sentences;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getSentencesSize() {
        List<SentenceInfo> list = this.sentences;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<ShortPhraseInfo> getShort_phrases() {
        return this.short_phrases;
    }

    public Iterator<ShortPhraseInfo> getShort_phrasesIterator() {
        List<ShortPhraseInfo> list = this.short_phrases;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getShort_phrasesSize() {
        List<ShortPhraseInfo> list = this.short_phrases;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<SynAntInfo> getSynonyms() {
        return this.synonyms;
    }

    public Iterator<SynAntInfo> getSynonymsIterator() {
        List<SynAntInfo> list = this.synonyms;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getSynonymsSize() {
        List<SynAntInfo> list = this.synonyms;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public VariantInfo getVariant_info() {
        return this.variant_info;
    }

    public WordBasicInfo getWord_basic_info() {
        return this.word_basic_info;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAntonyms() {
        return this.antonyms != null;
    }

    public boolean isSetChn_means() {
        return this.chn_means != null;
    }

    public boolean isSetEn_means() {
        return this.en_means != null;
    }

    public boolean isSetExams() {
        return this.exams != null;
    }

    public boolean isSetSentences() {
        return this.sentences != null;
    }

    public boolean isSetShort_phrases() {
        return this.short_phrases != null;
    }

    public boolean isSetSynonyms() {
        return this.synonyms != null;
    }

    public boolean isSetVariant_info() {
        return this.variant_info != null;
    }

    public boolean isSetWord_basic_info() {
        return this.word_basic_info != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public WordDictV2 setAntonyms(List<SynAntInfo> antonyms) {
        this.antonyms = antonyms;
        return this;
    }

    public void setAntonymsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.antonyms = null;
    }

    public WordDictV2 setChn_means(List<MeanInfo> chn_means) {
        this.chn_means = chn_means;
        return this;
    }

    public void setChn_meansIsSet(boolean value) {
        if (value) {
            return;
        }
        this.chn_means = null;
    }

    public WordDictV2 setEn_means(List<MeanInfo> en_means) {
        this.en_means = en_means;
        return this;
    }

    public void setEn_meansIsSet(boolean value) {
        if (value) {
            return;
        }
        this.en_means = null;
    }

    public WordDictV2 setExams(List<String> exams) {
        this.exams = exams;
        return this;
    }

    public void setExamsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.exams = null;
    }

    public WordDictV2 setSentences(List<SentenceInfo> sentences) {
        this.sentences = sentences;
        return this;
    }

    public void setSentencesIsSet(boolean value) {
        if (value) {
            return;
        }
        this.sentences = null;
    }

    public WordDictV2 setShort_phrases(List<ShortPhraseInfo> short_phrases) {
        this.short_phrases = short_phrases;
        return this;
    }

    public void setShort_phrasesIsSet(boolean value) {
        if (value) {
            return;
        }
        this.short_phrases = null;
    }

    public WordDictV2 setSynonyms(List<SynAntInfo> synonyms) {
        this.synonyms = synonyms;
        return this;
    }

    public void setSynonymsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.synonyms = null;
    }

    public WordDictV2 setVariant_info(VariantInfo variant_info) {
        this.variant_info = variant_info;
        return this;
    }

    public void setVariant_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.variant_info = null;
    }

    public WordDictV2 setWord_basic_info(WordBasicInfo word_basic_info) {
        this.word_basic_info = word_basic_info;
        return this;
    }

    public void setWord_basic_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.word_basic_info = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("WordDictV2(");
        sb2.append("word_basic_info:");
        WordBasicInfo wordBasicInfo = this.word_basic_info;
        if (wordBasicInfo == null) {
            sb2.append("null");
        } else {
            sb2.append(wordBasicInfo);
        }
        sb2.append(j2.O);
        sb2.append("chn_means:");
        List<MeanInfo> list = this.chn_means;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        if (isSetEn_means()) {
            sb2.append(j2.O);
            sb2.append("en_means:");
            List<MeanInfo> list2 = this.en_means;
            if (list2 == null) {
                sb2.append("null");
            } else {
                sb2.append(list2);
            }
        }
        if (isSetSentences()) {
            sb2.append(j2.O);
            sb2.append("sentences:");
            List<SentenceInfo> list3 = this.sentences;
            if (list3 == null) {
                sb2.append("null");
            } else {
                sb2.append(list3);
            }
        }
        if (isSetShort_phrases()) {
            sb2.append(j2.O);
            sb2.append("short_phrases:");
            List<ShortPhraseInfo> list4 = this.short_phrases;
            if (list4 == null) {
                sb2.append("null");
            } else {
                sb2.append(list4);
            }
        }
        if (isSetAntonyms()) {
            sb2.append(j2.O);
            sb2.append("antonyms:");
            List<SynAntInfo> list5 = this.antonyms;
            if (list5 == null) {
                sb2.append("null");
            } else {
                sb2.append(list5);
            }
        }
        if (isSetSynonyms()) {
            sb2.append(j2.O);
            sb2.append("synonyms:");
            List<SynAntInfo> list6 = this.synonyms;
            if (list6 == null) {
                sb2.append("null");
            } else {
                sb2.append(list6);
            }
        }
        if (isSetVariant_info()) {
            sb2.append(j2.O);
            sb2.append("variant_info:");
            VariantInfo variantInfo = this.variant_info;
            if (variantInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(variantInfo);
            }
        }
        if (isSetExams()) {
            sb2.append(j2.O);
            sb2.append("exams:");
            List<String> list7 = this.exams;
            if (list7 == null) {
                sb2.append("null");
            } else {
                sb2.append(list7);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAntonyms() {
        this.antonyms = null;
    }

    public void unsetChn_means() {
        this.chn_means = null;
    }

    public void unsetEn_means() {
        this.en_means = null;
    }

    public void unsetExams() {
        this.exams = null;
    }

    public void unsetSentences() {
        this.sentences = null;
    }

    public void unsetShort_phrases() {
        this.short_phrases = null;
    }

    public void unsetSynonyms() {
        this.synonyms = null;
    }

    public void unsetVariant_info() {
        this.variant_info = null;
    }

    public void unsetWord_basic_info() {
        this.word_basic_info = null;
    }

    public void validate() throws TException {
        WordBasicInfo wordBasicInfo = this.word_basic_info;
        if (wordBasicInfo == null) {
            throw new TProtocolException("Required field 'word_basic_info' was not present! Struct: " + toString());
        }
        if (this.chn_means == null) {
            throw new TProtocolException("Required field 'chn_means' was not present! Struct: " + toString());
        }
        if (wordBasicInfo != null) {
            wordBasicInfo.validate();
        }
        VariantInfo variantInfo = this.variant_info;
        if (variantInfo != null) {
            variantInfo.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(WordDictV2 other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        int compareTo7;
        int compareTo8;
        int compareTo9;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo10 = Boolean.valueOf(isSetWord_basic_info()).compareTo(Boolean.valueOf(other.isSetWord_basic_info()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetWord_basic_info() && (compareTo9 = TBaseHelper.compareTo((Comparable) this.word_basic_info, (Comparable) other.word_basic_info)) != 0) {
            return compareTo9;
        }
        int compareTo11 = Boolean.valueOf(isSetChn_means()).compareTo(Boolean.valueOf(other.isSetChn_means()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetChn_means() && (compareTo8 = TBaseHelper.compareTo((List) this.chn_means, (List) other.chn_means)) != 0) {
            return compareTo8;
        }
        int compareTo12 = Boolean.valueOf(isSetEn_means()).compareTo(Boolean.valueOf(other.isSetEn_means()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetEn_means() && (compareTo7 = TBaseHelper.compareTo((List) this.en_means, (List) other.en_means)) != 0) {
            return compareTo7;
        }
        int compareTo13 = Boolean.valueOf(isSetSentences()).compareTo(Boolean.valueOf(other.isSetSentences()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetSentences() && (compareTo6 = TBaseHelper.compareTo((List) this.sentences, (List) other.sentences)) != 0) {
            return compareTo6;
        }
        int compareTo14 = Boolean.valueOf(isSetShort_phrases()).compareTo(Boolean.valueOf(other.isSetShort_phrases()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (isSetShort_phrases() && (compareTo5 = TBaseHelper.compareTo((List) this.short_phrases, (List) other.short_phrases)) != 0) {
            return compareTo5;
        }
        int compareTo15 = Boolean.valueOf(isSetAntonyms()).compareTo(Boolean.valueOf(other.isSetAntonyms()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (isSetAntonyms() && (compareTo4 = TBaseHelper.compareTo((List) this.antonyms, (List) other.antonyms)) != 0) {
            return compareTo4;
        }
        int compareTo16 = Boolean.valueOf(isSetSynonyms()).compareTo(Boolean.valueOf(other.isSetSynonyms()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (isSetSynonyms() && (compareTo3 = TBaseHelper.compareTo((List) this.synonyms, (List) other.synonyms)) != 0) {
            return compareTo3;
        }
        int compareTo17 = Boolean.valueOf(isSetVariant_info()).compareTo(Boolean.valueOf(other.isSetVariant_info()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (isSetVariant_info() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.variant_info, (Comparable) other.variant_info)) != 0) {
            return compareTo2;
        }
        int compareTo18 = Boolean.valueOf(isSetExams()).compareTo(Boolean.valueOf(other.isSetExams()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (!isSetExams() || (compareTo = TBaseHelper.compareTo((List) this.exams, (List) other.exams)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<WordDictV2, _Fields> deepCopy2() {
        return new WordDictV2(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$WordDictV2$_Fields[field.ordinal()]) {
            case 1:
                return getWord_basic_info();
            case 2:
                return getChn_means();
            case 3:
                return getEn_means();
            case 4:
                return getSentences();
            case 5:
                return getShort_phrases();
            case 6:
                return getAntonyms();
            case 7:
                return getSynonyms();
            case 8:
                return getVariant_info();
            case 9:
                return getExams();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$WordDictV2$_Fields[field.ordinal()]) {
            case 1:
                return isSetWord_basic_info();
            case 2:
                return isSetChn_means();
            case 3:
                return isSetEn_means();
            case 4:
                return isSetSentences();
            case 5:
                return isSetShort_phrases();
            case 6:
                return isSetAntonyms();
            case 7:
                return isSetSynonyms();
            case 8:
                return isSetVariant_info();
            case 9:
                return isSetExams();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$WordDictV2$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setWord_basic_info((WordBasicInfo) value);
                    break;
                } else {
                    unsetWord_basic_info();
                    break;
                }
            case 2:
                if (value != null) {
                    setChn_means((List) value);
                    break;
                } else {
                    unsetChn_means();
                    break;
                }
            case 3:
                if (value != null) {
                    setEn_means((List) value);
                    break;
                } else {
                    unsetEn_means();
                    break;
                }
            case 4:
                if (value != null) {
                    setSentences((List) value);
                    break;
                } else {
                    unsetSentences();
                    break;
                }
            case 5:
                if (value != null) {
                    setShort_phrases((List) value);
                    break;
                } else {
                    unsetShort_phrases();
                    break;
                }
            case 6:
                if (value != null) {
                    setAntonyms((List) value);
                    break;
                } else {
                    unsetAntonyms();
                    break;
                }
            case 7:
                if (value != null) {
                    setSynonyms((List) value);
                    break;
                } else {
                    unsetSynonyms();
                    break;
                }
            case 8:
                if (value != null) {
                    setVariant_info((VariantInfo) value);
                    break;
                } else {
                    unsetVariant_info();
                    break;
                }
            case 9:
                if (value != null) {
                    setExams((List) value);
                    break;
                } else {
                    unsetExams();
                    break;
                }
        }
    }

    public WordDictV2(WordBasicInfo word_basic_info, List<MeanInfo> chn_means) {
        this();
        this.word_basic_info = word_basic_info;
        this.chn_means = chn_means;
    }

    public boolean equals(WordDictV2 that) {
        if (that == null) {
            return false;
        }
        boolean isSetWord_basic_info = isSetWord_basic_info();
        boolean isSetWord_basic_info2 = that.isSetWord_basic_info();
        if ((isSetWord_basic_info || isSetWord_basic_info2) && !(isSetWord_basic_info && isSetWord_basic_info2 && this.word_basic_info.equals(that.word_basic_info))) {
            return false;
        }
        boolean isSetChn_means = isSetChn_means();
        boolean isSetChn_means2 = that.isSetChn_means();
        if ((isSetChn_means || isSetChn_means2) && !(isSetChn_means && isSetChn_means2 && this.chn_means.equals(that.chn_means))) {
            return false;
        }
        boolean isSetEn_means = isSetEn_means();
        boolean isSetEn_means2 = that.isSetEn_means();
        if ((isSetEn_means || isSetEn_means2) && !(isSetEn_means && isSetEn_means2 && this.en_means.equals(that.en_means))) {
            return false;
        }
        boolean isSetSentences = isSetSentences();
        boolean isSetSentences2 = that.isSetSentences();
        if ((isSetSentences || isSetSentences2) && !(isSetSentences && isSetSentences2 && this.sentences.equals(that.sentences))) {
            return false;
        }
        boolean isSetShort_phrases = isSetShort_phrases();
        boolean isSetShort_phrases2 = that.isSetShort_phrases();
        if ((isSetShort_phrases || isSetShort_phrases2) && !(isSetShort_phrases && isSetShort_phrases2 && this.short_phrases.equals(that.short_phrases))) {
            return false;
        }
        boolean isSetAntonyms = isSetAntonyms();
        boolean isSetAntonyms2 = that.isSetAntonyms();
        if ((isSetAntonyms || isSetAntonyms2) && !(isSetAntonyms && isSetAntonyms2 && this.antonyms.equals(that.antonyms))) {
            return false;
        }
        boolean isSetSynonyms = isSetSynonyms();
        boolean isSetSynonyms2 = that.isSetSynonyms();
        if ((isSetSynonyms || isSetSynonyms2) && !(isSetSynonyms && isSetSynonyms2 && this.synonyms.equals(that.synonyms))) {
            return false;
        }
        boolean isSetVariant_info = isSetVariant_info();
        boolean isSetVariant_info2 = that.isSetVariant_info();
        if ((isSetVariant_info || isSetVariant_info2) && !(isSetVariant_info && isSetVariant_info2 && this.variant_info.equals(that.variant_info))) {
            return false;
        }
        boolean isSetExams = isSetExams();
        boolean isSetExams2 = that.isSetExams();
        if (isSetExams || isSetExams2) {
            return isSetExams && isSetExams2 && this.exams.equals(that.exams);
        }
        return true;
    }

    public WordDictV2(WordDictV2 other) {
        this.optionals = new _Fields[]{_Fields.EN_MEANS, _Fields.SENTENCES, _Fields.SHORT_PHRASES, _Fields.ANTONYMS, _Fields.SYNONYMS, _Fields.VARIANT_INFO, _Fields.EXAMS};
        if (other.isSetWord_basic_info()) {
            this.word_basic_info = new WordBasicInfo(other.word_basic_info);
        }
        if (other.isSetChn_means()) {
            ArrayList arrayList = new ArrayList(other.chn_means.size());
            Iterator<MeanInfo> it = other.chn_means.iterator();
            while (it.hasNext()) {
                arrayList.add(new MeanInfo(it.next()));
            }
            this.chn_means = arrayList;
        }
        if (other.isSetEn_means()) {
            ArrayList arrayList2 = new ArrayList(other.en_means.size());
            Iterator<MeanInfo> it2 = other.en_means.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new MeanInfo(it2.next()));
            }
            this.en_means = arrayList2;
        }
        if (other.isSetSentences()) {
            ArrayList arrayList3 = new ArrayList(other.sentences.size());
            Iterator<SentenceInfo> it3 = other.sentences.iterator();
            while (it3.hasNext()) {
                arrayList3.add(new SentenceInfo(it3.next()));
            }
            this.sentences = arrayList3;
        }
        if (other.isSetShort_phrases()) {
            ArrayList arrayList4 = new ArrayList(other.short_phrases.size());
            Iterator<ShortPhraseInfo> it4 = other.short_phrases.iterator();
            while (it4.hasNext()) {
                arrayList4.add(new ShortPhraseInfo(it4.next()));
            }
            this.short_phrases = arrayList4;
        }
        if (other.isSetAntonyms()) {
            ArrayList arrayList5 = new ArrayList(other.antonyms.size());
            Iterator<SynAntInfo> it5 = other.antonyms.iterator();
            while (it5.hasNext()) {
                arrayList5.add(new SynAntInfo(it5.next()));
            }
            this.antonyms = arrayList5;
        }
        if (other.isSetSynonyms()) {
            ArrayList arrayList6 = new ArrayList(other.synonyms.size());
            Iterator<SynAntInfo> it6 = other.synonyms.iterator();
            while (it6.hasNext()) {
                arrayList6.add(new SynAntInfo(it6.next()));
            }
            this.synonyms = arrayList6;
        }
        if (other.isSetVariant_info()) {
            this.variant_info = new VariantInfo(other.variant_info);
        }
        if (other.isSetExams()) {
            this.exams = new ArrayList(other.exams);
        }
    }
}
