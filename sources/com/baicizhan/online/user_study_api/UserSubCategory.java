package com.baicizhan.online.user_study_api;

import com.baicizhan.client.business.dataset.provider.a;
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
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
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
public class UserSubCategory implements TBase<UserSubCategory, _Fields>, Serializable, Cloneable, Comparable<UserSubCategory> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public List<Integer> book_ids;
    public String sub_name;
    private static final TStruct STRUCT_DESC = new TStruct("UserSubCategory");
    private static final TField SUB_NAME_FIELD_DESC = new TField("sub_name", (byte) 11, 1);
    private static final TField BOOK_IDS_FIELD_DESC = new TField(a.f.C0247a.f16190b, (byte) 15, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.UserSubCategory$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$UserSubCategory$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$UserSubCategory$_Fields = iArr;
            try {
                iArr[_Fields.SUB_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserSubCategory$_Fields[_Fields.BOOK_IDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserSubCategoryStandardScheme extends StandardScheme<UserSubCategory> {
        private UserSubCategoryStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserSubCategory struct) throws TException {
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
                        struct.book_ids = new ArrayList(readListBegin.size);
                        for (int i11 = 0; i11 < readListBegin.size; i11++) {
                            struct.book_ids.add(Integer.valueOf(iprot.readI32()));
                        }
                        iprot.readListEnd();
                        struct.setBook_idsIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.sub_name = iprot.readString();
                    struct.setSub_nameIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, UserSubCategory struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserSubCategory.STRUCT_DESC);
            if (struct.sub_name != null) {
                oprot.writeFieldBegin(UserSubCategory.SUB_NAME_FIELD_DESC);
                oprot.writeString(struct.sub_name);
                oprot.writeFieldEnd();
            }
            if (struct.book_ids != null) {
                oprot.writeFieldBegin(UserSubCategory.BOOK_IDS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 8, struct.book_ids.size()));
                Iterator<Integer> it = struct.book_ids.iterator();
                while (it.hasNext()) {
                    oprot.writeI32(it.next().intValue());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserSubCategoryStandardSchemeFactory implements SchemeFactory {
        private UserSubCategoryStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserSubCategoryStandardScheme getScheme() {
            return new UserSubCategoryStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserSubCategoryTupleScheme extends TupleScheme<UserSubCategory> {
        private UserSubCategoryTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserSubCategory struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.sub_name = tTupleProtocol.readString();
            struct.setSub_nameIsSet(true);
            TList tList = new TList((byte) 8, tTupleProtocol.readI32());
            struct.book_ids = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                struct.book_ids.add(Integer.valueOf(tTupleProtocol.readI32()));
            }
            struct.setBook_idsIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserSubCategory struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.sub_name);
            tTupleProtocol.writeI32(struct.book_ids.size());
            Iterator<Integer> it = struct.book_ids.iterator();
            while (it.hasNext()) {
                tTupleProtocol.writeI32(it.next().intValue());
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserSubCategoryTupleSchemeFactory implements SchemeFactory {
        private UserSubCategoryTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserSubCategoryTupleScheme getScheme() {
            return new UserSubCategoryTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        SUB_NAME(1, "sub_name"),
        BOOK_IDS(2, a.f.C0247a.f16190b);

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
                return SUB_NAME;
            }
            if (fieldId != 2) {
                return null;
            }
            return BOOK_IDS;
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
        hashMap.put(StandardScheme.class, new UserSubCategoryStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserSubCategoryTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.SUB_NAME, (_Fields) new FieldMetaData("sub_name", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.BOOK_IDS, (_Fields) new FieldMetaData(a.f.C0247a.f16190b, (byte) 1, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 8))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserSubCategory.class, unmodifiableMap);
    }

    public UserSubCategory() {
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

    public void addToBook_ids(int elem) {
        if (this.book_ids == null) {
            this.book_ids = new ArrayList();
        }
        this.book_ids.add(Integer.valueOf(elem));
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.sub_name = null;
        this.book_ids = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserSubCategory)) {
            return equals((UserSubCategory) that);
        }
        return false;
    }

    public List<Integer> getBook_ids() {
        return this.book_ids;
    }

    public Iterator<Integer> getBook_idsIterator() {
        List<Integer> list = this.book_ids;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getBook_idsSize() {
        List<Integer> list = this.book_ids;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public String getSub_name() {
        return this.sub_name;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetBook_ids() {
        return this.book_ids != null;
    }

    public boolean isSetSub_name() {
        return this.sub_name != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserSubCategory setBook_ids(List<Integer> book_ids) {
        this.book_ids = book_ids;
        return this;
    }

    public void setBook_idsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.book_ids = null;
    }

    public UserSubCategory setSub_name(String sub_name) {
        this.sub_name = sub_name;
        return this;
    }

    public void setSub_nameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.sub_name = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserSubCategory(");
        sb2.append("sub_name:");
        String str = this.sub_name;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("book_ids:");
        List<Integer> list = this.book_ids;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetBook_ids() {
        this.book_ids = null;
    }

    public void unsetSub_name() {
        this.sub_name = null;
    }

    public void validate() throws TException {
        if (this.sub_name == null) {
            throw new TProtocolException("Required field 'sub_name' was not present! Struct: " + toString());
        }
        if (this.book_ids != null) {
            return;
        }
        throw new TProtocolException("Required field 'book_ids' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    public UserSubCategory(String sub_name, List<Integer> book_ids) {
        this();
        this.sub_name = sub_name;
        this.book_ids = book_ids;
    }

    @Override // java.lang.Comparable
    public int compareTo(UserSubCategory other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetSub_name()).compareTo(Boolean.valueOf(other.isSetSub_name()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetSub_name() && (compareTo2 = TBaseHelper.compareTo(this.sub_name, other.sub_name)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetBook_ids()).compareTo(Boolean.valueOf(other.isSetBook_ids()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetBook_ids() || (compareTo = TBaseHelper.compareTo((List) this.book_ids, (List) other.book_ids)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserSubCategory, _Fields> deepCopy2() {
        return new UserSubCategory(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserSubCategory$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getSub_name();
        }
        if (i11 == 2) {
            return getBook_ids();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserSubCategory$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetSub_name();
        }
        if (i11 == 2) {
            return isSetBook_ids();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserSubCategory$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetSub_name();
                return;
            } else {
                setSub_name((String) value);
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetBook_ids();
        } else {
            setBook_ids((List) value);
        }
    }

    public boolean equals(UserSubCategory that) {
        if (that == null) {
            return false;
        }
        boolean isSetSub_name = isSetSub_name();
        boolean isSetSub_name2 = that.isSetSub_name();
        if ((isSetSub_name || isSetSub_name2) && !(isSetSub_name && isSetSub_name2 && this.sub_name.equals(that.sub_name))) {
            return false;
        }
        boolean isSetBook_ids = isSetBook_ids();
        boolean isSetBook_ids2 = that.isSetBook_ids();
        if (isSetBook_ids || isSetBook_ids2) {
            return isSetBook_ids && isSetBook_ids2 && this.book_ids.equals(that.book_ids);
        }
        return true;
    }

    public UserSubCategory(UserSubCategory other) {
        if (other.isSetSub_name()) {
            this.sub_name = other.sub_name;
        }
        if (other.isSetBook_ids()) {
            this.book_ids = new ArrayList(other.book_ids);
        }
    }
}
