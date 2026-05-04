package com.baicizhan.online.course_api;

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
public class HeartBeat implements TBase<HeartBeat, _Fields>, Serializable, Cloneable, Comparable<HeartBeat> {
    private static final int __IS_END_ISSET_ID = 2;
    private static final int __LIVE_PROCESS_ISSET_ID = 1;
    private static final int __NOW_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int is_end;
    public long live_process;
    public long now;
    private static final TStruct STRUCT_DESC = new TStruct("HeartBeat");
    private static final TField NOW_FIELD_DESC = new TField("now", (byte) 10, 1);
    private static final TField LIVE_PROCESS_FIELD_DESC = new TField("live_process", (byte) 10, 2);
    private static final TField IS_END_FIELD_DESC = new TField("is_end", (byte) 8, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.course_api.HeartBeat$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$course_api$HeartBeat$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$course_api$HeartBeat$_Fields = iArr;
            try {
                iArr[_Fields.NOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$HeartBeat$_Fields[_Fields.LIVE_PROCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$HeartBeat$_Fields[_Fields.IS_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class HeartBeatStandardScheme extends StandardScheme<HeartBeat> {
        private HeartBeatStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, HeartBeat struct) throws TException {
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
                            struct.is_end = iprot.readI32();
                            struct.setIs_endIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 10) {
                        struct.live_process = iprot.readI64();
                        struct.setLive_processIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 10) {
                    struct.now = iprot.readI64();
                    struct.setNowIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetNow()) {
                throw new TProtocolException("Required field 'now' was not found in serialized data! Struct: " + toString());
            }
            if (!struct.isSetLive_process()) {
                throw new TProtocolException("Required field 'live_process' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetIs_end()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'is_end' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, HeartBeat struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(HeartBeat.STRUCT_DESC);
            oprot.writeFieldBegin(HeartBeat.NOW_FIELD_DESC);
            oprot.writeI64(struct.now);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(HeartBeat.LIVE_PROCESS_FIELD_DESC);
            oprot.writeI64(struct.live_process);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(HeartBeat.IS_END_FIELD_DESC);
            oprot.writeI32(struct.is_end);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class HeartBeatStandardSchemeFactory implements SchemeFactory {
        private HeartBeatStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public HeartBeatStandardScheme getScheme() {
            return new HeartBeatStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class HeartBeatTupleScheme extends TupleScheme<HeartBeat> {
        private HeartBeatTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, HeartBeat struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.now = tTupleProtocol.readI64();
            struct.setNowIsSet(true);
            struct.live_process = tTupleProtocol.readI64();
            struct.setLive_processIsSet(true);
            struct.is_end = tTupleProtocol.readI32();
            struct.setIs_endIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, HeartBeat struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI64(struct.now);
            tTupleProtocol.writeI64(struct.live_process);
            tTupleProtocol.writeI32(struct.is_end);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class HeartBeatTupleSchemeFactory implements SchemeFactory {
        private HeartBeatTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public HeartBeatTupleScheme getScheme() {
            return new HeartBeatTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        NOW(1, "now"),
        LIVE_PROCESS(2, "live_process"),
        IS_END(3, "is_end");

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
                return NOW;
            }
            if (fieldId == 2) {
                return LIVE_PROCESS;
            }
            if (fieldId != 3) {
                return null;
            }
            return IS_END;
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
        hashMap.put(StandardScheme.class, new HeartBeatStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new HeartBeatTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.NOW, (_Fields) new FieldMetaData("now", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.LIVE_PROCESS, (_Fields) new FieldMetaData("live_process", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.IS_END, (_Fields) new FieldMetaData("is_end", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(HeartBeat.class, unmodifiableMap);
    }

    public HeartBeat() {
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
        setNowIsSet(false);
        this.now = 0L;
        setLive_processIsSet(false);
        this.live_process = 0L;
        setIs_endIsSet(false);
        this.is_end = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof HeartBeat)) {
            return equals((HeartBeat) that);
        }
        return false;
    }

    public int getIs_end() {
        return this.is_end;
    }

    public long getLive_process() {
        return this.live_process;
    }

    public long getNow() {
        return this.now;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetIs_end() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetLive_process() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetNow() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public HeartBeat setIs_end(int is_end) {
        this.is_end = is_end;
        setIs_endIsSet(true);
        return this;
    }

    public void setIs_endIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public HeartBeat setLive_process(long live_process) {
        this.live_process = live_process;
        setLive_processIsSet(true);
        return this;
    }

    public void setLive_processIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public HeartBeat setNow(long now) {
        this.now = now;
        setNowIsSet(true);
        return this;
    }

    public void setNowIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        return "HeartBeat(now:" + this.now + j2.O + "live_process:" + this.live_process + j2.O + "is_end:" + this.is_end + pn.j.f81007d;
    }

    public void unsetIs_end() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetLive_process() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetNow() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(HeartBeat other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetNow()).compareTo(Boolean.valueOf(other.isSetNow()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetNow() && (compareTo3 = TBaseHelper.compareTo(this.now, other.now)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetLive_process()).compareTo(Boolean.valueOf(other.isSetLive_process()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetLive_process() && (compareTo2 = TBaseHelper.compareTo(this.live_process, other.live_process)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetIs_end()).compareTo(Boolean.valueOf(other.isSetIs_end()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetIs_end() || (compareTo = TBaseHelper.compareTo(this.is_end, other.is_end)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<HeartBeat, _Fields> deepCopy2() {
        return new HeartBeat(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$HeartBeat$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Long.valueOf(getNow());
        }
        if (i11 == 2) {
            return Long.valueOf(getLive_process());
        }
        if (i11 == 3) {
            return Integer.valueOf(getIs_end());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$HeartBeat$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetNow();
        }
        if (i11 == 2) {
            return isSetLive_process();
        }
        if (i11 == 3) {
            return isSetIs_end();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$HeartBeat$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetNow();
                return;
            } else {
                setNow(((Long) value).longValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetLive_process();
                return;
            } else {
                setLive_process(((Long) value).longValue());
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetIs_end();
        } else {
            setIs_end(((Integer) value).intValue());
        }
    }

    public HeartBeat(long now, long live_process, int is_end) {
        this();
        this.now = now;
        setNowIsSet(true);
        this.live_process = live_process;
        setLive_processIsSet(true);
        this.is_end = is_end;
        setIs_endIsSet(true);
    }

    public boolean equals(HeartBeat that) {
        return that != null && this.now == that.now && this.live_process == that.live_process && this.is_end == that.is_end;
    }

    public HeartBeat(HeartBeat other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.now = other.now;
        this.live_process = other.live_process;
        this.is_end = other.is_end;
    }

    public void validate() throws TException {
    }
}
