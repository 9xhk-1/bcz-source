package com.baicizhan.online.user_book;

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
/* loaded from: classes6.dex */
public class AddWordsRsp implements TBase<AddWordsRsp, _Fields>, Serializable, Cloneable, Comparable<AddWordsRsp> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public UserBookItem book_info;
    public List<UserBookWordDetail> words;
    private static final TStruct STRUCT_DESC = new TStruct("AddWordsRsp");
    private static final TField BOOK_INFO_FIELD_DESC = new TField("book_info", (byte) 12, 1);
    private static final TField WORDS_FIELD_DESC = new TField(xd.a.f98002r, (byte) 15, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_book.AddWordsRsp$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_book$AddWordsRsp$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_book$AddWordsRsp$_Fields = iArr;
            try {
                iArr[_Fields.BOOK_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_book$AddWordsRsp$_Fields[_Fields.WORDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AddWordsRspStandardScheme extends StandardScheme<AddWordsRsp> {
        private AddWordsRspStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, AddWordsRsp struct) throws TException {
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
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 15) {
                        TList readListBegin = iprot.readListBegin();
                        struct.words = new ArrayList(readListBegin.size);
                        for (int i11 = 0; i11 < readListBegin.size; i11++) {
                            UserBookWordDetail userBookWordDetail = new UserBookWordDetail();
                            userBookWordDetail.read(iprot);
                            struct.words.add(userBookWordDetail);
                        }
                        iprot.readListEnd();
                        struct.setWordsIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 12) {
                    UserBookItem userBookItem = new UserBookItem();
                    struct.book_info = userBookItem;
                    userBookItem.read(iprot);
                    struct.setBook_infoIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, AddWordsRsp struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(AddWordsRsp.STRUCT_DESC);
            if (struct.book_info != null) {
                oprot.writeFieldBegin(AddWordsRsp.BOOK_INFO_FIELD_DESC);
                struct.book_info.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.words != null) {
                oprot.writeFieldBegin(AddWordsRsp.WORDS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.words.size()));
                Iterator<UserBookWordDetail> it = struct.words.iterator();
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
    public static class AddWordsRspStandardSchemeFactory implements SchemeFactory {
        private AddWordsRspStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AddWordsRspStandardScheme getScheme() {
            return new AddWordsRspStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AddWordsRspTupleScheme extends TupleScheme<AddWordsRsp> {
        private AddWordsRspTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, AddWordsRsp struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            UserBookItem userBookItem = new UserBookItem();
            struct.book_info = userBookItem;
            userBookItem.read(tTupleProtocol);
            struct.setBook_infoIsSet(true);
            TList tList = new TList((byte) 12, tTupleProtocol.readI32());
            struct.words = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                UserBookWordDetail userBookWordDetail = new UserBookWordDetail();
                userBookWordDetail.read(tTupleProtocol);
                struct.words.add(userBookWordDetail);
            }
            struct.setWordsIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, AddWordsRsp struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.book_info.write(tTupleProtocol);
            tTupleProtocol.writeI32(struct.words.size());
            Iterator<UserBookWordDetail> it = struct.words.iterator();
            while (it.hasNext()) {
                it.next().write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AddWordsRspTupleSchemeFactory implements SchemeFactory {
        private AddWordsRspTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AddWordsRspTupleScheme getScheme() {
            return new AddWordsRspTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        BOOK_INFO(1, "book_info"),
        WORDS(2, xd.a.f98002r);

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
                return BOOK_INFO;
            }
            if (fieldId != 2) {
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
        hashMap.put(StandardScheme.class, new AddWordsRspStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new AddWordsRspTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.BOOK_INFO, (_Fields) new FieldMetaData("book_info", (byte) 1, new StructMetaData((byte) 12, UserBookItem.class)));
        enumMap.put((EnumMap) _Fields.WORDS, (_Fields) new FieldMetaData(xd.a.f98002r, (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, UserBookWordDetail.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(AddWordsRsp.class, unmodifiableMap);
    }

    public AddWordsRsp() {
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

    public void addToWords(UserBookWordDetail elem) {
        if (this.words == null) {
            this.words = new ArrayList();
        }
        this.words.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.book_info = null;
        this.words = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof AddWordsRsp)) {
            return equals((AddWordsRsp) that);
        }
        return false;
    }

    public UserBookItem getBook_info() {
        return this.book_info;
    }

    public List<UserBookWordDetail> getWords() {
        return this.words;
    }

    public Iterator<UserBookWordDetail> getWordsIterator() {
        List<UserBookWordDetail> list = this.words;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getWordsSize() {
        List<UserBookWordDetail> list = this.words;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetBook_info() {
        return this.book_info != null;
    }

    public boolean isSetWords() {
        return this.words != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public AddWordsRsp setBook_info(UserBookItem book_info) {
        this.book_info = book_info;
        return this;
    }

    public void setBook_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.book_info = null;
    }

    public AddWordsRsp setWords(List<UserBookWordDetail> words) {
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
        StringBuilder sb2 = new StringBuilder("AddWordsRsp(");
        sb2.append("book_info:");
        UserBookItem userBookItem = this.book_info;
        if (userBookItem == null) {
            sb2.append("null");
        } else {
            sb2.append(userBookItem);
        }
        sb2.append(j2.O);
        sb2.append("words:");
        List<UserBookWordDetail> list = this.words;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetBook_info() {
        this.book_info = null;
    }

    public void unsetWords() {
        this.words = null;
    }

    public void validate() throws TException {
        UserBookItem userBookItem = this.book_info;
        if (userBookItem == null) {
            throw new TProtocolException("Required field 'book_info' was not present! Struct: " + toString());
        }
        if (this.words != null) {
            if (userBookItem != null) {
                userBookItem.validate();
            }
        } else {
            throw new TProtocolException("Required field 'words' was not present! Struct: " + toString());
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    public AddWordsRsp(UserBookItem book_info, List<UserBookWordDetail> words) {
        this();
        this.book_info = book_info;
        this.words = words;
    }

    @Override // java.lang.Comparable
    public int compareTo(AddWordsRsp other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetBook_info()).compareTo(Boolean.valueOf(other.isSetBook_info()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetBook_info() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.book_info, (Comparable) other.book_info)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetWords()).compareTo(Boolean.valueOf(other.isSetWords()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetWords() || (compareTo = TBaseHelper.compareTo((List) this.words, (List) other.words)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<AddWordsRsp, _Fields> deepCopy2() {
        return new AddWordsRsp(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_book$AddWordsRsp$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getBook_info();
        }
        if (i11 == 2) {
            return getWords();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_book$AddWordsRsp$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetBook_info();
        }
        if (i11 == 2) {
            return isSetWords();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_book$AddWordsRsp$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetBook_info();
                return;
            } else {
                setBook_info((UserBookItem) value);
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetWords();
        } else {
            setWords((List) value);
        }
    }

    public boolean equals(AddWordsRsp that) {
        if (that == null) {
            return false;
        }
        boolean isSetBook_info = isSetBook_info();
        boolean isSetBook_info2 = that.isSetBook_info();
        if ((isSetBook_info || isSetBook_info2) && !(isSetBook_info && isSetBook_info2 && this.book_info.equals(that.book_info))) {
            return false;
        }
        boolean isSetWords = isSetWords();
        boolean isSetWords2 = that.isSetWords();
        if (isSetWords || isSetWords2) {
            return isSetWords && isSetWords2 && this.words.equals(that.words);
        }
        return true;
    }

    public AddWordsRsp(AddWordsRsp other) {
        if (other.isSetBook_info()) {
            this.book_info = new UserBookItem(other.book_info);
        }
        if (other.isSetWords()) {
            ArrayList arrayList = new ArrayList(other.words.size());
            Iterator<UserBookWordDetail> it = other.words.iterator();
            while (it.hasNext()) {
                arrayList.add(new UserBookWordDetail(it.next()));
            }
            this.words = arrayList;
        }
    }
}
