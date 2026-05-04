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
public class EnergyInfo implements TBase<EnergyInfo, _Fields>, Serializable, Cloneable, Comparable<EnergyInfo> {
    private static final int __ENERGY_COST_ISSET_ID = 0;
    private static final int __ENERGY_COUNT_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int energy_cost;
    public int energy_count;
    private static final TStruct STRUCT_DESC = new TStruct("EnergyInfo");
    private static final TField ENERGY_COST_FIELD_DESC = new TField("energy_cost", (byte) 8, 1);
    private static final TField ENERGY_COUNT_FIELD_DESC = new TField("energy_count", (byte) 8, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.EnergyInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$EnergyInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$EnergyInfo$_Fields = iArr;
            try {
                iArr[_Fields.ENERGY_COST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$EnergyInfo$_Fields[_Fields.ENERGY_COUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class EnergyInfoStandardScheme extends StandardScheme<EnergyInfo> {
        private EnergyInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, EnergyInfo struct) throws TException {
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
                        struct.energy_count = iprot.readI32();
                        struct.setEnergy_countIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.energy_cost = iprot.readI32();
                    struct.setEnergy_costIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetEnergy_cost()) {
                throw new TProtocolException("Required field 'energy_cost' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetEnergy_count()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'energy_count' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, EnergyInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(EnergyInfo.STRUCT_DESC);
            oprot.writeFieldBegin(EnergyInfo.ENERGY_COST_FIELD_DESC);
            oprot.writeI32(struct.energy_cost);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(EnergyInfo.ENERGY_COUNT_FIELD_DESC);
            oprot.writeI32(struct.energy_count);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class EnergyInfoStandardSchemeFactory implements SchemeFactory {
        private EnergyInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public EnergyInfoStandardScheme getScheme() {
            return new EnergyInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class EnergyInfoTupleScheme extends TupleScheme<EnergyInfo> {
        private EnergyInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, EnergyInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.energy_cost = tTupleProtocol.readI32();
            struct.setEnergy_costIsSet(true);
            struct.energy_count = tTupleProtocol.readI32();
            struct.setEnergy_countIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, EnergyInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.energy_cost);
            tTupleProtocol.writeI32(struct.energy_count);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class EnergyInfoTupleSchemeFactory implements SchemeFactory {
        private EnergyInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public EnergyInfoTupleScheme getScheme() {
            return new EnergyInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ENERGY_COST(1, "energy_cost"),
        ENERGY_COUNT(2, "energy_count");

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
                return ENERGY_COST;
            }
            if (fieldId != 2) {
                return null;
            }
            return ENERGY_COUNT;
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
        hashMap.put(StandardScheme.class, new EnergyInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new EnergyInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ENERGY_COST, (_Fields) new FieldMetaData("energy_cost", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.ENERGY_COUNT, (_Fields) new FieldMetaData("energy_count", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(EnergyInfo.class, unmodifiableMap);
    }

    public EnergyInfo() {
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
        setEnergy_costIsSet(false);
        this.energy_cost = 0;
        setEnergy_countIsSet(false);
        this.energy_count = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof EnergyInfo)) {
            return equals((EnergyInfo) that);
        }
        return false;
    }

    public int getEnergy_cost() {
        return this.energy_cost;
    }

    public int getEnergy_count() {
        return this.energy_count;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetEnergy_cost() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetEnergy_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public EnergyInfo setEnergy_cost(int energy_cost) {
        this.energy_cost = energy_cost;
        setEnergy_costIsSet(true);
        return this;
    }

    public void setEnergy_costIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public EnergyInfo setEnergy_count(int energy_count) {
        this.energy_count = energy_count;
        setEnergy_countIsSet(true);
        return this;
    }

    public void setEnergy_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        return "EnergyInfo(energy_cost:" + this.energy_cost + j2.O + "energy_count:" + this.energy_count + pn.j.f81007d;
    }

    public void unsetEnergy_cost() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetEnergy_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(EnergyInfo other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetEnergy_cost()).compareTo(Boolean.valueOf(other.isSetEnergy_cost()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetEnergy_cost() && (compareTo2 = TBaseHelper.compareTo(this.energy_cost, other.energy_cost)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetEnergy_count()).compareTo(Boolean.valueOf(other.isSetEnergy_count()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetEnergy_count() || (compareTo = TBaseHelper.compareTo(this.energy_count, other.energy_count)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<EnergyInfo, _Fields> deepCopy2() {
        return new EnergyInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$EnergyInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getEnergy_cost());
        }
        if (i11 == 2) {
            return Integer.valueOf(getEnergy_count());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$EnergyInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetEnergy_cost();
        }
        if (i11 == 2) {
            return isSetEnergy_count();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$EnergyInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetEnergy_cost();
                return;
            } else {
                setEnergy_cost(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetEnergy_count();
        } else {
            setEnergy_count(((Integer) value).intValue());
        }
    }

    public EnergyInfo(int energy_cost, int energy_count) {
        this();
        this.energy_cost = energy_cost;
        setEnergy_costIsSet(true);
        this.energy_count = energy_count;
        setEnergy_countIsSet(true);
    }

    public boolean equals(EnergyInfo that) {
        return that != null && this.energy_cost == that.energy_cost && this.energy_count == that.energy_count;
    }

    public EnergyInfo(EnergyInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.energy_cost = other.energy_cost;
        this.energy_count = other.energy_count;
    }

    public void validate() throws TException {
    }
}
