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
public class EducationInfo implements TBase<EducationInfo, _Fields>, Serializable, Cloneable, Comparable<EducationInfo> {
    private static final int __IS_UNIVERSITY_ISSET_ID = 4;
    private static final int __MAJOR_ID_ISSET_ID = 2;
    private static final int __SCHOOL_BG_ISSET_ID = 3;
    private static final int __SCHOOL_ID_ISSET_ID = 0;
    private static final int __SCHOOL_YEAR_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public boolean is_university;
    public int major_id;
    private _Fields[] optionals;
    public int school_bg;
    public int school_id;
    public String school_major;
    public String school_name;
    public long school_year;
    private static final TStruct STRUCT_DESC = new TStruct("EducationInfo");
    private static final TField SCHOOL_ID_FIELD_DESC = new TField("school_id", (byte) 8, 1);
    private static final TField SCHOOL_NAME_FIELD_DESC = new TField("school_name", (byte) 11, 2);
    private static final TField SCHOOL_YEAR_FIELD_DESC = new TField("school_year", (byte) 10, 3);
    private static final TField MAJOR_ID_FIELD_DESC = new TField("major_id", (byte) 8, 4);
    private static final TField SCHOOL_MAJOR_FIELD_DESC = new TField("school_major", (byte) 11, 5);
    private static final TField SCHOOL_BG_FIELD_DESC = new TField("school_bg", (byte) 8, 6);
    private static final TField IS_UNIVERSITY_FIELD_DESC = new TField("is_university", (byte) 2, 7);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.EducationInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$EducationInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$EducationInfo$_Fields = iArr;
            try {
                iArr[_Fields.SCHOOL_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$EducationInfo$_Fields[_Fields.SCHOOL_NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$EducationInfo$_Fields[_Fields.SCHOOL_YEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$EducationInfo$_Fields[_Fields.MAJOR_ID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$EducationInfo$_Fields[_Fields.SCHOOL_MAJOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$EducationInfo$_Fields[_Fields.SCHOOL_BG.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$EducationInfo$_Fields[_Fields.IS_UNIVERSITY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class EducationInfoStandardScheme extends StandardScheme<EducationInfo> {
        private EducationInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, EducationInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    struct.validate();
                    return;
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.school_id = iprot.readI32();
                            struct.setSchool_idIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.school_name = iprot.readString();
                            struct.setSchool_nameIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.school_year = iprot.readI64();
                            struct.setSchool_yearIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.major_id = iprot.readI32();
                            struct.setMajor_idIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.school_major = iprot.readString();
                            struct.setSchool_majorIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.school_bg = iprot.readI32();
                            struct.setSchool_bgIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 2) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.is_university = iprot.readBool();
                            struct.setIs_universityIsSet(true);
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
        public void write(TProtocol oprot, EducationInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(EducationInfo.STRUCT_DESC);
            if (struct.isSetSchool_id()) {
                oprot.writeFieldBegin(EducationInfo.SCHOOL_ID_FIELD_DESC);
                oprot.writeI32(struct.school_id);
                oprot.writeFieldEnd();
            }
            if (struct.school_name != null && struct.isSetSchool_name()) {
                oprot.writeFieldBegin(EducationInfo.SCHOOL_NAME_FIELD_DESC);
                oprot.writeString(struct.school_name);
                oprot.writeFieldEnd();
            }
            if (struct.isSetSchool_year()) {
                oprot.writeFieldBegin(EducationInfo.SCHOOL_YEAR_FIELD_DESC);
                oprot.writeI64(struct.school_year);
                oprot.writeFieldEnd();
            }
            if (struct.isSetMajor_id()) {
                oprot.writeFieldBegin(EducationInfo.MAJOR_ID_FIELD_DESC);
                oprot.writeI32(struct.major_id);
                oprot.writeFieldEnd();
            }
            if (struct.school_major != null && struct.isSetSchool_major()) {
                oprot.writeFieldBegin(EducationInfo.SCHOOL_MAJOR_FIELD_DESC);
                oprot.writeString(struct.school_major);
                oprot.writeFieldEnd();
            }
            if (struct.isSetSchool_bg()) {
                oprot.writeFieldBegin(EducationInfo.SCHOOL_BG_FIELD_DESC);
                oprot.writeI32(struct.school_bg);
                oprot.writeFieldEnd();
            }
            if (struct.isSetIs_university()) {
                oprot.writeFieldBegin(EducationInfo.IS_UNIVERSITY_FIELD_DESC);
                oprot.writeBool(struct.is_university);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class EducationInfoStandardSchemeFactory implements SchemeFactory {
        private EducationInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public EducationInfoStandardScheme getScheme() {
            return new EducationInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class EducationInfoTupleScheme extends TupleScheme<EducationInfo> {
        private EducationInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, EducationInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BitSet readBitSet = tTupleProtocol.readBitSet(7);
            if (readBitSet.get(0)) {
                struct.school_id = tTupleProtocol.readI32();
                struct.setSchool_idIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.school_name = tTupleProtocol.readString();
                struct.setSchool_nameIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.school_year = tTupleProtocol.readI64();
                struct.setSchool_yearIsSet(true);
            }
            if (readBitSet.get(3)) {
                struct.major_id = tTupleProtocol.readI32();
                struct.setMajor_idIsSet(true);
            }
            if (readBitSet.get(4)) {
                struct.school_major = tTupleProtocol.readString();
                struct.setSchool_majorIsSet(true);
            }
            if (readBitSet.get(5)) {
                struct.school_bg = tTupleProtocol.readI32();
                struct.setSchool_bgIsSet(true);
            }
            if (readBitSet.get(6)) {
                struct.is_university = tTupleProtocol.readBool();
                struct.setIs_universityIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, EducationInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BitSet bitSet = new BitSet();
            if (struct.isSetSchool_id()) {
                bitSet.set(0);
            }
            if (struct.isSetSchool_name()) {
                bitSet.set(1);
            }
            if (struct.isSetSchool_year()) {
                bitSet.set(2);
            }
            if (struct.isSetMajor_id()) {
                bitSet.set(3);
            }
            if (struct.isSetSchool_major()) {
                bitSet.set(4);
            }
            if (struct.isSetSchool_bg()) {
                bitSet.set(5);
            }
            if (struct.isSetIs_university()) {
                bitSet.set(6);
            }
            tTupleProtocol.writeBitSet(bitSet, 7);
            if (struct.isSetSchool_id()) {
                tTupleProtocol.writeI32(struct.school_id);
            }
            if (struct.isSetSchool_name()) {
                tTupleProtocol.writeString(struct.school_name);
            }
            if (struct.isSetSchool_year()) {
                tTupleProtocol.writeI64(struct.school_year);
            }
            if (struct.isSetMajor_id()) {
                tTupleProtocol.writeI32(struct.major_id);
            }
            if (struct.isSetSchool_major()) {
                tTupleProtocol.writeString(struct.school_major);
            }
            if (struct.isSetSchool_bg()) {
                tTupleProtocol.writeI32(struct.school_bg);
            }
            if (struct.isSetIs_university()) {
                tTupleProtocol.writeBool(struct.is_university);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class EducationInfoTupleSchemeFactory implements SchemeFactory {
        private EducationInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public EducationInfoTupleScheme getScheme() {
            return new EducationInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        SCHOOL_ID(1, "school_id"),
        SCHOOL_NAME(2, "school_name"),
        SCHOOL_YEAR(3, "school_year"),
        MAJOR_ID(4, "major_id"),
        SCHOOL_MAJOR(5, "school_major"),
        SCHOOL_BG(6, "school_bg"),
        IS_UNIVERSITY(7, "is_university");

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
                    return SCHOOL_ID;
                case 2:
                    return SCHOOL_NAME;
                case 3:
                    return SCHOOL_YEAR;
                case 4:
                    return MAJOR_ID;
                case 5:
                    return SCHOOL_MAJOR;
                case 6:
                    return SCHOOL_BG;
                case 7:
                    return IS_UNIVERSITY;
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
        hashMap.put(StandardScheme.class, new EducationInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new EducationInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.SCHOOL_ID, (_Fields) new FieldMetaData("school_id", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.SCHOOL_NAME, (_Fields) new FieldMetaData("school_name", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SCHOOL_YEAR, (_Fields) new FieldMetaData("school_year", (byte) 2, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.MAJOR_ID, (_Fields) new FieldMetaData("major_id", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.SCHOOL_MAJOR, (_Fields) new FieldMetaData("school_major", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SCHOOL_BG, (_Fields) new FieldMetaData("school_bg", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.IS_UNIVERSITY, (_Fields) new FieldMetaData("is_university", (byte) 2, new FieldValueMetaData((byte) 2)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(EducationInfo.class, unmodifiableMap);
    }

    public EducationInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.SCHOOL_ID, _Fields.SCHOOL_NAME, _Fields.SCHOOL_YEAR, _Fields.MAJOR_ID, _Fields.SCHOOL_MAJOR, _Fields.SCHOOL_BG, _Fields.IS_UNIVERSITY};
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
        setSchool_idIsSet(false);
        this.school_id = 0;
        this.school_name = null;
        setSchool_yearIsSet(false);
        this.school_year = 0L;
        setMajor_idIsSet(false);
        this.major_id = 0;
        this.school_major = null;
        setSchool_bgIsSet(false);
        this.school_bg = 0;
        setIs_universityIsSet(false);
        this.is_university = false;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof EducationInfo)) {
            return equals((EducationInfo) that);
        }
        return false;
    }

    public int getMajor_id() {
        return this.major_id;
    }

    public int getSchool_bg() {
        return this.school_bg;
    }

    public int getSchool_id() {
        return this.school_id;
    }

    public String getSchool_major() {
        return this.school_major;
    }

    public String getSchool_name() {
        return this.school_name;
    }

    public long getSchool_year() {
        return this.school_year;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isIs_university() {
        return this.is_university;
    }

    public boolean isSetIs_university() {
        return EncodingUtils.testBit(this.__isset_bitfield, 4);
    }

    public boolean isSetMajor_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetSchool_bg() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetSchool_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetSchool_major() {
        return this.school_major != null;
    }

    public boolean isSetSchool_name() {
        return this.school_name != null;
    }

    public boolean isSetSchool_year() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public EducationInfo setIs_university(boolean is_university) {
        this.is_university = is_university;
        setIs_universityIsSet(true);
        return this;
    }

    public void setIs_universityIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 4, value);
    }

    public EducationInfo setMajor_id(int major_id) {
        this.major_id = major_id;
        setMajor_idIsSet(true);
        return this;
    }

    public void setMajor_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public EducationInfo setSchool_bg(int school_bg) {
        this.school_bg = school_bg;
        setSchool_bgIsSet(true);
        return this;
    }

    public void setSchool_bgIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public EducationInfo setSchool_id(int school_id) {
        this.school_id = school_id;
        setSchool_idIsSet(true);
        return this;
    }

    public void setSchool_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public EducationInfo setSchool_major(String school_major) {
        this.school_major = school_major;
        return this;
    }

    public void setSchool_majorIsSet(boolean value) {
        if (value) {
            return;
        }
        this.school_major = null;
    }

    public EducationInfo setSchool_name(String school_name) {
        this.school_name = school_name;
        return this;
    }

    public void setSchool_nameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.school_name = null;
    }

    public EducationInfo setSchool_year(long school_year) {
        this.school_year = school_year;
        setSchool_yearIsSet(true);
        return this;
    }

    public void setSchool_yearIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        boolean z11;
        StringBuilder sb2 = new StringBuilder("EducationInfo(");
        boolean z12 = false;
        if (isSetSchool_id()) {
            sb2.append("school_id:");
            sb2.append(this.school_id);
            z11 = false;
        } else {
            z11 = true;
        }
        if (isSetSchool_name()) {
            if (!z11) {
                sb2.append(org.junit.jupiter.api.j2.O);
            }
            sb2.append("school_name:");
            String str = this.school_name;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            z11 = false;
        }
        if (isSetSchool_year()) {
            if (!z11) {
                sb2.append(org.junit.jupiter.api.j2.O);
            }
            sb2.append("school_year:");
            sb2.append(this.school_year);
            z11 = false;
        }
        if (isSetMajor_id()) {
            if (!z11) {
                sb2.append(org.junit.jupiter.api.j2.O);
            }
            sb2.append("major_id:");
            sb2.append(this.major_id);
            z11 = false;
        }
        if (isSetSchool_major()) {
            if (!z11) {
                sb2.append(org.junit.jupiter.api.j2.O);
            }
            sb2.append("school_major:");
            String str2 = this.school_major;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
            z11 = false;
        }
        if (isSetSchool_bg()) {
            if (!z11) {
                sb2.append(org.junit.jupiter.api.j2.O);
            }
            sb2.append("school_bg:");
            sb2.append(this.school_bg);
        } else {
            z12 = z11;
        }
        if (isSetIs_university()) {
            if (!z12) {
                sb2.append(org.junit.jupiter.api.j2.O);
            }
            sb2.append("is_university:");
            sb2.append(this.is_university);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetIs_university() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 4);
    }

    public void unsetMajor_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetSchool_bg() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetSchool_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetSchool_major() {
        this.school_major = null;
    }

    public void unsetSchool_name() {
        this.school_name = null;
    }

    public void unsetSchool_year() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(EducationInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        int compareTo7;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo8 = Boolean.valueOf(isSetSchool_id()).compareTo(Boolean.valueOf(other.isSetSchool_id()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetSchool_id() && (compareTo7 = TBaseHelper.compareTo(this.school_id, other.school_id)) != 0) {
            return compareTo7;
        }
        int compareTo9 = Boolean.valueOf(isSetSchool_name()).compareTo(Boolean.valueOf(other.isSetSchool_name()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetSchool_name() && (compareTo6 = TBaseHelper.compareTo(this.school_name, other.school_name)) != 0) {
            return compareTo6;
        }
        int compareTo10 = Boolean.valueOf(isSetSchool_year()).compareTo(Boolean.valueOf(other.isSetSchool_year()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetSchool_year() && (compareTo5 = TBaseHelper.compareTo(this.school_year, other.school_year)) != 0) {
            return compareTo5;
        }
        int compareTo11 = Boolean.valueOf(isSetMajor_id()).compareTo(Boolean.valueOf(other.isSetMajor_id()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetMajor_id() && (compareTo4 = TBaseHelper.compareTo(this.major_id, other.major_id)) != 0) {
            return compareTo4;
        }
        int compareTo12 = Boolean.valueOf(isSetSchool_major()).compareTo(Boolean.valueOf(other.isSetSchool_major()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetSchool_major() && (compareTo3 = TBaseHelper.compareTo(this.school_major, other.school_major)) != 0) {
            return compareTo3;
        }
        int compareTo13 = Boolean.valueOf(isSetSchool_bg()).compareTo(Boolean.valueOf(other.isSetSchool_bg()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetSchool_bg() && (compareTo2 = TBaseHelper.compareTo(this.school_bg, other.school_bg)) != 0) {
            return compareTo2;
        }
        int compareTo14 = Boolean.valueOf(isSetIs_university()).compareTo(Boolean.valueOf(other.isSetIs_university()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (!isSetIs_university() || (compareTo = TBaseHelper.compareTo(this.is_university, other.is_university)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<EducationInfo, _Fields> deepCopy2() {
        return new EducationInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$EducationInfo$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getSchool_id());
            case 2:
                return getSchool_name();
            case 3:
                return Long.valueOf(getSchool_year());
            case 4:
                return Integer.valueOf(getMajor_id());
            case 5:
                return getSchool_major();
            case 6:
                return Integer.valueOf(getSchool_bg());
            case 7:
                return Boolean.valueOf(isIs_university());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$EducationInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetSchool_id();
            case 2:
                return isSetSchool_name();
            case 3:
                return isSetSchool_year();
            case 4:
                return isSetMajor_id();
            case 5:
                return isSetSchool_major();
            case 6:
                return isSetSchool_bg();
            case 7:
                return isSetIs_university();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$EducationInfo$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setSchool_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetSchool_id();
                    break;
                }
            case 2:
                if (value != null) {
                    setSchool_name((String) value);
                    break;
                } else {
                    unsetSchool_name();
                    break;
                }
            case 3:
                if (value != null) {
                    setSchool_year(((Long) value).longValue());
                    break;
                } else {
                    unsetSchool_year();
                    break;
                }
            case 4:
                if (value != null) {
                    setMajor_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetMajor_id();
                    break;
                }
            case 5:
                if (value != null) {
                    setSchool_major((String) value);
                    break;
                } else {
                    unsetSchool_major();
                    break;
                }
            case 6:
                if (value != null) {
                    setSchool_bg(((Integer) value).intValue());
                    break;
                } else {
                    unsetSchool_bg();
                    break;
                }
            case 7:
                if (value != null) {
                    setIs_university(((Boolean) value).booleanValue());
                    break;
                } else {
                    unsetIs_university();
                    break;
                }
        }
    }

    public boolean equals(EducationInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetSchool_id = isSetSchool_id();
        boolean isSetSchool_id2 = that.isSetSchool_id();
        if ((isSetSchool_id || isSetSchool_id2) && !(isSetSchool_id && isSetSchool_id2 && this.school_id == that.school_id)) {
            return false;
        }
        boolean isSetSchool_name = isSetSchool_name();
        boolean isSetSchool_name2 = that.isSetSchool_name();
        if ((isSetSchool_name || isSetSchool_name2) && !(isSetSchool_name && isSetSchool_name2 && this.school_name.equals(that.school_name))) {
            return false;
        }
        boolean isSetSchool_year = isSetSchool_year();
        boolean isSetSchool_year2 = that.isSetSchool_year();
        if ((isSetSchool_year || isSetSchool_year2) && !(isSetSchool_year && isSetSchool_year2 && this.school_year == that.school_year)) {
            return false;
        }
        boolean isSetMajor_id = isSetMajor_id();
        boolean isSetMajor_id2 = that.isSetMajor_id();
        if ((isSetMajor_id || isSetMajor_id2) && !(isSetMajor_id && isSetMajor_id2 && this.major_id == that.major_id)) {
            return false;
        }
        boolean isSetSchool_major = isSetSchool_major();
        boolean isSetSchool_major2 = that.isSetSchool_major();
        if ((isSetSchool_major || isSetSchool_major2) && !(isSetSchool_major && isSetSchool_major2 && this.school_major.equals(that.school_major))) {
            return false;
        }
        boolean isSetSchool_bg = isSetSchool_bg();
        boolean isSetSchool_bg2 = that.isSetSchool_bg();
        if ((isSetSchool_bg || isSetSchool_bg2) && !(isSetSchool_bg && isSetSchool_bg2 && this.school_bg == that.school_bg)) {
            return false;
        }
        boolean isSetIs_university = isSetIs_university();
        boolean isSetIs_university2 = that.isSetIs_university();
        if (isSetIs_university || isSetIs_university2) {
            return isSetIs_university && isSetIs_university2 && this.is_university == that.is_university;
        }
        return true;
    }

    public EducationInfo(EducationInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.SCHOOL_ID, _Fields.SCHOOL_NAME, _Fields.SCHOOL_YEAR, _Fields.MAJOR_ID, _Fields.SCHOOL_MAJOR, _Fields.SCHOOL_BG, _Fields.IS_UNIVERSITY};
        this.__isset_bitfield = other.__isset_bitfield;
        this.school_id = other.school_id;
        if (other.isSetSchool_name()) {
            this.school_name = other.school_name;
        }
        this.school_year = other.school_year;
        this.major_id = other.major_id;
        if (other.isSetSchool_major()) {
            this.school_major = other.school_major;
        }
        this.school_bg = other.school_bg;
        this.is_university = other.is_university;
    }

    public void validate() throws TException {
    }
}
