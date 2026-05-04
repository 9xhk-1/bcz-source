package com.baicizhan.online.user_study_api;

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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class StudyHomeProgress implements TBase<StudyHomeProgress, _Fields>, Serializable, Cloneable, Comparable<StudyHomeProgress> {
    private static final int __LEARNED_ISSET_ID = 1;
    private static final int __MASTERED_ISSET_ID = 0;
    private static final int __TOTAL_ISSET_ID = 2;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int learned;
    public int mastered;
    public int total;
    private static final TStruct STRUCT_DESC = new TStruct("StudyHomeProgress");
    private static final TField MASTERED_FIELD_DESC = new TField("mastered", (byte) 8, 1);
    private static final TField LEARNED_FIELD_DESC = new TField("learned", (byte) 8, 2);
    private static final TField TOTAL_FIELD_DESC = new TField(hb.d.f59153d, (byte) 8, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.StudyHomeProgress$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$StudyHomeProgress$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$StudyHomeProgress$_Fields = iArr;
            try {
                iArr[_Fields.MASTERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$StudyHomeProgress$_Fields[_Fields.LEARNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$StudyHomeProgress$_Fields[_Fields.TOTAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StudyHomeProgressStandardScheme extends StandardScheme<StudyHomeProgress> {
        private StudyHomeProgressStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, StudyHomeProgress struct) throws TException {
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
                        } else if (b11 == 8) {
                            struct.total = iprot.readI32();
                            struct.setTotalIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.learned = iprot.readI32();
                        struct.setLearnedIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.mastered = iprot.readI32();
                    struct.setMasteredIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetMastered()) {
                throw new TProtocolException("Required field 'mastered' was not found in serialized data! Struct: " + toString());
            }
            if (!struct.isSetLearned()) {
                throw new TProtocolException("Required field 'learned' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetTotal()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'total' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, StudyHomeProgress struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(StudyHomeProgress.STRUCT_DESC);
            oprot.writeFieldBegin(StudyHomeProgress.MASTERED_FIELD_DESC);
            oprot.writeI32(struct.mastered);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(StudyHomeProgress.LEARNED_FIELD_DESC);
            oprot.writeI32(struct.learned);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(StudyHomeProgress.TOTAL_FIELD_DESC);
            oprot.writeI32(struct.total);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StudyHomeProgressStandardSchemeFactory implements SchemeFactory {
        private StudyHomeProgressStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public StudyHomeProgressStandardScheme getScheme() {
            return new StudyHomeProgressStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StudyHomeProgressTupleScheme extends TupleScheme<StudyHomeProgress> {
        private StudyHomeProgressTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, StudyHomeProgress struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.mastered = tTupleProtocol.readI32();
            struct.setMasteredIsSet(true);
            struct.learned = tTupleProtocol.readI32();
            struct.setLearnedIsSet(true);
            struct.total = tTupleProtocol.readI32();
            struct.setTotalIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, StudyHomeProgress struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.mastered);
            tTupleProtocol.writeI32(struct.learned);
            tTupleProtocol.writeI32(struct.total);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StudyHomeProgressTupleSchemeFactory implements SchemeFactory {
        private StudyHomeProgressTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public StudyHomeProgressTupleScheme getScheme() {
            return new StudyHomeProgressTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        MASTERED(1, "mastered"),
        LEARNED(2, "learned"),
        TOTAL(3, hb.d.f59153d);

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
                return MASTERED;
            }
            if (fieldId == 2) {
                return LEARNED;
            }
            if (fieldId != 3) {
                return null;
            }
            return TOTAL;
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
        hashMap.put(StandardScheme.class, new StudyHomeProgressStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new StudyHomeProgressTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.MASTERED, (_Fields) new FieldMetaData("mastered", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.LEARNED, (_Fields) new FieldMetaData("learned", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.TOTAL, (_Fields) new FieldMetaData(hb.d.f59153d, (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(StudyHomeProgress.class, unmodifiableMap);
    }

    public StudyHomeProgress() {
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
        setMasteredIsSet(false);
        this.mastered = 0;
        setLearnedIsSet(false);
        this.learned = 0;
        setTotalIsSet(false);
        this.total = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof StudyHomeProgress)) {
            return equals((StudyHomeProgress) that);
        }
        return false;
    }

    public int getLearned() {
        return this.learned;
    }

    public int getMastered() {
        return this.mastered;
    }

    public int getTotal() {
        return this.total;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetLearned() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetMastered() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetTotal() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public StudyHomeProgress setLearned(int learned) {
        this.learned = learned;
        setLearnedIsSet(true);
        return this;
    }

    public void setLearnedIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public StudyHomeProgress setMastered(int mastered) {
        this.mastered = mastered;
        setMasteredIsSet(true);
        return this;
    }

    public void setMasteredIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public StudyHomeProgress setTotal(int total) {
        this.total = total;
        setTotalIsSet(true);
        return this;
    }

    public void setTotalIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public String toString() {
        return "StudyHomeProgress(mastered:" + this.mastered + org.junit.jupiter.api.j2.O + "learned:" + this.learned + org.junit.jupiter.api.j2.O + "total:" + this.total + pn.j.f81007d;
    }

    public void unsetLearned() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetMastered() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetTotal() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(StudyHomeProgress other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetMastered()).compareTo(Boolean.valueOf(other.isSetMastered()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetMastered() && (compareTo3 = TBaseHelper.compareTo(this.mastered, other.mastered)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetLearned()).compareTo(Boolean.valueOf(other.isSetLearned()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetLearned() && (compareTo2 = TBaseHelper.compareTo(this.learned, other.learned)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetTotal()).compareTo(Boolean.valueOf(other.isSetTotal()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetTotal() || (compareTo = TBaseHelper.compareTo(this.total, other.total)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<StudyHomeProgress, _Fields> deepCopy2() {
        return new StudyHomeProgress(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$StudyHomeProgress$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getMastered());
        }
        if (i11 == 2) {
            return Integer.valueOf(getLearned());
        }
        if (i11 == 3) {
            return Integer.valueOf(getTotal());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$StudyHomeProgress$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetMastered();
        }
        if (i11 == 2) {
            return isSetLearned();
        }
        if (i11 == 3) {
            return isSetTotal();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$StudyHomeProgress$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetMastered();
                return;
            } else {
                setMastered(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetLearned();
                return;
            } else {
                setLearned(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetTotal();
        } else {
            setTotal(((Integer) value).intValue());
        }
    }

    public StudyHomeProgress(int mastered, int learned, int total) {
        this();
        this.mastered = mastered;
        setMasteredIsSet(true);
        this.learned = learned;
        setLearnedIsSet(true);
        this.total = total;
        setTotalIsSet(true);
    }

    public boolean equals(StudyHomeProgress that) {
        return that != null && this.mastered == that.mastered && this.learned == that.learned && this.total == that.total;
    }

    public StudyHomeProgress(StudyHomeProgress other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.mastered = other.mastered;
        this.learned = other.learned;
        this.total = other.total;
    }

    public void validate() throws TException {
    }
}
