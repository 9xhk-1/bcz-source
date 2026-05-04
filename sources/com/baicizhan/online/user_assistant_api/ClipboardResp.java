package com.baicizhan.online.user_assistant_api;

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
/* loaded from: classes6.dex */
public class ClipboardResp implements TBase<ClipboardResp, _Fields>, Serializable, Cloneable, Comparable<ClipboardResp> {
    private static final int __BUSINESSID_ISSET_ID = 1;
    private static final int __STYLE_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int businessId;
    public String json;
    public int style;
    private static final TStruct STRUCT_DESC = new TStruct("ClipboardResp");
    private static final TField STYLE_FIELD_DESC = new TField("style", (byte) 8, 1);
    private static final TField JSON_FIELD_DESC = new TField("json", (byte) 11, 2);
    private static final TField BUSINESS_ID_FIELD_DESC = new TField(ma.b.f72889a1, (byte) 8, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_assistant_api.ClipboardResp$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_assistant_api$ClipboardResp$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_assistant_api$ClipboardResp$_Fields = iArr;
            try {
                iArr[_Fields.STYLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$ClipboardResp$_Fields[_Fields.JSON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$ClipboardResp$_Fields[_Fields.BUSINESS_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ClipboardRespStandardScheme extends StandardScheme<ClipboardResp> {
        private ClipboardRespStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, ClipboardResp struct) throws TException {
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
                            struct.businessId = iprot.readI32();
                            struct.setBusinessIdIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.json = iprot.readString();
                        struct.setJsonIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.style = iprot.readI32();
                    struct.setStyleIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetStyle()) {
                throw new TProtocolException("Required field 'style' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetBusinessId()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'businessId' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, ClipboardResp struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(ClipboardResp.STRUCT_DESC);
            oprot.writeFieldBegin(ClipboardResp.STYLE_FIELD_DESC);
            oprot.writeI32(struct.style);
            oprot.writeFieldEnd();
            if (struct.json != null) {
                oprot.writeFieldBegin(ClipboardResp.JSON_FIELD_DESC);
                oprot.writeString(struct.json);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(ClipboardResp.BUSINESS_ID_FIELD_DESC);
            oprot.writeI32(struct.businessId);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ClipboardRespStandardSchemeFactory implements SchemeFactory {
        private ClipboardRespStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ClipboardRespStandardScheme getScheme() {
            return new ClipboardRespStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ClipboardRespTupleScheme extends TupleScheme<ClipboardResp> {
        private ClipboardRespTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, ClipboardResp struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.style = tTupleProtocol.readI32();
            struct.setStyleIsSet(true);
            struct.json = tTupleProtocol.readString();
            struct.setJsonIsSet(true);
            struct.businessId = tTupleProtocol.readI32();
            struct.setBusinessIdIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, ClipboardResp struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.style);
            tTupleProtocol.writeString(struct.json);
            tTupleProtocol.writeI32(struct.businessId);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ClipboardRespTupleSchemeFactory implements SchemeFactory {
        private ClipboardRespTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ClipboardRespTupleScheme getScheme() {
            return new ClipboardRespTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        STYLE(1, "style"),
        JSON(2, "json"),
        BUSINESS_ID(3, ma.b.f72889a1);

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
                return STYLE;
            }
            if (fieldId == 2) {
                return JSON;
            }
            if (fieldId != 3) {
                return null;
            }
            return BUSINESS_ID;
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
        hashMap.put(StandardScheme.class, new ClipboardRespStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new ClipboardRespTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.STYLE, (_Fields) new FieldMetaData("style", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.JSON, (_Fields) new FieldMetaData("json", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.BUSINESS_ID, (_Fields) new FieldMetaData(ma.b.f72889a1, (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(ClipboardResp.class, unmodifiableMap);
    }

    public ClipboardResp() {
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
        setStyleIsSet(false);
        this.style = 0;
        this.json = null;
        setBusinessIdIsSet(false);
        this.businessId = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof ClipboardResp)) {
            return equals((ClipboardResp) that);
        }
        return false;
    }

    public int getBusinessId() {
        return this.businessId;
    }

    public String getJson() {
        return this.json;
    }

    public int getStyle() {
        return this.style;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetBusinessId() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetJson() {
        return this.json != null;
    }

    public boolean isSetStyle() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public ClipboardResp setBusinessId(int businessId) {
        this.businessId = businessId;
        setBusinessIdIsSet(true);
        return this;
    }

    public void setBusinessIdIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public ClipboardResp setJson(String json) {
        this.json = json;
        return this;
    }

    public void setJsonIsSet(boolean value) {
        if (value) {
            return;
        }
        this.json = null;
    }

    public ClipboardResp setStyle(int style) {
        this.style = style;
        setStyleIsSet(true);
        return this;
    }

    public void setStyleIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ClipboardResp(");
        sb2.append("style:");
        sb2.append(this.style);
        sb2.append(j2.O);
        sb2.append("json:");
        String str = this.json;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("businessId:");
        sb2.append(this.businessId);
        sb2.append(j.f81007d);
        return sb2.toString();
    }

    public void unsetBusinessId() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetJson() {
        this.json = null;
    }

    public void unsetStyle() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void validate() throws TException {
        if (this.json != null) {
            return;
        }
        throw new TProtocolException("Required field 'json' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(ClipboardResp other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetStyle()).compareTo(Boolean.valueOf(other.isSetStyle()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetStyle() && (compareTo3 = TBaseHelper.compareTo(this.style, other.style)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetJson()).compareTo(Boolean.valueOf(other.isSetJson()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetJson() && (compareTo2 = TBaseHelper.compareTo(this.json, other.json)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetBusinessId()).compareTo(Boolean.valueOf(other.isSetBusinessId()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetBusinessId() || (compareTo = TBaseHelper.compareTo(this.businessId, other.businessId)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<ClipboardResp, _Fields> deepCopy2() {
        return new ClipboardResp(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$ClipboardResp$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getStyle());
        }
        if (i11 == 2) {
            return getJson();
        }
        if (i11 == 3) {
            return Integer.valueOf(getBusinessId());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$ClipboardResp$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetStyle();
        }
        if (i11 == 2) {
            return isSetJson();
        }
        if (i11 == 3) {
            return isSetBusinessId();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$ClipboardResp$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetStyle();
                return;
            } else {
                setStyle(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetJson();
                return;
            } else {
                setJson((String) value);
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetBusinessId();
        } else {
            setBusinessId(((Integer) value).intValue());
        }
    }

    public ClipboardResp(int style, String json, int businessId) {
        this();
        this.style = style;
        setStyleIsSet(true);
        this.json = json;
        this.businessId = businessId;
        setBusinessIdIsSet(true);
    }

    public boolean equals(ClipboardResp that) {
        if (that == null || this.style != that.style) {
            return false;
        }
        boolean isSetJson = isSetJson();
        boolean isSetJson2 = that.isSetJson();
        return (!(isSetJson || isSetJson2) || (isSetJson && isSetJson2 && this.json.equals(that.json))) && this.businessId == that.businessId;
    }

    public ClipboardResp(ClipboardResp other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.style = other.style;
        if (other.isSetJson()) {
            this.json = other.json;
        }
        this.businessId = other.businessId;
    }
}
