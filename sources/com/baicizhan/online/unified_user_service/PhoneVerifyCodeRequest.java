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
public class PhoneVerifyCodeRequest implements TBase<PhoneVerifyCodeRequest, _Fields>, Serializable, Cloneable, Comparable<PhoneVerifyCodeRequest> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public String phone;
    public String verify_code;
    private static final TStruct STRUCT_DESC = new TStruct("PhoneVerifyCodeRequest");
    private static final TField PHONE_FIELD_DESC = new TField("phone", (byte) 11, 1);
    private static final TField VERIFY_CODE_FIELD_DESC = new TField("verify_code", (byte) 11, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.unified_user_service.PhoneVerifyCodeRequest$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$unified_user_service$PhoneVerifyCodeRequest$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$unified_user_service$PhoneVerifyCodeRequest$_Fields = iArr;
            try {
                iArr[_Fields.PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$PhoneVerifyCodeRequest$_Fields[_Fields.VERIFY_CODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PhoneVerifyCodeRequestStandardScheme extends StandardScheme<PhoneVerifyCodeRequest> {
        private PhoneVerifyCodeRequestStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, PhoneVerifyCodeRequest struct) throws TException {
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
                        struct.verify_code = iprot.readString();
                        struct.setVerify_codeIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.phone = iprot.readString();
                    struct.setPhoneIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, PhoneVerifyCodeRequest struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(PhoneVerifyCodeRequest.STRUCT_DESC);
            if (struct.phone != null) {
                oprot.writeFieldBegin(PhoneVerifyCodeRequest.PHONE_FIELD_DESC);
                oprot.writeString(struct.phone);
                oprot.writeFieldEnd();
            }
            if (struct.verify_code != null) {
                oprot.writeFieldBegin(PhoneVerifyCodeRequest.VERIFY_CODE_FIELD_DESC);
                oprot.writeString(struct.verify_code);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PhoneVerifyCodeRequestStandardSchemeFactory implements SchemeFactory {
        private PhoneVerifyCodeRequestStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public PhoneVerifyCodeRequestStandardScheme getScheme() {
            return new PhoneVerifyCodeRequestStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PhoneVerifyCodeRequestTupleScheme extends TupleScheme<PhoneVerifyCodeRequest> {
        private PhoneVerifyCodeRequestTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, PhoneVerifyCodeRequest struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.phone = tTupleProtocol.readString();
            struct.setPhoneIsSet(true);
            struct.verify_code = tTupleProtocol.readString();
            struct.setVerify_codeIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, PhoneVerifyCodeRequest struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.phone);
            tTupleProtocol.writeString(struct.verify_code);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PhoneVerifyCodeRequestTupleSchemeFactory implements SchemeFactory {
        private PhoneVerifyCodeRequestTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public PhoneVerifyCodeRequestTupleScheme getScheme() {
            return new PhoneVerifyCodeRequestTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        PHONE(1, "phone"),
        VERIFY_CODE(2, "verify_code");

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
                return PHONE;
            }
            if (fieldId != 2) {
                return null;
            }
            return VERIFY_CODE;
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
        hashMap.put(StandardScheme.class, new PhoneVerifyCodeRequestStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new PhoneVerifyCodeRequestTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.PHONE, (_Fields) new FieldMetaData("phone", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.VERIFY_CODE, (_Fields) new FieldMetaData("verify_code", (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(PhoneVerifyCodeRequest.class, unmodifiableMap);
    }

    public PhoneVerifyCodeRequest() {
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
        this.phone = null;
        this.verify_code = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof PhoneVerifyCodeRequest)) {
            return equals((PhoneVerifyCodeRequest) that);
        }
        return false;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getVerify_code() {
        return this.verify_code;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetPhone() {
        return this.phone != null;
    }

    public boolean isSetVerify_code() {
        return this.verify_code != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public PhoneVerifyCodeRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public void setPhoneIsSet(boolean value) {
        if (value) {
            return;
        }
        this.phone = null;
    }

    public PhoneVerifyCodeRequest setVerify_code(String verify_code) {
        this.verify_code = verify_code;
        return this;
    }

    public void setVerify_codeIsSet(boolean value) {
        if (value) {
            return;
        }
        this.verify_code = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PhoneVerifyCodeRequest(");
        sb2.append("phone:");
        String str = this.phone;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("verify_code:");
        String str2 = this.verify_code;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetPhone() {
        this.phone = null;
    }

    public void unsetVerify_code() {
        this.verify_code = null;
    }

    public void validate() throws TException {
        if (this.phone == null) {
            throw new TProtocolException("Required field 'phone' was not present! Struct: " + toString());
        }
        if (this.verify_code != null) {
            return;
        }
        throw new TProtocolException("Required field 'verify_code' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    public PhoneVerifyCodeRequest(String phone, String verify_code) {
        this();
        this.phone = phone;
        this.verify_code = verify_code;
    }

    @Override // java.lang.Comparable
    public int compareTo(PhoneVerifyCodeRequest other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetPhone()).compareTo(Boolean.valueOf(other.isSetPhone()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetPhone() && (compareTo2 = TBaseHelper.compareTo(this.phone, other.phone)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetVerify_code()).compareTo(Boolean.valueOf(other.isSetVerify_code()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetVerify_code() || (compareTo = TBaseHelper.compareTo(this.verify_code, other.verify_code)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<PhoneVerifyCodeRequest, _Fields> deepCopy2() {
        return new PhoneVerifyCodeRequest(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$PhoneVerifyCodeRequest$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getPhone();
        }
        if (i11 == 2) {
            return getVerify_code();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$PhoneVerifyCodeRequest$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetPhone();
        }
        if (i11 == 2) {
            return isSetVerify_code();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$PhoneVerifyCodeRequest$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetPhone();
                return;
            } else {
                setPhone((String) value);
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetVerify_code();
        } else {
            setVerify_code((String) value);
        }
    }

    public boolean equals(PhoneVerifyCodeRequest that) {
        if (that == null) {
            return false;
        }
        boolean isSetPhone = isSetPhone();
        boolean isSetPhone2 = that.isSetPhone();
        if ((isSetPhone || isSetPhone2) && !(isSetPhone && isSetPhone2 && this.phone.equals(that.phone))) {
            return false;
        }
        boolean isSetVerify_code = isSetVerify_code();
        boolean isSetVerify_code2 = that.isSetVerify_code();
        if (isSetVerify_code || isSetVerify_code2) {
            return isSetVerify_code && isSetVerify_code2 && this.verify_code.equals(that.verify_code);
        }
        return true;
    }

    public PhoneVerifyCodeRequest(PhoneVerifyCodeRequest other) {
        if (other.isSetPhone()) {
            this.phone = other.phone;
        }
        if (other.isSetVerify_code()) {
            this.verify_code = other.verify_code;
        }
    }
}
