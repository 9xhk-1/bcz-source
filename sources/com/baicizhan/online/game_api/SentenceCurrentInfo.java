package com.baicizhan.online.game_api;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TBase;
import org.apache.thrift.TBaseHelper;
import org.apache.thrift.TException;
import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TField;
import org.apache.thrift.protocol.TList;
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
public class SentenceCurrentInfo implements TBase<SentenceCurrentInfo, _Fields>, Serializable, Cloneable, Comparable<SentenceCurrentInfo> {
    private static final int __SKUID_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public SentenceBuildingStatus buildingStatus;
    public WordEnergyInfo energy_info;
    public List<Integer> finishedLessonIds;
    public List<Integer> hideLessonIds;
    public String latestContentVersion;
    private _Fields[] optionals;
    public int skuId;
    private static final TStruct STRUCT_DESC = new TStruct("SentenceCurrentInfo");
    private static final TField SKU_ID_FIELD_DESC = new TField("skuId", (byte) 8, 1);
    private static final TField BUILDING_STATUS_FIELD_DESC = new TField("buildingStatus", (byte) 12, 2);
    private static final TField LATEST_CONTENT_VERSION_FIELD_DESC = new TField("latestContentVersion", (byte) 11, 3);
    private static final TField ENERGY_INFO_FIELD_DESC = new TField("energy_info", (byte) 12, 4);
    private static final TField FINISHED_LESSON_IDS_FIELD_DESC = new TField("finishedLessonIds", (byte) 15, 5);
    private static final TField HIDE_LESSON_IDS_FIELD_DESC = new TField("hideLessonIds", (byte) 15, 6);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.SentenceCurrentInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$SentenceCurrentInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$SentenceCurrentInfo$_Fields = iArr;
            try {
                iArr[_Fields.SKU_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$SentenceCurrentInfo$_Fields[_Fields.BUILDING_STATUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$SentenceCurrentInfo$_Fields[_Fields.LATEST_CONTENT_VERSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$SentenceCurrentInfo$_Fields[_Fields.ENERGY_INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$SentenceCurrentInfo$_Fields[_Fields.FINISHED_LESSON_IDS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$SentenceCurrentInfo$_Fields[_Fields.HIDE_LESSON_IDS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SentenceCurrentInfoStandardScheme extends StandardScheme<SentenceCurrentInfo> {
        private SentenceCurrentInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, SentenceCurrentInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (struct.isSetSkuId()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'skuId' was not found in serialized data! Struct: " + toString());
                }
                int i11 = 0;
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.skuId = iprot.readI32();
                            struct.setSkuIdIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            SentenceBuildingStatus sentenceBuildingStatus = new SentenceBuildingStatus();
                            struct.buildingStatus = sentenceBuildingStatus;
                            sentenceBuildingStatus.read(iprot);
                            struct.setBuildingStatusIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.latestContentVersion = iprot.readString();
                            struct.setLatestContentVersionIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            WordEnergyInfo wordEnergyInfo = new WordEnergyInfo();
                            struct.energy_info = wordEnergyInfo;
                            wordEnergyInfo.read(iprot);
                            struct.setEnergy_infoIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 15) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            TList readListBegin = iprot.readListBegin();
                            struct.finishedLessonIds = new ArrayList(readListBegin.size);
                            while (i11 < readListBegin.size) {
                                struct.finishedLessonIds.add(Integer.valueOf(iprot.readI32()));
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setFinishedLessonIdsIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 15) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            TList readListBegin2 = iprot.readListBegin();
                            struct.hideLessonIds = new ArrayList(readListBegin2.size);
                            while (i11 < readListBegin2.size) {
                                struct.hideLessonIds.add(Integer.valueOf(iprot.readI32()));
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setHideLessonIdsIsSet(true);
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
        public void write(TProtocol oprot, SentenceCurrentInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(SentenceCurrentInfo.STRUCT_DESC);
            oprot.writeFieldBegin(SentenceCurrentInfo.SKU_ID_FIELD_DESC);
            oprot.writeI32(struct.skuId);
            oprot.writeFieldEnd();
            if (struct.buildingStatus != null) {
                oprot.writeFieldBegin(SentenceCurrentInfo.BUILDING_STATUS_FIELD_DESC);
                struct.buildingStatus.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.latestContentVersion != null) {
                oprot.writeFieldBegin(SentenceCurrentInfo.LATEST_CONTENT_VERSION_FIELD_DESC);
                oprot.writeString(struct.latestContentVersion);
                oprot.writeFieldEnd();
            }
            if (struct.energy_info != null) {
                oprot.writeFieldBegin(SentenceCurrentInfo.ENERGY_INFO_FIELD_DESC);
                struct.energy_info.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.finishedLessonIds != null && struct.isSetFinishedLessonIds()) {
                oprot.writeFieldBegin(SentenceCurrentInfo.FINISHED_LESSON_IDS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 8, struct.finishedLessonIds.size()));
                Iterator<Integer> it = struct.finishedLessonIds.iterator();
                while (it.hasNext()) {
                    oprot.writeI32(it.next().intValue());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.hideLessonIds != null && struct.isSetHideLessonIds()) {
                oprot.writeFieldBegin(SentenceCurrentInfo.HIDE_LESSON_IDS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 8, struct.hideLessonIds.size()));
                Iterator<Integer> it2 = struct.hideLessonIds.iterator();
                while (it2.hasNext()) {
                    oprot.writeI32(it2.next().intValue());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SentenceCurrentInfoStandardSchemeFactory implements SchemeFactory {
        private SentenceCurrentInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SentenceCurrentInfoStandardScheme getScheme() {
            return new SentenceCurrentInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SentenceCurrentInfoTupleScheme extends TupleScheme<SentenceCurrentInfo> {
        private SentenceCurrentInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, SentenceCurrentInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.skuId = tTupleProtocol.readI32();
            struct.setSkuIdIsSet(true);
            SentenceBuildingStatus sentenceBuildingStatus = new SentenceBuildingStatus();
            struct.buildingStatus = sentenceBuildingStatus;
            sentenceBuildingStatus.read(tTupleProtocol);
            struct.setBuildingStatusIsSet(true);
            struct.latestContentVersion = tTupleProtocol.readString();
            struct.setLatestContentVersionIsSet(true);
            WordEnergyInfo wordEnergyInfo = new WordEnergyInfo();
            struct.energy_info = wordEnergyInfo;
            wordEnergyInfo.read(tTupleProtocol);
            struct.setEnergy_infoIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(2);
            if (readBitSet.get(0)) {
                TList tList = new TList((byte) 8, tTupleProtocol.readI32());
                struct.finishedLessonIds = new ArrayList(tList.size);
                for (int i11 = 0; i11 < tList.size; i11++) {
                    struct.finishedLessonIds.add(Integer.valueOf(tTupleProtocol.readI32()));
                }
                struct.setFinishedLessonIdsIsSet(true);
            }
            if (readBitSet.get(1)) {
                TList tList2 = new TList((byte) 8, tTupleProtocol.readI32());
                struct.hideLessonIds = new ArrayList(tList2.size);
                for (int i12 = 0; i12 < tList2.size; i12++) {
                    struct.hideLessonIds.add(Integer.valueOf(tTupleProtocol.readI32()));
                }
                struct.setHideLessonIdsIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, SentenceCurrentInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.skuId);
            struct.buildingStatus.write(tTupleProtocol);
            tTupleProtocol.writeString(struct.latestContentVersion);
            struct.energy_info.write(tTupleProtocol);
            BitSet bitSet = new BitSet();
            if (struct.isSetFinishedLessonIds()) {
                bitSet.set(0);
            }
            if (struct.isSetHideLessonIds()) {
                bitSet.set(1);
            }
            tTupleProtocol.writeBitSet(bitSet, 2);
            if (struct.isSetFinishedLessonIds()) {
                tTupleProtocol.writeI32(struct.finishedLessonIds.size());
                Iterator<Integer> it = struct.finishedLessonIds.iterator();
                while (it.hasNext()) {
                    tTupleProtocol.writeI32(it.next().intValue());
                }
            }
            if (struct.isSetHideLessonIds()) {
                tTupleProtocol.writeI32(struct.hideLessonIds.size());
                Iterator<Integer> it2 = struct.hideLessonIds.iterator();
                while (it2.hasNext()) {
                    tTupleProtocol.writeI32(it2.next().intValue());
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SentenceCurrentInfoTupleSchemeFactory implements SchemeFactory {
        private SentenceCurrentInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SentenceCurrentInfoTupleScheme getScheme() {
            return new SentenceCurrentInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        SKU_ID(1, "skuId"),
        BUILDING_STATUS(2, "buildingStatus"),
        LATEST_CONTENT_VERSION(3, "latestContentVersion"),
        ENERGY_INFO(4, "energy_info"),
        FINISHED_LESSON_IDS(5, "finishedLessonIds"),
        HIDE_LESSON_IDS(6, "hideLessonIds");

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
                    return SKU_ID;
                case 2:
                    return BUILDING_STATUS;
                case 3:
                    return LATEST_CONTENT_VERSION;
                case 4:
                    return ENERGY_INFO;
                case 5:
                    return FINISHED_LESSON_IDS;
                case 6:
                    return HIDE_LESSON_IDS;
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
        hashMap.put(StandardScheme.class, new SentenceCurrentInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new SentenceCurrentInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.SKU_ID, (_Fields) new FieldMetaData("skuId", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.BUILDING_STATUS, (_Fields) new FieldMetaData("buildingStatus", (byte) 1, new StructMetaData((byte) 12, SentenceBuildingStatus.class)));
        enumMap.put((EnumMap) _Fields.LATEST_CONTENT_VERSION, (_Fields) new FieldMetaData("latestContentVersion", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ENERGY_INFO, (_Fields) new FieldMetaData("energy_info", (byte) 1, new StructMetaData((byte) 12, WordEnergyInfo.class)));
        enumMap.put((EnumMap) _Fields.FINISHED_LESSON_IDS, (_Fields) new FieldMetaData("finishedLessonIds", (byte) 2, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 8))));
        enumMap.put((EnumMap) _Fields.HIDE_LESSON_IDS, (_Fields) new FieldMetaData("hideLessonIds", (byte) 2, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 8))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(SentenceCurrentInfo.class, unmodifiableMap);
    }

    public SentenceCurrentInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.FINISHED_LESSON_IDS, _Fields.HIDE_LESSON_IDS};
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

    public void addToFinishedLessonIds(int elem) {
        if (this.finishedLessonIds == null) {
            this.finishedLessonIds = new ArrayList();
        }
        this.finishedLessonIds.add(Integer.valueOf(elem));
    }

    public void addToHideLessonIds(int elem) {
        if (this.hideLessonIds == null) {
            this.hideLessonIds = new ArrayList();
        }
        this.hideLessonIds.add(Integer.valueOf(elem));
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        setSkuIdIsSet(false);
        this.skuId = 0;
        this.buildingStatus = null;
        this.latestContentVersion = null;
        this.energy_info = null;
        this.finishedLessonIds = null;
        this.hideLessonIds = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof SentenceCurrentInfo)) {
            return equals((SentenceCurrentInfo) that);
        }
        return false;
    }

    public SentenceBuildingStatus getBuildingStatus() {
        return this.buildingStatus;
    }

    public WordEnergyInfo getEnergy_info() {
        return this.energy_info;
    }

    public List<Integer> getFinishedLessonIds() {
        return this.finishedLessonIds;
    }

    public Iterator<Integer> getFinishedLessonIdsIterator() {
        List<Integer> list = this.finishedLessonIds;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getFinishedLessonIdsSize() {
        List<Integer> list = this.finishedLessonIds;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<Integer> getHideLessonIds() {
        return this.hideLessonIds;
    }

    public Iterator<Integer> getHideLessonIdsIterator() {
        List<Integer> list = this.hideLessonIds;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getHideLessonIdsSize() {
        List<Integer> list = this.hideLessonIds;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public String getLatestContentVersion() {
        return this.latestContentVersion;
    }

    public int getSkuId() {
        return this.skuId;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetBuildingStatus() {
        return this.buildingStatus != null;
    }

    public boolean isSetEnergy_info() {
        return this.energy_info != null;
    }

    public boolean isSetFinishedLessonIds() {
        return this.finishedLessonIds != null;
    }

    public boolean isSetHideLessonIds() {
        return this.hideLessonIds != null;
    }

    public boolean isSetLatestContentVersion() {
        return this.latestContentVersion != null;
    }

    public boolean isSetSkuId() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public SentenceCurrentInfo setBuildingStatus(SentenceBuildingStatus buildingStatus) {
        this.buildingStatus = buildingStatus;
        return this;
    }

    public void setBuildingStatusIsSet(boolean value) {
        if (value) {
            return;
        }
        this.buildingStatus = null;
    }

    public SentenceCurrentInfo setEnergy_info(WordEnergyInfo energy_info) {
        this.energy_info = energy_info;
        return this;
    }

    public void setEnergy_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.energy_info = null;
    }

    public SentenceCurrentInfo setFinishedLessonIds(List<Integer> finishedLessonIds) {
        this.finishedLessonIds = finishedLessonIds;
        return this;
    }

    public void setFinishedLessonIdsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.finishedLessonIds = null;
    }

    public SentenceCurrentInfo setHideLessonIds(List<Integer> hideLessonIds) {
        this.hideLessonIds = hideLessonIds;
        return this;
    }

    public void setHideLessonIdsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.hideLessonIds = null;
    }

    public SentenceCurrentInfo setLatestContentVersion(String latestContentVersion) {
        this.latestContentVersion = latestContentVersion;
        return this;
    }

    public void setLatestContentVersionIsSet(boolean value) {
        if (value) {
            return;
        }
        this.latestContentVersion = null;
    }

    public SentenceCurrentInfo setSkuId(int skuId) {
        this.skuId = skuId;
        setSkuIdIsSet(true);
        return this;
    }

    public void setSkuIdIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SentenceCurrentInfo(");
        sb2.append("skuId:");
        sb2.append(this.skuId);
        sb2.append(j2.O);
        sb2.append("buildingStatus:");
        SentenceBuildingStatus sentenceBuildingStatus = this.buildingStatus;
        if (sentenceBuildingStatus == null) {
            sb2.append("null");
        } else {
            sb2.append(sentenceBuildingStatus);
        }
        sb2.append(j2.O);
        sb2.append("latestContentVersion:");
        String str = this.latestContentVersion;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("energy_info:");
        WordEnergyInfo wordEnergyInfo = this.energy_info;
        if (wordEnergyInfo == null) {
            sb2.append("null");
        } else {
            sb2.append(wordEnergyInfo);
        }
        if (isSetFinishedLessonIds()) {
            sb2.append(j2.O);
            sb2.append("finishedLessonIds:");
            List<Integer> list = this.finishedLessonIds;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
        }
        if (isSetHideLessonIds()) {
            sb2.append(j2.O);
            sb2.append("hideLessonIds:");
            List<Integer> list2 = this.hideLessonIds;
            if (list2 == null) {
                sb2.append("null");
            } else {
                sb2.append(list2);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetBuildingStatus() {
        this.buildingStatus = null;
    }

    public void unsetEnergy_info() {
        this.energy_info = null;
    }

    public void unsetFinishedLessonIds() {
        this.finishedLessonIds = null;
    }

    public void unsetHideLessonIds() {
        this.hideLessonIds = null;
    }

    public void unsetLatestContentVersion() {
        this.latestContentVersion = null;
    }

    public void unsetSkuId() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void validate() throws TException {
        SentenceBuildingStatus sentenceBuildingStatus = this.buildingStatus;
        if (sentenceBuildingStatus == null) {
            throw new TProtocolException("Required field 'buildingStatus' was not present! Struct: " + toString());
        }
        if (this.latestContentVersion == null) {
            throw new TProtocolException("Required field 'latestContentVersion' was not present! Struct: " + toString());
        }
        if (this.energy_info == null) {
            throw new TProtocolException("Required field 'energy_info' was not present! Struct: " + toString());
        }
        if (sentenceBuildingStatus != null) {
            sentenceBuildingStatus.validate();
        }
        WordEnergyInfo wordEnergyInfo = this.energy_info;
        if (wordEnergyInfo != null) {
            wordEnergyInfo.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(SentenceCurrentInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo7 = Boolean.valueOf(isSetSkuId()).compareTo(Boolean.valueOf(other.isSetSkuId()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetSkuId() && (compareTo6 = TBaseHelper.compareTo(this.skuId, other.skuId)) != 0) {
            return compareTo6;
        }
        int compareTo8 = Boolean.valueOf(isSetBuildingStatus()).compareTo(Boolean.valueOf(other.isSetBuildingStatus()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetBuildingStatus() && (compareTo5 = TBaseHelper.compareTo((Comparable) this.buildingStatus, (Comparable) other.buildingStatus)) != 0) {
            return compareTo5;
        }
        int compareTo9 = Boolean.valueOf(isSetLatestContentVersion()).compareTo(Boolean.valueOf(other.isSetLatestContentVersion()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetLatestContentVersion() && (compareTo4 = TBaseHelper.compareTo(this.latestContentVersion, other.latestContentVersion)) != 0) {
            return compareTo4;
        }
        int compareTo10 = Boolean.valueOf(isSetEnergy_info()).compareTo(Boolean.valueOf(other.isSetEnergy_info()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetEnergy_info() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.energy_info, (Comparable) other.energy_info)) != 0) {
            return compareTo3;
        }
        int compareTo11 = Boolean.valueOf(isSetFinishedLessonIds()).compareTo(Boolean.valueOf(other.isSetFinishedLessonIds()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetFinishedLessonIds() && (compareTo2 = TBaseHelper.compareTo((List) this.finishedLessonIds, (List) other.finishedLessonIds)) != 0) {
            return compareTo2;
        }
        int compareTo12 = Boolean.valueOf(isSetHideLessonIds()).compareTo(Boolean.valueOf(other.isSetHideLessonIds()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (!isSetHideLessonIds() || (compareTo = TBaseHelper.compareTo((List) this.hideLessonIds, (List) other.hideLessonIds)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<SentenceCurrentInfo, _Fields> deepCopy2() {
        return new SentenceCurrentInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$SentenceCurrentInfo$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getSkuId());
            case 2:
                return getBuildingStatus();
            case 3:
                return getLatestContentVersion();
            case 4:
                return getEnergy_info();
            case 5:
                return getFinishedLessonIds();
            case 6:
                return getHideLessonIds();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$SentenceCurrentInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetSkuId();
            case 2:
                return isSetBuildingStatus();
            case 3:
                return isSetLatestContentVersion();
            case 4:
                return isSetEnergy_info();
            case 5:
                return isSetFinishedLessonIds();
            case 6:
                return isSetHideLessonIds();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$SentenceCurrentInfo$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setSkuId(((Integer) value).intValue());
                    break;
                } else {
                    unsetSkuId();
                    break;
                }
            case 2:
                if (value != null) {
                    setBuildingStatus((SentenceBuildingStatus) value);
                    break;
                } else {
                    unsetBuildingStatus();
                    break;
                }
            case 3:
                if (value != null) {
                    setLatestContentVersion((String) value);
                    break;
                } else {
                    unsetLatestContentVersion();
                    break;
                }
            case 4:
                if (value != null) {
                    setEnergy_info((WordEnergyInfo) value);
                    break;
                } else {
                    unsetEnergy_info();
                    break;
                }
            case 5:
                if (value != null) {
                    setFinishedLessonIds((List) value);
                    break;
                } else {
                    unsetFinishedLessonIds();
                    break;
                }
            case 6:
                if (value != null) {
                    setHideLessonIds((List) value);
                    break;
                } else {
                    unsetHideLessonIds();
                    break;
                }
        }
    }

    public boolean equals(SentenceCurrentInfo that) {
        if (that == null || this.skuId != that.skuId) {
            return false;
        }
        boolean isSetBuildingStatus = isSetBuildingStatus();
        boolean isSetBuildingStatus2 = that.isSetBuildingStatus();
        if ((isSetBuildingStatus || isSetBuildingStatus2) && !(isSetBuildingStatus && isSetBuildingStatus2 && this.buildingStatus.equals(that.buildingStatus))) {
            return false;
        }
        boolean isSetLatestContentVersion = isSetLatestContentVersion();
        boolean isSetLatestContentVersion2 = that.isSetLatestContentVersion();
        if ((isSetLatestContentVersion || isSetLatestContentVersion2) && !(isSetLatestContentVersion && isSetLatestContentVersion2 && this.latestContentVersion.equals(that.latestContentVersion))) {
            return false;
        }
        boolean isSetEnergy_info = isSetEnergy_info();
        boolean isSetEnergy_info2 = that.isSetEnergy_info();
        if ((isSetEnergy_info || isSetEnergy_info2) && !(isSetEnergy_info && isSetEnergy_info2 && this.energy_info.equals(that.energy_info))) {
            return false;
        }
        boolean isSetFinishedLessonIds = isSetFinishedLessonIds();
        boolean isSetFinishedLessonIds2 = that.isSetFinishedLessonIds();
        if ((isSetFinishedLessonIds || isSetFinishedLessonIds2) && !(isSetFinishedLessonIds && isSetFinishedLessonIds2 && this.finishedLessonIds.equals(that.finishedLessonIds))) {
            return false;
        }
        boolean isSetHideLessonIds = isSetHideLessonIds();
        boolean isSetHideLessonIds2 = that.isSetHideLessonIds();
        if (isSetHideLessonIds || isSetHideLessonIds2) {
            return isSetHideLessonIds && isSetHideLessonIds2 && this.hideLessonIds.equals(that.hideLessonIds);
        }
        return true;
    }

    public SentenceCurrentInfo(int skuId, SentenceBuildingStatus buildingStatus, String latestContentVersion, WordEnergyInfo energy_info) {
        this();
        this.skuId = skuId;
        setSkuIdIsSet(true);
        this.buildingStatus = buildingStatus;
        this.latestContentVersion = latestContentVersion;
        this.energy_info = energy_info;
    }

    public SentenceCurrentInfo(SentenceCurrentInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.FINISHED_LESSON_IDS, _Fields.HIDE_LESSON_IDS};
        this.__isset_bitfield = other.__isset_bitfield;
        this.skuId = other.skuId;
        if (other.isSetBuildingStatus()) {
            this.buildingStatus = new SentenceBuildingStatus(other.buildingStatus);
        }
        if (other.isSetLatestContentVersion()) {
            this.latestContentVersion = other.latestContentVersion;
        }
        if (other.isSetEnergy_info()) {
            this.energy_info = new WordEnergyInfo(other.energy_info);
        }
        if (other.isSetFinishedLessonIds()) {
            this.finishedLessonIds = new ArrayList(other.finishedLessonIds);
        }
        if (other.isSetHideLessonIds()) {
            this.hideLessonIds = new ArrayList(other.hideLessonIds);
        }
    }
}
