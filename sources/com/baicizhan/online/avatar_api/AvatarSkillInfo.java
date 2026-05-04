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
public class AvatarSkillInfo implements TBase<AvatarSkillInfo, _Fields>, Serializable, Cloneable, Comparable<AvatarSkillInfo> {
    private static final int __SKILL_ID_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String skill_desc;
    public String skill_icon;
    public int skill_id;
    public String skill_name;
    public String skill_upgrade_text;
    private static final TStruct STRUCT_DESC = new TStruct("AvatarSkillInfo");
    private static final TField SKILL_ID_FIELD_DESC = new TField("skill_id", (byte) 8, 1);
    private static final TField SKILL_NAME_FIELD_DESC = new TField("skill_name", (byte) 11, 2);
    private static final TField SKILL_UPGRADE_TEXT_FIELD_DESC = new TField("skill_upgrade_text", (byte) 11, 3);
    private static final TField SKILL_ICON_FIELD_DESC = new TField("skill_icon", (byte) 11, 4);
    private static final TField SKILL_DESC_FIELD_DESC = new TField("skill_desc", (byte) 11, 5);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.avatar_api.AvatarSkillInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$avatar_api$AvatarSkillInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$avatar_api$AvatarSkillInfo$_Fields = iArr;
            try {
                iArr[_Fields.SKILL_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$AvatarSkillInfo$_Fields[_Fields.SKILL_NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$AvatarSkillInfo$_Fields[_Fields.SKILL_UPGRADE_TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$AvatarSkillInfo$_Fields[_Fields.SKILL_ICON.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$AvatarSkillInfo$_Fields[_Fields.SKILL_DESC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AvatarSkillInfoStandardScheme extends StandardScheme<AvatarSkillInfo> {
        private AvatarSkillInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, AvatarSkillInfo struct) throws TException {
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
                                    struct.skill_desc = iprot.readString();
                                    struct.setSkill_descIsSet(true);
                                } else {
                                    TProtocolUtil.skip(iprot, b11);
                                }
                            } else if (b11 == 11) {
                                struct.skill_icon = iprot.readString();
                                struct.setSkill_iconIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 11) {
                            struct.skill_upgrade_text = iprot.readString();
                            struct.setSkill_upgrade_textIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.skill_name = iprot.readString();
                        struct.setSkill_nameIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.skill_id = iprot.readI32();
                    struct.setSkill_idIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetSkill_id()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'skill_id' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, AvatarSkillInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(AvatarSkillInfo.STRUCT_DESC);
            oprot.writeFieldBegin(AvatarSkillInfo.SKILL_ID_FIELD_DESC);
            oprot.writeI32(struct.skill_id);
            oprot.writeFieldEnd();
            if (struct.skill_name != null) {
                oprot.writeFieldBegin(AvatarSkillInfo.SKILL_NAME_FIELD_DESC);
                oprot.writeString(struct.skill_name);
                oprot.writeFieldEnd();
            }
            if (struct.skill_upgrade_text != null) {
                oprot.writeFieldBegin(AvatarSkillInfo.SKILL_UPGRADE_TEXT_FIELD_DESC);
                oprot.writeString(struct.skill_upgrade_text);
                oprot.writeFieldEnd();
            }
            if (struct.skill_icon != null) {
                oprot.writeFieldBegin(AvatarSkillInfo.SKILL_ICON_FIELD_DESC);
                oprot.writeString(struct.skill_icon);
                oprot.writeFieldEnd();
            }
            if (struct.skill_desc != null) {
                oprot.writeFieldBegin(AvatarSkillInfo.SKILL_DESC_FIELD_DESC);
                oprot.writeString(struct.skill_desc);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AvatarSkillInfoStandardSchemeFactory implements SchemeFactory {
        private AvatarSkillInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AvatarSkillInfoStandardScheme getScheme() {
            return new AvatarSkillInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AvatarSkillInfoTupleScheme extends TupleScheme<AvatarSkillInfo> {
        private AvatarSkillInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, AvatarSkillInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.skill_id = tTupleProtocol.readI32();
            struct.setSkill_idIsSet(true);
            struct.skill_name = tTupleProtocol.readString();
            struct.setSkill_nameIsSet(true);
            struct.skill_upgrade_text = tTupleProtocol.readString();
            struct.setSkill_upgrade_textIsSet(true);
            struct.skill_icon = tTupleProtocol.readString();
            struct.setSkill_iconIsSet(true);
            struct.skill_desc = tTupleProtocol.readString();
            struct.setSkill_descIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, AvatarSkillInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.skill_id);
            tTupleProtocol.writeString(struct.skill_name);
            tTupleProtocol.writeString(struct.skill_upgrade_text);
            tTupleProtocol.writeString(struct.skill_icon);
            tTupleProtocol.writeString(struct.skill_desc);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AvatarSkillInfoTupleSchemeFactory implements SchemeFactory {
        private AvatarSkillInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AvatarSkillInfoTupleScheme getScheme() {
            return new AvatarSkillInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        SKILL_ID(1, "skill_id"),
        SKILL_NAME(2, "skill_name"),
        SKILL_UPGRADE_TEXT(3, "skill_upgrade_text"),
        SKILL_ICON(4, "skill_icon"),
        SKILL_DESC(5, "skill_desc");

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
                return SKILL_ID;
            }
            if (fieldId == 2) {
                return SKILL_NAME;
            }
            if (fieldId == 3) {
                return SKILL_UPGRADE_TEXT;
            }
            if (fieldId == 4) {
                return SKILL_ICON;
            }
            if (fieldId != 5) {
                return null;
            }
            return SKILL_DESC;
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
        hashMap.put(StandardScheme.class, new AvatarSkillInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new AvatarSkillInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.SKILL_ID, (_Fields) new FieldMetaData("skill_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.SKILL_NAME, (_Fields) new FieldMetaData("skill_name", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SKILL_UPGRADE_TEXT, (_Fields) new FieldMetaData("skill_upgrade_text", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SKILL_ICON, (_Fields) new FieldMetaData("skill_icon", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SKILL_DESC, (_Fields) new FieldMetaData("skill_desc", (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(AvatarSkillInfo.class, unmodifiableMap);
    }

    public AvatarSkillInfo() {
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
        setSkill_idIsSet(false);
        this.skill_id = 0;
        this.skill_name = null;
        this.skill_upgrade_text = null;
        this.skill_icon = null;
        this.skill_desc = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof AvatarSkillInfo)) {
            return equals((AvatarSkillInfo) that);
        }
        return false;
    }

    public String getSkill_desc() {
        return this.skill_desc;
    }

    public String getSkill_icon() {
        return this.skill_icon;
    }

    public int getSkill_id() {
        return this.skill_id;
    }

    public String getSkill_name() {
        return this.skill_name;
    }

    public String getSkill_upgrade_text() {
        return this.skill_upgrade_text;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetSkill_desc() {
        return this.skill_desc != null;
    }

    public boolean isSetSkill_icon() {
        return this.skill_icon != null;
    }

    public boolean isSetSkill_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetSkill_name() {
        return this.skill_name != null;
    }

    public boolean isSetSkill_upgrade_text() {
        return this.skill_upgrade_text != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public AvatarSkillInfo setSkill_desc(String skill_desc) {
        this.skill_desc = skill_desc;
        return this;
    }

    public void setSkill_descIsSet(boolean value) {
        if (value) {
            return;
        }
        this.skill_desc = null;
    }

    public AvatarSkillInfo setSkill_icon(String skill_icon) {
        this.skill_icon = skill_icon;
        return this;
    }

    public void setSkill_iconIsSet(boolean value) {
        if (value) {
            return;
        }
        this.skill_icon = null;
    }

    public AvatarSkillInfo setSkill_id(int skill_id) {
        this.skill_id = skill_id;
        setSkill_idIsSet(true);
        return this;
    }

    public void setSkill_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public AvatarSkillInfo setSkill_name(String skill_name) {
        this.skill_name = skill_name;
        return this;
    }

    public void setSkill_nameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.skill_name = null;
    }

    public AvatarSkillInfo setSkill_upgrade_text(String skill_upgrade_text) {
        this.skill_upgrade_text = skill_upgrade_text;
        return this;
    }

    public void setSkill_upgrade_textIsSet(boolean value) {
        if (value) {
            return;
        }
        this.skill_upgrade_text = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AvatarSkillInfo(");
        sb2.append("skill_id:");
        sb2.append(this.skill_id);
        sb2.append(j2.O);
        sb2.append("skill_name:");
        String str = this.skill_name;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("skill_upgrade_text:");
        String str2 = this.skill_upgrade_text;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("skill_icon:");
        String str3 = this.skill_icon;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(j2.O);
        sb2.append("skill_desc:");
        String str4 = this.skill_desc;
        if (str4 == null) {
            sb2.append("null");
        } else {
            sb2.append(str4);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetSkill_desc() {
        this.skill_desc = null;
    }

    public void unsetSkill_icon() {
        this.skill_icon = null;
    }

    public void unsetSkill_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetSkill_name() {
        this.skill_name = null;
    }

    public void unsetSkill_upgrade_text() {
        this.skill_upgrade_text = null;
    }

    public void validate() throws TException {
        if (this.skill_name == null) {
            throw new TProtocolException("Required field 'skill_name' was not present! Struct: " + toString());
        }
        if (this.skill_upgrade_text == null) {
            throw new TProtocolException("Required field 'skill_upgrade_text' was not present! Struct: " + toString());
        }
        if (this.skill_icon == null) {
            throw new TProtocolException("Required field 'skill_icon' was not present! Struct: " + toString());
        }
        if (this.skill_desc != null) {
            return;
        }
        throw new TProtocolException("Required field 'skill_desc' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(AvatarSkillInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo6 = Boolean.valueOf(isSetSkill_id()).compareTo(Boolean.valueOf(other.isSetSkill_id()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetSkill_id() && (compareTo5 = TBaseHelper.compareTo(this.skill_id, other.skill_id)) != 0) {
            return compareTo5;
        }
        int compareTo7 = Boolean.valueOf(isSetSkill_name()).compareTo(Boolean.valueOf(other.isSetSkill_name()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetSkill_name() && (compareTo4 = TBaseHelper.compareTo(this.skill_name, other.skill_name)) != 0) {
            return compareTo4;
        }
        int compareTo8 = Boolean.valueOf(isSetSkill_upgrade_text()).compareTo(Boolean.valueOf(other.isSetSkill_upgrade_text()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetSkill_upgrade_text() && (compareTo3 = TBaseHelper.compareTo(this.skill_upgrade_text, other.skill_upgrade_text)) != 0) {
            return compareTo3;
        }
        int compareTo9 = Boolean.valueOf(isSetSkill_icon()).compareTo(Boolean.valueOf(other.isSetSkill_icon()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetSkill_icon() && (compareTo2 = TBaseHelper.compareTo(this.skill_icon, other.skill_icon)) != 0) {
            return compareTo2;
        }
        int compareTo10 = Boolean.valueOf(isSetSkill_desc()).compareTo(Boolean.valueOf(other.isSetSkill_desc()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!isSetSkill_desc() || (compareTo = TBaseHelper.compareTo(this.skill_desc, other.skill_desc)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<AvatarSkillInfo, _Fields> deepCopy2() {
        return new AvatarSkillInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$avatar_api$AvatarSkillInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getSkill_id());
        }
        if (i11 == 2) {
            return getSkill_name();
        }
        if (i11 == 3) {
            return getSkill_upgrade_text();
        }
        if (i11 == 4) {
            return getSkill_icon();
        }
        if (i11 == 5) {
            return getSkill_desc();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$avatar_api$AvatarSkillInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetSkill_id();
        }
        if (i11 == 2) {
            return isSetSkill_name();
        }
        if (i11 == 3) {
            return isSetSkill_upgrade_text();
        }
        if (i11 == 4) {
            return isSetSkill_icon();
        }
        if (i11 == 5) {
            return isSetSkill_desc();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$avatar_api$AvatarSkillInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetSkill_id();
                return;
            } else {
                setSkill_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetSkill_name();
                return;
            } else {
                setSkill_name((String) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetSkill_upgrade_text();
                return;
            } else {
                setSkill_upgrade_text((String) value);
                return;
            }
        }
        if (i11 == 4) {
            if (value == null) {
                unsetSkill_icon();
                return;
            } else {
                setSkill_icon((String) value);
                return;
            }
        }
        if (i11 != 5) {
            return;
        }
        if (value == null) {
            unsetSkill_desc();
        } else {
            setSkill_desc((String) value);
        }
    }

    public AvatarSkillInfo(int skill_id, String skill_name, String skill_upgrade_text, String skill_icon, String skill_desc) {
        this();
        this.skill_id = skill_id;
        setSkill_idIsSet(true);
        this.skill_name = skill_name;
        this.skill_upgrade_text = skill_upgrade_text;
        this.skill_icon = skill_icon;
        this.skill_desc = skill_desc;
    }

    public boolean equals(AvatarSkillInfo that) {
        if (that == null || this.skill_id != that.skill_id) {
            return false;
        }
        boolean isSetSkill_name = isSetSkill_name();
        boolean isSetSkill_name2 = that.isSetSkill_name();
        if ((isSetSkill_name || isSetSkill_name2) && !(isSetSkill_name && isSetSkill_name2 && this.skill_name.equals(that.skill_name))) {
            return false;
        }
        boolean isSetSkill_upgrade_text = isSetSkill_upgrade_text();
        boolean isSetSkill_upgrade_text2 = that.isSetSkill_upgrade_text();
        if ((isSetSkill_upgrade_text || isSetSkill_upgrade_text2) && !(isSetSkill_upgrade_text && isSetSkill_upgrade_text2 && this.skill_upgrade_text.equals(that.skill_upgrade_text))) {
            return false;
        }
        boolean isSetSkill_icon = isSetSkill_icon();
        boolean isSetSkill_icon2 = that.isSetSkill_icon();
        if ((isSetSkill_icon || isSetSkill_icon2) && !(isSetSkill_icon && isSetSkill_icon2 && this.skill_icon.equals(that.skill_icon))) {
            return false;
        }
        boolean isSetSkill_desc = isSetSkill_desc();
        boolean isSetSkill_desc2 = that.isSetSkill_desc();
        if (isSetSkill_desc || isSetSkill_desc2) {
            return isSetSkill_desc && isSetSkill_desc2 && this.skill_desc.equals(that.skill_desc);
        }
        return true;
    }

    public AvatarSkillInfo(AvatarSkillInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.skill_id = other.skill_id;
        if (other.isSetSkill_name()) {
            this.skill_name = other.skill_name;
        }
        if (other.isSetSkill_upgrade_text()) {
            this.skill_upgrade_text = other.skill_upgrade_text;
        }
        if (other.isSetSkill_icon()) {
            this.skill_icon = other.skill_icon;
        }
        if (other.isSetSkill_desc()) {
            this.skill_desc = other.skill_desc;
        }
    }
}
