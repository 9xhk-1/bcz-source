package com.baicizhan.online.resource_api;

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
public class RootItem implements TBase<RootItem, _Fields>, Serializable, Cloneable, Comparable<RootItem> {
    private static final int __ROOT_ID_ISSET_ID = 0;
    private static final int __ROOT_TYPE_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String root_en;
    public int root_id;
    public int root_type;
    public List<Integer> topic_ids;
    private static final TStruct STRUCT_DESC = new TStruct("RootItem");
    private static final TField ROOT_ID_FIELD_DESC = new TField("root_id", (byte) 8, 1);
    private static final TField ROOT_EN_FIELD_DESC = new TField("root_en", (byte) 11, 2);
    private static final TField ROOT_TYPE_FIELD_DESC = new TField("root_type", (byte) 8, 3);
    private static final TField TOPIC_IDS_FIELD_DESC = new TField("topic_ids", (byte) 15, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.resource_api.RootItem$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$RootItem$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$RootItem$_Fields = iArr;
            try {
                iArr[_Fields.ROOT_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$RootItem$_Fields[_Fields.ROOT_EN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$RootItem$_Fields[_Fields.ROOT_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$RootItem$_Fields[_Fields.TOPIC_IDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RootItemStandardScheme extends StandardScheme<RootItem> {
        private RootItemStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, RootItem struct) throws TException {
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
                                struct.topic_ids = new ArrayList(readListBegin.size);
                                for (int i11 = 0; i11 < readListBegin.size; i11++) {
                                    struct.topic_ids.add(Integer.valueOf(iprot.readI32()));
                                }
                                iprot.readListEnd();
                                struct.setTopic_idsIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 8) {
                            struct.root_type = iprot.readI32();
                            struct.setRoot_typeIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.root_en = iprot.readString();
                        struct.setRoot_enIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.root_id = iprot.readI32();
                    struct.setRoot_idIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetRoot_id()) {
                throw new TProtocolException("Required field 'root_id' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetRoot_type()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'root_type' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, RootItem struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(RootItem.STRUCT_DESC);
            oprot.writeFieldBegin(RootItem.ROOT_ID_FIELD_DESC);
            oprot.writeI32(struct.root_id);
            oprot.writeFieldEnd();
            if (struct.root_en != null) {
                oprot.writeFieldBegin(RootItem.ROOT_EN_FIELD_DESC);
                oprot.writeString(struct.root_en);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(RootItem.ROOT_TYPE_FIELD_DESC);
            oprot.writeI32(struct.root_type);
            oprot.writeFieldEnd();
            if (struct.topic_ids != null) {
                oprot.writeFieldBegin(RootItem.TOPIC_IDS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 8, struct.topic_ids.size()));
                Iterator<Integer> it = struct.topic_ids.iterator();
                while (it.hasNext()) {
                    oprot.writeI32(it.next().intValue());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RootItemStandardSchemeFactory implements SchemeFactory {
        private RootItemStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public RootItemStandardScheme getScheme() {
            return new RootItemStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RootItemTupleScheme extends TupleScheme<RootItem> {
        private RootItemTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, RootItem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.root_id = tTupleProtocol.readI32();
            struct.setRoot_idIsSet(true);
            struct.root_en = tTupleProtocol.readString();
            struct.setRoot_enIsSet(true);
            struct.root_type = tTupleProtocol.readI32();
            struct.setRoot_typeIsSet(true);
            TList tList = new TList((byte) 8, tTupleProtocol.readI32());
            struct.topic_ids = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                struct.topic_ids.add(Integer.valueOf(tTupleProtocol.readI32()));
            }
            struct.setTopic_idsIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, RootItem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.root_id);
            tTupleProtocol.writeString(struct.root_en);
            tTupleProtocol.writeI32(struct.root_type);
            tTupleProtocol.writeI32(struct.topic_ids.size());
            Iterator<Integer> it = struct.topic_ids.iterator();
            while (it.hasNext()) {
                tTupleProtocol.writeI32(it.next().intValue());
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RootItemTupleSchemeFactory implements SchemeFactory {
        private RootItemTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public RootItemTupleScheme getScheme() {
            return new RootItemTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ROOT_ID(1, "root_id"),
        ROOT_EN(2, "root_en"),
        ROOT_TYPE(3, "root_type"),
        TOPIC_IDS(4, "topic_ids");

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
                return ROOT_ID;
            }
            if (fieldId == 2) {
                return ROOT_EN;
            }
            if (fieldId == 3) {
                return ROOT_TYPE;
            }
            if (fieldId != 4) {
                return null;
            }
            return TOPIC_IDS;
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
        hashMap.put(StandardScheme.class, new RootItemStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new RootItemTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ROOT_ID, (_Fields) new FieldMetaData("root_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.ROOT_EN, (_Fields) new FieldMetaData("root_en", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ROOT_TYPE, (_Fields) new FieldMetaData("root_type", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.TOPIC_IDS, (_Fields) new FieldMetaData("topic_ids", (byte) 1, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 8))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(RootItem.class, unmodifiableMap);
    }

    public RootItem() {
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

    public void addToTopic_ids(int elem) {
        if (this.topic_ids == null) {
            this.topic_ids = new ArrayList();
        }
        this.topic_ids.add(Integer.valueOf(elem));
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        setRoot_idIsSet(false);
        this.root_id = 0;
        this.root_en = null;
        setRoot_typeIsSet(false);
        this.root_type = 0;
        this.topic_ids = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof RootItem)) {
            return equals((RootItem) that);
        }
        return false;
    }

    public String getRoot_en() {
        return this.root_en;
    }

    public int getRoot_id() {
        return this.root_id;
    }

    public int getRoot_type() {
        return this.root_type;
    }

    public List<Integer> getTopic_ids() {
        return this.topic_ids;
    }

    public Iterator<Integer> getTopic_idsIterator() {
        List<Integer> list = this.topic_ids;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getTopic_idsSize() {
        List<Integer> list = this.topic_ids;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetRoot_en() {
        return this.root_en != null;
    }

    public boolean isSetRoot_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetRoot_type() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetTopic_ids() {
        return this.topic_ids != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public RootItem setRoot_en(String root_en) {
        this.root_en = root_en;
        return this;
    }

    public void setRoot_enIsSet(boolean value) {
        if (value) {
            return;
        }
        this.root_en = null;
    }

    public RootItem setRoot_id(int root_id) {
        this.root_id = root_id;
        setRoot_idIsSet(true);
        return this;
    }

    public void setRoot_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public RootItem setRoot_type(int root_type) {
        this.root_type = root_type;
        setRoot_typeIsSet(true);
        return this;
    }

    public void setRoot_typeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public RootItem setTopic_ids(List<Integer> topic_ids) {
        this.topic_ids = topic_ids;
        return this;
    }

    public void setTopic_idsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.topic_ids = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RootItem(");
        sb2.append("root_id:");
        sb2.append(this.root_id);
        sb2.append(j2.O);
        sb2.append("root_en:");
        String str = this.root_en;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("root_type:");
        sb2.append(this.root_type);
        sb2.append(j2.O);
        sb2.append("topic_ids:");
        List<Integer> list = this.topic_ids;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetRoot_en() {
        this.root_en = null;
    }

    public void unsetRoot_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetRoot_type() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetTopic_ids() {
        this.topic_ids = null;
    }

    public void validate() throws TException {
        if (this.root_en == null) {
            throw new TProtocolException("Required field 'root_en' was not present! Struct: " + toString());
        }
        if (this.topic_ids != null) {
            return;
        }
        throw new TProtocolException("Required field 'topic_ids' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(RootItem other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetRoot_id()).compareTo(Boolean.valueOf(other.isSetRoot_id()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetRoot_id() && (compareTo4 = TBaseHelper.compareTo(this.root_id, other.root_id)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetRoot_en()).compareTo(Boolean.valueOf(other.isSetRoot_en()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetRoot_en() && (compareTo3 = TBaseHelper.compareTo(this.root_en, other.root_en)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetRoot_type()).compareTo(Boolean.valueOf(other.isSetRoot_type()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetRoot_type() && (compareTo2 = TBaseHelper.compareTo(this.root_type, other.root_type)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetTopic_ids()).compareTo(Boolean.valueOf(other.isSetTopic_ids()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetTopic_ids() || (compareTo = TBaseHelper.compareTo((List) this.topic_ids, (List) other.topic_ids)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<RootItem, _Fields> deepCopy2() {
        return new RootItem(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$RootItem$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getRoot_id());
        }
        if (i11 == 2) {
            return getRoot_en();
        }
        if (i11 == 3) {
            return Integer.valueOf(getRoot_type());
        }
        if (i11 == 4) {
            return getTopic_ids();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$RootItem$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetRoot_id();
        }
        if (i11 == 2) {
            return isSetRoot_en();
        }
        if (i11 == 3) {
            return isSetRoot_type();
        }
        if (i11 == 4) {
            return isSetTopic_ids();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$RootItem$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetRoot_id();
                return;
            } else {
                setRoot_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetRoot_en();
                return;
            } else {
                setRoot_en((String) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetRoot_type();
                return;
            } else {
                setRoot_type(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetTopic_ids();
        } else {
            setTopic_ids((List) value);
        }
    }

    public RootItem(int root_id, String root_en, int root_type, List<Integer> topic_ids) {
        this();
        this.root_id = root_id;
        setRoot_idIsSet(true);
        this.root_en = root_en;
        this.root_type = root_type;
        setRoot_typeIsSet(true);
        this.topic_ids = topic_ids;
    }

    public boolean equals(RootItem that) {
        if (that == null || this.root_id != that.root_id) {
            return false;
        }
        boolean isSetRoot_en = isSetRoot_en();
        boolean isSetRoot_en2 = that.isSetRoot_en();
        if (((isSetRoot_en || isSetRoot_en2) && !(isSetRoot_en && isSetRoot_en2 && this.root_en.equals(that.root_en))) || this.root_type != that.root_type) {
            return false;
        }
        boolean isSetTopic_ids = isSetTopic_ids();
        boolean isSetTopic_ids2 = that.isSetTopic_ids();
        if (isSetTopic_ids || isSetTopic_ids2) {
            return isSetTopic_ids && isSetTopic_ids2 && this.topic_ids.equals(that.topic_ids);
        }
        return true;
    }

    public RootItem(RootItem other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.root_id = other.root_id;
        if (other.isSetRoot_en()) {
            this.root_en = other.root_en;
        }
        this.root_type = other.root_type;
        if (other.isSetTopic_ids()) {
            this.topic_ids = new ArrayList(other.topic_ids);
        }
    }
}
