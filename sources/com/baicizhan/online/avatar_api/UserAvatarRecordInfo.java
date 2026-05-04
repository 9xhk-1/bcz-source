package com.baicizhan.online.avatar_api;

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
public class UserAvatarRecordInfo implements TBase<UserAvatarRecordInfo, _Fields>, Serializable, Cloneable, Comparable<UserAvatarRecordInfo> {
    private static final int __IP_EXP_ISSET_ID = 2;
    private static final int __IP_LEVEL_ISSET_ID = 1;
    private static final int __IP_TYPE_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int ip_exp;
    public int ip_level;
    public int ip_type;
    private static final TStruct STRUCT_DESC = new TStruct("UserAvatarRecordInfo");
    private static final TField IP_TYPE_FIELD_DESC = new TField("ip_type", (byte) 8, 1);
    private static final TField IP_LEVEL_FIELD_DESC = new TField("ip_level", (byte) 8, 2);
    private static final TField IP_EXP_FIELD_DESC = new TField("ip_exp", (byte) 8, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.avatar_api.UserAvatarRecordInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$avatar_api$UserAvatarRecordInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$avatar_api$UserAvatarRecordInfo$_Fields = iArr;
            try {
                iArr[_Fields.IP_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$UserAvatarRecordInfo$_Fields[_Fields.IP_LEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$UserAvatarRecordInfo$_Fields[_Fields.IP_EXP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserAvatarRecordInfoStandardScheme extends StandardScheme<UserAvatarRecordInfo> {
        private UserAvatarRecordInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserAvatarRecordInfo struct) throws TException {
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
                            struct.ip_exp = iprot.readI32();
                            struct.setIp_expIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.ip_level = iprot.readI32();
                        struct.setIp_levelIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.ip_type = iprot.readI32();
                    struct.setIp_typeIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetIp_type()) {
                throw new TProtocolException("Required field 'ip_type' was not found in serialized data! Struct: " + toString());
            }
            if (!struct.isSetIp_level()) {
                throw new TProtocolException("Required field 'ip_level' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetIp_exp()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'ip_exp' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, UserAvatarRecordInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserAvatarRecordInfo.STRUCT_DESC);
            oprot.writeFieldBegin(UserAvatarRecordInfo.IP_TYPE_FIELD_DESC);
            oprot.writeI32(struct.ip_type);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserAvatarRecordInfo.IP_LEVEL_FIELD_DESC);
            oprot.writeI32(struct.ip_level);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserAvatarRecordInfo.IP_EXP_FIELD_DESC);
            oprot.writeI32(struct.ip_exp);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserAvatarRecordInfoStandardSchemeFactory implements SchemeFactory {
        private UserAvatarRecordInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserAvatarRecordInfoStandardScheme getScheme() {
            return new UserAvatarRecordInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserAvatarRecordInfoTupleScheme extends TupleScheme<UserAvatarRecordInfo> {
        private UserAvatarRecordInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserAvatarRecordInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.ip_type = tTupleProtocol.readI32();
            struct.setIp_typeIsSet(true);
            struct.ip_level = tTupleProtocol.readI32();
            struct.setIp_levelIsSet(true);
            struct.ip_exp = tTupleProtocol.readI32();
            struct.setIp_expIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserAvatarRecordInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.ip_type);
            tTupleProtocol.writeI32(struct.ip_level);
            tTupleProtocol.writeI32(struct.ip_exp);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserAvatarRecordInfoTupleSchemeFactory implements SchemeFactory {
        private UserAvatarRecordInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserAvatarRecordInfoTupleScheme getScheme() {
            return new UserAvatarRecordInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        IP_TYPE(1, "ip_type"),
        IP_LEVEL(2, "ip_level"),
        IP_EXP(3, "ip_exp");

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
                return IP_TYPE;
            }
            if (fieldId == 2) {
                return IP_LEVEL;
            }
            if (fieldId != 3) {
                return null;
            }
            return IP_EXP;
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
        hashMap.put(StandardScheme.class, new UserAvatarRecordInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserAvatarRecordInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.IP_TYPE, (_Fields) new FieldMetaData("ip_type", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.IP_LEVEL, (_Fields) new FieldMetaData("ip_level", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.IP_EXP, (_Fields) new FieldMetaData("ip_exp", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserAvatarRecordInfo.class, unmodifiableMap);
    }

    public UserAvatarRecordInfo() {
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
        setIp_typeIsSet(false);
        this.ip_type = 0;
        setIp_levelIsSet(false);
        this.ip_level = 0;
        setIp_expIsSet(false);
        this.ip_exp = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserAvatarRecordInfo)) {
            return equals((UserAvatarRecordInfo) that);
        }
        return false;
    }

    public int getIp_exp() {
        return this.ip_exp;
    }

    public int getIp_level() {
        return this.ip_level;
    }

    public int getIp_type() {
        return this.ip_type;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetIp_exp() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetIp_level() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetIp_type() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserAvatarRecordInfo setIp_exp(int ip_exp) {
        this.ip_exp = ip_exp;
        setIp_expIsSet(true);
        return this;
    }

    public void setIp_expIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public UserAvatarRecordInfo setIp_level(int ip_level) {
        this.ip_level = ip_level;
        setIp_levelIsSet(true);
        return this;
    }

    public void setIp_levelIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public UserAvatarRecordInfo setIp_type(int ip_type) {
        this.ip_type = ip_type;
        setIp_typeIsSet(true);
        return this;
    }

    public void setIp_typeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        return "UserAvatarRecordInfo(ip_type:" + this.ip_type + j2.O + "ip_level:" + this.ip_level + j2.O + "ip_exp:" + this.ip_exp + pn.j.f81007d;
    }

    public void unsetIp_exp() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetIp_level() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetIp_type() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(UserAvatarRecordInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetIp_type()).compareTo(Boolean.valueOf(other.isSetIp_type()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetIp_type() && (compareTo3 = TBaseHelper.compareTo(this.ip_type, other.ip_type)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetIp_level()).compareTo(Boolean.valueOf(other.isSetIp_level()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetIp_level() && (compareTo2 = TBaseHelper.compareTo(this.ip_level, other.ip_level)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetIp_exp()).compareTo(Boolean.valueOf(other.isSetIp_exp()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetIp_exp() || (compareTo = TBaseHelper.compareTo(this.ip_exp, other.ip_exp)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserAvatarRecordInfo, _Fields> deepCopy2() {
        return new UserAvatarRecordInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$avatar_api$UserAvatarRecordInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getIp_type());
        }
        if (i11 == 2) {
            return Integer.valueOf(getIp_level());
        }
        if (i11 == 3) {
            return Integer.valueOf(getIp_exp());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$avatar_api$UserAvatarRecordInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetIp_type();
        }
        if (i11 == 2) {
            return isSetIp_level();
        }
        if (i11 == 3) {
            return isSetIp_exp();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$avatar_api$UserAvatarRecordInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetIp_type();
                return;
            } else {
                setIp_type(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetIp_level();
                return;
            } else {
                setIp_level(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetIp_exp();
        } else {
            setIp_exp(((Integer) value).intValue());
        }
    }

    public UserAvatarRecordInfo(int ip_type, int ip_level, int ip_exp) {
        this();
        this.ip_type = ip_type;
        setIp_typeIsSet(true);
        this.ip_level = ip_level;
        setIp_levelIsSet(true);
        this.ip_exp = ip_exp;
        setIp_expIsSet(true);
    }

    public boolean equals(UserAvatarRecordInfo that) {
        return that != null && this.ip_type == that.ip_type && this.ip_level == that.ip_level && this.ip_exp == that.ip_exp;
    }

    public UserAvatarRecordInfo(UserAvatarRecordInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.ip_type = other.ip_type;
        this.ip_level = other.ip_level;
        this.ip_exp = other.ip_exp;
    }

    public void validate() throws TException {
    }
}
