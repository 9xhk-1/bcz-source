package com.baicizhan.online.bs_words;

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
public class BBExam implements TBase<BBExam, _Fields>, Serializable, Cloneable, Comparable<BBExam> {
    private static final int __EXAM_ID_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int exam_id;
    public String exam_name;
    private static final TStruct STRUCT_DESC = new TStruct("BBExam");
    private static final TField EXAM_ID_FIELD_DESC = new TField("exam_id", (byte) 8, 1);
    private static final TField EXAM_NAME_FIELD_DESC = new TField("exam_name", (byte) 11, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_words.BBExam$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_words$BBExam$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_words$BBExam$_Fields = iArr;
            try {
                iArr[_Fields.EXAM_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBExam$_Fields[_Fields.EXAM_NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBExamStandardScheme extends StandardScheme<BBExam> {
        private BBExamStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BBExam struct) throws TException {
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
                    } else if (b11 == 11) {
                        struct.exam_name = iprot.readString();
                        struct.setExam_nameIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.exam_id = iprot.readI32();
                    struct.setExam_idIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetExam_id()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'exam_id' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BBExam struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BBExam.STRUCT_DESC);
            oprot.writeFieldBegin(BBExam.EXAM_ID_FIELD_DESC);
            oprot.writeI32(struct.exam_id);
            oprot.writeFieldEnd();
            if (struct.exam_name != null) {
                oprot.writeFieldBegin(BBExam.EXAM_NAME_FIELD_DESC);
                oprot.writeString(struct.exam_name);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBExamStandardSchemeFactory implements SchemeFactory {
        private BBExamStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBExamStandardScheme getScheme() {
            return new BBExamStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBExamTupleScheme extends TupleScheme<BBExam> {
        private BBExamTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BBExam struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.exam_id = tTupleProtocol.readI32();
            struct.setExam_idIsSet(true);
            struct.exam_name = tTupleProtocol.readString();
            struct.setExam_nameIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BBExam struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.exam_id);
            tTupleProtocol.writeString(struct.exam_name);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBExamTupleSchemeFactory implements SchemeFactory {
        private BBExamTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBExamTupleScheme getScheme() {
            return new BBExamTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        EXAM_ID(1, "exam_id"),
        EXAM_NAME(2, "exam_name");

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
                return EXAM_ID;
            }
            if (fieldId != 2) {
                return null;
            }
            return EXAM_NAME;
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
        hashMap.put(StandardScheme.class, new BBExamStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BBExamTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.EXAM_ID, (_Fields) new FieldMetaData("exam_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.EXAM_NAME, (_Fields) new FieldMetaData("exam_name", (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BBExam.class, unmodifiableMap);
    }

    public BBExam() {
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
        setExam_idIsSet(false);
        this.exam_id = 0;
        this.exam_name = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BBExam)) {
            return equals((BBExam) that);
        }
        return false;
    }

    public int getExam_id() {
        return this.exam_id;
    }

    public String getExam_name() {
        return this.exam_name;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetExam_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetExam_name() {
        return this.exam_name != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BBExam setExam_id(int exam_id) {
        this.exam_id = exam_id;
        setExam_idIsSet(true);
        return this;
    }

    public void setExam_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public BBExam setExam_name(String exam_name) {
        this.exam_name = exam_name;
        return this;
    }

    public void setExam_nameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.exam_name = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BBExam(");
        sb2.append("exam_id:");
        sb2.append(this.exam_id);
        sb2.append(j2.O);
        sb2.append("exam_name:");
        String str = this.exam_name;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetExam_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetExam_name() {
        this.exam_name = null;
    }

    public void validate() throws TException {
        if (this.exam_name != null) {
            return;
        }
        throw new TProtocolException("Required field 'exam_name' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BBExam other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetExam_id()).compareTo(Boolean.valueOf(other.isSetExam_id()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetExam_id() && (compareTo2 = TBaseHelper.compareTo(this.exam_id, other.exam_id)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetExam_name()).compareTo(Boolean.valueOf(other.isSetExam_name()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetExam_name() || (compareTo = TBaseHelper.compareTo(this.exam_name, other.exam_name)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BBExam, _Fields> deepCopy2() {
        return new BBExam(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBExam$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getExam_id());
        }
        if (i11 == 2) {
            return getExam_name();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBExam$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetExam_id();
        }
        if (i11 == 2) {
            return isSetExam_name();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBExam$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetExam_id();
                return;
            } else {
                setExam_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetExam_name();
        } else {
            setExam_name((String) value);
        }
    }

    public BBExam(int exam_id, String exam_name) {
        this();
        this.exam_id = exam_id;
        setExam_idIsSet(true);
        this.exam_name = exam_name;
    }

    public boolean equals(BBExam that) {
        if (that == null || this.exam_id != that.exam_id) {
            return false;
        }
        boolean isSetExam_name = isSetExam_name();
        boolean isSetExam_name2 = that.isSetExam_name();
        if (isSetExam_name || isSetExam_name2) {
            return isSetExam_name && isSetExam_name2 && this.exam_name.equals(that.exam_name);
        }
        return true;
    }

    public BBExam(BBExam other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.exam_id = other.exam_id;
        if (other.isSetExam_name()) {
            this.exam_name = other.exam_name;
        }
    }
}
