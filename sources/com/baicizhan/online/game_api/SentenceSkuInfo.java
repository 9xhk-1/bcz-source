package com.baicizhan.online.game_api;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.thrift.EncodingUtils;
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
public class SentenceSkuInfo implements TBase<SentenceSkuInfo, _Fields>, Serializable, Cloneable, Comparable<SentenceSkuInfo> {
    private static final int __LANGUAGETYPE_ISSET_ID = 1;
    private static final int __SKUID_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public List<SentenceChapter> chapters;
    public int languageType;
    public List<SentenceLesson> lessons;
    public int skuId;
    public String version;
    private static final TStruct STRUCT_DESC = new TStruct("SentenceSkuInfo");
    private static final TField SKU_ID_FIELD_DESC = new TField("skuId", (byte) 8, 1);
    private static final TField CHAPTERS_FIELD_DESC = new TField("chapters", (byte) 15, 2);
    private static final TField LESSONS_FIELD_DESC = new TField("lessons", (byte) 15, 3);
    private static final TField VERSION_FIELD_DESC = new TField("version", (byte) 11, 4);
    private static final TField LANGUAGE_TYPE_FIELD_DESC = new TField("languageType", (byte) 8, 5);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.SentenceSkuInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$SentenceSkuInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$SentenceSkuInfo$_Fields = iArr;
            try {
                iArr[_Fields.SKU_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$SentenceSkuInfo$_Fields[_Fields.CHAPTERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$SentenceSkuInfo$_Fields[_Fields.LESSONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$SentenceSkuInfo$_Fields[_Fields.VERSION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$SentenceSkuInfo$_Fields[_Fields.LANGUAGE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SentenceSkuInfoStandardScheme extends StandardScheme<SentenceSkuInfo> {
        private SentenceSkuInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, SentenceSkuInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    break;
                }
                short s11 = readFieldBegin.f77768id;
                if (s11 != 1) {
                    int i11 = 0;
                    if (s11 != 2) {
                        if (s11 != 3) {
                            if (s11 != 4) {
                                if (s11 != 5) {
                                    TProtocolUtil.skip(iprot, b11);
                                } else if (b11 == 8) {
                                    struct.languageType = iprot.readI32();
                                    struct.setLanguageTypeIsSet(true);
                                } else {
                                    TProtocolUtil.skip(iprot, b11);
                                }
                            } else if (b11 == 11) {
                                struct.version = iprot.readString();
                                struct.setVersionIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 15) {
                            TList readListBegin = iprot.readListBegin();
                            struct.lessons = new ArrayList(readListBegin.size);
                            while (i11 < readListBegin.size) {
                                SentenceLesson sentenceLesson = new SentenceLesson();
                                sentenceLesson.read(iprot);
                                struct.lessons.add(sentenceLesson);
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setLessonsIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 15) {
                        TList readListBegin2 = iprot.readListBegin();
                        struct.chapters = new ArrayList(readListBegin2.size);
                        while (i11 < readListBegin2.size) {
                            SentenceChapter sentenceChapter = new SentenceChapter();
                            sentenceChapter.read(iprot);
                            struct.chapters.add(sentenceChapter);
                            i11++;
                        }
                        iprot.readListEnd();
                        struct.setChaptersIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.skuId = iprot.readI32();
                    struct.setSkuIdIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetSkuId()) {
                throw new TProtocolException("Required field 'skuId' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetLanguageType()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'languageType' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, SentenceSkuInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(SentenceSkuInfo.STRUCT_DESC);
            oprot.writeFieldBegin(SentenceSkuInfo.SKU_ID_FIELD_DESC);
            oprot.writeI32(struct.skuId);
            oprot.writeFieldEnd();
            if (struct.chapters != null) {
                oprot.writeFieldBegin(SentenceSkuInfo.CHAPTERS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.chapters.size()));
                Iterator<SentenceChapter> it = struct.chapters.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.lessons != null) {
                oprot.writeFieldBegin(SentenceSkuInfo.LESSONS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.lessons.size()));
                Iterator<SentenceLesson> it2 = struct.lessons.iterator();
                while (it2.hasNext()) {
                    it2.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.version != null) {
                oprot.writeFieldBegin(SentenceSkuInfo.VERSION_FIELD_DESC);
                oprot.writeString(struct.version);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(SentenceSkuInfo.LANGUAGE_TYPE_FIELD_DESC);
            oprot.writeI32(struct.languageType);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SentenceSkuInfoStandardSchemeFactory implements SchemeFactory {
        private SentenceSkuInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SentenceSkuInfoStandardScheme getScheme() {
            return new SentenceSkuInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SentenceSkuInfoTupleScheme extends TupleScheme<SentenceSkuInfo> {
        private SentenceSkuInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, SentenceSkuInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.skuId = tTupleProtocol.readI32();
            struct.setSkuIdIsSet(true);
            TList tList = new TList((byte) 12, tTupleProtocol.readI32());
            struct.chapters = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                SentenceChapter sentenceChapter = new SentenceChapter();
                sentenceChapter.read(tTupleProtocol);
                struct.chapters.add(sentenceChapter);
            }
            struct.setChaptersIsSet(true);
            TList tList2 = new TList((byte) 12, tTupleProtocol.readI32());
            struct.lessons = new ArrayList(tList2.size);
            for (int i12 = 0; i12 < tList2.size; i12++) {
                SentenceLesson sentenceLesson = new SentenceLesson();
                sentenceLesson.read(tTupleProtocol);
                struct.lessons.add(sentenceLesson);
            }
            struct.setLessonsIsSet(true);
            struct.version = tTupleProtocol.readString();
            struct.setVersionIsSet(true);
            struct.languageType = tTupleProtocol.readI32();
            struct.setLanguageTypeIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, SentenceSkuInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.skuId);
            tTupleProtocol.writeI32(struct.chapters.size());
            Iterator<SentenceChapter> it = struct.chapters.iterator();
            while (it.hasNext()) {
                it.next().write(tTupleProtocol);
            }
            tTupleProtocol.writeI32(struct.lessons.size());
            Iterator<SentenceLesson> it2 = struct.lessons.iterator();
            while (it2.hasNext()) {
                it2.next().write(tTupleProtocol);
            }
            tTupleProtocol.writeString(struct.version);
            tTupleProtocol.writeI32(struct.languageType);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SentenceSkuInfoTupleSchemeFactory implements SchemeFactory {
        private SentenceSkuInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SentenceSkuInfoTupleScheme getScheme() {
            return new SentenceSkuInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        SKU_ID(1, "skuId"),
        CHAPTERS(2, "chapters"),
        LESSONS(3, "lessons"),
        VERSION(4, "version"),
        LANGUAGE_TYPE(5, "languageType");

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
                return SKU_ID;
            }
            if (fieldId == 2) {
                return CHAPTERS;
            }
            if (fieldId == 3) {
                return LESSONS;
            }
            if (fieldId == 4) {
                return VERSION;
            }
            if (fieldId != 5) {
                return null;
            }
            return LANGUAGE_TYPE;
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
        hashMap.put(StandardScheme.class, new SentenceSkuInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new SentenceSkuInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.SKU_ID, (_Fields) new FieldMetaData("skuId", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.CHAPTERS, (_Fields) new FieldMetaData("chapters", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, SentenceChapter.class))));
        enumMap.put((EnumMap) _Fields.LESSONS, (_Fields) new FieldMetaData("lessons", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, SentenceLesson.class))));
        enumMap.put((EnumMap) _Fields.VERSION, (_Fields) new FieldMetaData("version", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.LANGUAGE_TYPE, (_Fields) new FieldMetaData("languageType", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(SentenceSkuInfo.class, unmodifiableMap);
    }

    public SentenceSkuInfo() {
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

    public void addToChapters(SentenceChapter elem) {
        if (this.chapters == null) {
            this.chapters = new ArrayList();
        }
        this.chapters.add(elem);
    }

    public void addToLessons(SentenceLesson elem) {
        if (this.lessons == null) {
            this.lessons = new ArrayList();
        }
        this.lessons.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        setSkuIdIsSet(false);
        this.skuId = 0;
        this.chapters = null;
        this.lessons = null;
        this.version = null;
        setLanguageTypeIsSet(false);
        this.languageType = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof SentenceSkuInfo)) {
            return equals((SentenceSkuInfo) that);
        }
        return false;
    }

    public List<SentenceChapter> getChapters() {
        return this.chapters;
    }

    public Iterator<SentenceChapter> getChaptersIterator() {
        List<SentenceChapter> list = this.chapters;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getChaptersSize() {
        List<SentenceChapter> list = this.chapters;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int getLanguageType() {
        return this.languageType;
    }

    public List<SentenceLesson> getLessons() {
        return this.lessons;
    }

    public Iterator<SentenceLesson> getLessonsIterator() {
        List<SentenceLesson> list = this.lessons;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getLessonsSize() {
        List<SentenceLesson> list = this.lessons;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int getSkuId() {
        return this.skuId;
    }

    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetChapters() {
        return this.chapters != null;
    }

    public boolean isSetLanguageType() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetLessons() {
        return this.lessons != null;
    }

    public boolean isSetSkuId() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetVersion() {
        return this.version != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public SentenceSkuInfo setChapters(List<SentenceChapter> chapters) {
        this.chapters = chapters;
        return this;
    }

    public void setChaptersIsSet(boolean value) {
        if (value) {
            return;
        }
        this.chapters = null;
    }

    public SentenceSkuInfo setLanguageType(int languageType) {
        this.languageType = languageType;
        setLanguageTypeIsSet(true);
        return this;
    }

    public void setLanguageTypeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public SentenceSkuInfo setLessons(List<SentenceLesson> lessons) {
        this.lessons = lessons;
        return this;
    }

    public void setLessonsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.lessons = null;
    }

    public SentenceSkuInfo setSkuId(int skuId) {
        this.skuId = skuId;
        setSkuIdIsSet(true);
        return this;
    }

    public void setSkuIdIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public SentenceSkuInfo setVersion(String version) {
        this.version = version;
        return this;
    }

    public void setVersionIsSet(boolean value) {
        if (value) {
            return;
        }
        this.version = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SentenceSkuInfo(");
        sb2.append("skuId:");
        sb2.append(this.skuId);
        sb2.append(j2.O);
        sb2.append("chapters:");
        List<SentenceChapter> list = this.chapters;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(j2.O);
        sb2.append("lessons:");
        List<SentenceLesson> list2 = this.lessons;
        if (list2 == null) {
            sb2.append("null");
        } else {
            sb2.append(list2);
        }
        sb2.append(j2.O);
        sb2.append("version:");
        String str = this.version;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("languageType:");
        sb2.append(this.languageType);
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetChapters() {
        this.chapters = null;
    }

    public void unsetLanguageType() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetLessons() {
        this.lessons = null;
    }

    public void unsetSkuId() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetVersion() {
        this.version = null;
    }

    public void validate() throws TException {
        if (this.chapters == null) {
            throw new TProtocolException("Required field 'chapters' was not present! Struct: " + toString());
        }
        if (this.lessons == null) {
            throw new TProtocolException("Required field 'lessons' was not present! Struct: " + toString());
        }
        if (this.version != null) {
            return;
        }
        throw new TProtocolException("Required field 'version' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(SentenceSkuInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo6 = Boolean.valueOf(isSetSkuId()).compareTo(Boolean.valueOf(other.isSetSkuId()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetSkuId() && (compareTo5 = TBaseHelper.compareTo(this.skuId, other.skuId)) != 0) {
            return compareTo5;
        }
        int compareTo7 = Boolean.valueOf(isSetChapters()).compareTo(Boolean.valueOf(other.isSetChapters()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetChapters() && (compareTo4 = TBaseHelper.compareTo((List) this.chapters, (List) other.chapters)) != 0) {
            return compareTo4;
        }
        int compareTo8 = Boolean.valueOf(isSetLessons()).compareTo(Boolean.valueOf(other.isSetLessons()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetLessons() && (compareTo3 = TBaseHelper.compareTo((List) this.lessons, (List) other.lessons)) != 0) {
            return compareTo3;
        }
        int compareTo9 = Boolean.valueOf(isSetVersion()).compareTo(Boolean.valueOf(other.isSetVersion()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetVersion() && (compareTo2 = TBaseHelper.compareTo(this.version, other.version)) != 0) {
            return compareTo2;
        }
        int compareTo10 = Boolean.valueOf(isSetLanguageType()).compareTo(Boolean.valueOf(other.isSetLanguageType()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!isSetLanguageType() || (compareTo = TBaseHelper.compareTo(this.languageType, other.languageType)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<SentenceSkuInfo, _Fields> deepCopy2() {
        return new SentenceSkuInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$SentenceSkuInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getSkuId());
        }
        if (i11 == 2) {
            return getChapters();
        }
        if (i11 == 3) {
            return getLessons();
        }
        if (i11 == 4) {
            return getVersion();
        }
        if (i11 == 5) {
            return Integer.valueOf(getLanguageType());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$SentenceSkuInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetSkuId();
        }
        if (i11 == 2) {
            return isSetChapters();
        }
        if (i11 == 3) {
            return isSetLessons();
        }
        if (i11 == 4) {
            return isSetVersion();
        }
        if (i11 == 5) {
            return isSetLanguageType();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$SentenceSkuInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetSkuId();
                return;
            } else {
                setSkuId(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetChapters();
                return;
            } else {
                setChapters((List) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetLessons();
                return;
            } else {
                setLessons((List) value);
                return;
            }
        }
        if (i11 == 4) {
            if (value == null) {
                unsetVersion();
                return;
            } else {
                setVersion((String) value);
                return;
            }
        }
        if (i11 != 5) {
            return;
        }
        if (value == null) {
            unsetLanguageType();
        } else {
            setLanguageType(((Integer) value).intValue());
        }
    }

    public SentenceSkuInfo(int skuId, List<SentenceChapter> chapters, List<SentenceLesson> lessons, String version, int languageType) {
        this();
        this.skuId = skuId;
        setSkuIdIsSet(true);
        this.chapters = chapters;
        this.lessons = lessons;
        this.version = version;
        this.languageType = languageType;
        setLanguageTypeIsSet(true);
    }

    public boolean equals(SentenceSkuInfo that) {
        if (that == null || this.skuId != that.skuId) {
            return false;
        }
        boolean isSetChapters = isSetChapters();
        boolean isSetChapters2 = that.isSetChapters();
        if ((isSetChapters || isSetChapters2) && !(isSetChapters && isSetChapters2 && this.chapters.equals(that.chapters))) {
            return false;
        }
        boolean isSetLessons = isSetLessons();
        boolean isSetLessons2 = that.isSetLessons();
        if ((isSetLessons || isSetLessons2) && !(isSetLessons && isSetLessons2 && this.lessons.equals(that.lessons))) {
            return false;
        }
        boolean isSetVersion = isSetVersion();
        boolean isSetVersion2 = that.isSetVersion();
        return (!(isSetVersion || isSetVersion2) || (isSetVersion && isSetVersion2 && this.version.equals(that.version))) && this.languageType == that.languageType;
    }

    public SentenceSkuInfo(SentenceSkuInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.skuId = other.skuId;
        if (other.isSetChapters()) {
            ArrayList arrayList = new ArrayList(other.chapters.size());
            Iterator<SentenceChapter> it = other.chapters.iterator();
            while (it.hasNext()) {
                arrayList.add(new SentenceChapter(it.next()));
            }
            this.chapters = arrayList;
        }
        if (other.isSetLessons()) {
            ArrayList arrayList2 = new ArrayList(other.lessons.size());
            Iterator<SentenceLesson> it2 = other.lessons.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new SentenceLesson(it2.next()));
            }
            this.lessons = arrayList2;
        }
        if (other.isSetVersion()) {
            this.version = other.version;
        }
        this.languageType = other.languageType;
    }
}
