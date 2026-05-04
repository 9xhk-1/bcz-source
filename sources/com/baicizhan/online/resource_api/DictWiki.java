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
public class DictWiki implements TBase<DictWiki, _Fields>, Serializable, Cloneable, Comparable<DictWiki> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public WordDictV2 dict;
    private _Fields[] optionals;
    public String origin_word;
    public String variant_type;
    private static final TStruct STRUCT_DESC = new TStruct("DictWiki");
    private static final TField DICT_FIELD_DESC = new TField("dict", (byte) 12, 1);
    private static final TField ORIGIN_WORD_FIELD_DESC = new TField("origin_word", (byte) 11, 2);
    private static final TField VARIANT_TYPE_FIELD_DESC = new TField("variant_type", (byte) 11, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.resource_api.DictWiki$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$DictWiki$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$DictWiki$_Fields = iArr;
            try {
                iArr[_Fields.DICT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$DictWiki$_Fields[_Fields.ORIGIN_WORD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$DictWiki$_Fields[_Fields.VARIANT_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DictWikiStandardScheme extends StandardScheme<DictWiki> {
        private DictWikiStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, DictWiki struct) throws TException {
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
                            TProtocolUtil.skip(iprot, b11);
                        } else if (b11 == 11) {
                            struct.variant_type = iprot.readString();
                            struct.setVariant_typeIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.origin_word = iprot.readString();
                        struct.setOrigin_wordIsSet(true);
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
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, DictWiki struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(DictWiki.STRUCT_DESC);
            if (struct.dict != null) {
                oprot.writeFieldBegin(DictWiki.DICT_FIELD_DESC);
                struct.dict.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.origin_word != null && struct.isSetOrigin_word()) {
                oprot.writeFieldBegin(DictWiki.ORIGIN_WORD_FIELD_DESC);
                oprot.writeString(struct.origin_word);
                oprot.writeFieldEnd();
            }
            if (struct.variant_type != null && struct.isSetVariant_type()) {
                oprot.writeFieldBegin(DictWiki.VARIANT_TYPE_FIELD_DESC);
                oprot.writeString(struct.variant_type);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DictWikiStandardSchemeFactory implements SchemeFactory {
        private DictWikiStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public DictWikiStandardScheme getScheme() {
            return new DictWikiStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DictWikiTupleScheme extends TupleScheme<DictWiki> {
        private DictWikiTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, DictWiki struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            WordDictV2 wordDictV2 = new WordDictV2();
            struct.dict = wordDictV2;
            wordDictV2.read(tTupleProtocol);
            struct.setDictIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(2);
            if (readBitSet.get(0)) {
                struct.origin_word = tTupleProtocol.readString();
                struct.setOrigin_wordIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.variant_type = tTupleProtocol.readString();
                struct.setVariant_typeIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, DictWiki struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.dict.write(tTupleProtocol);
            BitSet bitSet = new BitSet();
            if (struct.isSetOrigin_word()) {
                bitSet.set(0);
            }
            if (struct.isSetVariant_type()) {
                bitSet.set(1);
            }
            tTupleProtocol.writeBitSet(bitSet, 2);
            if (struct.isSetOrigin_word()) {
                tTupleProtocol.writeString(struct.origin_word);
            }
            if (struct.isSetVariant_type()) {
                tTupleProtocol.writeString(struct.variant_type);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DictWikiTupleSchemeFactory implements SchemeFactory {
        private DictWikiTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public DictWikiTupleScheme getScheme() {
            return new DictWikiTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        DICT(1, "dict"),
        ORIGIN_WORD(2, "origin_word"),
        VARIANT_TYPE(3, "variant_type");

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
                return DICT;
            }
            if (fieldId == 2) {
                return ORIGIN_WORD;
            }
            if (fieldId != 3) {
                return null;
            }
            return VARIANT_TYPE;
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
        hashMap.put(StandardScheme.class, new DictWikiStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new DictWikiTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.DICT, (_Fields) new FieldMetaData("dict", (byte) 1, new StructMetaData((byte) 12, WordDictV2.class)));
        enumMap.put((EnumMap) _Fields.ORIGIN_WORD, (_Fields) new FieldMetaData("origin_word", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.VARIANT_TYPE, (_Fields) new FieldMetaData("variant_type", (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(DictWiki.class, unmodifiableMap);
    }

    public DictWiki() {
        this.optionals = new _Fields[]{_Fields.ORIGIN_WORD, _Fields.VARIANT_TYPE};
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
        this.dict = null;
        this.origin_word = null;
        this.variant_type = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof DictWiki)) {
            return equals((DictWiki) that);
        }
        return false;
    }

    public WordDictV2 getDict() {
        return this.dict;
    }

    public String getOrigin_word() {
        return this.origin_word;
    }

    public String getVariant_type() {
        return this.variant_type;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetDict() {
        return this.dict != null;
    }

    public boolean isSetOrigin_word() {
        return this.origin_word != null;
    }

    public boolean isSetVariant_type() {
        return this.variant_type != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public DictWiki setDict(WordDictV2 dict) {
        this.dict = dict;
        return this;
    }

    public void setDictIsSet(boolean value) {
        if (value) {
            return;
        }
        this.dict = null;
    }

    public DictWiki setOrigin_word(String origin_word) {
        this.origin_word = origin_word;
        return this;
    }

    public void setOrigin_wordIsSet(boolean value) {
        if (value) {
            return;
        }
        this.origin_word = null;
    }

    public DictWiki setVariant_type(String variant_type) {
        this.variant_type = variant_type;
        return this;
    }

    public void setVariant_typeIsSet(boolean value) {
        if (value) {
            return;
        }
        this.variant_type = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DictWiki(");
        sb2.append("dict:");
        WordDictV2 wordDictV2 = this.dict;
        if (wordDictV2 == null) {
            sb2.append("null");
        } else {
            sb2.append(wordDictV2);
        }
        if (isSetOrigin_word()) {
            sb2.append(j2.O);
            sb2.append("origin_word:");
            String str = this.origin_word;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
        }
        if (isSetVariant_type()) {
            sb2.append(j2.O);
            sb2.append("variant_type:");
            String str2 = this.variant_type;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetDict() {
        this.dict = null;
    }

    public void unsetOrigin_word() {
        this.origin_word = null;
    }

    public void unsetVariant_type() {
        this.variant_type = null;
    }

    public void validate() throws TException {
        WordDictV2 wordDictV2 = this.dict;
        if (wordDictV2 != null) {
            if (wordDictV2 != null) {
                wordDictV2.validate();
            }
        } else {
            throw new TProtocolException("Required field 'dict' was not present! Struct: " + toString());
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(DictWiki other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetDict()).compareTo(Boolean.valueOf(other.isSetDict()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetDict() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.dict, (Comparable) other.dict)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetOrigin_word()).compareTo(Boolean.valueOf(other.isSetOrigin_word()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetOrigin_word() && (compareTo2 = TBaseHelper.compareTo(this.origin_word, other.origin_word)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetVariant_type()).compareTo(Boolean.valueOf(other.isSetVariant_type()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetVariant_type() || (compareTo = TBaseHelper.compareTo(this.variant_type, other.variant_type)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<DictWiki, _Fields> deepCopy2() {
        return new DictWiki(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$DictWiki$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getDict();
        }
        if (i11 == 2) {
            return getOrigin_word();
        }
        if (i11 == 3) {
            return getVariant_type();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$DictWiki$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetDict();
        }
        if (i11 == 2) {
            return isSetOrigin_word();
        }
        if (i11 == 3) {
            return isSetVariant_type();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$DictWiki$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetDict();
                return;
            } else {
                setDict((WordDictV2) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetOrigin_word();
                return;
            } else {
                setOrigin_word((String) value);
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetVariant_type();
        } else {
            setVariant_type((String) value);
        }
    }

    public DictWiki(WordDictV2 dict) {
        this();
        this.dict = dict;
    }

    public boolean equals(DictWiki that) {
        if (that == null) {
            return false;
        }
        boolean isSetDict = isSetDict();
        boolean isSetDict2 = that.isSetDict();
        if ((isSetDict || isSetDict2) && !(isSetDict && isSetDict2 && this.dict.equals(that.dict))) {
            return false;
        }
        boolean isSetOrigin_word = isSetOrigin_word();
        boolean isSetOrigin_word2 = that.isSetOrigin_word();
        if ((isSetOrigin_word || isSetOrigin_word2) && !(isSetOrigin_word && isSetOrigin_word2 && this.origin_word.equals(that.origin_word))) {
            return false;
        }
        boolean isSetVariant_type = isSetVariant_type();
        boolean isSetVariant_type2 = that.isSetVariant_type();
        if (isSetVariant_type || isSetVariant_type2) {
            return isSetVariant_type && isSetVariant_type2 && this.variant_type.equals(that.variant_type);
        }
        return true;
    }

    public DictWiki(DictWiki other) {
        this.optionals = new _Fields[]{_Fields.ORIGIN_WORD, _Fields.VARIANT_TYPE};
        if (other.isSetDict()) {
            this.dict = new WordDictV2(other.dict);
        }
        if (other.isSetOrigin_word()) {
            this.origin_word = other.origin_word;
        }
        if (other.isSetVariant_type()) {
            this.variant_type = other.variant_type;
        }
    }
}
