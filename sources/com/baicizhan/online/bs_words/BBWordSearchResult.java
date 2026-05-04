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
public class BBWordSearchResult implements TBase<BBWordSearchResult, _Fields>, Serializable, Cloneable, Comparable<BBWordSearchResult> {
    private static final int __TOPIC_ID_ISSET_ID = 0;
    private static final int __WORD_LEVEL_ID_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String accent;
    public String mean_cn;
    private _Fields[] optionals;
    public int topic_id;
    public String word;
    public int word_level_id;
    private static final TStruct STRUCT_DESC = new TStruct("BBWordSearchResult");
    private static final TField WORD_FIELD_DESC = new TField("word", (byte) 11, 1);
    private static final TField TOPIC_ID_FIELD_DESC = new TField("topic_id", (byte) 8, 2);
    private static final TField WORD_LEVEL_ID_FIELD_DESC = new TField(ma.b.f72894c, (byte) 8, 3);
    private static final TField MEAN_CN_FIELD_DESC = new TField(a.e.C0246a.f16184d, (byte) 11, 4);
    private static final TField ACCENT_FIELD_DESC = new TField("accent", (byte) 11, 5);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_words.BBWordSearchResult$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_words$BBWordSearchResult$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_words$BBWordSearchResult$_Fields = iArr;
            try {
                iArr[_Fields.WORD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBWordSearchResult$_Fields[_Fields.TOPIC_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBWordSearchResult$_Fields[_Fields.WORD_LEVEL_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBWordSearchResult$_Fields[_Fields.MEAN_CN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBWordSearchResult$_Fields[_Fields.ACCENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBWordSearchResultStandardScheme extends StandardScheme<BBWordSearchResult> {
        private BBWordSearchResultStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BBWordSearchResult struct) throws TException {
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
                                    struct.accent = iprot.readString();
                                    struct.setAccentIsSet(true);
                                } else {
                                    TProtocolUtil.skip(iprot, b11);
                                }
                            } else if (b11 == 11) {
                                struct.mean_cn = iprot.readString();
                                struct.setMean_cnIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 8) {
                            struct.word_level_id = iprot.readI32();
                            struct.setWord_level_idIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.topic_id = iprot.readI32();
                        struct.setTopic_idIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.word = iprot.readString();
                    struct.setWordIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetTopic_id()) {
                throw new TProtocolException("Required field 'topic_id' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetWord_level_id()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'word_level_id' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BBWordSearchResult struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BBWordSearchResult.STRUCT_DESC);
            if (struct.word != null) {
                oprot.writeFieldBegin(BBWordSearchResult.WORD_FIELD_DESC);
                oprot.writeString(struct.word);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(BBWordSearchResult.TOPIC_ID_FIELD_DESC);
            oprot.writeI32(struct.topic_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(BBWordSearchResult.WORD_LEVEL_ID_FIELD_DESC);
            oprot.writeI32(struct.word_level_id);
            oprot.writeFieldEnd();
            if (struct.mean_cn != null) {
                oprot.writeFieldBegin(BBWordSearchResult.MEAN_CN_FIELD_DESC);
                oprot.writeString(struct.mean_cn);
                oprot.writeFieldEnd();
            }
            if (struct.accent != null && struct.isSetAccent()) {
                oprot.writeFieldBegin(BBWordSearchResult.ACCENT_FIELD_DESC);
                oprot.writeString(struct.accent);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBWordSearchResultStandardSchemeFactory implements SchemeFactory {
        private BBWordSearchResultStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBWordSearchResultStandardScheme getScheme() {
            return new BBWordSearchResultStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBWordSearchResultTupleScheme extends TupleScheme<BBWordSearchResult> {
        private BBWordSearchResultTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BBWordSearchResult struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.word = tTupleProtocol.readString();
            struct.setWordIsSet(true);
            struct.topic_id = tTupleProtocol.readI32();
            struct.setTopic_idIsSet(true);
            struct.word_level_id = tTupleProtocol.readI32();
            struct.setWord_level_idIsSet(true);
            struct.mean_cn = tTupleProtocol.readString();
            struct.setMean_cnIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                struct.accent = tTupleProtocol.readString();
                struct.setAccentIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BBWordSearchResult struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.word);
            tTupleProtocol.writeI32(struct.topic_id);
            tTupleProtocol.writeI32(struct.word_level_id);
            tTupleProtocol.writeString(struct.mean_cn);
            BitSet bitSet = new BitSet();
            if (struct.isSetAccent()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetAccent()) {
                tTupleProtocol.writeString(struct.accent);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBWordSearchResultTupleSchemeFactory implements SchemeFactory {
        private BBWordSearchResultTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBWordSearchResultTupleScheme getScheme() {
            return new BBWordSearchResultTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        WORD(1, "word"),
        TOPIC_ID(2, "topic_id"),
        WORD_LEVEL_ID(3, ma.b.f72894c),
        MEAN_CN(4, a.e.C0246a.f16184d),
        ACCENT(5, "accent");

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
                return WORD;
            }
            if (fieldId == 2) {
                return TOPIC_ID;
            }
            if (fieldId == 3) {
                return WORD_LEVEL_ID;
            }
            if (fieldId == 4) {
                return MEAN_CN;
            }
            if (fieldId != 5) {
                return null;
            }
            return ACCENT;
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
        hashMap.put(StandardScheme.class, new BBWordSearchResultStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BBWordSearchResultTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.WORD, (_Fields) new FieldMetaData("word", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.TOPIC_ID, (_Fields) new FieldMetaData("topic_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.WORD_LEVEL_ID, (_Fields) new FieldMetaData(ma.b.f72894c, (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.MEAN_CN, (_Fields) new FieldMetaData(a.e.C0246a.f16184d, (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ACCENT, (_Fields) new FieldMetaData("accent", (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BBWordSearchResult.class, unmodifiableMap);
    }

    public BBWordSearchResult() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.ACCENT};
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
        this.word = null;
        setTopic_idIsSet(false);
        this.topic_id = 0;
        setWord_level_idIsSet(false);
        this.word_level_id = 0;
        this.mean_cn = null;
        this.accent = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BBWordSearchResult)) {
            return equals((BBWordSearchResult) that);
        }
        return false;
    }

    public String getAccent() {
        return this.accent;
    }

    public String getMean_cn() {
        return this.mean_cn;
    }

    public int getTopic_id() {
        return this.topic_id;
    }

    public String getWord() {
        return this.word;
    }

    public int getWord_level_id() {
        return this.word_level_id;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAccent() {
        return this.accent != null;
    }

    public boolean isSetMean_cn() {
        return this.mean_cn != null;
    }

    public boolean isSetTopic_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetWord() {
        return this.word != null;
    }

    public boolean isSetWord_level_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BBWordSearchResult setAccent(String accent) {
        this.accent = accent;
        return this;
    }

    public void setAccentIsSet(boolean value) {
        if (value) {
            return;
        }
        this.accent = null;
    }

    public BBWordSearchResult setMean_cn(String mean_cn) {
        this.mean_cn = mean_cn;
        return this;
    }

    public void setMean_cnIsSet(boolean value) {
        if (value) {
            return;
        }
        this.mean_cn = null;
    }

    public BBWordSearchResult setTopic_id(int topic_id) {
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        return this;
    }

    public void setTopic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public BBWordSearchResult setWord(String word) {
        this.word = word;
        return this;
    }

    public void setWordIsSet(boolean value) {
        if (value) {
            return;
        }
        this.word = null;
    }

    public BBWordSearchResult setWord_level_id(int word_level_id) {
        this.word_level_id = word_level_id;
        setWord_level_idIsSet(true);
        return this;
    }

    public void setWord_level_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BBWordSearchResult(");
        sb2.append("word:");
        String str = this.word;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("topic_id:");
        sb2.append(this.topic_id);
        sb2.append(j2.O);
        sb2.append("word_level_id:");
        sb2.append(this.word_level_id);
        sb2.append(j2.O);
        sb2.append("mean_cn:");
        String str2 = this.mean_cn;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        if (isSetAccent()) {
            sb2.append(j2.O);
            sb2.append("accent:");
            String str3 = this.accent;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAccent() {
        this.accent = null;
    }

    public void unsetMean_cn() {
        this.mean_cn = null;
    }

    public void unsetTopic_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetWord() {
        this.word = null;
    }

    public void unsetWord_level_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void validate() throws TException {
        if (this.word == null) {
            throw new TProtocolException("Required field 'word' was not present! Struct: " + toString());
        }
        if (this.mean_cn != null) {
            return;
        }
        throw new TProtocolException("Required field 'mean_cn' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BBWordSearchResult other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo6 = Boolean.valueOf(isSetWord()).compareTo(Boolean.valueOf(other.isSetWord()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetWord() && (compareTo5 = TBaseHelper.compareTo(this.word, other.word)) != 0) {
            return compareTo5;
        }
        int compareTo7 = Boolean.valueOf(isSetTopic_id()).compareTo(Boolean.valueOf(other.isSetTopic_id()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetTopic_id() && (compareTo4 = TBaseHelper.compareTo(this.topic_id, other.topic_id)) != 0) {
            return compareTo4;
        }
        int compareTo8 = Boolean.valueOf(isSetWord_level_id()).compareTo(Boolean.valueOf(other.isSetWord_level_id()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetWord_level_id() && (compareTo3 = TBaseHelper.compareTo(this.word_level_id, other.word_level_id)) != 0) {
            return compareTo3;
        }
        int compareTo9 = Boolean.valueOf(isSetMean_cn()).compareTo(Boolean.valueOf(other.isSetMean_cn()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetMean_cn() && (compareTo2 = TBaseHelper.compareTo(this.mean_cn, other.mean_cn)) != 0) {
            return compareTo2;
        }
        int compareTo10 = Boolean.valueOf(isSetAccent()).compareTo(Boolean.valueOf(other.isSetAccent()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!isSetAccent() || (compareTo = TBaseHelper.compareTo(this.accent, other.accent)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BBWordSearchResult, _Fields> deepCopy2() {
        return new BBWordSearchResult(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBWordSearchResult$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getWord();
        }
        if (i11 == 2) {
            return Integer.valueOf(getTopic_id());
        }
        if (i11 == 3) {
            return Integer.valueOf(getWord_level_id());
        }
        if (i11 == 4) {
            return getMean_cn();
        }
        if (i11 == 5) {
            return getAccent();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBWordSearchResult$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetWord();
        }
        if (i11 == 2) {
            return isSetTopic_id();
        }
        if (i11 == 3) {
            return isSetWord_level_id();
        }
        if (i11 == 4) {
            return isSetMean_cn();
        }
        if (i11 == 5) {
            return isSetAccent();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBWordSearchResult$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetWord();
                return;
            } else {
                setWord((String) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetTopic_id();
                return;
            } else {
                setTopic_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetWord_level_id();
                return;
            } else {
                setWord_level_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 4) {
            if (value == null) {
                unsetMean_cn();
                return;
            } else {
                setMean_cn((String) value);
                return;
            }
        }
        if (i11 != 5) {
            return;
        }
        if (value == null) {
            unsetAccent();
        } else {
            setAccent((String) value);
        }
    }

    public boolean equals(BBWordSearchResult that) {
        if (that == null) {
            return false;
        }
        boolean isSetWord = isSetWord();
        boolean isSetWord2 = that.isSetWord();
        if (((isSetWord || isSetWord2) && (!isSetWord || !isSetWord2 || !this.word.equals(that.word))) || this.topic_id != that.topic_id || this.word_level_id != that.word_level_id) {
            return false;
        }
        boolean isSetMean_cn = isSetMean_cn();
        boolean isSetMean_cn2 = that.isSetMean_cn();
        if ((isSetMean_cn || isSetMean_cn2) && !(isSetMean_cn && isSetMean_cn2 && this.mean_cn.equals(that.mean_cn))) {
            return false;
        }
        boolean isSetAccent = isSetAccent();
        boolean isSetAccent2 = that.isSetAccent();
        if (isSetAccent || isSetAccent2) {
            return isSetAccent && isSetAccent2 && this.accent.equals(that.accent);
        }
        return true;
    }

    public BBWordSearchResult(String word, int topic_id, int word_level_id, String mean_cn) {
        this();
        this.word = word;
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        this.word_level_id = word_level_id;
        setWord_level_idIsSet(true);
        this.mean_cn = mean_cn;
    }

    public BBWordSearchResult(BBWordSearchResult other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.ACCENT};
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetWord()) {
            this.word = other.word;
        }
        this.topic_id = other.topic_id;
        this.word_level_id = other.word_level_id;
        if (other.isSetMean_cn()) {
            this.mean_cn = other.mean_cn;
        }
        if (other.isSetAccent()) {
            this.accent = other.accent;
        }
    }
}
