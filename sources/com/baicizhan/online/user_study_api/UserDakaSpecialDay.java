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
public class UserDakaSpecialDay implements TBase<UserDakaSpecialDay, _Fields>, Serializable, Cloneable, Comparable<UserDakaSpecialDay> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public UserDakaDate date;
    public String img_url;
    private static final TStruct STRUCT_DESC = new TStruct("UserDakaSpecialDay");
    private static final TField DATE_FIELD_DESC = new TField("date", (byte) 12, 1);
    private static final TField IMG_URL_FIELD_DESC = new TField(com.baicizhan.main.activity.schedule_v2.e.f19255e, (byte) 11, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.UserDakaSpecialDay$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$UserDakaSpecialDay$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$UserDakaSpecialDay$_Fields = iArr;
            try {
                iArr[_Fields.DATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserDakaSpecialDay$_Fields[_Fields.IMG_URL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserDakaSpecialDayStandardScheme extends StandardScheme<UserDakaSpecialDay> {
        private UserDakaSpecialDayStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserDakaSpecialDay struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    struct.validate();
                    return;
                }
                short s11 = readFieldBegin.f77768id;
                if (s11 != 1) {
                    if (s11 != 2) {
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 11) {
                        struct.img_url = iprot.readString();
                        struct.setImg_urlIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 12) {
                    UserDakaDate userDakaDate = new UserDakaDate();
                    struct.date = userDakaDate;
                    userDakaDate.read(iprot);
                    struct.setDateIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, UserDakaSpecialDay struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserDakaSpecialDay.STRUCT_DESC);
            if (struct.date != null) {
                oprot.writeFieldBegin(UserDakaSpecialDay.DATE_FIELD_DESC);
                struct.date.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.img_url != null) {
                oprot.writeFieldBegin(UserDakaSpecialDay.IMG_URL_FIELD_DESC);
                oprot.writeString(struct.img_url);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserDakaSpecialDayStandardSchemeFactory implements SchemeFactory {
        private UserDakaSpecialDayStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserDakaSpecialDayStandardScheme getScheme() {
            return new UserDakaSpecialDayStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserDakaSpecialDayTupleScheme extends TupleScheme<UserDakaSpecialDay> {
        private UserDakaSpecialDayTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserDakaSpecialDay struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            UserDakaDate userDakaDate = new UserDakaDate();
            struct.date = userDakaDate;
            userDakaDate.read(tTupleProtocol);
            struct.setDateIsSet(true);
            struct.img_url = tTupleProtocol.readString();
            struct.setImg_urlIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserDakaSpecialDay struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.date.write(tTupleProtocol);
            tTupleProtocol.writeString(struct.img_url);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserDakaSpecialDayTupleSchemeFactory implements SchemeFactory {
        private UserDakaSpecialDayTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserDakaSpecialDayTupleScheme getScheme() {
            return new UserDakaSpecialDayTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        DATE(1, "date"),
        IMG_URL(2, com.baicizhan.main.activity.schedule_v2.e.f19255e);

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
                return DATE;
            }
            if (fieldId != 2) {
                return null;
            }
            return IMG_URL;
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
        hashMap.put(StandardScheme.class, new UserDakaSpecialDayStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserDakaSpecialDayTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.DATE, (_Fields) new FieldMetaData("date", (byte) 1, new StructMetaData((byte) 12, UserDakaDate.class)));
        enumMap.put((EnumMap) _Fields.IMG_URL, (_Fields) new FieldMetaData(com.baicizhan.main.activity.schedule_v2.e.f19255e, (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserDakaSpecialDay.class, unmodifiableMap);
    }

    public UserDakaSpecialDay() {
    }

    private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
        try {
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
        this.date = null;
        this.img_url = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserDakaSpecialDay)) {
            return equals((UserDakaSpecialDay) that);
        }
        return false;
    }

    public UserDakaDate getDate() {
        return this.date;
    }

    public String getImg_url() {
        return this.img_url;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetDate() {
        return this.date != null;
    }

    public boolean isSetImg_url() {
        return this.img_url != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserDakaSpecialDay setDate(UserDakaDate date) {
        this.date = date;
        return this;
    }

    public void setDateIsSet(boolean value) {
        if (value) {
            return;
        }
        this.date = null;
    }

    public UserDakaSpecialDay setImg_url(String img_url) {
        this.img_url = img_url;
        return this;
    }

    public void setImg_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.img_url = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserDakaSpecialDay(");
        sb2.append("date:");
        UserDakaDate userDakaDate = this.date;
        if (userDakaDate == null) {
            sb2.append("null");
        } else {
            sb2.append(userDakaDate);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("img_url:");
        String str = this.img_url;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetDate() {
        this.date = null;
    }

    public void unsetImg_url() {
        this.img_url = null;
    }

    public void validate() throws TException {
        UserDakaDate userDakaDate = this.date;
        if (userDakaDate == null) {
            throw new TProtocolException("Required field 'date' was not present! Struct: " + toString());
        }
        if (this.img_url != null) {
            if (userDakaDate != null) {
                userDakaDate.validate();
            }
        } else {
            throw new TProtocolException("Required field 'img_url' was not present! Struct: " + toString());
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    public UserDakaSpecialDay(UserDakaDate date, String img_url) {
        this();
        this.date = date;
        this.img_url = img_url;
    }

    @Override // java.lang.Comparable
    public int compareTo(UserDakaSpecialDay other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetDate()).compareTo(Boolean.valueOf(other.isSetDate()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetDate() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.date, (Comparable) other.date)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetImg_url()).compareTo(Boolean.valueOf(other.isSetImg_url()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetImg_url() || (compareTo = TBaseHelper.compareTo(this.img_url, other.img_url)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserDakaSpecialDay, _Fields> deepCopy2() {
        return new UserDakaSpecialDay(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserDakaSpecialDay$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getDate();
        }
        if (i11 == 2) {
            return getImg_url();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserDakaSpecialDay$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetDate();
        }
        if (i11 == 2) {
            return isSetImg_url();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserDakaSpecialDay$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetDate();
                return;
            } else {
                setDate((UserDakaDate) value);
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetImg_url();
        } else {
            setImg_url((String) value);
        }
    }

    public boolean equals(UserDakaSpecialDay that) {
        if (that == null) {
            return false;
        }
        boolean isSetDate = isSetDate();
        boolean isSetDate2 = that.isSetDate();
        if ((isSetDate || isSetDate2) && !(isSetDate && isSetDate2 && this.date.equals(that.date))) {
            return false;
        }
        boolean isSetImg_url = isSetImg_url();
        boolean isSetImg_url2 = that.isSetImg_url();
        if (isSetImg_url || isSetImg_url2) {
            return isSetImg_url && isSetImg_url2 && this.img_url.equals(that.img_url);
        }
        return true;
    }

    public UserDakaSpecialDay(UserDakaSpecialDay other) {
        if (other.isSetDate()) {
            this.date = new UserDakaDate(other.date);
        }
        if (other.isSetImg_url()) {
            this.img_url = other.img_url;
        }
    }
}
