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
import org.apache.thrift.TBase;
import org.apache.thrift.TBaseHelper;
import org.apache.thrift.TException;
import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.meta_data.FieldMetaData;
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
public class UserBasicInfoPlus implements TBase<UserBasicInfoPlus, _Fields>, Serializable, Cloneable, Comparable<UserBasicInfoPlus> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public ExtraInfo extra_info;
    public UserLearnInfo learn_info;
    public UserLimitInfo limit_info;
    private _Fields[] optionals;
    public UserBasicInfo user_info;
    private static final TStruct STRUCT_DESC = new TStruct("UserBasicInfoPlus");
    private static final TField USER_INFO_FIELD_DESC = new TField(i9.m.f60424b, (byte) 12, 1);
    private static final TField LIMIT_INFO_FIELD_DESC = new TField("limit_info", (byte) 12, 2);
    private static final TField LEARN_INFO_FIELD_DESC = new TField("learn_info", (byte) 12, 3);
    private static final TField EXTRA_INFO_FIELD_DESC = new TField("extra_info", (byte) 12, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.UserBasicInfoPlus$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$UserBasicInfoPlus$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$UserBasicInfoPlus$_Fields = iArr;
            try {
                iArr[_Fields.USER_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserBasicInfoPlus$_Fields[_Fields.LIMIT_INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserBasicInfoPlus$_Fields[_Fields.LEARN_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserBasicInfoPlus$_Fields[_Fields.EXTRA_INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBasicInfoPlusStandardScheme extends StandardScheme<UserBasicInfoPlus> {
        private UserBasicInfoPlusStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserBasicInfoPlus struct) throws TException {
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
                        if (s11 != 3) {
                            if (s11 != 4) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 12) {
                                ExtraInfo extraInfo = new ExtraInfo();
                                struct.extra_info = extraInfo;
                                extraInfo.read(iprot);
                                struct.setExtra_infoIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            UserLearnInfo userLearnInfo = new UserLearnInfo();
                            struct.learn_info = userLearnInfo;
                            userLearnInfo.read(iprot);
                            struct.setLearn_infoIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 12) {
                        UserLimitInfo userLimitInfo = new UserLimitInfo();
                        struct.limit_info = userLimitInfo;
                        userLimitInfo.read(iprot);
                        struct.setLimit_infoIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 12) {
                    UserBasicInfo userBasicInfo = new UserBasicInfo();
                    struct.user_info = userBasicInfo;
                    userBasicInfo.read(iprot);
                    struct.setUser_infoIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, UserBasicInfoPlus struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserBasicInfoPlus.STRUCT_DESC);
            if (struct.user_info != null) {
                oprot.writeFieldBegin(UserBasicInfoPlus.USER_INFO_FIELD_DESC);
                struct.user_info.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.limit_info != null) {
                oprot.writeFieldBegin(UserBasicInfoPlus.LIMIT_INFO_FIELD_DESC);
                struct.limit_info.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.learn_info != null) {
                oprot.writeFieldBegin(UserBasicInfoPlus.LEARN_INFO_FIELD_DESC);
                struct.learn_info.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.extra_info != null && struct.isSetExtra_info()) {
                oprot.writeFieldBegin(UserBasicInfoPlus.EXTRA_INFO_FIELD_DESC);
                struct.extra_info.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBasicInfoPlusStandardSchemeFactory implements SchemeFactory {
        private UserBasicInfoPlusStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserBasicInfoPlusStandardScheme getScheme() {
            return new UserBasicInfoPlusStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBasicInfoPlusTupleScheme extends TupleScheme<UserBasicInfoPlus> {
        private UserBasicInfoPlusTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserBasicInfoPlus struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            UserBasicInfo userBasicInfo = new UserBasicInfo();
            struct.user_info = userBasicInfo;
            userBasicInfo.read(tTupleProtocol);
            struct.setUser_infoIsSet(true);
            UserLimitInfo userLimitInfo = new UserLimitInfo();
            struct.limit_info = userLimitInfo;
            userLimitInfo.read(tTupleProtocol);
            struct.setLimit_infoIsSet(true);
            UserLearnInfo userLearnInfo = new UserLearnInfo();
            struct.learn_info = userLearnInfo;
            userLearnInfo.read(tTupleProtocol);
            struct.setLearn_infoIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                ExtraInfo extraInfo = new ExtraInfo();
                struct.extra_info = extraInfo;
                extraInfo.read(tTupleProtocol);
                struct.setExtra_infoIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserBasicInfoPlus struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.user_info.write(tTupleProtocol);
            struct.limit_info.write(tTupleProtocol);
            struct.learn_info.write(tTupleProtocol);
            BitSet bitSet = new BitSet();
            if (struct.isSetExtra_info()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetExtra_info()) {
                struct.extra_info.write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBasicInfoPlusTupleSchemeFactory implements SchemeFactory {
        private UserBasicInfoPlusTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserBasicInfoPlusTupleScheme getScheme() {
            return new UserBasicInfoPlusTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        USER_INFO(1, i9.m.f60424b),
        LIMIT_INFO(2, "limit_info"),
        LEARN_INFO(3, "learn_info"),
        EXTRA_INFO(4, "extra_info");

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
                return USER_INFO;
            }
            if (fieldId == 2) {
                return LIMIT_INFO;
            }
            if (fieldId == 3) {
                return LEARN_INFO;
            }
            if (fieldId != 4) {
                return null;
            }
            return EXTRA_INFO;
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
        hashMap.put(StandardScheme.class, new UserBasicInfoPlusStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserBasicInfoPlusTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.USER_INFO, (_Fields) new FieldMetaData(i9.m.f60424b, (byte) 1, new StructMetaData((byte) 12, UserBasicInfo.class)));
        enumMap.put((EnumMap) _Fields.LIMIT_INFO, (_Fields) new FieldMetaData("limit_info", (byte) 1, new StructMetaData((byte) 12, UserLimitInfo.class)));
        enumMap.put((EnumMap) _Fields.LEARN_INFO, (_Fields) new FieldMetaData("learn_info", (byte) 1, new StructMetaData((byte) 12, UserLearnInfo.class)));
        enumMap.put((EnumMap) _Fields.EXTRA_INFO, (_Fields) new FieldMetaData("extra_info", (byte) 2, new StructMetaData((byte) 12, ExtraInfo.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserBasicInfoPlus.class, unmodifiableMap);
    }

    public UserBasicInfoPlus() {
        this.optionals = new _Fields[]{_Fields.EXTRA_INFO};
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
        this.user_info = null;
        this.limit_info = null;
        this.learn_info = null;
        this.extra_info = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserBasicInfoPlus)) {
            return equals((UserBasicInfoPlus) that);
        }
        return false;
    }

    public ExtraInfo getExtra_info() {
        return this.extra_info;
    }

    public UserLearnInfo getLearn_info() {
        return this.learn_info;
    }

    public UserLimitInfo getLimit_info() {
        return this.limit_info;
    }

    public UserBasicInfo getUser_info() {
        return this.user_info;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetExtra_info() {
        return this.extra_info != null;
    }

    public boolean isSetLearn_info() {
        return this.learn_info != null;
    }

    public boolean isSetLimit_info() {
        return this.limit_info != null;
    }

    public boolean isSetUser_info() {
        return this.user_info != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserBasicInfoPlus setExtra_info(ExtraInfo extra_info) {
        this.extra_info = extra_info;
        return this;
    }

    public void setExtra_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.extra_info = null;
    }

    public UserBasicInfoPlus setLearn_info(UserLearnInfo learn_info) {
        this.learn_info = learn_info;
        return this;
    }

    public void setLearn_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.learn_info = null;
    }

    public UserBasicInfoPlus setLimit_info(UserLimitInfo limit_info) {
        this.limit_info = limit_info;
        return this;
    }

    public void setLimit_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.limit_info = null;
    }

    public UserBasicInfoPlus setUser_info(UserBasicInfo user_info) {
        this.user_info = user_info;
        return this;
    }

    public void setUser_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.user_info = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserBasicInfoPlus(");
        sb2.append("user_info:");
        UserBasicInfo userBasicInfo = this.user_info;
        if (userBasicInfo == null) {
            sb2.append("null");
        } else {
            sb2.append(userBasicInfo);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("limit_info:");
        UserLimitInfo userLimitInfo = this.limit_info;
        if (userLimitInfo == null) {
            sb2.append("null");
        } else {
            sb2.append(userLimitInfo);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("learn_info:");
        UserLearnInfo userLearnInfo = this.learn_info;
        if (userLearnInfo == null) {
            sb2.append("null");
        } else {
            sb2.append(userLearnInfo);
        }
        if (isSetExtra_info()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("extra_info:");
            ExtraInfo extraInfo = this.extra_info;
            if (extraInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(extraInfo);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetExtra_info() {
        this.extra_info = null;
    }

    public void unsetLearn_info() {
        this.learn_info = null;
    }

    public void unsetLimit_info() {
        this.limit_info = null;
    }

    public void unsetUser_info() {
        this.user_info = null;
    }

    public void validate() throws TException {
        UserBasicInfo userBasicInfo = this.user_info;
        if (userBasicInfo == null) {
            throw new TProtocolException("Required field 'user_info' was not present! Struct: " + toString());
        }
        if (this.limit_info == null) {
            throw new TProtocolException("Required field 'limit_info' was not present! Struct: " + toString());
        }
        if (this.learn_info == null) {
            throw new TProtocolException("Required field 'learn_info' was not present! Struct: " + toString());
        }
        if (userBasicInfo != null) {
            userBasicInfo.validate();
        }
        UserLimitInfo userLimitInfo = this.limit_info;
        if (userLimitInfo != null) {
            userLimitInfo.validate();
        }
        UserLearnInfo userLearnInfo = this.learn_info;
        if (userLearnInfo != null) {
            userLearnInfo.validate();
        }
        ExtraInfo extraInfo = this.extra_info;
        if (extraInfo != null) {
            extraInfo.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(UserBasicInfoPlus other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetUser_info()).compareTo(Boolean.valueOf(other.isSetUser_info()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetUser_info() && (compareTo4 = TBaseHelper.compareTo((Comparable) this.user_info, (Comparable) other.user_info)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetLimit_info()).compareTo(Boolean.valueOf(other.isSetLimit_info()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetLimit_info() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.limit_info, (Comparable) other.limit_info)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetLearn_info()).compareTo(Boolean.valueOf(other.isSetLearn_info()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetLearn_info() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.learn_info, (Comparable) other.learn_info)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetExtra_info()).compareTo(Boolean.valueOf(other.isSetExtra_info()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetExtra_info() || (compareTo = TBaseHelper.compareTo((Comparable) this.extra_info, (Comparable) other.extra_info)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserBasicInfoPlus, _Fields> deepCopy2() {
        return new UserBasicInfoPlus(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserBasicInfoPlus$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getUser_info();
        }
        if (i11 == 2) {
            return getLimit_info();
        }
        if (i11 == 3) {
            return getLearn_info();
        }
        if (i11 == 4) {
            return getExtra_info();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserBasicInfoPlus$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetUser_info();
        }
        if (i11 == 2) {
            return isSetLimit_info();
        }
        if (i11 == 3) {
            return isSetLearn_info();
        }
        if (i11 == 4) {
            return isSetExtra_info();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserBasicInfoPlus$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetUser_info();
                return;
            } else {
                setUser_info((UserBasicInfo) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetLimit_info();
                return;
            } else {
                setLimit_info((UserLimitInfo) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetLearn_info();
                return;
            } else {
                setLearn_info((UserLearnInfo) value);
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetExtra_info();
        } else {
            setExtra_info((ExtraInfo) value);
        }
    }

    public UserBasicInfoPlus(UserBasicInfo user_info, UserLimitInfo limit_info, UserLearnInfo learn_info) {
        this();
        this.user_info = user_info;
        this.limit_info = limit_info;
        this.learn_info = learn_info;
    }

    public boolean equals(UserBasicInfoPlus that) {
        if (that == null) {
            return false;
        }
        boolean isSetUser_info = isSetUser_info();
        boolean isSetUser_info2 = that.isSetUser_info();
        if ((isSetUser_info || isSetUser_info2) && !(isSetUser_info && isSetUser_info2 && this.user_info.equals(that.user_info))) {
            return false;
        }
        boolean isSetLimit_info = isSetLimit_info();
        boolean isSetLimit_info2 = that.isSetLimit_info();
        if ((isSetLimit_info || isSetLimit_info2) && !(isSetLimit_info && isSetLimit_info2 && this.limit_info.equals(that.limit_info))) {
            return false;
        }
        boolean isSetLearn_info = isSetLearn_info();
        boolean isSetLearn_info2 = that.isSetLearn_info();
        if ((isSetLearn_info || isSetLearn_info2) && !(isSetLearn_info && isSetLearn_info2 && this.learn_info.equals(that.learn_info))) {
            return false;
        }
        boolean isSetExtra_info = isSetExtra_info();
        boolean isSetExtra_info2 = that.isSetExtra_info();
        if (isSetExtra_info || isSetExtra_info2) {
            return isSetExtra_info && isSetExtra_info2 && this.extra_info.equals(that.extra_info);
        }
        return true;
    }

    public UserBasicInfoPlus(UserBasicInfoPlus other) {
        this.optionals = new _Fields[]{_Fields.EXTRA_INFO};
        if (other.isSetUser_info()) {
            this.user_info = new UserBasicInfo(other.user_info);
        }
        if (other.isSetLimit_info()) {
            this.limit_info = new UserLimitInfo(other.limit_info);
        }
        if (other.isSetLearn_info()) {
            this.learn_info = new UserLearnInfo(other.learn_info);
        }
        if (other.isSetExtra_info()) {
            this.extra_info = new ExtraInfo(other.extra_info);
        }
    }
}
