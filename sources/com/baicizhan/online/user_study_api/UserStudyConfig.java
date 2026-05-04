package com.baicizhan.online.user_study_api;

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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class UserStudyConfig implements TBase<UserStudyConfig, _Fields>, Serializable, Cloneable, Comparable<UserStudyConfig> {
    private static final int __CHN_MODE_ISSET_ID = 1;
    private static final int __FAST_MODE_ISSET_ID = 0;
    private static final int __IS_PI_MODE_ISSET_ID = 4;
    private static final int __LISTENING_MODE_ISSET_ID = 2;
    private static final int __SPELL_MODE_ISSET_ID = 3;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int chn_mode;
    public String extra_config;
    public int fast_mode;
    public boolean is_pi_mode;
    public int listening_mode;
    private _Fields[] optionals;
    public int spell_mode;
    private static final TStruct STRUCT_DESC = new TStruct("UserStudyConfig");
    private static final TField FAST_MODE_FIELD_DESC = new TField("fast_mode", (byte) 8, 1);
    private static final TField CHN_MODE_FIELD_DESC = new TField("chn_mode", (byte) 8, 2);
    private static final TField LISTENING_MODE_FIELD_DESC = new TField("listening_mode", (byte) 8, 3);
    private static final TField SPELL_MODE_FIELD_DESC = new TField("spell_mode", (byte) 8, 4);
    private static final TField EXTRA_CONFIG_FIELD_DESC = new TField("extra_config", (byte) 11, 5);
    private static final TField IS_PI_MODE_FIELD_DESC = new TField("is_pi_mode", (byte) 2, 6);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.UserStudyConfig$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$UserStudyConfig$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$UserStudyConfig$_Fields = iArr;
            try {
                iArr[_Fields.FAST_MODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserStudyConfig$_Fields[_Fields.CHN_MODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserStudyConfig$_Fields[_Fields.LISTENING_MODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserStudyConfig$_Fields[_Fields.SPELL_MODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserStudyConfig$_Fields[_Fields.EXTRA_CONFIG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserStudyConfig$_Fields[_Fields.IS_PI_MODE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserStudyConfigStandardScheme extends StandardScheme<UserStudyConfig> {
        private UserStudyConfigStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserStudyConfig struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetFast_mode()) {
                        throw new TProtocolException("Required field 'fast_mode' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetChn_mode()) {
                        throw new TProtocolException("Required field 'chn_mode' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetListening_mode()) {
                        throw new TProtocolException("Required field 'listening_mode' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetSpell_mode()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'spell_mode' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.fast_mode = iprot.readI32();
                            struct.setFast_modeIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.chn_mode = iprot.readI32();
                            struct.setChn_modeIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.listening_mode = iprot.readI32();
                            struct.setListening_modeIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.spell_mode = iprot.readI32();
                            struct.setSpell_modeIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.extra_config = iprot.readString();
                            struct.setExtra_configIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 2) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.is_pi_mode = iprot.readBool();
                            struct.setIs_pi_modeIsSet(true);
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
        public void write(TProtocol oprot, UserStudyConfig struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserStudyConfig.STRUCT_DESC);
            oprot.writeFieldBegin(UserStudyConfig.FAST_MODE_FIELD_DESC);
            oprot.writeI32(struct.fast_mode);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserStudyConfig.CHN_MODE_FIELD_DESC);
            oprot.writeI32(struct.chn_mode);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserStudyConfig.LISTENING_MODE_FIELD_DESC);
            oprot.writeI32(struct.listening_mode);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserStudyConfig.SPELL_MODE_FIELD_DESC);
            oprot.writeI32(struct.spell_mode);
            oprot.writeFieldEnd();
            if (struct.extra_config != null && struct.isSetExtra_config()) {
                oprot.writeFieldBegin(UserStudyConfig.EXTRA_CONFIG_FIELD_DESC);
                oprot.writeString(struct.extra_config);
                oprot.writeFieldEnd();
            }
            if (struct.isSetIs_pi_mode()) {
                oprot.writeFieldBegin(UserStudyConfig.IS_PI_MODE_FIELD_DESC);
                oprot.writeBool(struct.is_pi_mode);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserStudyConfigStandardSchemeFactory implements SchemeFactory {
        private UserStudyConfigStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserStudyConfigStandardScheme getScheme() {
            return new UserStudyConfigStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserStudyConfigTupleScheme extends TupleScheme<UserStudyConfig> {
        private UserStudyConfigTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserStudyConfig struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.fast_mode = tTupleProtocol.readI32();
            struct.setFast_modeIsSet(true);
            struct.chn_mode = tTupleProtocol.readI32();
            struct.setChn_modeIsSet(true);
            struct.listening_mode = tTupleProtocol.readI32();
            struct.setListening_modeIsSet(true);
            struct.spell_mode = tTupleProtocol.readI32();
            struct.setSpell_modeIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(2);
            if (readBitSet.get(0)) {
                struct.extra_config = tTupleProtocol.readString();
                struct.setExtra_configIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.is_pi_mode = tTupleProtocol.readBool();
                struct.setIs_pi_modeIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserStudyConfig struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.fast_mode);
            tTupleProtocol.writeI32(struct.chn_mode);
            tTupleProtocol.writeI32(struct.listening_mode);
            tTupleProtocol.writeI32(struct.spell_mode);
            BitSet bitSet = new BitSet();
            if (struct.isSetExtra_config()) {
                bitSet.set(0);
            }
            if (struct.isSetIs_pi_mode()) {
                bitSet.set(1);
            }
            tTupleProtocol.writeBitSet(bitSet, 2);
            if (struct.isSetExtra_config()) {
                tTupleProtocol.writeString(struct.extra_config);
            }
            if (struct.isSetIs_pi_mode()) {
                tTupleProtocol.writeBool(struct.is_pi_mode);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserStudyConfigTupleSchemeFactory implements SchemeFactory {
        private UserStudyConfigTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserStudyConfigTupleScheme getScheme() {
            return new UserStudyConfigTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        FAST_MODE(1, "fast_mode"),
        CHN_MODE(2, "chn_mode"),
        LISTENING_MODE(3, "listening_mode"),
        SPELL_MODE(4, "spell_mode"),
        EXTRA_CONFIG(5, "extra_config"),
        IS_PI_MODE(6, "is_pi_mode");

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
                    return FAST_MODE;
                case 2:
                    return CHN_MODE;
                case 3:
                    return LISTENING_MODE;
                case 4:
                    return SPELL_MODE;
                case 5:
                    return EXTRA_CONFIG;
                case 6:
                    return IS_PI_MODE;
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
        hashMap.put(StandardScheme.class, new UserStudyConfigStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserStudyConfigTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.FAST_MODE, (_Fields) new FieldMetaData("fast_mode", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.CHN_MODE, (_Fields) new FieldMetaData("chn_mode", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.LISTENING_MODE, (_Fields) new FieldMetaData("listening_mode", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.SPELL_MODE, (_Fields) new FieldMetaData("spell_mode", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.EXTRA_CONFIG, (_Fields) new FieldMetaData("extra_config", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.IS_PI_MODE, (_Fields) new FieldMetaData("is_pi_mode", (byte) 2, new FieldValueMetaData((byte) 2)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserStudyConfig.class, unmodifiableMap);
    }

    public UserStudyConfig() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.EXTRA_CONFIG, _Fields.IS_PI_MODE};
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
        setFast_modeIsSet(false);
        this.fast_mode = 0;
        setChn_modeIsSet(false);
        this.chn_mode = 0;
        setListening_modeIsSet(false);
        this.listening_mode = 0;
        setSpell_modeIsSet(false);
        this.spell_mode = 0;
        this.extra_config = null;
        setIs_pi_modeIsSet(false);
        this.is_pi_mode = false;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserStudyConfig)) {
            return equals((UserStudyConfig) that);
        }
        return false;
    }

    public int getChn_mode() {
        return this.chn_mode;
    }

    public String getExtra_config() {
        return this.extra_config;
    }

    public int getFast_mode() {
        return this.fast_mode;
    }

    public int getListening_mode() {
        return this.listening_mode;
    }

    public int getSpell_mode() {
        return this.spell_mode;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isIs_pi_mode() {
        return this.is_pi_mode;
    }

    public boolean isSetChn_mode() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetExtra_config() {
        return this.extra_config != null;
    }

    public boolean isSetFast_mode() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetIs_pi_mode() {
        return EncodingUtils.testBit(this.__isset_bitfield, 4);
    }

    public boolean isSetListening_mode() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetSpell_mode() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserStudyConfig setChn_mode(int chn_mode) {
        this.chn_mode = chn_mode;
        setChn_modeIsSet(true);
        return this;
    }

    public void setChn_modeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public UserStudyConfig setExtra_config(String extra_config) {
        this.extra_config = extra_config;
        return this;
    }

    public void setExtra_configIsSet(boolean value) {
        if (value) {
            return;
        }
        this.extra_config = null;
    }

    public UserStudyConfig setFast_mode(int fast_mode) {
        this.fast_mode = fast_mode;
        setFast_modeIsSet(true);
        return this;
    }

    public void setFast_modeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public UserStudyConfig setIs_pi_mode(boolean is_pi_mode) {
        this.is_pi_mode = is_pi_mode;
        setIs_pi_modeIsSet(true);
        return this;
    }

    public void setIs_pi_modeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 4, value);
    }

    public UserStudyConfig setListening_mode(int listening_mode) {
        this.listening_mode = listening_mode;
        setListening_modeIsSet(true);
        return this;
    }

    public void setListening_modeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public UserStudyConfig setSpell_mode(int spell_mode) {
        this.spell_mode = spell_mode;
        setSpell_modeIsSet(true);
        return this;
    }

    public void setSpell_modeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserStudyConfig(");
        sb2.append("fast_mode:");
        sb2.append(this.fast_mode);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("chn_mode:");
        sb2.append(this.chn_mode);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("listening_mode:");
        sb2.append(this.listening_mode);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("spell_mode:");
        sb2.append(this.spell_mode);
        if (isSetExtra_config()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("extra_config:");
            String str = this.extra_config;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
        }
        if (isSetIs_pi_mode()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("is_pi_mode:");
            sb2.append(this.is_pi_mode);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetChn_mode() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetExtra_config() {
        this.extra_config = null;
    }

    public void unsetFast_mode() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetIs_pi_mode() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 4);
    }

    public void unsetListening_mode() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetSpell_mode() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(UserStudyConfig other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo7 = Boolean.valueOf(isSetFast_mode()).compareTo(Boolean.valueOf(other.isSetFast_mode()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetFast_mode() && (compareTo6 = TBaseHelper.compareTo(this.fast_mode, other.fast_mode)) != 0) {
            return compareTo6;
        }
        int compareTo8 = Boolean.valueOf(isSetChn_mode()).compareTo(Boolean.valueOf(other.isSetChn_mode()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetChn_mode() && (compareTo5 = TBaseHelper.compareTo(this.chn_mode, other.chn_mode)) != 0) {
            return compareTo5;
        }
        int compareTo9 = Boolean.valueOf(isSetListening_mode()).compareTo(Boolean.valueOf(other.isSetListening_mode()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetListening_mode() && (compareTo4 = TBaseHelper.compareTo(this.listening_mode, other.listening_mode)) != 0) {
            return compareTo4;
        }
        int compareTo10 = Boolean.valueOf(isSetSpell_mode()).compareTo(Boolean.valueOf(other.isSetSpell_mode()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetSpell_mode() && (compareTo3 = TBaseHelper.compareTo(this.spell_mode, other.spell_mode)) != 0) {
            return compareTo3;
        }
        int compareTo11 = Boolean.valueOf(isSetExtra_config()).compareTo(Boolean.valueOf(other.isSetExtra_config()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetExtra_config() && (compareTo2 = TBaseHelper.compareTo(this.extra_config, other.extra_config)) != 0) {
            return compareTo2;
        }
        int compareTo12 = Boolean.valueOf(isSetIs_pi_mode()).compareTo(Boolean.valueOf(other.isSetIs_pi_mode()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (!isSetIs_pi_mode() || (compareTo = TBaseHelper.compareTo(this.is_pi_mode, other.is_pi_mode)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserStudyConfig, _Fields> deepCopy2() {
        return new UserStudyConfig(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserStudyConfig$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getFast_mode());
            case 2:
                return Integer.valueOf(getChn_mode());
            case 3:
                return Integer.valueOf(getListening_mode());
            case 4:
                return Integer.valueOf(getSpell_mode());
            case 5:
                return getExtra_config();
            case 6:
                return Boolean.valueOf(isIs_pi_mode());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserStudyConfig$_Fields[field.ordinal()]) {
            case 1:
                return isSetFast_mode();
            case 2:
                return isSetChn_mode();
            case 3:
                return isSetListening_mode();
            case 4:
                return isSetSpell_mode();
            case 5:
                return isSetExtra_config();
            case 6:
                return isSetIs_pi_mode();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserStudyConfig$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setFast_mode(((Integer) value).intValue());
                    break;
                } else {
                    unsetFast_mode();
                    break;
                }
            case 2:
                if (value != null) {
                    setChn_mode(((Integer) value).intValue());
                    break;
                } else {
                    unsetChn_mode();
                    break;
                }
            case 3:
                if (value != null) {
                    setListening_mode(((Integer) value).intValue());
                    break;
                } else {
                    unsetListening_mode();
                    break;
                }
            case 4:
                if (value != null) {
                    setSpell_mode(((Integer) value).intValue());
                    break;
                } else {
                    unsetSpell_mode();
                    break;
                }
            case 5:
                if (value != null) {
                    setExtra_config((String) value);
                    break;
                } else {
                    unsetExtra_config();
                    break;
                }
            case 6:
                if (value != null) {
                    setIs_pi_mode(((Boolean) value).booleanValue());
                    break;
                } else {
                    unsetIs_pi_mode();
                    break;
                }
        }
    }

    public boolean equals(UserStudyConfig that) {
        if (that == null || this.fast_mode != that.fast_mode || this.chn_mode != that.chn_mode || this.listening_mode != that.listening_mode || this.spell_mode != that.spell_mode) {
            return false;
        }
        boolean isSetExtra_config = isSetExtra_config();
        boolean isSetExtra_config2 = that.isSetExtra_config();
        if ((isSetExtra_config || isSetExtra_config2) && !(isSetExtra_config && isSetExtra_config2 && this.extra_config.equals(that.extra_config))) {
            return false;
        }
        boolean isSetIs_pi_mode = isSetIs_pi_mode();
        boolean isSetIs_pi_mode2 = that.isSetIs_pi_mode();
        if (isSetIs_pi_mode || isSetIs_pi_mode2) {
            return isSetIs_pi_mode && isSetIs_pi_mode2 && this.is_pi_mode == that.is_pi_mode;
        }
        return true;
    }

    public UserStudyConfig(int fast_mode, int chn_mode, int listening_mode, int spell_mode) {
        this();
        this.fast_mode = fast_mode;
        setFast_modeIsSet(true);
        this.chn_mode = chn_mode;
        setChn_modeIsSet(true);
        this.listening_mode = listening_mode;
        setListening_modeIsSet(true);
        this.spell_mode = spell_mode;
        setSpell_modeIsSet(true);
    }

    public UserStudyConfig(UserStudyConfig other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.EXTRA_CONFIG, _Fields.IS_PI_MODE};
        this.__isset_bitfield = other.__isset_bitfield;
        this.fast_mode = other.fast_mode;
        this.chn_mode = other.chn_mode;
        this.listening_mode = other.listening_mode;
        this.spell_mode = other.spell_mode;
        if (other.isSetExtra_config()) {
            this.extra_config = other.extra_config;
        }
        this.is_pi_mode = other.is_pi_mode;
    }

    public void validate() throws TException {
    }
}
