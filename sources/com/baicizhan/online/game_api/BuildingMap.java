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
public class BuildingMap implements TBase<BuildingMap, _Fields>, Serializable, Cloneable, Comparable<BuildingMap> {
    private static final int __SKUID_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public List<BuildingInfo> buildings;
    public int skuId;
    private static final TStruct STRUCT_DESC = new TStruct("BuildingMap");
    private static final TField SKU_ID_FIELD_DESC = new TField("skuId", (byte) 8, 1);
    private static final TField BUILDINGS_FIELD_DESC = new TField("buildings", (byte) 15, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.BuildingMap$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$BuildingMap$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$BuildingMap$_Fields = iArr;
            try {
                iArr[_Fields.SKU_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$BuildingMap$_Fields[_Fields.BUILDINGS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BuildingMapStandardScheme extends StandardScheme<BuildingMap> {
        private BuildingMapStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BuildingMap struct) throws TException {
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
                        struct.buildings = new ArrayList(readListBegin.size);
                        for (int i11 = 0; i11 < readListBegin.size; i11++) {
                            BuildingInfo buildingInfo = new BuildingInfo();
                            buildingInfo.read(iprot);
                            struct.buildings.add(buildingInfo);
                        }
                        iprot.readListEnd();
                        struct.setBuildingsIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.skuId = iprot.readI32();
                    struct.setSkuIdIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetSkuId()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'skuId' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BuildingMap struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BuildingMap.STRUCT_DESC);
            oprot.writeFieldBegin(BuildingMap.SKU_ID_FIELD_DESC);
            oprot.writeI32(struct.skuId);
            oprot.writeFieldEnd();
            if (struct.buildings != null) {
                oprot.writeFieldBegin(BuildingMap.BUILDINGS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.buildings.size()));
                Iterator<BuildingInfo> it = struct.buildings.iterator();
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
    public static class BuildingMapStandardSchemeFactory implements SchemeFactory {
        private BuildingMapStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BuildingMapStandardScheme getScheme() {
            return new BuildingMapStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BuildingMapTupleScheme extends TupleScheme<BuildingMap> {
        private BuildingMapTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BuildingMap struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.skuId = tTupleProtocol.readI32();
            struct.setSkuIdIsSet(true);
            TList tList = new TList((byte) 12, tTupleProtocol.readI32());
            struct.buildings = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                BuildingInfo buildingInfo = new BuildingInfo();
                buildingInfo.read(tTupleProtocol);
                struct.buildings.add(buildingInfo);
            }
            struct.setBuildingsIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BuildingMap struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.skuId);
            tTupleProtocol.writeI32(struct.buildings.size());
            Iterator<BuildingInfo> it = struct.buildings.iterator();
            while (it.hasNext()) {
                it.next().write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BuildingMapTupleSchemeFactory implements SchemeFactory {
        private BuildingMapTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BuildingMapTupleScheme getScheme() {
            return new BuildingMapTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        SKU_ID(1, "skuId"),
        BUILDINGS(2, "buildings");

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
                return SKU_ID;
            }
            if (fieldId != 2) {
                return null;
            }
            return BUILDINGS;
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
        hashMap.put(StandardScheme.class, new BuildingMapStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BuildingMapTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.SKU_ID, (_Fields) new FieldMetaData("skuId", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.BUILDINGS, (_Fields) new FieldMetaData("buildings", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, BuildingInfo.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BuildingMap.class, unmodifiableMap);
    }

    public BuildingMap() {
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

    public void addToBuildings(BuildingInfo elem) {
        if (this.buildings == null) {
            this.buildings = new ArrayList();
        }
        this.buildings.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        setSkuIdIsSet(false);
        this.skuId = 0;
        this.buildings = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BuildingMap)) {
            return equals((BuildingMap) that);
        }
        return false;
    }

    public List<BuildingInfo> getBuildings() {
        return this.buildings;
    }

    public Iterator<BuildingInfo> getBuildingsIterator() {
        List<BuildingInfo> list = this.buildings;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getBuildingsSize() {
        List<BuildingInfo> list = this.buildings;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int getSkuId() {
        return this.skuId;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetBuildings() {
        return this.buildings != null;
    }

    public boolean isSetSkuId() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BuildingMap setBuildings(List<BuildingInfo> buildings) {
        this.buildings = buildings;
        return this;
    }

    public void setBuildingsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.buildings = null;
    }

    public BuildingMap setSkuId(int skuId) {
        this.skuId = skuId;
        setSkuIdIsSet(true);
        return this;
    }

    public void setSkuIdIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BuildingMap(");
        sb2.append("skuId:");
        sb2.append(this.skuId);
        sb2.append(j2.O);
        sb2.append("buildings:");
        List<BuildingInfo> list = this.buildings;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetBuildings() {
        this.buildings = null;
    }

    public void unsetSkuId() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void validate() throws TException {
        if (this.buildings != null) {
            return;
        }
        throw new TProtocolException("Required field 'buildings' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BuildingMap other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetSkuId()).compareTo(Boolean.valueOf(other.isSetSkuId()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetSkuId() && (compareTo2 = TBaseHelper.compareTo(this.skuId, other.skuId)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetBuildings()).compareTo(Boolean.valueOf(other.isSetBuildings()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetBuildings() || (compareTo = TBaseHelper.compareTo((List) this.buildings, (List) other.buildings)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BuildingMap, _Fields> deepCopy2() {
        return new BuildingMap(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$BuildingMap$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getSkuId());
        }
        if (i11 == 2) {
            return getBuildings();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$BuildingMap$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetSkuId();
        }
        if (i11 == 2) {
            return isSetBuildings();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$BuildingMap$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetSkuId();
                return;
            } else {
                setSkuId(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetBuildings();
        } else {
            setBuildings((List) value);
        }
    }

    public BuildingMap(int skuId, List<BuildingInfo> buildings) {
        this();
        this.skuId = skuId;
        setSkuIdIsSet(true);
        this.buildings = buildings;
    }

    public boolean equals(BuildingMap that) {
        if (that == null || this.skuId != that.skuId) {
            return false;
        }
        boolean isSetBuildings = isSetBuildings();
        boolean isSetBuildings2 = that.isSetBuildings();
        if (isSetBuildings || isSetBuildings2) {
            return isSetBuildings && isSetBuildings2 && this.buildings.equals(that.buildings);
        }
        return true;
    }

    public BuildingMap(BuildingMap other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.skuId = other.skuId;
        if (other.isSetBuildings()) {
            ArrayList arrayList = new ArrayList(other.buildings.size());
            Iterator<BuildingInfo> it = other.buildings.iterator();
            while (it.hasNext()) {
                arrayList.add(new BuildingInfo(it.next()));
            }
            this.buildings = arrayList;
        }
    }
}
