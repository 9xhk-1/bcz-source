package com.baicizhan.online.game_api;

import com.baicizhan.client.business.dataset.provider.a;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TBase;
import org.apache.thrift.TBaseHelper;
import org.apache.thrift.TException;
import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TField;
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
public class IsLandItem implements TBase<IsLandItem, _Fields>, Serializable, Cloneable, Comparable<IsLandItem> {
    private static final int __ISLAND_INDEX_ISSET_ID = 1;
    private static final int __WORD_COUNT_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int island_index;
    public int word_count;
    private static final TStruct STRUCT_DESC = new TStruct("IsLandItem");
    private static final TField WORD_COUNT_FIELD_DESC = new TField(a.z.C0267a.f16355f, (byte) 8, 1);
    private static final TField ISLAND_INDEX_FIELD_DESC = new TField("island_index", (byte) 8, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.IsLandItem$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$IsLandItem$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$IsLandItem$_Fields = iArr;
            try {
                iArr[_Fields.WORD_COUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$IsLandItem$_Fields[_Fields.ISLAND_INDEX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class IsLandItemStandardScheme extends StandardScheme<IsLandItem> {
        private IsLandItemStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, IsLandItem struct) throws TException {
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
                    } else if (b11 == 8) {
                        struct.island_index = iprot.readI32();
                        struct.setIsland_indexIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.word_count = iprot.readI32();
                    struct.setWord_countIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetWord_count()) {
                throw new TProtocolException("Required field 'word_count' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetIsland_index()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'island_index' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, IsLandItem struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(IsLandItem.STRUCT_DESC);
            oprot.writeFieldBegin(IsLandItem.WORD_COUNT_FIELD_DESC);
            oprot.writeI32(struct.word_count);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(IsLandItem.ISLAND_INDEX_FIELD_DESC);
            oprot.writeI32(struct.island_index);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class IsLandItemStandardSchemeFactory implements SchemeFactory {
        private IsLandItemStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public IsLandItemStandardScheme getScheme() {
            return new IsLandItemStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class IsLandItemTupleScheme extends TupleScheme<IsLandItem> {
        private IsLandItemTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, IsLandItem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.word_count = tTupleProtocol.readI32();
            struct.setWord_countIsSet(true);
            struct.island_index = tTupleProtocol.readI32();
            struct.setIsland_indexIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, IsLandItem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.word_count);
            tTupleProtocol.writeI32(struct.island_index);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class IsLandItemTupleSchemeFactory implements SchemeFactory {
        private IsLandItemTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public IsLandItemTupleScheme getScheme() {
            return new IsLandItemTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        WORD_COUNT(1, a.z.C0267a.f16355f),
        ISLAND_INDEX(2, "island_index");

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
                return WORD_COUNT;
            }
            if (fieldId != 2) {
                return null;
            }
            return ISLAND_INDEX;
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
        hashMap.put(StandardScheme.class, new IsLandItemStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new IsLandItemTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.WORD_COUNT, (_Fields) new FieldMetaData(a.z.C0267a.f16355f, (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.ISLAND_INDEX, (_Fields) new FieldMetaData("island_index", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(IsLandItem.class, unmodifiableMap);
    }

    public IsLandItem() {
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

    @Override // org.apache.thrift.TBase
    public void clear() {
        setWord_countIsSet(false);
        this.word_count = 0;
        setIsland_indexIsSet(false);
        this.island_index = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof IsLandItem)) {
            return equals((IsLandItem) that);
        }
        return false;
    }

    public int getIsland_index() {
        return this.island_index;
    }

    public int getWord_count() {
        return this.word_count;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetIsland_index() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetWord_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public IsLandItem setIsland_index(int island_index) {
        this.island_index = island_index;
        setIsland_indexIsSet(true);
        return this;
    }

    public void setIsland_indexIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public IsLandItem setWord_count(int word_count) {
        this.word_count = word_count;
        setWord_countIsSet(true);
        return this;
    }

    public void setWord_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        return "IsLandItem(word_count:" + this.word_count + j2.O + "island_index:" + this.island_index + pn.j.f81007d;
    }

    public void unsetIsland_index() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetWord_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(IsLandItem other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetWord_count()).compareTo(Boolean.valueOf(other.isSetWord_count()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetWord_count() && (compareTo2 = TBaseHelper.compareTo(this.word_count, other.word_count)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetIsland_index()).compareTo(Boolean.valueOf(other.isSetIsland_index()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetIsland_index() || (compareTo = TBaseHelper.compareTo(this.island_index, other.island_index)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<IsLandItem, _Fields> deepCopy2() {
        return new IsLandItem(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$IsLandItem$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getWord_count());
        }
        if (i11 == 2) {
            return Integer.valueOf(getIsland_index());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$IsLandItem$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetWord_count();
        }
        if (i11 == 2) {
            return isSetIsland_index();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$IsLandItem$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetWord_count();
                return;
            } else {
                setWord_count(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetIsland_index();
        } else {
            setIsland_index(((Integer) value).intValue());
        }
    }

    public IsLandItem(int word_count, int island_index) {
        this();
        this.word_count = word_count;
        setWord_countIsSet(true);
        this.island_index = island_index;
        setIsland_indexIsSet(true);
    }

    public boolean equals(IsLandItem that) {
        return that != null && this.word_count == that.word_count && this.island_index == that.island_index;
    }

    public IsLandItem(IsLandItem other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.word_count = other.word_count;
        this.island_index = other.island_index;
    }

    public void validate() throws TException {
    }
}
