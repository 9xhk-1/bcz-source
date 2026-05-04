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
public class AppNewVersionResult implements TBase<AppNewVersionResult, _Fields>, Serializable, Cloneable, Comparable<AppNewVersionResult> {
    private static final int __TYPE_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String new_version;
    public int type;
    public String version_description;
    private static final TStruct STRUCT_DESC = new TStruct("AppNewVersionResult");
    private static final TField TYPE_FIELD_DESC = new TField("type", (byte) 8, 1);
    private static final TField VERSION_DESCRIPTION_FIELD_DESC = new TField("version_description", (byte) 11, 2);
    private static final TField NEW_VERSION_FIELD_DESC = new TField("new_version", (byte) 11, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bcz_system_api.AppNewVersionResult$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$AppNewVersionResult$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bcz_system_api$AppNewVersionResult$_Fields = iArr;
            try {
                iArr[_Fields.TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$AppNewVersionResult$_Fields[_Fields.VERSION_DESCRIPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$AppNewVersionResult$_Fields[_Fields.NEW_VERSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AppNewVersionResultStandardScheme extends StandardScheme<AppNewVersionResult> {
        private AppNewVersionResultStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, AppNewVersionResult struct) throws TException {
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
                        } else if (b11 == 11) {
                            struct.new_version = iprot.readString();
                            struct.setNew_versionIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.version_description = iprot.readString();
                        struct.setVersion_descriptionIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.type = iprot.readI32();
                    struct.setTypeIsSet(true);
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
        public void write(TProtocol oprot, AppNewVersionResult struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(AppNewVersionResult.STRUCT_DESC);
            oprot.writeFieldBegin(AppNewVersionResult.TYPE_FIELD_DESC);
            oprot.writeI32(struct.type);
            oprot.writeFieldEnd();
            if (struct.version_description != null) {
                oprot.writeFieldBegin(AppNewVersionResult.VERSION_DESCRIPTION_FIELD_DESC);
                oprot.writeString(struct.version_description);
                oprot.writeFieldEnd();
            }
            if (struct.new_version != null) {
                oprot.writeFieldBegin(AppNewVersionResult.NEW_VERSION_FIELD_DESC);
                oprot.writeString(struct.new_version);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AppNewVersionResultStandardSchemeFactory implements SchemeFactory {
        private AppNewVersionResultStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AppNewVersionResultStandardScheme getScheme() {
            return new AppNewVersionResultStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AppNewVersionResultTupleScheme extends TupleScheme<AppNewVersionResult> {
        private AppNewVersionResultTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, AppNewVersionResult struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.type = tTupleProtocol.readI32();
            struct.setTypeIsSet(true);
            struct.version_description = tTupleProtocol.readString();
            struct.setVersion_descriptionIsSet(true);
            struct.new_version = tTupleProtocol.readString();
            struct.setNew_versionIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, AppNewVersionResult struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.type);
            tTupleProtocol.writeString(struct.version_description);
            tTupleProtocol.writeString(struct.new_version);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AppNewVersionResultTupleSchemeFactory implements SchemeFactory {
        private AppNewVersionResultTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AppNewVersionResultTupleScheme getScheme() {
            return new AppNewVersionResultTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TYPE(1, "type"),
        VERSION_DESCRIPTION(2, "version_description"),
        NEW_VERSION(3, "new_version");

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
                return TYPE;
            }
            if (fieldId == 2) {
                return VERSION_DESCRIPTION;
            }
            if (fieldId != 3) {
                return null;
            }
            return NEW_VERSION;
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
        hashMap.put(StandardScheme.class, new AppNewVersionResultStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new AppNewVersionResultTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TYPE, (_Fields) new FieldMetaData("type", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.VERSION_DESCRIPTION, (_Fields) new FieldMetaData("version_description", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.NEW_VERSION, (_Fields) new FieldMetaData("new_version", (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(AppNewVersionResult.class, unmodifiableMap);
    }

    public AppNewVersionResult() {
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
        setTypeIsSet(false);
        this.type = 0;
        this.version_description = null;
        this.new_version = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof AppNewVersionResult)) {
            return equals((AppNewVersionResult) that);
        }
        return false;
    }

    public String getNew_version() {
        return this.new_version;
    }

    public int getType() {
        return this.type;
    }

    public String getVersion_description() {
        return this.version_description;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetNew_version() {
        return this.new_version != null;
    }

    public boolean isSetType() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetVersion_description() {
        return this.version_description != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public AppNewVersionResult setNew_version(String new_version) {
        this.new_version = new_version;
        return this;
    }

    public void setNew_versionIsSet(boolean value) {
        if (value) {
            return;
        }
        this.new_version = null;
    }

    public AppNewVersionResult setType(int type) {
        this.type = type;
        setTypeIsSet(true);
        return this;
    }

    public void setTypeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public AppNewVersionResult setVersion_description(String version_description) {
        this.version_description = version_description;
        return this;
    }

    public void setVersion_descriptionIsSet(boolean value) {
        if (value) {
            return;
        }
        this.version_description = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AppNewVersionResult(");
        sb2.append("type:");
        sb2.append(this.type);
        sb2.append(j2.O);
        sb2.append("version_description:");
        String str = this.version_description;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("new_version:");
        String str2 = this.new_version;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetNew_version() {
        this.new_version = null;
    }

    public void unsetType() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetVersion_description() {
        this.version_description = null;
    }

    public void validate() throws TException {
        if (this.version_description == null) {
            throw new TProtocolException("Required field 'version_description' was not present! Struct: " + toString());
        }
        if (this.new_version != null) {
            return;
        }
        throw new TProtocolException("Required field 'new_version' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(AppNewVersionResult other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetType()).compareTo(Boolean.valueOf(other.isSetType()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetType() && (compareTo3 = TBaseHelper.compareTo(this.type, other.type)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetVersion_description()).compareTo(Boolean.valueOf(other.isSetVersion_description()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetVersion_description() && (compareTo2 = TBaseHelper.compareTo(this.version_description, other.version_description)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetNew_version()).compareTo(Boolean.valueOf(other.isSetNew_version()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetNew_version() || (compareTo = TBaseHelper.compareTo(this.new_version, other.new_version)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<AppNewVersionResult, _Fields> deepCopy2() {
        return new AppNewVersionResult(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$AppNewVersionResult$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getType());
        }
        if (i11 == 2) {
            return getVersion_description();
        }
        if (i11 == 3) {
            return getNew_version();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$AppNewVersionResult$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetType();
        }
        if (i11 == 2) {
            return isSetVersion_description();
        }
        if (i11 == 3) {
            return isSetNew_version();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$AppNewVersionResult$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetType();
                return;
            } else {
                setType(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetVersion_description();
                return;
            } else {
                setVersion_description((String) value);
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetNew_version();
        } else {
            setNew_version((String) value);
        }
    }

    public AppNewVersionResult(int type, String version_description, String new_version) {
        this();
        this.type = type;
        setTypeIsSet(true);
        this.version_description = version_description;
        this.new_version = new_version;
    }

    public boolean equals(AppNewVersionResult that) {
        if (that == null || this.type != that.type) {
            return false;
        }
        boolean isSetVersion_description = isSetVersion_description();
        boolean isSetVersion_description2 = that.isSetVersion_description();
        if ((isSetVersion_description || isSetVersion_description2) && !(isSetVersion_description && isSetVersion_description2 && this.version_description.equals(that.version_description))) {
            return false;
        }
        boolean isSetNew_version = isSetNew_version();
        boolean isSetNew_version2 = that.isSetNew_version();
        if (isSetNew_version || isSetNew_version2) {
            return isSetNew_version && isSetNew_version2 && this.new_version.equals(that.new_version);
        }
        return true;
    }

    public AppNewVersionResult(AppNewVersionResult other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.type = other.type;
        if (other.isSetVersion_description()) {
            this.version_description = other.version_description;
        }
        if (other.isSetNew_version()) {
            this.new_version = other.new_version;
        }
    }
}
