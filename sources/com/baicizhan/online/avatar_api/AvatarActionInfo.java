package com.baicizhan.online.avatar_api;

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
public class AvatarActionInfo implements TBase<AvatarActionInfo, _Fields>, Serializable, Cloneable, Comparable<AvatarActionInfo> {
    private static final int __ACTION_ID_ISSET_ID = 0;
    private static final int __ACTION_TYPE_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String action_desc;
    public String action_icon;
    public int action_id;
    public String action_name;
    public int action_type;
    public String action_upgrade_text;
    private _Fields[] optionals;
    public String sound_effect;
    private static final TStruct STRUCT_DESC = new TStruct("AvatarActionInfo");
    private static final TField ACTION_ID_FIELD_DESC = new TField("action_id", (byte) 8, 1);
    private static final TField ACTION_TYPE_FIELD_DESC = new TField("action_type", (byte) 8, 2);
    private static final TField ACTION_NAME_FIELD_DESC = new TField("action_name", (byte) 11, 3);
    private static final TField ACTION_UPGRADE_TEXT_FIELD_DESC = new TField("action_upgrade_text", (byte) 11, 4);
    private static final TField ACTION_ICON_FIELD_DESC = new TField("action_icon", (byte) 11, 5);
    private static final TField ACTION_DESC_FIELD_DESC = new TField("action_desc", (byte) 11, 6);
    private static final TField SOUND_EFFECT_FIELD_DESC = new TField(i9.j.f60415f, (byte) 11, 7);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.avatar_api.AvatarActionInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$avatar_api$AvatarActionInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$avatar_api$AvatarActionInfo$_Fields = iArr;
            try {
                iArr[_Fields.ACTION_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$AvatarActionInfo$_Fields[_Fields.ACTION_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$AvatarActionInfo$_Fields[_Fields.ACTION_NAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$AvatarActionInfo$_Fields[_Fields.ACTION_UPGRADE_TEXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$AvatarActionInfo$_Fields[_Fields.ACTION_ICON.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$AvatarActionInfo$_Fields[_Fields.ACTION_DESC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$AvatarActionInfo$_Fields[_Fields.SOUND_EFFECT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AvatarActionInfoStandardScheme extends StandardScheme<AvatarActionInfo> {
        private AvatarActionInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, AvatarActionInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetAction_id()) {
                        throw new TProtocolException("Required field 'action_id' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetAction_type()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'action_type' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.action_id = iprot.readI32();
                            struct.setAction_idIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.action_type = iprot.readI32();
                            struct.setAction_typeIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.action_name = iprot.readString();
                            struct.setAction_nameIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.action_upgrade_text = iprot.readString();
                            struct.setAction_upgrade_textIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.action_icon = iprot.readString();
                            struct.setAction_iconIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.action_desc = iprot.readString();
                            struct.setAction_descIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.sound_effect = iprot.readString();
                            struct.setSound_effectIsSet(true);
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
        public void write(TProtocol oprot, AvatarActionInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(AvatarActionInfo.STRUCT_DESC);
            oprot.writeFieldBegin(AvatarActionInfo.ACTION_ID_FIELD_DESC);
            oprot.writeI32(struct.action_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(AvatarActionInfo.ACTION_TYPE_FIELD_DESC);
            oprot.writeI32(struct.action_type);
            oprot.writeFieldEnd();
            if (struct.action_name != null) {
                oprot.writeFieldBegin(AvatarActionInfo.ACTION_NAME_FIELD_DESC);
                oprot.writeString(struct.action_name);
                oprot.writeFieldEnd();
            }
            if (struct.action_upgrade_text != null) {
                oprot.writeFieldBegin(AvatarActionInfo.ACTION_UPGRADE_TEXT_FIELD_DESC);
                oprot.writeString(struct.action_upgrade_text);
                oprot.writeFieldEnd();
            }
            if (struct.action_icon != null) {
                oprot.writeFieldBegin(AvatarActionInfo.ACTION_ICON_FIELD_DESC);
                oprot.writeString(struct.action_icon);
                oprot.writeFieldEnd();
            }
            if (struct.action_desc != null) {
                oprot.writeFieldBegin(AvatarActionInfo.ACTION_DESC_FIELD_DESC);
                oprot.writeString(struct.action_desc);
                oprot.writeFieldEnd();
            }
            if (struct.sound_effect != null && struct.isSetSound_effect()) {
                oprot.writeFieldBegin(AvatarActionInfo.SOUND_EFFECT_FIELD_DESC);
                oprot.writeString(struct.sound_effect);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AvatarActionInfoStandardSchemeFactory implements SchemeFactory {
        private AvatarActionInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AvatarActionInfoStandardScheme getScheme() {
            return new AvatarActionInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AvatarActionInfoTupleScheme extends TupleScheme<AvatarActionInfo> {
        private AvatarActionInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, AvatarActionInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.action_id = tTupleProtocol.readI32();
            struct.setAction_idIsSet(true);
            struct.action_type = tTupleProtocol.readI32();
            struct.setAction_typeIsSet(true);
            struct.action_name = tTupleProtocol.readString();
            struct.setAction_nameIsSet(true);
            struct.action_upgrade_text = tTupleProtocol.readString();
            struct.setAction_upgrade_textIsSet(true);
            struct.action_icon = tTupleProtocol.readString();
            struct.setAction_iconIsSet(true);
            struct.action_desc = tTupleProtocol.readString();
            struct.setAction_descIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                struct.sound_effect = tTupleProtocol.readString();
                struct.setSound_effectIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, AvatarActionInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.action_id);
            tTupleProtocol.writeI32(struct.action_type);
            tTupleProtocol.writeString(struct.action_name);
            tTupleProtocol.writeString(struct.action_upgrade_text);
            tTupleProtocol.writeString(struct.action_icon);
            tTupleProtocol.writeString(struct.action_desc);
            BitSet bitSet = new BitSet();
            if (struct.isSetSound_effect()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetSound_effect()) {
                tTupleProtocol.writeString(struct.sound_effect);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AvatarActionInfoTupleSchemeFactory implements SchemeFactory {
        private AvatarActionInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AvatarActionInfoTupleScheme getScheme() {
            return new AvatarActionInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ACTION_ID(1, "action_id"),
        ACTION_TYPE(2, "action_type"),
        ACTION_NAME(3, "action_name"),
        ACTION_UPGRADE_TEXT(4, "action_upgrade_text"),
        ACTION_ICON(5, "action_icon"),
        ACTION_DESC(6, "action_desc"),
        SOUND_EFFECT(7, i9.j.f60415f);

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
                    return ACTION_ID;
                case 2:
                    return ACTION_TYPE;
                case 3:
                    return ACTION_NAME;
                case 4:
                    return ACTION_UPGRADE_TEXT;
                case 5:
                    return ACTION_ICON;
                case 6:
                    return ACTION_DESC;
                case 7:
                    return SOUND_EFFECT;
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
        hashMap.put(StandardScheme.class, new AvatarActionInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new AvatarActionInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ACTION_ID, (_Fields) new FieldMetaData("action_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.ACTION_TYPE, (_Fields) new FieldMetaData("action_type", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.ACTION_NAME, (_Fields) new FieldMetaData("action_name", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ACTION_UPGRADE_TEXT, (_Fields) new FieldMetaData("action_upgrade_text", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ACTION_ICON, (_Fields) new FieldMetaData("action_icon", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ACTION_DESC, (_Fields) new FieldMetaData("action_desc", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SOUND_EFFECT, (_Fields) new FieldMetaData(i9.j.f60415f, (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(AvatarActionInfo.class, unmodifiableMap);
    }

    public AvatarActionInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.SOUND_EFFECT};
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
        setAction_idIsSet(false);
        this.action_id = 0;
        setAction_typeIsSet(false);
        this.action_type = 0;
        this.action_name = null;
        this.action_upgrade_text = null;
        this.action_icon = null;
        this.action_desc = null;
        this.sound_effect = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof AvatarActionInfo)) {
            return equals((AvatarActionInfo) that);
        }
        return false;
    }

    public String getAction_desc() {
        return this.action_desc;
    }

    public String getAction_icon() {
        return this.action_icon;
    }

    public int getAction_id() {
        return this.action_id;
    }

    public String getAction_name() {
        return this.action_name;
    }

    public int getAction_type() {
        return this.action_type;
    }

    public String getAction_upgrade_text() {
        return this.action_upgrade_text;
    }

    public String getSound_effect() {
        return this.sound_effect;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAction_desc() {
        return this.action_desc != null;
    }

    public boolean isSetAction_icon() {
        return this.action_icon != null;
    }

    public boolean isSetAction_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetAction_name() {
        return this.action_name != null;
    }

    public boolean isSetAction_type() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetAction_upgrade_text() {
        return this.action_upgrade_text != null;
    }

    public boolean isSetSound_effect() {
        return this.sound_effect != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public AvatarActionInfo setAction_desc(String action_desc) {
        this.action_desc = action_desc;
        return this;
    }

    public void setAction_descIsSet(boolean value) {
        if (value) {
            return;
        }
        this.action_desc = null;
    }

    public AvatarActionInfo setAction_icon(String action_icon) {
        this.action_icon = action_icon;
        return this;
    }

    public void setAction_iconIsSet(boolean value) {
        if (value) {
            return;
        }
        this.action_icon = null;
    }

    public AvatarActionInfo setAction_id(int action_id) {
        this.action_id = action_id;
        setAction_idIsSet(true);
        return this;
    }

    public void setAction_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public AvatarActionInfo setAction_name(String action_name) {
        this.action_name = action_name;
        return this;
    }

    public void setAction_nameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.action_name = null;
    }

    public AvatarActionInfo setAction_type(int action_type) {
        this.action_type = action_type;
        setAction_typeIsSet(true);
        return this;
    }

    public void setAction_typeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public AvatarActionInfo setAction_upgrade_text(String action_upgrade_text) {
        this.action_upgrade_text = action_upgrade_text;
        return this;
    }

    public void setAction_upgrade_textIsSet(boolean value) {
        if (value) {
            return;
        }
        this.action_upgrade_text = null;
    }

    public AvatarActionInfo setSound_effect(String sound_effect) {
        this.sound_effect = sound_effect;
        return this;
    }

    public void setSound_effectIsSet(boolean value) {
        if (value) {
            return;
        }
        this.sound_effect = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AvatarActionInfo(");
        sb2.append("action_id:");
        sb2.append(this.action_id);
        sb2.append(j2.O);
        sb2.append("action_type:");
        sb2.append(this.action_type);
        sb2.append(j2.O);
        sb2.append("action_name:");
        String str = this.action_name;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("action_upgrade_text:");
        String str2 = this.action_upgrade_text;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("action_icon:");
        String str3 = this.action_icon;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(j2.O);
        sb2.append("action_desc:");
        String str4 = this.action_desc;
        if (str4 == null) {
            sb2.append("null");
        } else {
            sb2.append(str4);
        }
        if (isSetSound_effect()) {
            sb2.append(j2.O);
            sb2.append("sound_effect:");
            String str5 = this.sound_effect;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAction_desc() {
        this.action_desc = null;
    }

    public void unsetAction_icon() {
        this.action_icon = null;
    }

    public void unsetAction_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetAction_name() {
        this.action_name = null;
    }

    public void unsetAction_type() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetAction_upgrade_text() {
        this.action_upgrade_text = null;
    }

    public void unsetSound_effect() {
        this.sound_effect = null;
    }

    public void validate() throws TException {
        if (this.action_name == null) {
            throw new TProtocolException("Required field 'action_name' was not present! Struct: " + toString());
        }
        if (this.action_upgrade_text == null) {
            throw new TProtocolException("Required field 'action_upgrade_text' was not present! Struct: " + toString());
        }
        if (this.action_icon == null) {
            throw new TProtocolException("Required field 'action_icon' was not present! Struct: " + toString());
        }
        if (this.action_desc != null) {
            return;
        }
        throw new TProtocolException("Required field 'action_desc' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(AvatarActionInfo other) {
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
        int compareTo8 = Boolean.valueOf(isSetAction_id()).compareTo(Boolean.valueOf(other.isSetAction_id()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetAction_id() && (compareTo7 = TBaseHelper.compareTo(this.action_id, other.action_id)) != 0) {
            return compareTo7;
        }
        int compareTo9 = Boolean.valueOf(isSetAction_type()).compareTo(Boolean.valueOf(other.isSetAction_type()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetAction_type() && (compareTo6 = TBaseHelper.compareTo(this.action_type, other.action_type)) != 0) {
            return compareTo6;
        }
        int compareTo10 = Boolean.valueOf(isSetAction_name()).compareTo(Boolean.valueOf(other.isSetAction_name()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetAction_name() && (compareTo5 = TBaseHelper.compareTo(this.action_name, other.action_name)) != 0) {
            return compareTo5;
        }
        int compareTo11 = Boolean.valueOf(isSetAction_upgrade_text()).compareTo(Boolean.valueOf(other.isSetAction_upgrade_text()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetAction_upgrade_text() && (compareTo4 = TBaseHelper.compareTo(this.action_upgrade_text, other.action_upgrade_text)) != 0) {
            return compareTo4;
        }
        int compareTo12 = Boolean.valueOf(isSetAction_icon()).compareTo(Boolean.valueOf(other.isSetAction_icon()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetAction_icon() && (compareTo3 = TBaseHelper.compareTo(this.action_icon, other.action_icon)) != 0) {
            return compareTo3;
        }
        int compareTo13 = Boolean.valueOf(isSetAction_desc()).compareTo(Boolean.valueOf(other.isSetAction_desc()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetAction_desc() && (compareTo2 = TBaseHelper.compareTo(this.action_desc, other.action_desc)) != 0) {
            return compareTo2;
        }
        int compareTo14 = Boolean.valueOf(isSetSound_effect()).compareTo(Boolean.valueOf(other.isSetSound_effect()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (!isSetSound_effect() || (compareTo = TBaseHelper.compareTo(this.sound_effect, other.sound_effect)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<AvatarActionInfo, _Fields> deepCopy2() {
        return new AvatarActionInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$avatar_api$AvatarActionInfo$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getAction_id());
            case 2:
                return Integer.valueOf(getAction_type());
            case 3:
                return getAction_name();
            case 4:
                return getAction_upgrade_text();
            case 5:
                return getAction_icon();
            case 6:
                return getAction_desc();
            case 7:
                return getSound_effect();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$avatar_api$AvatarActionInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetAction_id();
            case 2:
                return isSetAction_type();
            case 3:
                return isSetAction_name();
            case 4:
                return isSetAction_upgrade_text();
            case 5:
                return isSetAction_icon();
            case 6:
                return isSetAction_desc();
            case 7:
                return isSetSound_effect();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$avatar_api$AvatarActionInfo$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setAction_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetAction_id();
                    break;
                }
            case 2:
                if (value != null) {
                    setAction_type(((Integer) value).intValue());
                    break;
                } else {
                    unsetAction_type();
                    break;
                }
            case 3:
                if (value != null) {
                    setAction_name((String) value);
                    break;
                } else {
                    unsetAction_name();
                    break;
                }
            case 4:
                if (value != null) {
                    setAction_upgrade_text((String) value);
                    break;
                } else {
                    unsetAction_upgrade_text();
                    break;
                }
            case 5:
                if (value != null) {
                    setAction_icon((String) value);
                    break;
                } else {
                    unsetAction_icon();
                    break;
                }
            case 6:
                if (value != null) {
                    setAction_desc((String) value);
                    break;
                } else {
                    unsetAction_desc();
                    break;
                }
            case 7:
                if (value != null) {
                    setSound_effect((String) value);
                    break;
                } else {
                    unsetSound_effect();
                    break;
                }
        }
    }

    public boolean equals(AvatarActionInfo that) {
        if (that == null || this.action_id != that.action_id || this.action_type != that.action_type) {
            return false;
        }
        boolean isSetAction_name = isSetAction_name();
        boolean isSetAction_name2 = that.isSetAction_name();
        if ((isSetAction_name || isSetAction_name2) && !(isSetAction_name && isSetAction_name2 && this.action_name.equals(that.action_name))) {
            return false;
        }
        boolean isSetAction_upgrade_text = isSetAction_upgrade_text();
        boolean isSetAction_upgrade_text2 = that.isSetAction_upgrade_text();
        if ((isSetAction_upgrade_text || isSetAction_upgrade_text2) && !(isSetAction_upgrade_text && isSetAction_upgrade_text2 && this.action_upgrade_text.equals(that.action_upgrade_text))) {
            return false;
        }
        boolean isSetAction_icon = isSetAction_icon();
        boolean isSetAction_icon2 = that.isSetAction_icon();
        if ((isSetAction_icon || isSetAction_icon2) && !(isSetAction_icon && isSetAction_icon2 && this.action_icon.equals(that.action_icon))) {
            return false;
        }
        boolean isSetAction_desc = isSetAction_desc();
        boolean isSetAction_desc2 = that.isSetAction_desc();
        if ((isSetAction_desc || isSetAction_desc2) && !(isSetAction_desc && isSetAction_desc2 && this.action_desc.equals(that.action_desc))) {
            return false;
        }
        boolean isSetSound_effect = isSetSound_effect();
        boolean isSetSound_effect2 = that.isSetSound_effect();
        if (isSetSound_effect || isSetSound_effect2) {
            return isSetSound_effect && isSetSound_effect2 && this.sound_effect.equals(that.sound_effect);
        }
        return true;
    }

    public AvatarActionInfo(int action_id, int action_type, String action_name, String action_upgrade_text, String action_icon, String action_desc) {
        this();
        this.action_id = action_id;
        setAction_idIsSet(true);
        this.action_type = action_type;
        setAction_typeIsSet(true);
        this.action_name = action_name;
        this.action_upgrade_text = action_upgrade_text;
        this.action_icon = action_icon;
        this.action_desc = action_desc;
    }

    public AvatarActionInfo(AvatarActionInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.SOUND_EFFECT};
        this.__isset_bitfield = other.__isset_bitfield;
        this.action_id = other.action_id;
        this.action_type = other.action_type;
        if (other.isSetAction_name()) {
            this.action_name = other.action_name;
        }
        if (other.isSetAction_upgrade_text()) {
            this.action_upgrade_text = other.action_upgrade_text;
        }
        if (other.isSetAction_icon()) {
            this.action_icon = other.action_icon;
        }
        if (other.isSetAction_desc()) {
            this.action_desc = other.action_desc;
        }
        if (other.isSetSound_effect()) {
            this.sound_effect = other.sound_effect;
        }
    }
}
