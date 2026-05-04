package com.baicizhan.online.strategy_api;

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
public class EnergyAdInfo implements TBase<EnergyAdInfo, _Fields>, Serializable, Cloneable, Comparable<EnergyAdInfo> {
    private static final int __ADD_ENERGY_ISSET_ID = 0;
    private static final int __REMAIN_COUNT_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int add_energy;
    public int remain_count;
    private static final TStruct STRUCT_DESC = new TStruct("EnergyAdInfo");
    private static final TField ADD_ENERGY_FIELD_DESC = new TField("add_energy", (byte) 8, 1);
    private static final TField REMAIN_COUNT_FIELD_DESC = new TField("remain_count", (byte) 8, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.strategy_api.EnergyAdInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$strategy_api$EnergyAdInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$strategy_api$EnergyAdInfo$_Fields = iArr;
            try {
                iArr[_Fields.ADD_ENERGY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$strategy_api$EnergyAdInfo$_Fields[_Fields.REMAIN_COUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class EnergyAdInfoStandardScheme extends StandardScheme<EnergyAdInfo> {
        private EnergyAdInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, EnergyAdInfo struct) throws TException {
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
                        struct.remain_count = iprot.readI32();
                        struct.setRemain_countIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.add_energy = iprot.readI32();
                    struct.setAdd_energyIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetAdd_energy()) {
                throw new TProtocolException("Required field 'add_energy' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetRemain_count()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'remain_count' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, EnergyAdInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(EnergyAdInfo.STRUCT_DESC);
            oprot.writeFieldBegin(EnergyAdInfo.ADD_ENERGY_FIELD_DESC);
            oprot.writeI32(struct.add_energy);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(EnergyAdInfo.REMAIN_COUNT_FIELD_DESC);
            oprot.writeI32(struct.remain_count);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class EnergyAdInfoStandardSchemeFactory implements SchemeFactory {
        private EnergyAdInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public EnergyAdInfoStandardScheme getScheme() {
            return new EnergyAdInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class EnergyAdInfoTupleScheme extends TupleScheme<EnergyAdInfo> {
        private EnergyAdInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, EnergyAdInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.add_energy = tTupleProtocol.readI32();
            struct.setAdd_energyIsSet(true);
            struct.remain_count = tTupleProtocol.readI32();
            struct.setRemain_countIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, EnergyAdInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.add_energy);
            tTupleProtocol.writeI32(struct.remain_count);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class EnergyAdInfoTupleSchemeFactory implements SchemeFactory {
        private EnergyAdInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public EnergyAdInfoTupleScheme getScheme() {
            return new EnergyAdInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ADD_ENERGY(1, "add_energy"),
        REMAIN_COUNT(2, "remain_count");

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
                return ADD_ENERGY;
            }
            if (fieldId != 2) {
                return null;
            }
            return REMAIN_COUNT;
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
        hashMap.put(StandardScheme.class, new EnergyAdInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new EnergyAdInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ADD_ENERGY, (_Fields) new FieldMetaData("add_energy", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.REMAIN_COUNT, (_Fields) new FieldMetaData("remain_count", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(EnergyAdInfo.class, unmodifiableMap);
    }

    public EnergyAdInfo() {
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
        setAdd_energyIsSet(false);
        this.add_energy = 0;
        setRemain_countIsSet(false);
        this.remain_count = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof EnergyAdInfo)) {
            return equals((EnergyAdInfo) that);
        }
        return false;
    }

    public int getAdd_energy() {
        return this.add_energy;
    }

    public int getRemain_count() {
        return this.remain_count;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAdd_energy() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetRemain_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public EnergyAdInfo setAdd_energy(int add_energy) {
        this.add_energy = add_energy;
        setAdd_energyIsSet(true);
        return this;
    }

    public void setAdd_energyIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public EnergyAdInfo setRemain_count(int remain_count) {
        this.remain_count = remain_count;
        setRemain_countIsSet(true);
        return this;
    }

    public void setRemain_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        return "EnergyAdInfo(add_energy:" + this.add_energy + j2.O + "remain_count:" + this.remain_count + pn.j.f81007d;
    }

    public void unsetAdd_energy() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetRemain_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(EnergyAdInfo other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetAdd_energy()).compareTo(Boolean.valueOf(other.isSetAdd_energy()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetAdd_energy() && (compareTo2 = TBaseHelper.compareTo(this.add_energy, other.add_energy)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetRemain_count()).compareTo(Boolean.valueOf(other.isSetRemain_count()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetRemain_count() || (compareTo = TBaseHelper.compareTo(this.remain_count, other.remain_count)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<EnergyAdInfo, _Fields> deepCopy2() {
        return new EnergyAdInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$EnergyAdInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getAdd_energy());
        }
        if (i11 == 2) {
            return Integer.valueOf(getRemain_count());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$EnergyAdInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetAdd_energy();
        }
        if (i11 == 2) {
            return isSetRemain_count();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$EnergyAdInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetAdd_energy();
                return;
            } else {
                setAdd_energy(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetRemain_count();
        } else {
            setRemain_count(((Integer) value).intValue());
        }
    }

    public EnergyAdInfo(int add_energy, int remain_count) {
        this();
        this.add_energy = add_energy;
        setAdd_energyIsSet(true);
        this.remain_count = remain_count;
        setRemain_countIsSet(true);
    }

    public boolean equals(EnergyAdInfo that) {
        return that != null && this.add_energy == that.add_energy && this.remain_count == that.remain_count;
    }

    public EnergyAdInfo(EnergyAdInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.add_energy = other.add_energy;
        this.remain_count = other.remain_count;
    }

    public void validate() throws TException {
    }
}
