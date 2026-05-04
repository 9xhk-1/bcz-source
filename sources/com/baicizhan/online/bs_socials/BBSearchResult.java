package com.baicizhan.online.bs_socials;

import com.tencent.open.SocialConstants;
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
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class BBSearchResult implements TBase<BBSearchResult, _Fields>, Serializable, Cloneable, Comparable<BBSearchResult> {
    private static final int __VOCAB_COUNT_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String account_type;
    public String book;
    public String img;
    public String nickname;
    private _Fields[] optionals;
    public String publickey;
    public String suggest_reason;
    public int vocab_count;
    private static final TStruct STRUCT_DESC = new TStruct("BBSearchResult");
    private static final TField PUBLICKEY_FIELD_DESC = new TField("publickey", (byte) 11, 1);
    private static final TField VOCAB_COUNT_FIELD_DESC = new TField("vocab_count", (byte) 8, 2);
    private static final TField BOOK_FIELD_DESC = new TField("book", (byte) 11, 3);
    private static final TField NICKNAME_FIELD_DESC = new TField("nickname", (byte) 11, 4);
    private static final TField IMG_FIELD_DESC = new TField(SocialConstants.PARAM_IMG_URL, (byte) 11, 5);
    private static final TField ACCOUNT_TYPE_FIELD_DESC = new TField("account_type", (byte) 11, 6);
    private static final TField SUGGEST_REASON_FIELD_DESC = new TField("suggest_reason", (byte) 11, 7);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_socials.BBSearchResult$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_socials$BBSearchResult$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_socials$BBSearchResult$_Fields = iArr;
            try {
                iArr[_Fields.PUBLICKEY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_socials$BBSearchResult$_Fields[_Fields.VOCAB_COUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_socials$BBSearchResult$_Fields[_Fields.BOOK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_socials$BBSearchResult$_Fields[_Fields.NICKNAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_socials$BBSearchResult$_Fields[_Fields.IMG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_socials$BBSearchResult$_Fields[_Fields.ACCOUNT_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_socials$BBSearchResult$_Fields[_Fields.SUGGEST_REASON.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBSearchResultStandardScheme extends StandardScheme<BBSearchResult> {
        private BBSearchResultStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BBSearchResult struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (struct.isSetVocab_count()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'vocab_count' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.publickey = iprot.readString();
                            struct.setPublickeyIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.vocab_count = iprot.readI32();
                            struct.setVocab_countIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.book = iprot.readString();
                            struct.setBookIsSet(true);
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
                            struct.img = iprot.readString();
                            struct.setImgIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.account_type = iprot.readString();
                            struct.setAccount_typeIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.suggest_reason = iprot.readString();
                            struct.setSuggest_reasonIsSet(true);
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
        public void write(TProtocol oprot, BBSearchResult struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BBSearchResult.STRUCT_DESC);
            if (struct.publickey != null) {
                oprot.writeFieldBegin(BBSearchResult.PUBLICKEY_FIELD_DESC);
                oprot.writeString(struct.publickey);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(BBSearchResult.VOCAB_COUNT_FIELD_DESC);
            oprot.writeI32(struct.vocab_count);
            oprot.writeFieldEnd();
            if (struct.book != null) {
                oprot.writeFieldBegin(BBSearchResult.BOOK_FIELD_DESC);
                oprot.writeString(struct.book);
                oprot.writeFieldEnd();
            }
            if (struct.nickname != null) {
                oprot.writeFieldBegin(BBSearchResult.NICKNAME_FIELD_DESC);
                oprot.writeString(struct.nickname);
                oprot.writeFieldEnd();
            }
            if (struct.img != null) {
                oprot.writeFieldBegin(BBSearchResult.IMG_FIELD_DESC);
                oprot.writeString(struct.img);
                oprot.writeFieldEnd();
            }
            if (struct.account_type != null) {
                oprot.writeFieldBegin(BBSearchResult.ACCOUNT_TYPE_FIELD_DESC);
                oprot.writeString(struct.account_type);
                oprot.writeFieldEnd();
            }
            if (struct.suggest_reason != null && struct.isSetSuggest_reason()) {
                oprot.writeFieldBegin(BBSearchResult.SUGGEST_REASON_FIELD_DESC);
                oprot.writeString(struct.suggest_reason);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBSearchResultStandardSchemeFactory implements SchemeFactory {
        private BBSearchResultStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBSearchResultStandardScheme getScheme() {
            return new BBSearchResultStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBSearchResultTupleScheme extends TupleScheme<BBSearchResult> {
        private BBSearchResultTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BBSearchResult struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.publickey = tTupleProtocol.readString();
            struct.setPublickeyIsSet(true);
            struct.vocab_count = tTupleProtocol.readI32();
            struct.setVocab_countIsSet(true);
            struct.book = tTupleProtocol.readString();
            struct.setBookIsSet(true);
            struct.nickname = tTupleProtocol.readString();
            struct.setNicknameIsSet(true);
            struct.img = tTupleProtocol.readString();
            struct.setImgIsSet(true);
            struct.account_type = tTupleProtocol.readString();
            struct.setAccount_typeIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                struct.suggest_reason = tTupleProtocol.readString();
                struct.setSuggest_reasonIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BBSearchResult struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.publickey);
            tTupleProtocol.writeI32(struct.vocab_count);
            tTupleProtocol.writeString(struct.book);
            tTupleProtocol.writeString(struct.nickname);
            tTupleProtocol.writeString(struct.img);
            tTupleProtocol.writeString(struct.account_type);
            BitSet bitSet = new BitSet();
            if (struct.isSetSuggest_reason()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetSuggest_reason()) {
                tTupleProtocol.writeString(struct.suggest_reason);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBSearchResultTupleSchemeFactory implements SchemeFactory {
        private BBSearchResultTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBSearchResultTupleScheme getScheme() {
            return new BBSearchResultTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        PUBLICKEY(1, "publickey"),
        VOCAB_COUNT(2, "vocab_count"),
        BOOK(3, "book"),
        NICKNAME(4, "nickname"),
        IMG(5, SocialConstants.PARAM_IMG_URL),
        ACCOUNT_TYPE(6, "account_type"),
        SUGGEST_REASON(7, "suggest_reason");

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
                    return PUBLICKEY;
                case 2:
                    return VOCAB_COUNT;
                case 3:
                    return BOOK;
                case 4:
                    return NICKNAME;
                case 5:
                    return IMG;
                case 6:
                    return ACCOUNT_TYPE;
                case 7:
                    return SUGGEST_REASON;
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
        hashMap.put(StandardScheme.class, new BBSearchResultStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BBSearchResultTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.PUBLICKEY, (_Fields) new FieldMetaData("publickey", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.VOCAB_COUNT, (_Fields) new FieldMetaData("vocab_count", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.BOOK, (_Fields) new FieldMetaData("book", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.NICKNAME, (_Fields) new FieldMetaData("nickname", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.IMG, (_Fields) new FieldMetaData(SocialConstants.PARAM_IMG_URL, (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ACCOUNT_TYPE, (_Fields) new FieldMetaData("account_type", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SUGGEST_REASON, (_Fields) new FieldMetaData("suggest_reason", (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BBSearchResult.class, unmodifiableMap);
    }

    public BBSearchResult() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.SUGGEST_REASON};
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
        this.book = null;
        this.nickname = null;
        this.img = null;
        this.account_type = null;
        this.suggest_reason = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BBSearchResult)) {
            return equals((BBSearchResult) that);
        }
        return false;
    }

    public String getAccount_type() {
        return this.account_type;
    }

    public String getBook() {
        return this.book;
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

    public String getSuggest_reason() {
        return this.suggest_reason;
    }

    public int getVocab_count() {
        return this.vocab_count;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAccount_type() {
        return this.account_type != null;
    }

    public boolean isSetBook() {
        return this.book != null;
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

    public boolean isSetSuggest_reason() {
        return this.suggest_reason != null;
    }

    public boolean isSetVocab_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BBSearchResult setAccount_type(String account_type) {
        this.account_type = account_type;
        return this;
    }

    public void setAccount_typeIsSet(boolean value) {
        if (value) {
            return;
        }
        this.account_type = null;
    }

    public BBSearchResult setBook(String book) {
        this.book = book;
        return this;
    }

    public void setBookIsSet(boolean value) {
        if (value) {
            return;
        }
        this.book = null;
    }

    public BBSearchResult setImg(String img) {
        this.img = img;
        return this;
    }

    public void setImgIsSet(boolean value) {
        if (value) {
            return;
        }
        this.img = null;
    }

    public BBSearchResult setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public void setNicknameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.nickname = null;
    }

    public BBSearchResult setPublickey(String publickey) {
        this.publickey = publickey;
        return this;
    }

    public void setPublickeyIsSet(boolean value) {
        if (value) {
            return;
        }
        this.publickey = null;
    }

    public BBSearchResult setSuggest_reason(String suggest_reason) {
        this.suggest_reason = suggest_reason;
        return this;
    }

    public void setSuggest_reasonIsSet(boolean value) {
        if (value) {
            return;
        }
        this.suggest_reason = null;
    }

    public BBSearchResult setVocab_count(int vocab_count) {
        this.vocab_count = vocab_count;
        setVocab_countIsSet(true);
        return this;
    }

    public void setVocab_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BBSearchResult(");
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
        sb2.append("book:");
        String str2 = this.book;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
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
        sb2.append("img:");
        String str4 = this.img;
        if (str4 == null) {
            sb2.append("null");
        } else {
            sb2.append(str4);
        }
        sb2.append(j2.O);
        sb2.append("account_type:");
        String str5 = this.account_type;
        if (str5 == null) {
            sb2.append("null");
        } else {
            sb2.append(str5);
        }
        if (isSetSuggest_reason()) {
            sb2.append(j2.O);
            sb2.append("suggest_reason:");
            String str6 = this.suggest_reason;
            if (str6 == null) {
                sb2.append("null");
            } else {
                sb2.append(str6);
            }
        }
        sb2.append(j.f81007d);
        return sb2.toString();
    }

    public void unsetAccount_type() {
        this.account_type = null;
    }

    public void unsetBook() {
        this.book = null;
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

    public void unsetSuggest_reason() {
        this.suggest_reason = null;
    }

    public void unsetVocab_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void validate() throws TException {
        if (this.publickey == null) {
            throw new TProtocolException("Required field 'publickey' was not present! Struct: " + toString());
        }
        if (this.book == null) {
            throw new TProtocolException("Required field 'book' was not present! Struct: " + toString());
        }
        if (this.nickname == null) {
            throw new TProtocolException("Required field 'nickname' was not present! Struct: " + toString());
        }
        if (this.img == null) {
            throw new TProtocolException("Required field 'img' was not present! Struct: " + toString());
        }
        if (this.account_type != null) {
            return;
        }
        throw new TProtocolException("Required field 'account_type' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BBSearchResult other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        int compareTo7;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo8 = Boolean.valueOf(isSetPublickey()).compareTo(Boolean.valueOf(other.isSetPublickey()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetPublickey() && (compareTo7 = TBaseHelper.compareTo(this.publickey, other.publickey)) != 0) {
            return compareTo7;
        }
        int compareTo9 = Boolean.valueOf(isSetVocab_count()).compareTo(Boolean.valueOf(other.isSetVocab_count()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetVocab_count() && (compareTo6 = TBaseHelper.compareTo(this.vocab_count, other.vocab_count)) != 0) {
            return compareTo6;
        }
        int compareTo10 = Boolean.valueOf(isSetBook()).compareTo(Boolean.valueOf(other.isSetBook()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetBook() && (compareTo5 = TBaseHelper.compareTo(this.book, other.book)) != 0) {
            return compareTo5;
        }
        int compareTo11 = Boolean.valueOf(isSetNickname()).compareTo(Boolean.valueOf(other.isSetNickname()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetNickname() && (compareTo4 = TBaseHelper.compareTo(this.nickname, other.nickname)) != 0) {
            return compareTo4;
        }
        int compareTo12 = Boolean.valueOf(isSetImg()).compareTo(Boolean.valueOf(other.isSetImg()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetImg() && (compareTo3 = TBaseHelper.compareTo(this.img, other.img)) != 0) {
            return compareTo3;
        }
        int compareTo13 = Boolean.valueOf(isSetAccount_type()).compareTo(Boolean.valueOf(other.isSetAccount_type()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetAccount_type() && (compareTo2 = TBaseHelper.compareTo(this.account_type, other.account_type)) != 0) {
            return compareTo2;
        }
        int compareTo14 = Boolean.valueOf(isSetSuggest_reason()).compareTo(Boolean.valueOf(other.isSetSuggest_reason()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (!isSetSuggest_reason() || (compareTo = TBaseHelper.compareTo(this.suggest_reason, other.suggest_reason)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BBSearchResult, _Fields> deepCopy2() {
        return new BBSearchResult(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BBSearchResult$_Fields[field.ordinal()]) {
            case 1:
                return getPublickey();
            case 2:
                return Integer.valueOf(getVocab_count());
            case 3:
                return getBook();
            case 4:
                return getNickname();
            case 5:
                return getImg();
            case 6:
                return getAccount_type();
            case 7:
                return getSuggest_reason();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BBSearchResult$_Fields[field.ordinal()]) {
            case 1:
                return isSetPublickey();
            case 2:
                return isSetVocab_count();
            case 3:
                return isSetBook();
            case 4:
                return isSetNickname();
            case 5:
                return isSetImg();
            case 6:
                return isSetAccount_type();
            case 7:
                return isSetSuggest_reason();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BBSearchResult$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setPublickey((String) value);
                    break;
                } else {
                    unsetPublickey();
                    break;
                }
            case 2:
                if (value != null) {
                    setVocab_count(((Integer) value).intValue());
                    break;
                } else {
                    unsetVocab_count();
                    break;
                }
            case 3:
                if (value != null) {
                    setBook((String) value);
                    break;
                } else {
                    unsetBook();
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
                    setImg((String) value);
                    break;
                } else {
                    unsetImg();
                    break;
                }
            case 6:
                if (value != null) {
                    setAccount_type((String) value);
                    break;
                } else {
                    unsetAccount_type();
                    break;
                }
            case 7:
                if (value != null) {
                    setSuggest_reason((String) value);
                    break;
                } else {
                    unsetSuggest_reason();
                    break;
                }
        }
    }

    public boolean equals(BBSearchResult that) {
        if (that == null) {
            return false;
        }
        boolean isSetPublickey = isSetPublickey();
        boolean isSetPublickey2 = that.isSetPublickey();
        if (((isSetPublickey || isSetPublickey2) && !(isSetPublickey && isSetPublickey2 && this.publickey.equals(that.publickey))) || this.vocab_count != that.vocab_count) {
            return false;
        }
        boolean isSetBook = isSetBook();
        boolean isSetBook2 = that.isSetBook();
        if ((isSetBook || isSetBook2) && !(isSetBook && isSetBook2 && this.book.equals(that.book))) {
            return false;
        }
        boolean isSetNickname = isSetNickname();
        boolean isSetNickname2 = that.isSetNickname();
        if ((isSetNickname || isSetNickname2) && !(isSetNickname && isSetNickname2 && this.nickname.equals(that.nickname))) {
            return false;
        }
        boolean isSetImg = isSetImg();
        boolean isSetImg2 = that.isSetImg();
        if ((isSetImg || isSetImg2) && !(isSetImg && isSetImg2 && this.img.equals(that.img))) {
            return false;
        }
        boolean isSetAccount_type = isSetAccount_type();
        boolean isSetAccount_type2 = that.isSetAccount_type();
        if ((isSetAccount_type || isSetAccount_type2) && !(isSetAccount_type && isSetAccount_type2 && this.account_type.equals(that.account_type))) {
            return false;
        }
        boolean isSetSuggest_reason = isSetSuggest_reason();
        boolean isSetSuggest_reason2 = that.isSetSuggest_reason();
        if (isSetSuggest_reason || isSetSuggest_reason2) {
            return isSetSuggest_reason && isSetSuggest_reason2 && this.suggest_reason.equals(that.suggest_reason);
        }
        return true;
    }

    public BBSearchResult(String publickey, int vocab_count, String book, String nickname, String img, String account_type) {
        this();
        this.publickey = publickey;
        this.vocab_count = vocab_count;
        setVocab_countIsSet(true);
        this.book = book;
        this.nickname = nickname;
        this.img = img;
        this.account_type = account_type;
    }

    public BBSearchResult(BBSearchResult other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.SUGGEST_REASON};
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetPublickey()) {
            this.publickey = other.publickey;
        }
        this.vocab_count = other.vocab_count;
        if (other.isSetBook()) {
            this.book = other.book;
        }
        if (other.isSetNickname()) {
            this.nickname = other.nickname;
        }
        if (other.isSetImg()) {
            this.img = other.img;
        }
        if (other.isSetAccount_type()) {
            this.account_type = other.account_type;
        }
        if (other.isSetSuggest_reason()) {
            this.suggest_reason = other.suggest_reason;
        }
    }
}
