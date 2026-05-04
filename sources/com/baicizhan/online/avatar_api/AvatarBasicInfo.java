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
public class AvatarBasicInfo implements TBase<AvatarBasicInfo, _Fields>, Serializable, Cloneable, Comparable<AvatarBasicInfo> {
    private static final int __IP_TYPE_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String ip_cn;
    public String ip_en;
    public String ip_tag;
    public int ip_type;
    private static final TStruct STRUCT_DESC = new TStruct("AvatarBasicInfo");
    private static final TField IP_TYPE_FIELD_DESC = new TField("ip_type", (byte) 8, 1);
    private static final TField IP_CN_FIELD_DESC = new TField("ip_cn", (byte) 11, 2);
    private static final TField IP_EN_FIELD_DESC = new TField("ip_en", (byte) 11, 3);
    private static final TField IP_TAG_FIELD_DESC = new TField("ip_tag", (byte) 11, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.avatar_api.AvatarBasicInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$avatar_api$AvatarBasicInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$avatar_api$AvatarBasicInfo$_Fields = iArr;
            try {
                iArr[_Fields.IP_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$AvatarBasicInfo$_Fields[_Fields.IP_CN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$AvatarBasicInfo$_Fields[_Fields.IP_EN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$AvatarBasicInfo$_Fields[_Fields.IP_TAG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AvatarBasicInfoStandardScheme extends StandardScheme<AvatarBasicInfo> {
        private AvatarBasicInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, AvatarBasicInfo struct) throws TException {
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
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 11) {
                                struct.ip_tag = iprot.readString();
                                struct.setIp_tagIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 11) {
                            struct.ip_en = iprot.readString();
                            struct.setIp_enIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.ip_cn = iprot.readString();
                        struct.setIp_cnIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.ip_type = iprot.readI32();
                    struct.setIp_typeIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetIp_type()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'ip_type' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, AvatarBasicInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(AvatarBasicInfo.STRUCT_DESC);
            oprot.writeFieldBegin(AvatarBasicInfo.IP_TYPE_FIELD_DESC);
            oprot.writeI32(struct.ip_type);
            oprot.writeFieldEnd();
            if (struct.ip_cn != null) {
                oprot.writeFieldBegin(AvatarBasicInfo.IP_CN_FIELD_DESC);
                oprot.writeString(struct.ip_cn);
                oprot.writeFieldEnd();
            }
            if (struct.ip_en != null) {
                oprot.writeFieldBegin(AvatarBasicInfo.IP_EN_FIELD_DESC);
                oprot.writeString(struct.ip_en);
                oprot.writeFieldEnd();
            }
            if (struct.ip_tag != null) {
                oprot.writeFieldBegin(AvatarBasicInfo.IP_TAG_FIELD_DESC);
                oprot.writeString(struct.ip_tag);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AvatarBasicInfoStandardSchemeFactory implements SchemeFactory {
        private AvatarBasicInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AvatarBasicInfoStandardScheme getScheme() {
            return new AvatarBasicInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AvatarBasicInfoTupleScheme extends TupleScheme<AvatarBasicInfo> {
        private AvatarBasicInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, AvatarBasicInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.ip_type = tTupleProtocol.readI32();
            struct.setIp_typeIsSet(true);
            struct.ip_cn = tTupleProtocol.readString();
            struct.setIp_cnIsSet(true);
            struct.ip_en = tTupleProtocol.readString();
            struct.setIp_enIsSet(true);
            struct.ip_tag = tTupleProtocol.readString();
            struct.setIp_tagIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, AvatarBasicInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.ip_type);
            tTupleProtocol.writeString(struct.ip_cn);
            tTupleProtocol.writeString(struct.ip_en);
            tTupleProtocol.writeString(struct.ip_tag);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AvatarBasicInfoTupleSchemeFactory implements SchemeFactory {
        private AvatarBasicInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AvatarBasicInfoTupleScheme getScheme() {
            return new AvatarBasicInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        IP_TYPE(1, "ip_type"),
        IP_CN(2, "ip_cn"),
        IP_EN(3, "ip_en"),
        IP_TAG(4, "ip_tag");

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
                return IP_TYPE;
            }
            if (fieldId == 2) {
                return IP_CN;
            }
            if (fieldId == 3) {
                return IP_EN;
            }
            if (fieldId != 4) {
                return null;
            }
            return IP_TAG;
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
        hashMap.put(StandardScheme.class, new AvatarBasicInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new AvatarBasicInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.IP_TYPE, (_Fields) new FieldMetaData("ip_type", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.IP_CN, (_Fields) new FieldMetaData("ip_cn", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.IP_EN, (_Fields) new FieldMetaData("ip_en", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.IP_TAG, (_Fields) new FieldMetaData("ip_tag", (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(AvatarBasicInfo.class, unmodifiableMap);
    }

    public AvatarBasicInfo() {
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
        setIp_typeIsSet(false);
        this.ip_type = 0;
        this.ip_cn = null;
        this.ip_en = null;
        this.ip_tag = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof AvatarBasicInfo)) {
            return equals((AvatarBasicInfo) that);
        }
        return false;
    }

    public String getIp_cn() {
        return this.ip_cn;
    }

    public String getIp_en() {
        return this.ip_en;
    }

    public String getIp_tag() {
        return this.ip_tag;
    }

    public int getIp_type() {
        return this.ip_type;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetIp_cn() {
        return this.ip_cn != null;
    }

    public boolean isSetIp_en() {
        return this.ip_en != null;
    }

    public boolean isSetIp_tag() {
        return this.ip_tag != null;
    }

    public boolean isSetIp_type() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public AvatarBasicInfo setIp_cn(String ip_cn) {
        this.ip_cn = ip_cn;
        return this;
    }

    public void setIp_cnIsSet(boolean value) {
        if (value) {
            return;
        }
        this.ip_cn = null;
    }

    public AvatarBasicInfo setIp_en(String ip_en) {
        this.ip_en = ip_en;
        return this;
    }

    public void setIp_enIsSet(boolean value) {
        if (value) {
            return;
        }
        this.ip_en = null;
    }

    public AvatarBasicInfo setIp_tag(String ip_tag) {
        this.ip_tag = ip_tag;
        return this;
    }

    public void setIp_tagIsSet(boolean value) {
        if (value) {
            return;
        }
        this.ip_tag = null;
    }

    public AvatarBasicInfo setIp_type(int ip_type) {
        this.ip_type = ip_type;
        setIp_typeIsSet(true);
        return this;
    }

    public void setIp_typeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AvatarBasicInfo(");
        sb2.append("ip_type:");
        sb2.append(this.ip_type);
        sb2.append(j2.O);
        sb2.append("ip_cn:");
        String str = this.ip_cn;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("ip_en:");
        String str2 = this.ip_en;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("ip_tag:");
        String str3 = this.ip_tag;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetIp_cn() {
        this.ip_cn = null;
    }

    public void unsetIp_en() {
        this.ip_en = null;
    }

    public void unsetIp_tag() {
        this.ip_tag = null;
    }

    public void unsetIp_type() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void validate() throws TException {
        if (this.ip_cn == null) {
            throw new TProtocolException("Required field 'ip_cn' was not present! Struct: " + toString());
        }
        if (this.ip_en == null) {
            throw new TProtocolException("Required field 'ip_en' was not present! Struct: " + toString());
        }
        if (this.ip_tag != null) {
            return;
        }
        throw new TProtocolException("Required field 'ip_tag' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(AvatarBasicInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetIp_type()).compareTo(Boolean.valueOf(other.isSetIp_type()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetIp_type() && (compareTo4 = TBaseHelper.compareTo(this.ip_type, other.ip_type)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetIp_cn()).compareTo(Boolean.valueOf(other.isSetIp_cn()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetIp_cn() && (compareTo3 = TBaseHelper.compareTo(this.ip_cn, other.ip_cn)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetIp_en()).compareTo(Boolean.valueOf(other.isSetIp_en()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetIp_en() && (compareTo2 = TBaseHelper.compareTo(this.ip_en, other.ip_en)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetIp_tag()).compareTo(Boolean.valueOf(other.isSetIp_tag()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetIp_tag() || (compareTo = TBaseHelper.compareTo(this.ip_tag, other.ip_tag)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<AvatarBasicInfo, _Fields> deepCopy2() {
        return new AvatarBasicInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$avatar_api$AvatarBasicInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getIp_type());
        }
        if (i11 == 2) {
            return getIp_cn();
        }
        if (i11 == 3) {
            return getIp_en();
        }
        if (i11 == 4) {
            return getIp_tag();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$avatar_api$AvatarBasicInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetIp_type();
        }
        if (i11 == 2) {
            return isSetIp_cn();
        }
        if (i11 == 3) {
            return isSetIp_en();
        }
        if (i11 == 4) {
            return isSetIp_tag();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$avatar_api$AvatarBasicInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetIp_type();
                return;
            } else {
                setIp_type(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetIp_cn();
                return;
            } else {
                setIp_cn((String) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetIp_en();
                return;
            } else {
                setIp_en((String) value);
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetIp_tag();
        } else {
            setIp_tag((String) value);
        }
    }

    public AvatarBasicInfo(int ip_type, String ip_cn, String ip_en, String ip_tag) {
        this();
        this.ip_type = ip_type;
        setIp_typeIsSet(true);
        this.ip_cn = ip_cn;
        this.ip_en = ip_en;
        this.ip_tag = ip_tag;
    }

    public boolean equals(AvatarBasicInfo that) {
        if (that == null || this.ip_type != that.ip_type) {
            return false;
        }
        boolean isSetIp_cn = isSetIp_cn();
        boolean isSetIp_cn2 = that.isSetIp_cn();
        if ((isSetIp_cn || isSetIp_cn2) && !(isSetIp_cn && isSetIp_cn2 && this.ip_cn.equals(that.ip_cn))) {
            return false;
        }
        boolean isSetIp_en = isSetIp_en();
        boolean isSetIp_en2 = that.isSetIp_en();
        if ((isSetIp_en || isSetIp_en2) && !(isSetIp_en && isSetIp_en2 && this.ip_en.equals(that.ip_en))) {
            return false;
        }
        boolean isSetIp_tag = isSetIp_tag();
        boolean isSetIp_tag2 = that.isSetIp_tag();
        if (isSetIp_tag || isSetIp_tag2) {
            return isSetIp_tag && isSetIp_tag2 && this.ip_tag.equals(that.ip_tag);
        }
        return true;
    }

    public AvatarBasicInfo(AvatarBasicInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.ip_type = other.ip_type;
        if (other.isSetIp_cn()) {
            this.ip_cn = other.ip_cn;
        }
        if (other.isSetIp_en()) {
            this.ip_en = other.ip_en;
        }
        if (other.isSetIp_tag()) {
            this.ip_tag = other.ip_tag;
        }
    }
}
