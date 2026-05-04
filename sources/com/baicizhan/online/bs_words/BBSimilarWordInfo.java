package com.baicizhan.online.bs_words;

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
public class BBSimilarWordInfo implements TBase<BBSimilarWordInfo, _Fields>, Serializable, Cloneable, Comparable<BBSimilarWordInfo> {
    private static final int __SIMILAR_WORD_BOOK_ID_ISSET_ID = 2;
    private static final int __SIMILAR_WORD_ID_ISSET_ID = 1;
    private static final int __TOPIC_ID_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    private _Fields[] optionals;
    public int similar_word_book_id;
    public int similar_word_id;
    public String tips;
    public int topic_id;
    public String word;
    private static final TStruct STRUCT_DESC = new TStruct("BBSimilarWordInfo");
    private static final TField TOPIC_ID_FIELD_DESC = new TField("topic_id", (byte) 8, 1);
    private static final TField SIMILAR_WORD_ID_FIELD_DESC = new TField("similar_word_id", (byte) 8, 2);
    private static final TField SIMILAR_WORD_BOOK_ID_FIELD_DESC = new TField("similar_word_book_id", (byte) 8, 3);
    private static final TField TIPS_FIELD_DESC = new TField("tips", (byte) 11, 4);
    private static final TField WORD_FIELD_DESC = new TField("word", (byte) 11, 5);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_words.BBSimilarWordInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_words$BBSimilarWordInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_words$BBSimilarWordInfo$_Fields = iArr;
            try {
                iArr[_Fields.TOPIC_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBSimilarWordInfo$_Fields[_Fields.SIMILAR_WORD_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBSimilarWordInfo$_Fields[_Fields.SIMILAR_WORD_BOOK_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBSimilarWordInfo$_Fields[_Fields.TIPS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBSimilarWordInfo$_Fields[_Fields.WORD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBSimilarWordInfoStandardScheme extends StandardScheme<BBSimilarWordInfo> {
        private BBSimilarWordInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BBSimilarWordInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    break;
                }
                short s11 = readFieldBegin.f77768id;
                if (s11 != 1) {
                    if (s11 != 2) {
                        if (s11 != 3) {
                            if (s11 != 4) {
                                if (s11 != 5) {
                                    TProtocolUtil.skip(iprot, b11);
                                } else if (b11 == 11) {
                                    struct.word = iprot.readString();
                                    struct.setWordIsSet(true);
                                } else {
                                    TProtocolUtil.skip(iprot, b11);
                                }
                            } else if (b11 == 11) {
                                struct.tips = iprot.readString();
                                struct.setTipsIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 8) {
                            struct.similar_word_book_id = iprot.readI32();
                            struct.setSimilar_word_book_idIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.similar_word_id = iprot.readI32();
                        struct.setSimilar_word_idIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.topic_id = iprot.readI32();
                    struct.setTopic_idIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetTopic_id()) {
                throw new TProtocolException("Required field 'topic_id' was not found in serialized data! Struct: " + toString());
            }
            if (!struct.isSetSimilar_word_id()) {
                throw new TProtocolException("Required field 'similar_word_id' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetSimilar_word_book_id()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'similar_word_book_id' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BBSimilarWordInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BBSimilarWordInfo.STRUCT_DESC);
            oprot.writeFieldBegin(BBSimilarWordInfo.TOPIC_ID_FIELD_DESC);
            oprot.writeI32(struct.topic_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(BBSimilarWordInfo.SIMILAR_WORD_ID_FIELD_DESC);
            oprot.writeI32(struct.similar_word_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(BBSimilarWordInfo.SIMILAR_WORD_BOOK_ID_FIELD_DESC);
            oprot.writeI32(struct.similar_word_book_id);
            oprot.writeFieldEnd();
            if (struct.tips != null) {
                oprot.writeFieldBegin(BBSimilarWordInfo.TIPS_FIELD_DESC);
                oprot.writeString(struct.tips);
                oprot.writeFieldEnd();
            }
            if (struct.word != null && struct.isSetWord()) {
                oprot.writeFieldBegin(BBSimilarWordInfo.WORD_FIELD_DESC);
                oprot.writeString(struct.word);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBSimilarWordInfoStandardSchemeFactory implements SchemeFactory {
        private BBSimilarWordInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBSimilarWordInfoStandardScheme getScheme() {
            return new BBSimilarWordInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBSimilarWordInfoTupleScheme extends TupleScheme<BBSimilarWordInfo> {
        private BBSimilarWordInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BBSimilarWordInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.topic_id = tTupleProtocol.readI32();
            struct.setTopic_idIsSet(true);
            struct.similar_word_id = tTupleProtocol.readI32();
            struct.setSimilar_word_idIsSet(true);
            struct.similar_word_book_id = tTupleProtocol.readI32();
            struct.setSimilar_word_book_idIsSet(true);
            struct.tips = tTupleProtocol.readString();
            struct.setTipsIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                struct.word = tTupleProtocol.readString();
                struct.setWordIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BBSimilarWordInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.topic_id);
            tTupleProtocol.writeI32(struct.similar_word_id);
            tTupleProtocol.writeI32(struct.similar_word_book_id);
            tTupleProtocol.writeString(struct.tips);
            BitSet bitSet = new BitSet();
            if (struct.isSetWord()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetWord()) {
                tTupleProtocol.writeString(struct.word);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBSimilarWordInfoTupleSchemeFactory implements SchemeFactory {
        private BBSimilarWordInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBSimilarWordInfoTupleScheme getScheme() {
            return new BBSimilarWordInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TOPIC_ID(1, "topic_id"),
        SIMILAR_WORD_ID(2, "similar_word_id"),
        SIMILAR_WORD_BOOK_ID(3, "similar_word_book_id"),
        TIPS(4, "tips"),
        WORD(5, "word");

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
                return TOPIC_ID;
            }
            if (fieldId == 2) {
                return SIMILAR_WORD_ID;
            }
            if (fieldId == 3) {
                return SIMILAR_WORD_BOOK_ID;
            }
            if (fieldId == 4) {
                return TIPS;
            }
            if (fieldId != 5) {
                return null;
            }
            return WORD;
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
        hashMap.put(StandardScheme.class, new BBSimilarWordInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BBSimilarWordInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TOPIC_ID, (_Fields) new FieldMetaData("topic_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.SIMILAR_WORD_ID, (_Fields) new FieldMetaData("similar_word_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.SIMILAR_WORD_BOOK_ID, (_Fields) new FieldMetaData("similar_word_book_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.TIPS, (_Fields) new FieldMetaData("tips", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.WORD, (_Fields) new FieldMetaData("word", (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BBSimilarWordInfo.class, unmodifiableMap);
    }

    public BBSimilarWordInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.WORD};
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
        setSimilar_word_idIsSet(false);
        this.similar_word_id = 0;
        setSimilar_word_book_idIsSet(false);
        this.similar_word_book_id = 0;
        this.tips = null;
        this.word = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BBSimilarWordInfo)) {
            return equals((BBSimilarWordInfo) that);
        }
        return false;
    }

    public int getSimilar_word_book_id() {
        return this.similar_word_book_id;
    }

    public int getSimilar_word_id() {
        return this.similar_word_id;
    }

    public String getTips() {
        return this.tips;
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

    public boolean isSetSimilar_word_book_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetSimilar_word_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetTips() {
        return this.tips != null;
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

    public BBSimilarWordInfo setSimilar_word_book_id(int similar_word_book_id) {
        this.similar_word_book_id = similar_word_book_id;
        setSimilar_word_book_idIsSet(true);
        return this;
    }

    public void setSimilar_word_book_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public BBSimilarWordInfo setSimilar_word_id(int similar_word_id) {
        this.similar_word_id = similar_word_id;
        setSimilar_word_idIsSet(true);
        return this;
    }

    public void setSimilar_word_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public BBSimilarWordInfo setTips(String tips) {
        this.tips = tips;
        return this;
    }

    public void setTipsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.tips = null;
    }

    public BBSimilarWordInfo setTopic_id(int topic_id) {
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        return this;
    }

    public void setTopic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public BBSimilarWordInfo setWord(String word) {
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
        StringBuilder sb2 = new StringBuilder("BBSimilarWordInfo(");
        sb2.append("topic_id:");
        sb2.append(this.topic_id);
        sb2.append(j2.O);
        sb2.append("similar_word_id:");
        sb2.append(this.similar_word_id);
        sb2.append(j2.O);
        sb2.append("similar_word_book_id:");
        sb2.append(this.similar_word_book_id);
        sb2.append(j2.O);
        sb2.append("tips:");
        String str = this.tips;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        if (isSetWord()) {
            sb2.append(j2.O);
            sb2.append("word:");
            String str2 = this.word;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetSimilar_word_book_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetSimilar_word_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetTips() {
        this.tips = null;
    }

    public void unsetTopic_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetWord() {
        this.word = null;
    }

    public void validate() throws TException {
        if (this.tips != null) {
            return;
        }
        throw new TProtocolException("Required field 'tips' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BBSimilarWordInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo6 = Boolean.valueOf(isSetTopic_id()).compareTo(Boolean.valueOf(other.isSetTopic_id()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetTopic_id() && (compareTo5 = TBaseHelper.compareTo(this.topic_id, other.topic_id)) != 0) {
            return compareTo5;
        }
        int compareTo7 = Boolean.valueOf(isSetSimilar_word_id()).compareTo(Boolean.valueOf(other.isSetSimilar_word_id()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetSimilar_word_id() && (compareTo4 = TBaseHelper.compareTo(this.similar_word_id, other.similar_word_id)) != 0) {
            return compareTo4;
        }
        int compareTo8 = Boolean.valueOf(isSetSimilar_word_book_id()).compareTo(Boolean.valueOf(other.isSetSimilar_word_book_id()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetSimilar_word_book_id() && (compareTo3 = TBaseHelper.compareTo(this.similar_word_book_id, other.similar_word_book_id)) != 0) {
            return compareTo3;
        }
        int compareTo9 = Boolean.valueOf(isSetTips()).compareTo(Boolean.valueOf(other.isSetTips()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetTips() && (compareTo2 = TBaseHelper.compareTo(this.tips, other.tips)) != 0) {
            return compareTo2;
        }
        int compareTo10 = Boolean.valueOf(isSetWord()).compareTo(Boolean.valueOf(other.isSetWord()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!isSetWord() || (compareTo = TBaseHelper.compareTo(this.word, other.word)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BBSimilarWordInfo, _Fields> deepCopy2() {
        return new BBSimilarWordInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBSimilarWordInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getTopic_id());
        }
        if (i11 == 2) {
            return Integer.valueOf(getSimilar_word_id());
        }
        if (i11 == 3) {
            return Integer.valueOf(getSimilar_word_book_id());
        }
        if (i11 == 4) {
            return getTips();
        }
        if (i11 == 5) {
            return getWord();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBSimilarWordInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetTopic_id();
        }
        if (i11 == 2) {
            return isSetSimilar_word_id();
        }
        if (i11 == 3) {
            return isSetSimilar_word_book_id();
        }
        if (i11 == 4) {
            return isSetTips();
        }
        if (i11 == 5) {
            return isSetWord();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBSimilarWordInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetTopic_id();
                return;
            } else {
                setTopic_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetSimilar_word_id();
                return;
            } else {
                setSimilar_word_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetSimilar_word_book_id();
                return;
            } else {
                setSimilar_word_book_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 4) {
            if (value == null) {
                unsetTips();
                return;
            } else {
                setTips((String) value);
                return;
            }
        }
        if (i11 != 5) {
            return;
        }
        if (value == null) {
            unsetWord();
        } else {
            setWord((String) value);
        }
    }

    public boolean equals(BBSimilarWordInfo that) {
        if (that == null || this.topic_id != that.topic_id || this.similar_word_id != that.similar_word_id || this.similar_word_book_id != that.similar_word_book_id) {
            return false;
        }
        boolean isSetTips = isSetTips();
        boolean isSetTips2 = that.isSetTips();
        if ((isSetTips || isSetTips2) && !(isSetTips && isSetTips2 && this.tips.equals(that.tips))) {
            return false;
        }
        boolean isSetWord = isSetWord();
        boolean isSetWord2 = that.isSetWord();
        if (isSetWord || isSetWord2) {
            return isSetWord && isSetWord2 && this.word.equals(that.word);
        }
        return true;
    }

    public BBSimilarWordInfo(int topic_id, int similar_word_id, int similar_word_book_id, String tips) {
        this();
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        this.similar_word_id = similar_word_id;
        setSimilar_word_idIsSet(true);
        this.similar_word_book_id = similar_word_book_id;
        setSimilar_word_book_idIsSet(true);
        this.tips = tips;
    }

    public BBSimilarWordInfo(BBSimilarWordInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.WORD};
        this.__isset_bitfield = other.__isset_bitfield;
        this.topic_id = other.topic_id;
        this.similar_word_id = other.similar_word_id;
        this.similar_word_book_id = other.similar_word_book_id;
        if (other.isSetTips()) {
            this.tips = other.tips;
        }
        if (other.isSetWord()) {
            this.word = other.word;
        }
    }
}
