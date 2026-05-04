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
public class SentenceLessonInfo implements TBase<SentenceLessonInfo, _Fields>, Serializable, Cloneable, Comparable<SentenceLessonInfo> {
    private static final int __LESSON_NO_ISSET_ID = 1;
    private static final int __UNIT_NO_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int lesson_no;
    public String lesson_type;
    public int unit_no;
    private static final TStruct STRUCT_DESC = new TStruct("SentenceLessonInfo");
    private static final TField UNIT_NO_FIELD_DESC = new TField("unit_no", (byte) 8, 1);
    private static final TField LESSON_NO_FIELD_DESC = new TField("lesson_no", (byte) 8, 2);
    private static final TField LESSON_TYPE_FIELD_DESC = new TField("lesson_type", (byte) 11, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.SentenceLessonInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$SentenceLessonInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$SentenceLessonInfo$_Fields = iArr;
            try {
                iArr[_Fields.UNIT_NO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$SentenceLessonInfo$_Fields[_Fields.LESSON_NO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$SentenceLessonInfo$_Fields[_Fields.LESSON_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SentenceLessonInfoStandardScheme extends StandardScheme<SentenceLessonInfo> {
        private SentenceLessonInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, SentenceLessonInfo struct) throws TException {
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
                            struct.lesson_type = iprot.readString();
                            struct.setLesson_typeIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.lesson_no = iprot.readI32();
                        struct.setLesson_noIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.unit_no = iprot.readI32();
                    struct.setUnit_noIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetUnit_no()) {
                throw new TProtocolException("Required field 'unit_no' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetLesson_no()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'lesson_no' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, SentenceLessonInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(SentenceLessonInfo.STRUCT_DESC);
            oprot.writeFieldBegin(SentenceLessonInfo.UNIT_NO_FIELD_DESC);
            oprot.writeI32(struct.unit_no);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(SentenceLessonInfo.LESSON_NO_FIELD_DESC);
            oprot.writeI32(struct.lesson_no);
            oprot.writeFieldEnd();
            if (struct.lesson_type != null) {
                oprot.writeFieldBegin(SentenceLessonInfo.LESSON_TYPE_FIELD_DESC);
                oprot.writeString(struct.lesson_type);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SentenceLessonInfoStandardSchemeFactory implements SchemeFactory {
        private SentenceLessonInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SentenceLessonInfoStandardScheme getScheme() {
            return new SentenceLessonInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SentenceLessonInfoTupleScheme extends TupleScheme<SentenceLessonInfo> {
        private SentenceLessonInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, SentenceLessonInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.unit_no = tTupleProtocol.readI32();
            struct.setUnit_noIsSet(true);
            struct.lesson_no = tTupleProtocol.readI32();
            struct.setLesson_noIsSet(true);
            struct.lesson_type = tTupleProtocol.readString();
            struct.setLesson_typeIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, SentenceLessonInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.unit_no);
            tTupleProtocol.writeI32(struct.lesson_no);
            tTupleProtocol.writeString(struct.lesson_type);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SentenceLessonInfoTupleSchemeFactory implements SchemeFactory {
        private SentenceLessonInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SentenceLessonInfoTupleScheme getScheme() {
            return new SentenceLessonInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        UNIT_NO(1, "unit_no"),
        LESSON_NO(2, "lesson_no"),
        LESSON_TYPE(3, "lesson_type");

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
                return UNIT_NO;
            }
            if (fieldId == 2) {
                return LESSON_NO;
            }
            if (fieldId != 3) {
                return null;
            }
            return LESSON_TYPE;
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
        hashMap.put(StandardScheme.class, new SentenceLessonInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new SentenceLessonInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.UNIT_NO, (_Fields) new FieldMetaData("unit_no", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.LESSON_NO, (_Fields) new FieldMetaData("lesson_no", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.LESSON_TYPE, (_Fields) new FieldMetaData("lesson_type", (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(SentenceLessonInfo.class, unmodifiableMap);
    }

    public SentenceLessonInfo() {
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
        setUnit_noIsSet(false);
        this.unit_no = 0;
        setLesson_noIsSet(false);
        this.lesson_no = 0;
        this.lesson_type = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof SentenceLessonInfo)) {
            return equals((SentenceLessonInfo) that);
        }
        return false;
    }

    public int getLesson_no() {
        return this.lesson_no;
    }

    public String getLesson_type() {
        return this.lesson_type;
    }

    public int getUnit_no() {
        return this.unit_no;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetLesson_no() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetLesson_type() {
        return this.lesson_type != null;
    }

    public boolean isSetUnit_no() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public SentenceLessonInfo setLesson_no(int lesson_no) {
        this.lesson_no = lesson_no;
        setLesson_noIsSet(true);
        return this;
    }

    public void setLesson_noIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public SentenceLessonInfo setLesson_type(String lesson_type) {
        this.lesson_type = lesson_type;
        return this;
    }

    public void setLesson_typeIsSet(boolean value) {
        if (value) {
            return;
        }
        this.lesson_type = null;
    }

    public SentenceLessonInfo setUnit_no(int unit_no) {
        this.unit_no = unit_no;
        setUnit_noIsSet(true);
        return this;
    }

    public void setUnit_noIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SentenceLessonInfo(");
        sb2.append("unit_no:");
        sb2.append(this.unit_no);
        sb2.append(j2.O);
        sb2.append("lesson_no:");
        sb2.append(this.lesson_no);
        sb2.append(j2.O);
        sb2.append("lesson_type:");
        String str = this.lesson_type;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetLesson_no() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetLesson_type() {
        this.lesson_type = null;
    }

    public void unsetUnit_no() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void validate() throws TException {
        if (this.lesson_type != null) {
            return;
        }
        throw new TProtocolException("Required field 'lesson_type' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(SentenceLessonInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetUnit_no()).compareTo(Boolean.valueOf(other.isSetUnit_no()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetUnit_no() && (compareTo3 = TBaseHelper.compareTo(this.unit_no, other.unit_no)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetLesson_no()).compareTo(Boolean.valueOf(other.isSetLesson_no()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetLesson_no() && (compareTo2 = TBaseHelper.compareTo(this.lesson_no, other.lesson_no)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetLesson_type()).compareTo(Boolean.valueOf(other.isSetLesson_type()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetLesson_type() || (compareTo = TBaseHelper.compareTo(this.lesson_type, other.lesson_type)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<SentenceLessonInfo, _Fields> deepCopy2() {
        return new SentenceLessonInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$SentenceLessonInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getUnit_no());
        }
        if (i11 == 2) {
            return Integer.valueOf(getLesson_no());
        }
        if (i11 == 3) {
            return getLesson_type();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$SentenceLessonInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetUnit_no();
        }
        if (i11 == 2) {
            return isSetLesson_no();
        }
        if (i11 == 3) {
            return isSetLesson_type();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$SentenceLessonInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetUnit_no();
                return;
            } else {
                setUnit_no(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetLesson_no();
                return;
            } else {
                setLesson_no(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetLesson_type();
        } else {
            setLesson_type((String) value);
        }
    }

    public SentenceLessonInfo(int unit_no, int lesson_no, String lesson_type) {
        this();
        this.unit_no = unit_no;
        setUnit_noIsSet(true);
        this.lesson_no = lesson_no;
        setLesson_noIsSet(true);
        this.lesson_type = lesson_type;
    }

    public boolean equals(SentenceLessonInfo that) {
        if (that == null || this.unit_no != that.unit_no || this.lesson_no != that.lesson_no) {
            return false;
        }
        boolean isSetLesson_type = isSetLesson_type();
        boolean isSetLesson_type2 = that.isSetLesson_type();
        if (isSetLesson_type || isSetLesson_type2) {
            return isSetLesson_type && isSetLesson_type2 && this.lesson_type.equals(that.lesson_type);
        }
        return true;
    }

    public SentenceLessonInfo(SentenceLessonInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.unit_no = other.unit_no;
        this.lesson_no = other.lesson_no;
        if (other.isSetLesson_type()) {
            this.lesson_type = other.lesson_type;
        }
    }
}
