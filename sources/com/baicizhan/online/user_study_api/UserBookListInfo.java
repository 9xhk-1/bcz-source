package com.baicizhan.online.user_study_api;

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
public class UserBookListInfo implements TBase<UserBookListInfo, _Fields>, Serializable, Cloneable, Comparable<UserBookListInfo> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public List<BookLevelInfo> all_tops;
    public List<UserBookBasicInfo> books_info;
    public List<UserBookCategory> categories_info;
    public List<BookLevelInfo> levels_info;
    private _Fields[] optionals;
    private static final TStruct STRUCT_DESC = new TStruct("UserBookListInfo");
    private static final TField BOOKS_INFO_FIELD_DESC = new TField("books_info", (byte) 15, 1);
    private static final TField CATEGORIES_INFO_FIELD_DESC = new TField("categories_info", (byte) 15, 2);
    private static final TField LEVELS_INFO_FIELD_DESC = new TField("levels_info", (byte) 15, 3);
    private static final TField ALL_TOPS_FIELD_DESC = new TField("all_tops", (byte) 15, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.UserBookListInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$UserBookListInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$UserBookListInfo$_Fields = iArr;
            try {
                iArr[_Fields.BOOKS_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserBookListInfo$_Fields[_Fields.CATEGORIES_INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserBookListInfo$_Fields[_Fields.LEVELS_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserBookListInfo$_Fields[_Fields.ALL_TOPS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBookListInfoStandardScheme extends StandardScheme<UserBookListInfo> {
        private UserBookListInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserBookListInfo struct) throws TException {
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
                        if (s11 != 3) {
                            if (s11 != 4) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 15) {
                                TList readListBegin = iprot.readListBegin();
                                struct.all_tops = new ArrayList(readListBegin.size);
                                while (i11 < readListBegin.size) {
                                    BookLevelInfo bookLevelInfo = new BookLevelInfo();
                                    bookLevelInfo.read(iprot);
                                    struct.all_tops.add(bookLevelInfo);
                                    i11++;
                                }
                                iprot.readListEnd();
                                struct.setAll_topsIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 15) {
                            TList readListBegin2 = iprot.readListBegin();
                            struct.levels_info = new ArrayList(readListBegin2.size);
                            while (i11 < readListBegin2.size) {
                                BookLevelInfo bookLevelInfo2 = new BookLevelInfo();
                                bookLevelInfo2.read(iprot);
                                struct.levels_info.add(bookLevelInfo2);
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setLevels_infoIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 15) {
                        TList readListBegin3 = iprot.readListBegin();
                        struct.categories_info = new ArrayList(readListBegin3.size);
                        while (i11 < readListBegin3.size) {
                            UserBookCategory userBookCategory = new UserBookCategory();
                            userBookCategory.read(iprot);
                            struct.categories_info.add(userBookCategory);
                            i11++;
                        }
                        iprot.readListEnd();
                        struct.setCategories_infoIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 15) {
                    TList readListBegin4 = iprot.readListBegin();
                    struct.books_info = new ArrayList(readListBegin4.size);
                    while (i11 < readListBegin4.size) {
                        UserBookBasicInfo userBookBasicInfo = new UserBookBasicInfo();
                        userBookBasicInfo.read(iprot);
                        struct.books_info.add(userBookBasicInfo);
                        i11++;
                    }
                    iprot.readListEnd();
                    struct.setBooks_infoIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, UserBookListInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserBookListInfo.STRUCT_DESC);
            if (struct.books_info != null) {
                oprot.writeFieldBegin(UserBookListInfo.BOOKS_INFO_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.books_info.size()));
                Iterator<UserBookBasicInfo> it = struct.books_info.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.categories_info != null) {
                oprot.writeFieldBegin(UserBookListInfo.CATEGORIES_INFO_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.categories_info.size()));
                Iterator<UserBookCategory> it2 = struct.categories_info.iterator();
                while (it2.hasNext()) {
                    it2.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.levels_info != null && struct.isSetLevels_info()) {
                oprot.writeFieldBegin(UserBookListInfo.LEVELS_INFO_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.levels_info.size()));
                Iterator<BookLevelInfo> it3 = struct.levels_info.iterator();
                while (it3.hasNext()) {
                    it3.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.all_tops != null && struct.isSetAll_tops()) {
                oprot.writeFieldBegin(UserBookListInfo.ALL_TOPS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.all_tops.size()));
                Iterator<BookLevelInfo> it4 = struct.all_tops.iterator();
                while (it4.hasNext()) {
                    it4.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBookListInfoStandardSchemeFactory implements SchemeFactory {
        private UserBookListInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserBookListInfoStandardScheme getScheme() {
            return new UserBookListInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBookListInfoTupleScheme extends TupleScheme<UserBookListInfo> {
        private UserBookListInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserBookListInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            TList tList = new TList((byte) 12, tTupleProtocol.readI32());
            struct.books_info = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                UserBookBasicInfo userBookBasicInfo = new UserBookBasicInfo();
                userBookBasicInfo.read(tTupleProtocol);
                struct.books_info.add(userBookBasicInfo);
            }
            struct.setBooks_infoIsSet(true);
            TList tList2 = new TList((byte) 12, tTupleProtocol.readI32());
            struct.categories_info = new ArrayList(tList2.size);
            for (int i12 = 0; i12 < tList2.size; i12++) {
                UserBookCategory userBookCategory = new UserBookCategory();
                userBookCategory.read(tTupleProtocol);
                struct.categories_info.add(userBookCategory);
            }
            struct.setCategories_infoIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(2);
            if (readBitSet.get(0)) {
                TList tList3 = new TList((byte) 12, tTupleProtocol.readI32());
                struct.levels_info = new ArrayList(tList3.size);
                for (int i13 = 0; i13 < tList3.size; i13++) {
                    BookLevelInfo bookLevelInfo = new BookLevelInfo();
                    bookLevelInfo.read(tTupleProtocol);
                    struct.levels_info.add(bookLevelInfo);
                }
                struct.setLevels_infoIsSet(true);
            }
            if (readBitSet.get(1)) {
                TList tList4 = new TList((byte) 12, tTupleProtocol.readI32());
                struct.all_tops = new ArrayList(tList4.size);
                for (int i14 = 0; i14 < tList4.size; i14++) {
                    BookLevelInfo bookLevelInfo2 = new BookLevelInfo();
                    bookLevelInfo2.read(tTupleProtocol);
                    struct.all_tops.add(bookLevelInfo2);
                }
                struct.setAll_topsIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserBookListInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.books_info.size());
            Iterator<UserBookBasicInfo> it = struct.books_info.iterator();
            while (it.hasNext()) {
                it.next().write(tTupleProtocol);
            }
            tTupleProtocol.writeI32(struct.categories_info.size());
            Iterator<UserBookCategory> it2 = struct.categories_info.iterator();
            while (it2.hasNext()) {
                it2.next().write(tTupleProtocol);
            }
            BitSet bitSet = new BitSet();
            if (struct.isSetLevels_info()) {
                bitSet.set(0);
            }
            if (struct.isSetAll_tops()) {
                bitSet.set(1);
            }
            tTupleProtocol.writeBitSet(bitSet, 2);
            if (struct.isSetLevels_info()) {
                tTupleProtocol.writeI32(struct.levels_info.size());
                Iterator<BookLevelInfo> it3 = struct.levels_info.iterator();
                while (it3.hasNext()) {
                    it3.next().write(tTupleProtocol);
                }
            }
            if (struct.isSetAll_tops()) {
                tTupleProtocol.writeI32(struct.all_tops.size());
                Iterator<BookLevelInfo> it4 = struct.all_tops.iterator();
                while (it4.hasNext()) {
                    it4.next().write(tTupleProtocol);
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBookListInfoTupleSchemeFactory implements SchemeFactory {
        private UserBookListInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserBookListInfoTupleScheme getScheme() {
            return new UserBookListInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        BOOKS_INFO(1, "books_info"),
        CATEGORIES_INFO(2, "categories_info"),
        LEVELS_INFO(3, "levels_info"),
        ALL_TOPS(4, "all_tops");

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
                return BOOKS_INFO;
            }
            if (fieldId == 2) {
                return CATEGORIES_INFO;
            }
            if (fieldId == 3) {
                return LEVELS_INFO;
            }
            if (fieldId != 4) {
                return null;
            }
            return ALL_TOPS;
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
        hashMap.put(StandardScheme.class, new UserBookListInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserBookListInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.BOOKS_INFO, (_Fields) new FieldMetaData("books_info", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, UserBookBasicInfo.class))));
        enumMap.put((EnumMap) _Fields.CATEGORIES_INFO, (_Fields) new FieldMetaData("categories_info", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, UserBookCategory.class))));
        enumMap.put((EnumMap) _Fields.LEVELS_INFO, (_Fields) new FieldMetaData("levels_info", (byte) 2, new ListMetaData((byte) 15, new StructMetaData((byte) 12, BookLevelInfo.class))));
        enumMap.put((EnumMap) _Fields.ALL_TOPS, (_Fields) new FieldMetaData("all_tops", (byte) 2, new ListMetaData((byte) 15, new StructMetaData((byte) 12, BookLevelInfo.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserBookListInfo.class, unmodifiableMap);
    }

    public UserBookListInfo() {
        this.optionals = new _Fields[]{_Fields.LEVELS_INFO, _Fields.ALL_TOPS};
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

    public void addToAll_tops(BookLevelInfo elem) {
        if (this.all_tops == null) {
            this.all_tops = new ArrayList();
        }
        this.all_tops.add(elem);
    }

    public void addToBooks_info(UserBookBasicInfo elem) {
        if (this.books_info == null) {
            this.books_info = new ArrayList();
        }
        this.books_info.add(elem);
    }

    public void addToCategories_info(UserBookCategory elem) {
        if (this.categories_info == null) {
            this.categories_info = new ArrayList();
        }
        this.categories_info.add(elem);
    }

    public void addToLevels_info(BookLevelInfo elem) {
        if (this.levels_info == null) {
            this.levels_info = new ArrayList();
        }
        this.levels_info.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.books_info = null;
        this.categories_info = null;
        this.levels_info = null;
        this.all_tops = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserBookListInfo)) {
            return equals((UserBookListInfo) that);
        }
        return false;
    }

    public List<BookLevelInfo> getAll_tops() {
        return this.all_tops;
    }

    public Iterator<BookLevelInfo> getAll_topsIterator() {
        List<BookLevelInfo> list = this.all_tops;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getAll_topsSize() {
        List<BookLevelInfo> list = this.all_tops;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<UserBookBasicInfo> getBooks_info() {
        return this.books_info;
    }

    public Iterator<UserBookBasicInfo> getBooks_infoIterator() {
        List<UserBookBasicInfo> list = this.books_info;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getBooks_infoSize() {
        List<UserBookBasicInfo> list = this.books_info;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<UserBookCategory> getCategories_info() {
        return this.categories_info;
    }

    public Iterator<UserBookCategory> getCategories_infoIterator() {
        List<UserBookCategory> list = this.categories_info;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getCategories_infoSize() {
        List<UserBookCategory> list = this.categories_info;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<BookLevelInfo> getLevels_info() {
        return this.levels_info;
    }

    public Iterator<BookLevelInfo> getLevels_infoIterator() {
        List<BookLevelInfo> list = this.levels_info;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getLevels_infoSize() {
        List<BookLevelInfo> list = this.levels_info;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAll_tops() {
        return this.all_tops != null;
    }

    public boolean isSetBooks_info() {
        return this.books_info != null;
    }

    public boolean isSetCategories_info() {
        return this.categories_info != null;
    }

    public boolean isSetLevels_info() {
        return this.levels_info != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserBookListInfo setAll_tops(List<BookLevelInfo> all_tops) {
        this.all_tops = all_tops;
        return this;
    }

    public void setAll_topsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.all_tops = null;
    }

    public UserBookListInfo setBooks_info(List<UserBookBasicInfo> books_info) {
        this.books_info = books_info;
        return this;
    }

    public void setBooks_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.books_info = null;
    }

    public UserBookListInfo setCategories_info(List<UserBookCategory> categories_info) {
        this.categories_info = categories_info;
        return this;
    }

    public void setCategories_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.categories_info = null;
    }

    public UserBookListInfo setLevels_info(List<BookLevelInfo> levels_info) {
        this.levels_info = levels_info;
        return this;
    }

    public void setLevels_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.levels_info = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserBookListInfo(");
        sb2.append("books_info:");
        List<UserBookBasicInfo> list = this.books_info;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("categories_info:");
        List<UserBookCategory> list2 = this.categories_info;
        if (list2 == null) {
            sb2.append("null");
        } else {
            sb2.append(list2);
        }
        if (isSetLevels_info()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("levels_info:");
            List<BookLevelInfo> list3 = this.levels_info;
            if (list3 == null) {
                sb2.append("null");
            } else {
                sb2.append(list3);
            }
        }
        if (isSetAll_tops()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("all_tops:");
            List<BookLevelInfo> list4 = this.all_tops;
            if (list4 == null) {
                sb2.append("null");
            } else {
                sb2.append(list4);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAll_tops() {
        this.all_tops = null;
    }

    public void unsetBooks_info() {
        this.books_info = null;
    }

    public void unsetCategories_info() {
        this.categories_info = null;
    }

    public void unsetLevels_info() {
        this.levels_info = null;
    }

    public void validate() throws TException {
        if (this.books_info == null) {
            throw new TProtocolException("Required field 'books_info' was not present! Struct: " + toString());
        }
        if (this.categories_info != null) {
            return;
        }
        throw new TProtocolException("Required field 'categories_info' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(UserBookListInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetBooks_info()).compareTo(Boolean.valueOf(other.isSetBooks_info()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetBooks_info() && (compareTo4 = TBaseHelper.compareTo((List) this.books_info, (List) other.books_info)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetCategories_info()).compareTo(Boolean.valueOf(other.isSetCategories_info()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetCategories_info() && (compareTo3 = TBaseHelper.compareTo((List) this.categories_info, (List) other.categories_info)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetLevels_info()).compareTo(Boolean.valueOf(other.isSetLevels_info()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetLevels_info() && (compareTo2 = TBaseHelper.compareTo((List) this.levels_info, (List) other.levels_info)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetAll_tops()).compareTo(Boolean.valueOf(other.isSetAll_tops()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetAll_tops() || (compareTo = TBaseHelper.compareTo((List) this.all_tops, (List) other.all_tops)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserBookListInfo, _Fields> deepCopy2() {
        return new UserBookListInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserBookListInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getBooks_info();
        }
        if (i11 == 2) {
            return getCategories_info();
        }
        if (i11 == 3) {
            return getLevels_info();
        }
        if (i11 == 4) {
            return getAll_tops();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserBookListInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetBooks_info();
        }
        if (i11 == 2) {
            return isSetCategories_info();
        }
        if (i11 == 3) {
            return isSetLevels_info();
        }
        if (i11 == 4) {
            return isSetAll_tops();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserBookListInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetBooks_info();
                return;
            } else {
                setBooks_info((List) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetCategories_info();
                return;
            } else {
                setCategories_info((List) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetLevels_info();
                return;
            } else {
                setLevels_info((List) value);
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetAll_tops();
        } else {
            setAll_tops((List) value);
        }
    }

    public UserBookListInfo(List<UserBookBasicInfo> books_info, List<UserBookCategory> categories_info) {
        this();
        this.books_info = books_info;
        this.categories_info = categories_info;
    }

    public boolean equals(UserBookListInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetBooks_info = isSetBooks_info();
        boolean isSetBooks_info2 = that.isSetBooks_info();
        if ((isSetBooks_info || isSetBooks_info2) && !(isSetBooks_info && isSetBooks_info2 && this.books_info.equals(that.books_info))) {
            return false;
        }
        boolean isSetCategories_info = isSetCategories_info();
        boolean isSetCategories_info2 = that.isSetCategories_info();
        if ((isSetCategories_info || isSetCategories_info2) && !(isSetCategories_info && isSetCategories_info2 && this.categories_info.equals(that.categories_info))) {
            return false;
        }
        boolean isSetLevels_info = isSetLevels_info();
        boolean isSetLevels_info2 = that.isSetLevels_info();
        if ((isSetLevels_info || isSetLevels_info2) && !(isSetLevels_info && isSetLevels_info2 && this.levels_info.equals(that.levels_info))) {
            return false;
        }
        boolean isSetAll_tops = isSetAll_tops();
        boolean isSetAll_tops2 = that.isSetAll_tops();
        if (isSetAll_tops || isSetAll_tops2) {
            return isSetAll_tops && isSetAll_tops2 && this.all_tops.equals(that.all_tops);
        }
        return true;
    }

    public UserBookListInfo(UserBookListInfo other) {
        this.optionals = new _Fields[]{_Fields.LEVELS_INFO, _Fields.ALL_TOPS};
        if (other.isSetBooks_info()) {
            ArrayList arrayList = new ArrayList(other.books_info.size());
            Iterator<UserBookBasicInfo> it = other.books_info.iterator();
            while (it.hasNext()) {
                arrayList.add(new UserBookBasicInfo(it.next()));
            }
            this.books_info = arrayList;
        }
        if (other.isSetCategories_info()) {
            ArrayList arrayList2 = new ArrayList(other.categories_info.size());
            Iterator<UserBookCategory> it2 = other.categories_info.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new UserBookCategory(it2.next()));
            }
            this.categories_info = arrayList2;
        }
        if (other.isSetLevels_info()) {
            ArrayList arrayList3 = new ArrayList(other.levels_info.size());
            Iterator<BookLevelInfo> it3 = other.levels_info.iterator();
            while (it3.hasNext()) {
                arrayList3.add(new BookLevelInfo(it3.next()));
            }
            this.levels_info = arrayList3;
        }
        if (other.isSetAll_tops()) {
            ArrayList arrayList4 = new ArrayList(other.all_tops.size());
            Iterator<BookLevelInfo> it4 = other.all_tops.iterator();
            while (it4.hasNext()) {
                arrayList4.add(new BookLevelInfo(it4.next()));
            }
            this.all_tops = arrayList4;
        }
    }
}
