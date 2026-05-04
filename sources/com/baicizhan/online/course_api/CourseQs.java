package com.baicizhan.online.course_api;

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
public class CourseQs implements TBase<CourseQs, _Fields>, Serializable, Cloneable, Comparable<CourseQs> {
    private static final int __ID_ISSET_ID = 0;
    private static final int __VERSION_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;

    /* renamed from: id, reason: collision with root package name */
    public int f28149id;
    public QsInfo qs_info;
    public int version;
    private static final TStruct STRUCT_DESC = new TStruct("CourseQs");
    private static final TField ID_FIELD_DESC = new TField("id", (byte) 8, 1);
    private static final TField QS_INFO_FIELD_DESC = new TField("qs_info", (byte) 12, 2);
    private static final TField VERSION_FIELD_DESC = new TField("version", (byte) 8, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.course_api.CourseQs$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$course_api$CourseQs$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$course_api$CourseQs$_Fields = iArr;
            try {
                iArr[_Fields.ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$CourseQs$_Fields[_Fields.QS_INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$CourseQs$_Fields[_Fields.VERSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CourseQsStandardScheme extends StandardScheme<CourseQs> {
        private CourseQsStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, CourseQs struct) throws TException {
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
                            struct.version = iprot.readI32();
                            struct.setVersionIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 12) {
                        QsInfo qsInfo = new QsInfo();
                        struct.qs_info = qsInfo;
                        qsInfo.read(iprot);
                        struct.setQs_infoIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.f28149id = iprot.readI32();
                    struct.setIdIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetId()) {
                throw new TProtocolException("Required field 'id' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetVersion()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'version' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, CourseQs struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(CourseQs.STRUCT_DESC);
            oprot.writeFieldBegin(CourseQs.ID_FIELD_DESC);
            oprot.writeI32(struct.f28149id);
            oprot.writeFieldEnd();
            if (struct.qs_info != null) {
                oprot.writeFieldBegin(CourseQs.QS_INFO_FIELD_DESC);
                struct.qs_info.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(CourseQs.VERSION_FIELD_DESC);
            oprot.writeI32(struct.version);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CourseQsStandardSchemeFactory implements SchemeFactory {
        private CourseQsStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public CourseQsStandardScheme getScheme() {
            return new CourseQsStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CourseQsTupleScheme extends TupleScheme<CourseQs> {
        private CourseQsTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, CourseQs struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.f28149id = tTupleProtocol.readI32();
            struct.setIdIsSet(true);
            QsInfo qsInfo = new QsInfo();
            struct.qs_info = qsInfo;
            qsInfo.read(tTupleProtocol);
            struct.setQs_infoIsSet(true);
            struct.version = tTupleProtocol.readI32();
            struct.setVersionIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, CourseQs struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.f28149id);
            struct.qs_info.write(tTupleProtocol);
            tTupleProtocol.writeI32(struct.version);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CourseQsTupleSchemeFactory implements SchemeFactory {
        private CourseQsTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public CourseQsTupleScheme getScheme() {
            return new CourseQsTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ID(1, "id"),
        QS_INFO(2, "qs_info"),
        VERSION(3, "version");

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
                return ID;
            }
            if (fieldId == 2) {
                return QS_INFO;
            }
            if (fieldId != 3) {
                return null;
            }
            return VERSION;
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
        hashMap.put(StandardScheme.class, new CourseQsStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new CourseQsTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ID, (_Fields) new FieldMetaData("id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.QS_INFO, (_Fields) new FieldMetaData("qs_info", (byte) 1, new StructMetaData((byte) 12, QsInfo.class)));
        enumMap.put((EnumMap) _Fields.VERSION, (_Fields) new FieldMetaData("version", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(CourseQs.class, unmodifiableMap);
    }

    public CourseQs() {
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
        setIdIsSet(false);
        this.f28149id = 0;
        this.qs_info = null;
        setVersionIsSet(false);
        this.version = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof CourseQs)) {
            return equals((CourseQs) that);
        }
        return false;
    }

    public int getId() {
        return this.f28149id;
    }

    public QsInfo getQs_info() {
        return this.qs_info;
    }

    public int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetId() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetQs_info() {
        return this.qs_info != null;
    }

    public boolean isSetVersion() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public CourseQs setId(int id2) {
        this.f28149id = id2;
        setIdIsSet(true);
        return this;
    }

    public void setIdIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public CourseQs setQs_info(QsInfo qs_info) {
        this.qs_info = qs_info;
        return this;
    }

    public void setQs_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.qs_info = null;
    }

    public CourseQs setVersion(int version) {
        this.version = version;
        setVersionIsSet(true);
        return this;
    }

    public void setVersionIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CourseQs(");
        sb2.append("id:");
        sb2.append(this.f28149id);
        sb2.append(j2.O);
        sb2.append("qs_info:");
        QsInfo qsInfo = this.qs_info;
        if (qsInfo == null) {
            sb2.append("null");
        } else {
            sb2.append(qsInfo);
        }
        sb2.append(j2.O);
        sb2.append("version:");
        sb2.append(this.version);
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetId() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetQs_info() {
        this.qs_info = null;
    }

    public void unsetVersion() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void validate() throws TException {
        QsInfo qsInfo = this.qs_info;
        if (qsInfo != null) {
            if (qsInfo != null) {
                qsInfo.validate();
            }
        } else {
            throw new TProtocolException("Required field 'qs_info' was not present! Struct: " + toString());
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(CourseQs other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetId()).compareTo(Boolean.valueOf(other.isSetId()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetId() && (compareTo3 = TBaseHelper.compareTo(this.f28149id, other.f28149id)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetQs_info()).compareTo(Boolean.valueOf(other.isSetQs_info()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetQs_info() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.qs_info, (Comparable) other.qs_info)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetVersion()).compareTo(Boolean.valueOf(other.isSetVersion()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetVersion() || (compareTo = TBaseHelper.compareTo(this.version, other.version)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<CourseQs, _Fields> deepCopy2() {
        return new CourseQs(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseQs$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getId());
        }
        if (i11 == 2) {
            return getQs_info();
        }
        if (i11 == 3) {
            return Integer.valueOf(getVersion());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseQs$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetId();
        }
        if (i11 == 2) {
            return isSetQs_info();
        }
        if (i11 == 3) {
            return isSetVersion();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$CourseQs$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetId();
                return;
            } else {
                setId(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetQs_info();
                return;
            } else {
                setQs_info((QsInfo) value);
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetVersion();
        } else {
            setVersion(((Integer) value).intValue());
        }
    }

    public CourseQs(int id2, QsInfo qs_info, int version) {
        this();
        this.f28149id = id2;
        setIdIsSet(true);
        this.qs_info = qs_info;
        this.version = version;
        setVersionIsSet(true);
    }

    public boolean equals(CourseQs that) {
        if (that == null || this.f28149id != that.f28149id) {
            return false;
        }
        boolean isSetQs_info = isSetQs_info();
        boolean isSetQs_info2 = that.isSetQs_info();
        return (!(isSetQs_info || isSetQs_info2) || (isSetQs_info && isSetQs_info2 && this.qs_info.equals(that.qs_info))) && this.version == that.version;
    }

    public CourseQs(CourseQs other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.f28149id = other.f28149id;
        if (other.isSetQs_info()) {
            this.qs_info = new QsInfo(other.qs_info);
        }
        this.version = other.version;
    }
}
