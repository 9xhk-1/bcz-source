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
public class RoundCombo implements TBase<RoundCombo, _Fields>, Serializable, Cloneable, Comparable<RoundCombo> {
    private static final int __CURRENT_COMBO_ISSET_ID = 0;
    private static final int __MAX_COMBO_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public List<AwardCombo> award_combos;
    public int current_combo;
    public int max_combo;
    private static final TStruct STRUCT_DESC = new TStruct("RoundCombo");
    private static final TField CURRENT_COMBO_FIELD_DESC = new TField("current_combo", (byte) 8, 1);
    private static final TField MAX_COMBO_FIELD_DESC = new TField("max_combo", (byte) 8, 2);
    private static final TField AWARD_COMBOS_FIELD_DESC = new TField("award_combos", (byte) 15, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.RoundCombo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$RoundCombo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$RoundCombo$_Fields = iArr;
            try {
                iArr[_Fields.CURRENT_COMBO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$RoundCombo$_Fields[_Fields.MAX_COMBO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$RoundCombo$_Fields[_Fields.AWARD_COMBOS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RoundComboStandardScheme extends StandardScheme<RoundCombo> {
        private RoundComboStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, RoundCombo struct) throws TException {
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
                            TProtocolUtil.skip(iprot, b11);
                        } else if (b11 == 15) {
                            TList readListBegin = iprot.readListBegin();
                            struct.award_combos = new ArrayList(readListBegin.size);
                            for (int i11 = 0; i11 < readListBegin.size; i11++) {
                                AwardCombo awardCombo = new AwardCombo();
                                awardCombo.read(iprot);
                                struct.award_combos.add(awardCombo);
                            }
                            iprot.readListEnd();
                            struct.setAward_combosIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.max_combo = iprot.readI32();
                        struct.setMax_comboIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.current_combo = iprot.readI32();
                    struct.setCurrent_comboIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetCurrent_combo()) {
                throw new TProtocolException("Required field 'current_combo' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetMax_combo()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'max_combo' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, RoundCombo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(RoundCombo.STRUCT_DESC);
            oprot.writeFieldBegin(RoundCombo.CURRENT_COMBO_FIELD_DESC);
            oprot.writeI32(struct.current_combo);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(RoundCombo.MAX_COMBO_FIELD_DESC);
            oprot.writeI32(struct.max_combo);
            oprot.writeFieldEnd();
            if (struct.award_combos != null) {
                oprot.writeFieldBegin(RoundCombo.AWARD_COMBOS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.award_combos.size()));
                Iterator<AwardCombo> it = struct.award_combos.iterator();
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
    public static class RoundComboStandardSchemeFactory implements SchemeFactory {
        private RoundComboStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public RoundComboStandardScheme getScheme() {
            return new RoundComboStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RoundComboTupleScheme extends TupleScheme<RoundCombo> {
        private RoundComboTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, RoundCombo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.current_combo = tTupleProtocol.readI32();
            struct.setCurrent_comboIsSet(true);
            struct.max_combo = tTupleProtocol.readI32();
            struct.setMax_comboIsSet(true);
            TList tList = new TList((byte) 12, tTupleProtocol.readI32());
            struct.award_combos = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                AwardCombo awardCombo = new AwardCombo();
                awardCombo.read(tTupleProtocol);
                struct.award_combos.add(awardCombo);
            }
            struct.setAward_combosIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, RoundCombo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.current_combo);
            tTupleProtocol.writeI32(struct.max_combo);
            tTupleProtocol.writeI32(struct.award_combos.size());
            Iterator<AwardCombo> it = struct.award_combos.iterator();
            while (it.hasNext()) {
                it.next().write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RoundComboTupleSchemeFactory implements SchemeFactory {
        private RoundComboTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public RoundComboTupleScheme getScheme() {
            return new RoundComboTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        CURRENT_COMBO(1, "current_combo"),
        MAX_COMBO(2, "max_combo"),
        AWARD_COMBOS(3, "award_combos");

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
                return CURRENT_COMBO;
            }
            if (fieldId == 2) {
                return MAX_COMBO;
            }
            if (fieldId != 3) {
                return null;
            }
            return AWARD_COMBOS;
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
        hashMap.put(StandardScheme.class, new RoundComboStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new RoundComboTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.CURRENT_COMBO, (_Fields) new FieldMetaData("current_combo", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.MAX_COMBO, (_Fields) new FieldMetaData("max_combo", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.AWARD_COMBOS, (_Fields) new FieldMetaData("award_combos", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, AwardCombo.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(RoundCombo.class, unmodifiableMap);
    }

    public RoundCombo() {
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

    public void addToAward_combos(AwardCombo elem) {
        if (this.award_combos == null) {
            this.award_combos = new ArrayList();
        }
        this.award_combos.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        setCurrent_comboIsSet(false);
        this.current_combo = 0;
        setMax_comboIsSet(false);
        this.max_combo = 0;
        this.award_combos = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof RoundCombo)) {
            return equals((RoundCombo) that);
        }
        return false;
    }

    public List<AwardCombo> getAward_combos() {
        return this.award_combos;
    }

    public Iterator<AwardCombo> getAward_combosIterator() {
        List<AwardCombo> list = this.award_combos;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getAward_combosSize() {
        List<AwardCombo> list = this.award_combos;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int getCurrent_combo() {
        return this.current_combo;
    }

    public int getMax_combo() {
        return this.max_combo;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAward_combos() {
        return this.award_combos != null;
    }

    public boolean isSetCurrent_combo() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetMax_combo() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public RoundCombo setAward_combos(List<AwardCombo> award_combos) {
        this.award_combos = award_combos;
        return this;
    }

    public void setAward_combosIsSet(boolean value) {
        if (value) {
            return;
        }
        this.award_combos = null;
    }

    public RoundCombo setCurrent_combo(int current_combo) {
        this.current_combo = current_combo;
        setCurrent_comboIsSet(true);
        return this;
    }

    public void setCurrent_comboIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public RoundCombo setMax_combo(int max_combo) {
        this.max_combo = max_combo;
        setMax_comboIsSet(true);
        return this;
    }

    public void setMax_comboIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RoundCombo(");
        sb2.append("current_combo:");
        sb2.append(this.current_combo);
        sb2.append(j2.O);
        sb2.append("max_combo:");
        sb2.append(this.max_combo);
        sb2.append(j2.O);
        sb2.append("award_combos:");
        List<AwardCombo> list = this.award_combos;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAward_combos() {
        this.award_combos = null;
    }

    public void unsetCurrent_combo() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetMax_combo() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void validate() throws TException {
        if (this.award_combos != null) {
            return;
        }
        throw new TProtocolException("Required field 'award_combos' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(RoundCombo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetCurrent_combo()).compareTo(Boolean.valueOf(other.isSetCurrent_combo()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetCurrent_combo() && (compareTo3 = TBaseHelper.compareTo(this.current_combo, other.current_combo)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetMax_combo()).compareTo(Boolean.valueOf(other.isSetMax_combo()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetMax_combo() && (compareTo2 = TBaseHelper.compareTo(this.max_combo, other.max_combo)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetAward_combos()).compareTo(Boolean.valueOf(other.isSetAward_combos()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetAward_combos() || (compareTo = TBaseHelper.compareTo((List) this.award_combos, (List) other.award_combos)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<RoundCombo, _Fields> deepCopy2() {
        return new RoundCombo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$RoundCombo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getCurrent_combo());
        }
        if (i11 == 2) {
            return Integer.valueOf(getMax_combo());
        }
        if (i11 == 3) {
            return getAward_combos();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$RoundCombo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetCurrent_combo();
        }
        if (i11 == 2) {
            return isSetMax_combo();
        }
        if (i11 == 3) {
            return isSetAward_combos();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$RoundCombo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetCurrent_combo();
                return;
            } else {
                setCurrent_combo(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetMax_combo();
                return;
            } else {
                setMax_combo(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetAward_combos();
        } else {
            setAward_combos((List) value);
        }
    }

    public RoundCombo(int current_combo, int max_combo, List<AwardCombo> award_combos) {
        this();
        this.current_combo = current_combo;
        setCurrent_comboIsSet(true);
        this.max_combo = max_combo;
        setMax_comboIsSet(true);
        this.award_combos = award_combos;
    }

    public boolean equals(RoundCombo that) {
        if (that == null || this.current_combo != that.current_combo || this.max_combo != that.max_combo) {
            return false;
        }
        boolean isSetAward_combos = isSetAward_combos();
        boolean isSetAward_combos2 = that.isSetAward_combos();
        if (isSetAward_combos || isSetAward_combos2) {
            return isSetAward_combos && isSetAward_combos2 && this.award_combos.equals(that.award_combos);
        }
        return true;
    }

    public RoundCombo(RoundCombo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.current_combo = other.current_combo;
        this.max_combo = other.max_combo;
        if (other.isSetAward_combos()) {
            ArrayList arrayList = new ArrayList(other.award_combos.size());
            Iterator<AwardCombo> it = other.award_combos.iterator();
            while (it.hasNext()) {
                arrayList.add(new AwardCombo(it.next()));
            }
            this.award_combos = arrayList;
        }
    }
}
