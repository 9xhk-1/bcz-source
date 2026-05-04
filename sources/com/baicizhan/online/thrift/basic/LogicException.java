package com.baicizhan.online.thrift.basic;

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
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class LogicException extends TException implements TBase<LogicException, _Fields>, Serializable, Cloneable, Comparable<LogicException> {
    private static final int __CODE_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int code;
    public String from_method;
    public String from_service;
    public String message;
    private _Fields[] optionals;
    private static final TStruct STRUCT_DESC = new TStruct("LogicException");
    private static final TField FROM_SERVICE_FIELD_DESC = new TField("from_service", (byte) 11, 1);
    private static final TField FROM_METHOD_FIELD_DESC = new TField("from_method", (byte) 11, 2);
    private static final TField CODE_FIELD_DESC = new TField("code", (byte) 8, 3);
    private static final TField MESSAGE_FIELD_DESC = new TField("message", (byte) 11, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.thrift.basic.LogicException$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$thrift$basic$LogicException$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$thrift$basic$LogicException$_Fields = iArr;
            try {
                iArr[_Fields.FROM_SERVICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$thrift$basic$LogicException$_Fields[_Fields.FROM_METHOD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$thrift$basic$LogicException$_Fields[_Fields.CODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$thrift$basic$LogicException$_Fields[_Fields.MESSAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class LogicExceptionStandardScheme extends StandardScheme<LogicException> {
        private LogicExceptionStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, LogicException struct) throws TException {
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
                            if (s11 != 4) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 11) {
                                struct.message = iprot.readString();
                                struct.setMessageIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 8) {
                            struct.code = iprot.readI32();
                            struct.setCodeIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.from_method = iprot.readString();
                        struct.setFrom_methodIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.from_service = iprot.readString();
                    struct.setFrom_serviceIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetCode()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'code' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, LogicException struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(LogicException.STRUCT_DESC);
            if (struct.from_service != null) {
                oprot.writeFieldBegin(LogicException.FROM_SERVICE_FIELD_DESC);
                oprot.writeString(struct.from_service);
                oprot.writeFieldEnd();
            }
            if (struct.from_method != null) {
                oprot.writeFieldBegin(LogicException.FROM_METHOD_FIELD_DESC);
                oprot.writeString(struct.from_method);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(LogicException.CODE_FIELD_DESC);
            oprot.writeI32(struct.code);
            oprot.writeFieldEnd();
            if (struct.message != null && struct.isSetMessage()) {
                oprot.writeFieldBegin(LogicException.MESSAGE_FIELD_DESC);
                oprot.writeString(struct.message);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class LogicExceptionStandardSchemeFactory implements SchemeFactory {
        private LogicExceptionStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public LogicExceptionStandardScheme getScheme() {
            return new LogicExceptionStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class LogicExceptionTupleScheme extends TupleScheme<LogicException> {
        private LogicExceptionTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, LogicException struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.from_service = tTupleProtocol.readString();
            struct.setFrom_serviceIsSet(true);
            struct.from_method = tTupleProtocol.readString();
            struct.setFrom_methodIsSet(true);
            struct.code = tTupleProtocol.readI32();
            struct.setCodeIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                struct.message = tTupleProtocol.readString();
                struct.setMessageIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, LogicException struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.from_service);
            tTupleProtocol.writeString(struct.from_method);
            tTupleProtocol.writeI32(struct.code);
            BitSet bitSet = new BitSet();
            if (struct.isSetMessage()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetMessage()) {
                tTupleProtocol.writeString(struct.message);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class LogicExceptionTupleSchemeFactory implements SchemeFactory {
        private LogicExceptionTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public LogicExceptionTupleScheme getScheme() {
            return new LogicExceptionTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        FROM_SERVICE(1, "from_service"),
        FROM_METHOD(2, "from_method"),
        CODE(3, "code"),
        MESSAGE(4, "message");

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
                return FROM_SERVICE;
            }
            if (fieldId == 2) {
                return FROM_METHOD;
            }
            if (fieldId == 3) {
                return CODE;
            }
            if (fieldId != 4) {
                return null;
            }
            return MESSAGE;
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
        hashMap.put(StandardScheme.class, new LogicExceptionStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new LogicExceptionTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.FROM_SERVICE, (_Fields) new FieldMetaData("from_service", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.FROM_METHOD, (_Fields) new FieldMetaData("from_method", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.CODE, (_Fields) new FieldMetaData("code", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.MESSAGE, (_Fields) new FieldMetaData("message", (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(LogicException.class, unmodifiableMap);
    }

    public LogicException() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.MESSAGE};
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
        this.from_service = null;
        this.from_method = null;
        setCodeIsSet(false);
        this.code = 0;
        this.message = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof LogicException)) {
            return equals((LogicException) that);
        }
        return false;
    }

    public int getCode() {
        return this.code;
    }

    public String getFrom_method() {
        return this.from_method;
    }

    public String getFrom_service() {
        return this.from_service;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetCode() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetFrom_method() {
        return this.from_method != null;
    }

    public boolean isSetFrom_service() {
        return this.from_service != null;
    }

    public boolean isSetMessage() {
        return this.message != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public LogicException setCode(int code) {
        this.code = code;
        setCodeIsSet(true);
        return this;
    }

    public void setCodeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public LogicException setFrom_method(String from_method) {
        this.from_method = from_method;
        return this;
    }

    public void setFrom_methodIsSet(boolean value) {
        if (value) {
            return;
        }
        this.from_method = null;
    }

    public LogicException setFrom_service(String from_service) {
        this.from_service = from_service;
        return this;
    }

    public void setFrom_serviceIsSet(boolean value) {
        if (value) {
            return;
        }
        this.from_service = null;
    }

    public LogicException setMessage(String message) {
        this.message = message;
        return this;
    }

    public void setMessageIsSet(boolean value) {
        if (value) {
            return;
        }
        this.message = null;
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LogicException(");
        sb2.append("from_service:");
        String str = this.from_service;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("from_method:");
        String str2 = this.from_method;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("code:");
        sb2.append(this.code);
        if (isSetMessage()) {
            sb2.append(j2.O);
            sb2.append("message:");
            String str3 = this.message;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
        }
        sb2.append(j.f81007d);
        return sb2.toString();
    }

    public void unsetCode() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetFrom_method() {
        this.from_method = null;
    }

    public void unsetFrom_service() {
        this.from_service = null;
    }

    public void unsetMessage() {
        this.message = null;
    }

    public void validate() throws TException {
        if (this.from_service == null) {
            throw new TProtocolException("Required field 'from_service' was not present! Struct: " + toString());
        }
        if (this.from_method != null) {
            return;
        }
        throw new TProtocolException("Required field 'from_method' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(LogicException other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetFrom_service()).compareTo(Boolean.valueOf(other.isSetFrom_service()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetFrom_service() && (compareTo4 = TBaseHelper.compareTo(this.from_service, other.from_service)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetFrom_method()).compareTo(Boolean.valueOf(other.isSetFrom_method()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetFrom_method() && (compareTo3 = TBaseHelper.compareTo(this.from_method, other.from_method)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetCode()).compareTo(Boolean.valueOf(other.isSetCode()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetCode() && (compareTo2 = TBaseHelper.compareTo(this.code, other.code)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetMessage()).compareTo(Boolean.valueOf(other.isSetMessage()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetMessage() || (compareTo = TBaseHelper.compareTo(this.message, other.message)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<LogicException, _Fields> deepCopy2() {
        return new LogicException(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$thrift$basic$LogicException$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getFrom_service();
        }
        if (i11 == 2) {
            return getFrom_method();
        }
        if (i11 == 3) {
            return Integer.valueOf(getCode());
        }
        if (i11 == 4) {
            return getMessage();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$thrift$basic$LogicException$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetFrom_service();
        }
        if (i11 == 2) {
            return isSetFrom_method();
        }
        if (i11 == 3) {
            return isSetCode();
        }
        if (i11 == 4) {
            return isSetMessage();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$thrift$basic$LogicException$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetFrom_service();
                return;
            } else {
                setFrom_service((String) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetFrom_method();
                return;
            } else {
                setFrom_method((String) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetCode();
                return;
            } else {
                setCode(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetMessage();
        } else {
            setMessage((String) value);
        }
    }

    public boolean equals(LogicException that) {
        if (that == null) {
            return false;
        }
        boolean isSetFrom_service = isSetFrom_service();
        boolean isSetFrom_service2 = that.isSetFrom_service();
        if ((isSetFrom_service || isSetFrom_service2) && !(isSetFrom_service && isSetFrom_service2 && this.from_service.equals(that.from_service))) {
            return false;
        }
        boolean isSetFrom_method = isSetFrom_method();
        boolean isSetFrom_method2 = that.isSetFrom_method();
        if (((isSetFrom_method || isSetFrom_method2) && !(isSetFrom_method && isSetFrom_method2 && this.from_method.equals(that.from_method))) || this.code != that.code) {
            return false;
        }
        boolean isSetMessage = isSetMessage();
        boolean isSetMessage2 = that.isSetMessage();
        if (isSetMessage || isSetMessage2) {
            return isSetMessage && isSetMessage2 && this.message.equals(that.message);
        }
        return true;
    }

    public LogicException(String from_service, String from_method, int code) {
        this();
        this.from_service = from_service;
        this.from_method = from_method;
        this.code = code;
        setCodeIsSet(true);
    }

    public LogicException(LogicException other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.MESSAGE};
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetFrom_service()) {
            this.from_service = other.from_service;
        }
        if (other.isSetFrom_method()) {
            this.from_method = other.from_method;
        }
        this.code = other.code;
        if (other.isSetMessage()) {
            this.message = other.message;
        }
    }
}
