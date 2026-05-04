package com.baicizhan.online.unified_user_service;

import com.tencent.open.SocialOperation;
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
public class ThirdPartyUserInfo implements TBase<ThirdPartyUserInfo, _Fields>, Serializable, Cloneable, Comparable<ThirdPartyUserInfo> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public String asecret;
    public String atoken;
    public String expires_at;
    public String gender;
    public String image_url;
    public String nickname;
    public String openid;
    private _Fields[] optionals;
    public String provider;
    public String uid;
    public String unionid;
    private static final TStruct STRUCT_DESC = new TStruct("ThirdPartyUserInfo");
    private static final TField UID_FIELD_DESC = new TField("uid", (byte) 11, 1);
    private static final TField NICKNAME_FIELD_DESC = new TField("nickname", (byte) 11, 2);
    private static final TField ATOKEN_FIELD_DESC = new TField("atoken", (byte) 11, 3);
    private static final TField ASECRET_FIELD_DESC = new TField("asecret", (byte) 11, 4);
    private static final TField EXPIRES_AT_FIELD_DESC = new TField("expires_at", (byte) 11, 5);
    private static final TField GENDER_FIELD_DESC = new TField("gender", (byte) 11, 6);
    private static final TField IMAGE_URL_FIELD_DESC = new TField("image_url", (byte) 11, 7);
    private static final TField OPENID_FIELD_DESC = new TField("openid", (byte) 11, 8);
    private static final TField UNIONID_FIELD_DESC = new TField(SocialOperation.GAME_UNION_ID, (byte) 11, 9);
    private static final TField PROVIDER_FIELD_DESC = new TField(ma.b.f72911h1, (byte) 11, 10);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.unified_user_service.ThirdPartyUserInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$unified_user_service$ThirdPartyUserInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$unified_user_service$ThirdPartyUserInfo$_Fields = iArr;
            try {
                iArr[_Fields.UID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$ThirdPartyUserInfo$_Fields[_Fields.NICKNAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$ThirdPartyUserInfo$_Fields[_Fields.ATOKEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$ThirdPartyUserInfo$_Fields[_Fields.ASECRET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$ThirdPartyUserInfo$_Fields[_Fields.EXPIRES_AT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$ThirdPartyUserInfo$_Fields[_Fields.GENDER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$ThirdPartyUserInfo$_Fields[_Fields.IMAGE_URL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$ThirdPartyUserInfo$_Fields[_Fields.OPENID.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$ThirdPartyUserInfo$_Fields[_Fields.UNIONID.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$ThirdPartyUserInfo$_Fields[_Fields.PROVIDER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ThirdPartyUserInfoStandardScheme extends StandardScheme<ThirdPartyUserInfo> {
        private ThirdPartyUserInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, ThirdPartyUserInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    struct.validate();
                    return;
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.uid = iprot.readString();
                            struct.setUidIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.nickname = iprot.readString();
                            struct.setNicknameIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.atoken = iprot.readString();
                            struct.setAtokenIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.asecret = iprot.readString();
                            struct.setAsecretIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.expires_at = iprot.readString();
                            struct.setExpires_atIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.gender = iprot.readString();
                            struct.setGenderIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.image_url = iprot.readString();
                            struct.setImage_urlIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.openid = iprot.readString();
                            struct.setOpenidIsSet(true);
                            break;
                        }
                    case 9:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.unionid = iprot.readString();
                            struct.setUnionidIsSet(true);
                            break;
                        }
                    case 10:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.provider = iprot.readString();
                            struct.setProviderIsSet(true);
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
        public void write(TProtocol oprot, ThirdPartyUserInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(ThirdPartyUserInfo.STRUCT_DESC);
            if (struct.uid != null && struct.isSetUid()) {
                oprot.writeFieldBegin(ThirdPartyUserInfo.UID_FIELD_DESC);
                oprot.writeString(struct.uid);
                oprot.writeFieldEnd();
            }
            if (struct.nickname != null) {
                oprot.writeFieldBegin(ThirdPartyUserInfo.NICKNAME_FIELD_DESC);
                oprot.writeString(struct.nickname);
                oprot.writeFieldEnd();
            }
            if (struct.atoken != null && struct.isSetAtoken()) {
                oprot.writeFieldBegin(ThirdPartyUserInfo.ATOKEN_FIELD_DESC);
                oprot.writeString(struct.atoken);
                oprot.writeFieldEnd();
            }
            if (struct.asecret != null && struct.isSetAsecret()) {
                oprot.writeFieldBegin(ThirdPartyUserInfo.ASECRET_FIELD_DESC);
                oprot.writeString(struct.asecret);
                oprot.writeFieldEnd();
            }
            if (struct.expires_at != null && struct.isSetExpires_at()) {
                oprot.writeFieldBegin(ThirdPartyUserInfo.EXPIRES_AT_FIELD_DESC);
                oprot.writeString(struct.expires_at);
                oprot.writeFieldEnd();
            }
            if (struct.gender != null && struct.isSetGender()) {
                oprot.writeFieldBegin(ThirdPartyUserInfo.GENDER_FIELD_DESC);
                oprot.writeString(struct.gender);
                oprot.writeFieldEnd();
            }
            if (struct.image_url != null && struct.isSetImage_url()) {
                oprot.writeFieldBegin(ThirdPartyUserInfo.IMAGE_URL_FIELD_DESC);
                oprot.writeString(struct.image_url);
                oprot.writeFieldEnd();
            }
            if (struct.openid != null && struct.isSetOpenid()) {
                oprot.writeFieldBegin(ThirdPartyUserInfo.OPENID_FIELD_DESC);
                oprot.writeString(struct.openid);
                oprot.writeFieldEnd();
            }
            if (struct.unionid != null && struct.isSetUnionid()) {
                oprot.writeFieldBegin(ThirdPartyUserInfo.UNIONID_FIELD_DESC);
                oprot.writeString(struct.unionid);
                oprot.writeFieldEnd();
            }
            if (struct.provider != null) {
                oprot.writeFieldBegin(ThirdPartyUserInfo.PROVIDER_FIELD_DESC);
                oprot.writeString(struct.provider);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ThirdPartyUserInfoStandardSchemeFactory implements SchemeFactory {
        private ThirdPartyUserInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ThirdPartyUserInfoStandardScheme getScheme() {
            return new ThirdPartyUserInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ThirdPartyUserInfoTupleScheme extends TupleScheme<ThirdPartyUserInfo> {
        private ThirdPartyUserInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, ThirdPartyUserInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.nickname = tTupleProtocol.readString();
            struct.setNicknameIsSet(true);
            struct.provider = tTupleProtocol.readString();
            struct.setProviderIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(8);
            if (readBitSet.get(0)) {
                struct.uid = tTupleProtocol.readString();
                struct.setUidIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.atoken = tTupleProtocol.readString();
                struct.setAtokenIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.asecret = tTupleProtocol.readString();
                struct.setAsecretIsSet(true);
            }
            if (readBitSet.get(3)) {
                struct.expires_at = tTupleProtocol.readString();
                struct.setExpires_atIsSet(true);
            }
            if (readBitSet.get(4)) {
                struct.gender = tTupleProtocol.readString();
                struct.setGenderIsSet(true);
            }
            if (readBitSet.get(5)) {
                struct.image_url = tTupleProtocol.readString();
                struct.setImage_urlIsSet(true);
            }
            if (readBitSet.get(6)) {
                struct.openid = tTupleProtocol.readString();
                struct.setOpenidIsSet(true);
            }
            if (readBitSet.get(7)) {
                struct.unionid = tTupleProtocol.readString();
                struct.setUnionidIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, ThirdPartyUserInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.nickname);
            tTupleProtocol.writeString(struct.provider);
            BitSet bitSet = new BitSet();
            if (struct.isSetUid()) {
                bitSet.set(0);
            }
            if (struct.isSetAtoken()) {
                bitSet.set(1);
            }
            if (struct.isSetAsecret()) {
                bitSet.set(2);
            }
            if (struct.isSetExpires_at()) {
                bitSet.set(3);
            }
            if (struct.isSetGender()) {
                bitSet.set(4);
            }
            if (struct.isSetImage_url()) {
                bitSet.set(5);
            }
            if (struct.isSetOpenid()) {
                bitSet.set(6);
            }
            if (struct.isSetUnionid()) {
                bitSet.set(7);
            }
            tTupleProtocol.writeBitSet(bitSet, 8);
            if (struct.isSetUid()) {
                tTupleProtocol.writeString(struct.uid);
            }
            if (struct.isSetAtoken()) {
                tTupleProtocol.writeString(struct.atoken);
            }
            if (struct.isSetAsecret()) {
                tTupleProtocol.writeString(struct.asecret);
            }
            if (struct.isSetExpires_at()) {
                tTupleProtocol.writeString(struct.expires_at);
            }
            if (struct.isSetGender()) {
                tTupleProtocol.writeString(struct.gender);
            }
            if (struct.isSetImage_url()) {
                tTupleProtocol.writeString(struct.image_url);
            }
            if (struct.isSetOpenid()) {
                tTupleProtocol.writeString(struct.openid);
            }
            if (struct.isSetUnionid()) {
                tTupleProtocol.writeString(struct.unionid);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ThirdPartyUserInfoTupleSchemeFactory implements SchemeFactory {
        private ThirdPartyUserInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ThirdPartyUserInfoTupleScheme getScheme() {
            return new ThirdPartyUserInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        UID(1, "uid"),
        NICKNAME(2, "nickname"),
        ATOKEN(3, "atoken"),
        ASECRET(4, "asecret"),
        EXPIRES_AT(5, "expires_at"),
        GENDER(6, "gender"),
        IMAGE_URL(7, "image_url"),
        OPENID(8, "openid"),
        UNIONID(9, SocialOperation.GAME_UNION_ID),
        PROVIDER(10, ma.b.f72911h1);

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
                    return UID;
                case 2:
                    return NICKNAME;
                case 3:
                    return ATOKEN;
                case 4:
                    return ASECRET;
                case 5:
                    return EXPIRES_AT;
                case 6:
                    return GENDER;
                case 7:
                    return IMAGE_URL;
                case 8:
                    return OPENID;
                case 9:
                    return UNIONID;
                case 10:
                    return PROVIDER;
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
        hashMap.put(StandardScheme.class, new ThirdPartyUserInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new ThirdPartyUserInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.UID, (_Fields) new FieldMetaData("uid", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.NICKNAME, (_Fields) new FieldMetaData("nickname", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ATOKEN, (_Fields) new FieldMetaData("atoken", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ASECRET, (_Fields) new FieldMetaData("asecret", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.EXPIRES_AT, (_Fields) new FieldMetaData("expires_at", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.GENDER, (_Fields) new FieldMetaData("gender", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.IMAGE_URL, (_Fields) new FieldMetaData("image_url", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.OPENID, (_Fields) new FieldMetaData("openid", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.UNIONID, (_Fields) new FieldMetaData(SocialOperation.GAME_UNION_ID, (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.PROVIDER, (_Fields) new FieldMetaData(ma.b.f72911h1, (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(ThirdPartyUserInfo.class, unmodifiableMap);
    }

    public ThirdPartyUserInfo() {
        this.optionals = new _Fields[]{_Fields.UID, _Fields.ATOKEN, _Fields.ASECRET, _Fields.EXPIRES_AT, _Fields.GENDER, _Fields.IMAGE_URL, _Fields.OPENID, _Fields.UNIONID};
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
        this.uid = null;
        this.nickname = null;
        this.atoken = null;
        this.asecret = null;
        this.expires_at = null;
        this.gender = null;
        this.image_url = null;
        this.openid = null;
        this.unionid = null;
        this.provider = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof ThirdPartyUserInfo)) {
            return equals((ThirdPartyUserInfo) that);
        }
        return false;
    }

    public String getAsecret() {
        return this.asecret;
    }

    public String getAtoken() {
        return this.atoken;
    }

    public String getExpires_at() {
        return this.expires_at;
    }

    public String getGender() {
        return this.gender;
    }

    public String getImage_url() {
        return this.image_url;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getOpenid() {
        return this.openid;
    }

    public String getProvider() {
        return this.provider;
    }

    public String getUid() {
        return this.uid;
    }

    public String getUnionid() {
        return this.unionid;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAsecret() {
        return this.asecret != null;
    }

    public boolean isSetAtoken() {
        return this.atoken != null;
    }

    public boolean isSetExpires_at() {
        return this.expires_at != null;
    }

    public boolean isSetGender() {
        return this.gender != null;
    }

    public boolean isSetImage_url() {
        return this.image_url != null;
    }

    public boolean isSetNickname() {
        return this.nickname != null;
    }

    public boolean isSetOpenid() {
        return this.openid != null;
    }

    public boolean isSetProvider() {
        return this.provider != null;
    }

    public boolean isSetUid() {
        return this.uid != null;
    }

    public boolean isSetUnionid() {
        return this.unionid != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public ThirdPartyUserInfo setAsecret(String asecret) {
        this.asecret = asecret;
        return this;
    }

    public void setAsecretIsSet(boolean value) {
        if (value) {
            return;
        }
        this.asecret = null;
    }

    public ThirdPartyUserInfo setAtoken(String atoken) {
        this.atoken = atoken;
        return this;
    }

    public void setAtokenIsSet(boolean value) {
        if (value) {
            return;
        }
        this.atoken = null;
    }

    public ThirdPartyUserInfo setExpires_at(String expires_at) {
        this.expires_at = expires_at;
        return this;
    }

    public void setExpires_atIsSet(boolean value) {
        if (value) {
            return;
        }
        this.expires_at = null;
    }

    public ThirdPartyUserInfo setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public void setGenderIsSet(boolean value) {
        if (value) {
            return;
        }
        this.gender = null;
    }

    public ThirdPartyUserInfo setImage_url(String image_url) {
        this.image_url = image_url;
        return this;
    }

    public void setImage_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.image_url = null;
    }

    public ThirdPartyUserInfo setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public void setNicknameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.nickname = null;
    }

    public ThirdPartyUserInfo setOpenid(String openid) {
        this.openid = openid;
        return this;
    }

    public void setOpenidIsSet(boolean value) {
        if (value) {
            return;
        }
        this.openid = null;
    }

    public ThirdPartyUserInfo setProvider(String provider) {
        this.provider = provider;
        return this;
    }

    public void setProviderIsSet(boolean value) {
        if (value) {
            return;
        }
        this.provider = null;
    }

    public ThirdPartyUserInfo setUid(String uid) {
        this.uid = uid;
        return this;
    }

    public void setUidIsSet(boolean value) {
        if (value) {
            return;
        }
        this.uid = null;
    }

    public ThirdPartyUserInfo setUnionid(String unionid) {
        this.unionid = unionid;
        return this;
    }

    public void setUnionidIsSet(boolean value) {
        if (value) {
            return;
        }
        this.unionid = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ThirdPartyUserInfo(");
        if (isSetUid()) {
            sb2.append("uid:");
            String str = this.uid;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            sb2.append(j2.O);
        }
        sb2.append("nickname:");
        String str2 = this.nickname;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        if (isSetAtoken()) {
            sb2.append(j2.O);
            sb2.append("atoken:");
            String str3 = this.atoken;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
        }
        if (isSetAsecret()) {
            sb2.append(j2.O);
            sb2.append("asecret:");
            String str4 = this.asecret;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (isSetExpires_at()) {
            sb2.append(j2.O);
            sb2.append("expires_at:");
            String str5 = this.expires_at;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        if (isSetGender()) {
            sb2.append(j2.O);
            sb2.append("gender:");
            String str6 = this.gender;
            if (str6 == null) {
                sb2.append("null");
            } else {
                sb2.append(str6);
            }
        }
        if (isSetImage_url()) {
            sb2.append(j2.O);
            sb2.append("image_url:");
            String str7 = this.image_url;
            if (str7 == null) {
                sb2.append("null");
            } else {
                sb2.append(str7);
            }
        }
        if (isSetOpenid()) {
            sb2.append(j2.O);
            sb2.append("openid:");
            String str8 = this.openid;
            if (str8 == null) {
                sb2.append("null");
            } else {
                sb2.append(str8);
            }
        }
        if (isSetUnionid()) {
            sb2.append(j2.O);
            sb2.append("unionid:");
            String str9 = this.unionid;
            if (str9 == null) {
                sb2.append("null");
            } else {
                sb2.append(str9);
            }
        }
        sb2.append(j2.O);
        sb2.append("provider:");
        String str10 = this.provider;
        if (str10 == null) {
            sb2.append("null");
        } else {
            sb2.append(str10);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAsecret() {
        this.asecret = null;
    }

    public void unsetAtoken() {
        this.atoken = null;
    }

    public void unsetExpires_at() {
        this.expires_at = null;
    }

    public void unsetGender() {
        this.gender = null;
    }

    public void unsetImage_url() {
        this.image_url = null;
    }

    public void unsetNickname() {
        this.nickname = null;
    }

    public void unsetOpenid() {
        this.openid = null;
    }

    public void unsetProvider() {
        this.provider = null;
    }

    public void unsetUid() {
        this.uid = null;
    }

    public void unsetUnionid() {
        this.unionid = null;
    }

    public void validate() throws TException {
        if (this.nickname == null) {
            throw new TProtocolException("Required field 'nickname' was not present! Struct: " + toString());
        }
        if (this.provider != null) {
            return;
        }
        throw new TProtocolException("Required field 'provider' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(ThirdPartyUserInfo other) {
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
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo11 = Boolean.valueOf(isSetUid()).compareTo(Boolean.valueOf(other.isSetUid()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetUid() && (compareTo10 = TBaseHelper.compareTo(this.uid, other.uid)) != 0) {
            return compareTo10;
        }
        int compareTo12 = Boolean.valueOf(isSetNickname()).compareTo(Boolean.valueOf(other.isSetNickname()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetNickname() && (compareTo9 = TBaseHelper.compareTo(this.nickname, other.nickname)) != 0) {
            return compareTo9;
        }
        int compareTo13 = Boolean.valueOf(isSetAtoken()).compareTo(Boolean.valueOf(other.isSetAtoken()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetAtoken() && (compareTo8 = TBaseHelper.compareTo(this.atoken, other.atoken)) != 0) {
            return compareTo8;
        }
        int compareTo14 = Boolean.valueOf(isSetAsecret()).compareTo(Boolean.valueOf(other.isSetAsecret()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (isSetAsecret() && (compareTo7 = TBaseHelper.compareTo(this.asecret, other.asecret)) != 0) {
            return compareTo7;
        }
        int compareTo15 = Boolean.valueOf(isSetExpires_at()).compareTo(Boolean.valueOf(other.isSetExpires_at()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (isSetExpires_at() && (compareTo6 = TBaseHelper.compareTo(this.expires_at, other.expires_at)) != 0) {
            return compareTo6;
        }
        int compareTo16 = Boolean.valueOf(isSetGender()).compareTo(Boolean.valueOf(other.isSetGender()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (isSetGender() && (compareTo5 = TBaseHelper.compareTo(this.gender, other.gender)) != 0) {
            return compareTo5;
        }
        int compareTo17 = Boolean.valueOf(isSetImage_url()).compareTo(Boolean.valueOf(other.isSetImage_url()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (isSetImage_url() && (compareTo4 = TBaseHelper.compareTo(this.image_url, other.image_url)) != 0) {
            return compareTo4;
        }
        int compareTo18 = Boolean.valueOf(isSetOpenid()).compareTo(Boolean.valueOf(other.isSetOpenid()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (isSetOpenid() && (compareTo3 = TBaseHelper.compareTo(this.openid, other.openid)) != 0) {
            return compareTo3;
        }
        int compareTo19 = Boolean.valueOf(isSetUnionid()).compareTo(Boolean.valueOf(other.isSetUnionid()));
        if (compareTo19 != 0) {
            return compareTo19;
        }
        if (isSetUnionid() && (compareTo2 = TBaseHelper.compareTo(this.unionid, other.unionid)) != 0) {
            return compareTo2;
        }
        int compareTo20 = Boolean.valueOf(isSetProvider()).compareTo(Boolean.valueOf(other.isSetProvider()));
        if (compareTo20 != 0) {
            return compareTo20;
        }
        if (!isSetProvider() || (compareTo = TBaseHelper.compareTo(this.provider, other.provider)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<ThirdPartyUserInfo, _Fields> deepCopy2() {
        return new ThirdPartyUserInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$ThirdPartyUserInfo$_Fields[field.ordinal()]) {
            case 1:
                return getUid();
            case 2:
                return getNickname();
            case 3:
                return getAtoken();
            case 4:
                return getAsecret();
            case 5:
                return getExpires_at();
            case 6:
                return getGender();
            case 7:
                return getImage_url();
            case 8:
                return getOpenid();
            case 9:
                return getUnionid();
            case 10:
                return getProvider();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$ThirdPartyUserInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetUid();
            case 2:
                return isSetNickname();
            case 3:
                return isSetAtoken();
            case 4:
                return isSetAsecret();
            case 5:
                return isSetExpires_at();
            case 6:
                return isSetGender();
            case 7:
                return isSetImage_url();
            case 8:
                return isSetOpenid();
            case 9:
                return isSetUnionid();
            case 10:
                return isSetProvider();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$ThirdPartyUserInfo$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setUid((String) value);
                    break;
                } else {
                    unsetUid();
                    break;
                }
            case 2:
                if (value != null) {
                    setNickname((String) value);
                    break;
                } else {
                    unsetNickname();
                    break;
                }
            case 3:
                if (value != null) {
                    setAtoken((String) value);
                    break;
                } else {
                    unsetAtoken();
                    break;
                }
            case 4:
                if (value != null) {
                    setAsecret((String) value);
                    break;
                } else {
                    unsetAsecret();
                    break;
                }
            case 5:
                if (value != null) {
                    setExpires_at((String) value);
                    break;
                } else {
                    unsetExpires_at();
                    break;
                }
            case 6:
                if (value != null) {
                    setGender((String) value);
                    break;
                } else {
                    unsetGender();
                    break;
                }
            case 7:
                if (value != null) {
                    setImage_url((String) value);
                    break;
                } else {
                    unsetImage_url();
                    break;
                }
            case 8:
                if (value != null) {
                    setOpenid((String) value);
                    break;
                } else {
                    unsetOpenid();
                    break;
                }
            case 9:
                if (value != null) {
                    setUnionid((String) value);
                    break;
                } else {
                    unsetUnionid();
                    break;
                }
            case 10:
                if (value != null) {
                    setProvider((String) value);
                    break;
                } else {
                    unsetProvider();
                    break;
                }
        }
    }

    public ThirdPartyUserInfo(String nickname, String provider) {
        this();
        this.nickname = nickname;
        this.provider = provider;
    }

    public boolean equals(ThirdPartyUserInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetUid = isSetUid();
        boolean isSetUid2 = that.isSetUid();
        if ((isSetUid || isSetUid2) && !(isSetUid && isSetUid2 && this.uid.equals(that.uid))) {
            return false;
        }
        boolean isSetNickname = isSetNickname();
        boolean isSetNickname2 = that.isSetNickname();
        if ((isSetNickname || isSetNickname2) && !(isSetNickname && isSetNickname2 && this.nickname.equals(that.nickname))) {
            return false;
        }
        boolean isSetAtoken = isSetAtoken();
        boolean isSetAtoken2 = that.isSetAtoken();
        if ((isSetAtoken || isSetAtoken2) && !(isSetAtoken && isSetAtoken2 && this.atoken.equals(that.atoken))) {
            return false;
        }
        boolean isSetAsecret = isSetAsecret();
        boolean isSetAsecret2 = that.isSetAsecret();
        if ((isSetAsecret || isSetAsecret2) && !(isSetAsecret && isSetAsecret2 && this.asecret.equals(that.asecret))) {
            return false;
        }
        boolean isSetExpires_at = isSetExpires_at();
        boolean isSetExpires_at2 = that.isSetExpires_at();
        if ((isSetExpires_at || isSetExpires_at2) && !(isSetExpires_at && isSetExpires_at2 && this.expires_at.equals(that.expires_at))) {
            return false;
        }
        boolean isSetGender = isSetGender();
        boolean isSetGender2 = that.isSetGender();
        if ((isSetGender || isSetGender2) && !(isSetGender && isSetGender2 && this.gender.equals(that.gender))) {
            return false;
        }
        boolean isSetImage_url = isSetImage_url();
        boolean isSetImage_url2 = that.isSetImage_url();
        if ((isSetImage_url || isSetImage_url2) && !(isSetImage_url && isSetImage_url2 && this.image_url.equals(that.image_url))) {
            return false;
        }
        boolean isSetOpenid = isSetOpenid();
        boolean isSetOpenid2 = that.isSetOpenid();
        if ((isSetOpenid || isSetOpenid2) && !(isSetOpenid && isSetOpenid2 && this.openid.equals(that.openid))) {
            return false;
        }
        boolean isSetUnionid = isSetUnionid();
        boolean isSetUnionid2 = that.isSetUnionid();
        if ((isSetUnionid || isSetUnionid2) && !(isSetUnionid && isSetUnionid2 && this.unionid.equals(that.unionid))) {
            return false;
        }
        boolean isSetProvider = isSetProvider();
        boolean isSetProvider2 = that.isSetProvider();
        if (isSetProvider || isSetProvider2) {
            return isSetProvider && isSetProvider2 && this.provider.equals(that.provider);
        }
        return true;
    }

    public ThirdPartyUserInfo(ThirdPartyUserInfo other) {
        this.optionals = new _Fields[]{_Fields.UID, _Fields.ATOKEN, _Fields.ASECRET, _Fields.EXPIRES_AT, _Fields.GENDER, _Fields.IMAGE_URL, _Fields.OPENID, _Fields.UNIONID};
        if (other.isSetUid()) {
            this.uid = other.uid;
        }
        if (other.isSetNickname()) {
            this.nickname = other.nickname;
        }
        if (other.isSetAtoken()) {
            this.atoken = other.atoken;
        }
        if (other.isSetAsecret()) {
            this.asecret = other.asecret;
        }
        if (other.isSetExpires_at()) {
            this.expires_at = other.expires_at;
        }
        if (other.isSetGender()) {
            this.gender = other.gender;
        }
        if (other.isSetImage_url()) {
            this.image_url = other.image_url;
        }
        if (other.isSetOpenid()) {
            this.openid = other.openid;
        }
        if (other.isSetUnionid()) {
            this.unionid = other.unionid;
        }
        if (other.isSetProvider()) {
            this.provider = other.provider;
        }
    }
}
