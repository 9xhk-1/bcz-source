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
public class AvatarAreaInfo implements TBase<AvatarAreaInfo, _Fields>, Serializable, Cloneable, Comparable<AvatarAreaInfo> {
    private static final int __AREA_ID_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String area_bg_pic;
    public String area_cn;
    public String area_desc;
    public String area_en;
    public String area_icon;
    public int area_id;
    public String area_upgrade_text;
    private static final TStruct STRUCT_DESC = new TStruct("AvatarAreaInfo");
    private static final TField AREA_ID_FIELD_DESC = new TField("area_id", (byte) 8, 1);
    private static final TField AREA_CN_FIELD_DESC = new TField("area_cn", (byte) 11, 2);
    private static final TField AREA_EN_FIELD_DESC = new TField("area_en", (byte) 11, 3);
    private static final TField AREA_UPGRADE_TEXT_FIELD_DESC = new TField("area_upgrade_text", (byte) 11, 4);
    private static final TField AREA_ICON_FIELD_DESC = new TField("area_icon", (byte) 11, 5);
    private static final TField AREA_DESC_FIELD_DESC = new TField("area_desc", (byte) 11, 6);
    private static final TField AREA_BG_PIC_FIELD_DESC = new TField("area_bg_pic", (byte) 11, 7);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.avatar_api.AvatarAreaInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$avatar_api$AvatarAreaInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$avatar_api$AvatarAreaInfo$_Fields = iArr;
            try {
                iArr[_Fields.AREA_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$AvatarAreaInfo$_Fields[_Fields.AREA_CN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$AvatarAreaInfo$_Fields[_Fields.AREA_EN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$AvatarAreaInfo$_Fields[_Fields.AREA_UPGRADE_TEXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$AvatarAreaInfo$_Fields[_Fields.AREA_ICON.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$AvatarAreaInfo$_Fields[_Fields.AREA_DESC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$AvatarAreaInfo$_Fields[_Fields.AREA_BG_PIC.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AvatarAreaInfoStandardScheme extends StandardScheme<AvatarAreaInfo> {
        private AvatarAreaInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, AvatarAreaInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (struct.isSetArea_id()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'area_id' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.area_id = iprot.readI32();
                            struct.setArea_idIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.area_cn = iprot.readString();
                            struct.setArea_cnIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.area_en = iprot.readString();
                            struct.setArea_enIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.area_upgrade_text = iprot.readString();
                            struct.setArea_upgrade_textIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.area_icon = iprot.readString();
                            struct.setArea_iconIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.area_desc = iprot.readString();
                            struct.setArea_descIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.area_bg_pic = iprot.readString();
                            struct.setArea_bg_picIsSet(true);
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
        public void write(TProtocol oprot, AvatarAreaInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(AvatarAreaInfo.STRUCT_DESC);
            oprot.writeFieldBegin(AvatarAreaInfo.AREA_ID_FIELD_DESC);
            oprot.writeI32(struct.area_id);
            oprot.writeFieldEnd();
            if (struct.area_cn != null) {
                oprot.writeFieldBegin(AvatarAreaInfo.AREA_CN_FIELD_DESC);
                oprot.writeString(struct.area_cn);
                oprot.writeFieldEnd();
            }
            if (struct.area_en != null) {
                oprot.writeFieldBegin(AvatarAreaInfo.AREA_EN_FIELD_DESC);
                oprot.writeString(struct.area_en);
                oprot.writeFieldEnd();
            }
            if (struct.area_upgrade_text != null) {
                oprot.writeFieldBegin(AvatarAreaInfo.AREA_UPGRADE_TEXT_FIELD_DESC);
                oprot.writeString(struct.area_upgrade_text);
                oprot.writeFieldEnd();
            }
            if (struct.area_icon != null) {
                oprot.writeFieldBegin(AvatarAreaInfo.AREA_ICON_FIELD_DESC);
                oprot.writeString(struct.area_icon);
                oprot.writeFieldEnd();
            }
            if (struct.area_desc != null) {
                oprot.writeFieldBegin(AvatarAreaInfo.AREA_DESC_FIELD_DESC);
                oprot.writeString(struct.area_desc);
                oprot.writeFieldEnd();
            }
            if (struct.area_bg_pic != null) {
                oprot.writeFieldBegin(AvatarAreaInfo.AREA_BG_PIC_FIELD_DESC);
                oprot.writeString(struct.area_bg_pic);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AvatarAreaInfoStandardSchemeFactory implements SchemeFactory {
        private AvatarAreaInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AvatarAreaInfoStandardScheme getScheme() {
            return new AvatarAreaInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AvatarAreaInfoTupleScheme extends TupleScheme<AvatarAreaInfo> {
        private AvatarAreaInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, AvatarAreaInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.area_id = tTupleProtocol.readI32();
            struct.setArea_idIsSet(true);
            struct.area_cn = tTupleProtocol.readString();
            struct.setArea_cnIsSet(true);
            struct.area_en = tTupleProtocol.readString();
            struct.setArea_enIsSet(true);
            struct.area_upgrade_text = tTupleProtocol.readString();
            struct.setArea_upgrade_textIsSet(true);
            struct.area_icon = tTupleProtocol.readString();
            struct.setArea_iconIsSet(true);
            struct.area_desc = tTupleProtocol.readString();
            struct.setArea_descIsSet(true);
            struct.area_bg_pic = tTupleProtocol.readString();
            struct.setArea_bg_picIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, AvatarAreaInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.area_id);
            tTupleProtocol.writeString(struct.area_cn);
            tTupleProtocol.writeString(struct.area_en);
            tTupleProtocol.writeString(struct.area_upgrade_text);
            tTupleProtocol.writeString(struct.area_icon);
            tTupleProtocol.writeString(struct.area_desc);
            tTupleProtocol.writeString(struct.area_bg_pic);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AvatarAreaInfoTupleSchemeFactory implements SchemeFactory {
        private AvatarAreaInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AvatarAreaInfoTupleScheme getScheme() {
            return new AvatarAreaInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        AREA_ID(1, "area_id"),
        AREA_CN(2, "area_cn"),
        AREA_EN(3, "area_en"),
        AREA_UPGRADE_TEXT(4, "area_upgrade_text"),
        AREA_ICON(5, "area_icon"),
        AREA_DESC(6, "area_desc"),
        AREA_BG_PIC(7, "area_bg_pic");

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
                    return AREA_ID;
                case 2:
                    return AREA_CN;
                case 3:
                    return AREA_EN;
                case 4:
                    return AREA_UPGRADE_TEXT;
                case 5:
                    return AREA_ICON;
                case 6:
                    return AREA_DESC;
                case 7:
                    return AREA_BG_PIC;
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
        hashMap.put(StandardScheme.class, new AvatarAreaInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new AvatarAreaInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.AREA_ID, (_Fields) new FieldMetaData("area_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.AREA_CN, (_Fields) new FieldMetaData("area_cn", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.AREA_EN, (_Fields) new FieldMetaData("area_en", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.AREA_UPGRADE_TEXT, (_Fields) new FieldMetaData("area_upgrade_text", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.AREA_ICON, (_Fields) new FieldMetaData("area_icon", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.AREA_DESC, (_Fields) new FieldMetaData("area_desc", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.AREA_BG_PIC, (_Fields) new FieldMetaData("area_bg_pic", (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(AvatarAreaInfo.class, unmodifiableMap);
    }

    public AvatarAreaInfo() {
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
        setArea_idIsSet(false);
        this.area_id = 0;
        this.area_cn = null;
        this.area_en = null;
        this.area_upgrade_text = null;
        this.area_icon = null;
        this.area_desc = null;
        this.area_bg_pic = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof AvatarAreaInfo)) {
            return equals((AvatarAreaInfo) that);
        }
        return false;
    }

    public String getArea_bg_pic() {
        return this.area_bg_pic;
    }

    public String getArea_cn() {
        return this.area_cn;
    }

    public String getArea_desc() {
        return this.area_desc;
    }

    public String getArea_en() {
        return this.area_en;
    }

    public String getArea_icon() {
        return this.area_icon;
    }

    public int getArea_id() {
        return this.area_id;
    }

    public String getArea_upgrade_text() {
        return this.area_upgrade_text;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetArea_bg_pic() {
        return this.area_bg_pic != null;
    }

    public boolean isSetArea_cn() {
        return this.area_cn != null;
    }

    public boolean isSetArea_desc() {
        return this.area_desc != null;
    }

    public boolean isSetArea_en() {
        return this.area_en != null;
    }

    public boolean isSetArea_icon() {
        return this.area_icon != null;
    }

    public boolean isSetArea_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetArea_upgrade_text() {
        return this.area_upgrade_text != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public AvatarAreaInfo setArea_bg_pic(String area_bg_pic) {
        this.area_bg_pic = area_bg_pic;
        return this;
    }

    public void setArea_bg_picIsSet(boolean value) {
        if (value) {
            return;
        }
        this.area_bg_pic = null;
    }

    public AvatarAreaInfo setArea_cn(String area_cn) {
        this.area_cn = area_cn;
        return this;
    }

    public void setArea_cnIsSet(boolean value) {
        if (value) {
            return;
        }
        this.area_cn = null;
    }

    public AvatarAreaInfo setArea_desc(String area_desc) {
        this.area_desc = area_desc;
        return this;
    }

    public void setArea_descIsSet(boolean value) {
        if (value) {
            return;
        }
        this.area_desc = null;
    }

    public AvatarAreaInfo setArea_en(String area_en) {
        this.area_en = area_en;
        return this;
    }

    public void setArea_enIsSet(boolean value) {
        if (value) {
            return;
        }
        this.area_en = null;
    }

    public AvatarAreaInfo setArea_icon(String area_icon) {
        this.area_icon = area_icon;
        return this;
    }

    public void setArea_iconIsSet(boolean value) {
        if (value) {
            return;
        }
        this.area_icon = null;
    }

    public AvatarAreaInfo setArea_id(int area_id) {
        this.area_id = area_id;
        setArea_idIsSet(true);
        return this;
    }

    public void setArea_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public AvatarAreaInfo setArea_upgrade_text(String area_upgrade_text) {
        this.area_upgrade_text = area_upgrade_text;
        return this;
    }

    public void setArea_upgrade_textIsSet(boolean value) {
        if (value) {
            return;
        }
        this.area_upgrade_text = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AvatarAreaInfo(");
        sb2.append("area_id:");
        sb2.append(this.area_id);
        sb2.append(j2.O);
        sb2.append("area_cn:");
        String str = this.area_cn;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("area_en:");
        String str2 = this.area_en;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("area_upgrade_text:");
        String str3 = this.area_upgrade_text;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(j2.O);
        sb2.append("area_icon:");
        String str4 = this.area_icon;
        if (str4 == null) {
            sb2.append("null");
        } else {
            sb2.append(str4);
        }
        sb2.append(j2.O);
        sb2.append("area_desc:");
        String str5 = this.area_desc;
        if (str5 == null) {
            sb2.append("null");
        } else {
            sb2.append(str5);
        }
        sb2.append(j2.O);
        sb2.append("area_bg_pic:");
        String str6 = this.area_bg_pic;
        if (str6 == null) {
            sb2.append("null");
        } else {
            sb2.append(str6);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetArea_bg_pic() {
        this.area_bg_pic = null;
    }

    public void unsetArea_cn() {
        this.area_cn = null;
    }

    public void unsetArea_desc() {
        this.area_desc = null;
    }

    public void unsetArea_en() {
        this.area_en = null;
    }

    public void unsetArea_icon() {
        this.area_icon = null;
    }

    public void unsetArea_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetArea_upgrade_text() {
        this.area_upgrade_text = null;
    }

    public void validate() throws TException {
        if (this.area_cn == null) {
            throw new TProtocolException("Required field 'area_cn' was not present! Struct: " + toString());
        }
        if (this.area_en == null) {
            throw new TProtocolException("Required field 'area_en' was not present! Struct: " + toString());
        }
        if (this.area_upgrade_text == null) {
            throw new TProtocolException("Required field 'area_upgrade_text' was not present! Struct: " + toString());
        }
        if (this.area_icon == null) {
            throw new TProtocolException("Required field 'area_icon' was not present! Struct: " + toString());
        }
        if (this.area_desc == null) {
            throw new TProtocolException("Required field 'area_desc' was not present! Struct: " + toString());
        }
        if (this.area_bg_pic != null) {
            return;
        }
        throw new TProtocolException("Required field 'area_bg_pic' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(AvatarAreaInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        int compareTo7;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo8 = Boolean.valueOf(isSetArea_id()).compareTo(Boolean.valueOf(other.isSetArea_id()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetArea_id() && (compareTo7 = TBaseHelper.compareTo(this.area_id, other.area_id)) != 0) {
            return compareTo7;
        }
        int compareTo9 = Boolean.valueOf(isSetArea_cn()).compareTo(Boolean.valueOf(other.isSetArea_cn()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetArea_cn() && (compareTo6 = TBaseHelper.compareTo(this.area_cn, other.area_cn)) != 0) {
            return compareTo6;
        }
        int compareTo10 = Boolean.valueOf(isSetArea_en()).compareTo(Boolean.valueOf(other.isSetArea_en()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetArea_en() && (compareTo5 = TBaseHelper.compareTo(this.area_en, other.area_en)) != 0) {
            return compareTo5;
        }
        int compareTo11 = Boolean.valueOf(isSetArea_upgrade_text()).compareTo(Boolean.valueOf(other.isSetArea_upgrade_text()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetArea_upgrade_text() && (compareTo4 = TBaseHelper.compareTo(this.area_upgrade_text, other.area_upgrade_text)) != 0) {
            return compareTo4;
        }
        int compareTo12 = Boolean.valueOf(isSetArea_icon()).compareTo(Boolean.valueOf(other.isSetArea_icon()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetArea_icon() && (compareTo3 = TBaseHelper.compareTo(this.area_icon, other.area_icon)) != 0) {
            return compareTo3;
        }
        int compareTo13 = Boolean.valueOf(isSetArea_desc()).compareTo(Boolean.valueOf(other.isSetArea_desc()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetArea_desc() && (compareTo2 = TBaseHelper.compareTo(this.area_desc, other.area_desc)) != 0) {
            return compareTo2;
        }
        int compareTo14 = Boolean.valueOf(isSetArea_bg_pic()).compareTo(Boolean.valueOf(other.isSetArea_bg_pic()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (!isSetArea_bg_pic() || (compareTo = TBaseHelper.compareTo(this.area_bg_pic, other.area_bg_pic)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<AvatarAreaInfo, _Fields> deepCopy2() {
        return new AvatarAreaInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$avatar_api$AvatarAreaInfo$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getArea_id());
            case 2:
                return getArea_cn();
            case 3:
                return getArea_en();
            case 4:
                return getArea_upgrade_text();
            case 5:
                return getArea_icon();
            case 6:
                return getArea_desc();
            case 7:
                return getArea_bg_pic();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$avatar_api$AvatarAreaInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetArea_id();
            case 2:
                return isSetArea_cn();
            case 3:
                return isSetArea_en();
            case 4:
                return isSetArea_upgrade_text();
            case 5:
                return isSetArea_icon();
            case 6:
                return isSetArea_desc();
            case 7:
                return isSetArea_bg_pic();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$avatar_api$AvatarAreaInfo$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setArea_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetArea_id();
                    break;
                }
            case 2:
                if (value != null) {
                    setArea_cn((String) value);
                    break;
                } else {
                    unsetArea_cn();
                    break;
                }
            case 3:
                if (value != null) {
                    setArea_en((String) value);
                    break;
                } else {
                    unsetArea_en();
                    break;
                }
            case 4:
                if (value != null) {
                    setArea_upgrade_text((String) value);
                    break;
                } else {
                    unsetArea_upgrade_text();
                    break;
                }
            case 5:
                if (value != null) {
                    setArea_icon((String) value);
                    break;
                } else {
                    unsetArea_icon();
                    break;
                }
            case 6:
                if (value != null) {
                    setArea_desc((String) value);
                    break;
                } else {
                    unsetArea_desc();
                    break;
                }
            case 7:
                if (value != null) {
                    setArea_bg_pic((String) value);
                    break;
                } else {
                    unsetArea_bg_pic();
                    break;
                }
        }
    }

    public AvatarAreaInfo(int area_id, String area_cn, String area_en, String area_upgrade_text, String area_icon, String area_desc, String area_bg_pic) {
        this();
        this.area_id = area_id;
        setArea_idIsSet(true);
        this.area_cn = area_cn;
        this.area_en = area_en;
        this.area_upgrade_text = area_upgrade_text;
        this.area_icon = area_icon;
        this.area_desc = area_desc;
        this.area_bg_pic = area_bg_pic;
    }

    public boolean equals(AvatarAreaInfo that) {
        if (that == null || this.area_id != that.area_id) {
            return false;
        }
        boolean isSetArea_cn = isSetArea_cn();
        boolean isSetArea_cn2 = that.isSetArea_cn();
        if ((isSetArea_cn || isSetArea_cn2) && !(isSetArea_cn && isSetArea_cn2 && this.area_cn.equals(that.area_cn))) {
            return false;
        }
        boolean isSetArea_en = isSetArea_en();
        boolean isSetArea_en2 = that.isSetArea_en();
        if ((isSetArea_en || isSetArea_en2) && !(isSetArea_en && isSetArea_en2 && this.area_en.equals(that.area_en))) {
            return false;
        }
        boolean isSetArea_upgrade_text = isSetArea_upgrade_text();
        boolean isSetArea_upgrade_text2 = that.isSetArea_upgrade_text();
        if ((isSetArea_upgrade_text || isSetArea_upgrade_text2) && !(isSetArea_upgrade_text && isSetArea_upgrade_text2 && this.area_upgrade_text.equals(that.area_upgrade_text))) {
            return false;
        }
        boolean isSetArea_icon = isSetArea_icon();
        boolean isSetArea_icon2 = that.isSetArea_icon();
        if ((isSetArea_icon || isSetArea_icon2) && !(isSetArea_icon && isSetArea_icon2 && this.area_icon.equals(that.area_icon))) {
            return false;
        }
        boolean isSetArea_desc = isSetArea_desc();
        boolean isSetArea_desc2 = that.isSetArea_desc();
        if ((isSetArea_desc || isSetArea_desc2) && !(isSetArea_desc && isSetArea_desc2 && this.area_desc.equals(that.area_desc))) {
            return false;
        }
        boolean isSetArea_bg_pic = isSetArea_bg_pic();
        boolean isSetArea_bg_pic2 = that.isSetArea_bg_pic();
        if (isSetArea_bg_pic || isSetArea_bg_pic2) {
            return isSetArea_bg_pic && isSetArea_bg_pic2 && this.area_bg_pic.equals(that.area_bg_pic);
        }
        return true;
    }

    public AvatarAreaInfo(AvatarAreaInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.area_id = other.area_id;
        if (other.isSetArea_cn()) {
            this.area_cn = other.area_cn;
        }
        if (other.isSetArea_en()) {
            this.area_en = other.area_en;
        }
        if (other.isSetArea_upgrade_text()) {
            this.area_upgrade_text = other.area_upgrade_text;
        }
        if (other.isSetArea_icon()) {
            this.area_icon = other.area_icon;
        }
        if (other.isSetArea_desc()) {
            this.area_desc = other.area_desc;
        }
        if (other.isSetArea_bg_pic()) {
            this.area_bg_pic = other.area_bg_pic;
        }
    }
}
