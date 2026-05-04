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
public class UserLearnInfoV2 implements TBase<UserLearnInfoV2, _Fields>, Serializable, Cloneable, Comparable<UserLearnInfoV2> {
    private static final int __DAILY_PLAN_COUNT_ISSET_ID = 1;
    private static final int __GROUP_COUNT_ISSET_ID = 3;
    private static final int __LAST_SYNC_DONE_SCORE_TIME_ISSET_ID = 0;
    private static final int __REVIEW_PLAN_COUNT_ISSET_ID = 2;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int daily_plan_count;
    public int group_count;
    public long last_sync_done_score_time;
    private _Fields[] optionals;
    public int review_plan_count;
    private static final TStruct STRUCT_DESC = new TStruct("UserLearnInfoV2");
    private static final TField LAST_SYNC_DONE_SCORE_TIME_FIELD_DESC = new TField("last_sync_done_score_time", (byte) 10, 1);
    private static final TField DAILY_PLAN_COUNT_FIELD_DESC = new TField("daily_plan_count", (byte) 8, 2);
    private static final TField REVIEW_PLAN_COUNT_FIELD_DESC = new TField("review_plan_count", (byte) 8, 3);
    private static final TField GROUP_COUNT_FIELD_DESC = new TField("group_count", (byte) 8, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.UserLearnInfoV2$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$UserLearnInfoV2$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$UserLearnInfoV2$_Fields = iArr;
            try {
                iArr[_Fields.LAST_SYNC_DONE_SCORE_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLearnInfoV2$_Fields[_Fields.DAILY_PLAN_COUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLearnInfoV2$_Fields[_Fields.REVIEW_PLAN_COUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLearnInfoV2$_Fields[_Fields.GROUP_COUNT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserLearnInfoV2StandardScheme extends StandardScheme<UserLearnInfoV2> {
        private UserLearnInfoV2StandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserLearnInfoV2 struct) throws TException {
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
                            } else if (b11 == 8) {
                                struct.group_count = iprot.readI32();
                                struct.setGroup_countIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 8) {
                            struct.review_plan_count = iprot.readI32();
                            struct.setReview_plan_countIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.daily_plan_count = iprot.readI32();
                        struct.setDaily_plan_countIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 10) {
                    struct.last_sync_done_score_time = iprot.readI64();
                    struct.setLast_sync_done_score_timeIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetLast_sync_done_score_time()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'last_sync_done_score_time' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, UserLearnInfoV2 struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserLearnInfoV2.STRUCT_DESC);
            oprot.writeFieldBegin(UserLearnInfoV2.LAST_SYNC_DONE_SCORE_TIME_FIELD_DESC);
            oprot.writeI64(struct.last_sync_done_score_time);
            oprot.writeFieldEnd();
            if (struct.isSetDaily_plan_count()) {
                oprot.writeFieldBegin(UserLearnInfoV2.DAILY_PLAN_COUNT_FIELD_DESC);
                oprot.writeI32(struct.daily_plan_count);
                oprot.writeFieldEnd();
            }
            if (struct.isSetReview_plan_count()) {
                oprot.writeFieldBegin(UserLearnInfoV2.REVIEW_PLAN_COUNT_FIELD_DESC);
                oprot.writeI32(struct.review_plan_count);
                oprot.writeFieldEnd();
            }
            if (struct.isSetGroup_count()) {
                oprot.writeFieldBegin(UserLearnInfoV2.GROUP_COUNT_FIELD_DESC);
                oprot.writeI32(struct.group_count);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserLearnInfoV2StandardSchemeFactory implements SchemeFactory {
        private UserLearnInfoV2StandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserLearnInfoV2StandardScheme getScheme() {
            return new UserLearnInfoV2StandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserLearnInfoV2TupleScheme extends TupleScheme<UserLearnInfoV2> {
        private UserLearnInfoV2TupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserLearnInfoV2 struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.last_sync_done_score_time = tTupleProtocol.readI64();
            struct.setLast_sync_done_score_timeIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(3);
            if (readBitSet.get(0)) {
                struct.daily_plan_count = tTupleProtocol.readI32();
                struct.setDaily_plan_countIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.review_plan_count = tTupleProtocol.readI32();
                struct.setReview_plan_countIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.group_count = tTupleProtocol.readI32();
                struct.setGroup_countIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserLearnInfoV2 struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI64(struct.last_sync_done_score_time);
            BitSet bitSet = new BitSet();
            if (struct.isSetDaily_plan_count()) {
                bitSet.set(0);
            }
            if (struct.isSetReview_plan_count()) {
                bitSet.set(1);
            }
            if (struct.isSetGroup_count()) {
                bitSet.set(2);
            }
            tTupleProtocol.writeBitSet(bitSet, 3);
            if (struct.isSetDaily_plan_count()) {
                tTupleProtocol.writeI32(struct.daily_plan_count);
            }
            if (struct.isSetReview_plan_count()) {
                tTupleProtocol.writeI32(struct.review_plan_count);
            }
            if (struct.isSetGroup_count()) {
                tTupleProtocol.writeI32(struct.group_count);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserLearnInfoV2TupleSchemeFactory implements SchemeFactory {
        private UserLearnInfoV2TupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserLearnInfoV2TupleScheme getScheme() {
            return new UserLearnInfoV2TupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        LAST_SYNC_DONE_SCORE_TIME(1, "last_sync_done_score_time"),
        DAILY_PLAN_COUNT(2, "daily_plan_count"),
        REVIEW_PLAN_COUNT(3, "review_plan_count"),
        GROUP_COUNT(4, "group_count");

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
                return LAST_SYNC_DONE_SCORE_TIME;
            }
            if (fieldId == 2) {
                return DAILY_PLAN_COUNT;
            }
            if (fieldId == 3) {
                return REVIEW_PLAN_COUNT;
            }
            if (fieldId != 4) {
                return null;
            }
            return GROUP_COUNT;
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
        hashMap.put(StandardScheme.class, new UserLearnInfoV2StandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserLearnInfoV2TupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.LAST_SYNC_DONE_SCORE_TIME, (_Fields) new FieldMetaData("last_sync_done_score_time", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.DAILY_PLAN_COUNT, (_Fields) new FieldMetaData("daily_plan_count", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.REVIEW_PLAN_COUNT, (_Fields) new FieldMetaData("review_plan_count", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.GROUP_COUNT, (_Fields) new FieldMetaData("group_count", (byte) 2, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserLearnInfoV2.class, unmodifiableMap);
    }

    public UserLearnInfoV2() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.DAILY_PLAN_COUNT, _Fields.REVIEW_PLAN_COUNT, _Fields.GROUP_COUNT};
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
        setLast_sync_done_score_timeIsSet(false);
        this.last_sync_done_score_time = 0L;
        setDaily_plan_countIsSet(false);
        this.daily_plan_count = 0;
        setReview_plan_countIsSet(false);
        this.review_plan_count = 0;
        setGroup_countIsSet(false);
        this.group_count = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserLearnInfoV2)) {
            return equals((UserLearnInfoV2) that);
        }
        return false;
    }

    public int getDaily_plan_count() {
        return this.daily_plan_count;
    }

    public int getGroup_count() {
        return this.group_count;
    }

    public long getLast_sync_done_score_time() {
        return this.last_sync_done_score_time;
    }

    public int getReview_plan_count() {
        return this.review_plan_count;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetDaily_plan_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetGroup_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetLast_sync_done_score_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetReview_plan_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserLearnInfoV2 setDaily_plan_count(int daily_plan_count) {
        this.daily_plan_count = daily_plan_count;
        setDaily_plan_countIsSet(true);
        return this;
    }

    public void setDaily_plan_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public UserLearnInfoV2 setGroup_count(int group_count) {
        this.group_count = group_count;
        setGroup_countIsSet(true);
        return this;
    }

    public void setGroup_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public UserLearnInfoV2 setLast_sync_done_score_time(long last_sync_done_score_time) {
        this.last_sync_done_score_time = last_sync_done_score_time;
        setLast_sync_done_score_timeIsSet(true);
        return this;
    }

    public void setLast_sync_done_score_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public UserLearnInfoV2 setReview_plan_count(int review_plan_count) {
        this.review_plan_count = review_plan_count;
        setReview_plan_countIsSet(true);
        return this;
    }

    public void setReview_plan_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserLearnInfoV2(");
        sb2.append("last_sync_done_score_time:");
        sb2.append(this.last_sync_done_score_time);
        if (isSetDaily_plan_count()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("daily_plan_count:");
            sb2.append(this.daily_plan_count);
        }
        if (isSetReview_plan_count()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("review_plan_count:");
            sb2.append(this.review_plan_count);
        }
        if (isSetGroup_count()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("group_count:");
            sb2.append(this.group_count);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetDaily_plan_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetGroup_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetLast_sync_done_score_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetReview_plan_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(UserLearnInfoV2 other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetLast_sync_done_score_time()).compareTo(Boolean.valueOf(other.isSetLast_sync_done_score_time()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetLast_sync_done_score_time() && (compareTo4 = TBaseHelper.compareTo(this.last_sync_done_score_time, other.last_sync_done_score_time)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetDaily_plan_count()).compareTo(Boolean.valueOf(other.isSetDaily_plan_count()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetDaily_plan_count() && (compareTo3 = TBaseHelper.compareTo(this.daily_plan_count, other.daily_plan_count)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetReview_plan_count()).compareTo(Boolean.valueOf(other.isSetReview_plan_count()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetReview_plan_count() && (compareTo2 = TBaseHelper.compareTo(this.review_plan_count, other.review_plan_count)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetGroup_count()).compareTo(Boolean.valueOf(other.isSetGroup_count()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetGroup_count() || (compareTo = TBaseHelper.compareTo(this.group_count, other.group_count)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserLearnInfoV2, _Fields> deepCopy2() {
        return new UserLearnInfoV2(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserLearnInfoV2$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Long.valueOf(getLast_sync_done_score_time());
        }
        if (i11 == 2) {
            return Integer.valueOf(getDaily_plan_count());
        }
        if (i11 == 3) {
            return Integer.valueOf(getReview_plan_count());
        }
        if (i11 == 4) {
            return Integer.valueOf(getGroup_count());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserLearnInfoV2$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetLast_sync_done_score_time();
        }
        if (i11 == 2) {
            return isSetDaily_plan_count();
        }
        if (i11 == 3) {
            return isSetReview_plan_count();
        }
        if (i11 == 4) {
            return isSetGroup_count();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserLearnInfoV2$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetLast_sync_done_score_time();
                return;
            } else {
                setLast_sync_done_score_time(((Long) value).longValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetDaily_plan_count();
                return;
            } else {
                setDaily_plan_count(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetReview_plan_count();
                return;
            } else {
                setReview_plan_count(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetGroup_count();
        } else {
            setGroup_count(((Integer) value).intValue());
        }
    }

    public boolean equals(UserLearnInfoV2 that) {
        if (that == null || this.last_sync_done_score_time != that.last_sync_done_score_time) {
            return false;
        }
        boolean isSetDaily_plan_count = isSetDaily_plan_count();
        boolean isSetDaily_plan_count2 = that.isSetDaily_plan_count();
        if ((isSetDaily_plan_count || isSetDaily_plan_count2) && !(isSetDaily_plan_count && isSetDaily_plan_count2 && this.daily_plan_count == that.daily_plan_count)) {
            return false;
        }
        boolean isSetReview_plan_count = isSetReview_plan_count();
        boolean isSetReview_plan_count2 = that.isSetReview_plan_count();
        if ((isSetReview_plan_count || isSetReview_plan_count2) && !(isSetReview_plan_count && isSetReview_plan_count2 && this.review_plan_count == that.review_plan_count)) {
            return false;
        }
        boolean isSetGroup_count = isSetGroup_count();
        boolean isSetGroup_count2 = that.isSetGroup_count();
        if (isSetGroup_count || isSetGroup_count2) {
            return isSetGroup_count && isSetGroup_count2 && this.group_count == that.group_count;
        }
        return true;
    }

    public UserLearnInfoV2(long last_sync_done_score_time) {
        this();
        this.last_sync_done_score_time = last_sync_done_score_time;
        setLast_sync_done_score_timeIsSet(true);
    }

    public UserLearnInfoV2(UserLearnInfoV2 other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.DAILY_PLAN_COUNT, _Fields.REVIEW_PLAN_COUNT, _Fields.GROUP_COUNT};
        this.__isset_bitfield = other.__isset_bitfield;
        this.last_sync_done_score_time = other.last_sync_done_score_time;
        this.daily_plan_count = other.daily_plan_count;
        this.review_plan_count = other.review_plan_count;
        this.group_count = other.group_count;
    }

    public void validate() throws TException {
    }
}
