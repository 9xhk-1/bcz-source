package com.baicizhan.online.user_study_api;

import com.baicizhan.main.activity.errorfb.WordErrorFeedbackActivity;
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
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
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
public class TrainPageResource implements TBase<TrainPageResource, _Fields>, Serializable, Cloneable, Comparable<TrainPageResource> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public List<ModuleResourceType> items;
    public String module_name;
    private static final TStruct STRUCT_DESC = new TStruct("TrainPageResource");
    private static final TField MODULE_NAME_FIELD_DESC = new TField("module_name", (byte) 11, 1);
    private static final TField ITEMS_FIELD_DESC = new TField(WordErrorFeedbackActivity.f18460k, (byte) 15, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.TrainPageResource$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$TrainPageResource$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$TrainPageResource$_Fields = iArr;
            try {
                iArr[_Fields.MODULE_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$TrainPageResource$_Fields[_Fields.ITEMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TrainPageResourceStandardScheme extends StandardScheme<TrainPageResource> {
        private TrainPageResourceStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, TrainPageResource struct) throws TException {
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
                if (s11 != 1) {
                    if (s11 != 2) {
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 15) {
                        TList readListBegin = iprot.readListBegin();
                        struct.items = new ArrayList(readListBegin.size);
                        for (int i11 = 0; i11 < readListBegin.size; i11++) {
                            struct.items.add(ModuleResourceType.findByValue(iprot.readI32()));
                        }
                        iprot.readListEnd();
                        struct.setItemsIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.module_name = iprot.readString();
                    struct.setModule_nameIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, TrainPageResource struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(TrainPageResource.STRUCT_DESC);
            if (struct.module_name != null) {
                oprot.writeFieldBegin(TrainPageResource.MODULE_NAME_FIELD_DESC);
                oprot.writeString(struct.module_name);
                oprot.writeFieldEnd();
            }
            if (struct.items != null) {
                oprot.writeFieldBegin(TrainPageResource.ITEMS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 8, struct.items.size()));
                Iterator<ModuleResourceType> it = struct.items.iterator();
                while (it.hasNext()) {
                    oprot.writeI32(it.next().getValue());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TrainPageResourceStandardSchemeFactory implements SchemeFactory {
        private TrainPageResourceStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public TrainPageResourceStandardScheme getScheme() {
            return new TrainPageResourceStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TrainPageResourceTupleScheme extends TupleScheme<TrainPageResource> {
        private TrainPageResourceTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, TrainPageResource struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.module_name = tTupleProtocol.readString();
            struct.setModule_nameIsSet(true);
            TList tList = new TList((byte) 8, tTupleProtocol.readI32());
            struct.items = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                struct.items.add(ModuleResourceType.findByValue(tTupleProtocol.readI32()));
            }
            struct.setItemsIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, TrainPageResource struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.module_name);
            tTupleProtocol.writeI32(struct.items.size());
            Iterator<ModuleResourceType> it = struct.items.iterator();
            while (it.hasNext()) {
                tTupleProtocol.writeI32(it.next().getValue());
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TrainPageResourceTupleSchemeFactory implements SchemeFactory {
        private TrainPageResourceTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public TrainPageResourceTupleScheme getScheme() {
            return new TrainPageResourceTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        MODULE_NAME(1, "module_name"),
        ITEMS(2, WordErrorFeedbackActivity.f18460k);

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
                return MODULE_NAME;
            }
            if (fieldId != 2) {
                return null;
            }
            return ITEMS;
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
        hashMap.put(StandardScheme.class, new TrainPageResourceStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new TrainPageResourceTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.MODULE_NAME, (_Fields) new FieldMetaData("module_name", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ITEMS, (_Fields) new FieldMetaData(WordErrorFeedbackActivity.f18460k, (byte) 1, new ListMetaData((byte) 15, new EnumMetaData((byte) 16, ModuleResourceType.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(TrainPageResource.class, unmodifiableMap);
    }

    public TrainPageResource() {
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

    public void addToItems(ModuleResourceType elem) {
        if (this.items == null) {
            this.items = new ArrayList();
        }
        this.items.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.module_name = null;
        this.items = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof TrainPageResource)) {
            return equals((TrainPageResource) that);
        }
        return false;
    }

    public List<ModuleResourceType> getItems() {
        return this.items;
    }

    public Iterator<ModuleResourceType> getItemsIterator() {
        List<ModuleResourceType> list = this.items;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getItemsSize() {
        List<ModuleResourceType> list = this.items;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public String getModule_name() {
        return this.module_name;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetItems() {
        return this.items != null;
    }

    public boolean isSetModule_name() {
        return this.module_name != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public TrainPageResource setItems(List<ModuleResourceType> items) {
        this.items = items;
        return this;
    }

    public void setItemsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.items = null;
    }

    public TrainPageResource setModule_name(String module_name) {
        this.module_name = module_name;
        return this;
    }

    public void setModule_nameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.module_name = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TrainPageResource(");
        sb2.append("module_name:");
        String str = this.module_name;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("items:");
        List<ModuleResourceType> list = this.items;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetItems() {
        this.items = null;
    }

    public void unsetModule_name() {
        this.module_name = null;
    }

    public void validate() throws TException {
        if (this.module_name == null) {
            throw new TProtocolException("Required field 'module_name' was not present! Struct: " + toString());
        }
        if (this.items != null) {
            return;
        }
        throw new TProtocolException("Required field 'items' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    public TrainPageResource(String module_name, List<ModuleResourceType> items) {
        this();
        this.module_name = module_name;
        this.items = items;
    }

    @Override // java.lang.Comparable
    public int compareTo(TrainPageResource other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetModule_name()).compareTo(Boolean.valueOf(other.isSetModule_name()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetModule_name() && (compareTo2 = TBaseHelper.compareTo(this.module_name, other.module_name)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetItems()).compareTo(Boolean.valueOf(other.isSetItems()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetItems() || (compareTo = TBaseHelper.compareTo((List) this.items, (List) other.items)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<TrainPageResource, _Fields> deepCopy2() {
        return new TrainPageResource(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$TrainPageResource$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getModule_name();
        }
        if (i11 == 2) {
            return getItems();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$TrainPageResource$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetModule_name();
        }
        if (i11 == 2) {
            return isSetItems();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$TrainPageResource$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetModule_name();
                return;
            } else {
                setModule_name((String) value);
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetItems();
        } else {
            setItems((List) value);
        }
    }

    public boolean equals(TrainPageResource that) {
        if (that == null) {
            return false;
        }
        boolean isSetModule_name = isSetModule_name();
        boolean isSetModule_name2 = that.isSetModule_name();
        if ((isSetModule_name || isSetModule_name2) && !(isSetModule_name && isSetModule_name2 && this.module_name.equals(that.module_name))) {
            return false;
        }
        boolean isSetItems = isSetItems();
        boolean isSetItems2 = that.isSetItems();
        if (isSetItems || isSetItems2) {
            return isSetItems && isSetItems2 && this.items.equals(that.items);
        }
        return true;
    }

    public TrainPageResource(TrainPageResource other) {
        if (other.isSetModule_name()) {
            this.module_name = other.module_name;
        }
        if (other.isSetItems()) {
            ArrayList arrayList = new ArrayList(other.items.size());
            Iterator<ModuleResourceType> it = other.items.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            this.items = arrayList;
        }
    }
}
