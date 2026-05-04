package com.baicizhan.online.avatar_api;

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
public class AvatarGiftInfo implements TBase<AvatarGiftInfo, _Fields>, Serializable, Cloneable, Comparable<AvatarGiftInfo> {
    private static final int __GIFT_ID_ISSET_ID = 0;
    private static final int __GIFT_TYPE_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String gift_cn;
    public String gift_cn_pic;
    public String gift_en_pic;
    public int gift_id;
    public String gift_pic;
    public int gift_type;
    private static final TStruct STRUCT_DESC = new TStruct("AvatarGiftInfo");
    private static final TField GIFT_ID_FIELD_DESC = new TField("gift_id", (byte) 8, 1);
    private static final TField GIFT_TYPE_FIELD_DESC = new TField("gift_type", (byte) 8, 2);
    private static final TField GIFT_CN_FIELD_DESC = new TField("gift_cn", (byte) 11, 3);
    private static final TField GIFT_PIC_FIELD_DESC = new TField("gift_pic", (byte) 11, 4);
    private static final TField GIFT_CN_PIC_FIELD_DESC = new TField("gift_cn_pic", (byte) 11, 5);
    private static final TField GIFT_EN_PIC_FIELD_DESC = new TField("gift_en_pic", (byte) 11, 6);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.avatar_api.AvatarGiftInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$avatar_api$AvatarGiftInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$avatar_api$AvatarGiftInfo$_Fields = iArr;
            try {
                iArr[_Fields.GIFT_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$AvatarGiftInfo$_Fields[_Fields.GIFT_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$AvatarGiftInfo$_Fields[_Fields.GIFT_CN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$AvatarGiftInfo$_Fields[_Fields.GIFT_PIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$AvatarGiftInfo$_Fields[_Fields.GIFT_CN_PIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$AvatarGiftInfo$_Fields[_Fields.GIFT_EN_PIC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AvatarGiftInfoStandardScheme extends StandardScheme<AvatarGiftInfo> {
        private AvatarGiftInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, AvatarGiftInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetGift_id()) {
                        throw new TProtocolException("Required field 'gift_id' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetGift_type()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'gift_type' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.gift_id = iprot.readI32();
                            struct.setGift_idIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.gift_type = iprot.readI32();
                            struct.setGift_typeIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.gift_cn = iprot.readString();
                            struct.setGift_cnIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.gift_pic = iprot.readString();
                            struct.setGift_picIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.gift_cn_pic = iprot.readString();
                            struct.setGift_cn_picIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.gift_en_pic = iprot.readString();
                            struct.setGift_en_picIsSet(true);
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
        public void write(TProtocol oprot, AvatarGiftInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(AvatarGiftInfo.STRUCT_DESC);
            oprot.writeFieldBegin(AvatarGiftInfo.GIFT_ID_FIELD_DESC);
            oprot.writeI32(struct.gift_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(AvatarGiftInfo.GIFT_TYPE_FIELD_DESC);
            oprot.writeI32(struct.gift_type);
            oprot.writeFieldEnd();
            if (struct.gift_cn != null) {
                oprot.writeFieldBegin(AvatarGiftInfo.GIFT_CN_FIELD_DESC);
                oprot.writeString(struct.gift_cn);
                oprot.writeFieldEnd();
            }
            if (struct.gift_pic != null) {
                oprot.writeFieldBegin(AvatarGiftInfo.GIFT_PIC_FIELD_DESC);
                oprot.writeString(struct.gift_pic);
                oprot.writeFieldEnd();
            }
            if (struct.gift_cn_pic != null) {
                oprot.writeFieldBegin(AvatarGiftInfo.GIFT_CN_PIC_FIELD_DESC);
                oprot.writeString(struct.gift_cn_pic);
                oprot.writeFieldEnd();
            }
            if (struct.gift_en_pic != null) {
                oprot.writeFieldBegin(AvatarGiftInfo.GIFT_EN_PIC_FIELD_DESC);
                oprot.writeString(struct.gift_en_pic);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AvatarGiftInfoStandardSchemeFactory implements SchemeFactory {
        private AvatarGiftInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AvatarGiftInfoStandardScheme getScheme() {
            return new AvatarGiftInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AvatarGiftInfoTupleScheme extends TupleScheme<AvatarGiftInfo> {
        private AvatarGiftInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, AvatarGiftInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.gift_id = tTupleProtocol.readI32();
            struct.setGift_idIsSet(true);
            struct.gift_type = tTupleProtocol.readI32();
            struct.setGift_typeIsSet(true);
            struct.gift_cn = tTupleProtocol.readString();
            struct.setGift_cnIsSet(true);
            struct.gift_pic = tTupleProtocol.readString();
            struct.setGift_picIsSet(true);
            struct.gift_cn_pic = tTupleProtocol.readString();
            struct.setGift_cn_picIsSet(true);
            struct.gift_en_pic = tTupleProtocol.readString();
            struct.setGift_en_picIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, AvatarGiftInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.gift_id);
            tTupleProtocol.writeI32(struct.gift_type);
            tTupleProtocol.writeString(struct.gift_cn);
            tTupleProtocol.writeString(struct.gift_pic);
            tTupleProtocol.writeString(struct.gift_cn_pic);
            tTupleProtocol.writeString(struct.gift_en_pic);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AvatarGiftInfoTupleSchemeFactory implements SchemeFactory {
        private AvatarGiftInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AvatarGiftInfoTupleScheme getScheme() {
            return new AvatarGiftInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        GIFT_ID(1, "gift_id"),
        GIFT_TYPE(2, "gift_type"),
        GIFT_CN(3, "gift_cn"),
        GIFT_PIC(4, "gift_pic"),
        GIFT_CN_PIC(5, "gift_cn_pic"),
        GIFT_EN_PIC(6, "gift_en_pic");

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
                    return GIFT_ID;
                case 2:
                    return GIFT_TYPE;
                case 3:
                    return GIFT_CN;
                case 4:
                    return GIFT_PIC;
                case 5:
                    return GIFT_CN_PIC;
                case 6:
                    return GIFT_EN_PIC;
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
        hashMap.put(StandardScheme.class, new AvatarGiftInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new AvatarGiftInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.GIFT_ID, (_Fields) new FieldMetaData("gift_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.GIFT_TYPE, (_Fields) new FieldMetaData("gift_type", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.GIFT_CN, (_Fields) new FieldMetaData("gift_cn", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.GIFT_PIC, (_Fields) new FieldMetaData("gift_pic", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.GIFT_CN_PIC, (_Fields) new FieldMetaData("gift_cn_pic", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.GIFT_EN_PIC, (_Fields) new FieldMetaData("gift_en_pic", (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(AvatarGiftInfo.class, unmodifiableMap);
    }

    public AvatarGiftInfo() {
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
        setGift_idIsSet(false);
        this.gift_id = 0;
        setGift_typeIsSet(false);
        this.gift_type = 0;
        this.gift_cn = null;
        this.gift_pic = null;
        this.gift_cn_pic = null;
        this.gift_en_pic = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof AvatarGiftInfo)) {
            return equals((AvatarGiftInfo) that);
        }
        return false;
    }

    public String getGift_cn() {
        return this.gift_cn;
    }

    public String getGift_cn_pic() {
        return this.gift_cn_pic;
    }

    public String getGift_en_pic() {
        return this.gift_en_pic;
    }

    public int getGift_id() {
        return this.gift_id;
    }

    public String getGift_pic() {
        return this.gift_pic;
    }

    public int getGift_type() {
        return this.gift_type;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetGift_cn() {
        return this.gift_cn != null;
    }

    public boolean isSetGift_cn_pic() {
        return this.gift_cn_pic != null;
    }

    public boolean isSetGift_en_pic() {
        return this.gift_en_pic != null;
    }

    public boolean isSetGift_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetGift_pic() {
        return this.gift_pic != null;
    }

    public boolean isSetGift_type() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public AvatarGiftInfo setGift_cn(String gift_cn) {
        this.gift_cn = gift_cn;
        return this;
    }

    public void setGift_cnIsSet(boolean value) {
        if (value) {
            return;
        }
        this.gift_cn = null;
    }

    public AvatarGiftInfo setGift_cn_pic(String gift_cn_pic) {
        this.gift_cn_pic = gift_cn_pic;
        return this;
    }

    public void setGift_cn_picIsSet(boolean value) {
        if (value) {
            return;
        }
        this.gift_cn_pic = null;
    }

    public AvatarGiftInfo setGift_en_pic(String gift_en_pic) {
        this.gift_en_pic = gift_en_pic;
        return this;
    }

    public void setGift_en_picIsSet(boolean value) {
        if (value) {
            return;
        }
        this.gift_en_pic = null;
    }

    public AvatarGiftInfo setGift_id(int gift_id) {
        this.gift_id = gift_id;
        setGift_idIsSet(true);
        return this;
    }

    public void setGift_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public AvatarGiftInfo setGift_pic(String gift_pic) {
        this.gift_pic = gift_pic;
        return this;
    }

    public void setGift_picIsSet(boolean value) {
        if (value) {
            return;
        }
        this.gift_pic = null;
    }

    public AvatarGiftInfo setGift_type(int gift_type) {
        this.gift_type = gift_type;
        setGift_typeIsSet(true);
        return this;
    }

    public void setGift_typeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AvatarGiftInfo(");
        sb2.append("gift_id:");
        sb2.append(this.gift_id);
        sb2.append(j2.O);
        sb2.append("gift_type:");
        sb2.append(this.gift_type);
        sb2.append(j2.O);
        sb2.append("gift_cn:");
        String str = this.gift_cn;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("gift_pic:");
        String str2 = this.gift_pic;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("gift_cn_pic:");
        String str3 = this.gift_cn_pic;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(j2.O);
        sb2.append("gift_en_pic:");
        String str4 = this.gift_en_pic;
        if (str4 == null) {
            sb2.append("null");
        } else {
            sb2.append(str4);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetGift_cn() {
        this.gift_cn = null;
    }

    public void unsetGift_cn_pic() {
        this.gift_cn_pic = null;
    }

    public void unsetGift_en_pic() {
        this.gift_en_pic = null;
    }

    public void unsetGift_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetGift_pic() {
        this.gift_pic = null;
    }

    public void unsetGift_type() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void validate() throws TException {
        if (this.gift_cn == null) {
            throw new TProtocolException("Required field 'gift_cn' was not present! Struct: " + toString());
        }
        if (this.gift_pic == null) {
            throw new TProtocolException("Required field 'gift_pic' was not present! Struct: " + toString());
        }
        if (this.gift_cn_pic == null) {
            throw new TProtocolException("Required field 'gift_cn_pic' was not present! Struct: " + toString());
        }
        if (this.gift_en_pic != null) {
            return;
        }
        throw new TProtocolException("Required field 'gift_en_pic' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(AvatarGiftInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo7 = Boolean.valueOf(isSetGift_id()).compareTo(Boolean.valueOf(other.isSetGift_id()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetGift_id() && (compareTo6 = TBaseHelper.compareTo(this.gift_id, other.gift_id)) != 0) {
            return compareTo6;
        }
        int compareTo8 = Boolean.valueOf(isSetGift_type()).compareTo(Boolean.valueOf(other.isSetGift_type()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetGift_type() && (compareTo5 = TBaseHelper.compareTo(this.gift_type, other.gift_type)) != 0) {
            return compareTo5;
        }
        int compareTo9 = Boolean.valueOf(isSetGift_cn()).compareTo(Boolean.valueOf(other.isSetGift_cn()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetGift_cn() && (compareTo4 = TBaseHelper.compareTo(this.gift_cn, other.gift_cn)) != 0) {
            return compareTo4;
        }
        int compareTo10 = Boolean.valueOf(isSetGift_pic()).compareTo(Boolean.valueOf(other.isSetGift_pic()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetGift_pic() && (compareTo3 = TBaseHelper.compareTo(this.gift_pic, other.gift_pic)) != 0) {
            return compareTo3;
        }
        int compareTo11 = Boolean.valueOf(isSetGift_cn_pic()).compareTo(Boolean.valueOf(other.isSetGift_cn_pic()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetGift_cn_pic() && (compareTo2 = TBaseHelper.compareTo(this.gift_cn_pic, other.gift_cn_pic)) != 0) {
            return compareTo2;
        }
        int compareTo12 = Boolean.valueOf(isSetGift_en_pic()).compareTo(Boolean.valueOf(other.isSetGift_en_pic()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (!isSetGift_en_pic() || (compareTo = TBaseHelper.compareTo(this.gift_en_pic, other.gift_en_pic)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<AvatarGiftInfo, _Fields> deepCopy2() {
        return new AvatarGiftInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$avatar_api$AvatarGiftInfo$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getGift_id());
            case 2:
                return Integer.valueOf(getGift_type());
            case 3:
                return getGift_cn();
            case 4:
                return getGift_pic();
            case 5:
                return getGift_cn_pic();
            case 6:
                return getGift_en_pic();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$avatar_api$AvatarGiftInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetGift_id();
            case 2:
                return isSetGift_type();
            case 3:
                return isSetGift_cn();
            case 4:
                return isSetGift_pic();
            case 5:
                return isSetGift_cn_pic();
            case 6:
                return isSetGift_en_pic();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$avatar_api$AvatarGiftInfo$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setGift_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetGift_id();
                    break;
                }
            case 2:
                if (value != null) {
                    setGift_type(((Integer) value).intValue());
                    break;
                } else {
                    unsetGift_type();
                    break;
                }
            case 3:
                if (value != null) {
                    setGift_cn((String) value);
                    break;
                } else {
                    unsetGift_cn();
                    break;
                }
            case 4:
                if (value != null) {
                    setGift_pic((String) value);
                    break;
                } else {
                    unsetGift_pic();
                    break;
                }
            case 5:
                if (value != null) {
                    setGift_cn_pic((String) value);
                    break;
                } else {
                    unsetGift_cn_pic();
                    break;
                }
            case 6:
                if (value != null) {
                    setGift_en_pic((String) value);
                    break;
                } else {
                    unsetGift_en_pic();
                    break;
                }
        }
    }

    public AvatarGiftInfo(int gift_id, int gift_type, String gift_cn, String gift_pic, String gift_cn_pic, String gift_en_pic) {
        this();
        this.gift_id = gift_id;
        setGift_idIsSet(true);
        this.gift_type = gift_type;
        setGift_typeIsSet(true);
        this.gift_cn = gift_cn;
        this.gift_pic = gift_pic;
        this.gift_cn_pic = gift_cn_pic;
        this.gift_en_pic = gift_en_pic;
    }

    public boolean equals(AvatarGiftInfo that) {
        if (that == null || this.gift_id != that.gift_id || this.gift_type != that.gift_type) {
            return false;
        }
        boolean isSetGift_cn = isSetGift_cn();
        boolean isSetGift_cn2 = that.isSetGift_cn();
        if ((isSetGift_cn || isSetGift_cn2) && !(isSetGift_cn && isSetGift_cn2 && this.gift_cn.equals(that.gift_cn))) {
            return false;
        }
        boolean isSetGift_pic = isSetGift_pic();
        boolean isSetGift_pic2 = that.isSetGift_pic();
        if ((isSetGift_pic || isSetGift_pic2) && !(isSetGift_pic && isSetGift_pic2 && this.gift_pic.equals(that.gift_pic))) {
            return false;
        }
        boolean isSetGift_cn_pic = isSetGift_cn_pic();
        boolean isSetGift_cn_pic2 = that.isSetGift_cn_pic();
        if ((isSetGift_cn_pic || isSetGift_cn_pic2) && !(isSetGift_cn_pic && isSetGift_cn_pic2 && this.gift_cn_pic.equals(that.gift_cn_pic))) {
            return false;
        }
        boolean isSetGift_en_pic = isSetGift_en_pic();
        boolean isSetGift_en_pic2 = that.isSetGift_en_pic();
        if (isSetGift_en_pic || isSetGift_en_pic2) {
            return isSetGift_en_pic && isSetGift_en_pic2 && this.gift_en_pic.equals(that.gift_en_pic);
        }
        return true;
    }

    public AvatarGiftInfo(AvatarGiftInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.gift_id = other.gift_id;
        this.gift_type = other.gift_type;
        if (other.isSetGift_cn()) {
            this.gift_cn = other.gift_cn;
        }
        if (other.isSetGift_pic()) {
            this.gift_pic = other.gift_pic;
        }
        if (other.isSetGift_cn_pic()) {
            this.gift_cn_pic = other.gift_cn_pic;
        }
        if (other.isSetGift_en_pic()) {
            this.gift_en_pic = other.gift_en_pic;
        }
    }
}
