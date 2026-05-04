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
import xo.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class UserDakaDate implements TBase<UserDakaDate, _Fields>, Serializable, Cloneable, Comparable<UserDakaDate> {
    private static final int __DAY_ISSET_ID = 2;
    private static final int __MONTH_ISSET_ID = 1;
    private static final int __TIMESTAMP_ISSET_ID = 3;
    private static final int __YEAR_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int day;
    public int month;
    public long timestamp;
    public int year;
    private static final TStruct STRUCT_DESC = new TStruct("UserDakaDate");
    private static final TField YEAR_FIELD_DESC = new TField(n.r.f98259a, (byte) 8, 1);
    private static final TField MONTH_FIELD_DESC = new TField(n.r.f98260b, (byte) 8, 2);
    private static final TField DAY_FIELD_DESC = new TField("day", (byte) 8, 3);
    private static final TField TIMESTAMP_FIELD_DESC = new TField(com.alipay.sdk.m.t.a.f11034k, (byte) 10, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.UserDakaDate$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$UserDakaDate$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$UserDakaDate$_Fields = iArr;
            try {
                iArr[_Fields.YEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserDakaDate$_Fields[_Fields.MONTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserDakaDate$_Fields[_Fields.DAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserDakaDate$_Fields[_Fields.TIMESTAMP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserDakaDateStandardScheme extends StandardScheme<UserDakaDate> {
        private UserDakaDateStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserDakaDate struct) throws TException {
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
                            if (s11 != 4) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 10) {
                                struct.timestamp = iprot.readI64();
                                struct.setTimestampIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 8) {
                            struct.day = iprot.readI32();
                            struct.setDayIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.month = iprot.readI32();
                        struct.setMonthIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.year = iprot.readI32();
                    struct.setYearIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetYear()) {
                throw new TProtocolException("Required field 'year' was not found in serialized data! Struct: " + toString());
            }
            if (!struct.isSetMonth()) {
                throw new TProtocolException("Required field 'month' was not found in serialized data! Struct: " + toString());
            }
            if (!struct.isSetDay()) {
                throw new TProtocolException("Required field 'day' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetTimestamp()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'timestamp' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, UserDakaDate struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserDakaDate.STRUCT_DESC);
            oprot.writeFieldBegin(UserDakaDate.YEAR_FIELD_DESC);
            oprot.writeI32(struct.year);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserDakaDate.MONTH_FIELD_DESC);
            oprot.writeI32(struct.month);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserDakaDate.DAY_FIELD_DESC);
            oprot.writeI32(struct.day);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserDakaDate.TIMESTAMP_FIELD_DESC);
            oprot.writeI64(struct.timestamp);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserDakaDateStandardSchemeFactory implements SchemeFactory {
        private UserDakaDateStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserDakaDateStandardScheme getScheme() {
            return new UserDakaDateStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserDakaDateTupleScheme extends TupleScheme<UserDakaDate> {
        private UserDakaDateTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserDakaDate struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.year = tTupleProtocol.readI32();
            struct.setYearIsSet(true);
            struct.month = tTupleProtocol.readI32();
            struct.setMonthIsSet(true);
            struct.day = tTupleProtocol.readI32();
            struct.setDayIsSet(true);
            struct.timestamp = tTupleProtocol.readI64();
            struct.setTimestampIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserDakaDate struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.year);
            tTupleProtocol.writeI32(struct.month);
            tTupleProtocol.writeI32(struct.day);
            tTupleProtocol.writeI64(struct.timestamp);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserDakaDateTupleSchemeFactory implements SchemeFactory {
        private UserDakaDateTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserDakaDateTupleScheme getScheme() {
            return new UserDakaDateTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        YEAR(1, n.r.f98259a),
        MONTH(2, n.r.f98260b),
        DAY(3, "day"),
        TIMESTAMP(4, com.alipay.sdk.m.t.a.f11034k);

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
                return YEAR;
            }
            if (fieldId == 2) {
                return MONTH;
            }
            if (fieldId == 3) {
                return DAY;
            }
            if (fieldId != 4) {
                return null;
            }
            return TIMESTAMP;
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
        hashMap.put(StandardScheme.class, new UserDakaDateStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserDakaDateTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.YEAR, (_Fields) new FieldMetaData(n.r.f98259a, (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.MONTH, (_Fields) new FieldMetaData(n.r.f98260b, (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.DAY, (_Fields) new FieldMetaData("day", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.TIMESTAMP, (_Fields) new FieldMetaData(com.alipay.sdk.m.t.a.f11034k, (byte) 1, new FieldValueMetaData((byte) 10)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserDakaDate.class, unmodifiableMap);
    }

    public UserDakaDate() {
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
        setYearIsSet(false);
        this.year = 0;
        setMonthIsSet(false);
        this.month = 0;
        setDayIsSet(false);
        this.day = 0;
        setTimestampIsSet(false);
        this.timestamp = 0L;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserDakaDate)) {
            return equals((UserDakaDate) that);
        }
        return false;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public int getYear() {
        return this.year;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetDay() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetMonth() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetTimestamp() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetYear() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserDakaDate setDay(int day) {
        this.day = day;
        setDayIsSet(true);
        return this;
    }

    public void setDayIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public UserDakaDate setMonth(int month) {
        this.month = month;
        setMonthIsSet(true);
        return this;
    }

    public void setMonthIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public UserDakaDate setTimestamp(long timestamp) {
        this.timestamp = timestamp;
        setTimestampIsSet(true);
        return this;
    }

    public void setTimestampIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public UserDakaDate setYear(int year) {
        this.year = year;
        setYearIsSet(true);
        return this;
    }

    public void setYearIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        return "UserDakaDate(year:" + this.year + org.junit.jupiter.api.j2.O + "month:" + this.month + org.junit.jupiter.api.j2.O + "day:" + this.day + org.junit.jupiter.api.j2.O + "timestamp:" + this.timestamp + pn.j.f81007d;
    }

    public void unsetDay() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetMonth() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetTimestamp() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetYear() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(UserDakaDate other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetYear()).compareTo(Boolean.valueOf(other.isSetYear()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetYear() && (compareTo4 = TBaseHelper.compareTo(this.year, other.year)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetMonth()).compareTo(Boolean.valueOf(other.isSetMonth()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetMonth() && (compareTo3 = TBaseHelper.compareTo(this.month, other.month)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetDay()).compareTo(Boolean.valueOf(other.isSetDay()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetDay() && (compareTo2 = TBaseHelper.compareTo(this.day, other.day)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetTimestamp()).compareTo(Boolean.valueOf(other.isSetTimestamp()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetTimestamp() || (compareTo = TBaseHelper.compareTo(this.timestamp, other.timestamp)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserDakaDate, _Fields> deepCopy2() {
        return new UserDakaDate(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserDakaDate$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getYear());
        }
        if (i11 == 2) {
            return Integer.valueOf(getMonth());
        }
        if (i11 == 3) {
            return Integer.valueOf(getDay());
        }
        if (i11 == 4) {
            return Long.valueOf(getTimestamp());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserDakaDate$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetYear();
        }
        if (i11 == 2) {
            return isSetMonth();
        }
        if (i11 == 3) {
            return isSetDay();
        }
        if (i11 == 4) {
            return isSetTimestamp();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserDakaDate$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetYear();
                return;
            } else {
                setYear(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetMonth();
                return;
            } else {
                setMonth(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetDay();
                return;
            } else {
                setDay(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetTimestamp();
        } else {
            setTimestamp(((Long) value).longValue());
        }
    }

    public UserDakaDate(int year, int month, int day, long timestamp) {
        this();
        this.year = year;
        setYearIsSet(true);
        this.month = month;
        setMonthIsSet(true);
        this.day = day;
        setDayIsSet(true);
        this.timestamp = timestamp;
        setTimestampIsSet(true);
    }

    public boolean equals(UserDakaDate that) {
        return that != null && this.year == that.year && this.month == that.month && this.day == that.day && this.timestamp == that.timestamp;
    }

    public UserDakaDate(UserDakaDate other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.year = other.year;
        this.month = other.month;
        this.day = other.day;
        this.timestamp = other.timestamp;
    }

    public void validate() throws TException {
    }
}
