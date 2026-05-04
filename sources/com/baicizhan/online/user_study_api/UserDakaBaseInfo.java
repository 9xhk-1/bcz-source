package com.baicizhan.online.user_study_api;

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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class UserDakaBaseInfo implements TBase<UserDakaBaseInfo, _Fields>, Serializable, Cloneable, Comparable<UserDakaBaseInfo> {
    private static final int __TOTAL_DAKA_DAYS_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public List<UserDakaDate> daka_dates;
    public int total_daka_days;
    private static final TStruct STRUCT_DESC = new TStruct("UserDakaBaseInfo");
    private static final TField TOTAL_DAKA_DAYS_FIELD_DESC = new TField("total_daka_days", (byte) 8, 1);
    private static final TField DAKA_DATES_FIELD_DESC = new TField("daka_dates", (byte) 15, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.UserDakaBaseInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$UserDakaBaseInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$UserDakaBaseInfo$_Fields = iArr;
            try {
                iArr[_Fields.TOTAL_DAKA_DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserDakaBaseInfo$_Fields[_Fields.DAKA_DATES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserDakaBaseInfoStandardScheme extends StandardScheme<UserDakaBaseInfo> {
        private UserDakaBaseInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserDakaBaseInfo struct) throws TException {
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
                        struct.daka_dates = new ArrayList(readListBegin.size);
                        for (int i11 = 0; i11 < readListBegin.size; i11++) {
                            UserDakaDate userDakaDate = new UserDakaDate();
                            userDakaDate.read(iprot);
                            struct.daka_dates.add(userDakaDate);
                        }
                        iprot.readListEnd();
                        struct.setDaka_datesIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.total_daka_days = iprot.readI32();
                    struct.setTotal_daka_daysIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetTotal_daka_days()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'total_daka_days' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, UserDakaBaseInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserDakaBaseInfo.STRUCT_DESC);
            oprot.writeFieldBegin(UserDakaBaseInfo.TOTAL_DAKA_DAYS_FIELD_DESC);
            oprot.writeI32(struct.total_daka_days);
            oprot.writeFieldEnd();
            if (struct.daka_dates != null) {
                oprot.writeFieldBegin(UserDakaBaseInfo.DAKA_DATES_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.daka_dates.size()));
                Iterator<UserDakaDate> it = struct.daka_dates.iterator();
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
    public static class UserDakaBaseInfoStandardSchemeFactory implements SchemeFactory {
        private UserDakaBaseInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserDakaBaseInfoStandardScheme getScheme() {
            return new UserDakaBaseInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserDakaBaseInfoTupleScheme extends TupleScheme<UserDakaBaseInfo> {
        private UserDakaBaseInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserDakaBaseInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.total_daka_days = tTupleProtocol.readI32();
            struct.setTotal_daka_daysIsSet(true);
            TList tList = new TList((byte) 12, tTupleProtocol.readI32());
            struct.daka_dates = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                UserDakaDate userDakaDate = new UserDakaDate();
                userDakaDate.read(tTupleProtocol);
                struct.daka_dates.add(userDakaDate);
            }
            struct.setDaka_datesIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserDakaBaseInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.total_daka_days);
            tTupleProtocol.writeI32(struct.daka_dates.size());
            Iterator<UserDakaDate> it = struct.daka_dates.iterator();
            while (it.hasNext()) {
                it.next().write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserDakaBaseInfoTupleSchemeFactory implements SchemeFactory {
        private UserDakaBaseInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserDakaBaseInfoTupleScheme getScheme() {
            return new UserDakaBaseInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TOTAL_DAKA_DAYS(1, "total_daka_days"),
        DAKA_DATES(2, "daka_dates");

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
                return TOTAL_DAKA_DAYS;
            }
            if (fieldId != 2) {
                return null;
            }
            return DAKA_DATES;
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
        hashMap.put(StandardScheme.class, new UserDakaBaseInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserDakaBaseInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TOTAL_DAKA_DAYS, (_Fields) new FieldMetaData("total_daka_days", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.DAKA_DATES, (_Fields) new FieldMetaData("daka_dates", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, UserDakaDate.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserDakaBaseInfo.class, unmodifiableMap);
    }

    public UserDakaBaseInfo() {
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

    public void addToDaka_dates(UserDakaDate elem) {
        if (this.daka_dates == null) {
            this.daka_dates = new ArrayList();
        }
        this.daka_dates.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        setTotal_daka_daysIsSet(false);
        this.total_daka_days = 0;
        this.daka_dates = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserDakaBaseInfo)) {
            return equals((UserDakaBaseInfo) that);
        }
        return false;
    }

    public List<UserDakaDate> getDaka_dates() {
        return this.daka_dates;
    }

    public Iterator<UserDakaDate> getDaka_datesIterator() {
        List<UserDakaDate> list = this.daka_dates;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getDaka_datesSize() {
        List<UserDakaDate> list = this.daka_dates;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int getTotal_daka_days() {
        return this.total_daka_days;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetDaka_dates() {
        return this.daka_dates != null;
    }

    public boolean isSetTotal_daka_days() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserDakaBaseInfo setDaka_dates(List<UserDakaDate> daka_dates) {
        this.daka_dates = daka_dates;
        return this;
    }

    public void setDaka_datesIsSet(boolean value) {
        if (value) {
            return;
        }
        this.daka_dates = null;
    }

    public UserDakaBaseInfo setTotal_daka_days(int total_daka_days) {
        this.total_daka_days = total_daka_days;
        setTotal_daka_daysIsSet(true);
        return this;
    }

    public void setTotal_daka_daysIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserDakaBaseInfo(");
        sb2.append("total_daka_days:");
        sb2.append(this.total_daka_days);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("daka_dates:");
        List<UserDakaDate> list = this.daka_dates;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetDaka_dates() {
        this.daka_dates = null;
    }

    public void unsetTotal_daka_days() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void validate() throws TException {
        if (this.daka_dates != null) {
            return;
        }
        throw new TProtocolException("Required field 'daka_dates' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(UserDakaBaseInfo other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetTotal_daka_days()).compareTo(Boolean.valueOf(other.isSetTotal_daka_days()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetTotal_daka_days() && (compareTo2 = TBaseHelper.compareTo(this.total_daka_days, other.total_daka_days)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetDaka_dates()).compareTo(Boolean.valueOf(other.isSetDaka_dates()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetDaka_dates() || (compareTo = TBaseHelper.compareTo((List) this.daka_dates, (List) other.daka_dates)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserDakaBaseInfo, _Fields> deepCopy2() {
        return new UserDakaBaseInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserDakaBaseInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getTotal_daka_days());
        }
        if (i11 == 2) {
            return getDaka_dates();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserDakaBaseInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetTotal_daka_days();
        }
        if (i11 == 2) {
            return isSetDaka_dates();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserDakaBaseInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetTotal_daka_days();
                return;
            } else {
                setTotal_daka_days(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetDaka_dates();
        } else {
            setDaka_dates((List) value);
        }
    }

    public UserDakaBaseInfo(int total_daka_days, List<UserDakaDate> daka_dates) {
        this();
        this.total_daka_days = total_daka_days;
        setTotal_daka_daysIsSet(true);
        this.daka_dates = daka_dates;
    }

    public boolean equals(UserDakaBaseInfo that) {
        if (that == null || this.total_daka_days != that.total_daka_days) {
            return false;
        }
        boolean isSetDaka_dates = isSetDaka_dates();
        boolean isSetDaka_dates2 = that.isSetDaka_dates();
        if (isSetDaka_dates || isSetDaka_dates2) {
            return isSetDaka_dates && isSetDaka_dates2 && this.daka_dates.equals(that.daka_dates);
        }
        return true;
    }

    public UserDakaBaseInfo(UserDakaBaseInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.total_daka_days = other.total_daka_days;
        if (other.isSetDaka_dates()) {
            ArrayList arrayList = new ArrayList(other.daka_dates.size());
            Iterator<UserDakaDate> it = other.daka_dates.iterator();
            while (it.hasNext()) {
                arrayList.add(new UserDakaDate(it.next()));
            }
            this.daka_dates = arrayList;
        }
    }
}
