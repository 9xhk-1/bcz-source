package com.baicizhan.online.user_assistant_api;

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
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class PayResp implements TBase<PayResp, _Fields>, Serializable, Cloneable, Comparable<PayResp> {
    private static final int __NO_NEED_PAY_ISSET_ID = 1;
    private static final int __ORDER_ID_ISSET_ID = 0;
    private static final int __PAY_TYPE_ISSET_ID = 2;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public boolean no_need_pay;
    private _Fields[] optionals;
    public long order_id;
    public String pay_id;
    public String pay_json;
    public int pay_type;
    public String pay_url;
    public String step_pay_order_id;
    private static final TStruct STRUCT_DESC = new TStruct("PayResp");
    private static final TField ORDER_ID_FIELD_DESC = new TField("order_id", (byte) 10, 1);
    private static final TField STEP_PAY_ORDER_ID_FIELD_DESC = new TField("step_pay_order_id", (byte) 11, 2);
    private static final TField NO_NEED_PAY_FIELD_DESC = new TField("no_need_pay", (byte) 2, 3);
    private static final TField PAY_ID_FIELD_DESC = new TField("pay_id", (byte) 11, 4);
    private static final TField PAY_URL_FIELD_DESC = new TField("pay_url", (byte) 11, 5);
    private static final TField PAY_JSON_FIELD_DESC = new TField("pay_json", (byte) 11, 6);
    private static final TField PAY_TYPE_FIELD_DESC = new TField("pay_type", (byte) 8, 7);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_assistant_api.PayResp$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_assistant_api$PayResp$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_assistant_api$PayResp$_Fields = iArr;
            try {
                iArr[_Fields.ORDER_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$PayResp$_Fields[_Fields.STEP_PAY_ORDER_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$PayResp$_Fields[_Fields.NO_NEED_PAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$PayResp$_Fields[_Fields.PAY_ID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$PayResp$_Fields[_Fields.PAY_URL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$PayResp$_Fields[_Fields.PAY_JSON.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$PayResp$_Fields[_Fields.PAY_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PayRespStandardScheme extends StandardScheme<PayResp> {
        private PayRespStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, PayResp struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetOrder_id()) {
                        throw new TProtocolException("Required field 'order_id' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetNo_need_pay()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'no_need_pay' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.order_id = iprot.readI64();
                            struct.setOrder_idIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.step_pay_order_id = iprot.readString();
                            struct.setStep_pay_order_idIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 2) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.no_need_pay = iprot.readBool();
                            struct.setNo_need_payIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.pay_id = iprot.readString();
                            struct.setPay_idIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.pay_url = iprot.readString();
                            struct.setPay_urlIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.pay_json = iprot.readString();
                            struct.setPay_jsonIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.pay_type = iprot.readI32();
                            struct.setPay_typeIsSet(true);
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
        public void write(TProtocol oprot, PayResp struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(PayResp.STRUCT_DESC);
            oprot.writeFieldBegin(PayResp.ORDER_ID_FIELD_DESC);
            oprot.writeI64(struct.order_id);
            oprot.writeFieldEnd();
            if (struct.step_pay_order_id != null) {
                oprot.writeFieldBegin(PayResp.STEP_PAY_ORDER_ID_FIELD_DESC);
                oprot.writeString(struct.step_pay_order_id);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(PayResp.NO_NEED_PAY_FIELD_DESC);
            oprot.writeBool(struct.no_need_pay);
            oprot.writeFieldEnd();
            if (struct.pay_id != null && struct.isSetPay_id()) {
                oprot.writeFieldBegin(PayResp.PAY_ID_FIELD_DESC);
                oprot.writeString(struct.pay_id);
                oprot.writeFieldEnd();
            }
            if (struct.pay_url != null && struct.isSetPay_url()) {
                oprot.writeFieldBegin(PayResp.PAY_URL_FIELD_DESC);
                oprot.writeString(struct.pay_url);
                oprot.writeFieldEnd();
            }
            if (struct.pay_json != null && struct.isSetPay_json()) {
                oprot.writeFieldBegin(PayResp.PAY_JSON_FIELD_DESC);
                oprot.writeString(struct.pay_json);
                oprot.writeFieldEnd();
            }
            if (struct.isSetPay_type()) {
                oprot.writeFieldBegin(PayResp.PAY_TYPE_FIELD_DESC);
                oprot.writeI32(struct.pay_type);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PayRespStandardSchemeFactory implements SchemeFactory {
        private PayRespStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public PayRespStandardScheme getScheme() {
            return new PayRespStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PayRespTupleScheme extends TupleScheme<PayResp> {
        private PayRespTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, PayResp struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.order_id = tTupleProtocol.readI64();
            struct.setOrder_idIsSet(true);
            struct.step_pay_order_id = tTupleProtocol.readString();
            struct.setStep_pay_order_idIsSet(true);
            struct.no_need_pay = tTupleProtocol.readBool();
            struct.setNo_need_payIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(4);
            if (readBitSet.get(0)) {
                struct.pay_id = tTupleProtocol.readString();
                struct.setPay_idIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.pay_url = tTupleProtocol.readString();
                struct.setPay_urlIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.pay_json = tTupleProtocol.readString();
                struct.setPay_jsonIsSet(true);
            }
            if (readBitSet.get(3)) {
                struct.pay_type = tTupleProtocol.readI32();
                struct.setPay_typeIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, PayResp struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI64(struct.order_id);
            tTupleProtocol.writeString(struct.step_pay_order_id);
            tTupleProtocol.writeBool(struct.no_need_pay);
            BitSet bitSet = new BitSet();
            if (struct.isSetPay_id()) {
                bitSet.set(0);
            }
            if (struct.isSetPay_url()) {
                bitSet.set(1);
            }
            if (struct.isSetPay_json()) {
                bitSet.set(2);
            }
            if (struct.isSetPay_type()) {
                bitSet.set(3);
            }
            tTupleProtocol.writeBitSet(bitSet, 4);
            if (struct.isSetPay_id()) {
                tTupleProtocol.writeString(struct.pay_id);
            }
            if (struct.isSetPay_url()) {
                tTupleProtocol.writeString(struct.pay_url);
            }
            if (struct.isSetPay_json()) {
                tTupleProtocol.writeString(struct.pay_json);
            }
            if (struct.isSetPay_type()) {
                tTupleProtocol.writeI32(struct.pay_type);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PayRespTupleSchemeFactory implements SchemeFactory {
        private PayRespTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public PayRespTupleScheme getScheme() {
            return new PayRespTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ORDER_ID(1, "order_id"),
        STEP_PAY_ORDER_ID(2, "step_pay_order_id"),
        NO_NEED_PAY(3, "no_need_pay"),
        PAY_ID(4, "pay_id"),
        PAY_URL(5, "pay_url"),
        PAY_JSON(6, "pay_json"),
        PAY_TYPE(7, "pay_type");

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
                    return STEP_PAY_ORDER_ID;
                case 3:
                    return NO_NEED_PAY;
                case 4:
                    return PAY_ID;
                case 5:
                    return PAY_URL;
                case 6:
                    return PAY_JSON;
                case 7:
                    return PAY_TYPE;
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
        hashMap.put(StandardScheme.class, new PayRespStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new PayRespTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ORDER_ID, (_Fields) new FieldMetaData("order_id", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.STEP_PAY_ORDER_ID, (_Fields) new FieldMetaData("step_pay_order_id", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.NO_NEED_PAY, (_Fields) new FieldMetaData("no_need_pay", (byte) 1, new FieldValueMetaData((byte) 2)));
        enumMap.put((EnumMap) _Fields.PAY_ID, (_Fields) new FieldMetaData("pay_id", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.PAY_URL, (_Fields) new FieldMetaData("pay_url", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.PAY_JSON, (_Fields) new FieldMetaData("pay_json", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.PAY_TYPE, (_Fields) new FieldMetaData("pay_type", (byte) 2, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(PayResp.class, unmodifiableMap);
    }

    public PayResp() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.PAY_ID, _Fields.PAY_URL, _Fields.PAY_JSON, _Fields.PAY_TYPE};
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
        setOrder_idIsSet(false);
        this.order_id = 0L;
        this.step_pay_order_id = null;
        setNo_need_payIsSet(false);
        this.no_need_pay = false;
        this.pay_id = null;
        this.pay_url = null;
        this.pay_json = null;
        setPay_typeIsSet(false);
        this.pay_type = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof PayResp)) {
            return equals((PayResp) that);
        }
        return false;
    }

    public long getOrder_id() {
        return this.order_id;
    }

    public String getPay_id() {
        return this.pay_id;
    }

    public String getPay_json() {
        return this.pay_json;
    }

    public int getPay_type() {
        return this.pay_type;
    }

    public String getPay_url() {
        return this.pay_url;
    }

    public String getStep_pay_order_id() {
        return this.step_pay_order_id;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isNo_need_pay() {
        return this.no_need_pay;
    }

    public boolean isSetNo_need_pay() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetOrder_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetPay_id() {
        return this.pay_id != null;
    }

    public boolean isSetPay_json() {
        return this.pay_json != null;
    }

    public boolean isSetPay_type() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetPay_url() {
        return this.pay_url != null;
    }

    public boolean isSetStep_pay_order_id() {
        return this.step_pay_order_id != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public PayResp setNo_need_pay(boolean no_need_pay) {
        this.no_need_pay = no_need_pay;
        setNo_need_payIsSet(true);
        return this;
    }

    public void setNo_need_payIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public PayResp setOrder_id(long order_id) {
        this.order_id = order_id;
        setOrder_idIsSet(true);
        return this;
    }

    public void setOrder_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public PayResp setPay_id(String pay_id) {
        this.pay_id = pay_id;
        return this;
    }

    public void setPay_idIsSet(boolean value) {
        if (value) {
            return;
        }
        this.pay_id = null;
    }

    public PayResp setPay_json(String pay_json) {
        this.pay_json = pay_json;
        return this;
    }

    public void setPay_jsonIsSet(boolean value) {
        if (value) {
            return;
        }
        this.pay_json = null;
    }

    public PayResp setPay_type(int pay_type) {
        this.pay_type = pay_type;
        setPay_typeIsSet(true);
        return this;
    }

    public void setPay_typeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public PayResp setPay_url(String pay_url) {
        this.pay_url = pay_url;
        return this;
    }

    public void setPay_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.pay_url = null;
    }

    public PayResp setStep_pay_order_id(String step_pay_order_id) {
        this.step_pay_order_id = step_pay_order_id;
        return this;
    }

    public void setStep_pay_order_idIsSet(boolean value) {
        if (value) {
            return;
        }
        this.step_pay_order_id = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PayResp(");
        sb2.append("order_id:");
        sb2.append(this.order_id);
        sb2.append(j2.O);
        sb2.append("step_pay_order_id:");
        String str = this.step_pay_order_id;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("no_need_pay:");
        sb2.append(this.no_need_pay);
        if (isSetPay_id()) {
            sb2.append(j2.O);
            sb2.append("pay_id:");
            String str2 = this.pay_id;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
        }
        if (isSetPay_url()) {
            sb2.append(j2.O);
            sb2.append("pay_url:");
            String str3 = this.pay_url;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
        }
        if (isSetPay_json()) {
            sb2.append(j2.O);
            sb2.append("pay_json:");
            String str4 = this.pay_json;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (isSetPay_type()) {
            sb2.append(j2.O);
            sb2.append("pay_type:");
            sb2.append(this.pay_type);
        }
        sb2.append(j.f81007d);
        return sb2.toString();
    }

    public void unsetNo_need_pay() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetOrder_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetPay_id() {
        this.pay_id = null;
    }

    public void unsetPay_json() {
        this.pay_json = null;
    }

    public void unsetPay_type() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetPay_url() {
        this.pay_url = null;
    }

    public void unsetStep_pay_order_id() {
        this.step_pay_order_id = null;
    }

    public void validate() throws TException {
        if (this.step_pay_order_id != null) {
            return;
        }
        throw new TProtocolException("Required field 'step_pay_order_id' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(PayResp other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        int compareTo7;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo8 = Boolean.valueOf(isSetOrder_id()).compareTo(Boolean.valueOf(other.isSetOrder_id()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetOrder_id() && (compareTo7 = TBaseHelper.compareTo(this.order_id, other.order_id)) != 0) {
            return compareTo7;
        }
        int compareTo9 = Boolean.valueOf(isSetStep_pay_order_id()).compareTo(Boolean.valueOf(other.isSetStep_pay_order_id()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetStep_pay_order_id() && (compareTo6 = TBaseHelper.compareTo(this.step_pay_order_id, other.step_pay_order_id)) != 0) {
            return compareTo6;
        }
        int compareTo10 = Boolean.valueOf(isSetNo_need_pay()).compareTo(Boolean.valueOf(other.isSetNo_need_pay()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetNo_need_pay() && (compareTo5 = TBaseHelper.compareTo(this.no_need_pay, other.no_need_pay)) != 0) {
            return compareTo5;
        }
        int compareTo11 = Boolean.valueOf(isSetPay_id()).compareTo(Boolean.valueOf(other.isSetPay_id()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetPay_id() && (compareTo4 = TBaseHelper.compareTo(this.pay_id, other.pay_id)) != 0) {
            return compareTo4;
        }
        int compareTo12 = Boolean.valueOf(isSetPay_url()).compareTo(Boolean.valueOf(other.isSetPay_url()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetPay_url() && (compareTo3 = TBaseHelper.compareTo(this.pay_url, other.pay_url)) != 0) {
            return compareTo3;
        }
        int compareTo13 = Boolean.valueOf(isSetPay_json()).compareTo(Boolean.valueOf(other.isSetPay_json()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetPay_json() && (compareTo2 = TBaseHelper.compareTo(this.pay_json, other.pay_json)) != 0) {
            return compareTo2;
        }
        int compareTo14 = Boolean.valueOf(isSetPay_type()).compareTo(Boolean.valueOf(other.isSetPay_type()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (!isSetPay_type() || (compareTo = TBaseHelper.compareTo(this.pay_type, other.pay_type)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<PayResp, _Fields> deepCopy2() {
        return new PayResp(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$PayResp$_Fields[field.ordinal()]) {
            case 1:
                return Long.valueOf(getOrder_id());
            case 2:
                return getStep_pay_order_id();
            case 3:
                return Boolean.valueOf(isNo_need_pay());
            case 4:
                return getPay_id();
            case 5:
                return getPay_url();
            case 6:
                return getPay_json();
            case 7:
                return Integer.valueOf(getPay_type());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$PayResp$_Fields[field.ordinal()]) {
            case 1:
                return isSetOrder_id();
            case 2:
                return isSetStep_pay_order_id();
            case 3:
                return isSetNo_need_pay();
            case 4:
                return isSetPay_id();
            case 5:
                return isSetPay_url();
            case 6:
                return isSetPay_json();
            case 7:
                return isSetPay_type();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$PayResp$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setOrder_id(((Long) value).longValue());
                    break;
                } else {
                    unsetOrder_id();
                    break;
                }
            case 2:
                if (value != null) {
                    setStep_pay_order_id((String) value);
                    break;
                } else {
                    unsetStep_pay_order_id();
                    break;
                }
            case 3:
                if (value != null) {
                    setNo_need_pay(((Boolean) value).booleanValue());
                    break;
                } else {
                    unsetNo_need_pay();
                    break;
                }
            case 4:
                if (value != null) {
                    setPay_id((String) value);
                    break;
                } else {
                    unsetPay_id();
                    break;
                }
            case 5:
                if (value != null) {
                    setPay_url((String) value);
                    break;
                } else {
                    unsetPay_url();
                    break;
                }
            case 6:
                if (value != null) {
                    setPay_json((String) value);
                    break;
                } else {
                    unsetPay_json();
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
        }
    }

    public boolean equals(PayResp that) {
        if (that == null || this.order_id != that.order_id) {
            return false;
        }
        boolean isSetStep_pay_order_id = isSetStep_pay_order_id();
        boolean isSetStep_pay_order_id2 = that.isSetStep_pay_order_id();
        if (((isSetStep_pay_order_id || isSetStep_pay_order_id2) && !(isSetStep_pay_order_id && isSetStep_pay_order_id2 && this.step_pay_order_id.equals(that.step_pay_order_id))) || this.no_need_pay != that.no_need_pay) {
            return false;
        }
        boolean isSetPay_id = isSetPay_id();
        boolean isSetPay_id2 = that.isSetPay_id();
        if ((isSetPay_id || isSetPay_id2) && !(isSetPay_id && isSetPay_id2 && this.pay_id.equals(that.pay_id))) {
            return false;
        }
        boolean isSetPay_url = isSetPay_url();
        boolean isSetPay_url2 = that.isSetPay_url();
        if ((isSetPay_url || isSetPay_url2) && !(isSetPay_url && isSetPay_url2 && this.pay_url.equals(that.pay_url))) {
            return false;
        }
        boolean isSetPay_json = isSetPay_json();
        boolean isSetPay_json2 = that.isSetPay_json();
        if ((isSetPay_json || isSetPay_json2) && !(isSetPay_json && isSetPay_json2 && this.pay_json.equals(that.pay_json))) {
            return false;
        }
        boolean isSetPay_type = isSetPay_type();
        boolean isSetPay_type2 = that.isSetPay_type();
        if (isSetPay_type || isSetPay_type2) {
            return isSetPay_type && isSetPay_type2 && this.pay_type == that.pay_type;
        }
        return true;
    }

    public PayResp(long order_id, String step_pay_order_id, boolean no_need_pay) {
        this();
        this.order_id = order_id;
        setOrder_idIsSet(true);
        this.step_pay_order_id = step_pay_order_id;
        this.no_need_pay = no_need_pay;
        setNo_need_payIsSet(true);
    }

    public PayResp(PayResp other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.PAY_ID, _Fields.PAY_URL, _Fields.PAY_JSON, _Fields.PAY_TYPE};
        this.__isset_bitfield = other.__isset_bitfield;
        this.order_id = other.order_id;
        if (other.isSetStep_pay_order_id()) {
            this.step_pay_order_id = other.step_pay_order_id;
        }
        this.no_need_pay = other.no_need_pay;
        if (other.isSetPay_id()) {
            this.pay_id = other.pay_id;
        }
        if (other.isSetPay_url()) {
            this.pay_url = other.pay_url;
        }
        if (other.isSetPay_json()) {
            this.pay_json = other.pay_json;
        }
        this.pay_type = other.pay_type;
    }
}
