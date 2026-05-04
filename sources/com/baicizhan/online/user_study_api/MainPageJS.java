package com.baicizhan.online.user_study_api;

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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class MainPageJS implements TBase<MainPageJS, _Fields>, Serializable, Cloneable, Comparable<MainPageJS> {
    private static final int __VERSION_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String jsUrl;
    public long version;
    private static final TStruct STRUCT_DESC = new TStruct("MainPageJS");
    private static final TField VERSION_FIELD_DESC = new TField("version", (byte) 10, 1);
    private static final TField JS_URL_FIELD_DESC = new TField("jsUrl", (byte) 11, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.MainPageJS$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$MainPageJS$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$MainPageJS$_Fields = iArr;
            try {
                iArr[_Fields.VERSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$MainPageJS$_Fields[_Fields.JS_URL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MainPageJSStandardScheme extends StandardScheme<MainPageJS> {
        private MainPageJSStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, MainPageJS struct) throws TException {
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
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 11) {
                        struct.jsUrl = iprot.readString();
                        struct.setJsUrlIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 10) {
                    struct.version = iprot.readI64();
                    struct.setVersionIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetVersion()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'version' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, MainPageJS struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(MainPageJS.STRUCT_DESC);
            oprot.writeFieldBegin(MainPageJS.VERSION_FIELD_DESC);
            oprot.writeI64(struct.version);
            oprot.writeFieldEnd();
            if (struct.jsUrl != null) {
                oprot.writeFieldBegin(MainPageJS.JS_URL_FIELD_DESC);
                oprot.writeString(struct.jsUrl);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MainPageJSStandardSchemeFactory implements SchemeFactory {
        private MainPageJSStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public MainPageJSStandardScheme getScheme() {
            return new MainPageJSStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MainPageJSTupleScheme extends TupleScheme<MainPageJS> {
        private MainPageJSTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, MainPageJS struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.version = tTupleProtocol.readI64();
            struct.setVersionIsSet(true);
            struct.jsUrl = tTupleProtocol.readString();
            struct.setJsUrlIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, MainPageJS struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI64(struct.version);
            tTupleProtocol.writeString(struct.jsUrl);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MainPageJSTupleSchemeFactory implements SchemeFactory {
        private MainPageJSTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public MainPageJSTupleScheme getScheme() {
            return new MainPageJSTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        VERSION(1, "version"),
        JS_URL(2, "jsUrl");

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
                return VERSION;
            }
            if (fieldId != 2) {
                return null;
            }
            return JS_URL;
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
        hashMap.put(StandardScheme.class, new MainPageJSStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new MainPageJSTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.VERSION, (_Fields) new FieldMetaData("version", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.JS_URL, (_Fields) new FieldMetaData("jsUrl", (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(MainPageJS.class, unmodifiableMap);
    }

    public MainPageJS() {
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
        setVersionIsSet(false);
        this.version = 0L;
        this.jsUrl = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof MainPageJS)) {
            return equals((MainPageJS) that);
        }
        return false;
    }

    public String getJsUrl() {
        return this.jsUrl;
    }

    public long getVersion() {
        return this.version;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetJsUrl() {
        return this.jsUrl != null;
    }

    public boolean isSetVersion() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public MainPageJS setJsUrl(String jsUrl) {
        this.jsUrl = jsUrl;
        return this;
    }

    public void setJsUrlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.jsUrl = null;
    }

    public MainPageJS setVersion(long version) {
        this.version = version;
        setVersionIsSet(true);
        return this;
    }

    public void setVersionIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MainPageJS(");
        sb2.append("version:");
        sb2.append(this.version);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("jsUrl:");
        String str = this.jsUrl;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetJsUrl() {
        this.jsUrl = null;
    }

    public void unsetVersion() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void validate() throws TException {
        if (this.jsUrl != null) {
            return;
        }
        throw new TProtocolException("Required field 'jsUrl' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(MainPageJS other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetVersion()).compareTo(Boolean.valueOf(other.isSetVersion()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetVersion() && (compareTo2 = TBaseHelper.compareTo(this.version, other.version)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetJsUrl()).compareTo(Boolean.valueOf(other.isSetJsUrl()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetJsUrl() || (compareTo = TBaseHelper.compareTo(this.jsUrl, other.jsUrl)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<MainPageJS, _Fields> deepCopy2() {
        return new MainPageJS(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$MainPageJS$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Long.valueOf(getVersion());
        }
        if (i11 == 2) {
            return getJsUrl();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$MainPageJS$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetVersion();
        }
        if (i11 == 2) {
            return isSetJsUrl();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$MainPageJS$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetVersion();
                return;
            } else {
                setVersion(((Long) value).longValue());
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetJsUrl();
        } else {
            setJsUrl((String) value);
        }
    }

    public MainPageJS(long version, String jsUrl) {
        this();
        this.version = version;
        setVersionIsSet(true);
        this.jsUrl = jsUrl;
    }

    public boolean equals(MainPageJS that) {
        if (that == null || this.version != that.version) {
            return false;
        }
        boolean isSetJsUrl = isSetJsUrl();
        boolean isSetJsUrl2 = that.isSetJsUrl();
        if (isSetJsUrl || isSetJsUrl2) {
            return isSetJsUrl && isSetJsUrl2 && this.jsUrl.equals(that.jsUrl);
        }
        return true;
    }

    public MainPageJS(MainPageJS other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.version = other.version;
        if (other.isSetJsUrl()) {
            this.jsUrl = other.jsUrl;
        }
    }
}
