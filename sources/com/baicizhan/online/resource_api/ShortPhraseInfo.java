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
public class ShortPhraseInfo implements TBase<ShortPhraseInfo, _Fields>, Serializable, Cloneable, Comparable<ShortPhraseInfo> {
    private static final int __CHN_MEAN_ID_ISSET_ID = 2;
    private static final int __ID_ISSET_ID = 0;
    private static final int __SHORT_PHRASE_TOPIC_ID_ISSET_ID = 3;
    private static final int __TOPIC_ID_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public long chn_mean_id;

    /* renamed from: id, reason: collision with root package name */
    public long f28161id;
    private _Fields[] optionals;
    public String short_phrase;
    public int short_phrase_topic_id;
    public String short_phrase_trans;
    public int topic_id;
    private static final TStruct STRUCT_DESC = new TStruct("ShortPhraseInfo");
    private static final TField ID_FIELD_DESC = new TField("id", (byte) 10, 1);
    private static final TField TOPIC_ID_FIELD_DESC = new TField("topic_id", (byte) 8, 2);
    private static final TField CHN_MEAN_ID_FIELD_DESC = new TField("chn_mean_id", (byte) 10, 3);
    private static final TField SHORT_PHRASE_FIELD_DESC = new TField("short_phrase", (byte) 11, 4);
    private static final TField SHORT_PHRASE_TRANS_FIELD_DESC = new TField("short_phrase_trans", (byte) 11, 5);
    private static final TField SHORT_PHRASE_TOPIC_ID_FIELD_DESC = new TField("short_phrase_topic_id", (byte) 8, 6);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.resource_api.ShortPhraseInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$ShortPhraseInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$ShortPhraseInfo$_Fields = iArr;
            try {
                iArr[_Fields.ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ShortPhraseInfo$_Fields[_Fields.TOPIC_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ShortPhraseInfo$_Fields[_Fields.CHN_MEAN_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ShortPhraseInfo$_Fields[_Fields.SHORT_PHRASE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ShortPhraseInfo$_Fields[_Fields.SHORT_PHRASE_TRANS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ShortPhraseInfo$_Fields[_Fields.SHORT_PHRASE_TOPIC_ID.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ShortPhraseInfoStandardScheme extends StandardScheme<ShortPhraseInfo> {
        private ShortPhraseInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, ShortPhraseInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetId()) {
                        throw new TProtocolException("Required field 'id' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetTopic_id()) {
                        throw new TProtocolException("Required field 'topic_id' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetChn_mean_id()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'chn_mean_id' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.f28161id = iprot.readI64();
                            struct.setIdIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.topic_id = iprot.readI32();
                            struct.setTopic_idIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.chn_mean_id = iprot.readI64();
                            struct.setChn_mean_idIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.short_phrase = iprot.readString();
                            struct.setShort_phraseIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.short_phrase_trans = iprot.readString();
                            struct.setShort_phrase_transIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.short_phrase_topic_id = iprot.readI32();
                            struct.setShort_phrase_topic_idIsSet(true);
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
        public void write(TProtocol oprot, ShortPhraseInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(ShortPhraseInfo.STRUCT_DESC);
            oprot.writeFieldBegin(ShortPhraseInfo.ID_FIELD_DESC);
            oprot.writeI64(struct.f28161id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(ShortPhraseInfo.TOPIC_ID_FIELD_DESC);
            oprot.writeI32(struct.topic_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(ShortPhraseInfo.CHN_MEAN_ID_FIELD_DESC);
            oprot.writeI64(struct.chn_mean_id);
            oprot.writeFieldEnd();
            if (struct.short_phrase != null) {
                oprot.writeFieldBegin(ShortPhraseInfo.SHORT_PHRASE_FIELD_DESC);
                oprot.writeString(struct.short_phrase);
                oprot.writeFieldEnd();
            }
            if (struct.short_phrase_trans != null) {
                oprot.writeFieldBegin(ShortPhraseInfo.SHORT_PHRASE_TRANS_FIELD_DESC);
                oprot.writeString(struct.short_phrase_trans);
                oprot.writeFieldEnd();
            }
            if (struct.isSetShort_phrase_topic_id()) {
                oprot.writeFieldBegin(ShortPhraseInfo.SHORT_PHRASE_TOPIC_ID_FIELD_DESC);
                oprot.writeI32(struct.short_phrase_topic_id);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ShortPhraseInfoStandardSchemeFactory implements SchemeFactory {
        private ShortPhraseInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ShortPhraseInfoStandardScheme getScheme() {
            return new ShortPhraseInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ShortPhraseInfoTupleScheme extends TupleScheme<ShortPhraseInfo> {
        private ShortPhraseInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, ShortPhraseInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.f28161id = tTupleProtocol.readI64();
            struct.setIdIsSet(true);
            struct.topic_id = tTupleProtocol.readI32();
            struct.setTopic_idIsSet(true);
            struct.chn_mean_id = tTupleProtocol.readI64();
            struct.setChn_mean_idIsSet(true);
            struct.short_phrase = tTupleProtocol.readString();
            struct.setShort_phraseIsSet(true);
            struct.short_phrase_trans = tTupleProtocol.readString();
            struct.setShort_phrase_transIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                struct.short_phrase_topic_id = tTupleProtocol.readI32();
                struct.setShort_phrase_topic_idIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, ShortPhraseInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI64(struct.f28161id);
            tTupleProtocol.writeI32(struct.topic_id);
            tTupleProtocol.writeI64(struct.chn_mean_id);
            tTupleProtocol.writeString(struct.short_phrase);
            tTupleProtocol.writeString(struct.short_phrase_trans);
            BitSet bitSet = new BitSet();
            if (struct.isSetShort_phrase_topic_id()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetShort_phrase_topic_id()) {
                tTupleProtocol.writeI32(struct.short_phrase_topic_id);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ShortPhraseInfoTupleSchemeFactory implements SchemeFactory {
        private ShortPhraseInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ShortPhraseInfoTupleScheme getScheme() {
            return new ShortPhraseInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ID(1, "id"),
        TOPIC_ID(2, "topic_id"),
        CHN_MEAN_ID(3, "chn_mean_id"),
        SHORT_PHRASE(4, "short_phrase"),
        SHORT_PHRASE_TRANS(5, "short_phrase_trans"),
        SHORT_PHRASE_TOPIC_ID(6, "short_phrase_topic_id");

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
                    return ID;
                case 2:
                    return TOPIC_ID;
                case 3:
                    return CHN_MEAN_ID;
                case 4:
                    return SHORT_PHRASE;
                case 5:
                    return SHORT_PHRASE_TRANS;
                case 6:
                    return SHORT_PHRASE_TOPIC_ID;
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
        hashMap.put(StandardScheme.class, new ShortPhraseInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new ShortPhraseInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ID, (_Fields) new FieldMetaData("id", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.TOPIC_ID, (_Fields) new FieldMetaData("topic_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.CHN_MEAN_ID, (_Fields) new FieldMetaData("chn_mean_id", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.SHORT_PHRASE, (_Fields) new FieldMetaData("short_phrase", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SHORT_PHRASE_TRANS, (_Fields) new FieldMetaData("short_phrase_trans", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SHORT_PHRASE_TOPIC_ID, (_Fields) new FieldMetaData("short_phrase_topic_id", (byte) 2, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(ShortPhraseInfo.class, unmodifiableMap);
    }

    public ShortPhraseInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.SHORT_PHRASE_TOPIC_ID};
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
        setIdIsSet(false);
        this.f28161id = 0L;
        setTopic_idIsSet(false);
        this.topic_id = 0;
        setChn_mean_idIsSet(false);
        this.chn_mean_id = 0L;
        this.short_phrase = null;
        this.short_phrase_trans = null;
        setShort_phrase_topic_idIsSet(false);
        this.short_phrase_topic_id = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof ShortPhraseInfo)) {
            return equals((ShortPhraseInfo) that);
        }
        return false;
    }

    public long getChn_mean_id() {
        return this.chn_mean_id;
    }

    public long getId() {
        return this.f28161id;
    }

    public String getShort_phrase() {
        return this.short_phrase;
    }

    public int getShort_phrase_topic_id() {
        return this.short_phrase_topic_id;
    }

    public String getShort_phrase_trans() {
        return this.short_phrase_trans;
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

    public boolean isSetId() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetShort_phrase() {
        return this.short_phrase != null;
    }

    public boolean isSetShort_phrase_topic_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetShort_phrase_trans() {
        return this.short_phrase_trans != null;
    }

    public boolean isSetTopic_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public ShortPhraseInfo setChn_mean_id(long chn_mean_id) {
        this.chn_mean_id = chn_mean_id;
        setChn_mean_idIsSet(true);
        return this;
    }

    public void setChn_mean_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public ShortPhraseInfo setId(long id2) {
        this.f28161id = id2;
        setIdIsSet(true);
        return this;
    }

    public void setIdIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public ShortPhraseInfo setShort_phrase(String short_phrase) {
        this.short_phrase = short_phrase;
        return this;
    }

    public void setShort_phraseIsSet(boolean value) {
        if (value) {
            return;
        }
        this.short_phrase = null;
    }

    public ShortPhraseInfo setShort_phrase_topic_id(int short_phrase_topic_id) {
        this.short_phrase_topic_id = short_phrase_topic_id;
        setShort_phrase_topic_idIsSet(true);
        return this;
    }

    public void setShort_phrase_topic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public ShortPhraseInfo setShort_phrase_trans(String short_phrase_trans) {
        this.short_phrase_trans = short_phrase_trans;
        return this;
    }

    public void setShort_phrase_transIsSet(boolean value) {
        if (value) {
            return;
        }
        this.short_phrase_trans = null;
    }

    public ShortPhraseInfo setTopic_id(int topic_id) {
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        return this;
    }

    public void setTopic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ShortPhraseInfo(");
        sb2.append("id:");
        sb2.append(this.f28161id);
        sb2.append(j2.O);
        sb2.append("topic_id:");
        sb2.append(this.topic_id);
        sb2.append(j2.O);
        sb2.append("chn_mean_id:");
        sb2.append(this.chn_mean_id);
        sb2.append(j2.O);
        sb2.append("short_phrase:");
        String str = this.short_phrase;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("short_phrase_trans:");
        String str2 = this.short_phrase_trans;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        if (isSetShort_phrase_topic_id()) {
            sb2.append(j2.O);
            sb2.append("short_phrase_topic_id:");
            sb2.append(this.short_phrase_topic_id);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetChn_mean_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetId() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetShort_phrase() {
        this.short_phrase = null;
    }

    public void unsetShort_phrase_topic_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetShort_phrase_trans() {
        this.short_phrase_trans = null;
    }

    public void unsetTopic_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void validate() throws TException {
        if (this.short_phrase == null) {
            throw new TProtocolException("Required field 'short_phrase' was not present! Struct: " + toString());
        }
        if (this.short_phrase_trans != null) {
            return;
        }
        throw new TProtocolException("Required field 'short_phrase_trans' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(ShortPhraseInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo7 = Boolean.valueOf(isSetId()).compareTo(Boolean.valueOf(other.isSetId()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetId() && (compareTo6 = TBaseHelper.compareTo(this.f28161id, other.f28161id)) != 0) {
            return compareTo6;
        }
        int compareTo8 = Boolean.valueOf(isSetTopic_id()).compareTo(Boolean.valueOf(other.isSetTopic_id()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetTopic_id() && (compareTo5 = TBaseHelper.compareTo(this.topic_id, other.topic_id)) != 0) {
            return compareTo5;
        }
        int compareTo9 = Boolean.valueOf(isSetChn_mean_id()).compareTo(Boolean.valueOf(other.isSetChn_mean_id()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetChn_mean_id() && (compareTo4 = TBaseHelper.compareTo(this.chn_mean_id, other.chn_mean_id)) != 0) {
            return compareTo4;
        }
        int compareTo10 = Boolean.valueOf(isSetShort_phrase()).compareTo(Boolean.valueOf(other.isSetShort_phrase()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetShort_phrase() && (compareTo3 = TBaseHelper.compareTo(this.short_phrase, other.short_phrase)) != 0) {
            return compareTo3;
        }
        int compareTo11 = Boolean.valueOf(isSetShort_phrase_trans()).compareTo(Boolean.valueOf(other.isSetShort_phrase_trans()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetShort_phrase_trans() && (compareTo2 = TBaseHelper.compareTo(this.short_phrase_trans, other.short_phrase_trans)) != 0) {
            return compareTo2;
        }
        int compareTo12 = Boolean.valueOf(isSetShort_phrase_topic_id()).compareTo(Boolean.valueOf(other.isSetShort_phrase_topic_id()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (!isSetShort_phrase_topic_id() || (compareTo = TBaseHelper.compareTo(this.short_phrase_topic_id, other.short_phrase_topic_id)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<ShortPhraseInfo, _Fields> deepCopy2() {
        return new ShortPhraseInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ShortPhraseInfo$_Fields[field.ordinal()]) {
            case 1:
                return Long.valueOf(getId());
            case 2:
                return Integer.valueOf(getTopic_id());
            case 3:
                return Long.valueOf(getChn_mean_id());
            case 4:
                return getShort_phrase();
            case 5:
                return getShort_phrase_trans();
            case 6:
                return Integer.valueOf(getShort_phrase_topic_id());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ShortPhraseInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetId();
            case 2:
                return isSetTopic_id();
            case 3:
                return isSetChn_mean_id();
            case 4:
                return isSetShort_phrase();
            case 5:
                return isSetShort_phrase_trans();
            case 6:
                return isSetShort_phrase_topic_id();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ShortPhraseInfo$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setId(((Long) value).longValue());
                    break;
                } else {
                    unsetId();
                    break;
                }
            case 2:
                if (value != null) {
                    setTopic_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetTopic_id();
                    break;
                }
            case 3:
                if (value != null) {
                    setChn_mean_id(((Long) value).longValue());
                    break;
                } else {
                    unsetChn_mean_id();
                    break;
                }
            case 4:
                if (value != null) {
                    setShort_phrase((String) value);
                    break;
                } else {
                    unsetShort_phrase();
                    break;
                }
            case 5:
                if (value != null) {
                    setShort_phrase_trans((String) value);
                    break;
                } else {
                    unsetShort_phrase_trans();
                    break;
                }
            case 6:
                if (value != null) {
                    setShort_phrase_topic_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetShort_phrase_topic_id();
                    break;
                }
        }
    }

    public boolean equals(ShortPhraseInfo that) {
        if (that == null || this.f28161id != that.f28161id || this.topic_id != that.topic_id || this.chn_mean_id != that.chn_mean_id) {
            return false;
        }
        boolean isSetShort_phrase = isSetShort_phrase();
        boolean isSetShort_phrase2 = that.isSetShort_phrase();
        if ((isSetShort_phrase || isSetShort_phrase2) && !(isSetShort_phrase && isSetShort_phrase2 && this.short_phrase.equals(that.short_phrase))) {
            return false;
        }
        boolean isSetShort_phrase_trans = isSetShort_phrase_trans();
        boolean isSetShort_phrase_trans2 = that.isSetShort_phrase_trans();
        if ((isSetShort_phrase_trans || isSetShort_phrase_trans2) && !(isSetShort_phrase_trans && isSetShort_phrase_trans2 && this.short_phrase_trans.equals(that.short_phrase_trans))) {
            return false;
        }
        boolean isSetShort_phrase_topic_id = isSetShort_phrase_topic_id();
        boolean isSetShort_phrase_topic_id2 = that.isSetShort_phrase_topic_id();
        if (isSetShort_phrase_topic_id || isSetShort_phrase_topic_id2) {
            return isSetShort_phrase_topic_id && isSetShort_phrase_topic_id2 && this.short_phrase_topic_id == that.short_phrase_topic_id;
        }
        return true;
    }

    public ShortPhraseInfo(long id2, int topic_id, long chn_mean_id, String short_phrase, String short_phrase_trans) {
        this();
        this.f28161id = id2;
        setIdIsSet(true);
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        this.chn_mean_id = chn_mean_id;
        setChn_mean_idIsSet(true);
        this.short_phrase = short_phrase;
        this.short_phrase_trans = short_phrase_trans;
    }

    public ShortPhraseInfo(ShortPhraseInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.SHORT_PHRASE_TOPIC_ID};
        this.__isset_bitfield = other.__isset_bitfield;
        this.f28161id = other.f28161id;
        this.topic_id = other.topic_id;
        this.chn_mean_id = other.chn_mean_id;
        if (other.isSetShort_phrase()) {
            this.short_phrase = other.short_phrase;
        }
        if (other.isSetShort_phrase_trans()) {
            this.short_phrase_trans = other.short_phrase_trans;
        }
        this.short_phrase_topic_id = other.short_phrase_topic_id;
    }
}
