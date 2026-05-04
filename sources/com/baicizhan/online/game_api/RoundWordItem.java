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
public class RoundWordItem implements TBase<RoundWordItem, _Fields>, Serializable, Cloneable, Comparable<RoundWordItem> {
    private static final int __HALF_DAY_ISSET_ID = 1;
    private static final int __HALF_DAY_UPDATED_ISSET_ID = 2;
    private static final int __TOPIC_ID_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int half_day;
    public int half_day_updated;
    public int topic_id;
    private static final TStruct STRUCT_DESC = new TStruct("RoundWordItem");
    private static final TField TOPIC_ID_FIELD_DESC = new TField("topic_id", (byte) 8, 1);
    private static final TField HALF_DAY_FIELD_DESC = new TField("half_day", (byte) 8, 2);
    private static final TField HALF_DAY_UPDATED_FIELD_DESC = new TField("half_day_updated", (byte) 8, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.RoundWordItem$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$RoundWordItem$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$RoundWordItem$_Fields = iArr;
            try {
                iArr[_Fields.TOPIC_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$RoundWordItem$_Fields[_Fields.HALF_DAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$RoundWordItem$_Fields[_Fields.HALF_DAY_UPDATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RoundWordItemStandardScheme extends StandardScheme<RoundWordItem> {
        private RoundWordItemStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, RoundWordItem struct) throws TException {
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
                        } else if (b11 == 8) {
                            struct.half_day_updated = iprot.readI32();
                            struct.setHalf_day_updatedIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.half_day = iprot.readI32();
                        struct.setHalf_dayIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.topic_id = iprot.readI32();
                    struct.setTopic_idIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetTopic_id()) {
                throw new TProtocolException("Required field 'topic_id' was not found in serialized data! Struct: " + toString());
            }
            if (!struct.isSetHalf_day()) {
                throw new TProtocolException("Required field 'half_day' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetHalf_day_updated()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'half_day_updated' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, RoundWordItem struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(RoundWordItem.STRUCT_DESC);
            oprot.writeFieldBegin(RoundWordItem.TOPIC_ID_FIELD_DESC);
            oprot.writeI32(struct.topic_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(RoundWordItem.HALF_DAY_FIELD_DESC);
            oprot.writeI32(struct.half_day);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(RoundWordItem.HALF_DAY_UPDATED_FIELD_DESC);
            oprot.writeI32(struct.half_day_updated);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RoundWordItemStandardSchemeFactory implements SchemeFactory {
        private RoundWordItemStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public RoundWordItemStandardScheme getScheme() {
            return new RoundWordItemStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RoundWordItemTupleScheme extends TupleScheme<RoundWordItem> {
        private RoundWordItemTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, RoundWordItem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.topic_id = tTupleProtocol.readI32();
            struct.setTopic_idIsSet(true);
            struct.half_day = tTupleProtocol.readI32();
            struct.setHalf_dayIsSet(true);
            struct.half_day_updated = tTupleProtocol.readI32();
            struct.setHalf_day_updatedIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, RoundWordItem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.topic_id);
            tTupleProtocol.writeI32(struct.half_day);
            tTupleProtocol.writeI32(struct.half_day_updated);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RoundWordItemTupleSchemeFactory implements SchemeFactory {
        private RoundWordItemTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public RoundWordItemTupleScheme getScheme() {
            return new RoundWordItemTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TOPIC_ID(1, "topic_id"),
        HALF_DAY(2, "half_day"),
        HALF_DAY_UPDATED(3, "half_day_updated");

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
                return TOPIC_ID;
            }
            if (fieldId == 2) {
                return HALF_DAY;
            }
            if (fieldId != 3) {
                return null;
            }
            return HALF_DAY_UPDATED;
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
        hashMap.put(StandardScheme.class, new RoundWordItemStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new RoundWordItemTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TOPIC_ID, (_Fields) new FieldMetaData("topic_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.HALF_DAY, (_Fields) new FieldMetaData("half_day", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.HALF_DAY_UPDATED, (_Fields) new FieldMetaData("half_day_updated", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(RoundWordItem.class, unmodifiableMap);
    }

    public RoundWordItem() {
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
        setTopic_idIsSet(false);
        this.topic_id = 0;
        setHalf_dayIsSet(false);
        this.half_day = 0;
        setHalf_day_updatedIsSet(false);
        this.half_day_updated = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof RoundWordItem)) {
            return equals((RoundWordItem) that);
        }
        return false;
    }

    public int getHalf_day() {
        return this.half_day;
    }

    public int getHalf_day_updated() {
        return this.half_day_updated;
    }

    public int getTopic_id() {
        return this.topic_id;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetHalf_day() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetHalf_day_updated() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetTopic_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public RoundWordItem setHalf_day(int half_day) {
        this.half_day = half_day;
        setHalf_dayIsSet(true);
        return this;
    }

    public void setHalf_dayIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public RoundWordItem setHalf_day_updated(int half_day_updated) {
        this.half_day_updated = half_day_updated;
        setHalf_day_updatedIsSet(true);
        return this;
    }

    public void setHalf_day_updatedIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public RoundWordItem setTopic_id(int topic_id) {
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        return this;
    }

    public void setTopic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        return "RoundWordItem(topic_id:" + this.topic_id + j2.O + "half_day:" + this.half_day + j2.O + "half_day_updated:" + this.half_day_updated + pn.j.f81007d;
    }

    public void unsetHalf_day() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetHalf_day_updated() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetTopic_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(RoundWordItem other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetTopic_id()).compareTo(Boolean.valueOf(other.isSetTopic_id()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetTopic_id() && (compareTo3 = TBaseHelper.compareTo(this.topic_id, other.topic_id)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetHalf_day()).compareTo(Boolean.valueOf(other.isSetHalf_day()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetHalf_day() && (compareTo2 = TBaseHelper.compareTo(this.half_day, other.half_day)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetHalf_day_updated()).compareTo(Boolean.valueOf(other.isSetHalf_day_updated()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetHalf_day_updated() || (compareTo = TBaseHelper.compareTo(this.half_day_updated, other.half_day_updated)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<RoundWordItem, _Fields> deepCopy2() {
        return new RoundWordItem(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$RoundWordItem$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getTopic_id());
        }
        if (i11 == 2) {
            return Integer.valueOf(getHalf_day());
        }
        if (i11 == 3) {
            return Integer.valueOf(getHalf_day_updated());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$RoundWordItem$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetTopic_id();
        }
        if (i11 == 2) {
            return isSetHalf_day();
        }
        if (i11 == 3) {
            return isSetHalf_day_updated();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$RoundWordItem$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetTopic_id();
                return;
            } else {
                setTopic_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetHalf_day();
                return;
            } else {
                setHalf_day(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetHalf_day_updated();
        } else {
            setHalf_day_updated(((Integer) value).intValue());
        }
    }

    public RoundWordItem(int topic_id, int half_day, int half_day_updated) {
        this();
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        this.half_day = half_day;
        setHalf_dayIsSet(true);
        this.half_day_updated = half_day_updated;
        setHalf_day_updatedIsSet(true);
    }

    public boolean equals(RoundWordItem that) {
        return that != null && this.topic_id == that.topic_id && this.half_day == that.half_day && this.half_day_updated == that.half_day_updated;
    }

    public RoundWordItem(RoundWordItem other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.topic_id = other.topic_id;
        this.half_day = other.half_day;
        this.half_day_updated = other.half_day_updated;
    }

    public void validate() throws TException {
    }
}
