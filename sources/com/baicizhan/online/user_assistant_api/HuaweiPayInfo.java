package com.baicizhan.online.user_assistant_api;

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
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class HuaweiPayInfo implements TBase<HuaweiPayInfo, _Fields>, Serializable, Cloneable, Comparable<HuaweiPayInfo> {
    private static final int __PAY_TYPE_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String application_id;
    public String extra;
    public HarmonyPayInfo harmony;
    private _Fields[] optionals;
    public String order_id;
    public int pay_type;
    public String product_id;
    public String purchase_token;
    public List<SubItemInfo> sub_items;
    private static final TStruct STRUCT_DESC = new TStruct("HuaweiPayInfo");
    private static final TField ORDER_ID_FIELD_DESC = new TField("order_id", (byte) 11, 1);
    private static final TField PRODUCT_ID_FIELD_DESC = new TField("product_id", (byte) 11, 2);
    private static final TField PURCHASE_TOKEN_FIELD_DESC = new TField("purchase_token", (byte) 11, 3);
    private static final TField APPLICATION_ID_FIELD_DESC = new TField("application_id", (byte) 11, 4);
    private static final TField SUB_ITEMS_FIELD_DESC = new TField("sub_items", (byte) 15, 5);
    private static final TField EXTRA_FIELD_DESC = new TField("extra", (byte) 11, 6);
    private static final TField PAY_TYPE_FIELD_DESC = new TField("pay_type", (byte) 8, 7);
    private static final TField HARMONY_FIELD_DESC = new TField("harmony", (byte) 12, 8);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_assistant_api.HuaweiPayInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_assistant_api$HuaweiPayInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_assistant_api$HuaweiPayInfo$_Fields = iArr;
            try {
                iArr[_Fields.ORDER_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$HuaweiPayInfo$_Fields[_Fields.PRODUCT_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$HuaweiPayInfo$_Fields[_Fields.PURCHASE_TOKEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$HuaweiPayInfo$_Fields[_Fields.APPLICATION_ID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$HuaweiPayInfo$_Fields[_Fields.SUB_ITEMS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$HuaweiPayInfo$_Fields[_Fields.EXTRA.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$HuaweiPayInfo$_Fields[_Fields.PAY_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$HuaweiPayInfo$_Fields[_Fields.HARMONY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class HuaweiPayInfoStandardScheme extends StandardScheme<HuaweiPayInfo> {
        private HuaweiPayInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, HuaweiPayInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    struct.validate();
                    return;
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 == 11) {
                            struct.order_id = iprot.readString();
                            struct.setOrder_idIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 2:
                        if (b11 == 11) {
                            struct.product_id = iprot.readString();
                            struct.setProduct_idIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 3:
                        if (b11 == 11) {
                            struct.purchase_token = iprot.readString();
                            struct.setPurchase_tokenIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 4:
                        if (b11 == 11) {
                            struct.application_id = iprot.readString();
                            struct.setApplication_idIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 5:
                        if (b11 == 15) {
                            TList readListBegin = iprot.readListBegin();
                            struct.sub_items = new ArrayList(readListBegin.size);
                            for (int i11 = 0; i11 < readListBegin.size; i11++) {
                                SubItemInfo subItemInfo = new SubItemInfo();
                                subItemInfo.read(iprot);
                                struct.sub_items.add(subItemInfo);
                            }
                            iprot.readListEnd();
                            struct.setSub_itemsIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 6:
                        if (b11 == 11) {
                            struct.extra = iprot.readString();
                            struct.setExtraIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 7:
                        if (b11 == 8) {
                            struct.pay_type = iprot.readI32();
                            struct.setPay_typeIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 8:
                        if (b11 == 12) {
                            HarmonyPayInfo harmonyPayInfo = new HarmonyPayInfo();
                            struct.harmony = harmonyPayInfo;
                            harmonyPayInfo.read(iprot);
                            struct.setHarmonyIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    default:
                        TProtocolUtil.skip(iprot, b11);
                        break;
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, HuaweiPayInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(HuaweiPayInfo.STRUCT_DESC);
            if (struct.order_id != null) {
                oprot.writeFieldBegin(HuaweiPayInfo.ORDER_ID_FIELD_DESC);
                oprot.writeString(struct.order_id);
                oprot.writeFieldEnd();
            }
            if (struct.product_id != null) {
                oprot.writeFieldBegin(HuaweiPayInfo.PRODUCT_ID_FIELD_DESC);
                oprot.writeString(struct.product_id);
                oprot.writeFieldEnd();
            }
            if (struct.purchase_token != null) {
                oprot.writeFieldBegin(HuaweiPayInfo.PURCHASE_TOKEN_FIELD_DESC);
                oprot.writeString(struct.purchase_token);
                oprot.writeFieldEnd();
            }
            if (struct.application_id != null) {
                oprot.writeFieldBegin(HuaweiPayInfo.APPLICATION_ID_FIELD_DESC);
                oprot.writeString(struct.application_id);
                oprot.writeFieldEnd();
            }
            if (struct.sub_items != null && struct.isSetSub_items()) {
                oprot.writeFieldBegin(HuaweiPayInfo.SUB_ITEMS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.sub_items.size()));
                Iterator<SubItemInfo> it = struct.sub_items.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.extra != null && struct.isSetExtra()) {
                oprot.writeFieldBegin(HuaweiPayInfo.EXTRA_FIELD_DESC);
                oprot.writeString(struct.extra);
                oprot.writeFieldEnd();
            }
            if (struct.isSetPay_type()) {
                oprot.writeFieldBegin(HuaweiPayInfo.PAY_TYPE_FIELD_DESC);
                oprot.writeI32(struct.pay_type);
                oprot.writeFieldEnd();
            }
            if (struct.harmony != null && struct.isSetHarmony()) {
                oprot.writeFieldBegin(HuaweiPayInfo.HARMONY_FIELD_DESC);
                struct.harmony.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class HuaweiPayInfoStandardSchemeFactory implements SchemeFactory {
        private HuaweiPayInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public HuaweiPayInfoStandardScheme getScheme() {
            return new HuaweiPayInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class HuaweiPayInfoTupleScheme extends TupleScheme<HuaweiPayInfo> {
        private HuaweiPayInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, HuaweiPayInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.order_id = tTupleProtocol.readString();
            struct.setOrder_idIsSet(true);
            struct.product_id = tTupleProtocol.readString();
            struct.setProduct_idIsSet(true);
            struct.purchase_token = tTupleProtocol.readString();
            struct.setPurchase_tokenIsSet(true);
            struct.application_id = tTupleProtocol.readString();
            struct.setApplication_idIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(4);
            if (readBitSet.get(0)) {
                TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                struct.sub_items = new ArrayList(tList.size);
                for (int i11 = 0; i11 < tList.size; i11++) {
                    SubItemInfo subItemInfo = new SubItemInfo();
                    subItemInfo.read(tTupleProtocol);
                    struct.sub_items.add(subItemInfo);
                }
                struct.setSub_itemsIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.extra = tTupleProtocol.readString();
                struct.setExtraIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.pay_type = tTupleProtocol.readI32();
                struct.setPay_typeIsSet(true);
            }
            if (readBitSet.get(3)) {
                HarmonyPayInfo harmonyPayInfo = new HarmonyPayInfo();
                struct.harmony = harmonyPayInfo;
                harmonyPayInfo.read(tTupleProtocol);
                struct.setHarmonyIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, HuaweiPayInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.order_id);
            tTupleProtocol.writeString(struct.product_id);
            tTupleProtocol.writeString(struct.purchase_token);
            tTupleProtocol.writeString(struct.application_id);
            BitSet bitSet = new BitSet();
            if (struct.isSetSub_items()) {
                bitSet.set(0);
            }
            if (struct.isSetExtra()) {
                bitSet.set(1);
            }
            if (struct.isSetPay_type()) {
                bitSet.set(2);
            }
            if (struct.isSetHarmony()) {
                bitSet.set(3);
            }
            tTupleProtocol.writeBitSet(bitSet, 4);
            if (struct.isSetSub_items()) {
                tTupleProtocol.writeI32(struct.sub_items.size());
                Iterator<SubItemInfo> it = struct.sub_items.iterator();
                while (it.hasNext()) {
                    it.next().write(tTupleProtocol);
                }
            }
            if (struct.isSetExtra()) {
                tTupleProtocol.writeString(struct.extra);
            }
            if (struct.isSetPay_type()) {
                tTupleProtocol.writeI32(struct.pay_type);
            }
            if (struct.isSetHarmony()) {
                struct.harmony.write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class HuaweiPayInfoTupleSchemeFactory implements SchemeFactory {
        private HuaweiPayInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public HuaweiPayInfoTupleScheme getScheme() {
            return new HuaweiPayInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ORDER_ID(1, "order_id"),
        PRODUCT_ID(2, "product_id"),
        PURCHASE_TOKEN(3, "purchase_token"),
        APPLICATION_ID(4, "application_id"),
        SUB_ITEMS(5, "sub_items"),
        EXTRA(6, "extra"),
        PAY_TYPE(7, "pay_type"),
        HARMONY(8, "harmony");

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
            switch (fieldId) {
                case 1:
                    return ORDER_ID;
                case 2:
                    return PRODUCT_ID;
                case 3:
                    return PURCHASE_TOKEN;
                case 4:
                    return APPLICATION_ID;
                case 5:
                    return SUB_ITEMS;
                case 6:
                    return EXTRA;
                case 7:
                    return PAY_TYPE;
                case 8:
                    return HARMONY;
                default:
                    return null;
            }
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
        hashMap.put(StandardScheme.class, new HuaweiPayInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new HuaweiPayInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ORDER_ID, (_Fields) new FieldMetaData("order_id", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.PRODUCT_ID, (_Fields) new FieldMetaData("product_id", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.PURCHASE_TOKEN, (_Fields) new FieldMetaData("purchase_token", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.APPLICATION_ID, (_Fields) new FieldMetaData("application_id", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SUB_ITEMS, (_Fields) new FieldMetaData("sub_items", (byte) 2, new ListMetaData((byte) 15, new StructMetaData((byte) 12, SubItemInfo.class))));
        enumMap.put((EnumMap) _Fields.EXTRA, (_Fields) new FieldMetaData("extra", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.PAY_TYPE, (_Fields) new FieldMetaData("pay_type", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.HARMONY, (_Fields) new FieldMetaData("harmony", (byte) 2, new StructMetaData((byte) 12, HarmonyPayInfo.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(HuaweiPayInfo.class, unmodifiableMap);
    }

    public HuaweiPayInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.SUB_ITEMS, _Fields.EXTRA, _Fields.PAY_TYPE, _Fields.HARMONY};
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

    public void addToSub_items(SubItemInfo elem) {
        if (this.sub_items == null) {
            this.sub_items = new ArrayList();
        }
        this.sub_items.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.order_id = null;
        this.product_id = null;
        this.purchase_token = null;
        this.application_id = null;
        this.sub_items = null;
        this.extra = null;
        setPay_typeIsSet(false);
        this.pay_type = 0;
        this.harmony = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof HuaweiPayInfo)) {
            return equals((HuaweiPayInfo) that);
        }
        return false;
    }

    public String getApplication_id() {
        return this.application_id;
    }

    public String getExtra() {
        return this.extra;
    }

    public HarmonyPayInfo getHarmony() {
        return this.harmony;
    }

    public String getOrder_id() {
        return this.order_id;
    }

    public int getPay_type() {
        return this.pay_type;
    }

    public String getProduct_id() {
        return this.product_id;
    }

    public String getPurchase_token() {
        return this.purchase_token;
    }

    public List<SubItemInfo> getSub_items() {
        return this.sub_items;
    }

    public Iterator<SubItemInfo> getSub_itemsIterator() {
        List<SubItemInfo> list = this.sub_items;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getSub_itemsSize() {
        List<SubItemInfo> list = this.sub_items;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetApplication_id() {
        return this.application_id != null;
    }

    public boolean isSetExtra() {
        return this.extra != null;
    }

    public boolean isSetHarmony() {
        return this.harmony != null;
    }

    public boolean isSetOrder_id() {
        return this.order_id != null;
    }

    public boolean isSetPay_type() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetProduct_id() {
        return this.product_id != null;
    }

    public boolean isSetPurchase_token() {
        return this.purchase_token != null;
    }

    public boolean isSetSub_items() {
        return this.sub_items != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public HuaweiPayInfo setApplication_id(String application_id) {
        this.application_id = application_id;
        return this;
    }

    public void setApplication_idIsSet(boolean value) {
        if (value) {
            return;
        }
        this.application_id = null;
    }

    public HuaweiPayInfo setExtra(String extra) {
        this.extra = extra;
        return this;
    }

    public void setExtraIsSet(boolean value) {
        if (value) {
            return;
        }
        this.extra = null;
    }

    public HuaweiPayInfo setHarmony(HarmonyPayInfo harmony) {
        this.harmony = harmony;
        return this;
    }

    public void setHarmonyIsSet(boolean value) {
        if (value) {
            return;
        }
        this.harmony = null;
    }

    public HuaweiPayInfo setOrder_id(String order_id) {
        this.order_id = order_id;
        return this;
    }

    public void setOrder_idIsSet(boolean value) {
        if (value) {
            return;
        }
        this.order_id = null;
    }

    public HuaweiPayInfo setPay_type(int pay_type) {
        this.pay_type = pay_type;
        setPay_typeIsSet(true);
        return this;
    }

    public void setPay_typeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public HuaweiPayInfo setProduct_id(String product_id) {
        this.product_id = product_id;
        return this;
    }

    public void setProduct_idIsSet(boolean value) {
        if (value) {
            return;
        }
        this.product_id = null;
    }

    public HuaweiPayInfo setPurchase_token(String purchase_token) {
        this.purchase_token = purchase_token;
        return this;
    }

    public void setPurchase_tokenIsSet(boolean value) {
        if (value) {
            return;
        }
        this.purchase_token = null;
    }

    public HuaweiPayInfo setSub_items(List<SubItemInfo> sub_items) {
        this.sub_items = sub_items;
        return this;
    }

    public void setSub_itemsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.sub_items = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("HuaweiPayInfo(");
        sb2.append("order_id:");
        String str = this.order_id;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("product_id:");
        String str2 = this.product_id;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("purchase_token:");
        String str3 = this.purchase_token;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(j2.O);
        sb2.append("application_id:");
        String str4 = this.application_id;
        if (str4 == null) {
            sb2.append("null");
        } else {
            sb2.append(str4);
        }
        if (isSetSub_items()) {
            sb2.append(j2.O);
            sb2.append("sub_items:");
            List<SubItemInfo> list = this.sub_items;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
        }
        if (isSetExtra()) {
            sb2.append(j2.O);
            sb2.append("extra:");
            String str5 = this.extra;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        if (isSetPay_type()) {
            sb2.append(j2.O);
            sb2.append("pay_type:");
            sb2.append(this.pay_type);
        }
        if (isSetHarmony()) {
            sb2.append(j2.O);
            sb2.append("harmony:");
            HarmonyPayInfo harmonyPayInfo = this.harmony;
            if (harmonyPayInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(harmonyPayInfo);
            }
        }
        sb2.append(j.f81007d);
        return sb2.toString();
    }

    public void unsetApplication_id() {
        this.application_id = null;
    }

    public void unsetExtra() {
        this.extra = null;
    }

    public void unsetHarmony() {
        this.harmony = null;
    }

    public void unsetOrder_id() {
        this.order_id = null;
    }

    public void unsetPay_type() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetProduct_id() {
        this.product_id = null;
    }

    public void unsetPurchase_token() {
        this.purchase_token = null;
    }

    public void unsetSub_items() {
        this.sub_items = null;
    }

    public void validate() throws TException {
        if (this.order_id == null) {
            throw new TProtocolException("Required field 'order_id' was not present! Struct: " + toString());
        }
        if (this.product_id == null) {
            throw new TProtocolException("Required field 'product_id' was not present! Struct: " + toString());
        }
        if (this.purchase_token == null) {
            throw new TProtocolException("Required field 'purchase_token' was not present! Struct: " + toString());
        }
        if (this.application_id == null) {
            throw new TProtocolException("Required field 'application_id' was not present! Struct: " + toString());
        }
        HarmonyPayInfo harmonyPayInfo = this.harmony;
        if (harmonyPayInfo != null) {
            harmonyPayInfo.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(HuaweiPayInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        int compareTo7;
        int compareTo8;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo9 = Boolean.valueOf(isSetOrder_id()).compareTo(Boolean.valueOf(other.isSetOrder_id()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetOrder_id() && (compareTo8 = TBaseHelper.compareTo(this.order_id, other.order_id)) != 0) {
            return compareTo8;
        }
        int compareTo10 = Boolean.valueOf(isSetProduct_id()).compareTo(Boolean.valueOf(other.isSetProduct_id()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetProduct_id() && (compareTo7 = TBaseHelper.compareTo(this.product_id, other.product_id)) != 0) {
            return compareTo7;
        }
        int compareTo11 = Boolean.valueOf(isSetPurchase_token()).compareTo(Boolean.valueOf(other.isSetPurchase_token()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetPurchase_token() && (compareTo6 = TBaseHelper.compareTo(this.purchase_token, other.purchase_token)) != 0) {
            return compareTo6;
        }
        int compareTo12 = Boolean.valueOf(isSetApplication_id()).compareTo(Boolean.valueOf(other.isSetApplication_id()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetApplication_id() && (compareTo5 = TBaseHelper.compareTo(this.application_id, other.application_id)) != 0) {
            return compareTo5;
        }
        int compareTo13 = Boolean.valueOf(isSetSub_items()).compareTo(Boolean.valueOf(other.isSetSub_items()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetSub_items() && (compareTo4 = TBaseHelper.compareTo((List) this.sub_items, (List) other.sub_items)) != 0) {
            return compareTo4;
        }
        int compareTo14 = Boolean.valueOf(isSetExtra()).compareTo(Boolean.valueOf(other.isSetExtra()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (isSetExtra() && (compareTo3 = TBaseHelper.compareTo(this.extra, other.extra)) != 0) {
            return compareTo3;
        }
        int compareTo15 = Boolean.valueOf(isSetPay_type()).compareTo(Boolean.valueOf(other.isSetPay_type()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (isSetPay_type() && (compareTo2 = TBaseHelper.compareTo(this.pay_type, other.pay_type)) != 0) {
            return compareTo2;
        }
        int compareTo16 = Boolean.valueOf(isSetHarmony()).compareTo(Boolean.valueOf(other.isSetHarmony()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (!isSetHarmony() || (compareTo = TBaseHelper.compareTo((Comparable) this.harmony, (Comparable) other.harmony)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<HuaweiPayInfo, _Fields> deepCopy2() {
        return new HuaweiPayInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$HuaweiPayInfo$_Fields[field.ordinal()]) {
            case 1:
                return getOrder_id();
            case 2:
                return getProduct_id();
            case 3:
                return getPurchase_token();
            case 4:
                return getApplication_id();
            case 5:
                return getSub_items();
            case 6:
                return getExtra();
            case 7:
                return Integer.valueOf(getPay_type());
            case 8:
                return getHarmony();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$HuaweiPayInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetOrder_id();
            case 2:
                return isSetProduct_id();
            case 3:
                return isSetPurchase_token();
            case 4:
                return isSetApplication_id();
            case 5:
                return isSetSub_items();
            case 6:
                return isSetExtra();
            case 7:
                return isSetPay_type();
            case 8:
                return isSetHarmony();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$HuaweiPayInfo$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setOrder_id((String) value);
                    break;
                } else {
                    unsetOrder_id();
                    break;
                }
            case 2:
                if (value != null) {
                    setProduct_id((String) value);
                    break;
                } else {
                    unsetProduct_id();
                    break;
                }
            case 3:
                if (value != null) {
                    setPurchase_token((String) value);
                    break;
                } else {
                    unsetPurchase_token();
                    break;
                }
            case 4:
                if (value != null) {
                    setApplication_id((String) value);
                    break;
                } else {
                    unsetApplication_id();
                    break;
                }
            case 5:
                if (value != null) {
                    setSub_items((List) value);
                    break;
                } else {
                    unsetSub_items();
                    break;
                }
            case 6:
                if (value != null) {
                    setExtra((String) value);
                    break;
                } else {
                    unsetExtra();
                    break;
                }
            case 7:
                if (value != null) {
                    setPay_type(((Integer) value).intValue());
                    break;
                } else {
                    unsetPay_type();
                    break;
                }
            case 8:
                if (value != null) {
                    setHarmony((HarmonyPayInfo) value);
                    break;
                } else {
                    unsetHarmony();
                    break;
                }
        }
    }

    public boolean equals(HuaweiPayInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetOrder_id = isSetOrder_id();
        boolean isSetOrder_id2 = that.isSetOrder_id();
        if ((isSetOrder_id || isSetOrder_id2) && !(isSetOrder_id && isSetOrder_id2 && this.order_id.equals(that.order_id))) {
            return false;
        }
        boolean isSetProduct_id = isSetProduct_id();
        boolean isSetProduct_id2 = that.isSetProduct_id();
        if ((isSetProduct_id || isSetProduct_id2) && !(isSetProduct_id && isSetProduct_id2 && this.product_id.equals(that.product_id))) {
            return false;
        }
        boolean isSetPurchase_token = isSetPurchase_token();
        boolean isSetPurchase_token2 = that.isSetPurchase_token();
        if ((isSetPurchase_token || isSetPurchase_token2) && !(isSetPurchase_token && isSetPurchase_token2 && this.purchase_token.equals(that.purchase_token))) {
            return false;
        }
        boolean isSetApplication_id = isSetApplication_id();
        boolean isSetApplication_id2 = that.isSetApplication_id();
        if ((isSetApplication_id || isSetApplication_id2) && !(isSetApplication_id && isSetApplication_id2 && this.application_id.equals(that.application_id))) {
            return false;
        }
        boolean isSetSub_items = isSetSub_items();
        boolean isSetSub_items2 = that.isSetSub_items();
        if ((isSetSub_items || isSetSub_items2) && !(isSetSub_items && isSetSub_items2 && this.sub_items.equals(that.sub_items))) {
            return false;
        }
        boolean isSetExtra = isSetExtra();
        boolean isSetExtra2 = that.isSetExtra();
        if ((isSetExtra || isSetExtra2) && !(isSetExtra && isSetExtra2 && this.extra.equals(that.extra))) {
            return false;
        }
        boolean isSetPay_type = isSetPay_type();
        boolean isSetPay_type2 = that.isSetPay_type();
        if ((isSetPay_type || isSetPay_type2) && !(isSetPay_type && isSetPay_type2 && this.pay_type == that.pay_type)) {
            return false;
        }
        boolean isSetHarmony = isSetHarmony();
        boolean isSetHarmony2 = that.isSetHarmony();
        if (isSetHarmony || isSetHarmony2) {
            return isSetHarmony && isSetHarmony2 && this.harmony.equals(that.harmony);
        }
        return true;
    }

    public HuaweiPayInfo(String order_id, String product_id, String purchase_token, String application_id) {
        this();
        this.order_id = order_id;
        this.product_id = product_id;
        this.purchase_token = purchase_token;
        this.application_id = application_id;
    }

    public HuaweiPayInfo(HuaweiPayInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.SUB_ITEMS, _Fields.EXTRA, _Fields.PAY_TYPE, _Fields.HARMONY};
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetOrder_id()) {
            this.order_id = other.order_id;
        }
        if (other.isSetProduct_id()) {
            this.product_id = other.product_id;
        }
        if (other.isSetPurchase_token()) {
            this.purchase_token = other.purchase_token;
        }
        if (other.isSetApplication_id()) {
            this.application_id = other.application_id;
        }
        if (other.isSetSub_items()) {
            ArrayList arrayList = new ArrayList(other.sub_items.size());
            Iterator<SubItemInfo> it = other.sub_items.iterator();
            while (it.hasNext()) {
                arrayList.add(new SubItemInfo(it.next()));
            }
            this.sub_items = arrayList;
        }
        if (other.isSetExtra()) {
            this.extra = other.extra;
        }
        this.pay_type = other.pay_type;
        if (other.isSetHarmony()) {
            this.harmony = new HarmonyPayInfo(other.harmony);
        }
    }
}
