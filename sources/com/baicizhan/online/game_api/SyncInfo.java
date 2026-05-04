package com.baicizhan.online.game_api;

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
import org.apache.thrift.meta_data.StructMetaData;
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
public class SyncInfo implements TBase<SyncInfo, _Fields>, Serializable, Cloneable, Comparable<SyncInfo> {
    private static final int __CURRENT_BOOK_ID_ISSET_ID = 5;
    private static final int __ISLAND_VERSION_ISSET_ID = 0;
    private static final int __PLAN_VERSION_ISSET_ID = 3;
    private static final int __RESOURCE_VERSION_ISSET_ID = 7;
    private static final int __ROADMAP_VERSION_ISSET_ID = 1;
    private static final int __SENTENCESKUID_ISSET_ID = 6;
    private static final int __SERVER_TIME_ISSET_ID = 4;
    private static final int __STUDY_RECORD_VERSION_ISSET_ID = 2;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int current_book_id;
    public long island_version;
    private _Fields[] optionals;
    public long plan_version;
    public int resource_version;
    public long roadmap_version;
    public int sentenceSkuId;
    public long server_time;
    public long study_record_version;
    public UserDataInfo user_data_info;
    private static final TStruct STRUCT_DESC = new TStruct("SyncInfo");
    private static final TField ISLAND_VERSION_FIELD_DESC = new TField("island_version", (byte) 10, 1);
    private static final TField ROADMAP_VERSION_FIELD_DESC = new TField("roadmap_version", (byte) 10, 2);
    private static final TField STUDY_RECORD_VERSION_FIELD_DESC = new TField("study_record_version", (byte) 10, 3);
    private static final TField PLAN_VERSION_FIELD_DESC = new TField("plan_version", (byte) 10, 4);
    private static final TField SERVER_TIME_FIELD_DESC = new TField("server_time", (byte) 10, 5);
    private static final TField CURRENT_BOOK_ID_FIELD_DESC = new TField("current_book_id", (byte) 8, 6);
    private static final TField USER_DATA_INFO_FIELD_DESC = new TField("user_data_info", (byte) 12, 7);
    private static final TField SENTENCE_SKU_ID_FIELD_DESC = new TField("sentenceSkuId", (byte) 8, 8);
    private static final TField RESOURCE_VERSION_FIELD_DESC = new TField("resource_version", (byte) 8, 9);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.SyncInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$SyncInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$SyncInfo$_Fields = iArr;
            try {
                iArr[_Fields.ISLAND_VERSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$SyncInfo$_Fields[_Fields.ROADMAP_VERSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$SyncInfo$_Fields[_Fields.STUDY_RECORD_VERSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$SyncInfo$_Fields[_Fields.PLAN_VERSION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$SyncInfo$_Fields[_Fields.SERVER_TIME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$SyncInfo$_Fields[_Fields.CURRENT_BOOK_ID.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$SyncInfo$_Fields[_Fields.USER_DATA_INFO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$SyncInfo$_Fields[_Fields.SENTENCE_SKU_ID.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$SyncInfo$_Fields[_Fields.RESOURCE_VERSION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SyncInfoStandardScheme extends StandardScheme<SyncInfo> {
        private SyncInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, SyncInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetIsland_version()) {
                        throw new TProtocolException("Required field 'island_version' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetRoadmap_version()) {
                        throw new TProtocolException("Required field 'roadmap_version' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetStudy_record_version()) {
                        throw new TProtocolException("Required field 'study_record_version' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetPlan_version()) {
                        throw new TProtocolException("Required field 'plan_version' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetServer_time()) {
                        throw new TProtocolException("Required field 'server_time' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetCurrent_book_id()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'current_book_id' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.island_version = iprot.readI64();
                            struct.setIsland_versionIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.roadmap_version = iprot.readI64();
                            struct.setRoadmap_versionIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.study_record_version = iprot.readI64();
                            struct.setStudy_record_versionIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.plan_version = iprot.readI64();
                            struct.setPlan_versionIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.server_time = iprot.readI64();
                            struct.setServer_timeIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.current_book_id = iprot.readI32();
                            struct.setCurrent_book_idIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            UserDataInfo userDataInfo = new UserDataInfo();
                            struct.user_data_info = userDataInfo;
                            userDataInfo.read(iprot);
                            struct.setUser_data_infoIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.sentenceSkuId = iprot.readI32();
                            struct.setSentenceSkuIdIsSet(true);
                            break;
                        }
                    case 9:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.resource_version = iprot.readI32();
                            struct.setResource_versionIsSet(true);
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
        public void write(TProtocol oprot, SyncInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(SyncInfo.STRUCT_DESC);
            oprot.writeFieldBegin(SyncInfo.ISLAND_VERSION_FIELD_DESC);
            oprot.writeI64(struct.island_version);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(SyncInfo.ROADMAP_VERSION_FIELD_DESC);
            oprot.writeI64(struct.roadmap_version);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(SyncInfo.STUDY_RECORD_VERSION_FIELD_DESC);
            oprot.writeI64(struct.study_record_version);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(SyncInfo.PLAN_VERSION_FIELD_DESC);
            oprot.writeI64(struct.plan_version);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(SyncInfo.SERVER_TIME_FIELD_DESC);
            oprot.writeI64(struct.server_time);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(SyncInfo.CURRENT_BOOK_ID_FIELD_DESC);
            oprot.writeI32(struct.current_book_id);
            oprot.writeFieldEnd();
            if (struct.user_data_info != null && struct.isSetUser_data_info()) {
                oprot.writeFieldBegin(SyncInfo.USER_DATA_INFO_FIELD_DESC);
                struct.user_data_info.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.isSetSentenceSkuId()) {
                oprot.writeFieldBegin(SyncInfo.SENTENCE_SKU_ID_FIELD_DESC);
                oprot.writeI32(struct.sentenceSkuId);
                oprot.writeFieldEnd();
            }
            if (struct.isSetResource_version()) {
                oprot.writeFieldBegin(SyncInfo.RESOURCE_VERSION_FIELD_DESC);
                oprot.writeI32(struct.resource_version);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SyncInfoStandardSchemeFactory implements SchemeFactory {
        private SyncInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SyncInfoStandardScheme getScheme() {
            return new SyncInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SyncInfoTupleScheme extends TupleScheme<SyncInfo> {
        private SyncInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, SyncInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.island_version = tTupleProtocol.readI64();
            struct.setIsland_versionIsSet(true);
            struct.roadmap_version = tTupleProtocol.readI64();
            struct.setRoadmap_versionIsSet(true);
            struct.study_record_version = tTupleProtocol.readI64();
            struct.setStudy_record_versionIsSet(true);
            struct.plan_version = tTupleProtocol.readI64();
            struct.setPlan_versionIsSet(true);
            struct.server_time = tTupleProtocol.readI64();
            struct.setServer_timeIsSet(true);
            struct.current_book_id = tTupleProtocol.readI32();
            struct.setCurrent_book_idIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(3);
            if (readBitSet.get(0)) {
                UserDataInfo userDataInfo = new UserDataInfo();
                struct.user_data_info = userDataInfo;
                userDataInfo.read(tTupleProtocol);
                struct.setUser_data_infoIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.sentenceSkuId = tTupleProtocol.readI32();
                struct.setSentenceSkuIdIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.resource_version = tTupleProtocol.readI32();
                struct.setResource_versionIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, SyncInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI64(struct.island_version);
            tTupleProtocol.writeI64(struct.roadmap_version);
            tTupleProtocol.writeI64(struct.study_record_version);
            tTupleProtocol.writeI64(struct.plan_version);
            tTupleProtocol.writeI64(struct.server_time);
            tTupleProtocol.writeI32(struct.current_book_id);
            BitSet bitSet = new BitSet();
            if (struct.isSetUser_data_info()) {
                bitSet.set(0);
            }
            if (struct.isSetSentenceSkuId()) {
                bitSet.set(1);
            }
            if (struct.isSetResource_version()) {
                bitSet.set(2);
            }
            tTupleProtocol.writeBitSet(bitSet, 3);
            if (struct.isSetUser_data_info()) {
                struct.user_data_info.write(tTupleProtocol);
            }
            if (struct.isSetSentenceSkuId()) {
                tTupleProtocol.writeI32(struct.sentenceSkuId);
            }
            if (struct.isSetResource_version()) {
                tTupleProtocol.writeI32(struct.resource_version);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SyncInfoTupleSchemeFactory implements SchemeFactory {
        private SyncInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SyncInfoTupleScheme getScheme() {
            return new SyncInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ISLAND_VERSION(1, "island_version"),
        ROADMAP_VERSION(2, "roadmap_version"),
        STUDY_RECORD_VERSION(3, "study_record_version"),
        PLAN_VERSION(4, "plan_version"),
        SERVER_TIME(5, "server_time"),
        CURRENT_BOOK_ID(6, "current_book_id"),
        USER_DATA_INFO(7, "user_data_info"),
        SENTENCE_SKU_ID(8, "sentenceSkuId"),
        RESOURCE_VERSION(9, "resource_version");

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
                    return ISLAND_VERSION;
                case 2:
                    return ROADMAP_VERSION;
                case 3:
                    return STUDY_RECORD_VERSION;
                case 4:
                    return PLAN_VERSION;
                case 5:
                    return SERVER_TIME;
                case 6:
                    return CURRENT_BOOK_ID;
                case 7:
                    return USER_DATA_INFO;
                case 8:
                    return SENTENCE_SKU_ID;
                case 9:
                    return RESOURCE_VERSION;
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
        hashMap.put(StandardScheme.class, new SyncInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new SyncInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ISLAND_VERSION, (_Fields) new FieldMetaData("island_version", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.ROADMAP_VERSION, (_Fields) new FieldMetaData("roadmap_version", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.STUDY_RECORD_VERSION, (_Fields) new FieldMetaData("study_record_version", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.PLAN_VERSION, (_Fields) new FieldMetaData("plan_version", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.SERVER_TIME, (_Fields) new FieldMetaData("server_time", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.CURRENT_BOOK_ID, (_Fields) new FieldMetaData("current_book_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.USER_DATA_INFO, (_Fields) new FieldMetaData("user_data_info", (byte) 2, new StructMetaData((byte) 12, UserDataInfo.class)));
        enumMap.put((EnumMap) _Fields.SENTENCE_SKU_ID, (_Fields) new FieldMetaData("sentenceSkuId", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.RESOURCE_VERSION, (_Fields) new FieldMetaData("resource_version", (byte) 2, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(SyncInfo.class, unmodifiableMap);
    }

    public SyncInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.USER_DATA_INFO, _Fields.SENTENCE_SKU_ID, _Fields.RESOURCE_VERSION};
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
        setIsland_versionIsSet(false);
        this.island_version = 0L;
        setRoadmap_versionIsSet(false);
        this.roadmap_version = 0L;
        setStudy_record_versionIsSet(false);
        this.study_record_version = 0L;
        setPlan_versionIsSet(false);
        this.plan_version = 0L;
        setServer_timeIsSet(false);
        this.server_time = 0L;
        setCurrent_book_idIsSet(false);
        this.current_book_id = 0;
        this.user_data_info = null;
        setSentenceSkuIdIsSet(false);
        this.sentenceSkuId = 0;
        setResource_versionIsSet(false);
        this.resource_version = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof SyncInfo)) {
            return equals((SyncInfo) that);
        }
        return false;
    }

    public int getCurrent_book_id() {
        return this.current_book_id;
    }

    public long getIsland_version() {
        return this.island_version;
    }

    public long getPlan_version() {
        return this.plan_version;
    }

    public int getResource_version() {
        return this.resource_version;
    }

    public long getRoadmap_version() {
        return this.roadmap_version;
    }

    public int getSentenceSkuId() {
        return this.sentenceSkuId;
    }

    public long getServer_time() {
        return this.server_time;
    }

    public long getStudy_record_version() {
        return this.study_record_version;
    }

    public UserDataInfo getUser_data_info() {
        return this.user_data_info;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetCurrent_book_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 5);
    }

    public boolean isSetIsland_version() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetPlan_version() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetResource_version() {
        return EncodingUtils.testBit(this.__isset_bitfield, 7);
    }

    public boolean isSetRoadmap_version() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetSentenceSkuId() {
        return EncodingUtils.testBit(this.__isset_bitfield, 6);
    }

    public boolean isSetServer_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 4);
    }

    public boolean isSetStudy_record_version() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetUser_data_info() {
        return this.user_data_info != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public SyncInfo setCurrent_book_id(int current_book_id) {
        this.current_book_id = current_book_id;
        setCurrent_book_idIsSet(true);
        return this;
    }

    public void setCurrent_book_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 5, value);
    }

    public SyncInfo setIsland_version(long island_version) {
        this.island_version = island_version;
        setIsland_versionIsSet(true);
        return this;
    }

    public void setIsland_versionIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public SyncInfo setPlan_version(long plan_version) {
        this.plan_version = plan_version;
        setPlan_versionIsSet(true);
        return this;
    }

    public void setPlan_versionIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public SyncInfo setResource_version(int resource_version) {
        this.resource_version = resource_version;
        setResource_versionIsSet(true);
        return this;
    }

    public void setResource_versionIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 7, value);
    }

    public SyncInfo setRoadmap_version(long roadmap_version) {
        this.roadmap_version = roadmap_version;
        setRoadmap_versionIsSet(true);
        return this;
    }

    public void setRoadmap_versionIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public SyncInfo setSentenceSkuId(int sentenceSkuId) {
        this.sentenceSkuId = sentenceSkuId;
        setSentenceSkuIdIsSet(true);
        return this;
    }

    public void setSentenceSkuIdIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 6, value);
    }

    public SyncInfo setServer_time(long server_time) {
        this.server_time = server_time;
        setServer_timeIsSet(true);
        return this;
    }

    public void setServer_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 4, value);
    }

    public SyncInfo setStudy_record_version(long study_record_version) {
        this.study_record_version = study_record_version;
        setStudy_record_versionIsSet(true);
        return this;
    }

    public void setStudy_record_versionIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public SyncInfo setUser_data_info(UserDataInfo user_data_info) {
        this.user_data_info = user_data_info;
        return this;
    }

    public void setUser_data_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.user_data_info = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SyncInfo(");
        sb2.append("island_version:");
        sb2.append(this.island_version);
        sb2.append(j2.O);
        sb2.append("roadmap_version:");
        sb2.append(this.roadmap_version);
        sb2.append(j2.O);
        sb2.append("study_record_version:");
        sb2.append(this.study_record_version);
        sb2.append(j2.O);
        sb2.append("plan_version:");
        sb2.append(this.plan_version);
        sb2.append(j2.O);
        sb2.append("server_time:");
        sb2.append(this.server_time);
        sb2.append(j2.O);
        sb2.append("current_book_id:");
        sb2.append(this.current_book_id);
        if (isSetUser_data_info()) {
            sb2.append(j2.O);
            sb2.append("user_data_info:");
            UserDataInfo userDataInfo = this.user_data_info;
            if (userDataInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(userDataInfo);
            }
        }
        if (isSetSentenceSkuId()) {
            sb2.append(j2.O);
            sb2.append("sentenceSkuId:");
            sb2.append(this.sentenceSkuId);
        }
        if (isSetResource_version()) {
            sb2.append(j2.O);
            sb2.append("resource_version:");
            sb2.append(this.resource_version);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetCurrent_book_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 5);
    }

    public void unsetIsland_version() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetPlan_version() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetResource_version() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 7);
    }

    public void unsetRoadmap_version() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetSentenceSkuId() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 6);
    }

    public void unsetServer_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 4);
    }

    public void unsetStudy_record_version() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetUser_data_info() {
        this.user_data_info = null;
    }

    public void validate() throws TException {
        UserDataInfo userDataInfo = this.user_data_info;
        if (userDataInfo != null) {
            userDataInfo.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(SyncInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        int compareTo7;
        int compareTo8;
        int compareTo9;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo10 = Boolean.valueOf(isSetIsland_version()).compareTo(Boolean.valueOf(other.isSetIsland_version()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetIsland_version() && (compareTo9 = TBaseHelper.compareTo(this.island_version, other.island_version)) != 0) {
            return compareTo9;
        }
        int compareTo11 = Boolean.valueOf(isSetRoadmap_version()).compareTo(Boolean.valueOf(other.isSetRoadmap_version()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetRoadmap_version() && (compareTo8 = TBaseHelper.compareTo(this.roadmap_version, other.roadmap_version)) != 0) {
            return compareTo8;
        }
        int compareTo12 = Boolean.valueOf(isSetStudy_record_version()).compareTo(Boolean.valueOf(other.isSetStudy_record_version()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetStudy_record_version() && (compareTo7 = TBaseHelper.compareTo(this.study_record_version, other.study_record_version)) != 0) {
            return compareTo7;
        }
        int compareTo13 = Boolean.valueOf(isSetPlan_version()).compareTo(Boolean.valueOf(other.isSetPlan_version()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetPlan_version() && (compareTo6 = TBaseHelper.compareTo(this.plan_version, other.plan_version)) != 0) {
            return compareTo6;
        }
        int compareTo14 = Boolean.valueOf(isSetServer_time()).compareTo(Boolean.valueOf(other.isSetServer_time()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (isSetServer_time() && (compareTo5 = TBaseHelper.compareTo(this.server_time, other.server_time)) != 0) {
            return compareTo5;
        }
        int compareTo15 = Boolean.valueOf(isSetCurrent_book_id()).compareTo(Boolean.valueOf(other.isSetCurrent_book_id()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (isSetCurrent_book_id() && (compareTo4 = TBaseHelper.compareTo(this.current_book_id, other.current_book_id)) != 0) {
            return compareTo4;
        }
        int compareTo16 = Boolean.valueOf(isSetUser_data_info()).compareTo(Boolean.valueOf(other.isSetUser_data_info()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (isSetUser_data_info() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.user_data_info, (Comparable) other.user_data_info)) != 0) {
            return compareTo3;
        }
        int compareTo17 = Boolean.valueOf(isSetSentenceSkuId()).compareTo(Boolean.valueOf(other.isSetSentenceSkuId()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (isSetSentenceSkuId() && (compareTo2 = TBaseHelper.compareTo(this.sentenceSkuId, other.sentenceSkuId)) != 0) {
            return compareTo2;
        }
        int compareTo18 = Boolean.valueOf(isSetResource_version()).compareTo(Boolean.valueOf(other.isSetResource_version()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (!isSetResource_version() || (compareTo = TBaseHelper.compareTo(this.resource_version, other.resource_version)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<SyncInfo, _Fields> deepCopy2() {
        return new SyncInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$SyncInfo$_Fields[field.ordinal()]) {
            case 1:
                return Long.valueOf(getIsland_version());
            case 2:
                return Long.valueOf(getRoadmap_version());
            case 3:
                return Long.valueOf(getStudy_record_version());
            case 4:
                return Long.valueOf(getPlan_version());
            case 5:
                return Long.valueOf(getServer_time());
            case 6:
                return Integer.valueOf(getCurrent_book_id());
            case 7:
                return getUser_data_info();
            case 8:
                return Integer.valueOf(getSentenceSkuId());
            case 9:
                return Integer.valueOf(getResource_version());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$SyncInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetIsland_version();
            case 2:
                return isSetRoadmap_version();
            case 3:
                return isSetStudy_record_version();
            case 4:
                return isSetPlan_version();
            case 5:
                return isSetServer_time();
            case 6:
                return isSetCurrent_book_id();
            case 7:
                return isSetUser_data_info();
            case 8:
                return isSetSentenceSkuId();
            case 9:
                return isSetResource_version();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$SyncInfo$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setIsland_version(((Long) value).longValue());
                    break;
                } else {
                    unsetIsland_version();
                    break;
                }
            case 2:
                if (value != null) {
                    setRoadmap_version(((Long) value).longValue());
                    break;
                } else {
                    unsetRoadmap_version();
                    break;
                }
            case 3:
                if (value != null) {
                    setStudy_record_version(((Long) value).longValue());
                    break;
                } else {
                    unsetStudy_record_version();
                    break;
                }
            case 4:
                if (value != null) {
                    setPlan_version(((Long) value).longValue());
                    break;
                } else {
                    unsetPlan_version();
                    break;
                }
            case 5:
                if (value != null) {
                    setServer_time(((Long) value).longValue());
                    break;
                } else {
                    unsetServer_time();
                    break;
                }
            case 6:
                if (value != null) {
                    setCurrent_book_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetCurrent_book_id();
                    break;
                }
            case 7:
                if (value != null) {
                    setUser_data_info((UserDataInfo) value);
                    break;
                } else {
                    unsetUser_data_info();
                    break;
                }
            case 8:
                if (value != null) {
                    setSentenceSkuId(((Integer) value).intValue());
                    break;
                } else {
                    unsetSentenceSkuId();
                    break;
                }
            case 9:
                if (value != null) {
                    setResource_version(((Integer) value).intValue());
                    break;
                } else {
                    unsetResource_version();
                    break;
                }
        }
    }

    public boolean equals(SyncInfo that) {
        if (that == null || this.island_version != that.island_version || this.roadmap_version != that.roadmap_version || this.study_record_version != that.study_record_version || this.plan_version != that.plan_version || this.server_time != that.server_time || this.current_book_id != that.current_book_id) {
            return false;
        }
        boolean isSetUser_data_info = isSetUser_data_info();
        boolean isSetUser_data_info2 = that.isSetUser_data_info();
        if ((isSetUser_data_info || isSetUser_data_info2) && !(isSetUser_data_info && isSetUser_data_info2 && this.user_data_info.equals(that.user_data_info))) {
            return false;
        }
        boolean isSetSentenceSkuId = isSetSentenceSkuId();
        boolean isSetSentenceSkuId2 = that.isSetSentenceSkuId();
        if ((isSetSentenceSkuId || isSetSentenceSkuId2) && !(isSetSentenceSkuId && isSetSentenceSkuId2 && this.sentenceSkuId == that.sentenceSkuId)) {
            return false;
        }
        boolean isSetResource_version = isSetResource_version();
        boolean isSetResource_version2 = that.isSetResource_version();
        if (isSetResource_version || isSetResource_version2) {
            return isSetResource_version && isSetResource_version2 && this.resource_version == that.resource_version;
        }
        return true;
    }

    public SyncInfo(long island_version, long roadmap_version, long study_record_version, long plan_version, long server_time, int current_book_id) {
        this();
        this.island_version = island_version;
        setIsland_versionIsSet(true);
        this.roadmap_version = roadmap_version;
        setRoadmap_versionIsSet(true);
        this.study_record_version = study_record_version;
        setStudy_record_versionIsSet(true);
        this.plan_version = plan_version;
        setPlan_versionIsSet(true);
        this.server_time = server_time;
        setServer_timeIsSet(true);
        this.current_book_id = current_book_id;
        setCurrent_book_idIsSet(true);
    }

    public SyncInfo(SyncInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.USER_DATA_INFO, _Fields.SENTENCE_SKU_ID, _Fields.RESOURCE_VERSION};
        this.__isset_bitfield = other.__isset_bitfield;
        this.island_version = other.island_version;
        this.roadmap_version = other.roadmap_version;
        this.study_record_version = other.study_record_version;
        this.plan_version = other.plan_version;
        this.server_time = other.server_time;
        this.current_book_id = other.current_book_id;
        if (other.isSetUser_data_info()) {
            this.user_data_info = new UserDataInfo(other.user_data_info);
        }
        this.sentenceSkuId = other.sentenceSkuId;
        this.resource_version = other.resource_version;
    }
}
