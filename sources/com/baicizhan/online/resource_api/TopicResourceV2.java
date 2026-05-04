package com.baicizhan.online.resource_api;

import ix.l1;
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
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TField;
import org.apache.thrift.protocol.TList;
import org.apache.thrift.protocol.TProtocol;
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
public class TopicResourceV2 implements TBase<TopicResourceV2, _Fields>, Serializable, Cloneable, Comparable<TopicResourceV2> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public WordDictV2 dict;
    public DictWiki dict_wiki;
    public WordMedia media;
    private _Fields[] optionals;
    public List<SimilarWord> similar_words;
    public ZpkInfo zpk_info;
    private static final TStruct STRUCT_DESC = new TStruct("TopicResourceV2");
    private static final TField ZPK_INFO_FIELD_DESC = new TField("zpk_info", (byte) 12, 1);
    private static final TField DICT_FIELD_DESC = new TField("dict", (byte) 12, 2);
    private static final TField DICT_WIKI_FIELD_DESC = new TField("dict_wiki", (byte) 12, 3);
    private static final TField MEDIA_FIELD_DESC = new TField(l1.a.f62928f, (byte) 12, 4);
    private static final TField SIMILAR_WORDS_FIELD_DESC = new TField("similar_words", (byte) 15, 5);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.resource_api.TopicResourceV2$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$TopicResourceV2$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$TopicResourceV2$_Fields = iArr;
            try {
                iArr[_Fields.ZPK_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$TopicResourceV2$_Fields[_Fields.DICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$TopicResourceV2$_Fields[_Fields.DICT_WIKI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$TopicResourceV2$_Fields[_Fields.MEDIA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$TopicResourceV2$_Fields[_Fields.SIMILAR_WORDS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TopicResourceV2StandardScheme extends StandardScheme<TopicResourceV2> {
        private TopicResourceV2StandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, TopicResourceV2 struct) throws TException {
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
                                if (s11 != 5) {
                                    TProtocolUtil.skip(iprot, b11);
                                } else if (b11 == 15) {
                                    TList readListBegin = iprot.readListBegin();
                                    struct.similar_words = new ArrayList(readListBegin.size);
                                    for (int i11 = 0; i11 < readListBegin.size; i11++) {
                                        SimilarWord similarWord = new SimilarWord();
                                        similarWord.read(iprot);
                                        struct.similar_words.add(similarWord);
                                    }
                                    iprot.readListEnd();
                                    struct.setSimilar_wordsIsSet(true);
                                } else {
                                    TProtocolUtil.skip(iprot, b11);
                                }
                            } else if (b11 == 12) {
                                WordMedia wordMedia = new WordMedia();
                                struct.media = wordMedia;
                                wordMedia.read(iprot);
                                struct.setMediaIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            DictWiki dictWiki = new DictWiki();
                            struct.dict_wiki = dictWiki;
                            dictWiki.read(iprot);
                            struct.setDict_wikiIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 12) {
                        WordDictV2 wordDictV2 = new WordDictV2();
                        struct.dict = wordDictV2;
                        wordDictV2.read(iprot);
                        struct.setDictIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 12) {
                    ZpkInfo zpkInfo = new ZpkInfo();
                    struct.zpk_info = zpkInfo;
                    zpkInfo.read(iprot);
                    struct.setZpk_infoIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, TopicResourceV2 struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(TopicResourceV2.STRUCT_DESC);
            if (struct.zpk_info != null && struct.isSetZpk_info()) {
                oprot.writeFieldBegin(TopicResourceV2.ZPK_INFO_FIELD_DESC);
                struct.zpk_info.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.dict != null && struct.isSetDict()) {
                oprot.writeFieldBegin(TopicResourceV2.DICT_FIELD_DESC);
                struct.dict.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.dict_wiki != null && struct.isSetDict_wiki()) {
                oprot.writeFieldBegin(TopicResourceV2.DICT_WIKI_FIELD_DESC);
                struct.dict_wiki.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.media != null && struct.isSetMedia()) {
                oprot.writeFieldBegin(TopicResourceV2.MEDIA_FIELD_DESC);
                struct.media.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.similar_words != null && struct.isSetSimilar_words()) {
                oprot.writeFieldBegin(TopicResourceV2.SIMILAR_WORDS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.similar_words.size()));
                Iterator<SimilarWord> it = struct.similar_words.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TopicResourceV2StandardSchemeFactory implements SchemeFactory {
        private TopicResourceV2StandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public TopicResourceV2StandardScheme getScheme() {
            return new TopicResourceV2StandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TopicResourceV2TupleScheme extends TupleScheme<TopicResourceV2> {
        private TopicResourceV2TupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, TopicResourceV2 struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BitSet readBitSet = tTupleProtocol.readBitSet(5);
            if (readBitSet.get(0)) {
                ZpkInfo zpkInfo = new ZpkInfo();
                struct.zpk_info = zpkInfo;
                zpkInfo.read(tTupleProtocol);
                struct.setZpk_infoIsSet(true);
            }
            if (readBitSet.get(1)) {
                WordDictV2 wordDictV2 = new WordDictV2();
                struct.dict = wordDictV2;
                wordDictV2.read(tTupleProtocol);
                struct.setDictIsSet(true);
            }
            if (readBitSet.get(2)) {
                DictWiki dictWiki = new DictWiki();
                struct.dict_wiki = dictWiki;
                dictWiki.read(tTupleProtocol);
                struct.setDict_wikiIsSet(true);
            }
            if (readBitSet.get(3)) {
                WordMedia wordMedia = new WordMedia();
                struct.media = wordMedia;
                wordMedia.read(tTupleProtocol);
                struct.setMediaIsSet(true);
            }
            if (readBitSet.get(4)) {
                TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                struct.similar_words = new ArrayList(tList.size);
                for (int i11 = 0; i11 < tList.size; i11++) {
                    SimilarWord similarWord = new SimilarWord();
                    similarWord.read(tTupleProtocol);
                    struct.similar_words.add(similarWord);
                }
                struct.setSimilar_wordsIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, TopicResourceV2 struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BitSet bitSet = new BitSet();
            if (struct.isSetZpk_info()) {
                bitSet.set(0);
            }
            if (struct.isSetDict()) {
                bitSet.set(1);
            }
            if (struct.isSetDict_wiki()) {
                bitSet.set(2);
            }
            if (struct.isSetMedia()) {
                bitSet.set(3);
            }
            if (struct.isSetSimilar_words()) {
                bitSet.set(4);
            }
            tTupleProtocol.writeBitSet(bitSet, 5);
            if (struct.isSetZpk_info()) {
                struct.zpk_info.write(tTupleProtocol);
            }
            if (struct.isSetDict()) {
                struct.dict.write(tTupleProtocol);
            }
            if (struct.isSetDict_wiki()) {
                struct.dict_wiki.write(tTupleProtocol);
            }
            if (struct.isSetMedia()) {
                struct.media.write(tTupleProtocol);
            }
            if (struct.isSetSimilar_words()) {
                tTupleProtocol.writeI32(struct.similar_words.size());
                Iterator<SimilarWord> it = struct.similar_words.iterator();
                while (it.hasNext()) {
                    it.next().write(tTupleProtocol);
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TopicResourceV2TupleSchemeFactory implements SchemeFactory {
        private TopicResourceV2TupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public TopicResourceV2TupleScheme getScheme() {
            return new TopicResourceV2TupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ZPK_INFO(1, "zpk_info"),
        DICT(2, "dict"),
        DICT_WIKI(3, "dict_wiki"),
        MEDIA(4, l1.a.f62928f),
        SIMILAR_WORDS(5, "similar_words");

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
                return ZPK_INFO;
            }
            if (fieldId == 2) {
                return DICT;
            }
            if (fieldId == 3) {
                return DICT_WIKI;
            }
            if (fieldId == 4) {
                return MEDIA;
            }
            if (fieldId != 5) {
                return null;
            }
            return SIMILAR_WORDS;
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
        hashMap.put(StandardScheme.class, new TopicResourceV2StandardSchemeFactory());
        hashMap.put(TupleScheme.class, new TopicResourceV2TupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ZPK_INFO, (_Fields) new FieldMetaData("zpk_info", (byte) 2, new StructMetaData((byte) 12, ZpkInfo.class)));
        enumMap.put((EnumMap) _Fields.DICT, (_Fields) new FieldMetaData("dict", (byte) 2, new StructMetaData((byte) 12, WordDictV2.class)));
        enumMap.put((EnumMap) _Fields.DICT_WIKI, (_Fields) new FieldMetaData("dict_wiki", (byte) 2, new StructMetaData((byte) 12, DictWiki.class)));
        enumMap.put((EnumMap) _Fields.MEDIA, (_Fields) new FieldMetaData(l1.a.f62928f, (byte) 2, new StructMetaData((byte) 12, WordMedia.class)));
        enumMap.put((EnumMap) _Fields.SIMILAR_WORDS, (_Fields) new FieldMetaData("similar_words", (byte) 2, new ListMetaData((byte) 15, new StructMetaData((byte) 12, SimilarWord.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(TopicResourceV2.class, unmodifiableMap);
    }

    public TopicResourceV2() {
        this.optionals = new _Fields[]{_Fields.ZPK_INFO, _Fields.DICT, _Fields.DICT_WIKI, _Fields.MEDIA, _Fields.SIMILAR_WORDS};
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

    public void addToSimilar_words(SimilarWord elem) {
        if (this.similar_words == null) {
            this.similar_words = new ArrayList();
        }
        this.similar_words.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.zpk_info = null;
        this.dict = null;
        this.dict_wiki = null;
        this.media = null;
        this.similar_words = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof TopicResourceV2)) {
            return equals((TopicResourceV2) that);
        }
        return false;
    }

    public WordDictV2 getDict() {
        return this.dict;
    }

    public DictWiki getDict_wiki() {
        return this.dict_wiki;
    }

    public WordMedia getMedia() {
        return this.media;
    }

    public List<SimilarWord> getSimilar_words() {
        return this.similar_words;
    }

    public Iterator<SimilarWord> getSimilar_wordsIterator() {
        List<SimilarWord> list = this.similar_words;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getSimilar_wordsSize() {
        List<SimilarWord> list = this.similar_words;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public ZpkInfo getZpk_info() {
        return this.zpk_info;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetDict() {
        return this.dict != null;
    }

    public boolean isSetDict_wiki() {
        return this.dict_wiki != null;
    }

    public boolean isSetMedia() {
        return this.media != null;
    }

    public boolean isSetSimilar_words() {
        return this.similar_words != null;
    }

    public boolean isSetZpk_info() {
        return this.zpk_info != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public TopicResourceV2 setDict(WordDictV2 dict) {
        this.dict = dict;
        return this;
    }

    public void setDictIsSet(boolean value) {
        if (value) {
            return;
        }
        this.dict = null;
    }

    public TopicResourceV2 setDict_wiki(DictWiki dict_wiki) {
        this.dict_wiki = dict_wiki;
        return this;
    }

    public void setDict_wikiIsSet(boolean value) {
        if (value) {
            return;
        }
        this.dict_wiki = null;
    }

    public TopicResourceV2 setMedia(WordMedia media) {
        this.media = media;
        return this;
    }

    public void setMediaIsSet(boolean value) {
        if (value) {
            return;
        }
        this.media = null;
    }

    public TopicResourceV2 setSimilar_words(List<SimilarWord> similar_words) {
        this.similar_words = similar_words;
        return this;
    }

    public void setSimilar_wordsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.similar_words = null;
    }

    public TopicResourceV2 setZpk_info(ZpkInfo zpk_info) {
        this.zpk_info = zpk_info;
        return this;
    }

    public void setZpk_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.zpk_info = null;
    }

    public String toString() {
        boolean z11;
        StringBuilder sb2 = new StringBuilder("TopicResourceV2(");
        boolean z12 = false;
        if (isSetZpk_info()) {
            sb2.append("zpk_info:");
            ZpkInfo zpkInfo = this.zpk_info;
            if (zpkInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(zpkInfo);
            }
            z11 = false;
        } else {
            z11 = true;
        }
        if (isSetDict()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("dict:");
            WordDictV2 wordDictV2 = this.dict;
            if (wordDictV2 == null) {
                sb2.append("null");
            } else {
                sb2.append(wordDictV2);
            }
            z11 = false;
        }
        if (isSetDict_wiki()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("dict_wiki:");
            DictWiki dictWiki = this.dict_wiki;
            if (dictWiki == null) {
                sb2.append("null");
            } else {
                sb2.append(dictWiki);
            }
            z11 = false;
        }
        if (isSetMedia()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("media:");
            WordMedia wordMedia = this.media;
            if (wordMedia == null) {
                sb2.append("null");
            } else {
                sb2.append(wordMedia);
            }
        } else {
            z12 = z11;
        }
        if (isSetSimilar_words()) {
            if (!z12) {
                sb2.append(j2.O);
            }
            sb2.append("similar_words:");
            List<SimilarWord> list = this.similar_words;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetDict() {
        this.dict = null;
    }

    public void unsetDict_wiki() {
        this.dict_wiki = null;
    }

    public void unsetMedia() {
        this.media = null;
    }

    public void unsetSimilar_words() {
        this.similar_words = null;
    }

    public void unsetZpk_info() {
        this.zpk_info = null;
    }

    public void validate() throws TException {
        ZpkInfo zpkInfo = this.zpk_info;
        if (zpkInfo != null) {
            zpkInfo.validate();
        }
        WordDictV2 wordDictV2 = this.dict;
        if (wordDictV2 != null) {
            wordDictV2.validate();
        }
        DictWiki dictWiki = this.dict_wiki;
        if (dictWiki != null) {
            dictWiki.validate();
        }
        WordMedia wordMedia = this.media;
        if (wordMedia != null) {
            wordMedia.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(TopicResourceV2 other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo6 = Boolean.valueOf(isSetZpk_info()).compareTo(Boolean.valueOf(other.isSetZpk_info()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetZpk_info() && (compareTo5 = TBaseHelper.compareTo((Comparable) this.zpk_info, (Comparable) other.zpk_info)) != 0) {
            return compareTo5;
        }
        int compareTo7 = Boolean.valueOf(isSetDict()).compareTo(Boolean.valueOf(other.isSetDict()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetDict() && (compareTo4 = TBaseHelper.compareTo((Comparable) this.dict, (Comparable) other.dict)) != 0) {
            return compareTo4;
        }
        int compareTo8 = Boolean.valueOf(isSetDict_wiki()).compareTo(Boolean.valueOf(other.isSetDict_wiki()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetDict_wiki() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.dict_wiki, (Comparable) other.dict_wiki)) != 0) {
            return compareTo3;
        }
        int compareTo9 = Boolean.valueOf(isSetMedia()).compareTo(Boolean.valueOf(other.isSetMedia()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetMedia() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.media, (Comparable) other.media)) != 0) {
            return compareTo2;
        }
        int compareTo10 = Boolean.valueOf(isSetSimilar_words()).compareTo(Boolean.valueOf(other.isSetSimilar_words()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!isSetSimilar_words() || (compareTo = TBaseHelper.compareTo((List) this.similar_words, (List) other.similar_words)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<TopicResourceV2, _Fields> deepCopy2() {
        return new TopicResourceV2(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$TopicResourceV2$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getZpk_info();
        }
        if (i11 == 2) {
            return getDict();
        }
        if (i11 == 3) {
            return getDict_wiki();
        }
        if (i11 == 4) {
            return getMedia();
        }
        if (i11 == 5) {
            return getSimilar_words();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$TopicResourceV2$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetZpk_info();
        }
        if (i11 == 2) {
            return isSetDict();
        }
        if (i11 == 3) {
            return isSetDict_wiki();
        }
        if (i11 == 4) {
            return isSetMedia();
        }
        if (i11 == 5) {
            return isSetSimilar_words();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$TopicResourceV2$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetZpk_info();
                return;
            } else {
                setZpk_info((ZpkInfo) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetDict();
                return;
            } else {
                setDict((WordDictV2) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetDict_wiki();
                return;
            } else {
                setDict_wiki((DictWiki) value);
                return;
            }
        }
        if (i11 == 4) {
            if (value == null) {
                unsetMedia();
                return;
            } else {
                setMedia((WordMedia) value);
                return;
            }
        }
        if (i11 != 5) {
            return;
        }
        if (value == null) {
            unsetSimilar_words();
        } else {
            setSimilar_words((List) value);
        }
    }

    public TopicResourceV2(TopicResourceV2 other) {
        this.optionals = new _Fields[]{_Fields.ZPK_INFO, _Fields.DICT, _Fields.DICT_WIKI, _Fields.MEDIA, _Fields.SIMILAR_WORDS};
        if (other.isSetZpk_info()) {
            this.zpk_info = new ZpkInfo(other.zpk_info);
        }
        if (other.isSetDict()) {
            this.dict = new WordDictV2(other.dict);
        }
        if (other.isSetDict_wiki()) {
            this.dict_wiki = new DictWiki(other.dict_wiki);
        }
        if (other.isSetMedia()) {
            this.media = new WordMedia(other.media);
        }
        if (other.isSetSimilar_words()) {
            ArrayList arrayList = new ArrayList(other.similar_words.size());
            Iterator<SimilarWord> it = other.similar_words.iterator();
            while (it.hasNext()) {
                arrayList.add(new SimilarWord(it.next()));
            }
            this.similar_words = arrayList;
        }
    }

    public boolean equals(TopicResourceV2 that) {
        if (that == null) {
            return false;
        }
        boolean isSetZpk_info = isSetZpk_info();
        boolean isSetZpk_info2 = that.isSetZpk_info();
        if ((isSetZpk_info || isSetZpk_info2) && !(isSetZpk_info && isSetZpk_info2 && this.zpk_info.equals(that.zpk_info))) {
            return false;
        }
        boolean isSetDict = isSetDict();
        boolean isSetDict2 = that.isSetDict();
        if ((isSetDict || isSetDict2) && !(isSetDict && isSetDict2 && this.dict.equals(that.dict))) {
            return false;
        }
        boolean isSetDict_wiki = isSetDict_wiki();
        boolean isSetDict_wiki2 = that.isSetDict_wiki();
        if ((isSetDict_wiki || isSetDict_wiki2) && !(isSetDict_wiki && isSetDict_wiki2 && this.dict_wiki.equals(that.dict_wiki))) {
            return false;
        }
        boolean isSetMedia = isSetMedia();
        boolean isSetMedia2 = that.isSetMedia();
        if ((isSetMedia || isSetMedia2) && !(isSetMedia && isSetMedia2 && this.media.equals(that.media))) {
            return false;
        }
        boolean isSetSimilar_words = isSetSimilar_words();
        boolean isSetSimilar_words2 = that.isSetSimilar_words();
        if (isSetSimilar_words || isSetSimilar_words2) {
            return isSetSimilar_words && isSetSimilar_words2 && this.similar_words.equals(that.similar_words);
        }
        return true;
    }
}
