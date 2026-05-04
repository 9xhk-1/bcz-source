package com.baicizhan.online.user_study_api;

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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class PangolinAD implements TBase<PangolinAD, _Fields>, Serializable, Cloneable, Comparable<PangolinAD> {
    private static final int __ENABLEPANGOLIN_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int enablePangolin;
    private _Fields[] optionals;
    public String slotId1;
    public String slotId2;
    private static final TStruct STRUCT_DESC = new TStruct("PangolinAD");
    private static final TField ENABLE_PANGOLIN_FIELD_DESC = new TField("enablePangolin", (byte) 8, 1);
    private static final TField SLOT_ID1_FIELD_DESC = new TField("slotId1", (byte) 11, 2);
    private static final TField SLOT_ID2_FIELD_DESC = new TField("slotId2", (byte) 11, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.PangolinAD$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$PangolinAD$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$PangolinAD$_Fields = iArr;
            try {
                iArr[_Fields.ENABLE_PANGOLIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$PangolinAD$_Fields[_Fields.SLOT_ID1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$PangolinAD$_Fields[_Fields.SLOT_ID2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PangolinADStandardScheme extends StandardScheme<PangolinAD> {
        private PangolinADStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, PangolinAD struct) throws TException {
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
                        } else if (b11 == 11) {
                            struct.slotId2 = iprot.readString();
                            struct.setSlotId2IsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.slotId1 = iprot.readString();
                        struct.setSlotId1IsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.enablePangolin = iprot.readI32();
                    struct.setEnablePangolinIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetEnablePangolin()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'enablePangolin' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, PangolinAD struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(PangolinAD.STRUCT_DESC);
            oprot.writeFieldBegin(PangolinAD.ENABLE_PANGOLIN_FIELD_DESC);
            oprot.writeI32(struct.enablePangolin);
            oprot.writeFieldEnd();
            if (struct.slotId1 != null && struct.isSetSlotId1()) {
                oprot.writeFieldBegin(PangolinAD.SLOT_ID1_FIELD_DESC);
                oprot.writeString(struct.slotId1);
                oprot.writeFieldEnd();
            }
            if (struct.slotId2 != null && struct.isSetSlotId2()) {
                oprot.writeFieldBegin(PangolinAD.SLOT_ID2_FIELD_DESC);
                oprot.writeString(struct.slotId2);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PangolinADStandardSchemeFactory implements SchemeFactory {
        private PangolinADStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public PangolinADStandardScheme getScheme() {
            return new PangolinADStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PangolinADTupleScheme extends TupleScheme<PangolinAD> {
        private PangolinADTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, PangolinAD struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.enablePangolin = tTupleProtocol.readI32();
            struct.setEnablePangolinIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(2);
            if (readBitSet.get(0)) {
                struct.slotId1 = tTupleProtocol.readString();
                struct.setSlotId1IsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.slotId2 = tTupleProtocol.readString();
                struct.setSlotId2IsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, PangolinAD struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.enablePangolin);
            BitSet bitSet = new BitSet();
            if (struct.isSetSlotId1()) {
                bitSet.set(0);
            }
            if (struct.isSetSlotId2()) {
                bitSet.set(1);
            }
            tTupleProtocol.writeBitSet(bitSet, 2);
            if (struct.isSetSlotId1()) {
                tTupleProtocol.writeString(struct.slotId1);
            }
            if (struct.isSetSlotId2()) {
                tTupleProtocol.writeString(struct.slotId2);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PangolinADTupleSchemeFactory implements SchemeFactory {
        private PangolinADTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public PangolinADTupleScheme getScheme() {
            return new PangolinADTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ENABLE_PANGOLIN(1, "enablePangolin"),
        SLOT_ID1(2, "slotId1"),
        SLOT_ID2(3, "slotId2");

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
                return ENABLE_PANGOLIN;
            }
            if (fieldId == 2) {
                return SLOT_ID1;
            }
            if (fieldId != 3) {
                return null;
            }
            return SLOT_ID2;
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
        hashMap.put(StandardScheme.class, new PangolinADStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new PangolinADTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ENABLE_PANGOLIN, (_Fields) new FieldMetaData("enablePangolin", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.SLOT_ID1, (_Fields) new FieldMetaData("slotId1", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SLOT_ID2, (_Fields) new FieldMetaData("slotId2", (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(PangolinAD.class, unmodifiableMap);
    }

    public PangolinAD() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.SLOT_ID1, _Fields.SLOT_ID2};
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
        setEnablePangolinIsSet(false);
        this.enablePangolin = 0;
        this.slotId1 = null;
        this.slotId2 = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof PangolinAD)) {
            return equals((PangolinAD) that);
        }
        return false;
    }

    public int getEnablePangolin() {
        return this.enablePangolin;
    }

    public String getSlotId1() {
        return this.slotId1;
    }

    public String getSlotId2() {
        return this.slotId2;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetEnablePangolin() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetSlotId1() {
        return this.slotId1 != null;
    }

    public boolean isSetSlotId2() {
        return this.slotId2 != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public PangolinAD setEnablePangolin(int enablePangolin) {
        this.enablePangolin = enablePangolin;
        setEnablePangolinIsSet(true);
        return this;
    }

    public void setEnablePangolinIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public PangolinAD setSlotId1(String slotId1) {
        this.slotId1 = slotId1;
        return this;
    }

    public void setSlotId1IsSet(boolean value) {
        if (value) {
            return;
        }
        this.slotId1 = null;
    }

    public PangolinAD setSlotId2(String slotId2) {
        this.slotId2 = slotId2;
        return this;
    }

    public void setSlotId2IsSet(boolean value) {
        if (value) {
            return;
        }
        this.slotId2 = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PangolinAD(");
        sb2.append("enablePangolin:");
        sb2.append(this.enablePangolin);
        if (isSetSlotId1()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("slotId1:");
            String str = this.slotId1;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
        }
        if (isSetSlotId2()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("slotId2:");
            String str2 = this.slotId2;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetEnablePangolin() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetSlotId1() {
        this.slotId1 = null;
    }

    public void unsetSlotId2() {
        this.slotId2 = null;
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(PangolinAD other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetEnablePangolin()).compareTo(Boolean.valueOf(other.isSetEnablePangolin()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetEnablePangolin() && (compareTo3 = TBaseHelper.compareTo(this.enablePangolin, other.enablePangolin)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetSlotId1()).compareTo(Boolean.valueOf(other.isSetSlotId1()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetSlotId1() && (compareTo2 = TBaseHelper.compareTo(this.slotId1, other.slotId1)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetSlotId2()).compareTo(Boolean.valueOf(other.isSetSlotId2()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetSlotId2() || (compareTo = TBaseHelper.compareTo(this.slotId2, other.slotId2)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<PangolinAD, _Fields> deepCopy2() {
        return new PangolinAD(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$PangolinAD$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getEnablePangolin());
        }
        if (i11 == 2) {
            return getSlotId1();
        }
        if (i11 == 3) {
            return getSlotId2();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$PangolinAD$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetEnablePangolin();
        }
        if (i11 == 2) {
            return isSetSlotId1();
        }
        if (i11 == 3) {
            return isSetSlotId2();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$PangolinAD$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetEnablePangolin();
                return;
            } else {
                setEnablePangolin(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetSlotId1();
                return;
            } else {
                setSlotId1((String) value);
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetSlotId2();
        } else {
            setSlotId2((String) value);
        }
    }

    public boolean equals(PangolinAD that) {
        if (that == null || this.enablePangolin != that.enablePangolin) {
            return false;
        }
        boolean isSetSlotId1 = isSetSlotId1();
        boolean isSetSlotId12 = that.isSetSlotId1();
        if ((isSetSlotId1 || isSetSlotId12) && !(isSetSlotId1 && isSetSlotId12 && this.slotId1.equals(that.slotId1))) {
            return false;
        }
        boolean isSetSlotId2 = isSetSlotId2();
        boolean isSetSlotId22 = that.isSetSlotId2();
        if (isSetSlotId2 || isSetSlotId22) {
            return isSetSlotId2 && isSetSlotId22 && this.slotId2.equals(that.slotId2);
        }
        return true;
    }

    public PangolinAD(int enablePangolin) {
        this();
        this.enablePangolin = enablePangolin;
        setEnablePangolinIsSet(true);
    }

    public PangolinAD(PangolinAD other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.SLOT_ID1, _Fields.SLOT_ID2};
        this.__isset_bitfield = other.__isset_bitfield;
        this.enablePangolin = other.enablePangolin;
        if (other.isSetSlotId1()) {
            this.slotId1 = other.slotId1;
        }
        if (other.isSetSlotId2()) {
            this.slotId2 = other.slotId2;
        }
    }

    public void validate() throws TException {
    }
}
