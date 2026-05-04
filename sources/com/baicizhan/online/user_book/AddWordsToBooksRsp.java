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
public class AddWordsToBooksRsp implements TBase<AddWordsToBooksRsp, _Fields>, Serializable, Cloneable, Comparable<AddWordsToBooksRsp> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public List<UserBookItem> book_infos;
    public List<UserBookWordDetail> words;
    private static final TStruct STRUCT_DESC = new TStruct("AddWordsToBooksRsp");
    private static final TField BOOK_INFOS_FIELD_DESC = new TField("book_infos", (byte) 15, 1);
    private static final TField WORDS_FIELD_DESC = new TField(xd.a.f98002r, (byte) 15, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_book.AddWordsToBooksRsp$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_book$AddWordsToBooksRsp$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_book$AddWordsToBooksRsp$_Fields = iArr;
            try {
                iArr[_Fields.BOOK_INFOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_book$AddWordsToBooksRsp$_Fields[_Fields.WORDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AddWordsToBooksRspStandardScheme extends StandardScheme<AddWordsToBooksRsp> {
        private AddWordsToBooksRspStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, AddWordsToBooksRsp struct) throws TException {
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
                int i11 = 0;
                if (s11 != 1) {
                    if (s11 != 2) {
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 15) {
                        TList readListBegin = iprot.readListBegin();
                        struct.words = new ArrayList(readListBegin.size);
                        while (i11 < readListBegin.size) {
                            UserBookWordDetail userBookWordDetail = new UserBookWordDetail();
                            userBookWordDetail.read(iprot);
                            struct.words.add(userBookWordDetail);
                            i11++;
                        }
                        iprot.readListEnd();
                        struct.setWordsIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 15) {
                    TList readListBegin2 = iprot.readListBegin();
                    struct.book_infos = new ArrayList(readListBegin2.size);
                    while (i11 < readListBegin2.size) {
                        UserBookItem userBookItem = new UserBookItem();
                        userBookItem.read(iprot);
                        struct.book_infos.add(userBookItem);
                        i11++;
                    }
                    iprot.readListEnd();
                    struct.setBook_infosIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, AddWordsToBooksRsp struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(AddWordsToBooksRsp.STRUCT_DESC);
            if (struct.book_infos != null) {
                oprot.writeFieldBegin(AddWordsToBooksRsp.BOOK_INFOS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.book_infos.size()));
                Iterator<UserBookItem> it = struct.book_infos.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.words != null) {
                oprot.writeFieldBegin(AddWordsToBooksRsp.WORDS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.words.size()));
                Iterator<UserBookWordDetail> it2 = struct.words.iterator();
                while (it2.hasNext()) {
                    it2.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AddWordsToBooksRspStandardSchemeFactory implements SchemeFactory {
        private AddWordsToBooksRspStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AddWordsToBooksRspStandardScheme getScheme() {
            return new AddWordsToBooksRspStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AddWordsToBooksRspTupleScheme extends TupleScheme<AddWordsToBooksRsp> {
        private AddWordsToBooksRspTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, AddWordsToBooksRsp struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            TList tList = new TList((byte) 12, tTupleProtocol.readI32());
            struct.book_infos = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                UserBookItem userBookItem = new UserBookItem();
                userBookItem.read(tTupleProtocol);
                struct.book_infos.add(userBookItem);
            }
            struct.setBook_infosIsSet(true);
            TList tList2 = new TList((byte) 12, tTupleProtocol.readI32());
            struct.words = new ArrayList(tList2.size);
            for (int i12 = 0; i12 < tList2.size; i12++) {
                UserBookWordDetail userBookWordDetail = new UserBookWordDetail();
                userBookWordDetail.read(tTupleProtocol);
                struct.words.add(userBookWordDetail);
            }
            struct.setWordsIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, AddWordsToBooksRsp struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.book_infos.size());
            Iterator<UserBookItem> it = struct.book_infos.iterator();
            while (it.hasNext()) {
                it.next().write(tTupleProtocol);
            }
            tTupleProtocol.writeI32(struct.words.size());
            Iterator<UserBookWordDetail> it2 = struct.words.iterator();
            while (it2.hasNext()) {
                it2.next().write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AddWordsToBooksRspTupleSchemeFactory implements SchemeFactory {
        private AddWordsToBooksRspTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AddWordsToBooksRspTupleScheme getScheme() {
            return new AddWordsToBooksRspTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        BOOK_INFOS(1, "book_infos"),
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
                return BOOK_INFOS;
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
        hashMap.put(StandardScheme.class, new AddWordsToBooksRspStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new AddWordsToBooksRspTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.BOOK_INFOS, (_Fields) new FieldMetaData("book_infos", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, UserBookItem.class))));
        enumMap.put((EnumMap) _Fields.WORDS, (_Fields) new FieldMetaData(xd.a.f98002r, (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, UserBookWordDetail.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(AddWordsToBooksRsp.class, unmodifiableMap);
    }

    public AddWordsToBooksRsp() {
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

    public void addToBook_infos(UserBookItem elem) {
        if (this.book_infos == null) {
            this.book_infos = new ArrayList();
        }
        this.book_infos.add(elem);
    }

    public void addToWords(UserBookWordDetail elem) {
        if (this.words == null) {
            this.words = new ArrayList();
        }
        this.words.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.book_infos = null;
        this.words = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof AddWordsToBooksRsp)) {
            return equals((AddWordsToBooksRsp) that);
        }
        return false;
    }

    public List<UserBookItem> getBook_infos() {
        return this.book_infos;
    }

    public Iterator<UserBookItem> getBook_infosIterator() {
        List<UserBookItem> list = this.book_infos;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getBook_infosSize() {
        List<UserBookItem> list = this.book_infos;
        if (list == null) {
            return 0;
        }
        return list.size();
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

    public boolean isSetBook_infos() {
        return this.book_infos != null;
    }

    public boolean isSetWords() {
        return this.words != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public AddWordsToBooksRsp setBook_infos(List<UserBookItem> book_infos) {
        this.book_infos = book_infos;
        return this;
    }

    public void setBook_infosIsSet(boolean value) {
        if (value) {
            return;
        }
        this.book_infos = null;
    }

    public AddWordsToBooksRsp setWords(List<UserBookWordDetail> words) {
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
        StringBuilder sb2 = new StringBuilder("AddWordsToBooksRsp(");
        sb2.append("book_infos:");
        List<UserBookItem> list = this.book_infos;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(j2.O);
        sb2.append("words:");
        List<UserBookWordDetail> list2 = this.words;
        if (list2 == null) {
            sb2.append("null");
        } else {
            sb2.append(list2);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetBook_infos() {
        this.book_infos = null;
    }

    public void unsetWords() {
        this.words = null;
    }

    public void validate() throws TException {
        if (this.book_infos == null) {
            throw new TProtocolException("Required field 'book_infos' was not present! Struct: " + toString());
        }
        if (this.words != null) {
            return;
        }
        throw new TProtocolException("Required field 'words' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    public AddWordsToBooksRsp(List<UserBookItem> book_infos, List<UserBookWordDetail> words) {
        this();
        this.book_infos = book_infos;
        this.words = words;
    }

    @Override // java.lang.Comparable
    public int compareTo(AddWordsToBooksRsp other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetBook_infos()).compareTo(Boolean.valueOf(other.isSetBook_infos()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetBook_infos() && (compareTo2 = TBaseHelper.compareTo((List) this.book_infos, (List) other.book_infos)) != 0) {
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
    public TBase<AddWordsToBooksRsp, _Fields> deepCopy2() {
        return new AddWordsToBooksRsp(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_book$AddWordsToBooksRsp$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getBook_infos();
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
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_book$AddWordsToBooksRsp$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetBook_infos();
        }
        if (i11 == 2) {
            return isSetWords();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_book$AddWordsToBooksRsp$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetBook_infos();
                return;
            } else {
                setBook_infos((List) value);
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

    public boolean equals(AddWordsToBooksRsp that) {
        if (that == null) {
            return false;
        }
        boolean isSetBook_infos = isSetBook_infos();
        boolean isSetBook_infos2 = that.isSetBook_infos();
        if ((isSetBook_infos || isSetBook_infos2) && !(isSetBook_infos && isSetBook_infos2 && this.book_infos.equals(that.book_infos))) {
            return false;
        }
        boolean isSetWords = isSetWords();
        boolean isSetWords2 = that.isSetWords();
        if (isSetWords || isSetWords2) {
            return isSetWords && isSetWords2 && this.words.equals(that.words);
        }
        return true;
    }

    public AddWordsToBooksRsp(AddWordsToBooksRsp other) {
        if (other.isSetBook_infos()) {
            ArrayList arrayList = new ArrayList(other.book_infos.size());
            Iterator<UserBookItem> it = other.book_infos.iterator();
            while (it.hasNext()) {
                arrayList.add(new UserBookItem(it.next()));
            }
            this.book_infos = arrayList;
        }
        if (other.isSetWords()) {
            ArrayList arrayList2 = new ArrayList(other.words.size());
            Iterator<UserBookWordDetail> it2 = other.words.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new UserBookWordDetail(it2.next()));
            }
            this.words = arrayList2;
        }
    }
}
