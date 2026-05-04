package com.baicizhan.online.user_study_api;

import com.meizu.cloud.pushsdk.constants.PushConstants;
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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class UserBookCategory implements TBase<UserBookCategory, _Fields>, Serializable, Cloneable, Comparable<UserBookCategory> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public String cate_id;
    public String category_name;
    private _Fields[] optionals;
    public List<UserSubCategory> sub_categories;
    public String tag_name;
    private static final TStruct STRUCT_DESC = new TStruct("UserBookCategory");
    private static final TField CATEGORY_NAME_FIELD_DESC = new TField("category_name", (byte) 11, 1);
    private static final TField SUB_CATEGORIES_FIELD_DESC = new TField("sub_categories", (byte) 15, 2);
    private static final TField TAG_NAME_FIELD_DESC = new TField(PushConstants.SUB_TAGS_STATUS_NAME, (byte) 11, 3);
    private static final TField CATE_ID_FIELD_DESC = new TField("cate_id", (byte) 11, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.UserBookCategory$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$UserBookCategory$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$UserBookCategory$_Fields = iArr;
            try {
                iArr[_Fields.CATEGORY_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserBookCategory$_Fields[_Fields.SUB_CATEGORIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserBookCategory$_Fields[_Fields.TAG_NAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserBookCategory$_Fields[_Fields.CATE_ID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBookCategoryStandardScheme extends StandardScheme<UserBookCategory> {
        private UserBookCategoryStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserBookCategory struct) throws TException {
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
                            } else if (b11 == 11) {
                                struct.cate_id = iprot.readString();
                                struct.setCate_idIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 11) {
                            struct.tag_name = iprot.readString();
                            struct.setTag_nameIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 15) {
                        TList readListBegin = iprot.readListBegin();
                        struct.sub_categories = new ArrayList(readListBegin.size);
                        for (int i11 = 0; i11 < readListBegin.size; i11++) {
                            UserSubCategory userSubCategory = new UserSubCategory();
                            userSubCategory.read(iprot);
                            struct.sub_categories.add(userSubCategory);
                        }
                        iprot.readListEnd();
                        struct.setSub_categoriesIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.category_name = iprot.readString();
                    struct.setCategory_nameIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, UserBookCategory struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserBookCategory.STRUCT_DESC);
            if (struct.category_name != null) {
                oprot.writeFieldBegin(UserBookCategory.CATEGORY_NAME_FIELD_DESC);
                oprot.writeString(struct.category_name);
                oprot.writeFieldEnd();
            }
            if (struct.sub_categories != null) {
                oprot.writeFieldBegin(UserBookCategory.SUB_CATEGORIES_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.sub_categories.size()));
                Iterator<UserSubCategory> it = struct.sub_categories.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.tag_name != null && struct.isSetTag_name()) {
                oprot.writeFieldBegin(UserBookCategory.TAG_NAME_FIELD_DESC);
                oprot.writeString(struct.tag_name);
                oprot.writeFieldEnd();
            }
            if (struct.cate_id != null && struct.isSetCate_id()) {
                oprot.writeFieldBegin(UserBookCategory.CATE_ID_FIELD_DESC);
                oprot.writeString(struct.cate_id);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBookCategoryStandardSchemeFactory implements SchemeFactory {
        private UserBookCategoryStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserBookCategoryStandardScheme getScheme() {
            return new UserBookCategoryStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBookCategoryTupleScheme extends TupleScheme<UserBookCategory> {
        private UserBookCategoryTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserBookCategory struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.category_name = tTupleProtocol.readString();
            struct.setCategory_nameIsSet(true);
            TList tList = new TList((byte) 12, tTupleProtocol.readI32());
            struct.sub_categories = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                UserSubCategory userSubCategory = new UserSubCategory();
                userSubCategory.read(tTupleProtocol);
                struct.sub_categories.add(userSubCategory);
            }
            struct.setSub_categoriesIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(2);
            if (readBitSet.get(0)) {
                struct.tag_name = tTupleProtocol.readString();
                struct.setTag_nameIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.cate_id = tTupleProtocol.readString();
                struct.setCate_idIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserBookCategory struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.category_name);
            tTupleProtocol.writeI32(struct.sub_categories.size());
            Iterator<UserSubCategory> it = struct.sub_categories.iterator();
            while (it.hasNext()) {
                it.next().write(tTupleProtocol);
            }
            BitSet bitSet = new BitSet();
            if (struct.isSetTag_name()) {
                bitSet.set(0);
            }
            if (struct.isSetCate_id()) {
                bitSet.set(1);
            }
            tTupleProtocol.writeBitSet(bitSet, 2);
            if (struct.isSetTag_name()) {
                tTupleProtocol.writeString(struct.tag_name);
            }
            if (struct.isSetCate_id()) {
                tTupleProtocol.writeString(struct.cate_id);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBookCategoryTupleSchemeFactory implements SchemeFactory {
        private UserBookCategoryTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserBookCategoryTupleScheme getScheme() {
            return new UserBookCategoryTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        CATEGORY_NAME(1, "category_name"),
        SUB_CATEGORIES(2, "sub_categories"),
        TAG_NAME(3, PushConstants.SUB_TAGS_STATUS_NAME),
        CATE_ID(4, "cate_id");

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
                return CATEGORY_NAME;
            }
            if (fieldId == 2) {
                return SUB_CATEGORIES;
            }
            if (fieldId == 3) {
                return TAG_NAME;
            }
            if (fieldId != 4) {
                return null;
            }
            return CATE_ID;
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
        hashMap.put(StandardScheme.class, new UserBookCategoryStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserBookCategoryTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.CATEGORY_NAME, (_Fields) new FieldMetaData("category_name", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SUB_CATEGORIES, (_Fields) new FieldMetaData("sub_categories", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, UserSubCategory.class))));
        enumMap.put((EnumMap) _Fields.TAG_NAME, (_Fields) new FieldMetaData(PushConstants.SUB_TAGS_STATUS_NAME, (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.CATE_ID, (_Fields) new FieldMetaData("cate_id", (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserBookCategory.class, unmodifiableMap);
    }

    public UserBookCategory() {
        this.optionals = new _Fields[]{_Fields.TAG_NAME, _Fields.CATE_ID};
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

    public void addToSub_categories(UserSubCategory elem) {
        if (this.sub_categories == null) {
            this.sub_categories = new ArrayList();
        }
        this.sub_categories.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.category_name = null;
        this.sub_categories = null;
        this.tag_name = null;
        this.cate_id = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserBookCategory)) {
            return equals((UserBookCategory) that);
        }
        return false;
    }

    public String getCate_id() {
        return this.cate_id;
    }

    public String getCategory_name() {
        return this.category_name;
    }

    public List<UserSubCategory> getSub_categories() {
        return this.sub_categories;
    }

    public Iterator<UserSubCategory> getSub_categoriesIterator() {
        List<UserSubCategory> list = this.sub_categories;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getSub_categoriesSize() {
        List<UserSubCategory> list = this.sub_categories;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public String getTag_name() {
        return this.tag_name;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetCate_id() {
        return this.cate_id != null;
    }

    public boolean isSetCategory_name() {
        return this.category_name != null;
    }

    public boolean isSetSub_categories() {
        return this.sub_categories != null;
    }

    public boolean isSetTag_name() {
        return this.tag_name != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserBookCategory setCate_id(String cate_id) {
        this.cate_id = cate_id;
        return this;
    }

    public void setCate_idIsSet(boolean value) {
        if (value) {
            return;
        }
        this.cate_id = null;
    }

    public UserBookCategory setCategory_name(String category_name) {
        this.category_name = category_name;
        return this;
    }

    public void setCategory_nameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.category_name = null;
    }

    public UserBookCategory setSub_categories(List<UserSubCategory> sub_categories) {
        this.sub_categories = sub_categories;
        return this;
    }

    public void setSub_categoriesIsSet(boolean value) {
        if (value) {
            return;
        }
        this.sub_categories = null;
    }

    public UserBookCategory setTag_name(String tag_name) {
        this.tag_name = tag_name;
        return this;
    }

    public void setTag_nameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.tag_name = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserBookCategory(");
        sb2.append("category_name:");
        String str = this.category_name;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("sub_categories:");
        List<UserSubCategory> list = this.sub_categories;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        if (isSetTag_name()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("tag_name:");
            String str2 = this.tag_name;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
        }
        if (isSetCate_id()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("cate_id:");
            String str3 = this.cate_id;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetCate_id() {
        this.cate_id = null;
    }

    public void unsetCategory_name() {
        this.category_name = null;
    }

    public void unsetSub_categories() {
        this.sub_categories = null;
    }

    public void unsetTag_name() {
        this.tag_name = null;
    }

    public void validate() throws TException {
        if (this.category_name == null) {
            throw new TProtocolException("Required field 'category_name' was not present! Struct: " + toString());
        }
        if (this.sub_categories != null) {
            return;
        }
        throw new TProtocolException("Required field 'sub_categories' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(UserBookCategory other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetCategory_name()).compareTo(Boolean.valueOf(other.isSetCategory_name()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetCategory_name() && (compareTo4 = TBaseHelper.compareTo(this.category_name, other.category_name)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetSub_categories()).compareTo(Boolean.valueOf(other.isSetSub_categories()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetSub_categories() && (compareTo3 = TBaseHelper.compareTo((List) this.sub_categories, (List) other.sub_categories)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetTag_name()).compareTo(Boolean.valueOf(other.isSetTag_name()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetTag_name() && (compareTo2 = TBaseHelper.compareTo(this.tag_name, other.tag_name)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetCate_id()).compareTo(Boolean.valueOf(other.isSetCate_id()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetCate_id() || (compareTo = TBaseHelper.compareTo(this.cate_id, other.cate_id)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserBookCategory, _Fields> deepCopy2() {
        return new UserBookCategory(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserBookCategory$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getCategory_name();
        }
        if (i11 == 2) {
            return getSub_categories();
        }
        if (i11 == 3) {
            return getTag_name();
        }
        if (i11 == 4) {
            return getCate_id();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserBookCategory$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetCategory_name();
        }
        if (i11 == 2) {
            return isSetSub_categories();
        }
        if (i11 == 3) {
            return isSetTag_name();
        }
        if (i11 == 4) {
            return isSetCate_id();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserBookCategory$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetCategory_name();
                return;
            } else {
                setCategory_name((String) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetSub_categories();
                return;
            } else {
                setSub_categories((List) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetTag_name();
                return;
            } else {
                setTag_name((String) value);
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetCate_id();
        } else {
            setCate_id((String) value);
        }
    }

    public UserBookCategory(String category_name, List<UserSubCategory> sub_categories) {
        this();
        this.category_name = category_name;
        this.sub_categories = sub_categories;
    }

    public boolean equals(UserBookCategory that) {
        if (that == null) {
            return false;
        }
        boolean isSetCategory_name = isSetCategory_name();
        boolean isSetCategory_name2 = that.isSetCategory_name();
        if ((isSetCategory_name || isSetCategory_name2) && !(isSetCategory_name && isSetCategory_name2 && this.category_name.equals(that.category_name))) {
            return false;
        }
        boolean isSetSub_categories = isSetSub_categories();
        boolean isSetSub_categories2 = that.isSetSub_categories();
        if ((isSetSub_categories || isSetSub_categories2) && !(isSetSub_categories && isSetSub_categories2 && this.sub_categories.equals(that.sub_categories))) {
            return false;
        }
        boolean isSetTag_name = isSetTag_name();
        boolean isSetTag_name2 = that.isSetTag_name();
        if ((isSetTag_name || isSetTag_name2) && !(isSetTag_name && isSetTag_name2 && this.tag_name.equals(that.tag_name))) {
            return false;
        }
        boolean isSetCate_id = isSetCate_id();
        boolean isSetCate_id2 = that.isSetCate_id();
        if (isSetCate_id || isSetCate_id2) {
            return isSetCate_id && isSetCate_id2 && this.cate_id.equals(that.cate_id);
        }
        return true;
    }

    public UserBookCategory(UserBookCategory other) {
        this.optionals = new _Fields[]{_Fields.TAG_NAME, _Fields.CATE_ID};
        if (other.isSetCategory_name()) {
            this.category_name = other.category_name;
        }
        if (other.isSetSub_categories()) {
            ArrayList arrayList = new ArrayList(other.sub_categories.size());
            Iterator<UserSubCategory> it = other.sub_categories.iterator();
            while (it.hasNext()) {
                arrayList.add(new UserSubCategory(it.next()));
            }
            this.sub_categories = arrayList;
        }
        if (other.isSetTag_name()) {
            this.tag_name = other.tag_name;
        }
        if (other.isSetCate_id()) {
            this.cate_id = other.cate_id;
        }
    }
}
