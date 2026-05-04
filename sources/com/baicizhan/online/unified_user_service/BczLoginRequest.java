package com.baicizhan.online.unified_user_service;

import androidx.autofill.HintConstants;
import com.baicizhan.main.auth.AccountVerificationActivity;
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
public class BczLoginRequest implements TBase<BczLoginRequest, _Fields>, Serializable, Cloneable, Comparable<BczLoginRequest> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public String account;
    public String code;
    public String device;
    private _Fields[] optionals;
    public String password;
    private static final TStruct STRUCT_DESC = new TStruct("BczLoginRequest");
    private static final TField ACCOUNT_FIELD_DESC = new TField(AccountVerificationActivity.f19910x, (byte) 11, 1);
    private static final TField PASSWORD_FIELD_DESC = new TField(HintConstants.AUTOFILL_HINT_PASSWORD, (byte) 11, 2);
    private static final TField DEVICE_FIELD_DESC = new TField("device", (byte) 11, 3);
    private static final TField CODE_FIELD_DESC = new TField("code", (byte) 11, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.unified_user_service.BczLoginRequest$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$unified_user_service$BczLoginRequest$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$unified_user_service$BczLoginRequest$_Fields = iArr;
            try {
                iArr[_Fields.ACCOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$BczLoginRequest$_Fields[_Fields.PASSWORD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$BczLoginRequest$_Fields[_Fields.DEVICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$BczLoginRequest$_Fields[_Fields.CODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BczLoginRequestStandardScheme extends StandardScheme<BczLoginRequest> {
        private BczLoginRequestStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BczLoginRequest struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    struct.validate();
                    return;
                }
                short s11 = readFieldBegin.f77768id;
                if (s11 != 1) {
                    if (s11 != 2) {
                        if (s11 != 3) {
                            if (s11 != 4) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 11) {
                                struct.code = iprot.readString();
                                struct.setCodeIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 11) {
                            struct.device = iprot.readString();
                            struct.setDeviceIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.password = iprot.readString();
                        struct.setPasswordIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.account = iprot.readString();
                    struct.setAccountIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BczLoginRequest struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BczLoginRequest.STRUCT_DESC);
            if (struct.account != null) {
                oprot.writeFieldBegin(BczLoginRequest.ACCOUNT_FIELD_DESC);
                oprot.writeString(struct.account);
                oprot.writeFieldEnd();
            }
            if (struct.password != null) {
                oprot.writeFieldBegin(BczLoginRequest.PASSWORD_FIELD_DESC);
                oprot.writeString(struct.password);
                oprot.writeFieldEnd();
            }
            if (struct.device != null && struct.isSetDevice()) {
                oprot.writeFieldBegin(BczLoginRequest.DEVICE_FIELD_DESC);
                oprot.writeString(struct.device);
                oprot.writeFieldEnd();
            }
            if (struct.code != null && struct.isSetCode()) {
                oprot.writeFieldBegin(BczLoginRequest.CODE_FIELD_DESC);
                oprot.writeString(struct.code);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BczLoginRequestStandardSchemeFactory implements SchemeFactory {
        private BczLoginRequestStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BczLoginRequestStandardScheme getScheme() {
            return new BczLoginRequestStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BczLoginRequestTupleScheme extends TupleScheme<BczLoginRequest> {
        private BczLoginRequestTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BczLoginRequest struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.account = tTupleProtocol.readString();
            struct.setAccountIsSet(true);
            struct.password = tTupleProtocol.readString();
            struct.setPasswordIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(2);
            if (readBitSet.get(0)) {
                struct.device = tTupleProtocol.readString();
                struct.setDeviceIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.code = tTupleProtocol.readString();
                struct.setCodeIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BczLoginRequest struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.account);
            tTupleProtocol.writeString(struct.password);
            BitSet bitSet = new BitSet();
            if (struct.isSetDevice()) {
                bitSet.set(0);
            }
            if (struct.isSetCode()) {
                bitSet.set(1);
            }
            tTupleProtocol.writeBitSet(bitSet, 2);
            if (struct.isSetDevice()) {
                tTupleProtocol.writeString(struct.device);
            }
            if (struct.isSetCode()) {
                tTupleProtocol.writeString(struct.code);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BczLoginRequestTupleSchemeFactory implements SchemeFactory {
        private BczLoginRequestTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BczLoginRequestTupleScheme getScheme() {
            return new BczLoginRequestTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ACCOUNT(1, AccountVerificationActivity.f19910x),
        PASSWORD(2, HintConstants.AUTOFILL_HINT_PASSWORD),
        DEVICE(3, "device"),
        CODE(4, "code");

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
                return ACCOUNT;
            }
            if (fieldId == 2) {
                return PASSWORD;
            }
            if (fieldId == 3) {
                return DEVICE;
            }
            if (fieldId != 4) {
                return null;
            }
            return CODE;
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
        hashMap.put(StandardScheme.class, new BczLoginRequestStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BczLoginRequestTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ACCOUNT, (_Fields) new FieldMetaData(AccountVerificationActivity.f19910x, (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.PASSWORD, (_Fields) new FieldMetaData(HintConstants.AUTOFILL_HINT_PASSWORD, (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.DEVICE, (_Fields) new FieldMetaData("device", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.CODE, (_Fields) new FieldMetaData("code", (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BczLoginRequest.class, unmodifiableMap);
    }

    public BczLoginRequest() {
        this.optionals = new _Fields[]{_Fields.DEVICE, _Fields.CODE};
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
        this.account = null;
        this.password = null;
        this.device = null;
        this.code = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BczLoginRequest)) {
            return equals((BczLoginRequest) that);
        }
        return false;
    }

    public String getAccount() {
        return this.account;
    }

    public String getCode() {
        return this.code;
    }

    public String getDevice() {
        return this.device;
    }

    public String getPassword() {
        return this.password;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAccount() {
        return this.account != null;
    }

    public boolean isSetCode() {
        return this.code != null;
    }

    public boolean isSetDevice() {
        return this.device != null;
    }

    public boolean isSetPassword() {
        return this.password != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BczLoginRequest setAccount(String account) {
        this.account = account;
        return this;
    }

    public void setAccountIsSet(boolean value) {
        if (value) {
            return;
        }
        this.account = null;
    }

    public BczLoginRequest setCode(String code) {
        this.code = code;
        return this;
    }

    public void setCodeIsSet(boolean value) {
        if (value) {
            return;
        }
        this.code = null;
    }

    public BczLoginRequest setDevice(String device) {
        this.device = device;
        return this;
    }

    public void setDeviceIsSet(boolean value) {
        if (value) {
            return;
        }
        this.device = null;
    }

    public BczLoginRequest setPassword(String password) {
        this.password = password;
        return this;
    }

    public void setPasswordIsSet(boolean value) {
        if (value) {
            return;
        }
        this.password = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BczLoginRequest(");
        sb2.append("account:");
        String str = this.account;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("password:");
        String str2 = this.password;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        if (isSetDevice()) {
            sb2.append(j2.O);
            sb2.append("device:");
            String str3 = this.device;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
        }
        if (isSetCode()) {
            sb2.append(j2.O);
            sb2.append("code:");
            String str4 = this.code;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAccount() {
        this.account = null;
    }

    public void unsetCode() {
        this.code = null;
    }

    public void unsetDevice() {
        this.device = null;
    }

    public void unsetPassword() {
        this.password = null;
    }

    public void validate() throws TException {
        if (this.account == null) {
            throw new TProtocolException("Required field 'account' was not present! Struct: " + toString());
        }
        if (this.password != null) {
            return;
        }
        throw new TProtocolException("Required field 'password' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BczLoginRequest other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetAccount()).compareTo(Boolean.valueOf(other.isSetAccount()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetAccount() && (compareTo4 = TBaseHelper.compareTo(this.account, other.account)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetPassword()).compareTo(Boolean.valueOf(other.isSetPassword()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetPassword() && (compareTo3 = TBaseHelper.compareTo(this.password, other.password)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetDevice()).compareTo(Boolean.valueOf(other.isSetDevice()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetDevice() && (compareTo2 = TBaseHelper.compareTo(this.device, other.device)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetCode()).compareTo(Boolean.valueOf(other.isSetCode()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetCode() || (compareTo = TBaseHelper.compareTo(this.code, other.code)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BczLoginRequest, _Fields> deepCopy2() {
        return new BczLoginRequest(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$BczLoginRequest$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getAccount();
        }
        if (i11 == 2) {
            return getPassword();
        }
        if (i11 == 3) {
            return getDevice();
        }
        if (i11 == 4) {
            return getCode();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$BczLoginRequest$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetAccount();
        }
        if (i11 == 2) {
            return isSetPassword();
        }
        if (i11 == 3) {
            return isSetDevice();
        }
        if (i11 == 4) {
            return isSetCode();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$BczLoginRequest$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetAccount();
                return;
            } else {
                setAccount((String) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetPassword();
                return;
            } else {
                setPassword((String) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetDevice();
                return;
            } else {
                setDevice((String) value);
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetCode();
        } else {
            setCode((String) value);
        }
    }

    public BczLoginRequest(String account, String password) {
        this();
        this.account = account;
        this.password = password;
    }

    public boolean equals(BczLoginRequest that) {
        if (that == null) {
            return false;
        }
        boolean isSetAccount = isSetAccount();
        boolean isSetAccount2 = that.isSetAccount();
        if ((isSetAccount || isSetAccount2) && !(isSetAccount && isSetAccount2 && this.account.equals(that.account))) {
            return false;
        }
        boolean isSetPassword = isSetPassword();
        boolean isSetPassword2 = that.isSetPassword();
        if ((isSetPassword || isSetPassword2) && !(isSetPassword && isSetPassword2 && this.password.equals(that.password))) {
            return false;
        }
        boolean isSetDevice = isSetDevice();
        boolean isSetDevice2 = that.isSetDevice();
        if ((isSetDevice || isSetDevice2) && !(isSetDevice && isSetDevice2 && this.device.equals(that.device))) {
            return false;
        }
        boolean isSetCode = isSetCode();
        boolean isSetCode2 = that.isSetCode();
        if (isSetCode || isSetCode2) {
            return isSetCode && isSetCode2 && this.code.equals(that.code);
        }
        return true;
    }

    public BczLoginRequest(BczLoginRequest other) {
        this.optionals = new _Fields[]{_Fields.DEVICE, _Fields.CODE};
        if (other.isSetAccount()) {
            this.account = other.account;
        }
        if (other.isSetPassword()) {
            this.password = other.password;
        }
        if (other.isSetDevice()) {
            this.device = other.device;
        }
        if (other.isSetCode()) {
            this.code = other.code;
        }
    }
}
