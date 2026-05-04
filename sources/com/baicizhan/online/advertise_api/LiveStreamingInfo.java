package com.baicizhan.online.advertise_api;

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
public class LiveStreamingInfo implements TBase<LiveStreamingInfo, _Fields>, Serializable, Cloneable, Comparable<LiveStreamingInfo> {
    private static final int __CURRENT_TIMESTAMP_ISSET_ID = 0;
    private static final int __END_TIMESTAMP_ISSET_ID = 2;
    private static final int __START_TIMESTAMP_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public long current_timestamp;
    public long end_timestamp;
    private _Fields[] optionals;
    public long start_timestamp;
    private static final TStruct STRUCT_DESC = new TStruct("LiveStreamingInfo");
    private static final TField CURRENT_TIMESTAMP_FIELD_DESC = new TField("current_timestamp", (byte) 10, 1);
    private static final TField START_TIMESTAMP_FIELD_DESC = new TField("start_timestamp", (byte) 10, 2);
    private static final TField END_TIMESTAMP_FIELD_DESC = new TField("end_timestamp", (byte) 10, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.advertise_api.LiveStreamingInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$advertise_api$LiveStreamingInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$advertise_api$LiveStreamingInfo$_Fields = iArr;
            try {
                iArr[_Fields.CURRENT_TIMESTAMP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$LiveStreamingInfo$_Fields[_Fields.START_TIMESTAMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$LiveStreamingInfo$_Fields[_Fields.END_TIMESTAMP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class LiveStreamingInfoStandardScheme extends StandardScheme<LiveStreamingInfo> {
        private LiveStreamingInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, LiveStreamingInfo struct) throws TException {
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
                        } else if (b11 == 10) {
                            struct.end_timestamp = iprot.readI64();
                            struct.setEnd_timestampIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 10) {
                        struct.start_timestamp = iprot.readI64();
                        struct.setStart_timestampIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 10) {
                    struct.current_timestamp = iprot.readI64();
                    struct.setCurrent_timestampIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetCurrent_timestamp()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'current_timestamp' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, LiveStreamingInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(LiveStreamingInfo.STRUCT_DESC);
            oprot.writeFieldBegin(LiveStreamingInfo.CURRENT_TIMESTAMP_FIELD_DESC);
            oprot.writeI64(struct.current_timestamp);
            oprot.writeFieldEnd();
            if (struct.isSetStart_timestamp()) {
                oprot.writeFieldBegin(LiveStreamingInfo.START_TIMESTAMP_FIELD_DESC);
                oprot.writeI64(struct.start_timestamp);
                oprot.writeFieldEnd();
            }
            if (struct.isSetEnd_timestamp()) {
                oprot.writeFieldBegin(LiveStreamingInfo.END_TIMESTAMP_FIELD_DESC);
                oprot.writeI64(struct.end_timestamp);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class LiveStreamingInfoStandardSchemeFactory implements SchemeFactory {
        private LiveStreamingInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public LiveStreamingInfoStandardScheme getScheme() {
            return new LiveStreamingInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class LiveStreamingInfoTupleScheme extends TupleScheme<LiveStreamingInfo> {
        private LiveStreamingInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, LiveStreamingInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.current_timestamp = tTupleProtocol.readI64();
            struct.setCurrent_timestampIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(2);
            if (readBitSet.get(0)) {
                struct.start_timestamp = tTupleProtocol.readI64();
                struct.setStart_timestampIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.end_timestamp = tTupleProtocol.readI64();
                struct.setEnd_timestampIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, LiveStreamingInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI64(struct.current_timestamp);
            BitSet bitSet = new BitSet();
            if (struct.isSetStart_timestamp()) {
                bitSet.set(0);
            }
            if (struct.isSetEnd_timestamp()) {
                bitSet.set(1);
            }
            tTupleProtocol.writeBitSet(bitSet, 2);
            if (struct.isSetStart_timestamp()) {
                tTupleProtocol.writeI64(struct.start_timestamp);
            }
            if (struct.isSetEnd_timestamp()) {
                tTupleProtocol.writeI64(struct.end_timestamp);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class LiveStreamingInfoTupleSchemeFactory implements SchemeFactory {
        private LiveStreamingInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public LiveStreamingInfoTupleScheme getScheme() {
            return new LiveStreamingInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        CURRENT_TIMESTAMP(1, "current_timestamp"),
        START_TIMESTAMP(2, "start_timestamp"),
        END_TIMESTAMP(3, "end_timestamp");

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
                return CURRENT_TIMESTAMP;
            }
            if (fieldId == 2) {
                return START_TIMESTAMP;
            }
            if (fieldId != 3) {
                return null;
            }
            return END_TIMESTAMP;
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
        hashMap.put(StandardScheme.class, new LiveStreamingInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new LiveStreamingInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.CURRENT_TIMESTAMP, (_Fields) new FieldMetaData("current_timestamp", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.START_TIMESTAMP, (_Fields) new FieldMetaData("start_timestamp", (byte) 2, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.END_TIMESTAMP, (_Fields) new FieldMetaData("end_timestamp", (byte) 2, new FieldValueMetaData((byte) 10)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(LiveStreamingInfo.class, unmodifiableMap);
    }

    public LiveStreamingInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.START_TIMESTAMP, _Fields.END_TIMESTAMP};
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
        setCurrent_timestampIsSet(false);
        this.current_timestamp = 0L;
        setStart_timestampIsSet(false);
        this.start_timestamp = 0L;
        setEnd_timestampIsSet(false);
        this.end_timestamp = 0L;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof LiveStreamingInfo)) {
            return equals((LiveStreamingInfo) that);
        }
        return false;
    }

    public long getCurrent_timestamp() {
        return this.current_timestamp;
    }

    public long getEnd_timestamp() {
        return this.end_timestamp;
    }

    public long getStart_timestamp() {
        return this.start_timestamp;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetCurrent_timestamp() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetEnd_timestamp() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetStart_timestamp() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public LiveStreamingInfo setCurrent_timestamp(long current_timestamp) {
        this.current_timestamp = current_timestamp;
        setCurrent_timestampIsSet(true);
        return this;
    }

    public void setCurrent_timestampIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public LiveStreamingInfo setEnd_timestamp(long end_timestamp) {
        this.end_timestamp = end_timestamp;
        setEnd_timestampIsSet(true);
        return this;
    }

    public void setEnd_timestampIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public LiveStreamingInfo setStart_timestamp(long start_timestamp) {
        this.start_timestamp = start_timestamp;
        setStart_timestampIsSet(true);
        return this;
    }

    public void setStart_timestampIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LiveStreamingInfo(");
        sb2.append("current_timestamp:");
        sb2.append(this.current_timestamp);
        if (isSetStart_timestamp()) {
            sb2.append(j2.O);
            sb2.append("start_timestamp:");
            sb2.append(this.start_timestamp);
        }
        if (isSetEnd_timestamp()) {
            sb2.append(j2.O);
            sb2.append("end_timestamp:");
            sb2.append(this.end_timestamp);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetCurrent_timestamp() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetEnd_timestamp() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetStart_timestamp() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(LiveStreamingInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetCurrent_timestamp()).compareTo(Boolean.valueOf(other.isSetCurrent_timestamp()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetCurrent_timestamp() && (compareTo3 = TBaseHelper.compareTo(this.current_timestamp, other.current_timestamp)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetStart_timestamp()).compareTo(Boolean.valueOf(other.isSetStart_timestamp()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetStart_timestamp() && (compareTo2 = TBaseHelper.compareTo(this.start_timestamp, other.start_timestamp)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetEnd_timestamp()).compareTo(Boolean.valueOf(other.isSetEnd_timestamp()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetEnd_timestamp() || (compareTo = TBaseHelper.compareTo(this.end_timestamp, other.end_timestamp)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<LiveStreamingInfo, _Fields> deepCopy2() {
        return new LiveStreamingInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$LiveStreamingInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Long.valueOf(getCurrent_timestamp());
        }
        if (i11 == 2) {
            return Long.valueOf(getStart_timestamp());
        }
        if (i11 == 3) {
            return Long.valueOf(getEnd_timestamp());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$LiveStreamingInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetCurrent_timestamp();
        }
        if (i11 == 2) {
            return isSetStart_timestamp();
        }
        if (i11 == 3) {
            return isSetEnd_timestamp();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$LiveStreamingInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetCurrent_timestamp();
                return;
            } else {
                setCurrent_timestamp(((Long) value).longValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetStart_timestamp();
                return;
            } else {
                setStart_timestamp(((Long) value).longValue());
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetEnd_timestamp();
        } else {
            setEnd_timestamp(((Long) value).longValue());
        }
    }

    public boolean equals(LiveStreamingInfo that) {
        if (that == null || this.current_timestamp != that.current_timestamp) {
            return false;
        }
        boolean isSetStart_timestamp = isSetStart_timestamp();
        boolean isSetStart_timestamp2 = that.isSetStart_timestamp();
        if ((isSetStart_timestamp || isSetStart_timestamp2) && !(isSetStart_timestamp && isSetStart_timestamp2 && this.start_timestamp == that.start_timestamp)) {
            return false;
        }
        boolean isSetEnd_timestamp = isSetEnd_timestamp();
        boolean isSetEnd_timestamp2 = that.isSetEnd_timestamp();
        if (isSetEnd_timestamp || isSetEnd_timestamp2) {
            return isSetEnd_timestamp && isSetEnd_timestamp2 && this.end_timestamp == that.end_timestamp;
        }
        return true;
    }

    public LiveStreamingInfo(long current_timestamp) {
        this();
        this.current_timestamp = current_timestamp;
        setCurrent_timestampIsSet(true);
    }

    public LiveStreamingInfo(LiveStreamingInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.START_TIMESTAMP, _Fields.END_TIMESTAMP};
        this.__isset_bitfield = other.__isset_bitfield;
        this.current_timestamp = other.current_timestamp;
        this.start_timestamp = other.start_timestamp;
        this.end_timestamp = other.end_timestamp;
    }

    public void validate() throws TException {
    }
}
