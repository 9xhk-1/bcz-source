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
public class AppleLoginRequest implements TBase<AppleLoginRequest, _Fields>, Serializable, Cloneable, Comparable<AppleLoginRequest> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public String authorizationCode;
    public String bundleID;
    public String device;
    public String identityToken;
    public String name;
    private _Fields[] optionals;
    public String user;
    private static final TStruct STRUCT_DESC = new TStruct("AppleLoginRequest");
    private static final TField USER_FIELD_DESC = new TField("user", (byte) 11, 1);
    private static final TField IDENTITY_TOKEN_FIELD_DESC = new TField("identityToken", (byte) 11, 2);
    private static final TField AUTHORIZATION_CODE_FIELD_DESC = new TField("authorizationCode", (byte) 11, 3);
    private static final TField NAME_FIELD_DESC = new TField("name", (byte) 11, 4);
    private static final TField DEVICE_FIELD_DESC = new TField("device", (byte) 11, 5);
    private static final TField BUNDLE_ID_FIELD_DESC = new TField("bundleID", (byte) 11, 6);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.unified_user_service.AppleLoginRequest$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$unified_user_service$AppleLoginRequest$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$unified_user_service$AppleLoginRequest$_Fields = iArr;
            try {
                iArr[_Fields.USER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$AppleLoginRequest$_Fields[_Fields.IDENTITY_TOKEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$AppleLoginRequest$_Fields[_Fields.AUTHORIZATION_CODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$AppleLoginRequest$_Fields[_Fields.NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$AppleLoginRequest$_Fields[_Fields.DEVICE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$AppleLoginRequest$_Fields[_Fields.BUNDLE_ID.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AppleLoginRequestStandardScheme extends StandardScheme<AppleLoginRequest> {
        private AppleLoginRequestStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, AppleLoginRequest struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    struct.validate();
                    return;
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.user = iprot.readString();
                            struct.setUserIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.identityToken = iprot.readString();
                            struct.setIdentityTokenIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.authorizationCode = iprot.readString();
                            struct.setAuthorizationCodeIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.name = iprot.readString();
                            struct.setNameIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.device = iprot.readString();
                            struct.setDeviceIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.bundleID = iprot.readString();
                            struct.setBundleIDIsSet(true);
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
        public void write(TProtocol oprot, AppleLoginRequest struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(AppleLoginRequest.STRUCT_DESC);
            if (struct.user != null) {
                oprot.writeFieldBegin(AppleLoginRequest.USER_FIELD_DESC);
                oprot.writeString(struct.user);
                oprot.writeFieldEnd();
            }
            if (struct.identityToken != null) {
                oprot.writeFieldBegin(AppleLoginRequest.IDENTITY_TOKEN_FIELD_DESC);
                oprot.writeString(struct.identityToken);
                oprot.writeFieldEnd();
            }
            if (struct.authorizationCode != null) {
                oprot.writeFieldBegin(AppleLoginRequest.AUTHORIZATION_CODE_FIELD_DESC);
                oprot.writeString(struct.authorizationCode);
                oprot.writeFieldEnd();
            }
            if (struct.name != null) {
                oprot.writeFieldBegin(AppleLoginRequest.NAME_FIELD_DESC);
                oprot.writeString(struct.name);
                oprot.writeFieldEnd();
            }
            if (struct.device != null && struct.isSetDevice()) {
                oprot.writeFieldBegin(AppleLoginRequest.DEVICE_FIELD_DESC);
                oprot.writeString(struct.device);
                oprot.writeFieldEnd();
            }
            if (struct.bundleID != null && struct.isSetBundleID()) {
                oprot.writeFieldBegin(AppleLoginRequest.BUNDLE_ID_FIELD_DESC);
                oprot.writeString(struct.bundleID);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AppleLoginRequestStandardSchemeFactory implements SchemeFactory {
        private AppleLoginRequestStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AppleLoginRequestStandardScheme getScheme() {
            return new AppleLoginRequestStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AppleLoginRequestTupleScheme extends TupleScheme<AppleLoginRequest> {
        private AppleLoginRequestTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, AppleLoginRequest struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.user = tTupleProtocol.readString();
            struct.setUserIsSet(true);
            struct.identityToken = tTupleProtocol.readString();
            struct.setIdentityTokenIsSet(true);
            struct.authorizationCode = tTupleProtocol.readString();
            struct.setAuthorizationCodeIsSet(true);
            struct.name = tTupleProtocol.readString();
            struct.setNameIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(2);
            if (readBitSet.get(0)) {
                struct.device = tTupleProtocol.readString();
                struct.setDeviceIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.bundleID = tTupleProtocol.readString();
                struct.setBundleIDIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, AppleLoginRequest struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.user);
            tTupleProtocol.writeString(struct.identityToken);
            tTupleProtocol.writeString(struct.authorizationCode);
            tTupleProtocol.writeString(struct.name);
            BitSet bitSet = new BitSet();
            if (struct.isSetDevice()) {
                bitSet.set(0);
            }
            if (struct.isSetBundleID()) {
                bitSet.set(1);
            }
            tTupleProtocol.writeBitSet(bitSet, 2);
            if (struct.isSetDevice()) {
                tTupleProtocol.writeString(struct.device);
            }
            if (struct.isSetBundleID()) {
                tTupleProtocol.writeString(struct.bundleID);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AppleLoginRequestTupleSchemeFactory implements SchemeFactory {
        private AppleLoginRequestTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AppleLoginRequestTupleScheme getScheme() {
            return new AppleLoginRequestTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        USER(1, "user"),
        IDENTITY_TOKEN(2, "identityToken"),
        AUTHORIZATION_CODE(3, "authorizationCode"),
        NAME(4, "name"),
        DEVICE(5, "device"),
        BUNDLE_ID(6, "bundleID");

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
                    return USER;
                case 2:
                    return IDENTITY_TOKEN;
                case 3:
                    return AUTHORIZATION_CODE;
                case 4:
                    return NAME;
                case 5:
                    return DEVICE;
                case 6:
                    return BUNDLE_ID;
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
        hashMap.put(StandardScheme.class, new AppleLoginRequestStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new AppleLoginRequestTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.USER, (_Fields) new FieldMetaData("user", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.IDENTITY_TOKEN, (_Fields) new FieldMetaData("identityToken", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.AUTHORIZATION_CODE, (_Fields) new FieldMetaData("authorizationCode", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.NAME, (_Fields) new FieldMetaData("name", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.DEVICE, (_Fields) new FieldMetaData("device", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.BUNDLE_ID, (_Fields) new FieldMetaData("bundleID", (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(AppleLoginRequest.class, unmodifiableMap);
    }

    public AppleLoginRequest() {
        this.optionals = new _Fields[]{_Fields.DEVICE, _Fields.BUNDLE_ID};
    }

    private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
        try {
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
        this.user = null;
        this.identityToken = null;
        this.authorizationCode = null;
        this.name = null;
        this.device = null;
        this.bundleID = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof AppleLoginRequest)) {
            return equals((AppleLoginRequest) that);
        }
        return false;
    }

    public String getAuthorizationCode() {
        return this.authorizationCode;
    }

    public String getBundleID() {
        return this.bundleID;
    }

    public String getDevice() {
        return this.device;
    }

    public String getIdentityToken() {
        return this.identityToken;
    }

    public String getName() {
        return this.name;
    }

    public String getUser() {
        return this.user;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAuthorizationCode() {
        return this.authorizationCode != null;
    }

    public boolean isSetBundleID() {
        return this.bundleID != null;
    }

    public boolean isSetDevice() {
        return this.device != null;
    }

    public boolean isSetIdentityToken() {
        return this.identityToken != null;
    }

    public boolean isSetName() {
        return this.name != null;
    }

    public boolean isSetUser() {
        return this.user != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public AppleLoginRequest setAuthorizationCode(String authorizationCode) {
        this.authorizationCode = authorizationCode;
        return this;
    }

    public void setAuthorizationCodeIsSet(boolean value) {
        if (value) {
            return;
        }
        this.authorizationCode = null;
    }

    public AppleLoginRequest setBundleID(String bundleID) {
        this.bundleID = bundleID;
        return this;
    }

    public void setBundleIDIsSet(boolean value) {
        if (value) {
            return;
        }
        this.bundleID = null;
    }

    public AppleLoginRequest setDevice(String device) {
        this.device = device;
        return this;
    }

    public void setDeviceIsSet(boolean value) {
        if (value) {
            return;
        }
        this.device = null;
    }

    public AppleLoginRequest setIdentityToken(String identityToken) {
        this.identityToken = identityToken;
        return this;
    }

    public void setIdentityTokenIsSet(boolean value) {
        if (value) {
            return;
        }
        this.identityToken = null;
    }

    public AppleLoginRequest setName(String name) {
        this.name = name;
        return this;
    }

    public void setNameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.name = null;
    }

    public AppleLoginRequest setUser(String user) {
        this.user = user;
        return this;
    }

    public void setUserIsSet(boolean value) {
        if (value) {
            return;
        }
        this.user = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AppleLoginRequest(");
        sb2.append("user:");
        String str = this.user;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("identityToken:");
        String str2 = this.identityToken;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("authorizationCode:");
        String str3 = this.authorizationCode;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(j2.O);
        sb2.append("name:");
        String str4 = this.name;
        if (str4 == null) {
            sb2.append("null");
        } else {
            sb2.append(str4);
        }
        if (isSetDevice()) {
            sb2.append(j2.O);
            sb2.append("device:");
            String str5 = this.device;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        if (isSetBundleID()) {
            sb2.append(j2.O);
            sb2.append("bundleID:");
            String str6 = this.bundleID;
            if (str6 == null) {
                sb2.append("null");
            } else {
                sb2.append(str6);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAuthorizationCode() {
        this.authorizationCode = null;
    }

    public void unsetBundleID() {
        this.bundleID = null;
    }

    public void unsetDevice() {
        this.device = null;
    }

    public void unsetIdentityToken() {
        this.identityToken = null;
    }

    public void unsetName() {
        this.name = null;
    }

    public void unsetUser() {
        this.user = null;
    }

    public void validate() throws TException {
        if (this.user == null) {
            throw new TProtocolException("Required field 'user' was not present! Struct: " + toString());
        }
        if (this.identityToken == null) {
            throw new TProtocolException("Required field 'identityToken' was not present! Struct: " + toString());
        }
        if (this.authorizationCode == null) {
            throw new TProtocolException("Required field 'authorizationCode' was not present! Struct: " + toString());
        }
        if (this.name != null) {
            return;
        }
        throw new TProtocolException("Required field 'name' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(AppleLoginRequest other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo7 = Boolean.valueOf(isSetUser()).compareTo(Boolean.valueOf(other.isSetUser()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetUser() && (compareTo6 = TBaseHelper.compareTo(this.user, other.user)) != 0) {
            return compareTo6;
        }
        int compareTo8 = Boolean.valueOf(isSetIdentityToken()).compareTo(Boolean.valueOf(other.isSetIdentityToken()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetIdentityToken() && (compareTo5 = TBaseHelper.compareTo(this.identityToken, other.identityToken)) != 0) {
            return compareTo5;
        }
        int compareTo9 = Boolean.valueOf(isSetAuthorizationCode()).compareTo(Boolean.valueOf(other.isSetAuthorizationCode()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetAuthorizationCode() && (compareTo4 = TBaseHelper.compareTo(this.authorizationCode, other.authorizationCode)) != 0) {
            return compareTo4;
        }
        int compareTo10 = Boolean.valueOf(isSetName()).compareTo(Boolean.valueOf(other.isSetName()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetName() && (compareTo3 = TBaseHelper.compareTo(this.name, other.name)) != 0) {
            return compareTo3;
        }
        int compareTo11 = Boolean.valueOf(isSetDevice()).compareTo(Boolean.valueOf(other.isSetDevice()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetDevice() && (compareTo2 = TBaseHelper.compareTo(this.device, other.device)) != 0) {
            return compareTo2;
        }
        int compareTo12 = Boolean.valueOf(isSetBundleID()).compareTo(Boolean.valueOf(other.isSetBundleID()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (!isSetBundleID() || (compareTo = TBaseHelper.compareTo(this.bundleID, other.bundleID)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<AppleLoginRequest, _Fields> deepCopy2() {
        return new AppleLoginRequest(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$AppleLoginRequest$_Fields[field.ordinal()]) {
            case 1:
                return getUser();
            case 2:
                return getIdentityToken();
            case 3:
                return getAuthorizationCode();
            case 4:
                return getName();
            case 5:
                return getDevice();
            case 6:
                return getBundleID();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$AppleLoginRequest$_Fields[field.ordinal()]) {
            case 1:
                return isSetUser();
            case 2:
                return isSetIdentityToken();
            case 3:
                return isSetAuthorizationCode();
            case 4:
                return isSetName();
            case 5:
                return isSetDevice();
            case 6:
                return isSetBundleID();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$AppleLoginRequest$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setUser((String) value);
                    break;
                } else {
                    unsetUser();
                    break;
                }
            case 2:
                if (value != null) {
                    setIdentityToken((String) value);
                    break;
                } else {
                    unsetIdentityToken();
                    break;
                }
            case 3:
                if (value != null) {
                    setAuthorizationCode((String) value);
                    break;
                } else {
                    unsetAuthorizationCode();
                    break;
                }
            case 4:
                if (value != null) {
                    setName((String) value);
                    break;
                } else {
                    unsetName();
                    break;
                }
            case 5:
                if (value != null) {
                    setDevice((String) value);
                    break;
                } else {
                    unsetDevice();
                    break;
                }
            case 6:
                if (value != null) {
                    setBundleID((String) value);
                    break;
                } else {
                    unsetBundleID();
                    break;
                }
        }
    }

    public AppleLoginRequest(String user, String identityToken, String authorizationCode, String name) {
        this();
        this.user = user;
        this.identityToken = identityToken;
        this.authorizationCode = authorizationCode;
        this.name = name;
    }

    public boolean equals(AppleLoginRequest that) {
        if (that == null) {
            return false;
        }
        boolean isSetUser = isSetUser();
        boolean isSetUser2 = that.isSetUser();
        if ((isSetUser || isSetUser2) && !(isSetUser && isSetUser2 && this.user.equals(that.user))) {
            return false;
        }
        boolean isSetIdentityToken = isSetIdentityToken();
        boolean isSetIdentityToken2 = that.isSetIdentityToken();
        if ((isSetIdentityToken || isSetIdentityToken2) && !(isSetIdentityToken && isSetIdentityToken2 && this.identityToken.equals(that.identityToken))) {
            return false;
        }
        boolean isSetAuthorizationCode = isSetAuthorizationCode();
        boolean isSetAuthorizationCode2 = that.isSetAuthorizationCode();
        if ((isSetAuthorizationCode || isSetAuthorizationCode2) && !(isSetAuthorizationCode && isSetAuthorizationCode2 && this.authorizationCode.equals(that.authorizationCode))) {
            return false;
        }
        boolean isSetName = isSetName();
        boolean isSetName2 = that.isSetName();
        if ((isSetName || isSetName2) && !(isSetName && isSetName2 && this.name.equals(that.name))) {
            return false;
        }
        boolean isSetDevice = isSetDevice();
        boolean isSetDevice2 = that.isSetDevice();
        if ((isSetDevice || isSetDevice2) && !(isSetDevice && isSetDevice2 && this.device.equals(that.device))) {
            return false;
        }
        boolean isSetBundleID = isSetBundleID();
        boolean isSetBundleID2 = that.isSetBundleID();
        if (isSetBundleID || isSetBundleID2) {
            return isSetBundleID && isSetBundleID2 && this.bundleID.equals(that.bundleID);
        }
        return true;
    }

    public AppleLoginRequest(AppleLoginRequest other) {
        this.optionals = new _Fields[]{_Fields.DEVICE, _Fields.BUNDLE_ID};
        if (other.isSetUser()) {
            this.user = other.user;
        }
        if (other.isSetIdentityToken()) {
            this.identityToken = other.identityToken;
        }
        if (other.isSetAuthorizationCode()) {
            this.authorizationCode = other.authorizationCode;
        }
        if (other.isSetName()) {
            this.name = other.name;
        }
        if (other.isSetDevice()) {
            this.device = other.device;
        }
        if (other.isSetBundleID()) {
            this.bundleID = other.bundleID;
        }
    }
}
