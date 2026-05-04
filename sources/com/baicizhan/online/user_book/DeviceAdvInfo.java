package com.baicizhan.online.user_book;

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
/* loaded from: classes6.dex */
public class DeviceAdvInfo implements TBase<DeviceAdvInfo, _Fields>, Serializable, Cloneable, Comparable<DeviceAdvInfo> {
    private static final int __DEVICE_TYPE_ISSET_ID = 0;
    private static final int __SUPER_TIMESTAMP_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int device_type;
    public String image;
    public String link;
    public String name;
    private _Fields[] optionals;
    public String super_logo;
    public long super_timestamp;
    private static final TStruct STRUCT_DESC = new TStruct("DeviceAdvInfo");
    private static final TField DEVICE_TYPE_FIELD_DESC = new TField("device_type", (byte) 8, 1);
    private static final TField NAME_FIELD_DESC = new TField("name", (byte) 11, 2);
    private static final TField IMAGE_FIELD_DESC = new TField("image", (byte) 11, 3);
    private static final TField LINK_FIELD_DESC = new TField(y9.b.f99687c, (byte) 11, 4);
    private static final TField SUPER_LOGO_FIELD_DESC = new TField("super_logo", (byte) 11, 5);
    private static final TField SUPER_TIMESTAMP_FIELD_DESC = new TField("super_timestamp", (byte) 10, 6);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_book.DeviceAdvInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_book$DeviceAdvInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_book$DeviceAdvInfo$_Fields = iArr;
            try {
                iArr[_Fields.DEVICE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_book$DeviceAdvInfo$_Fields[_Fields.NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_book$DeviceAdvInfo$_Fields[_Fields.IMAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_book$DeviceAdvInfo$_Fields[_Fields.LINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_book$DeviceAdvInfo$_Fields[_Fields.SUPER_LOGO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_book$DeviceAdvInfo$_Fields[_Fields.SUPER_TIMESTAMP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DeviceAdvInfoStandardScheme extends StandardScheme<DeviceAdvInfo> {
        private DeviceAdvInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, DeviceAdvInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (struct.isSetDevice_type()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'device_type' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.device_type = iprot.readI32();
                            struct.setDevice_typeIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.name = iprot.readString();
                            struct.setNameIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.image = iprot.readString();
                            struct.setImageIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.link = iprot.readString();
                            struct.setLinkIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.super_logo = iprot.readString();
                            struct.setSuper_logoIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.super_timestamp = iprot.readI64();
                            struct.setSuper_timestampIsSet(true);
                            break;
                        }
                    default:
                        TProtocolUtil.skip(iprot, b11);
                        break;
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, DeviceAdvInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(DeviceAdvInfo.STRUCT_DESC);
            oprot.writeFieldBegin(DeviceAdvInfo.DEVICE_TYPE_FIELD_DESC);
            oprot.writeI32(struct.device_type);
            oprot.writeFieldEnd();
            if (struct.name != null) {
                oprot.writeFieldBegin(DeviceAdvInfo.NAME_FIELD_DESC);
                oprot.writeString(struct.name);
                oprot.writeFieldEnd();
            }
            if (struct.image != null) {
                oprot.writeFieldBegin(DeviceAdvInfo.IMAGE_FIELD_DESC);
                oprot.writeString(struct.image);
                oprot.writeFieldEnd();
            }
            if (struct.link != null) {
                oprot.writeFieldBegin(DeviceAdvInfo.LINK_FIELD_DESC);
                oprot.writeString(struct.link);
                oprot.writeFieldEnd();
            }
            if (struct.super_logo != null && struct.isSetSuper_logo()) {
                oprot.writeFieldBegin(DeviceAdvInfo.SUPER_LOGO_FIELD_DESC);
                oprot.writeString(struct.super_logo);
                oprot.writeFieldEnd();
            }
            if (struct.isSetSuper_timestamp()) {
                oprot.writeFieldBegin(DeviceAdvInfo.SUPER_TIMESTAMP_FIELD_DESC);
                oprot.writeI64(struct.super_timestamp);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DeviceAdvInfoStandardSchemeFactory implements SchemeFactory {
        private DeviceAdvInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public DeviceAdvInfoStandardScheme getScheme() {
            return new DeviceAdvInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DeviceAdvInfoTupleScheme extends TupleScheme<DeviceAdvInfo> {
        private DeviceAdvInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, DeviceAdvInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.device_type = tTupleProtocol.readI32();
            struct.setDevice_typeIsSet(true);
            struct.name = tTupleProtocol.readString();
            struct.setNameIsSet(true);
            struct.image = tTupleProtocol.readString();
            struct.setImageIsSet(true);
            struct.link = tTupleProtocol.readString();
            struct.setLinkIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(2);
            if (readBitSet.get(0)) {
                struct.super_logo = tTupleProtocol.readString();
                struct.setSuper_logoIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.super_timestamp = tTupleProtocol.readI64();
                struct.setSuper_timestampIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, DeviceAdvInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.device_type);
            tTupleProtocol.writeString(struct.name);
            tTupleProtocol.writeString(struct.image);
            tTupleProtocol.writeString(struct.link);
            BitSet bitSet = new BitSet();
            if (struct.isSetSuper_logo()) {
                bitSet.set(0);
            }
            if (struct.isSetSuper_timestamp()) {
                bitSet.set(1);
            }
            tTupleProtocol.writeBitSet(bitSet, 2);
            if (struct.isSetSuper_logo()) {
                tTupleProtocol.writeString(struct.super_logo);
            }
            if (struct.isSetSuper_timestamp()) {
                tTupleProtocol.writeI64(struct.super_timestamp);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DeviceAdvInfoTupleSchemeFactory implements SchemeFactory {
        private DeviceAdvInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public DeviceAdvInfoTupleScheme getScheme() {
            return new DeviceAdvInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        DEVICE_TYPE(1, "device_type"),
        NAME(2, "name"),
        IMAGE(3, "image"),
        LINK(4, y9.b.f99687c),
        SUPER_LOGO(5, "super_logo"),
        SUPER_TIMESTAMP(6, "super_timestamp");

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
            switch (fieldId) {
                case 1:
                    return DEVICE_TYPE;
                case 2:
                    return NAME;
                case 3:
                    return IMAGE;
                case 4:
                    return LINK;
                case 5:
                    return SUPER_LOGO;
                case 6:
                    return SUPER_TIMESTAMP;
                default:
                    return null;
            }
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
        hashMap.put(StandardScheme.class, new DeviceAdvInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new DeviceAdvInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.DEVICE_TYPE, (_Fields) new FieldMetaData("device_type", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.NAME, (_Fields) new FieldMetaData("name", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.IMAGE, (_Fields) new FieldMetaData("image", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.LINK, (_Fields) new FieldMetaData(y9.b.f99687c, (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SUPER_LOGO, (_Fields) new FieldMetaData("super_logo", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SUPER_TIMESTAMP, (_Fields) new FieldMetaData("super_timestamp", (byte) 2, new FieldValueMetaData((byte) 10)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(DeviceAdvInfo.class, unmodifiableMap);
    }

    public DeviceAdvInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.SUPER_LOGO, _Fields.SUPER_TIMESTAMP};
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
        setDevice_typeIsSet(false);
        this.device_type = 0;
        this.name = null;
        this.image = null;
        this.link = null;
        this.super_logo = null;
        setSuper_timestampIsSet(false);
        this.super_timestamp = 0L;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof DeviceAdvInfo)) {
            return equals((DeviceAdvInfo) that);
        }
        return false;
    }

    public int getDevice_type() {
        return this.device_type;
    }

    public String getImage() {
        return this.image;
    }

    public String getLink() {
        return this.link;
    }

    public String getName() {
        return this.name;
    }

    public String getSuper_logo() {
        return this.super_logo;
    }

    public long getSuper_timestamp() {
        return this.super_timestamp;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetDevice_type() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetImage() {
        return this.image != null;
    }

    public boolean isSetLink() {
        return this.link != null;
    }

    public boolean isSetName() {
        return this.name != null;
    }

    public boolean isSetSuper_logo() {
        return this.super_logo != null;
    }

    public boolean isSetSuper_timestamp() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public DeviceAdvInfo setDevice_type(int device_type) {
        this.device_type = device_type;
        setDevice_typeIsSet(true);
        return this;
    }

    public void setDevice_typeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public DeviceAdvInfo setImage(String image) {
        this.image = image;
        return this;
    }

    public void setImageIsSet(boolean value) {
        if (value) {
            return;
        }
        this.image = null;
    }

    public DeviceAdvInfo setLink(String link) {
        this.link = link;
        return this;
    }

    public void setLinkIsSet(boolean value) {
        if (value) {
            return;
        }
        this.link = null;
    }

    public DeviceAdvInfo setName(String name) {
        this.name = name;
        return this;
    }

    public void setNameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.name = null;
    }

    public DeviceAdvInfo setSuper_logo(String super_logo) {
        this.super_logo = super_logo;
        return this;
    }

    public void setSuper_logoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.super_logo = null;
    }

    public DeviceAdvInfo setSuper_timestamp(long super_timestamp) {
        this.super_timestamp = super_timestamp;
        setSuper_timestampIsSet(true);
        return this;
    }

    public void setSuper_timestampIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceAdvInfo(");
        sb2.append("device_type:");
        sb2.append(this.device_type);
        sb2.append(j2.O);
        sb2.append("name:");
        String str = this.name;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("image:");
        String str2 = this.image;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("link:");
        String str3 = this.link;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        if (isSetSuper_logo()) {
            sb2.append(j2.O);
            sb2.append("super_logo:");
            String str4 = this.super_logo;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (isSetSuper_timestamp()) {
            sb2.append(j2.O);
            sb2.append("super_timestamp:");
            sb2.append(this.super_timestamp);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetDevice_type() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetImage() {
        this.image = null;
    }

    public void unsetLink() {
        this.link = null;
    }

    public void unsetName() {
        this.name = null;
    }

    public void unsetSuper_logo() {
        this.super_logo = null;
    }

    public void unsetSuper_timestamp() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void validate() throws TException {
        if (this.name == null) {
            throw new TProtocolException("Required field 'name' was not present! Struct: " + toString());
        }
        if (this.image == null) {
            throw new TProtocolException("Required field 'image' was not present! Struct: " + toString());
        }
        if (this.link != null) {
            return;
        }
        throw new TProtocolException("Required field 'link' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(DeviceAdvInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo7 = Boolean.valueOf(isSetDevice_type()).compareTo(Boolean.valueOf(other.isSetDevice_type()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetDevice_type() && (compareTo6 = TBaseHelper.compareTo(this.device_type, other.device_type)) != 0) {
            return compareTo6;
        }
        int compareTo8 = Boolean.valueOf(isSetName()).compareTo(Boolean.valueOf(other.isSetName()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetName() && (compareTo5 = TBaseHelper.compareTo(this.name, other.name)) != 0) {
            return compareTo5;
        }
        int compareTo9 = Boolean.valueOf(isSetImage()).compareTo(Boolean.valueOf(other.isSetImage()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetImage() && (compareTo4 = TBaseHelper.compareTo(this.image, other.image)) != 0) {
            return compareTo4;
        }
        int compareTo10 = Boolean.valueOf(isSetLink()).compareTo(Boolean.valueOf(other.isSetLink()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetLink() && (compareTo3 = TBaseHelper.compareTo(this.link, other.link)) != 0) {
            return compareTo3;
        }
        int compareTo11 = Boolean.valueOf(isSetSuper_logo()).compareTo(Boolean.valueOf(other.isSetSuper_logo()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetSuper_logo() && (compareTo2 = TBaseHelper.compareTo(this.super_logo, other.super_logo)) != 0) {
            return compareTo2;
        }
        int compareTo12 = Boolean.valueOf(isSetSuper_timestamp()).compareTo(Boolean.valueOf(other.isSetSuper_timestamp()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (!isSetSuper_timestamp() || (compareTo = TBaseHelper.compareTo(this.super_timestamp, other.super_timestamp)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<DeviceAdvInfo, _Fields> deepCopy2() {
        return new DeviceAdvInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_book$DeviceAdvInfo$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getDevice_type());
            case 2:
                return getName();
            case 3:
                return getImage();
            case 4:
                return getLink();
            case 5:
                return getSuper_logo();
            case 6:
                return Long.valueOf(getSuper_timestamp());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_book$DeviceAdvInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetDevice_type();
            case 2:
                return isSetName();
            case 3:
                return isSetImage();
            case 4:
                return isSetLink();
            case 5:
                return isSetSuper_logo();
            case 6:
                return isSetSuper_timestamp();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_book$DeviceAdvInfo$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setDevice_type(((Integer) value).intValue());
                    break;
                } else {
                    unsetDevice_type();
                    break;
                }
            case 2:
                if (value != null) {
                    setName((String) value);
                    break;
                } else {
                    unsetName();
                    break;
                }
            case 3:
                if (value != null) {
                    setImage((String) value);
                    break;
                } else {
                    unsetImage();
                    break;
                }
            case 4:
                if (value != null) {
                    setLink((String) value);
                    break;
                } else {
                    unsetLink();
                    break;
                }
            case 5:
                if (value != null) {
                    setSuper_logo((String) value);
                    break;
                } else {
                    unsetSuper_logo();
                    break;
                }
            case 6:
                if (value != null) {
                    setSuper_timestamp(((Long) value).longValue());
                    break;
                } else {
                    unsetSuper_timestamp();
                    break;
                }
        }
    }

    public boolean equals(DeviceAdvInfo that) {
        if (that == null || this.device_type != that.device_type) {
            return false;
        }
        boolean isSetName = isSetName();
        boolean isSetName2 = that.isSetName();
        if ((isSetName || isSetName2) && !(isSetName && isSetName2 && this.name.equals(that.name))) {
            return false;
        }
        boolean isSetImage = isSetImage();
        boolean isSetImage2 = that.isSetImage();
        if ((isSetImage || isSetImage2) && !(isSetImage && isSetImage2 && this.image.equals(that.image))) {
            return false;
        }
        boolean isSetLink = isSetLink();
        boolean isSetLink2 = that.isSetLink();
        if ((isSetLink || isSetLink2) && !(isSetLink && isSetLink2 && this.link.equals(that.link))) {
            return false;
        }
        boolean isSetSuper_logo = isSetSuper_logo();
        boolean isSetSuper_logo2 = that.isSetSuper_logo();
        if ((isSetSuper_logo || isSetSuper_logo2) && !(isSetSuper_logo && isSetSuper_logo2 && this.super_logo.equals(that.super_logo))) {
            return false;
        }
        boolean isSetSuper_timestamp = isSetSuper_timestamp();
        boolean isSetSuper_timestamp2 = that.isSetSuper_timestamp();
        if (isSetSuper_timestamp || isSetSuper_timestamp2) {
            return isSetSuper_timestamp && isSetSuper_timestamp2 && this.super_timestamp == that.super_timestamp;
        }
        return true;
    }

    public DeviceAdvInfo(int device_type, String name, String image, String link) {
        this();
        this.device_type = device_type;
        setDevice_typeIsSet(true);
        this.name = name;
        this.image = image;
        this.link = link;
    }

    public DeviceAdvInfo(DeviceAdvInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.SUPER_LOGO, _Fields.SUPER_TIMESTAMP};
        this.__isset_bitfield = other.__isset_bitfield;
        this.device_type = other.device_type;
        if (other.isSetName()) {
            this.name = other.name;
        }
        if (other.isSetImage()) {
            this.image = other.image;
        }
        if (other.isSetLink()) {
            this.link = other.link;
        }
        if (other.isSetSuper_logo()) {
            this.super_logo = other.super_logo;
        }
        this.super_timestamp = other.super_timestamp;
    }
}
