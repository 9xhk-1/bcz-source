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
/* loaded from: classes5.dex */
public class GameUserBasicInfo implements TBase<GameUserBasicInfo, _Fields>, Serializable, Cloneable, Comparable<GameUserBasicInfo> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public String avatar;
    public String nickname;
    private static final TStruct STRUCT_DESC = new TStruct("GameUserBasicInfo");
    private static final TField NICKNAME_FIELD_DESC = new TField("nickname", (byte) 11, 1);
    private static final TField AVATAR_FIELD_DESC = new TField(q9.h.f81940d, (byte) 11, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.GameUserBasicInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$GameUserBasicInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$GameUserBasicInfo$_Fields = iArr;
            try {
                iArr[_Fields.NICKNAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$GameUserBasicInfo$_Fields[_Fields.AVATAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class GameUserBasicInfoStandardScheme extends StandardScheme<GameUserBasicInfo> {
        private GameUserBasicInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, GameUserBasicInfo struct) throws TException {
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
                        TProtocolUtil.skip(iprot, b11);
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
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, GameUserBasicInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(GameUserBasicInfo.STRUCT_DESC);
            if (struct.nickname != null) {
                oprot.writeFieldBegin(GameUserBasicInfo.NICKNAME_FIELD_DESC);
                oprot.writeString(struct.nickname);
                oprot.writeFieldEnd();
            }
            if (struct.avatar != null) {
                oprot.writeFieldBegin(GameUserBasicInfo.AVATAR_FIELD_DESC);
                oprot.writeString(struct.avatar);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class GameUserBasicInfoStandardSchemeFactory implements SchemeFactory {
        private GameUserBasicInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public GameUserBasicInfoStandardScheme getScheme() {
            return new GameUserBasicInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class GameUserBasicInfoTupleScheme extends TupleScheme<GameUserBasicInfo> {
        private GameUserBasicInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, GameUserBasicInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.nickname = tTupleProtocol.readString();
            struct.setNicknameIsSet(true);
            struct.avatar = tTupleProtocol.readString();
            struct.setAvatarIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, GameUserBasicInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.nickname);
            tTupleProtocol.writeString(struct.avatar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class GameUserBasicInfoTupleSchemeFactory implements SchemeFactory {
        private GameUserBasicInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public GameUserBasicInfoTupleScheme getScheme() {
            return new GameUserBasicInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        NICKNAME(1, "nickname"),
        AVATAR(2, q9.h.f81940d);

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
            if (fieldId != 2) {
                return null;
            }
            return AVATAR;
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
        hashMap.put(StandardScheme.class, new GameUserBasicInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new GameUserBasicInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.NICKNAME, (_Fields) new FieldMetaData("nickname", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.AVATAR, (_Fields) new FieldMetaData(q9.h.f81940d, (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(GameUserBasicInfo.class, unmodifiableMap);
    }

    public GameUserBasicInfo() {
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
        this.nickname = null;
        this.avatar = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof GameUserBasicInfo)) {
            return equals((GameUserBasicInfo) that);
        }
        return false;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getNickname() {
        return this.nickname;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAvatar() {
        return this.avatar != null;
    }

    public boolean isSetNickname() {
        return this.nickname != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public GameUserBasicInfo setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }

    public void setAvatarIsSet(boolean value) {
        if (value) {
            return;
        }
        this.avatar = null;
    }

    public GameUserBasicInfo setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public void setNicknameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.nickname = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GameUserBasicInfo(");
        sb2.append("nickname:");
        String str = this.nickname;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("avatar:");
        String str2 = this.avatar;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAvatar() {
        this.avatar = null;
    }

    public void unsetNickname() {
        this.nickname = null;
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

    public GameUserBasicInfo(String nickname, String avatar) {
        this();
        this.nickname = nickname;
        this.avatar = avatar;
    }

    @Override // java.lang.Comparable
    public int compareTo(GameUserBasicInfo other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetNickname()).compareTo(Boolean.valueOf(other.isSetNickname()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetNickname() && (compareTo2 = TBaseHelper.compareTo(this.nickname, other.nickname)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetAvatar()).compareTo(Boolean.valueOf(other.isSetAvatar()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetAvatar() || (compareTo = TBaseHelper.compareTo(this.avatar, other.avatar)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<GameUserBasicInfo, _Fields> deepCopy2() {
        return new GameUserBasicInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$GameUserBasicInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getNickname();
        }
        if (i11 == 2) {
            return getAvatar();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$GameUserBasicInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetNickname();
        }
        if (i11 == 2) {
            return isSetAvatar();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$GameUserBasicInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetNickname();
                return;
            } else {
                setNickname((String) value);
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetAvatar();
        } else {
            setAvatar((String) value);
        }
    }

    public boolean equals(GameUserBasicInfo that) {
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
        if (isSetAvatar || isSetAvatar2) {
            return isSetAvatar && isSetAvatar2 && this.avatar.equals(that.avatar);
        }
        return true;
    }

    public GameUserBasicInfo(GameUserBasicInfo other) {
        if (other.isSetNickname()) {
            this.nickname = other.nickname;
        }
        if (other.isSetAvatar()) {
            this.avatar = other.avatar;
        }
    }
}
