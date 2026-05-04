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
import org.apache.thrift.TBase;
import org.apache.thrift.TBaseHelper;
import org.apache.thrift.TException;
import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.meta_data.FieldMetaData;
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
public class EquipmentInfo implements TBase<EquipmentInfo, _Fields>, Serializable, Cloneable, Comparable<EquipmentInfo> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public List<AdvItem> lefts;
    public List<ResourceItem> resources;
    public List<AdvItem> rights;
    private static final TStruct STRUCT_DESC = new TStruct("EquipmentInfo");
    private static final TField LEFTS_FIELD_DESC = new TField("lefts", (byte) 15, 1);
    private static final TField RIGHTS_FIELD_DESC = new TField("rights", (byte) 15, 2);
    private static final TField RESOURCES_FIELD_DESC = new TField("resources", (byte) 15, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.EquipmentInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$EquipmentInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$EquipmentInfo$_Fields = iArr;
            try {
                iArr[_Fields.LEFTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$EquipmentInfo$_Fields[_Fields.RIGHTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$EquipmentInfo$_Fields[_Fields.RESOURCES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class EquipmentInfoStandardScheme extends StandardScheme<EquipmentInfo> {
        private EquipmentInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, EquipmentInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    struct.validate();
                    return;
                }
                short s11 = readFieldBegin.f77768id;
                int i11 = 0;
                if (s11 != 1) {
                    if (s11 != 2) {
                        if (s11 != 3) {
                            TProtocolUtil.skip(iprot, b11);
                        } else if (b11 == 15) {
                            TList readListBegin = iprot.readListBegin();
                            struct.resources = new ArrayList(readListBegin.size);
                            while (i11 < readListBegin.size) {
                                ResourceItem resourceItem = new ResourceItem();
                                resourceItem.read(iprot);
                                struct.resources.add(resourceItem);
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setResourcesIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 15) {
                        TList readListBegin2 = iprot.readListBegin();
                        struct.rights = new ArrayList(readListBegin2.size);
                        while (i11 < readListBegin2.size) {
                            AdvItem advItem = new AdvItem();
                            advItem.read(iprot);
                            struct.rights.add(advItem);
                            i11++;
                        }
                        iprot.readListEnd();
                        struct.setRightsIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 15) {
                    TList readListBegin3 = iprot.readListBegin();
                    struct.lefts = new ArrayList(readListBegin3.size);
                    while (i11 < readListBegin3.size) {
                        AdvItem advItem2 = new AdvItem();
                        advItem2.read(iprot);
                        struct.lefts.add(advItem2);
                        i11++;
                    }
                    iprot.readListEnd();
                    struct.setLeftsIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, EquipmentInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(EquipmentInfo.STRUCT_DESC);
            if (struct.lefts != null) {
                oprot.writeFieldBegin(EquipmentInfo.LEFTS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.lefts.size()));
                Iterator<AdvItem> it = struct.lefts.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.rights != null) {
                oprot.writeFieldBegin(EquipmentInfo.RIGHTS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.rights.size()));
                Iterator<AdvItem> it2 = struct.rights.iterator();
                while (it2.hasNext()) {
                    it2.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.resources != null) {
                oprot.writeFieldBegin(EquipmentInfo.RESOURCES_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.resources.size()));
                Iterator<ResourceItem> it3 = struct.resources.iterator();
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
    public static class EquipmentInfoStandardSchemeFactory implements SchemeFactory {
        private EquipmentInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public EquipmentInfoStandardScheme getScheme() {
            return new EquipmentInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class EquipmentInfoTupleScheme extends TupleScheme<EquipmentInfo> {
        private EquipmentInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, EquipmentInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            TList tList = new TList((byte) 12, tTupleProtocol.readI32());
            struct.lefts = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                AdvItem advItem = new AdvItem();
                advItem.read(tTupleProtocol);
                struct.lefts.add(advItem);
            }
            struct.setLeftsIsSet(true);
            TList tList2 = new TList((byte) 12, tTupleProtocol.readI32());
            struct.rights = new ArrayList(tList2.size);
            for (int i12 = 0; i12 < tList2.size; i12++) {
                AdvItem advItem2 = new AdvItem();
                advItem2.read(tTupleProtocol);
                struct.rights.add(advItem2);
            }
            struct.setRightsIsSet(true);
            TList tList3 = new TList((byte) 12, tTupleProtocol.readI32());
            struct.resources = new ArrayList(tList3.size);
            for (int i13 = 0; i13 < tList3.size; i13++) {
                ResourceItem resourceItem = new ResourceItem();
                resourceItem.read(tTupleProtocol);
                struct.resources.add(resourceItem);
            }
            struct.setResourcesIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, EquipmentInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.lefts.size());
            Iterator<AdvItem> it = struct.lefts.iterator();
            while (it.hasNext()) {
                it.next().write(tTupleProtocol);
            }
            tTupleProtocol.writeI32(struct.rights.size());
            Iterator<AdvItem> it2 = struct.rights.iterator();
            while (it2.hasNext()) {
                it2.next().write(tTupleProtocol);
            }
            tTupleProtocol.writeI32(struct.resources.size());
            Iterator<ResourceItem> it3 = struct.resources.iterator();
            while (it3.hasNext()) {
                it3.next().write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class EquipmentInfoTupleSchemeFactory implements SchemeFactory {
        private EquipmentInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public EquipmentInfoTupleScheme getScheme() {
            return new EquipmentInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        LEFTS(1, "lefts"),
        RIGHTS(2, "rights"),
        RESOURCES(3, "resources");

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
                return LEFTS;
            }
            if (fieldId == 2) {
                return RIGHTS;
            }
            if (fieldId != 3) {
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
        hashMap.put(StandardScheme.class, new EquipmentInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new EquipmentInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.LEFTS, (_Fields) new FieldMetaData("lefts", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, AdvItem.class))));
        enumMap.put((EnumMap) _Fields.RIGHTS, (_Fields) new FieldMetaData("rights", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, AdvItem.class))));
        enumMap.put((EnumMap) _Fields.RESOURCES, (_Fields) new FieldMetaData("resources", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, ResourceItem.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(EquipmentInfo.class, unmodifiableMap);
    }

    public EquipmentInfo() {
    }

    private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
        try {
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

    public void addToLefts(AdvItem elem) {
        if (this.lefts == null) {
            this.lefts = new ArrayList();
        }
        this.lefts.add(elem);
    }

    public void addToResources(ResourceItem elem) {
        if (this.resources == null) {
            this.resources = new ArrayList();
        }
        this.resources.add(elem);
    }

    public void addToRights(AdvItem elem) {
        if (this.rights == null) {
            this.rights = new ArrayList();
        }
        this.rights.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.lefts = null;
        this.rights = null;
        this.resources = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof EquipmentInfo)) {
            return equals((EquipmentInfo) that);
        }
        return false;
    }

    public List<AdvItem> getLefts() {
        return this.lefts;
    }

    public Iterator<AdvItem> getLeftsIterator() {
        List<AdvItem> list = this.lefts;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getLeftsSize() {
        List<AdvItem> list = this.lefts;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<ResourceItem> getResources() {
        return this.resources;
    }

    public Iterator<ResourceItem> getResourcesIterator() {
        List<ResourceItem> list = this.resources;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getResourcesSize() {
        List<ResourceItem> list = this.resources;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<AdvItem> getRights() {
        return this.rights;
    }

    public Iterator<AdvItem> getRightsIterator() {
        List<AdvItem> list = this.rights;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getRightsSize() {
        List<AdvItem> list = this.rights;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetLefts() {
        return this.lefts != null;
    }

    public boolean isSetResources() {
        return this.resources != null;
    }

    public boolean isSetRights() {
        return this.rights != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public EquipmentInfo setLefts(List<AdvItem> lefts) {
        this.lefts = lefts;
        return this;
    }

    public void setLeftsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.lefts = null;
    }

    public EquipmentInfo setResources(List<ResourceItem> resources) {
        this.resources = resources;
        return this;
    }

    public void setResourcesIsSet(boolean value) {
        if (value) {
            return;
        }
        this.resources = null;
    }

    public EquipmentInfo setRights(List<AdvItem> rights) {
        this.rights = rights;
        return this;
    }

    public void setRightsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.rights = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("EquipmentInfo(");
        sb2.append("lefts:");
        List<AdvItem> list = this.lefts;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(j2.O);
        sb2.append("rights:");
        List<AdvItem> list2 = this.rights;
        if (list2 == null) {
            sb2.append("null");
        } else {
            sb2.append(list2);
        }
        sb2.append(j2.O);
        sb2.append("resources:");
        List<ResourceItem> list3 = this.resources;
        if (list3 == null) {
            sb2.append("null");
        } else {
            sb2.append(list3);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetLefts() {
        this.lefts = null;
    }

    public void unsetResources() {
        this.resources = null;
    }

    public void unsetRights() {
        this.rights = null;
    }

    public void validate() throws TException {
        if (this.lefts == null) {
            throw new TProtocolException("Required field 'lefts' was not present! Struct: " + toString());
        }
        if (this.rights == null) {
            throw new TProtocolException("Required field 'rights' was not present! Struct: " + toString());
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

    public EquipmentInfo(List<AdvItem> lefts, List<AdvItem> rights, List<ResourceItem> resources) {
        this();
        this.lefts = lefts;
        this.rights = rights;
        this.resources = resources;
    }

    @Override // java.lang.Comparable
    public int compareTo(EquipmentInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetLefts()).compareTo(Boolean.valueOf(other.isSetLefts()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetLefts() && (compareTo3 = TBaseHelper.compareTo((List) this.lefts, (List) other.lefts)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetRights()).compareTo(Boolean.valueOf(other.isSetRights()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetRights() && (compareTo2 = TBaseHelper.compareTo((List) this.rights, (List) other.rights)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetResources()).compareTo(Boolean.valueOf(other.isSetResources()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetResources() || (compareTo = TBaseHelper.compareTo((List) this.resources, (List) other.resources)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<EquipmentInfo, _Fields> deepCopy2() {
        return new EquipmentInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$EquipmentInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getLefts();
        }
        if (i11 == 2) {
            return getRights();
        }
        if (i11 == 3) {
            return getResources();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$EquipmentInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetLefts();
        }
        if (i11 == 2) {
            return isSetRights();
        }
        if (i11 == 3) {
            return isSetResources();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$EquipmentInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetLefts();
                return;
            } else {
                setLefts((List) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetRights();
                return;
            } else {
                setRights((List) value);
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetResources();
        } else {
            setResources((List) value);
        }
    }

    public boolean equals(EquipmentInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetLefts = isSetLefts();
        boolean isSetLefts2 = that.isSetLefts();
        if ((isSetLefts || isSetLefts2) && !(isSetLefts && isSetLefts2 && this.lefts.equals(that.lefts))) {
            return false;
        }
        boolean isSetRights = isSetRights();
        boolean isSetRights2 = that.isSetRights();
        if ((isSetRights || isSetRights2) && !(isSetRights && isSetRights2 && this.rights.equals(that.rights))) {
            return false;
        }
        boolean isSetResources = isSetResources();
        boolean isSetResources2 = that.isSetResources();
        if (isSetResources || isSetResources2) {
            return isSetResources && isSetResources2 && this.resources.equals(that.resources);
        }
        return true;
    }

    public EquipmentInfo(EquipmentInfo other) {
        if (other.isSetLefts()) {
            ArrayList arrayList = new ArrayList(other.lefts.size());
            Iterator<AdvItem> it = other.lefts.iterator();
            while (it.hasNext()) {
                arrayList.add(new AdvItem(it.next()));
            }
            this.lefts = arrayList;
        }
        if (other.isSetRights()) {
            ArrayList arrayList2 = new ArrayList(other.rights.size());
            Iterator<AdvItem> it2 = other.rights.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new AdvItem(it2.next()));
            }
            this.rights = arrayList2;
        }
        if (other.isSetResources()) {
            ArrayList arrayList3 = new ArrayList(other.resources.size());
            Iterator<ResourceItem> it3 = other.resources.iterator();
            while (it3.hasNext()) {
                arrayList3.add(new ResourceItem(it3.next()));
            }
            this.resources = arrayList3;
        }
    }
}
