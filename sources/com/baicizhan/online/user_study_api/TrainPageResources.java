package com.baicizhan.online.user_study_api;

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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class TrainPageResources implements TBase<TrainPageResources, _Fields>, Serializable, Cloneable, Comparable<TrainPageResources> {
    private static final int __ENABLE_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public TrainPageBannerItem banner;
    public List<TrainPageBannerItem> banners;
    public boolean enable;
    private _Fields[] optionals;
    public List<ResourceItem> outerResource;
    public List<TrainPageResource> resources;
    private static final TStruct STRUCT_DESC = new TStruct("TrainPageResources");
    private static final TField ENABLE_FIELD_DESC = new TField(k3.u0.f65628b, (byte) 2, 1);
    private static final TField OUTER_RESOURCE_FIELD_DESC = new TField("outerResource", (byte) 15, 2);
    private static final TField RESOURCES_FIELD_DESC = new TField("resources", (byte) 15, 3);
    private static final TField BANNER_FIELD_DESC = new TField("banner", (byte) 12, 4);
    private static final TField BANNERS_FIELD_DESC = new TField("banners", (byte) 15, 5);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.TrainPageResources$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$TrainPageResources$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$TrainPageResources$_Fields = iArr;
            try {
                iArr[_Fields.ENABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$TrainPageResources$_Fields[_Fields.OUTER_RESOURCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$TrainPageResources$_Fields[_Fields.RESOURCES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$TrainPageResources$_Fields[_Fields.BANNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$TrainPageResources$_Fields[_Fields.BANNERS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TrainPageResourcesStandardScheme extends StandardScheme<TrainPageResources> {
        private TrainPageResourcesStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, TrainPageResources struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    break;
                }
                short s11 = readFieldBegin.f77768id;
                if (s11 != 1) {
                    int i11 = 0;
                    if (s11 != 2) {
                        if (s11 != 3) {
                            if (s11 != 4) {
                                if (s11 != 5) {
                                    TProtocolUtil.skip(iprot, b11);
                                } else if (b11 == 15) {
                                    TList readListBegin = iprot.readListBegin();
                                    struct.banners = new ArrayList(readListBegin.size);
                                    while (i11 < readListBegin.size) {
                                        TrainPageBannerItem trainPageBannerItem = new TrainPageBannerItem();
                                        trainPageBannerItem.read(iprot);
                                        struct.banners.add(trainPageBannerItem);
                                        i11++;
                                    }
                                    iprot.readListEnd();
                                    struct.setBannersIsSet(true);
                                } else {
                                    TProtocolUtil.skip(iprot, b11);
                                }
                            } else if (b11 == 12) {
                                TrainPageBannerItem trainPageBannerItem2 = new TrainPageBannerItem();
                                struct.banner = trainPageBannerItem2;
                                trainPageBannerItem2.read(iprot);
                                struct.setBannerIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 15) {
                            TList readListBegin2 = iprot.readListBegin();
                            struct.resources = new ArrayList(readListBegin2.size);
                            while (i11 < readListBegin2.size) {
                                TrainPageResource trainPageResource = new TrainPageResource();
                                trainPageResource.read(iprot);
                                struct.resources.add(trainPageResource);
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setResourcesIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 15) {
                        TList readListBegin3 = iprot.readListBegin();
                        struct.outerResource = new ArrayList(readListBegin3.size);
                        while (i11 < readListBegin3.size) {
                            ResourceItem resourceItem = new ResourceItem();
                            resourceItem.read(iprot);
                            struct.outerResource.add(resourceItem);
                            i11++;
                        }
                        iprot.readListEnd();
                        struct.setOuterResourceIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 2) {
                    struct.enable = iprot.readBool();
                    struct.setEnableIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetEnable()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'enable' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, TrainPageResources struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(TrainPageResources.STRUCT_DESC);
            oprot.writeFieldBegin(TrainPageResources.ENABLE_FIELD_DESC);
            oprot.writeBool(struct.enable);
            oprot.writeFieldEnd();
            if (struct.outerResource != null) {
                oprot.writeFieldBegin(TrainPageResources.OUTER_RESOURCE_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.outerResource.size()));
                Iterator<ResourceItem> it = struct.outerResource.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.resources != null) {
                oprot.writeFieldBegin(TrainPageResources.RESOURCES_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.resources.size()));
                Iterator<TrainPageResource> it2 = struct.resources.iterator();
                while (it2.hasNext()) {
                    it2.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.banner != null && struct.isSetBanner()) {
                oprot.writeFieldBegin(TrainPageResources.BANNER_FIELD_DESC);
                struct.banner.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.banners != null && struct.isSetBanners()) {
                oprot.writeFieldBegin(TrainPageResources.BANNERS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.banners.size()));
                Iterator<TrainPageBannerItem> it3 = struct.banners.iterator();
                while (it3.hasNext()) {
                    it3.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TrainPageResourcesStandardSchemeFactory implements SchemeFactory {
        private TrainPageResourcesStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public TrainPageResourcesStandardScheme getScheme() {
            return new TrainPageResourcesStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TrainPageResourcesTupleScheme extends TupleScheme<TrainPageResources> {
        private TrainPageResourcesTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, TrainPageResources struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.enable = tTupleProtocol.readBool();
            struct.setEnableIsSet(true);
            TList tList = new TList((byte) 12, tTupleProtocol.readI32());
            struct.outerResource = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                ResourceItem resourceItem = new ResourceItem();
                resourceItem.read(tTupleProtocol);
                struct.outerResource.add(resourceItem);
            }
            struct.setOuterResourceIsSet(true);
            TList tList2 = new TList((byte) 12, tTupleProtocol.readI32());
            struct.resources = new ArrayList(tList2.size);
            for (int i12 = 0; i12 < tList2.size; i12++) {
                TrainPageResource trainPageResource = new TrainPageResource();
                trainPageResource.read(tTupleProtocol);
                struct.resources.add(trainPageResource);
            }
            struct.setResourcesIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(2);
            if (readBitSet.get(0)) {
                TrainPageBannerItem trainPageBannerItem = new TrainPageBannerItem();
                struct.banner = trainPageBannerItem;
                trainPageBannerItem.read(tTupleProtocol);
                struct.setBannerIsSet(true);
            }
            if (readBitSet.get(1)) {
                TList tList3 = new TList((byte) 12, tTupleProtocol.readI32());
                struct.banners = new ArrayList(tList3.size);
                for (int i13 = 0; i13 < tList3.size; i13++) {
                    TrainPageBannerItem trainPageBannerItem2 = new TrainPageBannerItem();
                    trainPageBannerItem2.read(tTupleProtocol);
                    struct.banners.add(trainPageBannerItem2);
                }
                struct.setBannersIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, TrainPageResources struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeBool(struct.enable);
            tTupleProtocol.writeI32(struct.outerResource.size());
            Iterator<ResourceItem> it = struct.outerResource.iterator();
            while (it.hasNext()) {
                it.next().write(tTupleProtocol);
            }
            tTupleProtocol.writeI32(struct.resources.size());
            Iterator<TrainPageResource> it2 = struct.resources.iterator();
            while (it2.hasNext()) {
                it2.next().write(tTupleProtocol);
            }
            BitSet bitSet = new BitSet();
            if (struct.isSetBanner()) {
                bitSet.set(0);
            }
            if (struct.isSetBanners()) {
                bitSet.set(1);
            }
            tTupleProtocol.writeBitSet(bitSet, 2);
            if (struct.isSetBanner()) {
                struct.banner.write(tTupleProtocol);
            }
            if (struct.isSetBanners()) {
                tTupleProtocol.writeI32(struct.banners.size());
                Iterator<TrainPageBannerItem> it3 = struct.banners.iterator();
                while (it3.hasNext()) {
                    it3.next().write(tTupleProtocol);
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TrainPageResourcesTupleSchemeFactory implements SchemeFactory {
        private TrainPageResourcesTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public TrainPageResourcesTupleScheme getScheme() {
            return new TrainPageResourcesTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ENABLE(1, k3.u0.f65628b),
        OUTER_RESOURCE(2, "outerResource"),
        RESOURCES(3, "resources"),
        BANNER(4, "banner"),
        BANNERS(5, "banners");

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
                return ENABLE;
            }
            if (fieldId == 2) {
                return OUTER_RESOURCE;
            }
            if (fieldId == 3) {
                return RESOURCES;
            }
            if (fieldId == 4) {
                return BANNER;
            }
            if (fieldId != 5) {
                return null;
            }
            return BANNERS;
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
        hashMap.put(StandardScheme.class, new TrainPageResourcesStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new TrainPageResourcesTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ENABLE, (_Fields) new FieldMetaData(k3.u0.f65628b, (byte) 1, new FieldValueMetaData((byte) 2)));
        enumMap.put((EnumMap) _Fields.OUTER_RESOURCE, (_Fields) new FieldMetaData("outerResource", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, ResourceItem.class))));
        enumMap.put((EnumMap) _Fields.RESOURCES, (_Fields) new FieldMetaData("resources", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, TrainPageResource.class))));
        enumMap.put((EnumMap) _Fields.BANNER, (_Fields) new FieldMetaData("banner", (byte) 2, new StructMetaData((byte) 12, TrainPageBannerItem.class)));
        enumMap.put((EnumMap) _Fields.BANNERS, (_Fields) new FieldMetaData("banners", (byte) 2, new ListMetaData((byte) 15, new StructMetaData((byte) 12, TrainPageBannerItem.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(TrainPageResources.class, unmodifiableMap);
    }

    public TrainPageResources() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.BANNER, _Fields.BANNERS};
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

    public void addToBanners(TrainPageBannerItem elem) {
        if (this.banners == null) {
            this.banners = new ArrayList();
        }
        this.banners.add(elem);
    }

    public void addToOuterResource(ResourceItem elem) {
        if (this.outerResource == null) {
            this.outerResource = new ArrayList();
        }
        this.outerResource.add(elem);
    }

    public void addToResources(TrainPageResource elem) {
        if (this.resources == null) {
            this.resources = new ArrayList();
        }
        this.resources.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        setEnableIsSet(false);
        this.enable = false;
        this.outerResource = null;
        this.resources = null;
        this.banner = null;
        this.banners = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof TrainPageResources)) {
            return equals((TrainPageResources) that);
        }
        return false;
    }

    public TrainPageBannerItem getBanner() {
        return this.banner;
    }

    public List<TrainPageBannerItem> getBanners() {
        return this.banners;
    }

    public Iterator<TrainPageBannerItem> getBannersIterator() {
        List<TrainPageBannerItem> list = this.banners;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getBannersSize() {
        List<TrainPageBannerItem> list = this.banners;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<ResourceItem> getOuterResource() {
        return this.outerResource;
    }

    public Iterator<ResourceItem> getOuterResourceIterator() {
        List<ResourceItem> list = this.outerResource;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getOuterResourceSize() {
        List<ResourceItem> list = this.outerResource;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<TrainPageResource> getResources() {
        return this.resources;
    }

    public Iterator<TrainPageResource> getResourcesIterator() {
        List<TrainPageResource> list = this.resources;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getResourcesSize() {
        List<TrainPageResource> list = this.resources;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public boolean isSetBanner() {
        return this.banner != null;
    }

    public boolean isSetBanners() {
        return this.banners != null;
    }

    public boolean isSetEnable() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetOuterResource() {
        return this.outerResource != null;
    }

    public boolean isSetResources() {
        return this.resources != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public TrainPageResources setBanner(TrainPageBannerItem banner) {
        this.banner = banner;
        return this;
    }

    public void setBannerIsSet(boolean value) {
        if (value) {
            return;
        }
        this.banner = null;
    }

    public TrainPageResources setBanners(List<TrainPageBannerItem> banners) {
        this.banners = banners;
        return this;
    }

    public void setBannersIsSet(boolean value) {
        if (value) {
            return;
        }
        this.banners = null;
    }

    public TrainPageResources setEnable(boolean enable) {
        this.enable = enable;
        setEnableIsSet(true);
        return this;
    }

    public void setEnableIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public TrainPageResources setOuterResource(List<ResourceItem> outerResource) {
        this.outerResource = outerResource;
        return this;
    }

    public void setOuterResourceIsSet(boolean value) {
        if (value) {
            return;
        }
        this.outerResource = null;
    }

    public TrainPageResources setResources(List<TrainPageResource> resources) {
        this.resources = resources;
        return this;
    }

    public void setResourcesIsSet(boolean value) {
        if (value) {
            return;
        }
        this.resources = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TrainPageResources(");
        sb2.append("enable:");
        sb2.append(this.enable);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("outerResource:");
        List<ResourceItem> list = this.outerResource;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("resources:");
        List<TrainPageResource> list2 = this.resources;
        if (list2 == null) {
            sb2.append("null");
        } else {
            sb2.append(list2);
        }
        if (isSetBanner()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("banner:");
            TrainPageBannerItem trainPageBannerItem = this.banner;
            if (trainPageBannerItem == null) {
                sb2.append("null");
            } else {
                sb2.append(trainPageBannerItem);
            }
        }
        if (isSetBanners()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("banners:");
            List<TrainPageBannerItem> list3 = this.banners;
            if (list3 == null) {
                sb2.append("null");
            } else {
                sb2.append(list3);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetBanner() {
        this.banner = null;
    }

    public void unsetBanners() {
        this.banners = null;
    }

    public void unsetEnable() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetOuterResource() {
        this.outerResource = null;
    }

    public void unsetResources() {
        this.resources = null;
    }

    public void validate() throws TException {
        if (this.outerResource == null) {
            throw new TProtocolException("Required field 'outerResource' was not present! Struct: " + toString());
        }
        if (this.resources == null) {
            throw new TProtocolException("Required field 'resources' was not present! Struct: " + toString());
        }
        TrainPageBannerItem trainPageBannerItem = this.banner;
        if (trainPageBannerItem != null) {
            trainPageBannerItem.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(TrainPageResources other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo6 = Boolean.valueOf(isSetEnable()).compareTo(Boolean.valueOf(other.isSetEnable()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetEnable() && (compareTo5 = TBaseHelper.compareTo(this.enable, other.enable)) != 0) {
            return compareTo5;
        }
        int compareTo7 = Boolean.valueOf(isSetOuterResource()).compareTo(Boolean.valueOf(other.isSetOuterResource()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetOuterResource() && (compareTo4 = TBaseHelper.compareTo((List) this.outerResource, (List) other.outerResource)) != 0) {
            return compareTo4;
        }
        int compareTo8 = Boolean.valueOf(isSetResources()).compareTo(Boolean.valueOf(other.isSetResources()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetResources() && (compareTo3 = TBaseHelper.compareTo((List) this.resources, (List) other.resources)) != 0) {
            return compareTo3;
        }
        int compareTo9 = Boolean.valueOf(isSetBanner()).compareTo(Boolean.valueOf(other.isSetBanner()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetBanner() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.banner, (Comparable) other.banner)) != 0) {
            return compareTo2;
        }
        int compareTo10 = Boolean.valueOf(isSetBanners()).compareTo(Boolean.valueOf(other.isSetBanners()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!isSetBanners() || (compareTo = TBaseHelper.compareTo((List) this.banners, (List) other.banners)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<TrainPageResources, _Fields> deepCopy2() {
        return new TrainPageResources(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$TrainPageResources$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Boolean.valueOf(isEnable());
        }
        if (i11 == 2) {
            return getOuterResource();
        }
        if (i11 == 3) {
            return getResources();
        }
        if (i11 == 4) {
            return getBanner();
        }
        if (i11 == 5) {
            return getBanners();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$TrainPageResources$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetEnable();
        }
        if (i11 == 2) {
            return isSetOuterResource();
        }
        if (i11 == 3) {
            return isSetResources();
        }
        if (i11 == 4) {
            return isSetBanner();
        }
        if (i11 == 5) {
            return isSetBanners();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$TrainPageResources$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetEnable();
                return;
            } else {
                setEnable(((Boolean) value).booleanValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetOuterResource();
                return;
            } else {
                setOuterResource((List) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetResources();
                return;
            } else {
                setResources((List) value);
                return;
            }
        }
        if (i11 == 4) {
            if (value == null) {
                unsetBanner();
                return;
            } else {
                setBanner((TrainPageBannerItem) value);
                return;
            }
        }
        if (i11 != 5) {
            return;
        }
        if (value == null) {
            unsetBanners();
        } else {
            setBanners((List) value);
        }
    }

    public boolean equals(TrainPageResources that) {
        if (that == null || this.enable != that.enable) {
            return false;
        }
        boolean isSetOuterResource = isSetOuterResource();
        boolean isSetOuterResource2 = that.isSetOuterResource();
        if ((isSetOuterResource || isSetOuterResource2) && !(isSetOuterResource && isSetOuterResource2 && this.outerResource.equals(that.outerResource))) {
            return false;
        }
        boolean isSetResources = isSetResources();
        boolean isSetResources2 = that.isSetResources();
        if ((isSetResources || isSetResources2) && !(isSetResources && isSetResources2 && this.resources.equals(that.resources))) {
            return false;
        }
        boolean isSetBanner = isSetBanner();
        boolean isSetBanner2 = that.isSetBanner();
        if ((isSetBanner || isSetBanner2) && !(isSetBanner && isSetBanner2 && this.banner.equals(that.banner))) {
            return false;
        }
        boolean isSetBanners = isSetBanners();
        boolean isSetBanners2 = that.isSetBanners();
        if (isSetBanners || isSetBanners2) {
            return isSetBanners && isSetBanners2 && this.banners.equals(that.banners);
        }
        return true;
    }

    public TrainPageResources(boolean enable, List<ResourceItem> outerResource, List<TrainPageResource> resources) {
        this();
        this.enable = enable;
        setEnableIsSet(true);
        this.outerResource = outerResource;
        this.resources = resources;
    }

    public TrainPageResources(TrainPageResources other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.BANNER, _Fields.BANNERS};
        this.__isset_bitfield = other.__isset_bitfield;
        this.enable = other.enable;
        if (other.isSetOuterResource()) {
            ArrayList arrayList = new ArrayList(other.outerResource.size());
            Iterator<ResourceItem> it = other.outerResource.iterator();
            while (it.hasNext()) {
                arrayList.add(new ResourceItem(it.next()));
            }
            this.outerResource = arrayList;
        }
        if (other.isSetResources()) {
            ArrayList arrayList2 = new ArrayList(other.resources.size());
            Iterator<TrainPageResource> it2 = other.resources.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new TrainPageResource(it2.next()));
            }
            this.resources = arrayList2;
        }
        if (other.isSetBanner()) {
            this.banner = new TrainPageBannerItem(other.banner);
        }
        if (other.isSetBanners()) {
            ArrayList arrayList3 = new ArrayList(other.banners.size());
            Iterator<TrainPageBannerItem> it3 = other.banners.iterator();
            while (it3.hasNext()) {
                arrayList3.add(new TrainPageBannerItem(it3.next()));
            }
            this.banners = arrayList3;
        }
    }
}
