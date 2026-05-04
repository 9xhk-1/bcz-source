package com.baicizhan.online.strategy_api;

import com.meizu.cloud.pushsdk.constants.PushConstants;
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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class UserEntitlement implements TBase<UserEntitlement, _Fields>, Serializable, Cloneable, Comparable<UserEntitlement> {
    private static final int __CURRENT_VALUE_ISSET_ID = 2;
    private static final int __EXPIRE_TIME_ISSET_ID = 0;
    private static final int __MAX_VALUE_ISSET_ID = 1;
    private static final int __MEMBER_TYPE_ISSET_ID = 6;
    private static final int __NEXT_RECOVERY_AMOUNT_ISSET_ID = 4;
    private static final int __NEXT_RECOVERY_TIME_ISSET_ID = 3;
    private static final int __RECOVERY_INTERVAL_ISSET_ID = 5;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int current_value;
    public String entitlement_key;
    public long expire_time;
    public int max_value;
    public int member_type;
    public int next_recovery_amount;
    public long next_recovery_time;
    private _Fields[] optionals;
    public int recovery_interval;
    private static final TStruct STRUCT_DESC = new TStruct("UserEntitlement");
    private static final TField ENTITLEMENT_KEY_FIELD_DESC = new TField("entitlement_key", (byte) 11, 1);
    private static final TField EXPIRE_TIME_FIELD_DESC = new TField(PushConstants.REGISTER_STATUS_EXPIRE_TIME, (byte) 10, 2);
    private static final TField MAX_VALUE_FIELD_DESC = new TField("max_value", (byte) 8, 3);
    private static final TField CURRENT_VALUE_FIELD_DESC = new TField("current_value", (byte) 8, 4);
    private static final TField NEXT_RECOVERY_TIME_FIELD_DESC = new TField("next_recovery_time", (byte) 10, 5);
    private static final TField NEXT_RECOVERY_AMOUNT_FIELD_DESC = new TField("next_recovery_amount", (byte) 8, 6);
    private static final TField RECOVERY_INTERVAL_FIELD_DESC = new TField("recovery_interval", (byte) 8, 7);
    private static final TField MEMBER_TYPE_FIELD_DESC = new TField("member_type", (byte) 8, 8);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.strategy_api.UserEntitlement$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$strategy_api$UserEntitlement$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$strategy_api$UserEntitlement$_Fields = iArr;
            try {
                iArr[_Fields.ENTITLEMENT_KEY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$strategy_api$UserEntitlement$_Fields[_Fields.EXPIRE_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$strategy_api$UserEntitlement$_Fields[_Fields.MAX_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$strategy_api$UserEntitlement$_Fields[_Fields.CURRENT_VALUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$strategy_api$UserEntitlement$_Fields[_Fields.NEXT_RECOVERY_TIME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$strategy_api$UserEntitlement$_Fields[_Fields.NEXT_RECOVERY_AMOUNT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$strategy_api$UserEntitlement$_Fields[_Fields.RECOVERY_INTERVAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$strategy_api$UserEntitlement$_Fields[_Fields.MEMBER_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserEntitlementStandardScheme extends StandardScheme<UserEntitlement> {
        private UserEntitlementStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserEntitlement struct) throws TException {
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
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.entitlement_key = iprot.readString();
                            struct.setEntitlement_keyIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.expire_time = iprot.readI64();
                            struct.setExpire_timeIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.max_value = iprot.readI32();
                            struct.setMax_valueIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.current_value = iprot.readI32();
                            struct.setCurrent_valueIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.next_recovery_time = iprot.readI64();
                            struct.setNext_recovery_timeIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.next_recovery_amount = iprot.readI32();
                            struct.setNext_recovery_amountIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.recovery_interval = iprot.readI32();
                            struct.setRecovery_intervalIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.member_type = iprot.readI32();
                            struct.setMember_typeIsSet(true);
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
        public void write(TProtocol oprot, UserEntitlement struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserEntitlement.STRUCT_DESC);
            if (struct.entitlement_key != null && struct.isSetEntitlement_key()) {
                oprot.writeFieldBegin(UserEntitlement.ENTITLEMENT_KEY_FIELD_DESC);
                oprot.writeString(struct.entitlement_key);
                oprot.writeFieldEnd();
            }
            if (struct.isSetExpire_time()) {
                oprot.writeFieldBegin(UserEntitlement.EXPIRE_TIME_FIELD_DESC);
                oprot.writeI64(struct.expire_time);
                oprot.writeFieldEnd();
            }
            if (struct.isSetMax_value()) {
                oprot.writeFieldBegin(UserEntitlement.MAX_VALUE_FIELD_DESC);
                oprot.writeI32(struct.max_value);
                oprot.writeFieldEnd();
            }
            if (struct.isSetCurrent_value()) {
                oprot.writeFieldBegin(UserEntitlement.CURRENT_VALUE_FIELD_DESC);
                oprot.writeI32(struct.current_value);
                oprot.writeFieldEnd();
            }
            if (struct.isSetNext_recovery_time()) {
                oprot.writeFieldBegin(UserEntitlement.NEXT_RECOVERY_TIME_FIELD_DESC);
                oprot.writeI64(struct.next_recovery_time);
                oprot.writeFieldEnd();
            }
            if (struct.isSetNext_recovery_amount()) {
                oprot.writeFieldBegin(UserEntitlement.NEXT_RECOVERY_AMOUNT_FIELD_DESC);
                oprot.writeI32(struct.next_recovery_amount);
                oprot.writeFieldEnd();
            }
            if (struct.isSetRecovery_interval()) {
                oprot.writeFieldBegin(UserEntitlement.RECOVERY_INTERVAL_FIELD_DESC);
                oprot.writeI32(struct.recovery_interval);
                oprot.writeFieldEnd();
            }
            if (struct.isSetMember_type()) {
                oprot.writeFieldBegin(UserEntitlement.MEMBER_TYPE_FIELD_DESC);
                oprot.writeI32(struct.member_type);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserEntitlementStandardSchemeFactory implements SchemeFactory {
        private UserEntitlementStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserEntitlementStandardScheme getScheme() {
            return new UserEntitlementStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserEntitlementTupleScheme extends TupleScheme<UserEntitlement> {
        private UserEntitlementTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserEntitlement struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BitSet readBitSet = tTupleProtocol.readBitSet(8);
            if (readBitSet.get(0)) {
                struct.entitlement_key = tTupleProtocol.readString();
                struct.setEntitlement_keyIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.expire_time = tTupleProtocol.readI64();
                struct.setExpire_timeIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.max_value = tTupleProtocol.readI32();
                struct.setMax_valueIsSet(true);
            }
            if (readBitSet.get(3)) {
                struct.current_value = tTupleProtocol.readI32();
                struct.setCurrent_valueIsSet(true);
            }
            if (readBitSet.get(4)) {
                struct.next_recovery_time = tTupleProtocol.readI64();
                struct.setNext_recovery_timeIsSet(true);
            }
            if (readBitSet.get(5)) {
                struct.next_recovery_amount = tTupleProtocol.readI32();
                struct.setNext_recovery_amountIsSet(true);
            }
            if (readBitSet.get(6)) {
                struct.recovery_interval = tTupleProtocol.readI32();
                struct.setRecovery_intervalIsSet(true);
            }
            if (readBitSet.get(7)) {
                struct.member_type = tTupleProtocol.readI32();
                struct.setMember_typeIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserEntitlement struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BitSet bitSet = new BitSet();
            if (struct.isSetEntitlement_key()) {
                bitSet.set(0);
            }
            if (struct.isSetExpire_time()) {
                bitSet.set(1);
            }
            if (struct.isSetMax_value()) {
                bitSet.set(2);
            }
            if (struct.isSetCurrent_value()) {
                bitSet.set(3);
            }
            if (struct.isSetNext_recovery_time()) {
                bitSet.set(4);
            }
            if (struct.isSetNext_recovery_amount()) {
                bitSet.set(5);
            }
            if (struct.isSetRecovery_interval()) {
                bitSet.set(6);
            }
            if (struct.isSetMember_type()) {
                bitSet.set(7);
            }
            tTupleProtocol.writeBitSet(bitSet, 8);
            if (struct.isSetEntitlement_key()) {
                tTupleProtocol.writeString(struct.entitlement_key);
            }
            if (struct.isSetExpire_time()) {
                tTupleProtocol.writeI64(struct.expire_time);
            }
            if (struct.isSetMax_value()) {
                tTupleProtocol.writeI32(struct.max_value);
            }
            if (struct.isSetCurrent_value()) {
                tTupleProtocol.writeI32(struct.current_value);
            }
            if (struct.isSetNext_recovery_time()) {
                tTupleProtocol.writeI64(struct.next_recovery_time);
            }
            if (struct.isSetNext_recovery_amount()) {
                tTupleProtocol.writeI32(struct.next_recovery_amount);
            }
            if (struct.isSetRecovery_interval()) {
                tTupleProtocol.writeI32(struct.recovery_interval);
            }
            if (struct.isSetMember_type()) {
                tTupleProtocol.writeI32(struct.member_type);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserEntitlementTupleSchemeFactory implements SchemeFactory {
        private UserEntitlementTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserEntitlementTupleScheme getScheme() {
            return new UserEntitlementTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ENTITLEMENT_KEY(1, "entitlement_key"),
        EXPIRE_TIME(2, PushConstants.REGISTER_STATUS_EXPIRE_TIME),
        MAX_VALUE(3, "max_value"),
        CURRENT_VALUE(4, "current_value"),
        NEXT_RECOVERY_TIME(5, "next_recovery_time"),
        NEXT_RECOVERY_AMOUNT(6, "next_recovery_amount"),
        RECOVERY_INTERVAL(7, "recovery_interval"),
        MEMBER_TYPE(8, "member_type");

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
                    return ENTITLEMENT_KEY;
                case 2:
                    return EXPIRE_TIME;
                case 3:
                    return MAX_VALUE;
                case 4:
                    return CURRENT_VALUE;
                case 5:
                    return NEXT_RECOVERY_TIME;
                case 6:
                    return NEXT_RECOVERY_AMOUNT;
                case 7:
                    return RECOVERY_INTERVAL;
                case 8:
                    return MEMBER_TYPE;
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
        hashMap.put(StandardScheme.class, new UserEntitlementStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserEntitlementTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ENTITLEMENT_KEY, (_Fields) new FieldMetaData("entitlement_key", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.EXPIRE_TIME, (_Fields) new FieldMetaData(PushConstants.REGISTER_STATUS_EXPIRE_TIME, (byte) 2, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.MAX_VALUE, (_Fields) new FieldMetaData("max_value", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.CURRENT_VALUE, (_Fields) new FieldMetaData("current_value", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.NEXT_RECOVERY_TIME, (_Fields) new FieldMetaData("next_recovery_time", (byte) 2, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.NEXT_RECOVERY_AMOUNT, (_Fields) new FieldMetaData("next_recovery_amount", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.RECOVERY_INTERVAL, (_Fields) new FieldMetaData("recovery_interval", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.MEMBER_TYPE, (_Fields) new FieldMetaData("member_type", (byte) 2, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserEntitlement.class, unmodifiableMap);
    }

    public UserEntitlement() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.ENTITLEMENT_KEY, _Fields.EXPIRE_TIME, _Fields.MAX_VALUE, _Fields.CURRENT_VALUE, _Fields.NEXT_RECOVERY_TIME, _Fields.NEXT_RECOVERY_AMOUNT, _Fields.RECOVERY_INTERVAL, _Fields.MEMBER_TYPE};
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
        this.entitlement_key = null;
        setExpire_timeIsSet(false);
        this.expire_time = 0L;
        setMax_valueIsSet(false);
        this.max_value = 0;
        setCurrent_valueIsSet(false);
        this.current_value = 0;
        setNext_recovery_timeIsSet(false);
        this.next_recovery_time = 0L;
        setNext_recovery_amountIsSet(false);
        this.next_recovery_amount = 0;
        setRecovery_intervalIsSet(false);
        this.recovery_interval = 0;
        setMember_typeIsSet(false);
        this.member_type = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserEntitlement)) {
            return equals((UserEntitlement) that);
        }
        return false;
    }

    public int getCurrent_value() {
        return this.current_value;
    }

    public String getEntitlement_key() {
        return this.entitlement_key;
    }

    public long getExpire_time() {
        return this.expire_time;
    }

    public int getMax_value() {
        return this.max_value;
    }

    public int getMember_type() {
        return this.member_type;
    }

    public int getNext_recovery_amount() {
        return this.next_recovery_amount;
    }

    public long getNext_recovery_time() {
        return this.next_recovery_time;
    }

    public int getRecovery_interval() {
        return this.recovery_interval;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetCurrent_value() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetEntitlement_key() {
        return this.entitlement_key != null;
    }

    public boolean isSetExpire_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetMax_value() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetMember_type() {
        return EncodingUtils.testBit(this.__isset_bitfield, 6);
    }

    public boolean isSetNext_recovery_amount() {
        return EncodingUtils.testBit(this.__isset_bitfield, 4);
    }

    public boolean isSetNext_recovery_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetRecovery_interval() {
        return EncodingUtils.testBit(this.__isset_bitfield, 5);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserEntitlement setCurrent_value(int current_value) {
        this.current_value = current_value;
        setCurrent_valueIsSet(true);
        return this;
    }

    public void setCurrent_valueIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public UserEntitlement setEntitlement_key(String entitlement_key) {
        this.entitlement_key = entitlement_key;
        return this;
    }

    public void setEntitlement_keyIsSet(boolean value) {
        if (value) {
            return;
        }
        this.entitlement_key = null;
    }

    public UserEntitlement setExpire_time(long expire_time) {
        this.expire_time = expire_time;
        setExpire_timeIsSet(true);
        return this;
    }

    public void setExpire_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public UserEntitlement setMax_value(int max_value) {
        this.max_value = max_value;
        setMax_valueIsSet(true);
        return this;
    }

    public void setMax_valueIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public UserEntitlement setMember_type(int member_type) {
        this.member_type = member_type;
        setMember_typeIsSet(true);
        return this;
    }

    public void setMember_typeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 6, value);
    }

    public UserEntitlement setNext_recovery_amount(int next_recovery_amount) {
        this.next_recovery_amount = next_recovery_amount;
        setNext_recovery_amountIsSet(true);
        return this;
    }

    public void setNext_recovery_amountIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 4, value);
    }

    public UserEntitlement setNext_recovery_time(long next_recovery_time) {
        this.next_recovery_time = next_recovery_time;
        setNext_recovery_timeIsSet(true);
        return this;
    }

    public void setNext_recovery_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public UserEntitlement setRecovery_interval(int recovery_interval) {
        this.recovery_interval = recovery_interval;
        setRecovery_intervalIsSet(true);
        return this;
    }

    public void setRecovery_intervalIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 5, value);
    }

    public String toString() {
        boolean z11;
        StringBuilder sb2 = new StringBuilder("UserEntitlement(");
        boolean z12 = false;
        if (isSetEntitlement_key()) {
            sb2.append("entitlement_key:");
            String str = this.entitlement_key;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            z11 = false;
        } else {
            z11 = true;
        }
        if (isSetExpire_time()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("expire_time:");
            sb2.append(this.expire_time);
            z11 = false;
        }
        if (isSetMax_value()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("max_value:");
            sb2.append(this.max_value);
            z11 = false;
        }
        if (isSetCurrent_value()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("current_value:");
            sb2.append(this.current_value);
            z11 = false;
        }
        if (isSetNext_recovery_time()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("next_recovery_time:");
            sb2.append(this.next_recovery_time);
            z11 = false;
        }
        if (isSetNext_recovery_amount()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("next_recovery_amount:");
            sb2.append(this.next_recovery_amount);
            z11 = false;
        }
        if (isSetRecovery_interval()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("recovery_interval:");
            sb2.append(this.recovery_interval);
        } else {
            z12 = z11;
        }
        if (isSetMember_type()) {
            if (!z12) {
                sb2.append(j2.O);
            }
            sb2.append("member_type:");
            sb2.append(this.member_type);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetCurrent_value() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetEntitlement_key() {
        this.entitlement_key = null;
    }

    public void unsetExpire_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetMax_value() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetMember_type() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 6);
    }

    public void unsetNext_recovery_amount() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 4);
    }

    public void unsetNext_recovery_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetRecovery_interval() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 5);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(UserEntitlement other) {
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
        int compareTo9 = Boolean.valueOf(isSetEntitlement_key()).compareTo(Boolean.valueOf(other.isSetEntitlement_key()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetEntitlement_key() && (compareTo8 = TBaseHelper.compareTo(this.entitlement_key, other.entitlement_key)) != 0) {
            return compareTo8;
        }
        int compareTo10 = Boolean.valueOf(isSetExpire_time()).compareTo(Boolean.valueOf(other.isSetExpire_time()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetExpire_time() && (compareTo7 = TBaseHelper.compareTo(this.expire_time, other.expire_time)) != 0) {
            return compareTo7;
        }
        int compareTo11 = Boolean.valueOf(isSetMax_value()).compareTo(Boolean.valueOf(other.isSetMax_value()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetMax_value() && (compareTo6 = TBaseHelper.compareTo(this.max_value, other.max_value)) != 0) {
            return compareTo6;
        }
        int compareTo12 = Boolean.valueOf(isSetCurrent_value()).compareTo(Boolean.valueOf(other.isSetCurrent_value()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetCurrent_value() && (compareTo5 = TBaseHelper.compareTo(this.current_value, other.current_value)) != 0) {
            return compareTo5;
        }
        int compareTo13 = Boolean.valueOf(isSetNext_recovery_time()).compareTo(Boolean.valueOf(other.isSetNext_recovery_time()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetNext_recovery_time() && (compareTo4 = TBaseHelper.compareTo(this.next_recovery_time, other.next_recovery_time)) != 0) {
            return compareTo4;
        }
        int compareTo14 = Boolean.valueOf(isSetNext_recovery_amount()).compareTo(Boolean.valueOf(other.isSetNext_recovery_amount()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (isSetNext_recovery_amount() && (compareTo3 = TBaseHelper.compareTo(this.next_recovery_amount, other.next_recovery_amount)) != 0) {
            return compareTo3;
        }
        int compareTo15 = Boolean.valueOf(isSetRecovery_interval()).compareTo(Boolean.valueOf(other.isSetRecovery_interval()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (isSetRecovery_interval() && (compareTo2 = TBaseHelper.compareTo(this.recovery_interval, other.recovery_interval)) != 0) {
            return compareTo2;
        }
        int compareTo16 = Boolean.valueOf(isSetMember_type()).compareTo(Boolean.valueOf(other.isSetMember_type()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (!isSetMember_type() || (compareTo = TBaseHelper.compareTo(this.member_type, other.member_type)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserEntitlement, _Fields> deepCopy2() {
        return new UserEntitlement(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$UserEntitlement$_Fields[field.ordinal()]) {
            case 1:
                return getEntitlement_key();
            case 2:
                return Long.valueOf(getExpire_time());
            case 3:
                return Integer.valueOf(getMax_value());
            case 4:
                return Integer.valueOf(getCurrent_value());
            case 5:
                return Long.valueOf(getNext_recovery_time());
            case 6:
                return Integer.valueOf(getNext_recovery_amount());
            case 7:
                return Integer.valueOf(getRecovery_interval());
            case 8:
                return Integer.valueOf(getMember_type());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$UserEntitlement$_Fields[field.ordinal()]) {
            case 1:
                return isSetEntitlement_key();
            case 2:
                return isSetExpire_time();
            case 3:
                return isSetMax_value();
            case 4:
                return isSetCurrent_value();
            case 5:
                return isSetNext_recovery_time();
            case 6:
                return isSetNext_recovery_amount();
            case 7:
                return isSetRecovery_interval();
            case 8:
                return isSetMember_type();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$UserEntitlement$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setEntitlement_key((String) value);
                    break;
                } else {
                    unsetEntitlement_key();
                    break;
                }
            case 2:
                if (value != null) {
                    setExpire_time(((Long) value).longValue());
                    break;
                } else {
                    unsetExpire_time();
                    break;
                }
            case 3:
                if (value != null) {
                    setMax_value(((Integer) value).intValue());
                    break;
                } else {
                    unsetMax_value();
                    break;
                }
            case 4:
                if (value != null) {
                    setCurrent_value(((Integer) value).intValue());
                    break;
                } else {
                    unsetCurrent_value();
                    break;
                }
            case 5:
                if (value != null) {
                    setNext_recovery_time(((Long) value).longValue());
                    break;
                } else {
                    unsetNext_recovery_time();
                    break;
                }
            case 6:
                if (value != null) {
                    setNext_recovery_amount(((Integer) value).intValue());
                    break;
                } else {
                    unsetNext_recovery_amount();
                    break;
                }
            case 7:
                if (value != null) {
                    setRecovery_interval(((Integer) value).intValue());
                    break;
                } else {
                    unsetRecovery_interval();
                    break;
                }
            case 8:
                if (value != null) {
                    setMember_type(((Integer) value).intValue());
                    break;
                } else {
                    unsetMember_type();
                    break;
                }
        }
    }

    public boolean equals(UserEntitlement that) {
        if (that == null) {
            return false;
        }
        boolean isSetEntitlement_key = isSetEntitlement_key();
        boolean isSetEntitlement_key2 = that.isSetEntitlement_key();
        if ((isSetEntitlement_key || isSetEntitlement_key2) && !(isSetEntitlement_key && isSetEntitlement_key2 && this.entitlement_key.equals(that.entitlement_key))) {
            return false;
        }
        boolean isSetExpire_time = isSetExpire_time();
        boolean isSetExpire_time2 = that.isSetExpire_time();
        if ((isSetExpire_time || isSetExpire_time2) && !(isSetExpire_time && isSetExpire_time2 && this.expire_time == that.expire_time)) {
            return false;
        }
        boolean isSetMax_value = isSetMax_value();
        boolean isSetMax_value2 = that.isSetMax_value();
        if ((isSetMax_value || isSetMax_value2) && !(isSetMax_value && isSetMax_value2 && this.max_value == that.max_value)) {
            return false;
        }
        boolean isSetCurrent_value = isSetCurrent_value();
        boolean isSetCurrent_value2 = that.isSetCurrent_value();
        if ((isSetCurrent_value || isSetCurrent_value2) && !(isSetCurrent_value && isSetCurrent_value2 && this.current_value == that.current_value)) {
            return false;
        }
        boolean isSetNext_recovery_time = isSetNext_recovery_time();
        boolean isSetNext_recovery_time2 = that.isSetNext_recovery_time();
        if ((isSetNext_recovery_time || isSetNext_recovery_time2) && !(isSetNext_recovery_time && isSetNext_recovery_time2 && this.next_recovery_time == that.next_recovery_time)) {
            return false;
        }
        boolean isSetNext_recovery_amount = isSetNext_recovery_amount();
        boolean isSetNext_recovery_amount2 = that.isSetNext_recovery_amount();
        if ((isSetNext_recovery_amount || isSetNext_recovery_amount2) && !(isSetNext_recovery_amount && isSetNext_recovery_amount2 && this.next_recovery_amount == that.next_recovery_amount)) {
            return false;
        }
        boolean isSetRecovery_interval = isSetRecovery_interval();
        boolean isSetRecovery_interval2 = that.isSetRecovery_interval();
        if ((isSetRecovery_interval || isSetRecovery_interval2) && !(isSetRecovery_interval && isSetRecovery_interval2 && this.recovery_interval == that.recovery_interval)) {
            return false;
        }
        boolean isSetMember_type = isSetMember_type();
        boolean isSetMember_type2 = that.isSetMember_type();
        if (isSetMember_type || isSetMember_type2) {
            return isSetMember_type && isSetMember_type2 && this.member_type == that.member_type;
        }
        return true;
    }

    public UserEntitlement(UserEntitlement other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.ENTITLEMENT_KEY, _Fields.EXPIRE_TIME, _Fields.MAX_VALUE, _Fields.CURRENT_VALUE, _Fields.NEXT_RECOVERY_TIME, _Fields.NEXT_RECOVERY_AMOUNT, _Fields.RECOVERY_INTERVAL, _Fields.MEMBER_TYPE};
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetEntitlement_key()) {
            this.entitlement_key = other.entitlement_key;
        }
        this.expire_time = other.expire_time;
        this.max_value = other.max_value;
        this.current_value = other.current_value;
        this.next_recovery_time = other.next_recovery_time;
        this.next_recovery_amount = other.next_recovery_amount;
        this.recovery_interval = other.recovery_interval;
        this.member_type = other.member_type;
    }

    public void validate() throws TException {
    }
}
