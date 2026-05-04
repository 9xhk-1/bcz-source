package com.baicizhan.online.avatar_api;

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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class UserCurrentAvatarInfo implements TBase<UserCurrentAvatarInfo, _Fields>, Serializable, Cloneable, Comparable<UserCurrentAvatarInfo> {
    private static final int __ENERGY_ISSET_ID = 2;
    private static final int __IP_STATUS_ISSET_ID = 1;
    private static final int __IP_TYPE_ISSET_ID = 0;
    private static final int __TRAVEL_AREA_ID_ISSET_ID = 4;
    private static final int __TRAVEL_ENERGY_ISSET_ID = 3;
    private static final int __TRAVEL_RETURN_TIME_ISSET_ID = 5;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int energy;
    public int ip_status;
    public int ip_type;
    private _Fields[] optionals;
    public int travel_area_id;
    public int travel_energy;
    public long travel_return_time;
    private static final TStruct STRUCT_DESC = new TStruct("UserCurrentAvatarInfo");
    private static final TField IP_TYPE_FIELD_DESC = new TField("ip_type", (byte) 8, 1);
    private static final TField IP_STATUS_FIELD_DESC = new TField("ip_status", (byte) 8, 2);
    private static final TField ENERGY_FIELD_DESC = new TField(c6.d.f8119k, (byte) 8, 3);
    private static final TField TRAVEL_ENERGY_FIELD_DESC = new TField("travel_energy", (byte) 8, 4);
    private static final TField TRAVEL_AREA_ID_FIELD_DESC = new TField("travel_area_id", (byte) 8, 5);
    private static final TField TRAVEL_RETURN_TIME_FIELD_DESC = new TField("travel_return_time", (byte) 10, 6);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.avatar_api.UserCurrentAvatarInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$avatar_api$UserCurrentAvatarInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$avatar_api$UserCurrentAvatarInfo$_Fields = iArr;
            try {
                iArr[_Fields.IP_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$UserCurrentAvatarInfo$_Fields[_Fields.IP_STATUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$UserCurrentAvatarInfo$_Fields[_Fields.ENERGY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$UserCurrentAvatarInfo$_Fields[_Fields.TRAVEL_ENERGY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$UserCurrentAvatarInfo$_Fields[_Fields.TRAVEL_AREA_ID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$UserCurrentAvatarInfo$_Fields[_Fields.TRAVEL_RETURN_TIME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserCurrentAvatarInfoStandardScheme extends StandardScheme<UserCurrentAvatarInfo> {
        private UserCurrentAvatarInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserCurrentAvatarInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetIp_type()) {
                        throw new TProtocolException("Required field 'ip_type' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetIp_status()) {
                        throw new TProtocolException("Required field 'ip_status' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetEnergy()) {
                        throw new TProtocolException("Required field 'energy' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetTravel_energy()) {
                        throw new TProtocolException("Required field 'travel_energy' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetTravel_area_id()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'travel_area_id' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.ip_type = iprot.readI32();
                            struct.setIp_typeIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.ip_status = iprot.readI32();
                            struct.setIp_statusIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.energy = iprot.readI32();
                            struct.setEnergyIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.travel_energy = iprot.readI32();
                            struct.setTravel_energyIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.travel_area_id = iprot.readI32();
                            struct.setTravel_area_idIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.travel_return_time = iprot.readI64();
                            struct.setTravel_return_timeIsSet(true);
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
        public void write(TProtocol oprot, UserCurrentAvatarInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserCurrentAvatarInfo.STRUCT_DESC);
            oprot.writeFieldBegin(UserCurrentAvatarInfo.IP_TYPE_FIELD_DESC);
            oprot.writeI32(struct.ip_type);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserCurrentAvatarInfo.IP_STATUS_FIELD_DESC);
            oprot.writeI32(struct.ip_status);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserCurrentAvatarInfo.ENERGY_FIELD_DESC);
            oprot.writeI32(struct.energy);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserCurrentAvatarInfo.TRAVEL_ENERGY_FIELD_DESC);
            oprot.writeI32(struct.travel_energy);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserCurrentAvatarInfo.TRAVEL_AREA_ID_FIELD_DESC);
            oprot.writeI32(struct.travel_area_id);
            oprot.writeFieldEnd();
            if (struct.isSetTravel_return_time()) {
                oprot.writeFieldBegin(UserCurrentAvatarInfo.TRAVEL_RETURN_TIME_FIELD_DESC);
                oprot.writeI64(struct.travel_return_time);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserCurrentAvatarInfoStandardSchemeFactory implements SchemeFactory {
        private UserCurrentAvatarInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserCurrentAvatarInfoStandardScheme getScheme() {
            return new UserCurrentAvatarInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserCurrentAvatarInfoTupleScheme extends TupleScheme<UserCurrentAvatarInfo> {
        private UserCurrentAvatarInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserCurrentAvatarInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.ip_type = tTupleProtocol.readI32();
            struct.setIp_typeIsSet(true);
            struct.ip_status = tTupleProtocol.readI32();
            struct.setIp_statusIsSet(true);
            struct.energy = tTupleProtocol.readI32();
            struct.setEnergyIsSet(true);
            struct.travel_energy = tTupleProtocol.readI32();
            struct.setTravel_energyIsSet(true);
            struct.travel_area_id = tTupleProtocol.readI32();
            struct.setTravel_area_idIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                struct.travel_return_time = tTupleProtocol.readI64();
                struct.setTravel_return_timeIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserCurrentAvatarInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.ip_type);
            tTupleProtocol.writeI32(struct.ip_status);
            tTupleProtocol.writeI32(struct.energy);
            tTupleProtocol.writeI32(struct.travel_energy);
            tTupleProtocol.writeI32(struct.travel_area_id);
            BitSet bitSet = new BitSet();
            if (struct.isSetTravel_return_time()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetTravel_return_time()) {
                tTupleProtocol.writeI64(struct.travel_return_time);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserCurrentAvatarInfoTupleSchemeFactory implements SchemeFactory {
        private UserCurrentAvatarInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserCurrentAvatarInfoTupleScheme getScheme() {
            return new UserCurrentAvatarInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        IP_TYPE(1, "ip_type"),
        IP_STATUS(2, "ip_status"),
        ENERGY(3, c6.d.f8119k),
        TRAVEL_ENERGY(4, "travel_energy"),
        TRAVEL_AREA_ID(5, "travel_area_id"),
        TRAVEL_RETURN_TIME(6, "travel_return_time");

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
                    return IP_TYPE;
                case 2:
                    return IP_STATUS;
                case 3:
                    return ENERGY;
                case 4:
                    return TRAVEL_ENERGY;
                case 5:
                    return TRAVEL_AREA_ID;
                case 6:
                    return TRAVEL_RETURN_TIME;
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
        hashMap.put(StandardScheme.class, new UserCurrentAvatarInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserCurrentAvatarInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.IP_TYPE, (_Fields) new FieldMetaData("ip_type", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.IP_STATUS, (_Fields) new FieldMetaData("ip_status", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.ENERGY, (_Fields) new FieldMetaData(c6.d.f8119k, (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.TRAVEL_ENERGY, (_Fields) new FieldMetaData("travel_energy", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.TRAVEL_AREA_ID, (_Fields) new FieldMetaData("travel_area_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.TRAVEL_RETURN_TIME, (_Fields) new FieldMetaData("travel_return_time", (byte) 2, new FieldValueMetaData((byte) 10)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserCurrentAvatarInfo.class, unmodifiableMap);
    }

    public UserCurrentAvatarInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.TRAVEL_RETURN_TIME};
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
        setIp_typeIsSet(false);
        this.ip_type = 0;
        setIp_statusIsSet(false);
        this.ip_status = 0;
        setEnergyIsSet(false);
        this.energy = 0;
        setTravel_energyIsSet(false);
        this.travel_energy = 0;
        setTravel_area_idIsSet(false);
        this.travel_area_id = 0;
        setTravel_return_timeIsSet(false);
        this.travel_return_time = 0L;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserCurrentAvatarInfo)) {
            return equals((UserCurrentAvatarInfo) that);
        }
        return false;
    }

    public int getEnergy() {
        return this.energy;
    }

    public int getIp_status() {
        return this.ip_status;
    }

    public int getIp_type() {
        return this.ip_type;
    }

    public int getTravel_area_id() {
        return this.travel_area_id;
    }

    public int getTravel_energy() {
        return this.travel_energy;
    }

    public long getTravel_return_time() {
        return this.travel_return_time;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetEnergy() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetIp_status() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetIp_type() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetTravel_area_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 4);
    }

    public boolean isSetTravel_energy() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetTravel_return_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 5);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserCurrentAvatarInfo setEnergy(int energy) {
        this.energy = energy;
        setEnergyIsSet(true);
        return this;
    }

    public void setEnergyIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public UserCurrentAvatarInfo setIp_status(int ip_status) {
        this.ip_status = ip_status;
        setIp_statusIsSet(true);
        return this;
    }

    public void setIp_statusIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public UserCurrentAvatarInfo setIp_type(int ip_type) {
        this.ip_type = ip_type;
        setIp_typeIsSet(true);
        return this;
    }

    public void setIp_typeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public UserCurrentAvatarInfo setTravel_area_id(int travel_area_id) {
        this.travel_area_id = travel_area_id;
        setTravel_area_idIsSet(true);
        return this;
    }

    public void setTravel_area_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 4, value);
    }

    public UserCurrentAvatarInfo setTravel_energy(int travel_energy) {
        this.travel_energy = travel_energy;
        setTravel_energyIsSet(true);
        return this;
    }

    public void setTravel_energyIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public UserCurrentAvatarInfo setTravel_return_time(long travel_return_time) {
        this.travel_return_time = travel_return_time;
        setTravel_return_timeIsSet(true);
        return this;
    }

    public void setTravel_return_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 5, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserCurrentAvatarInfo(");
        sb2.append("ip_type:");
        sb2.append(this.ip_type);
        sb2.append(j2.O);
        sb2.append("ip_status:");
        sb2.append(this.ip_status);
        sb2.append(j2.O);
        sb2.append("energy:");
        sb2.append(this.energy);
        sb2.append(j2.O);
        sb2.append("travel_energy:");
        sb2.append(this.travel_energy);
        sb2.append(j2.O);
        sb2.append("travel_area_id:");
        sb2.append(this.travel_area_id);
        if (isSetTravel_return_time()) {
            sb2.append(j2.O);
            sb2.append("travel_return_time:");
            sb2.append(this.travel_return_time);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetEnergy() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetIp_status() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetIp_type() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetTravel_area_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 4);
    }

    public void unsetTravel_energy() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetTravel_return_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 5);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(UserCurrentAvatarInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo7 = Boolean.valueOf(isSetIp_type()).compareTo(Boolean.valueOf(other.isSetIp_type()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetIp_type() && (compareTo6 = TBaseHelper.compareTo(this.ip_type, other.ip_type)) != 0) {
            return compareTo6;
        }
        int compareTo8 = Boolean.valueOf(isSetIp_status()).compareTo(Boolean.valueOf(other.isSetIp_status()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetIp_status() && (compareTo5 = TBaseHelper.compareTo(this.ip_status, other.ip_status)) != 0) {
            return compareTo5;
        }
        int compareTo9 = Boolean.valueOf(isSetEnergy()).compareTo(Boolean.valueOf(other.isSetEnergy()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetEnergy() && (compareTo4 = TBaseHelper.compareTo(this.energy, other.energy)) != 0) {
            return compareTo4;
        }
        int compareTo10 = Boolean.valueOf(isSetTravel_energy()).compareTo(Boolean.valueOf(other.isSetTravel_energy()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetTravel_energy() && (compareTo3 = TBaseHelper.compareTo(this.travel_energy, other.travel_energy)) != 0) {
            return compareTo3;
        }
        int compareTo11 = Boolean.valueOf(isSetTravel_area_id()).compareTo(Boolean.valueOf(other.isSetTravel_area_id()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetTravel_area_id() && (compareTo2 = TBaseHelper.compareTo(this.travel_area_id, other.travel_area_id)) != 0) {
            return compareTo2;
        }
        int compareTo12 = Boolean.valueOf(isSetTravel_return_time()).compareTo(Boolean.valueOf(other.isSetTravel_return_time()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (!isSetTravel_return_time() || (compareTo = TBaseHelper.compareTo(this.travel_return_time, other.travel_return_time)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserCurrentAvatarInfo, _Fields> deepCopy2() {
        return new UserCurrentAvatarInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$avatar_api$UserCurrentAvatarInfo$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getIp_type());
            case 2:
                return Integer.valueOf(getIp_status());
            case 3:
                return Integer.valueOf(getEnergy());
            case 4:
                return Integer.valueOf(getTravel_energy());
            case 5:
                return Integer.valueOf(getTravel_area_id());
            case 6:
                return Long.valueOf(getTravel_return_time());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$avatar_api$UserCurrentAvatarInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetIp_type();
            case 2:
                return isSetIp_status();
            case 3:
                return isSetEnergy();
            case 4:
                return isSetTravel_energy();
            case 5:
                return isSetTravel_area_id();
            case 6:
                return isSetTravel_return_time();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$avatar_api$UserCurrentAvatarInfo$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setIp_type(((Integer) value).intValue());
                    break;
                } else {
                    unsetIp_type();
                    break;
                }
            case 2:
                if (value != null) {
                    setIp_status(((Integer) value).intValue());
                    break;
                } else {
                    unsetIp_status();
                    break;
                }
            case 3:
                if (value != null) {
                    setEnergy(((Integer) value).intValue());
                    break;
                } else {
                    unsetEnergy();
                    break;
                }
            case 4:
                if (value != null) {
                    setTravel_energy(((Integer) value).intValue());
                    break;
                } else {
                    unsetTravel_energy();
                    break;
                }
            case 5:
                if (value != null) {
                    setTravel_area_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetTravel_area_id();
                    break;
                }
            case 6:
                if (value != null) {
                    setTravel_return_time(((Long) value).longValue());
                    break;
                } else {
                    unsetTravel_return_time();
                    break;
                }
        }
    }

    public boolean equals(UserCurrentAvatarInfo that) {
        if (that == null || this.ip_type != that.ip_type || this.ip_status != that.ip_status || this.energy != that.energy || this.travel_energy != that.travel_energy || this.travel_area_id != that.travel_area_id) {
            return false;
        }
        boolean isSetTravel_return_time = isSetTravel_return_time();
        boolean isSetTravel_return_time2 = that.isSetTravel_return_time();
        if (isSetTravel_return_time || isSetTravel_return_time2) {
            return isSetTravel_return_time && isSetTravel_return_time2 && this.travel_return_time == that.travel_return_time;
        }
        return true;
    }

    public UserCurrentAvatarInfo(int ip_type, int ip_status, int energy, int travel_energy, int travel_area_id) {
        this();
        this.ip_type = ip_type;
        setIp_typeIsSet(true);
        this.ip_status = ip_status;
        setIp_statusIsSet(true);
        this.energy = energy;
        setEnergyIsSet(true);
        this.travel_energy = travel_energy;
        setTravel_energyIsSet(true);
        this.travel_area_id = travel_area_id;
        setTravel_area_idIsSet(true);
    }

    public UserCurrentAvatarInfo(UserCurrentAvatarInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.TRAVEL_RETURN_TIME};
        this.__isset_bitfield = other.__isset_bitfield;
        this.ip_type = other.ip_type;
        this.ip_status = other.ip_status;
        this.energy = other.energy;
        this.travel_energy = other.travel_energy;
        this.travel_area_id = other.travel_area_id;
        this.travel_return_time = other.travel_return_time;
    }

    public void validate() throws TException {
    }
}
