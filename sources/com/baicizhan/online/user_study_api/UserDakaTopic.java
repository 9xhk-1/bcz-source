package com.baicizhan.online.user_study_api;

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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class UserDakaTopic implements TBase<UserDakaTopic, _Fields>, Serializable, Cloneable, Comparable<UserDakaTopic> {
    private static final int __DONE_TIMES_ISSET_ID = 2;
    private static final int __TOPIC_ID_ISSET_ID = 0;
    private static final int __WRONG_TIMES_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int done_times;
    public int topic_id;
    public int wrong_times;
    private static final TStruct STRUCT_DESC = new TStruct("UserDakaTopic");
    private static final TField TOPIC_ID_FIELD_DESC = new TField("topic_id", (byte) 8, 1);
    private static final TField WRONG_TIMES_FIELD_DESC = new TField("wrong_times", (byte) 8, 2);
    private static final TField DONE_TIMES_FIELD_DESC = new TField("done_times", (byte) 8, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.UserDakaTopic$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$UserDakaTopic$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$UserDakaTopic$_Fields = iArr;
            try {
                iArr[_Fields.TOPIC_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserDakaTopic$_Fields[_Fields.WRONG_TIMES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserDakaTopic$_Fields[_Fields.DONE_TIMES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserDakaTopicStandardScheme extends StandardScheme<UserDakaTopic> {
        private UserDakaTopicStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserDakaTopic struct) throws TException {
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
                            struct.done_times = iprot.readI32();
                            struct.setDone_timesIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.wrong_times = iprot.readI32();
                        struct.setWrong_timesIsSet(true);
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
            if (!struct.isSetWrong_times()) {
                throw new TProtocolException("Required field 'wrong_times' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetDone_times()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'done_times' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, UserDakaTopic struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserDakaTopic.STRUCT_DESC);
            oprot.writeFieldBegin(UserDakaTopic.TOPIC_ID_FIELD_DESC);
            oprot.writeI32(struct.topic_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserDakaTopic.WRONG_TIMES_FIELD_DESC);
            oprot.writeI32(struct.wrong_times);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserDakaTopic.DONE_TIMES_FIELD_DESC);
            oprot.writeI32(struct.done_times);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserDakaTopicStandardSchemeFactory implements SchemeFactory {
        private UserDakaTopicStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserDakaTopicStandardScheme getScheme() {
            return new UserDakaTopicStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserDakaTopicTupleScheme extends TupleScheme<UserDakaTopic> {
        private UserDakaTopicTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserDakaTopic struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.topic_id = tTupleProtocol.readI32();
            struct.setTopic_idIsSet(true);
            struct.wrong_times = tTupleProtocol.readI32();
            struct.setWrong_timesIsSet(true);
            struct.done_times = tTupleProtocol.readI32();
            struct.setDone_timesIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserDakaTopic struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.topic_id);
            tTupleProtocol.writeI32(struct.wrong_times);
            tTupleProtocol.writeI32(struct.done_times);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserDakaTopicTupleSchemeFactory implements SchemeFactory {
        private UserDakaTopicTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserDakaTopicTupleScheme getScheme() {
            return new UserDakaTopicTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TOPIC_ID(1, "topic_id"),
        WRONG_TIMES(2, "wrong_times"),
        DONE_TIMES(3, "done_times");

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
                return WRONG_TIMES;
            }
            if (fieldId != 3) {
                return null;
            }
            return DONE_TIMES;
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
        hashMap.put(StandardScheme.class, new UserDakaTopicStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserDakaTopicTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TOPIC_ID, (_Fields) new FieldMetaData("topic_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.WRONG_TIMES, (_Fields) new FieldMetaData("wrong_times", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.DONE_TIMES, (_Fields) new FieldMetaData("done_times", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserDakaTopic.class, unmodifiableMap);
    }

    public UserDakaTopic() {
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
        setWrong_timesIsSet(false);
        this.wrong_times = 0;
        setDone_timesIsSet(false);
        this.done_times = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserDakaTopic)) {
            return equals((UserDakaTopic) that);
        }
        return false;
    }

    public int getDone_times() {
        return this.done_times;
    }

    public int getTopic_id() {
        return this.topic_id;
    }

    public int getWrong_times() {
        return this.wrong_times;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetDone_times() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetTopic_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetWrong_times() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserDakaTopic setDone_times(int done_times) {
        this.done_times = done_times;
        setDone_timesIsSet(true);
        return this;
    }

    public void setDone_timesIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public UserDakaTopic setTopic_id(int topic_id) {
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        return this;
    }

    public void setTopic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public UserDakaTopic setWrong_times(int wrong_times) {
        this.wrong_times = wrong_times;
        setWrong_timesIsSet(true);
        return this;
    }

    public void setWrong_timesIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        return "UserDakaTopic(topic_id:" + this.topic_id + org.junit.jupiter.api.j2.O + "wrong_times:" + this.wrong_times + org.junit.jupiter.api.j2.O + "done_times:" + this.done_times + pn.j.f81007d;
    }

    public void unsetDone_times() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetTopic_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetWrong_times() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(UserDakaTopic other) {
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
        int compareTo5 = Boolean.valueOf(isSetWrong_times()).compareTo(Boolean.valueOf(other.isSetWrong_times()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetWrong_times() && (compareTo2 = TBaseHelper.compareTo(this.wrong_times, other.wrong_times)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetDone_times()).compareTo(Boolean.valueOf(other.isSetDone_times()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetDone_times() || (compareTo = TBaseHelper.compareTo(this.done_times, other.done_times)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserDakaTopic, _Fields> deepCopy2() {
        return new UserDakaTopic(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserDakaTopic$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getTopic_id());
        }
        if (i11 == 2) {
            return Integer.valueOf(getWrong_times());
        }
        if (i11 == 3) {
            return Integer.valueOf(getDone_times());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserDakaTopic$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetTopic_id();
        }
        if (i11 == 2) {
            return isSetWrong_times();
        }
        if (i11 == 3) {
            return isSetDone_times();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserDakaTopic$_Fields[field.ordinal()];
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
                unsetWrong_times();
                return;
            } else {
                setWrong_times(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetDone_times();
        } else {
            setDone_times(((Integer) value).intValue());
        }
    }

    public UserDakaTopic(int topic_id, int wrong_times, int done_times) {
        this();
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        this.wrong_times = wrong_times;
        setWrong_timesIsSet(true);
        this.done_times = done_times;
        setDone_timesIsSet(true);
    }

    public boolean equals(UserDakaTopic that) {
        return that != null && this.topic_id == that.topic_id && this.wrong_times == that.wrong_times && this.done_times == that.done_times;
    }

    public UserDakaTopic(UserDakaTopic other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.topic_id = other.topic_id;
        this.wrong_times = other.wrong_times;
        this.done_times = other.done_times;
    }

    public void validate() throws TException {
    }
}
