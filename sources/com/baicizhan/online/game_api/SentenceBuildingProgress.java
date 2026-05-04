package com.baicizhan.online.game_api;

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
public class SentenceBuildingProgress implements TBase<SentenceBuildingProgress, _Fields>, Serializable, Cloneable, Comparable<SentenceBuildingProgress> {
    private static final int __BUILDING_ID_ISSET_ID = 0;
    private static final int __BUILDING_LEVEL_ID_ISSET_ID = 1;
    private static final int __HAMMER_REMAIN_ISSET_ID = 2;
    private static final int __HAMMER_USED_ISSET_ID = 3;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int building_id;
    public int building_level_id;
    public int hammer_remain;
    public int hammer_used;
    private static final TStruct STRUCT_DESC = new TStruct("SentenceBuildingProgress");
    private static final TField BUILDING_ID_FIELD_DESC = new TField("building_id", (byte) 8, 1);
    private static final TField BUILDING_LEVEL_ID_FIELD_DESC = new TField("building_level_id", (byte) 8, 2);
    private static final TField HAMMER_REMAIN_FIELD_DESC = new TField("hammer_remain", (byte) 8, 3);
    private static final TField HAMMER_USED_FIELD_DESC = new TField("hammer_used", (byte) 8, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.SentenceBuildingProgress$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$SentenceBuildingProgress$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$SentenceBuildingProgress$_Fields = iArr;
            try {
                iArr[_Fields.BUILDING_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$SentenceBuildingProgress$_Fields[_Fields.BUILDING_LEVEL_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$SentenceBuildingProgress$_Fields[_Fields.HAMMER_REMAIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$SentenceBuildingProgress$_Fields[_Fields.HAMMER_USED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SentenceBuildingProgressStandardScheme extends StandardScheme<SentenceBuildingProgress> {
        private SentenceBuildingProgressStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, SentenceBuildingProgress struct) throws TException {
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
                            } else if (b11 == 8) {
                                struct.hammer_used = iprot.readI32();
                                struct.setHammer_usedIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 8) {
                            struct.hammer_remain = iprot.readI32();
                            struct.setHammer_remainIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.building_level_id = iprot.readI32();
                        struct.setBuilding_level_idIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.building_id = iprot.readI32();
                    struct.setBuilding_idIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetBuilding_id()) {
                throw new TProtocolException("Required field 'building_id' was not found in serialized data! Struct: " + toString());
            }
            if (!struct.isSetBuilding_level_id()) {
                throw new TProtocolException("Required field 'building_level_id' was not found in serialized data! Struct: " + toString());
            }
            if (!struct.isSetHammer_remain()) {
                throw new TProtocolException("Required field 'hammer_remain' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetHammer_used()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'hammer_used' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, SentenceBuildingProgress struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(SentenceBuildingProgress.STRUCT_DESC);
            oprot.writeFieldBegin(SentenceBuildingProgress.BUILDING_ID_FIELD_DESC);
            oprot.writeI32(struct.building_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(SentenceBuildingProgress.BUILDING_LEVEL_ID_FIELD_DESC);
            oprot.writeI32(struct.building_level_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(SentenceBuildingProgress.HAMMER_REMAIN_FIELD_DESC);
            oprot.writeI32(struct.hammer_remain);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(SentenceBuildingProgress.HAMMER_USED_FIELD_DESC);
            oprot.writeI32(struct.hammer_used);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SentenceBuildingProgressStandardSchemeFactory implements SchemeFactory {
        private SentenceBuildingProgressStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SentenceBuildingProgressStandardScheme getScheme() {
            return new SentenceBuildingProgressStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SentenceBuildingProgressTupleScheme extends TupleScheme<SentenceBuildingProgress> {
        private SentenceBuildingProgressTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, SentenceBuildingProgress struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.building_id = tTupleProtocol.readI32();
            struct.setBuilding_idIsSet(true);
            struct.building_level_id = tTupleProtocol.readI32();
            struct.setBuilding_level_idIsSet(true);
            struct.hammer_remain = tTupleProtocol.readI32();
            struct.setHammer_remainIsSet(true);
            struct.hammer_used = tTupleProtocol.readI32();
            struct.setHammer_usedIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, SentenceBuildingProgress struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.building_id);
            tTupleProtocol.writeI32(struct.building_level_id);
            tTupleProtocol.writeI32(struct.hammer_remain);
            tTupleProtocol.writeI32(struct.hammer_used);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SentenceBuildingProgressTupleSchemeFactory implements SchemeFactory {
        private SentenceBuildingProgressTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SentenceBuildingProgressTupleScheme getScheme() {
            return new SentenceBuildingProgressTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        BUILDING_ID(1, "building_id"),
        BUILDING_LEVEL_ID(2, "building_level_id"),
        HAMMER_REMAIN(3, "hammer_remain"),
        HAMMER_USED(4, "hammer_used");

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
            if (fieldId == 2) {
                return BUILDING_LEVEL_ID;
            }
            if (fieldId == 3) {
                return HAMMER_REMAIN;
            }
            if (fieldId != 4) {
                return null;
            }
            return HAMMER_USED;
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
        hashMap.put(StandardScheme.class, new SentenceBuildingProgressStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new SentenceBuildingProgressTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.BUILDING_ID, (_Fields) new FieldMetaData("building_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.BUILDING_LEVEL_ID, (_Fields) new FieldMetaData("building_level_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.HAMMER_REMAIN, (_Fields) new FieldMetaData("hammer_remain", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.HAMMER_USED, (_Fields) new FieldMetaData("hammer_used", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(SentenceBuildingProgress.class, unmodifiableMap);
    }

    public SentenceBuildingProgress() {
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
        setBuilding_idIsSet(false);
        this.building_id = 0;
        setBuilding_level_idIsSet(false);
        this.building_level_id = 0;
        setHammer_remainIsSet(false);
        this.hammer_remain = 0;
        setHammer_usedIsSet(false);
        this.hammer_used = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof SentenceBuildingProgress)) {
            return equals((SentenceBuildingProgress) that);
        }
        return false;
    }

    public int getBuilding_id() {
        return this.building_id;
    }

    public int getBuilding_level_id() {
        return this.building_level_id;
    }

    public int getHammer_remain() {
        return this.hammer_remain;
    }

    public int getHammer_used() {
        return this.hammer_used;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetBuilding_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetBuilding_level_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetHammer_remain() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetHammer_used() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public SentenceBuildingProgress setBuilding_id(int building_id) {
        this.building_id = building_id;
        setBuilding_idIsSet(true);
        return this;
    }

    public void setBuilding_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public SentenceBuildingProgress setBuilding_level_id(int building_level_id) {
        this.building_level_id = building_level_id;
        setBuilding_level_idIsSet(true);
        return this;
    }

    public void setBuilding_level_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public SentenceBuildingProgress setHammer_remain(int hammer_remain) {
        this.hammer_remain = hammer_remain;
        setHammer_remainIsSet(true);
        return this;
    }

    public void setHammer_remainIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public SentenceBuildingProgress setHammer_used(int hammer_used) {
        this.hammer_used = hammer_used;
        setHammer_usedIsSet(true);
        return this;
    }

    public void setHammer_usedIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public String toString() {
        return "SentenceBuildingProgress(building_id:" + this.building_id + j2.O + "building_level_id:" + this.building_level_id + j2.O + "hammer_remain:" + this.hammer_remain + j2.O + "hammer_used:" + this.hammer_used + pn.j.f81007d;
    }

    public void unsetBuilding_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetBuilding_level_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetHammer_remain() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetHammer_used() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(SentenceBuildingProgress other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetBuilding_id()).compareTo(Boolean.valueOf(other.isSetBuilding_id()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetBuilding_id() && (compareTo4 = TBaseHelper.compareTo(this.building_id, other.building_id)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetBuilding_level_id()).compareTo(Boolean.valueOf(other.isSetBuilding_level_id()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetBuilding_level_id() && (compareTo3 = TBaseHelper.compareTo(this.building_level_id, other.building_level_id)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetHammer_remain()).compareTo(Boolean.valueOf(other.isSetHammer_remain()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetHammer_remain() && (compareTo2 = TBaseHelper.compareTo(this.hammer_remain, other.hammer_remain)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetHammer_used()).compareTo(Boolean.valueOf(other.isSetHammer_used()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetHammer_used() || (compareTo = TBaseHelper.compareTo(this.hammer_used, other.hammer_used)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<SentenceBuildingProgress, _Fields> deepCopy2() {
        return new SentenceBuildingProgress(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$SentenceBuildingProgress$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getBuilding_id());
        }
        if (i11 == 2) {
            return Integer.valueOf(getBuilding_level_id());
        }
        if (i11 == 3) {
            return Integer.valueOf(getHammer_remain());
        }
        if (i11 == 4) {
            return Integer.valueOf(getHammer_used());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$SentenceBuildingProgress$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetBuilding_id();
        }
        if (i11 == 2) {
            return isSetBuilding_level_id();
        }
        if (i11 == 3) {
            return isSetHammer_remain();
        }
        if (i11 == 4) {
            return isSetHammer_used();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$SentenceBuildingProgress$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetBuilding_id();
                return;
            } else {
                setBuilding_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetBuilding_level_id();
                return;
            } else {
                setBuilding_level_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetHammer_remain();
                return;
            } else {
                setHammer_remain(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetHammer_used();
        } else {
            setHammer_used(((Integer) value).intValue());
        }
    }

    public SentenceBuildingProgress(int building_id, int building_level_id, int hammer_remain, int hammer_used) {
        this();
        this.building_id = building_id;
        setBuilding_idIsSet(true);
        this.building_level_id = building_level_id;
        setBuilding_level_idIsSet(true);
        this.hammer_remain = hammer_remain;
        setHammer_remainIsSet(true);
        this.hammer_used = hammer_used;
        setHammer_usedIsSet(true);
    }

    public boolean equals(SentenceBuildingProgress that) {
        return that != null && this.building_id == that.building_id && this.building_level_id == that.building_level_id && this.hammer_remain == that.hammer_remain && this.hammer_used == that.hammer_used;
    }

    public SentenceBuildingProgress(SentenceBuildingProgress other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.building_id = other.building_id;
        this.building_level_id = other.building_level_id;
        this.hammer_remain = other.hammer_remain;
        this.hammer_used = other.hammer_used;
    }

    public void validate() throws TException {
    }
}
