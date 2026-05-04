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
public class UserBasicInfo implements TBase<UserBasicInfo, _Fields>, Serializable, Cloneable, Comparable<UserBasicInfo> {
    private static final int __BIRTHDAY_ISSET_ID = 3;
    private static final int __CURRENT_WORD_LEVEL_ID_ISSET_ID = 0;
    private static final int __GENDER_ID_ISSET_ID = 2;
    private static final int __IS_TRY_USER_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String avatar;
    public long birthday;
    public String current_book_desc;
    public String current_book_desc_img;
    public int current_word_level_id;
    public String current_word_level_name;
    public ExamPreparation examPreparation;
    public int gender_id;
    public String ip_desc;
    public int is_try_user;
    public String nickname;
    private _Fields[] optionals;
    public String position;
    public RoleInfo role;
    public EducationInfo user_education_info;
    public String word_level_alias;
    private static final TStruct STRUCT_DESC = new TStruct(n7.f.f74611a);
    private static final TField CURRENT_WORD_LEVEL_ID_FIELD_DESC = new TField("current_word_level_id", (byte) 8, 1);
    private static final TField CURRENT_WORD_LEVEL_NAME_FIELD_DESC = new TField("current_word_level_name", (byte) 11, 2);
    private static final TField WORD_LEVEL_ALIAS_FIELD_DESC = new TField("word_level_alias", (byte) 11, 3);
    private static final TField IS_TRY_USER_FIELD_DESC = new TField("is_try_user", (byte) 8, 4);
    private static final TField GENDER_ID_FIELD_DESC = new TField("gender_id", (byte) 8, 5);
    private static final TField NICKNAME_FIELD_DESC = new TField("nickname", (byte) 11, 6);
    private static final TField AVATAR_FIELD_DESC = new TField(q9.h.f81940d, (byte) 11, 7);
    private static final TField BIRTHDAY_FIELD_DESC = new TField("birthday", (byte) 10, 8);
    private static final TField POSITION_FIELD_DESC = new TField("position", (byte) 11, 9);
    private static final TField USER_EDUCATION_INFO_FIELD_DESC = new TField("user_education_info", (byte) 12, 10);
    private static final TField CURRENT_BOOK_DESC_FIELD_DESC = new TField("current_book_desc", (byte) 11, 11);
    private static final TField CURRENT_BOOK_DESC_IMG_FIELD_DESC = new TField("current_book_desc_img", (byte) 11, 12);
    private static final TField ROLE_FIELD_DESC = new TField("role", (byte) 12, 13);
    private static final TField EXAM_PREPARATION_FIELD_DESC = new TField("examPreparation", (byte) 12, 14);
    private static final TField IP_DESC_FIELD_DESC = new TField("ip_desc", (byte) 11, 15);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.UserBasicInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$UserBasicInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$UserBasicInfo$_Fields = iArr;
            try {
                iArr[_Fields.CURRENT_WORD_LEVEL_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserBasicInfo$_Fields[_Fields.CURRENT_WORD_LEVEL_NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserBasicInfo$_Fields[_Fields.WORD_LEVEL_ALIAS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserBasicInfo$_Fields[_Fields.IS_TRY_USER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserBasicInfo$_Fields[_Fields.GENDER_ID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserBasicInfo$_Fields[_Fields.NICKNAME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserBasicInfo$_Fields[_Fields.AVATAR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserBasicInfo$_Fields[_Fields.BIRTHDAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserBasicInfo$_Fields[_Fields.POSITION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserBasicInfo$_Fields[_Fields.USER_EDUCATION_INFO.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserBasicInfo$_Fields[_Fields.CURRENT_BOOK_DESC.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserBasicInfo$_Fields[_Fields.CURRENT_BOOK_DESC_IMG.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserBasicInfo$_Fields[_Fields.ROLE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserBasicInfo$_Fields[_Fields.EXAM_PREPARATION.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserBasicInfo$_Fields[_Fields.IP_DESC.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBasicInfoStandardScheme extends StandardScheme<UserBasicInfo> {
        private UserBasicInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserBasicInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetCurrent_word_level_id()) {
                        throw new TProtocolException("Required field 'current_word_level_id' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetIs_try_user()) {
                        throw new TProtocolException("Required field 'is_try_user' was not found in serialized data! Struct: " + toString());
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
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.word_level_alias = iprot.readString();
                            struct.setWord_level_aliasIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.is_try_user = iprot.readI32();
                            struct.setIs_try_userIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.gender_id = iprot.readI32();
                            struct.setGender_idIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.nickname = iprot.readString();
                            struct.setNicknameIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.avatar = iprot.readString();
                            struct.setAvatarIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.birthday = iprot.readI64();
                            struct.setBirthdayIsSet(true);
                            break;
                        }
                    case 9:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.position = iprot.readString();
                            struct.setPositionIsSet(true);
                            break;
                        }
                    case 10:
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
                    case 11:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.current_book_desc = iprot.readString();
                            struct.setCurrent_book_descIsSet(true);
                            break;
                        }
                    case 12:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.current_book_desc_img = iprot.readString();
                            struct.setCurrent_book_desc_imgIsSet(true);
                            break;
                        }
                    case 13:
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
                    case 14:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            ExamPreparation examPreparation = new ExamPreparation();
                            struct.examPreparation = examPreparation;
                            examPreparation.read(iprot);
                            struct.setExamPreparationIsSet(true);
                            break;
                        }
                    case 15:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.ip_desc = iprot.readString();
                            struct.setIp_descIsSet(true);
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
        public void write(TProtocol oprot, UserBasicInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserBasicInfo.STRUCT_DESC);
            oprot.writeFieldBegin(UserBasicInfo.CURRENT_WORD_LEVEL_ID_FIELD_DESC);
            oprot.writeI32(struct.current_word_level_id);
            oprot.writeFieldEnd();
            if (struct.current_word_level_name != null) {
                oprot.writeFieldBegin(UserBasicInfo.CURRENT_WORD_LEVEL_NAME_FIELD_DESC);
                oprot.writeString(struct.current_word_level_name);
                oprot.writeFieldEnd();
            }
            if (struct.word_level_alias != null) {
                oprot.writeFieldBegin(UserBasicInfo.WORD_LEVEL_ALIAS_FIELD_DESC);
                oprot.writeString(struct.word_level_alias);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(UserBasicInfo.IS_TRY_USER_FIELD_DESC);
            oprot.writeI32(struct.is_try_user);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserBasicInfo.GENDER_ID_FIELD_DESC);
            oprot.writeI32(struct.gender_id);
            oprot.writeFieldEnd();
            if (struct.nickname != null) {
                oprot.writeFieldBegin(UserBasicInfo.NICKNAME_FIELD_DESC);
                oprot.writeString(struct.nickname);
                oprot.writeFieldEnd();
            }
            if (struct.avatar != null && struct.isSetAvatar()) {
                oprot.writeFieldBegin(UserBasicInfo.AVATAR_FIELD_DESC);
                oprot.writeString(struct.avatar);
                oprot.writeFieldEnd();
            }
            if (struct.isSetBirthday()) {
                oprot.writeFieldBegin(UserBasicInfo.BIRTHDAY_FIELD_DESC);
                oprot.writeI64(struct.birthday);
                oprot.writeFieldEnd();
            }
            if (struct.position != null && struct.isSetPosition()) {
                oprot.writeFieldBegin(UserBasicInfo.POSITION_FIELD_DESC);
                oprot.writeString(struct.position);
                oprot.writeFieldEnd();
            }
            if (struct.user_education_info != null && struct.isSetUser_education_info()) {
                oprot.writeFieldBegin(UserBasicInfo.USER_EDUCATION_INFO_FIELD_DESC);
                struct.user_education_info.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.current_book_desc != null && struct.isSetCurrent_book_desc()) {
                oprot.writeFieldBegin(UserBasicInfo.CURRENT_BOOK_DESC_FIELD_DESC);
                oprot.writeString(struct.current_book_desc);
                oprot.writeFieldEnd();
            }
            if (struct.current_book_desc_img != null && struct.isSetCurrent_book_desc_img()) {
                oprot.writeFieldBegin(UserBasicInfo.CURRENT_BOOK_DESC_IMG_FIELD_DESC);
                oprot.writeString(struct.current_book_desc_img);
                oprot.writeFieldEnd();
            }
            if (struct.role != null && struct.isSetRole()) {
                oprot.writeFieldBegin(UserBasicInfo.ROLE_FIELD_DESC);
                struct.role.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.examPreparation != null && struct.isSetExamPreparation()) {
                oprot.writeFieldBegin(UserBasicInfo.EXAM_PREPARATION_FIELD_DESC);
                struct.examPreparation.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.ip_desc != null && struct.isSetIp_desc()) {
                oprot.writeFieldBegin(UserBasicInfo.IP_DESC_FIELD_DESC);
                oprot.writeString(struct.ip_desc);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBasicInfoStandardSchemeFactory implements SchemeFactory {
        private UserBasicInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserBasicInfoStandardScheme getScheme() {
            return new UserBasicInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBasicInfoTupleScheme extends TupleScheme<UserBasicInfo> {
        private UserBasicInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserBasicInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.current_word_level_id = tTupleProtocol.readI32();
            struct.setCurrent_word_level_idIsSet(true);
            struct.current_word_level_name = tTupleProtocol.readString();
            struct.setCurrent_word_level_nameIsSet(true);
            struct.word_level_alias = tTupleProtocol.readString();
            struct.setWord_level_aliasIsSet(true);
            struct.is_try_user = tTupleProtocol.readI32();
            struct.setIs_try_userIsSet(true);
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
                ExamPreparation examPreparation = new ExamPreparation();
                struct.examPreparation = examPreparation;
                examPreparation.read(tTupleProtocol);
                struct.setExamPreparationIsSet(true);
            }
            if (readBitSet.get(8)) {
                struct.ip_desc = tTupleProtocol.readString();
                struct.setIp_descIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserBasicInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.current_word_level_id);
            tTupleProtocol.writeString(struct.current_word_level_name);
            tTupleProtocol.writeString(struct.word_level_alias);
            tTupleProtocol.writeI32(struct.is_try_user);
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
            if (struct.isSetExamPreparation()) {
                bitSet.set(7);
            }
            if (struct.isSetIp_desc()) {
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
            if (struct.isSetExamPreparation()) {
                struct.examPreparation.write(tTupleProtocol);
            }
            if (struct.isSetIp_desc()) {
                tTupleProtocol.writeString(struct.ip_desc);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBasicInfoTupleSchemeFactory implements SchemeFactory {
        private UserBasicInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserBasicInfoTupleScheme getScheme() {
            return new UserBasicInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        CURRENT_WORD_LEVEL_ID(1, "current_word_level_id"),
        CURRENT_WORD_LEVEL_NAME(2, "current_word_level_name"),
        WORD_LEVEL_ALIAS(3, "word_level_alias"),
        IS_TRY_USER(4, "is_try_user"),
        GENDER_ID(5, "gender_id"),
        NICKNAME(6, "nickname"),
        AVATAR(7, q9.h.f81940d),
        BIRTHDAY(8, "birthday"),
        POSITION(9, "position"),
        USER_EDUCATION_INFO(10, "user_education_info"),
        CURRENT_BOOK_DESC(11, "current_book_desc"),
        CURRENT_BOOK_DESC_IMG(12, "current_book_desc_img"),
        ROLE(13, "role"),
        EXAM_PREPARATION(14, "examPreparation"),
        IP_DESC(15, "ip_desc");

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
                    return WORD_LEVEL_ALIAS;
                case 4:
                    return IS_TRY_USER;
                case 5:
                    return GENDER_ID;
                case 6:
                    return NICKNAME;
                case 7:
                    return AVATAR;
                case 8:
                    return BIRTHDAY;
                case 9:
                    return POSITION;
                case 10:
                    return USER_EDUCATION_INFO;
                case 11:
                    return CURRENT_BOOK_DESC;
                case 12:
                    return CURRENT_BOOK_DESC_IMG;
                case 13:
                    return ROLE;
                case 14:
                    return EXAM_PREPARATION;
                case 15:
                    return IP_DESC;
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
        hashMap.put(StandardScheme.class, new UserBasicInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserBasicInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.CURRENT_WORD_LEVEL_ID, (_Fields) new FieldMetaData("current_word_level_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.CURRENT_WORD_LEVEL_NAME, (_Fields) new FieldMetaData("current_word_level_name", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.WORD_LEVEL_ALIAS, (_Fields) new FieldMetaData("word_level_alias", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.IS_TRY_USER, (_Fields) new FieldMetaData("is_try_user", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.GENDER_ID, (_Fields) new FieldMetaData("gender_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.NICKNAME, (_Fields) new FieldMetaData("nickname", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.AVATAR, (_Fields) new FieldMetaData(q9.h.f81940d, (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.BIRTHDAY, (_Fields) new FieldMetaData("birthday", (byte) 2, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.POSITION, (_Fields) new FieldMetaData("position", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.USER_EDUCATION_INFO, (_Fields) new FieldMetaData("user_education_info", (byte) 2, new StructMetaData((byte) 12, EducationInfo.class)));
        enumMap.put((EnumMap) _Fields.CURRENT_BOOK_DESC, (_Fields) new FieldMetaData("current_book_desc", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.CURRENT_BOOK_DESC_IMG, (_Fields) new FieldMetaData("current_book_desc_img", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ROLE, (_Fields) new FieldMetaData("role", (byte) 2, new StructMetaData((byte) 12, RoleInfo.class)));
        enumMap.put((EnumMap) _Fields.EXAM_PREPARATION, (_Fields) new FieldMetaData("examPreparation", (byte) 2, new StructMetaData((byte) 12, ExamPreparation.class)));
        enumMap.put((EnumMap) _Fields.IP_DESC, (_Fields) new FieldMetaData("ip_desc", (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserBasicInfo.class, unmodifiableMap);
    }

    public UserBasicInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.AVATAR, _Fields.BIRTHDAY, _Fields.POSITION, _Fields.USER_EDUCATION_INFO, _Fields.CURRENT_BOOK_DESC, _Fields.CURRENT_BOOK_DESC_IMG, _Fields.ROLE, _Fields.EXAM_PREPARATION, _Fields.IP_DESC};
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
        this.word_level_alias = null;
        setIs_try_userIsSet(false);
        this.is_try_user = 0;
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
        this.examPreparation = null;
        this.ip_desc = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserBasicInfo)) {
            return equals((UserBasicInfo) that);
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

    public ExamPreparation getExamPreparation() {
        return this.examPreparation;
    }

    public int getGender_id() {
        return this.gender_id;
    }

    public String getIp_desc() {
        return this.ip_desc;
    }

    public int getIs_try_user() {
        return this.is_try_user;
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

    public String getWord_level_alias() {
        return this.word_level_alias;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAvatar() {
        return this.avatar != null;
    }

    public boolean isSetBirthday() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
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

    public boolean isSetExamPreparation() {
        return this.examPreparation != null;
    }

    public boolean isSetGender_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetIp_desc() {
        return this.ip_desc != null;
    }

    public boolean isSetIs_try_user() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
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

    public boolean isSetWord_level_alias() {
        return this.word_level_alias != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserBasicInfo setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }

    public void setAvatarIsSet(boolean value) {
        if (value) {
            return;
        }
        this.avatar = null;
    }

    public UserBasicInfo setBirthday(long birthday) {
        this.birthday = birthday;
        setBirthdayIsSet(true);
        return this;
    }

    public void setBirthdayIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public UserBasicInfo setCurrent_book_desc(String current_book_desc) {
        this.current_book_desc = current_book_desc;
        return this;
    }

    public void setCurrent_book_descIsSet(boolean value) {
        if (value) {
            return;
        }
        this.current_book_desc = null;
    }

    public UserBasicInfo setCurrent_book_desc_img(String current_book_desc_img) {
        this.current_book_desc_img = current_book_desc_img;
        return this;
    }

    public void setCurrent_book_desc_imgIsSet(boolean value) {
        if (value) {
            return;
        }
        this.current_book_desc_img = null;
    }

    public UserBasicInfo setCurrent_word_level_id(int current_word_level_id) {
        this.current_word_level_id = current_word_level_id;
        setCurrent_word_level_idIsSet(true);
        return this;
    }

    public void setCurrent_word_level_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public UserBasicInfo setCurrent_word_level_name(String current_word_level_name) {
        this.current_word_level_name = current_word_level_name;
        return this;
    }

    public void setCurrent_word_level_nameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.current_word_level_name = null;
    }

    public UserBasicInfo setExamPreparation(ExamPreparation examPreparation) {
        this.examPreparation = examPreparation;
        return this;
    }

    public void setExamPreparationIsSet(boolean value) {
        if (value) {
            return;
        }
        this.examPreparation = null;
    }

    public UserBasicInfo setGender_id(int gender_id) {
        this.gender_id = gender_id;
        setGender_idIsSet(true);
        return this;
    }

    public void setGender_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public UserBasicInfo setIp_desc(String ip_desc) {
        this.ip_desc = ip_desc;
        return this;
    }

    public void setIp_descIsSet(boolean value) {
        if (value) {
            return;
        }
        this.ip_desc = null;
    }

    public UserBasicInfo setIs_try_user(int is_try_user) {
        this.is_try_user = is_try_user;
        setIs_try_userIsSet(true);
        return this;
    }

    public void setIs_try_userIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public UserBasicInfo setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public void setNicknameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.nickname = null;
    }

    public UserBasicInfo setPosition(String position) {
        this.position = position;
        return this;
    }

    public void setPositionIsSet(boolean value) {
        if (value) {
            return;
        }
        this.position = null;
    }

    public UserBasicInfo setRole(RoleInfo role) {
        this.role = role;
        return this;
    }

    public void setRoleIsSet(boolean value) {
        if (value) {
            return;
        }
        this.role = null;
    }

    public UserBasicInfo setUser_education_info(EducationInfo user_education_info) {
        this.user_education_info = user_education_info;
        return this;
    }

    public void setUser_education_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.user_education_info = null;
    }

    public UserBasicInfo setWord_level_alias(String word_level_alias) {
        this.word_level_alias = word_level_alias;
        return this;
    }

    public void setWord_level_aliasIsSet(boolean value) {
        if (value) {
            return;
        }
        this.word_level_alias = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserBasicInfo(");
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
        sb2.append("word_level_alias:");
        String str2 = this.word_level_alias;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("is_try_user:");
        sb2.append(this.is_try_user);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("gender_id:");
        sb2.append(this.gender_id);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("nickname:");
        String str3 = this.nickname;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        if (isSetAvatar()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("avatar:");
            String str4 = this.avatar;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
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
            String str5 = this.position;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
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
            String str6 = this.current_book_desc;
            if (str6 == null) {
                sb2.append("null");
            } else {
                sb2.append(str6);
            }
        }
        if (isSetCurrent_book_desc_img()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("current_book_desc_img:");
            String str7 = this.current_book_desc_img;
            if (str7 == null) {
                sb2.append("null");
            } else {
                sb2.append(str7);
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
        if (isSetExamPreparation()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("examPreparation:");
            ExamPreparation examPreparation = this.examPreparation;
            if (examPreparation == null) {
                sb2.append("null");
            } else {
                sb2.append(examPreparation);
            }
        }
        if (isSetIp_desc()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("ip_desc:");
            String str8 = this.ip_desc;
            if (str8 == null) {
                sb2.append("null");
            } else {
                sb2.append(str8);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAvatar() {
        this.avatar = null;
    }

    public void unsetBirthday() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
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

    public void unsetExamPreparation() {
        this.examPreparation = null;
    }

    public void unsetGender_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetIp_desc() {
        this.ip_desc = null;
    }

    public void unsetIs_try_user() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
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

    public void unsetWord_level_alias() {
        this.word_level_alias = null;
    }

    public void validate() throws TException {
        if (this.current_word_level_name == null) {
            throw new TProtocolException("Required field 'current_word_level_name' was not present! Struct: " + toString());
        }
        if (this.word_level_alias == null) {
            throw new TProtocolException("Required field 'word_level_alias' was not present! Struct: " + toString());
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
        ExamPreparation examPreparation = this.examPreparation;
        if (examPreparation != null) {
            examPreparation.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(UserBasicInfo other) {
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
        int compareTo14;
        int compareTo15;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo16 = Boolean.valueOf(isSetCurrent_word_level_id()).compareTo(Boolean.valueOf(other.isSetCurrent_word_level_id()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (isSetCurrent_word_level_id() && (compareTo15 = TBaseHelper.compareTo(this.current_word_level_id, other.current_word_level_id)) != 0) {
            return compareTo15;
        }
        int compareTo17 = Boolean.valueOf(isSetCurrent_word_level_name()).compareTo(Boolean.valueOf(other.isSetCurrent_word_level_name()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (isSetCurrent_word_level_name() && (compareTo14 = TBaseHelper.compareTo(this.current_word_level_name, other.current_word_level_name)) != 0) {
            return compareTo14;
        }
        int compareTo18 = Boolean.valueOf(isSetWord_level_alias()).compareTo(Boolean.valueOf(other.isSetWord_level_alias()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (isSetWord_level_alias() && (compareTo13 = TBaseHelper.compareTo(this.word_level_alias, other.word_level_alias)) != 0) {
            return compareTo13;
        }
        int compareTo19 = Boolean.valueOf(isSetIs_try_user()).compareTo(Boolean.valueOf(other.isSetIs_try_user()));
        if (compareTo19 != 0) {
            return compareTo19;
        }
        if (isSetIs_try_user() && (compareTo12 = TBaseHelper.compareTo(this.is_try_user, other.is_try_user)) != 0) {
            return compareTo12;
        }
        int compareTo20 = Boolean.valueOf(isSetGender_id()).compareTo(Boolean.valueOf(other.isSetGender_id()));
        if (compareTo20 != 0) {
            return compareTo20;
        }
        if (isSetGender_id() && (compareTo11 = TBaseHelper.compareTo(this.gender_id, other.gender_id)) != 0) {
            return compareTo11;
        }
        int compareTo21 = Boolean.valueOf(isSetNickname()).compareTo(Boolean.valueOf(other.isSetNickname()));
        if (compareTo21 != 0) {
            return compareTo21;
        }
        if (isSetNickname() && (compareTo10 = TBaseHelper.compareTo(this.nickname, other.nickname)) != 0) {
            return compareTo10;
        }
        int compareTo22 = Boolean.valueOf(isSetAvatar()).compareTo(Boolean.valueOf(other.isSetAvatar()));
        if (compareTo22 != 0) {
            return compareTo22;
        }
        if (isSetAvatar() && (compareTo9 = TBaseHelper.compareTo(this.avatar, other.avatar)) != 0) {
            return compareTo9;
        }
        int compareTo23 = Boolean.valueOf(isSetBirthday()).compareTo(Boolean.valueOf(other.isSetBirthday()));
        if (compareTo23 != 0) {
            return compareTo23;
        }
        if (isSetBirthday() && (compareTo8 = TBaseHelper.compareTo(this.birthday, other.birthday)) != 0) {
            return compareTo8;
        }
        int compareTo24 = Boolean.valueOf(isSetPosition()).compareTo(Boolean.valueOf(other.isSetPosition()));
        if (compareTo24 != 0) {
            return compareTo24;
        }
        if (isSetPosition() && (compareTo7 = TBaseHelper.compareTo(this.position, other.position)) != 0) {
            return compareTo7;
        }
        int compareTo25 = Boolean.valueOf(isSetUser_education_info()).compareTo(Boolean.valueOf(other.isSetUser_education_info()));
        if (compareTo25 != 0) {
            return compareTo25;
        }
        if (isSetUser_education_info() && (compareTo6 = TBaseHelper.compareTo((Comparable) this.user_education_info, (Comparable) other.user_education_info)) != 0) {
            return compareTo6;
        }
        int compareTo26 = Boolean.valueOf(isSetCurrent_book_desc()).compareTo(Boolean.valueOf(other.isSetCurrent_book_desc()));
        if (compareTo26 != 0) {
            return compareTo26;
        }
        if (isSetCurrent_book_desc() && (compareTo5 = TBaseHelper.compareTo(this.current_book_desc, other.current_book_desc)) != 0) {
            return compareTo5;
        }
        int compareTo27 = Boolean.valueOf(isSetCurrent_book_desc_img()).compareTo(Boolean.valueOf(other.isSetCurrent_book_desc_img()));
        if (compareTo27 != 0) {
            return compareTo27;
        }
        if (isSetCurrent_book_desc_img() && (compareTo4 = TBaseHelper.compareTo(this.current_book_desc_img, other.current_book_desc_img)) != 0) {
            return compareTo4;
        }
        int compareTo28 = Boolean.valueOf(isSetRole()).compareTo(Boolean.valueOf(other.isSetRole()));
        if (compareTo28 != 0) {
            return compareTo28;
        }
        if (isSetRole() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.role, (Comparable) other.role)) != 0) {
            return compareTo3;
        }
        int compareTo29 = Boolean.valueOf(isSetExamPreparation()).compareTo(Boolean.valueOf(other.isSetExamPreparation()));
        if (compareTo29 != 0) {
            return compareTo29;
        }
        if (isSetExamPreparation() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.examPreparation, (Comparable) other.examPreparation)) != 0) {
            return compareTo2;
        }
        int compareTo30 = Boolean.valueOf(isSetIp_desc()).compareTo(Boolean.valueOf(other.isSetIp_desc()));
        if (compareTo30 != 0) {
            return compareTo30;
        }
        if (!isSetIp_desc() || (compareTo = TBaseHelper.compareTo(this.ip_desc, other.ip_desc)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserBasicInfo, _Fields> deepCopy2() {
        return new UserBasicInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserBasicInfo$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getCurrent_word_level_id());
            case 2:
                return getCurrent_word_level_name();
            case 3:
                return getWord_level_alias();
            case 4:
                return Integer.valueOf(getIs_try_user());
            case 5:
                return Integer.valueOf(getGender_id());
            case 6:
                return getNickname();
            case 7:
                return getAvatar();
            case 8:
                return Long.valueOf(getBirthday());
            case 9:
                return getPosition();
            case 10:
                return getUser_education_info();
            case 11:
                return getCurrent_book_desc();
            case 12:
                return getCurrent_book_desc_img();
            case 13:
                return getRole();
            case 14:
                return getExamPreparation();
            case 15:
                return getIp_desc();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserBasicInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetCurrent_word_level_id();
            case 2:
                return isSetCurrent_word_level_name();
            case 3:
                return isSetWord_level_alias();
            case 4:
                return isSetIs_try_user();
            case 5:
                return isSetGender_id();
            case 6:
                return isSetNickname();
            case 7:
                return isSetAvatar();
            case 8:
                return isSetBirthday();
            case 9:
                return isSetPosition();
            case 10:
                return isSetUser_education_info();
            case 11:
                return isSetCurrent_book_desc();
            case 12:
                return isSetCurrent_book_desc_img();
            case 13:
                return isSetRole();
            case 14:
                return isSetExamPreparation();
            case 15:
                return isSetIp_desc();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserBasicInfo$_Fields[field.ordinal()]) {
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
                    setWord_level_alias((String) value);
                    break;
                } else {
                    unsetWord_level_alias();
                    break;
                }
            case 4:
                if (value != null) {
                    setIs_try_user(((Integer) value).intValue());
                    break;
                } else {
                    unsetIs_try_user();
                    break;
                }
            case 5:
                if (value != null) {
                    setGender_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetGender_id();
                    break;
                }
            case 6:
                if (value != null) {
                    setNickname((String) value);
                    break;
                } else {
                    unsetNickname();
                    break;
                }
            case 7:
                if (value != null) {
                    setAvatar((String) value);
                    break;
                } else {
                    unsetAvatar();
                    break;
                }
            case 8:
                if (value != null) {
                    setBirthday(((Long) value).longValue());
                    break;
                } else {
                    unsetBirthday();
                    break;
                }
            case 9:
                if (value != null) {
                    setPosition((String) value);
                    break;
                } else {
                    unsetPosition();
                    break;
                }
            case 10:
                if (value != null) {
                    setUser_education_info((EducationInfo) value);
                    break;
                } else {
                    unsetUser_education_info();
                    break;
                }
            case 11:
                if (value != null) {
                    setCurrent_book_desc((String) value);
                    break;
                } else {
                    unsetCurrent_book_desc();
                    break;
                }
            case 12:
                if (value != null) {
                    setCurrent_book_desc_img((String) value);
                    break;
                } else {
                    unsetCurrent_book_desc_img();
                    break;
                }
            case 13:
                if (value != null) {
                    setRole((RoleInfo) value);
                    break;
                } else {
                    unsetRole();
                    break;
                }
            case 14:
                if (value != null) {
                    setExamPreparation((ExamPreparation) value);
                    break;
                } else {
                    unsetExamPreparation();
                    break;
                }
            case 15:
                if (value != null) {
                    setIp_desc((String) value);
                    break;
                } else {
                    unsetIp_desc();
                    break;
                }
        }
    }

    public boolean equals(UserBasicInfo that) {
        if (that == null || this.current_word_level_id != that.current_word_level_id) {
            return false;
        }
        boolean isSetCurrent_word_level_name = isSetCurrent_word_level_name();
        boolean isSetCurrent_word_level_name2 = that.isSetCurrent_word_level_name();
        if ((isSetCurrent_word_level_name || isSetCurrent_word_level_name2) && !(isSetCurrent_word_level_name && isSetCurrent_word_level_name2 && this.current_word_level_name.equals(that.current_word_level_name))) {
            return false;
        }
        boolean isSetWord_level_alias = isSetWord_level_alias();
        boolean isSetWord_level_alias2 = that.isSetWord_level_alias();
        if (((isSetWord_level_alias || isSetWord_level_alias2) && (!isSetWord_level_alias || !isSetWord_level_alias2 || !this.word_level_alias.equals(that.word_level_alias))) || this.is_try_user != that.is_try_user || this.gender_id != that.gender_id) {
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
        boolean isSetExamPreparation = isSetExamPreparation();
        boolean isSetExamPreparation2 = that.isSetExamPreparation();
        if ((isSetExamPreparation || isSetExamPreparation2) && !(isSetExamPreparation && isSetExamPreparation2 && this.examPreparation.equals(that.examPreparation))) {
            return false;
        }
        boolean isSetIp_desc = isSetIp_desc();
        boolean isSetIp_desc2 = that.isSetIp_desc();
        if (isSetIp_desc || isSetIp_desc2) {
            return isSetIp_desc && isSetIp_desc2 && this.ip_desc.equals(that.ip_desc);
        }
        return true;
    }

    public UserBasicInfo(int current_word_level_id, String current_word_level_name, String word_level_alias, int is_try_user, int gender_id, String nickname) {
        this();
        this.current_word_level_id = current_word_level_id;
        setCurrent_word_level_idIsSet(true);
        this.current_word_level_name = current_word_level_name;
        this.word_level_alias = word_level_alias;
        this.is_try_user = is_try_user;
        setIs_try_userIsSet(true);
        this.gender_id = gender_id;
        setGender_idIsSet(true);
        this.nickname = nickname;
    }

    public UserBasicInfo(UserBasicInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.AVATAR, _Fields.BIRTHDAY, _Fields.POSITION, _Fields.USER_EDUCATION_INFO, _Fields.CURRENT_BOOK_DESC, _Fields.CURRENT_BOOK_DESC_IMG, _Fields.ROLE, _Fields.EXAM_PREPARATION, _Fields.IP_DESC};
        this.__isset_bitfield = other.__isset_bitfield;
        this.current_word_level_id = other.current_word_level_id;
        if (other.isSetCurrent_word_level_name()) {
            this.current_word_level_name = other.current_word_level_name;
        }
        if (other.isSetWord_level_alias()) {
            this.word_level_alias = other.word_level_alias;
        }
        this.is_try_user = other.is_try_user;
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
        if (other.isSetExamPreparation()) {
            this.examPreparation = new ExamPreparation(other.examPreparation);
        }
        if (other.isSetIp_desc()) {
            this.ip_desc = other.ip_desc;
        }
    }
}
