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
public class EnergyCycle implements TBase<EnergyCycle, _Fields>, Serializable, Cloneable, Comparable<EnergyCycle> {
    private static final int __CYCLE_COUNT_ISSET_ID = 1;
    private static final int __CYCLE_TIME_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int cycle_count;
    public long cycle_time;
    private static final TStruct STRUCT_DESC = new TStruct("EnergyCycle");
    private static final TField CYCLE_TIME_FIELD_DESC = new TField("cycle_time", (byte) 10, 1);
    private static final TField CYCLE_COUNT_FIELD_DESC = new TField("cycle_count", (byte) 8, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.EnergyCycle$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$EnergyCycle$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$EnergyCycle$_Fields = iArr;
            try {
                iArr[_Fields.CYCLE_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$EnergyCycle$_Fields[_Fields.CYCLE_COUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class EnergyCycleStandardScheme extends StandardScheme<EnergyCycle> {
        private EnergyCycleStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, EnergyCycle struct) throws TException {
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
                        struct.cycle_count = iprot.readI32();
                        struct.setCycle_countIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 10) {
                    struct.cycle_time = iprot.readI64();
                    struct.setCycle_timeIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetCycle_time()) {
                throw new TProtocolException("Required field 'cycle_time' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetCycle_count()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'cycle_count' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, EnergyCycle struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(EnergyCycle.STRUCT_DESC);
            oprot.writeFieldBegin(EnergyCycle.CYCLE_TIME_FIELD_DESC);
            oprot.writeI64(struct.cycle_time);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(EnergyCycle.CYCLE_COUNT_FIELD_DESC);
            oprot.writeI32(struct.cycle_count);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class EnergyCycleStandardSchemeFactory implements SchemeFactory {
        private EnergyCycleStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public EnergyCycleStandardScheme getScheme() {
            return new EnergyCycleStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class EnergyCycleTupleScheme extends TupleScheme<EnergyCycle> {
        private EnergyCycleTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, EnergyCycle struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.cycle_time = tTupleProtocol.readI64();
            struct.setCycle_timeIsSet(true);
            struct.cycle_count = tTupleProtocol.readI32();
            struct.setCycle_countIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, EnergyCycle struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI64(struct.cycle_time);
            tTupleProtocol.writeI32(struct.cycle_count);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class EnergyCycleTupleSchemeFactory implements SchemeFactory {
        private EnergyCycleTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public EnergyCycleTupleScheme getScheme() {
            return new EnergyCycleTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        CYCLE_TIME(1, "cycle_time"),
        CYCLE_COUNT(2, "cycle_count");

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
                return CYCLE_TIME;
            }
            if (fieldId != 2) {
                return null;
            }
            return CYCLE_COUNT;
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
        hashMap.put(StandardScheme.class, new EnergyCycleStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new EnergyCycleTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.CYCLE_TIME, (_Fields) new FieldMetaData("cycle_time", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.CYCLE_COUNT, (_Fields) new FieldMetaData("cycle_count", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(EnergyCycle.class, unmodifiableMap);
    }

    public EnergyCycle() {
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
        setCycle_timeIsSet(false);
        this.cycle_time = 0L;
        setCycle_countIsSet(false);
        this.cycle_count = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof EnergyCycle)) {
            return equals((EnergyCycle) that);
        }
        return false;
    }

    public int getCycle_count() {
        return this.cycle_count;
    }

    public long getCycle_time() {
        return this.cycle_time;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetCycle_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetCycle_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public EnergyCycle setCycle_count(int cycle_count) {
        this.cycle_count = cycle_count;
        setCycle_countIsSet(true);
        return this;
    }

    public void setCycle_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public EnergyCycle setCycle_time(long cycle_time) {
        this.cycle_time = cycle_time;
        setCycle_timeIsSet(true);
        return this;
    }

    public void setCycle_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        return "EnergyCycle(cycle_time:" + this.cycle_time + j2.O + "cycle_count:" + this.cycle_count + pn.j.f81007d;
    }

    public void unsetCycle_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetCycle_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(EnergyCycle other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetCycle_time()).compareTo(Boolean.valueOf(other.isSetCycle_time()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetCycle_time() && (compareTo2 = TBaseHelper.compareTo(this.cycle_time, other.cycle_time)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetCycle_count()).compareTo(Boolean.valueOf(other.isSetCycle_count()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetCycle_count() || (compareTo = TBaseHelper.compareTo(this.cycle_count, other.cycle_count)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<EnergyCycle, _Fields> deepCopy2() {
        return new EnergyCycle(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$EnergyCycle$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Long.valueOf(getCycle_time());
        }
        if (i11 == 2) {
            return Integer.valueOf(getCycle_count());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$EnergyCycle$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetCycle_time();
        }
        if (i11 == 2) {
            return isSetCycle_count();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$EnergyCycle$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetCycle_time();
                return;
            } else {
                setCycle_time(((Long) value).longValue());
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetCycle_count();
        } else {
            setCycle_count(((Integer) value).intValue());
        }
    }

    public EnergyCycle(long cycle_time, int cycle_count) {
        this();
        this.cycle_time = cycle_time;
        setCycle_timeIsSet(true);
        this.cycle_count = cycle_count;
        setCycle_countIsSet(true);
    }

    public boolean equals(EnergyCycle that) {
        return that != null && this.cycle_time == that.cycle_time && this.cycle_count == that.cycle_count;
    }

    public EnergyCycle(EnergyCycle other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.cycle_time = other.cycle_time;
        this.cycle_count = other.cycle_count;
    }

    public void validate() throws TException {
    }
}
