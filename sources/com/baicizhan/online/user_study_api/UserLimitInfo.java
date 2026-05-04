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
public class UserLimitInfo implements TBase<UserLimitInfo, _Fields>, Serializable, Cloneable, Comparable<UserLimitInfo> {
    private static final int __CHN_MODE_ISSET_ID = 5;
    private static final int __CHN_STYLE_ISSET_ID = 20;
    private static final int __COLLECT_WORDS_UPDATED_AT_ISSET_ID = 12;
    private static final int __CUR_BOOK_HAS_PRIMARY_SCHOOL_MODE_ISSET_ID = 15;
    private static final int __DIFFICULTY_UPDATED_AT_ISSET_ID = 6;
    private static final int __EXAM_FLAG_ISSET_ID = 14;
    private static final int __FIRST_DAY_TEST_GROUP_ISSET_ID = 16;
    private static final int __HAS_WORD_FRIENDS_ISSET_ID = 1;
    private static final int __LISTENING_MODE_ISSET_ID = 3;
    private static final int __MIDDLE_SCHOOL_TEST_CODE_ISSET_ID = 18;
    private static final int __NEW_WIKI_ISSET_ID = 19;
    private static final int __QUESTION_BOOK_CFG_ISSET_ID = 4;
    private static final int __RHYME_MODE_ISSET_ID = 22;
    private static final int __ROADMAP_VERSION_ISSET_ID = 7;
    private static final int __SHOW_DEVICE_ISSET_ID = 21;
    private static final int __SHOW_HORIZONTAL_ISSET_ID = 10;
    private static final int __SHOW_NIGHT_ISSET_ID = 11;
    private static final int __SHOW_SENTENCE_TRANS_ISSET_ID = 0;
    private static final int __SPELL_MODE_ISSET_ID = 2;
    private static final int __UPDATE_AT_OF_BOOK_INFO_ISSET_ID = 8;
    private static final int __UPDATE_AT_OF_NOTIFY_INFO_ISSET_ID = 9;
    private static final int __WORD_NOTE_ENABLE_ISSET_ID = 17;
    private static final int __WORD_NOTE_UPDATED_AT_ISSET_ID = 13;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private int __isset_bitfield;
    public int chn_mode;
    public int chn_style;
    public long collect_words_updated_at;
    public int cur_book_has_primary_school_mode;
    public int difficulty_updated_at;
    public DualMode dual_mode;
    public int exam_flag;
    public int first_day_test_group;
    public int has_word_friends;
    public int listening_mode;
    public int middle_school_test_code;
    public int new_wiki;
    private _Fields[] optionals;
    public PangolinAD pangolin_ad;
    public int question_book_cfg;
    public int rhyme_mode;
    public long roadmap_version;
    public int show_device;
    public int show_horizontal;
    public int show_night;
    public int show_sentence_trans;
    public int spell_mode;
    public long update_at_of_book_info;
    public long update_at_of_notify_info;
    public List<WikiComponent> wiki_component_cfg;
    public int word_note_enable;
    public long word_note_updated_at;
    private static final TStruct STRUCT_DESC = new TStruct("UserLimitInfo");
    private static final TField SHOW_SENTENCE_TRANS_FIELD_DESC = new TField("show_sentence_trans", (byte) 8, 1);
    private static final TField HAS_WORD_FRIENDS_FIELD_DESC = new TField("has_word_friends", (byte) 8, 2);
    private static final TField SPELL_MODE_FIELD_DESC = new TField("spell_mode", (byte) 8, 3);
    private static final TField LISTENING_MODE_FIELD_DESC = new TField("listening_mode", (byte) 8, 4);
    private static final TField QUESTION_BOOK_CFG_FIELD_DESC = new TField("question_book_cfg", (byte) 8, 5);
    private static final TField CHN_MODE_FIELD_DESC = new TField("chn_mode", (byte) 8, 6);
    private static final TField DIFFICULTY_UPDATED_AT_FIELD_DESC = new TField("difficulty_updated_at", (byte) 8, 7);
    private static final TField ROADMAP_VERSION_FIELD_DESC = new TField("roadmap_version", (byte) 10, 8);
    private static final TField UPDATE_AT_OF_BOOK_INFO_FIELD_DESC = new TField("update_at_of_book_info", (byte) 10, 9);
    private static final TField UPDATE_AT_OF_NOTIFY_INFO_FIELD_DESC = new TField("update_at_of_notify_info", (byte) 10, 10);
    private static final TField SHOW_HORIZONTAL_FIELD_DESC = new TField("show_horizontal", (byte) 8, 11);
    private static final TField SHOW_NIGHT_FIELD_DESC = new TField("show_night", (byte) 8, 12);
    private static final TField COLLECT_WORDS_UPDATED_AT_FIELD_DESC = new TField("collect_words_updated_at", (byte) 10, 13);
    private static final TField WORD_NOTE_UPDATED_AT_FIELD_DESC = new TField("word_note_updated_at", (byte) 10, 14);
    private static final TField EXAM_FLAG_FIELD_DESC = new TField("exam_flag", (byte) 8, 15);
    private static final TField CUR_BOOK_HAS_PRIMARY_SCHOOL_MODE_FIELD_DESC = new TField("cur_book_has_primary_school_mode", (byte) 8, 16);
    private static final TField FIRST_DAY_TEST_GROUP_FIELD_DESC = new TField("first_day_test_group", (byte) 8, 17);
    private static final TField WORD_NOTE_ENABLE_FIELD_DESC = new TField("word_note_enable", (byte) 8, 18);
    private static final TField WIKI_COMPONENT_CFG_FIELD_DESC = new TField("wiki_component_cfg", (byte) 15, 19);
    private static final TField MIDDLE_SCHOOL_TEST_CODE_FIELD_DESC = new TField("middle_school_test_code", (byte) 8, 20);
    private static final TField NEW_WIKI_FIELD_DESC = new TField("new_wiki", (byte) 8, 21);
    private static final TField CHN_STYLE_FIELD_DESC = new TField("chn_style", (byte) 8, 22);
    private static final TField SHOW_DEVICE_FIELD_DESC = new TField("show_device", (byte) 8, 23);
    private static final TField DUAL_MODE_FIELD_DESC = new TField("dual_mode", (byte) 12, 24);
    private static final TField RHYME_MODE_FIELD_DESC = new TField("rhyme_mode", (byte) 8, 25);
    private static final TField PANGOLIN_AD_FIELD_DESC = new TField("pangolin_ad", (byte) 12, 26);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.UserLimitInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfo$_Fields = iArr;
            try {
                iArr[_Fields.SHOW_SENTENCE_TRANS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfo$_Fields[_Fields.HAS_WORD_FRIENDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfo$_Fields[_Fields.SPELL_MODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfo$_Fields[_Fields.LISTENING_MODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfo$_Fields[_Fields.QUESTION_BOOK_CFG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfo$_Fields[_Fields.CHN_MODE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfo$_Fields[_Fields.DIFFICULTY_UPDATED_AT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfo$_Fields[_Fields.ROADMAP_VERSION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfo$_Fields[_Fields.UPDATE_AT_OF_BOOK_INFO.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfo$_Fields[_Fields.UPDATE_AT_OF_NOTIFY_INFO.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfo$_Fields[_Fields.SHOW_HORIZONTAL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfo$_Fields[_Fields.SHOW_NIGHT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfo$_Fields[_Fields.COLLECT_WORDS_UPDATED_AT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfo$_Fields[_Fields.WORD_NOTE_UPDATED_AT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfo$_Fields[_Fields.EXAM_FLAG.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfo$_Fields[_Fields.CUR_BOOK_HAS_PRIMARY_SCHOOL_MODE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfo$_Fields[_Fields.FIRST_DAY_TEST_GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfo$_Fields[_Fields.WORD_NOTE_ENABLE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfo$_Fields[_Fields.WIKI_COMPONENT_CFG.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfo$_Fields[_Fields.MIDDLE_SCHOOL_TEST_CODE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfo$_Fields[_Fields.NEW_WIKI.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfo$_Fields[_Fields.CHN_STYLE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfo$_Fields[_Fields.SHOW_DEVICE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfo$_Fields[_Fields.DUAL_MODE.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfo$_Fields[_Fields.RHYME_MODE.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfo$_Fields[_Fields.PANGOLIN_AD.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserLimitInfoStandardScheme extends StandardScheme<UserLimitInfo> {
        private UserLimitInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserLimitInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetShow_sentence_trans()) {
                        throw new TProtocolException("Required field 'show_sentence_trans' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetHas_word_friends()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'has_word_friends' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 == 8) {
                            struct.show_sentence_trans = iprot.readI32();
                            struct.setShow_sentence_transIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 2:
                        if (b11 == 8) {
                            struct.has_word_friends = iprot.readI32();
                            struct.setHas_word_friendsIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 3:
                        if (b11 == 8) {
                            struct.spell_mode = iprot.readI32();
                            struct.setSpell_modeIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 4:
                        if (b11 == 8) {
                            struct.listening_mode = iprot.readI32();
                            struct.setListening_modeIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 5:
                        if (b11 == 8) {
                            struct.question_book_cfg = iprot.readI32();
                            struct.setQuestion_book_cfgIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 6:
                        if (b11 == 8) {
                            struct.chn_mode = iprot.readI32();
                            struct.setChn_modeIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 7:
                        if (b11 == 8) {
                            struct.difficulty_updated_at = iprot.readI32();
                            struct.setDifficulty_updated_atIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 8:
                        if (b11 == 10) {
                            struct.roadmap_version = iprot.readI64();
                            struct.setRoadmap_versionIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 9:
                        if (b11 == 10) {
                            struct.update_at_of_book_info = iprot.readI64();
                            struct.setUpdate_at_of_book_infoIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 10:
                        if (b11 == 10) {
                            struct.update_at_of_notify_info = iprot.readI64();
                            struct.setUpdate_at_of_notify_infoIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 11:
                        if (b11 == 8) {
                            struct.show_horizontal = iprot.readI32();
                            struct.setShow_horizontalIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 12:
                        if (b11 == 8) {
                            struct.show_night = iprot.readI32();
                            struct.setShow_nightIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 13:
                        if (b11 == 10) {
                            struct.collect_words_updated_at = iprot.readI64();
                            struct.setCollect_words_updated_atIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 14:
                        if (b11 == 10) {
                            struct.word_note_updated_at = iprot.readI64();
                            struct.setWord_note_updated_atIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 15:
                        if (b11 == 8) {
                            struct.exam_flag = iprot.readI32();
                            struct.setExam_flagIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 16:
                        if (b11 == 8) {
                            struct.cur_book_has_primary_school_mode = iprot.readI32();
                            struct.setCur_book_has_primary_school_modeIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 17:
                        if (b11 == 8) {
                            struct.first_day_test_group = iprot.readI32();
                            struct.setFirst_day_test_groupIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 18:
                        if (b11 == 8) {
                            struct.word_note_enable = iprot.readI32();
                            struct.setWord_note_enableIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 19:
                        if (b11 == 15) {
                            TList readListBegin = iprot.readListBegin();
                            struct.wiki_component_cfg = new ArrayList(readListBegin.size);
                            for (int i11 = 0; i11 < readListBegin.size; i11++) {
                                WikiComponent wikiComponent = new WikiComponent();
                                wikiComponent.read(iprot);
                                struct.wiki_component_cfg.add(wikiComponent);
                            }
                            iprot.readListEnd();
                            struct.setWiki_component_cfgIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 20:
                        if (b11 == 8) {
                            struct.middle_school_test_code = iprot.readI32();
                            struct.setMiddle_school_test_codeIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 21:
                        if (b11 == 8) {
                            struct.new_wiki = iprot.readI32();
                            struct.setNew_wikiIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 22:
                        if (b11 == 8) {
                            struct.chn_style = iprot.readI32();
                            struct.setChn_styleIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 23:
                        if (b11 == 8) {
                            struct.show_device = iprot.readI32();
                            struct.setShow_deviceIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 24:
                        if (b11 == 12) {
                            DualMode dualMode = new DualMode();
                            struct.dual_mode = dualMode;
                            dualMode.read(iprot);
                            struct.setDual_modeIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 25:
                        if (b11 == 8) {
                            struct.rhyme_mode = iprot.readI32();
                            struct.setRhyme_modeIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 26:
                        if (b11 == 12) {
                            PangolinAD pangolinAD = new PangolinAD();
                            struct.pangolin_ad = pangolinAD;
                            pangolinAD.read(iprot);
                            struct.setPangolin_adIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
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
        public void write(TProtocol oprot, UserLimitInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserLimitInfo.STRUCT_DESC);
            oprot.writeFieldBegin(UserLimitInfo.SHOW_SENTENCE_TRANS_FIELD_DESC);
            oprot.writeI32(struct.show_sentence_trans);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserLimitInfo.HAS_WORD_FRIENDS_FIELD_DESC);
            oprot.writeI32(struct.has_word_friends);
            oprot.writeFieldEnd();
            if (struct.isSetSpell_mode()) {
                oprot.writeFieldBegin(UserLimitInfo.SPELL_MODE_FIELD_DESC);
                oprot.writeI32(struct.spell_mode);
                oprot.writeFieldEnd();
            }
            if (struct.isSetListening_mode()) {
                oprot.writeFieldBegin(UserLimitInfo.LISTENING_MODE_FIELD_DESC);
                oprot.writeI32(struct.listening_mode);
                oprot.writeFieldEnd();
            }
            if (struct.isSetQuestion_book_cfg()) {
                oprot.writeFieldBegin(UserLimitInfo.QUESTION_BOOK_CFG_FIELD_DESC);
                oprot.writeI32(struct.question_book_cfg);
                oprot.writeFieldEnd();
            }
            if (struct.isSetChn_mode()) {
                oprot.writeFieldBegin(UserLimitInfo.CHN_MODE_FIELD_DESC);
                oprot.writeI32(struct.chn_mode);
                oprot.writeFieldEnd();
            }
            if (struct.isSetDifficulty_updated_at()) {
                oprot.writeFieldBegin(UserLimitInfo.DIFFICULTY_UPDATED_AT_FIELD_DESC);
                oprot.writeI32(struct.difficulty_updated_at);
                oprot.writeFieldEnd();
            }
            if (struct.isSetRoadmap_version()) {
                oprot.writeFieldBegin(UserLimitInfo.ROADMAP_VERSION_FIELD_DESC);
                oprot.writeI64(struct.roadmap_version);
                oprot.writeFieldEnd();
            }
            if (struct.isSetUpdate_at_of_book_info()) {
                oprot.writeFieldBegin(UserLimitInfo.UPDATE_AT_OF_BOOK_INFO_FIELD_DESC);
                oprot.writeI64(struct.update_at_of_book_info);
                oprot.writeFieldEnd();
            }
            if (struct.isSetUpdate_at_of_notify_info()) {
                oprot.writeFieldBegin(UserLimitInfo.UPDATE_AT_OF_NOTIFY_INFO_FIELD_DESC);
                oprot.writeI64(struct.update_at_of_notify_info);
                oprot.writeFieldEnd();
            }
            if (struct.isSetShow_horizontal()) {
                oprot.writeFieldBegin(UserLimitInfo.SHOW_HORIZONTAL_FIELD_DESC);
                oprot.writeI32(struct.show_horizontal);
                oprot.writeFieldEnd();
            }
            if (struct.isSetShow_night()) {
                oprot.writeFieldBegin(UserLimitInfo.SHOW_NIGHT_FIELD_DESC);
                oprot.writeI32(struct.show_night);
                oprot.writeFieldEnd();
            }
            if (struct.isSetCollect_words_updated_at()) {
                oprot.writeFieldBegin(UserLimitInfo.COLLECT_WORDS_UPDATED_AT_FIELD_DESC);
                oprot.writeI64(struct.collect_words_updated_at);
                oprot.writeFieldEnd();
            }
            if (struct.isSetWord_note_updated_at()) {
                oprot.writeFieldBegin(UserLimitInfo.WORD_NOTE_UPDATED_AT_FIELD_DESC);
                oprot.writeI64(struct.word_note_updated_at);
                oprot.writeFieldEnd();
            }
            if (struct.isSetExam_flag()) {
                oprot.writeFieldBegin(UserLimitInfo.EXAM_FLAG_FIELD_DESC);
                oprot.writeI32(struct.exam_flag);
                oprot.writeFieldEnd();
            }
            if (struct.isSetCur_book_has_primary_school_mode()) {
                oprot.writeFieldBegin(UserLimitInfo.CUR_BOOK_HAS_PRIMARY_SCHOOL_MODE_FIELD_DESC);
                oprot.writeI32(struct.cur_book_has_primary_school_mode);
                oprot.writeFieldEnd();
            }
            if (struct.isSetFirst_day_test_group()) {
                oprot.writeFieldBegin(UserLimitInfo.FIRST_DAY_TEST_GROUP_FIELD_DESC);
                oprot.writeI32(struct.first_day_test_group);
                oprot.writeFieldEnd();
            }
            if (struct.isSetWord_note_enable()) {
                oprot.writeFieldBegin(UserLimitInfo.WORD_NOTE_ENABLE_FIELD_DESC);
                oprot.writeI32(struct.word_note_enable);
                oprot.writeFieldEnd();
            }
            if (struct.wiki_component_cfg != null && struct.isSetWiki_component_cfg()) {
                oprot.writeFieldBegin(UserLimitInfo.WIKI_COMPONENT_CFG_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.wiki_component_cfg.size()));
                Iterator<WikiComponent> it = struct.wiki_component_cfg.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.isSetMiddle_school_test_code()) {
                oprot.writeFieldBegin(UserLimitInfo.MIDDLE_SCHOOL_TEST_CODE_FIELD_DESC);
                oprot.writeI32(struct.middle_school_test_code);
                oprot.writeFieldEnd();
            }
            if (struct.isSetNew_wiki()) {
                oprot.writeFieldBegin(UserLimitInfo.NEW_WIKI_FIELD_DESC);
                oprot.writeI32(struct.new_wiki);
                oprot.writeFieldEnd();
            }
            if (struct.isSetChn_style()) {
                oprot.writeFieldBegin(UserLimitInfo.CHN_STYLE_FIELD_DESC);
                oprot.writeI32(struct.chn_style);
                oprot.writeFieldEnd();
            }
            if (struct.isSetShow_device()) {
                oprot.writeFieldBegin(UserLimitInfo.SHOW_DEVICE_FIELD_DESC);
                oprot.writeI32(struct.show_device);
                oprot.writeFieldEnd();
            }
            if (struct.dual_mode != null && struct.isSetDual_mode()) {
                oprot.writeFieldBegin(UserLimitInfo.DUAL_MODE_FIELD_DESC);
                struct.dual_mode.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.isSetRhyme_mode()) {
                oprot.writeFieldBegin(UserLimitInfo.RHYME_MODE_FIELD_DESC);
                oprot.writeI32(struct.rhyme_mode);
                oprot.writeFieldEnd();
            }
            if (struct.pangolin_ad != null && struct.isSetPangolin_ad()) {
                oprot.writeFieldBegin(UserLimitInfo.PANGOLIN_AD_FIELD_DESC);
                struct.pangolin_ad.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserLimitInfoStandardSchemeFactory implements SchemeFactory {
        private UserLimitInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserLimitInfoStandardScheme getScheme() {
            return new UserLimitInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserLimitInfoTupleScheme extends TupleScheme<UserLimitInfo> {
        private UserLimitInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserLimitInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.show_sentence_trans = tTupleProtocol.readI32();
            struct.setShow_sentence_transIsSet(true);
            struct.has_word_friends = tTupleProtocol.readI32();
            struct.setHas_word_friendsIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(24);
            if (readBitSet.get(0)) {
                struct.spell_mode = tTupleProtocol.readI32();
                struct.setSpell_modeIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.listening_mode = tTupleProtocol.readI32();
                struct.setListening_modeIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.question_book_cfg = tTupleProtocol.readI32();
                struct.setQuestion_book_cfgIsSet(true);
            }
            if (readBitSet.get(3)) {
                struct.chn_mode = tTupleProtocol.readI32();
                struct.setChn_modeIsSet(true);
            }
            if (readBitSet.get(4)) {
                struct.difficulty_updated_at = tTupleProtocol.readI32();
                struct.setDifficulty_updated_atIsSet(true);
            }
            if (readBitSet.get(5)) {
                struct.roadmap_version = tTupleProtocol.readI64();
                struct.setRoadmap_versionIsSet(true);
            }
            if (readBitSet.get(6)) {
                struct.update_at_of_book_info = tTupleProtocol.readI64();
                struct.setUpdate_at_of_book_infoIsSet(true);
            }
            if (readBitSet.get(7)) {
                struct.update_at_of_notify_info = tTupleProtocol.readI64();
                struct.setUpdate_at_of_notify_infoIsSet(true);
            }
            if (readBitSet.get(8)) {
                struct.show_horizontal = tTupleProtocol.readI32();
                struct.setShow_horizontalIsSet(true);
            }
            if (readBitSet.get(9)) {
                struct.show_night = tTupleProtocol.readI32();
                struct.setShow_nightIsSet(true);
            }
            if (readBitSet.get(10)) {
                struct.collect_words_updated_at = tTupleProtocol.readI64();
                struct.setCollect_words_updated_atIsSet(true);
            }
            if (readBitSet.get(11)) {
                struct.word_note_updated_at = tTupleProtocol.readI64();
                struct.setWord_note_updated_atIsSet(true);
            }
            if (readBitSet.get(12)) {
                struct.exam_flag = tTupleProtocol.readI32();
                struct.setExam_flagIsSet(true);
            }
            if (readBitSet.get(13)) {
                struct.cur_book_has_primary_school_mode = tTupleProtocol.readI32();
                struct.setCur_book_has_primary_school_modeIsSet(true);
            }
            if (readBitSet.get(14)) {
                struct.first_day_test_group = tTupleProtocol.readI32();
                struct.setFirst_day_test_groupIsSet(true);
            }
            if (readBitSet.get(15)) {
                struct.word_note_enable = tTupleProtocol.readI32();
                struct.setWord_note_enableIsSet(true);
            }
            if (readBitSet.get(16)) {
                TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                struct.wiki_component_cfg = new ArrayList(tList.size);
                for (int i11 = 0; i11 < tList.size; i11++) {
                    WikiComponent wikiComponent = new WikiComponent();
                    wikiComponent.read(tTupleProtocol);
                    struct.wiki_component_cfg.add(wikiComponent);
                }
                struct.setWiki_component_cfgIsSet(true);
            }
            if (readBitSet.get(17)) {
                struct.middle_school_test_code = tTupleProtocol.readI32();
                struct.setMiddle_school_test_codeIsSet(true);
            }
            if (readBitSet.get(18)) {
                struct.new_wiki = tTupleProtocol.readI32();
                struct.setNew_wikiIsSet(true);
            }
            if (readBitSet.get(19)) {
                struct.chn_style = tTupleProtocol.readI32();
                struct.setChn_styleIsSet(true);
            }
            if (readBitSet.get(20)) {
                struct.show_device = tTupleProtocol.readI32();
                struct.setShow_deviceIsSet(true);
            }
            if (readBitSet.get(21)) {
                DualMode dualMode = new DualMode();
                struct.dual_mode = dualMode;
                dualMode.read(tTupleProtocol);
                struct.setDual_modeIsSet(true);
            }
            if (readBitSet.get(22)) {
                struct.rhyme_mode = tTupleProtocol.readI32();
                struct.setRhyme_modeIsSet(true);
            }
            if (readBitSet.get(23)) {
                PangolinAD pangolinAD = new PangolinAD();
                struct.pangolin_ad = pangolinAD;
                pangolinAD.read(tTupleProtocol);
                struct.setPangolin_adIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserLimitInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.show_sentence_trans);
            tTupleProtocol.writeI32(struct.has_word_friends);
            BitSet bitSet = new BitSet();
            if (struct.isSetSpell_mode()) {
                bitSet.set(0);
            }
            if (struct.isSetListening_mode()) {
                bitSet.set(1);
            }
            if (struct.isSetQuestion_book_cfg()) {
                bitSet.set(2);
            }
            if (struct.isSetChn_mode()) {
                bitSet.set(3);
            }
            if (struct.isSetDifficulty_updated_at()) {
                bitSet.set(4);
            }
            if (struct.isSetRoadmap_version()) {
                bitSet.set(5);
            }
            if (struct.isSetUpdate_at_of_book_info()) {
                bitSet.set(6);
            }
            if (struct.isSetUpdate_at_of_notify_info()) {
                bitSet.set(7);
            }
            if (struct.isSetShow_horizontal()) {
                bitSet.set(8);
            }
            if (struct.isSetShow_night()) {
                bitSet.set(9);
            }
            if (struct.isSetCollect_words_updated_at()) {
                bitSet.set(10);
            }
            if (struct.isSetWord_note_updated_at()) {
                bitSet.set(11);
            }
            if (struct.isSetExam_flag()) {
                bitSet.set(12);
            }
            if (struct.isSetCur_book_has_primary_school_mode()) {
                bitSet.set(13);
            }
            if (struct.isSetFirst_day_test_group()) {
                bitSet.set(14);
            }
            if (struct.isSetWord_note_enable()) {
                bitSet.set(15);
            }
            if (struct.isSetWiki_component_cfg()) {
                bitSet.set(16);
            }
            if (struct.isSetMiddle_school_test_code()) {
                bitSet.set(17);
            }
            if (struct.isSetNew_wiki()) {
                bitSet.set(18);
            }
            if (struct.isSetChn_style()) {
                bitSet.set(19);
            }
            if (struct.isSetShow_device()) {
                bitSet.set(20);
            }
            if (struct.isSetDual_mode()) {
                bitSet.set(21);
            }
            if (struct.isSetRhyme_mode()) {
                bitSet.set(22);
            }
            if (struct.isSetPangolin_ad()) {
                bitSet.set(23);
            }
            tTupleProtocol.writeBitSet(bitSet, 24);
            if (struct.isSetSpell_mode()) {
                tTupleProtocol.writeI32(struct.spell_mode);
            }
            if (struct.isSetListening_mode()) {
                tTupleProtocol.writeI32(struct.listening_mode);
            }
            if (struct.isSetQuestion_book_cfg()) {
                tTupleProtocol.writeI32(struct.question_book_cfg);
            }
            if (struct.isSetChn_mode()) {
                tTupleProtocol.writeI32(struct.chn_mode);
            }
            if (struct.isSetDifficulty_updated_at()) {
                tTupleProtocol.writeI32(struct.difficulty_updated_at);
            }
            if (struct.isSetRoadmap_version()) {
                tTupleProtocol.writeI64(struct.roadmap_version);
            }
            if (struct.isSetUpdate_at_of_book_info()) {
                tTupleProtocol.writeI64(struct.update_at_of_book_info);
            }
            if (struct.isSetUpdate_at_of_notify_info()) {
                tTupleProtocol.writeI64(struct.update_at_of_notify_info);
            }
            if (struct.isSetShow_horizontal()) {
                tTupleProtocol.writeI32(struct.show_horizontal);
            }
            if (struct.isSetShow_night()) {
                tTupleProtocol.writeI32(struct.show_night);
            }
            if (struct.isSetCollect_words_updated_at()) {
                tTupleProtocol.writeI64(struct.collect_words_updated_at);
            }
            if (struct.isSetWord_note_updated_at()) {
                tTupleProtocol.writeI64(struct.word_note_updated_at);
            }
            if (struct.isSetExam_flag()) {
                tTupleProtocol.writeI32(struct.exam_flag);
            }
            if (struct.isSetCur_book_has_primary_school_mode()) {
                tTupleProtocol.writeI32(struct.cur_book_has_primary_school_mode);
            }
            if (struct.isSetFirst_day_test_group()) {
                tTupleProtocol.writeI32(struct.first_day_test_group);
            }
            if (struct.isSetWord_note_enable()) {
                tTupleProtocol.writeI32(struct.word_note_enable);
            }
            if (struct.isSetWiki_component_cfg()) {
                tTupleProtocol.writeI32(struct.wiki_component_cfg.size());
                Iterator<WikiComponent> it = struct.wiki_component_cfg.iterator();
                while (it.hasNext()) {
                    it.next().write(tTupleProtocol);
                }
            }
            if (struct.isSetMiddle_school_test_code()) {
                tTupleProtocol.writeI32(struct.middle_school_test_code);
            }
            if (struct.isSetNew_wiki()) {
                tTupleProtocol.writeI32(struct.new_wiki);
            }
            if (struct.isSetChn_style()) {
                tTupleProtocol.writeI32(struct.chn_style);
            }
            if (struct.isSetShow_device()) {
                tTupleProtocol.writeI32(struct.show_device);
            }
            if (struct.isSetDual_mode()) {
                struct.dual_mode.write(tTupleProtocol);
            }
            if (struct.isSetRhyme_mode()) {
                tTupleProtocol.writeI32(struct.rhyme_mode);
            }
            if (struct.isSetPangolin_ad()) {
                struct.pangolin_ad.write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserLimitInfoTupleSchemeFactory implements SchemeFactory {
        private UserLimitInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserLimitInfoTupleScheme getScheme() {
            return new UserLimitInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        SHOW_SENTENCE_TRANS(1, "show_sentence_trans"),
        HAS_WORD_FRIENDS(2, "has_word_friends"),
        SPELL_MODE(3, "spell_mode"),
        LISTENING_MODE(4, "listening_mode"),
        QUESTION_BOOK_CFG(5, "question_book_cfg"),
        CHN_MODE(6, "chn_mode"),
        DIFFICULTY_UPDATED_AT(7, "difficulty_updated_at"),
        ROADMAP_VERSION(8, "roadmap_version"),
        UPDATE_AT_OF_BOOK_INFO(9, "update_at_of_book_info"),
        UPDATE_AT_OF_NOTIFY_INFO(10, "update_at_of_notify_info"),
        SHOW_HORIZONTAL(11, "show_horizontal"),
        SHOW_NIGHT(12, "show_night"),
        COLLECT_WORDS_UPDATED_AT(13, "collect_words_updated_at"),
        WORD_NOTE_UPDATED_AT(14, "word_note_updated_at"),
        EXAM_FLAG(15, "exam_flag"),
        CUR_BOOK_HAS_PRIMARY_SCHOOL_MODE(16, "cur_book_has_primary_school_mode"),
        FIRST_DAY_TEST_GROUP(17, "first_day_test_group"),
        WORD_NOTE_ENABLE(18, "word_note_enable"),
        WIKI_COMPONENT_CFG(19, "wiki_component_cfg"),
        MIDDLE_SCHOOL_TEST_CODE(20, "middle_school_test_code"),
        NEW_WIKI(21, "new_wiki"),
        CHN_STYLE(22, "chn_style"),
        SHOW_DEVICE(23, "show_device"),
        DUAL_MODE(24, "dual_mode"),
        RHYME_MODE(25, "rhyme_mode"),
        PANGOLIN_AD(26, "pangolin_ad");

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
                    return SHOW_SENTENCE_TRANS;
                case 2:
                    return HAS_WORD_FRIENDS;
                case 3:
                    return SPELL_MODE;
                case 4:
                    return LISTENING_MODE;
                case 5:
                    return QUESTION_BOOK_CFG;
                case 6:
                    return CHN_MODE;
                case 7:
                    return DIFFICULTY_UPDATED_AT;
                case 8:
                    return ROADMAP_VERSION;
                case 9:
                    return UPDATE_AT_OF_BOOK_INFO;
                case 10:
                    return UPDATE_AT_OF_NOTIFY_INFO;
                case 11:
                    return SHOW_HORIZONTAL;
                case 12:
                    return SHOW_NIGHT;
                case 13:
                    return COLLECT_WORDS_UPDATED_AT;
                case 14:
                    return WORD_NOTE_UPDATED_AT;
                case 15:
                    return EXAM_FLAG;
                case 16:
                    return CUR_BOOK_HAS_PRIMARY_SCHOOL_MODE;
                case 17:
                    return FIRST_DAY_TEST_GROUP;
                case 18:
                    return WORD_NOTE_ENABLE;
                case 19:
                    return WIKI_COMPONENT_CFG;
                case 20:
                    return MIDDLE_SCHOOL_TEST_CODE;
                case 21:
                    return NEW_WIKI;
                case 22:
                    return CHN_STYLE;
                case 23:
                    return SHOW_DEVICE;
                case 24:
                    return DUAL_MODE;
                case 25:
                    return RHYME_MODE;
                case 26:
                    return PANGOLIN_AD;
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
        hashMap.put(StandardScheme.class, new UserLimitInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserLimitInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.SHOW_SENTENCE_TRANS, (_Fields) new FieldMetaData("show_sentence_trans", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.HAS_WORD_FRIENDS, (_Fields) new FieldMetaData("has_word_friends", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.SPELL_MODE, (_Fields) new FieldMetaData("spell_mode", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.LISTENING_MODE, (_Fields) new FieldMetaData("listening_mode", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.QUESTION_BOOK_CFG, (_Fields) new FieldMetaData("question_book_cfg", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.CHN_MODE, (_Fields) new FieldMetaData("chn_mode", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.DIFFICULTY_UPDATED_AT, (_Fields) new FieldMetaData("difficulty_updated_at", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.ROADMAP_VERSION, (_Fields) new FieldMetaData("roadmap_version", (byte) 2, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.UPDATE_AT_OF_BOOK_INFO, (_Fields) new FieldMetaData("update_at_of_book_info", (byte) 2, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.UPDATE_AT_OF_NOTIFY_INFO, (_Fields) new FieldMetaData("update_at_of_notify_info", (byte) 2, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.SHOW_HORIZONTAL, (_Fields) new FieldMetaData("show_horizontal", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.SHOW_NIGHT, (_Fields) new FieldMetaData("show_night", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.COLLECT_WORDS_UPDATED_AT, (_Fields) new FieldMetaData("collect_words_updated_at", (byte) 2, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.WORD_NOTE_UPDATED_AT, (_Fields) new FieldMetaData("word_note_updated_at", (byte) 2, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.EXAM_FLAG, (_Fields) new FieldMetaData("exam_flag", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.CUR_BOOK_HAS_PRIMARY_SCHOOL_MODE, (_Fields) new FieldMetaData("cur_book_has_primary_school_mode", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.FIRST_DAY_TEST_GROUP, (_Fields) new FieldMetaData("first_day_test_group", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.WORD_NOTE_ENABLE, (_Fields) new FieldMetaData("word_note_enable", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.WIKI_COMPONENT_CFG, (_Fields) new FieldMetaData("wiki_component_cfg", (byte) 2, new ListMetaData((byte) 15, new StructMetaData((byte) 12, WikiComponent.class))));
        enumMap.put((EnumMap) _Fields.MIDDLE_SCHOOL_TEST_CODE, (_Fields) new FieldMetaData("middle_school_test_code", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.NEW_WIKI, (_Fields) new FieldMetaData("new_wiki", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.CHN_STYLE, (_Fields) new FieldMetaData("chn_style", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.SHOW_DEVICE, (_Fields) new FieldMetaData("show_device", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.DUAL_MODE, (_Fields) new FieldMetaData("dual_mode", (byte) 2, new StructMetaData((byte) 12, DualMode.class)));
        enumMap.put((EnumMap) _Fields.RHYME_MODE, (_Fields) new FieldMetaData("rhyme_mode", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.PANGOLIN_AD, (_Fields) new FieldMetaData("pangolin_ad", (byte) 2, new StructMetaData((byte) 12, PangolinAD.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserLimitInfo.class, unmodifiableMap);
    }

    public UserLimitInfo() {
        this.__isset_bitfield = 0;
        this.optionals = new _Fields[]{_Fields.SPELL_MODE, _Fields.LISTENING_MODE, _Fields.QUESTION_BOOK_CFG, _Fields.CHN_MODE, _Fields.DIFFICULTY_UPDATED_AT, _Fields.ROADMAP_VERSION, _Fields.UPDATE_AT_OF_BOOK_INFO, _Fields.UPDATE_AT_OF_NOTIFY_INFO, _Fields.SHOW_HORIZONTAL, _Fields.SHOW_NIGHT, _Fields.COLLECT_WORDS_UPDATED_AT, _Fields.WORD_NOTE_UPDATED_AT, _Fields.EXAM_FLAG, _Fields.CUR_BOOK_HAS_PRIMARY_SCHOOL_MODE, _Fields.FIRST_DAY_TEST_GROUP, _Fields.WORD_NOTE_ENABLE, _Fields.WIKI_COMPONENT_CFG, _Fields.MIDDLE_SCHOOL_TEST_CODE, _Fields.NEW_WIKI, _Fields.CHN_STYLE, _Fields.SHOW_DEVICE, _Fields.DUAL_MODE, _Fields.RHYME_MODE, _Fields.PANGOLIN_AD};
        this.question_book_cfg = 0;
    }

    private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
        try {
            this.__isset_bitfield = 0;
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

    public void addToWiki_component_cfg(WikiComponent elem) {
        if (this.wiki_component_cfg == null) {
            this.wiki_component_cfg = new ArrayList();
        }
        this.wiki_component_cfg.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        setShow_sentence_transIsSet(false);
        this.show_sentence_trans = 0;
        setHas_word_friendsIsSet(false);
        this.has_word_friends = 0;
        setSpell_modeIsSet(false);
        this.spell_mode = 0;
        setListening_modeIsSet(false);
        this.listening_mode = 0;
        this.question_book_cfg = 0;
        setChn_modeIsSet(false);
        this.chn_mode = 0;
        setDifficulty_updated_atIsSet(false);
        this.difficulty_updated_at = 0;
        setRoadmap_versionIsSet(false);
        this.roadmap_version = 0L;
        setUpdate_at_of_book_infoIsSet(false);
        this.update_at_of_book_info = 0L;
        setUpdate_at_of_notify_infoIsSet(false);
        this.update_at_of_notify_info = 0L;
        setShow_horizontalIsSet(false);
        this.show_horizontal = 0;
        setShow_nightIsSet(false);
        this.show_night = 0;
        setCollect_words_updated_atIsSet(false);
        this.collect_words_updated_at = 0L;
        setWord_note_updated_atIsSet(false);
        this.word_note_updated_at = 0L;
        setExam_flagIsSet(false);
        this.exam_flag = 0;
        setCur_book_has_primary_school_modeIsSet(false);
        this.cur_book_has_primary_school_mode = 0;
        setFirst_day_test_groupIsSet(false);
        this.first_day_test_group = 0;
        setWord_note_enableIsSet(false);
        this.word_note_enable = 0;
        this.wiki_component_cfg = null;
        setMiddle_school_test_codeIsSet(false);
        this.middle_school_test_code = 0;
        setNew_wikiIsSet(false);
        this.new_wiki = 0;
        setChn_styleIsSet(false);
        this.chn_style = 0;
        setShow_deviceIsSet(false);
        this.show_device = 0;
        this.dual_mode = null;
        setRhyme_modeIsSet(false);
        this.rhyme_mode = 0;
        this.pangolin_ad = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserLimitInfo)) {
            return equals((UserLimitInfo) that);
        }
        return false;
    }

    public int getChn_mode() {
        return this.chn_mode;
    }

    public int getChn_style() {
        return this.chn_style;
    }

    public long getCollect_words_updated_at() {
        return this.collect_words_updated_at;
    }

    public int getCur_book_has_primary_school_mode() {
        return this.cur_book_has_primary_school_mode;
    }

    public int getDifficulty_updated_at() {
        return this.difficulty_updated_at;
    }

    public DualMode getDual_mode() {
        return this.dual_mode;
    }

    public int getExam_flag() {
        return this.exam_flag;
    }

    public int getFirst_day_test_group() {
        return this.first_day_test_group;
    }

    public int getHas_word_friends() {
        return this.has_word_friends;
    }

    public int getListening_mode() {
        return this.listening_mode;
    }

    public int getMiddle_school_test_code() {
        return this.middle_school_test_code;
    }

    public int getNew_wiki() {
        return this.new_wiki;
    }

    public PangolinAD getPangolin_ad() {
        return this.pangolin_ad;
    }

    public int getQuestion_book_cfg() {
        return this.question_book_cfg;
    }

    public int getRhyme_mode() {
        return this.rhyme_mode;
    }

    public long getRoadmap_version() {
        return this.roadmap_version;
    }

    public int getShow_device() {
        return this.show_device;
    }

    public int getShow_horizontal() {
        return this.show_horizontal;
    }

    public int getShow_night() {
        return this.show_night;
    }

    public int getShow_sentence_trans() {
        return this.show_sentence_trans;
    }

    public int getSpell_mode() {
        return this.spell_mode;
    }

    public long getUpdate_at_of_book_info() {
        return this.update_at_of_book_info;
    }

    public long getUpdate_at_of_notify_info() {
        return this.update_at_of_notify_info;
    }

    public List<WikiComponent> getWiki_component_cfg() {
        return this.wiki_component_cfg;
    }

    public Iterator<WikiComponent> getWiki_component_cfgIterator() {
        List<WikiComponent> list = this.wiki_component_cfg;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getWiki_component_cfgSize() {
        List<WikiComponent> list = this.wiki_component_cfg;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int getWord_note_enable() {
        return this.word_note_enable;
    }

    public long getWord_note_updated_at() {
        return this.word_note_updated_at;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetChn_mode() {
        return EncodingUtils.testBit(this.__isset_bitfield, 5);
    }

    public boolean isSetChn_style() {
        return EncodingUtils.testBit(this.__isset_bitfield, 20);
    }

    public boolean isSetCollect_words_updated_at() {
        return EncodingUtils.testBit(this.__isset_bitfield, 12);
    }

    public boolean isSetCur_book_has_primary_school_mode() {
        return EncodingUtils.testBit(this.__isset_bitfield, 15);
    }

    public boolean isSetDifficulty_updated_at() {
        return EncodingUtils.testBit(this.__isset_bitfield, 6);
    }

    public boolean isSetDual_mode() {
        return this.dual_mode != null;
    }

    public boolean isSetExam_flag() {
        return EncodingUtils.testBit(this.__isset_bitfield, 14);
    }

    public boolean isSetFirst_day_test_group() {
        return EncodingUtils.testBit(this.__isset_bitfield, 16);
    }

    public boolean isSetHas_word_friends() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetListening_mode() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetMiddle_school_test_code() {
        return EncodingUtils.testBit(this.__isset_bitfield, 18);
    }

    public boolean isSetNew_wiki() {
        return EncodingUtils.testBit(this.__isset_bitfield, 19);
    }

    public boolean isSetPangolin_ad() {
        return this.pangolin_ad != null;
    }

    public boolean isSetQuestion_book_cfg() {
        return EncodingUtils.testBit(this.__isset_bitfield, 4);
    }

    public boolean isSetRhyme_mode() {
        return EncodingUtils.testBit(this.__isset_bitfield, 22);
    }

    public boolean isSetRoadmap_version() {
        return EncodingUtils.testBit(this.__isset_bitfield, 7);
    }

    public boolean isSetShow_device() {
        return EncodingUtils.testBit(this.__isset_bitfield, 21);
    }

    public boolean isSetShow_horizontal() {
        return EncodingUtils.testBit(this.__isset_bitfield, 10);
    }

    public boolean isSetShow_night() {
        return EncodingUtils.testBit(this.__isset_bitfield, 11);
    }

    public boolean isSetShow_sentence_trans() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetSpell_mode() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetUpdate_at_of_book_info() {
        return EncodingUtils.testBit(this.__isset_bitfield, 8);
    }

    public boolean isSetUpdate_at_of_notify_info() {
        return EncodingUtils.testBit(this.__isset_bitfield, 9);
    }

    public boolean isSetWiki_component_cfg() {
        return this.wiki_component_cfg != null;
    }

    public boolean isSetWord_note_enable() {
        return EncodingUtils.testBit(this.__isset_bitfield, 17);
    }

    public boolean isSetWord_note_updated_at() {
        return EncodingUtils.testBit(this.__isset_bitfield, 13);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserLimitInfo setChn_mode(int chn_mode) {
        this.chn_mode = chn_mode;
        setChn_modeIsSet(true);
        return this;
    }

    public void setChn_modeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 5, value);
    }

    public UserLimitInfo setChn_style(int chn_style) {
        this.chn_style = chn_style;
        setChn_styleIsSet(true);
        return this;
    }

    public void setChn_styleIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 20, value);
    }

    public UserLimitInfo setCollect_words_updated_at(long collect_words_updated_at) {
        this.collect_words_updated_at = collect_words_updated_at;
        setCollect_words_updated_atIsSet(true);
        return this;
    }

    public void setCollect_words_updated_atIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 12, value);
    }

    public UserLimitInfo setCur_book_has_primary_school_mode(int cur_book_has_primary_school_mode) {
        this.cur_book_has_primary_school_mode = cur_book_has_primary_school_mode;
        setCur_book_has_primary_school_modeIsSet(true);
        return this;
    }

    public void setCur_book_has_primary_school_modeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 15, value);
    }

    public UserLimitInfo setDifficulty_updated_at(int difficulty_updated_at) {
        this.difficulty_updated_at = difficulty_updated_at;
        setDifficulty_updated_atIsSet(true);
        return this;
    }

    public void setDifficulty_updated_atIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 6, value);
    }

    public UserLimitInfo setDual_mode(DualMode dual_mode) {
        this.dual_mode = dual_mode;
        return this;
    }

    public void setDual_modeIsSet(boolean value) {
        if (value) {
            return;
        }
        this.dual_mode = null;
    }

    public UserLimitInfo setExam_flag(int exam_flag) {
        this.exam_flag = exam_flag;
        setExam_flagIsSet(true);
        return this;
    }

    public void setExam_flagIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 14, value);
    }

    public UserLimitInfo setFirst_day_test_group(int first_day_test_group) {
        this.first_day_test_group = first_day_test_group;
        setFirst_day_test_groupIsSet(true);
        return this;
    }

    public void setFirst_day_test_groupIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 16, value);
    }

    public UserLimitInfo setHas_word_friends(int has_word_friends) {
        this.has_word_friends = has_word_friends;
        setHas_word_friendsIsSet(true);
        return this;
    }

    public void setHas_word_friendsIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public UserLimitInfo setListening_mode(int listening_mode) {
        this.listening_mode = listening_mode;
        setListening_modeIsSet(true);
        return this;
    }

    public void setListening_modeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public UserLimitInfo setMiddle_school_test_code(int middle_school_test_code) {
        this.middle_school_test_code = middle_school_test_code;
        setMiddle_school_test_codeIsSet(true);
        return this;
    }

    public void setMiddle_school_test_codeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 18, value);
    }

    public UserLimitInfo setNew_wiki(int new_wiki) {
        this.new_wiki = new_wiki;
        setNew_wikiIsSet(true);
        return this;
    }

    public void setNew_wikiIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 19, value);
    }

    public UserLimitInfo setPangolin_ad(PangolinAD pangolin_ad) {
        this.pangolin_ad = pangolin_ad;
        return this;
    }

    public void setPangolin_adIsSet(boolean value) {
        if (value) {
            return;
        }
        this.pangolin_ad = null;
    }

    public UserLimitInfo setQuestion_book_cfg(int question_book_cfg) {
        this.question_book_cfg = question_book_cfg;
        setQuestion_book_cfgIsSet(true);
        return this;
    }

    public void setQuestion_book_cfgIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 4, value);
    }

    public UserLimitInfo setRhyme_mode(int rhyme_mode) {
        this.rhyme_mode = rhyme_mode;
        setRhyme_modeIsSet(true);
        return this;
    }

    public void setRhyme_modeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 22, value);
    }

    public UserLimitInfo setRoadmap_version(long roadmap_version) {
        this.roadmap_version = roadmap_version;
        setRoadmap_versionIsSet(true);
        return this;
    }

    public void setRoadmap_versionIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 7, value);
    }

    public UserLimitInfo setShow_device(int show_device) {
        this.show_device = show_device;
        setShow_deviceIsSet(true);
        return this;
    }

    public void setShow_deviceIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 21, value);
    }

    public UserLimitInfo setShow_horizontal(int show_horizontal) {
        this.show_horizontal = show_horizontal;
        setShow_horizontalIsSet(true);
        return this;
    }

    public void setShow_horizontalIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 10, value);
    }

    public UserLimitInfo setShow_night(int show_night) {
        this.show_night = show_night;
        setShow_nightIsSet(true);
        return this;
    }

    public void setShow_nightIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 11, value);
    }

    public UserLimitInfo setShow_sentence_trans(int show_sentence_trans) {
        this.show_sentence_trans = show_sentence_trans;
        setShow_sentence_transIsSet(true);
        return this;
    }

    public void setShow_sentence_transIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public UserLimitInfo setSpell_mode(int spell_mode) {
        this.spell_mode = spell_mode;
        setSpell_modeIsSet(true);
        return this;
    }

    public void setSpell_modeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public UserLimitInfo setUpdate_at_of_book_info(long update_at_of_book_info) {
        this.update_at_of_book_info = update_at_of_book_info;
        setUpdate_at_of_book_infoIsSet(true);
        return this;
    }

    public void setUpdate_at_of_book_infoIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 8, value);
    }

    public UserLimitInfo setUpdate_at_of_notify_info(long update_at_of_notify_info) {
        this.update_at_of_notify_info = update_at_of_notify_info;
        setUpdate_at_of_notify_infoIsSet(true);
        return this;
    }

    public void setUpdate_at_of_notify_infoIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 9, value);
    }

    public UserLimitInfo setWiki_component_cfg(List<WikiComponent> wiki_component_cfg) {
        this.wiki_component_cfg = wiki_component_cfg;
        return this;
    }

    public void setWiki_component_cfgIsSet(boolean value) {
        if (value) {
            return;
        }
        this.wiki_component_cfg = null;
    }

    public UserLimitInfo setWord_note_enable(int word_note_enable) {
        this.word_note_enable = word_note_enable;
        setWord_note_enableIsSet(true);
        return this;
    }

    public void setWord_note_enableIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 17, value);
    }

    public UserLimitInfo setWord_note_updated_at(long word_note_updated_at) {
        this.word_note_updated_at = word_note_updated_at;
        setWord_note_updated_atIsSet(true);
        return this;
    }

    public void setWord_note_updated_atIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 13, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserLimitInfo(");
        sb2.append("show_sentence_trans:");
        sb2.append(this.show_sentence_trans);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("has_word_friends:");
        sb2.append(this.has_word_friends);
        if (isSetSpell_mode()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("spell_mode:");
            sb2.append(this.spell_mode);
        }
        if (isSetListening_mode()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("listening_mode:");
            sb2.append(this.listening_mode);
        }
        if (isSetQuestion_book_cfg()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("question_book_cfg:");
            sb2.append(this.question_book_cfg);
        }
        if (isSetChn_mode()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("chn_mode:");
            sb2.append(this.chn_mode);
        }
        if (isSetDifficulty_updated_at()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("difficulty_updated_at:");
            sb2.append(this.difficulty_updated_at);
        }
        if (isSetRoadmap_version()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("roadmap_version:");
            sb2.append(this.roadmap_version);
        }
        if (isSetUpdate_at_of_book_info()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("update_at_of_book_info:");
            sb2.append(this.update_at_of_book_info);
        }
        if (isSetUpdate_at_of_notify_info()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("update_at_of_notify_info:");
            sb2.append(this.update_at_of_notify_info);
        }
        if (isSetShow_horizontal()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("show_horizontal:");
            sb2.append(this.show_horizontal);
        }
        if (isSetShow_night()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("show_night:");
            sb2.append(this.show_night);
        }
        if (isSetCollect_words_updated_at()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("collect_words_updated_at:");
            sb2.append(this.collect_words_updated_at);
        }
        if (isSetWord_note_updated_at()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("word_note_updated_at:");
            sb2.append(this.word_note_updated_at);
        }
        if (isSetExam_flag()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("exam_flag:");
            sb2.append(this.exam_flag);
        }
        if (isSetCur_book_has_primary_school_mode()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("cur_book_has_primary_school_mode:");
            sb2.append(this.cur_book_has_primary_school_mode);
        }
        if (isSetFirst_day_test_group()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("first_day_test_group:");
            sb2.append(this.first_day_test_group);
        }
        if (isSetWord_note_enable()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("word_note_enable:");
            sb2.append(this.word_note_enable);
        }
        if (isSetWiki_component_cfg()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("wiki_component_cfg:");
            List<WikiComponent> list = this.wiki_component_cfg;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
        }
        if (isSetMiddle_school_test_code()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("middle_school_test_code:");
            sb2.append(this.middle_school_test_code);
        }
        if (isSetNew_wiki()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("new_wiki:");
            sb2.append(this.new_wiki);
        }
        if (isSetChn_style()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("chn_style:");
            sb2.append(this.chn_style);
        }
        if (isSetShow_device()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("show_device:");
            sb2.append(this.show_device);
        }
        if (isSetDual_mode()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("dual_mode:");
            DualMode dualMode = this.dual_mode;
            if (dualMode == null) {
                sb2.append("null");
            } else {
                sb2.append(dualMode);
            }
        }
        if (isSetRhyme_mode()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("rhyme_mode:");
            sb2.append(this.rhyme_mode);
        }
        if (isSetPangolin_ad()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("pangolin_ad:");
            PangolinAD pangolinAD = this.pangolin_ad;
            if (pangolinAD == null) {
                sb2.append("null");
            } else {
                sb2.append(pangolinAD);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetChn_mode() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 5);
    }

    public void unsetChn_style() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 20);
    }

    public void unsetCollect_words_updated_at() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 12);
    }

    public void unsetCur_book_has_primary_school_mode() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 15);
    }

    public void unsetDifficulty_updated_at() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 6);
    }

    public void unsetDual_mode() {
        this.dual_mode = null;
    }

    public void unsetExam_flag() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 14);
    }

    public void unsetFirst_day_test_group() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 16);
    }

    public void unsetHas_word_friends() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetListening_mode() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetMiddle_school_test_code() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 18);
    }

    public void unsetNew_wiki() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 19);
    }

    public void unsetPangolin_ad() {
        this.pangolin_ad = null;
    }

    public void unsetQuestion_book_cfg() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 4);
    }

    public void unsetRhyme_mode() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 22);
    }

    public void unsetRoadmap_version() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 7);
    }

    public void unsetShow_device() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 21);
    }

    public void unsetShow_horizontal() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 10);
    }

    public void unsetShow_night() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 11);
    }

    public void unsetShow_sentence_trans() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetSpell_mode() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetUpdate_at_of_book_info() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 8);
    }

    public void unsetUpdate_at_of_notify_info() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 9);
    }

    public void unsetWiki_component_cfg() {
        this.wiki_component_cfg = null;
    }

    public void unsetWord_note_enable() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 17);
    }

    public void unsetWord_note_updated_at() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 13);
    }

    public void validate() throws TException {
        DualMode dualMode = this.dual_mode;
        if (dualMode != null) {
            dualMode.validate();
        }
        PangolinAD pangolinAD = this.pangolin_ad;
        if (pangolinAD != null) {
            pangolinAD.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(UserLimitInfo other) {
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
        int compareTo16;
        int compareTo17;
        int compareTo18;
        int compareTo19;
        int compareTo20;
        int compareTo21;
        int compareTo22;
        int compareTo23;
        int compareTo24;
        int compareTo25;
        int compareTo26;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo27 = Boolean.valueOf(isSetShow_sentence_trans()).compareTo(Boolean.valueOf(other.isSetShow_sentence_trans()));
        if (compareTo27 != 0) {
            return compareTo27;
        }
        if (isSetShow_sentence_trans() && (compareTo26 = TBaseHelper.compareTo(this.show_sentence_trans, other.show_sentence_trans)) != 0) {
            return compareTo26;
        }
        int compareTo28 = Boolean.valueOf(isSetHas_word_friends()).compareTo(Boolean.valueOf(other.isSetHas_word_friends()));
        if (compareTo28 != 0) {
            return compareTo28;
        }
        if (isSetHas_word_friends() && (compareTo25 = TBaseHelper.compareTo(this.has_word_friends, other.has_word_friends)) != 0) {
            return compareTo25;
        }
        int compareTo29 = Boolean.valueOf(isSetSpell_mode()).compareTo(Boolean.valueOf(other.isSetSpell_mode()));
        if (compareTo29 != 0) {
            return compareTo29;
        }
        if (isSetSpell_mode() && (compareTo24 = TBaseHelper.compareTo(this.spell_mode, other.spell_mode)) != 0) {
            return compareTo24;
        }
        int compareTo30 = Boolean.valueOf(isSetListening_mode()).compareTo(Boolean.valueOf(other.isSetListening_mode()));
        if (compareTo30 != 0) {
            return compareTo30;
        }
        if (isSetListening_mode() && (compareTo23 = TBaseHelper.compareTo(this.listening_mode, other.listening_mode)) != 0) {
            return compareTo23;
        }
        int compareTo31 = Boolean.valueOf(isSetQuestion_book_cfg()).compareTo(Boolean.valueOf(other.isSetQuestion_book_cfg()));
        if (compareTo31 != 0) {
            return compareTo31;
        }
        if (isSetQuestion_book_cfg() && (compareTo22 = TBaseHelper.compareTo(this.question_book_cfg, other.question_book_cfg)) != 0) {
            return compareTo22;
        }
        int compareTo32 = Boolean.valueOf(isSetChn_mode()).compareTo(Boolean.valueOf(other.isSetChn_mode()));
        if (compareTo32 != 0) {
            return compareTo32;
        }
        if (isSetChn_mode() && (compareTo21 = TBaseHelper.compareTo(this.chn_mode, other.chn_mode)) != 0) {
            return compareTo21;
        }
        int compareTo33 = Boolean.valueOf(isSetDifficulty_updated_at()).compareTo(Boolean.valueOf(other.isSetDifficulty_updated_at()));
        if (compareTo33 != 0) {
            return compareTo33;
        }
        if (isSetDifficulty_updated_at() && (compareTo20 = TBaseHelper.compareTo(this.difficulty_updated_at, other.difficulty_updated_at)) != 0) {
            return compareTo20;
        }
        int compareTo34 = Boolean.valueOf(isSetRoadmap_version()).compareTo(Boolean.valueOf(other.isSetRoadmap_version()));
        if (compareTo34 != 0) {
            return compareTo34;
        }
        if (isSetRoadmap_version() && (compareTo19 = TBaseHelper.compareTo(this.roadmap_version, other.roadmap_version)) != 0) {
            return compareTo19;
        }
        int compareTo35 = Boolean.valueOf(isSetUpdate_at_of_book_info()).compareTo(Boolean.valueOf(other.isSetUpdate_at_of_book_info()));
        if (compareTo35 != 0) {
            return compareTo35;
        }
        if (isSetUpdate_at_of_book_info() && (compareTo18 = TBaseHelper.compareTo(this.update_at_of_book_info, other.update_at_of_book_info)) != 0) {
            return compareTo18;
        }
        int compareTo36 = Boolean.valueOf(isSetUpdate_at_of_notify_info()).compareTo(Boolean.valueOf(other.isSetUpdate_at_of_notify_info()));
        if (compareTo36 != 0) {
            return compareTo36;
        }
        if (isSetUpdate_at_of_notify_info() && (compareTo17 = TBaseHelper.compareTo(this.update_at_of_notify_info, other.update_at_of_notify_info)) != 0) {
            return compareTo17;
        }
        int compareTo37 = Boolean.valueOf(isSetShow_horizontal()).compareTo(Boolean.valueOf(other.isSetShow_horizontal()));
        if (compareTo37 != 0) {
            return compareTo37;
        }
        if (isSetShow_horizontal() && (compareTo16 = TBaseHelper.compareTo(this.show_horizontal, other.show_horizontal)) != 0) {
            return compareTo16;
        }
        int compareTo38 = Boolean.valueOf(isSetShow_night()).compareTo(Boolean.valueOf(other.isSetShow_night()));
        if (compareTo38 != 0) {
            return compareTo38;
        }
        if (isSetShow_night() && (compareTo15 = TBaseHelper.compareTo(this.show_night, other.show_night)) != 0) {
            return compareTo15;
        }
        int compareTo39 = Boolean.valueOf(isSetCollect_words_updated_at()).compareTo(Boolean.valueOf(other.isSetCollect_words_updated_at()));
        if (compareTo39 != 0) {
            return compareTo39;
        }
        if (isSetCollect_words_updated_at() && (compareTo14 = TBaseHelper.compareTo(this.collect_words_updated_at, other.collect_words_updated_at)) != 0) {
            return compareTo14;
        }
        int compareTo40 = Boolean.valueOf(isSetWord_note_updated_at()).compareTo(Boolean.valueOf(other.isSetWord_note_updated_at()));
        if (compareTo40 != 0) {
            return compareTo40;
        }
        if (isSetWord_note_updated_at() && (compareTo13 = TBaseHelper.compareTo(this.word_note_updated_at, other.word_note_updated_at)) != 0) {
            return compareTo13;
        }
        int compareTo41 = Boolean.valueOf(isSetExam_flag()).compareTo(Boolean.valueOf(other.isSetExam_flag()));
        if (compareTo41 != 0) {
            return compareTo41;
        }
        if (isSetExam_flag() && (compareTo12 = TBaseHelper.compareTo(this.exam_flag, other.exam_flag)) != 0) {
            return compareTo12;
        }
        int compareTo42 = Boolean.valueOf(isSetCur_book_has_primary_school_mode()).compareTo(Boolean.valueOf(other.isSetCur_book_has_primary_school_mode()));
        if (compareTo42 != 0) {
            return compareTo42;
        }
        if (isSetCur_book_has_primary_school_mode() && (compareTo11 = TBaseHelper.compareTo(this.cur_book_has_primary_school_mode, other.cur_book_has_primary_school_mode)) != 0) {
            return compareTo11;
        }
        int compareTo43 = Boolean.valueOf(isSetFirst_day_test_group()).compareTo(Boolean.valueOf(other.isSetFirst_day_test_group()));
        if (compareTo43 != 0) {
            return compareTo43;
        }
        if (isSetFirst_day_test_group() && (compareTo10 = TBaseHelper.compareTo(this.first_day_test_group, other.first_day_test_group)) != 0) {
            return compareTo10;
        }
        int compareTo44 = Boolean.valueOf(isSetWord_note_enable()).compareTo(Boolean.valueOf(other.isSetWord_note_enable()));
        if (compareTo44 != 0) {
            return compareTo44;
        }
        if (isSetWord_note_enable() && (compareTo9 = TBaseHelper.compareTo(this.word_note_enable, other.word_note_enable)) != 0) {
            return compareTo9;
        }
        int compareTo45 = Boolean.valueOf(isSetWiki_component_cfg()).compareTo(Boolean.valueOf(other.isSetWiki_component_cfg()));
        if (compareTo45 != 0) {
            return compareTo45;
        }
        if (isSetWiki_component_cfg() && (compareTo8 = TBaseHelper.compareTo((List) this.wiki_component_cfg, (List) other.wiki_component_cfg)) != 0) {
            return compareTo8;
        }
        int compareTo46 = Boolean.valueOf(isSetMiddle_school_test_code()).compareTo(Boolean.valueOf(other.isSetMiddle_school_test_code()));
        if (compareTo46 != 0) {
            return compareTo46;
        }
        if (isSetMiddle_school_test_code() && (compareTo7 = TBaseHelper.compareTo(this.middle_school_test_code, other.middle_school_test_code)) != 0) {
            return compareTo7;
        }
        int compareTo47 = Boolean.valueOf(isSetNew_wiki()).compareTo(Boolean.valueOf(other.isSetNew_wiki()));
        if (compareTo47 != 0) {
            return compareTo47;
        }
        if (isSetNew_wiki() && (compareTo6 = TBaseHelper.compareTo(this.new_wiki, other.new_wiki)) != 0) {
            return compareTo6;
        }
        int compareTo48 = Boolean.valueOf(isSetChn_style()).compareTo(Boolean.valueOf(other.isSetChn_style()));
        if (compareTo48 != 0) {
            return compareTo48;
        }
        if (isSetChn_style() && (compareTo5 = TBaseHelper.compareTo(this.chn_style, other.chn_style)) != 0) {
            return compareTo5;
        }
        int compareTo49 = Boolean.valueOf(isSetShow_device()).compareTo(Boolean.valueOf(other.isSetShow_device()));
        if (compareTo49 != 0) {
            return compareTo49;
        }
        if (isSetShow_device() && (compareTo4 = TBaseHelper.compareTo(this.show_device, other.show_device)) != 0) {
            return compareTo4;
        }
        int compareTo50 = Boolean.valueOf(isSetDual_mode()).compareTo(Boolean.valueOf(other.isSetDual_mode()));
        if (compareTo50 != 0) {
            return compareTo50;
        }
        if (isSetDual_mode() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.dual_mode, (Comparable) other.dual_mode)) != 0) {
            return compareTo3;
        }
        int compareTo51 = Boolean.valueOf(isSetRhyme_mode()).compareTo(Boolean.valueOf(other.isSetRhyme_mode()));
        if (compareTo51 != 0) {
            return compareTo51;
        }
        if (isSetRhyme_mode() && (compareTo2 = TBaseHelper.compareTo(this.rhyme_mode, other.rhyme_mode)) != 0) {
            return compareTo2;
        }
        int compareTo52 = Boolean.valueOf(isSetPangolin_ad()).compareTo(Boolean.valueOf(other.isSetPangolin_ad()));
        if (compareTo52 != 0) {
            return compareTo52;
        }
        if (!isSetPangolin_ad() || (compareTo = TBaseHelper.compareTo((Comparable) this.pangolin_ad, (Comparable) other.pangolin_ad)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserLimitInfo, _Fields> deepCopy2() {
        return new UserLimitInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfo$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getShow_sentence_trans());
            case 2:
                return Integer.valueOf(getHas_word_friends());
            case 3:
                return Integer.valueOf(getSpell_mode());
            case 4:
                return Integer.valueOf(getListening_mode());
            case 5:
                return Integer.valueOf(getQuestion_book_cfg());
            case 6:
                return Integer.valueOf(getChn_mode());
            case 7:
                return Integer.valueOf(getDifficulty_updated_at());
            case 8:
                return Long.valueOf(getRoadmap_version());
            case 9:
                return Long.valueOf(getUpdate_at_of_book_info());
            case 10:
                return Long.valueOf(getUpdate_at_of_notify_info());
            case 11:
                return Integer.valueOf(getShow_horizontal());
            case 12:
                return Integer.valueOf(getShow_night());
            case 13:
                return Long.valueOf(getCollect_words_updated_at());
            case 14:
                return Long.valueOf(getWord_note_updated_at());
            case 15:
                return Integer.valueOf(getExam_flag());
            case 16:
                return Integer.valueOf(getCur_book_has_primary_school_mode());
            case 17:
                return Integer.valueOf(getFirst_day_test_group());
            case 18:
                return Integer.valueOf(getWord_note_enable());
            case 19:
                return getWiki_component_cfg();
            case 20:
                return Integer.valueOf(getMiddle_school_test_code());
            case 21:
                return Integer.valueOf(getNew_wiki());
            case 22:
                return Integer.valueOf(getChn_style());
            case 23:
                return Integer.valueOf(getShow_device());
            case 24:
                return getDual_mode();
            case 25:
                return Integer.valueOf(getRhyme_mode());
            case 26:
                return getPangolin_ad();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetShow_sentence_trans();
            case 2:
                return isSetHas_word_friends();
            case 3:
                return isSetSpell_mode();
            case 4:
                return isSetListening_mode();
            case 5:
                return isSetQuestion_book_cfg();
            case 6:
                return isSetChn_mode();
            case 7:
                return isSetDifficulty_updated_at();
            case 8:
                return isSetRoadmap_version();
            case 9:
                return isSetUpdate_at_of_book_info();
            case 10:
                return isSetUpdate_at_of_notify_info();
            case 11:
                return isSetShow_horizontal();
            case 12:
                return isSetShow_night();
            case 13:
                return isSetCollect_words_updated_at();
            case 14:
                return isSetWord_note_updated_at();
            case 15:
                return isSetExam_flag();
            case 16:
                return isSetCur_book_has_primary_school_mode();
            case 17:
                return isSetFirst_day_test_group();
            case 18:
                return isSetWord_note_enable();
            case 19:
                return isSetWiki_component_cfg();
            case 20:
                return isSetMiddle_school_test_code();
            case 21:
                return isSetNew_wiki();
            case 22:
                return isSetChn_style();
            case 23:
                return isSetShow_device();
            case 24:
                return isSetDual_mode();
            case 25:
                return isSetRhyme_mode();
            case 26:
                return isSetPangolin_ad();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserLimitInfo$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setShow_sentence_trans(((Integer) value).intValue());
                    break;
                } else {
                    unsetShow_sentence_trans();
                    break;
                }
            case 2:
                if (value != null) {
                    setHas_word_friends(((Integer) value).intValue());
                    break;
                } else {
                    unsetHas_word_friends();
                    break;
                }
            case 3:
                if (value != null) {
                    setSpell_mode(((Integer) value).intValue());
                    break;
                } else {
                    unsetSpell_mode();
                    break;
                }
            case 4:
                if (value != null) {
                    setListening_mode(((Integer) value).intValue());
                    break;
                } else {
                    unsetListening_mode();
                    break;
                }
            case 5:
                if (value != null) {
                    setQuestion_book_cfg(((Integer) value).intValue());
                    break;
                } else {
                    unsetQuestion_book_cfg();
                    break;
                }
            case 6:
                if (value != null) {
                    setChn_mode(((Integer) value).intValue());
                    break;
                } else {
                    unsetChn_mode();
                    break;
                }
            case 7:
                if (value != null) {
                    setDifficulty_updated_at(((Integer) value).intValue());
                    break;
                } else {
                    unsetDifficulty_updated_at();
                    break;
                }
            case 8:
                if (value != null) {
                    setRoadmap_version(((Long) value).longValue());
                    break;
                } else {
                    unsetRoadmap_version();
                    break;
                }
            case 9:
                if (value != null) {
                    setUpdate_at_of_book_info(((Long) value).longValue());
                    break;
                } else {
                    unsetUpdate_at_of_book_info();
                    break;
                }
            case 10:
                if (value != null) {
                    setUpdate_at_of_notify_info(((Long) value).longValue());
                    break;
                } else {
                    unsetUpdate_at_of_notify_info();
                    break;
                }
            case 11:
                if (value != null) {
                    setShow_horizontal(((Integer) value).intValue());
                    break;
                } else {
                    unsetShow_horizontal();
                    break;
                }
            case 12:
                if (value != null) {
                    setShow_night(((Integer) value).intValue());
                    break;
                } else {
                    unsetShow_night();
                    break;
                }
            case 13:
                if (value != null) {
                    setCollect_words_updated_at(((Long) value).longValue());
                    break;
                } else {
                    unsetCollect_words_updated_at();
                    break;
                }
            case 14:
                if (value != null) {
                    setWord_note_updated_at(((Long) value).longValue());
                    break;
                } else {
                    unsetWord_note_updated_at();
                    break;
                }
            case 15:
                if (value != null) {
                    setExam_flag(((Integer) value).intValue());
                    break;
                } else {
                    unsetExam_flag();
                    break;
                }
            case 16:
                if (value != null) {
                    setCur_book_has_primary_school_mode(((Integer) value).intValue());
                    break;
                } else {
                    unsetCur_book_has_primary_school_mode();
                    break;
                }
            case 17:
                if (value != null) {
                    setFirst_day_test_group(((Integer) value).intValue());
                    break;
                } else {
                    unsetFirst_day_test_group();
                    break;
                }
            case 18:
                if (value != null) {
                    setWord_note_enable(((Integer) value).intValue());
                    break;
                } else {
                    unsetWord_note_enable();
                    break;
                }
            case 19:
                if (value != null) {
                    setWiki_component_cfg((List) value);
                    break;
                } else {
                    unsetWiki_component_cfg();
                    break;
                }
            case 20:
                if (value != null) {
                    setMiddle_school_test_code(((Integer) value).intValue());
                    break;
                } else {
                    unsetMiddle_school_test_code();
                    break;
                }
            case 21:
                if (value != null) {
                    setNew_wiki(((Integer) value).intValue());
                    break;
                } else {
                    unsetNew_wiki();
                    break;
                }
            case 22:
                if (value != null) {
                    setChn_style(((Integer) value).intValue());
                    break;
                } else {
                    unsetChn_style();
                    break;
                }
            case 23:
                if (value != null) {
                    setShow_device(((Integer) value).intValue());
                    break;
                } else {
                    unsetShow_device();
                    break;
                }
            case 24:
                if (value != null) {
                    setDual_mode((DualMode) value);
                    break;
                } else {
                    unsetDual_mode();
                    break;
                }
            case 25:
                if (value != null) {
                    setRhyme_mode(((Integer) value).intValue());
                    break;
                } else {
                    unsetRhyme_mode();
                    break;
                }
            case 26:
                if (value != null) {
                    setPangolin_ad((PangolinAD) value);
                    break;
                } else {
                    unsetPangolin_ad();
                    break;
                }
        }
    }

    public boolean equals(UserLimitInfo that) {
        if (that == null || this.show_sentence_trans != that.show_sentence_trans || this.has_word_friends != that.has_word_friends) {
            return false;
        }
        boolean isSetSpell_mode = isSetSpell_mode();
        boolean isSetSpell_mode2 = that.isSetSpell_mode();
        if ((isSetSpell_mode || isSetSpell_mode2) && !(isSetSpell_mode && isSetSpell_mode2 && this.spell_mode == that.spell_mode)) {
            return false;
        }
        boolean isSetListening_mode = isSetListening_mode();
        boolean isSetListening_mode2 = that.isSetListening_mode();
        if ((isSetListening_mode || isSetListening_mode2) && !(isSetListening_mode && isSetListening_mode2 && this.listening_mode == that.listening_mode)) {
            return false;
        }
        boolean isSetQuestion_book_cfg = isSetQuestion_book_cfg();
        boolean isSetQuestion_book_cfg2 = that.isSetQuestion_book_cfg();
        if ((isSetQuestion_book_cfg || isSetQuestion_book_cfg2) && !(isSetQuestion_book_cfg && isSetQuestion_book_cfg2 && this.question_book_cfg == that.question_book_cfg)) {
            return false;
        }
        boolean isSetChn_mode = isSetChn_mode();
        boolean isSetChn_mode2 = that.isSetChn_mode();
        if ((isSetChn_mode || isSetChn_mode2) && !(isSetChn_mode && isSetChn_mode2 && this.chn_mode == that.chn_mode)) {
            return false;
        }
        boolean isSetDifficulty_updated_at = isSetDifficulty_updated_at();
        boolean isSetDifficulty_updated_at2 = that.isSetDifficulty_updated_at();
        if ((isSetDifficulty_updated_at || isSetDifficulty_updated_at2) && !(isSetDifficulty_updated_at && isSetDifficulty_updated_at2 && this.difficulty_updated_at == that.difficulty_updated_at)) {
            return false;
        }
        boolean isSetRoadmap_version = isSetRoadmap_version();
        boolean isSetRoadmap_version2 = that.isSetRoadmap_version();
        if ((isSetRoadmap_version || isSetRoadmap_version2) && !(isSetRoadmap_version && isSetRoadmap_version2 && this.roadmap_version == that.roadmap_version)) {
            return false;
        }
        boolean isSetUpdate_at_of_book_info = isSetUpdate_at_of_book_info();
        boolean isSetUpdate_at_of_book_info2 = that.isSetUpdate_at_of_book_info();
        if ((isSetUpdate_at_of_book_info || isSetUpdate_at_of_book_info2) && !(isSetUpdate_at_of_book_info && isSetUpdate_at_of_book_info2 && this.update_at_of_book_info == that.update_at_of_book_info)) {
            return false;
        }
        boolean isSetUpdate_at_of_notify_info = isSetUpdate_at_of_notify_info();
        boolean isSetUpdate_at_of_notify_info2 = that.isSetUpdate_at_of_notify_info();
        if ((isSetUpdate_at_of_notify_info || isSetUpdate_at_of_notify_info2) && !(isSetUpdate_at_of_notify_info && isSetUpdate_at_of_notify_info2 && this.update_at_of_notify_info == that.update_at_of_notify_info)) {
            return false;
        }
        boolean isSetShow_horizontal = isSetShow_horizontal();
        boolean isSetShow_horizontal2 = that.isSetShow_horizontal();
        if ((isSetShow_horizontal || isSetShow_horizontal2) && !(isSetShow_horizontal && isSetShow_horizontal2 && this.show_horizontal == that.show_horizontal)) {
            return false;
        }
        boolean isSetShow_night = isSetShow_night();
        boolean isSetShow_night2 = that.isSetShow_night();
        if ((isSetShow_night || isSetShow_night2) && !(isSetShow_night && isSetShow_night2 && this.show_night == that.show_night)) {
            return false;
        }
        boolean isSetCollect_words_updated_at = isSetCollect_words_updated_at();
        boolean isSetCollect_words_updated_at2 = that.isSetCollect_words_updated_at();
        if ((isSetCollect_words_updated_at || isSetCollect_words_updated_at2) && !(isSetCollect_words_updated_at && isSetCollect_words_updated_at2 && this.collect_words_updated_at == that.collect_words_updated_at)) {
            return false;
        }
        boolean isSetWord_note_updated_at = isSetWord_note_updated_at();
        boolean isSetWord_note_updated_at2 = that.isSetWord_note_updated_at();
        if ((isSetWord_note_updated_at || isSetWord_note_updated_at2) && !(isSetWord_note_updated_at && isSetWord_note_updated_at2 && this.word_note_updated_at == that.word_note_updated_at)) {
            return false;
        }
        boolean isSetExam_flag = isSetExam_flag();
        boolean isSetExam_flag2 = that.isSetExam_flag();
        if ((isSetExam_flag || isSetExam_flag2) && !(isSetExam_flag && isSetExam_flag2 && this.exam_flag == that.exam_flag)) {
            return false;
        }
        boolean isSetCur_book_has_primary_school_mode = isSetCur_book_has_primary_school_mode();
        boolean isSetCur_book_has_primary_school_mode2 = that.isSetCur_book_has_primary_school_mode();
        if ((isSetCur_book_has_primary_school_mode || isSetCur_book_has_primary_school_mode2) && !(isSetCur_book_has_primary_school_mode && isSetCur_book_has_primary_school_mode2 && this.cur_book_has_primary_school_mode == that.cur_book_has_primary_school_mode)) {
            return false;
        }
        boolean isSetFirst_day_test_group = isSetFirst_day_test_group();
        boolean isSetFirst_day_test_group2 = that.isSetFirst_day_test_group();
        if ((isSetFirst_day_test_group || isSetFirst_day_test_group2) && !(isSetFirst_day_test_group && isSetFirst_day_test_group2 && this.first_day_test_group == that.first_day_test_group)) {
            return false;
        }
        boolean isSetWord_note_enable = isSetWord_note_enable();
        boolean isSetWord_note_enable2 = that.isSetWord_note_enable();
        if ((isSetWord_note_enable || isSetWord_note_enable2) && !(isSetWord_note_enable && isSetWord_note_enable2 && this.word_note_enable == that.word_note_enable)) {
            return false;
        }
        boolean isSetWiki_component_cfg = isSetWiki_component_cfg();
        boolean isSetWiki_component_cfg2 = that.isSetWiki_component_cfg();
        if ((isSetWiki_component_cfg || isSetWiki_component_cfg2) && !(isSetWiki_component_cfg && isSetWiki_component_cfg2 && this.wiki_component_cfg.equals(that.wiki_component_cfg))) {
            return false;
        }
        boolean isSetMiddle_school_test_code = isSetMiddle_school_test_code();
        boolean isSetMiddle_school_test_code2 = that.isSetMiddle_school_test_code();
        if ((isSetMiddle_school_test_code || isSetMiddle_school_test_code2) && !(isSetMiddle_school_test_code && isSetMiddle_school_test_code2 && this.middle_school_test_code == that.middle_school_test_code)) {
            return false;
        }
        boolean isSetNew_wiki = isSetNew_wiki();
        boolean isSetNew_wiki2 = that.isSetNew_wiki();
        if ((isSetNew_wiki || isSetNew_wiki2) && !(isSetNew_wiki && isSetNew_wiki2 && this.new_wiki == that.new_wiki)) {
            return false;
        }
        boolean isSetChn_style = isSetChn_style();
        boolean isSetChn_style2 = that.isSetChn_style();
        if ((isSetChn_style || isSetChn_style2) && !(isSetChn_style && isSetChn_style2 && this.chn_style == that.chn_style)) {
            return false;
        }
        boolean isSetShow_device = isSetShow_device();
        boolean isSetShow_device2 = that.isSetShow_device();
        if ((isSetShow_device || isSetShow_device2) && !(isSetShow_device && isSetShow_device2 && this.show_device == that.show_device)) {
            return false;
        }
        boolean isSetDual_mode = isSetDual_mode();
        boolean isSetDual_mode2 = that.isSetDual_mode();
        if ((isSetDual_mode || isSetDual_mode2) && !(isSetDual_mode && isSetDual_mode2 && this.dual_mode.equals(that.dual_mode))) {
            return false;
        }
        boolean isSetRhyme_mode = isSetRhyme_mode();
        boolean isSetRhyme_mode2 = that.isSetRhyme_mode();
        if ((isSetRhyme_mode || isSetRhyme_mode2) && !(isSetRhyme_mode && isSetRhyme_mode2 && this.rhyme_mode == that.rhyme_mode)) {
            return false;
        }
        boolean isSetPangolin_ad = isSetPangolin_ad();
        boolean isSetPangolin_ad2 = that.isSetPangolin_ad();
        if (isSetPangolin_ad || isSetPangolin_ad2) {
            return isSetPangolin_ad && isSetPangolin_ad2 && this.pangolin_ad.equals(that.pangolin_ad);
        }
        return true;
    }

    public UserLimitInfo(int show_sentence_trans, int has_word_friends) {
        this();
        this.show_sentence_trans = show_sentence_trans;
        setShow_sentence_transIsSet(true);
        this.has_word_friends = has_word_friends;
        setHas_word_friendsIsSet(true);
    }

    public UserLimitInfo(UserLimitInfo other) {
        this.__isset_bitfield = 0;
        this.optionals = new _Fields[]{_Fields.SPELL_MODE, _Fields.LISTENING_MODE, _Fields.QUESTION_BOOK_CFG, _Fields.CHN_MODE, _Fields.DIFFICULTY_UPDATED_AT, _Fields.ROADMAP_VERSION, _Fields.UPDATE_AT_OF_BOOK_INFO, _Fields.UPDATE_AT_OF_NOTIFY_INFO, _Fields.SHOW_HORIZONTAL, _Fields.SHOW_NIGHT, _Fields.COLLECT_WORDS_UPDATED_AT, _Fields.WORD_NOTE_UPDATED_AT, _Fields.EXAM_FLAG, _Fields.CUR_BOOK_HAS_PRIMARY_SCHOOL_MODE, _Fields.FIRST_DAY_TEST_GROUP, _Fields.WORD_NOTE_ENABLE, _Fields.WIKI_COMPONENT_CFG, _Fields.MIDDLE_SCHOOL_TEST_CODE, _Fields.NEW_WIKI, _Fields.CHN_STYLE, _Fields.SHOW_DEVICE, _Fields.DUAL_MODE, _Fields.RHYME_MODE, _Fields.PANGOLIN_AD};
        this.__isset_bitfield = other.__isset_bitfield;
        this.show_sentence_trans = other.show_sentence_trans;
        this.has_word_friends = other.has_word_friends;
        this.spell_mode = other.spell_mode;
        this.listening_mode = other.listening_mode;
        this.question_book_cfg = other.question_book_cfg;
        this.chn_mode = other.chn_mode;
        this.difficulty_updated_at = other.difficulty_updated_at;
        this.roadmap_version = other.roadmap_version;
        this.update_at_of_book_info = other.update_at_of_book_info;
        this.update_at_of_notify_info = other.update_at_of_notify_info;
        this.show_horizontal = other.show_horizontal;
        this.show_night = other.show_night;
        this.collect_words_updated_at = other.collect_words_updated_at;
        this.word_note_updated_at = other.word_note_updated_at;
        this.exam_flag = other.exam_flag;
        this.cur_book_has_primary_school_mode = other.cur_book_has_primary_school_mode;
        this.first_day_test_group = other.first_day_test_group;
        this.word_note_enable = other.word_note_enable;
        if (other.isSetWiki_component_cfg()) {
            ArrayList arrayList = new ArrayList(other.wiki_component_cfg.size());
            Iterator<WikiComponent> it = other.wiki_component_cfg.iterator();
            while (it.hasNext()) {
                arrayList.add(new WikiComponent(it.next()));
            }
            this.wiki_component_cfg = arrayList;
        }
        this.middle_school_test_code = other.middle_school_test_code;
        this.new_wiki = other.new_wiki;
        this.chn_style = other.chn_style;
        this.show_device = other.show_device;
        if (other.isSetDual_mode()) {
            this.dual_mode = new DualMode(other.dual_mode);
        }
        this.rhyme_mode = other.rhyme_mode;
        if (other.isSetPangolin_ad()) {
            this.pangolin_ad = new PangolinAD(other.pangolin_ad);
        }
    }
}
