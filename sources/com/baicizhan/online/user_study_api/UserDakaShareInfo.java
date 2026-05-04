package com.baicizhan.online.user_study_api;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TBase;
import org.apache.thrift.TBaseHelper;
import org.apache.thrift.TException;
import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TField;
import org.apache.thrift.protocol.TList;
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
public class UserDakaShareInfo implements TBase<UserDakaShareInfo, _Fields>, Serializable, Cloneable, Comparable<UserDakaShareInfo> {
    private static final int __TOTAL_DAKA_DAYS_ISSET_ID = 0;
    private static final int __TOTAL_WORDS_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public List<UserDakaDate> daka_dates;
    private _Fields[] optionals;
    public String qzone_share_url;
    public List<UserDakaSpecialDay> special_days;
    public int total_daka_days;
    public int total_words;
    public String weibo_share_img_url;
    public String weibo_share_txt;
    public List<String> weixin_share_pic_urls;
    public String weixin_share_title;
    public String weixin_share_url;
    public String xhs_share_content;
    public String xhs_share_title;
    private static final TStruct STRUCT_DESC = new TStruct("UserDakaShareInfo");
    private static final TField WEIBO_SHARE_TXT_FIELD_DESC = new TField("weibo_share_txt", (byte) 11, 1);
    private static final TField WEIBO_SHARE_IMG_URL_FIELD_DESC = new TField("weibo_share_img_url", (byte) 11, 2);
    private static final TField WEIXIN_SHARE_TITLE_FIELD_DESC = new TField("weixin_share_title", (byte) 11, 3);
    private static final TField WEIXIN_SHARE_URL_FIELD_DESC = new TField("weixin_share_url", (byte) 11, 4);
    private static final TField WEIXIN_SHARE_PIC_URLS_FIELD_DESC = new TField("weixin_share_pic_urls", (byte) 15, 5);
    private static final TField QZONE_SHARE_URL_FIELD_DESC = new TField("qzone_share_url", (byte) 11, 6);
    private static final TField TOTAL_DAKA_DAYS_FIELD_DESC = new TField("total_daka_days", (byte) 8, 7);
    private static final TField DAKA_DATES_FIELD_DESC = new TField("daka_dates", (byte) 15, 8);
    private static final TField SPECIAL_DAYS_FIELD_DESC = new TField("special_days", (byte) 15, 9);
    private static final TField XHS_SHARE_TITLE_FIELD_DESC = new TField("xhs_share_title", (byte) 11, 10);
    private static final TField XHS_SHARE_CONTENT_FIELD_DESC = new TField("xhs_share_content", (byte) 11, 11);
    private static final TField TOTAL_WORDS_FIELD_DESC = new TField("total_words", (byte) 8, 12);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.UserDakaShareInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$UserDakaShareInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$UserDakaShareInfo$_Fields = iArr;
            try {
                iArr[_Fields.WEIBO_SHARE_TXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserDakaShareInfo$_Fields[_Fields.WEIBO_SHARE_IMG_URL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserDakaShareInfo$_Fields[_Fields.WEIXIN_SHARE_TITLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserDakaShareInfo$_Fields[_Fields.WEIXIN_SHARE_URL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserDakaShareInfo$_Fields[_Fields.WEIXIN_SHARE_PIC_URLS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserDakaShareInfo$_Fields[_Fields.QZONE_SHARE_URL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserDakaShareInfo$_Fields[_Fields.TOTAL_DAKA_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserDakaShareInfo$_Fields[_Fields.DAKA_DATES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserDakaShareInfo$_Fields[_Fields.SPECIAL_DAYS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserDakaShareInfo$_Fields[_Fields.XHS_SHARE_TITLE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserDakaShareInfo$_Fields[_Fields.XHS_SHARE_CONTENT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserDakaShareInfo$_Fields[_Fields.TOTAL_WORDS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserDakaShareInfoStandardScheme extends StandardScheme<UserDakaShareInfo> {
        private UserDakaShareInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserDakaShareInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (struct.isSetTotal_daka_days()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'total_daka_days' was not found in serialized data! Struct: " + toString());
                }
                int i11 = 0;
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.weibo_share_txt = iprot.readString();
                            struct.setWeibo_share_txtIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.weibo_share_img_url = iprot.readString();
                            struct.setWeibo_share_img_urlIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.weixin_share_title = iprot.readString();
                            struct.setWeixin_share_titleIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.weixin_share_url = iprot.readString();
                            struct.setWeixin_share_urlIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 15) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            TList readListBegin = iprot.readListBegin();
                            struct.weixin_share_pic_urls = new ArrayList(readListBegin.size);
                            while (i11 < readListBegin.size) {
                                struct.weixin_share_pic_urls.add(iprot.readString());
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setWeixin_share_pic_urlsIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.qzone_share_url = iprot.readString();
                            struct.setQzone_share_urlIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.total_daka_days = iprot.readI32();
                            struct.setTotal_daka_daysIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 15) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            TList readListBegin2 = iprot.readListBegin();
                            struct.daka_dates = new ArrayList(readListBegin2.size);
                            while (i11 < readListBegin2.size) {
                                UserDakaDate userDakaDate = new UserDakaDate();
                                userDakaDate.read(iprot);
                                struct.daka_dates.add(userDakaDate);
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setDaka_datesIsSet(true);
                            break;
                        }
                    case 9:
                        if (b11 != 15) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            TList readListBegin3 = iprot.readListBegin();
                            struct.special_days = new ArrayList(readListBegin3.size);
                            while (i11 < readListBegin3.size) {
                                UserDakaSpecialDay userDakaSpecialDay = new UserDakaSpecialDay();
                                userDakaSpecialDay.read(iprot);
                                struct.special_days.add(userDakaSpecialDay);
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setSpecial_daysIsSet(true);
                            break;
                        }
                    case 10:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.xhs_share_title = iprot.readString();
                            struct.setXhs_share_titleIsSet(true);
                            break;
                        }
                    case 11:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.xhs_share_content = iprot.readString();
                            struct.setXhs_share_contentIsSet(true);
                            break;
                        }
                    case 12:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.total_words = iprot.readI32();
                            struct.setTotal_wordsIsSet(true);
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
        public void write(TProtocol oprot, UserDakaShareInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserDakaShareInfo.STRUCT_DESC);
            if (struct.weibo_share_txt != null) {
                oprot.writeFieldBegin(UserDakaShareInfo.WEIBO_SHARE_TXT_FIELD_DESC);
                oprot.writeString(struct.weibo_share_txt);
                oprot.writeFieldEnd();
            }
            if (struct.weibo_share_img_url != null) {
                oprot.writeFieldBegin(UserDakaShareInfo.WEIBO_SHARE_IMG_URL_FIELD_DESC);
                oprot.writeString(struct.weibo_share_img_url);
                oprot.writeFieldEnd();
            }
            if (struct.weixin_share_title != null) {
                oprot.writeFieldBegin(UserDakaShareInfo.WEIXIN_SHARE_TITLE_FIELD_DESC);
                oprot.writeString(struct.weixin_share_title);
                oprot.writeFieldEnd();
            }
            if (struct.weixin_share_url != null) {
                oprot.writeFieldBegin(UserDakaShareInfo.WEIXIN_SHARE_URL_FIELD_DESC);
                oprot.writeString(struct.weixin_share_url);
                oprot.writeFieldEnd();
            }
            if (struct.weixin_share_pic_urls != null) {
                oprot.writeFieldBegin(UserDakaShareInfo.WEIXIN_SHARE_PIC_URLS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 11, struct.weixin_share_pic_urls.size()));
                Iterator<String> it = struct.weixin_share_pic_urls.iterator();
                while (it.hasNext()) {
                    oprot.writeString(it.next());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.qzone_share_url != null) {
                oprot.writeFieldBegin(UserDakaShareInfo.QZONE_SHARE_URL_FIELD_DESC);
                oprot.writeString(struct.qzone_share_url);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(UserDakaShareInfo.TOTAL_DAKA_DAYS_FIELD_DESC);
            oprot.writeI32(struct.total_daka_days);
            oprot.writeFieldEnd();
            if (struct.daka_dates != null) {
                oprot.writeFieldBegin(UserDakaShareInfo.DAKA_DATES_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.daka_dates.size()));
                Iterator<UserDakaDate> it2 = struct.daka_dates.iterator();
                while (it2.hasNext()) {
                    it2.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.special_days != null) {
                oprot.writeFieldBegin(UserDakaShareInfo.SPECIAL_DAYS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.special_days.size()));
                Iterator<UserDakaSpecialDay> it3 = struct.special_days.iterator();
                while (it3.hasNext()) {
                    it3.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.xhs_share_title != null && struct.isSetXhs_share_title()) {
                oprot.writeFieldBegin(UserDakaShareInfo.XHS_SHARE_TITLE_FIELD_DESC);
                oprot.writeString(struct.xhs_share_title);
                oprot.writeFieldEnd();
            }
            if (struct.xhs_share_content != null && struct.isSetXhs_share_content()) {
                oprot.writeFieldBegin(UserDakaShareInfo.XHS_SHARE_CONTENT_FIELD_DESC);
                oprot.writeString(struct.xhs_share_content);
                oprot.writeFieldEnd();
            }
            if (struct.isSetTotal_words()) {
                oprot.writeFieldBegin(UserDakaShareInfo.TOTAL_WORDS_FIELD_DESC);
                oprot.writeI32(struct.total_words);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserDakaShareInfoStandardSchemeFactory implements SchemeFactory {
        private UserDakaShareInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserDakaShareInfoStandardScheme getScheme() {
            return new UserDakaShareInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserDakaShareInfoTupleScheme extends TupleScheme<UserDakaShareInfo> {
        private UserDakaShareInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserDakaShareInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.weibo_share_txt = tTupleProtocol.readString();
            struct.setWeibo_share_txtIsSet(true);
            struct.weibo_share_img_url = tTupleProtocol.readString();
            struct.setWeibo_share_img_urlIsSet(true);
            struct.weixin_share_title = tTupleProtocol.readString();
            struct.setWeixin_share_titleIsSet(true);
            struct.weixin_share_url = tTupleProtocol.readString();
            struct.setWeixin_share_urlIsSet(true);
            TList tList = new TList((byte) 11, tTupleProtocol.readI32());
            struct.weixin_share_pic_urls = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                struct.weixin_share_pic_urls.add(tTupleProtocol.readString());
            }
            struct.setWeixin_share_pic_urlsIsSet(true);
            struct.qzone_share_url = tTupleProtocol.readString();
            struct.setQzone_share_urlIsSet(true);
            struct.total_daka_days = tTupleProtocol.readI32();
            struct.setTotal_daka_daysIsSet(true);
            TList tList2 = new TList((byte) 12, tTupleProtocol.readI32());
            struct.daka_dates = new ArrayList(tList2.size);
            for (int i12 = 0; i12 < tList2.size; i12++) {
                UserDakaDate userDakaDate = new UserDakaDate();
                userDakaDate.read(tTupleProtocol);
                struct.daka_dates.add(userDakaDate);
            }
            struct.setDaka_datesIsSet(true);
            TList tList3 = new TList((byte) 12, tTupleProtocol.readI32());
            struct.special_days = new ArrayList(tList3.size);
            for (int i13 = 0; i13 < tList3.size; i13++) {
                UserDakaSpecialDay userDakaSpecialDay = new UserDakaSpecialDay();
                userDakaSpecialDay.read(tTupleProtocol);
                struct.special_days.add(userDakaSpecialDay);
            }
            struct.setSpecial_daysIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(3);
            if (readBitSet.get(0)) {
                struct.xhs_share_title = tTupleProtocol.readString();
                struct.setXhs_share_titleIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.xhs_share_content = tTupleProtocol.readString();
                struct.setXhs_share_contentIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.total_words = tTupleProtocol.readI32();
                struct.setTotal_wordsIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserDakaShareInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.weibo_share_txt);
            tTupleProtocol.writeString(struct.weibo_share_img_url);
            tTupleProtocol.writeString(struct.weixin_share_title);
            tTupleProtocol.writeString(struct.weixin_share_url);
            tTupleProtocol.writeI32(struct.weixin_share_pic_urls.size());
            Iterator<String> it = struct.weixin_share_pic_urls.iterator();
            while (it.hasNext()) {
                tTupleProtocol.writeString(it.next());
            }
            tTupleProtocol.writeString(struct.qzone_share_url);
            tTupleProtocol.writeI32(struct.total_daka_days);
            tTupleProtocol.writeI32(struct.daka_dates.size());
            Iterator<UserDakaDate> it2 = struct.daka_dates.iterator();
            while (it2.hasNext()) {
                it2.next().write(tTupleProtocol);
            }
            tTupleProtocol.writeI32(struct.special_days.size());
            Iterator<UserDakaSpecialDay> it3 = struct.special_days.iterator();
            while (it3.hasNext()) {
                it3.next().write(tTupleProtocol);
            }
            BitSet bitSet = new BitSet();
            if (struct.isSetXhs_share_title()) {
                bitSet.set(0);
            }
            if (struct.isSetXhs_share_content()) {
                bitSet.set(1);
            }
            if (struct.isSetTotal_words()) {
                bitSet.set(2);
            }
            tTupleProtocol.writeBitSet(bitSet, 3);
            if (struct.isSetXhs_share_title()) {
                tTupleProtocol.writeString(struct.xhs_share_title);
            }
            if (struct.isSetXhs_share_content()) {
                tTupleProtocol.writeString(struct.xhs_share_content);
            }
            if (struct.isSetTotal_words()) {
                tTupleProtocol.writeI32(struct.total_words);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserDakaShareInfoTupleSchemeFactory implements SchemeFactory {
        private UserDakaShareInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserDakaShareInfoTupleScheme getScheme() {
            return new UserDakaShareInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        WEIBO_SHARE_TXT(1, "weibo_share_txt"),
        WEIBO_SHARE_IMG_URL(2, "weibo_share_img_url"),
        WEIXIN_SHARE_TITLE(3, "weixin_share_title"),
        WEIXIN_SHARE_URL(4, "weixin_share_url"),
        WEIXIN_SHARE_PIC_URLS(5, "weixin_share_pic_urls"),
        QZONE_SHARE_URL(6, "qzone_share_url"),
        TOTAL_DAKA_DAYS(7, "total_daka_days"),
        DAKA_DATES(8, "daka_dates"),
        SPECIAL_DAYS(9, "special_days"),
        XHS_SHARE_TITLE(10, "xhs_share_title"),
        XHS_SHARE_CONTENT(11, "xhs_share_content"),
        TOTAL_WORDS(12, "total_words");

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
                    return WEIBO_SHARE_TXT;
                case 2:
                    return WEIBO_SHARE_IMG_URL;
                case 3:
                    return WEIXIN_SHARE_TITLE;
                case 4:
                    return WEIXIN_SHARE_URL;
                case 5:
                    return WEIXIN_SHARE_PIC_URLS;
                case 6:
                    return QZONE_SHARE_URL;
                case 7:
                    return TOTAL_DAKA_DAYS;
                case 8:
                    return DAKA_DATES;
                case 9:
                    return SPECIAL_DAYS;
                case 10:
                    return XHS_SHARE_TITLE;
                case 11:
                    return XHS_SHARE_CONTENT;
                case 12:
                    return TOTAL_WORDS;
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
        hashMap.put(StandardScheme.class, new UserDakaShareInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserDakaShareInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.WEIBO_SHARE_TXT, (_Fields) new FieldMetaData("weibo_share_txt", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.WEIBO_SHARE_IMG_URL, (_Fields) new FieldMetaData("weibo_share_img_url", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.WEIXIN_SHARE_TITLE, (_Fields) new FieldMetaData("weixin_share_title", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.WEIXIN_SHARE_URL, (_Fields) new FieldMetaData("weixin_share_url", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.WEIXIN_SHARE_PIC_URLS, (_Fields) new FieldMetaData("weixin_share_pic_urls", (byte) 1, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 11))));
        enumMap.put((EnumMap) _Fields.QZONE_SHARE_URL, (_Fields) new FieldMetaData("qzone_share_url", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.TOTAL_DAKA_DAYS, (_Fields) new FieldMetaData("total_daka_days", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.DAKA_DATES, (_Fields) new FieldMetaData("daka_dates", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, UserDakaDate.class))));
        enumMap.put((EnumMap) _Fields.SPECIAL_DAYS, (_Fields) new FieldMetaData("special_days", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, UserDakaSpecialDay.class))));
        enumMap.put((EnumMap) _Fields.XHS_SHARE_TITLE, (_Fields) new FieldMetaData("xhs_share_title", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.XHS_SHARE_CONTENT, (_Fields) new FieldMetaData("xhs_share_content", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.TOTAL_WORDS, (_Fields) new FieldMetaData("total_words", (byte) 2, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserDakaShareInfo.class, unmodifiableMap);
    }

    public UserDakaShareInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.XHS_SHARE_TITLE, _Fields.XHS_SHARE_CONTENT, _Fields.TOTAL_WORDS};
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

    public void addToDaka_dates(UserDakaDate elem) {
        if (this.daka_dates == null) {
            this.daka_dates = new ArrayList();
        }
        this.daka_dates.add(elem);
    }

    public void addToSpecial_days(UserDakaSpecialDay elem) {
        if (this.special_days == null) {
            this.special_days = new ArrayList();
        }
        this.special_days.add(elem);
    }

    public void addToWeixin_share_pic_urls(String elem) {
        if (this.weixin_share_pic_urls == null) {
            this.weixin_share_pic_urls = new ArrayList();
        }
        this.weixin_share_pic_urls.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.weibo_share_txt = null;
        this.weibo_share_img_url = null;
        this.weixin_share_title = null;
        this.weixin_share_url = null;
        this.weixin_share_pic_urls = null;
        this.qzone_share_url = null;
        setTotal_daka_daysIsSet(false);
        this.total_daka_days = 0;
        this.daka_dates = null;
        this.special_days = null;
        this.xhs_share_title = null;
        this.xhs_share_content = null;
        setTotal_wordsIsSet(false);
        this.total_words = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserDakaShareInfo)) {
            return equals((UserDakaShareInfo) that);
        }
        return false;
    }

    public List<UserDakaDate> getDaka_dates() {
        return this.daka_dates;
    }

    public Iterator<UserDakaDate> getDaka_datesIterator() {
        List<UserDakaDate> list = this.daka_dates;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getDaka_datesSize() {
        List<UserDakaDate> list = this.daka_dates;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public String getQzone_share_url() {
        return this.qzone_share_url;
    }

    public List<UserDakaSpecialDay> getSpecial_days() {
        return this.special_days;
    }

    public Iterator<UserDakaSpecialDay> getSpecial_daysIterator() {
        List<UserDakaSpecialDay> list = this.special_days;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getSpecial_daysSize() {
        List<UserDakaSpecialDay> list = this.special_days;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int getTotal_daka_days() {
        return this.total_daka_days;
    }

    public int getTotal_words() {
        return this.total_words;
    }

    public String getWeibo_share_img_url() {
        return this.weibo_share_img_url;
    }

    public String getWeibo_share_txt() {
        return this.weibo_share_txt;
    }

    public List<String> getWeixin_share_pic_urls() {
        return this.weixin_share_pic_urls;
    }

    public Iterator<String> getWeixin_share_pic_urlsIterator() {
        List<String> list = this.weixin_share_pic_urls;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getWeixin_share_pic_urlsSize() {
        List<String> list = this.weixin_share_pic_urls;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public String getWeixin_share_title() {
        return this.weixin_share_title;
    }

    public String getWeixin_share_url() {
        return this.weixin_share_url;
    }

    public String getXhs_share_content() {
        return this.xhs_share_content;
    }

    public String getXhs_share_title() {
        return this.xhs_share_title;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetDaka_dates() {
        return this.daka_dates != null;
    }

    public boolean isSetQzone_share_url() {
        return this.qzone_share_url != null;
    }

    public boolean isSetSpecial_days() {
        return this.special_days != null;
    }

    public boolean isSetTotal_daka_days() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetTotal_words() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetWeibo_share_img_url() {
        return this.weibo_share_img_url != null;
    }

    public boolean isSetWeibo_share_txt() {
        return this.weibo_share_txt != null;
    }

    public boolean isSetWeixin_share_pic_urls() {
        return this.weixin_share_pic_urls != null;
    }

    public boolean isSetWeixin_share_title() {
        return this.weixin_share_title != null;
    }

    public boolean isSetWeixin_share_url() {
        return this.weixin_share_url != null;
    }

    public boolean isSetXhs_share_content() {
        return this.xhs_share_content != null;
    }

    public boolean isSetXhs_share_title() {
        return this.xhs_share_title != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserDakaShareInfo setDaka_dates(List<UserDakaDate> daka_dates) {
        this.daka_dates = daka_dates;
        return this;
    }

    public void setDaka_datesIsSet(boolean value) {
        if (value) {
            return;
        }
        this.daka_dates = null;
    }

    public UserDakaShareInfo setQzone_share_url(String qzone_share_url) {
        this.qzone_share_url = qzone_share_url;
        return this;
    }

    public void setQzone_share_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.qzone_share_url = null;
    }

    public UserDakaShareInfo setSpecial_days(List<UserDakaSpecialDay> special_days) {
        this.special_days = special_days;
        return this;
    }

    public void setSpecial_daysIsSet(boolean value) {
        if (value) {
            return;
        }
        this.special_days = null;
    }

    public UserDakaShareInfo setTotal_daka_days(int total_daka_days) {
        this.total_daka_days = total_daka_days;
        setTotal_daka_daysIsSet(true);
        return this;
    }

    public void setTotal_daka_daysIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public UserDakaShareInfo setTotal_words(int total_words) {
        this.total_words = total_words;
        setTotal_wordsIsSet(true);
        return this;
    }

    public void setTotal_wordsIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public UserDakaShareInfo setWeibo_share_img_url(String weibo_share_img_url) {
        this.weibo_share_img_url = weibo_share_img_url;
        return this;
    }

    public void setWeibo_share_img_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.weibo_share_img_url = null;
    }

    public UserDakaShareInfo setWeibo_share_txt(String weibo_share_txt) {
        this.weibo_share_txt = weibo_share_txt;
        return this;
    }

    public void setWeibo_share_txtIsSet(boolean value) {
        if (value) {
            return;
        }
        this.weibo_share_txt = null;
    }

    public UserDakaShareInfo setWeixin_share_pic_urls(List<String> weixin_share_pic_urls) {
        this.weixin_share_pic_urls = weixin_share_pic_urls;
        return this;
    }

    public void setWeixin_share_pic_urlsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.weixin_share_pic_urls = null;
    }

    public UserDakaShareInfo setWeixin_share_title(String weixin_share_title) {
        this.weixin_share_title = weixin_share_title;
        return this;
    }

    public void setWeixin_share_titleIsSet(boolean value) {
        if (value) {
            return;
        }
        this.weixin_share_title = null;
    }

    public UserDakaShareInfo setWeixin_share_url(String weixin_share_url) {
        this.weixin_share_url = weixin_share_url;
        return this;
    }

    public void setWeixin_share_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.weixin_share_url = null;
    }

    public UserDakaShareInfo setXhs_share_content(String xhs_share_content) {
        this.xhs_share_content = xhs_share_content;
        return this;
    }

    public void setXhs_share_contentIsSet(boolean value) {
        if (value) {
            return;
        }
        this.xhs_share_content = null;
    }

    public UserDakaShareInfo setXhs_share_title(String xhs_share_title) {
        this.xhs_share_title = xhs_share_title;
        return this;
    }

    public void setXhs_share_titleIsSet(boolean value) {
        if (value) {
            return;
        }
        this.xhs_share_title = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserDakaShareInfo(");
        sb2.append("weibo_share_txt:");
        String str = this.weibo_share_txt;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("weibo_share_img_url:");
        String str2 = this.weibo_share_img_url;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("weixin_share_title:");
        String str3 = this.weixin_share_title;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("weixin_share_url:");
        String str4 = this.weixin_share_url;
        if (str4 == null) {
            sb2.append("null");
        } else {
            sb2.append(str4);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("weixin_share_pic_urls:");
        List<String> list = this.weixin_share_pic_urls;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("qzone_share_url:");
        String str5 = this.qzone_share_url;
        if (str5 == null) {
            sb2.append("null");
        } else {
            sb2.append(str5);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("total_daka_days:");
        sb2.append(this.total_daka_days);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("daka_dates:");
        List<UserDakaDate> list2 = this.daka_dates;
        if (list2 == null) {
            sb2.append("null");
        } else {
            sb2.append(list2);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("special_days:");
        List<UserDakaSpecialDay> list3 = this.special_days;
        if (list3 == null) {
            sb2.append("null");
        } else {
            sb2.append(list3);
        }
        if (isSetXhs_share_title()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("xhs_share_title:");
            String str6 = this.xhs_share_title;
            if (str6 == null) {
                sb2.append("null");
            } else {
                sb2.append(str6);
            }
        }
        if (isSetXhs_share_content()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("xhs_share_content:");
            String str7 = this.xhs_share_content;
            if (str7 == null) {
                sb2.append("null");
            } else {
                sb2.append(str7);
            }
        }
        if (isSetTotal_words()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("total_words:");
            sb2.append(this.total_words);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetDaka_dates() {
        this.daka_dates = null;
    }

    public void unsetQzone_share_url() {
        this.qzone_share_url = null;
    }

    public void unsetSpecial_days() {
        this.special_days = null;
    }

    public void unsetTotal_daka_days() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetTotal_words() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetWeibo_share_img_url() {
        this.weibo_share_img_url = null;
    }

    public void unsetWeibo_share_txt() {
        this.weibo_share_txt = null;
    }

    public void unsetWeixin_share_pic_urls() {
        this.weixin_share_pic_urls = null;
    }

    public void unsetWeixin_share_title() {
        this.weixin_share_title = null;
    }

    public void unsetWeixin_share_url() {
        this.weixin_share_url = null;
    }

    public void unsetXhs_share_content() {
        this.xhs_share_content = null;
    }

    public void unsetXhs_share_title() {
        this.xhs_share_title = null;
    }

    public void validate() throws TException {
        if (this.weibo_share_txt == null) {
            throw new TProtocolException("Required field 'weibo_share_txt' was not present! Struct: " + toString());
        }
        if (this.weibo_share_img_url == null) {
            throw new TProtocolException("Required field 'weibo_share_img_url' was not present! Struct: " + toString());
        }
        if (this.weixin_share_title == null) {
            throw new TProtocolException("Required field 'weixin_share_title' was not present! Struct: " + toString());
        }
        if (this.weixin_share_url == null) {
            throw new TProtocolException("Required field 'weixin_share_url' was not present! Struct: " + toString());
        }
        if (this.weixin_share_pic_urls == null) {
            throw new TProtocolException("Required field 'weixin_share_pic_urls' was not present! Struct: " + toString());
        }
        if (this.qzone_share_url == null) {
            throw new TProtocolException("Required field 'qzone_share_url' was not present! Struct: " + toString());
        }
        if (this.daka_dates == null) {
            throw new TProtocolException("Required field 'daka_dates' was not present! Struct: " + toString());
        }
        if (this.special_days != null) {
            return;
        }
        throw new TProtocolException("Required field 'special_days' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(UserDakaShareInfo other) {
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
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo13 = Boolean.valueOf(isSetWeibo_share_txt()).compareTo(Boolean.valueOf(other.isSetWeibo_share_txt()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetWeibo_share_txt() && (compareTo12 = TBaseHelper.compareTo(this.weibo_share_txt, other.weibo_share_txt)) != 0) {
            return compareTo12;
        }
        int compareTo14 = Boolean.valueOf(isSetWeibo_share_img_url()).compareTo(Boolean.valueOf(other.isSetWeibo_share_img_url()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (isSetWeibo_share_img_url() && (compareTo11 = TBaseHelper.compareTo(this.weibo_share_img_url, other.weibo_share_img_url)) != 0) {
            return compareTo11;
        }
        int compareTo15 = Boolean.valueOf(isSetWeixin_share_title()).compareTo(Boolean.valueOf(other.isSetWeixin_share_title()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (isSetWeixin_share_title() && (compareTo10 = TBaseHelper.compareTo(this.weixin_share_title, other.weixin_share_title)) != 0) {
            return compareTo10;
        }
        int compareTo16 = Boolean.valueOf(isSetWeixin_share_url()).compareTo(Boolean.valueOf(other.isSetWeixin_share_url()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (isSetWeixin_share_url() && (compareTo9 = TBaseHelper.compareTo(this.weixin_share_url, other.weixin_share_url)) != 0) {
            return compareTo9;
        }
        int compareTo17 = Boolean.valueOf(isSetWeixin_share_pic_urls()).compareTo(Boolean.valueOf(other.isSetWeixin_share_pic_urls()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (isSetWeixin_share_pic_urls() && (compareTo8 = TBaseHelper.compareTo((List) this.weixin_share_pic_urls, (List) other.weixin_share_pic_urls)) != 0) {
            return compareTo8;
        }
        int compareTo18 = Boolean.valueOf(isSetQzone_share_url()).compareTo(Boolean.valueOf(other.isSetQzone_share_url()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (isSetQzone_share_url() && (compareTo7 = TBaseHelper.compareTo(this.qzone_share_url, other.qzone_share_url)) != 0) {
            return compareTo7;
        }
        int compareTo19 = Boolean.valueOf(isSetTotal_daka_days()).compareTo(Boolean.valueOf(other.isSetTotal_daka_days()));
        if (compareTo19 != 0) {
            return compareTo19;
        }
        if (isSetTotal_daka_days() && (compareTo6 = TBaseHelper.compareTo(this.total_daka_days, other.total_daka_days)) != 0) {
            return compareTo6;
        }
        int compareTo20 = Boolean.valueOf(isSetDaka_dates()).compareTo(Boolean.valueOf(other.isSetDaka_dates()));
        if (compareTo20 != 0) {
            return compareTo20;
        }
        if (isSetDaka_dates() && (compareTo5 = TBaseHelper.compareTo((List) this.daka_dates, (List) other.daka_dates)) != 0) {
            return compareTo5;
        }
        int compareTo21 = Boolean.valueOf(isSetSpecial_days()).compareTo(Boolean.valueOf(other.isSetSpecial_days()));
        if (compareTo21 != 0) {
            return compareTo21;
        }
        if (isSetSpecial_days() && (compareTo4 = TBaseHelper.compareTo((List) this.special_days, (List) other.special_days)) != 0) {
            return compareTo4;
        }
        int compareTo22 = Boolean.valueOf(isSetXhs_share_title()).compareTo(Boolean.valueOf(other.isSetXhs_share_title()));
        if (compareTo22 != 0) {
            return compareTo22;
        }
        if (isSetXhs_share_title() && (compareTo3 = TBaseHelper.compareTo(this.xhs_share_title, other.xhs_share_title)) != 0) {
            return compareTo3;
        }
        int compareTo23 = Boolean.valueOf(isSetXhs_share_content()).compareTo(Boolean.valueOf(other.isSetXhs_share_content()));
        if (compareTo23 != 0) {
            return compareTo23;
        }
        if (isSetXhs_share_content() && (compareTo2 = TBaseHelper.compareTo(this.xhs_share_content, other.xhs_share_content)) != 0) {
            return compareTo2;
        }
        int compareTo24 = Boolean.valueOf(isSetTotal_words()).compareTo(Boolean.valueOf(other.isSetTotal_words()));
        if (compareTo24 != 0) {
            return compareTo24;
        }
        if (!isSetTotal_words() || (compareTo = TBaseHelper.compareTo(this.total_words, other.total_words)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserDakaShareInfo, _Fields> deepCopy2() {
        return new UserDakaShareInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserDakaShareInfo$_Fields[field.ordinal()]) {
            case 1:
                return getWeibo_share_txt();
            case 2:
                return getWeibo_share_img_url();
            case 3:
                return getWeixin_share_title();
            case 4:
                return getWeixin_share_url();
            case 5:
                return getWeixin_share_pic_urls();
            case 6:
                return getQzone_share_url();
            case 7:
                return Integer.valueOf(getTotal_daka_days());
            case 8:
                return getDaka_dates();
            case 9:
                return getSpecial_days();
            case 10:
                return getXhs_share_title();
            case 11:
                return getXhs_share_content();
            case 12:
                return Integer.valueOf(getTotal_words());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserDakaShareInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetWeibo_share_txt();
            case 2:
                return isSetWeibo_share_img_url();
            case 3:
                return isSetWeixin_share_title();
            case 4:
                return isSetWeixin_share_url();
            case 5:
                return isSetWeixin_share_pic_urls();
            case 6:
                return isSetQzone_share_url();
            case 7:
                return isSetTotal_daka_days();
            case 8:
                return isSetDaka_dates();
            case 9:
                return isSetSpecial_days();
            case 10:
                return isSetXhs_share_title();
            case 11:
                return isSetXhs_share_content();
            case 12:
                return isSetTotal_words();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserDakaShareInfo$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setWeibo_share_txt((String) value);
                    break;
                } else {
                    unsetWeibo_share_txt();
                    break;
                }
            case 2:
                if (value != null) {
                    setWeibo_share_img_url((String) value);
                    break;
                } else {
                    unsetWeibo_share_img_url();
                    break;
                }
            case 3:
                if (value != null) {
                    setWeixin_share_title((String) value);
                    break;
                } else {
                    unsetWeixin_share_title();
                    break;
                }
            case 4:
                if (value != null) {
                    setWeixin_share_url((String) value);
                    break;
                } else {
                    unsetWeixin_share_url();
                    break;
                }
            case 5:
                if (value != null) {
                    setWeixin_share_pic_urls((List) value);
                    break;
                } else {
                    unsetWeixin_share_pic_urls();
                    break;
                }
            case 6:
                if (value != null) {
                    setQzone_share_url((String) value);
                    break;
                } else {
                    unsetQzone_share_url();
                    break;
                }
            case 7:
                if (value != null) {
                    setTotal_daka_days(((Integer) value).intValue());
                    break;
                } else {
                    unsetTotal_daka_days();
                    break;
                }
            case 8:
                if (value != null) {
                    setDaka_dates((List) value);
                    break;
                } else {
                    unsetDaka_dates();
                    break;
                }
            case 9:
                if (value != null) {
                    setSpecial_days((List) value);
                    break;
                } else {
                    unsetSpecial_days();
                    break;
                }
            case 10:
                if (value != null) {
                    setXhs_share_title((String) value);
                    break;
                } else {
                    unsetXhs_share_title();
                    break;
                }
            case 11:
                if (value != null) {
                    setXhs_share_content((String) value);
                    break;
                } else {
                    unsetXhs_share_content();
                    break;
                }
            case 12:
                if (value != null) {
                    setTotal_words(((Integer) value).intValue());
                    break;
                } else {
                    unsetTotal_words();
                    break;
                }
        }
    }

    public boolean equals(UserDakaShareInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetWeibo_share_txt = isSetWeibo_share_txt();
        boolean isSetWeibo_share_txt2 = that.isSetWeibo_share_txt();
        if ((isSetWeibo_share_txt || isSetWeibo_share_txt2) && !(isSetWeibo_share_txt && isSetWeibo_share_txt2 && this.weibo_share_txt.equals(that.weibo_share_txt))) {
            return false;
        }
        boolean isSetWeibo_share_img_url = isSetWeibo_share_img_url();
        boolean isSetWeibo_share_img_url2 = that.isSetWeibo_share_img_url();
        if ((isSetWeibo_share_img_url || isSetWeibo_share_img_url2) && !(isSetWeibo_share_img_url && isSetWeibo_share_img_url2 && this.weibo_share_img_url.equals(that.weibo_share_img_url))) {
            return false;
        }
        boolean isSetWeixin_share_title = isSetWeixin_share_title();
        boolean isSetWeixin_share_title2 = that.isSetWeixin_share_title();
        if ((isSetWeixin_share_title || isSetWeixin_share_title2) && !(isSetWeixin_share_title && isSetWeixin_share_title2 && this.weixin_share_title.equals(that.weixin_share_title))) {
            return false;
        }
        boolean isSetWeixin_share_url = isSetWeixin_share_url();
        boolean isSetWeixin_share_url2 = that.isSetWeixin_share_url();
        if ((isSetWeixin_share_url || isSetWeixin_share_url2) && !(isSetWeixin_share_url && isSetWeixin_share_url2 && this.weixin_share_url.equals(that.weixin_share_url))) {
            return false;
        }
        boolean isSetWeixin_share_pic_urls = isSetWeixin_share_pic_urls();
        boolean isSetWeixin_share_pic_urls2 = that.isSetWeixin_share_pic_urls();
        if ((isSetWeixin_share_pic_urls || isSetWeixin_share_pic_urls2) && !(isSetWeixin_share_pic_urls && isSetWeixin_share_pic_urls2 && this.weixin_share_pic_urls.equals(that.weixin_share_pic_urls))) {
            return false;
        }
        boolean isSetQzone_share_url = isSetQzone_share_url();
        boolean isSetQzone_share_url2 = that.isSetQzone_share_url();
        if (((isSetQzone_share_url || isSetQzone_share_url2) && !(isSetQzone_share_url && isSetQzone_share_url2 && this.qzone_share_url.equals(that.qzone_share_url))) || this.total_daka_days != that.total_daka_days) {
            return false;
        }
        boolean isSetDaka_dates = isSetDaka_dates();
        boolean isSetDaka_dates2 = that.isSetDaka_dates();
        if ((isSetDaka_dates || isSetDaka_dates2) && !(isSetDaka_dates && isSetDaka_dates2 && this.daka_dates.equals(that.daka_dates))) {
            return false;
        }
        boolean isSetSpecial_days = isSetSpecial_days();
        boolean isSetSpecial_days2 = that.isSetSpecial_days();
        if ((isSetSpecial_days || isSetSpecial_days2) && !(isSetSpecial_days && isSetSpecial_days2 && this.special_days.equals(that.special_days))) {
            return false;
        }
        boolean isSetXhs_share_title = isSetXhs_share_title();
        boolean isSetXhs_share_title2 = that.isSetXhs_share_title();
        if ((isSetXhs_share_title || isSetXhs_share_title2) && !(isSetXhs_share_title && isSetXhs_share_title2 && this.xhs_share_title.equals(that.xhs_share_title))) {
            return false;
        }
        boolean isSetXhs_share_content = isSetXhs_share_content();
        boolean isSetXhs_share_content2 = that.isSetXhs_share_content();
        if ((isSetXhs_share_content || isSetXhs_share_content2) && !(isSetXhs_share_content && isSetXhs_share_content2 && this.xhs_share_content.equals(that.xhs_share_content))) {
            return false;
        }
        boolean isSetTotal_words = isSetTotal_words();
        boolean isSetTotal_words2 = that.isSetTotal_words();
        if (isSetTotal_words || isSetTotal_words2) {
            return isSetTotal_words && isSetTotal_words2 && this.total_words == that.total_words;
        }
        return true;
    }

    public UserDakaShareInfo(String weibo_share_txt, String weibo_share_img_url, String weixin_share_title, String weixin_share_url, List<String> weixin_share_pic_urls, String qzone_share_url, int total_daka_days, List<UserDakaDate> daka_dates, List<UserDakaSpecialDay> special_days) {
        this();
        this.weibo_share_txt = weibo_share_txt;
        this.weibo_share_img_url = weibo_share_img_url;
        this.weixin_share_title = weixin_share_title;
        this.weixin_share_url = weixin_share_url;
        this.weixin_share_pic_urls = weixin_share_pic_urls;
        this.qzone_share_url = qzone_share_url;
        this.total_daka_days = total_daka_days;
        setTotal_daka_daysIsSet(true);
        this.daka_dates = daka_dates;
        this.special_days = special_days;
    }

    public UserDakaShareInfo(UserDakaShareInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.XHS_SHARE_TITLE, _Fields.XHS_SHARE_CONTENT, _Fields.TOTAL_WORDS};
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetWeibo_share_txt()) {
            this.weibo_share_txt = other.weibo_share_txt;
        }
        if (other.isSetWeibo_share_img_url()) {
            this.weibo_share_img_url = other.weibo_share_img_url;
        }
        if (other.isSetWeixin_share_title()) {
            this.weixin_share_title = other.weixin_share_title;
        }
        if (other.isSetWeixin_share_url()) {
            this.weixin_share_url = other.weixin_share_url;
        }
        if (other.isSetWeixin_share_pic_urls()) {
            this.weixin_share_pic_urls = new ArrayList(other.weixin_share_pic_urls);
        }
        if (other.isSetQzone_share_url()) {
            this.qzone_share_url = other.qzone_share_url;
        }
        this.total_daka_days = other.total_daka_days;
        if (other.isSetDaka_dates()) {
            ArrayList arrayList = new ArrayList(other.daka_dates.size());
            Iterator<UserDakaDate> it = other.daka_dates.iterator();
            while (it.hasNext()) {
                arrayList.add(new UserDakaDate(it.next()));
            }
            this.daka_dates = arrayList;
        }
        if (other.isSetSpecial_days()) {
            ArrayList arrayList2 = new ArrayList(other.special_days.size());
            Iterator<UserDakaSpecialDay> it2 = other.special_days.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new UserDakaSpecialDay(it2.next()));
            }
            this.special_days = arrayList2;
        }
        if (other.isSetXhs_share_title()) {
            this.xhs_share_title = other.xhs_share_title;
        }
        if (other.isSetXhs_share_content()) {
            this.xhs_share_content = other.xhs_share_content;
        }
        this.total_words = other.total_words;
    }
}
