package com.baicizhan.online.unified_user_service;

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
/* loaded from: classes6.dex */
public class UserLoginResult implements TBase<UserLoginResult, _Fields>, Serializable, Cloneable, Comparable<UserLoginResult> {
    private static final int __FORCE_BIND_PHONE_ISSET_ID = 2;
    private static final int __GAME_MODE_ISSET_ID = 4;
    private static final int __IS_NEW_USER_ISSET_ID = 0;
    private static final int __ROLE_NEW_ISSET_ID = 3;
    private static final int __UNIQUE_ID_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String access_token;
    public String email;
    public int force_bind_phone;
    public int game_mode;
    public int is_new_user;
    public String last_device;
    private _Fields[] optionals;
    public String phone;
    public String public_key;
    public RoleInfo role;
    public int role_new;
    public long unique_id;
    private static final TStruct STRUCT_DESC = new TStruct("UserLoginResult");
    private static final TField ACCESS_TOKEN_FIELD_DESC = new TField("access_token", (byte) 11, 1);
    private static final TField IS_NEW_USER_FIELD_DESC = new TField("is_new_user", (byte) 8, 2);
    private static final TField EMAIL_FIELD_DESC = new TField("email", (byte) 11, 3);
    private static final TField PUBLIC_KEY_FIELD_DESC = new TField(com.alipay.sdk.m.p.e.f10911o, (byte) 11, 4);
    private static final TField LAST_DEVICE_FIELD_DESC = new TField("last_device", (byte) 11, 5);
    private static final TField UNIQUE_ID_FIELD_DESC = new TField("unique_id", (byte) 10, 6);
    private static final TField PHONE_FIELD_DESC = new TField("phone", (byte) 11, 7);
    private static final TField FORCE_BIND_PHONE_FIELD_DESC = new TField("force_bind_phone", (byte) 8, 8);
    private static final TField ROLE_NEW_FIELD_DESC = new TField("role_new", (byte) 8, 9);
    private static final TField ROLE_FIELD_DESC = new TField("role", (byte) 12, 10);
    private static final TField GAME_MODE_FIELD_DESC = new TField("game_mode", (byte) 8, 11);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.unified_user_service.UserLoginResult$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$unified_user_service$UserLoginResult$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$unified_user_service$UserLoginResult$_Fields = iArr;
            try {
                iArr[_Fields.ACCESS_TOKEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$UserLoginResult$_Fields[_Fields.IS_NEW_USER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$UserLoginResult$_Fields[_Fields.EMAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$UserLoginResult$_Fields[_Fields.PUBLIC_KEY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$UserLoginResult$_Fields[_Fields.LAST_DEVICE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$UserLoginResult$_Fields[_Fields.UNIQUE_ID.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$UserLoginResult$_Fields[_Fields.PHONE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$UserLoginResult$_Fields[_Fields.FORCE_BIND_PHONE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$UserLoginResult$_Fields[_Fields.ROLE_NEW.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$UserLoginResult$_Fields[_Fields.ROLE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$UserLoginResult$_Fields[_Fields.GAME_MODE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserLoginResultStandardScheme extends StandardScheme<UserLoginResult> {
        private UserLoginResultStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserLoginResult struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetIs_new_user()) {
                        throw new TProtocolException("Required field 'is_new_user' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetUnique_id()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'unique_id' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.access_token = iprot.readString();
                            struct.setAccess_tokenIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.is_new_user = iprot.readI32();
                            struct.setIs_new_userIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.email = iprot.readString();
                            struct.setEmailIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.public_key = iprot.readString();
                            struct.setPublic_keyIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.last_device = iprot.readString();
                            struct.setLast_deviceIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.unique_id = iprot.readI64();
                            struct.setUnique_idIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.phone = iprot.readString();
                            struct.setPhoneIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.force_bind_phone = iprot.readI32();
                            struct.setForce_bind_phoneIsSet(true);
                            break;
                        }
                    case 9:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.role_new = iprot.readI32();
                            struct.setRole_newIsSet(true);
                            break;
                        }
                    case 10:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            RoleInfo roleInfo = new RoleInfo();
                            struct.role = roleInfo;
                            roleInfo.read(iprot);
                            struct.setRoleIsSet(true);
                            break;
                        }
                    case 11:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.game_mode = iprot.readI32();
                            struct.setGame_modeIsSet(true);
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
        public void write(TProtocol oprot, UserLoginResult struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserLoginResult.STRUCT_DESC);
            if (struct.access_token != null) {
                oprot.writeFieldBegin(UserLoginResult.ACCESS_TOKEN_FIELD_DESC);
                oprot.writeString(struct.access_token);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(UserLoginResult.IS_NEW_USER_FIELD_DESC);
            oprot.writeI32(struct.is_new_user);
            oprot.writeFieldEnd();
            if (struct.email != null) {
                oprot.writeFieldBegin(UserLoginResult.EMAIL_FIELD_DESC);
                oprot.writeString(struct.email);
                oprot.writeFieldEnd();
            }
            if (struct.public_key != null) {
                oprot.writeFieldBegin(UserLoginResult.PUBLIC_KEY_FIELD_DESC);
                oprot.writeString(struct.public_key);
                oprot.writeFieldEnd();
            }
            if (struct.last_device != null) {
                oprot.writeFieldBegin(UserLoginResult.LAST_DEVICE_FIELD_DESC);
                oprot.writeString(struct.last_device);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(UserLoginResult.UNIQUE_ID_FIELD_DESC);
            oprot.writeI64(struct.unique_id);
            oprot.writeFieldEnd();
            if (struct.phone != null && struct.isSetPhone()) {
                oprot.writeFieldBegin(UserLoginResult.PHONE_FIELD_DESC);
                oprot.writeString(struct.phone);
                oprot.writeFieldEnd();
            }
            if (struct.isSetForce_bind_phone()) {
                oprot.writeFieldBegin(UserLoginResult.FORCE_BIND_PHONE_FIELD_DESC);
                oprot.writeI32(struct.force_bind_phone);
                oprot.writeFieldEnd();
            }
            if (struct.isSetRole_new()) {
                oprot.writeFieldBegin(UserLoginResult.ROLE_NEW_FIELD_DESC);
                oprot.writeI32(struct.role_new);
                oprot.writeFieldEnd();
            }
            if (struct.role != null && struct.isSetRole()) {
                oprot.writeFieldBegin(UserLoginResult.ROLE_FIELD_DESC);
                struct.role.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.isSetGame_mode()) {
                oprot.writeFieldBegin(UserLoginResult.GAME_MODE_FIELD_DESC);
                oprot.writeI32(struct.game_mode);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserLoginResultStandardSchemeFactory implements SchemeFactory {
        private UserLoginResultStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserLoginResultStandardScheme getScheme() {
            return new UserLoginResultStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserLoginResultTupleScheme extends TupleScheme<UserLoginResult> {
        private UserLoginResultTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserLoginResult struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.access_token = tTupleProtocol.readString();
            struct.setAccess_tokenIsSet(true);
            struct.is_new_user = tTupleProtocol.readI32();
            struct.setIs_new_userIsSet(true);
            struct.email = tTupleProtocol.readString();
            struct.setEmailIsSet(true);
            struct.public_key = tTupleProtocol.readString();
            struct.setPublic_keyIsSet(true);
            struct.last_device = tTupleProtocol.readString();
            struct.setLast_deviceIsSet(true);
            struct.unique_id = tTupleProtocol.readI64();
            struct.setUnique_idIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(5);
            if (readBitSet.get(0)) {
                struct.phone = tTupleProtocol.readString();
                struct.setPhoneIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.force_bind_phone = tTupleProtocol.readI32();
                struct.setForce_bind_phoneIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.role_new = tTupleProtocol.readI32();
                struct.setRole_newIsSet(true);
            }
            if (readBitSet.get(3)) {
                RoleInfo roleInfo = new RoleInfo();
                struct.role = roleInfo;
                roleInfo.read(tTupleProtocol);
                struct.setRoleIsSet(true);
            }
            if (readBitSet.get(4)) {
                struct.game_mode = tTupleProtocol.readI32();
                struct.setGame_modeIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserLoginResult struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.access_token);
            tTupleProtocol.writeI32(struct.is_new_user);
            tTupleProtocol.writeString(struct.email);
            tTupleProtocol.writeString(struct.public_key);
            tTupleProtocol.writeString(struct.last_device);
            tTupleProtocol.writeI64(struct.unique_id);
            BitSet bitSet = new BitSet();
            if (struct.isSetPhone()) {
                bitSet.set(0);
            }
            if (struct.isSetForce_bind_phone()) {
                bitSet.set(1);
            }
            if (struct.isSetRole_new()) {
                bitSet.set(2);
            }
            if (struct.isSetRole()) {
                bitSet.set(3);
            }
            if (struct.isSetGame_mode()) {
                bitSet.set(4);
            }
            tTupleProtocol.writeBitSet(bitSet, 5);
            if (struct.isSetPhone()) {
                tTupleProtocol.writeString(struct.phone);
            }
            if (struct.isSetForce_bind_phone()) {
                tTupleProtocol.writeI32(struct.force_bind_phone);
            }
            if (struct.isSetRole_new()) {
                tTupleProtocol.writeI32(struct.role_new);
            }
            if (struct.isSetRole()) {
                struct.role.write(tTupleProtocol);
            }
            if (struct.isSetGame_mode()) {
                tTupleProtocol.writeI32(struct.game_mode);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserLoginResultTupleSchemeFactory implements SchemeFactory {
        private UserLoginResultTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserLoginResultTupleScheme getScheme() {
            return new UserLoginResultTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ACCESS_TOKEN(1, "access_token"),
        IS_NEW_USER(2, "is_new_user"),
        EMAIL(3, "email"),
        PUBLIC_KEY(4, com.alipay.sdk.m.p.e.f10911o),
        LAST_DEVICE(5, "last_device"),
        UNIQUE_ID(6, "unique_id"),
        PHONE(7, "phone"),
        FORCE_BIND_PHONE(8, "force_bind_phone"),
        ROLE_NEW(9, "role_new"),
        ROLE(10, "role"),
        GAME_MODE(11, "game_mode");

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
                    return ACCESS_TOKEN;
                case 2:
                    return IS_NEW_USER;
                case 3:
                    return EMAIL;
                case 4:
                    return PUBLIC_KEY;
                case 5:
                    return LAST_DEVICE;
                case 6:
                    return UNIQUE_ID;
                case 7:
                    return PHONE;
                case 8:
                    return FORCE_BIND_PHONE;
                case 9:
                    return ROLE_NEW;
                case 10:
                    return ROLE;
                case 11:
                    return GAME_MODE;
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
        hashMap.put(StandardScheme.class, new UserLoginResultStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserLoginResultTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ACCESS_TOKEN, (_Fields) new FieldMetaData("access_token", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.IS_NEW_USER, (_Fields) new FieldMetaData("is_new_user", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.EMAIL, (_Fields) new FieldMetaData("email", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.PUBLIC_KEY, (_Fields) new FieldMetaData(com.alipay.sdk.m.p.e.f10911o, (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.LAST_DEVICE, (_Fields) new FieldMetaData("last_device", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.UNIQUE_ID, (_Fields) new FieldMetaData("unique_id", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.PHONE, (_Fields) new FieldMetaData("phone", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.FORCE_BIND_PHONE, (_Fields) new FieldMetaData("force_bind_phone", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.ROLE_NEW, (_Fields) new FieldMetaData("role_new", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.ROLE, (_Fields) new FieldMetaData("role", (byte) 2, new StructMetaData((byte) 12, RoleInfo.class)));
        enumMap.put((EnumMap) _Fields.GAME_MODE, (_Fields) new FieldMetaData("game_mode", (byte) 2, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserLoginResult.class, unmodifiableMap);
    }

    public UserLoginResult() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.PHONE, _Fields.FORCE_BIND_PHONE, _Fields.ROLE_NEW, _Fields.ROLE, _Fields.GAME_MODE};
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
        this.access_token = null;
        setIs_new_userIsSet(false);
        this.is_new_user = 0;
        this.email = null;
        this.public_key = null;
        this.last_device = null;
        setUnique_idIsSet(false);
        this.unique_id = 0L;
        this.phone = null;
        setForce_bind_phoneIsSet(false);
        this.force_bind_phone = 0;
        setRole_newIsSet(false);
        this.role_new = 0;
        this.role = null;
        setGame_modeIsSet(false);
        this.game_mode = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserLoginResult)) {
            return equals((UserLoginResult) that);
        }
        return false;
    }

    public String getAccess_token() {
        return this.access_token;
    }

    public String getEmail() {
        return this.email;
    }

    public int getForce_bind_phone() {
        return this.force_bind_phone;
    }

    public int getGame_mode() {
        return this.game_mode;
    }

    public int getIs_new_user() {
        return this.is_new_user;
    }

    public String getLast_device() {
        return this.last_device;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getPublic_key() {
        return this.public_key;
    }

    public RoleInfo getRole() {
        return this.role;
    }

    public int getRole_new() {
        return this.role_new;
    }

    public long getUnique_id() {
        return this.unique_id;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAccess_token() {
        return this.access_token != null;
    }

    public boolean isSetEmail() {
        return this.email != null;
    }

    public boolean isSetForce_bind_phone() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetGame_mode() {
        return EncodingUtils.testBit(this.__isset_bitfield, 4);
    }

    public boolean isSetIs_new_user() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetLast_device() {
        return this.last_device != null;
    }

    public boolean isSetPhone() {
        return this.phone != null;
    }

    public boolean isSetPublic_key() {
        return this.public_key != null;
    }

    public boolean isSetRole() {
        return this.role != null;
    }

    public boolean isSetRole_new() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetUnique_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserLoginResult setAccess_token(String access_token) {
        this.access_token = access_token;
        return this;
    }

    public void setAccess_tokenIsSet(boolean value) {
        if (value) {
            return;
        }
        this.access_token = null;
    }

    public UserLoginResult setEmail(String email) {
        this.email = email;
        return this;
    }

    public void setEmailIsSet(boolean value) {
        if (value) {
            return;
        }
        this.email = null;
    }

    public UserLoginResult setForce_bind_phone(int force_bind_phone) {
        this.force_bind_phone = force_bind_phone;
        setForce_bind_phoneIsSet(true);
        return this;
    }

    public void setForce_bind_phoneIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public UserLoginResult setGame_mode(int game_mode) {
        this.game_mode = game_mode;
        setGame_modeIsSet(true);
        return this;
    }

    public void setGame_modeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 4, value);
    }

    public UserLoginResult setIs_new_user(int is_new_user) {
        this.is_new_user = is_new_user;
        setIs_new_userIsSet(true);
        return this;
    }

    public void setIs_new_userIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public UserLoginResult setLast_device(String last_device) {
        this.last_device = last_device;
        return this;
    }

    public void setLast_deviceIsSet(boolean value) {
        if (value) {
            return;
        }
        this.last_device = null;
    }

    public UserLoginResult setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public void setPhoneIsSet(boolean value) {
        if (value) {
            return;
        }
        this.phone = null;
    }

    public UserLoginResult setPublic_key(String public_key) {
        this.public_key = public_key;
        return this;
    }

    public void setPublic_keyIsSet(boolean value) {
        if (value) {
            return;
        }
        this.public_key = null;
    }

    public UserLoginResult setRole(RoleInfo role) {
        this.role = role;
        return this;
    }

    public void setRoleIsSet(boolean value) {
        if (value) {
            return;
        }
        this.role = null;
    }

    public UserLoginResult setRole_new(int role_new) {
        this.role_new = role_new;
        setRole_newIsSet(true);
        return this;
    }

    public void setRole_newIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public UserLoginResult setUnique_id(long unique_id) {
        this.unique_id = unique_id;
        setUnique_idIsSet(true);
        return this;
    }

    public void setUnique_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserLoginResult(");
        sb2.append("access_token:");
        String str = this.access_token;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("is_new_user:");
        sb2.append(this.is_new_user);
        sb2.append(j2.O);
        sb2.append("email:");
        String str2 = this.email;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("public_key:");
        String str3 = this.public_key;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(j2.O);
        sb2.append("last_device:");
        String str4 = this.last_device;
        if (str4 == null) {
            sb2.append("null");
        } else {
            sb2.append(str4);
        }
        sb2.append(j2.O);
        sb2.append("unique_id:");
        sb2.append(this.unique_id);
        if (isSetPhone()) {
            sb2.append(j2.O);
            sb2.append("phone:");
            String str5 = this.phone;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        if (isSetForce_bind_phone()) {
            sb2.append(j2.O);
            sb2.append("force_bind_phone:");
            sb2.append(this.force_bind_phone);
        }
        if (isSetRole_new()) {
            sb2.append(j2.O);
            sb2.append("role_new:");
            sb2.append(this.role_new);
        }
        if (isSetRole()) {
            sb2.append(j2.O);
            sb2.append("role:");
            RoleInfo roleInfo = this.role;
            if (roleInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(roleInfo);
            }
        }
        if (isSetGame_mode()) {
            sb2.append(j2.O);
            sb2.append("game_mode:");
            sb2.append(this.game_mode);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAccess_token() {
        this.access_token = null;
    }

    public void unsetEmail() {
        this.email = null;
    }

    public void unsetForce_bind_phone() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetGame_mode() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 4);
    }

    public void unsetIs_new_user() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetLast_device() {
        this.last_device = null;
    }

    public void unsetPhone() {
        this.phone = null;
    }

    public void unsetPublic_key() {
        this.public_key = null;
    }

    public void unsetRole() {
        this.role = null;
    }

    public void unsetRole_new() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetUnique_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void validate() throws TException {
        if (this.access_token == null) {
            throw new TProtocolException("Required field 'access_token' was not present! Struct: " + toString());
        }
        if (this.email == null) {
            throw new TProtocolException("Required field 'email' was not present! Struct: " + toString());
        }
        if (this.public_key == null) {
            throw new TProtocolException("Required field 'public_key' was not present! Struct: " + toString());
        }
        if (this.last_device == null) {
            throw new TProtocolException("Required field 'last_device' was not present! Struct: " + toString());
        }
        RoleInfo roleInfo = this.role;
        if (roleInfo != null) {
            roleInfo.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(UserLoginResult other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        int compareTo7;
        int compareTo8;
        int compareTo9;
        int compareTo10;
        int compareTo11;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo12 = Boolean.valueOf(isSetAccess_token()).compareTo(Boolean.valueOf(other.isSetAccess_token()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetAccess_token() && (compareTo11 = TBaseHelper.compareTo(this.access_token, other.access_token)) != 0) {
            return compareTo11;
        }
        int compareTo13 = Boolean.valueOf(isSetIs_new_user()).compareTo(Boolean.valueOf(other.isSetIs_new_user()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetIs_new_user() && (compareTo10 = TBaseHelper.compareTo(this.is_new_user, other.is_new_user)) != 0) {
            return compareTo10;
        }
        int compareTo14 = Boolean.valueOf(isSetEmail()).compareTo(Boolean.valueOf(other.isSetEmail()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (isSetEmail() && (compareTo9 = TBaseHelper.compareTo(this.email, other.email)) != 0) {
            return compareTo9;
        }
        int compareTo15 = Boolean.valueOf(isSetPublic_key()).compareTo(Boolean.valueOf(other.isSetPublic_key()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (isSetPublic_key() && (compareTo8 = TBaseHelper.compareTo(this.public_key, other.public_key)) != 0) {
            return compareTo8;
        }
        int compareTo16 = Boolean.valueOf(isSetLast_device()).compareTo(Boolean.valueOf(other.isSetLast_device()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (isSetLast_device() && (compareTo7 = TBaseHelper.compareTo(this.last_device, other.last_device)) != 0) {
            return compareTo7;
        }
        int compareTo17 = Boolean.valueOf(isSetUnique_id()).compareTo(Boolean.valueOf(other.isSetUnique_id()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (isSetUnique_id() && (compareTo6 = TBaseHelper.compareTo(this.unique_id, other.unique_id)) != 0) {
            return compareTo6;
        }
        int compareTo18 = Boolean.valueOf(isSetPhone()).compareTo(Boolean.valueOf(other.isSetPhone()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (isSetPhone() && (compareTo5 = TBaseHelper.compareTo(this.phone, other.phone)) != 0) {
            return compareTo5;
        }
        int compareTo19 = Boolean.valueOf(isSetForce_bind_phone()).compareTo(Boolean.valueOf(other.isSetForce_bind_phone()));
        if (compareTo19 != 0) {
            return compareTo19;
        }
        if (isSetForce_bind_phone() && (compareTo4 = TBaseHelper.compareTo(this.force_bind_phone, other.force_bind_phone)) != 0) {
            return compareTo4;
        }
        int compareTo20 = Boolean.valueOf(isSetRole_new()).compareTo(Boolean.valueOf(other.isSetRole_new()));
        if (compareTo20 != 0) {
            return compareTo20;
        }
        if (isSetRole_new() && (compareTo3 = TBaseHelper.compareTo(this.role_new, other.role_new)) != 0) {
            return compareTo3;
        }
        int compareTo21 = Boolean.valueOf(isSetRole()).compareTo(Boolean.valueOf(other.isSetRole()));
        if (compareTo21 != 0) {
            return compareTo21;
        }
        if (isSetRole() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.role, (Comparable) other.role)) != 0) {
            return compareTo2;
        }
        int compareTo22 = Boolean.valueOf(isSetGame_mode()).compareTo(Boolean.valueOf(other.isSetGame_mode()));
        if (compareTo22 != 0) {
            return compareTo22;
        }
        if (!isSetGame_mode() || (compareTo = TBaseHelper.compareTo(this.game_mode, other.game_mode)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserLoginResult, _Fields> deepCopy2() {
        return new UserLoginResult(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$UserLoginResult$_Fields[field.ordinal()]) {
            case 1:
                return getAccess_token();
            case 2:
                return Integer.valueOf(getIs_new_user());
            case 3:
                return getEmail();
            case 4:
                return getPublic_key();
            case 5:
                return getLast_device();
            case 6:
                return Long.valueOf(getUnique_id());
            case 7:
                return getPhone();
            case 8:
                return Integer.valueOf(getForce_bind_phone());
            case 9:
                return Integer.valueOf(getRole_new());
            case 10:
                return getRole();
            case 11:
                return Integer.valueOf(getGame_mode());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$UserLoginResult$_Fields[field.ordinal()]) {
            case 1:
                return isSetAccess_token();
            case 2:
                return isSetIs_new_user();
            case 3:
                return isSetEmail();
            case 4:
                return isSetPublic_key();
            case 5:
                return isSetLast_device();
            case 6:
                return isSetUnique_id();
            case 7:
                return isSetPhone();
            case 8:
                return isSetForce_bind_phone();
            case 9:
                return isSetRole_new();
            case 10:
                return isSetRole();
            case 11:
                return isSetGame_mode();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$UserLoginResult$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setAccess_token((String) value);
                    break;
                } else {
                    unsetAccess_token();
                    break;
                }
            case 2:
                if (value != null) {
                    setIs_new_user(((Integer) value).intValue());
                    break;
                } else {
                    unsetIs_new_user();
                    break;
                }
            case 3:
                if (value != null) {
                    setEmail((String) value);
                    break;
                } else {
                    unsetEmail();
                    break;
                }
            case 4:
                if (value != null) {
                    setPublic_key((String) value);
                    break;
                } else {
                    unsetPublic_key();
                    break;
                }
            case 5:
                if (value != null) {
                    setLast_device((String) value);
                    break;
                } else {
                    unsetLast_device();
                    break;
                }
            case 6:
                if (value != null) {
                    setUnique_id(((Long) value).longValue());
                    break;
                } else {
                    unsetUnique_id();
                    break;
                }
            case 7:
                if (value != null) {
                    setPhone((String) value);
                    break;
                } else {
                    unsetPhone();
                    break;
                }
            case 8:
                if (value != null) {
                    setForce_bind_phone(((Integer) value).intValue());
                    break;
                } else {
                    unsetForce_bind_phone();
                    break;
                }
            case 9:
                if (value != null) {
                    setRole_new(((Integer) value).intValue());
                    break;
                } else {
                    unsetRole_new();
                    break;
                }
            case 10:
                if (value != null) {
                    setRole((RoleInfo) value);
                    break;
                } else {
                    unsetRole();
                    break;
                }
            case 11:
                if (value != null) {
                    setGame_mode(((Integer) value).intValue());
                    break;
                } else {
                    unsetGame_mode();
                    break;
                }
        }
    }

    public boolean equals(UserLoginResult that) {
        if (that == null) {
            return false;
        }
        boolean isSetAccess_token = isSetAccess_token();
        boolean isSetAccess_token2 = that.isSetAccess_token();
        if (((isSetAccess_token || isSetAccess_token2) && !(isSetAccess_token && isSetAccess_token2 && this.access_token.equals(that.access_token))) || this.is_new_user != that.is_new_user) {
            return false;
        }
        boolean isSetEmail = isSetEmail();
        boolean isSetEmail2 = that.isSetEmail();
        if ((isSetEmail || isSetEmail2) && !(isSetEmail && isSetEmail2 && this.email.equals(that.email))) {
            return false;
        }
        boolean isSetPublic_key = isSetPublic_key();
        boolean isSetPublic_key2 = that.isSetPublic_key();
        if ((isSetPublic_key || isSetPublic_key2) && !(isSetPublic_key && isSetPublic_key2 && this.public_key.equals(that.public_key))) {
            return false;
        }
        boolean isSetLast_device = isSetLast_device();
        boolean isSetLast_device2 = that.isSetLast_device();
        if (((isSetLast_device || isSetLast_device2) && !(isSetLast_device && isSetLast_device2 && this.last_device.equals(that.last_device))) || this.unique_id != that.unique_id) {
            return false;
        }
        boolean isSetPhone = isSetPhone();
        boolean isSetPhone2 = that.isSetPhone();
        if ((isSetPhone || isSetPhone2) && !(isSetPhone && isSetPhone2 && this.phone.equals(that.phone))) {
            return false;
        }
        boolean isSetForce_bind_phone = isSetForce_bind_phone();
        boolean isSetForce_bind_phone2 = that.isSetForce_bind_phone();
        if ((isSetForce_bind_phone || isSetForce_bind_phone2) && !(isSetForce_bind_phone && isSetForce_bind_phone2 && this.force_bind_phone == that.force_bind_phone)) {
            return false;
        }
        boolean isSetRole_new = isSetRole_new();
        boolean isSetRole_new2 = that.isSetRole_new();
        if ((isSetRole_new || isSetRole_new2) && !(isSetRole_new && isSetRole_new2 && this.role_new == that.role_new)) {
            return false;
        }
        boolean isSetRole = isSetRole();
        boolean isSetRole2 = that.isSetRole();
        if ((isSetRole || isSetRole2) && !(isSetRole && isSetRole2 && this.role.equals(that.role))) {
            return false;
        }
        boolean isSetGame_mode = isSetGame_mode();
        boolean isSetGame_mode2 = that.isSetGame_mode();
        if (isSetGame_mode || isSetGame_mode2) {
            return isSetGame_mode && isSetGame_mode2 && this.game_mode == that.game_mode;
        }
        return true;
    }

    public UserLoginResult(String access_token, int is_new_user, String email, String public_key, String last_device, long unique_id) {
        this();
        this.access_token = access_token;
        this.is_new_user = is_new_user;
        setIs_new_userIsSet(true);
        this.email = email;
        this.public_key = public_key;
        this.last_device = last_device;
        this.unique_id = unique_id;
        setUnique_idIsSet(true);
    }

    public UserLoginResult(UserLoginResult other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.PHONE, _Fields.FORCE_BIND_PHONE, _Fields.ROLE_NEW, _Fields.ROLE, _Fields.GAME_MODE};
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetAccess_token()) {
            this.access_token = other.access_token;
        }
        this.is_new_user = other.is_new_user;
        if (other.isSetEmail()) {
            this.email = other.email;
        }
        if (other.isSetPublic_key()) {
            this.public_key = other.public_key;
        }
        if (other.isSetLast_device()) {
            this.last_device = other.last_device;
        }
        this.unique_id = other.unique_id;
        if (other.isSetPhone()) {
            this.phone = other.phone;
        }
        this.force_bind_phone = other.force_bind_phone;
        this.role_new = other.role_new;
        if (other.isSetRole()) {
            this.role = new RoleInfo(other.role);
        }
        this.game_mode = other.game_mode;
    }
}
