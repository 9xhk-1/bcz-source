package com.baicizhan.online.course_api;

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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class LineInfo implements TBase<LineInfo, _Fields>, Serializable, Cloneable, Comparable<LineInfo> {
    private static final int __TYPE_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String line_name;
    public String line_url;
    private _Fields[] optionals;
    public int type;
    private static final TStruct STRUCT_DESC = new TStruct("LineInfo");
    private static final TField LINE_NAME_FIELD_DESC = new TField("line_name", (byte) 11, 1);
    private static final TField LINE_URL_FIELD_DESC = new TField("line_url", (byte) 11, 2);
    private static final TField TYPE_FIELD_DESC = new TField("type", (byte) 8, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.course_api.LineInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$course_api$LineInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$course_api$LineInfo$_Fields = iArr;
            try {
                iArr[_Fields.LINE_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$LineInfo$_Fields[_Fields.LINE_URL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$LineInfo$_Fields[_Fields.TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class LineInfoStandardScheme extends StandardScheme<LineInfo> {
        private LineInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, LineInfo struct) throws TException {
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
                        } else if (b11 == 8) {
                            struct.type = iprot.readI32();
                            struct.setTypeIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.line_url = iprot.readString();
                        struct.setLine_urlIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.line_name = iprot.readString();
                    struct.setLine_nameIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetType()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'type' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, LineInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(LineInfo.STRUCT_DESC);
            if (struct.line_name != null) {
                oprot.writeFieldBegin(LineInfo.LINE_NAME_FIELD_DESC);
                oprot.writeString(struct.line_name);
                oprot.writeFieldEnd();
            }
            if (struct.line_url != null && struct.isSetLine_url()) {
                oprot.writeFieldBegin(LineInfo.LINE_URL_FIELD_DESC);
                oprot.writeString(struct.line_url);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(LineInfo.TYPE_FIELD_DESC);
            oprot.writeI32(struct.type);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class LineInfoStandardSchemeFactory implements SchemeFactory {
        private LineInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public LineInfoStandardScheme getScheme() {
            return new LineInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class LineInfoTupleScheme extends TupleScheme<LineInfo> {
        private LineInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, LineInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.line_name = tTupleProtocol.readString();
            struct.setLine_nameIsSet(true);
            struct.type = tTupleProtocol.readI32();
            struct.setTypeIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                struct.line_url = tTupleProtocol.readString();
                struct.setLine_urlIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, LineInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.line_name);
            tTupleProtocol.writeI32(struct.type);
            BitSet bitSet = new BitSet();
            if (struct.isSetLine_url()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetLine_url()) {
                tTupleProtocol.writeString(struct.line_url);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class LineInfoTupleSchemeFactory implements SchemeFactory {
        private LineInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public LineInfoTupleScheme getScheme() {
            return new LineInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        LINE_NAME(1, "line_name"),
        LINE_URL(2, "line_url"),
        TYPE(3, "type");

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
                return LINE_NAME;
            }
            if (fieldId == 2) {
                return LINE_URL;
            }
            if (fieldId != 3) {
                return null;
            }
            return TYPE;
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
        hashMap.put(StandardScheme.class, new LineInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new LineInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.LINE_NAME, (_Fields) new FieldMetaData("line_name", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.LINE_URL, (_Fields) new FieldMetaData("line_url", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.TYPE, (_Fields) new FieldMetaData("type", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(LineInfo.class, unmodifiableMap);
    }

    public LineInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.LINE_URL};
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
        this.line_name = null;
        this.line_url = null;
        setTypeIsSet(false);
        this.type = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof LineInfo)) {
            return equals((LineInfo) that);
        }
        return false;
    }

    public String getLine_name() {
        return this.line_name;
    }

    public String getLine_url() {
        return this.line_url;
    }

    public int getType() {
        return this.type;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetLine_name() {
        return this.line_name != null;
    }

    public boolean isSetLine_url() {
        return this.line_url != null;
    }

    public boolean isSetType() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public LineInfo setLine_name(String line_name) {
        this.line_name = line_name;
        return this;
    }

    public void setLine_nameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.line_name = null;
    }

    public LineInfo setLine_url(String line_url) {
        this.line_url = line_url;
        return this;
    }

    public void setLine_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.line_url = null;
    }

    public LineInfo setType(int type) {
        this.type = type;
        setTypeIsSet(true);
        return this;
    }

    public void setTypeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LineInfo(");
        sb2.append("line_name:");
        String str = this.line_name;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        if (isSetLine_url()) {
            sb2.append(j2.O);
            sb2.append("line_url:");
            String str2 = this.line_url;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
        }
        sb2.append(j2.O);
        sb2.append("type:");
        sb2.append(this.type);
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetLine_name() {
        this.line_name = null;
    }

    public void unsetLine_url() {
        this.line_url = null;
    }

    public void unsetType() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void validate() throws TException {
        if (this.line_name != null) {
            return;
        }
        throw new TProtocolException("Required field 'line_name' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(LineInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetLine_name()).compareTo(Boolean.valueOf(other.isSetLine_name()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetLine_name() && (compareTo3 = TBaseHelper.compareTo(this.line_name, other.line_name)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetLine_url()).compareTo(Boolean.valueOf(other.isSetLine_url()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetLine_url() && (compareTo2 = TBaseHelper.compareTo(this.line_url, other.line_url)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetType()).compareTo(Boolean.valueOf(other.isSetType()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetType() || (compareTo = TBaseHelper.compareTo(this.type, other.type)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<LineInfo, _Fields> deepCopy2() {
        return new LineInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$LineInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getLine_name();
        }
        if (i11 == 2) {
            return getLine_url();
        }
        if (i11 == 3) {
            return Integer.valueOf(getType());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$LineInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetLine_name();
        }
        if (i11 == 2) {
            return isSetLine_url();
        }
        if (i11 == 3) {
            return isSetType();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$LineInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetLine_name();
                return;
            } else {
                setLine_name((String) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetLine_url();
                return;
            } else {
                setLine_url((String) value);
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetType();
        } else {
            setType(((Integer) value).intValue());
        }
    }

    public boolean equals(LineInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetLine_name = isSetLine_name();
        boolean isSetLine_name2 = that.isSetLine_name();
        if ((isSetLine_name || isSetLine_name2) && !(isSetLine_name && isSetLine_name2 && this.line_name.equals(that.line_name))) {
            return false;
        }
        boolean isSetLine_url = isSetLine_url();
        boolean isSetLine_url2 = that.isSetLine_url();
        return (!(isSetLine_url || isSetLine_url2) || (isSetLine_url && isSetLine_url2 && this.line_url.equals(that.line_url))) && this.type == that.type;
    }

    public LineInfo(String line_name, int type) {
        this();
        this.line_name = line_name;
        this.type = type;
        setTypeIsSet(true);
    }

    public LineInfo(LineInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.LINE_URL};
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetLine_name()) {
            this.line_name = other.line_name;
        }
        if (other.isSetLine_url()) {
            this.line_url = other.line_url;
        }
        this.type = other.type;
    }
}
