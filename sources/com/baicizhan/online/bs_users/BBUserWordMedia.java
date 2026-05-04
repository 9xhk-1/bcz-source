package com.baicizhan.online.bs_users;

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
/* loaded from: classes5.dex */
public class BBUserWordMedia implements TBase<BBUserWordMedia, _Fields>, Serializable, Cloneable, Comparable<BBUserWordMedia> {
    private static final int __FM_VIEW_TIMES_ISSET_ID = 2;
    private static final int __IS_FM_SKIP_ISSET_ID = 4;
    private static final int __IS_TV_SKIP_ISSET_ID = 3;
    private static final int __TOPIC_ID_ISSET_ID = 0;
    private static final int __TV_VIEW_TIMES_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int fm_view_times;
    public boolean is_fm_skip;
    public boolean is_tv_skip;
    private _Fields[] optionals;
    public int topic_id;
    public int tv_view_times;
    private static final TStruct STRUCT_DESC = new TStruct("BBUserWordMedia");
    private static final TField TOPIC_ID_FIELD_DESC = new TField("topic_id", (byte) 8, 1);
    private static final TField TV_VIEW_TIMES_FIELD_DESC = new TField("tv_view_times", (byte) 8, 2);
    private static final TField FM_VIEW_TIMES_FIELD_DESC = new TField("fm_view_times", (byte) 8, 3);
    private static final TField IS_TV_SKIP_FIELD_DESC = new TField("is_tv_skip", (byte) 2, 4);
    private static final TField IS_FM_SKIP_FIELD_DESC = new TField("is_fm_skip", (byte) 2, 5);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_users.BBUserWordMedia$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_users$BBUserWordMedia$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_users$BBUserWordMedia$_Fields = iArr;
            try {
                iArr[_Fields.TOPIC_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BBUserWordMedia$_Fields[_Fields.TV_VIEW_TIMES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BBUserWordMedia$_Fields[_Fields.FM_VIEW_TIMES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BBUserWordMedia$_Fields[_Fields.IS_TV_SKIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BBUserWordMedia$_Fields[_Fields.IS_FM_SKIP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBUserWordMediaStandardScheme extends StandardScheme<BBUserWordMedia> {
        private BBUserWordMediaStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BBUserWordMedia struct) throws TException {
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
                            if (s11 != 4) {
                                if (s11 != 5) {
                                    TProtocolUtil.skip(iprot, b11);
                                } else if (b11 == 2) {
                                    struct.is_fm_skip = iprot.readBool();
                                    struct.setIs_fm_skipIsSet(true);
                                } else {
                                    TProtocolUtil.skip(iprot, b11);
                                }
                            } else if (b11 == 2) {
                                struct.is_tv_skip = iprot.readBool();
                                struct.setIs_tv_skipIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 8) {
                            struct.fm_view_times = iprot.readI32();
                            struct.setFm_view_timesIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.tv_view_times = iprot.readI32();
                        struct.setTv_view_timesIsSet(true);
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
            if (!struct.isSetTv_view_times()) {
                throw new TProtocolException("Required field 'tv_view_times' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetFm_view_times()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'fm_view_times' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BBUserWordMedia struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BBUserWordMedia.STRUCT_DESC);
            oprot.writeFieldBegin(BBUserWordMedia.TOPIC_ID_FIELD_DESC);
            oprot.writeI32(struct.topic_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(BBUserWordMedia.TV_VIEW_TIMES_FIELD_DESC);
            oprot.writeI32(struct.tv_view_times);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(BBUserWordMedia.FM_VIEW_TIMES_FIELD_DESC);
            oprot.writeI32(struct.fm_view_times);
            oprot.writeFieldEnd();
            if (struct.isSetIs_tv_skip()) {
                oprot.writeFieldBegin(BBUserWordMedia.IS_TV_SKIP_FIELD_DESC);
                oprot.writeBool(struct.is_tv_skip);
                oprot.writeFieldEnd();
            }
            if (struct.isSetIs_fm_skip()) {
                oprot.writeFieldBegin(BBUserWordMedia.IS_FM_SKIP_FIELD_DESC);
                oprot.writeBool(struct.is_fm_skip);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBUserWordMediaStandardSchemeFactory implements SchemeFactory {
        private BBUserWordMediaStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBUserWordMediaStandardScheme getScheme() {
            return new BBUserWordMediaStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBUserWordMediaTupleScheme extends TupleScheme<BBUserWordMedia> {
        private BBUserWordMediaTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BBUserWordMedia struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.topic_id = tTupleProtocol.readI32();
            struct.setTopic_idIsSet(true);
            struct.tv_view_times = tTupleProtocol.readI32();
            struct.setTv_view_timesIsSet(true);
            struct.fm_view_times = tTupleProtocol.readI32();
            struct.setFm_view_timesIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(2);
            if (readBitSet.get(0)) {
                struct.is_tv_skip = tTupleProtocol.readBool();
                struct.setIs_tv_skipIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.is_fm_skip = tTupleProtocol.readBool();
                struct.setIs_fm_skipIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BBUserWordMedia struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.topic_id);
            tTupleProtocol.writeI32(struct.tv_view_times);
            tTupleProtocol.writeI32(struct.fm_view_times);
            BitSet bitSet = new BitSet();
            if (struct.isSetIs_tv_skip()) {
                bitSet.set(0);
            }
            if (struct.isSetIs_fm_skip()) {
                bitSet.set(1);
            }
            tTupleProtocol.writeBitSet(bitSet, 2);
            if (struct.isSetIs_tv_skip()) {
                tTupleProtocol.writeBool(struct.is_tv_skip);
            }
            if (struct.isSetIs_fm_skip()) {
                tTupleProtocol.writeBool(struct.is_fm_skip);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBUserWordMediaTupleSchemeFactory implements SchemeFactory {
        private BBUserWordMediaTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBUserWordMediaTupleScheme getScheme() {
            return new BBUserWordMediaTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TOPIC_ID(1, "topic_id"),
        TV_VIEW_TIMES(2, "tv_view_times"),
        FM_VIEW_TIMES(3, "fm_view_times"),
        IS_TV_SKIP(4, "is_tv_skip"),
        IS_FM_SKIP(5, "is_fm_skip");

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
                return TV_VIEW_TIMES;
            }
            if (fieldId == 3) {
                return FM_VIEW_TIMES;
            }
            if (fieldId == 4) {
                return IS_TV_SKIP;
            }
            if (fieldId != 5) {
                return null;
            }
            return IS_FM_SKIP;
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
        hashMap.put(StandardScheme.class, new BBUserWordMediaStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BBUserWordMediaTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TOPIC_ID, (_Fields) new FieldMetaData("topic_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.TV_VIEW_TIMES, (_Fields) new FieldMetaData("tv_view_times", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.FM_VIEW_TIMES, (_Fields) new FieldMetaData("fm_view_times", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.IS_TV_SKIP, (_Fields) new FieldMetaData("is_tv_skip", (byte) 2, new FieldValueMetaData((byte) 2)));
        enumMap.put((EnumMap) _Fields.IS_FM_SKIP, (_Fields) new FieldMetaData("is_fm_skip", (byte) 2, new FieldValueMetaData((byte) 2)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BBUserWordMedia.class, unmodifiableMap);
    }

    public BBUserWordMedia() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.IS_TV_SKIP, _Fields.IS_FM_SKIP};
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
        setTv_view_timesIsSet(false);
        this.tv_view_times = 0;
        setFm_view_timesIsSet(false);
        this.fm_view_times = 0;
        setIs_tv_skipIsSet(false);
        this.is_tv_skip = false;
        setIs_fm_skipIsSet(false);
        this.is_fm_skip = false;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BBUserWordMedia)) {
            return equals((BBUserWordMedia) that);
        }
        return false;
    }

    public int getFm_view_times() {
        return this.fm_view_times;
    }

    public int getTopic_id() {
        return this.topic_id;
    }

    public int getTv_view_times() {
        return this.tv_view_times;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isIs_fm_skip() {
        return this.is_fm_skip;
    }

    public boolean isIs_tv_skip() {
        return this.is_tv_skip;
    }

    public boolean isSetFm_view_times() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetIs_fm_skip() {
        return EncodingUtils.testBit(this.__isset_bitfield, 4);
    }

    public boolean isSetIs_tv_skip() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetTopic_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetTv_view_times() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BBUserWordMedia setFm_view_times(int fm_view_times) {
        this.fm_view_times = fm_view_times;
        setFm_view_timesIsSet(true);
        return this;
    }

    public void setFm_view_timesIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public BBUserWordMedia setIs_fm_skip(boolean is_fm_skip) {
        this.is_fm_skip = is_fm_skip;
        setIs_fm_skipIsSet(true);
        return this;
    }

    public void setIs_fm_skipIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 4, value);
    }

    public BBUserWordMedia setIs_tv_skip(boolean is_tv_skip) {
        this.is_tv_skip = is_tv_skip;
        setIs_tv_skipIsSet(true);
        return this;
    }

    public void setIs_tv_skipIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public BBUserWordMedia setTopic_id(int topic_id) {
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        return this;
    }

    public void setTopic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public BBUserWordMedia setTv_view_times(int tv_view_times) {
        this.tv_view_times = tv_view_times;
        setTv_view_timesIsSet(true);
        return this;
    }

    public void setTv_view_timesIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BBUserWordMedia(");
        sb2.append("topic_id:");
        sb2.append(this.topic_id);
        sb2.append(j2.O);
        sb2.append("tv_view_times:");
        sb2.append(this.tv_view_times);
        sb2.append(j2.O);
        sb2.append("fm_view_times:");
        sb2.append(this.fm_view_times);
        if (isSetIs_tv_skip()) {
            sb2.append(j2.O);
            sb2.append("is_tv_skip:");
            sb2.append(this.is_tv_skip);
        }
        if (isSetIs_fm_skip()) {
            sb2.append(j2.O);
            sb2.append("is_fm_skip:");
            sb2.append(this.is_fm_skip);
        }
        sb2.append(j.f81007d);
        return sb2.toString();
    }

    public void unsetFm_view_times() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetIs_fm_skip() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 4);
    }

    public void unsetIs_tv_skip() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetTopic_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetTv_view_times() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BBUserWordMedia other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo6 = Boolean.valueOf(isSetTopic_id()).compareTo(Boolean.valueOf(other.isSetTopic_id()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetTopic_id() && (compareTo5 = TBaseHelper.compareTo(this.topic_id, other.topic_id)) != 0) {
            return compareTo5;
        }
        int compareTo7 = Boolean.valueOf(isSetTv_view_times()).compareTo(Boolean.valueOf(other.isSetTv_view_times()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetTv_view_times() && (compareTo4 = TBaseHelper.compareTo(this.tv_view_times, other.tv_view_times)) != 0) {
            return compareTo4;
        }
        int compareTo8 = Boolean.valueOf(isSetFm_view_times()).compareTo(Boolean.valueOf(other.isSetFm_view_times()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetFm_view_times() && (compareTo3 = TBaseHelper.compareTo(this.fm_view_times, other.fm_view_times)) != 0) {
            return compareTo3;
        }
        int compareTo9 = Boolean.valueOf(isSetIs_tv_skip()).compareTo(Boolean.valueOf(other.isSetIs_tv_skip()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetIs_tv_skip() && (compareTo2 = TBaseHelper.compareTo(this.is_tv_skip, other.is_tv_skip)) != 0) {
            return compareTo2;
        }
        int compareTo10 = Boolean.valueOf(isSetIs_fm_skip()).compareTo(Boolean.valueOf(other.isSetIs_fm_skip()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!isSetIs_fm_skip() || (compareTo = TBaseHelper.compareTo(this.is_fm_skip, other.is_fm_skip)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BBUserWordMedia, _Fields> deepCopy2() {
        return new BBUserWordMedia(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BBUserWordMedia$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getTopic_id());
        }
        if (i11 == 2) {
            return Integer.valueOf(getTv_view_times());
        }
        if (i11 == 3) {
            return Integer.valueOf(getFm_view_times());
        }
        if (i11 == 4) {
            return Boolean.valueOf(isIs_tv_skip());
        }
        if (i11 == 5) {
            return Boolean.valueOf(isIs_fm_skip());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BBUserWordMedia$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetTopic_id();
        }
        if (i11 == 2) {
            return isSetTv_view_times();
        }
        if (i11 == 3) {
            return isSetFm_view_times();
        }
        if (i11 == 4) {
            return isSetIs_tv_skip();
        }
        if (i11 == 5) {
            return isSetIs_fm_skip();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BBUserWordMedia$_Fields[field.ordinal()];
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
                unsetTv_view_times();
                return;
            } else {
                setTv_view_times(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetFm_view_times();
                return;
            } else {
                setFm_view_times(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 4) {
            if (value == null) {
                unsetIs_tv_skip();
                return;
            } else {
                setIs_tv_skip(((Boolean) value).booleanValue());
                return;
            }
        }
        if (i11 != 5) {
            return;
        }
        if (value == null) {
            unsetIs_fm_skip();
        } else {
            setIs_fm_skip(((Boolean) value).booleanValue());
        }
    }

    public boolean equals(BBUserWordMedia that) {
        if (that == null || this.topic_id != that.topic_id || this.tv_view_times != that.tv_view_times || this.fm_view_times != that.fm_view_times) {
            return false;
        }
        boolean isSetIs_tv_skip = isSetIs_tv_skip();
        boolean isSetIs_tv_skip2 = that.isSetIs_tv_skip();
        if ((isSetIs_tv_skip || isSetIs_tv_skip2) && !(isSetIs_tv_skip && isSetIs_tv_skip2 && this.is_tv_skip == that.is_tv_skip)) {
            return false;
        }
        boolean isSetIs_fm_skip = isSetIs_fm_skip();
        boolean isSetIs_fm_skip2 = that.isSetIs_fm_skip();
        if (isSetIs_fm_skip || isSetIs_fm_skip2) {
            return isSetIs_fm_skip && isSetIs_fm_skip2 && this.is_fm_skip == that.is_fm_skip;
        }
        return true;
    }

    public BBUserWordMedia(int topic_id, int tv_view_times, int fm_view_times) {
        this();
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        this.tv_view_times = tv_view_times;
        setTv_view_timesIsSet(true);
        this.fm_view_times = fm_view_times;
        setFm_view_timesIsSet(true);
    }

    public BBUserWordMedia(BBUserWordMedia other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.IS_TV_SKIP, _Fields.IS_FM_SKIP};
        this.__isset_bitfield = other.__isset_bitfield;
        this.topic_id = other.topic_id;
        this.tv_view_times = other.tv_view_times;
        this.fm_view_times = other.fm_view_times;
        this.is_tv_skip = other.is_tv_skip;
        this.is_fm_skip = other.is_fm_skip;
    }

    public void validate() throws TException {
    }
}
