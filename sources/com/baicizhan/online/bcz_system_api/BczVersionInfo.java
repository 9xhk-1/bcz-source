package com.baicizhan.online.bcz_system_api;

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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class BczVersionInfo implements TBase<BczVersionInfo, _Fields>, Serializable, Cloneable, Comparable<BczVersionInfo> {
    private static final int __HAS_NEW_VERSION_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public boolean has_new_version;
    public String new_version;
    public String version_description;
    public String version_md5;
    public String version_url;
    private static final TStruct STRUCT_DESC = new TStruct("BczVersionInfo");
    private static final TField HAS_NEW_VERSION_FIELD_DESC = new TField("has_new_version", (byte) 2, 1);
    private static final TField NEW_VERSION_FIELD_DESC = new TField("new_version", (byte) 11, 2);
    private static final TField VERSION_URL_FIELD_DESC = new TField("version_url", (byte) 11, 3);
    private static final TField VERSION_MD5_FIELD_DESC = new TField("version_md5", (byte) 11, 4);
    private static final TField VERSION_DESCRIPTION_FIELD_DESC = new TField("version_description", (byte) 11, 5);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bcz_system_api.BczVersionInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$BczVersionInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bcz_system_api$BczVersionInfo$_Fields = iArr;
            try {
                iArr[_Fields.HAS_NEW_VERSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczVersionInfo$_Fields[_Fields.NEW_VERSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczVersionInfo$_Fields[_Fields.VERSION_URL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczVersionInfo$_Fields[_Fields.VERSION_MD5.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczVersionInfo$_Fields[_Fields.VERSION_DESCRIPTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BczVersionInfoStandardScheme extends StandardScheme<BczVersionInfo> {
        private BczVersionInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BczVersionInfo struct) throws TException {
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
                                if (s11 != 5) {
                                    TProtocolUtil.skip(iprot, b11);
                                } else if (b11 == 11) {
                                    struct.version_description = iprot.readString();
                                    struct.setVersion_descriptionIsSet(true);
                                } else {
                                    TProtocolUtil.skip(iprot, b11);
                                }
                            } else if (b11 == 11) {
                                struct.version_md5 = iprot.readString();
                                struct.setVersion_md5IsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 11) {
                            struct.version_url = iprot.readString();
                            struct.setVersion_urlIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.new_version = iprot.readString();
                        struct.setNew_versionIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 2) {
                    struct.has_new_version = iprot.readBool();
                    struct.setHas_new_versionIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetHas_new_version()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'has_new_version' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BczVersionInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BczVersionInfo.STRUCT_DESC);
            oprot.writeFieldBegin(BczVersionInfo.HAS_NEW_VERSION_FIELD_DESC);
            oprot.writeBool(struct.has_new_version);
            oprot.writeFieldEnd();
            if (struct.new_version != null) {
                oprot.writeFieldBegin(BczVersionInfo.NEW_VERSION_FIELD_DESC);
                oprot.writeString(struct.new_version);
                oprot.writeFieldEnd();
            }
            if (struct.version_url != null) {
                oprot.writeFieldBegin(BczVersionInfo.VERSION_URL_FIELD_DESC);
                oprot.writeString(struct.version_url);
                oprot.writeFieldEnd();
            }
            if (struct.version_md5 != null) {
                oprot.writeFieldBegin(BczVersionInfo.VERSION_MD5_FIELD_DESC);
                oprot.writeString(struct.version_md5);
                oprot.writeFieldEnd();
            }
            if (struct.version_description != null) {
                oprot.writeFieldBegin(BczVersionInfo.VERSION_DESCRIPTION_FIELD_DESC);
                oprot.writeString(struct.version_description);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BczVersionInfoStandardSchemeFactory implements SchemeFactory {
        private BczVersionInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BczVersionInfoStandardScheme getScheme() {
            return new BczVersionInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BczVersionInfoTupleScheme extends TupleScheme<BczVersionInfo> {
        private BczVersionInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BczVersionInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.has_new_version = tTupleProtocol.readBool();
            struct.setHas_new_versionIsSet(true);
            struct.new_version = tTupleProtocol.readString();
            struct.setNew_versionIsSet(true);
            struct.version_url = tTupleProtocol.readString();
            struct.setVersion_urlIsSet(true);
            struct.version_md5 = tTupleProtocol.readString();
            struct.setVersion_md5IsSet(true);
            struct.version_description = tTupleProtocol.readString();
            struct.setVersion_descriptionIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BczVersionInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeBool(struct.has_new_version);
            tTupleProtocol.writeString(struct.new_version);
            tTupleProtocol.writeString(struct.version_url);
            tTupleProtocol.writeString(struct.version_md5);
            tTupleProtocol.writeString(struct.version_description);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BczVersionInfoTupleSchemeFactory implements SchemeFactory {
        private BczVersionInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BczVersionInfoTupleScheme getScheme() {
            return new BczVersionInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        HAS_NEW_VERSION(1, "has_new_version"),
        NEW_VERSION(2, "new_version"),
        VERSION_URL(3, "version_url"),
        VERSION_MD5(4, "version_md5"),
        VERSION_DESCRIPTION(5, "version_description");

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
                return HAS_NEW_VERSION;
            }
            if (fieldId == 2) {
                return NEW_VERSION;
            }
            if (fieldId == 3) {
                return VERSION_URL;
            }
            if (fieldId == 4) {
                return VERSION_MD5;
            }
            if (fieldId != 5) {
                return null;
            }
            return VERSION_DESCRIPTION;
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
        hashMap.put(StandardScheme.class, new BczVersionInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BczVersionInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.HAS_NEW_VERSION, (_Fields) new FieldMetaData("has_new_version", (byte) 1, new FieldValueMetaData((byte) 2)));
        enumMap.put((EnumMap) _Fields.NEW_VERSION, (_Fields) new FieldMetaData("new_version", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.VERSION_URL, (_Fields) new FieldMetaData("version_url", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.VERSION_MD5, (_Fields) new FieldMetaData("version_md5", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.VERSION_DESCRIPTION, (_Fields) new FieldMetaData("version_description", (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BczVersionInfo.class, unmodifiableMap);
    }

    public BczVersionInfo() {
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
        setHas_new_versionIsSet(false);
        this.has_new_version = false;
        this.new_version = null;
        this.version_url = null;
        this.version_md5 = null;
        this.version_description = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BczVersionInfo)) {
            return equals((BczVersionInfo) that);
        }
        return false;
    }

    public String getNew_version() {
        return this.new_version;
    }

    public String getVersion_description() {
        return this.version_description;
    }

    public String getVersion_md5() {
        return this.version_md5;
    }

    public String getVersion_url() {
        return this.version_url;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isHas_new_version() {
        return this.has_new_version;
    }

    public boolean isSetHas_new_version() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetNew_version() {
        return this.new_version != null;
    }

    public boolean isSetVersion_description() {
        return this.version_description != null;
    }

    public boolean isSetVersion_md5() {
        return this.version_md5 != null;
    }

    public boolean isSetVersion_url() {
        return this.version_url != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BczVersionInfo setHas_new_version(boolean has_new_version) {
        this.has_new_version = has_new_version;
        setHas_new_versionIsSet(true);
        return this;
    }

    public void setHas_new_versionIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public BczVersionInfo setNew_version(String new_version) {
        this.new_version = new_version;
        return this;
    }

    public void setNew_versionIsSet(boolean value) {
        if (value) {
            return;
        }
        this.new_version = null;
    }

    public BczVersionInfo setVersion_description(String version_description) {
        this.version_description = version_description;
        return this;
    }

    public void setVersion_descriptionIsSet(boolean value) {
        if (value) {
            return;
        }
        this.version_description = null;
    }

    public BczVersionInfo setVersion_md5(String version_md5) {
        this.version_md5 = version_md5;
        return this;
    }

    public void setVersion_md5IsSet(boolean value) {
        if (value) {
            return;
        }
        this.version_md5 = null;
    }

    public BczVersionInfo setVersion_url(String version_url) {
        this.version_url = version_url;
        return this;
    }

    public void setVersion_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.version_url = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BczVersionInfo(");
        sb2.append("has_new_version:");
        sb2.append(this.has_new_version);
        sb2.append(j2.O);
        sb2.append("new_version:");
        String str = this.new_version;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("version_url:");
        String str2 = this.version_url;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("version_md5:");
        String str3 = this.version_md5;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(j2.O);
        sb2.append("version_description:");
        String str4 = this.version_description;
        if (str4 == null) {
            sb2.append("null");
        } else {
            sb2.append(str4);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetHas_new_version() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetNew_version() {
        this.new_version = null;
    }

    public void unsetVersion_description() {
        this.version_description = null;
    }

    public void unsetVersion_md5() {
        this.version_md5 = null;
    }

    public void unsetVersion_url() {
        this.version_url = null;
    }

    public void validate() throws TException {
        if (this.new_version == null) {
            throw new TProtocolException("Required field 'new_version' was not present! Struct: " + toString());
        }
        if (this.version_url == null) {
            throw new TProtocolException("Required field 'version_url' was not present! Struct: " + toString());
        }
        if (this.version_md5 == null) {
            throw new TProtocolException("Required field 'version_md5' was not present! Struct: " + toString());
        }
        if (this.version_description != null) {
            return;
        }
        throw new TProtocolException("Required field 'version_description' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BczVersionInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo6 = Boolean.valueOf(isSetHas_new_version()).compareTo(Boolean.valueOf(other.isSetHas_new_version()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetHas_new_version() && (compareTo5 = TBaseHelper.compareTo(this.has_new_version, other.has_new_version)) != 0) {
            return compareTo5;
        }
        int compareTo7 = Boolean.valueOf(isSetNew_version()).compareTo(Boolean.valueOf(other.isSetNew_version()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetNew_version() && (compareTo4 = TBaseHelper.compareTo(this.new_version, other.new_version)) != 0) {
            return compareTo4;
        }
        int compareTo8 = Boolean.valueOf(isSetVersion_url()).compareTo(Boolean.valueOf(other.isSetVersion_url()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetVersion_url() && (compareTo3 = TBaseHelper.compareTo(this.version_url, other.version_url)) != 0) {
            return compareTo3;
        }
        int compareTo9 = Boolean.valueOf(isSetVersion_md5()).compareTo(Boolean.valueOf(other.isSetVersion_md5()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetVersion_md5() && (compareTo2 = TBaseHelper.compareTo(this.version_md5, other.version_md5)) != 0) {
            return compareTo2;
        }
        int compareTo10 = Boolean.valueOf(isSetVersion_description()).compareTo(Boolean.valueOf(other.isSetVersion_description()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!isSetVersion_description() || (compareTo = TBaseHelper.compareTo(this.version_description, other.version_description)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BczVersionInfo, _Fields> deepCopy2() {
        return new BczVersionInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczVersionInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Boolean.valueOf(isHas_new_version());
        }
        if (i11 == 2) {
            return getNew_version();
        }
        if (i11 == 3) {
            return getVersion_url();
        }
        if (i11 == 4) {
            return getVersion_md5();
        }
        if (i11 == 5) {
            return getVersion_description();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczVersionInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetHas_new_version();
        }
        if (i11 == 2) {
            return isSetNew_version();
        }
        if (i11 == 3) {
            return isSetVersion_url();
        }
        if (i11 == 4) {
            return isSetVersion_md5();
        }
        if (i11 == 5) {
            return isSetVersion_description();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczVersionInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetHas_new_version();
                return;
            } else {
                setHas_new_version(((Boolean) value).booleanValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetNew_version();
                return;
            } else {
                setNew_version((String) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetVersion_url();
                return;
            } else {
                setVersion_url((String) value);
                return;
            }
        }
        if (i11 == 4) {
            if (value == null) {
                unsetVersion_md5();
                return;
            } else {
                setVersion_md5((String) value);
                return;
            }
        }
        if (i11 != 5) {
            return;
        }
        if (value == null) {
            unsetVersion_description();
        } else {
            setVersion_description((String) value);
        }
    }

    public BczVersionInfo(boolean has_new_version, String new_version, String version_url, String version_md5, String version_description) {
        this();
        this.has_new_version = has_new_version;
        setHas_new_versionIsSet(true);
        this.new_version = new_version;
        this.version_url = version_url;
        this.version_md5 = version_md5;
        this.version_description = version_description;
    }

    public boolean equals(BczVersionInfo that) {
        if (that == null || this.has_new_version != that.has_new_version) {
            return false;
        }
        boolean isSetNew_version = isSetNew_version();
        boolean isSetNew_version2 = that.isSetNew_version();
        if ((isSetNew_version || isSetNew_version2) && !(isSetNew_version && isSetNew_version2 && this.new_version.equals(that.new_version))) {
            return false;
        }
        boolean isSetVersion_url = isSetVersion_url();
        boolean isSetVersion_url2 = that.isSetVersion_url();
        if ((isSetVersion_url || isSetVersion_url2) && !(isSetVersion_url && isSetVersion_url2 && this.version_url.equals(that.version_url))) {
            return false;
        }
        boolean isSetVersion_md5 = isSetVersion_md5();
        boolean isSetVersion_md52 = that.isSetVersion_md5();
        if ((isSetVersion_md5 || isSetVersion_md52) && !(isSetVersion_md5 && isSetVersion_md52 && this.version_md5.equals(that.version_md5))) {
            return false;
        }
        boolean isSetVersion_description = isSetVersion_description();
        boolean isSetVersion_description2 = that.isSetVersion_description();
        if (isSetVersion_description || isSetVersion_description2) {
            return isSetVersion_description && isSetVersion_description2 && this.version_description.equals(that.version_description);
        }
        return true;
    }

    public BczVersionInfo(BczVersionInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.has_new_version = other.has_new_version;
        if (other.isSetNew_version()) {
            this.new_version = other.new_version;
        }
        if (other.isSetVersion_url()) {
            this.version_url = other.version_url;
        }
        if (other.isSetVersion_md5()) {
            this.version_md5 = other.version_md5;
        }
        if (other.isSetVersion_description()) {
            this.version_description = other.version_description;
        }
    }
}
