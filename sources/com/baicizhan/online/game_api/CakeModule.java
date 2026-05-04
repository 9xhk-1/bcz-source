package com.baicizhan.online.game_api;

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
public class CakeModule implements TBase<CakeModule, _Fields>, Serializable, Cloneable, Comparable<CakeModule> {
    private static final int __TOPICSIZE_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String name;
    private _Fields[] optionals;
    public int topicSize;
    private static final TStruct STRUCT_DESC = new TStruct("CakeModule");
    private static final TField TOPIC_SIZE_FIELD_DESC = new TField("topicSize", (byte) 8, 1);
    private static final TField NAME_FIELD_DESC = new TField("name", (byte) 11, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.CakeModule$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$CakeModule$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$CakeModule$_Fields = iArr;
            try {
                iArr[_Fields.TOPIC_SIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$CakeModule$_Fields[_Fields.NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CakeModuleStandardScheme extends StandardScheme<CakeModule> {
        private CakeModuleStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, CakeModule struct) throws TException {
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
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 11) {
                        struct.name = iprot.readString();
                        struct.setNameIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.topicSize = iprot.readI32();
                    struct.setTopicSizeIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetTopicSize()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'topicSize' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, CakeModule struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(CakeModule.STRUCT_DESC);
            oprot.writeFieldBegin(CakeModule.TOPIC_SIZE_FIELD_DESC);
            oprot.writeI32(struct.topicSize);
            oprot.writeFieldEnd();
            if (struct.name != null && struct.isSetName()) {
                oprot.writeFieldBegin(CakeModule.NAME_FIELD_DESC);
                oprot.writeString(struct.name);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CakeModuleStandardSchemeFactory implements SchemeFactory {
        private CakeModuleStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public CakeModuleStandardScheme getScheme() {
            return new CakeModuleStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CakeModuleTupleScheme extends TupleScheme<CakeModule> {
        private CakeModuleTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, CakeModule struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.topicSize = tTupleProtocol.readI32();
            struct.setTopicSizeIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                struct.name = tTupleProtocol.readString();
                struct.setNameIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, CakeModule struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.topicSize);
            BitSet bitSet = new BitSet();
            if (struct.isSetName()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetName()) {
                tTupleProtocol.writeString(struct.name);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CakeModuleTupleSchemeFactory implements SchemeFactory {
        private CakeModuleTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public CakeModuleTupleScheme getScheme() {
            return new CakeModuleTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TOPIC_SIZE(1, "topicSize"),
        NAME(2, "name");

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
                return TOPIC_SIZE;
            }
            if (fieldId != 2) {
                return null;
            }
            return NAME;
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
        hashMap.put(StandardScheme.class, new CakeModuleStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new CakeModuleTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TOPIC_SIZE, (_Fields) new FieldMetaData("topicSize", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.NAME, (_Fields) new FieldMetaData("name", (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(CakeModule.class, unmodifiableMap);
    }

    public CakeModule() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.NAME};
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
        setTopicSizeIsSet(false);
        this.topicSize = 0;
        this.name = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof CakeModule)) {
            return equals((CakeModule) that);
        }
        return false;
    }

    public String getName() {
        return this.name;
    }

    public int getTopicSize() {
        return this.topicSize;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetName() {
        return this.name != null;
    }

    public boolean isSetTopicSize() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public CakeModule setName(String name) {
        this.name = name;
        return this;
    }

    public void setNameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.name = null;
    }

    public CakeModule setTopicSize(int topicSize) {
        this.topicSize = topicSize;
        setTopicSizeIsSet(true);
        return this;
    }

    public void setTopicSizeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CakeModule(");
        sb2.append("topicSize:");
        sb2.append(this.topicSize);
        if (isSetName()) {
            sb2.append(j2.O);
            sb2.append("name:");
            String str = this.name;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetName() {
        this.name = null;
    }

    public void unsetTopicSize() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(CakeModule other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetTopicSize()).compareTo(Boolean.valueOf(other.isSetTopicSize()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetTopicSize() && (compareTo2 = TBaseHelper.compareTo(this.topicSize, other.topicSize)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetName()).compareTo(Boolean.valueOf(other.isSetName()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetName() || (compareTo = TBaseHelper.compareTo(this.name, other.name)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<CakeModule, _Fields> deepCopy2() {
        return new CakeModule(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$CakeModule$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getTopicSize());
        }
        if (i11 == 2) {
            return getName();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$CakeModule$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetTopicSize();
        }
        if (i11 == 2) {
            return isSetName();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$CakeModule$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetTopicSize();
                return;
            } else {
                setTopicSize(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetName();
        } else {
            setName((String) value);
        }
    }

    public boolean equals(CakeModule that) {
        if (that == null || this.topicSize != that.topicSize) {
            return false;
        }
        boolean isSetName = isSetName();
        boolean isSetName2 = that.isSetName();
        if (isSetName || isSetName2) {
            return isSetName && isSetName2 && this.name.equals(that.name);
        }
        return true;
    }

    public CakeModule(int topicSize) {
        this();
        this.topicSize = topicSize;
        setTopicSizeIsSet(true);
    }

    public CakeModule(CakeModule other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.NAME};
        this.__isset_bitfield = other.__isset_bitfield;
        this.topicSize = other.topicSize;
        if (other.isSetName()) {
            this.name = other.name;
        }
    }

    public void validate() throws TException {
    }
}
