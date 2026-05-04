package com.baicizhan.online.user_study_api;

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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class UserBookInfoJapan implements TBase<UserBookInfoJapan, _Fields>, Serializable, Cloneable, Comparable<UserBookInfoJapan> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public List<UserBookBasicInfo> books;
    public List<UserBookCateJapn> cates;
    private static final TStruct STRUCT_DESC = new TStruct("UserBookInfoJapan");
    private static final TField BOOKS_FIELD_DESC = new TField("books", (byte) 15, 1);
    private static final TField CATES_FIELD_DESC = new TField("cates", (byte) 15, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.UserBookInfoJapan$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$UserBookInfoJapan$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$UserBookInfoJapan$_Fields = iArr;
            try {
                iArr[_Fields.BOOKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserBookInfoJapan$_Fields[_Fields.CATES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBookInfoJapanStandardScheme extends StandardScheme<UserBookInfoJapan> {
        private UserBookInfoJapanStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserBookInfoJapan struct) throws TException {
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
                        struct.cates = new ArrayList(readListBegin.size);
                        while (i11 < readListBegin.size) {
                            UserBookCateJapn userBookCateJapn = new UserBookCateJapn();
                            userBookCateJapn.read(iprot);
                            struct.cates.add(userBookCateJapn);
                            i11++;
                        }
                        iprot.readListEnd();
                        struct.setCatesIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 15) {
                    TList readListBegin2 = iprot.readListBegin();
                    struct.books = new ArrayList(readListBegin2.size);
                    while (i11 < readListBegin2.size) {
                        UserBookBasicInfo userBookBasicInfo = new UserBookBasicInfo();
                        userBookBasicInfo.read(iprot);
                        struct.books.add(userBookBasicInfo);
                        i11++;
                    }
                    iprot.readListEnd();
                    struct.setBooksIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, UserBookInfoJapan struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserBookInfoJapan.STRUCT_DESC);
            if (struct.books != null) {
                oprot.writeFieldBegin(UserBookInfoJapan.BOOKS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.books.size()));
                Iterator<UserBookBasicInfo> it = struct.books.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.cates != null) {
                oprot.writeFieldBegin(UserBookInfoJapan.CATES_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.cates.size()));
                Iterator<UserBookCateJapn> it2 = struct.cates.iterator();
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
    public static class UserBookInfoJapanStandardSchemeFactory implements SchemeFactory {
        private UserBookInfoJapanStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserBookInfoJapanStandardScheme getScheme() {
            return new UserBookInfoJapanStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBookInfoJapanTupleScheme extends TupleScheme<UserBookInfoJapan> {
        private UserBookInfoJapanTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserBookInfoJapan struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            TList tList = new TList((byte) 12, tTupleProtocol.readI32());
            struct.books = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                UserBookBasicInfo userBookBasicInfo = new UserBookBasicInfo();
                userBookBasicInfo.read(tTupleProtocol);
                struct.books.add(userBookBasicInfo);
            }
            struct.setBooksIsSet(true);
            TList tList2 = new TList((byte) 12, tTupleProtocol.readI32());
            struct.cates = new ArrayList(tList2.size);
            for (int i12 = 0; i12 < tList2.size; i12++) {
                UserBookCateJapn userBookCateJapn = new UserBookCateJapn();
                userBookCateJapn.read(tTupleProtocol);
                struct.cates.add(userBookCateJapn);
            }
            struct.setCatesIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserBookInfoJapan struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.books.size());
            Iterator<UserBookBasicInfo> it = struct.books.iterator();
            while (it.hasNext()) {
                it.next().write(tTupleProtocol);
            }
            tTupleProtocol.writeI32(struct.cates.size());
            Iterator<UserBookCateJapn> it2 = struct.cates.iterator();
            while (it2.hasNext()) {
                it2.next().write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBookInfoJapanTupleSchemeFactory implements SchemeFactory {
        private UserBookInfoJapanTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserBookInfoJapanTupleScheme getScheme() {
            return new UserBookInfoJapanTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        BOOKS(1, "books"),
        CATES(2, "cates");

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
                return BOOKS;
            }
            if (fieldId != 2) {
                return null;
            }
            return CATES;
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
        hashMap.put(StandardScheme.class, new UserBookInfoJapanStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserBookInfoJapanTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.BOOKS, (_Fields) new FieldMetaData("books", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, UserBookBasicInfo.class))));
        enumMap.put((EnumMap) _Fields.CATES, (_Fields) new FieldMetaData("cates", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, UserBookCateJapn.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserBookInfoJapan.class, unmodifiableMap);
    }

    public UserBookInfoJapan() {
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

    public void addToBooks(UserBookBasicInfo elem) {
        if (this.books == null) {
            this.books = new ArrayList();
        }
        this.books.add(elem);
    }

    public void addToCates(UserBookCateJapn elem) {
        if (this.cates == null) {
            this.cates = new ArrayList();
        }
        this.cates.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.books = null;
        this.cates = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserBookInfoJapan)) {
            return equals((UserBookInfoJapan) that);
        }
        return false;
    }

    public List<UserBookBasicInfo> getBooks() {
        return this.books;
    }

    public Iterator<UserBookBasicInfo> getBooksIterator() {
        List<UserBookBasicInfo> list = this.books;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getBooksSize() {
        List<UserBookBasicInfo> list = this.books;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<UserBookCateJapn> getCates() {
        return this.cates;
    }

    public Iterator<UserBookCateJapn> getCatesIterator() {
        List<UserBookCateJapn> list = this.cates;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getCatesSize() {
        List<UserBookCateJapn> list = this.cates;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetBooks() {
        return this.books != null;
    }

    public boolean isSetCates() {
        return this.cates != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserBookInfoJapan setBooks(List<UserBookBasicInfo> books) {
        this.books = books;
        return this;
    }

    public void setBooksIsSet(boolean value) {
        if (value) {
            return;
        }
        this.books = null;
    }

    public UserBookInfoJapan setCates(List<UserBookCateJapn> cates) {
        this.cates = cates;
        return this;
    }

    public void setCatesIsSet(boolean value) {
        if (value) {
            return;
        }
        this.cates = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserBookInfoJapan(");
        sb2.append("books:");
        List<UserBookBasicInfo> list = this.books;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("cates:");
        List<UserBookCateJapn> list2 = this.cates;
        if (list2 == null) {
            sb2.append("null");
        } else {
            sb2.append(list2);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetBooks() {
        this.books = null;
    }

    public void unsetCates() {
        this.cates = null;
    }

    public void validate() throws TException {
        if (this.books == null) {
            throw new TProtocolException("Required field 'books' was not present! Struct: " + toString());
        }
        if (this.cates != null) {
            return;
        }
        throw new TProtocolException("Required field 'cates' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    public UserBookInfoJapan(List<UserBookBasicInfo> books, List<UserBookCateJapn> cates) {
        this();
        this.books = books;
        this.cates = cates;
    }

    @Override // java.lang.Comparable
    public int compareTo(UserBookInfoJapan other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetBooks()).compareTo(Boolean.valueOf(other.isSetBooks()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetBooks() && (compareTo2 = TBaseHelper.compareTo((List) this.books, (List) other.books)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetCates()).compareTo(Boolean.valueOf(other.isSetCates()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetCates() || (compareTo = TBaseHelper.compareTo((List) this.cates, (List) other.cates)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserBookInfoJapan, _Fields> deepCopy2() {
        return new UserBookInfoJapan(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserBookInfoJapan$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getBooks();
        }
        if (i11 == 2) {
            return getCates();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserBookInfoJapan$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetBooks();
        }
        if (i11 == 2) {
            return isSetCates();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserBookInfoJapan$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetBooks();
                return;
            } else {
                setBooks((List) value);
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetCates();
        } else {
            setCates((List) value);
        }
    }

    public boolean equals(UserBookInfoJapan that) {
        if (that == null) {
            return false;
        }
        boolean isSetBooks = isSetBooks();
        boolean isSetBooks2 = that.isSetBooks();
        if ((isSetBooks || isSetBooks2) && !(isSetBooks && isSetBooks2 && this.books.equals(that.books))) {
            return false;
        }
        boolean isSetCates = isSetCates();
        boolean isSetCates2 = that.isSetCates();
        if (isSetCates || isSetCates2) {
            return isSetCates && isSetCates2 && this.cates.equals(that.cates);
        }
        return true;
    }

    public UserBookInfoJapan(UserBookInfoJapan other) {
        if (other.isSetBooks()) {
            ArrayList arrayList = new ArrayList(other.books.size());
            Iterator<UserBookBasicInfo> it = other.books.iterator();
            while (it.hasNext()) {
                arrayList.add(new UserBookBasicInfo(it.next()));
            }
            this.books = arrayList;
        }
        if (other.isSetCates()) {
            ArrayList arrayList2 = new ArrayList(other.cates.size());
            Iterator<UserBookCateJapn> it2 = other.cates.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new UserBookCateJapn(it2.next()));
            }
            this.cates = arrayList2;
        }
    }
}
