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
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TBase;
import org.apache.thrift.TBaseHelper;
import org.apache.thrift.TException;
import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.meta_data.EnumMetaData;
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
public class TransResultV2 implements TBase<TransResultV2, _Fields>, Serializable, Cloneable, Comparable<TransResultV2> {
    private static final int __TRANS_PROVIDER_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    private _Fields[] optionals;
    public String trans;
    public int trans_provider;
    public TransResultType type;
    public List<SearchWordResultV2> words;
    private static final TStruct STRUCT_DESC = new TStruct("TransResultV2");
    private static final TField TYPE_FIELD_DESC = new TField("type", (byte) 8, 1);
    private static final TField TRANS_FIELD_DESC = new TField("trans", (byte) 11, 2);
    private static final TField WORDS_FIELD_DESC = new TField(xd.a.f98002r, (byte) 15, 3);
    private static final TField TRANS_PROVIDER_FIELD_DESC = new TField("trans_provider", (byte) 8, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.resource_api.TransResultV2$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$TransResultV2$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$TransResultV2$_Fields = iArr;
            try {
                iArr[_Fields.TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$TransResultV2$_Fields[_Fields.TRANS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$TransResultV2$_Fields[_Fields.WORDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$TransResultV2$_Fields[_Fields.TRANS_PROVIDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TransResultV2StandardScheme extends StandardScheme<TransResultV2> {
        private TransResultV2StandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, TransResultV2 struct) throws TException {
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
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 8) {
                                struct.trans_provider = iprot.readI32();
                                struct.setTrans_providerIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 15) {
                            TList readListBegin = iprot.readListBegin();
                            struct.words = new ArrayList(readListBegin.size);
                            for (int i11 = 0; i11 < readListBegin.size; i11++) {
                                SearchWordResultV2 searchWordResultV2 = new SearchWordResultV2();
                                searchWordResultV2.read(iprot);
                                struct.words.add(searchWordResultV2);
                            }
                            iprot.readListEnd();
                            struct.setWordsIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.trans = iprot.readString();
                        struct.setTransIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.type = TransResultType.findByValue(iprot.readI32());
                    struct.setTypeIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, TransResultV2 struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(TransResultV2.STRUCT_DESC);
            if (struct.type != null) {
                oprot.writeFieldBegin(TransResultV2.TYPE_FIELD_DESC);
                oprot.writeI32(struct.type.getValue());
                oprot.writeFieldEnd();
            }
            if (struct.trans != null && struct.isSetTrans()) {
                oprot.writeFieldBegin(TransResultV2.TRANS_FIELD_DESC);
                oprot.writeString(struct.trans);
                oprot.writeFieldEnd();
            }
            if (struct.words != null && struct.isSetWords()) {
                oprot.writeFieldBegin(TransResultV2.WORDS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.words.size()));
                Iterator<SearchWordResultV2> it = struct.words.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.isSetTrans_provider()) {
                oprot.writeFieldBegin(TransResultV2.TRANS_PROVIDER_FIELD_DESC);
                oprot.writeI32(struct.trans_provider);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TransResultV2StandardSchemeFactory implements SchemeFactory {
        private TransResultV2StandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public TransResultV2StandardScheme getScheme() {
            return new TransResultV2StandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TransResultV2TupleScheme extends TupleScheme<TransResultV2> {
        private TransResultV2TupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, TransResultV2 struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.type = TransResultType.findByValue(tTupleProtocol.readI32());
            struct.setTypeIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(3);
            if (readBitSet.get(0)) {
                struct.trans = tTupleProtocol.readString();
                struct.setTransIsSet(true);
            }
            if (readBitSet.get(1)) {
                TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                struct.words = new ArrayList(tList.size);
                for (int i11 = 0; i11 < tList.size; i11++) {
                    SearchWordResultV2 searchWordResultV2 = new SearchWordResultV2();
                    searchWordResultV2.read(tTupleProtocol);
                    struct.words.add(searchWordResultV2);
                }
                struct.setWordsIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.trans_provider = tTupleProtocol.readI32();
                struct.setTrans_providerIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, TransResultV2 struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.type.getValue());
            BitSet bitSet = new BitSet();
            if (struct.isSetTrans()) {
                bitSet.set(0);
            }
            if (struct.isSetWords()) {
                bitSet.set(1);
            }
            if (struct.isSetTrans_provider()) {
                bitSet.set(2);
            }
            tTupleProtocol.writeBitSet(bitSet, 3);
            if (struct.isSetTrans()) {
                tTupleProtocol.writeString(struct.trans);
            }
            if (struct.isSetWords()) {
                tTupleProtocol.writeI32(struct.words.size());
                Iterator<SearchWordResultV2> it = struct.words.iterator();
                while (it.hasNext()) {
                    it.next().write(tTupleProtocol);
                }
            }
            if (struct.isSetTrans_provider()) {
                tTupleProtocol.writeI32(struct.trans_provider);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TransResultV2TupleSchemeFactory implements SchemeFactory {
        private TransResultV2TupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public TransResultV2TupleScheme getScheme() {
            return new TransResultV2TupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TYPE(1, "type"),
        TRANS(2, "trans"),
        WORDS(3, xd.a.f98002r),
        TRANS_PROVIDER(4, "trans_provider");

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
                return TYPE;
            }
            if (fieldId == 2) {
                return TRANS;
            }
            if (fieldId == 3) {
                return WORDS;
            }
            if (fieldId != 4) {
                return null;
            }
            return TRANS_PROVIDER;
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
        hashMap.put(StandardScheme.class, new TransResultV2StandardSchemeFactory());
        hashMap.put(TupleScheme.class, new TransResultV2TupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TYPE, (_Fields) new FieldMetaData("type", (byte) 1, new EnumMetaData((byte) 16, TransResultType.class)));
        enumMap.put((EnumMap) _Fields.TRANS, (_Fields) new FieldMetaData("trans", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.WORDS, (_Fields) new FieldMetaData(xd.a.f98002r, (byte) 2, new ListMetaData((byte) 15, new StructMetaData((byte) 12, SearchWordResultV2.class))));
        enumMap.put((EnumMap) _Fields.TRANS_PROVIDER, (_Fields) new FieldMetaData("trans_provider", (byte) 2, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(TransResultV2.class, unmodifiableMap);
    }

    public TransResultV2() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.TRANS, _Fields.WORDS, _Fields.TRANS_PROVIDER};
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

    public void addToWords(SearchWordResultV2 elem) {
        if (this.words == null) {
            this.words = new ArrayList();
        }
        this.words.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.type = null;
        this.trans = null;
        this.words = null;
        setTrans_providerIsSet(false);
        this.trans_provider = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof TransResultV2)) {
            return equals((TransResultV2) that);
        }
        return false;
    }

    public String getTrans() {
        return this.trans;
    }

    public int getTrans_provider() {
        return this.trans_provider;
    }

    public TransResultType getType() {
        return this.type;
    }

    public List<SearchWordResultV2> getWords() {
        return this.words;
    }

    public Iterator<SearchWordResultV2> getWordsIterator() {
        List<SearchWordResultV2> list = this.words;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getWordsSize() {
        List<SearchWordResultV2> list = this.words;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetTrans() {
        return this.trans != null;
    }

    public boolean isSetTrans_provider() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetType() {
        return this.type != null;
    }

    public boolean isSetWords() {
        return this.words != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public TransResultV2 setTrans(String trans) {
        this.trans = trans;
        return this;
    }

    public void setTransIsSet(boolean value) {
        if (value) {
            return;
        }
        this.trans = null;
    }

    public TransResultV2 setTrans_provider(int trans_provider) {
        this.trans_provider = trans_provider;
        setTrans_providerIsSet(true);
        return this;
    }

    public void setTrans_providerIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public TransResultV2 setType(TransResultType type) {
        this.type = type;
        return this;
    }

    public void setTypeIsSet(boolean value) {
        if (value) {
            return;
        }
        this.type = null;
    }

    public TransResultV2 setWords(List<SearchWordResultV2> words) {
        this.words = words;
        return this;
    }

    public void setWordsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.words = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TransResultV2(");
        sb2.append("type:");
        TransResultType transResultType = this.type;
        if (transResultType == null) {
            sb2.append("null");
        } else {
            sb2.append(transResultType);
        }
        if (isSetTrans()) {
            sb2.append(j2.O);
            sb2.append("trans:");
            String str = this.trans;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
        }
        if (isSetWords()) {
            sb2.append(j2.O);
            sb2.append("words:");
            List<SearchWordResultV2> list = this.words;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
        }
        if (isSetTrans_provider()) {
            sb2.append(j2.O);
            sb2.append("trans_provider:");
            sb2.append(this.trans_provider);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetTrans() {
        this.trans = null;
    }

    public void unsetTrans_provider() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetType() {
        this.type = null;
    }

    public void unsetWords() {
        this.words = null;
    }

    public void validate() throws TException {
        if (this.type != null) {
            return;
        }
        throw new TProtocolException("Required field 'type' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(TransResultV2 other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetType()).compareTo(Boolean.valueOf(other.isSetType()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetType() && (compareTo4 = TBaseHelper.compareTo((Comparable) this.type, (Comparable) other.type)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetTrans()).compareTo(Boolean.valueOf(other.isSetTrans()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetTrans() && (compareTo3 = TBaseHelper.compareTo(this.trans, other.trans)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetWords()).compareTo(Boolean.valueOf(other.isSetWords()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetWords() && (compareTo2 = TBaseHelper.compareTo((List) this.words, (List) other.words)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetTrans_provider()).compareTo(Boolean.valueOf(other.isSetTrans_provider()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetTrans_provider() || (compareTo = TBaseHelper.compareTo(this.trans_provider, other.trans_provider)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<TransResultV2, _Fields> deepCopy2() {
        return new TransResultV2(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$TransResultV2$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getType();
        }
        if (i11 == 2) {
            return getTrans();
        }
        if (i11 == 3) {
            return getWords();
        }
        if (i11 == 4) {
            return Integer.valueOf(getTrans_provider());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$TransResultV2$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetType();
        }
        if (i11 == 2) {
            return isSetTrans();
        }
        if (i11 == 3) {
            return isSetWords();
        }
        if (i11 == 4) {
            return isSetTrans_provider();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$TransResultV2$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetType();
                return;
            } else {
                setType((TransResultType) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetTrans();
                return;
            } else {
                setTrans((String) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetWords();
                return;
            } else {
                setWords((List) value);
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetTrans_provider();
        } else {
            setTrans_provider(((Integer) value).intValue());
        }
    }

    public boolean equals(TransResultV2 that) {
        if (that == null) {
            return false;
        }
        boolean isSetType = isSetType();
        boolean isSetType2 = that.isSetType();
        if ((isSetType || isSetType2) && !(isSetType && isSetType2 && this.type.equals(that.type))) {
            return false;
        }
        boolean isSetTrans = isSetTrans();
        boolean isSetTrans2 = that.isSetTrans();
        if ((isSetTrans || isSetTrans2) && !(isSetTrans && isSetTrans2 && this.trans.equals(that.trans))) {
            return false;
        }
        boolean isSetWords = isSetWords();
        boolean isSetWords2 = that.isSetWords();
        if ((isSetWords || isSetWords2) && !(isSetWords && isSetWords2 && this.words.equals(that.words))) {
            return false;
        }
        boolean isSetTrans_provider = isSetTrans_provider();
        boolean isSetTrans_provider2 = that.isSetTrans_provider();
        if (isSetTrans_provider || isSetTrans_provider2) {
            return isSetTrans_provider && isSetTrans_provider2 && this.trans_provider == that.trans_provider;
        }
        return true;
    }

    public TransResultV2(TransResultType type) {
        this();
        this.type = type;
    }

    public TransResultV2(TransResultV2 other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.TRANS, _Fields.WORDS, _Fields.TRANS_PROVIDER};
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetType()) {
            this.type = other.type;
        }
        if (other.isSetTrans()) {
            this.trans = other.trans;
        }
        if (other.isSetWords()) {
            ArrayList arrayList = new ArrayList(other.words.size());
            Iterator<SearchWordResultV2> it = other.words.iterator();
            while (it.hasNext()) {
                arrayList.add(new SearchWordResultV2(it.next()));
            }
            this.words = arrayList;
        }
        this.trans_provider = other.trans_provider;
    }
}
