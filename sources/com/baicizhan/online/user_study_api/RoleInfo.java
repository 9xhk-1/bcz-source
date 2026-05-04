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
public class RoleInfo implements TBase<RoleInfo, _Fields>, Serializable, Cloneable, Comparable<RoleInfo> {
    private static final int __GRADE_ISSET_ID = 1;
    private static final int __ROLE_UP_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int grade;
    public int role_up;
    private static final TStruct STRUCT_DESC = new TStruct("RoleInfo");
    private static final TField ROLE_UP_FIELD_DESC = new TField("role_up", (byte) 8, 1);
    private static final TField GRADE_FIELD_DESC = new TField("grade", (byte) 8, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.RoleInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$RoleInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$RoleInfo$_Fields = iArr;
            try {
                iArr[_Fields.ROLE_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$RoleInfo$_Fields[_Fields.GRADE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RoleInfoStandardScheme extends StandardScheme<RoleInfo> {
        private RoleInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, RoleInfo struct) throws TException {
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
                        struct.grade = iprot.readI32();
                        struct.setGradeIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.role_up = iprot.readI32();
                    struct.setRole_upIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetRole_up()) {
                throw new TProtocolException("Required field 'role_up' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetGrade()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'grade' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, RoleInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(RoleInfo.STRUCT_DESC);
            oprot.writeFieldBegin(RoleInfo.ROLE_UP_FIELD_DESC);
            oprot.writeI32(struct.role_up);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(RoleInfo.GRADE_FIELD_DESC);
            oprot.writeI32(struct.grade);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RoleInfoStandardSchemeFactory implements SchemeFactory {
        private RoleInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public RoleInfoStandardScheme getScheme() {
            return new RoleInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RoleInfoTupleScheme extends TupleScheme<RoleInfo> {
        private RoleInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, RoleInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.role_up = tTupleProtocol.readI32();
            struct.setRole_upIsSet(true);
            struct.grade = tTupleProtocol.readI32();
            struct.setGradeIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, RoleInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.role_up);
            tTupleProtocol.writeI32(struct.grade);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RoleInfoTupleSchemeFactory implements SchemeFactory {
        private RoleInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public RoleInfoTupleScheme getScheme() {
            return new RoleInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ROLE_UP(1, "role_up"),
        GRADE(2, "grade");

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
                return ROLE_UP;
            }
            if (fieldId != 2) {
                return null;
            }
            return GRADE;
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
        hashMap.put(StandardScheme.class, new RoleInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new RoleInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ROLE_UP, (_Fields) new FieldMetaData("role_up", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.GRADE, (_Fields) new FieldMetaData("grade", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(RoleInfo.class, unmodifiableMap);
    }

    public RoleInfo() {
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
        setRole_upIsSet(false);
        this.role_up = 0;
        setGradeIsSet(false);
        this.grade = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof RoleInfo)) {
            return equals((RoleInfo) that);
        }
        return false;
    }

    public int getGrade() {
        return this.grade;
    }

    public int getRole_up() {
        return this.role_up;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetGrade() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetRole_up() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public RoleInfo setGrade(int grade) {
        this.grade = grade;
        setGradeIsSet(true);
        return this;
    }

    public void setGradeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public RoleInfo setRole_up(int role_up) {
        this.role_up = role_up;
        setRole_upIsSet(true);
        return this;
    }

    public void setRole_upIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        return "RoleInfo(role_up:" + this.role_up + org.junit.jupiter.api.j2.O + "grade:" + this.grade + pn.j.f81007d;
    }

    public void unsetGrade() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetRole_up() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(RoleInfo other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetRole_up()).compareTo(Boolean.valueOf(other.isSetRole_up()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetRole_up() && (compareTo2 = TBaseHelper.compareTo(this.role_up, other.role_up)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetGrade()).compareTo(Boolean.valueOf(other.isSetGrade()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetGrade() || (compareTo = TBaseHelper.compareTo(this.grade, other.grade)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<RoleInfo, _Fields> deepCopy2() {
        return new RoleInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$RoleInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getRole_up());
        }
        if (i11 == 2) {
            return Integer.valueOf(getGrade());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$RoleInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetRole_up();
        }
        if (i11 == 2) {
            return isSetGrade();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$RoleInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetRole_up();
                return;
            } else {
                setRole_up(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetGrade();
        } else {
            setGrade(((Integer) value).intValue());
        }
    }

    public RoleInfo(int role_up, int grade) {
        this();
        this.role_up = role_up;
        setRole_upIsSet(true);
        this.grade = grade;
        setGradeIsSet(true);
    }

    public boolean equals(RoleInfo that) {
        return that != null && this.role_up == that.role_up && this.grade == that.grade;
    }

    public RoleInfo(RoleInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.role_up = other.role_up;
        this.grade = other.grade;
    }

    public void validate() throws TException {
    }
}
