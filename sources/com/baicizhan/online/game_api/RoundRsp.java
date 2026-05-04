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
public class RoundRsp implements TBase<RoundRsp, _Fields>, Serializable, Cloneable, Comparable<RoundRsp> {
    private static final int __PLAN_VERSION_ISSET_ID = 0;
    private static final int __ROUND_CONTIUE_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public EnergyInfo energy_info;
    public long plan_version;
    public int round_contiue;
    public RoundInfo round_info;
    private static final TStruct STRUCT_DESC = new TStruct("RoundRsp");
    private static final TField ROUND_INFO_FIELD_DESC = new TField("round_info", (byte) 12, 1);
    private static final TField PLAN_VERSION_FIELD_DESC = new TField("plan_version", (byte) 10, 2);
    private static final TField ROUND_CONTIUE_FIELD_DESC = new TField("round_contiue", (byte) 8, 3);
    private static final TField ENERGY_INFO_FIELD_DESC = new TField("energy_info", (byte) 12, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.RoundRsp$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$RoundRsp$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$RoundRsp$_Fields = iArr;
            try {
                iArr[_Fields.ROUND_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$RoundRsp$_Fields[_Fields.PLAN_VERSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$RoundRsp$_Fields[_Fields.ROUND_CONTIUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$RoundRsp$_Fields[_Fields.ENERGY_INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RoundRspStandardScheme extends StandardScheme<RoundRsp> {
        private RoundRspStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, RoundRsp struct) throws TException {
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
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 12) {
                                EnergyInfo energyInfo = new EnergyInfo();
                                struct.energy_info = energyInfo;
                                energyInfo.read(iprot);
                                struct.setEnergy_infoIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 8) {
                            struct.round_contiue = iprot.readI32();
                            struct.setRound_contiueIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 10) {
                        struct.plan_version = iprot.readI64();
                        struct.setPlan_versionIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 12) {
                    RoundInfo roundInfo = new RoundInfo();
                    struct.round_info = roundInfo;
                    roundInfo.read(iprot);
                    struct.setRound_infoIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetPlan_version()) {
                throw new TProtocolException("Required field 'plan_version' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetRound_contiue()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'round_contiue' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, RoundRsp struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(RoundRsp.STRUCT_DESC);
            if (struct.round_info != null) {
                oprot.writeFieldBegin(RoundRsp.ROUND_INFO_FIELD_DESC);
                struct.round_info.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(RoundRsp.PLAN_VERSION_FIELD_DESC);
            oprot.writeI64(struct.plan_version);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(RoundRsp.ROUND_CONTIUE_FIELD_DESC);
            oprot.writeI32(struct.round_contiue);
            oprot.writeFieldEnd();
            if (struct.energy_info != null) {
                oprot.writeFieldBegin(RoundRsp.ENERGY_INFO_FIELD_DESC);
                struct.energy_info.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RoundRspStandardSchemeFactory implements SchemeFactory {
        private RoundRspStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public RoundRspStandardScheme getScheme() {
            return new RoundRspStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RoundRspTupleScheme extends TupleScheme<RoundRsp> {
        private RoundRspTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, RoundRsp struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            RoundInfo roundInfo = new RoundInfo();
            struct.round_info = roundInfo;
            roundInfo.read(tTupleProtocol);
            struct.setRound_infoIsSet(true);
            struct.plan_version = tTupleProtocol.readI64();
            struct.setPlan_versionIsSet(true);
            struct.round_contiue = tTupleProtocol.readI32();
            struct.setRound_contiueIsSet(true);
            EnergyInfo energyInfo = new EnergyInfo();
            struct.energy_info = energyInfo;
            energyInfo.read(tTupleProtocol);
            struct.setEnergy_infoIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, RoundRsp struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.round_info.write(tTupleProtocol);
            tTupleProtocol.writeI64(struct.plan_version);
            tTupleProtocol.writeI32(struct.round_contiue);
            struct.energy_info.write(tTupleProtocol);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RoundRspTupleSchemeFactory implements SchemeFactory {
        private RoundRspTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public RoundRspTupleScheme getScheme() {
            return new RoundRspTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ROUND_INFO(1, "round_info"),
        PLAN_VERSION(2, "plan_version"),
        ROUND_CONTIUE(3, "round_contiue"),
        ENERGY_INFO(4, "energy_info");

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
                return ROUND_INFO;
            }
            if (fieldId == 2) {
                return PLAN_VERSION;
            }
            if (fieldId == 3) {
                return ROUND_CONTIUE;
            }
            if (fieldId != 4) {
                return null;
            }
            return ENERGY_INFO;
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
        hashMap.put(StandardScheme.class, new RoundRspStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new RoundRspTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ROUND_INFO, (_Fields) new FieldMetaData("round_info", (byte) 1, new StructMetaData((byte) 12, RoundInfo.class)));
        enumMap.put((EnumMap) _Fields.PLAN_VERSION, (_Fields) new FieldMetaData("plan_version", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.ROUND_CONTIUE, (_Fields) new FieldMetaData("round_contiue", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.ENERGY_INFO, (_Fields) new FieldMetaData("energy_info", (byte) 1, new StructMetaData((byte) 12, EnergyInfo.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(RoundRsp.class, unmodifiableMap);
    }

    public RoundRsp() {
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
        this.round_info = null;
        setPlan_versionIsSet(false);
        this.plan_version = 0L;
        setRound_contiueIsSet(false);
        this.round_contiue = 0;
        this.energy_info = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof RoundRsp)) {
            return equals((RoundRsp) that);
        }
        return false;
    }

    public EnergyInfo getEnergy_info() {
        return this.energy_info;
    }

    public long getPlan_version() {
        return this.plan_version;
    }

    public int getRound_contiue() {
        return this.round_contiue;
    }

    public RoundInfo getRound_info() {
        return this.round_info;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetEnergy_info() {
        return this.energy_info != null;
    }

    public boolean isSetPlan_version() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetRound_contiue() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetRound_info() {
        return this.round_info != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public RoundRsp setEnergy_info(EnergyInfo energy_info) {
        this.energy_info = energy_info;
        return this;
    }

    public void setEnergy_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.energy_info = null;
    }

    public RoundRsp setPlan_version(long plan_version) {
        this.plan_version = plan_version;
        setPlan_versionIsSet(true);
        return this;
    }

    public void setPlan_versionIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public RoundRsp setRound_contiue(int round_contiue) {
        this.round_contiue = round_contiue;
        setRound_contiueIsSet(true);
        return this;
    }

    public void setRound_contiueIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public RoundRsp setRound_info(RoundInfo round_info) {
        this.round_info = round_info;
        return this;
    }

    public void setRound_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.round_info = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RoundRsp(");
        sb2.append("round_info:");
        RoundInfo roundInfo = this.round_info;
        if (roundInfo == null) {
            sb2.append("null");
        } else {
            sb2.append(roundInfo);
        }
        sb2.append(j2.O);
        sb2.append("plan_version:");
        sb2.append(this.plan_version);
        sb2.append(j2.O);
        sb2.append("round_contiue:");
        sb2.append(this.round_contiue);
        sb2.append(j2.O);
        sb2.append("energy_info:");
        EnergyInfo energyInfo = this.energy_info;
        if (energyInfo == null) {
            sb2.append("null");
        } else {
            sb2.append(energyInfo);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetEnergy_info() {
        this.energy_info = null;
    }

    public void unsetPlan_version() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetRound_contiue() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetRound_info() {
        this.round_info = null;
    }

    public void validate() throws TException {
        RoundInfo roundInfo = this.round_info;
        if (roundInfo == null) {
            throw new TProtocolException("Required field 'round_info' was not present! Struct: " + toString());
        }
        if (this.energy_info == null) {
            throw new TProtocolException("Required field 'energy_info' was not present! Struct: " + toString());
        }
        if (roundInfo != null) {
            roundInfo.validate();
        }
        EnergyInfo energyInfo = this.energy_info;
        if (energyInfo != null) {
            energyInfo.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(RoundRsp other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetRound_info()).compareTo(Boolean.valueOf(other.isSetRound_info()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetRound_info() && (compareTo4 = TBaseHelper.compareTo((Comparable) this.round_info, (Comparable) other.round_info)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetPlan_version()).compareTo(Boolean.valueOf(other.isSetPlan_version()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetPlan_version() && (compareTo3 = TBaseHelper.compareTo(this.plan_version, other.plan_version)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetRound_contiue()).compareTo(Boolean.valueOf(other.isSetRound_contiue()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetRound_contiue() && (compareTo2 = TBaseHelper.compareTo(this.round_contiue, other.round_contiue)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetEnergy_info()).compareTo(Boolean.valueOf(other.isSetEnergy_info()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetEnergy_info() || (compareTo = TBaseHelper.compareTo((Comparable) this.energy_info, (Comparable) other.energy_info)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<RoundRsp, _Fields> deepCopy2() {
        return new RoundRsp(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$RoundRsp$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getRound_info();
        }
        if (i11 == 2) {
            return Long.valueOf(getPlan_version());
        }
        if (i11 == 3) {
            return Integer.valueOf(getRound_contiue());
        }
        if (i11 == 4) {
            return getEnergy_info();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$RoundRsp$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetRound_info();
        }
        if (i11 == 2) {
            return isSetPlan_version();
        }
        if (i11 == 3) {
            return isSetRound_contiue();
        }
        if (i11 == 4) {
            return isSetEnergy_info();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$RoundRsp$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetRound_info();
                return;
            } else {
                setRound_info((RoundInfo) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetPlan_version();
                return;
            } else {
                setPlan_version(((Long) value).longValue());
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetRound_contiue();
                return;
            } else {
                setRound_contiue(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetEnergy_info();
        } else {
            setEnergy_info((EnergyInfo) value);
        }
    }

    public RoundRsp(RoundInfo round_info, long plan_version, int round_contiue, EnergyInfo energy_info) {
        this();
        this.round_info = round_info;
        this.plan_version = plan_version;
        setPlan_versionIsSet(true);
        this.round_contiue = round_contiue;
        setRound_contiueIsSet(true);
        this.energy_info = energy_info;
    }

    public boolean equals(RoundRsp that) {
        if (that == null) {
            return false;
        }
        boolean isSetRound_info = isSetRound_info();
        boolean isSetRound_info2 = that.isSetRound_info();
        if (((isSetRound_info || isSetRound_info2) && (!isSetRound_info || !isSetRound_info2 || !this.round_info.equals(that.round_info))) || this.plan_version != that.plan_version || this.round_contiue != that.round_contiue) {
            return false;
        }
        boolean isSetEnergy_info = isSetEnergy_info();
        boolean isSetEnergy_info2 = that.isSetEnergy_info();
        if (isSetEnergy_info || isSetEnergy_info2) {
            return isSetEnergy_info && isSetEnergy_info2 && this.energy_info.equals(that.energy_info);
        }
        return true;
    }

    public RoundRsp(RoundRsp other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetRound_info()) {
            this.round_info = new RoundInfo(other.round_info);
        }
        this.plan_version = other.plan_version;
        this.round_contiue = other.round_contiue;
        if (other.isSetEnergy_info()) {
            this.energy_info = new EnergyInfo(other.energy_info);
        }
    }
}
