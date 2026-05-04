package com.baicizhan.online.bcz_system_api;

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
public class BczAppSwitch implements TBase<BczAppSwitch, _Fields>, Serializable, Cloneable, Comparable<BczAppSwitch> {
    private static final int __ALLOW_FAST_LOGIN_ISSET_ID = 1;
    private static final int __ALLOW_TRY_USER_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public boolean allow_fast_login;
    public boolean allow_try_user;
    private static final TStruct STRUCT_DESC = new TStruct("BczAppSwitch");
    private static final TField ALLOW_TRY_USER_FIELD_DESC = new TField("allow_try_user", (byte) 2, 1);
    private static final TField ALLOW_FAST_LOGIN_FIELD_DESC = new TField("allow_fast_login", (byte) 2, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bcz_system_api.BczAppSwitch$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$BczAppSwitch$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bcz_system_api$BczAppSwitch$_Fields = iArr;
            try {
                iArr[_Fields.ALLOW_TRY_USER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczAppSwitch$_Fields[_Fields.ALLOW_FAST_LOGIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BczAppSwitchStandardScheme extends StandardScheme<BczAppSwitch> {
        private BczAppSwitchStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BczAppSwitch struct) throws TException {
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
                    } else if (b11 == 2) {
                        struct.allow_fast_login = iprot.readBool();
                        struct.setAllow_fast_loginIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 2) {
                    struct.allow_try_user = iprot.readBool();
                    struct.setAllow_try_userIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetAllow_try_user()) {
                throw new TProtocolException("Required field 'allow_try_user' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetAllow_fast_login()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'allow_fast_login' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BczAppSwitch struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BczAppSwitch.STRUCT_DESC);
            oprot.writeFieldBegin(BczAppSwitch.ALLOW_TRY_USER_FIELD_DESC);
            oprot.writeBool(struct.allow_try_user);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(BczAppSwitch.ALLOW_FAST_LOGIN_FIELD_DESC);
            oprot.writeBool(struct.allow_fast_login);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BczAppSwitchStandardSchemeFactory implements SchemeFactory {
        private BczAppSwitchStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BczAppSwitchStandardScheme getScheme() {
            return new BczAppSwitchStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BczAppSwitchTupleScheme extends TupleScheme<BczAppSwitch> {
        private BczAppSwitchTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BczAppSwitch struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.allow_try_user = tTupleProtocol.readBool();
            struct.setAllow_try_userIsSet(true);
            struct.allow_fast_login = tTupleProtocol.readBool();
            struct.setAllow_fast_loginIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BczAppSwitch struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeBool(struct.allow_try_user);
            tTupleProtocol.writeBool(struct.allow_fast_login);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BczAppSwitchTupleSchemeFactory implements SchemeFactory {
        private BczAppSwitchTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BczAppSwitchTupleScheme getScheme() {
            return new BczAppSwitchTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ALLOW_TRY_USER(1, "allow_try_user"),
        ALLOW_FAST_LOGIN(2, "allow_fast_login");

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
                return ALLOW_TRY_USER;
            }
            if (fieldId != 2) {
                return null;
            }
            return ALLOW_FAST_LOGIN;
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
        hashMap.put(StandardScheme.class, new BczAppSwitchStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BczAppSwitchTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ALLOW_TRY_USER, (_Fields) new FieldMetaData("allow_try_user", (byte) 1, new FieldValueMetaData((byte) 2)));
        enumMap.put((EnumMap) _Fields.ALLOW_FAST_LOGIN, (_Fields) new FieldMetaData("allow_fast_login", (byte) 1, new FieldValueMetaData((byte) 2)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BczAppSwitch.class, unmodifiableMap);
    }

    public BczAppSwitch() {
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
        setAllow_try_userIsSet(false);
        this.allow_try_user = false;
        setAllow_fast_loginIsSet(false);
        this.allow_fast_login = false;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BczAppSwitch)) {
            return equals((BczAppSwitch) that);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isAllow_fast_login() {
        return this.allow_fast_login;
    }

    public boolean isAllow_try_user() {
        return this.allow_try_user;
    }

    public boolean isSetAllow_fast_login() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetAllow_try_user() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BczAppSwitch setAllow_fast_login(boolean allow_fast_login) {
        this.allow_fast_login = allow_fast_login;
        setAllow_fast_loginIsSet(true);
        return this;
    }

    public void setAllow_fast_loginIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public BczAppSwitch setAllow_try_user(boolean allow_try_user) {
        this.allow_try_user = allow_try_user;
        setAllow_try_userIsSet(true);
        return this;
    }

    public void setAllow_try_userIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        return "BczAppSwitch(allow_try_user:" + this.allow_try_user + j2.O + "allow_fast_login:" + this.allow_fast_login + pn.j.f81007d;
    }

    public void unsetAllow_fast_login() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetAllow_try_user() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BczAppSwitch other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetAllow_try_user()).compareTo(Boolean.valueOf(other.isSetAllow_try_user()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetAllow_try_user() && (compareTo2 = TBaseHelper.compareTo(this.allow_try_user, other.allow_try_user)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetAllow_fast_login()).compareTo(Boolean.valueOf(other.isSetAllow_fast_login()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetAllow_fast_login() || (compareTo = TBaseHelper.compareTo(this.allow_fast_login, other.allow_fast_login)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BczAppSwitch, _Fields> deepCopy2() {
        return new BczAppSwitch(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczAppSwitch$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Boolean.valueOf(isAllow_try_user());
        }
        if (i11 == 2) {
            return Boolean.valueOf(isAllow_fast_login());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczAppSwitch$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetAllow_try_user();
        }
        if (i11 == 2) {
            return isSetAllow_fast_login();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczAppSwitch$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetAllow_try_user();
                return;
            } else {
                setAllow_try_user(((Boolean) value).booleanValue());
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetAllow_fast_login();
        } else {
            setAllow_fast_login(((Boolean) value).booleanValue());
        }
    }

    public BczAppSwitch(boolean allow_try_user, boolean allow_fast_login) {
        this();
        this.allow_try_user = allow_try_user;
        setAllow_try_userIsSet(true);
        this.allow_fast_login = allow_fast_login;
        setAllow_fast_loginIsSet(true);
    }

    public boolean equals(BczAppSwitch that) {
        return that != null && this.allow_try_user == that.allow_try_user && this.allow_fast_login == that.allow_fast_login;
    }

    public BczAppSwitch(BczAppSwitch other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.allow_try_user = other.allow_try_user;
        this.allow_fast_login = other.allow_fast_login;
    }

    public void validate() throws TException {
    }
}
