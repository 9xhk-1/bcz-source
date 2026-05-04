package com.baicizhan.online.user_activity_api;

import com.baicizhan.main.collectreview.ui.CollectReviewActivity;
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
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class ExportParam implements TBase<ExportParam, _Fields>, Serializable, Cloneable, Comparable<ExportParam> {
    private static final int __TEMPLATE_ID_ISSET_ID = 1;
    private static final int __USER_BOOK_ID_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int template_id;
    public long user_book_id;
    public List<ExportWord> words;
    private static final TStruct STRUCT_DESC = new TStruct("ExportParam");
    private static final TField USER_BOOK_ID_FIELD_DESC = new TField(CollectReviewActivity.G, (byte) 10, 1);
    private static final TField TEMPLATE_ID_FIELD_DESC = new TField("template_id", (byte) 8, 2);
    private static final TField WORDS_FIELD_DESC = new TField(xd.a.f98002r, (byte) 15, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_activity_api.ExportParam$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_activity_api$ExportParam$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_activity_api$ExportParam$_Fields = iArr;
            try {
                iArr[_Fields.USER_BOOK_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_activity_api$ExportParam$_Fields[_Fields.TEMPLATE_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_activity_api$ExportParam$_Fields[_Fields.WORDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ExportParamStandardScheme extends StandardScheme<ExportParam> {
        private ExportParamStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, ExportParam struct) throws TException {
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
                            TProtocolUtil.skip(iprot, b11);
                        } else if (b11 == 15) {
                            TList readListBegin = iprot.readListBegin();
                            struct.words = new ArrayList(readListBegin.size);
                            for (int i11 = 0; i11 < readListBegin.size; i11++) {
                                ExportWord exportWord = new ExportWord();
                                exportWord.read(iprot);
                                struct.words.add(exportWord);
                            }
                            iprot.readListEnd();
                            struct.setWordsIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.template_id = iprot.readI32();
                        struct.setTemplate_idIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 10) {
                    struct.user_book_id = iprot.readI64();
                    struct.setUser_book_idIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetUser_book_id()) {
                throw new TProtocolException("Required field 'user_book_id' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetTemplate_id()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'template_id' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, ExportParam struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(ExportParam.STRUCT_DESC);
            oprot.writeFieldBegin(ExportParam.USER_BOOK_ID_FIELD_DESC);
            oprot.writeI64(struct.user_book_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(ExportParam.TEMPLATE_ID_FIELD_DESC);
            oprot.writeI32(struct.template_id);
            oprot.writeFieldEnd();
            if (struct.words != null) {
                oprot.writeFieldBegin(ExportParam.WORDS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.words.size()));
                Iterator<ExportWord> it = struct.words.iterator();
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
    public static class ExportParamStandardSchemeFactory implements SchemeFactory {
        private ExportParamStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ExportParamStandardScheme getScheme() {
            return new ExportParamStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ExportParamTupleScheme extends TupleScheme<ExportParam> {
        private ExportParamTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, ExportParam struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.user_book_id = tTupleProtocol.readI64();
            struct.setUser_book_idIsSet(true);
            struct.template_id = tTupleProtocol.readI32();
            struct.setTemplate_idIsSet(true);
            TList tList = new TList((byte) 12, tTupleProtocol.readI32());
            struct.words = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                ExportWord exportWord = new ExportWord();
                exportWord.read(tTupleProtocol);
                struct.words.add(exportWord);
            }
            struct.setWordsIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, ExportParam struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI64(struct.user_book_id);
            tTupleProtocol.writeI32(struct.template_id);
            tTupleProtocol.writeI32(struct.words.size());
            Iterator<ExportWord> it = struct.words.iterator();
            while (it.hasNext()) {
                it.next().write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ExportParamTupleSchemeFactory implements SchemeFactory {
        private ExportParamTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ExportParamTupleScheme getScheme() {
            return new ExportParamTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        USER_BOOK_ID(1, CollectReviewActivity.G),
        TEMPLATE_ID(2, "template_id"),
        WORDS(3, xd.a.f98002r);

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
                return USER_BOOK_ID;
            }
            if (fieldId == 2) {
                return TEMPLATE_ID;
            }
            if (fieldId != 3) {
                return null;
            }
            return WORDS;
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
        hashMap.put(StandardScheme.class, new ExportParamStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new ExportParamTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.USER_BOOK_ID, (_Fields) new FieldMetaData(CollectReviewActivity.G, (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.TEMPLATE_ID, (_Fields) new FieldMetaData("template_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.WORDS, (_Fields) new FieldMetaData(xd.a.f98002r, (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, ExportWord.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(ExportParam.class, unmodifiableMap);
    }

    public ExportParam() {
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

    public void addToWords(ExportWord elem) {
        if (this.words == null) {
            this.words = new ArrayList();
        }
        this.words.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        setUser_book_idIsSet(false);
        this.user_book_id = 0L;
        setTemplate_idIsSet(false);
        this.template_id = 0;
        this.words = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof ExportParam)) {
            return equals((ExportParam) that);
        }
        return false;
    }

    public int getTemplate_id() {
        return this.template_id;
    }

    public long getUser_book_id() {
        return this.user_book_id;
    }

    public List<ExportWord> getWords() {
        return this.words;
    }

    public Iterator<ExportWord> getWordsIterator() {
        List<ExportWord> list = this.words;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getWordsSize() {
        List<ExportWord> list = this.words;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetTemplate_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetUser_book_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetWords() {
        return this.words != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public ExportParam setTemplate_id(int template_id) {
        this.template_id = template_id;
        setTemplate_idIsSet(true);
        return this;
    }

    public void setTemplate_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public ExportParam setUser_book_id(long user_book_id) {
        this.user_book_id = user_book_id;
        setUser_book_idIsSet(true);
        return this;
    }

    public void setUser_book_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public ExportParam setWords(List<ExportWord> words) {
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
        StringBuilder sb2 = new StringBuilder("ExportParam(");
        sb2.append("user_book_id:");
        sb2.append(this.user_book_id);
        sb2.append(j2.O);
        sb2.append("template_id:");
        sb2.append(this.template_id);
        sb2.append(j2.O);
        sb2.append("words:");
        List<ExportWord> list = this.words;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(j.f81007d);
        return sb2.toString();
    }

    public void unsetTemplate_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetUser_book_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetWords() {
        this.words = null;
    }

    public void validate() throws TException {
        if (this.words != null) {
            return;
        }
        throw new TProtocolException("Required field 'words' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(ExportParam other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetUser_book_id()).compareTo(Boolean.valueOf(other.isSetUser_book_id()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetUser_book_id() && (compareTo3 = TBaseHelper.compareTo(this.user_book_id, other.user_book_id)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetTemplate_id()).compareTo(Boolean.valueOf(other.isSetTemplate_id()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetTemplate_id() && (compareTo2 = TBaseHelper.compareTo(this.template_id, other.template_id)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetWords()).compareTo(Boolean.valueOf(other.isSetWords()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetWords() || (compareTo = TBaseHelper.compareTo((List) this.words, (List) other.words)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<ExportParam, _Fields> deepCopy2() {
        return new ExportParam(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_activity_api$ExportParam$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Long.valueOf(getUser_book_id());
        }
        if (i11 == 2) {
            return Integer.valueOf(getTemplate_id());
        }
        if (i11 == 3) {
            return getWords();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_activity_api$ExportParam$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetUser_book_id();
        }
        if (i11 == 2) {
            return isSetTemplate_id();
        }
        if (i11 == 3) {
            return isSetWords();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_activity_api$ExportParam$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetUser_book_id();
                return;
            } else {
                setUser_book_id(((Long) value).longValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetTemplate_id();
                return;
            } else {
                setTemplate_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetWords();
        } else {
            setWords((List) value);
        }
    }

    public ExportParam(long user_book_id, int template_id, List<ExportWord> words) {
        this();
        this.user_book_id = user_book_id;
        setUser_book_idIsSet(true);
        this.template_id = template_id;
        setTemplate_idIsSet(true);
        this.words = words;
    }

    public boolean equals(ExportParam that) {
        if (that == null || this.user_book_id != that.user_book_id || this.template_id != that.template_id) {
            return false;
        }
        boolean isSetWords = isSetWords();
        boolean isSetWords2 = that.isSetWords();
        if (isSetWords || isSetWords2) {
            return isSetWords && isSetWords2 && this.words.equals(that.words);
        }
        return true;
    }

    public ExportParam(ExportParam other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.user_book_id = other.user_book_id;
        this.template_id = other.template_id;
        if (other.isSetWords()) {
            ArrayList arrayList = new ArrayList(other.words.size());
            Iterator<ExportWord> it = other.words.iterator();
            while (it.hasNext()) {
                arrayList.add(new ExportWord(it.next()));
            }
            this.words = arrayList;
        }
    }
}
