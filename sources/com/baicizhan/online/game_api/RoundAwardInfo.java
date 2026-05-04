package com.baicizhan.online.game_api;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.BitSet;
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
import org.apache.thrift.meta_data.StructMetaData;
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
public class RoundAwardInfo implements TBase<RoundAwardInfo, _Fields>, Serializable, Cloneable, Comparable<RoundAwardInfo> {
    private static final int __COMPASS_ISSET_ID = 1;
    private static final int __COPPER_ISSET_ID = 3;
    private static final int __ENERGY_COUNT_ISSET_ID = 0;
    private static final int __SNACKS_COUNT_ISSET_ID = 4;
    private static final int __STUDY_SCORE_ISSET_ID = 2;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public RoundCombo combo;
    public int compass;
    public int copper;
    public int energy_count;
    private _Fields[] optionals;
    public int snacks_count;
    public int study_score;
    private static final TStruct STRUCT_DESC = new TStruct("RoundAwardInfo");
    private static final TField ENERGY_COUNT_FIELD_DESC = new TField("energy_count", (byte) 8, 1);
    private static final TField COMPASS_FIELD_DESC = new TField("compass", (byte) 8, 2);
    private static final TField STUDY_SCORE_FIELD_DESC = new TField("study_score", (byte) 8, 3);
    private static final TField COMBO_FIELD_DESC = new TField("combo", (byte) 12, 4);
    private static final TField COPPER_FIELD_DESC = new TField("copper", (byte) 8, 5);
    private static final TField SNACKS_COUNT_FIELD_DESC = new TField("snacks_count", (byte) 8, 6);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.RoundAwardInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$RoundAwardInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$RoundAwardInfo$_Fields = iArr;
            try {
                iArr[_Fields.ENERGY_COUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$RoundAwardInfo$_Fields[_Fields.COMPASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$RoundAwardInfo$_Fields[_Fields.STUDY_SCORE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$RoundAwardInfo$_Fields[_Fields.COMBO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$RoundAwardInfo$_Fields[_Fields.COPPER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$RoundAwardInfo$_Fields[_Fields.SNACKS_COUNT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RoundAwardInfoStandardScheme extends StandardScheme<RoundAwardInfo> {
        private RoundAwardInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, RoundAwardInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetEnergy_count()) {
                        throw new TProtocolException("Required field 'energy_count' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetCompass()) {
                        throw new TProtocolException("Required field 'compass' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetStudy_score()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'study_score' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.energy_count = iprot.readI32();
                            struct.setEnergy_countIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.compass = iprot.readI32();
                            struct.setCompassIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.study_score = iprot.readI32();
                            struct.setStudy_scoreIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            RoundCombo roundCombo = new RoundCombo();
                            struct.combo = roundCombo;
                            roundCombo.read(iprot);
                            struct.setComboIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.copper = iprot.readI32();
                            struct.setCopperIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.snacks_count = iprot.readI32();
                            struct.setSnacks_countIsSet(true);
                            break;
                        }
                    default:
                        TProtocolUtil.skip(iprot, b11);
                        break;
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, RoundAwardInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(RoundAwardInfo.STRUCT_DESC);
            oprot.writeFieldBegin(RoundAwardInfo.ENERGY_COUNT_FIELD_DESC);
            oprot.writeI32(struct.energy_count);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(RoundAwardInfo.COMPASS_FIELD_DESC);
            oprot.writeI32(struct.compass);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(RoundAwardInfo.STUDY_SCORE_FIELD_DESC);
            oprot.writeI32(struct.study_score);
            oprot.writeFieldEnd();
            if (struct.combo != null && struct.isSetCombo()) {
                oprot.writeFieldBegin(RoundAwardInfo.COMBO_FIELD_DESC);
                struct.combo.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.isSetCopper()) {
                oprot.writeFieldBegin(RoundAwardInfo.COPPER_FIELD_DESC);
                oprot.writeI32(struct.copper);
                oprot.writeFieldEnd();
            }
            if (struct.isSetSnacks_count()) {
                oprot.writeFieldBegin(RoundAwardInfo.SNACKS_COUNT_FIELD_DESC);
                oprot.writeI32(struct.snacks_count);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RoundAwardInfoStandardSchemeFactory implements SchemeFactory {
        private RoundAwardInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public RoundAwardInfoStandardScheme getScheme() {
            return new RoundAwardInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RoundAwardInfoTupleScheme extends TupleScheme<RoundAwardInfo> {
        private RoundAwardInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, RoundAwardInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.energy_count = tTupleProtocol.readI32();
            struct.setEnergy_countIsSet(true);
            struct.compass = tTupleProtocol.readI32();
            struct.setCompassIsSet(true);
            struct.study_score = tTupleProtocol.readI32();
            struct.setStudy_scoreIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(3);
            if (readBitSet.get(0)) {
                RoundCombo roundCombo = new RoundCombo();
                struct.combo = roundCombo;
                roundCombo.read(tTupleProtocol);
                struct.setComboIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.copper = tTupleProtocol.readI32();
                struct.setCopperIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.snacks_count = tTupleProtocol.readI32();
                struct.setSnacks_countIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, RoundAwardInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.energy_count);
            tTupleProtocol.writeI32(struct.compass);
            tTupleProtocol.writeI32(struct.study_score);
            BitSet bitSet = new BitSet();
            if (struct.isSetCombo()) {
                bitSet.set(0);
            }
            if (struct.isSetCopper()) {
                bitSet.set(1);
            }
            if (struct.isSetSnacks_count()) {
                bitSet.set(2);
            }
            tTupleProtocol.writeBitSet(bitSet, 3);
            if (struct.isSetCombo()) {
                struct.combo.write(tTupleProtocol);
            }
            if (struct.isSetCopper()) {
                tTupleProtocol.writeI32(struct.copper);
            }
            if (struct.isSetSnacks_count()) {
                tTupleProtocol.writeI32(struct.snacks_count);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RoundAwardInfoTupleSchemeFactory implements SchemeFactory {
        private RoundAwardInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public RoundAwardInfoTupleScheme getScheme() {
            return new RoundAwardInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ENERGY_COUNT(1, "energy_count"),
        COMPASS(2, "compass"),
        STUDY_SCORE(3, "study_score"),
        COMBO(4, "combo"),
        COPPER(5, "copper"),
        SNACKS_COUNT(6, "snacks_count");

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
            switch (fieldId) {
                case 1:
                    return ENERGY_COUNT;
                case 2:
                    return COMPASS;
                case 3:
                    return STUDY_SCORE;
                case 4:
                    return COMBO;
                case 5:
                    return COPPER;
                case 6:
                    return SNACKS_COUNT;
                default:
                    return null;
            }
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
        hashMap.put(StandardScheme.class, new RoundAwardInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new RoundAwardInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ENERGY_COUNT, (_Fields) new FieldMetaData("energy_count", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.COMPASS, (_Fields) new FieldMetaData("compass", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.STUDY_SCORE, (_Fields) new FieldMetaData("study_score", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.COMBO, (_Fields) new FieldMetaData("combo", (byte) 2, new StructMetaData((byte) 12, RoundCombo.class)));
        enumMap.put((EnumMap) _Fields.COPPER, (_Fields) new FieldMetaData("copper", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.SNACKS_COUNT, (_Fields) new FieldMetaData("snacks_count", (byte) 2, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(RoundAwardInfo.class, unmodifiableMap);
    }

    public RoundAwardInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.COMBO, _Fields.COPPER, _Fields.SNACKS_COUNT};
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
        setEnergy_countIsSet(false);
        this.energy_count = 0;
        setCompassIsSet(false);
        this.compass = 0;
        setStudy_scoreIsSet(false);
        this.study_score = 0;
        this.combo = null;
        setCopperIsSet(false);
        this.copper = 0;
        setSnacks_countIsSet(false);
        this.snacks_count = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof RoundAwardInfo)) {
            return equals((RoundAwardInfo) that);
        }
        return false;
    }

    public RoundCombo getCombo() {
        return this.combo;
    }

    public int getCompass() {
        return this.compass;
    }

    public int getCopper() {
        return this.copper;
    }

    public int getEnergy_count() {
        return this.energy_count;
    }

    public int getSnacks_count() {
        return this.snacks_count;
    }

    public int getStudy_score() {
        return this.study_score;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetCombo() {
        return this.combo != null;
    }

    public boolean isSetCompass() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetCopper() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetEnergy_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetSnacks_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 4);
    }

    public boolean isSetStudy_score() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public RoundAwardInfo setCombo(RoundCombo combo) {
        this.combo = combo;
        return this;
    }

    public void setComboIsSet(boolean value) {
        if (value) {
            return;
        }
        this.combo = null;
    }

    public RoundAwardInfo setCompass(int compass) {
        this.compass = compass;
        setCompassIsSet(true);
        return this;
    }

    public void setCompassIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public RoundAwardInfo setCopper(int copper) {
        this.copper = copper;
        setCopperIsSet(true);
        return this;
    }

    public void setCopperIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public RoundAwardInfo setEnergy_count(int energy_count) {
        this.energy_count = energy_count;
        setEnergy_countIsSet(true);
        return this;
    }

    public void setEnergy_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public RoundAwardInfo setSnacks_count(int snacks_count) {
        this.snacks_count = snacks_count;
        setSnacks_countIsSet(true);
        return this;
    }

    public void setSnacks_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 4, value);
    }

    public RoundAwardInfo setStudy_score(int study_score) {
        this.study_score = study_score;
        setStudy_scoreIsSet(true);
        return this;
    }

    public void setStudy_scoreIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RoundAwardInfo(");
        sb2.append("energy_count:");
        sb2.append(this.energy_count);
        sb2.append(j2.O);
        sb2.append("compass:");
        sb2.append(this.compass);
        sb2.append(j2.O);
        sb2.append("study_score:");
        sb2.append(this.study_score);
        if (isSetCombo()) {
            sb2.append(j2.O);
            sb2.append("combo:");
            RoundCombo roundCombo = this.combo;
            if (roundCombo == null) {
                sb2.append("null");
            } else {
                sb2.append(roundCombo);
            }
        }
        if (isSetCopper()) {
            sb2.append(j2.O);
            sb2.append("copper:");
            sb2.append(this.copper);
        }
        if (isSetSnacks_count()) {
            sb2.append(j2.O);
            sb2.append("snacks_count:");
            sb2.append(this.snacks_count);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetCombo() {
        this.combo = null;
    }

    public void unsetCompass() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetCopper() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetEnergy_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetSnacks_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 4);
    }

    public void unsetStudy_score() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void validate() throws TException {
        RoundCombo roundCombo = this.combo;
        if (roundCombo != null) {
            roundCombo.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(RoundAwardInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo7 = Boolean.valueOf(isSetEnergy_count()).compareTo(Boolean.valueOf(other.isSetEnergy_count()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetEnergy_count() && (compareTo6 = TBaseHelper.compareTo(this.energy_count, other.energy_count)) != 0) {
            return compareTo6;
        }
        int compareTo8 = Boolean.valueOf(isSetCompass()).compareTo(Boolean.valueOf(other.isSetCompass()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetCompass() && (compareTo5 = TBaseHelper.compareTo(this.compass, other.compass)) != 0) {
            return compareTo5;
        }
        int compareTo9 = Boolean.valueOf(isSetStudy_score()).compareTo(Boolean.valueOf(other.isSetStudy_score()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetStudy_score() && (compareTo4 = TBaseHelper.compareTo(this.study_score, other.study_score)) != 0) {
            return compareTo4;
        }
        int compareTo10 = Boolean.valueOf(isSetCombo()).compareTo(Boolean.valueOf(other.isSetCombo()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetCombo() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.combo, (Comparable) other.combo)) != 0) {
            return compareTo3;
        }
        int compareTo11 = Boolean.valueOf(isSetCopper()).compareTo(Boolean.valueOf(other.isSetCopper()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetCopper() && (compareTo2 = TBaseHelper.compareTo(this.copper, other.copper)) != 0) {
            return compareTo2;
        }
        int compareTo12 = Boolean.valueOf(isSetSnacks_count()).compareTo(Boolean.valueOf(other.isSetSnacks_count()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (!isSetSnacks_count() || (compareTo = TBaseHelper.compareTo(this.snacks_count, other.snacks_count)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<RoundAwardInfo, _Fields> deepCopy2() {
        return new RoundAwardInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$RoundAwardInfo$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getEnergy_count());
            case 2:
                return Integer.valueOf(getCompass());
            case 3:
                return Integer.valueOf(getStudy_score());
            case 4:
                return getCombo();
            case 5:
                return Integer.valueOf(getCopper());
            case 6:
                return Integer.valueOf(getSnacks_count());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$RoundAwardInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetEnergy_count();
            case 2:
                return isSetCompass();
            case 3:
                return isSetStudy_score();
            case 4:
                return isSetCombo();
            case 5:
                return isSetCopper();
            case 6:
                return isSetSnacks_count();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$RoundAwardInfo$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setEnergy_count(((Integer) value).intValue());
                    break;
                } else {
                    unsetEnergy_count();
                    break;
                }
            case 2:
                if (value != null) {
                    setCompass(((Integer) value).intValue());
                    break;
                } else {
                    unsetCompass();
                    break;
                }
            case 3:
                if (value != null) {
                    setStudy_score(((Integer) value).intValue());
                    break;
                } else {
                    unsetStudy_score();
                    break;
                }
            case 4:
                if (value != null) {
                    setCombo((RoundCombo) value);
                    break;
                } else {
                    unsetCombo();
                    break;
                }
            case 5:
                if (value != null) {
                    setCopper(((Integer) value).intValue());
                    break;
                } else {
                    unsetCopper();
                    break;
                }
            case 6:
                if (value != null) {
                    setSnacks_count(((Integer) value).intValue());
                    break;
                } else {
                    unsetSnacks_count();
                    break;
                }
        }
    }

    public boolean equals(RoundAwardInfo that) {
        if (that == null || this.energy_count != that.energy_count || this.compass != that.compass || this.study_score != that.study_score) {
            return false;
        }
        boolean isSetCombo = isSetCombo();
        boolean isSetCombo2 = that.isSetCombo();
        if ((isSetCombo || isSetCombo2) && !(isSetCombo && isSetCombo2 && this.combo.equals(that.combo))) {
            return false;
        }
        boolean isSetCopper = isSetCopper();
        boolean isSetCopper2 = that.isSetCopper();
        if ((isSetCopper || isSetCopper2) && !(isSetCopper && isSetCopper2 && this.copper == that.copper)) {
            return false;
        }
        boolean isSetSnacks_count = isSetSnacks_count();
        boolean isSetSnacks_count2 = that.isSetSnacks_count();
        if (isSetSnacks_count || isSetSnacks_count2) {
            return isSetSnacks_count && isSetSnacks_count2 && this.snacks_count == that.snacks_count;
        }
        return true;
    }

    public RoundAwardInfo(int energy_count, int compass, int study_score) {
        this();
        this.energy_count = energy_count;
        setEnergy_countIsSet(true);
        this.compass = compass;
        setCompassIsSet(true);
        this.study_score = study_score;
        setStudy_scoreIsSet(true);
    }

    public RoundAwardInfo(RoundAwardInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.COMBO, _Fields.COPPER, _Fields.SNACKS_COUNT};
        this.__isset_bitfield = other.__isset_bitfield;
        this.energy_count = other.energy_count;
        this.compass = other.compass;
        this.study_score = other.study_score;
        if (other.isSetCombo()) {
            this.combo = new RoundCombo(other.combo);
        }
        this.copper = other.copper;
        this.snacks_count = other.snacks_count;
    }
}
