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
public class UserPlanInfo implements TBase<UserPlanInfo, _Fields>, Serializable, Cloneable, Comparable<UserPlanInfo> {
    private static final int __PLAN_VERSION_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public UserBookInfo book_info;
    public PlanProgressInfo plan_progress;
    public long plan_version;
    private static final TStruct STRUCT_DESC = new TStruct("UserPlanInfo");
    private static final TField BOOK_INFO_FIELD_DESC = new TField("book_info", (byte) 12, 1);
    private static final TField PLAN_PROGRESS_FIELD_DESC = new TField("plan_progress", (byte) 12, 2);
    private static final TField PLAN_VERSION_FIELD_DESC = new TField("plan_version", (byte) 10, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.UserPlanInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$UserPlanInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$UserPlanInfo$_Fields = iArr;
            try {
                iArr[_Fields.BOOK_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$UserPlanInfo$_Fields[_Fields.PLAN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$UserPlanInfo$_Fields[_Fields.PLAN_VERSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserPlanInfoStandardScheme extends StandardScheme<UserPlanInfo> {
        private UserPlanInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserPlanInfo struct) throws TException {
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
                        } else if (b11 == 10) {
                            struct.plan_version = iprot.readI64();
                            struct.setPlan_versionIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 12) {
                        PlanProgressInfo planProgressInfo = new PlanProgressInfo();
                        struct.plan_progress = planProgressInfo;
                        planProgressInfo.read(iprot);
                        struct.setPlan_progressIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 12) {
                    UserBookInfo userBookInfo = new UserBookInfo();
                    struct.book_info = userBookInfo;
                    userBookInfo.read(iprot);
                    struct.setBook_infoIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetPlan_version()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'plan_version' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, UserPlanInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserPlanInfo.STRUCT_DESC);
            if (struct.book_info != null) {
                oprot.writeFieldBegin(UserPlanInfo.BOOK_INFO_FIELD_DESC);
                struct.book_info.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.plan_progress != null) {
                oprot.writeFieldBegin(UserPlanInfo.PLAN_PROGRESS_FIELD_DESC);
                struct.plan_progress.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(UserPlanInfo.PLAN_VERSION_FIELD_DESC);
            oprot.writeI64(struct.plan_version);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserPlanInfoStandardSchemeFactory implements SchemeFactory {
        private UserPlanInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserPlanInfoStandardScheme getScheme() {
            return new UserPlanInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserPlanInfoTupleScheme extends TupleScheme<UserPlanInfo> {
        private UserPlanInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserPlanInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            UserBookInfo userBookInfo = new UserBookInfo();
            struct.book_info = userBookInfo;
            userBookInfo.read(tTupleProtocol);
            struct.setBook_infoIsSet(true);
            PlanProgressInfo planProgressInfo = new PlanProgressInfo();
            struct.plan_progress = planProgressInfo;
            planProgressInfo.read(tTupleProtocol);
            struct.setPlan_progressIsSet(true);
            struct.plan_version = tTupleProtocol.readI64();
            struct.setPlan_versionIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserPlanInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.book_info.write(tTupleProtocol);
            struct.plan_progress.write(tTupleProtocol);
            tTupleProtocol.writeI64(struct.plan_version);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserPlanInfoTupleSchemeFactory implements SchemeFactory {
        private UserPlanInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserPlanInfoTupleScheme getScheme() {
            return new UserPlanInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        BOOK_INFO(1, "book_info"),
        PLAN_PROGRESS(2, "plan_progress"),
        PLAN_VERSION(3, "plan_version");

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
                return BOOK_INFO;
            }
            if (fieldId == 2) {
                return PLAN_PROGRESS;
            }
            if (fieldId != 3) {
                return null;
            }
            return PLAN_VERSION;
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
        hashMap.put(StandardScheme.class, new UserPlanInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserPlanInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.BOOK_INFO, (_Fields) new FieldMetaData("book_info", (byte) 1, new StructMetaData((byte) 12, UserBookInfo.class)));
        enumMap.put((EnumMap) _Fields.PLAN_PROGRESS, (_Fields) new FieldMetaData("plan_progress", (byte) 1, new StructMetaData((byte) 12, PlanProgressInfo.class)));
        enumMap.put((EnumMap) _Fields.PLAN_VERSION, (_Fields) new FieldMetaData("plan_version", (byte) 1, new FieldValueMetaData((byte) 10)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserPlanInfo.class, unmodifiableMap);
    }

    public UserPlanInfo() {
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
        this.book_info = null;
        this.plan_progress = null;
        setPlan_versionIsSet(false);
        this.plan_version = 0L;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserPlanInfo)) {
            return equals((UserPlanInfo) that);
        }
        return false;
    }

    public UserBookInfo getBook_info() {
        return this.book_info;
    }

    public PlanProgressInfo getPlan_progress() {
        return this.plan_progress;
    }

    public long getPlan_version() {
        return this.plan_version;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetBook_info() {
        return this.book_info != null;
    }

    public boolean isSetPlan_progress() {
        return this.plan_progress != null;
    }

    public boolean isSetPlan_version() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserPlanInfo setBook_info(UserBookInfo book_info) {
        this.book_info = book_info;
        return this;
    }

    public void setBook_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.book_info = null;
    }

    public UserPlanInfo setPlan_progress(PlanProgressInfo plan_progress) {
        this.plan_progress = plan_progress;
        return this;
    }

    public void setPlan_progressIsSet(boolean value) {
        if (value) {
            return;
        }
        this.plan_progress = null;
    }

    public UserPlanInfo setPlan_version(long plan_version) {
        this.plan_version = plan_version;
        setPlan_versionIsSet(true);
        return this;
    }

    public void setPlan_versionIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserPlanInfo(");
        sb2.append("book_info:");
        UserBookInfo userBookInfo = this.book_info;
        if (userBookInfo == null) {
            sb2.append("null");
        } else {
            sb2.append(userBookInfo);
        }
        sb2.append(j2.O);
        sb2.append("plan_progress:");
        PlanProgressInfo planProgressInfo = this.plan_progress;
        if (planProgressInfo == null) {
            sb2.append("null");
        } else {
            sb2.append(planProgressInfo);
        }
        sb2.append(j2.O);
        sb2.append("plan_version:");
        sb2.append(this.plan_version);
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetBook_info() {
        this.book_info = null;
    }

    public void unsetPlan_progress() {
        this.plan_progress = null;
    }

    public void unsetPlan_version() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void validate() throws TException {
        UserBookInfo userBookInfo = this.book_info;
        if (userBookInfo == null) {
            throw new TProtocolException("Required field 'book_info' was not present! Struct: " + toString());
        }
        if (this.plan_progress == null) {
            throw new TProtocolException("Required field 'plan_progress' was not present! Struct: " + toString());
        }
        if (userBookInfo != null) {
            userBookInfo.validate();
        }
        PlanProgressInfo planProgressInfo = this.plan_progress;
        if (planProgressInfo != null) {
            planProgressInfo.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(UserPlanInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetBook_info()).compareTo(Boolean.valueOf(other.isSetBook_info()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetBook_info() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.book_info, (Comparable) other.book_info)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetPlan_progress()).compareTo(Boolean.valueOf(other.isSetPlan_progress()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetPlan_progress() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.plan_progress, (Comparable) other.plan_progress)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetPlan_version()).compareTo(Boolean.valueOf(other.isSetPlan_version()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetPlan_version() || (compareTo = TBaseHelper.compareTo(this.plan_version, other.plan_version)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserPlanInfo, _Fields> deepCopy2() {
        return new UserPlanInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$UserPlanInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getBook_info();
        }
        if (i11 == 2) {
            return getPlan_progress();
        }
        if (i11 == 3) {
            return Long.valueOf(getPlan_version());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$UserPlanInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetBook_info();
        }
        if (i11 == 2) {
            return isSetPlan_progress();
        }
        if (i11 == 3) {
            return isSetPlan_version();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$UserPlanInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetBook_info();
                return;
            } else {
                setBook_info((UserBookInfo) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetPlan_progress();
                return;
            } else {
                setPlan_progress((PlanProgressInfo) value);
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetPlan_version();
        } else {
            setPlan_version(((Long) value).longValue());
        }
    }

    public UserPlanInfo(UserBookInfo book_info, PlanProgressInfo plan_progress, long plan_version) {
        this();
        this.book_info = book_info;
        this.plan_progress = plan_progress;
        this.plan_version = plan_version;
        setPlan_versionIsSet(true);
    }

    public boolean equals(UserPlanInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetBook_info = isSetBook_info();
        boolean isSetBook_info2 = that.isSetBook_info();
        if ((isSetBook_info || isSetBook_info2) && !(isSetBook_info && isSetBook_info2 && this.book_info.equals(that.book_info))) {
            return false;
        }
        boolean isSetPlan_progress = isSetPlan_progress();
        boolean isSetPlan_progress2 = that.isSetPlan_progress();
        return (!(isSetPlan_progress || isSetPlan_progress2) || (isSetPlan_progress && isSetPlan_progress2 && this.plan_progress.equals(that.plan_progress))) && this.plan_version == that.plan_version;
    }

    public UserPlanInfo(UserPlanInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetBook_info()) {
            this.book_info = new UserBookInfo(other.book_info);
        }
        if (other.isSetPlan_progress()) {
            this.plan_progress = new PlanProgressInfo(other.plan_progress);
        }
        this.plan_version = other.plan_version;
    }
}
