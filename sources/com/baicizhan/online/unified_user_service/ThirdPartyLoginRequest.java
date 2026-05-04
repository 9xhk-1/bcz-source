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
public class ThirdPartyLoginRequest implements TBase<ThirdPartyLoginRequest, _Fields>, Serializable, Cloneable, Comparable<ThirdPartyLoginRequest> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public String api_token;
    public String code;
    public String device;
    public String gender;
    public String image_url;
    public String nickname;
    public String openid;
    private _Fields[] optionals;
    public String provider;
    public String token_expire;
    public String uid;
    public String unionid;
    private static final TStruct STRUCT_DESC = new TStruct("ThirdPartyLoginRequest");
    private static final TField PROVIDER_FIELD_DESC = new TField(ma.b.f72911h1, (byte) 11, 1);
    private static final TField UID_FIELD_DESC = new TField("uid", (byte) 11, 2);
    private static final TField NICKNAME_FIELD_DESC = new TField("nickname", (byte) 11, 3);
    private static final TField IMAGE_URL_FIELD_DESC = new TField("image_url", (byte) 11, 4);
    private static final TField GENDER_FIELD_DESC = new TField("gender", (byte) 11, 5);
    private static final TField API_TOKEN_FIELD_DESC = new TField("api_token", (byte) 11, 6);
    private static final TField TOKEN_EXPIRE_FIELD_DESC = new TField("token_expire", (byte) 11, 7);
    private static final TField DEVICE_FIELD_DESC = new TField("device", (byte) 11, 8);
    private static final TField UNIONID_FIELD_DESC = new TField(SocialOperation.GAME_UNION_ID, (byte) 11, 9);
    private static final TField OPENID_FIELD_DESC = new TField("openid", (byte) 11, 10);
    private static final TField CODE_FIELD_DESC = new TField("code", (byte) 11, 11);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.unified_user_service.ThirdPartyLoginRequest$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$unified_user_service$ThirdPartyLoginRequest$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$unified_user_service$ThirdPartyLoginRequest$_Fields = iArr;
            try {
                iArr[_Fields.PROVIDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$ThirdPartyLoginRequest$_Fields[_Fields.UID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$ThirdPartyLoginRequest$_Fields[_Fields.NICKNAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$ThirdPartyLoginRequest$_Fields[_Fields.IMAGE_URL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$ThirdPartyLoginRequest$_Fields[_Fields.GENDER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$ThirdPartyLoginRequest$_Fields[_Fields.API_TOKEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$ThirdPartyLoginRequest$_Fields[_Fields.TOKEN_EXPIRE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$ThirdPartyLoginRequest$_Fields[_Fields.DEVICE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$ThirdPartyLoginRequest$_Fields[_Fields.UNIONID.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$ThirdPartyLoginRequest$_Fields[_Fields.OPENID.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$ThirdPartyLoginRequest$_Fields[_Fields.CODE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ThirdPartyLoginRequestStandardScheme extends StandardScheme<ThirdPartyLoginRequest> {
        private ThirdPartyLoginRequestStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, ThirdPartyLoginRequest struct) throws TException {
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
                            struct.provider = iprot.readString();
                            struct.setProviderIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.uid = iprot.readString();
                            struct.setUidIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.nickname = iprot.readString();
                            struct.setNicknameIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.image_url = iprot.readString();
                            struct.setImage_urlIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.gender = iprot.readString();
                            struct.setGenderIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.api_token = iprot.readString();
                            struct.setApi_tokenIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.token_expire = iprot.readString();
                            struct.setToken_expireIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.device = iprot.readString();
                            struct.setDeviceIsSet(true);
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
                            struct.openid = iprot.readString();
                            struct.setOpenidIsSet(true);
                            break;
                        }
                    case 11:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.code = iprot.readString();
                            struct.setCodeIsSet(true);
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
        public void write(TProtocol oprot, ThirdPartyLoginRequest struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(ThirdPartyLoginRequest.STRUCT_DESC);
            if (struct.provider != null) {
                oprot.writeFieldBegin(ThirdPartyLoginRequest.PROVIDER_FIELD_DESC);
                oprot.writeString(struct.provider);
                oprot.writeFieldEnd();
            }
            if (struct.uid != null && struct.isSetUid()) {
                oprot.writeFieldBegin(ThirdPartyLoginRequest.UID_FIELD_DESC);
                oprot.writeString(struct.uid);
                oprot.writeFieldEnd();
            }
            if (struct.nickname != null) {
                oprot.writeFieldBegin(ThirdPartyLoginRequest.NICKNAME_FIELD_DESC);
                oprot.writeString(struct.nickname);
                oprot.writeFieldEnd();
            }
            if (struct.image_url != null) {
                oprot.writeFieldBegin(ThirdPartyLoginRequest.IMAGE_URL_FIELD_DESC);
                oprot.writeString(struct.image_url);
                oprot.writeFieldEnd();
            }
            if (struct.gender != null) {
                oprot.writeFieldBegin(ThirdPartyLoginRequest.GENDER_FIELD_DESC);
                oprot.writeString(struct.gender);
                oprot.writeFieldEnd();
            }
            if (struct.api_token != null && struct.isSetApi_token()) {
                oprot.writeFieldBegin(ThirdPartyLoginRequest.API_TOKEN_FIELD_DESC);
                oprot.writeString(struct.api_token);
                oprot.writeFieldEnd();
            }
            if (struct.token_expire != null && struct.isSetToken_expire()) {
                oprot.writeFieldBegin(ThirdPartyLoginRequest.TOKEN_EXPIRE_FIELD_DESC);
                oprot.writeString(struct.token_expire);
                oprot.writeFieldEnd();
            }
            if (struct.device != null && struct.isSetDevice()) {
                oprot.writeFieldBegin(ThirdPartyLoginRequest.DEVICE_FIELD_DESC);
                oprot.writeString(struct.device);
                oprot.writeFieldEnd();
            }
            if (struct.unionid != null && struct.isSetUnionid()) {
                oprot.writeFieldBegin(ThirdPartyLoginRequest.UNIONID_FIELD_DESC);
                oprot.writeString(struct.unionid);
                oprot.writeFieldEnd();
            }
            if (struct.openid != null && struct.isSetOpenid()) {
                oprot.writeFieldBegin(ThirdPartyLoginRequest.OPENID_FIELD_DESC);
                oprot.writeString(struct.openid);
                oprot.writeFieldEnd();
            }
            if (struct.code != null && struct.isSetCode()) {
                oprot.writeFieldBegin(ThirdPartyLoginRequest.CODE_FIELD_DESC);
                oprot.writeString(struct.code);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ThirdPartyLoginRequestStandardSchemeFactory implements SchemeFactory {
        private ThirdPartyLoginRequestStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ThirdPartyLoginRequestStandardScheme getScheme() {
            return new ThirdPartyLoginRequestStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ThirdPartyLoginRequestTupleScheme extends TupleScheme<ThirdPartyLoginRequest> {
        private ThirdPartyLoginRequestTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, ThirdPartyLoginRequest struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.provider = tTupleProtocol.readString();
            struct.setProviderIsSet(true);
            struct.nickname = tTupleProtocol.readString();
            struct.setNicknameIsSet(true);
            struct.image_url = tTupleProtocol.readString();
            struct.setImage_urlIsSet(true);
            struct.gender = tTupleProtocol.readString();
            struct.setGenderIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(7);
            if (readBitSet.get(0)) {
                struct.uid = tTupleProtocol.readString();
                struct.setUidIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.api_token = tTupleProtocol.readString();
                struct.setApi_tokenIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.token_expire = tTupleProtocol.readString();
                struct.setToken_expireIsSet(true);
            }
            if (readBitSet.get(3)) {
                struct.device = tTupleProtocol.readString();
                struct.setDeviceIsSet(true);
            }
            if (readBitSet.get(4)) {
                struct.unionid = tTupleProtocol.readString();
                struct.setUnionidIsSet(true);
            }
            if (readBitSet.get(5)) {
                struct.openid = tTupleProtocol.readString();
                struct.setOpenidIsSet(true);
            }
            if (readBitSet.get(6)) {
                struct.code = tTupleProtocol.readString();
                struct.setCodeIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, ThirdPartyLoginRequest struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.provider);
            tTupleProtocol.writeString(struct.nickname);
            tTupleProtocol.writeString(struct.image_url);
            tTupleProtocol.writeString(struct.gender);
            BitSet bitSet = new BitSet();
            if (struct.isSetUid()) {
                bitSet.set(0);
            }
            if (struct.isSetApi_token()) {
                bitSet.set(1);
            }
            if (struct.isSetToken_expire()) {
                bitSet.set(2);
            }
            if (struct.isSetDevice()) {
                bitSet.set(3);
            }
            if (struct.isSetUnionid()) {
                bitSet.set(4);
            }
            if (struct.isSetOpenid()) {
                bitSet.set(5);
            }
            if (struct.isSetCode()) {
                bitSet.set(6);
            }
            tTupleProtocol.writeBitSet(bitSet, 7);
            if (struct.isSetUid()) {
                tTupleProtocol.writeString(struct.uid);
            }
            if (struct.isSetApi_token()) {
                tTupleProtocol.writeString(struct.api_token);
            }
            if (struct.isSetToken_expire()) {
                tTupleProtocol.writeString(struct.token_expire);
            }
            if (struct.isSetDevice()) {
                tTupleProtocol.writeString(struct.device);
            }
            if (struct.isSetUnionid()) {
                tTupleProtocol.writeString(struct.unionid);
            }
            if (struct.isSetOpenid()) {
                tTupleProtocol.writeString(struct.openid);
            }
            if (struct.isSetCode()) {
                tTupleProtocol.writeString(struct.code);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ThirdPartyLoginRequestTupleSchemeFactory implements SchemeFactory {
        private ThirdPartyLoginRequestTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ThirdPartyLoginRequestTupleScheme getScheme() {
            return new ThirdPartyLoginRequestTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        PROVIDER(1, ma.b.f72911h1),
        UID(2, "uid"),
        NICKNAME(3, "nickname"),
        IMAGE_URL(4, "image_url"),
        GENDER(5, "gender"),
        API_TOKEN(6, "api_token"),
        TOKEN_EXPIRE(7, "token_expire"),
        DEVICE(8, "device"),
        UNIONID(9, SocialOperation.GAME_UNION_ID),
        OPENID(10, "openid"),
        CODE(11, "code");

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
                    return PROVIDER;
                case 2:
                    return UID;
                case 3:
                    return NICKNAME;
                case 4:
                    return IMAGE_URL;
                case 5:
                    return GENDER;
                case 6:
                    return API_TOKEN;
                case 7:
                    return TOKEN_EXPIRE;
                case 8:
                    return DEVICE;
                case 9:
                    return UNIONID;
                case 10:
                    return OPENID;
                case 11:
                    return CODE;
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
        hashMap.put(StandardScheme.class, new ThirdPartyLoginRequestStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new ThirdPartyLoginRequestTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.PROVIDER, (_Fields) new FieldMetaData(ma.b.f72911h1, (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.UID, (_Fields) new FieldMetaData("uid", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.NICKNAME, (_Fields) new FieldMetaData("nickname", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.IMAGE_URL, (_Fields) new FieldMetaData("image_url", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.GENDER, (_Fields) new FieldMetaData("gender", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.API_TOKEN, (_Fields) new FieldMetaData("api_token", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.TOKEN_EXPIRE, (_Fields) new FieldMetaData("token_expire", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.DEVICE, (_Fields) new FieldMetaData("device", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.UNIONID, (_Fields) new FieldMetaData(SocialOperation.GAME_UNION_ID, (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.OPENID, (_Fields) new FieldMetaData("openid", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.CODE, (_Fields) new FieldMetaData("code", (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(ThirdPartyLoginRequest.class, unmodifiableMap);
    }

    public ThirdPartyLoginRequest() {
        this.optionals = new _Fields[]{_Fields.UID, _Fields.API_TOKEN, _Fields.TOKEN_EXPIRE, _Fields.DEVICE, _Fields.UNIONID, _Fields.OPENID, _Fields.CODE};
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
        this.provider = null;
        this.uid = null;
        this.nickname = null;
        this.image_url = null;
        this.gender = null;
        this.api_token = null;
        this.token_expire = null;
        this.device = null;
        this.unionid = null;
        this.openid = null;
        this.code = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof ThirdPartyLoginRequest)) {
            return equals((ThirdPartyLoginRequest) that);
        }
        return false;
    }

    public String getApi_token() {
        return this.api_token;
    }

    public String getCode() {
        return this.code;
    }

    public String getDevice() {
        return this.device;
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

    public String getToken_expire() {
        return this.token_expire;
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

    public boolean isSetApi_token() {
        return this.api_token != null;
    }

    public boolean isSetCode() {
        return this.code != null;
    }

    public boolean isSetDevice() {
        return this.device != null;
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

    public boolean isSetToken_expire() {
        return this.token_expire != null;
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

    public ThirdPartyLoginRequest setApi_token(String api_token) {
        this.api_token = api_token;
        return this;
    }

    public void setApi_tokenIsSet(boolean value) {
        if (value) {
            return;
        }
        this.api_token = null;
    }

    public ThirdPartyLoginRequest setCode(String code) {
        this.code = code;
        return this;
    }

    public void setCodeIsSet(boolean value) {
        if (value) {
            return;
        }
        this.code = null;
    }

    public ThirdPartyLoginRequest setDevice(String device) {
        this.device = device;
        return this;
    }

    public void setDeviceIsSet(boolean value) {
        if (value) {
            return;
        }
        this.device = null;
    }

    public ThirdPartyLoginRequest setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public void setGenderIsSet(boolean value) {
        if (value) {
            return;
        }
        this.gender = null;
    }

    public ThirdPartyLoginRequest setImage_url(String image_url) {
        this.image_url = image_url;
        return this;
    }

    public void setImage_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.image_url = null;
    }

    public ThirdPartyLoginRequest setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public void setNicknameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.nickname = null;
    }

    public ThirdPartyLoginRequest setOpenid(String openid) {
        this.openid = openid;
        return this;
    }

    public void setOpenidIsSet(boolean value) {
        if (value) {
            return;
        }
        this.openid = null;
    }

    public ThirdPartyLoginRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }

    public void setProviderIsSet(boolean value) {
        if (value) {
            return;
        }
        this.provider = null;
    }

    public ThirdPartyLoginRequest setToken_expire(String token_expire) {
        this.token_expire = token_expire;
        return this;
    }

    public void setToken_expireIsSet(boolean value) {
        if (value) {
            return;
        }
        this.token_expire = null;
    }

    public ThirdPartyLoginRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }

    public void setUidIsSet(boolean value) {
        if (value) {
            return;
        }
        this.uid = null;
    }

    public ThirdPartyLoginRequest setUnionid(String unionid) {
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
        StringBuilder sb2 = new StringBuilder("ThirdPartyLoginRequest(");
        sb2.append("provider:");
        String str = this.provider;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        if (isSetUid()) {
            sb2.append(j2.O);
            sb2.append("uid:");
            String str2 = this.uid;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
        }
        sb2.append(j2.O);
        sb2.append("nickname:");
        String str3 = this.nickname;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(j2.O);
        sb2.append("image_url:");
        String str4 = this.image_url;
        if (str4 == null) {
            sb2.append("null");
        } else {
            sb2.append(str4);
        }
        sb2.append(j2.O);
        sb2.append("gender:");
        String str5 = this.gender;
        if (str5 == null) {
            sb2.append("null");
        } else {
            sb2.append(str5);
        }
        if (isSetApi_token()) {
            sb2.append(j2.O);
            sb2.append("api_token:");
            String str6 = this.api_token;
            if (str6 == null) {
                sb2.append("null");
            } else {
                sb2.append(str6);
            }
        }
        if (isSetToken_expire()) {
            sb2.append(j2.O);
            sb2.append("token_expire:");
            String str7 = this.token_expire;
            if (str7 == null) {
                sb2.append("null");
            } else {
                sb2.append(str7);
            }
        }
        if (isSetDevice()) {
            sb2.append(j2.O);
            sb2.append("device:");
            String str8 = this.device;
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
        if (isSetOpenid()) {
            sb2.append(j2.O);
            sb2.append("openid:");
            String str10 = this.openid;
            if (str10 == null) {
                sb2.append("null");
            } else {
                sb2.append(str10);
            }
        }
        if (isSetCode()) {
            sb2.append(j2.O);
            sb2.append("code:");
            String str11 = this.code;
            if (str11 == null) {
                sb2.append("null");
            } else {
                sb2.append(str11);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetApi_token() {
        this.api_token = null;
    }

    public void unsetCode() {
        this.code = null;
    }

    public void unsetDevice() {
        this.device = null;
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

    public void unsetToken_expire() {
        this.token_expire = null;
    }

    public void unsetUid() {
        this.uid = null;
    }

    public void unsetUnionid() {
        this.unionid = null;
    }

    public void validate() throws TException {
        if (this.provider == null) {
            throw new TProtocolException("Required field 'provider' was not present! Struct: " + toString());
        }
        if (this.nickname == null) {
            throw new TProtocolException("Required field 'nickname' was not present! Struct: " + toString());
        }
        if (this.image_url == null) {
            throw new TProtocolException("Required field 'image_url' was not present! Struct: " + toString());
        }
        if (this.gender != null) {
            return;
        }
        throw new TProtocolException("Required field 'gender' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(ThirdPartyLoginRequest other) {
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
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo12 = Boolean.valueOf(isSetProvider()).compareTo(Boolean.valueOf(other.isSetProvider()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetProvider() && (compareTo11 = TBaseHelper.compareTo(this.provider, other.provider)) != 0) {
            return compareTo11;
        }
        int compareTo13 = Boolean.valueOf(isSetUid()).compareTo(Boolean.valueOf(other.isSetUid()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetUid() && (compareTo10 = TBaseHelper.compareTo(this.uid, other.uid)) != 0) {
            return compareTo10;
        }
        int compareTo14 = Boolean.valueOf(isSetNickname()).compareTo(Boolean.valueOf(other.isSetNickname()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (isSetNickname() && (compareTo9 = TBaseHelper.compareTo(this.nickname, other.nickname)) != 0) {
            return compareTo9;
        }
        int compareTo15 = Boolean.valueOf(isSetImage_url()).compareTo(Boolean.valueOf(other.isSetImage_url()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (isSetImage_url() && (compareTo8 = TBaseHelper.compareTo(this.image_url, other.image_url)) != 0) {
            return compareTo8;
        }
        int compareTo16 = Boolean.valueOf(isSetGender()).compareTo(Boolean.valueOf(other.isSetGender()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (isSetGender() && (compareTo7 = TBaseHelper.compareTo(this.gender, other.gender)) != 0) {
            return compareTo7;
        }
        int compareTo17 = Boolean.valueOf(isSetApi_token()).compareTo(Boolean.valueOf(other.isSetApi_token()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (isSetApi_token() && (compareTo6 = TBaseHelper.compareTo(this.api_token, other.api_token)) != 0) {
            return compareTo6;
        }
        int compareTo18 = Boolean.valueOf(isSetToken_expire()).compareTo(Boolean.valueOf(other.isSetToken_expire()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (isSetToken_expire() && (compareTo5 = TBaseHelper.compareTo(this.token_expire, other.token_expire)) != 0) {
            return compareTo5;
        }
        int compareTo19 = Boolean.valueOf(isSetDevice()).compareTo(Boolean.valueOf(other.isSetDevice()));
        if (compareTo19 != 0) {
            return compareTo19;
        }
        if (isSetDevice() && (compareTo4 = TBaseHelper.compareTo(this.device, other.device)) != 0) {
            return compareTo4;
        }
        int compareTo20 = Boolean.valueOf(isSetUnionid()).compareTo(Boolean.valueOf(other.isSetUnionid()));
        if (compareTo20 != 0) {
            return compareTo20;
        }
        if (isSetUnionid() && (compareTo3 = TBaseHelper.compareTo(this.unionid, other.unionid)) != 0) {
            return compareTo3;
        }
        int compareTo21 = Boolean.valueOf(isSetOpenid()).compareTo(Boolean.valueOf(other.isSetOpenid()));
        if (compareTo21 != 0) {
            return compareTo21;
        }
        if (isSetOpenid() && (compareTo2 = TBaseHelper.compareTo(this.openid, other.openid)) != 0) {
            return compareTo2;
        }
        int compareTo22 = Boolean.valueOf(isSetCode()).compareTo(Boolean.valueOf(other.isSetCode()));
        if (compareTo22 != 0) {
            return compareTo22;
        }
        if (!isSetCode() || (compareTo = TBaseHelper.compareTo(this.code, other.code)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<ThirdPartyLoginRequest, _Fields> deepCopy2() {
        return new ThirdPartyLoginRequest(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$ThirdPartyLoginRequest$_Fields[field.ordinal()]) {
            case 1:
                return getProvider();
            case 2:
                return getUid();
            case 3:
                return getNickname();
            case 4:
                return getImage_url();
            case 5:
                return getGender();
            case 6:
                return getApi_token();
            case 7:
                return getToken_expire();
            case 8:
                return getDevice();
            case 9:
                return getUnionid();
            case 10:
                return getOpenid();
            case 11:
                return getCode();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$ThirdPartyLoginRequest$_Fields[field.ordinal()]) {
            case 1:
                return isSetProvider();
            case 2:
                return isSetUid();
            case 3:
                return isSetNickname();
            case 4:
                return isSetImage_url();
            case 5:
                return isSetGender();
            case 6:
                return isSetApi_token();
            case 7:
                return isSetToken_expire();
            case 8:
                return isSetDevice();
            case 9:
                return isSetUnionid();
            case 10:
                return isSetOpenid();
            case 11:
                return isSetCode();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$ThirdPartyLoginRequest$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setProvider((String) value);
                    break;
                } else {
                    unsetProvider();
                    break;
                }
            case 2:
                if (value != null) {
                    setUid((String) value);
                    break;
                } else {
                    unsetUid();
                    break;
                }
            case 3:
                if (value != null) {
                    setNickname((String) value);
                    break;
                } else {
                    unsetNickname();
                    break;
                }
            case 4:
                if (value != null) {
                    setImage_url((String) value);
                    break;
                } else {
                    unsetImage_url();
                    break;
                }
            case 5:
                if (value != null) {
                    setGender((String) value);
                    break;
                } else {
                    unsetGender();
                    break;
                }
            case 6:
                if (value != null) {
                    setApi_token((String) value);
                    break;
                } else {
                    unsetApi_token();
                    break;
                }
            case 7:
                if (value != null) {
                    setToken_expire((String) value);
                    break;
                } else {
                    unsetToken_expire();
                    break;
                }
            case 8:
                if (value != null) {
                    setDevice((String) value);
                    break;
                } else {
                    unsetDevice();
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
                    setOpenid((String) value);
                    break;
                } else {
                    unsetOpenid();
                    break;
                }
            case 11:
                if (value != null) {
                    setCode((String) value);
                    break;
                } else {
                    unsetCode();
                    break;
                }
        }
    }

    public ThirdPartyLoginRequest(String provider, String nickname, String image_url, String gender) {
        this();
        this.provider = provider;
        this.nickname = nickname;
        this.image_url = image_url;
        this.gender = gender;
    }

    public boolean equals(ThirdPartyLoginRequest that) {
        if (that == null) {
            return false;
        }
        boolean isSetProvider = isSetProvider();
        boolean isSetProvider2 = that.isSetProvider();
        if ((isSetProvider || isSetProvider2) && !(isSetProvider && isSetProvider2 && this.provider.equals(that.provider))) {
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
        boolean isSetImage_url = isSetImage_url();
        boolean isSetImage_url2 = that.isSetImage_url();
        if ((isSetImage_url || isSetImage_url2) && !(isSetImage_url && isSetImage_url2 && this.image_url.equals(that.image_url))) {
            return false;
        }
        boolean isSetGender = isSetGender();
        boolean isSetGender2 = that.isSetGender();
        if ((isSetGender || isSetGender2) && !(isSetGender && isSetGender2 && this.gender.equals(that.gender))) {
            return false;
        }
        boolean isSetApi_token = isSetApi_token();
        boolean isSetApi_token2 = that.isSetApi_token();
        if ((isSetApi_token || isSetApi_token2) && !(isSetApi_token && isSetApi_token2 && this.api_token.equals(that.api_token))) {
            return false;
        }
        boolean isSetToken_expire = isSetToken_expire();
        boolean isSetToken_expire2 = that.isSetToken_expire();
        if ((isSetToken_expire || isSetToken_expire2) && !(isSetToken_expire && isSetToken_expire2 && this.token_expire.equals(that.token_expire))) {
            return false;
        }
        boolean isSetDevice = isSetDevice();
        boolean isSetDevice2 = that.isSetDevice();
        if ((isSetDevice || isSetDevice2) && !(isSetDevice && isSetDevice2 && this.device.equals(that.device))) {
            return false;
        }
        boolean isSetUnionid = isSetUnionid();
        boolean isSetUnionid2 = that.isSetUnionid();
        if ((isSetUnionid || isSetUnionid2) && !(isSetUnionid && isSetUnionid2 && this.unionid.equals(that.unionid))) {
            return false;
        }
        boolean isSetOpenid = isSetOpenid();
        boolean isSetOpenid2 = that.isSetOpenid();
        if ((isSetOpenid || isSetOpenid2) && !(isSetOpenid && isSetOpenid2 && this.openid.equals(that.openid))) {
            return false;
        }
        boolean isSetCode = isSetCode();
        boolean isSetCode2 = that.isSetCode();
        if (isSetCode || isSetCode2) {
            return isSetCode && isSetCode2 && this.code.equals(that.code);
        }
        return true;
    }

    public ThirdPartyLoginRequest(ThirdPartyLoginRequest other) {
        this.optionals = new _Fields[]{_Fields.UID, _Fields.API_TOKEN, _Fields.TOKEN_EXPIRE, _Fields.DEVICE, _Fields.UNIONID, _Fields.OPENID, _Fields.CODE};
        if (other.isSetProvider()) {
            this.provider = other.provider;
        }
        if (other.isSetUid()) {
            this.uid = other.uid;
        }
        if (other.isSetNickname()) {
            this.nickname = other.nickname;
        }
        if (other.isSetImage_url()) {
            this.image_url = other.image_url;
        }
        if (other.isSetGender()) {
            this.gender = other.gender;
        }
        if (other.isSetApi_token()) {
            this.api_token = other.api_token;
        }
        if (other.isSetToken_expire()) {
            this.token_expire = other.token_expire;
        }
        if (other.isSetDevice()) {
            this.device = other.device;
        }
        if (other.isSetUnionid()) {
            this.unionid = other.unionid;
        }
        if (other.isSetOpenid()) {
            this.openid = other.openid;
        }
        if (other.isSetCode()) {
            this.code = other.code;
        }
    }
}
