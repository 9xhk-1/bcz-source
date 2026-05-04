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
public class SubmitRecordReq implements TBase<SubmitRecordReq, _Fields>, Serializable, Cloneable, Comparable<SubmitRecordReq> {
    private static final int __BOOK_ID_ISSET_ID = 1;
    private static final int __LOCAL_VERSION_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int book_id;
    public long local_version;
    public List<StudyRecordItem> words;
    private static final TStruct STRUCT_DESC = new TStruct("SubmitRecordReq");
    private static final TField LOCAL_VERSION_FIELD_DESC = new TField("local_version", (byte) 10, 1);
    private static final TField BOOK_ID_FIELD_DESC = new TField("book_id", (byte) 8, 2);
    private static final TField WORDS_FIELD_DESC = new TField(xd.a.f98002r, (byte) 15, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.SubmitRecordReq$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$SubmitRecordReq$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$SubmitRecordReq$_Fields = iArr;
            try {
                iArr[_Fields.LOCAL_VERSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$SubmitRecordReq$_Fields[_Fields.BOOK_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$SubmitRecordReq$_Fields[_Fields.WORDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SubmitRecordReqStandardScheme extends StandardScheme<SubmitRecordReq> {
        private SubmitRecordReqStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, SubmitRecordReq struct) throws TException {
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
                                StudyRecordItem studyRecordItem = new StudyRecordItem();
                                studyRecordItem.read(iprot);
                                struct.words.add(studyRecordItem);
                            }
                            iprot.readListEnd();
                            struct.setWordsIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.book_id = iprot.readI32();
                        struct.setBook_idIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 10) {
                    struct.local_version = iprot.readI64();
                    struct.setLocal_versionIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetLocal_version()) {
                throw new TProtocolException("Required field 'local_version' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetBook_id()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'book_id' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, SubmitRecordReq struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(SubmitRecordReq.STRUCT_DESC);
            oprot.writeFieldBegin(SubmitRecordReq.LOCAL_VERSION_FIELD_DESC);
            oprot.writeI64(struct.local_version);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(SubmitRecordReq.BOOK_ID_FIELD_DESC);
            oprot.writeI32(struct.book_id);
            oprot.writeFieldEnd();
            if (struct.words != null) {
                oprot.writeFieldBegin(SubmitRecordReq.WORDS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.words.size()));
                Iterator<StudyRecordItem> it = struct.words.iterator();
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
    public static class SubmitRecordReqStandardSchemeFactory implements SchemeFactory {
        private SubmitRecordReqStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SubmitRecordReqStandardScheme getScheme() {
            return new SubmitRecordReqStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SubmitRecordReqTupleScheme extends TupleScheme<SubmitRecordReq> {
        private SubmitRecordReqTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, SubmitRecordReq struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.local_version = tTupleProtocol.readI64();
            struct.setLocal_versionIsSet(true);
            struct.book_id = tTupleProtocol.readI32();
            struct.setBook_idIsSet(true);
            TList tList = new TList((byte) 12, tTupleProtocol.readI32());
            struct.words = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                StudyRecordItem studyRecordItem = new StudyRecordItem();
                studyRecordItem.read(tTupleProtocol);
                struct.words.add(studyRecordItem);
            }
            struct.setWordsIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, SubmitRecordReq struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI64(struct.local_version);
            tTupleProtocol.writeI32(struct.book_id);
            tTupleProtocol.writeI32(struct.words.size());
            Iterator<StudyRecordItem> it = struct.words.iterator();
            while (it.hasNext()) {
                it.next().write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SubmitRecordReqTupleSchemeFactory implements SchemeFactory {
        private SubmitRecordReqTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SubmitRecordReqTupleScheme getScheme() {
            return new SubmitRecordReqTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        LOCAL_VERSION(1, "local_version"),
        BOOK_ID(2, "book_id"),
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
                return LOCAL_VERSION;
            }
            if (fieldId == 2) {
                return BOOK_ID;
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
        hashMap.put(StandardScheme.class, new SubmitRecordReqStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new SubmitRecordReqTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.LOCAL_VERSION, (_Fields) new FieldMetaData("local_version", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.BOOK_ID, (_Fields) new FieldMetaData("book_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.WORDS, (_Fields) new FieldMetaData(xd.a.f98002r, (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, StudyRecordItem.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(SubmitRecordReq.class, unmodifiableMap);
    }

    public SubmitRecordReq() {
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

    public void addToWords(StudyRecordItem elem) {
        if (this.words == null) {
            this.words = new ArrayList();
        }
        this.words.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        setLocal_versionIsSet(false);
        this.local_version = 0L;
        setBook_idIsSet(false);
        this.book_id = 0;
        this.words = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof SubmitRecordReq)) {
            return equals((SubmitRecordReq) that);
        }
        return false;
    }

    public int getBook_id() {
        return this.book_id;
    }

    public long getLocal_version() {
        return this.local_version;
    }

    public List<StudyRecordItem> getWords() {
        return this.words;
    }

    public Iterator<StudyRecordItem> getWordsIterator() {
        List<StudyRecordItem> list = this.words;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getWordsSize() {
        List<StudyRecordItem> list = this.words;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetBook_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetLocal_version() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetWords() {
        return this.words != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public SubmitRecordReq setBook_id(int book_id) {
        this.book_id = book_id;
        setBook_idIsSet(true);
        return this;
    }

    public void setBook_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public SubmitRecordReq setLocal_version(long local_version) {
        this.local_version = local_version;
        setLocal_versionIsSet(true);
        return this;
    }

    public void setLocal_versionIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public SubmitRecordReq setWords(List<StudyRecordItem> words) {
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
        StringBuilder sb2 = new StringBuilder("SubmitRecordReq(");
        sb2.append("local_version:");
        sb2.append(this.local_version);
        sb2.append(j2.O);
        sb2.append("book_id:");
        sb2.append(this.book_id);
        sb2.append(j2.O);
        sb2.append("words:");
        List<StudyRecordItem> list = this.words;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetBook_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetLocal_version() {
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
    public int compareTo(SubmitRecordReq other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetLocal_version()).compareTo(Boolean.valueOf(other.isSetLocal_version()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetLocal_version() && (compareTo3 = TBaseHelper.compareTo(this.local_version, other.local_version)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetBook_id()).compareTo(Boolean.valueOf(other.isSetBook_id()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetBook_id() && (compareTo2 = TBaseHelper.compareTo(this.book_id, other.book_id)) != 0) {
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
    public TBase<SubmitRecordReq, _Fields> deepCopy2() {
        return new SubmitRecordReq(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$SubmitRecordReq$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Long.valueOf(getLocal_version());
        }
        if (i11 == 2) {
            return Integer.valueOf(getBook_id());
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
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$SubmitRecordReq$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetLocal_version();
        }
        if (i11 == 2) {
            return isSetBook_id();
        }
        if (i11 == 3) {
            return isSetWords();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$SubmitRecordReq$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetLocal_version();
                return;
            } else {
                setLocal_version(((Long) value).longValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetBook_id();
                return;
            } else {
                setBook_id(((Integer) value).intValue());
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

    public SubmitRecordReq(long local_version, int book_id, List<StudyRecordItem> words) {
        this();
        this.local_version = local_version;
        setLocal_versionIsSet(true);
        this.book_id = book_id;
        setBook_idIsSet(true);
        this.words = words;
    }

    public boolean equals(SubmitRecordReq that) {
        if (that == null || this.local_version != that.local_version || this.book_id != that.book_id) {
            return false;
        }
        boolean isSetWords = isSetWords();
        boolean isSetWords2 = that.isSetWords();
        if (isSetWords || isSetWords2) {
            return isSetWords && isSetWords2 && this.words.equals(that.words);
        }
        return true;
    }

    public SubmitRecordReq(SubmitRecordReq other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.local_version = other.local_version;
        this.book_id = other.book_id;
        if (other.isSetWords()) {
            ArrayList arrayList = new ArrayList(other.words.size());
            Iterator<StudyRecordItem> it = other.words.iterator();
            while (it.hasNext()) {
                arrayList.add(new StudyRecordItem(it.next()));
            }
            this.words = arrayList;
        }
    }
}
