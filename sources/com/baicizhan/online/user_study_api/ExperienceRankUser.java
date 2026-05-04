package com.baicizhan.online.user_study_api;

import com.baicizhan.client.business.dataset.provider.a;
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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class ExperienceRankUser implements TBase<ExperienceRankUser, _Fields>, Serializable, Cloneable, Comparable<ExperienceRankUser> {
    private static final int __ME_ISSET_ID = 1;
    private static final int __SCORE_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String avatar;

    /* renamed from: me, reason: collision with root package name */
    public boolean f28164me;
    public String nickname;
    public int score;
    private static final TStruct STRUCT_DESC = new TStruct("ExperienceRankUser");
    private static final TField NICKNAME_FIELD_DESC = new TField("nickname", (byte) 11, 1);
    private static final TField AVATAR_FIELD_DESC = new TField(q9.h.f81940d, (byte) 11, 2);
    private static final TField SCORE_FIELD_DESC = new TField(a.b.C0242a.f16107c, (byte) 8, 3);
    private static final TField ME_FIELD_DESC = new TField("me", (byte) 2, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.ExperienceRankUser$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$ExperienceRankUser$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$ExperienceRankUser$_Fields = iArr;
            try {
                iArr[_Fields.NICKNAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$ExperienceRankUser$_Fields[_Fields.AVATAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$ExperienceRankUser$_Fields[_Fields.SCORE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$ExperienceRankUser$_Fields[_Fields.ME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ExperienceRankUserStandardScheme extends StandardScheme<ExperienceRankUser> {
        private ExperienceRankUserStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, ExperienceRankUser struct) throws TException {
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
                            } else if (b11 == 2) {
                                struct.f28164me = iprot.readBool();
                                struct.setMeIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 8) {
                            struct.score = iprot.readI32();
                            struct.setScoreIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.avatar = iprot.readString();
                        struct.setAvatarIsSet(true);
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
            if (!struct.isSetScore()) {
                throw new TProtocolException("Required field 'score' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetMe()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'me' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, ExperienceRankUser struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(ExperienceRankUser.STRUCT_DESC);
            if (struct.nickname != null) {
                oprot.writeFieldBegin(ExperienceRankUser.NICKNAME_FIELD_DESC);
                oprot.writeString(struct.nickname);
                oprot.writeFieldEnd();
            }
            if (struct.avatar != null) {
                oprot.writeFieldBegin(ExperienceRankUser.AVATAR_FIELD_DESC);
                oprot.writeString(struct.avatar);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(ExperienceRankUser.SCORE_FIELD_DESC);
            oprot.writeI32(struct.score);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(ExperienceRankUser.ME_FIELD_DESC);
            oprot.writeBool(struct.f28164me);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ExperienceRankUserStandardSchemeFactory implements SchemeFactory {
        private ExperienceRankUserStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ExperienceRankUserStandardScheme getScheme() {
            return new ExperienceRankUserStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ExperienceRankUserTupleScheme extends TupleScheme<ExperienceRankUser> {
        private ExperienceRankUserTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, ExperienceRankUser struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.nickname = tTupleProtocol.readString();
            struct.setNicknameIsSet(true);
            struct.avatar = tTupleProtocol.readString();
            struct.setAvatarIsSet(true);
            struct.score = tTupleProtocol.readI32();
            struct.setScoreIsSet(true);
            struct.f28164me = tTupleProtocol.readBool();
            struct.setMeIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, ExperienceRankUser struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.nickname);
            tTupleProtocol.writeString(struct.avatar);
            tTupleProtocol.writeI32(struct.score);
            tTupleProtocol.writeBool(struct.f28164me);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ExperienceRankUserTupleSchemeFactory implements SchemeFactory {
        private ExperienceRankUserTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ExperienceRankUserTupleScheme getScheme() {
            return new ExperienceRankUserTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        NICKNAME(1, "nickname"),
        AVATAR(2, q9.h.f81940d),
        SCORE(3, a.b.C0242a.f16107c),
        ME(4, "me");

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
                return AVATAR;
            }
            if (fieldId == 3) {
                return SCORE;
            }
            if (fieldId != 4) {
                return null;
            }
            return ME;
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
        hashMap.put(StandardScheme.class, new ExperienceRankUserStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new ExperienceRankUserTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.NICKNAME, (_Fields) new FieldMetaData("nickname", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.AVATAR, (_Fields) new FieldMetaData(q9.h.f81940d, (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SCORE, (_Fields) new FieldMetaData(a.b.C0242a.f16107c, (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.ME, (_Fields) new FieldMetaData("me", (byte) 1, new FieldValueMetaData((byte) 2)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(ExperienceRankUser.class, unmodifiableMap);
    }

    public ExperienceRankUser() {
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
        this.nickname = null;
        this.avatar = null;
        setScoreIsSet(false);
        this.score = 0;
        setMeIsSet(false);
        this.f28164me = false;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof ExperienceRankUser)) {
            return equals((ExperienceRankUser) that);
        }
        return false;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getNickname() {
        return this.nickname;
    }

    public int getScore() {
        return this.score;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isMe() {
        return this.f28164me;
    }

    public boolean isSetAvatar() {
        return this.avatar != null;
    }

    public boolean isSetMe() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetNickname() {
        return this.nickname != null;
    }

    public boolean isSetScore() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public ExperienceRankUser setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }

    public void setAvatarIsSet(boolean value) {
        if (value) {
            return;
        }
        this.avatar = null;
    }

    public ExperienceRankUser setMe(boolean me2) {
        this.f28164me = me2;
        setMeIsSet(true);
        return this;
    }

    public void setMeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public ExperienceRankUser setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public void setNicknameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.nickname = null;
    }

    public ExperienceRankUser setScore(int score) {
        this.score = score;
        setScoreIsSet(true);
        return this;
    }

    public void setScoreIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ExperienceRankUser(");
        sb2.append("nickname:");
        String str = this.nickname;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("avatar:");
        String str2 = this.avatar;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("score:");
        sb2.append(this.score);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("me:");
        sb2.append(this.f28164me);
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAvatar() {
        this.avatar = null;
    }

    public void unsetMe() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetNickname() {
        this.nickname = null;
    }

    public void unsetScore() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void validate() throws TException {
        if (this.nickname == null) {
            throw new TProtocolException("Required field 'nickname' was not present! Struct: " + toString());
        }
        if (this.avatar != null) {
            return;
        }
        throw new TProtocolException("Required field 'avatar' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(ExperienceRankUser other) {
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
        int compareTo6 = Boolean.valueOf(isSetAvatar()).compareTo(Boolean.valueOf(other.isSetAvatar()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetAvatar() && (compareTo3 = TBaseHelper.compareTo(this.avatar, other.avatar)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetScore()).compareTo(Boolean.valueOf(other.isSetScore()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetScore() && (compareTo2 = TBaseHelper.compareTo(this.score, other.score)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetMe()).compareTo(Boolean.valueOf(other.isSetMe()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetMe() || (compareTo = TBaseHelper.compareTo(this.f28164me, other.f28164me)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<ExperienceRankUser, _Fields> deepCopy2() {
        return new ExperienceRankUser(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$ExperienceRankUser$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getNickname();
        }
        if (i11 == 2) {
            return getAvatar();
        }
        if (i11 == 3) {
            return Integer.valueOf(getScore());
        }
        if (i11 == 4) {
            return Boolean.valueOf(isMe());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$ExperienceRankUser$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetNickname();
        }
        if (i11 == 2) {
            return isSetAvatar();
        }
        if (i11 == 3) {
            return isSetScore();
        }
        if (i11 == 4) {
            return isSetMe();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$ExperienceRankUser$_Fields[field.ordinal()];
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
                unsetAvatar();
                return;
            } else {
                setAvatar((String) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetScore();
                return;
            } else {
                setScore(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetMe();
        } else {
            setMe(((Boolean) value).booleanValue());
        }
    }

    public ExperienceRankUser(String nickname, String avatar, int score, boolean me2) {
        this();
        this.nickname = nickname;
        this.avatar = avatar;
        this.score = score;
        setScoreIsSet(true);
        this.f28164me = me2;
        setMeIsSet(true);
    }

    public boolean equals(ExperienceRankUser that) {
        if (that == null) {
            return false;
        }
        boolean isSetNickname = isSetNickname();
        boolean isSetNickname2 = that.isSetNickname();
        if ((isSetNickname || isSetNickname2) && !(isSetNickname && isSetNickname2 && this.nickname.equals(that.nickname))) {
            return false;
        }
        boolean isSetAvatar = isSetAvatar();
        boolean isSetAvatar2 = that.isSetAvatar();
        return (!(isSetAvatar || isSetAvatar2) || (isSetAvatar && isSetAvatar2 && this.avatar.equals(that.avatar))) && this.score == that.score && this.f28164me == that.f28164me;
    }

    public ExperienceRankUser(ExperienceRankUser other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetNickname()) {
            this.nickname = other.nickname;
        }
        if (other.isSetAvatar()) {
            this.avatar = other.avatar;
        }
        this.score = other.score;
        this.f28164me = other.f28164me;
    }
}
