package com.baicizhan.online.strategy_api;

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
public class MemberSaleInfo implements TBase<MemberSaleInfo, _Fields>, Serializable, Cloneable, Comparable<MemberSaleInfo> {
    private static final int __MEMBER_TYPE_ISSET_ID = 0;
    private static final int __ORIGIN_PRICE_ISSET_ID = 2;
    private static final int __PRICE_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public EntitlementMallGoodsInfo mall_goods_info;
    public int member_type;
    private _Fields[] optionals;
    public int origin_price;
    public int price;
    public String tag;
    private static final TStruct STRUCT_DESC = new TStruct("MemberSaleInfo");
    private static final TField MEMBER_TYPE_FIELD_DESC = new TField("member_type", (byte) 8, 1);
    private static final TField PRICE_FIELD_DESC = new TField("price", (byte) 8, 2);
    private static final TField ORIGIN_PRICE_FIELD_DESC = new TField("origin_price", (byte) 8, 3);
    private static final TField MALL_GOODS_INFO_FIELD_DESC = new TField("mall_goods_info", (byte) 12, 4);
    private static final TField TAG_FIELD_DESC = new TField("tag", (byte) 11, 5);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.strategy_api.MemberSaleInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$strategy_api$MemberSaleInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$strategy_api$MemberSaleInfo$_Fields = iArr;
            try {
                iArr[_Fields.MEMBER_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$strategy_api$MemberSaleInfo$_Fields[_Fields.PRICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$strategy_api$MemberSaleInfo$_Fields[_Fields.ORIGIN_PRICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$strategy_api$MemberSaleInfo$_Fields[_Fields.MALL_GOODS_INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$strategy_api$MemberSaleInfo$_Fields[_Fields.TAG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MemberSaleInfoStandardScheme extends StandardScheme<MemberSaleInfo> {
        private MemberSaleInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, MemberSaleInfo struct) throws TException {
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
                                if (s11 != 5) {
                                    TProtocolUtil.skip(iprot, b11);
                                } else if (b11 == 11) {
                                    struct.tag = iprot.readString();
                                    struct.setTagIsSet(true);
                                } else {
                                    TProtocolUtil.skip(iprot, b11);
                                }
                            } else if (b11 == 12) {
                                EntitlementMallGoodsInfo entitlementMallGoodsInfo = new EntitlementMallGoodsInfo();
                                struct.mall_goods_info = entitlementMallGoodsInfo;
                                entitlementMallGoodsInfo.read(iprot);
                                struct.setMall_goods_infoIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 8) {
                            struct.origin_price = iprot.readI32();
                            struct.setOrigin_priceIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.price = iprot.readI32();
                        struct.setPriceIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.member_type = iprot.readI32();
                    struct.setMember_typeIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetMember_type()) {
                throw new TProtocolException("Required field 'member_type' was not found in serialized data! Struct: " + toString());
            }
            if (!struct.isSetPrice()) {
                throw new TProtocolException("Required field 'price' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetOrigin_price()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'origin_price' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, MemberSaleInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(MemberSaleInfo.STRUCT_DESC);
            oprot.writeFieldBegin(MemberSaleInfo.MEMBER_TYPE_FIELD_DESC);
            oprot.writeI32(struct.member_type);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(MemberSaleInfo.PRICE_FIELD_DESC);
            oprot.writeI32(struct.price);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(MemberSaleInfo.ORIGIN_PRICE_FIELD_DESC);
            oprot.writeI32(struct.origin_price);
            oprot.writeFieldEnd();
            if (struct.mall_goods_info != null && struct.isSetMall_goods_info()) {
                oprot.writeFieldBegin(MemberSaleInfo.MALL_GOODS_INFO_FIELD_DESC);
                struct.mall_goods_info.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.tag != null) {
                oprot.writeFieldBegin(MemberSaleInfo.TAG_FIELD_DESC);
                oprot.writeString(struct.tag);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MemberSaleInfoStandardSchemeFactory implements SchemeFactory {
        private MemberSaleInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public MemberSaleInfoStandardScheme getScheme() {
            return new MemberSaleInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MemberSaleInfoTupleScheme extends TupleScheme<MemberSaleInfo> {
        private MemberSaleInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, MemberSaleInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.member_type = tTupleProtocol.readI32();
            struct.setMember_typeIsSet(true);
            struct.price = tTupleProtocol.readI32();
            struct.setPriceIsSet(true);
            struct.origin_price = tTupleProtocol.readI32();
            struct.setOrigin_priceIsSet(true);
            struct.tag = tTupleProtocol.readString();
            struct.setTagIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                EntitlementMallGoodsInfo entitlementMallGoodsInfo = new EntitlementMallGoodsInfo();
                struct.mall_goods_info = entitlementMallGoodsInfo;
                entitlementMallGoodsInfo.read(tTupleProtocol);
                struct.setMall_goods_infoIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, MemberSaleInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.member_type);
            tTupleProtocol.writeI32(struct.price);
            tTupleProtocol.writeI32(struct.origin_price);
            tTupleProtocol.writeString(struct.tag);
            BitSet bitSet = new BitSet();
            if (struct.isSetMall_goods_info()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetMall_goods_info()) {
                struct.mall_goods_info.write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MemberSaleInfoTupleSchemeFactory implements SchemeFactory {
        private MemberSaleInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public MemberSaleInfoTupleScheme getScheme() {
            return new MemberSaleInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        MEMBER_TYPE(1, "member_type"),
        PRICE(2, "price"),
        ORIGIN_PRICE(3, "origin_price"),
        MALL_GOODS_INFO(4, "mall_goods_info"),
        TAG(5, "tag");

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
                return MEMBER_TYPE;
            }
            if (fieldId == 2) {
                return PRICE;
            }
            if (fieldId == 3) {
                return ORIGIN_PRICE;
            }
            if (fieldId == 4) {
                return MALL_GOODS_INFO;
            }
            if (fieldId != 5) {
                return null;
            }
            return TAG;
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
        hashMap.put(StandardScheme.class, new MemberSaleInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new MemberSaleInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.MEMBER_TYPE, (_Fields) new FieldMetaData("member_type", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.PRICE, (_Fields) new FieldMetaData("price", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.ORIGIN_PRICE, (_Fields) new FieldMetaData("origin_price", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.MALL_GOODS_INFO, (_Fields) new FieldMetaData("mall_goods_info", (byte) 2, new StructMetaData((byte) 12, EntitlementMallGoodsInfo.class)));
        enumMap.put((EnumMap) _Fields.TAG, (_Fields) new FieldMetaData("tag", (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(MemberSaleInfo.class, unmodifiableMap);
    }

    public MemberSaleInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.MALL_GOODS_INFO};
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
        setMember_typeIsSet(false);
        this.member_type = 0;
        setPriceIsSet(false);
        this.price = 0;
        setOrigin_priceIsSet(false);
        this.origin_price = 0;
        this.mall_goods_info = null;
        this.tag = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof MemberSaleInfo)) {
            return equals((MemberSaleInfo) that);
        }
        return false;
    }

    public EntitlementMallGoodsInfo getMall_goods_info() {
        return this.mall_goods_info;
    }

    public int getMember_type() {
        return this.member_type;
    }

    public int getOrigin_price() {
        return this.origin_price;
    }

    public int getPrice() {
        return this.price;
    }

    public String getTag() {
        return this.tag;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetMall_goods_info() {
        return this.mall_goods_info != null;
    }

    public boolean isSetMember_type() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetOrigin_price() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetPrice() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetTag() {
        return this.tag != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public MemberSaleInfo setMall_goods_info(EntitlementMallGoodsInfo mall_goods_info) {
        this.mall_goods_info = mall_goods_info;
        return this;
    }

    public void setMall_goods_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.mall_goods_info = null;
    }

    public MemberSaleInfo setMember_type(int member_type) {
        this.member_type = member_type;
        setMember_typeIsSet(true);
        return this;
    }

    public void setMember_typeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public MemberSaleInfo setOrigin_price(int origin_price) {
        this.origin_price = origin_price;
        setOrigin_priceIsSet(true);
        return this;
    }

    public void setOrigin_priceIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public MemberSaleInfo setPrice(int price) {
        this.price = price;
        setPriceIsSet(true);
        return this;
    }

    public void setPriceIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public MemberSaleInfo setTag(String tag) {
        this.tag = tag;
        return this;
    }

    public void setTagIsSet(boolean value) {
        if (value) {
            return;
        }
        this.tag = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MemberSaleInfo(");
        sb2.append("member_type:");
        sb2.append(this.member_type);
        sb2.append(j2.O);
        sb2.append("price:");
        sb2.append(this.price);
        sb2.append(j2.O);
        sb2.append("origin_price:");
        sb2.append(this.origin_price);
        if (isSetMall_goods_info()) {
            sb2.append(j2.O);
            sb2.append("mall_goods_info:");
            EntitlementMallGoodsInfo entitlementMallGoodsInfo = this.mall_goods_info;
            if (entitlementMallGoodsInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(entitlementMallGoodsInfo);
            }
        }
        sb2.append(j2.O);
        sb2.append("tag:");
        String str = this.tag;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetMall_goods_info() {
        this.mall_goods_info = null;
    }

    public void unsetMember_type() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetOrigin_price() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetPrice() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetTag() {
        this.tag = null;
    }

    public void validate() throws TException {
        if (this.tag == null) {
            throw new TProtocolException("Required field 'tag' was not present! Struct: " + toString());
        }
        EntitlementMallGoodsInfo entitlementMallGoodsInfo = this.mall_goods_info;
        if (entitlementMallGoodsInfo != null) {
            entitlementMallGoodsInfo.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(MemberSaleInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo6 = Boolean.valueOf(isSetMember_type()).compareTo(Boolean.valueOf(other.isSetMember_type()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetMember_type() && (compareTo5 = TBaseHelper.compareTo(this.member_type, other.member_type)) != 0) {
            return compareTo5;
        }
        int compareTo7 = Boolean.valueOf(isSetPrice()).compareTo(Boolean.valueOf(other.isSetPrice()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetPrice() && (compareTo4 = TBaseHelper.compareTo(this.price, other.price)) != 0) {
            return compareTo4;
        }
        int compareTo8 = Boolean.valueOf(isSetOrigin_price()).compareTo(Boolean.valueOf(other.isSetOrigin_price()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetOrigin_price() && (compareTo3 = TBaseHelper.compareTo(this.origin_price, other.origin_price)) != 0) {
            return compareTo3;
        }
        int compareTo9 = Boolean.valueOf(isSetMall_goods_info()).compareTo(Boolean.valueOf(other.isSetMall_goods_info()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetMall_goods_info() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.mall_goods_info, (Comparable) other.mall_goods_info)) != 0) {
            return compareTo2;
        }
        int compareTo10 = Boolean.valueOf(isSetTag()).compareTo(Boolean.valueOf(other.isSetTag()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!isSetTag() || (compareTo = TBaseHelper.compareTo(this.tag, other.tag)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<MemberSaleInfo, _Fields> deepCopy2() {
        return new MemberSaleInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$MemberSaleInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getMember_type());
        }
        if (i11 == 2) {
            return Integer.valueOf(getPrice());
        }
        if (i11 == 3) {
            return Integer.valueOf(getOrigin_price());
        }
        if (i11 == 4) {
            return getMall_goods_info();
        }
        if (i11 == 5) {
            return getTag();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$MemberSaleInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetMember_type();
        }
        if (i11 == 2) {
            return isSetPrice();
        }
        if (i11 == 3) {
            return isSetOrigin_price();
        }
        if (i11 == 4) {
            return isSetMall_goods_info();
        }
        if (i11 == 5) {
            return isSetTag();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$MemberSaleInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetMember_type();
                return;
            } else {
                setMember_type(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetPrice();
                return;
            } else {
                setPrice(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetOrigin_price();
                return;
            } else {
                setOrigin_price(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 4) {
            if (value == null) {
                unsetMall_goods_info();
                return;
            } else {
                setMall_goods_info((EntitlementMallGoodsInfo) value);
                return;
            }
        }
        if (i11 != 5) {
            return;
        }
        if (value == null) {
            unsetTag();
        } else {
            setTag((String) value);
        }
    }

    public boolean equals(MemberSaleInfo that) {
        if (that == null || this.member_type != that.member_type || this.price != that.price || this.origin_price != that.origin_price) {
            return false;
        }
        boolean isSetMall_goods_info = isSetMall_goods_info();
        boolean isSetMall_goods_info2 = that.isSetMall_goods_info();
        if ((isSetMall_goods_info || isSetMall_goods_info2) && !(isSetMall_goods_info && isSetMall_goods_info2 && this.mall_goods_info.equals(that.mall_goods_info))) {
            return false;
        }
        boolean isSetTag = isSetTag();
        boolean isSetTag2 = that.isSetTag();
        if (isSetTag || isSetTag2) {
            return isSetTag && isSetTag2 && this.tag.equals(that.tag);
        }
        return true;
    }

    public MemberSaleInfo(int member_type, int price, int origin_price, String tag) {
        this();
        this.member_type = member_type;
        setMember_typeIsSet(true);
        this.price = price;
        setPriceIsSet(true);
        this.origin_price = origin_price;
        setOrigin_priceIsSet(true);
        this.tag = tag;
    }

    public MemberSaleInfo(MemberSaleInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.MALL_GOODS_INFO};
        this.__isset_bitfield = other.__isset_bitfield;
        this.member_type = other.member_type;
        this.price = other.price;
        this.origin_price = other.origin_price;
        if (other.isSetMall_goods_info()) {
            this.mall_goods_info = new EntitlementMallGoodsInfo(other.mall_goods_info);
        }
        if (other.isSetTag()) {
            this.tag = other.tag;
        }
    }
}
