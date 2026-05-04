package com.baicizhan.online.hero_api;

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
import org.apache.thrift.meta_data.EnumMetaData;
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
public class SystemInfo implements TBase<SystemInfo, _Fields>, Serializable, Cloneable, Comparable<SystemInfo> {
    private static final int __BEGIN_TIME_ISSET_ID = 3;
    private static final int __END_TIME_ISSET_ID = 4;
    private static final int __LATE_TIME_ISSET_ID = 5;
    private static final int __NEXT_REQ_TIME_ISSET_ID = 1;
    private static final int __SYS_TIME_ISSET_ID = 0;
    private static final int __TOTAL_ONLINE_ISSET_ID = 2;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public long begin_time;
    public long end_time;
    public long late_time;
    public long next_req_time;
    public SysStatus status;
    public long sys_time;
    public int total_online;
    private static final TStruct STRUCT_DESC = new TStruct("SystemInfo");
    private static final TField STATUS_FIELD_DESC = new TField("status", (byte) 8, 1);
    private static final TField SYS_TIME_FIELD_DESC = new TField("sys_time", (byte) 10, 2);
    private static final TField NEXT_REQ_TIME_FIELD_DESC = new TField("next_req_time", (byte) 10, 3);
    private static final TField TOTAL_ONLINE_FIELD_DESC = new TField("total_online", (byte) 8, 4);
    private static final TField BEGIN_TIME_FIELD_DESC = new TField("begin_time", (byte) 10, 5);
    private static final TField END_TIME_FIELD_DESC = new TField("end_time", (byte) 10, 6);
    private static final TField LATE_TIME_FIELD_DESC = new TField("late_time", (byte) 10, 7);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.hero_api.SystemInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$hero_api$SystemInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$hero_api$SystemInfo$_Fields = iArr;
            try {
                iArr[_Fields.STATUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$hero_api$SystemInfo$_Fields[_Fields.SYS_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$hero_api$SystemInfo$_Fields[_Fields.NEXT_REQ_TIME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$hero_api$SystemInfo$_Fields[_Fields.TOTAL_ONLINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$hero_api$SystemInfo$_Fields[_Fields.BEGIN_TIME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$hero_api$SystemInfo$_Fields[_Fields.END_TIME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$hero_api$SystemInfo$_Fields[_Fields.LATE_TIME.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SystemInfoStandardScheme extends StandardScheme<SystemInfo> {
        private SystemInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, SystemInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetSys_time()) {
                        throw new TProtocolException("Required field 'sys_time' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetNext_req_time()) {
                        throw new TProtocolException("Required field 'next_req_time' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetTotal_online()) {
                        throw new TProtocolException("Required field 'total_online' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetBegin_time()) {
                        throw new TProtocolException("Required field 'begin_time' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetEnd_time()) {
                        throw new TProtocolException("Required field 'end_time' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetLate_time()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'late_time' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.status = SysStatus.findByValue(iprot.readI32());
                            struct.setStatusIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.sys_time = iprot.readI64();
                            struct.setSys_timeIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.next_req_time = iprot.readI64();
                            struct.setNext_req_timeIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.total_online = iprot.readI32();
                            struct.setTotal_onlineIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.begin_time = iprot.readI64();
                            struct.setBegin_timeIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.end_time = iprot.readI64();
                            struct.setEnd_timeIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.late_time = iprot.readI64();
                            struct.setLate_timeIsSet(true);
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
        public void write(TProtocol oprot, SystemInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(SystemInfo.STRUCT_DESC);
            if (struct.status != null) {
                oprot.writeFieldBegin(SystemInfo.STATUS_FIELD_DESC);
                oprot.writeI32(struct.status.getValue());
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(SystemInfo.SYS_TIME_FIELD_DESC);
            oprot.writeI64(struct.sys_time);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(SystemInfo.NEXT_REQ_TIME_FIELD_DESC);
            oprot.writeI64(struct.next_req_time);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(SystemInfo.TOTAL_ONLINE_FIELD_DESC);
            oprot.writeI32(struct.total_online);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(SystemInfo.BEGIN_TIME_FIELD_DESC);
            oprot.writeI64(struct.begin_time);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(SystemInfo.END_TIME_FIELD_DESC);
            oprot.writeI64(struct.end_time);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(SystemInfo.LATE_TIME_FIELD_DESC);
            oprot.writeI64(struct.late_time);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SystemInfoStandardSchemeFactory implements SchemeFactory {
        private SystemInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SystemInfoStandardScheme getScheme() {
            return new SystemInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SystemInfoTupleScheme extends TupleScheme<SystemInfo> {
        private SystemInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, SystemInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.status = SysStatus.findByValue(tTupleProtocol.readI32());
            struct.setStatusIsSet(true);
            struct.sys_time = tTupleProtocol.readI64();
            struct.setSys_timeIsSet(true);
            struct.next_req_time = tTupleProtocol.readI64();
            struct.setNext_req_timeIsSet(true);
            struct.total_online = tTupleProtocol.readI32();
            struct.setTotal_onlineIsSet(true);
            struct.begin_time = tTupleProtocol.readI64();
            struct.setBegin_timeIsSet(true);
            struct.end_time = tTupleProtocol.readI64();
            struct.setEnd_timeIsSet(true);
            struct.late_time = tTupleProtocol.readI64();
            struct.setLate_timeIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, SystemInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.status.getValue());
            tTupleProtocol.writeI64(struct.sys_time);
            tTupleProtocol.writeI64(struct.next_req_time);
            tTupleProtocol.writeI32(struct.total_online);
            tTupleProtocol.writeI64(struct.begin_time);
            tTupleProtocol.writeI64(struct.end_time);
            tTupleProtocol.writeI64(struct.late_time);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SystemInfoTupleSchemeFactory implements SchemeFactory {
        private SystemInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SystemInfoTupleScheme getScheme() {
            return new SystemInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        STATUS(1, "status"),
        SYS_TIME(2, "sys_time"),
        NEXT_REQ_TIME(3, "next_req_time"),
        TOTAL_ONLINE(4, "total_online"),
        BEGIN_TIME(5, "begin_time"),
        END_TIME(6, "end_time"),
        LATE_TIME(7, "late_time");

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
                    return STATUS;
                case 2:
                    return SYS_TIME;
                case 3:
                    return NEXT_REQ_TIME;
                case 4:
                    return TOTAL_ONLINE;
                case 5:
                    return BEGIN_TIME;
                case 6:
                    return END_TIME;
                case 7:
                    return LATE_TIME;
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
        hashMap.put(StandardScheme.class, new SystemInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new SystemInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.STATUS, (_Fields) new FieldMetaData("status", (byte) 1, new EnumMetaData((byte) 16, SysStatus.class)));
        enumMap.put((EnumMap) _Fields.SYS_TIME, (_Fields) new FieldMetaData("sys_time", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.NEXT_REQ_TIME, (_Fields) new FieldMetaData("next_req_time", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.TOTAL_ONLINE, (_Fields) new FieldMetaData("total_online", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.BEGIN_TIME, (_Fields) new FieldMetaData("begin_time", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.END_TIME, (_Fields) new FieldMetaData("end_time", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.LATE_TIME, (_Fields) new FieldMetaData("late_time", (byte) 1, new FieldValueMetaData((byte) 10)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(SystemInfo.class, unmodifiableMap);
    }

    public SystemInfo() {
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
        this.status = null;
        setSys_timeIsSet(false);
        this.sys_time = 0L;
        setNext_req_timeIsSet(false);
        this.next_req_time = 0L;
        setTotal_onlineIsSet(false);
        this.total_online = 0;
        setBegin_timeIsSet(false);
        this.begin_time = 0L;
        setEnd_timeIsSet(false);
        this.end_time = 0L;
        setLate_timeIsSet(false);
        this.late_time = 0L;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof SystemInfo)) {
            return equals((SystemInfo) that);
        }
        return false;
    }

    public long getBegin_time() {
        return this.begin_time;
    }

    public long getEnd_time() {
        return this.end_time;
    }

    public long getLate_time() {
        return this.late_time;
    }

    public long getNext_req_time() {
        return this.next_req_time;
    }

    public SysStatus getStatus() {
        return this.status;
    }

    public long getSys_time() {
        return this.sys_time;
    }

    public int getTotal_online() {
        return this.total_online;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetBegin_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetEnd_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 4);
    }

    public boolean isSetLate_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 5);
    }

    public boolean isSetNext_req_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetStatus() {
        return this.status != null;
    }

    public boolean isSetSys_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetTotal_online() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public SystemInfo setBegin_time(long begin_time) {
        this.begin_time = begin_time;
        setBegin_timeIsSet(true);
        return this;
    }

    public void setBegin_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public SystemInfo setEnd_time(long end_time) {
        this.end_time = end_time;
        setEnd_timeIsSet(true);
        return this;
    }

    public void setEnd_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 4, value);
    }

    public SystemInfo setLate_time(long late_time) {
        this.late_time = late_time;
        setLate_timeIsSet(true);
        return this;
    }

    public void setLate_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 5, value);
    }

    public SystemInfo setNext_req_time(long next_req_time) {
        this.next_req_time = next_req_time;
        setNext_req_timeIsSet(true);
        return this;
    }

    public void setNext_req_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public SystemInfo setStatus(SysStatus status) {
        this.status = status;
        return this;
    }

    public void setStatusIsSet(boolean value) {
        if (value) {
            return;
        }
        this.status = null;
    }

    public SystemInfo setSys_time(long sys_time) {
        this.sys_time = sys_time;
        setSys_timeIsSet(true);
        return this;
    }

    public void setSys_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public SystemInfo setTotal_online(int total_online) {
        this.total_online = total_online;
        setTotal_onlineIsSet(true);
        return this;
    }

    public void setTotal_onlineIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SystemInfo(");
        sb2.append("status:");
        SysStatus sysStatus = this.status;
        if (sysStatus == null) {
            sb2.append("null");
        } else {
            sb2.append(sysStatus);
        }
        sb2.append(j2.O);
        sb2.append("sys_time:");
        sb2.append(this.sys_time);
        sb2.append(j2.O);
        sb2.append("next_req_time:");
        sb2.append(this.next_req_time);
        sb2.append(j2.O);
        sb2.append("total_online:");
        sb2.append(this.total_online);
        sb2.append(j2.O);
        sb2.append("begin_time:");
        sb2.append(this.begin_time);
        sb2.append(j2.O);
        sb2.append("end_time:");
        sb2.append(this.end_time);
        sb2.append(j2.O);
        sb2.append("late_time:");
        sb2.append(this.late_time);
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetBegin_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetEnd_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 4);
    }

    public void unsetLate_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 5);
    }

    public void unsetNext_req_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetStatus() {
        this.status = null;
    }

    public void unsetSys_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetTotal_online() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void validate() throws TException {
        if (this.status != null) {
            return;
        }
        throw new TProtocolException("Required field 'status' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(SystemInfo other) {
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
        int compareTo8 = Boolean.valueOf(isSetStatus()).compareTo(Boolean.valueOf(other.isSetStatus()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetStatus() && (compareTo7 = TBaseHelper.compareTo((Comparable) this.status, (Comparable) other.status)) != 0) {
            return compareTo7;
        }
        int compareTo9 = Boolean.valueOf(isSetSys_time()).compareTo(Boolean.valueOf(other.isSetSys_time()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetSys_time() && (compareTo6 = TBaseHelper.compareTo(this.sys_time, other.sys_time)) != 0) {
            return compareTo6;
        }
        int compareTo10 = Boolean.valueOf(isSetNext_req_time()).compareTo(Boolean.valueOf(other.isSetNext_req_time()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetNext_req_time() && (compareTo5 = TBaseHelper.compareTo(this.next_req_time, other.next_req_time)) != 0) {
            return compareTo5;
        }
        int compareTo11 = Boolean.valueOf(isSetTotal_online()).compareTo(Boolean.valueOf(other.isSetTotal_online()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetTotal_online() && (compareTo4 = TBaseHelper.compareTo(this.total_online, other.total_online)) != 0) {
            return compareTo4;
        }
        int compareTo12 = Boolean.valueOf(isSetBegin_time()).compareTo(Boolean.valueOf(other.isSetBegin_time()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetBegin_time() && (compareTo3 = TBaseHelper.compareTo(this.begin_time, other.begin_time)) != 0) {
            return compareTo3;
        }
        int compareTo13 = Boolean.valueOf(isSetEnd_time()).compareTo(Boolean.valueOf(other.isSetEnd_time()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetEnd_time() && (compareTo2 = TBaseHelper.compareTo(this.end_time, other.end_time)) != 0) {
            return compareTo2;
        }
        int compareTo14 = Boolean.valueOf(isSetLate_time()).compareTo(Boolean.valueOf(other.isSetLate_time()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (!isSetLate_time() || (compareTo = TBaseHelper.compareTo(this.late_time, other.late_time)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<SystemInfo, _Fields> deepCopy2() {
        return new SystemInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$SystemInfo$_Fields[field.ordinal()]) {
            case 1:
                return getStatus();
            case 2:
                return Long.valueOf(getSys_time());
            case 3:
                return Long.valueOf(getNext_req_time());
            case 4:
                return Integer.valueOf(getTotal_online());
            case 5:
                return Long.valueOf(getBegin_time());
            case 6:
                return Long.valueOf(getEnd_time());
            case 7:
                return Long.valueOf(getLate_time());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$SystemInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetStatus();
            case 2:
                return isSetSys_time();
            case 3:
                return isSetNext_req_time();
            case 4:
                return isSetTotal_online();
            case 5:
                return isSetBegin_time();
            case 6:
                return isSetEnd_time();
            case 7:
                return isSetLate_time();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$SystemInfo$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setStatus((SysStatus) value);
                    break;
                } else {
                    unsetStatus();
                    break;
                }
            case 2:
                if (value != null) {
                    setSys_time(((Long) value).longValue());
                    break;
                } else {
                    unsetSys_time();
                    break;
                }
            case 3:
                if (value != null) {
                    setNext_req_time(((Long) value).longValue());
                    break;
                } else {
                    unsetNext_req_time();
                    break;
                }
            case 4:
                if (value != null) {
                    setTotal_online(((Integer) value).intValue());
                    break;
                } else {
                    unsetTotal_online();
                    break;
                }
            case 5:
                if (value != null) {
                    setBegin_time(((Long) value).longValue());
                    break;
                } else {
                    unsetBegin_time();
                    break;
                }
            case 6:
                if (value != null) {
                    setEnd_time(((Long) value).longValue());
                    break;
                } else {
                    unsetEnd_time();
                    break;
                }
            case 7:
                if (value != null) {
                    setLate_time(((Long) value).longValue());
                    break;
                } else {
                    unsetLate_time();
                    break;
                }
        }
    }

    public SystemInfo(SysStatus status, long sys_time, long next_req_time, int total_online, long begin_time, long end_time, long late_time) {
        this();
        this.status = status;
        this.sys_time = sys_time;
        setSys_timeIsSet(true);
        this.next_req_time = next_req_time;
        setNext_req_timeIsSet(true);
        this.total_online = total_online;
        setTotal_onlineIsSet(true);
        this.begin_time = begin_time;
        setBegin_timeIsSet(true);
        this.end_time = end_time;
        setEnd_timeIsSet(true);
        this.late_time = late_time;
        setLate_timeIsSet(true);
    }

    public boolean equals(SystemInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetStatus = isSetStatus();
        boolean isSetStatus2 = that.isSetStatus();
        return (!(isSetStatus || isSetStatus2) || (isSetStatus && isSetStatus2 && this.status.equals(that.status))) && this.sys_time == that.sys_time && this.next_req_time == that.next_req_time && this.total_online == that.total_online && this.begin_time == that.begin_time && this.end_time == that.end_time && this.late_time == that.late_time;
    }

    public SystemInfo(SystemInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetStatus()) {
            this.status = other.status;
        }
        this.sys_time = other.sys_time;
        this.next_req_time = other.next_req_time;
        this.total_online = other.total_online;
        this.begin_time = other.begin_time;
        this.end_time = other.end_time;
        this.late_time = other.late_time;
    }
}
