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
public class UserBasicInfoV2 implements TBase<UserBasicInfoV2, _Fields>, Serializable, Cloneable, Comparable<UserBasicInfoV2> {
    private static final int __BIRTHDAY_ISSET_ID = 2;
    private static final int __CURRENT_WORD_LEVEL_ID_ISSET_ID = 0;
    private static final int __GENDER_ID_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String avatar;
    public long birthday;
    public String current_book_desc;
    public String current_book_desc_img;
    public int current_word_level_id;
    public String current_word_level_name;
    public int gender_id;
    public String ip_desc;
    public MemberInfo member;
    public String nickname;
    private _Fields[] optionals;
    public String position;
    public RoleInfo role;
    public EducationInfo user_education_info;
    private static final TStruct STRUCT_DESC = new TStruct("UserBasicInfoV2");
    private static final TField CURRENT_WORD_LEVEL_ID_FIELD_DESC = new TField("current_word_level_id", (byte) 8, 1);
    private static final TField CURRENT_WORD_LEVEL_NAME_FIELD_DESC = new TField("current_word_level_name", (byte) 11, 2);
    private static final TField GENDER_ID_FIELD_DESC = new TField("gender_id", (byte) 8, 3);
    private static final TField NICKNAME_FIELD_DESC = new TField("nickname", (byte) 11, 4);
    private static final TField AVATAR_FIELD_DESC = new TField(q9.h.f81940d, (byte) 11, 5);
    private static final TField BIRTHDAY_FIELD_DESC = new TField("birthday", (byte) 10, 6);
    private static final TField POSITION_FIELD_DESC = new TField("position", (byte) 11, 7);
    private static final TField USER_EDUCATION_INFO_FIELD_DESC = new TField("user_education_info", (byte) 12, 8);
    private static final TField CURRENT_BOOK_DESC_FIELD_DESC = new TField("current_book_desc", (byte) 11, 9);
    private static final TField CURRENT_BOOK_DESC_IMG_FIELD_DESC = new TField("current_book_desc_img", (byte) 11, 10);
    private static final TField ROLE_FIELD_DESC = new TField("role", (byte) 12, 11);
    private static final TField IP_DESC_FIELD_DESC = new TField("ip_desc", (byte) 11, 12);
    private static final TField MEMBER_FIELD_DESC = new TField("member", (byte) 12, 13);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.UserBasicInfoV2$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$UserBasicInfoV2$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$UserBasicInfoV2$_Fields = iArr;
            try {
                iArr[_Fields.CURRENT_WORD_LEVEL_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserBasicInfoV2$_Fields[_Fields.CURRENT_WORD_LEVEL_NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserBasicInfoV2$_Fields[_Fields.GENDER_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserBasicInfoV2$_Fields[_Fields.NICKNAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserBasicInfoV2$_Fields[_Fields.AVATAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserBasicInfoV2$_Fields[_Fields.BIRTHDAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserBasicInfoV2$_Fields[_Fields.POSITION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserBasicInfoV2$_Fields[_Fields.USER_EDUCATION_INFO.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserBasicInfoV2$_Fields[_Fields.CURRENT_BOOK_DESC.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserBasicInfoV2$_Fields[_Fields.CURRENT_BOOK_DESC_IMG.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserBasicInfoV2$_Fields[_Fields.ROLE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserBasicInfoV2$_Fields[_Fields.IP_DESC.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserBasicInfoV2$_Fields[_Fields.MEMBER.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBasicInfoV2StandardScheme extends StandardScheme<UserBasicInfoV2> {
        private UserBasicInfoV2StandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserBasicInfoV2 struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetCurrent_word_level_id()) {
                        throw new TProtocolException("Required field 'current_word_level_id' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetGender_id()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'gender_id' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.current_word_level_id = iprot.readI32();
                            struct.setCurrent_word_level_idIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.current_word_level_name = iprot.readString();
                            struct.setCurrent_word_level_nameIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.gender_id = iprot.readI32();
                            struct.setGender_idIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.nickname = iprot.readString();
                            struct.setNicknameIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.avatar = iprot.readString();
                            struct.setAvatarIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.birthday = iprot.readI64();
                            struct.setBirthdayIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.position = iprot.readString();
                            struct.setPositionIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            EducationInfo educationInfo = new EducationInfo();
                            struct.user_education_info = educationInfo;
                            educationInfo.read(iprot);
                            struct.setUser_education_infoIsSet(true);
                            break;
                        }
                    case 9:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.current_book_desc = iprot.readString();
                            struct.setCurrent_book_descIsSet(true);
                            break;
                        }
                    case 10:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.current_book_desc_img = iprot.readString();
                            struct.setCurrent_book_desc_imgIsSet(true);
                            break;
                        }
                    case 11:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            RoleInfo roleInfo = new RoleInfo();
                            struct.role = roleInfo;
                            roleInfo.read(iprot);
                            struct.setRoleIsSet(true);
                            break;
                        }
                    case 12:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.ip_desc = iprot.readString();
                            struct.setIp_descIsSet(true);
                            break;
                        }
                    case 13:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            MemberInfo memberInfo = new MemberInfo();
                            struct.member = memberInfo;
                            memberInfo.read(iprot);
                            struct.setMemberIsSet(true);
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
        public void write(TProtocol oprot, UserBasicInfoV2 struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserBasicInfoV2.STRUCT_DESC);
            oprot.writeFieldBegin(UserBasicInfoV2.CURRENT_WORD_LEVEL_ID_FIELD_DESC);
            oprot.writeI32(struct.current_word_level_id);
            oprot.writeFieldEnd();
            if (struct.current_word_level_name != null) {
                oprot.writeFieldBegin(UserBasicInfoV2.CURRENT_WORD_LEVEL_NAME_FIELD_DESC);
                oprot.writeString(struct.current_word_level_name);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(UserBasicInfoV2.GENDER_ID_FIELD_DESC);
            oprot.writeI32(struct.gender_id);
            oprot.writeFieldEnd();
            if (struct.nickname != null) {
                oprot.writeFieldBegin(UserBasicInfoV2.NICKNAME_FIELD_DESC);
                oprot.writeString(struct.nickname);
                oprot.writeFieldEnd();
            }
            if (struct.avatar != null && struct.isSetAvatar()) {
                oprot.writeFieldBegin(UserBasicInfoV2.AVATAR_FIELD_DESC);
                oprot.writeString(struct.avatar);
                oprot.writeFieldEnd();
            }
            if (struct.isSetBirthday()) {
                oprot.writeFieldBegin(UserBasicInfoV2.BIRTHDAY_FIELD_DESC);
                oprot.writeI64(struct.birthday);
                oprot.writeFieldEnd();
            }
            if (struct.position != null && struct.isSetPosition()) {
                oprot.writeFieldBegin(UserBasicInfoV2.POSITION_FIELD_DESC);
                oprot.writeString(struct.position);
                oprot.writeFieldEnd();
            }
            if (struct.user_education_info != null && struct.isSetUser_education_info()) {
                oprot.writeFieldBegin(UserBasicInfoV2.USER_EDUCATION_INFO_FIELD_DESC);
                struct.user_education_info.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.current_book_desc != null && struct.isSetCurrent_book_desc()) {
                oprot.writeFieldBegin(UserBasicInfoV2.CURRENT_BOOK_DESC_FIELD_DESC);
                oprot.writeString(struct.current_book_desc);
                oprot.writeFieldEnd();
            }
            if (struct.current_book_desc_img != null && struct.isSetCurrent_book_desc_img()) {
                oprot.writeFieldBegin(UserBasicInfoV2.CURRENT_BOOK_DESC_IMG_FIELD_DESC);
                oprot.writeString(struct.current_book_desc_img);
                oprot.writeFieldEnd();
            }
            if (struct.role != null && struct.isSetRole()) {
                oprot.writeFieldBegin(UserBasicInfoV2.ROLE_FIELD_DESC);
                struct.role.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.ip_desc != null && struct.isSetIp_desc()) {
                oprot.writeFieldBegin(UserBasicInfoV2.IP_DESC_FIELD_DESC);
                oprot.writeString(struct.ip_desc);
                oprot.writeFieldEnd();
            }
            if (struct.member != null && struct.isSetMember()) {
                oprot.writeFieldBegin(UserBasicInfoV2.MEMBER_FIELD_DESC);
                struct.member.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBasicInfoV2StandardSchemeFactory implements SchemeFactory {
        private UserBasicInfoV2StandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserBasicInfoV2StandardScheme getScheme() {
            return new UserBasicInfoV2StandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBasicInfoV2TupleScheme extends TupleScheme<UserBasicInfoV2> {
        private UserBasicInfoV2TupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserBasicInfoV2 struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.current_word_level_id = tTupleProtocol.readI32();
            struct.setCurrent_word_level_idIsSet(true);
            struct.current_word_level_name = tTupleProtocol.readString();
            struct.setCurrent_word_level_nameIsSet(true);
            struct.gender_id = tTupleProtocol.readI32();
            struct.setGender_idIsSet(true);
            struct.nickname = tTupleProtocol.readString();
            struct.setNicknameIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(9);
            if (readBitSet.get(0)) {
                struct.avatar = tTupleProtocol.readString();
                struct.setAvatarIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.birthday = tTupleProtocol.readI64();
                struct.setBirthdayIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.position = tTupleProtocol.readString();
                struct.setPositionIsSet(true);
            }
            if (readBitSet.get(3)) {
                EducationInfo educationInfo = new EducationInfo();
                struct.user_education_info = educationInfo;
                educationInfo.read(tTupleProtocol);
                struct.setUser_education_infoIsSet(true);
            }
            if (readBitSet.get(4)) {
                struct.current_book_desc = tTupleProtocol.readString();
                struct.setCurrent_book_descIsSet(true);
            }
            if (readBitSet.get(5)) {
                struct.current_book_desc_img = tTupleProtocol.readString();
                struct.setCurrent_book_desc_imgIsSet(true);
            }
            if (readBitSet.get(6)) {
                RoleInfo roleInfo = new RoleInfo();
                struct.role = roleInfo;
                roleInfo.read(tTupleProtocol);
                struct.setRoleIsSet(true);
            }
            if (readBitSet.get(7)) {
                struct.ip_desc = tTupleProtocol.readString();
                struct.setIp_descIsSet(true);
            }
            if (readBitSet.get(8)) {
                MemberInfo memberInfo = new MemberInfo();
                struct.member = memberInfo;
                memberInfo.read(tTupleProtocol);
                struct.setMemberIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserBasicInfoV2 struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.current_word_level_id);
            tTupleProtocol.writeString(struct.current_word_level_name);
            tTupleProtocol.writeI32(struct.gender_id);
            tTupleProtocol.writeString(struct.nickname);
            BitSet bitSet = new BitSet();
            if (struct.isSetAvatar()) {
                bitSet.set(0);
            }
            if (struct.isSetBirthday()) {
                bitSet.set(1);
            }
            if (struct.isSetPosition()) {
                bitSet.set(2);
            }
            if (struct.isSetUser_education_info()) {
                bitSet.set(3);
            }
            if (struct.isSetCurrent_book_desc()) {
                bitSet.set(4);
            }
            if (struct.isSetCurrent_book_desc_img()) {
                bitSet.set(5);
            }
            if (struct.isSetRole()) {
                bitSet.set(6);
            }
            if (struct.isSetIp_desc()) {
                bitSet.set(7);
            }
            if (struct.isSetMember()) {
                bitSet.set(8);
            }
            tTupleProtocol.writeBitSet(bitSet, 9);
            if (struct.isSetAvatar()) {
                tTupleProtocol.writeString(struct.avatar);
            }
            if (struct.isSetBirthday()) {
                tTupleProtocol.writeI64(struct.birthday);
            }
            if (struct.isSetPosition()) {
                tTupleProtocol.writeString(struct.position);
            }
            if (struct.isSetUser_education_info()) {
                struct.user_education_info.write(tTupleProtocol);
            }
            if (struct.isSetCurrent_book_desc()) {
                tTupleProtocol.writeString(struct.current_book_desc);
            }
            if (struct.isSetCurrent_book_desc_img()) {
                tTupleProtocol.writeString(struct.current_book_desc_img);
            }
            if (struct.isSetRole()) {
                struct.role.write(tTupleProtocol);
            }
            if (struct.isSetIp_desc()) {
                tTupleProtocol.writeString(struct.ip_desc);
            }
            if (struct.isSetMember()) {
                struct.member.write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBasicInfoV2TupleSchemeFactory implements SchemeFactory {
        private UserBasicInfoV2TupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserBasicInfoV2TupleScheme getScheme() {
            return new UserBasicInfoV2TupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        CURRENT_WORD_LEVEL_ID(1, "current_word_level_id"),
        CURRENT_WORD_LEVEL_NAME(2, "current_word_level_name"),
        GENDER_ID(3, "gender_id"),
        NICKNAME(4, "nickname"),
        AVATAR(5, q9.h.f81940d),
        BIRTHDAY(6, "birthday"),
        POSITION(7, "position"),
        USER_EDUCATION_INFO(8, "user_education_info"),
        CURRENT_BOOK_DESC(9, "current_book_desc"),
        CURRENT_BOOK_DESC_IMG(10, "current_book_desc_img"),
        ROLE(11, "role"),
        IP_DESC(12, "ip_desc"),
        MEMBER(13, "member");

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
                    return CURRENT_WORD_LEVEL_ID;
                case 2:
                    return CURRENT_WORD_LEVEL_NAME;
                case 3:
                    return GENDER_ID;
                case 4:
                    return NICKNAME;
                case 5:
                    return AVATAR;
                case 6:
                    return BIRTHDAY;
                case 7:
                    return POSITION;
                case 8:
                    return USER_EDUCATION_INFO;
                case 9:
                    return CURRENT_BOOK_DESC;
                case 10:
                    return CURRENT_BOOK_DESC_IMG;
                case 11:
                    return ROLE;
                case 12:
                    return IP_DESC;
                case 13:
                    return MEMBER;
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
        hashMap.put(StandardScheme.class, new UserBasicInfoV2StandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserBasicInfoV2TupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.CURRENT_WORD_LEVEL_ID, (_Fields) new FieldMetaData("current_word_level_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.CURRENT_WORD_LEVEL_NAME, (_Fields) new FieldMetaData("current_word_level_name", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.GENDER_ID, (_Fields) new FieldMetaData("gender_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.NICKNAME, (_Fields) new FieldMetaData("nickname", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.AVATAR, (_Fields) new FieldMetaData(q9.h.f81940d, (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.BIRTHDAY, (_Fields) new FieldMetaData("birthday", (byte) 2, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.POSITION, (_Fields) new FieldMetaData("position", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.USER_EDUCATION_INFO, (_Fields) new FieldMetaData("user_education_info", (byte) 2, new StructMetaData((byte) 12, EducationInfo.class)));
        enumMap.put((EnumMap) _Fields.CURRENT_BOOK_DESC, (_Fields) new FieldMetaData("current_book_desc", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.CURRENT_BOOK_DESC_IMG, (_Fields) new FieldMetaData("current_book_desc_img", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ROLE, (_Fields) new FieldMetaData("role", (byte) 2, new StructMetaData((byte) 12, RoleInfo.class)));
        enumMap.put((EnumMap) _Fields.IP_DESC, (_Fields) new FieldMetaData("ip_desc", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.MEMBER, (_Fields) new FieldMetaData("member", (byte) 2, new StructMetaData((byte) 12, MemberInfo.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserBasicInfoV2.class, unmodifiableMap);
    }

    public UserBasicInfoV2() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.AVATAR, _Fields.BIRTHDAY, _Fields.POSITION, _Fields.USER_EDUCATION_INFO, _Fields.CURRENT_BOOK_DESC, _Fields.CURRENT_BOOK_DESC_IMG, _Fields.ROLE, _Fields.IP_DESC, _Fields.MEMBER};
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
        setCurrent_word_level_idIsSet(false);
        this.current_word_level_id = 0;
        this.current_word_level_name = null;
        setGender_idIsSet(false);
        this.gender_id = 0;
        this.nickname = null;
        this.avatar = null;
        setBirthdayIsSet(false);
        this.birthday = 0L;
        this.position = null;
        this.user_education_info = null;
        this.current_book_desc = null;
        this.current_book_desc_img = null;
        this.role = null;
        this.ip_desc = null;
        this.member = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserBasicInfoV2)) {
            return equals((UserBasicInfoV2) that);
        }
        return false;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public long getBirthday() {
        return this.birthday;
    }

    public String getCurrent_book_desc() {
        return this.current_book_desc;
    }

    public String getCurrent_book_desc_img() {
        return this.current_book_desc_img;
    }

    public int getCurrent_word_level_id() {
        return this.current_word_level_id;
    }

    public String getCurrent_word_level_name() {
        return this.current_word_level_name;
    }

    public int getGender_id() {
        return this.gender_id;
    }

    public String getIp_desc() {
        return this.ip_desc;
    }

    public MemberInfo getMember() {
        return this.member;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getPosition() {
        return this.position;
    }

    public RoleInfo getRole() {
        return this.role;
    }

    public EducationInfo getUser_education_info() {
        return this.user_education_info;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAvatar() {
        return this.avatar != null;
    }

    public boolean isSetBirthday() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetCurrent_book_desc() {
        return this.current_book_desc != null;
    }

    public boolean isSetCurrent_book_desc_img() {
        return this.current_book_desc_img != null;
    }

    public boolean isSetCurrent_word_level_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetCurrent_word_level_name() {
        return this.current_word_level_name != null;
    }

    public boolean isSetGender_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetIp_desc() {
        return this.ip_desc != null;
    }

    public boolean isSetMember() {
        return this.member != null;
    }

    public boolean isSetNickname() {
        return this.nickname != null;
    }

    public boolean isSetPosition() {
        return this.position != null;
    }

    public boolean isSetRole() {
        return this.role != null;
    }

    public boolean isSetUser_education_info() {
        return this.user_education_info != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserBasicInfoV2 setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }

    public void setAvatarIsSet(boolean value) {
        if (value) {
            return;
        }
        this.avatar = null;
    }

    public UserBasicInfoV2 setBirthday(long birthday) {
        this.birthday = birthday;
        setBirthdayIsSet(true);
        return this;
    }

    public void setBirthdayIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public UserBasicInfoV2 setCurrent_book_desc(String current_book_desc) {
        this.current_book_desc = current_book_desc;
        return this;
    }

    public void setCurrent_book_descIsSet(boolean value) {
        if (value) {
            return;
        }
        this.current_book_desc = null;
    }

    public UserBasicInfoV2 setCurrent_book_desc_img(String current_book_desc_img) {
        this.current_book_desc_img = current_book_desc_img;
        return this;
    }

    public void setCurrent_book_desc_imgIsSet(boolean value) {
        if (value) {
            return;
        }
        this.current_book_desc_img = null;
    }

    public UserBasicInfoV2 setCurrent_word_level_id(int current_word_level_id) {
        this.current_word_level_id = current_word_level_id;
        setCurrent_word_level_idIsSet(true);
        return this;
    }

    public void setCurrent_word_level_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public UserBasicInfoV2 setCurrent_word_level_name(String current_word_level_name) {
        this.current_word_level_name = current_word_level_name;
        return this;
    }

    public void setCurrent_word_level_nameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.current_word_level_name = null;
    }

    public UserBasicInfoV2 setGender_id(int gender_id) {
        this.gender_id = gender_id;
        setGender_idIsSet(true);
        return this;
    }

    public void setGender_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public UserBasicInfoV2 setIp_desc(String ip_desc) {
        this.ip_desc = ip_desc;
        return this;
    }

    public void setIp_descIsSet(boolean value) {
        if (value) {
            return;
        }
        this.ip_desc = null;
    }

    public UserBasicInfoV2 setMember(MemberInfo member) {
        this.member = member;
        return this;
    }

    public void setMemberIsSet(boolean value) {
        if (value) {
            return;
        }
        this.member = null;
    }

    public UserBasicInfoV2 setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public void setNicknameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.nickname = null;
    }

    public UserBasicInfoV2 setPosition(String position) {
        this.position = position;
        return this;
    }

    public void setPositionIsSet(boolean value) {
        if (value) {
            return;
        }
        this.position = null;
    }

    public UserBasicInfoV2 setRole(RoleInfo role) {
        this.role = role;
        return this;
    }

    public void setRoleIsSet(boolean value) {
        if (value) {
            return;
        }
        this.role = null;
    }

    public UserBasicInfoV2 setUser_education_info(EducationInfo user_education_info) {
        this.user_education_info = user_education_info;
        return this;
    }

    public void setUser_education_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.user_education_info = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserBasicInfoV2(");
        sb2.append("current_word_level_id:");
        sb2.append(this.current_word_level_id);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("current_word_level_name:");
        String str = this.current_word_level_name;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("gender_id:");
        sb2.append(this.gender_id);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("nickname:");
        String str2 = this.nickname;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        if (isSetAvatar()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("avatar:");
            String str3 = this.avatar;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
        }
        if (isSetBirthday()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("birthday:");
            sb2.append(this.birthday);
        }
        if (isSetPosition()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("position:");
            String str4 = this.position;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (isSetUser_education_info()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("user_education_info:");
            EducationInfo educationInfo = this.user_education_info;
            if (educationInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(educationInfo);
            }
        }
        if (isSetCurrent_book_desc()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("current_book_desc:");
            String str5 = this.current_book_desc;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        if (isSetCurrent_book_desc_img()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("current_book_desc_img:");
            String str6 = this.current_book_desc_img;
            if (str6 == null) {
                sb2.append("null");
            } else {
                sb2.append(str6);
            }
        }
        if (isSetRole()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("role:");
            RoleInfo roleInfo = this.role;
            if (roleInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(roleInfo);
            }
        }
        if (isSetIp_desc()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("ip_desc:");
            String str7 = this.ip_desc;
            if (str7 == null) {
                sb2.append("null");
            } else {
                sb2.append(str7);
            }
        }
        if (isSetMember()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("member:");
            MemberInfo memberInfo = this.member;
            if (memberInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(memberInfo);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAvatar() {
        this.avatar = null;
    }

    public void unsetBirthday() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetCurrent_book_desc() {
        this.current_book_desc = null;
    }

    public void unsetCurrent_book_desc_img() {
        this.current_book_desc_img = null;
    }

    public void unsetCurrent_word_level_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetCurrent_word_level_name() {
        this.current_word_level_name = null;
    }

    public void unsetGender_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetIp_desc() {
        this.ip_desc = null;
    }

    public void unsetMember() {
        this.member = null;
    }

    public void unsetNickname() {
        this.nickname = null;
    }

    public void unsetPosition() {
        this.position = null;
    }

    public void unsetRole() {
        this.role = null;
    }

    public void unsetUser_education_info() {
        this.user_education_info = null;
    }

    public void validate() throws TException {
        if (this.current_word_level_name == null) {
            throw new TProtocolException("Required field 'current_word_level_name' was not present! Struct: " + toString());
        }
        if (this.nickname == null) {
            throw new TProtocolException("Required field 'nickname' was not present! Struct: " + toString());
        }
        EducationInfo educationInfo = this.user_education_info;
        if (educationInfo != null) {
            educationInfo.validate();
        }
        RoleInfo roleInfo = this.role;
        if (roleInfo != null) {
            roleInfo.validate();
        }
        MemberInfo memberInfo = this.member;
        if (memberInfo != null) {
            memberInfo.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(UserBasicInfoV2 other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        int compareTo7;
        int compareTo8;
        int compareTo9;
        int compareTo10;
        int compareTo11;
        int compareTo12;
        int compareTo13;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo14 = Boolean.valueOf(isSetCurrent_word_level_id()).compareTo(Boolean.valueOf(other.isSetCurrent_word_level_id()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (isSetCurrent_word_level_id() && (compareTo13 = TBaseHelper.compareTo(this.current_word_level_id, other.current_word_level_id)) != 0) {
            return compareTo13;
        }
        int compareTo15 = Boolean.valueOf(isSetCurrent_word_level_name()).compareTo(Boolean.valueOf(other.isSetCurrent_word_level_name()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (isSetCurrent_word_level_name() && (compareTo12 = TBaseHelper.compareTo(this.current_word_level_name, other.current_word_level_name)) != 0) {
            return compareTo12;
        }
        int compareTo16 = Boolean.valueOf(isSetGender_id()).compareTo(Boolean.valueOf(other.isSetGender_id()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (isSetGender_id() && (compareTo11 = TBaseHelper.compareTo(this.gender_id, other.gender_id)) != 0) {
            return compareTo11;
        }
        int compareTo17 = Boolean.valueOf(isSetNickname()).compareTo(Boolean.valueOf(other.isSetNickname()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (isSetNickname() && (compareTo10 = TBaseHelper.compareTo(this.nickname, other.nickname)) != 0) {
            return compareTo10;
        }
        int compareTo18 = Boolean.valueOf(isSetAvatar()).compareTo(Boolean.valueOf(other.isSetAvatar()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (isSetAvatar() && (compareTo9 = TBaseHelper.compareTo(this.avatar, other.avatar)) != 0) {
            return compareTo9;
        }
        int compareTo19 = Boolean.valueOf(isSetBirthday()).compareTo(Boolean.valueOf(other.isSetBirthday()));
        if (compareTo19 != 0) {
            return compareTo19;
        }
        if (isSetBirthday() && (compareTo8 = TBaseHelper.compareTo(this.birthday, other.birthday)) != 0) {
            return compareTo8;
        }
        int compareTo20 = Boolean.valueOf(isSetPosition()).compareTo(Boolean.valueOf(other.isSetPosition()));
        if (compareTo20 != 0) {
            return compareTo20;
        }
        if (isSetPosition() && (compareTo7 = TBaseHelper.compareTo(this.position, other.position)) != 0) {
            return compareTo7;
        }
        int compareTo21 = Boolean.valueOf(isSetUser_education_info()).compareTo(Boolean.valueOf(other.isSetUser_education_info()));
        if (compareTo21 != 0) {
            return compareTo21;
        }
        if (isSetUser_education_info() && (compareTo6 = TBaseHelper.compareTo((Comparable) this.user_education_info, (Comparable) other.user_education_info)) != 0) {
            return compareTo6;
        }
        int compareTo22 = Boolean.valueOf(isSetCurrent_book_desc()).compareTo(Boolean.valueOf(other.isSetCurrent_book_desc()));
        if (compareTo22 != 0) {
            return compareTo22;
        }
        if (isSetCurrent_book_desc() && (compareTo5 = TBaseHelper.compareTo(this.current_book_desc, other.current_book_desc)) != 0) {
            return compareTo5;
        }
        int compareTo23 = Boolean.valueOf(isSetCurrent_book_desc_img()).compareTo(Boolean.valueOf(other.isSetCurrent_book_desc_img()));
        if (compareTo23 != 0) {
            return compareTo23;
        }
        if (isSetCurrent_book_desc_img() && (compareTo4 = TBaseHelper.compareTo(this.current_book_desc_img, other.current_book_desc_img)) != 0) {
            return compareTo4;
        }
        int compareTo24 = Boolean.valueOf(isSetRole()).compareTo(Boolean.valueOf(other.isSetRole()));
        if (compareTo24 != 0) {
            return compareTo24;
        }
        if (isSetRole() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.role, (Comparable) other.role)) != 0) {
            return compareTo3;
        }
        int compareTo25 = Boolean.valueOf(isSetIp_desc()).compareTo(Boolean.valueOf(other.isSetIp_desc()));
        if (compareTo25 != 0) {
            return compareTo25;
        }
        if (isSetIp_desc() && (compareTo2 = TBaseHelper.compareTo(this.ip_desc, other.ip_desc)) != 0) {
            return compareTo2;
        }
        int compareTo26 = Boolean.valueOf(isSetMember()).compareTo(Boolean.valueOf(other.isSetMember()));
        if (compareTo26 != 0) {
            return compareTo26;
        }
        if (!isSetMember() || (compareTo = TBaseHelper.compareTo((Comparable) this.member, (Comparable) other.member)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserBasicInfoV2, _Fields> deepCopy2() {
        return new UserBasicInfoV2(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserBasicInfoV2$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getCurrent_word_level_id());
            case 2:
                return getCurrent_word_level_name();
            case 3:
                return Integer.valueOf(getGender_id());
            case 4:
                return getNickname();
            case 5:
                return getAvatar();
            case 6:
                return Long.valueOf(getBirthday());
            case 7:
                return getPosition();
            case 8:
                return getUser_education_info();
            case 9:
                return getCurrent_book_desc();
            case 10:
                return getCurrent_book_desc_img();
            case 11:
                return getRole();
            case 12:
                return getIp_desc();
            case 13:
                return getMember();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserBasicInfoV2$_Fields[field.ordinal()]) {
            case 1:
                return isSetCurrent_word_level_id();
            case 2:
                return isSetCurrent_word_level_name();
            case 3:
                return isSetGender_id();
            case 4:
                return isSetNickname();
            case 5:
                return isSetAvatar();
            case 6:
                return isSetBirthday();
            case 7:
                return isSetPosition();
            case 8:
                return isSetUser_education_info();
            case 9:
                return isSetCurrent_book_desc();
            case 10:
                return isSetCurrent_book_desc_img();
            case 11:
                return isSetRole();
            case 12:
                return isSetIp_desc();
            case 13:
                return isSetMember();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserBasicInfoV2$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setCurrent_word_level_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetCurrent_word_level_id();
                    break;
                }
            case 2:
                if (value != null) {
                    setCurrent_word_level_name((String) value);
                    break;
                } else {
                    unsetCurrent_word_level_name();
                    break;
                }
            case 3:
                if (value != null) {
                    setGender_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetGender_id();
                    break;
                }
            case 4:
                if (value != null) {
                    setNickname((String) value);
                    break;
                } else {
                    unsetNickname();
                    break;
                }
            case 5:
                if (value != null) {
                    setAvatar((String) value);
                    break;
                } else {
                    unsetAvatar();
                    break;
                }
            case 6:
                if (value != null) {
                    setBirthday(((Long) value).longValue());
                    break;
                } else {
                    unsetBirthday();
                    break;
                }
            case 7:
                if (value != null) {
                    setPosition((String) value);
                    break;
                } else {
                    unsetPosition();
                    break;
                }
            case 8:
                if (value != null) {
                    setUser_education_info((EducationInfo) value);
                    break;
                } else {
                    unsetUser_education_info();
                    break;
                }
            case 9:
                if (value != null) {
                    setCurrent_book_desc((String) value);
                    break;
                } else {
                    unsetCurrent_book_desc();
                    break;
                }
            case 10:
                if (value != null) {
                    setCurrent_book_desc_img((String) value);
                    break;
                } else {
                    unsetCurrent_book_desc_img();
                    break;
                }
            case 11:
                if (value != null) {
                    setRole((RoleInfo) value);
                    break;
                } else {
                    unsetRole();
                    break;
                }
            case 12:
                if (value != null) {
                    setIp_desc((String) value);
                    break;
                } else {
                    unsetIp_desc();
                    break;
                }
            case 13:
                if (value != null) {
                    setMember((MemberInfo) value);
                    break;
                } else {
                    unsetMember();
                    break;
                }
        }
    }

    public boolean equals(UserBasicInfoV2 that) {
        if (that == null || this.current_word_level_id != that.current_word_level_id) {
            return false;
        }
        boolean isSetCurrent_word_level_name = isSetCurrent_word_level_name();
        boolean isSetCurrent_word_level_name2 = that.isSetCurrent_word_level_name();
        if (((isSetCurrent_word_level_name || isSetCurrent_word_level_name2) && !(isSetCurrent_word_level_name && isSetCurrent_word_level_name2 && this.current_word_level_name.equals(that.current_word_level_name))) || this.gender_id != that.gender_id) {
            return false;
        }
        boolean isSetNickname = isSetNickname();
        boolean isSetNickname2 = that.isSetNickname();
        if ((isSetNickname || isSetNickname2) && !(isSetNickname && isSetNickname2 && this.nickname.equals(that.nickname))) {
            return false;
        }
        boolean isSetAvatar = isSetAvatar();
        boolean isSetAvatar2 = that.isSetAvatar();
        if ((isSetAvatar || isSetAvatar2) && !(isSetAvatar && isSetAvatar2 && this.avatar.equals(that.avatar))) {
            return false;
        }
        boolean isSetBirthday = isSetBirthday();
        boolean isSetBirthday2 = that.isSetBirthday();
        if ((isSetBirthday || isSetBirthday2) && !(isSetBirthday && isSetBirthday2 && this.birthday == that.birthday)) {
            return false;
        }
        boolean isSetPosition = isSetPosition();
        boolean isSetPosition2 = that.isSetPosition();
        if ((isSetPosition || isSetPosition2) && !(isSetPosition && isSetPosition2 && this.position.equals(that.position))) {
            return false;
        }
        boolean isSetUser_education_info = isSetUser_education_info();
        boolean isSetUser_education_info2 = that.isSetUser_education_info();
        if ((isSetUser_education_info || isSetUser_education_info2) && !(isSetUser_education_info && isSetUser_education_info2 && this.user_education_info.equals(that.user_education_info))) {
            return false;
        }
        boolean isSetCurrent_book_desc = isSetCurrent_book_desc();
        boolean isSetCurrent_book_desc2 = that.isSetCurrent_book_desc();
        if ((isSetCurrent_book_desc || isSetCurrent_book_desc2) && !(isSetCurrent_book_desc && isSetCurrent_book_desc2 && this.current_book_desc.equals(that.current_book_desc))) {
            return false;
        }
        boolean isSetCurrent_book_desc_img = isSetCurrent_book_desc_img();
        boolean isSetCurrent_book_desc_img2 = that.isSetCurrent_book_desc_img();
        if ((isSetCurrent_book_desc_img || isSetCurrent_book_desc_img2) && !(isSetCurrent_book_desc_img && isSetCurrent_book_desc_img2 && this.current_book_desc_img.equals(that.current_book_desc_img))) {
            return false;
        }
        boolean isSetRole = isSetRole();
        boolean isSetRole2 = that.isSetRole();
        if ((isSetRole || isSetRole2) && !(isSetRole && isSetRole2 && this.role.equals(that.role))) {
            return false;
        }
        boolean isSetIp_desc = isSetIp_desc();
        boolean isSetIp_desc2 = that.isSetIp_desc();
        if ((isSetIp_desc || isSetIp_desc2) && !(isSetIp_desc && isSetIp_desc2 && this.ip_desc.equals(that.ip_desc))) {
            return false;
        }
        boolean isSetMember = isSetMember();
        boolean isSetMember2 = that.isSetMember();
        if (isSetMember || isSetMember2) {
            return isSetMember && isSetMember2 && this.member.equals(that.member);
        }
        return true;
    }

    public UserBasicInfoV2(int current_word_level_id, String current_word_level_name, int gender_id, String nickname) {
        this();
        this.current_word_level_id = current_word_level_id;
        setCurrent_word_level_idIsSet(true);
        this.current_word_level_name = current_word_level_name;
        this.gender_id = gender_id;
        setGender_idIsSet(true);
        this.nickname = nickname;
    }

    public UserBasicInfoV2(UserBasicInfoV2 other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.AVATAR, _Fields.BIRTHDAY, _Fields.POSITION, _Fields.USER_EDUCATION_INFO, _Fields.CURRENT_BOOK_DESC, _Fields.CURRENT_BOOK_DESC_IMG, _Fields.ROLE, _Fields.IP_DESC, _Fields.MEMBER};
        this.__isset_bitfield = other.__isset_bitfield;
        this.current_word_level_id = other.current_word_level_id;
        if (other.isSetCurrent_word_level_name()) {
            this.current_word_level_name = other.current_word_level_name;
        }
        this.gender_id = other.gender_id;
        if (other.isSetNickname()) {
            this.nickname = other.nickname;
        }
        if (other.isSetAvatar()) {
            this.avatar = other.avatar;
        }
        this.birthday = other.birthday;
        if (other.isSetPosition()) {
            this.position = other.position;
        }
        if (other.isSetUser_education_info()) {
            this.user_education_info = new EducationInfo(other.user_education_info);
        }
        if (other.isSetCurrent_book_desc()) {
            this.current_book_desc = other.current_book_desc;
        }
        if (other.isSetCurrent_book_desc_img()) {
            this.current_book_desc_img = other.current_book_desc_img;
        }
        if (other.isSetRole()) {
            this.role = new RoleInfo(other.role);
        }
        if (other.isSetIp_desc()) {
            this.ip_desc = other.ip_desc;
        }
        if (other.isSetMember()) {
            this.member = new MemberInfo(other.member);
        }
    }
}
