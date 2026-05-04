package com.baicizhan.online.game_api;

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
public class PropsItem implements TBase<PropsItem, _Fields>, Serializable, Cloneable, Comparable<PropsItem> {
    private static final int __COUNT_ISSET_ID = 1;
    private static final int __PROPS_TYPE_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int count;
    public int props_type;
    private static final TStruct STRUCT_DESC = new TStruct("PropsItem");
    private static final TField PROPS_TYPE_FIELD_DESC = new TField("props_type", (byte) 8, 1);
    private static final TField COUNT_FIELD_DESC = new TField("count", (byte) 8, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.PropsItem$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$PropsItem$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$PropsItem$_Fields = iArr;
            try {
                iArr[_Fields.PROPS_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$PropsItem$_Fields[_Fields.COUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PropsItemStandardScheme extends StandardScheme<PropsItem> {
        private PropsItemStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, PropsItem struct) throws TException {
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
                    } else if (b11 == 8) {
                        struct.count = iprot.readI32();
                        struct.setCountIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.props_type = iprot.readI32();
                    struct.setProps_typeIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetProps_type()) {
                throw new TProtocolException("Required field 'props_type' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetCount()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'count' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, PropsItem struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(PropsItem.STRUCT_DESC);
            oprot.writeFieldBegin(PropsItem.PROPS_TYPE_FIELD_DESC);
            oprot.writeI32(struct.props_type);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(PropsItem.COUNT_FIELD_DESC);
            oprot.writeI32(struct.count);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PropsItemStandardSchemeFactory implements SchemeFactory {
        private PropsItemStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public PropsItemStandardScheme getScheme() {
            return new PropsItemStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PropsItemTupleScheme extends TupleScheme<PropsItem> {
        private PropsItemTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, PropsItem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.props_type = tTupleProtocol.readI32();
            struct.setProps_typeIsSet(true);
            struct.count = tTupleProtocol.readI32();
            struct.setCountIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, PropsItem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.props_type);
            tTupleProtocol.writeI32(struct.count);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PropsItemTupleSchemeFactory implements SchemeFactory {
        private PropsItemTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public PropsItemTupleScheme getScheme() {
            return new PropsItemTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        PROPS_TYPE(1, "props_type"),
        COUNT(2, "count");

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
                return PROPS_TYPE;
            }
            if (fieldId != 2) {
                return null;
            }
            return COUNT;
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
        hashMap.put(StandardScheme.class, new PropsItemStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new PropsItemTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.PROPS_TYPE, (_Fields) new FieldMetaData("props_type", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.COUNT, (_Fields) new FieldMetaData("count", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(PropsItem.class, unmodifiableMap);
    }

    public PropsItem() {
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
        setProps_typeIsSet(false);
        this.props_type = 0;
        setCountIsSet(false);
        this.count = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof PropsItem)) {
            return equals((PropsItem) that);
        }
        return false;
    }

    public int getCount() {
        return this.count;
    }

    public int getProps_type() {
        return this.props_type;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetCount() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetProps_type() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public PropsItem setCount(int count) {
        this.count = count;
        setCountIsSet(true);
        return this;
    }

    public void setCountIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public PropsItem setProps_type(int props_type) {
        this.props_type = props_type;
        setProps_typeIsSet(true);
        return this;
    }

    public void setProps_typeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        return "PropsItem(props_type:" + this.props_type + j2.O + "count:" + this.count + pn.j.f81007d;
    }

    public void unsetCount() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetProps_type() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(PropsItem other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetProps_type()).compareTo(Boolean.valueOf(other.isSetProps_type()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetProps_type() && (compareTo2 = TBaseHelper.compareTo(this.props_type, other.props_type)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetCount()).compareTo(Boolean.valueOf(other.isSetCount()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetCount() || (compareTo = TBaseHelper.compareTo(this.count, other.count)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<PropsItem, _Fields> deepCopy2() {
        return new PropsItem(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$PropsItem$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getProps_type());
        }
        if (i11 == 2) {
            return Integer.valueOf(getCount());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$PropsItem$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetProps_type();
        }
        if (i11 == 2) {
            return isSetCount();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$PropsItem$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetProps_type();
                return;
            } else {
                setProps_type(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetCount();
        } else {
            setCount(((Integer) value).intValue());
        }
    }

    public PropsItem(int props_type, int count) {
        this();
        this.props_type = props_type;
        setProps_typeIsSet(true);
        this.count = count;
        setCountIsSet(true);
    }

    public boolean equals(PropsItem that) {
        return that != null && this.props_type == that.props_type && this.count == that.count;
    }

    public PropsItem(PropsItem other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.props_type = other.props_type;
        this.count = other.count;
    }

    public void validate() throws TException {
    }
}
