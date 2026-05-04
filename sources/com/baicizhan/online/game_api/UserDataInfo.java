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
public class UserDataInfo implements TBase<UserDataInfo, _Fields>, Serializable, Cloneable, Comparable<UserDataInfo> {
    private static final int __COPPER_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int copper;
    public WordEnergyInfo energy_info;
    public VipInfo vip_info;
    private static final TStruct STRUCT_DESC = new TStruct("UserDataInfo");
    private static final TField VIP_INFO_FIELD_DESC = new TField("vip_info", (byte) 12, 1);
    private static final TField ENERGY_INFO_FIELD_DESC = new TField("energy_info", (byte) 12, 2);
    private static final TField COPPER_FIELD_DESC = new TField("copper", (byte) 8, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.UserDataInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$UserDataInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$UserDataInfo$_Fields = iArr;
            try {
                iArr[_Fields.VIP_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$UserDataInfo$_Fields[_Fields.ENERGY_INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$UserDataInfo$_Fields[_Fields.COPPER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserDataInfoStandardScheme extends StandardScheme<UserDataInfo> {
        private UserDataInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserDataInfo struct) throws TException {
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
                            TProtocolUtil.skip(iprot, b11);
                        } else if (b11 == 8) {
                            struct.copper = iprot.readI32();
                            struct.setCopperIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 12) {
                        WordEnergyInfo wordEnergyInfo = new WordEnergyInfo();
                        struct.energy_info = wordEnergyInfo;
                        wordEnergyInfo.read(iprot);
                        struct.setEnergy_infoIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 12) {
                    VipInfo vipInfo = new VipInfo();
                    struct.vip_info = vipInfo;
                    vipInfo.read(iprot);
                    struct.setVip_infoIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetCopper()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'copper' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, UserDataInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserDataInfo.STRUCT_DESC);
            if (struct.vip_info != null) {
                oprot.writeFieldBegin(UserDataInfo.VIP_INFO_FIELD_DESC);
                struct.vip_info.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.energy_info != null) {
                oprot.writeFieldBegin(UserDataInfo.ENERGY_INFO_FIELD_DESC);
                struct.energy_info.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(UserDataInfo.COPPER_FIELD_DESC);
            oprot.writeI32(struct.copper);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserDataInfoStandardSchemeFactory implements SchemeFactory {
        private UserDataInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserDataInfoStandardScheme getScheme() {
            return new UserDataInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserDataInfoTupleScheme extends TupleScheme<UserDataInfo> {
        private UserDataInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserDataInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            VipInfo vipInfo = new VipInfo();
            struct.vip_info = vipInfo;
            vipInfo.read(tTupleProtocol);
            struct.setVip_infoIsSet(true);
            WordEnergyInfo wordEnergyInfo = new WordEnergyInfo();
            struct.energy_info = wordEnergyInfo;
            wordEnergyInfo.read(tTupleProtocol);
            struct.setEnergy_infoIsSet(true);
            struct.copper = tTupleProtocol.readI32();
            struct.setCopperIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserDataInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.vip_info.write(tTupleProtocol);
            struct.energy_info.write(tTupleProtocol);
            tTupleProtocol.writeI32(struct.copper);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserDataInfoTupleSchemeFactory implements SchemeFactory {
        private UserDataInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserDataInfoTupleScheme getScheme() {
            return new UserDataInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        VIP_INFO(1, "vip_info"),
        ENERGY_INFO(2, "energy_info"),
        COPPER(3, "copper");

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
                return VIP_INFO;
            }
            if (fieldId == 2) {
                return ENERGY_INFO;
            }
            if (fieldId != 3) {
                return null;
            }
            return COPPER;
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
        hashMap.put(StandardScheme.class, new UserDataInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserDataInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.VIP_INFO, (_Fields) new FieldMetaData("vip_info", (byte) 1, new StructMetaData((byte) 12, VipInfo.class)));
        enumMap.put((EnumMap) _Fields.ENERGY_INFO, (_Fields) new FieldMetaData("energy_info", (byte) 1, new StructMetaData((byte) 12, WordEnergyInfo.class)));
        enumMap.put((EnumMap) _Fields.COPPER, (_Fields) new FieldMetaData("copper", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserDataInfo.class, unmodifiableMap);
    }

    public UserDataInfo() {
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
        this.vip_info = null;
        this.energy_info = null;
        setCopperIsSet(false);
        this.copper = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserDataInfo)) {
            return equals((UserDataInfo) that);
        }
        return false;
    }

    public int getCopper() {
        return this.copper;
    }

    public WordEnergyInfo getEnergy_info() {
        return this.energy_info;
    }

    public VipInfo getVip_info() {
        return this.vip_info;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetCopper() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetEnergy_info() {
        return this.energy_info != null;
    }

    public boolean isSetVip_info() {
        return this.vip_info != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserDataInfo setCopper(int copper) {
        this.copper = copper;
        setCopperIsSet(true);
        return this;
    }

    public void setCopperIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public UserDataInfo setEnergy_info(WordEnergyInfo energy_info) {
        this.energy_info = energy_info;
        return this;
    }

    public void setEnergy_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.energy_info = null;
    }

    public UserDataInfo setVip_info(VipInfo vip_info) {
        this.vip_info = vip_info;
        return this;
    }

    public void setVip_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.vip_info = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserDataInfo(");
        sb2.append("vip_info:");
        VipInfo vipInfo = this.vip_info;
        if (vipInfo == null) {
            sb2.append("null");
        } else {
            sb2.append(vipInfo);
        }
        sb2.append(j2.O);
        sb2.append("energy_info:");
        WordEnergyInfo wordEnergyInfo = this.energy_info;
        if (wordEnergyInfo == null) {
            sb2.append("null");
        } else {
            sb2.append(wordEnergyInfo);
        }
        sb2.append(j2.O);
        sb2.append("copper:");
        sb2.append(this.copper);
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetCopper() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetEnergy_info() {
        this.energy_info = null;
    }

    public void unsetVip_info() {
        this.vip_info = null;
    }

    public void validate() throws TException {
        VipInfo vipInfo = this.vip_info;
        if (vipInfo == null) {
            throw new TProtocolException("Required field 'vip_info' was not present! Struct: " + toString());
        }
        if (this.energy_info == null) {
            throw new TProtocolException("Required field 'energy_info' was not present! Struct: " + toString());
        }
        if (vipInfo != null) {
            vipInfo.validate();
        }
        WordEnergyInfo wordEnergyInfo = this.energy_info;
        if (wordEnergyInfo != null) {
            wordEnergyInfo.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(UserDataInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetVip_info()).compareTo(Boolean.valueOf(other.isSetVip_info()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetVip_info() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.vip_info, (Comparable) other.vip_info)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetEnergy_info()).compareTo(Boolean.valueOf(other.isSetEnergy_info()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetEnergy_info() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.energy_info, (Comparable) other.energy_info)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetCopper()).compareTo(Boolean.valueOf(other.isSetCopper()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetCopper() || (compareTo = TBaseHelper.compareTo(this.copper, other.copper)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserDataInfo, _Fields> deepCopy2() {
        return new UserDataInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$UserDataInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getVip_info();
        }
        if (i11 == 2) {
            return getEnergy_info();
        }
        if (i11 == 3) {
            return Integer.valueOf(getCopper());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$UserDataInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetVip_info();
        }
        if (i11 == 2) {
            return isSetEnergy_info();
        }
        if (i11 == 3) {
            return isSetCopper();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$UserDataInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetVip_info();
                return;
            } else {
                setVip_info((VipInfo) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetEnergy_info();
                return;
            } else {
                setEnergy_info((WordEnergyInfo) value);
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetCopper();
        } else {
            setCopper(((Integer) value).intValue());
        }
    }

    public UserDataInfo(VipInfo vip_info, WordEnergyInfo energy_info, int copper) {
        this();
        this.vip_info = vip_info;
        this.energy_info = energy_info;
        this.copper = copper;
        setCopperIsSet(true);
    }

    public boolean equals(UserDataInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetVip_info = isSetVip_info();
        boolean isSetVip_info2 = that.isSetVip_info();
        if ((isSetVip_info || isSetVip_info2) && !(isSetVip_info && isSetVip_info2 && this.vip_info.equals(that.vip_info))) {
            return false;
        }
        boolean isSetEnergy_info = isSetEnergy_info();
        boolean isSetEnergy_info2 = that.isSetEnergy_info();
        return (!(isSetEnergy_info || isSetEnergy_info2) || (isSetEnergy_info && isSetEnergy_info2 && this.energy_info.equals(that.energy_info))) && this.copper == that.copper;
    }

    public UserDataInfo(UserDataInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetVip_info()) {
            this.vip_info = new VipInfo(other.vip_info);
        }
        if (other.isSetEnergy_info()) {
            this.energy_info = new WordEnergyInfo(other.energy_info);
        }
        this.copper = other.copper;
    }
}
