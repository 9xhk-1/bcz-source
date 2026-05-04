package com.baicizhan.online.user_study_api;

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
public class UserFinishBookFlauntInfo implements TBase<UserFinishBookFlauntInfo, _Fields>, Serializable, Cloneable, Comparable<UserFinishBookFlauntInfo> {
    private static final int __REVIEW_ROUND_ISSET_ID = 3;
    private static final int __TOTAL_DAKA_DAYS_ISSET_ID = 1;
    private static final int __TOTAL_WORDS_ISSET_ID = 2;
    private static final int __USER_UNFINISH_PERCENTAGE_ISSET_ID = 4;
    private static final int __WORD_LEVEL_ID_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String book_name;
    public int review_round;
    public String share_desc;
    public String share_img_url;
    public String share_title;
    public String share_url_qq;
    public String share_url_weixin;
    public int total_daka_days;
    public int total_words;
    public int user_unfinish_percentage;
    public int word_level_id;
    private static final TStruct STRUCT_DESC = new TStruct("UserFinishBookFlauntInfo");
    private static final TField WORD_LEVEL_ID_FIELD_DESC = new TField(ma.b.f72894c, (byte) 8, 1);
    private static final TField BOOK_NAME_FIELD_DESC = new TField("book_name", (byte) 11, 2);
    private static final TField TOTAL_DAKA_DAYS_FIELD_DESC = new TField("total_daka_days", (byte) 8, 3);
    private static final TField TOTAL_WORDS_FIELD_DESC = new TField("total_words", (byte) 8, 4);
    private static final TField REVIEW_ROUND_FIELD_DESC = new TField("review_round", (byte) 8, 5);
    private static final TField SHARE_URL_WEIXIN_FIELD_DESC = new TField("share_url_weixin", (byte) 11, 6);
    private static final TField SHARE_URL_QQ_FIELD_DESC = new TField("share_url_qq", (byte) 11, 7);
    private static final TField SHARE_TITLE_FIELD_DESC = new TField("share_title", (byte) 11, 8);
    private static final TField SHARE_DESC_FIELD_DESC = new TField("share_desc", (byte) 11, 9);
    private static final TField SHARE_IMG_URL_FIELD_DESC = new TField("share_img_url", (byte) 11, 10);
    private static final TField USER_UNFINISH_PERCENTAGE_FIELD_DESC = new TField("user_unfinish_percentage", (byte) 8, 11);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.UserFinishBookFlauntInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$UserFinishBookFlauntInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$UserFinishBookFlauntInfo$_Fields = iArr;
            try {
                iArr[_Fields.WORD_LEVEL_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserFinishBookFlauntInfo$_Fields[_Fields.BOOK_NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserFinishBookFlauntInfo$_Fields[_Fields.TOTAL_DAKA_DAYS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserFinishBookFlauntInfo$_Fields[_Fields.TOTAL_WORDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserFinishBookFlauntInfo$_Fields[_Fields.REVIEW_ROUND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserFinishBookFlauntInfo$_Fields[_Fields.SHARE_URL_WEIXIN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserFinishBookFlauntInfo$_Fields[_Fields.SHARE_URL_QQ.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserFinishBookFlauntInfo$_Fields[_Fields.SHARE_TITLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserFinishBookFlauntInfo$_Fields[_Fields.SHARE_DESC.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserFinishBookFlauntInfo$_Fields[_Fields.SHARE_IMG_URL.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserFinishBookFlauntInfo$_Fields[_Fields.USER_UNFINISH_PERCENTAGE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserFinishBookFlauntInfoStandardScheme extends StandardScheme<UserFinishBookFlauntInfo> {
        private UserFinishBookFlauntInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserFinishBookFlauntInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetWord_level_id()) {
                        throw new TProtocolException("Required field 'word_level_id' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetTotal_daka_days()) {
                        throw new TProtocolException("Required field 'total_daka_days' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetTotal_words()) {
                        throw new TProtocolException("Required field 'total_words' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetReview_round()) {
                        throw new TProtocolException("Required field 'review_round' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetUser_unfinish_percentage()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'user_unfinish_percentage' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.word_level_id = iprot.readI32();
                            struct.setWord_level_idIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.book_name = iprot.readString();
                            struct.setBook_nameIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.total_daka_days = iprot.readI32();
                            struct.setTotal_daka_daysIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.total_words = iprot.readI32();
                            struct.setTotal_wordsIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.review_round = iprot.readI32();
                            struct.setReview_roundIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.share_url_weixin = iprot.readString();
                            struct.setShare_url_weixinIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.share_url_qq = iprot.readString();
                            struct.setShare_url_qqIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.share_title = iprot.readString();
                            struct.setShare_titleIsSet(true);
                            break;
                        }
                    case 9:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.share_desc = iprot.readString();
                            struct.setShare_descIsSet(true);
                            break;
                        }
                    case 10:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.share_img_url = iprot.readString();
                            struct.setShare_img_urlIsSet(true);
                            break;
                        }
                    case 11:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.user_unfinish_percentage = iprot.readI32();
                            struct.setUser_unfinish_percentageIsSet(true);
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
        public void write(TProtocol oprot, UserFinishBookFlauntInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserFinishBookFlauntInfo.STRUCT_DESC);
            oprot.writeFieldBegin(UserFinishBookFlauntInfo.WORD_LEVEL_ID_FIELD_DESC);
            oprot.writeI32(struct.word_level_id);
            oprot.writeFieldEnd();
            if (struct.book_name != null) {
                oprot.writeFieldBegin(UserFinishBookFlauntInfo.BOOK_NAME_FIELD_DESC);
                oprot.writeString(struct.book_name);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(UserFinishBookFlauntInfo.TOTAL_DAKA_DAYS_FIELD_DESC);
            oprot.writeI32(struct.total_daka_days);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserFinishBookFlauntInfo.TOTAL_WORDS_FIELD_DESC);
            oprot.writeI32(struct.total_words);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserFinishBookFlauntInfo.REVIEW_ROUND_FIELD_DESC);
            oprot.writeI32(struct.review_round);
            oprot.writeFieldEnd();
            if (struct.share_url_weixin != null) {
                oprot.writeFieldBegin(UserFinishBookFlauntInfo.SHARE_URL_WEIXIN_FIELD_DESC);
                oprot.writeString(struct.share_url_weixin);
                oprot.writeFieldEnd();
            }
            if (struct.share_url_qq != null) {
                oprot.writeFieldBegin(UserFinishBookFlauntInfo.SHARE_URL_QQ_FIELD_DESC);
                oprot.writeString(struct.share_url_qq);
                oprot.writeFieldEnd();
            }
            if (struct.share_title != null) {
                oprot.writeFieldBegin(UserFinishBookFlauntInfo.SHARE_TITLE_FIELD_DESC);
                oprot.writeString(struct.share_title);
                oprot.writeFieldEnd();
            }
            if (struct.share_desc != null) {
                oprot.writeFieldBegin(UserFinishBookFlauntInfo.SHARE_DESC_FIELD_DESC);
                oprot.writeString(struct.share_desc);
                oprot.writeFieldEnd();
            }
            if (struct.share_img_url != null) {
                oprot.writeFieldBegin(UserFinishBookFlauntInfo.SHARE_IMG_URL_FIELD_DESC);
                oprot.writeString(struct.share_img_url);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(UserFinishBookFlauntInfo.USER_UNFINISH_PERCENTAGE_FIELD_DESC);
            oprot.writeI32(struct.user_unfinish_percentage);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserFinishBookFlauntInfoStandardSchemeFactory implements SchemeFactory {
        private UserFinishBookFlauntInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserFinishBookFlauntInfoStandardScheme getScheme() {
            return new UserFinishBookFlauntInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserFinishBookFlauntInfoTupleScheme extends TupleScheme<UserFinishBookFlauntInfo> {
        private UserFinishBookFlauntInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserFinishBookFlauntInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.word_level_id = tTupleProtocol.readI32();
            struct.setWord_level_idIsSet(true);
            struct.book_name = tTupleProtocol.readString();
            struct.setBook_nameIsSet(true);
            struct.total_daka_days = tTupleProtocol.readI32();
            struct.setTotal_daka_daysIsSet(true);
            struct.total_words = tTupleProtocol.readI32();
            struct.setTotal_wordsIsSet(true);
            struct.review_round = tTupleProtocol.readI32();
            struct.setReview_roundIsSet(true);
            struct.share_url_weixin = tTupleProtocol.readString();
            struct.setShare_url_weixinIsSet(true);
            struct.share_url_qq = tTupleProtocol.readString();
            struct.setShare_url_qqIsSet(true);
            struct.share_title = tTupleProtocol.readString();
            struct.setShare_titleIsSet(true);
            struct.share_desc = tTupleProtocol.readString();
            struct.setShare_descIsSet(true);
            struct.share_img_url = tTupleProtocol.readString();
            struct.setShare_img_urlIsSet(true);
            struct.user_unfinish_percentage = tTupleProtocol.readI32();
            struct.setUser_unfinish_percentageIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserFinishBookFlauntInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.word_level_id);
            tTupleProtocol.writeString(struct.book_name);
            tTupleProtocol.writeI32(struct.total_daka_days);
            tTupleProtocol.writeI32(struct.total_words);
            tTupleProtocol.writeI32(struct.review_round);
            tTupleProtocol.writeString(struct.share_url_weixin);
            tTupleProtocol.writeString(struct.share_url_qq);
            tTupleProtocol.writeString(struct.share_title);
            tTupleProtocol.writeString(struct.share_desc);
            tTupleProtocol.writeString(struct.share_img_url);
            tTupleProtocol.writeI32(struct.user_unfinish_percentage);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserFinishBookFlauntInfoTupleSchemeFactory implements SchemeFactory {
        private UserFinishBookFlauntInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserFinishBookFlauntInfoTupleScheme getScheme() {
            return new UserFinishBookFlauntInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        WORD_LEVEL_ID(1, ma.b.f72894c),
        BOOK_NAME(2, "book_name"),
        TOTAL_DAKA_DAYS(3, "total_daka_days"),
        TOTAL_WORDS(4, "total_words"),
        REVIEW_ROUND(5, "review_round"),
        SHARE_URL_WEIXIN(6, "share_url_weixin"),
        SHARE_URL_QQ(7, "share_url_qq"),
        SHARE_TITLE(8, "share_title"),
        SHARE_DESC(9, "share_desc"),
        SHARE_IMG_URL(10, "share_img_url"),
        USER_UNFINISH_PERCENTAGE(11, "user_unfinish_percentage");

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
                    return WORD_LEVEL_ID;
                case 2:
                    return BOOK_NAME;
                case 3:
                    return TOTAL_DAKA_DAYS;
                case 4:
                    return TOTAL_WORDS;
                case 5:
                    return REVIEW_ROUND;
                case 6:
                    return SHARE_URL_WEIXIN;
                case 7:
                    return SHARE_URL_QQ;
                case 8:
                    return SHARE_TITLE;
                case 9:
                    return SHARE_DESC;
                case 10:
                    return SHARE_IMG_URL;
                case 11:
                    return USER_UNFINISH_PERCENTAGE;
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
        hashMap.put(StandardScheme.class, new UserFinishBookFlauntInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserFinishBookFlauntInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.WORD_LEVEL_ID, (_Fields) new FieldMetaData(ma.b.f72894c, (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.BOOK_NAME, (_Fields) new FieldMetaData("book_name", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.TOTAL_DAKA_DAYS, (_Fields) new FieldMetaData("total_daka_days", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.TOTAL_WORDS, (_Fields) new FieldMetaData("total_words", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.REVIEW_ROUND, (_Fields) new FieldMetaData("review_round", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.SHARE_URL_WEIXIN, (_Fields) new FieldMetaData("share_url_weixin", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SHARE_URL_QQ, (_Fields) new FieldMetaData("share_url_qq", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SHARE_TITLE, (_Fields) new FieldMetaData("share_title", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SHARE_DESC, (_Fields) new FieldMetaData("share_desc", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SHARE_IMG_URL, (_Fields) new FieldMetaData("share_img_url", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.USER_UNFINISH_PERCENTAGE, (_Fields) new FieldMetaData("user_unfinish_percentage", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserFinishBookFlauntInfo.class, unmodifiableMap);
    }

    public UserFinishBookFlauntInfo() {
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
        setWord_level_idIsSet(false);
        this.word_level_id = 0;
        this.book_name = null;
        setTotal_daka_daysIsSet(false);
        this.total_daka_days = 0;
        setTotal_wordsIsSet(false);
        this.total_words = 0;
        setReview_roundIsSet(false);
        this.review_round = 0;
        this.share_url_weixin = null;
        this.share_url_qq = null;
        this.share_title = null;
        this.share_desc = null;
        this.share_img_url = null;
        setUser_unfinish_percentageIsSet(false);
        this.user_unfinish_percentage = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserFinishBookFlauntInfo)) {
            return equals((UserFinishBookFlauntInfo) that);
        }
        return false;
    }

    public String getBook_name() {
        return this.book_name;
    }

    public int getReview_round() {
        return this.review_round;
    }

    public String getShare_desc() {
        return this.share_desc;
    }

    public String getShare_img_url() {
        return this.share_img_url;
    }

    public String getShare_title() {
        return this.share_title;
    }

    public String getShare_url_qq() {
        return this.share_url_qq;
    }

    public String getShare_url_weixin() {
        return this.share_url_weixin;
    }

    public int getTotal_daka_days() {
        return this.total_daka_days;
    }

    public int getTotal_words() {
        return this.total_words;
    }

    public int getUser_unfinish_percentage() {
        return this.user_unfinish_percentage;
    }

    public int getWord_level_id() {
        return this.word_level_id;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetBook_name() {
        return this.book_name != null;
    }

    public boolean isSetReview_round() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetShare_desc() {
        return this.share_desc != null;
    }

    public boolean isSetShare_img_url() {
        return this.share_img_url != null;
    }

    public boolean isSetShare_title() {
        return this.share_title != null;
    }

    public boolean isSetShare_url_qq() {
        return this.share_url_qq != null;
    }

    public boolean isSetShare_url_weixin() {
        return this.share_url_weixin != null;
    }

    public boolean isSetTotal_daka_days() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetTotal_words() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetUser_unfinish_percentage() {
        return EncodingUtils.testBit(this.__isset_bitfield, 4);
    }

    public boolean isSetWord_level_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserFinishBookFlauntInfo setBook_name(String book_name) {
        this.book_name = book_name;
        return this;
    }

    public void setBook_nameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.book_name = null;
    }

    public UserFinishBookFlauntInfo setReview_round(int review_round) {
        this.review_round = review_round;
        setReview_roundIsSet(true);
        return this;
    }

    public void setReview_roundIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public UserFinishBookFlauntInfo setShare_desc(String share_desc) {
        this.share_desc = share_desc;
        return this;
    }

    public void setShare_descIsSet(boolean value) {
        if (value) {
            return;
        }
        this.share_desc = null;
    }

    public UserFinishBookFlauntInfo setShare_img_url(String share_img_url) {
        this.share_img_url = share_img_url;
        return this;
    }

    public void setShare_img_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.share_img_url = null;
    }

    public UserFinishBookFlauntInfo setShare_title(String share_title) {
        this.share_title = share_title;
        return this;
    }

    public void setShare_titleIsSet(boolean value) {
        if (value) {
            return;
        }
        this.share_title = null;
    }

    public UserFinishBookFlauntInfo setShare_url_qq(String share_url_qq) {
        this.share_url_qq = share_url_qq;
        return this;
    }

    public void setShare_url_qqIsSet(boolean value) {
        if (value) {
            return;
        }
        this.share_url_qq = null;
    }

    public UserFinishBookFlauntInfo setShare_url_weixin(String share_url_weixin) {
        this.share_url_weixin = share_url_weixin;
        return this;
    }

    public void setShare_url_weixinIsSet(boolean value) {
        if (value) {
            return;
        }
        this.share_url_weixin = null;
    }

    public UserFinishBookFlauntInfo setTotal_daka_days(int total_daka_days) {
        this.total_daka_days = total_daka_days;
        setTotal_daka_daysIsSet(true);
        return this;
    }

    public void setTotal_daka_daysIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public UserFinishBookFlauntInfo setTotal_words(int total_words) {
        this.total_words = total_words;
        setTotal_wordsIsSet(true);
        return this;
    }

    public void setTotal_wordsIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public UserFinishBookFlauntInfo setUser_unfinish_percentage(int user_unfinish_percentage) {
        this.user_unfinish_percentage = user_unfinish_percentage;
        setUser_unfinish_percentageIsSet(true);
        return this;
    }

    public void setUser_unfinish_percentageIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 4, value);
    }

    public UserFinishBookFlauntInfo setWord_level_id(int word_level_id) {
        this.word_level_id = word_level_id;
        setWord_level_idIsSet(true);
        return this;
    }

    public void setWord_level_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserFinishBookFlauntInfo(");
        sb2.append("word_level_id:");
        sb2.append(this.word_level_id);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("book_name:");
        String str = this.book_name;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("total_daka_days:");
        sb2.append(this.total_daka_days);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("total_words:");
        sb2.append(this.total_words);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("review_round:");
        sb2.append(this.review_round);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("share_url_weixin:");
        String str2 = this.share_url_weixin;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("share_url_qq:");
        String str3 = this.share_url_qq;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("share_title:");
        String str4 = this.share_title;
        if (str4 == null) {
            sb2.append("null");
        } else {
            sb2.append(str4);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("share_desc:");
        String str5 = this.share_desc;
        if (str5 == null) {
            sb2.append("null");
        } else {
            sb2.append(str5);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("share_img_url:");
        String str6 = this.share_img_url;
        if (str6 == null) {
            sb2.append("null");
        } else {
            sb2.append(str6);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("user_unfinish_percentage:");
        sb2.append(this.user_unfinish_percentage);
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetBook_name() {
        this.book_name = null;
    }

    public void unsetReview_round() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetShare_desc() {
        this.share_desc = null;
    }

    public void unsetShare_img_url() {
        this.share_img_url = null;
    }

    public void unsetShare_title() {
        this.share_title = null;
    }

    public void unsetShare_url_qq() {
        this.share_url_qq = null;
    }

    public void unsetShare_url_weixin() {
        this.share_url_weixin = null;
    }

    public void unsetTotal_daka_days() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetTotal_words() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetUser_unfinish_percentage() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 4);
    }

    public void unsetWord_level_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void validate() throws TException {
        if (this.book_name == null) {
            throw new TProtocolException("Required field 'book_name' was not present! Struct: " + toString());
        }
        if (this.share_url_weixin == null) {
            throw new TProtocolException("Required field 'share_url_weixin' was not present! Struct: " + toString());
        }
        if (this.share_url_qq == null) {
            throw new TProtocolException("Required field 'share_url_qq' was not present! Struct: " + toString());
        }
        if (this.share_title == null) {
            throw new TProtocolException("Required field 'share_title' was not present! Struct: " + toString());
        }
        if (this.share_desc == null) {
            throw new TProtocolException("Required field 'share_desc' was not present! Struct: " + toString());
        }
        if (this.share_img_url != null) {
            return;
        }
        throw new TProtocolException("Required field 'share_img_url' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(UserFinishBookFlauntInfo other) {
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
        int compareTo12 = Boolean.valueOf(isSetWord_level_id()).compareTo(Boolean.valueOf(other.isSetWord_level_id()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetWord_level_id() && (compareTo11 = TBaseHelper.compareTo(this.word_level_id, other.word_level_id)) != 0) {
            return compareTo11;
        }
        int compareTo13 = Boolean.valueOf(isSetBook_name()).compareTo(Boolean.valueOf(other.isSetBook_name()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetBook_name() && (compareTo10 = TBaseHelper.compareTo(this.book_name, other.book_name)) != 0) {
            return compareTo10;
        }
        int compareTo14 = Boolean.valueOf(isSetTotal_daka_days()).compareTo(Boolean.valueOf(other.isSetTotal_daka_days()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (isSetTotal_daka_days() && (compareTo9 = TBaseHelper.compareTo(this.total_daka_days, other.total_daka_days)) != 0) {
            return compareTo9;
        }
        int compareTo15 = Boolean.valueOf(isSetTotal_words()).compareTo(Boolean.valueOf(other.isSetTotal_words()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (isSetTotal_words() && (compareTo8 = TBaseHelper.compareTo(this.total_words, other.total_words)) != 0) {
            return compareTo8;
        }
        int compareTo16 = Boolean.valueOf(isSetReview_round()).compareTo(Boolean.valueOf(other.isSetReview_round()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (isSetReview_round() && (compareTo7 = TBaseHelper.compareTo(this.review_round, other.review_round)) != 0) {
            return compareTo7;
        }
        int compareTo17 = Boolean.valueOf(isSetShare_url_weixin()).compareTo(Boolean.valueOf(other.isSetShare_url_weixin()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (isSetShare_url_weixin() && (compareTo6 = TBaseHelper.compareTo(this.share_url_weixin, other.share_url_weixin)) != 0) {
            return compareTo6;
        }
        int compareTo18 = Boolean.valueOf(isSetShare_url_qq()).compareTo(Boolean.valueOf(other.isSetShare_url_qq()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (isSetShare_url_qq() && (compareTo5 = TBaseHelper.compareTo(this.share_url_qq, other.share_url_qq)) != 0) {
            return compareTo5;
        }
        int compareTo19 = Boolean.valueOf(isSetShare_title()).compareTo(Boolean.valueOf(other.isSetShare_title()));
        if (compareTo19 != 0) {
            return compareTo19;
        }
        if (isSetShare_title() && (compareTo4 = TBaseHelper.compareTo(this.share_title, other.share_title)) != 0) {
            return compareTo4;
        }
        int compareTo20 = Boolean.valueOf(isSetShare_desc()).compareTo(Boolean.valueOf(other.isSetShare_desc()));
        if (compareTo20 != 0) {
            return compareTo20;
        }
        if (isSetShare_desc() && (compareTo3 = TBaseHelper.compareTo(this.share_desc, other.share_desc)) != 0) {
            return compareTo3;
        }
        int compareTo21 = Boolean.valueOf(isSetShare_img_url()).compareTo(Boolean.valueOf(other.isSetShare_img_url()));
        if (compareTo21 != 0) {
            return compareTo21;
        }
        if (isSetShare_img_url() && (compareTo2 = TBaseHelper.compareTo(this.share_img_url, other.share_img_url)) != 0) {
            return compareTo2;
        }
        int compareTo22 = Boolean.valueOf(isSetUser_unfinish_percentage()).compareTo(Boolean.valueOf(other.isSetUser_unfinish_percentage()));
        if (compareTo22 != 0) {
            return compareTo22;
        }
        if (!isSetUser_unfinish_percentage() || (compareTo = TBaseHelper.compareTo(this.user_unfinish_percentage, other.user_unfinish_percentage)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserFinishBookFlauntInfo, _Fields> deepCopy2() {
        return new UserFinishBookFlauntInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserFinishBookFlauntInfo$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getWord_level_id());
            case 2:
                return getBook_name();
            case 3:
                return Integer.valueOf(getTotal_daka_days());
            case 4:
                return Integer.valueOf(getTotal_words());
            case 5:
                return Integer.valueOf(getReview_round());
            case 6:
                return getShare_url_weixin();
            case 7:
                return getShare_url_qq();
            case 8:
                return getShare_title();
            case 9:
                return getShare_desc();
            case 10:
                return getShare_img_url();
            case 11:
                return Integer.valueOf(getUser_unfinish_percentage());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserFinishBookFlauntInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetWord_level_id();
            case 2:
                return isSetBook_name();
            case 3:
                return isSetTotal_daka_days();
            case 4:
                return isSetTotal_words();
            case 5:
                return isSetReview_round();
            case 6:
                return isSetShare_url_weixin();
            case 7:
                return isSetShare_url_qq();
            case 8:
                return isSetShare_title();
            case 9:
                return isSetShare_desc();
            case 10:
                return isSetShare_img_url();
            case 11:
                return isSetUser_unfinish_percentage();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserFinishBookFlauntInfo$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setWord_level_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetWord_level_id();
                    break;
                }
            case 2:
                if (value != null) {
                    setBook_name((String) value);
                    break;
                } else {
                    unsetBook_name();
                    break;
                }
            case 3:
                if (value != null) {
                    setTotal_daka_days(((Integer) value).intValue());
                    break;
                } else {
                    unsetTotal_daka_days();
                    break;
                }
            case 4:
                if (value != null) {
                    setTotal_words(((Integer) value).intValue());
                    break;
                } else {
                    unsetTotal_words();
                    break;
                }
            case 5:
                if (value != null) {
                    setReview_round(((Integer) value).intValue());
                    break;
                } else {
                    unsetReview_round();
                    break;
                }
            case 6:
                if (value != null) {
                    setShare_url_weixin((String) value);
                    break;
                } else {
                    unsetShare_url_weixin();
                    break;
                }
            case 7:
                if (value != null) {
                    setShare_url_qq((String) value);
                    break;
                } else {
                    unsetShare_url_qq();
                    break;
                }
            case 8:
                if (value != null) {
                    setShare_title((String) value);
                    break;
                } else {
                    unsetShare_title();
                    break;
                }
            case 9:
                if (value != null) {
                    setShare_desc((String) value);
                    break;
                } else {
                    unsetShare_desc();
                    break;
                }
            case 10:
                if (value != null) {
                    setShare_img_url((String) value);
                    break;
                } else {
                    unsetShare_img_url();
                    break;
                }
            case 11:
                if (value != null) {
                    setUser_unfinish_percentage(((Integer) value).intValue());
                    break;
                } else {
                    unsetUser_unfinish_percentage();
                    break;
                }
        }
    }

    public UserFinishBookFlauntInfo(int word_level_id, String book_name, int total_daka_days, int total_words, int review_round, String share_url_weixin, String share_url_qq, String share_title, String share_desc, String share_img_url, int user_unfinish_percentage) {
        this();
        this.word_level_id = word_level_id;
        setWord_level_idIsSet(true);
        this.book_name = book_name;
        this.total_daka_days = total_daka_days;
        setTotal_daka_daysIsSet(true);
        this.total_words = total_words;
        setTotal_wordsIsSet(true);
        this.review_round = review_round;
        setReview_roundIsSet(true);
        this.share_url_weixin = share_url_weixin;
        this.share_url_qq = share_url_qq;
        this.share_title = share_title;
        this.share_desc = share_desc;
        this.share_img_url = share_img_url;
        this.user_unfinish_percentage = user_unfinish_percentage;
        setUser_unfinish_percentageIsSet(true);
    }

    public boolean equals(UserFinishBookFlauntInfo that) {
        if (that == null || this.word_level_id != that.word_level_id) {
            return false;
        }
        boolean isSetBook_name = isSetBook_name();
        boolean isSetBook_name2 = that.isSetBook_name();
        if (((isSetBook_name || isSetBook_name2) && (!isSetBook_name || !isSetBook_name2 || !this.book_name.equals(that.book_name))) || this.total_daka_days != that.total_daka_days || this.total_words != that.total_words || this.review_round != that.review_round) {
            return false;
        }
        boolean isSetShare_url_weixin = isSetShare_url_weixin();
        boolean isSetShare_url_weixin2 = that.isSetShare_url_weixin();
        if ((isSetShare_url_weixin || isSetShare_url_weixin2) && !(isSetShare_url_weixin && isSetShare_url_weixin2 && this.share_url_weixin.equals(that.share_url_weixin))) {
            return false;
        }
        boolean isSetShare_url_qq = isSetShare_url_qq();
        boolean isSetShare_url_qq2 = that.isSetShare_url_qq();
        if ((isSetShare_url_qq || isSetShare_url_qq2) && !(isSetShare_url_qq && isSetShare_url_qq2 && this.share_url_qq.equals(that.share_url_qq))) {
            return false;
        }
        boolean isSetShare_title = isSetShare_title();
        boolean isSetShare_title2 = that.isSetShare_title();
        if ((isSetShare_title || isSetShare_title2) && !(isSetShare_title && isSetShare_title2 && this.share_title.equals(that.share_title))) {
            return false;
        }
        boolean isSetShare_desc = isSetShare_desc();
        boolean isSetShare_desc2 = that.isSetShare_desc();
        if ((isSetShare_desc || isSetShare_desc2) && !(isSetShare_desc && isSetShare_desc2 && this.share_desc.equals(that.share_desc))) {
            return false;
        }
        boolean isSetShare_img_url = isSetShare_img_url();
        boolean isSetShare_img_url2 = that.isSetShare_img_url();
        return (!(isSetShare_img_url || isSetShare_img_url2) || (isSetShare_img_url && isSetShare_img_url2 && this.share_img_url.equals(that.share_img_url))) && this.user_unfinish_percentage == that.user_unfinish_percentage;
    }

    public UserFinishBookFlauntInfo(UserFinishBookFlauntInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.word_level_id = other.word_level_id;
        if (other.isSetBook_name()) {
            this.book_name = other.book_name;
        }
        this.total_daka_days = other.total_daka_days;
        this.total_words = other.total_words;
        this.review_round = other.review_round;
        if (other.isSetShare_url_weixin()) {
            this.share_url_weixin = other.share_url_weixin;
        }
        if (other.isSetShare_url_qq()) {
            this.share_url_qq = other.share_url_qq;
        }
        if (other.isSetShare_title()) {
            this.share_title = other.share_title;
        }
        if (other.isSetShare_desc()) {
            this.share_desc = other.share_desc;
        }
        if (other.isSetShare_img_url()) {
            this.share_img_url = other.share_img_url;
        }
        this.user_unfinish_percentage = other.user_unfinish_percentage;
    }
}
