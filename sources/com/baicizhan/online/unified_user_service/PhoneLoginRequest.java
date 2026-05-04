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
import org.apache.thrift.meta_data.StructMetaData;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TField;
import org.apache.thrift.protocol.TProtocol;
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
public class PhoneLoginRequest implements TBase<PhoneLoginRequest, _Fields>, Serializable, Cloneable, Comparable<PhoneLoginRequest> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public String device;
    public PhoneFreeVerifyRequest free_verify_request;
    private _Fields[] optionals;
    public PhoneVerifyCodeRequest verify_code_request;
    private static final TStruct STRUCT_DESC = new TStruct("PhoneLoginRequest");
    private static final TField VERIFY_CODE_REQUEST_FIELD_DESC = new TField("verify_code_request", (byte) 12, 1);
    private static final TField FREE_VERIFY_REQUEST_FIELD_DESC = new TField("free_verify_request", (byte) 12, 2);
    private static final TField DEVICE_FIELD_DESC = new TField("device", (byte) 11, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.unified_user_service.PhoneLoginRequest$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$unified_user_service$PhoneLoginRequest$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$unified_user_service$PhoneLoginRequest$_Fields = iArr;
            try {
                iArr[_Fields.VERIFY_CODE_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$PhoneLoginRequest$_Fields[_Fields.FREE_VERIFY_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$PhoneLoginRequest$_Fields[_Fields.DEVICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PhoneLoginRequestStandardScheme extends StandardScheme<PhoneLoginRequest> {
        private PhoneLoginRequestStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, PhoneLoginRequest struct) throws TException {
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
                            TProtocolUtil.skip(iprot, b11);
                        } else if (b11 == 11) {
                            struct.device = iprot.readString();
                            struct.setDeviceIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 12) {
                        PhoneFreeVerifyRequest phoneFreeVerifyRequest = new PhoneFreeVerifyRequest();
                        struct.free_verify_request = phoneFreeVerifyRequest;
                        phoneFreeVerifyRequest.read(iprot);
                        struct.setFree_verify_requestIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 12) {
                    PhoneVerifyCodeRequest phoneVerifyCodeRequest = new PhoneVerifyCodeRequest();
                    struct.verify_code_request = phoneVerifyCodeRequest;
                    phoneVerifyCodeRequest.read(iprot);
                    struct.setVerify_code_requestIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, PhoneLoginRequest struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(PhoneLoginRequest.STRUCT_DESC);
            if (struct.verify_code_request != null && struct.isSetVerify_code_request()) {
                oprot.writeFieldBegin(PhoneLoginRequest.VERIFY_CODE_REQUEST_FIELD_DESC);
                struct.verify_code_request.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.free_verify_request != null && struct.isSetFree_verify_request()) {
                oprot.writeFieldBegin(PhoneLoginRequest.FREE_VERIFY_REQUEST_FIELD_DESC);
                struct.free_verify_request.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.device != null && struct.isSetDevice()) {
                oprot.writeFieldBegin(PhoneLoginRequest.DEVICE_FIELD_DESC);
                oprot.writeString(struct.device);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PhoneLoginRequestStandardSchemeFactory implements SchemeFactory {
        private PhoneLoginRequestStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public PhoneLoginRequestStandardScheme getScheme() {
            return new PhoneLoginRequestStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PhoneLoginRequestTupleScheme extends TupleScheme<PhoneLoginRequest> {
        private PhoneLoginRequestTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, PhoneLoginRequest struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BitSet readBitSet = tTupleProtocol.readBitSet(3);
            if (readBitSet.get(0)) {
                PhoneVerifyCodeRequest phoneVerifyCodeRequest = new PhoneVerifyCodeRequest();
                struct.verify_code_request = phoneVerifyCodeRequest;
                phoneVerifyCodeRequest.read(tTupleProtocol);
                struct.setVerify_code_requestIsSet(true);
            }
            if (readBitSet.get(1)) {
                PhoneFreeVerifyRequest phoneFreeVerifyRequest = new PhoneFreeVerifyRequest();
                struct.free_verify_request = phoneFreeVerifyRequest;
                phoneFreeVerifyRequest.read(tTupleProtocol);
                struct.setFree_verify_requestIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.device = tTupleProtocol.readString();
                struct.setDeviceIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, PhoneLoginRequest struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BitSet bitSet = new BitSet();
            if (struct.isSetVerify_code_request()) {
                bitSet.set(0);
            }
            if (struct.isSetFree_verify_request()) {
                bitSet.set(1);
            }
            if (struct.isSetDevice()) {
                bitSet.set(2);
            }
            tTupleProtocol.writeBitSet(bitSet, 3);
            if (struct.isSetVerify_code_request()) {
                struct.verify_code_request.write(tTupleProtocol);
            }
            if (struct.isSetFree_verify_request()) {
                struct.free_verify_request.write(tTupleProtocol);
            }
            if (struct.isSetDevice()) {
                tTupleProtocol.writeString(struct.device);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PhoneLoginRequestTupleSchemeFactory implements SchemeFactory {
        private PhoneLoginRequestTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public PhoneLoginRequestTupleScheme getScheme() {
            return new PhoneLoginRequestTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        VERIFY_CODE_REQUEST(1, "verify_code_request"),
        FREE_VERIFY_REQUEST(2, "free_verify_request"),
        DEVICE(3, "device");

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
                return VERIFY_CODE_REQUEST;
            }
            if (fieldId == 2) {
                return FREE_VERIFY_REQUEST;
            }
            if (fieldId != 3) {
                return null;
            }
            return DEVICE;
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
        hashMap.put(StandardScheme.class, new PhoneLoginRequestStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new PhoneLoginRequestTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.VERIFY_CODE_REQUEST, (_Fields) new FieldMetaData("verify_code_request", (byte) 2, new StructMetaData((byte) 12, PhoneVerifyCodeRequest.class)));
        enumMap.put((EnumMap) _Fields.FREE_VERIFY_REQUEST, (_Fields) new FieldMetaData("free_verify_request", (byte) 2, new StructMetaData((byte) 12, PhoneFreeVerifyRequest.class)));
        enumMap.put((EnumMap) _Fields.DEVICE, (_Fields) new FieldMetaData("device", (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(PhoneLoginRequest.class, unmodifiableMap);
    }

    public PhoneLoginRequest() {
        this.optionals = new _Fields[]{_Fields.VERIFY_CODE_REQUEST, _Fields.FREE_VERIFY_REQUEST, _Fields.DEVICE};
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
        this.verify_code_request = null;
        this.free_verify_request = null;
        this.device = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof PhoneLoginRequest)) {
            return equals((PhoneLoginRequest) that);
        }
        return false;
    }

    public String getDevice() {
        return this.device;
    }

    public PhoneFreeVerifyRequest getFree_verify_request() {
        return this.free_verify_request;
    }

    public PhoneVerifyCodeRequest getVerify_code_request() {
        return this.verify_code_request;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetDevice() {
        return this.device != null;
    }

    public boolean isSetFree_verify_request() {
        return this.free_verify_request != null;
    }

    public boolean isSetVerify_code_request() {
        return this.verify_code_request != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public PhoneLoginRequest setDevice(String device) {
        this.device = device;
        return this;
    }

    public void setDeviceIsSet(boolean value) {
        if (value) {
            return;
        }
        this.device = null;
    }

    public PhoneLoginRequest setFree_verify_request(PhoneFreeVerifyRequest free_verify_request) {
        this.free_verify_request = free_verify_request;
        return this;
    }

    public void setFree_verify_requestIsSet(boolean value) {
        if (value) {
            return;
        }
        this.free_verify_request = null;
    }

    public PhoneLoginRequest setVerify_code_request(PhoneVerifyCodeRequest verify_code_request) {
        this.verify_code_request = verify_code_request;
        return this;
    }

    public void setVerify_code_requestIsSet(boolean value) {
        if (value) {
            return;
        }
        this.verify_code_request = null;
    }

    public String toString() {
        boolean z11;
        StringBuilder sb2 = new StringBuilder("PhoneLoginRequest(");
        boolean z12 = false;
        if (isSetVerify_code_request()) {
            sb2.append("verify_code_request:");
            PhoneVerifyCodeRequest phoneVerifyCodeRequest = this.verify_code_request;
            if (phoneVerifyCodeRequest == null) {
                sb2.append("null");
            } else {
                sb2.append(phoneVerifyCodeRequest);
            }
            z11 = false;
        } else {
            z11 = true;
        }
        if (isSetFree_verify_request()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("free_verify_request:");
            PhoneFreeVerifyRequest phoneFreeVerifyRequest = this.free_verify_request;
            if (phoneFreeVerifyRequest == null) {
                sb2.append("null");
            } else {
                sb2.append(phoneFreeVerifyRequest);
            }
        } else {
            z12 = z11;
        }
        if (isSetDevice()) {
            if (!z12) {
                sb2.append(j2.O);
            }
            sb2.append("device:");
            String str = this.device;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetDevice() {
        this.device = null;
    }

    public void unsetFree_verify_request() {
        this.free_verify_request = null;
    }

    public void unsetVerify_code_request() {
        this.verify_code_request = null;
    }

    public void validate() throws TException {
        PhoneVerifyCodeRequest phoneVerifyCodeRequest = this.verify_code_request;
        if (phoneVerifyCodeRequest != null) {
            phoneVerifyCodeRequest.validate();
        }
        PhoneFreeVerifyRequest phoneFreeVerifyRequest = this.free_verify_request;
        if (phoneFreeVerifyRequest != null) {
            phoneFreeVerifyRequest.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(PhoneLoginRequest other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetVerify_code_request()).compareTo(Boolean.valueOf(other.isSetVerify_code_request()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetVerify_code_request() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.verify_code_request, (Comparable) other.verify_code_request)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetFree_verify_request()).compareTo(Boolean.valueOf(other.isSetFree_verify_request()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetFree_verify_request() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.free_verify_request, (Comparable) other.free_verify_request)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetDevice()).compareTo(Boolean.valueOf(other.isSetDevice()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetDevice() || (compareTo = TBaseHelper.compareTo(this.device, other.device)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<PhoneLoginRequest, _Fields> deepCopy2() {
        return new PhoneLoginRequest(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$PhoneLoginRequest$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getVerify_code_request();
        }
        if (i11 == 2) {
            return getFree_verify_request();
        }
        if (i11 == 3) {
            return getDevice();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$PhoneLoginRequest$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetVerify_code_request();
        }
        if (i11 == 2) {
            return isSetFree_verify_request();
        }
        if (i11 == 3) {
            return isSetDevice();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$PhoneLoginRequest$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetVerify_code_request();
                return;
            } else {
                setVerify_code_request((PhoneVerifyCodeRequest) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetFree_verify_request();
                return;
            } else {
                setFree_verify_request((PhoneFreeVerifyRequest) value);
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetDevice();
        } else {
            setDevice((String) value);
        }
    }

    public PhoneLoginRequest(PhoneLoginRequest other) {
        this.optionals = new _Fields[]{_Fields.VERIFY_CODE_REQUEST, _Fields.FREE_VERIFY_REQUEST, _Fields.DEVICE};
        if (other.isSetVerify_code_request()) {
            this.verify_code_request = new PhoneVerifyCodeRequest(other.verify_code_request);
        }
        if (other.isSetFree_verify_request()) {
            this.free_verify_request = new PhoneFreeVerifyRequest(other.free_verify_request);
        }
        if (other.isSetDevice()) {
            this.device = other.device;
        }
    }

    public boolean equals(PhoneLoginRequest that) {
        if (that == null) {
            return false;
        }
        boolean isSetVerify_code_request = isSetVerify_code_request();
        boolean isSetVerify_code_request2 = that.isSetVerify_code_request();
        if ((isSetVerify_code_request || isSetVerify_code_request2) && !(isSetVerify_code_request && isSetVerify_code_request2 && this.verify_code_request.equals(that.verify_code_request))) {
            return false;
        }
        boolean isSetFree_verify_request = isSetFree_verify_request();
        boolean isSetFree_verify_request2 = that.isSetFree_verify_request();
        if ((isSetFree_verify_request || isSetFree_verify_request2) && !(isSetFree_verify_request && isSetFree_verify_request2 && this.free_verify_request.equals(that.free_verify_request))) {
            return false;
        }
        boolean isSetDevice = isSetDevice();
        boolean isSetDevice2 = that.isSetDevice();
        if (isSetDevice || isSetDevice2) {
            return isSetDevice && isSetDevice2 && this.device.equals(that.device);
        }
        return true;
    }
}
