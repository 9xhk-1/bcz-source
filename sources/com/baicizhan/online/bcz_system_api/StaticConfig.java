package com.baicizhan.online.bcz_system_api;

import com.baicizhan.client.business.dataset.provider.a;
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
public class StaticConfig implements TBase<StaticConfig, _Fields>, Serializable, Cloneable, Comparable<StaticConfig> {
    private static final int __BIT_FLAG_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int bit_flag;
    public String config_json;
    public String key;
    private static final TStruct STRUCT_DESC = new TStruct(y9.e.f99707g);
    private static final TField KEY_FIELD_DESC = new TField(a.d.C0245a.f16161a, (byte) 11, 1);
    private static final TField BIT_FLAG_FIELD_DESC = new TField("bit_flag", (byte) 8, 2);
    private static final TField CONFIG_JSON_FIELD_DESC = new TField("config_json", (byte) 11, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bcz_system_api.StaticConfig$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$StaticConfig$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bcz_system_api$StaticConfig$_Fields = iArr;
            try {
                iArr[_Fields.KEY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$StaticConfig$_Fields[_Fields.BIT_FLAG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$StaticConfig$_Fields[_Fields.CONFIG_JSON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StaticConfigStandardScheme extends StandardScheme<StaticConfig> {
        private StaticConfigStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, StaticConfig struct) throws TException {
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
                            struct.config_json = iprot.readString();
                            struct.setConfig_jsonIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.bit_flag = iprot.readI32();
                        struct.setBit_flagIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.key = iprot.readString();
                    struct.setKeyIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetBit_flag()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'bit_flag' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, StaticConfig struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(StaticConfig.STRUCT_DESC);
            if (struct.key != null) {
                oprot.writeFieldBegin(StaticConfig.KEY_FIELD_DESC);
                oprot.writeString(struct.key);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(StaticConfig.BIT_FLAG_FIELD_DESC);
            oprot.writeI32(struct.bit_flag);
            oprot.writeFieldEnd();
            if (struct.config_json != null) {
                oprot.writeFieldBegin(StaticConfig.CONFIG_JSON_FIELD_DESC);
                oprot.writeString(struct.config_json);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StaticConfigStandardSchemeFactory implements SchemeFactory {
        private StaticConfigStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public StaticConfigStandardScheme getScheme() {
            return new StaticConfigStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StaticConfigTupleScheme extends TupleScheme<StaticConfig> {
        private StaticConfigTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, StaticConfig struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.key = tTupleProtocol.readString();
            struct.setKeyIsSet(true);
            struct.bit_flag = tTupleProtocol.readI32();
            struct.setBit_flagIsSet(true);
            struct.config_json = tTupleProtocol.readString();
            struct.setConfig_jsonIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, StaticConfig struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.key);
            tTupleProtocol.writeI32(struct.bit_flag);
            tTupleProtocol.writeString(struct.config_json);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StaticConfigTupleSchemeFactory implements SchemeFactory {
        private StaticConfigTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public StaticConfigTupleScheme getScheme() {
            return new StaticConfigTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        KEY(1, a.d.C0245a.f16161a),
        BIT_FLAG(2, "bit_flag"),
        CONFIG_JSON(3, "config_json");

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
                return KEY;
            }
            if (fieldId == 2) {
                return BIT_FLAG;
            }
            if (fieldId != 3) {
                return null;
            }
            return CONFIG_JSON;
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
        hashMap.put(StandardScheme.class, new StaticConfigStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new StaticConfigTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.KEY, (_Fields) new FieldMetaData(a.d.C0245a.f16161a, (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.BIT_FLAG, (_Fields) new FieldMetaData("bit_flag", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.CONFIG_JSON, (_Fields) new FieldMetaData("config_json", (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(StaticConfig.class, unmodifiableMap);
    }

    public StaticConfig() {
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
        this.key = null;
        setBit_flagIsSet(false);
        this.bit_flag = 0;
        this.config_json = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof StaticConfig)) {
            return equals((StaticConfig) that);
        }
        return false;
    }

    public int getBit_flag() {
        return this.bit_flag;
    }

    public String getConfig_json() {
        return this.config_json;
    }

    public String getKey() {
        return this.key;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetBit_flag() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetConfig_json() {
        return this.config_json != null;
    }

    public boolean isSetKey() {
        return this.key != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public StaticConfig setBit_flag(int bit_flag) {
        this.bit_flag = bit_flag;
        setBit_flagIsSet(true);
        return this;
    }

    public void setBit_flagIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public StaticConfig setConfig_json(String config_json) {
        this.config_json = config_json;
        return this;
    }

    public void setConfig_jsonIsSet(boolean value) {
        if (value) {
            return;
        }
        this.config_json = null;
    }

    public StaticConfig setKey(String key) {
        this.key = key;
        return this;
    }

    public void setKeyIsSet(boolean value) {
        if (value) {
            return;
        }
        this.key = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("StaticConfig(");
        sb2.append("key:");
        String str = this.key;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("bit_flag:");
        sb2.append(this.bit_flag);
        sb2.append(j2.O);
        sb2.append("config_json:");
        String str2 = this.config_json;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetBit_flag() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetConfig_json() {
        this.config_json = null;
    }

    public void unsetKey() {
        this.key = null;
    }

    public void validate() throws TException {
        if (this.key == null) {
            throw new TProtocolException("Required field 'key' was not present! Struct: " + toString());
        }
        if (this.config_json != null) {
            return;
        }
        throw new TProtocolException("Required field 'config_json' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(StaticConfig other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetKey()).compareTo(Boolean.valueOf(other.isSetKey()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetKey() && (compareTo3 = TBaseHelper.compareTo(this.key, other.key)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetBit_flag()).compareTo(Boolean.valueOf(other.isSetBit_flag()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetBit_flag() && (compareTo2 = TBaseHelper.compareTo(this.bit_flag, other.bit_flag)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetConfig_json()).compareTo(Boolean.valueOf(other.isSetConfig_json()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetConfig_json() || (compareTo = TBaseHelper.compareTo(this.config_json, other.config_json)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<StaticConfig, _Fields> deepCopy2() {
        return new StaticConfig(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$StaticConfig$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getKey();
        }
        if (i11 == 2) {
            return Integer.valueOf(getBit_flag());
        }
        if (i11 == 3) {
            return getConfig_json();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$StaticConfig$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetKey();
        }
        if (i11 == 2) {
            return isSetBit_flag();
        }
        if (i11 == 3) {
            return isSetConfig_json();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$StaticConfig$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetKey();
                return;
            } else {
                setKey((String) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetBit_flag();
                return;
            } else {
                setBit_flag(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetConfig_json();
        } else {
            setConfig_json((String) value);
        }
    }

    public StaticConfig(String key, int bit_flag, String config_json) {
        this();
        this.key = key;
        this.bit_flag = bit_flag;
        setBit_flagIsSet(true);
        this.config_json = config_json;
    }

    public boolean equals(StaticConfig that) {
        if (that == null) {
            return false;
        }
        boolean isSetKey = isSetKey();
        boolean isSetKey2 = that.isSetKey();
        if (((isSetKey || isSetKey2) && !(isSetKey && isSetKey2 && this.key.equals(that.key))) || this.bit_flag != that.bit_flag) {
            return false;
        }
        boolean isSetConfig_json = isSetConfig_json();
        boolean isSetConfig_json2 = that.isSetConfig_json();
        if (isSetConfig_json || isSetConfig_json2) {
            return isSetConfig_json && isSetConfig_json2 && this.config_json.equals(that.config_json);
        }
        return true;
    }

    public StaticConfig(StaticConfig other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetKey()) {
            this.key = other.key;
        }
        this.bit_flag = other.bit_flag;
        if (other.isSetConfig_json()) {
            this.config_json = other.config_json;
        }
    }
}
