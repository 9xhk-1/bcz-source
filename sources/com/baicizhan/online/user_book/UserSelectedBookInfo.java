package com.baicizhan.online.user_book;

import com.baicizhan.main.collectreview.ui.CollectReviewActivity;
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
/* loaded from: classes6.dex */
public class UserSelectedBookInfo implements TBase<UserSelectedBookInfo, _Fields>, Serializable, Cloneable, Comparable<UserSelectedBookInfo> {
    private static final int __DAILY_PLAN_COUNT_ISSET_ID = 1;
    private static final int __USER_BOOK_ID_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int daily_plan_count;
    public long user_book_id;
    private static final TStruct STRUCT_DESC = new TStruct("UserSelectedBookInfo");
    private static final TField USER_BOOK_ID_FIELD_DESC = new TField(CollectReviewActivity.G, (byte) 10, 1);
    private static final TField DAILY_PLAN_COUNT_FIELD_DESC = new TField("daily_plan_count", (byte) 8, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_book.UserSelectedBookInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_book$UserSelectedBookInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_book$UserSelectedBookInfo$_Fields = iArr;
            try {
                iArr[_Fields.USER_BOOK_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_book$UserSelectedBookInfo$_Fields[_Fields.DAILY_PLAN_COUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserSelectedBookInfoStandardScheme extends StandardScheme<UserSelectedBookInfo> {
        private UserSelectedBookInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserSelectedBookInfo struct) throws TException {
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
                        struct.daily_plan_count = iprot.readI32();
                        struct.setDaily_plan_countIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 10) {
                    struct.user_book_id = iprot.readI64();
                    struct.setUser_book_idIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetUser_book_id()) {
                throw new TProtocolException("Required field 'user_book_id' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetDaily_plan_count()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'daily_plan_count' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, UserSelectedBookInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserSelectedBookInfo.STRUCT_DESC);
            oprot.writeFieldBegin(UserSelectedBookInfo.USER_BOOK_ID_FIELD_DESC);
            oprot.writeI64(struct.user_book_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserSelectedBookInfo.DAILY_PLAN_COUNT_FIELD_DESC);
            oprot.writeI32(struct.daily_plan_count);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserSelectedBookInfoStandardSchemeFactory implements SchemeFactory {
        private UserSelectedBookInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserSelectedBookInfoStandardScheme getScheme() {
            return new UserSelectedBookInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserSelectedBookInfoTupleScheme extends TupleScheme<UserSelectedBookInfo> {
        private UserSelectedBookInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserSelectedBookInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.user_book_id = tTupleProtocol.readI64();
            struct.setUser_book_idIsSet(true);
            struct.daily_plan_count = tTupleProtocol.readI32();
            struct.setDaily_plan_countIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserSelectedBookInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI64(struct.user_book_id);
            tTupleProtocol.writeI32(struct.daily_plan_count);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserSelectedBookInfoTupleSchemeFactory implements SchemeFactory {
        private UserSelectedBookInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserSelectedBookInfoTupleScheme getScheme() {
            return new UserSelectedBookInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        USER_BOOK_ID(1, CollectReviewActivity.G),
        DAILY_PLAN_COUNT(2, "daily_plan_count");

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
                return USER_BOOK_ID;
            }
            if (fieldId != 2) {
                return null;
            }
            return DAILY_PLAN_COUNT;
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
        hashMap.put(StandardScheme.class, new UserSelectedBookInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserSelectedBookInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.USER_BOOK_ID, (_Fields) new FieldMetaData(CollectReviewActivity.G, (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.DAILY_PLAN_COUNT, (_Fields) new FieldMetaData("daily_plan_count", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserSelectedBookInfo.class, unmodifiableMap);
    }

    public UserSelectedBookInfo() {
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
        setUser_book_idIsSet(false);
        this.user_book_id = 0L;
        setDaily_plan_countIsSet(false);
        this.daily_plan_count = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserSelectedBookInfo)) {
            return equals((UserSelectedBookInfo) that);
        }
        return false;
    }

    public int getDaily_plan_count() {
        return this.daily_plan_count;
    }

    public long getUser_book_id() {
        return this.user_book_id;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetDaily_plan_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetUser_book_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserSelectedBookInfo setDaily_plan_count(int daily_plan_count) {
        this.daily_plan_count = daily_plan_count;
        setDaily_plan_countIsSet(true);
        return this;
    }

    public void setDaily_plan_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public UserSelectedBookInfo setUser_book_id(long user_book_id) {
        this.user_book_id = user_book_id;
        setUser_book_idIsSet(true);
        return this;
    }

    public void setUser_book_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        return "UserSelectedBookInfo(user_book_id:" + this.user_book_id + j2.O + "daily_plan_count:" + this.daily_plan_count + pn.j.f81007d;
    }

    public void unsetDaily_plan_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetUser_book_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(UserSelectedBookInfo other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetUser_book_id()).compareTo(Boolean.valueOf(other.isSetUser_book_id()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetUser_book_id() && (compareTo2 = TBaseHelper.compareTo(this.user_book_id, other.user_book_id)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetDaily_plan_count()).compareTo(Boolean.valueOf(other.isSetDaily_plan_count()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetDaily_plan_count() || (compareTo = TBaseHelper.compareTo(this.daily_plan_count, other.daily_plan_count)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserSelectedBookInfo, _Fields> deepCopy2() {
        return new UserSelectedBookInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_book$UserSelectedBookInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Long.valueOf(getUser_book_id());
        }
        if (i11 == 2) {
            return Integer.valueOf(getDaily_plan_count());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_book$UserSelectedBookInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetUser_book_id();
        }
        if (i11 == 2) {
            return isSetDaily_plan_count();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_book$UserSelectedBookInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetUser_book_id();
                return;
            } else {
                setUser_book_id(((Long) value).longValue());
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetDaily_plan_count();
        } else {
            setDaily_plan_count(((Integer) value).intValue());
        }
    }

    public UserSelectedBookInfo(long user_book_id, int daily_plan_count) {
        this();
        this.user_book_id = user_book_id;
        setUser_book_idIsSet(true);
        this.daily_plan_count = daily_plan_count;
        setDaily_plan_countIsSet(true);
    }

    public boolean equals(UserSelectedBookInfo that) {
        return that != null && this.user_book_id == that.user_book_id && this.daily_plan_count == that.daily_plan_count;
    }

    public UserSelectedBookInfo(UserSelectedBookInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.user_book_id = other.user_book_id;
        this.daily_plan_count = other.daily_plan_count;
    }

    public void validate() throws TException {
    }
}
