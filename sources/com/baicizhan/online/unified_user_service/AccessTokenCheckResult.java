package com.baicizhan.online.unified_user_service;

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
/* loaded from: classes6.dex */
public class AccessTokenCheckResult implements TBase<AccessTokenCheckResult, _Fields>, Serializable, Cloneable, Comparable<AccessTokenCheckResult> {
    private static final int __IS_NEW_USER_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String access_token;
    public int is_new_user;
    public String last_device;
    private static final TStruct STRUCT_DESC = new TStruct("AccessTokenCheckResult");
    private static final TField ACCESS_TOKEN_FIELD_DESC = new TField("access_token", (byte) 11, 1);
    private static final TField LAST_DEVICE_FIELD_DESC = new TField("last_device", (byte) 11, 2);
    private static final TField IS_NEW_USER_FIELD_DESC = new TField("is_new_user", (byte) 8, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.unified_user_service.AccessTokenCheckResult$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$unified_user_service$AccessTokenCheckResult$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$unified_user_service$AccessTokenCheckResult$_Fields = iArr;
            try {
                iArr[_Fields.ACCESS_TOKEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$AccessTokenCheckResult$_Fields[_Fields.LAST_DEVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$AccessTokenCheckResult$_Fields[_Fields.IS_NEW_USER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AccessTokenCheckResultStandardScheme extends StandardScheme<AccessTokenCheckResult> {
        private AccessTokenCheckResultStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, AccessTokenCheckResult struct) throws TException {
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
                            struct.is_new_user = iprot.readI32();
                            struct.setIs_new_userIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.last_device = iprot.readString();
                        struct.setLast_deviceIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.access_token = iprot.readString();
                    struct.setAccess_tokenIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetIs_new_user()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'is_new_user' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, AccessTokenCheckResult struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(AccessTokenCheckResult.STRUCT_DESC);
            if (struct.access_token != null) {
                oprot.writeFieldBegin(AccessTokenCheckResult.ACCESS_TOKEN_FIELD_DESC);
                oprot.writeString(struct.access_token);
                oprot.writeFieldEnd();
            }
            if (struct.last_device != null) {
                oprot.writeFieldBegin(AccessTokenCheckResult.LAST_DEVICE_FIELD_DESC);
                oprot.writeString(struct.last_device);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(AccessTokenCheckResult.IS_NEW_USER_FIELD_DESC);
            oprot.writeI32(struct.is_new_user);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AccessTokenCheckResultStandardSchemeFactory implements SchemeFactory {
        private AccessTokenCheckResultStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AccessTokenCheckResultStandardScheme getScheme() {
            return new AccessTokenCheckResultStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AccessTokenCheckResultTupleScheme extends TupleScheme<AccessTokenCheckResult> {
        private AccessTokenCheckResultTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, AccessTokenCheckResult struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.access_token = tTupleProtocol.readString();
            struct.setAccess_tokenIsSet(true);
            struct.last_device = tTupleProtocol.readString();
            struct.setLast_deviceIsSet(true);
            struct.is_new_user = tTupleProtocol.readI32();
            struct.setIs_new_userIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, AccessTokenCheckResult struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.access_token);
            tTupleProtocol.writeString(struct.last_device);
            tTupleProtocol.writeI32(struct.is_new_user);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AccessTokenCheckResultTupleSchemeFactory implements SchemeFactory {
        private AccessTokenCheckResultTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AccessTokenCheckResultTupleScheme getScheme() {
            return new AccessTokenCheckResultTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ACCESS_TOKEN(1, "access_token"),
        LAST_DEVICE(2, "last_device"),
        IS_NEW_USER(3, "is_new_user");

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
                return ACCESS_TOKEN;
            }
            if (fieldId == 2) {
                return LAST_DEVICE;
            }
            if (fieldId != 3) {
                return null;
            }
            return IS_NEW_USER;
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
        hashMap.put(StandardScheme.class, new AccessTokenCheckResultStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new AccessTokenCheckResultTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ACCESS_TOKEN, (_Fields) new FieldMetaData("access_token", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.LAST_DEVICE, (_Fields) new FieldMetaData("last_device", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.IS_NEW_USER, (_Fields) new FieldMetaData("is_new_user", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(AccessTokenCheckResult.class, unmodifiableMap);
    }

    public AccessTokenCheckResult() {
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
        this.access_token = null;
        this.last_device = null;
        setIs_new_userIsSet(false);
        this.is_new_user = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof AccessTokenCheckResult)) {
            return equals((AccessTokenCheckResult) that);
        }
        return false;
    }

    public String getAccess_token() {
        return this.access_token;
    }

    public int getIs_new_user() {
        return this.is_new_user;
    }

    public String getLast_device() {
        return this.last_device;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAccess_token() {
        return this.access_token != null;
    }

    public boolean isSetIs_new_user() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetLast_device() {
        return this.last_device != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public AccessTokenCheckResult setAccess_token(String access_token) {
        this.access_token = access_token;
        return this;
    }

    public void setAccess_tokenIsSet(boolean value) {
        if (value) {
            return;
        }
        this.access_token = null;
    }

    public AccessTokenCheckResult setIs_new_user(int is_new_user) {
        this.is_new_user = is_new_user;
        setIs_new_userIsSet(true);
        return this;
    }

    public void setIs_new_userIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public AccessTokenCheckResult setLast_device(String last_device) {
        this.last_device = last_device;
        return this;
    }

    public void setLast_deviceIsSet(boolean value) {
        if (value) {
            return;
        }
        this.last_device = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AccessTokenCheckResult(");
        sb2.append("access_token:");
        String str = this.access_token;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("last_device:");
        String str2 = this.last_device;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("is_new_user:");
        sb2.append(this.is_new_user);
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAccess_token() {
        this.access_token = null;
    }

    public void unsetIs_new_user() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetLast_device() {
        this.last_device = null;
    }

    public void validate() throws TException {
        if (this.access_token == null) {
            throw new TProtocolException("Required field 'access_token' was not present! Struct: " + toString());
        }
        if (this.last_device != null) {
            return;
        }
        throw new TProtocolException("Required field 'last_device' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(AccessTokenCheckResult other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetAccess_token()).compareTo(Boolean.valueOf(other.isSetAccess_token()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetAccess_token() && (compareTo3 = TBaseHelper.compareTo(this.access_token, other.access_token)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetLast_device()).compareTo(Boolean.valueOf(other.isSetLast_device()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetLast_device() && (compareTo2 = TBaseHelper.compareTo(this.last_device, other.last_device)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetIs_new_user()).compareTo(Boolean.valueOf(other.isSetIs_new_user()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetIs_new_user() || (compareTo = TBaseHelper.compareTo(this.is_new_user, other.is_new_user)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<AccessTokenCheckResult, _Fields> deepCopy2() {
        return new AccessTokenCheckResult(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$AccessTokenCheckResult$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getAccess_token();
        }
        if (i11 == 2) {
            return getLast_device();
        }
        if (i11 == 3) {
            return Integer.valueOf(getIs_new_user());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$AccessTokenCheckResult$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetAccess_token();
        }
        if (i11 == 2) {
            return isSetLast_device();
        }
        if (i11 == 3) {
            return isSetIs_new_user();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$AccessTokenCheckResult$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetAccess_token();
                return;
            } else {
                setAccess_token((String) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetLast_device();
                return;
            } else {
                setLast_device((String) value);
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetIs_new_user();
        } else {
            setIs_new_user(((Integer) value).intValue());
        }
    }

    public AccessTokenCheckResult(String access_token, String last_device, int is_new_user) {
        this();
        this.access_token = access_token;
        this.last_device = last_device;
        this.is_new_user = is_new_user;
        setIs_new_userIsSet(true);
    }

    public boolean equals(AccessTokenCheckResult that) {
        if (that == null) {
            return false;
        }
        boolean isSetAccess_token = isSetAccess_token();
        boolean isSetAccess_token2 = that.isSetAccess_token();
        if ((isSetAccess_token || isSetAccess_token2) && !(isSetAccess_token && isSetAccess_token2 && this.access_token.equals(that.access_token))) {
            return false;
        }
        boolean isSetLast_device = isSetLast_device();
        boolean isSetLast_device2 = that.isSetLast_device();
        return (!(isSetLast_device || isSetLast_device2) || (isSetLast_device && isSetLast_device2 && this.last_device.equals(that.last_device))) && this.is_new_user == that.is_new_user;
    }

    public AccessTokenCheckResult(AccessTokenCheckResult other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetAccess_token()) {
            this.access_token = other.access_token;
        }
        if (other.isSetLast_device()) {
            this.last_device = other.last_device;
        }
        this.is_new_user = other.is_new_user;
    }
}
