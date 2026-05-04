package com.baicizhan.online.hero_api;

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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class HeroApiException extends TException implements TBase<HeroApiException, _Fields>, Serializable, Cloneable, Comparable<HeroApiException> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public String message;
    private static final TStruct STRUCT_DESC = new TStruct("HeroApiException");
    private static final TField MESSAGE_FIELD_DESC = new TField("message", (byte) 11, 1);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.hero_api.HeroApiException$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$hero_api$HeroApiException$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$hero_api$HeroApiException$_Fields = iArr;
            try {
                iArr[_Fields.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class HeroApiExceptionStandardScheme extends StandardScheme<HeroApiException> {
        private HeroApiExceptionStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, HeroApiException struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    struct.validate();
                    return;
                }
                if (readFieldBegin.f77768id != 1) {
                    TProtocolUtil.skip(iprot, b11);
                } else if (b11 == 11) {
                    struct.message = iprot.readString();
                    struct.setMessageIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, HeroApiException struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(HeroApiException.STRUCT_DESC);
            if (struct.message != null) {
                oprot.writeFieldBegin(HeroApiException.MESSAGE_FIELD_DESC);
                oprot.writeString(struct.message);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class HeroApiExceptionStandardSchemeFactory implements SchemeFactory {
        private HeroApiExceptionStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public HeroApiExceptionStandardScheme getScheme() {
            return new HeroApiExceptionStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class HeroApiExceptionTupleScheme extends TupleScheme<HeroApiException> {
        private HeroApiExceptionTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, HeroApiException struct) throws TException {
            struct.message = ((TTupleProtocol) prot).readString();
            struct.setMessageIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, HeroApiException struct) throws TException {
            ((TTupleProtocol) prot).writeString(struct.message);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class HeroApiExceptionTupleSchemeFactory implements SchemeFactory {
        private HeroApiExceptionTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public HeroApiExceptionTupleScheme getScheme() {
            return new HeroApiExceptionTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        MESSAGE(1, "message");

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
            if (fieldId != 1) {
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
        hashMap.put(StandardScheme.class, new HeroApiExceptionStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new HeroApiExceptionTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.MESSAGE, (_Fields) new FieldMetaData("message", (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(HeroApiException.class, unmodifiableMap);
    }

    public HeroApiException() {
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
        this.message = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof HeroApiException)) {
            return equals((HeroApiException) that);
        }
        return false;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetMessage() {
        return this.message != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public HeroApiException setMessage(String message) {
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
        StringBuilder sb2 = new StringBuilder("HeroApiException(");
        sb2.append("message:");
        String str = this.message;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetMessage() {
        this.message = null;
    }

    public void validate() throws TException {
        if (this.message != null) {
            return;
        }
        throw new TProtocolException("Required field 'message' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    public HeroApiException(String message) {
        this();
        this.message = message;
    }

    @Override // java.lang.Comparable
    public int compareTo(HeroApiException other) {
        int compareTo;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(isSetMessage()).compareTo(Boolean.valueOf(other.isSetMessage()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!isSetMessage() || (compareTo = TBaseHelper.compareTo(this.message, other.message)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<HeroApiException, _Fields> deepCopy2() {
        return new HeroApiException(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        if (AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$HeroApiException$_Fields[field.ordinal()] == 1) {
            return getMessage();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        if (AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$HeroApiException$_Fields[field.ordinal()] == 1) {
            return isSetMessage();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        if (AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$HeroApiException$_Fields[field.ordinal()] != 1) {
            return;
        }
        if (value == null) {
            unsetMessage();
        } else {
            setMessage((String) value);
        }
    }

    public boolean equals(HeroApiException that) {
        if (that == null) {
            return false;
        }
        boolean isSetMessage = isSetMessage();
        boolean isSetMessage2 = that.isSetMessage();
        if (isSetMessage || isSetMessage2) {
            return isSetMessage && isSetMessage2 && this.message.equals(that.message);
        }
        return true;
    }

    public HeroApiException(HeroApiException other) {
        if (other.isSetMessage()) {
            this.message = other.message;
        }
    }
}
