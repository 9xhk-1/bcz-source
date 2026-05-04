package com.baicizhan.online.notify;

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
import k3.u0;
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
import pn.j;
import xo.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class UserRemindInfo implements TBase<UserRemindInfo, _Fields>, Serializable, Cloneable, Comparable<UserRemindInfo> {
    private static final int __ENABLE_ISSET_ID = 0;
    private static final int __HOUR_ISSET_ID = 1;
    private static final int __MINUTE_ISSET_ID = 2;
    private static final int __SENTENCE_ENABLE_ISSET_ID = 6;
    private static final int __SOCIAL_ENABLE_ISSET_ID = 5;
    private static final int __TASK_ENABLE_ISSET_ID = 4;
    private static final int __WX_ENABLE_ISSET_ID = 3;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public boolean enable;
    public int hour;
    public int minute;
    private _Fields[] optionals;
    public int sentence_enable;
    public int social_enable;
    public int task_enable;
    public boolean wx_enable;
    private static final TStruct STRUCT_DESC = new TStruct("UserRemindInfo");
    private static final TField ENABLE_FIELD_DESC = new TField(u0.f65628b, (byte) 2, 1);
    private static final TField HOUR_FIELD_DESC = new TField("hour", (byte) 8, 2);
    private static final TField MINUTE_FIELD_DESC = new TField(n.r.f98263e, (byte) 8, 3);
    private static final TField WX_ENABLE_FIELD_DESC = new TField("wx_enable", (byte) 2, 4);
    private static final TField TASK_ENABLE_FIELD_DESC = new TField("task_enable", (byte) 8, 5);
    private static final TField SOCIAL_ENABLE_FIELD_DESC = new TField("social_enable", (byte) 8, 6);
    private static final TField SENTENCE_ENABLE_FIELD_DESC = new TField("sentence_enable", (byte) 8, 7);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.notify.UserRemindInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$notify$UserRemindInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$notify$UserRemindInfo$_Fields = iArr;
            try {
                iArr[_Fields.ENABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$notify$UserRemindInfo$_Fields[_Fields.HOUR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$notify$UserRemindInfo$_Fields[_Fields.MINUTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$notify$UserRemindInfo$_Fields[_Fields.WX_ENABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$notify$UserRemindInfo$_Fields[_Fields.TASK_ENABLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$notify$UserRemindInfo$_Fields[_Fields.SOCIAL_ENABLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$notify$UserRemindInfo$_Fields[_Fields.SENTENCE_ENABLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserRemindInfoStandardScheme extends StandardScheme<UserRemindInfo> {
        private UserRemindInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserRemindInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetEnable()) {
                        throw new TProtocolException("Required field 'enable' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetHour()) {
                        throw new TProtocolException("Required field 'hour' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetMinute()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'minute' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 2) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.enable = iprot.readBool();
                            struct.setEnableIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.hour = iprot.readI32();
                            struct.setHourIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.minute = iprot.readI32();
                            struct.setMinuteIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 2) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.wx_enable = iprot.readBool();
                            struct.setWx_enableIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.task_enable = iprot.readI32();
                            struct.setTask_enableIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.social_enable = iprot.readI32();
                            struct.setSocial_enableIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.sentence_enable = iprot.readI32();
                            struct.setSentence_enableIsSet(true);
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
        public void write(TProtocol oprot, UserRemindInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserRemindInfo.STRUCT_DESC);
            oprot.writeFieldBegin(UserRemindInfo.ENABLE_FIELD_DESC);
            oprot.writeBool(struct.enable);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserRemindInfo.HOUR_FIELD_DESC);
            oprot.writeI32(struct.hour);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserRemindInfo.MINUTE_FIELD_DESC);
            oprot.writeI32(struct.minute);
            oprot.writeFieldEnd();
            if (struct.isSetWx_enable()) {
                oprot.writeFieldBegin(UserRemindInfo.WX_ENABLE_FIELD_DESC);
                oprot.writeBool(struct.wx_enable);
                oprot.writeFieldEnd();
            }
            if (struct.isSetTask_enable()) {
                oprot.writeFieldBegin(UserRemindInfo.TASK_ENABLE_FIELD_DESC);
                oprot.writeI32(struct.task_enable);
                oprot.writeFieldEnd();
            }
            if (struct.isSetSocial_enable()) {
                oprot.writeFieldBegin(UserRemindInfo.SOCIAL_ENABLE_FIELD_DESC);
                oprot.writeI32(struct.social_enable);
                oprot.writeFieldEnd();
            }
            if (struct.isSetSentence_enable()) {
                oprot.writeFieldBegin(UserRemindInfo.SENTENCE_ENABLE_FIELD_DESC);
                oprot.writeI32(struct.sentence_enable);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserRemindInfoStandardSchemeFactory implements SchemeFactory {
        private UserRemindInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserRemindInfoStandardScheme getScheme() {
            return new UserRemindInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserRemindInfoTupleScheme extends TupleScheme<UserRemindInfo> {
        private UserRemindInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserRemindInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.enable = tTupleProtocol.readBool();
            struct.setEnableIsSet(true);
            struct.hour = tTupleProtocol.readI32();
            struct.setHourIsSet(true);
            struct.minute = tTupleProtocol.readI32();
            struct.setMinuteIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(4);
            if (readBitSet.get(0)) {
                struct.wx_enable = tTupleProtocol.readBool();
                struct.setWx_enableIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.task_enable = tTupleProtocol.readI32();
                struct.setTask_enableIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.social_enable = tTupleProtocol.readI32();
                struct.setSocial_enableIsSet(true);
            }
            if (readBitSet.get(3)) {
                struct.sentence_enable = tTupleProtocol.readI32();
                struct.setSentence_enableIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserRemindInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeBool(struct.enable);
            tTupleProtocol.writeI32(struct.hour);
            tTupleProtocol.writeI32(struct.minute);
            BitSet bitSet = new BitSet();
            if (struct.isSetWx_enable()) {
                bitSet.set(0);
            }
            if (struct.isSetTask_enable()) {
                bitSet.set(1);
            }
            if (struct.isSetSocial_enable()) {
                bitSet.set(2);
            }
            if (struct.isSetSentence_enable()) {
                bitSet.set(3);
            }
            tTupleProtocol.writeBitSet(bitSet, 4);
            if (struct.isSetWx_enable()) {
                tTupleProtocol.writeBool(struct.wx_enable);
            }
            if (struct.isSetTask_enable()) {
                tTupleProtocol.writeI32(struct.task_enable);
            }
            if (struct.isSetSocial_enable()) {
                tTupleProtocol.writeI32(struct.social_enable);
            }
            if (struct.isSetSentence_enable()) {
                tTupleProtocol.writeI32(struct.sentence_enable);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserRemindInfoTupleSchemeFactory implements SchemeFactory {
        private UserRemindInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserRemindInfoTupleScheme getScheme() {
            return new UserRemindInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ENABLE(1, u0.f65628b),
        HOUR(2, "hour"),
        MINUTE(3, n.r.f98263e),
        WX_ENABLE(4, "wx_enable"),
        TASK_ENABLE(5, "task_enable"),
        SOCIAL_ENABLE(6, "social_enable"),
        SENTENCE_ENABLE(7, "sentence_enable");

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
                    return ENABLE;
                case 2:
                    return HOUR;
                case 3:
                    return MINUTE;
                case 4:
                    return WX_ENABLE;
                case 5:
                    return TASK_ENABLE;
                case 6:
                    return SOCIAL_ENABLE;
                case 7:
                    return SENTENCE_ENABLE;
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
        hashMap.put(StandardScheme.class, new UserRemindInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserRemindInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ENABLE, (_Fields) new FieldMetaData(u0.f65628b, (byte) 1, new FieldValueMetaData((byte) 2)));
        enumMap.put((EnumMap) _Fields.HOUR, (_Fields) new FieldMetaData("hour", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.MINUTE, (_Fields) new FieldMetaData(n.r.f98263e, (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.WX_ENABLE, (_Fields) new FieldMetaData("wx_enable", (byte) 2, new FieldValueMetaData((byte) 2)));
        enumMap.put((EnumMap) _Fields.TASK_ENABLE, (_Fields) new FieldMetaData("task_enable", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.SOCIAL_ENABLE, (_Fields) new FieldMetaData("social_enable", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.SENTENCE_ENABLE, (_Fields) new FieldMetaData("sentence_enable", (byte) 2, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserRemindInfo.class, unmodifiableMap);
    }

    public UserRemindInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.WX_ENABLE, _Fields.TASK_ENABLE, _Fields.SOCIAL_ENABLE, _Fields.SENTENCE_ENABLE};
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
        setEnableIsSet(false);
        this.enable = false;
        setHourIsSet(false);
        this.hour = 0;
        setMinuteIsSet(false);
        this.minute = 0;
        setWx_enableIsSet(false);
        this.wx_enable = false;
        setTask_enableIsSet(false);
        this.task_enable = 0;
        setSocial_enableIsSet(false);
        this.social_enable = 0;
        setSentence_enableIsSet(false);
        this.sentence_enable = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserRemindInfo)) {
            return equals((UserRemindInfo) that);
        }
        return false;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSentence_enable() {
        return this.sentence_enable;
    }

    public int getSocial_enable() {
        return this.social_enable;
    }

    public int getTask_enable() {
        return this.task_enable;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public boolean isSetEnable() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetHour() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetMinute() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetSentence_enable() {
        return EncodingUtils.testBit(this.__isset_bitfield, 6);
    }

    public boolean isSetSocial_enable() {
        return EncodingUtils.testBit(this.__isset_bitfield, 5);
    }

    public boolean isSetTask_enable() {
        return EncodingUtils.testBit(this.__isset_bitfield, 4);
    }

    public boolean isSetWx_enable() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isWx_enable() {
        return this.wx_enable;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserRemindInfo setEnable(boolean enable) {
        this.enable = enable;
        setEnableIsSet(true);
        return this;
    }

    public void setEnableIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public UserRemindInfo setHour(int hour) {
        this.hour = hour;
        setHourIsSet(true);
        return this;
    }

    public void setHourIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public UserRemindInfo setMinute(int minute) {
        this.minute = minute;
        setMinuteIsSet(true);
        return this;
    }

    public void setMinuteIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public UserRemindInfo setSentence_enable(int sentence_enable) {
        this.sentence_enable = sentence_enable;
        setSentence_enableIsSet(true);
        return this;
    }

    public void setSentence_enableIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 6, value);
    }

    public UserRemindInfo setSocial_enable(int social_enable) {
        this.social_enable = social_enable;
        setSocial_enableIsSet(true);
        return this;
    }

    public void setSocial_enableIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 5, value);
    }

    public UserRemindInfo setTask_enable(int task_enable) {
        this.task_enable = task_enable;
        setTask_enableIsSet(true);
        return this;
    }

    public void setTask_enableIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 4, value);
    }

    public UserRemindInfo setWx_enable(boolean wx_enable) {
        this.wx_enable = wx_enable;
        setWx_enableIsSet(true);
        return this;
    }

    public void setWx_enableIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserRemindInfo(");
        sb2.append("enable:");
        sb2.append(this.enable);
        sb2.append(j2.O);
        sb2.append("hour:");
        sb2.append(this.hour);
        sb2.append(j2.O);
        sb2.append("minute:");
        sb2.append(this.minute);
        if (isSetWx_enable()) {
            sb2.append(j2.O);
            sb2.append("wx_enable:");
            sb2.append(this.wx_enable);
        }
        if (isSetTask_enable()) {
            sb2.append(j2.O);
            sb2.append("task_enable:");
            sb2.append(this.task_enable);
        }
        if (isSetSocial_enable()) {
            sb2.append(j2.O);
            sb2.append("social_enable:");
            sb2.append(this.social_enable);
        }
        if (isSetSentence_enable()) {
            sb2.append(j2.O);
            sb2.append("sentence_enable:");
            sb2.append(this.sentence_enable);
        }
        sb2.append(j.f81007d);
        return sb2.toString();
    }

    public void unsetEnable() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetHour() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetMinute() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetSentence_enable() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 6);
    }

    public void unsetSocial_enable() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 5);
    }

    public void unsetTask_enable() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 4);
    }

    public void unsetWx_enable() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(UserRemindInfo other) {
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
        int compareTo8 = Boolean.valueOf(isSetEnable()).compareTo(Boolean.valueOf(other.isSetEnable()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetEnable() && (compareTo7 = TBaseHelper.compareTo(this.enable, other.enable)) != 0) {
            return compareTo7;
        }
        int compareTo9 = Boolean.valueOf(isSetHour()).compareTo(Boolean.valueOf(other.isSetHour()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetHour() && (compareTo6 = TBaseHelper.compareTo(this.hour, other.hour)) != 0) {
            return compareTo6;
        }
        int compareTo10 = Boolean.valueOf(isSetMinute()).compareTo(Boolean.valueOf(other.isSetMinute()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetMinute() && (compareTo5 = TBaseHelper.compareTo(this.minute, other.minute)) != 0) {
            return compareTo5;
        }
        int compareTo11 = Boolean.valueOf(isSetWx_enable()).compareTo(Boolean.valueOf(other.isSetWx_enable()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetWx_enable() && (compareTo4 = TBaseHelper.compareTo(this.wx_enable, other.wx_enable)) != 0) {
            return compareTo4;
        }
        int compareTo12 = Boolean.valueOf(isSetTask_enable()).compareTo(Boolean.valueOf(other.isSetTask_enable()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetTask_enable() && (compareTo3 = TBaseHelper.compareTo(this.task_enable, other.task_enable)) != 0) {
            return compareTo3;
        }
        int compareTo13 = Boolean.valueOf(isSetSocial_enable()).compareTo(Boolean.valueOf(other.isSetSocial_enable()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetSocial_enable() && (compareTo2 = TBaseHelper.compareTo(this.social_enable, other.social_enable)) != 0) {
            return compareTo2;
        }
        int compareTo14 = Boolean.valueOf(isSetSentence_enable()).compareTo(Boolean.valueOf(other.isSetSentence_enable()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (!isSetSentence_enable() || (compareTo = TBaseHelper.compareTo(this.sentence_enable, other.sentence_enable)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserRemindInfo, _Fields> deepCopy2() {
        return new UserRemindInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$UserRemindInfo$_Fields[field.ordinal()]) {
            case 1:
                return Boolean.valueOf(isEnable());
            case 2:
                return Integer.valueOf(getHour());
            case 3:
                return Integer.valueOf(getMinute());
            case 4:
                return Boolean.valueOf(isWx_enable());
            case 5:
                return Integer.valueOf(getTask_enable());
            case 6:
                return Integer.valueOf(getSocial_enable());
            case 7:
                return Integer.valueOf(getSentence_enable());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$UserRemindInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetEnable();
            case 2:
                return isSetHour();
            case 3:
                return isSetMinute();
            case 4:
                return isSetWx_enable();
            case 5:
                return isSetTask_enable();
            case 6:
                return isSetSocial_enable();
            case 7:
                return isSetSentence_enable();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$UserRemindInfo$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setEnable(((Boolean) value).booleanValue());
                    break;
                } else {
                    unsetEnable();
                    break;
                }
            case 2:
                if (value != null) {
                    setHour(((Integer) value).intValue());
                    break;
                } else {
                    unsetHour();
                    break;
                }
            case 3:
                if (value != null) {
                    setMinute(((Integer) value).intValue());
                    break;
                } else {
                    unsetMinute();
                    break;
                }
            case 4:
                if (value != null) {
                    setWx_enable(((Boolean) value).booleanValue());
                    break;
                } else {
                    unsetWx_enable();
                    break;
                }
            case 5:
                if (value != null) {
                    setTask_enable(((Integer) value).intValue());
                    break;
                } else {
                    unsetTask_enable();
                    break;
                }
            case 6:
                if (value != null) {
                    setSocial_enable(((Integer) value).intValue());
                    break;
                } else {
                    unsetSocial_enable();
                    break;
                }
            case 7:
                if (value != null) {
                    setSentence_enable(((Integer) value).intValue());
                    break;
                } else {
                    unsetSentence_enable();
                    break;
                }
        }
    }

    public boolean equals(UserRemindInfo that) {
        if (that == null || this.enable != that.enable || this.hour != that.hour || this.minute != that.minute) {
            return false;
        }
        boolean isSetWx_enable = isSetWx_enable();
        boolean isSetWx_enable2 = that.isSetWx_enable();
        if ((isSetWx_enable || isSetWx_enable2) && !(isSetWx_enable && isSetWx_enable2 && this.wx_enable == that.wx_enable)) {
            return false;
        }
        boolean isSetTask_enable = isSetTask_enable();
        boolean isSetTask_enable2 = that.isSetTask_enable();
        if ((isSetTask_enable || isSetTask_enable2) && !(isSetTask_enable && isSetTask_enable2 && this.task_enable == that.task_enable)) {
            return false;
        }
        boolean isSetSocial_enable = isSetSocial_enable();
        boolean isSetSocial_enable2 = that.isSetSocial_enable();
        if ((isSetSocial_enable || isSetSocial_enable2) && !(isSetSocial_enable && isSetSocial_enable2 && this.social_enable == that.social_enable)) {
            return false;
        }
        boolean isSetSentence_enable = isSetSentence_enable();
        boolean isSetSentence_enable2 = that.isSetSentence_enable();
        if (isSetSentence_enable || isSetSentence_enable2) {
            return isSetSentence_enable && isSetSentence_enable2 && this.sentence_enable == that.sentence_enable;
        }
        return true;
    }

    public UserRemindInfo(boolean enable, int hour, int minute) {
        this();
        this.enable = enable;
        setEnableIsSet(true);
        this.hour = hour;
        setHourIsSet(true);
        this.minute = minute;
        setMinuteIsSet(true);
    }

    public UserRemindInfo(UserRemindInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.WX_ENABLE, _Fields.TASK_ENABLE, _Fields.SOCIAL_ENABLE, _Fields.SENTENCE_ENABLE};
        this.__isset_bitfield = other.__isset_bitfield;
        this.enable = other.enable;
        this.hour = other.hour;
        this.minute = other.minute;
        this.wx_enable = other.wx_enable;
        this.task_enable = other.task_enable;
        this.social_enable = other.social_enable;
        this.sentence_enable = other.sentence_enable;
    }

    public void validate() throws TException {
    }
}
