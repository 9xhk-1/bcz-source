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
public class HarmonyPayInfo implements TBase<HarmonyPayInfo, _Fields>, Serializable, Cloneable, Comparable<HarmonyPayInfo> {
    private static final int __TYPE_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String jws_purchase_order;
    public String jws_subscription_status;
    private _Fields[] optionals;
    public int type;
    private static final TStruct STRUCT_DESC = new TStruct("HarmonyPayInfo");
    private static final TField TYPE_FIELD_DESC = new TField("type", (byte) 8, 1);
    private static final TField JWS_PURCHASE_ORDER_FIELD_DESC = new TField("jws_purchase_order", (byte) 11, 2);
    private static final TField JWS_SUBSCRIPTION_STATUS_FIELD_DESC = new TField("jws_subscription_status", (byte) 11, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_assistant_api.HarmonyPayInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_assistant_api$HarmonyPayInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_assistant_api$HarmonyPayInfo$_Fields = iArr;
            try {
                iArr[_Fields.TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$HarmonyPayInfo$_Fields[_Fields.JWS_PURCHASE_ORDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$HarmonyPayInfo$_Fields[_Fields.JWS_SUBSCRIPTION_STATUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class HarmonyPayInfoStandardScheme extends StandardScheme<HarmonyPayInfo> {
        private HarmonyPayInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, HarmonyPayInfo struct) throws TException {
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
                            TProtocolUtil.skip(iprot, b11);
                        } else if (b11 == 11) {
                            struct.jws_subscription_status = iprot.readString();
                            struct.setJws_subscription_statusIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.jws_purchase_order = iprot.readString();
                        struct.setJws_purchase_orderIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.type = iprot.readI32();
                    struct.setTypeIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, HarmonyPayInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(HarmonyPayInfo.STRUCT_DESC);
            if (struct.isSetType()) {
                oprot.writeFieldBegin(HarmonyPayInfo.TYPE_FIELD_DESC);
                oprot.writeI32(struct.type);
                oprot.writeFieldEnd();
            }
            if (struct.jws_purchase_order != null && struct.isSetJws_purchase_order()) {
                oprot.writeFieldBegin(HarmonyPayInfo.JWS_PURCHASE_ORDER_FIELD_DESC);
                oprot.writeString(struct.jws_purchase_order);
                oprot.writeFieldEnd();
            }
            if (struct.jws_subscription_status != null && struct.isSetJws_subscription_status()) {
                oprot.writeFieldBegin(HarmonyPayInfo.JWS_SUBSCRIPTION_STATUS_FIELD_DESC);
                oprot.writeString(struct.jws_subscription_status);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class HarmonyPayInfoStandardSchemeFactory implements SchemeFactory {
        private HarmonyPayInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public HarmonyPayInfoStandardScheme getScheme() {
            return new HarmonyPayInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class HarmonyPayInfoTupleScheme extends TupleScheme<HarmonyPayInfo> {
        private HarmonyPayInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, HarmonyPayInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BitSet readBitSet = tTupleProtocol.readBitSet(3);
            if (readBitSet.get(0)) {
                struct.type = tTupleProtocol.readI32();
                struct.setTypeIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.jws_purchase_order = tTupleProtocol.readString();
                struct.setJws_purchase_orderIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.jws_subscription_status = tTupleProtocol.readString();
                struct.setJws_subscription_statusIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, HarmonyPayInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BitSet bitSet = new BitSet();
            if (struct.isSetType()) {
                bitSet.set(0);
            }
            if (struct.isSetJws_purchase_order()) {
                bitSet.set(1);
            }
            if (struct.isSetJws_subscription_status()) {
                bitSet.set(2);
            }
            tTupleProtocol.writeBitSet(bitSet, 3);
            if (struct.isSetType()) {
                tTupleProtocol.writeI32(struct.type);
            }
            if (struct.isSetJws_purchase_order()) {
                tTupleProtocol.writeString(struct.jws_purchase_order);
            }
            if (struct.isSetJws_subscription_status()) {
                tTupleProtocol.writeString(struct.jws_subscription_status);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class HarmonyPayInfoTupleSchemeFactory implements SchemeFactory {
        private HarmonyPayInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public HarmonyPayInfoTupleScheme getScheme() {
            return new HarmonyPayInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TYPE(1, "type"),
        JWS_PURCHASE_ORDER(2, "jws_purchase_order"),
        JWS_SUBSCRIPTION_STATUS(3, "jws_subscription_status");

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
                return TYPE;
            }
            if (fieldId == 2) {
                return JWS_PURCHASE_ORDER;
            }
            if (fieldId != 3) {
                return null;
            }
            return JWS_SUBSCRIPTION_STATUS;
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
        hashMap.put(StandardScheme.class, new HarmonyPayInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new HarmonyPayInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TYPE, (_Fields) new FieldMetaData("type", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.JWS_PURCHASE_ORDER, (_Fields) new FieldMetaData("jws_purchase_order", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.JWS_SUBSCRIPTION_STATUS, (_Fields) new FieldMetaData("jws_subscription_status", (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(HarmonyPayInfo.class, unmodifiableMap);
    }

    public HarmonyPayInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.TYPE, _Fields.JWS_PURCHASE_ORDER, _Fields.JWS_SUBSCRIPTION_STATUS};
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
        setTypeIsSet(false);
        this.type = 0;
        this.jws_purchase_order = null;
        this.jws_subscription_status = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof HarmonyPayInfo)) {
            return equals((HarmonyPayInfo) that);
        }
        return false;
    }

    public String getJws_purchase_order() {
        return this.jws_purchase_order;
    }

    public String getJws_subscription_status() {
        return this.jws_subscription_status;
    }

    public int getType() {
        return this.type;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetJws_purchase_order() {
        return this.jws_purchase_order != null;
    }

    public boolean isSetJws_subscription_status() {
        return this.jws_subscription_status != null;
    }

    public boolean isSetType() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public HarmonyPayInfo setJws_purchase_order(String jws_purchase_order) {
        this.jws_purchase_order = jws_purchase_order;
        return this;
    }

    public void setJws_purchase_orderIsSet(boolean value) {
        if (value) {
            return;
        }
        this.jws_purchase_order = null;
    }

    public HarmonyPayInfo setJws_subscription_status(String jws_subscription_status) {
        this.jws_subscription_status = jws_subscription_status;
        return this;
    }

    public void setJws_subscription_statusIsSet(boolean value) {
        if (value) {
            return;
        }
        this.jws_subscription_status = null;
    }

    public HarmonyPayInfo setType(int type) {
        this.type = type;
        setTypeIsSet(true);
        return this;
    }

    public void setTypeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        boolean z11;
        StringBuilder sb2 = new StringBuilder("HarmonyPayInfo(");
        boolean z12 = false;
        if (isSetType()) {
            sb2.append("type:");
            sb2.append(this.type);
            z11 = false;
        } else {
            z11 = true;
        }
        if (isSetJws_purchase_order()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("jws_purchase_order:");
            String str = this.jws_purchase_order;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
        } else {
            z12 = z11;
        }
        if (isSetJws_subscription_status()) {
            if (!z12) {
                sb2.append(j2.O);
            }
            sb2.append("jws_subscription_status:");
            String str2 = this.jws_subscription_status;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
        }
        sb2.append(j.f81007d);
        return sb2.toString();
    }

    public void unsetJws_purchase_order() {
        this.jws_purchase_order = null;
    }

    public void unsetJws_subscription_status() {
        this.jws_subscription_status = null;
    }

    public void unsetType() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(HarmonyPayInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetType()).compareTo(Boolean.valueOf(other.isSetType()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetType() && (compareTo3 = TBaseHelper.compareTo(this.type, other.type)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetJws_purchase_order()).compareTo(Boolean.valueOf(other.isSetJws_purchase_order()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetJws_purchase_order() && (compareTo2 = TBaseHelper.compareTo(this.jws_purchase_order, other.jws_purchase_order)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetJws_subscription_status()).compareTo(Boolean.valueOf(other.isSetJws_subscription_status()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetJws_subscription_status() || (compareTo = TBaseHelper.compareTo(this.jws_subscription_status, other.jws_subscription_status)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<HarmonyPayInfo, _Fields> deepCopy2() {
        return new HarmonyPayInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$HarmonyPayInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getType());
        }
        if (i11 == 2) {
            return getJws_purchase_order();
        }
        if (i11 == 3) {
            return getJws_subscription_status();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$HarmonyPayInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetType();
        }
        if (i11 == 2) {
            return isSetJws_purchase_order();
        }
        if (i11 == 3) {
            return isSetJws_subscription_status();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$HarmonyPayInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetType();
                return;
            } else {
                setType(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetJws_purchase_order();
                return;
            } else {
                setJws_purchase_order((String) value);
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetJws_subscription_status();
        } else {
            setJws_subscription_status((String) value);
        }
    }

    public boolean equals(HarmonyPayInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetType = isSetType();
        boolean isSetType2 = that.isSetType();
        if ((isSetType || isSetType2) && !(isSetType && isSetType2 && this.type == that.type)) {
            return false;
        }
        boolean isSetJws_purchase_order = isSetJws_purchase_order();
        boolean isSetJws_purchase_order2 = that.isSetJws_purchase_order();
        if ((isSetJws_purchase_order || isSetJws_purchase_order2) && !(isSetJws_purchase_order && isSetJws_purchase_order2 && this.jws_purchase_order.equals(that.jws_purchase_order))) {
            return false;
        }
        boolean isSetJws_subscription_status = isSetJws_subscription_status();
        boolean isSetJws_subscription_status2 = that.isSetJws_subscription_status();
        if (isSetJws_subscription_status || isSetJws_subscription_status2) {
            return isSetJws_subscription_status && isSetJws_subscription_status2 && this.jws_subscription_status.equals(that.jws_subscription_status);
        }
        return true;
    }

    public HarmonyPayInfo(HarmonyPayInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.TYPE, _Fields.JWS_PURCHASE_ORDER, _Fields.JWS_SUBSCRIPTION_STATUS};
        this.__isset_bitfield = other.__isset_bitfield;
        this.type = other.type;
        if (other.isSetJws_purchase_order()) {
            this.jws_purchase_order = other.jws_purchase_order;
        }
        if (other.isSetJws_subscription_status()) {
            this.jws_subscription_status = other.jws_subscription_status;
        }
    }

    public void validate() throws TException {
    }
}
