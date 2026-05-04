package com.baicizhan.online.user_book;

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
/* loaded from: classes6.dex */
public class UserBookInfo implements TBase<UserBookInfo, _Fields>, Serializable, Cloneable, Comparable<UserBookInfo> {
    private static final int __COPPER_LIMIT_ISSET_ID = 1;
    private static final int __MAX_LIMIT_ISSET_ID = 0;
    private static final int __SHARE_ISSET_ID = 2;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int copper_limit;
    public int max_limit;
    private _Fields[] optionals;
    public int share;
    public List<UserBookItem> user_books;
    private static final TStruct STRUCT_DESC = new TStruct("UserBookInfo");
    private static final TField MAX_LIMIT_FIELD_DESC = new TField("max_limit", (byte) 8, 1);
    private static final TField USER_BOOKS_FIELD_DESC = new TField("user_books", (byte) 15, 2);
    private static final TField COPPER_LIMIT_FIELD_DESC = new TField("copper_limit", (byte) 8, 3);
    private static final TField SHARE_FIELD_DESC = new TField("share", (byte) 8, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_book.UserBookInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_book$UserBookInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_book$UserBookInfo$_Fields = iArr;
            try {
                iArr[_Fields.MAX_LIMIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_book$UserBookInfo$_Fields[_Fields.USER_BOOKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_book$UserBookInfo$_Fields[_Fields.COPPER_LIMIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_book$UserBookInfo$_Fields[_Fields.SHARE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBookInfoStandardScheme extends StandardScheme<UserBookInfo> {
        private UserBookInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserBookInfo struct) throws TException {
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
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 8) {
                                struct.share = iprot.readI32();
                                struct.setShareIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 8) {
                            struct.copper_limit = iprot.readI32();
                            struct.setCopper_limitIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 15) {
                        TList readListBegin = iprot.readListBegin();
                        struct.user_books = new ArrayList(readListBegin.size);
                        for (int i11 = 0; i11 < readListBegin.size; i11++) {
                            UserBookItem userBookItem = new UserBookItem();
                            userBookItem.read(iprot);
                            struct.user_books.add(userBookItem);
                        }
                        iprot.readListEnd();
                        struct.setUser_booksIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.max_limit = iprot.readI32();
                    struct.setMax_limitIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetMax_limit()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'max_limit' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, UserBookInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserBookInfo.STRUCT_DESC);
            oprot.writeFieldBegin(UserBookInfo.MAX_LIMIT_FIELD_DESC);
            oprot.writeI32(struct.max_limit);
            oprot.writeFieldEnd();
            if (struct.user_books != null) {
                oprot.writeFieldBegin(UserBookInfo.USER_BOOKS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.user_books.size()));
                Iterator<UserBookItem> it = struct.user_books.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.isSetCopper_limit()) {
                oprot.writeFieldBegin(UserBookInfo.COPPER_LIMIT_FIELD_DESC);
                oprot.writeI32(struct.copper_limit);
                oprot.writeFieldEnd();
            }
            if (struct.isSetShare()) {
                oprot.writeFieldBegin(UserBookInfo.SHARE_FIELD_DESC);
                oprot.writeI32(struct.share);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBookInfoStandardSchemeFactory implements SchemeFactory {
        private UserBookInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserBookInfoStandardScheme getScheme() {
            return new UserBookInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBookInfoTupleScheme extends TupleScheme<UserBookInfo> {
        private UserBookInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserBookInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.max_limit = tTupleProtocol.readI32();
            struct.setMax_limitIsSet(true);
            TList tList = new TList((byte) 12, tTupleProtocol.readI32());
            struct.user_books = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                UserBookItem userBookItem = new UserBookItem();
                userBookItem.read(tTupleProtocol);
                struct.user_books.add(userBookItem);
            }
            struct.setUser_booksIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(2);
            if (readBitSet.get(0)) {
                struct.copper_limit = tTupleProtocol.readI32();
                struct.setCopper_limitIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.share = tTupleProtocol.readI32();
                struct.setShareIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserBookInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.max_limit);
            tTupleProtocol.writeI32(struct.user_books.size());
            Iterator<UserBookItem> it = struct.user_books.iterator();
            while (it.hasNext()) {
                it.next().write(tTupleProtocol);
            }
            BitSet bitSet = new BitSet();
            if (struct.isSetCopper_limit()) {
                bitSet.set(0);
            }
            if (struct.isSetShare()) {
                bitSet.set(1);
            }
            tTupleProtocol.writeBitSet(bitSet, 2);
            if (struct.isSetCopper_limit()) {
                tTupleProtocol.writeI32(struct.copper_limit);
            }
            if (struct.isSetShare()) {
                tTupleProtocol.writeI32(struct.share);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBookInfoTupleSchemeFactory implements SchemeFactory {
        private UserBookInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserBookInfoTupleScheme getScheme() {
            return new UserBookInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        MAX_LIMIT(1, "max_limit"),
        USER_BOOKS(2, "user_books"),
        COPPER_LIMIT(3, "copper_limit"),
        SHARE(4, "share");

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
                return MAX_LIMIT;
            }
            if (fieldId == 2) {
                return USER_BOOKS;
            }
            if (fieldId == 3) {
                return COPPER_LIMIT;
            }
            if (fieldId != 4) {
                return null;
            }
            return SHARE;
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
        hashMap.put(StandardScheme.class, new UserBookInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserBookInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.MAX_LIMIT, (_Fields) new FieldMetaData("max_limit", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.USER_BOOKS, (_Fields) new FieldMetaData("user_books", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, UserBookItem.class))));
        enumMap.put((EnumMap) _Fields.COPPER_LIMIT, (_Fields) new FieldMetaData("copper_limit", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.SHARE, (_Fields) new FieldMetaData("share", (byte) 2, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserBookInfo.class, unmodifiableMap);
    }

    public UserBookInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.COPPER_LIMIT, _Fields.SHARE};
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

    public void addToUser_books(UserBookItem elem) {
        if (this.user_books == null) {
            this.user_books = new ArrayList();
        }
        this.user_books.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        setMax_limitIsSet(false);
        this.max_limit = 0;
        this.user_books = null;
        setCopper_limitIsSet(false);
        this.copper_limit = 0;
        setShareIsSet(false);
        this.share = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserBookInfo)) {
            return equals((UserBookInfo) that);
        }
        return false;
    }

    public int getCopper_limit() {
        return this.copper_limit;
    }

    public int getMax_limit() {
        return this.max_limit;
    }

    public int getShare() {
        return this.share;
    }

    public List<UserBookItem> getUser_books() {
        return this.user_books;
    }

    public Iterator<UserBookItem> getUser_booksIterator() {
        List<UserBookItem> list = this.user_books;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getUser_booksSize() {
        List<UserBookItem> list = this.user_books;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetCopper_limit() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetMax_limit() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetShare() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetUser_books() {
        return this.user_books != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserBookInfo setCopper_limit(int copper_limit) {
        this.copper_limit = copper_limit;
        setCopper_limitIsSet(true);
        return this;
    }

    public void setCopper_limitIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public UserBookInfo setMax_limit(int max_limit) {
        this.max_limit = max_limit;
        setMax_limitIsSet(true);
        return this;
    }

    public void setMax_limitIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public UserBookInfo setShare(int share) {
        this.share = share;
        setShareIsSet(true);
        return this;
    }

    public void setShareIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public UserBookInfo setUser_books(List<UserBookItem> user_books) {
        this.user_books = user_books;
        return this;
    }

    public void setUser_booksIsSet(boolean value) {
        if (value) {
            return;
        }
        this.user_books = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserBookInfo(");
        sb2.append("max_limit:");
        sb2.append(this.max_limit);
        sb2.append(j2.O);
        sb2.append("user_books:");
        List<UserBookItem> list = this.user_books;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        if (isSetCopper_limit()) {
            sb2.append(j2.O);
            sb2.append("copper_limit:");
            sb2.append(this.copper_limit);
        }
        if (isSetShare()) {
            sb2.append(j2.O);
            sb2.append("share:");
            sb2.append(this.share);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetCopper_limit() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetMax_limit() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetShare() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetUser_books() {
        this.user_books = null;
    }

    public void validate() throws TException {
        if (this.user_books != null) {
            return;
        }
        throw new TProtocolException("Required field 'user_books' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(UserBookInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetMax_limit()).compareTo(Boolean.valueOf(other.isSetMax_limit()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetMax_limit() && (compareTo4 = TBaseHelper.compareTo(this.max_limit, other.max_limit)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetUser_books()).compareTo(Boolean.valueOf(other.isSetUser_books()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetUser_books() && (compareTo3 = TBaseHelper.compareTo((List) this.user_books, (List) other.user_books)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetCopper_limit()).compareTo(Boolean.valueOf(other.isSetCopper_limit()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetCopper_limit() && (compareTo2 = TBaseHelper.compareTo(this.copper_limit, other.copper_limit)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetShare()).compareTo(Boolean.valueOf(other.isSetShare()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetShare() || (compareTo = TBaseHelper.compareTo(this.share, other.share)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserBookInfo, _Fields> deepCopy2() {
        return new UserBookInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_book$UserBookInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getMax_limit());
        }
        if (i11 == 2) {
            return getUser_books();
        }
        if (i11 == 3) {
            return Integer.valueOf(getCopper_limit());
        }
        if (i11 == 4) {
            return Integer.valueOf(getShare());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_book$UserBookInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetMax_limit();
        }
        if (i11 == 2) {
            return isSetUser_books();
        }
        if (i11 == 3) {
            return isSetCopper_limit();
        }
        if (i11 == 4) {
            return isSetShare();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_book$UserBookInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetMax_limit();
                return;
            } else {
                setMax_limit(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetUser_books();
                return;
            } else {
                setUser_books((List) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetCopper_limit();
                return;
            } else {
                setCopper_limit(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetShare();
        } else {
            setShare(((Integer) value).intValue());
        }
    }

    public boolean equals(UserBookInfo that) {
        if (that == null || this.max_limit != that.max_limit) {
            return false;
        }
        boolean isSetUser_books = isSetUser_books();
        boolean isSetUser_books2 = that.isSetUser_books();
        if ((isSetUser_books || isSetUser_books2) && !(isSetUser_books && isSetUser_books2 && this.user_books.equals(that.user_books))) {
            return false;
        }
        boolean isSetCopper_limit = isSetCopper_limit();
        boolean isSetCopper_limit2 = that.isSetCopper_limit();
        if ((isSetCopper_limit || isSetCopper_limit2) && !(isSetCopper_limit && isSetCopper_limit2 && this.copper_limit == that.copper_limit)) {
            return false;
        }
        boolean isSetShare = isSetShare();
        boolean isSetShare2 = that.isSetShare();
        if (isSetShare || isSetShare2) {
            return isSetShare && isSetShare2 && this.share == that.share;
        }
        return true;
    }

    public UserBookInfo(int max_limit, List<UserBookItem> user_books) {
        this();
        this.max_limit = max_limit;
        setMax_limitIsSet(true);
        this.user_books = user_books;
    }

    public UserBookInfo(UserBookInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.COPPER_LIMIT, _Fields.SHARE};
        this.__isset_bitfield = other.__isset_bitfield;
        this.max_limit = other.max_limit;
        if (other.isSetUser_books()) {
            ArrayList arrayList = new ArrayList(other.user_books.size());
            Iterator<UserBookItem> it = other.user_books.iterator();
            while (it.hasNext()) {
                arrayList.add(new UserBookItem(it.next()));
            }
            this.user_books = arrayList;
        }
        this.copper_limit = other.copper_limit;
        this.share = other.share;
    }
}
