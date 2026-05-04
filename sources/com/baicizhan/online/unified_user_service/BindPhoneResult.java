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
import org.apache.thrift.protocol.TProtocolUtil;
import org.apache.thrift.protocol.TStruct;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.transport.TIOStreamTransport;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class BindPhoneResult implements TBase<BindPhoneResult, _Fields>, Serializable, Cloneable, Comparable<BindPhoneResult> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private _Fields[] optionals;
    public String phone;
    private static final TStruct STRUCT_DESC = new TStruct("BindPhoneResult");
    private static final TField PHONE_FIELD_DESC = new TField("phone", (byte) 11, 1);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.unified_user_service.BindPhoneResult$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$unified_user_service$BindPhoneResult$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$unified_user_service$BindPhoneResult$_Fields = iArr;
            try {
                iArr[_Fields.PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BindPhoneResultStandardScheme extends StandardScheme<BindPhoneResult> {
        private BindPhoneResultStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BindPhoneResult struct) throws TException {
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
                    struct.phone = iprot.readString();
                    struct.setPhoneIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BindPhoneResult struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BindPhoneResult.STRUCT_DESC);
            if (struct.phone != null && struct.isSetPhone()) {
                oprot.writeFieldBegin(BindPhoneResult.PHONE_FIELD_DESC);
                oprot.writeString(struct.phone);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BindPhoneResultStandardSchemeFactory implements SchemeFactory {
        private BindPhoneResultStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BindPhoneResultStandardScheme getScheme() {
            return new BindPhoneResultStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BindPhoneResultTupleScheme extends TupleScheme<BindPhoneResult> {
        private BindPhoneResultTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BindPhoneResult struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            if (tTupleProtocol.readBitSet(1).get(0)) {
                struct.phone = tTupleProtocol.readString();
                struct.setPhoneIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BindPhoneResult struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BitSet bitSet = new BitSet();
            if (struct.isSetPhone()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetPhone()) {
                tTupleProtocol.writeString(struct.phone);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BindPhoneResultTupleSchemeFactory implements SchemeFactory {
        private BindPhoneResultTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BindPhoneResultTupleScheme getScheme() {
            return new BindPhoneResultTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        PHONE(1, "phone");

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
            return PHONE;
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
        hashMap.put(StandardScheme.class, new BindPhoneResultStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BindPhoneResultTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.PHONE, (_Fields) new FieldMetaData("phone", (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BindPhoneResult.class, unmodifiableMap);
    }

    public BindPhoneResult() {
        this.optionals = new _Fields[]{_Fields.PHONE};
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
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BindPhoneResult)) {
            return equals((BindPhoneResult) that);
        }
        return false;
    }

    public String getPhone() {
        return this.phone;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetPhone() {
        return this.phone != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BindPhoneResult setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public void setPhoneIsSet(boolean value) {
        if (value) {
            return;
        }
        this.phone = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BindPhoneResult(");
        if (isSetPhone()) {
            sb2.append("phone:");
            String str = this.phone;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetPhone() {
        this.phone = null;
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BindPhoneResult other) {
        int compareTo;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(isSetPhone()).compareTo(Boolean.valueOf(other.isSetPhone()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!isSetPhone() || (compareTo = TBaseHelper.compareTo(this.phone, other.phone)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BindPhoneResult, _Fields> deepCopy2() {
        return new BindPhoneResult(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        if (AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$BindPhoneResult$_Fields[field.ordinal()] == 1) {
            return getPhone();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        if (AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$BindPhoneResult$_Fields[field.ordinal()] == 1) {
            return isSetPhone();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        if (AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$BindPhoneResult$_Fields[field.ordinal()] != 1) {
            return;
        }
        if (value == null) {
            unsetPhone();
        } else {
            setPhone((String) value);
        }
    }

    public BindPhoneResult(BindPhoneResult other) {
        this.optionals = new _Fields[]{_Fields.PHONE};
        if (other.isSetPhone()) {
            this.phone = other.phone;
        }
    }

    public boolean equals(BindPhoneResult that) {
        if (that == null) {
            return false;
        }
        boolean isSetPhone = isSetPhone();
        boolean isSetPhone2 = that.isSetPhone();
        if (isSetPhone || isSetPhone2) {
            return isSetPhone && isSetPhone2 && this.phone.equals(that.phone);
        }
        return true;
    }

    public void validate() throws TException {
    }
}
