package com.baicizhan.online.game_api;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class CompassInfo implements TBase<CompassInfo, _Fields>, Serializable, Cloneable, Comparable<CompassInfo> {
    private static final int __BALANCE_ISSET_ID = 0;
    private static final int __COST_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int balance;
    public int cost;
    private static final TStruct STRUCT_DESC = new TStruct("CompassInfo");
    private static final TField BALANCE_FIELD_DESC = new TField("balance", (byte) 8, 1);
    private static final TField COST_FIELD_DESC = new TField("cost", (byte) 8, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.CompassInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$CompassInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$CompassInfo$_Fields = iArr;
            try {
                iArr[_Fields.BALANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$CompassInfo$_Fields[_Fields.COST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CompassInfoStandardScheme extends StandardScheme<CompassInfo> {
        private CompassInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, CompassInfo struct) throws TException {
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
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 8) {
                        struct.cost = iprot.readI32();
                        struct.setCostIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.balance = iprot.readI32();
                    struct.setBalanceIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetBalance()) {
                throw new TProtocolException("Required field 'balance' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetCost()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'cost' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, CompassInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(CompassInfo.STRUCT_DESC);
            oprot.writeFieldBegin(CompassInfo.BALANCE_FIELD_DESC);
            oprot.writeI32(struct.balance);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(CompassInfo.COST_FIELD_DESC);
            oprot.writeI32(struct.cost);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CompassInfoStandardSchemeFactory implements SchemeFactory {
        private CompassInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public CompassInfoStandardScheme getScheme() {
            return new CompassInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CompassInfoTupleScheme extends TupleScheme<CompassInfo> {
        private CompassInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, CompassInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.balance = tTupleProtocol.readI32();
            struct.setBalanceIsSet(true);
            struct.cost = tTupleProtocol.readI32();
            struct.setCostIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, CompassInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.balance);
            tTupleProtocol.writeI32(struct.cost);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CompassInfoTupleSchemeFactory implements SchemeFactory {
        private CompassInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public CompassInfoTupleScheme getScheme() {
            return new CompassInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        BALANCE(1, "balance"),
        COST(2, "cost");

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
                return BALANCE;
            }
            if (fieldId != 2) {
                return null;
            }
            return COST;
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
        hashMap.put(StandardScheme.class, new CompassInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new CompassInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.BALANCE, (_Fields) new FieldMetaData("balance", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.COST, (_Fields) new FieldMetaData("cost", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(CompassInfo.class, unmodifiableMap);
    }

    public CompassInfo() {
        this.__isset_bitfield = (byte) 0;
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
        setBalanceIsSet(false);
        this.balance = 0;
        setCostIsSet(false);
        this.cost = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof CompassInfo)) {
            return equals((CompassInfo) that);
        }
        return false;
    }

    public int getBalance() {
        return this.balance;
    }

    public int getCost() {
        return this.cost;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetBalance() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetCost() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public CompassInfo setBalance(int balance) {
        this.balance = balance;
        setBalanceIsSet(true);
        return this;
    }

    public void setBalanceIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public CompassInfo setCost(int cost) {
        this.cost = cost;
        setCostIsSet(true);
        return this;
    }

    public void setCostIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        return "CompassInfo(balance:" + this.balance + j2.O + "cost:" + this.cost + pn.j.f81007d;
    }

    public void unsetBalance() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetCost() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(CompassInfo other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetBalance()).compareTo(Boolean.valueOf(other.isSetBalance()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetBalance() && (compareTo2 = TBaseHelper.compareTo(this.balance, other.balance)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetCost()).compareTo(Boolean.valueOf(other.isSetCost()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetCost() || (compareTo = TBaseHelper.compareTo(this.cost, other.cost)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<CompassInfo, _Fields> deepCopy2() {
        return new CompassInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$CompassInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getBalance());
        }
        if (i11 == 2) {
            return Integer.valueOf(getCost());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$CompassInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetBalance();
        }
        if (i11 == 2) {
            return isSetCost();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$CompassInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetBalance();
                return;
            } else {
                setBalance(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetCost();
        } else {
            setCost(((Integer) value).intValue());
        }
    }

    public CompassInfo(int balance, int cost) {
        this();
        this.balance = balance;
        setBalanceIsSet(true);
        this.cost = cost;
        setCostIsSet(true);
    }

    public boolean equals(CompassInfo that) {
        return that != null && this.balance == that.balance && this.cost == that.cost;
    }

    public CompassInfo(CompassInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.balance = other.balance;
        this.cost = other.cost;
    }

    public void validate() throws TException {
    }
}
