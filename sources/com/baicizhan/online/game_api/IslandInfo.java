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
public class IslandInfo implements TBase<IslandInfo, _Fields>, Serializable, Cloneable, Comparable<IslandInfo> {
    private static final int __VERSION_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public List<IsLandItem> islands;
    public long version;
    private static final TStruct STRUCT_DESC = new TStruct("IslandInfo");
    private static final TField ISLANDS_FIELD_DESC = new TField("islands", (byte) 15, 1);
    private static final TField VERSION_FIELD_DESC = new TField("version", (byte) 10, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.IslandInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$IslandInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$IslandInfo$_Fields = iArr;
            try {
                iArr[_Fields.ISLANDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$IslandInfo$_Fields[_Fields.VERSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class IslandInfoStandardScheme extends StandardScheme<IslandInfo> {
        private IslandInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, IslandInfo struct) throws TException {
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
                    } else if (b11 == 10) {
                        struct.version = iprot.readI64();
                        struct.setVersionIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 15) {
                    TList readListBegin = iprot.readListBegin();
                    struct.islands = new ArrayList(readListBegin.size);
                    for (int i11 = 0; i11 < readListBegin.size; i11++) {
                        IsLandItem isLandItem = new IsLandItem();
                        isLandItem.read(iprot);
                        struct.islands.add(isLandItem);
                    }
                    iprot.readListEnd();
                    struct.setIslandsIsSet(true);
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
        public void write(TProtocol oprot, IslandInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(IslandInfo.STRUCT_DESC);
            if (struct.islands != null) {
                oprot.writeFieldBegin(IslandInfo.ISLANDS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.islands.size()));
                Iterator<IsLandItem> it = struct.islands.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(IslandInfo.VERSION_FIELD_DESC);
            oprot.writeI64(struct.version);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class IslandInfoStandardSchemeFactory implements SchemeFactory {
        private IslandInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public IslandInfoStandardScheme getScheme() {
            return new IslandInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class IslandInfoTupleScheme extends TupleScheme<IslandInfo> {
        private IslandInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, IslandInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            TList tList = new TList((byte) 12, tTupleProtocol.readI32());
            struct.islands = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                IsLandItem isLandItem = new IsLandItem();
                isLandItem.read(tTupleProtocol);
                struct.islands.add(isLandItem);
            }
            struct.setIslandsIsSet(true);
            struct.version = tTupleProtocol.readI64();
            struct.setVersionIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, IslandInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.islands.size());
            Iterator<IsLandItem> it = struct.islands.iterator();
            while (it.hasNext()) {
                it.next().write(tTupleProtocol);
            }
            tTupleProtocol.writeI64(struct.version);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class IslandInfoTupleSchemeFactory implements SchemeFactory {
        private IslandInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public IslandInfoTupleScheme getScheme() {
            return new IslandInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ISLANDS(1, "islands"),
        VERSION(2, "version");

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
                return ISLANDS;
            }
            if (fieldId != 2) {
                return null;
            }
            return VERSION;
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
        hashMap.put(StandardScheme.class, new IslandInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new IslandInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ISLANDS, (_Fields) new FieldMetaData("islands", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, IsLandItem.class))));
        enumMap.put((EnumMap) _Fields.VERSION, (_Fields) new FieldMetaData("version", (byte) 1, new FieldValueMetaData((byte) 10)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(IslandInfo.class, unmodifiableMap);
    }

    public IslandInfo() {
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

    public void addToIslands(IsLandItem elem) {
        if (this.islands == null) {
            this.islands = new ArrayList();
        }
        this.islands.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.islands = null;
        setVersionIsSet(false);
        this.version = 0L;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof IslandInfo)) {
            return equals((IslandInfo) that);
        }
        return false;
    }

    public List<IsLandItem> getIslands() {
        return this.islands;
    }

    public Iterator<IsLandItem> getIslandsIterator() {
        List<IsLandItem> list = this.islands;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getIslandsSize() {
        List<IsLandItem> list = this.islands;
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

    public boolean isSetIslands() {
        return this.islands != null;
    }

    public boolean isSetVersion() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public IslandInfo setIslands(List<IsLandItem> islands) {
        this.islands = islands;
        return this;
    }

    public void setIslandsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.islands = null;
    }

    public IslandInfo setVersion(long version) {
        this.version = version;
        setVersionIsSet(true);
        return this;
    }

    public void setVersionIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("IslandInfo(");
        sb2.append("islands:");
        List<IsLandItem> list = this.islands;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(j2.O);
        sb2.append("version:");
        sb2.append(this.version);
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetIslands() {
        this.islands = null;
    }

    public void unsetVersion() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void validate() throws TException {
        if (this.islands != null) {
            return;
        }
        throw new TProtocolException("Required field 'islands' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(IslandInfo other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetIslands()).compareTo(Boolean.valueOf(other.isSetIslands()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetIslands() && (compareTo2 = TBaseHelper.compareTo((List) this.islands, (List) other.islands)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetVersion()).compareTo(Boolean.valueOf(other.isSetVersion()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetVersion() || (compareTo = TBaseHelper.compareTo(this.version, other.version)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<IslandInfo, _Fields> deepCopy2() {
        return new IslandInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$IslandInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getIslands();
        }
        if (i11 == 2) {
            return Long.valueOf(getVersion());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$IslandInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetIslands();
        }
        if (i11 == 2) {
            return isSetVersion();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$IslandInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetIslands();
                return;
            } else {
                setIslands((List) value);
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetVersion();
        } else {
            setVersion(((Long) value).longValue());
        }
    }

    public IslandInfo(List<IsLandItem> islands, long version) {
        this();
        this.islands = islands;
        this.version = version;
        setVersionIsSet(true);
    }

    public boolean equals(IslandInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetIslands = isSetIslands();
        boolean isSetIslands2 = that.isSetIslands();
        return (!(isSetIslands || isSetIslands2) || (isSetIslands && isSetIslands2 && this.islands.equals(that.islands))) && this.version == that.version;
    }

    public IslandInfo(IslandInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetIslands()) {
            ArrayList arrayList = new ArrayList(other.islands.size());
            Iterator<IsLandItem> it = other.islands.iterator();
            while (it.hasNext()) {
                arrayList.add(new IsLandItem(it.next()));
            }
            this.islands = arrayList;
        }
        this.version = other.version;
    }
}
