package com.baicizhan.online.resource_api;

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
public class SynAntInfo implements TBase<SynAntInfo, _Fields>, Serializable, Cloneable, Comparable<SynAntInfo> {
    private static final int __CHN_MEAN_ID_ISSET_ID = 2;
    private static final int __SYN_ANT_ID_ISSET_ID = 0;
    private static final int __SYN_ANT_TOPIC_ID_ISSET_ID = 3;
    private static final int __TOPIC_ID_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public long chn_mean_id;
    public String syn_ant;
    public long syn_ant_id;
    public int syn_ant_topic_id;
    public int topic_id;
    private static final TStruct STRUCT_DESC = new TStruct("SynAntInfo");
    private static final TField SYN_ANT_ID_FIELD_DESC = new TField("syn_ant_id", (byte) 10, 1);
    private static final TField TOPIC_ID_FIELD_DESC = new TField("topic_id", (byte) 8, 2);
    private static final TField CHN_MEAN_ID_FIELD_DESC = new TField("chn_mean_id", (byte) 10, 3);
    private static final TField SYN_ANT_TOPIC_ID_FIELD_DESC = new TField("syn_ant_topic_id", (byte) 8, 4);
    private static final TField SYN_ANT_FIELD_DESC = new TField("syn_ant", (byte) 11, 5);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.resource_api.SynAntInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$SynAntInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$SynAntInfo$_Fields = iArr;
            try {
                iArr[_Fields.SYN_ANT_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$SynAntInfo$_Fields[_Fields.TOPIC_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$SynAntInfo$_Fields[_Fields.CHN_MEAN_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$SynAntInfo$_Fields[_Fields.SYN_ANT_TOPIC_ID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$SynAntInfo$_Fields[_Fields.SYN_ANT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SynAntInfoStandardScheme extends StandardScheme<SynAntInfo> {
        private SynAntInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, SynAntInfo struct) throws TException {
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
                                } else if (b11 == 11) {
                                    struct.syn_ant = iprot.readString();
                                    struct.setSyn_antIsSet(true);
                                } else {
                                    TProtocolUtil.skip(iprot, b11);
                                }
                            } else if (b11 == 8) {
                                struct.syn_ant_topic_id = iprot.readI32();
                                struct.setSyn_ant_topic_idIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 10) {
                            struct.chn_mean_id = iprot.readI64();
                            struct.setChn_mean_idIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.topic_id = iprot.readI32();
                        struct.setTopic_idIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 10) {
                    struct.syn_ant_id = iprot.readI64();
                    struct.setSyn_ant_idIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetSyn_ant_id()) {
                throw new TProtocolException("Required field 'syn_ant_id' was not found in serialized data! Struct: " + toString());
            }
            if (!struct.isSetTopic_id()) {
                throw new TProtocolException("Required field 'topic_id' was not found in serialized data! Struct: " + toString());
            }
            if (!struct.isSetChn_mean_id()) {
                throw new TProtocolException("Required field 'chn_mean_id' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetSyn_ant_topic_id()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'syn_ant_topic_id' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, SynAntInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(SynAntInfo.STRUCT_DESC);
            oprot.writeFieldBegin(SynAntInfo.SYN_ANT_ID_FIELD_DESC);
            oprot.writeI64(struct.syn_ant_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(SynAntInfo.TOPIC_ID_FIELD_DESC);
            oprot.writeI32(struct.topic_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(SynAntInfo.CHN_MEAN_ID_FIELD_DESC);
            oprot.writeI64(struct.chn_mean_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(SynAntInfo.SYN_ANT_TOPIC_ID_FIELD_DESC);
            oprot.writeI32(struct.syn_ant_topic_id);
            oprot.writeFieldEnd();
            if (struct.syn_ant != null) {
                oprot.writeFieldBegin(SynAntInfo.SYN_ANT_FIELD_DESC);
                oprot.writeString(struct.syn_ant);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SynAntInfoStandardSchemeFactory implements SchemeFactory {
        private SynAntInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SynAntInfoStandardScheme getScheme() {
            return new SynAntInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SynAntInfoTupleScheme extends TupleScheme<SynAntInfo> {
        private SynAntInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, SynAntInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.syn_ant_id = tTupleProtocol.readI64();
            struct.setSyn_ant_idIsSet(true);
            struct.topic_id = tTupleProtocol.readI32();
            struct.setTopic_idIsSet(true);
            struct.chn_mean_id = tTupleProtocol.readI64();
            struct.setChn_mean_idIsSet(true);
            struct.syn_ant_topic_id = tTupleProtocol.readI32();
            struct.setSyn_ant_topic_idIsSet(true);
            struct.syn_ant = tTupleProtocol.readString();
            struct.setSyn_antIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, SynAntInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI64(struct.syn_ant_id);
            tTupleProtocol.writeI32(struct.topic_id);
            tTupleProtocol.writeI64(struct.chn_mean_id);
            tTupleProtocol.writeI32(struct.syn_ant_topic_id);
            tTupleProtocol.writeString(struct.syn_ant);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SynAntInfoTupleSchemeFactory implements SchemeFactory {
        private SynAntInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SynAntInfoTupleScheme getScheme() {
            return new SynAntInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        SYN_ANT_ID(1, "syn_ant_id"),
        TOPIC_ID(2, "topic_id"),
        CHN_MEAN_ID(3, "chn_mean_id"),
        SYN_ANT_TOPIC_ID(4, "syn_ant_topic_id"),
        SYN_ANT(5, "syn_ant");

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
                return SYN_ANT_ID;
            }
            if (fieldId == 2) {
                return TOPIC_ID;
            }
            if (fieldId == 3) {
                return CHN_MEAN_ID;
            }
            if (fieldId == 4) {
                return SYN_ANT_TOPIC_ID;
            }
            if (fieldId != 5) {
                return null;
            }
            return SYN_ANT;
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
        hashMap.put(StandardScheme.class, new SynAntInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new SynAntInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.SYN_ANT_ID, (_Fields) new FieldMetaData("syn_ant_id", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.TOPIC_ID, (_Fields) new FieldMetaData("topic_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.CHN_MEAN_ID, (_Fields) new FieldMetaData("chn_mean_id", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.SYN_ANT_TOPIC_ID, (_Fields) new FieldMetaData("syn_ant_topic_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.SYN_ANT, (_Fields) new FieldMetaData("syn_ant", (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(SynAntInfo.class, unmodifiableMap);
    }

    public SynAntInfo() {
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
        setSyn_ant_idIsSet(false);
        this.syn_ant_id = 0L;
        setTopic_idIsSet(false);
        this.topic_id = 0;
        setChn_mean_idIsSet(false);
        this.chn_mean_id = 0L;
        setSyn_ant_topic_idIsSet(false);
        this.syn_ant_topic_id = 0;
        this.syn_ant = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof SynAntInfo)) {
            return equals((SynAntInfo) that);
        }
        return false;
    }

    public long getChn_mean_id() {
        return this.chn_mean_id;
    }

    public String getSyn_ant() {
        return this.syn_ant;
    }

    public long getSyn_ant_id() {
        return this.syn_ant_id;
    }

    public int getSyn_ant_topic_id() {
        return this.syn_ant_topic_id;
    }

    public int getTopic_id() {
        return this.topic_id;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetChn_mean_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetSyn_ant() {
        return this.syn_ant != null;
    }

    public boolean isSetSyn_ant_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetSyn_ant_topic_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetTopic_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public SynAntInfo setChn_mean_id(long chn_mean_id) {
        this.chn_mean_id = chn_mean_id;
        setChn_mean_idIsSet(true);
        return this;
    }

    public void setChn_mean_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public SynAntInfo setSyn_ant(String syn_ant) {
        this.syn_ant = syn_ant;
        return this;
    }

    public void setSyn_antIsSet(boolean value) {
        if (value) {
            return;
        }
        this.syn_ant = null;
    }

    public SynAntInfo setSyn_ant_id(long syn_ant_id) {
        this.syn_ant_id = syn_ant_id;
        setSyn_ant_idIsSet(true);
        return this;
    }

    public void setSyn_ant_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public SynAntInfo setSyn_ant_topic_id(int syn_ant_topic_id) {
        this.syn_ant_topic_id = syn_ant_topic_id;
        setSyn_ant_topic_idIsSet(true);
        return this;
    }

    public void setSyn_ant_topic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public SynAntInfo setTopic_id(int topic_id) {
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        return this;
    }

    public void setTopic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SynAntInfo(");
        sb2.append("syn_ant_id:");
        sb2.append(this.syn_ant_id);
        sb2.append(j2.O);
        sb2.append("topic_id:");
        sb2.append(this.topic_id);
        sb2.append(j2.O);
        sb2.append("chn_mean_id:");
        sb2.append(this.chn_mean_id);
        sb2.append(j2.O);
        sb2.append("syn_ant_topic_id:");
        sb2.append(this.syn_ant_topic_id);
        sb2.append(j2.O);
        sb2.append("syn_ant:");
        String str = this.syn_ant;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetChn_mean_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetSyn_ant() {
        this.syn_ant = null;
    }

    public void unsetSyn_ant_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetSyn_ant_topic_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetTopic_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void validate() throws TException {
        if (this.syn_ant != null) {
            return;
        }
        throw new TProtocolException("Required field 'syn_ant' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(SynAntInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo6 = Boolean.valueOf(isSetSyn_ant_id()).compareTo(Boolean.valueOf(other.isSetSyn_ant_id()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetSyn_ant_id() && (compareTo5 = TBaseHelper.compareTo(this.syn_ant_id, other.syn_ant_id)) != 0) {
            return compareTo5;
        }
        int compareTo7 = Boolean.valueOf(isSetTopic_id()).compareTo(Boolean.valueOf(other.isSetTopic_id()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetTopic_id() && (compareTo4 = TBaseHelper.compareTo(this.topic_id, other.topic_id)) != 0) {
            return compareTo4;
        }
        int compareTo8 = Boolean.valueOf(isSetChn_mean_id()).compareTo(Boolean.valueOf(other.isSetChn_mean_id()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetChn_mean_id() && (compareTo3 = TBaseHelper.compareTo(this.chn_mean_id, other.chn_mean_id)) != 0) {
            return compareTo3;
        }
        int compareTo9 = Boolean.valueOf(isSetSyn_ant_topic_id()).compareTo(Boolean.valueOf(other.isSetSyn_ant_topic_id()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetSyn_ant_topic_id() && (compareTo2 = TBaseHelper.compareTo(this.syn_ant_topic_id, other.syn_ant_topic_id)) != 0) {
            return compareTo2;
        }
        int compareTo10 = Boolean.valueOf(isSetSyn_ant()).compareTo(Boolean.valueOf(other.isSetSyn_ant()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!isSetSyn_ant() || (compareTo = TBaseHelper.compareTo(this.syn_ant, other.syn_ant)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<SynAntInfo, _Fields> deepCopy2() {
        return new SynAntInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$SynAntInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Long.valueOf(getSyn_ant_id());
        }
        if (i11 == 2) {
            return Integer.valueOf(getTopic_id());
        }
        if (i11 == 3) {
            return Long.valueOf(getChn_mean_id());
        }
        if (i11 == 4) {
            return Integer.valueOf(getSyn_ant_topic_id());
        }
        if (i11 == 5) {
            return getSyn_ant();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$SynAntInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetSyn_ant_id();
        }
        if (i11 == 2) {
            return isSetTopic_id();
        }
        if (i11 == 3) {
            return isSetChn_mean_id();
        }
        if (i11 == 4) {
            return isSetSyn_ant_topic_id();
        }
        if (i11 == 5) {
            return isSetSyn_ant();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$SynAntInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetSyn_ant_id();
                return;
            } else {
                setSyn_ant_id(((Long) value).longValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetTopic_id();
                return;
            } else {
                setTopic_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetChn_mean_id();
                return;
            } else {
                setChn_mean_id(((Long) value).longValue());
                return;
            }
        }
        if (i11 == 4) {
            if (value == null) {
                unsetSyn_ant_topic_id();
                return;
            } else {
                setSyn_ant_topic_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 5) {
            return;
        }
        if (value == null) {
            unsetSyn_ant();
        } else {
            setSyn_ant((String) value);
        }
    }

    public SynAntInfo(long syn_ant_id, int topic_id, long chn_mean_id, int syn_ant_topic_id, String syn_ant) {
        this();
        this.syn_ant_id = syn_ant_id;
        setSyn_ant_idIsSet(true);
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        this.chn_mean_id = chn_mean_id;
        setChn_mean_idIsSet(true);
        this.syn_ant_topic_id = syn_ant_topic_id;
        setSyn_ant_topic_idIsSet(true);
        this.syn_ant = syn_ant;
    }

    public boolean equals(SynAntInfo that) {
        if (that == null || this.syn_ant_id != that.syn_ant_id || this.topic_id != that.topic_id || this.chn_mean_id != that.chn_mean_id || this.syn_ant_topic_id != that.syn_ant_topic_id) {
            return false;
        }
        boolean isSetSyn_ant = isSetSyn_ant();
        boolean isSetSyn_ant2 = that.isSetSyn_ant();
        if (isSetSyn_ant || isSetSyn_ant2) {
            return isSetSyn_ant && isSetSyn_ant2 && this.syn_ant.equals(that.syn_ant);
        }
        return true;
    }

    public SynAntInfo(SynAntInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.syn_ant_id = other.syn_ant_id;
        this.topic_id = other.topic_id;
        this.chn_mean_id = other.chn_mean_id;
        this.syn_ant_topic_id = other.syn_ant_topic_id;
        if (other.isSetSyn_ant()) {
            this.syn_ant = other.syn_ant;
        }
    }
}
