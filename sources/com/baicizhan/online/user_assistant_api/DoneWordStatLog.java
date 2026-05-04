package com.baicizhan.online.user_assistant_api;

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
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class DoneWordStatLog implements TBase<DoneWordStatLog, _Fields>, Serializable, Cloneable, Comparable<DoneWordStatLog> {
    private static final int __DONE_TYPE_ISSET_ID = 4;
    private static final int __DURATION_ISSET_ID = 5;
    private static final int __IS_DONE_RIGHT_ISSET_ID = 2;
    private static final int __IS_TODAY_NEW_ISSET_ID = 1;
    private static final int __OPTION_ISSET_ID = 3;
    private static final int __TAG_ID_ISSET_ID = 6;
    private static final int __TOPIC_ID_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int done_type;
    public int duration;
    public int is_done_right;
    public int is_today_new;
    public int option;
    private _Fields[] optionals;
    public int tag_id;
    public int topic_id;
    private static final TStruct STRUCT_DESC = new TStruct("DoneWordStatLog");
    private static final TField TOPIC_ID_FIELD_DESC = new TField("topic_id", (byte) 8, 1);
    private static final TField IS_TODAY_NEW_FIELD_DESC = new TField("is_today_new", (byte) 8, 2);
    private static final TField IS_DONE_RIGHT_FIELD_DESC = new TField("is_done_right", (byte) 8, 3);
    private static final TField OPTION_FIELD_DESC = new TField("option", (byte) 8, 4);
    private static final TField DONE_TYPE_FIELD_DESC = new TField("done_type", (byte) 8, 5);
    private static final TField DURATION_FIELD_DESC = new TField("duration", (byte) 8, 6);
    private static final TField TAG_ID_FIELD_DESC = new TField("tag_id", (byte) 8, 7);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_assistant_api.DoneWordStatLog$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_assistant_api$DoneWordStatLog$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_assistant_api$DoneWordStatLog$_Fields = iArr;
            try {
                iArr[_Fields.TOPIC_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$DoneWordStatLog$_Fields[_Fields.IS_TODAY_NEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$DoneWordStatLog$_Fields[_Fields.IS_DONE_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$DoneWordStatLog$_Fields[_Fields.OPTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$DoneWordStatLog$_Fields[_Fields.DONE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$DoneWordStatLog$_Fields[_Fields.DURATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$DoneWordStatLog$_Fields[_Fields.TAG_ID.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DoneWordStatLogStandardScheme extends StandardScheme<DoneWordStatLog> {
        private DoneWordStatLogStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, DoneWordStatLog struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetTopic_id()) {
                        throw new TProtocolException("Required field 'topic_id' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetIs_today_new()) {
                        throw new TProtocolException("Required field 'is_today_new' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetIs_done_right()) {
                        throw new TProtocolException("Required field 'is_done_right' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetOption()) {
                        throw new TProtocolException("Required field 'option' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetDone_type()) {
                        throw new TProtocolException("Required field 'done_type' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetDuration()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'duration' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.topic_id = iprot.readI32();
                            struct.setTopic_idIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.is_today_new = iprot.readI32();
                            struct.setIs_today_newIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.is_done_right = iprot.readI32();
                            struct.setIs_done_rightIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.option = iprot.readI32();
                            struct.setOptionIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.done_type = iprot.readI32();
                            struct.setDone_typeIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.duration = iprot.readI32();
                            struct.setDurationIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.tag_id = iprot.readI32();
                            struct.setTag_idIsSet(true);
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
        public void write(TProtocol oprot, DoneWordStatLog struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(DoneWordStatLog.STRUCT_DESC);
            oprot.writeFieldBegin(DoneWordStatLog.TOPIC_ID_FIELD_DESC);
            oprot.writeI32(struct.topic_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(DoneWordStatLog.IS_TODAY_NEW_FIELD_DESC);
            oprot.writeI32(struct.is_today_new);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(DoneWordStatLog.IS_DONE_RIGHT_FIELD_DESC);
            oprot.writeI32(struct.is_done_right);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(DoneWordStatLog.OPTION_FIELD_DESC);
            oprot.writeI32(struct.option);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(DoneWordStatLog.DONE_TYPE_FIELD_DESC);
            oprot.writeI32(struct.done_type);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(DoneWordStatLog.DURATION_FIELD_DESC);
            oprot.writeI32(struct.duration);
            oprot.writeFieldEnd();
            if (struct.isSetTag_id()) {
                oprot.writeFieldBegin(DoneWordStatLog.TAG_ID_FIELD_DESC);
                oprot.writeI32(struct.tag_id);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DoneWordStatLogStandardSchemeFactory implements SchemeFactory {
        private DoneWordStatLogStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public DoneWordStatLogStandardScheme getScheme() {
            return new DoneWordStatLogStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DoneWordStatLogTupleScheme extends TupleScheme<DoneWordStatLog> {
        private DoneWordStatLogTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, DoneWordStatLog struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.topic_id = tTupleProtocol.readI32();
            struct.setTopic_idIsSet(true);
            struct.is_today_new = tTupleProtocol.readI32();
            struct.setIs_today_newIsSet(true);
            struct.is_done_right = tTupleProtocol.readI32();
            struct.setIs_done_rightIsSet(true);
            struct.option = tTupleProtocol.readI32();
            struct.setOptionIsSet(true);
            struct.done_type = tTupleProtocol.readI32();
            struct.setDone_typeIsSet(true);
            struct.duration = tTupleProtocol.readI32();
            struct.setDurationIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                struct.tag_id = tTupleProtocol.readI32();
                struct.setTag_idIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, DoneWordStatLog struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.topic_id);
            tTupleProtocol.writeI32(struct.is_today_new);
            tTupleProtocol.writeI32(struct.is_done_right);
            tTupleProtocol.writeI32(struct.option);
            tTupleProtocol.writeI32(struct.done_type);
            tTupleProtocol.writeI32(struct.duration);
            BitSet bitSet = new BitSet();
            if (struct.isSetTag_id()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetTag_id()) {
                tTupleProtocol.writeI32(struct.tag_id);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DoneWordStatLogTupleSchemeFactory implements SchemeFactory {
        private DoneWordStatLogTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public DoneWordStatLogTupleScheme getScheme() {
            return new DoneWordStatLogTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TOPIC_ID(1, "topic_id"),
        IS_TODAY_NEW(2, "is_today_new"),
        IS_DONE_RIGHT(3, "is_done_right"),
        OPTION(4, "option"),
        DONE_TYPE(5, "done_type"),
        DURATION(6, "duration"),
        TAG_ID(7, "tag_id");

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
                    return TOPIC_ID;
                case 2:
                    return IS_TODAY_NEW;
                case 3:
                    return IS_DONE_RIGHT;
                case 4:
                    return OPTION;
                case 5:
                    return DONE_TYPE;
                case 6:
                    return DURATION;
                case 7:
                    return TAG_ID;
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
        hashMap.put(StandardScheme.class, new DoneWordStatLogStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new DoneWordStatLogTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TOPIC_ID, (_Fields) new FieldMetaData("topic_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.IS_TODAY_NEW, (_Fields) new FieldMetaData("is_today_new", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.IS_DONE_RIGHT, (_Fields) new FieldMetaData("is_done_right", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.OPTION, (_Fields) new FieldMetaData("option", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.DONE_TYPE, (_Fields) new FieldMetaData("done_type", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.DURATION, (_Fields) new FieldMetaData("duration", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.TAG_ID, (_Fields) new FieldMetaData("tag_id", (byte) 2, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(DoneWordStatLog.class, unmodifiableMap);
    }

    public DoneWordStatLog() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.TAG_ID};
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
        setIs_today_newIsSet(false);
        this.is_today_new = 0;
        setIs_done_rightIsSet(false);
        this.is_done_right = 0;
        setOptionIsSet(false);
        this.option = 0;
        setDone_typeIsSet(false);
        this.done_type = 0;
        setDurationIsSet(false);
        this.duration = 0;
        setTag_idIsSet(false);
        this.tag_id = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof DoneWordStatLog)) {
            return equals((DoneWordStatLog) that);
        }
        return false;
    }

    public int getDone_type() {
        return this.done_type;
    }

    public int getDuration() {
        return this.duration;
    }

    public int getIs_done_right() {
        return this.is_done_right;
    }

    public int getIs_today_new() {
        return this.is_today_new;
    }

    public int getOption() {
        return this.option;
    }

    public int getTag_id() {
        return this.tag_id;
    }

    public int getTopic_id() {
        return this.topic_id;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetDone_type() {
        return EncodingUtils.testBit(this.__isset_bitfield, 4);
    }

    public boolean isSetDuration() {
        return EncodingUtils.testBit(this.__isset_bitfield, 5);
    }

    public boolean isSetIs_done_right() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetIs_today_new() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetOption() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetTag_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 6);
    }

    public boolean isSetTopic_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public DoneWordStatLog setDone_type(int done_type) {
        this.done_type = done_type;
        setDone_typeIsSet(true);
        return this;
    }

    public void setDone_typeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 4, value);
    }

    public DoneWordStatLog setDuration(int duration) {
        this.duration = duration;
        setDurationIsSet(true);
        return this;
    }

    public void setDurationIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 5, value);
    }

    public DoneWordStatLog setIs_done_right(int is_done_right) {
        this.is_done_right = is_done_right;
        setIs_done_rightIsSet(true);
        return this;
    }

    public void setIs_done_rightIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public DoneWordStatLog setIs_today_new(int is_today_new) {
        this.is_today_new = is_today_new;
        setIs_today_newIsSet(true);
        return this;
    }

    public void setIs_today_newIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public DoneWordStatLog setOption(int option) {
        this.option = option;
        setOptionIsSet(true);
        return this;
    }

    public void setOptionIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public DoneWordStatLog setTag_id(int tag_id) {
        this.tag_id = tag_id;
        setTag_idIsSet(true);
        return this;
    }

    public void setTag_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 6, value);
    }

    public DoneWordStatLog setTopic_id(int topic_id) {
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        return this;
    }

    public void setTopic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DoneWordStatLog(");
        sb2.append("topic_id:");
        sb2.append(this.topic_id);
        sb2.append(j2.O);
        sb2.append("is_today_new:");
        sb2.append(this.is_today_new);
        sb2.append(j2.O);
        sb2.append("is_done_right:");
        sb2.append(this.is_done_right);
        sb2.append(j2.O);
        sb2.append("option:");
        sb2.append(this.option);
        sb2.append(j2.O);
        sb2.append("done_type:");
        sb2.append(this.done_type);
        sb2.append(j2.O);
        sb2.append("duration:");
        sb2.append(this.duration);
        if (isSetTag_id()) {
            sb2.append(j2.O);
            sb2.append("tag_id:");
            sb2.append(this.tag_id);
        }
        sb2.append(j.f81007d);
        return sb2.toString();
    }

    public void unsetDone_type() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 4);
    }

    public void unsetDuration() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 5);
    }

    public void unsetIs_done_right() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetIs_today_new() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetOption() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetTag_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 6);
    }

    public void unsetTopic_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(DoneWordStatLog other) {
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
        int compareTo8 = Boolean.valueOf(isSetTopic_id()).compareTo(Boolean.valueOf(other.isSetTopic_id()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetTopic_id() && (compareTo7 = TBaseHelper.compareTo(this.topic_id, other.topic_id)) != 0) {
            return compareTo7;
        }
        int compareTo9 = Boolean.valueOf(isSetIs_today_new()).compareTo(Boolean.valueOf(other.isSetIs_today_new()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetIs_today_new() && (compareTo6 = TBaseHelper.compareTo(this.is_today_new, other.is_today_new)) != 0) {
            return compareTo6;
        }
        int compareTo10 = Boolean.valueOf(isSetIs_done_right()).compareTo(Boolean.valueOf(other.isSetIs_done_right()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetIs_done_right() && (compareTo5 = TBaseHelper.compareTo(this.is_done_right, other.is_done_right)) != 0) {
            return compareTo5;
        }
        int compareTo11 = Boolean.valueOf(isSetOption()).compareTo(Boolean.valueOf(other.isSetOption()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetOption() && (compareTo4 = TBaseHelper.compareTo(this.option, other.option)) != 0) {
            return compareTo4;
        }
        int compareTo12 = Boolean.valueOf(isSetDone_type()).compareTo(Boolean.valueOf(other.isSetDone_type()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetDone_type() && (compareTo3 = TBaseHelper.compareTo(this.done_type, other.done_type)) != 0) {
            return compareTo3;
        }
        int compareTo13 = Boolean.valueOf(isSetDuration()).compareTo(Boolean.valueOf(other.isSetDuration()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetDuration() && (compareTo2 = TBaseHelper.compareTo(this.duration, other.duration)) != 0) {
            return compareTo2;
        }
        int compareTo14 = Boolean.valueOf(isSetTag_id()).compareTo(Boolean.valueOf(other.isSetTag_id()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (!isSetTag_id() || (compareTo = TBaseHelper.compareTo(this.tag_id, other.tag_id)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<DoneWordStatLog, _Fields> deepCopy2() {
        return new DoneWordStatLog(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$DoneWordStatLog$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getTopic_id());
            case 2:
                return Integer.valueOf(getIs_today_new());
            case 3:
                return Integer.valueOf(getIs_done_right());
            case 4:
                return Integer.valueOf(getOption());
            case 5:
                return Integer.valueOf(getDone_type());
            case 6:
                return Integer.valueOf(getDuration());
            case 7:
                return Integer.valueOf(getTag_id());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$DoneWordStatLog$_Fields[field.ordinal()]) {
            case 1:
                return isSetTopic_id();
            case 2:
                return isSetIs_today_new();
            case 3:
                return isSetIs_done_right();
            case 4:
                return isSetOption();
            case 5:
                return isSetDone_type();
            case 6:
                return isSetDuration();
            case 7:
                return isSetTag_id();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$DoneWordStatLog$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setTopic_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetTopic_id();
                    break;
                }
            case 2:
                if (value != null) {
                    setIs_today_new(((Integer) value).intValue());
                    break;
                } else {
                    unsetIs_today_new();
                    break;
                }
            case 3:
                if (value != null) {
                    setIs_done_right(((Integer) value).intValue());
                    break;
                } else {
                    unsetIs_done_right();
                    break;
                }
            case 4:
                if (value != null) {
                    setOption(((Integer) value).intValue());
                    break;
                } else {
                    unsetOption();
                    break;
                }
            case 5:
                if (value != null) {
                    setDone_type(((Integer) value).intValue());
                    break;
                } else {
                    unsetDone_type();
                    break;
                }
            case 6:
                if (value != null) {
                    setDuration(((Integer) value).intValue());
                    break;
                } else {
                    unsetDuration();
                    break;
                }
            case 7:
                if (value != null) {
                    setTag_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetTag_id();
                    break;
                }
        }
    }

    public boolean equals(DoneWordStatLog that) {
        if (that == null || this.topic_id != that.topic_id || this.is_today_new != that.is_today_new || this.is_done_right != that.is_done_right || this.option != that.option || this.done_type != that.done_type || this.duration != that.duration) {
            return false;
        }
        boolean isSetTag_id = isSetTag_id();
        boolean isSetTag_id2 = that.isSetTag_id();
        if (isSetTag_id || isSetTag_id2) {
            return isSetTag_id && isSetTag_id2 && this.tag_id == that.tag_id;
        }
        return true;
    }

    public DoneWordStatLog(int topic_id, int is_today_new, int is_done_right, int option, int done_type, int duration) {
        this();
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        this.is_today_new = is_today_new;
        setIs_today_newIsSet(true);
        this.is_done_right = is_done_right;
        setIs_done_rightIsSet(true);
        this.option = option;
        setOptionIsSet(true);
        this.done_type = done_type;
        setDone_typeIsSet(true);
        this.duration = duration;
        setDurationIsSet(true);
    }

    public DoneWordStatLog(DoneWordStatLog other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.TAG_ID};
        this.__isset_bitfield = other.__isset_bitfield;
        this.topic_id = other.topic_id;
        this.is_today_new = other.is_today_new;
        this.is_done_right = other.is_done_right;
        this.option = other.option;
        this.done_type = other.done_type;
        this.duration = other.duration;
        this.tag_id = other.tag_id;
    }

    public void validate() throws TException {
    }
}
