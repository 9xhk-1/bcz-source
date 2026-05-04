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
public class UserDakaRequest implements TBase<UserDakaRequest, _Fields>, Serializable, Cloneable, Comparable<UserDakaRequest> {
    private static final int __BOOK_ID_ISSET_ID = 0;
    private static final int __COUNT_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int book_id;
    public UserDakaDate client_date;
    public int count;
    public List<UserDakaDate> daka_dates;
    public List<UserDakaTopic> poster_topic_ids;
    public String timezone;
    private static final TStruct STRUCT_DESC = new TStruct("UserDakaRequest");
    private static final TField BOOK_ID_FIELD_DESC = new TField("book_id", (byte) 8, 1);
    private static final TField COUNT_FIELD_DESC = new TField("count", (byte) 8, 2);
    private static final TField DAKA_DATES_FIELD_DESC = new TField("daka_dates", (byte) 15, 3);
    private static final TField TIMEZONE_FIELD_DESC = new TField("timezone", (byte) 11, 4);
    private static final TField CLIENT_DATE_FIELD_DESC = new TField("client_date", (byte) 12, 5);
    private static final TField POSTER_TOPIC_IDS_FIELD_DESC = new TField("poster_topic_ids", (byte) 15, 6);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.UserDakaRequest$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$UserDakaRequest$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$UserDakaRequest$_Fields = iArr;
            try {
                iArr[_Fields.BOOK_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserDakaRequest$_Fields[_Fields.COUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserDakaRequest$_Fields[_Fields.DAKA_DATES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserDakaRequest$_Fields[_Fields.TIMEZONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserDakaRequest$_Fields[_Fields.CLIENT_DATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserDakaRequest$_Fields[_Fields.POSTER_TOPIC_IDS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserDakaRequestStandardScheme extends StandardScheme<UserDakaRequest> {
        private UserDakaRequestStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserDakaRequest struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetBook_id()) {
                        throw new TProtocolException("Required field 'book_id' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetCount()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'count' was not found in serialized data! Struct: " + toString());
                }
                int i11 = 0;
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.book_id = iprot.readI32();
                            struct.setBook_idIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.count = iprot.readI32();
                            struct.setCountIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 15) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            TList readListBegin = iprot.readListBegin();
                            struct.daka_dates = new ArrayList(readListBegin.size);
                            while (i11 < readListBegin.size) {
                                UserDakaDate userDakaDate = new UserDakaDate();
                                userDakaDate.read(iprot);
                                struct.daka_dates.add(userDakaDate);
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setDaka_datesIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.timezone = iprot.readString();
                            struct.setTimezoneIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            UserDakaDate userDakaDate2 = new UserDakaDate();
                            struct.client_date = userDakaDate2;
                            userDakaDate2.read(iprot);
                            struct.setClient_dateIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 15) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            TList readListBegin2 = iprot.readListBegin();
                            struct.poster_topic_ids = new ArrayList(readListBegin2.size);
                            while (i11 < readListBegin2.size) {
                                UserDakaTopic userDakaTopic = new UserDakaTopic();
                                userDakaTopic.read(iprot);
                                struct.poster_topic_ids.add(userDakaTopic);
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setPoster_topic_idsIsSet(true);
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
        public void write(TProtocol oprot, UserDakaRequest struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserDakaRequest.STRUCT_DESC);
            oprot.writeFieldBegin(UserDakaRequest.BOOK_ID_FIELD_DESC);
            oprot.writeI32(struct.book_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserDakaRequest.COUNT_FIELD_DESC);
            oprot.writeI32(struct.count);
            oprot.writeFieldEnd();
            if (struct.daka_dates != null) {
                oprot.writeFieldBegin(UserDakaRequest.DAKA_DATES_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.daka_dates.size()));
                Iterator<UserDakaDate> it = struct.daka_dates.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.timezone != null) {
                oprot.writeFieldBegin(UserDakaRequest.TIMEZONE_FIELD_DESC);
                oprot.writeString(struct.timezone);
                oprot.writeFieldEnd();
            }
            if (struct.client_date != null) {
                oprot.writeFieldBegin(UserDakaRequest.CLIENT_DATE_FIELD_DESC);
                struct.client_date.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.poster_topic_ids != null) {
                oprot.writeFieldBegin(UserDakaRequest.POSTER_TOPIC_IDS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.poster_topic_ids.size()));
                Iterator<UserDakaTopic> it2 = struct.poster_topic_ids.iterator();
                while (it2.hasNext()) {
                    it2.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserDakaRequestStandardSchemeFactory implements SchemeFactory {
        private UserDakaRequestStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserDakaRequestStandardScheme getScheme() {
            return new UserDakaRequestStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserDakaRequestTupleScheme extends TupleScheme<UserDakaRequest> {
        private UserDakaRequestTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserDakaRequest struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.book_id = tTupleProtocol.readI32();
            struct.setBook_idIsSet(true);
            struct.count = tTupleProtocol.readI32();
            struct.setCountIsSet(true);
            TList tList = new TList((byte) 12, tTupleProtocol.readI32());
            struct.daka_dates = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                UserDakaDate userDakaDate = new UserDakaDate();
                userDakaDate.read(tTupleProtocol);
                struct.daka_dates.add(userDakaDate);
            }
            struct.setDaka_datesIsSet(true);
            struct.timezone = tTupleProtocol.readString();
            struct.setTimezoneIsSet(true);
            UserDakaDate userDakaDate2 = new UserDakaDate();
            struct.client_date = userDakaDate2;
            userDakaDate2.read(tTupleProtocol);
            struct.setClient_dateIsSet(true);
            TList tList2 = new TList((byte) 12, tTupleProtocol.readI32());
            struct.poster_topic_ids = new ArrayList(tList2.size);
            for (int i12 = 0; i12 < tList2.size; i12++) {
                UserDakaTopic userDakaTopic = new UserDakaTopic();
                userDakaTopic.read(tTupleProtocol);
                struct.poster_topic_ids.add(userDakaTopic);
            }
            struct.setPoster_topic_idsIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserDakaRequest struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.book_id);
            tTupleProtocol.writeI32(struct.count);
            tTupleProtocol.writeI32(struct.daka_dates.size());
            Iterator<UserDakaDate> it = struct.daka_dates.iterator();
            while (it.hasNext()) {
                it.next().write(tTupleProtocol);
            }
            tTupleProtocol.writeString(struct.timezone);
            struct.client_date.write(tTupleProtocol);
            tTupleProtocol.writeI32(struct.poster_topic_ids.size());
            Iterator<UserDakaTopic> it2 = struct.poster_topic_ids.iterator();
            while (it2.hasNext()) {
                it2.next().write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserDakaRequestTupleSchemeFactory implements SchemeFactory {
        private UserDakaRequestTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserDakaRequestTupleScheme getScheme() {
            return new UserDakaRequestTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        BOOK_ID(1, "book_id"),
        COUNT(2, "count"),
        DAKA_DATES(3, "daka_dates"),
        TIMEZONE(4, "timezone"),
        CLIENT_DATE(5, "client_date"),
        POSTER_TOPIC_IDS(6, "poster_topic_ids");

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
                    return BOOK_ID;
                case 2:
                    return COUNT;
                case 3:
                    return DAKA_DATES;
                case 4:
                    return TIMEZONE;
                case 5:
                    return CLIENT_DATE;
                case 6:
                    return POSTER_TOPIC_IDS;
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
        hashMap.put(StandardScheme.class, new UserDakaRequestStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserDakaRequestTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.BOOK_ID, (_Fields) new FieldMetaData("book_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.COUNT, (_Fields) new FieldMetaData("count", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.DAKA_DATES, (_Fields) new FieldMetaData("daka_dates", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, UserDakaDate.class))));
        enumMap.put((EnumMap) _Fields.TIMEZONE, (_Fields) new FieldMetaData("timezone", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.CLIENT_DATE, (_Fields) new FieldMetaData("client_date", (byte) 1, new StructMetaData((byte) 12, UserDakaDate.class)));
        enumMap.put((EnumMap) _Fields.POSTER_TOPIC_IDS, (_Fields) new FieldMetaData("poster_topic_ids", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, UserDakaTopic.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserDakaRequest.class, unmodifiableMap);
    }

    public UserDakaRequest() {
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

    public void addToPoster_topic_ids(UserDakaTopic elem) {
        if (this.poster_topic_ids == null) {
            this.poster_topic_ids = new ArrayList();
        }
        this.poster_topic_ids.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        setBook_idIsSet(false);
        this.book_id = 0;
        setCountIsSet(false);
        this.count = 0;
        this.daka_dates = null;
        this.timezone = null;
        this.client_date = null;
        this.poster_topic_ids = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserDakaRequest)) {
            return equals((UserDakaRequest) that);
        }
        return false;
    }

    public int getBook_id() {
        return this.book_id;
    }

    public UserDakaDate getClient_date() {
        return this.client_date;
    }

    public int getCount() {
        return this.count;
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

    public List<UserDakaTopic> getPoster_topic_ids() {
        return this.poster_topic_ids;
    }

    public Iterator<UserDakaTopic> getPoster_topic_idsIterator() {
        List<UserDakaTopic> list = this.poster_topic_ids;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getPoster_topic_idsSize() {
        List<UserDakaTopic> list = this.poster_topic_ids;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public String getTimezone() {
        return this.timezone;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetBook_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetClient_date() {
        return this.client_date != null;
    }

    public boolean isSetCount() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetDaka_dates() {
        return this.daka_dates != null;
    }

    public boolean isSetPoster_topic_ids() {
        return this.poster_topic_ids != null;
    }

    public boolean isSetTimezone() {
        return this.timezone != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserDakaRequest setBook_id(int book_id) {
        this.book_id = book_id;
        setBook_idIsSet(true);
        return this;
    }

    public void setBook_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public UserDakaRequest setClient_date(UserDakaDate client_date) {
        this.client_date = client_date;
        return this;
    }

    public void setClient_dateIsSet(boolean value) {
        if (value) {
            return;
        }
        this.client_date = null;
    }

    public UserDakaRequest setCount(int count) {
        this.count = count;
        setCountIsSet(true);
        return this;
    }

    public void setCountIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public UserDakaRequest setDaka_dates(List<UserDakaDate> daka_dates) {
        this.daka_dates = daka_dates;
        return this;
    }

    public void setDaka_datesIsSet(boolean value) {
        if (value) {
            return;
        }
        this.daka_dates = null;
    }

    public UserDakaRequest setPoster_topic_ids(List<UserDakaTopic> poster_topic_ids) {
        this.poster_topic_ids = poster_topic_ids;
        return this;
    }

    public void setPoster_topic_idsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.poster_topic_ids = null;
    }

    public UserDakaRequest setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    public void setTimezoneIsSet(boolean value) {
        if (value) {
            return;
        }
        this.timezone = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserDakaRequest(");
        sb2.append("book_id:");
        sb2.append(this.book_id);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("count:");
        sb2.append(this.count);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("daka_dates:");
        List<UserDakaDate> list = this.daka_dates;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("timezone:");
        String str = this.timezone;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("client_date:");
        UserDakaDate userDakaDate = this.client_date;
        if (userDakaDate == null) {
            sb2.append("null");
        } else {
            sb2.append(userDakaDate);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("poster_topic_ids:");
        List<UserDakaTopic> list2 = this.poster_topic_ids;
        if (list2 == null) {
            sb2.append("null");
        } else {
            sb2.append(list2);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetBook_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetClient_date() {
        this.client_date = null;
    }

    public void unsetCount() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetDaka_dates() {
        this.daka_dates = null;
    }

    public void unsetPoster_topic_ids() {
        this.poster_topic_ids = null;
    }

    public void unsetTimezone() {
        this.timezone = null;
    }

    public void validate() throws TException {
        if (this.daka_dates == null) {
            throw new TProtocolException("Required field 'daka_dates' was not present! Struct: " + toString());
        }
        if (this.timezone == null) {
            throw new TProtocolException("Required field 'timezone' was not present! Struct: " + toString());
        }
        UserDakaDate userDakaDate = this.client_date;
        if (userDakaDate == null) {
            throw new TProtocolException("Required field 'client_date' was not present! Struct: " + toString());
        }
        if (this.poster_topic_ids != null) {
            if (userDakaDate != null) {
                userDakaDate.validate();
            }
        } else {
            throw new TProtocolException("Required field 'poster_topic_ids' was not present! Struct: " + toString());
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(UserDakaRequest other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo7 = Boolean.valueOf(isSetBook_id()).compareTo(Boolean.valueOf(other.isSetBook_id()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetBook_id() && (compareTo6 = TBaseHelper.compareTo(this.book_id, other.book_id)) != 0) {
            return compareTo6;
        }
        int compareTo8 = Boolean.valueOf(isSetCount()).compareTo(Boolean.valueOf(other.isSetCount()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetCount() && (compareTo5 = TBaseHelper.compareTo(this.count, other.count)) != 0) {
            return compareTo5;
        }
        int compareTo9 = Boolean.valueOf(isSetDaka_dates()).compareTo(Boolean.valueOf(other.isSetDaka_dates()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetDaka_dates() && (compareTo4 = TBaseHelper.compareTo((List) this.daka_dates, (List) other.daka_dates)) != 0) {
            return compareTo4;
        }
        int compareTo10 = Boolean.valueOf(isSetTimezone()).compareTo(Boolean.valueOf(other.isSetTimezone()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetTimezone() && (compareTo3 = TBaseHelper.compareTo(this.timezone, other.timezone)) != 0) {
            return compareTo3;
        }
        int compareTo11 = Boolean.valueOf(isSetClient_date()).compareTo(Boolean.valueOf(other.isSetClient_date()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetClient_date() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.client_date, (Comparable) other.client_date)) != 0) {
            return compareTo2;
        }
        int compareTo12 = Boolean.valueOf(isSetPoster_topic_ids()).compareTo(Boolean.valueOf(other.isSetPoster_topic_ids()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (!isSetPoster_topic_ids() || (compareTo = TBaseHelper.compareTo((List) this.poster_topic_ids, (List) other.poster_topic_ids)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserDakaRequest, _Fields> deepCopy2() {
        return new UserDakaRequest(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserDakaRequest$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getBook_id());
            case 2:
                return Integer.valueOf(getCount());
            case 3:
                return getDaka_dates();
            case 4:
                return getTimezone();
            case 5:
                return getClient_date();
            case 6:
                return getPoster_topic_ids();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserDakaRequest$_Fields[field.ordinal()]) {
            case 1:
                return isSetBook_id();
            case 2:
                return isSetCount();
            case 3:
                return isSetDaka_dates();
            case 4:
                return isSetTimezone();
            case 5:
                return isSetClient_date();
            case 6:
                return isSetPoster_topic_ids();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserDakaRequest$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setBook_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetBook_id();
                    break;
                }
            case 2:
                if (value != null) {
                    setCount(((Integer) value).intValue());
                    break;
                } else {
                    unsetCount();
                    break;
                }
            case 3:
                if (value != null) {
                    setDaka_dates((List) value);
                    break;
                } else {
                    unsetDaka_dates();
                    break;
                }
            case 4:
                if (value != null) {
                    setTimezone((String) value);
                    break;
                } else {
                    unsetTimezone();
                    break;
                }
            case 5:
                if (value != null) {
                    setClient_date((UserDakaDate) value);
                    break;
                } else {
                    unsetClient_date();
                    break;
                }
            case 6:
                if (value != null) {
                    setPoster_topic_ids((List) value);
                    break;
                } else {
                    unsetPoster_topic_ids();
                    break;
                }
        }
    }

    public UserDakaRequest(int book_id, int count, List<UserDakaDate> daka_dates, String timezone, UserDakaDate client_date, List<UserDakaTopic> poster_topic_ids) {
        this();
        this.book_id = book_id;
        setBook_idIsSet(true);
        this.count = count;
        setCountIsSet(true);
        this.daka_dates = daka_dates;
        this.timezone = timezone;
        this.client_date = client_date;
        this.poster_topic_ids = poster_topic_ids;
    }

    public boolean equals(UserDakaRequest that) {
        if (that == null || this.book_id != that.book_id || this.count != that.count) {
            return false;
        }
        boolean isSetDaka_dates = isSetDaka_dates();
        boolean isSetDaka_dates2 = that.isSetDaka_dates();
        if ((isSetDaka_dates || isSetDaka_dates2) && !(isSetDaka_dates && isSetDaka_dates2 && this.daka_dates.equals(that.daka_dates))) {
            return false;
        }
        boolean isSetTimezone = isSetTimezone();
        boolean isSetTimezone2 = that.isSetTimezone();
        if ((isSetTimezone || isSetTimezone2) && !(isSetTimezone && isSetTimezone2 && this.timezone.equals(that.timezone))) {
            return false;
        }
        boolean isSetClient_date = isSetClient_date();
        boolean isSetClient_date2 = that.isSetClient_date();
        if ((isSetClient_date || isSetClient_date2) && !(isSetClient_date && isSetClient_date2 && this.client_date.equals(that.client_date))) {
            return false;
        }
        boolean isSetPoster_topic_ids = isSetPoster_topic_ids();
        boolean isSetPoster_topic_ids2 = that.isSetPoster_topic_ids();
        if (isSetPoster_topic_ids || isSetPoster_topic_ids2) {
            return isSetPoster_topic_ids && isSetPoster_topic_ids2 && this.poster_topic_ids.equals(that.poster_topic_ids);
        }
        return true;
    }

    public UserDakaRequest(UserDakaRequest other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.book_id = other.book_id;
        this.count = other.count;
        if (other.isSetDaka_dates()) {
            ArrayList arrayList = new ArrayList(other.daka_dates.size());
            Iterator<UserDakaDate> it = other.daka_dates.iterator();
            while (it.hasNext()) {
                arrayList.add(new UserDakaDate(it.next()));
            }
            this.daka_dates = arrayList;
        }
        if (other.isSetTimezone()) {
            this.timezone = other.timezone;
        }
        if (other.isSetClient_date()) {
            this.client_date = new UserDakaDate(other.client_date);
        }
        if (other.isSetPoster_topic_ids()) {
            ArrayList arrayList2 = new ArrayList(other.poster_topic_ids.size());
            Iterator<UserDakaTopic> it2 = other.poster_topic_ids.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new UserDakaTopic(it2.next()));
            }
            this.poster_topic_ids = arrayList2;
        }
    }
}
