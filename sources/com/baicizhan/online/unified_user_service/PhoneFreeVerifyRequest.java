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
public class PhoneFreeVerifyRequest implements TBase<PhoneFreeVerifyRequest, _Fields>, Serializable, Cloneable, Comparable<PhoneFreeVerifyRequest> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public String clientToken;
    public String opToken;
    public String operatorName;
    private static final TStruct STRUCT_DESC = new TStruct("PhoneFreeVerifyRequest");
    private static final TField CLIENT_TOKEN_FIELD_DESC = new TField("clientToken", (byte) 11, 1);
    private static final TField OP_TOKEN_FIELD_DESC = new TField("opToken", (byte) 11, 2);
    private static final TField OPERATOR_NAME_FIELD_DESC = new TField("operatorName", (byte) 11, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.unified_user_service.PhoneFreeVerifyRequest$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$unified_user_service$PhoneFreeVerifyRequest$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$unified_user_service$PhoneFreeVerifyRequest$_Fields = iArr;
            try {
                iArr[_Fields.CLIENT_TOKEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$PhoneFreeVerifyRequest$_Fields[_Fields.OP_TOKEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$PhoneFreeVerifyRequest$_Fields[_Fields.OPERATOR_NAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PhoneFreeVerifyRequestStandardScheme extends StandardScheme<PhoneFreeVerifyRequest> {
        private PhoneFreeVerifyRequestStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, PhoneFreeVerifyRequest struct) throws TException {
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
                            struct.operatorName = iprot.readString();
                            struct.setOperatorNameIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.opToken = iprot.readString();
                        struct.setOpTokenIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.clientToken = iprot.readString();
                    struct.setClientTokenIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, PhoneFreeVerifyRequest struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(PhoneFreeVerifyRequest.STRUCT_DESC);
            if (struct.clientToken != null) {
                oprot.writeFieldBegin(PhoneFreeVerifyRequest.CLIENT_TOKEN_FIELD_DESC);
                oprot.writeString(struct.clientToken);
                oprot.writeFieldEnd();
            }
            if (struct.opToken != null) {
                oprot.writeFieldBegin(PhoneFreeVerifyRequest.OP_TOKEN_FIELD_DESC);
                oprot.writeString(struct.opToken);
                oprot.writeFieldEnd();
            }
            if (struct.operatorName != null) {
                oprot.writeFieldBegin(PhoneFreeVerifyRequest.OPERATOR_NAME_FIELD_DESC);
                oprot.writeString(struct.operatorName);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PhoneFreeVerifyRequestStandardSchemeFactory implements SchemeFactory {
        private PhoneFreeVerifyRequestStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public PhoneFreeVerifyRequestStandardScheme getScheme() {
            return new PhoneFreeVerifyRequestStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PhoneFreeVerifyRequestTupleScheme extends TupleScheme<PhoneFreeVerifyRequest> {
        private PhoneFreeVerifyRequestTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, PhoneFreeVerifyRequest struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.clientToken = tTupleProtocol.readString();
            struct.setClientTokenIsSet(true);
            struct.opToken = tTupleProtocol.readString();
            struct.setOpTokenIsSet(true);
            struct.operatorName = tTupleProtocol.readString();
            struct.setOperatorNameIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, PhoneFreeVerifyRequest struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.clientToken);
            tTupleProtocol.writeString(struct.opToken);
            tTupleProtocol.writeString(struct.operatorName);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PhoneFreeVerifyRequestTupleSchemeFactory implements SchemeFactory {
        private PhoneFreeVerifyRequestTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public PhoneFreeVerifyRequestTupleScheme getScheme() {
            return new PhoneFreeVerifyRequestTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        CLIENT_TOKEN(1, "clientToken"),
        OP_TOKEN(2, "opToken"),
        OPERATOR_NAME(3, "operatorName");

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
                return CLIENT_TOKEN;
            }
            if (fieldId == 2) {
                return OP_TOKEN;
            }
            if (fieldId != 3) {
                return null;
            }
            return OPERATOR_NAME;
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
        hashMap.put(StandardScheme.class, new PhoneFreeVerifyRequestStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new PhoneFreeVerifyRequestTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.CLIENT_TOKEN, (_Fields) new FieldMetaData("clientToken", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.OP_TOKEN, (_Fields) new FieldMetaData("opToken", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.OPERATOR_NAME, (_Fields) new FieldMetaData("operatorName", (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(PhoneFreeVerifyRequest.class, unmodifiableMap);
    }

    public PhoneFreeVerifyRequest() {
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
        this.clientToken = null;
        this.opToken = null;
        this.operatorName = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof PhoneFreeVerifyRequest)) {
            return equals((PhoneFreeVerifyRequest) that);
        }
        return false;
    }

    public String getClientToken() {
        return this.clientToken;
    }

    public String getOpToken() {
        return this.opToken;
    }

    public String getOperatorName() {
        return this.operatorName;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetClientToken() {
        return this.clientToken != null;
    }

    public boolean isSetOpToken() {
        return this.opToken != null;
    }

    public boolean isSetOperatorName() {
        return this.operatorName != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public PhoneFreeVerifyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public void setClientTokenIsSet(boolean value) {
        if (value) {
            return;
        }
        this.clientToken = null;
    }

    public PhoneFreeVerifyRequest setOpToken(String opToken) {
        this.opToken = opToken;
        return this;
    }

    public void setOpTokenIsSet(boolean value) {
        if (value) {
            return;
        }
        this.opToken = null;
    }

    public PhoneFreeVerifyRequest setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }

    public void setOperatorNameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.operatorName = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PhoneFreeVerifyRequest(");
        sb2.append("clientToken:");
        String str = this.clientToken;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("opToken:");
        String str2 = this.opToken;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("operatorName:");
        String str3 = this.operatorName;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetClientToken() {
        this.clientToken = null;
    }

    public void unsetOpToken() {
        this.opToken = null;
    }

    public void unsetOperatorName() {
        this.operatorName = null;
    }

    public void validate() throws TException {
        if (this.clientToken == null) {
            throw new TProtocolException("Required field 'clientToken' was not present! Struct: " + toString());
        }
        if (this.opToken == null) {
            throw new TProtocolException("Required field 'opToken' was not present! Struct: " + toString());
        }
        if (this.operatorName != null) {
            return;
        }
        throw new TProtocolException("Required field 'operatorName' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    public PhoneFreeVerifyRequest(String clientToken, String opToken, String operatorName) {
        this();
        this.clientToken = clientToken;
        this.opToken = opToken;
        this.operatorName = operatorName;
    }

    @Override // java.lang.Comparable
    public int compareTo(PhoneFreeVerifyRequest other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetClientToken()).compareTo(Boolean.valueOf(other.isSetClientToken()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetClientToken() && (compareTo3 = TBaseHelper.compareTo(this.clientToken, other.clientToken)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetOpToken()).compareTo(Boolean.valueOf(other.isSetOpToken()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetOpToken() && (compareTo2 = TBaseHelper.compareTo(this.opToken, other.opToken)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetOperatorName()).compareTo(Boolean.valueOf(other.isSetOperatorName()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetOperatorName() || (compareTo = TBaseHelper.compareTo(this.operatorName, other.operatorName)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<PhoneFreeVerifyRequest, _Fields> deepCopy2() {
        return new PhoneFreeVerifyRequest(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$PhoneFreeVerifyRequest$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getClientToken();
        }
        if (i11 == 2) {
            return getOpToken();
        }
        if (i11 == 3) {
            return getOperatorName();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$PhoneFreeVerifyRequest$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetClientToken();
        }
        if (i11 == 2) {
            return isSetOpToken();
        }
        if (i11 == 3) {
            return isSetOperatorName();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$PhoneFreeVerifyRequest$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetClientToken();
                return;
            } else {
                setClientToken((String) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetOpToken();
                return;
            } else {
                setOpToken((String) value);
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetOperatorName();
        } else {
            setOperatorName((String) value);
        }
    }

    public boolean equals(PhoneFreeVerifyRequest that) {
        if (that == null) {
            return false;
        }
        boolean isSetClientToken = isSetClientToken();
        boolean isSetClientToken2 = that.isSetClientToken();
        if ((isSetClientToken || isSetClientToken2) && !(isSetClientToken && isSetClientToken2 && this.clientToken.equals(that.clientToken))) {
            return false;
        }
        boolean isSetOpToken = isSetOpToken();
        boolean isSetOpToken2 = that.isSetOpToken();
        if ((isSetOpToken || isSetOpToken2) && !(isSetOpToken && isSetOpToken2 && this.opToken.equals(that.opToken))) {
            return false;
        }
        boolean isSetOperatorName = isSetOperatorName();
        boolean isSetOperatorName2 = that.isSetOperatorName();
        if (isSetOperatorName || isSetOperatorName2) {
            return isSetOperatorName && isSetOperatorName2 && this.operatorName.equals(that.operatorName);
        }
        return true;
    }

    public PhoneFreeVerifyRequest(PhoneFreeVerifyRequest other) {
        if (other.isSetClientToken()) {
            this.clientToken = other.clientToken;
        }
        if (other.isSetOpToken()) {
            this.opToken = other.opToken;
        }
        if (other.isSetOperatorName()) {
            this.operatorName = other.operatorName;
        }
    }
}
