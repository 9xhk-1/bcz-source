package com.baicizhan.online.bs_socials;

import com.tencent.open.SocialConstants;
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
import org.junit.jupiter.api.j2;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class BBFriendInfo implements TBase<BBFriendInfo, _Fields>, Serializable, Cloneable, Comparable<BBFriendInfo> {
    private static final int __VOCAB_COUNT_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String book_name;
    public String img;
    public String nickname;
    public String publickey;
    public int vocab_count;
    private static final TStruct STRUCT_DESC = new TStruct("BBFriendInfo");
    private static final TField PUBLICKEY_FIELD_DESC = new TField("publickey", (byte) 11, 1);
    private static final TField VOCAB_COUNT_FIELD_DESC = new TField("vocab_count", (byte) 8, 2);
    private static final TField NICKNAME_FIELD_DESC = new TField("nickname", (byte) 11, 3);
    private static final TField BOOK_NAME_FIELD_DESC = new TField("book_name", (byte) 11, 4);
    private static final TField IMG_FIELD_DESC = new TField(SocialConstants.PARAM_IMG_URL, (byte) 11, 5);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_socials.BBFriendInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_socials$BBFriendInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_socials$BBFriendInfo$_Fields = iArr;
            try {
                iArr[_Fields.PUBLICKEY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_socials$BBFriendInfo$_Fields[_Fields.VOCAB_COUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_socials$BBFriendInfo$_Fields[_Fields.NICKNAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_socials$BBFriendInfo$_Fields[_Fields.BOOK_NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_socials$BBFriendInfo$_Fields[_Fields.IMG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBFriendInfoStandardScheme extends StandardScheme<BBFriendInfo> {
        private BBFriendInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BBFriendInfo struct) throws TException {
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
                                if (s11 != 5) {
                                    TProtocolUtil.skip(iprot, b11);
                                } else if (b11 == 11) {
                                    struct.img = iprot.readString();
                                    struct.setImgIsSet(true);
                                } else {
                                    TProtocolUtil.skip(iprot, b11);
                                }
                            } else if (b11 == 11) {
                                struct.book_name = iprot.readString();
                                struct.setBook_nameIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 11) {
                            struct.nickname = iprot.readString();
                            struct.setNicknameIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.vocab_count = iprot.readI32();
                        struct.setVocab_countIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.publickey = iprot.readString();
                    struct.setPublickeyIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetVocab_count()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'vocab_count' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BBFriendInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BBFriendInfo.STRUCT_DESC);
            if (struct.publickey != null) {
                oprot.writeFieldBegin(BBFriendInfo.PUBLICKEY_FIELD_DESC);
                oprot.writeString(struct.publickey);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(BBFriendInfo.VOCAB_COUNT_FIELD_DESC);
            oprot.writeI32(struct.vocab_count);
            oprot.writeFieldEnd();
            if (struct.nickname != null) {
                oprot.writeFieldBegin(BBFriendInfo.NICKNAME_FIELD_DESC);
                oprot.writeString(struct.nickname);
                oprot.writeFieldEnd();
            }
            if (struct.book_name != null) {
                oprot.writeFieldBegin(BBFriendInfo.BOOK_NAME_FIELD_DESC);
                oprot.writeString(struct.book_name);
                oprot.writeFieldEnd();
            }
            if (struct.img != null) {
                oprot.writeFieldBegin(BBFriendInfo.IMG_FIELD_DESC);
                oprot.writeString(struct.img);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBFriendInfoStandardSchemeFactory implements SchemeFactory {
        private BBFriendInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBFriendInfoStandardScheme getScheme() {
            return new BBFriendInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBFriendInfoTupleScheme extends TupleScheme<BBFriendInfo> {
        private BBFriendInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BBFriendInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.publickey = tTupleProtocol.readString();
            struct.setPublickeyIsSet(true);
            struct.vocab_count = tTupleProtocol.readI32();
            struct.setVocab_countIsSet(true);
            struct.nickname = tTupleProtocol.readString();
            struct.setNicknameIsSet(true);
            struct.book_name = tTupleProtocol.readString();
            struct.setBook_nameIsSet(true);
            struct.img = tTupleProtocol.readString();
            struct.setImgIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BBFriendInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.publickey);
            tTupleProtocol.writeI32(struct.vocab_count);
            tTupleProtocol.writeString(struct.nickname);
            tTupleProtocol.writeString(struct.book_name);
            tTupleProtocol.writeString(struct.img);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBFriendInfoTupleSchemeFactory implements SchemeFactory {
        private BBFriendInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBFriendInfoTupleScheme getScheme() {
            return new BBFriendInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        PUBLICKEY(1, "publickey"),
        VOCAB_COUNT(2, "vocab_count"),
        NICKNAME(3, "nickname"),
        BOOK_NAME(4, "book_name"),
        IMG(5, SocialConstants.PARAM_IMG_URL);

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
                return PUBLICKEY;
            }
            if (fieldId == 2) {
                return VOCAB_COUNT;
            }
            if (fieldId == 3) {
                return NICKNAME;
            }
            if (fieldId == 4) {
                return BOOK_NAME;
            }
            if (fieldId != 5) {
                return null;
            }
            return IMG;
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
        hashMap.put(StandardScheme.class, new BBFriendInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BBFriendInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.PUBLICKEY, (_Fields) new FieldMetaData("publickey", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.VOCAB_COUNT, (_Fields) new FieldMetaData("vocab_count", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.NICKNAME, (_Fields) new FieldMetaData("nickname", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.BOOK_NAME, (_Fields) new FieldMetaData("book_name", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.IMG, (_Fields) new FieldMetaData(SocialConstants.PARAM_IMG_URL, (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BBFriendInfo.class, unmodifiableMap);
    }

    public BBFriendInfo() {
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
        this.publickey = null;
        setVocab_countIsSet(false);
        this.vocab_count = 0;
        this.nickname = null;
        this.book_name = null;
        this.img = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BBFriendInfo)) {
            return equals((BBFriendInfo) that);
        }
        return false;
    }

    public String getBook_name() {
        return this.book_name;
    }

    public String getImg() {
        return this.img;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getPublickey() {
        return this.publickey;
    }

    public int getVocab_count() {
        return this.vocab_count;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetBook_name() {
        return this.book_name != null;
    }

    public boolean isSetImg() {
        return this.img != null;
    }

    public boolean isSetNickname() {
        return this.nickname != null;
    }

    public boolean isSetPublickey() {
        return this.publickey != null;
    }

    public boolean isSetVocab_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BBFriendInfo setBook_name(String book_name) {
        this.book_name = book_name;
        return this;
    }

    public void setBook_nameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.book_name = null;
    }

    public BBFriendInfo setImg(String img) {
        this.img = img;
        return this;
    }

    public void setImgIsSet(boolean value) {
        if (value) {
            return;
        }
        this.img = null;
    }

    public BBFriendInfo setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public void setNicknameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.nickname = null;
    }

    public BBFriendInfo setPublickey(String publickey) {
        this.publickey = publickey;
        return this;
    }

    public void setPublickeyIsSet(boolean value) {
        if (value) {
            return;
        }
        this.publickey = null;
    }

    public BBFriendInfo setVocab_count(int vocab_count) {
        this.vocab_count = vocab_count;
        setVocab_countIsSet(true);
        return this;
    }

    public void setVocab_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BBFriendInfo(");
        sb2.append("publickey:");
        String str = this.publickey;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("vocab_count:");
        sb2.append(this.vocab_count);
        sb2.append(j2.O);
        sb2.append("nickname:");
        String str2 = this.nickname;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("book_name:");
        String str3 = this.book_name;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(j2.O);
        sb2.append("img:");
        String str4 = this.img;
        if (str4 == null) {
            sb2.append("null");
        } else {
            sb2.append(str4);
        }
        sb2.append(j.f81007d);
        return sb2.toString();
    }

    public void unsetBook_name() {
        this.book_name = null;
    }

    public void unsetImg() {
        this.img = null;
    }

    public void unsetNickname() {
        this.nickname = null;
    }

    public void unsetPublickey() {
        this.publickey = null;
    }

    public void unsetVocab_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void validate() throws TException {
        if (this.publickey == null) {
            throw new TProtocolException("Required field 'publickey' was not present! Struct: " + toString());
        }
        if (this.nickname == null) {
            throw new TProtocolException("Required field 'nickname' was not present! Struct: " + toString());
        }
        if (this.book_name == null) {
            throw new TProtocolException("Required field 'book_name' was not present! Struct: " + toString());
        }
        if (this.img != null) {
            return;
        }
        throw new TProtocolException("Required field 'img' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BBFriendInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo6 = Boolean.valueOf(isSetPublickey()).compareTo(Boolean.valueOf(other.isSetPublickey()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetPublickey() && (compareTo5 = TBaseHelper.compareTo(this.publickey, other.publickey)) != 0) {
            return compareTo5;
        }
        int compareTo7 = Boolean.valueOf(isSetVocab_count()).compareTo(Boolean.valueOf(other.isSetVocab_count()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetVocab_count() && (compareTo4 = TBaseHelper.compareTo(this.vocab_count, other.vocab_count)) != 0) {
            return compareTo4;
        }
        int compareTo8 = Boolean.valueOf(isSetNickname()).compareTo(Boolean.valueOf(other.isSetNickname()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetNickname() && (compareTo3 = TBaseHelper.compareTo(this.nickname, other.nickname)) != 0) {
            return compareTo3;
        }
        int compareTo9 = Boolean.valueOf(isSetBook_name()).compareTo(Boolean.valueOf(other.isSetBook_name()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetBook_name() && (compareTo2 = TBaseHelper.compareTo(this.book_name, other.book_name)) != 0) {
            return compareTo2;
        }
        int compareTo10 = Boolean.valueOf(isSetImg()).compareTo(Boolean.valueOf(other.isSetImg()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!isSetImg() || (compareTo = TBaseHelper.compareTo(this.img, other.img)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BBFriendInfo, _Fields> deepCopy2() {
        return new BBFriendInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BBFriendInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getPublickey();
        }
        if (i11 == 2) {
            return Integer.valueOf(getVocab_count());
        }
        if (i11 == 3) {
            return getNickname();
        }
        if (i11 == 4) {
            return getBook_name();
        }
        if (i11 == 5) {
            return getImg();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BBFriendInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetPublickey();
        }
        if (i11 == 2) {
            return isSetVocab_count();
        }
        if (i11 == 3) {
            return isSetNickname();
        }
        if (i11 == 4) {
            return isSetBook_name();
        }
        if (i11 == 5) {
            return isSetImg();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BBFriendInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetPublickey();
                return;
            } else {
                setPublickey((String) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetVocab_count();
                return;
            } else {
                setVocab_count(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetNickname();
                return;
            } else {
                setNickname((String) value);
                return;
            }
        }
        if (i11 == 4) {
            if (value == null) {
                unsetBook_name();
                return;
            } else {
                setBook_name((String) value);
                return;
            }
        }
        if (i11 != 5) {
            return;
        }
        if (value == null) {
            unsetImg();
        } else {
            setImg((String) value);
        }
    }

    public BBFriendInfo(String publickey, int vocab_count, String nickname, String book_name, String img) {
        this();
        this.publickey = publickey;
        this.vocab_count = vocab_count;
        setVocab_countIsSet(true);
        this.nickname = nickname;
        this.book_name = book_name;
        this.img = img;
    }

    public boolean equals(BBFriendInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetPublickey = isSetPublickey();
        boolean isSetPublickey2 = that.isSetPublickey();
        if (((isSetPublickey || isSetPublickey2) && !(isSetPublickey && isSetPublickey2 && this.publickey.equals(that.publickey))) || this.vocab_count != that.vocab_count) {
            return false;
        }
        boolean isSetNickname = isSetNickname();
        boolean isSetNickname2 = that.isSetNickname();
        if ((isSetNickname || isSetNickname2) && !(isSetNickname && isSetNickname2 && this.nickname.equals(that.nickname))) {
            return false;
        }
        boolean isSetBook_name = isSetBook_name();
        boolean isSetBook_name2 = that.isSetBook_name();
        if ((isSetBook_name || isSetBook_name2) && !(isSetBook_name && isSetBook_name2 && this.book_name.equals(that.book_name))) {
            return false;
        }
        boolean isSetImg = isSetImg();
        boolean isSetImg2 = that.isSetImg();
        if (isSetImg || isSetImg2) {
            return isSetImg && isSetImg2 && this.img.equals(that.img);
        }
        return true;
    }

    public BBFriendInfo(BBFriendInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetPublickey()) {
            this.publickey = other.publickey;
        }
        this.vocab_count = other.vocab_count;
        if (other.isSetNickname()) {
            this.nickname = other.nickname;
        }
        if (other.isSetBook_name()) {
            this.book_name = other.book_name;
        }
        if (other.isSetImg()) {
            this.img = other.img;
        }
    }
}
