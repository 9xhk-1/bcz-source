package com.baicizhan.online.resource_api;

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
public class WordMediaUpdateInfo implements TBase<WordMediaUpdateInfo, _Fields>, Serializable, Cloneable, Comparable<WordMediaUpdateInfo> {
    private static final int __FM_UPDATED_AT_ISSET_ID = 1;
    private static final int __POSTER_UPDATED_AT_ISSET_ID = 3;
    private static final int __TOPIC_ID_ISSET_ID = 0;
    private static final int __TV_UPDATED_AT_ISSET_ID = 2;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public long fm_updated_at;
    private _Fields[] optionals;
    public long poster_updated_at;
    public int topic_id;
    public long tv_updated_at;
    private static final TStruct STRUCT_DESC = new TStruct("WordMediaUpdateInfo");
    private static final TField TOPIC_ID_FIELD_DESC = new TField("topic_id", (byte) 8, 1);
    private static final TField FM_UPDATED_AT_FIELD_DESC = new TField("fm_updated_at", (byte) 10, 2);
    private static final TField TV_UPDATED_AT_FIELD_DESC = new TField("tv_updated_at", (byte) 10, 3);
    private static final TField POSTER_UPDATED_AT_FIELD_DESC = new TField("poster_updated_at", (byte) 10, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.resource_api.WordMediaUpdateInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$WordMediaUpdateInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$WordMediaUpdateInfo$_Fields = iArr;
            try {
                iArr[_Fields.TOPIC_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$WordMediaUpdateInfo$_Fields[_Fields.FM_UPDATED_AT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$WordMediaUpdateInfo$_Fields[_Fields.TV_UPDATED_AT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$WordMediaUpdateInfo$_Fields[_Fields.POSTER_UPDATED_AT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WordMediaUpdateInfoStandardScheme extends StandardScheme<WordMediaUpdateInfo> {
        private WordMediaUpdateInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, WordMediaUpdateInfo struct) throws TException {
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
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 10) {
                                struct.poster_updated_at = iprot.readI64();
                                struct.setPoster_updated_atIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 10) {
                            struct.tv_updated_at = iprot.readI64();
                            struct.setTv_updated_atIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 10) {
                        struct.fm_updated_at = iprot.readI64();
                        struct.setFm_updated_atIsSet(true);
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
            if (struct.isSetTopic_id()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'topic_id' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, WordMediaUpdateInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(WordMediaUpdateInfo.STRUCT_DESC);
            oprot.writeFieldBegin(WordMediaUpdateInfo.TOPIC_ID_FIELD_DESC);
            oprot.writeI32(struct.topic_id);
            oprot.writeFieldEnd();
            if (struct.isSetFm_updated_at()) {
                oprot.writeFieldBegin(WordMediaUpdateInfo.FM_UPDATED_AT_FIELD_DESC);
                oprot.writeI64(struct.fm_updated_at);
                oprot.writeFieldEnd();
            }
            if (struct.isSetTv_updated_at()) {
                oprot.writeFieldBegin(WordMediaUpdateInfo.TV_UPDATED_AT_FIELD_DESC);
                oprot.writeI64(struct.tv_updated_at);
                oprot.writeFieldEnd();
            }
            if (struct.isSetPoster_updated_at()) {
                oprot.writeFieldBegin(WordMediaUpdateInfo.POSTER_UPDATED_AT_FIELD_DESC);
                oprot.writeI64(struct.poster_updated_at);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WordMediaUpdateInfoStandardSchemeFactory implements SchemeFactory {
        private WordMediaUpdateInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public WordMediaUpdateInfoStandardScheme getScheme() {
            return new WordMediaUpdateInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WordMediaUpdateInfoTupleScheme extends TupleScheme<WordMediaUpdateInfo> {
        private WordMediaUpdateInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, WordMediaUpdateInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.topic_id = tTupleProtocol.readI32();
            struct.setTopic_idIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(3);
            if (readBitSet.get(0)) {
                struct.fm_updated_at = tTupleProtocol.readI64();
                struct.setFm_updated_atIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.tv_updated_at = tTupleProtocol.readI64();
                struct.setTv_updated_atIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.poster_updated_at = tTupleProtocol.readI64();
                struct.setPoster_updated_atIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, WordMediaUpdateInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.topic_id);
            BitSet bitSet = new BitSet();
            if (struct.isSetFm_updated_at()) {
                bitSet.set(0);
            }
            if (struct.isSetTv_updated_at()) {
                bitSet.set(1);
            }
            if (struct.isSetPoster_updated_at()) {
                bitSet.set(2);
            }
            tTupleProtocol.writeBitSet(bitSet, 3);
            if (struct.isSetFm_updated_at()) {
                tTupleProtocol.writeI64(struct.fm_updated_at);
            }
            if (struct.isSetTv_updated_at()) {
                tTupleProtocol.writeI64(struct.tv_updated_at);
            }
            if (struct.isSetPoster_updated_at()) {
                tTupleProtocol.writeI64(struct.poster_updated_at);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WordMediaUpdateInfoTupleSchemeFactory implements SchemeFactory {
        private WordMediaUpdateInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public WordMediaUpdateInfoTupleScheme getScheme() {
            return new WordMediaUpdateInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TOPIC_ID(1, "topic_id"),
        FM_UPDATED_AT(2, "fm_updated_at"),
        TV_UPDATED_AT(3, "tv_updated_at"),
        POSTER_UPDATED_AT(4, "poster_updated_at");

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
                return FM_UPDATED_AT;
            }
            if (fieldId == 3) {
                return TV_UPDATED_AT;
            }
            if (fieldId != 4) {
                return null;
            }
            return POSTER_UPDATED_AT;
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
        hashMap.put(StandardScheme.class, new WordMediaUpdateInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new WordMediaUpdateInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TOPIC_ID, (_Fields) new FieldMetaData("topic_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.FM_UPDATED_AT, (_Fields) new FieldMetaData("fm_updated_at", (byte) 2, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.TV_UPDATED_AT, (_Fields) new FieldMetaData("tv_updated_at", (byte) 2, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.POSTER_UPDATED_AT, (_Fields) new FieldMetaData("poster_updated_at", (byte) 2, new FieldValueMetaData((byte) 10)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(WordMediaUpdateInfo.class, unmodifiableMap);
    }

    public WordMediaUpdateInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.FM_UPDATED_AT, _Fields.TV_UPDATED_AT, _Fields.POSTER_UPDATED_AT};
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
        setFm_updated_atIsSet(false);
        this.fm_updated_at = 0L;
        setTv_updated_atIsSet(false);
        this.tv_updated_at = 0L;
        setPoster_updated_atIsSet(false);
        this.poster_updated_at = 0L;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof WordMediaUpdateInfo)) {
            return equals((WordMediaUpdateInfo) that);
        }
        return false;
    }

    public long getFm_updated_at() {
        return this.fm_updated_at;
    }

    public long getPoster_updated_at() {
        return this.poster_updated_at;
    }

    public int getTopic_id() {
        return this.topic_id;
    }

    public long getTv_updated_at() {
        return this.tv_updated_at;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetFm_updated_at() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetPoster_updated_at() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetTopic_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetTv_updated_at() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public WordMediaUpdateInfo setFm_updated_at(long fm_updated_at) {
        this.fm_updated_at = fm_updated_at;
        setFm_updated_atIsSet(true);
        return this;
    }

    public void setFm_updated_atIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public WordMediaUpdateInfo setPoster_updated_at(long poster_updated_at) {
        this.poster_updated_at = poster_updated_at;
        setPoster_updated_atIsSet(true);
        return this;
    }

    public void setPoster_updated_atIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public WordMediaUpdateInfo setTopic_id(int topic_id) {
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        return this;
    }

    public void setTopic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public WordMediaUpdateInfo setTv_updated_at(long tv_updated_at) {
        this.tv_updated_at = tv_updated_at;
        setTv_updated_atIsSet(true);
        return this;
    }

    public void setTv_updated_atIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("WordMediaUpdateInfo(");
        sb2.append("topic_id:");
        sb2.append(this.topic_id);
        if (isSetFm_updated_at()) {
            sb2.append(j2.O);
            sb2.append("fm_updated_at:");
            sb2.append(this.fm_updated_at);
        }
        if (isSetTv_updated_at()) {
            sb2.append(j2.O);
            sb2.append("tv_updated_at:");
            sb2.append(this.tv_updated_at);
        }
        if (isSetPoster_updated_at()) {
            sb2.append(j2.O);
            sb2.append("poster_updated_at:");
            sb2.append(this.poster_updated_at);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetFm_updated_at() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetPoster_updated_at() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetTopic_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetTv_updated_at() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(WordMediaUpdateInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetTopic_id()).compareTo(Boolean.valueOf(other.isSetTopic_id()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetTopic_id() && (compareTo4 = TBaseHelper.compareTo(this.topic_id, other.topic_id)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetFm_updated_at()).compareTo(Boolean.valueOf(other.isSetFm_updated_at()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetFm_updated_at() && (compareTo3 = TBaseHelper.compareTo(this.fm_updated_at, other.fm_updated_at)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetTv_updated_at()).compareTo(Boolean.valueOf(other.isSetTv_updated_at()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetTv_updated_at() && (compareTo2 = TBaseHelper.compareTo(this.tv_updated_at, other.tv_updated_at)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetPoster_updated_at()).compareTo(Boolean.valueOf(other.isSetPoster_updated_at()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetPoster_updated_at() || (compareTo = TBaseHelper.compareTo(this.poster_updated_at, other.poster_updated_at)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<WordMediaUpdateInfo, _Fields> deepCopy2() {
        return new WordMediaUpdateInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$WordMediaUpdateInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getTopic_id());
        }
        if (i11 == 2) {
            return Long.valueOf(getFm_updated_at());
        }
        if (i11 == 3) {
            return Long.valueOf(getTv_updated_at());
        }
        if (i11 == 4) {
            return Long.valueOf(getPoster_updated_at());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$WordMediaUpdateInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetTopic_id();
        }
        if (i11 == 2) {
            return isSetFm_updated_at();
        }
        if (i11 == 3) {
            return isSetTv_updated_at();
        }
        if (i11 == 4) {
            return isSetPoster_updated_at();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$WordMediaUpdateInfo$_Fields[field.ordinal()];
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
                unsetFm_updated_at();
                return;
            } else {
                setFm_updated_at(((Long) value).longValue());
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetTv_updated_at();
                return;
            } else {
                setTv_updated_at(((Long) value).longValue());
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetPoster_updated_at();
        } else {
            setPoster_updated_at(((Long) value).longValue());
        }
    }

    public boolean equals(WordMediaUpdateInfo that) {
        if (that == null || this.topic_id != that.topic_id) {
            return false;
        }
        boolean isSetFm_updated_at = isSetFm_updated_at();
        boolean isSetFm_updated_at2 = that.isSetFm_updated_at();
        if ((isSetFm_updated_at || isSetFm_updated_at2) && !(isSetFm_updated_at && isSetFm_updated_at2 && this.fm_updated_at == that.fm_updated_at)) {
            return false;
        }
        boolean isSetTv_updated_at = isSetTv_updated_at();
        boolean isSetTv_updated_at2 = that.isSetTv_updated_at();
        if ((isSetTv_updated_at || isSetTv_updated_at2) && !(isSetTv_updated_at && isSetTv_updated_at2 && this.tv_updated_at == that.tv_updated_at)) {
            return false;
        }
        boolean isSetPoster_updated_at = isSetPoster_updated_at();
        boolean isSetPoster_updated_at2 = that.isSetPoster_updated_at();
        if (isSetPoster_updated_at || isSetPoster_updated_at2) {
            return isSetPoster_updated_at && isSetPoster_updated_at2 && this.poster_updated_at == that.poster_updated_at;
        }
        return true;
    }

    public WordMediaUpdateInfo(int topic_id) {
        this();
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
    }

    public WordMediaUpdateInfo(WordMediaUpdateInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.FM_UPDATED_AT, _Fields.TV_UPDATED_AT, _Fields.POSTER_UPDATED_AT};
        this.__isset_bitfield = other.__isset_bitfield;
        this.topic_id = other.topic_id;
        this.fm_updated_at = other.fm_updated_at;
        this.tv_updated_at = other.tv_updated_at;
        this.poster_updated_at = other.poster_updated_at;
    }

    public void validate() throws TException {
    }
}
