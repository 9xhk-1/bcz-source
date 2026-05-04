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
public class SentenceUserBuildingLevels implements TBase<SentenceUserBuildingLevels, _Fields>, Serializable, Cloneable, Comparable<SentenceUserBuildingLevels> {
    private static final int __BUILDINGID_ISSET_ID = 0;
    private static final int __CURRENTBUILDINGLEVEL_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int buildingId;
    public int currentBuildingLevel;
    private static final TStruct STRUCT_DESC = new TStruct("SentenceUserBuildingLevels");
    private static final TField BUILDING_ID_FIELD_DESC = new TField("buildingId", (byte) 8, 1);
    private static final TField CURRENT_BUILDING_LEVEL_FIELD_DESC = new TField("currentBuildingLevel", (byte) 8, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.SentenceUserBuildingLevels$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$SentenceUserBuildingLevels$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$SentenceUserBuildingLevels$_Fields = iArr;
            try {
                iArr[_Fields.BUILDING_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$SentenceUserBuildingLevels$_Fields[_Fields.CURRENT_BUILDING_LEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SentenceUserBuildingLevelsStandardScheme extends StandardScheme<SentenceUserBuildingLevels> {
        private SentenceUserBuildingLevelsStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, SentenceUserBuildingLevels struct) throws TException {
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
                        struct.currentBuildingLevel = iprot.readI32();
                        struct.setCurrentBuildingLevelIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.buildingId = iprot.readI32();
                    struct.setBuildingIdIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetBuildingId()) {
                throw new TProtocolException("Required field 'buildingId' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetCurrentBuildingLevel()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'currentBuildingLevel' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, SentenceUserBuildingLevels struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(SentenceUserBuildingLevels.STRUCT_DESC);
            oprot.writeFieldBegin(SentenceUserBuildingLevels.BUILDING_ID_FIELD_DESC);
            oprot.writeI32(struct.buildingId);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(SentenceUserBuildingLevels.CURRENT_BUILDING_LEVEL_FIELD_DESC);
            oprot.writeI32(struct.currentBuildingLevel);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SentenceUserBuildingLevelsStandardSchemeFactory implements SchemeFactory {
        private SentenceUserBuildingLevelsStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SentenceUserBuildingLevelsStandardScheme getScheme() {
            return new SentenceUserBuildingLevelsStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SentenceUserBuildingLevelsTupleScheme extends TupleScheme<SentenceUserBuildingLevels> {
        private SentenceUserBuildingLevelsTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, SentenceUserBuildingLevels struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.buildingId = tTupleProtocol.readI32();
            struct.setBuildingIdIsSet(true);
            struct.currentBuildingLevel = tTupleProtocol.readI32();
            struct.setCurrentBuildingLevelIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, SentenceUserBuildingLevels struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.buildingId);
            tTupleProtocol.writeI32(struct.currentBuildingLevel);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SentenceUserBuildingLevelsTupleSchemeFactory implements SchemeFactory {
        private SentenceUserBuildingLevelsTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SentenceUserBuildingLevelsTupleScheme getScheme() {
            return new SentenceUserBuildingLevelsTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        BUILDING_ID(1, "buildingId"),
        CURRENT_BUILDING_LEVEL(2, "currentBuildingLevel");

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
            if (fieldId != 2) {
                return null;
            }
            return CURRENT_BUILDING_LEVEL;
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
        hashMap.put(StandardScheme.class, new SentenceUserBuildingLevelsStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new SentenceUserBuildingLevelsTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.BUILDING_ID, (_Fields) new FieldMetaData("buildingId", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.CURRENT_BUILDING_LEVEL, (_Fields) new FieldMetaData("currentBuildingLevel", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(SentenceUserBuildingLevels.class, unmodifiableMap);
    }

    public SentenceUserBuildingLevels() {
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
        setBuildingIdIsSet(false);
        this.buildingId = 0;
        setCurrentBuildingLevelIsSet(false);
        this.currentBuildingLevel = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof SentenceUserBuildingLevels)) {
            return equals((SentenceUserBuildingLevels) that);
        }
        return false;
    }

    public int getBuildingId() {
        return this.buildingId;
    }

    public int getCurrentBuildingLevel() {
        return this.currentBuildingLevel;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetBuildingId() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetCurrentBuildingLevel() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public SentenceUserBuildingLevels setBuildingId(int buildingId) {
        this.buildingId = buildingId;
        setBuildingIdIsSet(true);
        return this;
    }

    public void setBuildingIdIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public SentenceUserBuildingLevels setCurrentBuildingLevel(int currentBuildingLevel) {
        this.currentBuildingLevel = currentBuildingLevel;
        setCurrentBuildingLevelIsSet(true);
        return this;
    }

    public void setCurrentBuildingLevelIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        return "SentenceUserBuildingLevels(buildingId:" + this.buildingId + j2.O + "currentBuildingLevel:" + this.currentBuildingLevel + pn.j.f81007d;
    }

    public void unsetBuildingId() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetCurrentBuildingLevel() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(SentenceUserBuildingLevels other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetBuildingId()).compareTo(Boolean.valueOf(other.isSetBuildingId()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetBuildingId() && (compareTo2 = TBaseHelper.compareTo(this.buildingId, other.buildingId)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetCurrentBuildingLevel()).compareTo(Boolean.valueOf(other.isSetCurrentBuildingLevel()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetCurrentBuildingLevel() || (compareTo = TBaseHelper.compareTo(this.currentBuildingLevel, other.currentBuildingLevel)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<SentenceUserBuildingLevels, _Fields> deepCopy2() {
        return new SentenceUserBuildingLevels(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$SentenceUserBuildingLevels$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getBuildingId());
        }
        if (i11 == 2) {
            return Integer.valueOf(getCurrentBuildingLevel());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$SentenceUserBuildingLevels$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetBuildingId();
        }
        if (i11 == 2) {
            return isSetCurrentBuildingLevel();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$SentenceUserBuildingLevels$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetBuildingId();
                return;
            } else {
                setBuildingId(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetCurrentBuildingLevel();
        } else {
            setCurrentBuildingLevel(((Integer) value).intValue());
        }
    }

    public SentenceUserBuildingLevels(int buildingId, int currentBuildingLevel) {
        this();
        this.buildingId = buildingId;
        setBuildingIdIsSet(true);
        this.currentBuildingLevel = currentBuildingLevel;
        setCurrentBuildingLevelIsSet(true);
    }

    public boolean equals(SentenceUserBuildingLevels that) {
        return that != null && this.buildingId == that.buildingId && this.currentBuildingLevel == that.currentBuildingLevel;
    }

    public SentenceUserBuildingLevels(SentenceUserBuildingLevels other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.buildingId = other.buildingId;
        this.currentBuildingLevel = other.currentBuildingLevel;
    }

    public void validate() throws TException {
    }
}
