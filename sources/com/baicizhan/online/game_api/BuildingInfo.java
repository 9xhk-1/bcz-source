package com.baicizhan.online.game_api;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
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
public class BuildingInfo implements TBase<BuildingInfo, _Fields>, Serializable, Cloneable, Comparable<BuildingInfo> {
    private static final int __BUILDINGID_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int buildingId;
    public List<BuildingLevelInfo> levels;
    private static final TStruct STRUCT_DESC = new TStruct("BuildingInfo");
    private static final TField BUILDING_ID_FIELD_DESC = new TField("buildingId", (byte) 8, 1);
    private static final TField LEVELS_FIELD_DESC = new TField("levels", (byte) 15, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.BuildingInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$BuildingInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$BuildingInfo$_Fields = iArr;
            try {
                iArr[_Fields.BUILDING_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$BuildingInfo$_Fields[_Fields.LEVELS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BuildingInfoStandardScheme extends StandardScheme<BuildingInfo> {
        private BuildingInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BuildingInfo struct) throws TException {
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
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 15) {
                        TList readListBegin = iprot.readListBegin();
                        struct.levels = new ArrayList(readListBegin.size);
                        for (int i11 = 0; i11 < readListBegin.size; i11++) {
                            BuildingLevelInfo buildingLevelInfo = new BuildingLevelInfo();
                            buildingLevelInfo.read(iprot);
                            struct.levels.add(buildingLevelInfo);
                        }
                        iprot.readListEnd();
                        struct.setLevelsIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.buildingId = iprot.readI32();
                    struct.setBuildingIdIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetBuildingId()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'buildingId' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BuildingInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BuildingInfo.STRUCT_DESC);
            oprot.writeFieldBegin(BuildingInfo.BUILDING_ID_FIELD_DESC);
            oprot.writeI32(struct.buildingId);
            oprot.writeFieldEnd();
            if (struct.levels != null) {
                oprot.writeFieldBegin(BuildingInfo.LEVELS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.levels.size()));
                Iterator<BuildingLevelInfo> it = struct.levels.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BuildingInfoStandardSchemeFactory implements SchemeFactory {
        private BuildingInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BuildingInfoStandardScheme getScheme() {
            return new BuildingInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BuildingInfoTupleScheme extends TupleScheme<BuildingInfo> {
        private BuildingInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BuildingInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.buildingId = tTupleProtocol.readI32();
            struct.setBuildingIdIsSet(true);
            TList tList = new TList((byte) 12, tTupleProtocol.readI32());
            struct.levels = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                BuildingLevelInfo buildingLevelInfo = new BuildingLevelInfo();
                buildingLevelInfo.read(tTupleProtocol);
                struct.levels.add(buildingLevelInfo);
            }
            struct.setLevelsIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BuildingInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.buildingId);
            tTupleProtocol.writeI32(struct.levels.size());
            Iterator<BuildingLevelInfo> it = struct.levels.iterator();
            while (it.hasNext()) {
                it.next().write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BuildingInfoTupleSchemeFactory implements SchemeFactory {
        private BuildingInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BuildingInfoTupleScheme getScheme() {
            return new BuildingInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        BUILDING_ID(1, "buildingId"),
        LEVELS(2, "levels");

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
                return BUILDING_ID;
            }
            if (fieldId != 2) {
                return null;
            }
            return LEVELS;
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
        hashMap.put(StandardScheme.class, new BuildingInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BuildingInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.BUILDING_ID, (_Fields) new FieldMetaData("buildingId", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.LEVELS, (_Fields) new FieldMetaData("levels", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, BuildingLevelInfo.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BuildingInfo.class, unmodifiableMap);
    }

    public BuildingInfo() {
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

    public void addToLevels(BuildingLevelInfo elem) {
        if (this.levels == null) {
            this.levels = new ArrayList();
        }
        this.levels.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        setBuildingIdIsSet(false);
        this.buildingId = 0;
        this.levels = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BuildingInfo)) {
            return equals((BuildingInfo) that);
        }
        return false;
    }

    public int getBuildingId() {
        return this.buildingId;
    }

    public List<BuildingLevelInfo> getLevels() {
        return this.levels;
    }

    public Iterator<BuildingLevelInfo> getLevelsIterator() {
        List<BuildingLevelInfo> list = this.levels;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getLevelsSize() {
        List<BuildingLevelInfo> list = this.levels;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetBuildingId() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetLevels() {
        return this.levels != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BuildingInfo setBuildingId(int buildingId) {
        this.buildingId = buildingId;
        setBuildingIdIsSet(true);
        return this;
    }

    public void setBuildingIdIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public BuildingInfo setLevels(List<BuildingLevelInfo> levels) {
        this.levels = levels;
        return this;
    }

    public void setLevelsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.levels = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BuildingInfo(");
        sb2.append("buildingId:");
        sb2.append(this.buildingId);
        sb2.append(j2.O);
        sb2.append("levels:");
        List<BuildingLevelInfo> list = this.levels;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetBuildingId() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetLevels() {
        this.levels = null;
    }

    public void validate() throws TException {
        if (this.levels != null) {
            return;
        }
        throw new TProtocolException("Required field 'levels' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BuildingInfo other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetBuildingId()).compareTo(Boolean.valueOf(other.isSetBuildingId()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetBuildingId() && (compareTo2 = TBaseHelper.compareTo(this.buildingId, other.buildingId)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetLevels()).compareTo(Boolean.valueOf(other.isSetLevels()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetLevels() || (compareTo = TBaseHelper.compareTo((List) this.levels, (List) other.levels)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BuildingInfo, _Fields> deepCopy2() {
        return new BuildingInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$BuildingInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getBuildingId());
        }
        if (i11 == 2) {
            return getLevels();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$BuildingInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetBuildingId();
        }
        if (i11 == 2) {
            return isSetLevels();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$BuildingInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetBuildingId();
                return;
            } else {
                setBuildingId(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetLevels();
        } else {
            setLevels((List) value);
        }
    }

    public BuildingInfo(int buildingId, List<BuildingLevelInfo> levels) {
        this();
        this.buildingId = buildingId;
        setBuildingIdIsSet(true);
        this.levels = levels;
    }

    public boolean equals(BuildingInfo that) {
        if (that == null || this.buildingId != that.buildingId) {
            return false;
        }
        boolean isSetLevels = isSetLevels();
        boolean isSetLevels2 = that.isSetLevels();
        if (isSetLevels || isSetLevels2) {
            return isSetLevels && isSetLevels2 && this.levels.equals(that.levels);
        }
        return true;
    }

    public BuildingInfo(BuildingInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.buildingId = other.buildingId;
        if (other.isSetLevels()) {
            ArrayList arrayList = new ArrayList(other.levels.size());
            Iterator<BuildingLevelInfo> it = other.levels.iterator();
            while (it.hasNext()) {
                arrayList.add(new BuildingLevelInfo(it.next()));
            }
            this.levels = arrayList;
        }
    }
}
