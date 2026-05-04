package com.baicizhan.online.unified_user_service;

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
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class UserProfile implements TBase<UserProfile, _Fields>, Serializable, Cloneable, Comparable<UserProfile> {
    private static final int __GENDER_ID_ISSET_ID = 0;
    private static final int __UNIQUE_ID_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String avatar;
    public int gender_id;
    public String nickname;
    private _Fields[] optionals;
    public long unique_id;
    private static final TStruct STRUCT_DESC = new TStruct("UserProfile");
    private static final TField NICKNAME_FIELD_DESC = new TField("nickname", (byte) 11, 1);
    private static final TField GENDER_ID_FIELD_DESC = new TField("gender_id", (byte) 8, 2);
    private static final TField AVATAR_FIELD_DESC = new TField(q9.h.f81940d, (byte) 11, 3);
    private static final TField UNIQUE_ID_FIELD_DESC = new TField("unique_id", (byte) 10, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.unified_user_service.UserProfile$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$unified_user_service$UserProfile$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$unified_user_service$UserProfile$_Fields = iArr;
            try {
                iArr[_Fields.NICKNAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$UserProfile$_Fields[_Fields.GENDER_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$UserProfile$_Fields[_Fields.AVATAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$UserProfile$_Fields[_Fields.UNIQUE_ID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserProfileStandardScheme extends StandardScheme<UserProfile> {
        private UserProfileStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserProfile struct) throws TException {
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
                                struct.unique_id = iprot.readI64();
                                struct.setUnique_idIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 11) {
                            struct.avatar = iprot.readString();
                            struct.setAvatarIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.gender_id = iprot.readI32();
                        struct.setGender_idIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.nickname = iprot.readString();
                    struct.setNicknameIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetGender_id()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'gender_id' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, UserProfile struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserProfile.STRUCT_DESC);
            if (struct.nickname != null) {
                oprot.writeFieldBegin(UserProfile.NICKNAME_FIELD_DESC);
                oprot.writeString(struct.nickname);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(UserProfile.GENDER_ID_FIELD_DESC);
            oprot.writeI32(struct.gender_id);
            oprot.writeFieldEnd();
            if (struct.avatar != null && struct.isSetAvatar()) {
                oprot.writeFieldBegin(UserProfile.AVATAR_FIELD_DESC);
                oprot.writeString(struct.avatar);
                oprot.writeFieldEnd();
            }
            if (struct.isSetUnique_id()) {
                oprot.writeFieldBegin(UserProfile.UNIQUE_ID_FIELD_DESC);
                oprot.writeI64(struct.unique_id);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserProfileStandardSchemeFactory implements SchemeFactory {
        private UserProfileStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserProfileStandardScheme getScheme() {
            return new UserProfileStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserProfileTupleScheme extends TupleScheme<UserProfile> {
        private UserProfileTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserProfile struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.nickname = tTupleProtocol.readString();
            struct.setNicknameIsSet(true);
            struct.gender_id = tTupleProtocol.readI32();
            struct.setGender_idIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(2);
            if (readBitSet.get(0)) {
                struct.avatar = tTupleProtocol.readString();
                struct.setAvatarIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.unique_id = tTupleProtocol.readI64();
                struct.setUnique_idIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserProfile struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.nickname);
            tTupleProtocol.writeI32(struct.gender_id);
            BitSet bitSet = new BitSet();
            if (struct.isSetAvatar()) {
                bitSet.set(0);
            }
            if (struct.isSetUnique_id()) {
                bitSet.set(1);
            }
            tTupleProtocol.writeBitSet(bitSet, 2);
            if (struct.isSetAvatar()) {
                tTupleProtocol.writeString(struct.avatar);
            }
            if (struct.isSetUnique_id()) {
                tTupleProtocol.writeI64(struct.unique_id);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserProfileTupleSchemeFactory implements SchemeFactory {
        private UserProfileTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserProfileTupleScheme getScheme() {
            return new UserProfileTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        NICKNAME(1, "nickname"),
        GENDER_ID(2, "gender_id"),
        AVATAR(3, q9.h.f81940d),
        UNIQUE_ID(4, "unique_id");

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
                return NICKNAME;
            }
            if (fieldId == 2) {
                return GENDER_ID;
            }
            if (fieldId == 3) {
                return AVATAR;
            }
            if (fieldId != 4) {
                return null;
            }
            return UNIQUE_ID;
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
        hashMap.put(StandardScheme.class, new UserProfileStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserProfileTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.NICKNAME, (_Fields) new FieldMetaData("nickname", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.GENDER_ID, (_Fields) new FieldMetaData("gender_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.AVATAR, (_Fields) new FieldMetaData(q9.h.f81940d, (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.UNIQUE_ID, (_Fields) new FieldMetaData("unique_id", (byte) 2, new FieldValueMetaData((byte) 10)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserProfile.class, unmodifiableMap);
    }

    public UserProfile() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.AVATAR, _Fields.UNIQUE_ID};
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
        this.nickname = null;
        setGender_idIsSet(false);
        this.gender_id = 0;
        this.avatar = null;
        setUnique_idIsSet(false);
        this.unique_id = 0L;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserProfile)) {
            return equals((UserProfile) that);
        }
        return false;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public int getGender_id() {
        return this.gender_id;
    }

    public String getNickname() {
        return this.nickname;
    }

    public long getUnique_id() {
        return this.unique_id;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAvatar() {
        return this.avatar != null;
    }

    public boolean isSetGender_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetNickname() {
        return this.nickname != null;
    }

    public boolean isSetUnique_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserProfile setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }

    public void setAvatarIsSet(boolean value) {
        if (value) {
            return;
        }
        this.avatar = null;
    }

    public UserProfile setGender_id(int gender_id) {
        this.gender_id = gender_id;
        setGender_idIsSet(true);
        return this;
    }

    public void setGender_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public UserProfile setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public void setNicknameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.nickname = null;
    }

    public UserProfile setUnique_id(long unique_id) {
        this.unique_id = unique_id;
        setUnique_idIsSet(true);
        return this;
    }

    public void setUnique_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserProfile(");
        sb2.append("nickname:");
        String str = this.nickname;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("gender_id:");
        sb2.append(this.gender_id);
        if (isSetAvatar()) {
            sb2.append(j2.O);
            sb2.append("avatar:");
            String str2 = this.avatar;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
        }
        if (isSetUnique_id()) {
            sb2.append(j2.O);
            sb2.append("unique_id:");
            sb2.append(this.unique_id);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAvatar() {
        this.avatar = null;
    }

    public void unsetGender_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetNickname() {
        this.nickname = null;
    }

    public void unsetUnique_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void validate() throws TException {
        if (this.nickname != null) {
            return;
        }
        throw new TProtocolException("Required field 'nickname' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(UserProfile other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetNickname()).compareTo(Boolean.valueOf(other.isSetNickname()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetNickname() && (compareTo4 = TBaseHelper.compareTo(this.nickname, other.nickname)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetGender_id()).compareTo(Boolean.valueOf(other.isSetGender_id()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetGender_id() && (compareTo3 = TBaseHelper.compareTo(this.gender_id, other.gender_id)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetAvatar()).compareTo(Boolean.valueOf(other.isSetAvatar()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetAvatar() && (compareTo2 = TBaseHelper.compareTo(this.avatar, other.avatar)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetUnique_id()).compareTo(Boolean.valueOf(other.isSetUnique_id()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetUnique_id() || (compareTo = TBaseHelper.compareTo(this.unique_id, other.unique_id)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserProfile, _Fields> deepCopy2() {
        return new UserProfile(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$UserProfile$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getNickname();
        }
        if (i11 == 2) {
            return Integer.valueOf(getGender_id());
        }
        if (i11 == 3) {
            return getAvatar();
        }
        if (i11 == 4) {
            return Long.valueOf(getUnique_id());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$UserProfile$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetNickname();
        }
        if (i11 == 2) {
            return isSetGender_id();
        }
        if (i11 == 3) {
            return isSetAvatar();
        }
        if (i11 == 4) {
            return isSetUnique_id();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$UserProfile$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetNickname();
                return;
            } else {
                setNickname((String) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetGender_id();
                return;
            } else {
                setGender_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetAvatar();
                return;
            } else {
                setAvatar((String) value);
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetUnique_id();
        } else {
            setUnique_id(((Long) value).longValue());
        }
    }

    public boolean equals(UserProfile that) {
        if (that == null) {
            return false;
        }
        boolean isSetNickname = isSetNickname();
        boolean isSetNickname2 = that.isSetNickname();
        if (((isSetNickname || isSetNickname2) && !(isSetNickname && isSetNickname2 && this.nickname.equals(that.nickname))) || this.gender_id != that.gender_id) {
            return false;
        }
        boolean isSetAvatar = isSetAvatar();
        boolean isSetAvatar2 = that.isSetAvatar();
        if ((isSetAvatar || isSetAvatar2) && !(isSetAvatar && isSetAvatar2 && this.avatar.equals(that.avatar))) {
            return false;
        }
        boolean isSetUnique_id = isSetUnique_id();
        boolean isSetUnique_id2 = that.isSetUnique_id();
        if (isSetUnique_id || isSetUnique_id2) {
            return isSetUnique_id && isSetUnique_id2 && this.unique_id == that.unique_id;
        }
        return true;
    }

    public UserProfile(String nickname, int gender_id) {
        this();
        this.nickname = nickname;
        this.gender_id = gender_id;
        setGender_idIsSet(true);
    }

    public UserProfile(UserProfile other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.AVATAR, _Fields.UNIQUE_ID};
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetNickname()) {
            this.nickname = other.nickname;
        }
        this.gender_id = other.gender_id;
        if (other.isSetAvatar()) {
            this.avatar = other.avatar;
        }
        this.unique_id = other.unique_id;
    }
}
