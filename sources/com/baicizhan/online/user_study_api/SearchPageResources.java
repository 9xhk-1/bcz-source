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
public class SearchPageResources implements TBase<SearchPageResources, _Fields>, Serializable, Cloneable, Comparable<SearchPageResources> {
    private static final int __MODULE_ID_ISSET_ID = 0;
    private static final int __RATIO_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int module_id;
    public String module_name;
    private _Fields[] optionals;
    public double ratio;
    public List<SearchPageResource> resources;
    private static final TStruct STRUCT_DESC = new TStruct("SearchPageResources");
    private static final TField MODULE_ID_FIELD_DESC = new TField("module_id", (byte) 8, 1);
    private static final TField MODULE_NAME_FIELD_DESC = new TField("module_name", (byte) 11, 2);
    private static final TField RATIO_FIELD_DESC = new TField("ratio", (byte) 4, 3);
    private static final TField RESOURCES_FIELD_DESC = new TField("resources", (byte) 15, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.SearchPageResources$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$SearchPageResources$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$SearchPageResources$_Fields = iArr;
            try {
                iArr[_Fields.MODULE_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$SearchPageResources$_Fields[_Fields.MODULE_NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$SearchPageResources$_Fields[_Fields.RATIO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$SearchPageResources$_Fields[_Fields.RESOURCES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SearchPageResourcesStandardScheme extends StandardScheme<SearchPageResources> {
        private SearchPageResourcesStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, SearchPageResources struct) throws TException {
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
                            } else if (b11 == 15) {
                                TList readListBegin = iprot.readListBegin();
                                struct.resources = new ArrayList(readListBegin.size);
                                for (int i11 = 0; i11 < readListBegin.size; i11++) {
                                    SearchPageResource searchPageResource = new SearchPageResource();
                                    searchPageResource.read(iprot);
                                    struct.resources.add(searchPageResource);
                                }
                                iprot.readListEnd();
                                struct.setResourcesIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 4) {
                            struct.ratio = iprot.readDouble();
                            struct.setRatioIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.module_name = iprot.readString();
                        struct.setModule_nameIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.module_id = iprot.readI32();
                    struct.setModule_idIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetModule_id()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'module_id' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, SearchPageResources struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(SearchPageResources.STRUCT_DESC);
            oprot.writeFieldBegin(SearchPageResources.MODULE_ID_FIELD_DESC);
            oprot.writeI32(struct.module_id);
            oprot.writeFieldEnd();
            if (struct.module_name != null) {
                oprot.writeFieldBegin(SearchPageResources.MODULE_NAME_FIELD_DESC);
                oprot.writeString(struct.module_name);
                oprot.writeFieldEnd();
            }
            if (struct.isSetRatio()) {
                oprot.writeFieldBegin(SearchPageResources.RATIO_FIELD_DESC);
                oprot.writeDouble(struct.ratio);
                oprot.writeFieldEnd();
            }
            if (struct.resources != null) {
                oprot.writeFieldBegin(SearchPageResources.RESOURCES_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.resources.size()));
                Iterator<SearchPageResource> it = struct.resources.iterator();
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
    public static class SearchPageResourcesStandardSchemeFactory implements SchemeFactory {
        private SearchPageResourcesStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SearchPageResourcesStandardScheme getScheme() {
            return new SearchPageResourcesStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SearchPageResourcesTupleScheme extends TupleScheme<SearchPageResources> {
        private SearchPageResourcesTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, SearchPageResources struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.module_id = tTupleProtocol.readI32();
            struct.setModule_idIsSet(true);
            struct.module_name = tTupleProtocol.readString();
            struct.setModule_nameIsSet(true);
            TList tList = new TList((byte) 12, tTupleProtocol.readI32());
            struct.resources = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                SearchPageResource searchPageResource = new SearchPageResource();
                searchPageResource.read(tTupleProtocol);
                struct.resources.add(searchPageResource);
            }
            struct.setResourcesIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                struct.ratio = tTupleProtocol.readDouble();
                struct.setRatioIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, SearchPageResources struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.module_id);
            tTupleProtocol.writeString(struct.module_name);
            tTupleProtocol.writeI32(struct.resources.size());
            Iterator<SearchPageResource> it = struct.resources.iterator();
            while (it.hasNext()) {
                it.next().write(tTupleProtocol);
            }
            BitSet bitSet = new BitSet();
            if (struct.isSetRatio()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetRatio()) {
                tTupleProtocol.writeDouble(struct.ratio);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SearchPageResourcesTupleSchemeFactory implements SchemeFactory {
        private SearchPageResourcesTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SearchPageResourcesTupleScheme getScheme() {
            return new SearchPageResourcesTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        MODULE_ID(1, "module_id"),
        MODULE_NAME(2, "module_name"),
        RATIO(3, "ratio"),
        RESOURCES(4, "resources");

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
                return MODULE_ID;
            }
            if (fieldId == 2) {
                return MODULE_NAME;
            }
            if (fieldId == 3) {
                return RATIO;
            }
            if (fieldId != 4) {
                return null;
            }
            return RESOURCES;
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
        hashMap.put(StandardScheme.class, new SearchPageResourcesStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new SearchPageResourcesTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.MODULE_ID, (_Fields) new FieldMetaData("module_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.MODULE_NAME, (_Fields) new FieldMetaData("module_name", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.RATIO, (_Fields) new FieldMetaData("ratio", (byte) 2, new FieldValueMetaData((byte) 4)));
        enumMap.put((EnumMap) _Fields.RESOURCES, (_Fields) new FieldMetaData("resources", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, SearchPageResource.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(SearchPageResources.class, unmodifiableMap);
    }

    public SearchPageResources() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.RATIO};
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

    public void addToResources(SearchPageResource elem) {
        if (this.resources == null) {
            this.resources = new ArrayList();
        }
        this.resources.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        setModule_idIsSet(false);
        this.module_id = 0;
        this.module_name = null;
        setRatioIsSet(false);
        this.ratio = 0.0d;
        this.resources = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof SearchPageResources)) {
            return equals((SearchPageResources) that);
        }
        return false;
    }

    public int getModule_id() {
        return this.module_id;
    }

    public String getModule_name() {
        return this.module_name;
    }

    public double getRatio() {
        return this.ratio;
    }

    public List<SearchPageResource> getResources() {
        return this.resources;
    }

    public Iterator<SearchPageResource> getResourcesIterator() {
        List<SearchPageResource> list = this.resources;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getResourcesSize() {
        List<SearchPageResource> list = this.resources;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetModule_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetModule_name() {
        return this.module_name != null;
    }

    public boolean isSetRatio() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetResources() {
        return this.resources != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public SearchPageResources setModule_id(int module_id) {
        this.module_id = module_id;
        setModule_idIsSet(true);
        return this;
    }

    public void setModule_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public SearchPageResources setModule_name(String module_name) {
        this.module_name = module_name;
        return this;
    }

    public void setModule_nameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.module_name = null;
    }

    public SearchPageResources setRatio(double ratio) {
        this.ratio = ratio;
        setRatioIsSet(true);
        return this;
    }

    public void setRatioIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public SearchPageResources setResources(List<SearchPageResource> resources) {
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
        StringBuilder sb2 = new StringBuilder("SearchPageResources(");
        sb2.append("module_id:");
        sb2.append(this.module_id);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("module_name:");
        String str = this.module_name;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        if (isSetRatio()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("ratio:");
            sb2.append(this.ratio);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("resources:");
        List<SearchPageResource> list = this.resources;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetModule_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetModule_name() {
        this.module_name = null;
    }

    public void unsetRatio() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetResources() {
        this.resources = null;
    }

    public void validate() throws TException {
        if (this.module_name == null) {
            throw new TProtocolException("Required field 'module_name' was not present! Struct: " + toString());
        }
        if (this.resources != null) {
            return;
        }
        throw new TProtocolException("Required field 'resources' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(SearchPageResources other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetModule_id()).compareTo(Boolean.valueOf(other.isSetModule_id()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetModule_id() && (compareTo4 = TBaseHelper.compareTo(this.module_id, other.module_id)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetModule_name()).compareTo(Boolean.valueOf(other.isSetModule_name()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetModule_name() && (compareTo3 = TBaseHelper.compareTo(this.module_name, other.module_name)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetRatio()).compareTo(Boolean.valueOf(other.isSetRatio()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetRatio() && (compareTo2 = TBaseHelper.compareTo(this.ratio, other.ratio)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetResources()).compareTo(Boolean.valueOf(other.isSetResources()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetResources() || (compareTo = TBaseHelper.compareTo((List) this.resources, (List) other.resources)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<SearchPageResources, _Fields> deepCopy2() {
        return new SearchPageResources(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$SearchPageResources$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getModule_id());
        }
        if (i11 == 2) {
            return getModule_name();
        }
        if (i11 == 3) {
            return Double.valueOf(getRatio());
        }
        if (i11 == 4) {
            return getResources();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$SearchPageResources$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetModule_id();
        }
        if (i11 == 2) {
            return isSetModule_name();
        }
        if (i11 == 3) {
            return isSetRatio();
        }
        if (i11 == 4) {
            return isSetResources();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$SearchPageResources$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetModule_id();
                return;
            } else {
                setModule_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetModule_name();
                return;
            } else {
                setModule_name((String) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetRatio();
                return;
            } else {
                setRatio(((Double) value).doubleValue());
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetResources();
        } else {
            setResources((List) value);
        }
    }

    public boolean equals(SearchPageResources that) {
        if (that == null || this.module_id != that.module_id) {
            return false;
        }
        boolean isSetModule_name = isSetModule_name();
        boolean isSetModule_name2 = that.isSetModule_name();
        if ((isSetModule_name || isSetModule_name2) && !(isSetModule_name && isSetModule_name2 && this.module_name.equals(that.module_name))) {
            return false;
        }
        boolean isSetRatio = isSetRatio();
        boolean isSetRatio2 = that.isSetRatio();
        if ((isSetRatio || isSetRatio2) && !(isSetRatio && isSetRatio2 && this.ratio == that.ratio)) {
            return false;
        }
        boolean isSetResources = isSetResources();
        boolean isSetResources2 = that.isSetResources();
        if (isSetResources || isSetResources2) {
            return isSetResources && isSetResources2 && this.resources.equals(that.resources);
        }
        return true;
    }

    public SearchPageResources(int module_id, String module_name, List<SearchPageResource> resources) {
        this();
        this.module_id = module_id;
        setModule_idIsSet(true);
        this.module_name = module_name;
        this.resources = resources;
    }

    public SearchPageResources(SearchPageResources other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.RATIO};
        this.__isset_bitfield = other.__isset_bitfield;
        this.module_id = other.module_id;
        if (other.isSetModule_name()) {
            this.module_name = other.module_name;
        }
        this.ratio = other.ratio;
        if (other.isSetResources()) {
            ArrayList arrayList = new ArrayList(other.resources.size());
            Iterator<SearchPageResource> it = other.resources.iterator();
            while (it.hasNext()) {
                arrayList.add(new SearchPageResource(it.next()));
            }
            this.resources = arrayList;
        }
    }
}
