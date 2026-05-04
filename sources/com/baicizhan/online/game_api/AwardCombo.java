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
public class AwardCombo implements TBase<AwardCombo, _Fields>, Serializable, Cloneable, Comparable<AwardCombo> {
    private static final int __COMBO_TOTALL_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public List<AwardItem> awards;
    public int combo_totall;
    private static final TStruct STRUCT_DESC = new TStruct("AwardCombo");
    private static final TField COMBO_TOTALL_FIELD_DESC = new TField("combo_totall", (byte) 8, 1);
    private static final TField AWARDS_FIELD_DESC = new TField("awards", (byte) 15, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.AwardCombo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$AwardCombo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$AwardCombo$_Fields = iArr;
            try {
                iArr[_Fields.COMBO_TOTALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$AwardCombo$_Fields[_Fields.AWARDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AwardComboStandardScheme extends StandardScheme<AwardCombo> {
        private AwardComboStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, AwardCombo struct) throws TException {
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
                    } else if (b11 == 15) {
                        TList readListBegin = iprot.readListBegin();
                        struct.awards = new ArrayList(readListBegin.size);
                        for (int i11 = 0; i11 < readListBegin.size; i11++) {
                            AwardItem awardItem = new AwardItem();
                            awardItem.read(iprot);
                            struct.awards.add(awardItem);
                        }
                        iprot.readListEnd();
                        struct.setAwardsIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.combo_totall = iprot.readI32();
                    struct.setCombo_totallIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetCombo_totall()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'combo_totall' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, AwardCombo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(AwardCombo.STRUCT_DESC);
            oprot.writeFieldBegin(AwardCombo.COMBO_TOTALL_FIELD_DESC);
            oprot.writeI32(struct.combo_totall);
            oprot.writeFieldEnd();
            if (struct.awards != null) {
                oprot.writeFieldBegin(AwardCombo.AWARDS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.awards.size()));
                Iterator<AwardItem> it = struct.awards.iterator();
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
    public static class AwardComboStandardSchemeFactory implements SchemeFactory {
        private AwardComboStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AwardComboStandardScheme getScheme() {
            return new AwardComboStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AwardComboTupleScheme extends TupleScheme<AwardCombo> {
        private AwardComboTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, AwardCombo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.combo_totall = tTupleProtocol.readI32();
            struct.setCombo_totallIsSet(true);
            TList tList = new TList((byte) 12, tTupleProtocol.readI32());
            struct.awards = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                AwardItem awardItem = new AwardItem();
                awardItem.read(tTupleProtocol);
                struct.awards.add(awardItem);
            }
            struct.setAwardsIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, AwardCombo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.combo_totall);
            tTupleProtocol.writeI32(struct.awards.size());
            Iterator<AwardItem> it = struct.awards.iterator();
            while (it.hasNext()) {
                it.next().write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AwardComboTupleSchemeFactory implements SchemeFactory {
        private AwardComboTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AwardComboTupleScheme getScheme() {
            return new AwardComboTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        COMBO_TOTALL(1, "combo_totall"),
        AWARDS(2, "awards");

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
                return COMBO_TOTALL;
            }
            if (fieldId != 2) {
                return null;
            }
            return AWARDS;
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
        hashMap.put(StandardScheme.class, new AwardComboStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new AwardComboTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.COMBO_TOTALL, (_Fields) new FieldMetaData("combo_totall", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.AWARDS, (_Fields) new FieldMetaData("awards", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, AwardItem.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(AwardCombo.class, unmodifiableMap);
    }

    public AwardCombo() {
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

    public void addToAwards(AwardItem elem) {
        if (this.awards == null) {
            this.awards = new ArrayList();
        }
        this.awards.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        setCombo_totallIsSet(false);
        this.combo_totall = 0;
        this.awards = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof AwardCombo)) {
            return equals((AwardCombo) that);
        }
        return false;
    }

    public List<AwardItem> getAwards() {
        return this.awards;
    }

    public Iterator<AwardItem> getAwardsIterator() {
        List<AwardItem> list = this.awards;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getAwardsSize() {
        List<AwardItem> list = this.awards;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int getCombo_totall() {
        return this.combo_totall;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAwards() {
        return this.awards != null;
    }

    public boolean isSetCombo_totall() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public AwardCombo setAwards(List<AwardItem> awards) {
        this.awards = awards;
        return this;
    }

    public void setAwardsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.awards = null;
    }

    public AwardCombo setCombo_totall(int combo_totall) {
        this.combo_totall = combo_totall;
        setCombo_totallIsSet(true);
        return this;
    }

    public void setCombo_totallIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AwardCombo(");
        sb2.append("combo_totall:");
        sb2.append(this.combo_totall);
        sb2.append(j2.O);
        sb2.append("awards:");
        List<AwardItem> list = this.awards;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAwards() {
        this.awards = null;
    }

    public void unsetCombo_totall() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void validate() throws TException {
        if (this.awards != null) {
            return;
        }
        throw new TProtocolException("Required field 'awards' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(AwardCombo other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetCombo_totall()).compareTo(Boolean.valueOf(other.isSetCombo_totall()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetCombo_totall() && (compareTo2 = TBaseHelper.compareTo(this.combo_totall, other.combo_totall)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetAwards()).compareTo(Boolean.valueOf(other.isSetAwards()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetAwards() || (compareTo = TBaseHelper.compareTo((List) this.awards, (List) other.awards)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<AwardCombo, _Fields> deepCopy2() {
        return new AwardCombo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$AwardCombo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getCombo_totall());
        }
        if (i11 == 2) {
            return getAwards();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$AwardCombo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetCombo_totall();
        }
        if (i11 == 2) {
            return isSetAwards();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$AwardCombo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetCombo_totall();
                return;
            } else {
                setCombo_totall(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetAwards();
        } else {
            setAwards((List) value);
        }
    }

    public AwardCombo(int combo_totall, List<AwardItem> awards) {
        this();
        this.combo_totall = combo_totall;
        setCombo_totallIsSet(true);
        this.awards = awards;
    }

    public boolean equals(AwardCombo that) {
        if (that == null || this.combo_totall != that.combo_totall) {
            return false;
        }
        boolean isSetAwards = isSetAwards();
        boolean isSetAwards2 = that.isSetAwards();
        if (isSetAwards || isSetAwards2) {
            return isSetAwards && isSetAwards2 && this.awards.equals(that.awards);
        }
        return true;
    }

    public AwardCombo(AwardCombo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.combo_totall = other.combo_totall;
        if (other.isSetAwards()) {
            ArrayList arrayList = new ArrayList(other.awards.size());
            Iterator<AwardItem> it = other.awards.iterator();
            while (it.hasNext()) {
                arrayList.add(new AwardItem(it.next()));
            }
            this.awards = arrayList;
        }
    }
}
