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
public class EnergySaleInfo implements TBase<EnergySaleInfo, _Fields>, Serializable, Cloneable, Comparable<EnergySaleInfo> {
    private static final int __BUY_ENERGY_ISSET_ID = 0;
    private static final int __PRICE_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int buy_energy;
    public EntitlementMallGoodsInfo energy_goods_info;
    private _Fields[] optionals;
    public int price;
    private static final TStruct STRUCT_DESC = new TStruct("EnergySaleInfo");
    private static final TField BUY_ENERGY_FIELD_DESC = new TField("buy_energy", (byte) 8, 1);
    private static final TField PRICE_FIELD_DESC = new TField("price", (byte) 8, 2);
    private static final TField ENERGY_GOODS_INFO_FIELD_DESC = new TField("energy_goods_info", (byte) 12, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.strategy_api.EnergySaleInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$strategy_api$EnergySaleInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$strategy_api$EnergySaleInfo$_Fields = iArr;
            try {
                iArr[_Fields.BUY_ENERGY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$strategy_api$EnergySaleInfo$_Fields[_Fields.PRICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$strategy_api$EnergySaleInfo$_Fields[_Fields.ENERGY_GOODS_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class EnergySaleInfoStandardScheme extends StandardScheme<EnergySaleInfo> {
        private EnergySaleInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, EnergySaleInfo struct) throws TException {
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
                        } else if (b11 == 12) {
                            EntitlementMallGoodsInfo entitlementMallGoodsInfo = new EntitlementMallGoodsInfo();
                            struct.energy_goods_info = entitlementMallGoodsInfo;
                            entitlementMallGoodsInfo.read(iprot);
                            struct.setEnergy_goods_infoIsSet(true);
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
                    struct.buy_energy = iprot.readI32();
                    struct.setBuy_energyIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetBuy_energy()) {
                throw new TProtocolException("Required field 'buy_energy' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetPrice()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'price' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, EnergySaleInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(EnergySaleInfo.STRUCT_DESC);
            oprot.writeFieldBegin(EnergySaleInfo.BUY_ENERGY_FIELD_DESC);
            oprot.writeI32(struct.buy_energy);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(EnergySaleInfo.PRICE_FIELD_DESC);
            oprot.writeI32(struct.price);
            oprot.writeFieldEnd();
            if (struct.energy_goods_info != null && struct.isSetEnergy_goods_info()) {
                oprot.writeFieldBegin(EnergySaleInfo.ENERGY_GOODS_INFO_FIELD_DESC);
                struct.energy_goods_info.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class EnergySaleInfoStandardSchemeFactory implements SchemeFactory {
        private EnergySaleInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public EnergySaleInfoStandardScheme getScheme() {
            return new EnergySaleInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class EnergySaleInfoTupleScheme extends TupleScheme<EnergySaleInfo> {
        private EnergySaleInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, EnergySaleInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.buy_energy = tTupleProtocol.readI32();
            struct.setBuy_energyIsSet(true);
            struct.price = tTupleProtocol.readI32();
            struct.setPriceIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                EntitlementMallGoodsInfo entitlementMallGoodsInfo = new EntitlementMallGoodsInfo();
                struct.energy_goods_info = entitlementMallGoodsInfo;
                entitlementMallGoodsInfo.read(tTupleProtocol);
                struct.setEnergy_goods_infoIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, EnergySaleInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.buy_energy);
            tTupleProtocol.writeI32(struct.price);
            BitSet bitSet = new BitSet();
            if (struct.isSetEnergy_goods_info()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetEnergy_goods_info()) {
                struct.energy_goods_info.write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class EnergySaleInfoTupleSchemeFactory implements SchemeFactory {
        private EnergySaleInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public EnergySaleInfoTupleScheme getScheme() {
            return new EnergySaleInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        BUY_ENERGY(1, "buy_energy"),
        PRICE(2, "price"),
        ENERGY_GOODS_INFO(3, "energy_goods_info");

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
                return BUY_ENERGY;
            }
            if (fieldId == 2) {
                return PRICE;
            }
            if (fieldId != 3) {
                return null;
            }
            return ENERGY_GOODS_INFO;
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
        hashMap.put(StandardScheme.class, new EnergySaleInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new EnergySaleInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.BUY_ENERGY, (_Fields) new FieldMetaData("buy_energy", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.PRICE, (_Fields) new FieldMetaData("price", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.ENERGY_GOODS_INFO, (_Fields) new FieldMetaData("energy_goods_info", (byte) 2, new StructMetaData((byte) 12, EntitlementMallGoodsInfo.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(EnergySaleInfo.class, unmodifiableMap);
    }

    public EnergySaleInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.ENERGY_GOODS_INFO};
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
        setBuy_energyIsSet(false);
        this.buy_energy = 0;
        setPriceIsSet(false);
        this.price = 0;
        this.energy_goods_info = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof EnergySaleInfo)) {
            return equals((EnergySaleInfo) that);
        }
        return false;
    }

    public int getBuy_energy() {
        return this.buy_energy;
    }

    public EntitlementMallGoodsInfo getEnergy_goods_info() {
        return this.energy_goods_info;
    }

    public int getPrice() {
        return this.price;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetBuy_energy() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetEnergy_goods_info() {
        return this.energy_goods_info != null;
    }

    public boolean isSetPrice() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public EnergySaleInfo setBuy_energy(int buy_energy) {
        this.buy_energy = buy_energy;
        setBuy_energyIsSet(true);
        return this;
    }

    public void setBuy_energyIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public EnergySaleInfo setEnergy_goods_info(EntitlementMallGoodsInfo energy_goods_info) {
        this.energy_goods_info = energy_goods_info;
        return this;
    }

    public void setEnergy_goods_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.energy_goods_info = null;
    }

    public EnergySaleInfo setPrice(int price) {
        this.price = price;
        setPriceIsSet(true);
        return this;
    }

    public void setPriceIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("EnergySaleInfo(");
        sb2.append("buy_energy:");
        sb2.append(this.buy_energy);
        sb2.append(j2.O);
        sb2.append("price:");
        sb2.append(this.price);
        if (isSetEnergy_goods_info()) {
            sb2.append(j2.O);
            sb2.append("energy_goods_info:");
            EntitlementMallGoodsInfo entitlementMallGoodsInfo = this.energy_goods_info;
            if (entitlementMallGoodsInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(entitlementMallGoodsInfo);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetBuy_energy() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetEnergy_goods_info() {
        this.energy_goods_info = null;
    }

    public void unsetPrice() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void validate() throws TException {
        EntitlementMallGoodsInfo entitlementMallGoodsInfo = this.energy_goods_info;
        if (entitlementMallGoodsInfo != null) {
            entitlementMallGoodsInfo.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(EnergySaleInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetBuy_energy()).compareTo(Boolean.valueOf(other.isSetBuy_energy()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetBuy_energy() && (compareTo3 = TBaseHelper.compareTo(this.buy_energy, other.buy_energy)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetPrice()).compareTo(Boolean.valueOf(other.isSetPrice()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetPrice() && (compareTo2 = TBaseHelper.compareTo(this.price, other.price)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetEnergy_goods_info()).compareTo(Boolean.valueOf(other.isSetEnergy_goods_info()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetEnergy_goods_info() || (compareTo = TBaseHelper.compareTo((Comparable) this.energy_goods_info, (Comparable) other.energy_goods_info)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<EnergySaleInfo, _Fields> deepCopy2() {
        return new EnergySaleInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$EnergySaleInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getBuy_energy());
        }
        if (i11 == 2) {
            return Integer.valueOf(getPrice());
        }
        if (i11 == 3) {
            return getEnergy_goods_info();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$EnergySaleInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetBuy_energy();
        }
        if (i11 == 2) {
            return isSetPrice();
        }
        if (i11 == 3) {
            return isSetEnergy_goods_info();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$EnergySaleInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetBuy_energy();
                return;
            } else {
                setBuy_energy(((Integer) value).intValue());
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
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetEnergy_goods_info();
        } else {
            setEnergy_goods_info((EntitlementMallGoodsInfo) value);
        }
    }

    public boolean equals(EnergySaleInfo that) {
        if (that == null || this.buy_energy != that.buy_energy || this.price != that.price) {
            return false;
        }
        boolean isSetEnergy_goods_info = isSetEnergy_goods_info();
        boolean isSetEnergy_goods_info2 = that.isSetEnergy_goods_info();
        if (isSetEnergy_goods_info || isSetEnergy_goods_info2) {
            return isSetEnergy_goods_info && isSetEnergy_goods_info2 && this.energy_goods_info.equals(that.energy_goods_info);
        }
        return true;
    }

    public EnergySaleInfo(int buy_energy, int price) {
        this();
        this.buy_energy = buy_energy;
        setBuy_energyIsSet(true);
        this.price = price;
        setPriceIsSet(true);
    }

    public EnergySaleInfo(EnergySaleInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.ENERGY_GOODS_INFO};
        this.__isset_bitfield = other.__isset_bitfield;
        this.buy_energy = other.buy_energy;
        this.price = other.price;
        if (other.isSetEnergy_goods_info()) {
            this.energy_goods_info = new EntitlementMallGoodsInfo(other.energy_goods_info);
        }
    }
}
