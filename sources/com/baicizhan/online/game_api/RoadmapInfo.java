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
public class RoadmapInfo implements TBase<RoadmapInfo, _Fields>, Serializable, Cloneable, Comparable<RoadmapInfo> {
    private static final int __VERSION_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public List<CakeModule> cake_modules;
    private _Fields[] optionals;
    public List<Integer> topic_ids;
    public long version;
    private static final TStruct STRUCT_DESC = new TStruct("RoadmapInfo");
    private static final TField TOPIC_IDS_FIELD_DESC = new TField("topic_ids", (byte) 15, 1);
    private static final TField VERSION_FIELD_DESC = new TField("version", (byte) 10, 2);
    private static final TField CAKE_MODULES_FIELD_DESC = new TField("cake_modules", (byte) 15, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.RoadmapInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$RoadmapInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$RoadmapInfo$_Fields = iArr;
            try {
                iArr[_Fields.TOPIC_IDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$RoadmapInfo$_Fields[_Fields.VERSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$RoadmapInfo$_Fields[_Fields.CAKE_MODULES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RoadmapInfoStandardScheme extends StandardScheme<RoadmapInfo> {
        private RoadmapInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, RoadmapInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    break;
                }
                short s11 = readFieldBegin.f77768id;
                int i11 = 0;
                if (s11 != 1) {
                    if (s11 != 2) {
                        if (s11 != 3) {
                            TProtocolUtil.skip(iprot, b11);
                        } else if (b11 == 15) {
                            TList readListBegin = iprot.readListBegin();
                            struct.cake_modules = new ArrayList(readListBegin.size);
                            while (i11 < readListBegin.size) {
                                CakeModule cakeModule = new CakeModule();
                                cakeModule.read(iprot);
                                struct.cake_modules.add(cakeModule);
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setCake_modulesIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 10) {
                        struct.version = iprot.readI64();
                        struct.setVersionIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 15) {
                    TList readListBegin2 = iprot.readListBegin();
                    struct.topic_ids = new ArrayList(readListBegin2.size);
                    while (i11 < readListBegin2.size) {
                        struct.topic_ids.add(Integer.valueOf(iprot.readI32()));
                        i11++;
                    }
                    iprot.readListEnd();
                    struct.setTopic_idsIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetVersion()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'version' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, RoadmapInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(RoadmapInfo.STRUCT_DESC);
            if (struct.topic_ids != null) {
                oprot.writeFieldBegin(RoadmapInfo.TOPIC_IDS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 8, struct.topic_ids.size()));
                Iterator<Integer> it = struct.topic_ids.iterator();
                while (it.hasNext()) {
                    oprot.writeI32(it.next().intValue());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(RoadmapInfo.VERSION_FIELD_DESC);
            oprot.writeI64(struct.version);
            oprot.writeFieldEnd();
            if (struct.cake_modules != null && struct.isSetCake_modules()) {
                oprot.writeFieldBegin(RoadmapInfo.CAKE_MODULES_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.cake_modules.size()));
                Iterator<CakeModule> it2 = struct.cake_modules.iterator();
                while (it2.hasNext()) {
                    it2.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RoadmapInfoStandardSchemeFactory implements SchemeFactory {
        private RoadmapInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public RoadmapInfoStandardScheme getScheme() {
            return new RoadmapInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RoadmapInfoTupleScheme extends TupleScheme<RoadmapInfo> {
        private RoadmapInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, RoadmapInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            TList tList = new TList((byte) 8, tTupleProtocol.readI32());
            struct.topic_ids = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                struct.topic_ids.add(Integer.valueOf(tTupleProtocol.readI32()));
            }
            struct.setTopic_idsIsSet(true);
            struct.version = tTupleProtocol.readI64();
            struct.setVersionIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                TList tList2 = new TList((byte) 12, tTupleProtocol.readI32());
                struct.cake_modules = new ArrayList(tList2.size);
                for (int i12 = 0; i12 < tList2.size; i12++) {
                    CakeModule cakeModule = new CakeModule();
                    cakeModule.read(tTupleProtocol);
                    struct.cake_modules.add(cakeModule);
                }
                struct.setCake_modulesIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, RoadmapInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.topic_ids.size());
            Iterator<Integer> it = struct.topic_ids.iterator();
            while (it.hasNext()) {
                tTupleProtocol.writeI32(it.next().intValue());
            }
            tTupleProtocol.writeI64(struct.version);
            BitSet bitSet = new BitSet();
            if (struct.isSetCake_modules()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetCake_modules()) {
                tTupleProtocol.writeI32(struct.cake_modules.size());
                Iterator<CakeModule> it2 = struct.cake_modules.iterator();
                while (it2.hasNext()) {
                    it2.next().write(tTupleProtocol);
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RoadmapInfoTupleSchemeFactory implements SchemeFactory {
        private RoadmapInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public RoadmapInfoTupleScheme getScheme() {
            return new RoadmapInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TOPIC_IDS(1, "topic_ids"),
        VERSION(2, "version"),
        CAKE_MODULES(3, "cake_modules");

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
                return TOPIC_IDS;
            }
            if (fieldId == 2) {
                return VERSION;
            }
            if (fieldId != 3) {
                return null;
            }
            return CAKE_MODULES;
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
        hashMap.put(StandardScheme.class, new RoadmapInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new RoadmapInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TOPIC_IDS, (_Fields) new FieldMetaData("topic_ids", (byte) 1, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 8))));
        enumMap.put((EnumMap) _Fields.VERSION, (_Fields) new FieldMetaData("version", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.CAKE_MODULES, (_Fields) new FieldMetaData("cake_modules", (byte) 2, new ListMetaData((byte) 15, new StructMetaData((byte) 12, CakeModule.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(RoadmapInfo.class, unmodifiableMap);
    }

    public RoadmapInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.CAKE_MODULES};
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

    public void addToCake_modules(CakeModule elem) {
        if (this.cake_modules == null) {
            this.cake_modules = new ArrayList();
        }
        this.cake_modules.add(elem);
    }

    public void addToTopic_ids(int elem) {
        if (this.topic_ids == null) {
            this.topic_ids = new ArrayList();
        }
        this.topic_ids.add(Integer.valueOf(elem));
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.topic_ids = null;
        setVersionIsSet(false);
        this.version = 0L;
        this.cake_modules = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof RoadmapInfo)) {
            return equals((RoadmapInfo) that);
        }
        return false;
    }

    public List<CakeModule> getCake_modules() {
        return this.cake_modules;
    }

    public Iterator<CakeModule> getCake_modulesIterator() {
        List<CakeModule> list = this.cake_modules;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getCake_modulesSize() {
        List<CakeModule> list = this.cake_modules;
        if (list == null) {
            return 0;
        }
        return list.size();
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

    public long getVersion() {
        return this.version;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetCake_modules() {
        return this.cake_modules != null;
    }

    public boolean isSetTopic_ids() {
        return this.topic_ids != null;
    }

    public boolean isSetVersion() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public RoadmapInfo setCake_modules(List<CakeModule> cake_modules) {
        this.cake_modules = cake_modules;
        return this;
    }

    public void setCake_modulesIsSet(boolean value) {
        if (value) {
            return;
        }
        this.cake_modules = null;
    }

    public RoadmapInfo setTopic_ids(List<Integer> topic_ids) {
        this.topic_ids = topic_ids;
        return this;
    }

    public void setTopic_idsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.topic_ids = null;
    }

    public RoadmapInfo setVersion(long version) {
        this.version = version;
        setVersionIsSet(true);
        return this;
    }

    public void setVersionIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RoadmapInfo(");
        sb2.append("topic_ids:");
        List<Integer> list = this.topic_ids;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(j2.O);
        sb2.append("version:");
        sb2.append(this.version);
        if (isSetCake_modules()) {
            sb2.append(j2.O);
            sb2.append("cake_modules:");
            List<CakeModule> list2 = this.cake_modules;
            if (list2 == null) {
                sb2.append("null");
            } else {
                sb2.append(list2);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetCake_modules() {
        this.cake_modules = null;
    }

    public void unsetTopic_ids() {
        this.topic_ids = null;
    }

    public void unsetVersion() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void validate() throws TException {
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
    public int compareTo(RoadmapInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetTopic_ids()).compareTo(Boolean.valueOf(other.isSetTopic_ids()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetTopic_ids() && (compareTo3 = TBaseHelper.compareTo((List) this.topic_ids, (List) other.topic_ids)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetVersion()).compareTo(Boolean.valueOf(other.isSetVersion()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetVersion() && (compareTo2 = TBaseHelper.compareTo(this.version, other.version)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetCake_modules()).compareTo(Boolean.valueOf(other.isSetCake_modules()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetCake_modules() || (compareTo = TBaseHelper.compareTo((List) this.cake_modules, (List) other.cake_modules)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<RoadmapInfo, _Fields> deepCopy2() {
        return new RoadmapInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$RoadmapInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getTopic_ids();
        }
        if (i11 == 2) {
            return Long.valueOf(getVersion());
        }
        if (i11 == 3) {
            return getCake_modules();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$RoadmapInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetTopic_ids();
        }
        if (i11 == 2) {
            return isSetVersion();
        }
        if (i11 == 3) {
            return isSetCake_modules();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$RoadmapInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetTopic_ids();
                return;
            } else {
                setTopic_ids((List) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetVersion();
                return;
            } else {
                setVersion(((Long) value).longValue());
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetCake_modules();
        } else {
            setCake_modules((List) value);
        }
    }

    public boolean equals(RoadmapInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetTopic_ids = isSetTopic_ids();
        boolean isSetTopic_ids2 = that.isSetTopic_ids();
        if (((isSetTopic_ids || isSetTopic_ids2) && !(isSetTopic_ids && isSetTopic_ids2 && this.topic_ids.equals(that.topic_ids))) || this.version != that.version) {
            return false;
        }
        boolean isSetCake_modules = isSetCake_modules();
        boolean isSetCake_modules2 = that.isSetCake_modules();
        if (isSetCake_modules || isSetCake_modules2) {
            return isSetCake_modules && isSetCake_modules2 && this.cake_modules.equals(that.cake_modules);
        }
        return true;
    }

    public RoadmapInfo(List<Integer> topic_ids, long version) {
        this();
        this.topic_ids = topic_ids;
        this.version = version;
        setVersionIsSet(true);
    }

    public RoadmapInfo(RoadmapInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.CAKE_MODULES};
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetTopic_ids()) {
            this.topic_ids = new ArrayList(other.topic_ids);
        }
        this.version = other.version;
        if (other.isSetCake_modules()) {
            ArrayList arrayList = new ArrayList(other.cake_modules.size());
            Iterator<CakeModule> it = other.cake_modules.iterator();
            while (it.hasNext()) {
                arrayList.add(new CakeModule(it.next()));
            }
            this.cake_modules = arrayList;
        }
    }
}
