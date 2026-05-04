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
public class WordEnergyInfo implements TBase<WordEnergyInfo, _Fields>, Serializable, Cloneable, Comparable<WordEnergyInfo> {
    private static final int __ENERGY_COUNT_ISSET_ID = 2;
    private static final int __ENERGY_MAX_ISSET_ID = 1;
    private static final int __NEXT_ENERGY_TIME_ISSET_ID = 3;
    private static final int __UNLIMITED_TIME_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int energy_count;
    public EnergyCycle energy_cycle;
    public int energy_max;
    public long next_energy_time;
    public long unlimited_time;
    private static final TStruct STRUCT_DESC = new TStruct("WordEnergyInfo");
    private static final TField UNLIMITED_TIME_FIELD_DESC = new TField("unlimited_time", (byte) 10, 1);
    private static final TField ENERGY_MAX_FIELD_DESC = new TField("energy_max", (byte) 8, 2);
    private static final TField ENERGY_COUNT_FIELD_DESC = new TField("energy_count", (byte) 8, 3);
    private static final TField NEXT_ENERGY_TIME_FIELD_DESC = new TField("next_energy_time", (byte) 10, 4);
    private static final TField ENERGY_CYCLE_FIELD_DESC = new TField("energy_cycle", (byte) 12, 5);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.WordEnergyInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$WordEnergyInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$WordEnergyInfo$_Fields = iArr;
            try {
                iArr[_Fields.UNLIMITED_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$WordEnergyInfo$_Fields[_Fields.ENERGY_MAX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$WordEnergyInfo$_Fields[_Fields.ENERGY_COUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$WordEnergyInfo$_Fields[_Fields.NEXT_ENERGY_TIME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$WordEnergyInfo$_Fields[_Fields.ENERGY_CYCLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WordEnergyInfoStandardScheme extends StandardScheme<WordEnergyInfo> {
        private WordEnergyInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, WordEnergyInfo struct) throws TException {
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
                                } else if (b11 == 12) {
                                    EnergyCycle energyCycle = new EnergyCycle();
                                    struct.energy_cycle = energyCycle;
                                    energyCycle.read(iprot);
                                    struct.setEnergy_cycleIsSet(true);
                                } else {
                                    TProtocolUtil.skip(iprot, b11);
                                }
                            } else if (b11 == 10) {
                                struct.next_energy_time = iprot.readI64();
                                struct.setNext_energy_timeIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 8) {
                            struct.energy_count = iprot.readI32();
                            struct.setEnergy_countIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.energy_max = iprot.readI32();
                        struct.setEnergy_maxIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 10) {
                    struct.unlimited_time = iprot.readI64();
                    struct.setUnlimited_timeIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetUnlimited_time()) {
                throw new TProtocolException("Required field 'unlimited_time' was not found in serialized data! Struct: " + toString());
            }
            if (!struct.isSetEnergy_max()) {
                throw new TProtocolException("Required field 'energy_max' was not found in serialized data! Struct: " + toString());
            }
            if (!struct.isSetEnergy_count()) {
                throw new TProtocolException("Required field 'energy_count' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetNext_energy_time()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'next_energy_time' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, WordEnergyInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(WordEnergyInfo.STRUCT_DESC);
            oprot.writeFieldBegin(WordEnergyInfo.UNLIMITED_TIME_FIELD_DESC);
            oprot.writeI64(struct.unlimited_time);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(WordEnergyInfo.ENERGY_MAX_FIELD_DESC);
            oprot.writeI32(struct.energy_max);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(WordEnergyInfo.ENERGY_COUNT_FIELD_DESC);
            oprot.writeI32(struct.energy_count);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(WordEnergyInfo.NEXT_ENERGY_TIME_FIELD_DESC);
            oprot.writeI64(struct.next_energy_time);
            oprot.writeFieldEnd();
            if (struct.energy_cycle != null) {
                oprot.writeFieldBegin(WordEnergyInfo.ENERGY_CYCLE_FIELD_DESC);
                struct.energy_cycle.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WordEnergyInfoStandardSchemeFactory implements SchemeFactory {
        private WordEnergyInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public WordEnergyInfoStandardScheme getScheme() {
            return new WordEnergyInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WordEnergyInfoTupleScheme extends TupleScheme<WordEnergyInfo> {
        private WordEnergyInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, WordEnergyInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.unlimited_time = tTupleProtocol.readI64();
            struct.setUnlimited_timeIsSet(true);
            struct.energy_max = tTupleProtocol.readI32();
            struct.setEnergy_maxIsSet(true);
            struct.energy_count = tTupleProtocol.readI32();
            struct.setEnergy_countIsSet(true);
            struct.next_energy_time = tTupleProtocol.readI64();
            struct.setNext_energy_timeIsSet(true);
            EnergyCycle energyCycle = new EnergyCycle();
            struct.energy_cycle = energyCycle;
            energyCycle.read(tTupleProtocol);
            struct.setEnergy_cycleIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, WordEnergyInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI64(struct.unlimited_time);
            tTupleProtocol.writeI32(struct.energy_max);
            tTupleProtocol.writeI32(struct.energy_count);
            tTupleProtocol.writeI64(struct.next_energy_time);
            struct.energy_cycle.write(tTupleProtocol);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WordEnergyInfoTupleSchemeFactory implements SchemeFactory {
        private WordEnergyInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public WordEnergyInfoTupleScheme getScheme() {
            return new WordEnergyInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        UNLIMITED_TIME(1, "unlimited_time"),
        ENERGY_MAX(2, "energy_max"),
        ENERGY_COUNT(3, "energy_count"),
        NEXT_ENERGY_TIME(4, "next_energy_time"),
        ENERGY_CYCLE(5, "energy_cycle");

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
                return UNLIMITED_TIME;
            }
            if (fieldId == 2) {
                return ENERGY_MAX;
            }
            if (fieldId == 3) {
                return ENERGY_COUNT;
            }
            if (fieldId == 4) {
                return NEXT_ENERGY_TIME;
            }
            if (fieldId != 5) {
                return null;
            }
            return ENERGY_CYCLE;
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
        hashMap.put(StandardScheme.class, new WordEnergyInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new WordEnergyInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.UNLIMITED_TIME, (_Fields) new FieldMetaData("unlimited_time", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.ENERGY_MAX, (_Fields) new FieldMetaData("energy_max", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.ENERGY_COUNT, (_Fields) new FieldMetaData("energy_count", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.NEXT_ENERGY_TIME, (_Fields) new FieldMetaData("next_energy_time", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.ENERGY_CYCLE, (_Fields) new FieldMetaData("energy_cycle", (byte) 1, new StructMetaData((byte) 12, EnergyCycle.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(WordEnergyInfo.class, unmodifiableMap);
    }

    public WordEnergyInfo() {
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
        setUnlimited_timeIsSet(false);
        this.unlimited_time = 0L;
        setEnergy_maxIsSet(false);
        this.energy_max = 0;
        setEnergy_countIsSet(false);
        this.energy_count = 0;
        setNext_energy_timeIsSet(false);
        this.next_energy_time = 0L;
        this.energy_cycle = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof WordEnergyInfo)) {
            return equals((WordEnergyInfo) that);
        }
        return false;
    }

    public int getEnergy_count() {
        return this.energy_count;
    }

    public EnergyCycle getEnergy_cycle() {
        return this.energy_cycle;
    }

    public int getEnergy_max() {
        return this.energy_max;
    }

    public long getNext_energy_time() {
        return this.next_energy_time;
    }

    public long getUnlimited_time() {
        return this.unlimited_time;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetEnergy_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetEnergy_cycle() {
        return this.energy_cycle != null;
    }

    public boolean isSetEnergy_max() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetNext_energy_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetUnlimited_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public WordEnergyInfo setEnergy_count(int energy_count) {
        this.energy_count = energy_count;
        setEnergy_countIsSet(true);
        return this;
    }

    public void setEnergy_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public WordEnergyInfo setEnergy_cycle(EnergyCycle energy_cycle) {
        this.energy_cycle = energy_cycle;
        return this;
    }

    public void setEnergy_cycleIsSet(boolean value) {
        if (value) {
            return;
        }
        this.energy_cycle = null;
    }

    public WordEnergyInfo setEnergy_max(int energy_max) {
        this.energy_max = energy_max;
        setEnergy_maxIsSet(true);
        return this;
    }

    public void setEnergy_maxIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public WordEnergyInfo setNext_energy_time(long next_energy_time) {
        this.next_energy_time = next_energy_time;
        setNext_energy_timeIsSet(true);
        return this;
    }

    public void setNext_energy_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public WordEnergyInfo setUnlimited_time(long unlimited_time) {
        this.unlimited_time = unlimited_time;
        setUnlimited_timeIsSet(true);
        return this;
    }

    public void setUnlimited_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("WordEnergyInfo(");
        sb2.append("unlimited_time:");
        sb2.append(this.unlimited_time);
        sb2.append(j2.O);
        sb2.append("energy_max:");
        sb2.append(this.energy_max);
        sb2.append(j2.O);
        sb2.append("energy_count:");
        sb2.append(this.energy_count);
        sb2.append(j2.O);
        sb2.append("next_energy_time:");
        sb2.append(this.next_energy_time);
        sb2.append(j2.O);
        sb2.append("energy_cycle:");
        EnergyCycle energyCycle = this.energy_cycle;
        if (energyCycle == null) {
            sb2.append("null");
        } else {
            sb2.append(energyCycle);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetEnergy_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetEnergy_cycle() {
        this.energy_cycle = null;
    }

    public void unsetEnergy_max() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetNext_energy_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetUnlimited_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void validate() throws TException {
        EnergyCycle energyCycle = this.energy_cycle;
        if (energyCycle != null) {
            if (energyCycle != null) {
                energyCycle.validate();
            }
        } else {
            throw new TProtocolException("Required field 'energy_cycle' was not present! Struct: " + toString());
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(WordEnergyInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo6 = Boolean.valueOf(isSetUnlimited_time()).compareTo(Boolean.valueOf(other.isSetUnlimited_time()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetUnlimited_time() && (compareTo5 = TBaseHelper.compareTo(this.unlimited_time, other.unlimited_time)) != 0) {
            return compareTo5;
        }
        int compareTo7 = Boolean.valueOf(isSetEnergy_max()).compareTo(Boolean.valueOf(other.isSetEnergy_max()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetEnergy_max() && (compareTo4 = TBaseHelper.compareTo(this.energy_max, other.energy_max)) != 0) {
            return compareTo4;
        }
        int compareTo8 = Boolean.valueOf(isSetEnergy_count()).compareTo(Boolean.valueOf(other.isSetEnergy_count()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetEnergy_count() && (compareTo3 = TBaseHelper.compareTo(this.energy_count, other.energy_count)) != 0) {
            return compareTo3;
        }
        int compareTo9 = Boolean.valueOf(isSetNext_energy_time()).compareTo(Boolean.valueOf(other.isSetNext_energy_time()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetNext_energy_time() && (compareTo2 = TBaseHelper.compareTo(this.next_energy_time, other.next_energy_time)) != 0) {
            return compareTo2;
        }
        int compareTo10 = Boolean.valueOf(isSetEnergy_cycle()).compareTo(Boolean.valueOf(other.isSetEnergy_cycle()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!isSetEnergy_cycle() || (compareTo = TBaseHelper.compareTo((Comparable) this.energy_cycle, (Comparable) other.energy_cycle)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<WordEnergyInfo, _Fields> deepCopy2() {
        return new WordEnergyInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$WordEnergyInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Long.valueOf(getUnlimited_time());
        }
        if (i11 == 2) {
            return Integer.valueOf(getEnergy_max());
        }
        if (i11 == 3) {
            return Integer.valueOf(getEnergy_count());
        }
        if (i11 == 4) {
            return Long.valueOf(getNext_energy_time());
        }
        if (i11 == 5) {
            return getEnergy_cycle();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$WordEnergyInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetUnlimited_time();
        }
        if (i11 == 2) {
            return isSetEnergy_max();
        }
        if (i11 == 3) {
            return isSetEnergy_count();
        }
        if (i11 == 4) {
            return isSetNext_energy_time();
        }
        if (i11 == 5) {
            return isSetEnergy_cycle();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$WordEnergyInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetUnlimited_time();
                return;
            } else {
                setUnlimited_time(((Long) value).longValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetEnergy_max();
                return;
            } else {
                setEnergy_max(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetEnergy_count();
                return;
            } else {
                setEnergy_count(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 4) {
            if (value == null) {
                unsetNext_energy_time();
                return;
            } else {
                setNext_energy_time(((Long) value).longValue());
                return;
            }
        }
        if (i11 != 5) {
            return;
        }
        if (value == null) {
            unsetEnergy_cycle();
        } else {
            setEnergy_cycle((EnergyCycle) value);
        }
    }

    public WordEnergyInfo(long unlimited_time, int energy_max, int energy_count, long next_energy_time, EnergyCycle energy_cycle) {
        this();
        this.unlimited_time = unlimited_time;
        setUnlimited_timeIsSet(true);
        this.energy_max = energy_max;
        setEnergy_maxIsSet(true);
        this.energy_count = energy_count;
        setEnergy_countIsSet(true);
        this.next_energy_time = next_energy_time;
        setNext_energy_timeIsSet(true);
        this.energy_cycle = energy_cycle;
    }

    public boolean equals(WordEnergyInfo that) {
        if (that == null || this.unlimited_time != that.unlimited_time || this.energy_max != that.energy_max || this.energy_count != that.energy_count || this.next_energy_time != that.next_energy_time) {
            return false;
        }
        boolean isSetEnergy_cycle = isSetEnergy_cycle();
        boolean isSetEnergy_cycle2 = that.isSetEnergy_cycle();
        if (isSetEnergy_cycle || isSetEnergy_cycle2) {
            return isSetEnergy_cycle && isSetEnergy_cycle2 && this.energy_cycle.equals(that.energy_cycle);
        }
        return true;
    }

    public WordEnergyInfo(WordEnergyInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.unlimited_time = other.unlimited_time;
        this.energy_max = other.energy_max;
        this.energy_count = other.energy_count;
        this.next_energy_time = other.next_energy_time;
        if (other.isSetEnergy_cycle()) {
            this.energy_cycle = new EnergyCycle(other.energy_cycle);
        }
    }
}
