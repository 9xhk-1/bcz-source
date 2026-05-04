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
public class AwardItem implements TBase<AwardItem, _Fields>, Serializable, Cloneable, Comparable<AwardItem> {
    private static final int __AWARD_COUNT_ISSET_ID = 1;
    private static final int __AWARD_TYPE_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int award_count;
    public int award_type;
    private static final TStruct STRUCT_DESC = new TStruct("AwardItem");
    private static final TField AWARD_TYPE_FIELD_DESC = new TField("award_type", (byte) 8, 1);
    private static final TField AWARD_COUNT_FIELD_DESC = new TField("award_count", (byte) 8, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.AwardItem$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$AwardItem$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$AwardItem$_Fields = iArr;
            try {
                iArr[_Fields.AWARD_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$AwardItem$_Fields[_Fields.AWARD_COUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AwardItemStandardScheme extends StandardScheme<AwardItem> {
        private AwardItemStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, AwardItem struct) throws TException {
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
                        struct.award_count = iprot.readI32();
                        struct.setAward_countIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.award_type = iprot.readI32();
                    struct.setAward_typeIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetAward_type()) {
                throw new TProtocolException("Required field 'award_type' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetAward_count()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'award_count' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, AwardItem struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(AwardItem.STRUCT_DESC);
            oprot.writeFieldBegin(AwardItem.AWARD_TYPE_FIELD_DESC);
            oprot.writeI32(struct.award_type);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(AwardItem.AWARD_COUNT_FIELD_DESC);
            oprot.writeI32(struct.award_count);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AwardItemStandardSchemeFactory implements SchemeFactory {
        private AwardItemStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AwardItemStandardScheme getScheme() {
            return new AwardItemStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AwardItemTupleScheme extends TupleScheme<AwardItem> {
        private AwardItemTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, AwardItem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.award_type = tTupleProtocol.readI32();
            struct.setAward_typeIsSet(true);
            struct.award_count = tTupleProtocol.readI32();
            struct.setAward_countIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, AwardItem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.award_type);
            tTupleProtocol.writeI32(struct.award_count);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AwardItemTupleSchemeFactory implements SchemeFactory {
        private AwardItemTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AwardItemTupleScheme getScheme() {
            return new AwardItemTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        AWARD_TYPE(1, "award_type"),
        AWARD_COUNT(2, "award_count");

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
                return AWARD_TYPE;
            }
            if (fieldId != 2) {
                return null;
            }
            return AWARD_COUNT;
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
        hashMap.put(StandardScheme.class, new AwardItemStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new AwardItemTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.AWARD_TYPE, (_Fields) new FieldMetaData("award_type", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.AWARD_COUNT, (_Fields) new FieldMetaData("award_count", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(AwardItem.class, unmodifiableMap);
    }

    public AwardItem() {
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
        setAward_typeIsSet(false);
        this.award_type = 0;
        setAward_countIsSet(false);
        this.award_count = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof AwardItem)) {
            return equals((AwardItem) that);
        }
        return false;
    }

    public int getAward_count() {
        return this.award_count;
    }

    public int getAward_type() {
        return this.award_type;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAward_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetAward_type() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public AwardItem setAward_count(int award_count) {
        this.award_count = award_count;
        setAward_countIsSet(true);
        return this;
    }

    public void setAward_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public AwardItem setAward_type(int award_type) {
        this.award_type = award_type;
        setAward_typeIsSet(true);
        return this;
    }

    public void setAward_typeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        return "AwardItem(award_type:" + this.award_type + j2.O + "award_count:" + this.award_count + pn.j.f81007d;
    }

    public void unsetAward_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetAward_type() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(AwardItem other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetAward_type()).compareTo(Boolean.valueOf(other.isSetAward_type()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetAward_type() && (compareTo2 = TBaseHelper.compareTo(this.award_type, other.award_type)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetAward_count()).compareTo(Boolean.valueOf(other.isSetAward_count()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetAward_count() || (compareTo = TBaseHelper.compareTo(this.award_count, other.award_count)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<AwardItem, _Fields> deepCopy2() {
        return new AwardItem(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$AwardItem$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getAward_type());
        }
        if (i11 == 2) {
            return Integer.valueOf(getAward_count());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$AwardItem$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetAward_type();
        }
        if (i11 == 2) {
            return isSetAward_count();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$AwardItem$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetAward_type();
                return;
            } else {
                setAward_type(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetAward_count();
        } else {
            setAward_count(((Integer) value).intValue());
        }
    }

    public AwardItem(int award_type, int award_count) {
        this();
        this.award_type = award_type;
        setAward_typeIsSet(true);
        this.award_count = award_count;
        setAward_countIsSet(true);
    }

    public boolean equals(AwardItem that) {
        return that != null && this.award_type == that.award_type && this.award_count == that.award_count;
    }

    public AwardItem(AwardItem other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.award_type = other.award_type;
        this.award_count = other.award_count;
    }

    public void validate() throws TException {
    }
}
