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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class StudyHomeV2 implements TBase<StudyHomeV2, _Fields>, Serializable, Cloneable, Comparable<StudyHomeV2> {
    private static final int __BOOK_STATUS_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int book_status;
    public StudyHome home;
    private _Fields[] optionals;
    private static final TStruct STRUCT_DESC = new TStruct("StudyHomeV2");
    private static final TField BOOK_STATUS_FIELD_DESC = new TField("book_status", (byte) 8, 1);
    private static final TField HOME_FIELD_DESC = new TField("home", (byte) 12, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.StudyHomeV2$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$StudyHomeV2$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$StudyHomeV2$_Fields = iArr;
            try {
                iArr[_Fields.BOOK_STATUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$StudyHomeV2$_Fields[_Fields.HOME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StudyHomeV2StandardScheme extends StandardScheme<StudyHomeV2> {
        private StudyHomeV2StandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, StudyHomeV2 struct) throws TException {
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
                    } else if (b11 == 12) {
                        StudyHome studyHome = new StudyHome();
                        struct.home = studyHome;
                        studyHome.read(iprot);
                        struct.setHomeIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.book_status = iprot.readI32();
                    struct.setBook_statusIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetBook_status()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'book_status' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, StudyHomeV2 struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(StudyHomeV2.STRUCT_DESC);
            oprot.writeFieldBegin(StudyHomeV2.BOOK_STATUS_FIELD_DESC);
            oprot.writeI32(struct.book_status);
            oprot.writeFieldEnd();
            if (struct.home != null && struct.isSetHome()) {
                oprot.writeFieldBegin(StudyHomeV2.HOME_FIELD_DESC);
                struct.home.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StudyHomeV2StandardSchemeFactory implements SchemeFactory {
        private StudyHomeV2StandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public StudyHomeV2StandardScheme getScheme() {
            return new StudyHomeV2StandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StudyHomeV2TupleScheme extends TupleScheme<StudyHomeV2> {
        private StudyHomeV2TupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, StudyHomeV2 struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.book_status = tTupleProtocol.readI32();
            struct.setBook_statusIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                StudyHome studyHome = new StudyHome();
                struct.home = studyHome;
                studyHome.read(tTupleProtocol);
                struct.setHomeIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, StudyHomeV2 struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.book_status);
            BitSet bitSet = new BitSet();
            if (struct.isSetHome()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetHome()) {
                struct.home.write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StudyHomeV2TupleSchemeFactory implements SchemeFactory {
        private StudyHomeV2TupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public StudyHomeV2TupleScheme getScheme() {
            return new StudyHomeV2TupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        BOOK_STATUS(1, "book_status"),
        HOME(2, "home");

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
                return BOOK_STATUS;
            }
            if (fieldId != 2) {
                return null;
            }
            return HOME;
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
        hashMap.put(StandardScheme.class, new StudyHomeV2StandardSchemeFactory());
        hashMap.put(TupleScheme.class, new StudyHomeV2TupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.BOOK_STATUS, (_Fields) new FieldMetaData("book_status", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.HOME, (_Fields) new FieldMetaData("home", (byte) 2, new StructMetaData((byte) 12, StudyHome.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(StudyHomeV2.class, unmodifiableMap);
    }

    public StudyHomeV2() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.HOME};
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
        setBook_statusIsSet(false);
        this.book_status = 0;
        this.home = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof StudyHomeV2)) {
            return equals((StudyHomeV2) that);
        }
        return false;
    }

    public int getBook_status() {
        return this.book_status;
    }

    public StudyHome getHome() {
        return this.home;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetBook_status() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetHome() {
        return this.home != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public StudyHomeV2 setBook_status(int book_status) {
        this.book_status = book_status;
        setBook_statusIsSet(true);
        return this;
    }

    public void setBook_statusIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public StudyHomeV2 setHome(StudyHome home) {
        this.home = home;
        return this;
    }

    public void setHomeIsSet(boolean value) {
        if (value) {
            return;
        }
        this.home = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("StudyHomeV2(");
        sb2.append("book_status:");
        sb2.append(this.book_status);
        if (isSetHome()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("home:");
            StudyHome studyHome = this.home;
            if (studyHome == null) {
                sb2.append("null");
            } else {
                sb2.append(studyHome);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetBook_status() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetHome() {
        this.home = null;
    }

    public void validate() throws TException {
        StudyHome studyHome = this.home;
        if (studyHome != null) {
            studyHome.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(StudyHomeV2 other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetBook_status()).compareTo(Boolean.valueOf(other.isSetBook_status()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetBook_status() && (compareTo2 = TBaseHelper.compareTo(this.book_status, other.book_status)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetHome()).compareTo(Boolean.valueOf(other.isSetHome()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetHome() || (compareTo = TBaseHelper.compareTo((Comparable) this.home, (Comparable) other.home)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<StudyHomeV2, _Fields> deepCopy2() {
        return new StudyHomeV2(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$StudyHomeV2$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getBook_status());
        }
        if (i11 == 2) {
            return getHome();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$StudyHomeV2$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetBook_status();
        }
        if (i11 == 2) {
            return isSetHome();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$StudyHomeV2$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetBook_status();
                return;
            } else {
                setBook_status(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetHome();
        } else {
            setHome((StudyHome) value);
        }
    }

    public boolean equals(StudyHomeV2 that) {
        if (that == null || this.book_status != that.book_status) {
            return false;
        }
        boolean isSetHome = isSetHome();
        boolean isSetHome2 = that.isSetHome();
        if (isSetHome || isSetHome2) {
            return isSetHome && isSetHome2 && this.home.equals(that.home);
        }
        return true;
    }

    public StudyHomeV2(int book_status) {
        this();
        this.book_status = book_status;
        setBook_statusIsSet(true);
    }

    public StudyHomeV2(StudyHomeV2 other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.HOME};
        this.__isset_bitfield = other.__isset_bitfield;
        this.book_status = other.book_status;
        if (other.isSetHome()) {
            this.home = new StudyHome(other.home);
        }
    }
}
