package com.baicizhan.online.unified_user_service;

import com.tencent.open.SocialOperation;
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
public class UserBindInfo implements TBase<UserBindInfo, _Fields>, Serializable, Cloneable, Comparable<UserBindInfo> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public String nickname;
    public String openid;
    public String provider;
    public String unionid;
    private static final TStruct STRUCT_DESC = new TStruct("UserBindInfo");
    private static final TField PROVIDER_FIELD_DESC = new TField(ma.b.f72911h1, (byte) 11, 1);
    private static final TField OPENID_FIELD_DESC = new TField("openid", (byte) 11, 2);
    private static final TField UNIONID_FIELD_DESC = new TField(SocialOperation.GAME_UNION_ID, (byte) 11, 3);
    private static final TField NICKNAME_FIELD_DESC = new TField("nickname", (byte) 11, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.unified_user_service.UserBindInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$unified_user_service$UserBindInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$unified_user_service$UserBindInfo$_Fields = iArr;
            try {
                iArr[_Fields.PROVIDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$UserBindInfo$_Fields[_Fields.OPENID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$UserBindInfo$_Fields[_Fields.UNIONID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$UserBindInfo$_Fields[_Fields.NICKNAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBindInfoStandardScheme extends StandardScheme<UserBindInfo> {
        private UserBindInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserBindInfo struct) throws TException {
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
                            } else if (b11 == 11) {
                                struct.nickname = iprot.readString();
                                struct.setNicknameIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 11) {
                            struct.unionid = iprot.readString();
                            struct.setUnionidIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.openid = iprot.readString();
                        struct.setOpenidIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.provider = iprot.readString();
                    struct.setProviderIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, UserBindInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserBindInfo.STRUCT_DESC);
            if (struct.provider != null) {
                oprot.writeFieldBegin(UserBindInfo.PROVIDER_FIELD_DESC);
                oprot.writeString(struct.provider);
                oprot.writeFieldEnd();
            }
            if (struct.openid != null) {
                oprot.writeFieldBegin(UserBindInfo.OPENID_FIELD_DESC);
                oprot.writeString(struct.openid);
                oprot.writeFieldEnd();
            }
            if (struct.unionid != null) {
                oprot.writeFieldBegin(UserBindInfo.UNIONID_FIELD_DESC);
                oprot.writeString(struct.unionid);
                oprot.writeFieldEnd();
            }
            if (struct.nickname != null) {
                oprot.writeFieldBegin(UserBindInfo.NICKNAME_FIELD_DESC);
                oprot.writeString(struct.nickname);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBindInfoStandardSchemeFactory implements SchemeFactory {
        private UserBindInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserBindInfoStandardScheme getScheme() {
            return new UserBindInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBindInfoTupleScheme extends TupleScheme<UserBindInfo> {
        private UserBindInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserBindInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.provider = tTupleProtocol.readString();
            struct.setProviderIsSet(true);
            struct.openid = tTupleProtocol.readString();
            struct.setOpenidIsSet(true);
            struct.unionid = tTupleProtocol.readString();
            struct.setUnionidIsSet(true);
            struct.nickname = tTupleProtocol.readString();
            struct.setNicknameIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserBindInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.provider);
            tTupleProtocol.writeString(struct.openid);
            tTupleProtocol.writeString(struct.unionid);
            tTupleProtocol.writeString(struct.nickname);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBindInfoTupleSchemeFactory implements SchemeFactory {
        private UserBindInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserBindInfoTupleScheme getScheme() {
            return new UserBindInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        PROVIDER(1, ma.b.f72911h1),
        OPENID(2, "openid"),
        UNIONID(3, SocialOperation.GAME_UNION_ID),
        NICKNAME(4, "nickname");

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
                return PROVIDER;
            }
            if (fieldId == 2) {
                return OPENID;
            }
            if (fieldId == 3) {
                return UNIONID;
            }
            if (fieldId != 4) {
                return null;
            }
            return NICKNAME;
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
        hashMap.put(StandardScheme.class, new UserBindInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserBindInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.PROVIDER, (_Fields) new FieldMetaData(ma.b.f72911h1, (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.OPENID, (_Fields) new FieldMetaData("openid", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.UNIONID, (_Fields) new FieldMetaData(SocialOperation.GAME_UNION_ID, (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.NICKNAME, (_Fields) new FieldMetaData("nickname", (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserBindInfo.class, unmodifiableMap);
    }

    public UserBindInfo() {
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
        this.openid = null;
        this.unionid = null;
        this.nickname = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserBindInfo)) {
            return equals((UserBindInfo) that);
        }
        return false;
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

    public String getUnionid() {
        return this.unionid;
    }

    public int hashCode() {
        return 0;
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

    public boolean isSetUnionid() {
        return this.unionid != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserBindInfo setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public void setNicknameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.nickname = null;
    }

    public UserBindInfo setOpenid(String openid) {
        this.openid = openid;
        return this;
    }

    public void setOpenidIsSet(boolean value) {
        if (value) {
            return;
        }
        this.openid = null;
    }

    public UserBindInfo setProvider(String provider) {
        this.provider = provider;
        return this;
    }

    public void setProviderIsSet(boolean value) {
        if (value) {
            return;
        }
        this.provider = null;
    }

    public UserBindInfo setUnionid(String unionid) {
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
        StringBuilder sb2 = new StringBuilder("UserBindInfo(");
        sb2.append("provider:");
        String str = this.provider;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("openid:");
        String str2 = this.openid;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("unionid:");
        String str3 = this.unionid;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(j2.O);
        sb2.append("nickname:");
        String str4 = this.nickname;
        if (str4 == null) {
            sb2.append("null");
        } else {
            sb2.append(str4);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
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

    public void unsetUnionid() {
        this.unionid = null;
    }

    public void validate() throws TException {
        if (this.provider == null) {
            throw new TProtocolException("Required field 'provider' was not present! Struct: " + toString());
        }
        if (this.openid == null) {
            throw new TProtocolException("Required field 'openid' was not present! Struct: " + toString());
        }
        if (this.unionid == null) {
            throw new TProtocolException("Required field 'unionid' was not present! Struct: " + toString());
        }
        if (this.nickname != null) {
            return;
        }
        throw new TProtocolException("Required field 'nickname' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    public UserBindInfo(String provider, String openid, String unionid, String nickname) {
        this();
        this.provider = provider;
        this.openid = openid;
        this.unionid = unionid;
        this.nickname = nickname;
    }

    @Override // java.lang.Comparable
    public int compareTo(UserBindInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetProvider()).compareTo(Boolean.valueOf(other.isSetProvider()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetProvider() && (compareTo4 = TBaseHelper.compareTo(this.provider, other.provider)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetOpenid()).compareTo(Boolean.valueOf(other.isSetOpenid()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetOpenid() && (compareTo3 = TBaseHelper.compareTo(this.openid, other.openid)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetUnionid()).compareTo(Boolean.valueOf(other.isSetUnionid()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetUnionid() && (compareTo2 = TBaseHelper.compareTo(this.unionid, other.unionid)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetNickname()).compareTo(Boolean.valueOf(other.isSetNickname()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetNickname() || (compareTo = TBaseHelper.compareTo(this.nickname, other.nickname)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserBindInfo, _Fields> deepCopy2() {
        return new UserBindInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$UserBindInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getProvider();
        }
        if (i11 == 2) {
            return getOpenid();
        }
        if (i11 == 3) {
            return getUnionid();
        }
        if (i11 == 4) {
            return getNickname();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$UserBindInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetProvider();
        }
        if (i11 == 2) {
            return isSetOpenid();
        }
        if (i11 == 3) {
            return isSetUnionid();
        }
        if (i11 == 4) {
            return isSetNickname();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$UserBindInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetProvider();
                return;
            } else {
                setProvider((String) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetOpenid();
                return;
            } else {
                setOpenid((String) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetUnionid();
                return;
            } else {
                setUnionid((String) value);
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetNickname();
        } else {
            setNickname((String) value);
        }
    }

    public boolean equals(UserBindInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetProvider = isSetProvider();
        boolean isSetProvider2 = that.isSetProvider();
        if ((isSetProvider || isSetProvider2) && !(isSetProvider && isSetProvider2 && this.provider.equals(that.provider))) {
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
        boolean isSetNickname = isSetNickname();
        boolean isSetNickname2 = that.isSetNickname();
        if (isSetNickname || isSetNickname2) {
            return isSetNickname && isSetNickname2 && this.nickname.equals(that.nickname);
        }
        return true;
    }

    public UserBindInfo(UserBindInfo other) {
        if (other.isSetProvider()) {
            this.provider = other.provider;
        }
        if (other.isSetOpenid()) {
            this.openid = other.openid;
        }
        if (other.isSetUnionid()) {
            this.unionid = other.unionid;
        }
        if (other.isSetNickname()) {
            this.nickname = other.nickname;
        }
    }
}
