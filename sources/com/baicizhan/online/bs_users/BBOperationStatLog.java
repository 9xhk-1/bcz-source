package com.baicizhan.online.bs_users;

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
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class BBOperationStatLog implements TBase<BBOperationStatLog, _Fields>, Serializable, Cloneable, Comparable<BBOperationStatLog> {
    private static final int __OP_TIME_ISSET_ID = 1;
    private static final int __OP_VALUE_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String op_name;
    public long op_time;
    public int op_value;
    private static final TStruct STRUCT_DESC = new TStruct("BBOperationStatLog");
    private static final TField OP_NAME_FIELD_DESC = new TField("op_name", (byte) 11, 1);
    private static final TField OP_VALUE_FIELD_DESC = new TField("op_value", (byte) 8, 2);
    private static final TField OP_TIME_FIELD_DESC = new TField("op_time", (byte) 10, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_users.BBOperationStatLog$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_users$BBOperationStatLog$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_users$BBOperationStatLog$_Fields = iArr;
            try {
                iArr[_Fields.OP_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BBOperationStatLog$_Fields[_Fields.OP_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BBOperationStatLog$_Fields[_Fields.OP_TIME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBOperationStatLogStandardScheme extends StandardScheme<BBOperationStatLog> {
        private BBOperationStatLogStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BBOperationStatLog struct) throws TException {
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
                        } else if (b11 == 10) {
                            struct.op_time = iprot.readI64();
                            struct.setOp_timeIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.op_value = iprot.readI32();
                        struct.setOp_valueIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.op_name = iprot.readString();
                    struct.setOp_nameIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetOp_value()) {
                throw new TProtocolException("Required field 'op_value' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetOp_time()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'op_time' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BBOperationStatLog struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BBOperationStatLog.STRUCT_DESC);
            if (struct.op_name != null) {
                oprot.writeFieldBegin(BBOperationStatLog.OP_NAME_FIELD_DESC);
                oprot.writeString(struct.op_name);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(BBOperationStatLog.OP_VALUE_FIELD_DESC);
            oprot.writeI32(struct.op_value);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(BBOperationStatLog.OP_TIME_FIELD_DESC);
            oprot.writeI64(struct.op_time);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBOperationStatLogStandardSchemeFactory implements SchemeFactory {
        private BBOperationStatLogStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBOperationStatLogStandardScheme getScheme() {
            return new BBOperationStatLogStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBOperationStatLogTupleScheme extends TupleScheme<BBOperationStatLog> {
        private BBOperationStatLogTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BBOperationStatLog struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.op_name = tTupleProtocol.readString();
            struct.setOp_nameIsSet(true);
            struct.op_value = tTupleProtocol.readI32();
            struct.setOp_valueIsSet(true);
            struct.op_time = tTupleProtocol.readI64();
            struct.setOp_timeIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BBOperationStatLog struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.op_name);
            tTupleProtocol.writeI32(struct.op_value);
            tTupleProtocol.writeI64(struct.op_time);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBOperationStatLogTupleSchemeFactory implements SchemeFactory {
        private BBOperationStatLogTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBOperationStatLogTupleScheme getScheme() {
            return new BBOperationStatLogTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        OP_NAME(1, "op_name"),
        OP_VALUE(2, "op_value"),
        OP_TIME(3, "op_time");

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
                return OP_NAME;
            }
            if (fieldId == 2) {
                return OP_VALUE;
            }
            if (fieldId != 3) {
                return null;
            }
            return OP_TIME;
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
        hashMap.put(StandardScheme.class, new BBOperationStatLogStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BBOperationStatLogTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.OP_NAME, (_Fields) new FieldMetaData("op_name", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.OP_VALUE, (_Fields) new FieldMetaData("op_value", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.OP_TIME, (_Fields) new FieldMetaData("op_time", (byte) 1, new FieldValueMetaData((byte) 10)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BBOperationStatLog.class, unmodifiableMap);
    }

    public BBOperationStatLog() {
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
        this.op_name = null;
        setOp_valueIsSet(false);
        this.op_value = 0;
        setOp_timeIsSet(false);
        this.op_time = 0L;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BBOperationStatLog)) {
            return equals((BBOperationStatLog) that);
        }
        return false;
    }

    public String getOp_name() {
        return this.op_name;
    }

    public long getOp_time() {
        return this.op_time;
    }

    public int getOp_value() {
        return this.op_value;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetOp_name() {
        return this.op_name != null;
    }

    public boolean isSetOp_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetOp_value() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BBOperationStatLog setOp_name(String op_name) {
        this.op_name = op_name;
        return this;
    }

    public void setOp_nameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.op_name = null;
    }

    public BBOperationStatLog setOp_time(long op_time) {
        this.op_time = op_time;
        setOp_timeIsSet(true);
        return this;
    }

    public void setOp_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public BBOperationStatLog setOp_value(int op_value) {
        this.op_value = op_value;
        setOp_valueIsSet(true);
        return this;
    }

    public void setOp_valueIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BBOperationStatLog(");
        sb2.append("op_name:");
        String str = this.op_name;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("op_value:");
        sb2.append(this.op_value);
        sb2.append(j2.O);
        sb2.append("op_time:");
        sb2.append(this.op_time);
        sb2.append(j.f81007d);
        return sb2.toString();
    }

    public void unsetOp_name() {
        this.op_name = null;
    }

    public void unsetOp_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetOp_value() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void validate() throws TException {
        if (this.op_name != null) {
            return;
        }
        throw new TProtocolException("Required field 'op_name' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BBOperationStatLog other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetOp_name()).compareTo(Boolean.valueOf(other.isSetOp_name()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetOp_name() && (compareTo3 = TBaseHelper.compareTo(this.op_name, other.op_name)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetOp_value()).compareTo(Boolean.valueOf(other.isSetOp_value()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetOp_value() && (compareTo2 = TBaseHelper.compareTo(this.op_value, other.op_value)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetOp_time()).compareTo(Boolean.valueOf(other.isSetOp_time()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetOp_time() || (compareTo = TBaseHelper.compareTo(this.op_time, other.op_time)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BBOperationStatLog, _Fields> deepCopy2() {
        return new BBOperationStatLog(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BBOperationStatLog$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getOp_name();
        }
        if (i11 == 2) {
            return Integer.valueOf(getOp_value());
        }
        if (i11 == 3) {
            return Long.valueOf(getOp_time());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BBOperationStatLog$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetOp_name();
        }
        if (i11 == 2) {
            return isSetOp_value();
        }
        if (i11 == 3) {
            return isSetOp_time();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BBOperationStatLog$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetOp_name();
                return;
            } else {
                setOp_name((String) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetOp_value();
                return;
            } else {
                setOp_value(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetOp_time();
        } else {
            setOp_time(((Long) value).longValue());
        }
    }

    public BBOperationStatLog(String op_name, int op_value, long op_time) {
        this();
        this.op_name = op_name;
        this.op_value = op_value;
        setOp_valueIsSet(true);
        this.op_time = op_time;
        setOp_timeIsSet(true);
    }

    public boolean equals(BBOperationStatLog that) {
        if (that == null) {
            return false;
        }
        boolean isSetOp_name = isSetOp_name();
        boolean isSetOp_name2 = that.isSetOp_name();
        return (!(isSetOp_name || isSetOp_name2) || (isSetOp_name && isSetOp_name2 && this.op_name.equals(that.op_name))) && this.op_value == that.op_value && this.op_time == that.op_time;
    }

    public BBOperationStatLog(BBOperationStatLog other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetOp_name()) {
            this.op_name = other.op_name;
        }
        this.op_value = other.op_value;
        this.op_time = other.op_time;
    }
}
