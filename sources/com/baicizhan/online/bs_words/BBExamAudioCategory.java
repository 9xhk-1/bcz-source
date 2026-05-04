package com.baicizhan.online.bs_words;

import com.baicizhan.online.bs_users.BBRedirectInfo;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TBase;
import org.apache.thrift.TBaseHelper;
import org.apache.thrift.TException;
import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TField;
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
public class BBExamAudioCategory implements TBase<BBExamAudioCategory, _Fields>, Serializable, Cloneable, Comparable<BBExamAudioCategory> {
    private static final int __CATEGORY_ID_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int category_id;
    public String category_name;
    public String img_url;
    public BBRedirectInfo mall_info;
    private _Fields[] optionals;
    private static final TStruct STRUCT_DESC = new TStruct("BBExamAudioCategory");
    private static final TField CATEGORY_ID_FIELD_DESC = new TField("category_id", (byte) 8, 1);
    private static final TField CATEGORY_NAME_FIELD_DESC = new TField("category_name", (byte) 11, 2);
    private static final TField IMG_URL_FIELD_DESC = new TField(com.baicizhan.main.activity.schedule_v2.e.f19255e, (byte) 11, 3);
    private static final TField MALL_INFO_FIELD_DESC = new TField("mall_info", (byte) 12, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_words.BBExamAudioCategory$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_words$BBExamAudioCategory$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_words$BBExamAudioCategory$_Fields = iArr;
            try {
                iArr[_Fields.CATEGORY_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBExamAudioCategory$_Fields[_Fields.CATEGORY_NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBExamAudioCategory$_Fields[_Fields.IMG_URL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBExamAudioCategory$_Fields[_Fields.MALL_INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBExamAudioCategoryStandardScheme extends StandardScheme<BBExamAudioCategory> {
        private BBExamAudioCategoryStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BBExamAudioCategory struct) throws TException {
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
                            } else if (b11 == 12) {
                                BBRedirectInfo bBRedirectInfo = new BBRedirectInfo();
                                struct.mall_info = bBRedirectInfo;
                                bBRedirectInfo.read(iprot);
                                struct.setMall_infoIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 11) {
                            struct.img_url = iprot.readString();
                            struct.setImg_urlIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.category_name = iprot.readString();
                        struct.setCategory_nameIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.category_id = iprot.readI32();
                    struct.setCategory_idIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetCategory_id()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'category_id' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BBExamAudioCategory struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BBExamAudioCategory.STRUCT_DESC);
            oprot.writeFieldBegin(BBExamAudioCategory.CATEGORY_ID_FIELD_DESC);
            oprot.writeI32(struct.category_id);
            oprot.writeFieldEnd();
            if (struct.category_name != null) {
                oprot.writeFieldBegin(BBExamAudioCategory.CATEGORY_NAME_FIELD_DESC);
                oprot.writeString(struct.category_name);
                oprot.writeFieldEnd();
            }
            if (struct.img_url != null) {
                oprot.writeFieldBegin(BBExamAudioCategory.IMG_URL_FIELD_DESC);
                oprot.writeString(struct.img_url);
                oprot.writeFieldEnd();
            }
            if (struct.mall_info != null && struct.isSetMall_info()) {
                oprot.writeFieldBegin(BBExamAudioCategory.MALL_INFO_FIELD_DESC);
                struct.mall_info.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBExamAudioCategoryStandardSchemeFactory implements SchemeFactory {
        private BBExamAudioCategoryStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBExamAudioCategoryStandardScheme getScheme() {
            return new BBExamAudioCategoryStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBExamAudioCategoryTupleScheme extends TupleScheme<BBExamAudioCategory> {
        private BBExamAudioCategoryTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BBExamAudioCategory struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.category_id = tTupleProtocol.readI32();
            struct.setCategory_idIsSet(true);
            struct.category_name = tTupleProtocol.readString();
            struct.setCategory_nameIsSet(true);
            struct.img_url = tTupleProtocol.readString();
            struct.setImg_urlIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                BBRedirectInfo bBRedirectInfo = new BBRedirectInfo();
                struct.mall_info = bBRedirectInfo;
                bBRedirectInfo.read(tTupleProtocol);
                struct.setMall_infoIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BBExamAudioCategory struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.category_id);
            tTupleProtocol.writeString(struct.category_name);
            tTupleProtocol.writeString(struct.img_url);
            BitSet bitSet = new BitSet();
            if (struct.isSetMall_info()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetMall_info()) {
                struct.mall_info.write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBExamAudioCategoryTupleSchemeFactory implements SchemeFactory {
        private BBExamAudioCategoryTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBExamAudioCategoryTupleScheme getScheme() {
            return new BBExamAudioCategoryTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        CATEGORY_ID(1, "category_id"),
        CATEGORY_NAME(2, "category_name"),
        IMG_URL(3, com.baicizhan.main.activity.schedule_v2.e.f19255e),
        MALL_INFO(4, "mall_info");

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
                return CATEGORY_ID;
            }
            if (fieldId == 2) {
                return CATEGORY_NAME;
            }
            if (fieldId == 3) {
                return IMG_URL;
            }
            if (fieldId != 4) {
                return null;
            }
            return MALL_INFO;
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
        hashMap.put(StandardScheme.class, new BBExamAudioCategoryStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BBExamAudioCategoryTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.CATEGORY_ID, (_Fields) new FieldMetaData("category_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.CATEGORY_NAME, (_Fields) new FieldMetaData("category_name", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.IMG_URL, (_Fields) new FieldMetaData(com.baicizhan.main.activity.schedule_v2.e.f19255e, (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.MALL_INFO, (_Fields) new FieldMetaData("mall_info", (byte) 2, new StructMetaData((byte) 12, BBRedirectInfo.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BBExamAudioCategory.class, unmodifiableMap);
    }

    public BBExamAudioCategory() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.MALL_INFO};
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

    @Override // org.apache.thrift.TBase
    public void clear() {
        setCategory_idIsSet(false);
        this.category_id = 0;
        this.category_name = null;
        this.img_url = null;
        this.mall_info = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BBExamAudioCategory)) {
            return equals((BBExamAudioCategory) that);
        }
        return false;
    }

    public int getCategory_id() {
        return this.category_id;
    }

    public String getCategory_name() {
        return this.category_name;
    }

    public String getImg_url() {
        return this.img_url;
    }

    public BBRedirectInfo getMall_info() {
        return this.mall_info;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetCategory_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetCategory_name() {
        return this.category_name != null;
    }

    public boolean isSetImg_url() {
        return this.img_url != null;
    }

    public boolean isSetMall_info() {
        return this.mall_info != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BBExamAudioCategory setCategory_id(int category_id) {
        this.category_id = category_id;
        setCategory_idIsSet(true);
        return this;
    }

    public void setCategory_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public BBExamAudioCategory setCategory_name(String category_name) {
        this.category_name = category_name;
        return this;
    }

    public void setCategory_nameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.category_name = null;
    }

    public BBExamAudioCategory setImg_url(String img_url) {
        this.img_url = img_url;
        return this;
    }

    public void setImg_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.img_url = null;
    }

    public BBExamAudioCategory setMall_info(BBRedirectInfo mall_info) {
        this.mall_info = mall_info;
        return this;
    }

    public void setMall_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.mall_info = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BBExamAudioCategory(");
        sb2.append("category_id:");
        sb2.append(this.category_id);
        sb2.append(j2.O);
        sb2.append("category_name:");
        String str = this.category_name;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("img_url:");
        String str2 = this.img_url;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        if (isSetMall_info()) {
            sb2.append(j2.O);
            sb2.append("mall_info:");
            BBRedirectInfo bBRedirectInfo = this.mall_info;
            if (bBRedirectInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(bBRedirectInfo);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetCategory_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetCategory_name() {
        this.category_name = null;
    }

    public void unsetImg_url() {
        this.img_url = null;
    }

    public void unsetMall_info() {
        this.mall_info = null;
    }

    public void validate() throws TException {
        if (this.category_name == null) {
            throw new TProtocolException("Required field 'category_name' was not present! Struct: " + toString());
        }
        if (this.img_url == null) {
            throw new TProtocolException("Required field 'img_url' was not present! Struct: " + toString());
        }
        BBRedirectInfo bBRedirectInfo = this.mall_info;
        if (bBRedirectInfo != null) {
            bBRedirectInfo.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BBExamAudioCategory other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetCategory_id()).compareTo(Boolean.valueOf(other.isSetCategory_id()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetCategory_id() && (compareTo4 = TBaseHelper.compareTo(this.category_id, other.category_id)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetCategory_name()).compareTo(Boolean.valueOf(other.isSetCategory_name()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetCategory_name() && (compareTo3 = TBaseHelper.compareTo(this.category_name, other.category_name)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetImg_url()).compareTo(Boolean.valueOf(other.isSetImg_url()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetImg_url() && (compareTo2 = TBaseHelper.compareTo(this.img_url, other.img_url)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetMall_info()).compareTo(Boolean.valueOf(other.isSetMall_info()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetMall_info() || (compareTo = TBaseHelper.compareTo((Comparable) this.mall_info, (Comparable) other.mall_info)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BBExamAudioCategory, _Fields> deepCopy2() {
        return new BBExamAudioCategory(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBExamAudioCategory$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getCategory_id());
        }
        if (i11 == 2) {
            return getCategory_name();
        }
        if (i11 == 3) {
            return getImg_url();
        }
        if (i11 == 4) {
            return getMall_info();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBExamAudioCategory$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetCategory_id();
        }
        if (i11 == 2) {
            return isSetCategory_name();
        }
        if (i11 == 3) {
            return isSetImg_url();
        }
        if (i11 == 4) {
            return isSetMall_info();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBExamAudioCategory$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetCategory_id();
                return;
            } else {
                setCategory_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetCategory_name();
                return;
            } else {
                setCategory_name((String) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetImg_url();
                return;
            } else {
                setImg_url((String) value);
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetMall_info();
        } else {
            setMall_info((BBRedirectInfo) value);
        }
    }

    public boolean equals(BBExamAudioCategory that) {
        if (that == null || this.category_id != that.category_id) {
            return false;
        }
        boolean isSetCategory_name = isSetCategory_name();
        boolean isSetCategory_name2 = that.isSetCategory_name();
        if ((isSetCategory_name || isSetCategory_name2) && !(isSetCategory_name && isSetCategory_name2 && this.category_name.equals(that.category_name))) {
            return false;
        }
        boolean isSetImg_url = isSetImg_url();
        boolean isSetImg_url2 = that.isSetImg_url();
        if ((isSetImg_url || isSetImg_url2) && !(isSetImg_url && isSetImg_url2 && this.img_url.equals(that.img_url))) {
            return false;
        }
        boolean isSetMall_info = isSetMall_info();
        boolean isSetMall_info2 = that.isSetMall_info();
        if (isSetMall_info || isSetMall_info2) {
            return isSetMall_info && isSetMall_info2 && this.mall_info.equals(that.mall_info);
        }
        return true;
    }

    public BBExamAudioCategory(int category_id, String category_name, String img_url) {
        this();
        this.category_id = category_id;
        setCategory_idIsSet(true);
        this.category_name = category_name;
        this.img_url = img_url;
    }

    public BBExamAudioCategory(BBExamAudioCategory other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.MALL_INFO};
        this.__isset_bitfield = other.__isset_bitfield;
        this.category_id = other.category_id;
        if (other.isSetCategory_name()) {
            this.category_name = other.category_name;
        }
        if (other.isSetImg_url()) {
            this.img_url = other.img_url;
        }
        if (other.isSetMall_info()) {
            this.mall_info = new BBRedirectInfo(other.mall_info);
        }
    }
}
