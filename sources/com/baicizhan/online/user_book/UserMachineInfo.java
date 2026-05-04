package com.baicizhan.online.user_book;

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
/* loaded from: classes6.dex */
public class UserMachineInfo implements TBase<UserMachineInfo, _Fields>, Serializable, Cloneable, Comparable<UserMachineInfo> {
    private static final int __DEVICE_TYPE_ISSET_ID = 2;
    private static final int __MACHINE_CONNECT_STATUS_ISSET_ID = 1;
    private static final int __MACHINE_ID_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int device_type;
    public int machine_connect_status;
    public long machine_id;
    public String machine_model;
    public String machine_pic;
    public String machine_version;
    private _Fields[] optionals;
    public String sn_id;
    public String user_machine_name;
    private static final TStruct STRUCT_DESC = new TStruct("UserMachineInfo");
    private static final TField MACHINE_ID_FIELD_DESC = new TField("machine_id", (byte) 10, 1);
    private static final TField USER_MACHINE_NAME_FIELD_DESC = new TField("user_machine_name", (byte) 11, 2);
    private static final TField MACHINE_MODEL_FIELD_DESC = new TField("machine_model", (byte) 11, 3);
    private static final TField SN_ID_FIELD_DESC = new TField("sn_id", (byte) 11, 4);
    private static final TField MACHINE_VERSION_FIELD_DESC = new TField("machine_version", (byte) 11, 5);
    private static final TField MACHINE_PIC_FIELD_DESC = new TField("machine_pic", (byte) 11, 6);
    private static final TField MACHINE_CONNECT_STATUS_FIELD_DESC = new TField("machine_connect_status", (byte) 8, 7);
    private static final TField DEVICE_TYPE_FIELD_DESC = new TField("device_type", (byte) 8, 8);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_book.UserMachineInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_book$UserMachineInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_book$UserMachineInfo$_Fields = iArr;
            try {
                iArr[_Fields.MACHINE_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_book$UserMachineInfo$_Fields[_Fields.USER_MACHINE_NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_book$UserMachineInfo$_Fields[_Fields.MACHINE_MODEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_book$UserMachineInfo$_Fields[_Fields.SN_ID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_book$UserMachineInfo$_Fields[_Fields.MACHINE_VERSION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_book$UserMachineInfo$_Fields[_Fields.MACHINE_PIC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_book$UserMachineInfo$_Fields[_Fields.MACHINE_CONNECT_STATUS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_book$UserMachineInfo$_Fields[_Fields.DEVICE_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserMachineInfoStandardScheme extends StandardScheme<UserMachineInfo> {
        private UserMachineInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserMachineInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetMachine_id()) {
                        throw new TProtocolException("Required field 'machine_id' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetMachine_connect_status()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'machine_connect_status' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.machine_id = iprot.readI64();
                            struct.setMachine_idIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.user_machine_name = iprot.readString();
                            struct.setUser_machine_nameIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.machine_model = iprot.readString();
                            struct.setMachine_modelIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.sn_id = iprot.readString();
                            struct.setSn_idIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.machine_version = iprot.readString();
                            struct.setMachine_versionIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.machine_pic = iprot.readString();
                            struct.setMachine_picIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.machine_connect_status = iprot.readI32();
                            struct.setMachine_connect_statusIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.device_type = iprot.readI32();
                            struct.setDevice_typeIsSet(true);
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
        public void write(TProtocol oprot, UserMachineInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserMachineInfo.STRUCT_DESC);
            oprot.writeFieldBegin(UserMachineInfo.MACHINE_ID_FIELD_DESC);
            oprot.writeI64(struct.machine_id);
            oprot.writeFieldEnd();
            if (struct.user_machine_name != null) {
                oprot.writeFieldBegin(UserMachineInfo.USER_MACHINE_NAME_FIELD_DESC);
                oprot.writeString(struct.user_machine_name);
                oprot.writeFieldEnd();
            }
            if (struct.machine_model != null) {
                oprot.writeFieldBegin(UserMachineInfo.MACHINE_MODEL_FIELD_DESC);
                oprot.writeString(struct.machine_model);
                oprot.writeFieldEnd();
            }
            if (struct.sn_id != null) {
                oprot.writeFieldBegin(UserMachineInfo.SN_ID_FIELD_DESC);
                oprot.writeString(struct.sn_id);
                oprot.writeFieldEnd();
            }
            if (struct.machine_version != null) {
                oprot.writeFieldBegin(UserMachineInfo.MACHINE_VERSION_FIELD_DESC);
                oprot.writeString(struct.machine_version);
                oprot.writeFieldEnd();
            }
            if (struct.machine_pic != null) {
                oprot.writeFieldBegin(UserMachineInfo.MACHINE_PIC_FIELD_DESC);
                oprot.writeString(struct.machine_pic);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(UserMachineInfo.MACHINE_CONNECT_STATUS_FIELD_DESC);
            oprot.writeI32(struct.machine_connect_status);
            oprot.writeFieldEnd();
            if (struct.isSetDevice_type()) {
                oprot.writeFieldBegin(UserMachineInfo.DEVICE_TYPE_FIELD_DESC);
                oprot.writeI32(struct.device_type);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserMachineInfoStandardSchemeFactory implements SchemeFactory {
        private UserMachineInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserMachineInfoStandardScheme getScheme() {
            return new UserMachineInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserMachineInfoTupleScheme extends TupleScheme<UserMachineInfo> {
        private UserMachineInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserMachineInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.machine_id = tTupleProtocol.readI64();
            struct.setMachine_idIsSet(true);
            struct.user_machine_name = tTupleProtocol.readString();
            struct.setUser_machine_nameIsSet(true);
            struct.machine_model = tTupleProtocol.readString();
            struct.setMachine_modelIsSet(true);
            struct.sn_id = tTupleProtocol.readString();
            struct.setSn_idIsSet(true);
            struct.machine_version = tTupleProtocol.readString();
            struct.setMachine_versionIsSet(true);
            struct.machine_pic = tTupleProtocol.readString();
            struct.setMachine_picIsSet(true);
            struct.machine_connect_status = tTupleProtocol.readI32();
            struct.setMachine_connect_statusIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                struct.device_type = tTupleProtocol.readI32();
                struct.setDevice_typeIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserMachineInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI64(struct.machine_id);
            tTupleProtocol.writeString(struct.user_machine_name);
            tTupleProtocol.writeString(struct.machine_model);
            tTupleProtocol.writeString(struct.sn_id);
            tTupleProtocol.writeString(struct.machine_version);
            tTupleProtocol.writeString(struct.machine_pic);
            tTupleProtocol.writeI32(struct.machine_connect_status);
            BitSet bitSet = new BitSet();
            if (struct.isSetDevice_type()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetDevice_type()) {
                tTupleProtocol.writeI32(struct.device_type);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserMachineInfoTupleSchemeFactory implements SchemeFactory {
        private UserMachineInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserMachineInfoTupleScheme getScheme() {
            return new UserMachineInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        MACHINE_ID(1, "machine_id"),
        USER_MACHINE_NAME(2, "user_machine_name"),
        MACHINE_MODEL(3, "machine_model"),
        SN_ID(4, "sn_id"),
        MACHINE_VERSION(5, "machine_version"),
        MACHINE_PIC(6, "machine_pic"),
        MACHINE_CONNECT_STATUS(7, "machine_connect_status"),
        DEVICE_TYPE(8, "device_type");

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
                    return MACHINE_ID;
                case 2:
                    return USER_MACHINE_NAME;
                case 3:
                    return MACHINE_MODEL;
                case 4:
                    return SN_ID;
                case 5:
                    return MACHINE_VERSION;
                case 6:
                    return MACHINE_PIC;
                case 7:
                    return MACHINE_CONNECT_STATUS;
                case 8:
                    return DEVICE_TYPE;
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
        hashMap.put(StandardScheme.class, new UserMachineInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserMachineInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.MACHINE_ID, (_Fields) new FieldMetaData("machine_id", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.USER_MACHINE_NAME, (_Fields) new FieldMetaData("user_machine_name", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.MACHINE_MODEL, (_Fields) new FieldMetaData("machine_model", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SN_ID, (_Fields) new FieldMetaData("sn_id", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.MACHINE_VERSION, (_Fields) new FieldMetaData("machine_version", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.MACHINE_PIC, (_Fields) new FieldMetaData("machine_pic", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.MACHINE_CONNECT_STATUS, (_Fields) new FieldMetaData("machine_connect_status", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.DEVICE_TYPE, (_Fields) new FieldMetaData("device_type", (byte) 2, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserMachineInfo.class, unmodifiableMap);
    }

    public UserMachineInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.DEVICE_TYPE};
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
        setMachine_idIsSet(false);
        this.machine_id = 0L;
        this.user_machine_name = null;
        this.machine_model = null;
        this.sn_id = null;
        this.machine_version = null;
        this.machine_pic = null;
        setMachine_connect_statusIsSet(false);
        this.machine_connect_status = 0;
        setDevice_typeIsSet(false);
        this.device_type = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserMachineInfo)) {
            return equals((UserMachineInfo) that);
        }
        return false;
    }

    public int getDevice_type() {
        return this.device_type;
    }

    public int getMachine_connect_status() {
        return this.machine_connect_status;
    }

    public long getMachine_id() {
        return this.machine_id;
    }

    public String getMachine_model() {
        return this.machine_model;
    }

    public String getMachine_pic() {
        return this.machine_pic;
    }

    public String getMachine_version() {
        return this.machine_version;
    }

    public String getSn_id() {
        return this.sn_id;
    }

    public String getUser_machine_name() {
        return this.user_machine_name;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetDevice_type() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetMachine_connect_status() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetMachine_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetMachine_model() {
        return this.machine_model != null;
    }

    public boolean isSetMachine_pic() {
        return this.machine_pic != null;
    }

    public boolean isSetMachine_version() {
        return this.machine_version != null;
    }

    public boolean isSetSn_id() {
        return this.sn_id != null;
    }

    public boolean isSetUser_machine_name() {
        return this.user_machine_name != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserMachineInfo setDevice_type(int device_type) {
        this.device_type = device_type;
        setDevice_typeIsSet(true);
        return this;
    }

    public void setDevice_typeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public UserMachineInfo setMachine_connect_status(int machine_connect_status) {
        this.machine_connect_status = machine_connect_status;
        setMachine_connect_statusIsSet(true);
        return this;
    }

    public void setMachine_connect_statusIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public UserMachineInfo setMachine_id(long machine_id) {
        this.machine_id = machine_id;
        setMachine_idIsSet(true);
        return this;
    }

    public void setMachine_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public UserMachineInfo setMachine_model(String machine_model) {
        this.machine_model = machine_model;
        return this;
    }

    public void setMachine_modelIsSet(boolean value) {
        if (value) {
            return;
        }
        this.machine_model = null;
    }

    public UserMachineInfo setMachine_pic(String machine_pic) {
        this.machine_pic = machine_pic;
        return this;
    }

    public void setMachine_picIsSet(boolean value) {
        if (value) {
            return;
        }
        this.machine_pic = null;
    }

    public UserMachineInfo setMachine_version(String machine_version) {
        this.machine_version = machine_version;
        return this;
    }

    public void setMachine_versionIsSet(boolean value) {
        if (value) {
            return;
        }
        this.machine_version = null;
    }

    public UserMachineInfo setSn_id(String sn_id) {
        this.sn_id = sn_id;
        return this;
    }

    public void setSn_idIsSet(boolean value) {
        if (value) {
            return;
        }
        this.sn_id = null;
    }

    public UserMachineInfo setUser_machine_name(String user_machine_name) {
        this.user_machine_name = user_machine_name;
        return this;
    }

    public void setUser_machine_nameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.user_machine_name = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserMachineInfo(");
        sb2.append("machine_id:");
        sb2.append(this.machine_id);
        sb2.append(j2.O);
        sb2.append("user_machine_name:");
        String str = this.user_machine_name;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("machine_model:");
        String str2 = this.machine_model;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("sn_id:");
        String str3 = this.sn_id;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(j2.O);
        sb2.append("machine_version:");
        String str4 = this.machine_version;
        if (str4 == null) {
            sb2.append("null");
        } else {
            sb2.append(str4);
        }
        sb2.append(j2.O);
        sb2.append("machine_pic:");
        String str5 = this.machine_pic;
        if (str5 == null) {
            sb2.append("null");
        } else {
            sb2.append(str5);
        }
        sb2.append(j2.O);
        sb2.append("machine_connect_status:");
        sb2.append(this.machine_connect_status);
        if (isSetDevice_type()) {
            sb2.append(j2.O);
            sb2.append("device_type:");
            sb2.append(this.device_type);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetDevice_type() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetMachine_connect_status() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetMachine_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetMachine_model() {
        this.machine_model = null;
    }

    public void unsetMachine_pic() {
        this.machine_pic = null;
    }

    public void unsetMachine_version() {
        this.machine_version = null;
    }

    public void unsetSn_id() {
        this.sn_id = null;
    }

    public void unsetUser_machine_name() {
        this.user_machine_name = null;
    }

    public void validate() throws TException {
        if (this.user_machine_name == null) {
            throw new TProtocolException("Required field 'user_machine_name' was not present! Struct: " + toString());
        }
        if (this.machine_model == null) {
            throw new TProtocolException("Required field 'machine_model' was not present! Struct: " + toString());
        }
        if (this.sn_id == null) {
            throw new TProtocolException("Required field 'sn_id' was not present! Struct: " + toString());
        }
        if (this.machine_version == null) {
            throw new TProtocolException("Required field 'machine_version' was not present! Struct: " + toString());
        }
        if (this.machine_pic != null) {
            return;
        }
        throw new TProtocolException("Required field 'machine_pic' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(UserMachineInfo other) {
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
        int compareTo9 = Boolean.valueOf(isSetMachine_id()).compareTo(Boolean.valueOf(other.isSetMachine_id()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetMachine_id() && (compareTo8 = TBaseHelper.compareTo(this.machine_id, other.machine_id)) != 0) {
            return compareTo8;
        }
        int compareTo10 = Boolean.valueOf(isSetUser_machine_name()).compareTo(Boolean.valueOf(other.isSetUser_machine_name()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetUser_machine_name() && (compareTo7 = TBaseHelper.compareTo(this.user_machine_name, other.user_machine_name)) != 0) {
            return compareTo7;
        }
        int compareTo11 = Boolean.valueOf(isSetMachine_model()).compareTo(Boolean.valueOf(other.isSetMachine_model()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetMachine_model() && (compareTo6 = TBaseHelper.compareTo(this.machine_model, other.machine_model)) != 0) {
            return compareTo6;
        }
        int compareTo12 = Boolean.valueOf(isSetSn_id()).compareTo(Boolean.valueOf(other.isSetSn_id()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetSn_id() && (compareTo5 = TBaseHelper.compareTo(this.sn_id, other.sn_id)) != 0) {
            return compareTo5;
        }
        int compareTo13 = Boolean.valueOf(isSetMachine_version()).compareTo(Boolean.valueOf(other.isSetMachine_version()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetMachine_version() && (compareTo4 = TBaseHelper.compareTo(this.machine_version, other.machine_version)) != 0) {
            return compareTo4;
        }
        int compareTo14 = Boolean.valueOf(isSetMachine_pic()).compareTo(Boolean.valueOf(other.isSetMachine_pic()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (isSetMachine_pic() && (compareTo3 = TBaseHelper.compareTo(this.machine_pic, other.machine_pic)) != 0) {
            return compareTo3;
        }
        int compareTo15 = Boolean.valueOf(isSetMachine_connect_status()).compareTo(Boolean.valueOf(other.isSetMachine_connect_status()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (isSetMachine_connect_status() && (compareTo2 = TBaseHelper.compareTo(this.machine_connect_status, other.machine_connect_status)) != 0) {
            return compareTo2;
        }
        int compareTo16 = Boolean.valueOf(isSetDevice_type()).compareTo(Boolean.valueOf(other.isSetDevice_type()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (!isSetDevice_type() || (compareTo = TBaseHelper.compareTo(this.device_type, other.device_type)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserMachineInfo, _Fields> deepCopy2() {
        return new UserMachineInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_book$UserMachineInfo$_Fields[field.ordinal()]) {
            case 1:
                return Long.valueOf(getMachine_id());
            case 2:
                return getUser_machine_name();
            case 3:
                return getMachine_model();
            case 4:
                return getSn_id();
            case 5:
                return getMachine_version();
            case 6:
                return getMachine_pic();
            case 7:
                return Integer.valueOf(getMachine_connect_status());
            case 8:
                return Integer.valueOf(getDevice_type());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_book$UserMachineInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetMachine_id();
            case 2:
                return isSetUser_machine_name();
            case 3:
                return isSetMachine_model();
            case 4:
                return isSetSn_id();
            case 5:
                return isSetMachine_version();
            case 6:
                return isSetMachine_pic();
            case 7:
                return isSetMachine_connect_status();
            case 8:
                return isSetDevice_type();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_book$UserMachineInfo$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setMachine_id(((Long) value).longValue());
                    break;
                } else {
                    unsetMachine_id();
                    break;
                }
            case 2:
                if (value != null) {
                    setUser_machine_name((String) value);
                    break;
                } else {
                    unsetUser_machine_name();
                    break;
                }
            case 3:
                if (value != null) {
                    setMachine_model((String) value);
                    break;
                } else {
                    unsetMachine_model();
                    break;
                }
            case 4:
                if (value != null) {
                    setSn_id((String) value);
                    break;
                } else {
                    unsetSn_id();
                    break;
                }
            case 5:
                if (value != null) {
                    setMachine_version((String) value);
                    break;
                } else {
                    unsetMachine_version();
                    break;
                }
            case 6:
                if (value != null) {
                    setMachine_pic((String) value);
                    break;
                } else {
                    unsetMachine_pic();
                    break;
                }
            case 7:
                if (value != null) {
                    setMachine_connect_status(((Integer) value).intValue());
                    break;
                } else {
                    unsetMachine_connect_status();
                    break;
                }
            case 8:
                if (value != null) {
                    setDevice_type(((Integer) value).intValue());
                    break;
                } else {
                    unsetDevice_type();
                    break;
                }
        }
    }

    public boolean equals(UserMachineInfo that) {
        if (that == null || this.machine_id != that.machine_id) {
            return false;
        }
        boolean isSetUser_machine_name = isSetUser_machine_name();
        boolean isSetUser_machine_name2 = that.isSetUser_machine_name();
        if ((isSetUser_machine_name || isSetUser_machine_name2) && !(isSetUser_machine_name && isSetUser_machine_name2 && this.user_machine_name.equals(that.user_machine_name))) {
            return false;
        }
        boolean isSetMachine_model = isSetMachine_model();
        boolean isSetMachine_model2 = that.isSetMachine_model();
        if ((isSetMachine_model || isSetMachine_model2) && !(isSetMachine_model && isSetMachine_model2 && this.machine_model.equals(that.machine_model))) {
            return false;
        }
        boolean isSetSn_id = isSetSn_id();
        boolean isSetSn_id2 = that.isSetSn_id();
        if ((isSetSn_id || isSetSn_id2) && !(isSetSn_id && isSetSn_id2 && this.sn_id.equals(that.sn_id))) {
            return false;
        }
        boolean isSetMachine_version = isSetMachine_version();
        boolean isSetMachine_version2 = that.isSetMachine_version();
        if ((isSetMachine_version || isSetMachine_version2) && !(isSetMachine_version && isSetMachine_version2 && this.machine_version.equals(that.machine_version))) {
            return false;
        }
        boolean isSetMachine_pic = isSetMachine_pic();
        boolean isSetMachine_pic2 = that.isSetMachine_pic();
        if (((isSetMachine_pic || isSetMachine_pic2) && !(isSetMachine_pic && isSetMachine_pic2 && this.machine_pic.equals(that.machine_pic))) || this.machine_connect_status != that.machine_connect_status) {
            return false;
        }
        boolean isSetDevice_type = isSetDevice_type();
        boolean isSetDevice_type2 = that.isSetDevice_type();
        if (isSetDevice_type || isSetDevice_type2) {
            return isSetDevice_type && isSetDevice_type2 && this.device_type == that.device_type;
        }
        return true;
    }

    public UserMachineInfo(long machine_id, String user_machine_name, String machine_model, String sn_id, String machine_version, String machine_pic, int machine_connect_status) {
        this();
        this.machine_id = machine_id;
        setMachine_idIsSet(true);
        this.user_machine_name = user_machine_name;
        this.machine_model = machine_model;
        this.sn_id = sn_id;
        this.machine_version = machine_version;
        this.machine_pic = machine_pic;
        this.machine_connect_status = machine_connect_status;
        setMachine_connect_statusIsSet(true);
    }

    public UserMachineInfo(UserMachineInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.DEVICE_TYPE};
        this.__isset_bitfield = other.__isset_bitfield;
        this.machine_id = other.machine_id;
        if (other.isSetUser_machine_name()) {
            this.user_machine_name = other.user_machine_name;
        }
        if (other.isSetMachine_model()) {
            this.machine_model = other.machine_model;
        }
        if (other.isSetSn_id()) {
            this.sn_id = other.sn_id;
        }
        if (other.isSetMachine_version()) {
            this.machine_version = other.machine_version;
        }
        if (other.isSetMachine_pic()) {
            this.machine_pic = other.machine_pic;
        }
        this.machine_connect_status = other.machine_connect_status;
        this.device_type = other.device_type;
    }
}
