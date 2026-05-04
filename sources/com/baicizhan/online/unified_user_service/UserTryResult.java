package com.baicizhan.online.unified_user_service;

import androidx.autofill.HintConstants;
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
public class UserTryResult implements TBase<UserTryResult, _Fields>, Serializable, Cloneable, Comparable<UserTryResult> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public String email;
    public String password;
    private static final TStruct STRUCT_DESC = new TStruct("UserTryResult");
    private static final TField EMAIL_FIELD_DESC = new TField("email", (byte) 11, 1);
    private static final TField PASSWORD_FIELD_DESC = new TField(HintConstants.AUTOFILL_HINT_PASSWORD, (byte) 11, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.unified_user_service.UserTryResult$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$unified_user_service$UserTryResult$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$unified_user_service$UserTryResult$_Fields = iArr;
            try {
                iArr[_Fields.EMAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$UserTryResult$_Fields[_Fields.PASSWORD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserTryResultStandardScheme extends StandardScheme<UserTryResult> {
        private UserTryResultStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserTryResult struct) throws TException {
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
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 11) {
                        struct.password = iprot.readString();
                        struct.setPasswordIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.email = iprot.readString();
                    struct.setEmailIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, UserTryResult struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserTryResult.STRUCT_DESC);
            if (struct.email != null) {
                oprot.writeFieldBegin(UserTryResult.EMAIL_FIELD_DESC);
                oprot.writeString(struct.email);
                oprot.writeFieldEnd();
            }
            if (struct.password != null) {
                oprot.writeFieldBegin(UserTryResult.PASSWORD_FIELD_DESC);
                oprot.writeString(struct.password);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserTryResultStandardSchemeFactory implements SchemeFactory {
        private UserTryResultStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserTryResultStandardScheme getScheme() {
            return new UserTryResultStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserTryResultTupleScheme extends TupleScheme<UserTryResult> {
        private UserTryResultTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserTryResult struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.email = tTupleProtocol.readString();
            struct.setEmailIsSet(true);
            struct.password = tTupleProtocol.readString();
            struct.setPasswordIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserTryResult struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.email);
            tTupleProtocol.writeString(struct.password);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserTryResultTupleSchemeFactory implements SchemeFactory {
        private UserTryResultTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserTryResultTupleScheme getScheme() {
            return new UserTryResultTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        EMAIL(1, "email"),
        PASSWORD(2, HintConstants.AUTOFILL_HINT_PASSWORD);

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
                return EMAIL;
            }
            if (fieldId != 2) {
                return null;
            }
            return PASSWORD;
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
        hashMap.put(StandardScheme.class, new UserTryResultStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserTryResultTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.EMAIL, (_Fields) new FieldMetaData("email", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.PASSWORD, (_Fields) new FieldMetaData(HintConstants.AUTOFILL_HINT_PASSWORD, (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserTryResult.class, unmodifiableMap);
    }

    public UserTryResult() {
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
        this.email = null;
        this.password = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserTryResult)) {
            return equals((UserTryResult) that);
        }
        return false;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetEmail() {
        return this.email != null;
    }

    public boolean isSetPassword() {
        return this.password != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserTryResult setEmail(String email) {
        this.email = email;
        return this;
    }

    public void setEmailIsSet(boolean value) {
        if (value) {
            return;
        }
        this.email = null;
    }

    public UserTryResult setPassword(String password) {
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
        StringBuilder sb2 = new StringBuilder("UserTryResult(");
        sb2.append("email:");
        String str = this.email;
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
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetEmail() {
        this.email = null;
    }

    public void unsetPassword() {
        this.password = null;
    }

    public void validate() throws TException {
        if (this.email == null) {
            throw new TProtocolException("Required field 'email' was not present! Struct: " + toString());
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

    public UserTryResult(String email, String password) {
        this();
        this.email = email;
        this.password = password;
    }

    @Override // java.lang.Comparable
    public int compareTo(UserTryResult other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetEmail()).compareTo(Boolean.valueOf(other.isSetEmail()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetEmail() && (compareTo2 = TBaseHelper.compareTo(this.email, other.email)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetPassword()).compareTo(Boolean.valueOf(other.isSetPassword()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetPassword() || (compareTo = TBaseHelper.compareTo(this.password, other.password)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserTryResult, _Fields> deepCopy2() {
        return new UserTryResult(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$UserTryResult$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getEmail();
        }
        if (i11 == 2) {
            return getPassword();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$UserTryResult$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetEmail();
        }
        if (i11 == 2) {
            return isSetPassword();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$UserTryResult$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetEmail();
                return;
            } else {
                setEmail((String) value);
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetPassword();
        } else {
            setPassword((String) value);
        }
    }

    public boolean equals(UserTryResult that) {
        if (that == null) {
            return false;
        }
        boolean isSetEmail = isSetEmail();
        boolean isSetEmail2 = that.isSetEmail();
        if ((isSetEmail || isSetEmail2) && !(isSetEmail && isSetEmail2 && this.email.equals(that.email))) {
            return false;
        }
        boolean isSetPassword = isSetPassword();
        boolean isSetPassword2 = that.isSetPassword();
        if (isSetPassword || isSetPassword2) {
            return isSetPassword && isSetPassword2 && this.password.equals(that.password);
        }
        return true;
    }

    public UserTryResult(UserTryResult other) {
        if (other.isSetEmail()) {
            this.email = other.email;
        }
        if (other.isSetPassword()) {
            this.password = other.password;
        }
    }
}
